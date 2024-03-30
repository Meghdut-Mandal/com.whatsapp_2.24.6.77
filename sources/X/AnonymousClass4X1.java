package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.util.List;

/* renamed from: X.4X1  reason: invalid class name */
public class AnonymousClass4X1 implements AnonymousClass4U2 {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public AnonymousClass4X1(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj3;
        this.A02 = obj2;
    }

    public void B1h() {
        ImageView imageView;
        int i;
        if (this.A03 != 0) {
            C42271yY r0 = (C42271yY) this.A02;
            imageView = r0.A03;
            i = r0.A01;
        } else {
            C42711zG r1 = (C42711zG) this.A00;
            List list = AnonymousClass0D3.A0I;
            imageView = r1.A03;
            i = r1.A00;
        }
        imageView.setBackgroundColor(i);
        imageView.setImageDrawable((Drawable) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.2UM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.2UM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.whatsapp.WaMediaThumbnailView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: X.2UM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: X.2UM} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bi2(android.graphics.Bitmap r8, boolean r9) {
        /*
            r7 = this;
            int r0 = r7.A03
            if (r0 == 0) goto L_0x0060
            r6 = 0
            X.AnonymousClass00C.A0D(r8, r6)
            java.lang.Object r5 = r7.A02
            X.1yY r5 = (X.C42271yY) r5
            com.whatsapp.WaMediaThumbnailView r3 = r5.A03
            java.lang.Object r1 = r3.getTag()
            java.lang.Object r0 = r7.A00
            if (r1 != r0) goto L_0x003a
            android.graphics.Bitmap r0 = X.C56382wC.A00
            boolean r0 = r8.equals(r0)
            r4 = 2
            r1 = 1
            if (r0 == 0) goto L_0x003e
            X.C36441kJ.A1D(r3)
            java.lang.Object r0 = r7.A01
            X.4V2 r0 = (X.AnonymousClass4V2) r0
            int r0 = r0.getType()
            if (r0 == r1) goto L_0x003b
            if (r0 == r4) goto L_0x003b
            int r0 = r5.A01
        L_0x0031:
            r3.setBackgroundColor(r0)
            r0 = 2131232505(0x7f0806f9, float:1.8081121E38)
        L_0x0037:
            r3.setImageResource(r0)
        L_0x003a:
            return
        L_0x003b:
            int r0 = r5.A01
            goto L_0x00a7
        L_0x003e:
            X.C36411kG.A1D(r3)
            r3.setBackgroundResource(r6)
            r3.setThumbnail(r8)
            if (r9 != 0) goto L_0x003a
            android.content.res.Resources r0 = r3.getResources()
            android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable
            r2.<init>(r0, r8)
            android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r4]
            android.graphics.drawable.ColorDrawable r0 = r5.A02
            r1[r6] = r0
            android.graphics.drawable.TransitionDrawable r0 = X.C36411kG.A0G(r2, r1)
            r3.setImageDrawable(r0)
            return
        L_0x0060:
            java.lang.Object r6 = r7.A00
            X.1zG r6 = (X.C42711zG) r6
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.2UM r3 = r6.A03
            java.lang.Object r1 = r3.getTag()
            java.lang.Object r0 = r7.A01
            if (r1 != r0) goto L_0x003a
            android.graphics.Bitmap r2 = X.C56382wC.A00
            r1 = 2
            r0 = 1
            r4 = 0
            if (r8 != r2) goto L_0x00bf
            X.C36441kJ.A1D(r3)
            java.lang.Object r5 = r7.A02
            X.4V2 r5 = (X.AnonymousClass4V2) r5
            int r2 = r5.getType()
            if (r2 == 0) goto L_0x00ae
            if (r2 == r0) goto L_0x00a5
            if (r2 == r1) goto L_0x00a5
            r0 = 3
            if (r2 == r0) goto L_0x0097
            r1 = 4
            int r0 = r6.A00
            r3.setBackgroundColor(r0)
            if (r2 == r1) goto L_0x00b1
            r3.setImageResource(r4)
            return
        L_0x0097:
            android.content.Context r1 = r3.getContext()
            r0 = 2131101755(0x7f06083b, float:1.7815929E38)
            X.C36341k9.A0q(r1, r3, r0)
            r0 = 2131231686(0x7f0803c6, float:1.807946E38)
            goto L_0x0037
        L_0x00a5:
            int r0 = r6.A00
        L_0x00a7:
            r3.setBackgroundColor(r0)
            r0 = 2131232506(0x7f0806fa, float:1.8081123E38)
            goto L_0x0037
        L_0x00ae:
            int r0 = r6.A00
            goto L_0x0031
        L_0x00b1:
            android.content.Context r2 = r3.getContext()
            java.lang.String r1 = r5.BEF()
            r0 = 0
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3MS.A01(r2, r1, r0, r4)
            goto L_0x00dc
        L_0x00bf:
            X.C36411kG.A1D(r3)
            r3.setBackgroundResource(r4)
            r3.A06 = r8
            if (r9 != 0) goto L_0x00e0
            android.content.res.Resources r0 = r3.getResources()
            android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable
            r2.<init>(r0, r8)
            android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r1]
            android.graphics.drawable.ColorDrawable r0 = r6.A01
            r1[r4] = r0
            android.graphics.drawable.TransitionDrawable r0 = X.C36411kG.A0G(r2, r1)
        L_0x00dc:
            r3.setImageDrawable(r0)
            return
        L_0x00e0:
            r3.setImageBitmap(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4X1.Bi2(android.graphics.Bitmap, boolean):void");
    }

    public /* synthetic */ void BXH() {
    }
}
