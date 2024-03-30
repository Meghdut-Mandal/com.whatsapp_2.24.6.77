package X;

import java.util.Map;
import java.util.Set;
import java.util.Stack;

/* renamed from: X.9XM  reason: invalid class name */
public final class AnonymousClass9XM {
    public long A00 = System.currentTimeMillis();
    public boolean A01;
    public final AnonymousClass9F8 A02;
    public final AnonymousClass9XN A03;
    public final String A04;
    public final Set A05 = C36441kJ.A17();
    public final Stack A06 = new Stack();
    public final C19970wo A07;
    public final C195579Uz A08;

    public final void A01(String str) {
        AnonymousClass00C.A0D(str, 0);
        if (str.equals(this.A03.A01)) {
            ((C195849Wh) this.A06.peek()).A00 = C187888yh.COMPLETE;
        }
    }

    public final String A00() {
        Stack stack = this.A03.A08;
        if (stack.isEmpty()) {
            return null;
        }
        String str = (String) stack.peek();
        while (true) {
            Stack stack2 = this.A06;
            if (AnonymousClass00C.A0J(((C195849Wh) stack2.peek()).A01, str)) {
                return str;
            }
            stack2.pop();
        }
    }

    public final void A02(String str, Map map) {
        if (map == null) {
            return;
        }
        if (str == null || str.equals(((C195849Wh) this.A06.peek()).A01)) {
            ((C195849Wh) this.A06.peek()).A03.putAll(map);
        }
    }

    public AnonymousClass9XM(C19970wo r3, AnonymousClass9F8 r4, C195579Uz r5, AnonymousClass9XN r6, String str) {
        C36321k7.A0x(r3, r4);
        this.A07 = r3;
        this.A02 = r4;
        this.A04 = str;
        this.A08 = r5;
        this.A03 = r6;
    }
}
