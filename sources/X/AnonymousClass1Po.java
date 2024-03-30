package X;

import android.util.SparseArray;

/* renamed from: X.1Po  reason: invalid class name */
public final class AnonymousClass1Po extends AnonymousClass12N {
    public boolean A00;
    public final SparseArray A01 = new SparseArray();

    public synchronized void Bjh(AnonymousClass5SK r2, boolean z) {
        this.A01.clear();
    }

    public String BHv() {
        int size;
        StringBuilder sb = new StringBuilder();
        sb.append("state a=");
        synchronized (this) {
            size = this.A01.size();
        }
        sb.append(size);
        return sb.toString();
    }

    public AnonymousClass1Po(C220112n r2) {
        super(r2);
        A08();
    }
}
