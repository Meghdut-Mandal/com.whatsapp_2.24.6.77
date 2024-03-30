package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.178  reason: invalid class name */
public class AnonymousClass178 {
    public final C19700wN A00;
    public final AnonymousClass163 A01;
    public final C219712j A02;
    public final AnonymousClass12P A03;
    public final C20810yC A04;
    public final AnonymousClass179 A05;
    public final C19970wo A06;
    public final C219612i A07;
    public final AnonymousClass17A A08;
    public final AnonymousClass17E A09;

    public static String[] A04(AnonymousClass178 r3, C64933Qa r4) {
        String str;
        String[] strArr = new String[3];
        AnonymousClass163 r1 = r3.A01;
        AnonymousClass11F r0 = r4.A00;
        C18740tg.A06(r0);
        strArr[0] = String.valueOf(r1.A08(r0));
        if (r4.A02) {
            str = "1";
        } else {
            str = "0";
        }
        strArr[1] = str;
        strArr[2] = r4.A01;
        return strArr;
    }

    public void A05(AnonymousClass3T1 r14, boolean z) {
        String[] strArr;
        String str;
        String str2;
        String str3;
        ContentValues contentValues;
        C224114e r7;
        C64933Qa r6;
        Cursor A092;
        r14.A0o(1);
        AnonymousClass1M0 A052 = this.A03.A05();
        if (z) {
            try {
                List<AnonymousClass11F> A0e = r14.A0e();
                if (A0e == null || A0e.size() <= 0) {
                    contentValues = new ContentValues();
                    A02(contentValues, r14);
                    r6 = r14.A1J;
                    strArr = new String[]{String.valueOf(r6.A01)};
                    r7 = A052.A02;
                    str3 = "message";
                    str2 = "broadcast = 1 AND from_me = 1 AND key_id = ?";
                    str = "UPDATE_MESSAGE_MAIN_BROADCAST_SCAN_SQL";
                } else {
                    ArrayList arrayList = new ArrayList(A0e.size() + 1);
                    AnonymousClass163 r8 = this.A01;
                    r6 = r14.A1J;
                    arrayList.add(String.valueOf(r8.A08(r6.A00)));
                    for (AnonymousClass11F A082 : A0e) {
                        arrayList.add(String.valueOf(r8.A08(A082)));
                    }
                    arrayList.add(r6.A01);
                    contentValues = new ContentValues();
                    A02(contentValues, r14);
                    StringBuilder sb = new StringBuilder();
                    sb.append("chat_row_id IN ");
                    sb.append(AnonymousClass1M2.A00(arrayList.size() - 1));
                    sb.append(" AND ");
                    sb.append("from_me = 1");
                    sb.append(" AND ");
                    sb.append("key_id = ?");
                    str2 = sb.toString();
                    r7 = A052.A02;
                    strArr = (String[]) arrayList.toArray(new String[0]);
                    str3 = "message";
                    str = "UPDATE_MESSAGE_MAIN_BROADCAST_PARTICIPANTS_SQL";
                }
            } catch (Throwable th) {
                try {
                    A052.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } else {
            contentValues = new ContentValues();
            A01(contentValues, this, r14);
            r6 = r14.A1J;
            strArr = A04(this, r6);
            r7 = A052.A02;
            str3 = "message";
            str2 = "chat_row_id = ? AND from_me = ? AND key_id = ?";
            str = "UPDATE_MESSAGE_MAIN_SQL";
        }
        r7.A01(contentValues, str3, str2, str, strArr);
        if (r14.A1N <= 0 && !z) {
            A092 = r7.A09("SELECT _id FROM message_view WHERE chat_row_id = ? AND from_me = ? AND key_id = ?", "FIND_MESSAGE_MAIN_SQL", A04(this, r6));
            if (A092.moveToNext()) {
                r14.A1N = A092.getLong(A092.getColumnIndexOrThrow("_id"));
            }
            A092.close();
        }
        A052.close();
        return;
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:379:0x09aa, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:?, code lost:
        X.C05600Qi.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x09ae, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x09af, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x09b0, code lost:
        if (r11 != null) goto L_0x09b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x09bd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:287:0x072d, B:374:0x09a4] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass3T1 A00(android.database.Cursor r27, X.AnonymousClass178 r28, X.C64933Qa r29) {
        /*
            java.lang.String r0 = "message_type"
            r6 = r27
            int r0 = r6.getColumnIndexOrThrow(r0)
            int r0 = r6.getInt(r0)
            byte r4 = (byte) r0
            java.lang.String r0 = "timestamp"
            int r0 = r6.getColumnIndexOrThrow(r0)
            long r1 = r6.getLong(r0)
            java.lang.String r19 = "status"
            r0 = r19
            int r0 = r6.getColumnIndexOrThrow(r0)
            int r3 = r6.getInt(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r5 = r29
            if (r4 != 0) goto L_0x003c
            if (r0 == 0) goto L_0x0030
            r0 = 6
            if (r3 == r0) goto L_0x003f
        L_0x0030:
            r0 = r28
            X.17E r0 = r0.A09
            X.3T1 r5 = r0.A00(r5, r4, r1)
        L_0x0038:
            if (r5 != 0) goto L_0x08b5
            r0 = 0
            return r0
        L_0x003c:
            r0 = 7
            if (r4 != r0) goto L_0x0030
        L_0x003f:
            r0 = r28
            X.17A r8 = r0.A08
            java.lang.String r0 = "_id"
            int r0 = r6.getColumnIndexOrThrow(r0)
            long r9 = r6.getLong(r0)
            X.12P r3 = r8.A03
            X.1M0 r20 = r3.get()
            r0 = r20
            X.14e r12 = r0.A02     // Catch:{ all -> 0x09d8 }
            java.lang.String r11 = "SELECT action_type FROM message_system WHERE message_row_id = ?"
            r4 = 1
            java.lang.String[] r7 = new java.lang.String[r4]     // Catch:{ all -> 0x09d8 }
            r13 = 0
            java.lang.String r0 = java.lang.Long.toString(r9)     // Catch:{ all -> 0x09d8 }
            r7[r13] = r0     // Catch:{ all -> 0x09d8 }
            java.lang.String r0 = "GET_SYSTEM_MESSAGE"
            android.database.Cursor r21 = r12.A09(r11, r0, r7)     // Catch:{ all -> 0x09d8 }
            boolean r0 = r21.moveToFirst()     // Catch:{ all -> 0x09cc }
            if (r0 != 0) goto L_0x0072
            r5 = 0
            goto L_0x08ad
        L_0x0072:
            java.lang.String r7 = "action_type"
            r0 = r21
            int r7 = r0.getColumnIndexOrThrow(r7)     // Catch:{ all -> 0x09cc }
            int r7 = r0.getInt(r7)     // Catch:{ all -> 0x09cc }
            X.17K r0 = r8.A06     // Catch:{ all -> 0x09cc }
            X.2bI r5 = r0.A00(r5, r7, r1)     // Catch:{ all -> 0x09cc }
            r5.A0o(r4)     // Catch:{ all -> 0x09cc }
            r5.A1N = r9     // Catch:{ all -> 0x09cc }
            java.lang.String r12 = "remote_message_from_me"
            java.lang.String r7 = "new_photo_id"
            X.1M0 r3 = r3.get()     // Catch:{ all -> 0x09cc }
            boolean r0 = r5 instanceof X.C181478nX     // Catch:{ all -> 0x09c2 }
            java.lang.String r9 = "GET_SYSTEM_MESSAGE_VALUE_CHANGE"
            r2 = 0
            if (r0 == 0) goto L_0x00c2
            X.14e r13 = r3.A02     // Catch:{ all -> 0x09c2 }
            java.lang.String r11 = "SELECT old_data FROM message_system_value_change WHERE message_row_id = ?"
            java.lang.String[] r10 = new java.lang.String[r4]     // Catch:{ all -> 0x09c2 }
            long r0 = r5.A1N     // Catch:{ all -> 0x09c2 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x09c2 }
            r10[r2] = r0     // Catch:{ all -> 0x09c2 }
            android.database.Cursor r10 = r13.A09(r11, r9, r10)     // Catch:{ all -> 0x09c2 }
            boolean r0 = r10.moveToNext()     // Catch:{ all -> 0x0984 }
            if (r0 == 0) goto L_0x00bf
            r1 = r5
            X.8nX r1 = (X.C181478nX) r1     // Catch:{ all -> 0x0984 }
            java.lang.String r0 = "old_data"
            int r0 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0984 }
            java.lang.String r0 = r10.getString(r0)     // Catch:{ all -> 0x0984 }
            r1.A01 = r0     // Catch:{ all -> 0x0984 }
        L_0x00bf:
            r10.close()     // Catch:{ all -> 0x09c2 }
        L_0x00c2:
            boolean r0 = r5 instanceof X.C181388nO     // Catch:{ all -> 0x09c2 }
            if (r0 == 0) goto L_0x00f0
            X.14e r13 = r3.A02     // Catch:{ all -> 0x09c2 }
            java.lang.String r11 = "SELECT old_data FROM message_system_value_change WHERE message_row_id = ?"
            java.lang.String[] r10 = new java.lang.String[r4]     // Catch:{ all -> 0x09c2 }
            long r0 = r5.A1N     // Catch:{ all -> 0x09c2 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x09c2 }
            r10[r2] = r0     // Catch:{ all -> 0x09c2 }
            android.database.Cursor r10 = r13.A09(r11, r9, r10)     // Catch:{ all -> 0x09c2 }
            boolean r0 = r10.moveToNext()     // Catch:{ all -> 0x0984 }
            if (r0 == 0) goto L_0x00ed
            r1 = r5
            X.8nO r1 = (X.C181388nO) r1     // Catch:{ all -> 0x0984 }
            java.lang.String r0 = "old_data"
            int r0 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0984 }
            java.lang.String r0 = r10.getString(r0)     // Catch:{ all -> 0x0984 }
            r1.A00 = r0     // Catch:{ all -> 0x0984 }
        L_0x00ed:
            r10.close()     // Catch:{ all -> 0x09c2 }
        L_0x00f0:
            boolean r0 = r5 instanceof X.C181468nW     // Catch:{ all -> 0x09c2 }
            if (r0 == 0) goto L_0x0120
            X.14e r13 = r3.A02     // Catch:{ all -> 0x09c2 }
            java.lang.String r11 = "SELECT old_data FROM message_system_value_change WHERE message_row_id = ?"
            java.lang.String[] r10 = new java.lang.String[r4]     // Catch:{ all -> 0x09c2 }
            long r0 = r5.A1N     // Catch:{ all -> 0x09c2 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x09c2 }
            r10[r2] = r0     // Catch:{ all -> 0x09c2 }
            android.database.Cursor r10 = r13.A09(r11, r9, r10)     // Catch:{ all -> 0x09c2 }
            boolean r0 = r10.moveToNext()     // Catch:{ all -> 0x0984 }
            if (r0 == 0) goto L_0x011d
            java.lang.String r0 = "old_data"
            int r0 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0984 }
            java.lang.String r1 = r10.getString(r0)     // Catch:{ all -> 0x0984 }
            if (r1 == 0) goto L_0x011d
            r0 = r5
            X.8nW r0 = (X.C181468nW) r0     // Catch:{ all -> 0x0984 }
            r0.A00 = r1     // Catch:{ all -> 0x0984 }
        L_0x011d:
            r10.close()     // Catch:{ all -> 0x09c2 }
        L_0x0120:
            boolean r0 = r5 instanceof X.AnonymousClass2cG     // Catch:{ all -> 0x09c2 }
            if (r0 == 0) goto L_0x014e
            X.14e r13 = r3.A02     // Catch:{ all -> 0x09c2 }
            java.lang.String r11 = "SELECT old_data FROM message_system_value_change WHERE message_row_id = ?"
            java.lang.String[] r10 = new java.lang.String[r4]     // Catch:{ all -> 0x09c2 }
            long r0 = r5.A1N     // Catch:{ all -> 0x09c2 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x09c2 }
            r10[r2] = r0     // Catch:{ all -> 0x09c2 }
            android.database.Cursor r10 = r13.A09(r11, r9, r10)     // Catch:{ all -> 0x09c2 }
            boolean r0 = r10.moveToNext()     // Catch:{ all -> 0x0984 }
            if (r0 == 0) goto L_0x014b
            r1 = r5
            X.2cG r1 = (X.AnonymousClass2cG) r1     // Catch:{ all -> 0x0984 }
            java.lang.String r0 = "old_data"
            int r0 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0984 }
            java.lang.String r0 = r10.getString(r0)     // Catch:{ all -> 0x0984 }
            r1.A00 = r0     // Catch:{ all -> 0x0984 }
        L_0x014b:
            r10.close()     // Catch:{ all -> 0x09c2 }
        L_0x014e:
            boolean r0 = r5 instanceof X.C181758nz     // Catch:{ all -> 0x09c2 }
            if (r0 == 0) goto L_0x01c3
            X.14e r9 = r3.A02     // Catch:{ all -> 0x09c2 }
            java.lang.String r11 = "SELECT is_me_joined FROM message_system_group WHERE message_row_id = ?"
            java.lang.String[] r10 = new java.lang.String[r4]     // Catch:{ all -> 0x09c2 }
            long r0 = r5.A1N     // Catch:{ all -> 0x09c2 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x09c2 }
            r10[r2] = r0     // Catch:{ all -> 0x09c2 }
            java.lang.String r0 = "GET_SYSTEM_MESSAGE_GROUP"
            android.database.Cursor r10 = r9.A09(r11, r0, r10)     // Catch:{ all -> 0x09c2 }
            boolean r0 = r10.moveToNext()     // Catch:{ all -> 0x0984 }
            if (r0 == 0) goto L_0x017b
            r1 = r5
            X.8nz r1 = (X.C181758nz) r1     // Catch:{ all -> 0x0984 }
            java.lang.String r0 = "is_me_joined"
            int r0 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0984 }
            int r0 = r10.getInt(r0)     // Catch:{ all -> 0x0984 }
            r1.A00 = r0     // Catch:{ all -> 0x0984 }
        L_0x017b:
            r10.close()     // Catch:{ all -> 0x09c2 }
            java.lang.String r11 = "SELECT user_jid_row_id FROM message_system_chat_participant WHERE message_row_id = ?"
            java.lang.String[] r10 = new java.lang.String[r4]     // Catch:{ all -> 0x09c2 }
            long r0 = r5.A1N     // Catch:{ all -> 0x09c2 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x09c2 }
            r10[r2] = r0     // Catch:{ all -> 0x09c2 }
            java.lang.String r0 = "GET_SYSTEM_MESSAGE_CHAT_PATRICIPANTS"
            android.database.Cursor r10 = r9.A09(r11, r0, r10)     // Catch:{ all -> 0x09c2 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x0984 }
            r9.<init>()     // Catch:{ all -> 0x0984 }
        L_0x0195:
            boolean r0 = r10.moveToNext()     // Catch:{ all -> 0x0984 }
            if (r0 == 0) goto L_0x01b7
            java.lang.String r0 = "user_jid_row_id"
            int r0 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0984 }
            long r0 = r10.getLong(r0)     // Catch:{ all -> 0x0984 }
            X.12j r11 = r8.A02     // Catch:{ all -> 0x0984 }
            com.whatsapp.jid.Jid r1 = r11.A09(r0)     // Catch:{ all -> 0x0984 }
            X.13r r0 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x0984 }
            com.whatsapp.jid.UserJid r0 = X.C222813r.A00(r1)     // Catch:{ all -> 0x0984 }
            if (r0 == 0) goto L_0x0195
            r9.add(r0)     // Catch:{ all -> 0x0984 }
            goto L_0x0195
        L_0x01b7:
            boolean r0 = r9.isEmpty()     // Catch:{ all -> 0x0984 }
            if (r0 != 0) goto L_0x01c0
            r5.A19(r9)     // Catch:{ all -> 0x0984 }
        L_0x01c0:
            r10.close()     // Catch:{ all -> 0x09c2 }
        L_0x01c3:
            boolean r0 = r5 instanceof X.C181238n9     // Catch:{ all -> 0x09c2 }
            if (r0 == 0) goto L_0x021f
            X.14e r11 = r3.A02     // Catch:{ all -> 0x09c2 }
            java.lang.String r10 = "SELECT new_photo_id, old_photo, new_photo FROM message_system_photo_change WHERE message_row_id = ?"
            java.lang.String[] r9 = new java.lang.String[r4]     // Catch:{ all -> 0x09c2 }
            long r0 = r5.A1N     // Catch:{ all -> 0x09c2 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x09c2 }
            r9[r2] = r0     // Catch:{ all -> 0x09c2 }
            java.lang.String r0 = "GET_SYSTEM_MESSAGE_PHOTO_CHANGE"
            android.database.Cursor r10 = r11.A09(r10, r0, r9)     // Catch:{ all -> 0x09c2 }
            boolean r0 = r10.moveToNext()     // Catch:{ all -> 0x0984 }
            if (r0 == 0) goto L_0x021c
            r9 = r5
            X.8n9 r9 = (X.C181238n9) r9     // Catch:{ all -> 0x0984 }
            int r0 = r10.getColumnIndexOrThrow(r7)     // Catch:{ all -> 0x0984 }
            java.lang.String r0 = r10.getString(r0)     // Catch:{ all -> 0x0984 }
            r9.A1a(r0)     // Catch:{ all -> 0x0984 }
            com.whatsapp.data.ProfilePhotoChange r1 = new com.whatsapp.data.ProfilePhotoChange     // Catch:{ all -> 0x0984 }
            r1.<init>()     // Catch:{ all -> 0x0984 }
            int r0 = r10.getColumnIndexOrThrow(r7)     // Catch:{ NumberFormatException -> 0x0202 }
            java.lang.String r0 = r10.getString(r0)     // Catch:{ NumberFormatException -> 0x0202 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0202 }
            r1.newPhotoId = r0     // Catch:{ NumberFormatException -> 0x0202 }
        L_0x0202:
            java.lang.String r0 = "new_photo"
            int r0 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0984 }
            byte[] r0 = r10.getBlob(r0)     // Catch:{ all -> 0x0984 }
            r1.newPhoto = r0     // Catch:{ all -> 0x0984 }
            java.lang.String r0 = "old_photo"
            int r0 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0984 }
            byte[] r0 = r10.getBlob(r0)     // Catch:{ all -> 0x0984 }
            r1.oldPhoto = r0     // Catch:{ all -> 0x0984 }
            r9.A00 = r1     // Catch:{ all -> 0x0984 }
        L_0x021c:
            r10.close()     // Catch:{ all -> 0x09c2 }
        L_0x021f:
            boolean r0 = r5 instanceof X.C181248nA     // Catch:{ all -> 0x09c2 }
            if (r0 == 0) goto L_0x0298
            X.14e r10 = r3.A02     // Catch:{ all -> 0x09c2 }
            java.lang.String r9 = "SELECT old_jid_row_id, new_jid_row_id FROM message_system_number_change WHERE message_row_id = ?"
            java.lang.String[] r7 = new java.lang.String[r4]     // Catch:{ all -> 0x09c2 }
            long r0 = r5.A1N     // Catch:{ all -> 0x09c2 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x09c2 }
            r7[r2] = r0     // Catch:{ all -> 0x09c2 }
            java.lang.String r0 = "GET_SYSTEM_MESSAGE_NUMBER_CHANGE"
            android.database.Cursor r7 = r10.A09(r9, r0, r7)     // Catch:{ all -> 0x09c2 }
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x098b }
            if (r0 == 0) goto L_0x0295
            r10 = r5
            X.8nA r10 = (X.C181248nA) r10     // Catch:{ all -> 0x098b }
            java.lang.String r0 = "old_jid_row_id"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x098b }
            long r0 = r7.getLong(r0)     // Catch:{ all -> 0x098b }
            X.0wN r9 = r8.A00     // Catch:{ all -> 0x098b }
            r10.A02 = r9     // Catch:{ all -> 0x098b }
            X.12j r9 = r8.A02     // Catch:{ all -> 0x098b }
            com.whatsapp.jid.Jid r1 = r9.A09(r0)     // Catch:{ all -> 0x098b }
            X.13r r0 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x098b }
            com.whatsapp.jid.UserJid r0 = X.C222813r.A00(r1)     // Catch:{ all -> 0x098b }
            r11 = 0
            if (r0 == 0) goto L_0x028c
            r10.A01 = r0     // Catch:{ all -> 0x098b }
            java.lang.String r0 = "new_jid_row_id"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x098b }
            long r0 = r7.getLong(r0)     // Catch:{ all -> 0x098b }
            com.whatsapp.jid.Jid r0 = r9.A09(r0)     // Catch:{ all -> 0x098b }
            com.whatsapp.jid.UserJid r1 = X.C222813r.A00(r0)     // Catch:{ all -> 0x098b }
            boolean r0 = r1 instanceof X.C223313w     // Catch:{ all -> 0x098b }
            if (r0 == 0) goto L_0x0285
            X.12O r0 = r8.A05     // Catch:{ all -> 0x098b }
            X.13w r1 = (X.C223313w) r1     // Catch:{ all -> 0x098b }
            com.whatsapp.jid.PhoneUserJid r1 = r0.A0A(r1)     // Catch:{ all -> 0x098b }
            if (r1 != 0) goto L_0x0288
            java.lang.String r0 = "SystemMessageStore/fillMessageAdditionalTables/LID -> PN mapping unknown"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x098b }
            goto L_0x028c
        L_0x0285:
            if (r1 != 0) goto L_0x0288
            goto L_0x028c
        L_0x0288:
            r10.A1Z(r1)     // Catch:{ all -> 0x098b }
            goto L_0x0295
        L_0x028c:
            r7.close()     // Catch:{ all -> 0x09c2 }
            r3.close()     // Catch:{ all -> 0x09cc }
            r5 = r11
            goto L_0x08ad
        L_0x0295:
            r7.close()     // Catch:{ all -> 0x09c2 }
        L_0x0298:
            boolean r0 = r5 instanceof X.AnonymousClass2cP     // Catch:{ all -> 0x09c2 }
            if (r0 == 0) goto L_0x03e5
            X.14e r9 = r3.A02     // Catch:{ all -> 0x09c2 }
            java.lang.String r10 = "SELECT sender_jid_row_id, receiver_jid_row_id, amount_with_symbol, remote_message_sender_jid_row_id, remote_message_from_me, remote_message_key FROM message_payment WHERE message_row_id = ?"
            java.lang.String[] r7 = new java.lang.String[r4]     // Catch:{ all -> 0x09c2 }
            long r0 = r5.A1N     // Catch:{ all -> 0x09c2 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x09c2 }
            r7[r2] = r0     // Catch:{ all -> 0x09c2 }
            java.lang.String r0 = "GET_SYSTEM_MESSAGE_PAYMENT"
            android.database.Cursor r7 = r9.A09(r10, r0, r7)     // Catch:{ all -> 0x09c2 }
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x098b }
            if (r0 == 0) goto L_0x0326
            r11 = r5
            X.2cP r11 = (X.AnonymousClass2cP) r11     // Catch:{ all -> 0x098b }
            X.12j r10 = r8.A02     // Catch:{ all -> 0x098b }
            java.lang.Class<com.whatsapp.jid.UserJid> r13 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "sender_jid_row_id"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x098b }
            long r0 = r7.getLong(r0)     // Catch:{ all -> 0x098b }
            com.whatsapp.jid.Jid r0 = r10.A0C(r13, r0)     // Catch:{ all -> 0x098b }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x098b }
            r11.A01 = r0     // Catch:{ all -> 0x098b }
            java.lang.String r0 = "receiver_jid_row_id"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x098b }
            long r0 = r7.getLong(r0)     // Catch:{ all -> 0x098b }
            com.whatsapp.jid.Jid r0 = r10.A0C(r13, r0)     // Catch:{ all -> 0x098b }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x098b }
            r11.A00 = r0     // Catch:{ all -> 0x098b }
            java.lang.String r0 = "amount_with_symbol"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x098b }
            java.lang.String r0 = r7.getString(r0)     // Catch:{ all -> 0x098b }
            r11.A03 = r0     // Catch:{ all -> 0x098b }
            int r0 = r7.getColumnIndexOrThrow(r12)     // Catch:{ all -> 0x098b }
            boolean r0 = r7.isNull(r0)     // Catch:{ all -> 0x098b }
            if (r0 != 0) goto L_0x0326
            java.lang.Class<X.11F> r13 = X.AnonymousClass11F.class
            java.lang.String r0 = "remote_message_sender_jid_row_id"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x098b }
            long r0 = r7.getLong(r0)     // Catch:{ all -> 0x098b }
            com.whatsapp.jid.Jid r10 = r10.A0C(r13, r0)     // Catch:{ all -> 0x098b }
            X.11F r10 = (X.AnonymousClass11F) r10     // Catch:{ all -> 0x098b }
            int r0 = r7.getColumnIndexOrThrow(r12)     // Catch:{ all -> 0x098b }
            int r0 = r7.getInt(r0)     // Catch:{ all -> 0x098b }
            r12 = 0
            if (r0 != r4) goto L_0x0315
            r12 = 1
        L_0x0315:
            java.lang.String r0 = "remote_message_key"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x098b }
            java.lang.String r1 = r7.getString(r0)     // Catch:{ all -> 0x098b }
            X.3Qa r0 = new X.3Qa     // Catch:{ all -> 0x098b }
            r0.<init>(r10, r1, r12)     // Catch:{ all -> 0x098b }
            r11.A02 = r0     // Catch:{ all -> 0x098b }
        L_0x0326:
            r7.close()     // Catch:{ all -> 0x09c2 }
            boolean r0 = r5 instanceof X.C181568ng     // Catch:{ all -> 0x09c2 }
            if (r0 == 0) goto L_0x0387
            java.lang.String r10 = "SELECT web_stub , amount , transfer_date , payment_sender_name , expiration FROM message_payment_transaction_reminder WHERE message_row_id = ?"
            java.lang.String[] r7 = new java.lang.String[r4]     // Catch:{ all -> 0x09c2 }
            long r0 = r5.A1N     // Catch:{ all -> 0x09c2 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x09c2 }
            r7[r2] = r0     // Catch:{ all -> 0x09c2 }
            java.lang.String r0 = "GET_SYSTEM_MESSAGE_TRANSACTION_REMINDER"
            android.database.Cursor r7 = r9.A09(r10, r0, r7)     // Catch:{ all -> 0x09c2 }
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x098b }
            if (r0 == 0) goto L_0x0384
            r1 = r5
            X.8ng r1 = (X.C181568ng) r1     // Catch:{ all -> 0x098b }
            java.lang.String r0 = "web_stub"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x098b }
            java.lang.String r0 = r7.getString(r0)     // Catch:{ all -> 0x098b }
            r1.A02 = r0     // Catch:{ all -> 0x098b }
            java.lang.String r0 = "amount"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x098b }
            java.lang.String r0 = r7.getString(r0)     // Catch:{ all -> 0x098b }
            r1.A01 = r0     // Catch:{ all -> 0x098b }
            java.lang.String r0 = "transfer_date"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x098b }
            java.lang.String r0 = r7.getString(r0)     // Catch:{ all -> 0x098b }
            r1.A04 = r0     // Catch:{ all -> 0x098b }
            java.lang.String r0 = "payment_sender_name"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x098b }
            java.lang.String r0 = r7.getString(r0)     // Catch:{ all -> 0x098b }
            r1.A03 = r0     // Catch:{ all -> 0x098b }
            java.lang.String r0 = "expiration"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x098b }
            int r0 = r7.getInt(r0)     // Catch:{ all -> 0x098b }
            r1.A00 = r0     // Catch:{ all -> 0x098b }
        L_0x0384:
            r7.close()     // Catch:{ all -> 0x09c2 }
        L_0x0387:
            boolean r0 = r5 instanceof X.C181578nh     // Catch:{ all -> 0x09c2 }
            if (r0 == 0) goto L_0x03e5
            java.lang.String r10 = "SELECT transaction_info, transaction_data, init_timestamp, update_timestamp, amount_data FROM message_payment_status_update WHERE message_row_id  = ?"
            java.lang.String[] r7 = new java.lang.String[r4]     // Catch:{ all -> 0x09c2 }
            long r0 = r5.A1N     // Catch:{ all -> 0x09c2 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x09c2 }
            r7[r2] = r0     // Catch:{ all -> 0x09c2 }
            java.lang.String r0 = "GET_SYSTEM_MESSAGE_TRANSACTION_STATUS_UPDATE"
            android.database.Cursor r7 = r9.A09(r10, r0, r7)     // Catch:{ all -> 0x09c2 }
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x098b }
            if (r0 == 0) goto L_0x03e2
            r1 = r5
            X.8nh r1 = (X.C181578nh) r1     // Catch:{ all -> 0x098b }
            java.lang.String r0 = "transaction_info"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x098b }
            java.lang.String r0 = r7.getString(r0)     // Catch:{ all -> 0x098b }
            r1.A03 = r0     // Catch:{ all -> 0x098b }
            java.lang.String r0 = "transaction_data"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x098b }
            java.lang.String r0 = r7.getString(r0)     // Catch:{ all -> 0x098b }
            r1.A01 = r0     // Catch:{ all -> 0x098b }
            java.lang.String r0 = "init_timestamp"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x098b }
            java.lang.String r0 = r7.getString(r0)     // Catch:{ all -> 0x098b }
            r1.A02 = r0     // Catch:{ all -> 0x098b }
            java.lang.String r0 = "update_timestamp"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x098b }
            java.lang.String r0 = r7.getString(r0)     // Catch:{ all -> 0x098b }
            r1.A04 = r0     // Catch:{ all -> 0x098b }
            java.lang.String r0 = "amount_data"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x098b }
            java.lang.String r0 = r7.getString(r0)     // Catch:{ all -> 0x098b }
            r1.A00 = r0     // Catch:{ all -> 0x098b }
        L_0x03e2:
            r7.close()     // Catch:{ all -> 0x09c2 }
        L_0x03e5:
            boolean r0 = r5 instanceof X.AnonymousClass2cJ     // Catch:{ all -> 0x09c2 }
            if (r0 == 0) goto L_0x0421
            r9 = r5
            X.2cJ r9 = (X.AnonymousClass2cJ) r9     // Catch:{ all -> 0x09c2 }
            X.14e r10 = r3.A02     // Catch:{ all -> 0x09c2 }
            java.lang.String[] r7 = new java.lang.String[r4]     // Catch:{ all -> 0x09c2 }
            long r0 = r9.A1N     // Catch:{ all -> 0x09c2 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x09c2 }
            r7[r2] = r0     // Catch:{ all -> 0x09c2 }
            java.lang.String r1 = "SELECT device_added_count, device_removed_count FROM message_system_device_change WHERE message_row_id = ?"
            java.lang.String r0 = "GET_SYSTEM_MESSAGE_DEVICE_CHANGE"
            android.database.Cursor r7 = r10.A09(r1, r0, r7)     // Catch:{ all -> 0x09c2 }
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x09b6 }
            if (r0 == 0) goto L_0x041e
            java.lang.String r0 = "device_added_count"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x09b6 }
            int r0 = r7.getInt(r0)     // Catch:{ all -> 0x09b6 }
            r9.A00 = r0     // Catch:{ all -> 0x09b6 }
            java.lang.String r0 = "device_removed_count"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x09b6 }
            int r0 = r7.getInt(r0)     // Catch:{ all -> 0x09b6 }
            r9.A01 = r0     // Catch:{ all -> 0x09b6 }
        L_0x041e:
            r7.close()     // Catch:{ all -> 0x09c2 }
        L_0x0421:
            boolean r0 = r5 instanceof X.AnonymousClass2cH     // Catch:{ all -> 0x09c2 }
            if (r0 == 0) goto L_0x0451
            r9 = r5
            X.2cH r9 = (X.AnonymousClass2cH) r9     // Catch:{ all -> 0x09c2 }
            X.14e r10 = r3.A02     // Catch:{ all -> 0x09c2 }
            java.lang.String[] r7 = new java.lang.String[r4]     // Catch:{ all -> 0x09c2 }
            long r0 = r9.A1N     // Catch:{ all -> 0x09c2 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x09c2 }
            r7[r2] = r0     // Catch:{ all -> 0x09c2 }
            java.lang.String r1 = "SELECT privacy_provider, verified_biz_name, biz_state_id FROM message_system_initial_privacy_provider WHERE message_row_id = ?"
            java.lang.String r0 = "GET_SYSTEM_MESSAGE_INITIAL_PRIVACY_PROVIDER"
            android.database.Cursor r7 = r10.A09(r1, r0, r7)     // Catch:{ all -> 0x09c2 }
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x09b6 }
            if (r0 == 0) goto L_0x044e
            java.lang.String r0 = "biz_state_id"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x09b6 }
            int r0 = r7.getInt(r0)     // Catch:{ all -> 0x09b6 }
            r9.A00 = r0     // Catch:{ all -> 0x09b6 }
        L_0x044e:
            r7.close()     // Catch:{ all -> 0x09c2 }
        L_0x0451:
            boolean r0 = r5 instanceof X.AnonymousClass2cL     // Catch:{ all -> 0x09c2 }
            if (r0 == 0) goto L_0x0485
            r10 = r5
            X.2cL r10 = (X.AnonymousClass2cL) r10     // Catch:{ all -> 0x09c2 }
            X.14e r11 = r3.A02     // Catch:{ all -> 0x09c2 }
            r9 = 1
            java.lang.String[] r7 = new java.lang.String[r4]     // Catch:{ all -> 0x09c2 }
            long r0 = r10.A1N     // Catch:{ all -> 0x09c2 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x09c2 }
            r7[r2] = r0     // Catch:{ all -> 0x09c2 }
            java.lang.String r1 = "SELECT is_blocked FROM message_system_block_contact WHERE message_row_id = ?"
            java.lang.String r0 = "GET_SYSTEM_MESSAGE_BLOCK_CONTACT"
            android.database.Cursor r7 = r11.A09(r1, r0, r7)     // Catch:{ all -> 0x09c2 }
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x09b6 }
            if (r0 == 0) goto L_0x0482
            java.lang.String r0 = "is_blocked"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x09b6 }
            int r0 = r7.getInt(r0)     // Catch:{ all -> 0x09b6 }
            if (r0 == r4) goto L_0x0480
            r9 = 0
        L_0x0480:
            r10.A00 = r9     // Catch:{ all -> 0x09b6 }
        L_0x0482:
            r7.close()     // Catch:{ all -> 0x09c2 }
        L_0x0485:
            boolean r0 = r5 instanceof X.AnonymousClass2cM     // Catch:{ all -> 0x09c2 }
            if (r0 == 0) goto L_0x04c1
            r9 = r5
            X.2cM r9 = (X.AnonymousClass2cM) r9     // Catch:{ all -> 0x09c2 }
            X.14e r10 = r3.A02     // Catch:{ all -> 0x09c2 }
            java.lang.String[] r7 = new java.lang.String[r4]     // Catch:{ all -> 0x09c2 }
            long r0 = r9.A1N     // Catch:{ all -> 0x09c2 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x09c2 }
            r7[r2] = r0     // Catch:{ all -> 0x09c2 }
            java.lang.String r1 = "SELECT biz_opt_out_category , biz_opt_out_action FROM message_system_opt_out WHERE message_row_id = ?"
            java.lang.String r0 = "GET_SYSTEM_MESSAGE_BIZ_OPT_OUT"
            android.database.Cursor r7 = r10.A09(r1, r0, r7)     // Catch:{ all -> 0x09c2 }
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x09b6 }
            if (r0 == 0) goto L_0x04be
            java.lang.String r0 = "biz_opt_out_category"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x09b6 }
            int r0 = r7.getInt(r0)     // Catch:{ all -> 0x09b6 }
            r9.A01 = r0     // Catch:{ all -> 0x09b6 }
            java.lang.String r0 = "biz_opt_out_action"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x09b6 }
            int r0 = r7.getInt(r0)     // Catch:{ all -> 0x09b6 }
            r9.A00 = r0     // Catch:{ all -> 0x09b6 }
        L_0x04be:
            r7.close()     // Catch:{ all -> 0x09c2 }
        L_0x04c1:
            boolean r0 = r5 instanceof X.C181218n7     // Catch:{ all -> 0x09c2 }
            if (r0 == 0) goto L_0x04f1
            r9 = r5
            X.8n7 r9 = (X.C181218n7) r9     // Catch:{ all -> 0x09c2 }
            X.14e r10 = r3.A02     // Catch:{ all -> 0x09c2 }
            java.lang.String[] r7 = new java.lang.String[r4]     // Catch:{ all -> 0x09c2 }
            long r0 = r9.A1N     // Catch:{ all -> 0x09c2 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x09c2 }
            r7[r2] = r0     // Catch:{ all -> 0x09c2 }
            java.lang.String r1 = "SELECT setting_duration FROM message_system_ephemeral_setting_not_applied WHERE message_row_id = ?"
            java.lang.String r0 = "GET_SYSTEM_MESSAGE_EPHEMERAL_SETTING_NOT_APPLIED"
            android.database.Cursor r7 = r10.A09(r1, r0, r7)     // Catch:{ all -> 0x09c2 }
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x09b6 }
            if (r0 == 0) goto L_0x04ee
            java.lang.String r0 = "setting_duration"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x09b6 }
            int r0 = r7.getInt(r0)     // Catch:{ all -> 0x09b6 }
            r9.A00 = r0     // Catch:{ all -> 0x09b6 }
        L_0x04ee:
            r7.close()     // Catch:{ all -> 0x09c2 }
        L_0x04f1:
            boolean r0 = r5 instanceof X.AnonymousClass2cI     // Catch:{ all -> 0x09c2 }
            if (r0 == 0) goto L_0x052d
            r9 = r5
            X.2cI r9 = (X.AnonymousClass2cI) r9     // Catch:{ all -> 0x09c2 }
            X.14e r10 = r3.A02     // Catch:{ all -> 0x09c2 }
            java.lang.String[] r7 = new java.lang.String[r4]     // Catch:{ all -> 0x09c2 }
            long r0 = r9.A1N     // Catch:{ all -> 0x09c2 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x09c2 }
            r7[r2] = r0     // Catch:{ all -> 0x09c2 }
            java.lang.String r1 = "SELECT message_row_id, privacy_message_type, business_name FROM message_system_business_state WHERE message_row_id = ?"
            java.lang.String r0 = "GET_SYSTEM_MESSAGE_BUSINESS_STATE_FOR_MESSAGE_ROW_ID"
            android.database.Cursor r7 = r10.A09(r1, r0, r7)     // Catch:{ all -> 0x09c2 }
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x09b6 }
            if (r0 == 0) goto L_0x052a
            java.lang.String r0 = "privacy_message_type"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x09b6 }
            int r0 = r7.getInt(r0)     // Catch:{ all -> 0x09b6 }
            r9.A00 = r0     // Catch:{ all -> 0x09b6 }
            java.lang.String r0 = "business_name"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x09b6 }
            java.lang.String r0 = r7.getString(r0)     // Catch:{ all -> 0x09b6 }
            r9.A01 = r0     // Catch:{ all -> 0x09b6 }
        L_0x052a:
            r7.close()     // Catch:{ all -> 0x09c2 }
        L_0x052d:
            boolean r0 = r5 instanceof X.C181208n6     // Catch:{ all -> 0x09c2 }
            if (r0 == 0) goto L_0x0578
            X.17N r0 = r8.A04     // Catch:{ all -> 0x09c2 }
            r13 = r5
            X.8n6 r13 = (X.C181208n6) r13     // Catch:{ all -> 0x09c2 }
            X.12P r0 = r0.A00     // Catch:{ all -> 0x09c2 }
            X.1M0 r12 = r0.get()     // Catch:{ all -> 0x09c2 }
            X.14e r11 = r12.A02     // Catch:{ all -> 0x09a3 }
            java.lang.String r10 = "SELECT service, invite_used FROM message_system_payment_invite_setup WHERE message_row_id =?"
            r9 = 1
            java.lang.String[] r7 = new java.lang.String[r4]     // Catch:{ all -> 0x09a3 }
            long r0 = r13.A1N     // Catch:{ all -> 0x09a3 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x09a3 }
            r7[r2] = r0     // Catch:{ all -> 0x09a3 }
            java.lang.String r0 = "GET_SYSTEM_MESSAGE_PAYMENT_INVITE_SETUP"
            android.database.Cursor r7 = r11.A09(r10, r0, r7)     // Catch:{ all -> 0x09a3 }
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x0997 }
            if (r0 == 0) goto L_0x0572
            java.lang.String r0 = "service"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0997 }
            int r0 = r7.getInt(r0)     // Catch:{ all -> 0x0997 }
            r13.A00 = r0     // Catch:{ all -> 0x0997 }
            java.lang.String r0 = "invite_used"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0997 }
            int r0 = r7.getInt(r0)     // Catch:{ all -> 0x0997 }
            if (r0 == r4) goto L_0x0570
            r9 = 0
        L_0x0570:
            r13.A01 = r9     // Catch:{ all -> 0x0997 }
        L_0x0572:
            r7.close()     // Catch:{ all -> 0x09a3 }
            r12.close()     // Catch:{ all -> 0x09c2 }
        L_0x0578:
            boolean r0 = r5 instanceof X.C181418nR     // Catch:{ all -> 0x09c2 }
            if (r0 == 0) goto L_0x05ab
            r9 = r5
            X.8nR r9 = (X.C181418nR) r9     // Catch:{ all -> 0x09c2 }
            X.AnonymousClass00C.A0D(r9, r4)     // Catch:{ all -> 0x09c2 }
            X.14e r10 = r3.A02     // Catch:{ all -> 0x09c2 }
            java.lang.String[] r7 = new java.lang.String[r4]     // Catch:{ all -> 0x09c2 }
            long r0 = r9.A1N     // Catch:{ all -> 0x09c2 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x09c2 }
            r7[r2] = r0     // Catch:{ all -> 0x09c2 }
            java.lang.String r1 = "SELECT threshold FROM message_system_group_auto_restrict WHERE message_row_id = ?"
            java.lang.String r0 = "GET_SYSTEM_MESSAGE_GROUP_AUTO_RESTRICT"
            android.database.Cursor r7 = r10.A09(r1, r0, r7)     // Catch:{ all -> 0x09c2 }
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x09a8 }
            if (r0 == 0) goto L_0x05a8
            java.lang.String r0 = "threshold"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x09a8 }
            int r0 = r7.getInt(r0)     // Catch:{ all -> 0x09a8 }
            r9.A00 = r0     // Catch:{ all -> 0x09a8 }
        L_0x05a8:
            r7.close()     // Catch:{ all -> 0x09c2 }
        L_0x05ab:
            boolean r0 = r5 instanceof X.C46992cO     // Catch:{ all -> 0x09c2 }
            if (r0 == 0) goto L_0x0604
            r9 = r5
            X.2cO r9 = (X.C46992cO) r9     // Catch:{ all -> 0x09c2 }
            X.14e r12 = r3.A02     // Catch:{ all -> 0x09c2 }
            r11 = 1
            java.lang.String[] r7 = new java.lang.String[r4]     // Catch:{ all -> 0x09c2 }
            long r0 = r9.A1N     // Catch:{ all -> 0x09c2 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x09c2 }
            r10 = 0
            r7[r2] = r0     // Catch:{ all -> 0x09c2 }
            java.lang.String r1 = "SELECT call_id, is_video_call, call_type FROM message_system_linked_group_call WHERE message_row_id = ?"
            java.lang.String r0 = "GET_SYSTEM_MESSAGE_LINKED_GROUP_CALL"
            android.database.Cursor r7 = r12.A09(r1, r0, r7)     // Catch:{ all -> 0x09c2 }
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x09b6 }
            if (r0 == 0) goto L_0x0601
            java.lang.String r0 = "call_id"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x09b6 }
            java.lang.String r0 = r7.getString(r0)     // Catch:{ all -> 0x09b6 }
            r9.A01 = r0     // Catch:{ all -> 0x09b6 }
            java.lang.String r0 = "is_video_call"
            int r1 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x09b6 }
            boolean r0 = r7.isNull(r1)     // Catch:{ all -> 0x09b6 }
            if (r0 != 0) goto L_0x05ef
            int r0 = r7.getInt(r1)     // Catch:{ all -> 0x09b6 }
            if (r0 == r4) goto L_0x05ed
            r11 = 0
        L_0x05ed:
            r9.A02 = r11     // Catch:{ all -> 0x09b6 }
        L_0x05ef:
            java.lang.String r0 = "call_type"
            int r1 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x09b6 }
            boolean r0 = r7.isNull(r1)     // Catch:{ all -> 0x09b6 }
            if (r0 != 0) goto L_0x05ff
            int r10 = r7.getInt(r1)     // Catch:{ all -> 0x09b6 }
        L_0x05ff:
            r9.A00 = r10     // Catch:{ all -> 0x09b6 }
        L_0x0601:
            r7.close()     // Catch:{ all -> 0x09c2 }
        L_0x0604:
            boolean r0 = r5 instanceof X.C181408nQ     // Catch:{ all -> 0x09c2 }
            if (r0 == 0) goto L_0x0665
            r9 = r5
            X.8nQ r9 = (X.C181408nQ) r9     // Catch:{ all -> 0x09c2 }
            X.14e r10 = r3.A02     // Catch:{ all -> 0x09c2 }
            java.lang.String[] r7 = new java.lang.String[r4]     // Catch:{ all -> 0x09c2 }
            long r0 = r9.A1N     // Catch:{ all -> 0x09c2 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x09c2 }
            r7[r2] = r0     // Catch:{ all -> 0x09c2 }
            java.lang.String r1 = "SELECT old_group_type, new_group_type, linked_parent_group_jid_row_id FROM message_system_community_link_changed WHERE message_row_id = ?"
            java.lang.String r0 = "GET_MESSAGE_SYSTEM_COMMUNITY_LINK_CHANGED"
            android.database.Cursor r7 = r10.A09(r1, r0, r7)     // Catch:{ all -> 0x09c2 }
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x09b6 }
            if (r0 == 0) goto L_0x0662
            java.lang.String r0 = "old_group_type"
            int r1 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x09b6 }
            boolean r0 = r7.isNull(r1)     // Catch:{ all -> 0x09b6 }
            if (r0 == 0) goto L_0x0633
            r0 = 0
            goto L_0x063b
        L_0x0633:
            int r0 = r7.getInt(r1)     // Catch:{ all -> 0x09b6 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x09b6 }
        L_0x063b:
            r9.A02 = r0     // Catch:{ all -> 0x09b6 }
            java.lang.String r0 = "new_group_type"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x09b6 }
            int r0 = r7.getInt(r0)     // Catch:{ all -> 0x09b6 }
            r9.A00 = r0     // Catch:{ all -> 0x09b6 }
            java.lang.String r0 = "linked_parent_group_jid_row_id"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x09b6 }
            int r0 = r7.getInt(r0)     // Catch:{ all -> 0x09b6 }
            X.12j r10 = r8.A02     // Catch:{ all -> 0x09b6 }
            long r0 = (long) r0     // Catch:{ all -> 0x09b6 }
            com.whatsapp.jid.Jid r1 = r10.A09(r0)     // Catch:{ all -> 0x09b6 }
            android.os.Parcelable$Creator r0 = X.AnonymousClass147.CREATOR     // Catch:{ all -> 0x09b6 }
            X.147 r0 = X.C65533Sl.A03(r1)     // Catch:{ all -> 0x09b6 }
            r9.A01 = r0     // Catch:{ all -> 0x09b6 }
        L_0x0662:
            r7.close()     // Catch:{ all -> 0x09c2 }
        L_0x0665:
            boolean r0 = r5 instanceof X.C181398nP     // Catch:{ all -> 0x09c2 }
            if (r0 == 0) goto L_0x0695
            r9 = r5
            X.8nP r9 = (X.C181398nP) r9     // Catch:{ all -> 0x09c2 }
            X.14e r10 = r3.A02     // Catch:{ all -> 0x09c2 }
            java.lang.String[] r7 = new java.lang.String[r4]     // Catch:{ all -> 0x09c2 }
            long r0 = r9.A1N     // Catch:{ all -> 0x09c2 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x09c2 }
            r7[r2] = r0     // Catch:{ all -> 0x09c2 }
            java.lang.String r1 = "SELECT linked_parent_group_name FROM message_system_group_with_parent WHERE message_row_id = ?"
            java.lang.String r0 = "GET_MESSAGE_SYSTEM_GROUP_WITH_PARENT"
            android.database.Cursor r7 = r10.A09(r1, r0, r7)     // Catch:{ all -> 0x09c2 }
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x09b6 }
            if (r0 == 0) goto L_0x0692
            java.lang.String r0 = "linked_parent_group_name"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x09b6 }
            java.lang.String r0 = r7.getString(r0)     // Catch:{ all -> 0x09b6 }
            r9.A00 = r0     // Catch:{ all -> 0x09b6 }
        L_0x0692:
            r7.close()     // Catch:{ all -> 0x09c2 }
        L_0x0695:
            boolean r0 = r5 instanceof X.AnonymousClass2cS     // Catch:{ all -> 0x09c2 }
            if (r0 == 0) goto L_0x0710
            r9 = r5
            X.2cS r9 = (X.AnonymousClass2cS) r9     // Catch:{ all -> 0x09c2 }
            X.14e r10 = r3.A02     // Catch:{ all -> 0x09c2 }
            java.lang.String[] r7 = new java.lang.String[r4]     // Catch:{ all -> 0x09c2 }
            long r0 = r9.A1N     // Catch:{ all -> 0x09c2 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x09c2 }
            r7[r2] = r0     // Catch:{ all -> 0x09c2 }
            java.lang.String r1 = "SELECT subgroup_raw_jid, subgroup_subject, parent_group_jid_row_id FROM message_system_sibling_group_link_change WHERE message_row_id = ?"
            java.lang.String r0 = "GET_SUBGROUPS_BY_MSG_ROW_ID"
            android.database.Cursor r7 = r10.A09(r1, r0, r7)     // Catch:{ all -> 0x09c2 }
            java.util.HashSet r10 = new java.util.HashSet     // Catch:{ all -> 0x09b6 }
            r10.<init>()     // Catch:{ all -> 0x09b6 }
            java.lang.String r0 = "subgroup_raw_jid"
            int r13 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x09b6 }
            java.lang.String r0 = "subgroup_subject"
            int r12 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x09b6 }
            java.lang.String r0 = "parent_group_jid_row_id"
            int r11 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x09b6 }
            r1 = 0
        L_0x06c8:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x09b6 }
            if (r0 == 0) goto L_0x06fa
            java.lang.String r1 = r7.getString(r13)     // Catch:{ all -> 0x09b6 }
            X.3Sl r0 = X.AnonymousClass147.A01     // Catch:{ all -> 0x09b6 }
            X.147 r23 = r0.A06(r1)     // Catch:{ all -> 0x09b6 }
            java.lang.String r24 = r7.getString(r12)     // Catch:{ all -> 0x09b6 }
            r26 = 0
            r25 = 2
            X.3QK r0 = new X.3QK     // Catch:{ all -> 0x09b6 }
            r22 = r0
            r22.<init>(r23, r24, r25, r26)     // Catch:{ all -> 0x09b6 }
            r10.add(r0)     // Catch:{ all -> 0x09b6 }
            int r0 = r7.getInt(r11)     // Catch:{ all -> 0x09b6 }
            X.12j r14 = r8.A02     // Catch:{ all -> 0x09b6 }
            long r0 = (long) r0     // Catch:{ all -> 0x09b6 }
            com.whatsapp.jid.Jid r0 = r14.A09(r0)     // Catch:{ all -> 0x09b6 }
            X.147 r1 = X.C65533Sl.A03(r0)     // Catch:{ all -> 0x09b6 }
            goto L_0x06c8
        L_0x06fa:
            r9.A01 = r1     // Catch:{ all -> 0x09b6 }
            int r0 = r10.size()     // Catch:{ all -> 0x09b6 }
            if (r0 >= 0) goto L_0x0703
            r0 = 0
        L_0x0703:
            r9.A00 = r0     // Catch:{ all -> 0x09b6 }
            java.util.Set r0 = r9.A03     // Catch:{ all -> 0x09b6 }
            r0.clear()     // Catch:{ all -> 0x09b6 }
            r0.addAll(r10)     // Catch:{ all -> 0x09b6 }
            r7.close()     // Catch:{ all -> 0x09c2 }
        L_0x0710:
            boolean r0 = r5 instanceof X.C181748ny     // Catch:{ all -> 0x09c2 }
            if (r0 == 0) goto L_0x0798
            r10 = r5
            X.8ny r10 = (X.C181748ny) r10     // Catch:{ all -> 0x09c2 }
            java.lang.String r9 = "SystemMessageStore/fillMessageSystemWithGroupNodes/no jid found"
            X.14e r11 = r3.A02     // Catch:{ all -> 0x09c2 }
            java.lang.String[] r7 = new java.lang.String[r4]     // Catch:{ all -> 0x09c2 }
            long r0 = r10.A1N     // Catch:{ all -> 0x09c2 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x09c2 }
            r7[r2] = r0     // Catch:{ all -> 0x09c2 }
            java.lang.String r1 = "SELECT group_jid_row_id, group_subject, group_node_type, version FROM message_system_with_group_nodes WHERE message_row_id = ?"
            java.lang.String r0 = "GET_ALL_GROUP_NODES_BY_MSG_ROW_ID"
            android.database.Cursor r11 = r11.A09(r1, r0, r7)     // Catch:{ all -> 0x09c2 }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x09af }
            r12.<init>()     // Catch:{ all -> 0x09af }
            java.lang.String r0 = "group_jid_row_id"
            int r18 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x09af }
            java.lang.String r0 = "group_subject"
            int r17 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x09af }
            java.lang.String r0 = "group_node_type"
            int r16 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x09af }
            java.lang.String r0 = "version"
            int r7 = r11.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x09af }
        L_0x074a:
            boolean r0 = r11.moveToNext()     // Catch:{ all -> 0x09af }
            if (r0 == 0) goto L_0x0792
            r0 = r18
            int r0 = r11.getInt(r0)     // Catch:{ all -> 0x09af }
            X.12j r13 = r8.A02     // Catch:{ all -> 0x09af }
            long r0 = (long) r0     // Catch:{ all -> 0x09af }
            com.whatsapp.jid.Jid r1 = r13.A09(r0)     // Catch:{ all -> 0x09af }
            android.os.Parcelable$Creator r0 = X.AnonymousClass147.CREATOR     // Catch:{ all -> 0x09af }
            X.147 r13 = X.C65533Sl.A03(r1)     // Catch:{ all -> 0x09af }
            r0 = r17
            java.lang.String r14 = r11.getString(r0)     // Catch:{ all -> 0x09af }
            r0 = r16
            int r15 = r11.getInt(r0)     // Catch:{ all -> 0x09af }
            boolean r0 = r11.isNull(r7)     // Catch:{ all -> 0x09af }
            if (r0 == 0) goto L_0x0776
            goto L_0x077b
        L_0x0776:
            int r1 = r11.getInt(r7)     // Catch:{ all -> 0x09af }
            goto L_0x077c
        L_0x077b:
            r1 = 0
        L_0x077c:
            if (r13 == 0) goto L_0x0787
            X.9Wj r0 = new X.9Wj     // Catch:{ all -> 0x09af }
            r0.<init>(r13, r14, r15, r1)     // Catch:{ all -> 0x09af }
            r12.add(r0)     // Catch:{ all -> 0x09af }
            goto L_0x074a
        L_0x0787:
            X.C18740tg.A0D(r2, r9)     // Catch:{ all -> 0x09af }
            X.0wN r1 = r8.A00     // Catch:{ all -> 0x09af }
            java.lang.String r0 = "wa-community-event"
            r1.A0E(r0, r9, r4)     // Catch:{ all -> 0x09af }
            goto L_0x074a
        L_0x0792:
            r10.A1f(r12)     // Catch:{ all -> 0x09af }
            r11.close()     // Catch:{ all -> 0x09c2 }
        L_0x0798:
            boolean r0 = r5 instanceof X.C181228n8     // Catch:{ all -> 0x09c2 }
            if (r0 == 0) goto L_0x07d8
            r9 = r5
            X.8n8 r9 = (X.C181228n8) r9     // Catch:{ all -> 0x09c2 }
            X.14e r10 = r3.A02     // Catch:{ all -> 0x09c2 }
            r8 = 1
            java.lang.String[] r7 = new java.lang.String[r4]     // Catch:{ all -> 0x09c2 }
            long r0 = r9.A1N     // Catch:{ all -> 0x09c2 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x09c2 }
            r7[r2] = r0     // Catch:{ all -> 0x09c2 }
            java.lang.String r1 = "SELECT agent_name, is_unassigned_chat FROM message_system_chat_assignment WHERE message_row_id = ?"
            java.lang.String r0 = "GET_SYSTEM_MESSAGE_CHAT_ASSIGNMENT"
            android.database.Cursor r7 = r10.A09(r1, r0, r7)     // Catch:{ all -> 0x09c2 }
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x09b6 }
            if (r0 == 0) goto L_0x07d5
            java.lang.String r0 = "agent_name"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x09b6 }
            java.lang.String r0 = r7.getString(r0)     // Catch:{ all -> 0x09b6 }
            r9.A00 = r0     // Catch:{ all -> 0x09b6 }
            java.lang.String r0 = "is_unassigned_chat"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x09b6 }
            int r0 = r7.getInt(r0)     // Catch:{ all -> 0x09b6 }
            if (r0 == r4) goto L_0x07d3
            r8 = 0
        L_0x07d3:
            r9.A01 = r8     // Catch:{ all -> 0x09b6 }
        L_0x07d5:
            r7.close()     // Catch:{ all -> 0x09c2 }
        L_0x07d8:
            boolean r0 = r5 instanceof X.AnonymousClass2cN     // Catch:{ all -> 0x09c2 }
            if (r0 == 0) goto L_0x0820
            r8 = r5
            X.2cN r8 = (X.AnonymousClass2cN) r8     // Catch:{ all -> 0x09c2 }
            X.14e r9 = r3.A02     // Catch:{ all -> 0x09c2 }
            java.lang.String[] r7 = new java.lang.String[r4]     // Catch:{ all -> 0x09c2 }
            long r0 = r8.A1N     // Catch:{ all -> 0x09c2 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x09c2 }
            r7[r2] = r0     // Catch:{ all -> 0x09c2 }
            java.lang.String r1 = "SELECT creation_message_row_id, call_title, call_timestamp_ms FROM message_system_scheduled_call_start WHERE message_row_id = ?"
            java.lang.String r0 = "GET_SYSTEM_MESSAGE_SCHEDULED_CALL_START"
            android.database.Cursor r7 = r9.A09(r1, r0, r7)     // Catch:{ all -> 0x09c2 }
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x09b6 }
            if (r0 == 0) goto L_0x081d
            java.lang.String r0 = "creation_message_row_id"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x09b6 }
            long r0 = r7.getLong(r0)     // Catch:{ all -> 0x09b6 }
            r8.A01 = r0     // Catch:{ all -> 0x09b6 }
            java.lang.String r0 = "call_timestamp_ms"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x09b6 }
            long r0 = r7.getLong(r0)     // Catch:{ all -> 0x09b6 }
            r8.A00 = r0     // Catch:{ all -> 0x09b6 }
            java.lang.String r0 = "call_title"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x09b6 }
            java.lang.String r0 = r7.getString(r0)     // Catch:{ all -> 0x09b6 }
            r8.A02 = r0     // Catch:{ all -> 0x09b6 }
        L_0x081d:
            r7.close()     // Catch:{ all -> 0x09c2 }
        L_0x0820:
            boolean r0 = r5 instanceof X.AnonymousClass5JE     // Catch:{ all -> 0x09c2 }
            if (r0 == 0) goto L_0x086b
            r8 = r5
            X.5JE r8 = (X.AnonymousClass5JE) r8     // Catch:{ all -> 0x09c2 }
            X.14e r9 = r3.A02     // Catch:{ all -> 0x09c2 }
            java.lang.String[] r7 = new java.lang.String[r4]     // Catch:{ all -> 0x09c2 }
            long r0 = r8.A1N     // Catch:{ all -> 0x09c2 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x09c2 }
            r7[r2] = r0     // Catch:{ all -> 0x09c2 }
            java.lang.String r1 = "SELECT original_message_row_id, reminder_content, reminder_timestamp_ms FROM message_system_reminder_setup WHERE message_row_id = ?"
            java.lang.String r0 = "GET_SYSTEM_MESSAGE_REMINDER_SETUP"
            android.database.Cursor r7 = r9.A09(r1, r0, r7)     // Catch:{ all -> 0x09c2 }
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x09b6 }
            if (r0 == 0) goto L_0x0868
            java.lang.String r0 = "original_message_row_id"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x09b6 }
            long r0 = r7.getLong(r0)     // Catch:{ all -> 0x09b6 }
            r8.A00 = r0     // Catch:{ all -> 0x09b6 }
            java.lang.String r0 = "reminder_timestamp_ms"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x09b6 }
            long r0 = r7.getLong(r0)     // Catch:{ all -> 0x09b6 }
            r8.A01 = r0     // Catch:{ all -> 0x09b6 }
            java.lang.String r0 = "reminder_content"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x09b6 }
            java.lang.String r0 = r7.getString(r0)     // Catch:{ all -> 0x09b6 }
            X.AnonymousClass00C.A0D(r0, r2)     // Catch:{ all -> 0x09b6 }
            r8.A02 = r0     // Catch:{ all -> 0x09b6 }
        L_0x0868:
            r7.close()     // Catch:{ all -> 0x09c2 }
        L_0x086b:
            boolean r0 = r5 instanceof X.AnonymousClass2cK     // Catch:{ all -> 0x09c2 }
            if (r0 == 0) goto L_0x08aa
            r8 = r5
            X.2cK r8 = (X.AnonymousClass2cK) r8     // Catch:{ all -> 0x09c2 }
            X.14e r7 = r3.A02     // Catch:{ all -> 0x09c2 }
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ all -> 0x09c2 }
            long r0 = r8.A1N     // Catch:{ all -> 0x09c2 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x09c2 }
            r4[r2] = r0     // Catch:{ all -> 0x09c2 }
            java.lang.String r1 = "SELECT original_message_row_id, original_reminder_content FROM message_system_reminder_sent WHERE message_row_id = ?"
            java.lang.String r0 = "GET_SYSTEM_MESSAGE_REMINDER_SENT"
            android.database.Cursor r7 = r7.A09(r1, r0, r4)     // Catch:{ all -> 0x09c2 }
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x09b6 }
            if (r0 == 0) goto L_0x08a7
            java.lang.String r0 = "original_message_row_id"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x09b6 }
            long r0 = r7.getLong(r0)     // Catch:{ all -> 0x09b6 }
            r8.A00 = r0     // Catch:{ all -> 0x09b6 }
            java.lang.String r0 = "original_reminder_content"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x09b6 }
            java.lang.String r0 = r7.getString(r0)     // Catch:{ all -> 0x09b6 }
            X.AnonymousClass00C.A0D(r0, r2)     // Catch:{ all -> 0x09b6 }
            r8.A01 = r0     // Catch:{ all -> 0x09b6 }
        L_0x08a7:
            r7.close()     // Catch:{ all -> 0x09c2 }
        L_0x08aa:
            r3.close()     // Catch:{ all -> 0x09cc }
        L_0x08ad:
            r21.close()     // Catch:{ all -> 0x09d8 }
            r20.close()
            goto L_0x0038
        L_0x08b5:
            r0 = r28
            X.12j r3 = r0.A02
            java.lang.String r0 = "_id"
            int r0 = r6.getColumnIndexOrThrow(r0)
            long r0 = r6.getLong(r0)
            r5.A1N = r0
            java.lang.String r0 = "sort_id"
            int r0 = r6.getColumnIndexOrThrow(r0)
            long r0 = r6.getLong(r0)
            r5.A1O = r0
            r0 = r19
            int r0 = r6.getColumnIndexOrThrow(r0)
            int r0 = r6.getInt(r0)
            r5.A0n(r0)
            java.lang.String r0 = "broadcast"
            int r0 = r6.getColumnIndexOrThrow(r0)
            int r1 = r6.getInt(r0)
            r4 = 0
            r2 = 1
            r0 = 0
            if (r1 <= 0) goto L_0x08ee
            r0 = 1
        L_0x08ee:
            r5.A10 = r0
            java.lang.String r0 = "recipient_count"
            int r0 = r6.getColumnIndexOrThrow(r0)
            int r0 = r6.getInt(r0)
            r5.A0B = r0
            java.lang.String r0 = "participant_hash"
            int r0 = r6.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r6.getString(r0)
            r5.A0s = r0
            java.lang.String r0 = "origination_flags"
            int r0 = r6.getColumnIndexOrThrow(r0)
            int r0 = r6.getInt(r0)
            r5.A0j(r0)
            java.lang.String r0 = "origin"
            int r0 = r6.getColumnIndexOrThrow(r0)
            int r0 = r6.getInt(r0)
            r5.A09 = r0
            java.lang.String r0 = "received_timestamp"
            int r0 = r6.getColumnIndexOrThrow(r0)
            long r0 = r6.getLong(r0)
            r5.A0G = r0
            java.lang.String r0 = "receipt_server_timestamp"
            int r0 = r6.getColumnIndexOrThrow(r0)
            long r0 = r6.getLong(r0)
            r5.A0H = r0
            java.lang.String r0 = "starred"
            int r0 = r6.getColumnIndexOrThrow(r0)
            int r0 = r6.getInt(r0)
            if (r0 != r2) goto L_0x0946
            r4 = 1
        L_0x0946:
            r5.A15 = r4
            java.lang.String r0 = "lookup_tables"
            int r0 = r6.getColumnIndexOrThrow(r0)
            long r0 = r6.getLong(r0)
            r5.A1R = r0
            java.lang.String r0 = "message_add_on_flags"
            int r0 = r6.getColumnIndexOrThrow(r0)
            int r0 = r6.getInt(r0)
            r5.A0i(r0)
            java.lang.Class<X.11F> r2 = X.AnonymousClass11F.class
            java.lang.String r0 = "sender_jid_row_id"
            int r0 = r6.getColumnIndexOrThrow(r0)
            long r0 = r6.getLong(r0)
            com.whatsapp.jid.Jid r0 = r3.A0C(r2, r0)
            X.11F r0 = (X.AnonymousClass11F) r0
            r5.A0q(r0)
            java.lang.String r0 = "text_data"
            int r0 = r6.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r6.getString(r0)
            r5.A17(r0)
            return r5
        L_0x0984:
            r1 = move-exception
            if (r10 == 0) goto L_0x09c1
            r10.close()     // Catch:{ all -> 0x0992 }
            goto L_0x09c1
        L_0x098b:
            r1 = move-exception
            if (r7 == 0) goto L_0x09c1
            r7.close()     // Catch:{ all -> 0x0992 }
            goto L_0x09c1
        L_0x0992:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x09c2 }
            goto L_0x09c1
        L_0x0997:
            r1 = move-exception
            if (r7 == 0) goto L_0x09a2
            r7.close()     // Catch:{ all -> 0x099e }
            goto L_0x09a2
        L_0x099e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x09a3 }
        L_0x09a2:
            throw r1     // Catch:{ all -> 0x09a3 }
        L_0x09a3:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x09bd }
            goto L_0x09c1
        L_0x09a8:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x09aa }
        L_0x09aa:
            r0 = move-exception
            X.C05600Qi.A00(r7, r1)     // Catch:{ all -> 0x09c2 }
            throw r0     // Catch:{ all -> 0x09c2 }
        L_0x09af:
            r1 = move-exception
            if (r11 == 0) goto L_0x09c1
            r11.close()     // Catch:{ all -> 0x09bd }
            goto L_0x09c1
        L_0x09b6:
            r1 = move-exception
            if (r7 == 0) goto L_0x09c1
            r7.close()     // Catch:{ all -> 0x09bd }
            goto L_0x09c1
        L_0x09bd:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x09c2 }
        L_0x09c1:
            throw r1     // Catch:{ all -> 0x09c2 }
        L_0x09c2:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x09c7 }
            goto L_0x09cb
        L_0x09c7:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x09cc }
        L_0x09cb:
            throw r1     // Catch:{ all -> 0x09cc }
        L_0x09cc:
            r1 = move-exception
            if (r21 == 0) goto L_0x09d7
            r21.close()     // Catch:{ all -> 0x09d3 }
            goto L_0x09d7
        L_0x09d3:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x09d8 }
        L_0x09d7:
            throw r1     // Catch:{ all -> 0x09d8 }
        L_0x09d8:
            r1 = move-exception
            r20.close()     // Catch:{ all -> 0x09dd }
            throw r1
        L_0x09dd:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass178.A00(android.database.Cursor, X.178, X.3Qa):X.3T1");
    }

    public static void A01(ContentValues contentValues, AnonymousClass178 r6, AnonymousClass3T1 r7) {
        AnonymousClass163 r1 = r6.A01;
        C64933Qa r2 = r7.A1J;
        AnonymousClass11F r0 = r2.A00;
        C18740tg.A06(r0);
        contentValues.put("chat_row_id", Long.valueOf(r1.A08(r0)));
        AnonymousClass3SW.A02(contentValues, "from_me", r2.A02);
        contentValues.put("key_id", r2.A01);
        contentValues.put("status", Integer.valueOf(r7.A0D));
        AnonymousClass3SW.A02(contentValues, "broadcast", r7.A10);
        contentValues.put("recipient_count", Integer.valueOf(r7.A0B));
        AnonymousClass3SW.A01(contentValues, "participant_hash", r7.A0s);
        contentValues.put("origination_flags", Integer.valueOf(r7.A0F()));
        contentValues.put("origin", Integer.valueOf(r7.A09));
        contentValues.put("timestamp", Long.valueOf(r7.A0I));
        long j = r7.A0G;
        if (j == 0) {
            j = C19970wo.A00(r6.A06);
        }
        contentValues.put("received_timestamp", Long.valueOf(j));
        contentValues.put("receipt_server_timestamp", Long.valueOf(r7.A0H));
        contentValues.put("message_type", Integer.valueOf(r7.A1I));
        AnonymousClass3SW.A01(contentValues, "text_data", r7.A0d());
        contentValues.put("lookup_tables", Long.valueOf(r7.A0I()));
        contentValues.put("sort_id", Long.valueOf(r7.A1O));
        contentValues.put("message_add_on_flags", Integer.valueOf(r7.A08));
        A03(contentValues, r7);
    }

    private void A02(ContentValues contentValues, AnonymousClass3T1 r7) {
        contentValues.put("status", Integer.valueOf(r7.A0D));
        contentValues.put("recipient_count", Integer.valueOf(r7.A0B));
        contentValues.put("origination_flags", Integer.valueOf(r7.A0F()));
        contentValues.put("origin", Integer.valueOf(r7.A09));
        contentValues.put("timestamp", Long.valueOf(r7.A0I));
        long j = r7.A0G;
        if (j == 0) {
            j = C19970wo.A00(this.A06);
        }
        contentValues.put("received_timestamp", Long.valueOf(j));
        contentValues.put("receipt_server_timestamp", Long.valueOf(r7.A0H));
        contentValues.put("message_type", Integer.valueOf(r7.A1I));
        AnonymousClass3SW.A01(contentValues, "text_data", r7.A0d());
        contentValues.put("lookup_tables", Long.valueOf(r7.A0I()));
        contentValues.put("sort_id", Long.valueOf(r7.A1O));
        contentValues.put("message_add_on_flags", Integer.valueOf(r7.A08));
    }

    public boolean A06(Set set, boolean z) {
        AnonymousClass72Z r1 = new AnonymousClass72Z(set.toArray(C19430v1.A0M), 975);
        AnonymousClass1M0 A052 = this.A03.A05();
        try {
            ContentValues contentValues = new ContentValues();
            Iterator it = r1.iterator();
            int i = 0;
            while (it.hasNext()) {
                Long[] lArr = (Long[]) it.next();
                int length = lArr.length;
                String[] strArr = new String[length];
                for (int i2 = 0; i2 < length; i2++) {
                    strArr[i2] = String.valueOf(lArr[i2]);
                }
                AnonymousClass3SW.A02(contentValues, "starred", z);
                C224114e r7 = A052.A02;
                StringBuilder sb = new StringBuilder();
                sb.append("_id IN ");
                sb.append(AnonymousClass1M2.A00(length));
                i += r7.A01(contentValues, "message", sb.toString(), "UPDATE_MESSAGE_STARRED_BY_ROW_ID_MAIN_SQL", strArr);
            }
            A052.close();
            if (i != set.size()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("MainMessageStore/updateMessageStarredStatusV2/update failed; rowIds=");
                sb2.append(set);
                Log.e(sb2.toString());
            }
            return true;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public AnonymousClass178(C19700wN r1, AnonymousClass179 r2, C19970wo r3, AnonymousClass163 r4, C219712j r5, AnonymousClass12P r6, C219612i r7, AnonymousClass17A r8, C20810yC r9, AnonymousClass17E r10) {
        this.A06 = r3;
        this.A04 = r9;
        this.A02 = r5;
        this.A01 = r4;
        this.A00 = r1;
        this.A05 = r2;
        this.A07 = r7;
        this.A08 = r8;
        this.A03 = r6;
        this.A09 = r10;
    }

    public static void A03(ContentValues contentValues, AnonymousClass3T1 r5) {
        int i;
        if ((r5.A0P() == null || !(r5.A0P() instanceof AnonymousClass2bB)) && ((r5.A0a() == null || r5.A0a().A01 != C52132ow.A02) && (!(r5 instanceof AnonymousClass2c3) || ((AnonymousClass2c3) r5).A00 != 1))) {
            i = 0;
        } else {
            i = 1;
        }
        contentValues.put("view_mode", i);
    }
}
