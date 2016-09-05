package com.victor_xiao.fragmanttest;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.victor_xiao.fragmanttest.Words.WordsContent;

public class MainActivity extends AppCompatActivity implements
        DetailFragment.OnFragmentInteractionListener,ItemFragment.OnListFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void onListFragmentInteraction(WordsContent.WordItem item) {
        Bundle arguments =new Bundle();
        Log.d("debug","23(⊙o⊙)…241241412");
        arguments.putString("id",item.id);
        DetailFragment fragment=new DetailFragment();
        fragment.setArguments(arguments);
        getFragmentManager().beginTransaction().replace(R.id.worddetail,fragment).commit();

    }
}
