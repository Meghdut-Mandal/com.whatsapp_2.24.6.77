package X;

/* renamed from: X.0AC  reason: invalid class name */
public abstract class AnonymousClass0AC extends AnonymousClass0AB {
    public int A00;

    public abstract Object A0B();

    public Object A0C(Object obj) {
        return obj;
    }

    public abstract C023509x A0E();

    public abstract void A0F(Object obj, Throwable th);

    public final void A0A(Throwable th, Throwable th2) {
        if (th == null) {
            if (th2 != null) {
                th = th2;
            } else {
                return;
            }
        } else if (th2 != null) {
            AnonymousClass0VY.A01(th, th2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fatal exception in coroutines machinery for ");
        sb.append(this);
        sb.append(". Please read KDoc to 'handleFatalException' method and report this incident to maintainers");
        C05720Qu.A00(A0E().getContext(), new C05160Nu(sb.toString(), th));
    }

    public Throwable A0D(Object obj) {
        AnonymousClass0AT r3;
        if (!(obj instanceof AnonymousClass0AT) || (r3 = (AnonymousClass0AT) obj) == null) {
            return null;
        }
        return r3.A00;
    }

    public AnonymousClass0AC(int i) {
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0070, code lost:
        if (r8.A12() != false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0084, code lost:
        if (r8.A12() != false) goto L_0x0086;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            X.09x r1 = r9.A0E()     // Catch:{ all -> 0x008a }
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"
            X.AnonymousClass00C.A0E(r1, r0)     // Catch:{ all -> 0x008a }
            X.0AD r1 = (X.AnonymousClass0AD) r1     // Catch:{ all -> 0x008a }
            X.09x r5 = r1.A02     // Catch:{ all -> 0x008a }
            java.lang.Object r0 = r1.A01     // Catch:{ all -> 0x008a }
            X.02h r3 = r5.getContext()     // Catch:{ all -> 0x008a }
            java.lang.Object r2 = X.AnonymousClass0AF.A00(r0, r3)     // Catch:{ all -> 0x008a }
            X.035 r0 = X.AnonymousClass0AF.A01     // Catch:{ all -> 0x008a }
            r4 = 0
            if (r2 == r0) goto L_0x0021
            X.0nS r8 = X.AnonymousClass0A3.A02(r2, r5, r3)     // Catch:{ all -> 0x008a }
            goto L_0x0022
        L_0x0021:
            r8 = r4
        L_0x0022:
            X.02h r7 = r5.getContext()     // Catch:{ all -> 0x007d }
            java.lang.Object r6 = r9.A0B()     // Catch:{ all -> 0x007d }
            java.lang.Throwable r1 = r9.A0D(r6)     // Catch:{ all -> 0x007d }
            if (r1 != 0) goto L_0x0060
            int r1 = r9.A00     // Catch:{ all -> 0x007d }
            r0 = 1
            if (r1 == r0) goto L_0x0038
            r0 = 2
            if (r1 != r0) goto L_0x0058
        L_0x0038:
            X.03x r0 = X.C007403e.A00     // Catch:{ all -> 0x007d }
            X.02i r1 = r7.get(r0)     // Catch:{ all -> 0x007d }
            X.03e r1 = (X.C007403e) r1     // Catch:{ all -> 0x007d }
            if (r1 == 0) goto L_0x0058
            boolean r0 = r1.BL7()     // Catch:{ all -> 0x007d }
            if (r0 != 0) goto L_0x0058
            java.util.concurrent.CancellationException r1 = r1.B9P()     // Catch:{ all -> 0x007d }
            r9.A0F(r6, r1)     // Catch:{ all -> 0x007d }
            X.03N r0 = new X.03N     // Catch:{ all -> 0x007d }
            r0.<init>(r1)     // Catch:{ all -> 0x007d }
            r5.resumeWith(r0)     // Catch:{ all -> 0x007d }
            goto L_0x0068
        L_0x0058:
            java.lang.Object r0 = r9.A0C(r6)     // Catch:{ all -> 0x007d }
            r5.resumeWith(r0)     // Catch:{ all -> 0x007d }
            goto L_0x0068
        L_0x0060:
            X.03N r0 = new X.03N     // Catch:{ all -> 0x007d }
            r0.<init>(r1)     // Catch:{ all -> 0x007d }
            r5.resumeWith(r0)     // Catch:{ all -> 0x007d }
        L_0x0068:
            X.0AJ r1 = X.AnonymousClass0AJ.A00     // Catch:{ all -> 0x007d }
            if (r8 == 0) goto L_0x0072
            boolean r0 = r8.A12()     // Catch:{ all -> 0x008a }
            if (r0 == 0) goto L_0x0075
        L_0x0072:
            X.AnonymousClass0AF.A01(r2, r3)     // Catch:{ all -> 0x008a }
        L_0x0075:
            java.lang.Throwable r0 = X.AnonymousClass0AK.A00(r1)
            r9.A0A(r4, r0)
            return
        L_0x007d:
            r1 = move-exception
            if (r8 == 0) goto L_0x0086
            boolean r0 = r8.A12()     // Catch:{ all -> 0x008a }
            if (r0 == 0) goto L_0x0089
        L_0x0086:
            X.AnonymousClass0AF.A01(r2, r3)     // Catch:{ all -> 0x008a }
        L_0x0089:
            throw r1     // Catch:{ all -> 0x008a }
        L_0x008a:
            r2 = move-exception
            X.0AJ r1 = X.AnonymousClass0AJ.A00     // Catch:{ all -> 0x008e }
            goto L_0x0094
        L_0x008e:
            r0 = move-exception
            X.03N r1 = new X.03N
            r1.<init>(r0)
        L_0x0094:
            java.lang.Throwable r0 = X.AnonymousClass0AK.A00(r1)
            r9.A0A(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0AC.run():void");
    }
}
