package X;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* renamed from: X.4nM  reason: invalid class name and case insensitive filesystem */
public class C96454nM extends AnonymousClass0UE {
    public ValueAnimator A00;
    public Runnable A01;
    public boolean A02;
    public final C96324n9 A03;
    public final boolean A04;

    public void A03(RecyclerView recyclerView, int i) {
        if (this.A04) {
            return;
        }
        if (i == 0) {
            AnonymousClass75C r2 = new AnonymousClass75C((Object) this, (Object) recyclerView, 24);
            this.A01 = r2;
            recyclerView.postDelayed(r2, 1500);
            return;
        }
        recyclerView.removeCallbacks(this.A01);
        if (!this.A02) {
            ValueAnimator valueAnimator = this.A00;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.A00.cancel();
            }
            float[] A0v = C90524aI.A0v();
            C96324n9 r1 = this.A03;
            A0v[0] = r1.A01;
            A0v[1] = 1.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(A0v);
            ofFloat.addUpdateListener(new C133396Yg(recyclerView, r1));
            ofFloat.setDuration(200);
            ofFloat.start();
            this.A02 = true;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C96454nM r4 = (C96454nM) obj;
            if (this.A04 == r4.A04) {
                return this.A03.equals(r4.A03);
            }
        }
        return false;
    }

    public C96454nM(C96324n9 r3, boolean z) {
        this.A03 = r3;
        r3.A02 = this;
        this.A02 = AnonymousClass000.A1P((r3.A01 > 0.0f ? 1 : (r3.A01 == 0.0f ? 0 : -1)));
        this.A04 = z;
        if (z) {
            r3.A01 = 1.0f;
        }
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = this.A03;
        C36421kH.A1R(A0M, this.A04);
        return Objects.hash(A0M);
    }
}
