package X;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.components.button.ThumbnailButton;

/* renamed from: X.2Ii  reason: invalid class name and case insensitive filesystem */
public final class C43522Ii extends C43542Ip {
    public C20810yC A00;
    public AnonymousClass1DU A01;
    public AnonymousClass1SV A02;
    public AnonymousClass1RJ A03;
    public final int A04 = C36341k9.A0F(this).getDimensionPixelSize(R.dimen.f7nameremoved);
    public final WaTextView A05;
    public final ThumbnailButton A06;
    public final RelativeLayout A07;
    public final ShimmerFrameLayout A08;
    public final WaTextView A09;
    public final WaTextView A0A;

    public void A01(AnonymousClass2bV r14) {
        Integer num;
        String A002;
        AnonymousClass2bV r5 = r14;
        super.A01(r14);
        int i = 0;
        if (r14.A01 == 4) {
            this.A07.setVisibility(8);
            ShimmerFrameLayout shimmerFrameLayout = this.A08;
            shimmerFrameLayout.setVisibility(0);
            shimmerFrameLayout.A05(C53892s4.A00());
            C36341k9.A0q(getContext(), shimmerFrameLayout, R.color.f6nameremoved);
            shimmerFrameLayout.A03();
            return;
        }
        C64933Qa r8 = r14.A1J;
        ShimmerFrameLayout shimmerFrameLayout2 = this.A08;
        shimmerFrameLayout2.A04();
        shimmerFrameLayout2.setVisibility(8);
        this.A07.setVisibility(0);
        this.A09.setText(r14.A05);
        String str = r14.A06;
        String str2 = null;
        if (!(str == null || (A002 = C63783Lk.A00(getLinkifyWeb(), str)) == null)) {
            if (A002.length() > 150) {
                A002 = A002.substring(0, 150);
            }
            str2 = A002;
        }
        WaTextView waTextView = this.A0A;
        if (str2 == null) {
            i = 8;
        }
        waTextView.setVisibility(i);
        waTextView.setText(str2);
        if (r14.A1c() == null) {
            this.A06.setVisibility(8);
        } else {
            AnonymousClass1SV.A06(this.A06, r5, new C53702rk(this, 10), getMessageThumbCache(), r8, 2000, false, false, false);
        }
        AnonymousClass3KQ A0N = r14.A0N();
        if (A0N == null || (num = A0N.A02) == null || num.intValue() <= 0) {
            this.A05.setVisibility(8);
            return;
        }
        WaTextView waTextView2 = this.A05;
        waTextView2.setVisibility(0);
        waTextView2.setText(AnonymousClass000.A0t(C36381kD.A11(num), '.'));
        waTextView2.setTextDirection(3);
    }

    public final void setAbProps(C20810yC r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final void setLinkifyWeb(AnonymousClass1DU r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setMessageThumbCache(AnonymousClass1SV r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final C20810yC getAbProps() {
        C20810yC r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A07();
    }

    public final AnonymousClass1DU getLinkifyWeb() {
        AnonymousClass1DU r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("linkifyWeb");
    }

    public final AnonymousClass1SV getMessageThumbCache() {
        AnonymousClass1SV r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("messageThumbCache");
    }

    public C43522Ii(Context context, C89004Uw r5) {
        super(context, r5);
        View.inflate(context, R.layout.f9nameremoved, this);
        this.A07 = (RelativeLayout) C36361kB.A0G(this, R.id.content);
        this.A0A = C36341k9.A0Q(this, R.id.url);
        this.A09 = C36341k9.A0Q(this, R.id.title);
        this.A05 = C36341k9.A0Q(this, R.id.reference_index);
        ThumbnailButton thumbnailButton = (ThumbnailButton) C36361kB.A0G(this, R.id.thumb);
        this.A06 = thumbnailButton;
        this.A08 = (ShimmerFrameLayout) C36361kB.A0G(this, R.id.shimmer_layout);
        this.A03 = C36341k9.A0Y(this, R.id.selection_view);
        C34081gQ.A04(thumbnailButton, C36441kJ.A00(C36341k9.A0F(this), R.dimen.f7nameremoved));
    }

    public AnonymousClass1RJ getSelectionView() {
        return this.A03;
    }
}
