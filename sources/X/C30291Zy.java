package X;

/* renamed from: X.1Zy  reason: invalid class name and case insensitive filesystem */
public class C30291Zy extends C29421Wo {
    public final C19730wQ A00;
    public final AnonymousClass16D A01;
    public final AnonymousClass16K A02;
    public final C20430xY A03;
    public final C20310xM A04;
    public final C24541Cv A05;
    public final AnonymousClass1P3 A06;
    public final C238019x A07;
    public final C19700wN A08;
    public final C230717b A09;
    public final C20510xg A0A;
    public final AnonymousClass1PE A0B;

    public C30291Zy(C19700wN r9, C19730wQ r10, AnonymousClass16D r11, AnonymousClass16K r12, C20430xY r13, C20310xM r14, C24541Cv r15, C230717b r16, C20510xg r17, AnonymousClass19A r18, AnonymousClass19L r19, AnonymousClass1PE r20, AnonymousClass1P3 r21, C238019x r22, C19770wU r23) {
        super(r9, r18, r19, r23, new int[]{189}, true);
        this.A08 = r9;
        this.A00 = r10;
        this.A09 = r16;
        this.A01 = r11;
        this.A0A = r17;
        this.A04 = r14;
        this.A05 = r15;
        this.A02 = r12;
        this.A03 = r13;
        this.A06 = r21;
        this.A07 = r22;
        this.A0B = r20;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x019d, code lost:
        if (r2 == 148) goto L_0x019f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.C203399nx r15, int r16) {
        /*
            r14 = this;
            r0 = 189(0xbd, float:2.65E-43)
            r1 = r16
            if (r1 != r0) goto L_0x003f
            java.lang.String r0 = "addressing_mode"
            r6 = 0
            java.lang.String r0 = r15.A0i(r0, r6)
            java.lang.String r5 = X.C54102sP.A00(r0)
            r0 = 0
            X.9nx r3 = r15.A0b(r0)
            if (r3 == 0) goto L_0x003f
            java.lang.Class<X.11F> r0 = X.AnonymousClass11F.class
            java.lang.String r4 = "jid"
            com.whatsapp.jid.Jid r2 = r3.A0X(r0, r4)
            X.11F r2 = (X.AnonymousClass11F) r2
            if (r2 == 0) goto L_0x01fe
            boolean r0 = X.AnonymousClass143.A0G(r2)
            if (r0 == 0) goto L_0x0040
            X.17b r1 = r14.A09
            r0 = r2
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            boolean r0 = X.C230717b.A00(r1, r0, r5)
            if (r0 == 0) goto L_0x0040
            X.0xg r3 = r14.A0A
            X.147 r2 = (X.AnonymousClass147) r2
            r1 = 5
            java.lang.String r0 = "lid_migration"
            r3.A0E(r2, r0, r1)
        L_0x003f:
            return
        L_0x0040:
            java.lang.String r0 = "t"
            java.lang.String r4 = r15.A0i(r0, r6)
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = X.AnonymousClass6R8.A01(r4, r0)
            java.lang.Class<com.whatsapp.jid.UserJid> r5 = com.whatsapp.jid.UserJid.class
            java.lang.String r4 = "author"
            com.whatsapp.jid.Jid r5 = r3.A0X(r5, r4)
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            java.lang.Class<com.whatsapp.jid.PhoneUserJid> r7 = com.whatsapp.jid.PhoneUserJid.class
            java.lang.String r4 = "author_phone_number"
            com.whatsapp.jid.Jid r8 = r3.A0X(r7, r4)
            com.whatsapp.jid.PhoneUserJid r8 = (com.whatsapp.jid.PhoneUserJid) r8
            boolean r4 = X.AnonymousClass143.A0I(r5)
            if (r4 == 0) goto L_0x0072
            if (r8 == 0) goto L_0x0072
            X.1PE r7 = r14.A0B
            r4 = r5
            X.13w r4 = (X.C223313w) r4
            r7.A00(r4, r8)
        L_0x0072:
            java.lang.String r7 = "id"
            java.lang.String r10 = r15.A0h(r7)
            java.lang.String r4 = "set"
            boolean r4 = X.C203399nx.A0I(r3, r4)
            if (r4 == 0) goto L_0x0129
            java.lang.String r4 = r3.A0i(r7, r6)
            r3 = -1
            int r9 = X.AnonymousClass6R8.A00(r4, r3)
        L_0x0089:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = "ProfilePictureNotificationHandler/onProfilePhotoChange "
            r4.append(r3)
            r4.append(r2)
            java.lang.String r3 = " author:"
            r4.append(r3)
            r4.append(r5)
            java.lang.String r3 = " photoId:"
            r4.append(r3)
            r4.append(r9)
            java.lang.String r3 = r4.toString()
            com.whatsapp.util.Log.i((java.lang.String) r3)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            boolean r3 = X.AnonymousClass143.A0I(r2)
            r8 = 0
            X.16D r11 = r14.A01
            if (r3 == 0) goto L_0x0121
            X.141 r3 = r11.A08(r2)
            if (r3 == 0) goto L_0x00c4
            r7.add(r3)
        L_0x00c4:
            r4 = r2
            X.13w r4 = (X.C223313w) r4
            X.12O r3 = r11.A0G
            com.whatsapp.jid.PhoneUserJid r3 = r3.A0A(r4)
            if (r3 == 0) goto L_0x00d8
            X.141 r3 = r11.A08(r3)
            if (r3 == 0) goto L_0x00d8
            r7.add(r3)
        L_0x00d8:
            X.0wQ r3 = r14.A00
            r3.A0G()
            com.whatsapp.jid.PhoneUserJid r3 = r3.A03
            if (r3 == 0) goto L_0x0233
            java.util.Iterator r13 = r7.iterator()
        L_0x00e5:
            boolean r3 = r13.hasNext()
            r4 = 1
            if (r3 == 0) goto L_0x0134
            java.lang.Object r4 = r13.next()
            X.141 r4 = (X.AnonymousClass141) r4
            int r3 = r4.A05
            if (r3 != r9) goto L_0x00fb
            int r3 = r4.A06
            if (r3 != r9) goto L_0x00fb
            goto L_0x00e5
        L_0x00fb:
            X.1P3 r12 = r14.A06
            X.11F r11 = r4.A0H
            X.16D r3 = r12.A02
            X.141 r7 = r3.A0D(r11)
            int r3 = r7.A05
            if (r3 != r9) goto L_0x010d
            int r3 = r7.A06
            if (r3 == r9) goto L_0x00e5
        L_0x010d:
            r3 = -1
            if (r9 != r3) goto L_0x0116
            X.1O7 r3 = r12.A05
            r3.A02(r11)
            goto L_0x00e5
        L_0x0116:
            X.1Lu r4 = r12.A00
            X.1iZ r3 = new X.1iZ
            r3.<init>(r7, r11, r12, r9)
            r4.A01(r3)
            goto L_0x00e5
        L_0x0121:
            X.141 r6 = r11.A0D(r2)
            r7.add(r6)
            goto L_0x00d8
        L_0x0129:
            java.lang.String r4 = "delete"
            boolean r4 = X.C203399nx.A0I(r3, r4)
            if (r4 == 0) goto L_0x01c7
            r9 = -1
            goto L_0x0089
        L_0x0134:
            if (r6 == 0) goto L_0x003f
            boolean r3 = r6.A0G()
            if (r3 == 0) goto L_0x003f
            int r3 = r6.A05
            if (r3 != r9) goto L_0x0145
            int r3 = r6.A06
            if (r3 != r9) goto L_0x0145
            return
        L_0x0145:
            X.16K r3 = r14.A02
            java.io.File r6 = r3.A01(r6)
            if (r6 == 0) goto L_0x0167
            boolean r3 = r6.exists()
            if (r3 == 0) goto L_0x0167
            com.whatsapp.data.ProfilePhotoChange r8 = new com.whatsapp.data.ProfilePhotoChange
            r8.<init>()
            r8.newPhotoId = r9
            byte[] r3 = X.AnonymousClass14R.A00(r6)     // Catch:{ IOException -> 0x0161 }
            r8.oldPhoto = r3     // Catch:{ IOException -> 0x0161 }
            goto L_0x0167
        L_0x0161:
            r6 = move-exception
            java.lang.String r3 = "app/xmpp/recv/handle_profile_photo_changed/"
            com.whatsapp.util.Log.w(r3, r6)
        L_0x0167:
            r6 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r6
            X.3Qa r6 = new X.3Qa
            r6.<init>(r2, r10, r4)
            X.8n9 r3 = new X.8n9
            r3.<init>(r6, r0)
            r0 = -1
            if (r9 != r0) goto L_0x01c2
            r0 = 0
        L_0x0178:
            r3.A16(r0)
            r3.A0q(r5)
            r3.A00 = r8
            X.1Cv r0 = r14.A05
            X.3T1 r6 = r0.A05(r2)
            boolean r0 = r6 instanceof X.AnonymousClass2bI
            if (r0 == 0) goto L_0x01ba
            X.2bI r6 = (X.AnonymousClass2bI) r6
            int r2 = r6.A00
            r0 = 11
            if (r2 == r0) goto L_0x019f
            r0 = 167(0xa7, float:2.34E-43)
            if (r2 == r0) goto L_0x019f
            r0 = 143(0x8f, float:2.0E-43)
            if (r2 == r0) goto L_0x019f
            r0 = 148(0x94, float:2.07E-43)
            r1 = 0
            if (r2 != r0) goto L_0x01a0
        L_0x019f:
            r1 = 1
        L_0x01a0:
            X.11F r0 = r3.A0J()
            if (r0 == 0) goto L_0x01c0
            boolean r0 = r6.A1Y()
            if (r0 == 0) goto L_0x01c0
            X.11F r0 = r6.A0J()
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x01c0
        L_0x01b6:
            if (r1 == 0) goto L_0x01ba
            if (r4 != 0) goto L_0x003f
        L_0x01ba:
            X.0xM r0 = r14.A04
            r0.A0h(r3)
            return
        L_0x01c0:
            r4 = 0
            goto L_0x01b6
        L_0x01c2:
            java.lang.String r0 = java.lang.Integer.toString(r9)
            goto L_0x0178
        L_0x01c7:
            java.lang.String r0 = "request"
            boolean r0 = X.C203399nx.A0I(r3, r0)
            if (r0 == 0) goto L_0x003f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ProfilePictureNotificationHandler/onProfilePhotoLost "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = X.C202899mr.A02(r2)
            if (r0 != 0) goto L_0x003f
            X.0wQ r0 = r14.A00
            r0.A0G()
            X.142 r1 = r0.A0E
            if (r1 == 0) goto L_0x003f
            boolean r0 = r0.A0M(r2)
            if (r0 == 0) goto L_0x003f
            X.1P3 r0 = r14.A06
            r0.A0E(r1)
            return
        L_0x01fe:
            java.lang.String r0 = "hash"
            java.lang.String r1 = r3.A0i(r0, r6)
            if (r1 == 0) goto L_0x023b
            X.6NS r4 = X.AnonymousClass6NS.A0M
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x003f
            byte[] r1 = r1.getBytes()
            r0 = 0
            byte[] r3 = android.util.Base64.decode(r1, r0)
            java.util.Arrays.toString(r3)
            X.5Tu r1 = X.C108515Tu.A0I
            X.6Pz r0 = new X.6Pz
            r0.<init>(r1)
            r2 = 1
            r0.A02 = r2
            r0.A00 = r4
            r0.A05(r3)
            X.6Pq r1 = r0.A01()
            X.0xY r0 = r14.A03
            X.C20430xY.A00(r0, r1, r2)
            return
        L_0x0233:
            java.lang.String r1 = "local JID unknown"
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        L_0x023b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ProfilePictureNotificationHandler/handleNotification/ignoring notification for invalid jid: "
            r1.append(r0)
            java.lang.String r0 = r3.A0i(r4, r6)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30291Zy.A07(X.9nx, int):void");
    }
}
