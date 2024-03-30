package com.whatsapp.companiondevice;

import X.AnonymousClass00T;
import X.AnonymousClass155;
import X.AnonymousClass1LU;
import X.AnonymousClass3H6;
import X.AnonymousClass3SB;
import X.AnonymousClass4JP;
import X.AnonymousClass4JQ;
import X.C18800tq;
import X.C18830tt;
import X.C19460v5;
import X.C19470v6;
import X.C236419g;
import X.C25701Hi;
import X.C36321k7;
import X.C36331k8;
import X.C36381kD;
import X.C36411kG;
import X.C36431kI;
import X.C53102qm;
import X.C53592rZ;
import X.C80263v7;
import X.C835049q;
import X.C835149r;
import X.C835249s;
import X.C87514Pc;
import X.C89324Wc;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.jid.DeviceJid;
import java.util.Map;

public final class LinkedDeviceEditDeviceActivity extends AnonymousClass155 implements C87514Pc {
    public C19460v5 A00;
    public C19460v5 A01;
    public AnonymousClass3SB A02;
    public C236419g A03;
    public AnonymousClass1LU A04;
    public DeviceJid A05;
    public boolean A06;
    public boolean A07;
    public final AnonymousClass00T A08;
    public final AnonymousClass00T A09;
    public final AnonymousClass00T A0A;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(com.whatsapp.companiondevice.LinkedDeviceEditDeviceActivity r8) {
        /*
            X.3SB r7 = r8.A02
            if (r7 != 0) goto L_0x0008
            r8.finish()
            return
        L_0x0008:
            android.view.View r1 = r8.A00
            r0 = 2131429536(0x7f0b08a0, float:1.8480747E38)
            android.widget.ImageView r1 = X.C36341k9.A0L(r1, r0)
            int r0 = X.AnonymousClass3LZ.A00(r7)
            r1.setImageResource(r0)
            android.view.View r1 = r8.A00
            r0 = 2131429537(0x7f0b08a1, float:1.848075E38)
            android.widget.TextView r1 = X.C36341k9.A0M(r1, r0)
            X.0yC r0 = r8.A0D
            java.lang.String r2 = X.AnonymousClass3SB.A01(r8, r7, r0)
            X.AnonymousClass00C.A08(r2)
            r1.setText(r2)
            android.view.View r1 = r8.A00
            r0 = 2131429538(0x7f0b08a2, float:1.8480752E38)
            android.view.View r1 = X.C36361kB.A0G(r1, r0)
            r5 = 1
            X.3Ys r0 = new X.3Ys
            r0.<init>(r8, r7, r2, r5)
            r1.setOnClickListener(r0)
            android.view.View r1 = r8.A00
            r0 = 2131434310(0x7f0b1b46, float:1.849043E38)
            android.widget.TextView r6 = X.C36341k9.A0M(r1, r0)
            boolean r0 = r7.A02()
            if (r0 == 0) goto L_0x00a7
            r0 = 2131890736(0x7f121230, float:1.9416172E38)
        L_0x0051:
            java.lang.String r0 = r8.getString(r0)
        L_0x0055:
            r6.setText(r0)
            android.view.View r1 = r8.A00
            r0 = 2131432749(0x7f0b152d, float:1.8487264E38)
            android.widget.TextView r1 = X.C36341k9.A0M(r1, r0)
            java.lang.String r0 = X.AnonymousClass3SB.A00(r8, r7)
            r1.setText(r0)
            android.view.View r1 = r8.A00
            r0 = 2131431301(0x7f0b0f85, float:1.8484327E38)
            android.view.View r6 = X.C36361kB.A0G(r1, r0)
            android.view.View r1 = r8.A00
            r0 = 2131431313(0x7f0b0f91, float:1.8484352E38)
            android.widget.TextView r4 = X.C36341k9.A0M(r1, r0)
            java.lang.String r3 = r7.A03
            r2 = 0
            if (r3 == 0) goto L_0x00a1
            boolean r0 = X.AnonymousClass098.A06(r3)
            if (r0 != 0) goto L_0x00a1
            r6.setVisibility(r2)
            r1 = 2131890734(0x7f12122e, float:1.9416168E38)
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r2] = r3
            X.C36341k9.A0s(r8, r4, r0, r1)
        L_0x0092:
            android.view.View r1 = r8.A00
            r0 = 2131431323(0x7f0b0f9b, float:1.8484372E38)
            android.view.View r1 = X.C36361kB.A0G(r1, r0)
            r0 = 12
            X.C66943Xx.A00(r1, r8, r0)
            return
        L_0x00a1:
            r0 = 8
            r6.setVisibility(r0)
            goto L_0x0092
        L_0x00a7:
            boolean r0 = r8.A07
            if (r0 == 0) goto L_0x00af
            r0 = 2131890756(0x7f121244, float:1.9416213E38)
            goto L_0x0051
        L_0x00af:
            X.0ts r4 = r8.A00
            long r2 = r7.A00
            X.19g r0 = r8.A03
            if (r0 == 0) goto L_0x00d8
            com.whatsapp.jid.DeviceJid r1 = r8.A05
            if (r1 != 0) goto L_0x00c2
            java.lang.String r0 = "deviceJid"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00c2:
            java.util.Set r0 = r0.A0O
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x00d2
            r0 = 2131890724(0x7f121224, float:1.9416148E38)
            java.lang.String r0 = r4.A0B(r0)
            goto L_0x0055
        L_0x00d2:
            java.lang.String r0 = X.AnonymousClass3UY.A08(r4, r2)
            goto L_0x0055
        L_0x00d8:
            java.lang.String r0 = "companionDeviceManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.companiondevice.LinkedDeviceEditDeviceActivity.A01(com.whatsapp.companiondevice.LinkedDeviceEditDeviceActivity):void");
    }

    public void A2F() {
        if (!this.A06) {
            this.A06 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            C19470v6 r12 = C19470v6.A00;
            this.A00 = r12;
            this.A04 = C36411kG.A0e(A0B);
            this.A01 = r12;
            this.A03 = C36381kD.A0a(A0B);
        }
    }

    public void Bwd(Map map) {
        boolean z;
        AnonymousClass3SB r1 = this.A02;
        if (r1 != null && !r1.A02()) {
            Boolean bool = (Boolean) map.get(r1.A07);
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            this.A07 = z;
            A01(this);
        }
    }

    public LinkedDeviceEditDeviceActivity(int i) {
        this.A06 = false;
        C89324Wc.A00(this, 18);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A05 = DeviceJid.Companion.A02(getIntent().getStringExtra("device_jid_raw_string"));
        setTitle(R.string.f12nameremoved);
        setContentView((int) R.layout.f9nameremoved);
        C36321k7.A0P(this);
        C53592rZ.A01(this, ((LinkedDeviceEditDeviceViewModel) this.A0A.getValue()).A00, C53102qm.A02(this, 18), 12);
        AnonymousClass00T r3 = this.A08;
        C53592rZ.A01(this, ((LinkedDevicesSharedViewModel) r3.getValue()).A0N, new AnonymousClass4JP(this), 14);
        C53592rZ.A01(this, ((LinkedDevicesSharedViewModel) r3.getValue()).A0T, new AnonymousClass4JQ(this), 13);
        ((LinkedDevicesSharedViewModel) r3.getValue()).A0S();
        ((AnonymousClass3H6) this.A09.getValue()).A00();
    }

    public void onDestroy() {
        super.onDestroy();
        LinkedDevicesSharedViewModel linkedDevicesSharedViewModel = (LinkedDevicesSharedViewModel) this.A08.getValue();
        linkedDevicesSharedViewModel.A0D.unregisterObserver(linkedDevicesSharedViewModel.A0C);
        C25701Hi r0 = linkedDevicesSharedViewModel.A0H;
        r0.A00.A02(linkedDevicesSharedViewModel.A0W);
        linkedDevicesSharedViewModel.A0G.unregisterObserver(linkedDevicesSharedViewModel.A0F);
    }

    public void onStart() {
        super.onStart();
        LinkedDeviceEditDeviceViewModel linkedDeviceEditDeviceViewModel = (LinkedDeviceEditDeviceViewModel) this.A0A.getValue();
        DeviceJid deviceJid = this.A05;
        if (deviceJid == null) {
            throw C36331k8.A0d("deviceJid");
        }
        C80263v7.A00(linkedDeviceEditDeviceViewModel.A02, linkedDeviceEditDeviceViewModel, deviceJid, 32);
    }

    public LinkedDeviceEditDeviceActivity() {
        this(0);
        this.A0A = C36431kI.A1I(new C835249s(this));
        this.A08 = C36431kI.A1I(new C835049q(this));
        this.A09 = C36431kI.A1I(new C835149r(this));
    }
}
