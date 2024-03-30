package X;

/* renamed from: X.70P  reason: invalid class name */
public final /* synthetic */ class AnonymousClass70P implements C25711Hj {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C146506vi A01;
    public final /* synthetic */ C1271066z A02;
    public final /* synthetic */ C124835ys A03;

    public /* synthetic */ AnonymousClass70P(C146506vi r1, C1271066z r2, C124835ys r3, long j) {
        this.A03 = r3;
        this.A00 = j;
        this.A01 = r1;
        this.A02 = r2;
    }

    public final void accept(Object obj) {
        Object obj2;
        int i;
        C124835ys r0 = this.A03;
        long j = this.A00;
        C146506vi r4 = this.A01;
        C1271066z r5 = this.A02;
        int intValue = ((Integer) obj).intValue();
        C36321k7.A0z(r4, r5);
        r0.A0B.remove(Long.valueOf(j));
        C146506vi.A00(r4);
        C123865xD A04 = r4.A04();
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CrosspostMediaUploadManager/enqueueUploadImpl MediaJobFinished result: ");
        if (A04 != null) {
            obj2 = Integer.valueOf(A04.A00);
        } else {
            obj2 = "null";
        }
        AnonymousClass00C.A0D(AnonymousClass000.A0o(obj2, A0u), 0);
        if ((A04 == null || A04.A01.A04.A0A == null) && (intValue == 17 || intValue == 22 || intValue == 13 || intValue == 33 || intValue == 25)) {
            r5.A02.A00(3, j, -1);
            return;
        }
        if (A04 != null) {
            int i2 = A04.A00;
            if (i2 != 1 && i2 != 32) {
                if (i2 == 0) {
                    String A032 = A04.A02.A03();
                    if (A032 == null || A032.length() == 0) {
                        i = -10;
                        r5.A00(i, j);
                    }
                    r5.A01(j, A032);
                    return;
                }
            } else {
                return;
            }
        }
        i = -11;
        r5.A00(i, j);
    }
}
