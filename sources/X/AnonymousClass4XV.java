package X;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: X.4XV  reason: invalid class name */
public class AnonymousClass4XV implements DialogInterface.OnCancelListener {
    public Object A00;
    public final int A01;

    public AnonymousClass4XV(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(Dialog dialog, Object obj, int i) {
        dialog.setOnCancelListener(new AnonymousClass4XV(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b9, code lost:
        X.AnonymousClass3SJ.A01(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00bc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c3, code lost:
        r0.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e3, code lost:
        X.AnonymousClass3SJ.A00(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e6, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCancel(android.content.DialogInterface r4) {
        /*
            r3 = this;
            int r0 = r3.A01
            switch(r0) {
                case 0: goto L_0x0022;
                case 1: goto L_0x002a;
                case 2: goto L_0x0037;
                case 3: goto L_0x003d;
                case 4: goto L_0x0045;
                case 5: goto L_0x004e;
                case 6: goto L_0x0062;
                case 7: goto L_0x0071;
                case 8: goto L_0x000e;
                case 9: goto L_0x0080;
                case 10: goto L_0x0088;
                case 11: goto L_0x0090;
                case 12: goto L_0x0005;
                case 13: goto L_0x0099;
                case 14: goto L_0x0099;
                case 15: goto L_0x0005;
                case 16: goto L_0x00a5;
                case 17: goto L_0x00af;
                case 18: goto L_0x00bd;
                case 19: goto L_0x00c7;
                case 20: goto L_0x00ce;
                case 21: goto L_0x0005;
                case 22: goto L_0x00d6;
                case 23: goto L_0x00dd;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r3.A00
            X.6Tt r1 = (X.C132446Tt) r1
            r0 = 1
            r1.A0D(r0)
        L_0x000d:
            return
        L_0x000e:
            java.lang.Object r2 = r3.A00
            com.whatsapp.contact.picker.ContactPickerFragment r2 = (com.whatsapp.contact.picker.ContactPickerFragment) r2
            X.01I r1 = r2.A0h()
            r0 = 1
            X.AnonymousClass3SJ.A00(r1, r0)
            X.0V9 r0 = r2.A0E
            if (r0 == 0) goto L_0x000d
            r0.A05()
            return
        L_0x0022:
            java.lang.Object r0 = r3.A00
            X.4Se r0 = (X.C88304Se) r0
            r0.BeZ()
            return
        L_0x002a:
            java.lang.Object r0 = r3.A00
            X.C36411kG.A1N(r0)
            int r0 = android.os.Process.myPid()
            android.os.Process.killProcess(r0)
            return
        L_0x0037:
            java.lang.Object r0 = r3.A00
            android.app.Activity r0 = (android.app.Activity) r0
            goto L_0x00c3
        L_0x003d:
            java.lang.Object r0 = r3.A00
            X.4P4 r0 = (X.AnonymousClass4P4) r0
            r0.BeZ()
            return
        L_0x0045:
            java.lang.Object r1 = r3.A00
            com.whatsapp.accountswitching.secondaryprocess.AccountSwitchingActivity r1 = (com.whatsapp.accountswitching.secondaryprocess.AccountSwitchingActivity) r1
            r0 = 0
            com.whatsapp.accountswitching.secondaryprocess.AccountSwitchingActivity.A0F(r1, r0)
            return
        L_0x004e:
            java.lang.Object r0 = r3.A00
            com.whatsapp.avatar.profilephoto.AvatarProfilePhotoErrorDialog r0 = (com.whatsapp.avatar.profilephoto.AvatarProfilePhotoErrorDialog) r0
            X.00T r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel r0 = (com.whatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel) r0
            X.1Rs r1 = r0.A08
            X.5Rr r0 = X.AnonymousClass5Rr.CLOSE_SCREEN
            r1.A0D(r0)
            return
        L_0x0062:
            java.lang.Object r0 = r3.A00
            X.01I r1 = X.C36441kJ.A0X(r0)
            X.C18740tg.A06(r1)
            X.4y9 r1 = (X.C101704y9) r1
            r0 = 1
            r1.A0S = r0
            return
        L_0x0071:
            java.lang.Object r0 = r3.A00
            X.01I r1 = X.C36441kJ.A0X(r0)
            X.C18740tg.A06(r1)
            com.whatsapp.backup.google.SettingsGoogleDrive r1 = (com.whatsapp.backup.google.SettingsGoogleDrive) r1
            r0 = 1
            r1.A0y = r0
            return
        L_0x0080:
            java.lang.Object r0 = r3.A00
            X.01I r0 = X.C36441kJ.A0X(r0)
            r1 = 2
            goto L_0x00e3
        L_0x0088:
            java.lang.Object r0 = r3.A00
            X.01I r0 = X.C36441kJ.A0X(r0)
            r1 = 3
            goto L_0x00e3
        L_0x0090:
            java.lang.Object r1 = r3.A00
            X.227 r1 = (X.AnonymousClass227) r1
            android.app.Activity r0 = r1.A00
            int r1 = r1.A08
            goto L_0x00e3
        L_0x0099:
            java.lang.Object r1 = r3.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            r1.finish()
            return
        L_0x00a5:
            java.lang.Object r1 = r3.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 5
            X.AnonymousClass3SJ.A00(r1, r0)
            r0 = 6
            goto L_0x00b9
        L_0x00af:
            java.lang.Object r1 = r3.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 7
            X.AnonymousClass3SJ.A00(r1, r0)
            r0 = 8
        L_0x00b9:
            X.AnonymousClass3SJ.A01(r1, r0)
            return
        L_0x00bd:
            java.lang.Object r0 = r3.A00
            X.1kT r0 = (X.C36541kT) r0
            android.app.Activity r0 = r0.A00
        L_0x00c3:
            r0.finish()
            return
        L_0x00c7:
            java.lang.Object r0 = r3.A00
            android.app.Activity r0 = (android.app.Activity) r0
            r1 = 13
            goto L_0x00e3
        L_0x00ce:
            java.lang.Object r0 = r3.A00
            com.whatsapp.status.playback.MessageReplyActivity r0 = (com.whatsapp.status.playback.MessageReplyActivity) r0
            com.whatsapp.status.playback.MessageReplyActivity.A0O(r0)
            return
        L_0x00d6:
            java.lang.Object r0 = r3.A00
            android.app.Activity r0 = (android.app.Activity) r0
            r1 = 27
            goto L_0x00e3
        L_0x00dd:
            java.lang.Object r0 = r3.A00
            android.app.Activity r0 = (android.app.Activity) r0
            r1 = 26
        L_0x00e3:
            X.AnonymousClass3SJ.A00(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4XV.onCancel(android.content.DialogInterface):void");
    }
}
