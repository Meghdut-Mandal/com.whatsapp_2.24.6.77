package X;

import java.util.Arrays;

/* renamed from: X.3QP  reason: invalid class name */
public final class AnonymousClass3QP {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final AnonymousClass00T A04;
    public final byte[] A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3QP) {
                AnonymousClass3QP r5 = (AnonymousClass3QP) obj;
                if (!(AnonymousClass00C.A0J(this.A05, r5.A05) && this.A00 == r5.A00 && this.A02 == r5.A02 && this.A01 == r5.A01 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        byte[] bArr = this.A05;
        return ((((((((bArr == null ? 0 : Arrays.hashCode(bArr)) * 31) + this.A00) * 31) + this.A02) * 31) + this.A01) * 31) + this.A03;
    }

    public AnonymousClass3QP(byte[] bArr, int i, int i2, int i3, int i4) {
        this.A05 = bArr;
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A03 = i4;
        this.A04 = C36431kI.A1I(new C84414Dd(this));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AudioData(waveform=");
        A0u.append(Arrays.toString(this.A05));
        A0u.append(", backgroundColor=");
        A0u.append(this.A00);
        A0u.append(", transcriptionStatus=");
        A0u.append(this.A02);
        A0u.append(", transcriptionLocale=");
        A0u.append(this.A01);
        A0u.append(", unnormalizedTranscriptionConfidenceThreshold=");
        return C36321k7.A0G(A0u, this.A03);
    }

    public AnonymousClass3QP() {
        this((byte[]) null, 0, 0, 0, 0);
    }
}
