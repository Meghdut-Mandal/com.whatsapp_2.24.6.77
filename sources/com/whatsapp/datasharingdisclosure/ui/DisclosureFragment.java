package com.whatsapp.datasharingdisclosure.ui;

import X.AnonymousClass00C;
import X.AnonymousClass00E;
import X.AnonymousClass00F;
import X.AnonymousClass00S;
import X.AnonymousClass00T;
import X.AnonymousClass1N3;
import X.AnonymousClass3NG;
import X.AnonymousClass3QI;
import X.AnonymousClass3Y0;
import X.AnonymousClass4BK;
import X.AnonymousClass4BL;
import X.AnonymousClass4T5;
import X.C18820ts;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36411kG;
import X.C36431kI;
import X.C36441kJ;
import X.C51612o6;
import X.C53962sB;
import X.C65723Tf;
import X.C89634Xh;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.FAQTextView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;

public abstract class DisclosureFragment extends Hilt_DisclosureFragment {
    public View A00;
    public LinearLayout A01;
    public NestedScrollView A02;
    public AnonymousClass1N3 A03;
    public C18820ts A04;
    public AnonymousClass4T5 A05;
    public C51612o6 A06;
    public AnonymousClass00S A07;
    public final ViewTreeObserver.OnScrollChangedListener A08 = new C89634Xh(this, 4);
    public final Integer A09 = Integer.valueOf(R.color.f6nameremoved);
    public final AnonymousClass00T A0A = C36431kI.A1I(new AnonymousClass4BK(this));

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        Object A0p;
        int i2;
        int i3;
        int i4;
        AnonymousClass00C.A0D(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
        this.A00 = inflate;
        ImageView A0N = C36391kE.A0N(inflate, R.id.icon);
        A0N.setImageResource(R.drawable.vec_ic_consumer_disclosure);
        TextView A0E = C36351kA.A0E(inflate);
        boolean z = this instanceof ConsumerMarketingDisclosureFragment;
        if (z) {
            i = R.string.f12nameremoved;
        } else {
            i = R.string.f12nameremoved;
        }
        A0E.setText(i);
        TextView A0P = C36391kE.A0P(inflate, R.id.description);
        if (z) {
            A0p = ((ConsumerMarketingDisclosureFragment) this).A05.getValue();
        } else {
            A0p = C36381kD.A0p(this.A0A);
        }
        A0P.setText((CharSequence) A0p);
        WaTextView A0Z = C36411kG.A0Z(inflate, R.id.data_row1);
        WaTextView A0Z2 = C36411kG.A0Z(inflate, R.id.data_row2);
        WaTextView A0Z3 = C36411kG.A0Z(inflate, R.id.data_row3);
        AnonymousClass00C.A0B(A0Z);
        A05(A0Z, R.drawable.vec_ic_visibility_off_disclosure);
        AnonymousClass00C.A0B(A0Z2);
        A05(A0Z2, R.drawable.vec_ic_sync);
        AnonymousClass00C.A0B(A0Z3);
        A05(A0Z3, R.drawable.vec_ic_security);
        if (z) {
            i2 = R.string.f12nameremoved;
        } else {
            i2 = R.string.f12nameremoved;
        }
        A0Z.setText(i2);
        if (z) {
            i3 = R.string.f12nameremoved;
        } else {
            i3 = R.string.f12nameremoved;
        }
        A0Z2.setText(i3);
        if (z) {
            i4 = R.string.f12nameremoved;
        } else {
            i4 = R.string.f12nameremoved;
        }
        A0Z3.setText(i4);
        Integer num = this.A09;
        if (num != null) {
            int A002 = AnonymousClass00F.A00(A0a(), num.intValue());
            A0N.setColorFilter(A002);
            Drawable drawable = A0Z.getCompoundDrawables()[0];
            if (drawable != null) {
                drawable.setTint(A002);
            }
            Drawable drawable2 = A0Z2.getCompoundDrawables()[0];
            if (drawable2 != null) {
                drawable2.setTint(A002);
            }
            Drawable drawable3 = A0Z3.getCompoundDrawables()[0];
            if (drawable3 != null) {
                drawable3.setTint(A002);
            }
        }
        this.A02 = (NestedScrollView) inflate.findViewById(R.id.scroll_view);
        this.A01 = C36441kJ.A0U(inflate, R.id.buttons_layout);
        return inflate;
    }

    public void A1S(Bundle bundle, View view) {
        Object A0p;
        int i;
        ViewTreeObserver viewTreeObserver;
        View findViewById;
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        FAQTextView fAQTextView = (FAQTextView) view.findViewById(R.id.description);
        boolean z = this instanceof ConsumerMarketingDisclosureFragment;
        if (z) {
            A0p = ((ConsumerMarketingDisclosureFragment) this).A05.getValue();
        } else {
            A0p = C36381kD.A0p(this.A0A);
        }
        SpannableString A0O = C36441kJ.A0O((CharSequence) A0p);
        AnonymousClass1N3 r1 = this.A03;
        if (r1 != null) {
            fAQTextView.setEducationText(A0O, r1.A00("https://faq.whatsapp.com/785493319976156").toString(), (String) null, new C53962sB(this, 1));
            WDSButton A0u = C36441kJ.A0u(view, R.id.action);
            WDSButton A0u2 = C36441kJ.A0u(view, R.id.cancel);
            C51612o6 r12 = C51612o6.BLOCKING_DISCLOSURE;
            C51612o6 A1m = A1m();
            AnonymousClass00C.A0B(A0u2);
            if (r12 == A1m) {
                AnonymousClass00C.A0B(A0u);
                if (z) {
                    ConsumerMarketingDisclosureFragment consumerMarketingDisclosureFragment = (ConsumerMarketingDisclosureFragment) this;
                    C36321k7.A0w(A0u2, A0u);
                    A0u2.setVisibility(0);
                    AnonymousClass3Y0.A01(A0u2, consumerMarketingDisclosureFragment, 5);
                    A0u.setVisibility(0);
                    AnonymousClass3Y0.A01(A0u, consumerMarketingDisclosureFragment, 6);
                    A0u.setText(R.string.f12nameremoved);
                } else {
                    C36331k8.A1I(A0u2, A0u);
                    int dimensionPixelSize = C36341k9.A0G(this).getDimensionPixelSize(R.dimen.f7nameremoved);
                    View view2 = this.A0F;
                    if (!(view2 == null || (findViewById = view2.findViewById(R.id.icon)) == null)) {
                        C65723Tf.A02(findViewById, new AnonymousClass3QI(0, dimensionPixelSize, 0, 0));
                    }
                    A0u2.setVisibility(0);
                    AnonymousClass3Y0.A01(A0u, this, 9);
                    A0u.setText(R.string.f12nameremoved);
                    AnonymousClass3Y0.A01(A0u2, this, 8);
                }
            } else {
                AnonymousClass00C.A0B(A0u);
                if (z) {
                    ConsumerMarketingDisclosureFragment consumerMarketingDisclosureFragment2 = (ConsumerMarketingDisclosureFragment) this;
                    C36321k7.A0w(A0u2, A0u);
                    A0u2.setVisibility(0);
                    AnonymousClass3Y0.A01(A0u2, consumerMarketingDisclosureFragment2, 5);
                    A0u.setVisibility(0);
                    AnonymousClass3Y0.A01(A0u, consumerMarketingDisclosureFragment2, 6);
                    i = R.string.f12nameremoved;
                } else {
                    ConsumerDisclosureFragment consumerDisclosureFragment = (ConsumerDisclosureFragment) this;
                    C36321k7.A0w(A0u2, A0u);
                    ((ConsumerDisclosureViewModel) consumerDisclosureFragment.A04.getValue()).A0S(consumerDisclosureFragment.A02, consumerDisclosureFragment.A03);
                    A0u2.setVisibility(8);
                    AnonymousClass3Y0.A01(A0u, consumerDisclosureFragment, 4);
                    C51612o6 A1m2 = consumerDisclosureFragment.A1m();
                    C51612o6 r0 = C51612o6.INFO;
                    i = R.string.f12nameremoved;
                    if (A1m2 == r0) {
                        i = R.string.f12nameremoved;
                    }
                }
                A0u.setText(i);
            }
            NestedScrollView nestedScrollView = this.A02;
            if (!(nestedScrollView == null || (viewTreeObserver = nestedScrollView.getViewTreeObserver()) == null)) {
                viewTreeObserver.addOnScrollChangedListener(this.A08);
            }
            View view3 = this.A0F;
            if (view3 != null) {
                C65723Tf.A04(new AnonymousClass4BL(this), view3);
                return;
            }
            return;
        }
        throw C36331k8.A0d("waLinkFactory");
    }

    public void A1k(AnonymousClass3NG r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.A00.A06 = C36371kC.A1W(C51612o6.BLOCKING_DISCLOSURE, A1m());
    }

    public void onConfigurationChanged(Configuration configuration) {
        AnonymousClass00C.A0D(configuration, 0);
        super.onConfigurationChanged(configuration);
        View view = this.A0F;
        if (view != null) {
            C65723Tf.A04(new AnonymousClass4BL(this), view);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        AnonymousClass00C.A0D(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        AnonymousClass00S r0 = this.A07;
        if (r0 != null) {
            r0.invoke();
        }
    }

    public void A1J() {
        ViewTreeObserver viewTreeObserver;
        NestedScrollView nestedScrollView = this.A02;
        if (!(nestedScrollView == null || (viewTreeObserver = nestedScrollView.getViewTreeObserver()) == null)) {
            viewTreeObserver.removeOnScrollChangedListener(this.A08);
        }
        this.A02 = null;
        this.A01 = null;
        super.A1J();
    }

    public final C51612o6 A1m() {
        C51612o6 r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
    }

    private final void A05(WaTextView waTextView, int i) {
        Drawable A002 = AnonymousClass00E.A00(A0a(), i);
        C18820ts r0 = this.A04;
        if (r0 != null) {
            boolean A1Y = C36351kA.A1Y(r0);
            Drawable drawable = null;
            if (A1Y) {
                drawable = A002;
                A002 = null;
            }
            waTextView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, A002, (Drawable) null);
            return;
        }
        throw C36321k7.A09();
    }

    public void A1Q(Bundle bundle) {
        C51612o6[] values = C51612o6.values();
        Bundle bundle2 = this.A0A;
        int i = 0;
        if (bundle2 != null) {
            i = bundle2.getInt("blocking_key", 0);
        }
        C51612o6 r1 = values[i];
        AnonymousClass00C.A0D(r1, 0);
        this.A06 = r1;
        super.A1Q(bundle);
    }

    public final void BqM(AnonymousClass4T5 r1) {
        this.A05 = r1;
    }
}
