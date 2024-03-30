package X;

import com.whatsapp.jid.DeviceJid;

/* renamed from: X.6B1  reason: invalid class name */
public class AnonymousClass6B1 {
    public boolean A00;
    public boolean A01;
    public final DeviceJid A02;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AnonymousClass6B1 r4 = (AnonymousClass6B1) obj;
            if (this.A01 == r4.A01 && this.A00 == r4.A00) {
                return this.A02.equals(r4.A02);
            }
        }
        return false;
    }

    public int hashCode() {
        return ((C36391kE.A0A(this.A02) + (this.A01 ? 1 : 0)) * 31) + (this.A00 ? 1 : 0);
    }

    public AnonymousClass6B1(DeviceJid deviceJid, boolean z, boolean z2) {
        this.A02 = deviceJid;
        this.A01 = z;
        this.A00 = z2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ParticipantDevice{deviceJid=");
        A0u.append(this.A02);
        A0u.append(", sentSenderKey=");
        A0u.append(this.A01);
        A0u.append(", sentAddOnSenderKey=");
        A0u.append(this.A00);
        return AnonymousClass000.A0s(A0u);
    }
}
