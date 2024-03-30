package X;

import com.whatsapp.avatar.profilephoto.AvatarProfilePhotoActivity;

/* renamed from: X.7Rx  reason: invalid class name and case insensitive filesystem */
public final class C154367Rx extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AvatarProfilePhotoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154367Rx(AvatarProfilePhotoActivity avatarProfilePhotoActivity) {
        super(1);
        this.this$0 = avatarProfilePhotoActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass5Rr r5 = (AnonymousClass5Rr) obj;
        if (r5 != null) {
            int ordinal = r5.ordinal();
            if (ordinal == 0) {
                AvatarProfilePhotoActivity avatarProfilePhotoActivity = this.this$0;
                if (!avatarProfilePhotoActivity.A0D.A0E(7755)) {
                    AnonymousClass6WF r2 = avatarProfilePhotoActivity.A09;
                    if (r2 != null) {
                        r2.A04("avatar_profile_photo_tool", AnonymousClass001.A0F(avatarProfilePhotoActivity));
                    } else {
                        throw C36331k8.A0d("avatarEditorLauncher");
                    }
                } else if (avatarProfilePhotoActivity.A08 != null) {
                    avatarProfilePhotoActivity.startActivity(AnonymousClass190.A11(avatarProfilePhotoActivity, "avatar_profile_photo_tool"));
                } else {
                    throw C36331k8.A0X();
                }
            } else if (ordinal == 1) {
                this.this$0.finish();
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
