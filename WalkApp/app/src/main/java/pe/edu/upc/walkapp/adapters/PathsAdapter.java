package pe.edu.upc.walkapp.adapters;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Contacts;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import pe.edu.upc.walkapp.R;
import pe.edu.upc.walkapp.activities.PathActivity;
import pe.edu.upc.walkapp.models.Path;

/**
 * Created by Gonzalo on 27/09/2016.
 */
public class PathsAdapter extends RecyclerView.Adapter<PathsAdapter.ViewHolder> {
    private List<Path> paths;

    public PathsAdapter(List<Path> paths) {this.paths = paths;    }

    @Override
    public PathsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.card_path,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(PathsAdapter.ViewHolder holder, final int position) {
        holder.descriptionTextView.setText(paths.get(position).getDescription());
        holder.dateTextView.setText(String.valueOf(paths.get(position).getDate()) );
        holder.timeTextView.setText(String.valueOf(paths.get(position).getDate().getTime()));
        holder.pathCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itemIntent = new Intent(v.getContext(), PathActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("description", paths.get(position).getDescription());
                bundle.putString("date", String.valueOf(paths.get(position).getDate()));
                bundle.putString("time", String.valueOf(paths.get(position).getDate().getTime()));
                bundle.putStringArrayList("participants", paths.get(position).getParticipantsName());
                itemIntent.putExtras(bundle);
                v.getContext().startActivity(itemIntent);
            }
        });
        holder.deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itemIntent;
            }
        });
        holder.startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itemIntent;
            }
        });

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView pathCardView;
        TextView descriptionTextView,dateTextView,timeTextView;
        Button deleteButton,startButton;
        public ViewHolder(View itemView) {
            super(itemView);
            pathCardView=(CardView) itemView.findViewById(R.id.pathCardView);
            descriptionTextView=(TextView) itemView.findViewById((R.id.descriptionTextView));
            dateTextView=(TextView) itemView.findViewById(R.id.dateTextView);
            timeTextView=(TextView) itemView.findViewById(R.id.timeTextView);
            deleteButton=(Button) itemView.findViewById(R.id.deleteButton);
            startButton=(Button) itemView.findViewById((R.id.startButton));

        }
    }
}
