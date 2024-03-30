package X;

import com.whatsapp.R;

/* renamed from: X.53A  reason: invalid class name */
public final class AnonymousClass53A extends AnonymousClass66I {
    public final int A00;
    public final boolean A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass53A) {
                AnonymousClass53A r5 = (AnonymousClass53A) obj;
                if (!(this.A02 == r5.A02 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (C36341k9.A01(this.A02 ? 1 : 0) * 31) + C36341k9.A01(this.A01 ? 1 : 0);
    }

    public AnonymousClass53A(boolean z, boolean z2) {
        super(z2, z);
        this.A02 = z;
        this.A01 = z2;
        this.A00 = z ? R.string.f12nameremoved : R.string.f12nameremoved;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SpeakerToggle(isSpeakerOn=");
        A0u.append(this.A02);
        A0u.append(", canToggleSpeaker=");
        return C36321k7.A0H(A0u, this.A01);
    }
}
