package X;

import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* renamed from: X.4XW  reason: invalid class name */
public class AnonymousClass4XW implements View.OnLayoutChangeListener {
    public Object A00;
    public final int A01;

    public AnonymousClass4XW(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.A01) {
            case 0:
                AnonymousClass5ND r1 = (AnonymousClass5ND) this.A00;
                AnonymousClass00C.A0D(r1, 0);
                if (i4 != i8) {
                    r1.A0F();
                    return;
                }
                return;
            case 1:
                AnonymousClass00C.A0D(view, 0);
                view.removeOnLayoutChangeListener(this);
                ((C34341gs) this.A00).A00.start();
                return;
            default:
                view.removeOnLayoutChangeListener(this);
                Toolbar toolbar = (Toolbar) this.A00;
                toolbar.setOverflowIcon(toolbar.getOverflowIcon());
                return;
        }
    }
}
