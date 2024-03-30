package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.6Qz  reason: invalid class name */
public abstract class AnonymousClass6Qz {
    public static byte A00(FileInputStream fileInputStream, long j, long j2) {
        fileInputStream.skip(j - j2);
        int read = fileInputStream.read();
        if (read == -1) {
            return 0;
        }
        byte b = (byte) read;
        if (read >= 100) {
            return 99;
        }
        return b;
    }

    public static ArrayList A01(File file) {
        FileInputStream A0U;
        float f;
        ArrayList A0I = AnonymousClass001.A0I();
        if (file.length() != 0) {
            long length = file.length();
            try {
                A0U = C90524aI.A0U(file);
                for (int i = 0; ((long) i) < length; i++) {
                    byte read = (byte) A0U.read();
                    if (read == -1) {
                        break;
                    }
                    if (read >= 100) {
                        f = 0.99f;
                    } else {
                        f = ((float) read) / 100.0f;
                    }
                    A0I.add(Float.valueOf(f));
                }
                A0U.close();
                return A0I;
            } catch (IOException e) {
                Log.e("WaveformUtil/getWaveformFromFile ", e);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return A0I;
        throw th;
    }

    public static ArrayList A02(File file, int i) {
        FileInputStream A0U;
        byte b;
        ArrayList A0I = AnonymousClass001.A0I();
        if (!(file == null || file.length() == 0)) {
            long length = file.length();
            int i2 = i;
            float f = ((float) length) / ((float) i2);
            try {
                A0U = C90524aI.A0U(file);
                A0I.add(Byte.valueOf(A00(A0U, 0, 0)));
                long j = 1;
                for (int i3 = 1; i3 < i2 - 1; i3++) {
                    float f2 = ((float) i3) * f;
                    double d = (double) f2;
                    long floor = (long) Math.floor(d);
                    long ceil = (long) Math.ceil(d);
                    float f3 = f2 - ((float) floor);
                    byte A00 = A00(A0U, floor, j);
                    j = floor + 1;
                    if (ceil != floor) {
                        b = A00(A0U, ceil, j);
                        j = ceil + 1;
                    } else {
                        b = A00;
                    }
                    A0I.add(Byte.valueOf((byte) ((int) (((float) A00) + (((float) (b - A00)) * f3)))));
                }
                A0I.add(Byte.valueOf(A00(A0U, length - 1, j)));
                A0U.close();
                return A0I;
            } catch (IOException e) {
                Log.e("waveformutil/generateDisplayDataPoints/ error reading visualization file data ", e);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return A0I;
        throw th;
    }
}
