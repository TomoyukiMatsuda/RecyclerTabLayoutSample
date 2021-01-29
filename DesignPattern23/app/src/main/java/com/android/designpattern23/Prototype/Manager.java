package com.android.designpattern23.Prototype;

import java.util.HashMap;

public class Manager {
    private HashMap showcase = new HashMap<>();

    // showcaseに登録するメソッド
    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    // インスタンスを複製するインスタンスメソッド
    // クラスからインスタンスを複製するのではなくあくまでもインスタンスから新しいインスタンスを作るメソッド
    public Product create(String protoname) {
        Product product = (Product) showcase.get(protoname);
        return product.createClone();
    }
}
