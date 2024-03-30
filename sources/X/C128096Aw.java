package X;

import java.util.List;

/* renamed from: X.6Aw  reason: invalid class name and case insensitive filesystem */
public final class C128096Aw {
    public final C157827ek A00;
    public final Object A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128096Aw) {
                C128096Aw r5 = (C128096Aw) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((AnonymousClass000.A0H(this.A00) * 31) + AnonymousClass000.A0H(this.A01)) * 31) + C36411kG.A09(this.A02);
    }

    public C128096Aw(C157827ek r1, Object obj, List list) {
        this.A00 = r1;
        this.A01 = obj;
        this.A02 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ResolveResult(resolvedNode=");
        A0u.append(this.A00);
        A0u.append(", resolvedState=");
        A0u.append(this.A01);
        A0u.append(", appliedStateUpdates=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}
