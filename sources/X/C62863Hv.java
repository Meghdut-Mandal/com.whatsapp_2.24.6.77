package X;

import java.util.List;

/* renamed from: X.3Hv  reason: invalid class name and case insensitive filesystem */
public final class C62863Hv {
    public final long A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62863Hv) {
                C62863Hv r8 = (C62863Hv) obj;
                if (!AnonymousClass00C.A0J(this.A01, r8.A01) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36341k9.A02(this.A00, C36391kE.A0A(this.A01));
    }

    public C62863Hv(List list, long j) {
        this.A01 = list;
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SubgroupsProfilePhotos(photos=");
        A0u.append(this.A01);
        A0u.append(", timestamp=");
        return C36331k8.A0j(A0u, this.A00);
    }
}
