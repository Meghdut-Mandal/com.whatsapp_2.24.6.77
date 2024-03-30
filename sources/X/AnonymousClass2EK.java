package X;

/* renamed from: X.2EK  reason: invalid class name */
public final class AnonymousClass2EK extends C53502rQ {
    public final AnonymousClass11F A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass2EK) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass2EK) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass2EK(AnonymousClass11F r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("DisableChatLock(chatJid=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
