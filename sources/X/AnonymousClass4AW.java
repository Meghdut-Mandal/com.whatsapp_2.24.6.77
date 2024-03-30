package X;

import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.conversation.comments.CommentHeader;

/* renamed from: X.4AW  reason: invalid class name */
public final class AnonymousClass4AW extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ CommentHeader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4AW(CommentHeader commentHeader) {
        super(0);
        this.this$0 = commentHeader;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        WaTextView A0Z = C36411kG.A0Z(this.this$0, R.id.comment_header_contact_name_primary);
        A0Z.setGravity(C36421kH.A01(C36401kF.A1X(A0Z.getWhatsAppLocale()) ? 1 : 0));
        return A0Z;
    }
}
