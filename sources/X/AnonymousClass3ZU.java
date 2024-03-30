package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.whatsapp.R;
import com.whatsapp.snackbar.WaSnackbar$$ExternalSyntheticLambda0;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3ZU  reason: invalid class name */
public final class AnonymousClass3ZU implements ViewTreeObserver.OnGlobalLayoutListener {
    public final AnonymousClass01Y A00;
    public final C99304t3 A01;
    public final List A02;
    public final AnonymousClass01M A03;
    public final AnonymousClass0NP A04;
    public final C21060yb A05;
    public final boolean A06;

    public AnonymousClass3ZU(AnonymousClass012 r5, C99304t3 r6, C21060yb r7, List list, boolean z) {
        AnonymousClass00C.A0D(r7, 3);
        this.A01 = r6;
        this.A02 = list;
        this.A05 = r7;
        this.A06 = z;
        this.A04 = new C89204Vq(this, 2);
        WaSnackbar$$ExternalSyntheticLambda0 waSnackbar$$ExternalSyntheticLambda0 = new WaSnackbar$$ExternalSyntheticLambda0(this);
        this.A00 = waSnackbar$$ExternalSyntheticLambda0;
        AnonymousClass01M lifecycle = r5.getLifecycle();
        AnonymousClass00C.A08(lifecycle);
        this.A03 = lifecycle;
        C18740tg.A0C(C36371kC.A1W(((AnonymousClass01N) lifecycle).A02, AnonymousClass01P.DESTROYED));
        lifecycle.A04(waSnackbar$$ExternalSyntheticLambda0);
    }

    public static final void A00(AnonymousClass3ZU r3, int i) {
        Iterator it = C007103b.A0V(r3.A02).iterator();
        while (it.hasNext()) {
            C36431kI.A0K(it).animate().translationY((float) i).setDuration(250).setInterpolator(new AnonymousClass065()).start();
        }
    }

    public final void A01() {
        this.A01.A0N();
        this.A03.A05(this.A00);
    }

    public final void A02() {
        if (((AnonymousClass01N) this.A03).A02.compareTo(AnonymousClass01P.STARTED) >= 0) {
            C99304t3 r1 = this.A01;
            AnonymousClass0Eq r0 = r1.A0J;
            AnonymousClass00C.A08(r0);
            r0.getViewTreeObserver().addOnGlobalLayoutListener(this);
            r1.A0V(this.A04);
            r1.A0P();
        }
    }

    public final void A03(int i) {
        C99304t3 r1 = this.A01;
        int A002 = AnonymousClass00F.A00(r1.A0G, i);
        AnonymousClass0Eq r12 = r1.A0J;
        AnonymousClass00C.A08(r12);
        C36341k9.A0M(r12, R.id.snackbar_action).setTextColor(A002);
    }

    public final void A04(View.OnClickListener onClickListener, int i) {
        C99304t3 r1 = this.A01;
        r1.A0Z(C36361kB.A0m(r1.A0G, i), onClickListener);
    }

    public final void A05(Runnable runnable) {
        this.A01.A0V(new C89204Vq(runnable, 1));
    }

    public void onGlobalLayout() {
        AnonymousClass0Eq r1 = this.A01.A0J;
        AnonymousClass00C.A08(r1);
        C36351kA.A1C(r1, this);
        A00(this, -r1.getHeight());
        if (this.A06) {
            AnonymousClass3T3.A01(r1, this.A05);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass3ZU(View view, AnonymousClass012 r8, C21060yb r9, String str, List list, int i, boolean z) {
        this(r8, C99304t3.A01(view, str, i), r9, list, z);
        AnonymousClass00C.A0D(view, 1);
        C36321k7.A1A(str, list, r9, r8, 2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass3ZU(android.view.View r7, X.AnonymousClass012 r8, X.C21060yb r9, java.util.List r10, int r11, int r12, boolean r13) {
        /*
            r6 = this;
            r0 = 1
            r3 = r9
            X.C36421kH.A1J(r7, r0, r9)
            X.4t3 r2 = X.C99304t3.A00(r7, r11, r12)
            r0 = r6
            r1 = r8
            r4 = r10
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3ZU.<init>(android.view.View, X.012, X.0yb, java.util.List, int, int, boolean):void");
    }
}
