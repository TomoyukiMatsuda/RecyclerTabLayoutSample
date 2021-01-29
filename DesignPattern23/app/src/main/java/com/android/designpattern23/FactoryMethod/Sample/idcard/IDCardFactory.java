package com.android.designpattern23.FactoryMethod.Sample.idcard;

import com.android.designpattern23.FactoryMethod.Sample.framework.Factory;
import com.android.designpattern23.FactoryMethod.Sample.framework.Product;

import java.util.HashMap;

public class IDCardFactory extends Factory {
    private HashMap database = new HashMap();
    private int serial = 100;

    // synchronized マルチスレッドで複数の重複した実装にならないようにするもの
    @Override
    protected synchronized Product createProduct(String owner) {
         return new IDCard(owner, serial++);
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard card = (IDCard) product;
        database.put(new Integer(card.getSerial()), card.getOwner());
    }

    public HashMap getDatabase() {
        return database;
    }
}
