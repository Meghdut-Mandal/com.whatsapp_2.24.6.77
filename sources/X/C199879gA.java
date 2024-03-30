package X;

import com.facebook.android.exoplayer2.util.Util;
import java.util.Arrays;

/* renamed from: X.9gA  reason: invalid class name and case insensitive filesystem */
public final class C199879gA {
    public static final C199879gA A04 = new C199879gA(-1, -1, -1);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C199879gA)) {
            return false;
        }
        C199879gA r4 = (C199879gA) obj;
        return this.A03 == r4.A03 && this.A01 == r4.A01 && this.A02 == r4.A02;
    }

    public C199879gA(int i, int i2, int i3) {
        int i4;
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
        if (Util.A0D(i3)) {
            i4 = Util.A02(i3, i2);
        } else {
            i4 = -1;
        }
        this.A00 = i4;
    }

    public int hashCode() {
        Object[] A1Q = C36441kJ.A1Q();
        AnonymousClass000.A1J(A1Q, this.A03);
        AnonymousClass000.A1K(A1Q, this.A01);
        C36331k8.A1V(A1Q, this.A02);
        return Arrays.hashCode(A1Q);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AudioFormat[sampleRate=");
        A0u.append(this.A03);
        A0u.append(", channelCount=");
        A0u.append(this.A01);
        A0u.append(", encoding=");
        A0u.append(this.A02);
        return AnonymousClass000.A0t(A0u, ']');
    }
}
