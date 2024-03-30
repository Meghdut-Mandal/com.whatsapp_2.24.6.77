package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.1ZJ  reason: invalid class name */
public final class AnonymousClass1ZJ {
    public final AnonymousClass16D A00;
    public final AnonymousClass16I A01;
    public final AnonymousClass16K A02;
    public final C19970wo A03;
    public final C220412q A04;
    public final C26141Ja A05;
    public final AnonymousClass17Y A06;
    public final AnonymousClass1DP A07;
    public final AnonymousClass1ZK A08;

    public AnonymousClass1ZJ(AnonymousClass17Y r2, AnonymousClass16D r3, AnonymousClass16I r4, AnonymousClass16K r5, C19970wo r6, AnonymousClass1DP r7, C220412q r8, C26141Ja r9, AnonymousClass1ZK r10) {
        AnonymousClass00C.A0D(r6, 1);
        AnonymousClass00C.A0D(r2, 2);
        AnonymousClass00C.A0D(r8, 3);
        AnonymousClass00C.A0D(r7, 4);
        AnonymousClass00C.A0D(r3, 5);
        AnonymousClass00C.A0D(r9, 6);
        AnonymousClass00C.A0D(r4, 7);
        AnonymousClass00C.A0D(r5, 8);
        AnonymousClass00C.A0D(r10, 9);
        this.A03 = r6;
        this.A06 = r2;
        this.A04 = r8;
        this.A07 = r7;
        this.A00 = r3;
        this.A05 = r9;
        this.A01 = r4;
        this.A02 = r5;
        this.A08 = r10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0015  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass3JG A03(X.C44072La r9, X.C22840Awp r10, boolean r11) {
        /*
            r3 = 0
            if (r11 == 0) goto L_0x0075
            if (r9 == 0) goto L_0x007a
            long r0 = r9.A05
        L_0x0007:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x000b:
            r1 = -1
            if (r0 == 0) goto L_0x0072
            long r7 = r0.longValue()
        L_0x0013:
            if (r11 == 0) goto L_0x006b
            if (r9 == 0) goto L_0x0070
            java.lang.String r6 = r9.A0M
        L_0x0019:
            if (r10 != 0) goto L_0x0022
            r4 = r7
        L_0x001c:
            X.3JG r3 = new X.3JG
            r3.<init>(r4, r6, r7)
            return r3
        L_0x0022:
            boolean r0 = r10 instanceof X.C185468uH
            if (r0 == 0) goto L_0x004f
            X.8uH r10 = (X.C185468uH) r10
            java.lang.String r0 = r10.A01
            X.AnonymousClass00C.A08(r0)
            java.lang.Long r0 = X.AnonymousClass097.A04(r0)
            if (r0 == 0) goto L_0x004c
            long r4 = r0.longValue()
        L_0x0037:
            java.lang.String r3 = r10.A00
        L_0x0039:
            if (r3 == 0) goto L_0x0046
            int r0 = r3.length()
            if (r0 == 0) goto L_0x0046
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0049
            r1 = r7
        L_0x0046:
            r6 = r3
            r7 = r1
            goto L_0x001c
        L_0x0049:
            r1 = 0
            goto L_0x0046
        L_0x004c:
            r4 = -1
            goto L_0x0037
        L_0x004f:
            boolean r0 = r10 instanceof X.C185458uG
            if (r0 == 0) goto L_0x0069
            X.8uG r10 = (X.C185458uG) r10
            java.lang.String r0 = r10.A00
            X.AnonymousClass00C.A08(r0)
            java.lang.Long r0 = X.AnonymousClass097.A04(r0)
            if (r0 == 0) goto L_0x0066
            long r4 = r0.longValue()
        L_0x0064:
            r3 = r6
            goto L_0x0039
        L_0x0066:
            r4 = -1
            goto L_0x0064
        L_0x0069:
            r4 = r7
            goto L_0x0046
        L_0x006b:
            if (r9 == 0) goto L_0x0070
            java.lang.String r6 = r9.A0L
            goto L_0x0019
        L_0x0070:
            r6 = r3
            goto L_0x0019
        L_0x0072:
            r7 = -1
            goto L_0x0013
        L_0x0075:
            if (r9 == 0) goto L_0x007a
            long r0 = r9.A06
            goto L_0x0007
        L_0x007a:
            r0 = r3
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ZJ.A03(X.2La, X.Awp, boolean):X.3JG");
    }

    public static final C22840Awp A04(C184078rr r4, String str) {
        List list;
        Object obj;
        String str2;
        String str3;
        String str4;
        C185448uF r2;
        C185458uG r1;
        C185468uH r12;
        if (r4 == null || (list = (List) r4.A00) == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C22840Awp awp = (C22840Awp) ((C35831jK) obj).A00;
            if (!(awp instanceof C185468uH) || (r12 = (C185468uH) awp) == null) {
                str2 = null;
            } else {
                str2 = r12.A02;
            }
            if (!AnonymousClass00C.A0J(str2, str)) {
                if (!(awp instanceof C185458uG) || (r1 = (C185458uG) awp) == null) {
                    str3 = null;
                } else {
                    str3 = r1.A01;
                }
                if (!AnonymousClass00C.A0J(str3, str)) {
                    if (!(awp instanceof C185448uF) || (r2 = (C185448uF) awp) == null) {
                        str4 = null;
                    } else {
                        str4 = r2.A00;
                    }
                    if (AnonymousClass00C.A0J(str4, str)) {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        C35831jK r3 = (C35831jK) obj;
        if (r3 != null) {
            return (C22840Awp) r3.A00;
        }
        return null;
    }

    public final void A06(AnonymousClass11F r4) {
        this.A07.A02(r4, false);
        this.A06.A0H(new C35741jB(this, r4, 23));
    }

    public static final C52382pL A00(String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1219769240) {
                if (hashCode != 92668751) {
                    if (hashCode == 106164915 && str.equals("owner")) {
                        return C52382pL.OWNER;
                    }
                } else if (str.equals("admin")) {
                    return C52382pL.ADMIN;
                }
            } else if (str.equals("subscriber")) {
                return C52382pL.SUBSCRIBED;
            }
        }
        return C52382pL.GUEST;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006a, code lost:
        if (r6 != null) goto L_0x006c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x012d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C44072La A01(X.C44072La r44, X.C28981Uw r45, X.AnonymousClass1ZJ r46, X.C184418sP r47) {
        /*
            r13 = r47
            X.8rr r1 = r13.A05
            java.lang.String r0 = "image"
            X.Awp r2 = A04(r1, r0)
            java.lang.String r0 = "preview"
            X.Awp r1 = A04(r1, r0)
            r0 = 1
            r9 = r44
            X.3JG r7 = A03(r9, r2, r0)
            r0 = 0
            X.3JG r12 = A03(r9, r1, r0)
            r20 = 0
            r24 = 0
            r2 = r45
            r3 = r46
            r4 = r9
            r5 = r20
            r6 = r2
            r8 = r12
            r3.A05(r4, r5, r6, r7, r8)
            X.8rr r0 = r13.A04
            if (r0 == 0) goto L_0x013f
            java.lang.Object r1 = r0.A00
            X.8s9 r1 = (X.C184258s9) r1
            if (r1 == 0) goto L_0x013b
            java.lang.String r0 = r1.A01
            r20 = r0
            java.lang.String r0 = r1.A02
            if (r0 == 0) goto L_0x013b
            long r4 = java.lang.Long.parseLong(r0)
        L_0x0042:
            boolean r0 = r9.A0N
            if (r0 == 0) goto L_0x004e
            r0 = 0
            r9.A0N = r0
            X.1ZK r0 = r3.A08
            r0.A02(r2)
        L_0x004e:
            long r2 = r12.A01
            long r0 = r7.A01
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x0137
            java.lang.String r6 = r7.A02
            r22 = r6
        L_0x005a:
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 == 0) goto L_0x0060
            r0 = -1
        L_0x0060:
            X.8sD r6 = r13.A02
            if (r6 == 0) goto L_0x0068
            java.lang.String r15 = r6.A02
            if (r15 != 0) goto L_0x006c
        L_0x0068:
            java.lang.String r15 = r9.A0K
            if (r6 == 0) goto L_0x0131
        L_0x006c:
            java.lang.String r6 = r6.A03
            if (r6 == 0) goto L_0x0131
            long r18 = java.lang.Long.parseLong(r6)
        L_0x0074:
            X.8rr r6 = r13.A06
            if (r6 == 0) goto L_0x007e
            java.lang.Object r11 = r6.A00
            java.lang.Number r11 = (java.lang.Number) r11
            if (r11 != 0) goto L_0x0084
        L_0x007e:
            long r6 = r9.A07
            java.lang.Long r11 = java.lang.Long.valueOf(r6)
        L_0x0084:
            X.8sm r6 = r13.A09
            if (r6 == 0) goto L_0x012d
            java.lang.String r7 = r6.A00
            if (r7 == 0) goto L_0x012d
            java.lang.String r6 = "public"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x0129
            X.2oz r14 = X.C52162oz.PUBLIC
        L_0x0096:
            X.8sl r6 = r13.A07
            if (r6 == 0) goto L_0x0123
            java.lang.String r6 = r6.A00
            if (r6 == 0) goto L_0x0123
            X.2pL r17 = A00(r6)
        L_0x00a2:
            X.8so r6 = r13.A0B
            if (r6 == 0) goto L_0x0120
            java.lang.String r7 = r6.A00
            if (r7 == 0) goto L_0x0120
            java.lang.String r6 = "verified"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x011d
            X.2p1 r10 = X.C52182p1.VERIFIED
        L_0x00b4:
            X.5PX r6 = r13.A08
            if (r6 == 0) goto L_0x0118
            java.lang.String r7 = r6.A00
            if (r7 == 0) goto L_0x0118
            java.lang.String r6 = "on"
            boolean r16 = r7.equals(r6)
        L_0x00c2:
            X.8sn r6 = r13.A0A
            if (r6 == 0) goto L_0x00d0
            java.lang.String r6 = r6.A00
            if (r6 == 0) goto L_0x00d0
            X.2pB r8 = A02(r6)
            if (r8 != 0) goto L_0x00d2
        L_0x00d0:
            X.2pB r8 = r9.A0E
        L_0x00d2:
            X.8rj r6 = r13.A01
            if (r6 == 0) goto L_0x00da
            java.lang.String r7 = r6.A00
            if (r7 != 0) goto L_0x00dc
        L_0x00da:
            java.lang.String r7 = r9.A0J
        L_0x00dc:
            X.8rj r6 = r13.A00
            if (r6 == 0) goto L_0x00e4
            java.lang.String r6 = r6.A00
            if (r6 != 0) goto L_0x00e6
        L_0x00e4:
            java.lang.String r6 = r9.A0I
        L_0x00e6:
            java.lang.String r12 = r12.A02
            r35 = 0
            long r45 = r11.longValue()
            r34 = 530187265(0x1f9a0401, float:6.522816E-20)
            r21 = r9
            r37 = r18
            r39 = r4
            r41 = r0
            r43 = r2
            r47 = r16
            r25 = r14
            r26 = r8
            r27 = r10
            r28 = r15
            r29 = r20
            r30 = r22
            r31 = r12
            r32 = r6
            r33 = r7
            r22 = r17
            r23 = r9
            X.2La r0 = X.C44072La.A00(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r37, r39, r41, r43, r45, r47)
            return r0
        L_0x0118:
            boolean r6 = r9.A0O
            r16 = r6
            goto L_0x00c2
        L_0x011d:
            X.2p1 r10 = X.C52182p1.NOT_VERIFIED
            goto L_0x00b4
        L_0x0120:
            X.2p1 r10 = r9.A0F
            goto L_0x00b4
        L_0x0123:
            X.2pL r6 = r9.A09
            r17 = r6
            goto L_0x00a2
        L_0x0129:
            X.2oz r14 = X.C52162oz.PRIVATE
            goto L_0x0096
        L_0x012d:
            X.2oz r14 = r9.A0D
            goto L_0x0096
        L_0x0131:
            long r6 = r9.A04
            r18 = r6
            goto L_0x0074
        L_0x0137:
            r22 = r24
            goto L_0x005a
        L_0x013b:
            r4 = 0
            goto L_0x0042
        L_0x013f:
            java.lang.String r0 = r9.A0H
            r20 = r0
            long r4 = r9.A03
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ZJ.A01(X.2La, X.1Uw, X.1ZJ, X.8sP):X.2La");
    }

    public static final C52282pB A02(String str) {
        if (str == null) {
            return null;
        }
        int hashCode = str.hashCode();
        if (hashCode != -1661628965) {
            if (hashCode != -1422950650) {
                if (hashCode != 1602333098 || !str.equals("geosuspended")) {
                    return null;
                }
                return C52282pB.GEOSUSPENDED;
            } else if (str.equals("active")) {
                return C52282pB.NOT_ENFORCED;
            } else {
                return null;
            }
        } else if (str.equals("suspended")) {
            return C52282pB.SUSPENDED;
        } else {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        if (r2 != 0) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        if (r4.A06 == ((int) (r0 / com.google.android.search.verification.client.SearchActionVerificationClientService.MS_TO_NS))) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0059, code lost:
        if (r12.A00 != -1) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        if (r4.A05 == ((int) (r0 / com.google.android.search.verification.client.SearchActionVerificationClientService.MS_TO_NS))) goto L_0x0030;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.C44072La r20, X.C44072La r21, X.C28981Uw r22, X.AnonymousClass3JG r23, X.AnonymousClass3JG r24) {
        /*
            r19 = this;
            r1 = r20
            r9 = 0
            r6 = r19
            X.16D r5 = r6.A00
            r0 = r22
            X.141 r4 = r5.A08(r0)
            if (r4 == 0) goto L_0x006f
            if (r20 != 0) goto L_0x0072
            r1 = r21
            if (r21 != 0) goto L_0x0072
            int r0 = r4.A05
            long r2 = (long) r0
            int r0 = r4.A06
            long r7 = (long) r0
        L_0x001b:
            r11 = r23
            long r0 = r11.A01
            r17 = 1000000(0xf4240, double:4.940656E-318)
            r16 = 1
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L_0x0030
            int r3 = r4.A05
            long r0 = r0 / r17
            int r2 = (int) r0
            r15 = 1
            if (r3 != r2) goto L_0x0031
        L_0x0030:
            r15 = 0
        L_0x0031:
            int r10 = r4.A05
            r13 = -1
            if (r10 <= 0) goto L_0x003e
            long r0 = r11.A00
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            r11 = 1
            if (r2 == 0) goto L_0x003f
        L_0x003e:
            r11 = 0
        L_0x003f:
            r12 = r24
            long r0 = r12.A01
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x004f
            int r3 = r4.A06
            long r0 = r0 / r17
            int r2 = (int) r0
            r7 = 1
            if (r3 != r2) goto L_0x0050
        L_0x004f:
            r7 = 0
        L_0x0050:
            int r3 = r4.A06
            if (r3 <= 0) goto L_0x005b
            long r1 = r12.A00
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L_0x005c
        L_0x005b:
            r1 = 0
        L_0x005c:
            if (r15 == 0) goto L_0x0060
            if (r10 != 0) goto L_0x0064
        L_0x0060:
            if (r7 == 0) goto L_0x0070
            if (r3 == 0) goto L_0x0070
        L_0x0064:
            r0 = 1
        L_0x0065:
            if (r11 != 0) goto L_0x006b
            if (r1 != 0) goto L_0x006b
            r16 = 0
        L_0x006b:
            if (r0 != 0) goto L_0x0077
            if (r16 != 0) goto L_0x008f
        L_0x006f:
            return
        L_0x0070:
            r0 = 0
            goto L_0x0065
        L_0x0072:
            long r2 = r1.A05
            long r7 = r1.A06
            goto L_0x001b
        L_0x0077:
            if (r16 != 0) goto L_0x008f
            r4.A06 = r9
            r4.A05 = r9
        L_0x007d:
            long r0 = java.lang.System.currentTimeMillis()
            r4.A0C = r0
            r5.A0T(r4)
            X.16K r0 = r6.A02
            r0.A03(r4)
            r0.A04(r4)
            return
        L_0x008f:
            r0 = -1
            r4.A06 = r0
            r4.A05 = r0
            goto L_0x007d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ZJ.A05(X.2La, X.2La, X.1Uw, X.3JG, X.3JG):void");
    }
}
