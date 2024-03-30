package X;

import android.content.Intent;
import com.whatsapp.R;
import com.whatsapp.avatar.home.AvatarHomeActivity;

/* renamed from: X.4IO  reason: invalid class name */
public final class AnonymousClass4IO extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AvatarHomeActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4IO(AvatarHomeActivity avatarHomeActivity) {
        super(1);
        this.this$0 = avatarHomeActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass00C.A0D(obj, 0);
        if (obj.equals(AnonymousClass290.A00)) {
            AvatarHomeActivity avatarHomeActivity = this.this$0;
            Intent A0D = C36431kI.A0D();
            A0D.setClassName(avatarHomeActivity.getPackageName(), "com.whatsapp.avatar.profilephoto.AvatarProfilePhotoActivity");
            avatarHomeActivity.startActivity(A0D);
        } else if (obj.equals(AnonymousClass28z.A00)) {
            AvatarHomeActivity avatarHomeActivity2 = this.this$0;
            if (avatarHomeActivity2.A0D.A0E(7755)) {
                avatarHomeActivity2.startActivity(AnonymousClass190.A11(avatarHomeActivity2, "avatar_home"));
            } else {
                AnonymousClass6WF r2 = avatarHomeActivity2.A0H;
                if (r2 != null) {
                    r2.A04("avatar_home", AnonymousClass001.A0F(avatarHomeActivity2));
                } else {
                    throw C36331k8.A0d("avatarEditorLauncher");
                }
            }
        } else if (obj.equals(AnonymousClass291.A00)) {
            AvatarHomeActivity avatarHomeActivity3 = this.this$0;
            Intent A0D2 = C36431kI.A0D();
            A0D2.setClassName(avatarHomeActivity3.getPackageName(), "com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity");
            A0D2.putExtra("sticker_pack_id", "meta-avatar");
            avatarHomeActivity3.startActivity(A0D2);
        } else if (obj.equals(AnonymousClass292.A00)) {
            AvatarHomeActivity avatarHomeActivity4 = this.this$0;
            avatarHomeActivity4.A3A(new C89644Xi(avatarHomeActivity4, 0), C68683cI.A00, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved);
        }
        return AnonymousClass0AJ.A00;
    }
}
