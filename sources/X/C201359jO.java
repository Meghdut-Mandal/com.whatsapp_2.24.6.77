package X;

import android.text.TextUtils;

/* renamed from: X.9jO  reason: invalid class name and case insensitive filesystem */
public class C201359jO {
    public final C201319jK A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public static int A00(int[] iArr, int i) {
        int i2 = Integer.MAX_VALUE;
        for (int i3 : iArr) {
            if (i3 >= 0) {
                i2 = Math.min(i2, i3);
            }
        }
        if (i2 != Integer.MAX_VALUE) {
            return i2;
        }
        return i;
    }

    public C201359jO(C201319jK r1, String str, String str2, String str3, String str4) {
        this.A04 = str;
        this.A00 = r1;
        this.A02 = str2;
        this.A03 = str3;
        this.A01 = str4;
    }

    public String A02() {
        StringBuilder A0u = AnonymousClass000.A0u();
        String str = this.A04;
        if (!TextUtils.isEmpty(str)) {
            A0u.append(str);
            A0u.append(":");
        }
        C201319jK r1 = this.A00;
        if (r1 != null) {
            A0u.append("//");
            A0u.append(r1.A01());
        }
        String str2 = this.A02;
        if (!TextUtils.isEmpty(str2)) {
            A0u.append(str2);
        }
        if (!TextUtils.isEmpty(this.A03)) {
            A0u.append("?<REDACTED>");
        }
        if (!TextUtils.isEmpty(this.A01)) {
            A0u.append("#<REDACTED>");
        }
        return A0u.toString();
    }

    public String toString() {
        return A02();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:171:0x02d5, code lost:
        if (r20 >= (r14.length() - 1)) goto L_0x02d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:?, code lost:
        r1 = X.AnonymousClass000.A0u();
        r1.append("Fragment contains illegal character ");
        X.C165577te.A1P(r1, r3);
        r0 = X.AnonymousClass000.A0d(" at string index ", r1, r5);
     */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0355  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C201359jO A01(java.lang.String r24, java.lang.String r25, java.text.BreakIterator r26, int r27, int r28) {
        /*
            r9 = r27
            java.lang.String r0 = "//"
            r11 = r24
            int r0 = r11.indexOf(r0, r9)
            r8 = 1
            r7 = 0
            r24 = 2
            r4 = 0
            r10 = r26
            r26 = r28
            if (r0 != r9) goto L_0x0342
            int r1 = r0 + 2
            r0 = 3
            int[] r2 = new int[r0]
            r0 = 47
            int r0 = r11.indexOf(r0, r1)
            r2[r7] = r0
            r0 = 63
            int r0 = r11.indexOf(r0, r1)
            r2[r8] = r0
            r0 = 35
            int r0 = r11.indexOf(r0, r1)
            r2[r24] = r0
            r0 = r26
            int r9 = A00(r2, r0)
            if (r1 >= r0) goto L_0x0342
            int r0 = r9 - r1
            if (r0 <= 0) goto L_0x0342
            java.lang.String r2 = r11.substring(r1, r9)     // Catch:{ 925 -> 0x0328 }
            r0 = 64
            int r0 = r2.indexOf(r0)     // Catch:{ 925 -> 0x0328 }
            r23 = 0
            if (r0 <= 0) goto L_0x0092
            java.lang.String r22 = r2.substring(r7, r0)     // Catch:{ 925 -> 0x0328 }
            int r1 = r0 + 1
        L_0x0052:
            int r0 = r2.length()     // Catch:{ 925 -> 0x0328 }
            if (r1 >= r0) goto L_0x0319
            java.lang.String r14 = r2.substring(r1)     // Catch:{ 925 -> 0x0328 }
            r0 = 58
            int r21 = r14.lastIndexOf(r0)     // Catch:{ 925 -> 0x0328 }
            if (r21 == 0) goto L_0x030a
            java.lang.String r0 = "["
            boolean r0 = r14.startsWith(r0)     // Catch:{ 925 -> 0x0328 }
            if (r0 == 0) goto L_0x0244
            r0 = 93
            int r0 = r14.lastIndexOf(r0)     // Catch:{ 925 -> 0x0328 }
            if (r0 < 0) goto L_0x0235
            int r20 = r0 + 1
            r0 = r20
            java.lang.String r6 = r14.substring(r7, r0)     // Catch:{ 925 -> 0x0328 }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ 925 -> 0x0328 }
            if (r0 != 0) goto L_0x022e
            r10.setText(r6)     // Catch:{ 925 -> 0x0328 }
            int r19 = r6.length()     // Catch:{ 925 -> 0x0328 }
            int r1 = r10.current()     // Catch:{ 925 -> 0x0328 }
            r0 = r19
            if (r1 >= r0) goto L_0x0227
            goto L_0x0096
        L_0x0092:
            r22 = r4
            r1 = 0
            goto L_0x0052
        L_0x0096:
            r0 = -1
            if (r1 == r0) goto L_0x0227
            int r3 = r6.codePointAt(r1)     // Catch:{ 925 -> 0x0328 }
            r0 = 91
            if (r3 != r0) goto L_0x0210
            int r13 = r10.next()     // Catch:{ 925 -> 0x0328 }
            r0 = r19
            if (r13 >= r0) goto L_0x0209
            r0 = -1
            if (r13 == r0) goto L_0x0209
            int r1 = r6.codePointAt(r13)     // Catch:{ 925 -> 0x0328 }
            r0 = 86
            if (r1 == r0) goto L_0x0202
            r0 = 118(0x76, float:1.65E-43)
            if (r1 == r0) goto L_0x0202
            r0 = 4
            java.nio.CharBuffer r12 = java.nio.CharBuffer.allocate(r0)     // Catch:{ 925 -> 0x0328 }
            java.nio.Buffer r0 = r12.position(r7)     // Catch:{ 925 -> 0x0328 }
            if (r0 == 0) goto L_0x00ca
            java.nio.Buffer r0 = r12.position(r7)     // Catch:{ 925 -> 0x0328 }
            r0.limit(r7)     // Catch:{ 925 -> 0x0328 }
        L_0x00ca:
            r5 = 0
            r3 = 0
            r2 = 0
            r1 = 0
            r18 = 0
            r17 = 1
        L_0x00d2:
            r0 = r19
            if (r13 >= r0) goto L_0x01be
            r0 = -1
            if (r13 == r0) goto L_0x01be
            int r16 = r6.codePointAt(r13)     // Catch:{ 925 -> 0x0328 }
            boolean r0 = X.C201729kH.A01(r16)     // Catch:{ 925 -> 0x0328 }
            if (r0 == 0) goto L_0x00f9
            if (r5 != 0) goto L_0x00e7
            int r1 = r1 + 1
        L_0x00e7:
            int r5 = r5 + 1
            r0 = 4
            if (r5 > r0) goto L_0x014c
            r12.limit(r5)     // Catch:{ 925 -> 0x0328 }
            int r3 = r5 + -1
            r0 = r16
            char r0 = (char) r0     // Catch:{ 925 -> 0x0328 }
            r12.put(r3, r0)     // Catch:{ 925 -> 0x0328 }
            r3 = 0
            goto L_0x013b
        L_0x00f9:
            r0 = 46
            r15 = r0
            r0 = r16
            if (r0 == r15) goto L_0x0124
            r0 = 58
            r15 = r0
            r0 = r16
            if (r0 == r15) goto L_0x0111
            r0 = 93
            r15 = r0
            r0 = r16
            if (r0 != r15) goto L_0x015f
            if (r2 <= 0) goto L_0x01be
            goto L_0x015b
        L_0x0111:
            int r3 = r3 + 1
            r0 = 2
            if (r3 != r0) goto L_0x011d
            if (r18 != 0) goto L_0x017b
            r18 = 1
        L_0x011a:
            if (r2 <= 0) goto L_0x013a
            goto L_0x0174
        L_0x011d:
            if (r3 > r0) goto L_0x0196
            if (r17 != 0) goto L_0x011a
            if (r5 != 0) goto L_0x011a
            goto L_0x018b
        L_0x0124:
            X.C201319jK.A00(r12)     // Catch:{ 925 -> 0x0328 }
            java.nio.Buffer r0 = r12.position(r7)     // Catch:{ 925 -> 0x0328 }
            if (r0 == 0) goto L_0x0134
            java.nio.Buffer r0 = r12.position(r7)     // Catch:{ 925 -> 0x0328 }
            r0.limit(r7)     // Catch:{ 925 -> 0x0328 }
        L_0x0134:
            if (r5 <= 0) goto L_0x0138
            int r1 = r1 + -1
        L_0x0138:
            int r2 = r2 + 1
        L_0x013a:
            r5 = 0
        L_0x013b:
            r0 = 8
            if (r18 == 0) goto L_0x0140
            r0 = 7
        L_0x0140:
            if (r1 > r0) goto L_0x01ac
            r0 = 4
            if (r2 > r0) goto L_0x01a5
            int r13 = r10.next()     // Catch:{ 925 -> 0x0328 }
            r17 = 0
            goto L_0x00d2
        L_0x014c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 925 -> 0x0328 }
            java.lang.String r0 = "Illegal length hex run >4 characters starting at string index "
            r1.append(r0)     // Catch:{ 925 -> 0x0328 }
            int r13 = r13 - r5
            java.lang.IllegalArgumentException r0 = X.C165567td.A0O(r1, r13)     // Catch:{ 925 -> 0x0328 }
            throw r0     // Catch:{ 925 -> 0x0328 }
        L_0x015b:
            X.C201319jK.A00(r12)     // Catch:{ 925 -> 0x0328 }
            goto L_0x01b3
        L_0x015f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 925 -> 0x0328 }
            java.lang.String r0 = "Illegal character "
            r1.append(r0)     // Catch:{ 925 -> 0x0328 }
            r0 = r16
            X.C165577te.A1P(r1, r0)     // Catch:{ 925 -> 0x0328 }
            java.lang.String r0 = " at string index "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0d(r0, r1, r13)     // Catch:{ 925 -> 0x0328 }
            throw r0     // Catch:{ 925 -> 0x0328 }
        L_0x0174:
            java.lang.String r0 = "IPV4 address is only valid at the end of an IPV6 address string"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)     // Catch:{ 925 -> 0x0328 }
            throw r0     // Catch:{ 925 -> 0x0328 }
        L_0x017b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 925 -> 0x0328 }
            java.lang.String r0 = "Second double colon run detected at string index "
            r1.append(r0)     // Catch:{ 925 -> 0x0328 }
            int r13 = r13 - r24
            java.lang.IllegalArgumentException r0 = X.C165567td.A0O(r1, r13)     // Catch:{ 925 -> 0x0328 }
            throw r0     // Catch:{ 925 -> 0x0328 }
        L_0x018b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 925 -> 0x0328 }
            java.lang.String r0 = "Missing hex digit before colon at string index "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0d(r0, r1, r13)     // Catch:{ 925 -> 0x0328 }
            throw r0     // Catch:{ 925 -> 0x0328 }
        L_0x0196:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 925 -> 0x0328 }
            java.lang.String r0 = "Illegal length colon run starting at string index "
            r1.append(r0)     // Catch:{ 925 -> 0x0328 }
            int r13 = r13 - r3
            java.lang.IllegalArgumentException r0 = X.C165567td.A0O(r1, r13)     // Catch:{ 925 -> 0x0328 }
            throw r0     // Catch:{ 925 -> 0x0328 }
        L_0x01a5:
            java.lang.String r0 = "IPV4 address at the end of IPV6 address must have at most 4 octets"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)     // Catch:{ 925 -> 0x0328 }
            throw r0     // Catch:{ 925 -> 0x0328 }
        L_0x01ac:
            java.lang.String r0 = "IPV6 must have 8 or fewer pieces"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)     // Catch:{ 925 -> 0x0328 }
            throw r0     // Catch:{ 925 -> 0x0328 }
        L_0x01b3:
            if (r5 <= 0) goto L_0x01b7
            int r1 = r1 + -1
        L_0x01b7:
            int r2 = r2 + 1
            r0 = 4
            if (r2 != r0) goto L_0x01be
            int r1 = r1 + 2
        L_0x01be:
            if (r18 == 0) goto L_0x01cc
            r0 = 2
            if (r3 == r0) goto L_0x02cd
            if (r1 > 0) goto L_0x02cd
            java.lang.String r0 = "IPV6 address with zero elision must have at least one non-zero piece"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)     // Catch:{ 925 -> 0x0328 }
            throw r0     // Catch:{ 925 -> 0x0328 }
        L_0x01cc:
            r0 = 8
            if (r1 == r0) goto L_0x02cd
            if (r3 == r8) goto L_0x01fb
            r0 = 4
            if (r2 == r0) goto L_0x01e8
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 925 -> 0x0328 }
            java.lang.String r0 = "IPV6 address with IPV4 ending must specify exactly 4 IPV4 octets, found "
            r1.append(r0)     // Catch:{ 925 -> 0x0328 }
            r1.append(r2)     // Catch:{ 925 -> 0x0328 }
            java.lang.String r0 = " octets"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0c(r0, r1)     // Catch:{ 925 -> 0x0328 }
            throw r0     // Catch:{ 925 -> 0x0328 }
        L_0x01e8:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ 925 -> 0x0328 }
            java.lang.String r0 = "IPV6 without zero elision must have have exactly 8 pieces, found "
            r2.append(r0)     // Catch:{ 925 -> 0x0328 }
            r2.append(r1)     // Catch:{ 925 -> 0x0328 }
            java.lang.String r0 = " pieces"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0c(r0, r2)     // Catch:{ 925 -> 0x0328 }
            throw r0     // Catch:{ 925 -> 0x0328 }
        L_0x01fb:
            java.lang.String r0 = "IPV6 must not end with a single colon"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)     // Catch:{ 925 -> 0x0328 }
            throw r0     // Catch:{ 925 -> 0x0328 }
        L_0x0202:
            java.lang.String r0 = "IPFuture address types not supported"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)     // Catch:{ 925 -> 0x0328 }
            throw r0     // Catch:{ 925 -> 0x0328 }
        L_0x0209:
            java.lang.String r0 = "No characters after opening bracket '['"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)     // Catch:{ 925 -> 0x0328 }
            throw r0     // Catch:{ 925 -> 0x0328 }
        L_0x0210:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ 925 -> 0x0328 }
            java.lang.String r0 = "Illegal character at start of literal "
            r2.append(r0)     // Catch:{ 925 -> 0x0328 }
            int[] r1 = new int[r8]     // Catch:{ 925 -> 0x0328 }
            r1[r7] = r3     // Catch:{ 925 -> 0x0328 }
            java.lang.String r0 = new java.lang.String     // Catch:{ 925 -> 0x0328 }
            r0.<init>(r1, r7, r8)     // Catch:{ 925 -> 0x0328 }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0c(r0, r2)     // Catch:{ 925 -> 0x0328 }
            throw r0     // Catch:{ 925 -> 0x0328 }
        L_0x0227:
            java.lang.String r0 = "BreakIterator#current is past the end of string"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)     // Catch:{ 925 -> 0x0328 }
            throw r0     // Catch:{ 925 -> 0x0328 }
        L_0x022e:
            java.lang.String r0 = "IP literal cannot be empty"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)     // Catch:{ 925 -> 0x0328 }
            throw r0     // Catch:{ 925 -> 0x0328 }
        L_0x0235:
            X.9jK r2 = new X.9jK     // Catch:{ 925 -> 0x0328 }
            r0 = r22
            r2.<init>(r0, r4, r4)     // Catch:{ 925 -> 0x0328 }
            java.lang.String r1 = "IPFutureV6 / IPFutureAddress missing closing bracket"
            X.925 r0 = new X.925     // Catch:{ 925 -> 0x0328 }
            r0.<init>(r2, r1)     // Catch:{ 925 -> 0x0328 }
            throw r0     // Catch:{ 925 -> 0x0328 }
        L_0x0244:
            if (r21 >= 0) goto L_0x0248
            r6 = r14
            goto L_0x024e
        L_0x0248:
            r0 = r21
            java.lang.String r6 = r14.substring(r7, r0)     // Catch:{ 925 -> 0x0328 }
        L_0x024e:
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IllegalArgumentException -> 0x02fa }
            if (r0 != 0) goto L_0x02f3
            r10.setText(r6)     // Catch:{ IllegalArgumentException -> 0x02fa }
            int r1 = r6.length()     // Catch:{ IllegalArgumentException -> 0x02fa }
            int r3 = r10.current()     // Catch:{ IllegalArgumentException -> 0x02fa }
        L_0x025f:
            r0 = -1
            if (r3 == r0) goto L_0x02a7
            if (r3 >= r1) goto L_0x02a7
            int r2 = r6.codePointAt(r3)     // Catch:{ IllegalArgumentException -> 0x02fa }
            boolean r0 = X.C201729kH.A03(r2)     // Catch:{ IllegalArgumentException -> 0x02fa }
            if (r0 != 0) goto L_0x027e
            boolean r0 = X.C201729kH.A02(r2)     // Catch:{ IllegalArgumentException -> 0x02fa }
            if (r0 != 0) goto L_0x027e
            r0 = 37
            if (r2 != r0) goto L_0x0294
            r10.next()     // Catch:{ IllegalArgumentException -> 0x0283 }
            X.C201729kH.A00(r6, r10)     // Catch:{ IllegalArgumentException -> 0x0283 }
        L_0x027e:
            int r3 = r10.next()     // Catch:{ IllegalArgumentException -> 0x02fa }
            goto L_0x025f
        L_0x0283:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IllegalArgumentException -> 0x02fa }
            java.lang.String r0 = "Host contains invalid percent encoded character at string index "
            java.lang.String r1 = X.AnonymousClass000.A0r(r0, r1, r3)     // Catch:{ IllegalArgumentException -> 0x02fa }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x02fa }
            r0.<init>(r1, r2)     // Catch:{ IllegalArgumentException -> 0x02fa }
            throw r0     // Catch:{ IllegalArgumentException -> 0x02fa }
        L_0x0294:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IllegalArgumentException -> 0x02fa }
            java.lang.String r0 = "Host contains illegal character "
            r1.append(r0)     // Catch:{ IllegalArgumentException -> 0x02fa }
            X.C165577te.A1P(r1, r2)     // Catch:{ IllegalArgumentException -> 0x02fa }
            java.lang.String r0 = " at string index "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0d(r0, r1, r3)     // Catch:{ IllegalArgumentException -> 0x02fa }
            throw r0     // Catch:{ IllegalArgumentException -> 0x02fa }
        L_0x02a7:
            if (r21 <= 0) goto L_0x02d7
            r0 = r21
            java.lang.String r23 = X.C165607th.A0o(r0, r14)     // Catch:{ 925 -> 0x0328 }
            r1 = 10
            r0 = r23
            long r0 = java.lang.Long.parseLong(r0, r1)     // Catch:{ IllegalArgumentException -> 0x02e1 }
            r12 = 0
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 >= 0) goto L_0x02d7
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ IllegalArgumentException -> 0x02e1 }
            java.lang.String r2 = "Port cannot be negative "
            java.lang.String r1 = X.C36381kD.A0z(r2, r3, r0)     // Catch:{ IllegalArgumentException -> 0x02e1 }
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException     // Catch:{ IllegalArgumentException -> 0x02e1 }
            r0.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x02e1 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x02e1 }
        L_0x02cd:
            int r0 = r14.length()     // Catch:{ 925 -> 0x0328 }
            int r1 = r0 + -1
            r0 = r20
            if (r0 < r1) goto L_0x02a7
        L_0x02d7:
            X.9jK r2 = new X.9jK     // Catch:{ 925 -> 0x0328 }
            r1 = r23
            r0 = r22
            r2.<init>(r0, r6, r1)     // Catch:{ 925 -> 0x0328 }
            goto L_0x0343
        L_0x02e1:
            r3 = move-exception
            X.9jK r2 = new X.9jK     // Catch:{ 925 -> 0x0328 }
            r1 = r23
            r0 = r22
            r2.<init>(r0, r6, r1)     // Catch:{ 925 -> 0x0328 }
            java.lang.String r1 = "Invalid port number"
            X.925 r0 = new X.925     // Catch:{ 925 -> 0x0328 }
            r0.<init>(r2, r1, r3)     // Catch:{ 925 -> 0x0328 }
            throw r0     // Catch:{ 925 -> 0x0328 }
        L_0x02f3:
            java.lang.String r0 = "Host cannot be empty"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)     // Catch:{ IllegalArgumentException -> 0x02fa }
            throw r0     // Catch:{ IllegalArgumentException -> 0x02fa }
        L_0x02fa:
            r3 = move-exception
            X.9jK r2 = new X.9jK     // Catch:{ 925 -> 0x0328 }
            r0 = r22
            r2.<init>(r0, r6, r4)     // Catch:{ 925 -> 0x0328 }
            java.lang.String r1 = "Invalid host name"
            X.925 r0 = new X.925     // Catch:{ 925 -> 0x0328 }
            r0.<init>(r2, r1, r3)     // Catch:{ 925 -> 0x0328 }
            throw r0     // Catch:{ 925 -> 0x0328 }
        L_0x030a:
            X.9jK r2 = new X.9jK     // Catch:{ 925 -> 0x0328 }
            r0 = r22
            r2.<init>(r0, r4, r4)     // Catch:{ 925 -> 0x0328 }
            java.lang.String r1 = "Host string started with colon (':')"
            X.925 r0 = new X.925     // Catch:{ 925 -> 0x0328 }
            r0.<init>(r2, r1)     // Catch:{ 925 -> 0x0328 }
            throw r0     // Catch:{ 925 -> 0x0328 }
        L_0x0319:
            X.9jK r2 = new X.9jK     // Catch:{ 925 -> 0x0328 }
            r0 = r22
            r2.<init>(r0, r4, r4)     // Catch:{ 925 -> 0x0328 }
            java.lang.String r1 = "No host string was present"
            X.925 r0 = new X.925     // Catch:{ 925 -> 0x0328 }
            r0.<init>(r2, r1)     // Catch:{ 925 -> 0x0328 }
            throw r0     // Catch:{ 925 -> 0x0328 }
        L_0x0328:
            r2 = move-exception
            X.9jK r0 = r2.mAuthority
            X.9jO r1 = new X.9jO
            r27 = r4
            r28 = r4
            r23 = r1
            r24 = r0
            r26 = r4
            r23.<init>(r24, r25, r26, r27, r28)
            java.lang.String r0 = "Unable to parse authority"
            X.926 r3 = new X.926
            r3.<init>(r1, r0, r2)
            throw r3
        L_0x0342:
            r2 = r4
        L_0x0343:
            r0 = r26
            if (r9 < r0) goto L_0x0355
            r27 = r4
            r28 = r4
            X.9jO r23 = new X.9jO
            r24 = r2
            r26 = r4
            r23.<init>(r24, r25, r26, r27, r28)
            return r23
        L_0x0355:
            r0 = 2
            int[] r1 = new int[r0]
            r0 = 63
            int r0 = r11.indexOf(r0, r9)
            r1[r7] = r0
            r0 = 35
            int r0 = r11.indexOf(r0, r9)
            r1[r8] = r0
            r0 = r26
            int r5 = A00(r1, r0)
            java.lang.String r6 = r11.substring(r9, r5)
            if (r2 != 0) goto L_0x0375
            r8 = 0
        L_0x0375:
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IllegalArgumentException -> 0x055c }
            if (r0 != 0) goto L_0x03f8
            r10.setText(r6)     // Catch:{ IllegalArgumentException -> 0x055c }
            int r12 = r6.length()     // Catch:{ IllegalArgumentException -> 0x055c }
            int r7 = r10.current()     // Catch:{ IllegalArgumentException -> 0x055c }
            int r0 = r6.codePointAt(r7)     // Catch:{ IllegalArgumentException -> 0x055c }
            r9 = -1
            r1 = 47
            if (r8 != 0) goto L_0x03a6
            if (r0 != r1) goto L_0x03a6
            int r7 = r10.next()     // Catch:{ IllegalArgumentException -> 0x055c }
            if (r7 >= r12) goto L_0x03f8
            if (r7 == r9) goto L_0x03f8
            int r0 = r6.codePointAt(r7)     // Catch:{ IllegalArgumentException -> 0x055c }
            if (r0 != r1) goto L_0x03a6
            java.lang.String r0 = "Path cannot start with two slashes '//' when Uri contains an authority"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)     // Catch:{ IllegalArgumentException -> 0x055c }
            throw r0     // Catch:{ IllegalArgumentException -> 0x055c }
        L_0x03a6:
            if (r7 >= r12) goto L_0x03f8
            if (r7 == r9) goto L_0x03f8
            int r3 = r6.codePointAt(r7)     // Catch:{ IllegalArgumentException -> 0x055c }
            boolean r0 = X.C201729kH.A03(r3)     // Catch:{ IllegalArgumentException -> 0x055c }
            if (r0 != 0) goto L_0x03cf
            boolean r0 = X.C201729kH.A02(r3)     // Catch:{ IllegalArgumentException -> 0x055c }
            if (r0 != 0) goto L_0x03cf
            r0 = 37
            if (r3 == r0) goto L_0x03c9
            if (r3 == r1) goto L_0x03cf
            r0 = 58
            if (r3 == r0) goto L_0x03cf
            r0 = 64
            if (r3 == r0) goto L_0x03cf
            goto L_0x03d4
        L_0x03c9:
            r10.next()     // Catch:{ IllegalArgumentException -> 0x03e7 }
            X.C201729kH.A00(r6, r10)     // Catch:{ IllegalArgumentException -> 0x03e7 }
        L_0x03cf:
            int r7 = r10.next()     // Catch:{ IllegalArgumentException -> 0x055c }
            goto L_0x03a6
        L_0x03d4:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IllegalArgumentException -> 0x055c }
            java.lang.String r0 = "Path contains illegal character "
            r1.append(r0)     // Catch:{ IllegalArgumentException -> 0x055c }
            X.C165577te.A1P(r1, r3)     // Catch:{ IllegalArgumentException -> 0x055c }
            java.lang.String r0 = " at string index "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0d(r0, r1, r7)     // Catch:{ IllegalArgumentException -> 0x055c }
            throw r0     // Catch:{ IllegalArgumentException -> 0x055c }
        L_0x03e7:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IllegalArgumentException -> 0x055c }
            java.lang.String r0 = "Path contains invalid percent encoded character at string index "
            java.lang.String r1 = X.AnonymousClass000.A0r(r0, r1, r7)     // Catch:{ IllegalArgumentException -> 0x055c }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x055c }
            r0.<init>(r1, r3)     // Catch:{ IllegalArgumentException -> 0x055c }
            throw r0     // Catch:{ IllegalArgumentException -> 0x055c }
        L_0x03f8:
            r0 = r26
            if (r5 < r0) goto L_0x0409
            r5 = r4
            X.9jO r23 = new X.9jO
            r0 = r23
            r1 = r2
            r2 = r25
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r23
        L_0x0409:
            int r3 = r11.codePointAt(r5)
            r0 = 63
            if (r3 != r0) goto L_0x04ad
            r0 = 35
            int r1 = r11.indexOf(r0, r5)
            if (r1 >= 0) goto L_0x041b
            r1 = r26
        L_0x041b:
            java.lang.String r7 = r11.substring(r5, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalArgumentException -> 0x0498 }
            if (r0 != 0) goto L_0x04af
            r10.setText(r7)     // Catch:{ IllegalArgumentException -> 0x0498 }
            int r8 = r7.length()     // Catch:{ IllegalArgumentException -> 0x0498 }
            int r0 = r10.current()     // Catch:{ IllegalArgumentException -> 0x0498 }
            int r3 = r7.codePointAt(r0)     // Catch:{ IllegalArgumentException -> 0x0498 }
            r0 = 63
            if (r3 == r0) goto L_0x043f
            java.lang.String r0 = "Query must start with ASCII question mark '?'"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)     // Catch:{ IllegalArgumentException -> 0x0498 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0498 }
        L_0x043f:
            int r5 = r10.next()     // Catch:{ IllegalArgumentException -> 0x0498 }
            if (r5 >= r8) goto L_0x04af
            r0 = -1
            if (r5 == r0) goto L_0x04af
            int r3 = r7.codePointAt(r5)     // Catch:{ IllegalArgumentException -> 0x0498 }
            boolean r0 = X.C201729kH.A03(r3)     // Catch:{ IllegalArgumentException -> 0x0498 }
            if (r0 != 0) goto L_0x043f
            boolean r0 = X.C201729kH.A02(r3)     // Catch:{ IllegalArgumentException -> 0x0498 }
            if (r0 != 0) goto L_0x043f
            r0 = 37
            if (r3 == r0) goto L_0x046d
            r0 = 47
            if (r3 == r0) goto L_0x043f
            r0 = 58
            if (r3 == r0) goto L_0x043f
            r0 = 63
            if (r3 == r0) goto L_0x043f
            r0 = 64
            if (r3 == r0) goto L_0x043f
            goto L_0x0474
        L_0x046d:
            r10.next()     // Catch:{ IllegalArgumentException -> 0x0487 }
            X.C201729kH.A00(r7, r10)     // Catch:{ IllegalArgumentException -> 0x0487 }
            goto L_0x043f
        L_0x0474:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IllegalArgumentException -> 0x0498 }
            java.lang.String r0 = "Query contains illegal character "
            r1.append(r0)     // Catch:{ IllegalArgumentException -> 0x0498 }
            X.C165577te.A1P(r1, r3)     // Catch:{ IllegalArgumentException -> 0x0498 }
            java.lang.String r0 = " at string index "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0d(r0, r1, r5)     // Catch:{ IllegalArgumentException -> 0x0498 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0498 }
        L_0x0487:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IllegalArgumentException -> 0x0498 }
            java.lang.String r0 = "Query contains invalid percent encoded character at string index "
            java.lang.String r1 = X.AnonymousClass000.A0r(r0, r1, r5)     // Catch:{ IllegalArgumentException -> 0x0498 }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0498 }
            r0.<init>(r1, r3)     // Catch:{ IllegalArgumentException -> 0x0498 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0498 }
        L_0x0498:
            r5 = move-exception
            X.9jO r3 = new X.9jO
            r8 = r3
            r9 = r2
            r10 = r25
            r11 = r6
            r12 = r7
            r13 = r4
            r8.<init>(r9, r10, r11, r12, r13)
            java.lang.String r1 = "Uri contained invalid query string"
            X.926 r0 = new X.926
            r0.<init>(r3, r1, r5)
            throw r0
        L_0x04ad:
            r7 = r4
            goto L_0x04b8
        L_0x04af:
            r0 = r26
            if (r1 >= r0) goto L_0x054e
            int r3 = r11.codePointAt(r1)
            r5 = r1
        L_0x04b8:
            r0 = 35
            if (r3 != r0) goto L_0x04c0
            java.lang.String r4 = r11.substring(r5)
        L_0x04c0:
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ IllegalArgumentException -> 0x0539 }
            if (r0 != 0) goto L_0x054e
            r10.setText(r4)     // Catch:{ IllegalArgumentException -> 0x0539 }
            int r1 = r4.length()     // Catch:{ IllegalArgumentException -> 0x0539 }
            int r0 = r10.current()     // Catch:{ IllegalArgumentException -> 0x0539 }
            int r3 = r4.codePointAt(r0)     // Catch:{ IllegalArgumentException -> 0x0539 }
            r0 = 35
            if (r3 == r0) goto L_0x04e0
            java.lang.String r0 = "Fragment must start with ASCII number sign '#'"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)     // Catch:{ IllegalArgumentException -> 0x0539 }
        L_0x04df:
            throw r0     // Catch:{ IllegalArgumentException -> 0x0539 }
        L_0x04e0:
            int r5 = r10.next()     // Catch:{ IllegalArgumentException -> 0x0539 }
            if (r5 >= r1) goto L_0x054e
            r0 = -1
            if (r5 == r0) goto L_0x054e
            int r3 = r4.codePointAt(r5)     // Catch:{ IllegalArgumentException -> 0x0539 }
            boolean r0 = X.C201729kH.A03(r3)     // Catch:{ IllegalArgumentException -> 0x0539 }
            if (r0 != 0) goto L_0x04e0
            boolean r0 = X.C201729kH.A02(r3)     // Catch:{ IllegalArgumentException -> 0x0539 }
            if (r0 != 0) goto L_0x04e0
            r0 = 37
            if (r3 == r0) goto L_0x050e
            r0 = 47
            if (r3 == r0) goto L_0x04e0
            r0 = 58
            if (r3 == r0) goto L_0x04e0
            r0 = 63
            if (r3 == r0) goto L_0x04e0
            r0 = 64
            if (r3 == r0) goto L_0x04e0
            goto L_0x0515
        L_0x050e:
            r10.next()     // Catch:{ IllegalArgumentException -> 0x0528 }
            X.C201729kH.A00(r4, r10)     // Catch:{ IllegalArgumentException -> 0x0528 }
            goto L_0x04e0
        L_0x0515:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IllegalArgumentException -> 0x0539 }
            java.lang.String r0 = "Fragment contains illegal character "
            r1.append(r0)     // Catch:{ IllegalArgumentException -> 0x0539 }
            X.C165577te.A1P(r1, r3)     // Catch:{ IllegalArgumentException -> 0x0539 }
            java.lang.String r0 = " at string index "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0d(r0, r1, r5)     // Catch:{ IllegalArgumentException -> 0x0539 }
            goto L_0x04df
        L_0x0528:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IllegalArgumentException -> 0x0539 }
            java.lang.String r0 = "Fragment contains invalid percent encoded character at string index "
            java.lang.String r1 = X.AnonymousClass000.A0r(r0, r1, r5)     // Catch:{ IllegalArgumentException -> 0x0539 }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0539 }
            r0.<init>(r1, r3)     // Catch:{ IllegalArgumentException -> 0x0539 }
            goto L_0x04df
        L_0x0539:
            r5 = move-exception
            X.9jO r3 = new X.9jO
            r8 = r3
            r9 = r2
            r10 = r25
            r11 = r6
            r12 = r7
            r13 = r4
            r8.<init>(r9, r10, r11, r12, r13)
            java.lang.String r1 = "Uri contained invalid fragment"
            X.926 r0 = new X.926
            r0.<init>(r3, r1, r5)
            throw r0
        L_0x054e:
            X.9jO r23 = new X.9jO
            r8 = r23
            r9 = r2
            r10 = r25
            r11 = r6
            r12 = r7
            r13 = r4
            r8.<init>(r9, r10, r11, r12, r13)
            return r23
        L_0x055c:
            r5 = move-exception
            X.9jO r1 = new X.9jO
            r12 = r4
            r7 = r1
            r8 = r2
            r9 = r25
            r10 = r6
            r11 = r4
            r7.<init>(r8, r9, r10, r11, r12)
            java.lang.String r0 = "Uri contained an invalid path"
            X.926 r3 = new X.926
            r3.<init>(r1, r0, r5)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201359jO.A01(java.lang.String, java.lang.String, java.text.BreakIterator, int, int):X.9jO");
    }
}
