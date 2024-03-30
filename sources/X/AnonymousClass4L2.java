package X;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4L2  reason: invalid class name */
public final class AnonymousClass4L2 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ NewsletterAlertsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4L2(NewsletterAlertsActivity newsletterAlertsActivity) {
        super(1);
        this.this$0 = newsletterAlertsActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C16350p1 r11 = (C16350p1) obj;
        NewsletterAlertsActivity newsletterAlertsActivity = this.this$0;
        AnonymousClass1RJ r0 = newsletterAlertsActivity.A09;
        if (r0 == null) {
            throw C36331k8.A0d("loadingIndicator");
        }
        r0.A01().setVisibility(8);
        AnonymousClass1RJ r02 = newsletterAlertsActivity.A07;
        if (r02 == null) {
            throw C36331k8.A0d("emptyResultsLayout");
        }
        C36411kG.A1L(r02, 8);
        AnonymousClass1RJ r03 = newsletterAlertsActivity.A08;
        if (r03 == null) {
            throw C36331k8.A0d("genericErrorLayout");
        }
        C36411kG.A1L(r03, 8);
        RecyclerView recyclerView = newsletterAlertsActivity.A00;
        if (recyclerView == null) {
            throw C36331k8.A0d("recyclerView");
        }
        recyclerView.setVisibility(8);
        int i = 0;
        if (r11 instanceof C76223oW) {
            RecyclerView recyclerView2 = this.this$0.A00;
            if (recyclerView2 == null) {
                throw C36331k8.A0d("recyclerView");
            }
            recyclerView2.setVisibility(0);
            C40851wD r4 = this.this$0.A04;
            if (r4 == null) {
                throw C36331k8.A0Y();
            }
            List list = ((C76223oW) r11).A00;
            AnonymousClass00C.A0D(list, 0);
            if (!list.isEmpty()) {
                C007103b.A0c(list, new C89834Yb(6));
                ArrayList A15 = C36441kJ.A15(list);
                Iterator it = A15.iterator();
                int i2 = 0;
                while (true) {
                    int i3 = -1;
                    if (!it.hasNext()) {
                        break;
                    } else if (!(it.next() instanceof C46672ak)) {
                        i++;
                    } else if (i != -1) {
                        Iterator it2 = A15.iterator();
                        int i4 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            } else if (!(it2.next() instanceof C46692am)) {
                                i4++;
                            } else if (i4 != -1) {
                                Iterator it3 = A15.iterator();
                                int i5 = 0;
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (it3.next() instanceof C46672ak) {
                                            break;
                                        }
                                        i5++;
                                    } else {
                                        i5 = -1;
                                        break;
                                    }
                                }
                                A15.add(i5, new C46682al(R.string.f12nameremoved));
                                Iterator it4 = A15.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        break;
                                    } else if (it4.next() instanceof C46692am) {
                                        i3 = i2;
                                        break;
                                    } else {
                                        i2++;
                                    }
                                }
                                A15.add(i3, new C46682al(R.string.f12nameremoved));
                            }
                        }
                    }
                }
                r4.A00 = A15;
                r4.A06();
            }
        } else if (r11 instanceof C76233oX) {
            NewsletterAlertsActivity newsletterAlertsActivity2 = this.this$0;
            AnonymousClass1RJ r04 = newsletterAlertsActivity2.A07;
            if (r04 == null) {
                throw C36331k8.A0d("emptyResultsLayout");
            }
            C36411kG.A1L(r04, 0);
            WaTextView waTextView = (WaTextView) C36361kB.A0H(newsletterAlertsActivity2, R.id.empty_results_body_text);
            String A0x = C36351kA.A0x(newsletterAlertsActivity2, "clickable-span", new Object[1], 0, R.string.f12nameremoved);
            C32681e1 r42 = newsletterAlertsActivity2.A06;
            if (r42 != null) {
                waTextView.setText(r42.A03(newsletterAlertsActivity2, new C1497372o(newsletterAlertsActivity2, 32), A0x, "clickable-span", C36341k9.A05(waTextView.getContext())));
                C36331k8.A10(waTextView, waTextView.getAbProps());
            } else {
                throw C36331k8.A0b();
            }
        } else if (r11 instanceof C76253oZ) {
            AnonymousClass1RJ r05 = this.this$0.A09;
            if (r05 == null) {
                throw C36331k8.A0d("loadingIndicator");
            }
            C36411kG.A1L(r05, 0);
        } else {
            boolean z = r11 instanceof C76263oa;
            if (z || (r11 instanceof C76243oY)) {
                NewsletterAlertsActivity newsletterAlertsActivity3 = this.this$0;
                AnonymousClass1RJ r06 = newsletterAlertsActivity3.A08;
                if (r06 == null) {
                    throw C36331k8.A0d("genericErrorLayout");
                }
                C36411kG.A1L(r06, 0);
                TextView A0Q = C36391kE.A0Q(newsletterAlertsActivity3, R.id.fail_generic_error_description);
                int i6 = R.string.f12nameremoved;
                if (z) {
                    i6 = R.string.f12nameremoved;
                }
                A0Q.setText(i6);
                AnonymousClass3Y5.A00(newsletterAlertsActivity3.findViewById(R.id.fail_generic_error_retry_button), newsletterAlertsActivity3, 19);
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
