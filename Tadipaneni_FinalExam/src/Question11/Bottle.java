/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11;

import java.util.Objects;

/**
 * creating a class using variables,methods and constructor.
 *
 * @author Tadipaneni Vyshnavi
 */
public class Bottle {

    //Initializing variable using datatype and access modifier.
    private String color;
    //Initializing variable using datatype and access modifier.
    private String type;

    /**
     * Creating constructor with arguments.
     *
     * @param color
     * @param type
     */
    public Bottle(String color, String type) {
        this.color = color;
        this.type = type;
    }

    /**
     * creating a method to get color.
     *
     * @return
     */
    public String getColor() {
        return color;
    }

    /**
     * creating a method to get type of a bottle.
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * creating a method to get hashCode values.
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.color);
        hash = 67 * hash + Objects.hashCode(this.type);
        return hash;
    }

    /**
     * creating a method to get equals method.
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Bottle other = (Bottle) obj;
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return true;
    }

}
