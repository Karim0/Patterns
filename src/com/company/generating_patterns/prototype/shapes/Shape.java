package com.company.generating_patterns.prototype.shapes;

import java.util.Objects;

public abstract class Shape {
    public int x;
    public int y;
    public String color;

    public Shape(){}

    public Shape(Shape target){
        if(target != null){
            x = target.x;
            y = target.y;
            color = target.color;
        }
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object o){
        if (!(o instanceof Shape)) return false;
        Shape shape2 = (Shape) o;
        return shape2.x == x && shape2.y == y && Objects.equals(shape2.color, color);

    }
}
