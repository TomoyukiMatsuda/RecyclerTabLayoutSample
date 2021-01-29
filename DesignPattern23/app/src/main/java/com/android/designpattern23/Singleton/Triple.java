package com.android.designpattern23.Singleton;

public class Triple {
    private int id;
    private static Triple[] triple = new Triple[] {
            new Triple(1),
            new Triple(2),
            new Triple(3),
    };

    // private なコンストラクタ
    private Triple(int id) {
        System.out.println("インスタンスid: " + id);
        this.id = id;
    }

    // クラス内のこのメソッドのみでインスタンスを取得できる
    public static Triple getInstance(int id) {
        return triple[id];
    }

    public String toString() {
        return "インスタンスのid: " + id;
    }
}
