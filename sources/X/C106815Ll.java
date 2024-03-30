package X;

import android.os.Handler;
import android.view.View;
import java.util.List;

/* renamed from: X.5Ll  reason: invalid class name and case insensitive filesystem */
public final class C106815Ll extends C33541fX {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ C122805vS A01;
    public final /* synthetic */ C132686Uv A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ Runnable A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;

    public C106815Ll(Handler handler, C122805vS r2, C132686Uv r3, Integer num, Runnable runnable, String str, List list) {
        this.A02 = r3;
        this.A00 = handler;
        this.A06 = list;
        this.A04 = runnable;
        this.A01 = r2;
        this.A03 = num;
        this.A05 = str;
    }

    public void A02(View view) {
        C132686Uv r3 = this.A02;
        Handler handler = this.A00;
        List list = this.A06;
        handler.removeCallbacks(this.A04);
        C1498272x.A00(r3.A04, r3, list, 8);
        C122805vS r0 = this.A01;
        C34901hp.A01(r0.A01, r0.A02, r0.A03);
        ((C64583Oo) C36411kG.A0v(r3.A06)).A01((Boolean) null, this.A03, (Integer) null, (Integer) null, this.A05, list, 2, true);
        C132686Uv.A02(r3);
    }
}
