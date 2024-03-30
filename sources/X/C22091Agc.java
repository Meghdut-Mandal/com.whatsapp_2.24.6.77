package X;

import com.whatsapp.blocklist.BlockList;

/* renamed from: X.Agc  reason: case insensitive filesystem */
public final class C22091Agc extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ BlockList this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22091Agc(BlockList blockList) {
        super(0);
        this.this$0 = blockList;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        BlockList blockList = this.this$0;
        C27731Pn r1 = blockList.A08;
        if (r1 != null) {
            return r1.A05(blockList, "block-list-activity");
        }
        throw C36331k8.A0d("contactPhotos");
    }
}
