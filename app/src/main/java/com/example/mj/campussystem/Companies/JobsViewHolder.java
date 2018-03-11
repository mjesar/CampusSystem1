package com.example.mj.campussystem.Companies;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mj.campussystem.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.List;

/**
 * Created by MJ on 2/11/2018.
 */

public class JobsViewHolder extends RecyclerView.ViewHolder {

        private static final String TAG = JobsViewHolder.class.getSimpleName();

        public TextView item_name;
        public ImageView item_delete;
        private List<Jobs> studentsList;
        private FirebaseAuth myAuth;
        private DatabaseReference databaseReference;
        Context context;
//    private OnRecyclerItemClickListener onRecyclerItemClickListener;
        String taskTitle;


    public JobsViewHolder(final View itemView, final List<Jobs> studentsList) {
            super(itemView);
            String taskTitle;
            this.studentsList = studentsList;
            context = itemView.getContext();

            item_name = (TextView) itemView.findViewById(R.id.item_name);
            item_delete = (ImageButton)itemView.findViewById(R.id.item_delete);



            databaseReference = FirebaseDatabase.getInstance().getReference("Tasks");
            myAuth = FirebaseAuth.getInstance();


        }
}