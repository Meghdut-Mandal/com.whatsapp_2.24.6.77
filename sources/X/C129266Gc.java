package X;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6Gc  reason: invalid class name and case insensitive filesystem */
public abstract class C129266Gc {
    public static long A00(Context context, AnonymousClass7ez r9, AnonymousClass5TE r10, C125085zI r11) {
        AnonymousClass6QD r0 = r11.A05;
        if (r0 != null) {
            return AnonymousClass6U7.A00(r9, r10, r0);
        }
        File file = r11.A0A;
        if (file != null) {
            long j = r11.A02;
            if (j < 0) {
                j = 0;
            }
            long j2 = r11.A00;
            if (j2 < 0) {
                Uri fromFile = Uri.fromFile(file);
                AnonymousClass00C.A0D(fromFile, 0);
                AnonymousClass65N A00 = C129256Gb.A00(context, fromFile, false);
                if (A00 == null) {
                    return -1;
                }
                j2 = A00.A07;
            }
            return TimeUnit.MILLISECONDS.toMicros(j2 - j);
        }
        throw new AnonymousClass5VN("No input data source provided");
    }

    public static void A01(AnonymousClass6VP r6, C125085zI r7) {
        AnonymousClass6F3 r0;
        AnonymousClass6QD r1 = r7.A05;
        if (r1 != null) {
            C128956Eg A01 = r1.A01(AnonymousClass5TE.AUDIO, 0);
            C131736Qi.A02(AnonymousClass000.A1V(A01), "get null audio track when setting data source from MediaComposition");
            List list = A01.A01;
            r6.A06 = ((AnonymousClass6F1) C36441kJ.A15(list).get(0)).A01;
            C36441kJ.A15(list).get(0);
            r0 = ((AnonymousClass6F1) C36441kJ.A15(list).get(0)).A00;
        } else {
            File file = r7.A0A;
            if (file != null) {
                r6.A06 = file;
                r0 = new AnonymousClass6F3(TimeUnit.MILLISECONDS, r7.A02, r7.A00);
            } else {
                throw new C98604rh("No valid data source provided");
            }
        }
        r6.A04 = r0;
    }
}
