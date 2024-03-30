package X;

import java.io.IOException;

/* renamed from: X.8xk  reason: invalid class name and case insensitive filesystem */
public class C187368xk extends IOException {
    public static final long serialVersionUID = -6947486886997889499L;

    public C187368xk(String str, Throwable th) {
        super(AnonymousClass000.A0p("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str, AnonymousClass000.A0u()), th);
    }

    public C187368xk(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }

    public C187368xk() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }
}
