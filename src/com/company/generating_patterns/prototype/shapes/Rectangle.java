package com.company.generating_patterns.prototype.shapes;

public class Rectangle extends Shape {
    public int height;
    public int width;

    public Rectangle() {
    }

    public Rectangle(Rectangle target){
        super(target);
        if(target != null){
            height = target.height;
            width = target.width;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Rectangle) || !super.equals(o)) return false;
        Rectangle shape2 = (Rectangle) o;
        return shape2.width == width && shape2.height == height;
    }
}