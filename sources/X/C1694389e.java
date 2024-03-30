package X;

import java.nio.ByteBuffer;

/* renamed from: X.89e  reason: invalid class name and case insensitive filesystem */
public final class C1694389e extends AnonymousClass95B {
    public final ByteBuffer A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1694389e) && AnonymousClass00C.A0J(this.A00, ((C1694389e) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C1694389e(ByteBuffer byteBuffer) {
        this.A00 = byteBuffer;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AudioCodec(data=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
