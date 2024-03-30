package X;

import java.util.Arrays;

/* renamed from: X.6AX  reason: invalid class name */
public class AnonymousClass6AX {
    public final long A00;
    public final long[] A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass6AX r7 = (AnonymousClass6AX) obj;
            if (this.A00 != r7.A00 || !Arrays.equals(this.A01, r7.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C36391kE.A0A(Long.valueOf(this.A00)) + Arrays.hashCode(this.A01);
    }

    public AnonymousClass6AX(long[] jArr, long j) {
        this.A00 = j;
        this.A01 = jArr;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Duration{staticDurationMillis=");
        A0u.append(this.A00);
        A0u.append(", repeatDurationMills=");
        A0u.append(Arrays.toString(this.A01));
        return AnonymousClass000.A0s(A0u);
    }
}
