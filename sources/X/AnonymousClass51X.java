package X;

import android.content.Context;
import com.google.android.material.chip.Chip;
import com.whatsapp.R;
import java.util.Set;

/* renamed from: X.51X  reason: invalid class name */
public class AnonymousClass51X extends AnonymousClass51b {
    public void A0B(C125345zl r9) {
        String string;
        Chip chip = this.A00;
        chip.setChipIconResource(R.drawable.ic_business_cat);
        super.A0B(r9);
        Set set = ((AnonymousClass51Q) r9).A00;
        if (set.size() == 0) {
            chip.setText(R.string.f12nameremoved);
        } else {
            if (set.size() == 1) {
                string = ((C134986bw) set.iterator().next()).A01;
            } else {
                Context context = chip.getContext();
                Object[] objArr = new Object[1];
                AnonymousClass000.A1L(objArr, set.size(), 0);
                string = context.getString(R.string.f12nameremoved, objArr);
            }
            chip.setText(string);
        }
        chip.setCloseIconVisible(true);
        C36331k8.A0q(chip.getContext(), chip, R.string.f12nameremoved);
        C36361kB.A17(chip, this, 1);
        chip.setOnCloseIconClickListener(new C135446ci(this, 2));
    }

    public AnonymousClass51X(Chip chip, C160627lJ r2) {
        super(chip, r2);
    }
}
