package X;

/* renamed from: X.5IP  reason: invalid class name */
public final class AnonymousClass5IP extends C111395cD {
    public final AnonymousClass690 A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5IP) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass5IP) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass5IP(AnonymousClass690 r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RemoteSticker(stableId=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
