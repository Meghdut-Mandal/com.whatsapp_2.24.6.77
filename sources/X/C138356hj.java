package X;

import android.widget.AutoCompleteTextView;

/* renamed from: X.6hj  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C138356hj implements C16700pw {
    public final /* synthetic */ C99384tC A00;

    public /* synthetic */ C138356hj(C99384tC r1) {
        this.A00 = r1;
    }

    public final void onTouchExplorationStateChanged(boolean z) {
        C99384tC r1 = this.A00;
        AutoCompleteTextView autoCompleteTextView = r1.A04;
        if (autoCompleteTextView != null && autoCompleteTextView.getInputType() == 0) {
            C011504z.A06(r1.A01, C36371kC.A00(z ? 1 : 0));
        }
    }
}
