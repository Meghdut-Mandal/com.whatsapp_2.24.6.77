package X;

import android.content.Context;
import android.graphics.Bitmap;
import java.lang.ref.WeakReference;

/* renamed from: X.5MX  reason: invalid class name */
public class AnonymousClass5MX extends C132446Tt {
    public int A00;
    public AnonymousClass6WR A01;
    public C97054oK A02;
    public C96014me A03;
    public WeakReference A04;
    public Bitmap[] A05;
    public boolean[] A06;
    public boolean[] A07;
    public final C1032954s A08;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004d, code lost:
        if (r5 == null) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0C(java.lang.Object r5) {
        /*
            r4 = this;
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            java.lang.ref.WeakReference r0 = r4.A04
            android.content.Context r3 = X.C36441kJ.A0G(r0)
            r2 = 0
            if (r3 == 0) goto L_0x004d
            X.6WR r0 = r4.A01
            android.graphics.Bitmap r0 = r0.A02
            if (r0 == 0) goto L_0x004d
            if (r5 == 0) goto L_0x004f
            boolean r0 = r5.isRecycled()
            if (r0 != 0) goto L_0x0041
            X.4oK r0 = r4.A02
            android.widget.ImageView r0 = r0.A02
            r0.setBackgroundResource(r2)
            X.4oK r0 = r4.A02
            android.widget.ImageView r1 = r0.A02
            android.graphics.drawable.BitmapDrawable r0 = X.C36421kH.A0C(r3, r5)
            r1.setImageDrawable(r0)
            X.4oK r0 = r4.A02
            android.widget.TextView r1 = r0.A03
            int r0 = r4.A00
            X.5te r0 = X.C129876Iu.A00(r0)
            int r0 = r0.A01
            r1.setText(r0)
            X.4oK r1 = r4.A02
            android.view.View r0 = r1.A01
            r0.setOnClickListener(r1)
        L_0x0041:
            r0 = 0
            r4.A01 = r0
            r4.A03 = r0
            r4.A02 = r0
            r4.A07 = r0
            r4.A05 = r0
            return
        L_0x004d:
            if (r5 != 0) goto L_0x0041
        L_0x004f:
            int r0 = r4.A00
            if (r0 == 0) goto L_0x0041
            int r1 = r0 + -1
            boolean[] r0 = r4.A06
            r0[r1] = r2
            X.4me r0 = r4.A03
            if (r0 == 0) goto L_0x0041
            r0.A07(r1)
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5MX.A0C(java.lang.Object):void");
    }

    public AnonymousClass5MX(Context context, C1032954s r3, AnonymousClass6WR r4, C97054oK r5, C96014me r6, Bitmap[] bitmapArr, boolean[] zArr, boolean[] zArr2, int i) {
        this.A04 = AnonymousClass001.A0F(context);
        this.A01 = r4;
        this.A03 = r6;
        this.A00 = i;
        this.A05 = bitmapArr;
        this.A07 = zArr;
        this.A06 = zArr2;
        this.A02 = r5;
        this.A08 = r3;
    }
}
