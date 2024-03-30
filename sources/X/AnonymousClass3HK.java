package X;

import android.app.Activity;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.R;
import com.whatsapp.ctwa.icebreaker.ui.IcebreakerBubbleView;

/* renamed from: X.3HK  reason: invalid class name */
public class AnonymousClass3HK {
    public View A00;
    public ViewGroup A01;
    public ListView A02;
    public TextView A03;
    public C81333wq A04;
    public ShimmerFrameLayout A05;
    public AnonymousClass3AE A06;
    public AnonymousClass3CT A07;
    public IcebreakerBubbleView A08;
    public AnonymousClass80Q A09;
    public AnonymousClass11F A0A;
    public AnonymousClass1N2 A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final int A0G;
    public final int A0H;
    public final Activity A0I;
    public final TextWatcher A0J = new AnonymousClass4WJ(this, 8);
    public final AnonymousClass17Y A0K;
    public final C20050ww A0L;
    public final AnonymousClass3FY A0M;
    public final C39471sS A0N;
    public final AnonymousClass3PE A0O;
    public final C64553Ol A0P;
    public final AnonymousClass31Y A0Q;
    public final AnonymousClass3IH A0R;
    public final AnonymousClass1DU A0S;
    public final AnonymousClass1EM A0T;
    public final boolean A0U;

    public void A00() {
        View view;
        if (this.A0E) {
            int i = this.A0H;
            if (i == 2) {
                view = this.A09;
            } else {
                view = this.A08;
            }
            C36421kH.A0s(view);
            if (this.A0E) {
                this.A0E = false;
                if (i == 2) {
                    this.A01.removeView(this.A00);
                    this.A01.removeView(this.A09);
                    this.A03.removeTextChangedListener(this.A0J);
                }
            }
        }
    }

    public boolean A01() {
        if (this.A0E && this.A0H == 2) {
            AnonymousClass80Q r2 = this.A09;
            C18740tg.A04(r2);
            for (int i = 0; i < this.A01.getChildCount(); i++) {
                if (this.A01.getChildAt(i) == r2 && r2.getVisibility() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public AnonymousClass3HK(Activity activity, AnonymousClass17Y r5, C20050ww r6, AnonymousClass3FY r7, C39471sS r8, AnonymousClass3PE r9, C64553Ol r10, AnonymousClass31Y r11, AnonymousClass3IH r12, AnonymousClass1DU r13, AnonymousClass1EM r14, AnonymousClass1N2 r15) {
        this.A0B = r15;
        this.A0I = activity;
        this.A0K = r5;
        this.A0E = false;
        this.A0S = r13;
        this.A0L = r6;
        this.A0Q = r11;
        this.A0T = r14;
        this.A0O = r9;
        this.A0P = r10;
        this.A0N = r8;
        this.A0G = R.id.icebreaker_container;
        C20810yC r1 = r11.A00;
        this.A0U = r1.A0E(863);
        this.A0H = C36371kC.A00(r1.A0E(1293) ? 1 : 0);
        this.A0R = r12;
        this.A0M = r7;
    }
}
