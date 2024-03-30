package X;

/* renamed from: X.7V1  reason: invalid class name */
public final class AnonymousClass7V1 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass6MD $calculationLevelRef;
    public final /* synthetic */ int $nestedCalculationLevel;
    public final /* synthetic */ AnonymousClass0G9 $newDependencies;
    public final /* synthetic */ C94014hV this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7V1(AnonymousClass0G9 r2, C94014hV r3, AnonymousClass6MD r4, int i) {
        super(1);
        this.this$0 = r3;
        this.$calculationLevelRef = r4;
        this.$newDependencies = r2;
        this.$nestedCalculationLevel = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        if (obj != this.this$0) {
            if (obj instanceof C159857k2) {
                int i2 = this.$calculationLevelRef.A00;
                AnonymousClass0G9 r3 = this.$newDependencies;
                int i3 = i2 - this.$nestedCalculationLevel;
                int A03 = r3.A03(obj);
                if (A03 >= 0) {
                    i = r3.A02[A03];
                } else {
                    i = Integer.MAX_VALUE;
                }
                int min = Math.min(i3, i);
                int A01 = AnonymousClass0G9.A01(r3, obj);
                if (A01 < 0) {
                    A01 = ~A01;
                }
                r3.A04[A01] = obj;
                r3.A02[A01] = min;
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass001.A09("A derived state calculation cannot read itself");
    }
}
