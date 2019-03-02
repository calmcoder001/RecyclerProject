package com.example.recyclerproject;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MtvAdapter extends RecyclerView.Adapter<MtvAdapter.MtvViewHolder> {


    private Context context;
    private List<Post> posts;


    public MtvAdapter(Context context, List<Post> posts) {


        this.context = context;

        this.posts = posts;
    }


    @NonNull
    @Override
    public MtvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_recycler, parent, false);

        return new MtvViewHolder(view);
    }



    @Override
    public void onBindViewHolder(MtvViewHolder holder, int i) {

        Post post = posts.get(i);
        holder.mvtImage.setImageDrawable(post.getPostImage());
        holder.title.setText(post.getTitle());
        holder.content.setText(post.getContent());
        holder.date.setText(post.getDate());

    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public class MtvViewHolder extends RecyclerView.ViewHolder {

        private ImageView mvtImage;
        private TextView date;
        private TextView content;
        private TextView title;


        public MtvViewHolder(@NonNull View itemView) {
            super(itemView);

            mvtImage = (ImageView) itemView.findViewById(R.id.item_image);
            date = (TextView) itemView.findViewById(R.id.date);
            content = (TextView) itemView.findViewById(R.id.conten);
            title = (TextView) itemView.findViewById(R.id.v_title);


        }
    }


}
