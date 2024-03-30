package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: X.6pd  reason: invalid class name and case insensitive filesystem */
public class C142886pd implements C160797lb {
    public final Drawable A00;
    public final Drawable A01;
    public final C160197kc A02;
    public final String A03;
    public final int A04;
    public final int A05;
    public final String A06;
    public final WeakReference A07;

    public boolean B7A() {
        return false;
    }

    public Integer BEi() {
        return null;
    }

    public ImageView BCZ() {
        WeakReference weakReference = this.A07;
        if (weakReference != null) {
            return (ImageView) weakReference.get();
        }
        return null;
    }

    public C142886pd(Drawable drawable, Drawable drawable2, ImageView imageView, C160197kc r5, String str, String str2, int i, int i2) {
        WeakReference weakReference;
        if (imageView != null) {
            weakReference = AnonymousClass001.A0F(imageView);
        } else {
            weakReference = null;
        }
        this.A07 = weakReference;
        this.A03 = str;
        this.A06 = str2;
        this.A01 = drawable;
        this.A00 = drawable2;
        this.A05 = i;
        this.A04 = i2;
        this.A02 = r5;
    }

    public int BDs() {
        return this.A04;
    }

    public int BDv() {
        return this.A05;
    }

    public String BIk() {
        return this.A03;
    }

    public String getId() {
        return this.A06;
    }
}
