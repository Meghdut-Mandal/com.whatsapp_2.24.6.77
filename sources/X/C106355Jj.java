package X;

import android.content.Context;
import com.google.android.material.chip.Chip;
import com.whatsapp.R;

/* renamed from: X.5Jj  reason: invalid class name and case insensitive filesystem */
public final class C106355Jj extends C106345Jh {
    public boolean A00;

    public final void setCommonViewAttributes(Chip chip) {
        AnonymousClass00C.A0D(chip, 0);
        chip.setClickable(true);
        chip.setChipIconTintResource(R.color.f6nameremoved);
        C90464aC.A0r(chip.getContext(), chip, C90484aE.A08(chip.getContext()));
        C90474aD.A0y(this);
    }

    public C106355Jj(Context context) {
        super(context);
        if (!this.A00) {
            this.A00 = true;
            this.A00 = C36341k9.A0V(((C27861Qc) ((C27851Qb) generatedComponent())).A0M);
        }
        C36381kD.A1A(this, -1, -2);
    }
}
