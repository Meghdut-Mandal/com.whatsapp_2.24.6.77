package X;

import android.util.SparseArray;
import com.whatsapp.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6Vr  reason: invalid class name and case insensitive filesystem */
public final class C132896Vr {
    public static final C132896Vr A00 = new C132896Vr();

    public static final C124105xb A00(AnonymousClass6IB r14, C1271967i r15, C131536Pl r16, C124105xb r17, C140456lc r18, AnonymousClass6IK r19, C131196Oc r20) {
        C140456lc r0;
        C140456lc r13 = r18;
        AnonymousClass6IK r9 = r19;
        C131196Oc r10 = r20;
        C36321k7.A17(r13, r9, r10, 1);
        AnonymousClass6IB r5 = r14;
        C131536Pl r6 = r16;
        C124105xb r8 = r17;
        AnonymousClass65E r4 = new AnonymousClass65E(r5, r6, (C1257561d) r15.A01(R.id.bk_context_key_scoped_client_id_mapper), r8, r9, r10, C133266Xn.A03(r15), C1271967i.A00(r15));
        HashSet A16 = C36441kJ.A16();
        HashMap A0J = AnonymousClass001.A0J();
        C132896Vr r52 = A00;
        if (r17 != null) {
            r0 = r8.A02;
        } else {
            r0 = null;
        }
        C140456lc A02 = r52.A02(r4, r13, r0, A0J, A16);
        HashMap hashMap = new HashMap(A16.size());
        Iterator it = A16.iterator();
        while (it.hasNext()) {
            C90484aE.A1I(it.next(), hashMap, r4.A02.A07);
        }
        Map map = r4.A02.A07;
        Map map2 = r4.A0A;
        return new C124105xb(r4.A05, r13, A02, r4.A09, map, map2, hashMap);
    }

    public static C140456lc A01(AnonymousClass65E r10, C140456lc r11, C140456lc r12, Object obj, List list, Map map) {
        C128366Bz r13;
        C140456lc r2;
        SparseArray sparseArray;
        C140456lc r1;
        if (obj != null) {
            if (obj instanceof List) {
                List list2 = (List) obj;
                r13 = new C128366Bz(C36391kE.A0t(list2), C90474aD.A0j(list2), list, C90494aF.A0k(list2, 1));
            } else if (obj instanceof C128366Bz) {
                r13 = (C128366Bz) obj;
            }
            Object obj2 = r13.A00;
            if (obj2 instanceof Number) {
                int A0I = AnonymousClass000.A0I(obj2);
                List A0c = r11.A0c(143);
                if (A0I < 0 || A0I >= A0c.size()) {
                    String str = r13.A01;
                    StringBuilder A0i = C90524aI.A0i("[");
                    Iterator it = A0c.iterator();
                    while (it.hasNext()) {
                        A0i.append(C90514aH.A0Y(it).A04);
                        C90504aG.A1M(A0i);
                    }
                    StringBuilder A0q = C90484aE.A0q("]", A0i);
                    A0q.append("BloksCrash: children-binding index ");
                    A0q.append(A0I);
                    A0q.append(" scopeKey: ");
                    A0q.append(str);
                    C36371kC.A1R(" out of bounds for array of size ", A0q, A0c);
                    C36421kH.A1N(A0q);
                    C36351kA.A1K(A0i, A0q);
                    throw new IndexOutOfBoundsException(A0q.toString());
                }
                r2 = C90504aG.A0K(A0c, A0I);
            } else if (obj2 instanceof String) {
                r2 = (C140456lc) r10.A02.A04.get(obj2);
                if (r2 == null) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("Unable to find template ID ");
                    A0u.append((String) obj2);
                    throw AnonymousClass001.A0A(AnonymousClass000.A0q(" in tree resources.", A0u));
                }
            }
            int A002 = r10.A03.A00(r11, r2, r13.A01);
            LinkedList linkedList = new LinkedList(r13.A02);
            AnonymousClass000.A1F(linkedList, A002);
            String A003 = C129286Gh.A00(C023109s.A01, linkedList);
            Iterator A0y = AnonymousClass000.A0y(r13.A03);
            while (A0y.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A0y);
                String A01 = C129286Gh.A01(C90494aF.A0f(A11), A003);
                Object value = A11.getValue();
                r10.A0A.put(A01, value);
                Set set = r10.A0C;
                if (set != null && !AnonymousClass5Z0.A00(r10.A0B.get(A01), value)) {
                    set.add(A01);
                }
                map.put(A01, A11.getValue());
            }
            C121085sZ r0 = r10.A04;
            if (r12 == null || (sparseArray = (SparseArray) r0.A01.get(r12.A03)) == null || (r1 = (C140456lc) sparseArray.get(A002)) == null || r1.A06 != r2) {
                return AnonymousClass5Z9.A00((C157187by) null, new C142066oH(r10, r13, r11, linkedList), r2);
            }
            return r1;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: X.6lc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: X.6lc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: X.6lc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v17, resolved type: X.6lc} */
    /* JADX WARNING: type inference failed for: r0v65, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.C140456lc A02(X.AnonymousClass65E r44, X.C140456lc r45, X.C140456lc r46, java.util.Map r47, java.util.Set r48) {
        /*
            r43 = this;
            r7 = r45
            r6 = r46
            int r0 = r7.A00
            r0 = r0 & 1
            if (r0 == 0) goto L_0x03ef
            r8 = r44
            r42 = r47
            r41 = r48
            if (r46 == 0) goto L_0x002f
            X.6lc r0 = r6.A06
            if (r0 != r7) goto L_0x002f
            java.util.Set r4 = r8.A0C
            if (r4 == 0) goto L_0x002f
            X.5sZ r5 = r8.A04
            android.util.SparseArray r0 = r5.A02
            int r3 = r6.A03
            java.lang.Object r2 = r0.get(r3)
            java.util.Set r2 = (java.util.Set) r2
            if (r2 != 0) goto L_0x0038
            java.lang.String r1 = "BindEvaluator"
            java.lang.String r0 = "A previously bound node has a null variable dependency map"
            X.AnonymousClass6RS.A01(r1, r0)
        L_0x002f:
            X.68E r0 = X.AnonymousClass6RN.A00
            boolean r23 = r0.A03()
            if (r23 == 0) goto L_0x0067
            goto L_0x004d
        L_0x0038:
            java.util.Iterator r1 = r2.iterator()
        L_0x003c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x039b
            java.lang.Object r0 = r1.next()
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L_0x003c
            goto L_0x002f
        L_0x004d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0394 }
            java.lang.String r0 = "Bloks Bind Subtree"
            r1.append(r0)     // Catch:{ all -> 0x0394 }
            java.lang.String r0 = X.AnonymousClass6Qm.A02(r7)     // Catch:{ all -> 0x0394 }
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x0394 }
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)     // Catch:{ all -> 0x0394 }
            X.68E r0 = X.AnonymousClass6RN.A00     // Catch:{ all -> 0x0394 }
            r0.A02(r1)     // Catch:{ all -> 0x0394 }
        L_0x0067:
            java.util.HashSet r22 = X.C36441kJ.A16()     // Catch:{ all -> 0x0394 }
            java.util.HashMap r21 = X.AnonymousClass001.A0J()     // Catch:{ all -> 0x0394 }
            r5 = r7
            r0 = 135(0x87, float:1.89E-43)
            X.7ku r12 = r7.A0X(r0)     // Catch:{ all -> 0x0394 }
            if (r12 == 0) goto L_0x00f6
            java.util.List r13 = r7.A08     // Catch:{ all -> 0x0394 }
            r39 = r13
            if (r13 != 0) goto L_0x0082
            java.util.List r39 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0394 }
        L_0x0082:
            java.util.Map r10 = r8.A0A     // Catch:{ all -> 0x0394 }
            X.6Pl r9 = r8.A02     // Catch:{ all -> 0x0394 }
            X.7fJ r3 = r8.A07     // Catch:{ all -> 0x0394 }
            X.6IK r2 = r8.A00     // Catch:{ all -> 0x0394 }
            java.lang.String r1 = r8.A08     // Catch:{ all -> 0x0394 }
            X.6IB r0 = r8.A01     // Catch:{ all -> 0x0394 }
            java.lang.Integer r33 = X.C023109s.A00     // Catch:{ all -> 0x0394 }
            r11 = 0
            X.4vP r4 = new X.4vP     // Catch:{ all -> 0x0394 }
            r27 = r11
            r28 = r11
            r35 = r11
            r24 = r4
            r25 = r11
            r26 = r0
            r29 = r9
            r30 = r2
            r31 = r12
            r32 = r3
            r34 = r1
            r36 = r13
            r37 = r10
            r38 = r22
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)     // Catch:{ all -> 0x0394 }
            X.6MO r0 = X.AnonymousClass6MO.A01     // Catch:{ 5VI -> 0x00c0 }
            java.lang.Object r12 = X.AnonymousClass5ZN.A00(r0, r12, r4)     // Catch:{ 5VI -> 0x00c0 }
            if (r12 == 0) goto L_0x00bd
            java.util.List r12 = (java.util.List) r12     // Catch:{ 5VI -> 0x00c0 }
            goto L_0x00cc
        L_0x00bd:
            java.util.List r12 = java.util.Collections.EMPTY_LIST     // Catch:{ 5VI -> 0x00c0 }
            goto L_0x00cc
        L_0x00c0:
            r3 = move-exception
            X.67i r2 = r4.A00     // Catch:{ all -> 0x0394 }
            java.lang.String r1 = "BindEvaluator"
            java.lang.String r0 = "Exception evaluating onBind"
            X.AnonymousClass6RS.A00(r2, r1, r0, r3)     // Catch:{ all -> 0x0394 }
            java.util.List r12 = java.util.Collections.EMPTY_LIST     // Catch:{ all -> 0x0394 }
        L_0x00cc:
            r4.A02 = r11     // Catch:{ all -> 0x0394 }
            X.6oY r0 = r4.A05     // Catch:{ all -> 0x0394 }
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A00     // Catch:{ all -> 0x0394 }
            r0.clear()     // Catch:{ all -> 0x0394 }
            boolean r0 = r12.isEmpty()     // Catch:{ all -> 0x0394 }
            if (r0 != 0) goto L_0x00f6
            r10 = 0
            java.lang.Object r0 = r12.get(r10)     // Catch:{ all -> 0x0394 }
            boolean r0 = r0 instanceof java.lang.String     // Catch:{ all -> 0x0394 }
            r16 = r0
            java.lang.String r9 = "BindEvaluator"
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x00fe
            int r0 = r12.size()     // Catch:{ all -> 0x0394 }
            int r0 = r0 % r4
            if (r0 != r3) goto L_0x00fe
            java.lang.String r0 = "Encountered odd number of elements in interleaved binding array"
            X.AnonymousClass6RS.A01(r9, r0)     // Catch:{ all -> 0x0394 }
        L_0x00f6:
            boolean r20 = X.AnonymousClass6Qn.A01(r5)     // Catch:{ all -> 0x0394 }
            int r0 = r5.A00     // Catch:{ all -> 0x0394 }
            goto L_0x021f
        L_0x00fe:
            r1 = 0
        L_0x00ff:
            int r0 = r12.size()     // Catch:{ all -> 0x0394 }
            if (r1 >= r0) goto L_0x0212
            if (r16 == 0) goto L_0x0108
            goto L_0x013a
        L_0x0108:
            java.lang.Object r2 = r12.get(r1)     // Catch:{ all -> 0x0394 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x0394 }
            java.lang.Object r13 = r2.get(r10)     // Catch:{ all -> 0x0394 }
            boolean r0 = r13 instanceof java.lang.Number     // Catch:{ all -> 0x0394 }
            if (r0 == 0) goto L_0x012d
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x0394 }
        L_0x011a:
            java.lang.String r0 = r5.A0Y()     // Catch:{ all -> 0x0394 }
            if (r0 == 0) goto L_0x0130
            boolean r0 = r13.equals(r0)     // Catch:{ all -> 0x0394 }
            if (r0 != 0) goto L_0x0130
            java.lang.String r0 = "Encountered binding targeted for a descendant "
            X.AnonymousClass6RS.A01(r9, r0)     // Catch:{ all -> 0x0394 }
            goto L_0x020d
        L_0x012d:
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0394 }
            goto L_0x011a
        L_0x0130:
            java.lang.String r14 = X.C36401kF.A0s(r2, r3)     // Catch:{ all -> 0x0394 }
            java.lang.Object r13 = r2.get(r4)     // Catch:{ all -> 0x0394 }
            r15 = r1
            goto L_0x0144
        L_0x013a:
            int r15 = r1 + 1
            java.lang.String r14 = X.C36401kF.A0s(r12, r1)     // Catch:{ all -> 0x0394 }
            java.lang.Object r13 = r12.get(r15)     // Catch:{ all -> 0x0394 }
        L_0x0144:
            int r2 = X.AnonymousClass5ZE.A00(r14)     // Catch:{ all -> 0x0394 }
            r0 = 32
            if (r2 >= r0) goto L_0x0163
            java.lang.Object[] r1 = X.C36441kJ.A1Q()     // Catch:{ all -> 0x0394 }
            X.AnonymousClass000.A1L(r1, r2, r10)     // Catch:{ all -> 0x0394 }
            r1[r3] = r14     // Catch:{ all -> 0x0394 }
            int r0 = r5.A04     // Catch:{ all -> 0x0394 }
            X.AnonymousClass000.A1L(r1, r0, r4)     // Catch:{ all -> 0x0394 }
            java.lang.String r0 = "Encountered invalid minified key: %s, raw: %s for styleId: %s while unwrapping binding expression"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ all -> 0x0394 }
            X.AnonymousClass6RS.A01(r9, r0)     // Catch:{ all -> 0x0394 }
        L_0x0163:
            X.6T8 r1 = X.AnonymousClass6NR.A01()     // Catch:{ all -> 0x0394 }
            int r0 = r5.A04     // Catch:{ all -> 0x0394 }
            int[] r14 = r1.A00(r0)     // Catch:{ all -> 0x0394 }
            int r0 = r14.length     // Catch:{ all -> 0x0394 }
            r17 = r0
            r1 = 0
        L_0x0171:
            r0 = r17
            if (r1 >= r0) goto L_0x01c1
            r0 = r14[r1]     // Catch:{ all -> 0x0394 }
            if (r0 != r2) goto L_0x0180
            java.util.List r13 = (java.util.List) r13     // Catch:{ all -> 0x0394 }
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x0394 }
            goto L_0x0183
        L_0x0180:
            int r1 = r1 + 1
            goto L_0x0171
        L_0x0183:
            if (r13 == 0) goto L_0x01a5
            java.util.Iterator r13 = r13.iterator()     // Catch:{ all -> 0x0394 }
        L_0x0189:
            boolean r1 = r13.hasNext()     // Catch:{ all -> 0x0394 }
            if (r1 == 0) goto L_0x01a5
            java.lang.Object r38 = r13.next()     // Catch:{ all -> 0x0394 }
            r35 = r8
            r36 = r5
            r37 = r6
            r40 = r21
            X.6lc r1 = A01(r35, r36, r37, r38, r39, r40)     // Catch:{ all -> 0x0394 }
            if (r1 == 0) goto L_0x0189
            r0.add(r1)     // Catch:{ all -> 0x0394 }
            goto L_0x0189
        L_0x01a5:
            r13 = r0
            java.util.Iterator r14 = r0.iterator()     // Catch:{ all -> 0x0394 }
        L_0x01aa:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x0394 }
            if (r0 == 0) goto L_0x01f7
            X.6lc r1 = X.C90514aH.A0Y(r14)     // Catch:{ all -> 0x0394 }
            if (r11 != 0) goto L_0x01bb
            android.util.SparseArray r11 = new android.util.SparseArray     // Catch:{ all -> 0x0394 }
            r11.<init>()     // Catch:{ all -> 0x0394 }
        L_0x01bb:
            int r0 = r1.A03     // Catch:{ all -> 0x0394 }
            r11.put(r0, r1)     // Catch:{ all -> 0x0394 }
            goto L_0x01aa
        L_0x01c1:
            X.6T8 r1 = X.AnonymousClass6NR.A01()     // Catch:{ all -> 0x0394 }
            int r0 = r5.A04     // Catch:{ all -> 0x0394 }
            int[] r14 = r1.A01(r0)     // Catch:{ all -> 0x0394 }
            int r0 = r14.length     // Catch:{ all -> 0x0394 }
            r17 = r0
            r1 = 0
        L_0x01cf:
            r0 = r17
            if (r1 >= r0) goto L_0x01f7
            r0 = r14[r1]     // Catch:{ all -> 0x0394 }
            if (r0 != r2) goto L_0x01e8
            r35 = r8
            r36 = r5
            r37 = r6
            r38 = r13
            r40 = r21
            X.6lc r13 = A01(r35, r36, r37, r38, r39, r40)     // Catch:{ all -> 0x0394 }
            if (r13 == 0) goto L_0x01f7
            goto L_0x01eb
        L_0x01e8:
            int r1 = r1 + 1
            goto L_0x01cf
        L_0x01eb:
            if (r11 != 0) goto L_0x01f2
            android.util.SparseArray r11 = new android.util.SparseArray     // Catch:{ all -> 0x0394 }
            r11.<init>()     // Catch:{ all -> 0x0394 }
        L_0x01f2:
            int r0 = r13.A03     // Catch:{ all -> 0x0394 }
            r11.put(r0, r13)     // Catch:{ all -> 0x0394 }
        L_0x01f7:
            int r1 = r5.A04     // Catch:{ all -> 0x0394 }
            r0 = 13688(0x3578, float:1.9181E-41)
            if (r1 == r0) goto L_0x0202
            X.6lc r5 = X.AnonymousClass6Qm.A00(r5, r7, r13, r2)     // Catch:{ all -> 0x0394 }
            goto L_0x020e
        L_0x0202:
            java.util.List r1 = r8.A09     // Catch:{ all -> 0x0394 }
            X.5sa r0 = new X.5sa     // Catch:{ all -> 0x0394 }
            r0.<init>(r5, r13, r2)     // Catch:{ all -> 0x0394 }
            r1.add(r0)     // Catch:{ all -> 0x0394 }
            goto L_0x020e
        L_0x020d:
            r15 = r1
        L_0x020e:
            int r1 = r15 + 1
            goto L_0x00ff
        L_0x0212:
            X.5sZ r0 = r8.A05     // Catch:{ all -> 0x0394 }
            if (r11 == 0) goto L_0x00f6
            android.util.SparseArray r1 = r0.A01     // Catch:{ all -> 0x0394 }
            int r0 = r5.A03     // Catch:{ all -> 0x0394 }
            r1.put(r0, r11)     // Catch:{ all -> 0x0394 }
            goto L_0x00f6
        L_0x021f:
            r0 = r0 & 2
            boolean r19 = X.AnonymousClass000.A1P(r0)
            java.util.HashSet r2 = X.C36441kJ.A16()     // Catch:{ all -> 0x0394 }
            boolean r0 = X.AnonymousClass6Qn.A02(r5)     // Catch:{ all -> 0x0394 }
            if (r0 == 0) goto L_0x0234
            int r0 = r5.A03     // Catch:{ all -> 0x0394 }
            X.AnonymousClass000.A1F(r2, r0)     // Catch:{ all -> 0x0394 }
        L_0x0234:
            X.6T8 r1 = X.AnonymousClass6NR.A01()     // Catch:{ all -> 0x0394 }
            int r0 = r5.A04     // Catch:{ all -> 0x0394 }
            int[] r10 = r1.A01(r0)     // Catch:{ all -> 0x0394 }
            X.AnonymousClass00C.A0B(r10)     // Catch:{ all -> 0x0394 }
            int r9 = r10.length     // Catch:{ all -> 0x0394 }
            r4 = 0
        L_0x0243:
            r12 = 1
            if (r4 >= r9) goto L_0x0290
            r3 = r10[r4]     // Catch:{ all -> 0x0394 }
            X.6lc r15 = r5.A0W(r3)     // Catch:{ all -> 0x0394 }
            if (r15 == 0) goto L_0x028d
            if (r46 == 0) goto L_0x0251
            goto L_0x0253
        L_0x0251:
            r0 = 0
            goto L_0x0257
        L_0x0253:
            X.6lc r0 = r6.A0W(r3)     // Catch:{ all -> 0x0394 }
        L_0x0257:
            X.6Vr r13 = A00     // Catch:{ all -> 0x0394 }
            r14 = r8
            r16 = r0
            r17 = r21
            r18 = r22
            X.6lc r11 = r13.A02(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0394 }
            boolean r0 = X.C36371kC.A1W(r11, r0)
            r20 = r20 | r0
            int r0 = r11.A00     // Catch:{ all -> 0x0394 }
            r0 = r0 & 2
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r19 = r19 | r0
            java.util.Set r1 = r11.A02     // Catch:{ all -> 0x0394 }
            if (r1 != 0) goto L_0x027c
            java.util.Set r1 = java.util.Collections.emptySet()     // Catch:{ all -> 0x0394 }
        L_0x027c:
            X.AnonymousClass00C.A0B(r1)     // Catch:{ all -> 0x0394 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0394 }
            r12 = r12 ^ r0
            if (r12 == 0) goto L_0x0289
            r2.addAll(r1)     // Catch:{ all -> 0x0394 }
        L_0x0289:
            X.6lc r5 = X.AnonymousClass6Qm.A00(r5, r7, r11, r3)     // Catch:{ all -> 0x0394 }
        L_0x028d:
            int r4 = r4 + 1
            goto L_0x0243
        L_0x0290:
            X.6T8 r1 = X.AnonymousClass6NR.A01()     // Catch:{ all -> 0x0394 }
            int r0 = r5.A04     // Catch:{ all -> 0x0394 }
            int[] r3 = r1.A00(r0)     // Catch:{ all -> 0x0394 }
            X.AnonymousClass00C.A0B(r3)     // Catch:{ all -> 0x0394 }
            int r0 = r3.length     // Catch:{ all -> 0x0394 }
            r30 = r0
            r4 = 0
        L_0x02a1:
            r0 = r30
            if (r4 >= r0) goto L_0x0356
            r13 = r3[r4]     // Catch:{ all -> 0x0394 }
            java.util.List r12 = r5.A0c(r13)     // Catch:{ all -> 0x0394 }
            X.AnonymousClass00C.A08(r12)     // Catch:{ all -> 0x0394 }
            if (r46 == 0) goto L_0x02b1
            goto L_0x02b3
        L_0x02b1:
            r11 = 0
            goto L_0x02b7
        L_0x02b3:
            java.util.List r11 = r6.A0c(r13)     // Catch:{ all -> 0x0394 }
        L_0x02b7:
            java.util.Iterator r18 = r12.iterator()     // Catch:{ all -> 0x0394 }
            r10 = r12
            r9 = 0
            r1 = 0
        L_0x02be:
            boolean r0 = r18.hasNext()     // Catch:{ all -> 0x0394 }
            if (r0 == 0) goto L_0x0335
            java.lang.Object r14 = r18.next()     // Catch:{ all -> 0x0394 }
            int r17 = r9 + 1
            if (r9 >= 0) goto L_0x02d1
            java.lang.RuntimeException r0 = X.C36351kA.A0v()     // Catch:{ all -> 0x0394 }
            throw r0     // Catch:{ all -> 0x0394 }
        L_0x02d1:
            X.6lc r14 = (X.C140456lc) r14     // Catch:{ all -> 0x0394 }
            if (r14 == 0) goto L_0x0332
            X.6lc r0 = X.AnonymousClass6Qm.A01(r14, r11, r9)     // Catch:{ all -> 0x0394 }
            X.6Vr r24 = A00     // Catch:{ all -> 0x0394 }
            r25 = r8
            r26 = r14
            r27 = r0
            r28 = r21
            r29 = r22
            X.6lc r15 = r24.A02(r25, r26, r27, r28, r29)     // Catch:{ all -> 0x0394 }
            boolean r0 = X.C36371kC.A1W(r15, r0)
            r20 = r20 | r0
            int r0 = r15.A00     // Catch:{ all -> 0x0394 }
            r0 = r0 & 2
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r19 = r19 | r0
            java.util.Set r0 = r15.A02     // Catch:{ all -> 0x0394 }
            if (r0 != 0) goto L_0x0301
            java.util.Set r0 = java.util.Collections.emptySet()     // Catch:{ all -> 0x0394 }
        L_0x0301:
            X.AnonymousClass00C.A0B(r0)     // Catch:{ all -> 0x0394 }
            boolean r16 = X.C90514aH.A1a(r0)     // Catch:{ all -> 0x0394 }
            if (r16 == 0) goto L_0x030d
            r2.addAll(r0)     // Catch:{ all -> 0x0394 }
        L_0x030d:
            if (r15 == r14) goto L_0x0332
            if (r10 != r12) goto L_0x0315
            java.util.ArrayList r10 = X.C36441kJ.A15(r12)     // Catch:{ all -> 0x0394 }
        L_0x0315:
            int r14 = r15.A04     // Catch:{ all -> 0x0394 }
            r0 = 16851(0x41d3, float:2.3613E-41)
            if (r14 != r0) goto L_0x032e
            java.util.List r0 = r15.A0b()     // Catch:{ all -> 0x0394 }
            int r9 = r9 + r1
            r10.remove(r9)     // Catch:{ all -> 0x0394 }
            X.AnonymousClass00C.A0B(r0)     // Catch:{ all -> 0x0394 }
            r10.addAll(r9, r0)     // Catch:{ all -> 0x0394 }
            int r1 = X.C90524aI.A04(r0, r1)     // Catch:{ all -> 0x0394 }
            goto L_0x0332
        L_0x032e:
            int r9 = r9 + r1
            r10.set(r9, r15)     // Catch:{ all -> 0x0394 }
        L_0x0332:
            r9 = r17
            goto L_0x02be
        L_0x0335:
            if (r10 == r12) goto L_0x033b
            X.6lc r5 = X.AnonymousClass6Qm.A00(r5, r7, r10, r13)     // Catch:{ all -> 0x0394 }
        L_0x033b:
            if (r5 == r7) goto L_0x0352
            int r0 = r5.A00     // Catch:{ all -> 0x0394 }
            if (r19 == 0) goto L_0x0344
            r0 = r0 | 2
            goto L_0x0346
        L_0x0344:
            r0 = r0 & -3
        L_0x0346:
            r5.A00 = r0     // Catch:{ all -> 0x0394 }
            r1 = r2
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x0394 }
            if (r0 == 0) goto L_0x0350
            r1 = 0
        L_0x0350:
            r5.A02 = r1     // Catch:{ all -> 0x0394 }
        L_0x0352:
            int r4 = r4 + 1
            goto L_0x02a1
        L_0x0356:
            if (r20 != 0) goto L_0x035b
            if (r46 == 0) goto L_0x035b
            goto L_0x035d
        L_0x035b:
            r6 = r5
            goto L_0x0361
        L_0x035d:
            X.6lc r0 = r6.A06     // Catch:{ all -> 0x0394 }
            if (r0 != r7) goto L_0x035b
        L_0x0361:
            X.5sZ r3 = r8.A05     // Catch:{ all -> 0x0394 }
            boolean r0 = r21.isEmpty()     // Catch:{ all -> 0x0394 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0374
            android.util.SparseArray r2 = r3.A00     // Catch:{ all -> 0x0394 }
            int r1 = r6.A03     // Catch:{ all -> 0x0394 }
            r0 = r21
            r2.put(r1, r0)     // Catch:{ all -> 0x0394 }
        L_0x0374:
            java.util.Set r1 = r21.keySet()     // Catch:{ all -> 0x0394 }
            X.AnonymousClass00C.A08(r1)     // Catch:{ all -> 0x0394 }
            r0 = r22
            r0.removeAll(r1)     // Catch:{ all -> 0x0394 }
            android.util.SparseArray r2 = r3.A02     // Catch:{ all -> 0x0394 }
            int r1 = r6.A03     // Catch:{ all -> 0x0394 }
            r2.put(r1, r0)     // Catch:{ all -> 0x0394 }
            r1 = r41
            r1.addAll(r0)     // Catch:{ all -> 0x0394 }
            r1 = r42
            r0 = r21
            r1.putAll(r0)     // Catch:{ all -> 0x0394 }
            goto L_0x03e9
        L_0x0394:
            r0 = move-exception
            if (r23 == 0) goto L_0x039a
            X.AnonymousClass68E.A00()
        L_0x039a:
            throw r0
        L_0x039b:
            r0 = r41
            r0.addAll(r2)
            X.5sZ r2 = r8.A05
            r0 = 1
            X.AnonymousClass00C.A0D(r2, r0)
            r1 = 0
            X.5aA r0 = new X.5aA
            r0.<init>(r5, r2, r1)
            r6.A0g(r0)
            android.util.SparseArray r0 = r5.A00
            java.lang.Object r1 = r0.get(r3)
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L_0x03ee
            r0 = r42
            r0.putAll(r1)
            java.util.Iterator r3 = X.AnonymousClass000.A0y(r1)
        L_0x03c2:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x03ee
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r3)
            java.lang.Object r2 = r0.getKey()
            java.lang.Object r1 = r0.getValue()
            java.util.Map r0 = r8.A0A
            r0.put(r2, r1)
            java.util.Map r0 = r8.A0B
            java.lang.Object r0 = r0.get(r2)
            boolean r0 = X.AnonymousClass5Z0.A00(r0, r1)
            if (r0 != 0) goto L_0x03c2
            r4.add(r2)
            goto L_0x03c2
        L_0x03e9:
            if (r23 == 0) goto L_0x03ee
            X.AnonymousClass68E.A00()
        L_0x03ee:
            return r6
        L_0x03ef:
            return r45
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132896Vr.A02(X.65E, X.6lc, X.6lc, java.util.Map, java.util.Set):X.6lc");
    }
}
