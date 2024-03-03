package com.example.tavitecollege.ui.about;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.tavitecollege.R;

import java.util.ArrayList;
import java.util.List;

public class AboutFragment extends Fragment {

    private VideoView videoView;
    private ViewPager viewPager;
    private CourseAdaptor adapter;
    private List<CourseModal> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about, container, false);

        videoView = view.findViewById(R.id.video_view);

        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/tavite-collage-52ecf.appspot.com/o/lv_0_20240313105848%20(1).mp4?alt=media&token=2e230f22-749b-45a1-8e5b-52228c8ddde3"));
        videoView.start();

        videoView.setOnCompletionListener(mp -> {
            videoView.start();
        });

        // course section
        list = new ArrayList<>();
        list.add(new CourseModal(R.drawable.ic_comp, "Computer Science", "The department of Computer Science provides world-class research and education in modern computer science. The department has a cohesive team of well experienced faculty members having wide experience in recent technologies like Cloud computing, Grid Computing, High Performance Computing, Multimedia etc. It has different computer labs like Data Structure lab, Operating System lab, Multimedia lab, Web Technology lab, Research & Development lab"));
        list.add(new CourseModal(R.drawable.ic_comp, "Information Technology", "The department of Information Technology provides world-class research and education in modern computer science. The department has a cohesive team of well experienced faculty members having wide experience in recent technologies like Cloud computing, Grid Computing, High Performance Computing, Multimedia etc. It has different computer labs like Data Structure lab, Operating System lab, Multimedia lab, Web Technology lab, Research & Development lab"));
        list.add(new CourseModal(R.drawable.ic_comp, "Electrical Engineering", "The Electrical Engineering (EE) is one of the core branches of Galgotias College of Engineering & Technology, which has an excellent infrastructure to promote congenial academic environment to impart quality education. The department of Electrical Engineering has well equipped laboratories and a team of well qualified and dedicated faculty members and technical staff."));
        list.add(new CourseModal(R.drawable.ic_comp, "Mechanical Engineering", "The Department of Mechanical Engineering, established in the year 2001, with a vision to carve a distinct niche for itself in the field of mechanical engineering education in India, offers a 4- year B.Tech. program in Mechanical Engineering. The department has, over the years, built and maintained a high level of intellectual capital. It has to its credit a strong team of 33 highly qualified and richly experienced faculty members, 10 out of whom are PhDs and others are pursuing it from institutions of high repute"));

        adapter = new CourseAdaptor(getContext(), list);

        viewPager = view.findViewById(R.id.viewPager);

        viewPager.setAdapter(adapter);

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        videoView.start();
    }
}