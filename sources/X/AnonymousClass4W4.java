package X;

/* renamed from: X.4W4  reason: invalid class name */
public class AnonymousClass4W4 extends C43172Fh {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4W4(AnonymousClass171 r1, C18820ts r2, Object obj, int i) {
        super(r1, r2);
        this.A01 = i;
        this.A00 = obj;
    }

    public int A00(AnonymousClass141 r5, AnonymousClass141 r6) {
        int A04;
        if (this.A01 != 0) {
            C36321k7.A0w(r5, r6);
            A04 = ((AnonymousClass2Gs) this.A00).A00.A04(r5.A0H, r6.A0H);
        } else {
            AnonymousClass35K r1 = r5.A0J;
            AnonymousClass35K r0 = r6.A0J;
            if (r1 == null) {
                if (r0 != null) {
                    return -1;
                }
            } else if (r0 == null) {
                return 1;
            } else {
                AnonymousClass147 r12 = r1.A01;
                AnonymousClass147 r02 = r0.A01;
                if (r12 != null) {
                    if (r02 == null) {
                        return 1;
                    }
                } else if (r02 != null) {
                    return -1;
                }
            }
            AnonymousClass2Gt r3 = (AnonymousClass2Gt) this.A00;
            C20810yC r13 = r3.A03;
            if (AnonymousClass3M0.A00(r5, r13) && !AnonymousClass3M0.A00(r6, r13)) {
                return 1;
            }
            if (!AnonymousClass3M0.A00(r5, r13) && AnonymousClass3M0.A00(r6, r13)) {
                return -1;
            }
            A04 = r3.A02.A04(r5.A0H, r6.A0H);
        }
        if (A04 == 0) {
            return super.A00(r5, r6);
        }
        return A04;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return compare((AnonymousClass141) obj, (AnonymousClass141) obj2);
    }
}
