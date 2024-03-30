package X;

import com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesActivity;

/* renamed from: X.4An  reason: invalid class name and case insensitive filesystem */
public final class C83734An extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ ReportToAdminMessagesActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83734An(ReportToAdminMessagesActivity reportToAdminMessagesActivity) {
        super(0);
        this.this$0 = reportToAdminMessagesActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        ReportToAdminMessagesActivity reportToAdminMessagesActivity = this.this$0;
        C87214Nx r3 = reportToAdminMessagesActivity.A04;
        if (r3 != null) {
            C65533Sl r0 = AnonymousClass147.A01;
            AnonymousClass147 A04 = C65533Sl.A04(C36341k9.A0d(reportToAdminMessagesActivity));
            AnonymousClass08Y r2 = new AnonymousClass08Y();
            r2.A01(new AnonymousClass4M1(r3, A04), C36441kJ.A1A(C39961uN.class));
            return r2.A00();
        }
        throw C36331k8.A0d("rtaViewModelFactory");
    }
}
