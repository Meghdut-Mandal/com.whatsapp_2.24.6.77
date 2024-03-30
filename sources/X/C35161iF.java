package X;

import android.view.View;

/* renamed from: X.1iF  reason: invalid class name and case insensitive filesystem */
public class C35161iF implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public C35161iF(C33901g7 r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d5, code lost:
        r4.startActivity(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0154, code lost:
        X.C33671fk.A00(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0157, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x021a, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x021b, code lost:
        r2.A01(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x021e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x02d7, code lost:
        r1.putBoolean(r0, r2).apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x02de, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r8) {
        /*
            r7 = this;
            int r0 = r7.A01
            switch(r0) {
                case 0: goto L_0x0079;
                case 1: goto L_0x0082;
                case 2: goto L_0x00e2;
                case 3: goto L_0x0011;
                case 4: goto L_0x0005;
                case 5: goto L_0x0005;
                case 6: goto L_0x0005;
                case 7: goto L_0x0005;
                case 8: goto L_0x00ec;
                case 9: goto L_0x0128;
                case 10: goto L_0x0158;
                case 11: goto L_0x0170;
                case 12: goto L_0x018a;
                case 13: goto L_0x0192;
                case 14: goto L_0x01ea;
                case 15: goto L_0x01fc;
                case 16: goto L_0x0209;
                case 17: goto L_0x021f;
                case 18: goto L_0x0338;
                case 19: goto L_0x035f;
                case 20: goto L_0x0227;
                case 21: goto L_0x0227;
                case 22: goto L_0x0253;
                case 23: goto L_0x026f;
                case 24: goto L_0x0280;
                case 25: goto L_0x0280;
                case 26: goto L_0x00ae;
                case 27: goto L_0x028c;
                case 28: goto L_0x029f;
                case 29: goto L_0x029f;
                case 30: goto L_0x02a7;
                case 31: goto L_0x02a7;
                case 32: goto L_0x0031;
                case 33: goto L_0x02c2;
                case 34: goto L_0x0031;
                case 35: goto L_0x004b;
                case 36: goto L_0x02df;
                case 37: goto L_0x02f1;
                case 38: goto L_0x004b;
                case 39: goto L_0x030b;
                case 40: goto L_0x0321;
                case 41: goto L_0x0321;
                case 42: goto L_0x032f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r7.A00
            X.02t r1 = (X.C006302t) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            r1.invoke(r8)
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r3 = r7.A00
            com.whatsapp.HomeActivity r3 = (com.whatsapp.HomeActivity) r3
            X.1NA r0 = r3.A06
            X.0v0 r0 = r0.A00
            java.lang.String r2 = "bottom_nav_tooltip_seen"
            r1 = 1
            android.content.SharedPreferences$Editor r0 = X.C19420v0.A00(r0)
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r2, r1)
            r0.apply()
            X.1RJ r1 = r3.A1B
            if (r1 == 0) goto L_0x0010
            r0 = 8
            r1.A03(r0)
            return
        L_0x0031:
            java.lang.Object r1 = r7.A00
            X.02E r1 = (X.AnonymousClass02E) r1
            X.01I r0 = r1.A0i()
            boolean r0 = r0 instanceof X.AnonymousClass15M
            if (r0 == 0) goto L_0x0010
            X.01I r1 = r1.A0i()
            X.15M r1 = (X.AnonymousClass15M) r1
            com.whatsapp.HomeActivity r1 = (com.whatsapp.HomeActivity) r1
            java.lang.String r0 = ""
            r1.A3v(r0)
            return
        L_0x004b:
            java.lang.Object r5 = r7.A00
            com.whatsapp.conversationslist.ConversationsFragment r5 = (com.whatsapp.conversationslist.ConversationsFragment) r5
            X.01I r4 = r5.A0h()
            X.1nw r0 = r5.A1J
            if (r0 == 0) goto L_0x0010
            if (r4 == 0) goto L_0x0010
            boolean r0 = r4.isFinishing()
            if (r0 != 0) goto L_0x0010
            boolean r0 = r4 instanceof X.AnonymousClass155
            if (r0 == 0) goto L_0x0010
            X.155 r4 = (X.AnonymousClass155) r4
            X.005 r0 = r5.A32
            java.lang.Object r3 = r0.get()
            X.18z r3 = (X.C235718z) r3
            X.2EQ r2 = X.AnonymousClass2EQ.A00
            X.1cs r1 = new X.1cs
            r1.<init>(r4, r5)
            r0 = 4
            r3.A0A(r4, r2, r1, r0)
            return
        L_0x0079:
            java.lang.Object r1 = r7.A00
            com.whatsapp.HomeActivity r1 = (com.whatsapp.HomeActivity) r1
            r0 = 1
            com.whatsapp.HomeActivity.A15(r1, r0)
            return
        L_0x0082:
            java.lang.Object r4 = r7.A00
            com.whatsapp.HomeActivity r4 = (com.whatsapp.HomeActivity) r4
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.Settings"
            r3.setClassName(r1, r0)
            X.005 r0 = r4.A1T
            java.lang.Object r0 = r0.get()
            X.1eg r0 = (X.C33081eg) r0
            X.0yC r2 = r0.A01
            r1 = 5288(0x14a8, float:7.41E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x00d5
            r0 = 28
            r4.startActivityForResult(r3, r0)
            return
        L_0x00ae:
            java.lang.Object r1 = r7.A00
            X.1i7 r1 = (X.C35081i7) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            r2 = 0
            X.0wD r0 = r1.A02
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x00d9
            android.view.View r0 = r1.A0H
            android.content.Context r4 = r0.getContext()
            android.content.Context r0 = r8.getContext()
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.calling.calllink.view.CallLinkActivity"
            r3.setClassName(r1, r0)
        L_0x00d5:
            r4.startActivity(r3)
            return
        L_0x00d9:
            X.17Y r1 = r1.A01
            r0 = 2131887345(0x7f1204f1, float:1.9409294E38)
            r1.A06(r0, r2)
            return
        L_0x00e2:
            java.lang.Object r0 = r7.A00
            com.whatsapp.HomeActivity r0 = (com.whatsapp.HomeActivity) r0
            com.whatsapp.CircleWaImageView r0 = r0.A0e
            r0.callOnClick()
            return
        L_0x00ec:
            java.lang.Object r4 = r7.A00
            X.1g0 r4 = (X.C33831g0) r4
            android.content.Context r3 = r8.getContext()
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.businessupsell.BusinessAppEducation"
            android.content.Intent r0 = r2.setClassName(r1, r0)
            r3.startActivity(r0)
            X.1fk r4 = r4.A02
            X.0v0 r3 = r4.A00
            X.005 r0 = r3.A00
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r2 = "biz_app_cross_sell_banner_click_count"
            r0 = 0
            int r0 = r1.getInt(r2, r0)
            int r1 = r0 + 1
            android.content.SharedPreferences$Editor r0 = X.C19420v0.A00(r3)
            android.content.SharedPreferences$Editor r0 = r0.putInt(r2, r1)
            r0.apply()
            r0 = 2
            goto L_0x0154
        L_0x0128:
            java.lang.Object r2 = r7.A00
            X.1g0 r2 = (X.C33831g0) r2
            android.view.View r1 = r2.A00
            r0 = 8
            r1.setVisibility(r0)
            X.1fk r4 = r2.A02
            X.0v0 r3 = r4.A00
            X.005 r0 = r3.A00
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r2 = "biz_app_cross_sell_banner_dismiss_count"
            r0 = 0
            int r0 = r1.getInt(r2, r0)
            int r1 = r0 + 1
            android.content.SharedPreferences$Editor r0 = X.C19420v0.A00(r3)
            android.content.SharedPreferences$Editor r0 = r0.putInt(r2, r1)
            r0.apply()
            r0 = 3
        L_0x0154:
            X.C33671fk.A00(r4, r0)
            return
        L_0x0158:
            java.lang.Object r2 = r7.A00
            X.1g9 r2 = (X.C33921g9) r2
            android.view.View r1 = r2.A00
            r0 = 8
            r1.setVisibility(r0)
            X.1g8 r0 = r2.A02
            X.0v0 r0 = r0.A00
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)
            java.lang.String r0 = "biz_shop_sunset_banner_dismissed"
            goto L_0x02d7
        L_0x0170:
            java.lang.Object r2 = r7.A00
            X.1gA r2 = (X.C33931gA) r2
            r0 = 3
            r2.A00(r0)
            android.view.View r1 = r2.A00
            r0 = 8
            r1.setVisibility(r0)
            X.0v0 r0 = r2.A02
            r2 = 0
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)
            java.lang.String r0 = "should_show_smb_enforcement_banner"
            goto L_0x02d7
        L_0x018a:
            java.lang.Object r0 = r7.A00
            X.1fr r0 = (X.C33741fr) r0
            X.C33741fr.A01(r0)
            return
        L_0x0192:
            java.lang.Object r2 = r7.A00
            X.1fr r2 = (X.C33741fr) r2
            X.0yW r1 = r2.A03
            X.2Mu r0 = new X.2Mu
            r0.<init>()
            r1.Blw(r0)
            X.1fa r5 = r2.A01
            r3 = 1
            r0 = 2
            r5.A01(r3, r0)
            X.1eN r0 = r2.A04
            r0.A00(r3)
            X.0v0 r4 = r2.A02
            int r2 = X.C33741fr.A08
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r4)
            java.lang.String r0 = "education_banner_count"
            android.content.SharedPreferences$Editor r0 = r1.putInt(r0, r2)
            r0.apply()
            X.005 r0 = r4.A00
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r2 = "groups_banner_click_count"
            r0 = 0
            int r0 = r1.getInt(r2, r0)
            int r1 = r0 + 1
            android.content.SharedPreferences$Editor r0 = X.C19420v0.A00(r4)
            android.content.SharedPreferences$Editor r0 = r0.putInt(r2, r1)
            r0.apply()
            android.content.Context r0 = r5.getContext()
            android.app.Activity r1 = X.C24801Dv.A00(r0)
            r0 = 0
            android.content.Intent r0 = X.AnonymousClass190.A1O(r1, r0, r3)
            r1.startActivity(r0)
            return
        L_0x01ea:
            java.lang.Object r2 = r7.A00
            X.1g2 r2 = (X.C33851g2) r2
            X.1fh r1 = r2.A02
            android.content.Context r0 = r8.getContext()
            r1.A03(r0)
            X.1fa r2 = r2.A01
            r1 = 23
            goto L_0x021a
        L_0x01fc:
            java.lang.Object r0 = r7.A00
            X.1g2 r0 = (X.C33851g2) r0
            r0.A01()
            X.1fa r2 = r0.A01
            r1 = 23
            r0 = 3
            goto L_0x021b
        L_0x0209:
            java.lang.Object r2 = r7.A00
            X.1g2 r2 = (X.C33851g2) r2
            X.1fh r1 = r2.A02
            android.content.Context r0 = r8.getContext()
            r1.A03(r0)
            X.1fa r2 = r2.A01
            r1 = 16
        L_0x021a:
            r0 = 2
        L_0x021b:
            r2.A01(r1, r0)
            return
        L_0x021f:
            java.lang.Object r0 = r7.A00
            X.1g2 r0 = (X.C33851g2) r0
            r0.A01()
            return
        L_0x0227:
            java.lang.Object r6 = r7.A00
            X.1fz r6 = (X.C33821fz) r6
            X.0v0 r0 = r6.A04
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)
            java.lang.String r0 = "storage_usage_banner_dismissed"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r2)
            r0.apply()
            X.1Dv r5 = r6.A02
            X.1fa r0 = r6.A03
            android.content.Context r4 = r0.getContext()
            r3 = 0
            android.content.Context r2 = r0.getContext()
            java.lang.String r1 = r6.A01
            r0 = 3
            android.content.Intent r0 = X.AnonymousClass190.A1F(r2, r1, r3, r0)
            r5.A06(r4, r0)
            return
        L_0x0253:
            java.lang.Object r3 = r7.A00
            X.1fz r3 = (X.C33821fz) r3
            X.0v0 r0 = r3.A04
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)
            java.lang.String r0 = "storage_usage_banner_dismissed"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r2)
            r0.apply()
            android.view.View r1 = r3.A00
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x026f:
            java.lang.Object r2 = r7.A00
            X.1fw r2 = (X.C33791fw) r2
            X.1fv r1 = r2.A03
            r0 = 3
            X.C33781fv.A00(r1, r0)
            X.C33791fw.A00(r2)
            r2.BK9()
            return
        L_0x0280:
            java.lang.Object r1 = r7.A00
            X.00S r1 = (X.AnonymousClass00S) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            r1.invoke()
            return
        L_0x028c:
            java.lang.Object r0 = r7.A00
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2 r0 = (com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2) r0
            X.1dt r2 = r0.A0B
            X.01I r1 = r0.A0i()
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A01(r1, r0)
            return
        L_0x029f:
            java.lang.Object r0 = r7.A00
            X.6YL r0 = (X.AnonymousClass6YL) r0
            r0.A0N()
            return
        L_0x02a7:
            java.lang.Object r2 = r7.A00
            X.1fA r2 = (X.C33341fA) r2
            r0 = 1
            X.2RI r1 = new X.2RI
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A04 = r0
            X.0yW r0 = r2.A07
            r0.Bly(r1)
            com.whatsapp.conversationslist.ConversationsFragment r0 = r2.A06
            r0.A1g()
            return
        L_0x02c2:
            java.lang.Object r2 = r7.A00
            com.whatsapp.conversationslist.ConversationsFragment r2 = (com.whatsapp.conversationslist.ConversationsFragment) r2
            X.4fA r1 = r2.A1X
            if (r1 == 0) goto L_0x02ce
            r0 = 1
            r1.setSuggestionsVisibility(r0)
        L_0x02ce:
            X.0v0 r0 = r2.A1h
            r2 = 0
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)
            java.lang.String r0 = "is_chat_list_suggestions_dismissed"
        L_0x02d7:
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r2)
            r0.apply()
            return
        L_0x02df:
            java.lang.Object r3 = r7.A00
            X.02E r3 = (X.AnonymousClass02E) r3
            X.01I r2 = r3.A0h()
            r1 = 1
            r0 = 0
            android.content.Intent r0 = X.AnonymousClass190.A1E(r2, r0, r0, r1)
            r3.A1C(r0)
            return
        L_0x02f1:
            java.lang.Object r3 = r7.A00
            X.02E r3 = (X.AnonymousClass02E) r3
            android.content.Context r0 = r3.A0a()
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.conversationslist.ArchivedConversationsActivity"
            r2.setClassName(r1, r0)
            r3.A1C(r2)
            return
        L_0x030b:
            java.lang.Object r0 = r7.A00
            X.1gf r0 = (X.C34231gf) r0
            com.whatsapp.conversationslist.ConversationsFragment r2 = r0.A08
            androidx.recyclerview.widget.RecyclerView r0 = r2.A0G
            X.0CZ r0 = r0.A0G
            X.4ma r0 = (X.C95974ma) r0
            r1 = 0
            r0.A0L(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r2.A0G
            r0.A0i(r1)
            return
        L_0x0321:
            java.lang.Object r1 = r7.A00
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            boolean r0 = r1.isChecked()
            r0 = r0 ^ 1
            r1.setChecked(r0)
            return
        L_0x032f:
            java.lang.Object r1 = r7.A00
            X.1T3 r1 = (X.AnonymousClass1T3) r1
            r0 = 0
            r1.Bl5(r0)
            return
        L_0x0338:
            java.lang.Object r4 = r7.A00
            X.1g7 r4 = (X.C33901g7) r4
            X.1fa r0 = r4.A02
            android.content.Context r3 = r0.getContext()
            X.1cW r1 = r4.A04
            X.0wo r0 = r4.A03
            com.whatsapp.softenforcementsmb.SMBSoftEnforcementEducationFragment r2 = new com.whatsapp.softenforcementsmb.SMBSoftEnforcementEducationFragment
            r2.<init>(r3, r0, r1)
            X.01z r1 = r4.A01
            java.lang.String r0 = "SMBSoftEnforcementEducation"
            r2.A1f(r1, r0)
            X.2S0 r0 = new X.2S0
            r0.<init>()
            java.lang.String r1 = "source"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x035f:
            java.lang.Object r0 = r7.A00
            X.1g7 r0 = (X.C33901g7) r0
            android.view.View r1 = r0.A00
            r0 = 8
            r1.setVisibility(r0)
            X.2S0 r0 = new X.2S0
            r0.<init>()
            java.lang.String r1 = "source"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35161iF.onClick(android.view.View):void");
    }

    public C35161iF(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
