package X;

import android.database.Cursor;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;

/* renamed from: X.1C3  reason: invalid class name */
public class AnonymousClass1C3 implements C19680wL {
    public final C21100yf A00;
    public final C24571Cy A01;
    public final C25771Hp A02;
    public final AnonymousClass1AB A03;
    public final C237119n A04;
    public final AnonymousClass1A6 A05;
    public final C19970wo A06;
    public final C24541Cv A07;
    public final C24561Cx A08;
    public final C233017y A09;
    public final AnonymousClass17T A0A;
    public final AnonymousClass1CN A0B;
    public final C25701Hi A0C;
    public final AnonymousClass1AI A0D;
    public final C20810yC A0E;
    public final AnonymousClass1C4 A0F;
    public final AnonymousClass1CO A0G;
    public final C24581Cz A0H;
    public final AnonymousClass1CR A0I;
    public final C19770wU A0J;

    public long A00(C198959eT r10, int i, boolean z) {
        Cursor A092;
        long A002 = this.A01.A00(r10, i, z);
        StringBuilder sb = new StringBuilder();
        sb.append("history-sync-manager/getOldestRowIdToSync syncType = ");
        sb.append(i);
        sb.append(", days = ");
        sb.append(A002);
        Log.i(sb.toString());
        long j = 0;
        if (A002 >= 0) {
            AnonymousClass17T r2 = this.A0A;
            long A003 = C19970wo.A00(this.A06) - (A002 * 86400000);
            C224214g r6 = new C224214g(false);
            r6.A04("rowidstore/getRowIdByTimestampExcludeSystemMessages");
            AnonymousClass1M0 A042 = r2.A01.get();
            try {
                A092 = A042.A02.A09("SELECT _id FROM available_message_view WHERE (message_type != '7') AND timestamp > 0 AND timestamp <= ? ORDER BY sort_id DESC LIMIT 1", "GET_ROW_ID_BY_TIMESTAMP_EXCLUDE_SYSTEM_MESSAGES", new String[]{Long.toString(A003)});
                if (A092.moveToNext()) {
                    j = A092.getLong(A092.getColumnIndexOrThrow("_id"));
                } else {
                    j = 0;
                }
                A092.close();
                A042.close();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("rowidstore/getRowIdByTimestampExcludeSystemMessages ");
                sb2.append(j);
                sb2.append(" | time spent:");
                sb2.append(r6.A01());
                Log.i(sb2.toString());
            } catch (Throwable th) {
                try {
                    A042.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        return j;
        throw th;
    }

    public void A01(AnonymousClass3I3 r37, DeviceJid deviceJid, int i, long j, long j2, long j3, long j4) {
        AnonymousClass1M0 A042;
        C25701Hi r1 = this.A0C;
        AnonymousClass18P r0 = r1.A02;
        AnonymousClass1M0 A043 = r0.A04();
        try {
            C1495671s B1k = A043.B1k();
            try {
                C18740tg.A00();
                A042 = r0.A04();
                DeviceJid deviceJid2 = deviceJid;
                int i2 = i;
                int A032 = A042.A02.A03("msg_history_sync", "device_id=?  AND sync_type=?  AND status=?", "MessageHistorySyncStore.deleteSyncStateByDeviceAndTypeAndStatus", new String[]{deviceJid2.getRawString(), String.valueOf(i2), String.valueOf(2)});
                C25701Hi.A00(A042, r1, deviceJid2);
                A042.close();
                boolean z = false;
                if (A032 > 0) {
                    z = true;
                }
                long j5 = j;
                long j6 = j4;
                int i3 = z ? 1 : 0;
                r1.A03(new AnonymousClass6E9(r37, deviceJid2, i2, 0, i3, -1, j5, j2, j3, 0, 0, 0, -1, j6));
                B1k.A00();
                C25701Hi.A00(A043, r1, deviceJid2);
                B1k.close();
                A043.close();
                StringBuilder sb = new StringBuilder();
                sb.append("history-sync-manager/addOrUpdateSyncStateWithData syncType: ");
                sb.append(i2);
                sb.append(", sizeLimitBytes: ");
                sb.append(j6);
                sb.append(", latestMsgId: ");
                sb.append(j5);
                sb.append(", isActivated: ");
                sb.append(z);
                Log.i(sb.toString());
                if (z) {
                    this.A02.A00();
                    return;
                }
                return;
            } catch (Throwable th) {
                B1k.close();
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            try {
                A043.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public void BUP(AnonymousClass3K7 r4) {
        if (r4.A02) {
            if (C20800yB.A01(C21000yV.A02, this.A0E, 4879)) {
                this.A0J.Boz(new C35671j4(this, 26), "HistorySyncManager/onConnectivityChange");
            }
        }
    }

    public AnonymousClass1C3(C21100yf r2, C24571Cy r3, C25771Hp r4, AnonymousClass1AB r5, C237119n r6, AnonymousClass1A6 r7, C19970wo r8, C24541Cv r9, C24561Cx r10, C233017y r11, AnonymousClass17T r12, AnonymousClass1CN r13, C25701Hi r14, AnonymousClass1AI r15, C20810yC r16, AnonymousClass1C4 r17, AnonymousClass1CO r18, C24581Cz r19, AnonymousClass1CR r20, C19770wU r21) {
        this.A06 = r8;
        this.A0E = r16;
        this.A0J = r21;
        this.A0A = r12;
        this.A0F = r17;
        this.A00 = r2;
        this.A0B = r13;
        this.A0G = r18;
        this.A07 = r9;
        this.A03 = r5;
        this.A0I = r20;
        this.A0D = r15;
        this.A08 = r10;
        this.A05 = r7;
        this.A01 = r3;
        this.A0H = r19;
        this.A02 = r4;
        this.A04 = r6;
        this.A0C = r14;
        this.A09 = r11;
    }
}
