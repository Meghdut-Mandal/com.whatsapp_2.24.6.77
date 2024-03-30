package X;

/* renamed from: X.2MR  reason: invalid class name */
public final class AnonymousClass2MR extends C588831k {
    public final AnonymousClass2bT A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2MR(AnonymousClass2bT r2) {
        super(C51862oV.EVENT_ADDITIONAL_INFO);
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass2MR) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass2MR) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("EventAdditionalInfo(message=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
