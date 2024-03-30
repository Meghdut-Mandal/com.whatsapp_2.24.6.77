package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.conversation.CommentsBottomSheet;

/* renamed from: X.4AH  reason: invalid class name */
public final class AnonymousClass4AH extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ CommentsBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4AH(CommentsBottomSheet commentsBottomSheet) {
        super(0);
        this.this$0 = commentsBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        View view = this.this$0.A0F;
        if (view != null) {
            return C012005e.A02(view, R.id.entry);
        }
        return null;
    }
}
