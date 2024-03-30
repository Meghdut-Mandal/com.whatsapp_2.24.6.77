package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.6CG  reason: invalid class name */
public final class AnonymousClass6CG {
    public final int A00;
    public final int A01;
    public final int A02;
    public final UserJid A03;

    public AnonymousClass6CG(UserJid userJid, int i, int i2, int i3) {
        AnonymousClass00C.A0D(userJid, 1);
        this.A03 = userJid;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6CG) {
                AnonymousClass6CG r5 = (AnonymousClass6CG) obj;
                if (!(AnonymousClass00C.A0J(this.A03, r5.A03) && this.A02 == r5.A02 && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((C36391kE.A0A(this.A03) + this.A02) * 31) + this.A01) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ScreenShareEvent(jid=");
        A0u.append(this.A03);
        A0u.append(", state=");
        A0u.append(this.A02);
        A0u.append(", sharerVersion=");
        A0u.append(this.A01);
        A0u.append(", endReason=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
