/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import javax.swing.JFrame;

public final class BookingFrame {
    private JFrame frame;
    public BookingFrame(){
        frame=new JFrame("Booking frame");
        launchframe();
    }
public  void launchframe()
{ 
        frame.setVisible(true);
        frame.setSize(400,400);
}
    
}
