package X;

import java.util.concurrent.Callable;

/* renamed from: X.7qe  reason: invalid class name and case insensitive filesystem */
public class C163717qe implements Callable {
    public Object A00;
    public final int A01;

    public C163717qe(AnonymousClass189 r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public final Object call() {
        if (this.A01 != 0) {
            return Integer.valueOf(((AnonymousClass189) this.A00).A04());
        }
        return ((AnonymousClass189) this.A00).A0G();
    }
}
