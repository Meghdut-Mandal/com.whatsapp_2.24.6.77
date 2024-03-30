package X;

import android.content.Intent;
import com.whatsapp.blockbusiness.blockreasonlist.BlockReasonListFragment;

/* renamed from: X.7U7  reason: invalid class name */
public final class AnonymousClass7U7 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ boolean $shouldLaunchHomeActivityPostBlock;
    public final /* synthetic */ BlockReasonListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7U7(BlockReasonListFragment blockReasonListFragment, boolean z) {
        super(1);
        this.this$0 = blockReasonListFragment;
        this.$shouldLaunchHomeActivityPostBlock = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.this$0.A0i().setResult(-1);
        if (this.$shouldLaunchHomeActivityPostBlock) {
            BlockReasonListFragment blockReasonListFragment = this.this$0;
            Intent addFlags = AnonymousClass190.A03(blockReasonListFragment.A0a()).addFlags(603979776);
            AnonymousClass00C.A08(addFlags);
            blockReasonListFragment.A1C(addFlags);
        }
        this.this$0.A0i().finish();
        return AnonymousClass0AJ.A00;
    }
}
