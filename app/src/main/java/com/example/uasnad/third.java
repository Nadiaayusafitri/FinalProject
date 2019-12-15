package com.example.uasnad;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class third extends Fragment {
        private static final String TAG = "Fragment lagu Daerah";

        public third() {
            // empty public constructor
        }
        // String[] values=new String[]{"indonesia_raya, satunusasatubangsa"};
        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
            View rootView = inflater.inflate(R.layout.word_list, container,false);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Ampar-Ampar Pisang"));
        words.add(new Word("Soleram"));
        words.add(new Word("Apuse"));
        words.add(new Word("Indung-Indung"));
        words.add(new Word("Endungku"));
        words.add(new Word("Hindu"));
        words.add(new Word("Manuk Dadali"));
        words.add(new Word("Butet"));
        words.add(new Word("Anging Mamiri"));
        words.add(new Word("Ayam Den Lapeh"));
        words.add(new Word("Cublek-Cublek Suweng"));
        words.add(new Word("Injit-Injit semut"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.daerah);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        /**listView.setOnItemClickListener(new OnItemClickListener() {
         public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
         //  Object detail=this.getAdapter().getItem(urutan);
         //   String tampil=detail.toString;

         Intent=null;
         if ()
         }
         }**/

        return rootView;
    }
    /** @Override
    public void OnListItemClick(ListView parent,View v,int urutan, long id){
    Object detail;
    String tampil=detail.toString();
    Intent i=null;

    if (tampil=="indonesia_raya")
    {
    i=new Intent(SecondActivity.this, move1.class);
    startActivity(i);
    }
    else if (tampil=="satunusasatubangsa")
    {
    i=new Intent(SecondActivity.this, move2.class);
    startActivity(i);
    }**/
}


