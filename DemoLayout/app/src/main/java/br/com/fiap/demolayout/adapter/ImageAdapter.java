package br.com.fiap.demolayout.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import br.com.fiap.demolayout.R;

/**
 * Created by rm49683 on 10/08/2015.
 */
public class ImageAdapter extends BaseAdapter{

    private Context mContext;
    private Integer[] mImagens = {
            R.drawable.atl_mineiro, R.drawable.botafogo,
            R.drawable.corinthians, R.drawable.coritiba,
            R.drawable.cruzeiro, R.drawable.figueirense,
            R.drawable.flamengo, R.drawable.fluminense,
            R.drawable.goias, R.drawable.gremio,
            R.drawable.guarani, R.drawable.internacional,
            R.drawable.juventude, R.drawable.palmeiras,
            R.drawable.parana, R.drawable.paranaense,
            R.drawable.paysandu, R.drawable.ponte_preta,
            R.drawable.santos, R.drawable.sao_caetano,
            R.drawable.sao_paulo, R.drawable.vasco_da_gama,
            R.drawable.vitoria
    };
    public ImageAdapter(Context context){
        this.mContext = context;
    }
    @Override
    public int getCount(){
        return mImagens.length;
    }
    @Override
    public Object getItem(int position){
        return mImagens[position];
    }
    @Override
    public long getItemId(int position){
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        if(convertView ==null){
            convertView= LayoutInflater.from(mContext).inflate(R.layout.imagem_grid, parent, false);
        }
        ImageView ivClube = (ImageView)convertView.findViewById(R.id.ivClube);
        ivClube.setImageResource(mImagens[position]);

        return convertView;
    }

}
