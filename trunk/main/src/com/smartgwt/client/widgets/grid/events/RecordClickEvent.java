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
 
package com.smartgwt.client.widgets.grid.events;



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
import com.google.gwt.event.logical.shared.HasHandlers;
public class RecordClickEvent extends AbstractSmartEvent<RecordClickHandler>  implements Cancellable {
    private boolean cancel = false;

  /**
   * Handler type.
   */
  private static Type<RecordClickHandler> TYPE;

  /**
   * Fires a open event on all registered handlers in the handler manager.If no
   * such handlers exist, this method will do nothing.
   *
   * @param <S> The event source
   * @param source the source of the handlers
   * @param target the target
   */
  public static <S extends HasRecordClickHandlers & HasHandlers> void fire(
      S source, JavaScriptObject jsObj) {
    if (TYPE != null) {
      HandlerManager handlers = source.getHandlers();
      if (handlers != null) {
        RecordClickEvent event = new RecordClickEvent(jsObj);
        handlers.fireEvent(event);
      }
    }
  }

  /**
   * Gets the type associated with this event.
   *
   * @return returns the handler type
   */
  public static Type<RecordClickHandler> getType() {
    if (TYPE == null) {
      TYPE = new Type<RecordClickHandler>();
    }
    return TYPE;
  }


  @Override
  protected void dispatch(RecordClickHandler handler) {
    handler.onRecordClick(this);
  }

  // Because of type erasure, our static type is
  // wild carded, yet the "real" type should use our I param.

  @SuppressWarnings("unchecked")
  @Override
  protected final Type<RecordClickHandler> getAssociatedType() {
    return TYPE;
  }

    public RecordClickEvent(JavaScriptObject jsObj) {
        super(jsObj);
    }


    /**
     * false to stop event bubbling
     */
    public void cancel() {
        cancel = true;
    }

    /**
     * @return true if cancelled
     */
    public boolean isCancelled() {
        return cancel;
    }

    /**
     * the listGrid that contains the click event
     *
     * @return the listGrid that contains the click event
     */
    public  native ListGrid getViewer() /*-{
        var jsObj = this.@com.smartgwt.client.event.AbstractSmartEvent::jsObj;
        var retVal = @com.smartgwt.client.widgets.grid.ListGrid::getOrCreateRef(Lcom/google/gwt/core/client/JavaScriptObject;)(jsObj.viewer);
        if(retVal == null) {
            retVal = @com.smartgwt.client.widgets.grid.ListGrid::new(Lcom/google/gwt/core/client/JavaScriptObject;)(jsObj.viewer);
        }
        return retVal;
    }-*/;

    /**
     * the record that was clicked on
     *
     * @return the record that was clicked on
     */
    public  native ListGridRecord getRecord() /*-{
        var jsObj = this.@com.smartgwt.client.event.AbstractSmartEvent::jsObj;
            var retVal = @com.smartgwt.client.widgets.grid.ListGridRecord::getOrCreateRef(Lcom/google/gwt/core/client/JavaScriptObject;)(jsObj.record);
            if(retVal == null) {
                retVal = @com.smartgwt.client.widgets.grid.ListGridRecord::new(Lcom/google/gwt/core/client/JavaScriptObject;)(jsObj.record);
            }
            return retVal;
    }-*/;

    /**
     * number of the record clicked on in the current set of                                  displayed records (starts with 0)
     *
     * @return number of the record clicked on in the current set of                                  displayed records (starts with 0)
     */
    public  native int getRecordNum() /*-{
        var jsObj = this.@com.smartgwt.client.event.AbstractSmartEvent::jsObj;
        return jsObj.recordNum;
    }-*/;

    /**
     * the field that was clicked on (field definition)
     *
     * @return the field that was clicked on (field definition)
     */
    public  native ListGridField getField() /*-{
        var jsObj = this.@com.smartgwt.client.event.AbstractSmartEvent::jsObj;
        return @com.smartgwt.client.widgets.grid.ListGridField::new(Lcom/google/gwt/core/client/JavaScriptObject;)(jsObj.field);
    }-*/;

    /**
     * number of the field clicked on in the listGrid.fields                                  array
     *
     * @return number of the field clicked on in the listGrid.fields                                  array
     */
    public  native int getFieldNum() /*-{
        var jsObj = this.@com.smartgwt.client.event.AbstractSmartEvent::jsObj;
        return jsObj.fieldNum;
    }-*/;





       //TODO custom
    public  native JavaScriptObject getValue() /*-{
        var jsObj = this.@com.smartgwt.client.event.AbstractSmartEvent::jsObj;
        return jsObj.value;
    }-*/;
    /**
     * raw value of the cell (before valueMap, etc applied)
     *
     * @return raw value of the cell (before valueMap, etc applied)
     */
    //TODO custom
    public  native JavaScriptObject getRawValue() /*-{
        var jsObj = this.@com.smartgwt.client.event.AbstractSmartEvent::jsObj;
        return jsObj.rawValue;
    }-*/;


}
