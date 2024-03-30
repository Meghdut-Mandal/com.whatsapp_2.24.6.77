package X;

/* renamed from: X.4MD  reason: invalid class name */
public final class AnonymousClass4MD extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C75773nm $observer;
    public final /* synthetic */ AnonymousClass3E9 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4MD(C75773nm r2, AnonymousClass3E9 r3) {
        super(1);
        this.this$0 = r3;
        this.$observer = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.this$0.A00.unregisterObserver(this.$observer);
        return AnonymousClass0AJ.A00;
    }
}
