package net.macdidi.mylistview1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Second extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);

        // ���o��������
        TextView txtShow=(TextView)findViewById(R.id.txtShow);
        Button btnHome=(Button)findViewById(R.id.btnHome);

        // �]�w button ��   Listner
        btnHome.setOnClickListener(btnHomeListner);

        // ���o  bundle
        Intent intent=this.getIntent();
        Bundle bundle=intent.getExtras();
        String name=bundle.getString("NAME");
        int age=bundle.getInt("AGE");
        Double tall=bundle.getDouble("TALL");
        String s="Name:" + name + "\n" +
                "Age: " + age + "\n" +
                "Tall: " + tall ;
        txtShow.setText(s);
    }

    private Button.OnClickListener btnHomeListner=new Button.OnClickListener(){
        public void onClick(View v){
            finish();
        }
    };
}