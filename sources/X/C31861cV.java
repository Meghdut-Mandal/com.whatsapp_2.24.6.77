package X;

/* renamed from: X.1cV  reason: invalid class name and case insensitive filesystem */
public class C31861cV {
    public final AnonymousClass16D A00;
    public final C20310xM A01;
    public final AnonymousClass17Y A02;
    public final C26421Kc A03;
    public final AnonymousClass185 A04;
    public final C19770wU A05;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r4.A05 != r23) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(com.whatsapp.jid.UserJid r19, X.C80113ur r20, byte[] r21, int r22, long r23) {
        /*
            r18 = this;
            r8 = r18
            X.185 r5 = r8.A04
            r9 = r19
            X.3L0 r4 = r5.A02(r9)
            r2 = r23
            if (r4 == 0) goto L_0x0015
            long r0 = r4.A05
            int r6 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            r7 = 1
            if (r6 == 0) goto L_0x0016
        L_0x0015:
            r7 = 0
        L_0x0016:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "BusinessVnameHelper/updateBizVerifiedInformation jid="
            r6.append(r0)
            r6.append(r9)
            java.lang.String r0 = " existingVname.serial="
            r6.append(r0)
            if (r4 != 0) goto L_0x00d1
            java.lang.String r0 = "null!!"
        L_0x002c:
            r6.append(r0)
            java.lang.String r0 = " existingVname.vlevel="
            r6.append(r0)
            java.lang.String r1 = "null!"
            if (r4 != 0) goto L_0x00c9
            r0 = r1
        L_0x0039:
            r6.append(r0)
            java.lang.String r0 = " existingVname.privacyMode="
            r6.append(r0)
            if (r4 != 0) goto L_0x00c3
            r0 = r1
        L_0x0044:
            r6.append(r0)
            java.lang.String r0 = " new serial: "
            r6.append(r0)
            r6.append(r2)
            java.lang.String r0 = " new certBlob=["
            r6.append(r0)
            r2 = r21
            if (r21 == 0) goto L_0x005d
            int r0 = r2.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x005d:
            r6.append(r1)
            java.lang.String r0 = "] new vlevel="
            r6.append(r0)
            r15 = r22
            r6.append(r15)
            java.lang.String r0 = " new privacyMode="
            r6.append(r0)
            r1 = r20
            r6.append(r1)
            java.lang.String r0 = r6.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r21 == 0) goto L_0x00bd
            if (r7 != 0) goto L_0x00bd
            boolean r1 = r5.A06(r9, r1, r2, r15)
        L_0x0083:
            if (r4 == 0) goto L_0x00bb
            int r14 = r4.A03
        L_0x0087:
            r11 = 0
            if (r4 == 0) goto L_0x00b9
            java.lang.String r12 = r4.A08
        L_0x008c:
            X.3L0 r0 = r5.A02(r9)
            if (r0 != 0) goto L_0x00b6
            r13 = r11
        L_0x0093:
            if (r4 == 0) goto L_0x00b4
            X.3ur r10 = r4.A00()
        L_0x0099:
            if (r0 == 0) goto L_0x009f
            X.3ur r11 = r0.A00()
        L_0x009f:
            int r16 = X.AnonymousClass3U1.A00(r4)
            int r17 = X.AnonymousClass3U1.A00(r0)
            if (r1 == 0) goto L_0x00b3
            X.0wU r0 = r8.A05
            X.3w5 r7 = new X.3w5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0.Boy(r7)
        L_0x00b3:
            return
        L_0x00b4:
            r10 = r11
            goto L_0x0099
        L_0x00b6:
            java.lang.String r13 = r0.A08
            goto L_0x0093
        L_0x00b9:
            r12 = r11
            goto L_0x008c
        L_0x00bb:
            r14 = 0
            goto L_0x0087
        L_0x00bd:
            r0 = 1
            boolean r1 = r5.A05(r9, r1, r15, r0)
            goto L_0x0083
        L_0x00c3:
            X.3ur r0 = r4.A00()
            goto L_0x0044
        L_0x00c9:
            int r0 = r4.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0039
        L_0x00d1:
            long r0 = r4.A05
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31861cV.A00(com.whatsapp.jid.UserJid, X.3ur, byte[], int, long):void");
    }

    public C31861cV(AnonymousClass17Y r1, C26421Kc r2, AnonymousClass16D r3, AnonymousClass185 r4, C20310xM r5, C19770wU r6) {
        this.A02 = r1;
        this.A05 = r6;
        this.A00 = r3;
        this.A01 = r5;
        this.A04 = r4;
        this.A03 = r2;
    }
}
