package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;

/* renamed from: X.1wl  reason: invalid class name and case insensitive filesystem */
public class C41161wl extends C02910Cj {
    public void A05(Rect rect, View view, AnonymousClass0C4 r7, RecyclerView recyclerView) {
        super.A05(rect, view, r7, recyclerView);
        int A00 = RecyclerView.A00(view);
        AnonymousClass0CZ r0 = recyclerView.A0G;
        if (r0 != null) {
            int itemViewType = r0.getItemViewType(A00);
            if (A00 == 0 && itemViewType == 0) {
                AnonymousClass04F.A06(view, AnonymousClass04F.A03(view), C36441kJ.A05(view.getResources(), R.dimen.f7nameremoved), AnonymousClass04F.A02(view), view.getPaddingBottom());
            }
        }
    }
}
