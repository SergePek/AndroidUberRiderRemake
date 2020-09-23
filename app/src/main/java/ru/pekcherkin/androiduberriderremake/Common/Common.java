package ru.pekcherkin.androiduberriderremake.Common;

import ru.pekcherkin.androiduberriderremake.Model.RiderModel;

public class Common {

    public static final String RIDER_INFO_REFERENCE = "Riders";
    public static RiderModel currentRider;

    public static String builderWelcomeMessage() {
        if(Common.currentRider != null){
            return new StringBuilder("Добро пожаловать")
                    .append(Common.currentRider.getFirstName())
                    .append(" ")
                    .append(Common.currentRider.getLastName()).toString();
        } else return "";
    }
}
