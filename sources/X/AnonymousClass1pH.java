package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;

/* renamed from: X.1pH  reason: invalid class name */
public final class AnonymousClass1pH extends LinearLayout implements C22927Ayd {
    public final C57162xn A00;
    public final C57182xp A01;
    public final C57192xq A02;
    public final AnonymousClass00T A03;
    public final AnonymousClass00T A04;
    public final AnonymousClass00T A05;

    public static final void A00(AnonymousClass1pH r8, AnonymousClass3IB r9) {
        View groupDescriptionAddUpsell;
        int ordinal = r9.A00.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                r8.getGroupDescriptionAddUpsell().setVisibility(8);
            } else {
                AnonymousClass244 groupDescriptionAddUpsell2 = r8.getGroupDescriptionAddUpsell();
                if (groupDescriptionAddUpsell2.getParent() == null) {
                    LinearLayout.LayoutParams A0N = C36381kD.A0N();
                    A0N.gravity = 17;
                    r8.addView(groupDescriptionAddUpsell2, A0N);
                }
                r8.getGroupDescriptionAddUpsell().setVisibility(0);
            }
            groupDescriptionAddUpsell = r8.getGroupDescriptionText();
        } else {
            AnonymousClass2g0 groupDescriptionText = r8.getGroupDescriptionText();
            if (groupDescriptionText.getParent() == null) {
                LinearLayout.LayoutParams A0N2 = C36381kD.A0N();
                A0N2.gravity = 17;
                r8.addView(groupDescriptionText, A0N2);
            }
            AnonymousClass2g0 groupDescriptionText2 = r8.getGroupDescriptionText();
            CharSequence charSequence = r9.A01;
            groupDescriptionText2.setVisibility(0);
            groupDescriptionText2.A0I(C36441kJ.A0P(AnonymousClass6YV.A08(groupDescriptionText2.A02, groupDescriptionText2.A05, AnonymousClass3UG.A03(groupDescriptionText2.A00, groupDescriptionText2.getPaint(), groupDescriptionText2.A04, charSequence))));
            groupDescriptionText2.A02 = C79043t5.A00;
            groupDescriptionText2.setOnClickListener(new C66963Xz(groupDescriptionText2, 9));
            groupDescriptionAddUpsell = r8.getGroupDescriptionAddUpsell();
        }
        groupDescriptionAddUpsell.setVisibility(8);
    }

    private final AnonymousClass244 getGroupDescriptionAddUpsell() {
        return (AnonymousClass244) this.A03.getValue();
    }

    private final AnonymousClass2g0 getGroupDescriptionText() {
        return (AnonymousClass2g0) this.A04.getValue();
    }

    private final C39761tX getViewModel() {
        return (C39761tX) this.A05.getValue();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1pH(Context context, C57162xn r6, C57182xp r7, C57192xq r8, AnonymousClass147 r9) {
        super(context, (AttributeSet) null);
        C36321k7.A11(r6, r7, r8);
        this.A00 = r6;
        this.A01 = r7;
        this.A02 = r8;
        this.A05 = C36431kI.A1I(new C84944Fe(this, r9));
        this.A03 = C36431kI.A1I(new AnonymousClass4HV(context, this, r9));
        this.A04 = C36431kI.A1I(new AnonymousClass4HW(context, this, r9));
        C88554Td.A00((AnonymousClass014) C24801Dv.A01(context, AnonymousClass155.class), getViewModel().A00, new C86094Jp(this), 45);
    }

    public View getBodyView() {
        return this;
    }

    public LinearLayout.LayoutParams getBodyViewLayoutParams() {
        LinearLayout.LayoutParams A0N = C36381kD.A0N();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        A0N.setMargins(dimensionPixelSize, getResources().getDimensionPixelSize(R.dimen.f7nameremoved), dimensionPixelSize, A0N.bottomMargin);
        return A0N;
    }
}
