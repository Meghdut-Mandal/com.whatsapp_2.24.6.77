package X;

import android.content.SharedPreferences;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: X.1gA  reason: invalid class name and case insensitive filesystem */
public class C33931gA implements C33681fl {
    public View A00;
    public final FrameLayout A01;
    public final C19420v0 A02;
    public final C24801Dv A03;
    public final C33591fc A04;
    public final C20810yC A05;
    public final C21010yW A06;

    public void A00(int i) {
        AnonymousClass2PD r1 = new AnonymousClass2PD();
        r1.A01 = 39;
        r1.A00 = Integer.valueOf(i);
        this.A06.Bly(r1);
    }

    public boolean A01() {
        if (C20800yB.A01(C21000yV.A02, this.A05, 3283)) {
            AnonymousClass005 r3 = this.A02.A00;
            if (!((SharedPreferences) r3.get()).getBoolean("smb_enforcement_bottomsheet_shown", false) || !((SharedPreferences) r3.get()).getBoolean("should_show_smb_enforcement_banner", false)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void BK9() {
        View view = this.A00;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public boolean Bt0() {
        if (C20800yB.A01(C21000yV.A02, this.A05, 2986)) {
            AnonymousClass005 r3 = this.A02.A00;
            if (!((SharedPreferences) r3.get()).getBoolean("smb_enforcement_bottomsheet_shown", false) || !((SharedPreferences) r3.get()).getBoolean("should_show_smb_enforcement_banner", false)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C33931gA(FrameLayout frameLayout, C24801Dv r2, C33591fc r3, C19420v0 r4, C20810yC r5, C21010yW r6) {
        this.A05 = r5;
        this.A06 = r6;
        this.A03 = r2;
        this.A01 = frameLayout;
        this.A02 = r4;
        this.A04 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0206, code lost:
        if (r0 != null) goto L_0x0153;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0159  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BwS() {
        /*
            r14 = this;
            boolean r0 = r14.Bt0()
            if (r0 != 0) goto L_0x000c
            boolean r0 = r14.A01()
            if (r0 == 0) goto L_0x0027
        L_0x000c:
            android.view.View r0 = r14.A00
            if (r0 != 0) goto L_0x0027
            android.widget.FrameLayout r3 = r14.A01
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131624768(0x7f0e0340, float:1.8876725E38)
            r0 = 0
            android.view.View r0 = r2.inflate(r1, r3, r0)
            r14.A00 = r0
            r3.addView(r0)
        L_0x0027:
            android.widget.FrameLayout r10 = r14.A01
            android.content.Context r9 = r10.getContext()
            android.content.res.Resources r8 = r10.getResources()
            android.view.View r7 = r14.A00
            if (r7 != 0) goto L_0x0047
            android.content.Context r0 = r10.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131624768(0x7f0e0340, float:1.8876725E38)
            r0 = 0
            android.view.View r7 = r2.inflate(r1, r10, r0)
            r14.A00 = r7
        L_0x0047:
            android.content.Context r2 = r7.getContext()
            r1 = 2130968736(0x7f0400a0, float:1.7546134E38)
            r0 = 2131099815(0x7f0600a7, float:1.7811994E38)
            int r0 = X.C224514j.A00(r2, r1, r0)
            int r0 = r8.getColor(r0)
            r7.setBackgroundColor(r0)
            r0 = 2131427934(0x7f0b025e, float:1.8477498E38)
            android.view.View r1 = X.C012005e.A02(r7, r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0 = 2131099816(0x7f0600a8, float:1.7811996E38)
            android.content.res.ColorStateList r0 = X.AnonymousClass00F.A04(r9, r0)
            X.C012005e.A0F(r0, r1)
            r6 = 0
            r0 = 2131234412(0x7f080e6c, float:1.808499E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass0BT.A00(r6, r8, r0)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass08I.A01(r0)
            r1.setImageDrawable(r0)
            r0 = 2131427942(0x7f0b0266, float:1.8477514E38)
            android.view.View r1 = X.C012005e.A02(r7, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131894399(0x7f12207f, float:1.9423602E38)
            r1.setText(r0)
            r0 = 2131894398(0x7f12207e, float:1.94236E38)
            java.lang.String r0 = r9.getString(r0)
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>(r0)
            r0 = 2131894400(0x7f122080, float:1.9423604E38)
            java.lang.String r0 = r9.getString(r0)
            android.text.SpannableString r4 = new android.text.SpannableString
            r4.<init>(r0)
            r1 = 2130969984(0x7f040580, float:1.7548665E38)
            r0 = 2131101114(0x7f0605ba, float:1.7814629E38)
            int r0 = X.C224514j.A00(r9, r1, r0)
            int r0 = X.AnonymousClass00F.A00(r9, r0)
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            r1.<init>(r0)
            int r0 = r4.length()
            r5 = 0
            r2 = 33
            r4.setSpan(r1, r5, r0, r2)
            X.1mJ r1 = new X.1mJ
            r1.<init>()
            int r0 = r4.length()
            r4.setSpan(r1, r5, r0, r2)
            java.lang.String r0 = " "
            android.text.SpannableStringBuilder r0 = r3.append(r0)
            r0.append(r4)
            r0 = 2131427928(0x7f0b0258, float:1.8477486E38)
            android.view.View r0 = X.C012005e.A02(r7, r0)
            com.whatsapp.TextEmojiLabel r0 = (com.whatsapp.TextEmojiLabel) r0
            r0.A0I(r3)
            X.1fc r3 = r14.A04
            X.0v0 r0 = r3.A00
            X.005 r0 = r0.A00
            java.lang.Object r2 = r0.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r1 = "app_install_source"
            java.lang.String r0 = "unknown|unknown"
            java.lang.String r1 = r2.getString(r1, r0)
            X.AnonymousClass00C.A08(r1)
            X.0yC r4 = r3.A01
            r0 = 2951(0xb87, float:4.135E-42)
            java.lang.String r0 = r4.A09(r0)
            android.net.Uri r3 = android.net.Uri.parse(r0)
            java.lang.String r12 = "biz_enforce_download_boost_post"
            boolean r0 = X.AnonymousClass099.A0O(r1, r12, r5)
            r2 = 2952(0xb88, float:4.137E-42)
            if (r0 == 0) goto L_0x0118
            java.lang.String r0 = r4.A09(r2)
            android.net.Uri r3 = android.net.Uri.parse(r0)
        L_0x0118:
            r11 = 3283(0xcd3, float:4.6E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r4, r11)
            if (r0 == 0) goto L_0x016f
            java.lang.String r0 = "|"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.List r1 = X.AnonymousClass099.A0L(r1, r0, r5)
            java.lang.String[] r0 = new java.lang.String[r5]
            java.lang.Object[] r1 = r1.toArray(r0)
            java.lang.String[] r1 = (java.lang.String[]) r1
            int r0 = r1.length
            r13 = 1
            if (r0 == 0) goto L_0x020a
            r1 = r1[r5]
            java.lang.String r0 = "biz_enforce_download_reminder"
            boolean r0 = X.AnonymousClass099.A0O(r1, r0, r5)
            if (r0 == 0) goto L_0x01b4
            int r11 = r1.length()
            r0 = 29
            if (r11 <= r0) goto L_0x01b4
            r0 = 30
        L_0x014c:
            java.lang.String r0 = r1.substring(r0)
            X.AnonymousClass00C.A08(r0)
        L_0x0153:
            int r1 = r0.length()
            if (r1 == 0) goto L_0x016f
            java.lang.String r1 = r4.A09(r2)
            android.net.Uri r1 = android.net.Uri.parse(r1)
            android.net.Uri$Builder r2 = r1.buildUpon()
            java.lang.String r1 = "en_id"
            android.net.Uri$Builder r0 = r2.appendQueryParameter(r1, r0)
            android.net.Uri r3 = r0.build()
        L_0x016f:
            X.AnonymousClass00C.A0B(r3)
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r0, r3)
            X.1iD r0 = new X.1iD
            r0.<init>(r14, r9, r1, r5)
            r10.setOnClickListener(r0)
            r2 = 2131100246(0x7f060256, float:1.7812868E38)
            r0 = 2131231781(0x7f080425, float:1.8079653E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass0BT.A00(r6, r8, r0)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass08I.A01(r0)
            int r0 = r8.getColor(r2)
            X.AnonymousClass076.A06(r1, r0)
            r0 = 2131428555(0x7f0b04cb, float:1.8478758E38)
            android.view.View r2 = X.C012005e.A02(r7, r0)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r2.setImageDrawable(r1)
            r1 = 11
            X.1iF r0 = new X.1iF
            r0.<init>((java.lang.Object) r14, (int) r1)
            r2.setOnClickListener(r0)
            r7.setVisibility(r5)
            r0 = 1
            r14.A00(r0)
            return
        L_0x01b4:
            boolean r0 = X.AnonymousClass099.A0O(r1, r12, r5)
            if (r0 == 0) goto L_0x01c5
            int r11 = r1.length()
            r0 = 31
            if (r11 <= r0) goto L_0x01c5
            r0 = 32
            goto L_0x014c
        L_0x01c5:
            java.lang.String r0 = "biz_enforce_download_create"
            boolean r0 = X.AnonymousClass099.A0O(r1, r0, r5)
            if (r0 == 0) goto L_0x01d9
            int r11 = r1.length()
            r0 = 27
            if (r11 <= r0) goto L_0x01d9
            r0 = 28
            goto L_0x014c
        L_0x01d9:
            java.lang.String r0 = "biz_enforce_download"
            boolean r0 = X.AnonymousClass099.A0O(r1, r0, r5)
            if (r0 == 0) goto L_0x020a
            int r11 = r1.length()
            r0 = 20
            if (r11 <= r0) goto L_0x020a
            java.util.List r0 = X.C33591fc.A02
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x020a
            java.lang.String r0 = "_"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.List r1 = X.AnonymousClass099.A0L(r1, r0, r5)
            int r0 = r1.size()
            int r0 = r0 - r13
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x016f
            goto L_0x0153
        L_0x020a:
            java.lang.String r0 = ""
            goto L_0x0153
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33931gA.BwS():void");
    }
}
