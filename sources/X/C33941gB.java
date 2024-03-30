package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.1gB  reason: invalid class name and case insensitive filesystem */
public final class C33941gB implements C33681fl {
    public static final C33951gC A0C = new C33951gC();
    public View A00;
    public boolean A01;
    public final int A02;
    public final Context A03;
    public final C24801Dv A04;
    public final C24461Cn A05;
    public final C33601fd A06;
    public final C19420v0 A07;
    public final C18820ts A08;
    public final C33571fa A09;
    public final C20810yC A0A;
    public final C21010yW A0B;

    public C33941gB(Context context, View view, C24801Dv r4, C33571fa r5, C24461Cn r6, C33601fd r7, C19420v0 r8, C18820ts r9, C20810yC r10, C21010yW r11, int i) {
        AnonymousClass00C.A0D(context, 1);
        AnonymousClass00C.A0D(r10, 2);
        AnonymousClass00C.A0D(r11, 3);
        AnonymousClass00C.A0D(r4, 4);
        AnonymousClass00C.A0D(r9, 5);
        AnonymousClass00C.A0D(r8, 6);
        AnonymousClass00C.A0D(r6, 7);
        AnonymousClass00C.A0D(r7, 8);
        this.A03 = context;
        this.A0A = r10;
        this.A0B = r11;
        this.A04 = r4;
        this.A08 = r9;
        this.A07 = r8;
        this.A05 = r6;
        this.A06 = r7;
        this.A09 = r5;
        this.A00 = view;
        this.A02 = i;
    }

    public static final void A00(C33941gB r4, int i, int i2, int i3) {
        int i4;
        AnonymousClass2PD r3 = new AnonymousClass2PD();
        String valueOf = String.valueOf(i2);
        if (i3 == 1) {
            i4 = 53;
        } else if (i3 == 2) {
            i4 = 64;
        } else if (i3 == 3) {
            i4 = 63;
        } else if (i3 == 4) {
            i4 = 65;
        } else {
            return;
        }
        r3.A02 = valueOf;
        r3.A00 = Integer.valueOf(i);
        r3.A01 = Integer.valueOf(i4);
        r4.A0B.Blw(r3);
    }

    public void BK9() {
        View view;
        if (this.A01 && (view = this.A00) != null) {
            view.setVisibility(8);
        }
    }

    public boolean Bt0() {
        if (this.A02 == 0) {
            if (!C20800yB.A01(C21000yV.A02, this.A0A, 7298)) {
                return false;
            }
        }
        return this.A06.A01();
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r13 = this;
            boolean r0 = r13.Bt0()
            if (r0 == 0) goto L_0x014a
            boolean r0 = r13.A01
            if (r0 != 0) goto L_0x014a
            X.1fa r3 = r13.A09
            android.view.View r0 = r13.A00
            if (r0 != 0) goto L_0x0027
            if (r3 == 0) goto L_0x0027
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131624162(0x7f0e00e2, float:1.8875496E38)
            r0 = 0
            android.view.View r0 = r2.inflate(r1, r3, r0)
            r13.A00 = r0
            r3.addView(r0)
        L_0x0027:
            X.1fd r0 = r13.A06
            int r4 = r0.A00()
            X.1Cn r5 = r0.A00
            X.00T r6 = r5.A01
            java.lang.Object r2 = r6.getValue()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r1 = "backup_current_banner_shown"
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)
            if (r0 != 0) goto L_0x0064
            r3 = 1
            java.lang.Object r0 = r6.getValue()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r1, r3)
            r0.apply()
            r2 = 2
            r1 = 3
            if (r4 == r3) goto L_0x018f
            if (r4 == r2) goto L_0x0196
            if (r4 == r1) goto L_0x019d
            r0 = 4
            if (r4 != r0) goto L_0x0064
            java.lang.String r0 = X.C24461Cn.A00(r0)
        L_0x0061:
            r5.A06(r0)
        L_0x0064:
            android.view.View r5 = r13.A00
            if (r5 == 0) goto L_0x0142
            r0 = 2131427942(0x7f0b0266, float:1.8477514E38)
            android.view.View r1 = X.C012005e.A02(r5, r0)
            X.AnonymousClass00C.A08(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r6 = 1
            r0 = 8
            if (r4 != r6) goto L_0x0080
            r0 = 2131886644(0x7f120234, float:1.9407873E38)
            r1.setText(r0)
            r0 = 0
        L_0x0080:
            r1.setVisibility(r0)
            android.content.Context r9 = r5.getContext()
            r0 = 2131427928(0x7f0b0258, float:1.8477486E38)
            android.view.View r7 = X.C012005e.A02(r5, r0)
            X.AnonymousClass00C.A08(r7)
            com.whatsapp.TextEmojiLabel r7 = (com.whatsapp.TextEmojiLabel) r7
            X.AnonymousClass00C.A0B(r9)
            r1 = 2130968626(0x7f040032, float:1.754591E38)
            r0 = 2131099690(0x7f06002a, float:1.781174E38)
            int r0 = X.C224514j.A00(r9, r1, r0)
            java.lang.String r12 = X.AnonymousClass14B.A03(r9, r0)
            X.AnonymousClass00C.A08(r12)
            r8 = 2
            r3 = 0
            r0 = 4
            if (r4 != r0) goto L_0x0154
            X.0v0 r1 = r13.A07
            java.lang.String r0 = r1.A0c()
            r10 = -1
            if (r0 == 0) goto L_0x0186
            long r0 = r1.A0U(r0)
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x0186
            r10 = 2131886645(0x7f120235, float:1.9407875E38)
            java.lang.Object[] r8 = new java.lang.Object[r8]
            X.0ts r2 = r13.A08
            java.lang.String r0 = X.AnonymousClass3TF.A03(r2, r0)
        L_0x00c9:
            r8[r3] = r0
            r8[r6] = r12
        L_0x00cd:
            java.lang.String r0 = r9.getString(r10, r8)
            if (r0 == 0) goto L_0x00da
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            r7.A0I(r0)
        L_0x00da:
            X.1iC r0 = new X.1iC
            r0.<init>(r5, r13, r4, r6)
            r5.setOnClickListener(r0)
            r5.setVisibility(r3)
            r0 = 2131428856(0x7f0b05f8, float:1.8479368E38)
            android.view.View r2 = X.C012005e.A02(r5, r0)
            X.AnonymousClass00C.A08(r2)
            if (r4 != r6) goto L_0x014b
            android.content.Context r7 = r5.getContext()
            X.AnonymousClass00C.A0B(r7)
            r1 = 2130968732(0x7f04009c, float:1.7546126E38)
            r0 = 2131099807(0x7f06009f, float:1.7811978E38)
            X.AnonymousClass00C.A0D(r7, r3)
            int r0 = X.C224514j.A00(r7, r1, r0)
            int r0 = X.AnonymousClass00F.A00(r7, r0)
            r5.setBackgroundColor(r0)
            r0 = 2131427931(0x7f0b025b, float:1.8477492E38)
            android.view.View r1 = X.C012005e.A02(r5, r0)
            X.AnonymousClass00C.A08(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0 = 2131099808(0x7f0600a0, float:1.781198E38)
            android.content.res.ColorStateList r0 = X.AnonymousClass00F.A04(r7, r0)
            X.C012005e.A0F(r0, r1)
            r0 = 2131232946(0x7f0808b2, float:1.8082016E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass00E.A00(r7, r0)
            X.C18740tg.A06(r0)
            r1.setImageDrawable(r0)
            r0 = 2131099809(0x7f0600a1, float:1.7811982E38)
            int r0 = X.AnonymousClass00F.A00(r7, r0)
            X.AnonymousClass3UF.A0E(r1, r0)
            int r0 = r13.A02
            if (r0 != r6) goto L_0x014b
            r0 = 8
            r2.setVisibility(r0)
        L_0x0142:
            r1 = 1
            r13.A01 = r1
            int r0 = r13.A02
            A00(r13, r1, r0, r4)
        L_0x014a:
            return
        L_0x014b:
            X.1iC r0 = new X.1iC
            r0.<init>(r5, r13, r4, r3)
            r2.setOnClickListener(r0)
            goto L_0x0142
        L_0x0154:
            if (r4 == r6) goto L_0x0182
            if (r4 == r8) goto L_0x0171
            r0 = 3
            if (r4 != r0) goto L_0x00da
            r10 = 2131886643(0x7f120233, float:1.940787E38)
            java.lang.Object[] r8 = new java.lang.Object[r8]
            X.0ts r0 = r13.A08
            java.text.NumberFormat r2 = r0.A0N()
            r0 = 4605380978949069210(0x3fe999999999999a, double:0.8)
        L_0x016b:
            java.lang.String r0 = r2.format(r0)
            goto L_0x00c9
        L_0x0171:
            r10 = 2131886647(0x7f120237, float:1.9407879E38)
            java.lang.Object[] r8 = new java.lang.Object[r8]
            X.0ts r0 = r13.A08
            java.text.NumberFormat r2 = r0.A0N()
            r0 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            goto L_0x016b
        L_0x0182:
            r10 = 2131886685(0x7f12025d, float:1.9407956E38)
            goto L_0x0189
        L_0x0186:
            r10 = 2131886646(0x7f120236, float:1.9407877E38)
        L_0x0189:
            java.lang.Object[] r8 = new java.lang.Object[r6]
            r8[r3] = r12
            goto L_0x00cd
        L_0x018f:
            java.lang.String r0 = X.C24461Cn.A00(r3)
            r5.A06(r0)
        L_0x0196:
            java.lang.String r0 = X.C24461Cn.A00(r2)
            r5.A06(r0)
        L_0x019d:
            java.lang.String r0 = X.C24461Cn.A00(r1)
            goto L_0x0061
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33941gB.A01():void");
    }

    public void BwS() {
        A01();
    }
}
