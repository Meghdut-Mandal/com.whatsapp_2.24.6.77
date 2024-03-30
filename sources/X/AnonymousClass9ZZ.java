package X;

import com.whatsapp.R;
import com.whatsapp.payments.ui.PaymentsWarmWelcomeBottomSheet;

/* renamed from: X.9ZZ  reason: invalid class name */
public abstract class AnonymousClass9ZZ {
    public static final PaymentsWarmWelcomeBottomSheet A00(String str) {
        AnonymousClass00C.A0D(str, 2);
        PaymentsWarmWelcomeBottomSheet paymentsWarmWelcomeBottomSheet = new PaymentsWarmWelcomeBottomSheet();
        AnonymousClass011[] r2 = new AnonymousClass011[4];
        C90464aC.A1E("bundle_key_headline", Integer.valueOf(R.string.f12nameremoved), r2);
        C90464aC.A1F("bundle_key_body", Integer.valueOf(R.string.f12nameremoved), r2);
        C36341k9.A1J("referral_screen", str, r2, 2);
        C36341k9.A1J("bundle_screen_name", "more_verification_needed_prompt", r2, 3);
        paymentsWarmWelcomeBottomSheet.A17(C05430Pr.A00(r2));
        return paymentsWarmWelcomeBottomSheet;
    }

    public static final PaymentsWarmWelcomeBottomSheet A01(String str) {
        AnonymousClass00C.A0D(str, 4);
        PaymentsWarmWelcomeBottomSheet paymentsWarmWelcomeBottomSheet = new PaymentsWarmWelcomeBottomSheet();
        AnonymousClass011[] r2 = new AnonymousClass011[6];
        C90464aC.A1E("bundle_key_title", Integer.valueOf(R.string.f12nameremoved), r2);
        C90464aC.A1F("bundle_key_image", Integer.valueOf(R.drawable.payments_ts_half_sheet_hero_image), r2);
        C90474aD.A1F("bundle_key_headline", Integer.valueOf(R.string.f12nameremoved), r2);
        C90474aD.A1G("bundle_key_body", Integer.valueOf(R.string.f12nameremoved), r2);
        C36341k9.A1J("referral_screen", str, r2, 4);
        C36341k9.A1J("bundle_screen_name", "get_started", r2, 5);
        paymentsWarmWelcomeBottomSheet.A17(C05430Pr.A00(r2));
        return paymentsWarmWelcomeBottomSheet;
    }
}
