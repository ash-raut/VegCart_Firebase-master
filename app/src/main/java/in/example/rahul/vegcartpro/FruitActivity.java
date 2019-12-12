package in.example.rahul.vegcartpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;

import in.example.rahul.vegcartpro.activity.HomeActivity;
import in.example.rahul.vegcartpro.activity.ProductActivity;

public class FruitActivity extends AppCompatActivity {
    ImageView Bachkbutton;
    CardView myfruit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);

        myfruit=findViewById(R.id.myfruit);
        myfruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FruitActivity.this, ProductActivity.class);
                startActivity(intent);
            }
        });

        Bachkbutton=findViewById(R.id.backbutton);
        Bachkbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FruitActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

    }

}
