package X;

import android.view.View;
import android.view.ViewStub;
import com.whatsapp.R;
import com.whatsapp.inappsupport.ui.SupportBkScreenFragment;

/* renamed from: X.7T5  reason: invalid class name */
public final class AnonymousClass7T5 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ SupportBkScreenFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7T5(SupportBkScreenFragment supportBkScreenFragment) {
        super(1);
        this.this$0 = supportBkScreenFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ViewStub viewStub;
        View inflate;
        ViewStub viewStub2;
        SupportBkScreenFragment supportBkScreenFragment = this.this$0;
        AnonymousClass00C.A0B(obj);
        if (AnonymousClass00C.A0J(obj, C104585Ai.A00)) {
            View view = supportBkScreenFragment.A0F;
            if (!(view == null || (viewStub2 = (ViewStub) view.findViewById(R.id.support_bloks_network_error_view)) == null)) {
                viewStub2.inflate();
            }
        } else {
            if (!AnonymousClass00C.A0J(obj, C104575Ah.A00)) {
                AnonymousClass00C.A0J(obj, C104595Aj.A00);
            }
            View view2 = supportBkScreenFragment.A0F;
            if (!(view2 == null || (viewStub = (ViewStub) view2.findViewById(R.id.support_bloks_fails_to_load_error_view)) == null || (inflate = viewStub.inflate()) == null)) {
                View findViewById = inflate.findViewById(R.id.contact_support);
                View findViewById2 = inflate.findViewById(R.id.get_help_in_browser);
                if (findViewById != null) {
                    findViewById.setOnClickListener(new AnonymousClass3Y3(supportBkScreenFragment, 22));
                }
                if (findViewById2 != null) {
                    findViewById2.setOnClickListener(new AnonymousClass3Y3(supportBkScreenFragment, 23));
                }
            }
        }
        this.this$0.A1Z();
        return AnonymousClass0AJ.A00;
    }
}
