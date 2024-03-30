package X;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6Qh  reason: invalid class name and case insensitive filesystem */
public abstract class C131726Qh {
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C121025sT A00(X.C114965i7 r4) {
        /*
            java.lang.String r0 = "audio/"
            java.util.ArrayList r4 = A02(r4, r0)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x000e
            r0 = 0
            return r0
        L_0x000e:
            java.util.Iterator r3 = r4.iterator()
        L_0x0012:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x003f
            java.lang.Object r2 = r3.next()
            X.5sT r2 = (X.C121025sT) r2
            java.lang.String r1 = r2.A02
            X.5Tf r0 = X.C108365Tf.CODEC_AUDIO_AAC
            java.lang.String r0 = r0.value
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0034
            X.5Tf r0 = X.C108365Tf.CODEC_AUDIO_MP3
            java.lang.String r0 = r0.value
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x0012
        L_0x0034:
            int r1 = r4.size()
            r0 = 1
            if (r1 <= r0) goto L_0x003e
            A01(r4)
        L_0x003e:
            return r2
        L_0x003f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unsupported audio codec. Contained "
            r1.append(r0)
            java.lang.String r0 = A01(r4)
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)
            X.4rf r0 = new X.4rf
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C131726Qh.A00(X.5i7):X.5sT");
    }

    public static String A01(List list) {
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0I.add(((C121025sT) it.next()).A02);
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        C36371kC.A1R("", A0u, list);
        A0u.append(" tracks: ");
        Iterator it2 = A0I.iterator();
        StringBuilder A0u2 = AnonymousClass000.A0u();
        if (it2.hasNext()) {
            while (true) {
                A0u2.append(it2.next());
                if (!it2.hasNext()) {
                    break;
                }
                A0u2.append(", ");
            }
        } else {
            A0u2.append("null, input is empty");
        }
        C36351kA.A1K(A0u2, A0u);
        return A0u.toString();
    }

    public static ArrayList A02(C114965i7 r7, String str) {
        ArrayList A0I = AnonymousClass001.A0I();
        MediaExtractor mediaExtractor = r7.A00;
        int trackCount = mediaExtractor.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
            String string = trackFormat.getString("mime");
            if (string != null && string.startsWith(str)) {
                A0I.add(new C121025sT(trackFormat, string, i));
            }
        }
        return A0I;
    }
}
