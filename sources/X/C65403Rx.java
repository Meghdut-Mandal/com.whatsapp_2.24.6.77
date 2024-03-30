package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Rx  reason: invalid class name and case insensitive filesystem */
public final class C65403Rx {
    public final C19630wG A00;
    public final C25271Fq A01;
    public final C20810yC A02;
    public final AnonymousClass1J3 A03;
    public final AnonymousClass1J1 A04;
    public final AnonymousClass37A A05;
    public final AnonymousClass619 A06;
    public final AnonymousClass1TH A07;
    public final AnonymousClass005 A08;
    public final C19970wo A09;
    public final AnonymousClass1TG A0A;

    public static final Object A00(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A01(X.AnonymousClass4UU r9, X.AnonymousClass3QE r10) {
        /*
            r8 = this;
            X.0yC r1 = r8.A02
            r0 = 3460(0xd84, float:4.848E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x001c
            boolean r0 = r9.BHV()
            if (r0 == 0) goto L_0x001c
            boolean r0 = r9.BHG()
            if (r0 == 0) goto L_0x001d
            boolean r0 = X.C18750th.A0C()
            if (r0 != 0) goto L_0x001d
        L_0x001c:
            return
        L_0x001d:
            java.lang.String r0 = r10.A00
            r4 = 0
            if (r0 == 0) goto L_0x0090
            java.util.List r1 = X.C36371kC.A11(r0)
        L_0x0026:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
        L_0x0028:
            java.util.Iterator r7 = r1.iterator()
        L_0x002c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x001c
            java.lang.String r6 = X.AnonymousClass001.A0C(r7)
            java.lang.String r5 = r9.BAo()
            X.3oE r0 = X.C76043oE.A07
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0062
            X.619 r0 = r8.A06
            java.util.ArrayList r2 = r0.A00(r6)
            java.lang.String r1 = ", "
            java.lang.String r0 = ""
            java.lang.String r0 = X.C007103b.A0Q(r1, r0, r0, r2, r4)
            if (r5 == 0) goto L_0x008e
            r1 = 1
            java.lang.Object[] r0 = X.C36431kI.A1Z(r0, r1)
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r5 = java.lang.String.format(r5, r0)
            X.AnonymousClass00C.A08(r5)
        L_0x0062:
            X.0wG r0 = r8.A00
            android.content.Context r3 = r0.A00
            X.AnonymousClass00C.A08(r3)
            r0 = 2
            X.AnonymousClass00C.A0D(r6, r0)
            android.content.Intent r2 = X.C36431kI.A0D()
            r2.setPackage(r6)
            java.lang.String r0 = "com.whatsapp.otp.OTP_ERROR"
            r2.setAction(r0)
            java.lang.String r1 = r9.BDM()
            java.lang.String r0 = "error"
            r2.putExtra(r0, r1)
            java.lang.String r0 = "error_message"
            r2.putExtra(r0, r5)
            X.C54922tm.A00(r3, r2)
            r3.sendBroadcast(r2)
            goto L_0x002c
        L_0x008e:
            r5 = r4
            goto L_0x0062
        L_0x0090:
            java.util.Set r1 = r10.A02
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0026
            java.util.Set r1 = r10.A03
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0026
            java.util.Set r1 = r10.A01
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65403Rx.A01(X.4UU, X.3QE):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: X.3oD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: X.3oD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: X.3oD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: X.3oD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: X.3oE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: X.3oE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: X.3oE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: X.3oE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: X.3oE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: X.3oE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v24, resolved type: X.3oE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v25, resolved type: X.3oE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v26, resolved type: X.3oE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v27, resolved type: X.3oE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v28, resolved type: X.3oE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v29, resolved type: X.3oE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v30, resolved type: X.3oE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v32, resolved type: X.3oE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v33, resolved type: X.3oE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v34, resolved type: X.3oE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v35, resolved type: X.3oE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v36, resolved type: X.3oE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v39, resolved type: X.3oE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: X.3oD} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x022a A[Catch:{ all -> 0x03c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x022e A[Catch:{ all -> 0x03c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x031f A[Catch:{ all -> 0x03c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0327 A[Catch:{ all -> 0x03c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x033f A[Catch:{ all -> 0x03c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0348 A[Catch:{ all -> 0x03c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0383 A[Catch:{ all -> 0x03c2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.AnonymousClass3T1 r24) {
        /*
            r23 = this;
            r0 = r23
            r22 = r24
            X.3Tk r2 = X.C65773Tk.A00     // Catch:{ all -> 0x03c2 }
            X.0yC r8 = r0.A02     // Catch:{ all -> 0x03c2 }
            r1 = r22
            X.3P8 r7 = X.C65773Tk.A00(r8, r1)     // Catch:{ all -> 0x03c2 }
            if (r7 == 0) goto L_0x03eb
            java.lang.Integer r1 = r2.A04(r8, r7)     // Catch:{ all -> 0x03c2 }
            if (r1 == 0) goto L_0x03eb
            int r6 = r1.intValue()     // Catch:{ all -> 0x03c2 }
            r5 = 0
            r4 = 2
            if (r6 != r4) goto L_0x0033
            java.util.concurrent.atomic.AtomicInteger r1 = r7.A0A     // Catch:{ all -> 0x03c2 }
            r1.set(r4)     // Catch:{ all -> 0x03c2 }
            X.1J1 r1 = r0.A04     // Catch:{ all -> 0x03c2 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x03c2 }
            r4 = 0
            r7 = 4
            r6 = r4
            r2 = r22
            r5 = r4
            X.AnonymousClass1J1.A01(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x03c2 }
            return
        L_0x0033:
            X.1J3 r1 = r0.A03     // Catch:{ all -> 0x03c2 }
            X.0yC r3 = r1.A00     // Catch:{ all -> 0x03c2 }
            r1 = 1023(0x3ff, float:1.434E-42)
            boolean r1 = r3.A0E(r1)     // Catch:{ all -> 0x03c2 }
            if (r1 != 0) goto L_0x03aa
            r1 = 6174(0x181e, float:8.652E-42)
            boolean r1 = r3.A0E(r1)     // Catch:{ all -> 0x03c2 }
            if (r1 != 0) goto L_0x03aa
            r1 = r22
            X.3Qa r1 = r1.A1J     // Catch:{ all -> 0x03c2 }
            X.11F r2 = r1.A00     // Catch:{ all -> 0x03c2 }
            r1 = 1
            if (r6 != r1) goto L_0x007e
            r1 = 3176(0xc68, float:4.45E-42)
            boolean r1 = r3.A0E(r1)     // Catch:{ all -> 0x03c2 }
            if (r1 != 0) goto L_0x007e
            X.3oD r2 = X.C76033oD.A04     // Catch:{ all -> 0x03c2 }
        L_0x005a:
            boolean r9 = X.C65773Tk.A02(r8, r7)     // Catch:{ all -> 0x03c2 }
            r1 = 0
            if (r9 == 0) goto L_0x00f4
            java.lang.String r9 = r7.A01     // Catch:{ all -> 0x03c2 }
            android.net.Uri r10 = com.whatsapp.wamsys.SecureUriParser.parseEncodedRFC2396(r9)     // Catch:{ all -> 0x03c2 }
            if (r10 == 0) goto L_0x00f4
            java.lang.String r1 = "cta_display_name"
            java.lang.String r13 = r10.getQueryParameter(r1)     // Catch:{ all -> 0x03c2 }
            java.lang.String r1 = r7.A01     // Catch:{ all -> 0x03c2 }
            android.net.Uri r9 = android.net.Uri.parse(r1)     // Catch:{ all -> 0x03c2 }
            java.lang.String r1 = "code_expiration_minutes"
            java.lang.String r1 = r9.getQueryParameter(r1)     // Catch:{ all -> 0x03c2 }
            if (r1 != 0) goto L_0x00a9
            goto L_0x00a6
        L_0x007e:
            X.1Fq r1 = r0.A01     // Catch:{ all -> 0x03c2 }
            X.03c r1 = r1.A00     // Catch:{ all -> 0x03c2 }
            boolean r1 = r1.A01()     // Catch:{ all -> 0x03c2 }
            if (r1 != 0) goto L_0x008b
            X.3oD r2 = X.C76033oD.A03     // Catch:{ all -> 0x03c2 }
            goto L_0x005a
        L_0x008b:
            if (r2 == 0) goto L_0x00a4
            X.005 r1 = r0.A08     // Catch:{ all -> 0x03c2 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x03c2 }
            X.0xw r1 = (X.C20670xw) r1     // Catch:{ all -> 0x03c2 }
            X.1CR r1 = r1.A04     // Catch:{ all -> 0x03c2 }
            X.3LI r1 = X.C36361kB.A0d(r2, r1)     // Catch:{ all -> 0x03c2 }
            boolean r1 = r1.A0A()     // Catch:{ all -> 0x03c2 }
            if (r1 == 0) goto L_0x00a4
            X.3oD r2 = X.C76033oD.A02     // Catch:{ all -> 0x03c2 }
            goto L_0x005a
        L_0x00a4:
            r2 = 0
            goto L_0x005a
        L_0x00a6:
            r16 = 10
            goto L_0x00ad
        L_0x00a9:
            long r16 = java.lang.Long.parseLong(r1)     // Catch:{ all -> 0x03c2 }
        L_0x00ad:
            r1 = 5742(0x166e, float:8.046E-42)
            boolean r12 = r8.A0E(r1)     // Catch:{ all -> 0x03c2 }
            java.lang.String r11 = "signature_hash"
            java.lang.String r1 = "package_name"
            java.lang.String r9 = r10.getQueryParameter(r1)     // Catch:{ all -> 0x03c2 }
            if (r12 == 0) goto L_0x00ca
            r12 = 44
            if (r9 == 0) goto L_0x00de
            java.lang.String r1 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x03c2 }
            java.util.List r14 = X.AnonymousClass099.A0K(r9, r1, r5)     // Catch:{ all -> 0x03c2 }
            goto L_0x00e0
        L_0x00ca:
            java.lang.String r1 = r10.getQueryParameter(r11)     // Catch:{ all -> 0x03c2 }
            if (r9 == 0) goto L_0x00d5
            java.util.List r14 = X.C36371kC.A11(r9)     // Catch:{ all -> 0x03c2 }
            goto L_0x00d7
        L_0x00d5:
            X.09w r14 = X.C023409w.A00     // Catch:{ all -> 0x03c2 }
        L_0x00d7:
            if (r1 == 0) goto L_0x025b
            java.util.List r15 = X.C36371kC.A11(r1)     // Catch:{ all -> 0x03c2 }
            goto L_0x00ee
        L_0x00de:
            X.09w r14 = X.C023409w.A00     // Catch:{ all -> 0x03c2 }
        L_0x00e0:
            java.lang.String r9 = r10.getQueryParameter(r11)     // Catch:{ all -> 0x03c2 }
            if (r9 == 0) goto L_0x025b
            java.lang.String r1 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x03c2 }
            java.util.List r15 = X.AnonymousClass099.A0K(r9, r1, r5)     // Catch:{ all -> 0x03c2 }
        L_0x00ee:
            X.3Jj r1 = new X.3Jj     // Catch:{ all -> 0x03c2 }
            r12 = r1
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x03c2 }
        L_0x00f4:
            X.37A r13 = r0.A05     // Catch:{ all -> 0x03c2 }
            if (r1 != 0) goto L_0x0127
            r11 = 0
            X.02c r10 = X.C004702c.A00     // Catch:{ all -> 0x03c2 }
            X.3QE r9 = new X.3QE     // Catch:{ all -> 0x03c2 }
            r9.<init>(r11, r10, r10, r10)     // Catch:{ all -> 0x03c2 }
            X.3oE r10 = X.C76043oE.A0A     // Catch:{ all -> 0x03c2 }
        L_0x0102:
            java.lang.String r13 = r9.A00     // Catch:{ all -> 0x03c2 }
            r12 = r13
            if (r13 != 0) goto L_0x025f
            java.util.Set r11 = r9.A02     // Catch:{ all -> 0x03c2 }
            java.lang.Object r13 = A00(r11)     // Catch:{ all -> 0x03c2 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x03c2 }
            if (r13 != 0) goto L_0x025f
            java.util.Set r11 = r9.A03     // Catch:{ all -> 0x03c2 }
            java.lang.Object r13 = A00(r11)     // Catch:{ all -> 0x03c2 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x03c2 }
            if (r13 != 0) goto L_0x025f
            java.util.Set r11 = r9.A01     // Catch:{ all -> 0x03c2 }
            java.lang.Object r13 = A00(r11)     // Catch:{ all -> 0x03c2 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x03c2 }
            if (r13 != 0) goto L_0x025f
            goto L_0x0268
        L_0x0127:
            java.util.List r9 = r1.A02     // Catch:{ all -> 0x03c2 }
            r21 = r9
            java.util.Set r20 = X.C007103b.A0f(r21)     // Catch:{ all -> 0x03c2 }
            java.util.ArrayList r12 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x03c2 }
            java.util.Iterator r14 = r20.iterator()     // Catch:{ all -> 0x03c2 }
        L_0x0137:
            boolean r9 = r14.hasNext()     // Catch:{ all -> 0x03c2 }
            if (r9 == 0) goto L_0x0155
            java.lang.Object r11 = r14.next()     // Catch:{ all -> 0x03c2 }
            r10 = r11
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x03c2 }
            X.1TH r9 = r13.A01     // Catch:{ all -> 0x03c2 }
            X.AnonymousClass00C.A0D(r10, r5)     // Catch:{ all -> 0x03c2 }
            java.util.Map r9 = r9.A02     // Catch:{ all -> 0x03c2 }
            boolean r9 = r9.containsKey(r10)     // Catch:{ all -> 0x03c2 }
            if (r9 == 0) goto L_0x0137
            r12.add(r11)     // Catch:{ all -> 0x03c2 }
            goto L_0x0137
        L_0x0155:
            java.util.Set r12 = X.C007103b.A0f(r12)     // Catch:{ all -> 0x03c2 }
            java.util.ArrayList r14 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x03c2 }
            java.util.Iterator r19 = r12.iterator()     // Catch:{ all -> 0x03c2 }
        L_0x0161:
            boolean r9 = r19.hasNext()     // Catch:{ all -> 0x03c2 }
            if (r9 == 0) goto L_0x019a
            java.lang.Object r11 = r19.next()     // Catch:{ all -> 0x03c2 }
            r10 = r11
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x03c2 }
            long r17 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x03c2 }
            X.1TH r9 = r13.A01     // Catch:{ all -> 0x03c2 }
            X.AnonymousClass00C.A0D(r10, r5)     // Catch:{ all -> 0x03c2 }
            java.util.Map r9 = r9.A02     // Catch:{ all -> 0x03c2 }
            java.lang.Object r9 = r9.get(r10)     // Catch:{ all -> 0x03c2 }
            java.lang.Long r9 = (java.lang.Long) r9     // Catch:{ all -> 0x03c2 }
            if (r9 == 0) goto L_0x0197
            long r9 = r9.longValue()     // Catch:{ all -> 0x03c2 }
        L_0x0185:
            long r17 = r17 - r9
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.MINUTES     // Catch:{ all -> 0x03c2 }
            long r9 = r1.A00     // Catch:{ all -> 0x03c2 }
            long r15 = r15.toMillis(r9)     // Catch:{ all -> 0x03c2 }
            int r9 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r9 > 0) goto L_0x0161
            r14.add(r11)     // Catch:{ all -> 0x03c2 }
            goto L_0x0161
        L_0x0197:
            r9 = 0
            goto L_0x0185
        L_0x019a:
            java.util.Set r14 = X.C007103b.A0f(r14)     // Catch:{ all -> 0x03c2 }
            java.lang.Object r11 = A00(r14)     // Catch:{ all -> 0x03c2 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x03c2 }
            if (r11 == 0) goto L_0x01fc
            java.util.ArrayList r15 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x03c2 }
            r10 = 0
            java.util.Iterator r17 = r21.iterator()     // Catch:{ all -> 0x03c2 }
        L_0x01af:
            boolean r9 = r17.hasNext()     // Catch:{ all -> 0x03c2 }
            if (r9 == 0) goto L_0x01d4
            java.lang.Object r9 = r17.next()     // Catch:{ all -> 0x03c2 }
            int r16 = r10 + 1
            if (r10 >= 0) goto L_0x01c2
            java.lang.RuntimeException r1 = X.C36351kA.A0v()     // Catch:{ all -> 0x03c2 }
            throw r1     // Catch:{ all -> 0x03c2 }
        L_0x01c2:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x03c2 }
            boolean r9 = X.AnonymousClass00C.A0J(r9, r11)     // Catch:{ all -> 0x03c2 }
            if (r9 == 0) goto L_0x01d1
            if (r10 == 0) goto L_0x01d1
            r15.add(r10)     // Catch:{ all -> 0x03c2 }
        L_0x01d1:
            r10 = r16
            goto L_0x01af
        L_0x01d4:
            java.util.ArrayList r10 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x03c2 }
            java.util.Iterator r16 = r15.iterator()     // Catch:{ all -> 0x03c2 }
        L_0x01dc:
            boolean r9 = r16.hasNext()     // Catch:{ all -> 0x03c2 }
            if (r9 == 0) goto L_0x01f2
            int r15 = X.C36341k9.A0A(r16)     // Catch:{ all -> 0x03c2 }
            java.util.List r9 = r1.A03     // Catch:{ all -> 0x03c2 }
            java.lang.Object r9 = X.C007103b.A0P(r9, r15)     // Catch:{ all -> 0x03c2 }
            if (r9 == 0) goto L_0x01dc
            r10.add(r9)     // Catch:{ all -> 0x03c2 }
            goto L_0x01dc
        L_0x01f2:
            boolean r9 = r10 instanceof java.util.Collection     // Catch:{ all -> 0x03c2 }
            if (r9 == 0) goto L_0x01fe
            boolean r9 = r10.isEmpty()     // Catch:{ all -> 0x03c2 }
            if (r9 == 0) goto L_0x01fe
        L_0x01fc:
            r11 = 0
            goto L_0x021c
        L_0x01fe:
            java.util.Iterator r16 = r10.iterator()     // Catch:{ all -> 0x03c2 }
        L_0x0202:
            boolean r9 = r16.hasNext()     // Catch:{ all -> 0x03c2 }
            if (r9 == 0) goto L_0x01fc
            java.lang.String r10 = X.AnonymousClass001.A0C(r16)     // Catch:{ all -> 0x03c2 }
            X.619 r15 = r13.A00     // Catch:{ all -> 0x03c2 }
            r9 = 1
            X.AnonymousClass00C.A0D(r10, r9)     // Catch:{ all -> 0x03c2 }
            java.util.ArrayList r9 = r15.A00(r11)     // Catch:{ all -> 0x03c2 }
            boolean r9 = r9.contains(r10)     // Catch:{ all -> 0x03c2 }
            if (r9 == 0) goto L_0x0202
        L_0x021c:
            X.3QE r9 = new X.3QE     // Catch:{ all -> 0x03c2 }
            r10 = r20
            r9.<init>(r11, r10, r12, r14)     // Catch:{ all -> 0x03c2 }
            r12 = 1
            boolean r10 = r21.isEmpty()     // Catch:{ all -> 0x03c2 }
            if (r10 == 0) goto L_0x022e
            X.3oE r10 = X.C76043oE.A09     // Catch:{ all -> 0x03c2 }
            goto L_0x0102
        L_0x022e:
            java.util.Set r10 = r9.A03     // Catch:{ all -> 0x03c2 }
            boolean r10 = r10.isEmpty()     // Catch:{ all -> 0x03c2 }
            if (r10 == 0) goto L_0x023a
            X.3oE r10 = X.C76043oE.A08     // Catch:{ all -> 0x03c2 }
            goto L_0x0102
        L_0x023a:
            java.util.Set r11 = r9.A02     // Catch:{ all -> 0x03c2 }
            boolean r10 = r11.isEmpty()     // Catch:{ all -> 0x03c2 }
            if (r10 == 0) goto L_0x0246
            X.3oE r10 = X.C76043oE.A0B     // Catch:{ all -> 0x03c2 }
            goto L_0x0102
        L_0x0246:
            int r10 = r11.size()     // Catch:{ all -> 0x03c2 }
            if (r10 <= r12) goto L_0x0250
            X.3oE r10 = X.C76043oE.A05     // Catch:{ all -> 0x03c2 }
            goto L_0x0102
        L_0x0250:
            java.lang.String r10 = r9.A00     // Catch:{ all -> 0x03c2 }
            if (r10 != 0) goto L_0x0258
            X.3oE r10 = X.C76043oE.A07     // Catch:{ all -> 0x03c2 }
            goto L_0x0102
        L_0x0258:
            r10 = 0
            goto L_0x0102
        L_0x025b:
            X.09w r15 = X.C023409w.A00     // Catch:{ all -> 0x03c2 }
            goto L_0x00ee
        L_0x025f:
            X.1TH r11 = r0.A07     // Catch:{ all -> 0x03c2 }
            java.util.Map r11 = r11.A00     // Catch:{ all -> 0x03c2 }
            java.lang.String r17 = X.C36431kI.A1A(r13, r11)     // Catch:{ all -> 0x03c2 }
            goto L_0x026a
        L_0x0268:
            r17 = 0
        L_0x026a:
            r13 = r12
            if (r12 != 0) goto L_0x028e
            java.util.Set r11 = r9.A02     // Catch:{ all -> 0x03c2 }
            java.lang.Object r13 = A00(r11)     // Catch:{ all -> 0x03c2 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x03c2 }
            if (r13 != 0) goto L_0x028e
            java.util.Set r11 = r9.A03     // Catch:{ all -> 0x03c2 }
            java.lang.Object r13 = A00(r11)     // Catch:{ all -> 0x03c2 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x03c2 }
            if (r13 != 0) goto L_0x028e
            java.util.Set r11 = r9.A01     // Catch:{ all -> 0x03c2 }
            java.lang.Object r13 = A00(r11)     // Catch:{ all -> 0x03c2 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x03c2 }
            if (r13 != 0) goto L_0x028e
            r16 = 0
            goto L_0x02a7
        L_0x028e:
            long r15 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x03c2 }
            X.1TH r11 = r0.A07     // Catch:{ all -> 0x03c2 }
            java.util.Map r11 = r11.A02     // Catch:{ all -> 0x03c2 }
            java.lang.Object r11 = r11.get(r13)     // Catch:{ all -> 0x03c2 }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x03c2 }
            if (r11 == 0) goto L_0x02b4
            long r13 = r11.longValue()     // Catch:{ all -> 0x03c2 }
        L_0x02a2:
            long r15 = r15 - r13
            java.lang.Long r16 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x03c2 }
        L_0x02a7:
            r11 = 3176(0xc68, float:4.45E-42)
            boolean r14 = r3.A0E(r11)     // Catch:{ all -> 0x03c2 }
            r13 = 5742(0x166e, float:8.046E-42)
            r3 = 0
            r11 = 1
            if (r14 == 0) goto L_0x02c3
            goto L_0x02b7
        L_0x02b4:
            r13 = 0
            goto L_0x02a2
        L_0x02b7:
            if (r6 != r11) goto L_0x02c3
            if (r10 != 0) goto L_0x02c1
            if (r1 != 0) goto L_0x02be
            goto L_0x02d0
        L_0x02be:
            if (r12 != 0) goto L_0x02d5
            goto L_0x02cb
        L_0x02c1:
            r15 = r10
            goto L_0x0321
        L_0x02c3:
            r15 = r3
            if (r10 != 0) goto L_0x0321
            if (r1 == 0) goto L_0x02d2
            if (r12 != 0) goto L_0x02fb
            goto L_0x02cd
        L_0x02cb:
            X.3oE r15 = X.C76043oE.A09     // Catch:{ all -> 0x03c2 }
        L_0x02cd:
            X.3oE r10 = X.C76043oE.A09     // Catch:{ all -> 0x03c2 }
            goto L_0x0321
        L_0x02d0:
            X.3oE r15 = X.C76043oE.A0A     // Catch:{ all -> 0x03c2 }
        L_0x02d2:
            X.3oE r10 = X.C76043oE.A0A     // Catch:{ all -> 0x03c2 }
            goto L_0x0321
        L_0x02d5:
            X.0wG r6 = r0.A00     // Catch:{ all -> 0x03c2 }
            android.content.Context r14 = r6.A00     // Catch:{ all -> 0x03c2 }
            X.AnonymousClass00C.A08(r14)     // Catch:{ all -> 0x03c2 }
            android.content.Intent r10 = X.C36431kI.A0D()     // Catch:{ all -> 0x03c2 }
            r10.setPackage(r12)     // Catch:{ all -> 0x03c2 }
            java.lang.String r6 = "com.whatsapp.otp.OTP_RETRIEVED"
            r10.setAction(r6)     // Catch:{ all -> 0x03c2 }
            android.content.pm.PackageManager r6 = r14.getPackageManager()     // Catch:{ all -> 0x03c2 }
            java.util.List r6 = r6.queryBroadcastReceivers(r10, r5)     // Catch:{ all -> 0x03c2 }
            X.AnonymousClass00C.A08(r6)     // Catch:{ all -> 0x03c2 }
            boolean r6 = X.C36401kF.A1a(r6)     // Catch:{ all -> 0x03c2 }
            if (r6 != 0) goto L_0x038a
            X.3oE r15 = X.C76013oB.A00     // Catch:{ all -> 0x03c2 }
        L_0x02fb:
            X.0wG r6 = r0.A00     // Catch:{ all -> 0x03c2 }
            android.content.Context r14 = r6.A00     // Catch:{ all -> 0x03c2 }
            X.AnonymousClass00C.A08(r14)     // Catch:{ all -> 0x03c2 }
            android.content.Intent r10 = X.C36431kI.A0D()     // Catch:{ all -> 0x03c2 }
            r10.setPackage(r12)     // Catch:{ all -> 0x03c2 }
            java.lang.String r6 = "com.whatsapp.otp.OTP_RETRIEVED"
            r10.setAction(r6)     // Catch:{ all -> 0x03c2 }
            android.content.pm.PackageManager r6 = r14.getPackageManager()     // Catch:{ all -> 0x03c2 }
            java.util.List r6 = r6.queryIntentActivities(r10, r5)     // Catch:{ all -> 0x03c2 }
            X.AnonymousClass00C.A08(r6)     // Catch:{ all -> 0x03c2 }
            boolean r6 = X.C36401kF.A1a(r6)     // Catch:{ all -> 0x03c2 }
            if (r6 != 0) goto L_0x0327
            X.3oE r10 = X.C76023oC.A01     // Catch:{ all -> 0x03c2 }
        L_0x0321:
            java.util.concurrent.atomic.AtomicInteger r1 = r7.A0A     // Catch:{ all -> 0x03c2 }
            r1.set(r4)     // Catch:{ all -> 0x03c2 }
            goto L_0x033d
        L_0x0327:
            java.lang.String r1 = r1.A01     // Catch:{ all -> 0x03c2 }
            if (r1 != 0) goto L_0x032e
            X.3oE r10 = X.C76023oC.A00     // Catch:{ all -> 0x03c2 }
            goto L_0x0321
        L_0x032e:
            r10 = 0
            java.util.concurrent.atomic.AtomicInteger r1 = r7.A0A     // Catch:{ all -> 0x03c2 }
            r1.set(r11)     // Catch:{ all -> 0x03c2 }
            boolean r1 = r8.A0E(r13)     // Catch:{ all -> 0x03c2 }
            if (r1 == 0) goto L_0x033c
            r7.A02 = r12     // Catch:{ all -> 0x03c2 }
        L_0x033c:
            r5 = 1
        L_0x033d:
            if (r15 == 0) goto L_0x0340
            r10 = r15
        L_0x0340:
            X.1J1 r4 = r0.A04     // Catch:{ all -> 0x03c2 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x03c2 }
            if (r10 == 0) goto L_0x0378
            X.3oE r1 = X.C76043oE.A06     // Catch:{ all -> 0x03c2 }
            boolean r1 = r10.equals(r1)     // Catch:{ all -> 0x03c2 }
            if (r1 == 0) goto L_0x0352
            r1 = 7
            goto L_0x0374
        L_0x0352:
            X.3oE r1 = X.C76043oE.A0A     // Catch:{ all -> 0x03c2 }
            boolean r1 = r10.equals(r1)     // Catch:{ all -> 0x03c2 }
            if (r1 == 0) goto L_0x035d
            r1 = 8
            goto L_0x0374
        L_0x035d:
            X.3oE r1 = X.C76043oE.A09     // Catch:{ all -> 0x03c2 }
            boolean r1 = r10.equals(r1)     // Catch:{ all -> 0x03c2 }
            if (r1 == 0) goto L_0x0367
            r1 = 5
            goto L_0x0374
        L_0x0367:
            X.3oE r1 = X.C76023oC.A00     // Catch:{ all -> 0x03c2 }
            boolean r1 = r10.equals(r1)     // Catch:{ all -> 0x03c2 }
            if (r1 == 0) goto L_0x0371
            r1 = 6
            goto L_0x0374
        L_0x0371:
            java.lang.Integer r3 = r10.A00     // Catch:{ all -> 0x03c2 }
            goto L_0x0378
        L_0x0374:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x03c2 }
        L_0x0378:
            r18 = 4
            r12 = r4
            r13 = r22
            r15 = r3
            X.AnonymousClass1J1.A01(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x03c2 }
            if (r10 != 0) goto L_0x0386
            r10 = r2
            if (r2 == 0) goto L_0x03eb
        L_0x0386:
            r0.A01(r10, r9)     // Catch:{ all -> 0x03c2 }
            return
        L_0x038a:
            r4 = 3
            java.util.concurrent.atomic.AtomicInteger r1 = r7.A0A     // Catch:{ all -> 0x03c2 }
            r1.set(r4)     // Catch:{ all -> 0x03c2 }
            boolean r1 = r8.A0E(r13)     // Catch:{ all -> 0x03c2 }
            if (r1 == 0) goto L_0x0398
            r7.A02 = r12     // Catch:{ all -> 0x03c2 }
        L_0x0398:
            X.1J1 r1 = r0.A04     // Catch:{ all -> 0x03c2 }
            r18 = 4
            r15 = r3
            r12 = r1
            r13 = r22
            r14 = r3
            X.AnonymousClass1J1.A01(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x03c2 }
            if (r2 == 0) goto L_0x03eb
            r0.A01(r2, r9)     // Catch:{ all -> 0x03c2 }
            return
        L_0x03aa:
            java.util.concurrent.atomic.AtomicInteger r1 = r7.A0A     // Catch:{ all -> 0x03c2 }
            r1.set(r4)     // Catch:{ all -> 0x03c2 }
            X.1J1 r1 = r0.A04     // Catch:{ all -> 0x03c2 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x03c2 }
            java.lang.Integer r4 = X.C36401kF.A0i()     // Catch:{ all -> 0x03c2 }
            r5 = 0
            r7 = 4
            r2 = r22
            r6 = r5
            X.AnonymousClass1J1.A01(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x03c2 }
            return
        L_0x03c2:
            r3 = move-exception
            X.0yC r2 = r0.A02
            r1 = r22
            X.3P8 r1 = X.C65773Tk.A00(r2, r1)
            if (r1 == 0) goto L_0x03e6
            r2 = 2
            java.util.concurrent.atomic.AtomicInteger r1 = r1.A0A
            r1.set(r2)
            X.1J1 r0 = r0.A04
            java.lang.Integer r6 = X.C36381kD.A0m()
            java.lang.Integer r7 = X.C36401kF.A0i()
            r8 = 0
            r10 = 4
            r4 = r0
            r5 = r22
            r9 = r8
            X.AnonymousClass1J1.A01(r4, r5, r6, r7, r8, r9, r10)
        L_0x03e6:
            java.lang.String r0 = "Unexpected error while trying to parse OTP msg"
            com.whatsapp.util.Log.e(r0, r3)
        L_0x03eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65403Rx.A02(X.3T1):void");
    }

    public C65403Rx(C19970wo r2, C19630wG r3, C25271Fq r4, C20810yC r5, AnonymousClass1J3 r6, AnonymousClass1J1 r7, AnonymousClass37A r8, AnonymousClass619 r9, AnonymousClass1TH r10, AnonymousClass1TG r11, AnonymousClass005 r12) {
        C36321k7.A1B(r2, r5, r3, r11, r7);
        C36321k7.A1C(r10, r8, r6, r4, r9);
        AnonymousClass00C.A0D(r12, 11);
        this.A09 = r2;
        this.A02 = r5;
        this.A00 = r3;
        this.A0A = r11;
        this.A04 = r7;
        this.A07 = r10;
        this.A05 = r8;
        this.A03 = r6;
        this.A01 = r4;
        this.A06 = r9;
        this.A08 = r12;
    }
}
