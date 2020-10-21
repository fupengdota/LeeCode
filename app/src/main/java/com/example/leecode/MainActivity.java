package com.example.leecode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import DesignPatterns.DynamicProxy;
import DesignPatterns.Factory.AbstractFactory;
import DesignPatterns.Factory.Color;
import DesignPatterns.Factory.FactoryColor;
import DesignPatterns.Factory.FactoryShape;
import DesignPatterns.Factory.Shape;

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
                //工厂d调用测试
//                FactoryShape factoryShape = new FactoryShape();
//                Shape circle  =  factoryShape.getShape("CIRCLE");
//                circle.draw();;
//                Shape square =   factoryShape.getShape("SQUARE");
//                square.draw();
                //抽象工厂调用测试
                AbstractFactory factoryShape = new FactoryShape();
                AbstractFactory factoryCorlor = new FactoryColor();
                Shape circle  =  factoryShape.getShape("CIRCLE");
                circle.draw();;
                Shape square =   factoryShape.getShape("SQUARE");
                square.draw();
                Color green = factoryCorlor.getCorlor("green");
                Color blue = factoryCorlor.getCorlor("blue");
                green.fill();
                blue.fill();


            }
        });


    }
}
