package X;

import android.database.Cursor;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.6zE  reason: invalid class name and case insensitive filesystem */
public final class C148666zE implements AnonymousClass4S2, AnonymousClass4S3, AnonymousClass4S4, C17760rz {
    public final AnonymousClass005 A00;

    public C148666zE(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public void BKi(AnonymousClass3T1 r2) {
        AnonymousClass00C.A0D(r2, 0);
        ((C1259361x) this.A00.get()).A00((AnonymousClass5J5) r2);
    }

    public void BwV(AnonymousClass3T1 r2) {
        AnonymousClass00C.A0D(r2, 0);
        ((C1259361x) this.A00.get()).A00((AnonymousClass5J5) r2);
    }

    public void B7J(AnonymousClass3T1 r41) {
        Cursor A09;
        int i;
        AnonymousClass3T1 r1 = r41;
        AnonymousClass00C.A0D(r1, 0);
        C1259361x r6 = (C1259361x) this.A00.get();
        C106255Iy r12 = (C106255Iy) r1;
        C64933Qa r3 = r12.A1J;
        AnonymousClass1M0 A04 = r6.A01.get();
        try {
            C224114e r10 = A04.A02;
            String[] strArr = new String[1];
            C36401kF.A1T(strArr, 0, r12.A1N);
            Cursor A092 = r10.A09("SELECT _id, timestamp, video_call, group_jid_row_id, is_joinable_group_call, is_dnd_mode_on, offer_silence_reason FROM missed_call_logs WHERE message_row_id = ? ORDER BY timestamp ASC", "getMessageCallLog/QUERY_MISSED_CALL_LOGS", strArr);
            try {
                if (A092.moveToNext()) {
                    String[] strArr2 = new String[1];
                    C36401kF.A1T(strArr2, 0, C36351kA.A07(A092, "_id"));
                    A09 = r10.A09("SELECT _id, jid, call_result FROM missed_call_log_participant WHERE call_logs_row_id = ? ORDER BY _id ASC", "getMessageCallLog/QUERY_MISSED_CALL_LOG_PARTICIPANTS", strArr2);
                    long A07 = C36351kA.A07(A092, "_id");
                    long A072 = C36351kA.A07(A092, "timestamp");
                    boolean A1R = AnonymousClass000.A1R(C36351kA.A03(A092, "video_call"));
                    int A03 = C36351kA.A03(A092, "group_jid_row_id");
                    boolean A1R2 = AnonymousClass000.A1R(C36351kA.A03(A092, "is_joinable_group_call"));
                    int A032 = C36351kA.A03(A092, "is_dnd_mode_on");
                    int columnIndexOrThrow = A092.getColumnIndexOrThrow("offer_silence_reason");
                    if (A092.isNull(columnIndexOrThrow)) {
                        i = 0;
                    } else {
                        i = A092.getInt(columnIndexOrThrow);
                    }
                    ArrayList A0I = AnonymousClass001.A0I();
                    while (A09.moveToNext()) {
                        long A073 = C36351kA.A07(A09, "_id");
                        UserJid A0l = C36431kI.A0l(C36341k9.A0f(A09, "jid"));
                        if (A0l instanceof PhoneUserJid) {
                            A0I.add(new C107255Nf(A0l, C36351kA.A03(A09, "call_result"), A073));
                        }
                    }
                    C001200n r5 = C108555Tz.A00;
                    C108555Tz A002 = C111845cw.A00(A032);
                    Jid A093 = r6.A00.A09((long) A03);
                    AnonymousClass6SZ r52 = GroupJid.Companion;
                    GroupJid A003 = AnonymousClass6SZ.A00(A093);
                    C107265Nh r16 = null;
                    AnonymousClass11F r62 = r3.A00;
                    UserJid A0b = C36401kF.A0b(r62);
                    if (A0b == null) {
                        C36321k7.A1J(r62, "CallLog/fromFMessage V1 bad UserJid: ", AnonymousClass000.A0u());
                    } else {
                        r16 = new C107265Nh((C63083Ir) null, (DeviceJid) null, A003, r12, new C135006by(0, A0b, r3.A01, r3.A02), A002, (AnonymousClass5Ng) null, (AnonymousClass661) null, (String) null, A0I, 0, 2, i, 0, A07, A072, 0, A1R, false, true, A1R2);
                    }
                    A09.close();
                    A092.close();
                    A04.close();
                    if (r16 != null) {
                        List singletonList = Collections.singletonList(r16);
                        List list = r12.A00;
                        list.clear();
                        list.addAll(singletonList);
                        Collections.sort(list, AnonymousClass76D.A00);
                        return;
                    }
                    return;
                }
                A092.close();
                A04.close();
                return;
            } catch (Throwable th) {
                if (A092 != null) {
                    A092.close();
                }
                throw th;
            }
            throw th;
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
}
