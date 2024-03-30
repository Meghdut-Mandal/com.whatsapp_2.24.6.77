package X;

import java.util.concurrent.Callable;

/* renamed from: X.4YJ  reason: invalid class name */
public class AnonymousClass4YJ implements Callable {
    public Object A00;
    public final int A01;

    public AnonymousClass4YJ(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final Object call() {
        if (2 - this.A01 != 0) {
            return ((AnonymousClass189) this.A00).A00.A04();
        }
        AnonymousClass12P r1 = (AnonymousClass12P) this.A00;
        C19730wQ r0 = r1.A00;
        r0.A0G();
        if (r0.A00 != null) {
            return null;
        }
        r1.A01.A01();
        return null;
    }
}
