package X;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.material.chip.ChipGroup;
import com.whatsapp.R;

/* renamed from: X.5Jh  reason: invalid class name and case insensitive filesystem */
public abstract class C106345Jh extends C92954fE {
    public C20810yC A00;
    public final ChipGroup A01;

    public final void setAbProps(C20810yC r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final C20810yC getAbProps() {
        C20810yC r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A07();
    }

    public C106345Jh(Context context) {
        super(context);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setHorizontalScrollBarEnabled(false);
        ChipGroup chipGroup = new ChipGroup(context);
        this.A01 = chipGroup;
        chipGroup.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        chipGroup.A03 = true;
        chipGroup.setChipSpacingHorizontal(getChipSpacingPx());
        addView(chipGroup);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
    }

    private final int getChipSpacingPx() {
        return getResources().getDimensionPixelSize(R.dimen.f7nameremoved) * 2;
    }

    public final ChipGroup getChipGroup() {
        return this.A01;
    }
}
