package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;

/* renamed from: X.1wp  reason: invalid class name and case insensitive filesystem */
public final class C41201wp extends C02910Cj {
    public final C18820ts A00;

    public void A05(Rect rect, View view, AnonymousClass0C4 r6, RecyclerView recyclerView) {
        C36331k8.A1I(rect, view);
        int dimensionPixelSize = C36341k9.A0F(view).getDimensionPixelSize(R.dimen.f7nameremoved);
        if (C36351kA.A1Y(this.A00)) {
            rect.set(0, 0, dimensionPixelSize, 0);
        } else {
            rect.set(dimensionPixelSize, 0, 0, 0);
        }
    }

    public C41201wp(C18820ts r1) {
        this.A00 = r1;
    }
}
