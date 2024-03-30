package X;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageButton;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.emoji.search.EmojiSearchKeyboardContainer;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.expressions.BaseExpressionsBottomSheet;
import com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView;
import com.whatsapp.expressionstray.conversation.ExpressionsKeyboardSearchBottomSheet;

/* renamed from: X.3UT  reason: invalid class name */
public abstract class AnonymousClass3UT {
    public int A00;
    public Context A01;
    public View A02;
    public View A03;
    public ImageButton A04;
    public CoordinatorLayout A05;
    public BottomSheetBehavior A06;
    public C88314Sf A07;
    public KeyboardPopupLayout A08;
    public WaEditText A09;
    public EmojiSearchKeyboardContainer A0A;
    public BaseExpressionsBottomSheet A0B;
    public C87754Qa A0C;
    public AnonymousClass4T7 A0D;
    public ExpressionsBottomSheetView A0E;
    public C39281rd A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public Activity A0L;
    public final C19420v0 A0M;
    public final AnonymousClass1XN A0N;
    public final C125375zo A0O;
    public final EmojiSearchProvider A0P;
    public final AnonymousClass4T8 A0Q = new C54632tG(this, 1);
    public final AnonymousClass1N2 A0R;

    public void A0E(C88314Sf r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A07 = r2;
        ExpressionsBottomSheetView expressionsBottomSheetView = this.A0E;
        if (expressionsBottomSheetView != null) {
            expressionsBottomSheetView.A01 = r2;
        }
    }

    public static final float A00(AnonymousClass3UT r2) {
        ContentResolver contentResolver;
        Activity activity = r2.A0L;
        if (activity != null) {
            contentResolver = activity.getContentResolver();
        } else {
            contentResolver = null;
        }
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }

    public static final int A01(AnonymousClass3UT r3) {
        int i;
        View rootView;
        AnonymousClass09H A082;
        Activity activity = (Activity) C32551do.A00(r3.A01);
        if (activity == null || (A082 = C012005e.A08(C36361kB.A0C(activity))) == null) {
            Rect A062 = AnonymousClass001.A06();
            View view = r3.A03;
            if (view != null) {
                view.getWindowVisibleDisplayFrame(A062);
            }
            View view2 = r3.A03;
            if (view2 == null || (rootView = view2.getRootView()) == null) {
                i = 0;
            } else {
                i = rootView.getHeight();
            }
            return i - A062.bottom;
        }
        AnonymousClass09I r2 = A082.A00;
        return r2.A0C(8).A00 - r2.A0C(2).A00;
    }

    public static final void A02(View view, AnonymousClass3UT r3) {
        CoordinatorLayout coordinatorLayout;
        int height;
        if (view != null && (coordinatorLayout = r3.A05) != null && (height = coordinatorLayout.getHeight()) > 0) {
            A06(r3, Integer.valueOf((int) (((float) height) - view.getY())));
        }
    }

    public static final void A03(AnonymousClass3UT r4) {
        Activity activity = r4.A0L;
        if (activity != null) {
            KeyboardPopupLayout keyboardPopupLayout = r4.A08;
            if (keyboardPopupLayout != null) {
                keyboardPopupLayout.A04 = true;
            }
            C36331k8.A0y(r4.A0E);
            AnonymousClass4T7 r0 = r4.A0D;
            if (r0 != null) {
                r0.BYt();
            }
            ExpressionsBottomSheetView expressionsBottomSheetView = r4.A0E;
            if (expressionsBottomSheetView != null) {
                expressionsBottomSheetView.post(new C81193wc(r4, activity, 38));
            }
        }
    }

    public static final void A04(AnonymousClass3UT r2) {
        int i;
        A02(r2.A0E, r2);
        if (r2 instanceof AnonymousClass2Md) {
            i = 1;
        } else {
            i = 0;
        }
        int A012 = C36431kI.A01(i);
        ExpressionsBottomSheetView expressionsBottomSheetView = r2.A0E;
        if (expressionsBottomSheetView != null) {
            expressionsBottomSheetView.A0E(A012);
        }
        ExpressionsBottomSheetView expressionsBottomSheetView2 = r2.A0E;
        if (expressionsBottomSheetView2 != null) {
            expressionsBottomSheetView2.A0A();
        }
        ExpressionsBottomSheetView expressionsBottomSheetView3 = r2.A0E;
        if (expressionsBottomSheetView3 != null) {
            expressionsBottomSheetView3.A0D();
        }
        KeyboardPopupLayout keyboardPopupLayout = r2.A08;
        if (keyboardPopupLayout != null) {
            keyboardPopupLayout.A04 = false;
        }
    }

    public static final void A05(AnonymousClass3UT r3) {
        ViewGroup.LayoutParams layoutParams;
        Resources resources;
        KeyboardPopupLayout keyboardPopupLayout = r3.A08;
        if (keyboardPopupLayout != null) {
            keyboardPopupLayout.A04 = false;
            keyboardPopupLayout.requestLayout();
        }
        WaEditText waEditText = r3.A09;
        if (waEditText != null) {
            waEditText.requestFocus();
        }
        KeyboardPopupLayout keyboardPopupLayout2 = r3.A08;
        String str = null;
        if (!(keyboardPopupLayout2 == null || (resources = keyboardPopupLayout2.getResources()) == null)) {
            str = resources.getString(R.string.f12nameremoved);
        }
        ImageButton imageButton = r3.A04;
        if (imageButton != null) {
            imageButton.setImageResource(R.drawable.ib_emoji);
        }
        ImageButton imageButton2 = r3.A04;
        if (imageButton2 != null) {
            imageButton2.setContentDescription(str);
        }
        KeyboardPopupLayout keyboardPopupLayout3 = r3.A08;
        if (!(keyboardPopupLayout3 == null || (layoutParams = keyboardPopupLayout3.getLayoutParams()) == null)) {
            layoutParams.height = -1;
        }
        KeyboardPopupLayout keyboardPopupLayout4 = r3.A08;
        if (keyboardPopupLayout4 != null) {
            keyboardPopupLayout4.requestLayout();
        }
    }

    public static final void A06(AnonymousClass3UT r2, Integer num) {
        CoordinatorLayout coordinatorLayout;
        int height;
        ViewGroup.LayoutParams layoutParams;
        if (num != null) {
            BottomSheetBehavior bottomSheetBehavior = r2.A06;
            if (bottomSheetBehavior == null || bottomSheetBehavior.A0J != 5) {
                ExpressionsBottomSheetView expressionsBottomSheetView = r2.A0E;
                if ((expressionsBottomSheetView == null || expressionsBottomSheetView.getVisibility() != 8) && (coordinatorLayout = r2.A05) != null && (height = coordinatorLayout.getHeight()) > 0) {
                    int intValue = height - num.intValue();
                    KeyboardPopupLayout keyboardPopupLayout = r2.A08;
                    if (!(keyboardPopupLayout == null || (layoutParams = keyboardPopupLayout.getLayoutParams()) == null)) {
                        layoutParams.height = intValue;
                    }
                    KeyboardPopupLayout keyboardPopupLayout2 = r2.A08;
                    if (keyboardPopupLayout2 != null) {
                        keyboardPopupLayout2.requestLayout();
                    }
                }
            }
        }
    }

    public static final void A07(AnonymousClass3UT r3, boolean z) {
        ViewTreeObserver viewTreeObserver;
        C36361kB.A14(r3.A0E);
        AnonymousClass4T7 r0 = r3.A0D;
        if (r0 != null) {
            r0.Bga();
        }
        ExpressionsBottomSheetView expressionsBottomSheetView = r3.A0E;
        if (expressionsBottomSheetView != null && (viewTreeObserver = expressionsBottomSheetView.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new C90144Zg(2, r3, z));
        }
    }

    public void A08() {
        BottomSheetBehavior bottomSheetBehavior;
        ExpressionsBottomSheetView expressionsBottomSheetView = this.A0E;
        if (expressionsBottomSheetView != null && expressionsBottomSheetView.getVisibility() != 8 && (bottomSheetBehavior = this.A06) != null && bottomSheetBehavior.A0J != 2) {
            bottomSheetBehavior.A0W(5);
        }
    }

    public final void A09() {
        ExpressionsBottomSheetView expressionsBottomSheetView = this.A0E;
        if (expressionsBottomSheetView != null) {
            expressionsBottomSheetView.A0B();
        }
        BaseExpressionsBottomSheet baseExpressionsBottomSheet = this.A0B;
        if (baseExpressionsBottomSheet != null) {
            ExpressionsKeyboardSearchBottomSheet expressionsKeyboardSearchBottomSheet = (ExpressionsKeyboardSearchBottomSheet) baseExpressionsBottomSheet;
            expressionsKeyboardSearchBottomSheet.A0N = null;
            expressionsKeyboardSearchBottomSheet.A0E = null;
            expressionsKeyboardSearchBottomSheet.A0J = null;
        }
        this.A0B = null;
        EmojiSearchKeyboardContainer emojiSearchKeyboardContainer = this.A0A;
        if (emojiSearchKeyboardContainer != null) {
            emojiSearchKeyboardContainer.setOnTouchListener((View.OnTouchListener) null);
            emojiSearchKeyboardContainer.A0B = null;
        }
        this.A09 = null;
        this.A01 = null;
        this.A0L = null;
        this.A04 = null;
        this.A03 = null;
        this.A0C = null;
        this.A02 = null;
        this.A05 = null;
        this.A08 = null;
        this.A0A = null;
        this.A07 = null;
        this.A0F = null;
        this.A0E = null;
        this.A06 = null;
    }

    public final void A0B() {
        int i;
        ExpressionsBottomSheetView expressionsBottomSheetView = this.A0E;
        if (expressionsBottomSheetView != null) {
            expressionsBottomSheetView.A0C();
        }
        BottomSheetBehavior bottomSheetBehavior = this.A06;
        if (bottomSheetBehavior == null || bottomSheetBehavior.A0J != 3) {
            ExpressionsBottomSheetView expressionsBottomSheetView2 = this.A0E;
            if (expressionsBottomSheetView2 == null || expressionsBottomSheetView2.getVisibility() != 8) {
                KeyboardPopupLayout keyboardPopupLayout = this.A08;
                if (keyboardPopupLayout != null) {
                    keyboardPopupLayout.A04 = true;
                }
                C36331k8.A0y(this.A0E);
                AnonymousClass4T7 r0 = this.A0D;
                if (r0 != null) {
                    r0.BYt();
                }
                ExpressionsBottomSheetView expressionsBottomSheetView3 = this.A0E;
                if (expressionsBottomSheetView3 != null) {
                    expressionsBottomSheetView3.post(C80243v5.A00(this, 2));
                    return;
                }
                return;
            }
            C36421kH.A1D(this.A09);
            return;
        }
        this.A0J = true;
        if (this instanceof AnonymousClass2Md) {
            i = 5;
        } else {
            i = 4;
        }
        bottomSheetBehavior.A0W(i);
    }

    public void A0C(int i) {
        ViewTreeObserver viewTreeObserver;
        boolean z;
        this.A00 = i;
        Context context = this.A01;
        if (context != null) {
            this.A0E = new ExpressionsBottomSheetView(context, (AttributeSet) null, 0, (AnonymousClass11F) null);
            BottomSheetBehavior bottomSheetBehavior = new BottomSheetBehavior();
            int i2 = 1;
            bottomSheetBehavior.A0d(true);
            if (!(this instanceof AnonymousClass2Md)) {
                i2 = 0;
            }
            bottomSheetBehavior.A0W(C36431kI.A01(i2));
            bottomSheetBehavior.A0V(context.getResources().getDimensionPixelOffset(R.dimen.f7nameremoved));
            C02460Ak r1 = new C02460Ak(-1, -1);
            r1.A00(bottomSheetBehavior);
            ExpressionsBottomSheetView expressionsBottomSheetView = this.A0E;
            if (expressionsBottomSheetView != null) {
                expressionsBottomSheetView.setLayoutParams(r1);
            }
            CoordinatorLayout coordinatorLayout = this.A05;
            if (coordinatorLayout != null) {
                coordinatorLayout.addView(this.A0E);
            }
        }
        ExpressionsBottomSheetView expressionsBottomSheetView2 = this.A0E;
        View view = null;
        if (expressionsBottomSheetView2 != null) {
            view = expressionsBottomSheetView2.findViewById(R.id.expressions_view_root);
        }
        this.A02 = view;
        this.A0P.A01((Integer) null);
        ExpressionsBottomSheetView expressionsBottomSheetView3 = this.A0E;
        if (expressionsBottomSheetView3 != null) {
            expressionsBottomSheetView3.setExpressionsSearchListener(this.A0Q);
            expressionsBottomSheetView3.setVisibility(8);
        }
        ExpressionsBottomSheetView expressionsBottomSheetView4 = this.A0E;
        if (expressionsBottomSheetView4 != null) {
            BottomSheetBehavior A022 = BottomSheetBehavior.A02(expressionsBottomSheetView4);
            this.A06 = A022;
            if (A022 != null) {
                A022.A0Z(new C89194Vp(this, 6));
            }
            BottomSheetBehavior bottomSheetBehavior2 = this.A06;
            if (bottomSheetBehavior2 != null) {
                if (this instanceof AnonymousClass2Md) {
                    z = true;
                } else {
                    z = false;
                }
                bottomSheetBehavior2.A0h = z;
            }
            CoordinatorLayout coordinatorLayout2 = this.A05;
            if (coordinatorLayout2 != null && (viewTreeObserver = coordinatorLayout2.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnGlobalLayoutListener(new C90144Zg(3, this, false));
                return;
            }
            return;
        }
        throw C36381kD.A0k();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0062, code lost:
        if (r1 == false) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0F(java.lang.Integer r8, java.lang.Integer r9) {
        /*
            r7 = this;
            com.whatsapp.KeyboardPopupLayout r0 = r7.A08
            r1 = 1
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.A04
            if (r0 != r1) goto L_0x000a
        L_0x0009:
            return
        L_0x000a:
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r7.A0E
            if (r0 == 0) goto L_0x00c0
            int r1 = r0.getVisibility()
            r0 = 8
            if (r1 != r0) goto L_0x00c0
            com.whatsapp.KeyboardPopupLayout r0 = r7.A08
            if (r0 == 0) goto L_0x00a4
            android.content.res.Resources r1 = r0.getResources()
            if (r1 == 0) goto L_0x00a4
            r0 = 2131890648(0x7f1211d8, float:1.9415994E38)
            java.lang.String r2 = r1.getString(r0)
        L_0x0027:
            r1 = 2131231748(0x7f080404, float:1.8079586E38)
            android.widget.ImageButton r0 = r7.A04
            if (r0 == 0) goto L_0x0031
            r0.setImageResource(r1)
        L_0x0031:
            android.widget.ImageButton r0 = r7.A04
            if (r0 == 0) goto L_0x0038
            r0.setContentDescription(r2)
        L_0x0038:
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r1 = r7.A0E
            if (r1 == 0) goto L_0x0059
            boolean r0 = r7 instanceof X.C44152Mc
            if (r0 == 0) goto L_0x009c
            r6 = 4
        L_0x0041:
            r3 = 0
            r2 = r8
            r5 = r9
            r4 = r3
            r1.A0F(r2, r3, r4, r5, r6)
            com.whatsapp.emoji.search.EmojiSearchKeyboardContainer r0 = r7.A0A
            if (r0 == 0) goto L_0x0059
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0059
            com.whatsapp.emoji.search.EmojiSearchKeyboardContainer r0 = r7.A0A
            if (r0 == 0) goto L_0x0059
            r0.A02()
        L_0x0059:
            com.whatsapp.KeyboardPopupLayout r0 = r7.A08
            if (r0 == 0) goto L_0x0064
            boolean r1 = X.AnonymousClass1N2.A00(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0065
        L_0x0064:
            r0 = 0
        L_0x0065:
            r1 = 1
            if (r0 == 0) goto L_0x00bc
            com.whatsapp.KeyboardPopupLayout r0 = r7.A08
            if (r0 == 0) goto L_0x006e
            r0.A04 = r1
        L_0x006e:
            r7.A0G = r1
            r7.A0K = r1
            r7.A0A()
            com.whatsapp.KeyboardPopupLayout r3 = r7.A08
            if (r3 == 0) goto L_0x008a
            r0 = 7
            X.3v5 r2 = X.C80243v5.A00(r7, r0)
            r0 = 50
            float r1 = (float) r0
            float r0 = A00(r7)
            float r1 = r1 * r0
            long r0 = (long) r1
            r3.postDelayed(r2, r0)
        L_0x008a:
            boolean r0 = r7.A0G()
            if (r0 == 0) goto L_0x00a6
            X.1rd r1 = r7.A0F
            if (r1 == 0) goto L_0x0009
            X.4BU r0 = new X.4BU
            r0.<init>(r7)
            r1.A00 = r0
            return
        L_0x009c:
            boolean r0 = r7 instanceof X.AnonymousClass2Mb
            if (r0 == 0) goto L_0x00a2
            r6 = 3
            goto L_0x0041
        L_0x00a2:
            r6 = 7
            goto L_0x0041
        L_0x00a4:
            r2 = 0
            goto L_0x0027
        L_0x00a6:
            com.whatsapp.KeyboardPopupLayout r3 = r7.A08
            if (r3 == 0) goto L_0x0009
            r0 = 3
            X.3v5 r2 = X.C80243v5.A00(r7, r0)
            r0 = 300(0x12c, float:4.2E-43)
            float r1 = (float) r0
            float r0 = A00(r7)
            float r1 = r1 * r0
            long r0 = (long) r1
            r3.postDelayed(r2, r0)
            return
        L_0x00bc:
            A07(r7, r1)
            return
        L_0x00c0:
            r7.A0B()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3UT.A0F(java.lang.Integer, java.lang.Integer):void");
    }

    public boolean A0G() {
        if (!(this instanceof C44152Mc)) {
            return false;
        }
        C20810yC r4 = ((C44152Mc) this).A00;
        if (AnonymousClass099.A0O(C36431kI.A19(r4, 6409), C52302pD.USE_KEYBOARD_LISTENER.value, false) || AnonymousClass099.A0O(C36431kI.A19(r4, 6409), C52302pD.USE_KEYBOARD_LISTENER_DELAYED.value, false)) {
            return true;
        }
        return false;
    }

    public AnonymousClass3UT(C19420v0 r3, AnonymousClass1XN r4, EmojiSearchProvider emojiSearchProvider, C125375zo r6, AnonymousClass1N2 r7) {
        this.A0R = r7;
        this.A0N = r4;
        this.A0P = emojiSearchProvider;
        this.A0M = r3;
        this.A0O = r6;
    }

    public final void A0A() {
        BottomSheetBehavior bottomSheetBehavior;
        SharedPreferences.Editor A002;
        String str;
        Resources resources;
        Configuration configuration;
        int A012 = A01(this);
        if (A012 > 0 && (bottomSheetBehavior = this.A06) != null && bottomSheetBehavior.A0D > A012) {
            Context context = this.A01;
            if (context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null || configuration.orientation != 1) {
                C19420v0 r1 = this.A0M;
                if (r1.A09() != A012) {
                    A002 = C19420v0.A00(r1);
                    str = "expressions_tray_peek_height_landscape";
                }
            } else {
                C19420v0 r12 = this.A0M;
                if (r12.A0A() != A012) {
                    A002 = C19420v0.A00(r12);
                    str = "expressions_tray_peek_height_portrait";
                }
            }
            C36341k9.A0v(A002, str, A012);
            BottomSheetBehavior bottomSheetBehavior2 = this.A06;
            if (bottomSheetBehavior2 != null) {
                bottomSheetBehavior2.A0V(A012);
            }
        }
        WaEditText waEditText = this.A09;
        if (waEditText != null) {
            waEditText.A0B();
        }
    }

    public void A0D(Activity activity, Context context, View view, ImageButton imageButton, CoordinatorLayout coordinatorLayout, KeyboardPopupLayout keyboardPopupLayout, WaEditText waEditText, EmojiSearchKeyboardContainer emojiSearchKeyboardContainer, C39281rd r12, boolean z) {
        C36321k7.A0w(context, view);
        AnonymousClass00C.A0D(coordinatorLayout, 3);
        this.A09 = waEditText;
        this.A01 = context;
        this.A0L = activity;
        this.A04 = imageButton;
        this.A05 = coordinatorLayout;
        this.A08 = keyboardPopupLayout;
        this.A0A = emojiSearchKeyboardContainer;
        this.A03 = view;
        this.A0F = r12;
        if (z) {
            int A002 = AnonymousClass00F.A00(activity, R.color.f6nameremoved);
            C91184bb r1 = new C91184bb(activity, R.drawable.ib_emoji);
            r1.A01(A002, 1.0f);
            r1.A03 = null;
            r1.invalidateSelf();
            if (imageButton != null) {
                imageButton.setBackground(r1);
            }
        }
    }
}
