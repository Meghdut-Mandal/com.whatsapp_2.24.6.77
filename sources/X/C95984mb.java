package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.4mb  reason: invalid class name and case insensitive filesystem */
public abstract class C95984mb extends AnonymousClass0CZ {
    public int A00;
    public int A01;
    public RecyclerView A02;
    public List A03 = AnonymousClass001.A0I();
    public final C114565hS A04;

    public void A0I(RecyclerView recyclerView) {
        this.A02 = null;
    }

    public long A0E(int i) {
        return (long) ((C118815om) this.A03.get(i)).A01.A03;
    }

    public int A0J() {
        return this.A03.size();
    }

    public C95984mb(C114565hS r2) {
        this.A04 = r2;
        A0B(true);
    }

    public void A0H(RecyclerView recyclerView) {
        this.A02 = recyclerView;
    }
}
