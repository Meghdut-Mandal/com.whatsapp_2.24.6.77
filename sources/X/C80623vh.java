package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.3vh  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C80623vh implements Runnable {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ AnonymousClass2bU A01;
    public final /* synthetic */ AnonymousClass39Z A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ C80623vh(ImageView imageView, AnonymousClass2bU r2, AnonymousClass39Z r3, boolean z, boolean z2) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = imageView;
        this.A03 = z;
        this.A04 = z2;
    }

    public final void run() {
        AnonymousClass39Z r5 = this.A02;
        AnonymousClass2bU r6 = this.A01;
        ImageView imageView = this.A00;
        boolean z = this.A03;
        boolean z2 = this.A04;
        AnonymousClass1SV r1 = r5.A03;
        C79253tQ r0 = r5.A00;
        if (z) {
            r1.A0C(imageView, r6, r0);
        } else {
            r1.A0D(imageView, r6, r0);
        }
        if (!z2) {
            return;
        }
        if (imageView.getDrawable().getIntrinsicWidth() != imageView.getMeasuredWidth() || imageView.getDrawable().getIntrinsicHeight() != imageView.getMeasuredHeight()) {
            Drawable drawable = imageView.getDrawable();
            AnonymousClass00C.A08(drawable);
            r5.A04.Boy(new AnonymousClass737(imageView, C05370Pl.A00(drawable, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()), r5, 15));
        }
    }
}
