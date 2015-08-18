package br.com.fiap.demolayout;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import br.com.fiap.demolayout.adapter.ImageAdapter;


public class DetalheImageActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_image);
        int position = getIntent().getExtras().getInt("id");
        ImageAdapter imageAdapter = new ImageAdapter(this);

        ImageView ivImagem = (ImageView) findViewById(R.id.ivImagem);

        ivImagem.setImageResource((Integer)imageAdapter.getItem(position));


    }



}
