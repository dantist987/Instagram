package com.example.instagram.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagram.R;
import com.example.instagram.models.Post;

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
            private ImageView like = itemView.findViewById(R.id.post_like);
            private ImageView comment = itemView.findViewById(R.id.post_comment);
            private ImageView resend = itemView.findViewById(R.id.post_recend);
            private ImageView save = itemView.findViewById(R.id.post_save);
            private ImageView postMore = itemView.findViewById(R.id.post_more);
            private ImageView description = itemView.findViewById(R.id.post_description);

            public void onBind(Post posts) {
                avatar.setImageResource(posts.getPostAvatar());
                login.setText(posts.getPostLogin());
                location.setText(posts.getPostLocation());
                more.setImageResource(posts.getPostMore());
                post.setImageResource(posts.getPost());
                like.setImageResource(posts.getLike());
                comment.setImageResource(posts.getComment());
                resend.setImageResource(posts.getResend());
                save.setImageResource(posts.getSave());
                postMore.setImageResource(posts.getPostMore());
                description.setImageResource(posts.getDescription());
            }
        }
    }

