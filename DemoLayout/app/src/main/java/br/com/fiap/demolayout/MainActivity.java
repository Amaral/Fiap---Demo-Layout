package br.com.fiap.demolayout;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void verGaleria(View v){
        Intent i = new Intent(this, GaleriaTimesActivity.class);
        startActivity(i);
    }

    public void verLista(View v){
        Intent i = new Intent(this, ListaActivity.class);
        startActivity(i);
    }

    public void verCadastro(View v) {
        Intent i = new Intent(this, CadastroActivity.class);
        startActivity(i);
    }
}
