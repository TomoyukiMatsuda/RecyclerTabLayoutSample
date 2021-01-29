package com.android.designpattern23.Singleton;

public class TicketMaker {
    private int ticket = 100;
    // Singletonクラスのインスタンスで初期化している、この初期化はSingletonクラスのロード時に一度だけ行われる
    private static TicketMaker singleton = new TicketMaker();

    // privateのコンストラクタを作成してクラス外からの new （コンストラクタの呼び出し）を禁止している
    private TicketMaker() {}

    public static TicketMaker getInstance() {
        return singleton;
    }

    public synchronized int getNextTicketNumber() {
        return ticket++;
    }
}
