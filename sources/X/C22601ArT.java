package X;

import java.math.BigInteger;

/* renamed from: X.ArT  reason: case insensitive filesystem */
public class C22601ArT extends AnonymousClass120 {
    public BigInteger A00;

    public C22601ArT(BigInteger bigInteger) {
        this.A00 = bigInteger;
    }

    public AnonymousClass121 Bve() {
        return new C22654AsK(this.A00);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CRLNumber: ");
        return AnonymousClass000.A0o(this.A00, A0u);
    }
}
