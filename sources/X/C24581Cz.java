package X;

import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendPeerMessageJob;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* renamed from: X.1Cz  reason: invalid class name and case insensitive filesystem */
public class C24581Cz {
    public final C19460v5 A00;
    public final C19700wN A01;
    public final C19730wQ A02;
    public final C25731Hl A03;
    public final C25751Hn A04;
    public final C24571Cy A05;
    public final C25761Ho A06;
    public final AnonymousClass16D A07;
    public final AnonymousClass1DM A08;
    public final C19970wo A09;
    public final AnonymousClass189 A0A;
    public final C220412q A0B;
    public final C20310xM A0C;
    public final AnonymousClass17X A0D;
    public final AnonymousClass17T A0E;
    public final AnonymousClass17U A0F;
    public final AnonymousClass1HT A0G;
    public final AnonymousClass16E A0H;
    public final C230817c A0I;
    public final C230416y A0J;
    public final AnonymousClass12O A0K;
    public final AnonymousClass1FV A0L;
    public final C236419g A0M;
    public final C237219o A0N;
    public final C25701Hi A0O;
    public final AnonymousClass1AI A0P;
    public final C20810yC A0Q;
    public final C21010yW A0R;
    public final AnonymousClass17V A0S;
    public final C20840yF A0T;
    public final AnonymousClass1EL A0U;
    public final AnonymousClass1HI A0V;
    public final AnonymousClass1D0 A0W;
    public final AnonymousClass1A1 A0X;
    public final AnonymousClass005 A0Y;
    public final Random A0Z = new Random();
    public final AnonymousClass164 A0a;
    public final AnonymousClass1AB A0b;
    public final AnonymousClass1HJ A0c;
    public final C233017y A0d;
    public final C237919w A0e;
    public final AnonymousClass005 A0f;

    public static AnonymousClass6CO A01(AnonymousClass3SB r4, C24581Cz r5) {
        boolean z;
        boolean z2;
        AnonymousClass63Y A002 = C110955bV.A00(AnonymousClass5SH.FOR_COMPANION_SYNC);
        C198959eT r1 = r4.A06;
        if (r1 != null) {
            z = r1.A06;
        } else {
            z = false;
        }
        A002.A03 = z;
        if (r1 != null) {
            z2 = r1.A05;
        } else {
            z2 = false;
        }
        A002.A02 = z2;
        A002.A00 = C20800yB.A00(C21000yV.A02, r5.A0Q, 6050);
        return A002.A00();
    }

    public static void A04(AnonymousClass3I3 r13, C24581Cz r14, String str, int i, int i2, int i3, long j, long j2, long j3, long j4) {
        int i4 = i;
        int i5 = i3;
        if (i == 0) {
            r14.A0N.A01(false);
        } else {
            int i6 = 6;
            if (i4 == 6) {
                C25761Ho r1 = r14.A06;
                if (i5 != 5) {
                    i6 = 5;
                }
                r1.A00(Integer.valueOf(i6), str);
            }
        }
        r14.A0b.A0B(r13, i4, i2, i5, j, j2, j3, j4, 0);
    }

    public static void A05(AnonymousClass11F r8, C24581Cz r9, C99764tv r10, long j, long j2) {
        AnonymousClass1M0 r2;
        Throwable th;
        AnonymousClass5UB r0;
        AnonymousClass17U r4 = r9.A0F;
        C65073Qp A092 = r4.A01.A09(r8, false);
        if (A092 != null) {
            if (A092.A0H == Long.MIN_VALUE) {
                String[] strArr = {String.valueOf(r4.A00.A08(r8))};
                r2 = r4.A02.get();
                Cursor A093 = r2.A02.A09("   SELECT sort_id FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8') ORDER BY sort_id ASC LIMIT 1", "GET_FIRST_SORT_REF_SQL", strArr);
                try {
                    if (A093.moveToFirst()) {
                        A092.A0H = A093.getLong(A093.getColumnIndexOrThrow("sort_id"));
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("msgstore/getfirstsortref can't get value for ");
                        sb.append(r8);
                        Log.w(sb.toString());
                    }
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                try {
                    A093.close();
                    r2.close();
                } catch (Throwable th3) {
                    try {
                        r2.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            }
            long j3 = A092.A0H;
            if (j3 != Long.MIN_VALUE) {
                if (j3 >= j) {
                    r0 = AnonymousClass5UB.COMPLETE_AND_NO_MORE_MESSAGE_REMAIN_ON_PRIMARY;
                } else if (j3 < j2) {
                    AnonymousClass17T r22 = r9.A0E;
                    int i = 0;
                    String[] strArr2 = {String.valueOf(r22.A00.A08(r8)), Long.toString(j2), Long.toString(j)};
                    r2 = r22.A01.get();
                    Cursor A094 = r2.A02.A09("SELECT COUNT(*) as count FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8') AND _id > ? AND _id <= ?", "GET_CHAT_MESSAGE_COUNT_RANGE_SQL", strArr2);
                    try {
                        if (A094.moveToNext()) {
                            i = A094.getInt(A094.getColumnIndexOrThrow("count"));
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("msgstore/getmessagesatid/pos:");
                            sb2.append(i);
                            Log.i(sb2.toString());
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("msgstore/getmessagesatid/db no message for ");
                            sb3.append(r8);
                            Log.i(sb3.toString());
                        }
                        A094.close();
                        r2.close();
                        if (i == 0) {
                            r0 = AnonymousClass5UB.COMPLETE_BUT_MORE_MESSAGES_REMAIN_ON_PRIMARY;
                        } else {
                            return;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        if (A094 != null) {
                            A094.close();
                        }
                        throw th;
                    }
                } else {
                    return;
                }
                r10.A0U(r0);
            }
        }
    }

    public static void A06(C24581Cz r8, C99784tx r9) {
        Cursor A092;
        C52702q2 r0;
        C233017y r5 = r8.A0d;
        String[] strArr = {String.valueOf(C19970wo.A00(r8.A09) - 5184000000L), String.valueOf(1000)};
        AnonymousClass1M0 A042 = r5.A01.get();
        try {
            A092 = A042.A02.A09("SELECT group_jid_row_id, user_jid_row_id, is_leave, timestamp FROM group_past_participant_user WHERE timestamp >= ? ORDER BY timestamp DESC LIMIT ?", "GET_ALL_GROUP_PAST_PARTICIPANT_USERS_SQL", strArr);
            ArrayList A002 = C233017y.A00(A092);
            if (A092 != null) {
                A092.close();
            }
            A042.close();
            for (Map.Entry entry : C233017y.A01(r5, A002).entrySet()) {
                AnonymousClass8NN A0p = AnonymousClass8PI.DEFAULT_INSTANCE.A0p();
                String rawString = ((Jid) entry.getKey()).getRawString();
                A0p.A0S();
                AnonymousClass8PI r1 = (AnonymousClass8PI) A0p.A00;
                rawString.getClass();
                r1.bitField0_ |= 1;
                r1.groupJid_ = rawString;
                for (AnonymousClass38E r6 : (List) entry.getValue()) {
                    AnonymousClass8NN A0p2 = AnonymousClass8QD.DEFAULT_INSTANCE.A0p();
                    String rawString2 = r6.A01.getRawString();
                    A0p2.A0S();
                    AnonymousClass8QD r12 = (AnonymousClass8QD) A0p2.A00;
                    rawString2.getClass();
                    r12.bitField0_ |= 1;
                    r12.userJid_ = rawString2;
                    A0p2.A0S();
                    AnonymousClass8QD r13 = (AnonymousClass8QD) A0p2.A00;
                    r13.bitField0_ |= 4;
                    r13.leaveTs_ = r6.A00 / 1000;
                    if (r6.A02) {
                        r0 = C52702q2.LEFT;
                    } else {
                        r0 = C52702q2.REMOVED;
                    }
                    A0p2.A0S();
                    AnonymousClass8QD r14 = (AnonymousClass8QD) A0p2.A00;
                    r14.leaveReason_ = r0.value;
                    r14.bitField0_ |= 2;
                    C170918Hz A0R2 = A0p2.A0R();
                    A0p.A0S();
                    AnonymousClass8PI r2 = (AnonymousClass8PI) A0p.A00;
                    A0R2.getClass();
                    C23122B6c b6c = r2.pastParticipants_;
                    if (!((C21886AcE) b6c).A00) {
                        b6c = C170918Hz.A0A(b6c);
                        r2.pastParticipants_ = b6c;
                    }
                    b6c.add(A0R2);
                }
                C170918Hz A0R3 = A0p.A0R();
                r9.A0S();
                C100064uP r22 = (C100064uP) r9.A00;
                C100064uP r02 = C100064uP.DEFAULT_INSTANCE;
                A0R3.getClass();
                C23122B6c b6c2 = r22.pastParticipants_;
                if (!((C21886AcE) b6c2).A00) {
                    b6c2 = C170918Hz.A0A(b6c2);
                    r22.pastParticipants_ = b6c2;
                }
                b6c2.add(A0R3);
            }
            return;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public static void A07(C24581Cz r5, C99784tx r6) {
        ArrayList A082 = r5.A0c.A08((AnonymousClass4QI) null, 0, 200);
        StringBuilder sb = new StringBuilder();
        sb.append("history-sync-send-methods/attachRecentCallLogsToHistorySync call log size = ");
        sb.append(A082.size());
        Log.i(sb.toString());
        Iterator it = A082.iterator();
        while (it.hasNext()) {
            C100074uQ A032 = AnonymousClass6W3.A03(r5.A02, (C107265Nh) it.next());
            r6.A0S();
            C100064uP r2 = (C100064uP) r6.A00;
            C100064uP r0 = C100064uP.DEFAULT_INSTANCE;
            A032.getClass();
            C23122B6c b6c = r2.callLogRecords_;
            if (!((C21886AcE) b6c).A00) {
                b6c = C170918Hz.A0A(b6c);
                r2.callLogRecords_ = b6c;
            }
            b6c.add(A032);
        }
    }

    public static void A08(C24581Cz r10, C99784tx r11) {
        long j;
        AnonymousClass005 r2 = r10.A0f;
        ArrayList A0G2 = ((C104665Ar) r2.get()).A0G();
        HashMap A0H2 = ((C104665Ar) r2.get()).A0H();
        A0G2.size();
        Iterator it = A0G2.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            C135066c4 r3 = (C135066c4) pair.first;
            Number number = (Number) pair.second;
            AnonymousClass8NN A0p = C173468Ru.DEFAULT_INSTANCE.A0p();
            String str = r3.A0H;
            if (!TextUtils.isEmpty(str)) {
                A0p.A0S();
                C173468Ru r1 = (C173468Ru) A0p.A00;
                str.getClass();
                r1.bitField0_ |= 1;
                r1.url_ = str;
            }
            String str2 = r3.A0E;
            if (!TextUtils.isEmpty(str2)) {
                byte[] decode = Base64.decode(str2, 0);
                AnonymousClass8I5 A012 = C21674AUx.A01(decode, 0, decode.length);
                A0p.A0S();
                C173468Ru r12 = (C173468Ru) A0p.A00;
                r12.bitField0_ |= 2;
                r12.fileSha256_ = A012;
            }
            String str3 = r3.A09;
            if (!TextUtils.isEmpty(str3)) {
                byte[] decode2 = Base64.decode(str3, 0);
                AnonymousClass8I5 A013 = C21674AUx.A01(decode2, 0, decode2.length);
                A0p.A0S();
                C173468Ru r13 = (C173468Ru) A0p.A00;
                r13.bitField0_ |= 4;
                r13.fileEncSha256_ = A013;
            }
            String str4 = r3.A0C;
            if (!TextUtils.isEmpty(str4)) {
                byte[] decode3 = Base64.decode(str4, 1);
                AnonymousClass8I5 A014 = C21674AUx.A01(decode3, 0, decode3.length);
                A0p.A0S();
                C173468Ru r14 = (C173468Ru) A0p.A00;
                r14.bitField0_ |= 8;
                r14.mediaKey_ = A014;
            }
            String str5 = r3.A07;
            if (!TextUtils.isEmpty(str5)) {
                A0p.A0S();
                C173468Ru r15 = (C173468Ru) A0p.A00;
                str5.getClass();
                r15.bitField0_ |= 128;
                r15.directPath_ = str5;
            }
            String str6 = r3.A0D;
            A0p.A0S();
            C173468Ru r16 = (C173468Ru) A0p.A00;
            str6.getClass();
            r16.bitField0_ |= 16;
            r16.mimetype_ = str6;
            int i = r3.A02;
            A0p.A0S();
            C173468Ru r17 = (C173468Ru) A0p.A00;
            r17.bitField0_ |= 32;
            r17.height_ = i;
            int i2 = r3.A03;
            A0p.A0S();
            C173468Ru r18 = (C173468Ru) A0p.A00;
            r18.bitField0_ |= 64;
            r18.width_ = i2;
            long j2 = (long) r3.A00;
            A0p.A0S();
            C173468Ru r32 = (C173468Ru) A0p.A00;
            r32.bitField0_ |= 256;
            r32.fileLength_ = j2;
            float floatValue = number.floatValue();
            A0p.A0S();
            C173468Ru r19 = (C173468Ru) A0p.A00;
            r19.bitField0_ |= 512;
            r19.weight_ = floatValue;
            if (str2 == null || !A0H2.containsKey(str2)) {
                j = 0;
            } else {
                j = ((Number) A0H2.get(str2)).longValue();
            }
            A0p.A0S();
            C173468Ru r110 = (C173468Ru) A0p.A00;
            r110.bitField0_ |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
            r110.lastStickerSentTs_ = j;
            r11.A0S();
            C100064uP r33 = (C100064uP) r11.A00;
            C170918Hz A0R2 = A0p.A0R();
            C100064uP r0 = C100064uP.DEFAULT_INSTANCE;
            A0R2.getClass();
            C23122B6c b6c = r33.recentStickers_;
            if (!((C21886AcE) b6c).A00) {
                b6c = C170918Hz.A0A(b6c);
                r33.recentStickers_ = b6c;
            }
            b6c.add(A0R2);
        }
    }

    public void A09(AnonymousClass3I3 r32, DeviceJid deviceJid, String str, int i, boolean z) {
        int A002 = C20800yB.A00(C21000yV.A02, this.A0Q, 1181);
        try {
            ArrayList A0H2 = this.A07.A0H();
            C99784tx r9 = (C99784tx) C100064uP.DEFAULT_INSTANCE.A0p();
            r9.A0Y(AnonymousClass5UH.PUSH_NAME);
            Iterator it = A0H2.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnonymousClass141 r6 = (AnonymousClass141) it.next();
                UserJid userJid = (UserJid) r6.A06(UserJid.class);
                if (userJid != null && !TextUtils.isEmpty(r6.A0a)) {
                    C99614tg r3 = (C99614tg) C99864u5.DEFAULT_INSTANCE.A0p();
                    String rawString = userJid.getRawString();
                    r3.A0S();
                    C99864u5 r1 = (C99864u5) r3.A00;
                    rawString.getClass();
                    r1.bitField0_ |= 1;
                    r1.id_ = rawString;
                    String str2 = r6.A0a;
                    r3.A0S();
                    C99864u5 r12 = (C99864u5) r3.A00;
                    str2.getClass();
                    r12.bitField0_ |= 2;
                    r12.pushname_ = str2;
                    C99864u5 r33 = (C99864u5) r3.A0R();
                    r9.A0S();
                    C100064uP r2 = (C100064uP) r9.A00;
                    r33.getClass();
                    C23122B6c b6c = r2.pushnames_;
                    if (!((C21886AcE) b6c).A00) {
                        b6c = C170918Hz.A0A(b6c);
                        r2.pushnames_ = b6c;
                    }
                    b6c.add(r33);
                    i2++;
                    if (A002 > 0 && i2 >= A002) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("history-sync-send-methods/send-push-names reach limit=");
                        sb.append(A002);
                        Log.i(sb.toString());
                        break;
                    }
                }
            }
            A00(r32, deviceJid, this, r9, (String) null, str, 1, 4, 100, i, 0, -1, -1, -1, 0, 0, -1, z);
        } catch (Exception e) {
            Log.e("history-sync-send-methods/send-push-names: error", e);
        }
    }

    public static AnonymousClass5UH A02(int i) {
        switch (i) {
            case 0:
                return AnonymousClass5UH.INITIAL_BOOTSTRAP;
            case 1:
                return AnonymousClass5UH.INITIAL_STATUS_V3;
            case 2:
                return AnonymousClass5UH.RECENT;
            case 3:
                return AnonymousClass5UH.FULL;
            case 4:
                return AnonymousClass5UH.PUSH_NAME;
            case 5:
                return AnonymousClass5UH.NON_BLOCKING_DATA;
            case 6:
                return AnonymousClass5UH.ON_DEMAND;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected type (");
                sb.append(i);
                sb.append(")");
                throw new IllegalArgumentException(sb.toString());
        }
    }

    public C24581Cz(C19460v5 r2, C19700wN r3, C19730wQ r4, AnonymousClass164 r5, C25731Hl r6, C25751Hn r7, C24571Cy r8, C25761Ho r9, AnonymousClass1AB r10, AnonymousClass16D r11, AnonymousClass1DM r12, C19970wo r13, AnonymousClass189 r14, AnonymousClass1HJ r15, C220412q r16, C20310xM r17, AnonymousClass17X r18, C233017y r19, AnonymousClass17T r20, AnonymousClass17U r21, AnonymousClass1HT r22, AnonymousClass16E r23, C230817c r24, C230416y r25, AnonymousClass12O r26, AnonymousClass1FV r27, C236419g r28, C237219o r29, C25701Hi r30, AnonymousClass1AI r31, C20810yC r32, C21010yW r33, AnonymousClass17V r34, C20840yF r35, AnonymousClass1EL r36, AnonymousClass1HI r37, AnonymousClass1D0 r38, C237919w r39, AnonymousClass1A1 r40, AnonymousClass005 r41, AnonymousClass005 r42) {
        this.A09 = r13;
        this.A0Q = r32;
        this.A01 = r3;
        this.A02 = r4;
        this.A0B = r16;
        this.A0E = r20;
        this.A0R = r33;
        this.A0F = r21;
        this.A0H = r23;
        this.A0a = r5;
        this.A0I = r24;
        this.A07 = r11;
        this.A0f = r41;
        this.A0e = r39;
        this.A0W = r38;
        this.A0C = r17;
        this.A0X = r40;
        this.A0V = r37;
        this.A0K = r26;
        this.A0b = r10;
        this.A0c = r15;
        this.A0P = r31;
        this.A0A = r14;
        this.A0U = r36;
        this.A00 = r2;
        this.A0G = r22;
        this.A0S = r34;
        this.A08 = r12;
        this.A0Y = r42;
        this.A0M = r28;
        this.A05 = r8;
        this.A0L = r27;
        this.A0O = r30;
        this.A0D = r18;
        this.A03 = r6;
        this.A04 = r7;
        this.A0J = r25;
        this.A0d = r19;
        this.A0N = r29;
        this.A06 = r9;
        this.A0T = r35;
    }

    public static long A00(AnonymousClass3I3 r41, DeviceJid deviceJid, C24581Cz r43, C99784tx r44, String str, String str2, int i, int i2, int i3, int i4, long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z) {
        long j8 = j2;
        long j9 = j;
        int i5 = i4;
        int i6 = i3;
        long j10 = j6;
        int i7 = i2;
        long j11 = j5;
        String str3 = str2;
        long j12 = j4;
        C99784tx r13 = r44;
        AnonymousClass3I3 r9 = r41;
        DeviceJid deviceJid2 = deviceJid;
        long j13 = j3;
        C24581Cz r12 = r43;
        String str4 = str;
        int i8 = i;
        if (z) {
            if (((long) r13.A0R().A0k((C23073B3d) null)) < ((long) C20800yB.A00(C21000yV.A02, r12.A0Q, 3680)) * 1000) {
                r12.A0b.A0C(r9, i7, i8, (long) i6, true, false);
                if (i2 == 0) {
                    r12.A0N.A01(true);
                }
                A03(r9, deviceJid2, (C132046Rx) null, r12, r13, str4, str3, (String) null, (String) null, (String) null, i8, i7, i6, i5, j9, j8, j13, j12, j11, j10, 0, true);
                return 0;
            }
        }
        try {
            File A012 = r12.A0T.A00.A01("");
            A012.getAbsolutePath();
            AnonymousClass6YY.A09(r13.A0R(), A012);
            C65233Rg A002 = C65233Rg.A00(Uri.fromFile(A012), (C132046Rx) null, (C1262263a) null, new AnonymousClass3Ot(false, false, true), C25471Gl.A0N, (AnonymousClass3S2) null, (String) null, 0, false, false, true);
            long length = A012.length();
            r12.A0b.A0C(r9, i7, i8, (long) i6, true, true);
            AnonymousClass1D0 r5 = r12.A0W;
            C146506vi A072 = r5.A07(A002, false);
            A072.A0X = "mms";
            r5.A0E(A072, (String) null);
            A072.A06(new AnonymousClass70Y(r9, deviceJid2, A072, r12, r13, A012, str4, str3, i7, i6, i8, i5, j11, length, j8, j13, j12, j7, j9, j10), (Executor) null);
            return length;
        } catch (IOException e) {
            Log.e("history-sync-send-methods/save-to-file: failed", e);
            r12.A0b.A0C(r9, i7, i8, (long) i6, false, true);
            return 0;
        }
    }

    /* JADX INFO: finally extract failed */
    public static void A03(AnonymousClass3I3 r22, DeviceJid deviceJid, C132046Rx r24, C24581Cz r25, C99784tx r26, String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, int i4, long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z) {
        String str6;
        long j8;
        long size;
        int i5;
        byte[] bArr;
        C24581Cz r4 = r25;
        C19730wQ r0 = r4.A02;
        r0.A0G();
        PhoneUserJid phoneUserJid = r0.A03;
        int i6 = i3;
        int i7 = i2;
        int i8 = i;
        long j9 = j7;
        AnonymousClass3I3 r5 = r22;
        long j10 = j5;
        String str7 = str;
        C99784tx r6 = r26;
        if (phoneUserJid == null) {
            Log.e("history-sync-send-methods/no my user id (unregistered?).");
            j8 = (long) i6;
            size = (long) ((C100064uP) r6.A00).conversations_.size();
            i5 = 3;
        } else {
            DeviceJid deviceJid2 = deviceJid;
            if (AnonymousClass9ZV.A00(deviceJid2)) {
                if (!C20800yB.A01(C21000yV.A02, r4.A0Q, 5058)) {
                    return;
                }
            }
            String str8 = null;
            if (r22 != null) {
                str6 = r5.A01;
                str8 = r5.A00;
            } else {
                str6 = null;
            }
            C64933Qa A022 = r4.A0e.A02(phoneUserJid, true);
            C19970wo r15 = r4.A09;
            AnonymousClass5J9 r2 = new AnonymousClass5J9(A022, C19970wo.A00(r15));
            r2.A00 = deviceJid2;
            r2.A00 = i8;
            r2.A01 = i6;
            r2.A03 = i7;
            r2.A02 = i4;
            r2.A08 = j2;
            r2.A09 = j4;
            r2.A06 = j3;
            r2.A0E = str2;
            r2.A04 = (long) ((C100064uP) r6.A00).conversations_.size();
            r2.A07 = j10;
            r2.A0H = str6;
            r2.A0G = str8;
            r2.A0A = j6;
            r2.A0F = str7;
            if (z) {
                byte[] A0o = r6.A0R().A0o();
                Deflater deflater = new Deflater(1, false);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
                try {
                    deflaterOutputStream.write(A0o);
                    deflaterOutputStream.close();
                    bArr = byteArrayOutputStream.toByteArray();
                    deflater.end();
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("HistorySyncUtils/deflateData fails e=");
                    sb.append(e);
                    Log.e(sb.toString());
                    deflater.end();
                    Log.e("HistorySyncUtils/deflateData no result");
                    bArr = new byte[0];
                } catch (Throwable th) {
                    deflater.end();
                    throw th;
                }
                r2.A0I = bArr;
            } else {
                r2.A0B = str3;
                r2.A0D = str4;
                r2.A0C = str5;
                r2.A0J = r24.A01;
                r2.A05 = j9;
            }
            if (r4.A0P.A01(r2) < 0) {
                Log.e("history-sync-send-methods/failed to add peer message");
                j8 = (long) i6;
                size = (long) ((C100064uP) r6.A00).conversations_.size();
                i5 = 5;
            } else {
                r4.A0a.A01(new SendPeerMessageJob(deviceJid2, r2));
                if (i7 == 6) {
                    long A002 = C19970wo.A00(r15) - j;
                    int i9 = 1;
                    boolean z2 = false;
                    if (A002 > ((long) C20800yB.A00(C21000yV.A02, r4.A0Q, 3882))) {
                        z2 = true;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("HistorySyncSendMethods/sendPeerMessage on demand history sync isRequestTimeout = ");
                    sb2.append(z2);
                    sb2.append(", requestAgeMillis = ");
                    sb2.append(A002);
                    Log.i(sb2.toString());
                    C25761Ho r1 = r4.A06;
                    if (z2) {
                        i9 = 7;
                    }
                    r1.A00(Integer.valueOf(i9), str7);
                    return;
                }
                return;
            }
        }
        A04(r5, r4, str7, i7, i8, i5, j8, size, j10, j9);
    }
}
