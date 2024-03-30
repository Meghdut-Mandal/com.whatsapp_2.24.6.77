package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.whatsapp.R;

/* renamed from: X.5Jg  reason: invalid class name and case insensitive filesystem */
public abstract class C106335Jg extends C92854es {
    public C20810yC A00;
    public final ChipGroup A01;

    public C106335Jg(Context context) {
        super(context);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        ChipGroup chipGroup = new ChipGroup(context);
        this.A01 = chipGroup;
        chipGroup.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        addView(chipGroup);
        boolean z = this instanceof C106315Je;
        Resources resources = getResources();
        if (z) {
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f7nameremoved);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            setPadding(dimensionPixelSize2, 0, dimensionPixelSize2, dimensionPixelSize);
        } else {
            int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.f7nameremoved);
            setPadding(dimensionPixelSize3, 0, dimensionPixelSize3, 0);
        }
        chipGroup.setChipSpacingHorizontal(getChipSpacingPx());
    }

    public static void A01(Context context, Chip chip, int i, int i2) {
        chip.setChipIcon(AnonymousClass3UF.A04(context, C36381kD.A0H(context, i), i2));
        chip.setChipIconSize(C90524aI.A01(context, 18.0f));
        chip.setChipStartPadding(C90524aI.A01(context, 1.0f));
        chip.setTextStartPadding(C90524aI.A01(context, 1.0f));
        chip.setIconStartPadding(C90524aI.A01(context, 8.0f));
        chip.setIconEndPadding(C90524aI.A01(context, 4.0f));
    }

    private int getChipSpacingPx() {
        return getResources().getDimensionPixelSize(R.dimen.f7nameremoved) * 2;
    }
}
