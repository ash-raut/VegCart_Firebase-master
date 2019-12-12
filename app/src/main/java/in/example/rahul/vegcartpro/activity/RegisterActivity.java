package in.example.rahul.vegcartpro.activity;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import in.example.rahul.vegcartpro.R;


public class RegisterActivity extends AppCompatActivity {
    //Button button;
    private EditText first_name, last_name, mobile_no, user_name, password, confirm_password, email_id;
    Button sign_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        first_name = findViewById(R.id.first_name);
        last_name = findViewById(R.id.last_name);
        mobile_no = findViewById(R.id.mobile_no);
        user_name = findViewById(R.id.user_name);
        password = findViewById(R.id.password);
        confirm_password = findViewById(R.id.confirm_password);
        email_id = findViewById(R.id.email_id);
        sign_up = findViewById(R.id.sign_btn);
    }




        /*if (first_name.getText().toString().equals(""))
        {
            first_name.setError("Enter valid name");
            return false;
        }else if (last_name.getText().toString().equals(""))
        {
            last_name.setError("Enter the last name");
            return false;
        } else if(mobile_no.getText().toString().length()!=10)
        {
            mobile_no.setError("Please enter Valid no");
            return false;
        }else if (user_name.getText().toString().equals(""));
        {
            user_name.setError("Enter valid username");
            return false;
        }else if (password.getText().toString().equals(""));
        {

        }*/

}
