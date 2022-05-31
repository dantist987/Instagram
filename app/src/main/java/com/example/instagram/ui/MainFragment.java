package com.example.instagram.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.instagram.R;
import com.example.instagram.adapters.OnStoriesItemClickListener;
import com.example.instagram.adapters.PostsAdapter;
import com.example.instagram.adapters.StoriesAdapter;
import com.example.instagram.databinding.FragmentMainBinding;
import com.example.instagram.models.Post;
import com.example.instagram.models.User;

import java.util.ArrayList;


public class MainFragment extends Fragment implements OnStoriesItemClickListener {

    private StoriesAdapter adapter;
    private PostsAdapter postsAdapter;
    private FragmentMainBinding binding;

    public MainFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMainBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.rvStories.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        adapter = new StoriesAdapter();
        adapter.setClickListener(this);
        binding.rvStories.setAdapter(adapter);
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("John", R.drawable.avatar1));
        users.add(new User("Sena", R.drawable.avatar1));
        users.add(new User("Elton", R.drawable.avatar1));
        users.add(new User("Jack", R.drawable.avatar1));
        users.add(new User("Lennon", R.drawable.avatar1));
        users.add(new User("Lenin", R.drawable.avatar1));
        adapter.setList(users);

        binding.rvPosts.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        postsAdapter = new PostsAdapter();
        binding.rvPosts.setAdapter(postsAdapter);
        ArrayList<Post> posts = new ArrayList<>();
        posts.add(new Post(R.drawable.avatar, "Elton John", "location", R.drawable.ic_more, R.drawable.post, R.drawable.likes, R.drawable.icon_comment, R.drawable.icon_direct, R.drawable.save, R.drawable.post_description, R.drawable.ic_more));
        posts.add(new Post(R.drawable.avatar, "Elton John", "location", R.drawable.ic_more, R.drawable.post, R.drawable.likes, R.drawable.icon_comment, R.drawable.icon_direct, R.drawable.save, R.drawable.post_description, R.drawable.ic_more));
        posts.add(new Post(R.drawable.avatar, "Elton John", "location", R.drawable.ic_more, R.drawable.post, R.drawable.likes, R.drawable.icon_comment, R.drawable.icon_direct, R.drawable.save, R.drawable.post_description, R.drawable.ic_more));
        posts.add(new Post(R.drawable.avatar, "Elton John", "location", R.drawable.ic_more, R.drawable.post, R.drawable.likes, R.drawable.icon_comment, R.drawable.icon_direct, R.drawable.save, R.drawable.post_description, R.drawable.ic_more));
        postsAdapter.setList(posts);
    }

    @Override
    public void onClick(View view, int position) {
        Navigation.findNavController(view).navigate(R.id.storiesFragment);
    }
}

