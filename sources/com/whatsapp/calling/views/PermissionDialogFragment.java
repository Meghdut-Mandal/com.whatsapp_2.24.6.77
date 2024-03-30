package com.whatsapp.calling.views;

import X.AnonymousClass000;
import X.AnonymousClass13J;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass1G4;
import X.C1501574e;
import X.C18740tg;
import X.C19420v0;
import X.C20830yE;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C88464Su;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import com.whatsapp.jid.UserJid;
import java.util.Arrays;

public class PermissionDialogFragment extends Hilt_PermissionDialogFragment {
    public int A00;
    public Dialog A01;
    public Button A02;
    public TextView A03;
    public C88464Su A04;
    public AnonymousClass16D A05;
    public AnonymousClass171 A06;
    public C20830yE A07;
    public C19420v0 A08;
    public AnonymousClass1G4 A09;
    public AnonymousClass13J A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public String[] A0E;

    public void A0s(int i, String[] strArr, int[] iArr) {
        boolean z = false;
        if (i != 100) {
            C18740tg.A0D(false, "Unknown request code");
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PermissionDialogFragment/onRequestPermissionsResult permissions: ");
        A0u.append(Arrays.toString(strArr));
        A0u.append(", grantResults: ");
        C36321k7.A1a(A0u, Arrays.toString(iArr));
        int length = iArr.length;
        boolean z2 = false;
        if (length > 0) {
            z2 = true;
            int i2 = 0;
            while (true) {
                if (iArr[i2] == 0) {
                    i2++;
                    if (i2 >= length) {
                        break;
                    }
                } else {
                    break;
                }
            }
        } else {
            z = z2;
        }
        C88464Su r1 = this.A04;
        if (r1 != null) {
            int i3 = this.A00;
            if (z) {
                r1.Bcd(strArr, i3);
            } else {
                r1.Bcc(i3);
            }
        }
    }

    public static PermissionDialogFragment A00(UserJid userJid, int i, boolean z, boolean z2, boolean z3) {
        PermissionDialogFragment permissionDialogFragment = new PermissionDialogFragment();
        Bundle A072 = C36331k8.A07(userJid);
        A072.putBoolean("microphone", z);
        A072.putBoolean("camera", z2);
        A072.putBoolean("phone", z3);
        A072.putInt("request_code", i);
        permissionDialogFragment.A17(A072);
        return permissionDialogFragment;
    }

    public void A19() {
        super.A19();
        this.A04 = null;
    }

    public void A1H() {
        super.A1H();
        Dialog dialog = this.A01;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public void A1L() {
        super.A1L();
        if (this.A0B) {
            String[] strArr = this.A0E;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (this.A07.A02(strArr[i]) != 0) {
                        break;
                    }
                    i++;
                } else {
                    this.A01.dismiss();
                    if (this.A04 != null) {
                        new Handler().post(new C1501574e(this, 45));
                    }
                }
            }
            this.A0B = false;
        }
    }

    public void A1M() {
        super.A1M();
        Window window = this.A01.getWindow();
        C18740tg.A06(window);
        window.setLayout(C36341k9.A0G(this).getDisplayMetrics().widthPixels, C36341k9.A0G(this).getDisplayMetrics().heightPixels);
    }

    public void A1O(Context context) {
        super.A1O(context);
        this.A04 = (C88464Su) context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01e1, code lost:
        if (r8 != false) goto L_0x01fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0034, code lost:
        if (r5 != false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01f8, code lost:
        if (r0 == false) goto L_0x01fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01fa, code lost:
        r2 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0206, code lost:
        if (r10.A0D != false) goto L_0x01d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0209, code lost:
        r2 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1Q(android.os.Bundle r11) {
        /*
            r10 = this;
            super.A1Q(r11)
            X.01I r7 = r10.A0i()
            android.os.Bundle r6 = r10.A0b()
            java.lang.String r0 = "microphone"
            boolean r0 = r6.getBoolean(r0)
            r10.A0D = r0
            java.lang.String r0 = "camera"
            boolean r0 = r6.getBoolean(r0)
            r10.A0C = r0
            java.lang.String r0 = "phone"
            boolean r5 = r6.getBoolean(r0)
            java.lang.String r0 = "request_code"
            int r0 = r6.getInt(r0)
            r10.A00 = r0
            boolean r0 = r10.A0D
            r4 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0036
            boolean r0 = r10.A0C
            if (r0 != 0) goto L_0x0036
            r1 = 0
            if (r5 == 0) goto L_0x0037
        L_0x0036:
            r1 = 1
        L_0x0037:
            java.lang.String r0 = "either microphone or camera or phone permission should be needed"
            X.C18740tg.A0D(r1, r0)
            boolean r9 = r10.A0C
            java.lang.String r8 = "android.permission.CAMERA"
            java.lang.String r2 = "android.permission.RECORD_AUDIO"
            if (r9 == 0) goto L_0x0266
            boolean r0 = r10.A0D
            if (r0 == 0) goto L_0x0266
            java.lang.String[] r0 = new java.lang.String[]{r8, r2}
            java.util.ArrayList r1 = X.AnonymousClass6XV.newArrayList(r0)
        L_0x0050:
            boolean r0 = r10.A0D
            if (r0 == 0) goto L_0x0059
            X.09w r0 = X.C023409w.A00
            r1.addAll(r0)
        L_0x0059:
            java.lang.String[] r0 = X.C36371kC.A1b(r1, r3)
            r10.A0E = r0
            X.01I r1 = r10.A0i()
            android.app.Dialog r0 = new android.app.Dialog
            r0.<init>(r1)
            r10.A01 = r0
            r0.requestWindowFeature(r4)
            android.app.Dialog r0 = r10.A01
            android.view.Window r0 = r0.getWindow()
            X.C18740tg.A06(r0)
            X.C36371kC.A1G(r0, r3)
            android.app.Dialog r0 = r10.A01
            r0.setCancelable(r3)
            android.app.Dialog r0 = r10.A01
            r0.setCanceledOnTouchOutside(r3)
            android.app.Dialog r1 = r10.A01
            r0 = 2131625836(0x7f0e076c, float:1.8878891E38)
            r1.setContentView(r0)
            boolean r0 = r10.A0C
            if (r0 == 0) goto L_0x0222
            boolean r0 = r10.A0D
            if (r0 == 0) goto L_0x0222
            android.app.Dialog r1 = r10.A01
            r0 = 2131432656(0x7f0b14d0, float:1.8487076E38)
            r2 = 2131432656(0x7f0b14d0, float:1.8487076E38)
            android.view.View r1 = r1.findViewById(r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0 = 2131233478(0x7f080ac6, float:1.8083095E38)
            r1.setImageResource(r0)
            android.app.Dialog r0 = r10.A01
            android.view.View r0 = r0.findViewById(r2)
            r0.setVisibility(r3)
            android.app.Dialog r1 = r10.A01
            r0 = 2131432657(0x7f0b14d1, float:1.8487078E38)
            android.view.View r1 = r1.findViewById(r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0 = 2131233481(0x7f080ac9, float:1.80831E38)
            r1.setImageResource(r0)
            android.app.Dialog r1 = r10.A01
            r0 = 2131432658(0x7f0b14d2, float:1.848708E38)
            r2 = 2131432658(0x7f0b14d2, float:1.848708E38)
            android.view.View r1 = r1.findViewById(r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0 = 2131233468(0x7f080abc, float:1.8083074E38)
            r1.setImageResource(r0)
            android.app.Dialog r0 = r10.A01
            android.view.View r0 = r0.findViewById(r2)
            r0.setVisibility(r3)
        L_0x00de:
            android.app.Dialog r1 = r10.A01
            r0 = 2131428555(0x7f0b04cb, float:1.8478758E38)
            android.view.View r1 = r1.findViewById(r0)
            r0 = 26
            X.C48892iE.A00(r1, r10, r0)
            java.lang.String r0 = "jid"
            com.whatsapp.jid.UserJid r2 = X.C36391kE.A0h(r6, r0)
            android.app.Dialog r1 = r10.A01
            r0 = 2131434448(0x7f0b1bd0, float:1.849071E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r10.A02 = r0
            android.app.Dialog r1 = r10.A01
            r0 = 2131432659(0x7f0b14d3, float:1.8487082E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.A03 = r0
            X.1G4 r0 = r10.A09
            boolean r8 = r0.A01()
            java.lang.String[] r0 = r10.A0E
            boolean r7 = X.AnonymousClass3US.A09(r7, r0)
            X.0v0 r1 = r10.A08
            java.lang.String[] r0 = r10.A0E
            boolean r6 = X.AnonymousClass3US.A0A(r1, r0)
            if (r7 != 0) goto L_0x021f
            if (r6 != 0) goto L_0x021f
        L_0x0124:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "PermissionDialogFragment/permissions needMicPermission="
            r1.append(r0)
            boolean r0 = r10.A0D
            r1.append(r0)
            java.lang.String r0 = ", needCameraPermission="
            r1.append(r0)
            boolean r0 = r10.A0C
            r1.append(r0)
            java.lang.String r0 = ", needPhonePermission="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ", isScreenLocked="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = ", showRational="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ", isFistTimeRequest="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ", permanentDenial="
            X.C36321k7.A1X(r0, r1, r4)
            if (r2 == 0) goto L_0x0211
            X.171 r1 = r10.A06
            X.16D r0 = r10.A05
            java.lang.String r6 = X.C36381kD.A0u(r0, r1, r2)
        L_0x016b:
            r5 = 1
            if (r4 == 0) goto L_0x01b7
            boolean r1 = r10.A0C
            boolean r0 = r10.A0D
            if (r8 == 0) goto L_0x019f
            if (r1 == 0) goto L_0x01ae
            r2 = 2131892779(0x7f121a2b, float:1.9420316E38)
            if (r0 == 0) goto L_0x017e
            r2 = 2131892861(0x7f121a7d, float:1.9420482E38)
        L_0x017e:
            android.widget.TextView r1 = r10.A03
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r3] = r6
            X.C36381kD.A1E(r1, r10, r0, r2)
            android.widget.Button r1 = r10.A02
            r0 = 2131892884(0x7f121a94, float:1.9420529E38)
            r1.setText(r0)
        L_0x018f:
            android.widget.Button r1 = r10.A02
            X.2i5 r0 = new X.2i5
            r0.<init>(r5, r10, r4)
            r1.setOnClickListener(r0)
            android.app.Dialog r0 = r10.A01
            r0.show()
            return
        L_0x019f:
            if (r1 == 0) goto L_0x01aa
            r2 = 2131892778(0x7f121a2a, float:1.9420314E38)
            if (r0 == 0) goto L_0x017e
            r2 = 2131892860(0x7f121a7c, float:1.942048E38)
            goto L_0x017e
        L_0x01aa:
            r2 = 2131892853(0x7f121a75, float:1.9420466E38)
            goto L_0x01b1
        L_0x01ae:
            r2 = 2131892854(0x7f121a76, float:1.9420468E38)
        L_0x01b1:
            if (r0 != 0) goto L_0x017e
            r2 = 2131892872(0x7f121a88, float:1.9420505E38)
            goto L_0x017e
        L_0x01b7:
            int r2 = r10.A00
            if (r2 == 0) goto L_0x01ed
            if (r2 == r5) goto L_0x01e4
            r0 = 2
            if (r2 == r0) goto L_0x01e1
            r0 = 3
            if (r2 == r0) goto L_0x01dd
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "UNKNOWN REQUEST CODE "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r2)
            X.C18740tg.A0D(r3, r0)
        L_0x01d0:
            r2 = 2131892863(0x7f121a7f, float:1.9420486E38)
        L_0x01d3:
            android.widget.TextView r1 = r10.A03
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r3] = r6
            X.C36381kD.A1E(r1, r10, r0, r2)
            goto L_0x018f
        L_0x01dd:
            r2 = 2131892873(0x7f121a89, float:1.9420507E38)
            goto L_0x01d3
        L_0x01e1:
            if (r8 == 0) goto L_0x0209
            goto L_0x01fa
        L_0x01e4:
            r2 = 2131892783(0x7f121a2f, float:1.9420324E38)
            if (r8 == 0) goto L_0x01d3
            r2 = 2131892782(0x7f121a2e, float:1.9420322E38)
            goto L_0x01d3
        L_0x01ed:
            boolean r0 = r10.A0C
            if (r8 == 0) goto L_0x0202
            if (r0 == 0) goto L_0x01fe
            boolean r0 = r10.A0D
            r2 = 2131892862(0x7f121a7e, float:1.9420484E38)
            if (r0 != 0) goto L_0x01d3
        L_0x01fa:
            r2 = 2131892780(0x7f121a2c, float:1.9420318E38)
            goto L_0x01d3
        L_0x01fe:
            r2 = 2131892855(0x7f121a77, float:1.942047E38)
            goto L_0x01d3
        L_0x0202:
            if (r0 == 0) goto L_0x020d
            boolean r0 = r10.A0D
            if (r0 == 0) goto L_0x0209
            goto L_0x01d0
        L_0x0209:
            r2 = 2131892781(0x7f121a2d, float:1.942032E38)
            goto L_0x01d3
        L_0x020d:
            r2 = 2131892856(0x7f121a78, float:1.9420472E38)
            goto L_0x01d3
        L_0x0211:
            java.lang.String r0 = "PermissionDialogFragment/permissions/jid is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 2131895200(0x7f1223a0, float:1.9425226E38)
            java.lang.String r6 = r10.A0n(r0)
            goto L_0x016b
        L_0x021f:
            r4 = 0
            goto L_0x0124
        L_0x0222:
            android.app.Dialog r1 = r10.A01
            r0 = 2131432657(0x7f0b14d1, float:1.8487078E38)
            android.view.View r8 = r1.findViewById(r0)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            android.content.res.Resources r2 = X.C36341k9.A0G(r10)
            boolean r0 = r10.A0D
            if (r0 == 0) goto L_0x025b
            r1 = 2131233478(0x7f080ac6, float:1.8083095E38)
        L_0x0238:
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r1)
            r8.setImageDrawable(r0)
            android.app.Dialog r1 = r10.A01
            r0 = 2131432656(0x7f0b14d0, float:1.8487076E38)
            android.view.View r0 = r1.findViewById(r0)
            r2 = 8
            r0.setVisibility(r2)
            android.app.Dialog r1 = r10.A01
            r0 = 2131432658(0x7f0b14d2, float:1.848708E38)
            android.view.View r0 = r1.findViewById(r0)
            r0.setVisibility(r2)
            goto L_0x00de
        L_0x025b:
            boolean r0 = r10.A0C
            r1 = 2131233466(0x7f080aba, float:1.808307E38)
            if (r0 == 0) goto L_0x0238
            r1 = 2131233468(0x7f080abc, float:1.8083074E38)
            goto L_0x0238
        L_0x0266:
            java.lang.String[] r1 = new java.lang.String[r4]
            boolean r0 = r10.A0D
            if (r0 == 0) goto L_0x0275
            r8 = r2
        L_0x026d:
            r1[r3] = r8
            java.util.ArrayList r1 = X.AnonymousClass6XV.newArrayList(r1)
            goto L_0x0050
        L_0x0275:
            if (r9 != 0) goto L_0x026d
            java.lang.String r8 = "android.permission.READ_PHONE_STATE"
            goto L_0x026d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.views.PermissionDialogFragment.A1Q(android.os.Bundle):void");
    }
}
