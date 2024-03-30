package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;

/* renamed from: X.3D1  reason: invalid class name */
public final class AnonymousClass3D1 {
    public final C19630wG A00;
    public final C25271Fq A01;

    public final void A00() {
        Bitmap bitmap;
        Context context = this.A00.A00;
        AnonymousClass00C.A08(context);
        Integer A0n = C36381kD.A0n();
        Intent A0D = C36431kI.A0D();
        A0D.putExtra("bonsaiOnboardingEntryPoint", A0n);
        A0D.setClassName(context.getPackageName(), "com.whatsapp.bonsai.onboarding.BonsaiOnboardingActivity");
        PendingIntent A002 = C65743Th.A00(context, 0, A0D, 0);
        C07700Yy A0F = C36421kH.A0F(context);
        A0F.A0F(context.getString(R.string.f12nameremoved));
        A0F.A0E(context.getString(R.string.f12nameremoved));
        A0F.A0I(true);
        C36361kB.A1A(A0F);
        Drawable A003 = AnonymousClass00E.A00(context, R.drawable.vec_bonsai_pictogram);
        if (A003 != null) {
            int intrinsicWidth = A003.getIntrinsicWidth();
            int intrinsicHeight = A003.getIntrinsicHeight();
            if (!(A003 instanceof BitmapDrawable) || ((BitmapDrawable) A003).getBitmap() != null) {
                bitmap = C05370Pl.A00(A003, intrinsicWidth, intrinsicHeight);
                A0F.A0A(bitmap);
                A0F.A0D = A002;
                this.A01.A02(75, A0F.A05());
            }
        }
        bitmap = null;
        A0F.A0A(bitmap);
        A0F.A0D = A002;
        this.A01.A02(75, A0F.A05());
    }

    public AnonymousClass3D1(C19630wG r1, C25271Fq r2) {
        C36321k7.A0x(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
