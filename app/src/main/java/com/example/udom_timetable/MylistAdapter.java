package com.example.udom_timetable;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

public class MylistAdapter extends RecyclerView.Adapter<MylistAdapter.ViewHolder> {
   private DataList[] list;

   public MylistAdapter(DataList[] list) {
      this.list = list;
   }

   @Override
   public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
      LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
      View listItem = layoutInflater.inflate(R.layout.items, parent, false);
      ViewHolder viewHolder = new ViewHolder(listItem);
      return viewHolder;
   }

   @Override
   public void onBindViewHolder(MylistAdapter.ViewHolder holder, int position) {
      final DataList myListData = list[position];
      holder.textView.setText(list[position].getText1());
      holder.textView2.setText(list[position].getText2());
      holder.icon.setImageResource(list[position].getImage());
      holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
            Toast.makeText(v.getContext(), "item clicked"+myListData.getText1(), Toast.LENGTH_SHORT).show();
//            Toast.makeText(v.getContext(), ""+myListData.getText2(), Toast.LENGTH_SHORT).show();
         }
      });
   }

   @Override
   public int getItemCount() {
      return list.length;
   }

   public class ViewHolder extends RecyclerView.ViewHolder {
      public TextView textView;
      public TextView textView2;
      public ImageView icon;
      public RelativeLayout relativeLayout;

      public ViewHolder(View itemView) {
         super(itemView);
         this.textView = (TextView) itemView.findViewById(R.id.text1);
         this.textView2 = (TextView) itemView.findViewById(R.id.text2);
         this.icon = (ImageView) itemView.findViewById(R.id.left_icon);

         relativeLayout = (RelativeLayout) itemView.findViewById(R.id.items);
      }
   }
}
