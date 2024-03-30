package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment;

/* renamed from: X.2vY  reason: invalid class name and case insensitive filesystem */
public class C56002vY implements DialogInterface.OnShowListener {
    public Object A00;
    public final int A01;

    public C56002vY(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onShow(DialogInterface dialogInterface) {
        Object obj;
        BottomSheetBehavior A02;
        int i;
        switch (this.A01) {
            case 0:
                VerifyTwoFactorAuthCodeDialogFragment verifyTwoFactorAuthCodeDialogFragment = (VerifyTwoFactorAuthCodeDialogFragment) this.A00;
                verifyTwoFactorAuthCodeDialogFragment.A04.A0H(new C1496972k(verifyTwoFactorAuthCodeDialogFragment, 36));
                return;
            case 1:
                C48892iE.A00(((AnonymousClass0FM) dialogInterface).A00.A0H, this.A00, 4);
                return;
            case 2:
                BottomSheetBehavior A022 = BottomSheetBehavior.A02(AnonymousClass0PN.A00((Dialog) dialogInterface, R.id.design_bottom_sheet));
                A022.A0W(3);
                A022.A0h = true;
                return;
            case 3:
                obj = this.A00;
                A02 = BottomSheetBehavior.A02(((Dialog) dialogInterface).findViewById(R.id.design_bottom_sheet));
                A02.A0W(3);
                i = 5;
                break;
            default:
                obj = this.A00;
                View findViewById = ((Dialog) dialogInterface).findViewById(R.id.design_bottom_sheet);
                if (findViewById != null) {
                    A02 = BottomSheetBehavior.A02(findViewById);
                    A02.A0W(3);
                    i = 14;
                    break;
                } else {
                    return;
                }
        }
        C89194Vp.A00(A02, obj, i);
    }
}
