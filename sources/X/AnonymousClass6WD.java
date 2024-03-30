package X;

import android.database.sqlite.SQLiteConstraintException;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6WD  reason: invalid class name */
public class AnonymousClass6WD {
    public final C19460v5 A00;
    public final AnonymousClass17Y A01;
    public final C19730wQ A02;
    public final C25731Hl A03;
    public final C25751Hn A04;
    public final AnonymousClass16D A05;
    public final AnonymousClass1DM A06;
    public final C19970wo A07;
    public final AnonymousClass189 A08;
    public final AnonymousClass187 A09;
    public final AnonymousClass1HK A0A;
    public final C220712t A0B;
    public final AnonymousClass163 A0C;
    public final C220412q A0D;
    public final AnonymousClass17X A0E;
    public final AnonymousClass1DQ A0F;
    public final C219612i A0G;
    public final AnonymousClass16E A0H;
    public final C230416y A0I;
    public final AnonymousClass12O A0J;
    public final AnonymousClass1FV A0K;
    public final C30601aT A0L;
    public final C20810yC A0M;
    public final C30661aZ A0N;
    public final C29961Yr A0O;
    public final C19770wU A0P;
    public final AnonymousClass1HP A0Q;
    public final C29911Yl A0R;
    public final C25911Id A0S;
    public final AnonymousClass17S A0T;
    public final C26171Jd A0U;
    public final AnonymousClass1A1 A0V;

    private boolean A02(AnonymousClass8SU r10, AnonymousClass3T1 r11) {
        try {
            if (r11.A1T(EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING)) {
                this.A0R.Blm(r10, r11);
            }
            r11.A0j(65536);
            C219612i r7 = this.A0G;
            long A002 = r7.A00("next_sort_id_for_companion_history_sync", -2);
            r11.A1O = A002;
            long j = A002 - 1;
            C18740tg.A0E(C36431kI.A1P((j > r7.A00("next_sort_id_for_companion_history_sync", -2) ? 1 : (j == r7.A00("next_sort_id_for_companion_history_sync", -2) ? 0 : -1))), "The next sort_id for a historical message should be negative and smaller than our last used sort_id.");
            r7.A03("next_sort_id_for_companion_history_sync", j);
            if (r11.A1G()) {
                this.A0T.A04(r11, r11.A0I);
            }
            this.A0V.A04(r11);
            this.A0U.A0J(r11);
            return true;
        } catch (SQLiteConstraintException unused) {
            Log.w("HistorySyncChunkProcessor/ tried to insert duplicate message");
            return false;
        } catch (Exception e) {
            Log.e("HistorySyncChunkProcessor/ could not insert message into db", e);
            return false;
        }
    }

    public static void A01(AnonymousClass36I r8, AnonymousClass6WD r9, C130576Lp r10, File file) {
        try {
            C122435uq r2 = new C122435uq();
            r2.A03 = file.length();
            r2.A02 = r10.A03;
            r2.A01 = C19970wo.A00(r9.A07);
            AnonymousClass36I r1 = r8;
            A00(r1, r2, r9, file, AnonymousClass6YY.A0W(file), r10.A01, r10.A00);
        } catch (IOException unused) {
            Log.e("HistorySyncChunkProcessor/ unable to read file data");
        }
    }

    public AnonymousClass6WD(C19460v5 r2, AnonymousClass17Y r3, C19730wQ r4, C25731Hl r5, C25751Hn r6, C29911Yl r7, C25911Id r8, AnonymousClass16D r9, AnonymousClass1DM r10, C19970wo r11, AnonymousClass189 r12, AnonymousClass187 r13, AnonymousClass1HK r14, C220712t r15, AnonymousClass163 r16, C220412q r17, AnonymousClass17S r18, AnonymousClass17X r19, AnonymousClass1DQ r20, C219612i r21, AnonymousClass16E r22, C230416y r23, AnonymousClass12O r24, AnonymousClass1FV r25, C26171Jd r26, C30601aT r27, C20810yC r28, C30661aZ r29, C29961Yr r30, AnonymousClass1A1 r31, C19770wU r32, AnonymousClass1HP r33) {
        this.A07 = r11;
        this.A0M = r28;
        this.A01 = r3;
        this.A0C = r16;
        this.A0P = r32;
        this.A02 = r4;
        this.A0D = r17;
        this.A0H = r22;
        this.A0B = r15;
        this.A0A = r14;
        this.A0F = r20;
        this.A09 = r13;
        this.A05 = r9;
        this.A0Q = r33;
        this.A0V = r31;
        this.A0J = r24;
        this.A0G = r21;
        this.A08 = r12;
        this.A00 = r2;
        this.A0U = r26;
        this.A0O = r30;
        this.A06 = r10;
        this.A0N = r29;
        this.A0T = r18;
        this.A0K = r25;
        this.A0R = r7;
        this.A0S = r8;
        this.A0E = r19;
        this.A03 = r5;
        this.A0L = r27;
        this.A04 = r6;
        this.A0I = r23;
    }

    public ArrayList A03(List list) {
        AnonymousClass3T1 r3;
        boolean z;
        ArrayList A0I2 = AnonymousClass001.A0I();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass8SU r4 = ((C172848Pk) it.next()).message_;
            if (r4 == null) {
                r4 = AnonymousClass8SU.DEFAULT_INSTANCE;
            }
            try {
                r3 = this.A0N.A02(new C1275768v(AnonymousClass5SH.FOR_COMPANION_SYNC), r4);
            } catch (Exception e) {
                Log.e("HistorySyncChunkProcessor/ failed to parse wmi of history sync message", e);
                r3 = null;
            }
            if (r3 == null) {
                z = false;
            } else {
                z = true;
                if (r3.A0L == C52152oy.USERNAME) {
                    z = !this.A0M.A0E(6595);
                }
            }
            if (z && A02(r4, r3)) {
                A0I2.add(r3);
            }
        }
        return A0I2;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    public static void A00(X.AnonymousClass36I r41, X.C122435uq r42, X.AnonymousClass6WD r43, java.io.File r44, byte[] r45, int r46, int r47) {
        /*
            X.4uP r0 = X.C100064uP.DEFAULT_INSTANCE     // Catch:{ IOException -> 0x0923 }
            r1 = r45
            X.8Hz r5 = X.C170918Hz.A08(r0, r1)     // Catch:{ IOException -> 0x0923 }
            X.4uP r5 = (X.C100064uP) r5     // Catch:{ IOException -> 0x0923 }
            int r0 = r5.progress_     // Catch:{ IOException -> 0x0923 }
            r14 = r42
            r14.A00 = r0     // Catch:{ IOException -> 0x0923 }
            X.B6c r1 = r5.phoneNumberToLidMappings_     // Catch:{ IOException -> 0x0923 }
            r4 = r43
            if (r1 == 0) goto L_0x004d
            boolean r0 = r1.isEmpty()     // Catch:{ IOException -> 0x0923 }
            if (r0 != 0) goto L_0x004d
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()     // Catch:{ IOException -> 0x0923 }
            java.util.Iterator r6 = r1.iterator()     // Catch:{ IOException -> 0x0923 }
        L_0x0024:
            boolean r0 = r6.hasNext()     // Catch:{ IOException -> 0x0923 }
            if (r0 == 0) goto L_0x0048
            java.lang.Object r3 = r6.next()     // Catch:{ IOException -> 0x0923 }
            X.4u4 r3 = (X.C99854u4) r3     // Catch:{ IOException -> 0x0923 }
            java.lang.String r1 = r3.lidJid_     // Catch:{ IOException -> 0x0923 }
            X.6Nb r0 = X.C223313w.A01     // Catch:{ IOException -> 0x0923 }
            X.13w r2 = r0.A02(r1)     // Catch:{ IOException -> 0x0923 }
            java.lang.String r1 = r3.pnJid_     // Catch:{ IOException -> 0x0923 }
            X.13s r0 = com.whatsapp.jid.PhoneUserJid.Companion     // Catch:{ IOException -> 0x0923 }
            com.whatsapp.jid.PhoneUserJid r0 = r0.A02(r1)     // Catch:{ IOException -> 0x0923 }
            if (r2 == 0) goto L_0x0024
            if (r0 == 0) goto L_0x0024
            X.C36341k9.A1H(r2, r0, r7)     // Catch:{ IOException -> 0x0923 }
            goto L_0x0024
        L_0x0048:
            X.12O r0 = r4.A0J     // Catch:{ IOException -> 0x0923 }
            r0.A0C(r7)     // Catch:{ IOException -> 0x0923 }
        L_0x004d:
            X.1Id r7 = r4.A0S     // Catch:{ IOException -> 0x0923 }
            int r0 = r14.A00     // Catch:{ IOException -> 0x0923 }
            long r10 = (long) r0     // Catch:{ IOException -> 0x0923 }
            long r8 = r14.A03     // Catch:{ IOException -> 0x0923 }
            long r2 = r14.A02     // Catch:{ IOException -> 0x0923 }
            long r0 = r14.A01     // Catch:{ IOException -> 0x0923 }
            r16 = 0
            X.2SR r6 = new X.2SR     // Catch:{ IOException -> 0x0923 }
            r6.<init>()     // Catch:{ IOException -> 0x0923 }
            java.lang.Integer r12 = X.C36361kB.A0i()     // Catch:{ IOException -> 0x0923 }
            r6.A02 = r12     // Catch:{ IOException -> 0x0923 }
            java.lang.String r12 = X.C25911Id.A00(r7)     // Catch:{ IOException -> 0x0923 }
            r6.A0A = r12     // Catch:{ IOException -> 0x0923 }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ IOException -> 0x0923 }
            r6.A04 = r10     // Catch:{ IOException -> 0x0923 }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ IOException -> 0x0923 }
            r6.A05 = r8     // Catch:{ IOException -> 0x0923 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ IOException -> 0x0923 }
            r6.A09 = r0     // Catch:{ IOException -> 0x0923 }
            long r0 = r0.longValue()     // Catch:{ IOException -> 0x0923 }
            java.lang.Long r0 = X.C90504aG.A0h(r0, r2)     // Catch:{ IOException -> 0x0923 }
            r6.A06 = r0     // Catch:{ IOException -> 0x0923 }
            java.lang.Integer r0 = X.AnonymousClass1AB.A01(r46)     // Catch:{ IOException -> 0x0923 }
            r6.A00 = r0     // Catch:{ IOException -> 0x0923 }
            java.lang.Integer r0 = X.AnonymousClass1AB.A00(r46)     // Catch:{ IOException -> 0x0923 }
            r6.A01 = r0     // Catch:{ IOException -> 0x0923 }
            X.0wx r1 = r7.A02     // Catch:{ IOException -> 0x0923 }
            long r2 = r1.A04()     // Catch:{ IOException -> 0x0923 }
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ IOException -> 0x0923 }
            r6.A07 = r0     // Catch:{ IOException -> 0x0923 }
            long r0 = r1.A02()     // Catch:{ IOException -> 0x0923 }
            java.lang.Long r0 = X.C90504aG.A0h(r2, r0)     // Catch:{ IOException -> 0x0923 }
            r6.A08 = r0     // Catch:{ IOException -> 0x0923 }
            java.lang.Long r0 = X.C36441kJ.A0y(r47)     // Catch:{ IOException -> 0x0923 }
            r6.A03 = r0     // Catch:{ IOException -> 0x0923 }
            X.0yW r0 = r7.A03     // Catch:{ IOException -> 0x0923 }
            r0.Bly(r6)     // Catch:{ IOException -> 0x0923 }
            int r0 = r5.syncType_     // Catch:{ IOException -> 0x0923 }
            X.5UH r0 = X.AnonymousClass5UH.A00(r0)     // Catch:{ IOException -> 0x0923 }
            if (r0 != 0) goto L_0x00be
            X.5UH r0 = X.AnonymousClass5UH.INITIAL_BOOTSTRAP     // Catch:{ IOException -> 0x0923 }
        L_0x00be:
            int r0 = r0.ordinal()     // Catch:{ IOException -> 0x0923 }
            switch(r0) {
                case 0: goto L_0x0437;
                case 1: goto L_0x0277;
                case 2: goto L_0x00eb;
                case 3: goto L_0x00eb;
                case 4: goto L_0x040f;
                case 5: goto L_0x01de;
                default: goto L_0x00c5;
            }     // Catch:{ IOException -> 0x0923 }
        L_0x00c5:
            java.lang.String r0 = "HistorySyncChunkProcessor/ invalid sync type"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x0923 }
        L_0x00ca:
            r0 = r41
            com.whatsapp.companiondevice.sync.HistorySyncCompanionWorker r9 = r0.A01     // Catch:{ IOException -> 0x0923 }
            X.1aS r8 = r9.A01     // Catch:{ IOException -> 0x0923 }
            X.6Lp r7 = r0.A02     // Catch:{ IOException -> 0x0923 }
            long r2 = r0.A00     // Catch:{ IOException -> 0x0923 }
            java.lang.String r6 = r7.A08     // Catch:{ IOException -> 0x0923 }
            X.0wQ r0 = r8.A00     // Catch:{ IOException -> 0x0923 }
            com.whatsapp.jid.PhoneUserJid r1 = X.C36441kJ.A0n(r0)     // Catch:{ IOException -> 0x0923 }
            r0 = 1
            X.3Qa r5 = new X.3Qa     // Catch:{ IOException -> 0x0923 }
            r5.<init>(r1, r6, r0)     // Catch:{ IOException -> 0x0923 }
            r0 = 1
            X.5J9 r4 = new X.5J9     // Catch:{ IOException -> 0x0923 }
            r4.<init>(r5, r0)     // Catch:{ IOException -> 0x0923 }
            goto L_0x07d4
        L_0x00eb:
            X.0yC r1 = r4.A0M     // Catch:{ IOException -> 0x0923 }
            r0 = 1706(0x6aa, float:2.39E-42)
            boolean r0 = r1.A0E(r0)     // Catch:{ IOException -> 0x0923 }
            if (r0 == 0) goto L_0x00ca
            X.B6c r0 = r5.conversations_     // Catch:{ IOException -> 0x0923 }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ IOException -> 0x0923 }
        L_0x00fb:
            boolean r0 = r12.hasNext()     // Catch:{ IOException -> 0x0923 }
            if (r0 == 0) goto L_0x01d7
            java.lang.Object r3 = r12.next()     // Catch:{ IOException -> 0x0923 }
            X.4uT r3 = (X.C100104uT) r3     // Catch:{ IOException -> 0x0923 }
            java.lang.String r0 = r3.id_     // Catch:{ IOException -> 0x0923 }
            X.11F r2 = X.C36421kH.A0N(r0)     // Catch:{ IOException -> 0x0923 }
            if (r2 == 0) goto L_0x01cc
            boolean r0 = r2 instanceof X.C177618e5     // Catch:{ IOException -> 0x0923 }
            if (r0 != 0) goto L_0x01cc
            X.12q r1 = r4.A0D     // Catch:{ IOException -> 0x0923 }
            r0 = 0
            X.3Qp r2 = r1.A09(r2, r0)     // Catch:{ IOException -> 0x0923 }
            if (r2 != 0) goto L_0x0122
            java.lang.String r0 = "HistorySyncChunkProcessor/ received chat history from chat not sent in bootstrap"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x0923 }
            goto L_0x00fb
        L_0x0122:
            X.B6c r0 = r3.messages_     // Catch:{ IOException -> 0x0923 }
            java.util.ArrayList r7 = r4.A03(r0)     // Catch:{ IOException -> 0x0923 }
            int r0 = r3.bitField0_     // Catch:{ IOException -> 0x0923 }
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x014e
            int r1 = r3.endOfHistoryTransferType_     // Catch:{ IOException -> 0x0923 }
            if (r1 == 0) goto L_0x013c
            r0 = 1
            if (r1 == r0) goto L_0x0139
            r0 = 2
            if (r1 != r0) goto L_0x013c
            goto L_0x013f
        L_0x0139:
            X.5UB r0 = X.AnonymousClass5UB.COMPLETE_AND_NO_MORE_MESSAGE_REMAIN_ON_PRIMARY     // Catch:{ IOException -> 0x0923 }
            goto L_0x0141
        L_0x013c:
            X.5UB r0 = X.AnonymousClass5UB.COMPLETE_BUT_MORE_MESSAGES_REMAIN_ON_PRIMARY     // Catch:{ IOException -> 0x0923 }
            goto L_0x0141
        L_0x013f:
            X.5UB r0 = X.AnonymousClass5UB.COMPLETE_ON_DEMAND_SYNC_BUT_MORE_MSG_REMAIN_ON_PRIMARY     // Catch:{ IOException -> 0x0923 }
        L_0x0141:
            int r6 = r0.ordinal()     // Catch:{ IOException -> 0x0923 }
            r1 = 2
            r0 = 0
            if (r6 == r0) goto L_0x014b
            if (r6 != r1) goto L_0x014c
        L_0x014b:
            r0 = 2
        L_0x014c:
            r2.A03 = r0     // Catch:{ IOException -> 0x0923 }
        L_0x014e:
            X.163 r8 = r4.A0C     // Catch:{ IOException -> 0x0923 }
            monitor-enter(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0175, Error | RuntimeException -> 0x08fe }
            android.content.ContentValues r6 = X.C36441kJ.A0E()     // Catch:{ all -> 0x0172 }
            java.lang.String r1 = "history_sync_progress"
            int r0 = r2.A03     // Catch:{ all -> 0x0172 }
            X.C36341k9.A0o(r6, r1, r0)     // Catch:{ all -> 0x0172 }
            monitor-exit(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0175, Error | RuntimeException -> 0x08fe }
            int r0 = r8.A05(r6, r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0175, Error | RuntimeException -> 0x08fe }
            if (r0 != 0) goto L_0x017e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0175, Error | RuntimeException -> 0x08fe }
            java.lang.String r0 = "msgstore/historysyncprogress/did not update "
            r1.append(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0175, Error | RuntimeException -> 0x08fe }
            X.11F r0 = r2.A0q     // Catch:{ SQLiteDatabaseCorruptException -> 0x0175, Error | RuntimeException -> 0x08fe }
            X.C36331k8.A1P(r0, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0175, Error | RuntimeException -> 0x08fe }
            goto L_0x017e
        L_0x0172:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0175, Error | RuntimeException -> 0x08fe }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0175, Error | RuntimeException -> 0x08fe }
        L_0x0175:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ IOException -> 0x0923 }
            X.12s r0 = r8.A03     // Catch:{ IOException -> 0x0923 }
            r0.A03()     // Catch:{ IOException -> 0x0923 }
        L_0x017e:
            int r0 = r7.size()     // Catch:{ IOException -> 0x0923 }
            if (r0 <= 0) goto L_0x01c2
            monitor-enter(r2)     // Catch:{ IOException -> 0x0923 }
            long r0 = r2.A0U     // Catch:{ all -> 0x0903 }
            monitor-exit(r2)     // Catch:{ IOException -> 0x0923 }
            r10 = 1
            r6 = 0
            int r9 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x01b0
            r1 = 0
        L_0x0190:
            int r0 = r7.size()     // Catch:{ IOException -> 0x0923 }
            if (r1 >= r0) goto L_0x01b0
            java.lang.Object r9 = r7.get(r1)     // Catch:{ IOException -> 0x0923 }
            X.3T1 r9 = (X.AnonymousClass3T1) r9     // Catch:{ IOException -> 0x0923 }
            r0 = 1
            boolean r0 = X.C66013Ui.A0w(r9, r0)     // Catch:{ IOException -> 0x0923 }
            if (r0 == 0) goto L_0x01c9
            long r0 = r9.A1O     // Catch:{ IOException -> 0x0923 }
            r2.A0E(r0)     // Catch:{ IOException -> 0x0923 }
            long r0 = r9.A1N     // Catch:{ IOException -> 0x0923 }
            r2.A0D(r0)     // Catch:{ IOException -> 0x0923 }
            r8.A06(r2)     // Catch:{ IOException -> 0x0923 }
        L_0x01b0:
            X.1DQ r0 = r4.A0F     // Catch:{ IOException -> 0x0923 }
            android.os.Handler r8 = r0.A00     // Catch:{ IOException -> 0x0923 }
            r2 = 5
            r1 = 29
            java.lang.Object r0 = r7.get(r6)     // Catch:{ IOException -> 0x0923 }
            android.os.Message r0 = android.os.Message.obtain(r8, r2, r1, r6, r0)     // Catch:{ IOException -> 0x0923 }
            r0.sendToTarget()     // Catch:{ IOException -> 0x0923 }
        L_0x01c2:
            X.B6c r0 = r3.messages_     // Catch:{ IOException -> 0x0923 }
            r0.size()     // Catch:{ IOException -> 0x0923 }
            goto L_0x00fb
        L_0x01c9:
            int r1 = r1 + 1
            goto L_0x0190
        L_0x01cc:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0923 }
            java.lang.String r0 = "HistorySyncChunkProcessor/ skip importing of chatJid="
            X.C36321k7.A1L(r2, r0, r1)     // Catch:{ IOException -> 0x0923 }
            goto L_0x00fb
        L_0x01d7:
            X.B6c r0 = r5.conversations_     // Catch:{ IOException -> 0x0923 }
            r0.size()     // Catch:{ IOException -> 0x0923 }
            goto L_0x00ca
        L_0x01de:
            X.0yC r1 = r4.A0M     // Catch:{ IOException -> 0x0923 }
            r0 = 6103(0x17d7, float:8.552E-42)
            boolean r0 = r1.A0E(r0)     // Catch:{ IOException -> 0x0923 }
            if (r0 == 0) goto L_0x00ca
            java.lang.String r0 = "HistorySyncChunkProcessor/addNonBlockingData"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0923 }
            X.B6c r0 = r5.callLogRecords_     // Catch:{ IOException -> 0x0923 }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ IOException -> 0x0923 }
        L_0x01f3:
            boolean r0 = r11.hasNext()     // Catch:{ IOException -> 0x0923 }
            if (r0 == 0) goto L_0x0264
            java.lang.Object r1 = r11.next()     // Catch:{ IOException -> 0x0923 }
            X.4uQ r1 = (X.C100074uQ) r1     // Catch:{ IOException -> 0x0923 }
            X.6W3 r0 = X.AnonymousClass6W3.A00     // Catch:{ IOException -> 0x0923 }
            X.5Nh r5 = r0.A04(r1)     // Catch:{ IOException -> 0x0923 }
            if (r5 == 0) goto L_0x01f3
            X.1HK r6 = r4.A0A     // Catch:{ IOException -> 0x0923 }
            X.3Ir r2 = r5.A0C     // Catch:{ IOException -> 0x0923 }
            if (r2 == 0) goto L_0x0225
            X.1HM r1 = r6.A00     // Catch:{ IOException -> 0x0923 }
            java.lang.String r7 = r2.A02     // Catch:{ IOException -> 0x0923 }
            X.3Ir r0 = r1.A02(r7)     // Catch:{ IOException -> 0x0923 }
            if (r0 != 0) goto L_0x0225
            com.whatsapp.jid.UserJid r3 = r2.A01     // Catch:{ IOException -> 0x0923 }
            long r0 = r1.A00(r3, r7)     // Catch:{ IOException -> 0x0923 }
            X.3Ir r2 = new X.3Ir     // Catch:{ IOException -> 0x0923 }
            r2.<init>(r3, r7, r0)     // Catch:{ IOException -> 0x0923 }
            r5.A0I(r2)     // Catch:{ IOException -> 0x0923 }
        L_0x0225:
            X.12P r0 = r6.A04     // Catch:{ IOException -> 0x0923 }
            X.1M0 r3 = r0.A05()     // Catch:{ IOException -> 0x0923 }
            X.71s r10 = r3.B1k()     // Catch:{ all -> 0x0913 }
            monitor-enter(r5)     // Catch:{ all -> 0x0909 }
            r5.A05()     // Catch:{ all -> 0x0906 }
            int r9 = r5.A01     // Catch:{ all -> 0x0906 }
            monitor-exit(r5)     // Catch:{ all -> 0x0909 }
            X.6by r0 = r5.A04     // Catch:{ all -> 0x0909 }
            android.content.ContentValues r8 = X.AnonymousClass1HK.A00(r6, r0, r5)     // Catch:{ all -> 0x0909 }
            X.14e r7 = r3.A02     // Catch:{ all -> 0x0909 }
            java.lang.String r2 = "call_log"
            r1 = 5
            java.lang.String r0 = "insertCallLog/INSERT_CALL_LOG"
            long r0 = r7.A08(r2, r0, r8, r1)     // Catch:{ all -> 0x0909 }
            r5.A04(r0)     // Catch:{ all -> 0x0909 }
            monitor-enter(r5)     // Catch:{ all -> 0x0909 }
            r1 = 0
            int r0 = r5.A01     // Catch:{ all -> 0x0906 }
            if (r9 != r0) goto L_0x0256
            r5.A02 = r1     // Catch:{ all -> 0x0906 }
            int r0 = r0 + 1
            r5.A01 = r0     // Catch:{ all -> 0x0906 }
        L_0x0256:
            monitor-exit(r5)     // Catch:{ all -> 0x0909 }
            X.AnonymousClass1HK.A02(r6, r5)     // Catch:{ all -> 0x0909 }
            r10.A00()     // Catch:{ all -> 0x0909 }
            r10.close()     // Catch:{ all -> 0x0913 }
            r3.close()     // Catch:{ IOException -> 0x0923 }
            goto L_0x01f3
        L_0x0264:
            X.17Y r3 = r4.A01     // Catch:{ IOException -> 0x0923 }
            X.1HP r2 = r4.A0Q     // Catch:{ IOException -> 0x0923 }
            java.util.Objects.requireNonNull(r2)     // Catch:{ IOException -> 0x0923 }
            r1 = 12
            X.3v2 r0 = new X.3v2     // Catch:{ IOException -> 0x0923 }
            r0.<init>(r2, r1)     // Catch:{ IOException -> 0x0923 }
            r3.A0H(r0)     // Catch:{ IOException -> 0x0923 }
            goto L_0x00ca
        L_0x0277:
            X.B6c r8 = r5.statusV3Messages_     // Catch:{ IOException -> 0x0923 }
            java.util.HashMap r7 = X.AnonymousClass001.A0J()     // Catch:{ IOException -> 0x0923 }
            java.util.HashMap r6 = X.AnonymousClass001.A0J()     // Catch:{ IOException -> 0x0923 }
            java.util.HashMap r12 = X.AnonymousClass001.A0J()     // Catch:{ IOException -> 0x0923 }
            java.util.HashMap r5 = X.AnonymousClass001.A0J()     // Catch:{ IOException -> 0x0923 }
            java.util.HashMap r10 = X.AnonymousClass001.A0J()     // Catch:{ IOException -> 0x0923 }
            r3 = 0
            java.lang.Integer r22 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x0923 }
            r2 = 0
        L_0x0293:
            int r0 = r8.size()     // Catch:{ IOException -> 0x0923 }
            if (r2 >= r0) goto L_0x0342
            java.lang.Object r11 = r8.get(r2)     // Catch:{ IOException -> 0x0923 }
            X.8SU r11 = (X.AnonymousClass8SU) r11     // Catch:{ IOException -> 0x0923 }
            X.5SH r0 = X.AnonymousClass5SH.FOR_COMPANION_SYNC     // Catch:{ Exception -> 0x0338 }
            X.68v r1 = new X.68v     // Catch:{ Exception -> 0x0338 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0338 }
            X.1aZ r0 = r4.A0N     // Catch:{ Exception -> 0x0338 }
            X.3T1 r9 = r0.A02(r1, r11)     // Catch:{ Exception -> 0x0338 }
            boolean r0 = r4.A02(r11, r9)     // Catch:{ IOException -> 0x0923 }
            if (r0 == 0) goto L_0x033e
            com.whatsapp.jid.UserJid r1 = r9.A0L()     // Catch:{ IOException -> 0x0923 }
            if (r1 != 0) goto L_0x02c3
            X.3Qa r0 = r9.A1J     // Catch:{ IOException -> 0x0923 }
            boolean r0 = r0.A02     // Catch:{ IOException -> 0x0923 }
            if (r0 == 0) goto L_0x02c3
            X.13z r1 = X.C223613z.A00     // Catch:{ IOException -> 0x0923 }
            X.C18740tg.A06(r1)     // Catch:{ IOException -> 0x0923 }
        L_0x02c3:
            java.lang.Object r0 = r7.get(r1)     // Catch:{ IOException -> 0x0923 }
            if (r0 != 0) goto L_0x02cc
            r7.put(r1, r9)     // Catch:{ IOException -> 0x0923 }
        L_0x02cc:
            java.lang.Object r0 = r6.get(r1)     // Catch:{ IOException -> 0x0923 }
            if (r0 != 0) goto L_0x02e5
            X.3Qa r0 = r9.A1J     // Catch:{ IOException -> 0x0923 }
            boolean r0 = r0.A02     // Catch:{ IOException -> 0x0923 }
            if (r0 != 0) goto L_0x02e5
            int r0 = r11.bitField0_     // Catch:{ IOException -> 0x0923 }
            r0 = r0 & 64
            if (r0 == 0) goto L_0x02e5
            boolean r0 = r11.ignore_     // Catch:{ IOException -> 0x0923 }
            if (r0 == 0) goto L_0x02e5
            r6.put(r1, r9)     // Catch:{ IOException -> 0x0923 }
        L_0x02e5:
            X.3Qa r0 = r9.A1J     // Catch:{ IOException -> 0x0923 }
            boolean r0 = r0.A02     // Catch:{ IOException -> 0x0923 }
            if (r0 != 0) goto L_0x0309
            int r0 = r11.bitField0_     // Catch:{ IOException -> 0x0923 }
            r0 = r0 & 64
            if (r0 == 0) goto L_0x02f5
            boolean r0 = r11.ignore_     // Catch:{ IOException -> 0x0923 }
            if (r0 != 0) goto L_0x0309
        L_0x02f5:
            r12.put(r1, r9)     // Catch:{ IOException -> 0x0923 }
            java.lang.Number r0 = X.C36441kJ.A10(r1, r5)     // Catch:{ IOException -> 0x0923 }
            if (r0 != 0) goto L_0x0300
            r0 = r22
        L_0x0300:
            int r0 = r0.intValue()     // Catch:{ IOException -> 0x0923 }
            int r0 = r0 + 1
            X.C36341k9.A1K(r1, r5, r0)     // Catch:{ IOException -> 0x0923 }
        L_0x0309:
            java.lang.Number r0 = X.C36441kJ.A10(r1, r10)     // Catch:{ IOException -> 0x0923 }
            if (r0 != 0) goto L_0x0311
            r0 = r22
        L_0x0311:
            int r0 = r0.intValue()     // Catch:{ IOException -> 0x0923 }
            int r0 = r0 + 1
            X.C36341k9.A1K(r1, r10, r0)     // Catch:{ IOException -> 0x0923 }
            int r0 = X.C36431kI.A07(r8)     // Catch:{ IOException -> 0x0923 }
            if (r2 != r0) goto L_0x0329
            X.12i r13 = r4.A0G     // Catch:{ IOException -> 0x0923 }
            long r0 = r9.A0I     // Catch:{ IOException -> 0x0923 }
            java.lang.String r11 = "earliest_status_time"
            r13.A03(r11, r0)     // Catch:{ IOException -> 0x0923 }
        L_0x0329:
            X.1DQ r0 = r4.A0F     // Catch:{ IOException -> 0x0923 }
            android.os.Handler r11 = r0.A00     // Catch:{ IOException -> 0x0923 }
            r1 = 5
            r0 = 29
            android.os.Message r0 = android.os.Message.obtain(r11, r1, r0, r3, r9)     // Catch:{ IOException -> 0x0923 }
            r0.sendToTarget()     // Catch:{ IOException -> 0x0923 }
            goto L_0x033e
        L_0x0338:
            r1 = move-exception
            java.lang.String r0 = "HistorySyncChunkProcessor/ failed to parse wmi of history sync message"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x0923 }
        L_0x033e:
            int r2 = r2 + 1
            goto L_0x0293
        L_0x0342:
            java.util.Iterator r21 = X.C36371kC.A10(r7)     // Catch:{ IOException -> 0x0923 }
        L_0x0346:
            boolean r0 = r21.hasNext()     // Catch:{ IOException -> 0x0923 }
            if (r0 == 0) goto L_0x00ca
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r21)     // Catch:{ IOException -> 0x0923 }
            java.lang.Object r3 = r0.getKey()     // Catch:{ IOException -> 0x0923 }
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3     // Catch:{ IOException -> 0x0923 }
            java.lang.Object r2 = r0.getValue()     // Catch:{ IOException -> 0x0923 }
            X.C18740tg.A06(r2)     // Catch:{ IOException -> 0x0923 }
            X.3T1 r2 = (X.AnonymousClass3T1) r2     // Catch:{ IOException -> 0x0923 }
            java.lang.Object r0 = r6.get(r3)     // Catch:{ IOException -> 0x0923 }
            r17 = -9223372036854775808
            if (r0 != 0) goto L_0x036a
            r19 = -9223372036854775808
            goto L_0x0374
        L_0x036a:
            java.lang.Object r0 = X.C90514aH.A0o(r3, r6)     // Catch:{ IOException -> 0x0923 }
            X.3T1 r0 = (X.AnonymousClass3T1) r0     // Catch:{ IOException -> 0x0923 }
            long r0 = r0.A1O     // Catch:{ IOException -> 0x0923 }
            r19 = r0
        L_0x0374:
            java.lang.Object r0 = r12.get(r3)     // Catch:{ IOException -> 0x0923 }
            if (r0 == 0) goto L_0x0384
            java.lang.Object r0 = X.C90514aH.A0o(r3, r12)     // Catch:{ IOException -> 0x0923 }
            X.3T1 r0 = (X.AnonymousClass3T1) r0     // Catch:{ IOException -> 0x0923 }
            long r0 = r0.A1O     // Catch:{ IOException -> 0x0923 }
            r17 = r0
        L_0x0384:
            java.lang.Object r0 = r5.get(r3)     // Catch:{ IOException -> 0x0923 }
            if (r0 != 0) goto L_0x038d
            r1 = r22
            goto L_0x0393
        L_0x038d:
            java.lang.Object r1 = X.C90514aH.A0o(r3, r5)     // Catch:{ IOException -> 0x0923 }
            java.lang.Number r1 = (java.lang.Number) r1     // Catch:{ IOException -> 0x0923 }
        L_0x0393:
            java.lang.Object r0 = X.C90514aH.A0o(r3, r10)     // Catch:{ IOException -> 0x0923 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ IOException -> 0x0923 }
            X.16E r9 = r4.A0H     // Catch:{ IOException -> 0x0923 }
            int r11 = r1.intValue()     // Catch:{ IOException -> 0x0923 }
            int r27 = r0.intValue()     // Catch:{ IOException -> 0x0923 }
            java.lang.Object r8 = r9.A08     // Catch:{ IOException -> 0x0923 }
            monitor-enter(r8)     // Catch:{ IOException -> 0x0923 }
            X.AnonymousClass16E.A03(r9)     // Catch:{ all -> 0x091d }
            r0 = 4
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x091d }
            r7.<init>(r0)     // Catch:{ all -> 0x091d }
            X.3Sz r13 = r9.A08(r3)     // Catch:{ all -> 0x091d }
            r0 = 2
            if (r13 == 0) goto L_0x03e4
            int r1 = r13.A02()     // Catch:{ all -> 0x091d }
            int r1 = r1 + r27
            r13.A08(r1)     // Catch:{ all -> 0x091d }
            int r1 = r13.A03()     // Catch:{ all -> 0x091d }
            if (r1 > r0) goto L_0x03de
            long r0 = r13.A04()     // Catch:{ all -> 0x091d }
        L_0x03c9:
            r13.A09(r0)     // Catch:{ all -> 0x091d }
        L_0x03cc:
            java.util.concurrent.ConcurrentHashMap r0 = r9.A0B     // Catch:{ all -> 0x091d }
            X.C18740tg.A06(r0)     // Catch:{ all -> 0x091d }
            r0.put(r3, r13)     // Catch:{ all -> 0x091d }
            X.AnonymousClass16E.A01(r7, r13)     // Catch:{ all -> 0x091d }
            r0 = 0
            X.AnonymousClass16E.A02(r7, r9, r3, r2, r0)     // Catch:{ all -> 0x091d }
            monitor-exit(r8)     // Catch:{ all -> 0x091d }
            goto L_0x0346
        L_0x03de:
            int r0 = r13.A03()     // Catch:{ all -> 0x091d }
            long r0 = (long) r0     // Catch:{ all -> 0x091d }
            goto L_0x03c9
        L_0x03e4:
            if (r11 > r0) goto L_0x03e7
            goto L_0x03e9
        L_0x03e7:
            long r15 = (long) r11     // Catch:{ all -> 0x091d }
            goto L_0x03eb
        L_0x03e9:
            long r15 = r2.A1O     // Catch:{ all -> 0x091d }
        L_0x03eb:
            X.0wo r0 = r9.A01     // Catch:{ all -> 0x091d }
            r40 = r0
            long r0 = r2.A1O     // Catch:{ all -> 0x091d }
            r30 = r0
            long r0 = r2.A0I     // Catch:{ all -> 0x091d }
            X.3Sz r13 = new X.3Sz     // Catch:{ all -> 0x091d }
            r32 = r19
            r25 = r3
            r26 = r11
            r28 = r30
            r30 = r19
            r34 = r17
            r36 = r15
            r38 = r0
            r23 = r13
            r24 = r40
            r23.<init>(r24, r25, r26, r27, r28, r30, r32, r34, r36, r38)     // Catch:{ all -> 0x091d }
            goto L_0x03cc
        L_0x040f:
            X.B6c r0 = r5.pushnames_     // Catch:{ IOException -> 0x0923 }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ IOException -> 0x0923 }
        L_0x0415:
            boolean r0 = r5.hasNext()     // Catch:{ IOException -> 0x0923 }
            if (r0 == 0) goto L_0x00ca
            java.lang.Object r3 = r5.next()     // Catch:{ IOException -> 0x0923 }
            X.4u5 r3 = (X.C99864u5) r3     // Catch:{ IOException -> 0x0923 }
            java.lang.String r0 = r3.id_     // Catch:{ IOException -> 0x0923 }
            X.11F r0 = X.C36421kH.A0N(r0)     // Catch:{ IOException -> 0x0923 }
            if (r0 == 0) goto L_0x0415
            X.16D r2 = r4.A05     // Catch:{ IOException -> 0x0923 }
            X.141 r1 = r2.A0D(r0)     // Catch:{ IOException -> 0x0923 }
            java.lang.String r0 = r3.pushname_     // Catch:{ IOException -> 0x0923 }
            r1.A0a = r0     // Catch:{ IOException -> 0x0923 }
            r2.A0R(r1)     // Catch:{ IOException -> 0x0923 }
            goto L_0x0415
        L_0x0437:
            X.B6c r0 = r5.conversations_     // Catch:{ IOException -> 0x0923 }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ IOException -> 0x0923 }
        L_0x043d:
            boolean r0 = r12.hasNext()     // Catch:{ IOException -> 0x0923 }
            if (r0 == 0) goto L_0x0764
            java.lang.Object r3 = r12.next()     // Catch:{ IOException -> 0x0923 }
            X.4uT r3 = (X.C100104uT) r3     // Catch:{ IOException -> 0x0923 }
            java.lang.String r0 = r3.id_     // Catch:{ IOException -> 0x0923 }
            X.11F r2 = X.C36421kH.A0N(r0)     // Catch:{ IOException -> 0x0923 }
            if (r2 == 0) goto L_0x0759
            boolean r0 = r2 instanceof X.C177618e5     // Catch:{ IOException -> 0x0923 }
            if (r0 != 0) goto L_0x0759
            X.12q r7 = r4.A0D     // Catch:{ IOException -> 0x0923 }
            r0 = 0
            X.3Qp r0 = r7.A09(r2, r0)     // Catch:{ IOException -> 0x0923 }
            if (r0 != 0) goto L_0x048e
            java.util.concurrent.CountDownLatch r8 = X.C90484aE.A0u()     // Catch:{ IOException -> 0x0923 }
            X.12t r15 = r4.A0B     // Catch:{ IOException -> 0x0923 }
            java.lang.String r6 = r3.name_     // Catch:{ IOException -> 0x0923 }
            r1 = 13
            X.3v2 r0 = new X.3v2     // Catch:{ IOException -> 0x0923 }
            r0.<init>(r8, r1)     // Catch:{ IOException -> 0x0923 }
            r20 = 0
            r19 = r6
            r18 = r0
            r17 = r2
            r15.A05(r16, r17, r18, r19, r20)     // Catch:{ IOException -> 0x0923 }
            r0 = 10
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0488 }
            boolean r0 = r8.await(r0, r6)     // Catch:{ InterruptedException -> 0x0488 }
            if (r0 != 0) goto L_0x048e
            java.lang.String r0 = "HistorySyncChunkProcessor/ Chat creation timed out"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x0488 }
            goto L_0x048e
        L_0x0488:
            r1 = move-exception
            java.lang.String r0 = "HistorySyncChunkProcessor/ Chat creation interrupted."
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x0923 }
        L_0x048e:
            r0 = 0
            X.3Qp r6 = r7.A09(r2, r0)     // Catch:{ IOException -> 0x0923 }
            if (r6 != 0) goto L_0x055d
            java.lang.String r0 = "HistorySyncChunkProcessor/updateChatInfoFromConversation ChatInfo is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x0923 }
        L_0x049a:
            X.B6c r0 = r3.messages_     // Catch:{ IOException -> 0x0923 }
            java.util.ArrayList r10 = r4.A03(r0)     // Catch:{ IOException -> 0x0923 }
            X.B6c r0 = r3.messages_     // Catch:{ IOException -> 0x0923 }
            r0.size()     // Catch:{ IOException -> 0x0923 }
            r8 = 0
            X.3Qp r6 = r7.A09(r2, r8)     // Catch:{ IOException -> 0x0923 }
            if (r6 != 0) goto L_0x04ef
            java.lang.String r0 = "HistorySyncChunkProcessor/updateChatInfoWithAddedMessages ChatInfo is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x0923 }
        L_0x04b1:
            X.16D r7 = r4.A05     // Catch:{ IOException -> 0x0923 }
            X.141 r6 = r7.A0D(r2)     // Catch:{ IOException -> 0x0923 }
            boolean r0 = r2 instanceof com.whatsapp.jid.GroupJid     // Catch:{ IOException -> 0x0923 }
            if (r0 == 0) goto L_0x0687
            java.lang.String r0 = r3.name_     // Catch:{ IOException -> 0x0923 }
            r6.A0P = r0     // Catch:{ IOException -> 0x0923 }
            java.lang.String r2 = r3.pHash_     // Catch:{ IOException -> 0x0923 }
            java.lang.String r1 = "1:"
            boolean r0 = r2.startsWith(r1)     // Catch:{ IOException -> 0x0923 }
            if (r0 != 0) goto L_0x04cd
            java.lang.String r2 = X.C36321k7.A0D(r1, r2)     // Catch:{ IOException -> 0x0923 }
        L_0x04cd:
            r6.A0S = r2     // Catch:{ IOException -> 0x0923 }
            boolean r0 = r3.suspended_     // Catch:{ IOException -> 0x0923 }
            r6.A0r = r0     // Catch:{ IOException -> 0x0923 }
            boolean r0 = r3.readOnly_     // Catch:{ IOException -> 0x0923 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0634
            X.11F r0 = r6.A0H     // Catch:{ IOException -> 0x0923 }
            X.144 r8 = X.AnonymousClass6H4.A00(r0)     // Catch:{ IOException -> 0x0923 }
            X.C18740tg.A06(r8)     // Catch:{ IOException -> 0x0923 }
            X.0wQ r0 = r4.A02     // Catch:{ IOException -> 0x0923 }
            com.whatsapp.jid.PhoneUserJid r9 = X.C36371kC.A0e(r0)     // Catch:{ IOException -> 0x0923 }
            X.17X r3 = r4.A0E     // Catch:{ IOException -> 0x0923 }
            r2 = 0
            X.13u r0 = com.whatsapp.jid.DeviceJid.Companion     // Catch:{ IOException -> 0x0923 }
            goto L_0x062f
        L_0x04ef:
            r7 = 0
            int r0 = r10.size()     // Catch:{ IOException -> 0x0923 }
            if (r0 <= 0) goto L_0x0543
            int r0 = r10.size()     // Catch:{ IOException -> 0x0923 }
            r11 = 1
            int r0 = r0 - r11
            java.lang.Object r0 = r10.get(r0)     // Catch:{ IOException -> 0x0923 }
            X.3T1 r0 = (X.AnonymousClass3T1) r0     // Catch:{ IOException -> 0x0923 }
            long r0 = r0.A0I     // Catch:{ IOException -> 0x0923 }
            java.lang.Long r7 = java.lang.Long.valueOf(r0)     // Catch:{ IOException -> 0x0923 }
            r9 = 0
            java.lang.Object r8 = r10.get(r8)     // Catch:{ IOException -> 0x0923 }
            X.3T1 r8 = (X.AnonymousClass3T1) r8     // Catch:{ IOException -> 0x0923 }
            monitor-enter(r6)     // Catch:{ IOException -> 0x0923 }
            r6.A0c = r8     // Catch:{ all -> 0x0920 }
            monitor-exit(r6)     // Catch:{ IOException -> 0x0923 }
            long r0 = r8.A1O     // Catch:{ IOException -> 0x0923 }
            monitor-enter(r6)     // Catch:{ IOException -> 0x0923 }
            r6.A0O = r0     // Catch:{ all -> 0x0920 }
            monitor-exit(r6)     // Catch:{ IOException -> 0x0923 }
            long r0 = r8.A1N     // Catch:{ IOException -> 0x0923 }
            monitor-enter(r6)     // Catch:{ IOException -> 0x0923 }
            r6.A0N = r0     // Catch:{ all -> 0x0920 }
            monitor-exit(r6)     // Catch:{ IOException -> 0x0923 }
            X.2oy r1 = r8.A0L     // Catch:{ IOException -> 0x0923 }
            X.2oy r0 = r6.A0Z     // Catch:{ IOException -> 0x0923 }
            if (r0 != 0) goto L_0x0527
            r6.A0Z = r1     // Catch:{ IOException -> 0x0923 }
        L_0x0527:
            int r0 = r10.size()     // Catch:{ IOException -> 0x0923 }
            if (r9 >= r0) goto L_0x0543
            java.lang.Object r8 = r10.get(r9)     // Catch:{ IOException -> 0x0923 }
            X.3T1 r8 = (X.AnonymousClass3T1) r8     // Catch:{ IOException -> 0x0923 }
            boolean r0 = X.C66013Ui.A0w(r8, r11)     // Catch:{ IOException -> 0x0923 }
            if (r0 == 0) goto L_0x054e
            long r0 = r8.A1O     // Catch:{ IOException -> 0x0923 }
            r6.A0E(r0)     // Catch:{ IOException -> 0x0923 }
            long r0 = r8.A1N     // Catch:{ IOException -> 0x0923 }
            r6.A0D(r0)     // Catch:{ IOException -> 0x0923 }
        L_0x0543:
            X.163 r1 = r4.A0C     // Catch:{ IOException -> 0x0923 }
            android.content.ContentValues r0 = r6.A05(r7)     // Catch:{ IOException -> 0x0923 }
            r1.A0K(r0, r6)     // Catch:{ IOException -> 0x0923 }
            goto L_0x04b1
        L_0x054e:
            int r0 = r10.size()     // Catch:{ IOException -> 0x0923 }
            int r0 = r0 - r11
            if (r9 != r0) goto L_0x055a
            java.lang.String r0 = "HistorySyncChunkProcessor/updateChatInfoWithAddedMessages no display message in initial history sync"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x0923 }
        L_0x055a:
            int r9 = r9 + 1
            goto L_0x0527
        L_0x055d:
            boolean r0 = r3.notSpam_     // Catch:{ IOException -> 0x0923 }
            r8 = 1
            if (r0 == 0) goto L_0x0565
            r6.A0B(r8)     // Catch:{ IOException -> 0x0923 }
        L_0x0565:
            int r1 = r3.bitField0_     // Catch:{ IOException -> 0x0923 }
            r0 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0572
            boolean r0 = r3.markedAsUnread_     // Catch:{ IOException -> 0x0923 }
            if (r0 == 0) goto L_0x0572
            r0 = -1
            goto L_0x0574
        L_0x0572:
            int r0 = r3.unreadCount_     // Catch:{ IOException -> 0x0923 }
        L_0x0574:
            monitor-enter(r6)     // Catch:{ IOException -> 0x0923 }
            r6.A08 = r0     // Catch:{ all -> 0x0920 }
            monitor-exit(r6)     // Catch:{ IOException -> 0x0923 }
            long r0 = r3.ephemeralSettingTimestamp_     // Catch:{ IOException -> 0x0923 }
            r10 = 0
            int r9 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x059f
            int r10 = r3.ephemeralExpiration_     // Catch:{ IOException -> 0x0923 }
            boolean r9 = r2 instanceof com.whatsapp.jid.UserJid     // Catch:{ IOException -> 0x0923 }
            if (r9 == 0) goto L_0x05d9
            X.8SK r9 = r3.disappearingMode_     // Catch:{ IOException -> 0x0923 }
            if (r9 != 0) goto L_0x058c
            X.8SK r9 = X.AnonymousClass8SK.DEFAULT_INSTANCE     // Catch:{ IOException -> 0x0923 }
        L_0x058c:
            X.90o r9 = r9.A0u()     // Catch:{ IOException -> 0x0923 }
            int r11 = r9.value     // Catch:{ IOException -> 0x0923 }
            r9 = 0
            int r11 = java.lang.Math.max(r9, r11)     // Catch:{ IOException -> 0x0923 }
            r9 = 3
            int r9 = java.lang.Math.min(r9, r11)     // Catch:{ IOException -> 0x0923 }
        L_0x059c:
            r6.A0C(r10, r0, r9)     // Catch:{ IOException -> 0x0923 }
        L_0x059f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0923 }
            java.lang.String r0 = "HistorySyncChunkProcessor/updateChatInfoFromConversation setArchive - "
            r1.append(r0)     // Catch:{ IOException -> 0x0923 }
            boolean r0 = r3.archived_     // Catch:{ IOException -> 0x0923 }
            X.C36331k8.A1S(r1, r0)     // Catch:{ IOException -> 0x0923 }
            boolean r0 = r3.archived_     // Catch:{ IOException -> 0x0923 }
            r6.A0i = r0     // Catch:{ IOException -> 0x0923 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0923 }
            java.lang.String r0 = "HistorySyncChunkProcessor/updateChatInfoFromConversation setLocked - "
            r1.append(r0)     // Catch:{ IOException -> 0x0923 }
            boolean r0 = r3.locked_     // Catch:{ IOException -> 0x0923 }
            X.C36331k8.A1S(r1, r0)     // Catch:{ IOException -> 0x0923 }
            X.0yC r1 = r4.A0M     // Catch:{ IOException -> 0x0923 }
            r0 = 7280(0x1c70, float:1.0201E-41)
            boolean r0 = r1.A0E(r0)     // Catch:{ IOException -> 0x0923 }
            if (r0 == 0) goto L_0x05cd
            boolean r0 = r3.locked_     // Catch:{ IOException -> 0x0923 }
            r6.A0j = r0     // Catch:{ IOException -> 0x0923 }
        L_0x05cd:
            long r0 = r3.conversationTimestamp_     // Catch:{ IOException -> 0x0923 }
            r9 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r9
            r6.A0F(r0)     // Catch:{ IOException -> 0x0923 }
            int r0 = r3.unreadMentionCount_     // Catch:{ IOException -> 0x0923 }
            monitor-enter(r6)     // Catch:{ IOException -> 0x0923 }
            goto L_0x05df
        L_0x05d9:
            boolean r9 = r2 instanceof com.whatsapp.jid.GroupJid     // Catch:{ IOException -> 0x0923 }
            if (r9 == 0) goto L_0x059f
            r9 = 0
            goto L_0x059c
        L_0x05df:
            r6.A06 = r0     // Catch:{ all -> 0x0920 }
            monitor-exit(r6)     // Catch:{ IOException -> 0x0923 }
            int r0 = r3.bitField0_     // Catch:{ IOException -> 0x0923 }
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0608
            int r1 = r3.endOfHistoryTransferType_     // Catch:{ IOException -> 0x0923 }
            if (r1 == 0) goto L_0x05f5
            if (r1 == r8) goto L_0x05f2
            r0 = 2
            if (r1 != r0) goto L_0x05f5
            goto L_0x05f8
        L_0x05f2:
            X.5UB r0 = X.AnonymousClass5UB.COMPLETE_AND_NO_MORE_MESSAGE_REMAIN_ON_PRIMARY     // Catch:{ IOException -> 0x0923 }
            goto L_0x05fa
        L_0x05f5:
            X.5UB r0 = X.AnonymousClass5UB.COMPLETE_BUT_MORE_MESSAGES_REMAIN_ON_PRIMARY     // Catch:{ IOException -> 0x0923 }
            goto L_0x05fa
        L_0x05f8:
            X.5UB r0 = X.AnonymousClass5UB.COMPLETE_ON_DEMAND_SYNC_BUT_MORE_MSG_REMAIN_ON_PRIMARY     // Catch:{ IOException -> 0x0923 }
        L_0x05fa:
            int r9 = r0.ordinal()     // Catch:{ IOException -> 0x0923 }
            r1 = 2
            r0 = 0
            if (r9 == r0) goto L_0x0604
            if (r9 != r1) goto L_0x0605
        L_0x0604:
            r0 = 2
        L_0x0605:
            r6.A03 = r0     // Catch:{ IOException -> 0x0923 }
            goto L_0x060a
        L_0x0608:
            r6.A03 = r8     // Catch:{ IOException -> 0x0923 }
        L_0x060a:
            int r1 = r3.bitField1_     // Catch:{ IOException -> 0x0923 }
            r0 = r1 & 1
            if (r0 == 0) goto L_0x0616
            boolean r0 = r3.isParentGroup_     // Catch:{ IOException -> 0x0923 }
            if (r0 == 0) goto L_0x0616
            r6.A02 = r8     // Catch:{ IOException -> 0x0923 }
        L_0x0616:
            r0 = r1 & 4
            if (r0 == 0) goto L_0x0621
            boolean r0 = r3.isDefaultSubgroup_     // Catch:{ IOException -> 0x0923 }
            if (r0 == 0) goto L_0x0621
            r0 = 3
            r6.A02 = r0     // Catch:{ IOException -> 0x0923 }
        L_0x0621:
            r0 = r1 & 2
            if (r0 == 0) goto L_0x0628
            r0 = 2
            r6.A02 = r0     // Catch:{ IOException -> 0x0923 }
        L_0x0628:
            X.163 r0 = r4.A0C     // Catch:{ IOException -> 0x0923 }
            r0.A06(r6)     // Catch:{ IOException -> 0x0923 }
            goto L_0x049a
        L_0x062f:
            if (r9 == 0) goto L_0x0632
            goto L_0x0666
        L_0x0632:
            r1 = 0
            goto L_0x066a
        L_0x0634:
            int r2 = r3.bitField0_     // Catch:{ IOException -> 0x0923 }
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0643
            long r0 = r3.createdAt_     // Catch:{ IOException -> 0x0923 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ IOException -> 0x0923 }
            r6.A0V = r0     // Catch:{ IOException -> 0x0923 }
        L_0x0643:
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x0650
            java.lang.String r0 = r3.createdBy_     // Catch:{ IOException -> 0x0923 }
            com.whatsapp.jid.UserJid r0 = X.C36431kI.A0l(r0)     // Catch:{ IOException -> 0x0923 }
            r6.A0I = r0     // Catch:{ IOException -> 0x0923 }
        L_0x0650:
            long r0 = r3.createdAt_     // Catch:{ IOException -> 0x0923 }
            java.lang.String r3 = r3.description_     // Catch:{ IOException -> 0x0923 }
            X.3QL r2 = new X.3QL     // Catch:{ IOException -> 0x0923 }
            r18 = r16
            r15 = r2
            r17 = r16
            r19 = r3
            r20 = r0
            r15.<init>(r16, r17, r18, r19, r20)     // Catch:{ IOException -> 0x0923 }
            r6.A09(r2)     // Catch:{ IOException -> 0x0923 }
            goto L_0x0682
        L_0x0666:
            com.whatsapp.jid.DeviceJid r1 = r9.getPrimaryDevice()     // Catch:{ IOException -> 0x0923 }
        L_0x066a:
            X.C18740tg.A06(r1)     // Catch:{ IOException -> 0x0923 }
            X.6B1 r0 = new X.6B1     // Catch:{ IOException -> 0x0923 }
            r0.<init>(r1, r2, r2)     // Catch:{ IOException -> 0x0923 }
            java.util.Set r1 = java.util.Collections.singleton(r0)     // Catch:{ IOException -> 0x0923 }
            X.6PM r0 = new X.6PM     // Catch:{ IOException -> 0x0923 }
            r0.<init>(r9, r1, r2, r2)     // Catch:{ IOException -> 0x0923 }
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch:{ IOException -> 0x0923 }
            r3.A09(r8, r0)     // Catch:{ IOException -> 0x0923 }
        L_0x0682:
            r7.A0S(r6)     // Catch:{ IOException -> 0x0923 }
            goto L_0x043d
        L_0x0687:
            boolean r0 = r2 instanceof com.whatsapp.jid.UserJid     // Catch:{ IOException -> 0x0923 }
            if (r0 == 0) goto L_0x043d
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2     // Catch:{ IOException -> 0x0923 }
            r0 = 2
            byte[][] r8 = new byte[r0][]     // Catch:{ 110 -> 0x06d1 }
            r7 = 1
            byte[] r6 = new byte[r7]     // Catch:{ 110 -> 0x06d1 }
            r1 = 5
            r0 = 0
            r6[r0] = r1     // Catch:{ 110 -> 0x06d1 }
            r8[r0] = r6     // Catch:{ 110 -> 0x06d1 }
            X.AUx r0 = r3.contactPrimaryIdentityKey_     // Catch:{ 110 -> 0x06d1 }
            byte[] r0 = r0.A06()     // Catch:{ 110 -> 0x06d1 }
            r8[r7] = r0     // Catch:{ 110 -> 0x06d1 }
            byte[] r0 = X.C203239na.A05(r8)     // Catch:{ 110 -> 0x06d1 }
            X.3IG r7 = X.C133256Xm.A01(r0)     // Catch:{ 110 -> 0x06d1 }
            X.189 r6 = r4.A08     // Catch:{ 110 -> 0x06d1 }
            boolean r0 = r6.A0X()     // Catch:{ 110 -> 0x06d1 }
            if (r0 == 0) goto L_0x06c2
            com.whatsapp.jid.DeviceJid r0 = r2.getPrimaryDevice()     // Catch:{ 110 -> 0x06d1 }
            X.6EZ r1 = X.C133256Xm.A02(r0)     // Catch:{ 110 -> 0x06d1 }
            X.3FZ r0 = new X.3FZ     // Catch:{ 110 -> 0x06d1 }
            r0.<init>(r7)     // Catch:{ 110 -> 0x06d1 }
            r6.A0Q(r0, r1)     // Catch:{ 110 -> 0x06d1 }
            goto L_0x06da
        L_0x06c2:
            X.187 r6 = r4.A09     // Catch:{ 110 -> 0x06d1 }
            r0 = 39
            X.74n r1 = new X.74n     // Catch:{ 110 -> 0x06d1 }
            r1.<init>(r4, r2, r7, r0)     // Catch:{ 110 -> 0x06d1 }
            java.util.concurrent.ThreadPoolExecutor r0 = r6.A00     // Catch:{ 110 -> 0x06d1 }
            r0.execute(r1)     // Catch:{ 110 -> 0x06d1 }
            goto L_0x06da
        L_0x06d1:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0923 }
            java.lang.String r0 = "HistorySyncChunkProcessor/ invalid public key jid="
            X.C36321k7.A1J(r2, r0, r1)     // Catch:{ IOException -> 0x0923 }
        L_0x06da:
            int r1 = r3.bitField0_     // Catch:{ IOException -> 0x0923 }
            r0 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x06f3
            r0 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x06f3
            X.1DM r7 = r4.A06     // Catch:{ IOException -> 0x0923 }
            X.AUx r0 = r3.tcToken_     // Catch:{ IOException -> 0x0923 }
            byte[] r6 = r0.A06()     // Catch:{ IOException -> 0x0923 }
            long r0 = r3.tcTokenTimestamp_     // Catch:{ IOException -> 0x0923 }
            r7.A04(r2, r6, r0)     // Catch:{ IOException -> 0x0923 }
        L_0x06f3:
            int r1 = r3.bitField0_     // Catch:{ IOException -> 0x0923 }
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0701
            X.1DM r6 = r4.A06     // Catch:{ IOException -> 0x0923 }
            long r0 = r3.tcTokenSenderTimestamp_     // Catch:{ IOException -> 0x0923 }
            r6.A0B(r2, r0)     // Catch:{ IOException -> 0x0923 }
        L_0x0701:
            boolean r0 = r2 instanceof X.C223313w     // Catch:{ IOException -> 0x0923 }
            if (r0 != 0) goto L_0x0715
            int r0 = r3.bitField1_     // Catch:{ IOException -> 0x0923 }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x043d
            java.lang.String r0 = r3.lidJid_     // Catch:{ IOException -> 0x0923 }
            com.whatsapp.jid.UserJid r2 = X.C36431kI.A0l(r0)     // Catch:{ IOException -> 0x0923 }
            boolean r0 = r2 instanceof X.C223313w     // Catch:{ IOException -> 0x0923 }
            if (r0 == 0) goto L_0x043d
        L_0x0715:
            X.13w r2 = (X.C223313w) r2     // Catch:{ IOException -> 0x0923 }
            int r0 = r3.bitField1_     // Catch:{ IOException -> 0x0923 }
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0724
            X.16y r1 = r4.A0I     // Catch:{ IOException -> 0x0923 }
            java.lang.String r0 = r3.displayName_     // Catch:{ IOException -> 0x0923 }
            r1.A03(r2, r0)     // Catch:{ IOException -> 0x0923 }
        L_0x0724:
            int r0 = r3.bitField1_     // Catch:{ IOException -> 0x0923 }
            r0 = r0 & 16
            if (r0 == 0) goto L_0x073b
            java.lang.String r0 = r3.pnJid_     // Catch:{ IOException -> 0x0923 }
            com.whatsapp.jid.UserJid r1 = X.C36431kI.A0l(r0)     // Catch:{ IOException -> 0x0923 }
            boolean r0 = r1 instanceof com.whatsapp.jid.PhoneUserJid     // Catch:{ IOException -> 0x0923 }
            if (r0 == 0) goto L_0x073b
            X.12O r0 = r4.A0J     // Catch:{ IOException -> 0x0923 }
            com.whatsapp.jid.PhoneUserJid r1 = (com.whatsapp.jid.PhoneUserJid) r1     // Catch:{ IOException -> 0x0923 }
            r0.A0H(r2, r1)     // Catch:{ IOException -> 0x0923 }
        L_0x073b:
            int r0 = r3.bitField1_     // Catch:{ IOException -> 0x0923 }
            r0 = r0 & 32
            if (r0 == 0) goto L_0x074a
            boolean r0 = r3.shareOwnPn_     // Catch:{ IOException -> 0x0923 }
            if (r0 == 0) goto L_0x074a
            X.1FV r0 = r4.A0K     // Catch:{ IOException -> 0x0923 }
            r0.A08(r2)     // Catch:{ IOException -> 0x0923 }
        L_0x074a:
            int r0 = r3.bitField1_     // Catch:{ IOException -> 0x0923 }
            r0 = r0 & 64
            if (r0 == 0) goto L_0x043d
            X.1FV r1 = r4.A0K     // Catch:{ IOException -> 0x0923 }
            boolean r0 = r3.pnhDuplicateLidThread_     // Catch:{ IOException -> 0x0923 }
            r1.A09(r2, r0)     // Catch:{ IOException -> 0x0923 }
            goto L_0x043d
        L_0x0759:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0923 }
            java.lang.String r0 = "HistorySyncChunkProcessor/ skip importing of chatJid="
            X.C36321k7.A1L(r2, r0, r1)     // Catch:{ IOException -> 0x0923 }
            goto L_0x043d
        L_0x0764:
            int r0 = r5.bitField0_     // Catch:{ IOException -> 0x0923 }
            r0 = r0 & 64
            if (r0 == 0) goto L_0x078f
            int r1 = r5.aiWaitListState_     // Catch:{ IOException -> 0x0923 }
            if (r1 == 0) goto L_0x0774
            r0 = 1
            if (r1 == r0) goto L_0x0777
            X.2q1 r1 = X.C52692q1.IN_WAITLIST     // Catch:{ IOException -> 0x0923 }
            goto L_0x0779
        L_0x0774:
            X.2q1 r1 = X.C52692q1.IN_WAITLIST     // Catch:{ IOException -> 0x0923 }
            goto L_0x0779
        L_0x0777:
            X.2q1 r1 = X.C52692q1.AI_AVAILABLE     // Catch:{ IOException -> 0x0923 }
        L_0x0779:
            X.0v5 r0 = r4.A00     // Catch:{ IOException -> 0x0923 }
            java.lang.Object r2 = r0.A03()     // Catch:{ IOException -> 0x0923 }
            X.1HX r2 = (X.AnonymousClass1HX) r2     // Catch:{ IOException -> 0x0923 }
            if (r2 == 0) goto L_0x078f
            int r1 = r1.ordinal()     // Catch:{ IOException -> 0x0923 }
            r0 = 0
            if (r1 == r0) goto L_0x07d1
            X.2p6 r0 = X.C52232p6.AI_AVAILABLE     // Catch:{ IOException -> 0x0923 }
        L_0x078c:
            r2.A04(r0)     // Catch:{ IOException -> 0x0923 }
        L_0x078f:
            int r0 = r5.bitField0_     // Catch:{ IOException -> 0x0923 }
            r0 = r0 & 8
            if (r0 == 0) goto L_0x07ca
            X.4uR r2 = r5.globalSettings_     // Catch:{ IOException -> 0x0923 }
            if (r2 != 0) goto L_0x079b
            X.4uR r2 = X.C100084uR.DEFAULT_INSTANCE     // Catch:{ IOException -> 0x0923 }
        L_0x079b:
            X.0yC r1 = r4.A0M     // Catch:{ IOException -> 0x0923 }
            r0 = 7280(0x1c70, float:1.0201E-41)
            boolean r0 = r1.A0E(r0)     // Catch:{ IOException -> 0x0923 }
            if (r0 == 0) goto L_0x07ca
            int r1 = r2.bitField0_     // Catch:{ IOException -> 0x0923 }
            r0 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x07ca
            X.4u2 r2 = r2.chatLockSettings_     // Catch:{ IOException -> 0x0923 }
            if (r2 != 0) goto L_0x07b2
            X.4u2 r2 = X.C99834u2.DEFAULT_INSTANCE     // Catch:{ IOException -> 0x0923 }
        L_0x07b2:
            int r0 = r2.bitField0_     // Catch:{ IOException -> 0x0923 }
            r0 = r0 & 2
            if (r0 == 0) goto L_0x07ca
            X.1Hl r1 = r4.A03     // Catch:{ IOException -> 0x0923 }
            boolean r0 = r2.hideLockedChats_     // Catch:{ IOException -> 0x0923 }
            r1.A01(r0)     // Catch:{ IOException -> 0x0923 }
            X.1Hn r1 = r4.A04     // Catch:{ IOException -> 0x0923 }
            X.8Qp r0 = r2.secretCode_     // Catch:{ IOException -> 0x0923 }
            if (r0 != 0) goto L_0x07c7
            X.8Qp r0 = X.C173158Qp.DEFAULT_INSTANCE     // Catch:{ IOException -> 0x0923 }
        L_0x07c7:
            r1.A02(r0)     // Catch:{ IOException -> 0x0923 }
        L_0x07ca:
            X.B6c r0 = r5.conversations_     // Catch:{ IOException -> 0x0923 }
            r0.size()     // Catch:{ IOException -> 0x0923 }
            goto L_0x00ca
        L_0x07d1:
            X.2p6 r0 = X.C52232p6.IN_WAITLIST     // Catch:{ IOException -> 0x0923 }
            goto L_0x078c
        L_0x07d4:
            r10 = 0
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x07dc
            r4.A1Q = r2     // Catch:{ IOException -> 0x0923 }
        L_0x07dc:
            int r3 = r14.A00     // Catch:{ IOException -> 0x0923 }
            r4.A01 = r3     // Catch:{ IOException -> 0x0923 }
            int r12 = r7.A01     // Catch:{ IOException -> 0x0923 }
            int r11 = r7.A00     // Catch:{ IOException -> 0x0923 }
            r2 = 2
            r5 = 1
            if (r12 == 0) goto L_0x0819
            r1 = 100
            r0 = 3
            if (r12 == r2) goto L_0x080b
            if (r12 != r0) goto L_0x0843
            if (r3 != r1) goto L_0x0812
            X.0wG r0 = r8.A07     // Catch:{ IOException -> 0x0923 }
            java.io.File r1 = X.C90514aH.A0j(r0)     // Catch:{ IOException -> 0x0923 }
            X.726 r0 = X.AnonymousClass726.A00     // Catch:{ IOException -> 0x0923 }
            java.io.File[] r3 = r1.listFiles(r0)     // Catch:{ IOException -> 0x0923 }
            if (r3 == 0) goto L_0x0843
            int r2 = r3.length     // Catch:{ IOException -> 0x0923 }
            r1 = 0
        L_0x0801:
            if (r1 >= r2) goto L_0x0843
            r0 = r3[r1]     // Catch:{ IOException -> 0x0923 }
            r0.delete()     // Catch:{ IOException -> 0x0923 }
            int r1 = r1 + 1
            goto L_0x0801
        L_0x080b:
            if (r3 != r1) goto L_0x0812
            org.json.JSONObject r3 = X.C30591aS.A00(r0, r5)     // Catch:{ IOException -> 0x0923 }
            goto L_0x082e
        L_0x0812:
            int r0 = r11 + 1
            org.json.JSONObject r3 = X.C30591aS.A00(r12, r0)     // Catch:{ IOException -> 0x0923 }
            goto L_0x082e
        L_0x0819:
            org.json.JSONObject r3 = X.C30591aS.A00(r2, r5)     // Catch:{ IOException -> 0x0923 }
            X.1aV r2 = r8.A03     // Catch:{ IOException -> 0x0923 }
            monitor-enter(r2)     // Catch:{ IOException -> 0x0923 }
            X.5pu r0 = r2.A00     // Catch:{ all -> 0x0903 }
            if (r0 == 0) goto L_0x082d
            X.3ty r1 = r0.A01     // Catch:{ all -> 0x0903 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x0903 }
            r1.A0C(r0)     // Catch:{ all -> 0x0903 }
        L_0x082d:
            monitor-exit(r2)     // Catch:{ IOException -> 0x0923 }
        L_0x082e:
            if (r3 == 0) goto L_0x0843
            X.0wp r0 = r8.A05     // Catch:{ IOException -> 0x0923 }
            android.content.SharedPreferences r0 = X.C19980wp.A00(r0)     // Catch:{ IOException -> 0x0923 }
            android.content.SharedPreferences$Editor r2 = r0.edit()     // Catch:{ IOException -> 0x0923 }
            java.lang.String r1 = r3.toString()     // Catch:{ IOException -> 0x0923 }
            java.lang.String r0 = "history_sync_companion_state"
            X.C36341k9.A0x(r2, r0, r1)     // Catch:{ IOException -> 0x0923 }
        L_0x0843:
            boolean r13 = X.AnonymousClass000.A1V(r44)
            X.1DL r0 = r8.A0A     // Catch:{ IOException -> 0x0923 }
            r0.A08(r4)     // Catch:{ IOException -> 0x0923 }
            X.1Id r10 = r8.A02     // Catch:{ IOException -> 0x0923 }
            int r0 = r14.A00     // Catch:{ IOException -> 0x0923 }
            long r15 = (long) r0     // Catch:{ IOException -> 0x0923 }
            long r3 = r14.A01     // Catch:{ IOException -> 0x0923 }
            X.2SQ r5 = new X.2SQ     // Catch:{ IOException -> 0x0923 }
            r5.<init>()     // Catch:{ IOException -> 0x0923 }
            java.lang.Integer r0 = X.C36361kB.A0j()     // Catch:{ IOException -> 0x0923 }
            r5.A05 = r0     // Catch:{ IOException -> 0x0923 }
            java.lang.Integer r0 = X.AnonymousClass1AB.A01(r12)     // Catch:{ IOException -> 0x0923 }
            r5.A03 = r0     // Catch:{ IOException -> 0x0923 }
            java.lang.Integer r0 = X.AnonymousClass1AB.A00(r12)     // Catch:{ IOException -> 0x0923 }
            r5.A04 = r0     // Catch:{ IOException -> 0x0923 }
            java.lang.String r0 = X.C25911Id.A00(r10)     // Catch:{ IOException -> 0x0923 }
            r5.A0A = r0     // Catch:{ IOException -> 0x0923 }
            X.0wo r0 = r10.A01     // Catch:{ IOException -> 0x0923 }
            long r1 = X.C19970wo.A00(r0)     // Catch:{ IOException -> 0x0923 }
            java.lang.Long r0 = java.lang.Long.valueOf(r1)     // Catch:{ IOException -> 0x0923 }
            r5.A09 = r0     // Catch:{ IOException -> 0x0923 }
            java.lang.Long r0 = java.lang.Long.valueOf(r15)     // Catch:{ IOException -> 0x0923 }
            r5.A07 = r0     // Catch:{ IOException -> 0x0923 }
            java.lang.Long r0 = X.C90504aG.A0h(r1, r3)     // Catch:{ IOException -> 0x0923 }
            r5.A08 = r0     // Catch:{ IOException -> 0x0923 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)     // Catch:{ IOException -> 0x0923 }
            r5.A00 = r0     // Catch:{ IOException -> 0x0923 }
            java.lang.Long r0 = X.C36441kJ.A0y(r11)     // Catch:{ IOException -> 0x0923 }
            r5.A06 = r0     // Catch:{ IOException -> 0x0923 }
            X.0yW r0 = r10.A03     // Catch:{ IOException -> 0x0923 }
            r0.Bly(r5)     // Catch:{ IOException -> 0x0923 }
            java.lang.String r3 = r7.A04     // Catch:{ IOException -> 0x0923 }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ IOException -> 0x0923 }
            if (r0 != 0) goto L_0x08b3
            java.lang.String r2 = r7.A06     // Catch:{ IOException -> 0x0923 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IOException -> 0x0923 }
            if (r0 != 0) goto L_0x08b3
            X.164 r1 = r8.A01     // Catch:{ IOException -> 0x0923 }
            com.whatsapp.jobqueue.job.SendDeleteHistorySyncMmsJob r0 = new com.whatsapp.jobqueue.job.SendDeleteHistorySyncMmsJob     // Catch:{ IOException -> 0x0923 }
            r0.<init>(r6, r3, r2)     // Catch:{ IOException -> 0x0923 }
            r1.A01(r0)     // Catch:{ IOException -> 0x0923 }
        L_0x08b3:
            X.1aT r0 = r8.A09     // Catch:{ IOException -> 0x0923 }
            r0.A02(r6)     // Catch:{ IOException -> 0x0923 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0923 }
            java.lang.String r0 = "ReceiveHistorySyncManager/ processed syncType="
            r1.append(r0)     // Catch:{ IOException -> 0x0923 }
            r1.append(r12)     // Catch:{ IOException -> 0x0923 }
            java.lang.String r0 = " chunkOrder="
            r1.append(r0)     // Catch:{ IOException -> 0x0923 }
            r1.append(r11)     // Catch:{ IOException -> 0x0923 }
            java.lang.String r0 = " progress="
            r1.append(r0)     // Catch:{ IOException -> 0x0923 }
            int r0 = r14.A00     // Catch:{ IOException -> 0x0923 }
            X.C36321k7.A1Y(r1, r0)     // Catch:{ IOException -> 0x0923 }
            if (r44 == 0) goto L_0x08e3
            boolean r0 = r44.delete()     // Catch:{ IOException -> 0x0923 }
            if (r0 != 0) goto L_0x08e3
            java.lang.String r0 = "ReceiveHistorySyncManager/ failed to delete local chunk file."
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x0923 }
        L_0x08e3:
            r0 = 2
            if (r12 == r0) goto L_0x08e9
            r0 = 3
            if (r12 != r0) goto L_0x08fa
        L_0x08e9:
            X.0wU r3 = r8.A0B     // Catch:{ IOException -> 0x0923 }
            X.196 r2 = r8.A04     // Catch:{ IOException -> 0x0923 }
            java.util.Objects.requireNonNull(r2)     // Catch:{ IOException -> 0x0923 }
            r1 = 28
            X.1j4 r0 = new X.1j4     // Catch:{ IOException -> 0x0923 }
            r0.<init>(r2, r1)     // Catch:{ IOException -> 0x0923 }
            r3.Boy(r0)     // Catch:{ IOException -> 0x0923 }
        L_0x08fa:
            com.whatsapp.companiondevice.sync.HistorySyncCompanionWorker.A00(r9)     // Catch:{ IOException -> 0x0923 }
            return
        L_0x08fe:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ IOException -> 0x0923 }
            goto L_0x0922
        L_0x0903:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ IOException -> 0x0923 }
            goto L_0x0922
        L_0x0906:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0909 }
            throw r0     // Catch:{ all -> 0x0909 }
        L_0x0909:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x090e }
            goto L_0x0912
        L_0x090e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0913 }
        L_0x0912:
            throw r1     // Catch:{ all -> 0x0913 }
        L_0x0913:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0918 }
            goto L_0x091c
        L_0x0918:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0923 }
        L_0x091c:
            throw r1     // Catch:{ IOException -> 0x0923 }
        L_0x091d:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x091d }
            goto L_0x0922
        L_0x0920:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ IOException -> 0x0923 }
        L_0x0922:
            throw r0     // Catch:{ IOException -> 0x0923 }
        L_0x0923:
            java.lang.String r0 = "HistorySyncChunkProcessor/ unable to parse history sync protobuf"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6WD.A00(X.36I, X.5uq, X.6WD, java.io.File, byte[], int, int):void");
    }
}
