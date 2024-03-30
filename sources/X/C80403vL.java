package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.3vL  reason: invalid class name and case insensitive filesystem */
public class C80403vL implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C80403vL(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    public static AnonymousClass2RB A00(C21010yW r3, C63493Kg r4, Jid jid, String str, String str2) {
        C45092Qa r2 = new C45092Qa();
        r2.A02 = 10;
        r2.A01 = Integer.valueOf(C65573Sp.A00(r4));
        r2.A04 = str;
        r2.A03 = str2;
        r3.Bly(r2);
        AnonymousClass2RB r22 = new AnonymousClass2RB();
        r22.A02 = 10;
        r22.A01 = Integer.valueOf(C65573Sp.A00(r4));
        r22.A03 = Long.valueOf(Long.parseLong(jid.user));
        return r22;
    }

    public static void A01(C19770wU r1, Object obj, Object obj2, Object obj3, int i) {
        r1.Boy(new C80403vL(obj, obj2, obj3, i));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0246, code lost:
        if (r8 == 2) goto L_0x0303;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0249, code lost:
        if (r8 == 3) goto L_0x02ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x024c, code lost:
        if (r8 == 5) goto L_0x02fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0250, code lost:
        if (r8 == 9) goto L_0x02f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0254, code lost:
        if (r8 == 20) goto L_0x02f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0258, code lost:
        if (r8 == 44) goto L_0x02ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x025a, code lost:
        r0 = "unsupported";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x025c, code lost:
        r8 = new X.C43982Kr(r6, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0261, code lost:
        r0 = r8.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0265, code lost:
        if (r0 == null) goto L_0x026a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0267, code lost:
        r0.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x026a, code lost:
        r2 = r3.A03;
        r10 = X.C19970wo.A00(r2);
        r9 = r5.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0272, code lost:
        if (r9 == null) goto L_0x0286;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x027c, code lost:
        if ((r9.A00 + 86400000) >= r10) goto L_0x02eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x027e, code lost:
        r5.A01.add(r9);
        r5.A00 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0286, code lost:
        r7 = r3.A05.A03(r4.getRawString());
        r8.A00 = 1;
        r0 = X.C19970wo.A00(r2);
        r6 = r4.getRawString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x029b, code lost:
        if (r7 != null) goto L_0x029f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x029d, code lost:
        r7 = "defaultThreadID";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x029f, code lost:
        r2 = new X.C43972Kq(r0, r6, r7);
        r5.A00 = r2;
        r2.A04(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02a9, code lost:
        X.C36341k9.A0x(X.AnonymousClass3TQ.A00(r3).edit(), r4.getRawString(), X.C36331k8.A0h(r5.A03()));
        r2 = r4.getRawString();
        r1 = X.AnonymousClass3TQ.A02(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02ce, code lost:
        if (r1.A00.contains(r2) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02d0, code lost:
        r1.A00.add(r2);
        X.C36341k9.A0x(X.AnonymousClass3TQ.A00(r3).edit(), "merchant_jid_list", X.C36331k8.A0h(r1.A03()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02ea, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0055, code lost:
        if (r3.A1J.A02 != false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02eb, code lost:
        r9.A04(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02ef, code lost:
        r0 = "order";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02f3, code lost:
        r0 = "sticker";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02f7, code lost:
        r0 = "document";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02fb, code lost:
        r0 = "location";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02ff, code lost:
        r0 = "video";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0303, code lost:
        r0 = "audio";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0307, code lost:
        r0 = "image";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x030b, code lost:
        r0 = "template_hsm";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x030e, code lost:
        r0 = "template_hsm_reply";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0310, code lost:
        r8 = new X.C44002Kt(r7, r2, r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x031b, code lost:
        if (X.C61583Cq.A00(r7) != null) goto L_0x0353;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x031f, code lost:
        if (r7.A0t == null) goto L_0x0325;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0321, code lost:
        r0 = "payment";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0325, code lost:
        if (r10 != false) goto L_0x0332;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0327, code lost:
        r0 = r7.A0S();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x032b, code lost:
        if (r0 == null) goto L_0x0332;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x032f, code lost:
        if (r0.A1I != 54) goto L_0x0332;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x033b, code lost:
        if (android.text.TextUtils.isEmpty(((X.AnonymousClass2bV) r7).A06) == false) goto L_0x0346;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0343, code lost:
        if (X.C44012Ku.A00(r7.A0m) != false) goto L_0x0346;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0345, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0346, code lost:
        r8 = new X.C43992Ks(r6, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0351, code lost:
        if (X.C61583Cq.A00(r7) == null) goto L_0x0243;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0353, code lost:
        r8 = new X.C44012Ku(r7, r2, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x035a, code lost:
        r2 = "received";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x035e, code lost:
        r0 = r0.A04.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03ca, code lost:
        r6.A0H(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03cd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0071, code lost:
        if (r5.A0I == null) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x0797, code lost:
        X.AnonymousClass1JN.A00(r2, r4, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x079a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x08cc, code lost:
        r2.A07(r4, r0.BEP(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x08d3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0136, code lost:
        r0 = r5.A00;
        r0.A0G();
        r2 = r0.A0E;
        r1 = r5.A01.A08(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0143, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0145, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0147, code lost:
        r2 = X.AnonymousClass3U8.A04(X.C36351kA.A0j(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x014f, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0151, code lost:
        r0 = new X.C43862Kc(r2, r1.A0C());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0178, code lost:
        r3.A0C(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x017b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01c2, code lost:
        r1 = r3.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01ca, code lost:
        if (r1.A0E(5535) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01cc, code lost:
        r1 = r1.A09(5536);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01d8, code lost:
        if ("*".equals(r1) != false) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01ea, code lost:
        if (java.util.Arrays.asList(r1.split(",")).contains(r4.user) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01ec, code lost:
        X.AnonymousClass3TQ.A03(r3, false);
        r7 = r3.A06.A03(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:650:0x1017, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:652:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:653:0x101b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:657:0x101e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:658:0x101f, code lost:
        X.C05600Qi.A00(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:659:0x1022, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01f6, code lost:
        if (r7 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01f8, code lost:
        r8 = r7.A1I;
        r5 = X.AnonymousClass3TQ.A01(r3, r4.getRawString());
        r0 = r5.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:672:0x1030, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:674:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:675:0x1034, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:679:0x1037, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0204, code lost:
        if (r0 != null) goto L_0x035e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:680:0x1038, code lost:
        X.C05600Qi.A00(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:681:0x103b, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0206, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:694:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:695:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:696:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:699:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0207, code lost:
        r6 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:700:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:701:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:702:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0209, code lost:
        if (r10 == false) goto L_0x035a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x020b, code lost:
        r2 = "sent";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x020d, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0210, code lost:
        if (r8 == 0) goto L_0x0317;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0212, code lost:
        if (r8 == 1) goto L_0x034d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0215, code lost:
        if (r8 == 2) goto L_0x034d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0218, code lost:
        if (r8 == 3) goto L_0x034d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x021c, code lost:
        if (r8 == 9) goto L_0x034d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0220, code lost:
        if (r8 == 20) goto L_0x034d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0224, code lost:
        if (r8 == 23) goto L_0x0353;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0228, code lost:
        if (r8 == 32) goto L_0x030e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x022c, code lost:
        if (r8 == 49) goto L_0x0353;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0230, code lost:
        if (r8 == 52) goto L_0x0353;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0234, code lost:
        if (r8 == 45) goto L_0x0353;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0238, code lost:
        if (r8 == 46) goto L_0x0353;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x023a, code lost:
        if (r8 == 54) goto L_0x0353;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x023e, code lost:
        if (r8 == 55) goto L_0x0353;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0240, code lost:
        switch(r8) {
            case 25: goto L_0x030b;
            case 26: goto L_0x030b;
            case 27: goto L_0x030b;
            case 28: goto L_0x030b;
            case 29: goto L_0x030b;
            case 30: goto L_0x030b;
            default: goto L_0x0243;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0243, code lost:
        if (r8 == 1) goto L_0x0307;
     */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0628  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0634  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x063f  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0666  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x0673  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x06a6  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x06c1 A[LOOP:0: B:287:0x06bb->B:289:0x06c1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x06d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r45 = this;
            r3 = r45
            int r0 = r3.A03
            switch(r0) {
                case 0: goto L_0x0757;
                case 1: goto L_0x0769;
                case 2: goto L_0x0081;
                case 3: goto L_0x0782;
                case 4: goto L_0x079b;
                case 5: goto L_0x07ab;
                case 6: goto L_0x07fe;
                case 7: goto L_0x080e;
                case 8: goto L_0x001c;
                case 9: goto L_0x081e;
                case 10: goto L_0x084a;
                case 11: goto L_0x0869;
                case 12: goto L_0x0882;
                case 13: goto L_0x089b;
                case 14: goto L_0x08b4;
                case 15: goto L_0x08d4;
                case 16: goto L_0x0097;
                case 17: goto L_0x08e4;
                case 18: goto L_0x00d7;
                case 19: goto L_0x012a;
                case 20: goto L_0x0107;
                case 21: goto L_0x015b;
                case 22: goto L_0x08f7;
                case 23: goto L_0x017c;
                case 24: goto L_0x0199;
                case 25: goto L_0x01ae;
                case 26: goto L_0x0913;
                case 27: goto L_0x092b;
                case 28: goto L_0x0b83;
                case 29: goto L_0x0366;
                case 30: goto L_0x0b9e;
                case 31: goto L_0x0bb7;
                case 32: goto L_0x0cae;
                case 33: goto L_0x0cc0;
                case 34: goto L_0x03ce;
                case 35: goto L_0x0f23;
                case 36: goto L_0x0cd6;
                case 37: goto L_0x042f;
                case 38: goto L_0x0d17;
                case 39: goto L_0x0d74;
                case 40: goto L_0x0d8c;
                case 41: goto L_0x0456;
                case 42: goto L_0x0d9e;
                case 43: goto L_0x0dbf;
                case 44: goto L_0x04ba;
                case 45: goto L_0x0dd1;
                case 46: goto L_0x0eaf;
                case 47: goto L_0x04d9;
                case 48: goto L_0x06e2;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r3.A00
            X.1V6 r0 = (X.AnonymousClass1V6) r0
            java.lang.Object r4 = r3.A01
            X.0wU r4 = (X.C19770wU) r4
            java.lang.Object r2 = r3.A02
            X.1lx r1 = new X.1lx
            r1.<init>(r0)
            r0 = 30
            X.C80293vA.A00(r4, r2, r1, r0)
        L_0x001b:
            return
        L_0x001c:
            java.lang.Object r2 = r3.A00
            X.2IO r2 = (X.AnonymousClass2IO) r2
            java.lang.Object r5 = r3.A01
            X.3Qj r5 = (X.C65013Qj) r5
            java.lang.Object r3 = r3.A02
            X.2bU r3 = (X.AnonymousClass2bU) r3
            X.0yC r1 = r2.A0G
            r0 = 3936(0xf60, float:5.516E-42)
            int r6 = r1.A07(r0)
            X.1D4 r0 = r2.A05
            r4 = 1
            java.lang.Float r1 = r0.A01(r4)
            X.1E2 r0 = r2.A1W
            boolean r0 = r0.A02(r5)
            if (r0 == 0) goto L_0x0057
            if (r1 == 0) goto L_0x0057
            if (r6 < 0) goto L_0x0057
            float r1 = r1.floatValue()
            float r0 = (float) r6
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0057
            boolean r0 = r5.A0V
            if (r0 != 0) goto L_0x0057
            X.3Qa r0 = r3.A1J
            boolean r0 = r0.A02
            r1 = 1
            if (r0 == 0) goto L_0x0058
        L_0x0057:
            r1 = 0
        L_0x0058:
            X.3Qa r0 = r3.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0073
            X.6Q6 r0 = r3.A1Y()
            X.C18740tg.A06(r0)
            boolean r0 = r0.A04()
            if (r0 != 0) goto L_0x0073
            boolean r0 = r5.A0V
            if (r0 != 0) goto L_0x0073
            java.io.File r0 = r5.A0I
            if (r0 == 0) goto L_0x0076
        L_0x0073:
            if (r1 != 0) goto L_0x0076
            r4 = 0
        L_0x0076:
            X.17Y r6 = r2.A0R
            r0 = 27
            X.75B r3 = new X.75B
            r3.<init>((int) r0, (java.lang.Object) r2, (boolean) r4)
            goto L_0x03ca
        L_0x0081:
            java.lang.Object r2 = r3.A00
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            java.lang.Object r0 = r3.A01
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r1 = r3.A02
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            X.4V7 r0 = X.AnonymousClass3SS.A01(r0)
            if (r0 == 0) goto L_0x001b
            r0.BpT(r2, r1)
            return
        L_0x0097:
            java.lang.Object r7 = r3.A00
            X.2K6 r7 = (X.AnonymousClass2K6) r7
            java.lang.Object r10 = r3.A01
            X.3T1 r10 = (X.AnonymousClass3T1) r10
            java.lang.Object r9 = r3.A02
            X.1Ju r0 = r7.A05
            int r4 = r0.A00()
            X.3Qa r0 = r10.A1J
            X.11F r1 = r0.A00
            if (r1 == 0) goto L_0x001b
            X.1Jr r0 = r7.A02
            X.0x8 r2 = r0.A03
            X.163 r0 = r0.A01
            long r0 = r0.A08(r1)
            java.lang.String[] r6 = X.C36441kJ.A1S()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r5 = 0
            r6[r5] = r0
            X.0wo r0 = r2.A00
            long r0 = X.C19970wo.A00(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 1
            r6[r0] = r1
            X.12P r0 = r2.A03
            X.1M0 r3 = r0.get()
            goto L_0x0f9c
        L_0x00d7:
            java.lang.Object r6 = r3.A00
            X.11F r6 = (X.AnonymousClass11F) r6
            java.lang.Object r5 = r3.A01
            X.2KJ r5 = (X.AnonymousClass2KJ) r5
            java.lang.Object r4 = r3.A02
            X.3T1 r4 = (X.AnonymousClass3T1) r4
            if (r6 == 0) goto L_0x00fd
            X.19x r1 = r5.A06
            X.0wo r0 = r5.A02
            long r2 = X.C19970wo.A00(r0)
            X.19w r0 = r1.A01
            X.3Qa r0 = X.C36411kG.A0o(r6, r0)
            X.2cE r1 = new X.2cE
            r1.<init>(r0, r2)
            X.0xM r0 = r5.A03
            r0.A0P(r1)
        L_0x00fd:
            if (r4 == 0) goto L_0x001b
            long r1 = r4.A1N
            X.3Fb r0 = r5.A05
            r0.A01(r1)
            return
        L_0x0107:
            java.lang.Object r5 = r3.A00
            com.whatsapp.conversation.conversationrow.viewmodel.SharePhoneNumberRowViewModel r5 = (com.whatsapp.conversation.conversationrow.viewmodel.SharePhoneNumberRowViewModel) r5
            java.lang.Object r4 = r3.A01
            X.11F r4 = (X.AnonymousClass11F) r4
            java.lang.Object r3 = r3.A02
            X.00r r3 = (X.C001600r) r3
            X.1FV r1 = r5.A03
            r0 = r4
            X.13w r0 = (X.C223313w) r0
            java.lang.Boolean r1 = r1.A06(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0136
            X.2Kb r0 = new X.2Kb
            r0.<init>(r4)
            goto L_0x0178
        L_0x012a:
            java.lang.Object r5 = r3.A00
            com.whatsapp.conversation.conversationrow.viewmodel.SharePhoneNumberRowViewModel r5 = (com.whatsapp.conversation.conversationrow.viewmodel.SharePhoneNumberRowViewModel) r5
            java.lang.Object r4 = r3.A01
            X.11F r4 = (X.AnonymousClass11F) r4
            java.lang.Object r3 = r3.A02
            X.00r r3 = (X.C001600r) r3
        L_0x0136:
            X.0wQ r0 = r5.A00
            r0.A0G()
            X.142 r2 = r0.A0E
            X.16D r0 = r5.A01
            X.141 r1 = r0.A08(r4)
            if (r2 == 0) goto L_0x001b
            if (r1 == 0) goto L_0x001b
            X.11F r0 = X.C36351kA.A0j(r2)
            java.lang.String r2 = X.AnonymousClass3U8.A04(r0)
            if (r2 == 0) goto L_0x001b
            boolean r1 = r1.A0C()
            X.2Kc r0 = new X.2Kc
            r0.<init>(r2, r1)
            goto L_0x0178
        L_0x015b:
            java.lang.Object r4 = r3.A00
            com.whatsapp.conversation.conversationrow.viewmodel.SharePhoneNumberRowViewModel r4 = (com.whatsapp.conversation.conversationrow.viewmodel.SharePhoneNumberRowViewModel) r4
            java.lang.Object r1 = r3.A01
            X.11F r1 = (X.AnonymousClass11F) r1
            java.lang.Object r3 = r3.A02
            X.00r r3 = (X.C001600r) r3
            X.16D r0 = r4.A01
            X.141 r2 = r0.A08(r1)
            if (r2 == 0) goto L_0x001b
            X.171 r1 = r4.A02
            r0 = 2131896511(0x7f1228bf, float:1.9427885E38)
            java.lang.String r0 = X.AnonymousClass171.A03(r1, r2, r0)
        L_0x0178:
            r3.A0C(r0)
            return
        L_0x017c:
            java.lang.Object r4 = r3.A00
            X.3fk r4 = (X.C70803fk) r4
            java.lang.Object r1 = r3.A01
            X.3Qa r1 = (X.C64933Qa) r1
            java.lang.Object r2 = r3.A02
            X.1A1 r0 = r4.A52
            X.3T1 r1 = r0.A03(r1)
            if (r1 == 0) goto L_0x001b
            X.17Y r6 = r4.A1U
            r0 = 22
            X.3vL r3 = new X.3vL
            r3.<init>(r4, r1, r2, r0)
            goto L_0x03ca
        L_0x0199:
            java.lang.Object r0 = r3.A00
            X.4a6 r0 = (X.C90404a6) r0
            java.lang.Object r4 = r3.A01
            com.whatsapp.jid.Jid r4 = (com.whatsapp.jid.Jid) r4
            java.lang.Object r2 = r3.A02
            X.3Qa r2 = (X.C64933Qa) r2
            r4.getRawString()
            java.lang.Object r3 = r0.A00
            X.3TQ r3 = (X.AnonymousClass3TQ) r3
            r10 = 0
            goto L_0x01c2
        L_0x01ae:
            java.lang.Object r0 = r3.A00
            X.4a6 r0 = (X.C90404a6) r0
            java.lang.Object r4 = r3.A01
            com.whatsapp.jid.Jid r4 = (com.whatsapp.jid.Jid) r4
            java.lang.Object r2 = r3.A02
            X.3Qa r2 = (X.C64933Qa) r2
            r4.getRawString()
            java.lang.Object r3 = r0.A00
            X.3TQ r3 = (X.AnonymousClass3TQ) r3
            r10 = 1
        L_0x01c2:
            X.0yC r1 = r3.A04
            r0 = 5535(0x159f, float:7.756E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x001b
            r0 = 5536(0x15a0, float:7.758E-42)
            java.lang.String r1 = r1.A09(r0)
            java.lang.String r0 = "*"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01ec
            java.lang.String r0 = ","
            java.lang.String[] r0 = r1.split(r0)
            java.util.List r1 = java.util.Arrays.asList(r0)
            java.lang.String r0 = r4.user
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x001b
        L_0x01ec:
            r0 = 0
            X.AnonymousClass3TQ.A03(r3, r0)
            X.1A1 r0 = r3.A06
            X.3T1 r7 = r0.A03(r2)
            if (r7 == 0) goto L_0x001b
            int r8 = r7.A1I
            java.lang.String r0 = r4.getRawString()
            X.2Kp r5 = X.AnonymousClass3TQ.A01(r3, r0)
            X.2Kq r0 = r5.A00
            if (r0 != 0) goto L_0x035e
            r0 = 0
        L_0x0207:
            int r6 = r0 + 1
            if (r10 == 0) goto L_0x035a
            java.lang.String r2 = "sent"
        L_0x020d:
            r9 = 54
            r1 = 1
            if (r8 == 0) goto L_0x0317
            if (r8 == r1) goto L_0x034d
            r0 = 2
            if (r8 == r0) goto L_0x034d
            r0 = 3
            if (r8 == r0) goto L_0x034d
            r0 = 9
            if (r8 == r0) goto L_0x034d
            r0 = 20
            if (r8 == r0) goto L_0x034d
            r0 = 23
            if (r8 == r0) goto L_0x0353
            r0 = 32
            if (r8 == r0) goto L_0x030e
            r0 = 49
            if (r8 == r0) goto L_0x0353
            r0 = 52
            if (r8 == r0) goto L_0x0353
            r0 = 45
            if (r8 == r0) goto L_0x0353
            r0 = 46
            if (r8 == r0) goto L_0x0353
            if (r8 == r9) goto L_0x0353
            r0 = 55
            if (r8 == r0) goto L_0x0353
            switch(r8) {
                case 25: goto L_0x030b;
                case 26: goto L_0x030b;
                case 27: goto L_0x030b;
                case 28: goto L_0x030b;
                case 29: goto L_0x030b;
                case 30: goto L_0x030b;
                default: goto L_0x0243;
            }
        L_0x0243:
            if (r8 == r1) goto L_0x0307
            r0 = 2
            if (r8 == r0) goto L_0x0303
            r0 = 3
            if (r8 == r0) goto L_0x02ff
            r0 = 5
            if (r8 == r0) goto L_0x02fb
            r0 = 9
            if (r8 == r0) goto L_0x02f7
            r0 = 20
            if (r8 == r0) goto L_0x02f3
            r0 = 44
            if (r8 == r0) goto L_0x02ef
            java.lang.String r0 = "unsupported"
        L_0x025c:
            X.2Kr r8 = new X.2Kr
            r8.<init>(r6, r2, r0)
        L_0x0261:
            org.json.JSONObject r0 = r8.A03()
            if (r0 == 0) goto L_0x026a
            r0.toString()
        L_0x026a:
            X.0wo r2 = r3.A03
            long r10 = X.C19970wo.A00(r2)
            X.2Kq r9 = r5.A00
            if (r9 == 0) goto L_0x0286
            long r6 = r9.A00
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r6 = r6 + r0
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x02eb
            java.util.List r0 = r5.A01
            r0.add(r9)
            r0 = 0
            r5.A00 = r0
        L_0x0286:
            X.17V r1 = r3.A05
            java.lang.String r0 = r4.getRawString()
            java.lang.String r7 = r1.A03(r0)
            r0 = 1
            r8.A00 = r0
            long r0 = X.C19970wo.A00(r2)
            java.lang.String r6 = r4.getRawString()
            if (r7 != 0) goto L_0x029f
            java.lang.String r7 = "defaultThreadID"
        L_0x029f:
            X.2Kq r2 = new X.2Kq
            r2.<init>(r0, r6, r7)
            r5.A00 = r2
            r2.A04(r8)
        L_0x02a9:
            java.lang.String r2 = r4.getRawString()
            android.content.SharedPreferences r0 = X.AnonymousClass3TQ.A00(r3)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            org.json.JSONObject r0 = r5.A03()
            java.lang.String r0 = X.C36331k8.A0h(r0)
            X.C36341k9.A0x(r1, r2, r0)
            java.lang.String r2 = r4.getRawString()
            X.2Ko r1 = X.AnonymousClass3TQ.A02(r3)
            java.util.List r0 = r1.A00
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x001b
            java.util.List r0 = r1.A00
            r0.add(r2)
            android.content.SharedPreferences r0 = X.AnonymousClass3TQ.A00(r3)
            android.content.SharedPreferences$Editor r2 = r0.edit()
            org.json.JSONObject r0 = r1.A03()
            java.lang.String r1 = X.C36331k8.A0h(r0)
            java.lang.String r0 = "merchant_jid_list"
            X.C36341k9.A0x(r2, r0, r1)
            return
        L_0x02eb:
            r9.A04(r8)
            goto L_0x02a9
        L_0x02ef:
            java.lang.String r0 = "order"
            goto L_0x025c
        L_0x02f3:
            java.lang.String r0 = "sticker"
            goto L_0x025c
        L_0x02f7:
            java.lang.String r0 = "document"
            goto L_0x025c
        L_0x02fb:
            java.lang.String r0 = "location"
            goto L_0x025c
        L_0x02ff:
            java.lang.String r0 = "video"
            goto L_0x025c
        L_0x0303:
            java.lang.String r0 = "audio"
            goto L_0x025c
        L_0x0307:
            java.lang.String r0 = "image"
            goto L_0x025c
        L_0x030b:
            java.lang.String r0 = "template_hsm"
            goto L_0x0310
        L_0x030e:
            java.lang.String r0 = "template_hsm_reply"
        L_0x0310:
            X.2Kt r8 = new X.2Kt
            r8.<init>(r7, r2, r0, r6)
            goto L_0x0261
        L_0x0317:
            X.37E r0 = X.C61583Cq.A00(r7)
            if (r0 != 0) goto L_0x0353
            java.lang.String r0 = r7.A0t
            if (r0 == 0) goto L_0x0325
            java.lang.String r0 = "payment"
            goto L_0x025c
        L_0x0325:
            if (r10 != 0) goto L_0x0332
            X.3T1 r0 = r7.A0S()
            if (r0 == 0) goto L_0x0332
            int r0 = r0.A1I
            if (r0 != r9) goto L_0x0332
            goto L_0x0353
        L_0x0332:
            r0 = r7
            X.2bV r0 = (X.AnonymousClass2bV) r0
            java.lang.String r0 = r0.A06
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0346
            java.lang.String r0 = r7.A0m
            boolean r0 = X.C44012Ku.A00(r0)
            if (r0 != 0) goto L_0x0346
            r1 = 0
        L_0x0346:
            X.2Ks r8 = new X.2Ks
            r8.<init>(r6, r2, r1)
            goto L_0x0261
        L_0x034d:
            X.37E r0 = X.C61583Cq.A00(r7)
            if (r0 == 0) goto L_0x0243
        L_0x0353:
            X.2Ku r8 = new X.2Ku
            r8.<init>(r7, r2, r6)
            goto L_0x0261
        L_0x035a:
            java.lang.String r2 = "received"
            goto L_0x020d
        L_0x035e:
            java.util.List r0 = r0.A04
            int r0 = r0.size()
            goto L_0x0207
        L_0x0366:
            java.lang.Object r7 = r3.A00
            X.39x r7 = (X.C609339x) r7
            java.lang.Object r6 = r3.A01
            X.3T1 r6 = (X.AnonymousClass3T1) r6
            java.lang.Object r5 = r3.A02
            r0 = 2
            X.AnonymousClass00C.A0D(r5, r0)
            X.12P r0 = r7.A03
            X.1M0 r8 = r0.get()
            X.14e r9 = r8.A02     // Catch:{ all -> 0x101c }
            java.lang.String r4 = "SELECT business_owner_jid_row_id FROM business_message_forward_info WHERE message_row_id = ?"
            java.lang.String[] r3 = X.C36441kJ.A1R()     // Catch:{ all -> 0x101c }
            r2 = 0
            long r0 = r6.A1N     // Catch:{ all -> 0x101c }
            X.C36351kA.A1V(r3, r2, r0)     // Catch:{ all -> 0x101c }
            java.lang.String r0 = "GET_BUSINESS_MESSAGE_FORWARD_INFO_FOR_MSG_ROW_ID_SQL"
            android.database.Cursor r2 = r9.A09(r4, r0, r3)     // Catch:{ all -> 0x101c }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x1015 }
            if (r0 == 0) goto L_0x100e
            java.lang.String r0 = "business_owner_jid_row_id"
            int r0 = X.C36351kA.A03(r2, r0)     // Catch:{ all -> 0x1015 }
            long r3 = (long) r0     // Catch:{ all -> 0x1015 }
            r2.close()     // Catch:{ all -> 0x101c }
            r8.close()
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x001b
            X.12j r1 = r7.A02
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r2 = r1.A0C(r0, r3)
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            if (r2 == 0) goto L_0x03c1
            X.16D r0 = r7.A01
            X.141 r1 = r0.A08(r2)
            X.3Ky r0 = new X.3Ky
            r0.<init>(r1, r2)
            r6.A0t(r0)
        L_0x03c1:
            X.17Y r6 = r7.A00
            r0 = 27
            X.3wU r3 = new X.3wU
            r3.<init>((java.lang.Object) r5, (int) r0)
        L_0x03ca:
            r6.A0H(r3)
            return
        L_0x03ce:
            java.lang.Object r4 = r3.A00
            X.28b r4 = (X.AnonymousClass28b) r4
            java.lang.Object r0 = r3.A01
            X.14r r0 = (X.C225014r) r0
            java.lang.Object r2 = r3.A02
            X.4UR r2 = (X.AnonymousClass4UR) r2
            r0.Bnv()
            X.2jW r1 = r4.A00
            if (r1 == 0) goto L_0x03ed
            r0 = 0
            r1.A01 = r0
            r1.A00 = r0
            r0 = 1
            r1.A0D(r0)
            r0 = 0
            r4.A00 = r0
        L_0x03ed:
            X.4Yf r2 = (X.C89874Yf) r2
            int r0 = r2.A01
            if (r0 == 0) goto L_0x001b
            java.lang.Object r3 = r2.A00
            X.3fk r3 = (X.C70803fk) r3
            X.0wU r2 = X.C70803fk.A0K(r3)
            X.11F r0 = r3.A45
            com.whatsapp.jid.UserJid r1 = X.C36401kF.A0b(r0)
            if (r1 == 0) goto L_0x0408
            r0 = 36
            X.C80283v9.A00(r2, r3, r1, r0)
        L_0x0408:
            X.4Ut r1 = r3.A5U
            if (r1 == 0) goto L_0x001b
            boolean r0 = r1.BCi()
            if (r0 == 0) goto L_0x001b
            r1.B34()
            android.view.Window r0 = X.C70803fk.A05(r3)
            android.view.View r1 = r0.getDecorView()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            X.5ND r0 = r3.A5T
            r1.removeView(r0)
            com.whatsapp.conversation.ConversationListView r0 = r3.A2U
            X.1dA r1 = r3.A29
            X.1fP r0 = r0.A05
            java.util.Set r0 = r0.A00
            monitor-enter(r0)
            goto L_0x1023
        L_0x042f:
            java.lang.Object r1 = r3.A00
            X.4WL r1 = (X.AnonymousClass4WL) r1
            java.lang.Object r4 = r3.A01
            java.lang.Object r2 = r3.A02
            com.whatsapp.emoji.search.EmojiSearchKeyboardContainer r2 = (com.whatsapp.emoji.search.EmojiSearchKeyboardContainer) r2
            r0 = 0
            r1.A01 = r0
            java.lang.String r1 = r4.toString()
            java.lang.String r0 = r2.A0E
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 != 0) goto L_0x001b
            int r0 = r2.getVisibility()
            if (r0 != 0) goto L_0x001b
            java.lang.String r0 = r4.toString()
            com.whatsapp.emoji.search.EmojiSearchKeyboardContainer.A00(r2, r0)
            return
        L_0x0456:
            java.lang.Object r8 = r3.A02
            X.39D r8 = (X.AnonymousClass39D) r8
            java.lang.Object r2 = r3.A01
            X.3K1 r2 = (X.AnonymousClass3K1) r2
            java.lang.Object r0 = r3.A00
            X.8zk r0 = (X.C188538zk) r0
            int r1 = r0.ordinal()
            r0 = 4
            if (r1 == r0) goto L_0x0470
            r0 = 5
            if (r1 == r0) goto L_0x0470
            r0 = 1
            if (r1 == r0) goto L_0x0470
            return
        L_0x0470:
            X.1PF r5 = r8.A00
            X.147 r7 = r2.A01
            com.whatsapp.jid.UserJid r4 = r2.A04
            r2 = 0
            r1 = 1
            java.lang.String[] r3 = X.C36441kJ.A1S()
            java.lang.String r0 = r7.getRawString()
            r9 = 0
            r3[r2] = r0
            java.lang.String r0 = r4.getRawString()
            r3[r1] = r0
            X.16r r0 = r5.A00
            X.1M0 r6 = r0.get()
            X.14e r2 = r6.A02     // Catch:{ all -> 0x1035 }
            java.lang.String r1 = "SELECT EXISTS ( SELECT 1 FROM group_membership_approval_requests WHERE group_jid = ? AND requester_jid = ?) AS request_exists"
            java.lang.String r0 = "GROUP_MEMBERSHIP_APPROVAL_REQUEST_EXISTS_SQL"
            android.database.Cursor r5 = r2.A09(r1, r0, r3)     // Catch:{ all -> 0x1035 }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x102e }
            if (r0 == 0) goto L_0x04ac
            java.lang.String r0 = "request_exists"
            long r3 = X.C36351kA.A07(r5, r0)     // Catch:{ all -> 0x102e }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x04ac
            r9 = 1
        L_0x04ac:
            r5.close()     // Catch:{ all -> 0x1035 }
            r6.close()
            if (r9 == 0) goto L_0x001b
            X.1PG r0 = r8.A01
            r0.A00(r7)
            return
        L_0x04ba:
            java.lang.Object r4 = r3.A00
            com.whatsapp.jid.GroupJid r4 = (com.whatsapp.jid.GroupJid) r4
            java.lang.Object r0 = r3.A01
            com.whatsapp.info.views.PhoneNumberPrivacyInfoView r0 = (com.whatsapp.info.views.PhoneNumberPrivacyInfoView) r0
            java.lang.Object r1 = r3.A02
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            if (r4 == 0) goto L_0x001b
            X.1YC r2 = r0.getPnhDailyActionLoggingStore$app_productinfra_chat_chat_non_modified()
            X.12q r0 = r0.getChatsCache$app_productinfra_chat_chat_non_modified()
            int r1 = r0.A05(r1)
            r0 = 3
            r2.A00(r4, r1, r0)
            return
        L_0x04d9:
            java.lang.Object r1 = r3.A00
            X.3Al r1 = (X.C61073Al) r1
            java.lang.Object r0 = r3.A01
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            java.lang.Object r3 = r3.A02
            X.2nH r3 = (X.C51102nH) r3
            r2 = 2
            X.AnonymousClass00C.A0D(r3, r2)
            X.16D r2 = r1.A01
            X.141 r4 = r2.A08(r0)
            if (r4 != 0) goto L_0x04f7
            java.lang.String r0 = "SurveyManager/validateContact contact is null"
        L_0x04f3:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x04f7:
            boolean r2 = r4.A0C()
            if (r2 != 0) goto L_0x0500
            java.lang.String r0 = "SurveyManager/validateContact contact is not business"
            goto L_0x04f3
        L_0x0500:
            X.3L0 r2 = r4.A0E
            if (r2 != 0) goto L_0x0507
            java.lang.String r0 = "SurveyManager/validateContact verifiedNameDetails is null"
            goto L_0x04f3
        L_0x0507:
            X.2aK r6 = r1.A06
            java.lang.Object r2 = r6.A01(r0)
            if (r2 == 0) goto L_0x0529
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "SurveyManager/registerConversionEvent already existing conversion with business="
            r2.append(r1)
            java.lang.String r0 = r0.getRawString()
            r2.append(r0)
            java.lang.String r0 = " skipping"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r2)
        L_0x0525:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0529:
            java.lang.String r14 = X.C36361kB.A0l()
            X.AnonymousClass00C.A08(r14)
            java.lang.String r15 = X.C36361kB.A0l()
            X.AnonymousClass00C.A08(r15)
            X.2nY r17 = X.C51272nY.ENTERPRISE
            r5 = 1
            X.3L0 r2 = r4.A0E
            if (r2 == 0) goto L_0x0546
            boolean r2 = r2.A02()
            if (r2 != r5) goto L_0x0546
            X.2nY r17 = X.C51272nY.SMB
        L_0x0546:
            r0.getRawString()
            long r20 = java.lang.System.currentTimeMillis()
            X.3Kg r12 = new X.3Kg
            r16 = r12
            r18 = r3
            r19 = r0
            r16.<init>(r17, r18, r19, r20)
            X.3Sp r4 = r1.A05
            r7 = 0
            X.2Qa r8 = new X.2Qa
            r8.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r8.A02 = r3
            int r2 = X.C65573Sp.A00(r12)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r8.A01 = r2
            r8.A04 = r14
            X.0yW r2 = r4.A01
            r2.Bly(r8)
            X.2RB r8 = new X.2RB
            r8.<init>()
            r8.A02 = r3
            int r3 = X.C65573Sp.A00(r12)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r8.A01 = r3
            com.whatsapp.jid.UserJid r13 = r12.A02
            java.lang.String r3 = r13.user
            java.lang.Long r3 = X.C36431kI.A15(r3)
            r8.A03 = r3
            r8.A04 = r15
            r2.Bly(r8)
            r6.A07(r12)
            X.2aL r3 = r1.A07
            java.lang.Object r6 = r3.A01(r0)
            if (r6 == 0) goto L_0x05cf
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "SurveyManager/createSurveySession already existing survey with business={"
            r3.append(r1)
            java.lang.String r0 = r0.getRawString()
            r3.append(r0)
            java.lang.String r0 = " skipping"
            X.C36321k7.A1a(r3, r0)
            java.lang.String r3 = "SurveyManager/createSurveySession survey already exists with business skipping"
        L_0x05b9:
            X.0yC r1 = r4.A00
            r0 = 4725(0x1275, float:6.621E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x001b
            X.2RB r0 = A00(r2, r12, r13, r14, r3)
            r0.A04 = r15
            r0.A05 = r3
            r2.Bly(r0)
            return
        L_0x05cf:
            java.util.ArrayList r6 = r3.A04()
            boolean r6 = X.C36411kG.A1a(r6)
            if (r6 == 0) goto L_0x05e1
            java.lang.String r0 = "SurveyManager/createSurveySession already existing surveys skipping"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r3 = "SurveyManager/createSurveySession survey already exists"
            goto L_0x05b9
        L_0x05e1:
            X.3DE r6 = r1.A03
            java.lang.String r10 = "force_pass_sampling_rate"
            r9 = 0
            X.0yC r11 = r6.A01
            r8 = 3982(0xf8e, float:5.58E-42)
            java.lang.String r11 = X.C36431kI.A19(r11, r8)
            org.json.JSONObject r8 = X.C36441kJ.A1C(r11)     // Catch:{ JSONException -> 0x05f8 }
            boolean r8 = r8.optBoolean(r10, r7)     // Catch:{ JSONException -> 0x05f8 }
            goto L_0x0677
        L_0x05f8:
            X.0wN r10 = r6.A00
            java.lang.String r8 = "WABISurveyFeatureConfigParse"
            r10.A0E(r8, r11, r7)
        L_0x05ff:
            X.1KK r8 = r1.A00
            X.9uZ r8 = r8.A07(r0)
            if (r8 != 0) goto L_0x06d8
            java.lang.StringBuilder r10 = X.AnonymousClass000.A0u()
            java.lang.String r11 = "SurveyManager/createSurveySession business profile null "
            r10.append(r11)
            java.lang.String r0 = r0.getRawString()
            X.C36321k7.A1Z(r10, r0)
        L_0x0617:
            java.lang.String r0 = "default_survey_sampling_rate"
            int r7 = r6.A00(r0, r7)
        L_0x061d:
            r6 = 100
            X.0XG r0 = X.AnonymousClass0XG.A01
            int r0 = r0.A03(r5, r6)
            r6 = 0
            if (r0 > r7) goto L_0x0629
            r6 = 1
        L_0x0629:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "SurveyManager/passesSurveySamplingRate business profile_null="
            r5.append(r0)
            if (r8 != 0) goto L_0x0635
            r9 = 1
        L_0x0635:
            r5.append(r9)
            java.lang.String r0 = " profile_sample_rate="
            r5.append(r0)
            if (r8 == 0) goto L_0x06d5
            java.lang.Integer r0 = r8.A09
        L_0x0641:
            r5.append(r0)
            java.lang.String r0 = " sample_rate="
            r5.append(r0)
            r5.append(r7)
            java.lang.String r0 = " eval_pass={"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r5 = X.AnonymousClass000.A0s(r5)
            r0 = 2
            X.AnonymousClass00C.A0D(r5, r0)
            X.0yC r4 = r4.A00
            r0 = 4725(0x1275, float:6.621E-42)
            boolean r0 = r4.A0E(r0)
            if (r0 == 0) goto L_0x0671
            X.2RB r0 = A00(r2, r12, r13, r14, r5)
            r0.A04 = r15
            r0.A05 = r5
            r2.Bly(r0)
        L_0x0671:
            if (r6 != 0) goto L_0x0690
            java.lang.String r0 = "SurveyManager/createSurveySession didn't pass survey sampling rate"
            goto L_0x0525
        L_0x0677:
            if (r8 == 0) goto L_0x05ff
            java.lang.String r5 = "SurveyManager/passesSurveySamplingRate force_pass_sampling_rate=true"
            X.0yC r4 = r4.A00
            r0 = 4725(0x1275, float:6.621E-42)
            boolean r0 = r4.A0E(r0)
            if (r0 == 0) goto L_0x0690
            X.2RB r0 = A00(r2, r12, r13, r14, r5)
            r0.A04 = r15
            r0.A05 = r5
            r2.Bly(r0)
        L_0x0690:
            long r16 = java.lang.System.currentTimeMillis()
            X.3Jt r11 = new X.3Jt
            r11.<init>(r12, r13, r14, r15, r16)
            r3.A07(r11)
            java.lang.String r3 = "SurveyManager/passesSurveySamplingRate before notifyObservers"
            r0 = 4725(0x1275, float:6.621E-42)
            boolean r0 = r4.A0E(r0)
            if (r0 == 0) goto L_0x06b1
            X.2RB r0 = A00(r2, r12, r13, r14, r3)
            r0.A04 = r15
            r0.A05 = r3
            r2.Bly(r0)
        L_0x06b1:
            X.2ZC r0 = r1.A04
            java.lang.Iterable r0 = X.C36421kH.A0X(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x06bb:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x001b
            java.lang.Object r0 = r1.next()
            X.31T r0 = (X.AnonymousClass31T) r0
            com.whatsapp.conversation.viewmodel.SurveyViewModel r0 = r0.A00
            X.00T r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            X.00r r0 = (X.C001600r) r0
            r0.A0C(r11)
            goto L_0x06bb
        L_0x06d5:
            r0 = 0
            goto L_0x0641
        L_0x06d8:
            java.lang.Integer r0 = r8.A09
            if (r0 == 0) goto L_0x0617
            int r7 = r0.intValue()
            goto L_0x061d
        L_0x06e2:
            java.lang.Object r2 = r3.A00
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r0 = r3.A01
            X.179 r0 = (X.AnonymousClass179) r0
            java.lang.Object r8 = r3.A02
            X.0yF r8 = (X.C20840yF) r8
            java.lang.String r1 = "Profile Pictures"
            java.io.File r7 = r0.A07(r1)
            java.io.File r0 = r2.getCacheDir()
            java.io.File r6 = X.C36441kJ.A0w(r0, r1)
            boolean r0 = r7.exists()
            if (r0 == 0) goto L_0x001b
            boolean r0 = r6.exists()
            if (r0 != 0) goto L_0x070b
            r6.mkdirs()
        L_0x070b:
            java.io.File[] r5 = r7.listFiles()
            if (r5 == 0) goto L_0x001b
            int r4 = r5.length
            r3 = 0
        L_0x0713:
            if (r3 >= r4) goto L_0x0742
            r2 = r5[r3]
            java.lang.String r1 = r2.getName()
            java.lang.String r0 = ".jpg"
            boolean r0 = r1.endsWith(r0)
            if (r0 == 0) goto L_0x073f
            java.io.File r1 = X.C36441kJ.A0w(r6, r1)
            r1.getAbsolutePath()
            r1.exists()
            r2.getAbsolutePath()
            r1.getAbsolutePath()
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x073c
            X.AnonymousClass6YY.A0O(r8, r2, r1)
        L_0x073c:
            r2.delete()
        L_0x073f:
            int r3 = r3 + 1
            goto L_0x0713
        L_0x0742:
            java.lang.String r0 = ".nomedia"
            java.io.File r0 = X.C36441kJ.A0w(r7, r0)
            r0.delete()
            boolean r0 = r7.delete()
            if (r0 != 0) goto L_0x001b
            java.lang.String r0 = "app-init/moveprofilephotos/rmdir/failed"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0757:
            java.lang.Object r1 = r3.A00
            X.3Qh r1 = (X.C64993Qh) r1
            java.lang.Object r4 = r3.A01
            X.3T1 r4 = (X.AnonymousClass3T1) r4
            java.lang.Object r0 = r3.A02
            X.3P8 r0 = (X.AnonymousClass3P8) r0
            X.1JN r2 = r1.A06
            int r1 = r0.A05
            r0 = 3
            goto L_0x0797
        L_0x0769:
            java.lang.Object r1 = r3.A00
            X.2IR r1 = (X.AnonymousClass2IR) r1
            java.lang.Object r4 = r3.A01
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r2 = r3.A02
            android.content.Intent r2 = (android.content.Intent) r2
            X.1Sr r0 = r1.A1i
            r0.A00()
            X.1Dv r1 = r1.A0P
            java.lang.String r0 = "ConversationRow"
            r1.A08(r4, r2, r0)
            return
        L_0x0782:
            java.lang.Object r1 = r3.A00
            X.2IR r1 = (X.AnonymousClass2IR) r1
            java.lang.Object r4 = r3.A01
            X.3T1 r4 = (X.AnonymousClass3T1) r4
            java.lang.Object r0 = r3.A02
            X.3P8 r0 = (X.AnonymousClass3P8) r0
            X.1JN r2 = r1.A1d
            int r1 = r0.A05
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            r0 = 4
        L_0x0797:
            X.AnonymousClass1JN.A00(r2, r4, r0, r1)
            return
        L_0x079b:
            java.lang.Object r2 = r3.A00
            X.2I4 r2 = (X.AnonymousClass2I4) r2
            java.lang.Object r1 = r3.A01
            X.2bI r1 = (X.AnonymousClass2bI) r1
            java.lang.Object r0 = r3.A02
            X.147 r0 = (X.AnonymousClass147) r0
            r2.A2E(r0, r1)
            return
        L_0x07ab:
            java.lang.Object r2 = r3.A00
            X.2IR r2 = (X.AnonymousClass2IR) r2
            java.lang.Object r0 = r3.A01
            java.lang.Object r1 = r3.A02
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            if (r0 != 0) goto L_0x07c1
            X.17Y r2 = r2.A0R
            r1 = 2131890392(0x7f1210d8, float:1.9415475E38)
            r0 = 0
            r2.A06(r1, r0)
            return
        L_0x07c1:
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            r4.add(r0)
            X.0v5 r0 = r2.A0M
            r0.A02()
            r2.getContext()
            X.3Qa r0 = r1.A1J
            X.11F r3 = r0.A00
            boolean r1 = X.AnonymousClass143.A0G(r3)
            if (r1 == 0) goto L_0x07f4
            X.2pZ r2 = X.C52522pZ.A0P
        L_0x07dc:
            if (r1 == 0) goto L_0x07ec
            r1 = 26
        L_0x07e0:
            X.8UO r0 = new X.8UO
            r0.<init>(r2, r4, r1)
            java.lang.String r0 = "launchAdsCreationExperience"
            java.lang.NullPointerException r1 = X.AnonymousClass001.A0A(r0)
            throw r1
        L_0x07ec:
            boolean r0 = r3 instanceof X.C177538dx
            r1 = -1
            if (r0 == 0) goto L_0x07e0
            r1 = 27
            goto L_0x07e0
        L_0x07f4:
            boolean r0 = r3 instanceof X.C177538dx
            if (r0 == 0) goto L_0x07fb
            X.2pZ r2 = X.C52522pZ.A0O
            goto L_0x07dc
        L_0x07fb:
            X.2pZ r2 = X.C52522pZ.A0j
            goto L_0x07dc
        L_0x07fe:
            java.lang.Object r2 = r3.A00
            X.8Z0 r2 = (X.AnonymousClass8Z0) r2
            java.lang.Object r1 = r3.A01
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r0 = r3.A02
            X.6Tg r0 = (X.C132366Tg) r0
            X.AnonymousClass8Z0.setupShareToMyStatusButton$lambda$10$lambda$9$lambda$8(r2, r1, r0)
            return
        L_0x080e:
            java.lang.Object r2 = r3.A00
            X.8Yw r2 = (X.C174898Yw) r2
            java.lang.Object r1 = r3.A01
            X.2bJ r1 = (X.AnonymousClass2bJ) r1
            java.lang.Object r0 = r3.A02
            X.147 r0 = (X.AnonymousClass147) r0
            r2.A2F(r0, r1)
            return
        L_0x081e:
            java.lang.Object r5 = r3.A00
            com.whatsapp.conversation.conversationrow.MediaTimeDisplay r5 = (com.whatsapp.conversation.conversationrow.MediaTimeDisplay) r5
            java.lang.Object r4 = r3.A01
            X.00r r4 = (X.C001600r) r4
            java.lang.Object r3 = r3.A02
            X.00r r3 = (X.C001600r) r3
            r0 = 0
            r5.A01 = r0
            r5.A05 = r0
            X.394 r2 = r5.A02
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x083f
            r0 = 0
            r2.A01 = r0
            android.os.Handler r1 = r2.A03
            java.lang.Runnable r0 = r2.A00
            r1.removeCallbacks(r0)
        L_0x083f:
            X.04S r0 = r5.A09
            r4.A0B(r0)
            X.04S r0 = r5.A0A
            r3.A0B(r0)
            return
        L_0x084a:
            java.lang.Object r4 = r3.A00
            X.2IU r4 = (X.AnonymousClass2IU) r4
            java.lang.Object r5 = r3.A01
            X.11F r5 = (X.AnonymousClass11F) r5
            java.lang.Object r3 = r3.A02
            X.3fI r0 = r4.A00
            X.16D r0 = r0.A0C
            X.141 r6 = r0.A0D(r5)
            X.17Y r0 = r4.A05
            r7 = 33
            X.74x r2 = new X.74x
            r2.<init>((java.lang.Object) r3, (java.lang.Object) r4, (java.lang.Object) r5, (java.lang.Object) r6, (int) r7)
            r0.A0H(r2)
            return
        L_0x0869:
            java.lang.Object r1 = r3.A00
            X.2mk r1 = (X.C50852mk) r1
            java.lang.Object r4 = r3.A01
            X.2bI r4 = (X.AnonymousClass2bI) r4
            java.lang.Object r3 = r3.A02
            X.147 r3 = (X.AnonymousClass147) r3
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.1Sk r2 = r1.getCommunityWamEventHelper()
            X.1Sm r0 = r1.getCommunityMembersManager()
            goto L_0x08cc
        L_0x0882:
            java.lang.Object r1 = r3.A00
            X.2mn r1 = (X.C50882mn) r1
            java.lang.Object r4 = r3.A01
            X.2bI r4 = (X.AnonymousClass2bI) r4
            java.lang.Object r3 = r3.A02
            X.147 r3 = (X.AnonymousClass147) r3
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.1Sk r2 = r1.getCommunityWamEventHelper()
            X.1Sm r0 = r1.getCommunityMembersManager()
            goto L_0x08cc
        L_0x089b:
            java.lang.Object r1 = r3.A00
            X.2ml r1 = (X.C50862ml) r1
            java.lang.Object r4 = r3.A01
            X.2bI r4 = (X.AnonymousClass2bI) r4
            java.lang.Object r3 = r3.A02
            X.147 r3 = (X.AnonymousClass147) r3
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.1Sk r2 = r1.getCommunityWamEventHelper()
            X.1Sm r0 = r1.getCommunityMembersManager()
            goto L_0x08cc
        L_0x08b4:
            java.lang.Object r1 = r3.A00
            X.2mm r1 = (X.C50872mm) r1
            java.lang.Object r4 = r3.A01
            X.2bI r4 = (X.AnonymousClass2bI) r4
            java.lang.Object r3 = r3.A02
            X.147 r3 = (X.AnonymousClass147) r3
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.1Sk r2 = r1.getCommunityWamEventHelper()
            X.1Sm r0 = r1.getCommunityMembersManager()
        L_0x08cc:
            int r0 = r0.BEP(r3)
            r2.A07(r4, r0)
            return
        L_0x08d4:
            java.lang.Object r2 = r3.A00
            X.4V7 r2 = (X.AnonymousClass4V7) r2
            java.lang.Object r1 = r3.A01
            X.9ts r1 = (X.C206729ts) r1
            java.lang.Object r0 = r3.A02
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            r2.Bpw(r0, r1)
            return
        L_0x08e4:
            java.lang.Object r0 = r3.A00
            X.2KB r0 = (X.AnonymousClass2KB) r0
            java.lang.Object r4 = r3.A01
            X.3T1 r4 = (X.AnonymousClass3T1) r4
            java.lang.Object r2 = r3.A02
            java.lang.Integer r2 = (java.lang.Integer) r2
            r1 = 0
            X.9Qz r0 = r0.A05
            r0.A00(r4, r2, r1)
            return
        L_0x08f7:
            java.lang.Object r0 = r3.A00
            X.3fk r0 = (X.C70803fk) r0
            java.lang.Object r4 = r3.A01
            X.2bT r4 = (X.AnonymousClass2bT) r4
            java.lang.Object r2 = r3.A02
            X.01z r2 = (X.AnonymousClass01z) r2
            r0.A2K(r4)
            r1 = 0
            X.2nZ r0 = X.C51282nZ.NONE
            com.whatsapp.events.EventInfoBottomSheet r1 = X.C54242sd.A00(r4, r1, r0)
            java.lang.String r0 = "EVENT_INFO_BOTTOM_SHEET"
            X.C36381kD.A1F(r1, r2, r0)
            return
        L_0x0913:
            java.lang.Object r0 = r3.A00
            X.1uB r0 = (X.C39901uB) r0
            java.lang.Object r4 = r3.A01
            X.6c4 r4 = (X.C135066c4) r4
            java.lang.Object r2 = r3.A02
            X.11F r2 = (X.AnonymousClass11F) r2
            X.1X4 r1 = r0.A03
            java.lang.Integer r5 = X.C36391kE.A0r()
            r3 = 0
            r6 = 0
            r1.A0L(r2, r3, r4, r5, r6)
            return
        L_0x092b:
            java.lang.Object r15 = r3.A00
            com.whatsapp.crop.CropImage r15 = (com.whatsapp.crop.CropImage) r15
            java.lang.Object r1 = r3.A01
            android.content.Intent r1 = (android.content.Intent) r1
            java.lang.Object r8 = r3.A02
            android.graphics.Point r8 = (android.graphics.Point) r8
            java.lang.String r5 = "x"
            android.net.Uri r3 = r1.getData()
            X.0yb r0 = r15.A0I     // Catch:{ IOException -> 0x0b7a }
            X.0ya r0 = r0.A0O()     // Catch:{ IOException -> 0x0b7a }
            int r0 = X.AnonymousClass1GW.A00(r3, r0)     // Catch:{ IOException -> 0x0b7a }
            r15.A02 = r0     // Catch:{ IOException -> 0x0b7a }
            android.graphics.Matrix r4 = X.AnonymousClass1GW.A09(r0)     // Catch:{ IOException -> 0x0b7a }
            r15.A0D = r4     // Catch:{ IOException -> 0x0b7a }
            boolean r0 = r15.A0V     // Catch:{ IOException -> 0x0b7a }
            if (r0 == 0) goto L_0x0964
            int r2 = r15.A02     // Catch:{ IOException -> 0x0b7a }
            r0 = 6
            if (r2 == r0) goto L_0x095c
            r0 = 8
            if (r2 != r0) goto L_0x0964
        L_0x095c:
            int r2 = r15.A00     // Catch:{ IOException -> 0x0b7a }
            int r0 = r15.A01     // Catch:{ IOException -> 0x0b7a }
            r15.A00 = r0     // Catch:{ IOException -> 0x0b7a }
            r15.A01 = r2     // Catch:{ IOException -> 0x0b7a }
        L_0x0964:
            if (r4 != 0) goto L_0x096d
            android.graphics.Matrix r0 = new android.graphics.Matrix     // Catch:{ IOException -> 0x0b7a }
            r0.<init>()     // Catch:{ IOException -> 0x0b7a }
            r15.A0D = r0     // Catch:{ IOException -> 0x0b7a }
        L_0x096d:
            android.graphics.BitmapFactory$Options r9 = new android.graphics.BitmapFactory$Options     // Catch:{ IOException -> 0x0b7a }
            r9.<init>()     // Catch:{ IOException -> 0x0b7a }
            X.1GX r0 = r15.A0Q     // Catch:{ IOException -> 0x0b7a }
            r4 = 1
            java.io.InputStream r2 = X.AnonymousClass1GX.A0V(r3, r0, r4)     // Catch:{ IOException -> 0x0b7a }
            r6 = 1
            r9.inJustDecodeBounds = r4     // Catch:{ all -> 0x0b70 }
            r0 = 0
            android.graphics.BitmapFactory.decodeStream(r2, r0, r9)     // Catch:{ all -> 0x0b70 }
            int r0 = r9.outWidth     // Catch:{ all -> 0x0b70 }
            java.lang.String r7 = "cropimage/not-a-image"
            if (r0 <= 0) goto L_0x0b62
            int r0 = r9.outHeight     // Catch:{ all -> 0x0b70 }
            if (r0 <= 0) goto L_0x0b62
            r2.close()     // Catch:{ IOException -> 0x0b7a }
            X.1GX r0 = r15.A0Q     // Catch:{ OutOfMemoryError -> 0x0b54 }
            java.io.InputStream r3 = X.AnonymousClass1GX.A0V(r3, r0, r4)     // Catch:{ OutOfMemoryError -> 0x0b54 }
            r9.inDither = r4     // Catch:{ all -> 0x0b4a }
            r13 = 0
            r9.inScaled = r13     // Catch:{ all -> 0x0b4a }
            int r11 = r8.x     // Catch:{ all -> 0x0b4a }
            int r12 = r8.y     // Catch:{ all -> 0x0b4a }
            X.0yC r2 = r15.A01     // Catch:{ all -> 0x0b4a }
            android.view.WindowManager r0 = r15.getWindowManager()     // Catch:{ all -> 0x0b4a }
            java.lang.Long r10 = X.C55792vC.A00(r0, r2)     // Catch:{ all -> 0x0b4a }
            X.6Kx r8 = new X.6Kx     // Catch:{ all -> 0x0b4a }
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0b4a }
            X.5sn r0 = X.AnonymousClass6Y8.A0A(r8, r3)     // Catch:{ all -> 0x0b4a }
            android.graphics.Bitmap r0 = r0.A02     // Catch:{ all -> 0x0b4a }
            r15.A0B = r0     // Catch:{ all -> 0x0b4a }
            int r4 = r9.inSampleSize     // Catch:{ all -> 0x0b4a }
            r15.A09 = r4     // Catch:{ all -> 0x0b4a }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0b4a }
            java.lang.String r0 = "crop/oncreate/bitmap orientation:"
            r2.append(r0)     // Catch:{ all -> 0x0b4a }
            int r0 = r15.A02     // Catch:{ all -> 0x0b4a }
            r2.append(r0)     // Catch:{ all -> 0x0b4a }
            X.C36421kH.A1N(r2)     // Catch:{ all -> 0x0b4a }
            int r0 = r9.outWidth     // Catch:{ all -> 0x0b4a }
            r2.append(r0)     // Catch:{ all -> 0x0b4a }
            r2.append(r5)     // Catch:{ all -> 0x0b4a }
            int r0 = r9.outHeight     // Catch:{ all -> 0x0b4a }
            r2.append(r0)     // Catch:{ all -> 0x0b4a }
            java.lang.String r0 = " sample:"
            X.C36321k7.A1T(r0, r2, r4)     // Catch:{ all -> 0x0b4a }
            android.graphics.Rect r4 = r15.A0E     // Catch:{ all -> 0x0b4a }
            if (r4 == 0) goto L_0x09f4
            int r0 = r4.left     // Catch:{ all -> 0x0b4a }
            int r2 = r15.A09     // Catch:{ all -> 0x0b4a }
            int r0 = r0 / r2
            r4.left = r0     // Catch:{ all -> 0x0b4a }
            int r0 = r4.top     // Catch:{ all -> 0x0b4a }
            int r0 = r0 / r2
            r4.top = r0     // Catch:{ all -> 0x0b4a }
            int r0 = r4.right     // Catch:{ all -> 0x0b4a }
            int r0 = r0 / r2
            r4.right = r0     // Catch:{ all -> 0x0b4a }
            int r0 = r4.bottom     // Catch:{ all -> 0x0b4a }
            int r0 = r0 / r2
            r4.bottom = r0     // Catch:{ all -> 0x0b4a }
        L_0x09f4:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0b4a }
            java.lang.String r0 = "crop/oncreate/bitmap:"
            r4.append(r0)     // Catch:{ all -> 0x0b4a }
            android.graphics.Bitmap r0 = r15.A0B     // Catch:{ all -> 0x0b4a }
            if (r0 != 0) goto L_0x0a07
            java.lang.String r0 = "null"
        L_0x0a03:
            X.C36321k7.A1a(r4, r0)     // Catch:{ all -> 0x0b4a }
            goto L_0x0a20
        L_0x0a07:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0b4a }
            int r0 = r0.getWidth()     // Catch:{ all -> 0x0b4a }
            r2.append(r0)     // Catch:{ all -> 0x0b4a }
            r2.append(r5)     // Catch:{ all -> 0x0b4a }
            android.graphics.Bitmap r0 = r15.A0B     // Catch:{ all -> 0x0b4a }
            int r0 = r0.getHeight()     // Catch:{ all -> 0x0b4a }
            java.lang.String r0 = X.C36381kD.A10(r2, r0)     // Catch:{ all -> 0x0b4a }
            goto L_0x0a03
        L_0x0a20:
            r3.close()     // Catch:{ OutOfMemoryError -> 0x0b54 }
            android.graphics.Bitmap r0 = r15.A0B
            if (r0 == 0) goto L_0x0b3d
            int r0 = r0.getWidth()
            if (r0 == 0) goto L_0x0b3d
            android.graphics.Bitmap r0 = r15.A0B
            int r0 = r0.getHeight()
            if (r0 == 0) goto L_0x0b3d
            java.lang.String r0 = "rotation"
            int r7 = r1.getIntExtra(r0, r13)
            java.lang.String r0 = "flipH"
            boolean r5 = r1.getBooleanExtra(r0, r13)
            java.lang.String r0 = "flipV"
            boolean r4 = r1.getBooleanExtra(r0, r13)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "crop/oncreate/bitmap add-rotation:"
            r2.append(r0)
            r2.append(r7)
            java.lang.String r0 = " flip-h:"
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = " flip-v:"
            X.C36321k7.A1X(r0, r2, r4)
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r15.A0C = r0
            r3 = 9
            if (r5 == 0) goto L_0x0a7d
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>()
            float[] r0 = new float[r3]
            r0 = {-1082130432, 0, 0, 0, 1065353216, 0, 0, 0, 1065353216} // fill-array
            r2.setValues(r0)
            android.graphics.Matrix r0 = r15.A0C
            r0.postConcat(r2)
        L_0x0a7d:
            if (r4 == 0) goto L_0x0a91
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>()
            float[] r0 = new float[r3]
            r0 = {1065353216, 0, 0, 0, -1082130432, 0, 0, 0, 1065353216} // fill-array
            r2.setValues(r0)
            android.graphics.Matrix r0 = r15.A0C
            r0.postConcat(r2)
        L_0x0a91:
            if (r7 == 0) goto L_0x0a99
            android.graphics.Matrix r2 = r15.A0C
            float r0 = (float) r7
            r2.postRotate(r0)
        L_0x0a99:
            android.graphics.Matrix r2 = r15.A0C
            int r0 = r15.A08
            float r0 = (float) r0
            r2.postRotate(r0)
            android.graphics.Bitmap r0 = r15.A0B
            X.3PL r3 = new X.3PL
            r3.<init>(r0)
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>()
            android.graphics.Matrix r0 = r15.A0D
            r2.set(r0)
            android.graphics.Matrix r0 = r15.A0C
            r2.postConcat(r0)
            r3.A01 = r2
            java.lang.String r0 = "filter"
            int r7 = r1.getIntExtra(r0, r13)
            if (r7 == 0) goto L_0x0acd
            android.graphics.Bitmap r2 = r15.A0B
            X.54s r0 = r15.A0N
            android.graphics.Bitmap r0 = com.whatsapp.filter.FilterUtils.A00(r2, r0, r7, r13)
            r15.A0B = r0
            r3.A00 = r0
        L_0x0acd:
            java.lang.String r0 = "doodle"
            java.lang.String r19 = r1.getStringExtra(r0)
            if (r19 == 0) goto L_0x0b27
            X.1H2 r2 = r15.A0O
            X.0ts r1 = r15.A00
            X.1HA r0 = r15.A0P
            X.6Nc r14 = X.AnonymousClass6VQ.A05
            r16 = r1
            r17 = r2
            r18 = r0
            X.6VQ r8 = r14.A02(r15, r16, r17, r18, r19)
            if (r8 == 0) goto L_0x0b27
            android.graphics.Bitmap r0 = r15.A0B
            boolean r0 = r0.isMutable()
            if (r0 != 0) goto L_0x0afd
            android.graphics.Bitmap r1 = r15.A0B
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = r1.copy(r0, r6)
            r15.A0B = r0
            r3.A00 = r0
        L_0x0afd:
            android.graphics.Bitmap r7 = r15.A0B
            int r9 = r8.A00
            android.graphics.Matrix r1 = r3.A01
            r11 = 0
            if (r1 == 0) goto L_0x0b1e
            r0 = 2
            float[] r10 = new float[r0]
            r10 = {0, 1065353216} // fill-array
            r1.mapVectors(r10)
            r2 = r10[r13]
            r1 = 0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0b34
            r0 = r10[r6]
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0b1e
            r11 = 180(0xb4, float:2.52E-43)
        L_0x0b1e:
            int r9 = r9 + r11
            int r0 = r15.A08
            int r9 = r9 + r0
            int r0 = r9 % 360
            r8.A05(r7, r0, r5, r4)
        L_0x0b27:
            X.17Y r2 = r15.A0G
            r0 = 10
            X.3wc r1 = new X.3wc
            r1.<init>(r15, r3, r0)
        L_0x0b30:
            r2.A0H(r1)
            return
        L_0x0b34:
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            r11 = 270(0x10e, float:3.78E-43)
            if (r0 <= 0) goto L_0x0b1e
            r11 = 90
            goto L_0x0b1e
        L_0x0b3d:
            com.whatsapp.util.Log.e((java.lang.String) r7)
            X.17Y r2 = r15.A0G
            r0 = 19
            X.3wU r1 = new X.3wU
            r1.<init>((java.lang.Object) r15, (int) r0)
            goto L_0x0b30
        L_0x0b4a:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0b4f }
            goto L_0x0b53
        L_0x0b4f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ OutOfMemoryError -> 0x0b54 }
        L_0x0b53:
            throw r1     // Catch:{ OutOfMemoryError -> 0x0b54 }
        L_0x0b54:
            r1 = move-exception
            java.lang.String r0 = "cropimage/oom"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x0b7a }
            X.17Y r1 = r15.A0G     // Catch:{ IOException -> 0x0b7a }
            r0 = 18
            X.C81113wU.A00(r1, r15, r0)     // Catch:{ IOException -> 0x0b7a }
            return
        L_0x0b62:
            com.whatsapp.util.Log.e((java.lang.String) r7)     // Catch:{ all -> 0x0b70 }
            X.17Y r1 = r15.A0G     // Catch:{ all -> 0x0b70 }
            r0 = 17
            X.C81113wU.A00(r1, r15, r0)     // Catch:{ all -> 0x0b70 }
            r2.close()     // Catch:{ IOException -> 0x0b7a }
            return
        L_0x0b70:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0b75 }
            goto L_0x0b79
        L_0x0b75:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0b7a }
        L_0x0b79:
            throw r1     // Catch:{ IOException -> 0x0b7a }
        L_0x0b7a:
            r2 = move-exception
            X.17Y r1 = r15.A0G
            r0 = 11
            X.C81193wc.A00(r1, r15, r2, r0)
            return
        L_0x0b83:
            java.lang.Object r0 = r3.A00
            X.3uI r0 = (X.C79793uI) r0
            java.lang.Object r2 = r3.A01
            X.9TX r2 = (X.AnonymousClass9TX) r2
            java.lang.Object r1 = r3.A02
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            if (r2 != 0) goto L_0x0b92
            r2 = 0
        L_0x0b92:
            X.005 r0 = r0.A01
            java.lang.Object r0 = r0.get()
            X.16R r0 = (X.AnonymousClass16R) r0
            r0.A01(r2, r1)
            return
        L_0x0b9e:
            java.lang.Object r4 = r3.A00
            X.1Oq r4 = (X.C27551Oq) r4
            java.lang.Object r2 = r3.A01
            X.147 r2 = (X.AnonymousClass147) r2
            java.lang.Object r1 = r3.A02
            java.util.List r1 = (java.util.List) r1
            r0 = 2
            X.AnonymousClass00C.A0D(r1, r0)
            X.1Nq r0 = r4.A00
            r0.A00(r2)
            r0.A02(r1)
            return
        L_0x0bb7:
            java.lang.Object r0 = r3.A00
            X.3hc r0 = (X.C71963hc) r0
            java.lang.Object r2 = r3.A01
            X.3Iw r2 = (X.C63133Iw) r2
            java.lang.Object r6 = r3.A02
            X.19g r5 = r0.A01
            java.lang.Object r4 = r5.A0N
            monitor-enter(r4)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0cab }
            java.lang.String r0 = "companion-device-manager/critical sync successful. DeviceJid: "
            r1.append(r0)     // Catch:{ all -> 0x0cab }
            X.3SB r9 = r2.A02     // Catch:{ all -> 0x0cab }
            com.whatsapp.jid.DeviceJid r8 = r9.A07     // Catch:{ all -> 0x0cab }
            X.C36321k7.A1N(r8, r1)     // Catch:{ all -> 0x0cab }
            java.util.Iterator r1 = X.C36361kB.A0s(r5)     // Catch:{ all -> 0x0cab }
        L_0x0bda:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0cab }
            if (r0 == 0) goto L_0x0bea
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0cab }
            X.192 r0 = (X.AnonymousClass192) r0     // Catch:{ all -> 0x0cab }
            r0.BVW(r2)     // Catch:{ all -> 0x0cab }
            goto L_0x0bda
        L_0x0bea:
            X.19m r2 = r5.A08     // Catch:{ all -> 0x0cab }
            r1 = 2
            java.lang.String r0 = "CompanionDevice"
            android.location.Location r3 = r2.A03(r0, r1)     // Catch:{ all -> 0x0cab }
            if (r3 == 0) goto L_0x0c2c
            long r10 = r3.getTime()     // Catch:{ all -> 0x0cab }
            r0 = 120000(0x1d4c0, double:5.9288E-319)
            long r10 = r10 + r0
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0cab }
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0c2c
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0cab }
            java.lang.String r0 = "CompanionDevice/location/last "
            r2.append(r0)     // Catch:{ all -> 0x0cab }
            long r0 = r3.getTime()     // Catch:{ all -> 0x0cab }
            X.C36351kA.A1S(r2, r0)     // Catch:{ all -> 0x0cab }
            X.C236419g.A02(r3, r9, r5)     // Catch:{ all -> 0x0cab }
        L_0x0c18:
            X.0v0 r7 = r5.A0E     // Catch:{ all -> 0x0cab }
            java.lang.String r3 = r8.getRawString()     // Catch:{ all -> 0x0cab }
            X.C18740tg.A06(r3)     // Catch:{ all -> 0x0cab }
            android.content.SharedPreferences r0 = X.C36341k9.A0E(r7)     // Catch:{ all -> 0x0cab }
            java.lang.String r2 = "companion_device_verification_ids"
            java.lang.String r0 = X.C36371kC.A0t(r0, r2)     // Catch:{ all -> 0x0cab }
            goto L_0x0c4b
        L_0x0c2c:
            X.3WN r7 = new X.3WN     // Catch:{ all -> 0x0cab }
            r7.<init>(r9, r5)     // Catch:{ all -> 0x0cab }
            android.os.Handler r3 = r5.A04     // Catch:{ all -> 0x0cab }
            r1 = 39
            X.1j7 r0 = new X.1j7     // Catch:{ all -> 0x0cab }
            r0.<init>(r5, r7, r1)     // Catch:{ all -> 0x0cab }
            r3.post(r0)     // Catch:{ all -> 0x0cab }
            r0 = 40
            X.1j7 r2 = new X.1j7     // Catch:{ all -> 0x0cab }
            r2.<init>(r5, r7, r0)     // Catch:{ all -> 0x0cab }
            r0 = 60000(0xea60, double:2.9644E-319)
            r3.postDelayed(r2, r0)     // Catch:{ all -> 0x0cab }
            goto L_0x0c18
        L_0x0c4b:
            if (r0 == 0) goto L_0x0c57
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r0)     // Catch:{ all -> 0x0cab }
            java.lang.String r0 = ","
            java.lang.String r3 = X.AnonymousClass000.A0p(r0, r3, r1)     // Catch:{ all -> 0x0cab }
        L_0x0c57:
            r7.A1m(r2, r3)     // Catch:{ all -> 0x0cab }
            X.0wG r0 = r5.A0D     // Catch:{ all -> 0x0cab }
            android.content.Context r8 = r0.A00     // Catch:{ all -> 0x0cab }
            java.lang.Class<com.whatsapp.companiondevice.CompanionDeviceVerificationReceiver> r9 = com.whatsapp.companiondevice.CompanionDeviceVerificationReceiver.class
            android.content.Intent r1 = X.C36441kJ.A0H(r8, r9)     // Catch:{ all -> 0x0cab }
            r7 = 0
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            android.app.PendingIntent r0 = X.C65743Th.A01(r8, r7, r1, r0)     // Catch:{ all -> 0x0cab }
            if (r0 != 0) goto L_0x0c9f
            r10 = 3600000(0x36ee80, double:1.7786363E-317)
            java.util.Random r0 = new java.util.Random     // Catch:{ all -> 0x0cab }
            r0.<init>()     // Catch:{ all -> 0x0cab }
            double r2 = r0.nextDouble()     // Catch:{ all -> 0x0cab }
            r0 = 4712059816451768320(0x4164997000000000, double:1.08E7)
            double r2 = r2 * r0
            long r0 = (long) r2     // Catch:{ all -> 0x0cab }
            long r0 = r0 + r10
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0cab }
            long r2 = r2 + r0
            android.content.Intent r1 = X.C36441kJ.A0H(r8, r9)     // Catch:{ all -> 0x0cab }
            r0 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r1 = X.C65743Th.A01(r8, r7, r1, r0)     // Catch:{ all -> 0x0cab }
            X.19h r0 = r5.A0B     // Catch:{ all -> 0x0cab }
            X.19i r0 = r0.A00     // Catch:{ all -> 0x0cab }
            boolean r0 = r0.A01(r1, r7, r2)     // Catch:{ all -> 0x0cab }
            if (r0 != 0) goto L_0x0c9f
            java.lang.String r0 = "CompanionDevice/scheduleCompanionDeviceVerificationAlarm AlarmManager is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0cab }
        L_0x0c9f:
            r0 = 0
            r5.A00 = r0     // Catch:{ all -> 0x0cab }
            X.19o r0 = r5.A0H     // Catch:{ all -> 0x0cab }
            X.19q r0 = r0.A04     // Catch:{ all -> 0x0cab }
            r0.unregisterObserver(r6)     // Catch:{ all -> 0x0cab }
            monitor-exit(r4)     // Catch:{ all -> 0x0cab }
            return
        L_0x0cab:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0cab }
            throw r1
        L_0x0cae:
            java.lang.Object r0 = r3.A00
            X.3WN r0 = (X.AnonymousClass3WN) r0
            java.lang.Object r2 = r3.A01
            X.3SB r2 = (X.AnonymousClass3SB) r2
            java.lang.Object r1 = r3.A02
            android.location.Location r1 = (android.location.Location) r1
            X.19g r0 = r0.A01
            X.C236419g.A02(r1, r2, r0)
            return
        L_0x0cc0:
            java.lang.Object r0 = r3.A00
            com.whatsapp.deeplink.DeepLinkActivity r0 = (com.whatsapp.deeplink.DeepLinkActivity) r0
            java.lang.Object r2 = r3.A01
            X.11F r2 = (X.AnonymousClass11F) r2
            java.lang.Object r1 = r3.A02
            X.11F r1 = (X.AnonymousClass11F) r1
            X.12O r0 = r0.A0d
            X.13w r2 = (X.C223313w) r2
            com.whatsapp.jid.PhoneUserJid r1 = (com.whatsapp.jid.PhoneUserJid) r1
            r0.A0H(r2, r1)
            return
        L_0x0cd6:
            java.lang.Object r5 = r3.A00
            com.whatsapp.email.VerifyEmailActivity r5 = (com.whatsapp.email.VerifyEmailActivity) r5
            java.lang.Object r4 = r3.A01
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r6 = r3.A02
            java.lang.Long r6 = (java.lang.Long) r6
            X.9Pi r7 = r5.A05
            if (r7 == 0) goto L_0x0d10
            java.lang.String r8 = r5.A0A
            int r10 = r5.A00
            java.lang.String r9 = java.lang.String.valueOf(r4)
            r11 = 8
            r12 = 2
            r13 = 2
            r7.A00(r8, r9, r10, r11, r12, r13)
            X.AnonymousClass3SJ.A00(r5, r12)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = X.C36371kC.A0A(r6)
            long r2 = r2.toMillis(r0)
            long r0 = X.C36431kI.A08(r5)
            long r2 = r2 + r0
            r5.A01 = r2
            com.whatsapp.email.VerifyEmailActivity.A0G(r5, r6)
            com.whatsapp.email.VerifyEmailActivity.A0F(r5, r4, r6)
            return
        L_0x0d10:
            java.lang.String r0 = "emailVerificationLogger"
            java.lang.RuntimeException r1 = X.C36331k8.A0d(r0)
            throw r1
        L_0x0d17:
            java.lang.Object r5 = r3.A00
            X.3lT r5 = (X.C74353lT) r5
            java.lang.Object r2 = r3.A01
            X.14a r2 = (X.C223714a) r2
            java.lang.Object r4 = r3.A02
            android.content.Context r4 = (android.content.Context) r4
            r0 = 1
            X.AnonymousClass00C.A0D(r2, r0)
            X.005 r0 = r5.A07
            java.lang.Object r3 = X.C36411kG.A0v(r0)
            X.00b r3 = (X.C000100b) r3
            X.14Y r1 = r2.A01
            android.content.Context r6 = r2.A00
            X.005 r0 = r1.A08
            java.lang.Object r11 = r0.get()
            X.12u r11 = (X.C220812u) r11
            X.005 r0 = r1.A07
            java.lang.Object r9 = r0.get()
            X.0wt r9 = (X.C20020wt) r9
            X.005 r0 = r1.A09
            java.lang.Object r10 = r0.get()
            X.0wU r10 = (X.C19770wU) r10
            X.005 r0 = r1.A06
            java.lang.Object r7 = r0.get()
            X.0ww r7 = (X.C20050ww) r7
            X.005 r0 = r1.A05
            java.lang.Object r8 = r0.get()
            X.0yd r8 = (X.C21080yd) r8
            monitor-enter(r11)
            X.C220812u.A00(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0d71 }
            X.13F r0 = r11.A09     // Catch:{ all -> 0x0d71 }
            com.facebook.msys.mci.NetworkSession r2 = r0.A00()     // Catch:{ all -> 0x0d71 }
            monitor-exit(r11)
            X.AnonymousClass00C.A08(r2)
            X.0yC r1 = r5.A04
            X.0v0 r0 = r5.A03
            X.C54302sj.A00(r4, r2, r0, r1, r3)
            return
        L_0x0d71:
            r1 = move-exception
            monitor-exit(r11)
            throw r1
        L_0x0d74:
            java.lang.Object r0 = r3.A00
            X.4a5 r0 = (X.C90394a5) r0
            java.lang.Object r4 = r3.A01
            X.11F r4 = (X.AnonymousClass11F) r4
            java.lang.Object r2 = r3.A02
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.Object r1 = r0.A00
            com.whatsapp.gallery.MediaGalleryFragment r1 = (com.whatsapp.gallery.MediaGalleryFragment) r1
            X.4Uo r0 = r1.A0G
            X.3mH r0 = (X.C74853mH) r0
            com.whatsapp.gallery.MediaGalleryFragment.A00(r1, r0, r4, r2)
            return
        L_0x0d8c:
            java.lang.Object r2 = r3.A00
            X.4U2 r2 = (X.AnonymousClass4U2) r2
            java.lang.Object r1 = r3.A01
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            java.lang.Object r0 = r3.A02
            boolean r0 = X.AnonymousClass000.A1V(r0)
            r2.Bi2(r1, r0)
            return
        L_0x0d9e:
            java.lang.Object r4 = r3.A00
            X.1Dv r4 = (X.C24801Dv) r4
            java.lang.Object r2 = r3.A01
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r1 = r3.A02
            X.7zh r1 = (X.C168097zh) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            android.content.Context r3 = r2.getContext()
            android.content.Context r2 = r2.getContext()
            X.147 r1 = r1.A00
            r0 = 4
            android.content.Intent r0 = X.AnonymousClass190.A0e(r2, r1, r0)
            r4.A06(r3, r0)
            return
        L_0x0dbf:
            java.lang.Object r0 = r3.A00
            com.whatsapp.groupenforcements.ui.GroupSuspendBottomSheet r0 = (com.whatsapp.groupenforcements.ui.GroupSuspendBottomSheet) r0
            java.lang.Object r2 = r3.A01
            X.14u r2 = (X.C225314u) r2
            java.lang.Object r1 = r3.A02
            X.147 r1 = (X.AnonymousClass147) r1
            X.3Dl r0 = r0.A03
            r0.A00(r2, r1)
            return
        L_0x0dd1:
            java.lang.Object r12 = r3.A00
            X.5Ay r12 = (X.C104735Ay) r12
            java.lang.Object r11 = r3.A01
            X.3T1 r11 = (X.AnonymousClass3T1) r11
            java.lang.Object r10 = r3.A02
            java.util.concurrent.CountDownLatch r10 = (java.util.concurrent.CountDownLatch) r10
            java.lang.String r9 = "initialize_player_end"
            r8 = 1
            r7 = 494342675(0x1d771213, float:3.2699522E-21)
            X.0zE r1 = r12.A05     // Catch:{ Exception -> 0x0e94 }
            java.lang.String r0 = "initialize_player_start"
            r1.markerPoint(r7, r0)     // Catch:{ Exception -> 0x0e94 }
            r0 = 0
            r12.A07 = r0     // Catch:{ Exception -> 0x0e94 }
            X.3HF r5 = r12.A02     // Catch:{ Exception -> 0x0e94 }
            X.2bi r11 = (X.C46812bi) r11     // Catch:{ Exception -> 0x0e94 }
            X.1V6 r6 = r5.A03     // Catch:{ Exception -> 0x0e94 }
            boolean r0 = r6.A0D(r11)     // Catch:{ Exception -> 0x0e94 }
            if (r0 == 0) goto L_0x0e08
            X.6zU r5 = r6.A00()     // Catch:{ Exception -> 0x0e94 }
            X.C18740tg.A06(r5)     // Catch:{ Exception -> 0x0e94 }
        L_0x0e00:
            r12.A00 = r5     // Catch:{ Exception -> 0x0e94 }
            r0 = 0
            r5.A0F(r0)     // Catch:{ Exception -> 0x0e94 }
            goto L_0x0e9c
        L_0x0e08:
            r4 = 1
            X.0wG r0 = r5.A05     // Catch:{ Exception -> 0x0e94 }
            r44 = r0
            X.0yC r0 = r5.A0A     // Catch:{ Exception -> 0x0e94 }
            r27 = r0
            X.17Y r0 = r5.A01     // Catch:{ Exception -> 0x0e94 }
            r43 = r0
            X.0wN r0 = r5.A00     // Catch:{ Exception -> 0x0e94 }
            r42 = r0
            X.3QH r0 = r5.A0H     // Catch:{ Exception -> 0x0e94 }
            r34 = r0
            X.0yb r0 = r5.A04     // Catch:{ Exception -> 0x0e94 }
            r41 = r0
            X.1Q0 r0 = r5.A0G     // Catch:{ Exception -> 0x0e94 }
            r33 = r0
            X.16J r0 = r5.A09     // Catch:{ Exception -> 0x0e94 }
            r26 = r0
            X.9Q5 r0 = r5.A0I     // Catch:{ Exception -> 0x0e94 }
            r22 = r0
            X.2ZP r0 = r5.A0J     // Catch:{ Exception -> 0x0e94 }
            r21 = r0
            X.0yE r0 = r5.A06     // Catch:{ Exception -> 0x0e94 }
            r20 = r0
            X.0v0 r0 = r5.A07     // Catch:{ Exception -> 0x0e94 }
            r18 = r0
            X.2ZM r0 = r5.A02     // Catch:{ Exception -> 0x0e94 }
            r19 = r0
            X.4bE r0 = r5.A0D     // Catch:{ Exception -> 0x0e94 }
            r17 = r0
            X.6OW r15 = r5.A0C     // Catch:{ Exception -> 0x0e94 }
            X.1V4 r14 = r5.A0E     // Catch:{ Exception -> 0x0e94 }
            X.4V1 r13 = r5.A0B     // Catch:{ Exception -> 0x0e94 }
            X.3P4 r3 = r5.A0F     // Catch:{ Exception -> 0x0e94 }
            X.0zv r2 = r5.A08     // Catch:{ Exception -> 0x0e94 }
            X.005 r1 = r5.A0L     // Catch:{ Exception -> 0x0e94 }
            X.005 r0 = r5.A0K     // Catch:{ Exception -> 0x0e94 }
            r16 = 0
            X.6zU r5 = new X.6zU     // Catch:{ Exception -> 0x0e94 }
            r39 = 1
            r40 = 1
            r23 = r20
            r24 = r18
            r25 = r2
            r28 = r13
            r29 = r15
            r30 = r17
            r31 = r14
            r32 = r3
            r35 = r22
            r36 = r21
            r37 = r1
            r38 = r0
            r15 = r5
            r17 = r42
            r18 = r43
            r20 = r6
            r21 = r41
            r22 = r44
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)     // Catch:{ Exception -> 0x0e94 }
            r5.A0J = r11     // Catch:{ Exception -> 0x0e94 }
            X.3Qa r0 = r11.A1J     // Catch:{ Exception -> 0x0e94 }
            boolean r0 = r0.A02     // Catch:{ Exception -> 0x0e94 }
            if (r0 != 0) goto L_0x0e00
            int r1 = r11.A0D     // Catch:{ Exception -> 0x0e94 }
            r0 = 9
            if (r1 == r0) goto L_0x0e90
            r0 = 10
            if (r1 == r0) goto L_0x0e90
            r4 = 0
        L_0x0e90:
            r5.A0P = r4     // Catch:{ Exception -> 0x0e94 }
            goto L_0x0e00
        L_0x0e94:
            r1 = move-exception
            r12.A07 = r8     // Catch:{ all -> 0x0ea5 }
            java.lang.String r0 = "PlayVoiceMessageRequest/ caught exception preparing and playing media player"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0ea5 }
        L_0x0e9c:
            X.0zE r0 = r12.A05
            r0.markerPoint(r7, r9)
            r10.countDown()
            return
        L_0x0ea5:
            r1 = move-exception
            X.0zE r0 = r12.A05
            r0.markerPoint(r7, r9)
            r10.countDown()
            throw r1
        L_0x0eaf:
            java.lang.Object r6 = r3.A00
            X.5Ay r6 = (X.C104735Ay) r6
            java.lang.Object r9 = r3.A01
            java.util.concurrent.CountDownLatch r9 = (java.util.concurrent.CountDownLatch) r9
            java.lang.Object r7 = r3.A02
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            java.lang.String r8 = "Service internal error! "
            java.lang.String r5 = "fail_reason"
            r0 = 3
            r4 = 3
            r2 = 494342675(0x1d771213, float:3.2699522E-21)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0f0a }
            boolean r0 = r9.await(r0, r3)     // Catch:{ InterruptedException -> 0x0f0a }
            if (r0 == 0) goto L_0x0f10
            r3 = 3
            if (r7 == 0) goto L_0x0f10
            boolean r0 = r6.A07
            if (r0 == 0) goto L_0x0edc
            X.0zE r1 = r6.A05
            java.lang.String r0 = "Media player failure"
            r1.markerAnnotate((int) r2, (java.lang.String) r5, (java.lang.String) r0)
            return
        L_0x0edc:
            java.lang.String r0 = "error_message"
            java.lang.String r1 = r7.optString(r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0eed
            X.0zE r0 = r6.A05
            r0.markerAnnotate((int) r2, (java.lang.String) r5, (java.lang.String) r1)
        L_0x0eed:
            java.lang.String r0 = "success"
            boolean r1 = r7.getBoolean(r0)     // Catch:{ JSONException -> 0x0ef4 }
            goto L_0x0efd
        L_0x0ef4:
            r1 = move-exception
            java.lang.String r0 = "PlayVoiceMessageRequest/ caught JSON exception reading result JSON"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0f06 }
            X.0zE r0 = r6.A05
            goto L_0x0f02
        L_0x0efd:
            X.0zE r0 = r6.A05
            if (r1 == 0) goto L_0x0f02
            r3 = 2
        L_0x0f02:
            r0.markerEnd(r2, r3)
            return
        L_0x0f06:
            r1 = move-exception
            X.0zE r0 = r6.A05
            goto L_0x0f1f
        L_0x0f0a:
            r1 = move-exception
            java.lang.String r0 = "PlayVoiceMessageRequest/ caught InterruptedException"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0f19 }
        L_0x0f10:
            X.0zE r0 = r6.A05
            r0.markerAnnotate((int) r2, (java.lang.String) r5, (java.lang.String) r8)
            r0.markerEnd(r2, r4)
            return
        L_0x0f19:
            r1 = move-exception
            X.0zE r0 = r6.A05
            r0.markerAnnotate((int) r2, (java.lang.String) r5, (java.lang.String) r8)
        L_0x0f1f:
            r0.markerEnd(r2, r4)
            throw r1
        L_0x0f23:
            java.lang.Object r5 = r3.A00
            com.whatsapp.email.VerifyEmailActivity r5 = (com.whatsapp.email.VerifyEmailActivity) r5
            java.lang.Object r4 = r3.A01
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r3 = r3.A02
            java.lang.Long r3 = (java.lang.Long) r3
            X.9Pi r6 = r5.A05
            if (r6 == 0) goto L_0x0f95
            java.lang.String r7 = r5.A0A
            int r9 = r5.A00
            java.lang.String r8 = java.lang.String.valueOf(r4)
            r10 = 8
            r11 = 5
            r12 = 2
            r6.A00(r7, r8, r9, r10, r11, r12)
            r0 = 3
            X.AnonymousClass3SJ.A00(r5, r0)
            if (r3 == 0) goto L_0x0f8a
            r6 = 0
            long r1 = r3.longValue()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0f8a
            com.whatsapp.WaTextView r7 = r5.A04
            java.lang.String r6 = "resendCodeText"
            if (r7 != 0) goto L_0x0f5d
            java.lang.RuntimeException r1 = X.C36331k8.A0d(r6)
            throw r1
        L_0x0f5d:
            r0 = 0
            r7.setClickable(r0)
            com.whatsapp.WaTextView r7 = r5.A04
            if (r7 != 0) goto L_0x0f6a
            java.lang.RuntimeException r1 = X.C36331k8.A0d(r6)
            throw r1
        L_0x0f6a:
            android.content.res.Resources r6 = r5.getResources()
            r0 = 2131099876(0x7f0600e4, float:1.7812118E38)
            X.C36351kA.A15(r6, r7, r0)
            X.0wI r7 = r5.A08
            if (r7 == 0) goto L_0x0f8e
            r0 = 43
            X.3wU r6 = new X.3wU
            r6.<init>((java.lang.Object) r5, (int) r0)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            long r1 = r0.toMillis(r1)
            android.os.Handler r0 = r7.A00
            r0.postDelayed(r6, r1)
        L_0x0f8a:
            com.whatsapp.email.VerifyEmailActivity.A0F(r5, r4, r3)
            return
        L_0x0f8e:
            java.lang.String r0 = "mainThreadHandler"
            java.lang.RuntimeException r1 = X.C36331k8.A0d(r0)
            throw r1
        L_0x0f95:
            java.lang.String r0 = "emailVerificationLogger"
            java.lang.RuntimeException r1 = X.C36331k8.A0d(r0)
            throw r1
        L_0x0f9c:
            X.14e r2 = r3.A02     // Catch:{ all -> 0x1004 }
            java.lang.String r1 = X.AnonymousClass3TN.A02     // Catch:{ all -> 0x1004 }
            java.lang.String r0 = "MessageAddOnStore/getPinnedMessageAddOnsCountInChat"
            android.database.Cursor r2 = r2.A09(r1, r0, r6)     // Catch:{ all -> 0x1004 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0ff8 }
            if (r0 == 0) goto L_0x0fb2
            java.lang.String r0 = "count"
            int r5 = X.C36351kA.A03(r2, r0)     // Catch:{ all -> 0x0ff8 }
        L_0x0fb2:
            r2.close()     // Catch:{ all -> 0x1004 }
            r3.close()
            boolean r3 = X.C36371kC.A1T(r5, r4)
            X.1Js r2 = r7.A04
            X.2nd r1 = X.C51322nd.PIN
            X.0wD r0 = r2.A01
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x0fe5
            X.2oN r8 = X.C51782oN.NO_CONNECTION_ERROR
        L_0x0fca:
            X.17Y r0 = r7.A00
            r11 = 34
            X.74x r6 = new X.74x
            r6.<init>((java.lang.Object) r7, (java.lang.Object) r8, (java.lang.Object) r9, (java.lang.Object) r10, (int) r11)
            r0.Bp3(r6)
            X.3PQ r3 = r7.A03
            X.0wk r2 = r3.A02
            r1 = 31
            X.72v r0 = new X.72v
            r0.<init>(r3, r10, r1)
            r2.execute(r0)
            return
        L_0x0fe5:
            boolean r0 = X.C26321Js.A00(r1, r2, r10)
            if (r0 != 0) goto L_0x0fee
            X.2oN r8 = X.C51782oN.OTHER_ERROR
            goto L_0x0fca
        L_0x0fee:
            if (r3 == 0) goto L_0x0ff5
            X.17Z r0 = X.AnonymousClass17Z.$redex_init_class
            X.2oN r8 = X.C51782oN.SUCCESS_BUT_NEED_REPLACEMENT
            goto L_0x0fca
        L_0x0ff5:
            X.2oN r8 = X.C51782oN.SUCCESS
            goto L_0x0fca
        L_0x0ff8:
            r1 = move-exception
            if (r2 == 0) goto L_0x1003
            r2.close()     // Catch:{ all -> 0x0fff }
            goto L_0x1003
        L_0x0fff:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x1004 }
        L_0x1003:
            throw r1     // Catch:{ all -> 0x1004 }
        L_0x1004:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x1009 }
            throw r1
        L_0x1009:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x100e:
            r2.close()     // Catch:{ all -> 0x101c }
            r8.close()
            return
        L_0x1015:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x1017 }
        L_0x1017:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x101c }
            throw r0     // Catch:{ all -> 0x101c }
        L_0x101c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x101e }
        L_0x101e:
            r1 = move-exception
            X.C05600Qi.A00(r8, r0)
            throw r1
        L_0x1023:
            r0.remove(r1)     // Catch:{ all -> 0x102b }
            monitor-exit(r0)     // Catch:{ all -> 0x102b }
            r0 = 0
            r3.A5T = r0
            return
        L_0x102b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x102b }
            throw r1
        L_0x102e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x1030 }
        L_0x1030:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ all -> 0x1035 }
            throw r0     // Catch:{ all -> 0x1035 }
        L_0x1035:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x1037 }
        L_0x1037:
            r1 = move-exception
            X.C05600Qi.A00(r6, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80403vL.run():void");
    }
}
