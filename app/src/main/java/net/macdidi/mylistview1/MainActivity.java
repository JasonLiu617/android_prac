package net.macdidi.mylistview1;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
public class MainActivity extends ListActivity {

    private Context context;
    private String[] myFunction;
    private ListAdapter adapter;
    private ListView listView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        myFunction = getResources().getStringArray(R.array.myFunction);
        ListAdapter adapter = new ArrayAdapter<String>(context, android.R.layout.simple_expandable_list_item_1, myFunction);
        setListAdapter(adapter);
        getListView().setOnItemClickListener(new MyOnItemClickListener());
    }

    private class MyOnItemClickListener implements OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            String key = parent.getItemAtPosition(position).toString();

            switch (key){
                case "Google":{
                    Uri uri=Uri.parse("http://www.google.com.tw");
                    Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(intent);
                    break;
                }
                case "Phone":{
                    Uri uri=Uri.parse("tel:0955481666");
                    Intent intent=new Intent(Intent.ACTION_DIAL,uri);
                    startActivity(intent);
                    break;
                }
                case "Hello":{
                    Toast.makeText(context, key, Toast.LENGTH_SHORT).show();
                    break;
                }


                case "Data":{
                    Intent intent=new Intent();
                   // intent.setClaMainActivity.this,Second.class);
                    //intent.setClass(MainActivity.this,Second.class);
                    intent.setClass(MainActivity.this,Second.class);
                    String name="David";
                    int age=27;
                    Double tall=183.5;

                    Bundle bundle=new Bundle();
                    bundle.putString("NAME", name);
                    bundle.putInt("AGE", age);
                    bundle.putDouble("TALL", tall);
                    intent.putExtras(bundle);

                    // 執行附帶資料的 Intent
                    startActivity(intent);
                    break;
                }





            }

        }
    }
}



/*
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
 */
