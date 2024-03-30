package X;

/* renamed from: X.7Ob  reason: invalid class name and case insensitive filesystem */
public final class C153367Ob extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ String $configKey;
    public final /* synthetic */ byte[] $configValue;
    public final /* synthetic */ C26511Kl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C153367Ob(C26511Kl r2, String str, byte[] bArr) {
        super(0);
        this.this$0 = r2;
        this.$configKey = str;
        this.$configValue = bArr;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        this.this$0.A00.put(this.$configKey, this.$configValue);
        this.this$0.A01.A01(this.$configKey, this.$configValue);
        return AnonymousClass0AJ.A00;
    }
}
