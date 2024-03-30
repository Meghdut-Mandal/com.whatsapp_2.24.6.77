package X;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9dQ  reason: invalid class name and case insensitive filesystem */
public class C198359dQ {
    public ArrayList A01(List list) {
        C193239Ko r6;
        C607239c r20;
        C607239c r21;
        C192099Fr r11;
        byte[] bArr;
        byte[] bArr2;
        ArrayList A0I = AnonymousClass001.A0I();
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C184838t5 r0 = (C184838t5) it.next();
                HashMap A0J = AnonymousClass001.A0J();
                String str = r0.A01;
                Iterator A13 = C90514aH.A13(r0.A00);
                while (A13.hasNext()) {
                    C185068tS r02 = (C185068tS) A13.next();
                    List<C184048ro> list2 = r02.A0R;
                    HashSet A16 = C36441kJ.A16();
                    for (C184048ro r1 : list2) {
                        A16.add(r1.A00);
                    }
                    for (C184048ro r12 : list2) {
                        String str2 = r12.A00;
                        C197849cT r13 = new C197849cT(C188148z7.UNKNOWN, AnonymousClass001.A0I(), AnonymousClass001.A0I());
                        C184078rr r62 = r02.A05;
                        if (r62 != null) {
                            r13 = A00((C173008Qa) C170918Hz.A08(C173008Qa.DEFAULT_INSTANCE, (byte[]) r62.A00));
                        }
                        HashMap A0J2 = AnonymousClass001.A0J();
                        C184388sM r9 = r02.A07;
                        if (r9 != null) {
                            String str3 = r9.A02;
                            if (str3 != null) {
                                A0J2.put("colors_LightBackground", str3);
                            }
                            String str4 = r9.A03;
                            if (str4 != null) {
                                A0J2.put("colors_LightHighlight", str4);
                            }
                            String str5 = r9.A00;
                            if (str5 != null) {
                                A0J2.put("colors_DarkBackground", str5);
                            }
                            String str6 = r9.A01;
                            if (str6 != null) {
                                A0J2.put("colors_DarkHighlight", str6);
                            }
                        }
                        C184078rr r63 = r02.A06;
                        if (r63 != null) {
                            A0J2.put("instance_log_data", new String((byte[]) r63.A00, StandardCharsets.UTF_8));
                        }
                        C184078rr r64 = r02.A04;
                        if (r64 != null) {
                            Iterator A132 = C90514aH.A13(r64.A00);
                            while (A132.hasNext()) {
                                C184228s6 r65 = (C184228s6) A132.next();
                                A0J2.put(r65.A00, r65.A01);
                            }
                        }
                        C592233c r7 = new C592233c(A0J2);
                        C184958tH r92 = r02.A00;
                        if (r92 != null) {
                            C184078rr r66 = (C184078rr) r92.A01;
                            if (r66 != null) {
                                bArr = (byte[]) r66.A00;
                            } else {
                                bArr = null;
                            }
                            C184078rr r67 = (C184078rr) r92.A00;
                            if (r67 != null) {
                                bArr2 = (byte[]) r67.A00;
                            } else {
                                bArr2 = null;
                            }
                            r6 = new C193239Ko(r92.A02, bArr, bArr2);
                        } else {
                            r6 = null;
                        }
                        C184278sB r93 = r02.A02;
                        if (r93 != null) {
                            String str7 = r93.A01;
                            String str8 = r93.A00;
                            if (str8 == null) {
                                str8 = null;
                            }
                            String str9 = r93.A02;
                            if (str9 == null) {
                                str9 = null;
                            }
                            r20 = new C607239c(str7, str8, str9, 0, false);
                        } else {
                            r20 = null;
                        }
                        C184278sB r94 = r02.A03;
                        if (r94 != null) {
                            String str10 = r94.A01;
                            String str11 = r94.A00;
                            if (str11 == null) {
                                str11 = null;
                            }
                            String str12 = r94.A02;
                            if (str12 == null) {
                                str12 = null;
                            }
                            r21 = new C607239c(str10, str11, str12, 0, false);
                        } else {
                            r21 = null;
                        }
                        C184048ro r95 = r02.A01;
                        if (r95 != null) {
                            r11 = new C192099Fr(r95.A00);
                        } else {
                            r11 = null;
                        }
                        C193929Nl r19 = new C193929Nl(r20, r21, (C607239c) null, r11, r6, r02.A0Q, r02.A0P);
                        String str13 = r02.A0G;
                        boolean equals = r02.A0M.equals("true");
                        long longValue = r02.A0D.longValue();
                        long longValue2 = r02.A09.longValue();
                        long longValue3 = r02.A0F.longValue();
                        boolean equals2 = r02.A0I.equals("true");
                        boolean equals3 = r02.A0L.equals("true");
                        int intValue = r02.A0B.intValue();
                        C192119Ft r68 = new C192119Ft(r13);
                        long longValue4 = r02.A0C.longValue();
                        String str14 = r02.A0O;
                        int intValue2 = r02.A08.intValue();
                        Boolean valueOf = Boolean.valueOf(r02.A0J.equals("true"));
                        Integer valueOf2 = Integer.valueOf(r02.A0E.intValue());
                        String str15 = r02.A0K;
                        C592233c r18 = r7;
                        C21642ATi aTi = new C21642ATi(r18, r19, r68, valueOf, valueOf2, Integer.valueOf(r02.A0A.intValue()), str13, "", str14, str15, r02.A0H, A16, intValue, intValue2, longValue, longValue2, longValue3, longValue4, equals, false, equals2, equals3, false, false, false, r02.A0N.equals("true"));
                        List A0I2 = AnonymousClass001.A0I();
                        if (A0J.containsKey(str2)) {
                            A0I2 = (List) A0J.get(str2);
                        }
                        A0I2.add(aTi);
                        A0J.put(str2, A0I2);
                    }
                }
                A0I.add(new C192669Ic(str, A0J));
            }
        } catch (Exception e) {
            C36321k7.A1J(e, "PSANotificationHandler/QpSurface corrupted : ", AnonymousClass000.A0u());
        }
        return A0I;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0022 A[SYNTHETIC, Splitter:B:11:0x0022] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025 A[Catch:{ IllegalArgumentException -> 0x0033 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.C197849cT A00(X.C173008Qa r10) {
        /*
            r9 = this;
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            int r1 = r10.clauseType_
            r0 = 1
            if (r1 == r0) goto L_0x001f
            r0 = 2
            if (r1 == r0) goto L_0x001c
            r0 = 3
            if (r1 != r0) goto L_0x001f
            X.90g r0 = X.AnonymousClass90g.NOR
        L_0x0015:
            java.lang.String r1 = r0.toString()
            if (r1 != 0) goto L_0x0025
            goto L_0x0022
        L_0x001c:
            X.90g r0 = X.AnonymousClass90g.OR
            goto L_0x0015
        L_0x001f:
            X.90g r0 = X.AnonymousClass90g.AND
            goto L_0x0015
        L_0x0022:
            X.8z7 r4 = X.C188148z7.UNKNOWN     // Catch:{ IllegalArgumentException -> 0x0033 }
            goto L_0x0035
        L_0x0025:
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ IllegalArgumentException -> 0x0033 }
            X.AnonymousClass00C.A09(r0)     // Catch:{ IllegalArgumentException -> 0x0033 }
            java.lang.String r0 = X.C165607th.A0v(r0, r1)     // Catch:{ IllegalArgumentException -> 0x0033 }
            X.8z7 r4 = X.C188148z7.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x0033 }
            goto L_0x0035
        L_0x0033:
            X.8z7 r4 = X.C188148z7.UNKNOWN
        L_0x0035:
            X.B6c r0 = r10.filters_
            if (r0 == 0) goto L_0x0076
            java.util.Iterator r8 = r0.iterator()
        L_0x003d:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0076
            java.lang.Object r2 = r8.next()
            X.8R2 r2 = (X.AnonymousClass8R2) r2
            java.lang.String r7 = r2.filterName_
            if (r7 != 0) goto L_0x004f
            java.lang.String r7 = ""
        L_0x004f:
            int r1 = r2.clientNotSupportedConfig_
            r0 = 1
            if (r1 == r0) goto L_0x0073
            r0 = 2
            if (r1 != r0) goto L_0x0073
            X.90S r0 = X.AnonymousClass90S.FAIL_BY_DEFAULT
        L_0x0059:
            int r0 = r0.value
            boolean r3 = X.AnonymousClass000.A1O(r0)
            X.AcX r0 = r2.parameters_
            java.util.Map r2 = java.util.Collections.unmodifiableMap(r0)
            X.9Fq r1 = new X.9Fq
            r1.<init>(r7)
            X.9Kn r0 = new X.9Kn
            r0.<init>(r1, r2, r3)
            r6.add(r0)
            goto L_0x003d
        L_0x0073:
            X.90S r0 = X.AnonymousClass90S.PASS_BY_DEFAULT
            goto L_0x0059
        L_0x0076:
            X.B6c r0 = r10.clauses_
            if (r0 == 0) goto L_0x0092
            java.util.Iterator r1 = r0.iterator()
        L_0x007e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0092
            java.lang.Object r0 = r1.next()
            X.8Qa r0 = (X.C173008Qa) r0
            X.9cT r0 = r9.A00(r0)
            r5.add(r0)
            goto L_0x007e
        L_0x0092:
            X.9cT r0 = new X.9cT
            r0.<init>(r4, r6, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C198359dQ.A00(X.8Qa):X.9cT");
    }
}
