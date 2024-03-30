package X;

/* renamed from: X.7VO  reason: invalid class name */
public final class AnonymousClass7VO extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ long $ambientColor;
    public final /* synthetic */ boolean $clip = false;
    public final /* synthetic */ float $elevation;
    public final /* synthetic */ C157657dt $shape;
    public final /* synthetic */ long $spotColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7VO(C157657dt r2, float f, long j, long j2) {
        super(1);
        this.$elevation = f;
        this.$shape = r2;
        this.$ambientColor = j;
        this.$spotColor = j2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C161917ng r4 = (C161917ng) obj;
        float Bvq = r4.Bvq(this.$elevation);
        C137396g4 r2 = (C137396g4) r4;
        if (r2.A04 != Bvq) {
            r2.A05 |= 32;
            r2.A04 = Bvq;
        }
        r4.BsE(this.$shape);
        boolean z = this.$clip;
        if (r2.A0B != z) {
            r2.A05 |= 16384;
            r2.A0B = z;
        }
        r4.Bq9(this.$ambientColor);
        r4.BsJ(this.$spotColor);
        return AnonymousClass0AJ.A00;
    }
}
