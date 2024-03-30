package X;

import com.whatsapp.conversation.CommentsBottomSheet;

/* renamed from: X.4AD  reason: invalid class name */
public final class AnonymousClass4AD extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ CommentsBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4AD(CommentsBottomSheet commentsBottomSheet) {
        super(0);
        this.this$0 = commentsBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        CommentsBottomSheet commentsBottomSheet = this.this$0;
        AnonymousClass17Y r3 = commentsBottomSheet.A02;
        if (r3 != null) {
            C32681e1 r2 = commentsBottomSheet.A0L;
            if (r2 != null) {
                C19420v0 r1 = commentsBottomSheet.A0A;
                if (r1 != null) {
                    return new AnonymousClass9SI(r3, r1, r2);
                }
                throw C36331k8.A0d("sharedPreferences");
            }
            throw C36331k8.A0b();
        }
        throw C36321k7.A06();
    }
}
