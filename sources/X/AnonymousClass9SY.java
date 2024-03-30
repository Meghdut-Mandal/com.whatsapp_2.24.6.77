package X;

import com.whatsapp.R;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.util.Log;

/* renamed from: X.9SY  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9SY {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass155 A01;
    public final /* synthetic */ FingerprintBottomSheet A02;
    public final /* synthetic */ PinBottomSheetDialogFragment A03;
    public final /* synthetic */ C167667yX A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public /* synthetic */ AnonymousClass9SY(AnonymousClass155 r1, FingerprintBottomSheet fingerprintBottomSheet, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, C167667yX r4, String str, String str2, String str3, int i) {
        this.A04 = r4;
        this.A00 = i;
        this.A03 = pinBottomSheetDialogFragment;
        this.A02 = fingerprintBottomSheet;
        this.A05 = str;
        this.A06 = str2;
        this.A01 = r1;
        this.A07 = str3;
    }

    public final void A00(C202059ky r17, C203399nx r18) {
        C167667yX r5 = this.A04;
        int i = this.A00;
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A03;
        FingerprintBottomSheet fingerprintBottomSheet = this.A02;
        String str = this.A05;
        String str2 = this.A06;
        AnonymousClass155 r3 = this.A01;
        String str3 = this.A07;
        C202059ky r1 = r17;
        if (r17 != null) {
            if (i == 1 && pinBottomSheetDialogFragment != null) {
                pinBottomSheetDialogFragment.A1p();
            }
            r5.A03.A0C(r1);
            return;
        }
        if (i == 0 && fingerprintBottomSheet != null) {
            fingerprintBottomSheet.A1c();
        }
        C203399nx r6 = r18;
        if (r5 instanceof C180358ld) {
            C180358ld r52 = (C180358ld) r5;
            Log.i("DyiViewModel/request-report/on-pin-node-ready");
            if (!str2.equals("DYIREPORT")) {
                Log.e("DyiViewModel/request-report/on-pin-node-ready :: no matching actions");
                return;
            }
            if (i == 0) {
                r3.Bu1(R.string.f12nameremoved);
            }
            r52.A0V(new AnonymousClass9SB(r3, pinBottomSheetDialogFragment, r52, str3, i), r6, str);
            return;
        }
        C180348lc r53 = (C180348lc) r5;
        if (i == 0) {
            r3.Bu1(R.string.f12nameremoved);
        }
        r53.A04.Boy(new AVv(r3, pinBottomSheetDialogFragment, r53, r6, str3, str, i));
    }
}
