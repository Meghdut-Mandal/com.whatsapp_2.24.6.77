package X;

import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;

/* renamed from: X.0c7  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C09280c7 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ Chip A00;

    public /* synthetic */ C09280c7(Chip chip) {
        this.A00 = chip;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        boolean A02;
        Chip chip = this.A00;
        C16110oZ r0 = chip.A05;
        if (r0 != null) {
            AnonymousClass0YY r1 = ((AnonymousClass0f2) r0).A00;
            if (z) {
                A02 = AnonymousClass0YY.A01(r1, chip);
            } else {
                A02 = AnonymousClass0YY.A02(r1, chip, r1.A01);
            }
            if (A02) {
                AnonymousClass0YY.A00(r1);
            }
        }
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.A03;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z);
        }
    }
}
