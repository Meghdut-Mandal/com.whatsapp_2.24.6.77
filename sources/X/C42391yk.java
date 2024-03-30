package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.WaButtonWithLoader;
import com.whatsapp.WaTextView;

/* renamed from: X.1yk  reason: invalid class name and case insensitive filesystem */
public final class C42391yk extends AnonymousClass0D3 {
    public WaButtonWithLoader A00;
    public final ViewStub A01;
    public final ImageView A02;
    public final WaTextView A03;
    public final AnonymousClass171 A04;
    public final AnonymousClass1RY A05;
    public final AnonymousClass4OM A06;
    public final C70143ef A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42391yk(View view, AnonymousClass171 r5, AnonymousClass1RY r6, AnonymousClass1GQ r7, AnonymousClass4OM r8, C70143ef r9) {
        super(view);
        C36321k7.A0x(view, r5);
        AnonymousClass00C.A0D(r7, 4);
        this.A04 = r5;
        this.A07 = r9;
        this.A06 = r8;
        this.A05 = r6;
        this.A02 = C36391kE.A0N(view, R.id.contact_thumbnail);
        this.A03 = C36411kG.A0Z(view, R.id.contact_name);
        ViewStub A0M = C36431kI.A0M(view, R.id.verified_badge_stub);
        this.A01 = A0M;
        r9.A00 = R.drawable.avatar_newsletter;
        WaButtonWithLoader waButtonWithLoader = (WaButtonWithLoader) view.findViewById(R.id.follow_button);
        waButtonWithLoader.setVariant(C27981Qp.TONAL);
        waButtonWithLoader.setSize(C34271gk.SMALL);
        this.A00 = waButtonWithLoader;
        A0M.setLayoutResource(r7.A00.A0E(5276) ? R.layout.f9nameremoved : R.layout.f9nameremoved);
    }
}
