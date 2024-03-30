package com.whatsapp.biz.catalog.view;

import X.AnonymousClass190;
import X.AnonymousClass1QZ;
import X.AnonymousClass9ED;
import X.AnonymousClass9HG;
import X.AnonymousClass9Y1;
import X.C011504z;
import X.C18700tb;
import X.C18800tq;
import X.C18820ts;
import X.C196089Xp;
import X.C19770wU;
import X.C207269up;
import X.C36341k9;
import X.C36351kA;
import X.C36391kE;
import X.C36441kJ;
import X.C40731w1;
import X.C594033u;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.jid.UserJid;

public class CatalogCarouselDetailImageView extends FrameLayout implements C18700tb {
    public RecyclerView A00;
    public C207269up A01;
    public AnonymousClass9Y1 A02;
    public C196089Xp A03;
    public CarouselScrollbarView A04;
    public C40731w1 A05;
    public C18820ts A06;
    public AnonymousClass190 A07;
    public UserJid A08;
    public C19770wU A09;
    public AnonymousClass1QZ A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;

    public CatalogCarouselDetailImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: private */
    public AnonymousClass9HG getImageLoadContext() {
        UserJid userJid = this.A08;
        if (userJid != null) {
            return new AnonymousClass9HG(new AnonymousClass9ED(897460107), userJid);
        }
        return null;
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A0A;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A0A = r0;
        }
        return r0.generatedComponent();
    }

    /* access modifiers changed from: private */
    public void setImageAndGradient(C594033u r4, boolean z, ThumbnailButton thumbnailButton, Bitmap bitmap, View view) {
        GradientDrawable.Orientation orientation;
        int[] A1O = C36441kJ.A1O();
        A1O[0] = r4.A01;
        A1O[1] = r4.A00;
        if (z) {
            orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        } else {
            orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        }
        C011504z.A04(new GradientDrawable(orientation, A1O), view);
        thumbnailButton.setImageBitmap(bitmap);
    }

    public CatalogCarouselDetailImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A0B) {
            this.A0B = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A09 = C36341k9.A0Z(A0W);
            this.A07 = C36351kA.A0h(A0W);
            this.A02 = (AnonymousClass9Y1) A0W.A1R.get();
            this.A06 = C36341k9.A0T(A0W);
        }
    }

    public CatalogCarouselDetailImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
