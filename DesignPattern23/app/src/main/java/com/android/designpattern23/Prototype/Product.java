package com.android.designpattern23.Prototype;

public interface Product extends Cloneable {

    public abstract void use(String s);
    // インスタンスを複製するクラス
    public abstract Product createClone();
}
