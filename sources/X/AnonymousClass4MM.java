package X;

/* renamed from: X.4MM  reason: invalid class name */
public final class AnonymousClass4MM extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C87244Oa $callback;
    public final /* synthetic */ boolean $isEnabled;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4MM(C87244Oa r2, boolean z) {
        super(1);
        this.$callback = r2;
        this.$isEnabled = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C87244Oa r2 = this.$callback;
        ((C77503qb) r2).A00.A0D.A0C(Boolean.valueOf(this.$isEnabled));
        return AnonymousClass0AJ.A00;
    }
}
