package X;

import android.util.SparseArray;
import java.util.Objects;

/* renamed from: X.9WX  reason: invalid class name */
public class AnonymousClass9WX {
    public final SparseArray A00 = new SparseArray();
    public final SparseArray A01 = new SparseArray();
    public final SparseArray A02 = new SparseArray();
    public final C202659mN A03;

    public C1693088o A00(int i) {
        Object obj = this.A02.get(C202659mN.A00(this.A03, i));
        Objects.requireNonNull(obj);
        return (C1693088o) obj;
    }

    public C198429dX A01(int i) {
        Object obj = this.A00.get(C202659mN.A00(this.A03, i));
        Objects.requireNonNull(obj);
        return (C198429dX) obj;
    }

    public C201049ih A02(int i) {
        Object obj = this.A01.get(C202659mN.A00(this.A03, i));
        Objects.requireNonNull(obj);
        return (C201049ih) obj;
    }

    public AnonymousClass9WX(C202659mN r2) {
        this.A03 = r2;
    }
}
