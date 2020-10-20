package com.example.leecode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import DesignPatterns.DynamicProxy;
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
                //静态工厂d调用测试
                FactoryShape factoryShape = new FactoryShape();
                Shape circle  =  factoryShape.getShape("CIRCLE");
                circle.draw();;
                Shape square =   factoryShape.getShape("SQUARE");
                square.draw();
            }
        });


    }
}
