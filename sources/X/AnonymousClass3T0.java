package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.whatsapp.R;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* renamed from: X.3T0  reason: invalid class name */
public abstract class AnonymousClass3T0 {
    public boolean A00;
    public final C19630wG A01;
    public final C19730wQ A02;
    public final C24431Ck A03;
    public final AnonymousClass179 A04;
    public final C24341Cb A05;
    public final AnonymousClass1CY A06;
    public final C20840yF A07;
    public final AnonymousClass1CQ A08;
    public final C24391Cg A09;
    public final AnonymousClass1CS A0A;

    public static Point A06(Context context) {
        int i;
        int i2;
        Point point = new Point();
        C21060yb.A01(context).getDefaultDisplay().getSize(point);
        if (C36341k9.A04(context) == 2 && (i = point.x) < (i2 = point.y)) {
            point.y = i;
            point.x = i2;
        }
        point.y -= C36441kJ.A05(context.getResources(), R.dimen.f7nameremoved) + C65123Qv.A02(context, C21060yb.A01(context));
        return point;
    }

    public static C130396Kx A07(Point point, boolean z) {
        int i = point.x;
        int i2 = point.y;
        Long valueOf = Long.valueOf(C19430v1.A00 / 32);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inDither = z;
        return new C130396Kx(options, valueOf, i, i2, false);
    }

    public Drawable A08(C62413Gb r5) {
        if (this instanceof C47232e6) {
            if (r5 == null) {
                return null;
            }
            Drawable drawable = r5.A00;
            Integer num = r5.A01;
            if (num == null || drawable == null) {
                return drawable;
            }
            AnonymousClass3U7.A05(this.A01.A00, drawable, num.intValue());
            return drawable;
        } else if (r5 == null) {
            return null;
        } else {
            return r5.A00;
        }
    }

    public Uri A09() {
        if (this instanceof C47232e6) {
            return ((C47232e6) this).A02.A09();
        }
        AnonymousClass2e5 r4 = (AnonymousClass2e5) this;
        PhoneUserJid A0e = C36371kC.A0e(r4.A05);
        StringBuilder A0u = AnonymousClass000.A0u();
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append(A0e.getRawString());
        A0u.append(C18750th.A04(C36411kG.A11(A0u2, System.currentTimeMillis())));
        String A0q = AnonymousClass000.A0q(".jpg", A0u);
        File file = r4.A03.A08().A0P;
        C20690y0.A07(file, false);
        return Uri.fromFile(C36441kJ.A0w(file, A0q));
    }

    public C62413Gb A0A(Context context, Uri uri, AnonymousClass11F r10, boolean z) {
        InputStream A0V;
        InputStream inputStream;
        if (this instanceof C47232e6) {
            C47232e6 r4 = (C47232e6) this;
            boolean z2 = false;
            BitmapDrawable bitmapDrawable = null;
            try {
                AnonymousClass1GX r1 = r4.A03;
                Objects.requireNonNull(uri);
                if (z) {
                    inputStream = AnonymousClass1GX.A0V(uri, r1, true);
                } else {
                    inputStream = new FileInputStream(AnonymousClass6YY.A03(uri));
                }
                Bitmap bitmap = AnonymousClass6Y8.A0A(A07(A06(context), false), inputStream).A02;
                if (bitmap != null) {
                    bitmapDrawable = C36421kH.A0C(context, bitmap);
                } else {
                    r4.A01.A04(R.string.f12nameremoved, 0);
                }
                inputStream.close();
            } catch (IOException unused) {
                r4.A01.A04(R.string.f12nameremoved, 0);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            if (bitmapDrawable == null) {
                return r4.A0B(context, r10);
            }
            if (r10 == null) {
                z2 = true;
            }
            return C47232e6.A01(context, C47232e6.A02(context, bitmapDrawable, r10, r4), z2);
        }
        AnonymousClass2e5 r3 = (AnonymousClass2e5) this;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("wallpaper/set with Uri with size (width x height): ");
        A0u.append(0);
        C36321k7.A1T("x", A0u, 0);
        r3.A00 = null;
        try {
            AnonymousClass1GX r0 = r3.A08;
            Objects.requireNonNull(uri);
            A0V = AnonymousClass1GX.A0V(uri, r0, true);
            Bitmap bitmap2 = AnonymousClass6Y8.A0A(A07(A06(context), false), A0V).A02;
            if (bitmap2 != null) {
                r3.A00 = C36421kH.A0C(context, bitmap2);
            } else {
                r3.A04.A04(R.string.f12nameremoved, 0);
            }
            r3.A00 = true;
            A0V.close();
        } catch (IOException e) {
            Log.e((Throwable) e);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        Drawable drawable = r3.A00;
        if (drawable != null) {
            AnonymousClass2e5.A00(context, drawable, r3);
        }
        return new C62413Gb(r3.A00, 0, "DOWNLOADED", true);
        throw th;
        throw th;
    }

    public C62413Gb A0B(Context context, AnonymousClass11F r4) {
        if (!(this instanceof C47232e6)) {
            return ((AnonymousClass2e5) this).A0E(context, false);
        }
        AnonymousClass00I A002 = C47232e6.A00(context, r4, (C47232e6) this);
        Object obj = A002.A00;
        C18740tg.A06(obj);
        Object obj2 = A002.A01;
        C18740tg.A06(obj2);
        return C47232e6.A01(context, (AnonymousClass37Q) obj, AnonymousClass000.A1X(obj2));
    }

    public File A0C() {
        if (this instanceof C47232e6) {
            return ((C47232e6) this).A02.A0C();
        }
        return C36441kJ.A0w(this.A01.A00.getFilesDir(), "wallpaper.jpg");
    }

    public boolean A0D() {
        if (this instanceof C47232e6) {
            C47232e6 r1 = (C47232e6) this;
            boolean A0D = r1.A02.A0D();
            C47232e6.A05(r1);
            return A0D;
        }
        AnonymousClass2e5 r0 = (AnonymousClass2e5) this;
        return AnonymousClass000.A1S(r0.A06.A03(C36441kJ.A0w(r0.A01.A00.getFilesDir(), "wallpaper.jpg"), "wallpaper"), 19);
    }

    public AnonymousClass3T0(C19730wQ r1, C24431Ck r2, AnonymousClass179 r3, C24341Cb r4, C19630wG r5, AnonymousClass1CY r6, C20840yF r7, AnonymousClass1CQ r8, C24391Cg r9, AnonymousClass1CS r10) {
        this.A01 = r5;
        this.A0A = r10;
        this.A02 = r1;
        this.A04 = r3;
        this.A06 = r6;
        this.A03 = r2;
        this.A05 = r4;
        this.A08 = r8;
        this.A09 = r9;
        this.A07 = r7;
    }
}
