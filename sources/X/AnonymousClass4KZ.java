package X;

import android.view.View;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.R;
import com.whatsapp.newsletter.NewsletterInfoActivity;

/* renamed from: X.4KZ  reason: invalid class name */
public final class AnonymousClass4KZ extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ NewsletterInfoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4KZ(NewsletterInfoActivity newsletterInfoActivity) {
        super(1);
        this.this$0 = newsletterInfoActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        ListItemWithLeftIcon listItemWithLeftIcon;
        C51302nb r7 = (C51302nb) obj;
        NewsletterInfoActivity newsletterInfoActivity = this.this$0;
        AnonymousClass00C.A0B(r7);
        newsletterInfoActivity.A05 = C36361kB.A0D(newsletterInfoActivity, R.id.mv_action_card);
        newsletterInfoActivity.A0J = (ListItemWithLeftIcon) C36361kB.A0D(newsletterInfoActivity, R.id.mv_action_btn);
        int ordinal = r7.ordinal();
        if (ordinal == 1) {
            View view = newsletterInfoActivity.A05;
            if (view == null) {
                throw C36331k8.A0d("mvActionCard");
            }
            view.setVisibility(0);
            ListItemWithLeftIcon listItemWithLeftIcon2 = newsletterInfoActivity.A0J;
            if (listItemWithLeftIcon2 == null) {
                throw C36331k8.A0d("mvActionButton");
            }
            AnonymousClass22V.A01(newsletterInfoActivity, listItemWithLeftIcon2, R.string.f12nameremoved);
            int A01 = C36351kA.A01(newsletterInfoActivity, R.attr.f4nameremoved, R.color.f6nameremoved);
            i = AnonymousClass00F.A00(newsletterInfoActivity, C224314h.A01(newsletterInfoActivity, R.attr.f4nameremoved));
            ListItemWithLeftIcon listItemWithLeftIcon3 = newsletterInfoActivity.A0J;
            if (listItemWithLeftIcon3 == null) {
                throw C36331k8.A0d("mvActionButton");
            }
            listItemWithLeftIcon3.setTitleTextColor(A01);
            listItemWithLeftIcon = newsletterInfoActivity.A0J;
            if (listItemWithLeftIcon == null) {
                throw C36331k8.A0d("mvActionButton");
            }
        } else if (ordinal != 2) {
            if (ordinal == 0) {
                View view2 = newsletterInfoActivity.A05;
                if (view2 == null) {
                    throw C36331k8.A0d("mvActionCard");
                }
                view2.setVisibility(8);
            }
            C48902iF.A00(C36361kB.A0D(newsletterInfoActivity, R.id.mv_action_btn), r7, newsletterInfoActivity, 20);
            return AnonymousClass0AJ.A00;
        } else {
            View view3 = newsletterInfoActivity.A05;
            if (view3 == null) {
                throw C36331k8.A0d("mvActionCard");
            }
            view3.setVisibility(0);
            ListItemWithLeftIcon listItemWithLeftIcon4 = newsletterInfoActivity.A0J;
            if (listItemWithLeftIcon4 == null) {
                throw C36331k8.A0d("mvActionButton");
            }
            AnonymousClass22V.A01(newsletterInfoActivity, listItemWithLeftIcon4, R.string.f12nameremoved);
            i = AnonymousClass00F.A00(newsletterInfoActivity, R.color.f6nameremoved);
            ListItemWithLeftIcon listItemWithLeftIcon5 = newsletterInfoActivity.A0J;
            if (listItemWithLeftIcon5 == null) {
                throw C36331k8.A0d("mvActionButton");
            }
            listItemWithLeftIcon5.setTitleTextColor(i);
            listItemWithLeftIcon = newsletterInfoActivity.A0J;
            if (listItemWithLeftIcon == null) {
                throw C36331k8.A0d("mvActionButton");
            }
        }
        listItemWithLeftIcon.setIconColor(i);
        C48902iF.A00(C36361kB.A0D(newsletterInfoActivity, R.id.mv_action_btn), r7, newsletterInfoActivity, 20);
        return AnonymousClass0AJ.A00;
    }
}
