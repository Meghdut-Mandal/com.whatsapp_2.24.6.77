package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.whatsapp.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: X.1P3  reason: invalid class name */
public class AnonymousClass1P3 extends AnonymousClass1P2 {
    public final C26861Lu A00;
    public final AnonymousClass17Y A01;
    public final AnonymousClass16D A02;
    public final AnonymousClass16I A03;
    public final AnonymousClass16K A04;
    public final AnonymousClass1O7 A05;
    public final AnonymousClass1O8 A06;
    public final AnonymousClass1AQ A07;
    public final C19600wD A08;
    public final C19970wo A09;
    public final C19420v0 A0A;
    public final C20310xM A0B;
    public final AnonymousClass17X A0C;
    public final C24541Cv A0D;
    public final C20810yC A0E;
    public final C21010yW A0F;
    public final C238019x A0G;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1P3(X.C19460v5 r14, X.C26861Lu r15, X.C20690y0 r16, X.AnonymousClass17Y r17, X.C19730wQ r18, X.C19600wD r19, X.AnonymousClass16D r20, X.AnonymousClass16I r21, X.AnonymousClass16K r22, X.AnonymousClass1O7 r23, X.C21060yb r24, X.C19970wo r25, X.C19420v0 r26, X.C18820ts r27, X.C20310xM r28, X.AnonymousClass17X r29, X.C24541Cv r30, X.C20810yC r31, X.C21010yW r32, X.AnonymousClass1BF r33, X.AnonymousClass1O8 r34, X.C238019x r35, X.AnonymousClass1AQ r36, X.AnonymousClass13J r37, X.C19770wU r38) {
        /*
            r13 = this;
            r1 = r13
            r7 = r24
            r6 = r22
            r5 = r18
            r4 = r17
            r3 = r16
            r12 = r38
            r11 = r37
            r10 = r33
            r9 = r31
            r2 = r14
            r8 = r27
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = r25
            r13.A09 = r0
            r13.A0E = r9
            r13.A01 = r4
            r0 = r32
            r13.A0F = r0
            r0 = r20
            r13.A02 = r0
            r13.A00 = r15
            r0 = r21
            r13.A03 = r0
            r0 = r28
            r13.A0B = r0
            r0 = r36
            r13.A07 = r0
            r0 = r30
            r13.A0D = r0
            r13.A04 = r6
            r0 = r23
            r13.A05 = r0
            r0 = r34
            r13.A06 = r0
            r0 = r35
            r13.A0G = r0
            r0 = r29
            r13.A0C = r0
            r0 = r19
            r13.A08 = r0
            r0 = r26
            r13.A0A = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1P3.<init>(X.0v5, X.1Lu, X.0y0, X.17Y, X.0wQ, X.0wD, X.16D, X.16I, X.16K, X.1O7, X.0yb, X.0wo, X.0v0, X.0ts, X.0xM, X.17X, X.1Cv, X.0yC, X.0yW, X.1BF, X.1O8, X.19x, X.1AQ, X.13J, X.0wU):void");
    }

    public static boolean A00(AnonymousClass141 r7, AnonymousClass1P3 r8, File file, byte[] bArr, boolean z) {
        AnonymousClass35J r6;
        if (!r8.A08.A09()) {
            r8.A01.A06(R.string.f12nameremoved, 0);
            return false;
        }
        if (file != null) {
            r6 = r8.A0C(AnonymousClass6YY.A0V(file));
        } else {
            try {
                C18740tg.A06(bArr);
                r6 = r8.A0C(bArr);
            } catch (FileNotFoundException | IOException e) {
                r8.A01.A06(R.string.f12nameremoved, 0);
                Log.e("profileinfo/sendphoto", e);
                return false;
            }
        }
        AnonymousClass1O8 r3 = r8.A06;
        Jid A062 = r7.A06(AnonymousClass11F.class);
        C18740tg.A06(A062);
        r3.A05(r8.A0B((AnonymousClass11F) A062, r6.A00, r6.A01, z));
        return true;
    }

    public C202899mr A0B(AnonymousClass11F r19, byte[] bArr, byte[] bArr2, boolean z) {
        C19970wo r7 = this.A09;
        AnonymousClass17Y r1 = this.A01;
        C19730wQ r2 = this.A0A;
        C21010yW r11 = this.A0F;
        AnonymousClass16D r3 = this.A02;
        AnonymousClass16I r4 = this.A03;
        C24541Cv r10 = this.A0D;
        return new C202899mr(r1, r2, r3, r4, this.A04, this.A05, r7, this.A0B, this.A0C, r10, r11, r19, this.A06, this.A0G, bArr, bArr2, z);
    }

    public AnonymousClass35J A0C(byte[] bArr) {
        FileOutputStream fileOutputStream;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        options.inDither = true;
        options.inPreferQualityOverSpeed = true;
        Bitmap bitmap = AnonymousClass6Y8.A08((AnonymousClass67H) null, new C130396Kx(options, (Long) null, 96, 96, true), bArr, false).A02;
        if (bitmap != null) {
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(96, 96, config);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setFilterBitmap(true);
            paint.setDither(true);
            canvas.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(0, 0, 96, 96), paint);
            bitmap.recycle();
            try {
                fileOutputStream = new FileOutputStream(this.A01.A0Y("tmpt"));
                createBitmap.compress(Bitmap.CompressFormat.JPEG, 75, fileOutputStream);
                fileOutputStream.close();
            } catch (IOException e) {
                Log.e("profileinfo/sendphoto/cannot save thumb", e);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            createBitmap.recycle();
            File A0Y = this.A01.A0Y("tmpt");
            byte[] bArr2 = new byte[((int) A0Y.length())];
            FileInputStream fileInputStream = new FileInputStream(A0Y);
            try {
                fileInputStream.read(bArr2);
                fileInputStream.close();
                return new AnonymousClass35J(bArr, bArr2);
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        } else {
            Log.e("profileinfo/sendphoto/cannot decode thumb");
            throw new FileNotFoundException();
        }
        throw th;
    }

    public void A0D(AnonymousClass141 r8) {
        if (!this.A08.A09()) {
            this.A01.A06(R.string.f12nameremoved, 0);
            return;
        }
        AnonymousClass1O8 r2 = this.A06;
        Jid A062 = r8.A06(AnonymousClass11F.class);
        C18740tg.A06(A062);
        r2.A05(A0B((AnonymousClass11F) A062, (byte[]) null, (byte[]) null, false));
        C19420v0 r6 = this.A0A;
        if (r6.A0O("privacy_profile_photo", 0) == 0 && r6.A0V("privacy_tip_remove_profile_photo_timestamp") == -1) {
            if (C20800yB.A01(C21000yV.A02, this.A0E, 3998)) {
                r6.A1Z("privacy_tip_remove_profile_photo_timestamp");
            }
        }
    }

    public void A0E(AnonymousClass141 r10) {
        FileInputStream fileInputStream;
        int read;
        AnonymousClass16K r0 = this.A04;
        File A002 = r0.A00(r10);
        File A012 = r0.A01(r10);
        if (A002 != null && A002.exists() && A012 != null && A012.exists()) {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(A012);
                try {
                    fileInputStream = new FileInputStream(A002);
                    int length = (int) A012.length();
                    byte[] bArr = new byte[length];
                    int i = 0;
                    while (i < length && (read = fileInputStream2.read(bArr, i, length - i)) != -1) {
                        i += read;
                    }
                    int length2 = (int) A002.length();
                    byte[] bArr2 = new byte[length2];
                    int i2 = 0;
                    while (i2 < length2) {
                        int read2 = fileInputStream.read(bArr2, i2, length2 - i2);
                        if (read2 == -1) {
                            break;
                        }
                        i2 += read2;
                    }
                    AnonymousClass11F r02 = (AnonymousClass11F) r10.A06(AnonymousClass11F.class);
                    C18740tg.A06(r02);
                    C202899mr A0B2 = A0B(r02, bArr2, bArr, false);
                    A0B2.A01 = true;
                    this.A06.A05(A0B2);
                    fileInputStream.close();
                    fileInputStream2.close();
                    return;
                } catch (Throwable th) {
                    fileInputStream2.close();
                    throw th;
                }
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("profileinfo/resend/jid ");
                sb.append(r10.A0H);
                sb.append("/failed");
                Log.e(sb.toString(), e);
                return;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            return;
        }
        throw th;
    }

    public boolean A0F(AnonymousClass141 r4) {
        return A00(r4, this, this.A04.A00.A0Y("tmpp"), (byte[]) null, false);
    }
}
