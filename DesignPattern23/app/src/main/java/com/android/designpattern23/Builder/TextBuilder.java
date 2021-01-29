package com.android.designpattern23.Builder;

public class TextBuilder implements Builder {
    // privateフィールド
    private StringBuffer buffer = new StringBuffer();

    // 親クラスの抽象メソッドを実装
    @Override
    public void makeTitle(String title) {
        buffer.append("==========================\n");
        buffer.append("「" + title + "」¥n");
        buffer.append("¥n");
    }

    @Override
    public void makeString(String str) {
        buffer.append('■' + str + "¥n");
        buffer.append("¥n");
    }

    @Override
    public void makeItems(String[] items) {
        for (int i = 0; i < items.length ; i++) {
            buffer.append(" ・" + items[i] + "¥n");
        }
        buffer.append("¥n");
    }

    @Override
    public void close() {
        buffer.append("==========================\n");
    }

    // privateフィールドbufferのgetter
    // StringBuffer型をString型に変換してから返してる
    public String getResult() {
        return buffer.toString();
    }
}
