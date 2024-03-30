package X;

import android.animation.Animator;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.whatsapp.BoundedLinearLayout;
import com.whatsapp.R;
import com.whatsapp.community.ConversationCommunityViewModel;
import com.whatsapp.components.CircularRevealView;
import com.whatsapp.conversation.ConversationAttachmentContentView;
import java.lang.ref.WeakReference;

/* renamed from: X.1qO  reason: invalid class name and case insensitive filesystem */
public class C38891qO extends PopupWindow {
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final View A04;
    public final ViewTreeObserver.OnGlobalLayoutListener A05 = new C90104Zc(this, 13);
    public final FrameLayout A06;
    public final CircularRevealView A07;
    public final ConversationAttachmentContentView A08;
    public final WeakReference A09;
    public final int A0A;
    public final FrameLayout.LayoutParams A0B;
    public final BoundedLinearLayout A0C;
    public final AnonymousClass17Y A0D;
    public final AnonymousClass1N2 A0E;
    public final boolean A0F;

    public static void A04(C38891qO r5) {
        int[] iArr = new int[2];
        r5.A04.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        CircularRevealView circularRevealView = r5.A07;
        circularRevealView.getLocationOnScreen(iArr2);
        int i = 0;
        int i2 = (iArr[0] + r5.A00) - iArr2[0];
        if (r5.A02) {
            i = r5.A06.getMeasuredHeight();
        }
        circularRevealView.A00 = i2;
        circularRevealView.A01 = i;
    }

    public static int A00(Activity activity, C38891qO r5) {
        r5.A06.measure(0, 0);
        View view = r5.A04;
        view.measure(0, 0);
        if (!AnonymousClass1N2.A00(view) || (Build.VERSION.SDK_INT >= 24 && activity.isInMultiWindowMode())) {
            return -(view.getMeasuredHeight() + r5.A08.A07(view));
        }
        return 0;
    }

    public static void A01(Activity activity, C38891qO r17, int i, int i2, boolean z) {
        int i3;
        int i4;
        ConversationAttachmentContentView conversationAttachmentContentView;
        CircularRevealView circularRevealView;
        FrameLayout.LayoutParams layoutParams;
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        AnonymousClass02E A0N;
        View view;
        boolean z2 = z;
        C38891qO r12 = r17;
        r12.A02 = z2;
        Activity activity2 = activity;
        Display defaultDisplay = activity2.getWindowManager().getDefaultDisplay();
        Point A022 = C65103Qt.A02(activity2.getWindowManager());
        if (!(activity2 instanceof AnonymousClass01L) || (A0N = ((AnonymousClass01I) activity2).getSupportFragmentManager().A0N("com.whatsapp.HomeActivity.ConversationFragment")) == null || !A0N.A15() || (view = A0N.A0F) == null) {
            i3 = -1;
        } else {
            i3 = view.getWidth();
        }
        int[] A1O = C36441kJ.A1O();
        View view2 = r12.A04;
        view2.getLocationOnScreen(A1O);
        int A042 = C36431kI.A04(view2, A1O[1]);
        r12.A01 = A1O[0];
        if (Build.VERSION.SDK_INT < 28 || (rootWindowInsets = view2.getRootWindowInsets()) == null || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) {
            i4 = 0;
        } else {
            i4 = displayCutout.getSafeInsetTop();
        }
        BoundedLinearLayout boundedLinearLayout = r12.A0C;
        int i5 = i2;
        if (!z) {
            boundedLinearLayout.A00 = Integer.MAX_VALUE;
            boundedLinearLayout.A01 = Integer.MAX_VALUE;
            circularRevealView = r12.A07;
            circularRevealView.setPadding(circularRevealView.getPaddingLeft(), circularRevealView.getPaddingTop(), circularRevealView.getPaddingRight(), 0);
            conversationAttachmentContentView = r12.A08;
            conversationAttachmentContentView.A05 = 0;
            layoutParams = r12.A0B;
            layoutParams.height = -1;
            int i6 = A042 + i2;
            boundedLinearLayout.getLayoutParams().height = (A022.y + i4) - i6;
            r12.showAtLocation(view2, 8388661, 0, i6);
        } else {
            conversationAttachmentContentView = r12.A08;
            boundedLinearLayout.A00 = conversationAttachmentContentView.A07(view2);
            boundedLinearLayout.A01 = conversationAttachmentContentView.A06(view2);
            circularRevealView = r12.A07;
            circularRevealView.setPadding(circularRevealView.getPaddingLeft(), circularRevealView.getPaddingTop(), circularRevealView.getPaddingRight(), r12.A0A);
            boundedLinearLayout.getLayoutParams().height = -2;
            layoutParams = r12.A0B;
            layoutParams.height = -2;
            conversationAttachmentContentView.A05 = conversationAttachmentContentView.getResources().getDimensionPixelOffset(R.dimen.f7nameremoved);
            r12.showAsDropDown(view2, 0, i5, 8388661);
        }
        circularRevealView.forceLayout();
        int i7 = i;
        circularRevealView.A02 = i7;
        if (z) {
            boundedLinearLayout.measure(0, 0);
            int measuredWidth = boundedLinearLayout.getMeasuredWidth();
            int A062 = (int) (((float) A022.x) - ((((float) C36441kJ.A06(activity2.getResources(), R.dimen.f7nameremoved, C36441kJ.A06(activity2.getResources(), R.dimen.f7nameremoved, activity2.getResources().getDimensionPixelSize(R.dimen.f7nameremoved)))) + activity2.getResources().getDimension(R.dimen.f7nameremoved)) * 2.0f));
            if ((defaultDisplay.getRotation() == 1 || defaultDisplay.getRotation() == 3) && A062 > measuredWidth) {
                layoutParams.width = A062;
                layoutParams.rightMargin = 0;
                layoutParams.leftMargin = 0;
            } else {
                layoutParams.width = -1;
                int dimensionPixelSize = activity2.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
                layoutParams.rightMargin = dimensionPixelSize;
                layoutParams.leftMargin = dimensionPixelSize;
            }
            C36371kC.A13(activity2, boundedLinearLayout, R.drawable.ib_attach_panel);
        } else {
            layoutParams.width = -1;
            boolean z3 = r12.A0F;
            int i8 = R.attr.f4nameremoved;
            int i9 = R.color.f6nameremoved;
            if (z3) {
                i8 = R.attr.f4nameremoved;
                i9 = R.color.f6nameremoved;
            }
            C36341k9.A0q(activity2, circularRevealView, C224514j.A00(activity2, i8, i9));
            AnonymousClass00F.A00(activity2, C224514j.A00(activity2, R.attr.f4nameremoved, R.color.f6nameremoved));
        }
        if (i3 != -1) {
            layoutParams.width = i3;
            layoutParams.gravity = 8388613;
        }
        circularRevealView.setVisibility(0);
        C90104Zc.A00(circularRevealView.getViewTreeObserver(), r12, 14);
        if (i > 0) {
            conversationAttachmentContentView.A0B(i7, z2);
        }
    }

    public static void A02(C38891qO r2) {
        r2.A07.setVisibility(8);
        super.dismiss();
    }

    public static void A03(C38891qO r2) {
        if (r2.A03) {
            r2.A03 = false;
            r2.A06.getViewTreeObserver().removeOnGlobalLayoutListener(r2.A05);
        }
    }

    public C38891qO(Activity activity, View view, AnonymousClass17Y r11, ConversationCommunityViewModel conversationCommunityViewModel, AnonymousClass28e r13, C21060yb r14, C20810yC r15, AnonymousClass11F r16, AnonymousClass1N2 r17, boolean z) {
        super(activity);
        this.A0D = r11;
        this.A0E = r17;
        this.A04 = view;
        this.A09 = AnonymousClass001.A0F(activity);
        this.A0F = C36391kE.A1Y(r15);
        C38141nm r7 = new C38141nm(activity, activity, this);
        this.A06 = r7;
        r7.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        activity.getLayoutInflater().inflate(R.layout.f9nameremoved, r7, true);
        CircularRevealView circularRevealView = (CircularRevealView) C012005e.A02(r7, R.id.paper_clip_layout);
        this.A07 = circularRevealView;
        this.A0C = (BoundedLinearLayout) C012005e.A02(r7, R.id.content);
        this.A0B = (FrameLayout.LayoutParams) circularRevealView.getLayoutParams();
        this.A0A = circularRevealView.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        circularRevealView.setVisibility(0);
        setContentView(r7);
        setBackgroundDrawable(new BitmapDrawable());
        setWidth(-1);
        setHeight(-2);
        setAnimationStyle(0);
        setTouchable(true);
        setFocusable(true);
        setOutsideTouchable(true);
        setInputMethodMode(2);
        setTouchInterceptor(new C53812rv(activity, this, r14, 0));
        ConversationAttachmentContentView conversationAttachmentContentView = (ConversationAttachmentContentView) C012005e.A02(circularRevealView, R.id.conversation_content_view);
        this.A08 = conversationAttachmentContentView;
        conversationAttachmentContentView.A0C(conversationCommunityViewModel, r13, r16, z);
    }

    public /* synthetic */ void A05() {
        super.dismiss();
    }

    public void A06(Activity activity) {
        boolean z;
        Resources resources = activity.getResources();
        int[] iArr = new int[2];
        View view = this.A04;
        view.getLocationOnScreen(iArr);
        if (C65103Qt.A02(C21060yb.A01(this.A06.getContext())).y - C36431kI.A04(view, iArr[1]) < activity.getResources().getDimensionPixelSize(R.dimen.f7nameremoved) || (Build.VERSION.SDK_INT >= 24 && activity.isInMultiWindowMode())) {
            z = true;
        } else {
            z = false;
        }
        this.A00 = view.getWidth() / 2;
        if (z) {
            A01(activity, this, 300, A00(activity, this), true);
        } else {
            A01(activity, this, 300, resources.getDimensionPixelSize(R.dimen.f7nameremoved), false);
        }
    }

    public void dismiss() {
        if (isShowing()) {
            this.A08.A09();
            A04(this);
            int[] A1O = C36441kJ.A1O();
            this.A04.getLocationOnScreen(A1O);
            boolean z = this.A02;
            float f = (float) (this.A00 + A1O[0]);
            float f2 = 0.0f;
            if (z) {
                f2 = 1.0f;
            }
            C36361kB.A0K(new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 0, f, 1, f2), 1.0f, 1.0f - 1.0f).setDuration(300);
            CircularRevealView circularRevealView = this.A07;
            circularRevealView.A02 = 300;
            if (!circularRevealView.A09) {
                int max = Math.max(circularRevealView.getWidth(), circularRevealView.getHeight());
                if (circularRevealView.isAttachedToWindow()) {
                    Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(circularRevealView, circularRevealView.A00, circularRevealView.A01, (float) max, 0.0f);
                    createCircularReveal.setDuration((long) circularRevealView.A02);
                    AnonymousClass4VL.A00(createCircularReveal, circularRevealView, 3);
                    createCircularReveal.addListener(circularRevealView.A03);
                    createCircularReveal.start();
                } else {
                    circularRevealView.setVisibility(8);
                }
            }
        }
        A03(this);
        this.A0D.A0I(C80223v3.A00(this, 11), 300);
    }
}
