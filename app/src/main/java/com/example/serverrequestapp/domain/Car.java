package com.example.serverrequestapp.domain;

import java.util.Objects;

public class Car {

    private String mark;


    private int cost;

    public String getMark() {
        return mark;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cost == car.cost && Objects.equals(mark, car.mark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mark, cost);
    }

    public Car(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", cost=" + cost +
                '}';
    }
}
