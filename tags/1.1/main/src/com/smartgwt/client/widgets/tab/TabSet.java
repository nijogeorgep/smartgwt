/*
 * SmartGWT (GWT for SmartClient)
 * Copyright 2008 and beyond, Isomorphic Software, Inc.
 *
 * SmartGWT is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version 3
 * as published by the Free Software Foundation.  SmartGWT is also
 * available under typical commercial license terms - see
 * http://smartclient.com/license
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */
 
package com.smartgwt.client.widgets.tab;



import com.smartgwt.client.event.*;
import com.smartgwt.client.core.*;
import com.smartgwt.client.types.*;
import com.smartgwt.client.data.*;
import com.smartgwt.client.data.events.*;
import com.smartgwt.client.rpc.*;
import com.smartgwt.client.widgets.*;
import com.smartgwt.client.widgets.events.*;
import com.smartgwt.client.widgets.form.*;
import com.smartgwt.client.widgets.form.validator.*;
import com.smartgwt.client.widgets.form.fields.*;
import com.smartgwt.client.widgets.tile.*;
import com.smartgwt.client.widgets.tile.events.*;
import com.smartgwt.client.widgets.grid.*;
import com.smartgwt.client.widgets.grid.events.*;
import com.smartgwt.client.widgets.layout.*;
import com.smartgwt.client.widgets.menu.*;
import com.smartgwt.client.widgets.tab.*;
import com.smartgwt.client.widgets.toolbar.*;
import com.smartgwt.client.widgets.tree.*;
import com.smartgwt.client.widgets.tree.events.*;
import com.smartgwt.client.widgets.viewer.*;
import com.smartgwt.client.widgets.calendar.*;
import com.smartgwt.client.widgets.calendar.events.*;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;
import com.smartgwt.client.util.JSOHelper;
import com.smartgwt.client.util.EnumUtil;
import com.google.gwt.event.shared.*;
import com.google.gwt.event.shared.HasHandlers;
   /**
    * The TabSet class allows components on several panes to share the same space. The tabs at &#010 the top can be selected by the user to show each pane. &#010 <P>&#010 Tabs are configured via the <code>tabs</code> property, each of which has a&#010 <code>pane</code> property which will be displayed in the main pane when that tab is&#010 selected.

    */



public class TabSet extends Canvas  implements com.smartgwt.client.widgets.tab.events.HasCloseClickHandlers, com.smartgwt.client.widgets.tab.events.HasTabIconClickHandlers, com.smartgwt.client.widgets.tab.events.HasTabSelectedHandlers, com.smartgwt.client.widgets.tab.events.HasTabDeselectedHandlers {

    public static TabSet getOrCreateRef(JavaScriptObject jsObj) {
        if(jsObj == null) return null;
        BaseWidget obj = BaseWidget.getRef(jsObj);
        if(obj != null) {
            return (TabSet) obj;
        } else {
            return new TabSet(jsObj);
        }
    }


    public TabSet(){
        
    }

    public TabSet(JavaScriptObject jsObj){
        super(jsObj);
    }

    protected native JavaScriptObject create()/*-{
        var config = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
        var widget = $wnd.isc.TabSet.create(config);
        this.@com.smartgwt.client.widgets.BaseWidget::doInit()();
        return widget;
    }-*/;
    // ********************* Properties / Attributes ***********************
             
    /**
    * Which side of the TabSet the TabBar should appear on.
    *
    * @param tabBarPosition tabBarPosition Default value is Canvas.TOP
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setTabBarPosition(Side tabBarPosition)  throws IllegalStateException {
        setAttribute("tabBarPosition", tabBarPosition.getValue(), false);
    }
    /**
     * Which side of the TabSet the TabBar should appear on.
     *
     *
     * @return Side
     *
     */
    public Side getTabBarPosition()  {
        return (Side) EnumUtil.getEnum(Side.values(), getAttribute("tabBarPosition"));
    }
             
    /**
    * Alignment of the tabBar.&#010 <P>&#010 If the position of the tabBar is "top" or "bottom", then alignment must be "left" or&#010 "right" and defaults to "left".&#010 <P>&#010 If the position of the tabBar is "left" or "right", then the alignment must be "top" or&#010 "bottom" and defaults to "top".
    *
    * @param tabBarAlign tabBarAlign Default value is see below
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setTabBarAlign(Side tabBarAlign)  throws IllegalStateException {
        setAttribute("tabBarAlign", tabBarAlign.getValue(), false);
    }
    /**
     * Alignment of the tabBar.&#010 <P>&#010 If the position of the tabBar is "top" or "bottom", then alignment must be "left" or&#010 "right" and defaults to "left".&#010 <P>&#010 If the position of the tabBar is "left" or "right", then the alignment must be "top" or&#010 "bottom" and defaults to "top".
     *
     *
     * @return Side
     *
     */
    public Side getTabBarAlign()  {
        return (Side) EnumUtil.getEnum(Side.values(), getAttribute("tabBarAlign"));
    }

    /**
    * Thickness of tabBar, applies to either orientation (specifies height for horizontal,&#010 width for vertical orientation).  Note that overriding this value for TabSets that are&#010 skinned with images generally means providing new media for the borders.
    *
    * @param tabBarThickness tabBarThickness Default value is 21
    */
    public void setTabBarThickness(int tabBarThickness) {
        setAttribute("tabBarThickness", tabBarThickness, true);
    }
    /**
     * Thickness of tabBar, applies to either orientation (specifies height for horizontal,&#010 width for vertical orientation).  Note that overriding this value for TabSets that are&#010 skinned with images generally means providing new media for the borders.
     *
     *
     * @return int
     *
     */
    public int getTabBarThickness()  {
        return getAttributeAsInt("tabBarThickness");
    }

    /**
    * Should tabs in this tabSet show an icon allowing the user to dismiss the tab by&#010 clicking on it directly. May be overridden for individual tabs by setting &#010 {@link com.smartgwt.client.widgets.tab.Tab#getCanClose canClose}.<br>&#010 The URL for this icon's image will be derived from  {@link com.smartgwt.client.widgets.tab.TabSet#getCloseTabIcon closeTabIcon} by &#010 default, but may be overridden by explicitly specifying {@link com.smartgwt.client.widgets.tab.Tab#getCloseIcon closeIcon}.
    *
    * @param canCloseTabs canCloseTabs Default value is null
    */
    public void setCanCloseTabs(Boolean canCloseTabs) {
        setAttribute("canCloseTabs", canCloseTabs, true);
    }
    /**
     * Should tabs in this tabSet show an icon allowing the user to dismiss the tab by&#010 clicking on it directly. May be overridden for individual tabs by setting &#010 {@link com.smartgwt.client.widgets.tab.Tab#getCanClose canClose}.<br>&#010 The URL for this icon's image will be derived from  {@link com.smartgwt.client.widgets.tab.TabSet#getCloseTabIcon closeTabIcon} by &#010 default, but may be overridden by explicitly specifying {@link com.smartgwt.client.widgets.tab.Tab#getCloseIcon closeIcon}.
     *
     *
     * @return Boolean
     *
     */
    public Boolean getCanCloseTabs()  {
        return getAttributeAsBoolean("canCloseTabs");
    }

    /**
    * Default src for the close icon for tabs to display if {@link com.smartgwt.client.widgets.tab.TabSet#getCanCloseTabs canCloseTabs} is true.
    *
    * @param closeTabIcon closeTabIcon Default value is [SKIN]/TabSet/close.png
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setCloseTabIcon(String closeTabIcon)  throws IllegalStateException {
        setAttribute("closeTabIcon", closeTabIcon, false);
    }
    /**
     * Default src for the close icon for tabs to display if {@link com.smartgwt.client.widgets.tab.TabSet#getCanCloseTabs canCloseTabs} is true.
     *
     *
     * @return String
     *
     */
    public String getCloseTabIcon()  {
        return getAttributeAsString("closeTabIcon");
    }

    /**
    * Size in pixels of the icon for closing tabs, displayed when {@link com.smartgwt.client.widgets.tab.TabSet#getCanCloseTabs canCloseTabs} is true.
    *
    * @param closeTabIconSize closeTabIconSize Default value is 16
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setCloseTabIconSize(int closeTabIconSize)  throws IllegalStateException {
        setAttribute("closeTabIconSize", closeTabIconSize, false);
    }
    /**
     * Size in pixels of the icon for closing tabs, displayed when {@link com.smartgwt.client.widgets.tab.TabSet#getCanCloseTabs canCloseTabs} is true.
     *
     *
     * @return int
     *
     */
    public int getCloseTabIconSize()  {
        return getAttributeAsInt("closeTabIconSize");
    }

    /**
    * If there is not enough space to display all the tab-buttons in this tabSet, should &#010 scroller buttons be displayed to allow access to tabs that are clipped?
    *
    * @param showTabScroller showTabScroller Default value is true
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setShowTabScroller(Boolean showTabScroller)  throws IllegalStateException {
        setAttribute("showTabScroller", showTabScroller, false);
    }
    /**
     * If there is not enough space to display all the tab-buttons in this tabSet, should &#010 scroller buttons be displayed to allow access to tabs that are clipped?
     *
     *
     * @return Boolean
     *
     */
    public Boolean getShowTabScroller()  {
        return getAttributeAsBoolean("showTabScroller");
    }

    /**
    * If there is not enough space to display all the tab-buttons in this tabSet, should&#010 a drop-down "picker" be displayed to allow selection of tabs that are clipped?
    *
    * @param showTabPicker showTabPicker Default value is true
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setShowTabPicker(Boolean showTabPicker)  throws IllegalStateException {
        setAttribute("showTabPicker", showTabPicker, false);
    }
    /**
     * If there is not enough space to display all the tab-buttons in this tabSet, should&#010 a drop-down "picker" be displayed to allow selection of tabs that are clipped?
     *
     *
     * @return Boolean
     *
     */
    public Boolean getShowTabPicker()  {
        return getAttributeAsBoolean("showTabPicker");
    }

    /**
    * If {@link com.smartgwt.client.widgets.tab.TabSet#getShowTabScroller showTabScroller} is true, should tabs be scrolled into view via an &#010 animation when the user interacts with the scroller buttons?
    *
    * @param animateTabScrolling animateTabScrolling Default value is true
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setAnimateTabScrolling(Boolean animateTabScrolling)  throws IllegalStateException {
        setAttribute("animateTabScrolling", animateTabScrolling, false);
    }
    /**
     * If {@link com.smartgwt.client.widgets.tab.TabSet#getShowTabScroller showTabScroller} is true, should tabs be scrolled into view via an &#010 animation when the user interacts with the scroller buttons?
     *
     *
     * @return Boolean
     *
     */
    public Boolean getAnimateTabScrolling()  {
        return getAttributeAsBoolean("animateTabScrolling");
    }

    /**
    * If {@link com.smartgwt.client.widgets.tab.TabSet#getShowTabScroller showTabScroller} is true, this property governs the size of scroller&#010 buttons. Applied as the width of buttons if the tabBar is horizontal, or the height&#010 if tabBar is vertical. Note that the other dimension is determined by &#010 {@link com.smartgwt.client.widgets.tab.TabSet#getTabBarThickness tabBarThickness}
    *
    * @param scrollerButtonSize scrollerButtonSize Default value is 16
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setScrollerButtonSize(int scrollerButtonSize)  throws IllegalStateException {
        setAttribute("scrollerButtonSize", scrollerButtonSize, false);
    }
    /**
     * If {@link com.smartgwt.client.widgets.tab.TabSet#getShowTabScroller showTabScroller} is true, this property governs the size of scroller&#010 buttons. Applied as the width of buttons if the tabBar is horizontal, or the height&#010 if tabBar is vertical. Note that the other dimension is determined by &#010 {@link com.smartgwt.client.widgets.tab.TabSet#getTabBarThickness tabBarThickness}
     *
     *
     * @return int
     *
     */
    public int getScrollerButtonSize()  {
        return getAttributeAsInt("scrollerButtonSize");
    }

    /**
    * If {@link com.smartgwt.client.widgets.tab.TabSet#getShowTabPicker showTabPicker} is true, this property governs the size of tab-picker&#010 button. Applied as the width of buttons if the tabBar is horizontal, or the height&#010 if tabBar is vertical. Note that the other dimension is determined by&#010 {@link com.smartgwt.client.widgets.tab.TabSet#getTabBarThickness tabBarThickness}
    *
    * @param pickerButtonSize pickerButtonSize Default value is 16
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setPickerButtonSize(int pickerButtonSize)  throws IllegalStateException {
        setAttribute("pickerButtonSize", pickerButtonSize, false);
    }
    /**
     * If {@link com.smartgwt.client.widgets.tab.TabSet#getShowTabPicker showTabPicker} is true, this property governs the size of tab-picker&#010 button. Applied as the width of buttons if the tabBar is horizontal, or the height&#010 if tabBar is vertical. Note that the other dimension is determined by&#010 {@link com.smartgwt.client.widgets.tab.TabSet#getTabBarThickness tabBarThickness}
     *
     *
     * @return int
     *
     */
    public int getPickerButtonSize()  {
        return getAttributeAsInt("pickerButtonSize");
    }

    /**
    * Default directory for skin images (those defined by the class), relative to the&#010 Page-wide {@link com.smartgwt.client.util.Page#getSkinDir}.
    *
    * @param skinImgDir skinImgDir Default value is "images/TabSet/"
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setSkinImgDir(String skinImgDir)  throws IllegalStateException {
        setAttribute("skinImgDir", skinImgDir, false);
    }
    /**
     * Default directory for skin images (those defined by the class), relative to the&#010 Page-wide {@link com.smartgwt.client.util.Page#getSkinDir}.
     *
     *
     * @return String
     *
     */
    public String getSkinImgDir()  {
        return getAttributeAsString("skinImgDir");
    }

    /**
    * If this TabSet is showing {@link com.smartgwt.client.widgets.tab.TabSet#getShowTabScroller showTabScroller}, this property &#010 determines whether the {@link com.smartgwt.client.widgets.tab.TabSet#getScrollerHSrc scrollerHSrc} and {@link com.smartgwt.client.widgets.tab.TabSet#getScrollerVSrc scrollerVSrc} media&#010 will be used for vertical and horizontal tab-bar scroller buttons, or whether separate&#010 media should be used for each possible {@link com.smartgwt.client.widgets.tab.TabSet#getTabBarPosition tabBarPosition} based&#010 on the {@link com.smartgwt.client.widgets.tab.TabSet#getScrollerSrc scrollerSrc} property for this tabSet.
    *
    * @param symmetricScroller symmetricScroller Default value is true
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setSymmetricScroller(Boolean symmetricScroller)  throws IllegalStateException {
        setAttribute("symmetricScroller", symmetricScroller, false);
    }
    /**
     * If this TabSet is showing {@link com.smartgwt.client.widgets.tab.TabSet#getShowTabScroller showTabScroller}, this property &#010 determines whether the {@link com.smartgwt.client.widgets.tab.TabSet#getScrollerHSrc scrollerHSrc} and {@link com.smartgwt.client.widgets.tab.TabSet#getScrollerVSrc scrollerVSrc} media&#010 will be used for vertical and horizontal tab-bar scroller buttons, or whether separate&#010 media should be used for each possible {@link com.smartgwt.client.widgets.tab.TabSet#getTabBarPosition tabBarPosition} based&#010 on the {@link com.smartgwt.client.widgets.tab.TabSet#getScrollerSrc scrollerSrc} property for this tabSet.
     *
     *
     * @return Boolean
     *
     */
    public Boolean getSymmetricScroller()  {
        return getAttributeAsBoolean("symmetricScroller");
    }

    /**
    * If this TabSet is showing {@link com.smartgwt.client.widgets.tab.TabSet#getShowTabScroller showTabScroller}, and &#010 {@link com.smartgwt.client.widgets.tab.TabSet#getSymmetricScroller symmetricScroller} is false, this property governs the base&#010 URL for the tab bar back and forward scroller button images.&#010 <P>&#010 Note that if {@link com.smartgwt.client.widgets.tab.TabSet#getSymmetricScroller symmetricScroller} is true, &#010 {@link com.smartgwt.client.widgets.tab.TabSet#getScrollerHSrc scrollerHSrc} and {@link com.smartgwt.client.widgets.tab.TabSet#getScrollerVSrc scrollerVSrc} will be used instead.&#010 <P>&#010 To get the path to the image to display, this base URL will be modified as follows:&#010 <ul>&#010 <li>If appropriate a state suffix of <code>"Down"</code> or <code>"Disabled"</code> will be&#010     appended.</li>&#010 <li>The {@link com.smartgwt.client.widgets.tab.TabSet#getTabBarPosition tabBarPosition} for this tabSet will be appended.</li>&#010 <li>A suffix of <code>"forward"</code> or <code>"back"</code> will be appended for the&#010     forward or backward scrolling button.</li>&#010 </ul>&#010 For example - if the scrollerSrc is set to <code>"[SKIN]scroll.gif"</code>, the image&#010 displayed for the back-scroller button on a tabSet with <code>tabBarPosition</code> set to&#010 "top" and <code>symmetricScroller</code> set to false would be one of &#010 <code>"[SKIN]scroll_top_back.gif"</code>, <code>"[SKIN]scroll_Down_top_back.gif"</code>,&#010 and <code>"[SKIN]scroll_Disabled_top_back.gif"</code>.&#010 <P>&#010 Note that for best results the media should be sized to match the scroller button sizes, &#010 determined by {@link com.smartgwt.client.widgets.tab.TabSet#getTabBarThickness tabBarThickness} and {@link com.smartgwt.client.widgets.tab.TabSet#getScrollerButtonSize scrollerButtonSize}.
    *
    * @param scrollerSrc scrollerSrc Default value is "[SKIN]/scroll.gif"
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setScrollerSrc(String scrollerSrc)  throws IllegalStateException {
        setAttribute("scrollerSrc", scrollerSrc, false);
    }
    /**
     * If this TabSet is showing {@link com.smartgwt.client.widgets.tab.TabSet#getShowTabScroller showTabScroller}, and &#010 {@link com.smartgwt.client.widgets.tab.TabSet#getSymmetricScroller symmetricScroller} is false, this property governs the base&#010 URL for the tab bar back and forward scroller button images.&#010 <P>&#010 Note that if {@link com.smartgwt.client.widgets.tab.TabSet#getSymmetricScroller symmetricScroller} is true, &#010 {@link com.smartgwt.client.widgets.tab.TabSet#getScrollerHSrc scrollerHSrc} and {@link com.smartgwt.client.widgets.tab.TabSet#getScrollerVSrc scrollerVSrc} will be used instead.&#010 <P>&#010 To get the path to the image to display, this base URL will be modified as follows:&#010 <ul>&#010 <li>If appropriate a state suffix of <code>"Down"</code> or <code>"Disabled"</code> will be&#010     appended.</li>&#010 <li>The {@link com.smartgwt.client.widgets.tab.TabSet#getTabBarPosition tabBarPosition} for this tabSet will be appended.</li>&#010 <li>A suffix of <code>"forward"</code> or <code>"back"</code> will be appended for the&#010     forward or backward scrolling button.</li>&#010 </ul>&#010 For example - if the scrollerSrc is set to <code>"[SKIN]scroll.gif"</code>, the image&#010 displayed for the back-scroller button on a tabSet with <code>tabBarPosition</code> set to&#010 "top" and <code>symmetricScroller</code> set to false would be one of &#010 <code>"[SKIN]scroll_top_back.gif"</code>, <code>"[SKIN]scroll_Down_top_back.gif"</code>,&#010 and <code>"[SKIN]scroll_Disabled_top_back.gif"</code>.&#010 <P>&#010 Note that for best results the media should be sized to match the scroller button sizes, &#010 determined by {@link com.smartgwt.client.widgets.tab.TabSet#getTabBarThickness tabBarThickness} and {@link com.smartgwt.client.widgets.tab.TabSet#getScrollerButtonSize scrollerButtonSize}.
     *
     *
     * @return String
     *
     */
    public String getScrollerSrc()  {
        return getAttributeAsString("scrollerSrc");
    }

    /**
    * If this TabSet is showing {@link com.smartgwt.client.widgets.tab.TabSet#getShowTabScroller showTabScroller}, and &#010 {@link com.smartgwt.client.widgets.tab.TabSet#getSymmetricScroller symmetricScroller} is true, this property governs the base&#010 URL for the tab bar back and forward scroller button images for horizontal tab bars [IE for&#010 tab sets with {@link com.smartgwt.client.widgets.tab.TabSet#getTabBarPosition tabBarPosition} set to "top" or "bottom"].&#010 <P>&#010 Note that if {@link com.smartgwt.client.widgets.tab.TabSet#getSymmetricScroller symmetricScroller} is false, &#010 {@link com.smartgwt.client.widgets.tab.TabSet#getScrollerSrc scrollerSrc} will be used instead.&#010 <P>&#010 To get the path to the image to display, this base URL will be modified as follows:&#010 <ul>&#010 <li>If appropriate a state suffix of <code>"Down"</code> or <code>"Disabled"</code> will be&#010     appended.</li>&#010 <li>A suffix of <code>"forward"</code> or <code>"back"</code> will be appended for the&#010     forward or backward scrolling button.</li>&#010 </ul>&#010 For example - if the scrollerHSrc is set to <code>"[SKIN]hscroll.gif"</code>, the image&#010 displayed for the back-scroller button on a tabSet with <code>tabBarPosition</code> set to&#010 "top" and <code>symmetricScroller</code> set to true would be one of &#010 <code>"[SKIN]hscroll_back.gif"</code>, <code>"[SKIN]hscroll_Down_back.gif"</code>,&#010 and <code>"[SKIN]hscroll_Disabled_back.gif"</code>.&#010 <P>&#010 Note that for best results the media should be sized to match the scroller button sizes, &#010 determined by {@link com.smartgwt.client.widgets.tab.TabSet#getTabBarThickness tabBarThickness} and {@link com.smartgwt.client.widgets.tab.TabSet#getScrollerButtonSize scrollerButtonSize}.
    *
    * @param scrollerHSrc scrollerHSrc Default value is "[SKIN]hscroll.gif"
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setScrollerHSrc(String scrollerHSrc)  throws IllegalStateException {
        setAttribute("scrollerHSrc", scrollerHSrc, false);
    }
    /**
     * If this TabSet is showing {@link com.smartgwt.client.widgets.tab.TabSet#getShowTabScroller showTabScroller}, and &#010 {@link com.smartgwt.client.widgets.tab.TabSet#getSymmetricScroller symmetricScroller} is true, this property governs the base&#010 URL for the tab bar back and forward scroller button images for horizontal tab bars [IE for&#010 tab sets with {@link com.smartgwt.client.widgets.tab.TabSet#getTabBarPosition tabBarPosition} set to "top" or "bottom"].&#010 <P>&#010 Note that if {@link com.smartgwt.client.widgets.tab.TabSet#getSymmetricScroller symmetricScroller} is false, &#010 {@link com.smartgwt.client.widgets.tab.TabSet#getScrollerSrc scrollerSrc} will be used instead.&#010 <P>&#010 To get the path to the image to display, this base URL will be modified as follows:&#010 <ul>&#010 <li>If appropriate a state suffix of <code>"Down"</code> or <code>"Disabled"</code> will be&#010     appended.</li>&#010 <li>A suffix of <code>"forward"</code> or <code>"back"</code> will be appended for the&#010     forward or backward scrolling button.</li>&#010 </ul>&#010 For example - if the scrollerHSrc is set to <code>"[SKIN]hscroll.gif"</code>, the image&#010 displayed for the back-scroller button on a tabSet with <code>tabBarPosition</code> set to&#010 "top" and <code>symmetricScroller</code> set to true would be one of &#010 <code>"[SKIN]hscroll_back.gif"</code>, <code>"[SKIN]hscroll_Down_back.gif"</code>,&#010 and <code>"[SKIN]hscroll_Disabled_back.gif"</code>.&#010 <P>&#010 Note that for best results the media should be sized to match the scroller button sizes, &#010 determined by {@link com.smartgwt.client.widgets.tab.TabSet#getTabBarThickness tabBarThickness} and {@link com.smartgwt.client.widgets.tab.TabSet#getScrollerButtonSize scrollerButtonSize}.
     *
     *
     * @return String
     *
     */
    public String getScrollerHSrc()  {
        return getAttributeAsString("scrollerHSrc");
    }

    /**
    * If this TabSet is showing {@link com.smartgwt.client.widgets.tab.TabSet#getShowTabScroller showTabScroller}, and &#010 {@link com.smartgwt.client.widgets.tab.TabSet#getSymmetricScroller symmetricScroller} is true, this property governs the base&#010 URL for the tab bar back and forward scroller button images for vertical tab bars [IE for&#010 tab sets with {@link com.smartgwt.client.widgets.tab.TabSet#getTabBarPosition tabBarPosition} set to "left" or "right"].&#010 <P>&#010 Note that if {@link com.smartgwt.client.widgets.tab.TabSet#getSymmetricScroller symmetricScroller} is false, &#010 {@link com.smartgwt.client.widgets.tab.TabSet#getScrollerSrc scrollerSrc} will be used instead.&#010 <P>&#010 To get the path to the image to display, this base URL will be modified as follows:&#010 <ul>&#010 <li>If appropriate a state suffix of <code>"Down"</code> or <code>"Disabled"</code> will be&#010     appended.</li>&#010 <li>A suffix of <code>"forward"</code> or <code>"back"</code> will be appended for the&#010     forward or backward scrolling button.</li>&#010 </ul>&#010 For example - if the scrollerVSrc is set to <code>"[SKIN]vscroll.gif"</code>, the image&#010 displayed for the back-scroller button on a tabSet with <code>tabBarPosition</code> set to&#010 "left" and <code>symmetricScroller</code> set to true would be one of &#010 <code>"[SKIN]vscroll_back.gif"</code>, <code>"[SKIN]vscroll_Down_back.gif"</code>,&#010 and <code>"[SKIN]vscroll_Disabled_back.gif"</code>.&#010 <P>&#010 Note that for best results the media should be sized to match the scroller button sizes, &#010 determined by {@link com.smartgwt.client.widgets.tab.TabSet#getTabBarThickness tabBarThickness} and {@link com.smartgwt.client.widgets.tab.TabSet#getScrollerButtonSize scrollerButtonSize}.
    *
    * @param scrollerVSrc scrollerVSrc Default value is "[SKIN]vscroll.gif"
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setScrollerVSrc(String scrollerVSrc)  throws IllegalStateException {
        setAttribute("scrollerVSrc", scrollerVSrc, false);
    }
    /**
     * If this TabSet is showing {@link com.smartgwt.client.widgets.tab.TabSet#getShowTabScroller showTabScroller}, and &#010 {@link com.smartgwt.client.widgets.tab.TabSet#getSymmetricScroller symmetricScroller} is true, this property governs the base&#010 URL for the tab bar back and forward scroller button images for vertical tab bars [IE for&#010 tab sets with {@link com.smartgwt.client.widgets.tab.TabSet#getTabBarPosition tabBarPosition} set to "left" or "right"].&#010 <P>&#010 Note that if {@link com.smartgwt.client.widgets.tab.TabSet#getSymmetricScroller symmetricScroller} is false, &#010 {@link com.smartgwt.client.widgets.tab.TabSet#getScrollerSrc scrollerSrc} will be used instead.&#010 <P>&#010 To get the path to the image to display, this base URL will be modified as follows:&#010 <ul>&#010 <li>If appropriate a state suffix of <code>"Down"</code> or <code>"Disabled"</code> will be&#010     appended.</li>&#010 <li>A suffix of <code>"forward"</code> or <code>"back"</code> will be appended for the&#010     forward or backward scrolling button.</li>&#010 </ul>&#010 For example - if the scrollerVSrc is set to <code>"[SKIN]vscroll.gif"</code>, the image&#010 displayed for the back-scroller button on a tabSet with <code>tabBarPosition</code> set to&#010 "left" and <code>symmetricScroller</code> set to true would be one of &#010 <code>"[SKIN]vscroll_back.gif"</code>, <code>"[SKIN]vscroll_Down_back.gif"</code>,&#010 and <code>"[SKIN]vscroll_Disabled_back.gif"</code>.&#010 <P>&#010 Note that for best results the media should be sized to match the scroller button sizes, &#010 determined by {@link com.smartgwt.client.widgets.tab.TabSet#getTabBarThickness tabBarThickness} and {@link com.smartgwt.client.widgets.tab.TabSet#getScrollerButtonSize scrollerButtonSize}.
     *
     *
     * @return String
     *
     */
    public String getScrollerVSrc()  {
        return getAttributeAsString("scrollerVSrc");
    }

    /**
    * If this TabSet is showing a {@link com.smartgwt.client.widgets.tab.TabSet#getShowTabPicker showTabPicker}, this&#010 property determines whether the {@link com.smartgwt.client.widgets.tab.TabSet#getPickerButtonHSrc pickerButtonHSrc} and&#010 {@link com.smartgwt.client.widgets.tab.TabSet#getPickerButtonVSrc pickerButtonVSrc} media will be used for vertical and horizontal tab-bar&#010 picker buttons, or whether separate media should be used for each possible &#010 {@link com.smartgwt.client.widgets.tab.TabSet#getTabBarPosition tabBarPosition} based on the {@link com.smartgwt.client.widgets.tab.TabSet#getPickerButtonSrc pickerButtonSrc}&#010 property  for this tabSet.
    *
    * @param symmetricPickerButton symmetricPickerButton Default value is true
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setSymmetricPickerButton(Boolean symmetricPickerButton)  throws IllegalStateException {
        setAttribute("symmetricPickerButton", symmetricPickerButton, false);
    }
    /**
     * If this TabSet is showing a {@link com.smartgwt.client.widgets.tab.TabSet#getShowTabPicker showTabPicker}, this&#010 property determines whether the {@link com.smartgwt.client.widgets.tab.TabSet#getPickerButtonHSrc pickerButtonHSrc} and&#010 {@link com.smartgwt.client.widgets.tab.TabSet#getPickerButtonVSrc pickerButtonVSrc} media will be used for vertical and horizontal tab-bar&#010 picker buttons, or whether separate media should be used for each possible &#010 {@link com.smartgwt.client.widgets.tab.TabSet#getTabBarPosition tabBarPosition} based on the {@link com.smartgwt.client.widgets.tab.TabSet#getPickerButtonSrc pickerButtonSrc}&#010 property  for this tabSet.
     *
     *
     * @return Boolean
     *
     */
    public Boolean getSymmetricPickerButton()  {
        return getAttributeAsBoolean("symmetricPickerButton");
    }

    /**
    * If {@link com.smartgwt.client.widgets.tab.TabSet#getShowTabPicker showTabPicker} is true, this property governs the base URL for the picker&#010 button image, when {@link com.smartgwt.client.widgets.tab.TabSet#getSymmetricPickerButton symmetricPickerButton} is set to false&#010 <P>&#010 Note that if <code>symmetricPickerButton</code> is true, the {@link com.smartgwt.client.widgets.tab.TabSet#getPickerButtonHSrc pickerButtonHSrc} &#010 and {@link com.smartgwt.client.widgets.tab.TabSet#getPickerButtonVSrc pickerButtonVSrc} properties will be used instead.&#010 <P>&#010 To get the path to the image to display, this base URL will be modified as follows:&#010 <ul>&#010 <li>If appropriate a state suffix of <code>"Down"</code> or <code>"Disabled"</code> will be&#010     appended.</li>&#010 <li>The {@link com.smartgwt.client.widgets.tab.TabSet#getTabBarPosition tabBarPosition} for this tabSet will be appended.</li>&#010 </ul>
    *
    * @param pickerButtonSrc pickerButtonSrc Default value is "[SKIN]/picker.gif"
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setPickerButtonSrc(String pickerButtonSrc)  throws IllegalStateException {
        setAttribute("pickerButtonSrc", pickerButtonSrc, false);
    }
    /**
     * If {@link com.smartgwt.client.widgets.tab.TabSet#getShowTabPicker showTabPicker} is true, this property governs the base URL for the picker&#010 button image, when {@link com.smartgwt.client.widgets.tab.TabSet#getSymmetricPickerButton symmetricPickerButton} is set to false&#010 <P>&#010 Note that if <code>symmetricPickerButton</code> is true, the {@link com.smartgwt.client.widgets.tab.TabSet#getPickerButtonHSrc pickerButtonHSrc} &#010 and {@link com.smartgwt.client.widgets.tab.TabSet#getPickerButtonVSrc pickerButtonVSrc} properties will be used instead.&#010 <P>&#010 To get the path to the image to display, this base URL will be modified as follows:&#010 <ul>&#010 <li>If appropriate a state suffix of <code>"Down"</code> or <code>"Disabled"</code> will be&#010     appended.</li>&#010 <li>The {@link com.smartgwt.client.widgets.tab.TabSet#getTabBarPosition tabBarPosition} for this tabSet will be appended.</li>&#010 </ul>
     *
     *
     * @return String
     *
     */
    public String getPickerButtonSrc()  {
        return getAttributeAsString("pickerButtonSrc");
    }

    /**
    * If {@link com.smartgwt.client.widgets.tab.TabSet#getShowTabPicker showTabPicker} is true, and {@link com.smartgwt.client.widgets.tab.TabSet#getSymmetricPickerButton symmetricPickerButton} is &#010 set to true, this property governs the base URL for the picker&#010 button image, when displayed in a horizontal tab-bar [IE {@link com.smartgwt.client.widgets.tab.TabSet#getTabBarPosition tabBarPosition} is&#010 set to <code>"top"</code> or <code>"bottom"</code>].&#010 <P>&#010 Note that if <code>symmetricPickerButton</code> is false, the {@link com.smartgwt.client.widgets.tab.TabSet#getPickerButtonSrc pickerButtonSrc}&#010 property will be used instead.&#010 <P>&#010 This base URL will have a suffix of <code>"Down"</code> appended when the user holds the&#010 mouse down over the button, and <code>"Disabled"</code> if the tabset as a whole is &#010 disabled.
    *
    * @param pickerButtonHSrc pickerButtonHSrc Default value is "[SKIN]hpicker.gif"
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setPickerButtonHSrc(String pickerButtonHSrc)  throws IllegalStateException {
        setAttribute("pickerButtonHSrc", pickerButtonHSrc, false);
    }
    /**
     * If {@link com.smartgwt.client.widgets.tab.TabSet#getShowTabPicker showTabPicker} is true, and {@link com.smartgwt.client.widgets.tab.TabSet#getSymmetricPickerButton symmetricPickerButton} is &#010 set to true, this property governs the base URL for the picker&#010 button image, when displayed in a horizontal tab-bar [IE {@link com.smartgwt.client.widgets.tab.TabSet#getTabBarPosition tabBarPosition} is&#010 set to <code>"top"</code> or <code>"bottom"</code>].&#010 <P>&#010 Note that if <code>symmetricPickerButton</code> is false, the {@link com.smartgwt.client.widgets.tab.TabSet#getPickerButtonSrc pickerButtonSrc}&#010 property will be used instead.&#010 <P>&#010 This base URL will have a suffix of <code>"Down"</code> appended when the user holds the&#010 mouse down over the button, and <code>"Disabled"</code> if the tabset as a whole is &#010 disabled.
     *
     *
     * @return String
     *
     */
    public String getPickerButtonHSrc()  {
        return getAttributeAsString("pickerButtonHSrc");
    }

    /**
    * If {@link com.smartgwt.client.widgets.tab.TabSet#getShowTabPicker showTabPicker} is true, and {@link com.smartgwt.client.widgets.tab.TabSet#getSymmetricPickerButton symmetricPickerButton} is &#010 set to true, this property governs the base URL for the picker&#010 button image, when displayed in a verricaL tab-bar [IE {@link com.smartgwt.client.widgets.tab.TabSet#getTabBarPosition tabBarPosition} is&#010 set to <code>"LEFT"</code> or <code>"right"</code>].&#010 <P>&#010 Note that if <code>symmetricPickerButton</code> is false, the {@link com.smartgwt.client.widgets.tab.TabSet#getPickerButtonSrc pickerButtonSrc}&#010 property will be used instead.&#010 <P>&#010 This base URL will have a suffix of <code>"Down"</code> appended when the user holds the&#010 mouse down over the button, and <code>"Disabled"</code> if the tabset as a whole is &#010 disabled.
    *
    * @param pickerButtonVSrc pickerButtonVSrc Default value is "[SKIN]vpicker.gif"
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setPickerButtonVSrc(String pickerButtonVSrc)  throws IllegalStateException {
        setAttribute("pickerButtonVSrc", pickerButtonVSrc, false);
    }
    /**
     * If {@link com.smartgwt.client.widgets.tab.TabSet#getShowTabPicker showTabPicker} is true, and {@link com.smartgwt.client.widgets.tab.TabSet#getSymmetricPickerButton symmetricPickerButton} is &#010 set to true, this property governs the base URL for the picker&#010 button image, when displayed in a verricaL tab-bar [IE {@link com.smartgwt.client.widgets.tab.TabSet#getTabBarPosition tabBarPosition} is&#010 set to <code>"LEFT"</code> or <code>"right"</code>].&#010 <P>&#010 Note that if <code>symmetricPickerButton</code> is false, the {@link com.smartgwt.client.widgets.tab.TabSet#getPickerButtonSrc pickerButtonSrc}&#010 property will be used instead.&#010 <P>&#010 This base URL will have a suffix of <code>"Down"</code> appended when the user holds the&#010 mouse down over the button, and <code>"Disabled"</code> if the tabset as a whole is &#010 disabled.
     *
     *
     * @return String
     *
     */
    public String getPickerButtonVSrc()  {
        return getAttributeAsString("pickerButtonVSrc");
    }
             
    /**
    * Specifies the overflow of the pane container (the component that holds the pane contents&#010 for all tabs).  By default this is set to "auto", meaning the pane container will&#010 automatically introduce scrolling when the pane contents exceed the TabSet's specified&#010 size.&#010 <p>&#010 For other values and their meaning, see {@link com.smartgwt.client.types.Overflow}
    * Update {@link com.smartgwt.client.widgets.tab.TabSet#getPaneContainerOverflow paneContainerOverflow} after creation.&#010&#010
    * <p><b>Note : </b> This is an advanced setting</p>
    *
    * @param paneContainerOverflow new overflow setting. Default value is Canvas.AUTO
    */
    public void setPaneContainerOverflow(Overflow paneContainerOverflow) {
        setAttribute("paneContainerOverflow", paneContainerOverflow.getValue(), true);
    }
    /**
     * Specifies the overflow of the pane container (the component that holds the pane contents&#010 for all tabs).  By default this is set to "auto", meaning the pane container will&#010 automatically introduce scrolling when the pane contents exceed the TabSet's specified&#010 size.&#010 <p>&#010 For other values and their meaning, see {@link com.smartgwt.client.types.Overflow}
     *
     *
     * @return Overflow
     *
     */
    public Overflow getPaneContainerOverflow()  {
        return (Overflow) EnumUtil.getEnum(Overflow.values(), getAttribute("paneContainerOverflow"));
    }

    /**
    * If this tabSet will {@link com.smartgwt.client.widgets.tab.TabSet#getShowPaneContainerEdges showPaneContainerEdges} for the paneContainer,&#010 this property determines whether the same edge media will be used regardless of the tab&#010 bar position, or whether different media should be used (necessary if the edge appearance is&#010 not symmetrical on all sides).&#010 <P>&#010 If this property is set to false the paneContainer edge image URLs will be prefixed with&#010 the tabBarPosition of the tabSet - for example <code>"[SKIN]edge_top_T.gif"</code> rather&#010 than just <code>"[SKIN]edge_T.gif"</code>.&#010 <P>&#010 When <code>symmetricEdges</code> is false, custom edge sizes for the pane container may be&#010 specified via {@link com.smartgwt.client.widgets.tab.TabSet#getTopEdgeSizes topEdgeSizes} et al, and custom edge offsets via &#010 {@link com.smartgwt.client.widgets.tab.TabSet#getTopEdgeOffsets topEdgeOffsets} et al.
    *
    * @param symmetricEdges symmetricEdges Default value is true
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setSymmetricEdges(Boolean symmetricEdges)  throws IllegalStateException {
        setAttribute("symmetricEdges", symmetricEdges, false);
    }
    /**
     * If this tabSet will {@link com.smartgwt.client.widgets.tab.TabSet#getShowPaneContainerEdges showPaneContainerEdges} for the paneContainer,&#010 this property determines whether the same edge media will be used regardless of the tab&#010 bar position, or whether different media should be used (necessary if the edge appearance is&#010 not symmetrical on all sides).&#010 <P>&#010 If this property is set to false the paneContainer edge image URLs will be prefixed with&#010 the tabBarPosition of the tabSet - for example <code>"[SKIN]edge_top_T.gif"</code> rather&#010 than just <code>"[SKIN]edge_T.gif"</code>.&#010 <P>&#010 When <code>symmetricEdges</code> is false, custom edge sizes for the pane container may be&#010 specified via {@link com.smartgwt.client.widgets.tab.TabSet#getTopEdgeSizes topEdgeSizes} et al, and custom edge offsets via &#010 {@link com.smartgwt.client.widgets.tab.TabSet#getTopEdgeOffsets topEdgeOffsets} et al.
     *
     *
     * @return Boolean
     *
     */
    public Boolean getSymmetricEdges()  {
        return getAttributeAsBoolean("symmetricEdges");
    }

    /**
    * Should the paneContainer for this tabset show {@link com.smartgwt.client.widgets.Canvas#getShowEdges showEdges}.
    * <p><b>Note : </b> This is an advanced setting</p>
    *
    * @param showPaneContainerEdges showPaneContainerEdges Default value is null
    */
    public void setShowPaneContainerEdges(Boolean showPaneContainerEdges) {
        setAttribute("showPaneContainerEdges", showPaneContainerEdges, true);
    }
    /**
     * Should the paneContainer for this tabset show {@link com.smartgwt.client.widgets.Canvas#getShowEdges showEdges}.
     *
     *
     * @return Boolean
     *
     */
    public Boolean getShowPaneContainerEdges()  {
        return getAttributeAsBoolean("showPaneContainerEdges");
    }

    /**
    * If the paneContainer for this tab set is showing {@link com.smartgwt.client.widgets.Canvas#getShowEdges showEdges}, setting this&#010 attribute to <code>true</code> will set the paneContainer to show&#010 {@link com.smartgwt.client.widgets.Canvas#getCustomEdges customEdges} for the three sides opposing the tabBarPosition.
    * <p><b>Note : </b> This is an advanced setting</p>
    *
    * @param showPartialEdges showPartialEdges Default value is false
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setShowPartialEdges(Boolean showPartialEdges)  throws IllegalStateException {
        setAttribute("showPartialEdges", showPartialEdges, false);
    }
    /**
     * If the paneContainer for this tab set is showing {@link com.smartgwt.client.widgets.Canvas#getShowEdges showEdges}, setting this&#010 attribute to <code>true</code> will set the paneContainer to show&#010 {@link com.smartgwt.client.widgets.Canvas#getCustomEdges customEdges} for the three sides opposing the tabBarPosition.
     *
     *
     * @return Boolean
     *
     */
    public Boolean getShowPartialEdges()  {
        return getAttributeAsBoolean("showPartialEdges");
    }

    /**
    * Whether {@link com.smartgwt.client.widgets.Canvas#destroy} should be called on {@link com.smartgwt.client.widgets.tab.Tab#getPane pane} when it a tab is&#010 removed via {@link com.smartgwt.client.widgets.tab.TabSet#removeTab}}.  &#010 <P>&#010 An application might set this to false in order to re-use panes in different tabs or in&#010 different parts of the application.
    *
    * @param destroyPanes destroyPanes Default value is null
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setDestroyPanes(Boolean destroyPanes)  throws IllegalStateException {
        setAttribute("destroyPanes", destroyPanes, false);
    }
    /**
     * Whether {@link com.smartgwt.client.widgets.Canvas#destroy} should be called on {@link com.smartgwt.client.widgets.tab.Tab#getPane pane} when it a tab is&#010 removed via {@link com.smartgwt.client.widgets.tab.TabSet#removeTab}}.  &#010 <P>&#010 An application might set this to false in order to re-use panes in different tabs or in&#010 different parts of the application.
     *
     *
     * @return Boolean
     *
     */
    public Boolean getDestroyPanes()  {
        return getAttributeAsBoolean("destroyPanes");
    }

    // ********************* Methods ***********************














        /**
         * Add a tabIconClick handler.
         * <p>
         * Method fired when the user clicks the icon for a tab, as specified via {@link com.smartgwt.client.widgets.tab.Tab#getIcon icon}.&#010 <P>&#010 Default behavior will fire <code>icon.click()</code> if specified, with two parameters&#010 <code>tab</code> (a pointer to the tab object and <code>tabSet</code> a pointer to the tabSet&#010 instance.&#010
         *
         * @param handler the tabIconClick handler
         * @return {@link HandlerRegistration} used to remove this handler
         */
        public HandlerRegistration addTabIconClickHandler(com.smartgwt.client.widgets.tab.events.TabIconClickHandler handler) {
            if(getHandlerCount(com.smartgwt.client.widgets.tab.events.TabClickEvent.getType()) == 0) setupTabIconClickEvent();
            return doAddHandler(handler, com.smartgwt.client.widgets.tab.events.TabClickEvent.getType());
        }
        private native void setupTabIconClickEvent() /*-{
            var obj = null;
            var selfJ = this;
            if(this.@com.smartgwt.client.widgets.BaseWidget::isCreated()()) {
                obj = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
                obj.addProperties({tabIconClick:function(){
                        var param = {"tab" : arguments[0]};
                        var event = @com.smartgwt.client.widgets.tab.events.TabClickEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                        selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                    }
                });
            } else {
                obj = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
                obj.tabIconClick = function(){
                    var param = {"tab" : arguments[0]};
                    var event = @com.smartgwt.client.widgets.tab.events.TabClickEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                    selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                };
            }
        }-*/;






        /**
         * If there is not enough space to display all the tabs in this tabSet, this method will &#010 scroll the next tab (that first tab that is clipped at the end of the tab-bar) into view.&#010
         */
        public native void scrollForward() /*-{
            var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
            self.scrollForward();
        }-*/;

        /**
         * If there is not enough space to display all the tabs in this tabSet, this method will &#010 scroll the previous tab (that first tab that is clipped at the beginning of the tab-bar) &#010 into view.&#010
         */
        public native void scrollBack() /*-{
            var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
            self.scrollBack();
        }-*/;


        /**
         * Returns the index of the currently selected tab object.  &#010
         *
         * @return the index of the currently selected tab object
         */
        public native int getSelectedTabNumber() /*-{
            var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
            return self.getSelectedTabNumber();
        }-*/;


        /**
         * Add a tabSelected handler.
         * <p>
         * Notification fired when a tab is selected. Note that this will only fire if &#010 this tabSet is drawn. If a tab is selected before <code>TabSet.draw()</code> &#010 is called, the <code>tabSelected()</code> notificaiton will fire on &#010 <code>draw()</code>&#010
         *
         * @param handler the tabSelected handler
         * @return {@link HandlerRegistration} used to remove this handler
         */
        public HandlerRegistration addTabSelectedHandler(com.smartgwt.client.widgets.tab.events.TabSelectedHandler handler) {
            if(getHandlerCount(com.smartgwt.client.widgets.tab.events.TabSelectedEvent.getType()) == 0) setupTabSelectedEvent();
            return doAddHandler(handler, com.smartgwt.client.widgets.tab.events.TabSelectedEvent.getType());
        }
        private native void setupTabSelectedEvent() /*-{
            var obj = null;
            var selfJ = this;
            if(this.@com.smartgwt.client.widgets.BaseWidget::isCreated()()) {
                obj = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
                obj.addProperties({tabSelected:function(){
                        var param = {"tabNum" : arguments[0], "tabPane" : arguments[1], "ID" : arguments[2], "tab" : arguments[3]};
                        var event = @com.smartgwt.client.widgets.tab.events.TabSelectedEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                        selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                    }
                });
            } else {
                obj = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
                obj.tabSelected = function(){
                    var param = {"tabNum" : arguments[0], "tabPane" : arguments[1], "ID" : arguments[2], "tab" : arguments[3]};
                    var event = @com.smartgwt.client.widgets.tab.events.TabSelectedEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                    selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                };
            }
        }-*/;

        /**
         * Add a tabDeselected handler.
         * <p>
         * Notification fired when a tab is deselected.        &#010
         *
         * @param handler the tabDeselected handler
         * @return {@link HandlerRegistration} used to remove this handler
         */
        public HandlerRegistration addTabDeselectedHandler(com.smartgwt.client.widgets.tab.events.TabDeselectedHandler handler) {
            if(getHandlerCount(com.smartgwt.client.widgets.tab.events.TabDeselectedEvent.getType()) == 0) setupTabDeselectedEvent();
            return doAddHandler(handler, com.smartgwt.client.widgets.tab.events.TabDeselectedEvent.getType());
        }
        private native void setupTabDeselectedEvent() /*-{
            var obj = null;
            var selfJ = this;
            if(this.@com.smartgwt.client.widgets.BaseWidget::isCreated()()) {
                obj = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
                obj.addProperties({tabDeselected:function(){
                        var param = {"tabNum" : arguments[0], "tabPane" : arguments[1], "ID" : arguments[2], "tab" : arguments[3]};
                        var event = @com.smartgwt.client.widgets.tab.events.TabDeselectedEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                        selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                    }
                });
            } else {
                obj = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
                obj.tabDeselected = function(){
                    var param = {"tabNum" : arguments[0], "tabPane" : arguments[1], "ID" : arguments[2], "tab" : arguments[3]};
                    var event = @com.smartgwt.client.widgets.tab.events.TabDeselectedEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                    selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                };
            }
        }-*/;

    // ********************* Static Methods ***********************




    /**
    * Specifies the index of the initially selected tab.
    *
    * @param selectedTab selectedTab Default value is 0
    */
    public void setSelectedTab(int selectedTab) {
        setAttribute("selectedTab", selectedTab, true);
    }

    public void setTabs(Tab... tabs) {
        for (Tab tab : tabs) {
            addTab(tab);
        }
    }

    /**
     * Select a tab.
     *
     * @param tabIndex the tab index
     */
    public native void selectTab(int tabIndex) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.selectTab(tabIndex);
    }-*/;

    /**
     * Select a tab.
     *
     * @param ID the tab ID
     */
    public native void selectTab(String ID) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.selectTab(ID);
    }-*/;

    /**
     * Select a tab.
     *
     * @param tab the tab
     */
    public native void selectTab(Tab tab) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var tabJS = tab.@com.smartgwt.client.widgets.tab.Tab::getJsObj()();
        self.selectTab(tabJS);
    }-*/;

    /**
     * Changes the title of a tab
     *
     * @param tabIndex the tab index
     * @param title    new title
     */
    public native void setTabTitle(int tabIndex, String title) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.setTabTitle(tabIndex, title);
    }-*/;

    /**
     * Changes the title of a tab
     *
     * @param ID    the tab ID
     * @param title new title
     */
    public native void setTabTitle(String ID, String title) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.setTabTitle(ID, title);
    }-*/;

    /**
     * Changes the title of a tab
     *
     * @param tab   the tab
     * @param title new title
     */
    public native void setTabTitle(Tab tab, String title) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var tabJS = tab.@com.smartgwt.client.widgets.tab.Tab::getJsObj()();
        self.setTabTitle(tabJS, title);
    }-*/;

    /**
     * Changes the icon of a tab
     *
     * @param tabIndex the tab index
     * @param iconURL    new icon
     */
    public native void setTabIcon(int tabIndex, String iconURL) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.setTabIcon(tabIndex, iconURL);
    }-*/;

    /**
     * Changes the icon of a tab
     *
     * @param ID    the tab ID
     * @param iconURL new icon
     */
    public native void setTabIcon(String ID, String iconURL) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.setTabIcon(ID, iconURL);
    }-*/;

    /**
     * Changes the icon of a tab
     *
     * @param tab   the tab
     * @param iconURL new icon
     */
    public native void setTabIcon(Tab tab, String iconURL) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var tabJS = tab.@com.smartgwt.client.widgets.tab.Tab::getJsObj()();
        self.setTabIcon(tabJS, iconURL);
    }-*/;

    /**
     * If the specified tab is disabled, enable it now.
     *
     * @param tabIndex the tab index
     */
    public native void enableTab(int tabIndex) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.enableTab(tabIndex);
    }-*/;

    /**
     * If the specified tab is disabled, enable it now.
     *
     * @param ID the tab id
     */
    public native void enableTab(String ID) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.enableTab(ID);
    }-*/;

    /**
     * If the specified tab is disabled, enable it now.
     *
     * @param tab the tab
     */
    public native void enableTab(Tab tab) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var tabJS = tab.@com.smartgwt.client.widgets.tab.Tab::getJsObj()();
        self.enableTab(tabJS);
    }-*/;

    public native void updateTab(int tabIndex, Canvas pane) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var paneJS = pane.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.updateTab(tabIndex, paneJS);
    }-*/;

    public native void updateTab(Tab tab, Canvas pane) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var tabJS = tab.@com.smartgwt.client.widgets.tab.Tab::getJsObj()();
        var paneJS = pane.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.updateTab(tabJS, paneJS);
    }-*/;

    /**
     * If the specified tab is enabled, disable it now.
     *
     * @param tabIndex the tab index
     */
    public native void disableTab(int tabIndex) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.disableTab(tabIndex);
    }-*/;

    /**
     * If the specified tab is enabled, disable it now.
     *
     * @param ID the tab id
     */
    public native void disableTab(String ID) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.disableTab(ID);
    }-*/;

    /**
     * If the specified tab is enabled, disable it now.
     *
     * @param tab the tab
     */
    public native void disableTab(Tab tab) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var tabJS = tab.@com.smartgwt.client.widgets.tab.Tab::getJsObj()();
        self.disableTab(tabJS);
    }-*/;

    /**
     * Remove a tab. <P> The pane associated with the removed tab is automatically destroyed when you call this method.
     * To avoid this, call {@link com.smartgwt.client.widgets.tab.TabSet#updateTab} with <code>null</code> as the new
     * pane immediately before removing the tab.
     *
     * @param tabs list of tabs, tabIDs, or tab numbers
     */
    public native void removeTab(int tabIndex) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.removeTab(tabIndex);
    }-*/;

    /**
     * Remove a tab. <P> The pane associated with the removed tab is automatically destroyed when you call this method.
     * To avoid this, call {@link com.smartgwt.client.widgets.tab.TabSet#updateTab} with <code>null</code> as the new
     * pane immediately before removing the tab.
     *
     * @param tabs list of tabs, tabIDs, or tab numbers
     */
    public native void removeTab(String ID) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.removeTab(ID);
    }-*/;

    /**
     * Remove a tab. <P> The pane associated with the removed tab is automatically destroyed when you call this method.
     * To avoid this, call {@link com.smartgwt.client.widgets.tab.TabSet#updateTab} with <code>null</code> as the new
     * pane immediately before removing the tab.
     *
     * @param tabs list of tabs, tabIDs, or tab numbers
     */
    public native void removeTab(Tab tab) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var tabJS = tab.@com.smartgwt.client.widgets.tab.Tab::getJsObj()();
        self.removeTab(tabJS);
    }-*/;

    /**
     * Remove one or more tabs.  The pane(s) associated with the removed tab(s) is automatically destroyed when you call
     * this method.
     *
     * @param tabs list of tabs, tabIDs, or tab numbers
     */
    public native void removeTabs(int[] tabIndexes) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var tabs = @com.smartgwt.client.util.JSOHelper::convertToJavaScriptArray([I)(tabIndexes);
        self.removeTab(tabs);
    }-*/;

    /**
     * Remove one or more tabs.  The pane(s) associated with the removed tab(s) is automatically destroyed when you call
     * this method.
     *
     * @param tabs list of tabs, tabIDs, or tab numbers
     */
    public native void removeTabs(String[] ids) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var tabs = @com.smartgwt.client.util.JSOHelper::convertToJavaScriptArray([Ljava/lang/Object;)(ids);
        self.removeTab(tabs);
    }-*/;

    /**
     * The currently selected tab.
     *
     * @return the currently selected Tab
     */
    public native Tab getSelectedTab() /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.getSelectedTab();
        return ret == null ? null : @com.smartgwt.client.core.RefDataClass::getRef(Lcom/google/gwt/core/client/JavaScriptObject;)(ret);
    }-*/;

    /**
     * Get the live Canvas representing a tab by index or ID.   If passed a tab Canvas, just returns it. <P> Note that
     * live Tab instances are not available until {@link com.smartgwt.client.widgets.Canvas#draw}. <P> The returned Tab
     * is considered an internal component of the TabSet.  In order to maximize forward compatibility, manipulate tabs
     * through APIs such as a {@link com.smartgwt.client.widgets.tab.TabSet#setTabTitle} instead. Also note that a
     * super-lightweight TabSet implementation may not use a separate Canvas per Tab, and code that accesses an
     * manipulates Tabs as Canvases won't be compatible with that implementation.
     *
     * @param tab
     * @return the tab Canvas, or null if not found or TabSet not drawn yet
     */
    public native Tab getTab(int tabIndex) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.getTab(tabIndex);
        return ret == null ? null : @com.smartgwt.client.core.RefDataClass::getRef(Lcom/google/gwt/core/client/JavaScriptObject;)(ret);
    }-*/;

    /**
     * Get the live Canvas representing a tab by index or ID.   If passed a tab Canvas, just returns it. <P> Note that
     * live Tab instances are not available until {@link com.smartgwt.client.widgets.Canvas#draw}. <P> The returned Tab
     * is considered an internal component of the TabSet.  In order to maximize forward compatibility, manipulate tabs
     * through APIs such as a {@link com.smartgwt.client.widgets.tab.TabSet#setTabTitle} instead. Also note that a
     * super-lightweight TabSet implementation may not use a separate Canvas per Tab, and code that accesses an
     * manipulates Tabs as Canvases won't be compatible with that implementation.
     *
     * @param tab
     * @return the tab Canvas, or null if not found or TabSet not drawn yet
     */
    public native Tab getTab(String ID) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        var ret = self.getTab(ID);
        return ret == null ? null : @com.smartgwt.client.core.RefDataClass::getRef(Lcom/google/gwt/core/client/JavaScriptObject;)(ret);
    }-*/;

    /**
     * Add a tab
     *
     * @param tab new tab
     */
    public void addTab(Tab tab) {
        JavaScriptObject tabJS = tab.getJsObj();

        if (isCreated()) {
            addTabPostCreate(tabJS);

        } else {
            addTabPreCreate(tabJS);
        }
    }

    private native void addTabPreCreate(JavaScriptObject tabJS) /*-{
		var config = this.@com.smartgwt.client.widgets.BaseWidget::config;

        if(!config.tabs) {
            config.tabs = @com.smartgwt.client.util.JSOHelper::createJavaScriptArray()();
        }
        config.tabs.push(tabJS);
    }-*/;

    private native void addTabPostCreate(JavaScriptObject tabJS) /*-{
        var container = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        container.addTab(tabJS);
    }-*/;

    /**
     * The number of tabs
     *
     * @param the number of tabs
     */
    public native int getNumTabs()/*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        return self.tabs.length;
    }-*/;

    /**
     * The tabs
     *
     * @return the tabs
     */
    public Tab[] getTabs() {
        return convertToTabArray(getAttributeAsJavaScriptObject("tabs"));
    }

    private static Tab[] convertToTabArray(JavaScriptObject nativeArray) {
        if (nativeArray == null) {
            return new Tab[]{};
        }
        JavaScriptObject[] componentsj = JSOHelper.toArray(nativeArray);
        Tab[] objects = new Tab[componentsj.length];
        for (int i = 0; i < componentsj.length; i++) {
            JavaScriptObject componentJS = componentsj[i];
            Tab obj = (Tab) RefDataClass.getRef(componentJS);
            objects[i] = obj;
        }
        return objects;
    }

    /**
     * This property determines what controls should show up after the tabBar for this tabSet. Standard controls can be
     * included using the strings <code>"tabScroller"</code> and  <code>"tabPicker"</code>. These show the standard
     * controls to scroll to clipped tabs,  or pick them directly from a menu, and show up only if {@link
     * com.smartgwt.client.widgets.tab.TabSet#getShowTabScroller showTabScroller} or  {@link
     * com.smartgwt.client.widgets.tab.TabSet#getShowTabPicker showTabPicker} is true and there is not enough space
     * available to show all  the tabs in the tab-bar. <P> Additional controls can be included by adding any widget to
     * this array.  Controls will show up in the order in which they are specified.  For example, the following code
     * would add a button in the tabBar area, while preserving the normal behavior of the tabScroller and tabPicker:
     * <pre> isc.TabSet.create({     width:300,     tabs : [         { title: "Tab one" }     ],     tabBarControls : [
     *        isc.ImgButton.create({             src:"[SKINIMG]/actions/add.png",             width:16, height:16,
     *       layoutAlign:"center"         }),         "tabScroller", "tabPicker"     ] }); </pre>
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param tabBarControls tabBarControls Default value is ["tabScroller", "tabPicker"]
     * @throws IllegalStateException this property cannot be changed after the component has been created
     * @see com.smartgwt.client.types.TabBarControls
     */
    public void setTabBarControls(Object... tabBarControls) throws IllegalStateException {
        setAttribute("tabBarControls", tabBarControls, false);
    }


    /**
     * Apply a new {@link com.smartgwt.client.widgets.tab.Tab#getPane pane} to an existing tab in this tabSet
     * @param tabIndex Tab to update
     * @param pane new Pane for the tab
     */
    public native void setTabPane(int tabIndex, Canvas pane) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.setTabPane(tabIndex, pane.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()());
    }-*/;

    /**
     * Apply a new {@link com.smartgwt.client.widgets.tab.Tab#getPane pane} to an existing tab in this tabSet
     * @param tabID Tab to update
     * @param pane new Pane for the tab
     */
    public native void setTabPane(String tabID, Canvas pane) /*-{
        var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
        self.setTabPane(tabID, pane.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()());
    }-*/;

    /**
     * Add a onCloseClick handler.
     * <p>
     * When {@link com.smartgwt.client.widgets.tab.TabSet#getCanCloseTabs canCloseTabs} is set, this notification method fired when the user clicks &#010 the "close" icon for a tab.&#010 Return false to cancel default behavior of removing the tab from the TabSet&#010
     *
     * @param handler the onCloseClick handler
     * @return {@link com.google.gwt.event.shared.HandlerRegistration} used to remove this handler
     */
    public HandlerRegistration addCloseClickHandler(com.smartgwt.client.widgets.tab.events.CloseClickHandler handler) {
        if(getHandlerCount(com.smartgwt.client.widgets.tab.events.TabCloseClickEvent.getType()) == 0) setupCloseClickEvent();
        return doAddHandler(handler, com.smartgwt.client.widgets.tab.events.TabCloseClickEvent.getType());
    }
    private native void setupCloseClickEvent() /*-{
        var obj = null;
        var selfJ = this;
        if(this.@com.smartgwt.client.widgets.BaseWidget::isCreated()()) {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
            obj.addProperties({onCloseClick:function(){
                    var param = {"tab" : arguments[0]};
                    var event = @com.smartgwt.client.widgets.tab.events.TabCloseClickEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                    selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                    var ret = event.@com.smartgwt.client.event.Cancellable::isCancelled()();
                    return !ret;
                }
            });
        } else {
            obj = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
            obj.onCloseClick = function(){
                var param = {"tab" : arguments[0]};
                var event = @com.smartgwt.client.widgets.tab.events.TabCloseClickEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                var ret = event.@com.smartgwt.client.event.Cancellable::isCancelled()();
                return !ret;
            };
        }
    }-*/;

}


