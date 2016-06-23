package com.softserve.starwars.Service;

public class Category<T> {

    private T t;

    public Category(T t){
        this.t = t;
    }

    public T getValue(){
        return t;
    }
}
