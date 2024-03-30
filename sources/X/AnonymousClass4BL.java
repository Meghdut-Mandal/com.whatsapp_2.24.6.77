package X;

import androidx.core.widget.NestedScrollView;
import com.whatsapp.datasharingdisclosure.ui.DisclosureFragment;

/* renamed from: X.4BL  reason: invalid class name */
public final class AnonymousClass4BL extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ DisclosureFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4BL(DisclosureFragment disclosureFragment) {
        super(0);
        this.this$0 = disclosureFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        DisclosureFragment disclosureFragment = this.this$0;
        NestedScrollView nestedScrollView = disclosureFragment.A02;
        if (nestedScrollView != null) {
            nestedScrollView.requestLayout();
            nestedScrollView.invalidate();
            nestedScrollView.post(new C81113wU((Object) disclosureFragment, 32));
        }
        return AnonymousClass0AJ.A00;
    }
}
