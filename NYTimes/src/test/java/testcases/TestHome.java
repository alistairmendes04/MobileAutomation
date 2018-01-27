package testcases;

import homePage.Home;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestHome extends Home {
    Home home;
    @BeforeMethod
    public void intitilization() {
        home = PageFactory.initElements(ad, Home.class);
    }
    @Test
    public void testAccessibility() {
        home.setAccessibility();
    }
    @Test
    public void testPushNot() {
        home.setAccessibility();
        home.setPushNot();
    }
    @Test
    public void testVideo() {
        home.setAccessibility();
        home.setPushNot();
        home.setVideo();
    }
    @Test
    public void testMyNews() {
        home.setAccessibility();
        home.setPushNot();
        home.setMyNews();
    }
    @Test
    public void testPopular() {
        home.setAccessibility();
        home.setPushNot();
        home.setPopular();
    }
    @Test
    public void testlive() {
        home.setAccessibility();
        home.setPushNot();
        home.setLive();
    }
    @Test
    public void testDropDown(){
        home.setAccessibility();
        home.setPushNot();
        home.setDropDown();
    }
    @Test
    public void testAfrica(){
        home.setAccessibility();
        home.setPushNot();
        home.setDropDown();
        home.setAfrica();
    }
    @Test
    public void testAsia(){
        home.setAccessibility();
        home.setPushNot();
        home.setDropDown();
        home.setAsia();
    }
    @Test
    public void testAustralia(){
        home.setAccessibility();
        home.setPushNot();
        home.setDropDown();
        home.setAustralia();
    }
    @Test
    public void testEurope(){
        home.setAccessibility();
        home.setPushNot();
        home.setDropDown();
        home.setEurope();
    }
    @Test
    public void testMiddleEast(){
        home.setAccessibility();
        home.setPushNot();
        home.setDropDown();
        home.setMiddleEast();
    }
    @Test
    public void testLatinAmerica(){
        home.setAccessibility();
        home.setPushNot();
        home.setDropDown();
        home.setLatinAmerica();
    }
    @Test
    public void testUK(){
        home.setAccessibility();
        home.setPushNot();
        home.setDropDown();
        home.setUk();
    }
    @Test
    public void testUSandCanada(){
        home.setAccessibility();
        home.setPushNot();
        home.setDropDown();
        home.setUsAndCanada();
    }
    @Test
    public void testParadicePaper(){
        home.setAccessibility();
        home.setPushNot();
        home.setDropDown();
        home.setParadisePaper();
    }
    @Test
    public void testTech(){
        home.setAccessibility();
        home.setPushNot();
        home.setDropDown();
        home.setTech();
    }
    @Test
    public void testScience(){
        home.setAccessibility();
        home.setPushNot();
        home.setDropDown();
        home.setScience();
    }
    @Test
    public void testHealth(){
        home.setAccessibility();
        home.setPushNot();
        home.setDropDown();
        home.setHealth();
    }
    @Test
    public void testEntertainment(){
        home.setAccessibility();
        home.setPushNot();
        home.setDropDown();
        home.setEntertainment();
    }
    @Test
    public void testStories(){
        home.setAccessibility();
        home.setPushNot();
        home.setDropDown();
        home.setStories();
    }
    @Test
    public void testSports(){
        home.setAccessibility();
        home.setPushNot();
        home.setDropDown();
        home.setSports();
    }
    @Test
    public void testFootball(){
        home.setAccessibility();
        home.setPushNot();
        home.setDropDown();
        home.setFootball();
    }
    @Test
    public void testFormula1(){
        home.setAccessibility();
        home.setPushNot();
        home.setDropDown();
        home.setFormula1();
    }
}