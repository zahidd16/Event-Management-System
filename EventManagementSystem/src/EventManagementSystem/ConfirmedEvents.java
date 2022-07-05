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
public class ConfirmedEvents {
    String EventDate,eventTime,EventAddress,Res_name;
    int bill_no,Res_id,eventID,customerID,totalAmount;

    public ConfirmedEvents(String EventDate, String eventTime, String EventAddress, String Res_name, int bill_no, int Res_id, int eventID, int customerID, int totalAmount) {
        this.EventDate = EventDate;
        this.eventTime = eventTime;
        this.EventAddress = EventAddress;
        this.Res_name = Res_name;
        this.bill_no = bill_no;
        this.Res_id = Res_id;
        this.eventID = eventID;
        this.customerID = customerID;
        this.totalAmount = totalAmount;
    }

    public String getEventDate() {
        return EventDate;
    }

    public void setEventDate(String EventDate) {
        this.EventDate = EventDate;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public String getEventAddress() {
        return EventAddress;
    }

    public void setEventAddress(String EventAddress) {
        this.EventAddress = EventAddress;
    }

    public String getRes_name() {
        return Res_name;
    }

    public void setRes_name(String Res_name) {
        this.Res_name = Res_name;
    }

    public int getBill_no() {
        return bill_no;
    }

    public void setBill_no(int bill_no) {
        this.bill_no = bill_no;
    }

    public int getRes_id() {
        return Res_id;
    }

    public void setRes_id(int Res_id) {
        this.Res_id = Res_id;
    }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    
    

   
}
