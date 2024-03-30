package X;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.emoji.search.EmojiSearchKeyboardContainer;
import com.whatsapp.expressions.mediacomposer.ShapeStickerLayoutDataProvider$setShapeStickerLayoutDataSync$1;
import com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView;
import com.whatsapp.mediacomposer.MediaComposerFragment;
import com.whatsapp.mediacomposer.doodle.ColorPickerComponent;
import com.whatsapp.mediacomposer.doodle.ColorPickerView;
import com.whatsapp.mediacomposer.doodle.DoodleView;
import com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerView;
import com.whatsapp.mediacomposer.doodle.textentry.TextEntryView;
import com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView;
import java.util.Objects;

/* renamed from: X.6wC  reason: invalid class name and case insensitive filesystem */
public class C146806wC implements C158457gx {
    public int A00 = 0;
    public int A01 = 2;
    public int A02 = 0;
    public C38841qJ A03;
    public C90694aZ A04;
    public C36551kU A05;
    public boolean A06;
    public boolean A07 = false;
    public final Rect A08 = AnonymousClass001.A06();
    public final Handler A09;
    public final View A0A;
    public final AnonymousClass01I A0B;
    public final AnonymousClass012 A0C;
    public final AnonymousClass016 A0D;
    public final C19420v0 A0E;
    public final C18820ts A0F;
    public final AnonymousClass3UT A0G;
    public final C20810yC A0H;
    public final AnonymousClass6FL A0I;
    public final MediaComposerFragment A0J;
    public final ColorPickerComponent A0K;
    public final C117425mF A0L;
    public final AnonymousClass6V4 A0M;
    public final DoodleView A0N;
    public final AnonymousClass6OT A0O;
    public final C1265564m A0P;
    public final AnonymousClass6LZ A0Q;
    public final AnonymousClass622 A0R;
    public final C135326cW A0S;
    public final AnonymousClass6FV A0T;
    public final AnonymousClass6L5 A0U;
    public final C129126Fh A0V;
    public final AnonymousClass6SM A0W;
    public final C28331Sf A0X;
    public final C18910u1 A0Y;
    public final AnonymousClass005 A0Z;
    public final C21060yb A0a;
    public final C121575tM A0b;
    public final C158457gx A0c;
    public final AnonymousClass1N2 A0d;
    public final C1270866x A0e;
    public final boolean A0f;

    public static void A05(C146806wC r14, AnonymousClass5Cl r15) {
        String str;
        float f;
        int color;
        int i;
        int i2;
        int i3;
        int i4;
        C146806wC r12 = r14;
        A01(r14);
        r14.A0I.A03();
        r14.A0P.A02 = false;
        C129126Fh r1 = r14.A0V;
        TitleBarView titleBarView = r1.A0I;
        C91184bb r0 = titleBarView.A0N;
        if (r0 == null) {
            throw C36331k8.A0d("shapeToolDrawable");
        }
        r0.A00(0);
        C91184bb r02 = titleBarView.A0M;
        if (r02 == null) {
            throw C36331k8.A0d("penToolDrawable");
        }
        r02.A00(0);
        r14.A0K.A04(false);
        AnonymousClass1N2 r2 = r14.A0d;
        DoodleView doodleView = r14.A0N;
        r2.A02(doodleView);
        titleBarView.getPaddingLeft();
        titleBarView.getPaddingTop();
        titleBarView.getPaddingRight();
        titleBarView.getPaddingBottom();
        TextEntryView textEntryView = (TextEntryView) C36381kD.A0K(C36351kA.A0C(r14.A0A), R.layout.f9nameremoved).findViewById(R.id.main);
        AnonymousClass5Cl r22 = r15;
        if (r15 == null) {
            str = "";
            f = 0.0f;
            color = -16777216;
            i = r12.A02;
            i2 = r12.A00;
            i3 = r12.A01;
        } else {
            str = r15.A0A;
            f = r15.A05;
            color = r15.A01.getColor();
            i = r15.A06;
            i2 = r15.A08;
            i3 = r15.A0E.A02;
        }
        AnonymousClass3A1 r5 = new AnonymousClass3A1(str, f, color, i, i2, i3);
        r12.A02 = r5.A01;
        r12.A00 = r5.A03;
        r12.A01 = r5.A05.A02;
        AnonymousClass01I r10 = r12.A0B;
        C21060yb r11 = r12.A0a;
        if (!r12.A06) {
            i4 = r1.A04.top;
        } else {
            i4 = 0;
        }
        r12.A05 = new C36551kU(r10, r11, r12, r5, textEntryView, i4);
        if (r22 != null) {
            r12.A0T.A04(r22);
            doodleView.invalidate();
        }
        r12.A05.setOnShowListener(new AnonymousClass5YM(r12, 3));
        r12.A05.show();
        r1.A0B = true;
        r12.A05.setOnDismissListener(new AnonymousClass6ZB(r12, r22, r5));
    }

    public static void A00(C117425mF r2, ColorPickerView colorPickerView, C146806wC r4) {
        if (r4.A0H.A0E(5976)) {
            A04(r4, colorPickerView.A00, r2.A00);
        }
    }

    public static void A01(C146806wC r4) {
        C129126Fh r3 = r4.A0V;
        if (C36341k9.A07(r3.A0G.A06) != 0) {
            TitleBarView.A00(r3.A0I);
        }
        if (A06(r4)) {
            AnonymousClass6XN r2 = (AnonymousClass6XN) r4.A0Y.get();
            ShapePickerView shapePickerView = r2.A0Q;
            shapePickerView.setVisibility(8);
            r2.A0W.A01(shapePickerView);
            if (shapePickerView.A02()) {
                shapePickerView.invalidate();
            }
            if (r2.A04) {
                r2.A0E.A1d();
            }
            TitleBarView titleBarView = r3.A0I;
            titleBarView.setToolbarExtraVisibility(8);
            titleBarView.setUndoButtonVisibility(C90514aH.A0A(C36401kF.A1a(r4.A0T.A03.A00) ? 1 : 0));
            r4.A0I.A02();
            A03(r4);
        }
    }

    public static void A03(C146806wC r4) {
        C129126Fh r2 = r4.A0V;
        C001700s r1 = r2.A0G.A06;
        if (C36341k9.A07(r1) != 0) {
            TitleBarView.A00(r2.A0I);
        }
        int i = 0;
        if (C36341k9.A07(r1) == 2) {
            C129196Ft r12 = r4.A0T.A01;
            if (r12 == null || (!r12.A0O() && !r12.A0N())) {
                r4.A0K.A04(true);
                r4.A0I.A00();
                r2.A07(0);
                r4.A08();
            } else {
                r4.A0K.A02();
            }
        }
        if (A06(r4)) {
            ColorPickerComponent colorPickerComponent = r4.A0K;
            colorPickerComponent.A03.clearAnimation();
            colorPickerComponent.A04(false);
        } else {
            if (!C36401kF.A1a(r4.A0T.A03.A00)) {
                i = 4;
            }
            r2.A0I.setUndoButtonVisibility(i);
        }
        boolean A1X = C36401kF.A1X(r4.A0F);
        TitleBarView titleBarView = r2.A0I;
        RelativeLayout toolbarExtra = titleBarView.getToolbarExtra();
        View startingViewFromToolbarExtra = titleBarView.getStartingViewFromToolbarExtra();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) toolbarExtra.getLayoutParams();
        layoutParams.addRule(A1X ^ true ? 1 : 0, startingViewFromToolbarExtra.getId());
        toolbarExtra.setLayoutParams(layoutParams);
    }

    public static void A04(C146806wC r5, float f, int i) {
        C134626bL r4 = new C134626bL(i, f);
        C121575tM r3 = r5.A0b;
        C36331k8.A1T(new ShapeStickerLayoutDataProvider$setShapeStickerLayoutDataSync$1(r4, r3, (C023509x) null), r3.A01);
    }

    public static boolean A06(C146806wC r1) {
        C18910u1 r12 = r1.A0Y;
        if (!r12.A01() || ((AnonymousClass6XN) r12.get()).A0Q.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public void A07() {
        ValueAnimator valueAnimator;
        ValueAnimator.AnimatorUpdateListener r0;
        DoodleView doodleView = this.A0N;
        if (doodleView.A04()) {
            C1265564m r7 = this.A0P;
            r7.A02 = true;
            AnonymousClass6FL r4 = this.A0I;
            r4.A03();
            A01(this);
            this.A0T.A01 = null;
            this.A0K.A04(false);
            r4.A01();
            int[] A1O = C36441kJ.A1O();
            C129126Fh r9 = this.A0V;
            Rect rect = r9.A04;
            int i = rect.top;
            if (i != -1) {
                A1O[1] = i;
                A1O[0] = rect.left;
            } else if (doodleView.getScaleX() == 1.0f && doodleView.getScaleY() == 1.0f) {
                doodleView.getLocationOnScreen(A1O);
            }
            AnonymousClass01I r42 = this.A0B;
            C117425mF r5 = this.A0L;
            AnonymousClass622 r8 = this.A0R;
            Objects.requireNonNull(doodleView);
            C90694aZ r3 = new C90694aZ(r42, r5, new C117435mG(doodleView), r7, r8, r9, this.A0e, A1O, this.A0f);
            this.A04 = r3;
            r3.setOnDismissListener(new C163977r4(this, 7));
            int i2 = r5.A00;
            int A072 = C36341k9.A07(r9.A0G.A06);
            if (A072 != 1) {
                if (A072 == 3) {
                    valueAnimator = r9.A0E;
                    r0 = new C111575cV(r9, i2, 1);
                }
                C162337oQ.A00(r9.A0E, r9, 24);
                AnimatorSet A002 = r9.A00(true);
                r9.A03 = A002;
                C162337oQ.A00(A002, r9, 25);
                r9.A03.start();
                r9.A07 = true;
                this.A04.setOnShowListener(new AnonymousClass5YM(this, 2));
            }
            valueAnimator = r9.A0E;
            r0 = new C111915d3(r9, 0.0f, i2, 0);
            valueAnimator.addUpdateListener(r0);
            C162337oQ.A00(r9.A0E, r9, 24);
            AnimatorSet A0022 = r9.A00(true);
            r9.A03 = A0022;
            C162337oQ.A00(A0022, r9, 25);
            r9.A03.start();
            r9.A07 = true;
            this.A04.setOnShowListener(new AnonymousClass5YM(this, 2));
        }
    }

    public void A08() {
        if (this.A0N.A04()) {
            A03(this);
            C129126Fh r5 = this.A0V;
            r5.A04();
            r5.A07(0);
            AnonymousClass6FL r3 = this.A0I;
            r3.A02();
            AnonymousClass6FV r2 = this.A0T;
            r5.A0I.setUndoButtonVisibility(C90514aH.A0A(C36401kF.A1a(r2.A03.A00) ? 1 : 0));
            r3.A03();
            A01(this);
            this.A0P.A02 = false;
            ColorPickerComponent colorPickerComponent = this.A0K;
            colorPickerComponent.A04(true);
            r3.A00();
            ColorPickerView colorPickerView = colorPickerComponent.A03;
            ColorPickerView.A01(colorPickerView);
            colorPickerView.invalidate();
            r2.A01 = null;
        }
    }

    public /* synthetic */ void A09() {
        C90694aZ r2 = this.A04;
        if (r2 != null) {
            boolean A012 = C19550w8.A01();
            View rootView = r2.findViewById(16908290).getRootView();
            if (A012) {
                rootView.setForeground((Drawable) null);
            } else {
                C36341k9.A0q(this.A0A.getContext(), rootView, R.color.f6nameremoved);
            }
        }
        AnonymousClass6FL r6 = this.A0I;
        r6.A03();
        this.A0P.A02 = false;
        ColorPickerComponent colorPickerComponent = this.A0K;
        ColorPickerView colorPickerView = colorPickerComponent.A03;
        ColorPickerView.A01(colorPickerView);
        colorPickerView.invalidate();
        this.A0T.A01 = null;
        DoodleView doodleView = this.A0N;
        C117425mF r22 = this.A0L;
        doodleView.A03 = r22.A00;
        doodleView.invalidate();
        colorPickerComponent.setColorAndInvalidate(r22.A00);
        C129126Fh r1 = this.A0V;
        r1.A07(0);
        r1.A02 = r22.A00;
        r6.A02();
        A03(this);
        r1.A04();
        A00(r22, colorPickerView, this);
    }

    public /* synthetic */ void A0A() {
        this.A0V.A02();
        C90694aZ r2 = this.A04;
        if (r2 != null) {
            boolean A012 = C19550w8.A01();
            View rootView = r2.findViewById(16908290).getRootView();
            if (A012) {
                rootView.setForeground(AnonymousClass00E.A00(this.A0A.getContext(), R.drawable.doodle_top_bar_background_with_height));
            } else {
                rootView.setBackgroundResource(R.drawable.doodle_top_bar_background);
            }
        }
    }

    public void A0B(RectF rectF) {
        AnonymousClass6OT r2 = this.A0O;
        r2.A08 = rectF;
        AnonymousClass6OT.A01(r2);
        DoodleView doodleView = this.A0N;
        r2.A09 = C36361kB.A0B(doodleView);
        AnonymousClass6V4 r0 = this.A0M;
        r0.A04();
        doodleView.requestLayout();
        r0.A03();
    }

    public void A0C(C129196Ft r4) {
        this.A0N.A03(r4);
        if (!A06(this)) {
            boolean A0N2 = r4.A0N();
            C129126Fh r1 = this.A0V;
            int i = 0;
            if (A0N2) {
                i = 2;
            }
            r1.A07(i);
            r1.A02 = this.A0L.A00;
        }
    }

    public void BgS(C129196Ft r2) {
        if (r2 instanceof AnonymousClass5Co) {
            this.A0c.BgS(r2);
        } else {
            A0C(r2);
        }
    }

    public static void A02(C146806wC r4) {
        if (A06(r4)) {
            AnonymousClass6XN r3 = (AnonymousClass6XN) r4.A0Y.get();
            boolean z = r4.A06;
            r3.A0T.A02(z);
            r3.A0S.A02(z);
            C36341k9.A18(r3.A0X, z);
            r3.A0P.A16(z, AnonymousClass000.A1Q(r3.A03.A05.getVisibility()));
        }
    }

    public boolean A0D(float f, float f2) {
        if (A06(this)) {
            return true;
        }
        DoodleView doodleView = this.A0N;
        if (doodleView.A0F.A08 == null) {
            return false;
        }
        if (doodleView.A07.A02) {
            return true;
        }
        AnonymousClass6FV r1 = doodleView.A0H;
        if (r1.A02 == null && r1.A00(doodleView.A0G.A00(f, f2)) == null) {
            return false;
        }
        return true;
    }

    public C146806wC(GestureDetector.OnGestureListener onGestureListener, View view, AnonymousClass01I r38, AnonymousClass012 r39, AnonymousClass016 r40, C21060yb r41, C19420v0 r42, C18820ts r43, AnonymousClass1H2 r44, C121575tM r45, AnonymousClass3UT r46, C20810yC r47, AnonymousClass6FL r48, MediaComposerFragment mediaComposerFragment, C117425mF r50, C104655Aq r51, AnonymousClass6vC r52, C158457gx r53, C104635An r54, C129126Fh r55, C28331Sf r56, AnonymousClass1HA r57, AnonymousClass1BB r58, AnonymousClass1AP r59, AnonymousClass1N2 r60, C1270866x r61, C19770wU r62, AnonymousClass005 r63, boolean z) {
        Handler A0H2 = C36341k9.A0H();
        this.A09 = A0H2;
        this.A03 = null;
        C20810yC r31 = r47;
        this.A0H = r31;
        AnonymousClass01I r10 = r38;
        this.A0B = r10;
        AnonymousClass1N2 r23 = r60;
        this.A0d = r23;
        C18820ts r32 = r43;
        this.A0F = r32;
        AnonymousClass3UT r9 = r46;
        this.A0G = r9;
        this.A0A = view;
        AnonymousClass012 r34 = r39;
        this.A0C = r34;
        AnonymousClass016 r33 = r40;
        this.A0D = r33;
        C19420v0 r1 = r42;
        this.A0E = r1;
        AnonymousClass6FL r13 = r48;
        this.A0I = r13;
        this.A0c = r53;
        C129126Fh r7 = r55;
        this.A0V = r7;
        this.A0f = z;
        MediaComposerFragment mediaComposerFragment2 = mediaComposerFragment;
        this.A0J = mediaComposerFragment2;
        C117425mF r8 = r50;
        this.A0L = r8;
        AnonymousClass005 r29 = r63;
        this.A0Z = r29;
        this.A0e = r61;
        this.A0b = r45;
        C21060yb r14 = r41;
        this.A0a = r14;
        this.A02 = C36341k9.A0E(r1).getInt("text_tool_media_composer_font", 0);
        this.A0X = r56;
        C36351kA.A1A(this.A0A, R.id.doodle_decoration, 0);
        Resources resources = r10.getResources();
        C129196Ft.A03 = resources.getDimension(R.dimen.f7nameremoved);
        resources.getDimension(r31.A0E(2591) ? R.dimen.f7nameremoved : R.dimen.f7nameremoved);
        resources.getDimension(R.dimen.f7nameremoved);
        C129196Ft.A04 = resources.getDimension(R.dimen.f7nameremoved);
        C129196Ft.A06 = resources.getDimension(R.dimen.f7nameremoved);
        C129196Ft.A05 = resources.getDimension(R.dimen.f7nameremoved);
        DoodleView doodleView = (DoodleView) C012005e.A02(this.A0A, R.id.doodle_view);
        this.A0N = doodleView;
        AnonymousClass6OT r4 = doodleView.A0F;
        this.A0O = r4;
        AnonymousClass6FV r3 = doodleView.A0H;
        this.A0T = r3;
        AnonymousClass6V4 r12 = doodleView.A0E;
        this.A0M = r12;
        AnonymousClass6L5 r15 = new AnonymousClass6L5(new C117455mI(this));
        this.A0U = r15;
        C1265564m r16 = new C1265564m(r12, doodleView.A0G, r3, r15, C36361kB.A0B(doodleView).density);
        this.A0P = r16;
        this.A0R = new AnonymousClass622(r12, r3);
        View A022 = C012005e.A02(this.A0A, R.id.trash);
        ViewGroup A0O2 = C36411kG.A0O(this.A0A, R.id.media_guidelines);
        AnonymousClass6SM r152 = new AnonymousClass6SM(A0H2, A022, r14, r32, new C91094bS());
        this.A0W = r152;
        AnonymousClass6LZ r17 = new AnonymousClass6LZ(new C117445mH(this), r4, new AnonymousClass6NQ(A0H2, A0O2, r14), r152);
        this.A0Q = r17;
        ColorPickerComponent colorPickerComponent = (ColorPickerComponent) C012005e.A02(this.A0A, R.id.color_picker_component);
        this.A0K = colorPickerComponent;
        colorPickerComponent.A03(r13, new C146676vz(r8, this, r7), doodleView);
        C146706w2 r122 = new C146706w2(this, new AnonymousClass736(this, r7, r13, 3));
        C135326cW r132 = new C135326cW(onGestureListener, r122, doodleView, r17, new C117465mJ(), r3);
        this.A0S = r132;
        doodleView.setControllers(r132, r16);
        doodleView.setDoodleViewListener(r122);
        AnonymousClass1HA r24 = r57;
        C104635An r22 = r54;
        AnonymousClass6vC r21 = r52;
        AnonymousClass1N2 r27 = r23;
        AnonymousClass01I r123 = r10;
        AnonymousClass012 r133 = r34;
        AnonymousClass016 r142 = r33;
        C18820ts r153 = r32;
        C20810yC r172 = r31;
        MediaComposerFragment mediaComposerFragment3 = mediaComposerFragment2;
        C129126Fh r232 = r7;
        this.A0Y = new C18910u1((Object) null, new AnonymousClass77Z(r123, r133, r142, r153, r44, r172, mediaComposerFragment3, this, r51, r21, r22, r232, r24, r58, r59, r27, r62));
        this.A06 = false;
        if (this.A0H.A0E(5976)) {
            r9.A0D(r10, r10, r10.findViewById(R.id.media_composer_layout), (ImageButton) null, (CoordinatorLayout) r10.findViewById(R.id.expression_sheet_coordinator_layout), (KeyboardPopupLayout) null, (WaEditText) null, (EmojiSearchKeyboardContainer) null, (C39281rd) null, false);
            A04(this, colorPickerComponent.A03.A00, r8.A00);
            TitleBarView titleBarView = this.A0V.A0I;
            r9.A0C(C36431kI.A04(titleBarView, (int) titleBarView.getY()) + AnonymousClass000.A0a(titleBarView).topMargin);
            r9.A0C = new C145296tf(this);
            C109125Wj r0 = new C109125Wj(this, 0);
            ExpressionsBottomSheetView expressionsBottomSheetView = r9.A0E;
            if (expressionsBottomSheetView != null) {
                expressionsBottomSheetView.A0I = r0;
            }
            C165047sn r02 = new C165047sn(this, r9, 0);
            if (expressionsBottomSheetView != null) {
                expressionsBottomSheetView.A0N = r02;
            }
            r9.A0E(new C142386on(r10, r9, this, r29));
            r9.A0D = new C145306tg(this, r7);
        }
    }
}
