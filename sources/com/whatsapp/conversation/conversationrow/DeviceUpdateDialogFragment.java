package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass001;
import X.AnonymousClass11F;
import X.AnonymousClass2bI;
import X.AnonymousClass2cJ;
import X.AnonymousClass3GL;
import X.C181088mu;
import X.C18740tg;
import X.C64933Qa;
import android.os.Bundle;

public class DeviceUpdateDialogFragment extends Hilt_DeviceUpdateDialogFragment {
    public AnonymousClass3GL A00;

    public static DeviceUpdateDialogFragment A03(AnonymousClass2bI r5) {
        DeviceUpdateDialogFragment deviceUpdateDialogFragment = new DeviceUpdateDialogFragment();
        Bundle A07 = AnonymousClass001.A07();
        AnonymousClass11F A01 = C64933Qa.A01(r5);
        A07.putString("chat_jid", A01.getRawString());
        C18740tg.A06(A01);
        AnonymousClass11F A0J = r5.A0J();
        if (A0J != null) {
            A01 = A0J;
        }
        A07.putString("participant_jid", A01.getRawString());
        if (r5 instanceof AnonymousClass2cJ) {
            AnonymousClass2cJ r52 = (AnonymousClass2cJ) r5;
            A07.putInt("device_added_count", r52.A00);
            A07.putInt("device_removed_count", r52.A01);
        } else {
            C18740tg.A0B(r5 instanceof C181088mu);
            A07.putBoolean("device_update_failure", true);
        }
        deviceUpdateDialogFragment.A17(A07);
        return deviceUpdateDialogFragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0027, code lost:
        if (r6 != false) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x013d, code lost:
        if (r9 != 0) goto L_0x013f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A1a(android.os.Bundle r12) {
        /*
            r11 = this;
            android.os.Bundle r1 = r11.A0b()
            java.lang.String r0 = "chat_jid"
            java.lang.String r3 = r1.getString(r0)
            java.lang.String r0 = "participant_jid"
            java.lang.String r7 = r1.getString(r0)
            java.lang.String r0 = "device_added_count"
            int r9 = r1.getInt(r0)
            java.lang.String r0 = "device_removed_count"
            int r10 = r1.getInt(r0)
            java.lang.String r0 = "device_update_failure"
            boolean r6 = r1.getBoolean(r0)
            if (r9 > 0) goto L_0x0029
            if (r10 > 0) goto L_0x0029
            r0 = 0
            if (r6 == 0) goto L_0x002a
        L_0x0029:
            r0 = 1
        L_0x002a:
            X.C18740tg.A0B(r0)
            X.13q r2 = X.AnonymousClass11F.A00
            X.11F r5 = r2.A02(r3)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "DeviceChangeDialogFragment/onCreateDialog/invalid chat jid="
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r3, r1)
            X.C18740tg.A07(r5, r0)
            X.11F r4 = r2.A02(r7)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "DeviceChangeDialogFragment/onCreateDialog/invalid remote resource jid="
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r7, r1)
            X.C18740tg.A07(r4, r0)
            X.16D r0 = r11.A02
            X.141 r3 = r0.A0D(r5)
            X.16D r0 = r11.A02
            X.141 r8 = r0.A0D(r4)
            X.0wQ r0 = r11.A01
            boolean r0 = X.C36361kB.A1X(r0, r8)
            if (r0 == 0) goto L_0x0144
            boolean r0 = r3.A0G()
            if (r0 != 0) goto L_0x007e
            X.11F r0 = r3.A0H
            boolean r0 = r0 instanceof X.C177618e5
            if (r0 != 0) goto L_0x007e
            com.whatsapp.jid.Jid r2 = X.C36431kI.A0h(r3)
        L_0x0075:
            if (r2 == 0) goto L_0x007e
            X.0wU r1 = r11.A06
            r0 = 11
            X.C80283v9.A00(r1, r11, r2, r0)
        L_0x007e:
            android.content.Context r0 = r11.A1D()
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            r2.<init>(r0)
            if (r6 == 0) goto L_0x00cf
            r0 = 2131895254(0x7f1223d6, float:1.9425336E38)
        L_0x008c:
            java.lang.CharSequence r0 = r11.A1k(r8, r0)
        L_0x0090:
            android.app.AlertDialog$Builder r2 = r2.setMessage(r0)
            r1 = 2131891806(0x7f12165e, float:1.9418342E38)
            r0 = 0
            android.app.AlertDialog$Builder r8 = r2.setNegativeButton(r1, r0)
            r2 = 2131896681(0x7f122969, float:1.942823E38)
            r1 = 2
            X.4XS r0 = new X.4XS
            r0.<init>(r1, r11, r6)
            android.app.AlertDialog$Builder r2 = r8.setNeutralButton(r2, r0)
            X.0wQ r0 = r11.A01
            boolean r0 = r0.A0M(r4)
            if (r0 == 0) goto L_0x00c2
            boolean r0 = r3.A0G()
            if (r0 != 0) goto L_0x00bd
            X.11F r0 = r3.A0H
            boolean r0 = r0 instanceof X.C177618e5
            if (r0 == 0) goto L_0x00c2
        L_0x00bd:
            android.app.AlertDialog r0 = r2.create()
            return r0
        L_0x00c2:
            r1 = 2131895564(0x7f12250c, float:1.9425965E38)
            X.3VC r0 = new X.3VC
            r0.<init>(r11, r4, r5, r7)
            android.app.AlertDialog$Builder r2 = r2.setPositiveButton(r1, r0)
            goto L_0x00bd
        L_0x00cf:
            X.0wQ r0 = r11.A01
            boolean r1 = X.C36361kB.A1X(r0, r8)
            r0 = 1
            if (r1 == 0) goto L_0x012f
            if (r9 != r0) goto L_0x00f7
            if (r10 != 0) goto L_0x00f7
            boolean r0 = r3.A0G()
            if (r0 == 0) goto L_0x00ea
            r0 = 2131893968(0x7f121ed0, float:1.9422728E38)
        L_0x00e5:
            java.lang.String r0 = r11.A0n(r0)
            goto L_0x0090
        L_0x00ea:
            X.11F r0 = r3.A0H
            boolean r0 = r0 instanceof X.C177618e5
            r1 = 2131893967(0x7f121ecf, float:1.9422725E38)
            if (r0 == 0) goto L_0x0129
            r0 = 2131893969(0x7f121ed1, float:1.942273E38)
            goto L_0x00e5
        L_0x00f7:
            if (r10 != r0) goto L_0x0112
            if (r9 != 0) goto L_0x0112
            boolean r0 = r3.A0G()
            if (r0 == 0) goto L_0x0105
            r0 = 2131893971(0x7f121ed3, float:1.9422734E38)
            goto L_0x00e5
        L_0x0105:
            X.11F r0 = r3.A0H
            boolean r0 = r0 instanceof X.C177618e5
            r1 = 2131893970(0x7f121ed2, float:1.9422732E38)
            if (r0 == 0) goto L_0x0129
            r0 = 2131893972(0x7f121ed4, float:1.9422736E38)
            goto L_0x00e5
        L_0x0112:
            boolean r0 = r3.A0G()
            if (r0 == 0) goto L_0x011c
            r0 = 2131893974(0x7f121ed6, float:1.942274E38)
            goto L_0x00e5
        L_0x011c:
            X.11F r0 = r3.A0H
            boolean r0 = r0 instanceof X.C177618e5
            r1 = 2131893973(0x7f121ed5, float:1.9422738E38)
            if (r0 == 0) goto L_0x0129
            r0 = 2131893975(0x7f121ed7, float:1.9422742E38)
            goto L_0x00e5
        L_0x0129:
            java.lang.CharSequence r0 = r11.A1k(r3, r1)
            goto L_0x0090
        L_0x012f:
            if (r9 != r0) goto L_0x0138
            if (r10 != 0) goto L_0x0138
            r0 = 2131891997(0x7f12171d, float:1.941873E38)
            goto L_0x008c
        L_0x0138:
            if (r10 != r0) goto L_0x013f
            r0 = 2131891998(0x7f12171e, float:1.9418732E38)
            if (r9 == 0) goto L_0x008c
        L_0x013f:
            r0 = 2131891999(0x7f12171f, float:1.9418734E38)
            goto L_0x008c
        L_0x0144:
            com.whatsapp.jid.Jid r2 = X.C36431kI.A0h(r8)
            goto L_0x0075
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.DeviceUpdateDialogFragment.A1a(android.os.Bundle):android.app.Dialog");
    }
}
