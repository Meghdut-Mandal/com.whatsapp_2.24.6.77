package com.whatsapp.registration.deviceswitching;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass155;
import X.AnonymousClass190;
import X.AnonymousClass1X8;
import X.AnonymousClass3TX;
import X.C18800tq;
import X.C18830tt;
import X.C19630wG;
import X.C21520zN;
import X.C23045B1q;
import X.C27111My;
import X.C29501Ww;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C36401kF;
import X.C36431kI;
import X.C62623Gw;
import X.C89364Wg;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;

public final class DeviceSwitchingSelfServeEducationScreen extends AnonymousClass155 implements C23045B1q {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public WaTextView A05;
    public C19630wG A06;
    public C21520zN A07;
    public C62623Gw A08;
    public C29501Ww A09;
    public AnonymousClass1X8 A0A;
    public AnonymousClass3TX A0B;
    public WDSButton A0C;
    public WDSButton A0D;
    public String A0E;
    public String A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public WaTextView A0K;
    public boolean A0L;

    public void BmG() {
        this.A0J = false;
        if (this.A0I) {
            A07();
        } else {
            A01();
        }
    }

    public void Bus() {
        this.A0J = true;
        if (this.A0I) {
            A07();
        } else {
            A01();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00dc, code lost:
        if (r2.length() == 0) goto L_0x00de;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r16) {
        /*
            r15 = this;
            r9 = r15
            r0 = r16
            super.onCreate(r0)
            X.C36331k8.A0n(r15)
            r0 = 2131624808(0x7f0e0368, float:1.8876806E38)
            r15.setContentView((int) r0)
            android.os.Bundle r0 = X.C36371kC.A0H(r15)
            r12 = 0
            if (r0 == 0) goto L_0x0061
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r0 = "change_number"
            boolean r0 = r1.getBooleanExtra(r0, r12)
            r15.A0G = r0
            android.content.Intent r2 = r15.getIntent()
            r1 = -1
            java.lang.String r0 = "flash_type"
            int r0 = r2.getIntExtra(r0, r1)
            r15.A00 = r0
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r0 = "sms_retry_time"
            r2 = 0
            long r0 = r1.getLongExtra(r0, r2)
            r15.A02 = r0
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r0 = "voice_retry_time"
            long r0 = r1.getLongExtra(r0, r2)
            r15.A03 = r0
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r0 = "wa_old_retry_time"
            long r0 = r1.getLongExtra(r0, r2)
            r15.A04 = r0
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r0 = "email_otp_retry_time"
            long r0 = r1.getLongExtra(r0, r2)
            r15.A01 = r0
        L_0x0061:
            X.3TX r1 = r15.A0B
            if (r1 == 0) goto L_0x0181
            java.lang.String r0 = "wa_old_self_serve"
            r1.A04(r0)
            X.0zN r1 = r15.A07
            if (r1 == 0) goto L_0x017a
            r0 = 3902(0xf3e, float:5.468E-42)
            boolean r0 = r1.A0E(r0)
            r15.A0H = r0
            X.0ts r10 = r15.A00
            android.view.View r8 = r15.A00
            r11 = 2131434753(0x7f0b1d01, float:1.8491329E38)
            r13 = 1
            r14 = 0
            X.C65983Uf.A0M(r8, r9, r10, r11, r12, r13, r14)
            android.view.View r1 = r15.A00
            r0 = 2131434453(0x7f0b1bd5, float:1.849072E38)
            com.whatsapp.WaTextView r0 = X.C36341k9.A0Q(r1, r0)
            r15.A05 = r0
            android.view.View r1 = r15.A00
            r0 = 2131434754(0x7f0b1d02, float:1.849133E38)
            r7 = 2131434754(0x7f0b1d02, float:1.849133E38)
            com.whatsapp.WaTextView r0 = X.C36341k9.A0Q(r1, r0)
            r15.A0K = r0
            android.view.View r1 = r15.A00
            r0 = 2131429176(0x7f0b0738, float:1.8480017E38)
            android.view.View r0 = X.C36361kB.A0G(r1, r0)
            com.whatsapp.wds.components.button.WDSButton r0 = (com.whatsapp.wds.components.button.WDSButton) r0
            r15.A0C = r0
            android.view.View r1 = r15.A00
            r0 = 2131435083(0x7f0b1e4b, float:1.8491998E38)
            android.view.View r0 = X.C36361kB.A0G(r1, r0)
            com.whatsapp.wds.components.button.WDSButton r0 = (com.whatsapp.wds.components.button.WDSButton) r0
            r15.A0D = r0
            X.0v0 r0 = r15.A09
            java.lang.String r0 = r0.A0f()
            r15.A0E = r0
            X.0v0 r0 = r15.A09
            java.lang.String r2 = r0.A0h()
            r15.A0F = r2
            com.whatsapp.WaTextView r8 = r15.A0K
            if (r8 != 0) goto L_0x00d0
            java.lang.String r0 = "activityTitle"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00d0:
            r6 = 2131895622(0x7f122546, float:1.9426082E38)
            java.lang.Object[] r5 = new java.lang.Object[r13]
            if (r2 == 0) goto L_0x00de
            int r1 = r2.length()
            r0 = 0
            if (r1 != 0) goto L_0x00df
        L_0x00de:
            r0 = 1
        L_0x00df:
            r4 = 0
            if (r0 != 0) goto L_0x0103
            java.lang.String r1 = r15.A0E
            if (r1 == 0) goto L_0x0103
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0103
            X.0ts r3 = r15.A00
            java.lang.String r2 = X.C65983Uf.A0E(r1, r2)
            if (r2 == 0) goto L_0x00ff
            r1 = 32
            r0 = 160(0xa0, float:2.24E-43)
            java.lang.String r4 = r2.replace(r1, r0)
            X.AnonymousClass00C.A08(r4)
        L_0x00ff:
            java.lang.String r4 = r3.A0H(r4)
        L_0x0103:
            r5[r12] = r4
            X.C36341k9.A0s(r15, r8, r5, r6)
            X.0zN r0 = r15.A07
            if (r0 == 0) goto L_0x0173
            X.C65983Uf.A0O(r15, r0, r7)
            com.whatsapp.WaTextView r3 = r15.A05
            if (r3 != 0) goto L_0x011a
            java.lang.String r0 = "description"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x011a:
            r2 = 2131895623(0x7f122547, float:1.9426084E38)
            java.lang.Object[] r1 = new java.lang.Object[r13]
            int r0 = X.C36391kE.A04(r15)
            java.lang.String r0 = X.AnonymousClass14B.A03(r15, r0)
            java.lang.String r0 = X.C36391kE.A0v(r15, r0, r1, r12, r2)
            android.text.Spanned r0 = X.C05480Pw.A00(r0)
            r3.setText(r0)
            X.0zN r1 = r15.A07
            if (r1 == 0) goto L_0x016c
            r0 = 6608(0x19d0, float:9.26E-42)
            boolean r0 = r1.A0E(r0)
            java.lang.String r2 = "continueButton"
            if (r0 == 0) goto L_0x014f
            com.whatsapp.wds.components.button.WDSButton r1 = r15.A0C
            if (r1 != 0) goto L_0x0149
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x0149:
            r0 = 2131894000(0x7f121ef0, float:1.9422792E38)
            r1.setText(r0)
        L_0x014f:
            com.whatsapp.wds.components.button.WDSButton r1 = r15.A0C
            if (r1 != 0) goto L_0x0158
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x0158:
            r0 = 2
            X.C67133Yq.A00(r1, r15, r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r15.A0D
            if (r1 != 0) goto L_0x0167
            java.lang.String r0 = "verifyAnotherWayButton"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0167:
            r0 = 3
            X.C67133Yq.A00(r1, r15, r0)
            return
        L_0x016c:
            java.lang.String r0 = "abPreChatdProps"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0173:
            java.lang.String r0 = "abPreChatdProps"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x017a:
            java.lang.String r0 = "abPreChatdProps"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0181:
            java.lang.String r0 = "funnelLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.deviceswitching.DeviceSwitchingSelfServeEducationScreen.onCreate(android.os.Bundle):void");
    }

    private final void A07() {
        Log.i("DeviceSwitchingSelfServeEducationScreen/startVerifyVoice");
        C29501Ww r2 = this.A09;
        if (r2 != null) {
            C29501Ww.A02(r2, 5, true);
            this.A01.A06(this, AnonymousClass190.A0O(this, this.A02, this.A03, this.A0J, this.A0G));
            finish();
            return;
        }
        throw C36331k8.A0d("registrationManager");
    }

    public void A2F() {
        if (!this.A0L) {
            this.A0L = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r2 = A0L2.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A06 = C36351kA.A0W(r2);
            this.A0B = C36431kI.A0u(r1);
            this.A07 = C36401kF.A0Y(r2);
            this.A08 = C27111My.A38(A0L2);
            this.A09 = C36401kF.A0d(r2);
            this.A0A = C36391kE.A0o(r2);
        }
    }

    public void onBackPressed() {
        Intent A0B2;
        AnonymousClass3TX r2 = this.A0B;
        if (r2 != null) {
            r2.A08("wa_old_self_serve", "back");
            if (this.A0G) {
                Log.i("DeviceSwitchingSelfServeEducationScreen/returnToEnterPhoneNumber/change number flow");
                C29501Ww r22 = this.A09;
                if (r22 != null) {
                    C29501Ww.A02(r22, 3, true);
                    C29501Ww r0 = this.A09;
                    if (r0 != null) {
                        if (!r0.A0F()) {
                            finish();
                        }
                        A0B2 = AnonymousClass190.A00(this);
                    } else {
                        throw C36331k8.A0d("registrationManager");
                    }
                } else {
                    throw C36331k8.A0d("registrationManager");
                }
            } else {
                Log.i("DeviceSwitchingSelfServeEducationScreen/returnToEnterPhoneNumber/reg flow");
                C29501Ww r02 = this.A09;
                if (r02 != null) {
                    C29501Ww.A02(r02, 1, true);
                    A0B2 = AnonymousClass190.A0B(this);
                    AnonymousClass00C.A08(A0B2);
                    A0B2.putExtra("com.whatsapp.registration.RegisterPhone.clear_phone_number", true);
                } else {
                    throw C36331k8.A0d("registrationManager");
                }
            }
            this.A01.A06(this, A0B2);
            finish();
            return;
        }
        throw C36331k8.A0d("funnelLogger");
    }

    public DeviceSwitchingSelfServeEducationScreen(int i) {
        this.A0L = false;
        C89364Wg.A00(this, 2);
    }

    private final void A01() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("DeviceSwitchingSelfServeEducationScreen/startVerifySms/useSmsRetriever : ");
        C36331k8.A1S(A0u, this.A0J);
        C29501Ww r2 = this.A09;
        if (r2 != null) {
            C29501Ww.A02(r2, 4, true);
            this.A01.A06(this, AnonymousClass190.A19(this, (String) null, -1, 0, 0, this.A02, this.A03, 0, 0, this.A0J, true, this.A0G, false, false));
            finish();
            return;
        }
        throw C36331k8.A0d("registrationManager");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C36401kF.A16(menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int A062 = C36341k9.A06(menuItem);
        if (A062 == 1) {
            C62623Gw r3 = this.A08;
            if (r3 != null) {
                AnonymousClass1X8 r2 = this.A0A;
                if (r2 != null) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("device-switching-self-serve-education-screen +");
                    A0u.append(this.A0E);
                    r3.A01(this, r2, AnonymousClass000.A0q(this.A0F, A0u));
                } else {
                    throw C36331k8.A0d("verificationFlowState");
                }
            } else {
                throw C36331k8.A0d("registrationHelper");
            }
        } else if (A062 == 2) {
            C36361kB.A0t(this);
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public DeviceSwitchingSelfServeEducationScreen() {
        this(0);
    }
}
