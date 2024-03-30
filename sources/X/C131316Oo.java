package X;

/* renamed from: X.6Oo  reason: invalid class name and case insensitive filesystem */
public final class C131316Oo {
    public Integer A00;

    public C131316Oo(Integer num) {
        this.A00 = null;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C131316Oo) && AnonymousClass00C.A0J(this.A00, ((C131316Oo) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass000.A0H(this.A00);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FlowsEntryPointConversionData(entryPointConversationInitiated=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }

    public C131316Oo() {
        this((Integer) null);
    }
}
