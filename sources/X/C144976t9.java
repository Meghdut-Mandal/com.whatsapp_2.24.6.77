package X;

import android.media.MediaCodec;
import android.util.Pair;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6t9  reason: invalid class name and case insensitive filesystem */
public class C144976t9 implements AnonymousClass7gT {
    public final C19420v0 A00;
    public final C20810yC A01;

    public void Bcw(AnonymousClass591 r16) {
        int i;
        C20810yC r5 = this.A01;
        boolean A0E = r5.A0E(422);
        Pair[] pairArr = new Pair[4];
        pairArr[0] = C36441kJ.A0Q("video/av01", "av1");
        pairArr[1] = C36441kJ.A0Q("video/avc", "avc");
        pairArr[2] = C36441kJ.A0Q("video/hevc", "hevc");
        AnonymousClass591 r2 = r16;
        r2.A1i = A00(C90524aI.A0p(C36441kJ.A0Q("video/x-vnd.on2.vp9", "vp9"), pairArr, 3), true);
        Pair[] pairArr2 = new Pair[4];
        pairArr2[0] = C36441kJ.A0Q("video/av01", "av1");
        pairArr2[1] = C36441kJ.A0Q("video/avc", "avc");
        pairArr2[2] = C36441kJ.A0Q("video/hevc", "hevc");
        r2.A1h = A00(C90524aI.A0p(C36441kJ.A0Q("video/x-vnd.on2.vp9", "vp9"), pairArr2, 3), false);
        int A02 = C146526vk.A02(A0E);
        if (A02 == 1) {
            i = 0;
        } else if (A02 == 2) {
            i = 2;
        } else if (A02 != 3) {
            i = null;
        } else {
            i = 3;
        }
        r2.A0d = i;
        if (r5.A0E(8033)) {
            r2.A0j = Integer.valueOf(C36341k9.A0E(this.A00).getInt("original_media_quality", 0));
        }
    }

    public C144976t9(C19420v0 r1, C20810yC r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public static String A00(List list, boolean z) {
        boolean z2;
        StringBuilder A0u = AnonymousClass000.A0u();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) pair.first;
            if (z) {
                try {
                    MediaCodec.createEncoderByType(str).release();
                } catch (Exception unused) {
                    z2 = false;
                }
            } else {
                MediaCodec.createDecoderByType(str).release();
            }
            z2 = true;
            if (z2) {
                if (A0u.length() != 0) {
                    C90504aG.A1M(A0u);
                }
                A0u.append((String) pair.second);
            }
        }
        return A0u.toString();
    }
}
