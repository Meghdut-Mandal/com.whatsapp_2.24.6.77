package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;

/* renamed from: X.1wk  reason: invalid class name and case insensitive filesystem */
public final class C41151wk extends C02910Cj {
    public void A05(Rect rect, View view, AnonymousClass0C4 r7, RecyclerView recyclerView) {
        AnonymousClass00C.A0D(rect, 0);
        C36321k7.A11(view, recyclerView, r7);
        super.A05(rect, view, r7, recyclerView);
        int A00 = RecyclerView.A00(view);
        if (recyclerView.A0G != null && A00 == 0) {
            AnonymousClass04F.A06(view, AnonymousClass04F.A03(view), C36441kJ.A05(view.getResources(), R.dimen.f7nameremoved), AnonymousClass04F.A02(view), view.getPaddingBottom());
        }
    }
}
