package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.bonsai.discovery.BonsaiDiscoveryFragment;
import com.whatsapp.bonsai.discovery.BonsaiDiscoveryViewModel;

/* renamed from: X.1yc  reason: invalid class name and case insensitive filesystem */
public abstract class C42311yc extends AnonymousClass0D3 {
    public C16200om A00;
    public final FrameLayout A01;
    public final TextView A02;
    public final WaImageView A03;
    public final AnonymousClass00T A04;
    public final /* synthetic */ BonsaiDiscoveryFragment A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42311yc(View view, BonsaiDiscoveryFragment bonsaiDiscoveryFragment) {
        super(view);
        this.A05 = bonsaiDiscoveryFragment;
        C019308f A1A = C36441kJ.A1A(BonsaiDiscoveryViewModel.class);
        this.A04 = C36441kJ.A0a(new AnonymousClass48L(bonsaiDiscoveryFragment), new AnonymousClass48M(bonsaiDiscoveryFragment), new C84794Ep(bonsaiDiscoveryFragment), A1A);
        this.A01 = (FrameLayout) C36361kB.A0F(view, R.id.contact_photo_container);
        this.A03 = (WaImageView) C36361kB.A0F(view, R.id.contact_photo);
        this.A02 = C36351kA.A0F(view, R.id.name);
        C36361kB.A18(view, this, 19);
    }
}
