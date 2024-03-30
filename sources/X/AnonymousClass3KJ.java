package X;

import java.util.Map;

/* renamed from: X.3KJ  reason: invalid class name */
public final class AnonymousClass3KJ {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final Map A06;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass3KJ) && AnonymousClass00C.A0J(this.A06, ((AnonymousClass3KJ) obj).A06));
    }

    public int hashCode() {
        return this.A06.hashCode();
    }

    public AnonymousClass3KJ(Map map) {
        this.A06 = map;
        this.A05 = C36431kI.A1A("title", map);
        this.A00 = C36431kI.A1A("body", map);
        Object obj = map.get("btn_primary_text");
        C18740tg.A06(obj);
        AnonymousClass00C.A08(obj);
        this.A02 = (String) obj;
        Object obj2 = map.get("btn_primary_url");
        C18740tg.A06(obj2);
        AnonymousClass00C.A08(obj2);
        this.A01 = (String) obj2;
        this.A04 = C36431kI.A1A("btn_secondary_text", map);
        this.A03 = C36431kI.A1A("btn_secondary_url", map);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CustomBlockScreenData(customBlockScreenData=");
        return AnonymousClass000.A0m(this.A06, A0u);
    }
}
