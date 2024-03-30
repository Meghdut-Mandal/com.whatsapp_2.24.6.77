package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ai6  reason: case insensitive filesystem */
public final class C22183Ai6 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C21643ATj this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22183Ai6(C21643ATj aTj) {
        super(0);
        this.this$0 = aTj;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        List<AnonymousClass147> list = this.this$0.A02;
        ArrayList A0J = C36321k7.A0J(list);
        for (AnonymousClass147 r1 : list) {
            A0J.add(new C185648uZ(r1));
        }
        C21643ATj aTj = this.this$0;
        return new C185938v9(aTj.A01, aTj.A00, A0J);
    }
}
