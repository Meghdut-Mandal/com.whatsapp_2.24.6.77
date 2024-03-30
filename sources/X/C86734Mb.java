package X;

/* renamed from: X.4Mb  reason: invalid class name and case insensitive filesystem */
public final class C86734Mb extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ boolean $cancelExistingIfNotGoing;
    public final /* synthetic */ AnonymousClass3T1 $fMessage;
    public final /* synthetic */ C71893hV this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86734Mb(C71893hV r2, AnonymousClass3T1 r3, boolean z) {
        super(1);
        this.this$0 = r2;
        this.$fMessage = r3;
        this.$cancelExistingIfNotGoing = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (AnonymousClass000.A1X(obj)) {
            this.this$0.A04((AnonymousClass2bT) this.$fMessage);
        } else if (this.$cancelExistingIfNotGoing) {
            C71893hV.A01((AnonymousClass2bT) this.$fMessage, this.this$0);
        }
        return AnonymousClass0AJ.A00;
    }
}
