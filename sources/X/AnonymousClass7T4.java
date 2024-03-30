package X;

import android.view.View;
import android.view.ViewStub;
import com.whatsapp.R;
import com.whatsapp.inappsupport.ui.ContextualHelpBkScreenFragment;

/* renamed from: X.7T4  reason: invalid class name */
public final class AnonymousClass7T4 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ ContextualHelpBkScreenFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7T4(ContextualHelpBkScreenFragment contextualHelpBkScreenFragment) {
        super(1);
        this.this$0 = contextualHelpBkScreenFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View view;
        ViewStub viewStub;
        View inflate;
        View findViewById;
        ViewStub viewStub2;
        ContextualHelpBkScreenFragment contextualHelpBkScreenFragment = this.this$0;
        AnonymousClass00C.A0B(obj);
        if (AnonymousClass00C.A0J(obj, C104585Ai.A00)) {
            View view2 = contextualHelpBkScreenFragment.A0F;
            if (!(view2 == null || (viewStub2 = (ViewStub) view2.findViewById(R.id.contextual_help_bloks_network_error_view)) == null)) {
                viewStub2.inflate();
            }
        } else if (!((!AnonymousClass00C.A0J(obj, C104575Ah.A00) && !AnonymousClass00C.A0J(obj, C104595Aj.A00)) || (view = contextualHelpBkScreenFragment.A0F) == null || (viewStub = (ViewStub) view.findViewById(R.id.contextual_help_fails_to_load_error_view)) == null || (inflate = viewStub.inflate()) == null || (findViewById = inflate.findViewById(R.id.get_help_in_browser)) == null)) {
            findViewById.setOnClickListener(new AnonymousClass3Y3(contextualHelpBkScreenFragment, 19));
        }
        this.this$0.A1Z();
        return AnonymousClass0AJ.A00;
    }
}
