package X;

/* renamed from: X.2EO  reason: invalid class name */
public final class AnonymousClass2EO extends C53502rQ {
    public final AnonymousClass11F A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass2EO) {
                AnonymousClass2EO r5 = (AnonymousClass2EO) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36391kE.A0A(this.A00) + C36341k9.A01(this.A01 ? 1 : 0);
    }

    public AnonymousClass2EO(AnonymousClass11F r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("UnlockChat(chatJid=");
        A0u.append(this.A00);
        A0u.append(", openChatDirectly=");
        return C36321k7.A0H(A0u, this.A01);
    }
}
