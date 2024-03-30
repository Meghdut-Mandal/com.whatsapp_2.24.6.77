package X;

import android.database.Cursor;
import com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesActivity;

/* renamed from: X.4Js  reason: invalid class name and case insensitive filesystem */
public final class C86124Js extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ ReportToAdminMessagesActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86124Js(ReportToAdminMessagesActivity reportToAdminMessagesActivity) {
        super(1);
        this.this$0 = reportToAdminMessagesActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Cursor cursor = (Cursor) obj;
        C41031wV r0 = this.this$0.A06;
        if (r0 == null) {
            throw C36331k8.A0Y();
        }
        r0.A00 = cursor;
        r0.A06();
        ReportToAdminMessagesActivity.A07(this.this$0);
        return AnonymousClass0AJ.A00;
    }
}
