package X;

import com.whatsapp.R;
import com.whatsapp.privacy.disclosure.ui.PrivacyDisclosureContainerActivity;
import com.whatsapp.privacy.disclosure.ui.PrivacyDisclosureContainerViewModel;
import java.lang.ref.WeakReference;

/* renamed from: X.7TL  reason: invalid class name */
public final class AnonymousClass7TL extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ PrivacyDisclosureContainerActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7TL(PrivacyDisclosureContainerActivity privacyDisclosureContainerActivity) {
        super(1);
        this.this$0 = privacyDisclosureContainerActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C160877lj r1;
        C128136Ba r6 = (C128136Ba) obj;
        int ordinal = r6.A00.ordinal();
        if (ordinal == 2) {
            this.this$0.A3G((String) null);
        } else if (ordinal != 0) {
            PrivacyDisclosureContainerActivity privacyDisclosureContainerActivity = this.this$0;
            privacyDisclosureContainerActivity.A00 = true;
            privacyDisclosureContainerActivity.Bnv();
            C99304t3 A00 = C99304t3.A00(C36361kB.A0C(privacyDisclosureContainerActivity), R.string.f12nameremoved, -1);
            A00.A0Y(new AnonymousClass3Y5(privacyDisclosureContainerActivity, 14), R.string.f12nameremoved);
            A00.A0V(new C162617os(privacyDisclosureContainerActivity, 1));
            A00.A0P();
            AnonymousClass00T r3 = privacyDisclosureContainerActivity.A02;
            r3.getValue();
            WeakReference weakReference = AnonymousClass6M9.A00;
            if (!(weakReference == null || (r1 = (C160877lj) weakReference.get()) == null)) {
                r1.Bei(C51792oO.ERROR_UNKNOWN);
            }
            AnonymousClass6M9.A00 = null;
            ((PrivacyDisclosureContainerViewModel) r3.getValue()).A0S(499);
        } else {
            PrivacyDisclosureContainerActivity privacyDisclosureContainerActivity2 = this.this$0;
            if (AnonymousClass15V.A02) {
                privacyDisclosureContainerActivity2.Bnv();
            }
            if (r6.A01 != null) {
                PrivacyDisclosureContainerActivity.A0F(privacyDisclosureContainerActivity2);
            } else {
                privacyDisclosureContainerActivity2.finish();
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
