package X;

import android.view.View;
import com.google.android.material.chip.Chip;
import com.whatsapp.R;

/* renamed from: X.51c  reason: invalid class name */
public final class AnonymousClass51c extends C96974oC {
    public final Chip A00;

    public void A0B(C125345zl r5) {
        Chip chip = this.A00;
        View view = this.A0H;
        chip.setText(view.getContext().getText(R.string.f12nameremoved));
        C36361kB.A17(view, this, 0);
    }

    public AnonymousClass51c(View view, C160627lJ r3) {
        super(view, r3);
        this.A00 = (Chip) C36361kB.A0F(view, R.id.clear_chip);
    }
}
