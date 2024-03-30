package X;

/* renamed from: X.1bF  reason: invalid class name and case insensitive filesystem */
public final class C31081bF {
    public final C19630wG A00;
    public final AnonymousClass19A A01;
    public final C20810yC A02;

    public C31081bF(C19630wG r2, C20810yC r3, AnonymousClass19A r4) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 2);
        AnonymousClass00C.A0D(r4, 3);
        this.A02 = r3;
        this.A00 = r2;
        this.A01 = r4;
    }

    /* JADX WARNING: type inference failed for: r5v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C62373Fx r22, X.C159677jk r23, java.lang.Integer r24, java.lang.String r25, java.lang.String r26, java.lang.String r27) {
        /*
            r21 = this;
            r18 = 1
            r12 = 0
            r0 = r22
            if (r22 == 0) goto L_0x009b
            java.util.List r2 = r0.A01
            int r0 = r0.A00
            if (r0 != 0) goto L_0x0095
            r9 = 0
        L_0x000e:
            r6 = r21
            X.19A r4 = r6.A01
            java.lang.String r3 = r4.A09()
            X.0yC r8 = r6.A02
            r0 = 2792(0xae8, float:3.912E-42)
            X.0yV r7 = X.C21000yV.A02
            boolean r5 = X.C20800yB.A01(r7, r8, r0)
            r15 = r27
            if (r27 == 0) goto L_0x0092
            r1 = 4116(0x1014, float:5.768E-42)
            int r0 = X.C20800yB.A00(r7, r8, r1)
            if (r0 <= 0) goto L_0x0092
            int r0 = X.C20800yB.A00(r7, r8, r1)
            java.lang.String r17 = java.lang.String.valueOf(r0)
        L_0x0034:
            if (r5 == 0) goto L_0x0040
            if (r9 == 0) goto L_0x0040
            long r0 = java.lang.Long.parseLong(r9)
            java.lang.Long r12 = java.lang.Long.valueOf(r0)
        L_0x0040:
            if (r2 == 0) goto L_0x00a7
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x00a7
            r0 = 10
            int r0 = X.AnonymousClass03U.A06(r2, r0)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
            java.util.Iterator r11 = r2.iterator()
        L_0x0057:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00a9
            java.lang.Object r8 = r11.next()
            X.3J4 r8 = (X.AnonymousClass3J4) r8
            android.os.Parcelable$Creator r0 = X.AnonymousClass147.CREATOR
            X.11F r0 = r8.A01
            X.147 r7 = X.C65533Sl.A03(r0)
            if (r7 == 0) goto L_0x009f
            java.lang.Long r1 = r8.A00
            if (r1 != 0) goto L_0x0089
            java.lang.Long r0 = r8.A02
            long r0 = r0.longValue()
            r9 = -1
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 == 0) goto L_0x0083
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r9 = r2.toSeconds(r0)
        L_0x0083:
            java.lang.Long r1 = java.lang.Long.valueOf(r9)
            r8.A00 = r1
        L_0x0089:
            X.1jQ r0 = new X.1jQ
            r0.<init>((X.AnonymousClass147) r7, (java.lang.Long) r1)
            r5.add(r0)
            goto L_0x0057
        L_0x0092:
            r17 = r12
            goto L_0x0034
        L_0x0095:
            java.lang.String r9 = java.lang.String.valueOf(r0)
            goto L_0x000e
        L_0x009b:
            r2 = r12
            r9 = r12
            goto L_0x000e
        L_0x009f:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00a7:
            X.09w r5 = X.C023409w.A00
        L_0x00a9:
            java.util.ArrayList r0 = X.C185688ud.A00
            if (r24 == 0) goto L_0x00e7
            int r0 = r24.intValue()
        L_0x00b1:
            long r0 = (long) r0
            java.lang.Long r13 = java.lang.Long.valueOf(r0)
            X.8ud r11 = new X.8ud
            r14 = r25
            r16 = r26
            r11.<init>(r12, r13, r14, r15, r16, r17)
            X.8uo r0 = new X.8uo
            r0.<init>(r11, r5)
            X.8up r1 = new X.8up
            r1.<init>(r0)
            X.1jS r0 = new X.1jS
            r0.<init>((X.C16490pK) r1, (java.lang.String) r3)
            X.9nx r2 = r0.A00
            X.AnonymousClass00C.A08(r2)
            r1 = 2
            X.7tT r0 = new X.7tT
            r5 = r23
            r0.<init>(r5, r6, r1)
            r19 = 32000(0x7d00, double:1.581E-319)
            r14 = r4
            r15 = r0
            r16 = r2
            r17 = r3
            r14.A0K(r15, r16, r17, r18, r19)
            return
        L_0x00e7:
            r0 = 1
            goto L_0x00b1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31081bF.A00(X.3Fx, X.7jk, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
