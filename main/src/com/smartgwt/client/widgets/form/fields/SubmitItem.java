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
 
package com.smartgwt.client.widgets.form.fields;



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
    * Button that saves the data in the form, by calling <code>DynamicForm.submit()</code> &#010 Behavior depends on the containing form's {@link com.smartgwt.client.widgets.form.DynamicForm#getCanSubmit canSubmit} property. &#010 If <code>form.canSubmit</code> is true, this method will perform a direct submission&#010 of the underlying HTML form.<br>&#010 Otherwise standard RPC operations will be used to save the changes.

    */
public class SubmitItem extends ButtonItem {

    public static SubmitItem getOrCreateRef(JavaScriptObject jsObj) {
        if(jsObj == null) return null;
        RefDataClass obj = RefDataClass.getRef(jsObj);
        if(obj != null) {
            obj.setJsObj(jsObj);
            return (SubmitItem) obj;
        } else {
            return new SubmitItem(jsObj);
        }
    }


    public SubmitItem(){
        setType("SubmitItem");
    }

    public SubmitItem(JavaScriptObject jsObj){
        super(jsObj);
    }

    public SubmitItem(String name) {
        setName(name);
        setType("SubmitItem");
    }

    public SubmitItem(String name, String title) {
        setName(name);
		setTitle(title);
        setType("SubmitItem");
    }

    // ********************* Properties / Attributes ***********************

    /**
    * SubmitItems show a title of <code>"Submit"</code> by default. May be overridden.
    *
    * @param title title Default value is "Submit"
    */
    public void setTitle(String title) {
        setAttribute("title", title);
    }
    /**
     * SubmitItems show a title of <code>"Submit"</code> by default. May be overridden.
     *
     *
     * @return String
     *
     */
    public String getTitle()  {
        return getAttributeAsString("title");
    }

    // ********************* Methods ***********************

    // ********************* Static Methods ***********************

}



