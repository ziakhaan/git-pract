package com.sp.training.adapter;

public class GeoMetricShapeAdapter implements Shape {

    GeoMetricShape geoMetricShape;


    public GeoMetricShapeAdapter(GeoMetricShape geoMetricShape) {
        this.geoMetricShape = geoMetricShape;
    }



    @Override
    public void draw() {
        geoMetricShape.drawShape();
    }

    @Override
    public void resize() {

    }

    @Override
    public String description() {
        return null;
    }

    @Override
    public boolean isHide() {
        return false;
    }
}
