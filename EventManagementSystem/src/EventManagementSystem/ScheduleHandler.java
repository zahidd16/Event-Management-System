/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventManagementSystem;

/**
 *
 * @author zahid
 */
public class ScheduleHandler {
    private int Assignment_ID;
    private int Event_ID;
    private int Emp_ID;
    private String EventDate;
    private String EventTime;
    private String Res_Name;
    private String Event_Adress;

    public ScheduleHandler(int Assignment_ID, int Event_ID, int Emp_ID, String EventDate, String EventTime, String Res_Name, String Event_Adress) {
        this.Assignment_ID = Assignment_ID;
        this.Event_ID = Event_ID;
        this.Emp_ID = Emp_ID;
        this.EventDate = EventDate;
        this.EventTime = EventTime;
        this.Res_Name = Res_Name;
        this.Event_Adress = Event_Adress;
    }

    public int getAssignment_ID() {
        return Assignment_ID;
    }

    public void setAssignment_ID(int Assignment_ID) {
        this.Assignment_ID = Assignment_ID;
    }

    public int getEvent_ID() {
        return Event_ID;
    }

    public void setEvent_ID(int Event_ID) {
        this.Event_ID = Event_ID;
    }

    public int getEmp_ID() {
        return Emp_ID;
    }

    public void setEmp_ID(int Emp_ID) {
        this.Emp_ID = Emp_ID;
    }

    public String getEventDate() {
        return EventDate;
    }

    public void setEventDate(String EventDate) {
        this.EventDate = EventDate;
    }

    public String getEventTime() {
        return EventTime;
    }

    public void setEventTime(String EventTime) {
        this.EventTime = EventTime;
    }

    public String getRes_Name() {
        return Res_Name;
    }

    public void setRes_Name(String Res_Name) {
        this.Res_Name = Res_Name;
    }

    public String getEvent_Adress() {
        return Event_Adress;
    }

    public void setEvent_Adress(String Event_Adress) {
        this.Event_Adress = Event_Adress;
    }
    
    

    
    
    
}
