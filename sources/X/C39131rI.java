package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButtonGroup;
import com.whatsapp.wds.components.internal.header.WDSHeader;

/* renamed from: X.1rI  reason: invalid class name and case insensitive filesystem */
public final class C39131rI extends ConstraintLayout implements AnonymousClass4SZ {
    public C51002mz A00;
    public final View A01 = C36361kB.A0G(this, R.id.footer);
    public final Button A02 = ((Button) C36361kB.A0G(this, R.id.primary_button));
    public final Button A03 = ((Button) C36361kB.A0G(this, R.id.secondary_button));
    public final NestedScrollView A04 = ((NestedScrollView) C36361kB.A0G(this, R.id.content_scroller));
    public final WaTextView A05 = C36341k9.A0Q(this, R.id.footnote);
    public final WaTextView A06 = C36341k9.A0Q(this, R.id.footnote_footer);
    public final WDSButtonGroup A07 = ((WDSButtonGroup) C36361kB.A0G(this, R.id.button_group));
    public final AnonymousClass00T A08;
    public final AnonymousClass00T A09;
    public final ViewGroup A0A = ((ViewGroup) C36361kB.A0G(this, R.id.content_container));
    public final WDSHeader A0B;

    public C39131rI(Context context) {
        super(context, (AttributeSet) null);
        this.A08 = C36431kI.A1I(new C84674Ed(context));
        this.A09 = C36431kI.A1I(new C84694Ef(context));
        C36341k9.A0q(context, this, R.color.f6nameremoved);
        View.inflate(context, R.layout.f9nameremoved, this);
        WDSHeader wDSHeader = (WDSHeader) C36361kB.A0G(this, R.id.header);
        this.A0B = wDSHeader;
        wDSHeader.setHeaderTextGravity(1);
        wDSHeader.setHeaderImageMarginEnabled(true);
    }

    public void setViewState(C51002mz r5) {
        AnonymousClass2vZ r0;
        AnonymousClass00C.A0D(r5, 0);
        this.A0B.setViewState(r5.A02);
        AnonymousClass2vZ r1 = r5.A04;
        C51002mz r02 = this.A00;
        if (r02 != null) {
            r0 = r02.A04;
        } else {
            r0 = null;
        }
        if (!AnonymousClass00C.A0J(r1, r0)) {
            setContent(r1);
        }
        C51382nj r12 = r5.A03;
        WaTextView waTextView = this.A06;
        waTextView.setText((CharSequence) null);
        waTextView.setVisibility(8);
        WaTextView waTextView2 = this.A05;
        waTextView2.setText((CharSequence) null);
        waTextView2.setVisibility(8);
        int ordinal = r12.ordinal();
        if (ordinal == 0) {
            waTextView = waTextView2;
        } else if (ordinal != 1) {
            throw C36441kJ.A18();
        }
        CharSequence charSequence = r5.A05;
        C65723Tf.A03(waTextView, charSequence);
        waTextView.setText(charSequence);
        C63013Ik r3 = r5.A00;
        C63013Ik r2 = r5.A01;
        int i = 8;
        C55992vX.A00(this.A02, r3, 8);
        C55992vX.A00(this.A03, r2, 8);
        WDSButtonGroup wDSButtonGroup = this.A07;
        if (!(r3 == null && r2 == null)) {
            i = 0;
        }
        wDSButtonGroup.setVisibility(i);
        C65723Tf.A04(new C84684Ee(this), this.A04);
        this.A00 = r5;
    }

    private final int getScrollableContentFooterColor() {
        return C36331k8.A02(this.A08);
    }

    private final int getUnscrollableContentFooterColor() {
        return C36331k8.A02(this.A09);
    }

    private final void setContent(AnonymousClass2vZ r6) {
        ViewGroup viewGroup = this.A0A;
        C65723Tf.A03(viewGroup, r6);
        if (r6 instanceof C50982mx) {
            viewGroup.removeAllViews();
            C36351kA.A0C(this).inflate(((C50982mx) r6).A00, viewGroup);
        } else if (r6 instanceof C50972mw) {
            viewGroup.removeAllViews();
            for (AnonymousClass3JS viewState : ((C50972mw) r6).A00) {
                C39111rE r0 = new C39111rE(C36371kC.A0B(this));
                r0.setViewState(viewState);
                viewGroup.addView(r0);
            }
        } else if (r6 == null) {
            viewGroup.removeAllViews();
        }
    }
}
