package X;

import android.content.Intent;
import com.whatsapp.R;
import com.whatsapp.product.integrityappeals.NewsletterRequestReviewSelectReasonActivity;

/* renamed from: X.4L1  reason: invalid class name */
public final class AnonymousClass4L1 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ NewsletterRequestReviewSelectReasonActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4L1(NewsletterRequestReviewSelectReasonActivity newsletterRequestReviewSelectReasonActivity) {
        super(1);
        this.this$0 = newsletterRequestReviewSelectReasonActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C28981Uw A00;
        Intent A0D;
        String packageName;
        String str;
        C51892oY r7 = (C51892oY) obj;
        if (r7 != null) {
            int ordinal = r7.ordinal();
            if (ordinal == 3 || ordinal == 4 || ordinal == 0) {
                this.this$0.A05.A02();
                AnonymousClass17Y r2 = this.this$0.A05;
                int i = R.string.f12nameremoved;
                if (ordinal != 3) {
                    i = R.string.f12nameremoved;
                    if (ordinal != 4) {
                        i = 0;
                        if (ordinal == 0) {
                            i = R.string.f12nameremoved;
                        }
                    }
                }
                r2.A06(i, 0);
                NewsletterRequestReviewSelectReasonActivity newsletterRequestReviewSelectReasonActivity = this.this$0;
                AnonymousClass3X8 r1 = (AnonymousClass3X8) newsletterRequestReviewSelectReasonActivity.A01.getValue();
                if (r1 instanceof AnonymousClass2Z4) {
                    C28981Uw A002 = r1.A00();
                    String str2 = ((AnonymousClass2Z4) r1).A01;
                    A0D = C36431kI.A0D();
                    C36331k8.A0v(A0D, A002, newsletterRequestReviewSelectReasonActivity.getPackageName(), "com.whatsapp.product.newsletterenforcements.geosuspend.NewsletterGeosuspensionInfoActivity");
                    A0D.putExtra("country_code", str2);
                    A0D.setFlags(603979776);
                } else {
                    if (r1 instanceof AnonymousClass2Z5) {
                        A00 = r1.A00();
                        A0D = C36431kI.A0D();
                        packageName = newsletterRequestReviewSelectReasonActivity.getPackageName();
                        str = "com.whatsapp.product.newsletterenforcements.enforcedmessages.EnforcedMessagesActivity";
                    } else if (r1 instanceof AnonymousClass2Z3) {
                        A00 = r1.A00();
                        A0D = C36431kI.A0D();
                        packageName = newsletterRequestReviewSelectReasonActivity.getPackageName();
                        str = "com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoActivity";
                    } else {
                        throw C36441kJ.A18();
                    }
                    C36331k8.A0v(A0D, A00, packageName, str);
                    A0D.addFlags(603979776);
                }
                newsletterRequestReviewSelectReasonActivity.startActivity(A0D);
                newsletterRequestReviewSelectReasonActivity.finish();
            } else if (ordinal == 2) {
                this.this$0.A05.A05(0, R.string.f12nameremoved);
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
