package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.util.Log;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.4MR  reason: invalid class name */
public final class AnonymousClass4MR extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass3KG $asyncBannerData;
    public final /* synthetic */ C87374On $quickPromotion;
    public final /* synthetic */ C33701fn this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4MR(AnonymousClass3KG r2, C33701fn r3, C87374On r4) {
        super(1);
        this.this$0 = r3;
        this.$asyncBannerData = r2;
        this.$quickPromotion = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        String str2;
        Intent A0P;
        String str3;
        String A1A;
        C33701fn r3 = this.this$0;
        C36391kE.A1R(r3.A06, r3, this.$quickPromotion, 22);
        this.$asyncBannerData.A00 = null;
        C33701fn r4 = this.this$0;
        C21642ATi aTi = (C21642ATi) this.$quickPromotion;
        C193929Nl r0 = aTi.A07;
        if (r0 != null) {
            Map map = null;
            C607239c r2 = r0.A01;
            if (r2 != null) {
                C592233c r02 = aTi.A06;
                if (r02 != null) {
                    map = r02.A00;
                }
                C33581fb r7 = r4.A04;
                Context A0B = C36371kC.A0B(r4.A02);
                String str4 = null;
                if (map == null || (A1A = C36431kI.A1A("wa_open_links_via_in_app_browser", map)) == null) {
                    str2 = null;
                } else {
                    str2 = C36431kI.A1D(Locale.ROOT, A1A);
                }
                boolean A0J = AnonymousClass00C.A0J(str2, "true");
                if (map != null) {
                    str4 = C36431kI.A1A("wa_iab_callback_url", map);
                }
                String str5 = r2.A03;
                if (AnonymousClass14B.A0F(str5)) {
                    str5 = r2.A01;
                    if (AnonymousClass14B.A0F(str5)) {
                        str = "BaseBannerQP/handleCTA/No valid url present";
                        Log.i(str);
                        this.this$0.BK9();
                        return AnonymousClass0AJ.A00;
                    }
                }
                if (str5 == null) {
                    str3 = "BaseBannerQP/navigateToUrl/url was null";
                } else {
                    Uri parse = Uri.parse(str5);
                    if (parse == null) {
                        str3 = "BaseBannerQP/navigateToUrl/uri was null";
                    } else {
                        if (1 != r7.A01.A0C(parse)) {
                            A0P = AnonymousClass190.A0P(A0B, parse);
                        } else if (A0J) {
                            A0P = AnonymousClass190.A1L(A0B, str5, str4, true, true);
                        } else {
                            r7.A00.Bp7(A0B, parse, (AnonymousClass3T1) null);
                            this.this$0.BK9();
                            return AnonymousClass0AJ.A00;
                        }
                        r7.A00.A06(A0B, A0P);
                        this.this$0.BK9();
                        return AnonymousClass0AJ.A00;
                    }
                }
                Log.e(str3);
                this.this$0.BK9();
                return AnonymousClass0AJ.A00;
            }
        }
        str = "InAppBannerQP/handleCTA no primary action";
        Log.i(str);
        this.this$0.BK9();
        return AnonymousClass0AJ.A00;
    }
}
