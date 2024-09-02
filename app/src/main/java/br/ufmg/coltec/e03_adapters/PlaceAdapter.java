package br.ufmg.coltec.e03_adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class PlaceAdapter extends BaseAdapter {
    private Context context;
    private List<Place> placeList;
    public void repositorio() {
        this.placeList.add(
                new Place("Coltec-UFMG", "Colégio Técnico da Universidade de Minas Gerais", R.drawable.img_coltec, 10.0, 5.0));
        this.placeList.add(
                new Place("IFMG-Sabará", "Instituto Federal de Minas Gerais, campus Sabará", R.drawable.img_sabara, 17.0, 5.0));
        this.placeList.add(
                new Place("Arena do Galo", "Estádio do Clube Atlético Mineiro", R.drawable.img_arena, 16.0, 4.9));

    }


    public PlaceAdapter(Context context, List<Place> placeList) {
        this.context = context;
        this.placeList = new ArrayList<>(placeList);
    }

    public PlaceAdapter(Context context) {
        this.context = context;
        this.placeList = new ArrayList<>();
        repositorio();
    }


    @Override
    public int getCount() {
        return placeList.size();
    }

    @Override
    public Object getItem(int i) {
        return placeList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Place place = (Place) this.getItem(i);
        View placeView = View.inflate(this.context, R.layout.list_item_place, null);


        TextView txtNome = placeView.findViewById(R.id.txt_place_name);
        TextView txtDescricao = placeView.findViewById(R.id.txt_place_description);
        TextView txtDistancia = placeView.findViewById(R.id.txt_place_distance);
        ImageView imagePlace = placeView.findViewById(R.id.img_place_photo);
        RatingBar ratingBar = placeView.findViewById(R.id.ratingBar);



        txtNome.setText(place.getName());
        txtDescricao.setText(place.getDescricao());
        txtDistancia.setText(place.getDistance().toString());
        imagePlace.setImageResource(place.getPhotoId());
        ratingBar.setRating((float) place.getRate().doubleValue());

        return placeView;
    }

}


