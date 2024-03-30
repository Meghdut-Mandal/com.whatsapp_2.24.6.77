package X;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.datasharingdisclosure.ui.ConsumerMarketingDisclosureFragment;

/* renamed from: X.4BJ  reason: invalid class name */
public final class AnonymousClass4BJ extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ ConsumerMarketingDisclosureFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4BJ(ConsumerMarketingDisclosureFragment consumerMarketingDisclosureFragment) {
        super(0);
        this.this$0 = consumerMarketingDisclosureFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Object A0n;
        TextView A0P;
        ConsumerMarketingDisclosureFragment consumerMarketingDisclosureFragment = this.this$0;
        View view = consumerMarketingDisclosureFragment.A00;
        if (view == null || (A0P = C36391kE.A0P(view, R.id.description)) == null) {
            A0n = consumerMarketingDisclosureFragment.A0n(R.string.f12nameremoved);
        } else {
            A0n = new SpannableStringBuilder().append(C37351mE.A01(A0P.getPaint(), AnonymousClass3UF.A01(A0P.getContext(), R.drawable.vec_ic_consumer_disclosure, C224514j.A00(consumerMarketingDisclosureFragment.A1D(), 16842808, R.color.f6nameremoved)), consumerMarketingDisclosureFragment.A0n(R.string.f12nameremoved), consumerMarketingDisclosureFragment.A0n(R.string.f12nameremoved)));
        }
        AnonymousClass00C.A08(A0n);
        return A0n;
    }
}
