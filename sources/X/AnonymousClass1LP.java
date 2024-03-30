package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.1LP  reason: invalid class name */
public class AnonymousClass1LP {
    public final AnonymousClass1LO A00;

    public synchronized boolean A00(int i, long j) {
        String str;
        C1495671s B1k;
        boolean z;
        if (i == 0) {
            str = "poll_votes";
        } else if (i == 1) {
            str = "poll_votes_changed";
        } else if (i == 2) {
            str = "poll_vote_deletes";
        } else if (i != 3) {
            str = "users_participated";
        } else {
            str = "option_count";
        }
        AnonymousClass1M0 A04 = this.A00.A04();
        try {
            B1k = A04.B1k();
            C224114e r2 = A04.A02;
            z = false;
            if (!(!TextUtils.isEmpty(C224614k.A00(r2, "table", "poll_event_logging")))) {
                Log.e("PollDailyActionLoggingStore/incrementCount: table does not exist");
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("UPDATE ");
                sb.append("poll_event_logging");
                sb.append(" SET ");
                sb.append(str);
                sb.append(" = ");
                sb.append(str);
                sb.append(" + ?");
                sb.append(" WHERE ");
                sb.append("poll_id");
                sb.append(" = ?");
                AnonymousClass6QI A0C = r2.A0C(sb.toString(), "update_poll_action");
                A0C.A05(1, 1);
                A0C.A05(2, j);
                int A01 = A0C.A01();
                B1k.A00();
                if (A01 != 0) {
                    z = true;
                }
            }
            B1k.close();
            A04.close();
        } catch (Throwable th) {
            try {
                A04.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
        return z;
        throw th;
    }

    public AnonymousClass1LP(AnonymousClass1LO r1) {
        this.A00 = r1;
    }
}
