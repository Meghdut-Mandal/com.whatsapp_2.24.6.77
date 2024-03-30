package X;

/* renamed from: X.74e  reason: invalid class name and case insensitive filesystem */
public class C1501574e implements Runnable {
    public Object A00;
    public final int A01;

    public C1501574e(AnonymousClass6YM r2) {
        this.A01 = 33;
        this.A00 = r2;
    }

    public static void A00(C19930wk r1, Object obj, int i) {
        r1.execute(new C1501574e(obj, i));
    }

    public static void A01(C19770wU r1, Object obj, int i) {
        r1.Boy(new C1501574e(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.whatsapp.WaTextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: com.whatsapp.WaTextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v32, resolved type: com.whatsapp.WaTextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v33, resolved type: com.whatsapp.WaTextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: com.whatsapp.WaTextView} */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0388, code lost:
        if (r0 != false) goto L_0x055e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03a6, code lost:
        if (r2.intersect(r1) != false) goto L_0x03a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03a8, code lost:
        r0 = 8;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x04ae, code lost:
        r0.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x04b1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x04de, code lost:
        r1.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x04e1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0514, code lost:
        com.whatsapp.util.Log.i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0517, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x055e, code lost:
        r0 = 0;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x055f, code lost:
        r3.setVisibility(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0562, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        ((com.whatsapp.calling.schedulecall.upcomingcalls.viewmodel.UpcomingActivityViewModel) r0).A0S();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b7, code lost:
        r2 = X.C36441kJ.A16();
        r1 = r9.A00;
        X.C144796sp.A00(r1.A09(4514), r2);
        X.C144796sp.A00(r1.A09(6230), r2);
        r7 = r2.size();
        r6 = new int[r7];
        r3 = 0;
        r2 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00de, code lost:
        if (r2.hasNext() == false) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e0, code lost:
        r6[r3] = ((java.lang.Number) r2.next()).intValue();
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f0, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f3, code lost:
        if (r8 >= r7) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f5, code lost:
        r5 = r9.A01;
        r4 = r6[r8];
        r5.A02.Boy(new X.C81263wj(r5, new X.C165087sr(r9, 2), new X.C165087sr(r9, 1), r4));
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0112, code lost:
        r4 = r9.A01.A00;
        r3 = X.C90524aI.A0T(X.AnonymousClass000.A0q("/ML_MODEL", X.AnonymousClass000.A0v(X.C90514aH.A0j(r4.A00).getCanonicalPath())), "wa_bwe_pl_classifier_mobile");
        r2 = java.util.Arrays.toString(r6);
        X.AnonymousClass00C.A08(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0139, code lost:
        if (r3.exists() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x013f, code lost:
        if (r3.isDirectory() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0141, code lost:
        r1 = X.AnonymousClass000.A0u();
        r1.append("MLModelCacheManagerImpl/removeModels/deleting model files for ");
        r1.append("wa_bwe_pl_classifier_mobile");
        X.C36321k7.A1Q(", but keep versions ", r2, r1);
        r2 = X.C36441kJ.A14(r7);
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0157, code lost:
        if (r1 >= r7) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0159, code lost:
        r2.add(r4.A01("wa_bwe_pl_classifier_mobile", r6[r1]));
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0165, code lost:
        r1 = new X.C12380hx(X.C15060md.A02(new X.AnonymousClass7UL(r3, r2), new X.C12740ia(r3, X.AnonymousClass0Nd.TOP_DOWN)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x017e, code lost:
        if (r1.hasNext() == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0180, code lost:
        ((java.io.File) r1.next()).delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0228, code lost:
        if (X.C110905bQ.A00(r1, "com.facebook.stella_debug") != false) goto L_0x022a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            int r0 = r15.A01
            switch(r0) {
                case 0: goto L_0x0363;
                case 1: goto L_0x05c3;
                case 2: goto L_0x05b9;
                case 3: goto L_0x05b0;
                case 4: goto L_0x05a8;
                case 5: goto L_0x0339;
                case 6: goto L_0x02f9;
                case 7: goto L_0x02d1;
                case 8: goto L_0x02bd;
                case 9: goto L_0x0552;
                case 10: goto L_0x0597;
                case 11: goto L_0x0589;
                case 12: goto L_0x0576;
                case 13: goto L_0x056e;
                case 14: goto L_0x0563;
                case 15: goto L_0x02a9;
                case 16: goto L_0x038c;
                case 17: goto L_0x0249;
                case 18: goto L_0x0208;
                case 19: goto L_0x053f;
                case 20: goto L_0x01fb;
                case 21: goto L_0x0518;
                case 22: goto L_0x018e;
                case 23: goto L_0x018a;
                case 24: goto L_0x0005;
                case 25: goto L_0x0005;
                case 26: goto L_0x050a;
                case 27: goto L_0x0500;
                case 28: goto L_0x04f6;
                case 29: goto L_0x04e2;
                case 30: goto L_0x00b1;
                case 31: goto L_0x04d7;
                case 32: goto L_0x05d6;
                case 33: goto L_0x0076;
                case 34: goto L_0x04cd;
                case 35: goto L_0x04c5;
                case 36: goto L_0x04bc;
                case 37: goto L_0x04b2;
                case 38: goto L_0x004c;
                case 39: goto L_0x04aa;
                case 40: goto L_0x0498;
                case 41: goto L_0x003c;
                case 42: goto L_0x03d3;
                case 43: goto L_0x03cb;
                case 44: goto L_0x0027;
                case 45: goto L_0x0017;
                case 46: goto L_0x03ac;
                case 47: goto L_0x037e;
                case 48: goto L_0x0376;
                case 49: goto L_0x0011;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r15.A00
            X.7pA r0 = (X.C162797pA) r0
            java.lang.Object r0 = r0.A00
        L_0x000b:
            com.whatsapp.calling.schedulecall.upcomingcalls.viewmodel.UpcomingActivityViewModel r0 = (com.whatsapp.calling.schedulecall.upcomingcalls.viewmodel.UpcomingActivityViewModel) r0
            r0.A0S()
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r9 = r15.A00
            X.6sp r9 = (X.C144796sp) r9
            goto L_0x00b7
        L_0x0017:
            java.lang.Object r0 = r15.A00
            com.whatsapp.calling.views.PermissionDialogFragment r0 = (com.whatsapp.calling.views.PermissionDialogFragment) r0
            X.4Su r2 = r0.A04
            if (r2 == 0) goto L_0x0010
            int r1 = r0.A00
            java.lang.String[] r0 = r0.A0E
            r2.Bcd(r0, r1)
            return
        L_0x0027:
            java.lang.Object r0 = r15.A00
            X.711 r0 = (X.AnonymousClass711) r0
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r0.A01
            if (r0 == 0) goto L_0x0010
            X.5Fb r0 = r0.A0Q
            X.6YM r2 = r0.A01
            if (r2 == 0) goto L_0x0010
            r1 = 15
            r0 = 0
            X.AnonymousClass6YM.A0A(r2, r0, r0, r1)
            return
        L_0x003c:
            java.lang.Object r0 = r15.A00
            X.5wD r0 = (X.C123265wD) r0
            android.widget.PopupWindow r1 = r0.A01
            boolean r0 = r1.isShowing()
            if (r0 == 0) goto L_0x0010
            r1.dismiss()
            return
        L_0x004c:
            java.lang.Object r0 = r15.A00
            X.0wB r0 = (X.C19580wB) r0
            java.util.Iterator r2 = X.C36361kB.A0s(r0)
        L_0x0054:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0010
            java.lang.Object r0 = r2.next()
            X.36B r0 = (X.AnonymousClass36B) r0
            java.util.Set r0 = r0.A02
            java.util.Iterator r1 = r0.iterator()
        L_0x0066:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0054
            java.lang.Object r0 = r1.next()
            X.4Ss r0 = (X.C88444Ss) r0
            r0.BSc()
            goto L_0x0066
        L_0x0076:
            java.lang.Object r4 = r15.A00
            X.6YM r4 = (X.AnonymousClass6YM) r4
            com.whatsapp.voipcalling.CallInfo r3 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r3 == 0) goto L_0x0010
            X.6EE r0 = r3.self
            if (r0 == 0) goto L_0x0010
            r2 = 1
            r1 = 0
            boolean r0 = r0.A0F
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            com.whatsapp.voipcalling.Voip.muteCall(r0)
            if (r0 == 0) goto L_0x00a5
            X.13J r0 = r4.A35
            X.13K r0 = (X.AnonymousClass13K) r0
            X.0yC r1 = r0.A02
            r0 = 4226(0x1082, float:5.922E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0010
            X.6zT r0 = r4.A2E
            r0.A0F(r2)
            return
        L_0x00a5:
            boolean r0 = r3.isSelfCallOnHold()
            if (r0 != 0) goto L_0x0010
            X.6zT r0 = r4.A2E
            r0.A0F(r1)
            return
        L_0x00b1:
            java.lang.Object r0 = r15.A00
            X.6YM r0 = (X.AnonymousClass6YM) r0
            X.6sp r9 = r0.A2W
        L_0x00b7:
            java.util.HashSet r2 = X.C36441kJ.A16()
            X.0yC r1 = r9.A00
            r0 = 4514(0x11a2, float:6.325E-42)
            java.lang.String r0 = r1.A09(r0)
            X.C144796sp.A00(r0, r2)
            r0 = 6230(0x1856, float:8.73E-42)
            java.lang.String r0 = r1.A09(r0)
            X.C144796sp.A00(r0, r2)
            int r7 = r2.size()
            int[] r6 = new int[r7]
            r3 = 0
            java.util.Iterator r2 = r2.iterator()
        L_0x00da:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00f0
            java.lang.Object r0 = r2.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r3 + 1
            int r0 = r0.intValue()
            r6[r3] = r0
            r3 = r1
            goto L_0x00da
        L_0x00f0:
            r8 = 0
        L_0x00f1:
            java.lang.String r5 = "wa_bwe_pl_classifier_mobile"
            if (r8 >= r7) goto L_0x0112
            X.6CQ r5 = r9.A01
            r4 = r6[r8]
            r0 = 2
            X.7sr r3 = new X.7sr
            r3.<init>(r9, r0)
            r0 = 1
            X.7sr r2 = new X.7sr
            r2.<init>(r9, r0)
            X.0wU r1 = r5.A02
            X.3wj r0 = new X.3wj
            r0.<init>(r5, r3, r2, r4)
            r1.Boy(r0)
            int r8 = r8 + 1
            goto L_0x00f1
        L_0x0112:
            X.6CQ r0 = r9.A01
            X.6Nw r4 = r0.A00
            X.0wG r0 = r4.A00
            java.io.File r0 = X.C90514aH.A0j(r0)
            java.lang.String r0 = r0.getCanonicalPath()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r0)
            java.lang.String r0 = "/ML_MODEL"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            java.io.File r3 = X.C90524aI.A0T(r0, r5)
            java.lang.String r2 = java.util.Arrays.toString(r6)
            X.AnonymousClass00C.A08(r2)
            boolean r0 = r3.exists()
            if (r0 == 0) goto L_0x0010
            boolean r0 = r3.isDirectory()
            if (r0 == 0) goto L_0x0010
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MLModelCacheManagerImpl/removeModels/deleting model files for "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ", but keep versions "
            X.C36321k7.A1Q(r0, r2, r1)
            java.util.ArrayList r2 = X.C36441kJ.A14(r7)
            r1 = 0
        L_0x0157:
            if (r1 >= r7) goto L_0x0165
            r0 = r6[r1]
            java.io.File r0 = r4.A01(r5, r0)
            r2.add(r0)
            int r1 = r1 + 1
            goto L_0x0157
        L_0x0165:
            X.0Nd r0 = X.AnonymousClass0Nd.TOP_DOWN
            X.0ia r1 = new X.0ia
            r1.<init>(r3, r0)
            X.7UL r0 = new X.7UL
            r0.<init>(r3, r2)
            X.0ih r0 = X.C15060md.A02(r0, r1)
            X.0hx r1 = new X.0hx
            r1.<init>(r0)
        L_0x017a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0010
            java.lang.Object r0 = r1.next()
            java.io.File r0 = (java.io.File) r0
            r0.delete()
            goto L_0x017a
        L_0x018a:
            java.lang.Object r0 = r15.A00
            goto L_0x000b
        L_0x018e:
            java.lang.Object r3 = r15.A00
            com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel r3 = (com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel) r3
            com.whatsapp.jid.GroupJid r2 = r3.A02
            if (r2 == 0) goto L_0x0010
            X.16D r0 = r3.A0F
            X.141 r1 = r0.A0D(r2)
            X.171 r0 = r3.A0G
            java.lang.String r0 = r0.A0H(r1)
            r4 = 0
            X.539 r7 = new X.539
            r7.<init>(r4, r0)
            X.00s r5 = r3.A0A
            boolean r1 = r3.A06
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            java.util.ArrayList r9 = com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel.A06(r3, r0, r4, r1, r4)
            X.0yC r4 = r3.A0K
            X.17X r0 = r3.A0I
            X.17r r1 = r0.A07
            int r0 = r1.A0B(r2)
            boolean r11 = X.C34681hT.A0P(r4, r0)
            r8 = 0
            r10 = 0
            X.6DD r6 = new X.6DD
            r6.<init>(r7, r8, r9, r10, r11)
            r5.A0C(r6)
            X.00s r0 = r3.A09
            X.C36331k8.A13(r0)
            int r2 = r1.A0B(r2)
            r0 = 5429(0x1535, float:7.608E-42)
            int r1 = r4.A07(r0)
            r0 = 1
            if (r1 != r0) goto L_0x0010
            r0 = 6083(0x17c3, float:8.524E-42)
            int r0 = r4.A07(r0)
            if (r0 <= 0) goto L_0x0010
            r0 = 6119(0x17e7, float:8.575E-42)
            int r0 = r4.A07(r0)
            if (r2 < r0) goto L_0x0010
            X.040 r2 = X.C109325Xd.A00(r3)
            X.02l r1 = r3.A0M
            com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel$updateConfirmationViewState$1$1 r0 = new com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel$updateConfirmationViewState$1$1
            r0.<init>(r3, r8)
            X.C36381kD.A1R(r1, r0, r2)
            return
        L_0x01fb:
            java.lang.Object r0 = r15.A00
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog r0 = (com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog) r0
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r0.A01
            if (r1 == 0) goto L_0x0010
            r0 = 3
            r1.A0W(r0)
            return
        L_0x0208:
            java.lang.Object r3 = r15.A00
            X.6ro r3 = (X.C144206ro) r3
            X.5lz r4 = r3.A08
            android.content.Context r1 = r3.A01
            java.lang.Boolean r0 = r4.A00
            if (r0 != 0) goto L_0x0232
            monitor-enter(r4)
            java.lang.Boolean r0 = r4.A00     // Catch:{ all -> 0x0652 }
            if (r0 != 0) goto L_0x0231
            java.lang.String r0 = "com.facebook.stella"
            boolean r0 = X.C110905bQ.A00(r1, r0)     // Catch:{ all -> 0x0652 }
            if (r0 != 0) goto L_0x022a
            java.lang.String r0 = "com.facebook.stella_debug"
            boolean r1 = X.C110905bQ.A00(r1, r0)     // Catch:{ all -> 0x0652 }
            r0 = 0
            if (r1 == 0) goto L_0x022b
        L_0x022a:
            r0 = 1
        L_0x022b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0652 }
            r4.A00 = r0     // Catch:{ all -> 0x0652 }
        L_0x0231:
            monitor-exit(r4)
        L_0x0232:
            java.lang.Boolean r0 = r4.A00
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0010
            X.17Y r2 = r3.A04
            r1 = 17
            X.74e r0 = new X.74e
            r0.<init>(r3, r1)
            r2.A0H(r0)
            return
        L_0x0249:
            java.lang.Object r3 = r15.A00
            X.6ro r3 = (X.C144206ro) r3
            X.6wd r8 = r3.A09
            X.0yC r7 = r3.A07
            android.content.Context r4 = r3.A01
            X.01z r6 = r3.A03
            X.02t r10 = r3.A0A
            android.view.ViewStub r5 = r3.A02
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131168640(0x7f070d80, float:1.7951588E38)
            int r2 = r1.getDimensionPixelSize(r0)
            X.6uX r9 = new X.6uX
            r9.<init>(r3)
            r0 = 3
            X.AnonymousClass00C.A0D(r10, r0)
            X.0wG r0 = r8.A03
            if (r0 == 0) goto L_0x05f4
            android.content.res.Resources r1 = X.C36421kH.A0B(r0)
            r0 = 2131168567(0x7f070d37, float:1.795144E38)
            int r0 = X.C36441kJ.A06(r1, r0, r2)
            r8.A01 = r0
            java.util.Map r0 = r8.A0E
            java.util.Set r1 = r0.keySet()
            java.util.Set r0 = r8.A0F
            java.util.LinkedHashSet r3 = X.C13640kC.A04(r0, r1)
            X.6Nx r2 = r8.A07
            if (r2 == 0) goto L_0x05ed
            X.005 r1 = r8.A08
            if (r1 == 0) goto L_0x05e6
            X.7MD r0 = new X.7MD
            r0.<init>(r8)
            X.AnonymousClass6T7.A00(r2, r8, r1, r3, r0)
            X.7Oz r3 = new X.7Oz
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r8.A09 = r3
            int r0 = r8.A00
            if (r0 != 0) goto L_0x0010
            r3.invoke()
            return
        L_0x02a9:
            java.lang.Object r2 = r15.A00
            X.52q r2 = (X.C1029452q) r2
            r2.A0C()
            X.52t r0 = r2.A00
            if (r0 == 0) goto L_0x0010
            int r1 = r0.A00
            r0 = 1
            if (r1 == r0) goto L_0x0010
            X.C1029452q.A01(r2)
            return
        L_0x02bd:
            java.lang.Object r1 = r15.A00
            X.52X r1 = (X.AnonymousClass52X) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.6Eu r0 = r1.A05
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.A0W
            if (r0 != 0) goto L_0x0010
            r0 = 8
            r1.A0J(r0)
            return
        L_0x02d1:
            java.lang.Object r3 = r15.A00
            X.52X r3 = (X.AnonymousClass52X) r3
            X.70u r2 = r3.A06
            if (r2 == 0) goto L_0x0010
            X.7gI r0 = r3.A05
            if (r0 == 0) goto L_0x0010
            r1 = 5
            X.7qf r0 = new X.7qf
            r0.<init>(r2, r1)
            X.C1493370u.A02(r2, r0)
            X.70u r0 = r3.A06
            X.7gI r2 = r3.A05
            java.util.Set r1 = r0.A0F
            monitor-enter(r1)
            r1.add(r2)     // Catch:{ all -> 0x05fb }
            monitor-exit(r1)     // Catch:{ all -> 0x05fb }
            boolean r0 = r0.A0M
            if (r0 == 0) goto L_0x0010
            r2.Bee()
            return
        L_0x02f9:
            java.lang.Object r2 = r15.A00
            X.52X r2 = (X.AnonymousClass52X) r2
            X.70u r1 = r2.A06
            if (r1 == 0) goto L_0x0308
            X.7gI r0 = r2.A05
            if (r0 == 0) goto L_0x0308
            r1.A0A(r0)
        L_0x0308:
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r4 = r2.A04
            if (r4 == 0) goto L_0x0010
            X.6Eu r0 = r2.A05
            if (r0 == 0) goto L_0x0010
            com.whatsapp.jid.UserJid r3 = r0.A0b
            X.6ND r2 = r4.A0S
            r0 = 0
            X.AnonymousClass00C.A0D(r3, r0)
            java.util.Map r0 = r2.A02
            java.lang.Object r1 = r0.remove(r3)
            X.03e r1 = (X.C007403e) r1
            if (r1 == 0) goto L_0x0326
            r0 = 0
            r1.B2S(r0)
        L_0x0326:
            java.util.Set r0 = r2.A03
            boolean r0 = r0.remove(r3)
            if (r0 == 0) goto L_0x0335
            X.00s r1 = r2.A01
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            r1.A0D(r0)
        L_0x0335:
            X.C95504lc.A04(r4)
            return
        L_0x0339:
            java.lang.Object r1 = r15.A00
            X.6dH r1 = (X.C135796dH) r1
            boolean r0 = X.C135796dH.A01(r1)
            if (r0 == 0) goto L_0x0010
            com.whatsapp.calling.callgrid.view.PipViewContainer r3 = r1.A0J
            X.4oI r2 = r3.A04
            X.6Eu r0 = r2.A05
            r1 = 0
            if (r0 == 0) goto L_0x035c
            boolean r0 = r0.A0Q
            if (r0 == 0) goto L_0x035c
            android.view.View r0 = r2.A0H
            r0.performHapticFeedback(r1)
            X.4oI r0 = r3.A04
            android.view.View r0 = r0.A0H
            r0.performLongClick()
        L_0x035c:
            com.whatsapp.calling.callgrid.view.PipViewContainer.A04(r3, r1)
            com.whatsapp.calling.callgrid.view.PipViewContainer.A01(r3)
            return
        L_0x0363:
            java.lang.Object r1 = r15.A00
            X.5pf r1 = (X.C119345pf) r1
            X.040 r0 = r1.A01
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r6 = r1.A00
            boolean r0 = X.C009403z.A04(r0)
            if (r0 == 0) goto L_0x0010
            X.6WJ r4 = r6.A06
            monitor-enter(r4)
            goto L_0x05fe
        L_0x0376:
            java.lang.Object r0 = r15.A00
            X.6sp r0 = (X.C144796sp) r0
            com.whatsapp.pytorch.WhatsAppDynamicPytorchLoader r0 = r0.A02
            goto L_0x04ae
        L_0x037e:
            java.lang.Object r3 = r15.A00
            X.4fp r3 = (X.C93124fp) r3
            X.1MK r0 = r3.A01
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x03a8
            goto L_0x055e
        L_0x038c:
            java.lang.Object r3 = r15.A00
            X.52p r3 = (X.C1029352p) r3
            android.graphics.Rect r2 = X.AnonymousClass001.A06()
            android.graphics.Rect r1 = X.AnonymousClass001.A06()
            com.whatsapp.TextEmojiLabel r0 = r3.A00
            r0.getGlobalVisibleRect(r2)
            com.whatsapp.WaTextView r3 = r3.A01
            r3.getGlobalVisibleRect(r1)
            boolean r0 = r2.intersect(r1)
            if (r0 == 0) goto L_0x055e
        L_0x03a8:
            r0 = 8
            goto L_0x055f
        L_0x03ac:
            java.lang.Object r2 = r15.A00
            com.whatsapp.calling.views.VoipCallFooter r2 = (com.whatsapp.calling.views.VoipCallFooter) r2
            android.view.View r1 = r2.A02
            r0 = 0
            r1.setVisibility(r0)
            r0 = 2131429556(0x7f0b08b4, float:1.8480788E38)
            android.widget.ImageButton r1 = X.C90514aH.A0T(r2, r0)
            r2.A03 = r1
            r0 = 1
            X.AnonymousClass3UE.A08(r1, r0)
            android.widget.ImageButton r1 = r2.A03
            android.view.View$OnClickListener r0 = r2.A00
            r1.setOnClickListener(r0)
            return
        L_0x03cb:
            java.lang.Object r0 = r15.A00
            X.70u r0 = (X.C1493370u) r0
            X.C1493370u.A04(r0)
            return
        L_0x03d3:
            java.lang.Object r4 = r15.A00
            X.6XP r4 = (X.AnonymousClass6XP) r4
            java.lang.String r0 = "options.wa_call_dummy_size"
            java.lang.Integer r14 = com.whatsapp.voipcalling.Voip.A04(r0)
            r8 = 0
            r7 = 0
            java.lang.String r3 = "voip-time-series-upload-fail"
            if (r14 != 0) goto L_0x03eb
            X.0wN r1 = r4.A01
            java.lang.String r0 = ":dummyFileSizeUndefined:"
            r1.A0E(r3, r0, r7)
            return
        L_0x03eb:
            X.0wG r0 = r4.A02
            android.content.Context r0 = r0.A00
            java.io.File r12 = X.C34681hT.A05(r0)
            r2 = 1024(0x400, float:1.435E-42)
            if (r12 != 0) goto L_0x0410
            X.0wN r2 = r4.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            int r0 = r14.intValue()
            int r0 = r0 * 1024
            r1.append(r0)
            java.lang.String r0 = ":voipDirectoryError:"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            r2.A0E(r3, r0, r7)
            return
        L_0x0410:
            java.lang.StringBuilder r13 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "dummy_"
            r13.append(r0)
            r11 = 6
            java.lang.StringBuilder r10 = X.AnonymousClass000.A0u()
            r9 = 0
        L_0x041f:
            double r5 = java.lang.Math.random()
            r0 = 62
            double r0 = (double) r0
            double r5 = r5 * r0
            int r1 = (int) r5
            java.lang.String r0 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
            X.C90514aH.A1R(r0, r10, r1)
            int r9 = r9 + 1
            if (r9 < r11) goto L_0x041f
            X.C36351kA.A1K(r10, r13)
            java.lang.String r0 = r13.toString()
            java.io.File r5 = X.C36441kJ.A0w(r12, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "app/VoiceService: putting dummy time series at "
            java.lang.String r0 = X.C90514aH.A0x(r5, r0, r1)
            X.C36321k7.A1a(r1, r0)
            byte[] r1 = new byte[r2]
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r0.nextBytes(r1)
            java.io.FileOutputStream r2 = X.C90524aI.A0W(r5)     // Catch:{ IOException -> 0x0474 }
        L_0x0457:
            int r0 = r14.intValue()     // Catch:{ all -> 0x046a }
            if (r7 >= r0) goto L_0x0463
            r2.write(r1)     // Catch:{ all -> 0x046a }
            int r7 = r7 + 1
            goto L_0x0457
        L_0x0463:
            r2.close()     // Catch:{ IOException -> 0x0474 }
            X.AnonymousClass6XP.A05(r4, r8, r5)
            return
        L_0x046a:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x046f }
            goto L_0x0473
        L_0x046f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0474 }
        L_0x0473:
            throw r1     // Catch:{ IOException -> 0x0474 }
        L_0x0474:
            r1 = move-exception
            java.lang.String r0 = "app/VoiceService: could not create dummy time series"
            com.whatsapp.util.Log.w(r0, r1)
            X.0wN r2 = r4.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            int r0 = r14.intValue()
            int r0 = r0 * 1024
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.append(r0)
            java.lang.String r0 = ":fileCreationError:"
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)
            r0 = 1
            r2.A0E(r3, r1, r0)
            return
        L_0x0498:
            java.lang.Object r1 = r15.A00
            X.5rG r1 = (X.C120285rG) r1
            monitor-enter(r1)
            java.util.LinkedList r0 = r1.A01     // Catch:{ all -> 0x04a7 }
            r0.clear()     // Catch:{ all -> 0x04a7 }
            r0 = 0
            r1.A00 = r0     // Catch:{ all -> 0x04a7 }
            monitor-exit(r1)     // Catch:{ all -> 0x04a7 }
            return
        L_0x04a7:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x04a7 }
            throw r0
        L_0x04aa:
            java.lang.Object r0 = r15.A00
            com.whatsapp.pytorch.WhatsAppDynamicPytorchLoader r0 = (com.whatsapp.pytorch.WhatsAppDynamicPytorchLoader) r0
        L_0x04ae:
            r0.A00()
            return
        L_0x04b2:
            java.lang.Object r0 = r15.A00
            X.6YM r0 = (X.AnonymousClass6YM) r0
            short r0 = r0.A1F
            com.whatsapp.voipcalling.Voip.adjustAudioLevel(r0)
            return
        L_0x04bc:
            java.lang.Object r0 = r15.A00
            X.6YM r0 = (X.AnonymousClass6YM) r0
            X.62n r1 = r0.A0w
            X.7gH r0 = r0.A0v
            goto L_0x04de
        L_0x04c5:
            java.lang.Object r0 = r15.A00
            android.media.SoundPool r0 = (android.media.SoundPool) r0
            r0.release()
            return
        L_0x04cd:
            java.lang.Object r1 = r15.A00
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            java.util.concurrent.atomic.AtomicInteger r0 = X.AnonymousClass6YM.A3X
            com.whatsapp.voipcalling.Voip.cancelInviteToGroupCall(r1)
            return
        L_0x04d7:
            java.lang.Object r0 = r15.A00
            X.6YM r0 = (X.AnonymousClass6YM) r0
            X.62n r1 = r0.A0w
            r0 = 0
        L_0x04de:
            r1.A00(r0)
            return
        L_0x04e2:
            java.lang.Object r0 = r15.A00
            X.6XR r0 = (X.AnonymousClass6XR) r0
            android.media.Ringtone r1 = r0.A01
            if (r1 == 0) goto L_0x04f3
            boolean r0 = r1.isPlaying()
            if (r0 != 0) goto L_0x04f3
            r1.play()
        L_0x04f3:
            java.lang.String r0 = "voip/ringtone/play complete"
            goto L_0x0514
        L_0x04f6:
            java.lang.Object r0 = r15.A00
            android.os.Vibrator r0 = (android.os.Vibrator) r0
            r0.cancel()
            java.lang.String r0 = "voip/vibrate/stop complete"
            goto L_0x0514
        L_0x0500:
            java.lang.Object r0 = r15.A00
            android.media.Ringtone r0 = (android.media.Ringtone) r0
            r0.stop()
            java.lang.String r0 = "voip/ringtone/stop complete"
            goto L_0x0514
        L_0x050a:
            java.lang.Object r1 = r15.A00
            android.media.AudioManager r1 = (android.media.AudioManager) r1
            r0 = 1
            r1.setMode(r0)
            java.lang.String r0 = "voip/ringtone/setmode complete"
        L_0x0514:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0518:
            java.lang.Object r1 = r15.A00
            X.4em r1 = (X.C92814em) r1
            com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel r0 = r1.A02
            if (r0 != 0) goto L_0x0527
            java.lang.String r0 = "audioChatViewModel"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0527:
            X.00s r3 = r0.A0E
            X.012 r2 = r1.A00
            if (r2 != 0) goto L_0x0534
            java.lang.String r0 = "lifeCycleOwner"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0534:
            r0 = 23
            X.5X0 r1 = X.AnonymousClass5X0.A02(r1, r0)
            r0 = 5
            X.C165177t0.A00(r2, r3, r1, r0)
            return
        L_0x053f:
            java.lang.Object r0 = r15.A00
            X.02E r0 = (X.AnonymousClass02E) r0
            com.whatsapp.calling.participantlist.ParticipantListBottomSheetDialog r2 = new com.whatsapp.calling.participantlist.ParticipantListBottomSheetDialog
            r2.<init>()
            X.01z r1 = r0.A0k()
            java.lang.String r0 = "ParticipantListBottomSheetDialog"
            r2.A1f(r1, r0)
            return
        L_0x0552:
            java.lang.Object r0 = r15.A00
            X.7qX r0 = (X.C163647qX) r0
            java.lang.Object r1 = r0.A00
            X.52X r1 = (X.AnonymousClass52X) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            android.view.View r3 = r1.A0E
        L_0x055e:
            r0 = 0
        L_0x055f:
            r3.setVisibility(r0)
            return
        L_0x0563:
            java.lang.Object r0 = r15.A00
            X.52q r0 = (X.C1029452q) r0
            r0.A0C()
            X.C1029452q.A01(r0)
            return
        L_0x056e:
            java.lang.Object r0 = r15.A00
            X.00S r0 = (X.AnonymousClass00S) r0
            r0.invoke()
            return
        L_0x0576:
            java.lang.Object r2 = r15.A00
            com.whatsapp.contact.picker.SelectedContactsList r2 = (com.whatsapp.contact.picker.SelectedContactsList) r2
            androidx.recyclerview.widget.RecyclerView r1 = r2.A05
            X.1vk r0 = r2.A07
            int r0 = r0.A0J()
            r1.A0i(r0)
            r2.A02()
            return
        L_0x0589:
            java.lang.Object r0 = r15.A00
            com.whatsapp.calling.callhistory.CallLogActivity r0 = (com.whatsapp.calling.callhistory.CallLogActivity) r0
            X.1nU r1 = r0.A0i
            X.3KV r0 = r0.A0O
            r1.A00 = r0
            r1.notifyDataSetChanged()
            return
        L_0x0597:
            java.lang.Object r1 = r15.A00
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r1 = (com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel) r1
            r0 = 0
            r1.A0B = r0
            X.5Fb r0 = r1.A0Q
            X.6OZ r0 = r0.A05()
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A0G(r0, r1)
            return
        L_0x05a8:
            java.lang.Object r0 = r15.A00
            com.whatsapp.calling.callgrid.view.PipViewContainer r0 = (com.whatsapp.calling.callgrid.view.PipViewContainer) r0
            com.whatsapp.calling.callgrid.view.PipViewContainer.A01(r0)
            return
        L_0x05b0:
            java.lang.Object r1 = r15.A00
            androidx.recyclerview.widget.StaggeredGridLayoutManager r1 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r1
            r0 = 3
            r1.A1Y(r0)
            return
        L_0x05b9:
            java.lang.Object r0 = r15.A00
            com.whatsapp.calling.callgrid.view.CallGrid r0 = (com.whatsapp.calling.callgrid.view.CallGrid) r0
            X.4mn r0 = r0.A05
            r0.A06()
            return
        L_0x05c3:
            java.lang.Object r0 = r15.A00
            X.5Fb r0 = (X.C105545Fb) r0
            java.util.Set r1 = r0.A0C
            r0 = 0
            com.whatsapp.jid.UserJid[] r0 = new com.whatsapp.jid.UserJid[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            com.whatsapp.jid.UserJid[] r0 = (com.whatsapp.jid.UserJid[]) r0
            com.whatsapp.voipcalling.Voip.updateParticipantsRxSubscription(r0)
            return
        L_0x05d6:
            java.lang.Object r0 = r15.A00
            X.6YM r0 = (X.AnonymousClass6YM) r0
            X.0v5 r0 = r0.A24
            r0.A02()
            java.lang.String r0 = "handleCommand"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x05e6:
            java.lang.String r0 = "networkResourcesManagerLazy"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x05ed:
            java.lang.String r0 = "prefs"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x05f4:
            java.lang.String r0 = "waContext"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x05fb:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x05fb }
            throw r0
        L_0x05fe:
            X.58r r5 = r4.A01     // Catch:{ all -> 0x0652 }
            if (r5 == 0) goto L_0x0649
            X.5TV r0 = X.AnonymousClass5TV.EFFECT_INITIALIZED     // Catch:{ all -> 0x0652 }
            boolean r0 = X.AnonymousClass6WJ.A03(r0, r5)     // Catch:{ all -> 0x0652 }
            if (r0 == 0) goto L_0x0649
            X.0wo r0 = r4.A02     // Catch:{ all -> 0x0652 }
            long r2 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x0652 }
            java.lang.Long r0 = r5.A0F     // Catch:{ all -> 0x0652 }
            if (r0 == 0) goto L_0x063f
            long r0 = r0.longValue()     // Catch:{ all -> 0x0652 }
            long r2 = r2 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0652 }
            r5.A0E = r0     // Catch:{ all -> 0x0652 }
            if (r0 == 0) goto L_0x063a
            java.lang.Long r0 = r5.A0B     // Catch:{ all -> 0x0652 }
            if (r0 == 0) goto L_0x0644
            long r0 = r0.longValue()     // Catch:{ all -> 0x0652 }
            long r2 = r2 - r0
            java.lang.Long r0 = r5.A09     // Catch:{ all -> 0x0652 }
            if (r0 == 0) goto L_0x0635
            java.lang.Long r0 = X.C90484aE.A0i(r0, r2)     // Catch:{ all -> 0x0652 }
            r5.A0A = r0     // Catch:{ all -> 0x0652 }
            goto L_0x0649
        L_0x0635:
            java.lang.IllegalStateException r0 = X.C36381kD.A0l()     // Catch:{ all -> 0x0652 }
            goto L_0x0648
        L_0x063a:
            java.lang.IllegalStateException r0 = X.C36381kD.A0l()     // Catch:{ all -> 0x0652 }
            goto L_0x0648
        L_0x063f:
            java.lang.IllegalStateException r0 = X.C36381kD.A0l()     // Catch:{ all -> 0x0652 }
            goto L_0x0648
        L_0x0644:
            java.lang.IllegalStateException r0 = X.C36381kD.A0l()     // Catch:{ all -> 0x0652 }
        L_0x0648:
            throw r0     // Catch:{ all -> 0x0652 }
        L_0x0649:
            monitor-exit(r4)
            X.1hi r1 = r6.A0F
            X.52O r0 = X.AnonymousClass52O.A00
            r1.A0D(r0)
            return
        L_0x0652:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1501574e.run():void");
    }

    public C1501574e(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
