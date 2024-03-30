package X;

import android.view.View;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

public class AGK implements B1Z {
    public final /* synthetic */ AnonymousClass155 A00;
    public final /* synthetic */ PinBottomSheetDialogFragment A01;
    public final /* synthetic */ C167667yX A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public AGK(AnonymousClass155 r1, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, C167667yX r3, String str, String str2, String str3) {
        this.A02 = r3;
        this.A01 = pinBottomSheetDialogFragment;
        this.A03 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A00 = r1;
    }

    public void BU3(String str) {
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A01;
        pinBottomSheetDialogFragment.A1q();
        C167667yX r5 = this.A02;
        C200959iX r12 = r5.A07;
        String str2 = this.A03;
        String str3 = this.A05;
        AnonymousClass9SY r1 = new AnonymousClass9SY(this.A00, (FingerprintBottomSheet) null, pinBottomSheetDialogFragment, r5, this.A04, str2, str3, 1);
        C200959iX.A00(new C23194B9c(r1, r12, str, str2, 1), new BAJ(r1, 1), r12, str3);
    }

    public void BYJ(View view) {
        C36331k8.A13(this.A02.A00);
    }
}
