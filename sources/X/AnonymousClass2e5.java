package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.whatsapp.util.Log;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: X.2e5  reason: invalid class name */
public class AnonymousClass2e5 extends AnonymousClass3T0 {
    public Drawable A00;
    public boolean A01;
    public boolean A02;
    public final C20690y0 A03;
    public final AnonymousClass17Y A04;
    public final C19730wQ A05;
    public final C24401Ch A06;
    public final AnonymousClass54T A07;
    public final AnonymousClass1GX A08;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass2e5(X.C20690y0 r13, X.AnonymousClass17Y r14, X.C19730wQ r15, X.C24431Ck r16, X.AnonymousClass179 r17, X.C24341Cb r18, X.C19630wG r19, X.AnonymousClass1CY r20, X.C20840yF r21, X.C24401Ch r22, X.AnonymousClass54T r23, X.AnonymousClass1CQ r24, X.C24391Cg r25, X.AnonymousClass1CS r26, X.AnonymousClass1GX r27) {
        /*
            r12 = this;
            r11 = r26
            r1 = r12
            r10 = r25
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r24
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.A04 = r14
            r12.A05 = r15
            r12.A03 = r13
            r0 = r27
            r12.A08 = r0
            r0 = r22
            r12.A06 = r0
            r0 = r23
            r12.A07 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2e5.<init>(X.0y0, X.17Y, X.0wQ, X.1Ck, X.179, X.1Cb, X.0wG, X.1CY, X.0yF, X.1Ch, X.54T, X.1CQ, X.1Cg, X.1CS, X.1GX):void");
    }

    public static void A00(Context context, Drawable drawable, AnonymousClass2e5 r5) {
        FileOutputStream openFileOutput;
        try {
            openFileOutput = context.openFileOutput("wallpaper.jpg", 0);
            ((BitmapDrawable) drawable).getBitmap().compress(Bitmap.CompressFormat.JPEG, 90, openFileOutput);
            if (openFileOutput != null) {
                openFileOutput.close();
            }
        } catch (IOException e) {
            Log.e((Throwable) e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        r5.A07.A0D();
        return;
        throw th;
    }

    public AnonymousClass2e7 A0E(Context context, boolean z) {
        int i;
        int i2;
        BitmapDrawable A022;
        FileInputStream openFileInput;
        String str;
        Object obj;
        boolean A0A = AnonymousClass1RC.A0A(context);
        if ((this.A01 && A0A != this.A02) || z) {
            this.A00 = null;
        }
        int i3 = 0;
        if (this.A00 == null) {
            this.A01 = false;
            Resources resources = context.getResources();
            BitmapDrawable A032 = AnonymousClass3U7.A03(context, resources, C36441kJ.A0w(context.getFilesDir(), "wallpaper.jpg"));
            this.A00 = A032;
            i = 2;
            if (A032 != null) {
                i = 5;
            } else {
                try {
                    openFileInput = context.openFileInput("wallpaper.jpg");
                    i = openFileInput.read();
                    if (i == 4) {
                        i2 = openFileInput.read();
                    } else {
                        i2 = 0;
                    }
                    try {
                        openFileInput.close();
                    } catch (IOException unused) {
                    } catch (OutOfMemoryError e) {
                        e = e;
                        Log.i((Throwable) e);
                    }
                } catch (IOException unused2) {
                    i2 = 0;
                } catch (OutOfMemoryError e2) {
                    e = e2;
                    i2 = 0;
                    Log.i((Throwable) e);
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
                if (i == 2 || i == 1) {
                    A022 = AnonymousClass3U7.A02(context, resources);
                } else {
                    if (i == 4) {
                        A022 = AnonymousClass3U7.A01(context, i2, false);
                    }
                    i3 = i2;
                }
                this.A00 = A022;
                this.A02 = AnonymousClass1RC.A0A(context);
                this.A01 = true;
                i3 = i2;
            }
            Drawable drawable = this.A00;
            if (drawable != null) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("wallpaper/get ");
                A0u.append(drawable.getIntrinsicWidth());
                A0u.append("x");
                A0u.append(this.A00.getIntrinsicHeight());
                C36421kH.A1N(A0u);
                Drawable drawable2 = this.A00;
                if (drawable2 instanceof BitmapDrawable) {
                    obj = Integer.valueOf(((BitmapDrawable) drawable2).getBitmap().getByteCount());
                } else {
                    obj = "";
                }
                str = AnonymousClass000.A0o(obj, A0u);
            } else {
                str = "wallpaper/get null";
            }
            Log.i(str);
        } else {
            i = 2;
        }
        String str2 = "DEFAULT";
        if (!(i == 1 || i == 2)) {
            if (i == 4) {
                str2 = "COLOR_ONLY";
            } else if (i == 5) {
                str2 = "DOWNLOADED";
            } else if (this.A00 == null) {
                str2 = "NONE";
            }
        }
        return new AnonymousClass2e7(this.A00, Integer.valueOf(i3), str2);
        throw th;
    }
}
