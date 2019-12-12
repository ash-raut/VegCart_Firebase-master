package in.example.rahul.vegcartpro.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import in.example.rahul.vegcartpro.PaymentActivity;
import in.example.rahul.vegcartpro.R;

public class ShipmentActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shipment);
        button=findViewById(R.id.next_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ShipmentActivity.this, PaymentActivity.class);
                startActivity(intent);
            }
        });
    }
}
