package X;

/* renamed from: X.70Q  reason: invalid class name */
public final /* synthetic */ class AnonymousClass70Q implements C25711Hj {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C146506vi A01;
    public final /* synthetic */ AnonymousClass670 A02;
    public final /* synthetic */ C124755yk A03;

    public /* synthetic */ AnonymousClass70Q(C146506vi r1, AnonymousClass670 r2, C124755yk r3, long j) {
        this.A03 = r3;
        this.A00 = j;
        this.A01 = r1;
        this.A02 = r2;
    }

    public final void accept(Object obj) {
        Object obj2;
        C124755yk r0 = this.A03;
        long j = this.A00;
        C146506vi r4 = this.A01;
        AnonymousClass670 r2 = this.A02;
        Integer num = (Integer) obj;
        int intValue = num.intValue();
        C36321k7.A0z(r4, r2);
        r0.A0A.remove(Long.valueOf(j));
        C146506vi.A00(r4);
        C123865xD A04 = r4.A04();
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("XFamilyCrosspostMediaUploadManager/enqueueUploadImpl MediaJobFinished result: ");
        if (A04 != null) {
            obj2 = Integer.valueOf(A04.A00);
        } else {
            obj2 = "null";
        }
        AnonymousClass00C.A0D(AnonymousClass000.A0o(obj2, A0u), 0);
        if ((A04 == null || A04.A01.A04.A0A == null) && (intValue == 17 || intValue == 22 || intValue == 13 || intValue == 33 || intValue == 25)) {
            r2.A02.A00(num, 3, -1, j);
            return;
        }
        if (A04 != null) {
            int i = A04.A00;
            if (i != 1 && i != 32) {
                if (i == 0) {
                    String A032 = A04.A02.A03();
                    if (A032 == null || A032.length() == 0) {
                        r2.A01((Integer) null, -10, j);
                        return;
                    } else {
                        r2.A00(j, A032);
                        return;
                    }
                }
            } else {
                return;
            }
        }
        r2.A01(num, -11, j);
    }
}
