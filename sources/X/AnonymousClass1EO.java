package X;

/* renamed from: X.1EO  reason: invalid class name */
public final class AnonymousClass1EO {
    public final AnonymousClass1EN A00;
    public final AnonymousClass004 A01;

    public AnonymousClass1EO(AnonymousClass1EN r2, AnonymousClass004 r3) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
    }

    public final C23044B1p A00(AnonymousClass2cT r5) {
        Object obj;
        AnonymousClass00C.A0D(r5, 0);
        C207149ud r3 = r5.A00;
        if (r3 == null) {
            return null;
        }
        int i = r3.A05;
        if (i != 0) {
            if (i == 1) {
                obj = this.A01.get();
                AnonymousClass00C.A08(obj);
            } else if (i == 2) {
                obj = new C182008oO(C18800tq.ADQ(this.A00.A00.A00), r3);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Interactive response message does not support customizations: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
            return (C23044B1p) obj;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Interactive response message does not support customizations: ");
        sb2.append(i);
        throw new IllegalStateException(sb2.toString());
    }
}
