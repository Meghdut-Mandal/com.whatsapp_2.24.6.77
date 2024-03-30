package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.6Bz  reason: invalid class name and case insensitive filesystem */
public final class C128366Bz {
    public final Object A00;
    public final String A01;
    public final List A02;
    public final Map A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128366Bz) {
                C128366Bz r5 = (C128366Bz) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A02, C36381kD.A08(this.A01, C36351kA.A05(this.A03, C36391kE.A0A(this.A00))));
    }

    public C128366Bz(Object obj, String str, List list, Map map) {
        C36321k7.A18(obj, map, str, list);
        this.A00 = obj;
        this.A03 = map;
        this.A01 = str;
        this.A02 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Template(templateId=");
        A0u.append(this.A00);
        A0u.append(", expandedVariables=");
        A0u.append(this.A03);
        A0u.append(", scopeKey=");
        A0u.append(this.A01);
        A0u.append(", keyPathBase=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}
