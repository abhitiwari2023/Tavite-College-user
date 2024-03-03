package com.example.tavitecollege.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.tavitecollege.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    public HomeFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        ImageSlider imageSlider = view.findViewById(R.id.image_slider);

        ArrayList<SlideModel> imageList = new ArrayList<>(); // Create image list

// imageList.add(SlideModel("String Url" or R.drawable)
// imageList.add(SlideModel("String Url" or R.drawable, "title") You can add title

        imageList.add(new SlideModel("https://bit.ly/2YoJ77H", null));
        imageList.add(new SlideModel("https://bit.ly/2BteuF2", null));
        imageList.add(new SlideModel("https://bit.ly/3fLJf72", null));

        imageSlider.setImageList(imageList, ScaleTypes.FIT);

        // Inflate the layout for this fragment
        return view;
    }
}