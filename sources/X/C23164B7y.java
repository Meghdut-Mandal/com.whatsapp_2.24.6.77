package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.B7y  reason: case insensitive filesystem */
public class C23164B7y implements C159197iy {
    public Object A00;
    public Object A01;
    public final int A02;

    public C23164B7y(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public /* bridge */ /* synthetic */ void BXP(Object obj, int i) {
        ((C1270966y) this.A00).A00();
    }

    public /* bridge */ /* synthetic */ void BiC(Object obj, Object obj2) {
        C1270966y r2;
        AnonymousClass011 r0;
        HashMap hashMap;
        String str;
        switch (this.A02) {
            case 0:
                A90 a90 = (A90) obj2;
                AnonymousClass00C.A0D(a90, 1);
                r2 = (C1270966y) this.A00;
                C183838rT r8 = (C183838rT) this.A01;
                boolean isEmpty = r8.A00().isEmpty();
                hashMap = AnonymousClass001.A0J();
                HashMap A0J = AnonymousClass001.A0J();
                HashMap A0J2 = AnonymousClass001.A0J();
                for (C1276969h r4 : a90.A01) {
                    C128506Cn r1 = r4.A00;
                    String str2 = r1.A01;
                    if (A0J.get(str2) == null) {
                        A0J.put(str2, r8.A00.A01(r1));
                    }
                    if (A0J2.get(str2) == null) {
                        A0J2.put(str2, AnonymousClass001.A0I());
                    }
                    HashSet A16 = C36441kJ.A16();
                    for (C128506Cn r42 : r4.A01) {
                        String str3 = r42.A01;
                        if (A0J.get(str3) == null) {
                            A0J.put(str3, r8.A00.A01(r42));
                        }
                        A16.add(str3);
                    }
                    AbstractCollection abstractCollection = (AbstractCollection) A0J2.get(str2);
                    if (abstractCollection != null) {
                        abstractCollection.addAll(A16);
                    }
                }
                hashMap.put("categories_map", A0J);
                hashMap.put("sub_categories", A0J2);
                if (isEmpty) {
                    HashSet A0k = C90524aI.A0k(A0J2.keySet());
                    Iterator A10 = C36391kE.A10(A0J2);
                    while (A10.hasNext()) {
                        ArrayList arrayList = (ArrayList) A10.next();
                        AnonymousClass00C.A0B(arrayList);
                        A0k.removeAll(C007103b.A0f(arrayList));
                    }
                    hashMap.put("top_categories", C007103b.A0Y(A0k));
                }
                str = "categories";
                break;
            case 1:
            case 2:
                C21112A8x a8x = (C21112A8x) obj2;
                AnonymousClass00C.A0D(a8x, 1);
                r2 = (C1270966y) this.A00;
                C200019gR r5 = ((C183848rU) this.A01).A00;
                hashMap = AnonymousClass001.A0J();
                ArrayList A0I = AnonymousClass001.A0I();
                for (C207269up A022 : a8x.A02) {
                    A0I.add(r5.A02(A022));
                }
                hashMap.put("products", A0I);
                String str4 = a8x.A01.A00;
                if (str4 == null) {
                    str4 = "-1";
                }
                hashMap.put("paging", C36391kE.A11("after", str4));
                str = "product_catalog";
                break;
            case 3:
                C207269up r15 = (C207269up) obj2;
                AnonymousClass00C.A0D(r15, 1);
                r2 = (C1270966y) this.A00;
                r0 = C36441kJ.A19("product_detail", ((C183858rV) this.A01).A00.A02(r15));
                break;
            case 6:
                C21114A8z a8z = (C21114A8z) obj2;
                AnonymousClass00C.A0D(a8z, 1);
                ArrayList A0I2 = AnonymousClass001.A0I();
                List<C207269up> list = a8z.A01;
                if (list != null) {
                    C183878rX r3 = (C183878rX) this.A01;
                    for (C207269up A023 : list) {
                        A0I2.add(r3.A00.A02(A023));
                    }
                }
                ((C1270966y) this.A00).A01(C36391kE.A11("products", A0I2));
                return;
            default:
                C21113A8y a8y = (C21113A8y) obj2;
                AnonymousClass00C.A0D(a8y, 1);
                r2 = (C1270966y) this.A00;
                C200019gR r52 = ((C183868rW) this.A01).A00;
                hashMap = AnonymousClass001.A0J();
                ArrayList A0I3 = AnonymousClass001.A0I();
                for (C207269up A024 : a8y.A02.A04) {
                    A0I3.add(r52.A02(A024));
                }
                hashMap.put("products", A0I3);
                String str5 = a8y.A01.A00;
                if (str5 == null) {
                    str5 = "-1";
                }
                hashMap.put("paging", C36391kE.A11("after", str5));
                str = "product_list";
                break;
        }
        r0 = C36441kJ.A19(str, hashMap);
        r2.A01(C000300d.A03(r0));
    }
}
