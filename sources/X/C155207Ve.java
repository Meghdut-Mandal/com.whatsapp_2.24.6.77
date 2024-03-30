package X;

/* renamed from: X.7Ve  reason: invalid class name and case insensitive filesystem */
public final class C155207Ve extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C157597dn $baseRotation;
    public final /* synthetic */ long $color;
    public final /* synthetic */ C157597dn $currentRotation;
    public final /* synthetic */ C157597dn $endAngle;
    public final /* synthetic */ C157597dn $startAngle;
    public final /* synthetic */ C94594iT $stroke;
    public final /* synthetic */ float $strokeWidth;
    public final /* synthetic */ long $trackColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C155207Ve(C157597dn r2, C157597dn r3, C157597dn r4, C157597dn r5, C94594iT r6, float f, long j, long j2) {
        super(1);
        this.$trackColor = j;
        this.$stroke = r6;
        this.$currentRotation = r2;
        this.$endAngle = r3;
        this.$startAngle = r4;
        this.$baseRotation = r5;
        this.$strokeWidth = f;
        this.$color = j2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        float f;
        C161927nh r5 = (C161927nh) obj;
        AnonymousClass00C.A0D(r5, 0);
        C132966Vz.A03(r5, this.$stroke, 0.0f, 360.0f, this.$trackColor);
        float A01 = C90494aF.A01(C36441kJ.A03(this.$endAngle.getValue()), C36441kJ.A03(this.$startAngle.getValue()));
        float A03 = C36441kJ.A03(this.$startAngle.getValue()) + (((C36441kJ.A03(this.$currentRotation.getValue()) * 216.0f) % 360.0f) - 0.049804688f) + C36441kJ.A03(this.$baseRotation.getValue());
        float f2 = this.$strokeWidth;
        long j = this.$color;
        C94594iT r6 = this.$stroke;
        if (r6.A02 == 0) {
            f = 0.0f;
        } else {
            f = ((f2 / (C132966Vz.A00 / ((float) 2))) * 57.29578f) / 2.0f;
        }
        C132966Vz.A03(r5, r6, A03 + f, Math.max(A01, 0.1f), j);
        return AnonymousClass0AJ.A00;
    }
}
