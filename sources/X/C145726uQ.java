package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.6uQ  reason: invalid class name and case insensitive filesystem */
public final class C145726uQ implements AnonymousClass4U2 {
    public final int A00;
    public final Context A01;
    public final Drawable A02;
    public final AnonymousClass1PM A03;
    public final C145706uO A04;
    public final AnonymousClass5CN A05;

    public /* synthetic */ void BXH() {
    }

    public void Bi2(Bitmap bitmap, boolean z) {
        AnonymousClass00C.A0D(bitmap, 0);
        AnonymousClass5CN r4 = this.A05;
        Object tag = r4.getTag();
        C145706uO r3 = this.A04;
        if (tag == r3) {
            if (bitmap.equals(C56382wC.A00)) {
                r4.setScaleType(ImageView.ScaleType.CENTER);
                r4.setBackgroundColor(this.A00);
                r4.setImageResource(R.drawable.ic_missing_thumbnail_picture);
            } else {
                r4.setScaleType(r4.getDefaultScaleType());
                r4.setBackgroundResource(0);
                if (!z) {
                    TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{this.A02, C36421kH.A0C(this.A01, bitmap)});
                    transitionDrawable.setCrossFadeEnabled(true);
                    transitionDrawable.startTransition(150);
                    r4.setImageDrawable(transitionDrawable);
                } else {
                    r4.setImageBitmap(bitmap);
                }
            }
            this.A03.A0D(r3.BIB(), bitmap);
        }
    }

    public void B1h() {
        AnonymousClass5CN r1 = this.A05;
        r1.setBackgroundColor(this.A00);
        r1.setImageDrawable((Drawable) null);
    }

    public C145726uQ(AnonymousClass1PM r3, C145706uO r4, AnonymousClass5CN r5) {
        this.A04 = r4;
        this.A05 = r5;
        this.A03 = r3;
        Context A0B = C36371kC.A0B(r5);
        this.A01 = A0B;
        int A002 = AnonymousClass00F.A00(A0B, R.color.f6nameremoved);
        this.A00 = A002;
        this.A02 = new ColorDrawable(A002);
    }
}
