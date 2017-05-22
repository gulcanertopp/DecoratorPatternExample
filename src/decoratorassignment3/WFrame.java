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
public class WFrame extends WindowDecorator{
    public WFrame(IWindow window){
    super(window);
}
    @Override
   public String Paint(){
   return super.Paint() + ", Çerçeve Eklendi ";
   } 
    
}
