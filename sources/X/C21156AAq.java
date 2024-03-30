package X;

import android.content.DialogInterface;
import android.content.res.Resources;
import com.whatsapp.R;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: X.AAq  reason: case insensitive filesystem */
public class C21156AAq implements AnonymousClass4T4 {
    public final /* synthetic */ C207119ua A00;
    public final /* synthetic */ AH2 A01;
    public final /* synthetic */ C23043B1o A02;
    public final /* synthetic */ String A03;

    public C21156AAq(C207119ua r1, AH2 ah2, C23043B1o b1o, String str) {
        this.A01 = ah2;
        this.A02 = b1o;
        this.A03 = str;
        this.A00 = r1;
    }

    public void BhX() {
        AH2 ah2 = this.A01;
        B3K b3k = ah2.A00;
        if (!b3k.BLF()) {
            ah2.A01.Bnv();
        }
        String str = this.A03;
        if (str == null) {
            b3k.BgH(this.A00);
        } else {
            ah2.A02.A04.A00(new C1498072v(b3k, this.A00, 1), str);
        }
    }

    public void Bha() {
        C207199ui r0;
        AH2 ah2 = this.A01;
        if (ah2.A00.BLF()) {
            C21302AGg aGg = ah2.A02;
            aGg.A0F.A0H(new AVY(aGg, 31));
        } else {
            ah2.A01.Bnv();
        }
        C23043B1o b1o = this.A02;
        C207219uk BA8 = b1o.BA8();
        if (BA8 != null && (r0 = BA8.A01) != null && r0.A09.A02 != null) {
            AnonymousClass155 r9 = ah2.A01;
            Resources resources = r9.getResources();
            Object[] A0L = AnonymousClass001.A0L();
            long j = b1o.BA8().A01.A09.A02.A00;
            C18820ts r6 = ah2.A02.A0H;
            String A0w = C36411kG.A0w(resources, new SimpleDateFormat("HH:mm", C36401kF.A0x(r6)).format(new Date(j * 1000)), A0L, 0, R.string.f12nameremoved);
            C39001qm A002 = AnonymousClass3LW.A00(r9);
            A002.A0r(false);
            A002.A0d(R.string.f12nameremoved);
            A002.A0p(A0w);
            A002.A0h((DialogInterface.OnClickListener) null, R.string.f12nameremoved);
            C36341k9.A11(A002);
        }
    }
}
