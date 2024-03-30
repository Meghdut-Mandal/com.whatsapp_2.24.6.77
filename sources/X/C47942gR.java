package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.GridView;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.biz.catalog.view.CatalogMediaCard;
import com.whatsapp.biz.linkedaccounts.LinkedAccountsMediaCard;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.ui.media.MediaCard;
import com.whatsapp.ui.media.MediaCardGrid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2gR  reason: invalid class name and case insensitive filesystem */
public abstract class C47942gR extends AnonymousClass22p {
    public HorizontalScrollView A00;
    public ImageView A01;
    public C18820ts A02;
    public View A03;
    public ImageView A04;
    public LinearLayout A05;
    public RelativeLayout A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public TextView A0A;
    public AnonymousClass4SB A0B;
    public TextView A0C;

    public static void A00(AnonymousClass4SB r1) {
        AnonymousClass00C.A0D(r1, 0);
        r1.BTn();
    }

    public AnonymousClass2FY A02(ViewGroup.LayoutParams layoutParams, AnonymousClass3A6 r13, int i) {
        int i2;
        C55872vK r9;
        C89514Wv r8;
        C206759tv r7;
        C196169Xz r5;
        AnonymousClass00C.A0D(r13, 0);
        AnonymousClass2FY r6 = new AnonymousClass2FY(getContext());
        C36411kG.A1D(r6);
        r6.setLayoutParams(layoutParams);
        r6.A00 = (float) (i / 6);
        r6.A03 = getThumbnailTextGravity();
        r6.A01 = getThumbnailIconGravity();
        String str = r13.A04;
        if (str != null) {
            r6.A05 = str;
        }
        String str2 = r13.A03;
        if (str2 != null) {
            r6.setContentDescription(str2);
        }
        Drawable drawable = r13.A00;
        if (drawable != null) {
            r6.A04 = drawable;
        }
        AnonymousClass3Y9.A00(r6, r13, 9);
        C011004s.A08(r6, r13.A05);
        AnonymousClass4ZA r52 = (AnonymousClass4ZA) r13.A02;
        switch (r52.A02) {
            case 0:
                CatalogMediaCard catalogMediaCard = (CatalogMediaCard) r52.A00;
                C207269up r1 = (C207269up) r52.A01;
                if (!r1.A02()) {
                    r6.setTag(r1.A0F);
                    catalogMediaCard.A03.A02(r6, (C206759tv) C36391kE.A0t(r1.A07), new C89514Wv(r6, 1), new C55872vK(r6, 1), 2);
                    return r6;
                }
                C53332r9.A00(r6);
                return r6;
            case 1:
                r7 = (C206759tv) r52.A01;
                r6.setTag(r7.A04);
                r5 = ((LinkedAccountsMediaCard) r52.A00).A04;
                r9 = new C55872vK(r6, 3);
                i2 = 2;
                r8 = new C89514Wv(r6, 2);
                break;
            case 2:
                r7 = (C206759tv) r52.A00;
                r6.setTag(r7.A04);
                r5 = ((C39671tD) r52.A01).A03;
                i2 = 2;
                r9 = new C55872vK(r6, 4);
                r8 = new C89514Wv(r6, 3);
                break;
            default:
                AnonymousClass3HB r4 = (AnonymousClass3HB) r52.A01;
                r4.A0B.A0C(r6, (AnonymousClass3T1) r52.A00, new C53752rp(r4, i, 0));
                return r6;
        }
        r5.A01(r6, r7, r8, r9, i2);
        return r6;
    }

    public final void A08(List list, int i) {
        AnonymousClass00C.A0D(list, 0);
        if (list.isEmpty()) {
            A03();
            return;
        }
        A04();
        int thumbnailPixelSize = getThumbnailPixelSize();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(thumbnailPixelSize, thumbnailPixelSize);
        layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        if (this.A01 == null) {
            ImageView A0L = C36361kB.A0L(this);
            this.A01 = A0L;
            A0L.setLayoutParams(layoutParams);
            C36331k8.A0q(A0L.getContext(), A0L, R.string.f12nameremoved);
            C36441kJ.A1D(A0L);
            A0L.setBackgroundResource(R.drawable.selector_orange_gradient);
            A0L.setImageDrawable(AnonymousClass3UF.A04(getContext(), new C100744vb(AnonymousClass00E.A00(getContext(), R.drawable.group_info_chevron_right), getWhatsAppLocale()), R.color.f6nameremoved));
            AnonymousClass4SB r1 = this.A0B;
            if (r1 != null) {
                AnonymousClass3Y9.A00(A0L, r1, 13);
            }
        }
        if (this instanceof MediaCardGrid) {
            MediaCardGrid mediaCardGrid = (MediaCardGrid) this;
            ArrayList arrayList = mediaCardGrid.A02;
            arrayList.clear();
            int size = list.size();
            if (size > i) {
                size = i;
            }
            for (int i2 = 0; i2 < size; i2++) {
                AnonymousClass2FY A022 = mediaCardGrid.A02(new AbsListView.LayoutParams(thumbnailPixelSize, thumbnailPixelSize), (AnonymousClass3A6) list.get(i2), thumbnailPixelSize);
                A022.A01 = mediaCardGrid.getResources().getDimension(R.dimen.f7nameremoved);
                arrayList.add(A022);
            }
            if (mediaCardGrid.A01 == null) {
                C37881nM r12 = new C37881nM(arrayList);
                mediaCardGrid.A01 = r12;
                GridView gridView = mediaCardGrid.A00;
                if (gridView != null) {
                    gridView.setAdapter(r12);
                }
            }
            C37881nM r0 = mediaCardGrid.A01;
            if (r0 != null) {
                r0.notifyDataSetChanged();
                return;
            }
            return;
        }
        MediaCard mediaCard = (MediaCard) this;
        LinearLayout linearLayout = mediaCard.A00;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                linearLayout.addView(mediaCard.A02(layoutParams, (AnonymousClass3A6) it.next(), thumbnailPixelSize));
            }
            HorizontalScrollView horizontalScrollView = mediaCard.A00;
            if (horizontalScrollView != null) {
                AnonymousClass1JZ.A0A(horizontalScrollView, mediaCard.getWhatsAppLocale());
            }
            if (list.size() >= i) {
                linearLayout.addView(mediaCard.A01);
            }
            HorizontalScrollView horizontalScrollView2 = mediaCard.A00;
            if (horizontalScrollView2 != null) {
                horizontalScrollView2.setVisibility(0);
            }
        }
    }

    public int getThumbnailIconGravity() {
        return 3;
    }

    public abstract int getThumbnailPixelSize();

    public int getThumbnailTextGravity() {
        return 5;
    }

    public final void setSeeMoreClickListener(AnonymousClass4SB r3) {
        AnonymousClass00C.A0D(r3, 0);
        this.A0B = r3;
        ImageView imageView = this.A01;
        if (imageView != null) {
            AnonymousClass3Y9.A00(imageView, r3, 11);
        }
        TextView textView = this.A0A;
        if (textView != null) {
            AnonymousClass3Y9.A00(textView, r3, 15);
        }
        TextView textView2 = this.A09;
        if (textView2 != null) {
            AnonymousClass3Y9.A00(textView2, r3, 10);
        }
        TextView textView3 = this.A08;
        if (textView3 != null) {
            AnonymousClass3Y9.A00(textView3, r3, 14);
        }
        TextView textView4 = this.A07;
        if (textView4 != null) {
            AnonymousClass3Y9.A00(textView4, r3, 12);
        }
    }

    public final void setWhatsAppLocale(C18820ts r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public void A03() {
        C36361kB.A14(this.A05);
        int A042 = C36411kG.A04(this.A03);
        RelativeLayout relativeLayout = this.A06;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(A042);
        }
        TextView textView = this.A0C;
        if (textView != null) {
            textView.setVisibility(A042);
        }
    }

    public void A04() {
        int A042 = C36411kG.A04(this.A05);
        View view = this.A03;
        if (view != null) {
            view.setVisibility(0);
        }
        RelativeLayout relativeLayout = this.A06;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        TextView textView = this.A0C;
        if (textView != null) {
            textView.setVisibility(A042);
        }
    }

    public void A05(int i, int i2) {
        View view = this.A03;
        if (view != null) {
            if (i < 0) {
                i = view.getPaddingLeft();
            }
            if (i2 < 0) {
                i2 = view.getPaddingRight();
            }
            C36381kD.A19(view, i, i2);
            TextView textView = this.A0C;
            if (textView != null) {
                C36381kD.A19(textView, i, i2);
            }
        }
    }

    public void A07(View.OnClickListener onClickListener, int i) {
        if (this instanceof MediaCardGrid) {
            MediaCardGrid mediaCardGrid = (MediaCardGrid) this;
            ArrayList arrayList = mediaCardGrid.A02;
            arrayList.clear();
            for (int i2 = 0; i2 < i; i2++) {
                int thumbnailPixelSize = mediaCardGrid.getThumbnailPixelSize();
                AbsListView.LayoutParams layoutParams = new AbsListView.LayoutParams(thumbnailPixelSize, thumbnailPixelSize);
                ThumbnailButton thumbnailButton = new ThumbnailButton(mediaCardGrid.getContext());
                thumbnailButton.setBackgroundResource(R.drawable.catalog_product_placeholder_background);
                thumbnailButton.setLayoutParams(layoutParams);
                thumbnailButton.A01 = mediaCardGrid.getResources().getDimension(R.dimen.f7nameremoved);
                arrayList.add(thumbnailButton);
            }
            C37881nM r1 = new C37881nM(arrayList);
            mediaCardGrid.A01 = r1;
            GridView gridView = mediaCardGrid.A00;
            if (gridView != null) {
                gridView.setAdapter(r1);
                return;
            }
            return;
        }
        MediaCard mediaCard = (MediaCard) this;
        int thumbnailPixelSize2 = mediaCard.getThumbnailPixelSize();
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(thumbnailPixelSize2, thumbnailPixelSize2);
        int dimensionPixelSize = mediaCard.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        layoutParams2.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        for (int i3 = 0; i3 < i; i3++) {
            LinearLayout linearLayout = mediaCard.A00;
            if (linearLayout != null) {
                ThumbnailButton thumbnailButton2 = new ThumbnailButton(mediaCard.getContext());
                thumbnailButton2.setBackgroundResource(R.drawable.catalog_product_placeholder_background);
                thumbnailButton2.setLayoutParams(layoutParams2);
                if (onClickListener != null) {
                    thumbnailButton2.setOnClickListener(onClickListener);
                }
                linearLayout.addView(thumbnailButton2);
            }
        }
        HorizontalScrollView horizontalScrollView = mediaCard.A00;
        if (horizontalScrollView != null) {
            horizontalScrollView.setVisibility(0);
        }
    }

    public String getError() {
        TextView textView = this.A0C;
        boolean z = false;
        if (textView != null && textView.getVisibility() == 0) {
            z = true;
        }
        CharSequence charSequence = null;
        if (!z) {
            return null;
        }
        TextView textView2 = this.A0C;
        if (textView2 != null) {
            charSequence = textView2.getText();
        }
        return String.valueOf(charSequence);
    }

    public final C18820ts getWhatsAppLocale() {
        C18820ts r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A09();
    }

    public final void setCatalogBrandingDrawable(Drawable drawable) {
        ImageView imageView = this.A04;
        if (imageView != null) {
            int i = 8;
            if (drawable != null) {
                i = 0;
            }
            imageView.setVisibility(i);
        }
        ImageView imageView2 = this.A04;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setError(String str) {
        TextView textView = this.A0C;
        if (textView != null) {
            textView.setText(str);
            textView.setVisibility(0);
        }
    }

    public final void setMediaInfo(String str) {
        TextView textView = this.A09;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.A07;
        if (textView2 != null) {
            textView2.setText(str);
        }
        if (str != null && str.length() != 0) {
            TextView textView3 = this.A09;
            if (textView3 != null) {
                AnonymousClass1JZ.A0B(textView3, getWhatsAppLocale(), R.drawable.vec_ic_chevron_right_wds);
            }
            TextView textView4 = this.A07;
            if (textView4 != null) {
                AnonymousClass1JZ.A0B(textView4, getWhatsAppLocale(), R.drawable.vec_ic_chevron_right_wds);
            }
        }
    }

    public final void setSeeMoreColor(int i) {
        TextView textView = this.A09;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public final void setTitle(String str) {
        TextView textView = this.A0A;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.A08;
        if (textView2 != null) {
            textView2.setText(str);
        }
    }

    public final void setTitleTextColor(int i) {
        TextView textView = this.A0A;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public C47942gR(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A06(attributeSet);
    }

    /* JADX INFO: finally extract failed */
    public void A06(AttributeSet attributeSet) {
        C36351kA.A0C(this).inflate(R.layout.f9nameremoved, this, true);
        this.A0A = C36391kE.A0O(this, R.id.media_card_title);
        this.A08 = C36391kE.A0O(this, R.id.media_card_empty_title);
        this.A09 = C36391kE.A0O(this, R.id.media_card_info);
        this.A07 = C36391kE.A0O(this, R.id.media_card_empty_info);
        this.A03 = C012005e.A02(this, R.id.title_container);
        this.A00 = (HorizontalScrollView) C012005e.A02(this, R.id.media_card_scroller);
        this.A0C = C36391kE.A0O(this, R.id.media_card_error);
        this.A06 = (RelativeLayout) C012005e.A02(this, R.id.media_card_thumb_container);
        this.A05 = (LinearLayout) C012005e.A02(this, R.id.media_card_empty);
        this.A04 = C36401kF.A0G(this, R.id.branding_img);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = C36361kB.A09(this).obtainStyledAttributes(attributeSet, C56692wj.A00, 0, 0);
            AnonymousClass00C.A08(obtainStyledAttributes);
            try {
                String A0F = getWhatsAppLocale().A0F(obtainStyledAttributes, 1);
                String A0F2 = getWhatsAppLocale().A0F(obtainStyledAttributes, 0);
                obtainStyledAttributes.recycle();
                TextView textView = this.A0A;
                if (textView != null) {
                    textView.setText(A0F);
                    C012005e.A0a(textView, true);
                }
                TextView textView2 = this.A08;
                if (textView2 != null) {
                    textView2.setText(A0F);
                }
                setMediaInfo(A0F2);
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
    }

    public final void setTopShadowVisibility(int i) {
        int i2;
        int paddingLeft = getPaddingLeft();
        if (i == 0) {
            i2 = C36341k9.A0F(this).getDimensionPixelSize(R.dimen.f7nameremoved);
        } else {
            i2 = 0;
        }
        C36341k9.A0z(this, paddingLeft, i2);
    }
}
