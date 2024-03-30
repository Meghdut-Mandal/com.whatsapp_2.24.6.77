package X;

import java.util.Map;

/* renamed from: X.AnE  reason: case insensitive filesystem */
public final class C22475AnE extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass777 $callbackFuture;
    public final /* synthetic */ C22729Aun this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22475AnE(C22729Aun aun, AnonymousClass777 r3) {
        super(1);
        this.this$0 = aun;
        this.$callbackFuture = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C1902597m r12 = (C1902597m) obj;
        AnonymousClass00C.A0D(r12, 0);
        C22729Aun aun = this.this$0;
        AnonymousClass777 r3 = this.$callbackFuture;
        if (r12 instanceof C187048x9) {
            C199819g4 r6 = (C199819g4) ((C187048x9) r12).A00;
            Map map = r6.A03;
            if (!map.isEmpty()) {
                C19700wN r9 = aun.A00;
                if (r9 != null) {
                    String A00 = C22729Aun.A00("GroupInfoBatchProcessor/FetchTruncatedGroupJob some groups\n          | failed to be fetched due to errors");
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("Failed: ");
                    A0u.append(map.size());
                    A0u.append(", Errors: [");
                    A0u.append(C007103b.A0Q(", ", "", "", map.values(), C22528AoA.A00));
                    r9.A0E(A00, AnonymousClass000.A0t(A0u, ']'), false);
                } else {
                    throw C36331k8.A0d("crashLogs");
                }
            }
            C201159iy r5 = aun.A04;
            if (r5 != null) {
                AnonymousClass9W8 A01 = r5.A01(r6.A02, aun.round, aun.params);
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("GroupInfoBatchProcessor/FetchTruncatedGroupsJob/sent fetched group info for further\n                | processing; round=");
                C22729Aun.A00(C36381kD.A10(A0u2, aun.round));
                r3.BVO(A01);
            } else {
                throw C36331k8.A0d("groupInfoProcessor");
            }
        } else if (r12 instanceof C187038x8) {
            C187038x8 r122 = (C187038x8) r12;
            C22473AnC anC = new C22473AnC(aun, r3);
            if (r122 instanceof C187018x6) {
                anC.invoke(((C187018x6) r122).A00);
            }
            C22474AnD anD = new C22474AnD(aun, r3);
            if (r122 instanceof C187028x7) {
                anD.invoke(((C187028x7) r122).A00);
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
