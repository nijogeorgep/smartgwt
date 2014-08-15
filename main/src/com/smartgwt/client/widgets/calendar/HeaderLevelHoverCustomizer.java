package com.smartgwt.client.widgets.calendar;

import java.util.Date;

/**
 * Called to determine the hover text for a given span in a HeaderLevel in Timeline views
 */
public abstract class HeaderLevelHoverCustomizer {
    
    private Calendar calendar;

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }    

    /**
     * Returns the Calendar over which the hover occurred
     * @return Calendar over which the hover occurred
     */
    public Calendar getCalendar() {
        return this.calendar;
    }
    
    /**
     * getHoverHTML() should be implemented and return the string of HTML to display in the hover for a given span in the HeaderLevel
     * @param headerLevel HeaderLevel a reference to this headerLevel
     * @param startDate Date the start of the date-range covered by this span in this level
     * @param endDate Date the end of the date-range covered by this span in this level - may be null
     * @param defaultValue String the default title as generated by the Timeline
     * @param calendarView CalendarView a reference to the calendarView this headerLevel is in
     * @return String The formatted hover text for the values passed in
     */
    public abstract String getHoverHTML(HeaderLevel headerLevel, Date startDate, Date endDate, String defaultValue, CalendarView view);
}
