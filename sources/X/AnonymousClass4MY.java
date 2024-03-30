package X;

import java.util.List;

/* renamed from: X.4MY  reason: invalid class name */
public final class AnonymousClass4MY extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C107265Nh $callLog;
    public final /* synthetic */ C106265Iz $fMessage;
    public final /* synthetic */ C174918Yy this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4MY(C106265Iz r2, C174918Yy r3, C107265Nh r4) {
        super(1);
        this.this$0 = r3;
        this.$fMessage = r2;
        this.$callLog = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass141 r6 = (AnonymousClass141) obj;
        AnonymousClass00C.A0D(r6, 0);
        AnonymousClass1ND callsManager = this.this$0.getCallsManager();
        C174918Yy r0 = this.this$0;
        List A04 = AnonymousClass3UL.A04(r0.A0T, r0.A0l, r0.A1F, r6);
        return Boolean.valueOf(callsManager.BPb(this.this$0.getContext(), this.$callLog.A0D, A04, C174918Yy.A0B(this.$fMessage)));
    }
}
