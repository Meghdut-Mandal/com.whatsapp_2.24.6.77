package X;

import com.whatsapp.avatar.home.AvatarHomeViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.4IR  reason: invalid class name */
public final class AnonymousClass4IR extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AvatarHomeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4IR(AvatarHomeViewModel avatarHomeViewModel) {
        super(1);
        this.this$0 = avatarHomeViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        AnonymousClass00C.A0D(th, 0);
        Log.e(th);
        AvatarHomeViewModel.A02(this.this$0);
        return AnonymousClass0AJ.A00;
    }
}
