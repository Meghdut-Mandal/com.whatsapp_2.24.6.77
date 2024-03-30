package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.3uh  reason: invalid class name and case insensitive filesystem */
public final class C80043uh implements C88674Tp {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C35011i0 A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ String A03;

    public C80043uh(Context context, C35011i0 r2, Integer num, String str) {
        this.A01 = r2;
        this.A00 = context;
        this.A02 = num;
        this.A03 = str;
    }

    public void BXT(AnonymousClass5VM r8, Integer num, Integer num2) {
        this.A01.A01(this.A00, r8, num, num2, this.A03, false);
    }

    public void BeD(List list) {
        C35011i0 r2 = this.A01;
        r2.A03.Boy(new C1502774q(r2, this.A00, list, this.A02, this.A03, 11));
    }
}
