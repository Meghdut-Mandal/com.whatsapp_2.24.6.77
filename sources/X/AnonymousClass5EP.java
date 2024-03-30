package X;

/* renamed from: X.5EP  reason: invalid class name */
public final class AnonymousClass5EP extends AnonymousClass5EQ {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5EP) && this.A00 == ((AnonymousClass5EP) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public AnonymousClass5EP(int i) {
        super(C023109s.A0R);
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SecondaryTextHeaderListItemData(headerType=");
        return C36321k7.A0G(A0u, this.A00);
    }

    public AnonymousClass5EP() {
        this(0);
    }
}
