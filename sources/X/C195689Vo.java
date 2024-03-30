package X;

import java.util.Map;

/* renamed from: X.9Vo  reason: invalid class name and case insensitive filesystem */
public final class C195689Vo {
    public final AnonymousClass8h2 A00;
    public final Map A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195689Vo) {
                C195689Vo r5 = (C195689Vo) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36391kE.A0A(this.A00) + AnonymousClass000.A0H(this.A01);
    }

    public C195689Vo(AnonymousClass8h2 r1, Map map) {
        this.A00 = r1;
        this.A01 = map;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("StateInputCacheData(cachedState=");
        A0u.append(this.A00);
        A0u.append(", cachedStateInput=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
