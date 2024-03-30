package X;

import android.os.Trace;
import android.util.SparseArray;

/* renamed from: X.9RH  reason: invalid class name */
public class AnonymousClass9RH {
    public final SparseArray A00 = new SparseArray();
    public final C198549dl A01;
    public final SparseArray A02 = new SparseArray();

    public void A00(AnonymousClass9NT r5, C23071B3a b3a) {
        try {
            Trace.beginSection("sendOutputData");
            C20983A1x a1x = (C20983A1x) this.A00.get(0);
            if (a1x == null) {
                this.A01.A00(C188278zK.A0B);
            } else if (b3a != null) {
                b3a.BEs();
                AnonymousClass9ST A022 = a1x.A00.A02();
                if (a1x.A01 == null) {
                    C20981A1v a1v = new C20981A1v(a1x.A02);
                    a1x.A01 = a1v;
                    a1v.B1T(A022);
                }
                a1x.A01.A00(A022, r5, b3a);
            } else {
                a1x.A01(r5);
            }
        } finally {
            Trace.endSection();
        }
    }

    public AnonymousClass9RH(C198549dl r2) {
        this.A01 = r2;
    }
}
