package X;

import java.util.Arrays;
import java.util.LinkedList;

/* renamed from: X.9lz  reason: invalid class name and case insensitive filesystem */
public class C202479lz {
    public final C196239Yg A00;
    public final LinkedList A01;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        if (r2 == '@') goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.C195299Tr A00() {
        /*
            r5 = this;
        L_0x0000:
            X.9Yg r3 = r5.A00
            int r1 = r3.A01
            boolean r0 = r3.A09(r1)
            if (r0 == 0) goto L_0x0027
            java.lang.CharSequence r0 = r3.A02
            char r1 = r0.charAt(r1)
            r0 = 32
            if (r1 == r0) goto L_0x0020
            r0 = 9
            if (r1 == r0) goto L_0x0020
            r0 = 10
            if (r1 == r0) goto L_0x0020
            r0 = 13
            if (r1 != r0) goto L_0x0027
        L_0x0020:
            int r0 = r3.A01
            int r0 = r0 + 1
            r3.A01 = r0
            goto L_0x0000
        L_0x0027:
            java.lang.CharSequence r4 = r3.A02
            int r0 = r3.A01
            char r2 = r4.charAt(r0)
            r0 = 36
            if (r2 == r0) goto L_0x0038
            r1 = 64
            r0 = 0
            if (r2 != r1) goto L_0x0039
        L_0x0038:
            r0 = 1
        L_0x0039:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0099
            int r0 = r3.A01
            char r0 = r4.charAt(r0)
            X.8TP r2 = new X.8TP
            r2.<init>(r0)
            int r1 = r3.A01
            int r0 = r3.A00
            if (r1 >= r0) goto L_0x008b
            int r0 = r1 + 1
            r3.A01 = r0
            char r1 = r4.charAt(r0)
            r0 = 46
            if (r1 == r0) goto L_0x0083
            int r0 = r3.A01
            char r1 = r4.charAt(r0)
            r0 = 91
            if (r1 == r0) goto L_0x0083
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Illegal character at position "
            r1.append(r0)
            int r0 = r3.A01
            r1.append(r0)
            java.lang.String r0 = " expected '.' or '['"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            X.8Sv r0 = X.C173738Sv.A00(r0)
            throw r0
        L_0x0083:
            X.9PT r0 = new X.9PT
            r0.<init>(r2)
            r5.A02(r0)
        L_0x008b:
            java.lang.String r1 = r2.A02
            java.lang.String r0 = "$"
            boolean r1 = r1.equals(r0)
            X.9Tr r0 = new X.9Tr
            r0.<init>(r2, r1)
            return r0
        L_0x0099:
            java.lang.String r0 = "Path must start with '$' or '@'"
            X.8Sv r0 = X.C173738Sv.A00(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202479lz.A00():X.9Tr");
    }

    public static C195299Tr A01(String str, C22902AyE... ayEArr) {
        try {
            C196239Yg r3 = new C196239Yg(str);
            r3.A05();
            CharSequence charSequence = r3.A02;
            if (!(charSequence.charAt(0) == '$' || charSequence.charAt(0) == '@')) {
                r3 = new C196239Yg(AnonymousClass000.A0p("$.", str, AnonymousClass000.A0u()));
                r3.A05();
            }
            if (r3.A02.charAt(r3.A00) != '.') {
                return new C202479lz(r3, new LinkedList(Arrays.asList(ayEArr))).A00();
            }
            throw C173738Sv.A00("Path must not end with a '.' or '..'");
        } catch (Exception e) {
            if (!(e instanceof C173738Sv)) {
                throw new C173738Sv((Throwable) e);
            }
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00dc, code lost:
        if (r1 == '@') goto L_0x00de;
     */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x05d0  */
    /* JADX WARNING: Removed duplicated region for block: B:419:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A02(X.AnonymousClass9PT r26) {
        /*
            r25 = this;
            r9 = r25
            X.9Yg r8 = r9.A00
            java.lang.CharSequence r7 = r8.A02
            int r0 = r8.A01
            char r1 = r7.charAt(r0)
            r0 = 42
            java.lang.String r14 = "Could not parse token starting at position "
            r11 = 1
            r10 = r26
            if (r1 == r0) goto L_0x05fc
            r2 = 46
            if (r1 == r2) goto L_0x05a6
            r6 = 91
            boolean r0 = r8.A07(r6)
            if (r1 == r6) goto L_0x023e
            if (r0 != 0) goto L_0x022f
            r0 = 42
            boolean r0 = r8.A07(r0)
            if (r0 != 0) goto L_0x022f
            r3 = 46
            boolean r0 = r8.A07(r2)
            if (r0 != 0) goto L_0x022f
            r1 = 32
            boolean r0 = r8.A07(r1)
            if (r0 != 0) goto L_0x022f
            int r0 = r8.A01
            r24 = r0
            r2 = r0
        L_0x0040:
            boolean r0 = r8.A09(r2)
            r12 = 40
            if (r0 == 0) goto L_0x01a8
            char r0 = r7.charAt(r2)
            if (r0 == r1) goto L_0x021b
            if (r0 == r3) goto L_0x01a6
            if (r0 == r6) goto L_0x01a6
            if (r0 != r12) goto L_0x01a2
            r5 = r2
            r23 = 1
        L_0x0057:
            if (r5 != 0) goto L_0x005d
            int r0 = r8.A00
            int r5 = r0 + 1
        L_0x005d:
            r4 = 0
            if (r23 == 0) goto L_0x0217
            int r1 = r2 + 1
            r13 = r1
            r14 = 1
        L_0x0064:
            int r0 = r8.A00
            int r0 = r0 + 1
            r3 = 41
            if (r13 >= r0) goto L_0x01fa
            char r0 = r7.charAt(r13)
            if (r0 != r3) goto L_0x0194
            int r14 = r14 + -1
        L_0x0074:
            if (r14 != 0) goto L_0x019e
            boolean r0 = r8.A09(r1)
            if (r0 == 0) goto L_0x01f6
            char r0 = r7.charAt(r1)
            if (r0 == r3) goto L_0x0611
            int r0 = r5 + 1
            r8.A01 = r0
            r0 = r24
            java.lang.String r22 = X.C165607th.A0t(r7, r0, r5)
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.lang.StringBuilder r13 = X.AnonymousClass000.A0u()
            r21 = 0
            r2 = 1
            r20 = 0
            r19 = 0
            r18 = 0
            r17 = 0
            r16 = 0
        L_0x00a1:
            int r1 = r8.A01
            boolean r0 = r8.A09(r1)
            if (r0 == 0) goto L_0x01d5
            if (r21 != 0) goto L_0x01d5
            char r1 = r7.charAt(r1)
            int r0 = r8.A01
            int r0 = r0 + 1
            r8.A01 = r0
            r14 = 34
            if (r19 != 0) goto L_0x00eb
            r0 = 32
            if (r1 == r0) goto L_0x00a1
            r0 = 9
            if (r1 == r0) goto L_0x00a1
            r0 = 10
            if (r1 == r0) goto L_0x00a1
            r0 = 13
            if (r1 == r0) goto L_0x00a1
            r0 = 123(0x7b, float:1.72E-43)
            if (r1 == r0) goto L_0x0190
            boolean r0 = java.lang.Character.isDigit(r1)
            if (r0 != 0) goto L_0x0190
            if (r14 == r1) goto L_0x0190
            r0 = 36
            if (r1 == r0) goto L_0x00de
            r15 = 0
            r0 = 64
            if (r1 != r0) goto L_0x00df
        L_0x00de:
            r15 = 1
        L_0x00df:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r15)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00eb
            java.lang.Integer r19 = X.C023109s.A01
        L_0x00eb:
            if (r1 == r14) goto L_0x0170
            r0 = 44
            if (r1 == r0) goto L_0x010e
            if (r1 == r6) goto L_0x016d
            r0 = 93
            if (r1 == r0) goto L_0x0168
            r0 = 123(0x7b, float:1.72E-43)
            if (r1 == r0) goto L_0x0165
            r0 = 125(0x7d, float:1.75E-43)
            if (r1 == r0) goto L_0x0160
            if (r1 == r12) goto L_0x017e
            if (r1 != r3) goto L_0x0180
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x010b
            r0 = r16
            if (r0 != r12) goto L_0x010e
        L_0x010b:
            r13.append(r1)
        L_0x010e:
            if (r17 != 0) goto L_0x0180
            if (r20 != 0) goto L_0x0180
            if (r18 != 0) goto L_0x0180
            if (r2 != 0) goto L_0x015b
            if (r3 != r1) goto L_0x0180
            r21 = 1
        L_0x011a:
            if (r19 == 0) goto L_0x014d
            int r14 = r19.intValue()
            r0 = 0
            if (r14 == r0) goto L_0x0151
            if (r14 != r11) goto L_0x0143
            java.util.LinkedList r15 = X.C90524aI.A0l()
            java.lang.String r14 = r13.toString()
            X.9Yg r0 = new X.9Yg
            r0.<init>(r14)
            X.9lz r14 = new X.9lz
            r14.<init>(r0, r15)
            X.9Tr r0 = r14.A00()
            X.9kp r14 = new X.9kp
            r14.<init>((X.C195299Tr) r0)
        L_0x0140:
            r4.add(r14)
        L_0x0143:
            int r14 = r13.length()
            r0 = 0
            r13.delete(r0, r14)
            r19 = 0
        L_0x014d:
            r16 = r1
            goto L_0x00a1
        L_0x0151:
            java.lang.String r0 = r13.toString()
            X.9kp r14 = new X.9kp
            r14.<init>((java.lang.String) r0)
            goto L_0x0140
        L_0x015b:
            if (r11 != r2) goto L_0x0180
            r21 = 0
            goto L_0x011a
        L_0x0160:
            if (r20 == 0) goto L_0x01ad
            int r20 = r20 + -1
            goto L_0x0180
        L_0x0165:
            int r20 = r20 + 1
            goto L_0x0180
        L_0x0168:
            if (r18 == 0) goto L_0x01c1
            int r18 = r18 + -1
            goto L_0x0180
        L_0x016d:
            int r18 = r18 + 1
            goto L_0x0180
        L_0x0170:
            r14 = 92
            r0 = r16
            if (r0 == r14) goto L_0x017b
            if (r17 <= 0) goto L_0x017b
            int r17 = r17 + -1
            goto L_0x0180
        L_0x017b:
            int r17 = r17 + 1
            goto L_0x0180
        L_0x017e:
            int r2 = r2 + 1
        L_0x0180:
            if (r19 == 0) goto L_0x014d
            r0 = 44
            if (r1 != r0) goto L_0x018c
            if (r20 != 0) goto L_0x018c
            if (r18 != 0) goto L_0x018c
            if (r11 == r2) goto L_0x014d
        L_0x018c:
            r13.append(r1)
            goto L_0x014d
        L_0x0190:
            java.lang.Integer r19 = X.C023109s.A00
            goto L_0x00eb
        L_0x0194:
            char r0 = r7.charAt(r13)
            if (r0 != r12) goto L_0x019e
            int r14 = r14 + 1
            goto L_0x0074
        L_0x019e:
            int r13 = r13 + 1
            goto L_0x0064
        L_0x01a2:
            int r2 = r2 + 1
            goto L_0x0040
        L_0x01a6:
            r5 = r2
            goto L_0x01a9
        L_0x01a8:
            r5 = 0
        L_0x01a9:
            r23 = 0
            goto L_0x0057
        L_0x01ad:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unexpected close brace '}' at character position: "
            r1.append(r0)
            int r0 = r8.A01
            java.lang.String r0 = X.C36381kD.A10(r1, r0)
            X.8Sv r0 = X.C173738Sv.A00(r0)
            throw r0
        L_0x01c1:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unexpected close bracket ']' at character position: "
            r1.append(r0)
            int r0 = r8.A01
            java.lang.String r0 = X.C36381kD.A10(r1, r0)
            X.8Sv r0 = X.C173738Sv.A00(r0)
            throw r0
        L_0x01d5:
            if (r20 != 0) goto L_0x01dd
            if (r2 != 0) goto L_0x01dd
            if (r18 != 0) goto L_0x01dd
            goto L_0x0613
        L_0x01dd:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Arguments to function: '"
            r1.append(r0)
            r0 = r22
            r1.append(r0)
            java.lang.String r0 = "' are not closed properly."
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            X.8Sv r0 = X.C173738Sv.A00(r0)
            throw r0
        L_0x01f6:
            r8.A01 = r2
            goto L_0x0613
        L_0x01fa:
            r0 = r24
            java.lang.String r2 = X.C165607th.A0t(r7, r0, r5)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Arguments to function: '"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "' are not closed properly."
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            X.8Sv r0 = X.C173738Sv.A00(r0)
            throw r0
        L_0x0217:
            r8.A01 = r5
            goto L_0x0613
        L_0x021b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Use bracket notion ['my prop'] if your property contains blank characters. position: "
            r1.append(r0)
            int r0 = r8.A01
            java.lang.String r0 = X.C36381kD.A10(r1, r0)
            X.8Sv r0 = X.C173738Sv.A00(r0)
            throw r0
        L_0x022f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r14)
            int r0 = r8.A01
            java.lang.String r0 = X.C36381kD.A10(r1, r0)
            X.8Sv r0 = X.C173738Sv.A00(r0)
            throw r0
        L_0x023e:
            if (r0 == 0) goto L_0x024e
            int r0 = r8.A01
            char r2 = r8.A00(r0)
            r0 = 39
            if (r2 == r0) goto L_0x0502
            r0 = 34
            if (r2 == r0) goto L_0x0502
        L_0x024e:
            boolean r0 = r8.A07(r6)
            r12 = 0
            if (r0 == 0) goto L_0x0269
            int r0 = r8.A01
            char r1 = r8.A00(r0)
            boolean r0 = java.lang.Character.isDigit(r1)
            r13 = 58
            r4 = 45
            if (r0 != 0) goto L_0x0337
            if (r1 == r4) goto L_0x0337
            if (r1 == r13) goto L_0x0337
        L_0x0269:
            boolean r0 = r9.A03(r10)
            if (r0 != 0) goto L_0x0629
            boolean r0 = r8.A07(r6)
            if (r0 != 0) goto L_0x0303
            r1 = 63
            int r0 = r8.A01
            boolean r0 = r8.A08(r1, r0)
            if (r0 != 0) goto L_0x0303
        L_0x027f:
            boolean r0 = r8.A07(r6)
            if (r0 == 0) goto L_0x029c
            r1 = 63
            int r0 = r8.A01
            int r0 = r8.A02(r1, r0)
            r3 = -1
            if (r0 == r3) goto L_0x029c
            char r1 = r8.A00(r0)
            r2 = 93
            if (r1 == r2) goto L_0x02b0
            r0 = 44
            if (r1 == r0) goto L_0x02b0
        L_0x029c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r14)
            int r0 = r8.A01
            r1.append(r0)
            java.lang.String r0 = ". Expected ?, ', 0-9, * "
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            X.8Sv r0 = X.C173738Sv.A00(r0)
            throw r0
        L_0x02b0:
            int r0 = r8.A01
            int r1 = r0 + 1
            r5 = r1
        L_0x02b5:
            boolean r0 = r8.A09(r5)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x029c
            char r0 = r7.charAt(r5)
            if (r0 != r2) goto L_0x0300
            if (r5 == r3) goto L_0x029c
            java.lang.String r2 = X.C165607th.A0t(r7, r1, r5)
            java.lang.String r0 = ","
            java.lang.String[] r11 = r2.split(r0)
            java.util.LinkedList r7 = r9.A01
            int r0 = r7.size()
            int r6 = r11.length
            if (r0 < r6) goto L_0x039d
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            r3 = 0
        L_0x02dd:
            if (r3 >= r6) goto L_0x0393
            r0 = r11[r3]
            if (r0 == 0) goto L_0x02fc
            java.lang.String r2 = r0.trim()
            if (r2 == 0) goto L_0x02fd
            r1 = r2
        L_0x02ea:
            java.lang.String r0 = "?"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0384
            java.lang.Object r0 = r7.pop()
            r4.add(r0)
            int r3 = r3 + 1
            goto L_0x02dd
        L_0x02fc:
            r2 = 0
        L_0x02fd:
            java.lang.String r1 = ""
            goto L_0x02ea
        L_0x0300:
            int r5 = r5 + 1
            goto L_0x02b5
        L_0x0303:
            int r4 = r8.A01
            r0 = 63
            int r0 = r8.A02(r0, r4)
            r3 = -1
            if (r0 == r3) goto L_0x027f
            r2 = 40
            int r1 = r8.A02(r2, r0)
            if (r1 == r3) goto L_0x027f
            r0 = 41
            int r2 = r8.A01(r2, r0, r1, r11)
            if (r2 == r3) goto L_0x027f
            r1 = 93
            boolean r0 = r8.A08(r1, r2)
            if (r0 == 0) goto L_0x027f
            int r0 = r8.A02(r1, r2)
            int r3 = r0 + 1
            java.lang.String r0 = X.C165607th.A0t(r7, r4, r3)
            X.9ly r4 = new X.9ly
            r4.<init>(r0)
            goto L_0x03b9
        L_0x0337:
            int r0 = r8.A01
            int r2 = r0 + 1
            r5 = r2
            r1 = 93
        L_0x033e:
            boolean r0 = r8.A09(r5)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0269
            char r0 = r7.charAt(r5)
            if (r0 != r1) goto L_0x0381
            r0 = -1
            if (r5 == r0) goto L_0x0269
            java.lang.String r0 = X.C165607th.A0t(r7, r2, r5)
            java.lang.String r2 = r0.trim()
            java.lang.String r0 = "*"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0269
            r1 = 0
        L_0x0360:
            int r3 = r2.length()
            if (r1 >= r3) goto L_0x0425
            char r3 = r2.charAt(r1)
            boolean r0 = java.lang.Character.isDigit(r3)
            if (r0 != 0) goto L_0x037e
            r0 = 44
            if (r3 == r0) goto L_0x037e
            if (r3 == r4) goto L_0x037e
            if (r3 == r13) goto L_0x037e
            r0 = 32
            if (r3 == r0) goto L_0x037e
            goto L_0x0269
        L_0x037e:
            int r1 = r1 + 1
            goto L_0x0360
        L_0x0381:
            int r5 = r5 + 1
            goto L_0x033e
        L_0x0384:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Expected '?' but found "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r2, r1)
            X.8Sv r0 = X.C173738Sv.A00(r0)
            throw r0
        L_0x0393:
            X.8TQ r0 = new X.8TQ
            r0.<init>((java.util.Collection) r4)
            r10.A00(r0)
            goto L_0x04fc
        L_0x039d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Not enough predicates supplied for filter ["
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "] at position "
            r1.append(r0)
            int r0 = r8.A01
            java.lang.String r0 = X.C36381kD.A10(r1, r0)
            X.8Sv r0 = X.C173738Sv.A00(r0)
            throw r0
        L_0x03b9:
            X.A7o r2 = X.C202469ly.A01(r4)     // Catch:{ 8Sv -> 0x0423, Exception -> 0x03f7 }
            X.9Yg r6 = r4.A00     // Catch:{ 8Sv -> 0x0423, Exception -> 0x03f7 }
            r6.A04()     // Catch:{ 8Sv -> 0x0423, Exception -> 0x03f7 }
            int r5 = r6.A01     // Catch:{ 8Sv -> 0x0423, Exception -> 0x03f7 }
            boolean r0 = r6.A09(r5)     // Catch:{ 8Sv -> 0x0423, Exception -> 0x03f7 }
            if (r0 != 0) goto L_0x03de
            X.A7p r1 = new X.A7p
            r1.<init>(r2)
            X.8TQ r0 = new X.8TQ
            r0.<init>((X.C22902AyE) r1)
            r10.A00(r0)
            r8.A01 = r3
            int r0 = r8.A00
            if (r3 < r0) goto L_0x0636
            return
        L_0x03de:
            java.lang.String r3 = "Expected end of filter expression instead of: %s"
            java.lang.Object[] r2 = new java.lang.Object[r11]     // Catch:{ 8Sv -> 0x0423, Exception -> 0x03f7 }
            int r0 = r6.A00     // Catch:{ 8Sv -> 0x0423, Exception -> 0x03f7 }
            int r1 = r0 + 1
            java.lang.CharSequence r0 = r6.A02     // Catch:{ 8Sv -> 0x0423, Exception -> 0x03f7 }
            java.lang.CharSequence r0 = r0.subSequence(r5, r1)     // Catch:{ 8Sv -> 0x0423, Exception -> 0x03f7 }
            r2[r12] = r0     // Catch:{ 8Sv -> 0x0423, Exception -> 0x03f7 }
            java.lang.String r0 = java.lang.String.format(r3, r2)     // Catch:{ 8Sv -> 0x0423, Exception -> 0x03f7 }
            X.8Sv r0 = X.C173738Sv.A00(r0)     // Catch:{ 8Sv -> 0x0423, Exception -> 0x03f7 }
            throw r0     // Catch:{ 8Sv -> 0x0423, Exception -> 0x03f7 }
        L_0x03f7:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Failed to parse filter: "
            r3.append(r0)
            X.9Yg r2 = r4.A00
            r3.append(r2)
            java.lang.String r0 = ", error on position: "
            r3.append(r0)
            int r1 = r2.A01
            r3.append(r1)
            java.lang.String r0 = ", char: "
            r3.append(r0)
            java.lang.CharSequence r0 = r2.A02
            char r0 = r0.charAt(r1)
            java.lang.String r0 = X.AnonymousClass000.A0t(r3, r0)
            X.8Sv r0 = X.C173738Sv.A00(r0)
            throw r0
        L_0x0423:
            r0 = move-exception
            throw r0
        L_0x0425:
            java.lang.String r14 = ":"
            boolean r0 = r2.contains(r14)
            r6 = 0
            if (r0 == 0) goto L_0x049c
        L_0x042e:
            java.lang.String r7 = "Failed to parse SliceOperation: "
            if (r6 >= r3) goto L_0x044c
            char r1 = r2.charAt(r6)
            boolean r0 = java.lang.Character.isDigit(r1)
            if (r0 != 0) goto L_0x0449
            if (r1 == r4) goto L_0x0449
            if (r1 == r13) goto L_0x0449
            java.lang.String r0 = X.C36321k7.A0D(r7, r2)
            X.8Sv r0 = X.C173738Sv.A00(r0)
            throw r0
        L_0x0449:
            int r6 = r6 + 1
            goto L_0x042e
        L_0x044c:
            java.lang.String[] r14 = r2.split(r14)
            int r13 = r14.length
            r4 = 0
            if (r13 <= r12) goto L_0x0493
            r1 = r14[r12]
            java.lang.String r6 = ""
            boolean r0 = r1.equals(r6)
            if (r0 == 0) goto L_0x048a
            r3 = r4
        L_0x045f:
            if (r13 <= r11) goto L_0x0471
            r1 = r14[r11]
            boolean r0 = r1.equals(r6)
            if (r0 != 0) goto L_0x0471
            int r0 = java.lang.Integer.parseInt(r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L_0x0471:
            if (r3 == 0) goto L_0x0485
            if (r4 != 0) goto L_0x0482
            java.lang.Integer r1 = X.C023109s.A00
        L_0x0477:
            X.9RL r0 = new X.9RL
            r0.<init>(r3, r4, r1)
            X.8TK r1 = new X.8TK
            r1.<init>(r0)
            goto L_0x04f9
        L_0x0482:
            java.lang.Integer r1 = X.C023109s.A0C
            goto L_0x0477
        L_0x0485:
            if (r4 == 0) goto L_0x0493
            java.lang.Integer r1 = X.C023109s.A01
            goto L_0x0477
        L_0x048a:
            int r0 = java.lang.Integer.parseInt(r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            goto L_0x045f
        L_0x0493:
            java.lang.String r0 = X.C36321k7.A0D(r7, r2)
            X.8Sv r0 = X.C173738Sv.A00(r0)
            throw r0
        L_0x049c:
            if (r12 >= r3) goto L_0x04c4
            char r1 = r2.charAt(r12)
            boolean r0 = java.lang.Character.isDigit(r1)
            if (r0 != 0) goto L_0x04c1
            r0 = 44
            if (r1 == r0) goto L_0x04c1
            r0 = 32
            if (r1 == r0) goto L_0x04c1
            if (r1 == r4) goto L_0x04c1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Failed to parse ArrayIndexOperation: "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r2, r1)
            X.8Sv r0 = X.C173738Sv.A00(r0)
            throw r0
        L_0x04c1:
            int r12 = r12 + 1
            goto L_0x049c
        L_0x04c4:
            java.util.regex.Pattern r1 = X.C198569dn.A01
            r0 = -1
            java.lang.String[] r4 = r1.split(r2, r0)
            int r2 = r4.length
            java.util.ArrayList r1 = X.C36441kJ.A14(r2)
        L_0x04d0:
            if (r6 >= r2) goto L_0x04ef
            r3 = r4[r6]
            int r0 = java.lang.Integer.parseInt(r3)     // Catch:{ Exception -> 0x04de }
            X.AnonymousClass000.A1F(r1, r0)     // Catch:{ Exception -> 0x04de }
            int r6 = r6 + 1
            goto L_0x04d0
        L_0x04de:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Failed to parse token in ArrayIndexOperation: "
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r3, r1)
            X.8Sv r0 = new X.8Sv
            r0.<init>(r1, r2)
            throw r0
        L_0x04ef:
            X.9dn r0 = new X.9dn
            r0.<init>(r1)
            X.8TJ r1 = new X.8TJ
            r1.<init>(r0)
        L_0x04f9:
            r10.A00(r1)
        L_0x04fc:
            int r1 = r5 + 1
            r8.A01 = r1
            goto L_0x0625
        L_0x0502:
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            int r0 = r8.A01
            int r5 = r0 + 1
            r11 = r5
            r15 = 0
            r14 = 0
            r13 = 0
            r12 = 0
        L_0x050f:
            boolean r0 = r8.A09(r5)
            r6 = 93
            if (r0 == 0) goto L_0x0581
            char r3 = r7.charAt(r5)
            if (r15 == 0) goto L_0x0521
            r15 = 0
        L_0x051e:
            int r5 = r5 + 1
            goto L_0x050f
        L_0x0521:
            r0 = 92
            if (r0 != r3) goto L_0x0527
            r15 = 1
            goto L_0x051e
        L_0x0527:
            java.lang.String r0 = "Found empty property at index "
            if (r3 != r6) goto L_0x053c
            if (r14 != 0) goto L_0x051e
            if (r13 == 0) goto L_0x0595
            java.lang.StringBuilder r0 = X.C90464aC.A0h(r5, r0)
            java.lang.String r0 = r0.toString()
            X.8Sv r0 = X.C173738Sv.A00(r0)
            throw r0
        L_0x053c:
            r1 = 44
            if (r3 != r2) goto L_0x056c
            if (r14 == 0) goto L_0x0567
            char r0 = r8.A00(r5)
            if (r0 == r6) goto L_0x0559
            if (r0 == r1) goto L_0x0559
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Property must be separated by comma or Property must be terminated close square bracket at index "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r5)
            X.8Sv r0 = X.C173738Sv.A00(r0)
            throw r0
        L_0x0559:
            java.lang.String r0 = X.C165607th.A0t(r7, r11, r5)
            java.lang.String r0 = X.C201749kK.A01(r0)
            r4.add(r0)
            r12 = r5
            r14 = 0
            goto L_0x051e
        L_0x0567:
            int r11 = r5 + 1
            r14 = 1
            r13 = 0
            goto L_0x051e
        L_0x056c:
            if (r3 != r1) goto L_0x051e
            if (r14 != 0) goto L_0x051e
            if (r13 == 0) goto L_0x057f
            java.lang.StringBuilder r0 = X.C90464aC.A0h(r5, r0)
            java.lang.String r0 = r0.toString()
            X.8Sv r0 = X.C173738Sv.A00(r0)
            throw r0
        L_0x057f:
            r13 = 1
            goto L_0x051e
        L_0x0581:
            if (r14 == 0) goto L_0x0595
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Property has not been closed - missing closing "
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass000.A0t(r1, r2)
            X.8Sv r0 = X.C173738Sv.A00(r0)
            throw r0
        L_0x0595:
            int r0 = r8.A02(r6, r12)
            int r0 = r0 + 1
            r8.A01 = r0
            X.8TN r0 = new X.8TN
            r0.<init>(r4, r2)
            r10.A00(r0)
            goto L_0x0623
        L_0x05a6:
            boolean r0 = r8.A07(r2)
            if (r0 == 0) goto L_0x05e9
            int r0 = r8.A01
            int r1 = r0 + 1
            boolean r0 = r8.A09(r1)
            if (r0 == 0) goto L_0x05e9
            char r0 = r7.charAt(r1)
            if (r0 != r2) goto L_0x05e9
            X.8TR r0 = new X.8TR
            r0.<init>()
            r10.A00(r0)
            r1 = 2
        L_0x05c5:
            int r0 = r8.A01
            int r0 = r0 + r1
            r8.A01 = r0
            boolean r0 = r8.A07(r2)
            if (r0 == 0) goto L_0x0636
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Character '.' on position "
            r1.append(r0)
            int r0 = r8.A01
            r1.append(r0)
            java.lang.String r0 = " is not valid."
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            X.8Sv r0 = X.C173738Sv.A00(r0)
            throw r0
        L_0x05e9:
            int r0 = r8.A01
            int r0 = r0 + 1
            boolean r0 = r8.A09(r0)
            if (r0 == 0) goto L_0x05f5
            r1 = 1
            goto L_0x05c5
        L_0x05f5:
            java.lang.String r0 = "Path must not end with a '."
            X.8Sv r0 = X.C173738Sv.A00(r0)
            throw r0
        L_0x05fc:
            boolean r0 = r9.A03(r10)
            if (r0 != 0) goto L_0x0629
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r14)
            int r0 = r8.A01
            java.lang.String r0 = X.C36381kD.A10(r1, r0)
            X.8Sv r0 = X.C173738Sv.A00(r0)
            throw r0
        L_0x0611:
            r8.A01 = r1
        L_0x0613:
            r0 = r24
            java.lang.String r0 = X.C165607th.A0t(r7, r0, r5)
            if (r23 == 0) goto L_0x062a
            X.8TO r2 = new X.8TO
            r2.<init>(r0, r4)
        L_0x0620:
            r10.A00(r2)
        L_0x0623:
            int r1 = r8.A01
        L_0x0625:
            int r0 = r8.A00
            if (r1 < r0) goto L_0x0636
        L_0x0629:
            return
        L_0x062a:
            r1 = 39
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.8TN r2 = new X.8TN
            r2.<init>(r0, r1)
            goto L_0x0620
        L_0x0636:
            r9.A02(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202479lz.A02(X.9PT):void");
    }

    private boolean A03(AnonymousClass9PT r6) {
        C196239Yg r3 = this.A00;
        boolean A07 = r3.A07('[');
        if (A07 && !r3.A08('*', r3.A01)) {
            return false;
        }
        if (!r3.A07('*') && (!r3.A09(r3.A01 + 1))) {
            return false;
        }
        int i = r3.A01;
        if (A07) {
            int A02 = r3.A02('*', i);
            if (r3.A08(']', A02)) {
                i = r3.A02(']', A02);
            } else {
                throw C173738Sv.A00(AnonymousClass000.A0r("Expected wildcard token to end with ']' on position ", AnonymousClass000.A0u(), A02 + 1));
            }
        }
        int i2 = i + 1;
        r3.A01 = i2;
        r6.A00(new AnonymousClass8TM());
        if (i2 >= r3.A00) {
            return true;
        }
        A02(r6);
        return true;
    }

    public C202479lz(C196239Yg r1, LinkedList linkedList) {
        this.A01 = linkedList;
        this.A00 = r1;
    }
}
