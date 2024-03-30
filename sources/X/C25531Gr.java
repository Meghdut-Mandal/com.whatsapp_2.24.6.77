package X;

import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Pair;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;

/* renamed from: X.1Gr  reason: invalid class name and case insensitive filesystem */
public final class C25531Gr {
    public final C19700wN A00;
    public final AnonymousClass1B0 A01;
    public final C25561Gu A02;
    public final C25541Gs A03;

    public C25531Gr(C19700wN r2, AnonymousClass1B0 r3, C25561Gu r4, C25541Gs r5) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r4, 2);
        AnonymousClass00C.A0D(r5, 3);
        AnonymousClass00C.A0D(r3, 4);
        this.A00 = r2;
        this.A02 = r4;
        this.A03 = r5;
        this.A01 = r3;
    }

    public final C122585v5 A00(C122575v4 r8) {
        byte[] bArr;
        byte[] bArr2;
        Pair pair;
        byte[] bArr3;
        int i;
        int i2;
        byte[] bArr4;
        byte[] bArr5;
        Object obj;
        C25471Gl r1 = r8.A00;
        if (AnonymousClass6Y1.A04(r1)) {
            if (!r8.A03) {
                bArr5 = this.A03.A05(Uri.fromFile(r8.A01), 100, 100, 0);
            } else {
                bArr5 = null;
            }
            File file = r8.A01;
            Pair A0C = AnonymousClass1GW.A0C(file);
            try {
                Object obj2 = A0C.second;
                AnonymousClass00C.A07(obj2);
                int intValue = ((Number) obj2).intValue();
                Object obj3 = A0C.first;
                AnonymousClass00C.A07(obj3);
                if (intValue > ((Number) obj3).intValue()) {
                    obj = C111725ck.A00(file);
                } else {
                    obj = null;
                }
            } catch (Throwable th) {
                obj = new AnonymousClass03N(th);
            }
            if (obj instanceof AnonymousClass03N) {
                obj = null;
            }
            return new C122585v5(A0C, (Pair) obj, bArr5, (byte[]) null);
        } else if (r1 == C25471Gl.A0B || r1 == C25471Gl.A0E || r1 == C25471Gl.A0j || r1 == C25471Gl.A0C || r1 == C25471Gl.A0K || r1 == C25471Gl.A0W) {
            try {
                FileInputStream fileInputStream = new FileInputStream(r8.A01);
                try {
                    C107705Qn r3 = new C107705Qn(fileInputStream.available());
                    Objects.requireNonNull(fileInputStream);
                    Objects.requireNonNull(r3);
                    byte[] bArr6 = new byte[ZipDecompressor.UNZIP_BUFFER_SIZE];
                    while (true) {
                        int read = fileInputStream.read(bArr6);
                        if (read == -1) {
                            break;
                        }
                        r3.write(bArr6, 0, read);
                    }
                    bArr = r3.toByteArray();
                    try {
                        fileInputStream.close();
                    } catch (IOException e) {
                        e = e;
                    }
                    return new C122585v5((Pair) null, (Pair) null, bArr, (byte[]) null);
                } catch (Throwable th2) {
                    C05600Qi.A00(fileInputStream, th);
                    throw th2;
                }
            } catch (IOException e2) {
                e = e2;
                bArr = null;
                Log.e("ThumbnailGenerator/createThumbnailForThumbnailDownload/failed", e);
                return new C122585v5((Pair) null, (Pair) null, bArr, (byte[]) null);
            }
        } else if (AnonymousClass1Ax.A04(r1)) {
            if (!r8.A03) {
                C25561Gu r5 = this.A02;
                bArr4 = r5.A04(r8.A01, r8.A02, 1.0f, C20800yB.A00(C21000yV.A02, r5.A01, 6249));
            } else {
                bArr4 = null;
            }
            return new C122585v5((Pair) null, (Pair) null, bArr4, (byte[]) null);
        } else if (AnonymousClass6Y1.A0A(r1)) {
            try {
                C1273567y r2 = new C1273567y(r8.A01);
                if (r2.A02()) {
                    i = r2.A00;
                    i2 = r2.A02;
                } else {
                    i = r2.A02;
                    i2 = r2.A00;
                }
                pair = Pair.create(Integer.valueOf(i), Integer.valueOf(i2));
            } catch (AnonymousClass1GL e3) {
                Log.w("thumbnailgenerator/video/unable to get video meta", e3);
                pair = null;
            }
            if (!r8.A03) {
                bArr3 = C25541Gs.A04(r8.A01);
            } else {
                bArr3 = null;
            }
            return new C122585v5(pair, (Pair) null, bArr3, (byte[]) null);
        } else if (!AnonymousClass6Y1.A07(r1)) {
            return null;
        } else {
            AnonymousClass6FM A002 = this.A01.A00(r8.A01, r8.A02);
            if (r8.A03) {
                if (A002 != null) {
                    bArr2 = A002.A03();
                } else {
                    bArr2 = null;
                }
                return new C122585v5((Pair) null, (Pair) null, (byte[]) null, bArr2);
            }
            if (A002 != null) {
                try {
                    Bitmap A003 = A002.A00();
                    if (A003 != null) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        A003.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        A003.recycle();
                        return new C122585v5(new Pair(64, 64), (Pair) null, byteArray, (byte[]) null);
                    }
                } catch (OutOfMemoryError e4) {
                    Log.e("ThumbnailGenerator/createThumbnailForSticker/failed", e4);
                }
            }
            return new C122585v5((Pair) null, (Pair) null, (byte[]) null, (byte[]) null);
        }
    }
}
