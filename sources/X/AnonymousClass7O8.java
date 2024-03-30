package X;

import android.app.Activity;
import android.content.Context;
import com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellView;
import com.whatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellViewController;

/* renamed from: X.7O8  reason: invalid class name */
public final class AnonymousClass7O8 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AvatarStickerUpsellView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7O8(Context context, AvatarStickerUpsellView avatarStickerUpsellView) {
        super(0);
        this.$context = context;
        this.this$0 = avatarStickerUpsellView;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Activity A00 = C24801Dv.A00(this.$context);
        C20810yC abProps = this.this$0.getAbProps();
        AnonymousClass190 waIntents = this.this$0.getWaIntents();
        C24261Bt avatarSharedPreferences = this.this$0.getAvatarSharedPreferences();
        AnonymousClass6WF avatarEditorLauncher = this.this$0.getAvatarEditorLauncher();
        C23871Ae avatarLogger = this.this$0.getAvatarLogger();
        return new AvatarStickerUpsellViewController(A00, this.this$0, abProps, waIntents, this.this$0.getAvatarConfigRepository(), avatarSharedPreferences, avatarEditorLauncher, avatarLogger, this.this$0.getMainDispatcher());
    }
}
