package X;

/* renamed from: X.7Oa  reason: invalid class name and case insensitive filesystem */
public final class C153357Oa extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ String $configKey;
    public final /* synthetic */ C79593ty $result;
    public final /* synthetic */ C26511Kl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C153357Oa(C79593ty r2, C26511Kl r3, String str) {
        super(0);
        this.this$0 = r3;
        this.$configKey = str;
        this.$result = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Object obj = this.this$0.A00.get(this.$configKey);
        this.$result.A0C(C36441kJ.A19(Boolean.valueOf(AnonymousClass000.A1V(obj)), obj));
        return AnonymousClass0AJ.A00;
    }
}
