package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.R;
import com.whatsapp.migration.export.ui.ExportMigrationActivity;

/* renamed from: X.6Sl  reason: invalid class name and case insensitive filesystem */
public class C132156Sl {
    public final C19630wG A00;
    public final C25271Fq A01;
    public final C18820ts A02;

    public static void A01(C132156Sl r4, String str, String str2, int i, boolean z) {
        boolean z2 = true;
        int i2 = 100;
        if (i == -1) {
            z2 = false;
            i2 = 0;
            i = 0;
        }
        C07700Yy A002 = A00(r4);
        A002.A07(i2, i, false);
        A002.A0I(z);
        A002.A0J(z2);
        A002.A0F(str);
        A002.A0E(str2);
        r4.A01.A02(31, A002.A05());
    }

    public static C07700Yy A00(C132156Sl r3) {
        Context context = r3.A00.A00;
        Intent A0H = C36441kJ.A0H(context, ExportMigrationActivity.class);
        A0H.setAction("com.whatsapp.export.ACTION_OPENED_VIA_NOTIFICATION");
        C07700Yy A0F = C36421kH.A0F(context);
        A0F.A09 = C90494aF.A0p();
        A0F.A0D = C65743Th.A03(context, A0H, 0);
        C36361kB.A1A(A0F);
        A0F.A0A = 1;
        return A0F;
    }

    public void A02(int i) {
        Context context = this.A00.A00;
        String string = context.getResources().getString(R.string.f12nameremoved);
        if (i >= 0) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("MessagesExporterNotificationManager/onProgress (");
            A0u.append(i);
            C36321k7.A1a(A0u, "%)");
            A01(this, string, C36411kG.A0w(context.getResources(), C90494aF.A0b(this.A02, i), AnonymousClass001.A0L(), 0, R.string.f12nameremoved), i, false);
        }
    }

    public C132156Sl(C19630wG r1, C25271Fq r2, C18820ts r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
