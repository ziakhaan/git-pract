package com.sp.training.adapter;

public class ShapeMain {


    public static void main(String[] args) {

        Shape shapeAdapter=new GeoMetricShapeAdapter(new TriangleGeo());

        shapeAdapter.draw();


    }
}
