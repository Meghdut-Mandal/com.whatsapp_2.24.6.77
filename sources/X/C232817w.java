package X;

import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.17w  reason: invalid class name and case insensitive filesystem */
public class C232817w {
    public final C19700wN A00;
    public final C19730wQ A01;
    public final C219712j A02;
    public final AnonymousClass12P A03;
    public final C19770wU A04;

    public static void A00(C232817w r10, AnonymousClass144 r11, String str, Collection collection) {
        C1495671s B1k;
        C219712j r3 = r10.A02;
        long A07 = r3.A07(r11);
        AnonymousClass1M0 A05 = r10.A03.A05();
        try {
            B1k = A05.B1k();
            AnonymousClass6QI A0C = A05.A02.A0C(str, "UPDATE_GROUP_PARTICIPANT_DEVICES_SENT_SENDER_KEY_FOR_DEVICE_SQL");
            A0C.A05(1, 1);
            A0C.A05(3, A07);
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                DeviceJid deviceJid = (DeviceJid) it.next();
                A0C.A05(2, r3.A07(deviceJid));
                UserJid userJid = deviceJid.userJid;
                C18740tg.A0E(!TextUtils.isEmpty(userJid.getRawString()), "participant-user-store/invalid-jid");
                if (r10.A01.A0M(userJid)) {
                    userJid = C223613z.A00;
                }
                A0C.A05(4, r3.A07(userJid));
                A0C.A01();
            }
            B1k.A00();
            B1k.close();
            A05.close();
            return;
        } catch (Throwable th) {
            try {
                A05.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A02(C20760y7 r10, AnonymousClass144 r11, UserJid userJid, long j) {
        AnonymousClass1M0 A05;
        StringBuilder sb = new StringBuilder();
        sb.append("participant-device-store/updateParticipantDevices/");
        sb.append(r11);
        sb.append(" ");
        sb.append(userJid);
        sb.append(" ");
        sb.append(j);
        sb.append(" ");
        sb.append(r10);
        Log.i(sb.toString());
        AnonymousClass12P r2 = this.A03;
        AnonymousClass1M0 A052 = r2.A05();
        try {
            C1495671s A002 = A052.A00();
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("participant-device-store/deleteParticipantDevices/");
                sb2.append(r11);
                sb2.append(" ");
                sb2.append(j);
                Log.i(sb2.toString());
                long A07 = this.A02.A07(r11);
                A05 = r2.A05();
                AnonymousClass6QI A0C = A05.A02.A0C("DELETE FROM group_participant_device WHERE group_participant_row_id IN (SELECT _id FROM group_participant_user WHERE group_jid_row_id = ? AND user_jid_row_id = ?)", "deleteParticipantDevices/DELETE_GROUP_PARTICIPANT_DEVICES_SQL");
                A0C.A00.bindAllArgsAsStrings(new String[]{String.valueOf(A07), String.valueOf(j)});
                int i = 2;
                do {
                    i--;
                } while (i != 0);
                A0C.A01();
                A05.close();
                A01(r10, r11, userJid, j);
                A002.A00();
                A002.close();
                A052.close();
                return;
            } catch (Throwable th) {
                A002.close();
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            try {
                A052.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public void A03(AnonymousClass144 r8) {
        StringBuilder sb = new StringBuilder();
        sb.append("participant-device-store/resetSentSenderKeyForAllParticipants/");
        sb.append(r8);
        Log.i(sb.toString());
        long A07 = this.A02.A07(r8);
        AnonymousClass1M0 A05 = this.A03.A05();
        try {
            AnonymousClass6QI A0C = A05.A02.A0C("UPDATE group_participant_device SET sent_sender_key = ? WHERE group_participant_row_id IN (SELECT _id FROM group_participant_user WHERE group_jid_row_id = ?)", "resetSentSenderKeyForAllParticipants/UPDATE_GROUP_PARTICIPANT_DEVICES_SENT_SENDER_KEY_FOR_GROUP_SQL");
            A0C.A00.bindAllArgsAsStrings(new String[]{"0", String.valueOf(A07)});
            int i = 2;
            do {
                i--;
            } while (i != 0);
            A0C.A01();
            A05.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public C232817w(C19700wN r1, C19730wQ r2, C219712j r3, AnonymousClass12P r4, C19770wU r5) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = r5;
        this.A03 = r4;
    }

    public void A01(C20760y7 r12, AnonymousClass144 r13, UserJid userJid, long j) {
        C1495671s A002;
        long j2;
        long j3;
        C18740tg.A0E(!r12.isEmpty(), "participant-device-store/addParticipantDevices/empty devices");
        C219712j r3 = this.A02;
        long A07 = r3.A07(r13);
        AnonymousClass1M0 A05 = this.A03.A05();
        try {
            A002 = A05.A00();
            AnonymousClass6QI A0C = A05.A02.A0C("INSERT INTO group_participant_device (group_participant_row_id, device_jid_row_id, sent_sender_key, sent_add_on_sender_key) SELECT _id, ?, ?, ? FROM group_participant_user WHERE group_jid_row_id = ? AND user_jid_row_id = ?", "INSERT_GROUP_PARTICIPANT_DEVICE_SQL");
            A0C.A05(4, A07);
            A0C.A05(5, j);
            C225614x it = r12.iterator();
            while (it.hasNext()) {
                AnonymousClass6B1 r7 = (AnonymousClass6B1) it.next();
                DeviceJid deviceJid = r7.A02;
                if (!deviceJid.userJid.equals(userJid)) {
                    C19700wN r72 = this.A00;
                    StringBuilder sb = new StringBuilder();
                    sb.append("incorrect device jid ");
                    sb.append(deviceJid);
                    sb.append(" for user ");
                    sb.append(userJid);
                    r72.A0E("participant-device-store/incorrect device jid", sb.toString(), false);
                } else {
                    A0C.A05(1, r3.A07(deviceJid));
                    if (r7.A01) {
                        j2 = 1;
                    } else {
                        j2 = 0;
                    }
                    A0C.A05(2, j2);
                    if (r7.A00) {
                        j3 = 1;
                    } else {
                        j3 = 0;
                    }
                    A0C.A05(3, j3);
                    A0C.A02();
                }
            }
            A002.A00();
            A002.close();
            A05.close();
            return;
        } catch (Throwable th) {
            try {
                A05.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }
}
