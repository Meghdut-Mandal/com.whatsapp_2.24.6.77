package X;

import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.payments.ui.BrazilAccountRecoveryPinActivity;

/* renamed from: X.B8x  reason: case insensitive filesystem */
public class C23189B8x implements C88294Sd {
    public Object A00;
    public final int A01;

    public C23189B8x(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BTv(String str) {
        B1Z b1z;
        int i = this.A01;
        int length = str.length();
        if (i != 0) {
            if (length != 6 || (b1z = ((BrazilAccountRecoveryPinActivity) this.A00).A03) == null) {
                return;
            }
        } else if (length == 6) {
            PinBottomSheetDialogFragment pinBottomSheetDialogFragment = (PinBottomSheetDialogFragment) this.A00;
            if (pinBottomSheetDialogFragment.A09 != null && pinBottomSheetDialogFragment.A00 <= C19970wo.A00(pinBottomSheetDialogFragment.A05)) {
                b1z = pinBottomSheetDialogFragment.A09;
            } else {
                return;
            }
        } else {
            return;
        }
        b1z.BU3(str);
    }

    public void Bbi(String str) {
        B1Z b1z;
        int i = this.A01;
        int length = str.length();
        if (i != 0) {
            if (length != 6 || (b1z = ((BrazilAccountRecoveryPinActivity) this.A00).A03) == null) {
                return;
            }
        } else if (length == 6) {
            PinBottomSheetDialogFragment pinBottomSheetDialogFragment = (PinBottomSheetDialogFragment) this.A00;
            if (pinBottomSheetDialogFragment.A09 != null && pinBottomSheetDialogFragment.A00 <= C19970wo.A00(pinBottomSheetDialogFragment.A05)) {
                b1z = pinBottomSheetDialogFragment.A09;
            } else {
                return;
            }
        } else {
            return;
        }
        b1z.BU3(str);
    }
}
