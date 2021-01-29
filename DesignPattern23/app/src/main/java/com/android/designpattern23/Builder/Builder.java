package com.android.designpattern23.Builder;

// 抽象クラスはインスタンス化できない（抽象のため具体的なインスタンスを持てない）
public interface Builder {
    // タイトル作成
    public abstract void makeTitle(String title);
    // 文字列作成
    public abstract void makeString(String str);
    // 箇条書き作成
    public abstract void makeItems(String[] items);
    // 文書を完成
    public abstract void close();
}
