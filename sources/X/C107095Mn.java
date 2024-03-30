package X;

import android.accounts.Account;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.dialogs.PromptDialogFragment;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.5Mn  reason: invalid class name and case insensitive filesystem */
public class C107095Mn extends C132446Tt {
    public final AnonymousClass17Y A00;
    public final C33101ei A01;
    public final C125065zG A02;
    public final C19630wG A03;
    public final C19420v0 A04;
    public final AnonymousClass1Q9 A05;
    public final C21520zN A06;
    public final C224214g A07 = new C224214g("gdrive-activity/one-time-setup");
    public final WeakReference A08;
    public final Set A09;
    public final Timer A0A = new Timer("perform-one-time-setup");
    public final AtomicBoolean A0B;
    public final AtomicBoolean A0C;
    public final Account[] A0D;
    public final AnonymousClass179 A0E;

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Missing exception handler attribute for start block: B:107:0x0283 */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0314 A[Catch:{ 4yP -> 0x0570 }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0316 A[Catch:{ 4yP -> 0x0570 }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0322 A[Catch:{ 4yP -> 0x0570 }] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0324 A[Catch:{ 4yP -> 0x0570 }] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x032b A[Catch:{ 4yP -> 0x0570 }] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0333 A[Catch:{ 4yP -> 0x0570 }] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x035c A[Catch:{ 4yP -> 0x0570 }] */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x03ef A[Catch:{ 4yP -> 0x0570 }] */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0510 A[Catch:{ 4yD | 4yH | 4yJ | 4yQ | 4yR -> 0x0153, all -> 0x0595 }] */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r42) {
        /*
            r41 = this;
            r11 = r41
            java.lang.ref.WeakReference r0 = r11.A08
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L_0x000d
            r22 = 0
            return r22
        L_0x000d:
            X.C18740tg.A00()
            X.1Q9 r10 = r11.A05
            X.0v0 r0 = r11.A04
            r40 = r0
            java.util.concurrent.Executor r0 = X.AnonymousClass6Y6.A00
            X.0wG r0 = r11.A03
            android.content.Context r0 = r0.A00
            int r0 = X.C34201gc.A00(r0)
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            r22 = 0
            if (r0 != 0) goto L_0x002e
            java.lang.String r0 = "restore>AccountWithLatestGoogleDriveBackupFetcher/one-time-setup/google-play-services-not-available"
        L_0x002a:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r22
        L_0x002e:
            java.lang.String r9 = r40.A0g()
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = "restore>AccountWithLatestGoogleDriveBackupFetcher/one-time-setup/jid-user is null"
            goto L_0x002a
        L_0x003b:
            X.1ei r2 = r11.A01
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.A0Y
            r39 = r0
            r1 = 1
            r0.set(r1)
            r2.A06()
            r2.A05()
            r2.A08()
            android.accounts.Account[] r8 = r11.A0D     // Catch:{ all -> 0x0595 }
            int r7 = r8.length     // Catch:{ all -> 0x0595 }
            r6 = 0
            r5 = r22
        L_0x0054:
            if (r6 >= r7) goto L_0x0197
            r13 = r8[r6]     // Catch:{ all -> 0x0595 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.A0B     // Catch:{ all -> 0x0595 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0595 }
            if (r0 == 0) goto L_0x0067
            java.lang.String r0 = "restore>AccountWithLatestGoogleDriveBackupFetcher/one-time-setup/canceled"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0595 }
            goto L_0x058e
        L_0x0067:
            java.util.Set r12 = r11.A09     // Catch:{ all -> 0x0595 }
            boolean r0 = r12.contains(r13)     // Catch:{ all -> 0x0595 }
            if (r0 == 0) goto L_0x0083
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0595 }
            java.lang.String r0 = "one-time-setup/skipping-account-with-no-backup/"
            r1.append(r0)     // Catch:{ all -> 0x0595 }
            java.lang.String r0 = r13.name     // Catch:{ all -> 0x0595 }
            java.lang.String r0 = X.C34191gb.A07(r0)     // Catch:{ all -> 0x0595 }
            X.C36321k7.A1a(r1, r0)     // Catch:{ all -> 0x0595 }
            goto L_0x0193
        L_0x0083:
            java.lang.String r4 = r13.name     // Catch:{ all -> 0x0595 }
            X.C34191gb.A07(r4)     // Catch:{ all -> 0x0595 }
            X.5zG r2 = r11.A02     // Catch:{ 4yH -> 0x0135 }
            X.0wG r0 = r2.A0A     // Catch:{ 4yH -> 0x0135 }
            android.content.Context r0 = r0.A00     // Catch:{ 4yH -> 0x0135 }
            r24 = r0
            X.0yC r0 = r2.A0F     // Catch:{ 4yH -> 0x0135 }
            r33 = r0
            X.0wN r0 = r2.A00     // Catch:{ 4yH -> 0x0135 }
            r23 = r0
            X.0wt r0 = r2.A0H     // Catch:{ 4yH -> 0x0135 }
            r21 = r0
            X.0ww r0 = r2.A02     // Catch:{ 4yH -> 0x0135 }
            r20 = r0
            X.179 r0 = r2.A09     // Catch:{ 4yH -> 0x0135 }
            r19 = r0
            X.1Ck r0 = r2.A05     // Catch:{ 4yH -> 0x0135 }
            r18 = r0
            X.6Ns r0 = r2.A06     // Catch:{ 4yH -> 0x0135 }
            r17 = r0
            X.0yE r0 = r2.A0B     // Catch:{ 4yH -> 0x0135 }
            r16 = r0
            X.1Aw r15 = r2.A0G     // Catch:{ 4yH -> 0x0135 }
            X.1Cn r14 = r2.A03     // Catch:{ 4yH -> 0x0135 }
            X.0wD r3 = r2.A08     // Catch:{ 4yH -> 0x0135 }
            X.0wU r1 = r2.A0I     // Catch:{ 4yH -> 0x0135 }
            java.lang.String r38 = "restore"
            X.6Xi r0 = new X.6Xi     // Catch:{ 4yH -> 0x0135 }
            r25 = r23
            r26 = r20
            r27 = r14
            r28 = r18
            r29 = r17
            r30 = r3
            r31 = r19
            r32 = r16
            r34 = r15
            r35 = r21
            r36 = r1
            r37 = r4
            r23 = r0
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)     // Catch:{ 4yH -> 0x0135 }
            X.1el r3 = r2.A07     // Catch:{ all -> 0x0133 }
            r1 = 5
            boolean r1 = X.AnonymousClass6YN.A0C(r3, r0, r1)     // Catch:{ all -> 0x0133 }
            if (r1 == 0) goto L_0x012b
            java.lang.String r1 = "restore>BackupApiBackupSelector/create-internal-data"
            X.6Te r3 = X.AnonymousClass6YN.A01(r3, r0, r9, r1)     // Catch:{ all -> 0x0133 }
            if (r3 == 0) goto L_0x0146
            org.json.JSONObject r15 = r3.A0B     // Catch:{ all -> 0x0133 }
            if (r15 == 0) goto L_0x0125
            java.lang.String r14 = "chatdbSize"
            r0 = -1
            long r16 = r15.optLong(r14, r0)     // Catch:{ all -> 0x0133 }
            r14 = 0
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x0125
            X.6Uy r1 = r2.A04     // Catch:{ all -> 0x0133 }
            org.json.JSONObject r0 = r3.A02()     // Catch:{ all -> 0x0133 }
            boolean r0 = r1.A03(r0)     // Catch:{ all -> 0x0133 }
            if (r0 == 0) goto L_0x0146
            X.4xr r14 = new X.4xr     // Catch:{ all -> 0x0133 }
            r14.<init>(r3, r2)     // Catch:{ all -> 0x0133 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 4yQ -> 0x015b, 4yR -> 0x0159, 4yJ -> 0x0157, 4yH -> 0x0155, 4yD -> 0x0153 }
            java.lang.String r0 = "restore>AccountWithLatestGoogleDriveBackupFetcher/one-time-setup "
            X.C90474aD.A1J(r0, r4, r1)     // Catch:{ 4yQ -> 0x015b, 4yR -> 0x0159, 4yJ -> 0x0157, 4yH -> 0x0155, 4yD -> 0x0153 }
            java.lang.String r0 = " has google backup created on "
            r1.append(r0)     // Catch:{ 4yQ -> 0x015b, 4yR -> 0x0159, 4yJ -> 0x0157, 4yH -> 0x0155, 4yD -> 0x0153 }
            long r2 = r14.A04     // Catch:{ 4yQ -> 0x015b, 4yR -> 0x0159, 4yJ -> 0x0157, 4yH -> 0x0155, 4yD -> 0x0153 }
            X.C36351kA.A1S(r1, r2)     // Catch:{ 4yQ -> 0x015b, 4yR -> 0x0159, 4yJ -> 0x0157, 4yH -> 0x0155, 4yD -> 0x0153 }
            if (r5 == 0) goto L_0x0192
            long r0 = r5.A04     // Catch:{ 4yQ -> 0x015b, 4yR -> 0x0159, 4yJ -> 0x0157, 4yH -> 0x0155, 4yD -> 0x0153 }
            goto L_0x018e
        L_0x0125:
            java.lang.String r0 = "restore>BackupApiBackupSelector/backup is not valid, its chat db size is 0"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0133 }
            goto L_0x0146
        L_0x012b:
            X.4yR r1 = new X.4yR     // Catch:{ all -> 0x0133 }
            r0 = r22
            r1.<init>(r0)     // Catch:{ all -> 0x0133 }
            throw r1     // Catch:{ all -> 0x0133 }
        L_0x0133:
            r0 = move-exception
            throw r0     // Catch:{ 4yH -> 0x0135 }
        L_0x0135:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 4yQ -> 0x015b, 4yR -> 0x0159, 4yJ -> 0x0157, 4yH -> 0x0155, 4yD -> 0x0153 }
            java.lang.String r0 = "restore>AccountWithLatestGoogleDriveBackupFetcher/one-time-setup/google drive api disabled on google side for "
            X.C90474aD.A1J(r0, r4, r1)     // Catch:{ 4yQ -> 0x015b, 4yR -> 0x0159, 4yJ -> 0x0157, 4yH -> 0x0155, 4yD -> 0x0153 }
            java.lang.String r0 = r1.toString()     // Catch:{ 4yQ -> 0x015b, 4yR -> 0x0159, 4yJ -> 0x0157, 4yH -> 0x0155, 4yD -> 0x0153 }
            com.whatsapp.util.Log.i(r0, r2)     // Catch:{ 4yQ -> 0x015b, 4yR -> 0x0159, 4yJ -> 0x0157, 4yH -> 0x0155, 4yD -> 0x0153 }
        L_0x0146:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 4yQ -> 0x015b, 4yR -> 0x0159, 4yJ -> 0x0157, 4yH -> 0x0155, 4yD -> 0x0153 }
            java.lang.String r0 = "restore>AccountWithLatestGoogleDriveBackupFetcher/one-time-setup/account-with-no-backup/"
            X.C90464aC.A1I(r0, r4, r1)     // Catch:{ 4yQ -> 0x015b, 4yR -> 0x0159, 4yJ -> 0x0157, 4yH -> 0x0155, 4yD -> 0x0153 }
            r12.add(r13)     // Catch:{ 4yQ -> 0x015b, 4yR -> 0x0159, 4yJ -> 0x0157, 4yH -> 0x0155, 4yD -> 0x0153 }
            goto L_0x0193
        L_0x0153:
            r2 = move-exception
            goto L_0x015c
        L_0x0155:
            r2 = move-exception
            goto L_0x015c
        L_0x0157:
            r2 = move-exception
            goto L_0x015c
        L_0x0159:
            r2 = move-exception
            goto L_0x015c
        L_0x015b:
            r2 = move-exception
        L_0x015c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0595 }
            java.lang.String r0 = "restore>AccountWithLatestGoogleDriveBackupFetcher/one-time-setup failed to access account: "
            X.C90474aD.A1J(r0, r4, r1)     // Catch:{ all -> 0x0595 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0595 }
            com.whatsapp.util.Log.i(r0, r2)     // Catch:{ all -> 0x0595 }
            android.content.SharedPreferences r1 = X.C36341k9.A0E(r40)     // Catch:{ all -> 0x0595 }
            java.lang.String r0 = "new_jid"
            boolean r2 = X.C36371kC.A1U(r1, r0)     // Catch:{ all -> 0x0595 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0595 }
            java.lang.String r0 = "gdrive-util/is-new-jid/"
            X.C36321k7.A1X(r0, r1, r2)     // Catch:{ all -> 0x0595 }
            if (r2 == 0) goto L_0x0193
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0595 }
            java.lang.String r0 = "restore>AccountWithLatestGoogleDriveBackupFetcher/one-time-setup/new-user/add-account-to-no-backup-found "
            X.C90464aC.A1I(r0, r4, r1)     // Catch:{ all -> 0x0595 }
            r12.add(r13)     // Catch:{ all -> 0x0595 }
            goto L_0x0193
        L_0x018e:
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x0193
        L_0x0192:
            r5 = r14
        L_0x0193:
            int r6 = r6 + 1
            goto L_0x0054
        L_0x0197:
            if (r5 != 0) goto L_0x01ee
            X.0zN r1 = r11.A06     // Catch:{ IOException -> 0x01e8 }
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)     // Catch:{ IOException -> 0x01e8 }
            r0 = 5284(0x14a4, float:7.404E-42)
            boolean r0 = r1.A0E(r0)     // Catch:{ IOException -> 0x01e8 }
            if (r0 == 0) goto L_0x01d1
            java.util.concurrent.atomic.AtomicBoolean r4 = r11.A0C     // Catch:{ IOException -> 0x01e8 }
            java.util.ArrayList r0 = r10.A0L()     // Catch:{ IOException -> 0x01e8 }
            boolean r3 = r4.get()     // Catch:{ IOException -> 0x01e8 }
            java.lang.String r2 = r40.A0g()     // Catch:{ IOException -> 0x01e8 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ IOException -> 0x01e8 }
        L_0x01b9:
            boolean r0 = r1.hasNext()     // Catch:{ IOException -> 0x01e8 }
            if (r0 == 0) goto L_0x01cb
            java.io.File r0 = X.C90504aG.A0a(r1)     // Catch:{ IOException -> 0x01e8 }
            boolean r0 = X.AnonymousClass6Y6.A07(r10, r0, r2, r3)     // Catch:{ IOException -> 0x01e8 }
            if (r0 != 0) goto L_0x01b9
            r0 = 0
            goto L_0x01cc
        L_0x01cb:
            r0 = 1
        L_0x01cc:
            r4.set(r0)     // Catch:{ IOException -> 0x01e8 }
            goto L_0x058e
        L_0x01d1:
            java.util.concurrent.atomic.AtomicBoolean r3 = r11.A0C     // Catch:{ IOException -> 0x01e8 }
            java.io.File r2 = r10.A0I()     // Catch:{ IOException -> 0x01e8 }
            boolean r1 = r3.get()     // Catch:{ IOException -> 0x01e8 }
            java.lang.String r0 = r40.A0g()     // Catch:{ IOException -> 0x01e8 }
            boolean r0 = X.AnonymousClass6Y6.A07(r10, r2, r0, r1)     // Catch:{ IOException -> 0x01e8 }
            r3.set(r0)     // Catch:{ IOException -> 0x01e8 }
            goto L_0x058e
        L_0x01e8:
            r0 = move-exception
            com.whatsapp.util.Log.w((java.lang.Throwable) r0)     // Catch:{ all -> 0x0595 }
            goto L_0x058e
        L_0x01ee:
            X.5zG r6 = r5.A02     // Catch:{ all -> 0x0595 }
            X.C18740tg.A00()     // Catch:{ all -> 0x0595 }
            java.lang.String r2 = "restore>BackupApiBackupSelector/decide"
            X.14g r21 = new X.14g     // Catch:{ all -> 0x0595 }
            r0 = r21
            r0.<init>((java.lang.String) r2)     // Catch:{ all -> 0x0595 }
            X.6Te r0 = r5.A01     // Catch:{ all -> 0x0595 }
            r28 = r0
            org.json.JSONObject r0 = r0.A0B     // Catch:{ all -> 0x0595 }
            r20 = r0
            r8 = 0
            if (r0 == 0) goto L_0x020d
            java.lang.String r1 = "encryptedBackupEnabled"
            boolean r8 = r0.optBoolean(r1, r8)     // Catch:{ all -> 0x0595 }
        L_0x020d:
            X.1el r1 = r6.A07     // Catch:{ 5VQ -> 0x0587 }
            r0 = r28
            java.util.Map r19 = X.AnonymousClass6YN.A05(r1, r0)     // Catch:{ 5VQ -> 0x0587 }
            r7 = 0
            if (r19 == 0) goto L_0x058e
            java.util.ArrayList r18 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x0595 }
            X.0zN r14 = r6.A0E     // Catch:{ 4yP -> 0x0570 }
            X.AnonymousClass00C.A0D(r14, r7)     // Catch:{ 4yP -> 0x0570 }
            r0 = 5284(0x14a4, float:7.404E-42)
            boolean r0 = r14.A0E(r0)     // Catch:{ 4yP -> 0x0570 }
            if (r0 == 0) goto L_0x0365
            X.1Q9 r4 = r6.A0D     // Catch:{ 4yP -> 0x0570 }
            java.util.ArrayList r18 = r4.A0L()     // Catch:{ 4yP -> 0x0570 }
            java.util.ArrayList r12 = X.AnonymousClass6YN.A04(r19)     // Catch:{ 4yP -> 0x0570 }
            X.179 r11 = r6.A09     // Catch:{ 4yP -> 0x0570 }
            X.0yE r10 = r6.A0B     // Catch:{ 4yP -> 0x0570 }
            X.C36321k7.A0z(r11, r10)     // Catch:{ 4yP -> 0x0570 }
            boolean r0 = r18.isEmpty()     // Catch:{ 4yP -> 0x0570 }
            if (r0 == 0) goto L_0x0249
            boolean r0 = r12.isEmpty()     // Catch:{ 4yP -> 0x0570 }
            if (r0 == 0) goto L_0x0249
            r2 = 4
            goto L_0x0305
        L_0x0249:
            boolean r0 = r18.isEmpty()     // Catch:{ 4yP -> 0x0570 }
            if (r0 == 0) goto L_0x0252
            r2 = 2
            goto L_0x0305
        L_0x0252:
            boolean r0 = r12.isEmpty()     // Catch:{ 4yP -> 0x0570 }
            if (r0 == 0) goto L_0x025b
            r2 = 3
            goto L_0x0305
        L_0x025b:
            int r1 = r12.size()     // Catch:{ 4yP -> 0x0570 }
            int r0 = r18.size()     // Catch:{ 4yP -> 0x0570 }
            if (r1 != r0) goto L_0x02ba
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()     // Catch:{ 4yP -> 0x0570 }
            java.util.Iterator r9 = r18.iterator()     // Catch:{ 4yP -> 0x0570 }
        L_0x026d:
            boolean r0 = r9.hasNext()     // Catch:{ 4yP -> 0x0570 }
            if (r0 == 0) goto L_0x0283
            java.io.File r2 = X.C90504aG.A0a(r9)     // Catch:{ 4yP -> 0x0570 }
            long r0 = r2.length()     // Catch:{ 4yP -> 0x0283 }
            java.lang.String r0 = X.C34191gb.A04(r11, r10, r2, r0)     // Catch:{ 4yP -> 0x0283 }
            r3.add(r0)     // Catch:{ 4yP -> 0x0283 }
            goto L_0x026d
        L_0x0283:
            int r1 = r12.size()     // Catch:{ 4yP -> 0x0570 }
            int r0 = r3.size()     // Catch:{ 4yP -> 0x0570 }
            if (r1 != r0) goto L_0x02ba
            java.util.Iterator r2 = r12.iterator()     // Catch:{ 4yP -> 0x0570 }
        L_0x0291:
            boolean r0 = r2.hasNext()     // Catch:{ 4yP -> 0x0570 }
            if (r0 == 0) goto L_0x02a9
            java.lang.Object r1 = r2.next()     // Catch:{ 4yP -> 0x0570 }
            X.6Pk r1 = (X.C131526Pk) r1     // Catch:{ 4yP -> 0x0570 }
            X.6Cl r0 = r1.A02     // Catch:{ 4yP -> 0x0570 }
            if (r0 == 0) goto L_0x02b5
            java.lang.String r0 = r0.A03     // Catch:{ 4yP -> 0x0570 }
        L_0x02a3:
            boolean r0 = r3.remove(r0)     // Catch:{ 4yP -> 0x0570 }
            if (r0 != 0) goto L_0x0291
        L_0x02a9:
            boolean r0 = r3.isEmpty()     // Catch:{ 4yP -> 0x0570 }
            if (r0 == 0) goto L_0x02ba
            java.lang.String r0 = "GoogleBackupUtils/isRemoteTheLatest local and remote are the same"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 4yP -> 0x0570 }
            goto L_0x02b8
        L_0x02b5:
            java.lang.String r0 = r1.A03     // Catch:{ 4yP -> 0x0570 }
            goto L_0x02a3
        L_0x02b8:
            r2 = 5
            goto L_0x0305
        L_0x02ba:
            java.util.Iterator r12 = r12.iterator()     // Catch:{ 4yP -> 0x0570 }
            r2 = 0
            r0 = 0
        L_0x02c2:
            boolean r9 = r12.hasNext()     // Catch:{ 4yP -> 0x0570 }
            if (r9 == 0) goto L_0x02d6
            java.lang.Object r9 = r12.next()     // Catch:{ 4yP -> 0x0570 }
            X.6Pk r9 = (X.C131526Pk) r9     // Catch:{ 4yP -> 0x0570 }
            long r9 = r9.A01     // Catch:{ 4yP -> 0x0570 }
            int r11 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r11 <= 0) goto L_0x02c2
            r0 = r9
            goto L_0x02c2
        L_0x02d6:
            java.util.Iterator r12 = r18.iterator()     // Catch:{ 4yP -> 0x0570 }
        L_0x02da:
            boolean r9 = r12.hasNext()     // Catch:{ 4yP -> 0x0570 }
            if (r9 == 0) goto L_0x02ee
            java.io.File r9 = X.C90504aG.A0a(r12)     // Catch:{ 4yP -> 0x0570 }
            long r10 = r9.lastModified()     // Catch:{ 4yP -> 0x0570 }
            int r9 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r9 <= 0) goto L_0x02da
            r2 = r10
            goto L_0x02da
        L_0x02ee:
            java.lang.StringBuilder r10 = X.AnonymousClass000.A0u()     // Catch:{ 4yP -> 0x0570 }
            java.lang.String r9 = "GoogleBackupUtils/isRemoteTheLatest remote: "
            r10.append(r9)     // Catch:{ 4yP -> 0x0570 }
            r10.append(r0)     // Catch:{ 4yP -> 0x0570 }
            java.lang.String r9 = " local: "
            X.C36321k7.A1V(r9, r10, r2)     // Catch:{ 4yP -> 0x0570 }
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r2 = 7
            if (r9 <= 0) goto L_0x0305
            r2 = 6
        L_0x0305:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 4yP -> 0x0570 }
            java.lang.String r0 = "restore>BackupApiBackupSelector/decideLocalVsRemotePreference/backup state: "
            r1.append(r0)     // Catch:{ 4yP -> 0x0570 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ 4yP -> 0x0570 }
            if (r0 != 0) goto L_0x0316
            r0 = 0
            goto L_0x031a
        L_0x0316:
            java.lang.String r0 = r0.toString()     // Catch:{ 4yP -> 0x0570 }
        L_0x031a:
            X.C36321k7.A1a(r1, r0)     // Catch:{ 4yP -> 0x0570 }
            r9 = 4
            r0 = 1
            switch(r2) {
                case 2: goto L_0x032b;
                case 3: goto L_0x0333;
                case 4: goto L_0x035c;
                case 5: goto L_0x03ef;
                case 6: goto L_0x0324;
                default: goto L_0x0322;
            }     // Catch:{ 4yP -> 0x0570 }
        L_0x0322:
            goto L_0x048e
        L_0x0324:
            X.0v0 r10 = r6.A0C     // Catch:{ 4yP -> 0x0570 }
            r10.A1t(r0)     // Catch:{ 4yP -> 0x0570 }
            goto L_0x044b
        L_0x032b:
            X.0v0 r10 = r6.A0C     // Catch:{ 4yP -> 0x0570 }
            r10.A1t(r0)     // Catch:{ 4yP -> 0x0570 }
            r0 = 2
            goto L_0x044c
        L_0x0333:
            X.0v0 r10 = r6.A0C     // Catch:{ 4yP -> 0x0570 }
            r10.A1t(r7)     // Catch:{ 4yP -> 0x0570 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.A0L     // Catch:{ 4yP -> 0x0570 }
            boolean r3 = r0.get()     // Catch:{ 4yP -> 0x0570 }
            java.lang.String r2 = r10.A0g()     // Catch:{ 4yP -> 0x0570 }
            java.util.Iterator r1 = r18.iterator()     // Catch:{ 4yP -> 0x0570 }
        L_0x0346:
            boolean r0 = r1.hasNext()     // Catch:{ 4yP -> 0x0570 }
            if (r0 == 0) goto L_0x035a
            java.io.File r0 = X.C90504aG.A0a(r1)     // Catch:{ 4yP -> 0x0570 }
            boolean r0 = X.AnonymousClass6Y6.A07(r4, r0, r2, r3)     // Catch:{ 4yP -> 0x0570 }
            if (r0 != 0) goto L_0x0346
        L_0x0356:
            r4.A00 = r9     // Catch:{ 4yP -> 0x0570 }
            goto L_0x0496
        L_0x035a:
            r9 = 3
            goto L_0x0356
        L_0x035c:
            r4.A00 = r9     // Catch:{ 4yP -> 0x0570 }
            X.0v0 r10 = r6.A0C     // Catch:{ 4yP -> 0x0570 }
            r10.A1t(r0)     // Catch:{ 4yP -> 0x0570 }
            goto L_0x044e
        L_0x0365:
            X.1Q9 r4 = r6.A0D     // Catch:{ 4yP -> 0x0570 }
            java.io.File[] r11 = r4.A0R()     // Catch:{ 4yP -> 0x0570 }
            int r10 = r11.length     // Catch:{ 4yP -> 0x0570 }
            r3 = 0
        L_0x036d:
            if (r3 >= r10) goto L_0x0391
            r2 = r11[r3]     // Catch:{ 4yP -> 0x0570 }
            X.179 r0 = r6.A09     // Catch:{ 4yP -> 0x0570 }
            java.lang.String r1 = X.C34191gb.A05(r0, r2)     // Catch:{ 4yP -> 0x0570 }
            if (r1 == 0) goto L_0x0386
            r0 = r19
            java.lang.Object r9 = r0.get(r1)     // Catch:{ 4yP -> 0x0570 }
            X.6Pk r9 = (X.C131526Pk) r9     // Catch:{ 4yP -> 0x0570 }
            if (r9 != 0) goto L_0x0392
            int r3 = r3 + 1
            goto L_0x036d
        L_0x0386:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 4yP -> 0x0570 }
            java.lang.String r0 = "restore>BackupApiBackupSelector/decide upload title is null for "
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0f(r2, r0, r1)     // Catch:{ 4yP -> 0x0570 }
            throw r0     // Catch:{ 4yP -> 0x0570 }
        L_0x0391:
            r9 = 0
        L_0x0392:
            java.io.File r11 = r4.A0I()     // Catch:{ IOException -> 0x0397 }
            goto L_0x039e
        L_0x0397:
            r1 = move-exception
            java.lang.String r0 = "restore>BackupApiBackupSelector/device unable to access local backup"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ 4yP -> 0x0570 }
            r11 = 0
        L_0x039e:
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.A0L     // Catch:{ 4yP -> 0x0570 }
            boolean r1 = r0.get()     // Catch:{ 4yP -> 0x0570 }
            X.0v0 r10 = r6.A0C     // Catch:{ 4yP -> 0x0570 }
            java.lang.String r0 = r10.A0g()     // Catch:{ 4yP -> 0x0570 }
            boolean r0 = X.AnonymousClass6Y6.A07(r4, r11, r0, r1)     // Catch:{ 4yP -> 0x0570 }
            r12 = 2
            r13 = 1
            if (r0 != 0) goto L_0x03bc
            r10.A1t(r13)     // Catch:{ 4yP -> 0x0570 }
            if (r9 != 0) goto L_0x03b8
            r12 = 4
        L_0x03b8:
            r4.A00 = r12     // Catch:{ 4yP -> 0x0570 }
            goto L_0x044e
        L_0x03bc:
            if (r9 != 0) goto L_0x03c9
            java.lang.String r0 = "restore>BackupApiBackupSelector/decide remote dbFile does not exist"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 4yP -> 0x0570 }
            r10.A1t(r7)     // Catch:{ 4yP -> 0x0570 }
            r0 = 3
            goto L_0x0494
        L_0x03c9:
            X.6Cl r0 = r9.A02     // Catch:{ 4yP -> 0x0570 }
            if (r0 == 0) goto L_0x03ec
            java.lang.String r3 = r0.A03     // Catch:{ 4yP -> 0x0570 }
        L_0x03cf:
            X.179 r0 = r6.A09     // Catch:{ 4yP -> 0x0570 }
            r1 = r0
            X.0yE r0 = r6.A0B     // Catch:{ 4yP -> 0x0570 }
            long r16 = r11.length()     // Catch:{ 4yP -> 0x0570 }
            r15 = r1
            r2 = r0
            r0 = r16
            java.lang.String r0 = X.C34191gb.A04(r15, r2, r11, r0)     // Catch:{ 4yP -> 0x0570 }
            boolean r0 = r3.equals(r0)     // Catch:{ 4yP -> 0x0570 }
            if (r0 == 0) goto L_0x03f7
            java.lang.String r0 = "restore>BackupApiBackupSelector/decide Local message backup has same md5 as google drive."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 4yP -> 0x0570 }
            goto L_0x03f1
        L_0x03ec:
            java.lang.String r3 = r9.A03     // Catch:{ 4yP -> 0x0570 }
            goto L_0x03cf
        L_0x03ef:
            X.0v0 r10 = r6.A0C     // Catch:{ 4yP -> 0x0570 }
        L_0x03f1:
            r10.A1t(r7)     // Catch:{ 4yP -> 0x0570 }
            r0 = 5
            goto L_0x0494
        L_0x03f7:
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch:{ 4yP -> 0x0570 }
            java.text.DateFormat r12 = java.text.DateFormat.getDateInstance(r12, r0)     // Catch:{ 4yP -> 0x0570 }
            long r15 = r11.lastModified()     // Catch:{ 4yP -> 0x0570 }
            long r2 = r9.A01     // Catch:{ 4yP -> 0x0570 }
            java.lang.String r9 = ", time: "
            int r0 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0450
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0u()     // Catch:{ 4yP -> 0x0570 }
            java.lang.String r0 = "restore>BackupApiBackupSelector/decide/choose-remote Google Drive (timestamp "
            r7.append(r0)     // Catch:{ 4yP -> 0x0570 }
            r7.append(r2)     // Catch:{ 4yP -> 0x0570 }
            r7.append(r9)     // Catch:{ 4yP -> 0x0570 }
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ 4yP -> 0x0570 }
            java.lang.String r0 = r12.format(r0)     // Catch:{ 4yP -> 0x0570 }
            r7.append(r0)     // Catch:{ 4yP -> 0x0570 }
            java.lang.String r0 = ") is newer than local message backup (timestamp "
            r7.append(r0)     // Catch:{ 4yP -> 0x0570 }
            long r0 = r11.lastModified()     // Catch:{ 4yP -> 0x0570 }
            r7.append(r0)     // Catch:{ 4yP -> 0x0570 }
            r7.append(r9)     // Catch:{ 4yP -> 0x0570 }
            long r0 = r11.lastModified()     // Catch:{ 4yP -> 0x0570 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ 4yP -> 0x0570 }
            java.lang.String r0 = r12.format(r0)     // Catch:{ 4yP -> 0x0570 }
            r7.append(r0)     // Catch:{ 4yP -> 0x0570 }
            java.lang.String r0 = ")"
            X.C36321k7.A1a(r7, r0)     // Catch:{ 4yP -> 0x0570 }
            r10.A1t(r13)     // Catch:{ 4yP -> 0x0570 }
        L_0x044b:
            r0 = 6
        L_0x044c:
            r4.A00 = r0     // Catch:{ 4yP -> 0x0570 }
        L_0x044e:
            r9 = 1
            goto L_0x04c9
        L_0x0450:
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0u()     // Catch:{ 4yP -> 0x0570 }
            java.lang.String r0 = "restore>BackupApiBackupSelector/decide/choose-local local backup file (timestamp "
            r8.append(r0)     // Catch:{ 4yP -> 0x0570 }
            long r0 = r11.lastModified()     // Catch:{ 4yP -> 0x0570 }
            r8.append(r0)     // Catch:{ 4yP -> 0x0570 }
            r8.append(r9)     // Catch:{ 4yP -> 0x0570 }
            long r0 = r11.lastModified()     // Catch:{ 4yP -> 0x0570 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ 4yP -> 0x0570 }
            java.lang.String r0 = r12.format(r0)     // Catch:{ 4yP -> 0x0570 }
            r8.append(r0)     // Catch:{ 4yP -> 0x0570 }
            java.lang.String r0 = ") and is newer than one on Google Drive (timestamp "
            r8.append(r0)     // Catch:{ 4yP -> 0x0570 }
            r8.append(r2)     // Catch:{ 4yP -> 0x0570 }
            r8.append(r9)     // Catch:{ 4yP -> 0x0570 }
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ 4yP -> 0x0570 }
            java.lang.String r0 = r12.format(r0)     // Catch:{ 4yP -> 0x0570 }
            r8.append(r0)     // Catch:{ 4yP -> 0x0570 }
            java.lang.String r0 = ") and the two files are different as well, therefore, we will use the local"
            X.C36321k7.A1a(r8, r0)     // Catch:{ 4yP -> 0x0570 }
            goto L_0x0490
        L_0x048e:
            X.0v0 r10 = r6.A0C     // Catch:{ 4yP -> 0x0570 }
        L_0x0490:
            r10.A1t(r7)     // Catch:{ 4yP -> 0x0570 }
            r0 = 7
        L_0x0494:
            r4.A00 = r0     // Catch:{ 4yP -> 0x0570 }
        L_0x0496:
            r9 = 0
            r8 = 0
            r0 = 5284(0x14a4, float:7.404E-42)
            boolean r0 = r14.A0E(r0)     // Catch:{ IOException -> 0x04c3 }
            if (r0 == 0) goto L_0x04af
            int r0 = r18.size()     // Catch:{ IOException -> 0x04c3 }
            if (r0 <= 0) goto L_0x04c9
            r0 = r18
            java.lang.Object r0 = r0.get(r7)     // Catch:{ IOException -> 0x04c3 }
            java.io.File r0 = (java.io.File) r0     // Catch:{ IOException -> 0x04c3 }
            goto L_0x04b3
        L_0x04af:
            java.io.File r0 = r4.A0I()     // Catch:{ IOException -> 0x04c3 }
        L_0x04b3:
            if (r0 == 0) goto L_0x04c9
            java.lang.String r0 = r0.getName()     // Catch:{ IOException -> 0x04c3 }
            X.5U6 r1 = X.C110565as.A00(r0)     // Catch:{ IOException -> 0x04c3 }
            X.5U6 r0 = X.AnonymousClass5U6.CRYPT15     // Catch:{ IOException -> 0x04c3 }
            if (r1 != r0) goto L_0x04c9
            r8 = 1
            goto L_0x04c9
        L_0x04c3:
            r1 = move-exception
            java.lang.String r0 = "restore>BackupApiBackupSelector/device unable to access local backup"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0595 }
        L_0x04c9:
            r21.A01()     // Catch:{ all -> 0x0595 }
            X.635 r2 = new X.635     // Catch:{ all -> 0x0595 }
            r2.<init>()     // Catch:{ all -> 0x0595 }
            X.0wU r1 = r6.A0I     // Catch:{ all -> 0x0595 }
            r26 = 2
            X.74p r0 = new X.74p     // Catch:{ all -> 0x0595 }
            r21 = r0
            r22 = r6
            r23 = r5
            r24 = r19
            r25 = r2
            r27 = r9
            r21.<init>(r22, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x0595 }
            r1.Boy(r0)     // Catch:{ all -> 0x0595 }
            java.util.concurrent.locks.ReentrantLock r1 = r2.A02     // Catch:{ InterruptedException -> 0x0505 }
            r1.lockInterruptibly()     // Catch:{ InterruptedException -> 0x0505 }
        L_0x04ee:
            java.lang.Object r0 = r2.A00     // Catch:{ all -> 0x0500 }
            if (r0 != 0) goto L_0x04f8
            java.util.concurrent.locks.Condition r0 = r2.A01     // Catch:{ all -> 0x0500 }
            r0.await()     // Catch:{ all -> 0x0500 }
            goto L_0x04ee
        L_0x04f8:
            r1.unlock()     // Catch:{ InterruptedException -> 0x0505 }
            boolean r6 = X.AnonymousClass000.A1X(r0)     // Catch:{ InterruptedException -> 0x0505 }
            goto L_0x050a
        L_0x0500:
            r0 = move-exception
            r1.unlock()     // Catch:{ InterruptedException -> 0x0505 }
            throw r0     // Catch:{ InterruptedException -> 0x0505 }
        L_0x0505:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x0595 }
            r6 = 0
        L_0x050a:
            r0 = r28
            long r0 = r0.A04     // Catch:{ all -> 0x0595 }
            if (r9 != 0) goto L_0x0544
            r11 = 0
            r2 = 5284(0x14a4, float:7.404E-42)
            boolean r2 = r14.A0E(r2)     // Catch:{ all -> 0x0595 }
            if (r2 == 0) goto L_0x052e
            java.util.Iterator r4 = r18.iterator()     // Catch:{ all -> 0x0595 }
        L_0x051e:
            boolean r2 = r4.hasNext()     // Catch:{ all -> 0x0595 }
            if (r2 == 0) goto L_0x0536
            java.io.File r2 = X.C90504aG.A0a(r4)     // Catch:{ all -> 0x0595 }
            long r2 = r2.length()     // Catch:{ all -> 0x0595 }
            long r11 = r11 + r2
            goto L_0x051e
        L_0x052e:
            java.io.File r2 = r4.A0J()     // Catch:{ all -> 0x0595 }
            long r11 = r2.length()     // Catch:{ all -> 0x0595 }
        L_0x0536:
            r2 = -1
            if (r20 == 0) goto L_0x0542
            java.lang.String r7 = "chatdbSize"
            r4 = r20
            long r2 = r4.optLong(r7, r2)     // Catch:{ all -> 0x0595 }
        L_0x0542:
            long r11 = r11 - r2
            long r0 = r0 + r11
        L_0x0544:
            android.content.SharedPreferences$Editor r3 = X.C19420v0.A00(r10)     // Catch:{ all -> 0x0595 }
            java.lang.String r2 = "gdrive_last_restore_file_is_encrypted"
            X.C36331k8.A0w(r3, r2, r8)     // Catch:{ all -> 0x0595 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0595 }
            java.lang.String r2 = "restore>BackupApiBackupSelector/overwrite local files: "
            r3.append(r2)     // Catch:{ all -> 0x0595 }
            r3.append(r9)     // Catch:{ all -> 0x0595 }
            java.lang.String r2 = ", isEncrypted: "
            X.C36321k7.A1X(r2, r3, r8)     // Catch:{ all -> 0x0595 }
            monitor-enter(r5)     // Catch:{ all -> 0x0595 }
            r2 = r19
            r5.A00 = r2     // Catch:{ all -> 0x056d }
            r5.A00 = r0     // Catch:{ all -> 0x056d }
            r5.A03 = r9     // Catch:{ all -> 0x056d }
            r5.A01 = r6     // Catch:{ all -> 0x056d }
            r5.A02 = r8     // Catch:{ all -> 0x056d }
            monitor-exit(r5)     // Catch:{ all -> 0x0595 }
            goto L_0x058c
        L_0x056d:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0595 }
            throw r0     // Catch:{ all -> 0x0595 }
        L_0x0570:
            r1 = move-exception
            java.lang.String r0 = "restore>BackupApiBackupSelector/one-time-setup/read-storage-permission-withdrawn/exiting"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0595 }
            java.lang.ref.WeakReference r0 = r6.A0J     // Catch:{ all -> 0x0595 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0595 }
            com.whatsapp.backup.google.RestoreFromBackupActivity r0 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r0     // Catch:{ all -> 0x0595 }
            if (r0 == 0) goto L_0x058e
            r0.A3p()     // Catch:{ all -> 0x0595 }
            r0.finish()     // Catch:{ all -> 0x0595 }
            goto L_0x058e
        L_0x0587:
            r0 = move-exception
            com.whatsapp.util.Log.e(r2, r0)     // Catch:{ all -> 0x0595 }
            goto L_0x058e
        L_0x058c:
            r22 = r5
        L_0x058e:
            r1 = 0
            r0 = r39
            r0.set(r1)
            return r22
        L_0x0595:
            r2 = move-exception
            r1 = 0
            r0 = r39
            r0.set(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107095Mn.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass6PR r6 = (AnonymousClass6PR) obj;
        RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) this.A08.get();
        if (restoreFromBackupActivity != null) {
            C18740tg.A01();
            AnonymousClass02E A0N = restoreFromBackupActivity.getSupportFragmentManager().A0N("one-time-setup-taking-too-long");
            if (A0N != null) {
                ((DialogFragment) A0N).A1c();
            }
            if (RestoreFromBackupActivity.A0n(restoreFromBackupActivity)) {
                C36321k7.A1K(r6, "restore>RestoreFromBackupActivity/one-time-setup background task finished but parent activity has already exited, therefore, stopping the task. Data: ", AnonymousClass000.A0u());
            } else {
                restoreFromBackupActivity.A0B = r6;
                if (r6 != null) {
                    restoreFromBackupActivity.A3r((C131006Ni) null, 22);
                    RestoreFromBackupActivity.A0H(r6, restoreFromBackupActivity);
                } else {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("restore>RestoreFromBackupActivity/one-time-setup/num-of-local-backup-files/");
                    C36321k7.A1Y(A0u, restoreFromBackupActivity.A0O.A0C());
                    if (restoreFromBackupActivity.A0O.A0C() <= 0 || !restoreFromBackupActivity.A0y.get()) {
                        C19420v0 r1 = restoreFromBackupActivity.A09;
                        Executor executor = AnonymousClass6Y6.A00;
                        boolean A1U = C36371kC.A1U(C36341k9.A0E(r1), "new_jid");
                        C36321k7.A1X("gdrive-util/is-new-jid/", AnonymousClass000.A0u(), A1U);
                        if (A1U) {
                            RestoreFromBackupActivity.A0J(restoreFromBackupActivity);
                            restoreFromBackupActivity.setResult(1);
                        } else {
                            Log.i("restore>RestoreFromBackupActivity/one-time-setup user is an existing user but has no google drive backups found and no local backups exist either, warn the user.");
                            restoreFromBackupActivity.A0O.A00 = 4;
                            AnonymousClass3L4 r12 = new AnonymousClass3L4(14);
                            C90484aE.A12(restoreFromBackupActivity, r12, R.string.f12nameremoved);
                            r12.A02(false);
                            C90484aE.A11(restoreFromBackupActivity, r12, R.string.f12nameremoved);
                            PromptDialogFragment A0S = C90474aD.A0S(restoreFromBackupActivity, r12, R.string.f12nameremoved);
                            if (!RestoreFromBackupActivity.A0n(restoreFromBackupActivity)) {
                                C90484aE.A19(C36341k9.A0O(restoreFromBackupActivity), A0S, (String) null);
                            }
                        }
                    } else {
                        Log.i("restore>RestoreFromBackupActivity/one-time-setup no google drive backups found but local backup exists.");
                        restoreFromBackupActivity.A0O.A00 = 3;
                        restoreFromBackupActivity.A3r((C131006Ni) null, 23);
                        restoreFromBackupActivity.A3o();
                    }
                }
            }
        }
        Locale locale = Locale.ENGLISH;
        Object[] A0L = AnonymousClass001.A0L();
        C224214g r2 = this.A07;
        C90494aF.A1S(A0L, r2.A00());
        String.format(locale, "Load time: %.2f seconds", A0L);
        r2.A01();
        this.A0A.cancel();
    }

    public C107095Mn(AnonymousClass17Y r3, C33101ei r4, RestoreFromBackupActivity restoreFromBackupActivity, C125065zG r6, AnonymousClass179 r7, C19630wG r8, C19420v0 r9, AnonymousClass1Q9 r10, C21520zN r11, Set set, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, Account[] accountArr) {
        this.A00 = r3;
        this.A0D = accountArr;
        this.A03 = r8;
        this.A0E = r7;
        this.A06 = r11;
        this.A09 = set;
        this.A0C = atomicBoolean;
        this.A08 = AnonymousClass001.A0F(restoreFromBackupActivity);
        this.A05 = r10;
        this.A04 = r9;
        this.A02 = r6;
        this.A0B = atomicBoolean2;
        this.A01 = r4;
    }
}
