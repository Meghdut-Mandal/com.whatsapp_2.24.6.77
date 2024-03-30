package X;

/* renamed from: X.7sT  reason: invalid class name and case insensitive filesystem */
public class C164847sT implements C158387gq {
    public Object A00;
    public final int A01;

    public C164847sT(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final boolean Bdi(int i) {
        AnonymousClass64a r0;
        boolean z;
        C158387gq r1;
        switch (this.A01) {
            case 0:
                r0 = ((C104765Bh) this.A00).A03;
                break;
            case 1:
                r0 = ((C104785Bj) this.A00).A0A;
                break;
            case 2:
                r0 = (AnonymousClass64a) this.A00;
                break;
            default:
                C146526vk r2 = (C146526vk) this.A00;
                if (r2.A0Y || ((r1 = r2.A05) != null && r1.Bdi(100))) {
                    z = true;
                } else {
                    z = false;
                }
                r2.A0Y = z;
                return r2.A0Y;
        }
        C117385mB r02 = r0.A03;
        if (r02 == null) {
            return false;
        }
        r02.A00.A03.A04(Integer.valueOf(i));
        return false;
    }
}
