package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;

/* renamed from: X.4nK  reason: invalid class name and case insensitive filesystem */
public final class C96434nK extends AnonymousClass0UE {
    public int A00 = 0;
    public int A01;
    public int A02 = 0;
    public final /* synthetic */ AnonymousClass6XN A03;

    public C96434nK(Context context, AnonymousClass6XN r4) {
        this.A03 = r4;
        this.A01 = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
    }

    public void A03(RecyclerView recyclerView, int i) {
        AnonymousClass6SU r0;
        int i2 = this.A02;
        if (!(i2 != 0 || i == i2 || (r0 = this.A03.A0M) == null)) {
            r0.A0A.clearFocus();
        }
        this.A02 = i;
    }

    public void A04(RecyclerView recyclerView, int i, int i2) {
        int i3 = this.A00 + i2;
        this.A00 = i3;
        this.A03.A08.setAlpha(Math.min(1.0f, ((float) i3) / ((float) this.A01)));
    }
}
