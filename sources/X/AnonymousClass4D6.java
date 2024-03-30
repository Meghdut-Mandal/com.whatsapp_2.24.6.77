package X;

import com.whatsapp.product.newsletterenforcements.appealsoutcome.NewsletterAppealsOutcomeActivity;

/* renamed from: X.4D6  reason: invalid class name */
public final class AnonymousClass4D6 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ NewsletterAppealsOutcomeActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4D6(NewsletterAppealsOutcomeActivity newsletterAppealsOutcomeActivity) {
        super(0);
        this.this$0 = newsletterAppealsOutcomeActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C206229sv r2;
        AnonymousClass3X9 r1 = (AnonymousClass3X9) this.this$0.A0B.getValue();
        AnonymousClass00C.A0D(r1, 1);
        if (r1 instanceof AnonymousClass2Z2) {
            r2 = C180748mK.A00;
        } else if (r1 instanceof AnonymousClass2Z1) {
            r2 = new C180768mM(((AnonymousClass2Z1) r1).A01);
        } else if (r1 instanceof AnonymousClass2Z0) {
            r2 = C180758mL.A00;
        } else {
            throw C36441kJ.A18();
        }
        C64623Ou r12 = new C64623Ou(r2);
        r12.A00 = true;
        r12.A02 = true;
        return r12.A00();
    }
}
