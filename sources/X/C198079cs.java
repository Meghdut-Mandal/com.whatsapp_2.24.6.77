package X;

import android.net.Uri;
import android.os.Handler;
import android.util.LruCache;

/* renamed from: X.9cs  reason: invalid class name and case insensitive filesystem */
public class C198079cs {
    public final LruCache A00;
    public final LruCache A01;
    public final AnonymousClass9D3 A02;
    public final AUR A03;
    public final Handler A04 = C36341k9.A0H();
    public final B44 A05;

    public static String A00(C195979Xa r2, AUR aur) {
        boolean z = aur.useVideoSourceAsWarmupKey;
        C207239um r3 = r2.A0F;
        if (!z) {
            return r3.A0H;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        String str = r3.A0H;
        if (str != null) {
            A0u.append("\n\tId: ");
            A0u.append(str);
        }
        Uri uri = r3.A05;
        if (uri != null) {
            A0u.append("\n\tUri: ");
            A0u.append(uri);
        }
        return A0u.toString();
    }

    public C198079cs(AnonymousClass9D3 r4, AUR aur, B44 b44) {
        this.A03 = aur;
        this.A02 = r4;
        this.A05 = b44;
        this.A00 = new B6p(this, aur.playerWarmUpPoolSize, 3);
        this.A01 = new B6p(this);
    }
}
