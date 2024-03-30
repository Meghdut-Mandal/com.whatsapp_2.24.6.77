package X;

import android.database.Cursor;

/* renamed from: X.2bL  reason: invalid class name */
public abstract class AnonymousClass2bL extends AnonymousClass3T1 {
    public double A00;
    public double A01;
    public int A02;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (r3.A02 == 2) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A1Q() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = super.A1Q()     // Catch:{ all -> 0x0010 }
            if (r0 != 0) goto L_0x000d
            int r2 = r3.A02     // Catch:{ all -> 0x0010 }
            r1 = 2
            r0 = 0
            if (r2 != r1) goto L_0x000e
        L_0x000d:
            r0 = 1
        L_0x000e:
            monitor-exit(r3)
            return r0
        L_0x0010:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2bL.A1Q():boolean");
    }

    public void A1X(Cursor cursor) {
        this.A00 = C36431kI.A00(cursor, "latitude");
        this.A01 = C36431kI.A00(cursor, "longitude");
        A1D(C36391kE.A1b(cursor, "thumbnail"), true);
    }

    public void A1Y(Cursor cursor, C19730wQ r4) {
        this.A00 = C36431kI.A00(cursor, "latitude");
        this.A01 = C36431kI.A00(cursor, "longitude");
        this.A02 = C36351kA.A03(cursor, "map_download_status");
    }

    public AnonymousClass2bL(C64933Qa r2, int i, long j) {
        super(r2, i, j);
        this.A02 = 1;
        this.A02 = 0;
    }

    public static String A00(AnonymousClass2bL r2, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(r2.A00);
        sb.append(",");
        sb.append(r2.A01);
        return sb.toString();
    }

    public C63683Kz A0V() {
        C63683Kz A0V = super.A0V();
        C18740tg.A06(A0V);
        return A0V;
    }

    public AnonymousClass2bL(C64933Qa r10, AnonymousClass2bL r11, int i, long j, boolean z) {
        super(r11, r10, i, j, z);
        this.A02 = 1;
        this.A00 = r11.A00;
        this.A01 = r11.A01;
        this.A02 = r11.A02;
    }
}
