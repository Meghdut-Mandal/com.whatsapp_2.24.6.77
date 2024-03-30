package X;

import java.util.Map;

/* renamed from: X.Aok  reason: case insensitive filesystem */
public final class C22555Aok extends AnonymousClass00R implements C019408g {
    public final /* synthetic */ C203619oP this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22555Aok(C203619oP r2) {
        super(3);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object BKt(Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        Map map = (Map) obj2;
        AnonymousClass6PH r6 = (AnonymousClass6PH) obj3;
        C203619oP r0 = this.this$0;
        AnonymousClass9XM r1 = r0.A06;
        if (r1 != null) {
            AnonymousClass9S8 r02 = r0.A01;
            if (r02 == null) {
                throw C36331k8.A0d("flowManager");
            }
            r1.A01((String) C165607th.A0n(r02.A03));
        }
        C203619oP r12 = this.this$0;
        if (str == null) {
            C105705Fs r03 = r12.A0G;
            r03.A01.A04(r12.A00, 3);
            C203619oP.A06(this.this$0, r6, map);
        } else {
            C203619oP.A05(r12, r6, str, map, 2);
        }
        return AnonymousClass0AJ.A00;
    }
}
