package com.whatsapp.ephemeral;

import X.AnonymousClass00C;
import X.AnonymousClass00E;
import X.AnonymousClass01I;
import X.AnonymousClass11F;
import X.AnonymousClass1A6;
import X.AnonymousClass1LX;
import X.AnonymousClass3OP;
import X.AnonymousClass3Y0;
import X.AnonymousClass3YD;
import X.AnonymousClass4QZ;
import X.C16550pQ;
import X.C19420v0;
import X.C19970wo;
import X.C24801Dv;
import X.C28071Rf;
import X.C33751fs;
import X.C36331k8;
import X.C36341k9;
import X.C36371kC;
import X.C62383Fy;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;

public final class EphemeralDmKicBottomSheetDialog extends Hilt_EphemeralDmKicBottomSheetDialog implements C16550pQ {
    public static AnonymousClass4QZ A0N;
    public static final AnonymousClass3OP A0O = new AnonymousClass3OP();
    public int A00;
    public FrameLayout A01;
    public C24801Dv A02;
    public WaImageView A03;
    public WaImageView A04;
    public WaImageView A05;
    public WaTextView A06;
    public WaTextView A07;
    public WaTextView A08;
    public WaTextView A09;
    public WaTextView A0A;
    public WaTextView A0B;
    public C33751fs A0C;
    public AnonymousClass1A6 A0D;
    public C19970wo A0E;
    public C19420v0 A0F;
    public C28071Rf A0G;
    public C62383Fy A0H;
    public AnonymousClass11F A0I;
    public AnonymousClass1LX A0J;
    public WDSButton A0K;
    public WDSButton A0L;
    public boolean A0M;

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x013f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A1G(android.os.Bundle r9, android.view.LayoutInflater r10, android.view.ViewGroup r11) {
        /*
            r8 = this;
            r4 = 0
            X.AnonymousClass00C.A0D(r10, r4)
            r0 = 2131624912(0x7f0e03d0, float:1.8877017E38)
            android.view.View r3 = r10.inflate(r0, r11, r4)
            android.os.Bundle r1 = r8.A0b()
            java.lang.String r0 = "chat_jid"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            X.11F r0 = (X.AnonymousClass11F) r0
            r8.A0I = r0
            android.os.Bundle r1 = r8.A0b()
            java.lang.String r0 = "entry_point"
            int r1 = r1.getInt(r0)
            r8.A00 = r1
            r2 = 1
            r0 = 3
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)
            r8.A0M = r0
            X.AnonymousClass00C.A0B(r3)
            r0 = 2131430004(0x7f0b0a74, float:1.8481697E38)
            com.whatsapp.wds.components.button.WDSButton r0 = X.C36431kI.A0y(r3, r0)
            r8.A0L = r0
            r0 = 2131430002(0x7f0b0a72, float:1.8481693E38)
            com.whatsapp.wds.components.button.WDSButton r0 = X.C36431kI.A0y(r3, r0)
            r8.A0K = r0
            r0 = 2131430008(0x7f0b0a78, float:1.8481705E38)
            com.whatsapp.WaTextView r0 = X.C36401kF.A0Q(r3, r0)
            r8.A0A = r0
            r0 = 2131430007(0x7f0b0a77, float:1.8481703E38)
            com.whatsapp.WaTextView r0 = X.C36401kF.A0Q(r3, r0)
            r8.A08 = r0
            r0 = 2131430006(0x7f0b0a76, float:1.84817E38)
            com.whatsapp.WaTextView r0 = X.C36401kF.A0Q(r3, r0)
            r8.A06 = r0
            r0 = 2131430005(0x7f0b0a75, float:1.8481699E38)
            com.whatsapp.WaTextView r0 = X.C36401kF.A0Q(r3, r0)
            r8.A09 = r0
            r0 = 2131430009(0x7f0b0a79, float:1.8481707E38)
            com.whatsapp.WaTextView r0 = X.C36401kF.A0Q(r3, r0)
            r8.A0B = r0
            r0 = 2131429999(0x7f0b0a6f, float:1.8481687E38)
            com.whatsapp.WaImageView r0 = X.C36431kI.A0X(r3, r0)
            r8.A04 = r0
            r0 = 2131429997(0x7f0b0a6d, float:1.8481683E38)
            com.whatsapp.WaImageView r0 = X.C36431kI.A0X(r3, r0)
            r8.A03 = r0
            r0 = 2131430003(0x7f0b0a73, float:1.8481695E38)
            com.whatsapp.WaTextView r0 = X.C36401kF.A0Q(r3, r0)
            r8.A07 = r0
            r0 = 2131430000(0x7f0b0a70, float:1.8481689E38)
            android.widget.FrameLayout r0 = X.C36441kJ.A0T(r3, r0)
            r8.A01 = r0
            r0 = 2131430001(0x7f0b0a71, float:1.848169E38)
            com.whatsapp.WaImageView r0 = X.C36431kI.A0X(r3, r0)
            r8.A05 = r0
            X.1LX r0 = r8.A0J
            if (r0 == 0) goto L_0x01db
            r5 = 0
            java.lang.String r1 = "ephemeral"
            X.1LY r0 = r0.A00
            boolean r0 = r0.A01(r5, r1)
            r7 = r0 ^ 1
            if (r7 == 0) goto L_0x014d
            boolean r0 = r8.A0M
            if (r0 != 0) goto L_0x014d
            r8.A06(r4)
            com.whatsapp.WaTextView r0 = r8.A09
            if (r0 == 0) goto L_0x00bb
            r0.setVisibility(r4)
        L_0x00bb:
            com.whatsapp.WaTextView r0 = r8.A07
            int r5 = X.C36411kG.A04(r0)
            int r6 = r8.A00
            r0 = 2
            com.whatsapp.WaTextView r1 = r8.A0B
            if (r6 != r0) goto L_0x0147
            if (r1 == 0) goto L_0x00d0
            r0 = 2131891791(0x7f12164f, float:1.9418312E38)
        L_0x00cd:
            r1.setText(r0)
        L_0x00d0:
            com.whatsapp.WaTextView r1 = r8.A0A
            if (r1 == 0) goto L_0x00da
            r0 = 2131891789(0x7f12164d, float:1.9418308E38)
            r1.setText(r0)
        L_0x00da:
            com.whatsapp.WaTextView r1 = r8.A0A
            r0 = 2131232358(0x7f080666, float:1.8080823E38)
            r8.A03(r1, r0)
            com.whatsapp.WaTextView r1 = r8.A08
            if (r1 == 0) goto L_0x00ec
            r0 = 2131891787(0x7f12164b, float:1.9418304E38)
            r1.setText(r0)
        L_0x00ec:
            com.whatsapp.WaTextView r1 = r8.A08
            r0 = 2131231808(0x7f080440, float:1.8079707E38)
            r8.A03(r1, r0)
            com.whatsapp.WaTextView r1 = r8.A06
            if (r1 == 0) goto L_0x00fe
            r0 = 2131891786(0x7f12164a, float:1.9418302E38)
            r1.setText(r0)
        L_0x00fe:
            com.whatsapp.WaTextView r1 = r8.A06
            r0 = 2131232217(0x7f0805d9, float:1.8080537E38)
            r8.A03(r1, r0)
            com.whatsapp.WaTextView r1 = r8.A09
            if (r1 == 0) goto L_0x0110
            r0 = 2131891788(0x7f12164c, float:1.9418306E38)
            r1.setText(r0)
        L_0x0110:
            com.whatsapp.WaImageView r1 = r8.A04
            if (r1 == 0) goto L_0x011a
            r0 = 2131232267(0x7f08060b, float:1.8080638E38)
            r1.setImageResource(r0)
        L_0x011a:
            boolean r0 = X.C222013h.A07
            if (r0 == 0) goto L_0x013f
            android.widget.FrameLayout r0 = r8.A01
            if (r0 == 0) goto L_0x0125
            r0.setVisibility(r5)
        L_0x0125:
            com.whatsapp.WaImageView r0 = r8.A05
            if (r0 == 0) goto L_0x012c
            r0.setVisibility(r4)
        L_0x012c:
            X.1Rf r5 = r8.A0G
            if (r5 == 0) goto L_0x01d4
            X.11F r4 = r8.A0I
            X.1A6 r1 = r8.A0D
            if (r1 == 0) goto L_0x01cd
            if (r7 != 0) goto L_0x0139
            r2 = 2
        L_0x0139:
            int r0 = r8.A00
            r5.A00(r1, r4, r2, r0)
            return r3
        L_0x013f:
            com.whatsapp.WaImageView r1 = r8.A04
            if (r1 == 0) goto L_0x012c
            r0 = 2131232267(0x7f08060b, float:1.8080638E38)
            goto L_0x01a7
        L_0x0147:
            if (r1 == 0) goto L_0x00d0
            r0 = 2131891790(0x7f12164e, float:1.941831E38)
            goto L_0x00cd
        L_0x014d:
            r8.A06(r2)
            com.whatsapp.WaTextView r0 = r8.A09
            X.C36331k8.A0y(r0)
            com.whatsapp.WaTextView r0 = r8.A07
            if (r0 == 0) goto L_0x015c
            r0.setVisibility(r4)
        L_0x015c:
            int r0 = r8.A00
            com.whatsapp.WaTextView r1 = r8.A06
            if (r0 != r2) goto L_0x01ab
            if (r1 == 0) goto L_0x016a
            r0 = 2131891795(0x7f121653, float:1.941832E38)
            r1.setText(r0)
        L_0x016a:
            com.whatsapp.WaTextView r1 = r8.A0B
            if (r1 == 0) goto L_0x0174
            r0 = 2131891796(0x7f121654, float:1.9418322E38)
            r1.setText(r0)
        L_0x0174:
            com.whatsapp.WaTextView r1 = r8.A08
            if (r1 == 0) goto L_0x017e
            r0 = 2131891794(0x7f121652, float:1.9418318E38)
            r1.setText(r0)
        L_0x017e:
            com.whatsapp.WaTextView r1 = r8.A06
            r0 = 2131231855(0x7f08046f, float:1.8079803E38)
        L_0x0183:
            r8.A03(r1, r0)
            com.whatsapp.WaTextView r1 = r8.A0A
            if (r1 == 0) goto L_0x0190
            r0 = 2131891798(0x7f121656, float:1.9418326E38)
            r1.setText(r0)
        L_0x0190:
            com.whatsapp.WaTextView r1 = r8.A0A
            r0 = 2131232346(0x7f08065a, float:1.8080799E38)
            r8.A03(r1, r0)
            com.whatsapp.WaTextView r1 = r8.A08
            r0 = 2131231878(0x7f080486, float:1.807985E38)
            r8.A03(r1, r0)
            com.whatsapp.WaImageView r1 = r8.A04
            if (r1 == 0) goto L_0x012c
            r0 = 2131231808(0x7f080440, float:1.8079707E38)
        L_0x01a7:
            r1.setImageResource(r0)
            goto L_0x012c
        L_0x01ab:
            if (r1 == 0) goto L_0x01b3
            r0 = 2131891792(0x7f121650, float:1.9418314E38)
            r1.setText(r0)
        L_0x01b3:
            com.whatsapp.WaTextView r1 = r8.A0B
            if (r1 == 0) goto L_0x01bd
            r0 = 2131891799(0x7f121657, float:1.9418328E38)
            r1.setText(r0)
        L_0x01bd:
            com.whatsapp.WaTextView r1 = r8.A08
            if (r1 == 0) goto L_0x01c7
            r0 = 2131891797(0x7f121655, float:1.9418324E38)
            r1.setText(r0)
        L_0x01c7:
            com.whatsapp.WaTextView r1 = r8.A06
            r0 = 2131231230(0x7f0801fe, float:1.8078535E38)
            goto L_0x0183
        L_0x01cd:
            java.lang.String r0 = "conversationsManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01d4:
            java.lang.String r0 = "keepInChatLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01db:
            java.lang.String r0 = "nuxManagerBridge"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ephemeral.EphemeralDmKicBottomSheetDialog.A1G(android.os.Bundle, android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    public void onCancel(DialogInterface dialogInterface) {
        AnonymousClass00C.A0D(dialogInterface, 0);
        A05(this);
        super.onCancel(dialogInterface);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        AnonymousClass00C.A0D(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        AnonymousClass01I A0h = A0h();
        if (A0h instanceof AnonymousClass4QZ) {
            ((AnonymousClass4QZ) A0h).Bbp();
        }
        AnonymousClass4QZ r0 = A0N;
        if (r0 != null) {
            r0.Bbp();
            A0N = null;
        }
    }

    public static final void A05(EphemeralDmKicBottomSheetDialog ephemeralDmKicBottomSheetDialog) {
        C19420v0 r0 = ephemeralDmKicBottomSheetDialog.A0F;
        if (r0 != null) {
            C36331k8.A0w(C19420v0.A00(r0), "ephemeral_kic_nux", true);
            ephemeralDmKicBottomSheetDialog.A1c();
            return;
        }
        throw C36331k8.A0d("waSharedPreferences");
    }

    private final void A06(boolean z) {
        WDSButton wDSButton = this.A0L;
        if (wDSButton != null) {
            AnonymousClass3Y0.A01(wDSButton, this, 38);
        }
        WDSButton wDSButton2 = this.A0K;
        if (wDSButton2 != null) {
            AnonymousClass3YD.A00(wDSButton2, this, 6, z);
        }
        WaImageView waImageView = this.A03;
        if (waImageView != null) {
            AnonymousClass3Y0.A01(waImageView, this, 37);
        }
    }

    private final void A03(WaTextView waTextView, int i) {
        Drawable A002 = AnonymousClass00E.A00(A0a(), i);
        if (waTextView != null) {
            waTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(A002, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public void A1L() {
        super.A1L();
        C19420v0 r0 = this.A0F;
        if (r0 == null) {
            throw C36331k8.A0d("waSharedPreferences");
        } else if (C36371kC.A1U(C36341k9.A0E(r0), "ephemeral_kic_nux") && !this.A0M) {
            A1c();
        }
    }
}
