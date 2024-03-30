package X;

import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import java.util.Collections;

/* renamed from: X.17n  reason: invalid class name and case insensitive filesystem */
public class C231917n {
    public C20070wy A00;
    public final C19970wo A01;
    public final C232017o A02;

    public C20070wy A00() {
        C20070wy r0;
        Cursor A09;
        synchronized (this) {
            if (this.A00 == null) {
                AnonymousClass1M0 A03 = this.A02.get();
                try {
                    A09 = A03.A02.A09(C56222vw.A00, "getDevices/QUERY_DEVICES", (String[]) null);
                    int columnIndexOrThrow = A09.getColumnIndexOrThrow("device_id");
                    int columnIndexOrThrow2 = A09.getColumnIndexOrThrow("platform_type");
                    int columnIndexOrThrow3 = A09.getColumnIndexOrThrow("device_os");
                    int columnIndexOrThrow4 = A09.getColumnIndexOrThrow("last_active");
                    int columnIndexOrThrow5 = A09.getColumnIndexOrThrow("login_time");
                    int columnIndexOrThrow6 = A09.getColumnIndexOrThrow("logout_time");
                    int columnIndexOrThrow7 = A09.getColumnIndexOrThrow("adv_key_index");
                    int columnIndexOrThrow8 = A09.getColumnIndexOrThrow("full_sync_required");
                    int columnIndexOrThrow9 = A09.getColumnIndexOrThrow("place_name");
                    int columnIndexOrThrow10 = A09.getColumnIndexOrThrow("nickname");
                    int columnIndexOrThrow11 = A09.getColumnIndexOrThrow("support_bot_user_agent_chat_history");
                    int columnIndexOrThrow12 = A09.getColumnIndexOrThrow("support_cag_reactions_and_polls_history");
                    int columnIndexOrThrow13 = A09.getColumnIndexOrThrow("support_recent_sync_chunk_message_tuning");
                    C20090x0 r6 = new C20090x0();
                    while (A09.moveToNext()) {
                        DeviceJid nullable = DeviceJid.getNullable(A09.getString(columnIndexOrThrow));
                        if (nullable != null) {
                            C52782qA A002 = C52782qA.A00(A09.getInt(columnIndexOrThrow2));
                            boolean z = false;
                            if (A09.getInt(columnIndexOrThrow11) == 1) {
                                z = true;
                            }
                            boolean z2 = false;
                            if (A09.getInt(columnIndexOrThrow12) == 1) {
                                z2 = true;
                            }
                            C198959eT r4 = new C198959eT(z, z2, C224014d.A03(A09, columnIndexOrThrow13));
                            String string = A09.getString(columnIndexOrThrow3);
                            long j = A09.getLong(columnIndexOrThrow4);
                            long j2 = A09.getLong(columnIndexOrThrow5);
                            long j3 = A09.getLong(columnIndexOrThrow6);
                            int i = A09.getInt(columnIndexOrThrow7);
                            boolean z3 = false;
                            if (1 == A09.getInt(columnIndexOrThrow8)) {
                                z3 = true;
                            }
                            r6.put(nullable, new AnonymousClass3SB(r4, nullable, A002, string, A09.getString(columnIndexOrThrow9), A09.getString(columnIndexOrThrow10), i, j, j2, j3, z3));
                        }
                    }
                    this.A00 = r6.build();
                    A09.close();
                    A03.close();
                } catch (Throwable th) {
                    try {
                        A03.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            r0 = this.A00;
        }
        return r0;
        throw th;
    }

    public void A01(C20760y7 r8) {
        AnonymousClass1M0 A04 = this.A02.A04();
        try {
            C1495671s B1k = A04.B1k();
            try {
                synchronized (this) {
                    String[] A0O = AnonymousClass143.A0O(r8);
                    String join = TextUtils.join(", ", Collections.nCopies(A0O.length, "?"));
                    StringBuilder sb = new StringBuilder();
                    sb.append("device_id IN (");
                    sb.append(join);
                    sb.append(")");
                    A04.A02.A03("devices", sb.toString(), "removeDevices/DELETE_DEVICES", A0O);
                    B1k.A00();
                    this.A00 = null;
                }
                B1k.close();
                A04.close();
            } catch (Throwable th) {
                B1k.close();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                A04.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public C231917n(C19700wN r3, C19970wo r4, C19630wG r5, AnonymousClass11g r6, AnonymousClass12S r7) {
        this.A01 = r4;
        this.A02 = new C232017o(r5.A00, r3, r6, r7);
    }
}
