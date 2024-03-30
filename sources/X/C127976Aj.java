package X;

import android.media.MediaCodec;

/* renamed from: X.6Aj  reason: invalid class name and case insensitive filesystem */
public final class C127976Aj {
    public final int A00;
    public final MediaCodec A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C127976Aj) {
                C127976Aj r5 = (C127976Aj) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36391kE.A0A(this.A01) + this.A00;
    }

    public C127976Aj(MediaCodec mediaCodec, int i) {
        this.A01 = mediaCodec;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("DecoderConfig(decoder=");
        A0u.append(this.A01);
        A0u.append(", audioTrackIndex=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
