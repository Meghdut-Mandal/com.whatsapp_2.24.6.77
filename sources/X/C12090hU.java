package X;

/* renamed from: X.0hU  reason: invalid class name and case insensitive filesystem */
public abstract class C12090hU implements Runnable, Comparable, AnonymousClass03l, C16570pS {
    public int A00 = -1;
    public long A01;
    public volatile Object _heap;

    public final void dispose() {
        C15570nY r3;
        synchronized (this) {
            Object obj = this._heap;
            AnonymousClass035 r2 = C05950Rs.A01;
            if (obj != r2) {
                if ((obj instanceof C15570nY) && (r3 = (C15570nY) obj) != null) {
                    synchronized (r3) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof AnonymousClass0YX) && ((AnonymousClass0YX) obj2) != null) {
                            r3.A02(this.A00);
                        }
                    }
                }
                this._heap = r2;
            }
        }
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i = ((this.A01 - ((C12090hU) obj).A01) > 0 ? 1 : ((this.A01 - ((C12090hU) obj).A01) == 0 ? 0 : -1));
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        return 0;
    }

    public C12090hU(long j) {
        this.A01 = j;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Delayed[nanos=");
        A0u.append(this.A01);
        return AnonymousClass000.A0t(A0u, ']');
    }
}
