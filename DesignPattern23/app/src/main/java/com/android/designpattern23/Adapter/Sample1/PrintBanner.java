package com.android.designpattern23.Adapter.Sample1;

// アダプター役 Banner（アダプティー）をチューニングしてる
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
