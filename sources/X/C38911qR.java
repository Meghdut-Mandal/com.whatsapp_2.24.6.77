package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

/* renamed from: X.1qR  reason: invalid class name and case insensitive filesystem */
public final class C38911qR extends RelativeLayout {
    public C95944mX A00;
    public final TextView A01;
    public final TextView A02;
    public final RecyclerView A03;
    public final LottieAnimationView A04;
    public final WDSButton A05;
    public final View A06;

    public C38911qR(Context context, C1275668u r8, List list) {
        super(context, (AttributeSet) null, 0);
        View inflate = LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this);
        AnonymousClass00C.A08(inflate);
        this.A06 = inflate;
        RecyclerView recyclerView = (RecyclerView) C36361kB.A0G(inflate, R.id.sup_bottom_sheet_privacy);
        this.A03 = recyclerView;
        TextView A0M = C36341k9.A0M(inflate, R.id.sup_ed_glasses_text);
        this.A01 = A0M;
        TextView A0M2 = C36341k9.A0M(inflate, R.id.title);
        this.A02 = A0M2;
        WDSButton wDSButton = (WDSButton) C36361kB.A0F(inflate, R.id.bottom_sheet_glasses_confirmation_button);
        this.A05 = wDSButton;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) C36361kB.A0G(inflate, R.id.sup_nux_glasses);
        this.A04 = lottieAnimationView;
        if (list != null && r8 != null) {
            A0M2.setText(R.string.f12nameremoved);
            C95944mX r0 = new C95944mX(context, r8, list);
            this.A00 = r0;
            recyclerView.setAdapter(r0);
            C36421kH.A0x(A0M, lottieAnimationView);
            wDSButton.setText(R.string.f12nameremoved);
        }
    }

    public final WDSButton getConfirmationButton() {
        return this.A05;
    }
}
