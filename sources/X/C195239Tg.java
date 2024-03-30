package X;

import java.util.LinkedList;

/* renamed from: X.9Tg  reason: invalid class name and case insensitive filesystem */
public class C195239Tg {
    public final C234218k A00;

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0084, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0085, code lost:
        r1 = X.C90524aI.A0Y(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008f, code lost:
        throw X.C90524aI.A0Y(r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008a A[ExcHandler: 18E | 18F (r0v0 'e' java.lang.Object A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C21803Aad A00(X.C1268866a r11) {
        /*
            r10 = this;
            X.18k r3 = r10.A00     // Catch:{ 18E | 18F -> 0x008a }
            X.9bP r2 = r3.A04(r11)     // Catch:{ 18E | 18F -> 0x008a }
            java.util.LinkedList r1 = r2.A00     // Catch:{ 18E | 18F -> 0x008a }
            boolean r0 = r1.isEmpty()     // Catch:{ 18E | 18F -> 0x008a }
            if (r0 == 0) goto L_0x004c
            java.lang.String r5 = "SHA1PRNG"
            java.security.SecureRandom r4 = java.security.SecureRandom.getInstance(r5)     // Catch:{ NoSuchAlgorithmException -> 0x0027, 18E | 18F -> 0x008a }
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r8 = r4.nextInt(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0027, 18E | 18F -> 0x008a }
            r0 = 32
            byte[] r7 = new byte[r0]     // Catch:{ NoSuchAlgorithmException -> 0x0084, 18E | 18F -> 0x008a }
            java.security.SecureRandom r0 = java.security.SecureRandom.getInstance(r5)     // Catch:{ NoSuchAlgorithmException -> 0x0084, 18E | 18F -> 0x008a }
            r0.nextBytes(r7)     // Catch:{ NoSuchAlgorithmException -> 0x0084, 18E | 18F -> 0x008a }
            goto L_0x002d
        L_0x0027:
            r0 = move-exception
            java.lang.AssertionError r1 = X.C90524aI.A0Y(r0)     // Catch:{ 18E | 18F -> 0x008a }
            goto L_0x0089
        L_0x002d:
            X.5rl r0 = X.C200529hY.A02()     // Catch:{ 18E | 18F -> 0x008a }
            r1.clear()     // Catch:{ 18E | 18F -> 0x008a }
            r9 = 0
            X.AUh r5 = r0.A01     // Catch:{ 18E | 18F -> 0x008a }
            X.5nT r0 = r0.A00     // Catch:{ 18E | 18F -> 0x008a }
            java.util.Objects.requireNonNull(r0)     // Catch:{ 18E | 18F -> 0x008a }
            X.Aux r6 = new X.Aux     // Catch:{ 18E | 18F -> 0x008a }
            r6.<init>(r0)     // Catch:{ 18E | 18F -> 0x008a }
            X.9f6 r4 = new X.9f6     // Catch:{ 18E | 18F -> 0x008a }
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ 18E | 18F -> 0x008a }
            r1.add(r4)     // Catch:{ 18E | 18F -> 0x008a }
            r3.A06(r11, r2)     // Catch:{ 18E | 18F -> 0x008a }
        L_0x004c:
            boolean r0 = r1.isEmpty()     // Catch:{ 18E | 18F -> 0x008a }
            if (r0 != 0) goto L_0x007c
            java.lang.Object r1 = X.C36441kJ.A12(r1)     // Catch:{ 18E | 18F -> 0x008a }
            X.9f6 r1 = (X.C199309f6) r1     // Catch:{ 18E | 18F -> 0x008a }
            X.8Qu r0 = r1.A00     // Catch:{ 18E | 18F -> 0x008a }
            int r4 = r0.senderKeyId_     // Catch:{ 18E | 18F -> 0x008a }
            X.9fE r0 = r1.A00()     // Catch:{ 18E | 18F -> 0x008a }
            int r3 = r0.A00     // Catch:{ 18E | 18F -> 0x008a }
            X.9fE r0 = r1.A00()     // Catch:{ 18E | 18F -> 0x008a }
            byte[] r2 = r0.A01     // Catch:{ 18E | 18F -> 0x008a }
            X.8Qu r0 = r1.A00     // Catch:{ 18E | 18F -> 0x008a }
            X.8Pc r0 = r0.senderSigningKey_     // Catch:{ 18E | 18F -> 0x008a }
            if (r0 != 0) goto L_0x0070
            X.8Pc r0 = X.C172768Pc.DEFAULT_INSTANCE     // Catch:{ 18E | 18F -> 0x008a }
        L_0x0070:
            X.AUx r0 = r0.public_     // Catch:{ 18E | 18F -> 0x008a }
            X.AUh r1 = X.C200529hY.A00(r0)     // Catch:{ 18E | 18F -> 0x008a }
            X.Aad r0 = new X.Aad     // Catch:{ 18E | 18F -> 0x008a }
            r0.<init>(r1, r2, r4, r3)     // Catch:{ 18E | 18F -> 0x008a }
            return r0
        L_0x007c:
            java.lang.String r0 = "No key state in record!"
            X.18F r1 = new X.18F     // Catch:{ 18E | 18F -> 0x008a }
            r1.<init>((java.lang.String) r0)     // Catch:{ 18E | 18F -> 0x008a }
            goto L_0x0089
        L_0x0084:
            r0 = move-exception
            java.lang.AssertionError r1 = X.C90524aI.A0Y(r0)     // Catch:{ 18E | 18F -> 0x008a }
        L_0x0089:
            throw r1     // Catch:{ 18E | 18F -> 0x008a }
        L_0x008a:
            r0 = move-exception
            java.lang.AssertionError r0 = X.C90524aI.A0Y(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195239Tg.A00(X.66a):X.Aad");
    }

    public void A01(C1268866a r12, C21803Aad aad) {
        C234218k r4 = this.A00;
        C197269bP A04 = r4.A04(r12);
        int i = aad.A00;
        int i2 = aad.A01;
        byte[] bArr = aad.A03;
        C21665AUh aUh = aad.A02;
        LinkedList linkedList = A04.A00;
        linkedList.addFirst(new C199309f6(aUh, C22734Auy.A00, bArr, i, i2));
        if (linkedList.size() > 5) {
            linkedList.removeLast();
        }
        r4.A06(r12, A04);
    }

    public C195239Tg(C234218k r1) {
        this.A00 = r1;
    }
}
