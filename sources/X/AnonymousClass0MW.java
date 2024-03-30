package X;

/* renamed from: X.0MW  reason: invalid class name */
public final class AnonymousClass0MW extends AnonymousClass0MZ {
    public final transient int A00;
    public final transient int A01;
    public final /* synthetic */ AnonymousClass0MZ zzc;

    public final Object[] A08() {
        return this.zzc.A08();
    }

    public final int size() {
        return this.A01;
    }

    public AnonymousClass0MW(AnonymousClass0MZ r1, int i, int i2) {
        this.zzc = r1;
        this.A00 = i;
        this.A01 = i2;
    }

    public final int A04() {
        return this.zzc.A05() + this.A00 + this.A01;
    }

    public final int A05() {
        return this.zzc.A05() + this.A00;
    }

    public final AnonymousClass0MZ A0A(int i, int i2) {
        C07320Xe.A02(i, i2, this.A01);
        AnonymousClass0MZ r1 = this.zzc;
        int i3 = this.A00;
        return r1.subList(i + i3, i2 + i3);
    }

    public final Object get(int i) {
        C07320Xe.A01(i, this.A01);
        return this.zzc.get(i + this.A00);
    }
}
