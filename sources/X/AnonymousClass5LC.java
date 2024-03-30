package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.whatsapp.R;
import com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment;
import java.util.List;

/* renamed from: X.5LC  reason: invalid class name */
public class AnonymousClass5LC extends C96124mp {
    public Drawable.ConstantState A00;
    public final /* synthetic */ StickerStoreFeaturedTabFragment A01;

    public AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        if (i != 1) {
            return super.BUw(viewGroup, i);
        }
        StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = this.A01;
        return new C96604nb(C36361kB.A0E(stickerStoreFeaturedTabFragment.A0J, viewGroup, R.layout.f9nameremoved), stickerStoreFeaturedTabFragment);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5LC(StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment, List list) {
        super(stickerStoreFeaturedTabFragment, list);
        this.A01 = stickerStoreFeaturedTabFragment;
    }

    public int A0J() {
        int A06 = C36371kC.A06(this.A00);
        if (A06 <= 0 || !StickerStoreFeaturedTabFragment.A03(this.A01)) {
            return A06;
        }
        return A06 + 1;
    }

    public int getItemViewType(int i) {
        if (i != 0 || !StickerStoreFeaturedTabFragment.A03(this.A01)) {
            return 0;
        }
        return 1;
    }

    public void BSE(AnonymousClass0D3 r9, int i) {
        Drawable.ConstantState constantState;
        View view;
        if (getItemViewType(i) == 0) {
            C96934o8 r92 = (C96934o8) r9;
            StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = this.A01;
            if (StickerStoreFeaturedTabFragment.A03(stickerStoreFeaturedTabFragment)) {
                i--;
            }
            super.BSE(r92, i);
            AnonymousClass68B r4 = (AnonymousClass68B) this.A00.get(i);
            int i2 = 8;
            C36421kH.A0v(r92.A04, r4.A0N ? 1 : 0, 0, 8);
            if (r4.A01()) {
                r92.A03.setVisibility(0);
                r92.A05.setVisibility(8);
                r92.A08.setVisibility(8);
                r92.A06.setVisibility(8);
                if (r4.A06) {
                    r92.A0F.setVisibility(4);
                    view = r92.A09;
                } else {
                    r92.A09.setVisibility(4);
                    view = r92.A0F;
                }
                view.setVisibility(0);
            } else if (r4.A06) {
                r92.A05.setVisibility(8);
                r92.A03.setVisibility(4);
                ProgressBar progressBar = r92.A08;
                progressBar.setVisibility(0);
                progressBar.setIndeterminate(true);
            } else if (r4.A03 != null) {
                ImageView imageView = r92.A05;
                imageView.setVisibility(0);
                imageView.setImageResource(R.drawable.countrypicker_checkmark);
                imageView.setOnClickListener((View.OnClickListener) null);
                C36421kH.A0z(imageView, stickerStoreFeaturedTabFragment, R.string.f12nameremoved);
                imageView.setClickable(false);
                imageView.setFocusable(true);
                if (this.A00 == null) {
                    this.A00 = imageView.getBackground().mutate().getConstantState();
                }
                imageView.setBackgroundResource(0);
                r92.A08.setVisibility(8);
                r92.A03.setVisibility(4);
            } else {
                r92.A03.setVisibility(4);
                ImageView imageView2 = r92.A05;
                imageView2.setVisibility(0);
                r92.A08.setVisibility(8);
                imageView2.setImageResource(R.drawable.sticker_store_download);
                if (imageView2.getBackground() == null && (constantState = this.A00) != null) {
                    C011504z.A04(constantState.newDrawable(C36341k9.A0G(stickerStoreFeaturedTabFragment)), imageView2);
                }
                C36421kH.A0z(imageView2, stickerStoreFeaturedTabFragment, R.string.f12nameremoved);
                C48902iF.A00(imageView2, this, r4, 34);
            }
            View view2 = r92.A02;
            if (!r4.A06 && r4.A03 == null && r4.A07) {
                i2 = 0;
            }
            view2.setVisibility(i2);
        }
    }
}
