package X;

import com.whatsapp.avatar.home.AvatarHomeViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.3or  reason: invalid class name and case insensitive filesystem */
public final class C76433or implements AnonymousClass4TU {
    public final /* synthetic */ AvatarHomeViewModel A00;

    public C76433or(AvatarHomeViewModel avatarHomeViewModel) {
        this.A00 = avatarHomeViewModel;
    }

    public void onFailure(Exception exc) {
        Log.i("onConfirmDeleteAvatarClicked/error");
        this.A00.A00.A0D(new AnonymousClass295(AnonymousClass28y.A00, false, true, false));
    }

    public void onSuccess() {
        Log.i("onConfirmDeleteAvatarClicked/success");
        this.A00.A00.A0D(new AnonymousClass294(true));
    }
}
