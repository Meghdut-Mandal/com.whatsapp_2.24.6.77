package X;

import com.whatsapp.product.newsletterenforcements.enforcedmessages.EnforcedMessagesActivity;

/* renamed from: X.4L6  reason: invalid class name */
public final class AnonymousClass4L6 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ EnforcedMessagesActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4L6(EnforcedMessagesActivity enforcedMessagesActivity) {
        super(1);
        this.this$0 = enforcedMessagesActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        EnforcedMessagesActivity enforcedMessagesActivity;
        AnonymousClass4V4 r0;
        C55102u4 r3 = (C55102u4) obj;
        if (r3 instanceof AnonymousClass2ap) {
            AnonymousClass4V4 r1 = this.this$0.A05;
            AnonymousClass00C.A0E(r1, "null cannot be cast to non-null type com.whatsapp.product.newsletterenforcements.enforcedmessages.EnforcedMessagesAdapter");
            AnonymousClass2JI r12 = (AnonymousClass2JI) r1;
            r12.A00 = ((AnonymousClass2ap) r3).A00;
            r12.notifyDataSetChanged();
            ((AnonymousClass1RJ) this.this$0.A04.getValue()).A03(8);
            enforcedMessagesActivity = this.this$0;
            r0 = enforcedMessagesActivity.A05;
        } else {
            if (r3 instanceof AnonymousClass2ao) {
                C36351kA.A1U(this.this$0.A04);
                enforcedMessagesActivity = this.this$0;
                r0 = null;
            }
            this.this$0.A3l();
            return AnonymousClass0AJ.A00;
        }
        enforcedMessagesActivity.A3i(r0);
        this.this$0.A3l();
        return AnonymousClass0AJ.A00;
    }
}
