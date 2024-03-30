package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.1pP  reason: invalid class name and case insensitive filesystem */
public class C38621pP extends LinearLayout implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;
    public final ImageView A02;
    public final ImageView A03;
    public final TextView A04;

    public void A00(Drawable drawable, Drawable drawable2, String str) {
        int i;
        this.A04.setText(str);
        this.A03.setImageDrawable(drawable);
        ImageView imageView = this.A02;
        if (drawable2 == null) {
            i = 8;
        } else {
            imageView.setImageDrawable(drawable2);
            i = 0;
        }
        imageView.setVisibility(i);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public void setPreviewScaleType(ImageView.ScaleType scaleType) {
        this.A03.setScaleType(scaleType);
    }

    public C38621pP(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this);
        this.A04 = C36391kE.A0O(this, R.id.wallpaper_category_title);
        this.A03 = C36401kF.A0G(this, R.id.wallpaper_category_preview);
        this.A02 = C36401kF.A0G(this, R.id.wallpaper_category_preview_icon);
    }
}
