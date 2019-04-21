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
import java.util.StringTokenizer;

public class Calendario extends JFrame {
    static String[] mon = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Ago","Sep","Oct","Nov","Dec"};
    static String fecha;
    ProveedoresBD pr = new ProveedoresBD();

    public Calendario() {
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
            implements DateListener {

        @Override
        public void dateChanged(DateEvent e) {
            Calendar c = e.getSelectedDate();
            Calendario cc = new Calendario();
            if (c != null) {
                cc.obtenerFecha(c.getTime().toString());
            } else {
                System.out.println("No time selected.");
            }
        }
    }
    
    public void obtenerFecha(String c){
        System.out.println(c);
        StringTokenizer fec = new StringTokenizer(c);
        StringBuilder sb = new StringBuilder();
        String day;
        String mont;
        String year;
        fec.nextToken();
        mont = fec.nextToken();
        for (int i = 0; i < mon.length; i++) {
            if (mont.equals(mon[i])) {
                mont = i+1+"";
            }
        }
        day = fec.nextToken();
        fec.nextToken();
        fec.nextToken();
        year = fec.nextToken();
        sb.append(year.concat("-").concat(mont).concat("-").concat(day));
        fecha = sb.toString();
        pr.setFecha(fecha);
    }
    
}
