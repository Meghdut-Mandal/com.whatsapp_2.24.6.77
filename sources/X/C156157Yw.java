package X;

/* renamed from: X.7Yw  reason: invalid class name and case insensitive filesystem */
public final class C156157Yw extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $color;
    public final /* synthetic */ C161267mT $modifier;
    public final /* synthetic */ int $strokeCap;
    public final /* synthetic */ float $strokeWidth;
    public final /* synthetic */ long $trackColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C156157Yw(C161267mT r2, float f, int i, int i2, int i3, long j, long j2) {
        super(2);
        this.$modifier = r2;
        this.$color = j;
        this.$strokeWidth = f;
        this.$trackColor = j2;
        this.$strokeCap = i;
        this.$$changed = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C161337ma A0L = C90474aD.A0L(obj, obj2);
        C161267mT r2 = this.$modifier;
        long j = this.$color;
        C132966Vz.A02(A0L, r2, this.$strokeWidth, this.$strokeCap, AnonymousClass5WD.A00(this.$$changed), this.$$default, j, this.$trackColor);
        return AnonymousClass0AJ.A00;
    }
}
