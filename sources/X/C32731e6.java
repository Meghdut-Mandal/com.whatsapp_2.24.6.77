package X;

import java.util.Set;

/* renamed from: X.1e6  reason: invalid class name and case insensitive filesystem */
public class C32731e6 implements C32721e5 {
    public final AnonymousClass005 A00;
    public final C19730wQ A01;
    public final C18820ts A02;

    public Set BFr(AnonymousClass11F r3, AnonymousClass3T1 r4, String str) {
        if (str == null || r4.A1J.A02) {
            return null;
        }
        return A00(r3, str);
    }

    public C32731e6(C19730wQ r1, C18820ts r2, AnonymousClass005 r3) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x009e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set A00(X.AnonymousClass11F r14, java.lang.String r15) {
        /*
            r13 = this;
            android.net.Uri r0 = android.net.Uri.parse(r15)
            java.lang.String r4 = r0.getHost()
            if (r4 != 0) goto L_0x000c
            r8 = 0
        L_0x000b:
            return r8
        L_0x000c:
            boolean r0 = X.AnonymousClass143.A0I(r14)
            java.lang.String r7 = "ZZ"
            if (r0 != 0) goto L_0x003a
            r6 = r7
            if (r14 == 0) goto L_0x003a
            X.005 r3 = r13.A00     // Catch:{ 172 -> 0x003b }
            java.lang.Object r2 = r3.get()     // Catch:{ 172 -> 0x003b }
            X.9oI r2 = (X.C203559oI) r2     // Catch:{ 172 -> 0x003b }
            java.lang.String r1 = X.AnonymousClass3U8.A07(r14)     // Catch:{ 172 -> 0x003b }
            r0 = 0
            X.AUN r2 = r2.A0F(r1, r0)     // Catch:{ 172 -> 0x003b }
            int r0 = r2.countryCode_     // Catch:{ 172 -> 0x003b }
            java.lang.String r1 = java.lang.Integer.toString(r0)     // Catch:{ 172 -> 0x003b }
            r3.get()     // Catch:{ 172 -> 0x003b }
            java.lang.String r0 = X.C203559oI.A02(r2)     // Catch:{ 172 -> 0x003b }
            java.lang.String r6 = X.AnonymousClass1M4.A01(r1, r0)     // Catch:{ 172 -> 0x003b }
            goto L_0x003b
        L_0x003a:
            r6 = r7
        L_0x003b:
            X.0wQ r0 = r13.A01
            r0.A0G()
            com.whatsapp.Me r0 = r0.A00
            if (r0 == 0) goto L_0x004c
            java.lang.String r1 = r0.cc
            java.lang.String r0 = r0.number
            java.lang.String r7 = X.AnonymousClass1M4.A01(r1, r0)
        L_0x004c:
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            X.0ts r0 = r13.A02
            android.content.Context r0 = r0.A00
            java.util.Locale r3 = X.C18820ts.A01(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x0074
            android.os.LocaleList r2 = android.os.LocaleList.getDefault()
            r1 = 0
        L_0x0064:
            int r0 = r2.size()
            if (r1 >= r0) goto L_0x0074
            java.util.Locale r0 = r2.get(r1)
            r9.add(r0)
            int r1 = r1 + 1
            goto L_0x0064
        L_0x0074:
            r9.add(r3)
            java.util.HashSet r0 = X.AnonymousClass9BE.A03
            java.lang.String r0 = "\\."
            java.lang.String[] r10 = r4.split(r0)
            int r5 = r10.length
            r4 = 0
            r8 = 0
            r3 = r8
            r2 = 0
            r0 = 0
        L_0x0085:
            r12 = 1
            if (r2 >= r5) goto L_0x009e
            r1 = r10[r2]
            java.util.regex.Pattern r0 = X.AnonymousClass9BE.A00
            java.util.regex.Matcher r0 = r0.matcher(r1)
            boolean r0 = r0.matches()
            r12 = r12 ^ r0
            if (r12 == 0) goto L_0x009a
            if (r3 != 0) goto L_0x000b
            r3 = r1
        L_0x009a:
            int r2 = r2 + 1
            r0 = r12
            goto L_0x0085
        L_0x009e:
            if (r3 == 0) goto L_0x000b
            if (r0 != 0) goto L_0x000b
            int r2 = r3.length()
            r10 = 2
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r10)
            r5 = 0
        L_0x00ad:
            if (r5 >= r2) goto L_0x00de
            int r11 = r3.codePointAt(r5)
            if (r12 == 0) goto L_0x00c2
            java.util.HashSet r12 = X.AnonymousClass9BE.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            boolean r0 = r12.contains(r0)
            r12 = 1
            if (r0 != 0) goto L_0x00d8
        L_0x00c2:
            r12 = 0
            android.util.SparseArray r0 = X.AnonymousClass9BE.A01
            java.lang.Object r0 = r0.get(r11)
            if (r0 == 0) goto L_0x00d8
            int r0 = r1.size()
            if (r0 >= r10) goto L_0x000b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r1.add(r0)
        L_0x00d8:
            int r0 = java.lang.Character.charCount(r11)
            int r5 = r5 + r0
            goto L_0x00ad
        L_0x00de:
            if (r12 == 0) goto L_0x0123
            java.util.HashSet r1 = X.AnonymousClass9BE.A04
            boolean r0 = r1.contains(r7)
            if (r0 != 0) goto L_0x000b
            boolean r0 = r1.contains(r6)
            if (r0 != 0) goto L_0x000b
            java.util.Iterator r5 = r9.iterator()
        L_0x00f2:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x010b
            java.lang.Object r0 = r5.next()
            java.util.Locale r0 = (java.util.Locale) r0
            java.lang.String r1 = r0.getLanguage()
            java.util.HashSet r0 = X.AnonymousClass9BE.A05
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x00f2
            return r8
        L_0x010b:
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>(r2)
        L_0x0110:
            if (r4 >= r2) goto L_0x000b
            int r1 = r3.codePointAt(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r8.add(r0)
            int r0 = java.lang.Character.charCount(r1)
            int r4 = r4 + r0
            goto L_0x0110
        L_0x0123:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x000b
            int r0 = r1.size()
            X.00a r5 = new X.00a
            r5.<init>(r0)
            java.util.Iterator r10 = r1.iterator()
        L_0x0136:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x017d
            java.lang.Object r4 = r10.next()
            java.lang.Number r4 = (java.lang.Number) r4
            int r1 = r4.intValue()
            android.util.SparseArray r0 = X.AnonymousClass9BE.A01
            java.lang.Object r3 = r0.get(r1)
            X.9Hd r3 = (X.C192479Hd) r3
            java.util.Collection r1 = r3.A01
            boolean r0 = r1.contains(r7)
            if (r0 != 0) goto L_0x0136
            boolean r0 = r1.contains(r6)
            if (r0 != 0) goto L_0x0136
            java.util.Iterator r2 = r9.iterator()
        L_0x0160:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0179
            java.lang.Object r0 = r2.next()
            java.util.Locale r0 = (java.util.Locale) r0
            java.lang.String r1 = r0.getLanguage()
            java.util.Collection r0 = r3.A00
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0160
            goto L_0x0136
        L_0x0179:
            r5.add(r4)
            goto L_0x0136
        L_0x017d:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x000b
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32731e6.A00(X.11F, java.lang.String):java.util.Set");
    }
}
