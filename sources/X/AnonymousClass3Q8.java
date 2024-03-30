package X;

import java.util.List;

/* renamed from: X.3Q8  reason: invalid class name */
public final class AnonymousClass3Q8 {
    public final AnonymousClass3QK A00;
    public final List A01;
    public final List A02;
    public final AnonymousClass147 A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3Q8) {
                AnonymousClass3Q8 r5 = (AnonymousClass3Q8) obj;
                if (!AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A02, C36351kA.A05(this.A01, ((AnonymousClass000.A0H(this.A03) * 31) + C36411kG.A09(this.A00)) * 31));
    }

    public AnonymousClass3Q8(AnonymousClass3QK r1, AnonymousClass147 r2, List list, List list2) {
        this.A03 = r2;
        this.A00 = r1;
        this.A01 = list;
        this.A02 = list2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CommunityGroups(parent=");
        A0u.append(this.A03);
        A0u.append(", cag=");
        A0u.append(this.A00);
        A0u.append(", joinedSubgroups=");
        A0u.append(this.A01);
        A0u.append(", unJoinedSubgroups=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass3Q8() {
        /*
            r2 = this;
            r1 = 0
            X.09w r0 = X.C023409w.A00
            r2.<init>(r1, r1, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Q8.<init>():void");
    }
}
