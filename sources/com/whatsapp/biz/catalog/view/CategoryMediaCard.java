package com.whatsapp.biz.catalog.view;

import X.AnonymousClass00C;
import X.AnonymousClass0D3;
import X.AnonymousClass1JZ;
import X.AnonymousClass6C7;
import X.C011004s;
import X.C05250Oz;
import X.C102314zj;
import X.C119065pB;
import X.C128506Cn;
import X.C142996po;
import X.C143026pr;
import X.C18820ts;
import X.C36321k7;
import X.C36341k9;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36421kH;
import X.C93114fm;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.whatsapp.InfoCard;
import com.whatsapp.R;
import com.whatsapp.components.button.ThumbnailButton;
import java.util.Iterator;
import java.util.List;

public final class CategoryMediaCard extends InfoCard {
    public HorizontalScrollView A00;
    public C18820ts A01;
    public LinearLayout A02;
    public boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CategoryMediaCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        A01();
        LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this, true);
        this.A02 = (LinearLayout) C36361kB.A0G(this, R.id.media_card_thumbs);
        this.A00 = (HorizontalScrollView) C36361kB.A0G(this, R.id.media_card_scroller);
    }

    public final void setMediaScroller(HorizontalScrollView horizontalScrollView) {
        AnonymousClass00C.A0D(horizontalScrollView, 0);
        this.A00 = horizontalScrollView;
    }

    public final void setMediaThumbs(LinearLayout linearLayout) {
        AnonymousClass00C.A0D(linearLayout, 0);
        this.A02 = linearLayout;
    }

    public final void setWhatsAppLocale(C18820ts r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setup(List list, AnonymousClass6C7 r6) {
        AnonymousClass00C.A0D(list, 0);
        if (list.isEmpty()) {
            this.A00.setVisibility(8);
            return;
        }
        this.A02.removeAllViews();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.A02.addView(A00((AnonymousClass6C7) it.next()));
        }
        if (r6 != null) {
            C93114fm A002 = A00(r6);
            C36361kB.A0G(A002, R.id.category_thumbnail_text_bg).setVisibility(8);
            this.A02.addView(A002);
        }
        AnonymousClass1JZ.A0A(this.A00, getWhatsAppLocale());
        this.A00.setVisibility(0);
    }

    public void A01() {
        if (!this.A03) {
            this.A03 = true;
            this.A01 = C36341k9.A0U(generatedComponent());
        }
    }

    public final C18820ts getWhatsAppLocale() {
        C18820ts r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A09();
    }

    private final C93114fm A00(AnonymousClass6C7 r11) {
        C93114fm r3 = new C93114fm(C36371kC.A0B(this));
        ThumbnailButton thumbnailButton = (ThumbnailButton) C36361kB.A0G(r3, R.id.category_thumbnail_image);
        thumbnailButton.setScaleType(ImageView.ScaleType.CENTER_CROP);
        thumbnailButton.A01 = getResources().getDimension(R.dimen.f7nameremoved);
        C011004s.A08(thumbnailButton, (String) null);
        r3.setText(r11.A03);
        Drawable drawable = r11.A00;
        if (drawable != null) {
            thumbnailButton.setImageDrawable(drawable);
        }
        C36421kH.A10(r3, r11, 36);
        C119065pB r1 = r11.A02;
        if (r1 != null) {
            C128506Cn r2 = r1.A00;
            thumbnailButton.setTag(r2.A01);
            C102314zj r12 = r1.A01;
            List list = AnonymousClass0D3.A0I;
            r12.A00.A02(thumbnailButton, r2.A00, new C142996po(thumbnailButton), new C143026pr(thumbnailButton), 2);
        }
        return r3;
    }

    public final HorizontalScrollView getMediaScroller() {
        return this.A00;
    }

    public final LinearLayout getMediaThumbs() {
        return this.A02;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CategoryMediaCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AnonymousClass00C.A0D(context, 1);
    }

    public /* synthetic */ CategoryMediaCard(Context context, AttributeSet attributeSet, int i, int i2, C05250Oz r7) {
        this(context, C36381kD.A0I(attributeSet, i2), C36391kE.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CategoryMediaCard(Context context) {
        this(context, (AttributeSet) null, 0);
        AnonymousClass00C.A0D(context, 1);
    }
}
