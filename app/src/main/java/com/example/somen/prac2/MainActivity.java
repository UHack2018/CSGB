package com.example.somen.prac2;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {
    public static String[] s1=new String[]{"rice"};
    public static Integer [] s2=new Integer[]{140};
    EditText editText,editText1;
    Button button;
    int fino=0;
    //public LinkedList<String> link;
    //public LinkedList<Integer> link1;
    HashMap<String, String> map1= new HashMap<String, String>();
   // DatabaseReference dref;
   // handler h = new handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ListView listView = (ListView) findViewById(R.id.listview);
        // listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        final ArrayList<String> list2 = new ArrayList<String>();
        // link=new LinkedList<String>(Arrays.asList(s1));
        //link1=new LinkedList<Integer>(Arrays.asList(s2));
        final ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < s1.length; i++) {
            list2.add(s1[i]);
            // list1.add(s2[i]);
            // handler handler = new handler(s1[i], s2[i]);

        }
        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference myRef = database.getReference("message");

        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice, list2);
        //ArrayAdapter<Integer> arrayAdapter1=new ArrayAdapter<Integer>(this,android.R.layout.simple_list_item_multiple_choice,s2);
        listView.setAdapter(arrayAdapter);
        editText = (EditText) findViewById(R.id.Edit);
        editText1 = (EditText) findViewById(R.id.cal);
        button = (Button) findViewById(R.id.button);
        // myRef = FirebaseDatabase.getInstance().getReference();
        final ArrayList<Integer> list4 = new ArrayList<Integer>();
        // if(editText.equals(null)){s1 s2
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editText.getText().toString();
                String s1 = editText1.getText().toString();
                int x = Integer.parseInt(s1);
                list2.add(s);
                listView.setAdapter(arrayAdapter);
               // list4.add(x);
                // HashMap<String, String> map1= new HashMap<String, String>();
               /* map1.put("food",s);
                map1.put("cal", s1);*/
               /* list.add(s);
                list1.add(x);*/
                //     link.add(s);
               /* myRef.push().setValue("Food:-"+s+",     Calories:-"+s1);
                listView.setAdapter(arrayAdapter);*/
                //handler hd=new handler(s,x);

            }
        });
    }
        //final ArrayList<String> list = new ArrayList<String>();
       /* myRef.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {

                String value = dataSnapshot.getValue(String.class);
                list2.add(value);
                arrayAdapter.notifyDataSetChanged();


                Toast.makeText(getApplicationContext(),"Data Stored",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {
                list2.remove(dataSnapshot.getValue(String.class));
                arrayAdapter.notifyDataSetChanged();

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        listView.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
              //  final String s=(String) adapterView.getItemIdAtPosition();
                CheckedTextView item=(CheckedTextView)view;
                Toast.makeText(getApplicationContext(),s1[i],Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        //}
//https://youtu.be/E6vE8fqQPTE

        //ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_multiple_choice, s1);
       // ListView listView=(ListView)findViewById(R.id.listview);
        //listView.setAdapter(arrayAdapter);

    }
    /*class custom extends BaseAdapter {

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.li, null);
            TextView tv = (TextView) view.findViewById(R.id.textdisp);
            TextView tvs = (TextView) view.findViewById(R.id.image);
            tv.setText(s1[i]);
            tvs.setText(images[i]);
            return view;
        }
    }*/
}
