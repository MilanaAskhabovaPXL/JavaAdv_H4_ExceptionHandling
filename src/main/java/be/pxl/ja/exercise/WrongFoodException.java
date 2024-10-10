package be.pxl.ja.exercise;

public class WrongFoodException extends RuntimeException{ //unchecked exception, mag kiezen afhandlen of niet


    public WrongFoodException(String message) {
        super(message);
    }

}
