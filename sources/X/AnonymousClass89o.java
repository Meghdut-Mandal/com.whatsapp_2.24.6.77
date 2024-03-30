package X;

import java.nio.ByteBuffer;

/* renamed from: X.89o  reason: invalid class name */
public final class AnonymousClass89o extends AnonymousClass95B {
    public final long A00;
    public final ByteBuffer A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass89o) {
                AnonymousClass89o r8 = (AnonymousClass89o) obj;
                if (!AnonymousClass00C.A0J(this.A01, r8.A01) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36341k9.A02(this.A00, C36391kE.A0A(this.A01));
    }

    public AnonymousClass89o(ByteBuffer byteBuffer, long j) {
        this.A01 = byteBuffer;
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("VideoFrame(data=");
        A0u.append(this.A01);
        A0u.append(", presentationTimeUs=");
        return C36331k8.A0j(A0u, this.A00);
    }
}
