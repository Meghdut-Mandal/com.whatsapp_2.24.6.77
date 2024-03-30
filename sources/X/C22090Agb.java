package X;

import com.whatsapp.blocklist.BlockList;
import java.util.List;
import java.util.Set;

/* renamed from: X.Agb  reason: case insensitive filesystem */
public final class C22090Agb extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ BlockList this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22090Agb(BlockList blockList) {
        super(0);
        this.this$0 = blockList;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        BlockList blockList = this.this$0;
        C191509Df r1 = blockList.A00;
        if (r1 != null) {
            List list = blockList.A0U;
            Set set = blockList.A0W;
            C27121Mz r2 = r1.A00;
            C27111My r12 = r2.A00;
            C191519Dg r4 = (C191519Dg) r12.A27.get();
            C191529Dh r5 = (C191529Dh) r12.A28.get();
            C18800tq r0 = r2.A01;
            AnonymousClass1Pp A0V = C36361kB.A0V(r0);
            return new C166327vY(blockList, r4, r5, (AnonymousClass1LI) r0.A3Q.get(), A0V, (AnonymousClass1RY) blockList.A0Y.getValue(), list, set);
        }
        throw C36331k8.A0d("blockListAdapterFactory");
    }
}
