package X;

import android.graphics.Bitmap;

/* renamed from: X.6Mz  reason: invalid class name and case insensitive filesystem */
public final class C130926Mz {
    public final AnonymousClass61E A00;
    public final C005502l A01;
    public final C20050ww A02;
    public final AnonymousClass13E A03;

    public static final Bitmap A00(C130926Mz r4, String str) {
        C146096v1 A05 = r4.A03.A05(str);
        AnonymousClass00C.A08(A05);
        AnonymousClass5RE B8D = A05.B8D(r4.A02, (Integer) null, 35);
        AnonymousClass61E r2 = r4.A00;
        String A04 = C18750th.A04(str);
        C18740tg.A06(A04);
        AnonymousClass00C.A08(A04);
        ((C132416Tn) r2.A00.getValue()).A04(B8D, A04);
        return r2.A01(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0068 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0018 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A01(java.util.List r7, boolean r8, boolean r9) {
        /*
            r6 = this;
            if (r8 == 0) goto L_0x0010
            X.61E r0 = r6.A00
            X.00T r0 = r0.A00
            java.lang.Object r1 = r0.getValue()
            X.6Tn r1 = (X.C132416Tn) r1
            r0 = 1
            r1.A05(r0)
        L_0x0010:
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.util.Iterator r5 = r7.iterator()
        L_0x0018:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0073
            java.lang.Object r2 = r5.next()
            X.6bN r2 = (X.C134646bN) r2
            r3 = 0
            if (r8 == 0) goto L_0x0037
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x004f }
            android.graphics.Bitmap r1 = A00(r6, r0)     // Catch:{ all -> 0x004f }
            if (r1 == 0) goto L_0x0055
            java.lang.String r0 = r2.A00     // Catch:{ all -> 0x004f }
            X.6AY r2 = new X.6AY     // Catch:{ all -> 0x004f }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x004f }
            goto L_0x0056
        L_0x0037:
            X.61E r1 = r6.A00     // Catch:{ all -> 0x004f }
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x004f }
            android.graphics.Bitmap r1 = r1.A01(r0)     // Catch:{ all -> 0x004f }
            if (r1 != 0) goto L_0x0045
            android.graphics.Bitmap r1 = A00(r6, r0)     // Catch:{ all -> 0x004f }
        L_0x0045:
            if (r1 == 0) goto L_0x0055
            java.lang.String r0 = r2.A00     // Catch:{ all -> 0x004f }
            X.6AY r2 = new X.6AY     // Catch:{ all -> 0x004f }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x004f }
            goto L_0x0056
        L_0x004f:
            r0 = move-exception
            X.03N r2 = X.C90524aI.A0t(r0)
            goto L_0x0056
        L_0x0055:
            r2 = r3
        L_0x0056:
            java.lang.Throwable r1 = X.AnonymousClass0AK.A00(r2)
            if (r1 == 0) goto L_0x0061
            java.lang.String r0 = "AvatarProfilePhotoPosesFetcher/fetchPoses"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0061:
            boolean r0 = r2 instanceof X.AnonymousClass03N
            if (r0 != 0) goto L_0x0066
            r3 = r2
        L_0x0066:
            if (r9 == 0) goto L_0x006d
            if (r3 != 0) goto L_0x006d
            X.09w r0 = X.C023409w.A00
            return r0
        L_0x006d:
            if (r3 == 0) goto L_0x0018
            r4.add(r3)
            goto L_0x0018
        L_0x0073:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C130926Mz.A01(java.util.List, boolean, boolean):java.util.List");
    }

    public C130926Mz(C20050ww r2, C19630wG r3, AnonymousClass13E r4, C005502l r5) {
        C36321k7.A18(r3, r2, r4, r5);
        this.A02 = r2;
        this.A03 = r4;
        this.A01 = r5;
        this.A00 = new AnonymousClass61E(r3);
    }
}
