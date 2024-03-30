package X;

import java.nio.ByteBuffer;

/* renamed from: X.89n  reason: invalid class name */
public final class AnonymousClass89n extends AnonymousClass95B {
    public final long A00;
    public final ByteBuffer A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass89n) {
                AnonymousClass89n r8 = (AnonymousClass89n) obj;
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

    public AnonymousClass89n(ByteBuffer byteBuffer, long j) {
        this.A01 = byteBuffer;
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AudioFrame(data=");
        A0u.append(this.A01);
        A0u.append(", presentationTimeUs=");
        return C36331k8.A0j(A0u, this.A00);
    }
}
