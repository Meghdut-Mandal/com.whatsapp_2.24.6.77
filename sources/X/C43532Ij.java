package X;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.conversation.conversationrow.bot.plugin.ReelCarouselItemView$updateProfilePhotoView$1;

/* renamed from: X.2Ij  reason: invalid class name and case insensitive filesystem */
public final class C43532Ij extends C43552Iq {
    public C20690y0 A00;
    public AnonymousClass1SV A01;
    public C005502l A02;
    public AnonymousClass1RJ A03;
    public final int A04 = C36341k9.A0F(this).getDimensionPixelSize(R.dimen.f7nameremoved);
    public final int A05 = C36341k9.A0F(this).getDimensionPixelSize(R.dimen.f7nameremoved);
    public final ThumbnailButton A06;
    public final ThumbnailButton A07;
    public final RelativeLayout A08;
    public final ShimmerFrameLayout A09;
    public final WaTextView A0A;

    public static /* synthetic */ void getMainDispatcher$annotations() {
    }

    public void A01(AnonymousClass2bV r12) {
        AnonymousClass2bV r3 = r12;
        super.A01(r12);
        C64933Qa r6 = r12.A1J;
        if (r12.A01 == 4) {
            this.A08.setVisibility(8);
            this.A06.setVisibility(8);
            ShimmerFrameLayout shimmerFrameLayout = this.A09;
            shimmerFrameLayout.setVisibility(0);
            shimmerFrameLayout.A05(C53892s4.A00());
            C36341k9.A0q(getContext(), shimmerFrameLayout, R.color.f6nameremoved);
            shimmerFrameLayout.A03();
            return;
        }
        ShimmerFrameLayout shimmerFrameLayout2 = this.A09;
        shimmerFrameLayout2.A04();
        shimmerFrameLayout2.setVisibility(8);
        this.A08.setVisibility(0);
        this.A0A.setText(r12.A05);
        if (r12.A1c() == null) {
            this.A06.setVisibility(8);
        } else {
            AnonymousClass1SV.A06(this.A06, r3, new C53702rk(this, 11), getMessageThumbCache(), r6, 2000, false, false, false);
        }
        C36331k8.A1T(new ReelCarouselItemView$updateProfilePhotoView$1(this, r12, (C023509x) null), C009403z.A02(AnonymousClass19R.A01));
    }

    public final void setFMessageIO(C20690y0 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final void setMainDispatcher(C005502l r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final void setMessageThumbCache(AnonymousClass1SV r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final C20690y0 getFMessageIO() {
        C20690y0 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("fMessageIO");
    }

    public final C005502l getMainDispatcher() {
        C005502l r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("mainDispatcher");
    }

    public final AnonymousClass1SV getMessageThumbCache() {
        AnonymousClass1SV r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("messageThumbCache");
    }

    public C43532Ij(Context context, C89004Uw r5) {
        super(context, r5);
        View.inflate(context, R.layout.f9nameremoved, this);
        this.A08 = (RelativeLayout) C36361kB.A0G(this, R.id.content);
        this.A0A = C36341k9.A0Q(this, R.id.title);
        this.A06 = (ThumbnailButton) C36361kB.A0G(this, R.id.thumb);
        this.A09 = (ShimmerFrameLayout) C36361kB.A0G(this, R.id.shimmer_layout);
        this.A03 = C36341k9.A0Y(this, R.id.selection_view);
        ThumbnailButton thumbnailButton = (ThumbnailButton) C36361kB.A0G(this, R.id.profile_photo);
        this.A07 = thumbnailButton;
        C34081gQ.A04(this, C36441kJ.A00(C36341k9.A0F(this), R.dimen.f7nameremoved));
        C34081gQ.A01(thumbnailButton);
        getOutlineProvider();
    }

    public AnonymousClass1RJ getSelectionView() {
        return this.A03;
    }
}
