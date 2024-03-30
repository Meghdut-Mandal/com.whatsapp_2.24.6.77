package com.whatsapp.status.playback;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass02R;
import X.AnonymousClass16J;
import X.AnonymousClass191;
import X.AnonymousClass1GZ;
import X.AnonymousClass1N2;
import X.AnonymousClass22r;
import X.AnonymousClass24Y;
import X.AnonymousClass2M8;
import X.C012005e;
import X.C18800tq;
import X.C18830tt;
import X.C18950u5;
import X.C19430v1;
import X.C21710zg;
import X.C27111My;
import X.C27131Na;
import X.C29731Xt;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36401kF;
import X.C36411kG;
import X.C36441kJ;
import X.C38871qM;
import X.C81173wa;
import X.C89034Uz;
import X.C89374Wh;
import X.C90104Zc;
import X.C90394a5;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.Set;

public final class StatusReplyActivity extends MessageReplyActivity {
    public C27131Na A00;
    public AnonymousClass16J A01;
    public C29731Xt A02;
    public boolean A03;
    public final Runnable A04;
    public final Set A05;
    public final Rect A06;
    public final ViewTreeObserver.OnGlobalLayoutListener A07;
    public final AnonymousClass191 A08;

    public int A2I() {
        return 78318969;
    }

    public boolean A2g() {
        return false;
    }

    public static final void A0I(StatusReplyActivity statusReplyActivity) {
        int i;
        AnonymousClass22r r0;
        C38871qM r02;
        int identifier;
        AnonymousClass2M8 r03;
        View view = statusReplyActivity.A01;
        Rect rect = statusReplyActivity.A06;
        view.getWindowVisibleDisplayFrame(rect);
        int[] A1O = C36441kJ.A1O();
        statusReplyActivity.A01.getLocationOnScreen(A1O);
        int measuredHeight = rect.bottom - statusReplyActivity.A1V.getMeasuredHeight();
        if (!AnonymousClass1N2.A00(statusReplyActivity.A01) && (r03 = statusReplyActivity.A0f) != null && r03.isShowing()) {
            r02 = statusReplyActivity.A0f;
        } else if (AnonymousClass1N2.A00(statusReplyActivity.A01) || (r0 = statusReplyActivity.A0P.A02) == null || !r0.isShowing()) {
            i = 0;
            int i2 = (measuredHeight - i) - A1O[1];
            if (Build.MANUFACTURER.equalsIgnoreCase("Essential Products") && Build.MODEL.equalsIgnoreCase("PH-1") && (identifier = statusReplyActivity.getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
                i2 -= C36361kB.A02(statusReplyActivity, identifier);
            }
            View view2 = statusReplyActivity.A1V;
            C012005e.A0Q(view2, i2 - view2.getTop());
        } else {
            r02 = statusReplyActivity.A0P.A02;
        }
        i = r02.A01;
        int i22 = (measuredHeight - i) - A1O[1];
        i22 -= C36361kB.A02(statusReplyActivity, identifier);
        View view22 = statusReplyActivity.A1V;
        C012005e.A0Q(view22, i22 - view22.getTop());
    }

    public void A2F() {
        if (!this.A03) {
            this.A03 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r1 = A0L.A5g;
            C36321k7.A0c(r1, this);
            C18830tt r2 = r1.A00;
            C36321k7.A0X(r1, r2, this, C36321k7.A05(r1, r2, this));
            this.A0h = (AnonymousClass1GZ) r1.AOO.get();
            this.A0C = C36411kG.A0Y(r1);
            this.A0Y = C36351kA.A0a(r1);
            this.A0c = C36351kA.A0g(r1);
            this.A0H = (C89034Uz) r1.A7j.get();
            AnonymousClass24Y.A0G(r1, r2, C36361kB.A0T(r1), this);
            this.A0a = C36351kA.A0d(r1);
            this.A0O = C36351kA.A0T(r1);
            this.A0l = C36411kG.A0m(r1);
            this.A0L = C36341k9.A0R(r1);
            this.A1B = C36351kA.A0q(r1);
            AnonymousClass24Y.A0H(r1, r2, C36371kC.A0V(r1), this);
            this.A0M = C36341k9.A0S(r1);
            this.A0J = C36381kD.A0V(r1);
            AnonymousClass24Y.A07(A0L, r1, r2, this, C36351kA.A0n(r1));
            this.A0j = C36361kB.A0b(r1);
            this.A0K = C36381kD.A0X(r1);
            this.A0b = C36351kA.A0f(r2);
            AnonymousClass24Y.A01(A0L, r1, r2, C36351kA.A0X(r1), this);
            this.A0s = C36351kA.A0m(r1);
            AnonymousClass24Y.A0F(A0L, r1, r2, this, r1.A4v);
            this.A01 = C36361kB.A0Z(r1);
            this.A02 = C36381kD.A0i(r1);
            this.A00 = (C27131Na) r1.ATT.get();
        }
    }

    public C18950u5 BGv() {
        C18950u5 r0 = C19430v1.A02;
        AnonymousClass00C.A09(r0);
        return r0;
    }

    public StatusReplyActivity(int i) {
        this.A03 = false;
        C89374Wh.A00(this, 1);
    }

    public C21710zg A2K() {
        C21710zg A2K = super.A2K();
        C36321k7.A0s(A2K, this);
        return A2K;
    }

    public void onCreate(Bundle bundle) {
        Window window = getWindow();
        window.setFlags(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
        window.setFlags(134217728, 134217728);
        window.setFlags(67108864, 67108864);
        super.onCreate(bundle);
        View view = this.A01;
        if (view != null) {
            view.setSystemUiVisibility(4);
            this.A01.getViewTreeObserver().addOnGlobalLayoutListener(this.A07);
            AnonymousClass16J r1 = this.A01;
            if (r1 != null) {
                r1.registerObserver(this.A08);
                C36401kF.A1C(this);
                return;
            }
            throw C36331k8.A0d("messageObservers");
        }
    }

    public void onDestroy() {
        ViewTreeObserver viewTreeObserver;
        super.onDestroy();
        AnonymousClass16J r1 = this.A01;
        if (r1 != null) {
            r1.unregisterObserver(this.A08);
            View view = this.A01;
            if (!(view == null || (viewTreeObserver = view.getViewTreeObserver()) == null)) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.A07);
            }
            View view2 = this.A01;
            if (view2 != null) {
                view2.removeCallbacks(this.A04);
                return;
            }
            return;
        }
        throw C36331k8.A0d("messageObservers");
    }

    public StatusReplyActivity() {
        this(0);
        Integer[] numArr = new Integer[2];
        AnonymousClass000.A1L(numArr, 8, 0);
        AnonymousClass000.A1K(numArr, 7);
        AnonymousClass00C.A0D(numArr, 0);
        this.A05 = AnonymousClass02R.A0E(numArr);
        this.A06 = AnonymousClass001.A06();
        this.A04 = new C81173wa((Object) this, 27);
        this.A08 = C90394a5.A00(this, 31);
        this.A07 = new C90104Zc(this, 31);
    }
}
