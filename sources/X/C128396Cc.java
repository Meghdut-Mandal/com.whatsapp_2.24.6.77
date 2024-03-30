package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6Cc  reason: invalid class name and case insensitive filesystem */
public abstract class C128396Cc {
    public int A00;
    public Map.Entry A01;
    public Map.Entry A02;
    public final C1506676d A03;
    public final Iterator A04;

    public final void A00() {
        Map.Entry entry;
        this.A01 = this.A02;
        Iterator it = this.A04;
        if (it.hasNext()) {
            entry = AnonymousClass000.A11(it);
        } else {
            entry = null;
        }
        this.A02 = entry;
    }

    public final boolean hasNext() {
        return AnonymousClass000.A1V(this.A02);
    }

    public final void remove() {
        C1506676d r2 = this.A03;
        if (r2.A00().A00 == this.A00) {
            Map.Entry entry = this.A01;
            if (entry != null) {
                r2.remove(entry.getKey());
                this.A01 = null;
                this.A00 = r2.A00().A00;
                return;
            }
            throw new IllegalStateException();
        }
        throw new ConcurrentModificationException();
    }

    public C128396Cc(C1506676d r2, Iterator it) {
        this.A03 = r2;
        this.A04 = it;
        this.A00 = r2.A00().A00;
        A00();
    }
}
