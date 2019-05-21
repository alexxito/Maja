
package puntodeventa;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 * SE LA ROBE A FARU xd QUE WEBA PROGRAMAR MIS PROPIAS VALIDACIONES, YA SE, ESTA MAL PEROE STE ES EL MUNDO REAL DONDE LAS PERSONAS SE COMEN UNAS POR OTRAS POR DINERO Y QUIEN SOY PARA DECIDIR QUE ESTA BION O MAL Y QUIEN ERES TU PARA JUSGARME , MEJOR CALLATE Y BESAME XD CUALQUIER PEDO SOY ALEXIS JAJAJA
 * @author JOSE
 * son las 2:14 y me doy cuenta que sus validaciones no cubren los casos que necesito... weno le tend4e que agregar despues
 */
public class TextFieldEvent {
    
    public void textKeyPress(KeyEvent evt, JTextField textField, int length){
        char car = evt.getKeyChar(); //Se almacena en car el carracter que involucra el evento 
        
        if((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') &&  //Se hace el flitro de los caracteres que seran consumidos
                (car != (char) KeyEvent.VK_BACK_SPACE) && (car != (char) KeyEvent.VK_SPACE)
                && (textField.getText().length()<=length)){
            evt.consume();
        }
    }
    
    public void valCorr(KeyEvent evt,JTextField textField,int length){
        char car = evt.getKeyChar();
        int estado=0;
        String inp=textField.getText();
        int longitud= inp.length() ;
        char c='*';

        if(longitud==0){
            estado=0;
        }else{
            c=inp.charAt(longitud-1);                                                                                                                                             // !#$%&'*+-/=?^_`{|}~                                                                        
            if(  (c >='0' && c <= '9') ||(c=='!') ||(c=='.') ||(c=='$') ||(c=='@') ||(c=='&')  ||(c=='+') ||(c=='-') ||(c=='/' ) ||(c=='=') ||(c=='_') ||(c=='|')    )
                estado=0;
            if( c =='@' ) estado=1;
            if( (c >='A' && c <= 'Z') || (c >='a' && c <= 'z')  ) estado=2;
            if( c =='.' ) estado=3;
        }
        
        if(  longitud > length-1 )
            evt.consume();
        
        //nombres
         switch(estado){
            case 0://espacio o inicio0 de caneda
                if( !(  (car >='A' && car <= 'Z') || (car >='a' && car <= 'z')  || (car >='0' && car <= '9') ||(car=='!') ||(car=='.') ||(car=='$') ||(car=='%') ||(car=='&')  ||(car=='@') ||(car=='-') ||(car=='/' ) ||(car=='=') ||(car=='?' ) ||(car=='_') ||(c=='@' )  ))
                    evt.consume();
                break;
            case 1://Resivi Mayus
                if(!( (car >='A' && car <= 'Z') || (car >='a' && car <= 'z') ||(car=='.')   ) ){
                     evt.consume();   
                }
                break;
            case 2://recivi miunuscula
                if(!( (car >='A' && car <= 'Z') || (car >='a' && car <= 'z') ) ){
                    evt.consume(); 
                }
                break;
          
        }
        
        
    }
    
    public void nameKeyPress(KeyEvent evt, JTextField textField, int length){
        char car = evt.getKeyChar();
        int estado=0;
        String inp=textField.getText();
        int longitud= inp.length() ;
        char c='*';

        if(longitud==0){
            estado=0;
        }else{
            c=inp.charAt(longitud-1);
            if( c >='A' && c <= 'Z' ) estado=1;
            if( c >='a' && c <= 'z' ) estado=2;
            if( c =='.' ) estado=3;
            if( c ==' ' ) estado=0;
        }
        
        if(  longitud > length-1 )
            evt.consume();
        
        //nombres
         switch(estado){
            case 0://espacio o inicio0 de caneda
                if(car < 'A' || car > 'Z')
                    evt.consume();
                break;
            case 1://Resivi Mayus
                if(car >='a' && car <= 'z' ){
                }
                else if( car =='.' ){
                    }else{  evt.consume();   }
                break;
            case 2://recivi miunuscula
                if(car =='.' ){
                }
                else if( car ==' ' ){
                    }else if(car >='a' && car <='z' ){
                    } else{ evt.consume(); }
                break;
            case 3://Resivo punto
                if(car ==' ' ){
                }else{evt.consume();}
                break;
            
        }
        
        
    }
    
     public void direciones(KeyEvent evt, JTextField textField, int length){
         char car = evt.getKeyChar();
        int estado=0;
        String inp=textField.getText();
        int longitud= inp.length() ;
        char c='*';

        if(longitud==0){
            estado=0;
        }else{
            c=inp.charAt(longitud-1);
            if( c >='A' && c <= 'Z' ) estado=1;
            if( c >='a' && c <= 'z' ) estado=2;
            if( c =='.' ) estado=3;
            if( c ==' ' ) estado=0;
            if( c >='0' && c <= '9' ) estado=2;
        }
        
        if(  longitud > length-1 )
            evt.consume();
        //direciones
         switch(estado){
            case 0://espacio o inicio0 de caneda
                
                if( (car >='0' && car <= '9')){
                    
                }
                else if(car < 'A' || car > 'Z')
                    evt.consume();
                  
                break;
            case 1://Resivi Mayus
                if(car >='a' && car <= 'z' ){
                }
                else if( car =='.' ){
                    }else{  evt.consume();   }
                break;
            case 2://recivi miunuscula
                if(car =='.' ){
                }
                else if( car ==' ' ){
                    }else if(car >='a' && car <='z' ){
                    } else{ evt.consume(); }
                break;
            case 3://Resivo punto
                if(car ==' ' ){
                }else{evt.consume();}
                break;
            
        }
        
     }
    
    public void name_numKeyPress(KeyEvent evt, JTextField textField, int length){
        char car = evt.getKeyChar();
        //Contition that allows to input data of text type
        
        if(((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && //Se filtran caracteres que se consumiran
                (car != (char) KeyEvent.VK_BACK_SPACE)              // Los métodos dot() y spaces() son especiales 
                && (car != (char) KeyEvent.VK_SPACE)                //Aparecen en la parte inferior de la clase
                && (car < '0' || car > '9')
                //&& (textField.getText().length()<=length) 
                && (textField.getText().contains("."))) || 
                (textField.getText().equals("")&& car == (char) KeyEvent.VK_SPACE )){
            evt.consume();
        }else if((((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && //Permite agregar un punto
                (car != (char) KeyEvent.VK_BACK_SPACE) 
                && (car != (char) KeyEvent.VK_SPACE)
                && (textField.getText().length()<=length) 
                && (car < '0' || car > '9')
                && car != '.') 
                ||(textField.getText().equals("")&& car == (char) KeyEvent.VK_SPACE )
                ||(textField.getText().equals("")&& car == '.' )
                || (spaces(textField) && car == (char) KeyEvent.VK_SPACE) )){
                evt.consume();
        }
    }
      
    public void text_numKeyPress(KeyEvent evt,JTextField textField,int length){
        char car = evt.getKeyChar();
        //Contition that allows to input data of text type
        if((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && 
                (car != (char) KeyEvent.VK_BACK_SPACE) && (car != (char) KeyEvent.VK_SPACE)
               && (car < '0' || car > '9') || (textField.getText().length()>length) ){
            evt.consume();
        }
    }
    
    //Este metodohecho a la mamda valida entradas d eletras mayusculas y minuscauals y numeros con solo unespacio 
    public void numLetEsp(KeyEvent evt,JTextField textField,int length){
        char car = evt.getKeyChar();
        //Contition that allows to input data of text type
        if((car < 'a' || car > 'z') && (car < 'A' || car > 'Z') && 
                (car != (char) KeyEvent.VK_BACK_SPACE) && (car != (char) KeyEvent.VK_SPACE)
               && (car < '0' || car > '9') || (textField.getText().length()>length) ){
            evt.consume();
        }
        if(textField.getText().length()>length)
            evt.consume();
        
        if(textField.getText().length()>1 )
            if(  ((car+"").equals(" ")) && (textField.getText().charAt( textField.getText().length()-1 )+"").equals(" ") ){
                 evt.consume();
            }
        
    }
    
     //Este metodohecho a la mamda valida entradas d eletras mayusculas y minuscauals y numeros con solo unespacio 
    public void letNum(KeyEvent evt,JTextField textField,int length){
        char car = evt.getKeyChar();
        //Contition that allows to input data of text type
        if((car < 'a' || car > 'g') && (car < 'A' || car > 'G') && 
                (car != (char) KeyEvent.VK_BACK_SPACE) 
               && (car < '0' || car > '9') || (textField.getText().length()>length) ){
            evt.consume();
        }
        if(textField.getText().length()>length)
            evt.consume();
        
    }
    
    
    
    public void numberKeyPress (KeyEvent evt, JTextField textField, int length) {
        //Declaramos una variable y le asignamos un evento
        char car = evt.getKeyChar();
        if(  (textField.getText()+"").length() > length-1 )
            evt.consume(); 
        //Condicion que nos permite ingresar datos numéricos con su punto
        if((car< '0' || car > '9')&&(car != (char) KeyEvent.VK_BACK_SPACE) || textField.getText().length()>=length){
            evt.consume();
        }  
    }
    public void numberDecimalKeyPress(KeyEvent evt, JTextField textField ){
        char car = evt.getKeyChar();
        
        if((car < '0' || car > '9') && textField.getText().contains(".")
                && (car != (char) KeyEvent.VK_BACK_SPACE)){
                evt.consume();
        } else if ((car < '0' || car > '9') && (car != '.') && (car != (char) KeyEvent.VK_BACK_SPACE)){
                    evt.consume();         
        }
    }
    
    public boolean spaces( JTextField textField){
        String word = textField.getText();
        if(word.equals(""))
            return false;
        char last = word.charAt(word.length()-1);
        return last == (char)32;
    }
    
    public boolean dot( JTextField textField){
        String word = textField.getText();
        if(word.equals(""))
            return false;
        char last = word.charAt(word.length()-1);
        return last == (char)46;
    }
    
}
