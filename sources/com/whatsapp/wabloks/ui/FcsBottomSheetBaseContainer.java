package com.whatsapp.wabloks.ui;

import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.AnonymousClass01I;
import X.AnonymousClass01L;
import X.AnonymousClass01z;
import X.AnonymousClass02E;
import X.AnonymousClass07B;
import X.AnonymousClass09Y;
import X.AnonymousClass0FL;
import X.AnonymousClass17Y;
import X.AnonymousClass5Oq;
import X.AnonymousClass6EW;
import X.AnonymousClass6JI;
import X.AnonymousClass6ZE;
import X.AnonymousClass700;
import X.AnonymousClass702;
import X.AnonymousClass707;
import X.AnonymousClass708;
import X.AnonymousClass70B;
import X.AnonymousClass7N8;
import X.AnonymousClass7i0;
import X.C012005e;
import X.C115235iY;
import X.C120325rK;
import X.C1272567o;
import X.C131376Ou;
import X.C149026zo;
import X.C149046zq;
import X.C149056zr;
import X.C149106zw;
import X.C158047fi;
import X.C158077fl;
import X.C159757js;
import X.C160377ku;
import X.C164207rR;
import X.C164717sG;
import X.C165237t6;
import X.C18820ts;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36401kF;
import X.C36411kG;
import X.C36431kI;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.extensions.phoenix.view.FlowsInitialLoadingView;
import com.whatsapp.extensions.phoenix.view.PhoenixFlowsBottomSheetContainer;
import com.whatsapp.wabloks.base.FdsContentFragmentManager;
import java.util.Queue;

public class FcsBottomSheetBaseContainer extends Hilt_FcsBottomSheetBaseContainer implements AnonymousClass7i0 {
    public ViewGroup A00;
    public FrameLayout A01;
    public ProgressBar A02;
    public Toolbar A03;
    public C115235iY A04;
    public AnonymousClass17Y A05;
    public WaTextView A06;
    public WaTextView A07;
    public C158047fi A08;
    public C158077fl A09;
    public C18820ts A0A;
    public AnonymousClass6EW A0B;
    public C131376Ou A0C;
    public C120325rK A0D;
    public FdsContentFragmentManager A0E;
    public C1272567o A0F;
    public AnonymousClass5Oq A0G;
    public String A0H = "CLOSE";
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public boolean A0M;
    public boolean A0N = true;
    public int A0O = 100;
    public ImageView A0P;
    public boolean A0Q;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        this.A0L = A0b().getString("fds_state_name");
        this.A0I = A0b().getString("fds_on_back");
        this.A0K = A0b().getString("fds_on_back_params");
        this.A0J = A0b().getString("fds_observer_id");
        String string = A0b().getString("fds_button_style");
        if (string != null) {
            this.A0H = string;
        }
        AnonymousClass6EW r2 = this.A0B;
        if (r2 != null) {
            AnonymousClass6EW.A00(r2, AnonymousClass708.class, this, 23);
            AnonymousClass6EW.A00(r2, AnonymousClass702.class, this, 18);
            AnonymousClass6EW.A00(r2, C149026zo.class, this, 19);
            AnonymousClass6EW.A00(r2, C149046zq.class, this, 20);
            AnonymousClass6EW.A00(r2, AnonymousClass700.class, this, 17);
            AnonymousClass6EW.A00(r2, C149106zw.class, this, 21);
        }
        Context A0a = A0a();
        AnonymousClass01I A0h = A0h();
        AnonymousClass00C.A0E(A0h, "null cannot be cast to non-null type com.whatsapp.wabloks.base.BkFragmentHostSurface");
        C159757js r22 = (C159757js) A0h;
        C18820ts r1 = this.A0A;
        if (r1 != null) {
            this.A0G = new AnonymousClass5Oq(A0a, r1, r22);
            View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
            this.A03 = (Toolbar) C012005e.A02(inflate, R.id.bk_bottom_sheet_toolbar);
            AnonymousClass01I A0h2 = A0h();
            AnonymousClass00C.A0E(A0h2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            AnonymousClass07B A0Q2 = C36431kI.A0Q((AnonymousClass01L) A0h2, this.A03);
            if (A0Q2 != null) {
                A0Q2.A0X(false);
            }
            this.A06 = C36401kF.A0Q(inflate, R.id.toolbar_customized_title);
            this.A0P = C36401kF.A0G(inflate, R.id.bk_branding_image);
            ProgressBar progressBar = (ProgressBar) C36361kB.A0G(inflate, R.id.bk_toolbar_loading);
            Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
            if (indeterminateDrawable != null) {
                indeterminateDrawable.setColorFilter(AnonymousClass00F.A00(inflate.getContext(), R.color.f6nameremoved), PorterDuff.Mode.SRC_IN);
            }
            this.A02 = progressBar;
            ViewGroup A0O2 = C36411kG.A0O(inflate, R.id.webview_title_container);
            this.A00 = A0O2;
            if (A0O2 != null) {
                C36351kA.A1E(A0O2, this, 26);
            }
            this.A07 = C36401kF.A0Q(inflate, R.id.website_url);
            A1m();
            View A0G2 = C36361kB.A0G(inflate, R.id.wa_fcs_bottom_sheet_fragment_container);
            AnonymousClass01z A0k = A0k();
            AnonymousClass00C.A08(A0k);
            if (this.A0A != null) {
                AnonymousClass09Y r3 = new AnonymousClass09Y(A0k);
                String string2 = A0b().getString("fds_observer_id");
                FdsContentFragmentManager fdsContentFragmentManager = new FdsContentFragmentManager();
                fdsContentFragmentManager.A17(C36431kI.A0I("fds_observer_id", string2));
                r3.A0E(fdsContentFragmentManager, "fds_content_manager", A0G2.getId());
                r3.A00(false);
                this.A0E = fdsContentFragmentManager;
            }
            this.A0O = A0b().getInt("fcs_bottom_sheet_max_height_percentage");
            PercentageBasedMaxHeightLinearLayout percentageBasedMaxHeightLinearLayout = (PercentageBasedMaxHeightLinearLayout) inflate.findViewById(R.id.fcs_bottom_sheet);
            if (percentageBasedMaxHeightLinearLayout != null) {
                percentageBasedMaxHeightLinearLayout.A00 = this.A0O;
            }
            this.A0Q = A0b().getBoolean("fcs_show_divider_under_nav_bar");
            C36361kB.A0G(inflate, R.id.divider_under_nav_bar).setVisibility(C36351kA.A00(this.A0Q ? 1 : 0));
            if (this instanceof PhoenixFlowsBottomSheetContainer) {
                PhoenixFlowsBottomSheetContainer phoenixFlowsBottomSheetContainer = (PhoenixFlowsBottomSheetContainer) this;
                FlowsInitialLoadingView flowsInitialLoadingView = new FlowsInitialLoadingView(phoenixFlowsBottomSheetContainer.A0a());
                flowsInitialLoadingView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                phoenixFlowsBottomSheetContainer.A01 = flowsInitialLoadingView;
                FrameLayout frameLayout = (FrameLayout) C36361kB.A0G(inflate, R.id.optional_loading_view_container);
                frameLayout.setVisibility(0);
                frameLayout.addView(flowsInitialLoadingView);
                this.A01 = frameLayout;
            }
            return inflate;
        }
        throw C36321k7.A09();
    }

    public void A1R(Bundle bundle) {
        AnonymousClass00C.A0D(bundle, 0);
        bundle.putString("fds_state_name", this.A0L);
        bundle.putString("fds_on_back", this.A0I);
        bundle.putString("fds_on_back_params", this.A0K);
        bundle.putString("fds_button_style", this.A0H);
        bundle.putString("fds_observer_id", this.A0J);
        bundle.putInt("fcs_bottom_sheet_max_height_percentage", this.A0O);
        bundle.putBoolean("fcs_show_divider_under_nav_bar", this.A0Q);
        super.A1R(bundle);
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        AnonymousClass6EW r2 = this.A0B;
        if (r2 != null) {
            AnonymousClass6EW.A00(r2, AnonymousClass70B.class, this, 22);
        }
        A10(true);
    }

    public void A1T(Menu menu) {
        AnonymousClass00C.A0D(menu, 0);
    }

    public boolean A1X(MenuItem menuItem) {
        AnonymousClass00C.A0D(menuItem, 0);
        AnonymousClass5Oq r0 = this.A0G;
        if (r0 != null && r0.Bbx(menuItem)) {
            return true;
        }
        AnonymousClass02E A0L2 = A0k().A0L(R.id.wa_fcs_bottom_sheet_fragment_container);
        if (A0L2 == null || !A0L2.A1X(menuItem)) {
            return false;
        }
        return true;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        AnonymousClass6EW r1;
        AnonymousClass00C.A0D(dialogInterface, 0);
        if (this.A0N && (r1 = this.A0B) != null) {
            r1.A02(new C149056zr());
        }
        super.onDismiss(dialogInterface);
    }

    public static final void A05(FcsBottomSheetBaseContainer fcsBottomSheetBaseContainer) {
        Object obj;
        C158047fi r0 = fcsBottomSheetBaseContainer.A08;
        C160377ku r2 = null;
        if (r0 != null) {
            obj = ((C164207rR) r0).A00;
        } else {
            obj = null;
        }
        C158077fl r02 = fcsBottomSheetBaseContainer.A09;
        if (r02 != null) {
            r2 = r02.B7y();
        }
        if (obj == null || r2 == null) {
            C36331k8.A0y(fcsBottomSheetBaseContainer.A01);
            AnonymousClass6EW r4 = fcsBottomSheetBaseContainer.A0B;
            if (r4 != null) {
                r4.A02(new AnonymousClass707(fcsBottomSheetBaseContainer.A0I, fcsBottomSheetBaseContainer.A0K, true));
                return;
            }
            return;
        }
        AnonymousClass6JI.A01(r2, obj);
    }

    public final void A1m() {
        C36361kB.A14(this.A03);
        this.A09 = null;
        C1272567o r1 = this.A0F;
        if (r1 != null) {
            r1.A01(A0a(), this.A03, new C165237t6(this, 0), this.A0L, this.A0K, this.A0H);
            return;
        }
        throw C36331k8.A0d("phoenixNavigationBarHelper");
    }

    public void BsW(boolean z) {
        ProgressBar progressBar = this.A02;
        if (progressBar != null) {
            progressBar.setVisibility(C36351kA.A00(z ? 1 : 0));
        }
        A10(!z);
        A0i().invalidateOptionsMenu();
    }

    public void A1H() {
        super.A1H();
        C120325rK r2 = this.A0D;
        if (r2 != null) {
            r2.A00 = false;
            while (true) {
                Queue queue = r2.A01;
                if (queue.isEmpty()) {
                    break;
                }
                queue.remove();
            }
            AnonymousClass6EW r0 = this.A0B;
            if (r0 != null) {
                r0.A04(this);
            }
            this.A0B = null;
            return;
        }
        throw C36331k8.A0d("bkPendingScreenTransitionCallbacks");
    }

    public void A1J() {
        super.A1J();
        this.A03 = null;
        this.A0P = null;
        this.A06 = null;
        this.A02 = null;
        this.A0E = null;
        this.A0G = null;
        this.A01 = null;
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        A1d(0, R.style.f13nameremoved);
        String string = A0b().getString("fds_observer_id");
        if (string != null) {
            C131376Ou r0 = this.A0C;
            if (r0 != null) {
                this.A0B = r0.A02(string);
                return;
            }
            throw C36331k8.A0d("uiObserversFactory");
        }
    }

    public void A1U(Menu menu, MenuInflater menuInflater) {
        C36321k7.A0w(menu, menuInflater);
        menu.clear();
        AnonymousClass5Oq r0 = this.A0G;
        if (r0 != null) {
            r0.BUv(menu);
        }
        AnonymousClass02E A0L2 = A0k().A0L(R.id.wa_fcs_bottom_sheet_fragment_container);
        if (A0L2 != null) {
            A0L2.A1U(menu, menuInflater);
        }
    }

    public Dialog A1a(Bundle bundle) {
        Dialog A1a = super.A1a(bundle);
        AnonymousClass00C.A0E(A1a, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        AnonymousClass0FL r4 = (AnonymousClass0FL) A1a;
        C115235iY r3 = this.A04;
        if (r3 != null) {
            AnonymousClass01I A0i = A0i();
            AnonymousClass7N8 r1 = new AnonymousClass7N8(this);
            AnonymousClass00C.A0D(r4, 1);
            r4.setOnShowListener(new AnonymousClass6ZE(A0i, r4, r3, r1));
            r4.setOnKeyListener(new C164717sG(this, 4));
            return r4;
        }
        throw C36331k8.A0d("bottomSheetDragBehavior");
    }
}
