package br.com.fiap.demolayout.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import br.com.fiap.demolayout.Clube;
import br.com.fiap.demolayout.R;

/**
 * Created by Felipe on 8/16/2015.
 */
public class ListaAdapter extends BaseAdapter {

    private Context mContext;
    public ListaAdapter(Context context){
        this.mContext = context;
    }

    private Clube[] mClubes = {
            new Clube("Atlético Mineiro", R.drawable.atl_mineiro),
            new Clube("Botafogo", R.drawable.botafogo),
            new Clube("corinthians", R.drawable.corinthians),
            new Clube("coritiba", R.drawable.coritiba),
            new Clube("cruzeiro", R.drawable.cruzeiro),
            new Clube("figueirense", R.drawable.figueirense),
            new Clube("flamengo", R.drawable.flamengo),
            new Clube("fluminense", R.drawable.fluminense),
            new Clube("goias", R.drawable.goias),
            new Clube("gremio", R.drawable.gremio),
            new Clube("guarani", R.drawable.guarani),
            new Clube("internacional", R.drawable.internacional),
            new Clube("juventude", R.drawable.juventude),
            new Clube("palmeiras", R.drawable.palmeiras),
            new Clube("parana", R.drawable.parana),
            new Clube("paranaense", R.drawable.paranaense),
            new Clube("paysandu", R.drawable.paysandu),
            new Clube("ponte preta", R.drawable.ponte_preta),
            new Clube("santos", R.drawable.santos),
            new Clube("são caetano", R.drawable.sao_caetano),
            new Clube("são paulo", R.drawable.sao_paulo),
            new Clube("vasco da gama", R.drawable.vasco_da_gama),
            new Clube("vitoria", R.drawable.vitoria)
    };

    @Override
    public int getCount(){
        return mClubes.length;
    }
    @Override
    public Object getItem(int position){
        return mClubes[position];
    }
    @Override
    public long getItemId(int position){
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView ==null){
            convertView= LayoutInflater.from(mContext).inflate(R.layout.item_lista, parent, false);
        }
        ImageView ivClube = (ImageView)convertView.findViewById(R.id.ivClube2);
        ivClube.setImageResource(mClubes[position].getImage());

        TextView tvName = (TextView) convertView.findViewById(R.id.tvClube2);
        tvName.setText(mClubes[position].getName());

        return convertView;
    }
}
