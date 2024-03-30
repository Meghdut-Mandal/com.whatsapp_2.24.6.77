package X;

import android.content.Context;
import android.content.Intent;
import android.widget.Button;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.DisplayExceptionDialogFactory$ClockWrongDialogFragment;
import com.whatsapp.DisplayExceptionDialogFactory$LoginFailedDialogFragment;
import com.whatsapp.DisplayExceptionDialogFactory$SoftwareExpiredDialogFragment;
import com.whatsapp.R;
import com.whatsapp.registration.accountdefence.ui.DeviceConfirmationRegAlertDialogFragment;

/* renamed from: X.3SK  reason: invalid class name */
public abstract class AnonymousClass3SK {
    public static boolean A00(C225014r r5, C63063Ip r6) {
        if (r5 == null || r5.BLh() || !(r5 instanceof C225314u) || !(!(r5 instanceof C16160oi))) {
            return false;
        }
        DialogFragment A2l = ((C225314u) r5).A2l(DeviceConfirmationRegAlertDialogFragment.class);
        if (A2l instanceof DeviceConfirmationRegAlertDialogFragment) {
            DeviceConfirmationRegAlertDialogFragment deviceConfirmationRegAlertDialogFragment = (DeviceConfirmationRegAlertDialogFragment) A2l;
            Button button = deviceConfirmationRegAlertDialogFragment.A02;
            if (button != null) {
                button.setVisibility(4);
            }
            Button button2 = deviceConfirmationRegAlertDialogFragment.A01;
            if (button2 != null) {
                button2.setVisibility(4);
            }
            C36351kA.A1A(deviceConfirmationRegAlertDialogFragment.A00, R.id.move_device_alert_info_and_buttons, 4);
            C012005e.A02(deviceConfirmationRegAlertDialogFragment.A00, R.id.loading_icon_and_message_layout).setVisibility(0);
            deviceConfirmationRegAlertDialogFragment.A00.postDelayed(C80313vC.A00(deviceConfirmationRegAlertDialogFragment, r6, 30), 1000);
            return true;
        }
        r5.Btm(new DeviceConfirmationRegAlertDialogFragment(r6));
        return true;
    }

    public static boolean A01(C225014r r4, AnonymousClass1RU r5, C20810yC r6) {
        if (r4.BLh() || !(r4 instanceof C225314u) || ((r4 instanceof C87464Ox) && !((C87464Ox) r4).Bge())) {
            return false;
        }
        if (!(!r5.A0A()) || !r6.A0E(6719)) {
            C225314u r2 = (C225314u) r4;
            DialogFragment A2l = r2.A2l(DeviceConfirmationRegAlertDialogFragment.class);
            if (A2l instanceof DeviceConfirmationRegAlertDialogFragment) {
                A2l.A1b();
            }
            r2.A3D("DoNotShareCodeDialogTag");
            r4.Btl(new DisplayExceptionDialogFactory$LoginFailedDialogFragment(), "login_failed");
            return true;
        }
        Context context = (Context) r4;
        Intent A0D = C36431kI.A0D();
        A0D.setClassName(context.getPackageName(), "com.whatsapp.loginfailure.LogoutMessageActivity");
        context.startActivity(A0D);
        return true;
    }

    public static boolean A02(C225014r r2, C20720y3 r3, C28361Si r4) {
        if (r2.BLh() || !(r2 instanceof C225314u)) {
            return false;
        }
        r4.A01 = true;
        r3.A0G(true, 17);
        r2.Btm(new DisplayExceptionDialogFactory$ClockWrongDialogFragment());
        return true;
    }

    public static boolean A03(C225014r r2, C20720y3 r3, C28361Si r4) {
        if (r2.BLh() || !(r2 instanceof C225314u)) {
            return false;
        }
        r4.A01 = true;
        r3.A0G(true, 17);
        r2.Btm(new DisplayExceptionDialogFactory$SoftwareExpiredDialogFragment());
        return true;
    }
}
