package X;

import java.util.Comparator;
import java.util.List;

/* renamed from: X.66j  reason: invalid class name and case insensitive filesystem */
public class C1269566j {
    public final C1272167k A00;
    public final Comparator A01 = C1504875l.A00;
    public volatile List A02;

    public List A00() {
        List list;
        synchronized (this) {
            if (this.A02 == null) {
                A01();
            }
            list = this.A02;
        }
        return list;
    }

    public void A01() {
        synchronized (this) {
            if (this.A02 == null) {
                this.A02 = this.A00.A00();
            }
        }
    }

    public C1269566j(C1272167k r2) {
        this.A00 = r2;
    }
}
