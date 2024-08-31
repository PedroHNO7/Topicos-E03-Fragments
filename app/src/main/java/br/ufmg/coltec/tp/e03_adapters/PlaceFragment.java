package br.ufmg.coltec.tp.e03_adapters;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class PlaceFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_place_details, container, false);
    }

    public void atualizaLugar(Place lugar) {

        if (getActivity() != null) {

            ImageView imgPlacePhoto = getActivity().findViewById(R.id.img_place_photo);
            TextView txtPlaceName = getActivity().findViewById(R.id.txt_place_name);
            TextView txtPlaceDescription = getActivity().findViewById(R.id.txt_place_description);
            TextView txtPlaceDistance = getActivity().findViewById(R.id.txt_place_distance);
            RatingBar ratingBar = getActivity().findViewById(R.id.rating_bar);


            imgPlacePhoto.setImageResource(lugar.getPhotoId());
            txtPlaceName.setText(lugar.getName());
            txtPlaceDescription.setText(lugar.getDescription());
            txtPlaceDistance.setText(String.format("%.2f KM", lugar.getDistance()));
            ratingBar.setRating(lugar.getRate());

        }
    }
}
