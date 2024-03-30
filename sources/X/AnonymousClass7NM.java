package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;
import com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity;

/* renamed from: X.7NM  reason: invalid class name */
public final class AnonymousClass7NM extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AccountLinkingNativeAuthActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7NM(AccountLinkingNativeAuthActivity accountLinkingNativeAuthActivity) {
        super(0);
        this.this$0 = accountLinkingNativeAuthActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C134716bU r0 = this.this$0.A05;
        if (r0 == null) {
            throw C36331k8.A0d("fb4aUserEntityForNativeAuth");
        }
        String str = (String) r0.A02.A00("XFAM_CROSSPOSTING_NATIVE_AUTH_UI");
        View findViewById = this.this$0.findViewById(R.id.profile_picture_image);
        AnonymousClass00C.A08(findViewById);
        WDSProfilePhoto wDSProfilePhoto = (WDSProfilePhoto) findViewById;
        C19630wG r02 = this.this$0.A02;
        if (r02 != null) {
            C36391kE.A18(r02.A00, wDSProfilePhoto, R.drawable.ic_shimmer_profile);
            if (str != null) {
                AccountLinkingNativeAuthActivity accountLinkingNativeAuthActivity = this.this$0;
                C36421kH.A1G(accountLinkingNativeAuthActivity.A04, accountLinkingNativeAuthActivity, wDSProfilePhoto, str, 27);
            }
            wDSProfilePhoto.setProfileBadge(new C50932ms(new C50902mp(R.color.f6nameremoved, R.color.f6nameremoved), R.drawable.ic_pip_facebook));
            return AnonymousClass0AJ.A00;
        }
        throw C36331k8.A0d("waContext");
    }
}
