package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.net.Uri;
import com.whatsapp.filter.FilterUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.6uO  reason: invalid class name and case insensitive filesystem */
public final class C145706uO implements AnonymousClass4TB {
    public final int A00;
    public final Context A01;
    public final Uri A02;
    public final C18820ts A03;
    public final C1032954s A04;
    public final AnonymousClass1H2 A05;
    public final AnonymousClass6QO A06;
    public final C25491Gn A07;
    public final AnonymousClass1HA A08;
    public final AnonymousClass1GX A09;
    public final AtomicBoolean A0A = C36431kI.A1H();
    public final AnonymousClass5CN A0B;

    public C145706uO(Uri uri, C18820ts r3, C1032954s r4, AnonymousClass1H2 r5, AnonymousClass6QO r6, C25491Gn r7, AnonymousClass5CN r8, AnonymousClass1HA r9, AnonymousClass1GX r10, int i) {
        AnonymousClass00C.A0D(uri, 6);
        this.A03 = r3;
        this.A05 = r5;
        this.A09 = r10;
        this.A07 = r7;
        this.A08 = r9;
        this.A02 = uri;
        this.A06 = r6;
        this.A0B = r8;
        this.A04 = r4;
        this.A00 = i;
        this.A01 = C36371kC.A0B(r8);
    }

    public Bitmap BOD() {
        File file;
        String absolutePath;
        File file2;
        Bitmap A002;
        Rect rect;
        AtomicBoolean atomicBoolean = this.A0A;
        Bitmap bitmap = null;
        if (atomicBoolean.get() || this.A0B.getTag() != this || atomicBoolean.get()) {
            return null;
        }
        int A003 = this.A07.A00(this.A02);
        if (A003 == 1) {
            AnonymousClass6QO r2 = this.A06;
            synchronized (r2) {
                file = r2.A09;
            }
            if (file == null || (absolutePath = file.getAbsolutePath()) == null) {
                Uri fromFile = Uri.fromFile(r2.A07());
                try {
                    AnonymousClass1GX r1 = this.A09;
                    int i = this.A00;
                    bitmap = r1.A0e(fromFile, i, i);
                    AnonymousClass00C.A0B(bitmap);
                } catch (AnonymousClass1X5 | IOException unused) {
                    bitmap = C56382wC.A00;
                }
            } else {
                try {
                    bitmap = BitmapFactory.decodeFile(absolutePath);
                    AnonymousClass00C.A0B(bitmap);
                } catch (OutOfMemoryError e) {
                    Log.e("ThumbnailBitmapLoader/getImageThumbnail/OutOfMemoryError", e);
                }
            }
        } else if (A003 == 3 || A003 == 13) {
            File A082 = this.A06.A08();
            if (A082 != null) {
                Bitmap A012 = C25541Gs.A01(A082);
                if (A012 != null) {
                    Bitmap.Config config = A012.getConfig();
                    AnonymousClass00C.A08(config);
                    int i2 = this.A00;
                    bitmap = Bitmap.createBitmap(i2, i2, config);
                    AnonymousClass00C.A08(bitmap);
                    Canvas A0A2 = C90524aI.A0A(bitmap);
                    Paint A0K = C36441kJ.A0K();
                    A0K.setAntiAlias(true);
                    A0K.setFilterBitmap(true);
                    A0K.setDither(true);
                    int width = A012.getWidth();
                    int height = A012.getHeight();
                    if (width > height) {
                        rect = new Rect((width - height) / 2, 0, (width + height) / 2, height);
                    } else {
                        rect = new Rect(0, (height - width) / 2, width, (height + width) / 2);
                    }
                    A0A2.drawBitmap(A012, rect, new Rect(0, 0, i2, i2), A0K);
                    A012.recycle();
                }
                bitmap = C56382wC.A00;
            } else {
                throw C36381kD.A0l();
            }
        }
        if (bitmap == null) {
            return C56382wC.A00;
        }
        AnonymousClass6QO r22 = this.A06;
        int A013 = r22.A01();
        if (!(A013 == 0 || (A002 = FilterUtils.A00(bitmap, this.A04, A013, true)) == null)) {
            bitmap = A002;
        }
        if (r22.A0B() != null) {
            if (!bitmap.isMutable()) {
                bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            }
            C130956Nc r4 = AnonymousClass6VQ.A05;
            String A0B2 = r22.A0B();
            AnonymousClass6VQ A022 = r4.A02(this.A01, this.A03, this.A05, this.A08, A0B2);
            if (A022 != null) {
                AnonymousClass00C.A0B(bitmap);
                A022.A05(bitmap, 0, false, false);
            }
            AnonymousClass00C.A0B(bitmap);
        }
        synchronized (r22) {
            file2 = r22.A09;
        }
        if (file2 != null) {
            return AnonymousClass6Y8.A03(bitmap);
        }
        return bitmap;
    }

    public String BIB() {
        StringBuilder A0u = AnonymousClass000.A0u();
        C36351kA.A1K(this.A02, A0u);
        return AnonymousClass000.A0q("-thumb", A0u);
    }
}
