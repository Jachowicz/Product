package com.company;


public class Product {
    private String name;
    private String description;
    private String specification;

    Product (String name,String description){
        this.name = name;
        this.description = description;
        this.specification = "specification default";
    }
    public String getName (){
        return this.name;
    }
    public String getDescription (){
        return this.description;
    }

    @Override
    public String toString() {
        return "Product {" + "\n name : " + getName() + "\n description : " + getDescription() + " \n} ";
    }
}
