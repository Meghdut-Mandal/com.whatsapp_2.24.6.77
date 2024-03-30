package X;

import android.content.res.Resources;
import android.os.Handler;

/* renamed from: X.3lD  reason: invalid class name and case insensitive filesystem */
public class C74193lD implements C159437jM {
    public final Resources A00;
    public final Handler A01 = C36341k9.A0H();
    public final int[] A02;
    public final /* synthetic */ C74263lK A03;

    public /* bridge */ /* synthetic */ void BeC(Object obj) {
        AnonymousClass2M9 r3 = new AnonymousClass2M9(this.A02);
        long A002 = C1898996a.A00(r3, false);
        this.A01.post(new AnonymousClass735(this, this.A03.A0C.A04(this.A00, (C159437jM) null, r3, A002), 4, A002));
    }

    public C74193lD(Resources resources, C74263lK r3, int[] iArr) {
        this.A03 = r3;
        this.A02 = iArr;
        this.A00 = resources;
    }

    public void BWY() {
    }
}
