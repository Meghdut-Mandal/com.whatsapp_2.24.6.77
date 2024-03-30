package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import com.whatsapp.R;

/* renamed from: X.6Se  reason: invalid class name and case insensitive filesystem */
public final class C132106Se {
    public final C19630wG A00;

    public C132106Se(C19630wG r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public static final Bitmap A00(Bitmap bitmap) {
        DisplayMetrics A0P = C90484aE.A0P();
        int max = Math.max(A0P.widthPixels, A0P.heightPixels);
        Bitmap createBitmap = Bitmap.createBitmap(max, max, Bitmap.Config.ARGB_8888);
        AnonymousClass00C.A08(createBitmap);
        Canvas A0A = C90524aI.A0A(createBitmap);
        A0A.drawColor(0);
        A0A.drawBitmap(bitmap, (float) ((max - bitmap.getWidth()) / 2), (float) ((max - bitmap.getHeight()) / 2), (Paint) null);
        bitmap.recycle();
        return createBitmap;
    }

    public final Bitmap A02(Bitmap bitmap) {
        Context context = this.A00.A00;
        Bitmap bitmap2 = bitmap;
        float max = (((float) Math.max(bitmap2.getWidth(), bitmap2.getHeight())) * ((float) context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved))) / C36441kJ.A00(context.getResources(), R.dimen.f7nameremoved);
        int width = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        Bitmap A09 = C90524aI.A09(width, height);
        Canvas A0A = C90524aI.A0A(A09);
        Paint A0K = C36441kJ.A0K();
        A0K.setAntiAlias(true);
        boolean A1P = AnonymousClass000.A1P(bitmap2.getPixel(0, 0));
        int i = width - 1;
        boolean A1P2 = AnonymousClass000.A1P(bitmap2.getPixel(i, 0));
        int i2 = height - 1;
        boolean A1P3 = AnonymousClass000.A1P(bitmap2.getPixel(0, i2));
        boolean A1P4 = AnonymousClass000.A1P(bitmap2.getPixel(i, i2));
        float[] fArr = new float[8];
        if (A1P) {
            fArr[1] = max;
            fArr[0] = max;
        }
        if (A1P2) {
            fArr[3] = max;
            fArr[2] = max;
        }
        if (A1P4) {
            fArr[5] = max;
            fArr[4] = max;
        }
        if (A1P3) {
            fArr[7] = max;
            fArr[6] = max;
        }
        Path A0M = C36441kJ.A0M();
        A0M.addRoundRect(new RectF(0.0f, 0.0f, (float) width, (float) height), fArr, Path.Direction.CW);
        A0A.drawPath(A0M, A0K);
        A0K.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        A0A.drawBitmap(bitmap2, 0.0f, 0.0f, A0K);
        AnonymousClass00C.A08(A09);
        bitmap2.recycle();
        int min = Math.min(Math.max(A09.getWidth(), A09.getHeight()), context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
        Bitmap A04 = AnonymousClass6Y8.A04(A09, min, (min * 16) / 512);
        AnonymousClass00C.A08(A04);
        A09.recycle();
        Bitmap A05 = AnonymousClass6Y8.A05(A04, new PorterDuffColorFilter(AnonymousClass00F.A00(context, R.color.f6nameremoved), PorterDuff.Mode.SRC_ATOP), (((float) Math.max(A04.getWidth(), A04.getHeight())) * ((float) context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved))) / C36441kJ.A00(context.getResources(), R.dimen.f7nameremoved));
        AnonymousClass00C.A08(A05);
        A04.recycle();
        return A05;
    }

    public static final Bitmap A01(Bitmap bitmap) {
        Bitmap A03 = AnonymousClass6Y8.A03(bitmap);
        AnonymousClass00C.A08(A03);
        bitmap.recycle();
        if (Math.min(A03.getWidth(), A03.getHeight()) >= 512) {
            return A03;
        }
        float width = (float) A03.getWidth();
        float height = (float) A03.getHeight();
        float max = ((float) 512) / Math.max(width, height);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(A03, C90514aH.A06(width, max), C90514aH.A06(max, height), true);
        AnonymousClass00C.A08(createScaledBitmap);
        A03.recycle();
        return createScaledBitmap;
    }
}
