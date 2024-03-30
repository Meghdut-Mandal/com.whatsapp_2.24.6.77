package X;

import java.util.Map;

/* renamed from: X.7Oq  reason: invalid class name and case insensitive filesystem */
public final class C153517Oq extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ Map $effectiveInput;
    public final /* synthetic */ Map $extraParams;
    public final /* synthetic */ String $fdsManagerId;
    public final /* synthetic */ int $instanceKey;
    public final /* synthetic */ String $stateName;
    public final /* synthetic */ C1270766v this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C153517Oq(C1270766v r2, String str, String str2, Map map, Map map2, int i) {
        super(0);
        this.this$0 = r2;
        this.$stateName = str;
        this.$instanceKey = i;
        this.$effectiveInput = map;
        this.$fdsManagerId = str2;
        this.$extraParams = map2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C1270766v r0 = this.this$0;
        C160467l3 r1 = r0.A00;
        String str = this.$stateName;
        int i = this.$instanceKey;
        this.this$0.A01.A02(new AnonymousClass704(r1.BEK(str, r0.A02, this.$fdsManagerId, this.$effectiveInput, this.$extraParams, i), this.$stateName));
        return AnonymousClass0AJ.A00;
    }
}
