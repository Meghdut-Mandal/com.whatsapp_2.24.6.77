package X;

import com.whatsapp.companiondevice.LinkedDevicesSharedViewModel;

/* renamed from: X.751  reason: invalid class name */
public class AnonymousClass751 implements Runnable {
    public Object A00;
    public String A01;
    public final int A02;

    public AnonymousClass751(int i, String str, Object obj) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: X.6Dt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: X.6Dt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v145, resolved type: X.6Dt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: X.6Dt} */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x04cb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x04cf, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x04d2, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x04d3, code lost:
        X.C05600Qi.A00(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x04d6, code lost:
        throw r1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r21 = this;
            r3 = r21
            int r0 = r3.A02
            switch(r0) {
                case 0: goto L_0x021e;
                case 1: goto L_0x0008;
                case 2: goto L_0x0007;
                case 3: goto L_0x0007;
                case 4: goto L_0x0007;
                case 5: goto L_0x0041;
                case 6: goto L_0x0066;
                case 7: goto L_0x008b;
                case 8: goto L_0x02a9;
                case 9: goto L_0x02b6;
                case 10: goto L_0x02ce;
                case 11: goto L_0x02ea;
                case 12: goto L_0x02f6;
                case 13: goto L_0x0322;
                case 14: goto L_0x033e;
                case 15: goto L_0x00b0;
                case 16: goto L_0x03c6;
                case 17: goto L_0x03e3;
                case 18: goto L_0x00c1;
                case 19: goto L_0x03ee;
                case 20: goto L_0x00e4;
                case 21: goto L_0x0150;
                case 22: goto L_0x040a;
                case 23: goto L_0x04d7;
                case 24: goto L_0x04ea;
                case 25: goto L_0x015c;
                case 26: goto L_0x04f7;
                case 27: goto L_0x0526;
                case 28: goto L_0x055d;
                case 29: goto L_0x057c;
                case 30: goto L_0x0586;
                case 31: goto L_0x0174;
                case 32: goto L_0x0189;
                case 33: goto L_0x0590;
                case 34: goto L_0x059c;
                case 35: goto L_0x05a6;
                case 36: goto L_0x0732;
                case 37: goto L_0x0740;
                case 38: goto L_0x07c0;
                case 39: goto L_0x01a6;
                case 40: goto L_0x07ca;
                case 41: goto L_0x01dd;
                case 42: goto L_0x01f5;
                case 43: goto L_0x08d1;
                case 44: goto L_0x07eb;
                case 45: goto L_0x07f9;
                case 46: goto L_0x081c;
                case 47: goto L_0x0886;
                case 48: goto L_0x0899;
                case 49: goto L_0x08be;
                default: goto L_0x0007;
            }
        L_0x0007:
            return
        L_0x0008:
            java.lang.Object r4 = r3.A00
            X.6il r4 = (X.C138826il) r4
            X.6VR r0 = r4.A00
            X.6im r5 = r0.A03
            java.lang.String r1 = r3.A01
            java.lang.Object r2 = r5.A0A
            monitor-enter(r2)
            java.util.Map r0 = r5.A05     // Catch:{ all -> 0x08f0 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x08f0 }
            X.758 r0 = (X.AnonymousClass758) r0     // Catch:{ all -> 0x08f0 }
            if (r0 != 0) goto L_0x002b
            java.util.Map r0 = r5.A04     // Catch:{ all -> 0x08f0 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x08f0 }
            X.758 r0 = (X.AnonymousClass758) r0     // Catch:{ all -> 0x08f0 }
            if (r0 != 0) goto L_0x002b
            r3 = 0
            goto L_0x002d
        L_0x002b:
            X.6QA r3 = r0.A08     // Catch:{ all -> 0x08f0 }
        L_0x002d:
            monitor-exit(r2)     // Catch:{ all -> 0x08f0 }
            if (r3 == 0) goto L_0x0007
            X.6Tb r1 = X.C132316Tb.A08
            X.6Tb r0 = r3.A09
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0007
            java.lang.Object r2 = r4.A06
            monitor-enter(r2)
            goto L_0x08d8
        L_0x0041:
            java.lang.Object r0 = r3.A00
            X.9PG r0 = (X.AnonymousClass9PG) r0
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A00
            java.util.Iterator r4 = r0.iterator()
        L_0x004b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0007
            r4.next()
            java.lang.String r2 = r3.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Camera Lifecycle: onOpen productName="
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r2, r1)
            java.lang.String r0 = "Camera1Lifecycle"
            android.util.Log.d(r0, r1)
            goto L_0x004b
        L_0x0066:
            java.lang.Object r0 = r3.A00
            X.9PG r0 = (X.AnonymousClass9PG) r0
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A00
            java.util.Iterator r4 = r0.iterator()
        L_0x0070:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0007
            r4.next()
            java.lang.String r2 = r3.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Camera Lifecycle: onRelease productName="
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r2, r1)
            java.lang.String r0 = "Camera1Lifecycle"
            android.util.Log.d(r0, r1)
            goto L_0x0070
        L_0x008b:
            java.lang.Object r0 = r3.A00
            X.9PG r0 = (X.AnonymousClass9PG) r0
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A00
            java.util.Iterator r4 = r0.iterator()
        L_0x0095:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0007
            r4.next()
            java.lang.String r2 = r3.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Camera Lifecycle: "
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r2, r1)
            java.lang.String r0 = "Camera1Lifecycle"
            android.util.Log.d(r0, r1)
            goto L_0x0095
        L_0x00b0:
            java.lang.Object r2 = r3.A00
            com.whatsapp.backup.google.RestoreFromBackupActivity r2 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r2
            java.lang.String r1 = r3.A01
            r0 = 1
            boolean r0 = com.whatsapp.backup.google.RestoreFromBackupActivity.A0p(r2, r1, r0)
            if (r0 == 0) goto L_0x0007
            com.whatsapp.backup.google.RestoreFromBackupActivity.A0K(r2)
            return
        L_0x00c1:
            java.lang.Object r4 = r3.A00
            com.whatsapp.backup.google.RestoreFromBackupActivity r4 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r4
            java.lang.String r3 = r3.A01
            r0 = 2131430492(0x7f0b0c5c, float:1.8482686E38)
            android.widget.TextView r2 = X.C36401kF.A0H(r4, r0)
            r0 = 2131428433(0x7f0b0451, float:1.847851E38)
            android.view.View r1 = X.C03570Gk.A0B(r4, r0)
            boolean r0 = com.whatsapp.backup.google.RestoreFromBackupActivity.A0n(r4)
            if (r0 != 0) goto L_0x0007
            r2.setText(r3)
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x00e4:
            java.lang.Object r8 = r3.A00
            X.5ua r8 = (X.C122275ua) r8
            java.lang.String r6 = r3.A01
            X.6KD r5 = r8.A02
            monitor-enter(r5)
            X.C18740tg.A00()     // Catch:{ all -> 0x08ff }
            X.00T r7 = r5.A01     // Catch:{ all -> 0x08ff }
            java.util.Map r0 = X.C90514aH.A16(r7)     // Catch:{ all -> 0x08ff }
            java.lang.Object r9 = r0.get(r6)     // Catch:{ all -> 0x08ff }
            if (r9 != 0) goto L_0x0104
            java.util.ArrayDeque r9 = new java.util.ArrayDeque     // Catch:{ all -> 0x08ff }
            r9.<init>()     // Catch:{ all -> 0x08ff }
            r0.put(r6, r9)     // Catch:{ all -> 0x08ff }
        L_0x0104:
            java.util.Queue r9 = (java.util.Queue) r9     // Catch:{ all -> 0x08ff }
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x08ff }
        L_0x010a:
            boolean r0 = r9.isEmpty()     // Catch:{ all -> 0x08ff }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x012b
            java.lang.Object r2 = r9.peek()     // Catch:{ all -> 0x08ff }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x08ff }
            if (r2 == 0) goto L_0x012b
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
            long r3 = r10 - r0
            long r1 = r2.longValue()     // Catch:{ all -> 0x08ff }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x012b
            r9.poll()     // Catch:{ all -> 0x08ff }
            goto L_0x010a
        L_0x012b:
            java.lang.Long r0 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x08ff }
            r9.add(r0)     // Catch:{ all -> 0x08ff }
            java.util.Map r0 = X.C90514aH.A16(r7)     // Catch:{ all -> 0x08ff }
            r0.put(r6, r9)     // Catch:{ all -> 0x08ff }
            X.AnonymousClass6KD.A00(r5)     // Catch:{ all -> 0x08ff }
            int r1 = r9.size()     // Catch:{ all -> 0x08ff }
            monitor-exit(r5)
            r0 = 10
            if (r1 < r0) goto L_0x0007
            X.0wN r2 = r8.A00
            java.lang.String r1 = "excessive-wakeup"
            r0 = 0
            r2.A0E(r1, r6, r0)
            monitor-enter(r5)
            goto L_0x08f3
        L_0x0150:
            java.lang.Object r0 = r3.A00
            X.AI7 r0 = (X.AI7) r0
            X.1cK r0 = r0.A00
            if (r0 == 0) goto L_0x0007
            r0.BYZ()
            return
        L_0x015c:
            java.lang.Object r3 = r3.A00
            X.54w r3 = (X.C1033354w) r3
            java.lang.String r2 = "daily_cron_job"
            r1 = 0
            boolean r0 = r3.A0G()
            if (r0 == 0) goto L_0x016f
            boolean r0 = r3.A0H()
            if (r0 != 0) goto L_0x0007
        L_0x016f:
            r0 = 1
            r3.A0F(r1, r2, r0)
            return
        L_0x0174:
            java.lang.Object r0 = r3.A00
            X.6YM r0 = (X.AnonymousClass6YM) r0
            java.lang.String r1 = r3.A01
            X.0wQ r0 = r0.A29
            if (r0 == 0) goto L_0x0007
            r0.A0G()
            X.142 r0 = r0.A0E
            if (r0 == 0) goto L_0x0007
            com.whatsapp.voipcalling.Voip.timeoutPendingCall(r1)
            return
        L_0x0189:
            java.lang.Object r0 = r3.A00
            X.6rs r0 = (X.C144246rs) r0
            java.lang.String r4 = r3.A01
            X.6YT r1 = r0.A00
            X.3Pk r2 = r1.A0t
            r5 = 1
            r7 = 0
            r3 = 0
            r6 = 1
            boolean r0 = r2.A02(r3, r4, r5, r6, r7)
            if (r0 != 0) goto L_0x0007
            X.17Y r1 = r1.A0a
            r0 = 2131888324(0x7f1208c4, float:1.941128E38)
            r1.A06(r0, r5)
            return
        L_0x01a6:
            java.lang.Object r4 = r3.A00
            com.whatsapp.contact.picker.ContactPickerFragment r4 = (com.whatsapp.contact.picker.ContactPickerFragment) r4
            java.lang.String r1 = r3.A01
            X.1YI r0 = r4.A2M     // Catch:{ 1YJ -> 0x0902 }
            X.37a r3 = r0.A00(r1)     // Catch:{ 1YJ -> 0x0902 }
            java.util.ArrayList r2 = r3.A01
            int r0 = r2.size()
            r1 = 1
            if (r0 <= r1) goto L_0x01c7
            r4.A2k = r2
            java.util.HashSet r1 = r4.A3l
            r0 = 14
        L_0x01c1:
            X.AnonymousClass000.A1F(r1, r0)
            r4.A02 = r0
            return
        L_0x01c7:
            int r0 = r2.size()
            if (r0 != r1) goto L_0x0007
            java.lang.Object r0 = X.C36441kJ.A12(r2)
            java.lang.String r0 = (java.lang.String) r0
            r4.A2f = r0
            java.lang.String r0 = r3.A00
            r4.A2g = r0
            java.util.HashSet r1 = r4.A3l
            r0 = 4
            goto L_0x01c1
        L_0x01dd:
            java.lang.Object r0 = r3.A00
            X.2jV r0 = (X.C49672jV) r0
            java.lang.String r1 = r3.A01
            java.lang.ref.WeakReference r0 = r0.A05
            java.lang.Object r0 = r0.get()
            X.3Gp r0 = (X.C62553Gp) r0
            if (r0 == 0) goto L_0x0007
            r0.A01 = r1
            X.4Pp r0 = r0.A02
            r0.BYh()
            return
        L_0x01f5:
            java.lang.Object r4 = r3.A00
            X.2H1 r4 = (X.AnonymousClass2H1) r4
            java.lang.String r3 = r3.A01
            com.whatsapp.voipcalling.CallInfo r2 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r2 == 0) goto L_0x0213
            com.whatsapp.voipcalling.CallState r1 = r2.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x0213
            java.lang.String r0 = r2.callId
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0007
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r1 != r0) goto L_0x0007
        L_0x0213:
            X.1Pj r1 = r4.A07
            r0 = 0
            X.AnonymousClass00C.A0D(r3, r0)
            r0 = 2
            X.C27701Pj.A00(r1, r3, r0)
            return
        L_0x021e:
            java.lang.Object r6 = r3.A00     // Catch:{ CancellationException -> 0x0280, InterruptedException | ExecutionException -> 0x0267 }
            X.758 r6 = (X.AnonymousClass758) r6     // Catch:{ CancellationException -> 0x0280, InterruptedException | ExecutionException -> 0x0267 }
            X.4pl r0 = r6.A0F     // Catch:{ CancellationException -> 0x0280, InterruptedException | ExecutionException -> 0x0267 }
            java.lang.Object r5 = r0.get()     // Catch:{ CancellationException -> 0x0280, InterruptedException | ExecutionException -> 0x0267 }
            X.5Xj r5 = (X.C109385Xj) r5     // Catch:{ CancellationException -> 0x0280, InterruptedException | ExecutionException -> 0x0267 }
            if (r5 != 0) goto L_0x0246
            X.AnonymousClass6VD.A00()     // Catch:{ CancellationException -> 0x0280, InterruptedException | ExecutionException -> 0x0267 }
            java.lang.String r2 = X.AnonymousClass758.A0I     // Catch:{ CancellationException -> 0x0280, InterruptedException | ExecutionException -> 0x0267 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ CancellationException -> 0x0280, InterruptedException | ExecutionException -> 0x0267 }
            X.6QA r0 = r6.A08     // Catch:{ CancellationException -> 0x0280, InterruptedException | ExecutionException -> 0x0267 }
            java.lang.String r0 = r0.A0G     // Catch:{ CancellationException -> 0x0280, InterruptedException | ExecutionException -> 0x0267 }
            r1.append(r0)     // Catch:{ CancellationException -> 0x0280, InterruptedException | ExecutionException -> 0x0267 }
            java.lang.String r0 = " returned a null result. Treating it as a failure."
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ CancellationException -> 0x0280, InterruptedException | ExecutionException -> 0x0267 }
            android.util.Log.e(r2, r0)     // Catch:{ CancellationException -> 0x0280, InterruptedException | ExecutionException -> 0x0267 }
            goto L_0x0298
        L_0x0246:
            X.6VD r4 = X.AnonymousClass6VD.A00()     // Catch:{ CancellationException -> 0x0280, InterruptedException | ExecutionException -> 0x0267 }
            java.lang.String r2 = X.AnonymousClass758.A0I     // Catch:{ CancellationException -> 0x0280, InterruptedException | ExecutionException -> 0x0267 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ CancellationException -> 0x0280, InterruptedException | ExecutionException -> 0x0267 }
            X.6QA r0 = r6.A08     // Catch:{ CancellationException -> 0x0280, InterruptedException | ExecutionException -> 0x0267 }
            java.lang.String r0 = r0.A0G     // Catch:{ CancellationException -> 0x0280, InterruptedException | ExecutionException -> 0x0267 }
            r1.append(r0)     // Catch:{ CancellationException -> 0x0280, InterruptedException | ExecutionException -> 0x0267 }
            java.lang.String r0 = " returned a "
            r1.append(r0)     // Catch:{ CancellationException -> 0x0280, InterruptedException | ExecutionException -> 0x0267 }
            r1.append(r5)     // Catch:{ CancellationException -> 0x0280, InterruptedException | ExecutionException -> 0x0267 }
            java.lang.String r0 = "."
            X.AnonymousClass6VD.A03(r4, r0, r2, r1)     // Catch:{ CancellationException -> 0x0280, InterruptedException | ExecutionException -> 0x0267 }
            r6.A02 = r5     // Catch:{ CancellationException -> 0x0280, InterruptedException | ExecutionException -> 0x0267 }
            goto L_0x0298
        L_0x0267:
            r4 = move-exception
            X.AnonymousClass6VD.A00()     // Catch:{ all -> 0x02a0 }
            java.lang.String r2 = X.AnonymousClass758.A0I     // Catch:{ all -> 0x02a0 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x02a0 }
            java.lang.String r0 = r3.A01     // Catch:{ all -> 0x02a0 }
            r1.append(r0)     // Catch:{ all -> 0x02a0 }
            java.lang.String r0 = " failed because it threw an exception/error"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x02a0 }
            android.util.Log.e(r2, r0, r4)     // Catch:{ all -> 0x02a0 }
            goto L_0x0298
        L_0x0280:
            r4 = move-exception
            X.AnonymousClass6VD.A00()     // Catch:{ all -> 0x02a0 }
            java.lang.String r2 = X.AnonymousClass758.A0I     // Catch:{ all -> 0x02a0 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x02a0 }
            java.lang.String r0 = r3.A01     // Catch:{ all -> 0x02a0 }
            r1.append(r0)     // Catch:{ all -> 0x02a0 }
            java.lang.String r0 = " was cancelled"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x02a0 }
            android.util.Log.i(r2, r0, r4)     // Catch:{ all -> 0x02a0 }
        L_0x0298:
            java.lang.Object r0 = r3.A00
            X.758 r0 = (X.AnonymousClass758) r0
            r0.A04()
            return
        L_0x02a0:
            r1 = move-exception
            java.lang.Object r0 = r3.A00
            X.758 r0 = (X.AnonymousClass758) r0
            r0.A04()
            throw r1
        L_0x02a9:
            java.lang.Object r0 = r3.A00
            X.ASf r0 = (X.C21613ASf) r0
            java.lang.String r2 = r3.A01
            X.1WR r1 = r0.A01
            r0 = 0
            r1.A02(r2, r0)
            return
        L_0x02b6:
            java.lang.Object r4 = r3.A00
            X.6KZ r4 = (X.AnonymousClass6KZ) r4
            java.lang.String r2 = r3.A01
            java.lang.ref.WeakReference r0 = r4.A00
            java.lang.Object r1 = r0.get()
            X.6VU r1 = (X.AnonymousClass6VU) r1
            if (r1 == 0) goto L_0x02ca
            r0 = 3
            r1.A0C(r0)
        L_0x02ca:
            X.AnonymousClass6KZ.A00(r4, r2)
            return
        L_0x02ce:
            java.lang.Object r4 = r3.A00
            com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment r4 = (com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment) r4
            java.lang.String r1 = r3.A01
            X.1Uz r0 = r4.A06
            java.lang.String r0 = r0.A02()
            boolean r3 = r0.equals(r1)
            X.17Y r2 = r4.A04
            r1 = 6
            X.75B r0 = new X.75B
            r0.<init>((int) r1, (java.lang.Object) r4, (boolean) r3)
            r2.A0H(r0)
            return
        L_0x02ea:
            java.lang.Object r0 = r3.A00
            X.65M r0 = (X.AnonymousClass65M) r0
            java.lang.String r1 = r3.A01
            com.whatsapp.stickers.stickerpack.StickerPackDownloader r0 = r0.A0B
            r0.A04(r1)
            return
        L_0x02f6:
            java.lang.Object r4 = r3.A00
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r4 = (com.whatsapp.backup.encryptedbackup.EncBackupViewModel) r4
            java.lang.String r3 = r3.A01
            X.1Ck r2 = r4.A0B
            int r1 = r3.length()
            r0 = 64
            if (r1 == r0) goto L_0x030b
            r0 = 0
        L_0x0307:
            r4.A0Z(r0)
            return
        L_0x030b:
            byte[] r1 = X.AnonymousClass14B.A0H(r3)     // Catch:{ IllegalArgumentException -> 0x031a }
            X.1Ci r0 = r2.A01
            byte[] r0 = r0.A03()
            boolean r0 = java.util.Arrays.equals(r1, r0)
            goto L_0x0307
        L_0x031a:
            r1 = move-exception
            java.lang.String r0 = "encb/EncBackupManager/verifyRootKeyStr/key contains invalid hex characters"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
            goto L_0x0307
        L_0x0322:
            java.lang.Object r4 = r3.A00
            X.4y9 r4 = (X.C101704y9) r4
            java.lang.String r2 = r3.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "settings-gdrive/auth-request unable to access "
            X.C36321k7.A1P(r0, r2, r1)
            r0 = 2131894185(0x7f121fa9, float:1.9423168E38)
            r4.BO5(r0)
            com.whatsapp.backup.google.viewmodel.GoogleDriveNewUserSetupViewModel r1 = r4.A0G
            r0 = 0
            r1.A0S(r0)
            return
        L_0x033e:
            java.lang.Object r10 = r3.A00
            com.whatsapp.backup.google.RestoreFromBackupActivity r10 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r10
            java.lang.String r3 = r3.A01
            X.0wG r0 = r10.A0K
            android.content.Context r0 = r0.A00
            android.accounts.AccountManager r1 = android.accounts.AccountManager.get(r0)     // Catch:{ Exception -> 0x0353 }
            java.lang.String r0 = "com.google"
            android.accounts.Account[] r5 = r1.getAccountsByType(r0)     // Catch:{ Exception -> 0x0353 }
            goto L_0x035c
        L_0x0353:
            r1 = move-exception
            java.lang.String r0 = "gdrive-activity/get-google-accounts"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
            android.accounts.Account[] r5 = new android.accounts.Account[r0]
        L_0x035c:
            int r2 = r5.length
            r1 = 0
        L_0x035e:
            r4 = 1
            if (r1 >= r2) goto L_0x0372
            r0 = r5[r1]
            java.lang.String r0 = r0.name
            boolean r0 = android.text.TextUtils.equals(r0, r3)
            if (r0 == 0) goto L_0x036f
            com.whatsapp.backup.google.RestoreFromBackupActivity.A0p(r10, r3, r4)
            return
        L_0x036f:
            int r1 = r1 + 1
            goto L_0x035e
        L_0x0372:
            android.accounts.AccountManager r5 = android.accounts.AccountManager.get(r10)
            r7 = 0
            java.lang.String r6 = "com.google"
            r9 = r7
            r11 = r7
            r12 = r7
            r8 = r7
            android.accounts.AccountManagerFuture r0 = r5.addAccount(r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r1 = r0.getResult()     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x03bf }
            android.os.BaseBundle r1 = (android.os.BaseBundle) r1     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x03bf }
            java.lang.String r0 = "authAccount"
            java.lang.String r2 = r1.getString(r0)     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x03bf }
            if (r2 != 0) goto L_0x0395
            java.lang.String r0 = "restore>RestoreFromBackupActivity/error-during-msgstore-download/account-manager-returned-with-no-account-name"
        L_0x0391:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x03bf }
            goto L_0x03ae
        L_0x0395:
            boolean r0 = r2.equals(r3)     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x03bf }
            if (r0 != 0) goto L_0x03af
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x03bf }
            java.lang.String r0 = "restore>RestoreFromBackupActivity/error-during-msgstore-download/account-manager user added "
            X.C90474aD.A1J(r0, r2, r1)     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x03bf }
            java.lang.String r0 = " instead of "
            X.C90474aD.A1J(r0, r3, r1)     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x03bf }
            java.lang.String r0 = r1.toString()     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x03bf }
            goto L_0x0391
        L_0x03ae:
            return
        L_0x03af:
            X.17Y r2 = r10.A05     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x03bf }
            r1 = 14
            X.72l r0 = new X.72l     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x03bf }
            r0.<init>(r10, r1)     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x03bf }
            r2.A0H(r0)     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x03bf }
            com.whatsapp.backup.google.RestoreFromBackupActivity.A0p(r10, r3, r4)     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x03bf }
            return
        L_0x03bf:
            r1 = move-exception
            java.lang.String r0 = "restore>RestoreFromBackupActivity/error-during-msgstore-download"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x03c6:
            java.lang.Object r4 = r3.A00
            X.14u r4 = (X.C225314u) r4
            java.lang.String r2 = r3.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "restore>RestoreFromBackupActivity/auth-request/unable to access "
            r1.append(r0)
            java.lang.String r0 = X.C34191gb.A07(r2)
            X.C36321k7.A1Z(r1, r0)
            r0 = 2131894185(0x7f121fa9, float:1.9423168E38)
            r4.BO5(r0)
            return
        L_0x03e3:
            java.lang.Object r2 = r3.A00
            com.whatsapp.backup.google.RestoreFromBackupActivity r2 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r2
            java.lang.String r1 = r3.A01
            r0 = 4
            com.whatsapp.backup.google.RestoreFromBackupActivity.A0p(r2, r1, r0)
            return
        L_0x03ee:
            java.lang.Object r4 = r3.A00
            com.whatsapp.backup.google.SettingsGoogleDrive r4 = (com.whatsapp.backup.google.SettingsGoogleDrive) r4
            java.lang.String r2 = r3.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "settings-gdrive/auth-request unable to access "
            X.C36321k7.A1P(r0, r2, r1)
            r0 = 2131894185(0x7f121fa9, float:1.9423168E38)
            r4.BO5(r0)
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r1 = r4.A0b
            r0 = 0
            r1.A0V(r0)
            return
        L_0x040a:
            java.lang.Object r4 = r3.A00
            X.6Uh r4 = (X.C132566Uh) r4
            java.lang.String r7 = r3.A01
            X.1Ws r0 = r4.A05
            com.whatsapp.jid.UserJid r8 = r4.A08
            java.util.Map r0 = r0.A01
            java.lang.Object r0 = r0.get(r8)
            X.9ct r0 = (X.C198089ct) r0
            if (r0 == 0) goto L_0x0462
            java.util.List r0 = r0.A02
            r3 = 0
            if (r0 == 0) goto L_0x0462
            java.util.Iterator r6 = r0.iterator()
        L_0x0427:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x044f
            java.lang.Object r5 = r6.next()
            r0 = r5
            X.6Dt r0 = (X.C128826Dt) r0
            java.lang.String r0 = r0.A06
            java.lang.String r0 = X.C36371kC.A0y(r0)
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = X.C36431kI.A1D(r2, r0)
            java.lang.String r0 = X.C36371kC.A0y(r7)
            java.lang.String r0 = X.C36431kI.A1D(r2, r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0427
            r3 = r5
        L_0x044f:
            X.6Dt r3 = (X.C128826Dt) r3
            if (r3 == 0) goto L_0x0462
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            java.util.Date r0 = r3.A08
            if (r0 == 0) goto L_0x046a
            boolean r0 = r0.before(r1)
            if (r0 != 0) goto L_0x046a
        L_0x0462:
            X.1Rs r1 = r4.A09
            X.4zR r0 = X.C102184zR.A00
        L_0x0466:
            r1.A0C(r0)
            return
        L_0x046a:
            java.util.Date r0 = r3.A07
            if (r0 == 0) goto L_0x0475
            boolean r0 = r0.after(r1)
            if (r0 != 0) goto L_0x0475
            goto L_0x0462
        L_0x0475:
            X.4zQ r0 = X.C132566Uh.A00(r4, r3)
            if (r0 == 0) goto L_0x047e
            X.1Rs r1 = r4.A09
            goto L_0x0466
        L_0x047e:
            X.6MH r0 = r4.A04
            r7 = 0
            r6 = 1
            X.1Wd r0 = r0.A00
            X.54c r0 = r0.A00()
            X.1M0 r2 = r0.A04()
            X.71s r5 = r2.B1k()     // Catch:{ all -> 0x04d0 }
            android.content.ContentValues r1 = X.AnonymousClass6MH.A00(r3, r8)     // Catch:{ all -> 0x04c9 }
            X.14e r9 = r2.A02     // Catch:{ all -> 0x04c9 }
            java.lang.String r11 = "cart_applied_promotion"
            android.content.ContentValues r10 = X.AnonymousClass6MH.A00(r3, r8)     // Catch:{ all -> 0x04c9 }
            java.lang.String r12 = "business_id=?"
            java.lang.String[] r14 = new java.lang.String[r6]     // Catch:{ all -> 0x04c9 }
            java.lang.String r0 = r8.getRawString()     // Catch:{ all -> 0x04c9 }
            r14[r7] = r0     // Catch:{ all -> 0x04c9 }
            java.lang.String r13 = "cart_applied_promotion.UPDATE_APPLIED_PROMOTION"
            int r0 = r9.A01(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x04c9 }
            if (r0 != 0) goto L_0x04b3
            java.lang.String r0 = "cart_applied_promotion.INSERT_APPLIED_PROMOTION"
            r9.A04(r11, r0, r1)     // Catch:{ all -> 0x04c9 }
        L_0x04b3:
            r5.A00()     // Catch:{ all -> 0x04c9 }
            r5.close()     // Catch:{ all -> 0x04d0 }
            r2.close()
            X.1Rs r1 = r4.A09
            X.4zT r0 = X.C102204zT.A00
            r1.A0C(r0)
            X.00s r0 = r4.A00
            r0.A0C(r3)
            return
        L_0x04c9:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x04cb }
        L_0x04cb:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ all -> 0x04d0 }
            throw r0     // Catch:{ all -> 0x04d0 }
        L_0x04d0:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x04d2 }
        L_0x04d2:
            r1 = move-exception
            X.C05600Qi.A00(r2, r0)
            throw r1
        L_0x04d7:
            java.lang.Object r4 = r3.A00
            com.whatsapp.biz.product.viewmodel.ComplianceInfoViewModel r4 = (com.whatsapp.biz.product.viewmodel.ComplianceInfoViewModel) r4
            java.lang.String r2 = r3.A01
            X.9lS r0 = r4.A04
            X.6pl r1 = new X.6pl
            r1.<init>(r4, r2)
            java.util.List r0 = r0.A0N
            r0.add(r1)
            return
        L_0x04ea:
            java.lang.Object r0 = r3.A00
            X.3O6 r0 = (X.AnonymousClass3O6) r0
            java.lang.String r2 = r3.A01
            X.17Y r1 = r0.A00
            r0 = 1
            r1.A0E(r2, r0)
            return
        L_0x04f7:
            java.lang.Object r0 = r3.A00
            X.4kj r0 = (X.C95384kj) r0
            java.lang.String r5 = r3.A01
            X.64j r4 = r0.A0B
            X.60a r1 = r0.A08
            r0 = 741481818(0x2c321d5a, float:2.5311615E-12)
            X.6Tm r3 = r1.A00(r0)
            X.59n r0 = r4.A03
            boolean r0 = r0 instanceof X.AnonymousClass5DO
            if (r0 == 0) goto L_0x0511
            r4.A00()
        L_0x0511:
            X.7h7 r2 = r4.A07
            X.5m0 r0 = r4.A06
            X.64l r1 = r0.A00
            X.6ua r0 = new X.6ua
            r0.<init>(r4, r5)
            X.5DN r0 = r2.B48(r0, r1, r3, r5)
            r0.A0B()
            r4.A03 = r0
            return
        L_0x0526:
            java.lang.Object r4 = r3.A00
            com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity r4 = (com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity) r4
            java.lang.String r2 = r3.A01
            X.0ts r0 = r4.A0D
            java.util.Locale r0 = X.C36401kF.A0x(r0)
            android.location.Geocoder r1 = new android.location.Geocoder
            r1.<init>(r4, r0)
            r0 = 1
            java.util.List r1 = r1.getFromLocationName(r2, r0)     // Catch:{ Exception -> 0x054b }
            if (r1 == 0) goto L_0x0551
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x054b }
            if (r0 != 0) goto L_0x0551
            java.lang.Object r2 = X.C36391kE.A0t(r1)     // Catch:{ Exception -> 0x054b }
            android.location.Address r2 = (android.location.Address) r2     // Catch:{ Exception -> 0x054b }
            goto L_0x0552
        L_0x054b:
            r1 = move-exception
            java.lang.String r0 = "SearchLocationUtil/geoLocateAddressFromLocationName/failed"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0551:
            r2 = 0
        L_0x0552:
            r1 = 25
            X.74h r0 = new X.74h
            r0.<init>(r4, r2, r1)
            r4.runOnUiThread(r0)
            return
        L_0x055d:
            java.lang.Object r4 = r3.A00
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel r4 = (com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel) r4
            java.lang.String r5 = r3.A01
            int r7 = r4.A01
            X.6QG r3 = com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel.A02(r4)
            int r8 = com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel.A01(r4, r5)
            X.6QK r0 = r4.A0T
            X.62i r2 = r0.A02()
            X.6qg r0 = r4.A0R
            java.lang.String r6 = r0.A0K
            r1 = 0
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel.A09(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x057c:
            java.lang.Object r1 = r3.A00
            X.6Ts r1 = (X.AnonymousClass6Ts) r1
            java.lang.String r0 = r3.A01
            r1.A04(r0)
            return
        L_0x0586:
            java.lang.Object r1 = r3.A00
            com.whatsapp.jid.DeviceJid r1 = (com.whatsapp.jid.DeviceJid) r1
            java.lang.String r0 = r3.A01
            com.whatsapp.voipcalling.Voip.resendOfferOnDecryptionFailure(r1, r0)
            return
        L_0x0590:
            java.lang.Object r0 = r3.A00
            X.3Pj r0 = (X.C64773Pj) r0
            java.lang.String r1 = r3.A01
            com.whatsapp.chatinfo.view.custom.ContactDetailsCard r0 = r0.A06
            r0.setContactChatStatus(r1)
            return
        L_0x059c:
            java.lang.Object r1 = r3.A00
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r0 = r3.A01
            r1.setText(r0)
            return
        L_0x05a6:
            java.lang.Object r1 = r3.A00
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity r1 = (com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity) r1
            java.lang.String r0 = r3.A01
            r19 = r0
            X.1c6 r2 = r1.A06
            monitor-enter(r2)
            X.1c7 r0 = r2.A03     // Catch:{ all -> 0x072f }
            X.3PV r4 = r0.A00()     // Catch:{ all -> 0x072f }
            X.1c9 r7 = r2.A02     // Catch:{ all -> 0x072f }
            r6 = 3
            r1 = 0
            if (r4 == 0) goto L_0x05c5
            java.lang.String r0 = r4.A02     // Catch:{ all -> 0x072f }
            java.lang.String r1 = r4.A01     // Catch:{ all -> 0x072f }
        L_0x05c1:
            r7.A01(r6, r0, r1)     // Catch:{ all -> 0x072f }
            goto L_0x05c7
        L_0x05c5:
            r0 = r1
            goto L_0x05c1
        L_0x05c7:
            if (r4 != 0) goto L_0x05fb
            java.lang.String r0 = "CompanionRegWithLinkCodeManager/handleInputLinkCode companion hello is null or expired"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x072f }
            X.0wo r4 = r7.A03     // Catch:{ all -> 0x072f }
            long r0 = X.C19970wo.A00(r4)     // Catch:{ all -> 0x072f }
            r7.A00 = r0     // Catch:{ all -> 0x072f }
            X.1c7 r3 = r7.A02     // Catch:{ all -> 0x072f }
            monitor-enter(r3)     // Catch:{ all -> 0x072f }
            long r5 = r3.A00     // Catch:{ all -> 0x05f8 }
            r0 = 0
            r3.A00 = r0     // Catch:{ all -> 0x05f8 }
            monitor-exit(r3)     // Catch:{ all -> 0x072f }
            r0 = 180000(0x2bf20, double:8.8932E-319)
            long r5 = r5 + r0
            long r3 = X.C19970wo.A00(r4)     // Catch:{ all -> 0x072f }
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            r0 = 13
            if (r1 <= 0) goto L_0x05f0
            r0 = 14
        L_0x05f0:
            r7.A00(r0)     // Catch:{ all -> 0x072f }
            X.C31611c6.A00(r2)     // Catch:{ all -> 0x072f }
            goto L_0x072d
        L_0x05f8:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x072f }
            throw r0     // Catch:{ all -> 0x072f }
        L_0x05fb:
            byte[] r8 = r4.A04     // Catch:{ all -> 0x072f }
            byte[] r0 = r4.A03     // Catch:{ all -> 0x072f }
            r18 = r0
            java.lang.String r3 = r4.A02     // Catch:{ all -> 0x072f }
            java.lang.String r5 = r4.A01     // Catch:{ all -> 0x072f }
            r7 = 0
            r4 = 1
            int r1 = r8.length     // Catch:{ IllegalArgumentException -> 0x0718 }
            r0 = 48
            if (r1 < r0) goto L_0x0711
            r9 = 32
            byte[] r13 = java.util.Arrays.copyOfRange(r8, r7, r9)     // Catch:{ IllegalArgumentException -> 0x0718 }
            byte[] r12 = java.util.Arrays.copyOfRange(r8, r9, r0)     // Catch:{ IllegalArgumentException -> 0x0718 }
            byte[] r10 = java.util.Arrays.copyOfRange(r8, r0, r1)     // Catch:{ IllegalArgumentException -> 0x0718 }
            char[] r8 = r19.toCharArray()     // Catch:{ all -> 0x072f }
            java.util.List r0 = X.C56182vs.A00     // Catch:{ all -> 0x072f }
            r15 = 131072(0x20000, float:1.83671E-40)
            r11 = 256(0x100, float:3.59E-43)
            java.lang.String r1 = "PBKDF2WithHmacSHA256"
            javax.crypto.SecretKey r8 = X.C18750th.A08(r1, r13, r8, r15, r11)     // Catch:{ all -> 0x072f }
            java.lang.String r17 = "AES/CTR/NoPadding"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r17)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0705 }
            byte[] r16 = X.C90484aE.A1a(r8, r0, r12, r10)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0705 }
            r14 = 5
            r8 = 2
            X.5pz r13 = X.C133256Xm.A00()     // Catch:{ all -> 0x072f }
            byte[] r10 = X.C18750th.A0H(r9)     // Catch:{ all -> 0x072f }
            r0 = 16
            byte[] r9 = X.C18750th.A0H(r0)     // Catch:{ all -> 0x072f }
            X.3IG r0 = r13.A01     // Catch:{ all -> 0x072f }
            byte[] r12 = r0.A01     // Catch:{ all -> 0x072f }
            char[] r0 = r19.toCharArray()     // Catch:{ all -> 0x072f }
            javax.crypto.SecretKey r11 = X.C18750th.A08(r1, r10, r0, r15, r11)     // Catch:{ all -> 0x072f }
            X.3IG r1 = new X.3IG     // Catch:{ all -> 0x072f }
            r0 = r16
            r1.<init>(r0, r14)     // Catch:{ all -> 0x072f }
            X.66J r0 = r13.A00     // Catch:{ all -> 0x072f }
            byte[] r14 = X.C133256Xm.A07(r0, r1)     // Catch:{ all -> 0x072f }
            java.util.Map r13 = r2.A00     // Catch:{ all -> 0x072f }
            X.5tG r1 = new X.5tG     // Catch:{ all -> 0x072f }
            r0 = r18
            r1.<init>(r5, r14, r0)     // Catch:{ all -> 0x072f }
            r13.put(r3, r1)     // Catch:{ all -> 0x072f }
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r17)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0724 }
            javax.crypto.spec.IvParameterSpec r0 = new javax.crypto.spec.IvParameterSpec     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0724 }
            r0.<init>(r9)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0724 }
            r1.init(r4, r11, r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0724 }
            byte[] r1 = r1.doFinal(r12)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0724 }
            byte[][] r0 = new byte[r6][]     // Catch:{ all -> 0x072f }
            r0[r7] = r10     // Catch:{ all -> 0x072f }
            r0[r4] = r9     // Catch:{ all -> 0x072f }
            r0[r8] = r1     // Catch:{ all -> 0x072f }
            byte[] r1 = X.C203239na.A05(r0)     // Catch:{ all -> 0x072f }
            X.189 r0 = r2.A06     // Catch:{ all -> 0x072f }
            X.18u r0 = r0.A00     // Catch:{ all -> 0x072f }
            X.34P r0 = r0.A04()     // Catch:{ all -> 0x072f }
            X.3FZ r0 = r0.A01     // Catch:{ all -> 0x072f }
            X.3IG r0 = r0.A00     // Catch:{ all -> 0x072f }
            byte[] r11 = r0.A01     // Catch:{ all -> 0x072f }
            X.19A r9 = r2.A07     // Catch:{ all -> 0x072f }
            X.36F r0 = new X.36F     // Catch:{ all -> 0x072f }
            r0.<init>(r2, r3, r5)     // Catch:{ all -> 0x072f }
            X.3oz r15 = new X.3oz     // Catch:{ all -> 0x072f }
            r15.<init>(r0, r9)     // Catch:{ all -> 0x072f }
            java.lang.String r0 = "LinkCodePrimaryHelloProtocolHelper/sendPrimaryHelloIq start"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x072f }
            X.19A r14 = r15.A00     // Catch:{ all -> 0x072f }
            java.lang.String r5 = r14.A09()     // Catch:{ all -> 0x072f }
            r0 = 4
            X.1AL[] r9 = new X.AnonymousClass1AL[r0]     // Catch:{ all -> 0x072f }
            java.lang.String r10 = "id"
            X.1AL r0 = new X.1AL     // Catch:{ all -> 0x072f }
            r0.<init>((java.lang.String) r10, (java.lang.String) r5)     // Catch:{ all -> 0x072f }
            r12 = 0
            r9[r7] = r0     // Catch:{ all -> 0x072f }
            java.lang.String r7 = "xmlns"
            java.lang.String r0 = "md"
            X.C36341k9.A1L(r7, r0, r9, r4)     // Catch:{ all -> 0x072f }
            java.lang.String r7 = "type"
            java.lang.String r0 = "set"
            X.C36341k9.A1L(r7, r0, r9, r8)     // Catch:{ all -> 0x072f }
            X.C36341k9.A1V(r9, r6)     // Catch:{ all -> 0x072f }
            X.1AL[] r7 = new X.AnonymousClass1AL[r4]     // Catch:{ all -> 0x072f }
            java.lang.String r10 = "stage"
            java.lang.String r0 = "primary_hello"
            X.C36341k9.A1L(r10, r0, r7, r12)     // Catch:{ all -> 0x072f }
            X.9nx[] r6 = new X.C203399nx[r6]     // Catch:{ all -> 0x072f }
            java.lang.String r13 = "link_code_pairing_wrapped_primary_ephemeral_pub"
            r10 = 0
            X.9nx r0 = new X.9nx     // Catch:{ all -> 0x072f }
            r0.<init>((java.lang.String) r13, (byte[]) r1, (X.AnonymousClass1AL[]) r10)     // Catch:{ all -> 0x072f }
            r6[r12] = r0     // Catch:{ all -> 0x072f }
            java.lang.String r1 = "primary_identity_pub"
            X.9nx r0 = new X.9nx     // Catch:{ all -> 0x072f }
            r0.<init>((java.lang.String) r1, (byte[]) r11, (X.AnonymousClass1AL[]) r10)     // Catch:{ all -> 0x072f }
            r6[r4] = r0     // Catch:{ all -> 0x072f }
            java.lang.String r1 = "link_code_pairing_ref"
            X.9nx r0 = new X.9nx     // Catch:{ all -> 0x072f }
            r0.<init>((java.lang.String) r1, (java.lang.String) r3, (X.AnonymousClass1AL[]) r10)     // Catch:{ all -> 0x072f }
            r6[r8] = r0     // Catch:{ all -> 0x072f }
            java.lang.String r1 = "link_code_companion_reg"
            X.9nx r0 = new X.9nx     // Catch:{ all -> 0x072f }
            r0.<init>((java.lang.String) r1, (X.AnonymousClass1AL[]) r7, (X.C203399nx[]) r6)     // Catch:{ all -> 0x072f }
            X.9nx r16 = X.C36391kE.A0m(r0, r9)     // Catch:{ all -> 0x072f }
            r18 = 361(0x169, float:5.06E-43)
            r19 = 120000(0x1d4c0, double:5.9288E-319)
            r17 = r5
            r14.A0E(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x072f }
            goto L_0x072d
        L_0x0705:
            r1 = move-exception
            java.lang.String r0 = "CompanionRegWithLinkCodeManager/processCompanionHello/decryption fail"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x072f }
            X.1c8 r0 = r2.A01     // Catch:{ all -> 0x072f }
            r0.A00(r4, r3, r5)     // Catch:{ all -> 0x072f }
            goto L_0x072a
        L_0x0711:
            java.lang.String r0 = "WrappedCompanionEphemeralPubData input byte array length too small"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)     // Catch:{ IllegalArgumentException -> 0x0718 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0718 }
        L_0x0718:
            r1 = move-exception
            java.lang.String r0 = "CompanionRegWithLinkCodeManager/processCompanionHello exception"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x072f }
            X.1c8 r0 = r2.A01     // Catch:{ all -> 0x072f }
            r0.A00(r4, r3, r5)     // Catch:{ all -> 0x072f }
            goto L_0x072a
        L_0x0724:
            r1 = move-exception
            java.lang.String r0 = "CompanionRegWithLinkCodeManager/processCompanionHello/encrypt fail"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x072f }
        L_0x072a:
            X.C31611c6.A01(r2, r3, r5)     // Catch:{ all -> 0x072f }
        L_0x072d:
            monitor-exit(r2)
            return
        L_0x072f:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
        L_0x0732:
            java.lang.Object r0 = r3.A00
            X.3N1 r0 = (X.AnonymousClass3N1) r0
            java.lang.String r1 = r3.A01
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity r0 = r0.A00
            X.1c7 r0 = r0.A05
            r0.A02(r1)
            return
        L_0x0740:
            java.lang.Object r6 = r3.A00
            com.whatsapp.companiondevice.LinkedDevicesSharedViewModel r6 = (com.whatsapp.companiondevice.LinkedDevicesSharedViewModel) r6
            java.lang.String r5 = r3.A01
            X.196 r4 = r6.A0A
            X.3ty r3 = new X.3ty
            r3.<init>()
            boolean r0 = r4.A0S()
            if (r0 != 0) goto L_0x076e
            java.lang.Boolean r0 = X.C36371kC.A0m()
            r3.A0C(r0)
        L_0x075a:
            X.3tn r4 = new X.3tn
            r4.<init>(r6, r5)
            X.0wU r2 = r6.A0V
            java.util.Objects.requireNonNull(r2)
            r1 = 5
            X.7rS r0 = new X.7rS
            r0.<init>(r2, r1)
            r3.A0B(r4, r0)
            return
        L_0x076e:
            java.lang.String r0 = "sync-manager/doPreCompanionLogoutTask start"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r7 = 1
            X.2rF r9 = new X.2rF
            r9.<init>(r3, r4, r7)
            X.1Ic r0 = r4.A08
            r0.registerObserver(r9)
            X.0wU r10 = r4.A0W
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            X.0yf r1 = r4.A07
            X.0yh r0 = X.C21100yf.A1Z
            int r0 = r1.A04(r0)
            long r0 = (long) r0
            long r0 = r2.toMillis(r0)
            X.1iG r8 = new X.1iG
            r8.<init>((X.C79593ty) r3, (X.AnonymousClass196) r4)
            java.lang.String r2 = "SyncManager/pre-companion-logout"
            X.1jE r2 = r10.BpM(r8, r2, r0)
            r1 = 0
            X.4CB r0 = new X.4CB
            r0.<init>(r9, r4, r2, r1)
            r3.A0A(r0)
            X.1AE r1 = r4.A0T
            java.lang.String r0 = "sentinel"
            X.1LZ r1 = r1.A00(r0)
            X.8YD r1 = (X.AnonymousClass8YD) r1
            if (r1 == 0) goto L_0x075a
            boolean r0 = r4.A0S()
            if (r0 == 0) goto L_0x075a
            java.util.ArrayList r0 = X.AnonymousClass8YD.A00(r1, r7)
            r4.A0M(r0)
            r4.A0G()
            goto L_0x075a
        L_0x07c0:
            java.lang.Object r1 = r3.A00
            com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity r1 = (com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity) r1
            java.lang.String r0 = r3.A01
            com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity.A01(r1, r0)
            return
        L_0x07ca:
            java.lang.Object r2 = r3.A00
            com.whatsapp.contact.picker.SharedTextPreviewDialogFragment r2 = (com.whatsapp.contact.picker.SharedTextPreviewDialogFragment) r2
            java.lang.String r10 = r3.A01
            X.17Y r3 = r2.A05
            X.0wU r9 = r2.A0M
            X.0ts r5 = r2.A01
            r0 = 1
            X.4ZX r8 = new X.4ZX
            r8.<init>(r2, r0)
            X.1DU r1 = r2.A0E
            X.0ww r0 = r2.A02
            X.6tS r4 = new X.6tS
            r4.<init>(r0, r1, r10)
            X.0yC r6 = r2.A02
            X.0yW r7 = r2.A0D
            r11 = 0
            goto L_0x0818
        L_0x07eb:
            java.lang.Object r0 = r3.A00
            X.3fk r0 = (X.C70803fk) r0
            java.lang.String r2 = r3.A01
            X.0zv r1 = r0.A38
            java.lang.String r0 = "Resume"
            r1.A02(r2, r0)
            return
        L_0x07f9:
            java.lang.Object r0 = r3.A00
            X.3o0 r0 = (X.C75913o0) r0
            java.lang.String r10 = r3.A01
            X.1sS r2 = r0.A00
            X.17Y r3 = r2.A0H
            X.0wU r9 = r2.A0c
            X.0ts r5 = r2.A0S
            X.4Qs r8 = r2.A03
            boolean r11 = r2.A0A
            X.1DU r1 = r2.A0W
            X.0ww r0 = r2.A0I
            X.6tS r4 = new X.6tS
            r4.<init>(r0, r1, r10)
            X.0yC r6 = r2.A0U
            X.0yW r7 = r2.A0V
        L_0x0818:
            X.C63983Me.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x081c:
            java.lang.Object r4 = r3.A00
            X.4QO r4 = (X.AnonymousClass4QO) r4
            java.lang.String r1 = r3.A01
            boolean r0 = X.AnonymousClass14B.A0F(r1)
            if (r0 == 0) goto L_0x0866
            r1 = 0
        L_0x0829:
            com.whatsapp.deeplink.DeepLinkActivity r4 = (com.whatsapp.deeplink.DeepLinkActivity) r4
            android.os.Handler r0 = r4.A00
            r3 = 1
            r0.removeMessages(r3)
            r4.Bnv()
            if (r1 != 0) goto L_0x086b
            X.1qm r3 = X.AnonymousClass3LW.A00(r4)
            r0 = 2131889754(0x7f120e5a, float:1.941418E38)
            r3.A0c(r0)
            r1 = 2131896389(0x7f122845, float:1.9427638E38)
            r0 = 25
            X.C163297py.A00(r3, r4, r0, r1)
            r2 = 2131895263(0x7f1223df, float:1.9425354E38)
            r1 = 39
            X.4XM r0 = new X.4XM
            r0.<init>(r4, r1)
            r3.A0h(r0, r2)
            X.0FM r2 = r3.create()
            r1 = 4
            X.7r4 r0 = new X.7r4
            r0.<init>(r4, r1)
            r2.setOnDismissListener(r0)
            r2.show()
            return
        L_0x0866:
            android.net.Uri r1 = android.net.Uri.parse(r1)
            goto L_0x0829
        L_0x086b:
            android.content.Intent r2 = X.C36391kE.A0G(r1)
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.android.browser.application_id"
            r2.putExtra(r0, r1)
            java.lang.String r0 = "create_new_tab"
            r2.putExtra(r0, r3)
            X.1Dv r0 = r4.A01
            r0.A06(r4, r2)
            X.C36351kA.A11(r4)
            return
        L_0x0886:
            java.lang.Object r0 = r3.A00
            X.3OK r0 = (X.AnonymousClass3OK) r0
            java.lang.String r1 = r3.A01
            android.content.Context r0 = r0.A03
            X.1qm r0 = X.AnonymousClass3LW.A00(r0)
            X.C39001qm.A0A(r0, r1)
            r0.A0b()
            return
        L_0x0899:
            java.lang.Object r2 = r3.A00
            com.whatsapp.group.GroupChatInfoActivity r2 = (com.whatsapp.group.GroupChatInfoActivity) r2
            java.lang.String r5 = r3.A01
            X.17r r1 = r2.A0w
            X.147 r0 = r2.A1Y
            X.6X6 r1 = r1.A0C(r0)
            java.util.Map r0 = r1.A08
            r0.size()
            X.0xg r4 = r2.A1P
            X.147 r3 = r2.A1Y
            java.lang.String r2 = r1.A0E()
            r1 = 0
            X.3S5 r0 = new X.3S5
            r0.<init>(r5, r1, r2)
            r4.A09(r0, r3)
            return
        L_0x08be:
            java.lang.Object r2 = r3.A00
            X.3ty r2 = (X.C79593ty) r2
            java.lang.String r1 = r3.A01
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            X.2WT r0 = new X.2WT
            r0.<init>(r1)
            r2.accept(r0)
            return
        L_0x08d1:
            java.lang.String r0 = "findViewById"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x08d8:
            java.util.Map r1 = r4.A08     // Catch:{ all -> 0x08ed }
            X.69L r0 = X.C109445Xp.A00(r3)     // Catch:{ all -> 0x08ed }
            r1.put(r0, r3)     // Catch:{ all -> 0x08ed }
            java.util.Set r1 = r4.A09     // Catch:{ all -> 0x08ed }
            r1.add(r3)     // Catch:{ all -> 0x08ed }
            X.7iU r0 = r4.A04     // Catch:{ all -> 0x08ed }
            r0.BoB(r1)     // Catch:{ all -> 0x08ed }
            monitor-exit(r2)     // Catch:{ all -> 0x08ed }
            return
        L_0x08ed:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x08ed }
            throw r1
        L_0x08f0:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x08f0 }
            throw r1
        L_0x08f3:
            java.util.Map r0 = X.C90514aH.A16(r7)     // Catch:{ all -> 0x08ff }
            r0.remove(r6)     // Catch:{ all -> 0x08ff }
            X.AnonymousClass6KD.A00(r5)     // Catch:{ all -> 0x08ff }
            monitor-exit(r5)
            return
        L_0x08ff:
            r1 = move-exception
            monitor-exit(r5)
            throw r1
        L_0x0902:
            r3 = move-exception
            X.17Y r2 = r4.A0Q
            r1 = 11
            X.3v8 r0 = new X.3v8
            r0.<init>(r4, r3, r1)
            r2.Bp3(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass751.run():void");
    }

    public AnonymousClass751(LinkedDevicesSharedViewModel linkedDevicesSharedViewModel, String str) {
        this.A02 = 37;
        this.A00 = linkedDevicesSharedViewModel;
        this.A01 = str;
    }

    public AnonymousClass751(AnonymousClass7cD r2) {
        this.A02 = 2;
        this.A00 = r2;
        this.A01 = "";
    }

    public AnonymousClass751(C1033354w r2) {
        this.A02 = 25;
        this.A00 = r2;
        this.A01 = "daily_cron_job";
    }
}
