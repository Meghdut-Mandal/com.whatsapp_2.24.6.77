package X;

import com.google.android.material.chip.Chip;
import com.whatsapp.R;

/* renamed from: X.51a  reason: invalid class name and case insensitive filesystem */
public class C1026551a extends AnonymousClass51b {
    public final C18820ts A00;

    public void A0B(C125345zl r5) {
        Chip chip = this.A00;
        chip.setChipIconResource(R.drawable.ic_business_location);
        chip.setChipIconVisible(true);
        super.A0B(r5);
        boolean A03 = AnonymousClass6W7.A03(C36401kF.A0x(this.A00));
        int i = R.string.f12nameremoved;
        int i2 = R.string.f12nameremoved;
        if (A03) {
            i = R.string.f12nameremoved;
            i2 = R.string.f12nameremoved;
        }
        chip.setText(i);
        C36331k8.A0q(chip.getContext(), chip, i2);
        C36411kG.A1C(chip, this, r5, 29);
    }

    public C1026551a(Chip chip, C160627lJ r2, C18820ts r3) {
        super(chip, r2);
        this.A00 = r3;
    }
}
