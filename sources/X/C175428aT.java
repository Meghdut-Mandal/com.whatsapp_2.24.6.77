package X;

/* renamed from: X.8aT  reason: invalid class name and case insensitive filesystem */
public final class C175428aT extends AnonymousClass96P {
    public final C175448aV A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C175428aT) && AnonymousClass00C.A0J(this.A00, ((C175428aT) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C175428aT(C175448aV r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Success(conversionInfo=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
