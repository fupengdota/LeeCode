package com.example.leecode;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import designpatterns.bridge.Circle;
import designpatterns.bridge.Rectangle;
import designpatterns.bridge.Red;
import designpatterns.bridge.Shape;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                //动态代理调用
//                DynamicProxy dynamicProxy = new DynamicProxy();
//                dynamicProxy.call();
//                ShapeFactory shapeFactory = new ShapeFactory();
//                Shape circle = shapeFactory.getShape("circle");
//                circle.draw();

//                AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
//                shapeFactory.getShape("rectangle").draw();
//                AbstractFactory corcleFactory = FactoryProducer.getFactory("corlor");
//                corcleFactory.getCorlor("red").fill();
//
//                Builder builder = new MacBookBuilder();
//                Directory directory = new Directory(builder);
//                directory.construct("微星主板","htc显示器 ");
//                System.out.println(builder.builder().toString());

//                AudioPlay audioPlay = new AudioPlayImpl();
//                audioPlay.play("vcl");
//                audioPlay.play("mp3");
//                audioPlay.play("mp4");

                Shape shape = new Circle();
                shape.setColor(new Red());
                shape.draw();

                Shape shape1 = new Rectangle();
                shape1.setColor(new Red());
                shape1.draw();
            }
        });


    }
}
