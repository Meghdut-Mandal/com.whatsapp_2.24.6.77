package X;

import com.whatsapp.blockbusiness.blockreasonlist.BlockReasonListFragment;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.7S2  reason: invalid class name */
public final class AnonymousClass7S2 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ BlockReasonListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7S2(BlockReasonListFragment blockReasonListFragment) {
        super(1);
        this.this$0 = blockReasonListFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        WDSButton wDSButton = this.this$0.A0E;
        if (wDSButton == null) {
            throw C36331k8.A0d("blockButton");
        }
        wDSButton.setEnabled(true);
        return AnonymousClass0AJ.A00;
    }
}
