package X;

import androidx.fragment.app.DialogFragment;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* renamed from: X.AEl  reason: case insensitive filesystem */
public class C21255AEl implements B1Q {
    public final /* synthetic */ BAM A00;
    public final /* synthetic */ String A01;

    public C21255AEl(BAM bam, String str) {
        this.A00 = bam;
        this.A01 = str;
    }

    public void Bdl(C202059ky r3) {
        BAM bam = this.A00;
        ((DialogFragment) bam.A01).A1c();
        ((C202239lN) bam.A00).A03();
    }

    public void Bdm(AF3 af3) {
        BAM bam = this.A00;
        C194449Pt r2 = new C194449Pt(af3);
        String str = this.A01;
        C202239lN.A01(r2, (PinBottomSheetDialogFragment) bam.A01, (C202239lN) bam.A00, str);
    }
}
