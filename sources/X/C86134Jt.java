package X;

import com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesActivity;

/* renamed from: X.4Jt  reason: invalid class name and case insensitive filesystem */
public final class C86134Jt extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ ReportToAdminMessagesActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86134Jt(ReportToAdminMessagesActivity reportToAdminMessagesActivity) {
        super(1);
        this.this$0 = reportToAdminMessagesActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ReportToAdminMessagesActivity reportToAdminMessagesActivity = this.this$0;
        int A07 = C36411kG.A07((Number) obj);
        C41031wV r0 = reportToAdminMessagesActivity.A06;
        if (r0 == null) {
            throw C36331k8.A0Y();
        }
        r0.A06();
        if (A07 != 0) {
            AnonymousClass1H2 r8 = reportToAdminMessagesActivity.A0C;
            C70523fI r02 = reportToAdminMessagesActivity.A00;
            AnonymousClass16D r1 = r02.A0C;
            AnonymousClass171 r2 = r02.A0F;
            C18820ts r7 = reportToAdminMessagesActivity.A00;
            AnonymousClass3C3 r03 = reportToAdminMessagesActivity.A02;
            if (r03 != null) {
                AnonymousClass2JQ A00 = r03.A00(reportToAdminMessagesActivity);
                AnonymousClass3PH r5 = new AnonymousClass3PH();
                C43672Jj r6 = reportToAdminMessagesActivity.A07;
                if (r6 != null) {
                    reportToAdminMessagesActivity.A00.A00 = reportToAdminMessagesActivity.But(new AnonymousClass4W7(r1, r2, reportToAdminMessagesActivity, A00, r5, r6, r7, r8));
                } else {
                    throw C36331k8.A0d("modifiedMessagesMessageSelectionActionRepository");
                }
            } else {
                throw C36331k8.A0d("coreMessageSelectionActionExecutorFactory");
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
