package X;

import java.util.Map;

/* renamed from: X.7Z2  reason: invalid class name */
public final class AnonymousClass7Z2 extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ AnonymousClass6E7 $extensionsContextParams;
    public final /* synthetic */ AnonymousClass7hO $flowReadyCallback = null;
    public final /* synthetic */ C159657ji $flowTerminationCallback;
    public final /* synthetic */ boolean $isDraft;
    public final /* synthetic */ AnonymousClass691 $phoenixSessionConfig;
    public final /* synthetic */ String $pslData;
    public final /* synthetic */ Map $stateMachineInputParams;
    public final /* synthetic */ C133316Xv this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7Z2(C133316Xv r2, AnonymousClass6E7 r3, C159657ji r4, AnonymousClass691 r5, String str, Map map, boolean z) {
        super(2);
        this.this$0 = r2;
        this.$phoenixSessionConfig = r5;
        this.$extensionsContextParams = r3;
        this.$pslData = str;
        this.$isDraft = z;
        this.$stateMachineInputParams = map;
        this.$flowTerminationCallback = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str = (String) obj2;
        if (AnonymousClass000.A1X(obj)) {
            C133316Xv r0 = this.this$0;
            AnonymousClass691 r4 = this.$phoenixSessionConfig;
            AnonymousClass6E7 r1 = this.$extensionsContextParams;
            String str2 = this.$pslData;
            boolean z = this.$isDraft;
            C133316Xv.A03(r0, r1, this.$flowReadyCallback, this.$flowTerminationCallback, r4, str2, this.$stateMachineInputParams, z);
        } else {
            C133316Xv r2 = this.this$0;
            C159657ji r12 = this.$flowTerminationCallback;
            if (str == null) {
                str = "UNKNOWN";
            }
            C133316Xv.A05(r2, r12, str, this.$extensionsContextParams.A05);
        }
        return AnonymousClass0AJ.A00;
    }
}
