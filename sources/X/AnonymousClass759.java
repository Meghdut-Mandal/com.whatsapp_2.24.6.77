package X;

import android.os.Handler;
import androidx.biometric.BiometricFragment;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.759  reason: invalid class name */
public class AnonymousClass759 implements Runnable {
    public Object A00;
    public final int A01;

    public AnonymousClass759(BiometricFragment biometricFragment, int i) {
        this.A01 = i;
        switch (i) {
            case 0:
            case 1:
                this.A00 = biometricFragment;
                return;
            default:
                this.A00 = AnonymousClass001.A0F(biometricFragment);
                return;
        }
    }

    public static void A00(Handler handler, Object obj, int i) {
        handler.post(new AnonymousClass759(obj, i));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, boolean], vars: [r3v42 ?, r3v44 ?, r3v46 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    public void run() {
        /*
            r24 = this;
            r3 = r24
            int r0 = r3.A01
            switch(r0) {
                case 0: goto L_0x0de7;
                case 1: goto L_0x0ddd;
                case 2: goto L_0x0341;
                case 3: goto L_0x032d;
                case 4: goto L_0x0319;
                case 5: goto L_0x0db8;
                case 6: goto L_0x0db0;
                case 7: goto L_0x0d91;
                case 8: goto L_0x02e7;
                case 9: goto L_0x0d89;
                case 10: goto L_0x0355;
                case 11: goto L_0x0d7f;
                case 12: goto L_0x0d70;
                case 13: goto L_0x0d68;
                case 14: goto L_0x01ea;
                case 15: goto L_0x01d7;
                case 16: goto L_0x0ef3;
                case 17: goto L_0x0ce2;
                case 18: goto L_0x0c52;
                case 19: goto L_0x0186;
                case 20: goto L_0x0b63;
                case 21: goto L_0x00e4;
                case 22: goto L_0x0b5b;
                case 23: goto L_0x00da;
                case 24: goto L_0x00cb;
                case 25: goto L_0x0b51;
                case 26: goto L_0x00b2;
                case 27: goto L_0x00a1;
                case 28: goto L_0x0b49;
                case 29: goto L_0x0b40;
                case 30: goto L_0x0b32;
                case 31: goto L_0x0b07;
                case 32: goto L_0x0afd;
                case 33: goto L_0x0af5;
                case 34: goto L_0x0aed;
                case 35: goto L_0x0072;
                case 36: goto L_0x0064;
                case 37: goto L_0x0048;
                case 38: goto L_0x0ae5;
                case 39: goto L_0x0adb;
                case 40: goto L_0x0ad3;
                case 41: goto L_0x0acb;
                case 42: goto L_0x0027;
                case 43: goto L_0x0013;
                case 44: goto L_0x0a6f;
                case 45: goto L_0x094d;
                case 46: goto L_0x0014;
                case 47: goto L_0x0dfd;
                case 48: goto L_0x0917;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r3.A00
            X.4bq r1 = (X.C91334bq) r1
            java.lang.Runnable r0 = r1.A0B
            r1.unscheduleSelf(r0)
            r1.invalidateSelf()
        L_0x0013:
            return
        L_0x0014:
            java.lang.Object r0 = r3.A00
            X.5sC r0 = (X.C120855sC) r0
            X.6Wo r3 = r0.A02
            java.util.concurrent.atomic.AtomicBoolean r2 = r3.A09
            boolean r0 = r2.get()
            if (r0 == 0) goto L_0x0013
            java.lang.Object r1 = r3.A02
            monitor-enter(r1)
            goto L_0x0f0c
        L_0x0027:
            java.lang.Object r2 = r3.A00
            X.9pj r2 = (X.C204269pj) r2
            android.media.ImageReader r0 = r2.A03
            if (r0 == 0) goto L_0x0041
            int r1 = r0.getWidth()
            int r0 = r2.A02
            if (r1 != r0) goto L_0x0041
            android.media.ImageReader r0 = r2.A03
            int r1 = r0.getHeight()
            int r0 = r2.A01
            if (r1 == r0) goto L_0x0013
        L_0x0041:
            X.C204269pj.A01(r2)
            X.C204269pj.A00(r2)
            return
        L_0x0048:
            java.lang.Object r4 = r3.A00
            X.9zu r4 = (X.C209379zu) r4
            X.9za[] r3 = r4.A0H
            int r2 = r3.length
            r1 = 0
        L_0x0050:
            if (r1 >= r2) goto L_0x005a
            r0 = r3[r1]
            r0.A05()
            int r1 = r1 + 1
            goto L_0x0050
        L_0x005a:
            X.9J1 r1 = r4.A0Q
            X.B2h r0 = r1.A00
            if (r0 == 0) goto L_0x0013
            r0 = 0
            r1.A00 = r0
            return
        L_0x0064:
            java.lang.Object r1 = r3.A00
            X.9zu r1 = (X.C209379zu) r1
            boolean r0 = r1.A0F
            if (r0 != 0) goto L_0x0013
            X.7nm r0 = r1.A08
            r0.BUd(r1)
            return
        L_0x0072:
            java.lang.Object r4 = r3.A00
            X.9zu r4 = (X.C209379zu) r4
            boolean r0 = r4.A0F
            if (r0 != 0) goto L_0x0013
            boolean r0 = r4.A0E
            if (r0 != 0) goto L_0x0013
            X.B29 r0 = r4.A07
            if (r0 == 0) goto L_0x0013
            boolean r0 = r4.A0G
            if (r0 == 0) goto L_0x0013
            X.9za[] r5 = r4.A0H
            int r3 = r5.length
            r8 = 0
            r2 = 0
        L_0x008b:
            if (r2 >= r3) goto L_0x103d
            r0 = r5[r2]
            X.9eg r1 = r0.A09
            monitor-enter(r1)
            boolean r0 = r1.A08     // Catch:{ all -> 0x116c }
            if (r0 == 0) goto L_0x0097
            goto L_0x009a
        L_0x0097:
            X.9uY r0 = r1.A07     // Catch:{ all -> 0x116c }
            goto L_0x009b
        L_0x009a:
            r0 = 0
        L_0x009b:
            monitor-exit(r1)
            if (r0 == 0) goto L_0x0013
            int r2 = r2 + 1
            goto L_0x008b
        L_0x00a1:
            java.lang.Object r0 = r3.A00
            X.6LD r0 = (X.AnonymousClass6LD) r0
            android.widget.FrameLayout r2 = r0.A00
            if (r2 == 0) goto L_0x0013
            android.view.ViewParent r1 = r2.getParent()
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0013
            goto L_0x00c2
        L_0x00b2:
            java.lang.Object r0 = r3.A00
            X.6LC r0 = (X.AnonymousClass6LC) r0
            android.widget.FrameLayout r2 = r0.A00
            if (r2 == 0) goto L_0x0013
            android.view.ViewParent r1 = r2.getParent()
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x00c7
        L_0x00c2:
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r1.removeView(r2)
        L_0x00c7:
            r2.removeAllViews()
            return
        L_0x00cb:
            java.lang.Object r3 = r3.A00
            X.6TF r3 = (X.AnonymousClass6TF) r3
            X.6Nn r0 = r3.A03
            if (r0 == 0) goto L_0x0013
            java.lang.Object r2 = r0.A00
            if (r2 == 0) goto L_0x10d4
            monitor-enter(r3)
            goto L_0x10be
        L_0x00da:
            java.lang.Object r2 = r3.A00
            X.7u4 r2 = (X.C165737u4) r2
            X.81G r1 = r2.A0K
            if (r1 == 0) goto L_0x0013
            goto L_0x1102
        L_0x00e4:
            java.lang.Object r7 = r3.A00
            androidx.work.impl.workers.ConstraintTrackingWorker r7 = (androidx.work.impl.workers.ConstraintTrackingWorker) r7
            X.4pl r5 = r7.A02
            boolean r0 = r5.isCancelled()
            if (r0 != 0) goto L_0x0013
            androidx.work.WorkerParameters r3 = r7.A01
            X.6X2 r0 = r3.A01
            java.lang.String r1 = "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME"
            java.util.Map r0 = r0.A00
            java.lang.String r8 = X.C90474aD.A0c(r1, r0)
            X.6VD r6 = X.AnonymousClass6VD.A00()
            X.AnonymousClass00C.A08(r6)
            if (r8 == 0) goto L_0x017e
            int r0 = r8.length()
            if (r0 == 0) goto L_0x017e
            X.6Nd r2 = r3.A04
            android.content.Context r1 = r7.A00
            androidx.work.WorkerParameters r0 = r7.A01
            X.6Ec r0 = r2.A00(r1, r0, r8)
            r7.A00 = r0
            if (r0 != 0) goto L_0x0128
            java.lang.String r1 = X.C112595e9.A00
            java.lang.String r0 = "No worker to delegate to."
            r6.A04(r1, r0)
        L_0x0120:
            X.4ow r0 = X.C97334ow.A00()
        L_0x0124:
            r5.A06(r0)
            return
        L_0x0128:
            X.6VR r9 = X.AnonymousClass6VR.A00(r1)
            X.AnonymousClass00C.A08(r9)
            androidx.work.impl.WorkDatabase r0 = r9.A04
            X.7lt r1 = r0.A0D()
            java.util.UUID r4 = r3.A06
            java.lang.String r0 = X.C36381kD.A0y(r4)
            X.6QA r2 = r1.BJH(r0)
            if (r2 == 0) goto L_0x0120
            X.9L0 r0 = r9.A09
            X.AnonymousClass00C.A08(r0)
            X.9xr r1 = new X.9xr
            r1.<init>(r7, r0)
            java.util.List r0 = X.C36371kC.A11(r2)
            r1.BoB(r0)
            java.lang.String r0 = X.C36381kD.A0y(r4)
            boolean r0 = r1.A00(r0)
            java.lang.String r4 = X.C112595e9.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            if (r0 == 0) goto L_0x016c
            java.lang.String r0 = "Constraints met for delegate "
            r1.append(r0)
            X.AnonymousClass6VD.A03(r6, r8, r4, r1)
            goto L_0x111d
        L_0x016c:
            java.lang.String r0 = "Constraints not met for delegate "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = ". Requesting retry."
            X.AnonymousClass6VD.A03(r6, r0, r4, r1)
            X.4ov r0 = X.C97324ov.A00()
            goto L_0x0124
        L_0x017e:
            java.lang.String r1 = X.C112595e9.A00
            java.lang.String r0 = "No worker to delegate to."
            android.util.Log.e(r1, r0)
            goto L_0x0120
        L_0x0186:
            java.lang.Object r4 = r3.A00
            X.6ik r4 = (X.C138816ik) r4
            java.util.List r1 = r4.A09
            monitor-enter(r1)
            r2 = 0
            java.lang.Object r0 = r1.get(r2)     // Catch:{ all -> 0x1200 }
            android.content.Intent r0 = (android.content.Intent) r0     // Catch:{ all -> 0x1200 }
            r4.A00 = r0     // Catch:{ all -> 0x1200 }
            monitor-exit(r1)     // Catch:{ all -> 0x1200 }
            android.content.Intent r0 = r4.A00
            if (r0 == 0) goto L_0x0013
            java.lang.String r7 = r0.getAction()
            android.content.Intent r1 = r4.A00
            java.lang.String r0 = "KEY_START_ID"
            int r8 = r1.getIntExtra(r0, r2)
            X.6VD r2 = X.AnonymousClass6VD.A00()
            java.lang.String r6 = X.C138816ik.A0A
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Processing command "
            r1.append(r0)
            android.content.Intent r0 = r4.A00
            r1.append(r0)
            java.lang.String r0 = ", "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r8)
            r2.A04(r6, r0)
            android.content.Context r1 = r4.A03
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0v(r7)
            X.C90494aF.A1K(r0, r8)
            java.lang.String r0 = X.C90474aD.A0f(r0)
            android.os.PowerManager$WakeLock r5 = X.AnonymousClass6I2.A00(r1, r0)
            goto L_0x116f
        L_0x01d7:
            java.lang.Object r1 = r3.A00
            androidx.work.CoroutineWorker r1 = (androidx.work.CoroutineWorker) r1
            X.4pl r0 = r1.A00
            boolean r0 = r0.isCancelled()
            if (r0 == 0) goto L_0x0013
            X.03g r1 = r1.A02
            r0 = 0
            r1.B2S(r0)
            return
        L_0x01ea:
            java.lang.Object r3 = r3.A00
            X.65D r3 = (X.AnonymousClass65D) r3
            X.6Q8 r2 = r3.A01
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r2.A08
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r6 = r0.readLock()
            X.AnonymousClass00C.A08(r6)
            r6.lock()
            r4 = 1
            X.7o9 r0 = r2.A0B     // Catch:{ IllegalStateException -> 0x02cf, SQLiteException -> 0x02c4 }
            if (r0 == 0) goto L_0x0212
            X.6iP r0 = (X.C138616iP) r0     // Catch:{ IllegalStateException -> 0x02cf, SQLiteException -> 0x02c4 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ IllegalStateException -> 0x02cf, SQLiteException -> 0x02c4 }
            boolean r0 = r0.isOpen()     // Catch:{ IllegalStateException -> 0x02cf, SQLiteException -> 0x02c4 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalStateException -> 0x02cf, SQLiteException -> 0x02c4 }
        L_0x020d:
            boolean r0 = X.C36371kC.A1X(r0, r4)     // Catch:{ IllegalStateException -> 0x02cf, SQLiteException -> 0x02c4 }
            goto L_0x0214
        L_0x0212:
            r0 = 0
            goto L_0x020d
        L_0x0214:
            if (r0 == 0) goto L_0x1203
            boolean r0 = r3.A0C     // Catch:{ IllegalStateException -> 0x02cf, SQLiteException -> 0x02c4 }
            if (r0 != 0) goto L_0x022b
            X.7o6 r0 = r2.A02()     // Catch:{ IllegalStateException -> 0x02cf, SQLiteException -> 0x02c4 }
            X.6iU r0 = (X.C138666iU) r0     // Catch:{ IllegalStateException -> 0x02cf, SQLiteException -> 0x02c4 }
            X.00T r0 = r0.A04     // Catch:{ IllegalStateException -> 0x02cf, SQLiteException -> 0x02c4 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ IllegalStateException -> 0x02cf, SQLiteException -> 0x02c4 }
            X.4bM r0 = (X.C91044bM) r0     // Catch:{ IllegalStateException -> 0x02cf, SQLiteException -> 0x02c4 }
            r0.A00()     // Catch:{ IllegalStateException -> 0x02cf, SQLiteException -> 0x02c4 }
        L_0x022b:
            boolean r0 = r3.A0C     // Catch:{ IllegalStateException -> 0x02cf, SQLiteException -> 0x02c4 }
            if (r0 != 0) goto L_0x0238
            java.lang.String r1 = "ROOM"
            java.lang.String r0 = "database is not initialized even though it is open"
            android.util.Log.e(r1, r0)     // Catch:{ IllegalStateException -> 0x02cf, SQLiteException -> 0x02c4 }
            goto L_0x1203
        L_0x0238:
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.A04     // Catch:{ IllegalStateException -> 0x02cf, SQLiteException -> 0x02c4 }
            r0 = 0
            boolean r0 = r1.compareAndSet(r4, r0)     // Catch:{ IllegalStateException -> 0x02cf, SQLiteException -> 0x02c4 }
            if (r0 == 0) goto L_0x1203
            android.database.sqlite.SQLiteDatabase r0 = X.AnonymousClass6Q8.A00(r2)     // Catch:{ IllegalStateException -> 0x02cf, SQLiteException -> 0x02c4 }
            boolean r0 = r0.inTransaction()     // Catch:{ IllegalStateException -> 0x02cf, SQLiteException -> 0x02c4 }
            if (r0 != 0) goto L_0x1203
            android.database.sqlite.SQLiteDatabase r5 = X.AnonymousClass6Q8.A00(r2)     // Catch:{ IllegalStateException -> 0x02cf, SQLiteException -> 0x02c4 }
            r5.beginTransactionNonExclusive()     // Catch:{ IllegalStateException -> 0x02cf, SQLiteException -> 0x02c4 }
            X.0k4 r4 = new X.0k4     // Catch:{ all -> 0x02bf }
            r4.<init>()     // Catch:{ all -> 0x02bf }
            java.lang.String r0 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1;"
            X.6iX r1 = new X.6iX     // Catch:{ all -> 0x02bf }
            r1.<init>(r0)     // Catch:{ all -> 0x02bf }
            r2.A04()     // Catch:{ all -> 0x02bf }
            r2.A05()     // Catch:{ all -> 0x02bf }
            X.7o6 r0 = r2.A02()     // Catch:{ all -> 0x02bf }
            X.6iU r0 = (X.C138666iU) r0     // Catch:{ all -> 0x02bf }
            X.00T r0 = r0.A04     // Catch:{ all -> 0x02bf }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x02bf }
            X.4bM r0 = (X.C91044bM) r0     // Catch:{ all -> 0x02bf }
            X.7o9 r0 = r0.A00()     // Catch:{ all -> 0x02bf }
            android.database.Cursor r2 = r0.Bmd(r1)     // Catch:{ all -> 0x02bf }
            r1 = 0
        L_0x027b:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x02b3 }
            if (r0 == 0) goto L_0x0289
            int r0 = r2.getInt(r1)     // Catch:{ all -> 0x02b3 }
            X.AnonymousClass000.A1F(r4, r0)     // Catch:{ all -> 0x02b3 }
            goto L_0x027b
        L_0x0289:
            r2.close()     // Catch:{ all -> 0x02bf }
            X.0k4 r2 = X.AnonymousClass02M.A00(r4)     // Catch:{ all -> 0x02bf }
            boolean r0 = X.C36411kG.A1a(r2)     // Catch:{ all -> 0x02bf }
            if (r0 == 0) goto L_0x02a7
            X.7nk r0 = r3.A0B     // Catch:{ all -> 0x02bf }
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L_0x02ae
            X.7nk r0 = r3.A0B     // Catch:{ all -> 0x02bf }
            if (r0 == 0) goto L_0x02ba
            X.4ok r0 = (X.C97274ok) r0     // Catch:{ all -> 0x02bf }
            android.database.sqlite.SQLiteStatement r0 = r0.A00     // Catch:{ all -> 0x02bf }
            r0.executeUpdateDelete()     // Catch:{ all -> 0x02bf }
        L_0x02a7:
            r5.setTransactionSuccessful()     // Catch:{ all -> 0x02bf }
            r5.endTransaction()     // Catch:{ IllegalStateException -> 0x02cf, SQLiteException -> 0x02c4 }
            goto L_0x02d9
        L_0x02ae:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A09(r1)     // Catch:{ all -> 0x02bf }
            goto L_0x02be
        L_0x02b3:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x02b5 }
        L_0x02b5:
            r1 = move-exception
            X.C05600Qi.A00(r2, r0)     // Catch:{ all -> 0x02bf }
            goto L_0x02be
        L_0x02ba:
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A08(r1)     // Catch:{ all -> 0x02bf }
        L_0x02be:
            throw r1     // Catch:{ all -> 0x02bf }
        L_0x02bf:
            r0 = move-exception
            r5.endTransaction()     // Catch:{ IllegalStateException -> 0x02cf, SQLiteException -> 0x02c4 }
            throw r0     // Catch:{ IllegalStateException -> 0x02cf, SQLiteException -> 0x02c4 }
        L_0x02c4:
            r2 = move-exception
            java.lang.String r1 = "ROOM"
            java.lang.String r0 = "Cannot run invalidation tracker. Is the db closed?"
            android.util.Log.e(r1, r0, r2)     // Catch:{ all -> 0x1224 }
            X.02c r2 = X.C004702c.A00     // Catch:{ all -> 0x1224 }
            goto L_0x02d9
        L_0x02cf:
            r2 = move-exception
            java.lang.String r1 = "ROOM"
            java.lang.String r0 = "Cannot run invalidation tracker. Is the db closed?"
            android.util.Log.e(r1, r0, r2)     // Catch:{ all -> 0x1224 }
            X.02c r2 = X.C004702c.A00     // Catch:{ all -> 0x1224 }
        L_0x02d9:
            r6.unlock()
            boolean r0 = X.C90514aH.A1a(r2)
            if (r0 == 0) goto L_0x0013
            X.00t r2 = r3.A00
            monitor-enter(r2)
            goto L_0x1207
        L_0x02e7:
            java.lang.Object r4 = r3.A00
            androidx.compose.ui.platform.AndroidComposeView r4 = (androidx.compose.ui.platform.AndroidComposeView) r4
            r4.removeCallbacks(r3)
            android.view.MotionEvent r3 = r4.A03
            if (r3 == 0) goto L_0x0013
            r0 = 0
            int r1 = r3.getToolType(r0)
            r2 = 1
            r0 = 3
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)
            int r1 = r3.getActionMasked()
            if (r0 == 0) goto L_0x0307
            r0 = 10
            if (r1 == r0) goto L_0x0013
        L_0x0307:
            if (r1 == r2) goto L_0x0013
            r0 = 7
            if (r1 == r0) goto L_0x0311
            r0 = 9
            r5 = 2
            if (r1 != r0) goto L_0x0312
        L_0x0311:
            r5 = 7
        L_0x0312:
            long r6 = r4.A01
            r8 = 0
            androidx.compose.ui.platform.AndroidComposeView.A05(r3, r4, r5, r6, r8)
            return
        L_0x0319:
            java.lang.Object r1 = r3.A00
            java.lang.ref.Reference r1 = (java.lang.ref.Reference) r1
            java.lang.Object r0 = r1.get()
            if (r0 == 0) goto L_0x0013
            java.lang.Object r1 = r1.get()
            X.7yg r1 = (X.C167717yg) r1
            r0 = 0
            r1.A0M = r0
            return
        L_0x032d:
            java.lang.Object r1 = r3.A00
            java.lang.ref.Reference r1 = (java.lang.ref.Reference) r1
            java.lang.Object r0 = r1.get()
            if (r0 == 0) goto L_0x0013
            java.lang.Object r1 = r1.get()
            X.7yg r1 = (X.C167717yg) r1
            r0 = 0
            r1.A0K = r0
            return
        L_0x0341:
            java.lang.Object r1 = r3.A00
            java.lang.ref.Reference r1 = (java.lang.ref.Reference) r1
            java.lang.Object r0 = r1.get()
            if (r0 == 0) goto L_0x0013
            java.lang.Object r0 = r1.get()
            androidx.biometric.BiometricFragment r0 = (androidx.biometric.BiometricFragment) r0
            r0.A1Z()
            return
        L_0x0355:
            java.lang.Object r6 = r3.A00
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r6 = (androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat) r6
            int[] r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0b
            androidx.compose.ui.platform.AndroidComposeView r5 = r6.A0T
            r4 = 0
            r0 = 1
            r5.BPk(r0)
            boolean r0 = r6.A0o()
            if (r0 == 0) goto L_0x0373
            X.608 r0 = r5.A0i
            X.6WV r1 = r0.A00()
            X.5rw r0 = r6.A08
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0M(r0, r6, r1)
        L_0x0373:
            X.6Pr r0 = r6.A09
            if (r0 == 0) goto L_0x0382
            X.608 r0 = r5.A0i
            X.6WV r1 = r0.A00()
            X.5rw r0 = r6.A08
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0N(r0, r6, r1)
        L_0x0382:
            java.util.Map r21 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0H(r6)
            java.util.List r0 = r6.A0X
            r23 = r0
            java.util.ArrayList r22 = X.C36441kJ.A15(r23)
            r23.clear()
            java.util.Iterator r20 = X.AnonymousClass000.A10(r21)
        L_0x0395:
            boolean r0 = r20.hasNext()
            if (r0 == 0) goto L_0x0834
            int r3 = X.C36341k9.A0A(r20)
            java.util.Map r0 = r6.A0F
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object r2 = r0.get(r1)
            X.5rw r2 = (X.C120705rw) r2
            r0 = r21
            java.lang.Object r0 = r0.get(r1)
            X.5nk r0 = (X.C118355nk) r0
            if (r0 == 0) goto L_0x082d
            X.6WV r1 = r0.A01
            X.72a r0 = r1.A05
            if (r2 != 0) goto L_0x03e3
            java.util.Iterator r7 = r0.iterator()
        L_0x03bf:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0395
            java.util.Map$Entry r2 = X.AnonymousClass000.A11(r7)
            java.lang.Object r2 = r2.getKey()
            X.62Q r3 = X.C114205gq.A0M
            boolean r2 = X.AnonymousClass00C.A0J(r2, r3)
            if (r2 == 0) goto L_0x03bf
            java.lang.Object r2 = X.AnonymousClass5XP.A01(r0, r3)
            int r3 = r1.A02
            java.lang.String r2 = java.lang.String.valueOf(r2)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0Q(r6, r2, r3)
            goto L_0x03bf
        L_0x03e3:
            java.util.Iterator r19 = r0.iterator()
        L_0x03e7:
            r18 = 0
        L_0x03e9:
            boolean r7 = r19.hasNext()
            if (r7 == 0) goto L_0x07fd
            java.util.Map$Entry r16 = X.AnonymousClass000.A11(r19)
            java.lang.Object r7 = r16.getKey()
            X.62Q r8 = X.C114205gq.A08
            boolean r7 = X.AnonymousClass00C.A0J(r7, r8)
            if (r7 != 0) goto L_0x040b
            java.lang.Object r9 = r16.getKey()
            X.62Q r7 = X.C114205gq.A0R
            boolean r7 = X.AnonymousClass00C.A0J(r9, r7)
            if (r7 == 0) goto L_0x042e
        L_0x040b:
            int r10 = r22.size()
            r9 = 0
        L_0x0410:
            if (r9 >= r10) goto L_0x07f3
            r7 = r22
            java.lang.Object r7 = r7.get(r9)
            X.6gs r7 = (X.C137876gs) r7
            int r7 = r7.A04
            if (r7 != r3) goto L_0x07ef
            r7 = r22
            java.lang.Object r10 = r7.get(r9)
            if (r10 == 0) goto L_0x07f3
            r9 = 0
        L_0x0427:
            r7 = r23
            r7.add(r10)
            if (r9 != 0) goto L_0x0445
        L_0x042e:
            java.lang.Object r10 = r16.getValue()
            X.72a r9 = r2.A00
            java.lang.Object r7 = r16.getKey()
            X.62Q r7 = (X.AnonymousClass62Q) r7
            java.lang.Object r7 = X.AnonymousClass5XP.A02(r9, r7)
            boolean r7 = X.AnonymousClass00C.A0J(r10, r7)
            if (r7 == 0) goto L_0x0445
            goto L_0x03e9
        L_0x0445:
            java.lang.Object r10 = r16.getKey()
            X.62Q r11 = X.C114205gq.A0M
            boolean r7 = X.AnonymousClass00C.A0J(r10, r11)
            if (r7 == 0) goto L_0x046c
            X.72a r7 = r2.A00
            java.lang.Object r7 = X.AnonymousClass5XP.A01(r7, r11)
            java.lang.Object r9 = X.AnonymousClass5XP.A01(r0, r11)
            boolean r7 = X.AnonymousClass00C.A0J(r7, r9)
            if (r7 != 0) goto L_0x03e9
            int r8 = r1.A02
            java.lang.String r7 = java.lang.String.valueOf(r9)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0Q(r6, r7, r8)
            goto L_0x03e9
        L_0x046c:
            X.62Q r12 = X.C114205gq.A0E
            boolean r7 = X.AnonymousClass00C.A0J(r10, r12)
            r9 = 8
            if (r7 == 0) goto L_0x048c
            java.lang.Object r8 = r16.getValue()
            X.C90494aF.A10(r8)
            java.lang.String r8 = (java.lang.String) r8
            X.72a r7 = r2.A00
            boolean r7 = X.C1496172a.A00(r7, r12)
            if (r7 == 0) goto L_0x03e9
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0R(r6, r8, r3, r9)
            goto L_0x03e9
        L_0x048c:
            X.62Q r7 = X.C114205gq.A0K
            boolean r7 = X.AnonymousClass00C.A0J(r10, r7)
            if (r7 == 0) goto L_0x0518
            r7 = 1
        L_0x0495:
            r14 = 64
            if (r7 != 0) goto L_0x07d4
            X.62Q r7 = X.C114205gq.A0G
            boolean r7 = X.AnonymousClass00C.A0J(r10, r7)
            if (r7 != 0) goto L_0x07d4
            X.62Q r13 = X.C114205gq.A0J
            boolean r7 = X.AnonymousClass00C.A0J(r10, r13)
            r12 = 4
            if (r7 == 0) goto L_0x0520
            X.72a r8 = r1.A07()
            X.62Q r7 = X.C114205gq.A0H
            java.lang.Object r7 = X.AnonymousClass5XP.A02(r8, r7)
            X.68P r7 = (X.AnonymousClass68P) r7
            if (r7 == 0) goto L_0x07d4
            int r7 = r7.A00
            if (r7 != r12) goto L_0x07d4
            X.72a r7 = r1.A07()
            java.lang.Object r8 = X.AnonymousClass5XP.A02(r7, r13)
            r7 = 1
            boolean r7 = X.C36371kC.A1X(r8, r7)
            if (r7 == 0) goto L_0x06e0
            int r7 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A02(r6, r3)
            android.view.accessibility.AccessibilityEvent r10 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A09(r6, r7, r12)
            X.6gq r9 = r1.A03
            X.6gp r8 = r1.A04
            r7 = 1
            X.6WV r12 = new X.6WV
            r12.<init>(r9, r8, r0, r7)
            X.72a r8 = r12.A07()
            X.62Q r7 = X.C114205gq.A02
            java.lang.Object r7 = X.AnonymousClass5XP.A02(r8, r7)
            java.util.List r7 = (java.util.List) r7
            java.lang.String r8 = ","
            if (r7 == 0) goto L_0x0516
            java.lang.String r9 = X.C109315Xc.A00(r8, r7)
        L_0x04f1:
            X.72a r7 = r12.A07()
            java.lang.Object r7 = X.AnonymousClass5XP.A02(r7, r11)
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L_0x0514
            java.lang.String r8 = X.C109315Xc.A00(r8, r7)
        L_0x0501:
            if (r9 == 0) goto L_0x0506
            r10.setContentDescription(r9)
        L_0x0506:
            if (r8 == 0) goto L_0x050f
            java.util.List r7 = r10.getText()
            r7.add(r8)
        L_0x050f:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0K(r10, r6)
            goto L_0x03e9
        L_0x0514:
            r8 = 0
            goto L_0x0501
        L_0x0516:
            r9 = 0
            goto L_0x04f1
        L_0x0518:
            X.62Q r7 = X.C114205gq.A0P
            boolean r7 = X.AnonymousClass00C.A0J(r10, r7)
            goto L_0x0495
        L_0x0520:
            X.62Q r7 = X.C114205gq.A02
            boolean r7 = X.AnonymousClass00C.A0J(r10, r7)
            if (r7 == 0) goto L_0x0541
            int r11 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A02(r6, r3)
            r10 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)
            java.lang.Object r8 = r16.getValue()
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>"
            java.util.List r7 = X.C90524aI.A0m(r8, r7)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0P(r6, r9, r7, r11, r10)
            goto L_0x03e9
        L_0x0541:
            X.62Q r13 = X.C114205gq.A04
            boolean r7 = X.AnonymousClass00C.A0J(r10, r13)
            java.lang.String r15 = ""
            if (r7 == 0) goto L_0x065b
            X.62Q r12 = X.C114195gp.A0L
            boolean r7 = X.C1496172a.A00(r0, r12)
            if (r7 == 0) goto L_0x0651
            X.72a r7 = r2.A00
            java.lang.Object r11 = X.AnonymousClass5XP.A02(r7, r13)
            X.72L r11 = (X.AnonymousClass72L) r11
            if (r11 != 0) goto L_0x055e
            r11 = r15
        L_0x055e:
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            java.lang.Object r14 = X.AnonymousClass5XP.A02(r0, r13)
            X.72L r14 = (X.AnonymousClass72L) r14
            if (r14 != 0) goto L_0x0569
            r14 = r15
        L_0x0569:
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            java.lang.CharSequence r17 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0D(r14)
            int r10 = r11.length()
            int r9 = r14.length()
            r16 = r10
            if (r10 <= r9) goto L_0x057d
            r16 = r9
        L_0x057d:
            r8 = 0
        L_0x057e:
            r7 = r16
            if (r8 >= r7) goto L_0x058f
            char r13 = r11.charAt(r8)
            char r7 = r14.charAt(r8)
            if (r13 != r7) goto L_0x058f
            int r8 = r8 + 1
            goto L_0x057e
        L_0x058f:
            r15 = 0
        L_0x0590:
            int r7 = r16 - r8
            if (r15 >= r7) goto L_0x05a7
            int r7 = r10 + -1
            int r7 = r7 - r15
            char r13 = r11.charAt(r7)
            int r7 = r9 + -1
            int r7 = r7 - r15
            char r7 = r14.charAt(r7)
            if (r13 != r7) goto L_0x05a7
            int r15 = r15 + 1
            goto L_0x0590
        L_0x05a7:
            int r10 = r10 - r15
            int r10 = r10 - r8
            int r13 = r9 - r15
            int r13 = r13 - r8
            X.6WV r7 = r2.A01
            r16 = r7
            X.72a r7 = r7.A05
            java.util.Map r7 = r7.A02
            r15 = r7
            boolean r7 = r7.containsKey(r12)
            if (r7 == 0) goto L_0x05d2
            X.72a r7 = r16.A07()
            X.62Q r14 = X.C114205gq.A0F
            boolean r7 = X.C1496172a.A00(r7, r14)
            if (r7 != 0) goto L_0x05d2
            X.72a r7 = r1.A07()
            boolean r7 = X.C1496172a.A00(r7, r14)
            r14 = 1
            if (r7 != 0) goto L_0x05d3
        L_0x05d2:
            r14 = 0
        L_0x05d3:
            boolean r7 = r15.containsKey(r12)
            if (r7 == 0) goto L_0x05f0
            X.72a r7 = r16.A07()
            X.62Q r12 = X.C114205gq.A0F
            boolean r7 = X.C1496172a.A00(r7, r12)
            if (r7 == 0) goto L_0x05f0
            X.72a r7 = r1.A07()
            boolean r7 = X.C1496172a.A00(r7, r12)
            r12 = 1
            if (r7 == 0) goto L_0x05f1
        L_0x05f0:
            r12 = 0
        L_0x05f1:
            if (r14 != 0) goto L_0x063d
            if (r12 != 0) goto L_0x063d
            int r9 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A02(r6, r3)
            r7 = 16
            android.view.accessibility.AccessibilityEvent r9 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A09(r6, r9, r7)
            r9.setFromIndex(r8)
            r9.setRemovedCount(r10)
            r9.setAddedCount(r13)
            r9.setBeforeText(r11)
            java.util.List r8 = r9.getText()
            r7 = r17
            r8.add(r7)
        L_0x0614:
            java.lang.String r7 = "android.widget.EditText"
            r9.setClassName(r7)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0K(r9, r6)
            if (r14 != 0) goto L_0x0620
            if (r12 == 0) goto L_0x03e9
        L_0x0620:
            X.62Q r7 = X.C114205gq.A0N
            java.lang.Object r7 = r0.A01(r7)
            X.6TT r7 = (X.AnonymousClass6TT) r7
            long r7 = r7.A00
            int r10 = X.C90494aF.A08(r7)
            r9.setFromIndex(r10)
            int r7 = X.C90474aD.A03(r7)
            r9.setToIndex(r7)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0K(r9, r6)
            goto L_0x03e9
        L_0x063d:
            int r11 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A02(r6, r3)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r7 = r17
            r9 = r8
            android.view.accessibility.AccessibilityEvent r9 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0A(r6, r7, r8, r9, r10, r11)
            goto L_0x0614
        L_0x0651:
            int r10 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A02(r6, r3)
            java.lang.Integer r9 = X.C36361kB.A0j()
            goto L_0x06e8
        L_0x065b:
            X.62Q r11 = X.C114205gq.A0N
            boolean r7 = X.AnonymousClass00C.A0J(r10, r11)
            if (r7 == 0) goto L_0x06a7
            java.lang.Object r7 = X.AnonymousClass5XP.A02(r0, r13)
            X.72L r7 = (X.AnonymousClass72L) r7
            if (r7 == 0) goto L_0x0670
            java.lang.String r7 = r7.A00
            if (r7 == 0) goto L_0x0670
            r15 = r7
        L_0x0670:
            java.lang.Object r7 = r0.A01(r11)
            X.6TT r7 = (X.AnonymousClass6TT) r7
            long r7 = r7.A00
            int r12 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A02(r6, r3)
            int r9 = X.C90494aF.A08(r7)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            int r7 = X.C90474aD.A03(r7)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            int r7 = r15.length()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            java.lang.CharSequence r8 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0D(r15)
            r7 = r6
            android.view.accessibility.AccessibilityEvent r7 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0A(r7, r8, r9, r10, r11, r12)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0K(r7, r6)
            int r7 = r1.A02
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0O(r6, r7)
            goto L_0x03e9
        L_0x06a7:
            boolean r7 = X.AnonymousClass00C.A0J(r10, r8)
            if (r7 != 0) goto L_0x0784
            X.62Q r7 = X.C114205gq.A0R
            boolean r7 = X.AnonymousClass00C.A0J(r10, r7)
            if (r7 != 0) goto L_0x0784
            X.62Q r7 = X.C114205gq.A06
            boolean r7 = X.AnonymousClass00C.A0J(r10, r7)
            if (r7 == 0) goto L_0x06f0
            java.lang.Object r8 = r16.getValue()
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.Boolean"
            X.AnonymousClass00C.A0E(r8, r7)
            boolean r7 = X.AnonymousClass000.A1X(r8)
            if (r7 == 0) goto L_0x06d9
            int r7 = r1.A02
            int r7 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A02(r6, r7)
            android.view.accessibility.AccessibilityEvent r7 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A09(r6, r7, r9)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0K(r7, r6)
        L_0x06d9:
            int r7 = r1.A02
            int r10 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A02(r6, r7)
            goto L_0x06e4
        L_0x06e0:
            int r10 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A02(r6, r3)
        L_0x06e4:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
        L_0x06e8:
            r8 = 0
            r7 = 2048(0x800, float:2.87E-42)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0P(r6, r9, r8, r10, r7)
            goto L_0x03e9
        L_0x06f0:
            X.62Q r9 = X.C114195gp.A03
            boolean r7 = X.AnonymousClass00C.A0J(r10, r9)
            if (r7 == 0) goto L_0x0737
            java.lang.Object r8 = r0.A01(r9)
            java.util.List r8 = (java.util.List) r8
            X.72a r7 = r2.A00
            java.lang.Object r10 = X.AnonymousClass5XP.A02(r7, r9)
            java.util.List r10 = (java.util.List) r10
            if (r10 == 0) goto L_0x0730
            java.util.LinkedHashSet r9 = X.C36441kJ.A17()
            int r7 = r8.size()
            if (r4 >= r7) goto L_0x071c
            r8.get(r4)
            java.lang.String r0 = "getLabel"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x071c:
            java.util.LinkedHashSet r8 = X.C36441kJ.A17()
            int r7 = r10.size()
            if (r4 >= r7) goto L_0x0774
            r10.get(r4)
            java.lang.String r0 = "getLabel"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0730:
            boolean r7 = X.C36401kF.A1a(r8)
            if (r7 == 0) goto L_0x03e9
            goto L_0x0780
        L_0x0737:
            java.lang.Object r7 = r16.getValue()
            boolean r7 = r7 instanceof X.AnonymousClass69I
            if (r7 == 0) goto L_0x0780
            java.lang.Object r10 = r16.getValue()
            java.lang.String r7 = "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>"
            X.AnonymousClass00C.A0E(r10, r7)
            X.69I r10 = (X.AnonymousClass69I) r10
            X.72a r8 = r2.A00
            java.lang.Object r7 = r16.getKey()
            X.62Q r7 = (X.AnonymousClass62Q) r7
            java.lang.Object r9 = X.AnonymousClass5XP.A02(r8, r7)
            if (r10 == r9) goto L_0x03e7
            boolean r7 = r9 instanceof X.AnonymousClass69I
            if (r7 == 0) goto L_0x0780
            java.lang.String r8 = r10.A00
            X.69I r9 = (X.AnonymousClass69I) r9
            java.lang.String r7 = r9.A00
            boolean r7 = X.AnonymousClass00C.A0J(r8, r7)
            if (r7 == 0) goto L_0x0780
            X.00P r8 = r10.A01
            X.00P r7 = r9.A01
            if (r8 != 0) goto L_0x0771
            if (r7 == 0) goto L_0x03e7
            goto L_0x0780
        L_0x0771:
            if (r7 != 0) goto L_0x03e7
            goto L_0x0780
        L_0x0774:
            boolean r7 = r9.containsAll(r8)
            if (r7 == 0) goto L_0x0780
            boolean r7 = r8.containsAll(r9)
            if (r7 != 0) goto L_0x03e7
        L_0x0780:
            r18 = 1
            goto L_0x03e9
        L_0x0784:
            X.6gp r7 = r1.A04
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0L(r7, r6)
            int r10 = r23.size()
            r9 = 0
        L_0x078e:
            if (r9 >= r10) goto L_0x07d2
            r7 = r23
            java.lang.Object r7 = r7.get(r9)
            X.6gs r7 = (X.C137876gs) r7
            int r7 = r7.A04
            if (r7 != r3) goto L_0x07cf
            r7 = r23
            java.lang.Object r10 = r7.get(r9)
            X.6gs r10 = (X.C137876gs) r10
        L_0x07a4:
            X.AnonymousClass00C.A0B(r10)
            java.lang.Object r7 = X.AnonymousClass5XP.A02(r0, r8)
            X.62P r7 = (X.AnonymousClass62P) r7
            r10.A00 = r7
            X.62Q r7 = X.C114205gq.A0R
            java.lang.Object r7 = X.AnonymousClass5XP.A02(r0, r7)
            X.62P r7 = (X.AnonymousClass62P) r7
            r10.A01 = r7
            java.util.List r7 = r10.A05
            boolean r7 = r7.contains(r10)
            if (r7 == 0) goto L_0x03e9
            X.64f r9 = r5.A0Z
            X.02t r8 = r6.A0Y
            X.7NZ r7 = new X.7NZ
            r7.<init>(r6, r10)
            r9.A00(r10, r7, r8)
            goto L_0x03e9
        L_0x07cf:
            int r9 = r9 + 1
            goto L_0x078e
        L_0x07d2:
            r10 = 0
            goto L_0x07a4
        L_0x07d4:
            int r8 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A02(r6, r3)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r14)
            r10 = 0
            r9 = 2048(0x800, float:2.87E-42)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0P(r6, r7, r10, r8, r9)
            int r8 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A02(r6, r3)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0P(r6, r7, r10, r8, r9)
            goto L_0x03e9
        L_0x07ef:
            int r9 = r9 + 1
            goto L_0x0410
        L_0x07f3:
            X.6gs r10 = new X.6gs
            r7 = r23
            r10.<init>(r7, r3)
            r9 = 1
            goto L_0x0427
        L_0x07fd:
            if (r18 != 0) goto L_0x081d
            X.72a r0 = r2.A00
            java.util.Iterator r7 = r0.iterator()
        L_0x0805:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0395
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r7)
            X.72a r2 = r1.A07()
            java.lang.Object r0 = r0.getKey()
            boolean r0 = X.C1496172a.A00(r2, r0)
            if (r0 != 0) goto L_0x0805
        L_0x081d:
            int r3 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A02(r6, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r1 = 0
            r0 = 2048(0x800, float:2.87E-42)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0P(r6, r2, r1, r3, r0)
            goto L_0x0395
        L_0x082d:
            java.lang.String r0 = "no value for specified key"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0834:
            r11 = 0
            X.00a r3 = new X.00a
            r3.<init>(r4)
            X.00a r8 = r6.A04
            java.util.Iterator r10 = r8.iterator()
        L_0x0840:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0889
            int r7 = X.C36341k9.A0A(r10)
            java.util.Map r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0H(r6)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            java.lang.Object r0 = r0.get(r9)
            X.5nk r0 = (X.C118355nk) r0
            if (r0 == 0) goto L_0x0868
            X.6WV r0 = r0.A01
            X.72a r1 = r0.A07()
            X.62Q r0 = X.C114205gq.A0E
            boolean r0 = X.C1496172a.A00(r1, r0)
            if (r0 != 0) goto L_0x0840
        L_0x0868:
            r3.add(r9)
            r2 = 32
            java.util.Map r0 = r6.A0F
            java.lang.Object r0 = r0.get(r9)
            X.5rw r0 = (X.C120705rw) r0
            if (r0 == 0) goto L_0x0887
            X.72a r1 = r0.A00
            if (r1 == 0) goto L_0x0887
            X.62Q r0 = X.C114205gq.A0E
            java.lang.Object r0 = X.AnonymousClass5XP.A02(r1, r0)
            java.lang.String r0 = (java.lang.String) r0
        L_0x0883:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0R(r6, r0, r7, r2)
            goto L_0x0840
        L_0x0887:
            r0 = r11
            goto L_0x0883
        L_0x0889:
            int r2 = r3.A00
            r1 = 0
        L_0x088c:
            if (r1 >= r2) goto L_0x0898
            java.lang.Object[] r0 = r3.A02
            r0 = r0[r1]
            r8.remove(r0)
            int r1 = r1 + 1
            goto L_0x088c
        L_0x0898:
            java.util.Map r7 = r6.A0F
            r7.clear()
            java.util.Map r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0H(r6)
            java.util.Iterator r10 = X.AnonymousClass000.A0y(r0)
        L_0x08a5:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0903
            java.util.Map$Entry r9 = X.AnonymousClass000.A11(r10)
            java.lang.Object r0 = r9.getValue()
            X.5nk r0 = (X.C118355nk) r0
            X.6WV r0 = r0.A01
            X.72a r0 = r0.A07()
            X.62Q r3 = X.C114205gq.A0E
            boolean r0 = X.C1496172a.A00(r0, r3)
            if (r0 == 0) goto L_0x08ea
            java.lang.Object r0 = r9.getKey()
            boolean r0 = r8.add(r0)
            if (r0 == 0) goto L_0x08ea
            java.lang.Object r0 = r9.getKey()
            int r2 = X.AnonymousClass000.A0I(r0)
            r1 = 16
            java.lang.Object r0 = r9.getValue()
            X.5nk r0 = (X.C118355nk) r0
            X.6WV r0 = r0.A01
            X.72a r0 = r0.A05
            java.lang.Object r0 = r0.A01(r3)
            java.lang.String r0 = (java.lang.String) r0
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0R(r6, r0, r2, r1)
        L_0x08ea:
            java.lang.Object r3 = r9.getKey()
            java.lang.Object r0 = r9.getValue()
            X.5nk r0 = (X.C118355nk) r0
            X.6WV r2 = r0.A01
            java.util.Map r1 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0H(r6)
            X.5rw r0 = new X.5rw
            r0.<init>(r2, r1)
            r7.put(r3, r0)
            goto L_0x08a5
        L_0x0903:
            X.608 r0 = r5.A0i
            X.6WV r2 = r0.A00()
            java.util.Map r1 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0H(r6)
            X.5rw r0 = new X.5rw
            r0.<init>(r2, r1)
            r6.A08 = r0
            r6.A0G = r4
            return
        L_0x0917:
            java.lang.Object r5 = r3.A00
            X.6kH r5 = (X.C139646kH) r5
            monitor-enter(r5)
            r0 = 0
            r5.A03 = r0     // Catch:{ all -> 0x094a }
            X.7ie r0 = r5.A06     // Catch:{ all -> 0x094a }
            long r3 = r0.now()     // Catch:{ all -> 0x094a }
            long r0 = r5.A00     // Catch:{ all -> 0x094a }
            long r3 = r3 - r0
            r1 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0945
            X.6kI r1 = r5.A02     // Catch:{ all -> 0x094a }
            if (r1 == 0) goto L_0x093d
            boolean r0 = r1.A08     // Catch:{ all -> 0x094a }
            if (r0 == 0) goto L_0x093f
            X.7kq r0 = r1.A06     // Catch:{ all -> 0x094a }
            if (r0 == 0) goto L_0x093d
            r0.Bho()     // Catch:{ all -> 0x094a }
        L_0x093d:
            monitor-exit(r5)     // Catch:{ all -> 0x094a }
            goto L_0x0949
        L_0x093f:
            X.7ll r0 = r1.A05     // Catch:{ all -> 0x094a }
            r0.clear()     // Catch:{ all -> 0x094a }
            goto L_0x093d
        L_0x0945:
            X.C139646kH.A00(r5)     // Catch:{ all -> 0x094a }
            goto L_0x093d
        L_0x0949:
            return
        L_0x094a:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x094a }
            throw r0
        L_0x094d:
            java.lang.Object r6 = r3.A00
            X.6Wo r6 = (X.C133076Wo) r6
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            int r0 = r1.getPriority()
            r1.setPriority(r0)
            java.lang.String r1 = "LightSharedPreferences.tryLoadSharedPreference"
            java.lang.reflect.Method r0 = X.C000600g.A03
            X.AnonymousClass00h.A01(r1)
            r5 = 1
            java.lang.Object r7 = r6.A02     // Catch:{ all -> 0x0a63 }
            monitor-enter(r7)     // Catch:{ all -> 0x0a63 }
            X.6Me r11 = r6.A01     // Catch:{ all -> 0x0a60 }
            java.util.Map r4 = r6.A05     // Catch:{ all -> 0x0a60 }
            X.004 r0 = r11.A01     // Catch:{ all -> 0x0a60 }
            java.lang.Object r10 = r0.get()     // Catch:{ all -> 0x0a60 }
            java.io.File r10 = (java.io.File) r10     // Catch:{ all -> 0x0a60 }
            boolean r0 = r10.exists()     // Catch:{ all -> 0x0a60 }
            if (r0 == 0) goto L_0x0a54
            java.io.FileInputStream r2 = X.C90524aI.A0U(r10)     // Catch:{ 5UW | ArrayStoreException | IllegalArgumentException -> 0x0a1b, IOException -> 0x0a18 }
            r1 = 512(0x200, float:7.175E-43)
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ 5UW | ArrayStoreException | IllegalArgumentException -> 0x0a1b, IOException -> 0x0a18 }
            r0.<init>(r2, r1)     // Catch:{ 5UW | ArrayStoreException | IllegalArgumentException -> 0x0a1b, IOException -> 0x0a18 }
            java.io.DataInputStream r2 = new java.io.DataInputStream     // Catch:{ 5UW | ArrayStoreException | IllegalArgumentException -> 0x0a1b, IOException -> 0x0a18 }
            r2.<init>(r0)     // Catch:{ 5UW | ArrayStoreException | IllegalArgumentException -> 0x0a1b, IOException -> 0x0a18 }
            int r3 = r2.readUnsignedByte()     // Catch:{ all -> 0x0a0e }
            if (r3 != r5) goto L_0x09fe
            int r0 = r2.readInt()     // Catch:{ all -> 0x0a0e }
            goto L_0x0995
        L_0x0994:
            r0 = r9
        L_0x0995:
            int r9 = r0 + -1
            if (r0 <= 0) goto L_0x09fa
            int r8 = r2.readUnsignedByte()     // Catch:{ all -> 0x0a0e }
            java.lang.String r3 = r2.readUTF()     // Catch:{ all -> 0x0a0e }
            switch(r8) {
                case 0: goto L_0x09af;
                case 1: goto L_0x09ce;
                case 2: goto L_0x09d7;
                case 3: goto L_0x09e0;
                case 4: goto L_0x09e9;
                case 5: goto L_0x09f2;
                case 6: goto L_0x09b8;
                default: goto L_0x09a4;
            }     // Catch:{ all -> 0x0a0e }
        L_0x09a4:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0a0e }
            java.lang.String r0 = "Unsupported type with ordinal: "
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0d(r0, r1, r8)     // Catch:{ all -> 0x0a0e }
            goto L_0x0a0d
        L_0x09af:
            boolean r0 = r2.readBoolean()     // Catch:{ all -> 0x0a0e }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0a0e }
            goto L_0x09f6
        L_0x09b8:
            int r0 = r2.readInt()     // Catch:{ all -> 0x0a0e }
            java.util.HashSet r8 = new java.util.HashSet     // Catch:{ all -> 0x0a0e }
            r8.<init>(r0)     // Catch:{ all -> 0x0a0e }
        L_0x09c1:
            int r1 = r0 + -1
            if (r0 <= 0) goto L_0x09f6
            java.lang.String r0 = r2.readUTF()     // Catch:{ all -> 0x0a0e }
            r8.add(r0)     // Catch:{ all -> 0x0a0e }
            r0 = r1
            goto L_0x09c1
        L_0x09ce:
            int r0 = r2.readInt()     // Catch:{ all -> 0x0a0e }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0a0e }
            goto L_0x09f6
        L_0x09d7:
            long r0 = r2.readLong()     // Catch:{ all -> 0x0a0e }
            java.lang.Long r8 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0a0e }
            goto L_0x09f6
        L_0x09e0:
            float r0 = r2.readFloat()     // Catch:{ all -> 0x0a0e }
            java.lang.Float r8 = java.lang.Float.valueOf(r0)     // Catch:{ all -> 0x0a0e }
            goto L_0x09f6
        L_0x09e9:
            double r0 = r2.readDouble()     // Catch:{ all -> 0x0a0e }
            java.lang.Double r8 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x0a0e }
            goto L_0x09f6
        L_0x09f2:
            java.lang.String r8 = r2.readUTF()     // Catch:{ all -> 0x0a0e }
        L_0x09f6:
            r4.put(r3, r8)     // Catch:{ all -> 0x0a0e }
            goto L_0x0994
        L_0x09fa:
            r2.close()     // Catch:{ 5UW | ArrayStoreException | IllegalArgumentException -> 0x0a1b, IOException -> 0x0a18 }
            goto L_0x0a54
        L_0x09fe:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0a0e }
            java.lang.String r0 = "Expected version 1; got "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r3)     // Catch:{ all -> 0x0a0e }
            X.5UW r1 = new X.5UW     // Catch:{ all -> 0x0a0e }
            r1.<init>(r0)     // Catch:{ all -> 0x0a0e }
        L_0x0a0d:
            throw r1     // Catch:{ all -> 0x0a0e }
        L_0x0a0e:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0a13 }
            goto L_0x0a17
        L_0x0a13:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ 5UW | ArrayStoreException | IllegalArgumentException -> 0x0a1b, IOException -> 0x0a18 }
        L_0x0a17:
            throw r1     // Catch:{ 5UW | ArrayStoreException | IllegalArgumentException -> 0x0a1b, IOException -> 0x0a18 }
        L_0x0a18:
            r9 = move-exception
            r8 = 0
            goto L_0x0a1d
        L_0x0a1b:
            r9 = move-exception
            r8 = 1
        L_0x0a1d:
            java.lang.Class<X.6Me> r4 = X.C130726Me.class
            java.lang.String r3 = "Failed to read or parse SharedPreferences from: %s; Raw file: %s"
            java.lang.Object[] r2 = X.AnonymousClass001.A0M()     // Catch:{ all -> 0x0a49 }
            r1 = 0
            java.lang.String r0 = r10.getAbsolutePath()     // Catch:{ all -> 0x0a49 }
            r2[r1] = r0     // Catch:{ all -> 0x0a49 }
            java.lang.String r0 = r11.A00()     // Catch:{ all -> 0x0a49 }
            r2[r5] = r0     // Catch:{ all -> 0x0a49 }
            boolean r0 = X.C90484aE.A1P()     // Catch:{ all -> 0x0a49 }
            if (r0 == 0) goto L_0x0a43
            java.lang.String r1 = r4.getSimpleName()     // Catch:{ all -> 0x0a49 }
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe((java.lang.String) r3, (java.lang.Object[]) r2)     // Catch:{ all -> 0x0a49 }
            X.AnonymousClass6YR.A09(r1, r0, r9)     // Catch:{ all -> 0x0a49 }
        L_0x0a43:
            if (r8 == 0) goto L_0x0a54
            r10.delete()     // Catch:{ all -> 0x0a49 }
            goto L_0x0a54
        L_0x0a49:
            r2 = move-exception
            r2.addSuppressed(r9)     // Catch:{ all -> 0x0a60 }
            java.lang.String r1 = "LightSharedPreferencesStorage"
            java.lang.String r0 = "Error while logging exception"
            X.AnonymousClass6YR.A09(r1, r0, r2)     // Catch:{ all -> 0x0a60 }
        L_0x0a54:
            monitor-exit(r7)     // Catch:{ all -> 0x0a60 }
            r6.A0A = r5
            java.util.concurrent.CountDownLatch r0 = r6.A07
            r0.countDown()
            X.AnonymousClass00h.A00()
            return
        L_0x0a60:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0a60 }
            throw r0     // Catch:{ all -> 0x0a63 }
        L_0x0a63:
            r1 = move-exception
            r6.A0A = r5
            java.util.concurrent.CountDownLatch r0 = r6.A07
            r0.countDown()
            X.AnonymousClass00h.A00()
            throw r1
        L_0x0a6f:
            java.lang.String r5 = "%s: worker finished; %d workers left"
            java.lang.Object r6 = r3.A00     // Catch:{ all -> 0x0aa8 }
            X.79G r6 = (X.AnonymousClass79G) r6     // Catch:{ all -> 0x0aa8 }
            java.util.concurrent.BlockingQueue r4 = r6.A01     // Catch:{ all -> 0x0aa8 }
            java.lang.Object r0 = r4.poll()     // Catch:{ all -> 0x0aa8 }
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch:{ all -> 0x0aa8 }
            if (r0 == 0) goto L_0x0a83
            r0.run()     // Catch:{ all -> 0x0aa8 }
            goto L_0x0a8c
        L_0x0a83:
            java.lang.Class<X.79G> r2 = X.AnonymousClass79G.class
            java.lang.String r1 = "%s: Worker has nothing to run"
            java.lang.String r0 = r6.A00     // Catch:{ all -> 0x0aa8 }
            X.C132886Vq.A02(r2, r0, r1)     // Catch:{ all -> 0x0aa8 }
        L_0x0a8c:
            java.util.concurrent.atomic.AtomicInteger r0 = r6.A02
            int r3 = r0.decrementAndGet()
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0a9c
            X.AnonymousClass79G.A00(r6)
            return
        L_0x0a9c:
            java.lang.Class<X.79G> r2 = X.AnonymousClass79G.class
            java.lang.String r1 = r6.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            X.C132886Vq.A01(r2, r1, r0, r5)
            return
        L_0x0aa8:
            r4 = move-exception
            java.lang.Object r1 = r3.A00
            X.79G r1 = (X.AnonymousClass79G) r1
            java.util.concurrent.atomic.AtomicInteger r0 = r1.A02
            int r3 = r0.decrementAndGet()
            java.util.concurrent.BlockingQueue r0 = r1.A01
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0abf
            X.AnonymousClass79G.A00(r1)
            throw r4
        L_0x0abf:
            java.lang.Class<X.79G> r2 = X.AnonymousClass79G.class
            java.lang.String r1 = r1.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            X.C132886Vq.A01(r2, r1, r0, r5)
            throw r4
        L_0x0acb:
            java.lang.Object r0 = r3.A00
            X.9pj r0 = (X.C204269pj) r0
            X.C204269pj.A01(r0)
            return
        L_0x0ad3:
            java.lang.Object r0 = r3.A00
            X.9pj r0 = (X.C204269pj) r0
            X.C204269pj.A00(r0)
            return
        L_0x0adb:
            java.lang.Object r0 = r3.A00
            X.A0j r0 = (X.C20952A0j) r0
            android.view.TextureView r0 = r0.A0I
            r0.requestLayout()
            return
        L_0x0ae5:
            java.lang.Object r0 = r3.A00
            X.6NU r0 = (X.AnonymousClass6NU) r0
            X.AnonymousClass6NU.A00(r0)
            return
        L_0x0aed:
            java.lang.Object r0 = r3.A00
            X.7uG r0 = (X.C165857uG) r0
            X.C165857uG.A01(r0)
            return
        L_0x0af5:
            java.lang.Object r0 = r3.A00
            com.bloks.stdlib.components.bkcomponentstextinput.BloksEditText r0 = (com.bloks.stdlib.components.bkcomponentstextinput.BloksEditText) r0
            X.AnonymousClass6X8.A01(r0)
            return
        L_0x0afd:
            java.lang.Object r1 = r3.A00
            X.4ea r1 = (X.C92764ea) r1
            int r0 = r1.A01
            r1.A02(r0)
            return
        L_0x0b07:
            java.lang.Object r3 = r3.A00
            X.5uE r3 = (X.C122055uE) r3
            X.6dD r0 = r3.A00
            r2 = 0
            if (r0 == 0) goto L_0x0b2c
            r4 = 0
            r8 = 3
            r9 = 0
            r11 = 0
            r6 = 0
            r10 = 0
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r4, r6, r8, r9, r10, r11)
            android.view.GestureDetector r0 = r0.A03     // Catch:{ all -> 0x0b22 }
            r0.onTouchEvent(r1)     // Catch:{ all -> 0x0b22 }
            goto L_0x0b27
        L_0x0b22:
            r0 = move-exception
            r1.recycle()
            throw r0
        L_0x0b27:
            r1.recycle()
            r3.A00 = r2
        L_0x0b2c:
            r3.A01 = r2
            r0 = 0
            r3.A02 = r0
            return
        L_0x0b32:
            java.lang.Object r1 = r3.A00
            X.63m r1 = (X.C1263263m) r1
            r1.A00()
            r0 = 0
            r1.A00 = r0
            r0 = 0
            r1.A01 = r0
            return
        L_0x0b40:
            java.lang.Object r1 = r3.A00
            X.6Xh r1 = (X.AnonymousClass6Xh) r1
            r0 = 0
            r1.A09(r0)
            return
        L_0x0b49:
            java.lang.Object r0 = r3.A00
            X.4aa r0 = (X.C90704aa) r0
            X.C90704aa.A00(r0)
            return
        L_0x0b51:
            java.lang.Object r0 = r3.A00
            X.6j8 r0 = (X.C139036j8) r0
            X.4eW r0 = r0.A01
            X.C36341k9.A0y(r0)
            return
        L_0x0b5b:
            java.lang.Object r0 = r3.A00
            java.io.InputStream r0 = (java.io.InputStream) r0
            X.C203079nF.A04(r0)
            return
        L_0x0b63:
            java.lang.Object r3 = r3.A00
            X.6ik r3 = (X.C138816ik) r3
            X.6VD r1 = X.AnonymousClass6VD.A00()
            java.lang.String r4 = X.C138816ik.A0A
            java.lang.String r0 = "Checking if commands are complete."
            r1.A04(r4, r0)
            X.C138816ik.A00()
            java.util.List r5 = r3.A09
            monitor-enter(r5)
            android.content.Intent r0 = r3.A00     // Catch:{ all -> 0x0c4f }
            if (r0 == 0) goto L_0x0ba4
            X.6VD r2 = X.AnonymousClass6VD.A00()     // Catch:{ all -> 0x0c4f }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0c4f }
            java.lang.String r0 = "Removing command "
            r1.append(r0)     // Catch:{ all -> 0x0c4f }
            android.content.Intent r0 = r3.A00     // Catch:{ all -> 0x0c4f }
            java.lang.String r0 = X.AnonymousClass000.A0o(r0, r1)     // Catch:{ all -> 0x0c4f }
            r2.A04(r4, r0)     // Catch:{ all -> 0x0c4f }
            r0 = 0
            java.lang.Object r1 = r5.remove(r0)     // Catch:{ all -> 0x0c4f }
            android.content.Intent r1 = (android.content.Intent) r1     // Catch:{ all -> 0x0c4f }
            android.content.Intent r0 = r3.A00     // Catch:{ all -> 0x0c4f }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0c4f }
            if (r0 == 0) goto L_0x0c45
            r0 = 0
            r3.A00 = r0     // Catch:{ all -> 0x0c4f }
        L_0x0ba4:
            X.7eB r0 = r3.A08     // Catch:{ all -> 0x0c4f }
            X.6iy r0 = (X.C138956iy) r0     // Catch:{ all -> 0x0c4f }
            X.772 r2 = r0.A01     // Catch:{ all -> 0x0c4f }
            X.6ij r0 = r3.A06     // Catch:{ all -> 0x0c4f }
            java.lang.Object r1 = r0.A02     // Catch:{ all -> 0x0c4f }
            monitor-enter(r1)     // Catch:{ all -> 0x0c4f }
            java.util.Map r0 = r0.A03     // Catch:{ all -> 0x0c42 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0c42 }
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            monitor-exit(r1)     // Catch:{ all -> 0x0c42 }
            if (r0 != 0) goto L_0x0c33
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x0c4f }
            if (r0 == 0) goto L_0x0c33
            java.lang.Object r1 = r2.A01     // Catch:{ all -> 0x0c4f }
            monitor-enter(r1)     // Catch:{ all -> 0x0c4f }
            java.util.ArrayDeque r0 = r2.A02     // Catch:{ all -> 0x0c30 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0c30 }
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            monitor-exit(r1)     // Catch:{ all -> 0x0c30 }
            if (r0 != 0) goto L_0x0c33
            X.6VD r1 = X.AnonymousClass6VD.A00()     // Catch:{ all -> 0x0c4f }
            java.lang.String r0 = "No more commands & intents."
            r1.A04(r4, r0)     // Catch:{ all -> 0x0c4f }
            X.7br r6 = r3.A02     // Catch:{ all -> 0x0c4f }
            if (r6 == 0) goto L_0x0c40
            androidx.work.impl.background.systemalarm.SystemAlarmService r6 = (androidx.work.impl.background.systemalarm.SystemAlarmService) r6     // Catch:{ all -> 0x0c4f }
            r0 = 1
            r6.A01 = r0     // Catch:{ all -> 0x0c4f }
            X.6VD r2 = X.AnonymousClass6VD.A00()     // Catch:{ all -> 0x0c4f }
            java.lang.String r1 = androidx.work.impl.background.systemalarm.SystemAlarmService.A02     // Catch:{ all -> 0x0c4f }
            java.lang.String r0 = "All commands completed in dispatcher"
            r2.A04(r1, r0)     // Catch:{ all -> 0x0c4f }
            java.util.LinkedHashMap r2 = X.C36431kI.A1G()     // Catch:{ all -> 0x0c4f }
            X.6Io r1 = X.C129816Io.A00     // Catch:{ all -> 0x0c4f }
            monitor-enter(r1)     // Catch:{ all -> 0x0c4f }
            java.util.WeakHashMap r0 = X.C129816Io.A01     // Catch:{ all -> 0x0c4c }
            r2.putAll(r0)     // Catch:{ all -> 0x0c4c }
            monitor-exit(r1)     // Catch:{ all -> 0x0c4f }
            java.util.Iterator r4 = X.AnonymousClass000.A0y(r2)     // Catch:{ all -> 0x0c4f }
        L_0x0c00:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0c4f }
            if (r0 == 0) goto L_0x0c3d
            java.util.Map$Entry r1 = X.AnonymousClass000.A11(r4)     // Catch:{ all -> 0x0c4f }
            java.lang.Object r0 = r1.getKey()     // Catch:{ all -> 0x0c4f }
            android.os.PowerManager$WakeLock r0 = (android.os.PowerManager.WakeLock) r0     // Catch:{ all -> 0x0c4f }
            java.lang.String r3 = X.C90514aH.A10(r1)     // Catch:{ all -> 0x0c4f }
            r1 = 1
            if (r0 == 0) goto L_0x0c00
            boolean r0 = r0.isHeld()     // Catch:{ all -> 0x0c4f }
            if (r0 != r1) goto L_0x0c00
            X.AnonymousClass6VD.A00()     // Catch:{ all -> 0x0c4f }
            java.lang.String r2 = X.AnonymousClass6I2.A00     // Catch:{ all -> 0x0c4f }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0c4f }
            java.lang.String r0 = "WakeLock held for "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r3, r1)     // Catch:{ all -> 0x0c4f }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x0c4f }
            goto L_0x0c00
        L_0x0c30:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0c30 }
            goto L_0x0c4e
        L_0x0c33:
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x0c4f }
            if (r0 != 0) goto L_0x0c40
            X.C138816ik.A01(r3)     // Catch:{ all -> 0x0c4f }
            goto L_0x0c40
        L_0x0c3d:
            r6.stopSelf()     // Catch:{ all -> 0x0c4f }
        L_0x0c40:
            monitor-exit(r5)     // Catch:{ all -> 0x0c4f }
            return
        L_0x0c42:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0c42 }
            goto L_0x0c4e
        L_0x0c45:
            java.lang.String r0 = "Dequeue-d command is not the first."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ all -> 0x0c4f }
            goto L_0x0c4e
        L_0x0c4c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0c4f }
        L_0x0c4e:
            throw r0     // Catch:{ all -> 0x0c4f }
        L_0x0c4f:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0c4f }
            throw r0
        L_0x0c52:
            java.lang.Object r3 = r3.A00
            X.6iq r3 = (X.C138876iq) r3
            X.69L r9 = r3.A08
            java.lang.String r10 = r9.A01
            int r1 = r3.A00
            r0 = 2
            if (r1 >= r0) goto L_0x0ccf
            r3.A00 = r0
            X.6VD r2 = X.AnonymousClass6VD.A00()
            java.lang.String r8 = X.C138876iq.A0C
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Stopping work for WorkSpec "
            r1.append(r0)
            X.AnonymousClass6VD.A03(r2, r10, r8, r1)
            android.content.Context r11 = r3.A04
            java.lang.Class<androidx.work.impl.background.systemalarm.SystemAlarmService> r7 = androidx.work.impl.background.systemalarm.SystemAlarmService.class
            android.content.Intent r1 = X.C36441kJ.A0H(r11, r7)
            java.lang.String r0 = "ACTION_STOP_WORK"
            r1.setAction(r0)
            X.C138806ij.A00(r1, r9)
            java.util.concurrent.Executor r6 = r3.A09
            X.6ik r5 = r3.A06
            int r4 = r3.A03
            r3 = 4
            X.3wq r0 = new X.3wq
            r0.<init>(r5, r4, r3, r1)
            r6.execute(r0)
            X.6im r0 = r5.A04
            boolean r0 = r0.A05(r10)
            X.6VD r2 = X.AnonymousClass6VD.A00()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            if (r0 == 0) goto L_0x0cc4
            java.lang.String r0 = "WorkSpec "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = " needs to be rescheduled"
            X.AnonymousClass6VD.A03(r2, r0, r8, r1)
            android.content.Intent r1 = X.C36441kJ.A0H(r11, r7)
            java.lang.String r0 = "ACTION_SCHEDULE_WORK"
            r1.setAction(r0)
            X.C138806ij.A00(r1, r9)
            X.3wq r0 = new X.3wq
            r0.<init>(r5, r4, r3, r1)
            r6.execute(r0)
            return
        L_0x0cc4:
            java.lang.String r0 = "Processor does not have WorkSpec "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r10 = ". No need to reschedule"
            goto L_0x0cde
        L_0x0ccf:
            X.6VD r2 = X.AnonymousClass6VD.A00()
            java.lang.String r8 = X.C138876iq.A0C
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Already stopped work for "
            r1.append(r0)
        L_0x0cde:
            X.AnonymousClass6VD.A03(r2, r10, r8, r1)
            return
        L_0x0ce2:
            java.lang.Object r6 = r3.A00
            X.6iq r6 = (X.C138876iq) r6
            int r0 = r6.A00
            if (r0 != 0) goto L_0x0d4f
            r0 = 1
            r6.A00 = r0
            X.6VD r3 = X.AnonymousClass6VD.A00()
            java.lang.String r2 = X.C138876iq.A0C
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "onAllConstraintsMet for "
            r1.append(r0)
            X.69L r7 = r6.A08
            java.lang.String r0 = X.AnonymousClass000.A0o(r7, r1)
            r3.A04(r2, r0)
            X.6ik r3 = r6.A06
            X.6im r2 = r3.A04
            X.5hI r1 = r6.A05
            r0 = 0
            boolean r0 = r2.A04(r0, r1)
            if (r0 == 0) goto L_0x0d4b
            X.6N1 r5 = r3.A07
            java.lang.Object r4 = r5.A01
            monitor-enter(r4)
            X.6VD r3 = X.AnonymousClass6VD.A00()     // Catch:{ all -> 0x0d48 }
            java.lang.String r2 = X.AnonymousClass6N1.A04     // Catch:{ all -> 0x0d48 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0d48 }
            java.lang.String r0 = "Starting timer for "
            X.AnonymousClass6VD.A02(r3, r7, r0, r2, r1)     // Catch:{ all -> 0x0d48 }
            r5.A00(r7)     // Catch:{ all -> 0x0d48 }
            r0 = 20
            X.75C r3 = new X.75C     // Catch:{ all -> 0x0d48 }
            r3.<init>((java.lang.Object) r7, (java.lang.Object) r5, (int) r0)     // Catch:{ all -> 0x0d48 }
            java.util.Map r0 = r5.A03     // Catch:{ all -> 0x0d48 }
            r0.put(r7, r3)     // Catch:{ all -> 0x0d48 }
            java.util.Map r0 = r5.A02     // Catch:{ all -> 0x0d48 }
            r0.put(r7, r6)     // Catch:{ all -> 0x0d48 }
            X.7bq r0 = r5.A00     // Catch:{ all -> 0x0d48 }
            r1 = 600000(0x927c0, double:2.964394E-318)
            X.6ii r0 = (X.C138796ii) r0     // Catch:{ all -> 0x0d48 }
            android.os.Handler r0 = r0.A00     // Catch:{ all -> 0x0d48 }
            r0.postDelayed(r3, r1)     // Catch:{ all -> 0x0d48 }
            monitor-exit(r4)     // Catch:{ all -> 0x0d48 }
            return
        L_0x0d48:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0d48 }
            throw r0
        L_0x0d4b:
            X.C138876iq.A00(r6)
            return
        L_0x0d4f:
            X.6VD r3 = X.AnonymousClass6VD.A00()
            java.lang.String r2 = X.C138876iq.A0C
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Already started work for "
            r1.append(r0)
            X.69L r0 = r6.A08
            java.lang.String r0 = X.AnonymousClass000.A0o(r0, r1)
            r3.A04(r2, r0)
            return
        L_0x0d68:
            java.lang.Object r0 = r3.A00
            X.7zl r0 = (X.C168137zl) r0
            r0.A0M()
            return
        L_0x0d70:
            monitor-enter(r3)
            java.lang.Object r0 = r3.A00     // Catch:{ all -> 0x0d7c }
            androidx.preference.PreferenceGroup r0 = (androidx.preference.PreferenceGroup) r0     // Catch:{ all -> 0x0d7c }
            X.007 r0 = r0.A05     // Catch:{ all -> 0x0d7c }
            r0.clear()     // Catch:{ all -> 0x0d7c }
            monitor-exit(r3)     // Catch:{ all -> 0x0d7c }
            return
        L_0x0d7c:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0d7c }
            throw r0
        L_0x0d7f:
            java.lang.Object r0 = r3.A00
            androidx.preference.PreferenceFragmentCompat r0 = (androidx.preference.PreferenceFragmentCompat) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.A02
            r0.focusableViewAvailable(r0)
            return
        L_0x0d89:
            java.lang.Object r0 = r3.A00
            X.00S r0 = (X.AnonymousClass00S) r0
            r0.invoke()
            return
        L_0x0d91:
            java.lang.Object r3 = r3.A00
            androidx.compose.ui.platform.AndroidComposeView r3 = (androidx.compose.ui.platform.AndroidComposeView) r3
            r0 = 0
            r3.A06 = r0
            android.view.MotionEvent r2 = r3.A03
            X.AnonymousClass00C.A0B(r2)
            int r1 = r2.getActionMasked()
            r0 = 10
            if (r1 != r0) goto L_0x0da9
            androidx.compose.ui.platform.AndroidComposeView.A01(r2, r3)
            return
        L_0x0da9:
            java.lang.String r0 = "The ACTION_HOVER_EXIT event was not cleared."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0db0:
            java.lang.Object r0 = r3.A00
            X.4dW r0 = (X.C92314dW) r0
            X.C92314dW.setRippleState$lambda$2(r0)
            return
        L_0x0db8:
            java.lang.Object r3 = r3.A00
            androidx.biometric.FingerprintDialogFragment r3 = (androidx.biometric.FingerprintDialogFragment) r3
            android.content.Context r2 = r3.A1D()
            if (r2 != 0) goto L_0x0dca
            java.lang.String r1 = "FingerprintFragment"
            java.lang.String r0 = "Not resetting the dialog. Context is null."
            android.util.Log.w(r1, r0)
            return
        L_0x0dca:
            X.7yg r1 = r3.A03
            r0 = 1
            r1.A0T(r0)
            X.7yg r1 = r3.A03
            r0 = 2131896623(0x7f12292f, float:1.9428112E38)
            java.lang.String r0 = r2.getString(r0)
            r1.A0U(r0)
            return
        L_0x0ddd:
            java.lang.Object r0 = r3.A00
            androidx.biometric.BiometricFragment r0 = (androidx.biometric.BiometricFragment) r0
            X.7yg r1 = r0.A01
            r0 = 0
            r1.A0L = r0
            return
        L_0x0de7:
            java.lang.Object r0 = r3.A00
            androidx.biometric.BiometricFragment r0 = (androidx.biometric.BiometricFragment) r0
            X.7yg r2 = r0.A01
            X.3HL r1 = r2.A04
            if (r1 != 0) goto L_0x0df9
            r0 = 0
            X.4Va r1 = new X.4Va
            r1.<init>(r2, r0)
            r2.A04 = r1
        L_0x0df9:
            r1.A00()
            return
        L_0x0dfd:
            java.lang.Object r2 = r3.A00
            X.6LE r2 = (X.AnonymousClass6LE) r2
        L_0x0e01:
            java.util.LinkedList r5 = r2.A04
            monitor-enter(r5)
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x0ef0 }
            if (r0 == 0) goto L_0x0e24
            java.util.concurrent.atomic.AtomicInteger r6 = r2.A05     // Catch:{ all -> 0x0ef0 }
            r6.incrementAndGet()     // Catch:{ all -> 0x0ef0 }
            r0 = 600000(0x927c0, double:2.964394E-318)
            r5.wait(r0)     // Catch:{ InterruptedException -> 0x0e16 }
            goto L_0x0e21
        L_0x0e16:
            java.lang.String r4 = "TaskQueueExecutor"
            java.lang.String r1 = "killed worker after idle"
            java.lang.Object[] r0 = X.C90524aI.A0w()     // Catch:{ all -> 0x0ef0 }
            X.C131916Rh.A01(r4, r1, r0)     // Catch:{ all -> 0x0ef0 }
        L_0x0e21:
            r6.decrementAndGet()     // Catch:{ all -> 0x0ef0 }
        L_0x0e24:
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x0ef0 }
            if (r0 == 0) goto L_0x0e2d
            monitor-exit(r5)     // Catch:{ all -> 0x0ef0 }
            goto L_0x0edf
        L_0x0e2d:
            monitor-exit(r5)     // Catch:{ all -> 0x0ef0 }
            monitor-enter(r5)
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x0eed }
            if (r0 == 0) goto L_0x0e37
            monitor-exit(r5)     // Catch:{ all -> 0x0eed }
            goto L_0x0e01
        L_0x0e37:
            java.util.List r0 = X.AnonymousClass5SY.A00     // Catch:{ all -> 0x0eed }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x0eed }
        L_0x0e3d:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0eed }
            if (r0 == 0) goto L_0x0e6c
            java.lang.Object r4 = r6.next()     // Catch:{ all -> 0x0eed }
            X.5SY r4 = (X.AnonymousClass5SY) r4     // Catch:{ all -> 0x0eed }
            java.util.Iterator r1 = r5.iterator()     // Catch:{ all -> 0x0eed }
        L_0x0e4d:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0eed }
            if (r0 == 0) goto L_0x0e3d
            java.lang.Object r8 = r1.next()     // Catch:{ all -> 0x0eed }
            java.util.Objects.requireNonNull(r8)     // Catch:{ all -> 0x0eed }
            X.69O r8 = (X.AnonymousClass69O) r8     // Catch:{ all -> 0x0eed }
            X.9YW r0 = r8.A00     // Catch:{ all -> 0x0eed }
            X.5SY r0 = r0.A00     // Catch:{ all -> 0x0eed }
            if (r0 != r4) goto L_0x0e4d
            r1.remove()     // Catch:{ all -> 0x0eed }
        L_0x0e65:
            java.util.HashSet r1 = r2.A03     // Catch:{ all -> 0x0eed }
            r1.add(r8)     // Catch:{ all -> 0x0eed }
            monitor-exit(r5)     // Catch:{ all -> 0x0eed }
            goto L_0x0e73
        L_0x0e6c:
            java.lang.Object r8 = r5.removeFirst()     // Catch:{ all -> 0x0eed }
            X.69O r8 = (X.AnonymousClass69O) r8     // Catch:{ all -> 0x0eed }
            goto L_0x0e65
        L_0x0e73:
            r7 = 1
            r4 = 0
            if (r8 == 0) goto L_0x0edf
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.getId()
            X.9YW r6 = r8.A00
            r6.A03()     // Catch:{ all -> 0x0e90 }
            r6.A02()     // Catch:{ all -> 0x0e90 }
            monitor-enter(r5)     // Catch:{ Exception -> 0x0e9a }
            r1.remove(r8)     // Catch:{ all -> 0x0e8d }
            monitor-exit(r5)     // Catch:{ all -> 0x0e8d }
            goto L_0x0dfd
        L_0x0e8d:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0e8d }
            goto L_0x0e99
        L_0x0e90:
            r0 = move-exception
            monitor-enter(r5)     // Catch:{ Exception -> 0x0e9a }
            r1.remove(r8)     // Catch:{ all -> 0x0e97 }
        L_0x0e95:
            monitor-exit(r5)     // Catch:{ all -> 0x0e97 }
            goto L_0x0e99
        L_0x0e97:
            r0 = move-exception
            goto L_0x0e95
        L_0x0e99:
            throw r0     // Catch:{ Exception -> 0x0e9a }
        L_0x0e9a:
            r5 = move-exception
            boolean r0 = r5 instanceof java.io.IOException
            if (r0 == 0) goto L_0x0ece
            java.util.concurrent.atomic.AtomicInteger r1 = r8.A01
            int r0 = r1.decrementAndGet()
            if (r0 < 0) goto L_0x0ece
            X.AnonymousClass6LE.A00(r8, r2, r4)
            java.lang.String r4 = "TaskQueueExecutor"
            java.lang.String r2 = "Task failed. Remain retry %d, %s"
            java.lang.Object[] r1 = X.C36411kG.A1b(r1)
            r1[r7] = r6
            boolean r0 = X.C131916Rh.A00
            if (r0 == 0) goto L_0x0ec1
            java.lang.String r0 = java.lang.String.format(r2, r1)
            android.util.Log.w(r4, r0, r5)
            goto L_0x0dfd
        L_0x0ec1:
            boolean r0 = X.C131916Rh.A01
            if (r0 != 0) goto L_0x0dfd
            java.lang.String r0 = java.lang.String.format(r2, r1)
            android.util.Log.d(r4, r0, r5)
            goto L_0x0dfd
        L_0x0ece:
            java.lang.String r2 = "TaskQueueExecutor"
            java.lang.String r1 = "Task failed on fatal error or exceeded retry limit. %s"
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r4] = r6
            java.lang.String r0 = java.lang.String.format(r1, r0)
            android.util.Log.e(r2, r0, r5)
            goto L_0x0dfd
        L_0x0edf:
            java.lang.Object r1 = r2.A02
            monitor-enter(r1)
            int r0 = r2.A00     // Catch:{ all -> 0x0eea }
            int r0 = r0 + -1
            r2.A00 = r0     // Catch:{ all -> 0x0eea }
            monitor-exit(r1)     // Catch:{ all -> 0x0eea }
            return
        L_0x0eea:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0eea }
            throw r0
        L_0x0eed:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0eed }
            throw r0
        L_0x0ef0:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0ef0 }
            throw r0
        L_0x0ef3:
            java.lang.Object r0 = r3.A00     // Catch:{ all -> 0x0f01 }
            androidx.work.Worker r0 = (androidx.work.Worker) r0     // Catch:{ all -> 0x0f01 }
            X.5Xj r1 = r0.A09()     // Catch:{ all -> 0x0f01 }
            X.4pl r0 = r0.A00     // Catch:{ all -> 0x0f01 }
            r0.A06(r1)     // Catch:{ all -> 0x0f01 }
            return
        L_0x0f01:
            r1 = move-exception
            java.lang.Object r0 = r3.A00
            androidx.work.Worker r0 = (androidx.work.Worker) r0
            X.4pl r0 = r0.A00
            r0.A07(r1)
            return
        L_0x0f0c:
            r0 = 0
            r2.set(r0)     // Catch:{ all -> 0x103a }
            java.util.Map r0 = r3.A05     // Catch:{ all -> 0x103a }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x103a }
            r6.<init>(r0)     // Catch:{ all -> 0x103a }
            monitor-exit(r1)     // Catch:{ all -> 0x103a }
            X.6Me r5 = r3.A01     // Catch:{ IOException -> 0x1031 }
            java.util.Objects.requireNonNull(r6)     // Catch:{ IOException -> 0x1031 }
            X.004 r0 = r5.A01     // Catch:{ IOException -> 0x1031 }
            java.lang.Object r4 = r0.get()     // Catch:{ IOException -> 0x1031 }
            java.io.File r4 = (java.io.File) r4     // Catch:{ IOException -> 0x1031 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x1031 }
            java.lang.String r0 = r4.getName()     // Catch:{ IOException -> 0x1031 }
            r1.append(r0)     // Catch:{ IOException -> 0x1031 }
            java.lang.String r0 = "."
            java.lang.String r2 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ IOException -> 0x1031 }
            java.lang.String r1 = ".tmp"
            java.io.File r0 = r4.getParentFile()     // Catch:{ IOException -> 0x1031 }
            java.io.File r3 = java.io.File.createTempFile(r2, r1, r0)     // Catch:{ IOException -> 0x1031 }
            java.io.FileOutputStream r2 = X.C90524aI.A0W(r3)     // Catch:{ IOException -> 0x1031 }
            r1 = 512(0x200, float:7.175E-43)
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x1031 }
            r0.<init>(r2, r1)     // Catch:{ IOException -> 0x1031 }
            java.io.DataOutputStream r2 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x1031 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x1031 }
            r0 = 1
            r2.writeByte(r0)     // Catch:{ all -> 0x102c }
            int r0 = r6.size()     // Catch:{ all -> 0x102c }
            r2.writeInt(r0)     // Catch:{ all -> 0x102c }
            java.util.Iterator r7 = X.AnonymousClass000.A0y(r6)     // Catch:{ all -> 0x102c }
        L_0x0f5f:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x102c }
            if (r0 == 0) goto L_0x1007
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r7)     // Catch:{ all -> 0x102c }
            java.lang.String r1 = X.C90494aF.A0f(r0)     // Catch:{ all -> 0x102c }
            java.lang.Object r6 = r0.getValue()     // Catch:{ all -> 0x102c }
            boolean r0 = r6 instanceof java.lang.Boolean     // Catch:{ all -> 0x102c }
            if (r0 == 0) goto L_0x0f77
            r0 = 0
            goto L_0x0f9a
        L_0x0f77:
            boolean r0 = r6 instanceof java.lang.Integer     // Catch:{ all -> 0x102c }
            if (r0 == 0) goto L_0x0f7d
            r0 = 1
            goto L_0x0f9a
        L_0x0f7d:
            boolean r0 = r6 instanceof java.lang.Long     // Catch:{ all -> 0x102c }
            if (r0 == 0) goto L_0x0f83
            r0 = 2
            goto L_0x0f9a
        L_0x0f83:
            boolean r0 = r6 instanceof java.lang.Float     // Catch:{ all -> 0x102c }
            if (r0 == 0) goto L_0x0f89
            r0 = 3
            goto L_0x0f9a
        L_0x0f89:
            boolean r0 = r6 instanceof java.lang.Double     // Catch:{ all -> 0x102c }
            if (r0 == 0) goto L_0x0f8f
            r0 = 4
            goto L_0x0f9a
        L_0x0f8f:
            boolean r0 = r6 instanceof java.lang.String     // Catch:{ all -> 0x102c }
            if (r0 == 0) goto L_0x0f95
            r0 = 5
            goto L_0x0f9a
        L_0x0f95:
            boolean r0 = r6 instanceof java.util.Set     // Catch:{ all -> 0x102c }
            if (r0 == 0) goto L_0x0ff2
            r0 = 6
        L_0x0f9a:
            r2.write(r0)     // Catch:{ all -> 0x102c }
            r2.writeUTF(r1)     // Catch:{ all -> 0x102c }
            switch(r0) {
                case 0: goto L_0x0fbe;
                case 1: goto L_0x0fc6;
                case 2: goto L_0x0fce;
                case 3: goto L_0x0fd6;
                case 4: goto L_0x0fe0;
                case 5: goto L_0x0feb;
                default: goto L_0x0fa3;
            }     // Catch:{ all -> 0x102c }
        L_0x0fa3:
            java.util.Set r6 = (java.util.Set) r6     // Catch:{ all -> 0x102c }
            int r0 = r6.size()     // Catch:{ all -> 0x102c }
            r2.writeInt(r0)     // Catch:{ all -> 0x102c }
            java.util.Iterator r1 = r6.iterator()     // Catch:{ all -> 0x102c }
        L_0x0fb0:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x102c }
            if (r0 == 0) goto L_0x0f5f
            java.lang.String r0 = X.AnonymousClass001.A0C(r1)     // Catch:{ all -> 0x102c }
            r2.writeUTF(r0)     // Catch:{ all -> 0x102c }
            goto L_0x0fb0
        L_0x0fbe:
            boolean r0 = X.AnonymousClass000.A1X(r6)     // Catch:{ all -> 0x102c }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x102c }
            goto L_0x0f5f
        L_0x0fc6:
            int r0 = X.C90514aH.A0H(r6)     // Catch:{ all -> 0x102c }
            r2.writeInt(r0)     // Catch:{ all -> 0x102c }
            goto L_0x0f5f
        L_0x0fce:
            long r0 = X.C90524aI.A07(r6)     // Catch:{ all -> 0x102c }
            r2.writeLong(r0)     // Catch:{ all -> 0x102c }
            goto L_0x0f5f
        L_0x0fd6:
            java.lang.Float r6 = (java.lang.Float) r6     // Catch:{ all -> 0x102c }
            float r0 = r6.floatValue()     // Catch:{ all -> 0x102c }
            r2.writeFloat(r0)     // Catch:{ all -> 0x102c }
            goto L_0x0f5f
        L_0x0fe0:
            java.lang.Double r6 = (java.lang.Double) r6     // Catch:{ all -> 0x102c }
            double r0 = r6.doubleValue()     // Catch:{ all -> 0x102c }
            r2.writeDouble(r0)     // Catch:{ all -> 0x102c }
            goto L_0x0f5f
        L_0x0feb:
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x102c }
            r2.writeUTF(r6)     // Catch:{ all -> 0x102c }
            goto L_0x0f5f
        L_0x0ff2:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x102c }
            java.lang.String r0 = "Unsupported type: "
            r1.append(r0)     // Catch:{ all -> 0x102c }
            java.lang.Class r0 = r6.getClass()     // Catch:{ all -> 0x102c }
            r1.append(r0)     // Catch:{ all -> 0x102c }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0b(r1)     // Catch:{ all -> 0x102c }
            throw r0     // Catch:{ all -> 0x102c }
        L_0x1007:
            r2.close()     // Catch:{ IOException -> 0x1031 }
            java.lang.Object r2 = r5.A00     // Catch:{ IOException -> 0x1031 }
            monitor-enter(r2)     // Catch:{ IOException -> 0x1031 }
            boolean r0 = r3.renameTo(r4)     // Catch:{ all -> 0x1029 }
            if (r0 != 0) goto L_0x1027
            boolean r0 = r3.delete()     // Catch:{ all -> 0x1029 }
            if (r0 != 0) goto L_0x1020
            java.lang.String r1 = "LightSharedPreferencesStorage"
            java.lang.String r0 = "Unable to delete temporary preferences file."
            X.AnonymousClass6YR.A07(r1, r0)     // Catch:{ all -> 0x1029 }
        L_0x1020:
            java.lang.String r0 = "Failed to replace the current preference file!"
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ all -> 0x1029 }
            throw r0     // Catch:{ all -> 0x1029 }
        L_0x1027:
            monitor-exit(r2)     // Catch:{ all -> 0x1029 }
            return
        L_0x1029:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x1029 }
            goto L_0x1030
        L_0x102c:
            r0 = move-exception
            r2.close()     // Catch:{ IOException -> 0x1031 }
        L_0x1030:
            throw r0     // Catch:{ IOException -> 0x1031 }
        L_0x1031:
            r2 = move-exception
            java.lang.String r1 = "LightSharedPreferencesImpl"
            java.lang.String r0 = "Commit to disk failed."
            X.AnonymousClass6YR.A0B(r1, r0, r2)
            return
        L_0x103a:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x103a }
            throw r0
        L_0x103d:
            X.9f9 r0 = r4.A0U
            r0.A00()
            X.9za[] r0 = r4.A0H
            int r7 = r0.length
            X.9tK[] r6 = new X.C206389tK[r7]
            boolean[] r0 = new boolean[r7]
            r4.A0K = r0
            boolean[] r0 = new boolean[r7]
            r4.A0I = r0
            boolean[] r0 = new boolean[r7]
            r4.A0J = r0
            X.B29 r0 = r4.A07
            long r0 = r0.BBK()
            r4.A03 = r0
            r5 = 0
        L_0x105c:
            r3 = 1
            if (r5 >= r7) goto L_0x10a2
            X.9za[] r0 = r4.A0H
            r0 = r0[r5]
            X.9eg r1 = r0.A09
            monitor-enter(r1)
            boolean r0 = r1.A08     // Catch:{ all -> 0x116c }
            if (r0 == 0) goto L_0x106b
            goto L_0x106e
        L_0x106b:
            X.9uY r2 = r1.A07     // Catch:{ all -> 0x116c }
            goto L_0x106f
        L_0x106e:
            r2 = 0
        L_0x106f:
            monitor-exit(r1)
            X.9uY[] r1 = new X.C207099uY[r3]
            r1[r8] = r2
            X.9tK r0 = new X.9tK
            r0.<init>(r1)
            r6[r5] = r0
            java.lang.String r2 = r2.A0S
            java.lang.String r1 = X.C203249nb.A05(r2)
            java.lang.String r0 = "video"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x1096
            java.lang.String r1 = X.C203249nb.A05(r2)
            java.lang.String r0 = "audio"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x1096
            r3 = 0
        L_0x1096:
            boolean[] r0 = r4.A0K
            r0[r5] = r3
            boolean r0 = r4.A0A
            r3 = r3 | r0
            r4.A0A = r3
            int r5 = r5 + 1
            goto L_0x105c
        L_0x10a2:
            X.9tN r0 = new X.9tN
            r0.<init>(r6)
            r4.A09 = r0
            r4.A0E = r3
            X.82s r3 = r4.A0R
            long r1 = r4.A03
            X.B29 r0 = r4.A07
            boolean r0 = r0.BN9()
            r3.A07(r1, r0)
            X.7nm r0 = r4.A08
            r0.BdO(r4)
            return
        L_0x10be:
            java.util.Set r0 = r3.A02     // Catch:{ all -> 0x10ff }
            java.util.Iterator r1 = X.C90474aD.A0r(r0)     // Catch:{ all -> 0x10ff }
        L_0x10c4:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x10ff }
            if (r0 == 0) goto L_0x10fd
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x10ff }
            X.7eC r0 = (X.AnonymousClass7eC) r0     // Catch:{ all -> 0x10ff }
            r0.onResult(r2)     // Catch:{ all -> 0x10ff }
            goto L_0x10c4
        L_0x10d4:
            java.lang.Throwable r2 = r0.A01
            monitor-enter(r3)
            java.util.Set r0 = r3.A01     // Catch:{ all -> 0x10ff }
            java.util.ArrayList r1 = X.C36441kJ.A15(r0)     // Catch:{ all -> 0x10ff }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x10ff }
            if (r0 == 0) goto L_0x10e9
            java.lang.String r0 = "Lottie encountered an error but no failure listener was added:"
            X.AnonymousClass6GP.A01(r0, r2)     // Catch:{ all -> 0x10ff }
            goto L_0x10fd
        L_0x10e9:
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x10ff }
        L_0x10ed:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x10ff }
            if (r0 == 0) goto L_0x10fd
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x10ff }
            X.7eC r0 = (X.AnonymousClass7eC) r0     // Catch:{ all -> 0x10ff }
            r0.onResult(r2)     // Catch:{ all -> 0x10ff }
            goto L_0x10ed
        L_0x10fd:
            monitor-exit(r3)
            return
        L_0x10ff:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x1102:
            java.util.concurrent.Semaphore r0 = r2.A0d     // Catch:{ InterruptedException -> 0x1110, all -> 0x1116 }
            r0.acquire()     // Catch:{ InterruptedException -> 0x1110, all -> 0x1116 }
            X.7tl r0 = r2.A0b     // Catch:{ InterruptedException -> 0x1110, all -> 0x1116 }
            float r0 = r0.A00()     // Catch:{ InterruptedException -> 0x1110, all -> 0x1116 }
            r1.A0A(r0)     // Catch:{ InterruptedException -> 0x1110, all -> 0x1116 }
        L_0x1110:
            java.util.concurrent.Semaphore r0 = r2.A0d
            r0.release()
            return
        L_0x1116:
            r1 = move-exception
            java.util.concurrent.Semaphore r0 = r2.A0d
            r0.release()
            throw r1
        L_0x111d:
            X.6Ec r0 = r7.A00     // Catch:{ all -> 0x1136 }
            X.AnonymousClass00C.A0B(r0)     // Catch:{ all -> 0x1136 }
            X.0sD r2 = r0.A06()     // Catch:{ all -> 0x1136 }
            X.AnonymousClass00C.A08(r2)     // Catch:{ all -> 0x1136 }
            r0 = 22
            X.75C r1 = new X.75C     // Catch:{ all -> 0x1136 }
            r1.<init>((java.lang.Object) r7, (java.lang.Object) r2, (int) r0)     // Catch:{ all -> 0x1136 }
            java.util.concurrent.Executor r0 = r3.A07     // Catch:{ all -> 0x1136 }
            r2.B0P(r1, r0)     // Catch:{ all -> 0x1136 }
            return
        L_0x1136:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Delegated worker "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " threw exception in startWork."
            java.lang.String r2 = X.AnonymousClass000.A0q(r0, r1)
            int r1 = r6.A00
            r0 = 3
            if (r1 > r0) goto L_0x1151
            android.util.Log.d(r4, r2, r3)
        L_0x1151:
            java.lang.Object r1 = r7.A03
            monitor-enter(r1)
            boolean r0 = r7.A04     // Catch:{ all -> 0x116c }
            if (r0 == 0) goto L_0x1165
            java.lang.String r0 = "Constraints were unmet, Retrying."
            r6.A04(r4, r0)     // Catch:{ all -> 0x116c }
            X.4ov r0 = X.C97324ov.A00()     // Catch:{ all -> 0x116c }
        L_0x1161:
            r5.A06(r0)     // Catch:{ all -> 0x116c }
            goto L_0x116a
        L_0x1165:
            X.4ow r0 = X.C97334ow.A00()     // Catch:{ all -> 0x116c }
            goto L_0x1161
        L_0x116a:
            monitor-exit(r1)
            return
        L_0x116c:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x116f:
            X.6VD r2 = X.AnonymousClass6VD.A00()     // Catch:{ all -> 0x118f }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x118f }
            java.lang.String r0 = "Acquiring operation wake lock ("
            r1.append(r0)     // Catch:{ all -> 0x118f }
            r1.append(r7)     // Catch:{ all -> 0x118f }
            java.lang.String r3 = ") "
            X.AnonymousClass6VD.A02(r2, r5, r3, r6, r1)     // Catch:{ all -> 0x118f }
            r5.acquire()     // Catch:{ all -> 0x118f }
            X.6ij r1 = r4.A06     // Catch:{ all -> 0x118f }
            android.content.Intent r0 = r4.A00     // Catch:{ all -> 0x118f }
            r1.A01(r0, r4, r8)     // Catch:{ all -> 0x118f }
            goto L_0x11ae
        L_0x118f:
            r1 = move-exception
            X.AnonymousClass6VD.A00()     // Catch:{ all -> 0x11d6 }
            java.lang.String r0 = "Unexpected error in onHandleIntent"
            android.util.Log.e(r6, r0, r1)     // Catch:{ all -> 0x11d6 }
            X.6VD r2 = X.AnonymousClass6VD.A00()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Releasing operation wake lock ("
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ") "
            r1.append(r0)
            goto L_0x11bb
        L_0x11ae:
            X.6VD r2 = X.AnonymousClass6VD.A00()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Releasing operation wake lock ("
            X.AnonymousClass000.A1D(r0, r7, r3, r1)
        L_0x11bb:
            java.lang.String r0 = X.AnonymousClass000.A0o(r5, r1)
            r2.A04(r6, r0)
            r5.release()
            X.7eB r0 = r4.A08
            X.6iy r0 = (X.C138956iy) r0
            java.util.concurrent.Executor r2 = r0.A02
            r1 = 20
            X.759 r0 = new X.759
            r0.<init>((X.C138816ik) r4, (int) r1)
            r2.execute(r0)
            return
        L_0x11d6:
            r3 = move-exception
            X.6VD r2 = X.AnonymousClass6VD.A00()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Releasing operation wake lock ("
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ") "
            X.AnonymousClass6VD.A02(r2, r5, r0, r6, r1)
            r5.release()
            X.7eB r0 = r4.A08
            X.6iy r0 = (X.C138956iy) r0
            java.util.concurrent.Executor r2 = r0.A02
            r1 = 20
            X.759 r0 = new X.759
            r0.<init>((X.C138816ik) r4, (int) r1)
            r2.execute(r0)
            throw r3
        L_0x1200:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x1200 }
            throw r0
        L_0x1203:
            r6.unlock()
            return
        L_0x1207:
            java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x1221 }
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x1221 }
            if (r0 == 0) goto L_0x121f
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r1)     // Catch:{ all -> 0x1221 }
            r0.getValue()     // Catch:{ all -> 0x1221 }
            java.lang.String r0 = "notifyByTableInvalidStatus$room_runtime_release"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)     // Catch:{ all -> 0x1221 }
            throw r0     // Catch:{ all -> 0x1221 }
        L_0x121f:
            monitor-exit(r2)
            return
        L_0x1221:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x1224:
            r0 = move-exception
            r6.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass759.run():void");
    }

    public AnonymousClass759(C138816ik r1, int i) {
        this.A01 = i;
        if (19 - i != 0) {
            this.A00 = r1;
        } else {
            this.A00 = r1;
        }
    }

    public AnonymousClass759(C209379zu r1, int i) {
        this.A01 = i;
        switch (i) {
            case 35:
            case 36:
                this.A00 = r1;
                return;
            default:
                this.A00 = r1;
                return;
        }
    }

    public AnonymousClass759(C167717yg r2, int i) {
        this.A01 = i;
        this.A00 = AnonymousClass001.A0F(r2);
    }

    public AnonymousClass759(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public AnonymousClass759(AndroidComposeView androidComposeView, int i) {
        this.A01 = i;
        if (7 - i != 0) {
            this.A00 = androidComposeView;
        } else {
            this.A00 = androidComposeView;
        }
    }
}
