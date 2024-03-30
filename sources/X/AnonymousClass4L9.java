package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoActivity;

/* renamed from: X.4L9  reason: invalid class name */
public final class AnonymousClass4L9 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ NewsletterSuspensionInfoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4L9(NewsletterSuspensionInfoActivity newsletterSuspensionInfoActivity) {
        super(1);
        this.this$0 = newsletterSuspensionInfoActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View view;
        View.OnClickListener onClickListener;
        C55122u6 r6 = (C55122u6) obj;
        if (r6 instanceof AnonymousClass2ay) {
            NewsletterSuspensionInfoActivity newsletterSuspensionInfoActivity = this.this$0;
            ((AnonymousClass1RJ) newsletterSuspensionInfoActivity.A05.getValue()).A03(C36421kH.A07(newsletterSuspensionInfoActivity.A08));
            NewsletterSuspensionInfoActivity.A01((AnonymousClass2Z0) null, newsletterSuspensionInfoActivity);
        } else if (r6 instanceof C46722aw) {
            NewsletterSuspensionInfoActivity newsletterSuspensionInfoActivity2 = this.this$0;
            AnonymousClass2Z0 r4 = ((C46722aw) r6).A00;
            int A07 = C36421kH.A07(newsletterSuspensionInfoActivity2.A08);
            switch (r4.A00.ordinal()) {
                case 0:
                case 6:
                    ((AnonymousClass1RJ) newsletterSuspensionInfoActivity2.A05.getValue()).A03(A07);
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                    AnonymousClass00T r2 = newsletterSuspensionInfoActivity2.A05;
                    C36351kA.A1U(r2);
                    ((TextView) C36361kB.A0J(r2)).setText(R.string.f12nameremoved);
                    view = C36361kB.A0J(r2);
                    onClickListener = new AnonymousClass3YH(newsletterSuspensionInfoActivity2, r4, 21);
                    break;
                case 5:
                    AnonymousClass00T r22 = newsletterSuspensionInfoActivity2.A05;
                    C36351kA.A1U(r22);
                    ((TextView) C36361kB.A0J(r22)).setText(R.string.f12nameremoved);
                    view = C36361kB.A0J(r22);
                    onClickListener = new AnonymousClass3Y5(newsletterSuspensionInfoActivity2, 24);
                    break;
            }
            view.setOnClickListener(onClickListener);
            NewsletterSuspensionInfoActivity.A01(r4, newsletterSuspensionInfoActivity2);
        } else if (r6 instanceof AnonymousClass2ax) {
            NewsletterSuspensionInfoActivity newsletterSuspensionInfoActivity3 = this.this$0;
            C36351kA.A1U(newsletterSuspensionInfoActivity3.A08);
            C36341k9.A1R(newsletterSuspensionInfoActivity3.A0B, C36421kH.A07(newsletterSuspensionInfoActivity3.A05));
        }
        return AnonymousClass0AJ.A00;
    }
}
