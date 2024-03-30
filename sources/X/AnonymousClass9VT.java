package X;

/* renamed from: X.9VT  reason: invalid class name */
public final class AnonymousClass9VT {
    public AnonymousClass9VS A00;
    public C195929Wv A01;

    public /* synthetic */ AnonymousClass9VT(C195929Wv r4) {
        AnonymousClass9VS r0 = new AnonymousClass9VS(true, (String) null);
        AnonymousClass00C.A0D(r4, 1);
        this.A01 = r4;
        this.A00 = r0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9VT) {
                AnonymousClass9VT r5 = (AnonymousClass9VT) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, C36391kE.A0A(this.A01));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CollectionCache(collection=");
        A0u.append(this.A01);
        A0u.append(", pageInfo=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
