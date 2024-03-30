package com.whatsapp.payments.ui.viewmodel;

import X.AE0;
import X.AF7;
import X.AnonymousClass000;
import X.AnonymousClass16T;
import X.AnonymousClass16U;
import X.AnonymousClass16V;
import X.AnonymousClass16W;
import X.AnonymousClass1DW;
import X.AnonymousClass1EU;
import X.AnonymousClass1EZ;
import X.AnonymousClass1XC;
import X.AnonymousClass9I3;
import X.B8B;
import X.C001700s;
import X.C165607th;
import X.C167677yY;
import X.C18820ts;
import X.C19770wU;
import X.C199509fQ;
import X.C19970wo;
import X.C200169gl;
import X.C201479jg;
import X.C202219lH;
import X.C20810yC;
import X.C24601Db;
import X.C24611Dc;
import X.C24881Ed;
import X.C29011Uz;
import X.C36341k9;
import X.C36431kI;
import X.C90484aE;
import X.C90514aH;
import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.R;
import java.util.concurrent.TimeUnit;

public class IndiaPaymentSettingsViewModel extends C167677yY {
    public static final long A0D = TimeUnit.MINUTES.toMillis(15);
    public static final long A0E;
    public static final long A0F;
    public static final long A0G;
    public final C001700s A00 = C36431kI.A0S();
    public final C001700s A01 = C36431kI.A0S();
    public final C24881Ed A02;
    public final C20810yC A03;
    public final AE0 A04;
    public final AnonymousClass1EZ A05;
    public final AnonymousClass1XC A06;
    public final AnonymousClass9I3 A07;
    public final C200169gl A08;
    public final C29011Uz A09;
    public final C19770wU A0A;
    public final AnonymousClass16T A0B;
    public final C24611Dc A0C = C165607th.A0a("IndiaPaymentSettingsViewModel");

    public IndiaPaymentSettingsViewModel(C19970wo r10, C18820ts r11, C24881Ed r12, AnonymousClass16T r13, AnonymousClass1DW r14, C20810yC r15, AE0 ae0, AnonymousClass1EZ r17, C24601Db r18, AnonymousClass1EU r19, AnonymousClass1XC r20, AF7 af7, AnonymousClass9I3 r22, C200169gl r23, C29011Uz r24, C19770wU r25) {
        super(r10, r11, r14, r15, r18, r19, af7);
        this.A03 = r15;
        this.A0A = r25;
        this.A05 = r17;
        this.A09 = r24;
        this.A0B = r13;
        this.A07 = r22;
        this.A02 = r12;
        this.A06 = r20;
        this.A04 = ae0;
        this.A08 = r23;
    }

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        A0G = timeUnit.toMillis(90);
        A0F = timeUnit.toMillis(30);
        TimeUnit timeUnit2 = TimeUnit.DAYS;
        A0E = C90484aE.A0K(timeUnit);
    }

    public C201479jg A0S() {
        int i;
        C202219lH r9;
        C202219lH r8;
        C202219lH r7;
        C199509fQ r5;
        int i2;
        switch (A0c()) {
            case 1:
                i = R.id.payment_nux_view;
                r7 = C167677yY.A01(R.string.f12nameremoved);
                r8 = C202219lH.A05;
                r9 = C167677yY.A01(R.string.f12nameremoved);
                r5 = new C199509fQ(R.drawable.ic_resume_onboarding_banner);
                i2 = 10;
                break;
            case 2:
                AnonymousClass16U A012 = this.A0B.A01("INR");
                C202219lH A013 = C167677yY.A01(R.string.f12nameremoved);
                C202219lH r82 = C202219lH.A05;
                Object[] objArr = new Object[1];
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append(((AnonymousClass16V) A012).A03);
                A0u.append(((AnonymousClass16W) A012).A01.A00.intValue());
                C90514aH.A1Q(A0u, objArr, 0);
                return new C201479jg(new C199509fQ(R.drawable.ic_settings_quick_tip), new B8B(this, 8), A013, r82, new C202219lH((String) null, objArr, R.string.f12nameremoved, 0), R.id.payment_nux_view, 0, 0, 0, 0);
            case 4:
                i = R.id.payment_nux_view;
                r7 = C167677yY.A01(R.string.f12nameremoved);
                r8 = C167677yY.A01(R.string.f12nameremoved);
                r9 = new C202219lH("https://faq.whatsapp.com/general/payments/about-using-your-mobile-number-as-your-UPI-number", new Object[]{"learn-more"}, R.string.f12nameremoved, 0);
                r5 = new C199509fQ(-1, R.drawable.vec_add_upi_number_banner, R.dimen.f7nameremoved, R.dimen.f7nameremoved);
                i2 = 7;
                break;
            case 5:
                i = R.id.payment_nux_view;
                r7 = C167677yY.A01(R.string.f12nameremoved);
                r8 = C202219lH.A05;
                r9 = C167677yY.A01(R.string.f12nameremoved);
                r5 = new C199509fQ(R.drawable.ic_payments_recover_in);
                i2 = 2;
                break;
            case 6:
                i = R.id.payment_nux_view;
                boolean A0D2 = this.A05.A0D();
                int i3 = R.string.f12nameremoved;
                if (A0D2) {
                    i3 = R.string.f12nameremoved;
                }
                r7 = C167677yY.A01(i3);
                r8 = C202219lH.A05;
                r9 = C167677yY.A01(R.string.f12nameremoved);
                r5 = new C199509fQ(-1, R.drawable.ic_scan_to_pay_banner, R.dimen.f7nameremoved, R.dimen.f7nameremoved);
                i2 = 5;
                break;
            case 7:
                i = R.id.payment_nux_view;
                r7 = C167677yY.A01(R.string.f12nameremoved);
                r8 = C202219lH.A05;
                r9 = C167677yY.A01(R.string.f12nameremoved);
                r5 = new C199509fQ(R.drawable.ic_hero_pin_primer);
                i2 = 4;
                break;
            case 8:
                i = R.id.payment_nux_view;
                r7 = C167677yY.A01(R.string.f12nameremoved);
                r8 = C202219lH.A05;
                r9 = C167677yY.A01(R.string.f12nameremoved);
                r5 = new C199509fQ(R.drawable.ic_doublelock_green);
                i2 = 3;
                break;
            case 9:
                return new C201479jg(new C199509fQ(-1, R.drawable.ic_hero_payments_tos, R.dimen.f7nameremoved, R.dimen.f7nameremoved), new C199509fQ(-1, R.drawable.ic_video_play, 0, 0), new C199509fQ(-1, R.drawable.ic_settings_roaming, 0, 0), new B8B(this, 9), C167677yY.A01(R.string.f12nameremoved), C202219lH.A05, C167677yY.A01(R.string.f12nameremoved), R.id.payment_nux_view, 0, 0, 0, 0, 0);
            case 10:
                i = R.id.payment_nux_view;
                r7 = C167677yY.A01(R.string.f12nameremoved);
                r8 = C167677yY.A01(R.string.f12nameremoved);
                r9 = C167677yY.A01(R.string.f12nameremoved);
                r5 = new C199509fQ(-1, R.drawable.vec_ic_payments_vector_value_props, R.dimen.f7nameremoved, R.dimen.f7nameremoved);
                i2 = 1;
                break;
            case 11:
                i = R.id.payment_nux_view;
                r7 = C167677yY.A01(R.string.f12nameremoved);
                r8 = C202219lH.A05;
                r9 = C167677yY.A01(R.string.f12nameremoved);
                r5 = new C199509fQ(-1, R.drawable.vec_ic_explore_merchants_banner, R.dimen.f7nameremoved, R.dimen.f7nameremoved);
                i2 = 6;
                break;
            default:
                return new C201479jg(0);
        }
        return new C201479jg(r5, new B8B(this, i2), r7, r8, r9, i, 0, 0, 0, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0080, code lost:
        if (r15.A05.A0D() != false) goto L_0x0082;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A0c() {
        /*
            r15 = this;
            X.1Db r6 = r15.A07
            android.content.SharedPreferences r1 = r6.A03()
            java.lang.String r0 = "payments_home_explore_merchsnts_banner_dismissed"
            boolean r0 = X.C36371kC.A1U(r1, r0)
            if (r0 != 0) goto L_0x002b
            X.0yC r1 = r15.A03
            r0 = 5702(0x1646, float:7.99E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x0028
            r0 = 6088(0x17c8, float:8.531E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x002b
            X.1EZ r0 = r15.A05
            boolean r0 = r0.A0D()
            if (r0 == 0) goto L_0x002b
        L_0x0028:
            r1 = 11
        L_0x002a:
            return r1
        L_0x002b:
            X.0yC r7 = r15.A03
            r0 = 1644(0x66c, float:2.304E-42)
            boolean r0 = r7.A0E(r0)
            if (r0 == 0) goto L_0x0047
            X.AE0 r2 = r15.A04
            java.lang.String r1 = r2.A0B()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00b0
            boolean r0 = X.AE0.A05(r2, r1)
            if (r0 == 0) goto L_0x00b0
        L_0x0047:
            r0 = 5260(0x148c, float:7.371E-42)
            boolean r0 = r7.A0E(r0)
            if (r0 == 0) goto L_0x0065
            android.content.SharedPreferences r1 = r6.A03()
            java.lang.String r0 = "payment_upi_warm_welcme_banner_dismissed_state"
            boolean r0 = X.C36371kC.A1U(r1, r0)
            if (r0 != 0) goto L_0x0065
            X.1EZ r0 = r15.A05
            boolean r0 = r0.A0D()
            r1 = 10
            if (r0 == 0) goto L_0x002a
        L_0x0065:
            r0 = 2319(0x90f, float:3.25E-42)
            boolean r0 = r7.A0E(r0)
            if (r0 == 0) goto L_0x0082
            android.content.SharedPreferences r1 = r6.A03()
            java.lang.String r0 = "payments_home_scan_to_pay_banner_dismissed"
            boolean r0 = X.C36371kC.A1U(r1, r0)
            if (r0 != 0) goto L_0x0082
            X.1EZ r0 = r15.A05
            boolean r1 = r0.A0D()
            r0 = 1
            if (r1 == 0) goto L_0x0083
        L_0x0082:
            r0 = 0
        L_0x0083:
            r14 = 6
            if (r0 != 0) goto L_0x0269
            java.util.List r0 = r15.A02
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00be
            java.util.List r0 = r15.A04
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00be
            java.util.List r0 = r15.A03
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00be
            X.9I3 r0 = r15.A07
            X.1Db r0 = r0.A01
            android.content.SharedPreferences r1 = r0.A03()
            java.lang.String r0 = "settingsQuickTipDismissedState"
            boolean r0 = X.C36371kC.A1U(r1, r0)
            if (r0 != 0) goto L_0x00be
            r1 = 2
            return r1
        L_0x00b0:
            android.content.SharedPreferences r1 = r6.A03()
            java.lang.String r0 = "payment_account_recovered"
            boolean r0 = X.C36371kC.A1U(r1, r0)
            r1 = 5
            if (r0 != 0) goto L_0x002a
            goto L_0x0047
        L_0x00be:
            X.1EZ r2 = r15.A05
            boolean r0 = r2.A0D()
            if (r0 == 0) goto L_0x00e8
            X.AE0 r0 = r15.A04
            java.lang.String r0 = r0.A0B()
            boolean r0 = X.C64073Mn.A00(r7, r0)
            if (r0 == 0) goto L_0x00e8
            X.9gl r0 = r15.A08
            boolean r0 = r0.A07()
            if (r0 != 0) goto L_0x00e8
            android.content.SharedPreferences r1 = r6.A03()
            java.lang.String r0 = "payments_home_add_upi_number_banner_dismissed"
            boolean r0 = X.C36371kC.A1U(r1, r0)
            if (r0 != 0) goto L_0x00e8
            r1 = 4
            return r1
        L_0x00e8:
            android.content.SharedPreferences r1 = r6.A03()
            java.lang.String r0 = "payments_home_onboarding_banner_dismissed"
            r3 = 0
            boolean r0 = r1.getBoolean(r0, r3)
            if (r0 != 0) goto L_0x0109
            android.content.SharedPreferences r1 = r6.A03()
            java.lang.String r0 = "payments_resume_onboarding_banner_started"
            boolean r0 = r1.getBoolean(r0, r3)
            if (r0 == 0) goto L_0x0109
            boolean r0 = r2.A0D()
            if (r0 != 0) goto L_0x0109
            r1 = 1
            return r1
        L_0x0109:
            X.00s r3 = r15.A01
            java.lang.Object r0 = r3.A04()
            r1 = 1
            if (r0 == 0) goto L_0x011e
            java.lang.Object r0 = r3.A04()
            X.9jg r0 = (X.C201479jg) r0
            int r0 = r0.A01
            if (r0 != r1) goto L_0x011e
            r1 = 3
            return r1
        L_0x011e:
            X.1EU r0 = r15.A08
            X.16S r0 = X.C165617ti.A0O(r0)
            X.9un r0 = r0.A06()
            if (r0 == 0) goto L_0x01a0
            X.8bF r1 = r0.A08
            if (r1 == 0) goto L_0x01a0
            boolean r0 = r1 instanceof X.C175818b6
            if (r0 == 0) goto L_0x01a0
            X.8b6 r1 = (X.C175818b6) r1
        L_0x0134:
            X.1Uz r8 = r15.A09
            java.lang.String r0 = r8.A02()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01b1
            boolean r0 = r2.A0D()
            if (r0 == 0) goto L_0x01b1
            if (r1 == 0) goto L_0x01b1
            X.6c7 r0 = r1.A04
            if (r0 == 0) goto L_0x01b1
            java.lang.Object r0 = r0.A00
            boolean r0 = X.AnonymousClass000.A1X(r0)
            if (r0 != 0) goto L_0x01b1
            X.0wo r0 = r15.A05
            long r4 = X.C19970wo.A00(r0)
            android.content.SharedPreferences r0 = r6.A03()
            java.lang.String r9 = "payments_home_recovery_upin_upsell_banner_display"
            long r12 = X.C36341k9.A0B(r0, r9)
            android.content.SharedPreferences r2 = r6.A03()
            java.lang.String r10 = "payments_home_recovery_upin_upsell_banner_impression"
            r0 = 10
            long r2 = r2.getLong(r10, r0)
            r0 = 0
            int r11 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r11 == 0) goto L_0x017c
            int r11 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r11 >= 0) goto L_0x01a2
        L_0x017c:
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r11 <= 0) goto L_0x01a2
            android.content.SharedPreferences r7 = r6.A03()
            java.lang.String r8 = "payments_home_recovery_upin_upsell_banner_impression_update_timestamp"
            long r11 = r7.getLong(r8, r0)
            int r7 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x0195
            long r0 = A0E
            long r11 = r11 + r0
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x019e
        L_0x0195:
            r0 = 1
            long r2 = r2 - r0
            X.C167677yY.A02(r6, r10, r2)
            X.C167677yY.A02(r6, r8, r4)
        L_0x019e:
            r1 = 7
            return r1
        L_0x01a0:
            r1 = 0
            goto L_0x0134
        L_0x01a2:
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r11 > 0) goto L_0x01b1
            r0 = 10
            X.C167677yY.A02(r6, r10, r0)
            long r0 = A0G
            long r4 = r4 + r0
            X.C167677yY.A02(r6, r9, r4)
        L_0x01b1:
            X.0wo r0 = r15.A05
            long r4 = X.C19970wo.A00(r0)
            java.lang.String r0 = r8.A02()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x023c
            android.content.SharedPreferences r1 = r6.A03()
            java.lang.String r0 = "payments_two_factor_nudge_count"
            int r1 = X.C36371kC.A01(r1, r0)
            r0 = 1124(0x464, float:1.575E-42)
            int r0 = r7.A07(r0)
            if (r1 < r0) goto L_0x023c
            android.content.SharedPreferences r3 = r6.A03()
            java.lang.String r2 = "payments_last_two_factor_nudge_time"
            r0 = 0
            long r8 = r3.getLong(r2, r0)
            long r2 = A0F
            long r8 = r8 + r2
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x023c
            android.content.SharedPreferences r2 = r6.A03()
            java.lang.String r8 = "payments_home_recovery_2fa_upsell_banner_display"
            long r11 = r2.getLong(r8, r0)
            android.content.SharedPreferences r2 = r6.A03()
            java.lang.String r10 = "payments_home_recovery_2fa_upsell_banner_impression"
            r0 = 10
            long r2 = r2.getLong(r10, r0)
            r0 = 0
            int r9 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r9 == 0) goto L_0x0208
            int r9 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r9 >= 0) goto L_0x022d
        L_0x0208:
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 <= 0) goto L_0x022d
            android.content.SharedPreferences r7 = r6.A03()
            java.lang.String r8 = "payments_home_recovery_2fa_upsell_banner_impression_update_timestamp"
            long r11 = r7.getLong(r8, r0)
            int r7 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x0221
            long r0 = A0E
            long r11 = r11 + r0
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x022a
        L_0x0221:
            r0 = 1
            long r2 = r2 - r0
            X.C167677yY.A02(r6, r10, r2)
            X.C167677yY.A02(r6, r8, r4)
        L_0x022a:
            r1 = 8
            return r1
        L_0x022d:
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 > 0) goto L_0x023c
            r0 = 10
            X.C167677yY.A02(r6, r10, r0)
            long r0 = A0G
            long r4 = r4 + r0
            X.C167677yY.A02(r6, r8, r4)
        L_0x023c:
            r0 = 2318(0x90e, float:3.248E-42)
            boolean r0 = r7.A0E(r0)
            if (r0 == 0) goto L_0x0251
            android.content.SharedPreferences r1 = r6.A03()
            java.lang.String r0 = "payments_home_scan_to_pay_banner_dismissed"
            boolean r0 = X.C36371kC.A1U(r1, r0)
            if (r0 != 0) goto L_0x0251
            return r14
        L_0x0251:
            r0 = 3332(0xd04, float:4.669E-42)
            boolean r0 = r7.A0E(r0)
            if (r0 == 0) goto L_0x0267
            android.content.SharedPreferences r1 = r6.A03()
            java.lang.String r0 = "payments_home_upi_video_banner_dismissed"
            boolean r0 = X.C36371kC.A1U(r1, r0)
            r1 = 9
            if (r0 == 0) goto L_0x002a
        L_0x0267:
            r1 = 0
            return r1
        L_0x0269:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel.A0c():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
        if (X.C202699mR.A02(r4, r3.A0B()) != false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
        if (r1.contains(r2) != false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0035, code lost:
        if (X.C36371kC.A1U(r5.A07.A03(), "payment_has_received_upi_mandate_request") != false) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0d() {
        /*
            r5 = this;
            X.0yC r4 = r5.A03
            X.AE0 r3 = r5.A04
            java.lang.String r2 = r3.A0B()
            r0 = 1231(0x4cf, float:1.725E-42)
            boolean r0 = r4.A0E(r0)
            if (r0 == 0) goto L_0x0039
            r0 = 2835(0xb13, float:3.973E-42)
            java.lang.String r1 = r4.A09(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0039
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0039
            boolean r0 = r1.contains(r2)
            if (r0 == 0) goto L_0x0039
        L_0x0028:
            X.1Db r0 = r5.A07
            android.content.SharedPreferences r1 = r0.A03()
            java.lang.String r0 = "payment_has_received_upi_mandate_request"
            boolean r1 = X.C36371kC.A1U(r1, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0038
        L_0x0037:
            r0 = 0
        L_0x0038:
            return r0
        L_0x0039:
            java.lang.String r0 = r3.A0B()
            boolean r0 = X.C202699mR.A02(r4, r0)
            if (r0 == 0) goto L_0x0037
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel.A0d():boolean");
    }

    public void A0a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.A0B.A0C(Uri.parse(str)) == 19) {
            C36341k9.A17(this.A00, 3);
        } else {
            super.A0a(str);
        }
    }
}
