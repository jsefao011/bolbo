// Generated code from Butter Knife. Do not modify!
package com.example.josearias.bolbo.adapters.viewHolder;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.josearias.bolbo.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ViewHolderListar_ViewBinding implements Unbinder {
  private ViewHolderListar target;

  @UiThread
  public ViewHolderListar_ViewBinding(ViewHolderListar target, View source) {
    this.target = target;

    target.tv_country = Utils.findRequiredViewAsType(source, R.id.tv_country, "field 'tv_country'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ViewHolderListar target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tv_country = null;
  }
}
