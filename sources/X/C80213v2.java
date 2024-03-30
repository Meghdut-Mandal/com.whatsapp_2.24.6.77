package X;

/* renamed from: X.3v2  reason: invalid class name and case insensitive filesystem */
public class C80213v2 implements Runnable {
    public Object A00;
    public final int A01;

    public C80213v2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static C80213v2 A00(Object obj, int i) {
        return new C80213v2(obj, i);
    }

    public static void A01(C19770wU r1, Object obj, int i) {
        r1.Boy(new C80213v2(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02d0, code lost:
        if (X.C36401kF.A1Y(r4.A0D) == false) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0367, code lost:
        r3.Bfh(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x036a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0068, code lost:
        if (r4.A01.length < 3) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x043f, code lost:
        if (r9.length() != 0) goto L_0x0452;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x044f, code lost:
        if (r12 == false) goto L_0x0439;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0452, code lost:
        r1.withValue("data3", r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0548, code lost:
        if (r2.length() != 0) goto L_0x056d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x056b, code lost:
        if (r2 != null) goto L_0x056d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0571, code lost:
        if (r2.length() != 0) goto L_0x0575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0573, code lost:
        r2 = "us";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0575, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:?, code lost:
        r1 = r3.A07.A05(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0652, code lost:
        r5.A0d(r0);
        r5.A0r(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0659, code lost:
        r5.A0b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x065c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x06c9, code lost:
        r2 = X.C25951Ih.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x06cd, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:?, code lost:
        com.whatsapp.util.Log.i("companion/registration/start");
        r2.A0P.A01(2);
        X.C20260xH.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x06dc, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x06dd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x074d, code lost:
        r0 = r0.mutationName;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x074f, code lost:
        X.AnonymousClass1AK.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0752, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x07ad, code lost:
        r5.A02.A0H();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x07b2, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            int r0 = r14.A01
            switch(r0) {
                case 0: goto L_0x07ce;
                case 1: goto L_0x07c4;
                case 2: goto L_0x07b3;
                case 3: goto L_0x0781;
                case 4: goto L_0x075b;
                case 5: goto L_0x0753;
                case 6: goto L_0x01a1;
                case 7: goto L_0x018a;
                case 8: goto L_0x0740;
                case 9: goto L_0x0730;
                case 10: goto L_0x0722;
                case 11: goto L_0x017b;
                case 12: goto L_0x0163;
                case 13: goto L_0x071a;
                case 14: goto L_0x06ed;
                case 15: goto L_0x06e1;
                case 16: goto L_0x06bf;
                case 17: goto L_0x06b8;
                case 18: goto L_0x06a1;
                case 19: goto L_0x065d;
                case 20: goto L_0x063a;
                case 21: goto L_0x05e4;
                case 22: goto L_0x05c5;
                case 23: goto L_0x05bd;
                case 24: goto L_0x0117;
                case 25: goto L_0x058b;
                case 26: goto L_0x052f;
                case 27: goto L_0x050f;
                case 28: goto L_0x0084;
                case 29: goto L_0x0035;
                case 30: goto L_0x04b9;
                case 31: goto L_0x036b;
                case 32: goto L_0x0357;
                case 33: goto L_0x02e3;
                case 34: goto L_0x0299;
                case 35: goto L_0x0291;
                case 36: goto L_0x026f;
                case 37: goto L_0x025c;
                case 38: goto L_0x0005;
                case 39: goto L_0x0005;
                case 40: goto L_0x0005;
                case 41: goto L_0x0220;
                case 42: goto L_0x0218;
                case 43: goto L_0x0210;
                case 44: goto L_0x0204;
                case 45: goto L_0x01e2;
                case 46: goto L_0x01d6;
                case 47: goto L_0x01c3;
                case 48: goto L_0x01bb;
                case 49: goto L_0x001d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r14.A00
            X.3P7 r0 = (X.AnonymousClass3P7) r0
            X.4Tt r1 = r0.A06
            X.3Gn r2 = r0.A03
            X.2Fm r4 = r0.A05
            X.312 r5 = r0.A07
            X.3QT r3 = r0.A04
            r6 = 1
            r7 = 1
            android.content.Intent r0 = X.AnonymousClass3T6.A00(r2, r3, r4, r5, r6, r7)
            r1.Bfh(r0)
        L_0x001c:
            return
        L_0x001d:
            java.lang.Object r2 = r14.A00
            X.6W1 r2 = (X.AnonymousClass6W1) r2
            java.lang.String r0 = "onContactPickerCreated"
            X.2RF r1 = X.AnonymousClass6W1.A00(r2, r0)
            if (r1 == 0) goto L_0x001c
            java.lang.Integer r0 = X.C36371kC.A0n()
            r1.A01 = r0
            X.0yW r0 = r2.A02
            r0.Bly(r1)
            return
        L_0x0035:
            java.lang.Object r4 = r14.A00
            X.3B5 r4 = (X.AnonymousClass3B5) r4
            java.lang.ref.WeakReference r0 = r4.A0B
            java.lang.Object r0 = r0.get()
            X.4Pf r0 = (X.C87544Pf) r0
            if (r0 == 0) goto L_0x001c
            boolean r0 = r0.BLL()
            if (r0 != 0) goto L_0x001c
            android.widget.EditText r2 = r4.A03
            android.accounts.Account[] r0 = r4.A01
            r1 = 0
            r0 = r0[r1]
            java.lang.String r0 = r0.name
            r2.setText(r0)
            android.accounts.Account[] r0 = r4.A01
            r0 = r0[r1]
            r4.A00 = r0
            X.0yC r0 = r4.A09
            boolean r0 = X.C36401kF.A1Y(r0)
            if (r0 != 0) goto L_0x006a
            android.accounts.Account[] r0 = r4.A01
            int r1 = r0.length
            r0 = 3
            r3 = 1
            if (r1 >= r0) goto L_0x006b
        L_0x006a:
            r3 = 0
        L_0x006b:
            com.google.android.material.textfield.TextInputLayout r2 = r4.A05
            r1 = 22
            X.75B r0 = new X.75B
            r0.<init>((int) r1, (java.lang.Object) r4, (boolean) r3)
            r2.post(r0)
            android.widget.ImageView r2 = r4.A04
            r1 = 23
            X.75B r0 = new X.75B
            r0.<init>((int) r1, (java.lang.Object) r4, (boolean) r3)
            r2.post(r0)
            return
        L_0x0084:
            java.lang.Object r0 = r14.A00
            com.whatsapp.contact.contactform.ContactFormActivity r0 = (com.whatsapp.contact.contactform.ContactFormActivity) r0
            X.3Ar r6 = r0.A09     // Catch:{ Exception -> 0x001c }
            X.16D r8 = r6.A02     // Catch:{ Exception -> 0x001c }
            X.11F r10 = r6.A06     // Catch:{ Exception -> 0x001c }
            X.141 r9 = r8.A08(r10)     // Catch:{ Exception -> 0x001c }
            X.2Fm r0 = r6.A04     // Catch:{ Exception -> 0x001c }
            java.lang.String r12 = r0.A03()     // Catch:{ Exception -> 0x001c }
            java.lang.String r13 = r0.A01()     // Catch:{ Exception -> 0x001c }
            if (r9 == 0) goto L_0x010c
            int r0 = r12.length()     // Catch:{ Exception -> 0x001c }
            r5 = 1
            r4 = 0
            if (r0 <= 0) goto L_0x010c
            boolean r3 = r6.A08     // Catch:{ Exception -> 0x001c }
            if (r3 == 0) goto L_0x00cc
            java.lang.Long r11 = r6.A07     // Catch:{ Exception -> 0x001c }
            if (r11 == 0) goto L_0x00cc
            r8.A0V(r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x001c }
        L_0x00b1:
            android.content.Intent r2 = X.C36431kI.A0D()     // Catch:{ Exception -> 0x001c }
            java.lang.String r0 = "deleted_synced_contact"
            if (r3 == 0) goto L_0x00c8
            r2.putExtra(r0, r5)     // Catch:{ Exception -> 0x001c }
        L_0x00bc:
            X.17Y r1 = r6.A00     // Catch:{ Exception -> 0x001c }
            X.3v8 r0 = new X.3v8     // Catch:{ Exception -> 0x001c }
            r0.<init>(r6, r2, r4)     // Catch:{ Exception -> 0x001c }
            r1.A0H(r0)     // Catch:{ Exception -> 0x001c }
            goto L_0x07e8
        L_0x00c8:
            r2.putExtra(r0, r4)     // Catch:{ Exception -> 0x001c }
            goto L_0x00bc
        L_0x00cc:
            X.16p r0 = r8.A05     // Catch:{ Exception -> 0x001c }
            java.util.ArrayList r0 = r0.A0Q(r10)     // Catch:{ Exception -> 0x001c }
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()     // Catch:{ Exception -> 0x001c }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ Exception -> 0x001c }
        L_0x00da:
            boolean r0 = r2.hasNext()     // Catch:{ Exception -> 0x001c }
            if (r0 == 0) goto L_0x00f1
            java.lang.Object r1 = r2.next()     // Catch:{ Exception -> 0x001c }
            r0 = r1
            X.141 r0 = (X.AnonymousClass141) r0     // Catch:{ Exception -> 0x001c }
            boolean r0 = r0.A0B()     // Catch:{ Exception -> 0x001c }
            if (r0 == 0) goto L_0x00da
            r7.add(r1)     // Catch:{ Exception -> 0x001c }
            goto L_0x00da
        L_0x00f1:
            int r0 = r7.size()     // Catch:{ Exception -> 0x001c }
            if (r0 <= r5) goto L_0x0103
            X.196 r2 = r6.A01     // Catch:{ Exception -> 0x001c }
            X.09w r1 = X.C023409w.A00     // Catch:{ Exception -> 0x001c }
            java.util.List r0 = X.C36371kC.A11(r9)     // Catch:{ Exception -> 0x001c }
            r2.A0N(r1, r0)     // Catch:{ Exception -> 0x001c }
            goto L_0x00b1
        L_0x0103:
            r8.A0P(r9)     // Catch:{ Exception -> 0x001c }
            X.0xY r0 = r6.A05     // Catch:{ Exception -> 0x001c }
            r0.A08()     // Catch:{ Exception -> 0x001c }
            goto L_0x00b1
        L_0x010c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x001c }
            java.lang.String r0 = "ContactManager/removeWAContact attempting to remove contact that is not in db with jid="
            X.C36321k7.A1J(r10, r0, r1)     // Catch:{ Exception -> 0x001c }
            goto L_0x07e9
        L_0x0117:
            java.lang.Object r3 = r14.A00
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r2 = 0
            r6 = 0
            r4 = 0
            r5 = 0
        L_0x011f:
            int r0 = r3.getChildCount()
            if (r6 >= r0) goto L_0x013b
            android.view.View r1 = r3.getChildAt(r6)
            int r0 = r1.getWidth()
            int r4 = r4 + r0
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass000.A0a(r1)
            int r1 = r0.leftMargin
            int r0 = r0.rightMargin
            int r1 = r1 + r0
            int r5 = r5 + r1
            int r6 = r6 + 1
            goto L_0x011f
        L_0x013b:
            if (r4 <= 0) goto L_0x001c
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass000.A0a(r3)
            int r1 = r0.leftMargin
            int r0 = r0.rightMargin
            int r1 = r1 + r0
            int r0 = r3.getPaddingLeft()
            int r1 = r1 + r0
            int r0 = r3.getPaddingRight()
            int r1 = r1 + r0
            int r0 = r3.getWidth()
            int r0 = r0 - r1
            int r0 = r0 - r5
            if (r4 < r0) goto L_0x0159
            r2 = 1
        L_0x0159:
            int r0 = r3.getOrientation()
            if (r0 == r2) goto L_0x001c
            r3.setOrientation(r2)
            return
        L_0x0163:
            java.lang.Object r0 = r14.A00
            X.0wB r0 = (X.C19580wB) r0
            java.util.Iterator r1 = X.C36361kB.A0s(r0)
        L_0x016b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x001c
            java.lang.Object r0 = r1.next()
            X.1co r0 = (X.C32011co) r0
            r0.BSf()
            goto L_0x016b
        L_0x017b:
            java.lang.Object r1 = r14.A00
            X.2FS r1 = (X.AnonymousClass2FS) r1
            X.0wQ r0 = r1.A02
            boolean r0 = r0.A0L()
            if (r0 == 0) goto L_0x001c
            monitor-enter(r1)
            goto L_0x07ea
        L_0x018a:
            java.lang.Object r1 = r14.A00
            X.2Mm r1 = (X.C44212Mm) r1
            java.lang.String r0 = "MDSyncAbpropsObserver/onAfterABPropsChanged enable note to self, sync meContact"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.196 r3 = r1.A04
            X.0wQ r4 = r3.A06
            boolean r0 = r4.A0L()
            if (r0 != 0) goto L_0x001c
            monitor-enter(r3)
            r0 = 0
            goto L_0x0805
        L_0x01a1:
            java.lang.Object r3 = r14.A00
            com.whatsapp.companiondevice.sync.HistorySyncWorker r3 = (com.whatsapp.companiondevice.sync.HistorySyncWorker) r3
            com.whatsapp.companiondevice.sync.HistorySyncWorker.A01(r3)     // Catch:{ all -> 0x0857 }
            X.75A r0 = r3.A00     // Catch:{ all -> 0x0857 }
            if (r0 == 0) goto L_0x01af
            r0.run()     // Catch:{ all -> 0x0857 }
        L_0x01af:
            X.1Hj r1 = r3.A01
            if (r1 == 0) goto L_0x001c
            X.1Hi r0 = r3.A05
            X.1Hk r0 = r0.A00
            r0.A02(r1)
            return
        L_0x01bb:
            java.lang.Object r1 = r14.A00
            X.6W1 r1 = (X.AnonymousClass6W1) r1
            r0 = 0
            r1.A00 = r0
            return
        L_0x01c3:
            java.lang.Object r1 = r14.A00
            X.01L r1 = (X.AnonymousClass01L) r1
            r0 = 2131433566(0x7f0b185e, float:1.8488921E38)
            android.view.View r1 = r1.findViewById(r0)
            android.widget.ScrollView r1 = (android.widget.ScrollView) r1
            r0 = 130(0x82, float:1.82E-43)
            r1.fullScroll(r0)
            return
        L_0x01d6:
            java.lang.Object r0 = r14.A00
            X.4W3 r0 = (X.AnonymousClass4W3) r0
            java.lang.Object r0 = r0.A00
            com.whatsapp.contact.picker.ContactPickerFragment r0 = (com.whatsapp.contact.picker.ContactPickerFragment) r0
            r0.A1g()
            return
        L_0x01e2:
            java.lang.Object r1 = r14.A00
            X.2iG r1 = (X.C48912iG) r1
            java.lang.Object r3 = r1.A00
            com.whatsapp.contact.picker.ContactPickerFragment r3 = (com.whatsapp.contact.picker.ContactPickerFragment) r3
            boolean r0 = r3.A2u
            if (r0 == 0) goto L_0x0200
            X.141 r0 = r3.A1Z
            if (r0 == 0) goto L_0x0200
            r0 = 24
            X.4XM r2 = new X.4XM
            r2.<init>(r1, r0)
            X.0wU r1 = r3.A2L
            r0 = 7
            X.C80273v8.A00(r1, r3, r2, r0)
            return
        L_0x0200:
            r1.A03()
            return
        L_0x0204:
            java.lang.Object r0 = r14.A00
            X.2iG r0 = (X.C48912iG) r0
            java.lang.Object r0 = r0.A00
            com.whatsapp.contact.picker.ContactPickerFragment r0 = (com.whatsapp.contact.picker.ContactPickerFragment) r0
            r0.A1j()
            return
        L_0x0210:
            java.lang.Object r0 = r14.A00
            java.util.Set r0 = (java.util.Set) r0
            r0.clear()
            return
        L_0x0218:
            java.lang.Object r0 = r14.A00
            X.6YL r0 = (X.AnonymousClass6YL) r0
            r0.A0P()
            return
        L_0x0220:
            java.lang.Object r3 = r14.A00
            com.whatsapp.contact.picker.AddGroupParticipantsSelector r3 = (com.whatsapp.contact.picker.AddGroupParticipantsSelector) r3
            X.2OV r2 = new X.2OV
            r2.<init>()
            X.00T r0 = r3.A0P
            int r0 = X.C36331k8.A02(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A00 = r0
            X.00T r0 = r3.A0Q
            com.whatsapp.jid.Jid r1 = X.C36441kJ.A0m(r0)
            if (r1 == 0) goto L_0x024d
            X.3Sl r0 = X.AnonymousClass147.A01
            java.lang.String r0 = r1.user
            boolean r0 = X.C65533Sl.A05(r0)
            if (r0 == 0) goto L_0x024d
            java.lang.String r0 = r1.getRawString()
            r2.A01 = r0
        L_0x024d:
            X.0yW r0 = r3.A0A
            if (r0 == 0) goto L_0x0255
            r0.Bly(r2)
            return
        L_0x0255:
            java.lang.String r0 = "wamRuntime"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x025c:
            java.lang.Object r0 = r14.A00
            X.3Df r0 = (X.C61733Df) r0
            X.3D5 r1 = r0.A02
            android.app.Activity r0 = r0.A00
            android.content.res.Configuration r0 = X.AnonymousClass000.A0U(r0)
            X.AnonymousClass00C.A08(r0)
            r1.A00(r0)
            return
        L_0x026f:
            java.lang.Object r4 = r14.A00
            X.3F1 r4 = (X.AnonymousClass3F1) r4
            X.4Tt r3 = r4.A03
            android.content.Intent r2 = X.C36431kI.A0D()
            X.3QT r0 = r4.A02
            java.lang.String r1 = r0.A02()
            java.lang.String r0 = "newly_added_contact_name_key"
            r2.putExtra(r0, r1)
            X.13w r0 = r4.A05
            java.lang.String r1 = r0.getRawString()
            java.lang.String r0 = "newly_added_contact_jid_key"
            r2.putExtra(r0, r1)
            goto L_0x0367
        L_0x0291:
            java.lang.Object r0 = r14.A00
            X.4Tt r0 = (X.C88714Tt) r0
            r0.Bff()
            return
        L_0x0299:
            java.lang.Object r0 = r14.A00
            X.311 r0 = (X.AnonymousClass311) r0
            X.3Kb r4 = r0.A00
            X.4Tt r2 = r4.A0A
            boolean r7 = r4.A01
            java.lang.Long r0 = r4.A0G
            if (r0 == 0) goto L_0x02d2
            X.3QT r5 = r4.A08
            java.lang.String r1 = r5.A00
            android.widget.EditText r0 = r5.A04
            java.lang.String r0 = X.AnonymousClass3QT.A00(r0)
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            r3 = r0 ^ 1
            java.lang.String r1 = r5.A01
            android.widget.EditText r0 = r5.A05
            java.lang.String r0 = X.AnonymousClass3QT.A00(r0)
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            r0 = r0 ^ 1
            if (r3 != 0) goto L_0x02c9
            if (r0 == 0) goto L_0x02d2
        L_0x02c9:
            X.0yC r0 = r4.A0D
            boolean r0 = X.C36401kF.A1Y(r0)
            r8 = 1
            if (r0 != 0) goto L_0x02d3
        L_0x02d2:
            r8 = 0
        L_0x02d3:
            X.3Gn r3 = r4.A06
            X.2Fm r5 = r4.A09
            X.312 r6 = r4.A0C
            X.3QT r4 = r4.A08
            android.content.Intent r0 = X.AnonymousClass3T6.A00(r3, r4, r5, r6, r7, r8)
            r2.Bfh(r0)
            return
        L_0x02e3:
            java.lang.Object r3 = r14.A00
            X.3Kb r3 = (X.C63443Kb) r3
            r0 = 1
            r3.A02 = r0     // Catch:{ Exception -> 0x033a }
            X.2Fm r2 = r3.A09     // Catch:{ Exception -> 0x033a }
            boolean r0 = r2.A07()     // Catch:{ Exception -> 0x033a }
            if (r0 != 0) goto L_0x0321
            java.lang.String r8 = r2.A02()     // Catch:{ Exception -> 0x033a }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r8)     // Catch:{ Exception -> 0x033a }
            java.lang.String r0 = "@"
            r1.append(r0)     // Catch:{ Exception -> 0x033a }
            java.lang.String r0 = "s.whatsapp.net"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ Exception -> 0x033a }
            X.11F r6 = X.C36421kH.A0N(r0)     // Catch:{ Exception -> 0x033a }
            java.lang.Long r0 = r3.A0G     // Catch:{ Exception -> 0x033a }
            long r0 = r0.longValue()     // Catch:{ Exception -> 0x033a }
            java.lang.String r2 = r2.A03()     // Catch:{ Exception -> 0x033a }
            X.3IL r5 = new X.3IL     // Catch:{ Exception -> 0x033a }
            r5.<init>(r0, r2)     // Catch:{ Exception -> 0x033a }
            X.3P7 r4 = r3.A0B     // Catch:{ Exception -> 0x033a }
            java.lang.Long r7 = r3.A0F     // Catch:{ Exception -> 0x033a }
            java.lang.String r9 = r3.A00     // Catch:{ Exception -> 0x033a }
            r4.A01(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x033a }
        L_0x0321:
            X.0wU r2 = r3.A0E     // Catch:{ Exception -> 0x033a }
            r0 = 31
            X.3v2 r1 = A00(r3, r0)     // Catch:{ Exception -> 0x033a }
            java.lang.String r0 = "Saving Contact"
            r2.Bp2(r1, r0)     // Catch:{ Exception -> 0x033a }
            X.17Y r1 = r3.A04     // Catch:{ Exception -> 0x033a }
            r0 = 32
            X.3v2 r0 = A00(r3, r0)     // Catch:{ Exception -> 0x033a }
            r1.A0H(r0)     // Catch:{ Exception -> 0x033a }
            return
        L_0x033a:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ContactFormSaveContactController: unable to save contact to Phone "
            X.C36321k7.A1W(r0, r1, r2)
            X.0wN r3 = r3.A03
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Failed to save contact to phone: "
            java.lang.String r2 = X.C36331k8.A0i(r0, r1, r2)
            r1 = 0
            java.lang.String r0 = "ContactFormSaveContactController: unable to save contact to Phone"
            r3.A0E(r0, r2, r1)
            return
        L_0x0357:
            java.lang.Object r0 = r14.A00
            X.3Kb r0 = (X.C63443Kb) r0
            X.4Tt r3 = r0.A0A
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = "contact_saved_to_phone"
            r0 = 1
            r2.putExtra(r1, r0)
        L_0x0367:
            r3.Bfh(r2)
            return
        L_0x036b:
            java.lang.Object r1 = r14.A00
            X.3Kb r1 = (X.C63443Kb) r1
            X.3AU r2 = new X.3AU
            r2.<init>()
            X.3B5 r0 = r1.A07
            android.accounts.Account r4 = r0.A00
            if (r4 == 0) goto L_0x038a
            java.lang.String r3 = r4.type
            java.lang.String r0 = "PHONE"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x038a
            java.lang.String r0 = r4.name
            r2.A01 = r0
            r2.A02 = r3
        L_0x038a:
            X.3QT r3 = r1.A08
            android.widget.EditText r0 = r3.A04
            java.lang.String r0 = X.AnonymousClass3QT.A00(r0)
            r2.A04 = r0
            android.widget.EditText r0 = r3.A05
            java.lang.String r0 = X.AnonymousClass3QT.A00(r0)
            r2.A05 = r0
            X.2Fm r0 = r1.A09
            java.lang.String r0 = r0.A03()
            r2.A06 = r0
            java.lang.Long r0 = r1.A0G
            r2.A00 = r0
            boolean r0 = r1.A02
            r2.A07 = r0
            android.widget.EditText r0 = r3.A03
            java.lang.String r6 = X.AnonymousClass3QT.A00(r0)
            r2.A03 = r6
            X.3Oi r5 = r1.A05
            java.lang.String r8 = r2.A01
            java.lang.String r13 = r2.A02
            java.lang.String r11 = r2.A04
            java.lang.String r9 = r2.A05
            java.lang.Long r7 = r2.A00
            java.lang.String r10 = r2.A06
            boolean r2 = r2.A07
            X.311 r3 = new X.311
            r3.<init>(r1)
            boolean r0 = r5.A01()
            if (r0 != 0) goto L_0x03dc
            java.lang.String r0 = "NativeContactDbHelper no contact permission"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.3Kb r0 = r3.A00
            X.4Tt r0 = r0.A0A
            r0.requestPermission()
            return
        L_0x03dc:
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            boolean r12 = X.AnonymousClass000.A1V(r7)
            android.net.Uri r0 = android.provider.ContactsContract.RawContacts.CONTENT_URI
            android.content.ContentProviderOperation$Builder r1 = android.content.ContentProviderOperation.newInsert(r0)
            java.lang.String r0 = "account_type"
            android.content.ContentProviderOperation$Builder r1 = r1.withValue(r0, r13)
            java.lang.String r0 = "account_name"
            X.C36351kA.A13(r1, r8, r0, r4)
            boolean r0 = X.AnonymousClass000.A1V(r7)
            java.lang.String r8 = "data2"
            if (r0 != 0) goto L_0x0429
            if (r11 == 0) goto L_0x0405
            int r0 = r11.length()
            if (r0 != 0) goto L_0x0429
        L_0x0405:
            if (r9 == 0) goto L_0x040d
            int r0 = r9.length()
            if (r0 != 0) goto L_0x0429
        L_0x040d:
            java.lang.String r0 = "vnd.android.cursor.item/phone_v2"
            android.content.ContentProviderOperation$Builder r0 = X.C64523Oi.A00(r7, r0, r2)
            java.lang.String r9 = "data1"
            android.content.ContentProviderOperation$Builder r1 = r0.withValue(r9, r10)
            java.lang.Integer r0 = X.C36361kB.A0j()
            X.C36351kA.A13(r1, r0, r8, r4)
            if (r12 != 0) goto L_0x0458
            int r0 = r6.length()
            if (r0 != 0) goto L_0x0458
            goto L_0x0461
        L_0x0429:
            java.lang.String r0 = "vnd.android.cursor.item/name"
            android.content.ContentProviderOperation$Builder r1 = X.C64523Oi.A00(r7, r0, r2)
            if (r12 != 0) goto L_0x044c
            if (r11 == 0) goto L_0x0439
            int r0 = r11.length()
            if (r0 != 0) goto L_0x044c
        L_0x0439:
            if (r9 == 0) goto L_0x0441
            int r0 = r9.length()
            if (r0 != 0) goto L_0x0452
        L_0x0441:
            android.content.ContentProviderOperation r0 = r1.build()
            X.AnonymousClass00C.A08(r0)
            r4.add(r0)
            goto L_0x040d
        L_0x044c:
            r1.withValue(r8, r11)
            if (r12 != 0) goto L_0x0452
            goto L_0x0439
        L_0x0452:
            java.lang.String r0 = "data3"
            r1.withValue(r0, r9)
            goto L_0x0441
        L_0x0458:
            java.lang.String r0 = "vnd.android.cursor.item/organization"
            android.content.ContentProviderOperation$Builder r0 = X.C64523Oi.A00(r7, r0, r2)
            X.C36351kA.A13(r0, r6, r9, r4)
        L_0x0461:
            X.0yb r0 = r5.A00     // Catch:{ Exception -> 0x0488 }
            X.0ya r0 = r0.A0O()     // Catch:{ Exception -> 0x0488 }
            if (r0 == 0) goto L_0x047a
            java.lang.String r2 = "com.android.contacts"
            java.util.ArrayList r1 = X.C36441kJ.A15(r4)     // Catch:{ Exception -> 0x0488 }
            android.content.ContentResolver r0 = X.C21050ya.A00(r0)     // Catch:{ Exception -> 0x0488 }
            android.content.ContentProviderResult[] r0 = r0.applyBatch(r2, r1)     // Catch:{ Exception -> 0x0488 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ Exception -> 0x0488 }
        L_0x047a:
            X.3Kb r0 = r3.A00     // Catch:{ Exception -> 0x0488 }
            X.17Y r1 = r0.A04     // Catch:{ Exception -> 0x0488 }
            r0 = 34
            X.3v2 r0 = A00(r3, r0)     // Catch:{ Exception -> 0x0488 }
            r1.A0H(r0)     // Catch:{ Exception -> 0x0488 }
            return
        L_0x0488:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "NativeContactDbHelper/unable to save contact "
            X.C36321k7.A1W(r0, r1, r2)
            java.lang.String r2 = r2.getMessage()
            X.3Kb r4 = r3.A00
            X.0wN r3 = r4.A03
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Failed to save contact: "
            java.lang.String r2 = X.AnonymousClass000.A0p(r0, r2, r1)
            java.lang.String r1 = "ContactFormSaveContactController: unable to save contact"
            r0 = 0
            r3.A0E(r1, r2, r0)
            X.17Y r5 = r4.A04
            X.4Tt r1 = r4.A0A
            java.util.Objects.requireNonNull(r1)
            r0 = 35
            X.3v2 r4 = A00(r1, r0)
            goto L_0x0587
        L_0x04b9:
            java.lang.Object r4 = r14.A00
            X.3B5 r4 = (X.AnonymousClass3B5) r4
            X.0yE r1 = r4.A08
            X.16m r0 = r4.A07
            boolean r0 = X.AnonymousClass3T6.A04(r0, r1)
            java.lang.String r5 = "PHONE"
            r8 = 0
            r7 = 1
            if (r0 != 0) goto L_0x04eb
            android.accounts.Account[] r6 = new android.accounts.Account[r7]
            android.content.Context r1 = r4.A02
            r0 = 2131892998(0x7f121b06, float:1.942076E38)
            java.lang.String r1 = r1.getString(r0)
            android.accounts.Account r0 = new android.accounts.Account
            r0.<init>(r1, r5)
            r6[r8] = r0
        L_0x04dd:
            r4.A01 = r6
            X.17Y r1 = r4.A06
            r0 = 29
            X.3v2 r0 = A00(r4, r0)
            r1.A0H(r0)
            return
        L_0x04eb:
            android.content.Context r3 = r4.A02
            android.accounts.AccountManager r1 = android.accounts.AccountManager.get(r3)
            java.lang.String r0 = "com.google"
            android.accounts.Account[] r1 = r1.getAccountsByType(r0)
            int r0 = r1.length
            int r2 = r0 + 1
            android.accounts.Account[] r6 = new android.accounts.Account[r2]
            java.lang.System.arraycopy(r1, r8, r6, r8, r0)
            int r2 = r2 - r7
            r0 = 2131892998(0x7f121b06, float:1.942076E38)
            java.lang.String r1 = r3.getString(r0)
            android.accounts.Account r0 = new android.accounts.Account
            r0.<init>(r1, r5)
            r6[r2] = r0
            goto L_0x04dd
        L_0x050f:
            java.lang.Object r2 = r14.A00
            X.3QX r2 = (X.AnonymousClass3QX) r2
            X.16D r0 = r2.A02
            X.16z r0 = r0.A04
            java.util.Map r0 = r0.A01
            r0.clear()
            X.171 r1 = r2.A04
            java.util.concurrent.ConcurrentHashMap r0 = r1.A07
            r0.clear()
            java.util.concurrent.ConcurrentHashMap r0 = r1.A08
            r0.clear()
            X.16I r1 = r2.A03
            r0 = 0
            r1.A04(r0)
            return
        L_0x052f:
            java.lang.Object r3 = r14.A00
            X.3Qm r3 = (X.C65043Qm) r3
            r4 = 0
            X.0yb r0 = r3.A0A
            android.telephony.TelephonyManager r1 = r0.A0K()
            java.nio.charset.Charset r0 = X.AnonymousClass1M4.A06
            if (r1 == 0) goto L_0x0577
            java.lang.String r2 = r1.getSimCountryIso()
            if (r2 == 0) goto L_0x054a
            int r0 = r2.length()
            if (r0 != 0) goto L_0x056d
        L_0x054a:
            X.1M4 r1 = r3.A0C
            X.0ts r0 = r3.A0B
            java.util.Locale r0 = X.C36401kF.A0x(r0)
            java.lang.String r0 = X.C26621Kw.A05(r0)
            java.util.List r1 = X.AnonymousClass1M4.A02(r1, r0)
            X.AnonymousClass00C.A08(r1)
            boolean r0 = X.C36401kF.A1a(r1)
            if (r0 == 0) goto L_0x056b
            java.lang.Object r0 = r1.get(r4)
            X.35o r0 = (X.C598635o) r0
            java.lang.String r2 = r0.A00
        L_0x056b:
            if (r2 == 0) goto L_0x0573
        L_0x056d:
            int r0 = r2.length()
            if (r0 != 0) goto L_0x0575
        L_0x0573:
            java.lang.String r2 = "us"
        L_0x0575:
            r1 = 0
            goto L_0x0579
        L_0x0577:
            r2 = 0
            goto L_0x054a
        L_0x0579:
            X.1N4 r0 = r3.A07     // Catch:{ IOException -> 0x057f }
            java.lang.String r1 = r0.A05(r2)     // Catch:{ IOException -> 0x057f }
        L_0x057f:
            X.17Y r5 = r3.A08
            r0 = 7
            X.3vK r4 = new X.3vK
            r4.<init>(r3, r2, r1, r0)
        L_0x0587:
            r5.A0H(r4)
            return
        L_0x058b:
            java.lang.Object r3 = r14.A00
            com.whatsapp.components.AutoScrollView r3 = (com.whatsapp.components.AutoScrollView) r3
            boolean r1 = r3.A02
            boolean r0 = r3.A03
            if (r1 == 0) goto L_0x05ae
            r2 = 0
            android.widget.HorizontalScrollView r1 = r3.A00
            if (r0 == 0) goto L_0x05a0
            int r0 = r3.A04
            r1.scrollTo(r0, r2)
            return
        L_0x05a0:
            int r0 = r1.getMeasuredWidth()
            r1.scrollTo(r0, r2)
            int r0 = r3.A04
            int r0 = -r0
            r1.scrollBy(r0, r2)
            return
        L_0x05ae:
            android.widget.HorizontalScrollView r1 = r3.A00
            if (r0 == 0) goto L_0x05b7
            r0 = 0
            r1.scrollTo(r0, r0)
            return
        L_0x05b7:
            r0 = 66
            r1.fullScroll(r0)
            return
        L_0x05bd:
            java.lang.Object r0 = r14.A00
            android.animation.Animator r0 = (android.animation.Animator) r0
            r0.start()
            return
        L_0x05c5:
            java.lang.Object r3 = r14.A00
            X.014 r3 = (X.AnonymousClass014) r3
            X.1qm r5 = X.AnonymousClass3LW.A00(r3)
            r2 = 2131891806(0x7f12165e, float:1.9418342E38)
            r1 = 41
            X.2rZ r0 = new X.2rZ
            r0.<init>(r3, r1)
            r5.A0m(r3, r0, r2)
            r0 = 2131888158(0x7f12081e, float:1.9410943E38)
            r5.A0c(r0)
            r0 = 2131888157(0x7f12081d, float:1.9410941E38)
            goto L_0x0652
        L_0x05e4:
            java.lang.Object r4 = r14.A00
            com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity r4 = (com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity) r4
            X.005 r0 = r4.A04
            if (r0 == 0) goto L_0x0633
            java.lang.Object r0 = r0.get()
            X.1RU r0 = (X.AnonymousClass1RU) r0
            java.lang.String r1 = r0.A01
            r3 = 0
            if (r1 == 0) goto L_0x0612
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0612
            X.005 r0 = r4.A04
            if (r0 == 0) goto L_0x060b
            java.lang.Object r0 = X.C36411kG.A0v(r0)
            X.1RU r0 = (X.AnonymousClass1RU) r0
            X.C53672rh.A00(r4, r0, r1)
            return
        L_0x060b:
            java.lang.String r0 = "accountSwitcher"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0612:
            X.1qm r5 = X.AnonymousClass3LW.A00(r4)
            r2 = 2131891806(0x7f12165e, float:1.9418342E38)
            r1 = 42
            X.2rZ r0 = new X.2rZ
            r0.<init>(r4, r1)
            r5.A0m(r4, r0, r2)
            r0 = 2131888149(0x7f120815, float:1.9410925E38)
            r5.A0c(r0)
            r0 = 2131888150(0x7f120816, float:1.9410927E38)
            r5.A0d(r0)
            r5.A0r(r3)
            goto L_0x0659
        L_0x0633:
            java.lang.String r0 = "accountSwitcher"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x063a:
            java.lang.Object r2 = r14.A00
            android.content.Context r2 = (android.content.Context) r2
            X.1qm r5 = X.AnonymousClass3LW.A00(r2)
            r1 = 2131888151(0x7f120817, float:1.941093E38)
            r0 = 7
            X.C39001qm.A0H(r5, r2, r0, r1)
            r0 = 2131888153(0x7f120819, float:1.9410933E38)
            r5.A0c(r0)
            r0 = 2131888152(0x7f120818, float:1.9410931E38)
        L_0x0652:
            r5.A0d(r0)
            r0 = 0
            r5.A0r(r0)
        L_0x0659:
            r5.A0b()
            return
        L_0x065d:
            java.lang.Object r3 = r14.A00
            com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity r3 = (com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity) r3
            X.13r r0 = com.whatsapp.jid.UserJid.Companion
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = r3.A05
            if (r0 != 0) goto L_0x0672
            java.lang.String r0 = "cc"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0672:
            r1.append(r0)
            java.lang.String r0 = r3.A07
            if (r0 != 0) goto L_0x0680
            java.lang.String r0 = "pn"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0680:
            r1.append(r0)
            java.lang.String r0 = "@s.whatsapp.net"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            com.whatsapp.jid.UserJid r2 = X.C222813r.A01(r0)
            X.1Ih r0 = r3.A02
            if (r0 == 0) goto L_0x069a
            r1 = 1
            X.0xH r0 = X.C25951Ih.A00(r0)
            r0.A08(r2, r1)
            return
        L_0x069a:
            java.lang.String r0 = "companionRegistrationManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x06a1:
            java.lang.Object r0 = r14.A00
            com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity r0 = (com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity) r0
            X.1Ih r0 = r0.A02
            if (r0 == 0) goto L_0x06b1
            X.0xH r0 = X.C25951Ih.A00(r0)
            r0.A05()
            return
        L_0x06b1:
            java.lang.String r0 = "companionRegistrationManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x06b8:
            java.lang.Object r0 = r14.A00
            com.whatsapp.companionmode.registration.CompanionRegistrationViewModel r0 = (com.whatsapp.companionmode.registration.CompanionRegistrationViewModel) r0
            X.1Ih r0 = r0.A04
            goto L_0x06c9
        L_0x06bf:
            java.lang.Object r1 = r14.A00
            com.whatsapp.companionmode.registration.CompanionRegistrationViewModel r1 = (com.whatsapp.companionmode.registration.CompanionRegistrationViewModel) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.1Ih r0 = r1.A04
        L_0x06c9:
            X.0xH r2 = X.C25951Ih.A00(r0)
            monitor-enter(r2)
            java.lang.String r0 = "companion/registration/start"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x06de }
            r1 = 2
            X.13g r0 = r2.A0P     // Catch:{ all -> 0x06de }
            r0.A01(r1)     // Catch:{ all -> 0x06de }
            X.C20260xH.A00(r2)     // Catch:{ all -> 0x06de }
            monitor-exit(r2)
            return
        L_0x06de:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x06e1:
            java.lang.Object r2 = r14.A00
            com.whatsapp.companionmode.registration.CompanionPostLogoutActivity r2 = (com.whatsapp.companionmode.registration.CompanionPostLogoutActivity) r2
            X.3Gu r1 = r2.A02
            java.lang.String r0 = "CompanionPostLogoutActivity"
            X.C62603Gu.A00(r2, r1, r0)
            return
        L_0x06ed:
            java.lang.Object r1 = r14.A00
            X.36I r1 = (X.AnonymousClass36I) r1
            X.6Lp r5 = r1.A02
            int r0 = r5.A01
            com.whatsapp.companiondevice.sync.HistorySyncCompanionWorker r4 = r1.A01
            X.1aS r3 = r4.A01
            if (r0 != 0) goto L_0x070c
            r2 = 0
            long r0 = r1.A00
            r3.A02(r5, r0, r2)
            X.4tL r1 = r4.A00
            X.4ow r0 = new X.4ow
            r0.<init>()
        L_0x0708:
            r1.A04(r0)
            return
        L_0x070c:
            r2 = 1
            long r0 = r1.A00
            r3.A02(r5, r0, r2)
            X.4tL r1 = r4.A00
            X.4ov r0 = new X.4ov
            r0.<init>()
            goto L_0x0708
        L_0x071a:
            java.lang.Object r0 = r14.A00
            java.util.concurrent.CountDownLatch r0 = (java.util.concurrent.CountDownLatch) r0
            r0.countDown()
            return
        L_0x0722:
            java.lang.Object r1 = r14.A00
            X.2Mm r1 = (X.C44212Mm) r1
            java.lang.String r0 = "MDSyncAbpropsObserver/onAfterABPropsChanged enable privacy setting disable link previews"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1AK r1 = r1.A05
            X.1Ld r0 = X.C26691Ld.PRIVACY_SETTING_DISABLE_LINK_PREVIEWS
            goto L_0x074d
        L_0x0730:
            java.lang.Object r1 = r14.A00
            X.2Mm r1 = (X.C44212Mm) r1
            java.lang.String r0 = "MDSyncAbpropsObserver/onAfterABPropsChanged enable fav sticker sync"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.196 r0 = r1.A04
            X.1AK r1 = r0.A0J
            java.lang.String r0 = "favoriteSticker"
            goto L_0x074f
        L_0x0740:
            java.lang.Object r1 = r14.A00
            X.2Mm r1 = (X.C44212Mm) r1
            java.lang.String r0 = "MDSyncAbpropsObserver/onAfterABPropsChanged enable external web beta sync"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1AK r1 = r1.A05
            X.1Ld r0 = X.C26691Ld.EXTERNAL_WEB_BETA
        L_0x074d:
            java.lang.String r0 = r0.mutationName
        L_0x074f:
            X.AnonymousClass1AK.A00(r1, r0)
            return
        L_0x0753:
            java.lang.Object r0 = r14.A00
            com.whatsapp.companiondevice.sync.HistorySyncCompanionWorker r0 = (com.whatsapp.companiondevice.sync.HistorySyncCompanionWorker) r0
            com.whatsapp.companiondevice.sync.HistorySyncCompanionWorker.A00(r0)
            return
        L_0x075b:
            java.lang.Object r5 = r14.A00
            X.39p r5 = (X.C608539p) r5
            java.util.Set r0 = X.C201669k5.A08
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r0)
            java.util.Set r0 = X.C201669k5.A09
            r1.removeAll(r0)
            java.util.Iterator r4 = r1.iterator()
        L_0x076f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x07ad
            java.lang.String r3 = X.AnonymousClass001.A0C(r4)
            X.1IT r2 = r5.A04
            r0 = 0
            r2.A04(r3, r0)
            goto L_0x076f
        L_0x0781:
            java.lang.Object r5 = r14.A00
            X.39p r5 = (X.C608539p) r5
            java.util.Set r0 = X.C201669k5.A09
            java.util.Iterator r4 = r0.iterator()
        L_0x078b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x079d
            java.lang.String r3 = X.AnonymousClass001.A0C(r4)
            X.1IT r2 = r5.A04
            r0 = 0
            r2.A04(r3, r0)
            goto L_0x078b
        L_0x079d:
            X.0wp r0 = r5.A03
            r2 = 1
            android.content.SharedPreferences r0 = X.C19980wp.A00(r0)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "companion_syncd_critical_bootstrap_state"
            X.C36341k9.A0v(r1, r0, r2)
        L_0x07ad:
            X.196 r0 = r5.A02
            r0.A0H()
            return
        L_0x07b3:
            java.lang.Object r2 = r14.A00
            X.1tz r2 = (X.C39861tz) r2
            X.00s r1 = r2.A01
            r0 = 0
            r1.A0D(r0)
            X.00s r1 = r2.A02
            r0 = 1
            X.C36341k9.A18(r1, r0)
            return
        L_0x07c4:
            java.lang.Object r0 = r14.A00
            X.1tz r0 = (X.C39861tz) r0
            X.3Dd r0 = r0.A03
            r0.A00()
            return
        L_0x07ce:
            java.lang.Object r0 = r14.A00
            X.3pg r0 = (X.C76933pg) r0
            X.C76933pg.A00(r0)
            X.9nj r3 = r0.A02
            java.lang.String r0 = "SyncResponseHandler/onDeliveryFailure request failed to be delivered, retrying."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.1Cm r0 = r3.A0I
            java.lang.Long r2 = r0.A00()
            r1 = 0
            r0 = 1
            X.C203289nj.A01(r3, r2, r1, r0)
            return
        L_0x07e8:
            return
        L_0x07e9:
            return
        L_0x07ea:
            java.util.List r5 = r1.A01     // Catch:{ all -> 0x0802 }
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x0802 }
            r1.A01 = r0     // Catch:{ all -> 0x0802 }
            r0 = 0
            r1.A00 = r0     // Catch:{ all -> 0x0802 }
            X.0xY r2 = r1.A05     // Catch:{ all -> 0x0802 }
            X.5Tu r4 = X.C108515Tu.A04     // Catch:{ all -> 0x0802 }
            X.6NS r3 = X.AnonymousClass6NS.A0D     // Catch:{ all -> 0x0802 }
            r6 = 0
            r7 = 1
            r2.A03(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0802 }
            monitor-exit(r1)     // Catch:{ all -> 0x0802 }
            return
        L_0x0802:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0802 }
            throw r0
        L_0x0805:
            boolean r0 = r3.A0U(r0)     // Catch:{ all -> 0x0854 }
            if (r0 == 0) goto L_0x0852
            X.1AE r1 = r3.A0T     // Catch:{ all -> 0x0854 }
            java.lang.String r0 = "contact"
            X.1LZ r0 = r1.A00(r0)     // Catch:{ all -> 0x0854 }
            if (r0 == 0) goto L_0x0852
            boolean r0 = r3.A0S()     // Catch:{ all -> 0x0854 }
            if (r0 == 0) goto L_0x0852
            X.16D r2 = r3.A0L     // Catch:{ all -> 0x0854 }
            X.0wQ r0 = r2.A02     // Catch:{ all -> 0x0854 }
            com.whatsapp.jid.PhoneUserJid r0 = X.C36441kJ.A0n(r0)     // Catch:{ all -> 0x0854 }
            X.141 r1 = r2.A0A(r0)     // Catch:{ all -> 0x0854 }
            if (r1 == 0) goto L_0x0852
            X.16p r0 = r2.A05     // Catch:{ all -> 0x0854 }
            boolean r0 = r0.A0Z(r1)     // Catch:{ all -> 0x0854 }
            if (r0 == 0) goto L_0x0852
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x0854 }
            com.whatsapp.jid.PhoneUserJid r0 = X.C36441kJ.A0n(r4)     // Catch:{ all -> 0x0854 }
            r1.add(r0)     // Catch:{ all -> 0x0854 }
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x0854 }
            android.util.Pair r0 = X.AnonymousClass196.A00(r3, r1, r0)     // Catch:{ all -> 0x0854 }
            X.199 r2 = r3.A0X     // Catch:{ all -> 0x0854 }
            java.lang.String r1 = "SYNC_MANAGER_CONTACTS_JID_ADDED"
            java.lang.Object r0 = r0.first     // Catch:{ all -> 0x0854 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ all -> 0x0854 }
            r2.A0A(r1, r0)     // Catch:{ all -> 0x0854 }
            r3.A0F()     // Catch:{ all -> 0x0854 }
        L_0x0852:
            monitor-exit(r3)     // Catch:{ all -> 0x0854 }
            return
        L_0x0854:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0854 }
            throw r0
        L_0x0857:
            r2 = move-exception
            X.1Hj r1 = r3.A01
            if (r1 == 0) goto L_0x0863
            X.1Hi r0 = r3.A05
            X.1Hk r0 = r0.A00
            r0.A02(r1)
        L_0x0863:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80213v2.run():void");
    }
}
