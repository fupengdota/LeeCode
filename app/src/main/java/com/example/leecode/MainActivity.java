package com.example.leecode;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import designpatterns.abstractfactory.AbstractFactory;
import designpatterns.abstractfactory.FactoryProducer;
import designpatterns.factory.Shape;
import designpatterns.factory.ShapeFactory;

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

                AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
                shapeFactory.getShape("rectangle").draw();
                AbstractFactory corcleFactory = FactoryProducer.getFactory("corlor");
                corcleFactory.getCorlor("red").fill();
            }
        });


    }
}
