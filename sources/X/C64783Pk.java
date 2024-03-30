package X;

/* renamed from: X.3Pk  reason: invalid class name and case insensitive filesystem */
public class C64783Pk {
    public C77253qC A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public final AnonymousClass1NC A04;
    public final C225314u A05;
    public final C32691e2 A06;
    public final C19730wQ A07;
    public final C19730wQ A08;
    public final C21100yf A09;
    public final C603437m A0A;
    public final AnonymousClass16D A0B;
    public final C27261Nn A0C;
    public final AnonymousClass185 A0D;
    public final AnonymousClass171 A0E;
    public final AnonymousClass1A6 A0F;
    public final C21060yb A0G;
    public final C19970wo A0H;
    public final C19970wo A0I;
    public final C20810yC A0J;
    public final C21010yW A0K;
    public final AnonymousClass1QW A0L;
    public final AnonymousClass1EV A0M;
    public final AnonymousClass1EU A0N;
    public final C29151Vn A0O;
    public final C19770wU A0P;
    public final C19770wU A0Q;
    public final Integer A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final AnonymousClass1N4 A0U;
    public final C26861Lu A0V;
    public final AnonymousClass17Y A0W;
    public final C19600wD A0X;
    public final AnonymousClass185 A0Y;
    public final C21159AAt A0Z;
    public final AnonymousClass17Z A0a;
    public final C25851Hx A0b;
    public final AnonymousClass1DX A0c;
    public final AnonymousClass19A A0d;
    public volatile boolean A0e;

    private void A00(int i, int i2) {
        C21010yW r5 = this.A0K;
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(i2);
        Boolean A0m = C36371kC.A0m();
        C45472Rm r0 = new C45472Rm();
        r0.A03 = valueOf;
        r0.A04 = null;
        r0.A05 = valueOf2;
        r0.A01 = A0m;
        r0.A00 = null;
        r0.A02 = null;
        r5.Blw(r0);
    }

    public C77253qC A01(String str, int i, int i2, boolean z) {
        C19970wo r15 = this.A0I;
        C20810yC r13 = this.A0J;
        AnonymousClass17Y r12 = this.A0W;
        C19770wU r11 = this.A0Q;
        C21010yW r10 = this.A0K;
        AnonymousClass19A r9 = this.A0d;
        AnonymousClass16D r8 = this.A0B;
        C26861Lu r7 = this.A0V;
        C21159AAt aAt = this.A0Z;
        AnonymousClass1N4 r5 = this.A0U;
        AnonymousClass1DX r4 = this.A0c;
        AnonymousClass185 r3 = this.A0Y;
        C19600wD r2 = this.A0X;
        AnonymousClass19A r30 = r9;
        C21010yW r29 = r10;
        C20810yC r28 = r13;
        AnonymousClass1DX r27 = r4;
        C25851Hx r26 = this.A0b;
        return new C77253qC(r5, r7, r12, r2, r8, r3, aAt, r15, this.A0a, r26, r27, r28, r29, r30, this, r11, str, i, i2, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        if (r4.length() <= 17) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x020d, code lost:
        if (r4.length() <= 22) goto L_0x020f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0105  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(X.C64933Qa r22, java.lang.String r23, int r24, boolean r25, boolean r26) {
        /*
            r21 = this;
            r0 = r21
            boolean r1 = r0.A0e
            r15 = 0
            if (r1 != 0) goto L_0x001b
            X.14u r12 = r0.A05
            X.01z r2 = r12.getSupportFragmentManager()
            java.lang.String r1 = "qr_code_scanning_dialog_fragment_tag"
            X.02E r2 = r2.A0N(r1)
            if (r2 == 0) goto L_0x001c
            boolean r2 = r2.A15()
            if (r2 == 0) goto L_0x001c
        L_0x001b:
            return r15
        L_0x001c:
            X.3qC r3 = r0.A00
            if (r3 == 0) goto L_0x003c
            r2 = 1
            r3.A03 = r2
            X.2jZ r2 = r3.A01
            if (r2 == 0) goto L_0x002d
            r2.A0D(r15)
            r2 = 0
            r3.A01 = r2
        L_0x002d:
            java.lang.ref.WeakReference r2 = r3.A0M
            java.lang.Object r2 = r2.get()
            X.3Pk r2 = (X.C64783Pk) r2
            if (r2 == 0) goto L_0x0039
            r2.A0e = r15
        L_0x0039:
            r2 = 0
            r0.A00 = r2
        L_0x003c:
            java.lang.String r2 = "https://wa.me/qr/"
            r4 = r23
            boolean r2 = r4.startsWith(r2)
            if (r2 == 0) goto L_0x004f
            int r3 = r4.length()
            r2 = 17
            r5 = 1
            if (r3 > r2) goto L_0x0050
        L_0x004f:
            r5 = 0
        L_0x0050:
            r3 = 1
            r2 = r24
            r9 = r26
            if (r5 == 0) goto L_0x01fe
            r0.A0e = r3
            X.3qC r11 = r0.A01(r4, r15, r2, r9)
        L_0x005d:
            r0.A00 = r11
            java.lang.ref.WeakReference r2 = r11.A0M
            java.lang.Object r4 = r2.get()
            X.3Pk r4 = (X.C64783Pk) r4
            if (r4 == 0) goto L_0x0102
            X.0wD r2 = r11.A09
            boolean r2 = r2.A09()
            if (r2 == 0) goto L_0x01db
            boolean r1 = r11.A0O
            if (r1 == 0) goto L_0x007d
            X.14u r2 = r4.A05
            r1 = 2131888335(0x7f1208cf, float:1.9411302E38)
            r2.Bu1(r1)
        L_0x007d:
            long r1 = android.os.SystemClock.elapsedRealtime()
            r11.A00 = r1
            X.0yC r6 = r11.A0H
            java.lang.String r4 = r11.A0L
            boolean r1 = X.AnonymousClass1DW.A09(r6, r4)
            if (r1 == 0) goto L_0x010b
            X.1DX r1 = r11.A0G
            java.lang.String r2 = "fetch_biz_info"
            java.util.Map r1 = r1.A02
            java.lang.Object r2 = r1.get(r2)
            X.0zf r2 = (X.C21700zf) r2
            if (r2 == 0) goto L_0x00a0
            java.lang.String r1 = "datasource"
            r2.A07(r1)
        L_0x00a0:
            X.19A r5 = r11.A0J
            X.17Z r2 = r11.A0E
            X.3qB r1 = new X.3qB
            r1.<init>(r11)
            X.3pd r8 = new X.3pd
            r8.<init>(r2, r6, r5, r1)
            int r1 = r11.A04
            java.lang.String r4 = X.C65683Tb.A02(r4, r1)
            X.17Z r1 = X.AnonymousClass17Z.$redex_init_class
            X.19A r7 = r8.A00
            java.lang.String r10 = r7.A09()
            r11 = 315(0x13b, float:4.41E-43)
            java.lang.String r1 = "path"
            r5 = 0
            X.9nx r2 = new X.9nx
            r2.<init>((java.lang.String) r1, (java.lang.String) r4, (X.AnonymousClass1AL[]) r5)
            java.lang.String r1 = "custom_url"
            X.9nx r6 = new X.9nx
            r6.<init>((X.C203399nx) r2, (java.lang.String) r1, (X.AnonymousClass1AL[]) r5)
            r1 = 5
            X.1AL[] r5 = new X.AnonymousClass1AL[r1]
            X.C36341k9.A1V(r5, r15)
            X.C36331k8.A1R(r10, r5, r3)
            java.lang.String r2 = "type"
            java.lang.String r1 = "get"
            X.C36351kA.A1N(r2, r1, r5)
            java.lang.String r2 = "xmlns"
            java.lang.String r1 = "fb:thrift_iq"
            X.C36361kB.A1Q(r2, r1, r5)
            java.lang.String r3 = "smax_id"
            java.lang.String r1 = "79"
            X.1AL r2 = new X.1AL
            r2.<init>((java.lang.String) r3, (java.lang.String) r1)
            r1 = 4
            r5[r1] = r2
            X.9nx r9 = X.C36391kE.A0m(r6, r5)
            r12 = 32000(0x7d00, double:1.581E-319)
            r7.A0F(r8, r9, r10, r11, r12)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "GetUserByCustomUrlProtocol/sendRequest/businessName="
            X.C36321k7.A1Q(r1, r4, r2)
        L_0x0102:
            r15 = 1
            if (r25 == 0) goto L_0x001b
            X.0yb r0 = r0.A0G
            X.AnonymousClass3T3.A03(r0)
            return r15
        L_0x010b:
            android.net.Uri r1 = android.net.Uri.parse(r4)
            boolean r1 = X.AnonymousClass1DW.A08(r1, r6)
            if (r1 == 0) goto L_0x0197
            android.net.Uri r1 = android.net.Uri.parse(r4)
            java.lang.String r1 = X.AnonymousClass1DW.A05(r1)
            r10 = 0
            if (r1 == 0) goto L_0x0136
            X.1N4 r8 = r11.A06
            java.lang.String r9 = "\\D"
            java.lang.String r7 = ""
            java.lang.String r4 = r1.replaceAll(r9, r7)
            int r2 = r4.length()
            r1 = 5
            if (r2 >= r1) goto L_0x013a
            java.lang.String r1 = "contactpicker/converttointlformat/too-short-no-cc"
            com.whatsapp.util.Log.w((java.lang.String) r1)
        L_0x0136:
            r11.A00(r10, r10)
            goto L_0x0102
        L_0x013a:
            java.lang.String r1 = "^([17]|2[07]|3[0123469]|4[013456789]|5[12345678]|6[0123456]|8[1246]|9[0123458]|\\d{3})\\d*?(\\d{4,6})$"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            java.util.regex.Matcher r2 = r1.matcher(r4)
            boolean r1 = r2.find()
            if (r1 == 0) goto L_0x0136
            java.lang.String r6 = r2.group(r3)
            java.lang.String r5 = X.C36431kI.A1B(r6, r4)
            int r1 = X.AnonymousClass3U2.A01(r8, r6, r5)
            if (r1 != r3) goto L_0x0136
            int r4 = java.lang.Integer.parseInt(r6)
            java.lang.String r1 = r5.replaceAll(r9, r7)     // Catch:{ Exception -> 0x0165 }
            java.lang.String r5 = r8.A03(r4, r1)     // Catch:{ Exception -> 0x0165 }
            goto L_0x0173
        L_0x0165:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "contactpicker/converttointlformat/trim/error "
            java.lang.String r1 = X.AnonymousClass000.A0r(r1, r2, r4)
            com.whatsapp.util.Log.w(r1, r3)
        L_0x0173:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "+"
            X.AnonymousClass000.A1D(r1, r6, r5, r2)
            java.lang.String r13 = r2.toString()
            if (r13 == 0) goto L_0x0136
            X.16D r8 = r11.A0A
            X.1Lu r7 = r11.A07
            X.AAt r9 = r11.A0C
            X.2jZ r6 = new X.2jZ
            r12 = r10
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r11.A01 = r6
            X.0wU r1 = r11.A0K
            X.C36391kE.A1Q(r6, r1)
            goto L_0x0102
        L_0x0197:
            X.17Y r2 = r11.A08
            X.19A r1 = r11.A0J
            X.3pc r7 = new X.3pc
            r7.<init>(r2, r1, r11)
            int r1 = r11.A04
            java.lang.String r4 = X.C65683Tb.A02(r4, r1)
            X.19A r6 = r7.A01
            java.lang.String r9 = r6.A09()
            X.1AL[] r2 = new X.AnonymousClass1AL[r3]
            java.lang.String r1 = "code"
            X.C36341k9.A1L(r1, r4, r2, r15)
            java.lang.String r1 = "qr"
            X.9nx r5 = new X.9nx
            r5.<init>(r1, r2)
            r1 = 3
            X.1AL[] r4 = new X.AnonymousClass1AL[r1]
            X.C36331k8.A1R(r9, r4, r15)
            java.lang.String r2 = "xmlns"
            java.lang.String r1 = "w:qr"
            X.C36341k9.A1L(r2, r1, r4, r3)
            java.lang.String r2 = "type"
            java.lang.String r1 = "get"
            X.C36351kA.A1N(r2, r1, r4)
            X.9nx r8 = X.C36391kE.A0m(r5, r4)
            r10 = 216(0xd8, float:3.03E-43)
            r11 = 32000(0x7d00, double:1.581E-319)
            r6.A0F(r7, r8, r9, r10, r11)
            goto L_0x0102
        L_0x01db:
            X.0yW r9 = r11.A0I
            int r13 = r11.A05
            r3 = 3
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
            r7 = 0
            java.lang.String r2 = r11.A0L
            boolean r14 = X.C65683Tb.A04(r2)
            r10 = r7
            r11 = r7
            r8 = r7
            X.C65683Tb.A03(r7, r8, r9, r10, r11, r12, r13, r14)
            r4.A0e = r15
            com.whatsapp.qrcode.contactqr.ErrorDialogFragment r3 = X.C36391kE.A0n(r3)
            X.14u r2 = r4.A05
            r2.Btl(r3, r1)
            goto L_0x0102
        L_0x01fe:
            java.lang.String r5 = "https://wa.me/message/"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L_0x020f
            int r7 = r4.length()
            r6 = 22
            r5 = 1
            if (r7 > r6) goto L_0x0210
        L_0x020f:
            r5 = 0
        L_0x0210:
            r7 = 2
            if (r5 == 0) goto L_0x021b
            r0.A0e = r3
        L_0x0215:
            X.3qC r11 = r0.A01(r4, r7, r2, r9)
            goto L_0x005d
        L_0x021b:
            java.lang.String r5 = "https://wa.me"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L_0x0250
            android.net.Uri r5 = android.net.Uri.parse(r4)
            java.lang.String r8 = X.AnonymousClass1DW.A05(r5)
            if (r8 == 0) goto L_0x0250
            r5 = 5
            int r6 = r8.length()
            if (r5 > r6) goto L_0x0250
            r5 = 20
            if (r6 > r5) goto L_0x0250
            java.lang.String r5 = "[0-9]+"
            boolean r5 = r8.matches(r5)
            if (r5 == 0) goto L_0x0250
            X.1e2 r11 = r0.A06
            android.net.Uri r13 = android.net.Uri.parse(r4)
            r14 = 0
            r16 = 4
            r17 = r2
            r11.BpA(r12, r13, r14, r15, r16, r17)
            goto L_0x0102
        L_0x0250:
            X.0yC r8 = r0.A0J
            boolean r5 = X.AnonymousClass1DW.A09(r8, r4)
            if (r5 != 0) goto L_0x0297
            android.net.Uri r5 = android.net.Uri.parse(r4)
            boolean r5 = X.AnonymousClass1DW.A08(r5, r8)
            if (r5 != 0) goto L_0x0297
            boolean r3 = r0.A0S
            if (r3 == 0) goto L_0x02c4
            X.0yf r5 = r0.A09
            X.0yi r3 = X.C21100yf.A0o
            boolean r3 = r5.A09(r3)
            if (r3 == 0) goto L_0x02c4
            android.net.Uri r3 = android.net.Uri.parse(r4)
            java.lang.String r5 = X.C54542t7.A00(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r5)
            if (r3 != 0) goto L_0x02c4
            r1 = 6
            r0.A00(r2, r1)
            r1 = 982(0x3d6, float:1.376E-42)
            boolean r1 = r8.A0E(r1)
            if (r1 == 0) goto L_0x02a4
            X.01z r2 = r12.getSupportFragmentManager()
            com.whatsapp.community.JoinGroupBottomSheetFragment r1 = com.whatsapp.community.JoinGroupBottomSheetFragment.A06(r5, r15, r15)
            X.C65443Sb.A02(r1, r2)
            goto L_0x0102
        L_0x0297:
            r0.A0e = r3
            r5 = 1849(0x739, float:2.591E-42)
            boolean r5 = r8.A0E(r5)
            if (r5 == 0) goto L_0x0215
            r7 = 3
            goto L_0x0215
        L_0x02a4:
            java.lang.Integer r4 = r0.A0R
            android.content.Intent r3 = X.C36431kI.A0D()
            java.lang.String r2 = r12.getPackageName()
            java.lang.String r1 = "com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity"
            android.content.Intent r3 = r3.setClassName(r2, r1)
            java.lang.String r1 = "code"
            r3.putExtra(r1, r5)
            if (r4 == 0) goto L_0x0409
            int r1 = r4.intValue()
            r12.startActivityForResult(r3, r1)
            goto L_0x0102
        L_0x02c4:
            X.1EV r3 = r0.A0M
            boolean r3 = r3.A03()
            if (r3 == 0) goto L_0x0310
            X.1EU r3 = r0.A0N
            X.B66 r10 = r3.A05()
            X.4Ug r6 = r10.BFj()
            android.content.Intent r7 = r12.getIntent()
            r5 = 32
            java.lang.String r3 = "origin"
            int r5 = r7.getIntExtra(r3, r5)
            r9 = 1
            if (r6 == 0) goto L_0x02f0
            boolean r3 = r6.BNe(r4, r2, r5)
            if (r3 == 0) goto L_0x02f0
            r6.BJh(r12, r4, r2, r5)
            goto L_0x0102
        L_0x02f0:
            r3 = 611(0x263, float:8.56E-43)
            boolean r3 = r8.A0E(r3)
            r7 = 4
            if (r3 == 0) goto L_0x03f2
            if (r6 == 0) goto L_0x03f2
            boolean r3 = r6.BNd(r4)
            if (r3 == 0) goto L_0x03f2
            boolean r3 = r0.A0T
            if (r3 == 0) goto L_0x03e8
            r0.A00(r2, r7)
            if (r2 == r9) goto L_0x037f
            r3 = 3
            if (r2 == r3) goto L_0x036c
            r3 = 5
            if (r2 == r3) goto L_0x037f
        L_0x0310:
            X.0yf r5 = r0.A09
            X.0yi r3 = X.C21100yf.A0o
            boolean r3 = r5.A09(r3)
            if (r3 == 0) goto L_0x040e
            X.0wQ r3 = r0.A07
            boolean r3 = r3.A0L()
            if (r3 != 0) goto L_0x040e
            X.3OO r6 = X.AnonymousClass3O3.A07
            java.lang.String r5 = ","
            X.0fN r3 = new X.0fN
            r3.<init>((java.lang.String) r5)
            java.util.List r7 = r3.A01(r4, r15)
            boolean r3 = r7.isEmpty()
            if (r3 != 0) goto L_0x0369
            int r3 = r7.size()
            java.util.ListIterator r5 = r7.listIterator(r3)
        L_0x033d:
            boolean r3 = r5.hasPrevious()
            if (r3 == 0) goto L_0x0369
            int r3 = X.C36411kG.A0A(r5)
            if (r3 == 0) goto L_0x033d
            java.util.List r3 = X.C36411kG.A14(r7, r5)
        L_0x034d:
            java.lang.String[] r3 = X.C36431kI.A1b(r3)
            int r5 = r3.length
            r3 = 4
            if (r5 < r3) goto L_0x040e
            X.3O3 r3 = r6.A01(r4)
            if (r3 == 0) goto L_0x040e
            java.lang.String r3 = r3.A03
            if (r3 != 0) goto L_0x040e
            com.whatsapp.qrcode.contactqr.WebCodeDialogFragment r2 = new com.whatsapp.qrcode.contactqr.WebCodeDialogFragment
            r2.<init>()
        L_0x0364:
            r12.Btl(r2, r1)
            goto L_0x0102
        L_0x0369:
            X.09w r3 = X.C023409w.A00
            goto L_0x034d
        L_0x036c:
            r3 = 1811(0x713, float:2.538E-42)
            boolean r3 = r8.A0E(r3)
            if (r3 == 0) goto L_0x037f
            if (r5 == r9) goto L_0x0310
            r3 = 13
            if (r5 == r3) goto L_0x0310
            r3 = 21
            if (r5 != r3) goto L_0x037f
            goto L_0x0310
        L_0x037f:
            java.lang.String r5 = X.AnonymousClass1FR.A04(r2, r5)
            r7 = r22
            if (r22 == 0) goto L_0x0399
            X.11F r3 = r7.A00
        L_0x0389:
            r9 = 3
            if (r2 == r9) goto L_0x039b
            r9 = 1354(0x54a, float:1.897E-42)
            boolean r9 = r8.A0E(r9)
            if (r9 == 0) goto L_0x039b
            r6.Bu6(r12, r3, r4, r5)
            goto L_0x0102
        L_0x0399:
            r3 = 0
            goto L_0x0389
        L_0x039b:
            if (r22 == 0) goto L_0x03e2
            X.0wo r9 = r0.A0H
            long r19 = X.C19970wo.A00(r9)
            X.185 r10 = r0.A0D
            X.11F r9 = r7.A00
            com.whatsapp.jid.UserJid r9 = X.C36401kF.A0b(r9)
            X.3L0 r15 = r10.A01(r9)
            r9 = 4288(0x10c0, float:6.009E-42)
            boolean r8 = r8.A0E(r9)
            java.lang.String r17 = r6.BFT(r4)
            if (r8 == 0) goto L_0x03e2
            boolean r8 = r7.A02
            if (r8 != 0) goto L_0x03e2
            if (r15 == 0) goto L_0x03e2
            boolean r8 = r15.A01()
            if (r8 != 0) goto L_0x03cd
            boolean r8 = r15.A02()
            if (r8 == 0) goto L_0x03e2
        L_0x03cd:
            boolean r8 = android.text.TextUtils.isEmpty(r17)
            if (r8 != 0) goto L_0x03e2
            X.0wU r8 = r0.A0P
            X.AVm r13 = new X.AVm
            r18 = 1
            r14 = r0
            r16 = r7
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r8.Boy(r13)
        L_0x03e2:
            androidx.fragment.app.DialogFragment r2 = r6.BGM(r3, r4, r5, r2)
            goto L_0x0364
        L_0x03e8:
            r0.A00(r2, r7)
            r2 = 5
            com.whatsapp.qrcode.contactqr.ErrorDialogFragment r2 = X.C36391kE.A0n(r2)
            goto L_0x0364
        L_0x03f2:
            r3 = 848(0x350, float:1.188E-42)
            boolean r3 = r8.A0E(r3)
            if (r3 == 0) goto L_0x0310
            java.lang.String r3 = r10.BI8(r4)
            if (r3 == 0) goto L_0x0310
            android.content.Intent r3 = r10.BIU(r12, r3)
            if (r3 == 0) goto L_0x0310
            r0.A00(r2, r7)
        L_0x0409:
            r12.startActivity(r3)
            goto L_0x0102
        L_0x040e:
            X.1QW r1 = r0.A0L
            boolean r1 = r1.A02()
            if (r1 == 0) goto L_0x0460
            android.net.Uri r1 = android.net.Uri.parse(r4)
            boolean r1 = X.C64053Ml.A00(r1)
            if (r1 == 0) goto L_0x0460
            X.37m r6 = r0.A0A
            r1 = 7
            X.2PW r5 = new X.2PW
            r5.<init>()
            r6.A00 = r1
            java.util.Random r1 = r6.A01
            if (r1 != 0) goto L_0x0435
            java.util.Random r1 = new java.util.Random
            r1.<init>()
            r6.A01 = r1
        L_0x0435:
            long r3 = r1.nextLong()
            java.lang.String r3 = java.lang.Long.toHexString(r3)
            int r1 = r6.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5.A00 = r1
            r5.A02 = r3
            java.lang.Long r1 = X.C36411kG.A0t()
            r5.A01 = r1
            X.0yW r1 = r6.A02
            r1.Bly(r5)
            r1 = 9
            r0.A00(r2, r1)
            android.content.Intent r1 = X.AnonymousClass1NC.A00(r12)
            r12.startActivity(r1)
            goto L_0x0102
        L_0x0460:
            r1 = 7
            r0.A00(r2, r1)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64783Pk.A02(X.3Qa, java.lang.String, int, boolean, boolean):boolean");
    }

    public C64783Pk(AnonymousClass1NC r5, AnonymousClass1N4 r6, C26861Lu r7, C225314u r8, AnonymousClass17Y r9, C32691e2 r10, C19730wQ r11, C21100yf r12, C603437m r13, C19600wD r14, AnonymousClass16D r15, C27261Nn r16, AnonymousClass185 r17, AnonymousClass171 r18, C21159AAt aAt, AnonymousClass1A6 r20, C21060yb r21, C19970wo r22, AnonymousClass17Z r23, C25851Hx r24, AnonymousClass1DX r25, C20810yC r26, C21010yW r27, AnonymousClass19A r28, AnonymousClass1QW r29, AnonymousClass1EV r30, AnonymousClass1EU r31, C29151Vn r32, C19770wU r33, Integer num, boolean z, boolean z2) {
        C19970wo r1 = r22;
        this.A0H = r1;
        this.A05 = r8;
        this.A0J = r26;
        this.A07 = r11;
        C19770wU r2 = r33;
        this.A0P = r2;
        this.A0K = r27;
        this.A04 = r5;
        this.A0R = num;
        this.A09 = r12;
        this.A06 = r10;
        this.A0G = r21;
        AnonymousClass185 r3 = r17;
        this.A0D = r3;
        this.A0N = r31;
        this.A0T = z;
        this.A0S = z2;
        this.A0O = r32;
        this.A0M = r30;
        this.A0L = r29;
        this.A0A = r13;
        this.A0I = r1;
        this.A0W = r9;
        this.A08 = r11;
        this.A0Q = r2;
        this.A0d = r28;
        this.A0B = r15;
        this.A0E = r18;
        this.A0V = r7;
        this.A0Z = aAt;
        this.A0U = r6;
        this.A0c = r25;
        this.A0Y = r3;
        this.A0F = r20;
        this.A0X = r14;
        this.A0C = r16;
        this.A0b = r24;
        this.A0a = r23;
    }
}
