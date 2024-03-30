package X;

import java.nio.ByteBuffer;

/* renamed from: X.89m  reason: invalid class name */
public final class AnonymousClass89m extends AnonymousClass95B {
    public final ByteBuffer A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass89m) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass89m) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass89m(ByteBuffer byteBuffer) {
        this.A00 = byteBuffer;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("VideoCodec(data=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
