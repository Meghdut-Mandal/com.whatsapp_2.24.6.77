package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.61o  reason: invalid class name and case insensitive filesystem */
public class C1258561o {
    public final C20810yC A00;
    public final AnonymousClass6CW A01;

    public void A00(ImageView imageView, String str) {
        Drawable A02 = AnonymousClass3UF.A02(imageView.getContext(), R.drawable.ic_business_category, R.color.f6nameremoved);
        this.A01.A00((Drawable) null, A02, imageView, (C160197kc) null, str);
    }

    public C1258561o(AnonymousClass17Y r10, C20050ww r11, C19630wG r12, C20810yC r13, AnonymousClass13E r14) {
        this.A00 = r13;
        Context context = r12.A00;
        AnonymousClass658 r3 = new AnonymousClass658(r10, r11, r14, C36441kJ.A0w(context.getCacheDir(), "biz_directory_cache"), "directory-image");
        AnonymousClass658.A00(context, r3);
        r3.A05 = true;
        this.A01 = r3.A01();
        if (this.A00.A0E(2185)) {
            this.A01.A02.A03.A00 = true;
        }
    }
}
