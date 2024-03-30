package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.8Yb  reason: invalid class name and case insensitive filesystem */
public final class C174688Yb extends AnonymousClass2IR {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public List A04;
    public boolean A05;
    public final C22927Ayd A06;
    public final C22928Aye A07;
    public final C22929Ayf A08;
    public final C22930Ayg A09;
    public final C22931Ayh A0A;
    public final Drawable A0B;

    public Drawable A1A(int i, int i2, boolean z) {
        if (i == 1) {
            return this.A0B;
        }
        return super.A1A(i, i2, z);
    }

    public int getUserNameInGroupLayoutOption() {
        return 3;
    }

    public C174688Yb(Context context, C22927Ayd ayd, C22928Aye aye, C22929Ayf ayf, C22930Ayg ayg, C22931Ayh ayh, C89004Uw r16, AnonymousClass2bI r17) {
        super(context, r16, r17);
        List list;
        C22930Ayg ayg2;
        View view;
        View view2;
        A16();
        this.A08 = ayf;
        this.A0A = ayh;
        this.A09 = ayg;
        this.A06 = ayd;
        this.A07 = aye;
        Drawable A002 = AnonymousClass00E.A00(context, R.drawable.balloon_centered_no_padding_normal);
        C18740tg.A06(A002);
        AnonymousClass00C.A08(A002);
        this.A0B = A002;
        setClickable(false);
        this.A2I = true;
        this.A2M = false;
        View view3 = null;
        setOnClickListener((View.OnClickListener) null);
        ViewGroup A0P = C36411kG.A0P(this, R.id.contextCardLayout);
        AnonymousClass00C.A0B(A0P);
        if (this.A01 == null) {
            C22929Ayf ayf2 = this.A08;
            LinearLayout.LayoutParams layoutParams = null;
            if (ayf2 != null) {
                view2 = (View) ayf2;
            } else {
                view2 = null;
            }
            this.A01 = view2;
            A0P.addView(view2, ayf2 != null ? ayf2.getHeaderLayoutParams() : layoutParams);
        }
        if (this.A03 == null) {
            C22931Ayh ayh2 = this.A0A;
            LinearLayout.LayoutParams layoutParams2 = null;
            if (ayh2 != null) {
                view = (View) ayh2;
            } else {
                view = null;
            }
            this.A03 = view;
            A0P.addView(view, ayh2 != null ? ayh2.getTitleViewLayoutParams() : layoutParams2);
        }
        if (this.A02 == null && (ayg2 = this.A09) != null) {
            View view4 = (View) ayg2;
            this.A02 = view4;
            A0P.addView(view4, ayg2.getSubtitleViewLayoutParams());
        }
        if (this.A00 == null) {
            C22927Ayd ayd2 = this.A06;
            LinearLayout.LayoutParams layoutParams3 = null;
            this.A00 = ayd2 != null ? (View) ayd2 : view3;
            layoutParams3 = ayd2 != null ? ayd2.getBodyViewLayoutParams() : layoutParams3;
            View view5 = this.A00;
            if (!(view5 == null || layoutParams3 == null)) {
                A0P.addView(view5, layoutParams3);
            }
        }
        if (this.A04 == null) {
            C22928Aye aye2 = this.A07;
            if (aye2 != null) {
                list = aye2.getCTAViews();
            } else {
                list = null;
            }
            this.A04 = list;
            if (list != null) {
                int i = 0;
                for (Object next : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        throw C36351kA.A0v();
                    }
                    View view6 = (View) next;
                    LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, A0P.getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
                    layoutParams4.gravity = 17;
                    if (i == 0) {
                        layoutParams4.topMargin = A0P.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
                    }
                    A0P.addView(view6, layoutParams4);
                    i = i2;
                }
            }
        }
    }

    public void A16() {
        if (!this.A05) {
            this.A05 = true;
            C27861Qc A0n = C175108Zr.A0n(this);
            C18800tq r4 = A0n.A0M;
            C27111My A0m = C175108Zr.A0m(r4, A0n, this);
            C18830tt r2 = r4.A00;
            C175108Zr.A0y(r4, r2, r2, this);
            C175108Zr.A11(r4, this);
            C175108Zr.A14(r4, this, C165597tg.A0h(r4));
            C175108Zr.A12(r4, this);
            C175108Zr.A10(r4, r2, this, C175108Zr.A0q(r4));
            C175108Zr.A13(r4, this);
            C19470v6 A0k = C175108Zr.A0k(A0m, r4, r2, this, C165577te.A0U(r4));
            C175108Zr.A0v(A0k, r4, r2, this, C175108Zr.A0o(r4, this));
            C175108Zr.A0w(A0m, r4, r2, this);
            C175108Zr.A0z(r4, r2, A0n, this, C175108Zr.A0p(r2));
            C175108Zr.A0x(A0m, A0n, this);
            C175108Zr.A0u(A0k, r4, r2, A0n, this);
        }
    }

    public int getCenteredLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f9nameremoved;
    }
}
