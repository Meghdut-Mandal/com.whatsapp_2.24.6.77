package X;

import com.whatsapp.newsletter.viewmodel.NewsletterViewModel;

/* renamed from: X.4Mg  reason: invalid class name and case insensitive filesystem */
public final class C86784Mg extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass00S $successCallback;
    public final /* synthetic */ AnonymousClass3JI $targetedNewsletter;
    public final /* synthetic */ NewsletterViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86784Mg(NewsletterViewModel newsletterViewModel, AnonymousClass3JI r3, AnonymousClass00S r4) {
        super(1);
        this.$targetedNewsletter = r3;
        this.$successCallback = r4;
        this.this$0 = newsletterViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass00S r0;
        C54892tj r3 = (C54892tj) obj;
        AnonymousClass00C.A0D(r3, 0);
        AnonymousClass3JI r1 = this.$targetedNewsletter;
        r1.A01 = false;
        if (r3 instanceof C46602Yw) {
            C44072La r02 = r1.A02;
            C52382pL r12 = ((C46602Yw) r3).A00;
            r02.A09 = r12;
            if (!(r12 == C52382pL.GUEST || (r0 = this.$successCallback) == null)) {
                r0.invoke();
            }
        }
        AnonymousClass3R7.A00(this.this$0.A02);
        return AnonymousClass0AJ.A00;
    }
}
