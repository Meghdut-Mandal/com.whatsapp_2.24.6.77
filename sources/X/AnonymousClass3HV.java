package X;

/* renamed from: X.3HV  reason: invalid class name */
public final class AnonymousClass3HV {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass3HV) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass3HV) obj).A00));
    }

    public AnonymousClass3HV(String str) {
        this.A00 = str;
    }

    public int hashCode() {
        return -656875146 + C36341k9.A09(this.A00);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CriticalEvent(criticalEvent=");
        A0u.append("participant-attribute-parser");
        A0u.append(", debugInfo=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
