package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

/* renamed from: X.9l5  reason: invalid class name and case insensitive filesystem */
public final class C202129l5 {
    public AnonymousClass5SL A00;
    public boolean A01;
    public final AnonymousClass9F6 A02;
    public final AnonymousClass9WF A03;
    public final AnonymousClass6EW A04;
    public final AnonymousClass975 A05;

    public final void A03(C187868yf r13) {
        String str;
        C195679Vn r0;
        AnonymousClass9WF r1 = this.A03;
        Stack stack = r1.A01;
        if (stack.size() == 0) {
            C203619oP r02 = this.A02.A00;
            r02.A0F.A0H(r02.A0L);
            return;
        }
        String str2 = r1.A00().A01;
        int size = stack.size();
        if (size < 2 || (r0 = (C195679Vn) C36441kJ.A15(stack).get(size - 2)) == null) {
            str = null;
        } else {
            str = r0.A01;
        }
        A00(this, str);
        A02(r13, (AnonymousClass6PH) null, str, str2, (String) null, (Map) null, true);
    }

    public final void A04(C187868yf r13, AnonymousClass6PH r14, String str, String str2, Map map) {
        boolean z;
        ArrayList A15;
        String str3 = str;
        AnonymousClass9WF r1 = this.A03;
        Stack stack = r1.A01;
        if (stack.size() != 0) {
            String str4 = r1.A00().A01;
            if (str == null) {
                Stack stack2 = r1.A02;
                int size = stack2.size();
                if (size >= 2) {
                    A15 = C36441kJ.A15(stack2);
                } else {
                    size = stack.size();
                    if (size >= 2) {
                        A15 = C36441kJ.A15(stack);
                    }
                    str3 = null;
                }
                C195679Vn r0 = (C195679Vn) A15.get(size - 2);
                if (r0 != null) {
                    str3 = r0.A01;
                }
                str3 = null;
            }
            C195679Vn A002 = A00(this, str3);
            if (A002 != null) {
                z = A002.A00;
                A002.A00 = true;
            } else {
                z = true;
            }
            A02(r13, r14, str3, str4, str2, map, z);
        }
    }

    public static final C195679Vn A00(C202129l5 r7, String str) {
        Stack stack;
        while (true) {
            AnonymousClass9WF r5 = r7.A03;
            Stack stack2 = r5.A02;
            if (stack2.size() == 0) {
                C195679Vn r1 = null;
                while (true) {
                    stack = r5.A01;
                    if (stack.size() == 0) {
                        break;
                    }
                    String str2 = ((C195679Vn) C165607th.A0n(stack)).A01;
                    if (AnonymousClass00C.A0J(str2, str)) {
                        r1 = (C195679Vn) C165607th.A0n(stack);
                        break;
                    }
                    if (stack.size() >= 1) {
                        stack.pop();
                    }
                    r5.A00.remove(str2);
                }
                AnonymousClass6EW r52 = r7.A04;
                ArrayList A15 = C36441kJ.A15(stack);
                ArrayList A0J = C36321k7.A0J(A15);
                Iterator it = A15.iterator();
                while (it.hasNext()) {
                    A0J.add(((C195679Vn) it.next()).A01);
                }
                r52.A02(new C149116zx(A0J));
                r7.A01 = false;
                return r1;
            }
            String str3 = ((C195679Vn) C165607th.A0n(stack2)).A01;
            if (AnonymousClass00C.A0J(str3, str)) {
                return (C195679Vn) C165607th.A0n(stack2);
            }
            if (stack2.size() >= 1) {
                stack2.pop();
            }
            r5.A00.remove(str3);
        }
    }

    public static final LinkedHashMap A01(C202129l5 r2, String str, String str2) {
        LinkedHashMap A1G;
        Map map;
        C195689Vo r0 = (C195689Vo) r2.A03.A00.remove(str);
        if (r0 == null || (map = r0.A01) == null) {
            A1G = C36431kI.A1G();
        } else {
            A1G = new LinkedHashMap(map);
        }
        A1G.remove(C108355Te.ERROR.key);
        A1G.remove("is_back_triggered");
        if (str2 != null) {
            Object Bmq = C200759iB.A01(str2).Bmq("$", new C22902AyE[0]);
            AnonymousClass00C.A08(Bmq);
            A1G.putAll((Map) Bmq);
        }
        return A1G;
    }

    private final void A02(C187868yf r12, AnonymousClass6PH r13, String str, String str2, String str3, Map map, boolean z) {
        AnonymousClass8h2 r7;
        if (str == null) {
            C203619oP r0 = this.A02.A00;
            r0.A0F.A0H(r0.A0L);
            return;
        }
        String str4 = (String) C007103b.A0L(AnonymousClass099.A0L(str, new String[]{":"}, 0));
        if (!AnonymousClass00C.A0J(str4, C007103b.A0L(C90494aF.A0i(str2, ":")))) {
            this.A04.A02(new AT9(str4));
            return;
        }
        AnonymousClass9F6 r02 = this.A02;
        String str5 = str3;
        Map map2 = map;
        if (z) {
            LinkedHashMap A012 = A01(this, str, str5);
            C203619oP r1 = r02.A00;
            r1.A02 = r12;
            C203619oP.A04(r1, r13, (String) C007103b.A0N(C90494aF.A0i(str, ":")), map2, A012, true);
            return;
        }
        LinkedHashMap A013 = A01(this, str, str5);
        C203619oP r5 = r02.A00;
        r5.A02 = r12;
        String str6 = (String) C007103b.A0N(C90494aF.A0i(str, ":"));
        AnonymousClass9F7 r03 = r5.A0H;
        AnonymousClass00C.A0D(str6, 0);
        C194679Qr r72 = (C194679Qr) ((Map) C165607th.A0n(r03.A00)).get(str6);
        String str7 = null;
        if (!(r72 instanceof AnonymousClass8h2) || (r7 = (AnonymousClass8h2) r72) == null) {
            throw C90524aI.A0Y(AnonymousClass000.A0p("state not found for name: ", str6, AnonymousClass000.A0u()));
        }
        if (map != null) {
            str7 = r7.A02;
        }
        C203619oP.A02(r5, AnonymousClass5SM.RESTORE, r7, (AnonymousClass6PH) null, str7, C132596Uk.A00.A02(r7.A01, r7.A02, map2, A013));
    }

    public C202129l5(AnonymousClass975 r2, AnonymousClass9F6 r3, AnonymousClass9WF r4, C131376Ou r5, String str, boolean z) {
        C36321k7.A0y(r5, r2);
        AnonymousClass00C.A0D(r3, 5);
        this.A03 = r4;
        this.A05 = r2;
        this.A02 = r3;
        this.A01 = z;
        this.A04 = r5.A02(str);
    }
}
