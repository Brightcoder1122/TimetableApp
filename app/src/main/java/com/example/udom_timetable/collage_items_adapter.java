package com.example.udom_timetable;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

public class collage_items_adapter extends RecyclerView.Adapter<collage_items_adapter.ViewHolder> {
    private CollageList[] list;

    public collage_items_adapter(CollageList[] list) {
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.collages_items, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(collage_items_adapter.ViewHolder holder, int position) {
        final CollageList myListData = list[position];
        holder.text_1.setText(list[position].getText_1());
        holder.text_2.setText(list[position].getText_2());
        holder.text_3.setText(list[position].getText_3());
        holder.text_4.setText(list[position].getText_4());
        holder.image_1.setImageResource(list[position].getImage_1());
        holder.image_2.setImageResource(list[position].getImage_2());
        holder.image_3.setImageResource(list[position].getImage_3());
        holder.image_4.setImageResource(list[position].getImage_4());
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "item clicked", Toast.LENGTH_SHORT).show();
//            Toast.makeText(v.getContext(), ""+myListData.getText2(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView text_1;
        public TextView text_2;
        public TextView text_3;
        public TextView text_4;
        public ImageView image_1;
        public ImageView image_2;
        public ImageView image_3;
        public ImageView image_4;
        public RelativeLayout relativeLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            this.text_1 = (TextView) itemView.findViewById(R.id.text_1);
            this.text_2 = (TextView) itemView.findViewById(R.id.text_2);
            this.text_3 = (TextView) itemView.findViewById(R.id.text_3);
            this.text_4 = (TextView) itemView.findViewById(R.id.text_4);
            this.image_1 = (ImageView) itemView.findViewById((R.id.img_1));
            this.image_2 = (ImageView) itemView.findViewById((R.id.img_2));
            this.image_3 = (ImageView) itemView.findViewById((R.id.img_3));
            this.image_4 = (ImageView) itemView.findViewById((R.id.img_4));

            relativeLayout = (RelativeLayout) itemView.findViewById(R.id.collages);
        }
    }
}
