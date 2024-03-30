package X;

import android.text.TextUtils;
import java.util.List;

/* renamed from: X.3Km  reason: invalid class name and case insensitive filesystem */
public class C63553Km {
    public final AnonymousClass185 A00;
    public final C20810yC A01;
    public final C19730wQ A02;
    public final AnonymousClass1KL A03;
    public final C19420v0 A04;
    public final C64463Ob A05;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if ((r2.A00() & com.facebook.msys.mci.DefaultCrypto.BUFFER_SIZE) <= 0) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A00(X.C207109uZ r4) {
        /*
            r3 = this;
            X.1KL r2 = r3.A03
            X.0yC r1 = r2.A00
            r0 = 3832(0xef8, float:5.37E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0015
            int r0 = r2.A00()
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            r0 = 1
            if (r1 > 0) goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            java.lang.String r1 = "UNBLOCKED"
            if (r0 == 0) goto L_0x0023
            if (r4 == 0) goto L_0x0023
            boolean r0 = r4.A0X
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = r4.A0B
            return r0
        L_0x0023:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63553Km.A00(X.9uZ):java.lang.String");
    }

    public boolean A01(C207109uZ r4) {
        if (this.A01.A0E(355) && r4 != null) {
            String str = r4.A0J;
            if (!TextUtils.isEmpty(str)) {
                return this.A05.A01(str);
            }
        }
        return false;
    }

    public boolean A02(C207109uZ r3) {
        C20810yC r1 = this.A01;
        if (!r1.A0E(355) || !r1.A0E(636) || !A01(r3)) {
            return false;
        }
        return true;
    }

    public boolean A03(C207109uZ r5) {
        List list;
        if (this.A03.A01()) {
            if (r5 == null) {
                return false;
            }
            if (r5.A0X && (list = r5.A0Q) != null && !this.A02.A0M(r5.A08)) {
                C19420v0 r2 = this.A04;
                String A002 = AnonymousClass1M4.A00(r2.A0f());
                if (A002 == null || A002.equals("ZZ")) {
                    A002 = AnonymousClass1M4.A01(r2.A0f(), r2.A0h());
                }
                return list.contains(A002);
            }
        }
        return true;
    }

    public C63553Km(C19730wQ r1, AnonymousClass1KL r2, AnonymousClass185 r3, C19420v0 r4, C20810yC r5, C64463Ob r6) {
        this.A01 = r5;
        this.A05 = r6;
        this.A04 = r4;
        this.A02 = r1;
        this.A00 = r3;
        this.A03 = r2;
    }
}
