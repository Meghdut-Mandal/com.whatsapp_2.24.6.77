package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.io.File;

/* renamed from: X.6CW  reason: invalid class name */
public class AnonymousClass6CW {
    public Drawable A00;
    public final int A01;
    public final C131566Po A02;
    public final boolean A03;

    public void A01(ImageView imageView, String str) {
        A00((Drawable) null, (Drawable) null, imageView, (C160197kc) null, str);
    }

    public void A00(Drawable drawable, Drawable drawable2, ImageView imageView, C160197kc r15, String str) {
        int i = this.A01;
        String str2 = str;
        this.A02.A01(new C142886pd(drawable, drawable2, imageView, r15, str2, str2, i, i), this.A03);
    }

    public AnonymousClass6CW(AnonymousClass17Y r10, AnonymousClass13E r11, AnonymousClass658 r12, int i) {
        C131566Po r0 = r12.A04;
        if (r0 == null) {
            C20050ww r2 = r12.A07;
            Drawable drawable = r12.A03;
            File file = r12.A09;
            long j = r12.A01;
            String str = r12.A0A;
            r0 = new C102154zO(r10, r2, new C142866pb(drawable, (Drawable) null), r11, file, str, j);
        }
        this.A02 = r0;
        this.A03 = r12.A05;
        this.A01 = i;
        this.A00 = r12.A02;
    }
}
