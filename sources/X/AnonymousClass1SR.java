package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.1SR  reason: invalid class name */
public class AnonymousClass1SR {
    public final C19460v5 A00;
    public final C19730wQ A01;
    public final C19970wo A02;
    public final AnonymousClass1C7 A03;
    public final C220712t A04;
    public final C220412q A05;
    public final C20310xM A06;
    public final AnonymousClass17S A07;
    public final AnonymousClass1TW A08;
    public final AnonymousClass1TT A09;
    public final AnonymousClass1F8 A0A;
    public final AnonymousClass1F3 A0B;
    public final C219712j A0C;
    public final AnonymousClass178 A0D;
    public final AnonymousClass1DG A0E;
    public final AnonymousClass176 A0F;
    public final C24561Cx A0G;
    public final C25151Fe A0H;
    public final AnonymousClass16J A0I;
    public final AnonymousClass12P A0J;
    public final C25061Ev A0K;
    public final AnonymousClass1TV A0L;
    public final AnonymousClass1QO A0M;
    public final AnonymousClass16E A0N;
    public final AnonymousClass1F1 A0O;
    public final AnonymousClass1EH A0P;
    public final C25071Ew A0Q;
    public final C20170x8 A0R;
    public final C20810yC A0S;
    public final AnonymousClass1ST A0T;
    public final AnonymousClass1DL A0U;
    public final AnonymousClass1TX A0V;
    public final C25291Fs A0W;
    public final AnonymousClass1SS A0X;
    public final AnonymousClass1A1 A0Y;
    public final AnonymousClass005 A0Z;
    public final AnonymousClass005 A0a;
    public final Object A0b = new Object();
    public final AnonymousClass163 A0c;
    public final AnonymousClass1DQ A0d;
    public final AnonymousClass1FZ A0e;
    public final C26201Jg A0f;
    public final AnonymousClass12O A0g;
    public final AnonymousClass1TU A0h;

    public AnonymousClass3AW A01(Cursor cursor) {
        Jid A0C2;
        Jid A0C3;
        String string = cursor.getString(cursor.getColumnIndexOrThrow("key_id"));
        boolean z = false;
        if (cursor.getLong(cursor.getColumnIndexOrThrow("from_me")) > 0) {
            z = true;
        }
        AnonymousClass11F A0A2 = this.A0c.A0A(cursor.getLong(cursor.getColumnIndexOrThrow("chat_row_id")));
        if (A0A2 == null) {
            return null;
        }
        cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
        C64933Qa r6 = new C64933Qa(A0A2, string, z);
        Class<AnonymousClass11F> cls = AnonymousClass11F.class;
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("sender_jid_row_id");
        if (cursor.isNull(columnIndexOrThrow)) {
            A0C2 = null;
        } else {
            A0C2 = this.A0C.A0C(cls, cursor.getLong(columnIndexOrThrow));
        }
        AnonymousClass11F r4 = (AnonymousClass11F) A0C2;
        long j = cursor.getLong(cursor.getColumnIndexOrThrow("timestamp"));
        int i = cursor.getInt(cursor.getColumnIndexOrThrow("message_type"));
        String string2 = cursor.getString(cursor.getColumnIndexOrThrow("revoked_key_id"));
        Class<UserJid> cls2 = UserJid.class;
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("admin_jid_row_id");
        if (cursor.isNull(columnIndexOrThrow2)) {
            A0C3 = null;
        } else {
            A0C3 = this.A0C.A0C(cls2, cursor.getLong(columnIndexOrThrow2));
        }
        return new AnonymousClass3AW(r4, (UserJid) A0C3, r6, string2, cursor.getBlob(cursor.getColumnIndexOrThrow("orphan_message_data")), i, cursor.getInt(cursor.getColumnIndexOrThrow("retry_count")), j);
    }

    public void A02(AnonymousClass3AW r19) {
        String l;
        Cursor A092;
        long j;
        AnonymousClass3AW A012;
        AnonymousClass3AW r7 = r19;
        C64933Qa r5 = r7.A05;
        AnonymousClass163 r11 = this.A0c;
        AnonymousClass11F r10 = r5.A00;
        C18740tg.A06(r10);
        String l2 = Long.toString(r11.A08(r10));
        AnonymousClass11F r12 = r7.A03;
        if (r12 == null) {
            l = "";
        } else {
            l = Long.toString(this.A0C.A07(r12));
        }
        AnonymousClass1M0 A052 = this.A0J.A05();
        try {
            C1495671s B1k = A052.B1k();
            try {
                C224114e r6 = A052.A02;
                String[] strArr = new String[4];
                String str = r5.A01;
                int i = 0;
                strArr[0] = str;
                boolean z = r5.A02;
                int i2 = 0;
                if (z) {
                    i2 = 1;
                }
                strArr[1] = String.valueOf(i2);
                strArr[2] = l2;
                strArr[3] = l;
                A092 = r6.A09("SELECT _id, key_id, from_me, chat_row_id, sender_jid_row_id, timestamp, message_type, revoked_key_id, retry_count, admin_jid_row_id, orphan_message_data  FROM message_orphaned_edit WHERE key_id = ? AND from_me = ? AND chat_row_id = ? AND sender_jid_row_id = ?", "GET_ORPHANED_MESSAGE_BY_KEY_SQL", strArr);
                Long l3 = null;
                if (!A092.moveToLast() || (A012 = A01(A092)) == null || (A012.A01 == 1 && r7.A01 == 0)) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("key_id", str);
                    if (z) {
                        i = 1;
                    }
                    contentValues.put("from_me", Integer.valueOf(i));
                    C18740tg.A06(r10);
                    contentValues.put("chat_row_id", Long.valueOf(r11.A08(r10)));
                    if (r12 == null) {
                        j = 0;
                    } else {
                        j = this.A0C.A07(r12);
                    }
                    contentValues.put("sender_jid_row_id", Long.valueOf(j));
                    contentValues.put("timestamp", Long.valueOf(r7.A02));
                    contentValues.put("message_type", Integer.valueOf(r7.A01));
                    contentValues.put("revoked_key_id", r7.A06);
                    contentValues.put("retry_count", Integer.valueOf(r7.A00));
                    UserJid userJid = r7.A04;
                    if (userJid != null) {
                        l3 = Long.valueOf(this.A0C.A07(userJid));
                    }
                    contentValues.put("admin_jid_row_id", l3);
                    contentValues.put("orphan_message_data", r7.A07);
                    r6.A06("message_orphaned_edit", "INSERT_MESSAGE_ORPHANED_EDIT_SQL", contentValues);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("EditMessageStore/storeOrphanedEditMessage/skipping-edit-store old message exists; msg.key=");
                    sb.append(r5);
                    Log.i(sb.toString());
                }
                B1k.A00();
                A092.close();
                B1k.close();
                A052.close();
                return;
            } catch (Throwable th) {
                B1k.close();
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

    public void A03(AnonymousClass3T1 r4, boolean z) {
        this.A03.A01(new C35291iS(this, r4, 8, z), 31);
    }

    public boolean A04(AnonymousClass3T1 r5, boolean z) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("msgstore/edit/revoke ");
        C64933Qa r2 = r5.A1J;
        if (r2.A02) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("send deleteMedia=");
            sb2.append(z);
            str = sb2.toString();
        } else {
            str = "recv";
        }
        sb.append(str);
        sb.append(" key=");
        sb.append(r2);
        Log.i(sb.toString());
        return A00(this, r5, -1, true, z);
    }

    public AnonymousClass1SR(C19460v5 r2, C19730wQ r3, C19970wo r4, AnonymousClass1C7 r5, C220712t r6, AnonymousClass163 r7, C220412q r8, C20310xM r9, AnonymousClass17S r10, AnonymousClass1TW r11, AnonymousClass1TT r12, AnonymousClass1F8 r13, AnonymousClass1DQ r14, AnonymousClass1F3 r15, C219712j r16, AnonymousClass178 r17, AnonymousClass1DG r18, AnonymousClass176 r19, AnonymousClass1FZ r20, C24561Cx r21, C25151Fe r22, C26201Jg r23, AnonymousClass16J r24, AnonymousClass12P r25, C25061Ev r26, AnonymousClass1TV r27, AnonymousClass1QO r28, AnonymousClass16E r29, AnonymousClass1F1 r30, AnonymousClass1EH r31, C25071Ew r32, AnonymousClass12O r33, C20170x8 r34, C20810yC r35, AnonymousClass1ST r36, AnonymousClass1DL r37, AnonymousClass1TX r38, C25291Fs r39, AnonymousClass1TU r40, AnonymousClass1SS r41, AnonymousClass1A1 r42, AnonymousClass005 r43, AnonymousClass005 r44) {
        this.A02 = r4;
        this.A0S = r35;
        this.A0C = r16;
        this.A0c = r7;
        this.A01 = r3;
        this.A05 = r8;
        this.A04 = r6;
        this.A0N = r29;
        this.A0U = r37;
        this.A0a = r43;
        this.A0d = r14;
        this.A0M = r28;
        this.A0g = r33;
        this.A06 = r9;
        this.A0Y = r42;
        this.A0D = r17;
        this.A0I = r24;
        this.A0R = r34;
        this.A0K = r26;
        this.A0Q = r32;
        this.A03 = r5;
        this.A0F = r19;
        this.A0G = r21;
        this.A0J = r25;
        this.A0X = r41;
        this.A0T = r36;
        this.A0f = r23;
        this.A0O = r30;
        this.A09 = r12;
        this.A0P = r31;
        this.A07 = r10;
        this.A0E = r18;
        this.A0h = r40;
        this.A0B = r15;
        this.A0A = r13;
        this.A0Z = r44;
        this.A0e = r20;
        this.A0L = r27;
        this.A08 = r11;
        this.A0H = r22;
        this.A0W = r39;
        this.A00 = r2;
        this.A0V = r38;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0043, code lost:
        if (r8.A02 == false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0267, code lost:
        if (r5.A0H() != 1) goto L_0x0269;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0060, code lost:
        if (r7 == 83) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x038c, code lost:
        if (X.C197029b1.A00(r7.A0J()) != false) goto L_0x038e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0682, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:?, code lost:
        X.C05600Qi.A00(r10, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ef, code lost:
        if (r5 != null) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01a0, code lost:
        if (r1.A1Y == false) goto L_0x01c4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x02b8 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02de A[SYNTHETIC, Splitter:B:163:0x02de] */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x09ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(X.AnonymousClass1SR r30, X.AnonymousClass3T1 r31, int r32, boolean r33, boolean r34) {
        /*
            r1 = r31
            boolean r9 = r1 instanceof X.AnonymousClass2bO
            if (r9 == 0) goto L_0x00bf
            r0 = r1
            X.2bO r0 = (X.AnonymousClass2bO) r0
            java.lang.String r7 = r0.A01
        L_0x000b:
            r6 = 0
            if (r7 != 0) goto L_0x0031
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "msgstore/revoke/missing-old-id "
            r2.append(r0)
            X.3Qa r0 = r1.A1J
            r2.append(r0)
            java.lang.String r0 = " from="
            r2.append(r0)
            X.11F r0 = r1.A0J()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
        L_0x002d:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0030:
            return r6
        L_0x0031:
            X.3Qa r8 = r1.A1J
            X.11F r5 = r8.A00
            X.11F r0 = r1.A0J()
            boolean r2 = X.C197029b1.A00(r0)
            r0 = 1
            if (r2 != 0) goto L_0x0045
            boolean r3 = r8.A02
            r2 = 1
            if (r3 != 0) goto L_0x0046
        L_0x0045:
            r2 = 0
        L_0x0046:
            X.3Qa r4 = new X.3Qa
            r4.<init>(r5, r7, r2)
            boolean r10 = r5 instanceof X.C28981Uw
            r2 = r30
            X.0wQ r3 = r2.A01
            r31 = r3
            boolean r16 = X.C66013Ui.A0P(r3, r1)
            int r7 = r1.A1I
            r3 = 64
            if (r7 == r3) goto L_0x0062
            r3 = 83
            r12 = 0
            if (r7 != r3) goto L_0x0063
        L_0x0062:
            r12 = 1
        L_0x0063:
            X.1A1 r13 = r2.A0Y
            X.3T1 r5 = r13.A03(r8)
            if (r5 == 0) goto L_0x0098
            if (r10 != 0) goto L_0x0098
            X.11F r3 = r5.A0J()
            boolean r3 = X.C197029b1.A00(r3)
            if (r3 != 0) goto L_0x0098
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r3 = "msgstore/revoking/has-placeholder "
            r11.append(r3)
            X.3Qa r3 = r5.A1J
            r11.append(r3)
            java.lang.String r3 = r11.toString()
            com.whatsapp.util.Log.w((java.lang.String) r3)
            boolean r3 = X.C203359nq.A0C(r5)
            if (r3 == 0) goto L_0x00b7
            X.0xM r3 = r2.A06
            r3.A0o(r5, r0, r6)
        L_0x0098:
            X.3T1 r5 = r13.A03(r4)
            if (r10 == 0) goto L_0x00cd
            if (r5 != 0) goto L_0x00f1
            X.11F r11 = r4.A00
            boolean r3 = r4.A02
            r5 = r3 ^ 1
            java.lang.String r4 = r4.A01
            X.3Qa r3 = new X.3Qa
            r3.<init>(r11, r4, r5)
            X.3T1 r5 = r13.A03(r3)
            if (r5 != 0) goto L_0x00f1
            java.lang.String r0 = "editmessagestore/newsletter/original message not found"
            goto L_0x002d
        L_0x00b7:
            if (r16 == 0) goto L_0x0030
            X.1DL r0 = r2.A0U
            r0.A08(r1)
            return r6
        L_0x00bf:
            boolean r0 = r1 instanceof X.AnonymousClass5JA
            if (r0 == 0) goto L_0x00ca
            r0 = r1
            X.5JA r0 = (X.AnonymousClass5JA) r0
            java.lang.String r7 = r0.A02
            goto L_0x000b
        L_0x00ca:
            r7 = 0
            goto L_0x000b
        L_0x00cd:
            if (r5 != 0) goto L_0x00f1
            X.1Jg r3 = r2.A0f
            android.database.Cursor r4 = r3.A00(r4)
            if (r4 == 0) goto L_0x09e0
            boolean r3 = r4.moveToNext()     // Catch:{ all -> 0x00e2 }
            if (r3 == 0) goto L_0x00ec
            X.3T1 r5 = r13.A00(r4)     // Catch:{ all -> 0x00e2 }
            goto L_0x00ec
        L_0x00e2:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x00e7 }
            throw r1
        L_0x00e7:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x00ec:
            r4.close()
            if (r5 == 0) goto L_0x09e0
        L_0x00f1:
            X.37F r3 = r5.A0X()
            if (r3 == 0) goto L_0x0106
            X.37F r3 = r5.A0X()
            X.3Qa r3 = r3.A02
            java.lang.String r4 = r3.A01
            if (r9 == 0) goto L_0x09d5
            r3 = r1
            X.2bO r3 = (X.AnonymousClass2bO) r3
            r3.A01 = r4
        L_0x0106:
            X.12O r11 = r2.A0g
            com.whatsapp.jid.UserJid r4 = r5.A0L()
            com.whatsapp.jid.UserJid r3 = r1.A0L()
            boolean r3 = r11.A0I(r4, r3)
            if (r3 != 0) goto L_0x0122
            if (r12 != 0) goto L_0x0122
            X.11F r3 = r5.A0J()
            boolean r3 = X.C197029b1.A00(r3)
            if (r3 == 0) goto L_0x09e0
        L_0x0122:
            X.3Qa r3 = r5.A1J
            r30 = r3
            X.11F r15 = r3.A00
            boolean r3 = r15 instanceof X.C177528dw
            r18 = r3
            if (r3 == 0) goto L_0x0161
            r3 = r30
            boolean r3 = r3.A02
            if (r3 != 0) goto L_0x0161
            boolean r3 = r5 instanceof X.AnonymousClass2bU
            if (r3 == 0) goto L_0x0140
            X.1ST r4 = r2.A0T
            r3 = r5
            X.2bU r3 = (X.AnonymousClass2bU) r3
            r4.A0E(r3)
        L_0x0140:
            X.0xM r3 = r2.A06
            r3.A0o(r5, r0, r0)
            if (r16 == 0) goto L_0x014c
            X.1DL r3 = r2.A0U
            r3.A08(r1)
        L_0x014c:
            X.1DQ r1 = r2.A0d
            android.os.Handler r4 = r1.A01
            r1 = 4
            X.1j7 r3 = new X.1j7
            r3.<init>(r2, r5, r1)
        L_0x0156:
            r4.post(r3)
        L_0x0159:
            X.176 r2 = r2.A0F
            r1 = r30
            r2.A0C(r1)
        L_0x0160:
            return r0
        L_0x0161:
            boolean r3 = X.C66013Ui.A0n(r1)
            if (r3 == 0) goto L_0x0159
            long r3 = r1.A0I
            long r11 = r5.A0I
            long r3 = r3 - r11
            boolean r11 = r5 instanceof X.AnonymousClass2bO
            r19 = 259200000(0xf731400, double:1.280618154E-315)
            int r12 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            r19 = 0
            if (r12 <= 0) goto L_0x0179
            r19 = 1
        L_0x0179:
            java.lang.String r3 = r5.A0t
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            r17 = r3 ^ 1
            r3 = 83
            r14 = 0
            if (r7 != r3) goto L_0x0187
            r14 = 1
        L_0x0187:
            r3 = r30
            boolean r12 = r3.A02
            if (r12 == 0) goto L_0x01a2
            r3 = 64
            if (r7 != r3) goto L_0x01c4
            r3 = r1
            X.2c8 r3 = (X.AnonymousClass2c8) r3
            com.whatsapp.jid.UserJid r4 = r3.A00
            r3 = r31
            boolean r3 = r3.A0M(r4)
            if (r3 == 0) goto L_0x01a2
            boolean r3 = r1.A1Y
            if (r3 == 0) goto L_0x01c4
        L_0x01a2:
            if (r17 != 0) goto L_0x01a8
            if (r19 != 0) goto L_0x01a8
            if (r11 == 0) goto L_0x01c4
        L_0x01a8:
            if (r14 != 0) goto L_0x01c4
            if (r10 != 0) goto L_0x01c4
            if (r17 == 0) goto L_0x01b6
            X.1DL r4 = r2.A0U
            java.lang.String r3 = "revoke-drop-payment"
        L_0x01b2:
            r4.A0B(r1, r3)
            goto L_0x0159
        L_0x01b6:
            if (r19 == 0) goto L_0x01bd
            X.1DL r4 = r2.A0U
            java.lang.String r3 = "revoke-drop-old"
            goto L_0x01b2
        L_0x01bd:
            if (r11 == 0) goto L_0x0159
            X.1DL r4 = r2.A0U
            java.lang.String r3 = "revoke-drop-terminal"
            goto L_0x01b2
        L_0x01c4:
            r3 = 16777216(0x1000000, float:2.3509887E-38)
            boolean r3 = r5.A1T(r3)
            if (r3 == 0) goto L_0x01e0
            X.3Kx r3 = r5.A0P()
            if (r3 != 0) goto L_0x01e0
            X.1FZ r3 = r2.A0e
            X.1Fb r7 = r3.A06
            java.util.Set r4 = X.AnonymousClass1FZ.A08
            X.3IP r3 = new X.3IP
            r3.<init>(r4, r6)
            r7.A00(r3, r5)
        L_0x01e0:
            if (r9 == 0) goto L_0x02d0
            r3 = r1
            X.2bO r3 = (X.AnonymousClass2bO) r3
            X.2bO r7 = r3.A1X(r8)
        L_0x01e9:
            long r3 = r5.A0I
            r7.A0I = r3
            long r3 = r5.A0G
            r7.A0G = r3
            long r3 = r1.A1Q
            r7.A1Q = r3
            long r3 = r5.A1N
            r7.A1N = r3
            if (r10 == 0) goto L_0x02cc
            long r3 = r5.A1O
            r10 = -1
            int r8 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r8 != 0) goto L_0x02cc
            long r3 = r1.A1O
        L_0x0205:
            r7.A1O = r3
            java.lang.String r3 = r5.A0s
            r7.A0s = r3
            r7.A0o(r0)
            int r3 = r5.A05
            r7.A0m(r3)
            java.lang.Long r3 = r5.A0g
            r7.A0g = r3
            r7.A07 = r6
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            boolean r3 = r5.A1T(r4)
            if (r3 == 0) goto L_0x02b8
            r7.A0j(r4)
            X.3Kx r3 = r5.A0P()
            r7.A0u(r3)
        L_0x022b:
            boolean r3 = r1.A1Y
            if (r3 == 0) goto L_0x0231
            r7.A1Y = r0
        L_0x0231:
            if (r9 == 0) goto L_0x029d
            r8 = r7
            X.2bO r8 = (X.AnonymousClass2bO) r8
            r3 = r1
            X.2bO r3 = (X.AnonymousClass2bO) r3
            long r3 = r3.A00
            r8.A00 = r3
            X.11F r3 = r5.A0J()
            r7.A0q(r3)
        L_0x0244:
            X.3Qa r3 = r7.A1J
            r29 = r3
            X.11F r11 = r3.A00
            r3 = r31
            boolean r3 = r3.A0M(r11)
            if (r3 == 0) goto L_0x0293
            r3 = 13
        L_0x0254:
            r7.A0n(r3)
        L_0x0257:
            java.lang.String r9 = "message_row_id=?"
            java.lang.String r8 = "message_row_id = ?"
            int r3 = r7.A0H()
            r12 = 0
            if (r3 != r0) goto L_0x0269
            int r3 = r5.A0H()
            r4 = 1
            if (r3 == r0) goto L_0x026a
        L_0x0269:
            r4 = 0
        L_0x026a:
            X.C18740tg.A0B(r4)
            int r3 = r5.A0E()
            if (r3 != r0) goto L_0x0280
            boolean r3 = r5.A1G()
            if (r3 == 0) goto L_0x0280
            r5.A07 = r6
            X.17S r3 = r2.A07
            r3.A08(r5)
        L_0x0280:
            X.0v5 r3 = r2.A00
            boolean r4 = r3.A05()
            if (r4 == 0) goto L_0x02de
            r3.A02()
            java.lang.String r0 = "beforeRemoveAllLabelsFromMessage"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r0)
            throw r1
        L_0x0293:
            boolean r3 = r7.A1Y
            if (r3 != 0) goto L_0x029b
            if (r12 == 0) goto L_0x0257
            if (r16 == 0) goto L_0x0257
        L_0x029b:
            r3 = 4
            goto L_0x0254
        L_0x029d:
            boolean r3 = r7 instanceof X.AnonymousClass5JA
            if (r3 == 0) goto L_0x0244
            r8 = r7
            X.2bJ r8 = (X.AnonymousClass2bJ) r8
            boolean r3 = r5 instanceof X.AnonymousClass2c9
            if (r3 == 0) goto L_0x0244
            r4 = r5
            X.2bJ r4 = (X.AnonymousClass2bJ) r4
            java.lang.String r3 = r4.A02
            r8.A02 = r3
            int r3 = r4.A00
            r8.A00 = r3
            long r3 = r4.A01
            r8.A01 = r3
            goto L_0x0244
        L_0x02b8:
            if (r9 == 0) goto L_0x022b
            boolean r3 = r1.A1T(r4)
            if (r3 == 0) goto L_0x022b
            r7.A0j(r4)
            X.3Kx r3 = r1.A0P()
            r7.A0u(r3)
            goto L_0x022b
        L_0x02cc:
            long r3 = r5.A1O
            goto L_0x0205
        L_0x02d0:
            boolean r3 = r1 instanceof X.AnonymousClass5JA
            if (r3 == 0) goto L_0x0a2a
            r3 = r1
            X.5JA r3 = (X.AnonymousClass5JA) r3
            X.5JA r7 = new X.5JA
            r7.<init>((X.C64933Qa) r8, (X.AnonymousClass5JA) r3)
            goto L_0x01e9
        L_0x02de:
            X.12P r3 = r2.A0J     // Catch:{ IOException -> 0x0992 }
            X.1M0 r20 = r3.A05()     // Catch:{ IOException -> 0x0992 }
            X.71s r21 = r20.B1k()     // Catch:{ all -> 0x0988 }
            X.0yC r3 = r2.A0S     // Catch:{ all -> 0x097e }
            r28 = r3
            X.0yV r19 = X.C21000yV.A02     // Catch:{ all -> 0x097e }
            r10 = 6440(0x1928, float:9.024E-42)
            r4 = r19
            r3 = r28
            boolean r3 = X.C20800yB.A01(r4, r3, r10)     // Catch:{ all -> 0x097e }
            r17 = 0
            if (r3 == 0) goto L_0x0317
            if (r16 != 0) goto L_0x02ff
            goto L_0x0302
        L_0x02ff:
            r10 = r17
            goto L_0x0308
        L_0x0302:
            X.1Fe r3 = r2.A0H     // Catch:{ all -> 0x097e }
            java.util.HashSet r10 = r3.A06(r7)     // Catch:{ all -> 0x097e }
        L_0x0308:
            boolean r3 = r5 instanceof X.AnonymousClass2bU     // Catch:{ all -> 0x097e }
            if (r3 == 0) goto L_0x0791
            X.1ST r4 = r2.A0T     // Catch:{ all -> 0x097e }
            r3 = r5
            X.2bU r3 = (X.AnonymousClass2bU) r3     // Catch:{ all -> 0x097e }
            X.AnonymousClass1ST.A06(r4, r3, r0, r6)     // Catch:{ all -> 0x097e }
            r12 = 1
            goto L_0x0791
        L_0x0317:
            boolean r3 = r5 instanceof X.AnonymousClass2bU     // Catch:{ all -> 0x097e }
            if (r3 == 0) goto L_0x032a
            r4 = r5
            X.2bU r4 = (X.AnonymousClass2bU) r4     // Catch:{ all -> 0x097e }
            X.1ST r3 = r2.A0T     // Catch:{ all -> 0x097e }
            X.AnonymousClass1ST.A06(r3, r4, r0, r6)     // Catch:{ all -> 0x097e }
            X.1DG r3 = r2.A0E     // Catch:{ all -> 0x097e }
            r10 = r34
            r3.A03(r4, r10, r6)     // Catch:{ all -> 0x097e }
        L_0x032a:
            X.3Kz r3 = r5.A0V()     // Catch:{ all -> 0x097e }
            if (r3 == 0) goto L_0x0335
            X.1EH r3 = r2.A0P     // Catch:{ all -> 0x097e }
            r3.A02(r5)     // Catch:{ all -> 0x097e }
        L_0x0335:
            r3 = 4096(0x1000, float:5.74E-42)
            boolean r3 = r5.A1T(r3)     // Catch:{ all -> 0x097e }
            if (r3 == 0) goto L_0x0344
            X.1TV r10 = r2.A0L     // Catch:{ all -> 0x097e }
            long r3 = r5.A1N     // Catch:{ all -> 0x097e }
            r10.A01(r3)     // Catch:{ all -> 0x097e }
        L_0x0344:
            X.0x8 r10 = r2.A0R     // Catch:{ all -> 0x097e }
            long r3 = r5.A1N     // Catch:{ all -> 0x097e }
            X.12P r10 = r10.A03     // Catch:{ all -> 0x097e }
            X.1M0 r10 = r10.A05()     // Catch:{ all -> 0x097e }
            java.lang.String[] r12 = new java.lang.String[r0]     // Catch:{ all -> 0x0974 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0974 }
            r12[r6] = r3     // Catch:{ all -> 0x0974 }
            java.lang.String r14 = "message_add_on.parent_message_row_id = ?"
            X.14e r13 = r10.A02     // Catch:{ all -> 0x0974 }
            java.lang.String r4 = "message_add_on"
            java.lang.String r3 = "MessageAddOnStore/deleteMessageAddOnsForParentMessage"
            r13.A03(r4, r14, r3, r12)     // Catch:{ all -> 0x0974 }
            r10.close()     // Catch:{ all -> 0x097e }
            X.1Cx r4 = r2.A0G     // Catch:{ all -> 0x097e }
            r3 = r20
            r4.A02(r3, r5, r0, r0)     // Catch:{ all -> 0x097e }
            X.1Fs r10 = r2.A0W     // Catch:{ all -> 0x097e }
            long r3 = r5.A1N     // Catch:{ all -> 0x097e }
            r24 = 1
            r27 = 1
            r22 = r10
            r23 = r20
            r25 = r3
            r22.A00(r23, r24, r25, r27)     // Catch:{ all -> 0x097e }
            r3 = r29
            boolean r3 = r3.A02     // Catch:{ all -> 0x097e }
            if (r3 == 0) goto L_0x038e
            X.11F r3 = r7.A0J()     // Catch:{ all -> 0x097e }
            boolean r3 = X.C197029b1.A00(r3)     // Catch:{ all -> 0x097e }
            r22 = 1
            if (r3 == 0) goto L_0x0390
        L_0x038e:
            r22 = 0
        L_0x0390:
            X.178 r14 = r2.A0D     // Catch:{ all -> 0x097e }
            X.12P r3 = r14.A03     // Catch:{ all -> 0x097e }
            X.1M0 r10 = r3.A05()     // Catch:{ all -> 0x097e }
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x0974 }
            r3.<init>()     // Catch:{ all -> 0x0974 }
            r4 = r29
            java.lang.String r12 = r4.A01     // Catch:{ all -> 0x0974 }
            java.lang.String r4 = "key_id"
            r3.put(r4, r12)     // Catch:{ all -> 0x0974 }
            r12 = 0
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0974 }
            java.lang.String r4 = "starred"
            r3.put(r4, r12)     // Catch:{ all -> 0x0974 }
            int r4 = r7.A0D     // Catch:{ all -> 0x0974 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0974 }
            java.lang.String r4 = "status"
            r3.put(r4, r12)     // Catch:{ all -> 0x0974 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0974 }
            java.lang.String r4 = "broadcast"
            r3.put(r4, r12)     // Catch:{ all -> 0x0974 }
            java.lang.String r12 = r7.A0s     // Catch:{ all -> 0x0974 }
            java.lang.String r4 = "participant_hash"
            X.AnonymousClass3SW.A01(r3, r4, r12)     // Catch:{ all -> 0x0974 }
            int r4 = r7.A0F()     // Catch:{ all -> 0x0974 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0974 }
            java.lang.String r4 = "origination_flags"
            r3.put(r4, r12)     // Catch:{ all -> 0x0974 }
            int r4 = r7.A09     // Catch:{ all -> 0x0974 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0974 }
            java.lang.String r4 = "origin"
            r3.put(r4, r12)     // Catch:{ all -> 0x0974 }
            long r12 = r7.A0I     // Catch:{ all -> 0x0974 }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0974 }
            java.lang.String r4 = "timestamp"
            r3.put(r4, r12)     // Catch:{ all -> 0x0974 }
            long r12 = r7.A0G     // Catch:{ all -> 0x0974 }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0974 }
            java.lang.String r4 = "received_timestamp"
            r3.put(r4, r12)     // Catch:{ all -> 0x0974 }
            long r12 = r7.A0H     // Catch:{ all -> 0x0974 }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0974 }
            java.lang.String r4 = "receipt_server_timestamp"
            r3.put(r4, r12)     // Catch:{ all -> 0x0974 }
            int r4 = r7.A1I     // Catch:{ all -> 0x0974 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0974 }
            java.lang.String r4 = "message_type"
            r3.put(r4, r12)     // Catch:{ all -> 0x0974 }
            java.lang.String r12 = r7.A0d()     // Catch:{ all -> 0x0974 }
            java.lang.String r4 = "text_data"
            X.AnonymousClass3SW.A01(r3, r4, r12)     // Catch:{ all -> 0x0974 }
            long r12 = r7.A0I()     // Catch:{ all -> 0x0974 }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0974 }
            java.lang.String r4 = "lookup_tables"
            r3.put(r4, r12)     // Catch:{ all -> 0x0974 }
            int r4 = r7.A08     // Catch:{ all -> 0x0974 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0974 }
            java.lang.String r4 = "message_add_on_flags"
            r3.put(r4, r12)     // Catch:{ all -> 0x0974 }
            long r12 = r7.A1O     // Catch:{ all -> 0x0974 }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0974 }
            java.lang.String r4 = "sort_id"
            r3.put(r4, r12)     // Catch:{ all -> 0x0974 }
            X.AnonymousClass178.A03(r3, r7)     // Catch:{ all -> 0x0974 }
            r4 = 3
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ all -> 0x0974 }
            X.163 r12 = r14.A01     // Catch:{ all -> 0x0974 }
            X.C18740tg.A06(r11)     // Catch:{ all -> 0x0974 }
            long r11 = r12.A08(r11)     // Catch:{ all -> 0x0974 }
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0974 }
            r4[r6] = r11     // Catch:{ all -> 0x0974 }
            if (r22 == 0) goto L_0x0454
            goto L_0x0457
        L_0x0454:
            java.lang.String r11 = "0"
            goto L_0x0459
        L_0x0457:
            java.lang.String r11 = "1"
        L_0x0459:
            r4[r0] = r11     // Catch:{ all -> 0x0974 }
            r12 = 2
            r11 = r30
            java.lang.String r11 = r11.A01     // Catch:{ all -> 0x0974 }
            r4[r12] = r11     // Catch:{ all -> 0x0974 }
            X.14e r11 = r10.A02     // Catch:{ all -> 0x0974 }
            java.lang.String r24 = "message"
            java.lang.String r25 = "chat_row_id = ? AND from_me = ? AND key_id = ?"
            java.lang.String r26 = "REVOKE_MAIN_MESSAGE_SQL"
            r22 = r11
            r23 = r3
            r27 = r4
            r22.A01(r23, r24, r25, r26, r27)     // Catch:{ all -> 0x0974 }
            r10.close()     // Catch:{ all -> 0x097e }
            boolean r3 = r7 instanceof X.AnonymousClass2bO     // Catch:{ all -> 0x097e }
            if (r3 == 0) goto L_0x0482
            X.1SS r4 = r2.A0X     // Catch:{ all -> 0x097e }
            r3 = r7
            X.2bO r3 = (X.AnonymousClass2bO) r3     // Catch:{ all -> 0x097e }
            r4.A00(r3)     // Catch:{ all -> 0x097e }
        L_0x0482:
            boolean r3 = r5 instanceof X.C88854Uh     // Catch:{ all -> 0x097e }
            if (r3 == 0) goto L_0x04ab
            X.1F1 r10 = r2.A0O     // Catch:{ all -> 0x097e }
            long r3 = r5.A1N     // Catch:{ all -> 0x097e }
            X.12P r10 = r10.A00     // Catch:{ all -> 0x097e }
            X.1M0 r13 = r10.A05()     // Catch:{ all -> 0x097e }
            X.14e r12 = r13.A02     // Catch:{ all -> 0x04a2 }
            java.lang.String r11 = "message_template"
            java.lang.String[] r10 = new java.lang.String[r0]     // Catch:{ all -> 0x04a2 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x04a2 }
            r10[r6] = r3     // Catch:{ all -> 0x04a2 }
            java.lang.String r3 = "DELETE_MESSAGE_TEMPLATE_BY_MESSAGE_ID"
            r12.A03(r11, r8, r3, r10)     // Catch:{ all -> 0x04a2 }
            goto L_0x04a8
        L_0x04a2:
            r3 = move-exception
            r13.close()     // Catch:{ all -> 0x0979 }
            goto L_0x097d
        L_0x04a8:
            r13.close()     // Catch:{ all -> 0x097e }
        L_0x04ab:
            r3 = r20
            X.14e r10 = r3.A02     // Catch:{ all -> 0x097e }
            java.lang.String r12 = "message_media"
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ all -> 0x097e }
            long r3 = r5.A1N     // Catch:{ all -> 0x097e }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x097e }
            r11[r6] = r3     // Catch:{ all -> 0x097e }
            java.lang.String r3 = "revokeMessageOnCurrentThread/DELETE_MESSAGE_MEDIA"
            r10.A03(r12, r8, r3, r11)     // Catch:{ all -> 0x097e }
            java.lang.String r12 = "message_streaming_sidecar"
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ all -> 0x097e }
            long r3 = r5.A1N     // Catch:{ all -> 0x097e }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x097e }
            r11[r6] = r3     // Catch:{ all -> 0x097e }
            java.lang.String r3 = "revokeMessageOnCurrentThread/DELETE_MESSAGE_STREAMING_SIDECAR"
            r10.A03(r12, r8, r3, r11)     // Catch:{ all -> 0x097e }
            java.lang.String r12 = "mms_thumbnail_metadata"
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ all -> 0x097e }
            long r3 = r5.A1N     // Catch:{ all -> 0x097e }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x097e }
            r11[r6] = r3     // Catch:{ all -> 0x097e }
            java.lang.String r3 = "revokeMessageOnCurrentThread/DELETE_MMS_THUMBNAIL_METADATA"
            r10.A03(r12, r8, r3, r11)     // Catch:{ all -> 0x097e }
            java.lang.String r12 = "audio_data"
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ all -> 0x097e }
            long r3 = r5.A1N     // Catch:{ all -> 0x097e }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x097e }
            r11[r6] = r3     // Catch:{ all -> 0x097e }
            java.lang.String r3 = "revokeMessageOnCurrentThread/DELETE_AUDIO_DATA"
            r10.A03(r12, r8, r3, r11)     // Catch:{ all -> 0x097e }
            java.lang.String r12 = "message_location"
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ all -> 0x097e }
            long r3 = r5.A1N     // Catch:{ all -> 0x097e }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x097e }
            r11[r6] = r3     // Catch:{ all -> 0x097e }
            java.lang.String r3 = "revokeMessageOnCurrentThread/DELETE_MESSAGE_LOCATION"
            r10.A03(r12, r8, r3, r11)     // Catch:{ all -> 0x097e }
            java.lang.String r12 = "message_template"
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ all -> 0x097e }
            long r3 = r5.A1N     // Catch:{ all -> 0x097e }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x097e }
            r11[r6] = r3     // Catch:{ all -> 0x097e }
            java.lang.String r3 = "revokeMessageOnCurrentThread/DELETE_MESSAGE_TEMPLATE"
            r10.A03(r12, r8, r3, r11)     // Catch:{ all -> 0x097e }
            java.lang.String r12 = "message_template_button"
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ all -> 0x097e }
            long r3 = r5.A1N     // Catch:{ all -> 0x097e }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x097e }
            r11[r6] = r3     // Catch:{ all -> 0x097e }
            java.lang.String r3 = "revokeMessageOnCurrentThread/DELETE_MESSAGE_TEMPLATE_BUTTON"
            r10.A03(r12, r8, r3, r11)     // Catch:{ all -> 0x097e }
            java.lang.String r12 = "message_quoted"
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ all -> 0x097e }
            long r3 = r5.A1N     // Catch:{ all -> 0x097e }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x097e }
            r11[r6] = r3     // Catch:{ all -> 0x097e }
            java.lang.String r3 = "revokeMessageOnCurrentThread/DELETE_MESSAGE_QUOTED"
            r10.A03(r12, r8, r3, r11)     // Catch:{ all -> 0x097e }
            java.lang.String r12 = "message_mentions"
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ all -> 0x097e }
            long r3 = r5.A1N     // Catch:{ all -> 0x097e }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x097e }
            r11[r6] = r3     // Catch:{ all -> 0x097e }
            java.lang.String r3 = "revokeMessageOnCurrentThread/DELETE_MESSAGE_MENTIONS"
            r10.A03(r12, r8, r3, r11)     // Catch:{ all -> 0x097e }
            java.lang.String r12 = "message_product"
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ all -> 0x097e }
            long r3 = r5.A1N     // Catch:{ all -> 0x097e }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x097e }
            r11[r6] = r3     // Catch:{ all -> 0x097e }
            java.lang.String r3 = "revokeMessageOnCurrentThread/DELETE_MESSAGE_PRODUCT"
            r10.A03(r12, r9, r3, r11)     // Catch:{ all -> 0x097e }
            java.lang.String r12 = "message_link"
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ all -> 0x097e }
            long r3 = r5.A1N     // Catch:{ all -> 0x097e }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x097e }
            r11[r6] = r3     // Catch:{ all -> 0x097e }
            java.lang.String r3 = "revokeMessageOnCurrentThread/DELETE_MESSAGE_LINK"
            r10.A03(r12, r8, r3, r11)     // Catch:{ all -> 0x097e }
            java.lang.String r12 = "message_future"
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ all -> 0x097e }
            long r3 = r5.A1N     // Catch:{ all -> 0x097e }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x097e }
            r11[r6] = r3     // Catch:{ all -> 0x097e }
            java.lang.String r3 = "revokeMessageOnCurrentThread/DELETE_MESSAGE_FUTURE"
            r10.A03(r12, r8, r3, r11)     // Catch:{ all -> 0x097e }
            java.lang.String r12 = "message_system"
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ all -> 0x097e }
            long r3 = r5.A1N     // Catch:{ all -> 0x097e }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x097e }
            r11[r6] = r3     // Catch:{ all -> 0x097e }
            java.lang.String r3 = "revokeMessageOnCurrentThread/DELETE_MESSAGE_SYSTEM"
            r10.A03(r12, r8, r3, r11)     // Catch:{ all -> 0x097e }
            java.lang.String r12 = "message_text"
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ all -> 0x097e }
            long r3 = r5.A1N     // Catch:{ all -> 0x097e }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x097e }
            r11[r6] = r3     // Catch:{ all -> 0x097e }
            java.lang.String r3 = "revokeMessageOnCurrentThread/DELETE_MESSAGE_TEXT"
            r10.A03(r12, r8, r3, r11)     // Catch:{ all -> 0x097e }
            java.lang.String r12 = "message_send_count"
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ all -> 0x097e }
            long r3 = r5.A1N     // Catch:{ all -> 0x097e }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x097e }
            r11[r6] = r3     // Catch:{ all -> 0x097e }
            java.lang.String r3 = "revokeMessageOnCurrentThread/DELETE_MESSAGE_SEND_COUNT"
            r10.A03(r12, r8, r3, r11)     // Catch:{ all -> 0x097e }
            java.lang.String r12 = "message_ephemeral_setting"
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ all -> 0x097e }
            long r3 = r5.A1N     // Catch:{ all -> 0x097e }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x097e }
            r11[r6] = r3     // Catch:{ all -> 0x097e }
            java.lang.String r3 = "revokeMessageOnCurrentThread/DELETE_MESSAGE_EPHEMERAL_SETTING"
            r10.A03(r12, r8, r3, r11)     // Catch:{ all -> 0x097e }
            java.lang.String r13 = "message_ftsv2"
            java.lang.String r12 = "docid = ?"
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ all -> 0x097e }
            long r3 = r5.A1N     // Catch:{ all -> 0x097e }
            java.lang.String r3 = java.lang.Long.toString(r3)     // Catch:{ all -> 0x097e }
            r11[r6] = r3     // Catch:{ all -> 0x097e }
            java.lang.String r3 = "revokeMessageOnCurrentThread/DELETE_MESSAGE_FTS"
            r10.A03(r13, r12, r3, r11)     // Catch:{ all -> 0x097e }
            java.lang.String r12 = "played_self_receipt"
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ all -> 0x097e }
            long r3 = r5.A1N     // Catch:{ all -> 0x097e }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x097e }
            r11[r6] = r3     // Catch:{ all -> 0x097e }
            java.lang.String r3 = "revokeMessageOnCurrentThread/DELETE_PLAYED_SELF_RECEIPT"
            r10.A03(r12, r9, r3, r11)     // Catch:{ all -> 0x097e }
            java.lang.String r12 = "message_poll"
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ all -> 0x097e }
            long r3 = r5.A1N     // Catch:{ all -> 0x097e }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x097e }
            r11[r6] = r3     // Catch:{ all -> 0x097e }
            java.lang.String r3 = "revokeMessageOnCurrentThread/DELETE_MESSAGE_POLL"
            r10.A03(r12, r9, r3, r11)     // Catch:{ all -> 0x097e }
            java.lang.String r12 = "message_secret"
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ all -> 0x097e }
            long r3 = r5.A1N     // Catch:{ all -> 0x097e }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x097e }
            r11[r6] = r3     // Catch:{ all -> 0x097e }
            java.lang.String r3 = "revokeMessageOnCurrentThread/DELETE_MESSAGE_SECRET"
            r10.A03(r12, r9, r3, r11)     // Catch:{ all -> 0x097e }
            java.lang.String r12 = "message_view_once_media"
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ all -> 0x097e }
            long r3 = r5.A1N     // Catch:{ all -> 0x097e }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x097e }
            r11[r6] = r3     // Catch:{ all -> 0x097e }
            java.lang.String r3 = "revokeMessageOnCurrentThread/DELETE_MESSAGE_VIEW_ONCE"
            r10.A03(r12, r9, r3, r11)     // Catch:{ all -> 0x097e }
            java.lang.String r12 = "message_event"
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ all -> 0x097e }
            long r3 = r5.A1N     // Catch:{ all -> 0x097e }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x097e }
            r11[r6] = r3     // Catch:{ all -> 0x097e }
            java.lang.String r3 = "revokeMessageOnCurrentThread/DELETE_MESSAGE_EVENT"
            r10.A03(r12, r9, r3, r11)     // Catch:{ all -> 0x097e }
            X.1F3 r9 = r2.A0B     // Catch:{ all -> 0x097e }
            long r3 = r5.A1N     // Catch:{ all -> 0x097e }
            X.12P r13 = r9.A01     // Catch:{ all -> 0x097e }
            X.1M0 r10 = r13.A05()     // Catch:{ all -> 0x097e }
            X.14e r12 = r10.A02     // Catch:{ all -> 0x0974 }
            java.lang.String r11 = "DELETE FROM message_ui_elements WHERE message_row_id = ?"
            java.lang.String[] r9 = new java.lang.String[r0]     // Catch:{ all -> 0x0974 }
            java.lang.String r3 = java.lang.Long.toString(r3)     // Catch:{ all -> 0x0974 }
            r9[r6] = r3     // Catch:{ all -> 0x0974 }
            java.lang.String r3 = "DELETE_MESSAGE_UI_ELEMENTS_BY_MESSAGE_ROW_IS_SQL"
            r12.A0E(r11, r3, r9)     // Catch:{ all -> 0x0974 }
            r10.close()     // Catch:{ all -> 0x097e }
            int r4 = r5.A1I     // Catch:{ all -> 0x097e }
            r3 = 4
            if (r4 == r3) goto L_0x06da
            r3 = 14
            if (r4 == r3) goto L_0x06da
            r3 = 24
            if (r4 == r3) goto L_0x06be
            r3 = 44
            if (r4 == r3) goto L_0x06a1
            r3 = 46
            if (r4 == r3) goto L_0x0688
            r3 = 94
            if (r4 != r3) goto L_0x0744
            X.1TX r9 = r2.A0V     // Catch:{ all -> 0x097e }
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ all -> 0x097e }
            long r3 = r5.A1N     // Catch:{ all -> 0x097e }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x097e }
            r11[r6] = r3     // Catch:{ all -> 0x097e }
            java.lang.String r12 = "message_row_id = ? "
            X.12P r3 = r9.A02     // Catch:{ all -> 0x097e }
            X.1M0 r10 = r3.A05()     // Catch:{ all -> 0x097e }
            X.14e r9 = r10.A02     // Catch:{ all -> 0x0680 }
            java.lang.String r4 = "message_newsletter_admin_invite"
            java.lang.String r3 = "DELETE_NEWSLETTER_ADMIN_INVITE_MESSAGE_BY_ROW_ID_SQL"
            r9.A03(r4, r12, r3, r11)     // Catch:{ all -> 0x0680 }
            r10.close()     // Catch:{ all -> 0x097e }
            goto L_0x0744
        L_0x0680:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0682 }
        L_0x0682:
            r1 = move-exception
            X.C05600Qi.A00(r10, r3)     // Catch:{ all -> 0x097e }
            goto L_0x0964
        L_0x0688:
            X.1M0 r10 = r13.A05()     // Catch:{ all -> 0x097e }
            X.14e r12 = r10.A02     // Catch:{ all -> 0x0974 }
            java.lang.String r11 = "DELETE FROM message_ui_elements_reply WHERE message_row_id = ?"
            java.lang.String[] r9 = new java.lang.String[r0]     // Catch:{ all -> 0x0974 }
            long r3 = r5.A1N     // Catch:{ all -> 0x0974 }
            java.lang.String r3 = java.lang.Long.toString(r3)     // Catch:{ all -> 0x0974 }
            r9[r6] = r3     // Catch:{ all -> 0x0974 }
            java.lang.String r3 = "DELETE_REPLY_MESSAGE_BY_ROW_ID_SQL"
            r12.A0E(r11, r3, r9)     // Catch:{ all -> 0x0974 }
            goto L_0x0741
        L_0x06a1:
            X.1Ev r3 = r2.A0K     // Catch:{ all -> 0x097e }
            X.12P r3 = r3.A01     // Catch:{ all -> 0x097e }
            X.1M0 r10 = r3.A05()     // Catch:{ all -> 0x097e }
            X.14e r12 = r10.A02     // Catch:{ all -> 0x0974 }
            java.lang.String r11 = "message_order"
            java.lang.String[] r9 = new java.lang.String[r0]     // Catch:{ all -> 0x0974 }
            long r3 = r5.A1N     // Catch:{ all -> 0x0974 }
            java.lang.String r3 = java.lang.Long.toString(r3)     // Catch:{ all -> 0x0974 }
            r9[r6] = r3     // Catch:{ all -> 0x0974 }
            java.lang.String r3 = "DELETE_ORDER_MESSAGE_BY_ROW_ID_SQL"
            r12.A03(r11, r8, r3, r9)     // Catch:{ all -> 0x0974 }
            goto L_0x0741
        L_0x06be:
            X.1F8 r3 = r2.A0A     // Catch:{ all -> 0x097e }
            X.12P r3 = r3.A01     // Catch:{ all -> 0x097e }
            X.1M0 r10 = r3.A05()     // Catch:{ all -> 0x097e }
            X.14e r12 = r10.A02     // Catch:{ all -> 0x0974 }
            java.lang.String r11 = "DELETE FROM message_group_invite WHERE message_row_id = ?"
            java.lang.String[] r9 = new java.lang.String[r0]     // Catch:{ all -> 0x0974 }
            long r3 = r5.A1N     // Catch:{ all -> 0x0974 }
            java.lang.String r3 = java.lang.Long.toString(r3)     // Catch:{ all -> 0x0974 }
            r9[r6] = r3     // Catch:{ all -> 0x0974 }
            java.lang.String r3 = "DELETE_GROUP_INVITE_MESSAGE_BY_ROW_ID_SQL"
            r12.A0E(r11, r3, r9)     // Catch:{ all -> 0x0974 }
            goto L_0x0741
        L_0x06da:
            X.1Ew r9 = r2.A0Q     // Catch:{ all -> 0x097e }
            r3 = 4
            if (r4 == r3) goto L_0x06f8
            r3 = 14
            if (r4 == r3) goto L_0x06f8
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x097e }
            r9.<init>()     // Catch:{ all -> 0x097e }
            java.lang.String r3 = "VCardMessageStore/deleteVcardData attempted to deleteVcardData for non-contact message type="
            r9.append(r3)     // Catch:{ all -> 0x097e }
            r9.append(r4)     // Catch:{ all -> 0x097e }
            java.lang.String r3 = r9.toString()     // Catch:{ all -> 0x097e }
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ all -> 0x097e }
            goto L_0x0744
        L_0x06f8:
            X.12P r3 = r9.A07     // Catch:{ all -> 0x097e }
            X.1M0 r9 = r3.A05()     // Catch:{ all -> 0x097e }
            X.71s r13 = r9.B1k()     // Catch:{ all -> 0x096f }
            X.14e r10 = r9.A02     // Catch:{ all -> 0x0965 }
            java.lang.String r12 = "message_vcard"
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ all -> 0x0965 }
            long r3 = r5.A1N     // Catch:{ all -> 0x0965 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0965 }
            r11[r6] = r3     // Catch:{ all -> 0x0965 }
            java.lang.String r3 = "DELETE_VCARD_MESSAGE_BY_ROW_ID_SQL"
            r10.A03(r12, r8, r3, r11)     // Catch:{ all -> 0x0965 }
            java.lang.String r12 = "message_media_vcard_count"
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ all -> 0x0965 }
            long r3 = r5.A1N     // Catch:{ all -> 0x0965 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0965 }
            r11[r6] = r3     // Catch:{ all -> 0x0965 }
            java.lang.String r3 = "DELETE_BY_ROW_ID_SQL"
            r10.A03(r12, r8, r3, r11)     // Catch:{ all -> 0x0965 }
            java.lang.String r12 = "message_vcard_jid"
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ all -> 0x0965 }
            long r3 = r5.A1N     // Catch:{ all -> 0x0965 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0965 }
            r11[r6] = r3     // Catch:{ all -> 0x0965 }
            java.lang.String r3 = "DELETE_VCARD_JID_BY_MESSAGE_ROW_ID"
            r10.A03(r12, r8, r3, r11)     // Catch:{ all -> 0x0965 }
            r13.A00()     // Catch:{ all -> 0x0965 }
            r13.close()     // Catch:{ all -> 0x096f }
            r9.close()     // Catch:{ all -> 0x097e }
            goto L_0x0744
        L_0x0741:
            r10.close()     // Catch:{ all -> 0x097e }
        L_0x0744:
            r3 = 1024(0x400, float:1.435E-42)
            boolean r3 = r5.A1T(r3)     // Catch:{ all -> 0x097e }
            if (r3 == 0) goto L_0x076a
            X.1TW r9 = r2.A08     // Catch:{ all -> 0x097e }
            long r3 = r5.A1N     // Catch:{ all -> 0x097e }
            X.12P r9 = r9.A00     // Catch:{ all -> 0x097e }
            X.1M0 r10 = r9.A05()     // Catch:{ all -> 0x097e }
            X.14e r12 = r10.A02     // Catch:{ all -> 0x0974 }
            java.lang.String r11 = "DELETE FROM message_external_ad_content WHERE message_row_id=?"
            java.lang.String[] r9 = new java.lang.String[r0]     // Catch:{ all -> 0x0974 }
            java.lang.String r3 = java.lang.Long.toString(r3)     // Catch:{ all -> 0x0974 }
            r9[r6] = r3     // Catch:{ all -> 0x0974 }
            java.lang.String r3 = "DELETE_EXTERNAL_AD_CONTENT_INFO_FOR_ROW_ID_SQL"
            r12.A0E(r11, r3, r9)     // Catch:{ all -> 0x0974 }
            r10.close()     // Catch:{ all -> 0x097e }
        L_0x076a:
            boolean r3 = r5.A1T(r0)     // Catch:{ all -> 0x097e }
            if (r3 == 0) goto L_0x078e
            X.1TT r9 = r2.A09     // Catch:{ all -> 0x097e }
            long r3 = r5.A1N     // Catch:{ all -> 0x097e }
            X.12P r9 = r9.A00     // Catch:{ all -> 0x097e }
            X.1M0 r9 = r9.A05()     // Catch:{ all -> 0x097e }
            X.14e r12 = r9.A02     // Catch:{ all -> 0x096f }
            java.lang.String r11 = "message_forwarded"
            java.lang.String[] r10 = new java.lang.String[r0]     // Catch:{ all -> 0x096f }
            java.lang.String r3 = java.lang.Long.toString(r3)     // Catch:{ all -> 0x096f }
            r10[r6] = r3     // Catch:{ all -> 0x096f }
            java.lang.String r3 = "DELETE_FORWARDING_SCORE_FOR_ROW_ID_SQL"
            r12.A03(r11, r8, r3, r10)     // Catch:{ all -> 0x096f }
            r9.close()     // Catch:{ all -> 0x097e }
        L_0x078e:
            r10 = r17
            goto L_0x07b1
        L_0x0791:
            int r3 = r5.A0H()     // Catch:{ all -> 0x097e }
            if (r3 != r0) goto L_0x079c
            X.0xM r3 = r2.A06     // Catch:{ all -> 0x097e }
            r3.A0o(r5, r12, r0)     // Catch:{ all -> 0x097e }
        L_0x079c:
            r7.A15 = r6     // Catch:{ all -> 0x097e }
            r7.A10 = r6     // Catch:{ all -> 0x097e }
            r3 = r17
            r7.A0W = r3     // Catch:{ all -> 0x097e }
            r3 = 0
            r7.A0F = r3     // Catch:{ all -> 0x097e }
            r3 = r17
            r7.A0w = r3     // Catch:{ all -> 0x097e }
            r7.A0t = r3     // Catch:{ all -> 0x097e }
            r13.A04(r7)     // Catch:{ all -> 0x097e }
        L_0x07b1:
            boolean r3 = r7 instanceof X.AnonymousClass2bO     // Catch:{ all -> 0x097e }
            if (r3 == 0) goto L_0x07ca
            if (r16 == 0) goto L_0x07ca
            r3 = 16777216(0x1000000, float:2.3509887E-38)
            boolean r3 = r7.A1T(r3)     // Catch:{ all -> 0x097e }
            if (r3 == 0) goto L_0x07ca
            X.3Kx r3 = r7.A0P()     // Catch:{ all -> 0x097e }
            if (r3 == 0) goto L_0x07ca
            X.1Cx r3 = r2.A0G     // Catch:{ all -> 0x097e }
            r3.A03(r7)     // Catch:{ all -> 0x097e }
        L_0x07ca:
            X.005 r3 = r2.A0a     // Catch:{ all -> 0x097e }
            java.lang.Object r4 = r3.get()     // Catch:{ all -> 0x097e }
            X.1HX r4 = (X.AnonymousClass1HX) r4     // Catch:{ all -> 0x097e }
            boolean r13 = r4.A07(r5)     // Catch:{ all -> 0x097e }
            X.3Kf r4 = r5.A0M()     // Catch:{ all -> 0x097e }
            if (r4 == 0) goto L_0x0877
            r3.get()     // Catch:{ all -> 0x097e }
            boolean r8 = r5 instanceof X.AnonymousClass2bV     // Catch:{ all -> 0x097e }
            if (r8 == 0) goto L_0x085a
            boolean r8 = X.C63903Lw.A00(r5)     // Catch:{ all -> 0x097e }
            if (r8 == 0) goto L_0x085a
            X.3KQ r8 = r5.A0N()     // Catch:{ all -> 0x097e }
            if (r8 == 0) goto L_0x085a
            X.3Kf r8 = r5.A0M()     // Catch:{ all -> 0x097e }
            if (r8 == 0) goto L_0x085a
            X.3KQ r8 = r5.A0N()     // Catch:{ all -> 0x097e }
            if (r8 == 0) goto L_0x07ff
            X.2p4 r8 = r8.A00     // Catch:{ all -> 0x097e }
            if (r8 != 0) goto L_0x085a
        L_0x07ff:
            X.005 r8 = r2.A0Z     // Catch:{ all -> 0x097e }
            java.lang.Object r11 = r8.get()     // Catch:{ all -> 0x097e }
            X.3Gr r11 = (X.C62573Gr) r11     // Catch:{ all -> 0x097e }
            java.lang.String r4 = r4.A02     // Catch:{ all -> 0x097e }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x097e }
            X.1HX r3 = (X.AnonymousClass1HX) r3     // Catch:{ all -> 0x097e }
            java.util.Objects.requireNonNull(r3)     // Catch:{ all -> 0x097e }
            X.1yV r9 = new X.1yV     // Catch:{ all -> 0x097e }
            r9.<init>(r3, r0)     // Catch:{ all -> 0x097e }
            java.util.ArrayList r3 = r11.A00(r4)     // Catch:{ all -> 0x097e }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x097e }
            r8.<init>()     // Catch:{ all -> 0x097e }
            java.util.Iterator r12 = r3.iterator()     // Catch:{ all -> 0x097e }
        L_0x0824:
            boolean r3 = r12.hasNext()     // Catch:{ all -> 0x097e }
            if (r3 == 0) goto L_0x083e
            java.lang.Object r4 = r12.next()     // Catch:{ all -> 0x097e }
            java.lang.Object r3 = r9.invoke(r4)     // Catch:{ all -> 0x097e }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x097e }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x097e }
            if (r3 == 0) goto L_0x0824
            r8.add(r4)     // Catch:{ all -> 0x097e }
            goto L_0x0824
        L_0x083e:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x097e }
            r3.<init>(r8)     // Catch:{ all -> 0x097e }
            java.util.Iterator r8 = r3.iterator()     // Catch:{ all -> 0x097e }
        L_0x0847:
            boolean r4 = r8.hasNext()     // Catch:{ all -> 0x097e }
            if (r4 == 0) goto L_0x0872
            java.lang.Object r4 = r8.next()     // Catch:{ all -> 0x097e }
            X.3T1 r4 = (X.AnonymousClass3T1) r4     // Catch:{ all -> 0x097e }
            X.AnonymousClass00C.A0B(r4)     // Catch:{ all -> 0x097e }
            r11.A01(r4)     // Catch:{ all -> 0x097e }
            goto L_0x0847
        L_0x085a:
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x097e }
            X.1HX r3 = (X.AnonymousClass1HX) r3     // Catch:{ all -> 0x097e }
            boolean r3 = r3.A08(r5)     // Catch:{ all -> 0x097e }
            if (r3 == 0) goto L_0x0877
            X.005 r3 = r2.A0Z     // Catch:{ all -> 0x097e }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x097e }
            X.3Gr r3 = (X.C62573Gr) r3     // Catch:{ all -> 0x097e }
            r3.A01(r5)     // Catch:{ all -> 0x097e }
            goto L_0x0877
        L_0x0872:
            X.0xM r4 = r11.A03     // Catch:{ all -> 0x097e }
            r4.A0v(r3, r6)     // Catch:{ all -> 0x097e }
        L_0x0877:
            r3 = r29
            boolean r3 = r3.A02     // Catch:{ all -> 0x097e }
            if (r3 != 0) goto L_0x08ac
            r3 = r31
            boolean r3 = X.C66013Ui.A0T(r3, r7)     // Catch:{ all -> 0x097e }
            if (r3 != 0) goto L_0x08ac
            int r4 = r7.A1I     // Catch:{ all -> 0x097e }
            r3 = 83
            if (r4 != r3) goto L_0x0896
            X.11F r4 = r7.A0N     // Catch:{ all -> 0x097e }
            r3 = r31
            boolean r3 = r3.A0M(r4)     // Catch:{ all -> 0x097e }
            if (r3 == 0) goto L_0x0896
            goto L_0x08ac
        L_0x0896:
            if (r13 != 0) goto L_0x08ac
            X.1DL r3 = r2.A0U     // Catch:{ all -> 0x097e }
            r3.A08(r1)     // Catch:{ all -> 0x097e }
            r4 = 6440(0x1928, float:9.024E-42)
            r3 = r19
            r1 = r28
            boolean r1 = X.C20800yB.A01(r3, r1, r4)     // Catch:{ all -> 0x097e }
            if (r1 != 0) goto L_0x0911
            if (r15 == 0) goto L_0x0911
            goto L_0x08ed
        L_0x08ac:
            if (r18 == 0) goto L_0x08bc
            java.lang.String r3 = "deleted self status, calling refreshMyStatusAndNotifyAboutStatusDeletion"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x097e }
            X.0xM r4 = r2.A06     // Catch:{ all -> 0x097e }
            java.util.List r3 = java.util.Collections.singletonList(r7)     // Catch:{ all -> 0x097e }
            r4.A0t(r3)     // Catch:{ all -> 0x097e }
        L_0x08bc:
            if (r16 != 0) goto L_0x08c7
            X.176 r3 = r2.A0F     // Catch:{ all -> 0x097e }
            java.util.Map r4 = r3.A02     // Catch:{ all -> 0x097e }
            r3 = r29
            r4.put(r3, r7)     // Catch:{ all -> 0x097e }
        L_0x08c7:
            if (r10 != 0) goto L_0x08d3
            if (r16 != 0) goto L_0x08d1
            X.1Fe r3 = r2.A0H     // Catch:{ all -> 0x097e }
            java.util.HashSet r17 = r3.A06(r7)     // Catch:{ all -> 0x097e }
        L_0x08d1:
            r10 = r17
        L_0x08d3:
            X.1QO r4 = r2.A0M     // Catch:{ all -> 0x097e }
            r4.A01(r5)     // Catch:{ all -> 0x097e }
            if (r10 == 0) goto L_0x08e3
            boolean r3 = r10.isEmpty()     // Catch:{ all -> 0x097e }
            if (r3 != 0) goto L_0x08e3
            r4.A02(r7, r10)     // Catch:{ all -> 0x097e }
        L_0x08e3:
            if (r33 == 0) goto L_0x0911
            if (r16 == 0) goto L_0x0911
            X.1DL r3 = r2.A0U     // Catch:{ all -> 0x097e }
            r3.A08(r1)     // Catch:{ all -> 0x097e }
            goto L_0x0911
        L_0x08ed:
            X.12t r8 = r2.A04     // Catch:{ all -> 0x097e }
            boolean r1 = r15.equals(r15)     // Catch:{ all -> 0x097e }
            if (r1 != 0) goto L_0x0921
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x097e }
            r3.<init>()     // Catch:{ all -> 0x097e }
            java.lang.String r1 = "msgstore/onMessageDeletedInChat/unequalchatjid/"
            r3.append(r1)     // Catch:{ all -> 0x097e }
            r3.append(r15)     // Catch:{ all -> 0x097e }
            java.lang.String r1 = "/"
            r3.append(r1)     // Catch:{ all -> 0x097e }
            r3.append(r15)     // Catch:{ all -> 0x097e }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x097e }
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ all -> 0x097e }
        L_0x0911:
            r21.A00()     // Catch:{ all -> 0x097e }
            r1 = 10
            X.1j0 r3 = new X.1j0     // Catch:{ all -> 0x097e }
            r3.<init>(r2, r5, r7, r1)     // Catch:{ all -> 0x097e }
            r1 = r20
            r1.B5o(r3)     // Catch:{ all -> 0x097e }
            goto L_0x095b
        L_0x0921:
            X.12q r1 = r8.A00     // Catch:{ all -> 0x097e }
            X.3Qp r9 = r1.A09(r15, r6)     // Catch:{ all -> 0x097e }
            if (r9 == 0) goto L_0x0911
            X.005 r3 = r8.A01     // Catch:{ all -> 0x097e }
            java.lang.Object r1 = r3.get()     // Catch:{ all -> 0x097e }
            X.1Do r1 = (X.C24731Do) r1     // Catch:{ all -> 0x097e }
            X.1Ef r1 = r1.A0A     // Catch:{ all -> 0x097e }
            boolean r1 = r1.A00(r5)     // Catch:{ all -> 0x097e }
            if (r1 != 0) goto L_0x0911
            r3.get()     // Catch:{ all -> 0x097e }
            int r1 = r9.A08     // Catch:{ all -> 0x097e }
            if (r1 <= 0) goto L_0x0946
            int r1 = r1 + -1
            monitor-enter(r9)     // Catch:{ all -> 0x097e }
            r9.A08 = r1     // Catch:{ all -> 0x0962 }
            monitor-exit(r9)     // Catch:{ all -> 0x097e }
        L_0x0946:
            java.lang.Object r1 = r3.get()     // Catch:{ all -> 0x097e }
            X.1Do r1 = (X.C24731Do) r1     // Catch:{ all -> 0x097e }
            X.1C7 r4 = r1.A09     // Catch:{ all -> 0x097e }
            r1 = 39
            X.1j5 r3 = new X.1j5     // Catch:{ all -> 0x097e }
            r3.<init>(r8, r9, r1)     // Catch:{ all -> 0x097e }
            r1 = 55
            r4.A01(r3, r1)     // Catch:{ all -> 0x097e }
            goto L_0x0911
        L_0x095b:
            r21.close()     // Catch:{ all -> 0x0988 }
            r20.close()     // Catch:{ IOException -> 0x0992 }
            goto L_0x09ab
        L_0x0962:
            r1 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x097e }
        L_0x0964:
            throw r1     // Catch:{ all -> 0x097e }
        L_0x0965:
            r3 = move-exception
            r13.close()     // Catch:{ all -> 0x096a }
            goto L_0x096e
        L_0x096a:
            r1 = move-exception
            r3.addSuppressed(r1)     // Catch:{ all -> 0x096f }
        L_0x096e:
            throw r3     // Catch:{ all -> 0x096f }
        L_0x096f:
            r3 = move-exception
            r9.close()     // Catch:{ all -> 0x0979 }
            goto L_0x097d
        L_0x0974:
            r3 = move-exception
            r10.close()     // Catch:{ all -> 0x0979 }
            goto L_0x097d
        L_0x0979:
            r1 = move-exception
            r3.addSuppressed(r1)     // Catch:{ all -> 0x097e }
        L_0x097d:
            throw r3     // Catch:{ all -> 0x097e }
        L_0x097e:
            r3 = move-exception
            r21.close()     // Catch:{ all -> 0x0983 }
            goto L_0x0987
        L_0x0983:
            r1 = move-exception
            r3.addSuppressed(r1)     // Catch:{ all -> 0x0988 }
        L_0x0987:
            throw r3     // Catch:{ all -> 0x0988 }
        L_0x0988:
            r3 = move-exception
            r20.close()     // Catch:{ all -> 0x098d }
            goto L_0x0991
        L_0x098d:
            r1 = move-exception
            r3.addSuppressed(r1)     // Catch:{ IOException -> 0x0992 }
        L_0x0991:
            throw r3     // Catch:{ IOException -> 0x0992 }
        L_0x0992:
            r4 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = "msgstore/revoke: Failed to re-insert revoked message:"
            r3.append(r1)
            java.lang.String r1 = r4.getMessage()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.whatsapp.util.Log.e((java.lang.String) r1)
        L_0x09ab:
            X.12q r3 = r2.A05
            r1 = r31
            X.C66013Ui.A0G(r1, r3, r5)
            X.1DQ r8 = r2.A0d
            android.os.Handler r3 = r8.A00
            r1 = 5
            r4 = r32
            android.os.Message r1 = android.os.Message.obtain(r3, r1, r4, r6, r7)
            r1.sendToTarget()
            android.os.Handler r4 = r8.A01
            r3 = 5
            X.1j7 r1 = new X.1j7
            r1.<init>(r2, r5, r3)
            r4.post(r1)
            android.os.Handler r4 = r8.A02
            r1 = 6
            X.1j7 r3 = new X.1j7
            r3.<init>(r2, r7, r1)
            goto L_0x0156
        L_0x09d5:
            boolean r3 = r1 instanceof X.AnonymousClass5JA
            if (r3 == 0) goto L_0x0106
            r3 = r1
            X.5JA r3 = (X.AnonymousClass5JA) r3
            r3.A02 = r4
            goto L_0x0106
        L_0x09e0:
            if (r16 == 0) goto L_0x0160
            if (r33 == 0) goto L_0x0160
            X.11F r10 = r1.A0J()
            boolean r3 = X.AnonymousClass143.A0K(r10)
            if (r3 != 0) goto L_0x0160
            boolean r3 = r1 instanceof X.AnonymousClass2c8
            if (r3 == 0) goto L_0x0a28
            r3 = r1
            X.2c8 r3 = (X.AnonymousClass2c8) r3
            com.whatsapp.jid.UserJid r11 = r3.A00
        L_0x09f7:
            long r3 = r1.A0I
            if (r9 == 0) goto L_0x0a1c
            r5 = r1
            X.2bO r5 = (X.AnonymousClass2bO) r5
            java.lang.String r5 = r5.A01
        L_0x0a00:
            r14 = 0
            X.3AW r9 = new X.3AW
            r15 = 0
            r16 = 0
            r12 = r8
            r13 = r5
            r17 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            r2.A02(r9)
            boolean r3 = r1.A1J()
            if (r3 != 0) goto L_0x0160
            X.1DL r2 = r2.A0U
            r2.A08(r1)
            return r0
        L_0x0a1c:
            boolean r5 = r1 instanceof X.AnonymousClass5JA
            if (r5 == 0) goto L_0x0a26
            r5 = r1
            X.5JA r5 = (X.AnonymousClass5JA) r5
            java.lang.String r5 = r5.A02
            goto L_0x0a00
        L_0x0a26:
            r5 = 0
            goto L_0x0a00
        L_0x0a28:
            r11 = 0
            goto L_0x09f7
        L_0x0a2a:
            java.lang.String r0 = "FMessageRevokedFactory/cloneMessageAndReplacingOriginalMessage message type not supported"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1SR.A00(X.1SR, X.3T1, int, boolean, boolean):boolean");
    }
}
