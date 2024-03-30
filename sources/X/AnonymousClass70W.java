package X;

import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.70W  reason: invalid class name */
public final /* synthetic */ class AnonymousClass70W implements C25711Hj {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Pair A01;
    public final /* synthetic */ C160447l1 A02;
    public final /* synthetic */ AnonymousClass1D0 A03;
    public final /* synthetic */ C146496vh A04;
    public final /* synthetic */ C131516Pj A05;
    public final /* synthetic */ File A06;
    public final /* synthetic */ String A07;

    public /* synthetic */ AnonymousClass70W(Pair pair, C160447l1 r2, AnonymousClass1D0 r3, C146496vh r4, C131516Pj r5, File file, String str, long j) {
        this.A03 = r3;
        this.A04 = r4;
        this.A05 = r5;
        this.A02 = r2;
        this.A07 = str;
        this.A06 = file;
        this.A01 = pair;
        this.A00 = j;
    }

    public final void accept(Object obj) {
        AnonymousClass1D0 r9 = this.A03;
        C146496vh r5 = this.A04;
        C131516Pj r2 = this.A05;
        C160447l1 r4 = this.A02;
        String str = this.A07;
        File file = this.A06;
        Pair pair = this.A01;
        long j = this.A00;
        C123865xD r12 = (C123865xD) obj;
        C21010yW r8 = r9.A04;
        C124935z2 r10 = r5.A00;
        C132976Wa r11 = r5.A01;
        int i = r12.A00;
        r8.Bly(r9.A09(r10, r11, r12, i, 1, 0).A00);
        C129146Fj r52 = r12.A02;
        C132046Rx A002 = r52.A00();
        if (i == 0 && ((!r2.A02.A0D || A002 != null) && r52.A03() != null)) {
            File A0Z = r9.A00.A0Z(r52.A03());
            try {
                AnonymousClass6YY.A0C(r9.A0E, file, A0Z);
                C132046Rx A003 = r52.A00();
                AnonymousClass3L1 r92 = new AnonymousClass3L1();
                r92.A04 = r52.A03();
                if (A003 != null) {
                    r92.A0A = A003.A01;
                    r92.A02 = A003.A00;
                }
                r92.A05 = r52.A05();
                r92.A08 = r52.A06();
                r92.A01 = C36381kD.A03(pair);
                r92.A00 = C36381kD.A04(pair);
                r92.A03 = C36441kJ.A0A(j);
                r92.A06 = r52.A04();
                r4.BrG(r92, str);
                return;
            } catch (IOException e) {
                Object[] A1b = C36411kG.A1b(file);
                A1b[1] = A0Z;
                Log.w(String.format("MediaJobManager/renameThumbnailFileToMmsDirectPath Fail to rename from %s to %s.", A1b), e);
                AnonymousClass6YY.A0P(A0Z);
            }
        }
        r4.BrE(str);
    }
}
