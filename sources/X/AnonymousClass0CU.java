package X;

import android.view.View;

/* renamed from: X.0CU  reason: invalid class name */
public class AnonymousClass0CU {
    public AnonymousClass0CV A00 = new AnonymousClass0CV();
    public final AnonymousClass0CT A01;

    public View A00(int i, int i2, int i3, int i4) {
        AnonymousClass0CT r6 = this.A01;
        int BFA = r6.BFA();
        int BF5 = r6.BF5();
        int i5 = -1;
        if (i2 > i) {
            i5 = 1;
        }
        View view = null;
        while (i != i2) {
            View A0R = ((AnonymousClass0CP) ((C18390t5) r6).A00).A0R(i);
            int B9d = r6.B9d(A0R);
            int B9c = r6.B9c(A0R);
            AnonymousClass0CV r2 = this.A00;
            r2.A04 = BFA;
            r2.A03 = BF5;
            r2.A02 = B9d;
            r2.A01 = B9c;
            r2.A00 = 0;
            r2.A00 = i3;
            if (r2.A00()) {
                return A0R;
            }
            if (i4 != 0) {
                r2.A00 = 0;
                r2.A00 = i4;
                if (r2.A00()) {
                    view = A0R;
                }
            }
            i += i5;
        }
        return view;
    }

    public boolean A01(View view) {
        AnonymousClass0CV r4 = this.A00;
        AnonymousClass0CT r0 = this.A01;
        int BFA = r0.BFA();
        int BF5 = r0.BF5();
        int B9d = r0.B9d(view);
        int B9c = r0.B9c(view);
        r4.A04 = BFA;
        r4.A03 = BF5;
        r4.A02 = B9d;
        r4.A01 = B9c;
        r4.A00 = 0;
        r4.A00 = 24579;
        return r4.A00();
    }

    public AnonymousClass0CU(AnonymousClass0CT r2) {
        this.A01 = r2;
    }
}
