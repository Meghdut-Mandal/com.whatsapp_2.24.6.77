package X;

import android.view.View;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.3tR  reason: invalid class name and case insensitive filesystem */
public class C79263tR implements C160527l9 {
    public final /* synthetic */ MediaViewFragment A00;
    public final /* synthetic */ PhotoView A01;

    public /* synthetic */ void BXv() {
    }

    public C79263tR(MediaViewFragment mediaViewFragment, PhotoView photoView) {
        this.A00 = mediaViewFragment;
        this.A01 = photoView;
    }

    public int BHb() {
        return this.A00.A1l.A09(this.A01.getContext());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        if (r1 != 43) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r12 != null) goto L_0x004b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bte(android.graphics.Bitmap r12, android.view.View r13, X.AnonymousClass3T1 r14) {
        /*
            r11 = this;
            com.whatsapp.mediaview.MediaViewFragment r4 = r11.A00
            android.content.Context r0 = r4.A1D()
            if (r0 == 0) goto L_0x006d
            X.2bU r14 = (X.AnonymousClass2bU) r14
            r8 = 0
            r7 = 43
            r6 = 42
            r9 = 13
            r5 = 9
            r2 = 3
            r3 = 1
            if (r12 == 0) goto L_0x0088
            com.whatsapp.mediaview.PhotoView r10 = r11.A01
            android.content.res.Resources r1 = X.C36341k9.A0G(r4)
            X.1lG r0 = new X.1lG
            r0.<init>(r1, r12, r14)
        L_0x0022:
            r10.A09(r0)
        L_0x0025:
            int r1 = r14.A1I
            if (r1 == r3) goto L_0x007e
            if (r1 == r2) goto L_0x0073
            if (r1 == r5) goto L_0x006e
            if (r1 == r9) goto L_0x0073
            r0 = 28
            if (r1 == r0) goto L_0x0073
            r0 = 29
            if (r1 == r0) goto L_0x0073
            if (r1 == r6) goto L_0x007e
            if (r1 == r7) goto L_0x0073
        L_0x003b:
            X.3Qj r1 = X.AnonymousClass2bU.A00(r14)
            int r0 = r1.A0A
            if (r0 == 0) goto L_0x004a
            int r0 = r1.A06
            if (r0 == 0) goto L_0x004a
            r1 = 1
            if (r12 != 0) goto L_0x004b
        L_0x004a:
            r1 = 0
        L_0x004b:
            boolean r0 = X.AnonymousClass3U9.A00
            if (r0 == 0) goto L_0x0064
            X.2bU r0 = r4.A1R
            if (r0 == 0) goto L_0x0064
            boolean r0 = X.AnonymousClass3T1.A0B(r14, r0)
            if (r0 == 0) goto L_0x0064
            if (r1 != 0) goto L_0x005f
            X.755 r0 = r4.A0A
            if (r0 != 0) goto L_0x0064
        L_0x005f:
            r4.A1u = r3
            com.whatsapp.mediaview.MediaViewFragment.A0I(r4)
        L_0x0064:
            X.755 r1 = r4.A0A
            if (r1 == 0) goto L_0x006d
            com.whatsapp.mediaview.PhotoView r0 = r11.A01
            r1.A01(r0, r14)
        L_0x006d:
            return
        L_0x006e:
            com.whatsapp.mediaview.PhotoView r0 = r11.A01
            r0.A0K = r8
            goto L_0x003b
        L_0x0073:
            com.whatsapp.mediaview.PhotoView r2 = r11.A01
            r1 = 0
            X.9v5 r0 = new X.9v5
            r0.<init>((java.lang.Object) r11, (java.lang.Object) r14, (int) r1)
            r2.A0K = r0
            goto L_0x003b
        L_0x007e:
            com.whatsapp.mediaview.PhotoView r1 = r11.A01
            X.2XW r0 = new X.2XW
            r0.<init>(r11, r14)
            r1.A0K = r0
            goto L_0x003b
        L_0x0088:
            int r0 = r14.A1I
            if (r0 == r3) goto L_0x00a7
            if (r0 == r2) goto L_0x00b1
            if (r0 == r5) goto L_0x009d
            if (r0 == r9) goto L_0x00b1
            if (r0 == r6) goto L_0x0097
            if (r0 == r7) goto L_0x0097
            goto L_0x0025
        L_0x0097:
            com.whatsapp.mediaview.PhotoView r0 = r11.A01
            r0.A09(r8)
            goto L_0x0025
        L_0x009d:
            com.whatsapp.mediaview.PhotoView r10 = r11.A01
            android.content.Context r1 = r4.A0a()
            r0 = 2131232961(0x7f0808c1, float:1.8082046E38)
            goto L_0x00ba
        L_0x00a7:
            com.whatsapp.mediaview.PhotoView r10 = r11.A01
            android.content.Context r1 = r4.A0a()
            r0 = 2131231006(0x7f08011e, float:1.807808E38)
            goto L_0x00ba
        L_0x00b1:
            com.whatsapp.mediaview.PhotoView r10 = r11.A01
            android.content.Context r1 = r4.A0a()
            r0 = 2131231007(0x7f08011f, float:1.8078083E38)
        L_0x00ba:
            android.graphics.drawable.Drawable r0 = X.AnonymousClass00E.A00(r1, r0)
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79263tR.Bte(android.graphics.Bitmap, android.view.View, X.3T1):void");
    }

    public void Btu(View view) {
        PhotoView photoView = this.A01;
        photoView.A0I = null;
        photoView.A04 = 0.0f;
    }
}
