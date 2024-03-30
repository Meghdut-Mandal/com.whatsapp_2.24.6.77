package X;

/* renamed from: X.1ed  reason: invalid class name and case insensitive filesystem */
public class C33051ed {
    public final AnonymousClass17Y A00;
    public final C19420v0 A01;
    public final AnonymousClass1NO A02;
    public final C19770wU A03;
    public final C21100yf A04;
    public final C236419g A05;
    public final AnonymousClass1H2 A06;
    public final C20810yC A07;
    public final C236919l A08;

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b9, code lost:
        if (r7 > 1) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f6, code lost:
        if (r7 > 1) goto L_0x00f8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C39001qm A00(android.content.Context r17, X.C88644Tm r18, int r19, int r20, int r21, boolean r22) {
        /*
            r16 = this;
            r8 = r17
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r8)
            r1 = 2131624809(0x7f0e0369, float:1.8876808E38)
            r0 = 0
            android.view.View r6 = r2.inflate(r1, r0)
            r0 = 2131429471(0x7f0b085f, float:1.8480616E38)
            android.view.View r3 = X.C012005e.A02(r6, r0)
            r0 = 2131429485(0x7f0b086d, float:1.8480644E38)
            android.view.View r2 = X.C012005e.A02(r6, r0)
            r0 = 2131429469(0x7f0b085d, float:1.8480612E38)
            android.view.View r10 = X.C012005e.A02(r6, r0)
            android.widget.CheckBox r10 = (android.widget.CheckBox) r10
            r0 = 2131429470(0x7f0b085e, float:1.8480614E38)
            android.view.View r4 = X.C012005e.A02(r6, r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r13 = r16
            X.0v0 r0 = r13.A01
            X.005 r0 = r0.A00
            java.lang.Object r5 = r0.get()
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            java.lang.String r1 = "pref_media_delete_per_conversation"
            r0 = 0
            boolean r15 = r5.getBoolean(r1, r0)
            r0 = 2131429484(0x7f0b086c, float:1.8480642E38)
            android.view.View r11 = X.C012005e.A02(r6, r0)
            android.widget.CheckBox r11 = (android.widget.CheckBox) r11
            r1 = 1
            r14 = r21
            if (r21 == 0) goto L_0x0054
            r0 = 1
            r1 = 0
            if (r14 == r0) goto L_0x0054
            r1 = r15
        L_0x0054:
            r10.setChecked(r1)
            r5 = -1
            r1 = 2131888696(0x7f120a38, float:1.9412035E38)
            r7 = r19
            if (r7 == r5) goto L_0x0068
            r0 = 1
            r1 = 2131888731(0x7f120a5b, float:1.9412106E38)
            if (r7 != r0) goto L_0x0068
            r1 = 2131888732(0x7f120a5c, float:1.9412108E38)
        L_0x0068:
            java.lang.String r0 = r8.getString(r1)
            r4.setText(r0)
            r0 = 8
            if (r22 == 0) goto L_0x0074
            r0 = 0
        L_0x0074:
            r2.setVisibility(r0)
            r1 = 40
            X.1iF r0 = new X.1iF
            r0.<init>((java.lang.Object) r10, (int) r1)
            r3.setOnClickListener(r0)
            r1 = 41
            X.1iF r0 = new X.1iF
            r0.<init>((java.lang.Object) r11, (int) r1)
            r2.setOnClickListener(r0)
            r4 = 0
            r1 = 1
            r9 = r20
            if (r20 == 0) goto L_0x0114
            if (r9 == r1) goto L_0x0108
            r0 = 2
            if (r9 == r0) goto L_0x00fc
            r0 = 2131887909(0x7f120725, float:1.9410438E38)
            if (r7 != r5) goto L_0x009e
            r0 = 2131887898(0x7f12071a, float:1.9410416E38)
        L_0x009e:
            java.lang.String r0 = r8.getString(r0)
        L_0x00a2:
            X.1qm r1 = X.AnonymousClass3LW.A00(r8)
            r1.A0q(r0)
            r1.A0j(r6)
            r2 = 1
            if (r20 == 0) goto L_0x00f1
            if (r9 == r2) goto L_0x00e5
            r0 = 2
            if (r9 == r0) goto L_0x00d9
            if (r7 == r5) goto L_0x00bb
            r0 = 2131887907(0x7f120723, float:1.9410434E38)
            if (r7 <= r2) goto L_0x00be
        L_0x00bb:
            r0 = 2131887906(0x7f120722, float:1.9410432E38)
        L_0x00be:
            java.lang.String r0 = r8.getString(r0)
            X.3VK r9 = new X.3VK
            r12 = r18
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r1.A0i(r9, r0)
            r3 = 2131896389(0x7f122845, float:1.9427638E38)
            r2 = 5
            X.4XK r0 = new X.4XK
            r0.<init>(r12, r2)
            r1.A0f(r0, r3)
            return r1
        L_0x00d9:
            if (r7 == r2) goto L_0x00dc
            r2 = 0
        L_0x00dc:
            java.lang.String r0 = "Use DELETE_GROUP_CHAT only for single group deletion"
            X.C18740tg.A0D(r2, r0)
            r0 = 2131888720(0x7f120a50, float:1.9412083E38)
            goto L_0x00be
        L_0x00e5:
            if (r7 == r2) goto L_0x00e8
            r2 = 0
        L_0x00e8:
            java.lang.String r0 = "Use DELETE_BROADCAST_LIST only for single broadcast deletion"
            X.C18740tg.A0D(r2, r0)
            r0 = 2131888704(0x7f120a40, float:1.941205E38)
            goto L_0x00be
        L_0x00f1:
            if (r7 == r5) goto L_0x00f8
            r0 = 2131888750(0x7f120a6e, float:1.9412144E38)
            if (r7 <= r2) goto L_0x00be
        L_0x00f8:
            r0 = 2131888733(0x7f120a5d, float:1.941211E38)
            goto L_0x00be
        L_0x00fc:
            if (r7 != r1) goto L_0x00ff
            r4 = 1
        L_0x00ff:
            java.lang.String r0 = "Use DELETE_SINGLE_GROUP_CHAT only for single broadcast deletion"
            X.C18740tg.A0F(r4, r0)
            r0 = 2131888723(0x7f120a53, float:1.941209E38)
            goto L_0x009e
        L_0x0108:
            if (r7 != r1) goto L_0x010b
            r4 = 1
        L_0x010b:
            java.lang.String r0 = "Use DELETE_SINGLE_BROADCAST_LIST only for single broadcast deletion"
            X.C18740tg.A0F(r4, r0)
            r0 = 2131888705(0x7f120a41, float:1.9412053E38)
            goto L_0x009e
        L_0x0114:
            if (r7 != r5) goto L_0x011a
            r0 = 2131888694(0x7f120a36, float:1.941203E38)
            goto L_0x009e
        L_0x011a:
            android.content.res.Resources r3 = r8.getResources()
            r2 = 2131755064(0x7f100038, float:1.9140997E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r1[r4] = r0
            java.lang.String r0 = r3.getQuantityString(r2, r7, r1)
            goto L_0x00a2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33051ed.A00(android.content.Context, X.4Tm, int, int, int, boolean):X.1qm");
    }

    public void A01(AnonymousClass11F r5, C88654Tn r6) {
        C50222kP r2 = new C50222kP(this.A02, r5, r6);
        this.A03.Box(r2, new Void[0]);
        this.A00.A0I(new C35771jE(r2, r6, 16), 500);
    }

    public C33051ed(AnonymousClass17Y r1, C21100yf r2, C19420v0 r3, AnonymousClass1NO r4, C236419g r5, AnonymousClass1H2 r6, C20810yC r7, C236919l r8, C19770wU r9) {
        this.A07 = r7;
        this.A00 = r1;
        this.A03 = r9;
        this.A06 = r6;
        this.A04 = r2;
        this.A08 = r8;
        this.A02 = r4;
        this.A01 = r3;
        this.A05 = r5;
    }
}
