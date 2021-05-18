/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blooddonation;

/**
 *
 * @author Zaryab
 */
public class SplashScreen {
    
    public static void main(String[] args){
     Splash splash =new Splash();
    splash.setVisible(true);
    try{
        for(int i=0; i<=100; i++){
            Thread.sleep(100);
            splash.loadingnum.setText(Integer.toString(i)+"%");
            splash.loadingbar.setValue(i);
            if(i==100){
                splash.setVisible(false);
                new Login().setVisible(true);
            }
        }
    }
    catch(Exception e){
        System.out.println("error " + e);   
    }
    
    }
    
}
