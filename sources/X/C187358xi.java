package X;

import java.io.IOException;

/* renamed from: X.8xi  reason: invalid class name and case insensitive filesystem */
public final class C187358xi extends IOException {
    public C187358xi(String str, Throwable th) {
        super(C165607th.A0u(str), th);
    }

    public C187358xi(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }

    public C187358xi() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }
}
