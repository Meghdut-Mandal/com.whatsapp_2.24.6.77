package X;

/* renamed from: X.6tb  reason: invalid class name and case insensitive filesystem */
public final class C145256tb implements C160427kz {
    public final /* synthetic */ C134906bn A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ AnonymousClass67W A02;
    public final /* synthetic */ C143356qP A03;

    public C145256tb(AnonymousClass67W r1, C134906bn r2, C143356qP r3, String str) {
        this.A03 = r3;
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = str;
    }

    public void BQX() {
        String str;
        AnonymousClass67W r1 = this.A02;
        if (this.A03 instanceof AnonymousClass5OM) {
            str = "Extensions bloks layout was not loaded";
        } else {
            str = "Commerce bloks layout was not loaded";
        }
        r1.A00(AnonymousClass001.A09(str));
    }

    public void onSuccess() {
        C143356qP r2 = this.A03;
        r2.A05.Boy(new C1503574y(r2, this.A02, this.A00, this.A01, 25));
    }

    public /* bridge */ /* synthetic */ void BWm(Integer num) {
        String str;
        int intValue = num.intValue();
        AnonymousClass67W r2 = this.A02;
        C143356qP r1 = this.A03;
        if (r1 instanceof AnonymousClass5OM) {
            str = "Extensions bloks layout was not loaded";
        } else {
            str = "Commerce bloks layout was not loaded";
        }
        r2.A00(AnonymousClass001.A09(str));
        r1.A01(intValue);
    }

    public /* bridge */ /* synthetic */ void BjA(Integer num) {
        String str;
        int intValue = num.intValue();
        AnonymousClass67W r2 = this.A02;
        C143356qP r1 = this.A03;
        if (r1 instanceof AnonymousClass5OM) {
            str = "Extensions bloks layout was not loaded";
        } else {
            str = "Commerce bloks layout was not loaded";
        }
        r2.A00(AnonymousClass001.A09(str));
        r1.A01(intValue);
    }
}
