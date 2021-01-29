package com.android.designpattern23;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.android.designpattern23.Builder.Director;
import com.android.designpattern23.Builder.HTMLBuilder;
import com.android.designpattern23.Builder.TextBuilder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // テキスト作成
        TextBuilder textbuilder = new TextBuilder();
        Director directorT = new Director(textbuilder);
        directorT.construct();
        String result = textbuilder.getResult();
        System.out.println(result);

        // HTML作成
//        HTMLBuilder htmlbuilder = new HTMLBuilder();
//        Director directorH = new Director(htmlbuilder);
//        directorH.construct();
//        String filename = htmlbuilder.getResult();
//        System.out.println(filename + "が作成されました");
    }
}
