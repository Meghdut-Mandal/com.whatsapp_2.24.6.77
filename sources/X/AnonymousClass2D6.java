package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.bonsai.discovery.BonsaiDiscoveryFragment;

/* renamed from: X.2D6  reason: invalid class name */
public final class AnonymousClass2D6 extends C42311yc {
    public final TextView A00;
    public final /* synthetic */ BonsaiDiscoveryFragment A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2D6(View view, BonsaiDiscoveryFragment bonsaiDiscoveryFragment) {
        super(view, bonsaiDiscoveryFragment);
        this.A01 = bonsaiDiscoveryFragment;
        TextView A0F = C36351kA.A0F(view, R.id.subtitle);
        this.A00 = A0F;
        int A02 = C36351kA.A02(view.getContext(), view.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved);
        this.A02.setTextColor(A02);
        A0F.setTextColor(A02);
        this.A03.setImageResource(R.drawable.bonsai_onboarding_contact_shimmer_background);
    }
}
