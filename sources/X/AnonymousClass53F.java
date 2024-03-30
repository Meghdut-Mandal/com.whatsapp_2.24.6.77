package X;

import com.whatsapp.R;

/* renamed from: X.53F  reason: invalid class name */
public final class AnonymousClass53F extends AnonymousClass66I {
    public final int A00;
    public final int A01;
    public final int A02;
    public final boolean A03;
    public final boolean A04;

    public AnonymousClass53F(boolean z, boolean z2) {
        super(z2, false);
        this.A04 = z;
        this.A03 = z2;
        this.A01 = z ? R.string.f12nameremoved : R.string.f12nameremoved;
        this.A00 = z ? R.string.f12nameremoved : R.string.f12nameremoved;
        this.A02 = z ? R.string.f12nameremoved : R.string.f12nameremoved;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass53F) {
                AnonymousClass53F r5 = (AnonymousClass53F) obj;
                if (!(this.A04 == r5.A04 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (C36341k9.A01(this.A04 ? 1 : 0) * 31) + C36341k9.A01(this.A03 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Join(isMuted=");
        A0u.append(this.A04);
        A0u.append(", canJoinCall=");
        return C36321k7.A0H(A0u, this.A03);
    }
}
