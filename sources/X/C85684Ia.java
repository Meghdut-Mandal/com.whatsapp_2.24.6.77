package X;

import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.biz.linkedaccounts.LinkedIGPostsSummaryViewActivity;

/* renamed from: X.4Ia  reason: invalid class name and case insensitive filesystem */
public final class C85684Ia extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ LinkedIGPostsSummaryViewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85684Ia(LinkedIGPostsSummaryViewActivity linkedIGPostsSummaryViewActivity) {
        super(1);
        this.this$0 = linkedIGPostsSummaryViewActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        LinkedIGPostsSummaryViewActivity linkedIGPostsSummaryViewActivity = this.this$0;
        AnonymousClass00C.A0B(str);
        Toolbar toolbar = linkedIGPostsSummaryViewActivity.A00;
        if (toolbar == null) {
            throw C36331k8.A0d("toolbar");
        }
        toolbar.setSubtitle((CharSequence) str);
        toolbar.A0J(toolbar.getContext(), R.style.f13nameremoved);
        return AnonymousClass0AJ.A00;
    }
}
