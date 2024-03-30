package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9Xw  reason: invalid class name and case insensitive filesystem */
public final class C196139Xw {
    public final C19730wQ A00;
    public final C26151Jb A01;
    public final C25821Hu A02;
    public final C29621Xi A03;
    public final AnonymousClass6TL A04;
    public final C20810yC A05;
    public final C20520xh A06;
    public final AnonymousClass1TF A07;
    public final C29871Yh A08;
    public final C27261Nn A09;
    public final AnonymousClass1DM A0A;

    public C196139Xw(C19730wQ r2, C27261Nn r3, AnonymousClass1DM r4, C26151Jb r5, C25821Hu r6, C29621Xi r7, AnonymousClass6TL r8, C20810yC r9, C20520xh r10, AnonymousClass1TF r11, C29871Yh r12) {
        AnonymousClass00C.A0D(r9, 1);
        C36321k7.A17(r2, r11, r4, 2);
        C36321k7.A1C(r7, r10, r3, r8, r12);
        AnonymousClass00C.A0D(r6, 11);
        this.A05 = r9;
        this.A00 = r2;
        this.A01 = r5;
        this.A07 = r11;
        this.A0A = r4;
        this.A03 = r7;
        this.A06 = r10;
        this.A09 = r3;
        this.A04 = r8;
        this.A08 = r12;
        this.A02 = r6;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ee, code lost:
        if (r12.equals(r11) == false) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C185718ug A00(X.AnonymousClass11F r23) {
        /*
            r22 = this;
            r1 = 0
            r2 = r23
            if (r23 == 0) goto L_0x005b
            r0 = r22
            X.1Nn r0 = r0.A09
            X.3Nj r2 = r0.A00(r2)
            if (r2 == 0) goto L_0x005b
            java.util.ArrayList r0 = X.C50552l6.A00
            long r0 = r2.A00
            java.lang.Long r20 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = r2.A02
            r21 = r0
            java.lang.String r12 = r2.A03
            X.AnonymousClass00C.A07(r12)
            int r19 = r12.hashCode()
            java.lang.String r11 = "message_short_link"
            java.lang.String r18 = "biz_profile"
            java.lang.String r17 = "click_to_chat_link"
            java.lang.String r16 = "contact_card"
            java.lang.String r14 = "global_search_new_chat"
            java.lang.String r13 = "product_link"
            java.lang.String r10 = "group_participant_list"
            java.lang.String r9 = "qr_code"
            java.lang.String r8 = "promotional_qbm"
            java.lang.String r7 = "ctwa"
            java.lang.String r6 = "contact_search"
            java.lang.String r5 = "phone_number_hyperlink"
            java.lang.String r4 = "status"
            java.lang.String r3 = "otp_qbm"
            java.lang.String r15 = "catalog_link"
            java.lang.String r2 = "transactional_qbm"
            java.lang.String r0 = "broadcast_list_context_menu"
            java.lang.String r1 = "other_qbm"
            switch(r19) {
                case -1945543987: goto L_0x005c;
                case -1859421198: goto L_0x0064;
                case -1350068538: goto L_0x006a;
                case -1147981728: goto L_0x0070;
                case -1138948760: goto L_0x0076;
                case -892481550: goto L_0x007e;
                case -433990239: goto L_0x0086;
                case -314025305: goto L_0x008e;
                case 3064571: goto L_0x0096;
                case 401381579: goto L_0x009e;
                case 563217739: goto L_0x00a6;
                case 736517098: goto L_0x00ae;
                case 1014323530: goto L_0x00b6;
                case 1130103474: goto L_0x00be;
                case 1277404111: goto L_0x00c6;
                case 1317763348: goto L_0x00d2;
                case 1416030845: goto L_0x00de;
                case 1782721813: goto L_0x00ea;
                default: goto L_0x004b;
            }
        L_0x004b:
            java.lang.String r11 = "unknown"
        L_0x004d:
            X.2l6 r2 = new X.2l6
            r1 = r20
            r0 = r21
            r2.<init>(r1, r0, r11)
            X.8ug r1 = new X.8ug
            r1.<init>((X.C50552l6) r2)
        L_0x005b:
            return r1
        L_0x005c:
            boolean r0 = r12.equals(r1)
            if (r0 == 0) goto L_0x004b
            r11 = r1
            goto L_0x004d
        L_0x0064:
            r3 = r0
            boolean r0 = r12.equals(r0)
            goto L_0x007a
        L_0x006a:
            r3 = r2
            boolean r0 = r12.equals(r2)
            goto L_0x007a
        L_0x0070:
            r3 = r15
            boolean r0 = r12.equals(r15)
            goto L_0x007a
        L_0x0076:
            boolean r0 = r12.equals(r3)
        L_0x007a:
            if (r0 == 0) goto L_0x004b
            r11 = r3
            goto L_0x004d
        L_0x007e:
            boolean r0 = r12.equals(r4)
            if (r0 == 0) goto L_0x004b
            r11 = r4
            goto L_0x004d
        L_0x0086:
            boolean r0 = r12.equals(r5)
            if (r0 == 0) goto L_0x004b
            r11 = r5
            goto L_0x004d
        L_0x008e:
            boolean r0 = r12.equals(r6)
            if (r0 == 0) goto L_0x004b
            r11 = r6
            goto L_0x004d
        L_0x0096:
            boolean r0 = r12.equals(r7)
            if (r0 == 0) goto L_0x004b
            r11 = r7
            goto L_0x004d
        L_0x009e:
            boolean r0 = r12.equals(r8)
            if (r0 == 0) goto L_0x004b
            r11 = r8
            goto L_0x004d
        L_0x00a6:
            boolean r0 = r12.equals(r9)
            if (r0 == 0) goto L_0x004b
            r11 = r9
            goto L_0x004d
        L_0x00ae:
            boolean r0 = r12.equals(r10)
            if (r0 == 0) goto L_0x004b
            r11 = r10
            goto L_0x004d
        L_0x00b6:
            boolean r0 = r12.equals(r13)
            if (r0 == 0) goto L_0x004b
            r11 = r13
            goto L_0x004d
        L_0x00be:
            boolean r0 = r12.equals(r14)
            if (r0 == 0) goto L_0x004b
            r11 = r14
            goto L_0x004d
        L_0x00c6:
            r0 = r16
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x004b
            r11 = r16
            goto L_0x004d
        L_0x00d2:
            r0 = r17
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x004b
            r11 = r17
            goto L_0x004d
        L_0x00de:
            r0 = r18
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x004b
            r11 = r18
            goto L_0x004d
        L_0x00ea:
            boolean r0 = r12.equals(r11)
            if (r0 != 0) goto L_0x004d
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196139Xw.A00(X.11F):X.8ug");
    }

    public final C185708uf A01(UserJid userJid) {
        C192449Ha A072;
        Long l = null;
        C20810yC r4 = this.A05;
        if (!r4.A0E(4991) || (A072 = this.A0A.A07(userJid)) == null) {
            return null;
        }
        C185708uf r1 = new C185708uf(A072.A01, 6);
        if (r4.A0E(4992)) {
            l = A072.A00;
        }
        return new C185708uf(r1, l);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x04ee, code lost:
        if (r0 == false) goto L_0x02eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x04f0, code lost:
        r10 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0592, code lost:
        if (r9.equals(r10) != false) goto L_0x02ed;
     */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x021e A[LOOP:0: B:124:0x0218->B:126:0x021e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0387  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x03ba  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x03f5  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x045e  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x047b  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x048d  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0497  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x04b4  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x019c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C185698ue A02(X.AnonymousClass3T1 r35, java.lang.String r36) {
        /*
            r34 = this;
            r14 = 0
            r13 = r35
            X.AnonymousClass00C.A0D(r13, r14)
            int r12 = r13.A1I
            boolean r28 = X.C66013Ui.A0L(r12)
            r33 = 0
            r29 = r36
            if (r28 == 0) goto L_0x002b
            java.lang.String r1 = "media_viewer"
            r0 = r29
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x002b
            r0 = r13
            X.4TX r0 = (X.AnonymousClass4TX) r0
            int r1 = r0.BJ8()
            r0 = 1
            if (r1 == r0) goto L_0x0596
            r0 = 2
            if (r1 != r0) goto L_0x002b
            java.lang.String r33 = "view_once_expired"
        L_0x002b:
            r11 = r34
            X.1Xi r0 = r11.A03
            r0.A01(r13)
            r10 = 0
            r0 = 12
            if (r12 != r0) goto L_0x02a1
            byte[] r2 = r13.A1V()
            if (r2 != 0) goto L_0x003f
            byte[] r2 = new byte[r14]
        L_0x003f:
            r0 = r13
            X.2bK r0 = (X.AnonymousClass2bK) r0
            int r1 = r0.A01
            if (r1 == 0) goto L_0x02ab
            r0 = 2
            if (r1 == r0) goto L_0x02ab
            java.lang.Long r1 = X.C36441kJ.A0y(r1)
            X.8ut r0 = new X.8ut
            r0.<init>(r1)
        L_0x0052:
            X.8uY r6 = new X.8uY
            r6.<init>(r0, r10, r2)
        L_0x0057:
            boolean r0 = X.C66013Ui.A0i(r13)
            r7 = 0
            if (r0 == 0) goto L_0x029d
            X.8uf r21 = new X.8uf
            r0 = r21
            r0.<init>((int) r14)
        L_0x0065:
            r0 = 15
            if (r12 != r0) goto L_0x0299
            r1 = 7
            X.8uf r20 = new X.8uf
            r0 = r20
            r0.<init>((int) r1)
        L_0x0071:
            r2 = 64
            if (r12 != r2) goto L_0x0295
            r1 = 24
            X.8ug r19 = new X.8ug
            r0 = r19
            r0.<init>((int) r1)
        L_0x007e:
            r1 = 3
            X.8uf r18 = new X.8uf
            r0 = r18
            r0.<init>((int) r1)
            boolean r0 = r13.A1T(r2)
            if (r0 != 0) goto L_0x008e
            r18 = r7
        L_0x008e:
            r0 = 4
            X.8uf r15 = new X.8uf
            r15.<init>((int) r0)
            boolean r0 = r13.A1T(r0)
            if (r0 != 0) goto L_0x009b
            r15 = r7
        L_0x009b:
            r0 = 5
            X.8uf r14 = new X.8uf
            r14.<init>((int) r0)
            r0 = 2
            boolean r0 = r13.A1T(r0)
            if (r0 != 0) goto L_0x00a9
            r14 = r7
        L_0x00a9:
            r0 = 8
            boolean r0 = r13.A1T(r0)
            if (r0 != 0) goto L_0x0261
            boolean r0 = r13 instanceof X.C88854Uh
            if (r0 != 0) goto L_0x0261
            boolean r0 = r13 instanceof X.AnonymousClass2bZ
            if (r0 != 0) goto L_0x0261
        L_0x00b9:
            r12 = r7
        L_0x00ba:
            r0 = 8
            boolean r0 = r13.A1T(r0)
            r9 = 0
            if (r0 != 0) goto L_0x0203
            boolean r0 = r13 instanceof X.C88854Uh
            if (r0 != 0) goto L_0x0203
            boolean r0 = r13 instanceof X.AnonymousClass2bZ
            if (r0 != 0) goto L_0x0203
            boolean r0 = X.C66013Ui.A0k(r13)
            if (r0 != 0) goto L_0x0203
        L_0x00d1:
            X.11F r1 = r13.A0J()
            if (r1 == 0) goto L_0x0200
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0200
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.8uf r10 = new X.8uf
            r10.<init>((com.whatsapp.jid.UserJid) r1)
        L_0x00e2:
            boolean r0 = r13 instanceof X.C180838mV
            r8 = 0
            if (r0 == 0) goto L_0x019c
            X.3Qa r0 = r13.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0190
            com.whatsapp.jid.UserJid r5 = r13.A0L()
            X.0wQ r0 = r11.A00
            com.whatsapp.jid.PhoneUserJid r4 = X.C36441kJ.A0n(r0)
        L_0x00f7:
            boolean r0 = r13 instanceof X.C180978mj
            if (r0 == 0) goto L_0x0188
            java.lang.String r0 = "request-decline"
        L_0x00fd:
            X.8ub r1 = new X.8ub
            r1.<init>(r5, r4, r8, r0)
            r2 = 26
            X.8ug r0 = new X.8ug
            r0.<init>((int) r2)
            X.8ur r8 = new X.8ur
            r8.<init>(r0, r1)
        L_0x010e:
            X.0yC r1 = r11.A05
            r0 = 5718(0x1656, float:8.013E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0186
            X.9WK r0 = r13.A0Z
            if (r0 == 0) goto L_0x0186
            byte[] r2 = r0.A01
            r1 = 9
            X.8uf r0 = new X.8uf
            r0.<init>((byte[]) r2, (int) r1)
            X.8uf r5 = new X.8uf
            r5.<init>((X.C185708uf) r0)
        L_0x012a:
            r0 = 4194304(0x400000, float:5.877472E-39)
            boolean r0 = r13.A1T(r0)
            if (r0 == 0) goto L_0x0139
            r0 = 8
            X.8uf r7 = new X.8uf
            r7.<init>((int) r0)
        L_0x0139:
            boolean r0 = r13 instanceof X.AnonymousClass2bO
            if (r0 == 0) goto L_0x014c
            r0 = r13
            X.2bO r0 = (X.AnonymousClass2bO) r0
            java.lang.String r4 = r0.A01
            if (r4 != 0) goto L_0x0159
            X.1Jb r2 = r11.A01
            X.8zz r1 = X.C188648zz.A0M
            r0 = 0
            r2.A00(r1, r0)
        L_0x014c:
            X.37F r0 = r13.A0X()
            if (r0 == 0) goto L_0x0183
            X.3Qa r0 = r0.A02
        L_0x0154:
            java.lang.String r4 = r0.A01
            X.AnonymousClass00C.A07(r4)
        L_0x0159:
            java.util.ArrayList r0 = X.C185698ue.A00
            long r2 = r13.A0I
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r2 = r2 / r0
            java.lang.Long r31 = java.lang.Long.valueOf(r2)
            X.8ue r17 = new X.8ue
            r25 = r12
            r26 = r10
            r27 = r5
            r28 = r7
            r29 = r8
            r30 = r6
            r32 = r4
            r22 = r18
            r23 = r15
            r24 = r14
            r18 = r19
            r19 = r9
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            return r17
        L_0x0183:
            X.3Qa r0 = r13.A1J
            goto L_0x0154
        L_0x0186:
            r5 = r7
            goto L_0x012a
        L_0x0188:
            boolean r0 = r13 instanceof X.C180968mi
            if (r0 == 0) goto L_0x059a
            java.lang.String r0 = "request-cancel"
            goto L_0x00fd
        L_0x0190:
            X.0wQ r0 = r11.A00
            com.whatsapp.jid.PhoneUserJid r5 = X.C36441kJ.A0n(r0)
            com.whatsapp.jid.UserJid r4 = r13.A0L()
            goto L_0x00f7
        L_0x019c:
            X.9lY r3 = r13.A0M
            if (r3 != 0) goto L_0x01c4
            boolean r0 = r13 instanceof X.AnonymousClass2bS
            if (r0 == 0) goto L_0x01b2
            r1 = 27
            X.8ug r0 = new X.8ug
            r0.<init>((int) r1)
            X.8ur r8 = new X.8ur
            r8.<init>((X.C185718ug) r0)
            goto L_0x010e
        L_0x01b2:
            boolean r0 = r13 instanceof X.AnonymousClass2bV
            boolean r1 = X.AnonymousClass000.A1P(r0)
            X.8us r0 = new X.8us
            r0.<init>(r1)
            X.8ur r8 = new X.8ur
            r8.<init>((X.C16520pN) r0)
            goto L_0x010e
        L_0x01c4:
            java.lang.String r1 = r3.A0K
            boolean r0 = X.C203419nz.A07(r1)
            if (r0 == 0) goto L_0x01cd
            r8 = r1
        L_0x01cd:
            com.whatsapp.jid.UserJid r5 = r3.A0E
            com.whatsapp.jid.UserJid r4 = r3.A0D
            int r1 = r3.A03
            r0 = 5
            if (r1 != r0) goto L_0x01da
            java.lang.String r0 = "futureproof"
            goto L_0x00fd
        L_0x01da:
            boolean r0 = r3.A0K()
            if (r0 == 0) goto L_0x01e4
            java.lang.String r0 = "request"
            goto L_0x00fd
        L_0x01e4:
            monitor-enter(r3)
            int r2 = r3.A03     // Catch:{ all -> 0x05a8 }
            r1 = 1
            r0 = 2
            if (r2 == r0) goto L_0x01f9
            r0 = 200(0xc8, float:2.8E-43)
            if (r2 == r0) goto L_0x01f9
            if (r2 == r1) goto L_0x01f9
            r0 = 100
            if (r2 == r0) goto L_0x01f9
            r0 = 3
            if (r2 == r0) goto L_0x01f9
            r1 = 0
        L_0x01f9:
            monitor-exit(r3)
            if (r1 == 0) goto L_0x05a1
            java.lang.String r0 = "send"
            goto L_0x00fd
        L_0x0200:
            r10 = r7
            goto L_0x00e2
        L_0x0203:
            X.6TL r1 = r11.A04
            X.3Qa r0 = r13.A1J
            java.lang.String r0 = r0.A01
            X.AnonymousClass00C.A07(r0)
            java.util.List r0 = r1.A02(r0)
            java.util.ArrayList r2 = X.C36321k7.A0J(r0)
            java.util.Iterator r8 = r0.iterator()
        L_0x0218:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0252
            java.lang.Object r0 = r8.next()
            X.6DH r0 = (X.AnonymousClass6DH) r0
            java.lang.String r5 = r0.A00
            java.lang.String r4 = r0.A05
            java.lang.String r1 = r0.A01
            java.lang.Long r1 = X.AnonymousClass097.A04(r1)
            long r16 = X.C36371kC.A0A(r1)
            java.lang.Long r23 = java.lang.Long.valueOf(r16)
            java.lang.String r3 = r0.A04
            java.lang.String r0 = r0.A02
            X.8ug r1 = new X.8ug
            r22 = r1
            r24 = r5
            r25 = r4
            r26 = r3
            r27 = r0
            r22.<init>(r23, r24, r25, r26, r27)
            X.2l7 r0 = new X.2l7
            r0.<init>((X.C185718ug) r1)
            r2.add(r0)
            goto L_0x0218
        L_0x0252:
            boolean r0 = X.C36401kF.A1a(r2)
            if (r0 == 0) goto L_0x00d1
            r0 = 28
            X.8ug r9 = new X.8ug
            r9.<init>((java.util.List) r2, (int) r0)
            goto L_0x00d1
        L_0x0261:
            boolean r0 = X.C66013Ui.A0k(r13)
            if (r0 != 0) goto L_0x00b9
            X.1Hu r0 = r11.A02
            java.lang.String r1 = r0.A00(r13)
            if (r1 == 0) goto L_0x027c
            boolean r0 = X.AnonymousClass098.A06(r1)
            if (r0 != 0) goto L_0x027c
            X.8uf r12 = new X.8uf
            r12.<init>((java.lang.String) r1)
            goto L_0x00ba
        L_0x027c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unexpected null template ID for fmsg: "
            r1.append(r0)
            X.3Qa r0 = r13.A1J
            X.C36331k8.A1P(r0, r1)
            X.1Jb r2 = r11.A01
            X.8zz r1 = X.C188648zz.A0d
            r0 = r29
            r2.A00(r1, r0)
            goto L_0x00b9
        L_0x0295:
            r19 = r7
            goto L_0x007e
        L_0x0299:
            r20 = r7
            goto L_0x0071
        L_0x029d:
            r21 = r7
            goto L_0x0065
        L_0x02a1:
            boolean r0 = X.C203359nq.A0C(r13)
            if (r0 == 0) goto L_0x02b2
            java.util.ArrayList r0 = X.C185638uY.A00
            byte[] r2 = new byte[r14]
        L_0x02ab:
            X.8ut r0 = new X.8ut
            r0.<init>()
            goto L_0x0052
        L_0x02b2:
            java.lang.String r9 = X.C66013Ui.A0D(r12)
            if (r9 == 0) goto L_0x02ed
            int r27 = r9.hashCode()
            java.lang.String r10 = "document"
            java.lang.String r26 = "native_flow_response"
            java.lang.String r25 = "catalog"
            java.lang.String r24 = "video"
            java.lang.String r23 = "vcard"
            java.lang.String r22 = "order"
            java.lang.String r21 = "image"
            java.lang.String r20 = "audio"
            java.lang.String r19 = "list"
            java.lang.String r18 = "url"
            java.lang.String r17 = "ptv"
            java.lang.String r16 = "ptt"
            java.lang.String r15 = "gif"
            java.lang.String r8 = "product"
            java.lang.String r7 = "livelocation"
            java.lang.String r6 = "buttons_response"
            java.lang.String r5 = "system"
            java.lang.String r4 = "cataloglink"
            java.lang.String r3 = "invite"
            java.lang.String r2 = "productlink"
            java.lang.String r1 = "avatar_sticker"
            java.lang.String r0 = "sticker"
            switch(r27) {
                case -1890252483: goto L_0x04b7;
                case -1718548393: goto L_0x04c0;
                case -1490915991: goto L_0x04c6;
                case -1183699191: goto L_0x04cc;
                case -1006478445: goto L_0x04d2;
                case -887328209: goto L_0x04d8;
                case -714971329: goto L_0x04de;
                case -622287711: goto L_0x04e4;
                case -309474065: goto L_0x04ea;
                case 102340: goto L_0x04f3;
                case 111344: goto L_0x04fc;
                case 111346: goto L_0x0508;
                case 116079: goto L_0x0514;
                case 3322014: goto L_0x0520;
                case 93166550: goto L_0x052c;
                case 100313435: goto L_0x0538;
                case 106006350: goto L_0x0544;
                case 112021638: goto L_0x0550;
                case 112202875: goto L_0x055c;
                case 555704345: goto L_0x0568;
                case 814376458: goto L_0x0574;
                case 861720859: goto L_0x058e;
                case 943481210: goto L_0x0580;
                case 1014323694: goto L_0x0583;
                case 1279485634: goto L_0x0586;
                case 1901043637: goto L_0x0589;
                case 1977401206: goto L_0x058c;
                default: goto L_0x02eb;
            }
        L_0x02eb:
            java.lang.String r10 = "unknown"
        L_0x02ed:
            X.8ut r17 = new X.8ut
            r17.<init>()
            java.lang.String r1 = "media_viewer"
            r0 = r29
            boolean r0 = r1.equals(r0)
            if (r28 == 0) goto L_0x0312
            if (r0 != 0) goto L_0x0312
            r0 = r13
            X.4TX r0 = (X.AnonymousClass4TX) r0
            int r0 = r0.BJ8()
            if (r0 == 0) goto L_0x0312
            byte[] r1 = new byte[r14]
        L_0x0309:
            X.8uY r6 = new X.8uY
            r0 = r17
            r6.<init>(r0, r10, r1)
            goto L_0x0057
        L_0x0312:
            X.8NL r9 = X.C170918Hz.A0D()
            X.3Qa r0 = r13.A1J     // Catch:{ 1Fu -> 0x035d, IllegalStateException -> 0x0363, Exception -> 0x0357 }
            X.11F r0 = r0.A00     // Catch:{ 1Fu -> 0x035d, IllegalStateException -> 0x0363, Exception -> 0x0357 }
            boolean r0 = X.AnonymousClass143.A0H(r0)     // Catch:{ 1Fu -> 0x035d, IllegalStateException -> 0x0363, Exception -> 0x0357 }
            if (r0 == 0) goto L_0x033b
            X.AnonymousClass00C.A0B(r9)     // Catch:{ 1Fu -> 0x035d, IllegalStateException -> 0x0363, Exception -> 0x0357 }
            X.AnonymousClass00C.A0D(r9, r14)     // Catch:{ 1Fu -> 0x035d, IllegalStateException -> 0x0363, Exception -> 0x0357 }
            X.9Hk r0 = new X.9Hk     // Catch:{ 1Fu -> 0x035d, IllegalStateException -> 0x0363, Exception -> 0x0357 }
            r0.<init>(r9)     // Catch:{ 1Fu -> 0x035d, IllegalStateException -> 0x0363, Exception -> 0x0357 }
            r2 = 1
            r0.A00 = r2     // Catch:{ 1Fu -> 0x035d, IllegalStateException -> 0x0363, Exception -> 0x0357 }
            X.8NL r0 = r0.A01     // Catch:{ 1Fu -> 0x035d, IllegalStateException -> 0x0363, Exception -> 0x0357 }
            X.9Hl r1 = new X.9Hl     // Catch:{ 1Fu -> 0x035d, IllegalStateException -> 0x0363, Exception -> 0x0357 }
            r1.<init>(r0, r2)     // Catch:{ 1Fu -> 0x035d, IllegalStateException -> 0x0363, Exception -> 0x0357 }
            X.1Yh r0 = r11.A08     // Catch:{ 1Fu -> 0x035d, IllegalStateException -> 0x0363, Exception -> 0x0357 }
            r0.A00(r1, r13)     // Catch:{ 1Fu -> 0x035d, IllegalStateException -> 0x0363, Exception -> 0x0357 }
            goto L_0x036c
        L_0x033b:
            X.AnonymousClass00C.A0B(r9)     // Catch:{ 1Fu -> 0x035d, IllegalStateException -> 0x0363, Exception -> 0x0357 }
            X.9Si r1 = X.C1899396e.A00(r9)     // Catch:{ 1Fu -> 0x035d, IllegalStateException -> 0x0363, Exception -> 0x0357 }
            X.3un r0 = r13.A0R()     // Catch:{ 1Fu -> 0x035d, IllegalStateException -> 0x0363, Exception -> 0x0357 }
            r1.A00 = r0     // Catch:{ 1Fu -> 0x035d, IllegalStateException -> 0x0363, Exception -> 0x0357 }
            r0 = 1
            r1.A02 = r0     // Catch:{ 1Fu -> 0x035d, IllegalStateException -> 0x0363, Exception -> 0x0357 }
            r1.A06 = r0     // Catch:{ 1Fu -> 0x035d, IllegalStateException -> 0x0363, Exception -> 0x0357 }
            X.9Xy r1 = r1.A00()     // Catch:{ 1Fu -> 0x035d, IllegalStateException -> 0x0363, Exception -> 0x0357 }
            X.0xh r0 = r11.A06     // Catch:{ 1Fu -> 0x035d, IllegalStateException -> 0x0363, Exception -> 0x0357 }
            r0.A02(r1, r13)     // Catch:{ 1Fu -> 0x035d, IllegalStateException -> 0x0363, Exception -> 0x0357 }
            goto L_0x036c
        L_0x0357:
            r3 = move-exception
            X.1Jb r2 = r11.A01
            X.8zz r1 = X.C188648zz.A0U
            goto L_0x0368
        L_0x035d:
            r3 = move-exception
            X.1Jb r2 = r11.A01
            X.8zz r1 = X.C188648zz.A0W
            goto L_0x0368
        L_0x0363:
            r3 = move-exception
            X.1Jb r2 = r11.A01
            X.8zz r1 = X.C188648zz.A0V
        L_0x0368:
            r0 = 0
            r2.A01(r1, r0, r3)
        L_0x036c:
            X.1TF r1 = r11.A07
            X.3P8 r0 = X.AnonymousClass1TF.A00(r13)
            if (r0 == 0) goto L_0x04ae
            java.lang.String r8 = r1.A02(r0)
            if (r8 == 0) goto L_0x04ae
            X.8N6 r7 = X.C170918Hz.A0M(r9)
            X.8Hz r2 = r7.A00
            X.8SL r2 = (X.AnonymousClass8SL) r2
            int r1 = r2.formatCase_
            r0 = 2
            if (r1 != r0) goto L_0x045e
            java.lang.Object r0 = r2.format_
            X.8Hz r0 = (X.C170918Hz) r0
        L_0x038b:
            X.8NN r6 = r0.A0q()
            X.8N7 r6 = (X.AnonymousClass8N7) r6
            X.8Hz r0 = r6.A00
            X.8SO r0 = (X.AnonymousClass8SO) r0
            java.lang.String r0 = r0.hydratedContentText_
            java.lang.String r5 = "<code>"
            java.lang.String r2 = r0.replace(r8, r5)
            X.8Hz r1 = X.C90524aI.A0H(r6)
            X.8SO r1 = (X.AnonymousClass8SO) r1
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            r1.hydratedContentText_ = r2
            X.8Hz r0 = r6.A00
            X.8SO r0 = (X.AnonymousClass8SO) r0
            java.lang.String r0 = r0.hydratedFooterText_
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x03d5
            X.8Hz r0 = r6.A00
            X.8SO r0 = (X.AnonymousClass8SO) r0
            java.lang.String r0 = r0.hydratedFooterText_
            java.lang.String r2 = r0.replace(r8, r5)
            X.8Hz r1 = X.C90524aI.A0H(r6)
            X.8SO r1 = (X.AnonymousClass8SO) r1
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 64
            r1.bitField0_ = r0
            r1.hydratedFooterText_ = r2
        L_0x03d5:
            X.8Hz r0 = r6.A00
            X.8SO r0 = (X.AnonymousClass8SO) r0
            X.B6c r0 = r0.hydratedButtons_
            java.util.List r1 = java.util.Collections.unmodifiableList(r0)
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            if (r1 == 0) goto L_0x0484
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0484
            java.util.Iterator r16 = r1.iterator()
        L_0x03ef:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0462
            java.lang.Object r0 = r16.next()
            X.8Hz r0 = (X.C170918Hz) r0
            X.8NN r15 = r0.A0q()
            X.8Hz r2 = r15.A00
            X.8SJ r2 = (X.AnonymousClass8SJ) r2
            int r1 = r2.hydratedButtonCase_
            if (r1 == 0) goto L_0x045b
            r0 = 1
            if (r1 == r0) goto L_0x0458
            r0 = 2
            if (r1 == r0) goto L_0x0455
            r0 = 3
            if (r1 == r0) goto L_0x0452
            r1 = 0
        L_0x0411:
            java.lang.Integer r0 = X.C023109s.A01
            if (r1 != r0) goto L_0x044a
            X.8Qe r0 = r2.A0u()
            X.8NN r3 = r0.A0q()
            X.8Hz r0 = r3.A00
            X.8Qe r0 = (X.C173048Qe) r0
            java.lang.String r0 = r0.url_
            java.lang.String r2 = r0.replace(r8, r5)
            X.8Hz r1 = X.C90524aI.A0H(r3)
            X.8Qe r1 = (X.C173048Qe) r1
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.url_ = r2
            X.8Hz r0 = r3.A0R()
            X.8Hz r1 = X.C90524aI.A0H(r15)
            X.8SJ r1 = (X.AnonymousClass8SJ) r1
            r0.getClass()
            r1.hydratedButton_ = r0
            r0 = 2
            r1.hydratedButtonCase_ = r0
        L_0x044a:
            X.8Hz r0 = r15.A0R()
            r4.add(r0)
            goto L_0x03ef
        L_0x0452:
            java.lang.Integer r1 = X.C023109s.A0C
            goto L_0x0411
        L_0x0455:
            java.lang.Integer r1 = X.C023109s.A01
            goto L_0x0411
        L_0x0458:
            java.lang.Integer r1 = X.C023109s.A00
            goto L_0x0411
        L_0x045b:
            java.lang.Integer r1 = X.C023109s.A0G
            goto L_0x0411
        L_0x045e:
            X.8SO r0 = X.AnonymousClass8SO.DEFAULT_INSTANCE
            goto L_0x038b
        L_0x0462:
            X.8Hz r1 = X.C90524aI.A0H(r6)
            X.8SO r1 = (X.AnonymousClass8SO) r1
            X.8I2 r0 = X.AnonymousClass8I2.A02
            r1.hydratedButtons_ = r0
            X.8Hz r2 = X.C90524aI.A0H(r6)
            X.8SO r2 = (X.AnonymousClass8SO) r2
            X.B6c r1 = r2.hydratedButtons_
            r0 = r1
            X.AcE r0 = (X.C21886AcE) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0481
            X.B6c r1 = X.C170918Hz.A0A(r1)
            r2.hydratedButtons_ = r1
        L_0x0481:
            X.C21071A7i.A0O(r4, r1)
        L_0x0484:
            X.8Hz r1 = r6.A00
            X.8SO r1 = (X.AnonymousClass8SO) r1
            int r0 = r1.titleCase_
            r2 = 2
            if (r0 != r2) goto L_0x04b4
            java.lang.Object r1 = r1.title_
            java.lang.String r1 = (java.lang.String) r1
        L_0x0491:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x04a8
            java.lang.String r1 = r1.replace(r8, r5)
            X.8Hz r0 = X.C90524aI.A0H(r6)
            X.8SO r0 = (X.AnonymousClass8SO) r0
            r1.getClass()
            r0.titleCase_ = r2
            r0.title_ = r1
        L_0x04a8:
            r7.A0U(r6)
            r9.A0g(r7)
        L_0x04ae:
            byte[] r1 = X.AnonymousClass8NN.A0N(r9)
            goto L_0x0309
        L_0x04b4:
            java.lang.String r1 = ""
            goto L_0x0491
        L_0x04b7:
            boolean r1 = r9.equals(r0)
            if (r1 == 0) goto L_0x02eb
            r10 = r0
            goto L_0x02ed
        L_0x04c0:
            r8 = r1
            boolean r0 = r9.equals(r1)
            goto L_0x04ee
        L_0x04c6:
            r8 = r2
            boolean r0 = r9.equals(r2)
            goto L_0x04ee
        L_0x04cc:
            r8 = r3
            boolean r0 = r9.equals(r3)
            goto L_0x04ee
        L_0x04d2:
            r8 = r4
            boolean r0 = r9.equals(r4)
            goto L_0x04ee
        L_0x04d8:
            r8 = r5
            boolean r0 = r9.equals(r5)
            goto L_0x04ee
        L_0x04de:
            r8 = r6
            boolean r0 = r9.equals(r6)
            goto L_0x04ee
        L_0x04e4:
            r8 = r7
            boolean r0 = r9.equals(r7)
            goto L_0x04ee
        L_0x04ea:
            boolean r0 = r9.equals(r8)
        L_0x04ee:
            if (r0 == 0) goto L_0x02eb
            r10 = r8
            goto L_0x02ed
        L_0x04f3:
            boolean r0 = r9.equals(r15)
            if (r0 == 0) goto L_0x02eb
            r10 = r15
            goto L_0x02ed
        L_0x04fc:
            r0 = r16
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x02eb
            r10 = r16
            goto L_0x02ed
        L_0x0508:
            r0 = r17
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x02eb
            r10 = r17
            goto L_0x02ed
        L_0x0514:
            r0 = r18
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x02eb
            r10 = r18
            goto L_0x02ed
        L_0x0520:
            r0 = r19
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x02eb
            r10 = r19
            goto L_0x02ed
        L_0x052c:
            r0 = r20
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x02eb
            r10 = r20
            goto L_0x02ed
        L_0x0538:
            r0 = r21
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x02eb
            r10 = r21
            goto L_0x02ed
        L_0x0544:
            r0 = r22
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x02eb
            r10 = r22
            goto L_0x02ed
        L_0x0550:
            r0 = r23
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x02eb
            r10 = r23
            goto L_0x02ed
        L_0x055c:
            r0 = r24
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x02eb
            r10 = r24
            goto L_0x02ed
        L_0x0568:
            r0 = r25
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x02eb
            r10 = r25
            goto L_0x02ed
        L_0x0574:
            r0 = r26
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x02eb
            r10 = r26
            goto L_0x02ed
        L_0x0580:
            java.lang.String r10 = "contact_array"
            goto L_0x058e
        L_0x0583:
            java.lang.String r10 = "product_list"
            goto L_0x058e
        L_0x0586:
            java.lang.String r10 = "list_response"
            goto L_0x058e
        L_0x0589:
            java.lang.String r10 = "location"
            goto L_0x058e
        L_0x058c:
            java.lang.String r10 = "genai_sticker"
        L_0x058e:
            boolean r0 = r9.equals(r10)
            if (r0 != 0) goto L_0x02ed
            goto L_0x02eb
        L_0x0596:
            java.lang.String r33 = "view_once_opened"
            goto L_0x002b
        L_0x059a:
            java.lang.String r0 = "This shouldn't happen as FMessagePaymentRequestResponse has only two implementations"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x05a1:
            java.lang.String r0 = "typeAttributeValue can't be null"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x05a8:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196139Xw.A02(X.3T1, java.lang.String):X.8ue");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0039, code lost:
        if (r2.length() == 0) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A03(com.whatsapp.jid.UserJid r16) {
        /*
            r15 = this;
            if (r16 == 0) goto L_0x012d
            X.0yC r1 = r15.A05
            r0 = 6551(0x1997, float:9.18E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x012d
            X.6TL r6 = r15.A04
            java.lang.String r3 = r16.getRawString()
            r4 = 0
            X.AnonymousClass00C.A0D(r3, r4)
            java.util.LinkedHashMap r5 = X.C36431kI.A1G()
            X.1KW r0 = r6.A02     // Catch:{ Exception -> 0x005e }
            X.0u1 r0 = r0.A00     // Catch:{ Exception -> 0x005e }
            java.lang.Object r2 = r0.get()     // Catch:{ Exception -> 0x005e }
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2     // Catch:{ Exception -> 0x005e }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x005e }
            java.lang.String r0 = "messageless_flow_ids_per_business_"
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r3, r1)     // Catch:{ Exception -> 0x005e }
            java.lang.String r2 = X.C36371kC.A0t(r2, r0)     // Catch:{ Exception -> 0x005e }
            if (r2 == 0) goto L_0x003b
            int r1 = r2.length()     // Catch:{ Exception -> 0x005e }
            r0 = 0
            if (r1 != 0) goto L_0x003c
        L_0x003b:
            r0 = 1
        L_0x003c:
            if (r0 != 0) goto L_0x007e
            java.lang.String r0 = ","
            java.util.List r0 = X.C90494aF.A0i(r2, r0)     // Catch:{ Exception -> 0x005e }
            java.util.Set r0 = X.C007103b.A0f(r0)     // Catch:{ Exception -> 0x005e }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ Exception -> 0x005e }
        L_0x004c:
            boolean r0 = r2.hasNext()     // Catch:{ Exception -> 0x005e }
            if (r0 == 0) goto L_0x007e
            java.lang.String r1 = X.AnonymousClass001.A0C(r2)     // Catch:{ Exception -> 0x005e }
            java.util.List r0 = r6.A02(r1)     // Catch:{ Exception -> 0x005e }
            r5.put(r1, r0)     // Catch:{ Exception -> 0x005e }
            goto L_0x004c
        L_0x005e:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FlowsLogger/getReportingDataForMessagelessFlow throws exception"
            X.C36321k7.A1W(r0, r1, r2)
            X.0wN r3 = r6.A00
            java.lang.String r2 = r2.getMessage()
            X.0yC r1 = r6.A04
            r0 = 3178(0xc6a, float:4.453E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x0079
            r2 = 0
        L_0x0079:
            java.lang.String r0 = "ExtensionsLogger/getReportingDataForMessagelessFlow"
            r3.A0E(r0, r2, r4)
        L_0x007e:
            java.util.Set r0 = r5.keySet()
            java.util.ArrayList r6 = X.C36411kG.A13(r0)
            java.util.Iterator r4 = r0.iterator()
            r3 = 0
        L_0x008b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00bd
            java.lang.Object r2 = r4.next()
            int r1 = r3 + 1
            if (r3 >= 0) goto L_0x009e
            java.lang.RuntimeException r0 = X.C36351kA.A0v()
            throw r0
        L_0x009e:
            java.util.Set r0 = r5.keySet()
            int r0 = r0.size()
            int r0 = r0 + -5
            if (r3 < r0) goto L_0x00bb
            java.lang.Object r0 = r5.get(r2)
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x00bb
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00bb
            r6.add(r2)
        L_0x00bb:
            r3 = r1
            goto L_0x008b
        L_0x00bd:
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.util.Iterator r7 = r6.iterator()
        L_0x00c5:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0110
            java.lang.Object r0 = r7.next()
            java.lang.Object r0 = r5.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x00c5
            java.util.ArrayList r3 = X.C36351kA.A0z(r0)
            java.util.Iterator r6 = r0.iterator()
        L_0x00df:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x010c
            java.lang.Object r2 = r6.next()
            X.6DH r2 = (X.AnonymousClass6DH) r2
            java.lang.String r10 = r2.A00
            java.lang.String r11 = r2.A05
            java.lang.String r0 = r2.A01
            java.lang.Long r0 = X.AnonymousClass097.A04(r0)
            long r0 = X.C36371kC.A0A(r0)
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
            java.lang.String r12 = r2.A04
            java.lang.String r13 = r2.A03
            java.lang.String r14 = r2.A02
            X.2l7 r8 = new X.2l7
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r3.add(r8)
            goto L_0x00df
        L_0x010c:
            r4.add(r3)
            goto L_0x00c5
        L_0x0110:
            java.util.ArrayList r3 = X.C36351kA.A0z(r4)
            java.util.Iterator r2 = r4.iterator()
        L_0x0118:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x012f
            java.lang.Object r1 = r2.next()
            java.util.List r1 = (java.util.List) r1
            X.2l7 r0 = new X.2l7
            r0.<init>((java.util.List) r1)
            r3.add(r0)
            goto L_0x0118
        L_0x012d:
            X.09w r3 = X.C023409w.A00
        L_0x012f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196139Xw.A03(com.whatsapp.jid.UserJid):java.util.List");
    }
}
