package X;

import android.content.Intent;
import com.whatsapp.chatinfo.view.custom.CreatorPrivacyNewsletterBottomSheet;
import java.util.Map;

public final /* synthetic */ class ATA implements AnonymousClass4SH {
    public final /* synthetic */ CreatorPrivacyNewsletterBottomSheet A00;

    public /* synthetic */ ATA(CreatorPrivacyNewsletterBottomSheet creatorPrivacyNewsletterBottomSheet) {
        this.A00 = creatorPrivacyNewsletterBottomSheet;
    }

    public final void BZf(String str, Map map) {
        CreatorPrivacyNewsletterBottomSheet creatorPrivacyNewsletterBottomSheet = this.A00;
        AnonymousClass00C.A0D(map, 2);
        Intent A04 = C36331k8.A04(C36431kI.A1A("link", map));
        C24801Dv r1 = creatorPrivacyNewsletterBottomSheet.A00;
        if (r1 != null) {
            r1.A06(creatorPrivacyNewsletterBottomSheet.A0i(), A04);
            return;
        }
        throw C36331k8.A0d("activityUtils");
    }
}
