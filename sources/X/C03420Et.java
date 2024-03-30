package X;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: X.0Et  reason: invalid class name and case insensitive filesystem */
public class C03420Et extends FrameLayout implements C16980qW {
    public final CollapsibleActionView A00;

    public void onActionViewCollapsed() {
        this.A00.onActionViewCollapsed();
    }

    public void onActionViewExpanded() {
        this.A00.onActionViewExpanded();
    }

    public C03420Et(View view) {
        super(view.getContext());
        this.A00 = (CollapsibleActionView) view;
        addView(view);
    }
}
