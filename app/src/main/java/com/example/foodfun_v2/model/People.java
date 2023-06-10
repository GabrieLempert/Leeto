package com.example.foodfun_v2.model;



public class People {
    private String name;
    private final boolean isUser;
    private final String id;

    public People(String name,boolean isUser,String id){
        this.name=name;
        this.id=id;
        this.isUser=isUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isUser() {
        return isUser;
    }


    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof People)) return false;
        return ((People) o).id.equals( this.id);
    }


}
