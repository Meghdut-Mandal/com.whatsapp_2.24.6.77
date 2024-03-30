package X;

/* renamed from: X.4ZI  reason: invalid class name */
public class AnonymousClass4ZI implements AnonymousClass08V {
    public Object A00;
    public final int A01;

    public AnonymousClass4ZI(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.util.LinkedList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v46, resolved type: java.util.LinkedList} */
    /* JADX WARNING: type inference failed for: r5v8, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v77 */
    /* JADX WARNING: type inference failed for: r0v78 */
    /* JADX WARNING: type inference failed for: r0v79 */
    /* JADX WARNING: type inference failed for: r0v81 */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0286, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0287, code lost:
        com.whatsapp.util.Log.e("InviteNonWhatsAppContactPickerViewModel/getFilteredNonWAContactsListViewItems/error", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x028e, code lost:
        return X.C023409w.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
        if (r3.size() <= 0) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x025f, code lost:
        if (r12 == false) goto L_0x0563;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0261, code lost:
        r4 = r7.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0263, code lost:
        if (r4 == null) goto L_0x026c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0265, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x026a, code lost:
        if (r4.length() != 0) goto L_0x026d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x026c, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x026d, code lost:
        if (r1 != false) goto L_0x0563;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x026f, code lost:
        r0.add(new X.C70203el(X.C36351kA.A0x(r7.A00, r4, new java.lang.Object[1], 0, com.whatsapp.R.string.f12nameremoved)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0282, code lost:
        return r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0214 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01ab A[Catch:{ 02S | IllegalStateException -> 0x0286 }, LOOP:6: B:63:0x01a9->B:64:0x01ab, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01c6 A[Catch:{ 02S | IllegalStateException -> 0x0286 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01d2 A[Catch:{ 02S | IllegalStateException -> 0x0286 }, LOOP:7: B:69:0x01d0->B:70:0x01d2, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01ec A[Catch:{ 02S | IllegalStateException -> 0x0286 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01f7 A[Catch:{ 02S | IllegalStateException -> 0x0286 }, LOOP:8: B:75:0x01f5->B:76:0x01f7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0213 A[Catch:{ 02S | IllegalStateException -> 0x0286 }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r47) {
        /*
            r46 = this;
            r0 = r47
            r2 = r46
            int r1 = r2.A01
            switch(r1) {
                case 0: goto L_0x04b4;
                case 1: goto L_0x0009;
                case 2: goto L_0x0009;
                case 3: goto L_0x048d;
                case 4: goto L_0x0445;
                case 5: goto L_0x0468;
                case 6: goto L_0x0430;
                case 7: goto L_0x0407;
                case 8: goto L_0x03cc;
                case 9: goto L_0x03c3;
                case 10: goto L_0x036b;
                case 11: goto L_0x034f;
                case 12: goto L_0x028f;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r7 = r2.A00
            com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel r7 = (com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel) r7
            X.35p r0 = (X.C598735p) r0
            r6 = 1
            X.AnonymousClass00C.A0D(r0, r6)
            java.lang.String r20 = "InviteNonWhatsAppContactPickerViewModel/getFilteredNonWAContactsListViewItems/error"
            java.lang.Object r3 = r0.A01
            java.util.List r3 = (java.util.List) r3
            X.0Bk r8 = r0.A00
            r8.A04()     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            monitor-enter(r7)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            java.util.List r2 = r7.A0L     // Catch:{ all -> 0x0283 }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x0283 }
            if (r0 == 0) goto L_0x002c
            X.16D r0 = r7.A0F     // Catch:{ all -> 0x0283 }
            r0.A0o(r2)     // Catch:{ all -> 0x0283 }
        L_0x002c:
            monitor-exit(r7)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            r8.A04()     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            java.util.HashMap r4 = X.AnonymousClass001.A0J()     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            r5 = 0
            if (r3 == 0) goto L_0x003e
            int r0 = r3.size()     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            r12 = 1
            if (r0 > 0) goto L_0x003f
        L_0x003e:
            r12 = 0
        L_0x003f:
            if (r12 == 0) goto L_0x0086
            X.171 r1 = r7.A0G     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            X.34E r0 = new X.34E     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            r0.<init>(r1, r3)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            java.util.List r11 = X.C36371kC.A11(r0)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            java.util.Iterator r10 = r2.iterator()     // Catch:{ 02S | IllegalStateException -> 0x0286 }
        L_0x0050:
            boolean r0 = r10.hasNext()     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            if (r0 == 0) goto L_0x00b3
            X.141 r9 = X.C36391kE.A0f(r10)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            r8.A04()     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            boolean r0 = r11.isEmpty()     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            if (r0 != 0) goto L_0x007f
            java.util.Iterator r2 = r11.iterator()     // Catch:{ 02S | IllegalStateException -> 0x0286 }
        L_0x0067:
            boolean r0 = r2.hasNext()     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            if (r0 == 0) goto L_0x007f
            java.lang.Object r0 = r2.next()     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            X.34E r0 = (X.AnonymousClass34E) r0     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            X.171 r1 = r0.A00     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            java.util.List r0 = r0.A01     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            boolean r0 = r1.A0h(r9, r0, r6)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            if (r0 != 0) goto L_0x0067
            r0 = 0
            goto L_0x0080
        L_0x007f:
            r0 = 1
        L_0x0080:
            if (r0 == 0) goto L_0x0050
            com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel.A01(r9, r4)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            goto L_0x0050
        L_0x0086:
            java.util.Iterator r2 = r2.iterator()     // Catch:{ 02S | IllegalStateException -> 0x0286 }
        L_0x008a:
            boolean r0 = r2.hasNext()     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            if (r0 == 0) goto L_0x00b3
            X.141 r1 = X.C36391kE.A0f(r2)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            r8.A04()     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel.A01(r1, r4)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            boolean r0 = r7.A01     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            if (r0 != 0) goto L_0x008a
            java.lang.String r0 = r1.A0J()     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            java.lang.Object r0 = r4.get(r0)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            if (r0 == 0) goto L_0x008a
            int r0 = r0.size()     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            if (r0 <= r6) goto L_0x008a
            r7.A01 = r6     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            goto L_0x008a
        L_0x00b3:
            java.util.LinkedList r2 = new java.util.LinkedList     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            r2.<init>()     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            java.util.Iterator r8 = X.C36371kC.A10(r4)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
        L_0x00bc:
            boolean r0 = r8.hasNext()     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            if (r0 == 0) goto L_0x00db
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r8)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            java.lang.Object r4 = r0.getKey()     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            X.3ep r0 = new X.3ep     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            r0.<init>(r1, r4)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            r2.add(r0)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            goto L_0x00bc
        L_0x00db:
            X.0ts r1 = r7.A0H     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            X.3wx r0 = new X.3wx     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            r0.<init>(r1)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            java.util.Collections.sort(r2, r0)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            if (r12 == 0) goto L_0x0242
            X.0yC r1 = r7.A0I     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            r0 = 7134(0x1bde, float:9.997E-42)
            boolean r0 = r1.A0E(r0)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            if (r0 == 0) goto L_0x0242
            java.lang.String r1 = ""
            r19 = 0
            r0 = r19
            java.lang.String r40 = X.C007103b.A0Q(r1, r1, r1, r3, r0)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            android.app.Application r0 = r7.A00     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            r45 = r0
            android.content.res.Resources r1 = r45.getResources()     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            r0 = 2131102148(0x7f0609c4, float:1.7816726E38)
            int r18 = r1.getColor(r0)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            java.util.Iterator r17 = r2.iterator()     // Catch:{ 02S | IllegalStateException -> 0x0286 }
        L_0x0112:
            boolean r1 = r17.hasNext()     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            if (r1 == 0) goto L_0x0225
            java.lang.Object r4 = r17.next()     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            X.3ep r4 = (X.C70243ep) r4     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            java.lang.CharSequence r11 = r4.A00     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            java.lang.String r2 = r11.toString()     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            r1 = 16
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            r10.<init>(r1)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            java.util.ArrayList r15 = X.AnonymousClass001.A0I()     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            java.util.ArrayList r16 = X.AnonymousClass001.A0I()     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            r10.append(r2)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            r3 = 0
        L_0x013b:
            int r1 = r11.length()     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            if (r3 >= r1) goto L_0x019b
            int r8 = r40.length()     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            r42 = 0
            r44 = 1
            r39 = r11
            r41 = r3
            r43 = r8
            boolean r1 = X.AnonymousClass099.A0N(r39, r40, r41, r42, r43, r44)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            if (r1 == 0) goto L_0x018d
            r1 = r18
            long r1 = (long) r1     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            r12 = 32
            long r1 = r1 << r12
            long r12 = X.C133336Xx.A05     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            long r34 = X.AnonymousClass6WI.A01     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            long r38 = X.C133336Xx.A05     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            X.7mU r31 = X.AnonymousClass6RG.A00(r1)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            X.6FJ r1 = new X.6FJ     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            r23 = r19
            r24 = r19
            r25 = r19
            r26 = r19
            r27 = r19
            r28 = r19
            r29 = r19
            r30 = r19
            r32 = r19
            r33 = r19
            r21 = r1
            r22 = r19
            r36 = r34
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r36, r38)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            int r8 = r8 + r3
            X.6EX r2 = new X.6EX     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            r2.<init>(r1, r3, r8)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            r9.add(r2)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
        L_0x018d:
            int r2 = r3 + 1
            r1 = 32
            int r2 = X.AnonymousClass099.A09(r11, r1, r2, r5)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            r1 = -1
            if (r2 == r1) goto L_0x019b
            int r3 = r2 + 1
            goto L_0x013b
        L_0x019b:
            java.lang.String r13 = r10.toString()     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            java.util.ArrayList r12 = X.C36401kF.A0v(r9)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            int r3 = r9.size()     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            r11 = 0
            r2 = 0
        L_0x01a9:
            if (r2 >= r3) goto L_0x01bf
            java.lang.Object r8 = r9.get(r2)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            X.6EX r8 = (X.AnonymousClass6EX) r8     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            int r1 = r10.length()     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            X.6Bu r1 = r8.A00(r1)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            r12.add(r1)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            int r2 = r2 + 1
            goto L_0x01a9
        L_0x01bf:
            boolean r1 = r12.isEmpty()     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            r14 = 0
            if (r1 == 0) goto L_0x01c7
            r12 = r14
        L_0x01c7:
            java.util.ArrayList r9 = X.C36401kF.A0v(r15)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            int r8 = r15.size()     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            r3 = 0
        L_0x01d0:
            if (r3 >= r8) goto L_0x01e6
            java.lang.Object r2 = r15.get(r3)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            X.6EX r2 = (X.AnonymousClass6EX) r2     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            int r1 = r10.length()     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            X.6Bu r1 = r2.A00(r1)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            r9.add(r1)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            int r3 = r3 + 1
            goto L_0x01d0
        L_0x01e6:
            boolean r1 = r9.isEmpty()     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            if (r1 == 0) goto L_0x01ed
            r9 = r14
        L_0x01ed:
            java.util.ArrayList r2 = X.C36401kF.A0v(r16)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            int r3 = r16.size()     // Catch:{ 02S | IllegalStateException -> 0x0286 }
        L_0x01f5:
            if (r11 >= r3) goto L_0x020d
            r1 = r16
            java.lang.Object r8 = r1.get(r11)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            X.6EX r8 = (X.AnonymousClass6EX) r8     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            int r1 = r10.length()     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            X.6Bu r1 = r8.A00(r1)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            r2.add(r1)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            int r11 = r11 + 1
            goto L_0x01f5
        L_0x020d:
            boolean r1 = r2.isEmpty()     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            if (r1 != 0) goto L_0x0214
            r14 = r2
        L_0x0214:
            X.72L r3 = new X.72L     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            r3.<init>(r13, r12, r9, r14)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            java.util.List r2 = r4.A01     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            X.3ep r1 = new X.3ep     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            r1.<init>(r2, r3)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            r0.add(r1)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            goto L_0x0112
        L_0x0225:
            boolean r1 = r0.isEmpty()     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            if (r1 == 0) goto L_0x0563
            r3 = 2131893866(0x7f121e6a, float:1.942252E38)
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            java.lang.String r1 = r7.A00     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            r0 = r45
            java.lang.String r1 = X.C36351kA.A0x(r0, r1, r2, r5, r3)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            X.3el r0 = new X.3el     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            r0.<init>(r1)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            java.util.List r0 = X.C36371kC.A11(r0)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            return r0
        L_0x0242:
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            r0.<init>(r2)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            boolean r1 = X.C36411kG.A1a(r0)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            if (r1 == 0) goto L_0x025f
            android.app.Application r2 = r7.A00     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            r1 = 2131896634(0x7f12293a, float:1.9428135E38)
            java.lang.String r2 = X.C36361kB.A0m(r2, r1)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            X.3em r1 = new X.3em     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            r1.<init>(r2)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            r0.add(r5, r1)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            return r0
        L_0x025f:
            if (r12 == 0) goto L_0x0563
            java.lang.String r4 = r7.A00     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            if (r4 == 0) goto L_0x026c
            int r2 = r4.length()     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            r1 = 0
            if (r2 != 0) goto L_0x026d
        L_0x026c:
            r1 = 1
        L_0x026d:
            if (r1 != 0) goto L_0x0563
            android.app.Application r3 = r7.A00     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            r2 = 2131893866(0x7f121e6a, float:1.942252E38)
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            java.lang.String r2 = X.C36351kA.A0x(r3, r4, r1, r5, r2)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            X.3el r1 = new X.3el     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            r1.<init>(r2)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            r0.add(r1)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            return r0
        L_0x0283:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ 02S | IllegalStateException -> 0x0286 }
            throw r0     // Catch:{ 02S | IllegalStateException -> 0x0286 }
        L_0x0286:
            r1 = move-exception
            r0 = r20
            com.whatsapp.util.Log.e(r0, r1)
            X.09w r0 = X.C023409w.A00
            return r0
        L_0x028f:
            java.lang.Object r7 = r2.A00
            X.1SB r7 = (X.AnonymousClass1SB) r7
            X.35p r0 = (X.C598735p) r0
            long r11 = android.os.SystemClock.uptimeMillis()
            X.00s r6 = r7.A07
            r8 = 1
            X.C36341k9.A19(r6, r8)
            java.lang.Object r2 = r0.A01
            X.1S3 r2 = (X.AnonymousClass1S3) r2
            X.0Bk r10 = r0.A00
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
            r5 = 0
            r10.A04()     // Catch:{ 02S -> 0x0346, all -> 0x034a }
            int r1 = r2.A02     // Catch:{ 02S -> 0x0346, all -> 0x034a }
            if (r1 != 0) goto L_0x033d
            X.11F r1 = r2.A04     // Catch:{ 02S -> 0x0346, all -> 0x034a }
            if (r1 != 0) goto L_0x033d
            X.6bb r1 = r2.A06     // Catch:{ 02S -> 0x0346, all -> 0x034a }
            if (r1 != 0) goto L_0x033d
            boolean r1 = X.C36391kE.A1a(r2)     // Catch:{ 02S -> 0x0346, all -> 0x034a }
            if (r1 == 0) goto L_0x033d
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()     // Catch:{ 02S -> 0x0346, all -> 0x034a }
            boolean r1 = X.C36391kE.A1a(r2)     // Catch:{ 02S -> 0x0346, all -> 0x034a }
            if (r1 == 0) goto L_0x02dc
            java.util.List r4 = r2.A03()     // Catch:{ 02S -> 0x0346, all -> 0x034a }
            X.AnonymousClass00C.A08(r4)     // Catch:{ 02S -> 0x0346, all -> 0x034a }
            X.171 r3 = r7.A08     // Catch:{ 02S -> 0x0346, all -> 0x034a }
            X.1SA r2 = r7.A09     // Catch:{ 02S -> 0x0346, all -> 0x034a }
            X.3g1 r1 = new X.3g1     // Catch:{ 02S -> 0x0346, all -> 0x034a }
            r1.<init>(r3, r2, r4)     // Catch:{ 02S -> 0x0346, all -> 0x034a }
            r9.add(r1)     // Catch:{ 02S -> 0x0346, all -> 0x034a }
        L_0x02dc:
            r10.A04()     // Catch:{ 02S -> 0x0346, all -> 0x034a }
            X.1SA r2 = r7.A09     // Catch:{ 02S -> 0x0346, all -> 0x034a }
            java.util.List r1 = r2.A00     // Catch:{ 02S -> 0x0346, all -> 0x034a }
            boolean r1 = X.AnonymousClass000.A1W(r1)
            if (r1 == 0) goto L_0x02ea
            r8 = 0
        L_0x02ea:
            java.util.List r1 = r2.A00()     // Catch:{ 02S -> 0x0346, all -> 0x034a }
            java.util.Iterator r4 = r1.iterator()     // Catch:{ 02S -> 0x0346, all -> 0x034a }
        L_0x02f2:
            boolean r1 = r4.hasNext()     // Catch:{ 02S -> 0x0346, all -> 0x034a }
            if (r1 == 0) goto L_0x031b
            X.141 r3 = X.C36391kE.A0f(r4)     // Catch:{ 02S -> 0x0346, all -> 0x034a }
            r10.A04()     // Catch:{ 02S -> 0x0346, all -> 0x034a }
            X.3IL r1 = r3.A0F     // Catch:{ 02S -> 0x0346, all -> 0x034a }
            if (r1 == 0) goto L_0x02f2
            java.lang.Class<X.11F> r2 = X.AnonymousClass11F.class
            X.11F r1 = X.C36441kJ.A0k(r3, r2)     // Catch:{ 02S -> 0x0346, all -> 0x034a }
            if (r1 == 0) goto L_0x02f2
            com.whatsapp.jid.Jid r1 = X.C36381kD.A0e(r3, r2)     // Catch:{ 02S -> 0x0346, all -> 0x034a }
            X.11F r1 = (X.AnonymousClass11F) r1     // Catch:{ 02S -> 0x0346, all -> 0x034a }
            boolean r1 = X.AnonymousClass1A5.A00(r1, r9)     // Catch:{ 02S -> 0x0346, all -> 0x034a }
            if (r1 == 0) goto L_0x02f2
            r0.add(r3)     // Catch:{ 02S -> 0x0346, all -> 0x034a }
            goto L_0x02f2
        L_0x031b:
            long r3 = android.os.SystemClock.uptimeMillis()     // Catch:{ 02S -> 0x0346, all -> 0x034a }
            long r3 = r3 - r11
            X.2R3 r2 = new X.2R3     // Catch:{ 02S -> 0x0346, all -> 0x034a }
            r2.<init>()     // Catch:{ 02S -> 0x0346, all -> 0x034a }
            java.lang.Integer r1 = X.C36371kC.A0p()     // Catch:{ 02S -> 0x0346, all -> 0x034a }
            r2.A02 = r1     // Catch:{ 02S -> 0x0346, all -> 0x034a }
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch:{ 02S -> 0x0346, all -> 0x034a }
            r2.A04 = r1     // Catch:{ 02S -> 0x0346, all -> 0x034a }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)     // Catch:{ 02S -> 0x0346, all -> 0x034a }
            r2.A00 = r1     // Catch:{ 02S -> 0x0346, all -> 0x034a }
            X.0yW r1 = r7.A0A     // Catch:{ 02S -> 0x0346, all -> 0x034a }
            r1.Bly(r2)     // Catch:{ 02S -> 0x0346, all -> 0x034a }
            goto L_0x0346
        L_0x033d:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)     // Catch:{ 02S -> 0x0346, all -> 0x034a }
            r6.A0C(r1)     // Catch:{ 02S -> 0x0346, all -> 0x034a }
            goto L_0x0560
        L_0x0346:
            X.C36341k9.A19(r6, r5)
            return r0
        L_0x034a:
            r0 = move-exception
            X.C36341k9.A19(r6, r5)
            throw r0
        L_0x034f:
            java.lang.Object r2 = r2.A00
            com.whatsapp.newsletter.viewmodel.NewsletterViewModel r2 = (com.whatsapp.newsletter.viewmodel.NewsletterViewModel) r2
            java.util.Map r0 = (java.util.Map) r0
            X.1Uw r1 = r2.A05
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L_0x0563
            X.3hE r1 = r2.A03
            X.1Uw r0 = r2.A05
            X.3IZ r0 = r1.A01(r0)
            java.lang.String r1 = "null cannot be cast to non-null type com.whatsapp.newsletter.cache.NewsletterState"
            X.AnonymousClass00C.A0E(r0, r1)
            return r0
        L_0x036b:
            java.lang.Object r7 = r2.A00
            X.1uz r7 = (X.C40131uz) r7
            X.38a r0 = (X.C604838a) r0
            r3 = 0
            X.AnonymousClass00C.A0D(r7, r3)
            X.2p3 r6 = r0.A01
            int r1 = r6.ordinal()
            r2 = 0
            if (r1 != r3) goto L_0x03ae
            r7.A00 = r2
            java.util.List r1 = r0.A03
            java.util.ArrayList r5 = X.C36321k7.A0J(r1)
            java.util.Iterator r4 = r1.iterator()
        L_0x038a:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x03b9
            java.lang.Object r3 = r4.next()
            X.2La r3 = (X.C44072La) r3
            X.16D r2 = r7.A06
            X.3Qp r1 = r3.A0R
            X.11F r1 = r1.A06()
            X.141 r2 = r2.A0D(r1)
            r3.A0J()
            X.2Yg r1 = new X.2Yg
            r1.<init>(r3, r2)
            r5.add(r1)
            goto L_0x038a
        L_0x03ae:
            X.Aue r1 = r7.A00
            if (r1 == 0) goto L_0x03b5
            r1.cancel()
        L_0x03b5:
            r7.A00 = r2
            X.09w r5 = X.C023409w.A00
        L_0x03b9:
            java.lang.String r2 = r0.A02
            X.Abe r1 = r0.A00
            X.38b r0 = new X.38b
            r0.<init>(r1, r6, r2, r5)
            return r0
        L_0x03c3:
            java.lang.Object r1 = r2.A00
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r0 = r0.get(r1)
            return r0
        L_0x03cc:
            java.lang.Object r6 = r2.A00
            com.whatsapp.interopui.compose.InteropComposeSelectIntegratorViewModel r6 = (com.whatsapp.interopui.compose.InteropComposeSelectIntegratorViewModel) r6
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            java.util.List r0 = r6.A00
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.util.Iterator r4 = r0.iterator()
        L_0x03de:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0402
            java.lang.Object r3 = r4.next()
            r0 = r3
            X.3Xd r0 = (X.C66743Xd) r0
            java.lang.String r2 = r0.A03
            X.00s r0 = r6.A02
            java.lang.Object r0 = r0.A04()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 1
            boolean r0 = X.AnonymousClass099.A0O(r2, r1, r0)
            if (r0 == 0) goto L_0x03de
            r5.add(r3)
            goto L_0x03de
        L_0x0402:
            X.00s r0 = X.C36441kJ.A0Z(r5)
            return r0
        L_0x0407:
            java.lang.Object r1 = r2.A00
            X.2hz r1 = (X.C48752hz) r1
            X.34n r0 = (X.C595934n) r0
            java.lang.Object r3 = r1.A00
            com.whatsapp.group.GroupChatInfoActivity r3 = (com.whatsapp.group.GroupChatInfoActivity) r3
            r3.Bnv()
            X.147 r1 = r3.A1Y
            java.util.Set r6 = java.util.Collections.singleton(r1)
            int r2 = r0.A00
            X.147 r1 = r0.A01
            r8 = 0
            if (r1 == 0) goto L_0x0422
            r8 = 2
        L_0x0422:
            r10 = 1
            r9 = 0
            r0 = 0
            r4 = r1
            r5 = r0
            r7 = r2
            com.whatsapp.group.ExitGroupsDialogFragment r1 = com.whatsapp.group.ExitGroupsDialogFragment.A03(r4, r5, r6, r7, r8, r9, r10)
            r3.Btl(r1, r0)
            return r0
        L_0x0430:
            java.lang.Object r1 = r2.A00
            X.1sS r1 = (X.C39471sS) r1
            X.6tS r0 = (X.C145166tS) r0
            if (r0 == 0) goto L_0x0466
            java.lang.String r2 = r0.A0Z
            if (r2 == 0) goto L_0x0466
            java.lang.String r1 = r1.A06
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0466
            return r0
        L_0x0445:
            java.lang.Object r2 = r2.A00
            X.1uA r2 = (X.C39891uA) r2
            X.34n r0 = (X.C595934n) r0
            r1 = 1
            X.AnonymousClass00C.A0D(r0, r1)
            X.12q r1 = r2.A03
            X.147 r4 = r2.A05
            boolean r3 = r1.A0O(r4)
            X.00r r2 = r2.A01
            java.lang.String r1 = "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<com.whatsapp.conversation.conversationrow.components.contextcard.ExitGroupButtonViewModel.ExitGroupFlowUiState>"
            X.AnonymousClass00C.A0E(r2, r1)
            X.3J0 r1 = new X.3J0
            r1.<init>(r0, r4, r3)
            r2.A0C(r1)
        L_0x0466:
            r0 = 0
            return r0
        L_0x0468:
            java.lang.Object r2 = r2.A00
            X.1ts r2 = (X.C39821ts) r2
            X.3Qe r0 = (X.C64973Qe) r0
            r1 = 0
            X.AnonymousClass00C.A0D(r2, r1)
            boolean r6 = r0.A07
            int r5 = r0.A00
            int r4 = r0.A01
            X.3KZ r0 = r2.A01
            boolean r3 = r0.A05
            boolean r2 = r0.A08
            boolean r1 = r0.A0C
            X.3K4 r0 = new X.3K4
            r7 = r0
            r8 = r5
            r9 = r4
            r10 = r6
            r11 = r3
            r12 = r2
            r13 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13)
            return r0
        L_0x048d:
            java.lang.Object r1 = r2.A00
            X.2H1 r1 = (X.AnonymousClass2H1) r1
            X.34n r0 = (X.C595934n) r0
            X.14r r3 = r1.A06
            r3.Bnv()
            X.147 r1 = r1.A0L
            java.util.Set r6 = java.util.Collections.singleton(r1)
            int r2 = r0.A00
            X.147 r1 = r0.A01
            r8 = 0
            if (r1 == 0) goto L_0x04a6
            r8 = 2
        L_0x04a6:
            r10 = 1
            r9 = 0
            r0 = 0
            r4 = r1
            r5 = r0
            r7 = r2
            com.whatsapp.group.ExitGroupsDialogFragment r1 = com.whatsapp.group.ExitGroupsDialogFragment.A03(r4, r5, r6, r7, r8, r9, r10)
            r3.Btl(r1, r0)
            return r0
        L_0x04b4:
            java.lang.Object r5 = r2.A00
            X.1sL r5 = (X.C39451sL) r5
            X.35p r0 = (X.C598735p) r0
            java.lang.Object r8 = r0.A01
            java.util.Collection r8 = (java.util.Collection) r8
            X.0Bk r4 = r0.A00
            r4.A04()     // Catch:{ 02S -> 0x0564 }
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()     // Catch:{ 02S -> 0x0564 }
            X.0wG r7 = r5.A07     // Catch:{ 02S -> 0x0564 }
            X.16D r6 = r5.A05     // Catch:{ 02S -> 0x0564 }
            X.0yb r2 = r5.A06     // Catch:{ 02S -> 0x0564 }
            X.0ts r3 = r5.A08     // Catch:{ 02S -> 0x0564 }
            X.3Ql r1 = new X.3Ql     // Catch:{ 02S -> 0x0564 }
            r1.<init>(r6, r2, r7, r3)     // Catch:{ 02S -> 0x0564 }
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()     // Catch:{ 02S -> 0x0564 }
            X.16D r2 = r1.A00     // Catch:{ 02S -> 0x0564 }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ 02S -> 0x0564 }
            r1.<init>(r8)     // Catch:{ 02S -> 0x0564 }
            java.util.HashMap r1 = r2.A0K(r1)     // Catch:{ 02S -> 0x0564 }
            java.util.Iterator r7 = X.C36371kC.A10(r1)     // Catch:{ 02S -> 0x0564 }
        L_0x04e7:
            boolean r1 = r7.hasNext()     // Catch:{ 02S -> 0x0564 }
            if (r1 == 0) goto L_0x052f
            java.util.Map$Entry r2 = X.AnonymousClass000.A11(r7)     // Catch:{ 02S -> 0x0564 }
            java.lang.Object r1 = r2.getKey()     // Catch:{ 02S -> 0x0564 }
            boolean r1 = r1 instanceof com.whatsapp.jid.UserJid     // Catch:{ 02S -> 0x0564 }
            if (r1 != 0) goto L_0x04ff
            java.lang.String r1 = "ContactStruct/constructContactsFromUserJid chat JID not an instance of user JID"
        L_0x04fb:
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ 02S -> 0x0564 }
            goto L_0x04e7
        L_0x04ff:
            java.lang.Object r1 = r2.getValue()     // Catch:{ 02S -> 0x0564 }
            if (r1 != 0) goto L_0x0508
            java.lang.String r1 = "ContactStruct/constructContactsFromUserJid null WaContact"
            goto L_0x04fb
        L_0x0508:
            java.lang.Object r9 = r2.getKey()     // Catch:{ 02S -> 0x0564 }
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9     // Catch:{ 02S -> 0x0564 }
            java.lang.Object r1 = r2.getValue()     // Catch:{ 02S -> 0x0564 }
            X.141 r1 = (X.AnonymousClass141) r1     // Catch:{ 02S -> 0x0564 }
            X.3Sx r8 = new X.3Sx     // Catch:{ 02S -> 0x0564 }
            r8.<init>()     // Catch:{ 02S -> 0x0564 }
            X.3F9 r2 = r8.A0A     // Catch:{ 02S -> 0x0564 }
            java.lang.String r1 = r1.A0J()     // Catch:{ 02S -> 0x0564 }
            r2.A01 = r1     // Catch:{ 02S -> 0x0564 }
            r12 = 2
            java.lang.String r10 = X.AnonymousClass3U8.A04(r9)     // Catch:{ 02S -> 0x0564 }
            r11 = 0
            r13 = 1
            r8.A04(r9, r10, r11, r12, r13)     // Catch:{ 02S -> 0x0564 }
            r6.add(r8)     // Catch:{ 02S -> 0x0564 }
            goto L_0x04e7
        L_0x052f:
            java.util.Iterator r7 = r6.iterator()     // Catch:{ 02S -> 0x0564 }
        L_0x0533:
            boolean r1 = r7.hasNext()     // Catch:{ 02S -> 0x0564 }
            if (r1 == 0) goto L_0x0563
            java.lang.Object r6 = r7.next()     // Catch:{ 02S -> 0x0564 }
            X.3Sx r6 = (X.C65643Sx) r6     // Catch:{ 02S -> 0x0564 }
            r4.A04()     // Catch:{ 02S -> 0x0564 }
            X.1N4 r2 = r5.A04     // Catch:{ 02S -> 0x0564 }
            X.3Ow r1 = new X.3Ow     // Catch:{ 02S -> 0x0564 }
            r1.<init>(r2, r3)     // Catch:{ 02S -> 0x0564 }
            java.lang.String r1 = r1.A01(r6)     // Catch:{ 1YJ -> 0x054e }
            goto L_0x055a
        L_0x054e:
            r1 = move-exception
            X.5Un r2 = new X.5Un     // Catch:{ 02S -> 0x0564 }
            r2.<init>(r1)     // Catch:{ 02S -> 0x0564 }
            java.lang.String r1 = "ContactsAttachmentSelectorViewModel/ Could not create VCard"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ 02S -> 0x0564 }
            r1 = 0
        L_0x055a:
            if (r1 == 0) goto L_0x0533
            r0.add(r1)     // Catch:{ 02S -> 0x0564 }
            goto L_0x0533
        L_0x0560:
            r6.A0C(r1)
        L_0x0563:
            return r0
        L_0x0564:
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4ZI.apply(java.lang.Object):java.lang.Object");
    }
}
