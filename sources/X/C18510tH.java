package X;

/* renamed from: X.0tH  reason: invalid class name and case insensitive filesystem */
public class C18510tH implements AnonymousClass05H {
    public Object A00;
    public Object A01;
    public final int A02;

    public C18510tH(C009003v r1, AnonymousClass05H r2, int i) {
        this.A02 = i;
        switch (i) {
            case 1:
                this.A00 = r1;
                this.A01 = r2;
                break;
            case 3:
            case 5:
                this.A01 = r2;
                this.A00 = r1;
                break;
            default:
                this.A00 = r2;
                this.A01 = r1;
                break;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001d, code lost:
        return X.AnonymousClass0AO.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01a1, code lost:
        return X.AnonymousClass0AJ.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0047, code lost:
        r0 = r3.B36(r10, new X.C18480tE(r2, r11, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01d0, code lost:
        if (r0 != r6) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01d2, code lost:
        return r6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00db A[Catch:{ all -> 0x00e1 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object B36(X.C023509x r10, X.AnonymousClass05G r11) {
        /*
            r9 = this;
            int r0 = r9.A02
            switch(r0) {
                case 0: goto L_0x0066;
                case 1: goto L_0x0102;
                case 2: goto L_0x017b;
                case 3: goto L_0x001e;
                case 4: goto L_0x0034;
                case 5: goto L_0x003e;
                case 6: goto L_0x0051;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r9.A00
            X.05H[] r4 = (X.AnonymousClass05H[]) r4
            X.0lo r3 = X.C14550lo.A00
            java.lang.Object r2 = r9.A01
            X.08j r2 = (X.C019708j) r2
            r1 = 0
            X.0lL r0 = new X.0lL
            r0.<init>(r1, r2)
            java.lang.Object r0 = X.AnonymousClass0R5.A00(r10, r3, r0, r11, r4)
        L_0x0019:
            java.lang.Object r6 = X.AnonymousClass0AO.A00(r0)
            return r6
        L_0x001e:
            X.0fC r4 = new X.0fC
            r4.<init>()
            java.lang.Object r3 = r9.A01
            X.05H r3 = (X.AnonymousClass05H) r3
            java.lang.Object r2 = r9.A00
            r1 = 1
            X.0tF r0 = new X.0tF
            r0.<init>(r2, r4, r11, r1)
            java.lang.Object r0 = r3.B36(r10, r0)
            goto L_0x0019
        L_0x0034:
            java.lang.Object r3 = r9.A00
            X.05H r3 = (X.AnonymousClass05H) r3
            java.lang.Object r2 = r9.A01
            X.03v r2 = (X.C009003v) r2
            r1 = 1
            goto L_0x0047
        L_0x003e:
            java.lang.Object r3 = r9.A01
            X.05H r3 = (X.AnonymousClass05H) r3
            java.lang.Object r2 = r9.A00
            X.03v r2 = (X.C009003v) r2
            r1 = 3
        L_0x0047:
            X.0tE r0 = new X.0tE
            r0.<init>((X.C009003v) r2, (X.AnonymousClass05G) r11, (int) r1)
            java.lang.Object r0 = r3.B36(r10, r0)
            goto L_0x0019
        L_0x0051:
            java.lang.Object r4 = r9.A00
            X.05H[] r4 = (X.AnonymousClass05H[]) r4
            X.0lo r3 = X.C14550lo.A00
            java.lang.Object r2 = r9.A01
            X.08h r2 = (X.C019508h) r2
            r1 = 0
            X.0lK r0 = new X.0lK
            r0.<init>(r1, r2)
            java.lang.Object r0 = X.AnonymousClass0R5.A00(r10, r3, r0, r11, r4)
            goto L_0x0019
        L_0x0066:
            r1 = r9
            boolean r0 = r10 instanceof X.C13920kf
            if (r0 == 0) goto L_0x0090
            r4 = r10
            X.0kf r4 = (X.C13920kf) r4
            int r3 = r4.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x0090
            int r3 = r3 - r2
            r4.label = r3
        L_0x0079:
            java.lang.Object r8 = r4.result
            X.0AO r6 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r4.label
            r7 = 3
            r5 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x00ae
            if (r0 == r2) goto L_0x00a2
            if (r0 == r5) goto L_0x009a
            if (r0 != r7) goto L_0x00fd
            java.lang.Object r2 = r4.L$0
            X.0A0 r2 = (X.AnonymousClass0A0) r2
            goto L_0x0096
        L_0x0090:
            X.0kf r4 = new X.0kf
            r4.<init>(r9, r10)
            goto L_0x0079
        L_0x0096:
            X.AnonymousClass0AN.A00(r8)     // Catch:{ all -> 0x00e1 }
            goto L_0x00dc
        L_0x009a:
            java.lang.Object r0 = r4.L$0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            X.AnonymousClass0AN.A00(r8)
            throw r0
        L_0x00a2:
            java.lang.Object r11 = r4.L$1
            X.05G r11 = (X.AnonymousClass05G) r11
            java.lang.Object r1 = r4.L$0
            X.0tH r1 = (X.C18510tH) r1
            X.AnonymousClass0AN.A00(r8)     // Catch:{ all -> 0x00e6 }
            goto L_0x00c2
        L_0x00ae:
            X.AnonymousClass0AN.A00(r8)
            java.lang.Object r0 = r9.A01     // Catch:{ all -> 0x00e6 }
            X.05H r0 = (X.AnonymousClass05H) r0     // Catch:{ all -> 0x00e6 }
            r4.L$0 = r9     // Catch:{ all -> 0x00e6 }
            r4.L$1 = r11     // Catch:{ all -> 0x00e6 }
            r4.label = r2     // Catch:{ all -> 0x00e6 }
            java.lang.Object r0 = r0.B36(r4, r11)     // Catch:{ all -> 0x00e6 }
            if (r0 != r6) goto L_0x00c2
            return r6
        L_0x00c2:
            X.02h r0 = r4.getContext()
            X.0ks r2 = new X.0ks
            r2.<init>(r0, r11)
            java.lang.Object r0 = r1.A00     // Catch:{ all -> 0x00e1 }
            X.08g r0 = (X.C019408g) r0     // Catch:{ all -> 0x00e1 }
            r4.L$0 = r2     // Catch:{ all -> 0x00e1 }
            r4.L$1 = r3     // Catch:{ all -> 0x00e1 }
            r4.label = r7     // Catch:{ all -> 0x00e1 }
            java.lang.Object r0 = r0.BKt(r2, r3, r4)     // Catch:{ all -> 0x00e1 }
            if (r0 != r6) goto L_0x00dc
            return r6
        L_0x00dc:
            r2.releaseIntercepted()
            goto L_0x019f
        L_0x00e1:
            r0 = move-exception
            r2.releaseIntercepted()
            throw r0
        L_0x00e6:
            r0 = move-exception
            X.0j2 r2 = new X.0j2
            r2.<init>(r0)
            java.lang.Object r1 = r1.A00
            X.08g r1 = (X.C019408g) r1
            r4.L$0 = r0
            r4.L$1 = r3
            r4.label = r5
            java.lang.Object r1 = X.AnonymousClass0R2.A00(r0, r4, r1, r2)
            if (r1 != r6) goto L_0x0101
            return r6
        L_0x00fd:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
        L_0x0101:
            throw r0
        L_0x0102:
            r1 = r9
            boolean r0 = r10 instanceof X.C14000kn
            if (r0 == 0) goto L_0x0127
            r7 = r10
            X.0kn r7 = (X.C14000kn) r7
            int r3 = r7.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x0127
            int r3 = r3 - r2
            r7.label = r3
        L_0x0115:
            java.lang.Object r5 = r7.result
            X.0AO r6 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r7.label
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0142
            if (r0 == r3) goto L_0x0132
            if (r0 != r4) goto L_0x012d
            X.AnonymousClass0AN.A00(r5)
            goto L_0x019f
        L_0x0127:
            X.0kn r7 = new X.0kn
            r7.<init>(r9, r10)
            goto L_0x0115
        L_0x012d:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x0132:
            java.lang.Object r2 = r7.L$2
            X.0A0 r2 = (X.AnonymousClass0A0) r2
            java.lang.Object r11 = r7.L$1
            X.05G r11 = (X.AnonymousClass05G) r11
            java.lang.Object r1 = r7.L$0
            X.0tH r1 = (X.C18510tH) r1
            X.AnonymousClass0AN.A00(r5)     // Catch:{ all -> 0x0176 }
            goto L_0x0161
        L_0x0142:
            X.AnonymousClass0AN.A00(r5)
            X.02h r0 = r7.getContext()
            X.0ks r2 = new X.0ks
            r2.<init>(r0, r11)
            java.lang.Object r0 = r9.A00     // Catch:{ all -> 0x0176 }
            X.03v r0 = (X.C009003v) r0     // Catch:{ all -> 0x0176 }
            r7.L$0 = r9     // Catch:{ all -> 0x0176 }
            r7.L$1 = r11     // Catch:{ all -> 0x0176 }
            r7.L$2 = r2     // Catch:{ all -> 0x0176 }
            r7.label = r3     // Catch:{ all -> 0x0176 }
            java.lang.Object r0 = r0.invoke(r2, r7)     // Catch:{ all -> 0x0176 }
            if (r0 != r6) goto L_0x0161
            return r6
        L_0x0161:
            r2.releaseIntercepted()
            java.lang.Object r1 = r1.A01
            X.05H r1 = (X.AnonymousClass05H) r1
            r0 = 0
            r7.L$0 = r0
            r7.L$1 = r0
            r7.L$2 = r0
            r7.label = r4
            java.lang.Object r0 = r1.B36(r7, r11)
            goto L_0x01d0
        L_0x0176:
            r0 = move-exception
            r2.releaseIntercepted()
            throw r0
        L_0x017b:
            r0 = r9
            boolean r1 = r10 instanceof X.C13930kg
            if (r1 == 0) goto L_0x01d3
            r5 = r10
            X.0kg r5 = (X.C13930kg) r5
            int r3 = r5.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x01d3
            int r3 = r3 - r2
            r5.label = r3
        L_0x018e:
            java.lang.Object r4 = r5.result
            X.0AO r6 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r1 = r5.label
            r3 = 2
            r2 = 1
            if (r1 == 0) goto L_0x01a2
            if (r1 == r2) goto L_0x01b6
            if (r1 != r3) goto L_0x01d9
            X.AnonymousClass0AN.A00(r4)
        L_0x019f:
            X.0AJ r6 = X.AnonymousClass0AJ.A00
            return r6
        L_0x01a2:
            X.AnonymousClass0AN.A00(r4)
            java.lang.Object r1 = r9.A01
            X.05H r1 = (X.AnonymousClass05H) r1
            r5.L$0 = r9
            r5.L$1 = r11
            r5.label = r2
            java.lang.Object r4 = X.AnonymousClass0R3.A00(r5, r1, r11)
            if (r4 != r6) goto L_0x01bf
            return r6
        L_0x01b6:
            java.lang.Object r11 = r5.L$1
            java.lang.Object r0 = r5.L$0
            X.0tH r0 = (X.C18510tH) r0
            X.AnonymousClass0AN.A00(r4)
        L_0x01bf:
            if (r4 == 0) goto L_0x019f
            java.lang.Object r1 = r0.A00
            X.08g r1 = (X.C019408g) r1
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.label = r3
            java.lang.Object r0 = r1.BKt(r11, r4, r5)
        L_0x01d0:
            if (r0 != r6) goto L_0x019f
            return r6
        L_0x01d3:
            X.0kg r5 = new X.0kg
            r5.<init>(r9, r10)
            goto L_0x018e
        L_0x01d9:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18510tH.B36(X.09x, X.05G):java.lang.Object");
    }

    public C18510tH(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A01 = obj2;
        this.A00 = obj;
    }
}
