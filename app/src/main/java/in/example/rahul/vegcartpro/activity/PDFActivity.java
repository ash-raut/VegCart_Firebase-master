package in.example.rahul.vegcartpro.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import in.example.rahul.vegcartpro.R;

public class PDFActivity extends AppCompatActivity {
     TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);
        textView=findViewById(R.id.download);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PDFActivity.this,HomeActivity.class);
                startActivity(intent);
            }
        });

    }
}
