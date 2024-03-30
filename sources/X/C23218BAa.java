package X;

/* renamed from: X.BAa  reason: case insensitive filesystem */
public class C23218BAa implements AnonymousClass7hO {
    public Object A00;
    public final int A01;

    public C23218BAa(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BYB(String str) {
        AnonymousClass17Y r0;
        switch (this.A01) {
            case 0:
                AnonymousClass9jA r4 = (AnonymousClass9jA) this.A00;
                r4.A09.A02(str).A01(new C23160B7u(r4, 0), AnonymousClass705.class, r4);
                r0 = r4.A01;
                break;
            case 1:
            case 2:
            case 3:
                ((C225314u) this.A00).Bnv();
                return;
            case 4:
                r0 = ((C178888i4) this.A00).A00;
                break;
            default:
                r0 = ((C225314u) this.A00).A05;
                break;
        }
        r0.A02();
    }
}
