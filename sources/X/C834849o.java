package X;

import java.util.Iterator;

/* renamed from: X.49o  reason: invalid class name and case insensitive filesystem */
public final class C834849o extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C38321oI this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C834849o(C38321oI r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Iterator A0s = C36361kB.A0s(this.this$0.getParentGroupObservers());
        while (A0s.hasNext()) {
            ((C32021cp) A0s.next()).A00();
        }
        this.this$0.getNuxManager().A00("community_events", C36371kC.A0m());
        return AnonymousClass0AJ.A00;
    }
}
