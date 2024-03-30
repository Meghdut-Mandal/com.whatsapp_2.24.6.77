package X;

import com.whatsapp.newsletter.ui.directory.NewsletterDirectoryCategoriesActivity;
import java.util.Iterator;

/* renamed from: X.4Me  reason: invalid class name and case insensitive filesystem */
public final class C86764Me extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C44072La $newsletterInfo;
    public final /* synthetic */ AnonymousClass00S $successCallback;
    public final /* synthetic */ NewsletterDirectoryCategoriesActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86764Me(C44072La r2, NewsletterDirectoryCategoriesActivity newsletterDirectoryCategoriesActivity, AnonymousClass00S r4) {
        super(1);
        this.this$0 = newsletterDirectoryCategoriesActivity;
        this.$newsletterInfo = r2;
        this.$successCallback = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2;
        C40131uz A3k = this.this$0.A3k();
        C44072La r6 = this.$newsletterInfo;
        C52512pY r5 = C52512pY.RECOMMENDED_NEWSLETTERS;
        AnonymousClass00S r4 = this.$successCallback;
        AnonymousClass00C.A0D(r6, 0);
        AnonymousClass11F A06 = r6.A06();
        AnonymousClass00C.A08(A06);
        C001700s r8 = A3k.A05;
        C46522Ye r0 = (C46522Ye) r8.A04();
        if (r0 != null) {
            Iterator it = r0.A00.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (AnonymousClass00C.A0J(((AnonymousClass3JI) obj2).A02.A06(), A06)) {
                    break;
                }
            }
            AnonymousClass3JI r3 = (AnonymousClass3JI) obj2;
            if (r3 != null) {
                r3.A01 = true;
                AnonymousClass3R7.A00(r8);
                A3k.A0A.A00(r6, r5, (Long) null, new C86774Mf(A3k, r3, r4));
                return AnonymousClass0AJ.A00;
            }
        }
        A3k.A0S();
        return AnonymousClass0AJ.A00;
    }
}
