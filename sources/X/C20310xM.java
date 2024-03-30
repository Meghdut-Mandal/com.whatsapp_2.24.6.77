package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.whatsapp.data.ConversationDeleteWorker;
import com.whatsapp.data.OrderRequestMessageManager$getOrderRequestMessageRowId$1;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0xM  reason: invalid class name and case insensitive filesystem */
public class C20310xM implements AnonymousClass00M {
    public C28291Sb A00;
    public final C19460v5 A01;
    public final C19460v5 A02;
    public final C19460v5 A03;
    public final C19700wN A04;
    public final C20690y0 A05;
    public final AnonymousClass17Y A06;
    public final C19730wQ A07;
    public final AnonymousClass1DT A08;
    public final C24041Av A09;
    public final AnonymousClass16D A0A;
    public final AnonymousClass185 A0B;
    public final C19970wo A0C;
    public final C19420v0 A0D;
    public final AnonymousClass1G7 A0E;
    public final AnonymousClass1C7 A0F;
    public final AnonymousClass1DP A0G;
    public final AnonymousClass163 A0H;
    public final C220412q A0I;
    public final C25201Fj A0J;
    public final C24381Cf A0K;
    public final AnonymousClass165 A0L;
    public final AnonymousClass12g A0M;
    public final AnonymousClass1FD A0N;
    public final AnonymousClass17S A0O;
    public final C25221Fl A0P;
    public final AnonymousClass1FI A0Q;
    public final C20650xu A0R;
    public final AnonymousClass17X A0S;
    public final AnonymousClass1DQ A0T;
    public final AnonymousClass178 A0U;
    public final AnonymousClass1DG A0V;
    public final AnonymousClass176 A0W;
    public final AnonymousClass1FZ A0X;
    public final C24561Cx A0Y;
    public final AnonymousClass16J A0Z;
    public final AnonymousClass12T A0a;
    public final C220612s A0b;
    public final AnonymousClass12P A0c;
    public final AnonymousClass1FF A0d;
    public final C25241Fn A0e;
    public final AnonymousClass1FS A0f;
    public final C24911Eg A0g;
    public final C20340xP A0h;
    public final AnonymousClass1FN A0i;
    public final AnonymousClass17T A0j;
    public final AnonymousClass1FT A0k;
    public final AnonymousClass17U A0l;
    public final C25281Fr A0m;
    public final AnonymousClass16F A0n;
    public final AnonymousClass16E A0o;
    public final AnonymousClass17A A0p;
    public final AnonymousClass1F1 A0q;
    public final C24921Eh A0r;
    public final AnonymousClass1EH A0s;
    public final AnonymousClass12O A0t;
    public final AnonymousClass1FV A0u;
    public final C236419g A0v;
    public final AnonymousClass16S A0w;
    public final C235518x A0x;
    public final AnonymousClass1FY A0y;
    public final C25211Fk A0z;
    public final C24931Ei A10;
    public final C20810yC A11;
    public final C20500xf A12;
    public final C21010yW A13;
    public final AnonymousClass17E A14;
    public final AnonymousClass1FU A15;
    public final AnonymousClass19I A16;
    public final C25291Fs A17;
    public final AnonymousClass1FQ A18;
    public final AnonymousClass1EU A19;
    public final C238019x A1A;
    public final AnonymousClass1A1 A1B;
    public final C19770wU A1C;
    public final AnonymousClass1GA A1D;
    public final C24961El A1E;
    public final AnonymousClass005 A1F;
    public final AnonymousClass005 A1G;
    public final Map A1H;
    public final C19460v5 A1I;
    public final AnonymousClass1FG A1J;
    public final AnonymousClass1DM A1K;
    public final AnonymousClass1G5 A1L;
    public final AnonymousClass1DH A1M;
    public final C21060yb A1N;
    public final AnonymousClass1A3 A1O;
    public final C24901Ef A1P;
    public final AnonymousClass1ER A1Q;
    public final C25051Eu A1R;
    public final C25231Fm A1S;
    public final AnonymousClass1F3 A1T;
    public final C219712j A1U;
    public final AnonymousClass1FE A1V;
    public final C25151Fe A1W;
    public final C25131Fc A1X;
    public final C219612i A1Y;
    public final AnonymousClass17W A1Z;
    public final AnonymousClass1C8 A1a;
    public final C24941Ej A1b;
    public final C24951Ek A1c;
    public final AnonymousClass184 A1d;
    public final AnonymousClass1CF A1e;
    public final C236919l A1f;
    public final AnonymousClass1C5 A1g;
    public final AnonymousClass1DL A1h;
    public final AnonymousClass19L A1i;
    public final C24551Cw A1j;
    public final AnonymousClass1FO A1k;
    public final AnonymousClass1C6 A1l;
    public final AnonymousClass005 A1m;

    public static void A05(C20310xM r6, AnonymousClass3T1 r7, int i) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        r6.A06.A0H(new C35341iX(r6, r7, countDownLatch, i, 5));
        try {
            countDownLatch.await(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e((Throwable) e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:87:0x00e5, code lost:
        if ((!r0) == false) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        if ((r1.A00 instanceof X.C177618e5) == false) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A09(X.C19730wQ r9, X.AnonymousClass1DH r10, X.C19420v0 r11, X.C65073Qp r12, X.AnonymousClass3T1 r13) {
        /*
            r8 = 0
            if (r12 == 0) goto L_0x0056
            boolean r0 = r12.A0i
            if (r0 == 0) goto L_0x0056
            boolean r0 = r13.A10
            if (r0 == 0) goto L_0x0017
            X.3Qa r1 = r13.A1J
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0017
            X.11F r0 = r1.A00
            boolean r0 = r0 instanceof X.C177618e5
            if (r0 == 0) goto L_0x0056
        L_0x0017:
            boolean r0 = r13 instanceof X.AnonymousClass2cL
            if (r0 != 0) goto L_0x0056
            boolean r0 = r13 instanceof X.AnonymousClass2cC
            if (r0 != 0) goto L_0x0056
            boolean r0 = r13 instanceof X.AnonymousClass2cD
            if (r0 != 0) goto L_0x0056
            int r1 = r13.A1I
            r0 = 8
            if (r1 == r0) goto L_0x0056
            boolean r0 = X.C66013Ui.A0e(r13)
            if (r0 != 0) goto L_0x0056
            boolean r0 = X.C66013Ui.A0m(r13)
            if (r0 != 0) goto L_0x0056
            boolean r0 = X.C66013Ui.A0g(r13)
            if (r0 != 0) goto L_0x0056
            boolean r0 = X.C66013Ui.A0h(r13)
            if (r0 != 0) goto L_0x0056
            X.3Qa r0 = r13.A1J
            boolean r1 = r0.A02
            if (r1 == 0) goto L_0x006a
            boolean r3 = X.C66013Ui.A0p(r13)
            if (r3 == 0) goto L_0x0057
            r0 = r13
            X.2bI r0 = (X.AnonymousClass2bI) r0
            int r2 = r0.A00
            r0 = 21
            if (r2 != r0) goto L_0x0057
        L_0x0056:
            return r8
        L_0x0057:
            if (r3 == 0) goto L_0x006a
            r0 = r13
            X.2bI r0 = (X.AnonymousClass2bI) r0
            int r2 = r0.A00
            r0 = 27
            if (r2 == r0) goto L_0x0056
            r0 = 131(0x83, float:1.84E-43)
            if (r2 == r0) goto L_0x0056
            r0 = 6
            if (r2 != r0) goto L_0x006a
            return r8
        L_0x006a:
            boolean r0 = X.C66013Ui.A0r(r13)
            if (r0 != 0) goto L_0x0056
            boolean r0 = X.C66013Ui.A0d(r13)
            if (r0 != 0) goto L_0x0056
            if (r1 == 0) goto L_0x00a8
            boolean r3 = X.C66013Ui.A0p(r13)
            if (r3 == 0) goto L_0x008c
            r0 = r13
            X.2bI r0 = (X.AnonymousClass2bI) r0
            int r2 = r0.A00
            r0 = 29
            if (r2 == r0) goto L_0x0056
            r0 = 30
            if (r2 != r0) goto L_0x008c
            return r8
        L_0x008c:
            if (r3 == 0) goto L_0x00a8
            r0 = r13
            X.2bI r0 = (X.AnonymousClass2bI) r0
            int r2 = r0.A00
            r0 = 31
            if (r2 == r0) goto L_0x0056
            r0 = 32
            if (r2 == r0) goto L_0x0056
            r0 = 53
            if (r2 == r0) goto L_0x0056
            r0 = 54
            if (r2 == r0) goto L_0x0056
            r0 = 56
            if (r2 != r0) goto L_0x00a8
            return r8
        L_0x00a8:
            boolean r0 = X.C66013Ui.A0j(r13)
            if (r0 != 0) goto L_0x0056
            boolean r2 = r13 instanceof X.AnonymousClass2bI
            if (r2 == 0) goto L_0x00e7
            r0 = r13
            X.2bI r0 = (X.AnonymousClass2bI) r0
            int r5 = r0.A00
            long r3 = (long) r5
            r6 = 62
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0056
            r6 = 63
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0056
            boolean r0 = X.C66013Ui.A0I(r5)
            if (r0 != 0) goto L_0x00f9
            r0 = 13
            if (r5 == r0) goto L_0x00f9
            r0 = 14
            if (r5 == r0) goto L_0x00f9
            r0 = 4
            if (r5 == r0) goto L_0x00db
            r0 = 7
            if (r5 == r0) goto L_0x00db
            r0 = 5
            if (r5 != r0) goto L_0x00e7
        L_0x00db:
            X.11F r0 = r13.A0J()
            boolean r0 = r9.A0M(r0)
        L_0x00e3:
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0056
        L_0x00e7:
            if (r1 == 0) goto L_0x0117
            boolean r4 = X.C66013Ui.A0p(r13)
            if (r4 == 0) goto L_0x010b
            r0 = r13
            X.2bI r0 = (X.AnonymousClass2bI) r0
            int r3 = r0.A00
            r0 = 73
            if (r3 != r0) goto L_0x010b
            return r8
        L_0x00f9:
            r0 = r13
            X.8nz r0 = (X.C181758nz) r0
            java.util.List r3 = r0.A01
            r9.A0G()
            com.whatsapp.jid.PhoneUserJid r0 = r9.A03
            X.C18740tg.A06(r0)
            boolean r0 = r3.contains(r0)
            goto L_0x00e3
        L_0x010b:
            if (r4 == 0) goto L_0x0117
            r0 = r13
            X.2bI r0 = (X.AnonymousClass2bI) r0
            int r3 = r0.A00
            r0 = 74
            if (r3 != r0) goto L_0x0117
            return r8
        L_0x0117:
            boolean r4 = X.C66013Ui.A0p(r13)
            if (r4 == 0) goto L_0x0165
            r0 = r13
            X.2bI r0 = (X.AnonymousClass2bI) r0
            int r3 = r0.A00
            java.util.Set r0 = X.C56672wh.A01
            r0 = 78
            if (r3 == r0) goto L_0x0056
            r0 = 109(0x6d, float:1.53E-43)
            if (r3 == r0) goto L_0x0056
            r0 = 87
            if (r3 == r0) goto L_0x0056
            r0 = 116(0x74, float:1.63E-43)
            if (r3 == r0) goto L_0x0056
            r0 = 98
            if (r3 == r0) goto L_0x0056
            r0 = 105(0x69, float:1.47E-43)
            if (r3 == r0) goto L_0x0056
            r0 = 95
            if (r3 == r0) goto L_0x0056
            r0 = 102(0x66, float:1.43E-43)
            if (r3 == r0) goto L_0x0056
            r0 = 75
            if (r3 == r0) goto L_0x0056
            r0 = 103(0x67, float:1.44E-43)
            if (r3 == r0) goto L_0x0056
            r0 = 104(0x68, float:1.46E-43)
            if (r3 == r0) goto L_0x0056
            r0 = 112(0x70, float:1.57E-43)
            if (r3 == r0) goto L_0x0056
            r0 = 128(0x80, float:1.794E-43)
            if (r3 == r0) goto L_0x0056
            r0 = 113(0x71, float:1.58E-43)
            if (r3 == r0) goto L_0x0056
            r0 = 114(0x72, float:1.6E-43)
            if (r3 == r0) goto L_0x0056
            r0 = 115(0x73, float:1.61E-43)
            if (r3 != r0) goto L_0x0165
            return r8
        L_0x0165:
            if (r2 == 0) goto L_0x0171
            r0 = r13
            X.2bI r0 = (X.AnonymousClass2bI) r0
            int r2 = r0.A00
            r0 = 118(0x76, float:1.65E-43)
            if (r2 != r0) goto L_0x0171
            return r8
        L_0x0171:
            if (r4 == 0) goto L_0x0189
            r0 = r13
            X.2bI r0 = (X.AnonymousClass2bI) r0
            int r2 = r0.A00
            r0 = 137(0x89, float:1.92E-43)
            if (r2 == r0) goto L_0x0056
            r0 = 138(0x8a, float:1.93E-43)
            if (r2 == r0) goto L_0x0056
            r0 = 150(0x96, float:2.1E-43)
            if (r2 == r0) goto L_0x0056
            r0 = 151(0x97, float:2.12E-43)
            if (r2 != r0) goto L_0x0189
            return r8
        L_0x0189:
            boolean r0 = X.C66013Ui.A0c(r13)
            if (r0 != 0) goto L_0x0056
            X.0v0 r0 = r10.A02
            boolean r0 = r0.A2F()
            if (r0 != 0) goto L_0x01a9
            if (r1 != 0) goto L_0x01af
            X.0wQ r0 = r10.A00
            boolean r0 = r0.A0L()
            if (r0 != 0) goto L_0x01af
            java.lang.String r0 = "archiveutil/enableArchiveV2IfNeededForMessage/Enabling archive2.0"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r10.A03()
        L_0x01a9:
            boolean r0 = r11.A2G()
            if (r0 == 0) goto L_0x0056
        L_0x01af:
            r8 = 1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20310xM.A09(X.0wQ, X.1DH, X.0v0, X.3Qp, X.3T1):boolean");
    }

    public static boolean A0D(C20310xM r2, AnonymousClass11F r3, boolean z, boolean z2) {
        if ((!z && !r2.A0G(r3)) || (!z2 && !r2.A1E.A02())) {
            return false;
        }
        C181148n0 A012 = r2.A1E.A01(r3, false);
        A05(r2, A012, -1);
        return r2.A0R(A012, -1).A00;
    }

    public long A0L(AnonymousClass11F r6, long j) {
        Cursor A092;
        long j2;
        String valueOf = String.valueOf(j);
        String[] strArr = {String.valueOf(this.A0H.A08(r6)), valueOf, valueOf, valueOf, String.valueOf(C19970wo.A00(this.A0C))};
        AnonymousClass1M0 A042 = this.A0c.get();
        try {
            A092 = A042.A02.A09(" SELECT sort_id FROM available_message_view WHERE chat_row_id = ?  AND  (  ( from_me = 1 AND (  CASE  WHEN status = 0 THEN 0  WHEN receipt_server_timestamp > 0  THEN receipt_server_timestamp <= ?  WHEN receipt_device_timestamp > 0  THEN receipt_device_timestamp <= ?  WHEN timestamp > 0  THEN timestamp <= ?  ELSE 0  END  ) ) OR  ( timestamp <= ?  AND from_me = 0 )  )  AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1)  ORDER BY sort_id DESC  LIMIT 1", "SELECT_LATEST_SORT_ID_IN_TIMERANGE_IN_CHAT_SQL", strArr);
            if (!A092.moveToFirst()) {
                j2 = -1;
            } else {
                j2 = A092.getLong(A092.getColumnIndexOrThrow("sort_id"));
            }
            A092.close();
            A042.close();
            return j2;
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

    public Cursor A0O(AnonymousClass11F r6, long j, long j2, long j3) {
        String[] strArr = {String.valueOf(this.A0H.A08(r6)), String.valueOf(j), String.valueOf(j2), String.valueOf(j3), String.valueOf(C19970wo.A00(this.A0C))};
        AnonymousClass1M0 A042 = this.A0c.get();
        try {
            Cursor A092 = A042.A02.A09("   SELECT _id, sort_id, key_id, from_me, timestamp, receipt_server_timestamp, starred, media_size, status FROM available_message_view WHERE chat_row_id = ? AND sort_id > ? AND sort_id <= ? AND timestamp <= ?  AND message_type = 7 AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1)  ORDER BY sort_id DESC ", "SELECT_SYSTEM_MESSAGE_IN_RANGE_IN_CHAT_SQL", strArr);
            A042.close();
            return A092;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    @Deprecated
    public C600336f A0S(AnonymousClass11F r9, int i, long j, long j2) {
        return A00(this, r9, i, j, j2, true);
    }

    public synchronized void A0W() {
        ArrayList A0D2;
        AnonymousClass1EU r0 = this.A19;
        AnonymousClass1EU.A00(r0);
        C24881Ed r2 = r0.A05;
        synchronized (r2) {
            r2.A04.A06("failReceiverPendingTransactions/failPendingTransactions");
            A0D2 = C24881Ed.A0D(r2, false);
        }
        A08(A0D2);
    }

    public synchronized void A0X() {
        ArrayList A0D2;
        AnonymousClass1EU r0 = this.A19;
        AnonymousClass1EU.A00(r0);
        C24881Ed r2 = r0.A05;
        synchronized (r2) {
            r2.A04.A06("PaymentTransactionStore/failReceiverPendingTransactions");
            A0D2 = C24881Ed.A0D(r2, true);
        }
        A08(A0D2);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00cc */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A0b(X.AnonymousClass11F r16, com.whatsapp.jid.UserJid r17) {
        /*
            r15 = this;
            monitor-enter(r15)
            X.1EU r0 = r15.A19     // Catch:{ all -> 0x0109 }
            X.AnonymousClass1EU.A00(r0)     // Catch:{ all -> 0x0109 }
            X.1Ed r5 = r0.A05     // Catch:{ all -> 0x0109 }
            boolean r0 = X.AnonymousClass143.A0G(r16)     // Catch:{ all -> 0x0109 }
            if (r0 == 0) goto L_0x0016
            X.6SZ r0 = com.whatsapp.jid.GroupJid.Companion     // Catch:{ all -> 0x0109 }
            com.whatsapp.jid.GroupJid r9 = X.AnonymousClass6SZ.A00(r16)     // Catch:{ all -> 0x0109 }
        L_0x0014:
            monitor-enter(r5)     // Catch:{ all -> 0x0109 }
            goto L_0x0018
        L_0x0016:
            r9 = 0
            goto L_0x0014
        L_0x0018:
            java.util.ArrayList r1 = r5.A0O()     // Catch:{ all -> 0x0106 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0106 }
            r4.<init>()     // Catch:{ all -> 0x0106 }
            X.12P r0 = r5.A03     // Catch:{ SQLiteDatabaseCorruptException -> 0x00cc }
            X.1M0 r6 = r0.A05()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00cc }
            X.71s r14 = r6.B1k()     // Catch:{ all -> 0x00c2 }
            java.util.Iterator r13 = r1.iterator()     // Catch:{ all -> 0x00b8 }
        L_0x002f:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x00ae
            java.lang.Object r10 = r13.next()     // Catch:{ all -> 0x00b8 }
            X.9lY r10 = (X.C202319lY) r10     // Catch:{ all -> 0x00b8 }
            if (r9 == 0) goto L_0x0059
            X.11F r0 = r10.A0C     // Catch:{ all -> 0x00b8 }
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x002f
            r1 = r17
            if (r17 == 0) goto L_0x002f
            com.whatsapp.jid.UserJid r0 = r10.A0E     // Catch:{ all -> 0x00b8 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00b8 }
            if (r0 != 0) goto L_0x0059
            com.whatsapp.jid.UserJid r0 = r10.A0D     // Catch:{ all -> 0x00b8 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x002f
        L_0x0059:
            X.1Dc r2 = r5.A04     // Catch:{ all -> 0x00b8 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b8 }
            r1.<init>()     // Catch:{ all -> 0x00b8 }
            java.lang.String r0 = "mark pending request as failed: "
            r1.append(r0)     // Catch:{ all -> 0x00b8 }
            java.lang.String r0 = r10.A0L     // Catch:{ all -> 0x00b8 }
            r1.append(r0)     // Catch:{ all -> 0x00b8 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00b8 }
            r2.A06(r0)     // Catch:{ all -> 0x00b8 }
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch:{ all -> 0x00b8 }
            r12.<init>()     // Catch:{ all -> 0x00b8 }
            java.lang.String r1 = r10.A0L     // Catch:{ all -> 0x00b8 }
            java.lang.String r0 = r10.A0K     // Catch:{ all -> 0x00b8 }
            android.util.Pair r11 = X.C24881Ed.A07(r1, r0)     // Catch:{ all -> 0x00b8 }
            java.lang.String r1 = "status"
            r0 = 13
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00b8 }
            r12.put(r1, r0)     // Catch:{ all -> 0x00b8 }
            java.lang.String r3 = "timestamp"
            X.0wo r0 = r5.A01     // Catch:{ all -> 0x00b8 }
            long r1 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x00b8 }
            r7 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r7
            int r0 = (int) r1     // Catch:{ all -> 0x00b8 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00b8 }
            r12.put(r3, r0)     // Catch:{ all -> 0x00b8 }
            X.C24881Ed.A0F(r12, r11, r6)     // Catch:{ all -> 0x00b8 }
            X.11F r3 = r10.A0C     // Catch:{ all -> 0x00b8 }
            boolean r2 = r10.A0Q     // Catch:{ all -> 0x00b8 }
            java.lang.String r1 = r10.A0L     // Catch:{ all -> 0x00b8 }
            X.3Qa r0 = new X.3Qa     // Catch:{ all -> 0x00b8 }
            r0.<init>(r3, r1, r2)     // Catch:{ all -> 0x00b8 }
            r4.add(r0)     // Catch:{ all -> 0x00b8 }
            goto L_0x002f
        L_0x00ae:
            r14.A00()     // Catch:{ all -> 0x00b8 }
            r14.close()     // Catch:{ all -> 0x00c2 }
            r6.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00cc }
            goto L_0x00d3
        L_0x00b8:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x00bd }
            goto L_0x00c1
        L_0x00bd:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00c2 }
        L_0x00c1:
            throw r1     // Catch:{ all -> 0x00c2 }
        L_0x00c2:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x00c7 }
            goto L_0x00cb
        L_0x00c7:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00cc }
        L_0x00cb:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x00cc }
        L_0x00cc:
            X.1Dc r1 = r5.A04     // Catch:{ all -> 0x0106 }
            java.lang.String r0 = "failPendingRequests failed."
            r1.A05(r0)     // Catch:{ all -> 0x0106 }
        L_0x00d3:
            monitor-exit(r5)     // Catch:{ all -> 0x0109 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0109 }
        L_0x00d8:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0109 }
            if (r0 == 0) goto L_0x0104
            java.lang.Object r1 = r4.next()     // Catch:{ all -> 0x0109 }
            X.3Qa r1 = (X.C64933Qa) r1     // Catch:{ all -> 0x0109 }
            X.1A1 r0 = r15.A1B     // Catch:{ all -> 0x0109 }
            X.3T1 r3 = r0.A03(r1)     // Catch:{ all -> 0x0109 }
            if (r3 == 0) goto L_0x00d8
            X.9lY r2 = r3.A0M     // Catch:{ all -> 0x0109 }
            if (r2 == 0) goto L_0x00d8
            r0 = 13
            r2.A02 = r0     // Catch:{ all -> 0x0109 }
            X.0wo r0 = r15.A0C     // Catch:{ all -> 0x0109 }
            long r0 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x0109 }
            r2.A06 = r0     // Catch:{ all -> 0x0109 }
            X.1DQ r1 = r15.A0T     // Catch:{ all -> 0x0109 }
            r0 = 16
            r1.A01(r3, r0)     // Catch:{ all -> 0x0109 }
            goto L_0x00d8
        L_0x0104:
            monitor-exit(r15)
            return
        L_0x0106:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0109 }
            throw r0     // Catch:{ all -> 0x0109 }
        L_0x0109:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20310xM.A0b(X.11F, com.whatsapp.jid.UserJid):void");
    }

    public void A0e(AnonymousClass11F r12, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("CoreMessageStore/deletemsgs/service/jid ");
        sb.append(r12);
        Log.i(sb.toString());
        Handler handler = this.A0T.A01;
        Message.obtain(handler, 1, r12.getRawString()).sendToTarget();
        AnonymousClass3B8 A032 = this.A0N.A03(r12, (Long) null, (List) null, true, z, false);
        if (A032 != null) {
            Message.obtain(handler, 2, r12.getRawString()).sendToTarget();
            this.A0J.A00(A032, "action_delete");
        }
    }

    public void A0o(AnonymousClass3T1 r2, int i, boolean z) {
        A0p(r2, i, z, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (X.AnonymousClass143.A0G(r2) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C600336f A00(X.C20310xM r16, X.AnonymousClass11F r17, int r18, long r19, long r21, boolean r23) {
        /*
            r14 = r19
            r13 = 0
            long r11 = android.os.SystemClock.uptimeMillis()
            r2 = r17
            boolean r0 = r2 instanceof X.C177618e5
            r10 = 1
            if (r0 != 0) goto L_0x0015
            boolean r0 = X.AnonymousClass143.A0G(r2)
            r9 = 1
            if (r0 == 0) goto L_0x0016
        L_0x0015:
            r9 = 0
        L_0x0016:
            r4 = 0
            r8 = 2
            r3 = 3
            int r0 = (r19 > r4 ? 1 : (r19 == r4 ? 0 : -1))
            r5 = r16
            if (r0 <= 0) goto L_0x00c8
            r6 = 1
            int r0 = (r19 > r6 ? 1 : (r19 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00c8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = X.AnonymousClass2xD.A0J
            r1.append(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r9 == 0) goto L_0x0040
            r0 = 8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.add(r0)
        L_0x0040:
            r0 = 87
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.add(r0)
            r0 = 88
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.add(r0)
            X.AnonymousClass17W.A01(r1, r4)
            java.lang.String r0 = " "
            r1.append(r0)
            java.lang.String r0 = " AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1) "
            r1.append(r0)
            java.lang.String r0 = " AND (view_mode IS NULL OR view_mode = 0) "
            r1.append(r0)
            java.lang.String r0 = " AND sort_id >= ?"
            r1.append(r0)
            if (r23 == 0) goto L_0x00b1
            java.lang.String r0 = " ORDER BY sort_id DESC"
        L_0x006d:
            r1.append(r0)
            java.lang.String r4 = r1.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "msgstore/messages "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            X.14g r6 = new X.14g
            r6.<init>((java.lang.String) r0)
            X.17U r0 = r5.A0l
            long r16 = r0.A04(r14)
            java.lang.String[] r3 = new java.lang.String[r3]
            X.163 r0 = r5.A0H
            long r0 = r0.A08(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3[r13] = r0
            java.lang.String r0 = java.lang.String.valueOf(r21)
            r3[r10] = r0
            java.lang.String r0 = java.lang.String.valueOf(r16)
            r3[r8] = r0
            X.12P r0 = r5.A0c
            X.1M0 r2 = r0.get()
            goto L_0x00b4
        L_0x00b1:
            java.lang.String r0 = " ORDER BY sort_id ASC"
            goto L_0x006d
        L_0x00b4:
            X.14e r1 = r2.A02     // Catch:{ all -> 0x00be }
            java.lang.String r0 = "GET_MESSAGES_FOR_JID_WITH_START_REF"
            android.database.Cursor r13 = r1.A09(r4, r0, r3)     // Catch:{ all -> 0x00be }
            goto L_0x017d
        L_0x00be:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x00c3 }
            throw r1
        L_0x00c3:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x00c8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = X.AnonymousClass2xD.A0J
            r1.append(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r9 == 0) goto L_0x00e2
            r0 = 8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.add(r0)
        L_0x00e2:
            r0 = 87
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.add(r0)
            r0 = 88
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.add(r0)
            X.AnonymousClass17W.A01(r1, r4)
            java.lang.String r0 = " "
            r1.append(r0)
            java.lang.String r0 = " AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1) "
            r1.append(r0)
            java.lang.String r0 = " AND (view_mode IS NULL OR view_mode = 0) "
            r1.append(r0)
            if (r23 == 0) goto L_0x0147
            java.lang.String r0 = " ORDER BY sort_id DESC"
        L_0x010a:
            r1.append(r0)
            java.lang.String r0 = " LIMIT ?"
            r1.append(r0)
            java.lang.String r4 = r1.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "msgstore/messages/indexed "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            X.14g r6 = new X.14g
            r6.<init>((java.lang.String) r0)
            java.lang.String[] r3 = new java.lang.String[r3]
            X.163 r0 = r5.A0H
            long r0 = r0.A08(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3[r13] = r0
            java.lang.String r0 = java.lang.String.valueOf(r21)
            r3[r10] = r0
            java.lang.String r0 = java.lang.String.valueOf(r18)
            r3[r8] = r0
            goto L_0x014a
        L_0x0147:
            java.lang.String r0 = " ORDER BY sort_id ASC"
            goto L_0x010a
        L_0x014a:
            X.12P r0 = r5.A0c     // Catch:{ all -> 0x019f }
            X.1M0 r2 = r0.get()     // Catch:{ all -> 0x019f }
            X.14e r1 = r2.A02     // Catch:{ all -> 0x0195 }
            java.lang.String r0 = "GET_MESSAGES_FOR_JID_NO_START_REF"
            android.database.Cursor r13 = r1.A09(r4, r0, r3)     // Catch:{ all -> 0x0195 }
            boolean r0 = r13.moveToLast()     // Catch:{ all -> 0x0195 }
            if (r0 == 0) goto L_0x0176
            java.lang.String r0 = "_id"
            int r0 = r13.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0195 }
            long r14 = r13.getLong(r0)     // Catch:{ all -> 0x0195 }
            java.lang.String r0 = "sort_id"
            int r0 = r13.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0195 }
            long r16 = r13.getLong(r0)     // Catch:{ all -> 0x0195 }
        L_0x0172:
            r13.moveToFirst()     // Catch:{ all -> 0x0195 }
            goto L_0x0179
        L_0x0176:
            r16 = -9223372036854775808
            goto L_0x0172
        L_0x0179:
            r2.close()     // Catch:{ all -> 0x019f }
            goto L_0x0180
        L_0x017d:
            r2.close()
        L_0x0180:
            r6.A01()
            X.12g r3 = r5.A0M
            long r1 = android.os.SystemClock.uptimeMillis()
            long r1 = r1 - r11
            java.lang.String r0 = "CoreMessageStore/getMessagesForJid"
            r3.A01(r0, r1)
            X.36f r12 = new X.36f
            r12.<init>(r13, r14, r16)
            return r12
        L_0x0195:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x019a }
            goto L_0x019e
        L_0x019a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x019f }
        L_0x019e:
            throw r1     // Catch:{ all -> 0x019f }
        L_0x019f:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20310xM.A00(X.0xM, X.11F, int, long, long, boolean):X.36f");
    }

    private void A01(long j) {
        int i;
        AnonymousClass19L r3 = this.A1i;
        if (AnonymousClass19L.A00(r3, 0, j) != null) {
            i = 5;
        } else {
            i = -1;
            if (AnonymousClass19L.A00(r3, 2, j) != null) {
                i = 4;
            }
        }
        C201579ju A012 = r3.A01(j);
        if (i != -1 && A012 != null) {
            A012.A04(i);
        }
    }

    public static void A02(C20310xM r7) {
        File A0H2 = r7.A05.A0H();
        A0J(A0H2);
        Uri contentUri = MediaStore.Files.getContentUri("external");
        C21050ya A0O2 = r7.A1N.A0O();
        if (A0O2 == null) {
            Log.w("CoreMessageStore/delete-all-media cr=null");
            return;
        }
        try {
            A0O2.A01(contentUri, "_data LIKE ?||'%'", new String[]{A0H2.getAbsolutePath()});
        } catch (IllegalArgumentException | SecurityException | UnsupportedOperationException e) {
            Log.e("CoreMessageStore/delete-all-media", e);
        }
    }

    public static void A03(C20310xM r9, AnonymousClass11F r10, String str, List list, boolean z, boolean z2) {
        AnonymousClass3B8 A032 = r9.A0N.A03(r10, Long.MIN_VALUE, list, true, z2, z);
        if (A032 == null) {
            return;
        }
        if (list == null) {
            r9.A0J.A00(A032, str);
            return;
        }
        C25201Fj r7 = r9.A0J;
        String valueOf = String.valueOf(r10.hashCode());
        C97384pE r6 = new C97384pE(ConversationDeleteWorker.class);
        AnonymousClass6EH r5 = new AnonymousClass6EH();
        Map map = r5.A00;
        map.put("delete_action", str);
        map.put("job_id", Long.valueOf(A032.A06));
        r6.A00.A0A = r5.A00();
        r6.A02((long) 4000, TimeUnit.MILLISECONDS);
        r6.A06(valueOf);
        ((AnonymousClass6VR) r7.A02.get()).A08(r6.A00());
    }

    public static void A04(C20310xM r5, UserJid userJid, AnonymousClass3T1 r7, boolean z) {
        if (!z) {
            C181158n1 A032 = r5.A0x.A03(userJid);
            C220412q r3 = r5.A0I;
            AnonymousClass185 r2 = r5.A0B;
            if (!(r7 instanceof C181158n1)) {
                C64933Qa r1 = r7.A1J;
                if (r1.A02) {
                    AnonymousClass11F r12 = r1.A00;
                    if ((r12 instanceof PhoneUserJid) && !r2.A04((UserJid) r12) && r7.A0f != null && r3.A09(r12, false) == null && A032 != null) {
                        r5.A1B.A04(A032);
                        r5.A0i(A032);
                    }
                }
            }
        }
    }

    public static void A06(C20310xM r9, C224214g r10) {
        AnonymousClass1M0 A052;
        AnonymousClass1M0 A053 = r9.A0c.A05();
        try {
            C1495671s B1k = A053.B1k();
            try {
                C224114e r3 = A053.A02;
                r3.A03("receipt_device", (String) null, "clearAllMessagesInDB/DELETE_RECEIPT_DEVICE", (String[]) null);
                r3.A03("receipt_user", (String) null, "clearAllMessagesInDB/DELETE_RECEIPT_USER", (String[]) null);
                r3.A03("receipt_orphaned", (String) null, "clearAllMessagesInDB/DELETE_RECEIPT_ORPHANED", (String[]) null);
                r10.A02("receipts tables");
                r3.A0D("UPDATE chat SET display_message_row_id=1, unseen_message_count = 0, unseen_missed_calls_count = 0, unseen_row_count = 0, unseen_earliest_message_received_time = 0", "UPDATE_ALL_LAST_MESSAGES_CHAT");
                r3.A03("media_refs", (String) null, "clearAllMessagesInDB/DELETE_MEDIA_REFS", (String[]) null);
                r3.A03("message_streaming_sidecar", (String) null, "clearAllMessagesInDB/DELETE_MESSAGE_STREAMING_SIDECAR", (String[]) null);
                r3.A03("message_thumbnail", (String) null, "clearAllMessagesInDB/DELETE_MESSAGE_THUMBNAIL", (String[]) null);
                r3.A03("message_media", (String) null, "clearAllMessagesInDB/DELETE_MESSAGE_MEDIA", (String[]) null);
                r10.A02("media tables");
                r3.A03("mms_thumbnail_metadata", (String) null, "clearAllMessagesInDB/DELETE_MMS_THUMBNAIL_METADATA", (String[]) null);
                r10.A02("mms thumbnail metadata tables");
                r3.A03("audio_data", (String) null, "clearAllMessagesInDB/DELETE_AUDIO_DATA", (String[]) null);
                r10.A02("audio data tables");
                AnonymousClass1FI r7 = r9.A0Q;
                A052 = r7.A03.A05();
                C224114e r5 = A052.A02;
                r5.A03("frequent", (String) null, "deleteAllFrequents/DELETE_FREQUENT", (String[]) null);
                r5.A03("frequents", (String) null, "deleteAllFrequents/DELETE_FREQUENTS_LEGACY", (String[]) null);
                A052.close();
                r3.A03("status", (String) null, "clearAllMessagesInDB/DELETE_STATUS_LIST_V2", (String[]) null);
                r7.A00 = new ConcurrentHashMap();
                r10.A02("frequent tables");
                r3.A03("message_ftsv2", (String) null, "clearAllMessagesInDB/DELETE_MESSAGE_FTS", (String[]) null);
                r10.A02("fts tables");
                r3.A03("message_send_count", (String) null, "clearAllMessagesInDB/DELETE_MESSAGE_SEND_COUNT", (String[]) null);
                r3.A03("message_location", (String) null, "clearAllMessagesInDB/DELETE_MESSAGE_LOCATION", (String[]) null);
                r3.A03("message_template", (String) null, "clearAllMessagesInDB/DELETE_MESSAGE_TEMPLATE", (String[]) null);
                r3.A03("message_template_button", (String) null, "clearAllMessagesInDB/DELETE_MESSAGE_TEMPLATE_BUTTON", (String[]) null);
                r3.A03("message_quoted", (String) null, "clearAllMessagesInDB/DELETE_MESSAGE_QUOTED", (String[]) null);
                r3.A03("message_mentions", (String) null, "clearAllMessagesInDB/DELETE_MESSAGE_MENTIONS", (String[]) null);
                r3.A03("message_product", (String) null, "clearAllMessagesInDB/DELETE_MESSAGE_PRODUCT", (String[]) null);
                r3.A03("message_link", (String) null, "clearAllMessagesInDB/DELETE_MESSAGE_LINK", (String[]) null);
                r3.A03("message_future", (String) null, "clearAllMessagesInDB/DELETE_MESSAGE_FUTURE", (String[]) null);
                r3.A03("message_system", (String) null, "clearAllMessagesInDB/DELETE_MESSAGE_SYSTEM", (String[]) null);
                r3.A03("message_text", (String) null, "clearAllMessagesInDB/DELETE_MESSAGE_TEXT", (String[]) null);
                r10.A02("extra data tables");
                r3.A0D("DELETE FROM message WHERE _id!=1", "CLEAR_ALL_MESSAGES_SQL");
                r10.A02("message table");
                B1k.A00();
                r10.A02("set transaction");
                B1k.close();
                A053.close();
                return;
            } catch (Throwable th) {
                B1k.close();
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            try {
                A053.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    private void A07(AnonymousClass3B8 r6) {
        List<Number> list = r6.A09;
        if (list != null) {
            for (Number longValue : list) {
                AnonymousClass1A1 r0 = this.A1B;
                AnonymousClass3T1 A012 = r0.A01.A01(longValue.longValue());
                if (A012 != null) {
                    this.A0W.A0C(A012.A1J);
                }
            }
        }
        if (r6.A04 != Long.MIN_VALUE) {
            this.A0W.A0A(r6.A07);
        }
    }

    public static boolean A0A(AnonymousClass185 r2, C220412q r3, C235518x r4, AnonymousClass3T1 r5) {
        C64933Qa r0 = r5.A1J;
        AnonymousClass11F r1 = r0.A00;
        if (r0.A02 || !(r1 instanceof PhoneUserJid) || r2.A04((UserJid) r1) || (r5 instanceof AnonymousClass2bH) || (r5 instanceof AnonymousClass2bY) || r3.A09(r1, false) != null || r5.A05 != 0 || !r4.A06() || C197029b1.A00(r1)) {
            return false;
        }
        return true;
    }

    public static boolean A0B(C220412q r4, AnonymousClass3T1 r5) {
        if (r5 instanceof C181158n1) {
            return false;
        }
        C64933Qa r1 = r5.A1J;
        if (!r1.A02) {
            return false;
        }
        AnonymousClass11F r2 = r1.A00;
        if (!(r2 instanceof PhoneUserJid) || r5.A0f == null) {
            return false;
        }
        int i = r5.A00;
        if ((i == 2 || i == 1) && r4.A09(r2, false) == null) {
            return true;
        }
        return false;
    }

    public static boolean A0C(C220412q r3, AnonymousClass3T1 r4) {
        C64933Qa r1 = r4.A1J;
        if (r1.A02 || (r4 instanceof AnonymousClass2bH) || (r4 instanceof AnonymousClass2bY)) {
            return false;
        }
        AnonymousClass11F r12 = r1.A00;
        if (!(r12 instanceof PhoneUserJid) || r3.A09(r12, false) != null || r4.A05 <= 0) {
            return false;
        }
        int i = r4.A00;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    public static boolean A0E(C20310xM r11, AnonymousClass3T1 r12) {
        StringBuilder sb;
        ContentValues contentValues;
        boolean z;
        boolean z2;
        C65073Qp r0;
        C64933Qa r8 = r12.A1J;
        AnonymousClass11F r7 = r8.A00;
        C18740tg.A06(r7);
        if (!(r7 instanceof C28981Uw) && !C66013Ui.A0e(r12) && !C66013Ui.A0c(r12)) {
            AnonymousClass17T r3 = r11.A0j;
            if (!r3.A08(r7)) {
                C220412q r1 = r11.A0I;
                boolean z3 = false;
                if (!(r1.A0R(r7) || (r0 = (C65073Qp) C220412q.A00(r1).get(r7)) == null || r0.A0N == 1)) {
                    z3 = true;
                }
                if (z3 || r12.A1J()) {
                    if (r3.A03(r7) == 1 && !(r7 instanceof C177638e7)) {
                        C18740tg.A06(r7);
                        AnonymousClass1FS r2 = r11.A0f;
                        C35701j7 r6 = new C35701j7(r11, r12, 0);
                        C65073Qp A092 = r2.A01.A09(r7, false);
                        if (A092 != null) {
                            sb.append("disabling plaintext chat; jid=");
                            sb.append(r7);
                            sb.append("; current=");
                            sb.append(A092.A00);
                            Log.i(sb.toString());
                            if (A092.A00 != 1) {
                                A092.A00 = 1;
                                AnonymousClass1M0 A052 = r2.A02.A05();
                                try {
                                    C1495671s B1k = A052.B1k();
                                    try {
                                        AnonymousClass163 r32 = r2.A00;
                                        synchronized (A092) {
                                            contentValues = new ContentValues(2);
                                            contentValues.put("plaintext_disabled", Integer.valueOf(A092.A00));
                                        }
                                        int A053 = r32.A05(contentValues, A092);
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("disabled plaintext chat; jid=");
                                        sb2.append(r7);
                                        sb2.append("; numRows=");
                                        sb2.append(A053);
                                        Log.i(sb2.toString());
                                        if (A053 > 0) {
                                            r6.run();
                                        }
                                        B1k.A00();
                                        B1k.close();
                                        A052.close();
                                        return false;
                                    } catch (Throwable th) {
                                        B1k.close();
                                        throw th;
                                    }
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
                        } else {
                            sb = new StringBuilder();
                            sb.append("missing chat info; jid=");
                            sb.append(r7);
                            Log.w(sb.toString());
                        }
                    }
                } else if (!AnonymousClass143.A0G(r7) || r11.A0S.A0C((GroupJid) r7)) {
                    if (r3.A03(r7) == 1) {
                        z = r11.A0z(r7, r12.A0l);
                    } else {
                        z = false;
                    }
                    boolean A0y2 = z | r11.A0y(r7);
                    C20500xf r9 = r11.A12;
                    C20810yC r62 = r11.A11;
                    AnonymousClass16D r22 = r11.A0A;
                    AnonymousClass12O r5 = r11.A0t;
                    C19730wQ r33 = r11.A07;
                    C19460v5 r13 = r11.A03;
                    if (r7 != null && !r8.A02) {
                        if ((r7 instanceof UserJid) && r13.A05()) {
                            r13.A02();
                            throw new NullPointerException("isCtwaUser");
                        } else if (!C66013Ui.A0V(r33, r12)) {
                            boolean z4 = false;
                            if (AnonymousClass3MX.A00(r22, r5, r62, r9, r7)) {
                                C238019x r34 = r11.A1A;
                                AnonymousClass5JB r63 = new AnonymousClass5JB(r34.A01.A02(r7, true), C19970wo.A00(r11.A0C));
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("Creating FMX card system message for chat: ");
                                sb3.append(r7);
                                Log.i(sb3.toString());
                                A05(r11, r63, -1);
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("CoreMessageStore/added contact info message; jid=");
                                sb4.append(r7);
                                Log.i(sb4.toString());
                                C45382Rd r14 = new C45382Rd();
                                r14.A04 = 6;
                                r14.A03 = 0;
                                AnonymousClass141 A082 = r22.A08(r7);
                                if (A082 != null && A082.A0C()) {
                                    z4 = true;
                                }
                                r14.A01 = Boolean.valueOf(z4);
                                r11.A13.Bly(r14);
                                C19420v0 r35 = r11.A0D;
                                Set A0p2 = r35.A0p("fmx_card_view_pending_chats");
                                A0p2.add(r7.toString());
                                C19420v0.A00(r35).putStringSet("fmx_card_view_pending_chats", A0p2).apply();
                                z2 = r11.A0R(r63, -1).A00;
                                return z2 | A0y2 | A0D(r11, r7, false, false);
                            }
                        }
                    }
                    z2 = false;
                    return z2 | A0y2 | A0D(r11, r7, false, false);
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0096, code lost:
        if (r1 != 2) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004a, code lost:
        r1 = r9.A0I;
        r2 = r3.A1J.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0F(X.C20310xM r9, X.AnonymousClass3T1 r10, long r11) {
        /*
            X.1Fl r5 = r9.A0P
            X.3Qa r4 = r10.A1J
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x00cf
            X.13z r7 = X.C223613z.A00
        L_0x000a:
            int r3 = r10.A1I
            r0 = 36
            if (r3 != r0) goto L_0x00be
            long r1 = r10.A0H
            r0 = r10
            X.2bH r0 = (X.AnonymousClass2bH) r0
            int r6 = r0.A00
        L_0x0017:
            X.19x r5 = r5.A07
            X.11F r3 = r4.A00
            X.13r r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r4 = X.C222813r.A00(r3)
            X.C18740tg.A06(r4)
            X.19w r3 = r5.A01
            r0 = 1
            X.3Qa r0 = r3.A02(r4, r0)
            X.2cF r3 = new X.2cF
            r3.<init>(r0, r1)
            r3.A00 = r6
            r3.A0q(r7)
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            r3.A15(r0)
            X.0yC r2 = r9.A11
            r1 = 4131(0x1023, float:5.789E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            r7 = 2
            r6 = 1
            if (r0 == 0) goto L_0x0098
            X.12q r1 = r9.A0I
            X.3Qa r0 = r3.A1J
            X.11F r2 = r0.A00
            r0 = 0
            X.3Qp r1 = r1.A09(r2, r0)
            if (r1 == 0) goto L_0x0098
            X.3un r0 = r1.A0b
            int r0 = r0.expiration
            if (r0 > 0) goto L_0x0067
            if (r0 != 0) goto L_0x0098
            int r0 = r10.A00
            if (r0 != r6) goto L_0x0098
            int r0 = r3.A00
            if (r0 <= 0) goto L_0x0098
        L_0x0067:
            boolean r0 = r2 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x0098
            X.18x r0 = r9.A0x
            boolean r0 = r0.A06()
            if (r0 != 0) goto L_0x0098
            java.lang.Long r8 = r10.A0f
            if (r8 == 0) goto L_0x0098
            X.C18740tg.A06(r8)
            long r4 = r8.longValue()
            X.3un r0 = r1.A0b
            long r1 = r0.ephemeralSettingTimestamp
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0098
            long r4 = r8.longValue()
            long r1 = r10.A0I
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0098
            int r1 = r10.A00
            if (r1 == r6) goto L_0x0099
            r0 = 2
            r7 = 1
            if (r1 == r0) goto L_0x0099
        L_0x0098:
            r7 = 0
        L_0x0099:
            r3.A00 = r7
            r2 = -1
            A05(r9, r3, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "CoreMessageStore/added ephemeral setting message; jid="
            r1.append(r0)
            X.3Qa r0 = r3.A1J
            X.11F r0 = r0.A00
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.34U r0 = r9.A0R(r3, r2)
            boolean r0 = r0.A00
            return r0
        L_0x00be:
            r0 = 77
            long r1 = r10.A0I
            if (r3 != r0) goto L_0x00cb
            r0 = r10
            X.2bY r0 = (X.AnonymousClass2bY) r0
            int r6 = r0.A00
            goto L_0x0017
        L_0x00cb:
            int r6 = r10.A05
            goto L_0x0017
        L_0x00cf:
            r7 = 0
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20310xM.A0F(X.0xM, X.3T1, long):boolean");
    }

    private boolean A0H(AnonymousClass3T1 r3, AnonymousClass3T1 r4) {
        this.A0W.A0C(r4.A1J);
        A0v(Collections.singleton(r4), 0);
        if (C183348qe.A04(r3)) {
            this.A1h.A08(C183348qe.A00(this.A14, r3));
        }
        this.A1h.A08(r3);
        return true;
    }

    public long A0K(long j) {
        Cursor A092;
        long j2 = -1;
        if (j < 0) {
            return -1;
        }
        AnonymousClass1M0 A042 = this.A0c.get();
        try {
            A092 = A042.A02.A09("SELECT timestamp FROM message_view WHERE chat_row_id = ? ORDER BY sort_id LIMIT 1", "GET_OLDEST_MESSAGE_TIMESTAMP_FOR_CHAT_ID", new String[]{Long.toString(j)});
            if (A092.moveToNext()) {
                j2 = A092.getLong(A092.getColumnIndexOrThrow("timestamp"));
            }
            A092.close();
            A042.close();
            return j2;
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

    public Cursor A0M(long j, long j2) {
        String[] strArr = {String.valueOf(j), String.valueOf(j2), String.valueOf(5000)};
        AnonymousClass1M0 A042 = this.A0c.get();
        try {
            Cursor A092 = A042.A02.A09(AnonymousClass2xD.A0K, "SELECT_MESSAGES_FOR_HISTORY_CHUNK_BY_VIEW_FOR_HOSTED_SYNC_SQL", strArr);
            A042.close();
            return A092;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public Cursor A0N(long j, long j2, long j3) {
        String[] strArr = {String.valueOf(j), String.valueOf(j2), String.valueOf(j3), String.valueOf(5000)};
        AnonymousClass1M0 A042 = this.A0c.get();
        try {
            Cursor A092 = A042.A02.A09(AnonymousClass2xD.A0L, "SELECT_MESSAGES_FOR_HISTORY_CHUNK_BY_VIEW_SQL", strArr);
            A042.close();
            return A092;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public AnonymousClass34U A0P(AnonymousClass3T1 r3) {
        int i = -1;
        if (r3.A1Y) {
            i = 22;
        }
        return A0Q(r3, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x025e, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x025f, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02ff, code lost:
        if (X.C20800yB.A01(X.C21000yV.A02, r0.A11, 4905) == false) goto L_0x0301;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0329, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:?, code lost:
        r3.addSuppressed(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009c, code lost:
        if (r2 < X.C19970wo.A00(r0.A0C)) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x05af, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x05b0, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0614, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0615, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0617, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x061a, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x061d, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x0687, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0688, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x068a, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x068b, code lost:
        if (r48 == 0) goto L_0x06ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:?, code lost:
        com.whatsapp.util.Log.w("CoreMessageStore/addmsg/will retry ", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:?, code lost:
        r22.close();
        android.os.SystemClock.elapsedRealtime();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x069a, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:?, code lost:
        r3 = new java.lang.StringBuilder();
        r3.append("CoreMessageStore/end transaction ");
        r3.append(r5);
        com.whatsapp.util.Log.e(r3.toString(), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x06c5, code lost:
        r5 = r0.A0R;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x06cb, code lost:
        if (r5.A0N() != false) goto L_0x06cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x06cd, code lost:
        r3 = r0.A1Y;
        r3.A04("fts_ready", java.lang.String.valueOf(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:?, code lost:
        r0 = A0T(r1, 0);
        r5.A0J();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x06e3, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:?, code lost:
        com.whatsapp.util.Log.e((java.lang.Throwable) r2);
        r0.A0b.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:?, code lost:
        com.whatsapp.util.Log.e(r4);
        r0.A0a.A00(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x06f8, code lost:
        com.whatsapp.util.Log.e(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x010d, code lost:
        if ((r2.A0I + (((long) r1.A05) * 1000)) >= r6) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x06fb, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x06fc, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x06fd, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:?, code lost:
        r3 = new java.lang.StringBuilder();
        r3.append("CoreMessageStore/addmsg duplicate ");
        r3.append(r7.A01);
        r3.append(" ");
        com.whatsapp.util.Log.i(r3.toString(), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x071d, code lost:
        if (r1.A0S() != null) goto L_0x071f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x071f, code lost:
        r1.A0F = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:?, code lost:
        r22.close();
        android.os.SystemClock.elapsedRealtime();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x072b, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:?, code lost:
        r3 = new java.lang.StringBuilder();
        r3.append("CoreMessageStore/end transaction ");
        r3.append(r5);
        com.whatsapp.util.Log.e(r3.toString(), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0758, code lost:
        r5 = r0.A0R;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x075e, code lost:
        if (r5.A0N() != false) goto L_0x0760;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0760, code lost:
        r3 = r0.A1Y;
        r3.A04("fts_ready", java.lang.String.valueOf(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:?, code lost:
        r0 = A0T(r1, 0);
        r5.A0J();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x0776, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:?, code lost:
        com.whatsapp.util.Log.e((java.lang.Throwable) r2);
        r0.A0b.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x0781, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x0782, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:?, code lost:
        com.whatsapp.util.Log.e((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:?, code lost:
        r22.close();
        android.os.SystemClock.elapsedRealtime();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x078d, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:?, code lost:
        r3 = new java.lang.StringBuilder();
        r3.append("CoreMessageStore/end transaction ");
        r3.append(r5);
        com.whatsapp.util.Log.e(r3.toString(), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x07ba, code lost:
        r5 = r0.A0R;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x07c0, code lost:
        if (r5.A0N() != false) goto L_0x07c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x07c2, code lost:
        r3 = r0.A1Y;
        r3.A04("fts_ready", java.lang.String.valueOf(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:?, code lost:
        r0 = A0T(r1, 0);
        r5.A0J();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x07d8, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:?, code lost:
        com.whatsapp.util.Log.e((java.lang.Throwable) r2);
        r0.A0b.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x08c4, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:?, code lost:
        r22.close();
        android.os.SystemClock.elapsedRealtime();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x08cc, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:?, code lost:
        r3 = new java.lang.StringBuilder();
        r3.append("CoreMessageStore/end transaction ");
        r3.append(r5);
        com.whatsapp.util.Log.e(r3.toString(), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x08f9, code lost:
        r5 = r0.A0R;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x08ff, code lost:
        if (r5.A0N() != false) goto L_0x0901;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x0901, code lost:
        r3 = r0.A1Y;
        r3.A04("fts_ready", java.lang.String.valueOf(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:?, code lost:
        r0 = A0T(r1, 0);
        r5.A0J();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x091b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:?, code lost:
        com.whatsapp.util.Log.e((java.lang.Throwable) r1);
        r0.A0b.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01a8, code lost:
        if (r4 != false) goto L_0x01aa;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x035b A[Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x0614, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d, all -> 0x08c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0391 A[SYNTHETIC, Splitter:B:197:0x0391] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x03ab A[SYNTHETIC, Splitter:B:201:0x03ab] */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x03c9 A[Catch:{ all -> 0x0329, IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }] */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x04e8 A[SYNTHETIC, Splitter:B:244:0x04e8] */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x0585 A[SYNTHETIC, Splitter:B:284:0x0585] */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0595 A[SYNTHETIC, Splitter:B:292:0x0595] */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x0617 A[ExcHandler: SQLiteConstraintException (e android.database.sqlite.SQLiteConstraintException), PHI: r9 r41 r42 
      PHI: (r9v15 int) = (r9v17 int), (r9v17 int), (r9v17 int), (r9v17 int), (r9v17 int), (r9v17 int), (r9v17 int), (r9v17 int), (r9v17 int), (r9v17 int), (r9v17 int), (r9v17 int), (r9v19 int), (r9v19 int), (r9v19 int), (r9v19 int) binds: [B:173:0x032f, B:281:0x056a, B:289:0x0591, B:292:0x0595, B:284:0x0585, B:244:0x04e8, B:247:0x04ec, B:242:0x04e7, B:243:?, B:201:0x03ab, B:197:0x0391, B:186:0x035d, B:144:0x02f1, B:169:0x032a, B:156:0x0316, B:157:?] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r41v11 boolean) = (r41v0 boolean), (r41v15 boolean), (r41v15 boolean), (r41v15 boolean), (r41v15 boolean), (r41v0 boolean), (r41v0 boolean), (r41v0 boolean), (r41v0 boolean), (r41v0 boolean), (r41v0 boolean), (r41v0 boolean), (r41v0 boolean), (r41v0 boolean), (r41v0 boolean), (r41v0 boolean) binds: [B:173:0x032f, B:281:0x056a, B:289:0x0591, B:292:0x0595, B:284:0x0585, B:244:0x04e8, B:247:0x04ec, B:242:0x04e7, B:243:?, B:201:0x03ab, B:197:0x0391, B:186:0x035d, B:144:0x02f1, B:169:0x032a, B:156:0x0316, B:157:?] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r42v11 boolean) = (r42v0 boolean), (r42v15 boolean), (r42v15 boolean), (r42v15 boolean), (r42v15 boolean), (r42v0 boolean), (r42v0 boolean), (r42v0 boolean), (r42v0 boolean), (r42v0 boolean), (r42v0 boolean), (r42v0 boolean), (r42v0 boolean), (r42v0 boolean), (r42v0 boolean), (r42v0 boolean) binds: [B:173:0x032f, B:281:0x056a, B:289:0x0591, B:292:0x0595, B:284:0x0585, B:244:0x04e8, B:247:0x04ec, B:242:0x04e7, B:243:?, B:201:0x03ab, B:197:0x0391, B:186:0x035d, B:144:0x02f1, B:169:0x032a, B:156:0x0316, B:157:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:144:0x02f1] */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x061a A[ExcHandler: IOException (e java.io.IOException), PHI: r9 r41 r42 
      PHI: (r9v14 int) = (r9v17 int), (r9v17 int), (r9v17 int), (r9v17 int), (r9v17 int), (r9v17 int), (r9v17 int), (r9v17 int), (r9v17 int), (r9v17 int), (r9v17 int), (r9v17 int), (r9v19 int), (r9v19 int), (r9v19 int), (r9v19 int) binds: [B:173:0x032f, B:281:0x056a, B:289:0x0591, B:292:0x0595, B:284:0x0585, B:244:0x04e8, B:247:0x04ec, B:242:0x04e7, B:243:?, B:201:0x03ab, B:197:0x0391, B:186:0x035d, B:144:0x02f1, B:169:0x032a, B:156:0x0316, B:157:?] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r41v10 boolean) = (r41v0 boolean), (r41v15 boolean), (r41v15 boolean), (r41v15 boolean), (r41v15 boolean), (r41v0 boolean), (r41v0 boolean), (r41v0 boolean), (r41v0 boolean), (r41v0 boolean), (r41v0 boolean), (r41v0 boolean), (r41v0 boolean), (r41v0 boolean), (r41v0 boolean), (r41v0 boolean) binds: [B:173:0x032f, B:281:0x056a, B:289:0x0591, B:292:0x0595, B:284:0x0585, B:244:0x04e8, B:247:0x04ec, B:242:0x04e7, B:243:?, B:201:0x03ab, B:197:0x0391, B:186:0x035d, B:144:0x02f1, B:169:0x032a, B:156:0x0316, B:157:?] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r42v10 boolean) = (r42v0 boolean), (r42v15 boolean), (r42v15 boolean), (r42v15 boolean), (r42v15 boolean), (r42v0 boolean), (r42v0 boolean), (r42v0 boolean), (r42v0 boolean), (r42v0 boolean), (r42v0 boolean), (r42v0 boolean), (r42v0 boolean), (r42v0 boolean), (r42v0 boolean), (r42v0 boolean) binds: [B:173:0x032f, B:281:0x056a, B:289:0x0591, B:292:0x0595, B:284:0x0585, B:244:0x04e8, B:247:0x04ec, B:242:0x04e7, B:243:?, B:201:0x03ab, B:197:0x0391, B:186:0x035d, B:144:0x02f1, B:169:0x032a, B:156:0x0316, B:157:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:144:0x02f1] */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x061d A[ExcHandler: Error | RuntimeException (e java.lang.Throwable), Splitter:B:108:0x023a] */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x0687 A[ExcHandler: SQLiteDiskIOException (e android.database.sqlite.SQLiteDiskIOException), Splitter:B:108:0x023a] */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x068a A[ExcHandler: SQLiteDiskIOException (e android.database.sqlite.SQLiteDiskIOException), PHI: r9 r41 r42 
      PHI: (r9v13 int) = (r9v17 int), (r9v17 int), (r9v17 int), (r9v17 int), (r9v17 int), (r9v17 int), (r9v17 int), (r9v17 int), (r9v17 int), (r9v17 int), (r9v17 int), (r9v17 int), (r9v19 int), (r9v19 int), (r9v19 int), (r9v19 int) binds: [B:173:0x032f, B:281:0x056a, B:289:0x0591, B:292:0x0595, B:284:0x0585, B:244:0x04e8, B:247:0x04ec, B:242:0x04e7, B:243:?, B:201:0x03ab, B:197:0x0391, B:186:0x035d, B:144:0x02f1, B:169:0x032a, B:156:0x0316, B:157:?] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r41v9 boolean) = (r41v0 boolean), (r41v15 boolean), (r41v15 boolean), (r41v15 boolean), (r41v15 boolean), (r41v0 boolean), (r41v0 boolean), (r41v0 boolean), (r41v0 boolean), (r41v0 boolean), (r41v0 boolean), (r41v0 boolean), (r41v0 boolean), (r41v0 boolean), (r41v0 boolean), (r41v0 boolean) binds: [B:173:0x032f, B:281:0x056a, B:289:0x0591, B:292:0x0595, B:284:0x0585, B:244:0x04e8, B:247:0x04ec, B:242:0x04e7, B:243:?, B:201:0x03ab, B:197:0x0391, B:186:0x035d, B:144:0x02f1, B:169:0x032a, B:156:0x0316, B:157:?] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r42v9 boolean) = (r42v0 boolean), (r42v15 boolean), (r42v15 boolean), (r42v15 boolean), (r42v15 boolean), (r42v0 boolean), (r42v0 boolean), (r42v0 boolean), (r42v0 boolean), (r42v0 boolean), (r42v0 boolean), (r42v0 boolean), (r42v0 boolean), (r42v0 boolean), (r42v0 boolean), (r42v0 boolean) binds: [B:173:0x032f, B:281:0x056a, B:289:0x0591, B:292:0x0595, B:284:0x0585, B:244:0x04e8, B:247:0x04ec, B:242:0x04e7, B:243:?, B:201:0x03ab, B:197:0x0391, B:186:0x035d, B:144:0x02f1, B:169:0x032a, B:156:0x0316, B:157:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:144:0x02f1] */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x068d  */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x06ee A[SYNTHETIC, Splitter:B:377:0x06ee] */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x06fc A[ExcHandler: SQLiteConstraintException (e android.database.sqlite.SQLiteConstraintException), Splitter:B:108:0x023a] */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x071f A[Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x0614, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d, all -> 0x08c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:407:0x0781 A[ExcHandler: IOException (e java.io.IOException), Splitter:B:108:0x023a] */
    /* JADX WARNING: Removed duplicated region for block: B:441:0x080c  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:329:0x0623=Splitter:B:329:0x0623, B:409:0x0783=Splitter:B:409:0x0783, B:383:0x06fe=Splitter:B:383:0x06fe} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C64653Ox A0T(X.AnonymousClass3T1 r47, int r48) {
        /*
            r46 = this;
            java.lang.String r19 = "SQL logic error or missing database"
            java.lang.String r21 = "CoreMessageStore/end transaction "
            java.lang.String r23 = " "
            java.lang.String r18 = "fts_ready"
            r1 = r47
            X.3Qa r7 = r1.A1J
            X.11F r10 = r7.A00
            boolean r4 = r10 instanceof X.C177528dw
            r0 = r46
            if (r4 == 0) goto L_0x0062
            X.16E r2 = r0.A0o
            boolean r2 = r2.A0I(r1)
            java.lang.String r5 = " timestamp:"
            if (r2 == 0) goto L_0x0075
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "CoreMessageStore/statusexpired/"
            r2.append(r0)
            r2.append(r7)
            r2.append(r5)
            long r0 = r1.A0I
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = 0
            r5 = 1
            X.3Ox r0 = new X.3Ox
            r2 = 0
            r3 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L_0x0045:
            long r5 = r1.A0I
            r11 = 86400000(0x5265c00, double:4.2687272E-316)
            long r5 = r5 + r11
            int r11 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r11 >= 0) goto L_0x0062
            X.0wo r2 = r0.A0C
            long r2 = X.C19970wo.A00(r2)
            r5 = 604800000(0x240c8400, double:2.988109026E-315)
            long r2 = r2 + r5
            r8.A0B = r2
            java.util.List r2 = java.util.Collections.singletonList(r8)
            r9.A0k(r2)
        L_0x0062:
            boolean r8 = r7.A02
            if (r8 == 0) goto L_0x00e0
            X.0wN r6 = r0.A04
            X.0wQ r5 = r0.A07
            X.12q r3 = r0.A0I
            X.17X r2 = r0.A0S
            boolean r2 = X.C66013Ui.A0N(r6, r5, r3, r2, r1)
            if (r2 != 0) goto L_0x00e0
            goto L_0x00dd
        L_0x0075:
            boolean r2 = r7.A02
            if (r2 != 0) goto L_0x0062
            X.11F r2 = r1.A0J()
            boolean r2 = r2 instanceof X.C177638e7
            if (r2 != 0) goto L_0x0062
            X.16D r9 = r0.A0A
            com.whatsapp.jid.UserJid r2 = r1.A0L()
            X.141 r8 = r9.A08(r2)
            if (r8 == 0) goto L_0x009e
            X.3IL r6 = r8.A0F
            long r2 = r8.A0B
            if (r6 != 0) goto L_0x0045
            X.0wo r0 = r0.A0C
            long r9 = X.C19970wo.A00(r0)
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            r3 = 1
            if (r0 >= 0) goto L_0x009f
        L_0x009e:
            r3 = 0
        L_0x009f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "CoreMessageStore/status-from-unknown/ id:"
            r2.append(r0)
            java.lang.String r0 = r7.A01
            r2.append(r0)
            java.lang.String r0 = " from:"
            r2.append(r0)
            com.whatsapp.jid.UserJid r0 = r1.A0L()
            r2.append(r0)
            r2.append(r5)
            long r0 = r1.A0I
            r2.append(r0)
            java.lang.String r0 = " cached:"
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = " contact-is-null:"
            r2.append(r0)
            r0 = 0
            if (r8 != 0) goto L_0x00d3
            r0 = 1
        L_0x00d3:
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x00dd:
            X.3Ox r0 = X.C64653Ox.A05
            return r0
        L_0x00e0:
            boolean r2 = r1.A1G()
            r41 = 0
            r42 = 0
            r16 = 0
            if (r2 == 0) goto L_0x0131
            X.1A1 r2 = r0.A1B
            X.3T1 r2 = r2.A03(r7)
            if (r2 == 0) goto L_0x011a
            r8 = 1
            X.0wo r0 = r0.A0C
            long r6 = X.C19970wo.A00(r0)
            boolean r0 = r1.A1G()
            if (r0 == 0) goto L_0x010f
            long r4 = r2.A0I
            int r0 = r1.A05
            long r2 = (long) r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            long r4 = r4 + r2
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r9 = 1
            if (r0 < 0) goto L_0x0110
        L_0x010f:
            r9 = 0
        L_0x0110:
            X.3Ox r0 = new X.3Ox
            r5 = 0
            r6 = 0
            r7 = 0
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            return r0
        L_0x011a:
            X.0wo r2 = r0.A0C
            long r2 = X.C19970wo.A00(r2)
            boolean r2 = X.C66013Ui.A0v(r1, r2)
            if (r2 == 0) goto L_0x0131
            r5 = 1
            X.3Ox r0 = new X.3Ox
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L_0x0131:
            if (r8 != 0) goto L_0x015e
            X.3T1 r2 = r1.A0S()
            if (r2 == 0) goto L_0x015e
            X.1A1 r3 = r0.A1B
            X.3Qa r2 = r2.A1J
            X.3T1 r3 = r3.A03(r2)
            if (r3 == 0) goto L_0x015e
            boolean r2 = X.C66013Ui.A0n(r3)
            if (r2 != 0) goto L_0x015e
            int r5 = r3.A1I
            r2 = 12
            if (r5 == r2) goto L_0x015e
            r2 = 90
            if (r5 == r2) goto L_0x015e
            boolean r2 = X.C203359nq.A0C(r1)
            if (r2 != 0) goto L_0x015e
            X.1FO r2 = r0.A1k
            r2.A00(r1, r3)
        L_0x015e:
            X.3T1 r2 = r1.A0S()
            if (r2 == 0) goto L_0x0172
            X.1EU r2 = r0.A19
            X.AnonymousClass1EU.A00(r2)
            X.1Ed r3 = r2.A05
            X.3T1 r2 = r1.A0S()
            r3.A0X(r2)
        L_0x0172:
            X.3T1 r5 = r1.A0S()
            boolean r2 = r5 instanceof X.C46962bx
            if (r2 == 0) goto L_0x019f
            r2 = r5
            X.2bU r2 = (X.AnonymousClass2bU) r2
            X.3Qj r2 = r2.A01
            if (r2 == 0) goto L_0x019f
            java.io.File r2 = r2.A0I
            if (r2 != 0) goto L_0x019f
            X.1A1 r3 = r0.A1B
            X.3Qa r2 = r5.A1J
            X.3T1 r3 = r3.A03(r2)
            boolean r2 = r3 instanceof X.C46962bx
            if (r2 == 0) goto L_0x0229
            X.2bU r3 = (X.AnonymousClass2bU) r3
            X.3Qj r3 = r3.A01
            if (r3 == 0) goto L_0x019f
            X.3T1 r2 = r1.A0S()
            X.2bU r2 = (X.AnonymousClass2bU) r2
            r2.A01 = r3
        L_0x019f:
            boolean r11 = X.AnonymousClass143.A0G(r10)
            boolean r9 = r10 instanceof X.C177618e5
            if (r9 == 0) goto L_0x01aa
            r5 = 1
            if (r4 == 0) goto L_0x01ab
        L_0x01aa:
            r5 = 0
        L_0x01ab:
            if (r11 == 0) goto L_0x01d1
            boolean r2 = r1 instanceof X.AnonymousClass2bI
            if (r2 != 0) goto L_0x01d1
            X.11F r2 = r1.A0J()
            if (r2 != 0) goto L_0x01d1
            if (r8 != 0) goto L_0x01d1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "CoreMessageStore/addmsg/error/group/remote_resource is null! "
            r3.append(r2)
            java.lang.String r2 = X.C66013Ui.A0F(r1)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.e((java.lang.String) r2)
        L_0x01d1:
            X.005 r2 = r0.A1F
            java.lang.Object r2 = r2.get()
            X.1HX r2 = (X.AnonymousClass1HX) r2
            boolean r6 = r2.A06(r1)
            if (r11 != 0) goto L_0x01f3
            if (r5 != 0) goto L_0x01f3
            if (r6 == 0) goto L_0x01ea
            boolean r2 = r10 instanceof com.whatsapp.jid.UserJid
            if (r2 == 0) goto L_0x01ea
            r2 = 2
            r1.A0B = r2
        L_0x01ea:
            X.12P r2 = r0.A0c
            r45 = r2
            X.1M0 r17 = r45.A05()
            goto L_0x0230
        L_0x01f3:
            X.17X r2 = r0.A0S
            r3 = r10
            X.144 r3 = (X.AnonymousClass144) r3
            X.17r r2 = r2.A07
            X.6X6 r5 = r2.A0C(r3)
            X.19l r2 = r0.A1f
            X.0v0 r2 = r2.A01
            boolean r2 = r2.A2H()
            if (r2 != 0) goto L_0x020e
            java.lang.String r2 = r5.A0D()
            r1.A0s = r2
        L_0x020e:
            if (r8 == 0) goto L_0x0214
            boolean r2 = r1.A1Y
            if (r2 != 0) goto L_0x01ea
        L_0x0214:
            java.util.Map r2 = r5.A08
            int r3 = r2.size()
            int r3 = r3 + r6
            if (r11 == 0) goto L_0x0222
            r2 = 1
        L_0x021e:
            int r3 = r3 - r2
            r1.A0B = r3
            goto L_0x01ea
        L_0x0222:
            X.0wQ r2 = r0.A07
            boolean r2 = r5.A0O(r2)
            goto L_0x021e
        L_0x0229:
            java.lang.String r2 = "CoreMessageStore/addmsg/background/error fetching quoted sticker message"
            com.whatsapp.util.Log.e((java.lang.String) r2)
            goto L_0x019f
        L_0x0230:
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0930 }
            X.71s r22 = r17.B1k()     // Catch:{ all -> 0x0930 }
            r5 = r48
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x0781, SQLiteConstraintException -> 0x06fc, SQLiteDiskIOException -> 0x0687, SQLiteDatabaseCorruptException -> 0x0620, Error | RuntimeException -> 0x061d }
            long r2 = r2 - r11
            r11 = 60000(0xea60, double:2.9644E-319)
            int r6 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r6 <= 0) goto L_0x0262
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0781, SQLiteConstraintException -> 0x06fc, SQLiteDiskIOException -> 0x0687, SQLiteDatabaseCorruptException -> 0x025e, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            r11.<init>()     // Catch:{ IOException -> 0x0781, SQLiteConstraintException -> 0x06fc, SQLiteDiskIOException -> 0x0687, SQLiteDatabaseCorruptException -> 0x025e, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            java.lang.String r6 = "CoreMessageStore/addmsg/background/transaction-delayed "
            r11.append(r6)     // Catch:{ IOException -> 0x0781, SQLiteConstraintException -> 0x06fc, SQLiteDiskIOException -> 0x0687, SQLiteDatabaseCorruptException -> 0x025e, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            r12 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r12
            r11.append(r2)     // Catch:{ IOException -> 0x0781, SQLiteConstraintException -> 0x06fc, SQLiteDiskIOException -> 0x0687, SQLiteDatabaseCorruptException -> 0x025e, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            java.lang.String r2 = r11.toString()     // Catch:{ IOException -> 0x0781, SQLiteConstraintException -> 0x06fc, SQLiteDiskIOException -> 0x0687, SQLiteDatabaseCorruptException -> 0x025e, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            com.whatsapp.util.Log.w((java.lang.String) r2)     // Catch:{ IOException -> 0x0781, SQLiteConstraintException -> 0x06fc, SQLiteDiskIOException -> 0x0687, SQLiteDatabaseCorruptException -> 0x025e, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            goto L_0x0262
        L_0x025e:
            r2 = move-exception
            r9 = 0
            goto L_0x05b0
        L_0x0262:
            if (r9 == 0) goto L_0x02eb
            if (r8 == 0) goto L_0x02eb
            int r3 = r1.A0D     // Catch:{ IOException -> 0x0781, SQLiteConstraintException -> 0x06fc, SQLiteDiskIOException -> 0x0687, SQLiteDatabaseCorruptException -> 0x0620, Error | RuntimeException -> 0x061d }
            if (r3 == 0) goto L_0x026d
            r2 = 2
            if (r3 != r2) goto L_0x02eb
        L_0x026d:
            if (r4 != 0) goto L_0x02eb
            r2 = 1
            r1.A10 = r2     // Catch:{ IOException -> 0x0781, SQLiteConstraintException -> 0x06fc, SQLiteDiskIOException -> 0x0687, SQLiteDatabaseCorruptException -> 0x0620, Error | RuntimeException -> 0x061d }
            java.util.List r12 = r1.A0e()     // Catch:{ IOException -> 0x0781, SQLiteConstraintException -> 0x06fc, SQLiteDiskIOException -> 0x0687, SQLiteDatabaseCorruptException -> 0x0620, Error | RuntimeException -> 0x061d }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ IOException -> 0x0781, SQLiteConstraintException -> 0x06fc, SQLiteDiskIOException -> 0x0687, SQLiteDatabaseCorruptException -> 0x0620, Error | RuntimeException -> 0x061d }
            r6.<init>()     // Catch:{ IOException -> 0x0781, SQLiteConstraintException -> 0x06fc, SQLiteDiskIOException -> 0x0687, SQLiteDatabaseCorruptException -> 0x0620, Error | RuntimeException -> 0x061d }
            X.C18740tg.A06(r12)     // Catch:{ IOException -> 0x0781, SQLiteConstraintException -> 0x06fc, SQLiteDiskIOException -> 0x0687, SQLiteDatabaseCorruptException -> 0x0620, Error | RuntimeException -> 0x061d }
            java.util.Iterator r11 = r12.iterator()     // Catch:{ IOException -> 0x0781, SQLiteConstraintException -> 0x06fc, SQLiteDiskIOException -> 0x0687, SQLiteDatabaseCorruptException -> 0x0620, Error | RuntimeException -> 0x061d }
        L_0x0282:
            boolean r2 = r11.hasNext()     // Catch:{ IOException -> 0x0781, SQLiteConstraintException -> 0x06fc, SQLiteDiskIOException -> 0x0687, SQLiteDatabaseCorruptException -> 0x0620, Error | RuntimeException -> 0x061d }
            if (r2 == 0) goto L_0x02ce
            java.lang.Object r9 = r11.next()     // Catch:{ IOException -> 0x0781, SQLiteConstraintException -> 0x06fc, SQLiteDiskIOException -> 0x0687, SQLiteDatabaseCorruptException -> 0x0620, Error | RuntimeException -> 0x061d }
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9     // Catch:{ IOException -> 0x0781, SQLiteConstraintException -> 0x06fc, SQLiteDiskIOException -> 0x0687, SQLiteDatabaseCorruptException -> 0x0620, Error | RuntimeException -> 0x061d }
            long r2 = r1.A0I     // Catch:{ IOException -> 0x0781, SQLiteConstraintException -> 0x06fc, SQLiteDiskIOException -> 0x0687, SQLiteDatabaseCorruptException -> 0x0620, Error | RuntimeException -> 0x061d }
            r24 = r0
            r25 = r9
            r26 = r1
            r27 = r6
            r28 = r2
            X.3T1 r3 = r24.A0V(r25, r26, r27, r28)     // Catch:{ IOException -> 0x0781, SQLiteConstraintException -> 0x06fc, SQLiteDiskIOException -> 0x0687, SQLiteDatabaseCorruptException -> 0x0620, Error | RuntimeException -> 0x061d }
            X.17T r2 = r0.A0j     // Catch:{ IOException -> 0x0781, SQLiteConstraintException -> 0x06fc, SQLiteDiskIOException -> 0x0687, SQLiteDatabaseCorruptException -> 0x0620, Error | RuntimeException -> 0x061d }
            boolean r2 = r2.A08(r9)     // Catch:{ IOException -> 0x0781, SQLiteConstraintException -> 0x06fc, SQLiteDiskIOException -> 0x0687, SQLiteDatabaseCorruptException -> 0x0620, Error | RuntimeException -> 0x061d }
            A0E(r0, r3)     // Catch:{ IOException -> 0x0781, SQLiteConstraintException -> 0x06fc, SQLiteDiskIOException -> 0x0687, SQLiteDatabaseCorruptException -> 0x0620, Error | RuntimeException -> 0x061d }
            A04(r0, r9, r3, r2)     // Catch:{ IOException -> 0x0781, SQLiteConstraintException -> 0x06fc, SQLiteDiskIOException -> 0x0687, SQLiteDatabaseCorruptException -> 0x0620, Error | RuntimeException -> 0x061d }
            X.0v5 r9 = r0.A02     // Catch:{ IOException -> 0x0781, SQLiteConstraintException -> 0x06fc, SQLiteDiskIOException -> 0x0687, SQLiteDatabaseCorruptException -> 0x0620, Error | RuntimeException -> 0x061d }
            boolean r2 = r9.A05()     // Catch:{ IOException -> 0x0781, SQLiteConstraintException -> 0x06fc, SQLiteDiskIOException -> 0x0687, SQLiteDatabaseCorruptException -> 0x0620, Error | RuntimeException -> 0x061d }
            if (r2 == 0) goto L_0x02c5
            r2 = 2097152(0x200000, float:2.938736E-39)
            boolean r2 = r3.A1T(r2)     // Catch:{ IOException -> 0x0781, SQLiteConstraintException -> 0x06fc, SQLiteDiskIOException -> 0x0687, SQLiteDatabaseCorruptException -> 0x0620, Error | RuntimeException -> 0x061d }
            if (r2 == 0) goto L_0x02c5
            r9.A02()     // Catch:{ IOException -> 0x0781, SQLiteConstraintException -> 0x06fc, SQLiteDiskIOException -> 0x0687, SQLiteDatabaseCorruptException -> 0x0620, Error | RuntimeException -> 0x061d }
            java.lang.String r3 = "hasPlaceholder"
            java.lang.NullPointerException r2 = new java.lang.NullPointerException     // Catch:{ IOException -> 0x0781, SQLiteConstraintException -> 0x06fc, SQLiteDiskIOException -> 0x0687, SQLiteDatabaseCorruptException -> 0x0620, Error | RuntimeException -> 0x061d }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0781, SQLiteConstraintException -> 0x06fc, SQLiteDiskIOException -> 0x0687, SQLiteDatabaseCorruptException -> 0x0620, Error | RuntimeException -> 0x061d }
            throw r2     // Catch:{ IOException -> 0x0781, SQLiteConstraintException -> 0x06fc, SQLiteDiskIOException -> 0x0687, SQLiteDatabaseCorruptException -> 0x0620, Error | RuntimeException -> 0x061d }
        L_0x02c5:
            X.1A1 r2 = r0.A1B     // Catch:{ IOException -> 0x0781, SQLiteConstraintException -> 0x06fc, SQLiteDiskIOException -> 0x0687, SQLiteDatabaseCorruptException -> 0x0620, Error | RuntimeException -> 0x061d }
            r2.A04(r3)     // Catch:{ IOException -> 0x0781, SQLiteConstraintException -> 0x06fc, SQLiteDiskIOException -> 0x0687, SQLiteDatabaseCorruptException -> 0x0620, Error | RuntimeException -> 0x061d }
            r0.A0i(r3)     // Catch:{ IOException -> 0x0781, SQLiteConstraintException -> 0x06fc, SQLiteDiskIOException -> 0x0687, SQLiteDatabaseCorruptException -> 0x0620, Error | RuntimeException -> 0x061d }
            goto L_0x0282
        L_0x02ce:
            int r3 = r12.size()     // Catch:{ IOException -> 0x0781, SQLiteConstraintException -> 0x06fc, SQLiteDiskIOException -> 0x0687, SQLiteDatabaseCorruptException -> 0x0620, Error | RuntimeException -> 0x061d }
            int r2 = r6.size()     // Catch:{ IOException -> 0x0781, SQLiteConstraintException -> 0x06fc, SQLiteDiskIOException -> 0x0687, SQLiteDatabaseCorruptException -> 0x0620, Error | RuntimeException -> 0x061d }
            if (r3 != r2) goto L_0x02df
            r1.A0y = r6     // Catch:{ IOException -> 0x0781, SQLiteConstraintException -> 0x06fc, SQLiteDiskIOException -> 0x0687, SQLiteDatabaseCorruptException -> 0x0620, Error | RuntimeException -> 0x061d }
        L_0x02da:
            int r9 = r12.size()     // Catch:{ IOException -> 0x0781, SQLiteConstraintException -> 0x06fc, SQLiteDiskIOException -> 0x0687, SQLiteDatabaseCorruptException -> 0x0620, Error | RuntimeException -> 0x061d }
            goto L_0x032e
        L_0x02df:
            int r2 = r6.size()     // Catch:{ IOException -> 0x0781, SQLiteConstraintException -> 0x06fc, SQLiteDiskIOException -> 0x0687, SQLiteDatabaseCorruptException -> 0x0620, Error | RuntimeException -> 0x061d }
            if (r2 == 0) goto L_0x02da
            java.lang.String r2 = "msgstore/validateBroadcastParticipantSizes failed"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ IOException -> 0x0781, SQLiteConstraintException -> 0x06fc, SQLiteDiskIOException -> 0x0687, SQLiteDatabaseCorruptException -> 0x0620, Error | RuntimeException -> 0x061d }
            goto L_0x02da
        L_0x02eb:
            r9 = 0
            if (r4 == 0) goto L_0x032e
            r6 = 1
            if (r8 == 0) goto L_0x032e
            boolean r2 = r1.A1Y     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            if (r2 == 0) goto L_0x0301
            X.0yC r11 = r0.A11     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            r3 = 4905(0x1329, float:6.873E-42)
            X.0yV r2 = X.C21000yV.A02     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            boolean r2 = X.C20800yB.A01(r2, r11, r3)     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            if (r2 != 0) goto L_0x032f
        L_0x0301:
            X.1Fr r3 = r0.A0m     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            X.12P r2 = r3.A06     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            X.1M0 r12 = r2.A05()     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            X.71s r11 = r12.B1k()     // Catch:{ all -> 0x0324 }
            r3.A02(r1, r6, r9)     // Catch:{ all -> 0x031a }
            r11.A00()     // Catch:{ all -> 0x031a }
            r11.close()     // Catch:{ all -> 0x0324 }
            r12.close()     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            goto L_0x032f
        L_0x031a:
            r3 = move-exception
            r11.close()     // Catch:{ all -> 0x031f }
            goto L_0x0323
        L_0x031f:
            r2 = move-exception
            r3.addSuppressed(r2)     // Catch:{ all -> 0x0324 }
        L_0x0323:
            throw r3     // Catch:{ all -> 0x0324 }
        L_0x0324:
            r3 = move-exception
            r12.close()     // Catch:{ all -> 0x0329 }
            goto L_0x032d
        L_0x0329:
            r2 = move-exception
            r3.addSuppressed(r2)     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
        L_0x032d:
            throw r3     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
        L_0x032e:
            r6 = 0
        L_0x032f:
            X.1Fe r3 = r0.A1W     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x0614, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            java.util.HashSet r2 = r3.A05(r1)     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x0614, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            if (r2 == 0) goto L_0x034e
            boolean r11 = r10 instanceof com.whatsapp.jid.UserJid     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x0614, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            if (r11 == 0) goto L_0x034e
            X.9ww r11 = X.C207759ww.A00     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x0614, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            boolean r11 = X.AnonymousClass6XG.A02(r11, r2)     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x0614, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            if (r11 == 0) goto L_0x034e
            r11 = 134217728(0x8000000, float:3.85186E-34)
            boolean r12 = r1.A1T(r11)     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x0614, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            if (r12 != 0) goto L_0x034e
            r1.A0j(r11)     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x0614, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
        L_0x034e:
            X.1A1 r11 = r0.A1B     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x0614, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            r11.A04(r1)     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x0614, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            long r11 = r1.A1N     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x0614, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            r29 = -1
            int r13 = (r11 > r29 ? 1 : (r11 == r29 ? 0 : -1))
            if (r13 == 0) goto L_0x0391
            if (r2 != 0) goto L_0x0362
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            r2.<init>()     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
        L_0x0362:
            boolean r11 = r2.isEmpty()     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            if (r11 != 0) goto L_0x0370
            r3.A07(r1, r2)     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            X.1FN r3 = r0.A0i     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            r3.A02(r1, r2)     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
        L_0x0370:
            if (r6 == 0) goto L_0x03a5
            boolean r3 = r1.A1Y     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            if (r3 == 0) goto L_0x03a5
            X.0yC r11 = r0.A11     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            r6 = 4905(0x1329, float:6.873E-42)
            X.0yV r3 = X.C21000yV.A02     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            boolean r3 = X.C20800yB.A01(r3, r11, r6)     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            if (r3 == 0) goto L_0x03a5
            X.1C7 r11 = r0.A0F     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            r6 = 8
            X.1j0 r3 = new X.1j0     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            r3.<init>(r0, r1, r2, r6)     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            r2 = 74
            r11.A02(r3, r2)     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            goto L_0x03a5
        L_0x0391:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x0614, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            r3.<init>()     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x0614, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            java.lang.String r2 = "CoreMessageStore/addmsg cannot add blank receipts for: "
            r3.append(r2)     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x0614, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            r3.append(r7)     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x0614, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            java.lang.String r2 = r3.toString()     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x0614, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            com.whatsapp.util.Log.w((java.lang.String) r2)     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x0614, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
        L_0x03a5:
            long r2 = r1.A1N     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x0614, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            int r6 = (r2 > r29 ? 1 : (r2 == r29 ? 0 : -1))
            if (r6 != 0) goto L_0x03c7
            boolean r2 = r1 instanceof X.AnonymousClass0p5     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            if (r2 != 0) goto L_0x03c7
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            r3.<init>()     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            java.lang.String r2 = "CoreMessageStore/addmsg failed to insert: "
            r3.append(r2)     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            r3.append(r7)     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            java.lang.String r2 = r3.toString()     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            r40 = 0
            goto L_0x05b4
        L_0x03c7:
            if (r4 == 0) goto L_0x04e8
            boolean r2 = X.C203359nq.A0C(r1)     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            if (r2 != 0) goto L_0x056a
            X.16E r15 = r0.A0o     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            java.lang.Object r2 = r15.A08     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            r20 = r2
            monitor-enter(r20)     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            X.AnonymousClass16E.A03(r15)     // Catch:{ all -> 0x04e5 }
            if (r8 == 0) goto L_0x03e0
            X.3Sz r3 = r15.A07()     // Catch:{ all -> 0x04e5 }
            goto L_0x03eb
        L_0x03e0:
            com.whatsapp.jid.UserJid r2 = r1.A0L()     // Catch:{ all -> 0x04e5 }
            X.C18740tg.A06(r2)     // Catch:{ all -> 0x04e5 }
            X.3Sz r3 = r15.A08(r2)     // Catch:{ all -> 0x04e5 }
        L_0x03eb:
            r2 = 4
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x04e5 }
            r6.<init>(r2)     // Catch:{ all -> 0x04e5 }
            if (r3 != 0) goto L_0x0486
            if (r8 == 0) goto L_0x0414
            X.0wo r3 = r15.A01     // Catch:{ all -> 0x04e5 }
            X.13z r26 = X.C223613z.A00     // Catch:{ all -> 0x04e5 }
            r39 = 0
            X.3Sz r2 = new X.3Sz     // Catch:{ all -> 0x04e5 }
            r27 = 0
            r28 = 0
            r31 = -1
            r33 = -1
            r35 = -1
            r37 = -1
            r24 = r2
            r25 = r3
            r24.<init>(r25, r26, r27, r28, r29, r31, r33, r35, r37, r39)     // Catch:{ all -> 0x04e5 }
            r2.A07(r1)     // Catch:{ all -> 0x04e5 }
            goto L_0x0460
        L_0x0414:
            X.0wo r2 = r15.A01     // Catch:{ all -> 0x04e5 }
            r4 = r2
            com.whatsapp.jid.UserJid r26 = r1.A0L()     // Catch:{ all -> 0x04e5 }
            X.C18740tg.A06(r26)     // Catch:{ all -> 0x04e5 }
            long r2 = r1.A1O     // Catch:{ all -> 0x04e5 }
            r31 = r2
            long r13 = r1.A1O     // Catch:{ all -> 0x04e5 }
            r2 = 1
            long r13 = r13 - r2
            long r11 = r1.A1O     // Catch:{ all -> 0x04e5 }
            long r11 = r11 - r2
            long r2 = r1.A1O     // Catch:{ all -> 0x04e5 }
            r37 = r2
            long r2 = r1.A1O     // Catch:{ all -> 0x04e5 }
            r39 = r2
            long r2 = r1.A0I     // Catch:{ all -> 0x04e5 }
            r43 = r2
            X.3Sz r2 = new X.3Sz     // Catch:{ all -> 0x04e5 }
            r27 = 0
            r28 = 0
            r24 = r2
            r25 = r4
            r29 = r31
            r31 = r13
            r33 = r11
            r35 = r37
            r37 = r39
            r39 = r43
            r24.<init>(r25, r26, r27, r28, r29, r31, r33, r35, r37, r39)     // Catch:{ all -> 0x04e5 }
            r2.A07 = r1     // Catch:{ all -> 0x04e5 }
            int r3 = r2.A00     // Catch:{ all -> 0x04e5 }
            int r3 = r3 + 1
            r2.A00 = r3     // Catch:{ all -> 0x04e5 }
            int r3 = r2.A01     // Catch:{ all -> 0x04e5 }
            int r3 = r3 + 1
            r2.A01 = r3     // Catch:{ all -> 0x04e5 }
            X.C65663Sz.A01(r1)     // Catch:{ all -> 0x04e5 }
        L_0x0460:
            java.lang.String r11 = "last_read_message_table_id"
            long r3 = r1.A1O     // Catch:{ all -> 0x04e5 }
            r12 = 1
            long r3 = r3 - r12
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x04e5 }
            r6.put(r11, r3)     // Catch:{ all -> 0x04e5 }
            java.lang.String r11 = "last_read_receipt_sent_message_table_id"
            long r3 = r1.A1O     // Catch:{ all -> 0x04e5 }
            long r3 = r3 - r12
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x04e5 }
            r6.put(r11, r3)     // Catch:{ all -> 0x04e5 }
            java.util.concurrent.ConcurrentHashMap r4 = r15.A0B     // Catch:{ all -> 0x04e5 }
            X.C18740tg.A06(r4)     // Catch:{ all -> 0x04e5 }
            com.whatsapp.jid.UserJid r3 = r2.A09     // Catch:{ all -> 0x04e5 }
            r4.put(r3, r2)     // Catch:{ all -> 0x04e5 }
            r13 = 1
            goto L_0x048b
        L_0x0486:
            X.3Sz r2 = r3.A07(r1)     // Catch:{ all -> 0x04e5 }
            r13 = 0
        L_0x048b:
            java.lang.String r11 = "message_table_id"
            long r3 = r1.A1O     // Catch:{ all -> 0x04e5 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x04e5 }
            r6.put(r11, r3)     // Catch:{ all -> 0x04e5 }
            java.lang.String r4 = "timestamp"
            long r11 = r2.A05()     // Catch:{ all -> 0x04e5 }
            java.lang.Long r3 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x04e5 }
            r6.put(r4, r3)     // Catch:{ all -> 0x04e5 }
            java.lang.String r4 = "unseen_count"
            int r3 = r2.A03()     // Catch:{ all -> 0x04e5 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x04e5 }
            r6.put(r4, r3)     // Catch:{ all -> 0x04e5 }
            java.lang.String r4 = "total_count"
            int r3 = r2.A02()     // Catch:{ all -> 0x04e5 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x04e5 }
            r6.put(r4, r3)     // Catch:{ all -> 0x04e5 }
            java.lang.String r11 = "first_unread_message_table_id"
            monitor-enter(r2)     // Catch:{ all -> 0x04e5 }
            long r3 = r2.A03     // Catch:{ all -> 0x04e2 }
            monitor-exit(r2)     // Catch:{ all -> 0x04e5 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x04e5 }
            r6.put(r11, r3)     // Catch:{ all -> 0x04e5 }
            java.lang.String r11 = "autodownload_limit_message_table_id"
            monitor-enter(r2)     // Catch:{ all -> 0x04e5 }
            long r3 = r2.A02     // Catch:{ all -> 0x04e2 }
            monitor-exit(r2)     // Catch:{ all -> 0x04e5 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x04e5 }
            r6.put(r11, r3)     // Catch:{ all -> 0x04e5 }
            com.whatsapp.jid.UserJid r3 = r2.A09     // Catch:{ all -> 0x04e5 }
            r2 = 1
            X.AnonymousClass16E.A02(r6, r15, r3, r1, r2)     // Catch:{ all -> 0x04e5 }
            monitor-exit(r20)     // Catch:{ all -> 0x04e5 }
            r41 = r13
            goto L_0x056a
        L_0x04e2:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x04e5 }
            throw r3     // Catch:{ all -> 0x04e5 }
        L_0x04e5:
            r2 = move-exception
            monitor-exit(r20)     // Catch:{ all -> 0x04e5 }
            throw r2     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
        L_0x04e8:
            boolean r2 = r10 instanceof X.C28981Uw     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x0614, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            if (r2 != 0) goto L_0x056a
            X.12q r12 = r0.A0I     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            boolean r11 = r1 instanceof X.AnonymousClass2bI     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            X.3Qp r6 = r12.A09(r10, r11)     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            X.0wQ r4 = r0.A07     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            X.1DH r3 = r0.A1M     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            X.0v0 r2 = r0.A0D     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            boolean r42 = A09(r4, r3, r2, r6, r1)     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            r0.A0i(r1)     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            if (r6 != 0) goto L_0x050b
            X.3Qp r2 = r12.A09(r10, r11)     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            if (r2 == 0) goto L_0x050b
            r41 = 1
        L_0x050b:
            if (r11 == 0) goto L_0x056a
            if (r8 == 0) goto L_0x056a
            boolean r2 = r10 instanceof X.AnonymousClass144     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            if (r2 == 0) goto L_0x056a
            r2 = r1
            X.2bI r2 = (X.AnonymousClass2bI) r2     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            X.17X r12 = r0.A0S     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            r12.A0A(r2)     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            X.3Qa r3 = r2.A1J     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            X.11F r4 = r3.A00     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            X.13q r3 = X.AnonymousClass11F.A00     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            X.144 r13 = X.AnonymousClass6H4.A00(r4)     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            X.C18740tg.A06(r13)     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            int r11 = r2.A00     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            r2 = 5
            if (r11 == r2) goto L_0x0538
            r2 = 7
            if (r11 == r2) goto L_0x0538
            r2 = 13
            if (r11 == r2) goto L_0x0538
            r2 = 14
            if (r11 != r2) goto L_0x0549
        L_0x0538:
            boolean r2 = r13 instanceof com.whatsapp.jid.GroupJid     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            if (r2 == 0) goto L_0x0549
            X.1Eg r6 = r0.A0g     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            com.whatsapp.jid.GroupJid r13 = (com.whatsapp.jid.GroupJid) r13     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            boolean r3 = r12.A0C(r13)     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            r2 = r17
            r6.A00(r2, r13, r3)     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
        L_0x0549:
            r2 = 5
            if (r11 == r2) goto L_0x0557
            r2 = 7
            if (r11 == r2) goto L_0x0557
            r2 = 13
            if (r11 == r2) goto L_0x0557
            r2 = 14
            if (r11 != r2) goto L_0x056a
        L_0x0557:
            boolean r2 = r4 instanceof com.whatsapp.jid.GroupJid     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            if (r2 == 0) goto L_0x056a
            com.whatsapp.jid.GroupJid r4 = (com.whatsapp.jid.GroupJid) r4     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            boolean r2 = r12.A0C(r4)     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            if (r2 != 0) goto L_0x056a
            X.1Ei r3 = r0.A10     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            r2 = r17
            r3.A01(r2, r4)     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
        L_0x056a:
            r22.A00()     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x0614, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            X.176 r3 = r0.A0W     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x0614, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            X.177 r2 = r3.A01     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x0614, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            r2.A01(r1, r7)     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x0614, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            java.util.concurrent.ConcurrentHashMap r2 = r3.A03     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x0614, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            r2.remove(r7)     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x0614, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            X.0yC r4 = r0.A11     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x0614, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            r3 = 4893(0x131d, float:6.857E-42)
            X.0yV r2 = X.C21000yV.A02     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x0614, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            boolean r2 = X.C20800yB.A01(r2, r4, r3)     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x0614, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            if (r2 == 0) goto L_0x0591
            boolean r2 = r1 instanceof X.AnonymousClass2bZ     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            if (r2 == 0) goto L_0x0591
            if (r8 != 0) goto L_0x0591
            r2 = r1
            X.2bZ r2 = (X.AnonymousClass2bZ) r2     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            r0.A0s(r2)     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
        L_0x0591:
            boolean r2 = r1 instanceof X.AnonymousClass2bI     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x0614, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            if (r2 != 0) goto L_0x05b2
            long r2 = r1.A0G     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            r11 = 0
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 == 0) goto L_0x05b2
            X.1Sb r2 = r0.A00     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            if (r2 == 0) goto L_0x05b2
            X.1C7 r4 = r0.A0F     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            r2 = 3
            X.1j7 r3 = new X.1j7     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            r3.<init>(r0, r1, r2)     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            r2 = 25
            r4.A02(r3, r2)     // Catch:{ IOException -> 0x061a, SQLiteConstraintException -> 0x0617, SQLiteDiskIOException -> 0x068a, SQLiteDatabaseCorruptException -> 0x05af, Error | RuntimeException -> 0x061d, Error | RuntimeException -> 0x061d }
            goto L_0x05b2
        L_0x05af:
            r2 = move-exception
        L_0x05b0:
            r4 = 0
            goto L_0x0623
        L_0x05b2:
            r40 = 1
        L_0x05b4:
            r22.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0608, SQLiteException -> 0x05bd }
            android.os.SystemClock.elapsedRealtime()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0608, SQLiteException -> 0x05bd }
            r4 = 0
            goto L_0x07e6
        L_0x05bd:
            r4 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0930 }
            r3.<init>()     // Catch:{ all -> 0x0930 }
            r2 = r21
            r3.append(r2)     // Catch:{ all -> 0x0930 }
            r3.append(r5)     // Catch:{ all -> 0x0930 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0930 }
            com.whatsapp.util.Log.e(r2, r4)     // Catch:{ all -> 0x0930 }
            boolean r2 = r4 instanceof android.database.sqlite.SQLiteConstraintException     // Catch:{ all -> 0x0930 }
            if (r2 != 0) goto L_0x05e8
            java.lang.String r2 = r4.getMessage()     // Catch:{ all -> 0x0930 }
            if (r2 == 0) goto L_0x092f
            java.lang.String r3 = r4.getMessage()     // Catch:{ all -> 0x0930 }
            r2 = r19
            boolean r2 = r3.contains(r2)     // Catch:{ all -> 0x0930 }
            if (r2 == 0) goto L_0x092f
        L_0x05e8:
            if (r48 == 0) goto L_0x092f
            X.0xu r5 = r0.A0R     // Catch:{ all -> 0x0930 }
            boolean r2 = r5.A0N()     // Catch:{ all -> 0x0930 }
            if (r2 == 0) goto L_0x092f
            X.12i r3 = r0.A1Y     // Catch:{ all -> 0x0930 }
            java.lang.String r4 = java.lang.String.valueOf(r16)     // Catch:{ all -> 0x0930 }
            r2 = r18
            r3.A04(r2, r4)     // Catch:{ all -> 0x0930 }
            r2 = r16
            X.3Ox r0 = r0.A0T(r1, r2)     // Catch:{ Exception -> 0x0919 }
            r5.A0J()     // Catch:{ Exception -> 0x0919 }
            goto L_0x0915
        L_0x0608:
            r2 = move-exception
            r4 = 0
            com.whatsapp.util.Log.e((java.lang.Throwable) r2)     // Catch:{ all -> 0x0930 }
            X.12s r2 = r0.A0b     // Catch:{ all -> 0x0930 }
            r2.A03()     // Catch:{ all -> 0x0930 }
            goto L_0x07e6
        L_0x0614:
            r2 = move-exception
            r4 = 0
            goto L_0x0623
        L_0x0617:
            r4 = move-exception
            goto L_0x06fe
        L_0x061a:
            r2 = move-exception
            goto L_0x0783
        L_0x061d:
            r4 = move-exception
            goto L_0x06f8
        L_0x0620:
            r2 = move-exception
            r4 = 0
            r9 = 0
        L_0x0623:
            com.whatsapp.util.Log.e((java.lang.Throwable) r2)     // Catch:{ all -> 0x08c4 }
            X.12s r3 = r0.A0b     // Catch:{ all -> 0x08c4 }
            r3.A03()     // Catch:{ all -> 0x08c4 }
            r22.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x067e, SQLiteException -> 0x0633 }
            android.os.SystemClock.elapsedRealtime()     // Catch:{ SQLiteDatabaseCorruptException -> 0x067e, SQLiteException -> 0x0633 }
            goto L_0x07e4
        L_0x0633:
            r4 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0930 }
            r3.<init>()     // Catch:{ all -> 0x0930 }
            r2 = r21
            r3.append(r2)     // Catch:{ all -> 0x0930 }
            r3.append(r5)     // Catch:{ all -> 0x0930 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0930 }
            com.whatsapp.util.Log.e(r2, r4)     // Catch:{ all -> 0x0930 }
            boolean r2 = r4 instanceof android.database.sqlite.SQLiteConstraintException     // Catch:{ all -> 0x0930 }
            if (r2 != 0) goto L_0x065e
            java.lang.String r2 = r4.getMessage()     // Catch:{ all -> 0x0930 }
            if (r2 == 0) goto L_0x092f
            java.lang.String r3 = r4.getMessage()     // Catch:{ all -> 0x0930 }
            r2 = r19
            boolean r2 = r3.contains(r2)     // Catch:{ all -> 0x0930 }
            if (r2 == 0) goto L_0x092f
        L_0x065e:
            if (r48 == 0) goto L_0x092f
            X.0xu r5 = r0.A0R     // Catch:{ all -> 0x0930 }
            boolean r2 = r5.A0N()     // Catch:{ all -> 0x0930 }
            if (r2 == 0) goto L_0x092f
            X.12i r3 = r0.A1Y     // Catch:{ all -> 0x0930 }
            java.lang.String r4 = java.lang.String.valueOf(r16)     // Catch:{ all -> 0x0930 }
            r2 = r18
            r3.A04(r2, r4)     // Catch:{ all -> 0x0930 }
            r2 = r16
            X.3Ox r0 = r0.A0T(r1, r2)     // Catch:{ Exception -> 0x0919 }
            r5.A0J()     // Catch:{ Exception -> 0x0919 }
            goto L_0x0915
        L_0x067e:
            r2 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r2)     // Catch:{ all -> 0x0930 }
            r3.A03()     // Catch:{ all -> 0x0930 }
            goto L_0x07e4
        L_0x0687:
            r4 = move-exception
            r9 = 0
            goto L_0x068b
        L_0x068a:
            r4 = move-exception
        L_0x068b:
            if (r48 == 0) goto L_0x06ee
            java.lang.String r2 = "CoreMessageStore/addmsg/will retry "
            com.whatsapp.util.Log.w(r2, r4)     // Catch:{ all -> 0x08c4 }
            r22.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x06e3, SQLiteException -> 0x069a }
            android.os.SystemClock.elapsedRealtime()     // Catch:{ SQLiteDatabaseCorruptException -> 0x06e3, SQLiteException -> 0x069a }
            goto L_0x07e3
        L_0x069a:
            r4 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0930 }
            r3.<init>()     // Catch:{ all -> 0x0930 }
            r2 = r21
            r3.append(r2)     // Catch:{ all -> 0x0930 }
            r3.append(r5)     // Catch:{ all -> 0x0930 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0930 }
            com.whatsapp.util.Log.e(r2, r4)     // Catch:{ all -> 0x0930 }
            boolean r2 = r4 instanceof android.database.sqlite.SQLiteConstraintException     // Catch:{ all -> 0x0930 }
            if (r2 != 0) goto L_0x06c5
            java.lang.String r2 = r4.getMessage()     // Catch:{ all -> 0x0930 }
            if (r2 == 0) goto L_0x07e3
            java.lang.String r3 = r4.getMessage()     // Catch:{ all -> 0x0930 }
            r2 = r19
            boolean r2 = r3.contains(r2)     // Catch:{ all -> 0x0930 }
            if (r2 == 0) goto L_0x07e3
        L_0x06c5:
            X.0xu r5 = r0.A0R     // Catch:{ all -> 0x0930 }
            boolean r2 = r5.A0N()     // Catch:{ all -> 0x0930 }
            if (r2 == 0) goto L_0x092f
            X.12i r3 = r0.A1Y     // Catch:{ all -> 0x0930 }
            java.lang.String r4 = java.lang.String.valueOf(r16)     // Catch:{ all -> 0x0930 }
            r2 = r18
            r3.A04(r2, r4)     // Catch:{ all -> 0x0930 }
            r2 = r16
            X.3Ox r0 = r0.A0T(r1, r2)     // Catch:{ Exception -> 0x0919 }
            r5.A0J()     // Catch:{ Exception -> 0x0919 }
            goto L_0x0915
        L_0x06e3:
            r2 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r2)     // Catch:{ all -> 0x0930 }
            X.12s r2 = r0.A0b     // Catch:{ all -> 0x0930 }
            r2.A03()     // Catch:{ all -> 0x0930 }
            goto L_0x07e3
        L_0x06ee:
            com.whatsapp.util.Log.e((java.lang.Throwable) r4)     // Catch:{ all -> 0x08c4 }
            X.12T r3 = r0.A0a     // Catch:{ all -> 0x08c4 }
            r2 = 1
            r3.A00(r2)     // Catch:{ all -> 0x08c4 }
            goto L_0x06fb
        L_0x06f8:
            com.whatsapp.util.Log.e((java.lang.Throwable) r4)     // Catch:{ all -> 0x08c4 }
        L_0x06fb:
            throw r4     // Catch:{ all -> 0x08c4 }
        L_0x06fc:
            r4 = move-exception
            r9 = 0
        L_0x06fe:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x08c4 }
            r3.<init>()     // Catch:{ all -> 0x08c4 }
            java.lang.String r2 = "CoreMessageStore/addmsg duplicate "
            r3.append(r2)     // Catch:{ all -> 0x08c4 }
            java.lang.String r2 = r7.A01     // Catch:{ all -> 0x08c4 }
            r3.append(r2)     // Catch:{ all -> 0x08c4 }
            r2 = r23
            r3.append(r2)     // Catch:{ all -> 0x08c4 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x08c4 }
            com.whatsapp.util.Log.i(r2, r4)     // Catch:{ all -> 0x08c4 }
            X.3T1 r2 = r1.A0S()     // Catch:{ all -> 0x08c4 }
            if (r2 == 0) goto L_0x0723
            r2 = 0
            r1.A0F = r2     // Catch:{ all -> 0x08c4 }
        L_0x0723:
            r22.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0776, SQLiteException -> 0x072b }
            android.os.SystemClock.elapsedRealtime()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0776, SQLiteException -> 0x072b }
            goto L_0x0803
        L_0x072b:
            r4 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0930 }
            r3.<init>()     // Catch:{ all -> 0x0930 }
            r2 = r21
            r3.append(r2)     // Catch:{ all -> 0x0930 }
            r3.append(r5)     // Catch:{ all -> 0x0930 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0930 }
            com.whatsapp.util.Log.e(r2, r4)     // Catch:{ all -> 0x0930 }
            boolean r2 = r4 instanceof android.database.sqlite.SQLiteConstraintException     // Catch:{ all -> 0x0930 }
            if (r2 != 0) goto L_0x0756
            java.lang.String r2 = r4.getMessage()     // Catch:{ all -> 0x0930 }
            if (r2 == 0) goto L_0x092f
            java.lang.String r3 = r4.getMessage()     // Catch:{ all -> 0x0930 }
            r2 = r19
            boolean r2 = r3.contains(r2)     // Catch:{ all -> 0x0930 }
            if (r2 == 0) goto L_0x092f
        L_0x0756:
            if (r48 == 0) goto L_0x092f
            X.0xu r5 = r0.A0R     // Catch:{ all -> 0x0930 }
            boolean r2 = r5.A0N()     // Catch:{ all -> 0x0930 }
            if (r2 == 0) goto L_0x092f
            X.12i r3 = r0.A1Y     // Catch:{ all -> 0x0930 }
            java.lang.String r4 = java.lang.String.valueOf(r16)     // Catch:{ all -> 0x0930 }
            r2 = r18
            r3.A04(r2, r4)     // Catch:{ all -> 0x0930 }
            r2 = r16
            X.3Ox r0 = r0.A0T(r1, r2)     // Catch:{ Exception -> 0x0919 }
            r5.A0J()     // Catch:{ Exception -> 0x0919 }
            goto L_0x0915
        L_0x0776:
            r2 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r2)     // Catch:{ all -> 0x0930 }
            X.12s r2 = r0.A0b     // Catch:{ all -> 0x0930 }
            r2.A03()     // Catch:{ all -> 0x0930 }
            goto L_0x0803
        L_0x0781:
            r2 = move-exception
            r9 = 0
        L_0x0783:
            com.whatsapp.util.Log.e((java.lang.Throwable) r2)     // Catch:{ all -> 0x08c4 }
            r22.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x07d8, SQLiteException -> 0x078d }
            android.os.SystemClock.elapsedRealtime()     // Catch:{ SQLiteDatabaseCorruptException -> 0x07d8, SQLiteException -> 0x078d }
            goto L_0x07e1
        L_0x078d:
            r4 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0930 }
            r3.<init>()     // Catch:{ all -> 0x0930 }
            r2 = r21
            r3.append(r2)     // Catch:{ all -> 0x0930 }
            r3.append(r5)     // Catch:{ all -> 0x0930 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0930 }
            com.whatsapp.util.Log.e(r2, r4)     // Catch:{ all -> 0x0930 }
            boolean r2 = r4 instanceof android.database.sqlite.SQLiteConstraintException     // Catch:{ all -> 0x0930 }
            if (r2 != 0) goto L_0x07b8
            java.lang.String r2 = r4.getMessage()     // Catch:{ all -> 0x0930 }
            if (r2 == 0) goto L_0x092f
            java.lang.String r3 = r4.getMessage()     // Catch:{ all -> 0x0930 }
            r2 = r19
            boolean r2 = r3.contains(r2)     // Catch:{ all -> 0x0930 }
            if (r2 == 0) goto L_0x092f
        L_0x07b8:
            if (r48 == 0) goto L_0x092f
            X.0xu r5 = r0.A0R     // Catch:{ all -> 0x0930 }
            boolean r2 = r5.A0N()     // Catch:{ all -> 0x0930 }
            if (r2 == 0) goto L_0x092f
            X.12i r3 = r0.A1Y     // Catch:{ all -> 0x0930 }
            java.lang.String r4 = java.lang.String.valueOf(r16)     // Catch:{ all -> 0x0930 }
            r2 = r18
            r3.A04(r2, r4)     // Catch:{ all -> 0x0930 }
            r2 = r16
            X.3Ox r0 = r0.A0T(r1, r2)     // Catch:{ Exception -> 0x0919 }
            r5.A0J()     // Catch:{ Exception -> 0x0919 }
            goto L_0x0915
        L_0x07d8:
            r2 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r2)     // Catch:{ all -> 0x0930 }
            X.12s r2 = r0.A0b     // Catch:{ all -> 0x0930 }
            r2.A03()     // Catch:{ all -> 0x0930 }
        L_0x07e1:
            r4 = 0
            goto L_0x07e4
        L_0x07e3:
            r4 = 1
        L_0x07e4:
            r40 = 0
        L_0x07e6:
            r43 = 0
            if (r4 == 0) goto L_0x0807
            if (r48 <= 0) goto L_0x0807
            r45.A06()     // Catch:{ all -> 0x0930 }
            r2 = r45
            X.12f r2 = r2.A02     // Catch:{ all -> 0x0930 }
            r2.close()     // Catch:{ all -> 0x0930 }
            X.1Ej r2 = r0.A1b     // Catch:{ all -> 0x0930 }
            r2.A01()     // Catch:{ all -> 0x0930 }
            r2 = r16
            X.3Ox r0 = r0.A0T(r1, r2)     // Catch:{ all -> 0x0930 }
            goto L_0x0915
        L_0x0803:
            r40 = 0
            r43 = 1
        L_0x0807:
            r17.close()
            if (r40 == 0) goto L_0x08a8
            boolean r2 = r1 instanceof X.AnonymousClass2bU
            if (r2 == 0) goto L_0x082f
            r2 = r1
            X.2bU r2 = (X.AnonymousClass2bU) r2
            X.3Qj r6 = r2.A01
            X.C18740tg.A06(r6)
            if (r8 == 0) goto L_0x082f
            java.io.File r5 = r6.A0I
            if (r5 == 0) goto L_0x082f
            X.1Av r4 = r0.A09
            boolean r2 = X.C131806Qs.A01(r1)
            r3 = 1
            r4.A06(r5, r3, r2)
            if (r9 <= 0) goto L_0x082f
            java.io.File r2 = r6.A0I
            r4.A06(r2, r9, r3)
        L_0x082f:
            X.3T1 r3 = r1.A0S()
            boolean r2 = r3 instanceof X.C46962bx
            if (r2 == 0) goto L_0x0850
            X.2bU r3 = (X.AnonymousClass2bU) r3
            X.3Qj r5 = r3.A01
            if (r5 == 0) goto L_0x0850
            java.io.File r2 = r5.A0I
            if (r2 == 0) goto L_0x0850
            X.1Av r4 = r0.A09
            r3 = 1
            r4.A06(r2, r3, r3)
            if (r8 == 0) goto L_0x0850
            if (r9 <= 0) goto L_0x0850
            java.io.File r2 = r5.A0I
            r4.A06(r2, r9, r3)
        L_0x0850:
            X.11F r2 = r1.A0J()
            boolean r2 = r2 instanceof X.C177638e7
            if (r2 != 0) goto L_0x08a8
            boolean r2 = r1.A14
            if (r2 != 0) goto L_0x08a8
            boolean r2 = r10 instanceof X.C28981Uw
            if (r2 != 0) goto L_0x08a8
            int r3 = r1.A0D
            r2 = 6
            if (r3 == r2) goto L_0x08a8
            boolean r2 = X.C63903Lw.A00(r1)
            if (r2 != 0) goto L_0x08a8
            X.11F r5 = r1.A0J()
            if (r5 != 0) goto L_0x0872
            r5 = r10
        L_0x0872:
            X.1DM r6 = r0.A1K
            X.0yC r2 = r6.A06
            r1 = 6163(0x1813, float:8.636E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x08a8
            boolean r0 = r5 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x08a8
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            X.36K r0 = X.AnonymousClass1DM.A01(r6, r5)
            if (r0 != 0) goto L_0x08a8
            X.9Ha r0 = r6.A07(r5)
            if (r0 == 0) goto L_0x08b2
            java.lang.Long r0 = r0.A00
            long r0 = r0.longValue()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            java.util.Map r4 = X.AnonymousClass1DM.A02(r6)
            r2 = 2
            X.36K r3 = new X.36K
            r3.<init>(r6, r2, r0)
        L_0x08a5:
            r4.put(r5, r3)
        L_0x08a8:
            X.3Ox r0 = new X.3Ox
            r44 = 0
            r39 = r0
            r39.<init>(r40, r41, r42, r43, r44)
            return r0
        L_0x08b2:
            java.util.Map r4 = X.AnonymousClass1DM.A02(r6)
            X.0wo r0 = r6.A04
            long r0 = r0.A04()
            X.36K r3 = new X.36K
            r2 = r16
            r3.<init>(r6, r2, r0)
            goto L_0x08a5
        L_0x08c4:
            r4 = move-exception
            r22.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x091b, SQLiteException -> 0x08cc }
            android.os.SystemClock.elapsedRealtime()     // Catch:{ SQLiteDatabaseCorruptException -> 0x091b, SQLiteException -> 0x08cc }
            goto L_0x092f
        L_0x08cc:
            r4 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0930 }
            r3.<init>()     // Catch:{ all -> 0x0930 }
            r2 = r21
            r3.append(r2)     // Catch:{ all -> 0x0930 }
            r3.append(r5)     // Catch:{ all -> 0x0930 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0930 }
            com.whatsapp.util.Log.e(r2, r4)     // Catch:{ all -> 0x0930 }
            boolean r2 = r4 instanceof android.database.sqlite.SQLiteConstraintException     // Catch:{ all -> 0x0930 }
            if (r2 != 0) goto L_0x08f7
            java.lang.String r2 = r4.getMessage()     // Catch:{ all -> 0x0930 }
            if (r2 == 0) goto L_0x092f
            java.lang.String r3 = r4.getMessage()     // Catch:{ all -> 0x0930 }
            r2 = r19
            boolean r2 = r3.contains(r2)     // Catch:{ all -> 0x0930 }
            if (r2 == 0) goto L_0x092f
        L_0x08f7:
            if (r48 == 0) goto L_0x092f
            X.0xu r5 = r0.A0R     // Catch:{ all -> 0x0930 }
            boolean r2 = r5.A0N()     // Catch:{ all -> 0x0930 }
            if (r2 == 0) goto L_0x092f
            X.12i r3 = r0.A1Y     // Catch:{ all -> 0x0930 }
            java.lang.String r4 = java.lang.String.valueOf(r16)     // Catch:{ all -> 0x0930 }
            r2 = r18
            r3.A04(r2, r4)     // Catch:{ all -> 0x0930 }
            r2 = r16
            X.3Ox r0 = r0.A0T(r1, r2)     // Catch:{ Exception -> 0x0919 }
            r5.A0J()     // Catch:{ Exception -> 0x0919 }
        L_0x0915:
            r17.close()
            return r0
        L_0x0919:
            r4 = move-exception
            goto L_0x0925
        L_0x091b:
            r1 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)     // Catch:{ all -> 0x0930 }
            X.12s r0 = r0.A0b     // Catch:{ all -> 0x0930 }
            r0.A03()     // Catch:{ all -> 0x0930 }
            goto L_0x092f
        L_0x0925:
            r0 = 1
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0930 }
            r0 = r18
            r3.A04(r0, r1)     // Catch:{ all -> 0x0930 }
        L_0x092f:
            throw r4     // Catch:{ all -> 0x0930 }
        L_0x0930:
            r1 = move-exception
            r17.close()     // Catch:{ all -> 0x0935 }
            throw r1
        L_0x0935:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20310xM.A0T(X.3T1, int):X.3Ox");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0055, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        X.C05600Qi.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0059, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0060, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass3T1 A0U(long r11) {
        /*
            r10 = this;
            X.1A1 r0 = r10.A1B
            X.175 r5 = r0.A01
            java.lang.String r4 = "CachedMessageStore/getMessageBySortId/sortId"
            long r8 = android.os.SystemClock.uptimeMillis()
            X.12P r0 = r5.A06     // Catch:{ all -> 0x0061 }
            X.1M0 r6 = r0.get()     // Catch:{ all -> 0x0061 }
            X.14e r7 = r6.A02     // Catch:{ all -> 0x005a }
            java.lang.String r3 = X.AnonymousClass2xD.A0E     // Catch:{ all -> 0x005a }
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x005a }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x005a }
            r2[r1] = r0     // Catch:{ all -> 0x005a }
            java.lang.String r0 = "GET_MESSAGE_BY_SORT_ID_SQL"
            android.database.Cursor r7 = r7.A09(r3, r0, r2)     // Catch:{ all -> 0x005a }
            boolean r0 = r7.moveToLast()     // Catch:{ all -> 0x0053 }
            r3 = 0
            if (r0 == 0) goto L_0x0042
            java.lang.String r0 = "chat_row_id"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0053 }
            long r1 = r7.getLong(r0)     // Catch:{ all -> 0x0053 }
            X.163 r0 = r5.A01     // Catch:{ all -> 0x0053 }
            X.11F r1 = r0.A0A(r1)     // Catch:{ all -> 0x0053 }
            if (r1 == 0) goto L_0x0042
            r0 = 0
            X.3T1 r3 = r5.A02(r7, r1, r0)     // Catch:{ all -> 0x0053 }
        L_0x0042:
            r7.close()     // Catch:{ all -> 0x005a }
            r6.close()     // Catch:{ all -> 0x0061 }
            X.12g r2 = r5.A03
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r8
            r2.A01(r4, r0)
            return r3
        L_0x0053:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r0 = move-exception
            X.C05600Qi.A00(r7, r1)     // Catch:{ all -> 0x005a }
            throw r0     // Catch:{ all -> 0x005a }
        L_0x005a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005c }
        L_0x005c:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)     // Catch:{ all -> 0x0061 }
            throw r0     // Catch:{ all -> 0x0061 }
        L_0x0061:
            r3 = move-exception
            X.12g r2 = r5.A03
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r8
            r2.A01(r4, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20310xM.A0U(long):X.3T1");
    }

    public AnonymousClass3T1 A0V(UserJid userJid, AnonymousClass3T1 r6, Map map, long j) {
        DeviceJid deviceJid;
        C64933Qa r3 = r6.A1J;
        C64933Qa r1 = new C64933Qa(userJid, r3.A01, true);
        C18740tg.A0C(r6 instanceof AnonymousClass4RU);
        C18740tg.A0C(r6.A10);
        AnonymousClass3T1 B32 = ((AnonymousClass4RU) r6).B32(r1);
        B32.A0s = null;
        B32.A0q(r3.A00);
        C80103un A042 = this.A0O.A04(B32, j);
        C223113u r0 = DeviceJid.Companion;
        if (userJid != null) {
            deviceJid = userJid.getPrimaryDevice();
        } else {
            deviceJid = null;
        }
        map.put(deviceJid, A042);
        return B32;
    }

    public void A0Z(C202319lY r4, C64933Qa r5) {
        StringBuilder sb = new StringBuilder();
        sb.append("CoreMessageStore/updateMessagePaymentTransaction/PAY transactionStatus:");
        sb.append(r4.A02);
        sb.append(" for key:");
        sb.append(r5);
        Log.i(sb.toString());
        this.A0F.A01(new C35631j0(this, r5, r4, 9), 28);
    }

    public void A0a(AnonymousClass11F r12) {
        C220412q r8 = this.A0I;
        C65073Qp A092 = r8.A09(r12, false);
        if (A092 != null) {
            long A032 = this.A0j.A03(r12);
            long A062 = this.A0l.A06(r12);
            C65073Qp A093 = r8.A09(r12, false);
            C18740tg.A06(A093);
            synchronized (A093) {
                A092.A0A();
                if (A032 != 1) {
                    AnonymousClass3T1 A012 = this.A1B.A01.A01(A032);
                    A092.A0d = A012;
                    if (A012 != null) {
                        if (C66013Ui.A0e(A012) || C66013Ui.A0c(A012)) {
                            A092.A0d = null;
                        } else {
                            A092.A0U = A032;
                            A092.A0V = A062;
                            A092.A0X = A012.A0I;
                        }
                        A092.A0P = A032;
                        A092.A0Q = A062;
                        A092.A0R = A032;
                        A092.A0S = A062;
                        A092.A0N = A032;
                        A092.A0O = A062;
                        A092.A0c = null;
                    }
                }
            }
            int A063 = this.A0H.A06(A092);
            StringBuilder sb = new StringBuilder();
            sb.append("CoreMessageStore/updateChatTable/updated:");
            sb.append(A063);
            Log.i(sb.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0c(X.AnonymousClass11F r11, X.AnonymousClass3H2 r12) {
        /*
            r10 = this;
            X.3ur r7 = r12.A05
            if (r7 == 0) goto L_0x0014
            int r0 = r7.actualActors
            if (r0 != 0) goto L_0x0086
            long r1 = r7.privacyModeTs
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0086
            int r0 = r7.hostStorage
            if (r0 != 0) goto L_0x0086
        L_0x0014:
            int r6 = r12.A03
            if (r6 != 0) goto L_0x0086
            java.lang.String r0 = r12.A07
            if (r0 != 0) goto L_0x0086
            X.17T r0 = r10.A0j
            boolean r0 = r0.A08(r11)
            if (r0 != 0) goto L_0x0086
            X.005 r0 = r10.A1m
            java.lang.Object r1 = r0.get()
            X.18y r1 = (X.C235618y) r1
            X.13r r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r0 = X.C222813r.A00(r11)
            boolean r0 = r1.A01(r0)
            if (r0 != 0) goto L_0x0086
            r0 = 0
            r10.A0z(r11, r0)
        L_0x003c:
            int r0 = r12.A02
            X.3U1 r4 = new X.3U1
            r4.<init>((X.C80113ur) r7, (int) r0, (int) r6)
            X.3ur r3 = r12.A04
            int r1 = r12.A00
            int r0 = r12.A01
            X.3U1 r2 = new X.3U1
            r2.<init>((X.C80113ur) r3, (int) r1, (int) r0)
            X.3ur r1 = r4.A03
            int r0 = r1.actualActors
            if (r0 == 0) goto L_0x0085
            int r0 = r1.hostStorage
            if (r0 == 0) goto L_0x0085
            boolean r0 = r4.A06()
            if (r0 == 0) goto L_0x0085
            boolean r0 = r2.A06()
            if (r0 != 0) goto L_0x0085
            X.0v0 r0 = r10.A0D
            boolean r0 = r0.A2C()
            if (r0 == 0) goto L_0x0085
            X.19x r1 = r10.A1A
            X.0wo r0 = r10.A0C
            long r2 = X.C19970wo.A00(r0)
            X.19w r1 = r1.A01
            r0 = 1
            X.3Qa r4 = r1.A02(r11, r0)
            r1 = 63
            X.2bI r0 = new X.2bI
            r0.<init>(r4, r1, r2)
            r10.A0P(r0)
        L_0x0085:
            return
        L_0x0086:
            X.1GA r2 = r10.A1D
            int r6 = r12.A03
            int r9 = r12.A01
            java.lang.String r5 = r12.A06
            boolean r0 = r11 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x003c
            X.0yC r8 = r2.A01
            boolean r0 = X.AnonymousClass3RR.A00(r8, r11)
            if (r0 != 0) goto L_0x003c
            int r0 = r12.A02
            X.3U1 r4 = new X.3U1
            r4.<init>((X.C80113ur) r7, (int) r0, (int) r6)
            X.3ur r3 = r12.A04
            int r0 = r12.A00
            X.3U1 r1 = new X.3U1
            r1.<init>((X.C80113ur) r3, (int) r0, (int) r9)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            java.util.Arrays.toString(r0)
            int r4 = r4.A03()
            int r3 = r1.A03()
            r1 = 2320(0x910, float:3.251E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r8, r1)
            if (r0 == 0) goto L_0x0100
            int r4 = X.C64083Mo.A00(r4)
            int r3 = X.C64083Mo.A00(r3)
            int[][] r0 = X.C64083Mo.A00
        L_0x00d1:
            r0 = r0[r4]
            r8 = r0[r3]
            if (r8 <= 0) goto L_0x003c
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x00e1
            java.lang.String r5 = X.AnonymousClass3U8.A07(r11)
        L_0x00e1:
            X.19x r3 = r2.A02
            X.0wo r0 = r2.A00
            long r1 = X.C19970wo.A00(r0)
            X.19w r3 = r3.A01
            r0 = 1
            X.3Qa r4 = r3.A02(r11, r0)
            r3 = 69
            X.2cI r0 = new X.2cI
            r0.<init>(r4, r3, r1)
            r0.A00 = r8
            r0.A01 = r5
            r10.A0P(r0)
            goto L_0x003c
        L_0x0100:
            r0 = 10
            if (r4 > r0) goto L_0x003c
            if (r3 > r0) goto L_0x003c
            int[][] r0 = X.C56562wU.A00
            goto L_0x00d1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20310xM.A0c(X.11F, X.3H2):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ca, code lost:
        if (r12 != false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0124, code lost:
        if (r7.A1E.A00.A00(r14) <= 0) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0061, code lost:
        if (r0.A00 != 1) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0d(X.AnonymousClass11F r21, java.lang.Long r22, boolean r23, boolean r24) {
        /*
            r20 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "CoreMessageStore/clearmsgs/service/jid "
            r1.append(r0)
            r14 = r21
            r1.append(r14)
            java.lang.String r0 = " excludeStarred:"
            r1.append(r0)
            r2 = r23
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r7 = r20
            X.1DQ r0 = r7.A0T
            android.os.Handler r6 = r0.A01
            java.lang.String r0 = r14.getRawString()
            r5 = 1
            android.os.Message r0 = android.os.Message.obtain(r6, r5, r0)
            r0.sendToTarget()
            X.1FD r13 = r7.A0N
            X.163 r0 = r13.A00
            long r0 = r0.A08(r14)
            X.3B8 r0 = X.AnonymousClass1FD.A01(r13, r0)
            if (r0 == 0) goto L_0x0079
            java.util.List r1 = r0.A09
            boolean r0 = r0.A0B
        L_0x0044:
            r17 = r23 ^ 1
            r8 = 0
            r15 = r22
            r18 = r24
            r19 = r0
            r16 = r1
            X.3B8 r9 = r13.A03(r14, r15, r16, r17, r18, r19)
            if (r9 == 0) goto L_0x0114
            X.12q r1 = r7.A0I
            r0 = 0
            X.3Qp r0 = r1.A09(r14, r0)
            if (r0 == 0) goto L_0x0063
            int r0 = r0.A00
            r13 = 1
            if (r0 == r5) goto L_0x0064
        L_0x0063:
            r13 = 0
        L_0x0064:
            if (r23 == 0) goto L_0x00cc
            boolean r0 = X.AnonymousClass143.A0G(r14)
            if (r0 != 0) goto L_0x012a
            boolean r0 = r14 instanceof X.C177618e5
            if (r0 != 0) goto L_0x012a
            X.17A r1 = r7.A0p
            X.12P r0 = r1.A03
            X.1M0 r4 = r0.get()
            goto L_0x007c
        L_0x0079:
            r1 = 0
            r0 = 0
            goto L_0x0044
        L_0x007c:
            X.14e r11 = r4.A02     // Catch:{ all -> 0x00bd }
            java.lang.String r10 = "SELECT EXISTS( SELECT * FROM message_system JOIN message_view ON message_view._id = message_system.message_row_id  WHERE chat_row_id = ?  AND  (action_type = 61 OR action_type = 69 )) as has_biz_state_change"
            r12 = 1
            java.lang.String[] r3 = new java.lang.String[r5]     // Catch:{ all -> 0x00bd }
            X.163 r0 = r1.A01     // Catch:{ all -> 0x00bd }
            long r0 = r0.A08(r14)     // Catch:{ all -> 0x00bd }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00bd }
            r0 = 0
            r3[r0] = r1     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = "GET_BIZ_STATE_CHANGE_SQL"
            android.database.Cursor r3 = r11.A09(r10, r0, r3)     // Catch:{ all -> 0x00bd }
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x00ad
            java.lang.String r0 = "has_biz_state_change"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00b1 }
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x00b1 }
            if (r0 == r5) goto L_0x00a9
            r12 = 0
        L_0x00a9:
            r3.close()     // Catch:{ all -> 0x00bd }
            goto L_0x00c7
        L_0x00ad:
            r3.close()     // Catch:{ all -> 0x00bd }
            goto L_0x0127
        L_0x00b1:
            r1 = move-exception
            if (r3 == 0) goto L_0x00bc
            r3.close()     // Catch:{ all -> 0x00b8 }
            goto L_0x00bc
        L_0x00b8:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00bd }
        L_0x00bc:
            throw r1     // Catch:{ all -> 0x00bd }
        L_0x00bd:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x00c2 }
            throw r1
        L_0x00c2:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x00c7:
            r4.close()
            if (r12 == 0) goto L_0x012a
        L_0x00cc:
            boolean r0 = r7.A0G(r14)
            if (r0 == 0) goto L_0x00d7
            if (r23 == 0) goto L_0x0117
            r7.A0f(r14, r5)
        L_0x00d7:
            r1 = 0
        L_0x00d8:
            r7.A0a(r14)
            if (r13 == 0) goto L_0x00e8
            java.lang.String r0 = "CoreMessageStore/clearmsgs/service/ adding plaintext disabled message"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r7.A0z(r14, r8)
            r7.A0y(r14)
        L_0x00e8:
            if (r1 == 0) goto L_0x0101
            X.16D r0 = r7.A0A
            X.141 r0 = r0.A08(r14)
            X.1El r1 = r7.A1E
            if (r0 == 0) goto L_0x0115
            boolean r0 = r0.A0E()
            if (r0 == 0) goto L_0x0115
        L_0x00fa:
            X.8n0 r0 = r1.A01(r14, r5)
            r7.A0h(r0)
        L_0x0101:
            r1 = 2
            java.lang.String r0 = r14.getRawString()
            android.os.Message r0 = android.os.Message.obtain(r6, r1, r0)
            r0.sendToTarget()
            X.1Fj r1 = r7.A0J
            java.lang.String r0 = "action_clear"
            r1.A00(r9, r0)
        L_0x0114:
            return
        L_0x0115:
            r5 = 0
            goto L_0x00fa
        L_0x0117:
            X.1El r0 = r7.A1E
            X.1Et r0 = r0.A00
            long r3 = r0.A00(r14)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 1
            if (r0 > 0) goto L_0x00d8
            goto L_0x00d7
        L_0x0127:
            r4.close()
        L_0x012a:
            boolean r0 = r7.A10(r14, r5)
            r0 = r0 ^ 1
            r13 = r13 & r0
            goto L_0x00cc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20310xM.A0d(X.11F, java.lang.Long, boolean, boolean):void");
    }

    public void A0f(AnonymousClass11F r8, boolean z) {
        C1495671s B1k;
        C20810yC r3 = this.A11;
        AnonymousClass00C.A0D(r3, 0);
        if (C20800yB.A01(C21000yV.A02, r3, 4873)) {
            AnonymousClass1M0 A052 = this.A0c.A05();
            try {
                B1k = A052.B1k();
                C24961El r0 = this.A1E;
                AnonymousClass00C.A0D(r8, 0);
                long A002 = r0.A00.A00(r8);
                if (A002 > 0) {
                    this.A0U.A06(Collections.singleton(Long.valueOf(A002)), z);
                }
                B1k.A00();
                B1k.close();
                A052.close();
                return;
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
            return;
        }
        throw th;
    }

    public void A0g(AnonymousClass11F r8, boolean z) {
        Cursor A092;
        long A0L2 = A0L(r8, C19970wo.A00(this.A0C) - TimeUnit.HOURS.toMillis(24));
        AnonymousClass17A r1 = this.A0p;
        HashSet hashSet = new HashSet();
        AnonymousClass1M0 A042 = r1.A03.get();
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(String.valueOf(A0L2));
            arrayList.add(String.valueOf(r1.A01.A08(r8)));
            for (Integer valueOf : (Set) C56672wh.A00.get()) {
                arrayList.add(String.valueOf(valueOf));
            }
            A092 = A042.A02.A09(C56882x2.A05, "GET_SYSTEM_MESSAGES_ROW_IDS_BY_ACTION_TYPES_SQL", (String[]) arrayList.toArray(C19430v1.A0N));
            int columnIndexOrThrow = A092.getColumnIndexOrThrow("_id");
            while (A092.moveToNext()) {
                hashSet.add(Long.valueOf(A092.getLong(columnIndexOrThrow)));
            }
            A092.close();
            A042.close();
            this.A0U.A06(hashSet, z);
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

    public void A0h(AnonymousClass3T1 r3) {
        int i = -1;
        if (r3.A1Y) {
            i = 22;
        }
        A0m(r3, i);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:436:0x072d  */
    /* JADX WARNING: Removed duplicated region for block: B:476:? A[RETURN, SYNTHETIC] */
    public void A0i(X.AnonymousClass3T1 r28) {
        /*
            r27 = this;
            r6 = r28
            X.3Qa r0 = r6.A1J
            r26 = r0
            X.11F r2 = r0.A00
            if (r2 == 0) goto L_0x001c
            r5 = r27
            X.12q r11 = r5.A0I
            boolean r10 = r6 instanceof X.AnonymousClass2bI
            X.3Qp r4 = r11.A09(r2, r10)
            if (r4 != 0) goto L_0x001d
            boolean r0 = X.C66013Ui.A0m(r6)
            if (r0 == 0) goto L_0x001d
        L_0x001c:
            return
        L_0x001d:
            int r8 = r6.A1I
            r0 = 8
            if (r8 == r0) goto L_0x001c
            r7 = 90
            if (r4 != 0) goto L_0x002a
            if (r8 != r7) goto L_0x002a
            return
        L_0x002a:
            boolean r0 = r6 instanceof X.AnonymousClass0p5
            if (r0 != 0) goto L_0x001c
            r0 = 87
            if (r8 == r0) goto L_0x001c
            r0 = 88
            if (r8 == r0) goto L_0x001c
            r12 = 0
            if (r4 == 0) goto L_0x00d4
            X.3un r0 = r4.A0b
            long r0 = r0.ephemeralSettingTimestamp
            int r3 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r3 <= 0) goto L_0x00d4
            X.3Id r0 = r4.A0a
            if (r0 != 0) goto L_0x00d4
            X.0yC r3 = r5.A11
            r1 = 5309(0x14bd, float:7.44E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r3, r1)
            if (r0 == 0) goto L_0x00d4
            X.1Fm r14 = r5.A1S
            r16 = 0
            X.12P r0 = r14.A01     // Catch:{ all -> 0x00b2 }
            X.1M0 r3 = r0.get()     // Catch:{ all -> 0x00b2 }
            X.14e r12 = r3.A02     // Catch:{ all -> 0x00ab }
            java.lang.String r9 = "SELECT ephemeral_trigger, ephemeral_initiated_by_me FROM chat_ephemeral WHERE chat_row_id = ?"
            r13 = 1
            java.lang.String[] r1 = new java.lang.String[r13]     // Catch:{ all -> 0x00ab }
            X.163 r14 = r14.A00     // Catch:{ all -> 0x00ab }
            X.11F r0 = r4.A0q     // Catch:{ all -> 0x00ab }
            long r14 = r14.A08(r0)     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x00ab }
            r1[r16] = r0     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = "GET_EPHEMERAL_CHATS_SQL"
            android.database.Cursor r9 = r12.A09(r9, r0, r1)     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = "ephemeral_trigger"
            int r1 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00a4 }
            java.lang.String r0 = "ephemeral_initiated_by_me"
            int r12 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00a4 }
            boolean r0 = r9.moveToFirst()     // Catch:{ all -> 0x00a4 }
            if (r0 == 0) goto L_0x009b
            int r1 = r9.getInt(r1)     // Catch:{ all -> 0x00a4 }
            int r0 = r9.getInt(r12)     // Catch:{ all -> 0x00a4 }
            if (r0 != 0) goto L_0x0094
            r13 = 0
        L_0x0094:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)     // Catch:{ all -> 0x00a4 }
            r4.A0I(r0, r1)     // Catch:{ all -> 0x00a4 }
        L_0x009b:
            X.0AJ r1 = X.AnonymousClass0AJ.A00     // Catch:{ all -> 0x00a4 }
            r9.close()     // Catch:{ all -> 0x00ab }
            r3.close()     // Catch:{ all -> 0x00b2 }
            goto L_0x00b8
        L_0x00a4:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a6 }
        L_0x00a6:
            r0 = move-exception
            X.C05600Qi.A00(r9, r1)     // Catch:{ all -> 0x00ab }
            throw r0     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ad }
        L_0x00ad:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ all -> 0x00b2 }
            throw r0     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            r0 = move-exception
            X.03N r1 = new X.03N
            r1.<init>(r0)
        L_0x00b8:
            java.lang.Throwable r3 = X.AnonymousClass0AK.A00(r1)
            if (r3 == 0) goto L_0x00d4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "EphemeralChatStore/ Failed to load ephemeral chats from db for chat: "
            r1.append(r0)
            X.11F r0 = r4.A0q
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r3)
        L_0x00d4:
            r3 = 1
            r0 = 0
            if (r4 == 0) goto L_0x00d9
            r0 = 1
        L_0x00d9:
            boolean r23 = X.C66013Ui.A0w(r6, r0)
            r0 = 10
            if (r8 != r0) goto L_0x033d
            r9 = 0
            r22 = 1
        L_0x00e4:
            r21 = 0
            r18 = 1
        L_0x00e8:
            r17 = 0
        L_0x00ea:
            r12 = 5
            r13 = 11
            r1 = 167(0xa7, float:2.34E-43)
            if (r10 == 0) goto L_0x0336
            r0 = r6
            X.2bI r0 = (X.AnonymousClass2bI) r0
            int r7 = r0.A00
            r0 = 9
            if (r7 == r0) goto L_0x032a
            if (r7 == r13) goto L_0x032a
            if (r7 == r1) goto L_0x032a
            r0 = 152(0x98, float:2.13E-43)
            if (r7 == r0) goto L_0x032a
            r0 = 168(0xa8, float:2.35E-43)
            if (r7 == r0) goto L_0x032a
            r0 = 143(0x8f, float:2.0E-43)
            if (r7 == r0) goto L_0x031a
            r0 = 148(0x94, float:2.07E-43)
            if (r7 == r0) goto L_0x031a
            if (r7 != r3) goto L_0x0311
            java.lang.String r1 = r6.A0b()
            r19 = 0
        L_0x0116:
            r16 = 0
        L_0x0118:
            X.0wQ r0 = r5.A07
            boolean r0 = X.C66013Ui.A0U(r0, r6)
            r20 = 1
            if (r0 != 0) goto L_0x0124
        L_0x0122:
            r20 = 0
        L_0x0124:
            X.0wQ r7 = r5.A07
            X.1DH r13 = r5.A1M
            X.0v0 r0 = r5.A0D
            r25 = r0
            r12 = 0
            boolean r0 = A09(r7, r13, r0, r4, r6)
            if (r0 == 0) goto L_0x030c
            r0 = 0
            r4.A0i = r0
        L_0x0136:
            boolean r0 = X.C66013Ui.A0Q(r7, r6)
            if (r0 == 0) goto L_0x013e
            r4.A0p = r3
        L_0x013e:
            r13 = 1
        L_0x013f:
            X.0yC r0 = r5.A11
            r24 = r0
            boolean r0 = r6.A10
            if (r0 == 0) goto L_0x0151
            r0 = r26
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0151
            boolean r0 = r2 instanceof X.C177618e5
            if (r0 == 0) goto L_0x0176
        L_0x0151:
            boolean r0 = r6 instanceof X.AnonymousClass2bH
            if (r0 != 0) goto L_0x0176
            boolean r0 = r6 instanceof X.AnonymousClass2bY
            if (r0 != 0) goto L_0x0176
            boolean r0 = r6 instanceof X.AnonymousClass5JC
            if (r0 != 0) goto L_0x0176
            boolean r0 = r6 instanceof X.C181368nM
            if (r0 != 0) goto L_0x0176
            boolean r0 = r6 instanceof X.AnonymousClass2bQ
            if (r0 == 0) goto L_0x016b
            r0 = r26
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0176
        L_0x016b:
            if (r10 == 0) goto L_0x0260
            r0 = r6
            X.2bI r0 = (X.AnonymousClass2bI) r0
            int r14 = r0.A00
            r0 = 118(0x76, float:1.65E-43)
            if (r14 != r0) goto L_0x0260
        L_0x0176:
            r15 = 0
        L_0x0177:
            boolean r14 = X.C66013Ui.A0S(r7, r6)
            r13 = -1
            if (r14 == 0) goto L_0x017f
            r13 = 1
        L_0x017f:
            if (r4 != 0) goto L_0x0241
            X.1C6 r0 = r5.A1l
            java.util.ArrayList r4 = X.AnonymousClass1C6.A01(r0)
            if (r4 == 0) goto L_0x01c5
            boolean r4 = r4.contains(r2)
            if (r4 == 0) goto L_0x01c5
            java.util.ArrayList r13 = X.AnonymousClass1C6.A01(r0)
            if (r13 == 0) goto L_0x0232
            boolean r4 = r13.contains(r2)
            if (r4 == 0) goto L_0x0232
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r13)
            r4.remove(r2)
            java.lang.String r13 = ","
            java.lang.String r13 = android.text.TextUtils.join(r13, r4)
            X.12i r4 = r0.A00
            java.lang.String r0 = "call_not_spam_jids"
            r4.A04(r0, r13)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "spamManager/removeCallNotSpamProp/true: "
            r4.append(r0)
            r4.append(r13)
        L_0x01bd:
            java.lang.String r0 = r4.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r13 = 1
        L_0x01c5:
            if (r23 == 0) goto L_0x0722
            boolean r0 = r2 instanceof X.C28981Uw
            if (r0 != 0) goto L_0x0722
            X.3Qp r4 = new X.3Qp
            r4.<init>((X.AnonymousClass11F) r2)
            r11.A0I(r4, r2)
            r4.A04 = r13
            r4.A00 = r3
        L_0x01d7:
            X.2oy r0 = r4.A0Z
            if (r0 != 0) goto L_0x01f1
            X.2oy r11 = r6.A0L
            if (r11 != 0) goto L_0x01eb
            boolean r0 = X.AnonymousClass143.A0I(r2)
            if (r0 == 0) goto L_0x01f1
            X.1ER r0 = r5.A1Q
            X.2oy r11 = r0.A00(r2)
        L_0x01eb:
            X.2oy r0 = r4.A0Z
            if (r0 != 0) goto L_0x01f1
            r4.A0Z = r11
        L_0x01f1:
            if (r1 == 0) goto L_0x01f5
            r4.A0h = r1
        L_0x01f5:
            if (r15 == 0) goto L_0x01fb
            long r0 = r6.A0I
            r4.A0X = r0
        L_0x01fb:
            if (r23 == 0) goto L_0x0207
            r4.A0d = r6
            long r0 = r6.A1N
            r4.A0U = r0
            long r0 = r6.A1O
            r4.A0V = r0
        L_0x0207:
            if (r9 == 0) goto L_0x0211
            long r0 = r6.A1N
            r4.A0P = r0
            long r0 = r6.A1O
            r4.A0Q = r0
        L_0x0211:
            long r0 = r4.A0R
            r13 = 0
            int r9 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r9 != 0) goto L_0x0225
            long r0 = r6.A1N
            r13 = 1
            long r0 = r0 - r13
            r4.A0R = r0
            long r0 = r6.A1O
            long r0 = r0 - r13
            r4.A0S = r0
        L_0x0225:
            X.0wo r0 = r5.A0C
            r23 = r0
            long r0 = X.C19970wo.A00(r23)
            monitor-enter(r4)
            if (r17 == 0) goto L_0x03ca
            goto L_0x03bd
        L_0x0232:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "spamManager/removeCallNotSpamProp/false/not spam jids: "
            r4.append(r0)
            r4.append(r13)
            goto L_0x01bd
        L_0x0241:
            int r11 = r4.A04
            r0 = -1
            if (r11 == r0) goto L_0x024b
            r0 = -2
            if (r11 == r0) goto L_0x024b
            if (r11 != 0) goto L_0x01d7
        L_0x024b:
            if (r14 == 0) goto L_0x01d7
            if (r16 != 0) goto L_0x01d7
            r4.A04 = r3
            X.1DQ r0 = r5.A0T
            android.os.Handler r11 = r0.A02
            r0 = 12
            android.os.Message r0 = android.os.Message.obtain(r11, r0, r6)
            r0.sendToTarget()
            goto L_0x01d7
        L_0x0260:
            boolean r0 = X.C66013Ui.A0w(r6, r13)
            if (r0 == 0) goto L_0x0176
            boolean r0 = r6 instanceof X.C106265Iz
            if (r0 == 0) goto L_0x027b
            r0 = r6
            X.5Iz r0 = (X.C106265Iz) r0
            boolean r0 = r0.A1X()
            if (r0 == 0) goto L_0x027b
            r0 = r26
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x027b
            goto L_0x0176
        L_0x027b:
            if (r10 == 0) goto L_0x02bd
            r0 = r6
            X.2bI r0 = (X.AnonymousClass2bI) r0
            int r13 = r0.A00
            r0 = 4
            if (r13 == r0) goto L_0x02ee
            r0 = 5
            if (r13 == r0) goto L_0x0176
            r0 = 6
            if (r13 == r0) goto L_0x0176
            r0 = 7
            if (r13 == r0) goto L_0x02ee
            r0 = 20
            if (r13 == r0) goto L_0x02f7
            r0 = 21
            if (r13 == r0) goto L_0x0176
            r0 = 79
            if (r13 == r0) goto L_0x02f7
            r0 = 80
            if (r13 == r0) goto L_0x0176
            r0 = 93
            if (r13 == r0) goto L_0x0176
            r0 = 94
            if (r13 == r0) goto L_0x0176
            r0 = 97
            if (r13 == r0) goto L_0x02d5
            r0 = 98
            if (r13 == r0) goto L_0x0176
            switch(r13) {
                case 10: goto L_0x0176;
                case 12: goto L_0x02f7;
                case 13: goto L_0x02f7;
                case 14: goto L_0x02f7;
                case 15: goto L_0x0176;
                case 16: goto L_0x0176;
                case 17: goto L_0x0176;
                case 37: goto L_0x0176;
                case 39: goto L_0x0176;
                case 44: goto L_0x0176;
                case 56: goto L_0x0176;
                case 59: goto L_0x0176;
                case 68: goto L_0x0176;
                case 90: goto L_0x02f7;
                case 105: goto L_0x0176;
                case 106: goto L_0x02f7;
                case 116: goto L_0x0176;
                case 123: goto L_0x02f7;
                case 124: goto L_0x02f7;
                case 126: goto L_0x02f7;
                case 127: goto L_0x02f7;
                case 130: goto L_0x0176;
                case 131: goto L_0x0176;
                case 137: goto L_0x0176;
                case 138: goto L_0x0176;
                case 140: goto L_0x0176;
                case 141: goto L_0x0176;
                case 144: goto L_0x02f7;
                case 149: goto L_0x02f7;
                case 150: goto L_0x0176;
                case 151: goto L_0x0176;
                case 152: goto L_0x0176;
                default: goto L_0x02b1;
            }
        L_0x02b1:
            switch(r13) {
                case 27: goto L_0x0176;
                case 28: goto L_0x0176;
                case 29: goto L_0x0176;
                case 30: goto L_0x0176;
                case 31: goto L_0x0176;
                case 32: goto L_0x0176;
                default: goto L_0x02b4;
            }
        L_0x02b4:
            switch(r13) {
                case 51: goto L_0x0176;
                case 52: goto L_0x02f7;
                case 53: goto L_0x0176;
                case 54: goto L_0x0176;
                default: goto L_0x02b7;
            }
        L_0x02b7:
            switch(r13) {
                case 73: goto L_0x0176;
                case 74: goto L_0x0176;
                case 75: goto L_0x02c0;
                case 76: goto L_0x0176;
                default: goto L_0x02ba;
            }
        L_0x02ba:
            switch(r13) {
                case 84: goto L_0x0176;
                case 85: goto L_0x0176;
                case 86: goto L_0x0176;
                case 87: goto L_0x0176;
                default: goto L_0x02bd;
            }
        L_0x02bd:
            r15 = 1
            goto L_0x0177
        L_0x02c0:
            boolean r0 = r6 instanceof X.C181408nQ
            if (r0 == 0) goto L_0x02bd
            r14 = r6
            X.8nQ r14 = (X.C181408nQ) r14
            java.lang.Integer r0 = r14.A02
            if (r0 == 0) goto L_0x02bd
            int r13 = r0.intValue()
            r0 = 2
            if (r13 != r0) goto L_0x02bd
            int r0 = r14.A00
            goto L_0x0308
        L_0x02d5:
            boolean r0 = r6 instanceof X.C181228n8
            if (r0 == 0) goto L_0x02bd
            r0 = r6
            X.8n8 r0 = (X.C181228n8) r0
            boolean r0 = r0.A01
            r14 = 2787(0xae3, float:3.905E-42)
            if (r0 == 0) goto L_0x02e4
            r14 = 2788(0xae4, float:3.907E-42)
        L_0x02e4:
            X.0yV r13 = X.C21000yV.A02
            r0 = r24
            boolean r15 = X.C20800yB.A01(r13, r0, r14)
            goto L_0x0177
        L_0x02ee:
            X.11F r0 = r6.A0J()
            boolean r0 = r7.A0M(r0)
            goto L_0x0308
        L_0x02f7:
            r0 = r6
            X.8nz r0 = (X.C181758nz) r0
            java.util.List r13 = r0.A01
            r7.A0G()
            com.whatsapp.jid.PhoneUserJid r0 = r7.A03
            X.C18740tg.A06(r0)
            boolean r0 = r13.contains(r0)
        L_0x0308:
            if (r0 != 0) goto L_0x02bd
            goto L_0x0176
        L_0x030c:
            if (r4 != 0) goto L_0x0136
            r13 = 0
            goto L_0x013f
        L_0x0311:
            r19 = 0
            r1 = 0
            r16 = 1
            if (r7 == r12) goto L_0x0118
            goto L_0x0116
        L_0x031a:
            long r0 = r6.A0I
            java.lang.Long r19 = java.lang.Long.valueOf(r0)
            r1 = r6
            X.8ny r1 = (X.C181748ny) r1
            r0 = 2
            java.lang.String r1 = r1.A1d(r0)
            goto L_0x0116
        L_0x032a:
            long r0 = r6.A0I
            java.lang.Long r19 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = r6.A0b()
            goto L_0x0116
        L_0x0336:
            r1 = 0
            r19 = 0
            r16 = 0
            goto L_0x0122
        L_0x033d:
            if (r8 != r7) goto L_0x0344
            r9 = 0
            r22 = 0
            goto L_0x00e4
        L_0x0344:
            int r0 = r11.A02(r2)
            if (r0 > 0) goto L_0x0365
            X.1G5 r0 = r5.A1L
            X.1G6 r0 = r0.A00()
            boolean r0 = r0.A01(r2)
            if (r0 == 0) goto L_0x0365
            r0 = r26
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0363
            r0 = 13
            r6.A0n(r0)
            r6.A1Z = r3
        L_0x0363:
            r6.A11 = r3
        L_0x0365:
            boolean r9 = r6.A11
            if (r9 != 0) goto L_0x03b2
            r0 = r26
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x038a
            X.1Cw r0 = r5.A1j
            boolean r0 = r0.A00(r6)
            if (r0 != 0) goto L_0x038a
            if (r10 == 0) goto L_0x03b2
            r0 = r6
            X.2bI r0 = (X.AnonymousClass2bI) r0
            int r0 = r0.A00
            java.util.Set r1 = X.C56672wh.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x03b2
        L_0x038a:
            boolean r0 = X.C66013Ui.A0j(r6)
            if (r0 != 0) goto L_0x03b2
            X.0wQ r0 = r5.A07
            boolean r0 = X.C66013Ui.A0O(r0, r6)
            r21 = 0
            if (r0 == 0) goto L_0x039c
            r21 = 1
        L_0x039c:
            r17 = 1
        L_0x039e:
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            boolean r0 = r6.A1T(r0)
            if (r0 == 0) goto L_0x03b7
            int r0 = r4.A05
            int r0 = r0 + 1
            r4.A05 = r0
            r22 = 0
            r18 = 0
            goto L_0x00e8
        L_0x03b2:
            r21 = 0
            r17 = 0
            goto L_0x039e
        L_0x03b7:
            r22 = 0
            r18 = 1
            goto L_0x00ea
        L_0x03bd:
            int r9 = r4.A08     // Catch:{ all -> 0x0757 }
            if (r9 > 0) goto L_0x03c6
            r4.A08 = r3     // Catch:{ all -> 0x0757 }
            r4.A0Y = r0     // Catch:{ all -> 0x0757 }
            goto L_0x03ca
        L_0x03c6:
            int r0 = r9 + 1
            r4.A08 = r0     // Catch:{ all -> 0x0757 }
        L_0x03ca:
            if (r21 == 0) goto L_0x03d7
            int r0 = r4.A06     // Catch:{ all -> 0x0757 }
            if (r0 > 0) goto L_0x03d3
            r4.A06 = r3     // Catch:{ all -> 0x0757 }
            goto L_0x03d7
        L_0x03d3:
            int r0 = r0 + 1
            r4.A06 = r0     // Catch:{ all -> 0x0757 }
        L_0x03d7:
            if (r22 == 0) goto L_0x03df
            int r0 = r4.A09     // Catch:{ all -> 0x0757 }
            int r0 = r0 + 1
            r4.A09 = r0     // Catch:{ all -> 0x0757 }
        L_0x03df:
            if (r18 == 0) goto L_0x03ef
            int r0 = r4.A08     // Catch:{ all -> 0x0757 }
            if (r0 > 0) goto L_0x03e9
            int r0 = r4.A09     // Catch:{ all -> 0x0757 }
            if (r0 <= 0) goto L_0x03ef
        L_0x03e9:
            int r0 = r4.A0A     // Catch:{ all -> 0x0757 }
            int r0 = r0 + 1
            r4.A0A = r0     // Catch:{ all -> 0x0757 }
        L_0x03ef:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0757 }
            r1.<init>()     // Catch:{ all -> 0x0757 }
            java.lang.String r0 = "chatInfo/addUnseen/"
            r1.append(r0)     // Catch:{ all -> 0x0757 }
            java.lang.String r0 = r4.A09()     // Catch:{ all -> 0x0757 }
            r1.append(r0)     // Catch:{ all -> 0x0757 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0757 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0757 }
            monitor-exit(r4)
            r0 = r26
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x041f
            boolean r0 = r6.A1Y
            if (r0 == 0) goto L_0x041f
            int r0 = r4.A08
            if (r0 >= 0) goto L_0x041f
            monitor-enter(r4)
            r0 = 0
            r4.A08 = r0     // Catch:{ all -> 0x0757 }
            r0 = 0
            r4.A0Y = r0     // Catch:{ all -> 0x0757 }
            monitor-exit(r4)
        L_0x041f:
            long r0 = r6.A1N
            r4.A0N = r0
            long r0 = r6.A1O
            r4.A0O = r0
            r4.A0c = r12
            if (r17 == 0) goto L_0x0435
            boolean r0 = X.C66013Ui.A0O(r7, r6)
            if (r0 == 0) goto L_0x0435
            long r0 = r6.A1N
            r4.A0L = r0
        L_0x0435:
            r0 = 36
            r16 = 1000(0x3e8, double:4.94E-321)
            if (r8 != r0) goto L_0x06c1
            r12 = r6
            X.2bH r12 = (X.AnonymousClass2bH) r12
            int r13 = r12.A00
            X.3Qa r0 = r12.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x06bd
            int r11 = r12.A04
            X.3un r0 = r4.A0b
            long r0 = r0.ephemeralSettingTimestamp
            long r0 = r0 + r16
            r9 = 4
            r7 = 3
            if (r11 == r9) goto L_0x0453
        L_0x0452:
            r7 = 0
        L_0x0453:
            r4.A0C(r13, r0, r7)
            int r1 = r12.A04
            java.lang.Boolean r0 = r12.A0d
            boolean r18 = r4.A0I(r0, r1)
        L_0x045e:
            boolean r0 = r6 instanceof X.AnonymousClass2cF
            if (r0 == 0) goto L_0x0485
            r0 = r6
            X.2cF r0 = (X.AnonymousClass2cF) r0
            int r9 = r0.A00
            java.lang.Long r0 = r6.A0f
            X.C18740tg.A06(r0)
            long r0 = r0.longValue()
            int r7 = r6.A00
            r4.A0C(r9, r0, r7)
            if (r18 != 0) goto L_0x0483
            int r1 = r6.A04
            java.lang.Boolean r0 = r6.A0d
            boolean r0 = r4.A0I(r0, r1)
            r18 = 0
            if (r0 == 0) goto L_0x0485
        L_0x0483:
            r18 = 1
        L_0x0485:
            boolean r0 = r6 instanceof X.C181158n1
            if (r0 == 0) goto L_0x04ac
            r0 = r6
            X.8n1 r0 = (X.C181158n1) r0
            int r9 = r0.A00
            java.lang.Long r0 = r6.A0f
            X.C18740tg.A06(r0)
            long r0 = r0.longValue()
            int r7 = r6.A00
            r4.A0C(r9, r0, r7)
            if (r18 != 0) goto L_0x04aa
            int r1 = r6.A04
            java.lang.Boolean r0 = r6.A0d
            boolean r0 = r4.A0I(r0, r1)
            r18 = 0
            if (r0 == 0) goto L_0x04ac
        L_0x04aa:
            r18 = 1
        L_0x04ac:
            boolean r0 = r6.A1G()
            if (r0 == 0) goto L_0x04f7
            int r7 = r6.A05
            X.3un r1 = r4.A0b
            int r0 = r1.expiration
            if (r7 != r0) goto L_0x04f7
            java.lang.Long r9 = r6.A0f
            if (r9 == 0) goto L_0x04f7
            X.C18740tg.A06(r9)
            long r11 = r9.longValue()
            long r0 = r1.ephemeralSettingTimestamp
            int r7 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r7 <= 0) goto L_0x04f7
            long r11 = r9.longValue()
            long r0 = r6.A0I
            int r7 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r7 > 0) goto L_0x04f7
            X.3un r0 = r4.A0b
            int r9 = r0.expiration
            java.lang.Long r0 = r6.A0f
            X.C18740tg.A06(r0)
            long r0 = r0.longValue()
            int r7 = r6.A00
            r4.A0C(r9, r0, r7)
            if (r18 != 0) goto L_0x04f5
            int r1 = r6.A04
            java.lang.Boolean r0 = r6.A0d
            boolean r0 = r4.A0I(r0, r1)
            r18 = 0
            if (r0 == 0) goto L_0x04f7
        L_0x04f5:
            r18 = 1
        L_0x04f7:
            boolean r0 = r6 instanceof X.C181458nV
            if (r0 == 0) goto L_0x0516
            r0 = r6
            X.8nV r0 = (X.C181458nV) r0
            int r9 = r0.A00
            r0 = 0
            r7 = 0
            r4.A0C(r9, r0, r7)
            if (r18 != 0) goto L_0x0514
            int r1 = r6.A04
            java.lang.Boolean r0 = r6.A0d
            boolean r0 = r4.A0I(r0, r1)
            r18 = 0
            if (r0 == 0) goto L_0x0516
        L_0x0514:
            r18 = 1
        L_0x0516:
            boolean r0 = r6 instanceof X.C181408nQ
            if (r0 == 0) goto L_0x053a
            java.lang.String r0 = "CoreMessageStore/set group type"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = r6
            X.8nQ r0 = (X.C181408nQ) r0
            int r7 = r0.A00
            int r1 = r0.A00
            r0 = 0
            if (r1 == r3) goto L_0x052a
            r0 = 1
        L_0x052a:
            r4.A02 = r7
            if (r7 != r3) goto L_0x053a
            if (r0 == 0) goto L_0x053a
            long r0 = X.C19970wo.A00(r23)
            long r0 = r0 / r16
            r4.A0I = r0
            r20 = 1
        L_0x053a:
            boolean r0 = r6 instanceof X.C181758nz
            if (r0 == 0) goto L_0x0585
            r0 = r6
            X.2bI r0 = (X.AnonymousClass2bI) r0
            int r1 = r0.A00
            java.util.Set r0 = X.C56672wh.A01
            r0 = 122(0x7a, float:1.71E-43)
            if (r1 == r0) goto L_0x0559
            r0 = 123(0x7b, float:1.72E-43)
            if (r1 == r0) goto L_0x0559
            r0 = 124(0x7c, float:1.74E-43)
            if (r1 == r0) goto L_0x0559
            r0 = 144(0x90, float:2.02E-43)
            if (r1 == r0) goto L_0x0559
            r0 = 125(0x7d, float:1.75E-43)
            if (r1 != r0) goto L_0x0564
        L_0x0559:
            r0 = r6
            X.8nx r0 = (X.C181738nx) r0
            int r0 = r0.A1g()
            r4.A02 = r0
            r20 = 1
        L_0x0564:
            r0 = 126(0x7e, float:1.77E-43)
            if (r1 == r0) goto L_0x057c
            r0 = 127(0x7f, float:1.78E-43)
            if (r1 == r0) goto L_0x057c
            r0 = 128(0x80, float:1.794E-43)
            if (r1 == r0) goto L_0x057c
            r0 = 143(0x8f, float:2.0E-43)
            if (r1 == r0) goto L_0x057c
            r0 = 148(0x94, float:2.07E-43)
            if (r1 == r0) goto L_0x057c
            r0 = 149(0x95, float:2.09E-43)
            if (r1 != r0) goto L_0x0585
        L_0x057c:
            r0 = r6
            X.8nx r0 = (X.C181738nx) r0
            int r0 = r0.A1g()
            r4.A02 = r0
        L_0x0585:
            boolean r0 = r6 instanceof X.C181728nw
            if (r0 == 0) goto L_0x05a3
            r1 = r6
            X.8nw r1 = (X.C181728nw) r1
            boolean r0 = r1 instanceof X.C181548ne
            if (r0 == 0) goto L_0x06a1
            r0 = 0
        L_0x0591:
            r4.A02 = r0
            if (r0 != r3) goto L_0x05a3
            int r0 = r1.A00
            if (r0 == r3) goto L_0x05a3
            long r0 = X.C19970wo.A00(r23)
            long r0 = r0 / r16
            r4.A0I = r0
            r20 = 1
        L_0x05a3:
            if (r10 == 0) goto L_0x066a
            boolean r0 = r2 instanceof com.whatsapp.jid.GroupJid
            if (r0 == 0) goto L_0x066a
            r0 = r6
            X.2bI r0 = (X.AnonymousClass2bI) r0
            int r13 = r0.A00
            r0 = 11
            r1 = 167(0xa7, float:2.34E-43)
            if (r13 == r0) goto L_0x05b6
            if (r13 != r1) goto L_0x066a
        L_0x05b6:
            r7 = r2
            com.whatsapp.jid.GroupJid r7 = (com.whatsapp.jid.GroupJid) r7
            X.1FG r10 = r5.A1J
            r11 = 0
            X.AnonymousClass00C.A0D(r7, r11)
            X.00T r0 = r10.A01
            r21 = r0
            java.lang.Object r12 = r21.getValue()
            android.content.SharedPreferences r12 = (android.content.SharedPreferences) r12
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "create_"
            r9.append(r0)
            java.lang.String r0 = r7.getRawString()
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            int r12 = r12.getInt(r0, r11)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "CommunitySharedPrefs/ getTempGroupType()/groupType = "
            r9.append(r0)
            r9.append(r12)
            java.lang.String r0 = r9.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r14 = r21.getValue()
            android.content.SharedPreferences r14 = (android.content.SharedPreferences) r14
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r9 = "closed_"
            r15.append(r9)
            java.lang.String r0 = r7.getRawString()
            r15.append(r0)
            java.lang.String r0 = r15.toString()
            boolean r11 = r14.getBoolean(r0, r11)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "CommunitySharedPrefs/ getTempGroupType()/isClosed = "
            r14.append(r0)
            r14.append(r11)
            java.lang.String r0 = r14.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r13 != r1) goto L_0x068a
            java.lang.String r0 = "CoreMessageStore/updateChatsListForNewMessage/set group type parent (1)"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r4.A02 = r3
        L_0x0632:
            if (r11 == 0) goto L_0x063b
            r4.A0n = r3
            X.1Eu r0 = r5.A1R
            r0.A00(r4)
        L_0x063b:
            r10.A00(r7)
            java.lang.String r0 = "CommunitySharedPrefs/ clearTempIsClosed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r0 = r21.getValue()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            android.content.SharedPreferences$Editor r3 = r0.edit()
            X.AnonymousClass00C.A08(r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            java.lang.String r0 = r7.getRawString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.content.SharedPreferences$Editor r0 = r3.remove(r0)
            r0.apply()
        L_0x066a:
            if (r20 == 0) goto L_0x06da
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "CoreMessageStore/community activity key="
            r1.append(r0)
            r0 = r26
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            long r0 = X.C19970wo.A00(r23)
            long r0 = r0 / r16
            monitor-enter(r4)
            goto L_0x06c5
        L_0x068a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "CoreMessageStore/updateChatsListForNewMessage/set group type = "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r4.A02 = r12
            goto L_0x0632
        L_0x06a1:
            boolean r0 = r1 instanceof X.C181538nd
            if (r0 == 0) goto L_0x06a8
            r0 = 1
            goto L_0x0591
        L_0x06a8:
            boolean r0 = r1 instanceof X.C181558nf
            if (r0 == 0) goto L_0x06b3
            r0 = r1
            X.8nf r0 = (X.C181558nf) r0
            int r0 = r0.A00
            goto L_0x0591
        L_0x06b3:
            boolean r0 = r1 instanceof X.C181528nc
            if (r0 == 0) goto L_0x06ba
            r0 = 3
            goto L_0x0591
        L_0x06ba:
            r0 = 2
            goto L_0x0591
        L_0x06bd:
            long r0 = r12.A0I
            goto L_0x0452
        L_0x06c1:
            r18 = 0
            goto L_0x045e
        L_0x06c5:
            r4.A0K = r0     // Catch:{ all -> 0x0757 }
            monitor-exit(r4)
            android.content.SharedPreferences$Editor r7 = X.C19420v0.A00(r25)
            java.lang.String r3 = "last_community_activity"
            android.content.SharedPreferences$Editor r0 = r7.putLong(r3, r0)
            r0.apply()
            X.1Eu r0 = r5.A1R
            r0.A00(r4)
        L_0x06da:
            r0 = 2097152(0x200000, float:2.938736E-39)
            boolean r0 = r6.A1T(r0)
            if (r0 == 0) goto L_0x06ed
            X.11F r0 = r4.A06()
            boolean r0 = r0 instanceof X.C177538dx
            if (r0 == 0) goto L_0x06ed
            r0 = 5
            r4.A02 = r0
        L_0x06ed:
            if (r18 == 0) goto L_0x0700
            r3 = 5309(0x14bd, float:7.44E-42)
            X.0yV r1 = X.C21000yV.A02
            r0 = r24
            boolean r0 = X.C20800yB.A01(r1, r0, r3)
            if (r0 == 0) goto L_0x0700
            X.1Fm r0 = r5.A1S
            r0.A00(r4)
        L_0x0700:
            X.163 r1 = r5.A0H
            r0 = r19
            android.content.ContentValues r0 = r4.A05(r0)
            boolean r0 = r1.A0K(r0, r4)
            if (r0 != 0) goto L_0x0722
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "CoreMessageStore/addmsg/chatlist/insert/failed gid="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0722:
            r0 = r26
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x001c
            int r1 = r6.A0D
            r0 = 6
            if (r1 == r0) goto L_0x001c
            X.1FI r4 = r5.A0Q
            java.util.Map r3 = r4.A03()
            X.3IJ r1 = new X.3IJ
            r1.<init>(r2, r8)
            java.lang.Object r0 = r3.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            r6 = 1
            if (r0 != 0) goto L_0x0750
            r0 = 1
        L_0x0742:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r3.put(r1, r5)
            X.12P r0 = r4.A03
            X.1M0 r3 = r0.A05()
            goto L_0x075a
        L_0x0750:
            int r0 = r0.intValue()
            int r0 = r0 + 1
            goto L_0x0742
        L_0x0757:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x075a:
            X.71s r7 = r3.B1k()     // Catch:{ all -> 0x07a8 }
            android.content.ContentValues r10 = new android.content.ContentValues     // Catch:{ all -> 0x079e }
            r10.<init>(r6)     // Catch:{ all -> 0x079e }
            java.lang.String r0 = "message_count"
            r10.put(r0, r5)     // Catch:{ all -> 0x079e }
            X.14e r9 = r3.A02     // Catch:{ all -> 0x079e }
            java.lang.String r11 = "frequents"
            java.lang.String r12 = "jid = ? AND type = ?"
            r0 = 2
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch:{ all -> 0x079e }
            java.lang.String r0 = r2.getRawString()     // Catch:{ all -> 0x079e }
            r1 = 0
            r14[r1] = r0     // Catch:{ all -> 0x079e }
            java.lang.String r0 = java.lang.Integer.toString(r8)     // Catch:{ all -> 0x079e }
            r14[r6] = r0     // Catch:{ all -> 0x079e }
            java.lang.String r13 = "updateFrequents/UPDATE_FREQUENTS_LEGACY"
            int r0 = r9.A01(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x079e }
            if (r0 != 0) goto L_0x078d
            int r0 = r5.intValue()     // Catch:{ all -> 0x079e }
            X.AnonymousClass1FI.A01(r3, r2, r8, r0)     // Catch:{ all -> 0x079e }
        L_0x078d:
            int r0 = r5.intValue()     // Catch:{ all -> 0x079e }
            X.AnonymousClass1FI.A00(r4, r2, r8, r0, r1)     // Catch:{ all -> 0x079e }
            r7.A00()     // Catch:{ all -> 0x079e }
            r7.close()     // Catch:{ all -> 0x07a8 }
            r3.close()
            return
        L_0x079e:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x07a3 }
            goto L_0x07a7
        L_0x07a3:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x07a8 }
        L_0x07a7:
            throw r1     // Catch:{ all -> 0x07a8 }
        L_0x07a8:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x07ad }
            throw r1
        L_0x07ad:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20310xM.A0i(X.3T1):void");
    }

    public void A0k(AnonymousClass3T1 r6) {
        if (r6.A1N < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("CoreMessageStore/updateMessageAsync/message must have row_id set; key=");
            sb.append(r6.A1J);
            C18740tg.A0D(false, sb.toString());
        }
        A0n(r6, -1);
    }

    public void A0m(AnonymousClass3T1 r6, int i) {
        AnonymousClass1DT r1 = this.A08;
        if (r1.A0a) {
            r1.A0N.A04(r6.A1J.A01.hashCode(), 4, -1, r6.A1I);
        }
        this.A0F.A01(new C35261iP((Object) this, i, 20, (Object) r6), 26);
    }

    public void A0n(AnonymousClass3T1 r4, int i) {
        this.A0F.A01(new C35261iP((Object) this, i, 21, (Object) r4), 22);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void A0p(X.AnonymousClass3T1 r33, int r34, boolean r35, boolean r36) {
        /*
            r32 = this;
            r9 = r32
            X.0v5 r1 = r9.A01
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x0015
            r1.A02()
            java.lang.String r1 = "beforeRemoveAllLabelsFromMessage"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0015:
            X.12P r0 = r9.A0c
            X.1M0 r18 = r0.A05()
            X.71s r19 = r18.B1k()     // Catch:{ all -> 0x05f0 }
            X.1A1 r0 = r9.A1B     // Catch:{ all -> 0x05e6 }
            r17 = r0
            r6 = 0
            r4 = r33
            X.AnonymousClass00C.A0D(r4, r6)     // Catch:{ all -> 0x05e6 }
            X.1A0 r12 = r0.A00     // Catch:{ all -> 0x05e6 }
            X.0yC r1 = r12.A02     // Catch:{ all -> 0x05e6 }
            r0 = 6834(0x1ab2, float:9.576E-42)
            X.0yV r7 = X.C21000yV.A02     // Catch:{ all -> 0x05e6 }
            boolean r0 = X.C20800yB.A01(r7, r1, r0)     // Catch:{ all -> 0x05e6 }
            r23 = r34
            r15 = r35
            r25 = r36
            if (r0 == 0) goto L_0x017f
            r11 = 0
            X.12P r0 = r12.A01     // Catch:{ all -> 0x0144 }
            X.1M0 r10 = r0.A05()     // Catch:{ all -> 0x0144 }
            X.71s r14 = r10.B1k()     // Catch:{ all -> 0x013d }
            X.17P r8 = r12.A03     // Catch:{ all -> 0x0136 }
            X.4LP r6 = new X.4LP     // Catch:{ all -> 0x0136 }
            r6.<init>(r10)     // Catch:{ all -> 0x0136 }
            int r3 = r4.A0H()     // Catch:{ all -> 0x0136 }
            r2 = 1
            if (r3 == r2) goto L_0x0057
            r2 = 0
        L_0x0057:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0136 }
            r1.<init>()     // Catch:{ all -> 0x0136 }
            java.lang.String r0 = "Should only delete message marked as MAIN; storageType="
            r1.append(r0)     // Catch:{ all -> 0x0136 }
            r1.append(r3)     // Catch:{ all -> 0x0136 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0136 }
            X.C18740tg.A0D(r2, r0)     // Catch:{ all -> 0x0136 }
            X.176 r0 = r8.A02     // Catch:{ all -> 0x0136 }
            X.3Qa r5 = r4.A1J     // Catch:{ all -> 0x0136 }
            r0.A0C(r5)     // Catch:{ all -> 0x0136 }
            r0 = 1
            r4.A1P = r0     // Catch:{ all -> 0x0136 }
            X.00T r0 = r8.A0B     // Catch:{ all -> 0x0136 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x0136 }
            X.9XG r1 = (X.AnonymousClass9XG) r1     // Catch:{ all -> 0x0136 }
            int r0 = r4.A1I     // Catch:{ all -> 0x0136 }
            X.0ow r0 = r1.A00(r0)     // Catch:{ all -> 0x0136 }
            boolean r1 = r0 instanceof X.C78353ry     // Catch:{ all -> 0x0136 }
            if (r1 == 0) goto L_0x00bb
            X.3ry r0 = (X.C78353ry) r0     // Catch:{ all -> 0x0136 }
            if (r0 == 0) goto L_0x00bc
            java.lang.Class r2 = r0.getClass()     // Catch:{ all -> 0x0136 }
        L_0x008f:
            X.08f r1 = new X.08f     // Catch:{ all -> 0x0136 }
            r1.<init>(r2)     // Catch:{ all -> 0x0136 }
            r22 = 0
            X.005 r1 = r8.A05     // Catch:{ all -> 0x0136 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0136 }
            X.AnonymousClass00C.A08(r1)     // Catch:{ all -> 0x0136 }
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ all -> 0x0136 }
            java.util.Iterator r2 = r1.iterator()     // Catch:{ all -> 0x0136 }
        L_0x00a5:
            boolean r1 = r2.hasNext()     // Catch:{ all -> 0x0136 }
            if (r1 == 0) goto L_0x00bf
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0136 }
            X.4S1 r1 = (X.AnonymousClass4S1) r1     // Catch:{ all -> 0x0136 }
            r20 = r1
            r21 = r4
            r24 = r15
            r20.BmJ(r21, r22, r23, r24, r25)     // Catch:{ all -> 0x0136 }
            goto L_0x00a5
        L_0x00bb:
            r0 = 0
        L_0x00bc:
            java.lang.Class<X.3ry> r2 = X.C78353ry.class
            goto L_0x008f
        L_0x00bf:
            if (r0 == 0) goto L_0x00e3
            r3 = 1
            r1 = r34 & 1
            if (r1 == r3) goto L_0x00c7
            r3 = 0
        L_0x00c7:
            X.005 r1 = r0.A01     // Catch:{ all -> 0x0136 }
            java.lang.Object r2 = r1.get()     // Catch:{ all -> 0x0136 }
            X.1DG r2 = (X.AnonymousClass1DG) r2     // Catch:{ all -> 0x0136 }
            r13 = r4
            X.2bU r13 = (X.AnonymousClass2bU) r13     // Catch:{ all -> 0x0136 }
            X.005 r0 = r0.A00     // Catch:{ all -> 0x0136 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0136 }
            X.0yB r1 = (X.C20800yB) r1     // Catch:{ all -> 0x0136 }
            r0 = 2364(0x93c, float:3.313E-42)
            boolean r0 = X.C20800yB.A01(r7, r1, r0)     // Catch:{ all -> 0x0136 }
            r2.A03(r13, r3, r0)     // Catch:{ all -> 0x0136 }
        L_0x00e3:
            java.lang.Object r0 = r6.invoke(r4)     // Catch:{ all -> 0x0136 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x0136 }
            int r2 = r0.intValue()     // Catch:{ all -> 0x0136 }
            if (r2 <= 0) goto L_0x0114
            X.005 r0 = r8.A04     // Catch:{ all -> 0x0136 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0136 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x0136 }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x0136 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0136 }
        L_0x00fe:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0136 }
            if (r0 == 0) goto L_0x0128
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0136 }
            X.4S1 r0 = (X.AnonymousClass4S1) r0     // Catch:{ all -> 0x0136 }
            r20 = r0
            r21 = r4
            r24 = r15
            r20.BmJ(r21, r22, r23, r24, r25)     // Catch:{ all -> 0x0136 }
            goto L_0x00fe
        L_0x0114:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0136 }
            r1.<init>()     // Catch:{ all -> 0x0136 }
            java.lang.String r0 = "FMessageDatabaseSubsystem/deletemsg/nothing-deleted "
            r1.append(r0)     // Catch:{ all -> 0x0136 }
            r1.append(r5)     // Catch:{ all -> 0x0136 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0136 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0136 }
        L_0x0128:
            r14.A00()     // Catch:{ all -> 0x0136 }
            r14.close()     // Catch:{ all -> 0x013d }
            r10.close()     // Catch:{ all -> 0x0144 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0144 }
            goto L_0x014a
        L_0x0136:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0138 }
        L_0x0138:
            r0 = move-exception
            X.C05600Qi.A00(r14, r1)     // Catch:{ all -> 0x013d }
            throw r0     // Catch:{ all -> 0x013d }
        L_0x013d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x013f }
        L_0x013f:
            r0 = move-exception
            X.C05600Qi.A00(r10, r1)     // Catch:{ all -> 0x0144 }
            throw r0     // Catch:{ all -> 0x0144 }
        L_0x0144:
            r0 = move-exception
            X.03N r1 = new X.03N     // Catch:{ all -> 0x05e6 }
            r1.<init>(r0)     // Catch:{ all -> 0x05e6 }
        L_0x014a:
            boolean r0 = r1 instanceof X.AnonymousClass03N     // Catch:{ all -> 0x05e6 }
            if (r0 == 0) goto L_0x0179
            java.lang.Throwable r1 = X.AnonymousClass0AK.A00(r1)     // Catch:{ all -> 0x05e6 }
            boolean r0 = r1 instanceof android.database.sqlite.SQLiteDoneException     // Catch:{ all -> 0x05e6 }
            if (r0 == 0) goto L_0x0163
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)     // Catch:{ all -> 0x05e6 }
        L_0x0159:
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ all -> 0x05e6 }
            if (r11 == 0) goto L_0x05dc
            int r14 = r11.intValue()     // Catch:{ all -> 0x05e6 }
            goto L_0x02ba
        L_0x0163:
            boolean r0 = r1 instanceof android.database.sqlite.SQLiteDatabaseCorruptException     // Catch:{ all -> 0x05e6 }
            if (r0 == 0) goto L_0x0170
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)     // Catch:{ all -> 0x05e6 }
            X.12s r0 = r12.A00     // Catch:{ all -> 0x05e6 }
            r0.A03()     // Catch:{ all -> 0x05e6 }
            goto L_0x0159
        L_0x0170:
            boolean r0 = r1 instanceof java.lang.RuntimeException     // Catch:{ all -> 0x05e6 }
            if (r0 != 0) goto L_0x017b
            boolean r0 = r1 instanceof java.lang.Error     // Catch:{ all -> 0x05e6 }
            if (r0 != 0) goto L_0x017b
            goto L_0x0159
        L_0x0179:
            r11 = r1
            goto L_0x0159
        L_0x017b:
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)     // Catch:{ all -> 0x05e6 }
            throw r1     // Catch:{ all -> 0x05e6 }
        L_0x017f:
            X.005 r0 = r12.A04     // Catch:{ all -> 0x05e6 }
            java.lang.Object r10 = r0.get()     // Catch:{ all -> 0x05e6 }
            X.0xM r10 = (X.C20310xM) r10     // Catch:{ all -> 0x05e6 }
            int r5 = r4.A0H()     // Catch:{ all -> 0x05e6 }
            r14 = 0
            r2 = 1
            r3 = 0
            if (r5 != r2) goto L_0x0191
            r3 = 1
        L_0x0191:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05e6 }
            r1.<init>()     // Catch:{ all -> 0x05e6 }
            java.lang.String r0 = "Should only delete message marked as MAIN; storageType="
            r1.append(r0)     // Catch:{ all -> 0x05e6 }
            r1.append(r5)     // Catch:{ all -> 0x05e6 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x05e6 }
            X.C18740tg.A0D(r3, r0)     // Catch:{ all -> 0x05e6 }
            r0 = r34 & 1
            r11 = 0
            if (r0 != r2) goto L_0x01ab
            r11 = 1
        L_0x01ab:
            X.12P r0 = r10.A0c     // Catch:{ SQLiteDoneException -> 0x02b6, SQLiteDatabaseCorruptException -> 0x02ac, Error | RuntimeException -> 0x055c }
            X.1M0 r8 = r0.A05()     // Catch:{ SQLiteDoneException -> 0x02b6, SQLiteDatabaseCorruptException -> 0x02ac, Error | RuntimeException -> 0x055c }
            X.71s r13 = r8.B1k()     // Catch:{ all -> 0x02a2 }
            X.176 r0 = r10.A0W     // Catch:{ all -> 0x0298 }
            X.3Qa r5 = r4.A1J     // Catch:{ all -> 0x0298 }
            r0.A0C(r5)     // Catch:{ all -> 0x0298 }
            r4.A1P = r2     // Catch:{ all -> 0x0298 }
            int r1 = r4.A1I     // Catch:{ all -> 0x0298 }
            boolean r0 = X.C66013Ui.A0J(r1)     // Catch:{ all -> 0x0298 }
            if (r0 != 0) goto L_0x01cc
            boolean r0 = X.C66013Ui.A0K(r1)     // Catch:{ all -> 0x0298 }
            if (r0 == 0) goto L_0x01dc
        L_0x01cc:
            X.1DG r3 = r10.A0V     // Catch:{ all -> 0x0298 }
            r1 = r4
            X.2bU r1 = (X.AnonymousClass2bU) r1     // Catch:{ all -> 0x0298 }
            X.0yC r12 = r10.A11     // Catch:{ all -> 0x0298 }
            r0 = 2364(0x93c, float:3.313E-42)
            boolean r0 = X.C20800yB.A01(r7, r12, r0)     // Catch:{ all -> 0x0298 }
            r3.A03(r1, r11, r0)     // Catch:{ all -> 0x0298 }
        L_0x01dc:
            X.3T1 r3 = r4.A0S()     // Catch:{ all -> 0x0298 }
            if (r3 == 0) goto L_0x01f7
            int r1 = r3.A1I     // Catch:{ all -> 0x0298 }
            r0 = 20
            if (r1 != r0) goto L_0x01f7
            X.1DG r1 = r10.A0V     // Catch:{ all -> 0x0298 }
            X.2bU r3 = (X.AnonymousClass2bU) r3     // Catch:{ all -> 0x0298 }
            X.0yC r12 = r10.A11     // Catch:{ all -> 0x0298 }
            r0 = 2364(0x93c, float:3.313E-42)
            boolean r0 = X.C20800yB.A01(r7, r12, r0)     // Catch:{ all -> 0x0298 }
            r1.A03(r3, r11, r0)     // Catch:{ all -> 0x0298 }
        L_0x01f7:
            X.0v5 r1 = r10.A01     // Catch:{ all -> 0x0298 }
            boolean r0 = r1.A05()     // Catch:{ all -> 0x0298 }
            if (r0 == 0) goto L_0x020a
            r1.A02()     // Catch:{ all -> 0x0298 }
            java.lang.String r1 = "removeAllLabelsFromMessage"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x0298 }
            r0.<init>(r1)     // Catch:{ all -> 0x0298 }
            throw r0     // Catch:{ all -> 0x0298 }
        L_0x020a:
            r3 = r34 & 32
            r0 = 32
            r1 = 0
            if (r3 != r0) goto L_0x0212
            r1 = 1
        L_0x0212:
            r0 = 16
            boolean r0 = r4.A1R(r0)     // Catch:{ all -> 0x0298 }
            if (r0 == 0) goto L_0x022d
            if (r1 == 0) goto L_0x021d
            goto L_0x0225
        L_0x021d:
            r1 = r34 | 32
            X.1Cx r0 = r10.A0Y     // Catch:{ all -> 0x0298 }
            r0.A02(r8, r4, r1, r15)     // Catch:{ all -> 0x0298 }
            goto L_0x022d
        L_0x0225:
            X.0wN r3 = r10.A04     // Catch:{ all -> 0x0298 }
            java.lang.String r1 = "IgnoredMessageWithComments"
            r0 = 0
            r3.A0E(r1, r0, r6)     // Catch:{ all -> 0x0298 }
        L_0x022d:
            X.1FZ r0 = r10.A0X     // Catch:{ all -> 0x0298 }
            r0.A02(r4, r2)     // Catch:{ all -> 0x0298 }
            r0 = 256(0x100, float:3.59E-43)
            boolean r0 = r4.A1R(r0)     // Catch:{ all -> 0x0298 }
            if (r0 == 0) goto L_0x024b
            X.1Fs r3 = r10.A17     // Catch:{ all -> 0x0298 }
            long r0 = r4.A1N     // Catch:{ all -> 0x0298 }
            r26 = r3
            r27 = r8
            r28 = r23
            r29 = r0
            r31 = r15
            r26.A00(r27, r28, r29, r31)     // Catch:{ all -> 0x0298 }
        L_0x024b:
            X.14e r12 = r8.A02     // Catch:{ all -> 0x0298 }
            java.lang.String r11 = "message"
            java.lang.String r3 = "_id=?"
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ all -> 0x0298 }
            long r0 = r4.A1N     // Catch:{ all -> 0x0298 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0298 }
            r2[r6] = r0     // Catch:{ all -> 0x0298 }
            java.lang.String r0 = "deleteMessageInBackground/DELETE_MESSAGE"
            int r14 = r12.A03(r11, r3, r0, r2)     // Catch:{ all -> 0x0298 }
            if (r14 <= 0) goto L_0x027c
            X.9lY r0 = r4.A0M     // Catch:{ all -> 0x0298 }
            if (r0 == 0) goto L_0x0273
            X.1EU r0 = r10.A19     // Catch:{ all -> 0x0298 }
            X.AnonymousClass1EU.A00(r0)     // Catch:{ all -> 0x0298 }
            X.1Ed r1 = r0.A05     // Catch:{ all -> 0x0298 }
            X.9lY r0 = r4.A0M     // Catch:{ all -> 0x0298 }
            r1.A0V(r0)     // Catch:{ all -> 0x0298 }
        L_0x0273:
            X.1EH r0 = r10.A0s     // Catch:{ all -> 0x0298 }
            r0.A02(r4)     // Catch:{ all -> 0x0298 }
        L_0x0278:
            r13.A00()     // Catch:{ all -> 0x0298 }
            goto L_0x0291
        L_0x027c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0298 }
            r1.<init>()     // Catch:{ all -> 0x0298 }
            java.lang.String r0 = "CoreMessageStore/deletemsg/nothing-deleted "
            r1.append(r0)     // Catch:{ all -> 0x0298 }
            r1.append(r5)     // Catch:{ all -> 0x0298 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0298 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0298 }
            goto L_0x0278
        L_0x0291:
            r13.close()     // Catch:{ all -> 0x02a2 }
            r8.close()     // Catch:{ SQLiteDoneException -> 0x02b6, SQLiteDatabaseCorruptException -> 0x02ac, Error | RuntimeException -> 0x055c }
            goto L_0x02ba
        L_0x0298:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x029d }
            goto L_0x02a1
        L_0x029d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x02a2 }
        L_0x02a1:
            throw r1     // Catch:{ all -> 0x02a2 }
        L_0x02a2:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x02a7 }
            goto L_0x02ab
        L_0x02a7:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDoneException -> 0x02b6, SQLiteDatabaseCorruptException -> 0x02ac, Error | RuntimeException -> 0x055c }
        L_0x02ab:
            throw r1     // Catch:{ SQLiteDoneException -> 0x02b6, SQLiteDatabaseCorruptException -> 0x02ac, Error | RuntimeException -> 0x055c }
        L_0x02ac:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x05e6 }
            X.12s r0 = r10.A0b     // Catch:{ all -> 0x05e6 }
            r0.A03()     // Catch:{ all -> 0x05e6 }
            goto L_0x02ba
        L_0x02b6:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x05e6 }
        L_0x02ba:
            if (r14 <= 0) goto L_0x05dc
            X.3Qa r12 = r4.A1J     // Catch:{ all -> 0x05e6 }
            X.11F r10 = r12.A00     // Catch:{ all -> 0x05e6 }
            boolean r0 = r10 instanceof X.C177528dw     // Catch:{ all -> 0x05e6 }
            r5 = 1
            r11 = 0
            if (r0 == 0) goto L_0x050a
            boolean r0 = X.C66013Ui.A0n(r4)     // Catch:{ all -> 0x05e6 }
            if (r0 != 0) goto L_0x05dc
            boolean r0 = X.C203359nq.A0C(r4)     // Catch:{ all -> 0x05e6 }
            if (r0 != 0) goto L_0x05dc
            if (r36 != 0) goto L_0x05dc
            com.whatsapp.jid.UserJid r7 = r4.A0L()     // Catch:{ all -> 0x05e6 }
            if (r7 != 0) goto L_0x02ee
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05e6 }
            r1.<init>()     // Catch:{ all -> 0x05e6 }
            java.lang.String r0 = "StatusStore/deletemsg/ remote resource is null or not a UserJid"
            r1.append(r0)     // Catch:{ all -> 0x05e6 }
            r1.append(r12)     // Catch:{ all -> 0x05e6 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x05e6 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x05e6 }
        L_0x02ee:
            X.16E r8 = r9.A0o     // Catch:{ all -> 0x05e6 }
            X.3Sz r6 = r8.A08(r7)     // Catch:{ all -> 0x05e6 }
            if (r6 != 0) goto L_0x032c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05e6 }
            r1.<init>()     // Catch:{ all -> 0x05e6 }
            java.lang.String r0 = "StatusStore/deletemsg/statuslist/no statusInfo for "
            r1.append(r0)     // Catch:{ all -> 0x05e6 }
            r1.append(r7)     // Catch:{ all -> 0x05e6 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x05e6 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x05e6 }
            X.0wN r3 = r8.A00     // Catch:{ all -> 0x05e6 }
            java.lang.String r2 = "deletingStatusMessage/StatusInfo for senderJid is null"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05e6 }
            r1.<init>()     // Catch:{ all -> 0x05e6 }
            java.lang.String r0 = "senderJid: "
            r1.append(r0)     // Catch:{ all -> 0x05e6 }
            r1.append(r7)     // Catch:{ all -> 0x05e6 }
            java.lang.String r0 = ", message: "
            r1.append(r0)     // Catch:{ all -> 0x05e6 }
            r1.append(r4)     // Catch:{ all -> 0x05e6 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x05e6 }
            r3.A0E(r2, r0, r5)     // Catch:{ all -> 0x05e6 }
            goto L_0x05dc
        L_0x032c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05e6 }
            r1.<init>()     // Catch:{ all -> 0x05e6 }
            java.lang.String r0 = "deleting message, StatusInfo before deletion: "
            r1.append(r0)     // Catch:{ all -> 0x05e6 }
            r1.append(r6)     // Catch:{ all -> 0x05e6 }
            java.lang.String r0 = " senderJid: "
            r1.append(r0)     // Catch:{ all -> 0x05e6 }
            r1.append(r7)     // Catch:{ all -> 0x05e6 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x05e6 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x05e6 }
            if (r35 != 0) goto L_0x0398
            monitor-enter(r6)     // Catch:{ all -> 0x05e6 }
            int r0 = r6.A00     // Catch:{ all -> 0x0559 }
            int r0 = r0 + -1
            r6.A00 = r0     // Catch:{ all -> 0x0559 }
            long r2 = r4.A1O     // Catch:{ all -> 0x0559 }
            long r0 = r6.A05     // Catch:{ all -> 0x0559 }
            int r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r12 <= 0) goto L_0x035f
            int r0 = r6.A01     // Catch:{ all -> 0x0559 }
            int r0 = r0 + -1
            r6.A01 = r0     // Catch:{ all -> 0x0559 }
        L_0x035f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0559 }
            r1.<init>()     // Catch:{ all -> 0x0559 }
            java.lang.String r0 = "msgstore/status-deleted/ "
            r1.append(r0)     // Catch:{ all -> 0x0559 }
            java.lang.String r0 = X.C65663Sz.A01(r4)     // Catch:{ all -> 0x0559 }
            r1.append(r0)     // Catch:{ all -> 0x0559 }
            java.lang.String r0 = " unseen:"
            r1.append(r0)     // Catch:{ all -> 0x0559 }
            int r0 = r6.A01     // Catch:{ all -> 0x0559 }
            r1.append(r0)     // Catch:{ all -> 0x0559 }
            java.lang.String r0 = " total:"
            r1.append(r0)     // Catch:{ all -> 0x0559 }
            int r0 = r6.A00     // Catch:{ all -> 0x0559 }
            r1.append(r0)     // Catch:{ all -> 0x0559 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0559 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0559 }
            int r0 = r6.A00     // Catch:{ all -> 0x0559 }
            if (r0 > 0) goto L_0x0391
            r2 = 0
            goto L_0x0395
        L_0x0391:
            X.3Sz r2 = r6.A06()     // Catch:{ all -> 0x0559 }
        L_0x0395:
            monitor-exit(r6)     // Catch:{ all -> 0x05e6 }
            goto L_0x0455
        L_0x0398:
            monitor-enter(r6)     // Catch:{ all -> 0x05e6 }
            monitor-enter(r6)     // Catch:{ all -> 0x0507 }
            int r0 = r6.A00     // Catch:{ all -> 0x0504 }
            if (r0 > r5) goto L_0x03a3
            X.C65663Sz.A01(r4)     // Catch:{ all -> 0x0504 }
            r2 = 0
            goto L_0x0403
        L_0x03a3:
            com.whatsapp.jid.UserJid r2 = r6.A09     // Catch:{ all -> 0x0504 }
            X.13z r1 = X.C223613z.A00     // Catch:{ all -> 0x0504 }
            r0 = 0
            if (r2 != r1) goto L_0x03ab
            r0 = 1
        L_0x03ab:
            r13 = -1
            if (r0 == 0) goto L_0x03b8
            long r2 = r4.A1O     // Catch:{ all -> 0x0504 }
            long r0 = r6.A04     // Catch:{ all -> 0x0504 }
            int r16 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r16 != 0) goto L_0x03e8
            goto L_0x03e0
        L_0x03b8:
            long r2 = r4.A1O     // Catch:{ all -> 0x0504 }
            long r0 = r6.A05     // Catch:{ all -> 0x0504 }
            int r16 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r16 == 0) goto L_0x03e0
            long r2 = r4.A1O     // Catch:{ all -> 0x0504 }
            long r0 = r6.A03     // Catch:{ all -> 0x0504 }
            int r16 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r16 < 0) goto L_0x03d0
            long r2 = r4.A1O     // Catch:{ all -> 0x0504 }
            long r0 = r6.A02     // Catch:{ all -> 0x0504 }
            int r16 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r16 <= 0) goto L_0x03e0
        L_0x03d0:
            long r2 = r4.A1O     // Catch:{ all -> 0x0504 }
            long r0 = r6.A06     // Catch:{ all -> 0x0504 }
            int r16 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r16 == 0) goto L_0x03e0
            long r2 = r4.A1O     // Catch:{ all -> 0x0504 }
            long r0 = r6.A04     // Catch:{ all -> 0x0504 }
            int r16 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r16 != 0) goto L_0x03e8
        L_0x03e0:
            r6.A04 = r13     // Catch:{ all -> 0x0504 }
            X.C65663Sz.A01(r4)     // Catch:{ all -> 0x0504 }
            monitor-exit(r6)     // Catch:{ all -> 0x0507 }
            r2 = r6
            goto L_0x0406
        L_0x03e8:
            int r0 = r6.A00     // Catch:{ all -> 0x0504 }
            int r0 = r0 - r5
            r6.A00 = r0     // Catch:{ all -> 0x0504 }
            long r2 = r4.A1O     // Catch:{ all -> 0x0504 }
            long r0 = r6.A05     // Catch:{ all -> 0x0504 }
            int r13 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r13 <= 0) goto L_0x03fc
            int r0 = r6.A01     // Catch:{ all -> 0x0504 }
            if (r0 <= 0) goto L_0x03fc
            int r0 = r0 - r5
            r6.A01 = r0     // Catch:{ all -> 0x0504 }
        L_0x03fc:
            X.C65663Sz.A01(r4)     // Catch:{ all -> 0x0504 }
            X.3Sz r2 = r6.A06()     // Catch:{ all -> 0x0504 }
        L_0x0403:
            monitor-exit(r6)     // Catch:{ all -> 0x0507 }
            if (r2 == 0) goto L_0x042d
        L_0x0406:
            long r16 = r2.A04()     // Catch:{ all -> 0x0507 }
            r13 = -1
            int r0 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x0427
            X.005 r0 = r8.A07     // Catch:{ all -> 0x0507 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0507 }
            X.1HT r1 = (X.AnonymousClass1HT) r1     // Catch:{ all -> 0x0507 }
            X.C18740tg.A00()     // Catch:{ all -> 0x0507 }
            com.whatsapp.jid.UserJid r0 = r2.A09     // Catch:{ all -> 0x0507 }
            java.util.ArrayList r0 = r1.A03(r0)     // Catch:{ all -> 0x0507 }
            X.3Sz r2 = X.AnonymousClass1HT.A00(r2, r1, r0)     // Catch:{ all -> 0x0507 }
            if (r2 == 0) goto L_0x042d
        L_0x0427:
            X.C18740tg.A06(r7)     // Catch:{ all -> 0x0507 }
            r8.A0D(r2, r7)     // Catch:{ all -> 0x0507 }
        L_0x042d:
            monitor-exit(r6)     // Catch:{ all -> 0x0507 }
            boolean r0 = r12.A02     // Catch:{ all -> 0x05e6 }
            if (r0 != 0) goto L_0x0455
            if (r7 == 0) goto L_0x0455
            boolean r0 = r7 instanceof X.C177638e7     // Catch:{ all -> 0x05e6 }
            if (r0 != 0) goto L_0x0455
            boolean r12 = X.C203359nq.A0B(r6, r4)     // Catch:{ all -> 0x05e6 }
            X.16G r3 = r8.A06     // Catch:{ all -> 0x05e6 }
            java.lang.String r0 = r7.user     // Catch:{ all -> 0x05e6 }
            java.util.Set r1 = java.util.Collections.singleton(r0)     // Catch:{ all -> 0x05e6 }
            if (r12 == 0) goto L_0x0450
            java.lang.String r0 = r7.user     // Catch:{ all -> 0x05e6 }
            java.util.Set r0 = java.util.Collections.singleton(r0)     // Catch:{ all -> 0x05e6 }
        L_0x044c:
            r3.A01(r1, r0, r5, r12)     // Catch:{ all -> 0x05e6 }
            goto L_0x0455
        L_0x0450:
            java.util.Set r0 = java.util.Collections.emptySet()     // Catch:{ all -> 0x05e6 }
            goto L_0x044c
        L_0x0455:
            if (r2 != 0) goto L_0x04cc
            r8.A06(r7)     // Catch:{ all -> 0x05e6 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05e6 }
            r1.<init>()     // Catch:{ all -> 0x05e6 }
            java.lang.String r0 = "StatusStore/deletemsg/statuslist/delete jid="
            r1.append(r0)     // Catch:{ all -> 0x05e6 }
            r1.append(r7)     // Catch:{ all -> 0x05e6 }
            java.lang.String r0 = " oldStatusInfo "
            r1.append(r0)     // Catch:{ all -> 0x05e6 }
            r1.append(r6)     // Catch:{ all -> 0x05e6 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x05e6 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x05e6 }
            boolean r0 = r10 instanceof X.C177638e7     // Catch:{ all -> 0x05e6 }
            if (r0 == 0) goto L_0x04c9
            X.16F r2 = r8.A05     // Catch:{ all -> 0x05e6 }
            long r0 = r4.A1N     // Catch:{ all -> 0x05e6 }
            monitor-enter(r2)     // Catch:{ all -> 0x05e6 }
            X.C18740tg.A00()     // Catch:{ all -> 0x04c5 }
            X.12P r3 = r2.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x04bd }
            X.1M0 r4 = r3.A05()     // Catch:{ SQLiteDatabaseCorruptException -> 0x04bd }
            X.71s r13 = r4.B1k()     // Catch:{ all -> 0x04b3 }
            X.14e r12 = r4.A02     // Catch:{ all -> 0x04a9 }
            java.lang.String r10 = "message_status_psa_campaign"
            java.lang.String r8 = "message_row_id = ? "
            java.lang.String[] r3 = new java.lang.String[r5]     // Catch:{ all -> 0x04a9 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x04a9 }
            r3[r11] = r0     // Catch:{ all -> 0x04a9 }
            java.lang.String r0 = "StatusPsaCampaignStore/delete"
            r12.A03(r10, r8, r0, r3)     // Catch:{ all -> 0x04a9 }
            r13.A00()     // Catch:{ all -> 0x04a9 }
            r13.close()     // Catch:{ all -> 0x04b3 }
            r4.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x04bd }
            goto L_0x04c3
        L_0x04a9:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x04ae }
            goto L_0x04b2
        L_0x04ae:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x04b3 }
        L_0x04b2:
            throw r1     // Catch:{ all -> 0x04b3 }
        L_0x04b3:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x04b8 }
            goto L_0x04bc
        L_0x04b8:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x04bd }
        L_0x04bc:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x04bd }
        L_0x04bd:
            r1 = move-exception
            java.lang.String r0 = "messagestatuspsacampaign/delete"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x04c5 }
        L_0x04c3:
            monitor-exit(r2)     // Catch:{ all -> 0x05e6 }
            goto L_0x04c9
        L_0x04c5:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x05e6 }
            goto L_0x0560
        L_0x04c9:
            if (r35 != 0) goto L_0x05dc
            goto L_0x04d9
        L_0x04cc:
            if (r35 != 0) goto L_0x05dc
            int r1 = r2.A03()     // Catch:{ all -> 0x05e6 }
            int r0 = r2.A02()     // Catch:{ all -> 0x05e6 }
            r8.A0E(r7, r1, r0)     // Catch:{ all -> 0x05e6 }
        L_0x04d9:
            X.13z r0 = X.C223613z.A00     // Catch:{ all -> 0x05e6 }
            if (r7 == r0) goto L_0x05dc
            X.16D r3 = r9.A0A     // Catch:{ all -> 0x05e6 }
            X.141 r2 = r3.A0D(r7)     // Catch:{ all -> 0x05e6 }
            monitor-enter(r6)     // Catch:{ all -> 0x05e6 }
            int r0 = r6.A00     // Catch:{ all -> 0x0559 }
            r1 = 1
            if (r0 != r5) goto L_0x04ee
            int r0 = r6.A01     // Catch:{ all -> 0x0559 }
            if (r0 != r5) goto L_0x04ee
            goto L_0x04ef
        L_0x04ee:
            r1 = 0
        L_0x04ef:
            monitor-exit(r6)     // Catch:{ all -> 0x05e6 }
            if (r1 == 0) goto L_0x04f9
            boolean r0 = r2.A14     // Catch:{ all -> 0x05e6 }
            if (r0 != 0) goto L_0x05dc
            r2.A14 = r5     // Catch:{ all -> 0x05e6 }
            goto L_0x04ff
        L_0x04f9:
            boolean r0 = r2.A14     // Catch:{ all -> 0x05e6 }
            if (r0 == 0) goto L_0x05dc
            r2.A14 = r11     // Catch:{ all -> 0x05e6 }
        L_0x04ff:
            r3.A0Q(r2)     // Catch:{ all -> 0x05e6 }
            goto L_0x05dc
        L_0x0504:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0507 }
            throw r0     // Catch:{ all -> 0x0507 }
        L_0x0507:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0507 }
            goto L_0x0560
        L_0x050a:
            X.12q r8 = r9.A0I     // Catch:{ all -> 0x05e6 }
            X.3Qp r6 = r8.A09(r10, r11)     // Catch:{ all -> 0x05e6 }
            if (r6 == 0) goto L_0x05dc
            long r2 = r6.A0U     // Catch:{ all -> 0x05e6 }
            long r0 = r4.A1N     // Catch:{ all -> 0x05e6 }
            int r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r16 = 0
            if (r12 != 0) goto L_0x051e
            r16 = 1
        L_0x051e:
            long r2 = r6.A0N     // Catch:{ all -> 0x05e6 }
            long r0 = r4.A1N     // Catch:{ all -> 0x05e6 }
            int r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r12 != 0) goto L_0x0527
            r11 = 1
        L_0x0527:
            X.0yC r1 = r9.A11     // Catch:{ all -> 0x05e6 }
            r0 = 6440(0x1928, float:9.024E-42)
            boolean r0 = X.C20800yB.A01(r7, r1, r0)     // Catch:{ all -> 0x05e6 }
            if (r0 == 0) goto L_0x0534
            if (r35 == 0) goto L_0x0534
            goto L_0x0535
        L_0x0534:
            r5 = 0
        L_0x0535:
            long r2 = r4.A1O     // Catch:{ all -> 0x05e6 }
            long r0 = r6.A0Q     // Catch:{ all -> 0x05e6 }
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 <= 0) goto L_0x056c
            r2 = r34 & 16
            r0 = 16
            r1 = 0
            if (r2 != r0) goto L_0x0545
            r1 = 1
        L_0x0545:
            int r0 = r6.A08     // Catch:{ all -> 0x05e6 }
            if (r0 <= 0) goto L_0x0562
            int r0 = r0 + -1
            monitor-enter(r6)     // Catch:{ all -> 0x05e6 }
            r6.A08 = r0     // Catch:{ all -> 0x0559 }
            monitor-exit(r6)     // Catch:{ all -> 0x05e6 }
            if (r1 == 0) goto L_0x0562
            int r0 = r6.A0A     // Catch:{ all -> 0x05e6 }
            int r0 = r0 + -1
            monitor-enter(r6)     // Catch:{ all -> 0x05e6 }
            r6.A0A = r0     // Catch:{ all -> 0x0559 }
            goto L_0x0561
        L_0x0559:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x05e6 }
            goto L_0x0560
        L_0x055c:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x05e6 }
        L_0x0560:
            throw r0     // Catch:{ all -> 0x05e6 }
        L_0x0561:
            monitor-exit(r6)     // Catch:{ all -> 0x05e6 }
        L_0x0562:
            X.0wQ r0 = r9.A07     // Catch:{ all -> 0x05e6 }
            X.C66013Ui.A0G(r0, r8, r4)     // Catch:{ all -> 0x05e6 }
            X.163 r0 = r9.A0H     // Catch:{ all -> 0x05e6 }
            r0.A0H(r6)     // Catch:{ all -> 0x05e6 }
        L_0x056c:
            if (r5 != 0) goto L_0x05d0
            if (r16 != 0) goto L_0x0572
            if (r11 == 0) goto L_0x05d0
        L_0x0572:
            r1 = 4
            r0 = r34 & 4
            r14 = 0
            if (r0 != r1) goto L_0x0579
            r14 = 1
        L_0x0579:
            X.17T r0 = r9.A0j     // Catch:{ all -> 0x05e6 }
            long r0 = r0.A03(r10)     // Catch:{ all -> 0x05e6 }
            X.17U r2 = r9.A0l     // Catch:{ all -> 0x05e6 }
            long r2 = r2.A06(r10)     // Catch:{ all -> 0x05e6 }
            r5 = r17
            X.175 r5 = r5.A01     // Catch:{ all -> 0x05e6 }
            X.3T1 r12 = r5.A01(r0)     // Catch:{ all -> 0x05e6 }
            X.163 r13 = r9.A0H     // Catch:{ all -> 0x05e6 }
            X.12q r7 = r13.A00     // Catch:{ all -> 0x05e6 }
            r5 = 0
            X.3Qp r9 = r7.A09(r10, r5)     // Catch:{ all -> 0x05e6 }
            if (r9 == 0) goto L_0x05b6
            r7 = 1
            int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x05a6
            if (r14 != 0) goto L_0x05a6
            if (r12 == 0) goto L_0x05a6
            long r7 = r12.A0I     // Catch:{ all -> 0x05e6 }
            r9.A0X = r7     // Catch:{ all -> 0x05e6 }
        L_0x05a6:
            if (r16 == 0) goto L_0x05ae
            r9.A0U = r0     // Catch:{ all -> 0x05e6 }
            r9.A0V = r2     // Catch:{ all -> 0x05e6 }
            r9.A0d = r12     // Catch:{ all -> 0x05e6 }
        L_0x05ae:
            if (r11 == 0) goto L_0x05b6
            r9.A0N = r0     // Catch:{ all -> 0x05e6 }
            r9.A0O = r2     // Catch:{ all -> 0x05e6 }
            r9.A0c = r12     // Catch:{ all -> 0x05e6 }
        L_0x05b6:
            boolean r0 = r13.A0L(r6)     // Catch:{ all -> 0x05e6 }
            if (r0 != 0) goto L_0x05d0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05e6 }
            r1.<init>()     // Catch:{ all -> 0x05e6 }
            java.lang.String r0 = "CoreMessageStore/deletemsg/chatlist/insert/failed gid="
            r1.append(r0)     // Catch:{ all -> 0x05e6 }
            r1.append(r10)     // Catch:{ all -> 0x05e6 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x05e6 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x05e6 }
        L_0x05d0:
            long r7 = r6.A0H     // Catch:{ all -> 0x05e6 }
            long r1 = r4.A1O     // Catch:{ all -> 0x05e6 }
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x05dc
            r0 = -9223372036854775808
            r6.A0H = r0     // Catch:{ all -> 0x05e6 }
        L_0x05dc:
            r19.A00()     // Catch:{ all -> 0x05e6 }
            r19.close()     // Catch:{ all -> 0x05f0 }
            r18.close()
            return
        L_0x05e6:
            r1 = move-exception
            r19.close()     // Catch:{ all -> 0x05eb }
            goto L_0x05ef
        L_0x05eb:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x05f0 }
        L_0x05ef:
            throw r1     // Catch:{ all -> 0x05f0 }
        L_0x05f0:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x05f5 }
            throw r1
        L_0x05f5:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20310xM.A0p(X.3T1, int, boolean, boolean):void");
    }

    public void A0r(C64933Qa r4, int i, long j) {
        if (C20800yB.A01(C21000yV.A02, this.A11, 7287)) {
            StringBuilder sb = new StringBuilder();
            sb.append("CoreMessageStore/addMessageDropPlaceholder/add msg drop placeholder/reason=");
            sb.append(i);
            sb.append("; key=");
            sb.append(r4);
            Log.w(sb.toString());
            AnonymousClass2c4 r1 = new AnonymousClass2c4(r4, j);
            r1.A00 = String.valueOf(i);
            A0P(r1);
        }
    }

    public void A0s(AnonymousClass2bZ r6) {
        C207219uk r0;
        C207199ui r4;
        if (C20800yB.A01(C21000yV.A02, this.A11, 4893) && (r0 = r6.A00) != null && (r4 = r0.A01) != null && r4.A0D != null) {
            C207009uP r1 = r4.A09;
            if (C207199ui.A00(r1.A01) == 1 || C207199ui.A00(r1.A01) == 7) {
                C25131Fc r3 = this.A1X;
                String str = r4.A0D;
                AnonymousClass00C.A0D(str, 0);
                String str2 = (String) C110515an.A00(C008903u.A00, new OrderRequestMessageManager$getOrderRequestMessageRowId$1(r3, str, (C023509x) null));
                if (str2 != null) {
                    AnonymousClass1A1 r02 = this.A1B;
                    AnonymousClass3T1 A012 = r02.A01.A01(Long.parseLong(str2));
                    if (A012 != null && (A012 instanceof C46952bw)) {
                        C46952bw r12 = (C46952bw) A012;
                        r12.A02 = 2;
                        A0k(r12);
                    }
                }
            }
        }
    }

    public void A0t(Collection collection) {
        AnonymousClass16E r3 = this.A0o;
        C65663Sz A072 = r3.A07();
        if (A072 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("regenerateStatsInfo for MeJid ");
            sb.append(A072);
            Log.i(sb.toString());
            AnonymousClass1HT r1 = (AnonymousClass1HT) this.A1G.get();
            C18740tg.A00();
            C65663Sz A002 = AnonymousClass1HT.A00(A072, r1, r1.A03(A072.A09));
            if (A002 != null) {
                r3.A0D(A002, C223613z.A00);
            } else {
                Log.i("deleting MeJid status from StatusStore/updateMyStatus");
                r3.A06(C223613z.A00);
            }
        }
        this.A0T.A01.post(new C35681j5(this, collection, 45));
    }

    public void A0u(Collection collection, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("CoreMessageStore/deletemessages ");
        sb.append(collection.size());
        Log.i(sb.toString());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.A0W.A0C(((AnonymousClass3T1) it.next()).A1J);
        }
        this.A0F.A01(new C35261iP((Object) this, i, 19, (Object) collection), 20);
    }

    public void A0v(Collection collection, int i) {
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        boolean z = false;
        if ((i & 8) == 8) {
            z = true;
        }
        Collection collection2 = collection;
        Iterator it = collection.iterator();
        while (true) {
            if (it.hasNext()) {
                AnonymousClass3T1 r1 = (AnonymousClass3T1) it.next();
                A0o(r1, i, false);
                AnonymousClass11F r4 = r1.A1J.A00;
                hashSet.add(r4);
                if (z) {
                    Long l = r1.A0g;
                    C18740tg.A06(l);
                    long longValue = l.longValue();
                    Number number = (Number) hashMap.get(r4);
                    if (number != null) {
                        longValue = Math.max(number.longValue(), longValue);
                    }
                    hashMap.put(r4, Long.valueOf(longValue));
                }
            } else {
                this.A0T.A01.post(new C35411ie(this, collection2, hashMap, hashSet, 0, z));
                return;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r5v12 */
    /* JADX WARNING: Code restructure failed: missing block: B:149:?, code lost:
        r18.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:?, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03ed, code lost:
        if (r22 == null) goto L_0x03fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03fb, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x029e, code lost:
        r6 = new java.lang.StringBuilder();
        r6.append("CoreMessageStore/deletemsgs/batches stopped at ref:");
        r6.append(r0);
        com.whatsapp.util.Log.w(r6.toString());
     */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x03fe A[EDGE_INSN: B:200:0x03fe->B:191:0x03fe ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0140 A[Catch:{ SQLiteDiskIOException -> 0x03db, all -> 0x03f0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0x(X.AnonymousClass3B8 r37, X.AnonymousClass4V8 r38, boolean r39) {
        /*
            r36 = this;
            r3 = r37
            r1 = 1
            if (r39 == 0) goto L_0x000a
            java.util.List r0 = r3.A09
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            int r2 = r3.A00
            if (r2 >= r1) goto L_0x0061
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "CoreMessageStore/deletemsgs/batches block size is not positive:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " for jid:"
            r1.append(r0)
            X.11F r2 = r3.A07
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            long r12 = r3.A06
            long r10 = r3.A01
            r20 = 100
            long r8 = r3.A04
            long r6 = r3.A05
            boolean r0 = r3.A0C
            r33 = r0
            boolean r0 = r3.A0B
            r34 = r0
            long r4 = r3.A02
            long r0 = r3.A03
            java.lang.String r15 = r3.A08
            java.util.List r14 = r3.A09
            X.3B8 r3 = new X.3B8
            r16 = r3
            r17 = r2
            r18 = r15
            r19 = r14
            r21 = r12
            r23 = r10
            r25 = r8
            r27 = r6
            r29 = r4
            r31 = r0
            r35 = r33
            r16.<init>(r17, r18, r19, r20, r21, r23, r25, r27, r29, r31, r33, r34, r35)
        L_0x0061:
            X.C18740tg.A00()
            java.lang.String r1 = "msgstore/deletemsgs/batches"
            X.14g r23 = new X.14g
            r0 = r23
            r0.<init>((java.lang.String) r1)
            r30 = r38
            r30.Bh7()
            r5 = 0
            r4 = r36
            if (r39 == 0) goto L_0x03a0
            java.util.List r0 = r3.A09
            if (r0 != 0) goto L_0x039a
            r10 = 0
        L_0x007c:
            X.17A r0 = r4.A0p
            X.11F r2 = r3.A07
            long r0 = r0.A01(r2)
            X.17U r6 = r4.A0l
            r6.A04(r0)
            r4.A07(r3)
            r22 = 0
            r8 = 0
        L_0x008f:
            boolean r0 = r30.BtY()
            if (r0 != 0) goto L_0x03fe
            X.1FD r1 = r4.A0N     // Catch:{ all -> 0x03ec }
            X.12P r9 = r1.A02     // Catch:{ all -> 0x03ec }
            X.1M0 r6 = r9.get()     // Catch:{ all -> 0x03ec }
            if (r39 == 0) goto L_0x00ee
            java.util.List r7 = r3.A09     // Catch:{ all -> 0x03e2 }
            if (r7 == 0) goto L_0x00ee
            int r1 = r7.size()     // Catch:{ all -> 0x03e2 }
            r0 = 999(0x3e7, float:1.4E-42)
            if (r1 <= r0) goto L_0x00b1
            java.lang.String r0 = "msgstore/deletemsgs/getSingularDeletedChats too many messages to delete"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x03e2 }
            goto L_0x012d
        L_0x00b1:
            int r12 = r7.size()     // Catch:{ all -> 0x03e2 }
            java.lang.String[] r11 = new java.lang.String[r12]     // Catch:{ all -> 0x03e2 }
            r1 = 0
        L_0x00b8:
            if (r1 >= r12) goto L_0x00c9
            java.lang.Object r0 = r7.get(r1)     // Catch:{ all -> 0x03e2 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x03e2 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x03e2 }
            r11[r1] = r0     // Catch:{ all -> 0x03e2 }
            int r1 = r1 + 1
            goto L_0x00b8
        L_0x00c9:
            X.1M0 r7 = r9.get()     // Catch:{ all -> 0x03e2 }
            X.14e r9 = r7.A02     // Catch:{ all -> 0x03aa }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x03aa }
            r1.<init>()     // Catch:{ all -> 0x03aa }
            java.lang.String r0 = "SELECT * FROM deleted_messages_view WHERE _id IN "
            r1.append(r0)     // Catch:{ all -> 0x03aa }
            java.lang.String r0 = X.AnonymousClass1M2.A00(r12)     // Catch:{ all -> 0x03aa }
            r1.append(r0)     // Catch:{ all -> 0x03aa }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x03aa }
            java.lang.String r0 = "GET_SINGULAR_MESSAGE_CURSOR"
            android.database.Cursor r12 = r9.A09(r1, r0, r11)     // Catch:{ all -> 0x03aa }
            r7.close()     // Catch:{ all -> 0x03e2 }
            goto L_0x0110
        L_0x00ee:
            X.14e r11 = r6.A02     // Catch:{ all -> 0x03e2 }
            java.lang.String r9 = X.C56292w3.A00     // Catch:{ all -> 0x03e2 }
            r0 = 2
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ all -> 0x03e2 }
            X.163 r0 = r1.A00     // Catch:{ all -> 0x03e2 }
            long r0 = r0.A08(r2)     // Catch:{ all -> 0x03e2 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x03e2 }
            r7[r5] = r0     // Catch:{ all -> 0x03e2 }
            r1 = 1
            int r0 = r3.A00     // Catch:{ all -> 0x03e2 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x03e2 }
            r7[r1] = r0     // Catch:{ all -> 0x03e2 }
            java.lang.String r0 = "GET_DELETED_MESSAGES_BY_ID_SQL"
            android.database.Cursor r12 = r11.A09(r9, r0, r7)     // Catch:{ all -> 0x03e2 }
        L_0x0110:
            if (r12 == 0) goto L_0x012e
            boolean r0 = r12.moveToFirst()     // Catch:{ all -> 0x03e2 }
            if (r0 == 0) goto L_0x012e
            java.lang.String r0 = "_id"
            int r0 = r12.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03e2 }
            long r13 = r12.getLong(r0)     // Catch:{ all -> 0x03e2 }
            java.lang.String r0 = "sort_id"
            int r0 = r12.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x03e2 }
            long r15 = r12.getLong(r0)     // Catch:{ all -> 0x03e2 }
            goto L_0x0132
        L_0x012d:
            r12 = 0
        L_0x012e:
            r13 = 1
            r15 = -9223372036854775808
        L_0x0132:
            r6.close()     // Catch:{ all -> 0x03ec }
            X.36f r11 = new X.36f     // Catch:{ all -> 0x03ec }
            r11.<init>(r12, r13, r15)     // Catch:{ all -> 0x03ec }
            r22 = r11
            android.database.Cursor r9 = r11.A00     // Catch:{ all -> 0x03f0 }
            if (r9 == 0) goto L_0x03fe
            long r0 = r11.A01     // Catch:{ all -> 0x03f0 }
            r11 = 1
            int r6 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r6 == 0) goto L_0x0400
            r9.getCount()     // Catch:{ all -> 0x03f0 }
            java.lang.String r21 = "CoreMessageStore/deleteMediaMessageFilesBatch: "
            java.lang.String r7 = "msgstore/deletemedia/batch/files"
            X.14g r20 = new X.14g     // Catch:{ all -> 0x03f0 }
            r6 = r20
            r6.<init>((java.lang.String) r7)     // Catch:{ all -> 0x03f0 }
            java.util.HashSet r19 = new java.util.HashSet     // Catch:{ all -> 0x03f0 }
            r19.<init>()     // Catch:{ all -> 0x03f0 }
            r11 = 1
            boolean r6 = r9.moveToFirst()     // Catch:{ SQLiteDiskIOException -> 0x03db }
            if (r6 == 0) goto L_0x0221
            java.util.ArrayList r18 = new java.util.ArrayList     // Catch:{ SQLiteDiskIOException -> 0x03db }
            r18.<init>()     // Catch:{ SQLiteDiskIOException -> 0x03db }
            java.lang.String r6 = "remove_files"
            int r17 = r9.getColumnIndexOrThrow(r6)     // Catch:{ SQLiteDiskIOException -> 0x03db }
            java.lang.String r6 = "message_type"
            int r15 = r9.getColumnIndex(r6)     // Catch:{ SQLiteDiskIOException -> 0x03db }
        L_0x0173:
            int r7 = r9.getInt(r15)     // Catch:{ SQLiteDiskIOException -> 0x03db }
            boolean r6 = X.C66013Ui.A0J(r7)     // Catch:{ SQLiteDiskIOException -> 0x03db }
            if (r6 != 0) goto L_0x0183
            boolean r6 = X.C66013Ui.A0K(r7)     // Catch:{ SQLiteDiskIOException -> 0x03db }
            if (r6 == 0) goto L_0x01ec
        L_0x0183:
            X.1A1 r6 = r4.A1B     // Catch:{ SQLiteDiskIOException -> 0x03db }
            X.AnonymousClass00C.A0D(r2, r11)     // Catch:{ SQLiteDiskIOException -> 0x03db }
            X.175 r6 = r6.A01     // Catch:{ SQLiteDiskIOException -> 0x03db }
            X.3T1 r14 = r6.A02(r9, r2, r11)     // Catch:{ SQLiteDiskIOException -> 0x03db }
            X.C18740tg.A06(r14)     // Catch:{ SQLiteDiskIOException -> 0x03db }
            boolean r6 = r14 instanceof X.AnonymousClass2bU     // Catch:{ SQLiteDiskIOException -> 0x03db }
            if (r6 == 0) goto L_0x01ec
            X.2bU r14 = (X.AnonymousClass2bU) r14     // Catch:{ SQLiteDiskIOException -> 0x03db }
            java.lang.String r7 = r14.A04     // Catch:{ SQLiteDiskIOException -> 0x03db }
            if (r7 == 0) goto L_0x01a0
            r6 = r19
            r6.add(r7)     // Catch:{ SQLiteDiskIOException -> 0x03db }
        L_0x01a0:
            r6 = r17
            boolean r13 = X.C224014d.A03(r9, r6)     // Catch:{ SQLiteDiskIOException -> 0x03db }
            X.0yC r12 = r4.A11     // Catch:{ SQLiteDiskIOException -> 0x03db }
            r7 = 421(0x1a5, float:5.9E-43)
            X.0yV r6 = X.C21000yV.A02     // Catch:{ SQLiteDiskIOException -> 0x03db }
            boolean r6 = X.C20800yB.A01(r6, r12, r7)     // Catch:{ SQLiteDiskIOException -> 0x03db }
            if (r6 == 0) goto L_0x01d2
            X.3Qj r12 = r14.A01     // Catch:{ SQLiteDiskIOException -> 0x03db }
            if (r12 == 0) goto L_0x01ec
            java.io.File r7 = r12.A0I     // Catch:{ SQLiteDiskIOException -> 0x03db }
            if (r7 == 0) goto L_0x01ec
            X.1Av r6 = r4.A09     // Catch:{ SQLiteDiskIOException -> 0x03db }
            boolean r16 = X.C24041Av.A02(r6, r7)     // Catch:{ SQLiteDiskIOException -> 0x03db }
            if (r16 == 0) goto L_0x01d0
            int r7 = X.C24041Av.A00(r6, r7, r11)     // Catch:{ SQLiteDiskIOException -> 0x03db }
        L_0x01c6:
            boolean r6 = X.C66013Ui.A0y(r14)     // Catch:{ SQLiteDiskIOException -> 0x03db }
            r13 = r13 | r6
            if (r13 == 0) goto L_0x01ec
            if (r7 >= 0) goto L_0x01ec
            goto L_0x01d8
        L_0x01d0:
            r7 = 0
            goto L_0x01c6
        L_0x01d2:
            X.1DG r6 = r4.A0V     // Catch:{ SQLiteDiskIOException -> 0x03db }
            r6.A03(r14, r13, r5)     // Catch:{ SQLiteDiskIOException -> 0x03db }
            goto L_0x01ec
        L_0x01d8:
            X.3xh r6 = new X.3xh     // Catch:{ SQLiteDiskIOException -> 0x03db }
            r6.<init>(r12, r4, r14)     // Catch:{ SQLiteDiskIOException -> 0x03db }
            java.util.concurrent.FutureTask r7 = new java.util.concurrent.FutureTask     // Catch:{ SQLiteDiskIOException -> 0x03db }
            r7.<init>(r6)     // Catch:{ SQLiteDiskIOException -> 0x03db }
            X.0wU r6 = r4.A1C     // Catch:{ SQLiteDiskIOException -> 0x03db }
            r6.Boy(r7)     // Catch:{ SQLiteDiskIOException -> 0x03db }
            r6 = r18
            r6.add(r7)     // Catch:{ SQLiteDiskIOException -> 0x03db }
        L_0x01ec:
            boolean r6 = r9.moveToNext()     // Catch:{ SQLiteDiskIOException -> 0x03db }
            if (r6 != 0) goto L_0x0173
            java.util.Iterator r13 = r18.iterator()     // Catch:{ SQLiteDiskIOException -> 0x03db }
        L_0x01f6:
            boolean r6 = r13.hasNext()     // Catch:{ SQLiteDiskIOException -> 0x03db }
            if (r6 == 0) goto L_0x0221
            java.lang.Object r6 = r13.next()     // Catch:{ SQLiteDiskIOException -> 0x03db }
            java.util.concurrent.FutureTask r6 = (java.util.concurrent.FutureTask) r6     // Catch:{ SQLiteDiskIOException -> 0x03db }
            r6.get()     // Catch:{ InterruptedException | ExecutionException -> 0x0206 }
            goto L_0x01f6
        L_0x0206:
            r12 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ SQLiteDiskIOException -> 0x03db }
            r7.<init>()     // Catch:{ SQLiteDiskIOException -> 0x03db }
            r6 = r21
            r7.append(r6)     // Catch:{ SQLiteDiskIOException -> 0x03db }
            r7.append(r2)     // Catch:{ SQLiteDiskIOException -> 0x03db }
            java.lang.String r6 = " failed to delete a media file"
            r7.append(r6)     // Catch:{ SQLiteDiskIOException -> 0x03db }
            java.lang.String r6 = r7.toString()     // Catch:{ SQLiteDiskIOException -> 0x03db }
            com.whatsapp.util.Log.e(r6, r12)     // Catch:{ SQLiteDiskIOException -> 0x03db }
            goto L_0x01f6
        L_0x0221:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x03f0 }
            r12.<init>()     // Catch:{ all -> 0x03f0 }
            java.lang.String r6 = "CoreMessageStore/deletemedia/batch/files "
            r12.append(r6)     // Catch:{ all -> 0x03f0 }
            r12.append(r2)     // Catch:{ all -> 0x03f0 }
            java.lang.String r6 = " timeSpent:"
            r12.append(r6)     // Catch:{ all -> 0x03f0 }
            long r6 = r20.A01()     // Catch:{ all -> 0x03f0 }
            r12.append(r6)     // Catch:{ all -> 0x03f0 }
            java.lang.String r6 = r12.toString()     // Catch:{ all -> 0x03f0 }
            com.whatsapp.util.Log.i((java.lang.String) r6)     // Catch:{ all -> 0x03f0 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x03f0 }
            r7.<init>()     // Catch:{ all -> 0x03f0 }
            r9.moveToFirst()     // Catch:{ all -> 0x03f0 }
        L_0x0249:
            java.lang.String r6 = "key_id"
            int r12 = r9.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x03f0 }
            java.lang.String r12 = r9.getString(r12)     // Catch:{ all -> 0x03f0 }
            r7.add(r12)     // Catch:{ all -> 0x03f0 }
            boolean r12 = r9.moveToNext()     // Catch:{ all -> 0x03f0 }
            if (r12 != 0) goto L_0x0249
            X.12P r12 = r4.A0c     // Catch:{ all -> 0x03f0 }
            X.1M0 r15 = r12.A05()     // Catch:{ all -> 0x03f0 }
            X.71s r18 = r15.B1k()     // Catch:{ all -> 0x03d1 }
            r12 = 3
            java.lang.String[] r12 = new java.lang.String[r12]     // Catch:{ all -> 0x03c7 }
            long r13 = r3.A01     // Catch:{ all -> 0x03c7 }
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x03c7 }
            r12[r5] = r13     // Catch:{ all -> 0x03c7 }
            r5 = r22
            long r13 = r5.A02     // Catch:{ all -> 0x03c7 }
            java.lang.String r5 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x03c7 }
            r12[r11] = r5     // Catch:{ all -> 0x03c7 }
            r11 = 2
            int r5 = r3.A00     // Catch:{ all -> 0x03c7 }
            java.lang.String r5 = java.lang.Integer.toString(r5)     // Catch:{ all -> 0x03c7 }
            r12[r11] = r5     // Catch:{ all -> 0x03c7 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x03c7 }
            r11.<init>()     // Catch:{ all -> 0x03c7 }
            java.lang.String r5 = "_id IN (   SELECT _id   FROM deleted_messages_ids_view   WHERE chat_row_id = ?    AND sort_id>=?    ORDER BY sort_id ASC   LIMIT ?)"
            r11.append(r5)     // Catch:{ all -> 0x03c7 }
            java.lang.String r14 = r11.toString()     // Catch:{ all -> 0x03c7 }
            java.lang.String r13 = "deleteAllMessagesForJidInBatchesBackground/DELETE_MESSAGE"
            X.14e r5 = r15.A02     // Catch:{ all -> 0x03c7 }
            java.lang.String r11 = "message"
            int r17 = r5.A03(r11, r14, r13, r12)     // Catch:{ all -> 0x03c7 }
            if (r17 != 0) goto L_0x02b4
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x03c7 }
            r6.<init>()     // Catch:{ all -> 0x03c7 }
            java.lang.String r5 = "CoreMessageStore/deletemsgs/batches stopped at ref:"
            r6.append(r5)     // Catch:{ all -> 0x03c7 }
            r6.append(r0)     // Catch:{ all -> 0x03c7 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x03c7 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x03c7 }
            goto L_0x03b4
        L_0x02b4:
            java.util.List r0 = r3.A09     // Catch:{ all -> 0x03c7 }
            if (r0 == 0) goto L_0x0303
            java.util.Iterator r14 = r0.iterator()     // Catch:{ all -> 0x03c7 }
        L_0x02bc:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x03c7 }
            if (r0 == 0) goto L_0x0303
            java.lang.Object r0 = r14.next()     // Catch:{ all -> 0x03c7 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x03c7 }
            if (r0 == 0) goto L_0x02bc
            long r27 = r0.longValue()     // Catch:{ all -> 0x03c7 }
            r12 = 1
            r11 = 0
            java.lang.String[] r1 = new java.lang.String[r12]     // Catch:{ all -> 0x03c7 }
            java.lang.String r0 = java.lang.String.valueOf(r27)     // Catch:{ all -> 0x03c7 }
            r1[r11] = r0     // Catch:{ all -> 0x03c7 }
            java.lang.String r13 = X.C56792wt.A00     // Catch:{ all -> 0x03c7 }
            java.lang.String r0 = "SELECT_ALL_COMMENTS_FOR_PARENT_MESSAGE_QUERY_ID"
            android.database.Cursor r1 = r5.A09(r13, r0, r1)     // Catch:{ all -> 0x03c7 }
        L_0x02e0:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x03bb }
            if (r0 == 0) goto L_0x02f2
            X.1A1 r0 = r4.A1B     // Catch:{ all -> 0x03bb }
            X.3T1 r0 = r0.A00(r1)     // Catch:{ all -> 0x03bb }
            if (r0 == 0) goto L_0x02e0
            r4.A0o(r0, r12, r11)     // Catch:{ all -> 0x03bb }
            goto L_0x02e0
        L_0x02f2:
            r1.close()     // Catch:{ all -> 0x03c7 }
            X.1Fs r0 = r4.A17     // Catch:{ all -> 0x03c7 }
            r26 = 1
            r29 = 0
            r24 = r0
            r25 = r15
            r24.A00(r25, r26, r27, r29)     // Catch:{ all -> 0x03c7 }
            goto L_0x02bc
        L_0x0303:
            X.1EH r5 = r4.A0s     // Catch:{ all -> 0x03c7 }
            X.12P r0 = r5.A02     // Catch:{ SQLiteDatabaseCorruptException -> 0x0376 }
            X.1M0 r11 = r0.A05()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0376 }
            X.14e r12 = r11.A02     // Catch:{ all -> 0x036c }
            java.lang.String r1 = "message_thumbnail"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x036c }
            r13.<init>()     // Catch:{ all -> 0x036c }
            java.lang.String r0 = "message_row_id IN "
            r13.append(r0)     // Catch:{ all -> 0x036c }
            java.lang.String r0 = "(SELECT _id FROM message_view WHERE chat_row_id = ? AND "
            r13.append(r0)     // Catch:{ all -> 0x036c }
            r13.append(r6)     // Catch:{ all -> 0x036c }
            java.lang.String r0 = " IN (\""
            r13.append(r0)     // Catch:{ all -> 0x036c }
            java.lang.String r0 = "\",\""
            java.lang.String r0 = android.text.TextUtils.join(r0, r7)     // Catch:{ all -> 0x036c }
            r13.append(r0)     // Catch:{ all -> 0x036c }
            java.lang.String r0 = "\")"
            r13.append(r0)     // Catch:{ all -> 0x036c }
            java.lang.String r0 = ")"
            r13.append(r0)     // Catch:{ all -> 0x036c }
            java.lang.String r7 = r13.toString()     // Catch:{ all -> 0x036c }
            r0 = 1
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ all -> 0x036c }
            r16 = 0
            X.163 r0 = r5.A00     // Catch:{ all -> 0x036c }
            long r13 = r0.A08(r2)     // Catch:{ all -> 0x036c }
            java.lang.String r0 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x036c }
            r6[r16] = r0     // Catch:{ all -> 0x036c }
            java.lang.String r0 = "deleteMessageThumbnailsFor/DELETE_MESSAGE_THUMBNAILS_BY_ID"
            int r6 = r12.A03(r1, r7, r0, r6)     // Catch:{ all -> 0x036c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x036c }
            r1.<init>()     // Catch:{ all -> 0x036c }
            java.lang.String r0 = "msgstore/deleteMessageThumbnailsFor-jid/"
            r1.append(r0)     // Catch:{ all -> 0x036c }
            r1.append(r6)     // Catch:{ all -> 0x036c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x036c }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x036c }
            r11.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0376 }
            goto L_0x037c
        L_0x036c:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x0371 }
            goto L_0x0375
        L_0x0371:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0376 }
        L_0x0375:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x0376 }
        L_0x0376:
            r1 = move-exception
            java.lang.String r0 = "msgstore/deleteMessageThumbnailsFor-jid"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x03c7 }
        L_0x037c:
            r0 = r19
            r5.A04(r0)     // Catch:{ all -> 0x03c7 }
            r18.A00()     // Catch:{ all -> 0x03c7 }
            int r8 = r8 + r17
            r23.A00()     // Catch:{ all -> 0x03c7 }
            r18.close()     // Catch:{ all -> 0x03d1 }
            r15.close()     // Catch:{ all -> 0x03f0 }
            r9.close()
            r0 = r30
            r0.Bdh(r8, r10)
            r5 = 0
            goto L_0x008f
        L_0x039a:
            int r10 = r0.size()
            goto L_0x007c
        L_0x03a0:
            X.1FD r1 = r4.A0N
            X.11F r0 = r3.A07
            int r10 = r1.A02(r0)
            goto L_0x007c
        L_0x03aa:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x03af }
            goto L_0x03b3
        L_0x03af:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x03e2 }
        L_0x03b3:
            throw r1     // Catch:{ all -> 0x03e2 }
        L_0x03b4:
            r18.close()     // Catch:{ all -> 0x03d1 }
            r15.close()     // Catch:{ all -> 0x03f0 }
            goto L_0x03fb
        L_0x03bb:
            r2 = move-exception
            if (r1 == 0) goto L_0x03c6
            r1.close()     // Catch:{ all -> 0x03c2 }
            goto L_0x03c6
        L_0x03c2:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch:{ all -> 0x03c7 }
        L_0x03c6:
            throw r2     // Catch:{ all -> 0x03c7 }
        L_0x03c7:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x03cc }
            goto L_0x03d0
        L_0x03cc:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x03d1 }
        L_0x03d0:
            throw r1     // Catch:{ all -> 0x03d1 }
        L_0x03d1:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x03d6 }
            goto L_0x03e1
        L_0x03d6:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x03f0 }
            goto L_0x03e1
        L_0x03db:
            r1 = move-exception
            X.12T r0 = r4.A0a     // Catch:{ all -> 0x03f0 }
            r0.A00(r11)     // Catch:{ all -> 0x03f0 }
        L_0x03e1:
            throw r1     // Catch:{ all -> 0x03f0 }
        L_0x03e2:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x03e7 }
            goto L_0x03eb
        L_0x03e7:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x03ec }
        L_0x03eb:
            throw r1     // Catch:{ all -> 0x03ec }
        L_0x03ec:
            r1 = move-exception
            if (r22 == 0) goto L_0x03fa
            goto L_0x03f1
        L_0x03f0:
            r1 = move-exception
        L_0x03f1:
            r0 = r22
            android.database.Cursor r0 = r0.A00
            if (r0 == 0) goto L_0x03fa
            r0.close()
        L_0x03fa:
            throw r1
        L_0x03fb:
            r9.close()
        L_0x03fe:
            r5 = 1
            goto L_0x0403
        L_0x0400:
            r9.close()
        L_0x0403:
            boolean r0 = r30.BtY()
            if (r0 != 0) goto L_0x0410
            if (r39 != 0) goto L_0x0410
            X.1FI r0 = r4.A0Q
            r0.A05(r2)
        L_0x0410:
            r4.A07(r3)
            X.165 r0 = r4.A0L
            r0.A00()
            r30.BY0()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "CoreMessageStore/deletemsgs/batches "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = " haveMessagesToDelete:"
            r3.append(r0)
            r3.append(r5)
            java.lang.String r0 = " timeSpent:"
            r3.append(r0)
            long r0 = r23.A01()
            r3.append(r0)
            java.lang.String r0 = " currentMessages:"
            r3.append(r0)
            r3.append(r8)
            java.lang.String r0 = " totalMessages:"
            r3.append(r0)
            r3.append(r10)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 1
            r0 = r0 ^ r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20310xM.A0x(X.3B8, X.4V8, boolean):boolean");
    }

    public boolean A0y(AnonymousClass11F r5) {
        if (!this.A1e.A02(r5)) {
            return false;
        }
        C19460v5 r1 = this.A1I;
        if (!r1.A05()) {
            return false;
        }
        if (!C20800yB.A01(C21000yV.A02, ((AnonymousClass1GB) r1.A02()).A00, 5626)) {
            return false;
        }
        C238019x r12 = this.A1A;
        C181048mq r13 = new C181048mq(r12.A01.A02(r5, true), C19970wo.A00(this.A0C));
        A05(this, r13, -1);
        return A0R(r13, -1).A00;
    }

    public boolean A0z(AnonymousClass11F r8, Long l) {
        boolean z;
        AnonymousClass3T1 r3;
        AnonymousClass185 r1 = this.A0B;
        C222813r r0 = UserJid.Companion;
        UserJid A002 = C222813r.A00(r8);
        AnonymousClass3U1 r4 = new AnonymousClass3U1(r1, (C235618y) this.A1m.get(), A002);
        AnonymousClass141 A082 = this.A0A.A08(r8);
        if (!C55942vR.A00(this.A11) || A082 == null || !A082.A0E()) {
            z = false;
            C238019x r32 = this.A1A;
            long A003 = C19970wo.A00(this.A0C);
            int A032 = r4.A03();
            AnonymousClass2cH r33 = new AnonymousClass2cH(r32.A01.A02(r8, true), A003);
            r3 = r33;
            if (A002 != null) {
                r33.A00 = A032;
                r3 = r33;
            }
        } else {
            z = true;
            r3 = this.A1E.A01(r8, true);
        }
        r3.A0l = l;
        A05(this, r3, -1);
        StringBuilder sb = new StringBuilder();
        sb.append("CoreMessageStore/added plaintext disabled message; jid=");
        sb.append(r8);
        sb.append("; is3P=");
        sb.append(z);
        Log.i(sb.toString());
        return A0R(r3, -1).A00;
    }

    public boolean A10(AnonymousClass11F r8, boolean z) {
        C1495671s B1k;
        boolean z2;
        AnonymousClass1M0 A052 = this.A0c.A05();
        try {
            B1k = A052.B1k();
            long A012 = this.A0p.A01(r8);
            if (A012 > 1) {
                z2 = this.A0U.A06(Collections.singleton(Long.valueOf(A012)), z);
            } else {
                z2 = false;
            }
            B1k.A00();
            B1k.close();
            A052.close();
            return z2;
        } catch (Throwable th) {
            try {
                A052.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
        if (X.AnonymousClass1A3.A00(r7, new X.C53172qt(r6.A00, 3)) == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
        if (X.AnonymousClass1A3.A00(r7, new X.C53172qt(r6.A00, 0)) == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006d, code lost:
        if (X.AnonymousClass1A3.A00(r7, new X.C53172qt(r6.A00, 1)) == false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        if (X.AnonymousClass1A3.A00(r7, new X.C53172qt(r6.A00, 2)) == false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A11(X.C64933Qa r9) {
        /*
            r8 = this;
            X.1A1 r0 = r8.A1B
            X.3T1 r7 = r0.A03(r9)
            if (r7 == 0) goto L_0x0043
            X.1A3 r6 = r8.A1O
            X.3Qa r0 = r7.A1J
            X.11F r5 = r0.A00
            X.C18740tg.A06(r5)
            int r4 = r7.A1I
            r0 = 8
            if (r4 == r0) goto L_0x0045
            boolean r0 = r7.A15
            if (r0 != 0) goto L_0x002a
            X.12q r2 = r6.A00
            r1 = 2
            X.2qt r0 = new X.2qt
            r0.<init>(r2, r1)
            boolean r0 = X.AnonymousClass1A3.A00(r7, r0)
            r3 = 1
            if (r0 != 0) goto L_0x002b
        L_0x002a:
            r3 = 0
        L_0x002b:
            boolean r0 = r7.A15
            if (r0 == 0) goto L_0x003e
            X.12q r2 = r6.A00
            r1 = 3
            X.2qt r0 = new X.2qt
            r0.<init>(r2, r1)
            boolean r1 = X.AnonymousClass1A3.A00(r7, r0)
            r0 = 1
            if (r1 != 0) goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            if (r3 != 0) goto L_0x0043
            if (r0 == 0) goto L_0x0045
        L_0x0043:
            r0 = 1
            return r0
        L_0x0045:
            X.AnonymousClass00C.A0B(r5)
            boolean r0 = r7.A15
            if (r0 != 0) goto L_0x005b
            X.12q r2 = r6.A00
            r1 = 0
            X.2qt r0 = new X.2qt
            r0.<init>(r2, r1)
            boolean r0 = X.AnonymousClass1A3.A00(r7, r0)
            r3 = 1
            if (r0 != 0) goto L_0x005c
        L_0x005b:
            r3 = 0
        L_0x005c:
            boolean r0 = r7.A15
            if (r0 == 0) goto L_0x006f
            X.12q r2 = r6.A00
            r1 = 1
            X.2qt r0 = new X.2qt
            r0.<init>(r2, r1)
            boolean r1 = X.AnonymousClass1A3.A00(r7, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0070
        L_0x006f:
            r0 = 0
        L_0x0070:
            if (r3 != 0) goto L_0x0074
            if (r0 == 0) goto L_0x007d
        L_0x0074:
            X.12q r0 = r6.A00
            boolean r0 = r0.A0T(r5, r4)
            if (r0 == 0) goto L_0x007d
            goto L_0x0043
        L_0x007d:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20310xM.A11(X.3Qa):boolean");
    }

    private void A08(List list) {
        C202319lY r2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass3T1 A032 = this.A1B.A03((C64933Qa) it.next());
            if (!(A032 == null || (r2 = A032.A0M) == null)) {
                r2.A02 = 0;
                r2.A06 = C19970wo.A00(this.A0C);
                this.A0T.A01(A032, 16);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if ((r5 instanceof X.C177618e5) != false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A0G(X.AnonymousClass11F r5) {
        /*
            r4 = this;
            boolean r0 = X.AnonymousClass143.A0G(r5)
            if (r0 != 0) goto L_0x000b
            boolean r1 = r5 instanceof X.C177618e5
            r0 = 1
            if (r1 == 0) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            r3 = 0
            if (r0 == 0) goto L_0x003b
            X.0yC r2 = r4.A11
            X.AnonymousClass00C.A0D(r2, r3)
            r1 = 4873(0x1309, float:6.829E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x003b
            X.1CF r0 = r4.A1e
            boolean r0 = r0.A02(r5)
            if (r0 != 0) goto L_0x003b
            X.16D r0 = r4.A0A
            X.141 r1 = r0.A08(r5)
            if (r1 == 0) goto L_0x003b
            boolean r0 = r1.A0C()
            if (r0 == 0) goto L_0x003b
            boolean r0 = r1.A0D()
            if (r0 == 0) goto L_0x003b
            r3 = 1
        L_0x003b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20310xM.A0G(X.11F):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0080, code lost:
        if (r7.A1h.A0H(r8, 1) == false) goto L_0x0082;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A0I(X.AnonymousClass3T1 r8, X.AnonymousClass3T1 r9) {
        /*
            r7 = this;
            r8.A0w(r9)
            X.9lY r0 = r8.A0M
            r3 = 1
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.A0K()
            if (r0 == 0) goto L_0x0013
            X.9lY r0 = r8.A0M
            r0.A0F(r3)
        L_0x0013:
            r1 = 134217728(0x8000000, float:3.85186E-34)
            boolean r0 = r8.A1T(r1)
            if (r0 == 0) goto L_0x002b
            boolean r0 = r9.A1T(r1)
            if (r0 != 0) goto L_0x002b
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r8.A0j(r0)
            X.1Ek r0 = r7.A1c
            r0.A00(r8)
        L_0x002b:
            X.1A1 r0 = r7.A1B
            r1 = 5
            r0.A05(r8, r1)
            X.1DQ r0 = r7.A0T
            r0.A01(r8, r1)
            X.3Qa r5 = r8.A1J
            X.11F r2 = r5.A00
            android.os.Handler r4 = r0.A02
            r1 = 48
            X.1j5 r0 = new X.1j5
            r0.<init>(r7, r2, r1)
            r4.post(r0)
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x0082
            X.12q r1 = r7.A0I
            r0 = 0
            X.3Qp r0 = r1.A09(r2, r0)
            if (r0 == 0) goto L_0x005b
            long r4 = r0.A0Q
            long r0 = r8.A1O
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 >= 0) goto L_0x0061
        L_0x005b:
            int r1 = r8.A0D
            r0 = 13
            if (r1 != r0) goto L_0x0082
        L_0x0061:
            X.1C5 r0 = r7.A1g
            boolean r0 = r0.A03(r2)
            if (r0 == 0) goto L_0x0082
            boolean r0 = X.C183348qe.A04(r8)
            if (r0 == 0) goto L_0x007a
            X.1DL r1 = r7.A1h
            X.17E r0 = r7.A14
            X.3T1 r0 = X.C183348qe.A00(r0, r8)
            r1.A0H(r0, r3)
        L_0x007a:
            X.1DL r0 = r7.A1h
            boolean r0 = r0.A0H(r8, r3)
            if (r0 != 0) goto L_0x0098
        L_0x0082:
            boolean r0 = X.C183348qe.A04(r8)
            if (r0 == 0) goto L_0x0093
            X.1DL r1 = r7.A1h
            X.17E r0 = r7.A14
            X.3T1 r0 = X.C183348qe.A00(r0, r8)
            r1.A08(r0)
        L_0x0093:
            X.1DL r0 = r7.A1h
            r0.A08(r8)
        L_0x0098:
            X.0wQ r0 = r7.A07
            X.12q r1 = r7.A0I
            boolean r0 = X.C66013Ui.A0O(r0, r8)
            if (r0 == 0) goto L_0x00cd
            r0 = 0
            X.3Qp r2 = r1.A09(r2, r0)
            if (r2 == 0) goto L_0x00cd
            monitor-enter(r2)
            int r0 = r2.A06     // Catch:{ all -> 0x00c9 }
            int r0 = r0 + 1
            r2.A06 = r0     // Catch:{ all -> 0x00c9 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c9 }
            r1.<init>()     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = "chatInfo/incrementUnseenImportantMessageCount/"
            r1.append(r0)     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = r2.A09()     // Catch:{ all -> 0x00c9 }
            r1.append(r0)     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00c9 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00c9 }
            goto L_0x00cc
        L_0x00c9:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x00cc:
            monitor-exit(r2)
        L_0x00cd:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20310xM.A0I(X.3T1, X.3T1):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v2, types: [int] */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0J(java.io.File r7) {
        /*
            java.io.File[] r6 = r7.listFiles()
            r5 = 0
            if (r6 == 0) goto L_0x0030
            int r4 = r6.length
            r3 = 0
        L_0x0009:
            if (r5 >= r4) goto L_0x002f
            r2 = r6[r5]
            java.lang.String r1 = r2.getName()
            java.lang.String r0 = ".nomedia"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001d
            r3 = 1
        L_0x001a:
            int r5 = r5 + 1
            goto L_0x0009
        L_0x001d:
            boolean r0 = r2.isDirectory()
            if (r0 == 0) goto L_0x0028
            boolean r3 = A0J(r2)
            goto L_0x001a
        L_0x0028:
            r2.getPath()
            X.AnonymousClass6YY.A0P(r2)
            goto L_0x001a
        L_0x002f:
            r5 = r3
        L_0x0030:
            r7.getPath()
            if (r5 != 0) goto L_0x0038
            X.AnonymousClass6YY.A0P(r7)
        L_0x0038:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20310xM.A0J(java.io.File):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0218, code lost:
        if ((!r1) != false) goto L_0x021a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0303, code lost:
        if (r4 != -1) goto L_0x0305;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x031f, code lost:
        if (r0 > (r4 + r16[r17])) goto L_0x0321;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0513, code lost:
        if (r7 != false) goto L_0x0515;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0547, code lost:
        if (r23 != false) goto L_0x01cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x06a1, code lost:
        if (r22 != false) goto L_0x06a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x06e6, code lost:
        if (r0 != false) goto L_0x06e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x070f, code lost:
        if (X.AnonymousClass184.A00(r5, r12, r6.A0B(r12), r10.A0f, r10.A05, r0) != false) goto L_0x0711;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x07bb, code lost:
        if (r0 != false) goto L_0x07bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x07ee, code lost:
        if (r0 != false) goto L_0x07f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x08bb, code lost:
        if (r0 != false) goto L_0x08bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0106, code lost:
        if (r0.longValue() <= r10.A0I) goto L_0x06eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0112, code lost:
        if (A0B(r6, r10) == false) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x014f, code lost:
        if (r2 != false) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x019a, code lost:
        if (r0 != false) goto L_0x019c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x0940  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0198  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass34U A0Q(X.AnonymousClass3T1 r29, int r30) {
        /*
            r28 = this;
            boolean r0 = X.AnonymousClass6YG.A06()
            r10 = r29
            if (r0 == 0) goto L_0x0047
            boolean r0 = r10 instanceof X.C46902br
            java.lang.String r4 = ""
            java.lang.String r3 = "­"
            if (r0 == 0) goto L_0x0955
            r2 = r10
            X.2br r2 = (X.C46902br) r2
            java.lang.String r1 = r2.A03
            if (r1 == 0) goto L_0x0023
            boolean r0 = r1.contains(r3)
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = r1.replace(r3, r4)
            r2.A03 = r0
        L_0x0023:
            boolean r0 = r10.A1F()
            if (r0 == 0) goto L_0x0047
            int r0 = r10.A0D()
            if (r0 != 0) goto L_0x0047
            java.lang.String r0 = r10.A0b()
            X.C18740tg.A06(r0)
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x0047
            java.lang.String r0 = r10.A0b()
            java.lang.String r0 = r0.replace(r3, r4)
            r10.A16(r0)
        L_0x0047:
            X.3Qa r3 = r10.A1J
            X.11F r9 = r3.A00
            boolean r0 = r9 instanceof com.whatsapp.jid.UserJid
            r19 = 0
            r8 = r28
            if (r0 == 0) goto L_0x0951
            X.12q r0 = r8.A0I
            r1 = r9
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.3un r20 = r0.A0B(r1)
            java.util.concurrent.ConcurrentHashMap r0 = X.C220412q.A00(r0)
            java.lang.Object r0 = r0.get(r1)
            X.3Qp r0 = (X.C65073Qp) r0
            if (r0 == 0) goto L_0x006c
            X.3Id r0 = r0.A0a
            r19 = r0
        L_0x006c:
            boolean r0 = r9 instanceof X.C177528dw
            r18 = 1
            r4 = 0
            r11 = r30
            if (r0 != 0) goto L_0x094a
            X.C18740tg.A06(r9)
            boolean r2 = A0E(r8, r10)
            boolean r0 = r10.A1E()
            if (r0 == 0) goto L_0x0947
            X.C18740tg.A06(r9)
            X.12q r0 = r8.A0I
            X.3Qp r12 = r0.A09(r9, r4)
            if (r12 == 0) goto L_0x0947
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r18)
            java.lang.Boolean r0 = r12.A0s
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0947
            X.17A r1 = r8.A0p
            r0 = 146(0x92, float:2.05E-43)
            boolean r1 = X.AnonymousClass17A.A00(r1, r9, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r12.A0s = r0
            if (r1 != 0) goto L_0x0947
            X.19x r5 = r8.A1A
            X.0wo r0 = r8.A0C
            long r0 = X.C19970wo.A00(r0)
            X.19w r6 = r5.A01
            r5 = 1
            X.3Qa r6 = r6.A02(r9, r5)
            X.8my r5 = new X.8my
            r5.<init>(r6, r0)
            r0 = -1
            X.34U r0 = r8.A0R(r5, r0)
            boolean r0 = r0.A00
            r12.A0s = r7
        L_0x00c6:
            r2 = r2 | r0
            X.184 r5 = r8.A1d
            int r12 = r5.A01(r10)
            X.17S r6 = r8.A0O
            if (r12 == 0) goto L_0x0940
            X.12q r0 = r6.A02
            X.3Qp r0 = r0.A09(r9, r4)
            if (r0 == 0) goto L_0x091a
            int r1 = r0.A01
            r0 = 1
            if (r1 != r0) goto L_0x091a
        L_0x00de:
            boolean r7 = r10 instanceof X.AnonymousClass2bH
            if (r7 == 0) goto L_0x00e9
            int r0 = r10.A05
            if (r0 != 0) goto L_0x00e9
            r6.A06(r9, r4)
        L_0x00e9:
            X.12q r6 = r8.A0I
            X.185 r14 = r5.A01
            X.18x r13 = r5.A02
            boolean r4 = r3.A02
            if (r4 != 0) goto L_0x0108
            boolean r0 = r9 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x0108
            java.lang.Long r0 = r10.A0f
            if (r0 == 0) goto L_0x0108
            X.C18740tg.A06(r0)
            long r15 = r0.longValue()
            long r0 = r10.A0I
            int r12 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r12 <= 0) goto L_0x06eb
        L_0x0108:
            boolean r0 = A0A(r14, r6, r13, r10)
            if (r0 != 0) goto L_0x06eb
            boolean r0 = A0B(r6, r10)
            if (r0 != 0) goto L_0x06eb
        L_0x0114:
            r22 = 0
        L_0x0116:
            r23 = 0
        L_0x0118:
            X.0wQ r1 = r8.A07
            boolean r0 = X.C66013Ui.A0V(r1, r10)
            if (r0 == 0) goto L_0x0143
            com.whatsapp.jid.DeviceJid r0 = r10.A1T
            com.whatsapp.jid.DeviceJid r0 = com.whatsapp.jid.DeviceJid.of(r0)
            if (r0 == 0) goto L_0x0130
            com.whatsapp.jid.UserJid r0 = r0.userJid
            boolean r0 = r1.A0M(r0)
            if (r0 != 0) goto L_0x013e
        L_0x0130:
            X.19g r0 = r8.A0v
            java.util.ArrayList r0 = r0.A09()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0143
        L_0x013e:
            r0 = 13
            r10.A0n(r0)
        L_0x0143:
            A05(r8, r10, r11)
        L_0x0146:
            X.34U r1 = r8.A0R(r10, r11)
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x0151
            r7 = 0
            if (r2 == 0) goto L_0x0152
        L_0x0151:
            r7 = 1
        L_0x0152:
            boolean r0 = r1.A01
            r26 = r0
            X.0yC r0 = r8.A11
            r25 = r0
            r1 = 2714(0xa9a, float:3.803E-42)
            X.0yV r6 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r6, r0, r1)
            if (r0 == 0) goto L_0x06a1
            if (r22 == 0) goto L_0x0172
            X.12q r1 = r8.A0I
            X.16D r0 = r8.A0A
            boolean r0 = X.AnonymousClass3TD.A04(r0, r1, r10)
            if (r0 == 0) goto L_0x06a3
            r22 = 0
        L_0x0172:
            boolean r0 = r3.A02
            r21 = r0
            if (r0 != 0) goto L_0x019d
            boolean r0 = r10 instanceof X.AnonymousClass2bY
            if (r0 == 0) goto L_0x019d
            r1 = 2714(0xa9a, float:3.803E-42)
            r0 = r25
            boolean r0 = X.C20800yB.A01(r6, r0, r1)
            if (r0 == 0) goto L_0x0696
            java.lang.String r0 = "CoreMessageStore/incomingEphemeralSyncResponse/process ESR"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r14 = r7
            r11 = r10
            X.2bY r11 = (X.AnonymousClass2bY) r11
            if (r9 != 0) goto L_0x054b
            java.lang.String r0 = "CoreMessageStore/incomingEphemeralSyncResponse/no chat"
        L_0x0193:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0196:
            if (r14 != 0) goto L_0x019c
            r0 = r7
            r7 = 0
            if (r0 == 0) goto L_0x019d
        L_0x019c:
            r7 = 1
        L_0x019d:
            X.184 r1 = r8.A1d
            X.12q r0 = r8.A0I
            r24 = r0
            X.16D r2 = r8.A0A
            if (r21 != 0) goto L_0x0546
            boolean r0 = r9 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x0546
            X.185 r1 = r1.A01
            r0 = r9
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            boolean r0 = r1.A04(r0)
            if (r0 != 0) goto L_0x0546
            boolean r0 = r10 instanceof X.AnonymousClass2bH
            if (r0 != 0) goto L_0x0546
            boolean r0 = r10 instanceof X.AnonymousClass2bY
            if (r0 != 0) goto L_0x0546
            r1 = 0
            r0 = r24
            X.3Qp r0 = r0.A09(r9, r1)
            if (r0 == 0) goto L_0x0546
            r0 = r24
            boolean r0 = X.AnonymousClass3TD.A04(r2, r0, r10)
            if (r0 == 0) goto L_0x0546
        L_0x01cf:
            r0 = 1
        L_0x01d0:
            if (r22 != 0) goto L_0x01ea
            if (r0 == 0) goto L_0x01ea
            java.lang.String r0 = "CoreMessageStore/sendEphemeralSyncResponse/process ESR if needed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r22 = r7
            if (r9 != 0) goto L_0x0283
            java.lang.String r0 = "CoreMessageStore/sendEphemeralSyncResponse/no chat info"
        L_0x01df:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x01e2:
            if (r22 != 0) goto L_0x01e8
            if (r7 != 0) goto L_0x01e8
            r18 = 0
        L_0x01e8:
            r7 = r18
        L_0x01ea:
            r1 = 1302(0x516, float:1.824E-42)
            r0 = r25
            boolean r0 = X.C20800yB.A01(r6, r0, r1)
            if (r0 == 0) goto L_0x0255
            java.lang.String r1 = r10.A0q
            java.lang.String r0 = "directory"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0255
            if (r9 == 0) goto L_0x0255
            X.17T r0 = r8.A0j
            boolean r0 = r0.A08(r9)
            if (r0 == 0) goto L_0x021a
            java.util.Map r2 = X.C56122vm.A00
            java.lang.Object r0 = r2.get(r9)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x0273
            boolean r1 = r0.booleanValue()
        L_0x0216:
            r0 = r1 ^ 1
            if (r0 == 0) goto L_0x0255
        L_0x021a:
            X.0wQ r1 = r8.A07
            r1.A0G()
            com.whatsapp.jid.PhoneUserJid r0 = r1.A03
            if (r0 == 0) goto L_0x0255
            X.13r r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r5 = X.C222813r.A00(r9)
            if (r5 == 0) goto L_0x0255
            X.19x r3 = r8.A1A
            if (r21 == 0) goto L_0x025d
            r1.A0G()
            com.whatsapp.jid.PhoneUserJid r6 = r1.A03
            X.0wo r0 = r8.A0C
            long r0 = X.C19970wo.A00(r0)
            X.19w r2 = r3.A01
            r4 = 1
            X.3Qa r2 = r2.A02(r5, r4)
            X.8mr r3 = new X.8mr
            r3.<init>(r2, r0)
            r3.A0q(r6)
        L_0x0249:
            r8.A0P(r3)
            java.util.Map r1 = X.C56122vm.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r1.put(r9, r0)
        L_0x0255:
            X.34U r1 = new X.34U
            r0 = r26
            r1.<init>(r7, r0)
            return r1
        L_0x025d:
            X.0wo r0 = r8.A0C
            long r1 = X.C19970wo.A00(r0)
            X.19w r0 = r3.A01
            r4 = 1
            X.3Qa r0 = r0.A02(r5, r4)
            X.8mr r3 = new X.8mr
            r3.<init>(r0, r1)
            r3.A0q(r5)
            goto L_0x0249
        L_0x0273:
            X.17A r1 = r8.A0p
            r0 = 76
            boolean r1 = X.AnonymousClass17A.A00(r1, r9, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r2.put(r9, r0)
            goto L_0x0216
        L_0x0283:
            r1 = 2714(0xa9a, float:3.803E-42)
            r0 = r25
            boolean r0 = X.C20800yB.A01(r6, r0, r1)
            if (r0 != 0) goto L_0x029a
            X.1Fk r1 = r8.A0z
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)
            r1.A02(r9, r0)
            java.lang.String r0 = "CoreMessageStore/sendEphemeralSyncResponse/esr abprop off"
            goto L_0x01df
        L_0x029a:
            X.17S r11 = r8.A0O
            int[] r4 = X.AnonymousClass17S.A0D
            int r3 = r10.A1I
            r2 = 8
            r1 = 0
        L_0x02a3:
            r0 = r4[r1]
            if (r0 != r3) goto L_0x02bd
            X.13r r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r13 = X.C222813r.A00(r9)
            if (r13 != 0) goto L_0x02cf
            X.1Fk r1 = r8.A0z
            r0 = 7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A02(r9, r0)
            java.lang.String r0 = "CoreMessageStore/sendEphemeralSyncResponse/no user info"
            goto L_0x01df
        L_0x02bd:
            int r1 = r1 + 1
            if (r1 < r2) goto L_0x02a3
            X.1Fk r1 = r8.A0z
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A02(r9, r0)
            java.lang.String r0 = "CoreMessageStore/sendEphemeralSyncResponse/invalid message type"
            goto L_0x01df
        L_0x02cf:
            r0 = r24
            X.3un r12 = r0.A0B(r13)
            if (r12 != 0) goto L_0x02e5
            X.1Fk r1 = r8.A0z
            r0 = 5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A02(r9, r0)
            java.lang.String r0 = "CoreMessageStore/sendEphemeralSyncResponse/no ephemeral info"
            goto L_0x01df
        L_0x02e5:
            java.lang.String r1 = r9.getRawString()
            int r17 = r11.A03(r1)
            X.183 r2 = r11.A09
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            java.util.concurrent.ConcurrentHashMap r0 = r2.A00
            java.lang.Object r0 = r0.get(r1)
            X.9fo r0 = (X.C199699fo) r0
            if (r0 == 0) goto L_0x0351
            long r4 = r0.A01
            r2 = -1
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0351
        L_0x0305:
            r1 = 7069(0x1b9d, float:9.906E-42)
            r0 = r25
            int r0 = X.C20800yB.A00(r6, r0, r1)
            long r2 = (long) r0
            long r0 = java.lang.System.currentTimeMillis()
            long[] r16 = X.C26371Jx.A08
            r14 = 3
            r15 = r14
            r14 = r17
            if (r14 >= r15) goto L_0x033f
            r2 = r16[r17]
            long r4 = r4 + r2
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0538
        L_0x0321:
            java.lang.Long r0 = r10.A0f
            if (r0 == 0) goto L_0x035b
            long r3 = r0.longValue()
            long r0 = r12.ephemeralSettingTimestamp
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x035b
            if (r23 != 0) goto L_0x035b
            X.1Fk r1 = r8.A0z
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A02(r9, r0)
            java.lang.String r0 = "CoreMessageStore/sendEphemeralSyncResponse/older EST"
            goto L_0x01df
        L_0x033f:
            r14 = 60000(0xea60, double:2.9644E-319)
            long r2 = r2 * r14
            long r4 = r4 + r2
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0538
            java.lang.String r3 = r9.getRawString()
            r2 = 0
            r11.A09(r3, r0, r2)
            goto L_0x0321
        L_0x0351:
            X.9fo r0 = X.AnonymousClass17S.A02(r11, r1)
            r11.A05(r0, r1)
            long r4 = r0.A01
            goto L_0x0305
        L_0x035b:
            java.util.concurrent.ConcurrentHashMap r0 = X.C220412q.A00(r24)
            java.lang.Object r0 = r0.get(r13)
            X.3Qp r0 = (X.C65073Qp) r0
            if (r0 != 0) goto L_0x0534
            r3 = 0
        L_0x0368:
            X.1FY r2 = r8.A0y
            com.whatsapp.jid.DeviceJid r14 = r10.A1T
            int r0 = r12.expiration
            r17 = r0
            long r15 = r12.ephemeralSettingTimestamp
            X.0wo r0 = r8.A0C
            long r0 = X.C19970wo.A00(r0)
            int r12 = r12.disappearingMessagesInitiator
            if (r3 == 0) goto L_0x052e
            int r5 = r3.A00
            java.lang.Boolean r4 = r3.A01
        L_0x0380:
            X.19w r3 = r2.A00
            r2 = 1
            X.3Qa r3 = r3.A02(r13, r2)
            X.2bY r2 = new X.2bY
            r2.<init>(r3, r0)
            r2.A0q(r13)
            r2.A02 = r14
            java.lang.Long r0 = java.lang.Long.valueOf(r15)
            r2.A15(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            r2.A1X(r0)
            r2.A00 = r12
            r2.A04 = r5
            if (r4 == 0) goto L_0x03af
            boolean r0 = r4.booleanValue()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A0d = r0
        L_0x03af:
            java.lang.String r0 = "CoreMessageStore/sendEphemeralSyncResponse/added ephemeral sync response message"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Boolean r0 = X.C18750th.A03
            int r4 = r2.A00
            long r0 = r2.A01
            int r3 = r2.A00
            X.3un r5 = new X.3un
            r5.<init>(r4, r0, r3)
            int r1 = r2.A04
            java.lang.Boolean r0 = r2.A0d
            X.3Id r13 = new X.3Id
            r13.<init>(r0, r1)
            r0 = 0
            java.lang.Long r3 = r10.A0f
            if (r3 == 0) goto L_0x03d4
            long r0 = r3.longValue()
        L_0x03d4:
            int r4 = r10.A05
            int r3 = r10.A00
            X.3un r12 = new X.3un
            r12.<init>(r4, r0, r3)
            int r1 = r10.A04
            java.lang.Boolean r0 = r10.A0d
            X.3Id r15 = new X.3Id
            r15.<init>(r0, r1)
            X.1Fk r14 = r8.A0z
            X.0yC r4 = r14.A01
            r0 = 5580(0x15cc, float:7.819E-42)
            boolean r0 = X.C20800yB.A01(r6, r4, r0)
            if (r0 == 0) goto L_0x04f4
            X.2T1 r3 = new X.2T1
            r3.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)
            r3.A08 = r0
            X.17S r1 = r14.A00
            java.lang.String r0 = r9.getRawString()
            int r0 = r1.A03(r0)
            long r0 = (long) r0
            r16 = 1
            long r0 = r0 + r16
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A0G = r0
            X.17V r1 = r14.A03
            java.lang.String r0 = r9.getRawString()
            java.lang.String r0 = r1.A03(r0)
            r3.A0J = r0
            boolean r0 = X.AnonymousClass143.A0G(r9)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A00 = r0
            if (r20 == 0) goto L_0x044d
            r0 = r20
            int r0 = r0.expiration
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A0C = r0
            r0 = r20
            int r0 = r0.disappearingMessagesInitiator
            int r0 = X.C25211Fk.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A01 = r0
            r0 = r20
            long r0 = r0.ephemeralSettingTimestamp
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A0D = r0
        L_0x044d:
            int r0 = r12.expiration
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A0H = r0
            int r0 = r12.disappearingMessagesInitiator
            int r0 = X.C25211Fk.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A09 = r0
            long r0 = r12.ephemeralSettingTimestamp
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A0I = r0
            int r0 = r5.expiration
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A0E = r0
            int r0 = r5.disappearingMessagesInitiator
            int r0 = X.C25211Fk.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A04 = r0
            long r0 = r5.ephemeralSettingTimestamp
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A0F = r0
            r0 = 5309(0x14bd, float:7.44E-42)
            boolean r0 = X.C20800yB.A01(r6, r4, r0)
            if (r0 == 0) goto L_0x04ef
            if (r19 == 0) goto L_0x04b3
            r0 = r19
            int r0 = r0.A00
            int r0 = X.AnonymousClass3UK.A01(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A03 = r0
            r0 = r19
            java.lang.Boolean r0 = r0.A01
            if (r0 == 0) goto L_0x04b3
            boolean r1 = r0.booleanValue()
            r0 = 2
            if (r1 == 0) goto L_0x04ad
            r0 = 1
        L_0x04ad:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A02 = r0
        L_0x04b3:
            int r0 = r15.A00
            int r0 = X.AnonymousClass3UK.A01(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A0B = r0
            java.lang.Boolean r0 = r15.A01
            if (r0 == 0) goto L_0x04d1
            boolean r1 = r0.booleanValue()
            r0 = 2
            if (r1 == 0) goto L_0x04cb
            r0 = 1
        L_0x04cb:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A0A = r0
        L_0x04d1:
            int r0 = r13.A00
            int r0 = X.AnonymousClass3UK.A01(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A06 = r0
            java.lang.Boolean r0 = r13.A01
            if (r0 == 0) goto L_0x04ef
            boolean r1 = r0.booleanValue()
            r0 = 2
            if (r1 == 0) goto L_0x04e9
            r0 = 1
        L_0x04e9:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A05 = r0
        L_0x04ef:
            X.0yW r0 = r14.A02
            r0.Bly(r3)
        L_0x04f4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "CoreMessageStore/sendEphemeralSyncResponse/send ESR "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = -1
            X.34U r0 = r8.A0R(r2, r0)
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0515
            r22 = 0
            if (r7 == 0) goto L_0x0517
        L_0x0515:
            r22 = 1
        L_0x0517:
            java.lang.String r0 = r9.getRawString()
            int r2 = r11.A03(r0)
            java.lang.String r3 = r9.getRawString()
            long r0 = java.lang.System.currentTimeMillis()
            int r2 = r2 + 1
            r11.A09(r3, r0, r2)
            goto L_0x01e2
        L_0x052e:
            int r5 = r10.A04
            java.lang.Boolean r4 = r10.A0d
            goto L_0x0380
        L_0x0534:
            X.3Id r3 = r0.A0a
            goto L_0x0368
        L_0x0538:
            X.1Fk r1 = r8.A0z
            r0 = 6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A02(r9, r0)
            java.lang.String r0 = "CoreMessageStore/sendEphemeralSyncResponse/backoff retry implemented"
            goto L_0x01df
        L_0x0546:
            r0 = 0
            if (r23 == 0) goto L_0x01d0
            goto L_0x01cf
        L_0x054b:
            X.13r r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r1 = X.C222813r.A00(r9)
            if (r1 != 0) goto L_0x0564
            java.lang.String r0 = "CoreMessageStore/incomingEphemeralSyncResponse/not a user"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.1Fk r1 = r8.A0z
            r0 = 7
        L_0x055b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01(r9, r0)
            goto L_0x0196
        L_0x0564:
            X.12q r0 = r8.A0I
            X.3un r5 = r0.A0B(r1)
            java.util.concurrent.ConcurrentHashMap r0 = X.C220412q.A00(r0)
            java.lang.Object r0 = r0.get(r1)
            X.3Qp r0 = (X.C65073Qp) r0
            if (r0 != 0) goto L_0x0587
            r4 = 0
        L_0x0577:
            if (r5 != 0) goto L_0x058a
            X.1Fk r1 = r8.A0z
            r0 = 5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01(r9, r0)
            java.lang.String r0 = "CoreMessageStore/incomingEphemeralSyncResponse/no ephemeral info"
            goto L_0x0193
        L_0x0587:
            X.3Id r4 = r0.A0a
            goto L_0x0577
        L_0x058a:
            long r2 = r5.ephemeralSettingTimestamp
            long r0 = r11.A01
            r13 = 1
            int r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r2 = 0
            if (r12 > 0) goto L_0x0595
            r2 = 1
        L_0x0595:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "CoreMessageStore/incomingEphemeralSyncResponse/newer EST "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r2 == 0) goto L_0x0691
            int r1 = r5.expiration
            int r0 = r11.A00
            if (r0 == r1) goto L_0x05cd
            java.lang.String r0 = "CoreMessageStore/incomingEphemeralSyncResponse/add ephemeral setting change system msg"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            long r0 = r11.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            X.C18740tg.A06(r0)
            long r0 = r0.longValue()
            boolean r0 = A0F(r8, r10, r0)
            if (r0 != 0) goto L_0x05cc
            if (r7 != 0) goto L_0x05cc
            r13 = 0
        L_0x05cc:
            r14 = r13
        L_0x05cd:
            X.1Fl r0 = r8.A0P
            X.3Qp r0 = r0.A03(r11)
            if (r0 == 0) goto L_0x0196
            X.3un r13 = r0.A0b
            X.3Id r12 = r0.A0a
            X.1Fk r11 = r8.A0z
            X.0yC r3 = r11.A01
            r0 = 5580(0x15cc, float:7.819E-42)
            boolean r0 = X.C20800yB.A01(r6, r3, r0)
            if (r0 == 0) goto L_0x0196
            X.2Sk r2 = new X.2Sk
            r2.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)
            r2.A08 = r0
            X.17V r1 = r11.A03
            java.lang.String r0 = r9.getRawString()
            java.lang.String r0 = r1.A03(r0)
            r2.A0D = r0
            boolean r0 = X.AnonymousClass143.A0G(r9)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A00 = r0
            int r0 = r5.expiration
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A09 = r0
            int r0 = r5.disappearingMessagesInitiator
            int r0 = X.C25211Fk.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A01 = r0
            long r0 = r5.ephemeralSettingTimestamp
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0A = r0
            if (r13 == 0) goto L_0x0642
            int r0 = r13.expiration
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0B = r0
            int r0 = r13.disappearingMessagesInitiator
            int r0 = X.C25211Fk.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A04 = r0
            long r0 = r13.ephemeralSettingTimestamp
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0C = r0
        L_0x0642:
            r0 = 5309(0x14bd, float:7.44E-42)
            boolean r0 = X.C20800yB.A01(r6, r3, r0)
            if (r0 == 0) goto L_0x068a
            if (r4 == 0) goto L_0x066a
            int r0 = r4.A00
            int r0 = X.AnonymousClass3UK.A01(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A03 = r0
            java.lang.Boolean r0 = r4.A01
            if (r0 == 0) goto L_0x066a
            boolean r1 = r0.booleanValue()
            r0 = 2
            if (r1 == 0) goto L_0x0664
            r0 = 1
        L_0x0664:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A02 = r0
        L_0x066a:
            if (r12 == 0) goto L_0x068a
            int r0 = r12.A00
            int r0 = X.AnonymousClass3UK.A01(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A06 = r0
            java.lang.Boolean r0 = r12.A01
            if (r0 == 0) goto L_0x068a
            boolean r1 = r0.booleanValue()
            r0 = 2
            if (r1 == 0) goto L_0x0684
            r0 = 1
        L_0x0684:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A05 = r0
        L_0x068a:
            X.0yW r0 = r11.A02
            r0.Bly(r2)
            goto L_0x0196
        L_0x0691:
            X.1Fk r1 = r8.A0z
            r0 = 4
            goto L_0x055b
        L_0x0696:
            X.1Fk r1 = r8.A0z
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)
            r1.A01(r9, r0)
            goto L_0x019d
        L_0x06a1:
            if (r22 == 0) goto L_0x0172
        L_0x06a3:
            X.1FY r4 = r8.A0y
            X.18x r0 = r8.A0x
            java.lang.Integer r12 = r0.A04()
            int r13 = r12.intValue()
            X.0wo r0 = r8.A0C
            long r0 = X.C19970wo.A00(r0)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r18)
            r5 = 2
            r2 = 0
            X.AnonymousClass00C.A0D(r9, r2)
            X.19w r4 = r4.A00
            r2 = 1
            X.3Qa r4 = r4.A02(r9, r2)
            X.2bH r2 = new X.2bH
            r2.<init>(r4, r0)
            r2.A0q(r9)
            r2.A1X(r12)
            if (r13 <= 0) goto L_0x06d6
            r2.A04 = r5
            r2.A0d = r11
        L_0x06d6:
            java.lang.String r0 = "CoreMessageStore/addOrUpdateMessage/added backwards compat dmm ephemeral setting message"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = -1
            X.34U r0 = r8.A0R(r2, r0)
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x06e8
            r0 = r7
            r7 = 0
            if (r0 == 0) goto L_0x0172
        L_0x06e8:
            r7 = 1
            goto L_0x0172
        L_0x06eb:
            X.C18740tg.A06(r9)
            r12 = r9
            com.whatsapp.jid.UserJid r12 = (com.whatsapp.jid.UserJid) r12
            boolean r0 = A0A(r14, r6, r13, r10)
            if (r0 != 0) goto L_0x0711
            long r0 = r10.A0I
            int r14 = r10.A05
            java.lang.Long r13 = r10.A0f
            X.3un r23 = r6.A0B(r12)
            r21 = r5
            r22 = r12
            r24 = r13
            r25 = r14
            r26 = r0
            boolean r0 = X.AnonymousClass184.A00(r21, r22, r23, r24, r25, r26)
            if (r0 == 0) goto L_0x0114
        L_0x0711:
            X.185 r14 = r8.A0B
            X.18x r13 = r8.A0x
            boolean r0 = A0A(r14, r6, r13, r10)
            if (r0 != 0) goto L_0x076a
            boolean r0 = A0B(r6, r10)
            if (r0 != 0) goto L_0x076a
            boolean r0 = A0C(r6, r10)
            if (r0 != 0) goto L_0x076a
            boolean r0 = r10 instanceof X.C181108mw
            if (r0 == 0) goto L_0x07dd
            X.1Fl r0 = r8.A0P
            X.19x r2 = r0.A07
            X.C18740tg.A06(r9)
            X.C18740tg.A06(r9)
            long r0 = r10.A0I
            X.19w r4 = r2.A01
            r2 = 1
            X.3Qa r2 = r4.A02(r9, r2)
            X.8mw r4 = new X.8mw
            r4.<init>(r2, r0)
            r4.A0q(r9)
            r2 = -1
            A05(r8, r4, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "CoreMessageStore/added ephemeral keep in chat system message; jid="
            r1.append(r0)
            X.3Qa r0 = r4.A1J
            X.11F r0 = r0.A00
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.34U r0 = r8.A0R(r4, r2)
            boolean r2 = r0.A00
            goto L_0x0114
        L_0x076a:
            boolean r22 = A0A(r14, r6, r13, r10)
            if (r4 != 0) goto L_0x07c5
            boolean r0 = r9 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x07c5
            boolean r0 = r14.A04(r12)
            if (r0 != 0) goto L_0x07c5
            if (r7 != 0) goto L_0x07c5
            boolean r0 = r10 instanceof X.AnonymousClass2bY
            if (r0 != 0) goto L_0x07c5
            r0 = 0
            X.3Qp r0 = r6.A09(r9, r0)
            if (r0 != 0) goto L_0x07c5
            int r0 = r10.A05
            if (r0 <= 0) goto L_0x07c5
            boolean r0 = r13.A06()
            if (r0 != 0) goto L_0x07c5
            int r1 = r10.A00
            r0 = 2
            if (r1 != r0) goto L_0x07c5
        L_0x0796:
            X.0yC r5 = r8.A11
            r0 = 2714(0xa9a, float:3.803E-42)
            X.0yV r1 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r1, r5, r0)
            if (r0 == 0) goto L_0x0850
            r0 = 4131(0x1023, float:5.789E-42)
            boolean r0 = X.C20800yB.A01(r1, r5, r0)
            if (r0 == 0) goto L_0x0850
            java.lang.Long r0 = r10.A0f
            X.C18740tg.A06(r0)
            long r0 = r0.longValue()
            boolean r0 = A0F(r8, r10, r0)
            if (r0 != 0) goto L_0x07bd
            r0 = r2
            r2 = 0
            if (r0 == 0) goto L_0x07be
        L_0x07bd:
            r2 = 1
        L_0x07be:
            java.lang.String r0 = "CoreMessageStore/sendEphemeralSyncResponse/ephemeral setting added and send ESR"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x084c
        L_0x07c5:
            boolean r0 = A0C(r6, r10)
            if (r0 == 0) goto L_0x0850
            java.lang.Integer r0 = r13.A04()
            int r1 = r0.intValue()
            int r0 = r10.A05
            if (r1 <= r0) goto L_0x0850
            int r1 = r10.A00
            r0 = 2
            if (r1 != r0) goto L_0x0850
            goto L_0x0796
        L_0x07dd:
            java.lang.Long r0 = r10.A0f
            X.C18740tg.A06(r0)
            long r0 = r0.longValue()
            boolean r0 = A0F(r8, r10, r0)
            if (r0 != 0) goto L_0x07f0
            r0 = r2
            r2 = 0
            if (r0 == 0) goto L_0x07f1
        L_0x07f0:
            r2 = 1
        L_0x07f1:
            X.3un r5 = r6.A0B(r12)
            r1 = 0
            if (r5 == 0) goto L_0x0114
            java.lang.Long r0 = r10.A0f
            if (r0 == 0) goto L_0x0114
            if (r4 != 0) goto L_0x0114
            boolean r0 = r9 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x0114
            boolean r0 = r14.A04(r12)
            if (r0 != 0) goto L_0x0114
            if (r7 != 0) goto L_0x0114
            boolean r0 = r10 instanceof X.AnonymousClass2bY
            if (r0 != 0) goto L_0x0114
            X.3Qp r0 = r6.A09(r9, r1)
            if (r0 == 0) goto L_0x0114
            int r0 = r10.A05
            if (r0 <= 0) goto L_0x0114
            boolean r0 = r13.A06()
            if (r0 != 0) goto L_0x0114
            int r1 = r5.expiration
            int r0 = r10.A05
            if (r1 != r0) goto L_0x0114
            long r0 = r5.ephemeralSettingTimestamp
            java.lang.Long r4 = r10.A0f
            long r6 = r4.longValue()
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x0114
            int r1 = r10.A00
            r0 = 2
            if (r1 != r0) goto L_0x0114
            int r0 = r5.disappearingMessagesInitiator
            if (r0 != 0) goto L_0x0114
            X.0yC r4 = r8.A11
            r1 = 4131(0x1023, float:5.789E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r4, r1)
            if (r0 == 0) goto L_0x0114
            java.lang.String r0 = "CoreMessageStore/sendEphemeralSyncResponse/initiator different so send ESR"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r22 = 0
        L_0x084c:
            r23 = 1
            goto L_0x0118
        L_0x0850:
            X.1Fl r12 = r8.A0P
            X.12q r14 = r12.A01
            boolean r0 = A0B(r14, r10)
            r6 = 1
            if (r0 != 0) goto L_0x08c0
            boolean r0 = A0C(r14, r10)
            if (r0 != 0) goto L_0x08c0
            long r0 = r10.A0I
            X.18x r5 = r12.A03
            java.lang.Integer r4 = r5.A04()
            int r7 = r4.intValue()
            X.0wQ r4 = r12.A00
            r4.A0G()
            com.whatsapp.jid.PhoneUserJid r4 = r4.A03
            X.C18740tg.A06(r4)
            long r16 = r5.A01(r4)
            X.19x r5 = r12.A07
            X.13r r4 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r13 = X.C222813r.A00(r9)
            X.C18740tg.A06(r13)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r18)
        L_0x088a:
            X.19w r5 = r5.A01
            r4 = 1
            X.3Qa r5 = r5.A02(r13, r4)
            X.8n1 r4 = new X.8n1
            r4.<init>(r5, r0)
            r4.A00 = r7
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            r4.A15(r0)
            r4.A00 = r6
            r0 = 2
            r4.A04 = r0
            if (r12 == 0) goto L_0x08a8
            r4.A0d = r12
        L_0x08a8:
            r1 = -1
            A05(r8, r4, r1)
            java.lang.String r0 = "CoreMessageStore/added Disappearing Mode System Message"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.34U r0 = r8.A0R(r4, r1)
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x08bd
            r0 = r2
            r2 = 0
            if (r0 == 0) goto L_0x0116
        L_0x08bd:
            r2 = 1
            goto L_0x0116
        L_0x08c0:
            long r0 = r10.A0I
            int r7 = r10.A05
            int r13 = r10.A00
            java.lang.Long r5 = r10.A0f
            X.C18740tg.A06(r5)
            long r16 = r5.longValue()
            if (r4 != 0) goto L_0x0918
            if (r13 != r6) goto L_0x08d4
            r6 = 2
        L_0x08d4:
            X.0yC r15 = r12.A06
            r5 = 2714(0xa9a, float:3.803E-42)
            X.0yV r4 = X.C21000yV.A02
            boolean r4 = X.C20800yB.A01(r4, r15, r5)
            if (r4 == 0) goto L_0x0909
            boolean r4 = A0C(r14, r10)
            if (r4 == 0) goto L_0x0909
            X.18x r5 = r12.A03
            java.lang.Integer r4 = r5.A04()
            int r4 = r4.intValue()
            if (r4 == 0) goto L_0x0909
            if (r4 >= r7) goto L_0x0909
            if (r13 == 0) goto L_0x0909
            java.lang.Integer r4 = r5.A04()
            int r7 = r4.intValue()
            long r16 = java.lang.System.currentTimeMillis()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r16 = r16 / r4
            long r16 = r16 * r4
            r6 = 1
        L_0x0909:
            X.19x r5 = r12.A07
            X.13r r4 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r13 = X.C222813r.A00(r9)
            X.C18740tg.A06(r13)
            java.lang.Boolean r12 = r10.A0d
            goto L_0x088a
        L_0x0918:
            r6 = r13
            goto L_0x08d4
        L_0x091a:
            X.1Fl r0 = r8.A0P
            X.C18740tg.A06(r9)
            X.19x r2 = r0.A07
            long r0 = r10.A0I
            X.19w r7 = r2.A01
            r2 = 1
            X.3Qa r13 = r7.A02(r9, r2)
            r7 = 130(0x82, float:1.82E-43)
            X.2bI r2 = new X.2bI
            r2.<init>(r13, r7, r0)
            r2.A0q(r9)
            r0 = -1
            X.34U r0 = r8.A0R(r2, r0)
            boolean r2 = r0.A00
            r6.A06(r9, r12)
            goto L_0x00de
        L_0x0940:
            long r0 = r10.A0I
            r6.A04(r10, r0)
            goto L_0x00de
        L_0x0947:
            r0 = 0
            goto L_0x00c6
        L_0x094a:
            r2 = 0
            r22 = 0
            r23 = 0
            goto L_0x0146
        L_0x0951:
            r20 = r19
            goto L_0x006c
        L_0x0955:
            boolean r0 = r10 instanceof X.AnonymousClass2bU
            if (r0 == 0) goto L_0x0970
            r2 = r10
            X.2bU r2 = (X.AnonymousClass2bU) r2
            java.lang.String r1 = r2.A1a()
            if (r1 == 0) goto L_0x0023
            boolean r0 = r1.contains(r3)
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = r1.replace(r3, r4)
            r2.A02 = r0
            goto L_0x0023
        L_0x0970:
            boolean r0 = r10 instanceof X.AnonymousClass2bV
            if (r0 == 0) goto L_0x0023
            r2 = r10
            X.2bV r2 = (X.AnonymousClass2bV) r2
            java.lang.String r1 = r2.A05
            if (r1 == 0) goto L_0x0023
            boolean r0 = r1.contains(r3)
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = r1.replace(r3, r4)
            r2.A05 = r0
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20310xM.A0Q(X.3T1, int):X.34U");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d4, code lost:
        if ((r4.A0I + (((long) r15.A05) * 1000)) >= r13) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (r15.A1Y != false) goto L_0x0018;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass34U A0R(X.AnonymousClass3T1 r37, int r38) {
        /*
            r36 = this;
            long r12 = android.os.SystemClock.uptimeMillis()
            r5 = 1
            r0 = r36
            r15 = r37
            X.3Ox r4 = r0.A0T(r15, r5)
            X.3Qa r3 = r15.A1J
            boolean r9 = r3.A02
            if (r9 == 0) goto L_0x0018
            boolean r1 = r15.A1Y
            r11 = 0
            if (r1 == 0) goto L_0x0019
        L_0x0018:
            r11 = 1
        L_0x0019:
            boolean r8 = r4.A04
            r10 = r38
            if (r8 == 0) goto L_0x00ac
            X.12g r7 = r0.A0M
            long r1 = android.os.SystemClock.uptimeMillis()
            long r1 = r1 - r12
            java.lang.String r6 = "CoreMessageStore/writeMessageToDatabase"
            r7.A01(r6, r1)
            if (r11 != 0) goto L_0x0062
            long r29 = android.os.SystemClock.uptimeMillis()
            long r1 = r15.A1d
            long r29 = r29 - r1
            long r27 = android.os.SystemClock.uptimeMillis()
            X.1DT r14 = r0.A08
            r18 = 0
            int r11 = r15.A0B
            r16 = 0
            long r6 = r15.A1S
            long r25 = r27 - r6
            long r27 = r27 - r1
            r17 = 2
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r24 = r11
            r14.A0Q(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r29, r31, r32, r33, r34, r35)
        L_0x0062:
            r6 = 4
            if (r9 == 0) goto L_0x0072
            int r1 = r15.A0D
            int r1 = X.AnonymousClass3TJ.A00(r1, r6)
            if (r1 >= 0) goto L_0x0072
            java.util.Map r1 = r0.A1H
            r1.put(r3, r15)
        L_0x0072:
            long r1 = r15.A1Q
            r0.A01(r1)
            boolean r1 = r4.A00
            if (r1 == 0) goto L_0x008d
            X.1DQ r0 = r0.A0T
            android.os.Handler r1 = r0.A00
            r0 = 0
            android.os.Message r0 = android.os.Message.obtain(r1, r6, r10, r0, r15)
            r0.sendToTarget()
            X.34U r0 = new X.34U
            r0.<init>(r5, r8)
            return r0
        L_0x008d:
            r2 = 0
            X.1DQ r0 = r0.A0T
            android.os.Handler r1 = r0.A00
            r0 = 5
            android.os.Message r0 = android.os.Message.obtain(r1, r0, r10, r2, r15)
            r0.sendToTarget()
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x00a6
            r0 = 6
            android.os.Message r0 = android.os.Message.obtain(r1, r0, r10, r2, r15)
            r0.sendToTarget()
        L_0x00a6:
            X.34U r0 = new X.34U
            r0.<init>(r2, r8)
            return r0
        L_0x00ac:
            r8 = 0
            boolean r1 = r4.A02
            if (r1 == 0) goto L_0x01a7
            if (r11 == 0) goto L_0x0197
            X.1A1 r1 = r0.A1B
            X.3T1 r4 = r1.A03(r3)
            if (r4 == 0) goto L_0x0197
            r9 = r15
            X.0wo r1 = r0.A0C
            long r13 = X.C19970wo.A00(r1)
            boolean r1 = r15.A1G()
            if (r1 == 0) goto L_0x00d6
            long r6 = r4.A0I
            int r1 = r15.A05
            long r1 = (long) r1
            r11 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r11
            long r6 = r6 + r1
            int r2 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            r1 = 1
            if (r2 < 0) goto L_0x00d7
        L_0x00d6:
            r1 = 0
        L_0x00d7:
            r6 = 11
            r7 = 0
            r13 = 0
            if (r1 == 0) goto L_0x00fa
            boolean r13 = r0.A0H(r15, r4)
        L_0x00e1:
            r9 = r7
        L_0x00e2:
            if (r13 == 0) goto L_0x0197
            X.1DQ r0 = r0.A0T
            android.os.Handler r1 = r0.A02
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r9, r4)
            android.os.Message r0 = android.os.Message.obtain(r1, r6, r0)
        L_0x00f1:
            r0.sendToTarget()
        L_0x00f4:
            X.34U r0 = new X.34U
            r0.<init>(r8, r8)
            return r0
        L_0x00fa:
            int r2 = r4.A1I
            r1 = 31
            if (r2 != r1) goto L_0x0105
            boolean r13 = r0.A0I(r15, r4)
            goto L_0x00e2
        L_0x0105:
            if (r2 != r6) goto L_0x0197
            X.3Qa r1 = r4.A1J
            X.11F r1 = r1.A00
            boolean r1 = r1 instanceof X.C177528dw
            if (r1 == 0) goto L_0x0142
            long r1 = r4.A0I
            r15.A0I = r1
            r0.A0o(r4, r5, r8)
            long r11 = android.os.SystemClock.uptimeMillis()
            X.3Ox r1 = r0.A0T(r15, r5)
            boolean r1 = r1.A04
            if (r1 == 0) goto L_0x013d
            X.12g r5 = r0.A0M
            long r1 = android.os.SystemClock.uptimeMillis()
            long r1 = r1 - r11
            java.lang.String r3 = "CoreMessageStore/writeMessageToDatabase"
            r5.A01(r3, r1)
            X.1DQ r1 = r0.A0T
            android.os.Handler r3 = r1.A00
            r2 = 17
            X.1iP r1 = new X.1iP
            r1.<init>((java.lang.Object) r0, (int) r10, (int) r2, (java.lang.Object) r15)
            r3.post(r1)
            r13 = 1
        L_0x013d:
            r7 = r15
        L_0x013e:
            X.AnonymousClass3MF.A00(r15)
            goto L_0x00e1
        L_0x0142:
            r1 = 32
            boolean r1 = r4.A1T(r1)
            if (r1 == 0) goto L_0x016d
            r1 = 8
            boolean r1 = r15.A1T(r1)
            if (r1 != 0) goto L_0x0192
            boolean r1 = r15 instanceof X.C88854Uh
            if (r1 != 0) goto L_0x0192
            java.lang.String r1 = "CoreMessageStore/addmessage/crypto-retry-reject/mismatch declared hsm"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.17E r9 = r0.A14
            long r1 = r15.A0I
            r7 = 19
            X.3T1 r1 = r9.A00(r3, r7, r1)
            r1.A0o(r5)
            boolean r13 = r0.A0I(r1, r4)
            goto L_0x013d
        L_0x016d:
            r2 = 36
            int r1 = r15.A1I
            if (r2 != r1) goto L_0x0192
            X.11F r1 = r3.A00
            boolean r1 = r1 instanceof com.whatsapp.jid.UserJid
            if (r1 == 0) goto L_0x018d
            X.2bH r9 = (X.AnonymousClass2bH) r9
            X.3Qa r5 = r9.A1J
            long r1 = r9.A0I
            int r3 = r9.A00
            X.8n7 r7 = new X.8n7
            r7.<init>(r5, r1)
            r7.A00 = r3
            boolean r13 = r0.A0I(r7, r4)
            goto L_0x013e
        L_0x018d:
            boolean r13 = r0.A0H(r15, r4)
            goto L_0x013e
        L_0x0192:
            boolean r13 = r0.A0I(r15, r4)
            goto L_0x013d
        L_0x0197:
            long r1 = r15.A1Q
            r0.A01(r1)
            X.1DQ r0 = r0.A0T
            android.os.Handler r1 = r0.A00
            r0 = 3
            android.os.Message r0 = android.os.Message.obtain(r1, r0, r15)
            goto L_0x00f1
        L_0x01a7:
            if (r11 == 0) goto L_0x00f4
            boolean r1 = r4.A03
            if (r1 != 0) goto L_0x01e7
            X.3Ox r1 = X.C64653Ox.A05
            if (r4 != r1) goto L_0x01b8
            X.1DL r0 = r0.A1h
            r0.A08(r15)
            goto L_0x00f4
        L_0x01b8:
            boolean r1 = r15 instanceof X.AnonymousClass2c4
            if (r1 != 0) goto L_0x01d1
            X.1DT r2 = r0.A08
            r1 = 9
            r2.A0M(r15, r1)
            X.1DL r1 = r0.A1h
            r4 = 552(0x228, float:7.74E-43)
            r1.A0A(r15, r4)
            long r1 = r15.A0I
            r0.A0r(r3, r4, r1)
            goto L_0x00f4
        L_0x01d1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "CoreMessageStore/Error inserting drop placeholder for "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x00f4
        L_0x01e7:
            X.1DT r2 = r0.A08
            r1 = 11
            r2.A0M(r15, r1)
            X.1DL r1 = r0.A1h
            r0 = 419(0x1a3, float:5.87E-43)
            r1.A0A(r15, r0)
            goto L_0x00f4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20310xM.A0R(X.3T1, int):X.34U");
    }

    public void A0Y(C202319lY r5) {
        C18740tg.A00();
        C175708av r0 = r5.A0A;
        C18740tg.A06(r0);
        AnonymousClass1FF r1 = this.A0d;
        C207259uo r02 = r0.A02;
        C18740tg.A06(r02);
        AnonymousClass2bZ A012 = r1.A01(r02.A02);
        if (A012 != null) {
            C207219uk r03 = A012.A00;
            C18740tg.A06(r03);
            C18740tg.A06(r03);
            C207199ui r2 = r03.A01;
            if (r2 == null) {
                Log.e("CoreMessageStore/updateCheckoutMessageWithTransactionInfo -> checkoutInfoContent is null PAY");
            } else if (TextUtils.isEmpty(r2.A06) || !r2.A06.equals(r5.A0K) || r2.A00 != r5.A02) {
                r2.A06 = r5.A0K;
                r2.A00 = r5.A02;
                this.A1T.A0D(A012, A012.A1N);
            }
        }
    }

    public void A0j(AnonymousClass3T1 r19) {
        AnonymousClass1M0 A052;
        long uptimeMillis = SystemClock.uptimeMillis();
        AnonymousClass3T1 r6 = r19;
        r6.A0o(1);
        AnonymousClass1M0 A053 = this.A0c.A05();
        try {
            C1495671s B1k = A053.B1k();
            try {
                AnonymousClass178 r3 = this.A0U;
                long j = r6.A1N;
                int i = r6.A08;
                A052 = r3.A03.A05();
                ContentValues contentValues = new ContentValues();
                contentValues.put("message_add_on_flags", Integer.valueOf(i));
                if (A052.A02.A01(contentValues, "message", "_id = ?", "UPDATE_MESSAGE_ADD_ON_FLAGS_MAIN_SQL", new String[]{String.valueOf(j)}) == 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("MainMessageStore/updateMessageAddOnFlagsByRowIdV2/update failed; message.rowId=");
                    sb.append(j);
                    Log.e(sb.toString());
                }
                A052.close();
                B1k.A00();
                A053.B5o(new C35701j7(this, r6, 1));
                B1k.close();
                A053.close();
                this.A0M.A01("CoreMessageStore/updateMessageForMessageAddOnOnCurrentThread", SystemClock.uptimeMillis() - uptimeMillis);
                return;
            } catch (Throwable th) {
                B1k.close();
                throw th;
            }
            throw th;
        } catch (Throwable th2) {
            try {
                A053.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public void A0l(AnonymousClass3T1 r6) {
        AnonymousClass3T1 A0S2 = r6.A0S();
        boolean z = true;
        boolean z2 = false;
        if (A0S2 != null) {
            z2 = true;
        }
        C18740tg.A0C(z2);
        int A0H2 = A0S2.A0H();
        if (A0H2 != 2) {
            z = false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("coremessagestore/updatemessagequote/quoted message type: ");
        sb.append(A0H2);
        C18740tg.A0F(z, sb.toString());
        this.A0F.A01(new C35701j7(this, r6, 2), 21);
    }

    public void A0q(C64933Qa r13, int i) {
        long uptimeMillis = SystemClock.uptimeMillis();
        AnonymousClass178 r3 = this.A0U;
        AnonymousClass1M0 A052 = r3.A03.A05();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("status", Integer.valueOf(i));
            if (A052.A02.A01(contentValues, "message", "chat_row_id = ? AND from_me = ? AND key_id = ?", "UPDATE_MESSAGE_STATUS_MAIN_SQL", AnonymousClass178.A04(r3, r13)) != 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("MainMessageStore/updateMessageStatus/update/failed ");
                sb.append(r13.A01);
                sb.append(" ");
                sb.append(r13.A00);
                Log.e(sb.toString());
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("MainMessageStore/updateMessageStatus/update/success ");
                sb2.append(r13);
                sb2.append(" ");
                sb2.append(i);
                Log.i(sb2.toString());
            }
            A052.close();
            this.A0M.A01("CoreMessageStore/updateMessageStatusTimestamp", SystemClock.uptimeMillis() - uptimeMillis);
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public void A0w(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass3T1 r4 = (AnonymousClass3T1) it.next();
            if (r4 instanceof AnonymousClass2bU) {
                AnonymousClass2bU r42 = (AnonymousClass2bU) r4;
                C18740tg.A00();
                if (r42.A01 != null) {
                    AnonymousClass1DG r3 = this.A0V;
                    r3.A03(r42, true, false);
                    C65013Qj r2 = r42.A01;
                    if (!(r2 == null || r2.A0I == null)) {
                        r2.A0C = 0;
                        r2.A0I = null;
                        r2.A0J = null;
                        r2.A0a = null;
                        r3.A02(r42);
                    }
                }
            } else if (r4 instanceof AnonymousClass2bV) {
                r4.A16("");
            }
        }
    }

    public C20310xM(C19460v5 r3, C19460v5 r4, C19460v5 r5, C19460v5 r6, C19700wN r7, C20690y0 r8, AnonymousClass17Y r9, C19730wQ r10, AnonymousClass1DT r11, C24041Av r12, AnonymousClass1FG r13, AnonymousClass16D r14, AnonymousClass1DM r15, AnonymousClass185 r16, AnonymousClass1G5 r17, AnonymousClass1DH r18, C21060yb r19, C19970wo r20, C19420v0 r21, AnonymousClass1G7 r22, AnonymousClass1C7 r23, AnonymousClass1A3 r24, C24901Ef r25, AnonymousClass1DP r26, AnonymousClass1ER r27, AnonymousClass163 r28, C220412q r29, C25051Eu r30, C25201Fj r31, C24381Cf r32, AnonymousClass165 r33, AnonymousClass12g r34, AnonymousClass1FD r35, C25231Fm r36, AnonymousClass17S r37, C25221Fl r38, AnonymousClass1FI r39, C20650xu r40, AnonymousClass17X r41, AnonymousClass1DQ r42, AnonymousClass1F3 r43, C219712j r44, AnonymousClass178 r45, AnonymousClass1DG r46, AnonymousClass176 r47, AnonymousClass1FZ r48, C24561Cx r49, AnonymousClass1FE r50, C25151Fe r51, AnonymousClass16J r52, AnonymousClass12T r53, C220612s r54, AnonymousClass12P r55, AnonymousClass1FF r56, C25131Fc r57, C25241Fn r58, AnonymousClass1FS r59, C24911Eg r60, C219612i r61, C20340xP r62, AnonymousClass1FN r63, AnonymousClass17T r64, AnonymousClass17W r65, AnonymousClass1FT r66, AnonymousClass17U r67, AnonymousClass1C8 r68, C24941Ej r69, C25281Fr r70, AnonymousClass16F r71, AnonymousClass16E r72, AnonymousClass17A r73, AnonymousClass1F1 r74, C24921Eh r75, AnonymousClass1EH r76, AnonymousClass12O r77, AnonymousClass1FV r78, C236419g r79, C24951Ek r80, AnonymousClass16S r81, C235518x r82, AnonymousClass184 r83, AnonymousClass1FY r84, C25211Fk r85, C24931Ei r86, C20810yC r87, C20500xf r88, C21010yW r89, AnonymousClass17E r90, AnonymousClass1CF r91, AnonymousClass1FU r92, AnonymousClass19I r93, C236919l r94, AnonymousClass1C5 r95, AnonymousClass1DL r96, AnonymousClass19L r97, C25291Fs r98, AnonymousClass1FQ r99, AnonymousClass1EU r100, C24551Cw r101, AnonymousClass1FO r102, C238019x r103, AnonymousClass1A1 r104, AnonymousClass1C6 r105, C19770wU r106, AnonymousClass1GA r107, C24961El r108, AnonymousClass005 r109, AnonymousClass005 r110, AnonymousClass005 r111) {
        ConditionVariable conditionVariable = C18740tg.A00;
        this.A0C = r20;
        this.A11 = r87;
        this.A06 = r9;
        this.A1U = r44;
        this.A0H = r28;
        this.A04 = r7;
        this.A07 = r10;
        this.A1a = r68;
        this.A1C = r106;
        this.A0I = r29;
        this.A05 = r8;
        this.A0j = r64;
        this.A13 = r89;
        this.A0l = r67;
        this.A1M = r18;
        this.A1l = r105;
        this.A0o = r72;
        this.A12 = r88;
        this.A0w = r81;
        this.A1h = r96;
        this.A0G = r26;
        this.A1F = r109;
        this.A0A = r14;
        this.A0L = r33;
        this.A0T = r42;
        this.A08 = r11;
        this.A1N = r19;
        this.A1Q = r27;
        this.A0R = r40;
        this.A19 = r100;
        this.A1P = r25;
        this.A1B = r104;
        this.A16 = r93;
        this.A0t = r77;
        this.A0U = r45;
        this.A0Z = r52;
        this.A0g = r60;
        this.A1g = r95;
        this.A0r = r75;
        this.A1m = r110;
        this.A1G = r111;
        this.A10 = r86;
        this.A1f = r94;
        this.A1Y = r61;
        this.A1b = r69;
        this.A1c = r80;
        this.A1E = r108;
        this.A0F = r23;
        this.A1O = r24;
        this.A1R = r30;
        this.A0a = r53;
        this.A0h = r62;
        this.A0p = r73;
        this.A1j = r101;
        this.A0M = r34;
        this.A0N = r35;
        this.A1i = r97;
        AnonymousClass176 r1 = r47;
        this.A0W = r1;
        this.A0Y = r49;
        this.A1V = r50;
        this.A1K = r15;
        this.A0D = r21;
        this.A1J = r13;
        this.A0c = r55;
        this.A0d = r56;
        this.A0B = r16;
        this.A0Q = r39;
        this.A0i = r63;
        this.A1Z = r65;
        this.A1A = r103;
        this.A0q = r74;
        this.A0K = r32;
        this.A0O = r37;
        this.A1k = r102;
        this.A0V = r46;
        this.A18 = r99;
        this.A0f = r59;
        this.A0k = r66;
        this.A0s = r76;
        this.A15 = r92;
        this.A0n = r71;
        this.A0v = r79;
        this.A0u = r78;
        this.A1T = r43;
        this.A0E = r22;
        this.A0y = r84;
        this.A0S = r41;
        this.A14 = r90;
        this.A0X = r48;
        this.A1X = r57;
        this.A1W = r51;
        this.A0J = r31;
        this.A09 = r12;
        this.A0z = r85;
        this.A0P = r38;
        this.A1d = r83;
        this.A0b = r54;
        this.A0e = r58;
        this.A0m = r70;
        this.A01 = r3;
        this.A02 = r4;
        this.A0x = r82;
        this.A17 = r98;
        this.A1L = r17;
        this.A1D = r107;
        this.A1S = r36;
        this.A1H = r1.A02;
        this.A1e = r91;
        this.A1I = r5;
        this.A03 = r6;
    }
}
