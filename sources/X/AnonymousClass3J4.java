package X;

/* renamed from: X.3J4  reason: invalid class name */
public class AnonymousClass3J4 {
    public Long A00;
    public final AnonymousClass11F A01;
    public final Long A02;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AnonymousClass3J4 r4 = (AnonymousClass3J4) obj;
            if (this.A01.equals(r4.A01)) {
                return this.A02.equals(r4.A02);
            }
        }
        return false;
    }

    public int hashCode() {
        return C36401kF.A02(this.A02, C36391kE.A0A(this.A01));
    }

    public AnonymousClass3J4(AnonymousClass11F r1, Long l) {
        this.A01 = r1;
        this.A02 = l;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MutedChat{chatJid=");
        A0u.append(this.A01);
        A0u.append(", muteEndTimestampMs=");
        A0u.append(this.A02);
        return AnonymousClass000.A0s(A0u);
    }
}
