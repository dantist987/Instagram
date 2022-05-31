package com.example.instagram.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.instagram.R;
import com.example.instagram.databinding.FragmentStoriesBinding;


public class StoriesFragment extends Fragment {

    private FragmentStoriesBinding binding;

    public StoriesFragment(FragmentStoriesBinding binding) {
        this.binding = binding;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_stories, container, false);
    }
}