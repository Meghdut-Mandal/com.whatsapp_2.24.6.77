package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.whatsapp.payments.IndiaUpiPaymentInvitePickerActivity;
import com.whatsapp.registration.phonenumberentry.RegisterPhone;
import com.whatsapp.registration.verifyphone.VerifyPhoneNumber;
import com.whatsapp.textstatuscomposer.TextStatusComposerActivity;

/* renamed from: X.4Yj  reason: invalid class name and case insensitive filesystem */
public class C89914Yj implements DialogInterface.OnDismissListener {
    public Object A00;
    public final int A01;

    public C89914Yj(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.A01) {
            case 0:
                C36351kA.A11((Activity) this.A00);
                return;
            case 1:
                ((AnonymousClass4Q0) this.A00).B2t();
                return;
            case 2:
                ((IndiaUpiPaymentInvitePickerActivity) this.A00).A49();
                return;
            case 3:
                ((C47072cl) this.A00).Bdw();
                return;
            case 4:
                ((RegisterPhone) this.A00).A07 = null;
                return;
            case 5:
                VerifyPhoneNumber.A1B((VerifyPhoneNumber) this.A00);
                return;
            default:
                ((TextStatusComposerActivity) this.A00).A0s = false;
                return;
        }
    }
}
