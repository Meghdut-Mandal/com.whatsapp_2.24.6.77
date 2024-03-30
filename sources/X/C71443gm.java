package X;

import android.database.Cursor;
import com.whatsapp.util.Log;

/* renamed from: X.3gm  reason: invalid class name and case insensitive filesystem */
public final class C71443gm implements C159417jK {
    public final C19420v0 A00;
    public final C20310xM A01;
    public final C20810yC A02;

    public void BV1() {
        Cursor A09;
        long j;
        C20810yC r1 = this.A02;
        C19420v0 r4 = this.A00;
        if (C54012sG.A00(r4, r1)) {
            int A07 = r1.A07(5419);
            int A072 = r1.A07(5483);
            C20310xM r6 = this.A01;
            String[] A1S = C36441kJ.A1S();
            C36341k9.A1W(A1S, C19970wo.A00(r6.A0C) - C36371kC.A07(A072));
            A1S[1] = String.valueOf(A07);
            AnonymousClass1M0 A04 = r6.A0c.get();
            try {
                A09 = A04.A02.A09("SELECT COUNT(*) as count FROM (SELECT * FROM available_message_view WHERE message_type = 81 AND from_me = 1  AND timestamp > ? LIMIT ?)", "SELECT_RECENTLY_SENT_PTV_COUNT", A1S);
                if (A09.moveToFirst()) {
                    j = C36351kA.A07(A09, "count");
                } else {
                    j = -1;
                }
                A09.close();
                A04.close();
                if (j == -1) {
                    Log.e("PushToVideoGating/maybeUpdatePushToVideoSettingDefault unable to get recently sent PTV count");
                    return;
                }
                AnonymousClass3J3 r3 = new AnonymousClass3J3(A07, A072, C36401kF.A1U((j > ((long) A07) ? 1 : (j == ((long) A07) ? 0 : -1))));
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append(r3.A01);
                A0u.append(',');
                A0u.append(r3.A00);
                A0u.append(',');
                C36341k9.A0x(C19420v0.A00(r4), "push_to_video_sending_enabled_default_info", C36381kD.A10(A0u, r3.A02 ? 1 : 0));
                return;
            } catch (Throwable th) {
                try {
                    A04.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } else {
            return;
        }
        throw th;
    }

    public C71443gm(C19420v0 r1, C20310xM r2, C20810yC r3) {
        C36321k7.A11(r3, r1, r2);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
