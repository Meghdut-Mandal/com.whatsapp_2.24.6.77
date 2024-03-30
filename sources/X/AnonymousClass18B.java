package X;

import java.util.List;

/* renamed from: X.18B  reason: invalid class name */
public class AnonymousClass18B extends Exception {
    public AnonymousClass18B(List list) {
        super("No valid sessions.", (Throwable) list.get(0));
    }

    public AnonymousClass18B(String str) {
        super(str);
    }

    public AnonymousClass18B(Throwable th) {
        super(th);
    }

    public AnonymousClass18B() {
    }
}
