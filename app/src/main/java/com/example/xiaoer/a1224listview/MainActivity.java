package com.example.xiaoer.a1224listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

   // private String[] data = {"布丁","水蜜桃","松仁玉米","虾仁炒西芹","烤全羊","红烧肉","糖醋排骨","红蘑炖鸡","辣白菜小浣熊","脆皮烤鸭","双皮奶","油焖大虾","北京烤鸭","巧克力蛋糕","小乔旋转寿司","水煮白菜","凉皮"};

    private List<Fruit> fruitList = new ArrayList<>();
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.Button_1);

        initFruits(); //初始化水果数据

        final FruitAdapter adapter = new FruitAdapter(MainActivity.this,R.layout.fruit_item,fruitList);
        final ListView listView = (ListView) findViewById(R.id.lv);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listView.setAdapter(adapter) ;
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit = fruitList.get(position);
                Toast.makeText(MainActivity.this,fruit.getName(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initFruits() {
        Fruit fruit = new Fruit("布丁",R.drawable.aa);
        fruitList.add(fruit);
        Fruit fruit1 = new Fruit("桃",R.drawable.bb);
        fruitList.add(fruit1);
        Fruit fruit2 = new Fruit("饼干",R.drawable.cc);
        fruitList.add(fruit2);
        Fruit fruit3 = new Fruit("大虾",R.drawable.dd);
        fruitList.add(fruit3);
        Fruit fruit4 = new Fruit("烤鸭",R.drawable.ee);
        fruitList.add(fruit4);
        Fruit fruit5 = new Fruit("烤鸡",R.drawable.ff);
        fruitList.add(fruit5);
        Fruit fruit6 = new Fruit("荔枝",R.drawable.gg);
        fruitList.add(fruit6);
        Fruit fruit7 = new Fruit("蜂蜜",R.drawable.hh);
        fruitList.add(fruit7);
        Fruit fruit8 = new Fruit("大眼睛",R.drawable.ii);
        fruitList.add(fruit8);
        Fruit fruit9 = new Fruit("百醇",R.drawable.jj);
        fruitList.add(fruit9);
    }
}