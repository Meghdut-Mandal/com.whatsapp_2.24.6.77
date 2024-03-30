package com.whatsapp.companiondevice;

import X.AnonymousClass17Y;
import X.AnonymousClass38U;
import X.AnonymousClass3LW;
import X.AnonymousClass3SB;
import X.C19970wo;
import X.C20380xT;
import X.C21060yb;
import X.C236419g;
import X.C24801Dv;
import X.C25701Hi;
import X.C25711Hj;
import X.C36361kB;
import X.C39001qm;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

public class LinkedDevicesDetailDialogFragment extends Hilt_LinkedDevicesDetailDialogFragment implements C25711Hj {
    public DialogInterface.OnDismissListener A00;
    public View A01;
    public C24801Dv A02;
    public AnonymousClass17Y A03;
    public LinkedDevicesSharedViewModel A04;
    public C21060yb A05;
    public C19970wo A06;
    public AnonymousClass3SB A07;
    public C236419g A08;
    public C25701Hi A09;
    public AnonymousClass38U A0A;
    public C20380xT A0B;
    public Boolean A0C;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0059, code lost:
        if (r12 <= 3600000) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x010d, code lost:
        if (r8 == false) goto L_0x010f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(com.whatsapp.companiondevice.LinkedDevicesDetailDialogFragment r25) {
        /*
            r5 = r25
            X.3SB r1 = r5.A07
            if (r1 == 0) goto L_0x01a9
            X.19g r0 = r5.A08
            com.whatsapp.jid.DeviceJid r1 = r1.A07
            java.util.Set r0 = r0.A0O
            boolean r21 = r0.contains(r1)
            X.3SB r1 = r5.A07
            boolean r0 = r1.A02()
            if (r0 == 0) goto L_0x0194
            r0 = 2131890736(0x7f121230, float:1.9416172E38)
            java.lang.String r11 = r5.A0n(r0)
        L_0x001f:
            X.3SB r2 = r5.A07
            X.01I r1 = r5.A0h()
            X.0yC r0 = r5.A02
            java.lang.String r10 = X.AnonymousClass3SB.A01(r1, r2, r0)
            X.3SB r1 = r5.A07
            int r9 = X.AnonymousClass3LZ.A00(r1)
            java.lang.String r8 = r1.A03
            r0 = 16
            X.3Xx r4 = new X.3Xx
            r4.<init>(r5, r0)
            boolean r0 = r1.A02()
            if (r0 == 0) goto L_0x018b
            r7 = 0
        L_0x0041:
            X.3SB r2 = r5.A07
            X.0wo r0 = r5.A06
            long r12 = X.C19970wo.A00(r0)
            long r0 = r2.A01
            long r12 = r12 - r0
            boolean r0 = r2.A02()
            if (r0 == 0) goto L_0x005b
            r1 = 3600000(0x36ee80, double:1.7786363E-317)
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            r20 = 1
            if (r0 > 0) goto L_0x005d
        L_0x005b:
            r20 = 0
        L_0x005d:
            android.view.View r1 = r5.A01
            X.C18740tg.A04(r1)
            r0 = 2131429535(0x7f0b089f, float:1.8480745E38)
            android.widget.ImageView r15 = X.C36401kF.A0G(r1, r0)
            android.view.View r1 = r5.A01
            r0 = 2131429540(0x7f0b08a4, float:1.8480756E38)
            android.widget.TextView r2 = X.C36391kE.A0O(r1, r0)
            android.view.View r1 = r5.A01
            r0 = 2131434250(0x7f0b1b0a, float:1.8490309E38)
            android.view.View r14 = X.C012005e.A02(r1, r0)
            android.view.View r1 = r5.A01
            r0 = 2131434267(0x7f0b1b1b, float:1.8490343E38)
            android.view.View r19 = X.C012005e.A02(r1, r0)
            android.view.View r1 = r5.A01
            r0 = 2131434310(0x7f0b1b46, float:1.849043E38)
            android.widget.TextView r18 = X.C36391kE.A0O(r1, r0)
            android.view.View r1 = r5.A01
            r0 = 2131431301(0x7f0b0f85, float:1.8484327E38)
            android.view.View r13 = X.C012005e.A02(r1, r0)
            android.view.View r1 = r5.A01
            r0 = 2131431304(0x7f0b0f88, float:1.8484333E38)
            android.view.View r17 = X.C012005e.A02(r1, r0)
            android.view.View r1 = r5.A01
            r0 = 2131431313(0x7f0b0f91, float:1.8484352E38)
            android.widget.TextView r12 = X.C36391kE.A0O(r1, r0)
            android.view.View r1 = r5.A01
            r0 = 2131434526(0x7f0b1c1e, float:1.8490868E38)
            android.view.View r1 = X.C012005e.A02(r1, r0)
            android.view.View r3 = r5.A01
            r0 = 2131431331(0x7f0b0fa3, float:1.8484388E38)
            android.widget.TextView r6 = X.C36391kE.A0O(r3, r0)
            android.view.View r3 = r5.A01
            r0 = 2131428870(0x7f0b0606, float:1.8479397E38)
            android.view.View r16 = X.C012005e.A02(r3, r0)
            android.view.View r3 = r5.A01
            r0 = 2131431325(0x7f0b0f9d, float:1.8484376E38)
            com.whatsapp.TextEmojiLabel r3 = X.C36401kF.A0O(r3, r0)
            r2.setText(r10)
            r15.setImageResource(r9)
            java.lang.Boolean r0 = r5.A0C
            r9 = 8
            r2 = 0
            if (r0 == 0) goto L_0x0174
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0174
            r14.setVisibility(r9)
        L_0x00e2:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x0170
            r13.setVisibility(r2)
            r10 = 2131890734(0x7f12122e, float:1.9416168E38)
            java.lang.Object[] r0 = X.AnonymousClass001.A0L()
            r0[r2] = r8
            X.C36381kD.A1E(r12, r5, r0, r10)
            r8 = 2131233094(0x7f080946, float:1.8082316E38)
            if (r21 == 0) goto L_0x00ff
            r8 = 2131233093(0x7f080945, float:1.8082314E38)
        L_0x00ff:
            r0 = r17
            r0.setBackgroundResource(r8)
        L_0x0104:
            java.lang.Boolean r0 = r5.A0C
            if (r0 == 0) goto L_0x010f
            boolean r8 = r0.booleanValue()
            r0 = 0
            if (r8 != 0) goto L_0x0111
        L_0x010f:
            r0 = 8
        L_0x0111:
            r1.setVisibility(r0)
            int r0 = X.C36381kD.A09(r20)
            r3.setVisibility(r0)
            if (r20 == 0) goto L_0x0159
            X.3SB r0 = r5.A07
            if (r0 == 0) goto L_0x0159
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0159
            android.content.Context r13 = r5.A0a()
            X.0yC r12 = r5.A02
            X.17Y r11 = r5.A03
            X.1Dv r10 = r5.A02
            X.0yb r8 = r5.A05
            r14 = 2131890737(0x7f121231, float:1.9416174E38)
            java.lang.Object[] r0 = X.AnonymousClass001.A0L()
            java.lang.String r1 = "learn-more"
            java.lang.String r24 = X.C36391kE.A0v(r13, r1, r0, r2, r14)
            X.0xT r14 = r5.A0B
            java.lang.String r0 = "seeing-logout-is-pending"
            android.net.Uri r18 = r14.A03(r0)
            r23 = r12
            r25 = r1
            r17 = r13
            r19 = r10
            r20 = r11
            r21 = r3
            r22 = r8
            X.AnonymousClass6YV.A0E(r17, r18, r19, r20, r21, r22, r23, r24, r25)
        L_0x0159:
            if (r7 == 0) goto L_0x016c
            r6.setVisibility(r2)
            r6.setText(r7)
            r6.setOnClickListener(r4)
        L_0x0164:
            r1 = 18
            r0 = r16
            X.C66943Xx.A00(r0, r5, r1)
        L_0x016b:
            return
        L_0x016c:
            r6.setVisibility(r9)
            goto L_0x0164
        L_0x0170:
            r13.setVisibility(r9)
            goto L_0x0104
        L_0x0174:
            r14.setVisibility(r2)
            r0 = r18
            r0.setText(r11)
            r10 = 2131233094(0x7f080946, float:1.8082316E38)
            if (r21 == 0) goto L_0x0184
            r10 = 2131233093(0x7f080945, float:1.8082314E38)
        L_0x0184:
            r0 = r19
            r0.setBackgroundResource(r10)
            goto L_0x00e2
        L_0x018b:
            r0 = 2131890851(0x7f1212a3, float:1.9416405E38)
            java.lang.String r7 = r5.A0n(r0)
            goto L_0x0041
        L_0x0194:
            X.0ts r2 = r5.A01
            long r0 = r1.A00
            if (r21 == 0) goto L_0x01a3
            r0 = 2131890724(0x7f121224, float:1.9416148E38)
            java.lang.String r11 = r2.A0B(r0)
            goto L_0x001f
        L_0x01a3:
            java.lang.String r11 = X.AnonymousClass3UY.A08(r2, r0)
            goto L_0x001f
        L_0x01a9:
            X.38U r0 = r5.A0A
            if (r0 == 0) goto L_0x016b
            android.content.Context r0 = r5.A1D()
            X.C18740tg.A06(r0)
            X.38U r0 = r5.A0A
            int r0 = r0.A01
            java.lang.String r10 = r5.A0n(r0)
            X.38U r0 = r5.A0A
            int r9 = r0.A00
            X.0ts r8 = r5.A01
            long r6 = r0.A02
            long r3 = X.C36441kJ.A0A(r6)
            r1 = 30000(0x7530, double:1.4822E-319)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x01e8
            r0 = 2131890724(0x7f121224, float:1.9416148E38)
            java.lang.String r11 = r8.A0B(r0)
        L_0x01d5:
            r21 = 1
            r8 = 0
            r0 = 17
            X.3Xx r4 = new X.3Xx
            r4.<init>(r5, r0)
            r0 = 2131895207(0x7f1223a7, float:1.942524E38)
            java.lang.String r7 = r5.A0n(r0)
            goto L_0x005b
        L_0x01e8:
            java.lang.String r11 = X.AnonymousClass3UY.A08(r8, r6)
            goto L_0x01d5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.companiondevice.LinkedDevicesDetailDialogFragment.A03(com.whatsapp.companiondevice.LinkedDevicesDetailDialogFragment):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r1 == false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void accept(java.lang.Object r3) {
        /*
            r2 = this;
            java.util.Map r3 = (java.util.Map) r3
            X.3SB r1 = r2.A07
            if (r1 == 0) goto L_0x0027
            boolean r0 = r1.A02()
            if (r0 != 0) goto L_0x0027
            com.whatsapp.jid.DeviceJid r0 = r1.A07
            java.lang.Object r0 = r3.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x001d
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A0C = r0
            A03(r2)
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.companiondevice.LinkedDevicesDetailDialogFragment.accept(java.lang.Object):void");
    }

    public Dialog A1a(Bundle bundle) {
        this.A01 = C36361kB.A0E(LayoutInflater.from(A1D()), (ViewGroup) null, R.layout.f9nameremoved);
        this.A0C = null;
        this.A09.A05(this, this.A03.A04);
        A03(this);
        C39001qm A032 = AnonymousClass3LW.A03(this);
        A032.A0j(this.A01);
        return A032.create();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.A00;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
        this.A09.A00.A02(this);
    }
}
