package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.R;
import com.whatsapp.reactions.ReactionsTrayViewModel;

/* renamed from: X.1qL  reason: invalid class name and case insensitive filesystem */
public class C38861qL extends PopupWindow {
    public final View A00;
    public final C225314u A01;
    public final C43842Ka A02;
    public final C18820ts A03;

    public C38861qL(View view, C225314u r12, C21060yb r13, C18820ts r14, AnonymousClass3T1 r15, ReactionsTrayViewModel reactionsTrayViewModel, boolean z) {
        int i;
        this.A03 = r14;
        this.A01 = r12;
        this.A00 = view;
        ReactionsTrayViewModel reactionsTrayViewModel2 = reactionsTrayViewModel;
        C43842Ka r7 = new C43842Ka(r12, reactionsTrayViewModel2);
        this.A02 = r7;
        FrameLayout frameLayout = new FrameLayout(r12);
        int dimensionPixelOffset = this.A01.getResources().getDimensionPixelOffset(R.dimen.f7nameremoved);
        int i2 = !z ? r15.A1J.A02 ? 8388613 : 8388611 : 8388611;
        reactionsTrayViewModel2.A01 = C36341k9.A04(r12);
        Rect A06 = AnonymousClass001.A06();
        C36361kB.A0C(r12).getWindowVisibleDisplayFrame(A06);
        int width = C36361kB.A0C(r12).getWidth();
        int i3 = reactionsTrayViewModel2.A01;
        boolean z2 = false;
        if (i3 == 2) {
            i = width - (A06.right - A06.left);
        } else {
            i = 0;
        }
        frameLayout.setPadding(dimensionPixelOffset, 0, i + dimensionPixelOffset, 0);
        frameLayout.setClipToPadding(false);
        C36391kE.A1G(r7, frameLayout, -2, i2);
        setContentView(frameLayout);
        setBackgroundDrawable(new ColorDrawable(r12.getResources().getColor(R.color.f6nameremoved)));
        setTouchable(true);
        AccessibilityManager A0M = r13.A0M();
        if (A0M != null && A0M.isTouchExplorationEnabled()) {
            z2 = true;
        }
        setFocusable(z2);
        setOutsideTouchable(true);
        setWidth(-1);
        setHeight(-2);
        setInputMethodMode(2);
        setTouchInterceptor(new C53782rs(frameLayout, this, 4));
    }

    public void A00(int i) {
        int i2;
        int dimensionPixelOffset = getContentView().getResources().getDimensionPixelOffset(R.dimen.f7nameremoved);
        C225314u r10 = this.A01;
        int i3 = 0;
        int max = Math.max(0, 0 - r10.getResources().getDimensionPixelOffset(R.dimen.f7nameremoved));
        int dimensionPixelSize = getContentView().getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        C43842Ka r5 = this.A02;
        View view = this.A00;
        int width = view.getWidth();
        C18820ts r6 = this.A03;
        r5.A01(width, max, AnonymousClass000.A1S(((FrameLayout.LayoutParams) r5.getLayoutParams()).gravity & 7, C36421kH.A01(C36351kA.A1Y(r6) ? 1 : 0)));
        int i4 = -(((view.getHeight() + (r5.getMeasuredHeight() - (dimensionPixelSize * 2))) + dimensionPixelOffset) - i);
        Window window = r10.getWindow();
        if ((window.getDecorView().getSystemUiVisibility() & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
            Rect A06 = AnonymousClass001.A06();
            window.getDecorView().getWindowVisibleDisplayFrame(A06);
            i2 = A06.top;
            Toolbar toolbar = r10.A02;
            if (toolbar != null) {
                i3 = toolbar.getHeight();
            }
        } else {
            i2 = 0;
        }
        int A05 = C36411kG.A05(getContentView());
        int top = (view.getTop() - i3) - i2;
        if (i + top < r5.getMeasuredHeight() + dimensionPixelOffset) {
            i4 = -(((view.getHeight() + top) + dimensionPixelSize) - A05);
        }
        Pair A0I = C36341k9.A0I(Integer.valueOf(max), i4);
        showAsDropDown(view, 0, C36381kD.A03(A0I));
        Rect A062 = AnonymousClass001.A06();
        view.getGlobalVisibleRect(A062);
        int i5 = Resources.getSystem().getDisplayMetrics().widthPixels;
        int i6 = A062.left;
        int A04 = C36381kD.A04(A0I);
        r5.A02(i6 + A04, (i5 - A062.right) + A04, AnonymousClass000.A1S(((FrameLayout.LayoutParams) r5.getLayoutParams()).gravity & 7, C36421kH.A01(C36351kA.A1Y(r6) ? 1 : 0)));
    }
}
