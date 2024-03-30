package X;

import com.whatsapp.newsletter.NewsletterInfoMembersSearchFragment;
import java.util.List;

/* renamed from: X.4Kg  reason: invalid class name and case insensitive filesystem */
public final class C86264Kg extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ NewsletterInfoMembersSearchFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86264Kg(NewsletterInfoMembersSearchFragment newsletterInfoMembersSearchFragment) {
        super(1);
        this.this$0 = newsletterInfoMembersSearchFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List A0h = C36421kH.A0h(obj);
        NewsletterInfoMembersSearchFragment newsletterInfoMembersSearchFragment = this.this$0;
        C38021na r1 = newsletterInfoMembersSearchFragment.A07;
        if (r1 != null) {
            AnonymousClass2EJ r0 = newsletterInfoMembersSearchFragment.A06;
            if (r0 == null) {
                throw C36331k8.A0d("newsletterInfoViewModel");
            }
            C44072La r02 = r0.A00;
            if (r02 == null) {
                throw C36331k8.A0d("newsletterInfo");
            }
            r1.A01(r02.A09, A0h);
            return AnonymousClass0AJ.A00;
        }
        throw C36331k8.A0Y();
    }
}
