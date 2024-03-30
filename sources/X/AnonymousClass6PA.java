package X;

import java.util.List;

/* renamed from: X.6PA  reason: invalid class name */
public final class AnonymousClass6PA {
    public final List A00;
    public final List A01;
    public final AnonymousClass00T A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6PA) {
                AnonymousClass6PA r5 = (AnonymousClass6PA) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36391kE.A0A(this.A00));
    }

    public AnonymousClass6PA(List list, List list2) {
        C36321k7.A0x(list, list2);
        this.A00 = list;
        this.A01 = list2;
        this.A02 = C001400p.A00(C000800j.NONE, new AnonymousClass7L3(this));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("LidContactDelta(lidContactsAdded=");
        A0u.append(this.A00);
        A0u.append(", lidContactsRemoved=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass6PA() {
        /*
            r1 = this;
            X.09w r0 = X.C023409w.A00
            r1.<init>(r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6PA.<init>():void");
    }
}
