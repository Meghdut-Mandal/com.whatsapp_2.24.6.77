package X;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.9i5  reason: invalid class name and case insensitive filesystem */
public abstract class C200709i5 {
    public static final Pattern A00 = Pattern.compile("\r?\n");
    public static final Pattern A01 = Pattern.compile("(?<=\nEND:VCARD)\\s*\r?\n", 2);

    public static List A00(String str) {
        List asList = Arrays.asList(A01.split(str, 258));
        int i = 1;
        if (asList.size() <= 0 || !C36401kF.A0s(asList, C36421kH.A06(asList, 1)).isEmpty()) {
            i = 0;
        }
        int min = Math.min(asList.size(), 257) - i;
        if (min < asList.size()) {
            return asList.subList(0, min);
        }
        return asList;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:136|(1:138)|142|143) */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02f7, code lost:
        r3[1] = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x03f0, code lost:
        if (r1 != ',') goto L_0x0407;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x045d, code lost:
        if (r0 != false) goto L_0x0596;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x045f, code lost:
        r2 = java.lang.System.currentTimeMillis();
        r9.A04.A02.add(r9.A03);
        r8.A00 += X.C36441kJ.A0A(r2);
        r2 = java.lang.System.currentTimeMillis();
        r9.A03 = new X.AnonymousClass3KL();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x04e6, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0578, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x073f, code lost:
        throw new X.AnonymousClass1YJ(X.AnonymousClass000.A0q("\" came)", r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0177, code lost:
        r0 = r10.substring(r12, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x017f, code lost:
        if (r0.equalsIgnoreCase("END") != false) goto L_0x0421;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0181, code lost:
        r3[0] = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01ae, code lost:
        if (r14 >= (r11 - 1)) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b0, code lost:
        r3[1] = X.C165607th.A0o(r14, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01c8, code lost:
        r3[1] = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0221, code lost:
        if (r24 != false) goto L_0x0223;
     */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x03a0  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x03a8  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x051d  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x054e A[Catch:{ OutOfMemoryError -> 0x0579 }] */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x0569 A[Catch:{ OutOfMemoryError -> 0x0579 }] */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0592 A[LOOP:3: B:37:0x00e4->B:293:0x0592, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x045d A[EDGE_INSN: B:386:0x045d->B:229:0x045d ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(java.util.List r26, X.AnonymousClass9UV r27) {
        /*
            r3 = r26
            int r1 = r3.size()
            r0 = 5
            int r5 = java.lang.Math.min(r0, r1)
            r4 = 0
        L_0x000c:
            java.lang.String r2 = "vcard2.1"
            if (r4 >= r5) goto L_0x06cb
            java.lang.String r1 = X.C36401kF.A0s(r3, r4)
            java.lang.String r0 = "VERSION:"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x06c7
            java.lang.String r0 = "2.1"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x06cb
            java.lang.String r0 = "3.0"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x06c7
            java.lang.String r0 = "vcard3.0"
        L_0x002e:
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x06c0
            X.9lU r8 = new X.9lU
            r8.<init>()
        L_0x0039:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0600
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
        L_0x0043:
            X.Aak r1 = new X.Aak
            r1.<init>(r6)
            X.Aaj r0 = new X.Aaj
            r0.<init>(r1)
            r8.A0H = r0
            r0 = r27
            r8.A0G = r0
            long r16 = java.lang.System.currentTimeMillis()
        L_0x0057:
            r7 = 1
            r6 = 0
        L_0x0059:
            java.lang.String r2 = r8.A01()
            if (r2 != 0) goto L_0x0069
            long r2 = r8.A0B
            long r0 = X.C36441kJ.A0A(r16)
            long r2 = r2 + r0
            r8.A0B = r2
            return
        L_0x0069:
            java.lang.String r0 = r2.trim()
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0059
            java.lang.String r5 = ":"
            r1 = 2
            java.lang.String[] r3 = r2.split(r5, r1)
            int r0 = r3.length
            if (r0 != r1) goto L_0x0728
            r0 = r3[r6]
            java.lang.String r1 = r0.trim()
            java.lang.String r22 = "BEGIN"
            r0 = r22
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0728
            r0 = r3[r7]
            java.lang.String r0 = r0.trim()
            java.lang.String r4 = "VCARD"
            boolean r0 = r0.equalsIgnoreCase(r4)
            if (r0 == 0) goto L_0x0728
            X.9UV r9 = r8.A0G
            if (r9 == 0) goto L_0x00c8
            long r2 = java.lang.System.currentTimeMillis()
            X.37f r0 = new X.37f
            r0.<init>()
            r0.A00 = r7
            r0.A01 = r4
            java.util.List r1 = r9.A02
            r1.add(r0)
            int r0 = X.C36421kH.A06(r1, r7)
            r9.A00 = r0
            java.lang.Object r0 = r1.get(r0)
            X.37f r0 = (X.C602837f) r0
            r9.A04 = r0
            long r0 = r8.A0A
            long r2 = X.C36441kJ.A0A(r2)
            long r0 = r0 + r2
            r8.A0A = r0
        L_0x00c8:
            long r18 = java.lang.System.currentTimeMillis()
            X.9UV r1 = r8.A0G
            if (r1 == 0) goto L_0x00e4
            long r2 = java.lang.System.currentTimeMillis()
            X.3KL r0 = new X.3KL
            r0.<init>()
            r1.A03 = r0
        L_0x00db:
            long r0 = r8.A09
            long r2 = X.C36441kJ.A0A(r2)
            long r0 = r0 + r2
            r8.A09 = r0
        L_0x00e4:
            java.lang.String r26 = "8BIT"
            r0 = r26
            r8.A0C = r0
            java.lang.String r10 = r8.A02()
            long r20 = java.lang.System.currentTimeMillis()
            int r11 = r10.length()
            r9 = 2
            java.lang.String[] r3 = new java.lang.String[r9]
            java.lang.String r0 = "item"
            boolean r0 = r10.startsWith(r0)
            java.lang.String r25 = ""
            r2 = 0
            r24 = 0
            if (r0 == 0) goto L_0x0156
            java.lang.String[] r1 = r10.split(r5)
            int r0 = r1.length
            r27 = r0
            if (r0 < r9) goto L_0x0423
            r14 = r1[r6]
            java.lang.StringBuilder r13 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "."
            int r0 = r14.indexOf(r0)
            int r12 = r0 + 1
            r23 = 64
        L_0x011f:
            int r0 = r14.length()
            if (r12 >= r0) goto L_0x01cb
            char r15 = r14.charAt(r12)
            r0 = 65
            if (r15 < r0) goto L_0x013f
            char r15 = r14.charAt(r12)
            r0 = 90
            if (r15 > r0) goto L_0x013f
            X.C90514aH.A1R(r14, r13, r12)
            char r23 = r14.charAt(r12)
        L_0x013c:
            int r12 = r12 + 1
            goto L_0x011f
        L_0x013f:
            char r15 = r14.charAt(r12)
            r0 = 45
            if (r15 != r0) goto L_0x01cb
            r0 = 88
            r15 = r0
            r0 = r23
            if (r0 != r15) goto L_0x01cb
            char r0 = r14.charAt(r12)
            r13.append(r0)
            goto L_0x013c
        L_0x0156:
            r14 = 0
            r13 = 0
            r12 = 0
        L_0x0159:
            if (r14 >= r11) goto L_0x0710
            char r9 = r10.charAt(r14)
            r2 = 59
            r15 = 58
            if (r13 == 0) goto L_0x0173
            r0 = 34
            if (r13 == r7) goto L_0x016f
            if (r9 != r0) goto L_0x016c
        L_0x016b:
            r13 = 1
        L_0x016c:
            int r14 = r14 + 1
            goto L_0x0159
        L_0x016f:
            if (r9 != r0) goto L_0x0198
            r13 = 2
            goto L_0x016c
        L_0x0173:
            java.lang.String r1 = "END"
            if (r9 != r15) goto L_0x0184
            java.lang.String r0 = r10.substring(r12, r14)
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 != 0) goto L_0x0421
            r3[r6] = r0
            goto L_0x01ad
        L_0x0184:
            r0 = 46
            if (r9 != r0) goto L_0x01b7
            java.lang.String r1 = r10.substring(r12, r14)
            X.9UV r0 = r8.A0G
            if (r0 == 0) goto L_0x01a1
            X.3KL r0 = r0.A03
            java.util.Set r0 = r0.A05
            r0.add(r1)
            goto L_0x01a1
        L_0x0198:
            if (r9 != r2) goto L_0x01a4
            java.lang.String r0 = r10.substring(r12, r14)
            r8.A04(r0)
        L_0x01a1:
            int r12 = r14 + 1
            goto L_0x016c
        L_0x01a4:
            if (r9 != r15) goto L_0x016c
            java.lang.String r0 = r10.substring(r12, r14)
            r8.A04(r0)
        L_0x01ad:
            int r11 = r11 - r7
            if (r14 >= r11) goto L_0x01c8
            java.lang.String r0 = X.C165607th.A0o(r14, r10)
            r3[r7] = r0
            goto L_0x0234
        L_0x01b7:
            if (r9 != r2) goto L_0x016c
            java.lang.String r0 = r10.substring(r12, r14)
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 != 0) goto L_0x0421
            r3[r6] = r0
            int r12 = r14 + 1
            goto L_0x016b
        L_0x01c8:
            r3[r7] = r25
            goto L_0x0234
        L_0x01cb:
            X.C90514aH.A1Q(r13, r3, r6)
            r13 = r1[r7]
            java.lang.String r12 = "(\r\n|\r|\n|\n\r)"
            r0 = r25
            java.lang.String r0 = r13.replaceAll(r12, r0)
            r3[r7] = r0
            r12 = r3[r6]
            java.lang.String r0 = "ADR"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x027c
            java.lang.String r0 = "type"
            boolean r0 = r10.contains(r0)
            if (r0 == 0) goto L_0x0279
            java.lang.String r0 = "="
            int r0 = r10.indexOf(r0)
            int r1 = r0 + 1
            int r0 = r10.indexOf(r5)
            java.lang.String r0 = r10.substring(r1, r0)
            r8.A05(r0)
        L_0x01ff:
            java.lang.String r0 = "X-ABADR"
            java.lang.String r9 = X.C202299lU.A00(r10, r0, r8)
            if (r9 == 0) goto L_0x0221
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            X.C165617ti.A0g(r1, r3, r7)
            java.lang.String r0 = ";"
            r1.append(r0)
            int r0 = r9.lastIndexOf(r5)
            java.lang.String r0 = X.C165607th.A0o(r0, r9)
            r1.append(r0)
            X.C90514aH.A1Q(r1, r3, r7)
        L_0x0221:
            if (r24 == 0) goto L_0x0234
        L_0x0223:
            java.lang.String r1 = X.C202299lU.A00(r10, r2, r8)
            if (r1 == 0) goto L_0x0234
            int r0 = r1.lastIndexOf(r5)
            java.lang.String r0 = X.C165607th.A0o(r0, r1)
            r8.A05(r0)
        L_0x0234:
            r0 = r3[r6]
            java.lang.String r9 = X.C165617ti.A0Z(r0)
            r2 = r3[r7]
            long r0 = r8.A05
            long r10 = X.C36441kJ.A0A(r20)
            long r0 = r0 + r10
            r8.A05 = r0
            X.9UV r0 = r8.A0G
            if (r0 == 0) goto L_0x024d
            X.3KL r0 = r0.A03
            r0.A01 = r9
        L_0x024d:
            java.lang.String r0 = "ADR"
            boolean r20 = r9.equals(r0)
            if (r20 != 0) goto L_0x0392
            java.lang.String r0 = "ORG"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0392
            java.lang.String r0 = "N"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0392
            java.lang.String r0 = "AGENT"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x02ff
            boolean r0 = r8 instanceof X.Av6
            if (r0 == 0) goto L_0x06ce
            java.lang.String r1 = "AGENT in vCard 3.0 is not supported yet."
            X.1YJ r0 = new X.1YJ
            r0.<init>(r1)
            throw r0
        L_0x0279:
            r24 = 1
            goto L_0x01ff
        L_0x027c:
            r0 = r27
            if (r0 <= r9) goto L_0x0294
            java.lang.StringBuilder r11 = X.C90524aI.A0h(r11)
            X.C165617ti.A0g(r11, r3, r7)
        L_0x0287:
            r11.append(r5)
            X.C165617ti.A0g(r11, r1, r9)
            int r9 = r9 + 1
            if (r9 < r0) goto L_0x0287
            X.C90514aH.A1Q(r11, r3, r7)
        L_0x0294:
            java.lang.String r0 = "waid"
            boolean r0 = r10.contains(r0)
            if (r0 == 0) goto L_0x02fb
            java.lang.String r0 = "type"
            boolean r0 = r10.contains(r0)
            if (r0 == 0) goto L_0x02d7
            java.util.regex.Pattern r0 = X.C202299lU.A0M
            java.util.regex.Matcher r1 = r0.matcher(r10)
            boolean r0 = r1.find()
            if (r0 == 0) goto L_0x02b9
            java.lang.String r0 = r1.group(r7)
            if (r0 == 0) goto L_0x02b9
            r8.A05(r0)
        L_0x02b9:
            java.util.regex.Pattern r0 = X.C202299lU.A0N
            java.util.regex.Matcher r1 = r0.matcher(r10)
            boolean r0 = r1.find()
            if (r0 == 0) goto L_0x0234
            java.lang.String r9 = r1.group(r7)
            if (r9 == 0) goto L_0x0234
            X.9UV r1 = r8.A0G
            if (r1 == 0) goto L_0x02e9
            java.lang.String r0 = "waId"
            r1.A01 = r0
            r1.A00(r9)
            goto L_0x02e9
        L_0x02d7:
            java.lang.String r1 = X.C202299lU.A00(r10, r2, r8)
            if (r1 == 0) goto L_0x02b9
            int r0 = r1.lastIndexOf(r5)
            java.lang.String r0 = X.C165607th.A0o(r0, r1)
            r8.A05(r0)
            goto L_0x02b9
        L_0x02e9:
            X.13s r0 = com.whatsapp.jid.PhoneUserJid.Companion     // Catch:{ 0wR -> 0x02f7 }
            com.whatsapp.jid.PhoneUserJid r0 = X.C222913s.A00(r9)     // Catch:{ 0wR -> 0x02f7 }
            java.lang.String r0 = X.AnonymousClass3U8.A07(r0)     // Catch:{ 0wR -> 0x02f7 }
            r3[r7] = r0     // Catch:{ 0wR -> 0x02f7 }
            goto L_0x0234
        L_0x02f7:
            r3[r7] = r2
            goto L_0x0234
        L_0x02fb:
            java.lang.String r2 = "X-ABLabel"
            goto L_0x0223
        L_0x02ff:
            boolean r1 = r8 instanceof X.Av6
            if (r1 == 0) goto L_0x033c
            java.util.HashSet r0 = X.Av6.A02
            boolean r0 = r0.contains(r9)
            if (r0 != 0) goto L_0x0326
            java.util.HashSet r0 = X.Av6.A03
            boolean r0 = r0.contains(r9)
            if (r0 != 0) goto L_0x0326
            java.lang.String r0 = "X-"
            boolean r0 = r9.startsWith(r0)
            if (r0 != 0) goto L_0x0326
            java.util.HashSet r3 = r8.A0F
            boolean r0 = r3.contains(r9)
            if (r0 != 0) goto L_0x0326
            r3.add(r9)
        L_0x0326:
            r0 = r22
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0365
            boolean r0 = r2.equals(r4)
            if (r0 == 0) goto L_0x06d6
            java.lang.String r1 = "This vCard has nested vCard data in it."
            X.Av4 r0 = new X.Av4
            r0.<init>(r1)
            throw r0
        L_0x033c:
            java.util.HashSet r3 = X.C202299lU.A0K
            java.lang.String r0 = X.C165617ti.A0Z(r9)
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x0326
            java.lang.String r0 = "X-"
            boolean r0 = r9.startsWith(r0)
            if (r0 != 0) goto L_0x0326
            java.util.HashSet r3 = r8.A0F
            boolean r0 = r3.contains(r9)
            if (r0 != 0) goto L_0x0326
            r3.add(r9)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Property name unsupported by vCard 2.1: "
            X.C36321k7.A1R(r0, r9, r3)
            goto L_0x0326
        L_0x0365:
            java.lang.String r0 = "VERSION"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0425
            if (r1 == 0) goto L_0x038f
            java.lang.String r3 = "3.0"
        L_0x0371:
            boolean r0 = r2.equals(r3)
            if (r0 != 0) goto L_0x0425
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Incompatible version: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " != "
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r3, r1)
            X.Av5 r0 = new X.Av5
            r0.<init>(r1)
            throw r0
        L_0x038f:
            java.lang.String r3 = "2.1"
            goto L_0x0371
        L_0x0392:
            long r14 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = r8.A0C
            java.lang.String r0 = "QUOTED-PRINTABLE"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x03a4
            java.lang.String r2 = r8.A03(r2)
        L_0x03a4:
            X.9UV r0 = r8.A0G
            if (r0 == 0) goto L_0x0417
            java.lang.StringBuilder r13 = X.AnonymousClass000.A0u()
            java.util.ArrayList r12 = X.AnonymousClass001.A0I()
            int r11 = r2.length()
            r10 = 0
        L_0x03b5:
            if (r10 >= r11) goto L_0x040b
            char r9 = r2.charAt(r10)
            r0 = 92
            if (r9 != r0) goto L_0x03f7
            int r0 = r11 + -1
            if (r10 >= r0) goto L_0x0407
            if (r20 != 0) goto L_0x0407
            int r3 = r10 + 1
            char r1 = r2.charAt(r3)
            boolean r0 = r8 instanceof X.Av6
            if (r0 == 0) goto L_0x03e2
            r0 = 110(0x6e, float:1.54E-43)
            if (r1 == r0) goto L_0x03d7
            r0 = 78
            if (r1 != r0) goto L_0x03f2
        L_0x03d7:
            java.lang.String r0 = "\r\n"
        L_0x03d9:
            if (r0 == 0) goto L_0x0407
            r13.append(r0)
            r10 = r3
        L_0x03df:
            int r10 = r10 + 1
            goto L_0x03b5
        L_0x03e2:
            r0 = 92
            if (r1 == r0) goto L_0x03f2
            r0 = 59
            if (r1 == r0) goto L_0x03f2
            r0 = 58
            if (r1 == r0) goto L_0x03f2
            r0 = 44
            if (r1 != r0) goto L_0x0407
        L_0x03f2:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            goto L_0x03d9
        L_0x03f7:
            r0 = 59
            if (r9 != r0) goto L_0x0407
            java.lang.String r0 = r13.toString()
            r12.add(r0)
            java.lang.StringBuilder r13 = X.AnonymousClass000.A0u()
            goto L_0x03df
        L_0x0407:
            r13.append(r9)
            goto L_0x03df
        L_0x040b:
            java.lang.String r0 = r13.toString()
            r12.add(r0)
            X.9UV r0 = r8.A0G
            r0.A01(r12)
        L_0x0417:
            long r0 = r8.A07
            long r2 = X.C36441kJ.A0A(r14)
            long r0 = r0 + r2
            r8.A07 = r0
            goto L_0x0458
        L_0x0421:
            r8.A0E = r10
        L_0x0423:
            r0 = 1
            goto L_0x0459
        L_0x0425:
            long r14 = java.lang.System.currentTimeMillis()
            java.lang.String r9 = r8.A0C
            java.lang.String r0 = "QUOTED-PRINTABLE"
            boolean r0 = r9.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0482
            long r9 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = r8.A03(r2)
            X.9UV r1 = r8.A0G
            if (r1 == 0) goto L_0x0446
            java.util.ArrayList r0 = X.C90484aE.A0r(r0)
            r1.A01(r0)
        L_0x0446:
            long r0 = r8.A03
            long r2 = X.C36441kJ.A0A(r9)
            long r0 = r0 + r2
            r8.A03 = r0
        L_0x044f:
            long r0 = r8.A06
            long r2 = X.C36441kJ.A0A(r14)
            long r0 = r0 + r2
            r8.A06 = r0
        L_0x0458:
            r0 = 0
        L_0x0459:
            X.9UV r9 = r8.A0G
            if (r9 == 0) goto L_0x0592
            if (r0 != 0) goto L_0x0596
            long r2 = java.lang.System.currentTimeMillis()
            X.37f r0 = r9.A04
            java.util.ArrayList r1 = r0.A02
            X.3KL r0 = r9.A03
            r1.add(r0)
            long r0 = r8.A00
            long r2 = X.C36441kJ.A0A(r2)
            long r0 = r0 + r2
            r8.A00 = r0
            long r2 = java.lang.System.currentTimeMillis()
            X.3KL r0 = new X.3KL
            r0.<init>()
            r9.A03 = r0
            goto L_0x00db
        L_0x0482:
            java.lang.String r0 = "BASE64"
            boolean r0 = r9.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0517
            java.lang.String r0 = "B"
            boolean r0 = r9.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0517
            java.lang.String r0 = "7BIT"
            boolean r0 = r9.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x04bf
            r0 = r26
            boolean r0 = r9.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x04bf
            java.lang.String r3 = X.C165617ti.A0Z(r9)
            java.lang.String r0 = "X-"
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto L_0x04bf
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "The encoding unsupported by vCard spec: \""
            r3.append(r0)
            r3.append(r9)
            java.lang.String r0 = "\"."
            X.C36341k9.A1O(r3, r0)
        L_0x04bf:
            long r12 = java.lang.System.currentTimeMillis()
            X.9UV r0 = r8.A0G
            if (r0 == 0) goto L_0x050c
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()
            if (r2 == 0) goto L_0x0708
            if (r1 == 0) goto L_0x0504
            java.lang.StringBuilder r10 = X.AnonymousClass000.A0u()
            int r3 = r2.length()
            r1 = 0
        L_0x04d8:
            if (r1 >= r3) goto L_0x0500
            char r11 = r2.charAt(r1)
            r0 = 92
            if (r11 != r0) goto L_0x04fc
            int r0 = r3 + -1
            if (r1 >= r0) goto L_0x04fc
            int r1 = r1 + 1
            char r11 = r2.charAt(r1)
            r0 = 110(0x6e, float:1.54E-43)
            if (r11 == r0) goto L_0x04f4
            r0 = 78
            if (r11 != r0) goto L_0x04fc
        L_0x04f4:
            java.lang.String r0 = "\r\n"
            r10.append(r0)
        L_0x04f9:
            int r1 = r1 + 1
            goto L_0x04d8
        L_0x04fc:
            r10.append(r11)
            goto L_0x04f9
        L_0x0500:
            java.lang.String r2 = r10.toString()
        L_0x0504:
            r9.add(r2)
            X.9UV r0 = r8.A0G
            r0.A01(r9)
        L_0x050c:
            long r0 = r8.A02
            long r2 = X.C36441kJ.A0A(r12)
            long r0 = r0 + r2
            r8.A02 = r0
            goto L_0x044f
        L_0x0517:
            long r9 = java.lang.System.currentTimeMillis()
            if (r1 == 0) goto L_0x054e
            r3 = r8
            X.Av6 r3 = (X.Av6) r3     // Catch:{ OutOfMemoryError -> 0x0579 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ OutOfMemoryError -> 0x0579 }
        L_0x0524:
            r1.append(r2)     // Catch:{ OutOfMemoryError -> 0x0579 }
            java.lang.String r2 = r3.A01()     // Catch:{ OutOfMemoryError -> 0x0579 }
            if (r2 == 0) goto L_0x0546
            int r0 = r2.length()     // Catch:{ OutOfMemoryError -> 0x0579 }
            if (r0 == 0) goto L_0x0561
            java.lang.String r0 = " "
            boolean r0 = r2.startsWith(r0)     // Catch:{ OutOfMemoryError -> 0x0579 }
            if (r0 != 0) goto L_0x0524
            java.lang.String r0 = "\t"
            boolean r0 = r2.startsWith(r0)     // Catch:{ OutOfMemoryError -> 0x0579 }
            if (r0 != 0) goto L_0x0524
            r3.A00 = r2     // Catch:{ OutOfMemoryError -> 0x0579 }
            goto L_0x0561
        L_0x0546:
            java.lang.String r0 = "File ended during parsing BASE64 binary"
            X.1YJ r1 = new X.1YJ     // Catch:{ OutOfMemoryError -> 0x0579 }
            r1.<init>(r0)     // Catch:{ OutOfMemoryError -> 0x0579 }
            goto L_0x0578
        L_0x054e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ OutOfMemoryError -> 0x0579 }
        L_0x0552:
            r1.append(r2)     // Catch:{ OutOfMemoryError -> 0x0579 }
            java.lang.String r2 = r8.A01()     // Catch:{ OutOfMemoryError -> 0x0579 }
            if (r2 == 0) goto L_0x0571
            int r0 = r2.length()     // Catch:{ OutOfMemoryError -> 0x0579 }
            if (r0 != 0) goto L_0x0552
        L_0x0561:
            java.lang.String r0 = r1.toString()     // Catch:{ OutOfMemoryError -> 0x0579 }
            X.9UV r1 = r8.A0G     // Catch:{ OutOfMemoryError -> 0x0579 }
            if (r1 == 0) goto L_0x0587
            java.util.ArrayList r0 = X.C90484aE.A0r(r0)     // Catch:{ OutOfMemoryError -> 0x0579 }
            r1.A01(r0)     // Catch:{ OutOfMemoryError -> 0x0579 }
            goto L_0x0587
        L_0x0571:
            java.lang.String r0 = "File ended during parsing BASE64 binary"
            X.1YJ r1 = new X.1YJ     // Catch:{ OutOfMemoryError -> 0x0579 }
            r1.<init>(r0)     // Catch:{ OutOfMemoryError -> 0x0579 }
        L_0x0578:
            throw r1     // Catch:{ OutOfMemoryError -> 0x0579 }
        L_0x0579:
            r1 = move-exception
            java.lang.String r0 = "vcardparser/out-of-memory "
            com.whatsapp.util.Log.e(r0, r1)
            X.9UV r1 = r8.A0G
            if (r1 == 0) goto L_0x0587
            r0 = 0
            r1.A01(r0)
        L_0x0587:
            long r0 = r8.A04
            long r2 = X.C36441kJ.A0A(r9)
            long r0 = r0 + r2
            r8.A04 = r0
            goto L_0x044f
        L_0x0592:
            if (r0 != 0) goto L_0x0596
            goto L_0x00e4
        L_0x0596:
            long r0 = r8.A08
            long r2 = X.C36441kJ.A0A(r18)
            long r0 = r0 + r2
            r8.A08 = r0
            java.lang.String r0 = r8.A0E
            if (r0 == 0) goto L_0x0700
            r1 = 2
            java.lang.String[] r2 = r0.split(r5, r1)
            int r0 = r2.length
            if (r0 != r1) goto L_0x06e6
            r0 = r2[r6]
            java.lang.String r1 = r0.trim()
            java.lang.String r0 = "END"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x06e6
            r0 = r2[r7]
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.equalsIgnoreCase(r4)
            if (r0 == 0) goto L_0x06e6
            X.9UV r2 = r8.A0G
            if (r2 == 0) goto L_0x0057
            long r4 = java.lang.System.currentTimeMillis()
            java.util.List r1 = r2.A02
            int r0 = r2.A00
            java.lang.Object r0 = r1.get(r0)
            X.37f r0 = (X.C602837f) r0
            r0.A00 = r6
        L_0x05d9:
            int r0 = r2.A00
            if (r0 <= 0) goto L_0x05eb
            int r0 = r0 + -1
            r2.A00 = r0
            java.lang.Object r0 = r1.get(r0)
            X.37f r0 = (X.C602837f) r0
            int r0 = r0.A00
            if (r0 != r7) goto L_0x05d9
        L_0x05eb:
            int r0 = r2.A00
            java.lang.Object r0 = r1.get(r0)
            X.37f r0 = (X.C602837f) r0
            r2.A04 = r0
            long r2 = r8.A01
            long r0 = X.C36441kJ.A0A(r4)
            long r2 = r2 + r0
            r8.A01 = r2
            goto L_0x0057
        L_0x0600:
            java.lang.Object r5 = X.C36401kF.A0n(r3)
            java.lang.String r5 = (java.lang.String) r5
            int r0 = X.C36431kI.A07(r3)
            r4 = 0
            java.util.List r10 = r3.subList(r4, r0)
            r9 = 99
            r1 = 198(0xc6, float:2.77E-43)
            int r0 = r10.size()
            int r0 = java.lang.Math.min(r1, r0)
            java.util.ArrayList r6 = X.C36441kJ.A14(r0)
            r7 = 0
            r3 = 0
        L_0x0621:
            int r0 = r10.size()
            if (r7 >= r0) goto L_0x0676
            int r11 = r10.size()
            java.lang.String r12 = X.C36401kF.A0s(r10, r7)
            int r14 = r12.length()
            r13 = 0
            if (r14 <= 0) goto L_0x0647
            char r1 = r12.charAt(r4)
            r0 = 32
            if (r1 == r0) goto L_0x0646
            char r1 = r12.charAt(r4)
            r0 = 9
            if (r1 != r0) goto L_0x0647
        L_0x0646:
            r13 = 1
        L_0x0647:
            r2 = 1
            if (r13 != 0) goto L_0x0662
            r1 = 58
            int r0 = r12.indexOf(r1)
            if (r0 >= 0) goto L_0x0671
            if (r14 != 0) goto L_0x0662
            int r0 = r7 + 1
            if (r0 >= r11) goto L_0x0662
            java.lang.String r0 = X.C36401kF.A0s(r10, r0)
            int r0 = r0.indexOf(r1)
            if (r0 > 0) goto L_0x0671
        L_0x0662:
            java.lang.String r1 = X.C36401kF.A0s(r10, r7)
            X.9Il r0 = new X.9Il
            r0.<init>(r1, r2)
            r6.add(r0)
            int r7 = r7 + 1
            goto L_0x0621
        L_0x0671:
            r2 = 0
            int r3 = r3 + 1
            if (r3 <= r9) goto L_0x0662
        L_0x0676:
            int r7 = r6.size()
            r3 = 0
        L_0x067b:
            if (r3 >= r7) goto L_0x06b6
            java.lang.Object r9 = r6.get(r3)
            X.9Il r9 = (X.C192759Il) r9
            java.lang.String r2 = r9.A00
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x069e
            char r1 = r2.charAt(r4)
            r0 = 32
            if (r1 == r0) goto L_0x069b
            char r1 = r2.charAt(r4)
            r0 = 9
            if (r1 != r0) goto L_0x069e
        L_0x069b:
            int r3 = r3 + 1
            goto L_0x067b
        L_0x069e:
            boolean r0 = r9.A01
            if (r0 == 0) goto L_0x069b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            r0 = 32
            java.lang.String r2 = X.C90464aC.A0f(r2, r1, r0)
            r1 = 1
            X.9Il r0 = new X.9Il
            r0.<init>(r2, r1)
            r6.set(r3, r0)
            goto L_0x069b
        L_0x06b6:
            X.9Il r0 = new X.9Il
            r0.<init>(r5, r4)
            r6.add(r0)
            goto L_0x0043
        L_0x06c0:
            X.Av6 r8 = new X.Av6
            r8.<init>()
            goto L_0x0039
        L_0x06c7:
            int r4 = r4 + 1
            goto L_0x000c
        L_0x06cb:
            r0 = r2
            goto L_0x002e
        L_0x06ce:
            java.lang.String r1 = "AGENT Property is not supported."
            X.1YJ r0 = new X.1YJ
            r0.<init>(r1)
            throw r0
        L_0x06d6:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unknown BEGIN type: "
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r2, r1)
            X.1YJ r0 = new X.1YJ
            r0.<init>(r1)
            throw r0
        L_0x06e6:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "END:VCARD != \""
            r1.append(r0)
            java.lang.String r0 = r8.A0E
            r1.append(r0)
            java.lang.String r0 = "\""
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)
            X.1YJ r0 = new X.1YJ
            r0.<init>(r1)
            throw r0
        L_0x0700:
            java.lang.String r1 = "Attempted to split null line"
            X.1YJ r0 = new X.1YJ
            r0.<init>(r1)
            throw r0
        L_0x0708:
            java.lang.String r1 = "null property value is not supported"
            X.1YJ r0 = new X.1YJ
            r0.<init>(r1)
            throw r0
        L_0x0710:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Invalid line: \""
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = "\""
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)
            X.1YJ r0 = new X.1YJ
            r0.<init>(r1)
            throw r0
        L_0x0728:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Expected String \"BEGIN:VCARD\" did not come (Instead, \""
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "\" came)"
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)
            X.1YJ r0 = new X.1YJ
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C200709i5.A01(java.util.List, X.9UV):void");
    }
}
