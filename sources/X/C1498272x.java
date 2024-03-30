package X;

/* renamed from: X.72x  reason: invalid class name and case insensitive filesystem */
public class C1498272x implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public C1498272x(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A01 = obj;
        this.A00 = obj2;
    }

    public static void A00(C19770wU r1, Object obj, Object obj2, int i) {
        r1.Boy(new C1498272x(obj, obj2, i));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            int r0 = r10.A02
            switch(r0) {
                case 0: goto L_0x03d9;
                case 1: goto L_0x0387;
                case 2: goto L_0x0377;
                case 3: goto L_0x035c;
                case 4: goto L_0x025a;
                case 5: goto L_0x0224;
                case 6: goto L_0x01fd;
                case 7: goto L_0x01c2;
                case 8: goto L_0x019e;
                case 9: goto L_0x0100;
                case 10: goto L_0x00ed;
                case 11: goto L_0x0005;
                case 12: goto L_0x0005;
                case 13: goto L_0x00ba;
                case 14: goto L_0x00ac;
                case 15: goto L_0x00a6;
                case 16: goto L_0x04c7;
                case 17: goto L_0x04aa;
                case 18: goto L_0x0021;
                case 19: goto L_0x03fb;
                case 20: goto L_0x0407;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r10.A00
            X.0wB r0 = (X.C19580wB) r0
            java.lang.Object r2 = r10.A01
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r1 = X.C90474aD.A0p(r0)
        L_0x0011:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0406
            java.lang.Object r0 = r1.next()
            X.1i3 r0 = (X.C35041i3) r0
            r0.BhO(r2)
            goto L_0x0011
        L_0x0021:
            java.lang.Object r8 = r10.A01
            X.78c r8 = (X.AnonymousClass78c) r8
            java.lang.Object r7 = r10.A00
            org.whispersystems.jobqueue.Job r7 = (org.whispersystems.jobqueue.Job) r7
            java.util.concurrent.atomic.AtomicInteger r6 = r8.A01
            r6.getAndIncrement()
            org.whispersystems.jobqueue.JobParameters r0 = r7.parameters
            int r3 = r0.retryCount
            int r2 = r7.A00
        L_0x0034:
            if (r2 >= r3) goto L_0x005a
            r7.A0B()     // Catch:{ Exception -> 0x003c }
            java.lang.Integer r1 = X.C023109s.A00     // Catch:{ Exception -> 0x003c }
            goto L_0x005c
        L_0x003c:
            r1 = move-exception
            java.lang.String r0 = "JobConsumer"
            android.util.Log.w(r0, r1)
            boolean r0 = r1 instanceof java.lang.RuntimeException
            if (r0 != 0) goto L_0x0059
            boolean r0 = r7.A0D(r1)
            if (r0 == 0) goto L_0x005a
            boolean r0 = r7.A0C()
            int r2 = r2 + 1
            if (r0 != 0) goto L_0x0034
            r7.A00 = r2
            java.lang.Integer r1 = X.C023109s.A0C
            goto L_0x005c
        L_0x0059:
            throw r1
        L_0x005a:
            java.lang.Integer r1 = X.C023109s.A01
        L_0x005c:
            java.lang.Integer r0 = X.C023109s.A0C
            if (r1 != r0) goto L_0x006f
            X.6OM r0 = r8.A02
            r0.A02(r7)
        L_0x0065:
            org.whispersystems.jobqueue.JobParameters r0 = r7.parameters
            java.lang.String r1 = r0.groupId
            if (r1 == 0) goto L_0x00a2
            X.6OM r2 = r8.A02
            monitor-enter(r2)
            goto L_0x0095
        L_0x006f:
            java.lang.Integer r0 = X.C023109s.A01
            if (r1 != r0) goto L_0x0076
            r7.A0A()
        L_0x0076:
            org.whispersystems.jobqueue.JobParameters r0 = r7.parameters
            boolean r0 = r0.isPersistent
            if (r0 == 0) goto L_0x0083
            X.6NH r2 = r8.A03
            long r0 = r7.A01
            r2.A00(r0)
        L_0x0083:
            android.os.PowerManager$WakeLock r5 = r7.A02
            if (r5 == 0) goto L_0x0065
            org.whispersystems.jobqueue.JobParameters r0 = r7.parameters
            long r3 = r0.wakeLockTimeout
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0065
            r5.release()
            goto L_0x0065
        L_0x0095:
            java.util.Set r0 = r2.A03     // Catch:{ all -> 0x01fa }
            r0.remove(r1)     // Catch:{ all -> 0x01fa }
            X.78b r0 = r2.A05     // Catch:{ all -> 0x01fa }
            android.os.ConditionVariable r0 = r0.A00     // Catch:{ all -> 0x01fa }
            r0.open()     // Catch:{ all -> 0x01fa }
            monitor-exit(r2)
        L_0x00a2:
            r6.getAndDecrement()
            return
        L_0x00a6:
            java.lang.Object r0 = r10.A00
            X.C90514aH.A1N(r0)
            return
        L_0x00ac:
            java.lang.Object r0 = r10.A01
            X.79E r0 = (X.AnonymousClass79E) r0
            org.npci.upi.security.pinactivitycomponent.s r1 = r0.A03
            java.lang.Object r0 = r10.A00
            X.63A r0 = (X.AnonymousClass63A) r0
            r1.A1a(r0)
            return
        L_0x00ba:
            java.lang.Object r2 = r10.A01
            java.util.concurrent.Future r2 = (java.util.concurrent.Future) r2
            boolean r0 = r2.isCancelled()
            if (r0 == 0) goto L_0x00cd
            java.lang.Object r1 = r10.A00
            X.0AP r1 = (X.AnonymousClass0AP) r1
            r0 = 0
            r1.B2T(r0)
            return
        L_0x00cd:
            java.lang.Object r1 = r10.A00     // Catch:{ ExecutionException -> 0x00d9 }
            X.09x r1 = (X.C023509x) r1     // Catch:{ ExecutionException -> 0x00d9 }
            java.lang.Object r0 = X.C109755Yz.A00(r2)     // Catch:{ ExecutionException -> 0x00d9 }
            r1.resumeWith(r0)     // Catch:{ ExecutionException -> 0x00d9 }
            return
        L_0x00d9:
            r0 = move-exception
            java.lang.Object r1 = r10.A00
            X.09x r1 = (X.C023509x) r1
            java.lang.Throwable r0 = r0.getCause()
            X.AnonymousClass00C.A0B(r0)
            X.03N r0 = X.AnonymousClass00C.A02(r0)
            r1.resumeWith(r0)
            return
        L_0x00ed:
            java.lang.Object r1 = r10.A00
            X.5yk r1 = (X.C124755yk) r1
            java.lang.Object r2 = r10.A01
            X.6vi r2 = (X.C146506vi) r2
            r0 = 1
            X.AnonymousClass00C.A0D(r2, r0)
            X.1D0 r1 = r1.A04
            r0 = 0
            r1.A0E(r2, r0)
            return
        L_0x0100:
            java.lang.Object r4 = r10.A00
            com.whatsapp.xfamily.crossposting.ui.ShareToFacebookActivity r4 = (com.whatsapp.xfamily.crossposting.ui.ShareToFacebookActivity) r4
            java.lang.Object r1 = r10.A01
            X.3GB r1 = (X.AnonymousClass3GB) r1
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            X.005 r0 = r4.A04
            if (r0 == 0) goto L_0x0197
            java.lang.Object r2 = r0.get()
            X.5u5 r2 = (X.AnonymousClass5u5) r2
            X.1US r6 = com.whatsapp.xfamily.crossposting.ui.ShareToFacebookActivity.A07
            X.3GC r3 = new X.3GC
            r3.<init>(r1, r4)
            r5 = 0
            X.AnonymousClass00C.A0D(r6, r5)
            r8 = 2
            X.005 r7 = r2.A01
            java.lang.Object r0 = r7.get()
            X.1UM r0 = (X.AnonymousClass1UM) r0
            X.695 r1 = r0.A00(r6)
            if (r1 == 0) goto L_0x0193
            X.7OK r0 = new X.7OK
            r0.<init>(r2, r1)
            java.lang.Object r4 = X.C131886Rd.A00(r0, r8)
            X.5wH r4 = (X.C123305wH) r4
            int r1 = r4.A02
            r0 = -1
            r2 = 0
            if (r1 == r0) goto L_0x017b
            if (r1 == 0) goto L_0x0185
            java.lang.String r2 = "Generic exception"
            if (r1 == r8) goto L_0x0155
            java.lang.String r0 = "AccountLinkingLoginManager/unlinkCurrentFbUserEntity failed to logout, Generic error"
            X.AnonymousClass00C.A0D(r0, r5)
            X.5VM r0 = new X.5VM
            r0.<init>((java.lang.String) r2)
            r3.A01(r0)
            return
        L_0x0155:
            int r1 = r4.A00
            r0 = 190(0xbe, float:2.66E-43)
            if (r1 != r0) goto L_0x016d
            java.lang.String r0 = "AccountLinkingLoginManager/unlinkCurrentFbUserEntity already invalidated at server"
            X.AnonymousClass00C.A0D(r0, r5)
            java.lang.Object r0 = r7.get()
            X.1UM r0 = (X.AnonymousClass1UM) r0
            r0.A04(r6, r5)
            r3.A00()
            return
        L_0x016d:
            java.lang.String r0 = "AccountLinkingLoginManager/unlinkCurrentFbUserEntity failed to logout"
            X.AnonymousClass00C.A0D(r0, r5)
            X.5VM r0 = new X.5VM
            r0.<init>((java.lang.String) r2)
            r3.A01(r0)
            return
        L_0x017b:
            r1 = 3
            X.5QX r0 = new X.5QX
            r0.<init>(r2, r2, r2, r1)
            r3.A01(r0)
            return
        L_0x0185:
            java.lang.String r0 = "AccountLinkingLoginManager/unlinkCurrentFbUserEntity success"
            X.AnonymousClass00C.A0D(r0, r5)
            java.lang.Object r0 = r7.get()
            X.1UM r0 = (X.AnonymousClass1UM) r0
            r0.A04(r6, r5)
        L_0x0193:
            r3.A00()
            return
        L_0x0197:
            java.lang.String r0 = "accountLinkingLoginManagerLazy"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x019e:
            java.lang.Object r0 = r10.A00
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r4 = r10.A01
            X.6Uv r4 = (X.C132686Uv) r4
            java.util.ArrayList r3 = X.C36321k7.A0J(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x01ae:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01b8
            X.C90464aC.A1T(r3, r1)
            goto L_0x01ae
        L_0x01b8:
            X.17Y r2 = r4.A01
            X.1i1 r1 = r4.A05
            X.005 r0 = r4.A08
            X.AnonymousClass6Y4.A05(r2, r1, r0, r3)
            return
        L_0x01c2:
            java.lang.Object r5 = r10.A00
            X.6tG r5 = (X.C145046tG) r5
            java.lang.Object r4 = r10.A01
            X.3T1 r4 = (X.AnonymousClass3T1) r4
            r3 = 1
            X.005 r0 = r5.A05
            java.lang.Object r2 = r0.get()
            X.1i6 r2 = (X.C35071i6) r2
            long r0 = r4.A1N
            X.C35071i6.A00(r2)
            X.00i r2 = r2.A00
            monitor-enter(r2)
            java.lang.Object r0 = r2.A05(r0)     // Catch:{ all -> 0x01fa }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x01fa }
            monitor-exit(r2)
            if (r0 == 0) goto L_0x0406
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x0406
            X.005 r0 = r5.A04
            java.lang.Object r1 = r0.get()
            X.6V7 r1 = (X.AnonymousClass6V7) r1
            java.util.List r0 = X.C36371kC.A11(r4)
            r1.A05(r0, r3)
            return
        L_0x01fa:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x01fd:
            java.lang.Object r4 = r10.A00
            X.6tG r4 = (X.C145046tG) r4
            java.lang.Object r3 = r10.A01
            r2 = 0
            X.005 r0 = r4.A03
            java.lang.Object r1 = r0.get()
            X.1UM r1 = (X.AnonymousClass1UM) r1
            X.1US r0 = X.AnonymousClass1US.CROSSPOST_MESSAGE_OBSERVER
            boolean r0 = r1.A06(r0)
            if (r0 == 0) goto L_0x0406
            X.005 r0 = r4.A04
            java.lang.Object r1 = r0.get()
            X.6V7 r1 = (X.AnonymousClass6V7) r1
            java.util.List r0 = X.C36371kC.A11(r3)
            r1.A05(r0, r2)
            return
        L_0x0224:
            java.lang.Object r3 = r10.A00
            X.3T1 r3 = (X.AnonymousClass3T1) r3
            java.lang.Object r2 = r10.A01
            X.6tG r2 = (X.C145046tG) r2
            boolean r0 = r3 instanceof X.AnonymousClass2bV
            if (r0 != 0) goto L_0x023c
            X.005 r0 = r2.A04
            java.lang.Object r0 = r0.get()
            X.6V7 r0 = (X.AnonymousClass6V7) r0
            r0.A03(r3)
            return
        L_0x023c:
            boolean r0 = r2.A00
            if (r0 == 0) goto L_0x0406
            X.1Ua r0 = r2.A02
            X.0yC r1 = r0.A01
            r0 = 4437(0x1155, float:6.218E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0406
            X.005 r0 = r2.A04
            java.lang.Object r0 = r0.get()
            X.6V7 r0 = (X.AnonymousClass6V7) r0
            X.2bV r3 = (X.AnonymousClass2bV) r3
            r0.A04(r3)
            return
        L_0x025a:
            java.lang.Object r5 = r10.A00
            com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity r5 = (com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity) r5
            java.lang.Object r4 = r10.A01
            X.3GB r4 = (X.AnonymousClass3GB) r4
            r3 = 1
            X.AnonymousClass00C.A0D(r4, r3)
            java.lang.String r0 = "AccountLinkingWebAuthActivity/onCreate Launching web auth url"
            r2 = 0
            X.AnonymousClass00C.A0D(r0, r2)
            X.1UZ r1 = r5.A05
            if (r1 == 0) goto L_0x0355
            java.lang.String r0 = "SEE_WEB_AUTH"
            r1.A04(r0)
            X.6JU r0 = r5.A02     // Catch:{ 5QY -> 0x034d }
            if (r0 == 0) goto L_0x033e
            X.011 r0 = r5.A07     // Catch:{ 5QY -> 0x034d }
            if (r0 == 0) goto L_0x0339
            java.lang.Object r6 = r0.second     // Catch:{ 5QY -> 0x034d }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ 5QY -> 0x034d }
            X.AnonymousClass00C.A0D(r6, r3)     // Catch:{ 5QY -> 0x034d }
            android.net.Uri r0 = X.AnonymousClass6JU.A00(r6)     // Catch:{ 5QY -> 0x034d }
            X.AnonymousClass00C.A08(r0)     // Catch:{ 5QY -> 0x034d }
            java.lang.String r8 = "android.intent.action.VIEW"
            android.content.Intent r7 = new android.content.Intent     // Catch:{ 5QY -> 0x034d }
            r7.<init>(r8, r0)     // Catch:{ 5QY -> 0x034d }
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch:{ 5QY -> 0x034d }
            r0 = 131072(0x20000, float:1.83671E-40)
            java.util.List r1 = r1.queryIntentActivities(r7, r0)     // Catch:{ 5QY -> 0x034d }
            X.AnonymousClass00C.A08(r1)     // Catch:{ 5QY -> 0x034d }
            boolean r0 = r1.isEmpty()     // Catch:{ 5QY -> 0x034d }
            if (r0 == 0) goto L_0x030b
            X.09w r7 = X.C023409w.A00     // Catch:{ 5QY -> 0x034d }
        L_0x02a7:
            boolean r0 = r7.isEmpty()     // Catch:{ 5QY -> 0x034d }
            if (r0 != 0) goto L_0x0345
            java.lang.String r7 = X.C52972qU.A00(r5, r7, r3)     // Catch:{ 5QY -> 0x034d }
            if (r7 == 0) goto L_0x0327
            android.content.res.Resources r1 = r5.getResources()     // Catch:{ 5QY -> 0x034d }
            r0 = 2131100516(0x7f060364, float:1.7813416E38)
            int r1 = r1.getColor(r0)     // Catch:{ 5QY -> 0x034d }
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 | r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ 5QY -> 0x034d }
            X.5gr r9 = new X.5gr     // Catch:{ 5QY -> 0x034d }
            r9.<init>(r0)     // Catch:{ 5QY -> 0x034d }
            X.6Sn r8 = new X.6Sn     // Catch:{ 5QY -> 0x034d }
            r8.<init>()     // Catch:{ 5QY -> 0x034d }
            r0 = 2
            r8.A00 = r0     // Catch:{ 5QY -> 0x034d }
            java.lang.String r0 = "android.support.customtabs.extra.SHARE_MENU_ITEM"
            android.content.Intent r1 = r8.A02     // Catch:{ 5QY -> 0x034d }
            r1.putExtra(r0, r2)     // Catch:{ 5QY -> 0x034d }
            java.lang.String r0 = "android.support.customtabs.extra.TITLE_VISIBILITY"
            r1.putExtra(r0, r3)     // Catch:{ 5QY -> 0x034d }
            java.lang.String r0 = "android.support.customtabs.extra.ENABLE_URLBAR_HIDING"
            r1.putExtra(r0, r3)     // Catch:{ 5QY -> 0x034d }
            android.os.Bundle r2 = X.AnonymousClass001.A07()     // Catch:{ 5QY -> 0x034d }
            java.lang.Integer r0 = r9.A00     // Catch:{ 5QY -> 0x034d }
            if (r0 == 0) goto L_0x02f4
            int r1 = r0.intValue()     // Catch:{ 5QY -> 0x034d }
            java.lang.String r0 = "android.support.customtabs.extra.TOOLBAR_COLOR"
            r2.putInt(r0, r1)     // Catch:{ 5QY -> 0x034d }
        L_0x02f4:
            r8.A01 = r2     // Catch:{ 5QY -> 0x034d }
            X.5gs r0 = r8.A02()     // Catch:{ 5QY -> 0x034d }
            android.content.Intent r1 = r0.A00     // Catch:{ 5QY -> 0x034d }
            r1.setPackage(r7)     // Catch:{ 5QY -> 0x034d }
            android.net.Uri r0 = X.AnonymousClass6JU.A00(r6)     // Catch:{ 5QY -> 0x034d }
            r1.setData(r0)     // Catch:{ 5QY -> 0x034d }
            r0 = 0
            X.C05290Pd.A00(r5, r1, r0)     // Catch:{ 5QY -> 0x034d }
            goto L_0x0352
        L_0x030b:
            java.util.ArrayList r7 = X.C36321k7.A0J(r1)     // Catch:{ 5QY -> 0x034d }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ 5QY -> 0x034d }
        L_0x0313:
            boolean r0 = r1.hasNext()     // Catch:{ 5QY -> 0x034d }
            if (r0 == 0) goto L_0x02a7
            java.lang.Object r0 = r1.next()     // Catch:{ 5QY -> 0x034d }
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0     // Catch:{ 5QY -> 0x034d }
            android.content.pm.ActivityInfo r0 = r0.activityInfo     // Catch:{ 5QY -> 0x034d }
            java.lang.String r0 = r0.packageName     // Catch:{ 5QY -> 0x034d }
            r7.add(r0)     // Catch:{ 5QY -> 0x034d }
            goto L_0x0313
        L_0x0327:
            android.net.Uri r0 = X.AnonymousClass6JU.A00(r6)     // Catch:{ 5QY -> 0x034d }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ 5QY -> 0x034d }
            r1.<init>(r8, r0)     // Catch:{ 5QY -> 0x034d }
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            r1.addFlags(r0)     // Catch:{ 5QY -> 0x034d }
            r5.startActivity(r1)     // Catch:{ 5QY -> 0x034d }
            goto L_0x0352
        L_0x0339:
            java.lang.IllegalStateException r2 = X.C36381kD.A0l()     // Catch:{ 5QY -> 0x034d }
            goto L_0x034c
        L_0x033e:
            java.lang.String r0 = "webAuthBrowserLauncher"
            java.lang.RuntimeException r2 = X.C36331k8.A0d(r0)     // Catch:{ 5QY -> 0x034d }
            goto L_0x034c
        L_0x0345:
            r1 = 3
            r0 = 0
            X.5QY r2 = new X.5QY     // Catch:{ 5QY -> 0x034d }
            r2.<init>(r0, r0, r0, r1)     // Catch:{ 5QY -> 0x034d }
        L_0x034c:
            throw r2     // Catch:{ 5QY -> 0x034d }
        L_0x034d:
            r1 = move-exception
            r0 = 0
            com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity.A01(r1, r5, r4, r0, r0)
        L_0x0352:
            r5.A09 = r3
            return
        L_0x0355:
            java.lang.String r0 = "xFamilyUserFlowLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x035c:
            java.lang.Object r4 = r10.A00
            com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity r4 = (com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity) r4
            java.lang.Object r3 = r10.A01
            X.3GB r3 = (X.AnonymousClass3GB) r3
            boolean r2 = X.C36331k8.A1a(r4, r3)
            X.5Fd r1 = r4.A3i()
            r0 = 0
            r1.A00(r0, r0, r0, r2)
            r3.A00()
            r4.finish()
            return
        L_0x0377:
            java.lang.Object r2 = r10.A00
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            java.lang.Object r1 = r10.A01
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            r2.setImageDrawable(r1)
            return
        L_0x0387:
            java.lang.Object r5 = r10.A00
            com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity r5 = (com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity) r5
            java.lang.Object r4 = r10.A01
            X.3GB r4 = (X.AnonymousClass3GB) r4
            r0 = 1
            X.AnonymousClass00C.A0D(r4, r0)
            X.5u5 r3 = r5.A04
            if (r3 == 0) goto L_0x03d2
            X.1US r7 = X.AnonymousClass1US.ACCOUNT_LINKING_NATIVE_AUTH_ACTIVITY
            X.6bU r2 = r5.A05
            if (r2 != 0) goto L_0x03a4
            java.lang.String r0 = "fb4aUserEntityForNativeAuth"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x03a4:
            X.5rf r1 = new X.5rf
            r1.<init>(r5, r4)
            X.005 r0 = r3.A00
            java.lang.Object r6 = r0.get()
            X.6Ju r6 = (X.C130116Ju) r6
            X.6bk r5 = r2.A00
            X.638 r4 = new X.638
            r4.<init>(r3, r7, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "NativeAuthTokenExchangeHelper/exchangeFb4aTokenForWaCrosspostingToken called by caller "
            java.lang.String r1 = X.AnonymousClass000.A0l(r7, r0, r1)
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            long r2 = X.AnonymousClass6MQ.A01
            r1 = 3
            X.6Ee r0 = new X.6Ee
            r0.<init>(r1, r2)
            X.C130116Ju.A00(r0, r5, r4, r6, r7)
            return
        L_0x03d2:
            java.lang.String r0 = "accountLinkingLoginManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x03d9:
            java.lang.Object r0 = r10.A00
            X.5xy r0 = (X.C124325xy) r0
            java.lang.Object r4 = r10.A01
            android.content.Context r4 = (android.content.Context) r4
            X.0v5 r0 = r0.A01
            java.lang.Object r0 = r0.A02()
            if (r0 == 0) goto L_0x0406
            r3 = 0
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity"
            r2.setClassName(r1, r0)
            X.C05290Pd.A00(r4, r2, r3)
            return
        L_0x03fb:
            java.lang.Object r1 = r10.A01
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0 = 0
            android.os.Process.setThreadPriority(r0)
            r1.run()
        L_0x0406:
            return
        L_0x0407:
            java.lang.Object r3 = r10.A01     // Catch:{ IOException -> 0x049c }
            org.whispersystems.jobqueue.Job r3 = (org.whispersystems.jobqueue.Job) r3     // Catch:{ IOException -> 0x049c }
            org.whispersystems.jobqueue.JobParameters r0 = r3.parameters     // Catch:{ IOException -> 0x049c }
            boolean r0 = r0.isPersistent     // Catch:{ IOException -> 0x049c }
            if (r0 == 0) goto L_0x046e
            java.lang.Object r0 = r10.A00     // Catch:{ IOException -> 0x049c }
            X.650 r0 = (X.AnonymousClass650) r0     // Catch:{ IOException -> 0x049c }
            X.6NH r5 = r0.A06     // Catch:{ IOException -> 0x049c }
            android.content.ContentValues r6 = X.C36441kJ.A0E()     // Catch:{ IOException -> 0x049c }
            java.io.ByteArrayOutputStream r1 = X.C90524aI.A0Q()     // Catch:{ NotSerializableException -> 0x0457 }
            java.io.ObjectOutputStream r0 = new java.io.ObjectOutputStream     // Catch:{ NotSerializableException -> 0x0457 }
            r0.<init>(r1)     // Catch:{ NotSerializableException -> 0x0457 }
            r0.writeObject(r3)     // Catch:{ NotSerializableException -> 0x0457 }
            byte[] r0 = r1.toByteArray()     // Catch:{ NotSerializableException -> 0x0457 }
            java.lang.String r1 = X.C112105dM.A00(r0)     // Catch:{ NotSerializableException -> 0x0457 }
            java.lang.String r0 = "item"
            r6.put(r0, r1)     // Catch:{ IOException -> 0x049c }
            java.lang.Boolean r1 = X.C36381kD.A0j()     // Catch:{ IOException -> 0x049c }
            java.lang.String r0 = "encrypted"
            r6.put(r0, r1)     // Catch:{ IOException -> 0x049c }
            java.util.concurrent.locks.ReentrantReadWriteLock r4 = r5.A02     // Catch:{ all -> 0x0491 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r4.readLock()     // Catch:{ all -> 0x0491 }
            r0.lock()     // Catch:{ all -> 0x0491 }
            X.4bL r0 = r5.A03     // Catch:{ all -> 0x0491 }
            android.database.sqlite.SQLiteDatabase r2 = r0.getWritableDatabase()     // Catch:{ all -> 0x0491 }
            java.lang.String r1 = "queue"
            r0 = 0
            long r0 = r2.insert(r1, r0, r6)     // Catch:{ all -> 0x0491 }
            r3.A08(r0)     // Catch:{ all -> 0x0491 }
            goto L_0x0467
        L_0x0457:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x049c }
            java.lang.String r0 = "Can't serialize job:"
            java.lang.String r0 = X.AnonymousClass000.A0l(r3, r0, r1)     // Catch:{ IOException -> 0x049c }
            java.lang.RuntimeException r2 = X.C90524aI.A0e(r0, r2)     // Catch:{ IOException -> 0x049c }
            goto L_0x049b
        L_0x0467:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r4.readLock()     // Catch:{ IOException -> 0x049c }
            r0.unlock()     // Catch:{ IOException -> 0x049c }
        L_0x046e:
            java.lang.Object r1 = r10.A00     // Catch:{ IOException -> 0x049c }
            X.650 r1 = (X.AnonymousClass650) r1     // Catch:{ IOException -> 0x049c }
            android.content.Context r0 = r1.A01     // Catch:{ IOException -> 0x049c }
            X.AnonymousClass6HV.A00(r0, r3)     // Catch:{ IOException -> 0x049c }
            r3.A09()     // Catch:{ IOException -> 0x049c }
            X.6OM r1 = r1.A05     // Catch:{ IOException -> 0x049c }
            monitor-enter(r1)     // Catch:{ IOException -> 0x049c }
            java.util.LinkedList r0 = r1.A01     // Catch:{ all -> 0x048e }
            r0.add(r3)     // Catch:{ all -> 0x048e }
            X.AnonymousClass6OM.A00(r3, r1)     // Catch:{ all -> 0x048e }
            X.78b r0 = r1.A05     // Catch:{ all -> 0x048e }
            android.os.ConditionVariable r0 = r0.A00     // Catch:{ all -> 0x048e }
            r0.open()     // Catch:{ all -> 0x048e }
            monitor-exit(r1)     // Catch:{ IOException -> 0x049c }
            return
        L_0x048e:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ IOException -> 0x049c }
            goto L_0x049b
        L_0x0491:
            r2 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r5.A02     // Catch:{ IOException -> 0x049c }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()     // Catch:{ IOException -> 0x049c }
            r0.unlock()     // Catch:{ IOException -> 0x049c }
        L_0x049b:
            throw r2     // Catch:{ IOException -> 0x049c }
        L_0x049c:
            r1 = move-exception
            java.lang.String r0 = "JobManager"
            android.util.Log.w(r0, r1)
            java.lang.Object r0 = r10.A01
            org.whispersystems.jobqueue.Job r0 = (org.whispersystems.jobqueue.Job) r0
            r0.A0A()
            return
        L_0x04aa:
            java.lang.String r0 = "MediaCodecVideoEncoder Java releaseEncoder on release thread"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x04c3 }
            java.lang.Object r1 = r10.A00     // Catch:{ Exception -> 0x04c3 }
            org.wawebrtc.MediaCodecVideoEncoder r1 = (org.wawebrtc.MediaCodecVideoEncoder) r1     // Catch:{ Exception -> 0x04c3 }
            android.media.MediaCodec r0 = r1.mediaCodec     // Catch:{ Exception -> 0x04c3 }
            r0.stop()     // Catch:{ Exception -> 0x04c3 }
            android.media.MediaCodec r0 = r1.mediaCodec     // Catch:{ Exception -> 0x04c3 }
            r0.release()     // Catch:{ Exception -> 0x04c3 }
            java.lang.String r0 = "MediaCodecVideoEncoder Java releaseEncoder on release thread done"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x04c3 }
            goto L_0x04ea
        L_0x04c3:
            r1 = move-exception
            java.lang.String r0 = "MediaCodecVideoEncoder Media encoder release failed"
            goto L_0x04e7
        L_0x04c7:
            java.lang.String r0 = "MediaCodecVideoDecoder Java releaseDecoder on release thread"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x04e4 }
            java.lang.Object r1 = r10.A00     // Catch:{ Exception -> 0x04e4 }
            org.wawebrtc.MediaCodecVideoDecoder r1 = (org.wawebrtc.MediaCodecVideoDecoder) r1     // Catch:{ Exception -> 0x04e4 }
            android.media.MediaCodec r0 = r1.mediaCodec     // Catch:{ Exception -> 0x04e4 }
            if (r0 == 0) goto L_0x04d7
            r0.stop()     // Catch:{ Exception -> 0x04e4 }
        L_0x04d7:
            android.media.MediaCodec r0 = r1.mediaCodec     // Catch:{ Exception -> 0x04e4 }
            if (r0 == 0) goto L_0x04de
            r0.release()     // Catch:{ Exception -> 0x04e4 }
        L_0x04de:
            java.lang.String r0 = "MediaCodecVideoDecoder Java releaseDecoder on release thread done"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x04e4 }
            goto L_0x04ea
        L_0x04e4:
            r1 = move-exception
            java.lang.String r0 = "MediaCodecVideoDecoder Media decoder release failed"
        L_0x04e7:
            com.whatsapp.util.Log.e(r0, r1)
        L_0x04ea:
            java.lang.Object r0 = r10.A01
            java.util.concurrent.CountDownLatch r0 = (java.util.concurrent.CountDownLatch) r0
            r0.countDown()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1498272x.run():void");
    }
}
