package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.avatar.profilephoto.AvatarProfilePhotoImageView;

/* renamed from: X.4xT  reason: invalid class name and case insensitive filesystem */
public final class C101384xT extends C96944o9 {
    public final AvatarProfilePhotoImageView A00;
    public final float A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101384xT(View view) {
        super(view);
        AnonymousClass00C.A0D(view, 1);
        this.A00 = (AvatarProfilePhotoImageView) view;
        this.A01 = view.getResources().getDimension(R.dimen.f7nameremoved);
    }

    public static final void A00(C101384xT r3, int i, boolean z) {
        C107975Rq r2;
        if (z) {
            r2 = C107975Rq.SELECTED;
        } else if (!z) {
            r2 = C107975Rq.IDLE;
        } else {
            throw C36441kJ.A18();
        }
        AvatarProfilePhotoImageView avatarProfilePhotoImageView = r3.A00;
        avatarProfilePhotoImageView.setSelected(z);
        avatarProfilePhotoImageView.A05(r2, r3.A01, i);
    }
}
