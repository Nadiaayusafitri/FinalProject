package com.example.uasnad;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class fourth extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth);
    }

    public void submitOrder(View view) {

        EditText namefield= (EditText) findViewById(R.id.namefield);
        String name = namefield.getText().toString();

        EditText commentfield= (EditText) findViewById(R.id.commentfield);
        String comment = commentfield.getText().toString();

        CheckBox yesCheckBox = (CheckBox) findViewById(R.id.ya);
        boolean hasYes = yesCheckBox.isChecked();

        CheckBox noCheckBox = (CheckBox) findViewById(R.id.tidak);
        boolean hasNo = noCheckBox.isChecked();

        int price = calculatePrice(hasYes, hasNo);

        String message = createOrderSummary(name, comment, hasYes, hasNo);

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); //only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT,getString(R.string.order_summary_email_subject)+" "+ name);
        intent.putExtra(Intent.EXTRA_TEXT,message);
        if (intent.resolveActivity(getPackageManager()) !=null){
            startActivity(intent);
        }

    }

    private int calculatePrice(boolean addIya, boolean addTidak ) {
        int basePrice = 5;
        if(addIya){
            basePrice=basePrice;
        }
        if (addTidak){
            basePrice=basePrice;
        }

        return basePrice;
    }

    private String createOrderSummary(String name, String comment, boolean addIya, boolean addTidak) {
        String priceMessage = getString(R.string.order_summary_name, name);
        priceMessage += "\n" + getString(R.string.order_summary_question , comment);
        priceMessage += "\n" + getString(R.string.aplikasi);
        priceMessage += "\n" + getString(R.string.order_summary_yes)+" "+ addIya;
        priceMessage += "\n" + getString(R.string.order_summary_no)+" "+ addTidak;
        return priceMessage;
    }


}