package in.example.rahul.vegcartpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import in.example.rahul.vegcartpro.activity.HomeActivity;
import in.example.rahul.vegcartpro.activity.PDFActivity;

public class PaymentActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        textView=findViewById(R.id.place_order);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PaymentActivity.this, PDFActivity.class);
                startActivity(intent);

            }
        });
    }
}
