package X;

import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

public class AGG implements B1Y {
    public final /* synthetic */ FingerprintBottomSheet A00;
    public final /* synthetic */ C202239lN A01;

    public AGG(FingerprintBottomSheet fingerprintBottomSheet, C202239lN r2) {
        this.A01 = r2;
        this.A00 = fingerprintBottomSheet;
    }

    public void Bgg() {
        C202239lN r3 = this.A01;
        PinBottomSheetDialogFragment A002 = AnonymousClass9TJ.A00();
        A002.A09 = new BAM(A002, r3, 1);
        r3.A05.Btl(A002, (String) null);
    }

    public void BiK(byte[] bArr) {
        FingerprintBottomSheet fingerprintBottomSheet = this.A00;
        fingerprintBottomSheet.A1c();
        C202239lN r3 = this.A01;
        AnonymousClass155 r6 = r3.A05;
        AnonymousClass17Y r7 = r3.A04;
        C29121Vk r9 = r3.A09;
        C29221Vu r8 = r3.A07;
        C200049gU r10 = r3.A0A;
        AnonymousClass9SR r5 = new AnonymousClass9SR(r6, r7, r8, r9, r10, "PIN");
        AF3 A012 = r10.A01("FB", "PIN");
        if (A012 != null) {
            C203399nx A013 = new C194449Pt(A012).A01(bArr);
            fingerprintBottomSheet.A1c();
            r3.A06((PinBottomSheetDialogFragment) null, A013);
            return;
        }
        r5.A00(new C23195B9d(bArr, this, 2), "FB");
    }
}
