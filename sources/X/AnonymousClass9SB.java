package X;

import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.util.Log;

/* renamed from: X.9SB  reason: invalid class name */
public class AnonymousClass9SB {
    public final /* synthetic */ String A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass155 A02;
    public final /* synthetic */ PinBottomSheetDialogFragment A03;
    public final /* synthetic */ C180358ld A04;

    public AnonymousClass9SB(AnonymousClass155 r1, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, C180358ld r3, String str, int i) {
        this.A04 = r3;
        this.A01 = i;
        this.A03 = pinBottomSheetDialogFragment;
        this.A02 = r1;
        this.A00 = str;
    }

    public void A00(C202059ky r4) {
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment;
        Log.i("DyiViewModel/request-report/on-error");
        int i = r4.A00;
        if (i == 1440 || i == 444 || i == 478 || i == 1441 || i == 445 || i == 1448 || i == 10718) {
            C180358ld r2 = this.A04;
            String str = this.A00;
            C18740tg.A06(str);
            r2.A0U(r4, this.A03, str);
            return;
        }
        if (this.A01 == 1 && (pinBottomSheetDialogFragment = this.A03) != null) {
            pinBottomSheetDialogFragment.A1p();
            pinBottomSheetDialogFragment.A1b();
        }
        C180358ld r22 = this.A04;
        C001700s r0 = r22.A02;
        Integer A0m = C36381kD.A0m();
        r0.A0C(A0m);
        C165587tf.A11(r22.A03, A0m, r4);
    }
}
