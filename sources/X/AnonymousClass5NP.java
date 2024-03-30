package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import android.view.View;
import com.whatsapp.WaImageView;
import java.io.File;

/* renamed from: X.5NP  reason: invalid class name */
public final class AnonymousClass5NP extends C65083Qq {
    public Bitmap A00;
    public C91334bq A01;
    public WaImageView A02;
    public C21656ATx A03;

    public void A0V(boolean z) {
    }

    public boolean A0Z() {
        return false;
    }

    public int A04() {
        throw AnonymousClass001.A0E("not implemented yet");
    }

    public int A05() {
        return this.A03.A00.getDuration();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003a, code lost:
        if (r0 != null) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap A07() {
        /*
            r5 = this;
            X.4bq r0 = r5.A01
            android.graphics.drawable.Drawable r4 = r0.getCurrent()
            X.AnonymousClass00C.A08(r4)
            boolean r0 = r4 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L_0x0014
            android.graphics.drawable.BitmapDrawable r4 = (android.graphics.drawable.BitmapDrawable) r4
            android.graphics.Bitmap r0 = r4.getBitmap()
            return r0
        L_0x0014:
            android.graphics.Bitmap r0 = r5.A00
            r3 = 0
            if (r0 == 0) goto L_0x0051
            boolean r1 = r0.isRecycled()
        L_0x001d:
            android.graphics.Bitmap r0 = r5.A00
            if (r0 == 0) goto L_0x0023
            if (r1 == 0) goto L_0x003c
        L_0x0023:
            int r0 = r4.getIntrinsicWidth()
            r2 = 1
            int r1 = java.lang.Math.max(r0, r2)
            int r0 = r4.getIntrinsicHeight()
            int r0 = java.lang.Math.max(r0, r2)
            android.graphics.Bitmap r0 = X.C90524aI.A09(r1, r0)
            r5.A00 = r0
            if (r0 == 0) goto L_0x004e
        L_0x003c:
            android.graphics.Canvas r0 = X.C90524aI.A0A(r0)
            r4.draw(r0)
            int r1 = r0.getWidth()
            int r0 = r0.getHeight()
            r4.setBounds(r3, r3, r1, r0)
        L_0x004e:
            android.graphics.Bitmap r0 = r5.A00
            return r0
        L_0x0051:
            r1 = 0
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5NP.A07():android.graphics.Bitmap");
    }

    public void A0A() {
        this.A01.stop();
    }

    public void A0C() {
        this.A01.start();
    }

    public void A0D() {
        this.A03.close();
        this.A01.stop();
    }

    public void A0L(int i) {
        throw AnonymousClass001.A0E("not implemented yet");
    }

    public boolean A0X() {
        return this.A01.isRunning();
    }

    public boolean A0Y() {
        throw AnonymousClass001.A0E("not implemented yet");
    }

    public AnonymousClass5NP(Context context, File file) {
        AnonymousClass9WW r0 = C21656ATx.A04;
        C21656ATx A012 = C21656ATx.A01(ParcelFileDescriptor.open(file, 268435456), false);
        this.A03 = A012;
        C91334bq A06 = A012.A06(context);
        AnonymousClass00C.A08(A06);
        this.A01 = A06;
        WaImageView waImageView = new WaImageView(context);
        waImageView.setImageDrawable(this.A01);
        this.A02 = waImageView;
    }

    public View A08() {
        return this.A02;
    }
}
