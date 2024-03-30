package X;

import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;

/* renamed from: X.0cv  reason: invalid class name and case insensitive filesystem */
public class C09780cv implements C17190qs {
    public int A00;
    public boolean A01 = false;
    public final /* synthetic */ ActionBarContextView A02;

    public void BR6(View view) {
        this.A01 = true;
    }

    public C09780cv(ActionBarContextView actionBarContextView) {
        this.A02 = actionBarContextView;
    }

    public void BR7(View view) {
        if (!this.A01) {
            ActionBarContextView actionBarContextView = this.A02;
            actionBarContextView.A03 = null;
            C09780cv.super.setVisibility(this.A00);
        }
    }

    public void BR9(View view) {
        C09780cv.super.setVisibility(0);
        this.A01 = false;
    }
}
