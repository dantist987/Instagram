package com.example.instagram.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagram.R;
import com.example.instagram.models.User;

import java.util.ArrayList;
import java.util.List;

public class StoriesAdapter extends RecyclerView.Adapter<StoriesAdapter.StoriesViewHolder> {

    private List<User> list = new ArrayList<>();
    private OnStoriesItemClickListener clickListener;

    public StoriesAdapter() {
    }

    public void setList(ArrayList<User> users) {
        list.clear();
        list.addAll(users);
        notifyDataSetChanged();
    }

    public void setClickListener(OnStoriesItemClickListener itemClickListener){
        this.clickListener = itemClickListener;
    }

    @NonNull
    @Override
    public StoriesAdapter.StoriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_stories, parent, false);
        return new StoriesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StoriesAdapter.StoriesViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class StoriesViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public StoriesViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        private TextView name = itemView.findViewById(R.id.story_username);
        private ImageView imageStory = itemView.findViewById(R.id.img_story);


        public void onBind(User user) {

            name.setText(user.getUserName());
            imageStory.setImageResource(user.getUserImage());
            imageStory.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            clickListener.onClick(v, getAdapterPosition());
        }
    }
}
