package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.product.newsletterenforcements.userreports.list.NewsletterUserReportsListFragment;
import java.util.List;

/* renamed from: X.4ML  reason: invalid class name */
public final class AnonymousClass4ML extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ View $rootView;
    public final /* synthetic */ NewsletterUserReportsListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4ML(View view, NewsletterUserReportsListFragment newsletterUserReportsListFragment) {
        super(1);
        this.this$0 = newsletterUserReportsListFragment;
        this.$rootView = view;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass1RJ r0;
        AnonymousClass0p2 r7 = (AnonymousClass0p2) obj;
        NewsletterUserReportsListFragment newsletterUserReportsListFragment = this.this$0;
        AnonymousClass1RJ r02 = newsletterUserReportsListFragment.A05;
        if (r02 != null) {
            r02.A03(8);
        }
        AnonymousClass1RJ r03 = newsletterUserReportsListFragment.A04;
        if (r03 != null) {
            r03.A03(8);
        }
        AnonymousClass1RJ r04 = newsletterUserReportsListFragment.A03;
        if (r04 != null) {
            r04.A03(8);
        }
        RecyclerView recyclerView = newsletterUserReportsListFragment.A00;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        if (r7 instanceof C76323og) {
            r0 = this.this$0.A05;
        } else {
            if (r7 instanceof C76293od) {
                RecyclerView recyclerView2 = this.this$0.A00;
                if (recyclerView2 != null) {
                    recyclerView2.setVisibility(0);
                }
                NewsletterUserReportsListFragment newsletterUserReportsListFragment2 = this.this$0;
                List list = ((C76293od) r7).A00;
                C58322zg r05 = newsletterUserReportsListFragment2.A01;
                if (r05 != null) {
                    AnonymousClass4LC r3 = new AnonymousClass4LC(newsletterUserReportsListFragment2);
                    C18800tq r06 = r05.A00.A02;
                    C40661vu r1 = new C40661vu(C36341k9.A0T(r06), C36351kA.A0a(r06), r3);
                    RecyclerView recyclerView3 = newsletterUserReportsListFragment2.A00;
                    if (recyclerView3 != null) {
                        recyclerView3.setAdapter(r1);
                        newsletterUserReportsListFragment2.A0a();
                        C36321k7.A0Q(recyclerView3);
                    }
                    r1.A00 = C89834Yb.A00(list, 9);
                    r1.A06();
                } else {
                    throw C36331k8.A0d("reportsListAdapterFactory");
                }
            } else if (r7 instanceof C76333oh) {
                r0 = this.this$0.A04;
            } else if ((r7 instanceof C76303oe) || (r7 instanceof C76313of)) {
                AnonymousClass1RJ r07 = this.this$0.A03;
                if (r07 != null) {
                    r07.A03(0);
                }
                TextView A0P = C36391kE.A0P(this.$rootView, R.id.fail_generic_error_description);
                boolean z = r7 instanceof C76313of;
                int i = R.string.f12nameremoved;
                if (z) {
                    i = R.string.f12nameremoved;
                }
                A0P.setText(i);
                AnonymousClass3Y5.A00(this.$rootView.findViewById(R.id.fail_generic_error_retry_button), this.this$0, 26);
            }
            return AnonymousClass0AJ.A00;
        }
        if (r0 != null) {
            r0.A03(0);
        }
        return AnonymousClass0AJ.A00;
    }
}
