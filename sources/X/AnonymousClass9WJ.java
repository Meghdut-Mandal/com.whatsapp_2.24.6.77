package X;

import com.whatsapp.jid.DeviceJid;

/* renamed from: X.9WJ  reason: invalid class name */
public final class AnonymousClass9WJ {
    public final long A00;
    public final DeviceJid A01;
    public final DeviceJid A02;

    public AnonymousClass9WJ(DeviceJid deviceJid, DeviceJid deviceJid2, long j) {
        AnonymousClass00C.A0D(deviceJid, 1);
        this.A02 = deviceJid;
        this.A00 = j;
        this.A01 = deviceJid2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9WJ) {
                AnonymousClass9WJ r8 = (AnonymousClass9WJ) obj;
                if (!AnonymousClass00C.A0J(this.A02, r8.A02) || this.A00 != r8.A00 || !AnonymousClass00C.A0J(this.A01, r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36321k7.A00(this.A00, C36391kE.A0A(this.A02)) + AnonymousClass000.A0H(this.A01);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("DeviceProtocolModel(deviceJid=");
        A0u.append(this.A02);
        A0u.append(", keyIndex=");
        A0u.append(this.A00);
        A0u.append(", deviceLid=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
