package X;

import android.os.SystemClock;
import com.whatsapp.Main;

/* renamed from: X.0NT  reason: invalid class name */
public class AnonymousClass0NT extends C132446Tt {
    public final /* synthetic */ Main A00;

    public AnonymousClass0NT(Main main) {
        this.A00 = main;
    }

    public void A0A() {
        AnonymousClass3SJ.A01(this.A00, 104);
    }

    public Void A0G() {
        long j;
        Main main = this.A00;
        if (main.A05.A00()) {
            j = 90000;
        } else {
            j = 45000;
        }
        int i = 0;
        while (main.A05.A01() && ((long) i) < j) {
            i += 200;
            SystemClock.sleep(200);
        }
        if (((long) i) < j || !main.A05.A01() || main.A05.A00()) {
            return null;
        }
        ((C20350xQ) main.A0C.get()).A0S(3);
        return null;
    }

    public void A0H() {
        Main main = this.A00;
        AnonymousClass3SJ.A00(main, 104);
        main.A0F();
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return A0G();
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        A0H();
    }
}
