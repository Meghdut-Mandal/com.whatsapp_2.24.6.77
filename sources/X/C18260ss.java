package X;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* renamed from: X.0ss  reason: invalid class name and case insensitive filesystem */
public class C18260ss extends AnonymousClass0UG {
    public Object A00;
    public final int A01;

    public C18260ss(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A00(int i) {
        if (this.A01 != 0) {
            AnonymousClass0UX r1 = (AnonymousClass0UX) this.A00;
            r1.A02 = true;
            AnonymousClass08G r0 = (AnonymousClass08G) r1.A01.get();
            if (r0 != null) {
                r0.Bj0();
            }
        }
    }

    public void A01(Typeface typeface, boolean z) {
        CharSequence text;
        if (this.A01 == 0) {
            Chip chip = (Chip) this.A00;
            AnonymousClass0NO r1 = chip.A04;
            if (r1.A0g) {
                text = r1.A0Z;
            } else {
                text = chip.getText();
            }
            chip.setText(text);
            chip.requestLayout();
            chip.invalidate();
        } else if (!z) {
            AnonymousClass0UX r12 = (AnonymousClass0UX) this.A00;
            r12.A02 = true;
            AnonymousClass08G r0 = (AnonymousClass08G) r12.A01.get();
            if (r0 != null) {
                r0.Bj0();
            }
        }
    }
}
