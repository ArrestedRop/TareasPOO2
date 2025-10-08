package Feria;

public class recopiladorFeria {
    private int normalTicketQuantity, inapamTicketQuantity,freeTicketsQuantity, totalTickets = 0, totalCost ;
    
    public void setNormalTicketQuantity(int normalTicketQuantity){
        this.normalTicketQuantity = normalTicketQuantity;
        totalTickets+= normalTicketQuantity;
    }
    public int getNormalTicketQuantity() {
        return normalTicketQuantity;
    }

    public void setINAPAMTicketQuantity(int inapamTicketQuantity){
        this.inapamTicketQuantity = inapamTicketQuantity;
        totalTickets+= inapamTicketQuantity;
    }
    public int getINAPAMTicketQuantity() {
        return inapamTicketQuantity;
    }

    public void setFreeTickets(int freeTicketsQuantity) {
        this.freeTicketsQuantity = freeTicketsQuantity;
        totalTickets += freeTicketsQuantity;
    }
    public int getFreeTickets() {
        return freeTicketsQuantity;
    }


    public int gettotalTickets() {
        return totalTickets;
    }
    public int gettotalCost() {
        return totalCost+=((inapamTicketQuantity*7)+(normalTicketQuantity*14));
    }
}

