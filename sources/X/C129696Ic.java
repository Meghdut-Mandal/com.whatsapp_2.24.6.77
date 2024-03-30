package X;

import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6Ic  reason: invalid class name and case insensitive filesystem */
public abstract class C129696Ic {
    public static final AtomicInteger A00 = C90514aH.A17();

    public static final C195979Xa A00(Uri uri, Uri uri2, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        AnonymousClass00C.A0D(uri, 0);
        AnonymousClass65L r1 = new AnonymousClass65L(AnonymousClass5RZ.IN_PLAY, C207239um.A00(uri, uri2, String.valueOf(A00.addAndGet(1)), "WA_Player_Origin", "WA_Player_SubOrigin", AnonymousClass001.A0J()), "WA_MEDIA", 0);
        r1.A0C = true;
        r1.A0D = true;
        r1.A0B = z;
        r1.A00 = i;
        r1.A0A = z2;
        r1.A0E = z3;
        r1.A0F = z4;
        return r1.A00();
    }
}
