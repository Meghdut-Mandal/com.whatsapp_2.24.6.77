package X;

/* renamed from: X.1KX  reason: invalid class name */
public final class AnonymousClass1KX extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C21690ze $epdJurisdictionAwareLogger;
    public final /* synthetic */ C21670zc $profilohelperFactory;
    public final /* synthetic */ C19630wG $waContext;
    public final /* synthetic */ C19770wU $waWorkers;
    public final /* synthetic */ C21010yW $wamRunTime;
    public final /* synthetic */ AnonymousClass1KS this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1KX(C19630wG r2, AnonymousClass1KS r3, C21010yW r4, C21670zc r5, C21690ze r6, C19770wU r7) {
        super(0);
        this.this$0 = r3;
        this.$waContext = r2;
        this.$waWorkers = r7;
        this.$wamRunTime = r4;
        this.$profilohelperFactory = r5;
        this.$epdJurisdictionAwareLogger = r6;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass1KS r0 = this.this$0;
        C19970wo r3 = r0.A01;
        C19630wG r4 = this.$waContext;
        C19770wU r9 = this.$waWorkers;
        C21700zf r2 = new C21700zf(r3, r4, this.$wamRunTime, this.$profilohelperFactory, this.$epdJurisdictionAwareLogger, r0.A04, r9, r0.A00(), r0.A00);
        r2.A04.A04 = true;
        return r2;
    }
}
