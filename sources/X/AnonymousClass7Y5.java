package X;

import com.whatsapp.expressionstray.avatars.AvatarExpressionsFragment;

/* renamed from: X.7Y5  reason: invalid class name */
public final class AnonymousClass7Y5 extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ AvatarExpressionsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7Y5(AvatarExpressionsFragment avatarExpressionsFragment) {
        super(2);
        this.this$0 = avatarExpressionsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C135066c4 r5 = (C135066c4) obj;
        C125385zp r4 = (C125385zp) obj2;
        C36321k7.A0w(r5, r4);
        if (!r5.A0K) {
            r5.A05 = C36371kC.A0n();
            AvatarExpressionsFragment avatarExpressionsFragment = this.this$0;
            AnonymousClass3DC r2 = avatarExpressionsFragment.A0F;
            if (r2 != null) {
                r2.A00(avatarExpressionsFragment.A0h(), r4, r5, C36431kI.A1E(AnonymousClass3TE.A00(avatarExpressionsFragment, "rawChatJid")), C36331k8.A1b(this.this$0.A0N));
            } else {
                throw C36331k8.A0d("longClickStickerInfoDialog");
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
