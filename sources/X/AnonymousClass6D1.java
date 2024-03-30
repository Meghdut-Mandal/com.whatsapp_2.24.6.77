package X;

import android.net.Uri;

/* renamed from: X.6D1  reason: invalid class name */
public final class AnonymousClass6D1 {
    public final Uri A00;
    public final Uri A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6D1) {
                AnonymousClass6D1 r5 = (AnonymousClass6D1) obj;
                if (!(AnonymousClass00C.A0J(this.A00, r5.A00) && AnonymousClass00C.A0J(this.A01, r5.A01) && this.A03 == r5.A03 && this.A02 == r5.A02 && this.A04 == r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((AnonymousClass000.A0H(this.A00) * 31) + C36411kG.A09(this.A01)) * 31) + C36341k9.A01(this.A03 ? 1 : 0)) * 31) + C36341k9.A01(this.A02 ? 1 : 0)) * 31) + C36341k9.A01(this.A04 ? 1 : 0);
    }

    public AnonymousClass6D1(Uri uri, Uri uri2, boolean z, boolean z2, boolean z3) {
        this.A00 = uri;
        this.A01 = uri2;
        this.A03 = z;
        this.A02 = z2;
        this.A04 = z3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BloksVideoPlayerConfig(videoHdUri=");
        A0u.append(this.A00);
        A0u.append(", videoRegularUri=");
        A0u.append(this.A01);
        A0u.append(", loop=");
        A0u.append(this.A03);
        A0u.append(", autoplay=");
        A0u.append(this.A02);
        A0u.append(", muteOnMount=");
        return C36321k7.A0H(A0u, this.A04);
    }
}
