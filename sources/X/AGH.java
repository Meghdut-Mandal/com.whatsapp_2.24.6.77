package X;

import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

public class AGH implements B1Y {
    public final /* synthetic */ AnonymousClass155 A00;
    public final /* synthetic */ FingerprintBottomSheet A01;
    public final /* synthetic */ PinBottomSheetDialogFragment A02;
    public final /* synthetic */ C167667yX A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public AGH(AnonymousClass155 r1, FingerprintBottomSheet fingerprintBottomSheet, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, C167667yX r4, String str, String str2, String str3) {
        this.A03 = r4;
        this.A05 = str;
        this.A04 = str2;
        this.A00 = r1;
        this.A06 = str3;
        this.A02 = pinBottomSheetDialogFragment;
        this.A01 = fingerprintBottomSheet;
    }

    public void Bgg() {
        C167667yX r3 = this.A03;
        String str = this.A05;
        String str2 = this.A04;
        AnonymousClass155 r1 = this.A00;
        String str3 = this.A06;
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A02;
        pinBottomSheetDialogFragment.A09 = new AGK(r1, pinBottomSheetDialogFragment, r3, str2, str3, str);
        r1.Btm(pinBottomSheetDialogFragment);
    }

    public void BiK(byte[] bArr) {
        C167667yX r7 = this.A03;
        C200959iX r2 = r7.A07;
        String str = this.A06;
        AnonymousClass9SY r3 = new AnonymousClass9SY(this.A00, this.A01, (PinBottomSheetDialogFragment) null, r7, this.A05, this.A04, str, 0);
        C200959iX.A00(new AGI(r3, bArr), new BAJ(r3, 0), r2, str);
    }
}
