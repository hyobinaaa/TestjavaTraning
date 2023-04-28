package javatest;

public class Car {
    String color; // 자동차 색상
    int speed; // 자동차 스피드
    int gear; // 자동차 기어

    @Override
    public String toString(){
        return "Car [color = " + color + " , speed = " + speed + " , gear=" + gear + "]";

    }

    void chaangegear(int g){
        gear = g;
    }

    void speedUp(){
        speed = speed + 10;
    }
    void speedDown(){
        speed = speed - 10;
    }
}
