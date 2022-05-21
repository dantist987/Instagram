package com.example.instagram;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.PostsViewHolder> {

    private List<Post> list = new ArrayList<>();

    public void setList(ArrayList<Post> post) {
        list.clear();
        list.addAll(post);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public PostsAdapter.PostsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_posts, parent, false);
        return new PostsAdapter.PostsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostsAdapter.PostsViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class PostsViewHolder extends RecyclerView.ViewHolder {
        public PostsViewHolder(@NonNull View itemView) {
            super(itemView);
        }

            private ImageView avatar = itemView.findViewById(R.id.post_user_avatar);
            private TextView login = itemView.findViewById(R.id.post_user_login);
            private TextView location = itemView.findViewById(R.id.post_location);
            private ImageView more = itemView.findViewById(R.id.more);
            private ImageView post = itemView.findViewById(R.id.user_post);

            public void onBind(Post posts) {
                avatar.setImageResource(posts.getpostAvatar());
                login.setText(posts.getpostLogin());
                location.setText(posts.getpostLocation());
                more.setImageResource(posts.getpostMore());
                post.setImageResource(posts.getPost());
            }
        }
    }

