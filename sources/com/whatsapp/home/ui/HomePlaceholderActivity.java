package com.whatsapp.home.ui;

import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.AnonymousClass00N;
import X.AnonymousClass01L;
import X.AnonymousClass05R;
import X.AnonymousClass09H;
import X.AnonymousClass11F;
import X.AnonymousClass13J;
import X.AnonymousClass1JL;
import X.AnonymousClass1Q7;
import X.AnonymousClass1Q8;
import X.AnonymousClass1QZ;
import X.AnonymousClass1RC;
import X.AnonymousClass4WD;
import X.AnonymousClass6BK;
import X.AnonymousClass7gL;
import X.C006302t;
import X.C007103b;
import X.C011004s;
import X.C012005e;
import X.C18700tb;
import X.C19730wQ;
import X.C19770wU;
import X.C20810yC;
import X.C222013h;
import X.C224514j;
import X.C225314u;
import X.C27851Qb;
import X.C27861Qc;
import X.C32681e1;
import X.C36321k7;
import X.C36331k8;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36421kH;
import X.C36441kJ;
import X.C49282ir;
import X.C53082qk;
import X.C53102qm;
import X.C65723Tf;
import X.C67683aJ;
import X.C70103eb;
import X.C80253v6;
import X.C88814Ud;
import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.OnLifecycleEvent;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet;
import com.whatsapp.settings.chat.wallpaper.WallPaperView;

public final class HomePlaceholderActivity extends C225314u {
    public int A00;
    public ViewTreeObserver.OnGlobalLayoutListener A01;
    public View A02;

    public class HomePlaceholderView extends LinearLayout implements C18700tb, AnonymousClass00N {
        public int A00;
        public View A01;
        public View A02;
        public ImageView A03;
        public TextView A04;
        public C19730wQ A05;
        public AnonymousClass1Q7 A06;
        public C20810yC A07;
        public AnonymousClass1JL A08;
        public WallPaperView A09;
        public C32681e1 A0A;
        public AnonymousClass13J A0B;
        public C19770wU A0C;
        public AnonymousClass1QZ A0D;
        public Integer A0E;
        public C006302t A0F;
        public boolean A0G;
        public boolean A0H;
        public View A0I;
        public TextView A0J;
        public final AnonymousClass4WD A0K;

        public static final void setPlaceholderE2EText$lambda$6(HomePlaceholderView homePlaceholderView) {
            C225314u r1;
            AnonymousClass00C.A0D(homePlaceholderView, 0);
            E2EEDescriptionBottomSheet A032 = E2EEDescriptionBottomSheet.A03(12);
            Context context = homePlaceholderView.getContext();
            if ((context instanceof C225314u) && (r1 = (C225314u) context) != null) {
                r1.Btm(A032);
            }
        }

        public final void setAbProps(C20810yC r2) {
            AnonymousClass00C.A0D(r2, 0);
            this.A07 = r2;
        }

        public final void setLinkifier(C32681e1 r2) {
            AnonymousClass00C.A0D(r2, 0);
            this.A0A = r2;
        }

        public final void setMeManager(C19730wQ r2) {
            AnonymousClass00C.A0D(r2, 0);
            this.A05 = r2;
        }

        public final void setSplitWindowManager(AnonymousClass1JL r2) {
            AnonymousClass00C.A0D(r2, 0);
            this.A08 = r2;
        }

        public final void setSystemFeatures(AnonymousClass13J r2) {
            AnonymousClass00C.A0D(r2, 0);
            this.A0B = r2;
        }

        public final void setVoipReturnToCallBannerBridge(AnonymousClass1Q7 r2) {
            AnonymousClass00C.A0D(r2, 0);
            this.A06 = r2;
        }

        public final void setWaWorkers(C19770wU r2) {
            AnonymousClass00C.A0D(r2, 0);
            this.A0C = r2;
        }

        private final void A00() {
            if (!C222013h.A07) {
                getSystemFeatures();
                return;
            }
            ImageView imageView = this.A03;
            if (imageView != null) {
                imageView.setColorFilter(AnonymousClass00F.A00(getContext(), R.color.f6nameremoved), PorterDuff.Mode.SRC_IN);
            }
        }

        public static final void A02(HomePlaceholderView homePlaceholderView) {
            Context context;
            int i;
            View view = homePlaceholderView.A02;
            if (view == null || view.getVisibility() != 0) {
                context = homePlaceholderView.getContext();
                i = R.color.f6nameremoved;
            } else {
                context = homePlaceholderView.getContext();
                i = C224514j.A00(homePlaceholderView.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved);
            }
            int A002 = AnonymousClass00F.A00(context, i);
            View view2 = homePlaceholderView.A01;
            if (view2 != null) {
                view2.setBackgroundColor(A002);
            }
        }

        public static final void A03(HomePlaceholderView homePlaceholderView, int i, boolean z) {
            int i2;
            if (i != 200) {
                if (i == 300) {
                    ImageView imageView = homePlaceholderView.A03;
                    if (imageView != null) {
                        imageView.setImageResource(R.drawable.vec_ic_status_placeholder);
                    }
                    homePlaceholderView.A00();
                    TextView textView = homePlaceholderView.A04;
                    if (textView != null) {
                        textView.setText(R.string.f12nameremoved);
                    }
                    i2 = R.string.f12nameremoved;
                } else if (i == 400) {
                    ImageView imageView2 = homePlaceholderView.A03;
                    if (imageView2 != null) {
                        imageView2.setImageResource(R.drawable.vec_ic_calls_placeholder);
                    }
                    homePlaceholderView.A00();
                    TextView textView2 = homePlaceholderView.A04;
                    if (textView2 != null) {
                        textView2.setText(R.string.f12nameremoved);
                    }
                    i2 = R.string.f12nameremoved;
                } else if (i == 600) {
                    ImageView imageView3 = homePlaceholderView.A03;
                    if (imageView3 != null) {
                        imageView3.setImageResource(R.drawable.vec_ic_communities_placeholder);
                    }
                    homePlaceholderView.A00();
                    TextView textView3 = homePlaceholderView.A04;
                    if (textView3 != null) {
                        textView3.setText(R.string.f12nameremoved);
                    }
                    i2 = R.string.f12nameremoved;
                }
                homePlaceholderView.setPlaceholderE2EText(i2);
            } else {
                ImageView imageView4 = homePlaceholderView.A03;
                if (imageView4 != null) {
                    imageView4.setImageResource(R.drawable.vec_ic_chat_placeholder);
                }
                homePlaceholderView.A00();
                TextView textView4 = homePlaceholderView.A04;
                if (textView4 != null) {
                    textView4.setText(R.string.f12nameremoved);
                }
                homePlaceholderView.setPlaceholderE2EText(R.string.f12nameremoved);
                homePlaceholderView.getSplitWindowManager().A07(false);
            }
            ImageView imageView5 = homePlaceholderView.A03;
            int i3 = 8;
            if (imageView5 != null) {
                imageView5.setVisibility(C36381kD.A00(z ? 1 : 0));
            }
            TextView textView5 = homePlaceholderView.A04;
            if (textView5 != null) {
                if (!z) {
                    i3 = 0;
                }
                textView5.setVisibility(i3);
            }
        }

        private final void setPlaceholderE2EText(int i) {
            TextView textView = this.A0J;
            if (textView != null) {
                textView.setText(getLinkifier().A03(textView.getContext(), new C80253v6(this, 17), C36381kD.A0t(this, i), "%s", C224514j.A00(textView.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved)));
                C36331k8.A10(textView, getAbProps());
            }
        }

        public final Object generatedComponent() {
            AnonymousClass1QZ r0 = this.A0D;
            if (r0 == null) {
                r0 = C36441kJ.A0v(this);
                this.A0D = r0;
            }
            return r0.generatedComponent();
        }

        public final C20810yC getAbProps() {
            C20810yC r0 = this.A07;
            if (r0 != null) {
                return r0;
            }
            throw C36321k7.A07();
        }

        public final C32681e1 getLinkifier() {
            C32681e1 r0 = this.A0A;
            if (r0 != null) {
                return r0;
            }
            throw C36331k8.A0b();
        }

        public final C19730wQ getMeManager() {
            C19730wQ r0 = this.A05;
            if (r0 != null) {
                return r0;
            }
            throw C36331k8.A0d("meManager");
        }

        public final AnonymousClass1JL getSplitWindowManager() {
            AnonymousClass1JL r0 = this.A08;
            if (r0 != null) {
                return r0;
            }
            throw C36331k8.A0d("splitWindowManager");
        }

        public final AnonymousClass13J getSystemFeatures() {
            AnonymousClass13J r0 = this.A0B;
            if (r0 != null) {
                return r0;
            }
            throw C36331k8.A0d("systemFeatures");
        }

        public final AnonymousClass1Q7 getVoipReturnToCallBannerBridge() {
            AnonymousClass1Q7 r0 = this.A06;
            if (r0 != null) {
                return r0;
            }
            throw C36331k8.A0d("voipReturnToCallBannerBridge");
        }

        public final C19770wU getWaWorkers() {
            C19770wU r0 = this.A0C;
            if (r0 != null) {
                return r0;
            }
            throw C36321k7.A08();
        }

        public HomePlaceholderView(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet);
            if (!this.A0H) {
                this.A0H = true;
                C27861Qc.A0l((C27861Qc) ((C27851Qb) generatedComponent()), this);
            }
        }

        public static final void A01(View view, ViewGroup viewGroup, AnonymousClass09H r6, HomePlaceholderView homePlaceholderView) {
            WindowInsets rootWindowInsets;
            int i;
            C36321k7.A0z(view, r6);
            int i2 = Build.VERSION.SDK_INT;
            int i3 = 0;
            if (i2 >= 30) {
                i3 = view.getRootWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars()).top;
            } else if (i2 >= 23 && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                i3 = rootWindowInsets.getStableInsetTop();
            }
            C006302t r1 = homePlaceholderView.A0F;
            if (r1 != null) {
                r1.invoke(Integer.valueOf(i3));
            }
            Integer num = homePlaceholderView.A0E;
            if (num == null || i3 != num.intValue()) {
                homePlaceholderView.A0E = Integer.valueOf(i3);
                if (homePlaceholderView.A0G) {
                    View view2 = homePlaceholderView.A01;
                    if (!(view2 == null || viewGroup == null)) {
                        viewGroup.removeView(view2);
                    }
                    View view3 = new View(homePlaceholderView.getContext());
                    homePlaceholderView.A01 = view3;
                    if (viewGroup != null) {
                        Integer num2 = homePlaceholderView.A0E;
                        if (num2 != null) {
                            i = num2.intValue();
                        } else {
                            i = 0;
                        }
                        viewGroup.addView(view3, 0, new ViewGroup.LayoutParams(-1, i));
                    }
                    View view4 = homePlaceholderView.A01;
                    if (view4 != null) {
                        C65723Tf.A04(new C53082qk(homePlaceholderView, 13), view4);
                    }
                }
            }
        }

        private final AnonymousClass01L getActivity() {
            Context context = getContext();
            if (context instanceof AnonymousClass01L) {
                return (AnonymousClass01L) context;
            }
            return null;
        }

        public final void A04() {
            if (getSplitWindowManager().A0C()) {
                Iterable A0X = C36421kH.A0X(getSplitWindowManager());
                AnonymousClass4WD r1 = this.A0K;
                if (!C007103b.A0j(A0X, r1)) {
                    getSplitWindowManager().registerObserver(r1);
                }
            }
        }

        public final C006302t getActionBarSizeListener() {
            return this.A0F;
        }

        public final boolean getContentDrawnBehindStatusBar() {
            return this.A0G;
        }

        @OnLifecycleEvent(AnonymousClass05R.ON_START)
        public final void onActivityStarted() {
            C36331k8.A1F(new C49282ir(C36371kC.A0B(this), C36441kJ.A0J(this), this.A09), getWaWorkers());
            A04();
        }

        @OnLifecycleEvent(AnonymousClass05R.ON_STOP)
        public final void onActivityStopped() {
            if (getSplitWindowManager().A0C()) {
                getSplitWindowManager().unregisterObserver(this.A0K);
            }
        }

        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            A04();
            C36331k8.A1F(new C49282ir(C36371kC.A0B(this), C36441kJ.A0J(this), this.A09), getWaWorkers());
            getSystemFeatures();
            ViewGroup A0P = C36411kG.A0P(this, R.id.call_notification_holder);
            AnonymousClass01L activity = getActivity();
            if (activity != null && this.A02 == null) {
                this.A02 = getVoipReturnToCallBannerBridge().B4b(activity, getMeManager(), (AnonymousClass6BK) null, getAbProps(), (AnonymousClass11F) null);
                C88814Ud r0 = ((AnonymousClass1Q8) getVoipReturnToCallBannerBridge()).A00;
                if (r0 != null) {
                    r0.setShouldShowGenericContactOrGroupName(true);
                }
                if (A0P != null) {
                    A0P.addView(this.A02);
                    getVoipReturnToCallBannerBridge().setVisibilityChangeListener(new C70103eb(activity, this));
                }
            }
            C011004s.A07(this, new C67683aJ(A0P, this));
        }

        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            WallPaperView wallPaperView = this.A09;
            if (wallPaperView != null) {
                C36401kF.A1K(wallPaperView);
            }
            ViewGroup A0P = C36411kG.A0P(this, R.id.call_notification_holder);
            View view = this.A01;
            if (view != null) {
                if (A0P != null) {
                    A0P.removeView(view);
                }
                this.A01 = null;
            }
            View view2 = this.A02;
            if (view2 != null) {
                if (A0P != null) {
                    A0P.removeView(view2);
                }
                getVoipReturnToCallBannerBridge().setVisibilityChangeListener((AnonymousClass7gL) null);
                this.A02 = null;
            }
            if (getSplitWindowManager().A0C()) {
                getSplitWindowManager().unregisterObserver(this.A0K);
            }
        }

        public final void setActionBarSizeListener(C006302t r1) {
            this.A0F = r1;
        }

        public final void setContentDrawnBehindStatusBar(boolean z) {
            this.A0G = z;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public HomePlaceholderView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            AnonymousClass00C.A0D(context, 1);
            if (!this.A0H) {
                this.A0H = true;
                C27861Qc.A0l((C27861Qc) ((C27851Qb) generatedComponent()), this);
            }
            this.A00 = 200;
            View.inflate(context, R.layout.f9nameremoved, this);
            this.A03 = C36401kF.A0G(this, R.id.image_placeholder);
            this.A04 = C36391kE.A0O(this, R.id.txt_home_placeholder_title);
            this.A0J = C36391kE.A0O(this, R.id.txt_home_placeholder_sub_title);
            this.A09 = (WallPaperView) C012005e.A02(this, R.id.placeholder_background);
            this.A0I = C012005e.A02(this, R.id.divider);
            A03(this, getSplitWindowManager().A00, false);
            this.A0K = new AnonymousClass4WD(this, 1);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        AnonymousClass1RC.A05(this, R.color.f6nameremoved);
        AnonymousClass1RC.A03(this);
        HomePlaceholderView homePlaceholderView = (HomePlaceholderView) findViewById(R.id.home_placeholder);
        if (homePlaceholderView != null) {
            this.A06.A04(homePlaceholderView);
            homePlaceholderView.A0G = true;
            homePlaceholderView.A0F = C53102qm.A02(this, 28);
        }
        if (Build.VERSION.SDK_INT == 33) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.format = -2;
            layoutParams.flags = 131096;
            this.A02 = new View(this);
            WindowManager windowManager = getWindowManager();
            if (windowManager != null) {
                windowManager.addView(this.A02, layoutParams);
            }
        }
    }

    public void onDestroy() {
        WindowManager windowManager;
        super.onDestroy();
        HomePlaceholderView homePlaceholderView = (HomePlaceholderView) findViewById(R.id.home_placeholder);
        if (homePlaceholderView != null) {
            homePlaceholderView.A0F = null;
            ViewTreeObserver viewTreeObserver = homePlaceholderView.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this.A01);
            }
        }
        View view = this.A02;
        if (view != null && (windowManager = getWindowManager()) != null) {
            windowManager.removeView(view);
        }
    }
}
