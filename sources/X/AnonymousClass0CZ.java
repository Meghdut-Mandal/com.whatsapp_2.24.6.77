package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: X.0CZ  reason: invalid class name */
public abstract class AnonymousClass0CZ {
    public boolean A00 = false;
    public final C02820Ca A01 = new C02820Ca();

    public void A0C(AnonymousClass0D3 r1) {
    }

    public long A0E(int i) {
        return -1;
    }

    public void A0F(AnonymousClass0D3 r1) {
    }

    public boolean A0G(AnonymousClass0D3 r2) {
        return false;
    }

    public void A0H(RecyclerView recyclerView) {
    }

    public void A0I(RecyclerView recyclerView) {
    }

    public abstract int A0J();

    public void A0K(AnonymousClass0D3 r1) {
    }

    public abstract void BSE(AnonymousClass0D3 r1, int i);

    public abstract AnonymousClass0D3 BUw(ViewGroup viewGroup, int i);

    public int getItemViewType(int i) {
        return 0;
    }

    public final AnonymousClass0D3 A05(ViewGroup viewGroup, int i) {
        try {
            Method method = C000600g.A03;
            AnonymousClass00h.A01("RV CreateView");
            AnonymousClass0D3 BUw = BUw(viewGroup, i);
            if (BUw.A0H.getParent() == null) {
                BUw.A01 = i;
                AnonymousClass00h.A00();
                return BUw;
            }
            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
        } catch (Throwable th) {
            Method method2 = C000600g.A03;
            AnonymousClass00h.A00();
            throw th;
        }
    }

    public final void A06() {
        this.A01.A00();
    }

    public final void A07(int i) {
        this.A01.A04((Object) null, i, 1);
    }

    public final void A08(int i) {
        this.A01.A02(i, 1);
    }

    public final void A09(int i) {
        this.A01.A03(i, 1);
    }

    public final void A0A(int i, int i2) {
        this.A01.A04((Object) null, i, i2);
    }

    public void A0B(boolean z) {
        if (!this.A01.A05()) {
            this.A00 = z;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }

    public void BnA(C02740Bs r2) {
        this.A01.registerObserver(r2);
    }

    public void A0D(AnonymousClass0D3 r1, List list, int i) {
        BSE(r1, i);
    }
}
