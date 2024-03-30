package X;

/* renamed from: X.2W3  reason: invalid class name */
public final class AnonymousClass2W3 extends C54562t9 {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass2W3) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass2W3) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass2W3(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Success(taskId=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
