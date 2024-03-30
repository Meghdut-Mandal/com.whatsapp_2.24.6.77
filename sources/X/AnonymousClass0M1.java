package X;

/* renamed from: X.0M1  reason: invalid class name */
public final class AnonymousClass0M1 extends C10610ea implements C16910qI {
    public AnonymousClass0M8 A00 = new AnonymousClass0M7();
    public boolean A01 = false;
    public final AnonymousClass0M8 A02 = AnonymousClass0M7.zzb;

    public final /* synthetic */ AnonymousClass0M8 Bys() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        AnonymousClass0M1 r1 = new AnonymousClass0M1((AnonymousClass0OW) null);
        A00(this);
        r1.A01(this.A00);
        return r1;
    }

    public /* synthetic */ AnonymousClass0M1(AnonymousClass0OW r2) {
    }

    public static void A00(AnonymousClass0M1 r3) {
        if (!r3.A01) {
            AnonymousClass0M8 r2 = r3.A00;
            C07150Wn.A02.A00(r2.getClass()).Byo(r2);
            r3.A01 = true;
        }
    }

    public final void A01(AnonymousClass0M8 r5) {
        if (this.A01) {
            AnonymousClass0M7 r3 = new AnonymousClass0M7();
            C07150Wn.A02.A00(r3.getClass()).Byp(r3, this.A00);
            this.A00 = r3;
            this.A01 = false;
        }
        AnonymousClass0M8 r2 = this.A00;
        C07150Wn.A02.A00(r2.getClass()).Byp(r2, r5);
    }

    public AnonymousClass0M1() {
    }
}
