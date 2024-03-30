package X;

public class AVa implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public AVa(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: X.8cP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v32, resolved type: X.8cH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v42, resolved type: com.whatsapp.backup.google.SettingsGoogleDrive} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v47, resolved type: X.4y9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v155, resolved type: X.8cP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v156, resolved type: X.8cP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v157, resolved type: com.whatsapp.backup.google.SettingsGoogleDrive} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v158, resolved type: com.whatsapp.backup.google.SettingsGoogleDrive} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x04dc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:?, code lost:
        X.C05600Qi.A00(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x04e0, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x04e1, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x04e6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:?, code lost:
        X.C05600Qi.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x04ea, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0625, code lost:
        r1 = X.C36361kB.A0i();
        r0 = "order is null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0644, code lost:
        r0 = X.AnonymousClass000.A0l(r2, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x0648, code lost:
        com.whatsapp.util.Log.i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x064b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0656, code lost:
        r2.BWb(X.C36441kJ.A0Q(r1, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x065d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x0722, code lost:
        r3.A0H(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x0725, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x082f, code lost:
        com.whatsapp.util.Log.i("settings-gdrive/gps-unavailable/prompting-user-to-fix");
        r5.A1c();
        r1.show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x083a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x085c, code lost:
        r1 = X.C36341k9.A0O(r1);
        r1.A0D(r2, "auth_request_dialog");
        r1.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0868, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x0891, code lost:
        if (r11 != 0) goto L_0x0899;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x08d9, code lost:
        if (r2.A01.A0E(4893) == false) goto L_0x08db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x0a4b, code lost:
        r2.A00(r0, r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x0a4e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:0x0b8b, code lost:
        r0.open();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:0x0b8e, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:219:0x04d0, B:226:0x04db] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:221:0x04d3, B:235:0x04e5] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0411  */
    /* JADX WARNING: Removed duplicated region for block: B:531:0x01a7 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:533:0x0228 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:535:0x0164 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:583:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0167 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01a4 A[LOOP:1: B:71:0x0185->B:81:0x01a4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r36 = this;
            r7 = r36
            int r0 = r7.A02
            switch(r0) {
                case 0: goto L_0x0869;
                case 1: goto L_0x0b3c;
                case 2: goto L_0x0b2d;
                case 3: goto L_0x083b;
                case 4: goto L_0x07ec;
                case 5: goto L_0x07c4;
                case 6: goto L_0x0b15;
                case 7: goto L_0x0b09;
                case 8: goto L_0x0afd;
                case 9: goto L_0x0ac1;
                case 10: goto L_0x0aa7;
                case 11: goto L_0x0a97;
                case 12: goto L_0x0b15;
                case 13: goto L_0x084e;
                case 14: goto L_0x0810;
                case 15: goto L_0x0a85;
                case 16: goto L_0x07c4;
                case 17: goto L_0x0a73;
                case 18: goto L_0x0a65;
                case 19: goto L_0x0a4f;
                case 20: goto L_0x073d;
                case 21: goto L_0x0a36;
                case 22: goto L_0x0a20;
                case 23: goto L_0x0726;
                case 24: goto L_0x06eb;
                case 25: goto L_0x06bd;
                case 26: goto L_0x0683;
                case 27: goto L_0x065e;
                case 28: goto L_0x062c;
                case 29: goto L_0x0611;
                case 30: goto L_0x0a0c;
                case 31: goto L_0x05f7;
                case 32: goto L_0x0433;
                case 33: goto L_0x090f;
                case 34: goto L_0x0425;
                case 35: goto L_0x0903;
                case 36: goto L_0x08f3;
                case 37: goto L_0x08f3;
                case 38: goto L_0x08e4;
                case 39: goto L_0x00fc;
                case 40: goto L_0x0053;
                case 41: goto L_0x0025;
                case 42: goto L_0x0415;
                case 43: goto L_0x03bd;
                case 44: goto L_0x08b5;
                case 45: goto L_0x0263;
                case 46: goto L_0x0007;
                case 47: goto L_0x0007;
                case 48: goto L_0x0112;
                case 49: goto L_0x0013;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r7.A00
            java.lang.Object r0 = r7.A01
            X.9lS r0 = (X.C202279lS) r0
            java.util.List r0 = r0.A0N
            r0.remove(r1)
        L_0x0012:
            return
        L_0x0013:
            java.lang.Object r0 = r7.A00
            X.7yU r0 = (X.C167647yU) r0
            java.lang.Object r1 = r7.A01
            X.141 r1 = (X.AnonymousClass141) r1
            X.00s r2 = r0.A05
            X.171 r0 = r0.A0I
            java.lang.String r0 = r0.A0H(r1)
            goto L_0x0285
        L_0x0025:
            java.lang.Object r0 = r7.A00
            X.8VB r0 = (X.AnonymousClass8VB) r0
            java.lang.Object r2 = r7.A01
            android.util.Pair r2 = (android.util.Pair) r2
            if (r2 == 0) goto L_0x003e
            X.B1n r0 = r0.A01
            if (r0 == 0) goto L_0x0036
            r0.BWb(r2)
        L_0x0036:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "CreateOrderProtocol/onError/"
            goto L_0x0644
        L_0x003e:
            X.B1n r2 = r0.A01
            if (r2 == 0) goto L_0x004f
            java.lang.Integer r1 = X.C36361kB.A0i()
            java.lang.String r0 = "error code is null"
            android.util.Pair r0 = X.C36441kJ.A0Q(r1, r0)
            r2.BWb(r0)
        L_0x004f:
            java.lang.String r0 = "CreateOrderProtocol/onError/Unknown error"
            goto L_0x0648
        L_0x0053:
            java.lang.Object r2 = r7.A00
            com.whatsapp.biz.compliance.viewmodel.BusinessComplianceViewModel r2 = (com.whatsapp.biz.compliance.viewmodel.BusinessComplianceViewModel) r2
            java.lang.Object r1 = r7.A01
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            java.lang.String r3 = "BusinessComplianceViewModel/loadBusinessComplianceDetails/fetch-error"
            X.9HJ r4 = r2.A02
            monitor-enter(r4)
            X.19A r0 = r4.A00     // Catch:{ all -> 0x08e1 }
            X.AHu r10 = new X.AHu     // Catch:{ all -> 0x08e1 }
            r10.<init>(r1, r0)     // Catch:{ all -> 0x08e1 }
            X.19A r9 = r10.A01     // Catch:{ all -> 0x08e1 }
            java.lang.String r12 = r9.A09()     // Catch:{ all -> 0x08e1 }
            r5 = 1
            X.1AL[] r7 = new X.AnonymousClass1AL[r5]     // Catch:{ all -> 0x08e1 }
            com.whatsapp.jid.UserJid r0 = r10.A00     // Catch:{ all -> 0x08e1 }
            java.lang.String r1 = r0.getRawString()     // Catch:{ all -> 0x08e1 }
            java.lang.String r0 = "jid"
            boolean r6 = X.C36371kC.A1Y(r0, r1, r7)     // Catch:{ all -> 0x08e1 }
            java.lang.String r0 = "merchant_info"
            X.9nx r8 = X.C203399nx.A04(r0, r7)     // Catch:{ all -> 0x08e1 }
            r0 = 5
            X.1AL[] r7 = new X.AnonymousClass1AL[r0]     // Catch:{ all -> 0x08e1 }
            java.lang.String r1 = "smax_id"
            java.lang.String r0 = "53"
            X.C36341k9.A1L(r1, r0, r7, r6)     // Catch:{ all -> 0x08e1 }
            X.C36331k8.A1R(r12, r7, r5)     // Catch:{ all -> 0x08e1 }
            X.8e2 r6 = X.C177588e2.A00     // Catch:{ all -> 0x08e1 }
            java.lang.String r0 = "to"
            X.1AL r1 = new X.1AL     // Catch:{ all -> 0x08e1 }
            r1.<init>((com.whatsapp.jid.Jid) r6, (java.lang.String) r0)     // Catch:{ all -> 0x08e1 }
            r0 = 2
            r7[r0] = r1     // Catch:{ all -> 0x08e1 }
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "w:biz:merchant_info"
            X.C36361kB.A1Q(r1, r0, r7)     // Catch:{ all -> 0x08e1 }
            java.lang.String r6 = "type"
            java.lang.String r0 = "get"
            X.1AL r1 = new X.1AL     // Catch:{ all -> 0x08e1 }
            r1.<init>((java.lang.String) r6, (java.lang.String) r0)     // Catch:{ all -> 0x08e1 }
            r0 = 4
            r7[r0] = r1     // Catch:{ all -> 0x08e1 }
            X.9nx r11 = X.C36391kE.A0m(r8, r7)     // Catch:{ all -> 0x08e1 }
            r13 = 280(0x118, float:3.92E-43)
            r14 = 32000(0x7d00, double:1.581E-319)
            r9.A0F(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x08e1 }
            X.777 r6 = r10.A02     // Catch:{ all -> 0x08e1 }
            X.0wU r1 = r4.A01     // Catch:{ all -> 0x08e1 }
            r0 = 17
            X.AVW.A00(r1, r6, r0)     // Catch:{ all -> 0x08e1 }
            monitor-exit(r4)
            r4 = 3
            java.lang.Object r0 = r6.get()     // Catch:{ ExecutionException -> 0x00ec, Exception -> 0x00f0 }
            X.9HO r0 = (X.AnonymousClass9HO) r0     // Catch:{ ExecutionException -> 0x00ec, Exception -> 0x00f0 }
            java.lang.Object r1 = r0.A01     // Catch:{ ExecutionException -> 0x00ec, Exception -> 0x00f0 }
            if (r1 == 0) goto L_0x00e0
            X.00s r0 = r2.A00     // Catch:{ ExecutionException -> 0x00ec, Exception -> 0x00f0 }
            X.9ty r1 = (X.C206789ty) r1     // Catch:{ ExecutionException -> 0x00ec, Exception -> 0x00f0 }
            r0.A0C(r1)     // Catch:{ ExecutionException -> 0x00ec, Exception -> 0x00f0 }
            X.00s r1 = r2.A01     // Catch:{ ExecutionException -> 0x00ec, Exception -> 0x00f0 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ ExecutionException -> 0x00ec, Exception -> 0x00f0 }
        L_0x00db:
            r1.A0C(r0)     // Catch:{ ExecutionException -> 0x00ec, Exception -> 0x00f0 }
            goto L_0x08e0
        L_0x00e0:
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ ExecutionException -> 0x00ec, Exception -> 0x00f0 }
            X.00s r0 = r2.A01     // Catch:{ ExecutionException -> 0x00ec, Exception -> 0x00f0 }
            X.C36341k9.A17(r0, r5)     // Catch:{ ExecutionException -> 0x00ec, Exception -> 0x00f0 }
            X.00s r1 = r2.A00     // Catch:{ ExecutionException -> 0x00ec, Exception -> 0x00f0 }
            r0 = 0
            goto L_0x00db
        L_0x00ec:
            r0 = move-exception
            java.lang.String r3 = "BusinessComplianceViewModel/loadBusinessComplianceDetails/delivery-failure"
            goto L_0x00f1
        L_0x00f0:
            r0 = move-exception
        L_0x00f1:
            com.whatsapp.util.Log.e(r3, r0)
            X.00s r2 = r2.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            goto L_0x0285
        L_0x00fc:
            java.lang.Object r0 = r7.A00
            X.7yA r0 = (X.C167507yA) r0
            java.lang.Object r1 = r7.A01
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.00s r2 = r0.A0C
            X.9UA r0 = r0.A0H
            boolean r0 = r0.A01(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x0285
        L_0x0112:
            java.lang.Object r8 = r7.A00
            X.9N7 r8 = (X.AnonymousClass9N7) r8
            java.lang.Object r1 = r7.A01
            X.9up r1 = (X.C207269up) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r8, r0)
            X.6bW r9 = r1.A0B
            r7 = -1
            r13 = 0
            r6 = 1
            if (r9 == 0) goto L_0x0225
            X.6bD r0 = r9.A00
            if (r0 == 0) goto L_0x0225
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x0225
            java.util.Iterator r12 = r0.iterator()
            r5 = 0
        L_0x0132:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0225
            java.lang.Object r0 = r12.next()
            X.6bO r0 = (X.C134656bO) r0
            java.util.List r4 = r0.A01
            r11 = 0
            if (r4 == 0) goto L_0x014d
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto L_0x01e4
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x01e4
        L_0x014d:
            r10 = 0
        L_0x014e:
            java.util.List r3 = r9.A02
            if (r3 == 0) goto L_0x01de
            int r0 = r3.size()
            if (r0 <= r6) goto L_0x01de
            if (r4 == 0) goto L_0x0164
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto L_0x01aa
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x01aa
        L_0x0164:
            r0 = 0
        L_0x0165:
            if (r10 == 0) goto L_0x01a7
            if (r0 == 0) goto L_0x01a7
        L_0x0169:
            java.util.HashSet r4 = X.C36441kJ.A16()
            if (r9 == 0) goto L_0x017b
            X.6bD r0 = r9.A00
            if (r0 == 0) goto L_0x017b
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x017b
            int r13 = r0.size()
        L_0x017b:
            if (r5 == r7) goto L_0x0228
            if (r13 == 0) goto L_0x0228
            int r3 = r5 + -5
            int r2 = r5 + 5
            if (r3 > r2) goto L_0x0228
        L_0x0185:
            if (r3 == r5) goto L_0x01a2
            if (r9 == 0) goto L_0x01a2
            X.6bD r0 = r9.A00
            if (r0 == 0) goto L_0x01a2
            java.util.List r1 = r0.A00
            if (r1 == 0) goto L_0x01a2
            int r0 = r13 * 5
            int r0 = r0 + r3
            int r0 = r0 % r13
            java.lang.Object r0 = r1.get(r0)
            X.6bO r0 = (X.C134656bO) r0
            if (r0 == 0) goto L_0x01a2
            java.lang.String r0 = r0.A00
            r4.add(r0)
        L_0x01a2:
            if (r3 == r2) goto L_0x0228
            int r3 = r3 + 1
            goto L_0x0185
        L_0x01a7:
            int r5 = r5 + 1
            goto L_0x0132
        L_0x01aa:
            java.util.Iterator r4 = r4.iterator()
        L_0x01ae:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0164
            java.lang.Object r2 = r4.next()
            X.6bJ r2 = (X.C134606bJ) r2
            java.lang.String r1 = r2.A01
            java.lang.Object r0 = X.C007103b.A0P(r3, r6)
            X.6bJ r0 = (X.C134606bJ) r0
            if (r0 == 0) goto L_0x01e2
            java.lang.String r0 = r0.A01
        L_0x01c6:
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x01ae
            java.lang.String r1 = r2.A00
            java.lang.Object r0 = X.C007103b.A0P(r3, r6)
            X.6bJ r0 = (X.C134606bJ) r0
            if (r0 == 0) goto L_0x01e0
            java.lang.String r0 = r0.A00
        L_0x01d8:
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x01ae
        L_0x01de:
            r0 = 1
            goto L_0x0165
        L_0x01e0:
            r0 = r11
            goto L_0x01d8
        L_0x01e2:
            r0 = r11
            goto L_0x01c6
        L_0x01e4:
            java.util.Iterator r10 = r4.iterator()
        L_0x01e8:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x014d
            java.lang.Object r3 = r10.next()
            X.6bJ r3 = (X.C134606bJ) r3
            java.lang.String r1 = r3.A01
            java.util.List r2 = r9.A02
            if (r2 == 0) goto L_0x0223
            java.lang.Object r0 = X.C007103b.A0M(r2)
            X.6bJ r0 = (X.C134606bJ) r0
            if (r0 == 0) goto L_0x0223
            java.lang.String r0 = r0.A01
        L_0x0204:
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x01e8
            java.lang.String r1 = r3.A00
            if (r2 == 0) goto L_0x0221
            java.lang.Object r0 = X.C007103b.A0M(r2)
            X.6bJ r0 = (X.C134606bJ) r0
            if (r0 == 0) goto L_0x0221
            java.lang.String r0 = r0.A00
        L_0x0218:
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x01e8
            r10 = 1
            goto L_0x014e
        L_0x0221:
            r0 = r11
            goto L_0x0218
        L_0x0223:
            r0 = r11
            goto L_0x0204
        L_0x0225:
            r5 = -1
            goto L_0x0169
        L_0x0228:
            boolean r0 = X.C36411kG.A1a(r4)
            if (r0 == 0) goto L_0x0012
            com.whatsapp.jid.UserJid r6 = r8.A00
            if (r6 == 0) goto L_0x0012
            X.9Ud r5 = r8.A02
            java.util.List r4 = X.C007103b.A0Y(r4)
            X.0wG r0 = r8.A03
            android.content.Context r3 = r0.A00
            android.content.res.Resources r2 = r3.getResources()
            r0 = 2131167394(0x7f0708a2, float:1.794906E38)
            r1 = 2131167394(0x7f0708a2, float:1.794906E38)
            int r0 = r2.getDimensionPixelSize(r0)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            android.content.res.Resources r0 = r3.getResources()
            int r0 = r0.getDimensionPixelSize(r1)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            X.9gC r0 = new X.9gC
            r0.<init>(r6, r2, r1, r4)
            r5.A01(r0)
            return
        L_0x0263:
            java.lang.Object r10 = r7.A00
            X.6pw r10 = (X.C143076pw) r10
            java.lang.Object r1 = r7.A01
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            X.0y0 r0 = r10.A01
            X.00I r1 = X.C143076pw.A00(r1, r0)
            java.lang.Object r0 = r1.A00
            boolean r0 = X.AnonymousClass000.A1X(r0)
            if (r0 != 0) goto L_0x0289
            X.9N6 r0 = r10.A00
            if (r0 == 0) goto L_0x0012
        L_0x027d:
            X.7yb r0 = r0.A02
            X.00s r2 = r0.A0A
            java.lang.Boolean r0 = X.C36371kC.A0m()
        L_0x0285:
            r2.A0C(r0)
            return
        L_0x0289:
            java.lang.Object r4 = r1.A01
            java.io.File r4 = (java.io.File) r4
            android.net.Uri r2 = android.net.Uri.fromFile(r4)
            r1 = 200(0xc8, float:2.8E-43)
            X.1GX r0 = r10.A02     // Catch:{ Exception -> 0x03b7 }
            android.graphics.Bitmap r17 = r0.A0e(r2, r1, r1)     // Catch:{ Exception -> 0x03b7 }
            java.io.ByteArrayOutputStream r16 = X.C90524aI.A0Q()     // Catch:{ Exception -> 0x03b7 }
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x03ad }
            r2 = 80
            r1 = r17
            r0 = r16
            r1.compress(r3, r2, r0)     // Catch:{ all -> 0x03ad }
            byte[] r0 = r16.toByteArray()     // Catch:{ all -> 0x03ad }
            X.9N6 r9 = r10.A00     // Catch:{ all -> 0x03ad }
            if (r9 == 0) goto L_0x03a5
            X.9HN r11 = new X.9HN     // Catch:{ all -> 0x03ad }
            r11.<init>(r4, r0)     // Catch:{ all -> 0x03ad }
            X.7yb r3 = r9.A02     // Catch:{ all -> 0x03ad }
            X.3L6 r8 = r3.A0P     // Catch:{ all -> 0x03ad }
            int r0 = r9.A00     // Catch:{ all -> 0x03ad }
            r35 = r0
            java.lang.String r1 = java.lang.String.valueOf(r35)     // Catch:{ all -> 0x03ad }
            java.lang.String r7 = "order_creates_tag"
            java.lang.String r0 = "ProductsCount"
            r8.A03(r7, r0, r1)     // Catch:{ all -> 0x03ad }
            X.9Y1 r12 = r3.A0J     // Catch:{ all -> 0x03ad }
            X.9Sx r2 = X.C36321k7.A03(r12)     // Catch:{ all -> 0x03ad }
            X.C36321k7.A0p(r2, r12)     // Catch:{ all -> 0x03ad }
            r0 = 34
            X.C36401kF.A1F(r2, r0)     // Catch:{ all -> 0x03ad }
            r0 = 56
            X.C36411kG.A1G(r2, r0)     // Catch:{ all -> 0x03ad }
            X.00s r0 = r3.A03     // Catch:{ all -> 0x03ad }
            X.C195209Sx.A00(r0, r2)     // Catch:{ all -> 0x03ad }
            com.whatsapp.jid.UserJid r6 = r3.A0O     // Catch:{ all -> 0x03ad }
            r2.A00 = r6     // Catch:{ all -> 0x03ad }
            X.9Jt r1 = r9.A03     // Catch:{ all -> 0x03ad }
            java.lang.String r5 = r1.A01     // Catch:{ all -> 0x03ad }
            r2.A0F = r5     // Catch:{ all -> 0x03ad }
            java.lang.String r0 = r9.A04     // Catch:{ all -> 0x03ad }
            r34 = r0
            boolean r0 = r34.isEmpty()     // Catch:{ all -> 0x03ad }
            r4 = 1
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x03ad }
            r2.A03 = r0     // Catch:{ all -> 0x03ad }
            r12.A03(r2)     // Catch:{ all -> 0x03ad }
            X.1X4 r3 = r3.A0F     // Catch:{ all -> 0x03ad }
            byte[] r2 = r11.A01     // Catch:{ all -> 0x03ad }
            java.lang.String r0 = r9.A05     // Catch:{ all -> 0x03ad }
            r33 = r0
            java.io.File r14 = r11.A00     // Catch:{ all -> 0x03ad }
            java.lang.String r0 = r1.A02     // Catch:{ all -> 0x03ad }
            r32 = r0
            X.9Ju r11 = r1.A00     // Catch:{ all -> 0x03ad }
            r1 = 0
            if (r11 == 0) goto L_0x036f
            X.6Tk r0 = r11.A00     // Catch:{ all -> 0x03ad }
            java.lang.String r1 = r0.A00     // Catch:{ all -> 0x03ad }
            java.math.BigDecimal r13 = r11.A01     // Catch:{ all -> 0x03ad }
        L_0x0317:
            X.3Qj r12 = new X.3Qj     // Catch:{ all -> 0x03ad }
            r12.<init>()     // Catch:{ all -> 0x03ad }
            r12.A0I = r14     // Catch:{ all -> 0x03ad }
            X.1D5 r14 = r3.A0p     // Catch:{ all -> 0x03ad }
            r19 = 0
            r28 = 44
            r0 = 0
            r11 = 0
            r23 = r19
            r24 = r19
            r25 = r19
            r26 = r19
            r27 = r19
            r29 = 0
            r30 = 0
            r31 = 0
            r18 = r14
            r20 = r12
            r21 = r19
            r22 = r6
            X.2bU r14 = r18.A03(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)     // Catch:{ all -> 0x03ad }
            X.2bw r14 = (X.C46952bw) r14     // Catch:{ all -> 0x03ad }
            X.0yC r15 = r3.A0j     // Catch:{ all -> 0x03ad }
            r12 = 4893(0x131d, float:6.857E-42)
            boolean r12 = r15.A0E(r12)     // Catch:{ all -> 0x03ad }
            int r12 = X.C36371kC.A00(r12)
            r15 = r35
            r14.A00 = r15     // Catch:{ all -> 0x03ad }
            r15 = r34
            r14.A06 = r15     // Catch:{ all -> 0x03ad }
            r14.A02 = r4     // Catch:{ all -> 0x03ad }
            r14.A07 = r5     // Catch:{ all -> 0x03ad }
            r14.A03 = r4     // Catch:{ all -> 0x03ad }
            r5 = r33
            r14.A08 = r5     // Catch:{ all -> 0x03ad }
            r14.A04 = r6     // Catch:{ all -> 0x03ad }
            r5 = r32
            r14.A09 = r5     // Catch:{ all -> 0x03ad }
            r14.A05 = r1     // Catch:{ all -> 0x03ad }
            r14.A0A = r13     // Catch:{ all -> 0x03ad }
            r14.A01 = r12     // Catch:{ all -> 0x03ad }
            goto L_0x0371
        L_0x036f:
            r13 = r1
            goto L_0x0317
        L_0x0371:
            if (r2 == 0) goto L_0x0376
            r14.A1C(r2)     // Catch:{ all -> 0x03ad }
        L_0x0376:
            java.util.List r5 = java.util.Collections.singletonList(r14)     // Catch:{ all -> 0x03ad }
            X.3SC r1 = new X.3SC     // Catch:{ all -> 0x03ad }
            r1.<init>(r5, r0)     // Catch:{ all -> 0x03ad }
            r3.A0b(r1, r2, r0, r0)     // Catch:{ all -> 0x03ad }
            X.01L r9 = r9.A01     // Catch:{ all -> 0x03ad }
            java.lang.String r5 = "CartViewMode:sendCart"
            X.190 r0 = new X.190     // Catch:{ all -> 0x03ad }
            r0.<init>()     // Catch:{ all -> 0x03ad }
            android.content.Intent r3 = r0.A1Z(r9, r6, r11)     // Catch:{ all -> 0x03ad }
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x03ad }
            java.lang.String r2 = "start_t"
            android.content.Intent r0 = r3.putExtra(r2, r0)     // Catch:{ all -> 0x03ad }
            X.AnonymousClass3M9.A01(r0, r5)     // Catch:{ all -> 0x03ad }
            r9.startActivity(r0)     // Catch:{ all -> 0x03ad }
            r9.finish()     // Catch:{ all -> 0x03ad }
            r8.A05(r7, r4)     // Catch:{ all -> 0x03ad }
        L_0x03a5:
            r16.close()     // Catch:{ Exception -> 0x03b7 }
            r17.recycle()     // Catch:{ Exception -> 0x03b7 }
            goto L_0x0b4a
        L_0x03ad:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x03b2 }
            goto L_0x03b6
        L_0x03b2:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x03b7 }
        L_0x03b6:
            throw r1     // Catch:{ Exception -> 0x03b7 }
        L_0x03b7:
            X.9N6 r0 = r10.A00
            if (r0 == 0) goto L_0x0012
            goto L_0x027d
        L_0x03bd:
            java.lang.Object r3 = r7.A00
            X.9OT r3 = (X.AnonymousClass9OT) r3
            java.lang.Object r4 = r7.A01
            java.util.concurrent.Future r4 = (java.util.concurrent.Future) r4
            r1 = 32000(0x7d00, double:1.581E-319)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x03f2, Exception -> 0x03fa }
            java.lang.Object r0 = r4.get(r1, r0)     // Catch:{ ExecutionException -> 0x03f2, Exception -> 0x03fa }
            X.9HO r0 = (X.AnonymousClass9HO) r0     // Catch:{ ExecutionException -> 0x03f2, Exception -> 0x03fa }
            java.lang.Object r2 = r0.A01     // Catch:{ ExecutionException -> 0x03f2, Exception -> 0x03fa }
            if (r2 == 0) goto L_0x03e7
            X.5ku r0 = r3.A05     // Catch:{ ExecutionException -> 0x03f2, Exception -> 0x03fa }
            X.9Ww r2 = (X.C195939Ww) r2     // Catch:{ ExecutionException -> 0x03f2, Exception -> 0x03fa }
            java.util.Map r1 = r0.A00     // Catch:{ ExecutionException -> 0x03f2, Exception -> 0x03fa }
            java.lang.String r0 = r2.A03     // Catch:{ ExecutionException -> 0x03f2, Exception -> 0x03fa }
            r1.put(r0, r2)     // Catch:{ ExecutionException -> 0x03f2, Exception -> 0x03fa }
            X.00s r0 = r3.A00     // Catch:{ ExecutionException -> 0x03f2, Exception -> 0x03fa }
            if (r0 == 0) goto L_0x0012
            r0.A0C(r2)     // Catch:{ ExecutionException -> 0x03f2, Exception -> 0x03fa }
            goto L_0x0b4b
        L_0x03e7:
            android.util.Pair r1 = r0.A00     // Catch:{ ExecutionException -> 0x03f2, Exception -> 0x03fa }
            X.00s r0 = r3.A01     // Catch:{ ExecutionException -> 0x03f2, Exception -> 0x03fa }
            if (r0 == 0) goto L_0x0012
            r0.A0C(r1)     // Catch:{ ExecutionException -> 0x03f2, Exception -> 0x03fa }
            goto L_0x0b4c
        L_0x03f2:
            r2 = move-exception
            java.lang.String r0 = "OrderRepository/fetchOrder/delivery-failure"
            com.whatsapp.util.Log.e(r0, r2)
            r0 = 2
            goto L_0x0401
        L_0x03fa:
            r2 = move-exception
            java.lang.String r0 = "OrderRepository/fetchOrder/fetch-error"
            com.whatsapp.util.Log.e(r0, r2)
            r0 = 1
        L_0x0401:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = r2.toString()
            android.util.Pair r1 = X.C36441kJ.A0Q(r1, r0)
            X.00s r0 = r3.A01
            if (r0 == 0) goto L_0x0012
            r0.A0C(r1)
            return
        L_0x0415:
            java.lang.Object r0 = r7.A00
            X.8VB r0 = (X.AnonymousClass8VB) r0
            java.lang.Object r1 = r7.A01
            if (r1 == 0) goto L_0x0621
            X.B1n r0 = r0.A01
            if (r0 == 0) goto L_0x0012
            r0.onSuccess(r1)
            return
        L_0x0425:
            java.lang.Object r0 = r7.A00
            X.A9E r0 = (X.A9E) r0
            java.lang.Object r1 = r7.A01
            X.00s r0 = r0.A02
            if (r0 == 0) goto L_0x0012
            r0.A0D(r1)
            return
        L_0x0433:
            java.lang.Object r5 = r7.A00
            X.9dH r5 = (X.C198329dH) r5
            java.lang.Object r1 = r7.A01
            X.9VQ r1 = (X.AnonymousClass9VQ) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r5, r0)
            X.6VE r6 = r5.A0E
            com.whatsapp.jid.UserJid r4 = r5.A0K
            java.util.List r3 = r1.A00
            r7 = 1
            r17 = 0
            X.1Wd r0 = r6.A00     // Catch:{ Exception -> 0x04eb }
            X.54c r0 = r0.A00()     // Catch:{ Exception -> 0x04eb }
            X.1M0 r8 = r0.A04()     // Catch:{ Exception -> 0x04eb }
            X.71s r10 = r8.B1k()     // Catch:{ all -> 0x04e3 }
            X.777 r0 = r6.A04(r4)     // Catch:{ all -> 0x04d9 }
            java.lang.Object r9 = r0.get()     // Catch:{ all -> 0x04d9 }
            java.util.List r9 = (java.util.List) r9     // Catch:{ all -> 0x04d9 }
            int r0 = r3.size()     // Catch:{ all -> 0x04d9 }
            java.util.HashMap r11 = new java.util.HashMap     // Catch:{ all -> 0x04d9 }
            r11.<init>(r0)     // Catch:{ all -> 0x04d9 }
            java.util.Iterator r2 = r3.iterator()     // Catch:{ all -> 0x04d9 }
        L_0x046d:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x04d9 }
            if (r0 == 0) goto L_0x047f
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x04d9 }
            X.9up r1 = (X.C207269up) r1     // Catch:{ all -> 0x04d9 }
            java.lang.String r0 = r1.A0F     // Catch:{ all -> 0x04d9 }
            r11.put(r0, r1)     // Catch:{ all -> 0x04d9 }
            goto L_0x046d
        L_0x047f:
            java.util.Iterator r16 = r9.iterator()     // Catch:{ all -> 0x04d9 }
            r2 = 0
        L_0x0484:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x04d7 }
            if (r0 == 0) goto L_0x04cd
            X.6B4 r0 = X.C165617ti.A0M(r16)     // Catch:{ all -> 0x04d7 }
            X.9up r14 = r0.A02     // Catch:{ all -> 0x04d7 }
            long r0 = r0.A00     // Catch:{ all -> 0x04d7 }
            java.lang.String r13 = r14.A0F     // Catch:{ all -> 0x04d7 }
            java.lang.Object r12 = r11.get(r13)     // Catch:{ all -> 0x04d7 }
            X.9up r12 = (X.C207269up) r12     // Catch:{ all -> 0x04d7 }
            if (r12 == 0) goto L_0x0484
            X.9tw r9 = r12.A01     // Catch:{ all -> 0x04d7 }
            if (r9 == 0) goto L_0x04ab
            int r15 = r9.A00     // Catch:{ all -> 0x04d7 }
            r9 = 3
            if (r15 != r9) goto L_0x04ab
        L_0x04a5:
            r6.A07(r4, r13)     // Catch:{ all -> 0x04d7 }
            int r2 = r2 + 1
            goto L_0x0484
        L_0x04ab:
            int r9 = r12.A00     // Catch:{ all -> 0x04d7 }
            if (r9 == r7) goto L_0x04a5
            boolean r9 = r12.A08     // Catch:{ all -> 0x04d7 }
            if (r9 != 0) goto L_0x04a5
            boolean r9 = r14.equals(r12)     // Catch:{ all -> 0x04d7 }
            if (r9 != 0) goto L_0x0484
            r22 = 1
            X.6B4 r9 = new X.6B4     // Catch:{ all -> 0x04d7 }
            r19 = r12
            r20 = r0
            r18 = r9
            r18.<init>(r19, r20, r22)     // Catch:{ all -> 0x04d7 }
            int r0 = X.AnonymousClass6VE.A00(r6, r9, r8, r4)     // Catch:{ all -> 0x04d7 }
            int r17 = r17 + r0
            goto L_0x0484
        L_0x04cd:
            r10.A00()     // Catch:{ all -> 0x04d7 }
            r10.close()     // Catch:{ all -> 0x04e1 }
            r8.close()     // Catch:{ Exception -> 0x04ec }
            goto L_0x04ec
        L_0x04d7:
            r1 = move-exception
            goto L_0x04db
        L_0x04d9:
            r1 = move-exception
            r2 = 0
        L_0x04db:
            throw r1     // Catch:{ all -> 0x04dc }
        L_0x04dc:
            r0 = move-exception
            X.C05600Qi.A00(r10, r1)     // Catch:{ all -> 0x04e1 }
            throw r0     // Catch:{ all -> 0x04e1 }
        L_0x04e1:
            r1 = move-exception
            goto L_0x04e5
        L_0x04e3:
            r1 = move-exception
            r2 = 0
        L_0x04e5:
            throw r1     // Catch:{ all -> 0x04e6 }
        L_0x04e6:
            r0 = move-exception
            X.C05600Qi.A00(r8, r1)     // Catch:{ Exception -> 0x04ec }
            throw r0     // Catch:{ Exception -> 0x04ec }
        L_0x04eb:
            r2 = 0
        L_0x04ec:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            android.util.Pair r1 = X.C36341k9.A0I(r0, r2)
            java.lang.Object r0 = r1.first
            X.AnonymousClass00C.A07(r0)
            int r0 = X.AnonymousClass000.A0I(r0)
            r11 = 1
            if (r0 > 0) goto L_0x0501
            r7 = 0
        L_0x0501:
            java.lang.Object r0 = r1.second
            X.AnonymousClass00C.A07(r0)
            int r0 = X.AnonymousClass000.A0I(r0)
            if (r0 > 0) goto L_0x050d
            r11 = 0
        L_0x050d:
            java.util.Iterator r10 = r3.iterator()
        L_0x0511:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0556
            java.lang.Object r8 = r10.next()
            X.9up r8 = (X.C207269up) r8
            X.1Ws r9 = r5.A0H
            java.lang.String r0 = r8.A0F
            X.9up r2 = X.C165617ti.A0N(r9, r0)
            if (r2 == 0) goto L_0x0511
            X.9tw r1 = r8.A01
            if (r1 == 0) goto L_0x0541
            int r0 = r1.A00
            if (r0 == 0) goto L_0x0541
            r2.A01 = r1
        L_0x0531:
            r9.A0C(r2, r4)
            X.17Y r2 = r5.A0B
            r1 = 30
            X.AVa r0 = new X.AVa
            r0.<init>(r5, r8, r1)
            r2.A0H(r0)
            goto L_0x0511
        L_0x0541:
            java.lang.String r0 = r8.A05
            r2.A05 = r0
            java.math.BigDecimal r0 = r8.A06
            r2.A06 = r0
            X.6Tk r0 = r8.A04
            r2.A04 = r0
            X.6bV r0 = r8.A02
            r2.A02 = r0
            int r0 = r8.A00
            r2.A00 = r0
            goto L_0x0531
        L_0x0556:
            if (r11 == 0) goto L_0x0568
            if (r7 != 0) goto L_0x056d
            X.8ym r1 = X.C187938ym.SOME_UNAVAILABLE
        L_0x055c:
            X.00s r0 = r5.A02
            if (r0 == 0) goto L_0x0563
            r0.A0C(r1)
        L_0x0563:
            X.777 r0 = r6.A04(r4)
            goto L_0x0570
        L_0x0568:
            if (r7 != 0) goto L_0x056d
            X.8ym r1 = X.C187938ym.NO_CHANGES
            goto L_0x055c
        L_0x056d:
            X.8ym r1 = X.C187938ym.AT_LEAST_ONE_UPDATED
            goto L_0x055c
        L_0x0570:
            java.lang.Object r7 = r0.get()     // Catch:{ Exception -> 0x0012 }
            java.util.List r7 = (java.util.List) r7     // Catch:{ Exception -> 0x0012 }
            X.00s r8 = r5.A01     // Catch:{ Exception -> 0x0012 }
            if (r8 == 0) goto L_0x05e8
            if (r7 == 0) goto L_0x05e5
            java.util.HashMap r6 = X.AnonymousClass001.A0J()     // Catch:{ Exception -> 0x0012 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x0012 }
        L_0x0584:
            boolean r0 = r3.hasNext()     // Catch:{ Exception -> 0x0012 }
            if (r0 == 0) goto L_0x05ac
            java.lang.Object r0 = r3.next()     // Catch:{ Exception -> 0x0012 }
            X.9up r0 = (X.C207269up) r0     // Catch:{ Exception -> 0x0012 }
            java.util.List r0 = r0.A07     // Catch:{ Exception -> 0x0012 }
            java.util.List r0 = X.C007103b.A0V(r0)     // Catch:{ Exception -> 0x0012 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ Exception -> 0x0012 }
        L_0x059a:
            boolean r0 = r2.hasNext()     // Catch:{ Exception -> 0x0012 }
            if (r0 == 0) goto L_0x0584
            java.lang.Object r1 = r2.next()     // Catch:{ Exception -> 0x0012 }
            X.9tv r1 = (X.C206759tv) r1     // Catch:{ Exception -> 0x0012 }
            java.lang.String r0 = r1.A04     // Catch:{ Exception -> 0x0012 }
            r6.put(r0, r1)     // Catch:{ Exception -> 0x0012 }
            goto L_0x059a
        L_0x05ac:
            java.util.Iterator r9 = r7.iterator()     // Catch:{ Exception -> 0x0012 }
        L_0x05b0:
            boolean r0 = r9.hasNext()     // Catch:{ Exception -> 0x0012 }
            if (r0 == 0) goto L_0x05e5
            X.6B4 r0 = X.C165617ti.A0M(r9)     // Catch:{ Exception -> 0x0012 }
            X.9up r0 = r0.A02     // Catch:{ Exception -> 0x0012 }
            java.util.List r0 = r0.A07     // Catch:{ Exception -> 0x0012 }
            java.util.List r0 = X.C007103b.A0V(r0)     // Catch:{ Exception -> 0x0012 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ Exception -> 0x0012 }
        L_0x05c6:
            boolean r0 = r3.hasNext()     // Catch:{ Exception -> 0x0012 }
            if (r0 == 0) goto L_0x05b0
            java.lang.Object r2 = r3.next()     // Catch:{ Exception -> 0x0012 }
            X.9tv r2 = (X.C206759tv) r2     // Catch:{ Exception -> 0x0012 }
            java.lang.String r0 = r2.A04     // Catch:{ Exception -> 0x0012 }
            java.lang.Object r1 = r6.get(r0)     // Catch:{ Exception -> 0x0012 }
            X.9tv r1 = (X.C206759tv) r1     // Catch:{ Exception -> 0x0012 }
            if (r1 == 0) goto L_0x05c6
            java.lang.String r0 = r1.A00     // Catch:{ Exception -> 0x0012 }
            r2.A00 = r0     // Catch:{ Exception -> 0x0012 }
            java.lang.String r0 = r1.A01     // Catch:{ Exception -> 0x0012 }
            r2.A01 = r0     // Catch:{ Exception -> 0x0012 }
            goto L_0x05c6
        L_0x05e5:
            r8.A0C(r7)     // Catch:{ Exception -> 0x0012 }
        L_0x05e8:
            X.6MH r1 = r5.A0D     // Catch:{ Exception -> 0x0012 }
            if (r7 == 0) goto L_0x05f2
            boolean r0 = r7.isEmpty()     // Catch:{ Exception -> 0x0012 }
            if (r0 == 0) goto L_0x0012
        L_0x05f2:
            r1.A01(r4)     // Catch:{ Exception -> 0x0012 }
            goto L_0x0b4d
        L_0x05f7:
            java.lang.Object r3 = r7.A00
            X.9dH r3 = (X.C198329dH) r3
            java.lang.Object r2 = r7.A01
            r0 = 0
            X.AnonymousClass00C.A0D(r3, r0)
            X.6VE r1 = r3.A0E     // Catch:{ Exception -> 0x0012 }
            com.whatsapp.jid.UserJid r0 = r3.A0K     // Catch:{ Exception -> 0x0012 }
            r1.A06(r0)     // Catch:{ Exception -> 0x0012 }
            X.00s r0 = r3.A09     // Catch:{ Exception -> 0x0012 }
            if (r0 == 0) goto L_0x0012
            r0.A0C(r2)     // Catch:{ Exception -> 0x0012 }
            goto L_0x0b4e
        L_0x0611:
            java.lang.Object r1 = r7.A00
            X.8V9 r1 = (X.AnonymousClass8V9) r1
            java.lang.Object r0 = r7.A01
            X.B1n r2 = r1.A01
            if (r2 == 0) goto L_0x0012
            if (r0 == 0) goto L_0x0625
            r2.onSuccess(r0)
            return
        L_0x0621:
            X.B1n r2 = r0.A01
            if (r2 == 0) goto L_0x0012
        L_0x0625:
            java.lang.Integer r1 = X.C36361kB.A0i()
            java.lang.String r0 = "order is null"
            goto L_0x0656
        L_0x062c:
            java.lang.Object r2 = r7.A00
            android.util.Pair r2 = (android.util.Pair) r2
            java.lang.Object r1 = r7.A01
            X.8V9 r1 = (X.AnonymousClass8V9) r1
            r0 = 1
            if (r2 == 0) goto L_0x064c
            X.B1n r0 = r1.A01
            if (r0 == 0) goto L_0x063e
            r0.BWb(r2)
        L_0x063e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "RefreshCartProtocol onError : "
        L_0x0644:
            java.lang.String r0 = X.AnonymousClass000.A0l(r2, r0, r1)
        L_0x0648:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x064c:
            X.B1n r2 = r1.A01
            if (r2 == 0) goto L_0x0012
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "error code is null"
        L_0x0656:
            android.util.Pair r0 = X.C36441kJ.A0Q(r1, r0)
            r2.BWb(r0)
            return
        L_0x065e:
            java.lang.Object r1 = r7.A00
            X.AI7 r1 = (X.AI7) r1
            java.lang.Object r2 = r7.A01
            X.9uZ r2 = (X.C207109uZ) r2
            X.1Kc r0 = r1.A03
            r0.A00(r2)
            X.1cK r0 = r1.A00
            if (r0 == 0) goto L_0x0672
            r0.BYa()
        L_0x0672:
            X.1cK r1 = r1.A00
            boolean r0 = r1 instanceof X.B65
            if (r0 == 0) goto L_0x0012
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.biz.GetBusinessProfileProtocol.GetBusinessProfileListenerWithBusinessProfile"
            X.AnonymousClass00C.A0E(r1, r0)
            X.B65 r1 = (X.B65) r1
            r1.BYb(r2)
            return
        L_0x0683:
            java.lang.Object r6 = r7.A00
            X.AAJ r6 = (X.AAJ) r6
            java.lang.Object r2 = r7.A01
            X.11F r2 = (X.AnonymousClass11F) r2
            X.16D r0 = r6.A02
            X.141 r0 = r0.A08(r2)
            r7 = 1
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.A0C()
            if (r0 != r7) goto L_0x0012
            X.1KK r1 = r6.A01
            com.whatsapp.jid.UserJid r0 = X.C36401kF.A0b(r2)
            X.9uZ r0 = r1.A07(r0)
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.A0X
            if (r0 != r7) goto L_0x0012
            X.0wQ r0 = r6.A00
            com.whatsapp.jid.PhoneUserJid r0 = X.C36441kJ.A0n(r0)
            java.lang.String r5 = X.C36381kD.A0w(r0)
            java.lang.String r4 = r2.getRawString()
            monitor-enter(r6)
            if (r5 == 0) goto L_0x0b7a
            goto L_0x0b4f
        L_0x06bd:
            java.lang.Object r2 = r7.A00
            X.3dG r2 = (X.C69273dG) r2
            java.lang.Object r4 = r7.A01
            X.1KK r1 = r2.A0e
            X.141 r0 = r2.A0J
            com.whatsapp.jid.UserJid r0 = X.C36351kA.A0l(r0)
            X.9uZ r0 = r1.A07(r0)
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.A0V
            if (r0 == 0) goto L_0x0012
            boolean r0 = X.C69273dG.A08(r2)
            if (r0 != 0) goto L_0x0012
            boolean r0 = X.C69273dG.A09(r2)
            if (r0 != 0) goto L_0x0012
            X.17Y r3 = r2.A0X
            r0 = 37
            X.72l r2 = new X.72l
            r2.<init>(r4, r0)
            goto L_0x0722
        L_0x06eb:
            java.lang.Object r6 = r7.A00
            X.3dG r6 = (X.C69273dG) r6
            java.lang.Object r5 = r7.A01
            X.185 r1 = r6.A0m
            com.whatsapp.jid.UserJid r0 = r6.A0A()
            X.3L0 r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0012
            X.1FR r4 = r6.A12
            r3 = 2131102712(0x7f060bf8, float:1.781787E38)
            r2 = 2131168998(0x7f070ee6, float:1.7952314E38)
            X.0wG r0 = r6.A0s
            android.content.Context r1 = r0.A00
            X.1De r0 = r6.A10
            X.9l8 r0 = r0.A02()
            X.1lL r1 = r4.A0K(r1, r0, r3, r2)
            X.17Y r3 = r6.A0X
            r0 = 23
            X.AVa r2 = new X.AVa
            r2.<init>(r5, r1, r0)
        L_0x0722:
            r3.A0H(r2)
            return
        L_0x0726:
            java.lang.Object r2 = r7.A00
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r1 = r7.A01
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            boolean r0 = r2 instanceof com.whatsapp.wds.components.actiontile.WDSActionTile
            if (r0 == 0) goto L_0x0012
            r0 = r2
            com.whatsapp.wds.components.actiontile.WDSActionTile r0 = (com.whatsapp.wds.components.actiontile.WDSActionTile) r0
            r0.setIcon((android.graphics.drawable.Drawable) r1)
            r0 = 0
            r2.setVisibility(r0)
            return
        L_0x073d:
            java.lang.Object r0 = r7.A00
            com.whatsapp.backup.google.viewmodel.RestoreFromBackupViewModel r0 = (com.whatsapp.backup.google.viewmodel.RestoreFromBackupViewModel) r0
            java.lang.Object r1 = r7.A01
            java.util.Set r1 = (java.util.Set) r1
            X.9HB r4 = r0.A04
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0012
            X.0y0 r3 = r4.A00
            r3.A0d()
            java.util.Iterator r6 = r1.iterator()
        L_0x0756:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0012
            java.lang.String r1 = X.AnonymousClass001.A0C(r6)
            X.179 r0 = r4.A01
            java.io.File r5 = r0.A07(r1)
            boolean r0 = X.AnonymousClass6Y6.A03(r3, r5)
            if (r0 == 0) goto L_0x0756
            boolean r0 = r5.exists()
            if (r0 != 0) goto L_0x0756
            java.io.File r1 = r5.getParentFile()
            if (r1 == 0) goto L_0x0795
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x0795
            boolean r0 = r1.mkdirs()
            if (r0 != 0) goto L_0x0795
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "gdrive-activity/create-placeholder/dir/failed "
            r1.append(r0)
            java.lang.String r0 = r5.getAbsolutePath()
            X.C36321k7.A1Z(r1, r0)
            goto L_0x0756
        L_0x0795:
            boolean r0 = r5.exists()     // Catch:{ IOException -> 0x07b2 }
            if (r0 != 0) goto L_0x0756
            boolean r0 = r5.createNewFile()     // Catch:{ IOException -> 0x07b2 }
            if (r0 != 0) goto L_0x0756
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x07b2 }
            java.lang.String r0 = "gdrive-activity/create-placeholder/file/failed "
            r1.append(r0)     // Catch:{ IOException -> 0x07b2 }
            java.lang.String r0 = r5.getAbsolutePath()     // Catch:{ IOException -> 0x07b2 }
            X.C36321k7.A1Z(r1, r0)     // Catch:{ IOException -> 0x07b2 }
            goto L_0x0756
        L_0x07b2:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "gdrive-activity/create-placeholder/failed "
            r1.append(r0)
            java.lang.String r0 = r5.getAbsolutePath()
            X.C36351kA.A1Q(r0, r1, r2)
            goto L_0x0756
        L_0x07c4:
            java.lang.Object r5 = r7.A00
            X.01I r5 = (X.AnonymousClass01I) r5
            java.lang.Object r0 = r7.A01
            X.14g r0 = (X.C224214g) r0
            long r3 = r0.A01()
            r1 = 500(0x1f4, double:2.47E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x07da
            long r1 = r1 - r3
            android.os.SystemClock.sleep(r1)
        L_0x07da:
            X.01z r1 = r5.getSupportFragmentManager()
            java.lang.String r0 = "auth_request_dialog"
            X.02E r0 = r1.A0N(r0)
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            if (r0 == 0) goto L_0x0012
            r0.A1c()
            return
        L_0x07ec:
            java.lang.Object r4 = r7.A00
            X.4y9 r4 = (X.C101704y9) r4
            java.lang.Object r5 = r7.A01
            androidx.fragment.app.DialogFragment r5 = (androidx.fragment.app.DialogFragment) r5
            int r3 = X.C34201gc.A00(r4)
            r2 = 0
            X.B87 r1 = new X.B87
            r1.<init>(r4, r2)
            r0 = 1
            android.app.Dialog r1 = X.AnonymousClass6Y6.A01(r4, r1, r3, r2, r0)
            if (r1 == 0) goto L_0x0b84
            boolean r0 = X.AnonymousClass3SJ.A04(r4)
            if (r0 != 0) goto L_0x0012
            boolean r0 = r4.A0M
            if (r0 == 0) goto L_0x082f
            return
        L_0x0810:
            java.lang.Object r4 = r7.A00
            com.whatsapp.backup.google.SettingsGoogleDrive r4 = (com.whatsapp.backup.google.SettingsGoogleDrive) r4
            java.lang.Object r5 = r7.A01
            androidx.fragment.app.DialogFragment r5 = (androidx.fragment.app.DialogFragment) r5
            int r3 = X.C34201gc.A00(r4)
            r2 = 1
            X.B87 r1 = new X.B87
            r1.<init>(r4, r2)
            r0 = 0
            android.app.Dialog r1 = X.AnonymousClass6Y6.A01(r4, r1, r3, r0, r2)
            if (r1 == 0) goto L_0x0b7c
            boolean r0 = com.whatsapp.backup.google.SettingsGoogleDrive.A0h(r4)
            if (r0 != 0) goto L_0x0012
        L_0x082f:
            java.lang.String r0 = "settings-gdrive/gps-unavailable/prompting-user-to-fix"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r5.A1c()
            r1.show()
            return
        L_0x083b:
            java.lang.Object r1 = r7.A00
            X.4y9 r1 = (X.C101704y9) r1
            java.lang.Object r2 = r7.A01
            X.02E r2 = (X.AnonymousClass02E) r2
            boolean r0 = X.AnonymousClass3SJ.A04(r1)
            if (r0 != 0) goto L_0x0012
            boolean r0 = r1.A0M
            if (r0 == 0) goto L_0x085c
            return
        L_0x084e:
            java.lang.Object r1 = r7.A00
            com.whatsapp.backup.google.SettingsGoogleDrive r1 = (com.whatsapp.backup.google.SettingsGoogleDrive) r1
            java.lang.Object r2 = r7.A01
            X.02E r2 = (X.AnonymousClass02E) r2
            boolean r0 = com.whatsapp.backup.google.SettingsGoogleDrive.A0h(r1)
            if (r0 != 0) goto L_0x0012
        L_0x085c:
            X.09Y r1 = X.C36341k9.A0O(r1)
            java.lang.String r0 = "auth_request_dialog"
            r1.A0D(r2, r0)
            r1.A02()
            return
        L_0x0869:
            java.lang.Object r5 = r7.A00
            X.3w4 r5 = (X.C80853w4) r5
            java.lang.Object r0 = r7.A01
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            com.whatsapp.appwidget.WidgetProvider.A0A = r0
            int[] r4 = r5.A08
            int r3 = r4.length
            r2 = 0
        L_0x0877:
            if (r2 >= r3) goto L_0x0012
            r9 = r4[r2]
            android.appwidget.AppWidgetManager r1 = r5.A00
            android.os.Bundle r6 = r1.getAppWidgetOptions(r9)
            if (r6 == 0) goto L_0x0893
            java.lang.String r0 = "appWidgetMinWidth"
            int r10 = r6.getInt(r0)
            java.lang.String r0 = "appWidgetMinHeight"
            int r11 = r6.getInt(r0)
            if (r10 == 0) goto L_0x0893
            if (r11 != 0) goto L_0x0899
        L_0x0893:
            r10 = 2147483647(0x7fffffff, float:NaN)
            r11 = 2147483647(0x7fffffff, float:NaN)
        L_0x0899:
            android.content.Context r6 = r5.A01
            X.18U r7 = r5.A02
            X.0ts r8 = r5.A04
            android.widget.RemoteViews r0 = com.whatsapp.appwidget.WidgetProvider.A00(r6, r7, r8, r9, r10, r11)
            r1.updateAppWidget(r9, r0)
            r0 = 100
            if (r10 <= r0) goto L_0x08b2
            if (r11 <= r0) goto L_0x08b2
            r0 = 2131431257(0x7f0b0f59, float:1.8484238E38)
            r1.notifyAppWidgetViewDataChanged(r9, r0)
        L_0x08b2:
            int r2 = r2 + 1
            goto L_0x0877
        L_0x08b5:
            java.lang.Object r0 = r7.A00
            X.7yJ r0 = (X.C167577yJ) r0
            java.lang.Object r1 = r7.A01
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.00s r3 = r0.A04
            X.9UA r2 = r0.A07
            if (r1 == 0) goto L_0x08db
            X.185 r0 = r2.A00
            X.3L0 r0 = r0.A01(r1)
            int r1 = X.AnonymousClass6W7.A00(r0)
            r0 = 2
            if (r1 != r0) goto L_0x08db
            X.0yC r1 = r2.A01
            r0 = 4893(0x131d, float:6.857E-42)
            boolean r1 = r1.A0E(r0)
            r0 = 1
            if (r1 != 0) goto L_0x08dc
        L_0x08db:
            r0 = 0
        L_0x08dc:
            X.C36341k9.A19(r3, r0)
            return
        L_0x08e0:
            return
        L_0x08e1:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x08e4:
            java.lang.Object r0 = r7.A01
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            X.0CZ r0 = r0.A0G
            X.C18740tg.A06(r0)
            X.8VJ r0 = (X.AnonymousClass8VJ) r0
            r0.A0R()
            return
        L_0x08f3:
            java.lang.Object r0 = r7.A00
            X.3dT r0 = (X.C69403dT) r0
            java.lang.Object r2 = r7.A01
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.1KK r1 = r0.A0B
            X.9uZ r0 = r0.A02
            r1.A0G(r0, r2)
            return
        L_0x0903:
            java.lang.Object r1 = r7.A00
            com.whatsapp.biz.catalog.view.AvailabilityStateImageView r1 = (com.whatsapp.biz.catalog.view.AvailabilityStateImageView) r1
            java.lang.Object r0 = r7.A01
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            com.whatsapp.biz.catalog.view.AvailabilityStateImageView.setImageDrawable$lambda$0(r1, r0)
            return
        L_0x090f:
            java.lang.Object r2 = r7.A00
            X.9Y1 r2 = (X.AnonymousClass9Y1) r2
            java.lang.Object r4 = r7.A01
            X.9Sx r4 = (X.C195209Sx) r4
            X.0yC r3 = r2.A06
            X.0wQ r1 = r2.A04
            X.1KU r7 = r2.A08
            X.185 r5 = r2.A05
            r6 = 0
            X.AnonymousClass00C.A0D(r3, r6)
            X.C36321k7.A11(r1, r7, r5)
            com.whatsapp.jid.UserJid r0 = r4.A00
            boolean r0 = r1.A0M(r0)
            if (r0 == 0) goto L_0x099f
            X.8cH r1 = new X.8cH
            r1.<init>()
            java.lang.Integer r0 = r4.A04
            r1.A02 = r0
            java.lang.String r0 = r4.A0A
            r1.A06 = r0
            java.lang.String r0 = r4.A0G
            r1.A0A = r0
            java.lang.Integer r0 = r4.A07
            r1.A04 = r0
            java.lang.Long r0 = r4.A08
            r1.A05 = r0
            java.lang.String r0 = r4.A0F
            r1.A09 = r0
            java.lang.Boolean r0 = r4.A03
            r1.A01 = r0
            java.lang.Boolean r0 = r4.A01
            r1.A00 = r0
            java.lang.String r0 = r4.A0C
            r1.A08 = r0
            java.lang.String r0 = r4.A0H
            r1.A0B = r0
            java.lang.String r0 = r4.A0B
            r1.A07 = r0
            java.lang.Integer r0 = r4.A05
            r1.A03 = r0
        L_0x0963:
            r0 = 4494(0x118e, float:6.297E-42)
            boolean r0 = r3.A0E(r0)
            if (r0 == 0) goto L_0x097b
            boolean r0 = r1 instanceof X.C176618cP
            if (r0 == 0) goto L_0x097b
            r6 = r1
            X.8cP r6 = (X.C176618cP) r6
            java.lang.String r3 = r6.A0B
            if (r3 != 0) goto L_0x0981
            java.lang.String r0 = "updateBizCatalogViewConversationInitiated: no catalogOwnerJid in the event"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x097b:
            X.0yW r0 = r2.A07
            r0.Bly(r1)
            return
        L_0x0981:
            X.13s r0 = com.whatsapp.jid.PhoneUserJid.Companion     // Catch:{ 0wR -> 0x0998 }
            com.whatsapp.jid.PhoneUserJid r5 = X.C222913s.A00(r3)     // Catch:{ 0wR -> 0x0998 }
            X.005 r0 = r2.A0B     // Catch:{ 0wR -> 0x0998 }
            java.lang.Object r0 = r0.get()     // Catch:{ 0wR -> 0x0998 }
            X.3Re r0 = (X.C65213Re) r0     // Catch:{ 0wR -> 0x0998 }
            long r3 = r0.A00     // Catch:{ 0wR -> 0x0998 }
            java.lang.Integer r0 = X.C65213Re.A00(r0, r5, r3)     // Catch:{ 0wR -> 0x0998 }
            r6.A08 = r0     // Catch:{ 0wR -> 0x0998 }
            goto L_0x097b
        L_0x0998:
            r3 = move-exception
            java.lang.String r0 = "updateBizCatalogViewConversationInitiated: could not get chat jid from catalogOwnerJid"
            com.whatsapp.util.Log.e(r0, r3)
            goto L_0x097b
        L_0x099f:
            X.8cP r1 = new X.8cP
            r1.<init>()
            java.lang.Long r0 = r4.A09
            r1.A0A = r0
            java.lang.Integer r0 = r4.A06
            r1.A06 = r0
            java.lang.String r0 = r4.A0A
            r1.A0C = r0
            java.lang.String r0 = r4.A0G
            r1.A0I = r0
            java.lang.Integer r0 = r4.A07
            r1.A07 = r0
            com.whatsapp.jid.UserJid r0 = r4.A00
            java.lang.String r0 = r7.A00(r0)
            r1.A0B = r0
            java.lang.Long r0 = r4.A08
            r1.A09 = r0
            java.lang.String r0 = r4.A0F
            r1.A0H = r0
            java.lang.Boolean r0 = r4.A03
            r1.A03 = r0
            java.lang.Boolean r0 = r4.A01
            r1.A00 = r0
            java.lang.String r0 = r4.A0C
            r1.A0E = r0
            java.lang.String r0 = r4.A0H
            r1.A0J = r0
            java.lang.String r0 = r4.A0B
            r1.A0D = r0
            java.lang.Integer r0 = r4.A05
            r1.A05 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r1.A01 = r0
            com.whatsapp.jid.UserJid r0 = r4.A00
            X.3L0 r0 = r5.A02(r0)
            int r0 = X.AnonymousClass6W7.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A04 = r0
            r0 = 4489(0x1189, float:6.29E-42)
            boolean r0 = r3.A0E(r0)
            if (r0 == 0) goto L_0x0a06
            java.lang.String r0 = r4.A0E
            r1.A0G = r0
            java.lang.String r0 = r4.A0D
            r1.A0F = r0
        L_0x0a06:
            java.lang.Boolean r0 = r4.A02
            r1.A02 = r0
            goto L_0x0963
        L_0x0a0c:
            java.lang.Object r1 = r7.A00
            X.9dH r1 = (X.C198329dH) r1
            java.lang.Object r2 = r7.A01
            X.9up r2 = (X.C207269up) r2
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.1cM r1 = r1.A0G
            java.lang.String r0 = r2.A0F
            r1.A00(r0)
            return
        L_0x0a20:
            java.lang.Object r0 = r7.A00
            X.1fn r0 = (X.C33701fn) r0
            java.lang.Object r3 = r7.A01
            X.4On r3 = (X.C87374On) r3
            X.C36321k7.A0w(r0, r3)
            X.1eX r0 = r0.A03
            X.1bg r2 = r0.A01
            int r1 = r0.A00()
            X.8zX r0 = X.C188408zX.PRIMARY_ACTION
            goto L_0x0a4b
        L_0x0a36:
            java.lang.Object r0 = r7.A00
            X.1fn r0 = (X.C33701fn) r0
            java.lang.Object r3 = r7.A01
            X.4On r3 = (X.C87374On) r3
            X.C36321k7.A0w(r0, r3)
            X.1eX r0 = r0.A03
            X.1bg r2 = r0.A01
            int r1 = r0.A00()
            X.8zX r0 = X.C188408zX.DISMISS_ACTION
        L_0x0a4b:
            r2.A00(r0, r3, r1)
            return
        L_0x0a4f:
            java.lang.Object r2 = r7.A00
            java.util.concurrent.atomic.AtomicBoolean r2 = (java.util.concurrent.atomic.AtomicBoolean) r2
            java.lang.Object r1 = r7.A01
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1
            java.util.regex.Pattern r0 = X.C130606Ls.A0G
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            r0 = 1
            r2.set(r0)
            r1.disconnect()
            return
        L_0x0a65:
            java.lang.Object r2 = r7.A00
            X.6Ls r2 = (X.C130606Ls) r2
            java.lang.Object r1 = r7.A01
            java.util.regex.Pattern r0 = X.C130606Ls.A0G
            X.0wD r0 = r2.A09
            r0.unregisterObserver(r1)
            return
        L_0x0a73:
            java.lang.Object r2 = r7.A00
            X.6Ls r2 = (X.C130606Ls) r2
            java.lang.Object r1 = r7.A01
            java.util.regex.Pattern r0 = X.C130606Ls.A0G
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            X.0wD r0 = r2.A09
            r0.registerObserver(r1)
            return
        L_0x0a85:
            java.lang.Object r2 = r7.A00
            com.whatsapp.backup.google.SettingsGoogleDrive r2 = (com.whatsapp.backup.google.SettingsGoogleDrive) r2
            java.lang.Object r1 = r7.A01
            com.whatsapp.backup.google.SettingsGoogleDrive$AuthRequestDialogFragment r1 = (com.whatsapp.backup.google.SettingsGoogleDrive.AuthRequestDialogFragment) r1
            X.0v0 r0 = r2.A09
            java.lang.String r0 = r0.A0c()
            com.whatsapp.backup.google.SettingsGoogleDrive.A0G(r1, r2, r0)
            return
        L_0x0a97:
            java.lang.Object r0 = r7.A00
            com.whatsapp.backup.google.SettingsGoogleDrive r0 = (com.whatsapp.backup.google.SettingsGoogleDrive) r0
            java.lang.Object r1 = r7.A01
            android.content.Intent r1 = (android.content.Intent) r1
            X.0wG r0 = r0.A0f
            android.content.Context r0 = r0.A00
            X.C111795cr.A01(r0, r1)
            return
        L_0x0aa7:
            java.lang.Object r6 = r7.A00
            com.whatsapp.backup.google.RestoreFromBackupActivity r6 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r6
            java.lang.Object r1 = r7.A01
            android.os.BaseBundle r1 = (android.os.BaseBundle) r1
            java.lang.String r0 = "total_download_size"
            r4 = -1
            long r2 = r1.getLong(r0, r4)
            java.lang.String r0 = "media_download_size"
            long r0 = r1.getLong(r0, r4)
            r6.A3q(r2, r0)
            return
        L_0x0ac1:
            java.lang.Object r3 = r7.A00
            com.whatsapp.backup.google.RestoreFromBackupActivity r3 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r3
            java.lang.Object r0 = r7.A01
            android.accounts.AccountManagerFuture r0 = (android.accounts.AccountManagerFuture) r0
            java.lang.String r2 = "authAccount"
            java.lang.Object r1 = r0.getResult()     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x0aea }
            android.os.BaseBundle r1 = (android.os.BaseBundle) r1     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x0aea }
            boolean r0 = r1.containsKey(r2)     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x0aea }
            if (r0 != 0) goto L_0x0add
            java.lang.String r0 = "restore>RestoreFromBackupActivity/error-during-add-account/account-manager-returned-with-no-account-name"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x0aea }
            return
        L_0x0add:
            java.lang.Object r0 = r1.get(r2)     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x0aea }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x0aea }
            r0 = 4
            com.whatsapp.backup.google.RestoreFromBackupActivity.A0p(r3, r1, r0)     // Catch:{ AuthenticatorException | OperationCanceledException | IOException -> 0x0aea }
            return
        L_0x0aea:
            r1 = move-exception
            java.lang.String r0 = "restore>RestoreFromBackupActivity/error-during-add-account"
            com.whatsapp.util.Log.e(r0, r1)
            X.17Y r2 = r3.A05
            r1 = 18
            X.72l r0 = new X.72l
            r0.<init>(r3, r1)
            r2.A0H(r0)
            return
        L_0x0afd:
            java.lang.Object r2 = r7.A00
            X.0wB r2 = (X.C19580wB) r2
            java.lang.Object r1 = r7.A01
            java.util.concurrent.Executor r0 = X.AnonymousClass6Y6.A00
            r2.unregisterObserver(r1)
            return
        L_0x0b09:
            java.lang.Object r2 = r7.A00
            X.0wB r2 = (X.C19580wB) r2
            java.lang.Object r1 = r7.A01
            java.util.concurrent.Executor r0 = X.AnonymousClass6Y6.A00
            r2.registerObserver(r1)
            return
        L_0x0b15:
            java.lang.Object r2 = r7.A00
            X.14u r2 = (X.C225314u) r2
            java.lang.Object r0 = r7.A01
            com.google.android.gms.auth.UserRecoverableAuthException r0 = (com.google.android.gms.auth.UserRecoverableAuthException) r0
            android.content.Intent r0 = r0.zza
            if (r0 != 0) goto L_0x0b27
            r1 = 0
        L_0x0b22:
            r0 = 1
            r2.BuO(r1, r0)
            return
        L_0x0b27:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r0)
            goto L_0x0b22
        L_0x0b2d:
            java.lang.Object r0 = r7.A00
            X.3O5 r0 = (X.AnonymousClass3O5) r0
            java.lang.Object r2 = r7.A01
            X.11F r2 = (X.AnonymousClass11F) r2
            X.1CR r1 = r0.A06
            r0 = 2
            r1.A0b(r2, r0)
            return
        L_0x0b3c:
            java.lang.Object r0 = r7.A00
            X.3O5 r0 = (X.AnonymousClass3O5) r0
            java.lang.Object r1 = r7.A01
            X.11F r1 = (X.AnonymousClass11F) r1
            X.1CR r0 = r0.A06
            r0.A0i(r1)
            return
        L_0x0b4a:
            return
        L_0x0b4b:
            return
        L_0x0b4c:
            return
        L_0x0b4d:
            return
        L_0x0b4e:
            return
        L_0x0b4f:
            X.0v0 r3 = r6.A03     // Catch:{ all -> 0x0b77 }
            boolean r0 = r3.A2W(r5, r4)     // Catch:{ all -> 0x0b77 }
            if (r0 != 0) goto L_0x0b7a
            android.content.SharedPreferences$Editor r2 = X.C19420v0.A00(r3)     // Catch:{ all -> 0x0b77 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0b77 }
            java.lang.String r0 = "dc_customer_sent_message_"
            r1.append(r0)     // Catch:{ all -> 0x0b77 }
            r1.append(r5)     // Catch:{ all -> 0x0b77 }
            r0 = 95
            java.lang.String r0 = X.C90464aC.A0f(r4, r1, r0)     // Catch:{ all -> 0x0b77 }
            X.C36331k8.A0w(r2, r0, r7)     // Catch:{ all -> 0x0b77 }
            r3.A1K(r4)     // Catch:{ all -> 0x0b77 }
            r3.A1L(r4)     // Catch:{ all -> 0x0b77 }
            goto L_0x0b7a
        L_0x0b77:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0b7a:
            monitor-exit(r6)
            return
        L_0x0b7c:
            java.lang.String r0 = "settings-gdrive/gps-unavailable no way to install."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            android.os.ConditionVariable r0 = r4.A0w
            goto L_0x0b8b
        L_0x0b84:
            java.lang.String r0 = "settings-gdrive/gps-unavailable no way to install."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            android.os.ConditionVariable r0 = r4.A0P
        L_0x0b8b:
            r0.open()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AVa.run():void");
    }
}
