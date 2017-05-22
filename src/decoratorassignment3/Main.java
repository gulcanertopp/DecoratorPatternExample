/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorassignment3;

/**
 *
 * @author gulcanertop
 */
public class Main {

    public static void main(String[] args) {
      IWindow window = new DefaultWindow();
      
      IWindow vscroll = (new WFrame(new WBackgrounImg(new WVScrollBar(new WHScrollBar(new WShadow(window))))));
        System.out.println(vscroll.Paint());
    }
    
    
}
