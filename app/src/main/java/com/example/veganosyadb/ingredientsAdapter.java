package com.example.veganosyadb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.veganosyadb.entities.Ingrediente;

import java.util.List;

public class ingredientsAdapter extends RecyclerView.Adapter<ingredientsAdapter.ViewHolder> {
    private Context context;
    private List<Ingrediente> ingredienteList;
    public  ingredientsAdapter(Context context) {
        this.context = context;

    }

    public void setUserList(List<Ingrediente> ingredienteList) {
        this.ingredienteList = ingredienteList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ingredientsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(context).inflate(R.layout.recicler_view, parent, false);

       return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ingredientsAdapter.ViewHolder holder, int position) {
        holder.tvFirstName.setText(this.ingredienteList.get(position).getIng_nombre());
        holder.tvLastName.setText(this.ingredienteList.get(position).getDescripcion());
    }

    @Override
    public int getItemCount() {
        return this.ingredienteList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvFirstName;
        TextView tvLastName;

        public ViewHolder(View view){
            super(view);
            tvFirstName = view.findViewById(R.id.tvFirstName);
            tvLastName = view.findViewById(R.id.tvLastName);

        }
    }
}
