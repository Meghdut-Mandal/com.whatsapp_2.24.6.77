package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.Uri;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.2k4  reason: invalid class name and case insensitive filesystem */
public class C50022k4 extends C132446Tt {
    public C225314u A00;
    public C225214t A01;
    public final int A02;
    public final int A03;
    public final Uri A04;
    public final AnonymousClass16K A05;
    public final C21060yb A06;
    public final C18820ts A07;
    public final AnonymousClass141 A08;
    public final String A09;

    public C50022k4(Uri uri, C225314u r3, C225214t r4, AnonymousClass16K r5, C21060yb r6, C18820ts r7, AnonymousClass141 r8, String str, int i, int i2) {
        super(r3, true);
        this.A01 = r4;
        this.A06 = r6;
        this.A07 = r7;
        this.A04 = uri;
        this.A08 = r8;
        this.A00 = r3;
        this.A05 = r5;
        this.A09 = str;
        this.A03 = i;
        this.A02 = i2;
    }

    public /* bridge */ /* synthetic */ void A0B(Object obj) {
        this.A00 = null;
        this.A01 = null;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        InputStream A062;
        int i;
        this.A05.A02(this.A08).delete();
        C21050ya A0O = this.A06.A0O();
        if (A0O == null) {
            Log.w("profileinfo/cropphoto contentResolver=null");
            return Integer.valueOf(R.string.f12nameremoved);
        }
        try {
            Uri uri = this.A04;
            A062 = A0O.A06(uri);
            if (A062 == null) {
                C36321k7.A1J(uri, "profileinfo/cropphoto/no-input-stream ", AnonymousClass000.A0u());
                return Integer.valueOf(R.string.f12nameremoved);
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            Integer num = null;
            BitmapFactory.decodeStream(A062, (Rect) null, options);
            int i2 = options.outWidth;
            if (i2 <= 0 || (i = options.outHeight) <= 0) {
                C36321k7.A1J(uri, "profileinfo/cropphoto/not-an-image ", AnonymousClass000.A0u());
                num = Integer.valueOf(R.string.f12nameremoved);
            } else if (i2 < 192 || i < 192) {
                num = Integer.valueOf(R.plurals.f10nameremoved);
            }
            A062.close();
            return num;
        } catch (IOException e) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("profileinfo/cropphoto/ ");
            Log.e(AnonymousClass000.A0o(this.A04, A0u), e);
            return Integer.valueOf(R.string.f12nameremoved);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        int i;
        Number number = (Number) obj;
        C225314u r8 = this.A00;
        if (r8 != null && this.A01 != null) {
            if (number != null) {
                int intValue = number.intValue();
                if (intValue == R.plurals.f10nameremoved) {
                    C18820ts r1 = this.A07;
                    Object[] objArr = new Object[1];
                    AnonymousClass000.A1L(objArr, 192, 0);
                    r8.BO6(r1.A0L(objArr, R.plurals.f10nameremoved, 192));
                    return;
                }
                r8.BO5(intValue);
                return;
            }
            AnonymousClass3FO r3 = new AnonymousClass3FO(r8);
            r3.A09 = this.A04;
            r3.A04 = 192;
            r3.A0I = false;
            r3.A0E = false;
            r3.A0A = Uri.fromFile(this.A05.A02(this.A08));
            r3.A0C = Bitmap.CompressFormat.JPEG.toString();
            r3.A0D = this.A09;
            if (this.A02 == 1) {
                r3.A0E = true;
                r3.A00 = 16;
                r3.A01 = 9;
                r3.A0H = true;
                r3.A0F = true;
                i = 640;
                r3.A06 = 1138;
            } else {
                r3.A00 = 1;
                r3.A01 = 1;
                i = 640;
                r3.A06 = 640;
            }
            r3.A07 = i;
            this.A01.startActivityForResult(r3.A00(), this.A03);
        }
    }
}
