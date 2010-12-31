package com.smartgwt.sample.showcase.client;

import com.smartgwt.client.types.ContentsType;
import com.smartgwt.client.types.Side;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.HTMLPane;
import com.smartgwt.client.widgets.IButton;
import com.smartgwt.client.widgets.Window;
import com.smartgwt.client.widgets.events.ClickEvent;
import com.smartgwt.client.widgets.events.ClickHandler;
import com.smartgwt.client.widgets.layout.HLayout;
import com.smartgwt.client.widgets.layout.Layout;
import com.smartgwt.client.widgets.layout.LayoutSpacer;
import com.smartgwt.client.widgets.layout.VLayout;
import com.smartgwt.client.widgets.tab.Tab;
import com.smartgwt.client.widgets.tab.TabSet;

public abstract class ShowcasePanel extends VLayout {

    public ShowcasePanel() {

        setWidth100();
        setHeight100();

        final String sourceURL = (getSourceUrl() == null) ? getSourceGenUrl() : getSourceUrl();
        if (sourceURL != null) {

            HLayout topBar = new HLayout();
            topBar.setHeight(30);
            topBar.setWidth100();

            LayoutSpacer spacer = new LayoutSpacer();
            spacer.setWidth100();
            topBar.addMember(spacer);

            IButton sourceButton = new IButton();
            sourceButton.setHeight(25);
            sourceButton.setWidth(110);
            sourceButton.setTitle("View Source");
            sourceButton.setIcon("silk/script_go.png");
            sourceButton.addClickHandler(new ClickHandler() {
                public void onClick(ClickEvent event) {
                    showSource(sourceURL, 640, 600);
                }
            });
            topBar.addMember(sourceButton);

            spacer = new LayoutSpacer();
            spacer.setWidth(10);
            topBar.addMember(spacer);

            addMember(topBar);
        }

        boolean topIntro = isTopIntro();
        Layout layout = topIntro ? new VLayout() : new HLayout();

        layout.setWidth100();
        layout.setMargin(10);
        layout.setMembersMargin(10);

        Canvas panel = getViewPanel();
        HLayout wrapper = new HLayout();
        wrapper.setWidth100();
        wrapper.addMember(panel);

        String intro = getIntro();
        if (intro != null) {
            Window introWindow = new Window();
            introWindow.setTitle("Overview");
            introWindow.setHeaderIcon("pieces/16/cube_green.png", 16, 16);
            introWindow.setShowEdges(true);
            introWindow.setKeepInParentRect(true);

            String introContents = "<p class='intro-para'>" + intro + "</p>";
            Canvas contents = new Canvas();
            contents.setCanSelectText(true);
            contents.setPadding(10);
            contents.setContents(introContents);
            if (topIntro) {
                contents.setWidth100();
            } else {
                contents.setDefaultWidth(200);
            }

            introWindow.setAutoSize(true);
            introWindow.setAutoHeight();
            introWindow.addItem(contents);

            if (topIntro) {
                layout.addMember(introWindow);
                layout.addMember(wrapper);
            } else {
                layout.addMember(wrapper);
                layout.addMember(introWindow);
            }
        } else {
            addMember(wrapper);
        }

        addMember(layout);
    }

    protected boolean isTopIntro() {
        return false;
    }

    public String getSourceUrl() {
        return null;
    }

    public String getSourceGenUrl() {
        String className = getClass().getName();
        String htmlPath = className.replace("com.smartgwt.sample.showcase.client.", "").replace(".", "/") + ".java.html";
        return "sourcegen/" + htmlPath;
    }

    public String getHtmlUrl() {
        return null;
    }

    public String getXmlDataUrl() {
        return null;
    }

    public String getJsonDataUrl() {
        return null;
    }

    public String getCssUrl() {
        return null;
    }

    public String getIntro() {
        return null;
    }

    public abstract Canvas getViewPanel();

    private void showSource(String sourceURL, int width, int height) {

        final Window win = new Window();
        win.setTitle("Source");
        win.setHeaderIcon("pieces/16/cube_green.png", 16, 16);
        win.setKeepInParentRect(true);

        int userWidth = com.google.gwt.user.client.Window.getClientWidth() - 20;
        win.setWidth(userWidth < width ? userWidth : width);

        int userHeight = com.google.gwt.user.client.Window.getClientHeight() - 96;
        win.setHeight(userHeight < height ? userHeight : height);

        int windowTop = 40;
        int windowLeft = com.google.gwt.user.client.Window.getClientWidth() - (win.getWidth() + 20) - getPageLeft();
        win.setLeft(windowLeft);
        win.setTop(windowTop);
        win.setCanDragReposition(true);
        win.setCanDragResize(true);
        win.setMembersMargin(5);

        final TabSet tabs = new TabSet();
        tabs.setTabBarPosition(Side.TOP);
        tabs.setWidth100();
        tabs.setHeight100();

        tabs.addTab(buildSourceTab("Source", "silk/script_go.png", sourceURL));
        int lastPeriodIndex = getClass().getName().lastIndexOf('.');
        String simpleClassName = getClass().getName().substring(lastPeriodIndex + 1);
        String[] dataURLs = DataURLRecords.getDataURLs(simpleClassName);
        if (dataURLs != null) {
            for (String dataURL : dataURLs) {
                String url = "sourcegen/" + dataURL + ".html";
                int lastSlashIndex = dataURL.lastIndexOf('/');
                String tabTitle;
                tabTitle = lastSlashIndex >= 0 ? dataURL.substring(lastSlashIndex + 1) : dataURL;
                tabs.addTab(buildSourceTab(tabTitle, "silk/script_go.png", url));
            }
        }

        if (getCssUrl() != null)
            tabs.addTab(buildSourceTab("CSS", "silk/css.png", getCssUrl()));

        if (getJsonDataUrl() != null)
            tabs.addTab(buildSourceTab("JSON", "silk/database_table.png", getJsonDataUrl()));

        if (getXmlDataUrl() != null)
            tabs.addTab(buildSourceTab("XML", "silk/database_table.png", getXmlDataUrl()));

        win.addItem(tabs);
        addChild(win);
        win.show();
    }

    public Tab buildSourceTab(String title, String icon, String url) {

        HTMLPane tabPane = new HTMLPane();
        tabPane.setWidth100();
        tabPane.setHeight100();
        tabPane.setContentsURL(url);
        tabPane.setContentsType(ContentsType.PAGE);

        Tab tab = new Tab(title, icon);
        tab.setPane(tabPane);
        return tab;
    }

}