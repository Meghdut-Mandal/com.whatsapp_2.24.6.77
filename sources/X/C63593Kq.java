package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3Kq  reason: invalid class name and case insensitive filesystem */
public class C63593Kq {
    public double A00;
    public double A01;
    public float A02 = -1.0f;
    public int A03 = -1;
    public int A04 = -1;
    public long A05;
    public final UserJid A06;

    public void A00(C63593Kq r3) {
        C18740tg.A0C(r3.A06.equals(this.A06));
        this.A05 = r3.A05;
        this.A00 = r3.A00;
        this.A01 = r3.A01;
        this.A03 = r3.A03;
        this.A04 = r3.A04;
        this.A02 = r3.A02;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C63593Kq) {
            C63593Kq r7 = (C63593Kq) obj;
            if (!r7.A06.equals(this.A06) || r7.A05 != this.A05) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C63593Kq(UserJid userJid) {
        this.A06 = userJid;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = this.A06;
        return AnonymousClass000.A0L(Long.valueOf(this.A05), A0M);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[UserLocation jid=");
        A0u.append(this.A06);
        A0u.append(" latitude=");
        A0u.append(this.A00);
        A0u.append(" longitude=");
        A0u.append(this.A01);
        A0u.append(" accuracy=");
        A0u.append(this.A03);
        A0u.append(" speed=");
        A0u.append(this.A02);
        A0u.append(" bearing=");
        A0u.append(this.A04);
        A0u.append(" timestamp=");
        A0u.append(this.A05);
        return AnonymousClass000.A0q("]", A0u);
    }
}
