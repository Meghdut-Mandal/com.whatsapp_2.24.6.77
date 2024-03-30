package X;

import com.whatsapp.R;
import com.whatsapp.avatar.privacy.AvatarStickerAllowListPickerActivity;

/* renamed from: X.AlA  reason: case insensitive filesystem */
public final class C22347AlA extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AvatarStickerAllowListPickerActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22347AlA(AvatarStickerAllowListPickerActivity avatarStickerAllowListPickerActivity) {
        super(1);
        this.this$0 = avatarStickerAllowListPickerActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean A1X = AnonymousClass000.A1X(obj);
        AvatarStickerAllowListPickerActivity avatarStickerAllowListPickerActivity = this.this$0;
        if (A1X) {
            avatarStickerAllowListPickerActivity.A3l();
        } else {
            avatarStickerAllowListPickerActivity.finish();
            this.this$0.A05.A06(R.string.f12nameremoved, 1);
        }
        return AnonymousClass0AJ.A00;
    }
}
