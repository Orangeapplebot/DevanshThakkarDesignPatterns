package net.media.training.designpattern.abstractfactory;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 6:34:34 PM
 * To change this template use File | Settings | File Templates.
 */

/**
 * Android- case, motherboard, processor, screen
 * Iphone- case, motherboard, processor, screen
 * Others- Case, motherboard, processor, screen, Battery, PhoneMaker
 *
 * Case- Takes MotherBoard. Methods-attach MotherBoard, Screen; get screen, motherb, pro, bat
 * MotherBoard- attach battery, pro; get state, pro, battery
 * PhoneMaker- Takes phoneType returns Case, makes motherboard
 * Processor, Screen- null
 *
 * Android, Iphone- null
 * */


public interface PhoneMaker {


    public Case buildPhone(String phoneType) {}

}
