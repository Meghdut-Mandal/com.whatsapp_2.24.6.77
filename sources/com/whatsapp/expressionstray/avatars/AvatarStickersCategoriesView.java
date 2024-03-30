package com.whatsapp.expressionstray.avatars;

import X.AnonymousClass00C;
import X.AnonymousClass02N;
import X.AnonymousClass06T;
import X.AnonymousClass3Y1;
import X.AnonymousClass5I6;
import X.AnonymousClass5I7;
import X.AnonymousClass5I8;
import X.AnonymousClass5I9;
import X.AnonymousClass5IA;
import X.AnonymousClass5IB;
import X.AnonymousClass5IC;
import X.AnonymousClass5ID;
import X.AnonymousClass5IE;
import X.AnonymousClass5IF;
import X.C05250Oz;
import X.C125415zs;
import X.C158227ga;
import X.C222013h;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36411kG;
import X.C36431kI;
import X.C90474aD;
import X.C90504aG;
import X.C99304t3;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import java.util.Iterator;

public final class AvatarStickersCategoriesView extends FrameLayout {
    public C158227ga A00;
    public C125415zs A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final View A06;
    public final View A07;
    public final View A08;
    public final View A09;
    public final View A0A;
    public final WaImageView A0B;
    public final WaImageView A0C;
    public final WaImageView A0D;
    public final WaImageView A0E;
    public final WaImageView A0F;
    public final WaImageView A0G;
    public final WaImageView A0H;
    public final WaImageView A0I;
    public final WaImageView A0J;
    public final WaImageView A0K;
    public final WaImageView A0L;
    public final WaImageView A0M;
    public final WaImageView A0N;
    public final WaImageView A0O;
    public final WaImageView A0P;
    public final WaImageView A0Q;
    public final WaImageView A0R;
    public final WaImageView A0S;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickersCategoriesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this, true);
        this.A07 = C36361kB.A0G(this, R.id.recent);
        this.A0G = C90474aD.A0P(this, R.id.recent_icon);
        this.A0P = C90474aD.A0P(this, R.id.recent_selector);
        this.A09 = C36361kB.A0G(this, R.id.starred);
        this.A0I = C90474aD.A0P(this, R.id.starred_icon);
        this.A0R = C90474aD.A0P(this, R.id.starred_selector);
        this.A04 = C36361kB.A0G(this, R.id.happy);
        this.A0D = C90474aD.A0P(this, R.id.happy_icon);
        this.A0M = C90474aD.A0P(this, R.id.happy_selector);
        this.A05 = C36361kB.A0G(this, R.id.love);
        this.A0E = C90474aD.A0P(this, R.id.love_icon);
        this.A0N = C90474aD.A0P(this, R.id.love_selector);
        this.A06 = C36361kB.A0G(this, R.id.reaction);
        this.A0F = C90474aD.A0P(this, R.id.reaction_icon);
        this.A0O = C90474aD.A0P(this, R.id.reaction_selector);
        this.A03 = C36361kB.A0G(this, R.id.greeting);
        this.A0C = C90474aD.A0P(this, R.id.greeting_icon);
        this.A0L = C90474aD.A0P(this, R.id.greeting_selector);
        this.A02 = C36361kB.A0G(this, R.id.celebration);
        this.A0B = C90474aD.A0P(this, R.id.celebration_icon);
        this.A0K = C90474aD.A0P(this, R.id.celebration_selector);
        this.A08 = C36361kB.A0G(this, R.id.sad);
        this.A0H = C90474aD.A0P(this, R.id.sad_icon);
        this.A0Q = C90474aD.A0P(this, R.id.sad_selector);
        this.A0A = C36361kB.A0G(this, R.id.together);
        this.A0J = C90474aD.A0P(this, R.id.together_icon);
        this.A0S = C90474aD.A0P(this, R.id.together_selector);
        AnonymousClass3Y1.A00(this.A07, this, 20);
        AnonymousClass3Y1.A00(this.A09, this, 19);
        AnonymousClass3Y1.A00(this.A04, this, 8);
        AnonymousClass3Y1.A00(this.A05, this, 16);
        AnonymousClass3Y1.A00(this.A08, this, 11);
        AnonymousClass3Y1.A00(this.A06, this, 9);
        AnonymousClass3Y1.A00(this.A03, this, 14);
        AnonymousClass3Y1.A00(this.A02, this, 10);
        AnonymousClass3Y1.A00(this.A0A, this, 18);
        if (C222013h.A07) {
            int dimensionPixelSize = C36341k9.A0F(this).getDimensionPixelSize(R.dimen.f7nameremoved);
            Iterator it = AnonymousClass02N.A02(this.A0G, this.A0I, this.A0D, this.A0E, this.A0H, this.A0F, this.A0C, this.A0B, this.A0J).iterator();
            while (it.hasNext()) {
                View A0K2 = C36431kI.A0K(it);
                A0K2.getLayoutParams().width = dimensionPixelSize;
                C36411kG.A1A(A0K2, dimensionPixelSize);
            }
        }
    }

    public static final void setRecentEnabled$lambda$3(AvatarStickersCategoriesView avatarStickersCategoriesView, View view) {
        CoordinatorLayout coordinatorLayout;
        AnonymousClass00C.A0D(avatarStickersCategoriesView, 0);
        C158227ga r0 = avatarStickersCategoriesView.A00;
        if (r0 != null && (coordinatorLayout = ((AvatarExpressionsFragment) r0).A03) != null) {
            C99304t3.A00(coordinatorLayout, R.string.f12nameremoved, 0).A0P();
        }
    }

    public static final void setStarredEnabled$lambda$5(AvatarStickersCategoriesView avatarStickersCategoriesView, View view) {
        CoordinatorLayout coordinatorLayout;
        AnonymousClass00C.A0D(avatarStickersCategoriesView, 0);
        C158227ga r0 = avatarStickersCategoriesView.A00;
        if (r0 != null && (coordinatorLayout = ((AvatarExpressionsFragment) r0).A03) != null) {
            C99304t3.A00(coordinatorLayout, R.string.f12nameremoved, 0).A0P();
        }
    }

    public final void setCategorySelectionListener(C158227ga r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final void setSelectedCategory(C125415zs r5) {
        AnonymousClass00C.A0D(r5, 0);
        C36331k8.A0y(A01(this.A01));
        WaImageView A002 = A00(this.A01);
        if (A002 != null) {
            AnonymousClass06T.A00(C36431kI.A0G(getContext(), R.color.f6nameremoved), A002);
        }
        this.A01 = r5;
        WaImageView A012 = A01(r5);
        if (A012 != null) {
            A012.setVisibility(0);
        }
        WaImageView A003 = A00(r5);
        if (A003 != null) {
            AnonymousClass06T.A00(C36431kI.A0G(getContext(), R.color.f6nameremoved), A003);
        }
    }

    private final WaImageView A00(C125415zs r2) {
        if (AnonymousClass00C.A0J(r2, AnonymousClass5IC.A00)) {
            return this.A0G;
        }
        if (AnonymousClass00C.A0J(r2, AnonymousClass5IE.A00)) {
            return this.A0I;
        }
        if (AnonymousClass00C.A0J(r2, AnonymousClass5I9.A00)) {
            return this.A0D;
        }
        if (AnonymousClass00C.A0J(r2, AnonymousClass5IA.A00)) {
            return this.A0E;
        }
        if (AnonymousClass00C.A0J(r2, AnonymousClass5I6.A00) || AnonymousClass00C.A0J(r2, AnonymousClass5ID.A00)) {
            return this.A0H;
        }
        if (AnonymousClass00C.A0J(r2, AnonymousClass5IB.A00)) {
            return this.A0F;
        }
        if (AnonymousClass00C.A0J(r2, AnonymousClass5I8.A00)) {
            return this.A0C;
        }
        if (AnonymousClass00C.A0J(r2, AnonymousClass5I7.A00)) {
            return this.A0B;
        }
        if (AnonymousClass00C.A0J(r2, AnonymousClass5IF.A00)) {
            return this.A0J;
        }
        return null;
    }

    private final WaImageView A01(C125415zs r2) {
        if (AnonymousClass00C.A0J(r2, AnonymousClass5IC.A00)) {
            return this.A0P;
        }
        if (AnonymousClass00C.A0J(r2, AnonymousClass5IE.A00)) {
            return this.A0R;
        }
        if (AnonymousClass00C.A0J(r2, AnonymousClass5I9.A00)) {
            return this.A0M;
        }
        if (AnonymousClass00C.A0J(r2, AnonymousClass5IA.A00)) {
            return this.A0N;
        }
        if (AnonymousClass00C.A0J(r2, AnonymousClass5I6.A00) || AnonymousClass00C.A0J(r2, AnonymousClass5ID.A00)) {
            return this.A0Q;
        }
        if (AnonymousClass00C.A0J(r2, AnonymousClass5IB.A00)) {
            return this.A0O;
        }
        if (AnonymousClass00C.A0J(r2, AnonymousClass5I8.A00)) {
            return this.A0L;
        }
        if (AnonymousClass00C.A0J(r2, AnonymousClass5I7.A00)) {
            return this.A0K;
        }
        if (AnonymousClass00C.A0J(r2, AnonymousClass5IF.A00)) {
            return this.A0S;
        }
        return null;
    }

    public final void setRecentEnabled(boolean z) {
        AnonymousClass06T.A00(C36431kI.A0G(getContext(), R.color.f6nameremoved), this.A0G);
        View view = this.A07;
        int i = 15;
        if (z) {
            i = 12;
        }
        AnonymousClass3Y1.A00(view, this, i);
    }

    public final void setStarredEnabled(boolean z) {
        AnonymousClass06T.A00(C36431kI.A0G(getContext(), R.color.f6nameremoved), this.A0I);
        View view = this.A09;
        int i = 13;
        if (z) {
            i = 17;
        }
        AnonymousClass3Y1.A00(view, this, i);
    }

    public final void setTogetherVisible(boolean z) {
        this.A0A.setVisibility(C36351kA.A00(z ? 1 : 0));
    }

    public static final void setClickListeners$lambda$10(AvatarStickersCategoriesView avatarStickersCategoriesView, View view) {
        C158227ga A0P2 = C90504aG.A0P(avatarStickersCategoriesView);
        if (A0P2 != null) {
            A0P2.BTE(AnonymousClass5ID.A00);
        }
    }

    public static final void setClickListeners$lambda$11(AvatarStickersCategoriesView avatarStickersCategoriesView, View view) {
        C158227ga A0P2 = C90504aG.A0P(avatarStickersCategoriesView);
        if (A0P2 != null) {
            A0P2.BTE(AnonymousClass5IB.A00);
        }
    }

    public static final void setClickListeners$lambda$12(AvatarStickersCategoriesView avatarStickersCategoriesView, View view) {
        C158227ga A0P2 = C90504aG.A0P(avatarStickersCategoriesView);
        if (A0P2 != null) {
            A0P2.BTE(AnonymousClass5I8.A00);
        }
    }

    public static final void setClickListeners$lambda$13(AvatarStickersCategoriesView avatarStickersCategoriesView, View view) {
        C158227ga A0P2 = C90504aG.A0P(avatarStickersCategoriesView);
        if (A0P2 != null) {
            A0P2.BTE(AnonymousClass5I7.A00);
        }
    }

    public static final void setClickListeners$lambda$14(AvatarStickersCategoriesView avatarStickersCategoriesView, View view) {
        C158227ga A0P2 = C90504aG.A0P(avatarStickersCategoriesView);
        if (A0P2 != null) {
            A0P2.BTE(AnonymousClass5IF.A00);
        }
    }

    public static final void setClickListeners$lambda$6(AvatarStickersCategoriesView avatarStickersCategoriesView, View view) {
        C158227ga A0P2 = C90504aG.A0P(avatarStickersCategoriesView);
        if (A0P2 != null) {
            A0P2.BTE(AnonymousClass5IC.A00);
        }
    }

    public static final void setClickListeners$lambda$7(AvatarStickersCategoriesView avatarStickersCategoriesView, View view) {
        C158227ga A0P2 = C90504aG.A0P(avatarStickersCategoriesView);
        if (A0P2 != null) {
            A0P2.BTE(AnonymousClass5IE.A00);
        }
    }

    public static final void setClickListeners$lambda$8(AvatarStickersCategoriesView avatarStickersCategoriesView, View view) {
        C158227ga A0P2 = C90504aG.A0P(avatarStickersCategoriesView);
        if (A0P2 != null) {
            A0P2.BTE(AnonymousClass5I9.A00);
        }
    }

    public static final void setClickListeners$lambda$9(AvatarStickersCategoriesView avatarStickersCategoriesView, View view) {
        C158227ga A0P2 = C90504aG.A0P(avatarStickersCategoriesView);
        if (A0P2 != null) {
            A0P2.BTE(AnonymousClass5IA.A00);
        }
    }

    public static final void setRecentEnabled$lambda$2(AvatarStickersCategoriesView avatarStickersCategoriesView, View view) {
        C158227ga A0P2 = C90504aG.A0P(avatarStickersCategoriesView);
        if (A0P2 != null) {
            A0P2.BTE(AnonymousClass5IC.A00);
        }
    }

    public static final void setStarredEnabled$lambda$4(AvatarStickersCategoriesView avatarStickersCategoriesView, View view) {
        C158227ga A0P2 = C90504aG.A0P(avatarStickersCategoriesView);
        if (A0P2 != null) {
            A0P2.BTE(AnonymousClass5IE.A00);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AvatarStickersCategoriesView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AnonymousClass00C.A0D(context, 1);
    }

    public /* synthetic */ AvatarStickersCategoriesView(Context context, AttributeSet attributeSet, int i, int i2, C05250Oz r7) {
        this(context, C36381kD.A0I(attributeSet, i2), C36391kE.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AvatarStickersCategoriesView(Context context) {
        this(context, (AttributeSet) null, 0);
        AnonymousClass00C.A0D(context, 1);
    }
}
