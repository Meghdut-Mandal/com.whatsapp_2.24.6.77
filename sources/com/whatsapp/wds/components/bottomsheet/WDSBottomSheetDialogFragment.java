package com.whatsapp.wds.components.bottomsheet;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass0FL;
import X.AnonymousClass3AO;
import X.AnonymousClass3NG;
import X.AnonymousClass4IL;
import X.AnonymousClass5Q5;
import X.AnonymousClass5X0;
import X.AnonymousClass62I;
import X.C32181d7;
import X.C36331k8;
import X.C36341k9;
import X.C36411kG;
import X.C50772lY;
import X.C50792la;
import X.C61253Bd;
import X.C99264sx;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.fragment.app.FragmentContainerView;
import com.whatsapp.R;
import com.whatsapp.biz.catalog.view.variants.TextVariantsBottomSheet;
import com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog;
import com.whatsapp.calling.schedulecall.ScheduleCallFragment;
import com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet;
import com.whatsapp.extensions.webview.view.FlowsWebBottomSheetContainer;
import com.whatsapp.mediacomposer.bottomsheet.MediaQualitySettingsBottomSheetFragment;
import com.whatsapp.product.newsletterenforcements.newsletterguidelines.NewsletterGuidelinesEuropeInfoBottomSheet;
import com.whatsapp.util.Log;
import com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer;

public class WDSBottomSheetDialogFragment extends Hilt_WDSBottomSheetDialogFragment {
    public C32181d7 A00;
    public AnonymousClass3NG A01;
    public final AnonymousClass62I A02 = AnonymousClass5Q5.A00;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int A1i;
        AnonymousClass00C.A0D(layoutInflater, 0);
        if (!A1j().A01 || (A1i = A1i()) == 0) {
            return super.A1G(bundle, layoutInflater, viewGroup);
        }
        return layoutInflater.inflate(A1i, viewGroup, false);
    }

    public void A1S(Bundle bundle, View view) {
        GradientDrawable gradientDrawable;
        AnonymousClass00C.A0D(view, 0);
        if (A1j().A01) {
            if (A0H(this).A06) {
                if (!(view.getParent() instanceof ViewGroup)) {
                    Log.i("WDS: Cannot access parent to inflate bottom sheet handle. Please add it manually.");
                } else {
                    C36341k9.A0z(view, view.getPaddingLeft(), view.getPaddingTop() + C36341k9.A0G(this).getDimensionPixelSize(R.dimen.f7nameremoved));
                    ViewParent parent = view.getParent();
                    AnonymousClass00C.A0E(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    ViewGroup viewGroup = (ViewGroup) parent;
                    if (!(viewGroup instanceof FragmentContainerView)) {
                        A0c().inflate(R.layout.f9nameremoved, viewGroup, true);
                    }
                }
            }
            View A0K = C36411kG.A0K(view);
            if (A0H(this).A00 != -1) {
                float f = (float) A0H(this).A00;
                Drawable background = A0K.getBackground();
                Drawable drawable = null;
                if (background != null) {
                    drawable = background.mutate();
                }
                if ((drawable instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) drawable) != null) {
                    gradientDrawable.setCornerRadii(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
                }
            }
            if (A0H(this).A02 != -1) {
                A0K.setMinimumHeight(A0H(this).A02);
            }
        }
    }

    public boolean A1l() {
        return false;
    }

    public void onConfigurationChanged(Configuration configuration) {
        AnonymousClass0FL r1;
        AnonymousClass00C.A0D(configuration, 0);
        super.onConfigurationChanged(configuration);
        if (A1j().A01) {
            Dialog dialog = this.A02;
            if ((dialog instanceof AnonymousClass0FL) && (r1 = (AnonymousClass0FL) dialog) != null) {
                A0I(r1, this);
            }
        }
    }

    public static final AnonymousClass3AO A0H(WDSBottomSheetDialogFragment wDSBottomSheetDialogFragment) {
        AnonymousClass3NG r0 = wDSBottomSheetDialogFragment.A01;
        if (r0 != null) {
            return r0.A00;
        }
        throw C36331k8.A0d("builder");
    }

    public void A1V(boolean z) {
        C32181d7 r1 = this.A00;
        if (r1 != null) {
            r1.A00(this, this.A0l, z);
            super.A1V(z);
            return;
        }
        throw C36331k8.A0d("fragmentPerfUtils");
    }

    public int A1Y() {
        if (!(this instanceof FcsBottomSheetBaseContainer) && !(this instanceof FlowsWebBottomSheetContainer) && (this instanceof ScheduleCallFragment)) {
            return R.style.f13nameremoved;
        }
        return R.style.f13nameremoved;
    }

    public int A1i() {
        if (this instanceof NewsletterGuidelinesEuropeInfoBottomSheet) {
            return R.layout.f9nameremoved;
        }
        if (this instanceof SearchFunStickersBottomSheet) {
            return ((SearchFunStickersBottomSheet) this).A0T;
        }
        if (this instanceof AudioChatBottomSheetDialog) {
            return ((AudioChatBottomSheetDialog) this).A0H;
        }
        if (this instanceof TextVariantsBottomSheet) {
            return R.layout.f9nameremoved;
        }
        return 0;
    }

    public void A1k(AnonymousClass3NG r4) {
        if (this instanceof MediaQualitySettingsBottomSheetFragment) {
            AnonymousClass00C.A0D(r4, 0);
            C50772lY r0 = C50772lY.A00;
            AnonymousClass3AO r1 = r4.A00;
            r1.A04 = r0;
            r1.A06 = true;
        } else if (this instanceof SearchFunStickersBottomSheet) {
            AnonymousClass00C.A0D(r4, 0);
            r4.A00.A04 = new C50792la(AnonymousClass4IL.A00);
        } else if (this instanceof TextVariantsBottomSheet) {
            AnonymousClass00C.A0D(r4, 0);
            AnonymousClass3AO r2 = r4.A00;
            r2.A06 = false;
            r2.A04 = new C50792la(AnonymousClass4IL.A00);
        }
    }

    public WDSBottomSheetDialogFragment(int i) {
        super(i);
    }

    public static final void A0I(AnonymousClass0FL r2, WDSBottomSheetDialogFragment wDSBottomSheetDialogFragment) {
        C61253Bd r1;
        boolean A1S = AnonymousClass000.A1S(C36341k9.A04(wDSBottomSheetDialogFragment.A0i()), 2);
        AnonymousClass3AO A0H = A0H(wDSBottomSheetDialogFragment);
        if (A1S) {
            r1 = A0H.A05;
        } else {
            r1 = A0H.A04;
        }
        View findViewById = r2.findViewById(R.id.design_bottom_sheet);
        if (findViewById != null) {
            r1.A00(findViewById);
        }
    }

    public void A1Q(Bundle bundle) {
        int i;
        super.A1Q(bundle);
        if (A1j().A01) {
            Context A0a = A0a();
            Resources A0G = C36341k9.A0G(this);
            AnonymousClass00C.A08(A0G);
            int A1Y = A1Y();
            Resources.Theme newTheme = A0G.newTheme();
            newTheme.applyStyle(A1Y, true);
            TypedValue typedValue = new TypedValue();
            if (newTheme.resolveAttribute(R.attr.f4nameremoved, typedValue, true)) {
                i = typedValue.resourceId;
            } else {
                i = R.style.f13nameremoved;
            }
            this.A01 = new AnonymousClass3NG(A0a, i);
            AnonymousClass62I A1j = A1j();
            Resources A0G2 = C36341k9.A0G(this);
            AnonymousClass00C.A08(A0G2);
            AnonymousClass3NG r0 = this.A01;
            if (r0 == null) {
                throw C36331k8.A0d("builder");
            }
            A1j.A01(A0G2, r0);
            AnonymousClass3NG r02 = this.A01;
            if (r02 == null) {
                throw C36331k8.A0d("builder");
            }
            A1k(r02);
        }
    }

    public Dialog A1a(Bundle bundle) {
        AnonymousClass5X0 r3;
        Window window;
        if (!A1j().A01) {
            Dialog A1a = super.A1a(bundle);
            AnonymousClass00C.A08(A1a);
            return A1a;
        }
        if (A1j().A00) {
            r3 = AnonymousClass5X0.A02(this, 35);
        } else {
            r3 = null;
        }
        C99264sx r2 = new C99264sx(A0a(), this, r3, A1Y());
        if (!A1j().A00) {
            if (r2.A01 == null) {
                AnonymousClass0FL.A01(r2);
            }
            r2.A01.A0E = A0H(this).A01;
        }
        if (!(A0H(this).A03 == -1 || (window = r2.getWindow()) == null)) {
            window.setBackgroundDrawableResource(A0H(this).A03);
        }
        return r2;
    }

    public AnonymousClass62I A1j() {
        return this.A02;
    }

    public WDSBottomSheetDialogFragment() {
    }
}
