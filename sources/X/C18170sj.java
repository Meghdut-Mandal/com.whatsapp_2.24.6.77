package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.0sj  reason: invalid class name and case insensitive filesystem */
public class C18170sj extends AnonymousClass0IE {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18170sj(Context context, Object obj, int i) {
        super(context);
        this.A01 = i;
        this.A00 = obj;
    }

    public void A05(View view, AnonymousClass0U7 r8, AnonymousClass0C4 r9) {
        int i;
        int i2;
        int i3;
        switch (this.A01) {
            case 0:
                AnonymousClass0I9 r1 = (AnonymousClass0I9) this.A00;
                int[] A08 = r1.A08(view, r1.A01.getLayoutManager());
                i2 = A08[0];
                i = A08[1];
                i3 = A09(Math.max(Math.abs(i2), Math.abs(i)));
                break;
            case 1:
                AnonymousClass0I9 r12 = (AnonymousClass0I9) this.A00;
                RecyclerView recyclerView = r12.A01;
                if (recyclerView != null) {
                    int[] A082 = r12.A08(view, recyclerView.getLayoutManager());
                    i2 = A082[0];
                    i = A082[1];
                    i3 = A09(Math.max(Math.abs(i2), Math.abs(i)));
                    break;
                } else {
                    return;
                }
            default:
                super.A05(view, r8, r9);
                return;
        }
        int ceil = (int) Math.ceil(((double) i3) / 0.3356d);
        if (ceil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.A06;
            r8.A02 = i2;
            r8.A03 = i;
            r8.A01 = ceil;
            r8.A05 = decelerateInterpolator;
            r8.A06 = true;
        }
    }

    public float A06(DisplayMetrics displayMetrics) {
        return 100.0f / ((float) displayMetrics.densityDpi);
    }

    public int A09(int i) {
        if (this.A01 != 0) {
            return super.A09(i);
        }
        return Math.min(100, super.A09(i));
    }
}
