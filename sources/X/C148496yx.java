package X;

/* renamed from: X.6yx  reason: invalid class name and case insensitive filesystem */
public class C148496yx implements C158487ha {
    public C161257mS[] A00;
    public final AnonymousClass17Y A01;
    public final C19630wG A02;
    public final AnonymousClass1Q1 A03;
    public final C20410xW A04;

    public C148496yx(AnonymousClass17Y r4, C19630wG r5, AnonymousClass1Q1 r6, C20410xW r7) {
        this.A01 = r4;
        this.A02 = r5;
        this.A03 = r6;
        this.A04 = r7;
        this.A00 = new C161257mS[]{new C148476yv(r5), new C148486yw(r5)};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0072, code lost:
        if ((r3 instanceof X.AnonymousClass2bV) != false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f5, code lost:
        if (r9 != 6) goto L_0x00f7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x003c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass37T BHS(android.content.Context r27, java.lang.String r28, java.util.List r29) {
        /*
            r26 = this;
            X.C18740tg.A00()
            r4 = r29
            boolean r0 = r4.isEmpty()
            r8 = 0
            if (r0 == 0) goto L_0x000d
            return r8
        L_0x000d:
            X.37T r6 = new X.37T
            r6.<init>()
            r12 = r26
            X.7mS[] r3 = r12.A00
            r2 = 2
            r1 = 0
        L_0x0018:
            r11 = r3[r1]
            boolean r0 = r11.BNf()
            if (r0 == 0) goto L_0x00c5
            java.util.ArrayList r13 = X.AnonymousClass001.A0I()
            X.0xW r1 = r12.A04
            X.5zu r0 = X.AnonymousClass6K3.A02
            r2 = r27
            X.6K3 r0 = r0.A00(r2, r1, r4)
            int r9 = r0.A00
            if (r9 == 0) goto L_0x012c
            java.util.Map r0 = r0.A01
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            java.util.Iterator r17 = X.AnonymousClass000.A0y(r0)
        L_0x003c:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x00e1
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r17)
            java.lang.Object r3 = r0.getKey()
            X.3T1 r3 = (X.AnonymousClass3T1) r3
            java.lang.Object r10 = r0.getValue()
            X.5r8 r10 = (X.C120205r8) r10
            java.io.File r5 = r10.A00
            X.0wG r0 = r12.A02     // Catch:{ IllegalArgumentException -> 0x00cb }
            android.content.Context r1 = r0.A00     // Catch:{ IllegalArgumentException -> 0x00cb }
            java.lang.String r0 = X.C19430v1.A07     // Catch:{ IllegalArgumentException -> 0x00cb }
            android.net.Uri r4 = androidx.core.content.FileProvider.A00(r1, r5, r0)     // Catch:{ IllegalArgumentException -> 0x00cb }
            java.lang.Integer r0 = X.C36381kD.A0m()
            android.util.Pair r1 = android.util.Pair.create(r0, r0)
            boolean r2 = r3 instanceof X.C46882bp
            java.lang.String r21 = ""
            if (r2 != 0) goto L_0x00b4
            boolean r0 = r3 instanceof X.C47002cZ
            if (r0 != 0) goto L_0x00b4
            boolean r0 = r3 instanceof X.AnonymousClass2bV
            if (r0 == 0) goto L_0x0078
        L_0x0074:
            android.util.Pair r1 = X.AnonymousClass1GW.A0B(r5)
        L_0x0078:
            if (r4 == 0) goto L_0x003c
            java.lang.Object r0 = r1.first
            X.C18740tg.A06(r0)
            int r0 = X.AnonymousClass000.A0I(r0)
            double r2 = (double) r0
            java.lang.Object r0 = r1.second
            X.C18740tg.A06(r0)
            int r0 = X.AnonymousClass000.A0I(r0)
            double r0 = (double) r0
            r15 = 0
            int r14 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r14 != 0) goto L_0x00b2
            r0 = 0
        L_0x0096:
            int r25 = X.AnonymousClass1GW.A04(r5)
            java.lang.String r3 = r10.A01
            r7.add(r4)
            X.5xQ r2 = new X.5xQ
            r20 = r5
            r22 = r3
            r23 = r0
            r18 = r2
            r19 = r4
            r18.<init>(r19, r20, r21, r22, r23, r25)
            r13.add(r2)
            goto L_0x003c
        L_0x00b2:
            double r0 = r0 / r2
            goto L_0x0096
        L_0x00b4:
            X.2bU r3 = (X.AnonymousClass2bU) r3
            java.lang.String r0 = r3.A1a()
            if (r0 == 0) goto L_0x00be
            r21 = r0
        L_0x00be:
            if (r2 != 0) goto L_0x0074
            android.util.Pair r1 = X.AnonymousClass1GW.A0D(r5)
            goto L_0x0078
        L_0x00c5:
            int r1 = r1 + 1
            if (r1 >= r2) goto L_0x012c
            goto L_0x0018
        L_0x00cb:
            X.17Y r3 = r12.A01
            X.1Q1 r2 = r12.A03
            r1 = 26
            X.74v r0 = new X.74v
            r4 = r28
            r0.<init>(r1, r4, r2)
            r3.A0H(r0)
            java.lang.String r0 = "getSharingIntent: Attempting to share file failed"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r8
        L_0x00e1:
            android.content.Intent r5 = r11.BHR(r13, r9)
            r6.A01 = r5
            r6.A02 = r7
            if (r5 != 0) goto L_0x00fb
            boolean r0 = r11 instanceof X.C148476yv
            if (r0 == 0) goto L_0x00f7
            r0 = 7
            r1 = 1
            if (r9 == r0) goto L_0x00f8
            r0 = 6
            r1 = 2
            if (r9 == r0) goto L_0x00f8
        L_0x00f7:
            r1 = 0
        L_0x00f8:
            r6.A00 = r1
            return r6
        L_0x00fb:
            int r0 = r7.size()
            r4 = 1
            if (r0 <= 0) goto L_0x0129
            java.lang.Object r0 = X.C36441kJ.A12(r7)
            android.net.Uri r0 = (android.net.Uri) r0
            android.content.ClipData r3 = android.content.ClipData.newRawUri(r8, r0)
            r2 = 1
        L_0x010d:
            int r0 = r7.size()
            if (r2 >= r0) goto L_0x0124
            java.lang.Object r1 = r7.get(r2)
            android.net.Uri r1 = (android.net.Uri) r1
            android.content.ClipData$Item r0 = new android.content.ClipData$Item
            r0.<init>(r1)
            r3.addItem(r0)
            int r2 = r2 + 1
            goto L_0x010d
        L_0x0124:
            if (r3 == 0) goto L_0x0129
            r5.setClipData(r3)
        L_0x0129:
            r5.addFlags(r4)
        L_0x012c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C148496yx.BHS(android.content.Context, java.lang.String, java.util.List):X.37T");
    }
}
