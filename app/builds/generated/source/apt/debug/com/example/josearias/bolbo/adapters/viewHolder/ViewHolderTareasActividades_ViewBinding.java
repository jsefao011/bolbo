// Generated code from Butter Knife. Do not modify!
package com.example.josearias.bolbo.adapters.viewHolder;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.josearias.bolbo.R;
import com.example.josearias.bolbo.util.CircularTextView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ViewHolderTareasActividades_ViewBinding implements Unbinder {
  private ViewHolderTareasActividades target;

  @UiThread
  public ViewHolderTareasActividades_ViewBinding(ViewHolderTareasActividades target, View source) {
    this.target = target;

    target.txtnum_actividad = Utils.findRequiredViewAsType(source, R.id.txt_num_actividad, "field 'txtnum_actividad'", CircularTextView.class);
    target.lin_actividad_Det = Utils.findRequiredViewAsType(source, R.id.lin_actividad_Det, "field 'lin_actividad_Det'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ViewHolderTareasActividades target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.txtnum_actividad = null;
    target.lin_actividad_Det = null;
  }
}
