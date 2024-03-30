package X;

import com.whatsapp.conversation.CommentsBottomSheet;

/* renamed from: X.4AE  reason: invalid class name */
public final class AnonymousClass4AE extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ CommentsBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4AE(CommentsBottomSheet commentsBottomSheet) {
        super(0);
        this.this$0 = commentsBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        CommentsBottomSheet commentsBottomSheet = this.this$0;
        C58192zT r4 = commentsBottomSheet.A01;
        if (r4 != null) {
            Object value = commentsBottomSheet.A0T.getValue();
            Object A0p = C36381kD.A0p(this.this$0.A0Y);
            AnonymousClass00C.A0D(value, 1);
            return new AnonymousClass4ZD(A0p, r4, value, 1);
        }
        throw C36331k8.A0d("commentsBottomSheetViewModelFactory");
    }
}
