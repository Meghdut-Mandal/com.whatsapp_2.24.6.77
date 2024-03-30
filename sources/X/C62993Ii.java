package X;

/* renamed from: X.3Ii  reason: invalid class name and case insensitive filesystem */
public final class C62993Ii {
    public final C52352pI A00;
    public final boolean A01;

    public C62993Ii(C52352pI r2, boolean z) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
        this.A01 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62993Ii) {
                C62993Ii r5 = (C62993Ii) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
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

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("StorageChatTypeItem(type=");
        A0u.append(this.A00);
        A0u.append(", isSelected=");
        return C36321k7.A0H(A0u, this.A01);
    }
}
