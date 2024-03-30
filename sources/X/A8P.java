package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

public class A8P implements C24791Du {
    public final AnonymousClass17Y A00;
    public final C32691e2 A01;
    public final AnonymousClass185 A02;
    public final C21060yb A03;
    public final C18820ts A04;
    public final AnonymousClass1DW A05;
    public final C20810yC A06;
    public final C24631De A07;
    public final AnonymousClass1EU A08;
    public final C29151Vn A09;
    public final C19770wU A0A;
    public final C24801Dv A0B;
    public final C19970wo A0C;
    public final AnonymousClass1EZ A0D;
    public final C24611Dc A0E = C165607th.A0c("PaymentActivityLauncher", "infra");

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        if (r4.A08.A07.A00.A09(X.C21100yf.A0g) == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.Intent A01(android.content.Context r5, boolean r6, boolean r7) {
        /*
            r4 = this;
            r2 = 1
            if (r7 != 0) goto L_0x0015
            if (r6 != 0) goto L_0x0014
            X.1EU r0 = r4.A08
            X.1EV r0 = r0.A07
            X.0yf r1 = r0.A00
            X.0yi r0 = X.C21100yf.A0g
            boolean r0 = r1.A09(r0)
            r6 = 0
            if (r0 != 0) goto L_0x0015
        L_0x0014:
            r6 = 1
        L_0x0015:
            java.lang.String r3 = "extra_setup_mode"
            X.1EZ r1 = r4.A0D
            boolean r0 = r1.A0C()
            if (r6 != 0) goto L_0x0049
            if (r0 != 0) goto L_0x006d
            boolean r0 = r1.A0F()
            if (r0 != 0) goto L_0x006d
            X.1EU r1 = r4.A08
            X.B66 r0 = r1.A05()
            boolean r0 = r0.B2P()
            if (r0 != 0) goto L_0x006d
            X.B66 r0 = r1.A05()
            java.lang.Class r0 = r0.B8B()
            android.content.Intent r1 = X.C36441kJ.A0H(r5, r0)
            r0 = 2
            r1.putExtra(r3, r0)
        L_0x0043:
            java.lang.String r0 = "extra_is_pay_money_only"
            r1.putExtra(r0, r6)
            return r1
        L_0x0049:
            if (r0 != 0) goto L_0x006d
            boolean r0 = r1.A0E()
            if (r0 != 0) goto L_0x006d
            X.1EU r1 = r4.A08
            X.B66 r0 = r1.A05()
            boolean r0 = r0.B2P()
            if (r0 != 0) goto L_0x006d
            X.B66 r0 = r1.A05()
            java.lang.Class r0 = r0.B8B()
            android.content.Intent r1 = X.C36441kJ.A0H(r5, r0)
            r1.putExtra(r3, r2)
            goto L_0x0043
        L_0x006d:
            X.1EU r0 = r4.A08
            X.B66 r0 = r0.A05()
            java.lang.Class r0 = r0.BHH()
            android.content.Intent r1 = X.C36441kJ.A0H(r5, r0)
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A8P.A01(android.content.Context, boolean, boolean):android.content.Intent");
    }

    public void Bp7(Context context, Uri uri, AnonymousClass3T1 r15) {
        String str;
        if (uri == null) {
            this.A0E.A05("start-activity/uri-is-null");
            return;
        }
        C135086c7 A0P = C165617ti.A0P(C146356vT.A00(), String.class, uri.getLastPathSegment(), "paymentHandle");
        if ("wapay".equals(uri.getScheme()) && !C202349ld.A02(A0P)) {
            UserJid userJid = null;
            if (r15 != null) {
                C64933Qa r1 = r15.A1J;
                if (!r1.A02) {
                    userJid = C36401kF.A0b(r1.A00);
                }
            }
            Intent A012 = A01(context, false, true);
            A012.putExtra("extra_payment_handle", A0P);
            A012.putExtra("verify-vpa-in-background", true);
            A012.putExtra("referral_screen", "vpa_handle_chat");
            if (userJid != null) {
                str = userJid.getRawString();
            } else {
                str = "";
            }
            A012.putExtra("extra_chat_jid", str);
            this.A0B.A06(context, A012);
            if (r15 != null) {
                long A002 = C19970wo.A00(this.A0C);
                String str2 = (String) A0P.A00;
                C64933Qa r7 = r15.A1J;
                AnonymousClass3L0 A013 = this.A02.A01(C36401kF.A0b(r7.A00));
                if (this.A06.A0E(4288) && !r7.A02 && A013 != null) {
                    if ((A013.A01() || A013.A02()) && !TextUtils.isEmpty(str2)) {
                        this.A0A.Boy(new AVm(this, A013, r7, str2, 0, A002));
                    }
                }
            }
        } else if ("upi".equals(uri.getScheme())) {
            this.A01.Bp7(context, uri, r15);
        } else if (this.A05.A0C(uri) == 21) {
            Class BFo = this.A08.A05().BFo();
            if (BFo != null) {
                Intent A0D2 = C36431kI.A0D();
                A0D2.setClassName(context.getPackageName(), BFo.getName());
                A0D2.setData(uri);
                this.A0B.A06(context, A0D2);
            }
        } else {
            this.A0E.A05("start-activity/uri-is-not-wapay-compatible");
            this.A00.A06(R.string.f12nameremoved, 0);
        }
    }

    public void Bp8(Context context, Uri uri, AnonymousClass3T1 r3, int i) {
    }

    public void Bp9(Context context, Uri uri, AnonymousClass3T1 r3, int i, int i2) {
    }

    public Intent A00(Context context, String str, int i) {
        Class BFM = this.A08.A05().BFM();
        if (BFM == null) {
            return null;
        }
        Intent A0H = C36441kJ.A0H(context, BFM);
        A0H.putExtra("extra_quick_launch_option", i);
        A0H.putExtra("extra_quick_launch_action", str);
        return A0H;
    }

    public A8P(C24801Dv r3, AnonymousClass17Y r4, C32691e2 r5, AnonymousClass185 r6, C21060yb r7, C19970wo r8, C18820ts r9, AnonymousClass1DW r10, C20810yC r11, AnonymousClass1EZ r12, C24631De r13, AnonymousClass1EU r14, C29151Vn r15, C19770wU r16) {
        this.A0C = r8;
        this.A06 = r11;
        this.A00 = r4;
        this.A0A = r16;
        this.A01 = r5;
        this.A0B = r3;
        this.A04 = r9;
        this.A05 = r10;
        this.A03 = r7;
        this.A08 = r14;
        this.A0D = r12;
        this.A02 = r6;
        this.A07 = r13;
        this.A09 = r15;
    }
}
