package X;

import java.util.Arrays;

/* renamed from: X.9W5  reason: invalid class name */
public final class AnonymousClass9W5 {
    public final int A00;
    public final int A01;
    public final short[] A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9W5) {
                AnonymousClass9W5 r5 = (AnonymousClass9W5) obj;
                if (!(AnonymousClass00C.A0J(this.A02, r5.A02) && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((Arrays.hashCode(this.A02) * 31) + this.A01) * 31) + 1) * 31) + this.A00;
    }

    public AnonymousClass9W5(short[] sArr, int i, int i2) {
        this.A02 = sArr;
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AudioFrameResult(audioData=");
        A0u.append(Arrays.toString(this.A02));
        A0u.append(", sampleRate=");
        A0u.append(this.A01);
        A0u.append(", numberOfChannels=");
        A0u.append(1);
        A0u.append(", numberOfSamples=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
