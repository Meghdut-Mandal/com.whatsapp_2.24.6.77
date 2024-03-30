package X;

import android.content.Context;
import android.graphics.PorterDuffXfermode;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

/* renamed from: X.7OH  reason: invalid class name */
public final class AnonymousClass7OH extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ WDSProfilePhoto this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7OH(Context context, WDSProfilePhoto wDSProfilePhoto) {
        super(0);
        this.$context = context;
        this.this$0 = wDSProfilePhoto;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        PorterDuffXfermode porterDuffXfermode = AnonymousClass6SX.A0Q;
        Context context = this.$context;
        C18820ts whatsAppLocale = this.this$0.getWhatsAppLocale();
        WDSProfilePhoto wDSProfilePhoto = this.this$0;
        AnonymousClass5TY r5 = wDSProfilePhoto.A02;
        C108525Tv r4 = wDSProfilePhoto.A01;
        boolean z = wDSProfilePhoto.A04;
        AnonymousClass6K4 r6 = wDSProfilePhoto.A03;
        AnonymousClass00C.A0D(context, 0);
        C36331k8.A1G(r5, 3, r4);
        return new AnonymousClass6SX(context, whatsAppLocale, new C140336lQ(context, whatsAppLocale, wDSProfilePhoto, r4, r5, r6), r4, r5, z);
    }
}
