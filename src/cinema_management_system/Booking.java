package cinema_management_system;

public class Booking {
    public static int counter = 1;
    public int bookingId;
    public String title;
    public String username;
    public int numoftickets;
    
    public void Add(String title, int numoftickets, String username) {
        bookingId = counter++;
        this.title = title;
        this.numoftickets = numoftickets;
        this.username = username;
    }
    
    @Override
    public String toString() {
        return " Booking ID: " + bookingId +
                "  -   Title: " + title +
                "  -   Number of tickets: " + numoftickets;
    }
}
