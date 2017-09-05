package com.example.josearias.bolbo.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.josearias.bolbo.R;
import com.example.josearias.bolbo.adapters.viewHolder.ViewHolderListar;
import com.example.josearias.bolbo.adapters.viewHolder.ViewHolderTareasActividades;
import com.example.josearias.bolbo.adapters.viewHolder.ViewHolderTareasRecursosTitulo;

import java.util.List;


public class AdapterTareasActividades extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Object> items;
    private final int SESION = 1,ITEM = 2;
    public AdapterTareasActividades(List<Object> items) {
        this.items = items;

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        RecyclerView.ViewHolder viewHolder;
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());

        switch (viewType) {
            case SESION:
                View v1 = inflater.inflate(R.layout.layout_item_actividades, viewGroup, false);
                viewHolder = new ViewHolderTareasActividades(v1);
                break;
            case ITEM:
                View v2 = inflater.inflate(R.layout.row_layout, viewGroup, false);
                viewHolder = new ViewHolderListar(v2);
                break;
            default:
                View v3 = inflater.inflate(R.layout.layout_item_recursos_titulo, viewGroup, false);
                viewHolder = new ViewHolderTareasRecursosTitulo(v3);
                break;
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
        switch (viewHolder.getItemViewType()) {
            case SESION:
               Object aprendizaje =  items.get(position);
                ViewHolderTareasActividades vh1 = (ViewHolderTareasActividades) viewHolder;
                vh1.bind(aprendizaje);
                break;
            case ITEM:
                ViewHolderListar vh2 = (ViewHolderListar) viewHolder;
                String countries =  (String)items.get(position);
                vh2.bind(countries);
                break;
            default:
                break;
        }

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public int getItemViewType(int position) {
        if (items.get(position) instanceof Integer) {
            return SESION;
        }else if(items.get(position) instanceof String) {
            return ITEM;
        }
        return -1;
    }

    public void addItem(String country) {
        items.add(country);
        notifyItemInserted(items.size());
    }

    public void removeItem(int position) {
        items.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, items.size());
    }

}