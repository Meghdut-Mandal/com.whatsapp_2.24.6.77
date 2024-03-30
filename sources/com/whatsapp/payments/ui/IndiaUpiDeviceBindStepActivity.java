package com.whatsapp.payments.ui;

import X.AE0;
import X.AEA;
import X.AF7;
import X.AFC;
import X.AVY;
import X.AnonymousClass000;
import X.AnonymousClass00F;
import X.AnonymousClass07B;
import X.AnonymousClass16T;
import X.AnonymousClass17Y;
import X.AnonymousClass19A;
import X.AnonymousClass1EU;
import X.AnonymousClass1EZ;
import X.AnonymousClass6PS;
import X.AnonymousClass8gJ;
import X.AnonymousClass8gK;
import X.AnonymousClass9Q4;
import X.AnonymousClass9RT;
import X.AnonymousClass9YX;
import X.B1L;
import X.B2W;
import X.B7Z;
import X.C03570Gk;
import X.C131606Ps;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C165607th;
import X.C165677tx;
import X.C173858Tk;
import X.C175748az;
import X.C175818b6;
import X.C176658cT;
import X.C179128jE;
import X.C179638kS;
import X.C179648kT;
import X.C183398qj;
import X.C18800tq;
import X.C18830tt;
import X.C194709Qv;
import X.C195389Uc;
import X.C19630wG;
import X.C19770wU;
import X.C199129ek;
import X.C199729fr;
import X.C201529jn;
import X.C202059ky;
import X.C202269lR;
import X.C20810yC;
import X.C20830yE;
import X.C21233ADp;
import X.C22967AzJ;
import X.C23173B8h;
import X.C23191B8z;
import X.C24611Dc;
import X.C24641Df;
import X.C24851Ea;
import X.C27111My;
import X.C29121Vk;
import X.C29131Vl;
import X.C29221Vu;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36441kJ;
import X.C65443Sb;
import X.C90484aE;
import X.C90494aF;
import X.C90504aG;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class IndiaUpiDeviceBindStepActivity extends C179128jE implements B1L, C22967AzJ {
    public static final B2W A0i = new C21233ADp();
    public int A00;
    public int A01;
    public View A02;
    public View A03;
    public View A04;
    public WaImageView A05;
    public C20830yE A06;
    public AnonymousClass16T A07;
    public AEA A08;
    public C175818b6 A09;
    public C175818b6 A0A;
    public AnonymousClass9YX A0B;
    public C24641Df A0C;
    public C199129ek A0D;
    public AnonymousClass8gK A0E;
    public C195389Uc A0F;
    public AnonymousClass9RT A0G;
    public AnonymousClass6PS A0H;
    public AFC A0I;
    public C194709Qv A0J;
    public C179638kS A0K;
    public C179648kT A0L;
    public AnonymousClass9Q4 A0M;
    public C201529jn A0N;
    public C29131Vl A0O;
    public Runnable A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public int A0X;
    public PendingIntent A0Y;
    public C202059ky A0Z;
    public C183398qj A0a;
    public C165677tx A0b;
    public Runnable A0c;
    public ArrayList A0d;
    public boolean A0e;
    public boolean A0f;
    public final C24611Dc A0g;
    public final C176658cT A0h;

    private void A1G(String str) {
        C131606Ps r3 = new C131606Ps((String) null, new C131606Ps[0]);
        r3.A03("device_binding_failure_reason", str);
        this.A0S.BOp(r3, 0, (Integer) null, "device_binding", "payments_device_binding_precheck");
    }

    private void A0z() {
        this.A0g.A06("PAY: continueOnFinishDeviceBind called");
        C24851Ea A042 = this.A0I.A04("add_bank");
        C24851Ea A043 = this.A0I.A04("2fa");
        this.A0I.A0A(A042);
        this.A0I.A0A(A043);
        Intent A0H2 = C36441kJ.A0H(this, IndiaUpiAccountRecoveryFinishActivity.class);
        A42(A0H2);
        C165587tf.A0u(A0H2, this, "extra_previous_screen", "device_binding");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x003c, code lost:
        if (r0.getSimState() != 5) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A10() {
        /*
            r4 = this;
            X.8kS r0 = r4.A0K
            java.lang.String r1 = "smsSend"
            X.0zf r0 = r0.A00
            r0.A07(r1)
            java.lang.String r0 = "1"
            r4.A0Q = r0
            android.view.View r0 = r4.A04
            A14(r0, r4)
            android.view.View r0 = r4.A02
            A12(r0, r4)
            android.view.View r0 = r4.A03
            A12(r0, r4)
            com.whatsapp.WaImageView r1 = r4.A05
            r0 = 2131232658(0x7f080792, float:1.8081431E38)
            X.C36391kE.A18(r4, r1, r0)
            X.8kT r0 = r4.A0L
            java.lang.String r1 = "deviceBindingStarted"
            X.0zf r0 = r0.A00
            r0.A08(r1)
            X.0yb r0 = r4.A08
            android.telephony.TelephonyManager r0 = r0.A0K()
            r3 = 1
            if (r0 == 0) goto L_0x003e
            int r2 = r0.getSimState()
            r0 = 5
            r1 = 1
            if (r2 == r0) goto L_0x003f
        L_0x003e:
            r1 = 0
        L_0x003f:
            boolean r0 = X.C19600wD.A02(r4)
            if (r0 == 0) goto L_0x0056
            java.lang.String r0 = "airplane_mode_on"
            r4.A1G(r0)
            r1 = 2131892398(0x7f1218ae, float:1.9419543E38)
        L_0x004d:
            X.9fr r0 = new X.9fr
            r0.<init>(r1)
            A1C(r4, r0, r3)
            return
        L_0x0056:
            if (r1 != 0) goto L_0x0061
            java.lang.String r0 = "sim_state_issues"
            r4.A1G(r0)
            r1 = 2131892400(0x7f1218b0, float:1.9419547E38)
            goto L_0x004d
        L_0x0061:
            X.8qj r1 = new X.8qj
            r1.<init>(r4)
            r4.A0a = r1
            X.0wU r0 = r4.A04
            X.C36391kE.A1Q(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity.A10():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        if (r1.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        A13(r2.A04, r2);
        A13(r2.A02, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        A12(r2.A03, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        A12(r2.A02, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A11() {
        /*
            r2 = this;
            java.lang.String r1 = r2.A0Q
            int r0 = r1.hashCode()
            switch(r0) {
                case 49: goto L_0x000a;
                case 50: goto L_0x0018;
                case 51: goto L_0x002b;
                case 52: goto L_0x002e;
                default: goto L_0x0009;
            }
        L_0x0009:
            return
        L_0x000a:
            java.lang.String r0 = "1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0009
            android.view.View r0 = r2.A04
            A12(r0, r2)
            goto L_0x0025
        L_0x0018:
            java.lang.String r0 = "2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0009
            android.view.View r0 = r2.A04
            A13(r0, r2)
        L_0x0025:
            android.view.View r0 = r2.A02
            A12(r0, r2)
            goto L_0x0040
        L_0x002b:
            java.lang.String r0 = "3"
            goto L_0x0030
        L_0x002e:
            java.lang.String r0 = "4"
        L_0x0030:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0009
            android.view.View r0 = r2.A04
            A13(r0, r2)
            android.view.View r0 = r2.A02
            A13(r0, r2)
        L_0x0040:
            android.view.View r0 = r2.A03
            A12(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity.A11():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0125, code lost:
        if (r2 == com.whatsapp.R.string.f12nameremoved) goto L_0x0127;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A17(X.C202059ky r9) {
        /*
            r8 = this;
            java.lang.String r0 = r8.A0R
            X.AF7 r1 = r8.A0S
            r1.A0A(r0)
            r0 = 20
            X.8cT r3 = r1.A02(r9, r0)
            X.8b6 r0 = r8.A0A
            java.lang.String r0 = r0.A0B
            r3.A0O = r0
            X.8kT r0 = r8.A0L
            if (r9 == 0) goto L_0x013c
            X.C173858Tk.A0v(r8, r0)
        L_0x001a:
            int r0 = r8.A00
            java.lang.Long r2 = X.C36441kJ.A0y(r0)
            r3.A0K = r2
            r0 = 3
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A0L = r0
            r3.A0M = r2
            java.lang.String r0 = r8.A0S
            r3.A0N = r0
            java.lang.String r0 = "device_binding"
            r3.A0b = r0
            java.lang.String r0 = r8.A0b
            r3.A0Y = r0
            X.6Ps r2 = X.C165567td.A0F()
            r1 = 1
            java.lang.String r0 = "is_multiple_sms_flow"
            r2.A04(r0, r1)
            java.lang.String r0 = r2.toString()
            r3.A0Z = r0
            X.1Dc r4 = r8.A0g
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PaymentUserActionEvent devicebind event:"
            X.C165567td.A16(r4, r3, r0, r1)
            X.C173858Tk.A0r(r3, r8)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "IndiaUpiDeviceBindActivity: onDeviceBinding: "
            r1.append(r0)
            r7 = 1
            r6 = 0
            boolean r0 = X.AnonymousClass000.A1W(r9)
            X.C165577te.A1E(r4, r1, r0)
            X.9lR r1 = r8.A0L
            X.8b6 r0 = r8.A0A
            java.util.ArrayList r1 = r1.A07(r0)
            if (r9 == 0) goto L_0x016c
            int r3 = r9.A00
            r0 = 11453(0x2cbd, float:1.6049E-41)
            if (r3 == r0) goto L_0x016c
            r2 = 2
            if (r1 == 0) goto L_0x0094
            int r1 = r1.size()
            int r0 = r8.A00
            if (r1 <= r0) goto L_0x0094
            if (r0 >= r2) goto L_0x0094
            r8.A0V = r7
            X.8qj r1 = new X.8qj
            r1.<init>(r8)
            r8.A0a = r1
            X.0wU r0 = r8.A04
            X.C36391kE.A1Q(r1, r0)
        L_0x0093:
            return
        L_0x0094:
            java.lang.String r5 = "upi-bind-device"
            boolean r0 = X.AEA.A02(r8, r5, r3, r7)
            if (r0 != 0) goto L_0x0093
            r8.A0V = r6
            X.9lR r1 = r8.A0L
            java.util.ArrayList r0 = r1.A07
            if (r0 == 0) goto L_0x00b0
            int r0 = r0.size()
            if (r0 <= r7) goto L_0x00b0
            int r0 = r1.A01
            int r0 = r0 + 2
            r1.A01 = r0
        L_0x00b0:
            r1.A02 = r6
            int r3 = r9.A00
            r0 = 446(0x1be, float:6.25E-43)
            if (r3 == r0) goto L_0x015f
            r0 = 476(0x1dc, float:6.67E-43)
            if (r3 == r0) goto L_0x014e
            r0 = 11452(0x2cbc, float:1.6048E-41)
            if (r3 == r0) goto L_0x0133
            r0 = 11477(0x2cd5, float:1.6083E-41)
            if (r3 == r0) goto L_0x012c
            r0 = 11498(0x2cea, float:1.6112E-41)
            if (r3 == r0) goto L_0x015f
            r0 = 11544(0x2d18, float:1.6177E-41)
            if (r3 == r0) goto L_0x012c
            r0 = 4059001(0x3def79, float:5.687872E-39)
            if (r3 == r0) goto L_0x015f
            r0 = 11469(0x2ccd, float:1.6071E-41)
            if (r3 == r0) goto L_0x0133
            r0 = 11470(0x2cce, float:1.6073E-41)
            if (r3 == r0) goto L_0x012c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "onDeviceBinding failure. showErrorAndFinish at error: "
            r1.append(r0)
            X.9YX r0 = r8.A0B
            java.util.HashMap r0 = r0.A06
            java.lang.Number r0 = X.C36441kJ.A10(r5, r0)
            int r0 = X.C90484aE.A0B(r0)
            X.C165577te.A1D(r4, r1, r0)
            r8.A01 = r2
        L_0x00f3:
            int r2 = r9.A00
            X.AEA r1 = r8.A08
            X.9YX r0 = r8.A0B
            X.9fr r3 = r1.A03(r0, r2)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "onDeviceBinding failure. showErrorAndFinish: "
            r1.append(r0)
            X.9YX r0 = r8.A0B
            java.util.HashMap r0 = r0.A06
            java.lang.Number r0 = X.C36441kJ.A10(r5, r0)
            int r0 = X.C90484aE.A0B(r0)
            X.C165577te.A1D(r4, r1, r0)
            int r2 = r3.A00
            r0 = 2131892347(0x7f12187b, float:1.941944E38)
            if (r2 == r0) goto L_0x0127
            r0 = 2131892408(0x7f1218b8, float:1.9419563E38)
            if (r2 == r0) goto L_0x0127
            r1 = 2131891607(0x7f121597, float:1.9417939E38)
            r0 = 1
            if (r2 != r1) goto L_0x0128
        L_0x0127:
            r0 = 0
        L_0x0128:
            A1C(r8, r3, r0)
            return
        L_0x012c:
            X.AE0 r0 = r8.A0M
            X.C173858Tk.A0s(r1, r0, r8)
            r0 = 3
            goto L_0x0139
        L_0x0133:
            X.AE0 r0 = r8.A0M
            X.C173858Tk.A0s(r1, r0, r8)
            r0 = 4
        L_0x0139:
            r8.A01 = r0
            goto L_0x00f3
        L_0x013c:
            java.lang.String r1 = "deviceBindingEnded"
            X.0zf r0 = r0.A00
            r0.A08(r1)
            X.8kS r0 = r8.A0K
            java.lang.String r1 = "deviceBind"
            X.0zf r0 = r0.A00
            r0.A06(r1)
            goto L_0x001a
        L_0x014e:
            X.AE0 r0 = r8.A0M
            X.C173858Tk.A0s(r1, r0, r8)
            r1 = 2131895511(0x7f1224d7, float:1.9425857E38)
            X.9fr r0 = new X.9fr
            r0.<init>(r1)
            A1C(r8, r0, r6)
            return
        L_0x015f:
            X.AE0 r0 = r8.A0M
            X.C173858Tk.A0s(r1, r0, r8)
            int r1 = r9.A00
            X.8b6 r0 = r8.A0A
            r8.A16(r0, r1)
            return
        L_0x016c:
            r8.A0V = r6
            X.8kS r0 = r8.A0K
            java.lang.String r1 = "getAccounts"
            X.0zf r0 = r0.A00
            r0.A07(r1)
            java.lang.String r2 = X.C173858Tk.A0K(r8)
            X.0wU r1 = r8.A04
            X.8qt r0 = new X.8qt
            r0.<init>(r8, r2)
            X.C36391kE.A1Q(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity.A17(X.9ky):void");
    }

    private void A18(C202059ky r9, ArrayList arrayList) {
        String A042;
        long j;
        short s;
        C199729fr A032;
        int i;
        C24611Dc r2 = this.A0g;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("onBankAccountsList: ");
        A0u.append(arrayList);
        C165567td.A16(r2, r9, " error: ", A0u);
        if (!TextUtils.isEmpty(C173858Tk.A0K(this))) {
            A042 = C173858Tk.A0K(this);
        } else {
            A042 = this.A0L.A04(this.A0A);
        }
        AF7 af7 = this.A0S;
        af7.A0A(A042);
        C176658cT A022 = af7.A02(r9, 18);
        A022.A0b = "device_binding";
        A022.A0Y = this.A0b;
        A022.A0O = this.A0A.A0B;
        boolean z = false;
        if (arrayList != null) {
            if (arrayList.size() > 0) {
                z = true;
            }
            A022.A01 = Boolean.valueOf(z);
            j = (long) arrayList.size();
        } else {
            A022.A01 = false;
            j = 0;
        }
        A022.A0H = Long.valueOf(j);
        C173858Tk.A0r(A022, this);
        r2.A04(AnonymousClass000.A0l(A022, "logGetAccounts: ", AnonymousClass000.A0u()));
        C179638kS r0 = this.A0K;
        if (r9 != null) {
            s = 3;
        } else {
            r0.A00.A06("getAccounts");
            r0 = this.A0K;
            s = 2;
        }
        r0.A00.A0C(s);
        if (arrayList == null || arrayList.isEmpty()) {
            if (arrayList != null) {
                A11();
                this.A01 = 1;
                if (!A46(this.A0A, new C202059ky(11473), getString(R.string.f12nameremoved))) {
                    A032 = new C199729fr(R.string.f12nameremoved);
                } else {
                    return;
                }
            } else if (r9 != null && !AEA.A02(this, "upi-get-accounts", r9.A00, true)) {
                String A012 = this.A0H.A01(r9.A00);
                int i2 = r9.A00;
                if (i2 == 11467 || i2 == 11543) {
                    A11();
                    C173858Tk.A0s(this.A0L, this.A0M, this);
                    this.A01 = 3;
                    A1C(this, new C199729fr(R.string.f12nameremoved), true);
                    this.A0L.A08();
                    return;
                } else if (A012 != null) {
                    A11();
                    if (!A46(this.A0A, r9, A012)) {
                        A1C(this, new C199729fr(r9.A00, A012), true);
                        return;
                    }
                    return;
                } else {
                    if (i2 == 11473) {
                        A11();
                        i = R.string.f12nameremoved;
                    } else if (i2 == 11485) {
                        A11();
                        this.A01 = 5;
                        i = R.string.f12nameremoved;
                    } else if (i2 == 11487) {
                        A11();
                        this.A01 = 6;
                        i = R.string.f12nameremoved;
                    } else {
                        A032 = this.A08.A03(this.A0B, i2);
                        StringBuilder A0u2 = AnonymousClass000.A0u();
                        A0u2.append("onBankAccountsList failure. showErrorAndFinish: ");
                        C165577te.A1D(r2, A0u2, C90484aE.A0B(C36441kJ.A10("upi-get-accounts", this.A0B.A06)));
                        int i3 = A032.A00;
                        if (i3 == R.string.f12nameremoved || i3 == R.string.f12nameremoved || i3 == R.string.f12nameremoved) {
                            A1C(this, A032, false);
                            return;
                        }
                        this.A01 = 1;
                    }
                    A032 = new C199729fr(i);
                }
            } else {
                return;
            }
            A1C(this, A032, true);
        } else if (arrayList.size() != 1 || ((C175818b6) arrayList.get(0)).A0I) {
            A1H(arrayList);
        } else if (!this.A0U) {
            this.A0U = true;
            C175818b6 r4 = (C175818b6) arrayList.get(0);
            this.A09 = r4;
            AnonymousClass8gK r3 = this.A0E;
            boolean z2 = this.A0k;
            r3.A00(r4, new C23191B8z(this, 2), z2, z2);
        }
    }

    public static void A19(IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity) {
        String str = indiaUpiDeviceBindStepActivity.A0Q;
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    indiaUpiDeviceBindStepActivity.A0Q = "2";
                    A13(indiaUpiDeviceBindStepActivity.A04, indiaUpiDeviceBindStepActivity);
                    A14(indiaUpiDeviceBindStepActivity.A02, indiaUpiDeviceBindStepActivity);
                    A12(indiaUpiDeviceBindStepActivity.A03, indiaUpiDeviceBindStepActivity);
                    C36391kE.A18(indiaUpiDeviceBindStepActivity, indiaUpiDeviceBindStepActivity.A05, R.drawable.ic_verify_bank);
                    return;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    indiaUpiDeviceBindStepActivity.A17(indiaUpiDeviceBindStepActivity.A0Z);
                    return;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    indiaUpiDeviceBindStepActivity.A18(indiaUpiDeviceBindStepActivity.A0Z, indiaUpiDeviceBindStepActivity.A0d);
                    return;
                }
                break;
            case 52:
                if (str.equals("4")) {
                    indiaUpiDeviceBindStepActivity.A0z();
                    return;
                }
                break;
        }
        indiaUpiDeviceBindStepActivity.A0Q = "1";
        A14(indiaUpiDeviceBindStepActivity.A04, indiaUpiDeviceBindStepActivity);
        A12(indiaUpiDeviceBindStepActivity.A02, indiaUpiDeviceBindStepActivity);
        A12(indiaUpiDeviceBindStepActivity.A03, indiaUpiDeviceBindStepActivity);
        C36391kE.A18(indiaUpiDeviceBindStepActivity, indiaUpiDeviceBindStepActivity.A05, R.drawable.ic_send_sms);
    }

    public static void A1A(IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity) {
        if (indiaUpiDeviceBindStepActivity.A06.A02("android.permission.RECEIVE_SMS") != 0 && indiaUpiDeviceBindStepActivity.A06.A02("android.permission.SEND_SMS") == 0) {
            C03570Gk.A0C(indiaUpiDeviceBindStepActivity, new String[]{"android.permission.RECEIVE_SMS"}, 100);
        }
    }

    /* JADX WARNING: type inference failed for: r0v26, types: [java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01bf A[Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }, LOOP:1: B:60:0x01b9->B:62:0x01bf, LOOP_END] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A1B(com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity r17) {
        /*
            java.lang.String r6 = "device-binding-sms"
            X.C18740tg.A00()
            r4 = r17
            int r0 = r4.A00
            r3 = 1
            int r0 = r0 + 1
            r4.A00 = r0
            X.9lR r1 = r4.A0L
            X.8b6 r5 = r4.A0A
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()
            X.AE0 r2 = r1.A0A
            boolean r0 = r2.A0N()
            if (r0 == 0) goto L_0x0050
            java.lang.String r1 = r2.A0B()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x002f
            r2.Bws(r5)
            if (r5 == 0) goto L_0x004b
            java.lang.String r1 = r5.A09
        L_0x002f:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0038
            r8.add(r1)
        L_0x0038:
            int r1 = r8.size()
            int r0 = r4.A00
            r5 = 0
            if (r1 < r0) goto L_0x0089
            int r0 = r0 - r3
            java.lang.Object r0 = r8.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r4.A0R = r0
            goto L_0x00c3
        L_0x004b:
            java.lang.String r1 = r2.A0B()
            goto L_0x002f
        L_0x0050:
            java.util.ArrayList r2 = r1.A07(r5)
            if (r2 == 0) goto L_0x0083
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0083
            int r1 = r1.A01
            int r0 = r2.size()
            int r0 = r1 % r0
            java.lang.Object r0 = r2.get(r0)
            r8.add(r0)
            int r0 = r2.size()
            if (r0 <= r3) goto L_0x0080
            int r1 = r1 + 1
            int r0 = r2.size()
            int r1 = r1 % r0
            java.lang.Object r0 = r2.get(r1)
            r8.add(r0)
            goto L_0x0038
        L_0x0080:
            java.lang.String r0 = "PAY: IndiaUPIPaymentSetup psps list has only one psp"
            goto L_0x0085
        L_0x0083:
            java.lang.String r0 = "PAY: IndiaUPIPaymentSetup psps list is null or empty"
        L_0x0085:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0038
        L_0x0089:
            X.1Dc r2 = r4.A0g
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "IndiaUpiDeviceBindActivity : not enough psp available, pspSize: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = ", multipleSmsNumber : "
            r1.append(r0)
            int r0 = r4.A00
            X.C165577te.A1D(r2, r1, r0)
            X.0wN r7 = r4.A03
            java.util.Locale r2 = java.util.Locale.US
            java.lang.Object[] r1 = X.AnonymousClass001.A0M()
            int r0 = r4.A00
            X.AnonymousClass000.A1L(r1, r0, r5)
            int r0 = r8.size()
            X.AnonymousClass000.A1L(r1, r0, r3)
            java.lang.String r0 = "currentSmsCount = %d, psp size = %d"
            java.lang.String r1 = java.lang.String.format(r2, r0, r1)
            java.lang.String r0 = "india-upi-payment-setup-sms-gateways-out-of-bound"
            r7.A0E(r0, r1, r5)
            r4.finish()
        L_0x00c3:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            r0 = 22
            r14 = 0
            if (r1 < r0) goto L_0x0113
            int r2 = r4.A0X     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            if (r2 < 0) goto L_0x0113
            X.1Dc r8 = r4.A0g     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            java.lang.String r0 = "sending sms from sim subscription id: "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r2)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            r8.A06(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            X.9jn r1 = r4.A0N     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            int r0 = r4.A0X     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            android.telephony.SmsManager r0 = r1.A03(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            r7.add(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
        L_0x00ec:
            X.7tx r0 = r4.A0b     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            if (r0 != 0) goto L_0x0126
            java.lang.String r2 = "SMS_SENT"
            android.content.Intent r1 = new android.content.Intent     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            r1.<init>(r2)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            java.lang.String r0 = "com.whatsapp"
            android.content.Intent r0 = r1.setPackage(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            android.app.PendingIntent r0 = X.C65743Th.A01(r4, r5, r0, r5)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            r4.A0Y = r0     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            X.7tx r1 = new X.7tx     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            r1.<init>(r4)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            r4.A0b = r1     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            android.content.IntentFilter r0 = new android.content.IntentFilter     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            r0.<init>(r2)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            X.C26981Mg.A01(r1, r4, r0, r3)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            goto L_0x0126
        L_0x0113:
            X.1Dc r8 = r4.A0g     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            java.lang.String r0 = "sending sms from default sim"
            r8.A06(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            android.telephony.SmsManager r0 = android.telephony.SmsManager.getDefault()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            r7.add(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            goto L_0x00ec
        L_0x0126:
            r2 = 0
        L_0x0127:
            int r0 = r7.size()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            if (r2 >= r0) goto L_0x023a
            java.lang.String r12 = ""
            java.lang.String r9 = r4.A3t(r12)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            X.9lR r11 = r4.A0L     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            java.lang.String r13 = r4.A0R     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            X.8aw r0 = X.C202269lR.A01(r11, r13)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            if (r0 == 0) goto L_0x0215
            android.os.Bundle r1 = r0.A00     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            if (r1 == 0) goto L_0x0215
            java.lang.String r0 = "smsGateways"
            java.util.ArrayList r10 = r1.getStringArrayList(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            if (r10 == 0) goto L_0x0215
            int r0 = r10.size()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            if (r0 <= 0) goto L_0x0215
            boolean r0 = r10.isEmpty()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            if (r0 != 0) goto L_0x0215
            X.C18740tg.A09(r12, r10)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            int r1 = r10.size()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            r11.A00 = r1     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            int r0 = r11.A02     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            int r0 = r0 % r1
            r11.A02 = r0     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            java.lang.Object r0 = r10.get(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
        L_0x0169:
            r4.A0S = r0     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            X.9lR r1 = r4.A0L     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            java.lang.String r0 = r4.A0R     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            java.lang.String r0 = r1.A05(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            java.lang.String r0 = r4.A3u(r0, r9)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            r4.A0T = r0     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            X.9lR r1 = r4.A0L     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            java.lang.String r0 = r4.A0R     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            X.8aw r9 = X.C202269lR.A01(r1, r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            if (r9 == 0) goto L_0x0212
            android.os.Bundle r1 = r9.A00     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            if (r1 == 0) goto L_0x020f
            java.lang.String r0 = "smsPrefix"
            java.lang.String r0 = r1.getString(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
        L_0x018d:
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            if (r0 != 0) goto L_0x0212
            android.os.Bundle r1 = r9.A00     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            if (r1 == 0) goto L_0x020d
            java.lang.String r0 = "smsPrefix"
            java.lang.String r0 = r1.getString(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
        L_0x019d:
            java.lang.Object r12 = r7.get(r2)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            android.telephony.SmsManager r12 = (android.telephony.SmsManager) r12     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            X.C36421kH.A1N(r1)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            java.lang.String r0 = r4.A0T     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            java.util.ArrayList r15 = r12.divideMessage(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            r1 = 0
        L_0x01b9:
            int r0 = r15.size()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            if (r1 >= r0) goto L_0x01c7
            android.app.PendingIntent r0 = r4.A0Y     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            r9.add(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            int r1 = r1 + 1
            goto L_0x01b9
        L_0x01c7:
            X.AF7 r11 = r4.A0S     // Catch:{ NullPointerException -> 0x01f6, UnsupportedOperationException -> 0x01f4, SecurityException -> 0x01f2, IllegalArgumentException -> 0x01f0 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)     // Catch:{ NullPointerException -> 0x01f6, UnsupportedOperationException -> 0x01f4, SecurityException -> 0x01f2, IllegalArgumentException -> 0x01f0 }
            java.lang.String r1 = "db_sms_sent"
            java.lang.String r0 = "device_binding"
            X.8cT r1 = r11.A04(r10, r14, r1, r0)     // Catch:{ NullPointerException -> 0x01f6, UnsupportedOperationException -> 0x01f4, SecurityException -> 0x01f2, IllegalArgumentException -> 0x01f0 }
            java.lang.String r0 = r4.A0S     // Catch:{ NullPointerException -> 0x01f6, UnsupportedOperationException -> 0x01f4, SecurityException -> 0x01f2, IllegalArgumentException -> 0x01f0 }
            r1.A0N = r0     // Catch:{ NullPointerException -> 0x01f6, UnsupportedOperationException -> 0x01f4, SecurityException -> 0x01f2, IllegalArgumentException -> 0x01f0 }
            int r0 = r4.A00     // Catch:{ NullPointerException -> 0x01f6, UnsupportedOperationException -> 0x01f4, SecurityException -> 0x01f2, IllegalArgumentException -> 0x01f0 }
            java.lang.Long r0 = X.C36441kJ.A0y(r0)     // Catch:{ NullPointerException -> 0x01f6, UnsupportedOperationException -> 0x01f4, SecurityException -> 0x01f2, IllegalArgumentException -> 0x01f0 }
            r1.A0M = r0     // Catch:{ NullPointerException -> 0x01f6, UnsupportedOperationException -> 0x01f4, SecurityException -> 0x01f2, IllegalArgumentException -> 0x01f0 }
            X.C173858Tk.A0r(r1, r4)     // Catch:{ NullPointerException -> 0x01f6, UnsupportedOperationException -> 0x01f4, SecurityException -> 0x01f2, IllegalArgumentException -> 0x01f0 }
            java.lang.String r13 = r4.A0S     // Catch:{ NullPointerException -> 0x01f6, UnsupportedOperationException -> 0x01f4, SecurityException -> 0x01f2, IllegalArgumentException -> 0x01f0 }
            r17 = r14
            r16 = r9
            r12.sendMultipartTextMessage(r13, r14, r15, r16, r17)     // Catch:{ NullPointerException -> 0x01f6, UnsupportedOperationException -> 0x01f4, SecurityException -> 0x01f2, IllegalArgumentException -> 0x01f0 }
            r4.A0V = r3     // Catch:{ NullPointerException -> 0x01f6, UnsupportedOperationException -> 0x01f4, SecurityException -> 0x01f2, IllegalArgumentException -> 0x01f0 }
            goto L_0x0209
        L_0x01f0:
            r1 = move-exception
            goto L_0x01f7
        L_0x01f2:
            r1 = move-exception
            goto L_0x01f7
        L_0x01f4:
            r1 = move-exception
            goto L_0x01f7
        L_0x01f6:
            r1 = move-exception
        L_0x01f7:
            java.lang.String r0 = "IndiaUpiPaymentSetup sendDeviceBindingSms failed. Manual SMS no longer available. More details: "
            r8.A0A(r0, r1)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            java.lang.String r0 = "sms_not_supported"
            A1F(r4, r0, r5)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            X.8kT r0 = r4.A0L     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            X.C173858Tk.A0v(r4, r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            r4.finish()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
        L_0x0209:
            int r2 = r2 + 1
            goto L_0x0127
        L_0x020d:
            r0 = 0
            goto L_0x019d
        L_0x020f:
            r0 = 0
            goto L_0x018d
        L_0x0212:
            java.lang.String r0 = "TRL WHA"
            goto L_0x019d
        L_0x0215:
            java.lang.String r0 = "PAY: IndiaUPIPaymentSetup smsGateways list is null or empty"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            X.0wN r10 = r11.A09     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            java.lang.Object[] r1 = X.AnonymousClass001.A0M()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            if (r13 != 0) goto L_0x0223
            r13 = r12
        L_0x0223:
            r1[r5] = r13     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            java.util.ArrayList r0 = r11.A07     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            if (r0 == 0) goto L_0x022a
            r12 = r0
        L_0x022a:
            r1[r3] = r12     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            java.lang.String r0 = "psp name: %s psp-config: %s"
            java.lang.String r1 = java.lang.String.format(r0, r1)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            java.lang.String r0 = "india-upi-payment-setup-sms-gateways-list-empty"
            r10.A0E(r0, r1, r5)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            r0 = 0
            goto L_0x0169
        L_0x023a:
            X.9YX r0 = r4.A0B     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            if (r0 == 0) goto L_0x0262
            r0.A02(r6)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0242 }
            return
        L_0x0242:
            r2 = move-exception
            X.1Dc r1 = r4.A0g
            java.lang.String r0 = "IndiaUpiDeviceBindActivity showSmsErrorAndFinish after sendDeviceBindingSms threw: "
            r1.A0A(r0, r2)
            X.9YX r1 = r4.A0B
            if (r1 == 0) goto L_0x0252
            r0 = -1
            r1.A04(r6, r0)
        L_0x0252:
            java.lang.String r0 = "illegal_state_exception"
            A1F(r4, r0, r5)
            r1 = 2131892397(0x7f1218ad, float:1.9419541E38)
            X.9fr r0 = new X.9fr
            r0.<init>(r1)
            A1C(r4, r0, r3)
        L_0x0262:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity.A1B(com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity):void");
    }

    @Deprecated
    public static void A1C(IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity, C199729fr r6, boolean z) {
        int i = r6.A00;
        C24611Dc r3 = indiaUpiDeviceBindStepActivity.A0g;
        r3.A06(AnonymousClass000.A0r("IndiaUpiDeviceBindActivity showErrorAndFinish: ", AnonymousClass000.A0u(), i));
        indiaUpiDeviceBindStepActivity.A11();
        if (i == 0) {
            i = R.string.f12nameremoved;
            String str = indiaUpiDeviceBindStepActivity.A0B.A04;
            if ("upi-bind-device".equalsIgnoreCase(str)) {
                i = R.string.device_binding_failure_reasons_bullet_list_title;
            }
            if ("upi-get-accounts".equalsIgnoreCase(str)) {
                indiaUpiDeviceBindStepActivity.A01 = 1;
                i = R.string.f12nameremoved;
            }
        }
        if (z) {
            AnonymousClass9YX r0 = indiaUpiDeviceBindStepActivity.A0B;
            if (r0 != null) {
                r0.A07.add("done");
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("clearStates: ");
                C165567td.A17(r3, indiaUpiDeviceBindStepActivity.A0B, A0u);
            }
            indiaUpiDeviceBindStepActivity.A0L.A04 = new AnonymousClass9YX();
            Intent A012 = C173858Tk.A01(indiaUpiDeviceBindStepActivity, r6);
            A012.putExtra("error", i);
            A012.putExtra("error_type", indiaUpiDeviceBindStepActivity.A01);
            int i2 = indiaUpiDeviceBindStepActivity.A01;
            if (i2 >= 1 && i2 <= 6) {
                A012.putExtra("extra_bank_account", indiaUpiDeviceBindStepActivity.A0A);
            }
            if (!indiaUpiDeviceBindStepActivity.A0k) {
                A012.putExtra("try_again", 1);
            }
            A012.addFlags(335544320);
            indiaUpiDeviceBindStepActivity.A42(A012);
            A012.putExtra("extra_previous_screen", "device_binding");
            indiaUpiDeviceBindStepActivity.A33(A012, true);
        } else {
            C65443Sb.A01(C199729fr.A00(indiaUpiDeviceBindStepActivity, r6), indiaUpiDeviceBindStepActivity.getSupportFragmentManager());
        }
        C173858Tk.A0v(indiaUpiDeviceBindStepActivity, indiaUpiDeviceBindStepActivity.A0L);
    }

    public static void A1D(IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity, Integer num, Integer num2) {
        C176658cT r1 = indiaUpiDeviceBindStepActivity.A0h;
        r1.A07 = num2;
        r1.A08 = num;
        r1.A0b = "device_binding";
        r1.A0Y = indiaUpiDeviceBindStepActivity.A0b;
        C173858Tk.A0r(r1, indiaUpiDeviceBindStepActivity);
    }

    public static void A1E(IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity, String str) {
        if (indiaUpiDeviceBindStepActivity.A0f) {
            indiaUpiDeviceBindStepActivity.A0g.A06("PAY: getAccountsOrFinishAfterDeviceBinding called");
            indiaUpiDeviceBindStepActivity.A0Q = "4";
            A13(indiaUpiDeviceBindStepActivity.A04, indiaUpiDeviceBindStepActivity);
            A13(indiaUpiDeviceBindStepActivity.A02, indiaUpiDeviceBindStepActivity);
            A14(indiaUpiDeviceBindStepActivity.A03, indiaUpiDeviceBindStepActivity);
            C36391kE.A18(indiaUpiDeviceBindStepActivity, indiaUpiDeviceBindStepActivity.A05, R.drawable.ic_account_search);
            indiaUpiDeviceBindStepActivity.A0z();
            return;
        }
        indiaUpiDeviceBindStepActivity.A0Q = "3";
        A13(indiaUpiDeviceBindStepActivity.A04, indiaUpiDeviceBindStepActivity);
        A13(indiaUpiDeviceBindStepActivity.A02, indiaUpiDeviceBindStepActivity);
        A14(indiaUpiDeviceBindStepActivity.A03, indiaUpiDeviceBindStepActivity);
        C36391kE.A18(indiaUpiDeviceBindStepActivity, indiaUpiDeviceBindStepActivity.A05, R.drawable.ic_account_search);
        C24611Dc r2 = indiaUpiDeviceBindStepActivity.A0g;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("getAccountsAfterDeviceBinding: bank picked and calling sendGetBankAccounts for: ");
        A0u.append(indiaUpiDeviceBindStepActivity.A0A.A01);
        A0u.append(" accountProvider:");
        A0u.append(indiaUpiDeviceBindStepActivity.A0A.A09);
        A0u.append(" psp: ");
        C165567td.A18(r2, str, A0u);
        indiaUpiDeviceBindStepActivity.A0D.A00(indiaUpiDeviceBindStepActivity.A0A, C173858Tk.A0L(indiaUpiDeviceBindStepActivity));
        indiaUpiDeviceBindStepActivity.A0S.Buu();
    }

    private void A1H(ArrayList arrayList) {
        this.A0g.A06("IndiaUpiDeviceBindActivity showBankAccounts called");
        Intent A0H2 = C36441kJ.A0H(this, IndiaUpiBankAccountPickerActivity.class);
        A0H2.putParcelableArrayListExtra("extra_accounts_list", arrayList);
        A0H2.putExtra("extra_selected_account_bank_logo", this.A0A.A03);
        A42(A0H2);
        C165587tf.A0u(A0H2, this, "extra_previous_screen", "device_binding");
    }

    public void A2F() {
        if (!this.A0e) {
            this.A0e = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r3 = A0L2.A5g;
            C165567td.A11(r3, this);
            C18830tt r2 = r3.A00;
            C165567td.A0v(r3, r2, this, C36321k7.A05(r3, r2, this));
            C173858Tk.A0h(A0L2, r3, r2, this);
            C173858Tk.A0i(A0L2, r3, r2, this, C165577te.A0f(r3));
            C173858Tk.A0q(r3, r2, this);
            C173858Tk.A0p(r3, r2, this);
            this.A0O = C165587tf.A0Z(r3);
            this.A08 = C165607th.A0W(r2);
            this.A06 = C165587tf.A0N(r3);
            this.A0I = (AFC) r2.A63.get();
            this.A07 = C165587tf.A0Q(r3);
            this.A0H = C165607th.A0Z(r3);
            this.A0C = (C24641Df) r3.AW0.get();
            this.A0N = r3.AHh();
            this.A0L = C173858Tk.A0G(r2);
            this.A0K = (C179638kS) r2.A95.get();
            this.A0F = C165587tf.A0U(r2);
            this.A0G = (AnonymousClass9RT) r2.AAk.get();
            this.A0J = C27111My.A2v(A0L2);
        }
    }

    public void BS2(C202059ky r2, ArrayList arrayList) {
        this.A0d = arrayList;
        this.A0Z = r2;
        if (!this.A0m) {
            A18(r2, arrayList);
        }
    }

    public void BVU(C202059ky r2) {
        if (this.A0m) {
            this.A0Z = r2;
        } else {
            A17(r2);
        }
    }

    public void BeO(C175748az r4, C202059ky r5) {
        if (r4 != null) {
            this.A0A = r4;
            A44("device_binding");
            this.A0L.A00.A0C(2);
            return;
        }
        if (r5 != null) {
            int i = r5.A00;
            if (i == 10756) {
                Intent A0H2 = C36441kJ.A0H(this, IndiaUpiDobPickerActivity.class);
                A0H2.putExtra("bank_account", this.A09.A02);
                BuO(A0H2, 1023);
                return;
            } else if (i == 1383026) {
                A16(this.A0A, i);
                return;
            }
        }
        A1H(this.A0d);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 154) {
            if (i != 1023) {
                super.onActivityResult(i, i2, intent);
            } else if (i2 == -1) {
                this.A0J.A00(intent, this, new C23173B8h(this, 1));
            } else {
                finish();
            }
        } else if (i2 == -1) {
            A1A(this);
            A10();
        } else {
            BO5(R.string.f12nameremoved);
        }
    }

    public void onBackPressed() {
        C165567td.A18(this.A0g, " onBackPressed", C36381kD.A11(this));
        Integer A0i2 = C36361kB.A0i();
        A1D(this, A0i2, A0i2);
        A3x();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0f = this.A0M.A0N();
        this.A0K.A00(getIntent());
        this.A0K.A00.A07("onCreate");
        setContentView((int) R.layout.f9nameremoved);
        AnonymousClass07B A0F2 = C173858Tk.A0F(this);
        if (A0F2 != null) {
            C165607th.A16(this, A0F2, R.string.f12nameremoved);
        }
        this.A04 = findViewById(R.id.bind_step_1);
        this.A02 = findViewById(R.id.bind_step_2);
        this.A03 = findViewById(R.id.bind_step_3);
        A15(this.A04, getString(R.string.f12nameremoved), getString(R.string.f12nameremoved));
        A15(this.A02, getString(R.string.f12nameremoved), getString(R.string.f12nameremoved));
        boolean z = this.A0f;
        int i = R.string.f12nameremoved;
        if (z) {
            i = R.string.f12nameremoved;
        }
        A15(this.A03, getString(R.string.f12nameremoved), getString(i));
        this.A05 = (WaImageView) findViewById(R.id.ic_bind_top);
        this.A0B = this.A0L.A04;
        C175818b6 r13 = (C175818b6) getIntent().getParcelableExtra("extra_selected_bank");
        this.A0A = r13;
        this.A0M = new AnonymousClass9Q4(this.A0I);
        AnonymousClass17Y r30 = this.A05;
        C19630wG r15 = this.A05;
        C19770wU r14 = this.A04;
        AnonymousClass19A r12 = this.A0H;
        C29131Vl r11 = this.A0O;
        AnonymousClass1EU r10 = this.A0P;
        C202269lR r9 = this.A0L;
        AnonymousClass16T r8 = this.A07;
        C29221Vu r7 = this.A0K;
        AE0 ae0 = this.A0M;
        C201529jn r5 = this.A0N;
        AF7 af7 = this.A0S;
        C19770wU r29 = r14;
        AF7 af72 = af7;
        C29221Vu r22 = r7;
        AnonymousClass1EU r23 = r10;
        C202269lR r20 = r9;
        AE0 ae02 = ae0;
        AnonymousClass19A r18 = r12;
        C175818b6 r19 = r13;
        AnonymousClass16T r16 = r8;
        AnonymousClass17Y r142 = r30;
        this.A0D = new C199129ek(r142, r15, r16, this.A0D, r18, r19, r20, ae02, r22, r23, this, af72, this.A0V, r5, r11, r29);
        C20810yC r143 = this.A0D;
        AnonymousClass17Y r132 = this.A05;
        AnonymousClass19A r122 = this.A0H;
        C29131Vl r112 = this.A0O;
        AnonymousClass1EU r102 = this.A0P;
        AnonymousClass1EZ r92 = this.A0I;
        AnonymousClass16T r82 = this.A07;
        C202269lR r72 = this.A0L;
        C29121Vk r6 = this.A0M;
        C29221Vu r4 = this.A0K;
        AE0 ae03 = this.A0M;
        AnonymousClass17Y r17 = r132;
        this.A0E = new AnonymousClass8gK(this, r17, r82, r143, r122, r72, ae03, r92, r4, r6, r102, this, this.A0S, this.A0V, r112);
        C24611Dc r42 = this.A0g;
        StringBuilder A0u = AnonymousClass000.A0u();
        C165567td.A18(r42, C90494aF.A0c(ae03, "IndiaUpiDeviceBindActivity onCreate: device binding status: ", A0u), A0u);
        String A0K2 = C173858Tk.A0K(this);
        if (this.A0M.A0Q(this.A0A, this.A0S, A0K2)) {
            try {
                JSONObject A1B = C36441kJ.A1B();
                A1B.put("step", "DeviceBindingStep");
                C90504aG.A1J(this.A0I.A05(), "completedSteps", A1B);
                A1B.put("isCompleteWith2FA", this.A0I.A0E());
                A1B.put("isCompleteWithout2FA", this.A0I.A0F());
                A1B.put("pspForDeviceBinding", A0K2);
                A1B.put("isDeviceBindingDone", this.A0M.A0Q(this.A0A, this.A0S, A0K2));
                AnonymousClass8gJ r93 = new AnonymousClass8gJ(this.A07, this.A0D, this.A0H, this.A0L, this.A0M);
                r93.A00 = A1B;
                r93.A00("SKIPPED_DEVICE_BINDING", (List) null);
            } catch (Exception unused) {
            }
            A1E(this, A0K2);
        } else {
            A1D(this, C36381kD.A0m(), (Integer) null);
            this.A0B.A00("upi-educate-sms");
            this.A0X = this.A0M.A07();
            A10();
        }
        onConfigurationChanged(AnonymousClass000.A0U(this));
        this.A0K.A00.A06("onCreate");
    }

    public IndiaUpiDeviceBindStepActivity(int i) {
        this.A0e = false;
        B7Z.A00(this, 12);
    }

    public static void A12(View view, IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity) {
        View findViewById = view.findViewById(R.id.bind_step_number);
        if (findViewById != null) {
            Drawable drawable = indiaUpiDeviceBindStepActivity.getResources().getDrawable(R.drawable.step_circle);
            drawable.setColorFilter(AnonymousClass00F.A00(indiaUpiDeviceBindStepActivity, R.color.f6nameremoved), PorterDuff.Mode.SRC_OVER);
            findViewById.setBackground(drawable);
        }
        View findViewById2 = view.findViewById(R.id.bind_step_number_progress);
        if (findViewById2 != null) {
            findViewById2.setVisibility(4);
        }
        TextView A0P2 = C36391kE.A0P(view, R.id.bind_step_desc);
        if (A0P2 != null) {
            C36331k8.A0r(indiaUpiDeviceBindStepActivity, A0P2, R.color.f6nameremoved);
        }
    }

    public static void A13(View view, IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity) {
        View findViewById = view.findViewById(R.id.bind_step_number);
        if (findViewById != null) {
            findViewById.setVisibility(4);
        }
        View findViewById2 = view.findViewById(R.id.bind_step_number_progress);
        if (findViewById2 != null) {
            findViewById2.setVisibility(4);
        }
        View findViewById3 = view.findViewById(R.id.bind_step_check);
        if (findViewById3 != null) {
            Drawable drawable = indiaUpiDeviceBindStepActivity.getResources().getDrawable(R.drawable.step_circle);
            drawable.setColorFilter(AnonymousClass00F.A00(indiaUpiDeviceBindStepActivity, R.color.f6nameremoved), PorterDuff.Mode.SRC_OVER);
            findViewById3.setBackground(drawable);
            findViewById3.setVisibility(0);
        }
        TextView A0P2 = C36391kE.A0P(view, R.id.bind_step_desc);
        if (A0P2 != null) {
            C36331k8.A0r(indiaUpiDeviceBindStepActivity, A0P2, R.color.f6nameremoved);
        }
    }

    public static void A14(View view, IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity) {
        View findViewById = view.findViewById(R.id.bind_step_number);
        if (findViewById != null) {
            findViewById.setVisibility(0);
            Drawable drawable = indiaUpiDeviceBindStepActivity.getResources().getDrawable(R.drawable.step_circle);
            drawable.setColorFilter(AnonymousClass00F.A00(indiaUpiDeviceBindStepActivity, R.color.f6nameremoved), PorterDuff.Mode.SRC_OVER);
            findViewById.setBackground(drawable);
        }
        View findViewById2 = view.findViewById(R.id.bind_step_number_progress);
        if (findViewById2 != null) {
            findViewById2.setVisibility(0);
        }
        View findViewById3 = view.findViewById(R.id.bind_step_check);
        if (findViewById3 != null) {
            findViewById3.setVisibility(4);
        }
        TextView A0P2 = C36391kE.A0P(view, R.id.bind_step_desc);
        if (A0P2 != null) {
            C36321k7.A0M(indiaUpiDeviceBindStepActivity, A0P2, R.attr.f4nameremoved, R.color.f6nameremoved);
        }
    }

    private void A15(View view, String str, String str2) {
        TextView A0P2 = C36391kE.A0P(view, R.id.bind_step_number);
        if (A0P2 != null) {
            A0P2.setText(str);
        }
        TextView A0P3 = C36391kE.A0P(view, R.id.bind_step_desc);
        if (A0P3 != null) {
            A0P3.setText(str2);
        }
        A12(view, this);
    }

    private void A16(C175818b6 r4, int i) {
        A11();
        Intent A0H2 = C36441kJ.A0H(this, IndiaUpiOnboardingErrorEducationActivity.class);
        A42(A0H2);
        A0H2.putExtra("error_code", i);
        A0H2.putExtra("extra_selected_bank", r4);
        A0H2.putExtra("extra_previous_screen", "device_binding");
        A0H2.addFlags(335544320);
        A33(A0H2, true);
        C173858Tk.A0v(this, this.A0L);
    }

    public static void A1F(IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity, String str, boolean z) {
        String A042;
        if (!TextUtils.isEmpty(C173858Tk.A0K(indiaUpiDeviceBindStepActivity))) {
            A042 = C173858Tk.A0K(indiaUpiDeviceBindStepActivity);
        } else {
            A042 = indiaUpiDeviceBindStepActivity.A0L.A04(indiaUpiDeviceBindStepActivity.A0A);
        }
        AF7 af7 = indiaUpiDeviceBindStepActivity.A0S;
        af7.A0A(A042);
        C176658cT B4W = af7.B4W();
        B4W.A0O = indiaUpiDeviceBindStepActivity.A0A.A0B;
        B4W.A0b = "db_sms_sent";
        B4W.A0Y = indiaUpiDeviceBindStepActivity.A0b;
        int i = 28;
        if (z) {
            i = 27;
        }
        B4W.A07 = Integer.valueOf(i);
        if (!z) {
            C131606Ps A0F2 = C165567td.A0F();
            A0F2.A03("device_binding_failure_reason", str);
            B4W.A0Z = A0F2.toString();
        }
        C165567td.A16(indiaUpiDeviceBindStepActivity.A0g, B4W, "PaymentUserActionEvent smsSent event: ", AnonymousClass000.A0u());
        C173858Tk.A0r(B4W, indiaUpiDeviceBindStepActivity);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0E.A01 = null;
        C199129ek r2 = this.A0D;
        r2.A01 = null;
        r2.A02.removeCallbacksAndMessages((Object) null);
        r2.A00.quit();
        C165677tx r0 = this.A0b;
        if (r0 != null) {
            unregisterReceiver(r0);
            this.A0b = null;
        }
        PendingIntent pendingIntent = this.A0Y;
        if (pendingIntent != null) {
            pendingIntent.cancel();
            this.A0Y = null;
        }
        C183398qj r1 = this.A0a;
        if (r1 != null) {
            r1.A0D(false);
        }
        Runnable runnable = this.A0c;
        if (runnable != null) {
            this.A04.Bnx(runnable);
        }
        Runnable runnable2 = this.A0P;
        if (runnable2 != null) {
            this.A04.Bnx(runnable2);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        C165567td.A18(this.A0g, " action bar home", C36381kD.A11(this));
        A1D(this, 1, 1);
        A3x();
        return true;
    }

    public void onStart() {
        super.onStart();
        if (this.A0W) {
            A1C(this, new C199729fr(R.string.f12nameremoved), true);
        } else {
            Runnable runnable = this.A0c;
            if (runnable != null) {
                this.A04.Bnx(runnable);
                this.A0c = null;
                A19(this);
            }
        }
        Runnable runnable2 = this.A0P;
        if (runnable2 != null) {
            this.A04.Bnx(runnable2);
            this.A0P = null;
        }
    }

    public void onStop() {
        super.onStop();
        if (this.A0V && this.A0c == null) {
            this.A0c = this.A04.BpM(new AVY(this, 1), "IndiaUpiDeviceBindSetupActivity/onStop", C36371kC.A07(this.A0D.A07(924)));
        }
    }

    public IndiaUpiDeviceBindStepActivity() {
        this(0);
        this.A0X = -1;
        this.A00 = 0;
        this.A0h = new C176658cT();
        this.A0U = false;
        this.A0g = C165607th.A0b("IndiaUpiDeviceBindActivity");
    }
}
