package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.72a  reason: invalid class name and case insensitive filesystem */
public final class C1496172a implements Iterable, AnonymousClass7e3, AnonymousClass00W {
    public boolean A00;
    public boolean A01;
    public final Map A02 = C36431kI.A1G();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1496172a) {
                C1496172a r5 = (C1496172a) obj;
                if (!(AnonymousClass00C.A0J(this.A02, r5.A02) && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A00(C1496172a r0, Object obj) {
        return r0.A02.containsKey(obj);
    }

    public final Object A01(AnonymousClass62Q r3) {
        Object obj = this.A02.get(r3);
        if (obj != null) {
            return obj;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Key not present: ");
        A0u.append(r3);
        throw AnonymousClass000.A0g(" - consider getOrElse or getOrNull", A0u);
    }

    public void Bq1(AnonymousClass62Q r6, Object obj) {
        if (obj instanceof AnonymousClass69I) {
            Map map = this.A02;
            if (map.containsKey(r6)) {
                Object obj2 = map.get(r6);
                AnonymousClass00C.A0E(obj2, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                AnonymousClass69I r3 = (AnonymousClass69I) obj2;
                AnonymousClass69I r7 = (AnonymousClass69I) obj;
                String str = r7.A00;
                if (str == null) {
                    str = r3.A00;
                }
                AnonymousClass00P r1 = r7.A01;
                if (r1 == null) {
                    r1 = r3.A01;
                }
                map.put(r6, new AnonymousClass69I(str, r1));
                return;
            }
        }
        this.A02.put(r6, obj);
    }

    public int hashCode() {
        return ((C36391kE.A0A(this.A02) + C36341k9.A01(this.A01 ? 1 : 0)) * 31) + C36341k9.A01(this.A00 ? 1 : 0);
    }

    public Iterator iterator() {
        return AnonymousClass000.A0y(this.A02);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        String str = "";
        if (this.A01) {
            A0u.append(str);
            A0u.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.A00) {
            A0u.append(str);
            A0u.append("isClearingSemantics=true");
            str = ", ";
        }
        Iterator A0y = AnonymousClass000.A0y(this.A02);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            Object value = A11.getValue();
            A0u.append(str);
            A0u.append(((AnonymousClass62Q) A11.getKey()).A01);
            A0u.append(" : ");
            A0u.append(value);
            str = ", ";
        }
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append(AnonymousClass5X8.A00(this));
        A0u2.append("{ ");
        A0u2.append(A0u);
        return AnonymousClass000.A0q(" }", A0u2);
    }
}
