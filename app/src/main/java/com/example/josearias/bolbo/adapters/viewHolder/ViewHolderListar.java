package com.example.josearias.bolbo.adapters.viewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.example.josearias.bolbo.R;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by SCIEV on 20/08/2017.
 */

public class ViewHolderListar extends RecyclerView.ViewHolder {

    @BindView(R.id.tv_country)
    TextView tv_country;
    public ViewHolderListar(View v) {
        super(v);
        ButterKnife.bind(this, v);
    }

    public void bind(String countrie) {
        tv_country.setText(countrie);
    }
}
