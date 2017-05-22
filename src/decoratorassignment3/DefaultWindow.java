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
public class DefaultWindow implements IWindow{

    @Override
    public String Paint() {
        return "Pencereye ";
    }
    
}
