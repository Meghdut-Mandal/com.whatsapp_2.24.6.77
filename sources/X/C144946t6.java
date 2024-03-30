package X;

import android.content.Context;
import java.util.Locale;

/* renamed from: X.6t6  reason: invalid class name and case insensitive filesystem */
public class C144946t6 implements AnonymousClass7gT {
    public final C21100yf A00;
    public final C24431Ck A01;
    public final C19630wG A02;
    public final C19420v0 A03;

    public void Bcw(AnonymousClass591 r17) {
        int i;
        int i2;
        Context context = this.A02.A00;
        AnonymousClass591 r6 = r17;
        r6.A0K = Boolean.valueOf(AnonymousClass000.A1Q(C34201gc.A00(context)));
        r6.A13 = Long.valueOf(AnonymousClass1L0.A00(context, "com.google.android.gms"));
        r6.A02 = Boolean.valueOf(this.A00.A09(C21100yf.A0z));
        r6.A01 = Boolean.valueOf(C34191gb.A08(context));
        r6.A0q = Long.valueOf(C90474aD.A09(this.A01.A03.A2I() ? 1 : 0));
        C19420v0 r8 = this.A03;
        int A0C = r8.A0C();
        if (A0C == 0) {
            i = 0;
        } else if (A0C != 1) {
            int i3 = 2;
            if (A0C != 2) {
                i3 = 3;
                if (A0C != 3) {
                    i3 = 4;
                    if (A0C != 4) {
                        C36321k7.A1S("alarm-service/update-expensive-fieldstats/gdrive-backup/unexpected-frequency/", AnonymousClass000.A0u(), A0C);
                        i = Integer.valueOf(A0C);
                    }
                }
            }
            i = Integer.valueOf(i3);
        } else {
            i = 1;
        }
        r6.A0f = i;
        String A0c = r8.A0c();
        if (A0c != null) {
            long A0T = r8.A0T(A0c);
            if (!(A0T == 0 || A0T == -1)) {
                Locale locale = Locale.ENGLISH;
                Long valueOf = Long.valueOf(A0T);
                C90494aF.A1J("alarm-service/update-expensive-fieldstats/last-backup-timestamp/%d", locale, new Object[]{valueOf});
                r6.A17 = valueOf;
            }
            long A0U = r8.A0U(A0c);
            if (A0T != -1) {
                Locale locale2 = Locale.ENGLISH;
                Long valueOf2 = Long.valueOf(A0U);
                C90494aF.A1J("alarm-service/update-expensive-fieldstats/last-cloud-backup-size/%d", locale2, new Object[]{valueOf2});
                r6.A18 = valueOf2;
            }
            int A0D = r8.A0D();
            if (A0D == 0) {
                i2 = 0;
            } else if (A0D != 1) {
                C36321k7.A1S("alarm-service/update-expensive-fieldstats/gdrive-backup/unexpected-network-setting/", AnonymousClass000.A0u(), A0D);
                i2 = Integer.valueOf(A0D);
            } else {
                i2 = 1;
            }
            r6.A0e = i2;
        }
    }

    public C144946t6(C21100yf r1, C24431Ck r2, C19630wG r3, C19420v0 r4) {
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
    }
}
