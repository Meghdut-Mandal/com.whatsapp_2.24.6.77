package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.0CH  reason: invalid class name */
public class AnonymousClass0CH implements AnonymousClass0CG {
    public final /* synthetic */ RecyclerView A00;

    public AnonymousClass0CH(RecyclerView recyclerView) {
        this.A00 = recyclerView;
    }

    public void BZc(View view) {
        AnonymousClass0D3 A04 = RecyclerView.A04(view);
        if (A04 != null) {
            RecyclerView recyclerView = this.A00;
            int i = A04.A06;
            if (recyclerView.A07 > 0) {
                A04.A03 = i;
                recyclerView.A14.add(A04);
            } else {
                C011504z.A06(A04.A0H, i);
            }
            A04.A06 = 0;
        }
    }
}
