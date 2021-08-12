/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio4;
/**
 *
 * @author olste
 */
public class Laboratorio4 {

    /**
     * @param args the command line arguments
     */
    
    static String no_cheque(int num){
        if(num < 100){
            return "0"+Integer.toString(num);
        }
        else if(num < 10){
            return "00"+Integer.toString(num);
        }
        else
        {
            return Integer.toString(num);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int random_num = (int)(Math.random()*500);
        
        Cheque ch = new Cheque();
        ch.jTextField3.setText(no_cheque(random_num));
        ch.setVisible(true);
    }
    
}
