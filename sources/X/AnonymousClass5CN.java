package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.whatsapp.R;
import java.util.HashSet;

/* renamed from: X.5CN  reason: invalid class name */
public class AnonymousClass5CN extends C45932Tg {
    public int A00;
    public int A01;
    public ValueAnimator A02;
    public Drawable A03;
    public Drawable A04;
    public C96534nU A05;
    public AnonymousClass6QO A06;
    public C124985z8 A07;
    public HashSet A08;
    public final Paint A09;
    public final Matrix A0A = C90524aI.A0B();
    public final ImageView.ScaleType A0B;

    public AnonymousClass5CN(Context context, C124985z8 r6, HashSet hashSet, int i) {
        super(context);
        Paint A0K = C36441kJ.A0K();
        this.A09 = A0K;
        this.A08 = C36441kJ.A16();
        this.A0B = ImageView.ScaleType.CENTER_CROP;
        setScaleType(getDefaultScaleType());
        this.A07 = r6;
        this.A08 = hashSet;
        this.A01 = i;
        C36381kD.A16(context, A0K, C224514j.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved));
        A0K.setStrokeWidth(C36441kJ.A00(context.getResources(), R.dimen.f7nameremoved));
        C36421kH.A0q(A0K);
        A0K.setAntiAlias(true);
        setId(R.id.thumb);
        this.A00 = getResources().getColor(R.color.f6nameremoved);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r12) {
        /*
            r11 = this;
            r0 = 0
            r5 = r12
            X.AnonymousClass00C.A0D(r12, r0)
            X.5z8 r0 = r11.A07
            if (r0 == 0) goto L_0x000d
            android.view.View r0 = r0.A06
            if (r0 == r11) goto L_0x00b0
        L_0x000d:
            java.util.HashSet r1 = r11.A08
            X.6QO r0 = r11.A06
            boolean r1 = X.C007103b.A0j(r1, r0)
            r0 = 1
            if (r1 == r0) goto L_0x00b0
            r12.save()
            X.6QO r0 = r11.A06
            if (r0 == 0) goto L_0x003a
            int r0 = r0.A02()
            if (r0 == 0) goto L_0x003a
            android.graphics.Matrix r3 = r11.A0A
            float r2 = (float) r0
            int r0 = r11.getWidth()
            int r0 = r0 / 2
            float r1 = (float) r0
            int r0 = X.C36441kJ.A07(r11)
            float r0 = (float) r0
            r3.setRotate(r2, r1, r0)
            r12.concat(r3)
        L_0x003a:
            super.onDraw(r12)
            r12.restore()
            android.graphics.drawable.Drawable r0 = r11.A04
            if (r0 == 0) goto L_0x00b1
            android.animation.ValueAnimator r0 = r11.A02
            if (r0 != 0) goto L_0x0062
            int[] r0 = X.C36441kJ.A1O()
            r0 = {0, 255} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofInt(r0)
            r0 = 300(0x12c, double:1.48E-321)
            r2.setDuration(r0)
            r0 = 22
            X.C111565cU.A00(r2, r11, r0)
            r2.start()
            r11.A02 = r2
        L_0x0062:
            android.graphics.drawable.Drawable r4 = r11.A04
            if (r4 == 0) goto L_0x0091
            int r1 = r11.getHeight()
            int r0 = r4.getIntrinsicHeight()
            int r1 = r1 - r0
            int r3 = r1 / 2
            int r1 = r11.getWidth()
            int r0 = r4.getIntrinsicWidth()
            int r1 = r1 - r0
            int r2 = r1 / 2
            int r0 = r11.A00
            r12.drawColor(r0)
            int r1 = r4.getIntrinsicWidth()
            int r1 = r1 + r2
            int r0 = r4.getIntrinsicHeight()
            int r0 = r0 + r3
            r4.setBounds(r2, r3, r1, r0)
        L_0x008e:
            r4.draw(r12)
        L_0x0091:
            boolean r0 = r11.isPressed()
            if (r0 != 0) goto L_0x009d
            boolean r0 = r11.isSelected()
            if (r0 == 0) goto L_0x00b0
        L_0x009d:
            boolean r0 = r11 instanceof X.AnonymousClass5CM
            if (r0 != 0) goto L_0x00b0
            float r8 = X.C36441kJ.A01(r11)
            float r9 = X.C36441kJ.A02(r11)
            android.graphics.Paint r10 = r11.A09
            r6 = 0
            r7 = 0
            r5.drawRect(r6, r7, r8, r9, r10)
        L_0x00b0:
            return
        L_0x00b1:
            android.graphics.drawable.Drawable r4 = r11.A03
            if (r4 == 0) goto L_0x0091
            int r0 = r4.getIntrinsicHeight()
            int r3 = r0 / 4
            int r2 = r11.getHeight()
            int r0 = r4.getIntrinsicHeight()
            int r2 = r2 - r0
            int r2 = r2 - r3
            int r1 = r4.getIntrinsicWidth()
            int r1 = r1 + r3
            int r0 = r11.getHeight()
            int r0 = r0 - r3
            r4.setBounds(r3, r2, r1, r0)
            int r0 = r11.A00
            r12.drawColor(r0)
            goto L_0x008e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5CN.onDraw(android.graphics.Canvas):void");
    }

    public final void setItem(AnonymousClass6QO r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A06 = r2;
    }

    public final void setViewHolder(C96534nU r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A05 = r2;
    }

    public Uri getUri() {
        AnonymousClass6QO r0 = this.A06;
        if (r0 != null) {
            return r0.A0J;
        }
        return null;
    }

    public void onMeasure(int i, int i2) {
        int i3 = this.A01;
        setMeasuredDimension(i3, i3);
    }

    public final void setCustomId(Integer num) {
        int i;
        if (num != null) {
            i = num.intValue();
        } else {
            i = R.id.thumb;
        }
        setId(i);
    }

    public final void setOverlayIcon(Drawable drawable) {
        ValueAnimator valueAnimator = this.A02;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        this.A02 = null;
        if (drawable != null) {
            drawable.setAlpha(0);
        } else {
            drawable = null;
        }
        this.A04 = drawable;
    }

    public ImageView.ScaleType getDefaultScaleType() {
        return this.A0B;
    }

    public final int getThumbSize() {
        return this.A01;
    }

    public final C96534nU getViewHolder() {
        return this.A05;
    }

    public final void setIcon(Drawable drawable) {
        this.A03 = drawable;
    }

    public final void setThumbSize(int i) {
        this.A01 = i;
    }
}
