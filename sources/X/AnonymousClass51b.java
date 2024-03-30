package X;

import android.content.Context;
import android.content.res.ColorStateList;
import com.google.android.material.chip.Chip;
import com.whatsapp.R;

/* renamed from: X.51b  reason: invalid class name */
public abstract class AnonymousClass51b extends C96974oC {
    public final Chip A00;

    public void A0B(C125345zl r6) {
        Chip chip = this.A00;
        Context context = chip.getContext();
        boolean A002 = r6.A00();
        int i = R.color.f6nameremoved;
        if (!A002) {
            i = C90484aE.A08(context);
        }
        C36331k8.A0r(context, chip, i);
        Context context2 = chip.getContext();
        int i2 = R.attr.f4nameremoved;
        int i3 = R.color.f6nameremoved;
        if (A002) {
            i2 = R.attr.f4nameremoved;
            i3 = R.color.f6nameremoved;
        }
        chip.setChipBackgroundColorResource(C224514j.A00(context2, i2, i3));
        Context context3 = chip.getContext();
        int i4 = R.color.f6nameremoved;
        if (!A002) {
            i4 = C90484aE.A08(context3);
        }
        chip.setCloseIconTintResource(i4);
        chip.setCloseIconVisible(false);
        chip.A04.A0S((ColorStateList) null);
        Context context4 = chip.getContext();
        int i5 = R.color.f6nameremoved;
        if (!A002) {
            i5 = C90484aE.A08(context4);
        }
        chip.setChipIconTintResource(i5);
        chip.setChipIconSize(C36441kJ.A00(C36341k9.A0F(chip), R.dimen.f7nameremoved));
    }

    public AnonymousClass51b(Chip chip, C160627lJ r2) {
        super(chip, r2);
        this.A00 = chip;
    }
}
