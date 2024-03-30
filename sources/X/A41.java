package X;

public final class A41 implements B3T {
    public final AnonymousClass95S A00;
    public final C23119B5y A01;
    public final AnonymousClass95U A02;

    public final Object ByC() {
        return AnonymousClass8EX.A01((AnonymousClass8EX) this.A01).A02();
    }

    public final boolean ByI(Object obj, Object obj2) {
        return C90504aG.A1T(((AnonymousClass8EX) obj).zzb.equals(((AnonymousClass8EX) obj2).zzb) ? 1 : 0);
    }

    public final void ByK(B3O b3o, Object obj) {
        throw AnonymousClass001.A0A("zzc");
    }

    public final void ByL(C197899cY r3, Object obj, byte[] bArr, int i, int i2) {
        AnonymousClass8EX r4 = (AnonymousClass8EX) obj;
        if (r4.zzb == C201569jt.A05) {
            r4.zzb = new C201569jt();
        }
        throw C165597tg.A0g();
    }

    public final void Byd(Object obj) {
        ((AnonymousClass8EX) obj).zzb.A02 = false;
        throw AnonymousClass001.A0A("zzc");
    }

    public final boolean Byk(Object obj) {
        throw AnonymousClass001.A0A("zzc");
    }

    public final int zza(Object obj) {
        return ((AnonymousClass8EX) obj).zzb.hashCode();
    }

    public final int zzb(Object obj) {
        C201569jt r7 = ((AnonymousClass8EX) obj).zzb;
        int i = r7.A01;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < r7.A00; i2++) {
                int i3 = r7.A03[i2] >>> 3;
                boolean z = C170568Dy.A05;
                i += 2 + 1 + C165567td.A00(i3) + C170568Dy.A03((C21673AUw) r7.A04[i2], 3);
            }
            r7.A01 = i;
        }
        return i;
    }

    public A41(AnonymousClass95S r1, C23119B5y b5y, AnonymousClass95U r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = b5y;
    }

    public final void ByW(Object obj, Object obj2) {
        C203829ow.A0S(obj, obj2);
    }
}
