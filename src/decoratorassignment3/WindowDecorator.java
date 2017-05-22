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
public class WindowDecorator implements IWindow{
    private IWindow window;
    public WindowDecorator(IWindow window){
    this.window=window;
    }
    

    @Override
    public String Paint() {
       return window.Paint();
    }
}
