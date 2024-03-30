package X;

import com.whatsapp.R;

/* renamed from: X.53E  reason: invalid class name */
public final class AnonymousClass53E extends AnonymousClass66I {
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass53E) {
                AnonymousClass53E r5 = (AnonymousClass53E) obj;
                if (!(this.A03 == r5.A03 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (C36341k9.A01(this.A03 ? 1 : 0) * 31) + C36341k9.A01(this.A02 ? 1 : 0);
    }

    public AnonymousClass53E(boolean z, boolean z2) {
        super(z2, z);
        this.A03 = z;
        this.A02 = z2;
        int i = z ? R.string.f12nameremoved : R.string.f12nameremoved;
        this.A00 = i;
        this.A01 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MuteToggle(isMuted=");
        A0u.append(this.A03);
        A0u.append(", canToggleMute=");
        return C36321k7.A0H(A0u, this.A02);
    }
}
