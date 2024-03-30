package X;

import android.view.View;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.newsletter.NewsletterInfoActivity;
import java.util.List;

/* renamed from: X.4Kd  reason: invalid class name and case insensitive filesystem */
public final class C86234Kd extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ NewsletterInfoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86234Kd(NewsletterInfoActivity newsletterInfoActivity) {
        super(1);
        this.this$0 = newsletterInfoActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List A0h = C36421kH.A0h(obj);
        NewsletterInfoActivity newsletterInfoActivity = this.this$0;
        int A07 = newsletterInfoActivity.A0D.A07(7560);
        if (A07 < 1) {
            A07 = 1;
        }
        int i = 0;
        boolean A1T = C36371kC.A1T(A0h.size(), A07);
        View A0F = C36401kF.A0F(newsletterInfoActivity.A1F);
        if (A1T) {
            C76003oA r0 = newsletterInfoActivity.A0u;
            if (r0 != null) {
                r0.A01(A0h);
            }
        } else {
            i = 8;
        }
        A0F.setVisibility(i);
        ((ShimmerFrameLayout) newsletterInfoActivity.A1E.getValue()).A01();
        if (!newsletterInfoActivity.A14) {
            NewsletterInfoActivity.A18(newsletterInfoActivity, A1T);
            newsletterInfoActivity.A14 = true;
        }
        return AnonymousClass0AJ.A00;
    }
}
