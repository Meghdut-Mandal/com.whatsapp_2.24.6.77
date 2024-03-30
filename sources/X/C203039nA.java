package X;

import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* renamed from: X.9nA  reason: invalid class name and case insensitive filesystem */
public class C203039nA implements B1R {
    public Object A00;
    public Object A01;
    public final int A02;

    public C203039nA(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void BWg(C202059ky r6) {
        if (this.A02 != 0) {
            PinBottomSheetDialogFragment pinBottomSheetDialogFragment = (PinBottomSheetDialogFragment) this.A01;
            if (pinBottomSheetDialogFragment != null) {
                pinBottomSheetDialogFragment.A1p();
            }
            C36321k7.A1J(r6, "PAY: FbPayHubActivity/PaymentStepUpWebviewAction onError: ", AnonymousClass000.A0u());
            int i = r6.A00;
            if (i == 1441) {
                C202239lN r3 = (C202239lN) this.A00;
                C196039Xk r2 = r3.A0C;
                long j = r6.A02;
                r2.A02(j);
                if (pinBottomSheetDialogFragment != null) {
                    C165607th.A1F(pinBottomSheetDialogFragment, j);
                } else {
                    r3.A03();
                }
            } else {
                if (i == 1440) {
                    if (pinBottomSheetDialogFragment != null) {
                        pinBottomSheetDialogFragment.A1r(r6.A01, R.plurals.f10nameremoved);
                        return;
                    }
                } else if (i == 455) {
                    if (pinBottomSheetDialogFragment != null) {
                        pinBottomSheetDialogFragment.A1c();
                    }
                    ((C202239lN) this.A00).A02();
                    return;
                } else {
                    if (i == 1448) {
                        ((C202239lN) this.A00).A0A.A02(r6, "FB", "PIN");
                    }
                    if (pinBottomSheetDialogFragment != null) {
                        pinBottomSheetDialogFragment.A1c();
                    }
                }
                ((C202239lN) this.A00).A03();
            }
        } else {
            ((C006302t) this.A00).invoke(r6);
        }
    }

    public void BiE(String str, String str2) {
        if (this.A02 != 0) {
            DialogFragment dialogFragment = (DialogFragment) this.A01;
            if (dialogFragment != null) {
                dialogFragment.A1c();
            }
            AnonymousClass02E r3 = (AnonymousClass02E) ((C202239lN) this.A00).A0D;
            AnonymousClass01I A0i = r3.A0i();
            C18740tg.A05(str);
            r3.startActivityForResult(AnonymousClass190.A1L(A0i, str, str2, true, false), 1);
            return;
        }
        AnonymousClass00C.A0D(str, 0);
        ((C009003v) this.A01).invoke(str, str2);
    }
}
