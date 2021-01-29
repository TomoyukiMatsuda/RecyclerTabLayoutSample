package com.android.designpattern23.FactoryMethod.Sample.idcard;

import com.android.designpattern23.FactoryMethod.Sample.framework.Product;

public class IDCard extends Product {
    private String owner;
    private int serial;

    // publicのついていないコンストラクタ
    // 同一package内からしかインスタンス生成できない仕様となる
    // 今回のが場合はIDCardFactoryクラス内でしかIDCardインスタンスを生成することはできない
    IDCard(String owner, int serial) {
        System.out.println(owner + "(" + serial + ")" + "のカードを作ります");
        this.owner = owner;
        this.serial = serial;
    }

    @Override
    public void use() {
        System.out.println(owner + "(" + serial + ")" + "のカードを使います");
    }

    public String getOwner() {
        return owner;
    }

    public int getSerial() {
        return serial;
    }
}
