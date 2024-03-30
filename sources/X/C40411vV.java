package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.R;
import com.whatsapp.thunderstorm.ThunderstormContactListItemElements;

/* renamed from: X.1vV  reason: invalid class name and case insensitive filesystem */
public final class C40411vV extends C02920Ck {
    public final C55612uu A00;

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass00C.A0D(viewGroup, 0);
        if (i == 0) {
            return new C47922gG(C36371kC.A0I(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved), this.A00);
        }
        if (i == 1) {
            return new C47912gF(C36371kC.A0I(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved));
        }
        C36321k7.A1S("ThunderstormContactListAdapter/onCreateViewHolder type not handled - ", AnonymousClass000.A0u(), i);
        throw AnonymousClass000.A0d("Unexpected view type: ", AnonymousClass000.A0u(), i);
    }

    public C40411vV(C55612uu r2) {
        super((C02830Cb) C40361vN.A00);
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r7, int i) {
        C42571z2 r72 = (C42571z2) r7;
        AnonymousClass00C.A0D(r72, 0);
        Object A0L = A0L(i);
        AnonymousClass00C.A08(A0L);
        C63313Jo r5 = (C63313Jo) A0L;
        boolean z = r72 instanceof C47922gG;
        AnonymousClass00C.A0D(r5, 0);
        if (z) {
            ThunderstormContactListItemElements thunderstormContactListItemElements = (ThunderstormContactListItemElements) C36361kB.A0F(r72.A0H, R.id.thunderstorm_contact_row_item);
            thunderstormContactListItemElements.setText(r5.A03);
            thunderstormContactListItemElements.setIcon(r5.A01);
            thunderstormContactListItemElements.setSubtitle(r5.A02);
            thunderstormContactListItemElements.setListener(new AnonymousClass3YM(r72, r5, thunderstormContactListItemElements, 31));
            ViewStub A0M = C36431kI.A0M(thunderstormContactListItemElements, R.id.thunderstorm_receiving_progress_bar_stub);
            if (A0M != null && A0M.findViewById(R.id.thunderstorm_receiving_progress_bar_view) == null) {
                View inflate = A0M.inflate();
                AnonymousClass00C.A08(inflate);
                LottieAnimationView lottieAnimationView = (LottieAnimationView) inflate;
                thunderstormContactListItemElements.A00 = lottieAnimationView;
                if (lottieAnimationView == null) {
                    throw C36331k8.A0d("transferReceivingProgressBarAnimation");
                }
                lottieAnimationView.setVisibility(8);
                LottieAnimationView lottieAnimationView2 = thunderstormContactListItemElements.A00;
                if (lottieAnimationView2 == null) {
                    throw C36331k8.A0d("transferReceivingProgressBarAnimation");
                }
                lottieAnimationView2.A02();
                LottieAnimationView lottieAnimationView3 = thunderstormContactListItemElements.A00;
                if (lottieAnimationView3 == null) {
                    throw C36331k8.A0d("transferReceivingProgressBarAnimation");
                }
                lottieAnimationView3.A05(new C89394Wj(thunderstormContactListItemElements, 6));
            }
            LottieAnimationView lottieAnimationView4 = thunderstormContactListItemElements.A00;
            if (lottieAnimationView4 != null) {
                lottieAnimationView4.setVisibility(0);
                LottieAnimationView lottieAnimationView5 = thunderstormContactListItemElements.A00;
                if (lottieAnimationView5 == null) {
                    throw C36331k8.A0d("transferReceivingProgressBarAnimation");
                }
                lottieAnimationView5.A04();
                return;
            }
            return;
        }
        View view = r72.A0H;
        C36351kA.A0F(view, R.id.thunderstorm_empty_contact_list_text).setText(r5.A03);
        TextView A0F = C36351kA.A0F(view, R.id.thunderstorm_use_qr_code);
        Integer num = r5.A02;
        if (num != null) {
            A0F.setText(num.intValue());
        }
    }

    public int getItemViewType(int i) {
        return ((C63313Jo) A0L(i)).A00;
    }
}
