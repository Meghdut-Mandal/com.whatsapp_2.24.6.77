package X;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.whatsapp.R;

/* renamed from: X.4oE  reason: invalid class name and case insensitive filesystem */
public class C96994oE extends AnonymousClass0D3 {
    public final View A00;
    public final ImageView A01;
    public final ImageView A02;
    public final ProgressBar A03;
    public final C29971Ys A04;
    public final C29931Yo A05;

    public void A0B(C1262563e r7) {
        ImageView imageView;
        this.A03.setVisibility(8);
        C135106c9 r4 = r7.A03;
        if (r4 == null) {
            imageView = this.A01;
            imageView.setImageResource(R.drawable.payment_default_background);
            imageView.setBackgroundColor(0);
        } else {
            String str = r4.A01;
            if (!TextUtils.isEmpty(str)) {
                this.A01.setContentDescription(str);
            }
            imageView = this.A01;
            imageView.setBackgroundColor(r4.A0A);
            imageView.setImageDrawable((Drawable) null);
            if (r7.A01) {
                this.A02.setVisibility(0);
                imageView.setTag(R.id.expressive_background_theme_list_item_metadata, r4);
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (r4 != null && r7.A00) {
                    this.A04.A00(imageView, r4, layoutParams.width, layoutParams.height);
                }
                this.A00.setVisibility(C90514aH.A0A(r7.A02 ? 1 : 0));
            }
        }
        this.A02.setVisibility(8);
        imageView.setTag(R.id.expressive_background_theme_list_item_metadata, r4);
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        this.A04.A00(imageView, r4, layoutParams2.width, layoutParams2.height);
        this.A00.setVisibility(C90514aH.A0A(r7.A02 ? 1 : 0));
    }

    public C96994oE(View view, C29971Ys r3, C29931Yo r4) {
        super(view);
        this.A01 = C36401kF.A0G(view, R.id.background_theme);
        this.A00 = C012005e.A02(view, R.id.payment_background_selection);
        this.A02 = C36401kF.A0G(view, R.id.retry_download_icon);
        this.A03 = (ProgressBar) C012005e.A02(view, R.id.asset_download_progress);
        this.A05 = r4;
        this.A04 = r3;
    }
}
