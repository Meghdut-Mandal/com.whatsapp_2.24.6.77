package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.6QB  reason: invalid class name */
public final class AnonymousClass6QB {
    public String A00;
    public byte[] A01;
    public final List A02 = AnonymousClass001.A0I();
    public final List A03 = AnonymousClass001.A0I();

    public final void A06(C203399nx r12) {
        AnonymousClass00C.A0D(r12, 0);
        String str = this.A00;
        if ("smax:any".equals(str)) {
            str = r12.A00;
            AnonymousClass00C.A08(str);
            this.A00 = str;
        }
        String str2 = r12.A00;
        if (!AnonymousClass00C.A0J(str, str2) && !"smax:any".equals(str2)) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Error merging <");
            A0u.append(this.A00);
            A0u.append("/> with <");
            A0u.append(str2);
            C90464aC.A1N("/>: conflicting tags", A0u, false);
        }
        AnonymousClass1AL[] A0k = r12.A0k();
        if (A0k != null) {
            C12310hq r4 = new C12310hq(A0k);
            while (r4.hasNext()) {
                AnonymousClass1AL r7 = (AnonymousClass1AL) r4.next();
                String str3 = r7.A02;
                List list = this.A02;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        list.add(r7);
                        break;
                    }
                    AnonymousClass1AL r1 = (AnonymousClass1AL) it.next();
                    if (AnonymousClass00C.A0J(r1.A02, str3)) {
                        if (!r7.equals(r1)) {
                            StringBuilder A0u2 = AnonymousClass000.A0u();
                            A0u2.append("Error merging attribute '");
                            A0u2.append(str3);
                            A0u2.append("' in <");
                            A0u2.append(this.A00);
                            C90464aC.A1N("/>: conflicting values", A0u2, false);
                        }
                    }
                }
            }
        }
        C203399nx[] r3 = r12.A02;
        if (!(r3 == null || r3.length == 0)) {
            if (this.A01 != null) {
                StringBuilder A0u3 = AnonymousClass000.A0u();
                A0u3.append("Error merging children into <");
                A0u3.append(this.A00);
                C90464aC.A1N("/>: element already has data", A0u3, false);
            }
            List list2 = this.A03;
            if (list2.isEmpty()) {
                C12310hq r13 = new C12310hq(r3);
                while (r13.hasNext()) {
                    Object next = r13.next();
                    AnonymousClass00C.A0B(next);
                    list2.add(next);
                }
            } else {
                LinkedHashMap A1G = C36431kI.A1G();
                for (Object next2 : list2) {
                    ((List) C36391kE.A0s(((C203399nx) next2).A00, A1G)).add(next2);
                }
                LinkedHashMap A0s = C90474aD.A0s(A1G);
                Iterator A0y = AnonymousClass000.A0y(A1G);
                while (A0y.hasNext()) {
                    Map.Entry A11 = AnonymousClass000.A11(A0y);
                    A0s.put(A11.getKey(), C90504aG.A0u((Collection) A11.getValue()));
                }
                List A0D = AnonymousClass02R.A0D(r3);
                LinkedHashMap A1G2 = C36431kI.A1G();
                for (Object next3 : A0D) {
                    ((List) C36391kE.A0s(((C203399nx) next3).A00, A1G2)).add(next3);
                }
                LinkedHashMap A0s2 = C90474aD.A0s(A1G2);
                Iterator A0y2 = AnonymousClass000.A0y(A1G2);
                while (A0y2.hasNext()) {
                    Map.Entry A112 = AnonymousClass000.A11(A0y2);
                    A0s2.put(A112.getKey(), C90504aG.A0u((Collection) A112.getValue()));
                }
                Iterator A0y3 = AnonymousClass000.A0y(A0s);
                while (A0y3.hasNext()) {
                    Map.Entry A113 = AnonymousClass000.A11(A0y3);
                    String A0f = C90494aF.A0f(A113);
                    List list3 = (List) A113.getValue();
                    if (A0s2.containsKey(A0f)) {
                        int size = list3.size();
                        Object obj = A0s2.get(A0f);
                        if (obj == null) {
                            throw C36381kD.A0l();
                        } else if (size != ((List) obj).size()) {
                            StringBuilder A0u4 = AnonymousClass000.A0u();
                            A0u4.append("Error merging children into <");
                            A0u4.append(this.A00);
                            A0u4.append("/>: conflicting child count for <");
                            A0u4.append(A0f);
                            C90464aC.A1N("/>", A0u4, false);
                        }
                    }
                }
                ArrayList A0I = AnonymousClass001.A0I();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    C203399nx A0s3 = C36431kI.A0s(it2);
                    String str4 = A0s3.A00;
                    if (A0s2.containsKey(str4)) {
                        Object obj2 = A0s2.get(str4);
                        if (obj2 != null) {
                            C203399nx r72 = (C203399nx) ((List) obj2).remove(0);
                            AnonymousClass00C.A08(str4);
                            AnonymousClass6QB A0q = C36441kJ.A0q(str4);
                            C203399nx[] r0 = A0s3.A02;
                            if (r0 != null) {
                                A0q.A03.addAll(AnonymousClass02R.A0D(r0));
                            }
                            AnonymousClass1AL[] A0k2 = A0s3.A0k();
                            if (A0k2 != null) {
                                A0q.A02.addAll(AnonymousClass02R.A0D(A0k2));
                            }
                            A0q.A01 = A0s3.A01;
                            A0q.A06(r72);
                            A0s3 = A0q.A03();
                        } else {
                            throw C36381kD.A0l();
                        }
                    }
                    A0I.add(A0s3);
                }
                Iterator A0y4 = AnonymousClass000.A0y(A0s2);
                while (A0y4.hasNext()) {
                    Map.Entry A114 = AnonymousClass000.A11(A0y4);
                    Object key = A114.getKey();
                    Collection collection = (Collection) A114.getValue();
                    if (!A0s.containsKey(key)) {
                        A0I.addAll(collection);
                    }
                }
                list2.clear();
                list2.addAll(A0I);
            }
        }
        byte[] bArr = r12.A01;
        if (bArr != null) {
            if (C36401kF.A1a(this.A03)) {
                StringBuilder A0v = AnonymousClass000.A0v("Error merging data into <");
                A0v.append(this.A00);
                C90464aC.A1N("/>: element already has children", A0v, false);
            }
            byte[] bArr2 = this.A01;
            if (bArr2 != null && !Arrays.equals(bArr2, bArr)) {
                StringBuilder A0v2 = AnonymousClass000.A0v("Error merging data into <");
                A0v2.append(this.A00);
                C90464aC.A1N("/>: conflicting values", A0v2, false);
            }
            this.A01 = bArr;
        }
    }

    public final void A08(String str, String str2, List list) {
        AnonymousClass00C.A0D(list, 2);
        if (str != null) {
            A09(str, str2, list);
        }
    }

    public final void A09(String str, String str2, List list) {
        C36321k7.A0v(str, 0, list);
        A02(str, list);
        C36331k8.A1D(this, str2, str);
    }

    public static void A01(AnonymousClass6QB r1, String str, int i) {
        r1.A04(new AnonymousClass1AL(str, i));
    }

    public final C203399nx A03() {
        C203399nx[] r1;
        List list = this.A02;
        Object[] objArr = null;
        if (C36401kF.A1a(list)) {
            objArr = list.toArray(new AnonymousClass1AL[0]);
        }
        List list2 = this.A03;
        if (C36401kF.A1a(list2) && (r1 = (C203399nx[]) list2.toArray(new C203399nx[0])) != null) {
            return new C203399nx(this.A00, (AnonymousClass1AL[]) objArr, r1);
        }
        return new C203399nx(this.A00, this.A01, (AnonymousClass1AL[]) objArr);
    }

    public final void A04(AnonymousClass1AL r2) {
        this.A02.add(r2);
    }

    public final void A05(C203399nx r2) {
        if (r2 != null) {
            this.A03.add(r2);
        }
    }

    public final void A07(String str) {
        byte[] bArr;
        if (str != null) {
            bArr = C36351kA.A1b(str);
        } else {
            bArr = null;
        }
        this.A01 = bArr;
    }

    public AnonymousClass6QB(String str) {
        this.A00 = str;
    }

    public static void A00(C19970wo r3, AnonymousClass6QB r4) {
        r4.A07(String.valueOf(C19970wo.A00(r3) / ((long) 1000)));
    }

    public static final void A02(String str, List list) {
        if (!list.contains(str)) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("String was expected to be one of '");
            A0u.append(C36381kD.A0x(",", list));
            C18740tg.A0D(false, AnonymousClass000.A0q("'.", A0u));
        }
    }
}
