package net.media.training.designpattern.abstractfactory;

public class AndroidMaker implements PhoneMaker{

    public Case buildPhone() {
        motherBoard = new AndroidMaker();
        motherBoard.attachBattery(new Battery());
        motherBoard.attachProcessor(new AndroidProcessor());
        Screen screen = new AndroidScreen();
        Case phoneCase = new AndroidCase();
        phoneCase.attachMotherBoard(motherBoard);
        phoneCase.attachScreen(screen);
        return phoneCase;
    }
}