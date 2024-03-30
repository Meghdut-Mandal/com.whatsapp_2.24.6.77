package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.7Uu  reason: invalid class name and case insensitive filesystem */
public final class C155107Uu extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ Map $initialStateMachineInput;
    public final /* synthetic */ C159627jf $resourceResultCallback;
    public final /* synthetic */ AnonymousClass5G3 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C155107Uu(C159627jf r2, AnonymousClass5G3 r3, Map map) {
        super(1);
        this.this$0 = r3;
        this.$resourceResultCallback = r2;
        this.$initialStateMachineInput = map;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        AnonymousClass00C.A0D(th, 0);
        AnonymousClass5G3 r2 = this.this$0;
        LinkedHashMap A00 = AnonymousClass6TM.A00(r2.A0D.A02(), this.this$0.A01);
        C159627jf r1 = this.$resourceResultCallback;
        String message = th.getMessage();
        if (message == null) {
            message = "extensions-data-exchange-graphql-response-error";
        }
        AnonymousClass5G3.A02(r1, r2, message, th.getMessage(), A00, this.$initialStateMachineInput, false);
        return AnonymousClass0AJ.A00;
    }
}
