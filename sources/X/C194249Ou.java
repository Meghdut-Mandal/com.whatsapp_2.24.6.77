package X;

/* renamed from: X.9Ou  reason: invalid class name and case insensitive filesystem */
public class C194249Ou {
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ab, code lost:
        r1 = X.AnonymousClass000.A0v("Scheme contains illegal character ");
        X.C165577te.A1P(r1, r2);
        r1.append(" at code point offset ");
        r0 = X.C165567td.A0O(r1, r3 - 1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A00(java.lang.String r15) {
        /*
            r14 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r15)     // Catch:{ 926 -> 0x00f8 }
            if (r0 != 0) goto L_0x00d8
            java.text.BreakIterator r5 = java.text.BreakIterator.getCharacterInstance()     // Catch:{ 926 -> 0x00f8 }
            r0 = 58
            int r7 = r15.indexOf(r0)     // Catch:{ 926 -> 0x00f8 }
            int r4 = r15.length()     // Catch:{ 926 -> 0x00f8 }
            r0 = 3
            int[] r3 = new int[r0]     // Catch:{ 926 -> 0x00f8 }
            r0 = 47
            r2 = 0
            int r0 = r15.indexOf(r0, r2)     // Catch:{ 926 -> 0x00f8 }
            r3[r2] = r0     // Catch:{ 926 -> 0x00f8 }
            r0 = 63
            int r1 = r15.indexOf(r0, r2)     // Catch:{ 926 -> 0x00f8 }
            r0 = 1
            r3[r0] = r1     // Catch:{ 926 -> 0x00f8 }
            r1 = 2
            r0 = 35
            int r0 = r15.indexOf(r0, r2)     // Catch:{ 926 -> 0x00f8 }
            r3[r1] = r0     // Catch:{ 926 -> 0x00f8 }
            int r0 = X.C201359jO.A00(r3, r4)     // Catch:{ 926 -> 0x00f8 }
            if (r7 < 0) goto L_0x00c7
            if (r7 > r0) goto L_0x00c7
            java.lang.String r10 = r15.substring(r2, r7)     // Catch:{ 926 -> 0x00f8 }
            boolean r0 = android.text.TextUtils.isEmpty(r10)     // Catch:{ IllegalArgumentException -> 0x00c4 }
            if (r0 != 0) goto L_0x00bd
            r5.setText(r10)     // Catch:{ IllegalArgumentException -> 0x00c4 }
            int r6 = r10.length()     // Catch:{ IllegalArgumentException -> 0x00c4 }
            int r2 = r5.current()     // Catch:{ IllegalArgumentException -> 0x00c4 }
            int r3 = r10.codePointAt(r2)     // Catch:{ IllegalArgumentException -> 0x00c4 }
            r0 = 65
            if (r3 < r0) goto L_0x0065
            r0 = 90
            if (r3 <= r0) goto L_0x0063
            r0 = 97
            if (r3 < r0) goto L_0x0065
            r0 = 122(0x7a, float:1.71E-43)
            if (r3 > r0) goto L_0x0065
        L_0x0063:
            r0 = 1
            goto L_0x0066
        L_0x0065:
            r0 = 0
        L_0x0066:
            java.lang.String r9 = "Scheme contains illegal character "
            r8 = 1
            if (r0 != 0) goto L_0x0079
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r9)     // Catch:{ IllegalArgumentException -> 0x00c4 }
            X.C165577te.A1P(r1, r3)     // Catch:{ IllegalArgumentException -> 0x00c4 }
            java.lang.String r0 = " at string index "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0d(r0, r1, r2)     // Catch:{ IllegalArgumentException -> 0x00c4 }
            goto L_0x00c3
        L_0x0079:
            int r3 = r5.next()     // Catch:{ IllegalArgumentException -> 0x00c4 }
            r0 = -1
            if (r3 == r0) goto L_0x00cd
            if (r3 >= r6) goto L_0x00cd
            int r2 = r10.codePointAt(r3)     // Catch:{ IllegalArgumentException -> 0x00c4 }
            r0 = 65
            if (r2 < r0) goto L_0x008b
            goto L_0x009e
        L_0x008b:
            r1 = 48
            r0 = 57
            if (r2 >= r1) goto L_0x00a8
            r0 = 43
            if (r2 == r0) goto L_0x0079
            r0 = 45
            if (r2 == r0) goto L_0x0079
            r0 = 46
            if (r2 != r0) goto L_0x00ab
            goto L_0x0079
        L_0x009e:
            r0 = 90
            if (r2 <= r0) goto L_0x0079
            r0 = 97
            if (r2 < r0) goto L_0x00ab
            r0 = 122(0x7a, float:1.71E-43)
        L_0x00a8:
            if (r2 > r0) goto L_0x00ab
            goto L_0x0079
        L_0x00ab:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r9)     // Catch:{ IllegalArgumentException -> 0x00c4 }
            X.C165577te.A1P(r1, r2)     // Catch:{ IllegalArgumentException -> 0x00c4 }
            java.lang.String r0 = " at code point offset "
            r1.append(r0)     // Catch:{ IllegalArgumentException -> 0x00c4 }
            int r3 = r3 - r8
            java.lang.IllegalArgumentException r0 = X.C165567td.A0O(r1, r3)     // Catch:{ IllegalArgumentException -> 0x00c4 }
            goto L_0x00c3
        L_0x00bd:
            java.lang.String r0 = "Scheme cannot be empty"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)     // Catch:{ IllegalArgumentException -> 0x00c4 }
        L_0x00c3:
            throw r0     // Catch:{ IllegalArgumentException -> 0x00c4 }
        L_0x00c4:
            r2 = move-exception
            r9 = 0
            goto L_0x00e8
        L_0x00c7:
            r0 = 0
            X.9jO r0 = X.C201359jO.A01(r15, r0, r5, r2, r4)     // Catch:{ 926 -> 0x00f8 }
            goto L_0x00d3
        L_0x00cd:
            int r0 = r7 + 1
            X.9jO r0 = X.C201359jO.A01(r15, r10, r5, r0, r4)     // Catch:{ 926 -> 0x00f8 }
        L_0x00d3:
            java.lang.String r0 = r0.toString()     // Catch:{ 926 -> 0x00f8 }
            return r0
        L_0x00d8:
            r1 = 0
            r3 = r1
            r4 = r1
            r5 = r1
            X.9jO r0 = new X.9jO     // Catch:{ 926 -> 0x00f8 }
            r2 = r1
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ 926 -> 0x00f8 }
            X.926 r1 = new X.926     // Catch:{ 926 -> 0x00f8 }
            r1.<init>(r0)     // Catch:{ 926 -> 0x00f8 }
            goto L_0x00f7
        L_0x00e8:
            r12 = r9
            r13 = r9
            X.9jO r8 = new X.9jO     // Catch:{ 926 -> 0x00f8 }
            r11 = r9
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ 926 -> 0x00f8 }
            java.lang.String r0 = "Uri contained an invalid scheme"
            X.926 r1 = new X.926     // Catch:{ 926 -> 0x00f8 }
            r1.<init>(r8, r0, r2)     // Catch:{ 926 -> 0x00f8 }
        L_0x00f7:
            throw r1     // Catch:{ 926 -> 0x00f8 }
        L_0x00f8:
            r0 = move-exception
            X.9jO r0 = r0.mParsedUri
            java.lang.String r0 = r0.A02()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C194249Ou.A00(java.lang.String):java.lang.String");
    }
}
