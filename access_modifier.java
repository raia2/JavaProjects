package com.company;
class myEmployee{
   private int id;
    private String name;

    public void setName(String n){
        name=n;
    }

    public String getName() {
        return name;
    }
    public void setId(int i){
        id=i;
    }

    public int getId() {
        return id;
    }
}
public class access_modifier {
    public static void main(String[] args) {
        myEmployee name=new myEmployee();
//        name.id=45;
        name.setName("Akansha");
//        System.out.println(name.id);
        System.out.println(name.getName());
    }
}
