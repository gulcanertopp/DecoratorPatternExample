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
public class WBackgrounImg extends WindowDecorator{
    IWindow window;
    public WBackgrounImg(IWindow window) {
        super(window);
    }

    @Override
    public String Paint() {
        return super.Paint()+ ", Arkaplan Resmi Eklendi"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
