package X;

import android.os.Handler;
import android.view.View;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.5Lm  reason: invalid class name and case insensitive filesystem */
public final class C106825Lm extends C33541fX {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ C132686Uv A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ Runnable A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;

    public C106825Lm(Handler handler, C132686Uv r2, Integer num, Runnable runnable, String str, String str2, List list) {
        this.A01 = r2;
        this.A00 = handler;
        this.A06 = list;
        this.A03 = runnable;
        this.A05 = str;
        this.A02 = num;
        this.A04 = str2;
    }

    public void A02(View view) {
        C132686Uv r10 = this.A01;
        Handler handler = this.A00;
        List list = this.A06;
        handler.removeCallbacks(this.A03);
        C1498272x.A00(r10.A04, r10, list, 8);
        C132686Uv.A01((C33541fX) null, r10, this.A05, R.string.f12nameremoved, 0, false);
        ((C64583Oo) C36411kG.A0v(r10.A06)).A01((Boolean) null, this.A02, (Integer) null, (Integer) null, this.A04, list, 2, false);
        C132686Uv.A02(r10);
    }
}
