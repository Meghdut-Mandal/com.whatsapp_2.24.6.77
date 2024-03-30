package X;

import com.whatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.7U1  reason: invalid class name */
public final class AnonymousClass7U1 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ int $instanceKey;
    public final /* synthetic */ AvatarProfilePhotoViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7U1(AvatarProfilePhotoViewModel avatarProfilePhotoViewModel, int i) {
        super(1);
        this.this$0 = avatarProfilePhotoViewModel;
        this.$instanceKey = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        AnonymousClass00C.A0D(th, 0);
        Log.e("AvatarProfilePhotoViewModel/init fetching poses", th);
        C132306Ta A0a = C90514aH.A0a(this.this$0.A00);
        boolean z = A0a.A06;
        List list = A0a.A03;
        List list2 = A0a.A02;
        C101424xX r2 = A0a.A00;
        C101394xU r3 = A0a.A01;
        C36321k7.A0v(list, 1, list2);
        this.this$0.A00.A0D(new C132306Ta(r2, r3, list, list2, z, false, true));
        AvatarProfilePhotoViewModel avatarProfilePhotoViewModel = this.this$0;
        avatarProfilePhotoViewModel.A06.A02(C52322pF.FAIL, this.$instanceKey);
        return AnonymousClass0AJ.A00;
    }
}
