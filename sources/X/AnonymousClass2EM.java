package X;

/* renamed from: X.2EM  reason: invalid class name */
public final class AnonymousClass2EM extends C53502rQ {
    public final AnonymousClass11F A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass2EM) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass2EM) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass2EM(AnonymousClass11F r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("LockChat(chatJid=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
