package com.example.uasnad;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class SecondActivity extends Fragment {
    private static final String TAG = "Fragment lagu nasional";

    public SecondActivity() {
        // empty public constructor
    }

    ListView listView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.word_list, container,false);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Indonesia raya"));
        words.add(new Word("Satu Nusa Satu Bangsa"));
        words.add(new Word("Bagimu Negeri"));
        words.add(new Word("Garuda Pancasila"));
        words.add(new Word("Gugur Bunga"));
        words.add(new Word("Indonesia Pusaka"));
        words.add(new Word("Ibu Kita Kartini"));
        words.add(new Word("Hari Merdeka"));
        words.add(new Word("Bangun Pemudi Pemuda"));
        words.add(new Word("Dari Sabang Sampai Merauke"));
        words.add(new Word("Halo - Halo Bandung"));
        words.add(new Word("Ibu Pertiwi"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.nasional);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        listView = (ListView) rootView.findViewById(R.id.list);

       // String[] values=new String[]{"indonesia raya", "satu nusa satu Bangsa"};
      //  WordAdapter adapter =new WordAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, values);
       // ArrayAdapter<Word> Word =new ArrayAdapter<Word>(SecondActivity.this, android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);


//ArrayAdapter<String> mAdapter=new ArrayAdapter<String>(SecondActivity.this, android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.judullagu));

       // listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
       /**     @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String adapter = (String) listView.getAdapter().getItem(position);
                Intent intent = new Intent(listView.getContext(),move1.class);
                listView.getContext().startActivity(intent);
                //or create other intents here
               /** Intent intent = new Intent(SecondActivity.this, move1.class);
                intent.putExtra("judullagu", listView.getItemAtPosition(i).toString());
                startActivity(intent);**/

             /**  if (position==0){
                    Intent myIntent = new Intent(view.getContext(), move1.class);
                    startActivityForResult(myIntent, 0);
               }
               if (position==1){
                   Intent myIntent = new Intent(view.getContext(), move2.class);
                   startActivityForResult(myIntent, 0);
               }
            }
        });
       listView.setAdapter(mAdapter);**/

    return rootView;
    }

}

