package X;

/* renamed from: X.6N7  reason: invalid class name */
public final class AnonymousClass6N7 {
    public final C20830yE A00;
    public final C19700wN A01;
    public final C21060yb A02;
    public final C20810yC A03;
    public final AnonymousClass1A2 A04;

    public static final C135036c1 A00(String str, int i, boolean z) {
        C135036c1 r1 = new C135036c1((String) null, 0, 0, 0, false, false);
        r1.A01 = 2;
        r1.A00 = i;
        r1.A02 = 2;
        r1.A03 = str;
        r1.A04 = z;
        return r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0081, code lost:
        if ((r1 & 1) != 0) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c7, code lost:
        if (r2 != 3) goto L_0x00c9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C88924Uo A01(X.C135036c1 r15) {
        /*
            r14 = this;
            r4 = 0
            int r2 = r15.A01
            int r1 = r15.A00
            int r12 = r15.A02
            java.lang.String r11 = r15.A03
            boolean r0 = r15.A05
            if (r0 != 0) goto L_0x0139
            X.0yb r8 = r14.A02
            X.0ya r0 = r8.A0O()
            if (r0 == 0) goto L_0x0139
            java.lang.String r5 = android.os.Environment.getExternalStorageState()
            X.0yE r3 = r14.A00
            boolean r0 = r3.A0I(r5)
            if (r0 != 0) goto L_0x0045
            java.lang.String r0 = "mounted_ro"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0033
            java.lang.String[] r0 = X.AnonymousClass3TA.A04()
            int r0 = r3.A03(r0)
            if (r0 == 0) goto L_0x0045
        L_0x0033:
            java.lang.String r0 = "mounted"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0053
            java.lang.String[] r0 = X.AnonymousClass3TA.A02()
            int r0 = r3.A03(r0)
            if (r0 != 0) goto L_0x0053
        L_0x0045:
            r5 = 1
        L_0x0046:
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
            r3 = 1
            if (r5 == 0) goto L_0x00c4
            if (r2 == r3) goto L_0x00ec
            r5 = 7
            if (r1 != r5) goto L_0x007f
            goto L_0x0055
        L_0x0053:
            r5 = 0
            goto L_0x0046
        L_0x0055:
            X.0yC r9 = r14.A03     // Catch:{ SQLiteException -> 0x006d }
            X.1A2 r10 = r14.A04     // Catch:{ SQLiteException -> 0x006d }
            java.lang.String r5 = "external"
            android.net.Uri r7 = android.provider.MediaStore.Files.getContentUri(r5)     // Catch:{ SQLiteException -> 0x006d }
            X.AnonymousClass00C.A08(r7)     // Catch:{ SQLiteException -> 0x006d }
            boolean r13 = r15.A04     // Catch:{ SQLiteException -> 0x006d }
            X.59F r6 = new X.59F     // Catch:{ SQLiteException -> 0x006d }
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ SQLiteException -> 0x006d }
            r0.add(r6)     // Catch:{ SQLiteException -> 0x006d }
            goto L_0x00c4
        L_0x006d:
            r6 = move-exception
            java.lang.String r5 = "MediaManager/makeMediaList exception"
            com.whatsapp.util.Log.e(r5, r6)
            X.0wN r7 = r14.A01
            java.lang.String r6 = r6.getMessage()
            java.lang.String r5 = "MediaManager/makeMediaList/sqliteException"
            r7.A0E(r5, r6, r3)
            goto L_0x0083
        L_0x007f:
            r5 = r1 & 1
            if (r5 == 0) goto L_0x0096
        L_0x0083:
            X.0yC r9 = r14.A03
            X.1A2 r10 = r14.A04
            android.net.Uri r7 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            X.AnonymousClass00C.A09(r7)
            boolean r13 = r15.A04
            X.59E r6 = new X.59E
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r0.add(r6)
        L_0x0096:
            r5 = r1 & 4
            if (r5 == 0) goto L_0x00ad
            X.0yC r9 = r14.A03
            X.1A2 r10 = r14.A04
            android.net.Uri r7 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            X.AnonymousClass00C.A09(r7)
            boolean r13 = r15.A04
            X.59C r6 = new X.59C
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r0.add(r6)
        L_0x00ad:
            r5 = r1 & 2
            if (r5 == 0) goto L_0x00c4
            X.0yC r9 = r14.A03
            X.1A2 r10 = r14.A04
            android.net.Uri r7 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            X.AnonymousClass00C.A09(r7)
            boolean r13 = r15.A04
            X.59D r6 = new X.59D
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r0.add(r6)
        L_0x00c4:
            if (r2 == r3) goto L_0x00ec
            r5 = 3
            if (r2 == r5) goto L_0x00ec
        L_0x00c9:
            java.util.Iterator r5 = r0.iterator()
            X.AnonymousClass00C.A08(r5)
        L_0x00d0:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x011b
            java.lang.Object r2 = r5.next()
            X.AnonymousClass00C.A08(r2)
            X.3mI r2 = (X.C74863mI) r2
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x00d0
            r2.close()
            r5.remove()
            goto L_0x00d0
        L_0x00ec:
            r2 = r1 & 1
            if (r2 == 0) goto L_0x0103
            X.0yC r9 = r14.A03
            X.1A2 r10 = r14.A04
            android.net.Uri r7 = android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI
            X.AnonymousClass00C.A09(r7)
            boolean r13 = r15.A04
            X.59E r6 = new X.59E
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r0.add(r6)
        L_0x0103:
            r1 = r1 & 2
            if (r1 == 0) goto L_0x00c9
            X.0yC r9 = r14.A03
            X.1A2 r10 = r14.A04
            android.net.Uri r7 = android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI
            X.AnonymousClass00C.A09(r7)
            boolean r13 = r15.A04
            X.59D r6 = new X.59D
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r0.add(r6)
            goto L_0x00c9
        L_0x011b:
            int r1 = r0.size()
            if (r1 != r3) goto L_0x012b
            java.lang.Object r1 = r0.get(r4)
            X.AnonymousClass00C.A0B(r1)
        L_0x0128:
            X.4Uo r1 = (X.C88924Uo) r1
            return r1
        L_0x012b:
            X.4Uo[] r1 = new X.C88924Uo[r4]
            java.lang.Object[] r0 = r0.toArray(r1)
            X.4Uo[] r0 = (X.C88924Uo[]) r0
            X.6uM r1 = new X.6uM
            r1.<init>(r0, r12)
            goto L_0x0128
        L_0x0139:
            X.6uL r1 = new X.6uL
            r1.<init>()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6N7.A01(X.6c1):X.4Uo");
    }

    public AnonymousClass6N7(C19700wN r1, C21060yb r2, C20830yE r3, C20810yC r4, AnonymousClass1A2 r5) {
        C36321k7.A1B(r4, r1, r2, r5, r3);
        this.A03 = r4;
        this.A01 = r1;
        this.A02 = r2;
        this.A04 = r5;
        this.A00 = r3;
    }
}
