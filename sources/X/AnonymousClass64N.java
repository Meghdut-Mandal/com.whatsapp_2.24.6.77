package X;

/* renamed from: X.64N  reason: invalid class name */
public final class AnonymousClass64N {
    public final AnonymousClass005 A00;
    public final AnonymousClass005 A01;
    public final AnonymousClass005 A02;
    public final AnonymousClass005 A03;
    public final AnonymousClass00T A04 = C36431kI.A1I(new AnonymousClass7N9(this));
    public final AnonymousClass005 A05;

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0097, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0098, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.widget.ImageView r15, X.AnonymousClass6KE r16, java.lang.String r17, java.lang.String r18) {
        /*
            r14 = this;
            r3 = 0
            r8 = r17
            X.AnonymousClass00C.A0D(r8, r3)
            r13 = 1
            r6 = r15
            r9 = r18
            X.C36321k7.A0v(r9, r13, r15)
            java.lang.String r1 = "file:///"
            r4 = 0
            boolean r0 = X.AnonymousClass098.A07(r8, r1, r3)
            if (r0 != 0) goto L_0x00e7
            java.lang.String r0 = "file:/"
            boolean r0 = X.AnonymousClass098.A07(r8, r0, r3)
            if (r0 != 0) goto L_0x00e7
            java.lang.String r0 = "android.resource"
            boolean r0 = X.AnonymousClass098.A07(r8, r0, r3)
            if (r0 == 0) goto L_0x002e
            android.net.Uri r0 = android.net.Uri.parse(r8)
            r15.setImageURI(r0)
            return
        L_0x002e:
            java.lang.String r0 = "content"
            boolean r0 = X.AnonymousClass098.A07(r8, r0, r3)
            if (r0 == 0) goto L_0x00a1
            android.net.Uri r3 = android.net.Uri.parse(r8)
            X.005 r1 = r14.A05
            java.lang.Object r0 = r1.get()
            X.0yb r0 = (X.C21060yb) r0
            X.0ya r0 = r0.A0O()
            if (r0 == 0) goto L_0x0056
            java.io.InputStream r2 = r0.A06(r3)
            if (r2 == 0) goto L_0x0056
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeStream(r2)     // Catch:{ all -> 0x0095 }
            r2.close()
            goto L_0x0057
        L_0x0056:
            r7 = r4
        L_0x0057:
            java.lang.Object r0 = r1.get()
            X.0yb r0 = (X.C21060yb) r0
            X.0ya r0 = r0.A0O()
            if (r0 == 0) goto L_0x009c
            java.io.InputStream r2 = r0.A06(r3)
            if (r2 == 0) goto L_0x009c
            X.9oz r0 = new X.9oz     // Catch:{ all -> 0x0095 }
            r0.<init>((java.io.InputStream) r2)     // Catch:{ all -> 0x0095 }
            r2.close()
            int r1 = r0.A0Y(r13)
            r0 = 6
            if (r1 != r0) goto L_0x009c
            if (r7 == 0) goto L_0x009d
            r0 = 1119092736(0x42b40000, float:90.0)
            r8 = 0
            android.graphics.Matrix r12 = X.C90524aI.A0B()
            r12.postRotate(r0)
            int r10 = r7.getWidth()
            int r11 = r7.getHeight()
            r9 = 0
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r7, r8, r9, r10, r11, r12, r13)
            X.AnonymousClass00C.A08(r4)
            goto L_0x009d
        L_0x0095:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0097 }
        L_0x0097:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)
            throw r0
        L_0x009c:
            r4 = r7
        L_0x009d:
            r15.setImageBitmap(r4)
            return
        L_0x00a1:
            r0 = r16
            if (r16 == 0) goto L_0x00cc
            X.6zY r7 = new X.6zY
            r7.<init>(r0)
        L_0x00aa:
            int r10 = r15.getWidth()
            int r11 = r15.getHeight()
            if (r10 <= 0) goto L_0x00ce
            if (r11 <= 0) goto L_0x00ce
            X.00T r0 = r14.A04
            java.lang.Object r0 = r0.getValue()
            X.6CW r0 = (X.AnonymousClass6CW) r0
            X.6pd r3 = new X.6pd
            r5 = r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            X.6Po r1 = r0.A02
            boolean r0 = r0.A03
            r1.A01(r3, r0)
            return
        L_0x00cc:
            r7 = r4
            goto L_0x00aa
        L_0x00ce:
            X.00T r0 = r14.A04
            java.lang.Object r0 = r0.getValue()
            X.6CW r0 = (X.AnonymousClass6CW) r0
            int r10 = r0.A01
            X.6pd r3 = new X.6pd
            r5 = r4
            r11 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            X.6Po r1 = r0.A02
            boolean r0 = r0.A03
            r1.A01(r3, r0)
            return
        L_0x00e7:
            java.lang.String r2 = ""
            java.lang.String r1 = X.AnonymousClass098.A05(r8, r1, r2, r3)
            java.lang.String r0 = "file:/"
            java.lang.String r0 = X.AnonymousClass098.A05(r1, r0, r2, r3)
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r0)
            r15.setImageBitmap(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass64N.A00(android.widget.ImageView, X.6KE, java.lang.String, java.lang.String):void");
    }

    public AnonymousClass64N(AnonymousClass005 r2, AnonymousClass005 r3, AnonymousClass005 r4, AnonymousClass005 r5, AnonymousClass005 r6) {
        C36321k7.A1B(r2, r3, r4, r5, r6);
        this.A02 = r2;
        this.A00 = r3;
        this.A01 = r4;
        this.A03 = r5;
        this.A05 = r6;
    }
}
