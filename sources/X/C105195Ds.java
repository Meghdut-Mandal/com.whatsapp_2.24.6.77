package X;

import android.view.View;

/* renamed from: X.5Ds  reason: invalid class name and case insensitive filesystem */
public class C105195Ds extends AnonymousClass5EQ {
    public final View.OnClickListener A00;

    public C105195Ds(View.OnClickListener onClickListener) {
        super(8);
        this.A00 = onClickListener;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.A00.equals(((C105195Ds) obj).A00);
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        AnonymousClass000.A1J(A0M, super.hashCode());
        return AnonymousClass000.A0L(this.A00, A0M);
    }
}
