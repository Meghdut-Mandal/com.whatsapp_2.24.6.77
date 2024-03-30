package X;

import android.content.Intent;
import android.graphics.Bitmap;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;

/* renamed from: X.2jG  reason: invalid class name and case insensitive filesystem */
public class C49522jG extends C132446Tt {
    public final C20690y0 A00;
    public final AnonymousClass17Y A01;
    public final C19730wQ A02;
    public final String A03;
    public final WeakReference A04;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        FileOutputStream fileOutputStream;
        Bitmap bitmap = ((Bitmap[]) objArr)[0];
        C18740tg.A06(bitmap);
        File A0X = this.A00.A0X("shared_qr_code.png");
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(A0X);
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 0, fileOutputStream);
                AnonymousClass14X.A02(fileOutputStream);
                bitmap.recycle();
                return A0X;
            } catch (FileNotFoundException e) {
                e = e;
                try {
                    Log.e("CreateSharedQrCardImageAsyncTask/shareFailed", e);
                    AnonymousClass14X.A02(fileOutputStream);
                    bitmap.recycle();
                    return null;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream2 = fileOutputStream;
                    AnonymousClass14X.A02(fileOutputStream2);
                    bitmap.recycle();
                    throw th;
                }
            }
        } catch (FileNotFoundException e2) {
            e = e2;
            fileOutputStream = null;
            Log.e("CreateSharedQrCardImageAsyncTask/shareFailed", e);
            AnonymousClass14X.A02(fileOutputStream);
            bitmap.recycle();
            return null;
        } catch (Throwable th2) {
            th = th2;
            AnonymousClass14X.A02(fileOutputStream2);
            bitmap.recycle();
            throw th;
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        File file = (File) obj;
        C225314u A0W = C36411kG.A0W(this.A04);
        if (A0W != null) {
            A0W.Bnv();
            if (file == null) {
                this.A01.A06(R.string.f12nameremoved, 0);
                return;
            }
            Intent A0B = C36431kI.A0B();
            Object[] A0M = AnonymousClass001.A0M();
            C19730wQ r5 = this.A02;
            A0M[0] = r5.A0A.A02();
            A0B.putExtra("android.intent.extra.SUBJECT", C36391kE.A0v(A0W, AnonymousClass3U8.A04(C36351kA.A0j(C36381kD.A0T(r5))), A0M, 1, R.string.f12nameremoved));
            A0B.putExtra("android.intent.extra.TEXT", this.A03);
            A0B.putExtra("android.intent.extra.STREAM", AnonymousClass6YY.A01(A0W.getApplicationContext(), file));
            C36371kC.A18(A0B, "image/png");
            A0W.A33(Intent.createChooser(A0B, (CharSequence) null), false);
        }
    }

    public C49522jG(C225314u r2, C20690y0 r3, AnonymousClass17Y r4, C19730wQ r5, String str) {
        this.A01 = r4;
        this.A02 = r5;
        this.A00 = r3;
        this.A04 = AnonymousClass001.A0F(r2);
        this.A03 = str;
    }
}
