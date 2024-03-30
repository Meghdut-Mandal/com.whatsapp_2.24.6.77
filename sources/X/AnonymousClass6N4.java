package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.6N4  reason: invalid class name */
public final class AnonymousClass6N4 {
    public final AnonymousClass1RU A00;
    public final C133346Xy A01;
    public final C131306On A02;
    public final C229516p A03;
    public final C19630wG A04;

    public final String A01(AnonymousClass3KU r12, String str, String str2, String str3) {
        String A0J;
        String A0J2;
        String str4;
        Throwable th;
        long j;
        StringBuilder A0t = C36401kF.A0t(str, 1);
        A0t.append("NotificationUiBuilder/getNameForSenderJid/");
        String str5 = r12.A08;
        C36321k7.A1a(A0t, AnonymousClass3LV.A01(str5));
        Jid A022 = Jid.Companion.A02(str);
        if (A022 != null) {
            if (AnonymousClass143.A0I(A022)) {
                Log.i("NotificationUiBuilder/getNameForSenderJid/isLidJid:true");
                C133346Xy r2 = this.A01;
                File A002 = C133346Xy.A00(r2, str5);
                if (A002 == null || !A002.exists()) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    C90464aC.A1H("AccountSwitchingFileManager/getLidFromJidFromInactiveAccount/account ", str5, A0u);
                    C36321k7.A1a(A0u, " databases dir does not exist");
                    C90464aC.A13(r2, "AccountSwitchingFileManager/getLidFromJidFromInactiveAccount/stagingDirLogString/", AnonymousClass000.A0u());
                    A022 = null;
                } else {
                    File A0T = C90524aI.A0T(A002.getAbsolutePath(), "msgstore.db");
                    AnonymousClass12S r4 = r2.A02;
                    AnonymousClass11g r3 = r2.A01;
                    SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(A0T.getAbsolutePath(), (SQLiteDatabase.CursorFactory) null, 0);
                    try {
                        long A003 = C219712j.A00(C224014d.A01(openDatabase, r3, r4, "msgstore.db"), A022);
                        if (openDatabase != null) {
                            openDatabase.close();
                        }
                        openDatabase = SQLiteDatabase.openDatabase(A0T.getAbsolutePath(), (SQLiteDatabase.CursorFactory) null, 0);
                        C224114e A012 = C224014d.A01(openDatabase, r3, r4, "msgstore.db");
                        String[] A1R = C36441kJ.A1R();
                        C36351kA.A1V(A1R, 0, A003);
                        Cursor A09 = A012.A09("SELECT jid_row_id\nFROM jid_map\nWHERE lid_row_id = ?", "JidMapStore/GET_JID_BY_LID", A1R);
                        try {
                            int columnIndex = A09.getColumnIndex("jid_row_id");
                            if (columnIndex < 0 || !A09.moveToFirst()) {
                                A09.close();
                                j = -1;
                            } else {
                                j = (long) A09.getInt(columnIndex);
                                A09.close();
                            }
                            if (openDatabase != null) {
                                openDatabase.close();
                            }
                            String absolutePath = A0T.getAbsolutePath();
                            A022 = null;
                            if (j > 0) {
                                openDatabase = SQLiteDatabase.openDatabase(absolutePath, (SQLiteDatabase.CursorFactory) null, 0);
                                C224114e A013 = C224014d.A01(openDatabase, r3, r4, "msgstore.db");
                                String[] A1R2 = C36441kJ.A1R();
                                C36401kF.A1T(A1R2, 0, j);
                                Cursor A092 = A013.A09("SELECT user, server, agent, device, type, raw_string FROM jid WHERE _id = ?", "GET_JID_BY_ROW_ID_SQL", A1R2);
                                try {
                                    if (A092.moveToLast()) {
                                        A022 = C219712j.A02(A092, A092.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_USER), A092.getColumnIndexOrThrow("server"), A092.getColumnIndexOrThrow("agent"), A092.getColumnIndexOrThrow("device"), A092.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE), A092.getColumnIndexOrThrow("raw_string"));
                                    }
                                    A092.close();
                                    if (openDatabase != null) {
                                        openDatabase.close();
                                    }
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            if (A09 != null) {
                                A09.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        if (openDatabase != null) {
                            try {
                                openDatabase.close();
                                throw th4;
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                                throw th4;
                            }
                        }
                        throw th4;
                    }
                }
                if (A022 != null) {
                    str4 = "NotificationUiBuilder/getNameForSenderJid/lid mapping found";
                } else {
                    Log.i("NotificationUiBuilder/getNameForSenderJid/lid mapping not found");
                    A022 = PhoneUserJid.Companion.A02(str3);
                    if (A022 != null) {
                        str4 = "NotificationUiBuilder/getNameForSenderJid/sender pn jid found";
                    } else {
                        Log.i("NotificationUiBuilder/getNameForSenderJid/sender pn jid null");
                        if (!(str2 == null || str2.length() == 0)) {
                            return str2;
                        }
                    }
                }
                Log.i(str4);
            }
            AnonymousClass141 A093 = this.A01.A09(r12, A022);
            if (A093 != null && (A0J2 = A093.A0J()) != null) {
                return A0J2;
            }
            AnonymousClass141 A0O = this.A03.A0O(A022);
            if (A0O == null || (A0J = A0O.A0J()) == null) {
                return this.A00.A04(A022.user);
            }
            return A0J;
        }
        Log.e("NotificationUiBuilder/getUnknownJidPlaceholder/");
        return C36371kC.A0v(this.A04, R.string.f12nameremoved);
    }

    public AnonymousClass6N4(AnonymousClass1RU r1, C133346Xy r2, C131306On r3, C229516p r4, C19630wG r5) {
        C36321k7.A1B(r5, r1, r4, r3, r2);
        this.A04 = r5;
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003c, code lost:
        if (r12.equals(r2) == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        r11 = new X.AnonymousClass6DT(r12, r7.A01(r8, r6.A08, r6.A05, r6.A09), (java.lang.String) null, r6.A01, r6.A02, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005d, code lost:
        if (r12.equals("voip_call_offer_group") == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0066, code lost:
        if (r12.equals("group_message") != false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0068, code lost:
        r4 = r6.A06;
        r9 = (X.AnonymousClass6DT) r1.get(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0070, code lost:
        if (r9 != null) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0072, code lost:
        if (r4 == null) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0074, code lost:
        r3 = com.whatsapp.jid.Jid.Companion.A02(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007a, code lost:
        if (r3 == null) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007c, code lost:
        r2 = r7.A01.A09(r8, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0082, code lost:
        if (r2 == null) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0084, code lost:
        r13 = r2.A0J();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0088, code lost:
        if (r13 == null) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008e, code lost:
        if (r13.length() == 0) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0090, code lost:
        r11 = new X.AnonymousClass6DT(r12, r13, r7.A01(r8, r6.A08, r6.A05, r6.A09), r6.A01, r6.A02, 1);
        r1.put(r4, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00aa, code lost:
        r0.add(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00af, code lost:
        r2 = "NotificationUiBuilder/addOrModifyGroupNotification/unable to resolve group name, skipping notification";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b3, code lost:
        r9.A00 += r6.A01;
        r9.A01++;
        r2 = r9.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c3, code lost:
        if (r2 == null) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c9, code lost:
        if (r2.length() != 0) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00cb, code lost:
        r9.A03 = r7.A01(r8, r6.A08, r6.A05, r6.A09);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00dd, code lost:
        throw X.C36381kD.A0l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0025, code lost:
        r2 = X.AnonymousClass000.A0p("NotificationUiBuilder/getAllNotificationUiDataForAccount/unknown notification type: ", r12, X.AnonymousClass000.A0u());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002f, code lost:
        com.whatsapp.util.Log.e(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList A00(X.AnonymousClass3KU r21, X.AnonymousClass6N4 r22, java.util.List r23) {
        /*
            java.util.LinkedHashMap r1 = X.C36431kI.A1G()
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
            java.util.Iterator r10 = r23.iterator()
        L_0x000c:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x00de
            java.lang.Object r6 = r10.next()
            X.6Ds r6 = (X.C128816Ds) r6
            java.lang.String r12 = r6.A07
            int r2 = r12.hashCode()
            r8 = r21
            r7 = r22
            switch(r2) {
                case -1127809222: goto L_0x0057;
                case 239102022: goto L_0x0036;
                case 954925063: goto L_0x0033;
                case 1006153287: goto L_0x0060;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "NotificationUiBuilder/getAllNotificationUiDataForAccount/unknown notification type: "
            java.lang.String r2 = X.AnonymousClass000.A0p(r2, r12, r3)
        L_0x002f:
            com.whatsapp.util.Log.e((java.lang.String) r2)
            goto L_0x000c
        L_0x0033:
            java.lang.String r2 = "message"
            goto L_0x0038
        L_0x0036:
            java.lang.String r2 = "voip_call_offer_1on1"
        L_0x0038:
            boolean r2 = r12.equals(r2)
            if (r2 == 0) goto L_0x0025
            java.lang.String r4 = r6.A08
            java.lang.String r3 = r6.A05
            java.lang.String r2 = r6.A09
            java.lang.String r13 = r7.A01(r8, r4, r3, r2)
            long r15 = r6.A01
            long r2 = r6.A02
            r14 = 0
            r19 = 0
            X.6DT r11 = new X.6DT
            r17 = r2
            r11.<init>(r12, r13, r14, r15, r17, r19)
            goto L_0x00aa
        L_0x0057:
            java.lang.String r2 = "voip_call_offer_group"
            boolean r2 = r12.equals(r2)
            if (r2 != 0) goto L_0x0068
            goto L_0x0025
        L_0x0060:
            java.lang.String r2 = "group_message"
            boolean r2 = r12.equals(r2)
            if (r2 == 0) goto L_0x0025
        L_0x0068:
            java.lang.String r4 = r6.A06
            java.lang.Object r9 = r1.get(r4)
            X.6DT r9 = (X.AnonymousClass6DT) r9
            if (r9 != 0) goto L_0x00b3
            if (r4 == 0) goto L_0x00d9
            X.13o r2 = com.whatsapp.jid.Jid.Companion
            com.whatsapp.jid.Jid r3 = r2.A02(r4)
            if (r3 == 0) goto L_0x00af
            X.6Xy r2 = r7.A01
            X.141 r2 = r2.A09(r8, r3)
            if (r2 == 0) goto L_0x00af
            java.lang.String r13 = r2.A0J()
            if (r13 == 0) goto L_0x00af
            int r2 = r13.length()
            if (r2 == 0) goto L_0x00af
            long r15 = r6.A01
            long r2 = r6.A02
            r19 = 1
            java.lang.String r9 = r6.A08
            java.lang.String r5 = r6.A05
            java.lang.String r6 = r6.A09
            java.lang.String r14 = r7.A01(r8, r9, r5, r6)
            X.6DT r11 = new X.6DT
            r17 = r2
            r11.<init>(r12, r13, r14, r15, r17, r19)
            r1.put(r4, r11)
        L_0x00aa:
            r0.add(r11)
            goto L_0x000c
        L_0x00af:
            java.lang.String r2 = "NotificationUiBuilder/addOrModifyGroupNotification/unable to resolve group name, skipping notification"
            goto L_0x002f
        L_0x00b3:
            long r4 = r9.A00
            long r2 = r6.A01
            long r4 = r4 + r2
            r9.A00 = r4
            long r2 = r9.A01
            r4 = 1
            long r2 = r2 + r4
            r9.A01 = r2
            java.lang.String r2 = r9.A03
            if (r2 == 0) goto L_0x00cb
            int r2 = r2.length()
            if (r2 != 0) goto L_0x000c
        L_0x00cb:
            java.lang.String r4 = r6.A08
            java.lang.String r3 = r6.A05
            java.lang.String r2 = r6.A09
            java.lang.String r2 = r7.A01(r8, r4, r3, r2)
            r9.A03 = r2
            goto L_0x000c
        L_0x00d9:
            java.lang.IllegalStateException r0 = X.C36381kD.A0l()
            throw r0
        L_0x00de:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6N4.A00(X.3KU, X.6N4, java.util.List):java.util.ArrayList");
    }
}
