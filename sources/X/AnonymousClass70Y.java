package X;

import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.70Y  reason: invalid class name */
public final /* synthetic */ class AnonymousClass70Y implements C25711Hj {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ long A06;
    public final /* synthetic */ long A07;
    public final /* synthetic */ long A08;
    public final /* synthetic */ long A09;
    public final /* synthetic */ long A0A;
    public final /* synthetic */ long A0B;
    public final /* synthetic */ AnonymousClass3I3 A0C;
    public final /* synthetic */ DeviceJid A0D;
    public final /* synthetic */ C146506vi A0E;
    public final /* synthetic */ C24581Cz A0F;
    public final /* synthetic */ C99784tx A0G;
    public final /* synthetic */ File A0H;
    public final /* synthetic */ String A0I;
    public final /* synthetic */ String A0J;

    public /* synthetic */ AnonymousClass70Y(AnonymousClass3I3 r3, DeviceJid deviceJid, C146506vi r5, C24581Cz r6, C99784tx r7, File file, String str, String str2, int i, int i2, int i3, int i4, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.A0F = r6;
        this.A0H = file;
        this.A0E = r5;
        this.A02 = i;
        this.A0C = r3;
        this.A0J = str;
        this.A03 = i2;
        this.A0G = r7;
        this.A0A = j;
        this.A0B = j2;
        this.A00 = i3;
        this.A0D = deviceJid;
        this.A04 = j3;
        this.A05 = j4;
        this.A06 = j5;
        this.A07 = j6;
        this.A01 = i4;
        this.A08 = j7;
        this.A0I = str2;
        this.A09 = j8;
    }

    public final void accept(Object obj) {
        C123865xD A042;
        C24581Cz r2 = this.A0F;
        File file = this.A0H;
        C146506vi r5 = this.A0E;
        int i = this.A02;
        AnonymousClass3I3 r42 = this.A0C;
        String str = this.A0J;
        int i2 = this.A03;
        C99784tx r3 = this.A0G;
        long j = this.A0A;
        long j2 = this.A0B;
        int i3 = this.A00;
        DeviceJid deviceJid = this.A0D;
        long j3 = this.A04;
        long j4 = this.A05;
        long j5 = this.A06;
        long j6 = this.A07;
        int i4 = this.A01;
        long j7 = this.A08;
        String str2 = this.A0I;
        long j8 = this.A09;
        Number number = (Number) obj;
        if (!file.delete()) {
            C36321k7.A1L(file, "history-sync-send-methods/failed to delete temp file: ", AnonymousClass000.A0u());
        }
        C21010yW r8 = r2.A0R;
        AnonymousClass1D0 r14 = r2.A0W;
        int intValue = number.intValue();
        r8.Bly(r14.A0A(r5, intValue, 8).A00);
        r5.A05();
        if (intValue != 0 || (A042 = r5.A04()) == null) {
            int i5 = i3;
            C24581Cz.A04(r42, r2, str, i, i5, 3, (long) i2, (long) ((C100064uP) r3.A00).conversations_.size(), j, j2);
            if (i != 2 && i != 3) {
                return;
            }
            if (i4 > 0) {
                Log.w("history-sync-send-methods/handleMMSFailure retry more than once");
            } else if (r2.A0Q.A0E(4879)) {
                r2.A0O.A03(new AnonymousClass6E9(r42, deviceJid, i, i5, 3, -1, j4, j3, j5, j6, 0, 0, -1, 0));
            }
        } else {
            if (i == 0) {
                r2.A0N.A01(true);
            }
            C129146Fj r52 = A042.A02;
            String A032 = r52.A03();
            String A062 = r52.A06();
            String A052 = r52.A05();
            C132046Rx A002 = r52.A00();
            if (A002 == null || TextUtils.isEmpty(A032) || TextUtils.isEmpty(A062) || TextUtils.isEmpty(A052)) {
                C24581Cz.A04(r42, r2, str, i, i3, 4, (long) i2, (long) ((C100064uP) r3.A00).conversations_.size(), j, j2);
                return;
            }
            C24581Cz.A03(r42, deviceJid, A002, r2, r3, str, str2, A032, A062, A052, i3, i, i2, i4, j7, j3, j4, j5, j, j8, j2, false);
        }
    }
}
