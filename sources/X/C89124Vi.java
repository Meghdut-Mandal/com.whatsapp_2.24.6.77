package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.gifsearch.GifSearchContainer;

/* renamed from: X.4Vi  reason: invalid class name and case insensitive filesystem */
public class C89124Vi extends C02910Cj {
    public int A00;
    public final int A01;

    public C89124Vi(GifSearchContainer gifSearchContainer) {
        this.A01 = 3;
        this.A00 = gifSearchContainer.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
    }

    public void A05(Rect rect, View view, AnonymousClass0C4 r6, RecyclerView recyclerView) {
        int i = this.A01;
        AnonymousClass00C.A0D(rect, 0);
        int i2 = this.A00;
        switch (i) {
            case 0:
                rect.set(0, i2, 0, i2);
                return;
            case 2:
                rect.set(0, i2, i2, i2);
                return;
            default:
                rect.set(0, i2, i2, 0);
                return;
        }
    }

    public C89124Vi(int i, int i2) {
        this.A01 = i2;
        this.A00 = i;
    }
}
