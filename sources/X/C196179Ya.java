package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.9Ya  reason: invalid class name and case insensitive filesystem */
public abstract class C196179Ya {
    public int A00 = -1;
    public C196179Ya A01;
    public C196179Ya A02;
    public Boolean A03 = null;
    public Boolean A04 = null;

    public void A04(C199959gK r5, Object obj, String str, int i) {
        C21670AUn aUn;
        String A022 = C201749kK.A02(str, "[", String.valueOf(i), "]");
        if (r5.A07) {
            aUn = new AnonymousClass8T0(obj, i);
        } else {
            aUn = C21670AUn.A01;
        }
        if (i < 0) {
            i += r5.A01.A00.BOA(obj);
        }
        try {
            Object obj2 = ((List) obj).get(i);
            if (this.A01 == null) {
                r5.A02(aUn, obj2, A022);
            } else {
                A01().A03(aUn, r5, obj2, A022);
            }
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    public C196179Ya A01() {
        C196179Ya r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass001.A09("Current path token is a leaf");
    }

    public String A02() {
        if (this instanceof AnonymousClass8TM) {
            return "[*]";
        }
        if (this instanceof AnonymousClass8TR) {
            return "..";
        }
        if (this instanceof AnonymousClass8TP) {
            return ((AnonymousClass8TP) this).A02;
        }
        if (this instanceof AnonymousClass8TN) {
            AnonymousClass8TN r0 = (AnonymousClass8TN) this;
            return C165567td.A0Y(C201749kK.A00(r0.A01, ",", r0.A00), C90484aE.A0p());
        } else if (this instanceof AnonymousClass8TQ) {
            AnonymousClass8TQ r3 = (AnonymousClass8TQ) this;
            StringBuilder A0p = C90484aE.A0p();
            for (int i = 0; i < r3.A00.size(); i++) {
                if (i != 0) {
                    A0p.append(",");
                }
                A0p.append("?");
            }
            return C90474aD.A0g(A0p);
        } else if (this instanceof AnonymousClass8TO) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append(".");
            return AnonymousClass000.A0q(((AnonymousClass8TO) this).A02, A0u);
        } else if (this instanceof AnonymousClass8TK) {
            return ((AnonymousClass8TK) this).A00.toString();
        } else {
            return ((AnonymousClass8TJ) this).A00.toString();
        }
    }

    public void A03(C21670AUn aUn, C199959gK r23, Object obj, String str) {
        C22906AyI a8h;
        String A0k;
        C22907AyJ ayJ;
        C21670AUn aUn2 = aUn;
        C199959gK r10 = r23;
        Object obj2 = obj;
        String str2 = str;
        if (this instanceof AnonymousClass8TM) {
            C194879Rp r6 = r10.A01;
            C23091B4b b4b = r6.A00;
            if (obj2 instanceof Map) {
                for (Object singletonList : b4b.BGJ(obj2)) {
                    A05(r10, obj2, str2, Collections.singletonList(singletonList));
                }
            } else if (obj2 instanceof List) {
                for (int i = 0; i < b4b.BOA(obj2); i++) {
                    try {
                        A04(r10, obj2, str2, i);
                    } catch (C173698Sr e) {
                        if (r6.A03.contains(C188068yz.REQUIRE_PROPERTIES)) {
                            throw e;
                        }
                    }
                }
            }
        } else if (this instanceof AnonymousClass8TR) {
            C196179Ya A012 = A01();
            if (A012 instanceof AnonymousClass8TN) {
                ayJ = new A8M(r10, A012);
            } else if (A012 instanceof AnonymousClass8TL) {
                ayJ = new A8K(r10);
            } else if (A012 instanceof AnonymousClass8TM) {
                ayJ = new A8J();
            } else if (A012 instanceof AnonymousClass8TQ) {
                ayJ = new A8L(r10, A012);
            } else {
                ayJ = AnonymousClass8TR.A00;
            }
            AnonymousClass8TR.A00(aUn2, r10, A012, ayJ, obj2, str2);
        } else if (this instanceof AnonymousClass8TP) {
            AnonymousClass8TP r3 = (AnonymousClass8TP) this;
            if (r3.A01 == null) {
                if (!r10.A07) {
                    aUn2 = C21670AUn.A01;
                }
                r10.A02(aUn2, obj2, r3.A02);
                return;
            }
            r3.A01().A03(aUn2, r10, obj2, r3.A02);
        } else if (this instanceof AnonymousClass8TN) {
            AnonymousClass8TN r32 = (AnonymousClass8TN) this;
            C194879Rp r1 = r10.A01;
            C23091B4b b4b2 = r1.A00;
            if (obj2 instanceof Map) {
                List<Object> list = r32.A01;
                if (list.size() == 1 || (r32.A01 == null && list.size() > 1)) {
                    r32.A05(r10, obj2, str2, list);
                    return;
                }
                ArrayList A14 = C36441kJ.A14(1);
                A14.add((Object) null);
                for (Object obj3 : list) {
                    A14.set(0, obj3);
                    r32.A05(r10, obj2, str2, A14);
                }
            } else if (r32.A06() && !r1.A03.contains(C188068yz.SUPPRESS_EXCEPTIONS)) {
                if (obj == null) {
                    A0k = "null";
                } else {
                    A0k = AnonymousClass000.A0k(obj2);
                }
                Object[] objArr = new Object[4];
                objArr[0] = r32.A02();
                C36411kG.A1Q(str2, A0k, objArr, 1);
                objArr[3] = AnonymousClass000.A0k(b4b2);
                throw new C173698Sr(String.format("Expected to find an object with property %s in path %s but found '%s'. This is not a json object according to the JsonProvider: '%s'.", objArr));
            }
        } else if (this instanceof AnonymousClass8TQ) {
            AnonymousClass8TQ r33 = (AnonymousClass8TQ) this;
            C194879Rp r5 = r10.A01;
            C23091B4b b4b3 = r5.A00;
            if (!(obj2 instanceof Map)) {
                int i2 = 0;
                if (obj2 instanceof List) {
                    for (Object A09 : b4b3.Bvj(obj2)) {
                        if (r33.A09(r5, r10, A09, r10.A04)) {
                            r33.A04(r10, obj2, str2, i2);
                        }
                        i2++;
                    }
                } else if (r33.A06()) {
                    Object[] A0M = AnonymousClass001.A0M();
                    C90494aF.A1H(r33.toString(), obj2, A0M);
                    throw C173738Sv.A00(String.format("Filter: %s can not be applied to primitives. Current context is: %s", A0M));
                }
            } else if (r33.A09(r5, r10, obj2, r10.A04)) {
                if (!r10.A07) {
                    aUn2 = C21670AUn.A01;
                }
                if (r33.A01 == null) {
                    r10.A02(aUn2, obj2, str2);
                } else {
                    r33.A01().A03(aUn2, r10, obj2, str2);
                }
            }
        } else if (this instanceof AnonymousClass8TO) {
            AnonymousClass8TO r34 = (AnonymousClass8TO) this;
            String str3 = r34.A01;
            Class cls = (Class) AnonymousClass99W.A00.get(str3);
            if (cls != null) {
                try {
                    C22905AyH ayH = (C22905AyH) cls.newInstance();
                    List<C201989kp> list2 = r34.A00;
                    if (list2 != null) {
                        for (C201989kp r52 : list2) {
                            int intValue = r52.A03.intValue();
                            if (intValue == 1) {
                                a8h = new A8H(r10.A01, r52.A01, r10.A04);
                                if (r52.A02.booleanValue() && a8h.equals(r52.A00)) {
                                }
                            } else if (intValue == 0 && !r52.A02.booleanValue()) {
                                a8h = new A8G(r52, r10.A01.A00);
                            }
                            r52.A00 = a8h;
                            r52.A02 = true;
                        }
                    }
                    Object BKy = ayH.BKy(aUn2, r10, obj2, str2, r34.A00);
                    r10.A02(aUn2, BKy, AnonymousClass000.A0p(".", str3, AnonymousClass000.A0v(str2)));
                    if (r34.A01 != null) {
                        r34.A01().A03(aUn2, r10, BKy, str2);
                    }
                } catch (Exception e2) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("Function of name: ");
                    A0u.append(str3);
                    throw new C173738Sv(AnonymousClass000.A0q(" cannot be created", A0u), e2);
                }
            } else {
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("Function with name: ");
                A0u2.append(str3);
                throw C173738Sv.A00(AnonymousClass000.A0q(" does not exist.", A0u2));
            }
        } else if (this instanceof AnonymousClass8TK) {
            AnonymousClass8TK r35 = (AnonymousClass8TK) this;
            if (r35.A09(r10, obj2, str2)) {
                AnonymousClass9RL r4 = r35.A00;
                int intValue2 = r4.A01.intValue();
                if (intValue2 != 0) {
                    C23091B4b b4b4 = r10.A01.A00;
                    if (intValue2 != 2) {
                        int BOA = b4b4.BOA(obj2);
                        if (BOA != 0) {
                            int intValue3 = r4.A02.intValue();
                            if (intValue3 < 0) {
                                intValue3 += BOA;
                            }
                            int min = Math.min(BOA, intValue3);
                            r35.toString();
                            for (int i3 = 0; i3 < min; i3++) {
                                r35.A04(r10, obj2, str2, i3);
                            }
                            return;
                        }
                        return;
                    }
                    int BOA2 = b4b4.BOA(obj2);
                    int intValue4 = r4.A00.intValue();
                    int min2 = Math.min(BOA2, r4.A02.intValue());
                    if (intValue4 < min2 && BOA2 != 0) {
                        r35.toString();
                        while (intValue4 < min2) {
                            r35.A04(r10, obj2, str2, intValue4);
                            intValue4++;
                        }
                        return;
                    }
                    return;
                }
                int BOA3 = r10.A01.A00.BOA(obj2);
                int intValue5 = r4.A00.intValue();
                if (intValue5 < 0) {
                    intValue5 += BOA3;
                }
                int max = Math.max(0, intValue5);
                r35.toString();
                if (BOA3 != 0 && max < BOA3) {
                    while (max < BOA3) {
                        r35.A04(r10, obj2, str2, max);
                        max++;
                    }
                }
            }
        } else {
            AnonymousClass8TJ r36 = (AnonymousClass8TJ) this;
            if (r36.A09(r10, obj2, str2)) {
                List list3 = r36.A00.A00;
                if (list3.size() == 1) {
                    r36.A04(r10, obj2, str2, C36351kA.A06(list3, 0));
                    return;
                }
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    r36.A04(r10, obj2, str2, C36341k9.A0A(it));
                }
            }
        }
    }

    public boolean A06() {
        boolean z;
        Boolean bool = this.A04;
        if (bool == null) {
            C196179Ya r0 = this.A02;
            if (r0 == null || (r0.A08() && this.A02.A06())) {
                z = true;
            } else {
                z = false;
            }
            bool = Boolean.valueOf(z);
            this.A04 = bool;
        }
        return bool.booleanValue();
    }

    public boolean A07() {
        C196179Ya r0;
        Boolean bool = this.A03;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean A08 = A08();
        if (A08 && (r0 = this.A01) != null) {
            A08 = r0.A07();
        }
        this.A03 = Boolean.valueOf(A08);
        return A08;
    }

    public boolean A08() {
        if ((this instanceof AnonymousClass8TM) || (this instanceof AnonymousClass8TR)) {
            return false;
        }
        if (this instanceof AnonymousClass8TP) {
            return true;
        }
        if (this instanceof AnonymousClass8TN) {
            AnonymousClass8TN r3 = (AnonymousClass8TN) this;
            List list = r3.A01;
            if (list.size() == 1) {
                return true;
            }
            if (r3.A01 != null || list.size() <= 1) {
                return false;
            }
            return true;
        } else if (this instanceof AnonymousClass8TQ) {
            return false;
        } else {
            if (this instanceof AnonymousClass8TO) {
                return true;
            }
            if (!(this instanceof AnonymousClass8TK)) {
                return AnonymousClass000.A1O(((AnonymousClass8TJ) this).A00.A00.size());
            }
            return false;
        }
    }

    public String toString() {
        if (this.A01 == null) {
            return A02();
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(A02());
        C36351kA.A1K(A01(), A0u);
        return A0u.toString();
    }

    public void A05(C199959gK r11, Object obj, String str, List list) {
        C21670AUn aUn;
        Object obj2;
        Object obj3;
        C21670AUn aUn2;
        Object obj4 = null;
        if (list.size() == 1) {
            String A0s = C36401kF.A0s(list, 0);
            CharSequence[] charSequenceArr = new CharSequence[4];
            charSequenceArr[0] = str;
            C36411kG.A1Q("['", A0s, charSequenceArr, 1);
            charSequenceArr[3] = "']";
            String A022 = C201749kK.A02(charSequenceArr);
            Map map = (Map) obj;
            if (!map.containsKey(A0s)) {
                obj3 = C23091B4b.A00;
            } else {
                obj3 = map.get(A0s);
            }
            if (obj3 != C23091B4b.A00) {
                obj4 = obj3;
            } else if (this.A01 == null) {
                Set set = r11.A01.A03;
                if (!set.contains(C188068yz.DEFAULT_PATH_LEAF_TO_NULL)) {
                    if (!set.contains(C188068yz.SUPPRESS_EXCEPTIONS) && set.contains(C188068yz.REQUIRE_PROPERTIES)) {
                        throw new C173698Sr(AnonymousClass000.A0p("No results for path: ", A022, AnonymousClass000.A0u()));
                    }
                    return;
                }
            } else if (((A06() && A08()) || r11.A01.A03.contains(C188068yz.REQUIRE_PROPERTIES)) && !r11.A01.A03.contains(C188068yz.SUPPRESS_EXCEPTIONS)) {
                throw new C173698Sr(C36321k7.A0D("Missing property in path ", A022));
            } else {
                return;
            }
            if (r11.A07) {
                aUn2 = new C173778Sz(obj, A0s);
            } else {
                aUn2 = C21670AUn.A01;
            }
            if (this.A01 == null) {
                String A0p = AnonymousClass000.A0p(String.valueOf(this.A00), "]", AnonymousClass000.A0v("["));
                if (A0p.equals("[-1]") || r11.A02.A00.A01.A02.A02().equals(A0p)) {
                    r11.A02(aUn2, obj4, A022);
                    return;
                }
                return;
            }
            A01().A03(aUn2, r11, obj4, A022);
            return;
        }
        String A0p2 = AnonymousClass000.A0p(C201749kK.A00(list, ", ", "'"), "]", C36331k8.A0k(str, "["));
        C194879Rp r7 = r11.A01;
        C23091B4b b4b = r7.A00;
        Object A023 = ((A8O) b4b).A00.A02();
        for (Object next : list) {
            if (b4b.BGJ(obj).contains(next)) {
                Map map2 = (Map) obj;
                if (!map2.containsKey(next)) {
                    obj2 = C23091B4b.A00;
                } else {
                    obj2 = map2.get(next);
                }
                if (obj2 == C23091B4b.A00) {
                    if (!r7.A03.contains(C188068yz.DEFAULT_PATH_LEAF_TO_NULL)) {
                    }
                }
                b4b.Brr(A023, next, obj2);
            } else {
                Set set2 = r7.A03;
                if (!set2.contains(C188068yz.DEFAULT_PATH_LEAF_TO_NULL)) {
                    if (set2.contains(C188068yz.REQUIRE_PROPERTIES)) {
                        throw new C173698Sr(C36321k7.A0D("Missing property in path ", A0p2));
                    }
                }
            }
            obj2 = null;
            b4b.Brr(A023, next, obj2);
        }
        if (r11.A07) {
            aUn = new C173768Sy(obj, list);
        } else {
            aUn = C21670AUn.A01;
        }
        r11.A02(aUn, A023, A0p2);
    }

    public int hashCode() {
        return toString().hashCode();
    }
}
