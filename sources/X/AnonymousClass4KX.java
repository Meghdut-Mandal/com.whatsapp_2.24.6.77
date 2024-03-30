package X;

import android.view.View;
import com.whatsapp.newsletter.NewsletterInfoActivity;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4KX  reason: invalid class name */
public final class AnonymousClass4KX extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ NewsletterInfoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4KX(NewsletterInfoActivity newsletterInfoActivity) {
        super(1);
        this.this$0 = newsletterInfoActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z;
        List list = (List) obj;
        C38021na r1 = this.this$0.A0l;
        if (r1 != null) {
            AnonymousClass00C.A0B(list);
            AnonymousClass2EJ r0 = this.this$0.A0j;
            if (r0 == null) {
                throw C36331k8.A0d("newsletterInfoViewModel");
            }
            C44072La r02 = r0.A00;
            if (r02 == null) {
                throw C36331k8.A0d("newsletterInfo");
            }
            r1.A01(r02.A09, list);
        }
        if (this.this$0.A3t().A0O()) {
            AnonymousClass00C.A0B(list);
            boolean z2 = true;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C54792tY r12 = (C54792tY) it.next();
                    AnonymousClass00C.A0D(r12, 0);
                    if ((r12 instanceof AnonymousClass2Y2) && ((AnonymousClass2Y2) r12).A00.A02 == C52382pL.ADMIN) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            NewsletterInfoActivity.A1B(this.this$0, true, z);
            NewsletterInfoActivity newsletterInfoActivity = this.this$0;
            View view = newsletterInfoActivity.A04;
            if (view == null) {
                throw C36331k8.A0d("invitesCard");
            }
            if (view.getVisibility() != 0) {
                z2 = false;
            }
            NewsletterInfoActivity.A1A(newsletterInfoActivity, z, z2);
        }
        return AnonymousClass0AJ.A00;
    }
}
