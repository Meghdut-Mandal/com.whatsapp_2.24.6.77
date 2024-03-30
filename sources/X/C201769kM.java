package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.9kM  reason: invalid class name and case insensitive filesystem */
public abstract class C201769kM {
    public static final Map A01(String str, Map map, Map map2) {
        AnonymousClass00C.A0D(map, 0);
        if (str == null) {
            return map;
        }
        if (str.equals("$")) {
            return map2;
        }
        if (str.equals("#")) {
            if (map2 == null) {
                map2 = C000400e.A0D();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.putAll(map2);
            return linkedHashMap;
        } else if (!AnonymousClass098.A07(str, "$.", false)) {
            throw C90524aI.A0Y("FcsStateIoUtils/createPath/path should start with '$.'");
        } else if (!AnonymousClass099.A0O(str, "[", false)) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(map);
            Map map3 = linkedHashMap2;
            for (Object next : C90494aF.A0i(AnonymousClass099.A0E("$.", str), ".")) {
                if (!map3.containsKey(next) || !(map3.get(next) instanceof Map)) {
                    map3.put(next, C36431kI.A1G());
                }
                Object obj = map3.get(next);
                AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
                map3 = C07710Yz.A02(obj);
            }
            C21076A7n A00 = C200759iB.A00(linkedHashMap2);
            C200759iB A002 = C21076A7n.A00(str, new C22902AyE[0]);
            Object obj2 = A00.A01;
            C194879Rp r7 = A00.A00;
            C188068yz r8 = C188068yz.AS_PATH_LIST;
            EnumSet<E> noneOf = EnumSet.noneOf(C188068yz.class);
            noneOf.addAll(r7.A03);
            noneOf.addAll(Arrays.asList(new C188068yz[]{r8}));
            C194869Ro r1 = new C194869Ro();
            r1.A00 = r7.A00;
            r1.A01 = r7.A01;
            r1.A03.addAll(noneOf);
            Collection collection = r7.A02;
            if (collection == null) {
                collection = Collections.emptyList();
            }
            r1.A02 = collection;
            C194879Rp A003 = r1.A00();
            C201749kK.A03(obj2, "json can not be null");
            C201749kK.A03(A003, "configuration can not be null");
            C195299Tr r3 = A002.A00;
            C199959gK r72 = new C199959gK(A003, r3, obj2, true);
            try {
                r3.A00.A03(new C173758Sx(obj2), r72, obj2, "");
            } catch (C21828Ab5 unused) {
            }
            if (r72.A01().isEmpty()) {
                C188068yz r0 = C188068yz.SUPPRESS_EXCEPTIONS;
                Set set = A003.A03;
                if (set.contains(r0)) {
                    boolean contains = set.contains(r8);
                    boolean contains2 = set.contains(C188068yz.ALWAYS_RETURN_LIST);
                    if (contains || contains2 || !r3.A00.A07()) {
                        ((A8O) A003.A00).A00.A01();
                    }
                } else {
                    throw new C173698Sr();
                }
            } else {
                List list = r72.A06;
                Collections.sort(list);
                for (C21670AUn aUn : Collections.unmodifiableCollection(list)) {
                    if (aUn instanceof C173758Sx) {
                        throw new C173708Ss();
                    } else if (aUn instanceof C173778Sz) {
                        C173778Sz r10 = (C173778Sz) aUn;
                        A003.A00.Brr(r10.A00, r10.A00, map2);
                    } else if (aUn instanceof C173768Sy) {
                        C173768Sy r102 = (C173768Sy) aUn;
                        for (Object Brr : r102.A00) {
                            A003.A00.Brr(r102.A00, Brr, map2);
                        }
                    } else if (aUn instanceof AnonymousClass8T0) {
                        AnonymousClass8T0 r103 = (AnonymousClass8T0) aUn;
                        A003.A00.BqC(r103.A00, r103.A00, map2);
                    }
                }
                if (A003.A03.contains(r8)) {
                    r72.A01();
                }
            }
            return (Map) A00.Bmq("$", new C22902AyE[0]);
        } else {
            throw C90524aI.A0Y("FcsStateIoUtils/createPath/currently lacking support for arrays, filters, or multiple targets");
        }
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [java.util.LinkedHashMap, java.util.AbstractMap] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.AnonymousClass9I7 r10, java.lang.Object r11) {
        /*
            boolean r0 = r11 instanceof java.util.Map
            if (r0 == 0) goto L_0x00da
            java.util.LinkedHashMap r3 = X.C36431kI.A1G()
            java.util.Map r11 = (java.util.Map) r11
            java.util.Iterator r9 = X.AnonymousClass000.A0y(r11)
        L_0x000e:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00f4
            java.util.Map$Entry r8 = X.AnonymousClass000.A11(r9)
            java.lang.Object r0 = r8.getKey()
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L_0x00d3
            java.lang.Object r0 = r8.getKey()
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.String"
            X.AnonymousClass00C.A0E(r0, r5)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r6 = ".$"
            r7 = 0
            X.AnonymousClass00C.A0D(r0, r7)
            boolean r0 = r0.endsWith(r6)
            if (r0 == 0) goto L_0x0078
            java.lang.Object r2 = r8.getValue()
            X.AnonymousClass00C.A0E(r2, r5)
            java.lang.String r2 = (java.lang.String) r2
            X.AnonymousClass00C.A0D(r2, r7)
            X.0rt r1 = r10.A00
            if (r1 != 0) goto L_0x004f
            java.util.Map r0 = r10.A01
            X.A7n r1 = X.C200759iB.A00(r0)
            r10.A00 = r1
        L_0x004f:
            r4 = 0
            X.AyE[] r0 = new X.C22902AyE[r7]     // Catch:{ 8Sr -> 0x0056 }
            java.lang.Object r4 = r1.Bmq(r2, r0)     // Catch:{ 8Sr -> 0x0056 }
        L_0x0056:
            if (r4 != 0) goto L_0x00ad
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FcsStateIoUtils/evaluate/required path failed to evaluate. Found a null value for '"
            r1.append(r0)
            java.lang.Object r0 = r8.getKey()
            X.AnonymousClass00C.A0E(r0, r5)
            java.lang.String r0 = (java.lang.String) r0
            r1.append(r0)
            java.lang.String r0 = "'."
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            java.lang.AssertionError r0 = X.C90524aI.A0Y(r0)
            throw r0
        L_0x0078:
            java.lang.Object r0 = r8.getKey()
            X.AnonymousClass00C.A0E(r0, r5)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r6 = ".$?"
            X.AnonymousClass00C.A0D(r0, r7)
            boolean r0 = r0.endsWith(r6)
            if (r0 == 0) goto L_0x00bf
            java.lang.Object r2 = r8.getValue()
            X.AnonymousClass00C.A0E(r2, r5)
            java.lang.String r2 = (java.lang.String) r2
            X.AnonymousClass00C.A0D(r2, r7)
            X.0rt r1 = r10.A00
            if (r1 != 0) goto L_0x00a4
            java.util.Map r0 = r10.A01
            X.A7n r1 = X.C200759iB.A00(r0)
            r10.A00 = r1
        L_0x00a4:
            r4 = 0
            X.AyE[] r0 = new X.C22902AyE[r7]     // Catch:{ 8Sr -> 0x00ab }
            java.lang.Object r4 = r1.Bmq(r2, r0)     // Catch:{ 8Sr -> 0x00ab }
        L_0x00ab:
            if (r4 == 0) goto L_0x000e
        L_0x00ad:
            java.lang.Object r0 = r8.getKey()
            X.AnonymousClass00C.A0E(r0, r5)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = X.AnonymousClass099.A0F(r6, r0)
            r3.put(r0, r4)
            goto L_0x000e
        L_0x00bf:
            java.lang.Object r1 = r8.getKey()
            X.AnonymousClass00C.A0E(r1, r5)
            java.lang.Object r0 = r8.getValue()
            java.lang.Object r0 = A00(r10, r0)
            r3.put(r1, r0)
            goto L_0x000e
        L_0x00d3:
            java.lang.String r0 = "FcsStateIoUtils/evaluate/key in map is not string"
            java.lang.AssertionError r0 = X.C90524aI.A0Y(r0)
            throw r0
        L_0x00da:
            boolean r0 = r11 instanceof java.lang.Object[]
            if (r0 == 0) goto L_0x00f5
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            java.lang.Object[] r11 = (java.lang.Object[]) r11
            r2 = 0
            int r1 = r11.length
        L_0x00e6:
            if (r2 >= r1) goto L_0x00f4
            r0 = r11[r2]
            java.lang.Object r0 = A00(r10, r0)
            r3.add(r0)
            int r2 = r2 + 1
            goto L_0x00e6
        L_0x00f4:
            return r3
        L_0x00f5:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201769kM.A00(X.9I7, java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r1 == null) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.Map A02(java.util.Map r3, java.util.Map r4) {
        /*
            X.9I7 r2 = new X.9I7
            r2.<init>(r3)
            if (r4 == 0) goto L_0x0012
            java.lang.Object r1 = A00(r2, r4)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Any"
            X.AnonymousClass00C.A0E(r1, r0)
            if (r1 != 0) goto L_0x0014
        L_0x0012:
            java.util.Map r1 = r2.A01
        L_0x0014:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>"
            X.AnonymousClass00C.A0E(r1, r0)
            java.util.Map r1 = (java.util.Map) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201769kM.A02(java.util.Map, java.util.Map):java.util.Map");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r1 == null) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.Map A03(java.util.Map r3, java.util.Map r4) {
        /*
            X.9I7 r2 = new X.9I7
            r2.<init>(r3)
            if (r4 == 0) goto L_0x0012
            java.lang.Object r1 = A00(r2, r4)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Any"
            X.AnonymousClass00C.A0E(r1, r0)
            if (r1 != 0) goto L_0x0014
        L_0x0012:
            java.util.Map r1 = r2.A01
        L_0x0014:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>"
            X.AnonymousClass00C.A0E(r1, r0)
            java.util.Map r1 = (java.util.Map) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201769kM.A03(java.util.Map, java.util.Map):java.util.Map");
    }
}
