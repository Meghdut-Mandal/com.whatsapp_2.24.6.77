package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.3ux  reason: invalid class name and case insensitive filesystem */
public final class C80163ux implements Comparable {
    public final AnonymousClass11F A00;
    public final String A01;

    public C80163ux(AnonymousClass11F r2, String str) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C80163ux) {
                C80163ux r5 = (C80163ux) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C80163ux r3 = (C80163ux) obj;
        AnonymousClass00C.A0D(r3, 0);
        return this.A00.compareTo((Jid) r3.A00);
    }

    public int hashCode() {
        return C36391kE.A0A(this.A00) + C36341k9.A09(this.A01);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Mention(jid=");
        A0u.append(this.A00);
        A0u.append(", displayName=");
        return C36321k7.A0E(this.A01, A0u);
    }
}
