package X;

import java.util.Map;

/* renamed from: X.5IS  reason: invalid class name */
public final class AnonymousClass5IS extends C111405cE {
    public final String A00;
    public final Map A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5IS) {
                AnonymousClass5IS r5 = (AnonymousClass5IS) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (C36341k9.A09(this.A00) * 31) + C36411kG.A09(this.A01);
    }

    public AnonymousClass5IS(String str, Map map) {
        this.A00 = str;
        this.A01 = map;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AvatarNoticeEvent(event=");
        A0u.append(this.A00);
        A0u.append(", params=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
