package X;

/* renamed from: X.74N  reason: invalid class name */
public class AnonymousClass74N implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass74N(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public static AnonymousClass74N A00(Object obj, Object obj2, int i) {
        return new AnonymousClass74N(obj, obj2, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0782, code lost:
        X.AnonymousClass6JI.A00(r1, X.AnonymousClass6MO.A01, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0787, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0113, code lost:
        X.C36321k7.A1K(r3, r0, r1);
        r1 = X.C36441kJ.A0j().A1Y(r2, r3);
        X.AnonymousClass3M9.A01(r1, "AcceptInviteLinkActivity");
        r2.A33(r1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0127, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01f3, code lost:
        if (r3 > 0) goto L_0x01f5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x04be  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x04dd  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0514  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x053c  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0563  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0601  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r33 = this;
            r5 = r33
            int r0 = r5.A02
            switch(r0) {
                case 0: goto L_0x0163;
                case 1: goto L_0x0011;
                case 2: goto L_0x016f;
                case 3: goto L_0x017a;
                case 4: goto L_0x02f6;
                case 5: goto L_0x0008;
                case 6: goto L_0x002e;
                case 7: goto L_0x004c;
                case 8: goto L_0x0066;
                case 9: goto L_0x0080;
                case 10: goto L_0x009a;
                case 11: goto L_0x0305;
                case 12: goto L_0x0333;
                case 13: goto L_0x0128;
                case 14: goto L_0x0405;
                case 15: goto L_0x0431;
                case 16: goto L_0x0446;
                case 17: goto L_0x044e;
                case 18: goto L_0x0007;
                case 19: goto L_0x0007;
                case 20: goto L_0x0007;
                case 21: goto L_0x0007;
                case 22: goto L_0x0007;
                case 23: goto L_0x0007;
                case 24: goto L_0x0632;
                case 25: goto L_0x0645;
                case 26: goto L_0x0680;
                case 27: goto L_0x06b4;
                case 28: goto L_0x06f0;
                case 29: goto L_0x071d;
                case 30: goto L_0x0729;
                case 31: goto L_0x00b4;
                case 32: goto L_0x00da;
                case 33: goto L_0x00f3;
                case 34: goto L_0x0774;
                case 35: goto L_0x0774;
                case 36: goto L_0x0761;
                case 37: goto L_0x0761;
                case 38: goto L_0x0761;
                case 39: goto L_0x0761;
                case 40: goto L_0x0761;
                case 41: goto L_0x0774;
                case 42: goto L_0x0788;
                case 43: goto L_0x07dd;
                case 44: goto L_0x07ee;
                case 45: goto L_0x080f;
                case 46: goto L_0x081b;
                case 47: goto L_0x0859;
                case 48: goto L_0x0883;
                case 49: goto L_0x08b4;
                default: goto L_0x0007;
            }
        L_0x0007:
            return
        L_0x0008:
            java.lang.Object r0 = r5.A01     // Catch:{ Exception -> 0x0007 }
            java.io.File r0 = (java.io.File) r0     // Catch:{ Exception -> 0x0007 }
            r0.delete()     // Catch:{ Exception -> 0x0007 }
            goto L_0x0927
        L_0x0011:
            java.lang.Object r2 = r5.A01
            X.6Wy r2 = (X.C133146Wy) r2
            java.lang.Object r0 = r5.A00
            X.0fG r0 = (X.C10810fG) r0
            java.lang.Object r1 = r0.element
            X.4r7 r1 = (X.C98244r7) r1
            java.lang.Object r0 = r1.A00()
            X.6Aw r0 = (X.C128096Aw) r0
            boolean r0 = X.C133146Wy.A03(r2, r1, r0)
            if (r0 == 0) goto L_0x0007
            r0 = 0
            X.C133146Wy.A02(r2, r0)
            return
        L_0x002e:
            java.lang.Object r0 = r5.A00
            X.A2e r0 = (X.C20990A2e) r0
            java.lang.Object r2 = r5.A01
            X.5oW r2 = (X.C118655oW) r2
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A00
            java.util.Iterator r1 = r0.iterator()
        L_0x003c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0007
            java.lang.Object r0 = r1.next()
            X.7m6 r0 = (X.C161067m6) r0
            r0.Bhw(r2)
            goto L_0x003c
        L_0x004c:
            java.lang.Object r0 = r5.A00
            java.util.Iterator r2 = X.C90494aF.A0h(r0)
        L_0x0052:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0007
            java.lang.Object r1 = r2.next()
            X.7m6 r1 = (X.C161067m6) r1
            java.lang.Object r0 = r5.A01
            java.util.List r0 = (java.util.List) r0
            r1.BV0(r0)
            goto L_0x0052
        L_0x0066:
            java.lang.Object r0 = r5.A00
            java.util.Iterator r2 = X.C90494aF.A0h(r0)
        L_0x006c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0007
            java.lang.Object r1 = r2.next()
            X.7m6 r1 = (X.C161067m6) r1
            java.lang.Object r0 = r5.A01
            X.9iQ r0 = (X.C200889iQ) r0
            r1.Bka(r0)
            goto L_0x006c
        L_0x0080:
            java.lang.Object r0 = r5.A00
            java.util.Iterator r2 = X.C90494aF.A0h(r0)
        L_0x0086:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0007
            java.lang.Object r1 = r2.next()
            X.7m6 r1 = (X.C161067m6) r1
            java.lang.Object r0 = r5.A01
            java.util.List r0 = (java.util.List) r0
            r1.BjB(r0)
            goto L_0x0086
        L_0x009a:
            java.lang.Object r0 = r5.A00
            java.util.Iterator r2 = X.C90494aF.A0h(r0)
        L_0x00a0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0007
            java.lang.Object r1 = r2.next()
            X.7m6 r1 = (X.C161067m6) r1
            java.lang.Object r0 = r5.A01
            byte[] r0 = (byte[]) r0
            r1.BbV(r0)
            goto L_0x00a0
        L_0x00b4:
            java.lang.Object r4 = r5.A00
            com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity r4 = (com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity) r4
            java.lang.Object r3 = r5.A01
            byte[] r3 = (byte[]) r3
            boolean r0 = r4.BLh()
            if (r0 != 0) goto L_0x0007
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "AcceptInviteLinkActivity/fetchGroupProfilePicture: "
            r2.append(r0)
            int r1 = r3.length
            X.C36321k7.A1Y(r2, r1)
            r0 = 0
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeByteArray(r3, r0, r1)
            X.3HI r0 = r4.A0G
            r0.A00(r1)
            return
        L_0x00da:
            java.lang.Object r0 = r5.A00
            X.4YE r0 = (X.AnonymousClass4YE) r0
            java.lang.Object r3 = r5.A01
            X.11F r3 = (X.AnonymousClass11F) r3
            java.lang.Object r2 = r0.A00
            X.14u r2 = (X.C225314u) r2
            boolean r0 = r2.BLh()
            if (r0 != 0) goto L_0x0007
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "acceptlink/onConversationChanged/ok/"
            goto L_0x0113
        L_0x00f3:
            java.lang.Object r0 = r5.A00
            X.4YE r0 = (X.AnonymousClass4YE) r0
            java.lang.Object r3 = r5.A01
            X.11F r3 = (X.AnonymousClass11F) r3
            java.lang.Object r2 = r0.A00
            com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity r2 = (com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity) r2
            boolean r0 = r2.BLh()
            if (r0 != 0) goto L_0x0007
            X.12q r0 = r2.A06
            boolean r0 = r0.A0M(r3)
            if (r0 == 0) goto L_0x0007
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "acceptlink/onConversationsListChanged/ok/"
        L_0x0113:
            X.C36321k7.A1K(r3, r0, r1)
            X.190 r0 = X.C36441kJ.A0j()
            android.content.Intent r1 = r0.A1Y(r2, r3)
            java.lang.String r0 = "AcceptInviteLinkActivity"
            X.AnonymousClass3M9.A01(r1, r0)
            r0 = 1
            r2.A33(r1, r0)
            return
        L_0x0128:
            java.lang.Object r4 = r5.A01     // Catch:{ all -> 0x0155 }
            X.9l0 r4 = (X.C202079l0) r4     // Catch:{ all -> 0x0155 }
            X.6By r3 = r4.A06     // Catch:{ all -> 0x0155 }
            r0 = 1
            java.util.concurrent.atomic.AtomicBoolean r2 = r3.A01     // Catch:{ all -> 0x0155 }
            r2.set(r0)     // Catch:{ all -> 0x0155 }
            java.util.concurrent.atomic.AtomicInteger r0 = r3.A02     // Catch:{ all -> 0x0155 }
            int r1 = r0.get()     // Catch:{ all -> 0x0155 }
            r0 = 10
            if (r1 != r0) goto L_0x0149
            java.lang.Object r1 = r3.A00     // Catch:{ all -> 0x0155 }
            monitor-enter(r1)     // Catch:{ all -> 0x0155 }
            r1.notify()     // Catch:{ all -> 0x0145 }
            goto L_0x0148
        L_0x0145:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0155 }
            throw r0     // Catch:{ all -> 0x0155 }
        L_0x0148:
            monitor-exit(r1)     // Catch:{ all -> 0x0155 }
        L_0x0149:
            java.lang.Object r0 = r5.A00     // Catch:{ all -> 0x0155 }
            X.02t r0 = (X.C006302t) r0     // Catch:{ all -> 0x0155 }
            r0.invoke(r4)     // Catch:{ all -> 0x0155 }
            r0 = 0
            r2.set(r0)
            return
        L_0x0155:
            r2 = move-exception
            java.lang.Object r0 = r5.A01
            X.9l0 r0 = (X.C202079l0) r0
            X.6By r0 = r0.A06
            r1 = 0
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A01
            r0.set(r1)
            throw r2
        L_0x0163:
            java.lang.Object r1 = r5.A00
            X.61X r1 = (X.AnonymousClass61X) r1
            java.lang.Object r0 = r5.A01
            java.lang.Exception r0 = (java.lang.Exception) r0
            r1.A00(r0)
            return
        L_0x016f:
            java.lang.Object r0 = r5.A01
            X.6mI r0 = (X.C140866mI) r0
            r0.B8W()
            r0.BHe()
            return
        L_0x017a:
            java.lang.Object r0 = r5.A01
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r7 = r0.getValue()
            X.4rU r7 = (X.C98474rU) r7
            monitor-enter(r7)
            java.lang.Object r6 = r5.A00     // Catch:{ all -> 0x02f3 }
            X.6mM r6 = (X.C140906mM) r6     // Catch:{ all -> 0x02f3 }
            java.lang.Object r2 = r0.getKey()     // Catch:{ all -> 0x02f3 }
            java.io.File r2 = (java.io.File) r2     // Catch:{ all -> 0x02f3 }
            java.lang.String r1 = r7.A03     // Catch:{ all -> 0x02f3 }
            java.lang.String r0 = "stash"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x02f3 }
            if (r0 == 0) goto L_0x01d6
            boolean r0 = r7 instanceof X.C98534ra     // Catch:{ all -> 0x02f3 }
            if (r0 == 0) goto L_0x01d4
            r0 = r7
            X.4ra r0 = (X.C98534ra) r0     // Catch:{ all -> 0x02f3 }
            java.lang.ref.WeakReference r0 = r0.A00     // Catch:{ all -> 0x02f3 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x02f3 }
            X.7lg r1 = (X.C160847lg) r1     // Catch:{ all -> 0x02f3 }
        L_0x01a8:
            boolean r0 = r1 instanceof com.facebook.stash.core.FileStash     // Catch:{ all -> 0x02f3 }
            if (r0 == 0) goto L_0x01cc
            com.facebook.stash.core.FileStash r1 = (com.facebook.stash.core.FileStash) r1     // Catch:{ all -> 0x02f3 }
        L_0x01ae:
            X.6mQ r9 = new X.6mQ     // Catch:{ all -> 0x02f3 }
            r9.<init>(r1)     // Catch:{ all -> 0x02f3 }
        L_0x01b3:
            X.4rX r5 = r7.A01     // Catch:{ all -> 0x02f3 }
            r1 = 0
            if (r5 == 0) goto L_0x01e1
            java.lang.Boolean r3 = r6.A01     // Catch:{ all -> 0x02f3 }
            if (r3 != 0) goto L_0x01e9
            X.7ey r0 = r6.A03     // Catch:{ all -> 0x02f3 }
            X.7il r0 = (X.C159077il) r0     // Catch:{ all -> 0x02f3 }
            boolean r0 = r0.BNi()     // Catch:{ all -> 0x02f3 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x02f3 }
            r6.A01 = r3     // Catch:{ all -> 0x02f3 }
            goto L_0x01de
        L_0x01cc:
            X.7ey r0 = r6.A03     // Catch:{ all -> 0x02f3 }
            X.6mJ r1 = new X.6mJ     // Catch:{ all -> 0x02f3 }
            r1.<init>(r0, r2)     // Catch:{ all -> 0x02f3 }
            goto L_0x01ae
        L_0x01d4:
            r1 = 0
            goto L_0x01a8
        L_0x01d6:
            X.7ey r0 = r6.A03     // Catch:{ all -> 0x02f3 }
            X.6mR r9 = new X.6mR     // Catch:{ all -> 0x02f3 }
            r9.<init>(r0, r2)     // Catch:{ all -> 0x02f3 }
            goto L_0x01b3
        L_0x01de:
            if (r0 == 0) goto L_0x01e9
            goto L_0x01e3
        L_0x01e1:
            r3 = r1
            goto L_0x01f5
        L_0x01e3:
            java.lang.Boolean r0 = X.C36371kC.A0m()     // Catch:{ all -> 0x02f3 }
            r6.A00 = r0     // Catch:{ all -> 0x02f3 }
        L_0x01e9:
            boolean r0 = r3.booleanValue()     // Catch:{ all -> 0x02f3 }
            if (r0 == 0) goto L_0x01fc
            long r3 = r5.A02     // Catch:{ all -> 0x02f3 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x01fc
        L_0x01f5:
            X.4rV r0 = r7.A02     // Catch:{ all -> 0x02f3 }
            if (r0 == 0) goto L_0x021e
            long r5 = r0.A00     // Catch:{ all -> 0x02f3 }
            goto L_0x0220
        L_0x01fc:
            java.lang.Boolean r0 = r6.A00     // Catch:{ all -> 0x02f3 }
            if (r0 != 0) goto L_0x020e
            X.7ey r0 = r6.A03     // Catch:{ all -> 0x02f3 }
            X.7il r0 = (X.C159077il) r0     // Catch:{ all -> 0x02f3 }
            boolean r0 = r0.BMJ()     // Catch:{ all -> 0x02f3 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x02f3 }
            r6.A00 = r0     // Catch:{ all -> 0x02f3 }
        L_0x020e:
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x02f3 }
            if (r0 == 0) goto L_0x021b
            long r3 = r5.A01     // Catch:{ all -> 0x02f3 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x021b
            goto L_0x01f5
        L_0x021b:
            long r1 = r5.A00     // Catch:{ all -> 0x02f3 }
            goto L_0x01e1
        L_0x021e:
            r5 = 0
        L_0x0220:
            r14 = 0
            int r0 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x022c
            int r0 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x022c
            goto L_0x02c3
        L_0x022c:
            java.util.Collection r2 = r9.B8V()     // Catch:{ all -> 0x02f3 }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x02f3 }
            if (r0 != 0) goto L_0x02c3
            int r0 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x023d
            r12 = -1
            goto L_0x0245
        L_0x023d:
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02f3 }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r0
            long r12 = r12 - r5
        L_0x0245:
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x02f3 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x02f3 }
        L_0x024d:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x02f3 }
            if (r0 == 0) goto L_0x0260
            java.lang.String r1 = X.AnonymousClass001.A0C(r2)     // Catch:{ all -> 0x02f3 }
            X.5sM r0 = new X.5sM     // Catch:{ all -> 0x02f3 }
            r0.<init>(r9, r1)     // Catch:{ all -> 0x02f3 }
            r5.add(r0)     // Catch:{ all -> 0x02f3 }
            goto L_0x024d
        L_0x0260:
            java.util.HashMap r8 = X.AnonymousClass001.A0J()     // Catch:{ all -> 0x02f3 }
            r6 = 3
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 < 0) goto L_0x0297
            X.7qx r0 = new X.7qx     // Catch:{ all -> 0x02f3 }
            r0.<init>(r6)     // Catch:{ all -> 0x02f3 }
            java.util.Collections.sort(r5, r0)     // Catch:{ all -> 0x02f3 }
            java.util.ListIterator r11 = r5.listIterator()     // Catch:{ all -> 0x02f3 }
        L_0x0275:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x02f3 }
            if (r0 == 0) goto L_0x0297
            java.lang.Object r10 = r11.next()     // Catch:{ all -> 0x02f3 }
            X.5sM r10 = (X.C120955sM) r10     // Catch:{ all -> 0x02f3 }
            if (r10 == 0) goto L_0x0297
            java.lang.Long r0 = r10.A00     // Catch:{ all -> 0x02f3 }
            long r1 = r0.longValue()     // Catch:{ all -> 0x02f3 }
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x0297
            r11.remove()     // Catch:{ all -> 0x02f3 }
            java.lang.String r1 = r10.A02     // Catch:{ all -> 0x02f3 }
            r0 = 2
            X.C36341k9.A1K(r1, r8, r0)     // Catch:{ all -> 0x02f3 }
            goto L_0x0275
        L_0x0297:
            int r0 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x02c7
            r1 = 4
            X.7qx r0 = new X.7qx     // Catch:{ all -> 0x02f3 }
            r0.<init>(r1)     // Catch:{ all -> 0x02f3 }
            java.util.Collections.sort(r5, r0)     // Catch:{ all -> 0x02f3 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x02f3 }
        L_0x02a8:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x02f3 }
            if (r0 == 0) goto L_0x02c7
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x02f3 }
            X.5sM r0 = (X.C120955sM) r0     // Catch:{ all -> 0x02f3 }
            java.lang.String r2 = r0.A02     // Catch:{ all -> 0x02f3 }
            long r0 = r9.BNn(r2)     // Catch:{ all -> 0x02f3 }
            long r14 = r14 + r0
            int r0 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x02a8
            X.C36341k9.A1K(r2, r8, r6)     // Catch:{ all -> 0x02f3 }
            goto L_0x02a8
        L_0x02c3:
            java.util.Map r8 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x02f3 }
        L_0x02c7:
            java.util.Iterator r3 = X.AnonymousClass000.A0y(r8)     // Catch:{ all -> 0x02f3 }
        L_0x02cb:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x02f3 }
            if (r0 == 0) goto L_0x02f1
            java.util.Map$Entry r2 = X.AnonymousClass000.A11(r3)     // Catch:{ all -> 0x02f3 }
            java.lang.String r0 = X.C90494aF.A0f(r2)     // Catch:{ all -> 0x02f3 }
            r9.BNZ(r0)     // Catch:{ all -> 0x02f3 }
            boolean r0 = r9.Bnd(r0)     // Catch:{ all -> 0x02f3 }
            if (r0 == 0) goto L_0x02cb
            java.lang.Object r0 = r2.getValue()     // Catch:{ all -> 0x02f3 }
            int r1 = X.C90514aH.A0H(r0)     // Catch:{ all -> 0x02f3 }
            r0 = 3
            if (r1 == r0) goto L_0x02cb
            r2.getValue()     // Catch:{ all -> 0x02f3 }
            goto L_0x02cb
        L_0x02f1:
            monitor-exit(r7)     // Catch:{ all -> 0x02f3 }
            return
        L_0x02f3:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x02f3 }
            throw r0
        L_0x02f6:
            java.lang.Object r0 = r5.A00
            X.77Q r0 = (X.AnonymousClass77Q) r0
            int r0 = r0.A00
            android.os.Process.setThreadPriority(r0)
            java.lang.Object r0 = r5.A01
            X.C36411kG.A1O(r0)
            return
        L_0x0305:
            java.lang.Object r0 = r5.A00
            X.9lT r0 = (X.C202289lT) r0
            X.AUR r1 = r0.A0B
            boolean r0 = r1.enableWarmCodec
            if (r0 == 0) goto L_0x032b
            boolean r2 = r1.warmupVp9Codec
            boolean r1 = r1.warmupAv1Codec
            java.lang.String r0 = "video/avc"
            X.C203599oN.A05(r0)
            java.lang.String r0 = "audio/mp4a-latm"
            X.C203599oN.A05(r0)
            if (r2 == 0) goto L_0x0324
            java.lang.String r0 = "video/x-vnd.on2.vp9"
            X.C203599oN.A05(r0)
        L_0x0324:
            if (r1 == 0) goto L_0x032b
            java.lang.String r0 = "video/av01"
            X.C203599oN.A05(r0)
        L_0x032b:
            java.lang.Object r0 = r5.A01
            android.os.Looper r0 = (android.os.Looper) r0
            r0.quit()
            return
        L_0x0333:
            java.lang.Object r9 = r5.A00
            X.9pt r9 = (X.C204369pt) r9
            java.lang.Object r12 = r5.A01
            X.9Xa r12 = (X.C195979Xa) r12
            java.lang.Object[] r1 = X.C90524aI.A0w()
            java.lang.String r0 = "Create new ExoPlayer"
            X.C204369pt.A0F(r9, r0, r1)
            X.AUR r2 = r9.A0p
            X.AUJ r0 = r2.unstallBufferSetting
            r16 = r0
            X.5i3 r0 = new X.5i3
            r0.<init>()
            X.5wt r13 = new X.5wt
            r13.<init>(r0)
            X.5Yd r0 = new X.5Yd
            r0.<init>()
            r9.A0N = r0
            X.9um r0 = r12.A0F
            java.lang.String r4 = r0.A0H
            java.util.concurrent.atomic.AtomicReference r11 = r9.A0W
            X.9OD r10 = r9.A0m
            X.94C r0 = r10.A03
            com.facebook.video.heroplayer.service.ServiceEventCallbackImpl r8 = new com.facebook.video.heroplayer.service.ServiceEventCallbackImpl
            r8.<init>(r0, r4, r11)
            X.6me r0 = new X.6me
            r0.<init>()
            java.util.HashMap r3 = X.AnonymousClass001.A0J()
            java.lang.String r1 = r12.A08
            if (r1 == 0) goto L_0x0397
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0397
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0v(r1)
            java.lang.String r0 = "_"
            r5.append(r0)
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r0 = java.lang.Long.toString(r0)
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r5)
            java.lang.String r0 = "session_id"
            r3.put(r0, r1)
        L_0x0397:
            if (r4 == 0) goto L_0x039e
            java.lang.String r0 = "asset_id"
            r3.put(r0, r4)
        L_0x039e:
            X.6mX r7 = new X.6mX
            r7.<init>()
            r9.A0M = r7
            X.7cI r6 = r9.A0Q
            if (r6 != 0) goto L_0x03b6
            X.72C r0 = r2.tslogSettings
            boolean r0 = r0.enableTslog
            if (r0 == 0) goto L_0x03b6
            X.6md r6 = new X.6md
            r6.<init>()
            r9.A0Q = r6
        L_0x03b6:
            android.content.Context r0 = r9.A0D
            r32 = r0
            android.os.Handler r0 = r9.A0E
            r31 = r0
            X.9jy r15 = r9.A0L
            java.util.Map r14 = r9.A0V
            java.util.concurrent.atomic.AtomicBoolean r5 = r9.A0t
            java.util.concurrent.atomic.AtomicBoolean r4 = r9.A0q
            java.util.concurrent.atomic.AtomicBoolean r3 = r9.A0r
            X.9D5 r2 = r9.A0n
            X.5Yd r1 = r9.A0N
            X.9n2 r0 = new X.9n2
            r28 = r4
            r29 = r3
            r30 = r11
            r25 = r6
            r26 = r14
            r27 = r5
            r22 = r9
            r23 = r8
            r24 = r16
            r19 = r12
            r20 = r10
            r21 = r2
            r16 = r7
            r17 = r1
            r18 = r13
            r13 = r32
            r14 = r31
            r12 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r9.A12 = r0
            X.6mY r0 = new X.6mY
            r0.<init>(r9)
            r9.A0O = r0
            X.9n2 r1 = r9.A12
            X.6mY r0 = r9.A0O
            r1.A09(r0)
            return
        L_0x0405:
            r3 = -1
            java.lang.Object r1 = r5.A01     // Catch:{ all -> 0x0426 }
            X.5uR r1 = (X.C122185uR) r1     // Catch:{ all -> 0x0426 }
            java.util.concurrent.atomic.AtomicInteger r0 = r1.A02     // Catch:{ all -> 0x0426 }
            r0.decrementAndGet()     // Catch:{ all -> 0x0426 }
            java.util.concurrent.atomic.AtomicLong r2 = r1.A03     // Catch:{ all -> 0x0426 }
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0426 }
            long r0 = r0.getId()     // Catch:{ all -> 0x0426 }
            r2.set(r0)     // Catch:{ all -> 0x0426 }
            java.lang.Object r0 = r5.A00     // Catch:{ all -> 0x0426 }
            X.C36411kG.A1O(r0)     // Catch:{ all -> 0x0426 }
            r2.set(r3)
            return
        L_0x0426:
            r2 = move-exception
            java.lang.Object r0 = r5.A01
            X.5uR r0 = (X.C122185uR) r0
            java.util.concurrent.atomic.AtomicLong r0 = r0.A03
            r0.set(r3)
            throw r2
        L_0x0431:
            java.lang.Object r0 = r5.A00
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r1 = r5.A01
            com.google.android.gms.tasks.TaskCompletionSource r1 = (com.google.android.gms.tasks.TaskCompletionSource) r1
            X.C132946Vx.A01(r0)     // Catch:{ Exception -> 0x0441 }
            r0 = 0
            r1.setResult(r0)     // Catch:{ Exception -> 0x0441 }
            return
        L_0x0441:
            r0 = move-exception
            r1.setException(r0)
            return
        L_0x0446:
            java.lang.Object r0 = r5.A00
            com.google.android.gms.common.data.DataHolder r0 = (com.google.android.gms.common.data.DataHolder) r0
            r0.close()
            return
        L_0x044e:
            java.lang.Object r0 = r5.A01
            X.4sk r0 = (X.C99174sk) r0
            X.4ai r6 = r0.A01
            java.lang.Object r1 = r5.A00
            X.4s2 r1 = (X.C98794s2) r1
            com.whatsapp.wearos.WearOsListenerService r6 = (com.whatsapp.wearos.WearOsListenerService) r6
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            java.lang.String r7 = r1.A01
            X.AnonymousClass00C.A08(r7)
            java.lang.String r2 = r1.A00
            X.AnonymousClass00C.A08(r2)
            byte[] r1 = r1.A02
            X.AnonymousClass00C.A08(r1)
            X.5nL r3 = r6.A01
            if (r3 == 0) goto L_0x062b
            java.lang.String r0 = "/altLinkingPrefillRequest"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0621
            java.nio.charset.Charset r5 = X.AnonymousClass0S4.A05     // Catch:{ IOException -> 0x0616 }
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x0616 }
            r0.<init>(r1, r5)     // Catch:{ IOException -> 0x0616 }
            android.util.JsonReader r2 = X.C90484aE.A0Q(r0)     // Catch:{ IOException -> 0x0616 }
            r2.beginObject()     // Catch:{ IllegalStateException -> 0x060f }
            java.lang.String r1 = r2.nextName()     // Catch:{ IllegalStateException -> 0x060f }
            java.lang.String r0 = "wearOsAppVersion"
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)     // Catch:{ IllegalStateException -> 0x060f }
            if (r0 == 0) goto L_0x0608
            java.lang.String r0 = r2.nextString()     // Catch:{ IllegalStateException -> 0x060f }
            r2.endObject()     // Catch:{ IllegalStateException -> 0x060f }
            X.AnonymousClass00C.A0B(r0)     // Catch:{ IOException -> 0x0616 }
            X.693 r8 = new X.693     // Catch:{ IOException -> 0x0616 }
            r8.<init>(r0)     // Catch:{ IOException -> 0x0616 }
            X.5wg r3 = r3.A00
            X.0wQ r0 = r3.A00
            com.whatsapp.jid.PhoneUserJid r1 = X.C36441kJ.A0n(r0)
            r4 = 0
            if (r1 != 0) goto L_0x05f1
            java.lang.String r0 = "AltLinkingPrefillRequestHandler/registeredPhoneNumber no me contact available"
        L_0x04af:
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x04b2:
            X.5nM r0 = r3.A04
            X.0yC r2 = r0.A00
            r0 = 3698(0xe72, float:5.182E-42)
            boolean r0 = r2.A0E(r0)
            if (r0 == 0) goto L_0x0563
            java.lang.String r0 = "WearOsConfig/isAltLinkingEnabled alt linking for Wear OS killswitch is enabled"
        L_0x04c0:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.String r0 = "AltLinkingPrefillRequestHandler/handleRequest feature disabled"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x04c8:
            X.5QQ r8 = X.AnonymousClass5QQ.A00
        L_0x04ca:
            java.io.StringWriter r4 = new java.io.StringWriter
            r4.<init>()
            android.util.JsonWriter r3 = new android.util.JsonWriter
            r3.<init>(r4)
            r3.beginObject()
            boolean r0 = r8 instanceof X.AnonymousClass5QP
            java.lang.String r9 = "success"
            if (r0 == 0) goto L_0x053c
            android.util.JsonWriter r1 = r3.name(r9)
            r0 = 1
            r1.value(r0)
            java.lang.String r0 = "phoneNumber"
            android.util.JsonWriter r1 = r3.name(r0)
            X.5QP r8 = (X.AnonymousClass5QP) r8
            java.lang.String r0 = r8.A01
            r1.value(r0)
            java.lang.String r0 = "openOnPhoneNonce"
            android.util.JsonWriter r1 = r3.name(r0)
            java.lang.String r0 = r8.A00
        L_0x04fa:
            r1.value(r0)
        L_0x04fd:
            r3.endObject()
            r3.close()
            java.lang.String r0 = X.C36381kD.A0y(r4)
            byte[] r0 = X.C36371kC.A1Z(r0, r5)
            X.6Ao r1 = new X.6Ao
            r1.<init>(r7, r0)
            X.8BJ r0 = r6.A00
            if (r0 == 0) goto L_0x0601
            java.lang.String r3 = r1.A00
            byte[] r2 = r1.A01
            X.0XK r0 = r0.A05
            X.8Et r1 = new X.8Et
            r1.<init>(r0, r3, r2)
            r0.A05(r1)
            X.0qC r0 = X.C141416nD.A00
            com.google.android.gms.tasks.zzw r3 = X.C06910Vo.A00(r1, r0)
            X.7Xp r2 = X.C155837Xp.A00
            r1 = 2
            X.5Xb r0 = new X.5Xb
            r0.<init>(r2, r1)
            r3.addOnSuccessListener(r0)
            X.6nU r0 = X.C141586nU.A00
            r3.addOnFailureListener(r0)
            com.google.android.gms.tasks.Tasks.await(r3)
            return
        L_0x053c:
            boolean r0 = r8 instanceof X.AnonymousClass5QR
            java.lang.String r2 = "error"
            r1 = 0
            if (r0 == 0) goto L_0x0551
            android.util.JsonWriter r0 = r3.name(r9)
            r0.value(r1)
            android.util.JsonWriter r1 = r3.name(r2)
            java.lang.String r0 = "WearOsAppVersionTooOld"
            goto L_0x04fa
        L_0x0551:
            boolean r0 = r8 instanceof X.AnonymousClass5QQ
            if (r0 == 0) goto L_0x04fd
            android.util.JsonWriter r0 = r3.name(r9)
            r0.value(r1)
            android.util.JsonWriter r1 = r3.name(r2)
            java.lang.String r0 = "Disabled"
            goto L_0x04fa
        L_0x0563:
            r0 = 3548(0xddc, float:4.972E-42)
            boolean r0 = r2.A0E(r0)
            if (r0 != 0) goto L_0x056f
            java.lang.String r0 = "WearOsConfig/isAltLinkingEnabled alt linking prefill is disabled"
            goto L_0x04c0
        L_0x056f:
            java.lang.String r8 = r8.A00
            X.6OD r1 = X.AnonymousClass6OD.A00(r8)
            r0 = 3549(0xddd, float:4.973E-42)
            java.lang.String r2 = X.C36431kI.A19(r2, r0)
            X.6OD r0 = X.AnonymousClass6OD.A00(r2)
            if (r1 != 0) goto L_0x05a5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "WearOsConfig/isAltLinkingAppVersionAllowed failed to parse Wear OS app version: "
            r1.append(r0)
            r1.append(r8)
        L_0x058d:
            X.C90504aG.A1G(r1)
        L_0x0590:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "AltLinkingPrefillRequestHandler/handleRequest version "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " is too old"
            X.C36341k9.A1O(r1, r0)
            X.5QR r8 = X.AnonymousClass5QR.A00
            goto L_0x04ca
        L_0x05a5:
            if (r0 != 0) goto L_0x05b4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "WearOsConfig/isAltLinkingAppVersionAllowed failed to parse alt linking min version: "
            r1.append(r0)
            r1.append(r2)
            goto L_0x058d
        L_0x05b4:
            int r0 = r1.A01(r0)
            if (r0 < 0) goto L_0x0590
            if (r4 == 0) goto L_0x04c8
            X.0v0 r8 = r3.A01
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r8)
            java.lang.String r0 = "companion_reg_with_link_code_enabled_for_wearos"
            X.C36331k8.A0w(r1, r0, r2)
            X.0yC r1 = r3.A02
            r0 = 4560(0x11d0, float:6.39E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x05ef
            java.lang.String r3 = X.C90464aC.A0V()
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r8)
            java.lang.String r0 = "adl_deep_link_nonce"
            X.C36341k9.A0x(r1, r0, r3)
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "adl_deep_link_nonce_gen_timestamp"
            r8.A1h(r0, r1)
        L_0x05e8:
            X.5QP r8 = new X.5QP
            r8.<init>(r4, r3)
            goto L_0x04ca
        L_0x05ef:
            r3 = 0
            goto L_0x05e8
        L_0x05f1:
            X.12U r0 = r3.A03
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x05fd
            java.lang.String r0 = "AltLinkingPrefillRequestHandler/registeredPhoneNumber registration not verified"
            goto L_0x04af
        L_0x05fd:
            java.lang.String r4 = r1.user
            goto L_0x04b2
        L_0x0601:
            java.lang.String r0 = "messageClient"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0608:
            java.lang.String r0 = "wearOsAppVersion key not present"
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ IllegalStateException -> 0x060f }
            throw r0     // Catch:{ IllegalStateException -> 0x060f }
        L_0x060f:
            r1 = move-exception
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0616 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0616 }
            throw r0     // Catch:{ IOException -> 0x0616 }
        L_0x0616:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "RequestDispatcher/onRequest failed to parse AltLinkingPrefillRequest: "
            X.C36321k7.A1J(r2, r0, r1)
            return
        L_0x0621:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "RequestDispatcher/onRequest ignoring unrecognised request path: "
            X.C36321k7.A1R(r0, r2, r1)
            return
        L_0x062b:
            java.lang.String r0 = "requestDispatcher"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0632:
            java.lang.Object r1 = r5.A00
            X.4s3 r1 = (X.C98804s3) r1
            java.lang.Object r0 = r5.A01
            X.4sk r0 = (X.C99174sk) r0
            X.4ai r0 = r0.A01
            r1.A00(r0)
            X.6nY r0 = r0.A03
            r1.A00(r0)
            return
        L_0x0645:
            java.lang.Object r2 = r5.A01
            java.util.concurrent.Future r2 = (java.util.concurrent.Future) r2
            boolean r0 = r2.isDone()     // Catch:{ ExecutionException -> 0x0673, Error | RuntimeException -> 0x066a }
            java.lang.String r1 = "Future was expected to be done: %s"
            if (r0 == 0) goto L_0x065d
            java.lang.Object r1 = X.C109755Yz.A00(r2)     // Catch:{ ExecutionException -> 0x0673, Error | RuntimeException -> 0x066a }
            java.lang.Object r0 = r5.A00
            X.7is r0 = (X.C159137is) r0
            r0.onSuccess(r1)
            return
        L_0x065d:
            java.lang.Object[] r0 = X.AnonymousClass000.A1b(r2)     // Catch:{ ExecutionException -> 0x0673, Error | RuntimeException -> 0x066a }
            java.lang.String r0 = com.google.common.base.Strings.A00(r1, r0)     // Catch:{ ExecutionException -> 0x0673, Error | RuntimeException -> 0x066a }
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ ExecutionException -> 0x0673, Error | RuntimeException -> 0x066a }
            throw r0     // Catch:{ ExecutionException -> 0x0673, Error | RuntimeException -> 0x066a }
        L_0x066a:
            r1 = move-exception
            java.lang.Object r0 = r5.A00
            X.7is r0 = (X.C159137is) r0
            r0.BXQ(r1)
            return
        L_0x0673:
            r0 = move-exception
            java.lang.Object r1 = r5.A00
            X.7is r1 = (X.C159137is) r1
            java.lang.Throwable r0 = r0.getCause()
            r1.BXQ(r0)
            return
        L_0x0680:
            java.lang.Object r3 = r5.A00
            X.6ZH r3 = (X.AnonymousClass6ZH) r3
            java.lang.Object r2 = r5.A01
            android.os.IBinder r2 = (android.os.IBinder) r2
            monitor-enter(r3)
            r1 = 0
            if (r2 != 0) goto L_0x068d
            goto L_0x06aa
        L_0x068d:
            X.5oh r0 = new X.5oh     // Catch:{ RemoteException -> 0x06a4 }
            r0.<init>(r2)     // Catch:{ RemoteException -> 0x06a4 }
            r3.A01 = r0     // Catch:{ RemoteException -> 0x06a4 }
            r0 = 2
            r3.A00 = r0     // Catch:{ all -> 0x06b1 }
            X.6SA r0 = r3.A05     // Catch:{ all -> 0x06b1 }
            java.util.concurrent.ScheduledExecutorService r1 = r0.A03     // Catch:{ all -> 0x06b1 }
            X.72h r0 = new X.72h     // Catch:{ all -> 0x06b1 }
            r0.<init>(r3)     // Catch:{ all -> 0x06b1 }
            r1.execute(r0)     // Catch:{ all -> 0x06b1 }
            goto L_0x06af
        L_0x06a4:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x06b1 }
            goto L_0x06ac
        L_0x06aa:
            java.lang.String r0 = "Null service connection"
        L_0x06ac:
            r3.A01(r1, r0)     // Catch:{ all -> 0x06b1 }
        L_0x06af:
            monitor-exit(r3)     // Catch:{ all -> 0x06b1 }
            return
        L_0x06b1:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x06b1 }
            throw r0
        L_0x06b4:
            java.lang.Object r6 = r5.A00
            X.6ZH r6 = (X.AnonymousClass6ZH) r6
            java.lang.Object r0 = r5.A01
            X.6F5 r0 = (X.AnonymousClass6F5) r0
            int r5 = r0.A03
            monitor-enter(r6)
            android.util.SparseArray r4 = r6.A04     // Catch:{ all -> 0x06ed }
            java.lang.Object r3 = r4.get(r5)     // Catch:{ all -> 0x06ed }
            X.6F5 r3 = (X.AnonymousClass6F5) r3     // Catch:{ all -> 0x06ed }
            if (r3 == 0) goto L_0x06eb
            java.lang.String r2 = "MessengerIpcClient"
            r0 = 31
            java.lang.StringBuilder r1 = X.C90524aI.A0h(r0)     // Catch:{ all -> 0x06ed }
            java.lang.String r0 = "Timing out request: "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r5)     // Catch:{ all -> 0x06ed }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x06ed }
            r4.remove(r5)     // Catch:{ all -> 0x06ed }
            r2 = 3
            java.lang.String r1 = "Timed out waiting for response"
            X.5Ur r0 = new X.5Ur     // Catch:{ all -> 0x06ed }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x06ed }
            r3.A01(r0)     // Catch:{ all -> 0x06ed }
            r6.A00()     // Catch:{ all -> 0x06ed }
        L_0x06eb:
            monitor-exit(r6)
            return
        L_0x06ed:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x06f0:
            java.lang.Object r3 = r5.A00
            X.63K r3 = (X.AnonymousClass63K) r3
            java.lang.Object r0 = r5.A01
            android.content.Intent r0 = (android.content.Intent) r0
            java.lang.String r2 = r0.getAction()
            int r0 = X.C90474aD.A05(r2)
            int r0 = r0 + 61
            java.lang.StringBuilder r1 = X.C90524aI.A0h(r0)
            java.lang.String r0 = "Service took too long to process intent: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " App may get closed."
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)
            java.lang.String r0 = "FirebaseInstanceId"
            android.util.Log.w(r0, r1)
            r3.A00()
            return
        L_0x071d:
            java.lang.Object r1 = r5.A00
            X.4Ov r1 = (X.C87444Ov) r1
            java.lang.Object r0 = r5.A01
            java.util.Set r0 = (java.util.Set) r0
            r1.BVH(r0)
            return
        L_0x0729:
            java.lang.Object r7 = r5.A00
            com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity r7 = (com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity) r7
            java.lang.Object r6 = r5.A01
            X.147 r6 = (X.AnonymousClass147) r6
            X.17b r0 = r7.A0E
            int r0 = r0.A01(r6)
            r5 = 0
            boolean r4 = X.AnonymousClass000.A1P(r0)
            X.0yC r1 = r7.A0D
            r0 = 7053(0x1b8d, float:9.883E-42)
            boolean r0 = r1.A0E(r0)
            java.lang.String r3 = "accept_invite_conflict_recovery"
            if (r0 == 0) goto L_0x075b
            if (r4 == 0) goto L_0x075b
            X.0xg r2 = r7.A0F
            X.17X r0 = r7.A08
            java.lang.String r1 = r0.A04(r6, r4)
            X.3S5 r0 = new X.3S5
            r0.<init>(r3, r5, r1)
            r2.A09(r0, r6)
            return
        L_0x075b:
            X.0xg r0 = r7.A0F
            r0.A0E(r6, r3, r5)
            return
        L_0x0761:
            java.lang.Object r3 = r5.A00
            java.lang.Object r1 = r5.A01
            X.7fl r1 = (X.C158077fl) r1
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            X.7ku r2 = r1.B7y()
            X.4vP r1 = X.C142326oh.A03(r3)
            goto L_0x0782
        L_0x0774:
            java.lang.Object r1 = r5.A00
            java.lang.Object r0 = r5.A01
            X.7fl r0 = (X.C158077fl) r0
            X.7ku r2 = r0.B7y()
            X.4vP r1 = X.C142326oh.A03(r1)
        L_0x0782:
            X.6MO r0 = X.AnonymousClass6MO.A01
            X.AnonymousClass6JI.A00(r1, r0, r2)
            return
        L_0x0788:
            java.lang.Object r4 = r5.A00
            com.whatsapp.accountswitching.secondaryprocess.AccountSwitchingActivity r4 = (com.whatsapp.accountswitching.secondaryprocess.AccountSwitchingActivity) r4
            java.lang.Object r3 = r5.A01
            android.content.Context r3 = (android.content.Context) r3
            r1 = 0
            boolean r0 = r4.isFinishing()
            if (r0 != 0) goto L_0x07d9
            boolean r0 = r4.isChangingConfigurations()
            if (r0 != 0) goto L_0x07d9
            boolean r0 = r4.isDestroyed()
            if (r0 != 0) goto L_0x07d9
            androidx.appcompat.app.AlertDialog$Builder r2 = new androidx.appcompat.app.AlertDialog$Builder
            r2.<init>(r4)
            r0 = 2131896277(0x7f1227d5, float:1.942741E38)
            java.lang.String r0 = r3.getString(r0)
            r2.setTitle(r0)
            r0 = 2131896276(0x7f1227d4, float:1.9427409E38)
            java.lang.String r0 = r3.getString(r0)
            r2.A0Z(r0)
            r0 = 1
            r2.A0a(r0)
            r1 = 4
            X.4XV r0 = new X.4XV
            r0.<init>(r4, r1)
            r2.A0N(r0)
            r0 = 2131896275(0x7f1227d3, float:1.9427407E38)
            java.lang.String r1 = r3.getString(r0)
            X.6Z1 r0 = X.AnonymousClass6Z1.A00
            r2.A0S(r0, r1)
            X.C36341k9.A11(r2)
            return
        L_0x07d9:
            com.whatsapp.accountswitching.secondaryprocess.AccountSwitchingActivity.A07(r4, r1)
            return
        L_0x07dd:
            java.lang.Object r1 = r5.A00
            X.1nE r1 = (X.C37801nE) r1
            java.lang.Object r0 = r5.A01
            java.util.List r0 = (java.util.List) r0
            X.C36321k7.A0w(r1, r0)
            r1.A00 = r0
            r1.notifyDataSetChanged()
            return
        L_0x07ee:
            java.lang.Object r1 = r5.A00
            com.whatsapp.accountswitching.ui.AccountSwitchingBottomSheet r1 = (com.whatsapp.accountswitching.ui.AccountSwitchingBottomSheet) r1
            java.lang.Object r3 = r5.A01
            r0 = 1
            X.AnonymousClass00C.A0D(r3, r0)
            java.util.ArrayList r2 = com.whatsapp.accountswitching.ui.AccountSwitchingBottomSheet.A03(r1)
            X.17Y r1 = r1.A05
            if (r1 == 0) goto L_0x080a
            r0 = 43
            X.74N r0 = A00(r3, r2, r0)
            r1.A0H(r0)
            return
        L_0x080a:
            java.lang.RuntimeException r0 = X.C36321k7.A06()
            throw r0
        L_0x080f:
            java.lang.Object r1 = r5.A00
            X.6Er r1 = (X.C129036Er) r1
            java.lang.Object r0 = r5.A01
            X.1RJ r0 = (X.AnonymousClass1RJ) r0
            r1.A03(r0)
            return
        L_0x081b:
            java.lang.Object r6 = r5.A00
            X.1RJ r6 = (X.AnonymousClass1RJ) r6
            java.lang.Object r5 = r5.A01
            X.6Er r5 = (X.C129036Er) r5
            r0 = 0
            android.view.View r3 = X.C36391kE.A0L(r6, r0)
            android.view.animation.AlphaAnimation r2 = X.C36351kA.A0D()
            r0 = 320(0x140, double:1.58E-321)
            r2.setDuration(r0)
            r3.startAnimation(r2)
            X.0wU r2 = r5.A08
            r1 = 19
            X.72k r0 = new X.72k
            r0.<init>(r5, r1)
            r2.Boy(r0)
            X.6TO r3 = r5.A02
            r2 = 0
            r1 = 2
            r0 = 26
            r3.A02(r2, r1, r0)
            X.0wI r4 = r5.A07
            r0 = 45
            X.74N r3 = A00(r5, r6, r0)
            r1 = 5000(0x1388, double:2.4703E-320)
            android.os.Handler r0 = r4.A00
            r0.postDelayed(r3, r1)
            return
        L_0x0859:
            java.lang.Object r1 = r5.A00
            X.6PU r1 = (X.AnonymousClass6PU) r1
            java.lang.Object r3 = r5.A01
            android.content.Context r3 = (android.content.Context) r3
            X.17Y r0 = r1.A00
            if (r0 == 0) goto L_0x087e
            r0.A02()
            X.1RU r0 = r1.A01
            if (r0 == 0) goto L_0x0877
            r2 = 2131896277(0x7f1227d5, float:1.942741E38)
            r1 = 2131896276(0x7f1227d4, float:1.9427409E38)
            r0 = 0
            X.AnonymousClass1RU.A01(r3, r0, r2, r1)
            return
        L_0x0877:
            java.lang.String r0 = "accountSwitcher"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x087e:
            java.lang.RuntimeException r0 = X.C36321k7.A06()
            throw r0
        L_0x0883:
            java.lang.Object r0 = r5.A00
            X.7oR r0 = (X.C162347oR) r0
            java.lang.Object r2 = r5.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r0.A00
            X.1Ol r1 = (X.C27501Ol) r1
            monitor-enter(r1)
            X.0wQ r0 = r1.A00     // Catch:{ all -> 0x08b1 }
            boolean r0 = r0.A0L()     // Catch:{ all -> 0x08b1 }
            if (r0 != 0) goto L_0x08af
            X.16m r0 = r1.A01     // Catch:{ all -> 0x08b1 }
            boolean r0 = r0.A00()     // Catch:{ all -> 0x08b1 }
            if (r0 == 0) goto L_0x08af
            android.accounts.Account r0 = r1.A03(r2)     // Catch:{ all -> 0x08b1 }
            if (r0 == 0) goto L_0x08aa
            X.C27501Ol.A01(r0, r2, r1)     // Catch:{ all -> 0x08b1 }
            goto L_0x08af
        L_0x08aa:
            java.lang.String r0 = "androidcontactssync/skipping updating Android contact action items due to null account"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x08b1 }
        L_0x08af:
            monitor-exit(r1)
            return
        L_0x08b1:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x08b4:
            java.lang.Object r9 = r5.A00
            X.4x3 r9 = (X.C101134x3) r9
            java.lang.Object r6 = r5.A01
            android.os.PowerManager$WakeLock r6 = (android.os.PowerManager.WakeLock) r6
            java.lang.String r0 = "backupMessages/mediaClanup"
            X.14g r5 = new X.14g
            r5.<init>((java.lang.String) r0)
            X.0y0 r1 = r9.A02     // Catch:{ all -> 0x091d }
            java.io.File r0 = r1.A0E()     // Catch:{ all -> 0x091d }
            r2 = 604800000(0x240c8400, double:2.988109026E-315)
            X.AnonymousClass6YY.A0E(r0, r2)     // Catch:{ all -> 0x091d }
            X.3BP r0 = r1.A08()     // Catch:{ all -> 0x091d }
            java.io.File r0 = r0.A09     // Catch:{ all -> 0x091d }
            r8 = 0
            X.C20690y0.A07(r0, r8)     // Catch:{ all -> 0x091d }
            X.AnonymousClass6YY.A0E(r0, r2)     // Catch:{ all -> 0x091d }
            X.0wx r7 = r9.A08     // Catch:{ all -> 0x091d }
            X.005 r4 = r1.A03     // Catch:{ all -> 0x091d }
            java.lang.Object r1 = r4.get()     // Catch:{ all -> 0x091d }
            X.179 r1 = (X.AnonymousClass179) r1     // Catch:{ all -> 0x091d }
            java.lang.String r0 = ".Thumbs"
            java.io.File r0 = r1.A07(r0)     // Catch:{ all -> 0x091d }
            X.AnonymousClass6YY.A0A(r7, r0)     // Catch:{ all -> 0x091d }
            java.lang.Object r1 = r4.get()     // Catch:{ all -> 0x091d }
            X.179 r1 = (X.AnonymousClass179) r1     // Catch:{ all -> 0x091d }
            java.lang.String r0 = ".StickerThumbs"
            java.io.File r0 = r1.A07(r0)     // Catch:{ all -> 0x091d }
            X.C20690y0.A07(r0, r8)     // Catch:{ all -> 0x091d }
            X.AnonymousClass6YY.A0A(r7, r0)     // Catch:{ all -> 0x091d }
            android.content.Context r1 = r9.A00     // Catch:{ all -> 0x091d }
            java.lang.String r0 = "gif/gif_preview_cache"
            java.io.File r1 = X.C55722v5.A00(r1, r0)     // Catch:{ all -> 0x091d }
            if (r1 == 0) goto L_0x0914
            boolean r0 = r1.exists()     // Catch:{ all -> 0x091d }
            if (r0 == 0) goto L_0x0914
            X.AnonymousClass6YY.A0E(r1, r2)     // Catch:{ all -> 0x091d }
        L_0x0914:
            if (r6 == 0) goto L_0x0919
            r6.release()
        L_0x0919:
            r5.A01()
            return
        L_0x091d:
            r0 = move-exception
            if (r6 == 0) goto L_0x0923
            r6.release()
        L_0x0923:
            r5.A01()
            throw r0
        L_0x0927:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass74N.run():void");
    }

    public String toString() {
        if (25 - this.A02 != 0) {
            return super.toString();
        }
        AnonymousClass62Z r3 = new AnonymousClass62Z(C90484aE.A0k(this));
        Object obj = this.A00;
        C118755og r1 = new C118755og();
        r3.A00.A00 = r1;
        r3.A00 = r1;
        r1.A01 = obj;
        return r3.toString();
    }
}
