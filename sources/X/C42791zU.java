package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.1zU  reason: invalid class name and case insensitive filesystem */
public abstract class C42791zU extends AnonymousClass07S {
    public void A0O(ViewGroup viewGroup, Object obj, int i) {
    }

    public int A0L(Object obj) {
        Object obj2;
        int i;
        if (this instanceof AnonymousClass22A) {
            C39871u3 r3 = ((AnonymousClass22A) this).A09;
            Object obj3 = ((AnonymousClass00I) obj).A01;
            C18740tg.A06(obj3);
            C61923Ea r2 = (C61923Ea) obj3;
            if (r2.A03.equals(r3.A03.A03)) {
                return 0;
            }
            int indexOf = C36401kF.A0w(r3.A06).indexOf(r2);
            if (indexOf < 0 || (i = indexOf + 1) == -1) {
                return -2;
            }
            return i;
        } else if (!(this instanceof AnonymousClass22B)) {
            return -1;
        } else {
            AnonymousClass22B r22 = (AnonymousClass22B) this;
            AnonymousClass00I r5 = (AnonymousClass00I) obj;
            if (r5.A00 == null || (obj2 = r5.A01) == null) {
                return -2;
            }
            return r22.A00.BG4(obj2);
        }
    }

    public Object A0M(ViewGroup viewGroup, int i) {
        C61923Ea r10;
        if (this instanceof AnonymousClass22A) {
            AnonymousClass22A r2 = (AnonymousClass22A) this;
            Context context = r2.A00;
            RecyclerView recyclerView = new RecyclerView(context, (AttributeSet) null);
            recyclerView.setId(R.id.reactions_bottom_sheet_tab_recycler_view);
            recyclerView.setPadding(0, context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), 0, 0);
            recyclerView.setClipToPadding(false);
            C39871u3 r11 = r2.A09;
            if (i == 0) {
                r10 = r11.A03;
            } else {
                r10 = (C61923Ea) C36401kF.A0w(r11.A06).get(i - 1);
            }
            C36321k7.A0Q(recyclerView);
            AnonymousClass17Y r3 = r2.A02;
            C19730wQ r4 = r2.A03;
            AnonymousClass1Pp r5 = r2.A04;
            AnonymousClass16D r6 = r2.A05;
            C19930wk r12 = r2.A0A;
            AnonymousClass171 r7 = r2.A06;
            C18820ts r9 = r2.A08;
            recyclerView.setAdapter(new C41021wU(r2.A01, r3, r4, r5, r6, r7, r2.A07, r9, r10, r11, r12));
            viewGroup.addView(recyclerView);
            return C36441kJ.A0W(recyclerView, r10);
        } else if (this instanceof AnonymousClass22B) {
            AnonymousClass22B r42 = (AnonymousClass22B) this;
            AnonymousClass00I B50 = r42.A00.B50(i);
            Object obj = B50.A00;
            if (obj != null) {
                View view = (View) obj;
                Object obj2 = B50.A01;
                MediaViewBaseFragment.A05(view, r42.A01);
                view.setTag(obj2);
                viewGroup.addView(view, 0);
            }
            return B50;
        } else {
            AnonymousClass229 r52 = (AnonymousClass229) this;
            C65923Tz r43 = r52.A01;
            int i2 = C65923Tz.A0Z;
            View A0K = C36381kD.A0K(r43.A0C, R.layout.f9nameremoved);
            AbsListView absListView = (AbsListView) A0K.findViewById(16908298);
            C18820ts r62 = r52.A00;
            if (!C36351kA.A1Y(r62)) {
                i = (r43.A0P.length - 1) - i;
            }
            C37921nQ[] r53 = r43.A0P;
            if (r53[i] == null) {
                r53[i] = new C37921nQ(r43.A0A, r43, r62, i);
            }
            absListView.setAdapter(r53[i]);
            absListView.setEmptyView(A0K.findViewById(16908292));
            absListView.setTag(Integer.valueOf(i));
            if (i == r43.A00) {
                absListView.setOnScrollListener(r43.A0I);
            }
            viewGroup.addView(A0K, 0);
            return A0K;
        }
    }

    public void A0N(ViewGroup viewGroup, Object obj, int i) {
        if (this instanceof AnonymousClass22A) {
            viewGroup.removeView((View) ((AnonymousClass00I) obj).A00);
        } else if (this instanceof AnonymousClass22B) {
            AnonymousClass22B r1 = (AnonymousClass22B) this;
            Object obj2 = ((AnonymousClass00I) obj).A00;
            if (obj2 != null) {
                View view = (View) obj2;
                viewGroup.removeView(view);
                PhotoView.A01(view);
            }
            r1.A00.B5M(i);
        } else {
            View view2 = (View) obj;
            viewGroup.removeView(view2);
            ((AbsListView) view2.findViewById(16908298)).setOnScrollListener((AbsListView.OnScrollListener) null);
        }
    }

    public boolean A0P(View view, Object obj) {
        if (this instanceof AnonymousClass22A) {
            return C36361kB.A1a(view, ((AnonymousClass00I) obj).A00);
        }
        if (this instanceof AnonymousClass22B) {
            return C36361kB.A1a(view, ((AnonymousClass00I) obj).A00);
        }
        return C36361kB.A1a(view, obj);
    }

    @Deprecated
    public final int A07(Object obj) {
        return A0L(obj);
    }

    @Deprecated
    public final Object A0I(ViewGroup viewGroup, int i) {
        return A0M(viewGroup, i);
    }

    @Deprecated
    public final boolean A0K(View view, Object obj) {
        return A0P(view, obj);
    }

    @Deprecated
    public final void A0E(ViewGroup viewGroup, Object obj, int i) {
        A0O(viewGroup, obj, i);
    }

    @Deprecated
    public final void A0J(ViewGroup viewGroup, Object obj, int i) {
        A0N(viewGroup, obj, i);
    }
}
