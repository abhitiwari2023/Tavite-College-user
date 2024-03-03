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

        imageList.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/tavite-collage-52ecf.appspot.com/o/WhatsApp%20Image%202024-01-19%20at%207.56.31%20PM.jpeg?alt=media&token=c59ceab4-c755-47fd-a8bc-a4151099e281", null));
        imageList.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/tavite-collage-52ecf.appspot.com/o/WhatsApp%20Image%202024-01-19%20at%207.56.29%20PM.jpeg?alt=media&token=38eae0de-8e21-4a98-88e9-e1e5e258a11a", null));
        imageList.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/tavite-collage-52ecf.appspot.com/o/WhatsApp%20Image%202024-01-19%20at%207.56.30%20PM%20(1).jpeg?alt=media&token=63872073-67dc-41d6-aaa7-e48f23120a4c", null));
        imageList.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/tavite-collage-52ecf.appspot.com/o/WhatsApp%20Image%202024-01-19%20at%207.56.30%20PM.jpeg?alt=media&token=b6d09601-47e4-4dfc-a1b8-7d93d1091a73", null));
        imageList.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/tavite-collage-52ecf.appspot.com/o/WhatsApp%20Image%202024-01-19%20at%207.56.32%20PM.jpeg?alt=media&token=928ce957-3aef-45cf-9eb9-16f4e8c90c94", null));
        imageList.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/tavite-collage-52ecf.appspot.com/o/WhatsApp%20Image%202024-01-19%20at%207.56.35%20PM.jpeg?alt=media&token=aba14b84-0829-498c-886f-2eac619a41f8", null));

        imageSlider.setImageList(imageList, ScaleTypes.FIT);

        // Inflate the layout for this fragment
        return view;
    }
}