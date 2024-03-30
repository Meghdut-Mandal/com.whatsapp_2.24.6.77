package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: X.2jC  reason: invalid class name and case insensitive filesystem */
public class C49482jC extends C132446Tt {
    public final AnonymousClass1Pp A00;
    public final C226215d A01;
    public final C27761Ps A02;
    public final AnonymousClass141 A03;
    public final WeakReference A04;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        View A0Y = AnonymousClass000.A0Y(this.A04);
        if (A0Y == null) {
            return null;
        }
        C27761Ps r1 = this.A02;
        Context context = A0Y.getContext();
        AnonymousClass141 r3 = this.A03;
        Bitmap A07 = r1.A07(context, r3, -1.0f, 96, true);
        if (A07 == null) {
            AnonymousClass1Pp r2 = this.A00;
            A07 = AnonymousClass1Pp.A01(A0Y.getContext(), r2, -1.0f, r2.A02(r3), 96);
        }
        C226215d r0 = this.A01;
        if (r0 == null) {
            return A07;
        }
        r0.A00 = A07;
        return A07;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        ImageView imageView = (ImageView) this.A04.get();
        if (imageView != null && bitmap != null) {
            imageView.setImageBitmap(bitmap);
            imageView.setVisibility(0);
        }
    }

    public C49482jC(ImageView imageView, AnonymousClass1Pp r3, C226215d r4, C27761Ps r5, AnonymousClass141 r6) {
        this.A00 = r3;
        this.A02 = r5;
        this.A03 = r6;
        this.A04 = AnonymousClass001.A0F(imageView);
        this.A01 = r4;
    }
}
