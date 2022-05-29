package com.example.t027_api;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    List<Model> postList;

    public MyAdapter(Context context , List<Model> postList ) {
        this.postList = postList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rowlayout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        holder.id.setText(Integer.toString(postList.get(position).getId()));
        holder.userId.setText(Integer.toString(postList.get(position).getUserId()));
        holder.title.setText(postList.get(position).getTitle());
        holder.postdesc.setText(postList.get(position).getPostDesc());

    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView title , postdesc , id , userId ;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.postTitle);
            postdesc = itemView.findViewById(R.id.postDesc);
            id = itemView.findViewById(R.id.id);
            userId = itemView.findViewById(R.id.userId);

        }
    }

}
