package X;

import com.whatsapp.util.Log;

/* renamed from: X.1Jf  reason: invalid class name and case insensitive filesystem */
public final class C26191Jf {
    public final AnonymousClass005 A00;
    public final C19700wN A01;
    public final C26201Jg A02;

    public C26191Jf(C19700wN r2, C26201Jg r3, AnonymousClass005 r4) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r4, 2);
        AnonymousClass00C.A0D(r3, 3);
        this.A01 = r2;
        this.A00 = r4;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass3T1 A00(X.C64933Qa r4) {
        /*
            r3 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            X.1Jg r0 = r3.A02
            android.database.Cursor r2 = r0.A00(r4)
            r1 = 0
            if (r2 == 0) goto L_0x002d
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x002a
            X.005 r0 = r3.A00     // Catch:{ all -> 0x0023 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0023 }
            X.1A1 r0 = (X.AnonymousClass1A1) r0     // Catch:{ all -> 0x0023 }
            X.3T1 r0 = r0.A00(r2)     // Catch:{ all -> 0x0023 }
            r2.close()
            return r0
        L_0x0023:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)
            throw r0
        L_0x002a:
            r2.close()
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26191Jf.A00(X.3Qa):X.3T1");
    }

    public final C64933Qa A01(C64933Qa r2) {
        AnonymousClass00C.A0D(r2, 0);
        AnonymousClass3T1 A03 = ((AnonymousClass1A1) this.A00.get()).A03(r2);
        if (A03 == null && (A03 = A00(r2)) == null) {
            return null;
        }
        return A03.A1J;
    }

    public final C64933Qa A02(C64933Qa r5) {
        AnonymousClass3T1 A03 = ((AnonymousClass1A1) this.A00.get()).A03(r5);
        if (A03 == null) {
            return null;
        }
        if (!A03.A1T(C132986Wc.A0F)) {
            return r5;
        }
        AnonymousClass37F A0X = A03.A0X();
        if (A0X == null) {
            this.A02.A01(A03);
            if (A03.A0X() == null) {
                Log.e("ReferentialKeyUtil/getOriginalKey/editInfo is null for an edited message");
                this.A01.A0E("ReferentialKeyUtil/getOriginalKey/editInfo is null for an edited message", (String) null, true);
                return null;
            }
            A0X = A03.A0X();
            if (A0X == null) {
                return null;
            }
        }
        return A0X.A02;
    }
}
