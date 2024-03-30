package X;

import android.content.ContentValues;
import android.text.TextUtils;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;

/* renamed from: X.1YC  reason: invalid class name */
public class AnonymousClass1YC {
    public final AnonymousClass1LO A00;

    public void A00(GroupJid groupJid, int i, int i2) {
        String str;
        C1495671s B1k;
        int i3 = i2;
        if (i2 == 0) {
            str = "reaction_open_tray_count";
        } else if (i3 == 1) {
            str = "reaction_delete_count";
        } else if (i3 != 2) {
            str = "pnh_indicator_clicks_info_screen";
        } else {
            str = "pnh_indicator_clicks_chat";
        }
        AnonymousClass1M0 A04 = this.A00.A04();
        try {
            B1k = A04.B1k();
            C224114e r3 = A04.A02;
            if (!(!TextUtils.isEmpty(C224614k.A00(r3, "table", "pnh_daily_event_logging")))) {
                Log.e("PnhDailyActionLoggingStore/incrementCount: table does not exist");
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("UPDATE ");
                sb.append("pnh_daily_event_logging");
                sb.append(" SET ");
                sb.append(str);
                sb.append(" = ");
                sb.append(str);
                sb.append(" + ?");
                sb.append(" WHERE ");
                sb.append("community_id");
                sb.append(" = ? AND ");
                sb.append("type_of_subgroup");
                sb.append(" = ?");
                AnonymousClass6QI A0C = r3.A0C(sb.toString(), "update_pnh_daily_action");
                A0C.A05(1, 1);
                A0C.A06(2, groupJid.getRawString());
                A0C.A05(3, (long) i);
                if (A0C.A01() == 0) {
                    ContentValues contentValues = new ContentValues(3);
                    contentValues.put("community_id", groupJid.getRawString());
                    contentValues.put("type_of_subgroup", Integer.valueOf(i));
                    contentValues.put(str, 1);
                    r3.A04("pnh_daily_event_logging", "update_pnh_daily_action", contentValues);
                }
                B1k.A00();
            }
            B1k.close();
            A04.close();
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
        throw th;
    }

    public AnonymousClass1YC(AnonymousClass1LO r1) {
        this.A00 = r1;
    }
}
