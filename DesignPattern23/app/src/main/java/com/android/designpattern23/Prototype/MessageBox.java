package com.android.designpattern23.Prototype;

public class MessageBox implements Product {
    private char decochar;

    // コンストラクタ
    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    // 生成した文字列表示メソッド？
    @Override
    public void use(String s) {
        int length = s.getBytes().length;

        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println("");
        System.out.println(decochar + " " + s + " " + decochar);

        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.print("");
    }

    // 複製を作成するメソッド
    @Override
    public Product createClone() {
        Product product = null;

        try {
            product = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return product;
    }
}
