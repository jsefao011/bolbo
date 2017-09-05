package com.example.josearias.bolbo.adapters.viewHolder;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;

import com.example.josearias.bolbo.R;
import com.example.josearias.bolbo.util.CircularTextView;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * Created by SCIEV on 20/08/2017.
 */

public class ViewHolderTareasActividades extends RecyclerView.ViewHolder {
    @BindView(R.id.txt_num_actividad)
    CircularTextView txtnum_actividad;
    @BindView(R.id.lin_actividad_Det)
    LinearLayout lin_actividad_Det;
    // Cada uno de los elementos de mi vista
    public ViewHolderTareasActividades(View v) {
        super(v);
        ButterKnife.bind(this, v);
    }
    
    public void bind(Object aprendizaje){
        //String hexColor = "#" + Integer.toHexString(vint_backgroudColor).substring(2);
        txtnum_actividad.setStrokeWidth(1);
        txtnum_actividad.setStrokeColor("#05a6d7");
        txtnum_actividad.setSolidColor("#ffffff");

        itemView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                //region Efecto de deslis
                if(lin_actividad_Det.getVisibility() != View.GONE){

                    lin_actividad_Det.animate()
                            .translationY(0)
                            .alpha(0.3f)
                            .setListener(new AnimatorListenerAdapter() {
                                @Override
                                public void onAnimationEnd(Animator animation) {
                                    super.onAnimationEnd(animation);
                                    lin_actividad_Det.setVisibility(View.GONE);
                                }
                            });
                }else{

                    lin_actividad_Det.setVisibility(View.VISIBLE);
                    lin_actividad_Det.setAlpha(0.0f);
                    lin_actividad_Det.animate()
                            .translationY(0)
                            .alpha(1.0f)
                            .setListener(null);
                }
                //endregion
            }
        });
    }



}
