package X;

import android.graphics.Bitmap;
import com.whatsapp.avatar.home.AvatarHomeViewModel;

/* renamed from: X.4IS  reason: invalid class name */
public final class AnonymousClass4IS extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AvatarHomeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4IS(AvatarHomeViewModel avatarHomeViewModel) {
        super(1);
        this.this$0 = avatarHomeViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        AnonymousClass00C.A0D(bitmap, 0);
        AvatarHomeViewModel.A01(bitmap, this.this$0);
        return AnonymousClass0AJ.A00;
    }
}
