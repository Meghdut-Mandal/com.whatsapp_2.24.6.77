package X;

import android.content.DialogInterface;
import com.whatsapp.PhoneHyperLinkDialogFragment;

/* renamed from: X.7qC  reason: invalid class name and case insensitive filesystem */
public class C163437qC implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C163437qC(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public static void A00(PhoneHyperLinkDialogFragment phoneHyperLinkDialogFragment, C194529Qc r3, int i) {
        r3.A00(Boolean.valueOf(phoneHyperLinkDialogFragment.A0C), Boolean.valueOf(phoneHyperLinkDialogFragment.A0D), i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        r2.A00(r0);
        r1.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01ca, code lost:
        X.C36341k9.A1J(r1, r0, r2, r5);
        X.C36341k9.A1J("dialog_tag", r6.A04, r2, r4);
        r3.A0o("message_dialog_action", X.C05430Pr.A00(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01dd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.content.DialogInterface r17, int r18) {
        /*
            r16 = this;
            r3 = r16
            int r0 = r3.A02
            switch(r0) {
                case 0: goto L_0x0018;
                case 1: goto L_0x019f;
                case 2: goto L_0x01b5;
                case 3: goto L_0x0007;
                case 4: goto L_0x0007;
                case 5: goto L_0x00ea;
                case 6: goto L_0x00f6;
                case 7: goto L_0x0007;
                case 8: goto L_0x0102;
                case 9: goto L_0x01de;
                case 10: goto L_0x018d;
                case 11: goto L_0x01f5;
                case 12: goto L_0x0225;
                case 13: goto L_0x023d;
                case 14: goto L_0x0268;
                case 15: goto L_0x0274;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r2 = r3.A00
            X.6C8 r2 = (X.AnonymousClass6C8) r2
            java.lang.Object r1 = r3.A01
            android.app.Dialog r1 = (android.app.Dialog) r1
            java.lang.String r0 = "on_press_positive"
        L_0x0011:
            r2.A00(r0)
            r1.dismiss()
        L_0x0017:
            return
        L_0x0018:
            java.lang.Object r6 = r3.A01
            java.util.List r6 = (java.util.List) r6
            r7 = r18
            java.lang.Object r0 = r6.get(r7)
            X.61f r0 = (X.C1257761f) r0
            int r1 = r0.A00
            r0 = 1
            if (r1 != r0) goto L_0x0075
            java.lang.Object r4 = r3.A00
            com.whatsapp.PhoneHyperLinkDialogFragment r4 = (com.whatsapp.PhoneHyperLinkDialogFragment) r4
            X.9Qc r1 = r4.A07
            r0 = 6
            A00(r4, r1, r0)
            X.16D r1 = r4.A05
            com.whatsapp.jid.UserJid r0 = r4.A08
            X.141 r2 = X.C36441kJ.A0i(r1, r0)
            X.190 r1 = X.C36441kJ.A0j()
            android.content.Context r0 = r4.A0a()
            android.content.Intent r3 = r1.A1W(r0, r2)
            r1 = 7
            java.lang.String r0 = "args_conversation_screen_entry_point"
            r3.putExtra(r0, r1)
            boolean r1 = r4.A0D
            java.lang.String r0 = "isWAAccount"
            r3.putExtra(r0, r1)
            boolean r1 = r4.A0C
            java.lang.String r0 = "isPhoneNumberOwner"
            r3.putExtra(r0, r1)
            java.lang.String r1 = "entry_point_conversion_source"
            java.lang.String r0 = "phone_number_hyperlink"
            r3.putExtra(r1, r0)
            java.lang.String r1 = "entry_point_conversion_app"
            java.lang.String r0 = "whatsapp"
            r3.putExtra(r1, r0)
            X.1Dv r2 = r4.A00
            android.content.Context r1 = r4.A0a()
            java.lang.String r0 = "PhoneHyperLinkDialogFragment"
            r2.A08(r1, r3, r0)
            return
        L_0x0075:
            java.lang.Object r0 = r6.get(r7)
            X.61f r0 = (X.C1257761f) r0
            int r0 = r0.A00
            r5 = 0
            r2 = 4
            if (r0 != r2) goto L_0x00a0
            java.lang.Object r4 = r3.A00
            com.whatsapp.PhoneHyperLinkDialogFragment r4 = (com.whatsapp.PhoneHyperLinkDialogFragment) r4
            X.9Qc r1 = r4.A07
            r0 = 10
            A00(r4, r1, r0)
            X.16D r1 = r4.A05
            com.whatsapp.jid.UserJid r0 = r4.A08
            X.141 r3 = X.C36441kJ.A0i(r1, r0)
            X.1ND r2 = r4.A04
            android.content.Context r1 = r4.A0a()
            r0 = 33
            r2.Bua(r1, r3, r0, r5)
            return
        L_0x00a0:
            java.lang.Object r0 = r6.get(r7)
            X.61f r0 = (X.C1257761f) r0
            int r1 = r0.A00
            r0 = 2
            r4 = 0
            if (r1 != r0) goto L_0x00c5
            java.lang.Object r3 = r3.A00
            com.whatsapp.PhoneHyperLinkDialogFragment r3 = (com.whatsapp.PhoneHyperLinkDialogFragment) r3
            X.9Qc r0 = r3.A07
            A00(r3, r0, r2)
            X.1e2 r2 = r3.A02
            android.content.Context r1 = r3.A0a()
            java.lang.String r0 = r3.A0B
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r2.Bp7(r1, r0, r4)
            return
        L_0x00c5:
            java.lang.Object r0 = r6.get(r7)
            X.61f r0 = (X.C1257761f) r0
            int r1 = r0.A00
            r0 = 3
            if (r1 != r0) goto L_0x0017
            java.lang.Object r3 = r3.A00
            com.whatsapp.PhoneHyperLinkDialogFragment r3 = (com.whatsapp.PhoneHyperLinkDialogFragment) r3
            X.9Qc r1 = r3.A07
            r0 = 5
            A00(r3, r1, r0)
            X.1eE r1 = r3.A09
            java.lang.String r0 = r3.A0A
            r2 = 1
            android.content.Intent r1 = X.C32811eE.A00(r1, r0, r4, r2, r5)
            java.lang.String r0 = "finishActivityOnSaveCompleted"
            r1.putExtra(r0, r2)
            goto L_0x0280
        L_0x00ea:
            java.lang.Object r2 = r3.A00
            X.6C8 r2 = (X.AnonymousClass6C8) r2
            java.lang.Object r1 = r3.A01
            android.app.Dialog r1 = (android.app.Dialog) r1
            java.lang.String r0 = "on_press_negative"
            goto L_0x0011
        L_0x00f6:
            java.lang.Object r2 = r3.A00
            X.6C8 r2 = (X.AnonymousClass6C8) r2
            java.lang.Object r1 = r3.A01
            android.app.Dialog r1 = (android.app.Dialog) r1
            java.lang.String r0 = "on_press_neutral"
            goto L_0x0011
        L_0x0102:
            java.lang.Object r5 = r3.A00
            X.8Yw r5 = (X.C174898Yw) r5
            java.lang.Object r8 = r3.A01
            X.3T1 r8 = (X.AnonymousClass3T1) r8
            java.lang.String r0 = "scheduled-call/sendCancellationMessage"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0yC r1 = r5.A0G
            r0 = 4164(0x1044, float:5.835E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0144
            X.3Qa r3 = r8.A1J
            com.whatsapp.jid.UserJid r0 = r8.A0L()
            X.9Vv r9 = new X.9Vv
            r9.<init>(r0, r3)
            long r12 = r8.A1N
            X.11F r2 = r3.A00
            X.C18740tg.A06(r2)
            X.19w r1 = r5.A06
            boolean r0 = r3.A02
            X.3Qa r8 = r1.A02(r2, r0)
            X.0wo r0 = r5.A19
            long r10 = X.C19970wo.A00(r0)
            X.2bb r7 = new X.2bb
            r7.<init>(r8, r9, r10, r12)
            X.1YE r0 = r5.A05
            r0.A01(r7)
            return
        L_0x0144:
            X.005 r0 = r5.A08
            java.lang.Object r1 = r0.get()
            X.1TU r1 = (X.AnonymousClass1TU) r1
            X.0wQ r3 = r1.A00
            com.whatsapp.jid.PhoneUserJid r0 = X.C36441kJ.A0n(r3)
            if (r0 == 0) goto L_0x0017
            X.19w r2 = r1.A01
            X.3Qa r7 = r8.A1J
            X.11F r1 = r7.A00
            boolean r0 = r7.A02
            X.3Qa r6 = r2.A02(r1, r0)
            com.whatsapp.jid.PhoneUserJid r4 = X.C36441kJ.A0n(r3)
            r3 = 1
            long r0 = r8.A0I
            X.5JA r2 = new X.5JA
            r2.<init>((X.C64933Qa) r6, (long) r0)
            boolean r1 = r6.A02
            r0 = 8
            if (r1 == 0) goto L_0x0173
            r0 = 7
        L_0x0173:
            r2.A01 = r0
            r2.A0q(r4)
            r2.A00 = r3
            java.lang.String r0 = r7.A01
            r2.A02 = r0
            if (r1 != 0) goto L_0x0184
            X.11F r4 = r8.A0J()
        L_0x0184:
            r2.A01 = r4
            X.1SR r1 = r5.A02
            r0 = 0
            r1.A03(r2, r0)
            return
        L_0x018d:
            java.lang.Object r2 = r3.A00
            com.whatsapp.migration.export.ui.ExportMigrationActivity r2 = (com.whatsapp.migration.export.ui.ExportMigrationActivity) r2
            java.lang.Object r1 = r3.A01
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0 = 0
            com.whatsapp.migration.export.ui.ExportMigrationActivity.A01(r2, r0)
            if (r1 == 0) goto L_0x0017
            r1.run()
            return
        L_0x019f:
            java.lang.Object r0 = r3.A00
            X.02E r0 = (X.AnonymousClass02E) r0
            java.lang.Object r6 = r3.A01
            X.6c2 r6 = (X.C135046c2) r6
            r5 = 0
            r4 = 1
            X.01z r3 = r0.A0l()
            r0 = 2
            X.011[] r2 = new X.AnonymousClass011[r0]
            java.lang.String r1 = "action_type"
            java.lang.String r0 = "positive_button_clicked"
            goto L_0x01ca
        L_0x01b5:
            java.lang.Object r0 = r3.A00
            X.02E r0 = (X.AnonymousClass02E) r0
            java.lang.Object r6 = r3.A01
            X.6c2 r6 = (X.C135046c2) r6
            r5 = 0
            r4 = 1
            X.01z r3 = r0.A0l()
            r0 = 2
            X.011[] r2 = new X.AnonymousClass011[r0]
            java.lang.String r1 = "action_type"
            java.lang.String r0 = "negative_button_clicked"
        L_0x01ca:
            X.C36341k9.A1J(r1, r0, r2, r5)
            java.lang.String r1 = r6.A04
            java.lang.String r0 = "dialog_tag"
            X.C36341k9.A1J(r0, r1, r2, r4)
            android.os.Bundle r1 = X.C05430Pr.A00(r2)
            java.lang.String r0 = "message_dialog_action"
            r3.A0o(r0, r1)
            return
        L_0x01de:
            java.lang.Object r2 = r3.A00
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.Object r1 = r3.A01
            android.net.wifi.WifiManager r1 = (android.net.wifi.WifiManager) r1
            java.lang.String r0 = "disable wifi radio"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r1 == 0) goto L_0x01f1
            r0 = 0
            r1.setWifiEnabled(r0)
        L_0x01f1:
            r2.finish()
            return
        L_0x01f5:
            java.lang.Object r0 = r3.A00
            X.625 r0 = (X.AnonymousClass625) r0
            java.lang.Object r3 = r3.A01
            android.content.Context r3 = (android.content.Context) r3
            android.content.pm.PackageManager r2 = r3.getPackageManager()
            X.1fu r0 = r0.A00
            android.net.Uri r0 = r0.A00()
            android.content.Intent r1 = X.C36391kE.A0G(r0)
            r0 = 65536(0x10000, float:9.18355E-41)
            java.util.List r0 = r2.queryIntentActivities(r1, r0)
            X.AnonymousClass00C.A08(r0)
            boolean r0 = X.C36401kF.A1a(r0)
            if (r0 == 0) goto L_0x021d
            r3.startActivity(r1)
        L_0x021d:
            android.app.Activity r0 = X.C24801Dv.A00(r3)
            r0.finish()
            return
        L_0x0225:
            java.lang.Object r0 = r3.A00
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r2 = r3.A01
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r17.dismiss()
            android.os.Looper r1 = r0.getMainLooper()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r1)
            r0.post(r2)
            return
        L_0x023d:
            java.lang.Object r0 = r3.A00
            com.whatsapp.phonematching.ConnectionUnavailableDialogFragment r0 = (com.whatsapp.phonematching.ConnectionUnavailableDialogFragment) r0
            java.lang.Object r4 = r3.A01
            X.14u r4 = (X.C225314u) r4
            r0.A1b()
            X.0wU r1 = r0.A06
            X.3DY r5 = r0.A00
            X.0yb r7 = r0.A02
            X.1CF r10 = r0.A04
            X.0yE r8 = r0.A03
            X.3UV r11 = r0.A05
            X.0wD r6 = r0.A01
            r13 = 1
            r15 = 0
            java.lang.String r12 = ""
            r3 = 0
            X.2kA r2 = new X.2kA
            r14 = 1
            r9 = r3
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.String[] r0 = new java.lang.String[r15]
            r1.Box(r2, r0)
            return
        L_0x0268:
            java.lang.Object r1 = r3.A00
            X.5Mz r1 = (X.C107215Mz) r1
            java.lang.Object r0 = r3.A01
            android.app.Activity r0 = (android.app.Activity) r0
            r1.A0G(r0)
            return
        L_0x0274:
            java.lang.Object r1 = r3.A00
            X.5Mz r1 = (X.C107215Mz) r1
            java.lang.Object r0 = r3.A01
            android.app.Activity r0 = (android.app.Activity) r0
            r1.A0H(r0)
            return
        L_0x0280:
            r0 = 1000(0x3e8, float:1.401E-42)
            r3.startActivityForResult(r1, r0)     // Catch:{ ActivityNotFoundException -> 0x0286 }
            goto L_0x028f
        L_0x0286:
            X.17Y r1 = r3.A01
            r0 = 2131886365(0x7f12011d, float:1.9407307E38)
            r1.A06(r0, r5)
            return
        L_0x028f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C163437qC.onClick(android.content.DialogInterface, int):void");
    }
}
