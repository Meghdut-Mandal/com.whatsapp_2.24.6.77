package com.whatsapp.expressionstray.emoji;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass01I;
import X.AnonymousClass040;
import X.AnonymousClass1H2;
import X.AnonymousClass1JI;
import X.AnonymousClass5TR;
import X.AnonymousClass6CK;
import X.AnonymousClass6O1;
import X.AnonymousClass7LW;
import X.AnonymousClass7LX;
import X.AnonymousClass7LY;
import X.AnonymousClass7Y6;
import X.AnonymousClass7Y7;
import X.C000800j;
import X.C001400p;
import X.C007403e;
import X.C011304x;
import X.C012005e;
import X.C019308f;
import X.C023509x;
import X.C02800By;
import X.C07570Yj;
import X.C12560iI;
import X.C1270066o;
import X.C154437Se;
import X.C158237gb;
import X.C162517oi;
import X.C163327q1;
import X.C33311f5;
import X.C36331k8;
import X.C36341k9;
import X.C36381kD;
import X.C36391kE;
import X.C36431kI;
import X.C36441kJ;
import X.C38851qK;
import X.C38881qN;
import X.C41271ww;
import X.C85084Fs;
import X.C85094Ft;
import X.C90494aF;
import X.C90504aG;
import X.C95844mN;
import X.C95864mP;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.expressionstray.emoji.view.EmojiImageView;
import com.whatsapp.expressionstray.emoji.view.EmojiImageViewLoader;
import java.util.concurrent.CancellationException;

public final class EmojiExpressionsFragment extends Hilt_EmojiExpressionsFragment implements C158237gb {
    public static final int[] A0K = {128557};
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public LinearLayoutManager A04;
    public RecyclerView A05;
    public RecyclerView A06;
    public C38881qN A07;
    public AnonymousClass6O1 A08;
    public C38851qK A09;
    public AnonymousClass1H2 A0A;
    public C95864mP A0B;
    public AnonymousClass6CK A0C;
    public C95844mN A0D;
    public EmojiImageView A0E;
    public EmojiImageViewLoader A0F;
    public C1270066o A0G;
    public C007403e A0H;
    public CoordinatorLayout A0I;
    public final AnonymousClass00T A0J;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        C1270066o A1k = A1k();
        int andIncrement = A1k.A02.getAndIncrement();
        A1k.A01.markerStart(694884634, andIncrement);
        this.A00 = andIncrement;
        A1k().A00(this.A00, "emoji_on_create_view_start", (String) null);
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
        A1k().A00(this.A00, "emoji_on_create_view_end", (String) null);
        return inflate;
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        A1k().A00(this.A00, "emoji_on_view_created_start", (String) null);
        this.A02 = C012005e.A02(view, R.id.emoji_vscroll_view);
        this.A05 = C90504aG.A0J(view, R.id.items);
        this.A06 = C90504aG.A0J(view, R.id.sections);
        this.A01 = C012005e.A02(view, R.id.emoji_tab_search_no_results);
        this.A0E = (EmojiImageView) C012005e.A02(view, R.id.emoji_no_results_image);
        this.A0I = (CoordinatorLayout) C012005e.A02(view, R.id.snack_bar_view);
        this.A03 = C012005e.A02(view, R.id.emoji_tip);
        A1k().A00(this.A00, "emoji_set_up_rv_start", (String) null);
        RecyclerView recyclerView = this.A05;
        if (recyclerView != null) {
            if (!C011304x.A03(recyclerView) || recyclerView.isLayoutRequested()) {
                C163327q1.A00(recyclerView, this, 5);
            } else {
                A06(this, A03(this));
            }
        }
        A1k().A00(this.A00, "emoji_set_up_rv_end", (String) null);
        A1k().A00(this.A00, "emoji_set_up_sections_start", (String) null);
        C95844mN r1 = new C95844mN(new C154437Se(this));
        this.A0D = r1;
        RecyclerView recyclerView2 = this.A06;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(r1);
        }
        RecyclerView recyclerView3 = this.A06;
        if (recyclerView3 != null) {
            recyclerView3.setItemAnimator((C02800By) null);
        }
        A1k().A00(this.A00, "emoji_set_up_sections_end", (String) null);
        A05(this);
        C36331k8.A1T(new EmojiExpressionsFragment$observeEmojiExpressionsSideEffects$1(this, (C023509x) null), C33311f5.A00(this));
        if (C90494aF.A1V(this)) {
            RecyclerView recyclerView4 = this.A05;
            if (recyclerView4 != null) {
                if (!C011304x.A03(recyclerView4) || recyclerView4.isLayoutRequested()) {
                    C163327q1.A00(recyclerView4, this, 4);
                } else {
                    A05(this);
                }
            }
        } else {
            Bundle bundle2 = this.A0A;
            if (bundle2 != null && bundle2.getBoolean("isCollapsed")) {
                BTx();
            }
        }
        A1k().A00(this.A00, "emoji_on_view_created_end", (String) null);
        A1k().A01(AnonymousClass5TR.SUCCESS, this.A00);
    }

    public void onConfigurationChanged(Configuration configuration) {
        AnonymousClass00C.A0D(configuration, 0);
        super.onConfigurationChanged(configuration);
        RecyclerView recyclerView = this.A05;
        if (recyclerView != null) {
            C163327q1.A00(recyclerView, this, 3);
        }
    }

    public static final int A03(EmojiExpressionsFragment emojiExpressionsFragment) {
        int i;
        RecyclerView recyclerView = emojiExpressionsFragment.A05;
        if (recyclerView != null) {
            i = recyclerView.getWidth();
        } else {
            i = 0;
        }
        return i / C36341k9.A0G(emojiExpressionsFragment).getDimensionPixelSize(R.dimen.f7nameremoved);
    }

    public static final void A05(EmojiExpressionsFragment emojiExpressionsFragment) {
        C007403e r1 = emojiExpressionsFragment.A0H;
        if (r1 != null) {
            r1.B2S((CancellationException) null);
        }
        int A032 = A03(emojiExpressionsFragment);
        emojiExpressionsFragment.A0H = C36391kE.A12(new EmojiExpressionsFragment$observeState$1(emojiExpressionsFragment, (C023509x) null, A032), C33311f5.A00(emojiExpressionsFragment));
    }

    public final C1270066o A1k() {
        C1270066o r0 = this.A0G;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("expressionsTrayPerformanceLogger");
    }

    public void BTx() {
        RecyclerView recyclerView = this.A05;
        if (recyclerView == null) {
            return;
        }
        if (!C011304x.A03(recyclerView) || recyclerView.isLayoutRequested()) {
            C163327q1.A00(recyclerView, this, 2);
        } else {
            A05(this);
        }
    }

    public EmojiExpressionsFragment() {
        AnonymousClass00T A002 = C001400p.A00(C000800j.NONE, new AnonymousClass7LW(new AnonymousClass7LY(this)));
        C019308f A1A = C36441kJ.A1A(EmojiExpressionsViewModel.class);
        this.A0J = new C12560iI(new AnonymousClass7LX(A002), new C85094Ft(this, A002), new C85084Fs(A002), A1A);
    }

    public static final void A06(EmojiExpressionsFragment emojiExpressionsFragment, int i) {
        Paint A0K2 = C36441kJ.A0K();
        C36381kD.A16(emojiExpressionsFragment.A0a(), A0K2, R.color.f6nameremoved);
        EmojiImageViewLoader emojiImageViewLoader = emojiExpressionsFragment.A0F;
        if (emojiImageViewLoader != null) {
            C95864mP r1 = new C95864mP(A0K2, emojiImageViewLoader, emojiExpressionsFragment.A1k(), new AnonymousClass7Y6(emojiExpressionsFragment), new AnonymousClass7Y7(emojiExpressionsFragment), i, C36341k9.A0G(emojiExpressionsFragment).getDimensionPixelSize(R.dimen.f7nameremoved));
            emojiExpressionsFragment.A0B = r1;
            RecyclerView recyclerView = emojiExpressionsFragment.A05;
            if (recyclerView != null) {
                recyclerView.setAdapter(r1);
                recyclerView.setItemAnimator((C02800By) null);
                recyclerView.A0v(new C162517oi(emojiExpressionsFragment, 9));
                AnonymousClass01I A0h = emojiExpressionsFragment.A0h();
                if (A0h != null) {
                    AnonymousClass1JI r2 = emojiExpressionsFragment.A1k().A00;
                    r2.A01(A0h);
                    recyclerView.A0v(new C41271ww(A0h, r2, 11));
                }
            }
            emojiExpressionsFragment.A0a();
            LinearLayoutManager A0T = C36431kI.A0T();
            emojiExpressionsFragment.A04 = A0T;
            RecyclerView recyclerView2 = emojiExpressionsFragment.A05;
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager(A0T);
                return;
            }
            return;
        }
        throw C36331k8.A0d("emojiImageViewLoader");
    }

    public void A1J() {
        super.A1J();
        EmojiImageViewLoader emojiImageViewLoader = this.A0F;
        if (emojiImageViewLoader != null) {
            C07570Yj.A03(((AnonymousClass040) emojiImageViewLoader.A04.getValue()).BAE());
            emojiImageViewLoader.A03.clear();
            this.A02 = null;
            this.A05 = null;
            this.A04 = null;
            this.A06 = null;
            this.A01 = null;
            this.A0E = null;
            this.A0I = null;
            this.A0B = null;
            this.A0D = null;
            this.A07 = null;
            this.A09 = null;
            return;
        }
        throw C36331k8.A0d("emojiImageViewLoader");
    }
}
