package X;

import android.view.View;
import com.whatsapp.webpagepreview.WebPagePreviewView;

/* renamed from: X.3Z1  reason: invalid class name */
public final class AnonymousClass3Z1 implements View.OnLayoutChangeListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C47532ev A02;
    public final /* synthetic */ WebPagePreviewView A03;
    public final /* synthetic */ boolean A04;

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayoutChange(android.view.View r16, int r17, int r18, int r19, int r20, int r21, int r22, int r23, int r24) {
        /*
            r15 = this;
            r0 = 0
            r1 = r16
            X.AnonymousClass00C.A0D(r1, r0)
            r1.removeOnLayoutChangeListener(r15)
            com.whatsapp.webpagepreview.WebPagePreviewView r10 = r15.A03
            android.widget.LinearLayout r0 = r10.A08
            int r13 = r0.getHeight()
            X.2ev r9 = r15.A02
            X.2bV r2 = r9.A0C
            java.lang.String r3 = r2.A1Y()
            r1 = 0
            if (r3 == 0) goto L_0x0026
            X.3L1 r0 = r2.A0a
            if (r0 != 0) goto L_0x003e
            byte[] r0 = r2.A1c()
            if (r0 != 0) goto L_0x003e
        L_0x0026:
            r6 = 0
        L_0x0027:
            r11 = 0
            if (r6 == 0) goto L_0x003c
            int r11 = r6.getWidth()
            int r12 = r6.getHeight()
        L_0x0032:
            android.view.View r7 = r15.A00
            android.view.View r8 = r15.A01
            boolean r14 = r15.A04
            X.C47532ev.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        L_0x003c:
            r12 = 0
            goto L_0x0032
        L_0x003e:
            X.0yC r0 = r9.A0A
            X.AnonymousClass00C.A0D(r0, r1)
            X.1DU r0 = r9.A0B
            int r1 = X.AnonymousClass3UN.A02(r0, r3)
            r0 = 250(0xfa, float:3.5E-43)
            if (r1 >= r0) goto L_0x0026
            android.util.DisplayMetrics r3 = r9.A00
            java.lang.String r6 = "displayMetrics"
            if (r3 != 0) goto L_0x0058
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r6)
            throw r0
        L_0x0058:
            int r0 = r3.heightPixels
            float r1 = (float) r0
            float r0 = r3.density
            float r1 = r1 / r0
            r0 = 1142947840(0x44200000, float:640.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0026
            android.content.Context r0 = r9.A0B()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131168455(0x7f070cc7, float:1.7951212E38)
            int r3 = r1.getDimensionPixelSize(r0)
            android.view.View r0 = r9.A06
            int r1 = r0.getHeight()
            com.whatsapp.TextEmojiLabel r0 = r9.A07
            int r0 = r0.getHeight()
            int r1 = r1 - r0
            int r1 = r1 - r13
            if (r1 < r3) goto L_0x0026
            X.3L1 r3 = r2.A0a
            if (r3 == 0) goto L_0x00b6
            int r5 = r3.A01
            if (r5 <= 0) goto L_0x00b6
            int r0 = r3.A00
            if (r0 <= 0) goto L_0x00b6
            int r0 = r9.A05
            float r1 = (float) r0
            android.util.DisplayMetrics r0 = r9.A00
            if (r0 != 0) goto L_0x009b
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r6)
            throw r0
        L_0x009b:
            float r0 = r0.density
            float r1 = r1 / r0
            int r0 = (int) r1
            if (r5 < r0) goto L_0x00b6
            android.view.View r6 = r15.A00
            android.view.View r1 = r15.A01
            boolean r0 = r15.A04
            X.3tX r5 = new X.3tX
            r7 = r1
            r8 = r3
            r11 = r13
            r12 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            X.1SV r0 = r9.A0G
            r0.A0C(r10, r2, r5)
            return
        L_0x00b6:
            byte[] r5 = r2.A1c()
            r6 = 0
            if (r5 == 0) goto L_0x0027
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options     // Catch:{ OutOfMemoryError -> 0x0027 }
            r3.<init>()     // Catch:{ OutOfMemoryError -> 0x0027 }
            r0 = 1
            r3.inDither = r0     // Catch:{ OutOfMemoryError -> 0x0027 }
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ OutOfMemoryError -> 0x0027 }
            r3.inPreferredConfig = r0     // Catch:{ OutOfMemoryError -> 0x0027 }
            byte[] r2 = r2.A1c()     // Catch:{ OutOfMemoryError -> 0x0027 }
            r1 = 0
            int r0 = r5.length     // Catch:{ OutOfMemoryError -> 0x0027 }
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeByteArray(r2, r1, r0, r3)     // Catch:{ OutOfMemoryError -> 0x0027 }
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Z1.onLayoutChange(android.view.View, int, int, int, int, int, int, int, int):void");
    }

    public AnonymousClass3Z1(View view, View view2, C47532ev r3, WebPagePreviewView webPagePreviewView, boolean z) {
        this.A03 = webPagePreviewView;
        this.A02 = r3;
        this.A00 = view;
        this.A01 = view2;
        this.A04 = z;
    }
}
