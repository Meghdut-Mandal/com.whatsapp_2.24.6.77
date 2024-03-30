package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.bonsai.discovery.BonsaiDiscoveryFragment;

/* renamed from: X.2D7  reason: invalid class name */
public final class AnonymousClass2D7 extends C42311yc {
    public final TextView A00;
    public final /* synthetic */ BonsaiDiscoveryFragment A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2D7(View view, BonsaiDiscoveryFragment bonsaiDiscoveryFragment) {
        super(view, bonsaiDiscoveryFragment);
        this.A01 = bonsaiDiscoveryFragment;
        this.A00 = C36351kA.A0F(view, R.id.subtitle);
        this.A01.setForeground(AnonymousClass00E.A00(view.getContext(), R.drawable.bonsai_onboarding_contact_rounded_corners_small));
    }
}
