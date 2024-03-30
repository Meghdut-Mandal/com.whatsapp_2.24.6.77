package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.bonsai.BonsaiToolbar;
import com.whatsapp.components.InsetsDrawingView;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.status.playback.StatusPlaybackActivity;
import com.whatsapp.status.playback.fragment.StatusPlaybackFragment;

/* renamed from: X.4ZQ  reason: invalid class name */
public class AnonymousClass4ZQ implements C010904r {
    public Object A00;
    public final int A01;

    public AnonymousClass4ZQ(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final AnonymousClass09H BRE(View view, AnonymousClass09H r10) {
        int i;
        switch (this.A01) {
            case 0:
                C70803fk r5 = (C70803fk) this.A00;
                r5.A05 = r10.A00.A0C(7).A03;
                if (r5.A0O != null) {
                    AnonymousClass1RC.A04(C70803fk.A0C(r5), R.color.f6nameremoved);
                    ViewGroup.LayoutParams layoutParams = r5.A0O.getLayoutParams();
                    layoutParams.height = r5.A05;
                    r5.A0O.setLayoutParams(layoutParams);
                    r5.A0O.requestLayout();
                    ViewGroup viewGroup = r5.A0R;
                    if (viewGroup != null) {
                        View A0L = C36411kG.A0L(viewGroup);
                        r5.A0I = A0L;
                        C90204Zm.A00(r5.A0I.getViewTreeObserver(), r5, A0L.getLayoutParams(), 2);
                    }
                }
                if (C70803fk.A1a(r5) && r5.A0j != null) {
                    C70803fk.A0F(r5).A09.get();
                    Toolbar toolbar = r5.A0j;
                    AnonymousClass00C.A0D(toolbar, 0);
                    if (toolbar instanceof BonsaiToolbar) {
                        Toolbar toolbar2 = r5.A0j;
                        C36421kH.A0y(r5.A0j, toolbar2, toolbar2.getPaddingLeft(), r5.A05, r5.A0j.getPaddingRight());
                    }
                }
                return AnonymousClass09H.A01;
            case 1:
                AnonymousClass02E r7 = (AnonymousClass02E) this.A00;
                ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(view);
                int i2 = r10.A00.A0C(7).A00;
                int i3 = A0a.leftMargin;
                int identifier = C36341k9.A0G(r7).getIdentifier("status_bar_height", "dimen", "android");
                if (identifier > 0) {
                    i = C36341k9.A0G(r7).getDimensionPixelSize(identifier);
                } else {
                    i = 25;
                }
                A0a.setMargins(i3, i, A0a.rightMargin, i2);
                view.setLayoutParams(A0a);
                return r10;
            case 2:
                MediaViewBaseFragment mediaViewBaseFragment = (MediaViewBaseFragment) this.A00;
                AnonymousClass00C.A0D(r10, 0);
                AnonymousClass09I r2 = r10.A00;
                AnonymousClass09T A0D = r2.A0D(7);
                AnonymousClass00C.A08(A0D);
                AnonymousClass09T A0D2 = r2.A0D(128);
                AnonymousClass00C.A08(A0D2);
                AnonymousClass3DR r72 = new AnonymousClass3DR(A0D, A0D2);
                mediaViewBaseFragment.A0B = r72;
                ViewGroup viewGroup2 = mediaViewBaseFragment.A03;
                if (viewGroup2 != null) {
                    AnonymousClass09T r6 = r72.A01;
                    AnonymousClass09T A002 = AnonymousClass09T.A00(r6.A01, 0, r6.A02, 0);
                    AnonymousClass09T A003 = r72.A00();
                    AnonymousClass09T A004 = AnonymousClass09T.A00(A003.A01, 0, A003.A02, 0);
                    AnonymousClass09T A005 = AnonymousClass09T.A00(0, AnonymousClass09T.A02(r72.A00, r6).A03, 0, 0);
                    ViewGroup.MarginLayoutParams A0K = C36371kC.A0K(viewGroup2);
                    A0K.leftMargin = A002.A01;
                    A0K.topMargin = A002.A03;
                    A0K.rightMargin = A002.A02;
                    A0K.bottomMargin = A002.A00;
                    viewGroup2.setLayoutParams(A0K);
                    ViewGroup viewGroup3 = mediaViewBaseFragment.A03;
                    AnonymousClass09T A006 = AnonymousClass09T.A00(A004.A01 + A005.A01, A004.A03 + A005.A03, A004.A02 + A005.A02, A004.A00 + A005.A00);
                    AnonymousClass00C.A0D(viewGroup3, 0);
                    viewGroup3.setPadding(A006.A01, A006.A03, A006.A02, A006.A00);
                }
                InsetsDrawingView insetsDrawingView = mediaViewBaseFragment.A07;
                if (!(insetsDrawingView == null || mediaViewBaseFragment.A0B == null)) {
                    insetsDrawingView.setColor(R.color.f6nameremoved);
                    InsetsDrawingView insetsDrawingView2 = mediaViewBaseFragment.A07;
                    AnonymousClass09T r0 = mediaViewBaseFragment.A0B.A01;
                    AnonymousClass09T A007 = AnonymousClass09T.A00(r0.A01, 0, r0.A02, 0);
                    AnonymousClass00C.A0D(insetsDrawingView2, 0);
                    insetsDrawingView2.setPadding(A007.A01, A007.A03, A007.A02, A007.A00);
                }
                if (mediaViewBaseFragment.A08 == null) {
                    return r10;
                }
                for (int i4 = 0; i4 < mediaViewBaseFragment.A08.getChildCount(); i4++) {
                    MediaViewBaseFragment.A05(mediaViewBaseFragment.A08.getChildAt(i4), mediaViewBaseFragment);
                }
                return r10;
            case 3:
                StatusPlaybackActivity statusPlaybackActivity = (StatusPlaybackActivity) this.A00;
                Rect rect = statusPlaybackActivity.A0P;
                rect.set(r10.A03(), r10.A05(), r10.A04(), r10.A02());
                for (AnonymousClass02E r1 : statusPlaybackActivity.A2m()) {
                    if (r1 instanceof StatusPlaybackFragment) {
                        ((StatusPlaybackFragment) r1).A1e(rect);
                    }
                }
                return r10;
            default:
                AnonymousClass5ND r62 = (AnonymousClass5ND) this.A00;
                boolean z = r62.A0O;
                View view2 = r62.A0D;
                if (z) {
                    if (view2 != null) {
                        C36421kH.A0y(r62.A0D, view2, r10.A03(), r62.A0D.getPaddingTop(), r10.A04());
                    }
                    AnonymousClass09H A0B = C012005e.A0B(view, r10);
                    return A0B.A07(0, A0B.A05(), 0, A0B.A02());
                }
                if (view2 != null) {
                    view2.setPadding(0, 0, 0, 0);
                }
                return C012005e.A0B(view, r10);
        }
    }
}
