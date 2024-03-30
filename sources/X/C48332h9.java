package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.2h9  reason: invalid class name and case insensitive filesystem */
public final class C48332h9 extends C42581z3 {
    public final WaTextView A00;

    public C48332h9(View view) {
        super(view);
        int dimensionPixelSize = C36341k9.A0F(view).getDimensionPixelSize(R.dimen.f7nameremoved);
        view.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
        this.A00 = C36411kG.A0Z(view, R.id.title);
    }
}
