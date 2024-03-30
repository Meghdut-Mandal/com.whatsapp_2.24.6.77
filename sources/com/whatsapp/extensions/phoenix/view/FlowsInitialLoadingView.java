package com.whatsapp.extensions.phoenix.view;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.AnonymousClass00T;
import X.AnonymousClass012;
import X.AnonymousClass01I;
import X.AnonymousClass044;
import X.AnonymousClass099;
import X.AnonymousClass0QD;
import X.AnonymousClass141;
import X.AnonymousClass16D;
import X.AnonymousClass17Y;
import X.AnonymousClass185;
import X.AnonymousClass1QZ;
import X.AnonymousClass1RJ;
import X.AnonymousClass3L0;
import X.AnonymousClass3LN;
import X.AnonymousClass73T;
import X.AnonymousClass7M5;
import X.C006302t;
import X.C012005e;
import X.C135816dJ;
import X.C154587St;
import X.C165177t0;
import X.C18700tb;
import X.C18800tq;
import X.C18830tt;
import X.C19770wU;
import X.C20380xT;
import X.C20810yC;
import X.C21060yb;
import X.C32681e1;
import X.C33751fs;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36431kI;
import X.C36441kJ;
import X.C80243v5;
import X.C90484aE;
import X.C90494aF;
import X.C90504aG;
import android.app.Activity;
import android.content.Context;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.FAQTextView;
import com.whatsapp.R;
import com.whatsapp.extensions.phoenix.viewmodel.FlowsFooterViewModel;
import com.whatsapp.jid.UserJid;
import java.util.HashMap;
import java.util.Locale;

public final class FlowsInitialLoadingView extends LinearLayout implements C18700tb {
    public View A00;
    public AnonymousClass17Y A01;
    public AnonymousClass16D A02;
    public AnonymousClass185 A03;
    public C33751fs A04;
    public C21060yb A05;
    public C20810yC A06;
    public C20380xT A07;
    public C32681e1 A08;
    public AnonymousClass1RJ A09;
    public C19770wU A0A;
    public AnonymousClass1QZ A0B;
    public FrameLayout A0C;
    public TextView A0D;
    public boolean A0E;
    public final AnonymousClass00T A0F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowsInitialLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        A01();
        this.A0F = C36431kI.A1I(new AnonymousClass7M5(this));
        A00(context);
    }

    private final void A00(Context context) {
        setOrientation(1);
        View.inflate(context, R.layout.f9nameremoved, this);
        this.A00 = C36361kB.A0G(this, R.id.loading);
        this.A0D = C36341k9.A0M(this, R.id.error);
        AnonymousClass1RJ A0X = C36341k9.A0X(this, R.id.footer_business_logo);
        this.A09 = A0X;
        A0X.A03(8);
        this.A0C = (FrameLayout) C36361kB.A0G(this, R.id.loading_error_layout);
        if (getAbProps().A0E(5468)) {
            FrameLayout frameLayout = this.A0C;
            if (frameLayout == null) {
                throw C36331k8.A0d("loadingOrErrorLayout");
            }
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            layoutParams.height = -1;
            FrameLayout frameLayout2 = this.A0C;
            if (frameLayout2 == null) {
                throw C36331k8.A0d("loadingOrErrorLayout");
            }
            frameLayout2.setLayoutParams(layoutParams);
        }
    }

    public static final void setUpFlowsFooterWithLogo$lambda$2(FlowsInitialLoadingView flowsInitialLoadingView) {
        AnonymousClass00C.A0D(flowsInitialLoadingView, 0);
        C33751fs contextualHelpHandler = flowsInitialLoadingView.getContextualHelpHandler();
        Activity A062 = C36361kB.A06(flowsInitialLoadingView);
        AnonymousClass00C.A0E(A062, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        contextualHelpHandler.A01((AnonymousClass01I) A062, "extensions_learn_more");
    }

    public final void setAbProps(C20810yC r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A06 = r2;
    }

    public final void setContactManager(AnonymousClass16D r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final void setContextualHelpHandler(C33751fs r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A04 = r2;
    }

    public final void setFaqLinkFactory(C20380xT r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A07 = r2;
    }

    public final void setGlobalUI(AnonymousClass17Y r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setLinkifier(C32681e1 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A08 = r2;
    }

    public final void setSystemServices(C21060yb r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A05 = r2;
    }

    public final void setVerifiedNameManager(AnonymousClass185 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A03 = r2;
    }

    public final void setWaWorkers(C19770wU r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0A = r2;
    }

    private final FlowsFooterViewModel getFlowsFooterViewModel() {
        return (FlowsFooterViewModel) this.A0F.getValue();
    }

    public static /* synthetic */ void setupFooter$default(FlowsInitialLoadingView flowsInitialLoadingView, UserJid userJid, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        flowsInitialLoadingView.A02(userJid, str, z);
    }

    public void A01() {
        if (!this.A0E) {
            this.A0E = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A07 = C36331k8.A0I(A0W);
            this.A03 = C36371kC.A0U(A0W);
            this.A06 = C36341k9.A0V(A0W);
            this.A02 = C36341k9.A0R(A0W);
            this.A01 = C36351kA.A0M(A0W);
            this.A0A = C36341k9.A0Z(A0W);
            C18830tt r1 = A0W.A00;
            this.A08 = C90484aE.A0Z(r1);
            this.A04 = C90504aG.A0N(r1);
            this.A05 = C36351kA.A0U(A0W);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A0B;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A0B = r0;
        }
        return r0.generatedComponent();
    }

    public final C20810yC getAbProps() {
        C20810yC r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A07();
    }

    public final AnonymousClass16D getContactManager() {
        AnonymousClass16D r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("contactManager");
    }

    public final C33751fs getContextualHelpHandler() {
        C33751fs r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("contextualHelpHandler");
    }

    public final C20380xT getFaqLinkFactory() {
        C20380xT r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("faqLinkFactory");
    }

    public final AnonymousClass17Y getGlobalUI() {
        AnonymousClass17Y r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A06();
    }

    public final C32681e1 getLinkifier() {
        C32681e1 r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("linkifier");
    }

    public final C21060yb getSystemServices() {
        C21060yb r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0W();
    }

    public final AnonymousClass185 getVerifiedNameManager() {
        AnonymousClass185 r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("verifiedNameManager");
    }

    public final C19770wU getWaWorkers() {
        C19770wU r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A08();
    }

    private final void setUpFlowsFooter(UserJid userJid, String str) {
        String str2;
        FAQTextView fAQTextView = (FAQTextView) C36361kB.A0G(this, R.id.footer_faq_text);
        fAQTextView.setVisibility(0);
        FlowsFooterViewModel flowsFooterViewModel = getFlowsFooterViewModel();
        if (flowsFooterViewModel != null) {
            str2 = flowsFooterViewModel.A0S(C36371kC.A0B(this), userJid);
        } else {
            str2 = null;
        }
        fAQTextView.getViewTreeObserver().addOnGlobalLayoutListener(new C135816dJ(fAQTextView));
        fAQTextView.setEducationTextFromArticleID(C36441kJ.A0O(str2), str);
    }

    private final void setUpFlowsFooterWithLogo(UserJid userJid, String str) {
        String str2;
        FlowsFooterViewModel flowsFooterViewModel;
        View A0G = C36361kB.A0G(this, R.id.footer_with_logo_layout);
        int i = 1;
        if (AnonymousClass044.A00(Locale.getDefault()) != 1) {
            i = 0;
        }
        A0G.setLayoutDirection(i);
        A0G.setVisibility(0);
        FlowsFooterViewModel flowsFooterViewModel2 = getFlowsFooterViewModel();
        if (flowsFooterViewModel2 != null) {
            str2 = flowsFooterViewModel2.A0S(C36371kC.A0B(this), userJid);
        } else {
            str2 = null;
        }
        C36341k9.A0M(this, R.id.business_name).setText(str2);
        FAQTextView fAQTextView = (FAQTextView) C36361kB.A0G(this, R.id.learn_more_faq_text);
        if (!getAbProps().A0E(4393) || !AnonymousClass099.A0O(C36431kI.A19(getAbProps(), 3063), "extensions_learn_more", false)) {
            fAQTextView.setEducationTextFromArticleID(C36441kJ.A0O(""), str);
        } else {
            C36331k8.A1A(getAbProps(), fAQTextView);
            String string = getContext().getString(R.string.f12nameremoved);
            int A002 = AnonymousClass00F.A00(getContext(), R.color.f6nameremoved);
            C80243v5 r2 = new C80243v5(this, 16);
            HashMap A0J = AnonymousClass001.A0J();
            A0J.put("learn-more", r2);
            fAQTextView.setText(AnonymousClass3LN.A00((TextAppearanceSpan) null, string, A0J, A002, false));
            C36331k8.A10(fAQTextView, getAbProps());
        }
        AnonymousClass1RJ r0 = this.A09;
        if (r0 == null) {
            throw C36331k8.A0d("businessLogoViewStubHolder");
        }
        r0.A03(0);
        FlowsFooterViewModel flowsFooterViewModel3 = getFlowsFooterViewModel();
        if (flowsFooterViewModel3 != null) {
            Context A0B2 = C36371kC.A0B(this);
            AnonymousClass00C.A0D(userJid, 0);
            AnonymousClass141 A082 = flowsFooterViewModel3.A00.A08(userJid);
            int dimensionPixelSize = A0B2.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            float A042 = C90494aF.A04(A0B2);
            if (A082 != null) {
                flowsFooterViewModel3.A05.Boy(new AnonymousClass73T(A0B2, A082, flowsFooterViewModel3, A042, dimensionPixelSize));
            }
        }
        AnonymousClass012 A003 = AnonymousClass0QD.A00(this);
        if (A003 != null && (flowsFooterViewModel = getFlowsFooterViewModel()) != null) {
            C165177t0.A00(A003, flowsFooterViewModel.A01, new C154587St(this), 23);
        }
    }

    public final void A02(UserJid userJid, String str, boolean z) {
        String str2;
        C36321k7.A0w(userJid, str);
        View A022 = C012005e.A02(this, R.id.ext_footer_layout);
        AnonymousClass00C.A0B(A022);
        A022.setVisibility(C36351kA.A00(z ? 1 : 0));
        FlowsFooterViewModel flowsFooterViewModel = getFlowsFooterViewModel();
        if (flowsFooterViewModel != null) {
            AnonymousClass3L0 A012 = flowsFooterViewModel.A02.A01(userJid);
            if (A012 != null) {
                str2 = A012.A08;
            } else {
                str2 = null;
            }
            if (!(!flowsFooterViewModel.A04.A0E(4078) || str2 == null || str2.length() == 0)) {
                setUpFlowsFooterWithLogo(userJid, str);
                return;
            }
        }
        setUpFlowsFooter(userJid, str);
    }

    public final void setErrorMessage(String str) {
        View A022 = C012005e.A02(this, R.id.ext_footer_layout);
        AnonymousClass00C.A0B(A022);
        A022.setVisibility(0);
        if (str != null && str.length() != 0) {
            TextView textView = this.A0D;
            if (textView == null) {
                throw C36331k8.A0d("errorTextView");
            }
            textView.setText(str);
            textView.setVisibility(0);
            View view = this.A00;
            if (view == null) {
                throw C36331k8.A0d("loadingView");
            }
            view.setVisibility(8);
        }
    }

    public static final void setUpFlowsFooterWithLogo$lambda$4$lambda$3(C006302t r0, Object obj) {
        C90484aE.A1L(r0, obj);
    }

    public FlowsInitialLoadingView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A01();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowsInitialLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        A01();
        this.A0F = C36431kI.A1I(new AnonymousClass7M5(this));
        A00(context);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FlowsInitialLoadingView(Context context) {
        this(context, (AttributeSet) null);
        AnonymousClass00C.A0D(context, 1);
    }
}
