package X;

/* renamed from: X.9Q7  reason: invalid class name */
public class AnonymousClass9Q7 {
    public final C234518n A00;

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0095, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r0 = X.C90524aI.A0Y(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a6, code lost:
        throw X.C90524aI.A0Y(r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a1 A[ExcHandler: 18E | 18F (r0v1 'e' java.lang.Object A[CUSTOM_DECLARE]), Splitter:B:3:0x0004] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C21802Aac A00(X.C1268866a r15) {
        /*
            r14 = this;
            java.lang.Object r7 = X.AnonymousClass9A8.A00
            monitor-enter(r7)
            r1 = 3
            X.18n r5 = r14.A00     // Catch:{ 18E | 18F -> 0x00a1 }
            X.9dh r4 = r5.A02(r15)     // Catch:{ 18E | 18F -> 0x00a1 }
            java.util.LinkedList r3 = r4.A00     // Catch:{ 18E | 18F -> 0x00a1 }
            boolean r0 = r3.isEmpty()     // Catch:{ 18E | 18F -> 0x00a1 }
            if (r0 != 0) goto L_0x0026
            X.9di r0 = r4.A00()     // Catch:{ 18E | 18F -> 0x00a1 }
            r2 = 1
            int r2 = r2 << r1
            X.8QS r0 = r0.A00     // Catch:{ 18E | 18F -> 0x00a1 }
            X.B6c r1 = r0.senderChainKeys_     // Catch:{ 18E | 18F -> 0x00a1 }
            X.9mA r0 = new X.9mA     // Catch:{ 18E | 18F -> 0x00a1 }
            r0.<init>((java.util.List) r1)     // Catch:{ 18E | 18F -> 0x00a1 }
            byte[][] r0 = r0.A01     // Catch:{ 18E | 18F -> 0x00a1 }
            int r0 = r0.length     // Catch:{ 18E | 18F -> 0x00a1 }
            if (r2 == r0) goto L_0x0064
        L_0x0026:
            r0 = 32
            byte[] r6 = new byte[r0]     // Catch:{ NoSuchAlgorithmException -> 0x0095, 18E | 18F -> 0x00a1 }
            java.lang.String r1 = "SHA1PRNG"
            java.security.SecureRandom r0 = java.security.SecureRandom.getInstance(r1)     // Catch:{ NoSuchAlgorithmException -> 0x0095, 18E | 18F -> 0x00a1 }
            r0.nextBytes(r6)     // Catch:{ NoSuchAlgorithmException -> 0x0095, 18E | 18F -> 0x00a1 }
            X.9mA r2 = new X.9mA     // Catch:{ 18E | 18F -> 0x00a1 }
            r2.<init>((byte[]) r6)     // Catch:{ 18E | 18F -> 0x00a1 }
            java.security.SecureRandom r1 = java.security.SecureRandom.getInstance(r1)     // Catch:{ NoSuchAlgorithmException -> 0x009b, 18E | 18F -> 0x00a1 }
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r12 = r1.nextInt(r0)     // Catch:{ NoSuchAlgorithmException -> 0x009b, 18E | 18F -> 0x00a1 }
            byte[][] r11 = r2.A01     // Catch:{ 18E | 18F -> 0x00a1 }
            X.5rl r0 = X.C200529hY.A02()     // Catch:{ 18E | 18F -> 0x00a1 }
            r3.clear()     // Catch:{ 18E | 18F -> 0x00a1 }
            r13 = 0
            X.AUh r9 = r0.A01     // Catch:{ 18E | 18F -> 0x00a1 }
            X.5nT r0 = r0.A00     // Catch:{ 18E | 18F -> 0x00a1 }
            java.util.Objects.requireNonNull(r0)     // Catch:{ 18E | 18F -> 0x00a1 }
            X.Aux r10 = new X.Aux     // Catch:{ 18E | 18F -> 0x00a1 }
            r10.<init>(r0)     // Catch:{ 18E | 18F -> 0x00a1 }
            X.9di r8 = new X.9di     // Catch:{ 18E | 18F -> 0x00a1 }
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ 18E | 18F -> 0x00a1 }
            r3.add(r8)     // Catch:{ 18E | 18F -> 0x00a1 }
            r5.A04(r15, r4)     // Catch:{ 18E | 18F -> 0x00a1 }
        L_0x0064:
            X.9di r5 = r4.A00()     // Catch:{ 18E | 18F -> 0x00a1 }
            X.8QS r0 = r5.A00     // Catch:{ 18E | 18F -> 0x00a1 }
            int r4 = r0.senderKeyId_     // Catch:{ 18E | 18F -> 0x00a1 }
            X.B6c r1 = r0.senderChainKeys_     // Catch:{ 18E | 18F -> 0x00a1 }
            X.9mA r0 = new X.9mA     // Catch:{ 18E | 18F -> 0x00a1 }
            r0.<init>((java.util.List) r1)     // Catch:{ 18E | 18F -> 0x00a1 }
            int r3 = r0.A00     // Catch:{ 18E | 18F -> 0x00a1 }
            X.8QS r0 = r5.A00     // Catch:{ 18E | 18F -> 0x00a1 }
            X.B6c r1 = r0.senderChainKeys_     // Catch:{ 18E | 18F -> 0x00a1 }
            X.9mA r0 = new X.9mA     // Catch:{ 18E | 18F -> 0x00a1 }
            r0.<init>((java.util.List) r1)     // Catch:{ 18E | 18F -> 0x00a1 }
            byte[][] r2 = r0.A01     // Catch:{ 18E | 18F -> 0x00a1 }
            X.8QS r0 = r5.A00     // Catch:{ 18E | 18F -> 0x00a1 }
            X.8Pc r0 = r0.senderSigningKey_     // Catch:{ 18E | 18F -> 0x00a1 }
            if (r0 != 0) goto L_0x0088
            X.8Pc r0 = X.C172768Pc.DEFAULT_INSTANCE     // Catch:{ 18E | 18F -> 0x00a1 }
        L_0x0088:
            X.AUx r0 = r0.public_     // Catch:{ 18E | 18F -> 0x00a1 }
            X.AUh r1 = X.C200529hY.A00(r0)     // Catch:{ 18E | 18F -> 0x00a1 }
            X.Aac r0 = new X.Aac     // Catch:{ 18E | 18F -> 0x00a1 }
            r0.<init>(r1, r2, r4, r3)     // Catch:{ 18E | 18F -> 0x00a1 }
            monitor-exit(r7)     // Catch:{ all -> 0x00a7 }
            return r0
        L_0x0095:
            r0 = move-exception
            java.lang.AssertionError r0 = X.C90524aI.A0Y(r0)     // Catch:{ 18E | 18F -> 0x00a1 }
            goto L_0x00a0
        L_0x009b:
            r0 = move-exception
            java.lang.AssertionError r0 = X.C90524aI.A0Y(r0)     // Catch:{ 18E | 18F -> 0x00a1 }
        L_0x00a0:
            throw r0     // Catch:{ 18E | 18F -> 0x00a1 }
        L_0x00a1:
            r0 = move-exception
            java.lang.AssertionError r0 = X.C90524aI.A0Y(r0)     // Catch:{ all -> 0x00a7 }
            throw r0     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00a7 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9Q7.A00(X.66a):X.Aac");
    }

    public AnonymousClass9Q7(C234518n r1) {
        this.A00 = r1;
    }
}
