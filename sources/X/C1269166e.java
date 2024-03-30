package X;

import android.util.LongSparseArray;
import java.util.Objects;

/* renamed from: X.66e  reason: invalid class name and case insensitive filesystem */
public final class C1269166e {
    public final LongSparseArray A00;
    public final C129986Jg A01;
    public final C123035vp A02;

    public final C130326Kq A00(C140456lc r5, boolean z) {
        Object A05;
        AnonymousClass00C.A0D(r5, 0);
        Object[] A0M = AnonymousClass001.A0M();
        AnonymousClass000.A1L(A0M, r5.A03, 0);
        C36421kH.A1R(A0M, z);
        long hash = (long) Objects.hash(A0M);
        C130326Kq r3 = (C130326Kq) this.A00.get(hash);
        if (r3 != null) {
            return r3;
        }
        AnonymousClass5oS r0 = this.A01.A00;
        Object obj = null;
        if (!(r0 == null || (A05 = r0.A00.A05(hash)) == null)) {
            obj = A05;
        }
        return (C130326Kq) obj;
    }

    public final void A01(C130326Kq r5, C140456lc r6, boolean z) {
        boolean A1a = C36341k9.A1a(r6, r5);
        Object[] A0M = AnonymousClass001.A0M();
        AnonymousClass000.A1L(A0M, r6.A03, 0);
        AnonymousClass000.A1N(A0M, A1a ? 1 : 0, z);
        long hash = (long) Objects.hash(A0M);
        this.A00.put(hash, r5);
        this.A01.A01.A00.A0A(hash, r5);
    }

    public C1269166e(C123035vp r3, C140456lc r4) {
        this.A02 = r3;
        this.A00 = new LongSparseArray(r4.A0b().size());
        this.A01 = (C129986Jg) r3.A04.getValue();
    }
}
