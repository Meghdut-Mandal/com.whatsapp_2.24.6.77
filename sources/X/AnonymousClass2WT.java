package X;

/* renamed from: X.2WT  reason: invalid class name */
public final class AnonymousClass2WT extends C54592tC {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass2WT) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass2WT) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass2WT(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("DebugInfo(debugInfoJson=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
