package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;
import java.io.File;

/* renamed from: X.658  reason: invalid class name */
public final class AnonymousClass658 {
    public int A00 = Integer.MAX_VALUE;
    public long A01 = 1048576;
    public Drawable A02;
    public Drawable A03;
    public C131566Po A04;
    public boolean A05 = false;
    public final AnonymousClass17Y A06;
    public final C20050ww A07;
    public final AnonymousClass13E A08;
    public final File A09;
    public final String A0A;

    public AnonymousClass6CW A01() {
        return new AnonymousClass6CW(this.A06, this.A08, this, this.A00);
    }

    public AnonymousClass658(AnonymousClass17Y r3, C20050ww r4, AnonymousClass13E r5, File file, String str) {
        this.A06 = r3;
        this.A07 = r4;
        this.A08 = r5;
        this.A09 = file;
        this.A0A = str;
    }

    public static void A00(Context context, AnonymousClass658 r2) {
        r2.A00 = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        r2.A01 = 16777216;
    }
}
