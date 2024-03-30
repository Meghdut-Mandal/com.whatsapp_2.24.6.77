package X;

import java.io.File;

/* renamed from: X.15x  reason: invalid class name */
public class AnonymousClass15x {
    public AnonymousClass12P A00;

    public Long A00() {
        AnonymousClass12P r2 = this.A00;
        r2.A06();
        File file = r2.A03;
        if (!file.exists()) {
            return null;
        }
        r2.A06();
        return Long.valueOf(file.length());
    }

    public AnonymousClass15x(AnonymousClass12P r1) {
        this.A00 = r1;
    }
}
