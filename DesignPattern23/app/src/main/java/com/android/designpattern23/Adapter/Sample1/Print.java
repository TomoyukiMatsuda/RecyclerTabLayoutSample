package com.android.designpattern23.Adapter.Sample1;

// ターゲット役
public interface Print {
    // public abstract void printWeak();
    // public abstract void printStrong();

    // 本来上記のようになっているが「public abstract」が省略されている
    void printWeak();
    void printStrong();
}
