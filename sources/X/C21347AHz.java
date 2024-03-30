package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.AHz  reason: case insensitive filesystem */
public class C21347AHz implements C236119d {
    public boolean A00;
    public final AnonymousClass11F A01;
    public final AnonymousClass19A A02;
    public final C202899mr A03;

    public void BVN(String str) {
    }

    public void BWw(C203399nx r6, String str) {
        AnonymousClass17Y r2;
        int i;
        C202899mr r4 = this.A03;
        int A002 = AnonymousClass3ME.A00(r6);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("profilephotohandler/request failed : ");
        A0u.append(A002);
        A0u.append(" | ");
        AnonymousClass11F r22 = r4.A0D;
        C36321k7.A1N(r22, A0u);
        C202899mr.A01(r4, 3);
        r4.A00 = true;
        r4.A0E.cancel();
        C202899mr.A0M.remove(r4.A0H.toString());
        if (!r4.A01) {
            AnonymousClass141 A0D = r4.A06.A0D(r22);
            if (A002 != 401 || !A0D.A0G() || r4.A0B.A0C((GroupJid) A0D.A06(GroupJid.class))) {
                r2 = r4.A04;
                i = 5;
            } else {
                r2 = r4.A04;
                i = 4;
            }
            r2.A0H(new C81293wm(r4, A002, i));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c3, code lost:
        if (r1 == 167) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00de, code lost:
        if (r6 != false) goto L_0x00e5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BiM(X.C203399nx r12, java.lang.String r13) {
        /*
            r11 = this;
            boolean r0 = r11.A00
            if (r0 != 0) goto L_0x004c
            r0 = 0
            X.9nx r1 = r12.A0b(r0)
            java.lang.String r0 = "picture"
            X.C203399nx.A0A(r1, r0)
            java.lang.String r0 = "id"
            java.lang.String r2 = X.C36391kE.A0x(r1, r0)
        L_0x0014:
            X.9mr r3 = r11.A03
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "profilephotohandler/request success : "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " | "
            r1.append(r0)
            X.11F r8 = r3.A0D
            X.C36321k7.A1N(r8, r1)
            r6 = 1
            r3.A00 = r6
            X.Aca r0 = r3.A0E
            r0.cancel()
            java.util.HashMap r1 = X.C202899mr.A0M
            java.lang.Long r0 = r3.A0H
            java.lang.String r0 = r0.toString()
            r1.remove(r0)
            X.C202899mr.A01(r3, r6)
            X.16D r0 = r3.A06
            X.141 r4 = r0.A0D(r8)
            r10 = -1
            if (r2 == 0) goto L_0x0052
            goto L_0x004e
        L_0x004c:
            r2 = 0
            goto L_0x0014
        L_0x004e:
            int r10 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x0057 }
        L_0x0052:
            X.1O7 r0 = r3.A08     // Catch:{ NumberFormatException -> 0x0057 }
            r0.A00(r4, r10, r10)     // Catch:{ NumberFormatException -> 0x0057 }
        L_0x0057:
            boolean r0 = r3.A01
            if (r0 != 0) goto L_0x0104
            boolean r0 = r4.A0G()
            if (r0 == 0) goto L_0x00e5
            X.16K r0 = r3.A07
            java.io.File r1 = r0.A01(r4)
            if (r1 == 0) goto L_0x007b
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x007b
            com.whatsapp.data.ProfilePhotoChange r9 = new com.whatsapp.data.ProfilePhotoChange
            r9.<init>()
            byte[] r0 = X.AnonymousClass14R.A00(r1)     // Catch:{ IOException -> 0x007d }
            r9.oldPhoto = r0     // Catch:{ IOException -> 0x007d }
            goto L_0x0083
        L_0x007b:
            r9 = 0
            goto L_0x0089
        L_0x007d:
            r1 = move-exception
            java.lang.String r0 = "profilephotohandler/"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0083:
            byte[] r0 = r3.A03
            r9.newPhoto = r0
            r9.newPhotoId = r10
        L_0x0089:
            X.19x r5 = r3.A0G
            X.0wo r0 = r3.A09
            long r0 = X.C19970wo.A00(r0)
            X.0wQ r2 = r3.A05
            com.whatsapp.jid.PhoneUserJid r7 = X.C36371kC.A0e(r2)
            X.19w r2 = r5.A01
            X.3Qa r2 = r2.A02(r8, r6)
            X.8n9 r5 = new X.8n9
            r5.<init>(r2, r0)
            r0 = -1
            if (r10 != r0) goto L_0x010f
            r0 = 0
        L_0x00a6:
            r5.A16(r0)
            r5.A0q(r7)
            r5.A00 = r9
            X.1Cv r0 = r3.A0C
            X.3T1 r7 = r0.A05(r8)
            boolean r0 = r7 instanceof X.AnonymousClass2bI
            if (r0 == 0) goto L_0x00e0
            X.2bI r7 = (X.AnonymousClass2bI) r7
            int r1 = r7.A00
            r0 = 11
            if (r1 == r0) goto L_0x00c5
            r0 = 167(0xa7, float:2.34E-43)
            r2 = 0
            if (r1 != r0) goto L_0x00c6
        L_0x00c5:
            r2 = 1
        L_0x00c6:
            X.11F r1 = r5.A0J()
            if (r1 == 0) goto L_0x010d
            boolean r0 = r7.A1Y()
            if (r0 == 0) goto L_0x010d
            X.11F r0 = r7.A0J()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x010d
        L_0x00dc:
            if (r2 == 0) goto L_0x00e0
            if (r6 != 0) goto L_0x00e5
        L_0x00e0:
            X.0xM r0 = r3.A0A
            r0.A0h(r5)
        L_0x00e5:
            byte[] r2 = r3.A02
            if (r2 != 0) goto L_0x0105
            byte[] r0 = r3.A03
            if (r0 != 0) goto L_0x0105
            X.1O7 r1 = r3.A08
            X.16K r0 = r1.A03
            r0.A03(r4)
        L_0x00f4:
            X.16K r0 = r1.A03
            r0.A04(r4)
            X.17Y r2 = r3.A04
            r1 = 7
            X.3wW r0 = new X.3wW
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.A0H(r0)
        L_0x0104:
            return
        L_0x0105:
            X.1O7 r1 = r3.A08
            byte[] r0 = r3.A03
            r1.A01(r4, r2, r0)
            goto L_0x00f4
        L_0x010d:
            r6 = 0
            goto L_0x00dc
        L_0x010f:
            java.lang.String r0 = java.lang.Integer.toString(r10)
            goto L_0x00a6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21347AHz.BiM(X.9nx, java.lang.String):void");
    }

    public C21347AHz(AnonymousClass11F r1, AnonymousClass19A r2, C202899mr r3) {
        this.A01 = r1;
        this.A02 = r2;
        this.A03 = r3;
    }
}
