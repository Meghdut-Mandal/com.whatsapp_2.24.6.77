package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.1SQ  reason: invalid class name */
public final class AnonymousClass1SQ {
    public final C19730wQ A00;
    public final AnonymousClass164 A01;
    public final AnonymousClass1SR A02;
    public final AnonymousClass176 A03;
    public final C26201Jg A04;
    public final C26171Jd A05;
    public final AnonymousClass1SM A06;
    public final AnonymousClass1SP A07;
    public final AnonymousClass1A1 A08;
    public final AnonymousClass1SV A09;
    public final Set A0A = new LinkedHashSet();
    public final C19970wo A0B;
    public final AnonymousClass163 A0C;
    public final C220412q A0D;
    public final AnonymousClass1TY A0E;

    public AnonymousClass1SQ(C19730wQ r2, AnonymousClass164 r3, C19970wo r4, AnonymousClass163 r5, C220412q r6, AnonymousClass1SR r7, AnonymousClass176 r8, C26201Jg r9, C26171Jd r10, AnonymousClass1SM r11, AnonymousClass1SP r12, AnonymousClass1TY r13, AnonymousClass1A1 r14, AnonymousClass1SV r15) {
        AnonymousClass00C.A0D(r4, 1);
        AnonymousClass00C.A0D(r5, 2);
        AnonymousClass00C.A0D(r2, 3);
        AnonymousClass00C.A0D(r6, 4);
        AnonymousClass00C.A0D(r3, 5);
        AnonymousClass00C.A0D(r14, 6);
        AnonymousClass00C.A0D(r10, 7);
        AnonymousClass00C.A0D(r8, 8);
        AnonymousClass00C.A0D(r9, 9);
        AnonymousClass00C.A0D(r11, 10);
        AnonymousClass00C.A0D(r7, 11);
        AnonymousClass00C.A0D(r15, 13);
        this.A0B = r4;
        this.A0C = r5;
        this.A00 = r2;
        this.A0D = r6;
        this.A01 = r3;
        this.A08 = r14;
        this.A05 = r10;
        this.A03 = r8;
        this.A04 = r9;
        this.A06 = r11;
        this.A02 = r7;
        this.A0E = r13;
        this.A09 = r15;
        this.A07 = r12;
    }

    public final void A01(C28981Uw r13, AnonymousClass2bS r14, List list, long j) {
        AnonymousClass00C.A0D(r13, 0);
        AnonymousClass00C.A0D(r14, 1);
        List list2 = r14.A05;
        AnonymousClass00C.A08(list2);
        ArrayList<AnonymousClass3PS> arrayList = new ArrayList<>();
        for (Object next : list2) {
            AnonymousClass3PS r3 = (AnonymousClass3PS) next;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (AnonymousClass00C.A0J(r3.A02, it.next())) {
                        arrayList.add(next);
                        break;
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(AnonymousClass03U.A06(arrayList, 10));
        for (AnonymousClass3PS r0 : arrayList) {
            arrayList2.add(Long.valueOf(r0.A01));
        }
        AnonymousClass1TY r2 = this.A0E;
        long j2 = j;
        C180858mX r22 = new C180858mX(r2.A00.A02(r13, true), new C195759Vv((AnonymousClass11F) null, r14.A1J), (List) arrayList2, j2, r14.A1N, j2);
        r22.A0n(17);
        C26171Jd.A00(this.A05, r22, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00aa, code lost:
        r2 = r9.A06.A06(r10);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(X.C28981Uw r19, X.AnonymousClass3T1 r20) {
        /*
            r18 = this;
            r5 = 0
            r9 = r18
            X.12q r1 = r9.A0D
            r2 = r19
            X.C65903Tx.A04(r1, r2)
            X.163 r0 = r9.A0C
            r0.A08(r2)
            X.3Qp r4 = r1.A09(r2, r5)
            r10 = r20
            if (r4 != 0) goto L_0x002d
            java.util.Set r0 = r9.A0A
            boolean r0 = r0.add(r2)
            if (r0 == 0) goto L_0x002d
            X.3nn r0 = new X.3nn
            r0.<init>(r9, r10)
            X.164 r1 = r9.A01
            X.8fM r0 = X.C1900796u.A00(r2, r0)
            r1.A01(r0)
        L_0x002d:
            X.3Qa r1 = r10.A1J
            X.AnonymousClass00C.A07(r1)
            X.1A1 r7 = r9.A08
            X.3T1 r6 = r7.A03(r1)
            if (r6 != 0) goto L_0x0040
            X.1Jd r0 = r9.A05
            X.2bM r6 = r0.A0A(r1)
        L_0x0040:
            r3 = 1048576(0x100000, float:1.469368E-39)
            if (r6 == 0) goto L_0x0135
            boolean r0 = r10 instanceof X.AnonymousClass2bO
            r2 = 1
            if (r0 == 0) goto L_0x00cc
            boolean r0 = r6 instanceof X.AnonymousClass2bO
            if (r0 == 0) goto L_0x0097
            long r4 = r10.A1O
            long r0 = r6.A1O
            int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r7 != 0) goto L_0x0097
        L_0x0055:
            X.3A4 r5 = r6.A0Z()
            X.4Uq r4 = r6.A0J
            r0 = 131072(0x20000, float:1.83671E-40)
            boolean r1 = r10.A1T(r0)
            if (r5 == 0) goto L_0x0091
            java.lang.String r0 = r5.A05
            if (r0 == 0) goto L_0x006d
            int r0 = r0.length()
            if (r0 != 0) goto L_0x006f
        L_0x006d:
            if (r1 == 0) goto L_0x0091
        L_0x006f:
            X.0wo r0 = r9.A0B
            long r14 = X.C19970wo.A00(r0)
            long r0 = r5.A03
            java.lang.Long r11 = java.lang.Long.valueOf(r0)
            java.lang.String r13 = r5.A05
            java.lang.Long r12 = r5.A04
            r16 = 1
            r17 = 0
            r9.A02(r10, r11, r12, r13, r14, r16, r17)
            if (r4 == 0) goto L_0x0091
            boolean r0 = r10.A1T(r3)
            if (r0 != 0) goto L_0x0091
            r10.A1U(r4)
        L_0x0091:
            X.1SM r0 = r9.A06
            r0.A05(r10)
            return r2
        L_0x0097:
            boolean r0 = r10.A1T(r3)
            if (r0 == 0) goto L_0x00a2
            r0 = 16
            r10.A0n(r0)
        L_0x00a2:
            X.1SR r0 = r9.A02
            boolean r2 = r0.A04(r10, r2)
            if (r2 != 0) goto L_0x00b2
            X.1SM r0 = r9.A06
            boolean r2 = r0.A06(r10)
            if (r2 == 0) goto L_0x0055
        L_0x00b2:
            X.1SM r0 = r9.A06
            r0.A04(r10)
            boolean r0 = r10.A1J()
            if (r0 != 0) goto L_0x0055
            X.1SP r5 = r9.A07
            X.0wI r4 = r5.A02
            r1 = 43
            X.1j0 r0 = new X.1j0
            r0.<init>(r6, r5, r10, r1)
            r4.A00(r0)
            goto L_0x0055
        L_0x00cc:
            X.37F r1 = r6.A0X()
            X.37F r0 = r10.A0X()
            if (r0 == 0) goto L_0x00e3
            long r4 = r0.A00
        L_0x00d8:
            if (r1 == 0) goto L_0x00e6
            long r0 = r1.A00
            int r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x00e6
            r2 = 0
            goto L_0x0055
        L_0x00e3:
            long r4 = r10.A0I
            goto L_0x00d8
        L_0x00e6:
            boolean r0 = r10 instanceof X.AnonymousClass2bS
            if (r0 != 0) goto L_0x0055
            int r0 = r6.A0D
            r10.A0n(r0)
            long r0 = r6.A1N
            r10.A1N = r0
            r1 = 131072(0x20000, float:1.83671E-40)
            boolean r0 = r10.A1T(r1)
            if (r0 == 0) goto L_0x0100
            X.1SV r0 = r9.A09
            r0.A0H(r10)
        L_0x0100:
            r0 = 33
            boolean r2 = r7.A05(r10, r0)     // Catch:{ SQLiteException -> 0x012c }
            boolean r0 = r10.A1T(r1)     // Catch:{ SQLiteException -> 0x012c }
            if (r0 == 0) goto L_0x0111
            X.1Jg r0 = r9.A04     // Catch:{ SQLiteException -> 0x012c }
            r0.A02(r10)     // Catch:{ SQLiteException -> 0x012c }
        L_0x0111:
            X.176 r0 = r9.A03     // Catch:{ SQLiteException -> 0x012c }
            r0.A0B(r10)     // Catch:{ SQLiteException -> 0x012c }
            boolean r0 = r10.A1J()     // Catch:{ SQLiteException -> 0x012c }
            if (r0 != 0) goto L_0x0055
            X.1SP r5 = r9.A07     // Catch:{ SQLiteException -> 0x012c }
            X.0wI r4 = r5.A02     // Catch:{ SQLiteException -> 0x012c }
            r1 = 43
            X.1j0 r0 = new X.1j0     // Catch:{ SQLiteException -> 0x012c }
            r0.<init>(r6, r5, r10, r1)     // Catch:{ SQLiteException -> 0x012c }
            r4.A00(r0)     // Catch:{ SQLiteException -> 0x012c }
            goto L_0x0055
        L_0x012c:
            r1 = move-exception
            java.lang.String r0 = "NewsletterMessageManager/unable to update the message"
            com.whatsapp.util.Log.e(r0, r1)
            r2 = 0
            goto L_0x0055
        L_0x0135:
            boolean r0 = r10.A1T(r3)
            if (r0 == 0) goto L_0x0143
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0172
            r0 = 4
            r10.A0n(r0)
        L_0x0143:
            boolean r0 = r4 instanceof X.C44072La
            if (r0 == 0) goto L_0x0164
            X.2La r4 = (X.C44072La) r4
            boolean r0 = r4.A0N
            if (r0 == 0) goto L_0x0164
            r1 = 0
            java.util.Set r0 = r9.A0A
            boolean r0 = r0.add(r2)
            if (r0 == 0) goto L_0x0164
            X.3nn r0 = new X.3nn
            r0.<init>(r9, r1)
            X.164 r1 = r9.A01
            X.8fM r0 = X.C1900796u.A00(r2, r0)
            r1.A01(r0)
        L_0x0164:
            X.1SM r0 = r9.A06
            boolean r1 = r0.A06(r10)
            if (r1 == 0) goto L_0x0171
            X.176 r0 = r9.A03
            r0.A0B(r10)
        L_0x0171:
            return r1
        L_0x0172:
            r10.A0n(r5)
            goto L_0x0143
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1SQ.A03(X.1Uw, X.3T1):boolean");
    }

    public final void A00(C28981Uw r17, AnonymousClass3T1 r18, List list, List list2, long j) {
        boolean z;
        int i;
        int i2;
        C68973cl r1;
        String str;
        AnonymousClass3T1 r5 = r18;
        if (list != null) {
            z = true;
        } else if (list2 != null) {
            z = false;
        } else {
            return;
        }
        A02(r5, (Long) null, (Long) null, (String) null, j, z, false);
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C35861jN r0 = (C35861jN) it.next();
                C19730wQ r8 = this.A00;
                String str2 = r0.A01;
                AnonymousClass00C.A08(str2);
                Number number = (Number) r0.A00;
                AnonymousClass00C.A08(number);
                long longValue = number.longValue();
                AnonymousClass3A4 A0Z = r5.A0Z();
                if (A0Z != null) {
                    str = A0Z.A05;
                } else {
                    str = null;
                }
                arrayList.add(new AnonymousClass28g(r8, r17, str2, longValue, r5.A1N, str2.equals(str)));
            }
            if (!r5.A1U(new C68973cl(arrayList))) {
                C88944Uq r12 = r5.A0J;
                if ((r12 instanceof C68973cl) && (r1 = (C68973cl) r12) != null) {
                    List list3 = r1.A00;
                    synchronized (list3) {
                        list3.clear();
                        list3.addAll(arrayList);
                    }
                }
            }
        }
        if (list2 != null && (r5 instanceof AnonymousClass2bS)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                C35841jL r2 = (C35841jL) it2.next();
                String A002 = C112105dM.A00((byte[]) r2.A01);
                AnonymousClass00C.A0B(A002);
                Object obj = r2.A00;
                AnonymousClass00C.A08(obj);
                linkedHashMap.put(A002, obj);
            }
            AnonymousClass2bS r52 = (AnonymousClass2bS) r5;
            r52.A04 = null;
            for (AnonymousClass3PS r22 : r52.A05) {
                String str3 = r22.A02;
                if (linkedHashMap.containsKey(str3)) {
                    Number number2 = (Number) linkedHashMap.get(str3);
                    i2 = 0;
                    if (number2 != null) {
                        i = number2.intValue();
                        if (i < 0) {
                            r22.A00 = i2;
                        }
                        i2 = i;
                        r22.A00 = i2;
                    }
                }
                i = 0;
                i2 = i;
                r22.A00 = i2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0060, code lost:
        if (r31 == null) goto L_0x0062;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006e A[Catch:{ all -> 0x0129 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007e A[Catch:{ all -> 0x0129 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008c A[Catch:{ all -> 0x0129 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A02(X.AnonymousClass3T1 r29, java.lang.Long r30, java.lang.Long r31, java.lang.String r32, long r33, boolean r35, boolean r36) {
        /*
            r28 = this;
            r4 = r28
            monitor-enter(r4)
            r9 = 0
            r0 = 0
            if (r35 == 0) goto L_0x000b
            r2 = 1
            goto L_0x000d
        L_0x000b:
            r2 = 0
        L_0x000d:
            r8 = r29
            X.3A4 r10 = r8.A0Z()     // Catch:{ all -> 0x0136 }
            r18 = r31
            r5 = r32
            r6 = r33
            if (r10 != 0) goto L_0x0037
            if (r30 == 0) goto L_0x0021
            long r0 = r30.longValue()     // Catch:{ all -> 0x0136 }
        L_0x0021:
            r20 = 0
            X.3A4 r9 = new X.3A4     // Catch:{ all -> 0x0136 }
            r22 = r2
            r24 = r6
            r26 = r0
            r17 = r9
            r19 = r5
            r17.<init>(r18, r19, r20, r22, r24, r26)     // Catch:{ all -> 0x0136 }
            r8.A13(r9)     // Catch:{ all -> 0x0136 }
            goto L_0x0134
        L_0x0037:
            X.3A4 r10 = r8.A0Z()     // Catch:{ all -> 0x0136 }
            r17 = 0
            if (r10 == 0) goto L_0x004a
            java.lang.String r12 = r10.A05     // Catch:{ all -> 0x0136 }
        L_0x0041:
            X.3A4 r10 = r8.A0Z()     // Catch:{ all -> 0x0136 }
            if (r10 == 0) goto L_0x005e
            java.lang.Long r11 = r10.A04     // Catch:{ all -> 0x0136 }
            goto L_0x004d
        L_0x004a:
            r12 = r17
            goto L_0x0041
        L_0x004d:
            if (r11 == 0) goto L_0x0060
            if (r31 == 0) goto L_0x0062
            long r15 = r18.longValue()     // Catch:{ all -> 0x0136 }
            long r13 = r11.longValue()     // Catch:{ all -> 0x0136 }
            int r10 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r10 <= 0) goto L_0x0062
            goto L_0x0064
        L_0x005e:
            r11 = r17
        L_0x0060:
            if (r31 != 0) goto L_0x0064
        L_0x0062:
            r13 = 0
            goto L_0x0068
        L_0x0064:
            r13 = 1
            r12 = r5
            r11 = r18
        L_0x0068:
            X.3A4 r10 = r8.A0Z()     // Catch:{ all -> 0x0136 }
            if (r10 == 0) goto L_0x007e
            r10.A00 = r0     // Catch:{ all -> 0x0136 }
            r10.A05 = r12     // Catch:{ all -> 0x0136 }
            r10.A04 = r11     // Catch:{ all -> 0x0136 }
            r10.A01 = r2     // Catch:{ all -> 0x0136 }
            r10.A02 = r6     // Catch:{ all -> 0x0136 }
            if (r30 == 0) goto L_0x007b
            goto L_0x0081
        L_0x007b:
            long r0 = r10.A03     // Catch:{ all -> 0x0136 }
            goto L_0x0085
        L_0x007e:
            r10 = r17
            goto L_0x0087
        L_0x0081:
            long r0 = r30.longValue()     // Catch:{ all -> 0x0136 }
        L_0x0085:
            r10.A03 = r0     // Catch:{ all -> 0x0136 }
        L_0x0087:
            r8.A13(r10)     // Catch:{ all -> 0x0136 }
            if (r13 == 0) goto L_0x0134
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0136 }
            r1.<init>(r9)     // Catch:{ all -> 0x0136 }
            X.3cl r0 = new X.3cl     // Catch:{ all -> 0x0136 }
            r0.<init>(r1)     // Catch:{ all -> 0x0136 }
            r8.A1U(r0)     // Catch:{ all -> 0x0136 }
            X.4Uq r1 = r8.A0J     // Catch:{ all -> 0x0136 }
            if (r1 == 0) goto L_0x012c
            boolean r0 = r1 instanceof X.C68973cl     // Catch:{ all -> 0x0136 }
            if (r0 == 0) goto L_0x0134
            X.3cl r1 = (X.C68973cl) r1     // Catch:{ all -> 0x0136 }
            if (r1 == 0) goto L_0x0134
            X.0wQ r11 = r4.A00     // Catch:{ all -> 0x0136 }
            X.3Qa r0 = r8.A1J     // Catch:{ all -> 0x0136 }
            X.11F r3 = r0.A00     // Catch:{ all -> 0x0136 }
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.NewsletterJid"
            X.AnonymousClass00C.A0E(r3, r0)     // Catch:{ all -> 0x0136 }
            X.1Uw r3 = (X.C28981Uw) r3     // Catch:{ all -> 0x0136 }
            long r6 = r8.A1N     // Catch:{ all -> 0x0136 }
            r10 = 1
            X.AnonymousClass00C.A0D(r3, r10)     // Catch:{ all -> 0x0136 }
            java.util.List r2 = r1.A00     // Catch:{ all -> 0x0136 }
            monitor-enter(r2)     // Catch:{ all -> 0x0136 }
            java.util.Iterator r16 = r2.iterator()     // Catch:{ all -> 0x0129 }
            r9 = 0
            r15 = 1
        L_0x00c1:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x0129 }
            if (r0 == 0) goto L_0x0104
            java.lang.Object r8 = r16.next()     // Catch:{ all -> 0x0129 }
            X.28g r8 = (X.AnonymousClass28g) r8     // Catch:{ all -> 0x0129 }
            boolean r0 = r8.A01     // Catch:{ all -> 0x0129 }
            if (r0 == 0) goto L_0x00ef
            java.lang.String r0 = r8.A02     // Catch:{ all -> 0x0129 }
            boolean r0 = X.AnonymousClass00C.A0J(r0, r5)     // Catch:{ all -> 0x0129 }
            if (r0 != 0) goto L_0x0127
            r0 = 0
            r8.A01 = r0     // Catch:{ all -> 0x0129 }
            if (r36 == 0) goto L_0x00e5
            long r0 = r8.A00     // Catch:{ all -> 0x0129 }
            r12 = -1
            long r0 = r0 + r12
            r8.A00 = r0     // Catch:{ all -> 0x0129 }
        L_0x00e5:
            long r0 = r8.A00     // Catch:{ all -> 0x0129 }
            r13 = 0
            int r12 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r12 != 0) goto L_0x00c1
            r9 = r8
            goto L_0x00c1
        L_0x00ef:
            java.lang.String r0 = r8.A02     // Catch:{ all -> 0x0129 }
            boolean r0 = X.AnonymousClass00C.A0J(r0, r5)     // Catch:{ all -> 0x0129 }
            if (r0 == 0) goto L_0x00c1
            r8.A01 = r10     // Catch:{ all -> 0x0129 }
            if (r36 == 0) goto L_0x0102
            long r0 = r8.A00     // Catch:{ all -> 0x0129 }
            r12 = 1
            long r0 = r0 + r12
            r8.A00 = r0     // Catch:{ all -> 0x0129 }
        L_0x0102:
            r15 = 0
            goto L_0x00c1
        L_0x0104:
            if (r9 == 0) goto L_0x010d
            java.util.Collection r0 = X.C07710Yz.A00(r2)     // Catch:{ all -> 0x0129 }
            r0.remove(r9)     // Catch:{ all -> 0x0129 }
        L_0x010d:
            if (r15 == 0) goto L_0x0127
            if (r32 == 0) goto L_0x0127
            int r0 = r5.length()     // Catch:{ all -> 0x0129 }
            if (r0 == 0) goto L_0x0127
            r14 = 1
            X.28g r10 = new X.28g     // Catch:{ all -> 0x0129 }
            r18 = 1
            r12 = r3
            r13 = r5
            r16 = r6
            r10.<init>(r11, r12, r13, r14, r16, r18)     // Catch:{ all -> 0x0129 }
            r2.add(r10)     // Catch:{ all -> 0x0129 }
        L_0x0127:
            monitor-exit(r2)     // Catch:{ all -> 0x0136 }
            goto L_0x0134
        L_0x0129:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0136 }
            goto L_0x0133
        L_0x012c:
            java.lang.String r0 = "Failed requirement."
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0136 }
            r1.<init>(r0)     // Catch:{ all -> 0x0136 }
        L_0x0133:
            throw r1     // Catch:{ all -> 0x0136 }
        L_0x0134:
            monitor-exit(r4)
            return
        L_0x0136:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1SQ.A02(X.3T1, java.lang.Long, java.lang.Long, java.lang.String, long, boolean, boolean):void");
    }
}
