/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ducks;

/**
 *
 * @author Peter
 */
public class Quack implements QuackBehavior
{
    public void quack()
    {
        System.out.println("Quack");
    }
}
