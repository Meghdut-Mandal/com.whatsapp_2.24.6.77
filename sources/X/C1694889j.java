package X;

import java.nio.ByteBuffer;

/* renamed from: X.89j  reason: invalid class name and case insensitive filesystem */
public final class C1694889j extends AnonymousClass95B {
    public final ByteBuffer A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1694889j) && AnonymousClass00C.A0J(this.A00, ((C1694889j) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C1694889j(ByteBuffer byteBuffer) {
        this.A00 = byteBuffer;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SystemHealth(data=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
