package X;

import android.util.Log;
import com.facebook.android.exoplayer2.util.Util;

/* renamed from: X.9zb  reason: invalid class name and case insensitive filesystem */
public final class C209189zb implements B2A {
    public final int A00;
    public final int A01;
    public final C202309lW A02;

    public int Bmv() {
        int i = this.A00;
        if (i == -1) {
            return this.A02.A05();
        }
        return i;
    }

    public C209189zb(C207099uY r6, C1688482g r7) {
        C202309lW r4 = r7.A00;
        this.A02 = r4;
        r4.A0I(12);
        int A05 = r4.A05();
        if ("audio/raw".equals(r6.A0S)) {
            int A022 = Util.A02(r6.A0B, r6.A05);
            if (A05 == 0 || A05 % A022 != 0) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Audio sample size mismatch. stsd sample size: ");
                A0u.append(A022);
                Log.w("AtomParsers", AnonymousClass000.A0r(", stsz sample size: ", A0u, A05));
                A05 = A022;
            }
            this.A00 = A05;
            this.A01 = r4.A05();
        }
        if (A05 == 0) {
            A05 = -1;
        }
        this.A00 = A05;
        this.A01 = r4.A05();
    }

    public int BBw() {
        return this.A00;
    }

    public int BGw() {
        return this.A01;
    }
}
