package X;

import android.content.pm.PackageManager;
import com.whatsapp.util.Log;

/* renamed from: X.1ex  reason: invalid class name and case insensitive filesystem */
public class C33241ex {
    public final AnonymousClass1VC A00;
    public final C33251ey A01;
    public final AnonymousClass1VE A02;
    public final AnonymousClass1ZY A03;

    public void A00(String str) {
        C21100yf r0 = this.A00.A00;
        C21130yi r2 = C21100yf.A0P;
        if (r0.A09(r2)) {
            AnonymousClass1ZY r1 = this.A03;
            if (r1.A01.A00.A09(r2)) {
                AnonymousClass1VD r12 = r1.A02;
                try {
                    if (r12.A02.A01(str).A03) {
                        AnonymousClass005 r02 = (AnonymousClass005) r12.A00.A00.get(str);
                        if (r02 != null) {
                            ((AnonymousClass6FT) r02.get()).A04();
                        }
                        r12.A03.A00(str);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                StringBuilder sb = new StringBuilder();
                sb.append("InstrumentationChangeDispatcher/verification failed, dropping event for package - ");
                sb.append(str);
                Log.w(sb.toString());
            }
            this.A02.A04(str);
        }
    }

    public C33241ex(AnonymousClass1ZY r1, AnonymousClass1VC r2, C33251ey r3, AnonymousClass1VE r4) {
        this.A02 = r4;
        this.A00 = r2;
        this.A03 = r1;
        this.A01 = r3;
    }
}
