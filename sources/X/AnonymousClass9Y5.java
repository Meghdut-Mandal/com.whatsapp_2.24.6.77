package X;

/* renamed from: X.9Y5  reason: invalid class name */
public abstract class AnonymousClass9Y5 {
    public abstract int getCount();

    public abstract Object getElement();

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass9Y5)) {
            return false;
        }
        AnonymousClass9Y5 r4 = (AnonymousClass9Y5) obj;
        if (getCount() != r4.getCount() || !C1897595l.A00(getElement(), r4.getElement())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0H(getElement()) ^ getCount();
    }

    public String toString() {
        String valueOf = String.valueOf(getElement());
        int count = getCount();
        if (count == 1) {
            return valueOf;
        }
        StringBuilder A0h = C90524aI.A0h(C90474aD.A05(valueOf) + 14);
        A0h.append(valueOf);
        return AnonymousClass000.A0r(" x ", A0h, count);
    }
}
