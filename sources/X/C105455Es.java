package X;

import android.view.View;
import com.google.android.material.chip.Chip;
import com.whatsapp.R;

/* renamed from: X.5Es  reason: invalid class name and case insensitive filesystem */
public final class C105455Es extends C46482Xv {
    public final Chip A00;
    public final View A01;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass5EG r4 = (AnonymousClass5EG) obj;
        AnonymousClass00C.A0D(r4, 0);
        Chip chip = this.A00;
        chip.setText(r4.A01);
        chip.setOnCloseIconClickListener(new C135446ci(r4, 20));
    }

    public C105455Es(View view) {
        super(view);
        this.A01 = view;
        this.A00 = (Chip) C36361kB.A0G(view, R.id.search_context_category_chip);
    }
}
