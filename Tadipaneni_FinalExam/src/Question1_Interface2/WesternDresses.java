/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1_Interface2;

/**
 *
 * @author Tadipaneni Vyshnavi
 */
public class WesternDresses implements Dresses {

    public int getCost() {
        return 2000;
    }

    @Override
    public String getSize() {
        return "S";
    }

}
