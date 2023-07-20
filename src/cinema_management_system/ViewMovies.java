package cinema_management_system;
import java.util.*;
import javax.swing.DefaultListModel;
public class ViewMovies extends CenteredFrame {
    private List<AddMovie> movies;
    private String check;

    public ViewMovies(List<AddMovie> movies, String check) {
        this.movies = movies;
        this.check = check;
        initComponents();
        displayMovies();
    }
    
    private void displayMovies() {
        DefaultListModel<String> model = new DefaultListModel<>();
        for (AddMovie movie : movies) {
            String movieInfo = movie.title + " - Duration: " + movie.duration + " mins - Showtime: " +
                    movie.showtime + " - Ticket Price: " + movie.ticketPrice;
            model.addElement(movieInfo);
        }
        jList1.setModel(model);
    }
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(309, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(check != null) {
            CustomerMenu customerMenu = new CustomerMenu(check);
            customerMenu.setVisible(true);  // Set the second GUI visible
            this.setVisible(false);  // Hide the first GUI
            this.dispose();  // Dispose the resources of the first GUI
        } else{
            AdminMenu adminMenu = new AdminMenu();  // Create an instance of the second GUI
            adminMenu.setVisible(true);  // Set the second GUI visible
            this.setVisible(false);  // Hide the first GUI
            this.dispose();  // Dispose the resources of the first GUI
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
