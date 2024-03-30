package X;

/* renamed from: X.9fi  reason: invalid class name and case insensitive filesystem */
public final class C199659fi {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C199659fi) && AnonymousClass00C.A0J(this.A00, ((C199659fi) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C199659fi(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PhoenixFlowInfo(config=");
        return C36321k7.A0E(this.A00, A0u);
    }

    public C199659fi() {
        this("");
    }
}
