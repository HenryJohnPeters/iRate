package com.example.android.logindemo.Main;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.logindemo.R;
import com.squareup.picasso.Picasso;

import java.util.List;


public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageViewHolder  > {
    private Context mContext;
    private List<Uploads.Upload> mUploads;

    public ImageAdapter(Context context, List<Uploads.Upload> uploads) {
        mContext = context;
        mUploads = uploads;
    }

    @Override
    public ImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.image_item, parent, false);
        return new ImageViewHolder(v);
    }


    @Override
    public void onBindViewHolder(ImageViewHolder holder, int position) {
        Uploads.Upload uploadCurrent = mUploads.get(position);
        holder.textViewName.setText(uploadCurrent.getName());
        Picasso.get()
                .load(uploadCurrent.getImageUrl())
                .fit()
                .centerCrop()
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return mUploads.size();
    }


    public class ImageViewHolder extends RecyclerView.ViewHolder {

        public TextView textViewName,displayLikes;
        public ImageView imageView;
        public Button comment,upVote,downVote;


        public ImageViewHolder(View itemView) {
            super(itemView);

            comment = itemView.findViewById(R.id.Commentbtn);
            upVote = itemView.findViewById(R.id.upVoteButton);
            downVote = itemView.findViewById(R.id.downVoteButton);
            displayLikes=itemView.findViewById(R.id.TVdisplayLikes);



            textViewName = itemView.findViewById(R.id.text_view_name);
            imageView = itemView.findViewById(R.id.image_view_upload);

            ImageViewHolder.super.itemView.setOnClickListener((View.OnClickListener) itemView);

        }


        }
    }

