package hbcu.stay.ready.baronsfarm.classes;

import java.util.LinkedList;

public class Farm {
    Object crop;
    String cropRow;
    boolean fertilize;
//ArrayList<String>stable1List;

    LinkedList<String> stable1List;
    LinkedList<String> stable2List;
    LinkedList<String> stable3List;

    LinkedList<String> chickenCoop1List;
    LinkedList<String> chickenCoop2List;
    LinkedList<String> chickenCoop3List;
    LinkedList<String> chickenCoop4List;

    LinkedList<String>fieldList;

    LinkedList<String>farmHouse1List;
    LinkedList<String>farmHouse2List;

    public Farm(){
        stable1List = new LinkedList<String>();
        stable2List = new LinkedList<String>();
        stable3List = new LinkedList<String>();

        chickenCoop1List = new LinkedList<String>();
        chickenCoop2List = new LinkedList<String>();
        chickenCoop3List = new LinkedList<String>();
        chickenCoop4List =new LinkedList<String>();

        fieldList = new LinkedList<String>();

        farmHouse1List = new LinkedList<String>();
        farmHouse2List = new LinkedList<String>();

        stable1List.addFirst("Horse1");
        stable1List.add(1, "Horse2");
        stable1List.addLast("Horse3");

        stable2List.addFirst("Horse4");
        stable2List.add(1,"Horse5");
        stable2List.addLast("Horse6");

        stable3List.add(0, "Horse7");
        stable3List.add(1,"Horse8");
        stable3List.add(2,"Horse9");
        stable3List.add(3, "Horse10");


        chickenCoop1List.add(0,"Chicken1");
        chickenCoop1List.add(1,"Chicken2");
        chickenCoop1List.add(2,"Chicken3");
        chickenCoop1List.add(3,"Chicken4");

        chickenCoop2List.add(0,"Chicken1");
        chickenCoop2List.add(1,"Chicken2");
        chickenCoop2List.add(2,"Chicken3");
        chickenCoop2List.add(3,"Chicken4");

        chickenCoop3List.add(0,"Chicken1");
        chickenCoop3List.add(1,"Chicken2");
        chickenCoop3List.add(2,"Chicken3");
        chickenCoop3List.add(3,"Chicken4");

        chickenCoop4List.add(0,"Chicken1");
        chickenCoop4List.add(1,"Chicken2");
        chickenCoop4List.add(2,"Chicken3");

        fieldList.add(cropRow);
        fieldList.add(cropRow);
        fieldList.add(cropRow);
        fieldList.add(cropRow);
        fieldList.add(cropRow);

        farmHouse1List.add("Barron");
        farmHouse2List.add("Barroness");
    }

    public Farm(String cropRow, Object crop) {
        this.cropRow = "Five cropRows of Baron's Farm";
        this.crop = crop;
    }

    public LinkedList<String> getStable1List() {
        return stable1List;
    }

    public LinkedList<String> setStable1List(LinkedList<String> stable1List) {
        this.stable1List = stable1List;
        return stable1List;
    }

    public LinkedList<String> getChickenCoop1List() {
        return chickenCoop1List;
    }

    public void setChickenCoop1List(LinkedList<String> chickenCoop1List) {
        this.chickenCoop1List = chickenCoop1List;
    }

    public LinkedList<String> getFarmHouse1List() {
        return farmHouse1List;
    }

    public void setFarmHouse1List(LinkedList<String> farmHouse1List) {
        this.farmHouse1List = farmHouse1List;
    }

    public Object cropRow() {
        return cropRow.toString();
    }

    public String toString(Object cropRow) {
        return "Five cropRows of Baron's Farm";
    }

    //    public void setFertilize(boolean fertilize) {
//        this.fertilize = fertilize;
//    }
//
//    public void setCrop(Object crop) {
//        this.crop = crop;
//    }
//
//    public LinkedList<String> getChickenCoop1List() {
//        return chickenCoop1List;
//    }
//
//    public void setChickenCoop1List(LinkedList<String> chickenCoop1List) {
//        this.chickenCoop1List = chickenCoop1List;
//    }
//
//    public LinkedList<String> getChickenCoop2List() {
//        return chickenCoop2List;
//    }
//    public void setChickenCoop2List(LinkedList<String> chickenCoop2List) {
//        this.chickenCoop2List = chickenCoop2List;
//    }
//
//    public LinkedList<String> getStable1List() {
//        return stable1List;
//    }
//
//    public LinkedList<String> setStable1List() {
//        this.stable1List = stable1List;
//        return stable1List;
//    }
//
//    public LinkedList<String> getStable2List() {
//        return stable2List;
//    }
//
//    public LinkedList<String> setStable2List() {
//        this.stable2List = stable2List;
//        return stable2List;
//    }
//
//    public LinkedList<String> getStable3List() {
//        return stable3List;
//    }
//
//    public LinkedList<String> setStable3List() {
//        this.stable3List = stable3List;
//        return stable3List;
//    }
//
//    public LinkedList<String> getChickenCoop3List() {
//        return chickenCoop3List;
//    }
//
//    public void setChickenCoop3List(LinkedList<String> chickenCoop3List) {
//        this.chickenCoop3List = chickenCoop3List;
//    }
//
//    public LinkedList<String> getChickenCoop4List() {
//        return chickenCoop4List;
//    }
//
//    public void setChickenCoop4List(LinkedList<String> chickenCoop4List) {
//        this.chickenCoop4List = chickenCoop4List;
//    }
//
//    public String getFieldList() {
//        return cropRow;
//    }
//
//    public void setFieldList(LinkedList<String> fieldList) {
//        this.fieldList = fieldList;
//    }
//
//    public LinkedList<String> getFarmHouse1List() {
//        return farmHouse1List;
//    }
//
//    public void setFarmHouse1List(LinkedList<String> farmHouse1List) {
//        this.farmHouse1List = farmHouse1List;
//    }
//
//    public LinkedList<String> getFarmHouse2List() {
//        return farmHouse2List;
//    }
//
//    public void setFarmHouse2List(LinkedList<String> farmHouse2List) {
//        this.farmHouse2List = farmHouse2List;
//    }
//
//    public ArrayList<Format.Field> fieldList() {
//        return fieldList();
//    }
//
  public boolean operate() {
        return false;
    }

    public LinkedList<String> stable1List() {
        return stable1List;
    }
}
