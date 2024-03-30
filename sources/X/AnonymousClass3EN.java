package X;

import android.content.Context;
import android.os.Build;
import com.whatsapp.R;

/* renamed from: X.3EN  reason: invalid class name */
public class AnonymousClass3EN {
    public final C19630wG A00;
    public final C236419g A01;
    public final C20810yC A02;
    public final C19460v5 A03;
    public final AnonymousClass1LU A04;

    public C07700Yy A00(String str) {
        if (str == null) {
            str = this.A00.A01(R.string.f12nameremoved);
        }
        Context context = this.A00.A00;
        C07700Yy A0F = C36421kH.A0F(context);
        A0F.A0D = C65743Th.A00(context, 0, AnonymousClass3LZ.A01(context, 3), 0);
        int i = -2;
        if (Build.VERSION.SDK_INT >= 26) {
            i = -1;
        }
        A0F.A09 = i;
        A0F.A0G(str);
        A0F.A0E(str);
        A0F.A0B.icon = R.drawable.notify_web_client_connected;
        return A0F;
    }

    public AnonymousClass3EN(C19460v5 r1, C19630wG r2, C236419g r3, AnonymousClass1LU r4, C20810yC r5) {
        this.A00 = r2;
        this.A02 = r5;
        this.A03 = r1;
        this.A04 = r4;
        this.A01 = r3;
    }
}
