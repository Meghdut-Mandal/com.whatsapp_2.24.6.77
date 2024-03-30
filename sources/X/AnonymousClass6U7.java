package X;

import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6U7  reason: invalid class name */
public abstract class AnonymousClass6U7 {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r6.isEmpty() != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long A01(X.AnonymousClass7ez r8, X.C128956Eg r9) {
        /*
            java.util.List r0 = r9.A04
            java.util.ArrayList r7 = X.C36441kJ.A15(r0)
            java.util.List r0 = r9.A03
            java.util.ArrayList r6 = X.C36441kJ.A15(r0)
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0019
            boolean r0 = r6.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x001a
        L_0x0019:
            r1 = 1
        L_0x001a:
            java.lang.String r0 = "only timelinespeed or pts mutator may be populated."
            X.C131736Qi.A02(r1, r0)
            java.util.List r0 = r9.A01
            java.util.Iterator r2 = X.C90474aD.A0r(r0)
            r4 = 0
        L_0x0027:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0039
            java.lang.Object r0 = r2.next()
            X.6F1 r0 = (X.AnonymousClass6F1) r0
            long r0 = A02(r8, r0)
            long r4 = r4 + r0
            goto L_0x0027
        L_0x0039:
            java.util.Iterator r1 = r7.iterator()
            r2 = 0
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x004f
            r1.next()
            java.lang.String r0 = "getTargetTimeRange"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x004f:
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0069
            java.util.Iterator r1 = r6.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0069
            r1.next()
            java.lang.String r0 = "getSourceTimeRange"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0069:
            long r4 = r4 - r2
            long r4 = r4 + r2
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6U7.A01(X.7ez, X.6Eg):long");
    }

    public static long A02(AnonymousClass7ez r11, AnonymousClass6F1 r12) {
        int i;
        File file = r12.A01;
        if ("image/gif".equals(C109715Yq.A00(file.getPath(), "video/mp4"))) {
            try {
                FileInputStream A0U = C90524aI.A0U(file);
                try {
                    AnonymousClass6Ws r7 = new AnonymousClass6Ws(A0U, (OutputStream) null);
                    r7.A04();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    if (r7.A01) {
                        List list = r7.A05;
                        int size = list.size();
                        int i2 = 0;
                        int i3 = 0;
                        while (i2 < size) {
                            if (r7.A01) {
                                if (i2 >= list.size()) {
                                    i = 1;
                                } else {
                                    i = ((int[]) list.get(i2))[1];
                                }
                                i3 += i;
                                i2++;
                            } else {
                                throw AnonymousClass001.A09("getFrameDurationMs called before extract");
                            }
                        }
                        return timeUnit.toMicros((long) i3);
                    }
                    throw AnonymousClass001.A09("getFrameCount called before extract");
                } finally {
                    th = th;
                    try {
                        A0U.close();
                    } catch (IOException unused) {
                        throw th;
                    }
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } else if (r12.A01()) {
            return -1;
        } else {
            AnonymousClass6F3 r5 = r12.A00;
            TimeUnit timeUnit2 = TimeUnit.MICROSECONDS;
            long j = r5.A01;
            TimeUnit timeUnit3 = r5.A02;
            long convert = timeUnit2.convert(j, timeUnit3);
            long convert2 = timeUnit2.convert(r5.A00, timeUnit3);
            if (convert < 0) {
                convert = 0;
            }
            if (convert2 <= 0) {
                try {
                    Objects.requireNonNull(r11);
                    convert2 = TimeUnit.MILLISECONDS.toMicros(r11.B78(Uri.fromFile(file)).A07);
                } catch (IllegalArgumentException unused2) {
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[4];
                    AnonymousClass000.A1N(objArr, 0, file.exists());
                    AnonymousClass000.A1N(objArr, 1, file.canRead());
                    objArr[2] = file.getPath();
                    objArr[3] = file.getCanonicalPath();
                    throw AnonymousClass001.A08(String.format(locale, "mediaMetadataExtractor.extractMediaMetadata IllegalArgumentException. exists: %b, canRead: %b, path: %s, canonicalPath: %s", objArr));
                }
            }
            return convert2 - convert;
        }
    }

    public static long A00(AnonymousClass7ez r8, AnonymousClass5TE r9, AnonymousClass6QD r10) {
        int size;
        HashMap A03 = r10.A03(r9);
        int i = 0;
        if (A03 == null) {
            size = 0;
        } else {
            size = A03.size();
        }
        long j = -1;
        while (i < size) {
            if (r10.A01(r9, i) != null) {
                j = Math.max(j, 0 + A01(r8, r10.A01(r9, i)));
                i++;
            } else {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("No track available for ");
                throw C90464aC.A0M(r9.name(), A0u);
            }
        }
        return j;
    }

    public static void A03(AnonymousClass5TE r1, AnonymousClass6QD r2) {
        Iterator A10 = C36371kC.A10(r2.A02(r1));
        while (A10.hasNext()) {
            Iterator A13 = C90514aH.A13(C36351kA.A0u(A10));
            if (A13.hasNext()) {
                A13.next();
                throw AnonymousClass001.A0A("getMediaEffect");
            }
        }
    }
}
