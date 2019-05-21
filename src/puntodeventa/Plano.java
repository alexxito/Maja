package puntodeventa;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Plano extends JInternalFrame implements AdjustmentListener{
   
   JScrollBar vert;
   JScrollBar hort; 
   JPanel pnel = new JPanel();
   int x0;
   int y0;
   public boolean draw;
   
   public boolean getDraw(){
       return draw;
   }
   
   public String[] xf= { "XXXXXXXXXXXXX", "Febrero", "Marzo", "Abril", "Mayo", "Junio","Julio","Ago9sto", "Sestiembre","Octubre ","Noviembre ", "Dicimbre","13ciqvo " };
   public int xven; public String[] xf2;
   public int[] yven;public int[] yven2;        
   public int nodat=0;public int nodat2=0;
   
   //contructor
   public Plano (boolean draw, String[] fech, int[] noven , String[] fech2, int[] noven2 ){
       nodat = noven.length;
       xf=fech;
       yven=noven;
       for(int i=0; i>noven.length-1;i++){
           yven[i]*=200;
       }
       nodat2 = noven2.length;
       xf2=fech2;
       
       //r(int orientacion, int valor,int ancho, int minimo, int maximo)
      vert= new JScrollBar(Scrollbar.VERTICAL    ,1,50,0, getMax(noven)*2+100 );
      hort= new JScrollBar(Scrollbar.HORIZONTAL  ,5,50,5,203);
      this.draw=draw;
      vert.addAdjustmentListener(this);
      hort.addAdjustmentListener(this);
      pnel.setBackground(Color.white);
      add(pnel,"Center");
      add(vert,"East");
      add(hort,"South");
      
      
      setVisible(true);
      setSize(850, 350);      
      setLocation(20,20);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
    
  // public static void main(String arg[]){
      //new Plano();
      
   //}
   
   public void adjustmentValueChanged(AdjustmentEvent e){      
      int tam =85;
      String mes[]= { "enero ", "f244re", "fedave", "2442e", "febre", "febre","mafgnrzo ","e32nero ", "f345ebre","mar3245zo ","ene45ro ", "235febre","m3245arzo " };

      Graphics g = pnel.getGraphics();
      super.paint(g);

      pnel.setBackground(Color.white);
      g.setColor(Color.BLACK);
      
      //x0=getWidth()/2;
      //y0=getHeight()/2;

      ///Dinujando      
      g.setColor( Color.black);
     
      //System.out.println(x.length);
      int[] Ey= yven;//arreglo de venas hechas
      int[] Ex= new int[Ey.length];//entre fechas
      for(int i=0; i<Ey.length;i++){//INCIALIZO LA X
          Ex[i]=  (i*100)+50;
      }
      
       int[] Eyd= yven;//arreglo de venas hechas
      int[] Exd= new int[Eyd.length];//entre fechas
      for(int i=0; i<Eyd.length;i++){//INCIALIZO LA X
          Exd[i]=  (i*100)+50;
      }
      int Eyd2[]= new int[nodat];
      
      
      
       int Ey2[]= new int[nodat];
      g.setColor( Color.PINK);
    for(int i=-1; i<nodat-1;i++){
          for(int j=0;j<Ex.length;j++){
              Ey2[j]=Ey[j]-i;
          } 
         //Graff
         g.drawPolyline( Plano.ajustx(Ex,x0) , Plano.ajusty(Ey2,y0)   ,Ex.length );
         // g.fillPolygon(Plano.ajustx(Ex,x0) , Plano.ajusty(Ey,y0)   ,Ex.length);
      }
      
      //segunbdo
      g.setColor( Color.BLACK);
      g.drawPolyline( Plano.ajustx(Exd,x0) , Plano.ajusty(Eyd,y0)   ,Exd.length );//dos
     // g.drawPolyline( Plano.ajustx(Ex,x0) , Plano.ajusty(Ey,y0)   ,Ex.length );
      
      for(int i=0;i<nodat;i++ ){
            g.drawString(xf[i],x0+(i*100)+20, y0+30);//fechas
            g.setColor( Color.RED);
            g.fillOval(x0+(i*100)+45, y0-Ey[i]-5, 10, 10);
            g.setColor( Color.BLACK);
      }
      
      for(int i=0; i<10;i++){//linea  horz
        g.drawLine(i+30,0, i+30, 260);//vertical
        g.drawLine(30, i+y0, 1000, i+y0-2 );//horizontal
      }
      

      for(int i=-600; i<10;i+=20){
            g.drawString( "---"+2*((i*-50)/100)+"",50 , i+y0 );     
            //linea vert
      }
      
      //d.dibPL( Plano.ajustx(x,x0), Plano.ajusty(y,y0),g );
      
      hort.setMaximum( (nodat*50)+100);
      vert.setMaximum(getMax(Ey)+100);
      
      hort.setUnitIncrement(tam/10);
      vert.setUnitIncrement(tam/10);
      

      x0= ( (getWidth()*hort.getValue()/203)*-1 ) + 100  ;
      y0= (getHeight()*vert.getValue()/800) +260 ;
      
      //g.fillRect(x,y,tam,tam);

   }
   
   public static int[] ajustx(int []c, int p ){
      int r[]= new int[c.length];
      
      for(int i=0; i<r.length;i++){
         r[i]= c[i]+ p;
      }
      
      return r; 
   }
   
   public static int[] ajusty(int []c, int p ){
      int r[]= new int[c.length];
      
      for(int i=0; i<r.length;i++){
         r[i]=p - c[i];
      }
      
      return r; 
   }
     public static int getMax(int[] inputArray){ 
    int maxValue = inputArray[0]; 
    for(int i=1;i < inputArray.length;i++){ 
      if(inputArray[i] > maxValue){ 
         maxValue = inputArray[i]; 
      } 
    } 
    return maxValue; 
  }
}