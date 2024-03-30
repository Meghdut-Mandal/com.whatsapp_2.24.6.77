package X;

/* renamed from: X.6pK  reason: invalid class name and case insensitive filesystem */
public final class C142716pK implements C19710wO {
    public final AnonymousClass005 A00;
    public final AnonymousClass005 A01;
    public final AnonymousClass005 A02;
    public final AnonymousClass005 A03;
    public final AnonymousClass005 A04;
    public final AnonymousClass005 A05;
    public final AnonymousClass005 A06;

    public String BIB() {
        return "AccountSwitchingAsyncInit";
    }

    public C142716pK(AnonymousClass005 r1, AnonymousClass005 r2, AnonymousClass005 r3, AnonymousClass005 r4, AnonymousClass005 r5, AnonymousClass005 r6, AnonymousClass005 r7) {
        C36321k7.A1B(r1, r2, r3, r4, r5);
        C36321k7.A10(r6, r7);
        this.A03 = r1;
        this.A01 = r2;
        this.A05 = r3;
        this.A06 = r4;
        this.A02 = r5;
        this.A00 = r6;
        this.A04 = r7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0055, code lost:
        if (r0.length == 0) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BRL() {
        /*
            r10 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r3 = "AccountSwitchingAsyncInit"
            r1.append(r3)
            java.lang.String r0 = "/onAsyncInitAnyUserState"
            X.C36321k7.A1a(r1, r0)
            X.005 r0 = r10.A06
            java.lang.Object r1 = r0.get()
            X.0v0 r1 = (X.C19420v0) r1
            X.005 r7 = r10.A02
            java.util.List r0 = X.AnonymousClass6C2.A00(r7)
            int r0 = r0.size()
            r1.A1D(r0)
            X.005 r0 = r10.A01
            java.lang.Object r0 = r0.get()
            X.1RU r0 = (X.AnonymousClass1RU) r0
            boolean r0 = r0.A0B()
            if (r0 == 0) goto L_0x01c4
            X.005 r8 = r10.A00     // Catch:{ RuntimeException -> 0x017c }
            java.lang.Object r0 = r8.get()     // Catch:{ RuntimeException -> 0x017c }
            X.6Xy r0 = (X.C133346Xy) r0     // Catch:{ RuntimeException -> 0x017c }
            X.00T r0 = r0.A06     // Catch:{ RuntimeException -> 0x017c }
            java.lang.Object r0 = r0.getValue()     // Catch:{ RuntimeException -> 0x017c }
            java.io.File r0 = (java.io.File) r0     // Catch:{ RuntimeException -> 0x017c }
            java.io.File[] r6 = r0.listFiles()     // Catch:{ RuntimeException -> 0x017c }
            if (r6 == 0) goto L_0x00a0
            int r5 = r6.length     // Catch:{ RuntimeException -> 0x017c }
            if (r5 == 0) goto L_0x00a0
            r4 = 0
        L_0x004b:
            r9 = r6[r4]     // Catch:{ RuntimeException -> 0x017c }
            java.io.File[] r0 = r9.listFiles()     // Catch:{ RuntimeException -> 0x017c }
            if (r0 == 0) goto L_0x0057
            int r0 = r0.length     // Catch:{ RuntimeException -> 0x017c }
            r1 = 0
            if (r0 != 0) goto L_0x0058
        L_0x0057:
            r1 = 1
        L_0x0058:
            r0 = 47
            if (r1 == 0) goto L_0x007e
            boolean r2 = r9.delete()     // Catch:{ RuntimeException -> 0x017c }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r3)     // Catch:{ RuntimeException -> 0x017c }
            r1.append(r0)     // Catch:{ RuntimeException -> 0x017c }
            java.lang.String r0 = r9.getName()     // Catch:{ RuntimeException -> 0x017c }
            X.AnonymousClass00C.A08(r0)     // Catch:{ RuntimeException -> 0x017c }
            java.lang.String r0 = X.AnonymousClass3LV.A01(r0)     // Catch:{ RuntimeException -> 0x017c }
            r1.append(r0)     // Catch:{ RuntimeException -> 0x017c }
            java.lang.String r0 = " is empty/delete: "
            r1.append(r0)     // Catch:{ RuntimeException -> 0x017c }
            r1.append(r2)     // Catch:{ RuntimeException -> 0x017c }
            goto L_0x0098
        L_0x007e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r3)     // Catch:{ RuntimeException -> 0x017c }
            r1.append(r0)     // Catch:{ RuntimeException -> 0x017c }
            java.lang.String r0 = r9.getName()     // Catch:{ RuntimeException -> 0x017c }
            X.AnonymousClass00C.A08(r0)     // Catch:{ RuntimeException -> 0x017c }
            java.lang.String r0 = X.AnonymousClass3LV.A01(r0)     // Catch:{ RuntimeException -> 0x017c }
            r1.append(r0)     // Catch:{ RuntimeException -> 0x017c }
            java.lang.String r0 = " is non empty"
            r1.append(r0)     // Catch:{ RuntimeException -> 0x017c }
        L_0x0098:
            X.C36411kG.A1P(r1)     // Catch:{ RuntimeException -> 0x017c }
            int r4 = r4 + 1
            if (r4 >= r5) goto L_0x00a9
            goto L_0x004b
        L_0x00a0:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r3)     // Catch:{ RuntimeException -> 0x017c }
            java.lang.String r0 = "/stagingAccountFolders null or empty"
            X.C36321k7.A1a(r1, r0)     // Catch:{ RuntimeException -> 0x017c }
        L_0x00a9:
            java.lang.Object r0 = r8.get()     // Catch:{ RuntimeException -> 0x017c }
            X.6Xy r0 = (X.C133346Xy) r0     // Catch:{ RuntimeException -> 0x017c }
            java.util.List r1 = r0.A0A()     // Catch:{ RuntimeException -> 0x017c }
            boolean r0 = r1.isEmpty()     // Catch:{ RuntimeException -> 0x017c }
            r5 = 0
            if (r0 == 0) goto L_0x0111
            java.util.List r0 = X.AnonymousClass6C2.A00(r7)     // Catch:{ RuntimeException -> 0x017c }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ RuntimeException -> 0x017c }
        L_0x00c2:
            boolean r0 = r8.hasNext()     // Catch:{ RuntimeException -> 0x017c }
            if (r0 == 0) goto L_0x0180
            java.lang.Object r2 = r8.next()     // Catch:{ RuntimeException -> 0x017c }
            X.3KU r2 = (X.AnonymousClass3KU) r2     // Catch:{ RuntimeException -> 0x017c }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ RuntimeException -> 0x017c }
            java.lang.String r0 = "staged dir not found for: {"
            r1.append(r0)     // Catch:{ RuntimeException -> 0x017c }
            X.AnonymousClass00C.A0D(r2, r5)     // Catch:{ RuntimeException -> 0x017c }
            java.lang.String r6 = r2.A08     // Catch:{ RuntimeException -> 0x017c }
            java.lang.String r0 = X.AnonymousClass3LV.A01(r6)     // Catch:{ RuntimeException -> 0x017c }
            r1.append(r0)     // Catch:{ RuntimeException -> 0x017c }
            java.lang.String r0 = "}, removing entry from data repo"
            java.lang.String r4 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ RuntimeException -> 0x017c }
            X.005 r0 = r10.A03     // Catch:{ RuntimeException -> 0x017c }
            java.lang.Object r2 = r0.get()     // Catch:{ RuntimeException -> 0x017c }
            X.0wN r2 = (X.C19700wN) r2     // Catch:{ RuntimeException -> 0x017c }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r3)     // Catch:{ RuntimeException -> 0x017c }
            java.lang.String r0 = "/staged dir not found"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ RuntimeException -> 0x017c }
            r2.A0E(r0, r4, r5)     // Catch:{ RuntimeException -> 0x017c }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r3)     // Catch:{ RuntimeException -> 0x017c }
            java.lang.String r0 = "/onAsyncInitAnyUserState/"
            X.C36321k7.A1Q(r0, r4, r1)     // Catch:{ RuntimeException -> 0x017c }
            java.lang.Object r0 = r7.get()     // Catch:{ RuntimeException -> 0x017c }
            X.1Z0 r0 = (X.AnonymousClass1Z0) r0     // Catch:{ RuntimeException -> 0x017c }
            r0.A09(r6)     // Catch:{ RuntimeException -> 0x017c }
            goto L_0x00c2
        L_0x0111:
            java.util.List r4 = X.AnonymousClass6C2.A00(r7)     // Catch:{ RuntimeException -> 0x017c }
            java.util.Iterator r7 = r1.iterator()     // Catch:{ RuntimeException -> 0x017c }
        L_0x0119:
            boolean r0 = r7.hasNext()     // Catch:{ RuntimeException -> 0x017c }
            if (r0 == 0) goto L_0x0180
            java.lang.String r6 = X.AnonymousClass001.A0C(r7)     // Catch:{ RuntimeException -> 0x017c }
            boolean r0 = r4 instanceof java.util.Collection     // Catch:{ RuntimeException -> 0x017c }
            if (r0 == 0) goto L_0x0156
            boolean r0 = r4.isEmpty()     // Catch:{ RuntimeException -> 0x017c }
            if (r0 == 0) goto L_0x0156
        L_0x012d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r6)     // Catch:{ RuntimeException -> 0x017c }
            java.lang.String r0 = " staged dir found, but accounts data repo entry not found"
            java.lang.String r6 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ RuntimeException -> 0x017c }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r3)     // Catch:{ RuntimeException -> 0x017c }
            java.lang.String r0 = "/onAsyncInitAnyUserState: "
            X.C36321k7.A1P(r0, r6, r1)     // Catch:{ RuntimeException -> 0x017c }
            X.005 r0 = r10.A03     // Catch:{ RuntimeException -> 0x017c }
            java.lang.Object r2 = r0.get()     // Catch:{ RuntimeException -> 0x017c }
            X.0wN r2 = (X.C19700wN) r2     // Catch:{ RuntimeException -> 0x017c }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r3)     // Catch:{ RuntimeException -> 0x017c }
            java.lang.String r0 = "/accounts data repo entry not found"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ RuntimeException -> 0x017c }
            r2.A0E(r0, r6, r5)     // Catch:{ RuntimeException -> 0x017c }
            goto L_0x0119
        L_0x0156:
            java.util.Iterator r2 = r4.iterator()     // Catch:{ RuntimeException -> 0x017c }
            r1 = 0
        L_0x015b:
            boolean r0 = r2.hasNext()     // Catch:{ RuntimeException -> 0x017c }
            if (r0 == 0) goto L_0x0174
            java.lang.Object r0 = r2.next()     // Catch:{ RuntimeException -> 0x017c }
            X.3KU r0 = (X.AnonymousClass3KU) r0     // Catch:{ RuntimeException -> 0x017c }
            java.lang.String r0 = r0.A08     // Catch:{ RuntimeException -> 0x017c }
            boolean r0 = X.AnonymousClass00C.A0J(r0, r6)     // Catch:{ RuntimeException -> 0x017c }
            if (r0 == 0) goto L_0x015b
            int r1 = r1 + 1
            if (r1 >= 0) goto L_0x015b
            goto L_0x0177
        L_0x0174:
            if (r1 > 0) goto L_0x0119
            goto L_0x012d
        L_0x0177:
            java.lang.RuntimeException r0 = X.C36371kC.A0s()     // Catch:{ RuntimeException -> 0x017c }
            throw r0     // Catch:{ RuntimeException -> 0x017c }
        L_0x017c:
            r0 = move-exception
            com.whatsapp.util.Log.e(r3, r0)
        L_0x0180:
            X.005 r0 = r10.A04
            java.lang.Object r5 = r0.get()
            X.6V1 r5 = (X.AnonymousClass6V1) r5
            java.lang.String r0 = "InactiveAccountNotificationManager/processDailyNotificationsDeletion"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1RU r0 = r5.A00
            X.3KU r0 = r0.A03()
            if (r0 == 0) goto L_0x01a2
            java.lang.String r3 = r0.A08
            X.6On r2 = r5.A02
            X.0wo r0 = r5.A06
            long r0 = X.C19970wo.A00(r0)
            r2.A02(r3, r0)
        L_0x01a2:
            X.1Z0 r0 = r5.A01
            X.6C2 r0 = X.AnonymousClass1Z0.A00(r0)
            java.util.List r0 = r0.A01
            java.util.Iterator r4 = r0.iterator()
        L_0x01ae:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x01c4
            java.lang.Object r0 = r4.next()
            X.3KU r0 = (X.AnonymousClass3KU) r0
            X.6On r3 = r5.A02
            java.lang.String r2 = r0.A08
            long r0 = r0.A05
            r3.A02(r2, r0)
            goto L_0x01ae
        L_0x01c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C142716pK.BRL():void");
    }

    public void BRM() {
        AnonymousClass3KU A032;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AccountSwitchingAsyncInit");
        C36321k7.A1a(A0u, "/onAsyncInitUserRegisteredAndDbReady");
        AnonymousClass005 r1 = this.A01;
        if (((AnonymousClass1RU) r1.get()).A0B() && (A032 = ((AnonymousClass1RU) r1.get()).A03()) != null) {
            String str = A032.A08;
            ((AnonymousClass6V1) this.A04.get()).A04(str);
            if (((AnonymousClass1EY) this.A05.get()).A0D()) {
                ((AnonymousClass1Z0) this.A02.get()).A07(str);
                return;
            }
            AnonymousClass005 r2 = this.A02;
            if (AnonymousClass00C.A0J(str, AnonymousClass1Z0.A00((AnonymousClass1Z0) r2.get()).A00)) {
                C36321k7.A1a(AnonymousClass000.A0v("AccountSwitchingAsyncInit"), "/onAsyncInitUserRegisteredAndDbReady/removing paymentsOnboardedLid");
                ((AnonymousClass1Z0) r2.get()).A07((String) null);
            }
        }
    }
}
