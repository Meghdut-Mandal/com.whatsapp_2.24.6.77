package X;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;

/* renamed from: X.0XI  reason: invalid class name */
public abstract class AnonymousClass0XI {
    public static final Interpolator A01 = new C18600tQ(1);
    public static final Interpolator A02 = new C18600tQ(2);
    public int A00 = -1;

    public abstract int A01(AnonymousClass0D3 r1, RecyclerView recyclerView);

    public boolean A05() {
        return true;
    }

    public boolean A06() {
        return true;
    }

    public boolean A07(AnonymousClass0D3 r2, AnonymousClass0D3 r3, RecyclerView recyclerView) {
        return true;
    }

    public abstract boolean A08(AnonymousClass0D3 r1, AnonymousClass0D3 r2, RecyclerView recyclerView);

    public int A02(RecyclerView recyclerView, int i, int i2, long j) {
        int i3 = this.A00;
        if (i3 == -1) {
            i3 = recyclerView.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            this.A00 = i3;
        }
        int abs = Math.abs(i2);
        float f = (float) abs;
        float f2 = 1.0f;
        int signum = (int) (((float) (((int) Math.signum((float) i2)) * i3)) * A02.getInterpolation(Math.min(1.0f, (f * 1.0f) / ((float) i))));
        if (j <= 2000) {
            f2 = ((float) j) / 2000.0f;
        }
        int interpolation = (int) (((float) signum) * A01.getInterpolation(f2));
        if (interpolation != 0) {
            return interpolation;
        }
        if (i2 > 0) {
            return 1;
        }
        return -1;
    }

    public void A04(AnonymousClass0D3 r5, RecyclerView recyclerView) {
        View view = r5.A0H;
        Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            C011004s.A05(view, ((Number) tag).floatValue());
        }
        view.setTag(R.id.item_touch_helper_previous_elevation, (Object) null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public final int A00(AnonymousClass0D3 r6, RecyclerView recyclerView) {
        int A012 = A01(r6, recyclerView);
        int A013 = AnonymousClass04F.A01(recyclerView);
        int i = A012 & 3158064;
        if (i == 0) {
            return A012;
        }
        int i2 = A012 & (~i);
        if (A013 != 0) {
            int i3 = i >> 1;
            i2 |= -3158065 & i3;
            i = i3 & 3158064;
        }
        return i2 | (i >> 2);
    }

    public void A03(AnonymousClass0D3 r1, int i) {
    }
}
