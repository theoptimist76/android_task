package com.example.loginapplication.ui.homepage;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.loginapplication.R;
import com.example.loginapplication.ui.homepage.ui.login.LoginActivity;

import java.util.ArrayList;


public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    ArrayList userImg, userName;
    Context context;


    public Adapter(Context context, ArrayList userImg, ArrayList courseName) {
        this.context = context;
        this.userImg = userImg;
        this.userName = courseName;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflating the Layout(Instantiates list_item.xml
        // layout file into View object)
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_profile_list, parent, false);

        // Passing view to ViewHolder
        Adapter.ViewHolder viewHolder = new Adapter.ViewHolder(view);
        return viewHolder;
    }

    // Binding data to the into specified position
    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        // TypeCast Object to int type
        int res = (int) userImg.get(position);
        holder.images.setImageResource(res);
        holder.text.setText((String) userName.get(position));
        holder.linearLayout.setOnClickListener(view -> {

            Intent intent= new Intent(context, LoginActivity.class);
            context.startActivity(intent);

        });
    }

    @Override
    public int getItemCount() {
        // Returns number of items
        // currently available in Adapter
        return userImg.size();
    }

    // Initializing the Views
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView images;
        TextView text;

         LinearLayout linearLayout;

        public ViewHolder(View view) {
            super(view);
            images = (ImageView) view.findViewById(R.id.courseImg);
            text = (TextView) view.findViewById(R.id.courseName);
            linearLayout=(LinearLayout) view.findViewById(R.id.layout_linear_profile);
        }
    }
}

