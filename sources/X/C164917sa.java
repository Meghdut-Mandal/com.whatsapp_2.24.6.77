package X;

import java.util.Map;

/* renamed from: X.7sa  reason: invalid class name and case insensitive filesystem */
public class C164917sa implements C160287kl {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C164917sa(C136906fE r1, C160287kl r2, C160287kl r3, int i, int i2) {
        this.A04 = i2;
        this.A03 = r1;
        this.A00 = i;
        this.A02 = r3;
        this.A01 = r2;
    }

    public Map B8T() {
        return ((C160287kl) this.A01).B8T();
    }

    public void Bld() {
        if (this.A04 != 0) {
            C136906fE r1 = (C136906fE) this.A03;
            r1.A00 = this.A00;
            ((C160287kl) this.A02).Bld();
            r1.A05(r1.A00);
            return;
        }
        C136906fE r2 = (C136906fE) this.A03;
        r2.A01 = this.A00;
        ((C160287kl) this.A02).Bld();
        AnonymousClass03Y.A0C(r2.A0D.entrySet(), new AnonymousClass7RQ(r2));
    }

    public int getHeight() {
        return ((C160287kl) this.A01).getHeight();
    }

    public int getWidth() {
        return ((C160287kl) this.A01).getWidth();
    }
}
