package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.ArrayList;

/* renamed from: X.2I0  reason: invalid class name */
public class AnonymousClass2I0 extends C174968Zd {
    public View A00;
    public LinearLayout A01;
    public C87224Ny A02;
    public LottieAnimationView A03;
    public C604337v A04;
    public final C39981uP A05;
    public final boolean A06 = this.A0G.A0E(4974);

    public boolean A1E() {
        return false;
    }

    public void A1v(AnonymousClass3T1 r3) {
        AnonymousClass00C.A0D(r3, 0);
        super.A1v(r3);
        A0C();
        if (!this.A0G.A0E(7268)) {
            A0B();
        }
    }

    public void A22(AnonymousClass3T1 r5, boolean z) {
        C63483Kf A0M;
        C89004Uw r0;
        AnonymousClass00C.A0D(r5, 0);
        C64933Qa A0B = C66013Ui.A0B(r5);
        AnonymousClass00C.A08(A0B);
        AnonymousClass3T1 r02 = this.A0K;
        AnonymousClass00C.A08(r02);
        C64933Qa A0B2 = C66013Ui.A0B(r02);
        AnonymousClass00C.A08(A0B2);
        boolean z2 = !A0B.equals(A0B2);
        if ((z2 || z) && (A0M = r5.A0M()) != null && A0M.A01.ordinal() < 3 && (r0 = this.A0c) != null) {
            r0.BrT(r5, 0);
        }
        super.A22(r5, z);
        if (this.A06 && z2 && A0E(r5)) {
            A0D(0);
        }
        C39981uP r03 = this.A05;
        if (r03 != null) {
            r03.A0S(r5);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0074, code lost:
        r7 = r8.A03;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2E(X.AnonymousClass2bV r10) {
        /*
            r9 = this;
            r5 = 0
            X.AnonymousClass00C.A0D(r10, r5)
            X.3T1 r3 = r9.A0K
            X.AnonymousClass00C.A08(r3)
            r9.setFMessage(r10)
            X.005 r0 = r9.A26
            r0.get()
            boolean r0 = X.C63903Lw.A00(r3)
            if (r0 == 0) goto L_0x0109
            X.3T1 r2 = r9.A0K
            if (r3 == r2) goto L_0x0109
            r1 = 131072(0x20000, float:1.83671E-40)
            int r0 = r2.A0A
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1S(r0, r1)
            if (r0 == 0) goto L_0x0109
            X.37F r0 = r2.A0X()
            if (r0 == 0) goto L_0x0109
            int r0 = r3.A0A
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1S(r0, r1)
            if (r0 == 0) goto L_0x0105
            X.37F r0 = r3.A0X()
            X.3Qa r1 = r0.A02
        L_0x003b:
            X.37F r0 = r2.A0X()
            X.3Qa r0 = r0.A02
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0109
            r2 = 1
            X.4Uw r0 = r9.A0c
            if (r0 == 0) goto L_0x004f
            r0.BrT(r10, r5)
        L_0x004f:
            com.whatsapp.TextEmojiLabel r0 = r9.A06
            java.lang.CharSequence r0 = r0.getText()
            int r1 = r0.length()
            r9.A2D()
            if (r2 == 0) goto L_0x0065
            boolean r0 = r9.A06
            if (r0 == 0) goto L_0x0069
            r9.A0D(r1)
        L_0x0065:
            r9.A1w(r10)
            return
        L_0x0069:
            X.37w r8 = new X.37w
            r8.<init>(r9, r1)
            int r3 = r8.A02
            int r2 = r8.A01
            if (r3 <= r2) goto L_0x0065
            X.2IN r7 = r8.A03
            X.4V7 r6 = X.AnonymousClass3SS.A02(r7)
            if (r6 == 0) goto L_0x0065
            int r1 = r7.getBottom()
            android.widget.ListView r0 = r6.getListView()
            int r0 = r0.getHeight()
            if (r1 > r0) goto L_0x0065
            X.C36411kG.A1A(r7, r2)
            r7.requestLayout()
            int[] r0 = X.C36441kJ.A1O()
            r0[r5] = r2
            android.animation.ValueAnimator r2 = X.C36411kG.A0C(r0, r3)
            r3 = 150(0x96, double:7.4E-322)
            X.C36381kD.A14(r2, r3)
            android.view.ViewGroup r1 = r7.A07
            r0 = 4
            r1.setVisibility(r0)
            r0 = 5
            X.C53562rW.A00(r2, r8, r0)
            r1 = 4
            X.4Wj r0 = new X.4Wj
            r0.<init>(r8, r1)
            r2.addListener(r0)
            android.view.ViewTreeObserver r1 = r7.getViewTreeObserver()
            X.4Zj r0 = new X.4Zj
            r0.<init>((X.AnonymousClass4V7) r6, (X.C604437w) r8)
            r1.addOnGlobalLayoutListener(r0)
            com.whatsapp.TextEmojiLabel r1 = r7.A06
            X.AnonymousClass00C.A07(r1)
            int r0 = r8.A00
            X.3Np r7 = new X.3Np
            r7.<init>(r1, r0)
            android.animation.ValueAnimator r6 = r7.A02
            r6.setStartDelay(r3)
            r0 = 7
            X.AnonymousClass4VL.A00(r6, r8, r0)
            r2.start()
            java.lang.CharSequence r1 = r7.A04
            int r0 = r1.length()
            int r2 = r7.A01
            if (r0 > r2) goto L_0x00e4
            r6.end()
            goto L_0x0065
        L_0x00e4:
            android.text.SpannableStringBuilder r1 = X.C36441kJ.A0P(r1)
            X.C64343Np.A00(r1, r7, r2, r5)
            r6.setDuration(r3)
            android.view.animation.Interpolator r0 = X.C56812wv.A00
            r6.setInterpolator(r0)
            X.3Uv r0 = new X.3Uv
            r0.<init>(r1, r7, r2)
            r6.addUpdateListener(r0)
            r0 = 11
            X.AnonymousClass4VL.A00(r6, r7, r0)
            r6.start()
            goto L_0x0065
        L_0x0105:
            X.3Qa r1 = r3.A1J
            goto L_0x003b
        L_0x0109:
            r2 = 0
            goto L_0x004f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2I0.A2E(X.2bV):void");
    }

    public String getGroupRoleTitle() {
        return null;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4 = i;
        int i5 = i2;
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        LinearLayout linearLayout = this.A01;
        if (linearLayout != null) {
            C34081gQ.A06(linearLayout, i4, 0, 0, i5, 0);
            i3 = C37541mm.A00(linearLayout);
        } else {
            i3 = 0;
        }
        setMeasuredDimension(measuredWidth, measuredHeight + i3);
    }

    public final void setInlineFeedbackViewModelFactory(C87224Ny r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    private final void A0C() {
        AnonymousClass3T1 r0 = this.A0K;
        AnonymousClass00C.A08(r0);
        if (A0E(r0)) {
            ViewGroup viewGroup = this.A07;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                viewGroup.getChildAt(i).setVisibility(8);
            }
            if (this.A03 == null) {
                View A0J = C36431kI.A0J(C36351kA.A0C(this), R.layout.f9nameremoved);
                AnonymousClass00C.A0E(A0J, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
                LottieAnimationView lottieAnimationView = (LottieAnimationView) A0J;
                this.A03 = lottieAnimationView;
                if (lottieAnimationView != null) {
                    lottieAnimationView.setRepeatCount(-1);
                }
                C18820ts r02 = this.A0E;
                LottieAnimationView lottieAnimationView2 = this.A03;
                AnonymousClass00C.A0E(lottieAnimationView2, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
                boolean A1X = C36401kF.A1X(r02);
                float f = 1.0f;
                if (A1X) {
                    f = -1.0f;
                }
                lottieAnimationView2.setSpeed(f);
                viewGroup.addView(this.A03);
            }
            LottieAnimationView lottieAnimationView3 = this.A03;
            if (lottieAnimationView3 != null) {
                lottieAnimationView3.setAnimation((int) R.raw.typing_indicator);
            }
            LottieAnimationView lottieAnimationView4 = this.A03;
            AnonymousClass00C.A0E(lottieAnimationView4, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
            C34081gQ.A07(lottieAnimationView4, C36341k9.A0F(this).getColor(R.color.f6nameremoved));
            LottieAnimationView lottieAnimationView5 = this.A03;
            if (lottieAnimationView5 != null) {
                lottieAnimationView5.A04();
            }
            LottieAnimationView lottieAnimationView6 = this.A03;
            if (lottieAnimationView6 != null) {
                lottieAnimationView6.setVisibility(0);
                return;
            }
            return;
        }
        LottieAnimationView lottieAnimationView7 = this.A03;
        if (lottieAnimationView7 != null) {
            lottieAnimationView7.A03();
            LottieAnimationView lottieAnimationView8 = this.A03;
            if (lottieAnimationView8 != null) {
                lottieAnimationView8.setVisibility(8);
            }
        }
        super.A1v(this.A0K);
    }

    private final void A0D(int i) {
        int max;
        AnonymousClass4V7 A022;
        if (this.A04 == null || i == 0) {
            C20810yC r1 = this.A0G;
            AnonymousClass00C.A07(r1);
            this.A04 = new C604337v(this, r1);
        }
        AnonymousClass3T1 r0 = this.A0K;
        AnonymousClass00C.A08(r0);
        boolean A0E = A0E(r0);
        C604337v r4 = this.A04;
        if (A0E) {
            if (r4 != null) {
                AnonymousClass2I0 r5 = r4.A01;
                int height = r5.getHeight();
                AnonymousClass000.A16(r5, r5.getMeasuredHeight(), 0, View.MeasureSpec.makeMeasureSpec(r5.getMeasuredWidth(), Integer.MIN_VALUE));
                int measuredHeight = r5.getMeasuredHeight();
                TextEmojiLabel textEmojiLabel = r5.A06;
                textEmojiLabel.getLineCount();
                if (measuredHeight > height && (A022 = AnonymousClass3SS.A02(r5)) != null) {
                    if (r5.getTop() - (measuredHeight - height) < A022.getListView().getTop() || textEmojiLabel.getLineCount() > r4.A00) {
                        A022.B5Q();
                    } else if (r5.getBottom() <= A022.getListView().getHeight()) {
                        C36411kG.A1A(r5, height);
                        r5.requestLayout();
                        int[] A1O = C36441kJ.A1O();
                        A1O[0] = height;
                        A1O[1] = measuredHeight;
                        ValueAnimator ofInt = ValueAnimator.ofInt(A1O);
                        C36381kD.A14(ofInt, 150);
                        C53562rW.A00(ofInt, r4, 4);
                        ofInt.addListener(new C89394Wj(r4, 3));
                        r5.getViewTreeObserver().addOnGlobalLayoutListener(new C90174Zj(A022, r4));
                        ofInt.start();
                    }
                }
                C64443Nz r9 = r4.A02;
                Handler handler = r9.A02;
                handler.removeCallbacksAndMessages((Object) null);
                r9.A01 = r9.A00;
                CharSequence text = r9.A04.getText();
                AnonymousClass00C.A08(text);
                r9.A03 = text;
                if (text.length() > r9.A01) {
                    r9.A00 = r9.A03.length();
                    int i2 = r9.A01;
                    if (i2 != 0) {
                        C64443Nz.A00(r9, i2);
                        String obj = r9.A03.toString();
                        int i3 = r9.A01;
                        ArrayList A0l = C36341k9.A0l(obj);
                        int length = obj.length();
                        int i4 = i3;
                        while (i3 < length) {
                            if (C06780Vb.A01(obj.charAt(i3))) {
                                if (i4 != i3) {
                                    AnonymousClass000.A1F(A0l, i4);
                                }
                                i4 = i3 + 1;
                            }
                            i3++;
                        }
                        if (i4 != length) {
                            AnonymousClass000.A1F(A0l, i4);
                        }
                        if (!A0l.isEmpty()) {
                            long j = 0;
                            int size = A0l.size();
                            int A07 = r9.A05.A07(5150);
                            if (A07 == 0) {
                                max = 50;
                            } else {
                                max = Math.max(16, A07 / size);
                            }
                            A0l.size();
                            int size2 = A0l.size();
                            for (int i5 = 0; i5 < size2; i5++) {
                                int length2 = r9.A03.length() - 1;
                                if (i5 < A0l.size() - 1) {
                                    length2 = AnonymousClass000.A0I(A0l.get(i5 + 1)) - 1;
                                }
                                handler.sendMessageDelayed(Message.obtain(handler, 0, C36421kH.A0j(A0l.get(i5), length2)), j);
                                j += (long) max;
                            }
                        }
                    }
                }
            }
        } else if (r4 != null) {
            r4.A02.A02.removeCallbacksAndMessages((Object) null);
        }
    }

    public final C87224Ny getInlineFeedbackViewModelFactory() {
        C87224Ny r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("inlineFeedbackViewModelFactory");
    }

    public C89014Ux getRowCustomizer() {
        C89004Uw r0;
        if (!C197029b1.A00(this.A0K.A1J.A00) && (r0 = this.A0c) != null && r0.getContainerType() == 0) {
            return this.A0C.A05;
        }
        C89014Ux rowCustomizer = super.getRowCustomizer();
        AnonymousClass00C.A08(rowCustomizer);
        return rowCustomizer;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2I0(Context context, C89004Uw r13, AnonymousClass2bV r14) {
        super(context, r13, r14);
        C36321k7.A0x(context, r14);
        if (r13 != null) {
            C001600r lastMessageLiveData = r13.getLastMessageLiveData();
            C001600r hasOutgoingMessagesLiveData = r13.getHasOutgoingMessagesLiveData();
            if (!(lastMessageLiveData == null || hasOutgoingMessagesLiveData == null)) {
                AnonymousClass005 r1 = this.A27;
                AnonymousClass00C.A07(r1);
                AnonymousClass005 r5 = this.A25;
                AnonymousClass00C.A07(r5);
                AnonymousClass11F r4 = r14.A1J.A00;
                C25681Hg r12 = (C25681Hg) r1.get();
                if (r12.A00() && r12.A00.A03()) {
                    C20810yC r2 = r12.A01;
                    if (r2.A0E(5246) && !C20800yB.A01(C21000yV.A01, r2, 6358) && ((AnonymousClass1K3) r5.get()).BLB(r4)) {
                        C18800tq r15 = ((C70843fo) getInlineFeedbackViewModelFactory()).A00.A01;
                        C39981uP r52 = new C39981uP(lastMessageLiveData, hasOutgoingMessagesLiveData, C36381kD.A0Q(r15.A0x), (C585330b) r15.A0z.get(), C36341k9.A0Z(r15));
                        this.A05 = r52;
                        C88554Td.A00(r13.getLifecycleOwner(), r52.A00, C53102qm.A02(this, 19), 28);
                        r52.A0S(r14);
                        return;
                    }
                }
            }
        }
        this.A05 = null;
    }

    private final void A0B() {
        String str;
        Uri parse;
        int i;
        int ordinal;
        View findViewById = findViewById(R.id.search_provider_attribution);
        if (findViewById != null) {
            AnonymousClass1RJ r4 = new AnonymousClass1RJ(findViewById);
            AnonymousClass3KQ A0N = this.A0K.A0N();
            C52222p5 r1 = null;
            if (A0N != null) {
                r1 = A0N.A01;
            }
            AnonymousClass3KQ A0N2 = this.A0K.A0N();
            if (A0N2 == null || (str = A0N2.A04) == null || (parse = Uri.parse(str)) == null) {
                r4.A03(8);
                return;
            }
            r4.A03(0);
            Context context = getContext();
            if (r1 == null || (ordinal = r1.ordinal()) == -1) {
                i = R.string.f12nameremoved;
            } else {
                i = R.string.f12nameremoved;
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        i = R.string.f12nameremoved;
                    } else {
                        throw C36441kJ.A18();
                    }
                }
            }
            String A0m = C36361kB.A0m(context, i);
            Context context2 = getContext();
            C20810yC r11 = this.A0G;
            AnonymousClass17Y r8 = this.A0R;
            AnonymousClass6YV.A0E(context2, parse, this.A0P, r8, (TextEmojiLabel) r4.A01(), this.A0D, r11, A0m, "link-one");
        }
    }

    private final boolean A0E(AnonymousClass3T1 r8) {
        C63483Kf A0M = r8.A0M();
        C19970wo r3 = this.A19;
        C20810yC r5 = this.A0G;
        long j = r8.A0I;
        AnonymousClass37F A0X = r8.A0X();
        if (A0X != null) {
            j = A0X.A00;
        }
        if (C19970wo.A00(r3) - j > C36441kJ.A0B(r5, 4736) || A0M == null || A0M.A01.ordinal() >= 3) {
            return false;
        }
        return true;
    }

    public void A1a() {
        super.A1a();
        LinearLayout linearLayout = this.A01;
        if (linearLayout != null) {
            linearLayout.bringToFront();
        }
    }

    public void A2D() {
        super.A2D();
        A0C();
        if (!this.A0G.A0E(7268)) {
            A0B();
        }
    }

    public final LinearLayout A2F() {
        LinearLayout A0U = C36441kJ.A0U(this, R.id.conversation_row_bot_frame);
        if (A0U == null) {
            View A0E = C36361kB.A0E(C36351kA.A0C(this), this, R.layout.f9nameremoved);
            AnonymousClass00C.A0E(A0E, "null cannot be cast to non-null type android.widget.LinearLayout");
            A0U = (LinearLayout) A0E;
            addView(A0U);
        }
        this.A01 = A0U;
        return A0U;
    }

    public final C39981uP getInlineFeedbackViewModel() {
        return this.A05;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int right;
        super.onLayout(z, i, i2, i3, i4);
        LinearLayout linearLayout = this.A01;
        if (linearLayout != null) {
            boolean A1Y = C36351kA.A1Y(this.A0E);
            int height = getHeight();
            int measuredWidth = linearLayout.getMeasuredWidth();
            int measuredHeight = linearLayout.getMeasuredHeight();
            View view = this.A0b;
            if (A1Y) {
                right = view.getLeft();
            } else {
                right = view.getRight() - measuredWidth;
            }
            linearLayout.layout(0, height - measuredHeight, measuredWidth, height);
            View view2 = this.A00;
            if (view2 != null) {
                view2.setPadding(right, 0, 0, 0);
            }
        }
    }
}
