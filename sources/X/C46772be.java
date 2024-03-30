package X;

/* renamed from: X.2be  reason: invalid class name and case insensitive filesystem */
public class C46772be extends C64933Qa {
    public final int A00;

    public C46772be(C64933Qa r1, int i) {
        super(r1);
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof C46772be) || ((C46772be) obj).A00 != this.A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (super.hashCode() * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Key[id=");
        A0u.append(this.A01);
        A0u.append(", from_me=");
        A0u.append(this.A02);
        A0u.append(", remote_jid=");
        A0u.append(this.A00);
        A0u.append(", card_index=");
        A0u.append(this.A00);
        return AnonymousClass000.A0q("]", A0u);
    }
}
