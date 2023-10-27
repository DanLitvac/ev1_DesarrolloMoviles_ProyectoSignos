package com.example.proyectosignos.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proyectosignos.R;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;



    public class PokemonAdapter extends RecyclerView.Adapter<PokemonAdapter.PokemonHolder> {

        private List<> listData;


        public PokemonAdapter(List<> listData) {

            this.listData = listData;
        }

        @NonNull
        @Override
        public PokemonHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.,parent, false);
            return new PokemonHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull final PokemonHolder holder, final int position) {
            holder.assignData(listData.get(position));
        }

        @Override
        public int getItemCount() {

            return listData.size();
        }


        public class PokemonHolder extends RecyclerView.ViewHolder {

            TextView name;
            TextView type;

            public PokemonHolder(@NonNull  View itemView) {
                super(itemView);
                name = (TextView) itemView.findViewById(R.id.textViewName);
                type = (TextView) itemView.findViewById(R.id.textViewType);


            }

            public void assignData( ...) {

                DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                this.name.setText(.getNombre());
                this.type.setText(.getTipo());
            }

        }
    }
}
