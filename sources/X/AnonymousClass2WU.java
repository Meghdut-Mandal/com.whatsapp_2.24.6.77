package X;

/* renamed from: X.2WU  reason: invalid class name */
public final class AnonymousClass2WU extends C54592tC {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass2WU) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass2WU) obj).A00));
    }

    public int hashCode() {
        return C36341k9.A09(this.A00);
    }

    public AnonymousClass2WU(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("LogsInfo(logsId=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
