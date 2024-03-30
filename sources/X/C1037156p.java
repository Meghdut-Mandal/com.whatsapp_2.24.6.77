package X;

/* renamed from: X.56p  reason: invalid class name and case insensitive filesystem */
public final class C1037156p extends C110785bE {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1037156p) && AnonymousClass00C.A0J(this.A00, ((C1037156p) obj).A00));
    }

    public int hashCode() {
        return C36341k9.A09(this.A00);
    }

    public C1037156p(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MoveToStickerPage(pageId=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
