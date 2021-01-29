package com.android.designpattern23.Builder;

public class Director {
    // privateフィールド
    private Builder builder;

    // コンストラクタ 実際にはBuilderのサブクラスのインスタンスが引数に入る
    // Builderは抽象クラスのためインスタンス化できないため
    public Director(Builder builder) {
        this.builder = builder;
    }

    // Builder抽象クラスのメソッドを利用しているが、
    // 実装はどうなっているかは親からはわからない（見えない）
    public void construct() {
        builder.makeTitle("タイトル：Greeting");
        builder.makeString("朝から昼にかけて");
        builder.makeItems(new String[] {
                "おはよう！",
                "こんにちは！！"
        });
        builder.makeString("夜は");
        builder.makeItems(new String[] {
                "こんばんは！！",
                "おやすみ！！",
                "さよなら!!"
        });
        builder.close();
    }
}
