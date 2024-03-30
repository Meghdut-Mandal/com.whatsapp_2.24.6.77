package X;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.6Dx  reason: invalid class name and case insensitive filesystem */
public final class C128866Dx {
    public int A00 = 1;
    public RecyclerView A01;
    public ShimmerFrameLayout A02;
    public AnonymousClass6NO A03;
    public C157987fc A04 = AnonymousClass6q2.A00;
    public C96044mh A05;
    public AnonymousClass63M A06;
    public final C115755jO A07;
    public final C115945jh A08;
    public final C115965jj A09;
    public final C18820ts A0A;

    public C128866Dx(C115755jO r3, C115945jh r4, C115965jj r5, C18820ts r6) {
        AnonymousClass00C.A0D(r6, 1);
        C36321k7.A12(r4, r5, r3);
        this.A0A = r6;
        this.A08 = r4;
        this.A09 = r5;
        this.A07 = r3;
    }

    public final void A00() {
        ShimmerFrameLayout shimmerFrameLayout = this.A02;
        if (shimmerFrameLayout == null) {
            throw C36331k8.A0d("shimmerView");
        }
        shimmerFrameLayout.setVisibility(0);
        ShimmerFrameLayout shimmerFrameLayout2 = this.A02;
        if (shimmerFrameLayout2 == null) {
            throw C36331k8.A0d("shimmerView");
        }
        shimmerFrameLayout2.A02();
        C96044mh r3 = this.A05;
        if (r3 == null) {
            throw C36331k8.A0d("adapter");
        }
        if (!r3.A04) {
            r3.A04 = true;
            int size = r3.A03.A01.size();
            r3.A03 = C109895Zn.A00();
            if (size < 5) {
                r3.A0A(0, size);
                r3.A01.A02(size, 5 - size);
            } else {
                r3.A0A(0, 5);
                r3.A01.A03(5, size - 5);
            }
        }
        AnonymousClass63M r6 = this.A06;
        if (r6 == null) {
            throw C36331k8.A0d("titleController");
        }
        TextView textView = r6.A02;
        Drawable A012 = C013105r.A01(textView.getContext(), R.drawable.variants_carousel_title_loading_background_shape);
        int dimensionPixelSize = textView.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        TextView textView2 = r6.A02;
        textView2.setBackground(A012);
        C90514aH.A1J(textView2, dimensionPixelSize, -2);
        AnonymousClass6NO r1 = this.A03;
        if (r1 == null) {
            throw C36331k8.A0d("dropdownController");
        }
        r1.A01((C134606bJ) null, C109895Zn.A00(), 0, false);
        RecyclerView recyclerView = this.A01;
        if (recyclerView == null) {
            throw C36331k8.A0d("carouselView");
        }
        recyclerView.setVisibility(0);
    }

    public final void A01(AnonymousClass01z r11, AnonymousClass012 r12, ShimmerFrameLayout shimmerFrameLayout, UserJid userJid) {
        this.A02 = shimmerFrameLayout;
        TextView A0M = C36341k9.A0M(shimmerFrameLayout, R.id.variants_label);
        this.A01 = (RecyclerView) C36361kB.A0G(shimmerFrameLayout, R.id.variants_list);
        TextView A0M2 = C36341k9.A0M(shimmerFrameLayout, R.id.variants_dropdown);
        C115755jO r1 = this.A07;
        AnonymousClass01z r5 = r11;
        AnonymousClass012 r6 = r12;
        this.A03 = new AnonymousClass6NO(A0M2, r5, r6, new C129366Gq(), new C165127sv(this, 1), C36341k9.A0T(r1.A00.A02));
        this.A06 = new AnonymousClass63M(A0M, C36341k9.A0T(this.A09.A00.A02));
        ShimmerFrameLayout shimmerFrameLayout2 = this.A02;
        if (shimmerFrameLayout2 == null) {
            throw C36331k8.A0d("shimmerView");
        }
        shimmerFrameLayout2.A01();
        RecyclerView recyclerView = this.A01;
        if (recyclerView == null) {
            throw C36331k8.A0d("carouselView");
        }
        recyclerView.A0t(new C41221wr(this.A0A, C36341k9.A0F(shimmerFrameLayout).getDimensionPixelSize(R.dimen.f7nameremoved)));
        C96044mh r2 = new C96044mh((C115955ji) this.A08.A00.A01.A0s.get(), userJid);
        this.A05 = r2;
        RecyclerView recyclerView2 = this.A01;
        if (recyclerView2 == null) {
            throw C36331k8.A0d("carouselView");
        }
        recyclerView2.setAdapter(r2);
        C96044mh r22 = this.A05;
        if (r22 == null) {
            throw C36331k8.A0d("adapter");
        }
        r22.A02 = new C165127sv(this, 2);
    }
}
