package X;

/* renamed from: X.A7p  reason: case insensitive filesystem */
public final class C21078A7p implements C22902AyE {
    public final C22902AyE A00;

    public boolean B1B(AnonymousClass9LX r2) {
        return this.A00.B1B(r2);
    }

    public String toString() {
        String str;
        String obj = this.A00.toString();
        boolean startsWith = obj.startsWith("(");
        StringBuilder A0u = AnonymousClass000.A0u();
        if (startsWith) {
            A0u.append("[?");
            A0u.append(obj);
            str = "]";
        } else {
            A0u.append("[?(");
            A0u.append(obj);
            str = ")]";
        }
        return AnonymousClass000.A0q(str, A0u);
    }

    public C21078A7p(C22902AyE ayE) {
        this.A00 = ayE;
    }

    public C21078A7p() {
    }
}
