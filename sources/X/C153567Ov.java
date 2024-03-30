package X;

import java.util.Map;

/* renamed from: X.7Ov  reason: invalid class name and case insensitive filesystem */
public final class C153567Ov extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass6E7 $extensionsContextParams;
    public final /* synthetic */ AnonymousClass7hO $flowReadyCallback = null;
    public final /* synthetic */ C159657ji $flowTerminationCallback;
    public final /* synthetic */ AnonymousClass691 $phoenixSessionConfig;
    public final /* synthetic */ String $pslData;
    public final /* synthetic */ Map $stateMachineInputParams;
    public final /* synthetic */ C133316Xv this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C153567Ov(C133316Xv r2, AnonymousClass6E7 r3, C159657ji r4, AnonymousClass691 r5, String str, Map map) {
        super(0);
        this.this$0 = r2;
        this.$phoenixSessionConfig = r5;
        this.$extensionsContextParams = r3;
        this.$pslData = str;
        this.$stateMachineInputParams = map;
        this.$flowTerminationCallback = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C133316Xv r0 = this.this$0;
        AnonymousClass691 r4 = this.$phoenixSessionConfig;
        C133316Xv.A03(r0, this.$extensionsContextParams, this.$flowReadyCallback, this.$flowTerminationCallback, r4, this.$pslData, this.$stateMachineInputParams, true);
        return AnonymousClass0AJ.A00;
    }
}
