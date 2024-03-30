package X;

import java.io.IOException;

/* renamed from: X.8xl  reason: invalid class name and case insensitive filesystem */
public final class C187378xl extends IOException {
    public C187378xl() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public C187378xl(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }

    public C187378xl(String str, Throwable th) {
        super(C165607th.A0u(str), th);
    }

    public C187378xl(String str) {
        super(C165607th.A0u(str));
    }
}
