/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntodeventa;

/**
 *
 * @author PC
 */
import java.awt.FlowLayout;
import java.util.Calendar;
import javax.swing.JFrame;
import org.freixas.jcalendar.DateEvent;
import org.freixas.jcalendar.DateListener;
import org.freixas.jcalendar.JCalendar;

public class Calendario extends JFrame{
    public Calendario(){
        JCalendar cal = new JCalendar();
        this.add(cal);
        this.setLayout(new FlowLayout());
        this.setSize(350, 300);
        this.setLocation(720, 300);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        MyDateListener listener = new MyDateListener();
        cal.addDateListener(listener);
    }
    private class MyDateListener
      implements DateListener
{

public void
dateChanged(
    DateEvent e)
{
    Calendar c = e.getSelectedDate();
    if (c != null) {
	System.out.println(c.getTime());
    }
    else {
	System.out.println("No time selected.");
    }
}
    }
}
