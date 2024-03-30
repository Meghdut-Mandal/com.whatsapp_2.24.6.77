package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.6XK  reason: invalid class name */
public class AnonymousClass6XK {
    public final C130486Lg A00;
    public final C140456lc A01;
    public final String A02;

    public static AnonymousClass6XK A00(C100674vP r10, C140456lc r11) {
        Object obj;
        C140456lc r2 = r11;
        if (r10 == null || r11.A04 != 13901) {
            List list = Collections.EMPTY_LIST;
            Map map = Collections.EMPTY_MAP;
            return new AnonymousClass6XK(r2, AnonymousClass5ZH.A00(map), (String) null, list, list, list, list, (List) null, map, (Map) null);
        }
        C160377ku A0E = C140456lc.A0E(r11);
        if (A0E != null) {
            try {
                obj = AnonymousClass5ZN.A00(AnonymousClass6MO.A01, A0E, r10);
            } catch (AnonymousClass5VI e) {
                AnonymousClass6RS.A00(r10.A00, "BloksParseResult", "Exception executing Parse Embedded expression", e);
                obj = A01(new C140456lc(13320));
            }
            return (AnonymousClass6XK) obj;
        }
        throw AnonymousClass001.A08("ParseResultWrapper doesn't have a parse result!");
    }

    public static AnonymousClass6XK A01(C140456lc r10) {
        List list = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        return new AnonymousClass6XK(r10, AnonymousClass5ZH.A00(map), (String) null, list, list, list, list, (List) null, map, (Map) null);
    }

    public static AnonymousClass6XK A02(C124915z0 r11, List list) {
        String str = null;
        Map A04 = A04(r11.A06);
        C140456lc r1 = r11.A00;
        Objects.requireNonNull(r1);
        List list2 = r11.A05;
        ArrayList A0I = AnonymousClass001.A0I();
        if (list2 != null) {
            A0I.addAll(list2);
        }
        if (list != null) {
            A0I.addAll(list);
        }
        List list3 = r11.A04;
        List list4 = r11.A07;
        if (list4 == null) {
            list4 = Collections.EMPTY_LIST;
        }
        C1273768a r2 = r11.A02;
        if (r2 == null) {
            r2 = AnonymousClass5ZH.A00(Collections.EMPTY_MAP);
        }
        List list5 = r11.A08;
        if (list5 == null) {
            list5 = Collections.emptyList();
        }
        Map map = r11.A0D;
        List list6 = r11.A0C;
        C115175iS r0 = r11.A01;
        if (r0 != null) {
            str = r0.A00;
        }
        return new AnonymousClass6XK(r1, r2, str, A0I, list3, list4, list5, list6, A04, map);
    }

    public static Map A04(List list) {
        if (list == null) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = new HashMap(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C118855oq r1 = (C118855oq) it.next();
            hashMap.put(r1.A01, r1);
        }
        return hashMap;
    }

    public AnonymousClass6XK(C130486Lg r1, C140456lc r2, String str) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = str;
    }

    public static HashMap A03(List list, Map map) {
        HashMap A0J = AnonymousClass001.A0J();
        HashMap hashMap = new HashMap(map);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C130006Ji r2 = (C130006Ji) it.next();
            if (map.containsKey(r2.A01)) {
                A0J.put(r2.A00, hashMap.remove(r2.A01));
            }
        }
        A0J.putAll(hashMap);
        return A0J;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass6XK(X.C140456lc r22, X.C1273768a r23, java.lang.String r24, java.util.List r25, java.util.List r26, java.util.List r27, java.util.List r28, java.util.List r29, java.util.Map r30, java.util.Map r31) {
        /*
            r21 = this;
            r0 = 0
            r3 = r22
            X.AnonymousClass00C.A0D(r3, r0)
            if (r26 == 0) goto L_0x00a6
            java.util.ArrayList r4 = X.C36321k7.A0J(r26)
            java.util.Iterator r10 = r26.iterator()
        L_0x0010:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00a7
            java.lang.Object r6 = r10.next()
            X.5yK r6 = (X.C124525yK) r6
            java.util.HashMap r0 = r6.A07
            if (r0 == 0) goto L_0x005d
            java.util.LinkedHashMap r5 = X.C90474aD.A0s(r0)
            java.util.Iterator r9 = X.C36371kC.A10(r0)
        L_0x0028:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x005e
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r9)
            java.lang.Object r8 = r0.getKey()
            java.lang.String r0 = X.C90514aH.A10(r0)
            X.6lc r0 = X.C140456lc.A0C(r3, r0)
            if (r0 == 0) goto L_0x0091
            java.lang.String r7 = r0.A0Y()
            X.AnonymousClass00C.A0B(r7)
            int r2 = r0.A03
            java.util.List r0 = r0.A08
            if (r0 == 0) goto L_0x005a
            java.util.List r1 = X.C007103b.A0Y(r0)
        L_0x0051:
            X.6B0 r0 = new X.6B0
            r0.<init>(r1, r2, r7)
            r5.put(r8, r0)
            goto L_0x0028
        L_0x005a:
            X.09w r1 = X.C023409w.A00
            goto L_0x0051
        L_0x005d:
            r5 = 0
        L_0x005e:
            java.lang.String r2 = r6.A06
            X.AnonymousClass00C.A08(r2)
            X.7ku r12 = r6.A00
            X.AnonymousClass00C.A08(r12)
            X.7ku r13 = r6.A03
            X.7ku r14 = r6.A02
            java.util.Set r1 = r6.A08
            X.7ku r15 = r6.A01
            java.lang.Boolean r0 = r6.A04
            X.AnonymousClass00C.A08(r0)
            boolean r19 = r0.booleanValue()
            java.lang.Boolean r0 = r6.A05
            X.AnonymousClass00C.A08(r0)
            boolean r20 = r0.booleanValue()
            X.6Dm r11 = new X.6Dm
            r17 = r5
            r18 = r1
            r16 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r4.add(r11)
            goto L_0x0010
        L_0x0091:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Failed to find async component container for "
            r1.append(r0)
            java.lang.String r0 = r6.A06
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            throw r0
        L_0x00a6:
            r4 = 0
        L_0x00a7:
            X.6Lg r1 = new X.6Lg
            r6 = r23
            r7 = r25
            r10 = r27
            r8 = r28
            r11 = r29
            r12 = r30
            r13 = r31
            r5 = r1
            r9 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r0 = r21
            r2 = r24
            r0.<init>(r1, r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6XK.<init>(X.6lc, X.68a, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.Map, java.util.Map):void");
    }
}
