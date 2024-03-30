package X;

import android.graphics.Rect;
import android.os.Handler;
import java.util.List;

/* renamed from: X.3B4  reason: invalid class name */
public class AnonymousClass3B4 {
    public C61283Bg A00;
    public boolean A01 = false;
    public final Rect A02 = AnonymousClass001.A06();
    public final Rect A03 = AnonymousClass001.A06();
    public final Handler A04;
    public final C159017ie A05;
    public final C61973Ef A06;
    public final C56952xQ A07;
    public final AnonymousClass3PT A08;
    public final Runnable A09;
    public final List A0A = AnonymousClass001.A0I();
    public final List A0B = AnonymousClass001.A0I();

    public AnonymousClass3B4(Handler handler, C159017ie r3, C61973Ef r4, C56952xQ r5, AnonymousClass3PT r6) {
        this.A06 = r4;
        this.A05 = r3;
        this.A08 = r6;
        this.A07 = r5;
        this.A04 = handler;
        this.A09 = new C81283wl(this);
    }
}
