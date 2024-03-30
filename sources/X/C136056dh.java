package X;

import android.widget.AutoCompleteTextView;

/* renamed from: X.6dh  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C136056dh implements AutoCompleteTextView.OnDismissListener {
    public final /* synthetic */ C99384tC A00;

    public /* synthetic */ C136056dh(C99384tC r1) {
        this.A00 = r1;
    }

    public final void onDismiss() {
        C99384tC r2 = this.A00;
        r2.A05 = true;
        r2.A00 = System.currentTimeMillis();
        C99384tC.A01(r2, false);
    }
}
