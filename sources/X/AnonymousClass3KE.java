package X;

import java.util.Map;

/* renamed from: X.3KE  reason: invalid class name */
public final class AnonymousClass3KE {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final Map A05;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass3KE) && AnonymousClass00C.A0J(this.A05, ((AnonymousClass3KE) obj).A05));
    }

    public int hashCode() {
        return this.A05.hashCode();
    }

    public AnonymousClass3KE(Map map) {
        boolean z;
        this.A05 = map;
        this.A03 = C36431kI.A1A("title", map);
        this.A00 = C36431kI.A1A("body", map);
        if (map.get("hide_date") != null) {
            Object obj = map.get("hide_date");
            AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type kotlin.Boolean");
            z = AnonymousClass000.A1X(obj);
        } else {
            z = true;
        }
        this.A04 = z;
        Object obj2 = map.get("btn_primary_text");
        C18740tg.A06(obj2);
        AnonymousClass00C.A0E(obj2, "null cannot be cast to non-null type kotlin.String");
        this.A02 = (String) obj2;
        Object obj3 = map.get("btn_primary_url");
        C18740tg.A06(obj3);
        AnonymousClass00C.A0E(obj3, "null cannot be cast to non-null type kotlin.String");
        this.A01 = (String) obj3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CustomForceUpgradeData(customForceUpgradeData=");
        return AnonymousClass000.A0m(this.A05, A0u);
    }
}
