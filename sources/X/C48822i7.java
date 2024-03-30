package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.glasses.BluetoothPermissionDialogFragment;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.loginfailure.LogoutMessageActivity;

/* renamed from: X.2i7  reason: invalid class name and case insensitive filesystem */
public class C48822i7 extends C33541fX {
    public Object A00;
    public Object A01;
    public boolean A02;
    public final int A03;

    public C48822i7(Object obj, Object obj2, int i, boolean z) {
        this.A03 = i;
        this.A01 = obj;
        this.A00 = obj2;
        this.A02 = z;
    }

    public void A02(View view) {
        switch (this.A03) {
            case 0:
                if (this.A02) {
                    BluetoothPermissionDialogFragment bluetoothPermissionDialogFragment = (BluetoothPermissionDialogFragment) this.A01;
                    bluetoothPermissionDialogFragment.A05 = true;
                    AnonymousClass3UJ.A06(bluetoothPermissionDialogFragment.A0i());
                    return;
                }
                ((Dialog) this.A00).dismiss();
                AnonymousClass3US r3 = RequestPermissionActivity.A0B;
                BluetoothPermissionDialogFragment bluetoothPermissionDialogFragment2 = (BluetoothPermissionDialogFragment) this.A01;
                C19420v0 r1 = bluetoothPermissionDialogFragment2.A03;
                if (r1 != null) {
                    r3.A0F(bluetoothPermissionDialogFragment2, r1, bluetoothPermissionDialogFragment2.A06);
                    return;
                }
                throw C36331k8.A0d("waSharedPreferences");
            case 1:
                LogoutMessageActivity logoutMessageActivity = (LogoutMessageActivity) this.A01;
                PhoneUserJid A0j = C36411kG.A0j(logoutMessageActivity);
                if (A0j != null) {
                    C19420v0 r0 = logoutMessageActivity.A09;
                    C36341k9.A0x(C19420v0.A00(r0), "saved_user_before_logout", A0j.user);
                }
                boolean z = this.A02;
                String A0t = C36371kC.A0t(C36331k8.A06(logoutMessageActivity), "main_button_url");
                if (!z || A0t == null || AnonymousClass6RR.A00(A0t)) {
                    String A0h = logoutMessageActivity.A09.A0h();
                    AnonymousClass00C.A08(A0h);
                    String A0f = logoutMessageActivity.A09.A0f();
                    AnonymousClass00C.A08(A0f);
                    Intent A022 = AnonymousClass190.A02(logoutMessageActivity);
                    if (C36431kI.A08(logoutMessageActivity) < C36341k9.A0B(C36331k8.A06(logoutMessageActivity), "post_reg_notification_time") + 1800000) {
                        A022.putExtra("com.whatsapp.registration.RegisterPhone.phone_number", A0h);
                        A022.putExtra("com.whatsapp.registration.RegisterPhone.country_code", A0f);
                        A022.putExtra("com.whatsapp.registration.RegisterPhone.clear_phone_number", false);
                    }
                    C29501Ww r02 = logoutMessageActivity.A01;
                    if (r02 != null) {
                        r02.A03();
                        C29501Ww r12 = logoutMessageActivity.A01;
                        if (r12 != null) {
                            C29501Ww.A02(r12, 0, true);
                            logoutMessageActivity.startActivity(A022);
                        } else {
                            throw C36331k8.A0d("registrationManager");
                        }
                    } else {
                        throw C36331k8.A0d("registrationManager");
                    }
                } else {
                    C32691e2 r13 = logoutMessageActivity.A00;
                    if (r13 != null) {
                        C36331k8.A0t((Context) this.A00, r13, A0t);
                    } else {
                        throw C36331k8.A0d("linkLauncher");
                    }
                }
                AnonymousClass0XN.A00((Activity) this.A00);
                return;
            default:
                LogoutMessageActivity logoutMessageActivity2 = (LogoutMessageActivity) this.A01;
                C32691e2 r4 = logoutMessageActivity2.A00;
                if (r4 != null) {
                    Activity activity = (Activity) this.A00;
                    boolean z2 = this.A02;
                    String A0t2 = C36371kC.A0t(C36331k8.A06(logoutMessageActivity2), "secondary_button_url");
                    if (!z2 || A0t2 == null || AnonymousClass6RR.A00(A0t2)) {
                        A0t2 = null;
                    }
                    C36331k8.A0t(activity, r4, A0t2);
                    AnonymousClass0XN.A00(activity);
                    return;
                }
                throw C36331k8.A0d("linkLauncher");
        }
    }
}
