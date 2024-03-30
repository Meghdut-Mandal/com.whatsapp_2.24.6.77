package X;

/* renamed from: X.3v4  reason: invalid class name and case insensitive filesystem */
public class C80233v4 implements Runnable {
    public Object A00;
    public final int A01;

    public C80233v4(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static C80233v4 A00(Object obj, int i) {
        return new C80233v4(obj, i);
    }

    public static void A01(C19770wU r1, Object obj, int i) {
        r1.Bp1(new C80233v4(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: X.8Yz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v27, resolved type: X.2IC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: X.8Yz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v29, resolved type: X.8Yz} */
    /* JADX WARNING: type inference failed for: r4v16, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0290, code lost:
        if (r1 != false) goto L_0x0292;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x047f, code lost:
        r7.A0C(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0482, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b9, code lost:
        r1.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00be, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x021a, code lost:
        r2.A0H(new X.C80273v8(r3, r4, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0222, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            int r0 = r14.A01
            switch(r0) {
                case 0: goto L_0x0239;
                case 1: goto L_0x0223;
                case 2: goto L_0x0005;
                case 3: goto L_0x0239;
                case 4: goto L_0x0223;
                case 5: goto L_0x0005;
                case 6: goto L_0x0649;
                case 7: goto L_0x063e;
                case 8: goto L_0x01f4;
                case 9: goto L_0x01a7;
                case 10: goto L_0x061f;
                case 11: goto L_0x0611;
                case 12: goto L_0x05ef;
                case 13: goto L_0x0022;
                case 14: goto L_0x05db;
                case 15: goto L_0x00f9;
                case 16: goto L_0x05cd;
                case 17: goto L_0x058b;
                case 18: goto L_0x0583;
                case 19: goto L_0x00d2;
                case 20: goto L_0x0572;
                case 21: goto L_0x04cf;
                case 22: goto L_0x04c7;
                case 23: goto L_0x04bf;
                case 24: goto L_0x04b7;
                case 25: goto L_0x04a3;
                case 26: goto L_0x00bf;
                case 27: goto L_0x049b;
                case 28: goto L_0x048f;
                case 29: goto L_0x0483;
                case 30: goto L_0x045e;
                case 31: goto L_0x043b;
                case 32: goto L_0x03f6;
                case 33: goto L_0x0396;
                case 34: goto L_0x0383;
                case 35: goto L_0x0379;
                case 36: goto L_0x00a1;
                case 37: goto L_0x007c;
                case 38: goto L_0x0304;
                case 39: goto L_0x02f8;
                case 40: goto L_0x02ec;
                case 41: goto L_0x0068;
                case 42: goto L_0x02e3;
                case 43: goto L_0x02db;
                case 44: goto L_0x02d3;
                case 45: goto L_0x02ab;
                case 46: goto L_0x001a;
                case 47: goto L_0x0273;
                case 48: goto L_0x0263;
                case 49: goto L_0x0257;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r14.A00
            X.2IR r1 = (X.AnonymousClass2IR) r1
            X.3T1 r0 = r1.getFMessage()
            X.3Qa r0 = r0.A1J
            X.11F r0 = r0.A00
            if (r0 == 0) goto L_0x0019
            r1.getFMessage()
            X.AnonymousClass2IR.A0c(r1)
        L_0x0019:
            return
        L_0x001a:
            java.lang.Object r0 = r14.A00
            X.3fk r0 = (X.C70803fk) r0
            android.widget.FrameLayout r1 = r0.A0Z
            goto L_0x00b9
        L_0x0022:
            java.lang.Object r3 = r14.A00
            X.2IC r3 = (X.AnonymousClass2IC) r3
            java.util.List r0 = r3.A08
            X.0wP r5 = r3.A03
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.util.Iterator r6 = r0.iterator()     // Catch:{ RuntimeException -> 0x0057 }
        L_0x0032:
            boolean r0 = r6.hasNext()     // Catch:{ RuntimeException -> 0x0057 }
            if (r0 == 0) goto L_0x0062
            X.2bU r2 = X.C36441kJ.A0r(r6)     // Catch:{ RuntimeException -> 0x0057 }
            int r1 = r2.A1I     // Catch:{ RuntimeException -> 0x0057 }
            r0 = 3
            if (r1 == r0) goto L_0x0032
            X.3Qj r0 = r2.A01     // Catch:{ RuntimeException -> 0x0057 }
            if (r0 == 0) goto L_0x0032
            java.io.File r0 = r0.A0I     // Catch:{ RuntimeException -> 0x0057 }
            if (r0 == 0) goto L_0x0032
            android.net.Uri r1 = android.net.Uri.fromFile(r0)     // Catch:{ RuntimeException -> 0x0057 }
            boolean r0 = X.C36381kD.A1V(r1)     // Catch:{ RuntimeException -> 0x0057 }
            if (r0 == 0) goto L_0x0032
            r4.add(r1)     // Catch:{ RuntimeException -> 0x0057 }
            goto L_0x0032
        L_0x0057:
            r0 = move-exception
            java.lang.String r2 = r0.toString()
            r1 = 0
            java.lang.String r0 = "FMessageUtil/getDownloadedImagesUrisFromAlbum"
            r5.A0E(r0, r2, r1)
        L_0x0062:
            X.17Y r2 = r3.A0R
            r1 = 46
            goto L_0x021a
        L_0x0068:
            java.lang.Object r1 = r14.A00
            X.3t2 r1 = (X.C79013t2) r1
            X.12P r0 = r1.A01
            r0.A06()
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x0019
            X.3Qi r1 = r1.A00
            r0 = 1
            r1.A04(r0)
            return
        L_0x007c:
            java.lang.Object r6 = r14.A00
            com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity r6 = (com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity) r6
            android.widget.BaseAdapter r0 = r6.A01
            r0.notifyDataSetChanged()
            android.widget.ListView r0 = r6.A02
            java.lang.Runnable r5 = r6.A0W
            r0.removeCallbacks(r5)
            long r3 = r6.A00
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0019
            android.widget.ListView r2 = r6.A02
            long r0 = X.C36401kF.A03(r3)
            r2.postDelayed(r5, r0)
            return
        L_0x00a1:
            java.lang.Object r0 = r14.A00
            X.4VS r0 = (X.AnonymousClass4VS) r0
            java.lang.Object r1 = r0.A00
            X.3Ry r1 = (X.C65413Ry) r1
            X.C65413Ry.A00(r1)
            X.3D7 r0 = r1.A02
            com.whatsapp.conversation.conversationrow.InteractiveMessageView r0 = r0.A00
            com.whatsapp.conversation.conversationrow.InteractiveMessageView.A01(r0)
            X.31F r0 = r1.A01
            if (r0 == 0) goto L_0x0019
            android.view.View r1 = r0.A00
        L_0x00b9:
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x00bf:
            java.lang.Object r1 = r14.A00
            com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity r1 = (com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity) r1
            X.3J6 r0 = r1.A0K
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0019
            X.3J6 r1 = r1.A0K
            r0 = 1
            r1.A01(r0)
            return
        L_0x00d2:
            java.lang.Object r4 = r14.A00
            X.2IS r4 = (X.AnonymousClass2IS) r4
            X.3T1 r0 = r4.getFMessage()
            X.3Qa r0 = r0.A1J
            X.11F r3 = r0.A00
            boolean r0 = r3 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0019
            r2 = 0
            android.content.Context r1 = r4.getContext()
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            java.lang.Integer r0 = X.C36401kF.A0k()
            android.content.Intent r1 = X.C36431kI.A0E(r1, r3, r0)
            android.content.Context r0 = r4.getContext()
            X.C05290Pd.A00(r0, r1, r2)
            return
        L_0x00f9:
            java.lang.Object r1 = r14.A00
            X.2ke r1 = (X.C50372ke) r1
            r5 = 0
            X.AnonymousClass00C.A0D(r1, r5)
            X.3Qd r0 = r1.A00
            X.3I8 r7 = r0.A03
            if (r7 == 0) goto L_0x0019
            X.2cZ r8 = r7.A01
            X.3Hc r4 = r1.A04
            android.view.ViewGroup r6 = r1.A02
            android.app.Activity r3 = X.C36361kB.A06(r6)
            X.3Qd r0 = r1.A00
            boolean r0 = r0.A06
            r2 = 1
            r0 = r0 ^ 1
            X.38r r8 = r4.A00(r3, r8, r2, r0)
            if (r8 != 0) goto L_0x012a
            X.3Qd r2 = r1.A00
            X.2oT r0 = X.C51842oT.FAILED
            X.3Qd r5 = X.C64963Qd.A00(r0, r2)
        L_0x0126:
            X.C50372ke.A02(r1, r5)
            return
        L_0x012a:
            X.3Qd r0 = r1.A00
            boolean r0 = r0.A06
            X.3Qq r4 = r8.A03
            r4.A0V(r0)
            X.3Qd r0 = r1.A00
            int r0 = r0.A00
            r4.A0M(r0)
            r4.A09 = r2
            r4.A0A = r2
            int r0 = r7.A00
            r4.A0N(r0)
            X.31D r0 = new X.31D
            r0.<init>(r1)
            r8.A00 = r0
            X.3Qy r0 = new X.3Qy
            r0.<init>(r1, r5)
            r8.A01 = r0
            X.4XB r0 = new X.4XB
            r0.<init>(r1, r8, r2)
            r4.A0R(r0)
            r6.removeAllViews()
            android.view.View r3 = r4.A08()
            if (r3 == 0) goto L_0x017d
            android.view.ViewParent r2 = r3.getParent()
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0171
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 == 0) goto L_0x0171
            r2.removeAllViews()
        L_0x0171:
            r6.setVisibility(r5)
            r2 = -1
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r2, r2)
            r6.addView(r3, r0)
        L_0x017d:
            boolean r0 = r4.A0c()
            if (r0 == 0) goto L_0x01a3
            r4.A0I()
        L_0x0186:
            X.3Qd r0 = r1.A00
            int r0 = r0.A01
            r4.A0P(r5, r0)
            X.3Qd r0 = r1.A00
            X.3I8 r6 = r0.A03
            boolean r12 = r0.A07
            int r9 = r0.A02
            boolean r13 = r0.A06
            X.2oT r7 = r0.A04
            int r10 = r0.A01
            int r11 = r0.A00
            X.3Qd r5 = new X.3Qd
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0126
        L_0x01a3:
            r4.A0F()
            goto L_0x0186
        L_0x01a7:
            java.lang.Object r4 = r14.A00
            X.3Yp r4 = (X.C67123Yp) r4
            java.lang.Object r3 = r4.A02
            X.11F r3 = (X.AnonymousClass11F) r3
            boolean r0 = X.C197029b1.A00(r3)
            if (r0 == 0) goto L_0x0019
            r2 = 0
            boolean r0 = r3 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x01d7
            java.lang.Object r1 = r4.A01
            X.1HX r1 = (X.AnonymousClass1HX) r1
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            r0 = 0
            X.AnonymousClass00C.A0D(r3, r0)
            X.005 r0 = r1.A04
            java.lang.Object r0 = r0.get()
            X.6BB r0 = (X.AnonymousClass6BB) r0
            X.6E1 r0 = r0.A00(r3)
            if (r0 == 0) goto L_0x01d7
            java.lang.String r0 = r0.A08
            if (r0 == 0) goto L_0x01d7
            r2 = r0
        L_0x01d7:
            X.2Qh r1 = new X.2Qh
            r1.<init>()
            r0 = 31
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            r1.A04 = r2
            java.lang.Integer r0 = X.C36371kC.A0o()
            r1.A02 = r0
            java.lang.Object r0 = r4.A06
            X.0yW r0 = (X.C21010yW) r0
            r0.Bly(r1)
            return
        L_0x01f4:
            java.lang.Object r3 = r14.A00
            X.8Yz r3 = (X.C174928Yz) r3
            java.util.ArrayList r1 = r3.A0a
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0019
            java.lang.Object r1 = X.C36441kJ.A12(r1)
            X.11F r1 = (X.AnonymousClass11F) r1
            if (r1 == 0) goto L_0x0019
            X.16D r0 = r3.A0l
            X.141 r4 = r0.A08(r1)
            if (r4 == 0) goto L_0x0019
            boolean r0 = r4.A0E()
            if (r0 == 0) goto L_0x0019
            X.17Y r2 = r3.A0R
            r1 = 42
        L_0x021a:
            X.3v8 r0 = new X.3v8
            r0.<init>(r3, r4, r1)
            r2.A0H(r0)
            return
        L_0x0223:
            java.lang.Object r1 = r14.A00
            X.2IR r1 = (X.AnonymousClass2IR) r1
            X.3T1 r0 = r1.getFMessage()
            X.3Qa r0 = r0.A1J
            X.11F r0 = r0.A00
            if (r0 == 0) goto L_0x0019
            X.3T1 r0 = r1.getFMessage()
            r1.A1x(r0)
            return
        L_0x0239:
            java.lang.Object r2 = r14.A00
            X.2IR r2 = (X.AnonymousClass2IR) r2
            X.3T1 r0 = r2.getFMessage()
            X.3Qa r0 = r0.A1J
            X.11F r0 = r0.A00
            if (r0 == 0) goto L_0x0019
            X.3T1 r0 = r2.getFMessage()
            X.3Qa r0 = r0.A1J
            X.11F r1 = r0.A00
            X.4Uq r0 = r2.getMessageReactions()
            r2.A1t(r0, r1)
            return
        L_0x0257:
            java.lang.Object r1 = r14.A00
            X.3fk r1 = (X.C70803fk) r1
            r0 = 1
            X.C70803fk.A1N(r1, r0)
            r0 = 0
            r1.A06 = r0
            return
        L_0x0263:
            java.lang.Object r1 = r14.A00
            X.3fk r1 = (X.C70803fk) r1
            r0 = -1
            r1.A06 = r0
            r0 = 1
            int r0 = r1.A1i(r0)
            r1.A23(r0)
            return
        L_0x0273:
            java.lang.Object r3 = r14.A00
            X.3fk r3 = (X.C70803fk) r3
            X.3AV r1 = r3.A2k
            X.11F r2 = r3.A45
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            X.1e8 r1 = r1.A03
            com.whatsapp.jid.UserJid r0 = X.C36401kF.A0b(r2)
            java.util.List r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x0292
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x0293
        L_0x0292:
            r0 = 1
        L_0x0293:
            r0 = r0 ^ 1
            X.17Y r2 = r3.A1U
            if (r0 == 0) goto L_0x02a3
            r0 = 46
            X.3v4 r1 = A00(r3, r0)
        L_0x029f:
            r2.A0H(r1)
            return
        L_0x02a3:
            r0 = 22
            X.3wT r1 = new X.3wT
            r1.<init>((X.C70803fk) r3, (int) r0)
            goto L_0x029f
        L_0x02ab:
            java.lang.Object r3 = r14.A00
            X.3fk r3 = (X.C70803fk) r3
            X.1X4 r2 = r3.A1f
            X.11F r1 = r3.A45
            r0 = 1
            r2.A0P(r1, r0)
            X.12O r1 = r3.A3Z
            X.11F r0 = r3.A45
            com.whatsapp.jid.PhoneUserJid r0 = (com.whatsapp.jid.PhoneUserJid) r0
            X.13w r2 = r1.A09(r0)
            X.190 r1 = r3.A76
            X.155 r0 = X.C70803fk.A0C(r3)
            android.content.Intent r1 = X.C36391kE.A0F(r0, r1, r2)
            X.155 r0 = X.C70803fk.A0C(r3)
            r0.startActivity(r1)
            return
        L_0x02d3:
            java.lang.Object r0 = r14.A00
            X.3fk r0 = (X.C70803fk) r0
            r0.A1m()
            return
        L_0x02db:
            java.lang.Object r0 = r14.A00
            X.3ez r0 = (X.C70333ez) r0
            r0.Bdr()
            return
        L_0x02e3:
            java.lang.Object r1 = r14.A00
            com.whatsapp.conversation.ConversationListView r1 = (com.whatsapp.conversation.ConversationListView) r1
            r0 = 1
            r1.A0A(r0)
            return
        L_0x02ec:
            java.lang.Object r0 = r14.A00
            X.3Gh r0 = (X.C62473Gh) r0
            X.16J r1 = r0.A02
            X.191 r0 = r0.A01
            r1.unregisterObserver(r0)
            return
        L_0x02f8:
            java.lang.Object r2 = r14.A00
            com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity r2 = (com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity) r2
            X.0yf r1 = r2.A06
            X.3T1 r0 = r2.A0P
            com.whatsapp.conversation.conversationrow.googlesearch.GoogleSearchDialogFragment.A03(r2, r1, r0)
            return
        L_0x0304:
            java.lang.Object r3 = r14.A00
            com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity r3 = (com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity) r3
            X.3OM r4 = new X.3OM
            r4.<init>(r3)
            java.lang.Boolean r0 = X.C36371kC.A0m()
            r4.A09 = r0
            X.0v5 r1 = r3.A03
            boolean r0 = r1.A05()
            r5 = 0
            if (r0 == 0) goto L_0x0326
            r1.A02()
            java.lang.String r0 = "isEligible"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0326:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r4.A0J = r0
            X.3T1 r0 = r3.A0P
            X.3Qa r1 = r0.A1J
            X.11F r0 = r1.A00
            r4.A01 = r0
            java.util.List r0 = java.util.Collections.singletonList(r1)
            r4.A0b = r0
            X.3T1 r0 = r3.A0P
            int r0 = r0.A1I
            X.AnonymousClass3OM.A03(r4, r0)
            X.3T1 r2 = r3.A0P
            int r1 = r2.A1I
            r0 = 3
            if (r1 != r0) goto L_0x0376
            X.2bU r2 = (X.AnonymousClass2bU) r2
            int r0 = r2.A0B
            long r0 = X.C36371kC.A07(r0)
        L_0x0350:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A0T = r0
            X.3T1 r1 = r3.A0P
            int r0 = r1.A1I
            if (r0 != 0) goto L_0x0367
            java.lang.String r0 = r1.A0b()
            X.C18740tg.A06(r0)
            int r5 = r0.length()
        L_0x0367:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r4.A0R = r0
            android.content.Intent r1 = X.AnonymousClass3OM.A00(r4)
            r0 = 2
            r3.startActivityForResult(r1, r0)
            return
        L_0x0376:
            r0 = 0
            goto L_0x0350
        L_0x0379:
            java.lang.Object r0 = r14.A00
            X.3Ry r0 = (X.C65413Ry) r0
            android.os.CountDownTimer r0 = r0.A00
            r0.start()
            return
        L_0x0383:
            java.lang.Object r1 = r14.A00
            X.1tR r1 = (X.C39731tR) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.00r r7 = r1.A00
            java.lang.String r0 = "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.Unit>"
            X.AnonymousClass00C.A0E(r7, r0)
            X.0AJ r2 = X.AnonymousClass0AJ.A00
            goto L_0x047f
        L_0x0396:
            java.lang.Object r7 = r14.A00
            X.1t5 r7 = (X.C39641t5) r7
            r6 = 0
            X.AnonymousClass00C.A0D(r7, r6)
            X.16D r9 = r7.A02
            X.147 r8 = r7.A05
            X.141 r1 = r9.A0D(r8)
            X.11F r0 = r7.A04
            if (r0 == 0) goto L_0x03d8
            X.141 r0 = r9.A0D(r0)
            X.3IL r0 = r0.A0F
            boolean r5 = X.AnonymousClass000.A1V(r0)
        L_0x03b4:
            com.whatsapp.jid.UserJid r2 = r1.A0I
            java.lang.String r0 = r1.A0V
            r1 = 0
            if (r0 == 0) goto L_0x03d6
            java.lang.Long r4 = X.C36431kI.A15(r0)
        L_0x03bf:
            X.0wQ r0 = r7.A01
            boolean r0 = r0.A0M(r2)
            java.lang.String r3 = "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<com.whatsapp.conversation.conversationrow.components.contextcard.GroupNonCreatorContextCardSubtitleViewModel.SubtitleUiState>"
            if (r0 == 0) goto L_0x03da
            X.00r r7 = r7.A00
            X.AnonymousClass00C.A0E(r7, r3)
            r0 = 1
            X.3Je r2 = new X.3Je
            r2.<init>(r4, r1, r5, r0)
            goto L_0x047f
        L_0x03d6:
            r4 = r1
            goto L_0x03bf
        L_0x03d8:
            r5 = 1
            goto L_0x03b4
        L_0x03da:
            if (r2 == 0) goto L_0x03ea
            X.141 r2 = r9.A0D(r2)
            X.171 r1 = r7.A03
            int r0 = r1.A09(r8)
            java.lang.String r1 = r1.A0R(r2, r0, r6)
        L_0x03ea:
            X.00r r7 = r7.A00
            X.AnonymousClass00C.A0E(r7, r3)
            X.3Je r2 = new X.3Je
            r2.<init>(r4, r1, r5, r6)
            goto L_0x047f
        L_0x03f6:
            java.lang.Object r3 = r14.A00
            X.1tX r3 = (X.C39761tX) r3
            r0 = 0
            X.AnonymousClass00C.A0D(r3, r0)
            X.16D r0 = r3.A01
            X.147 r2 = r3.A03
            X.141 r0 = r0.A0D(r2)
            X.3QL r0 = r0.A0K
            if (r0 == 0) goto L_0x0426
            java.lang.String r1 = r0.A03
            if (r1 == 0) goto L_0x0426
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0426
            X.2nt r0 = X.C51482nt.SHOW_DESCRIPTION
            X.3IB r2 = new X.3IB
            r2.<init>(r0, r1)
        L_0x041b:
            X.00r r1 = r3.A00
            java.lang.String r0 = "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<com.whatsapp.conversation.conversationrow.components.contextcard.GroupDescriptionContextCardBodyViewModel.UiState>"
            X.AnonymousClass00C.A0E(r1, r0)
            r1.A0C(r2)
            return
        L_0x0426:
            X.17X r0 = r3.A02
            boolean r0 = r0.A0C(r2)
            if (r0 == 0) goto L_0x0438
            X.2nt r1 = X.C51482nt.ADD_DESCRIPTION
        L_0x0430:
            java.lang.String r0 = ""
            X.3IB r2 = new X.3IB
            r2.<init>(r1, r0)
            goto L_0x041b
        L_0x0438:
            X.2nt r1 = X.C51482nt.NONE
            goto L_0x0430
        L_0x043b:
            java.lang.Object r2 = r14.A00
            com.whatsapp.conversation.conversationrow.components.contextcard.GroupDescriptionAddUpsellContextCardBodyViewModel r2 = (com.whatsapp.conversation.conversationrow.components.contextcard.GroupDescriptionAddUpsellContextCardBodyViewModel) r2
            X.16D r1 = r2.A02
            X.147 r0 = r2.A03
            X.141 r1 = r1.A0D(r0)
            X.00r r7 = r2.A00
            java.lang.String r0 = "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<com.whatsapp.conversation.conversationrow.components.contextcard.GroupDescriptionAddUpsellContextCardBodyViewModel.DialogUiState>"
            X.AnonymousClass00C.A0E(r7, r0)
            X.3QL r0 = r1.A0K
            if (r0 == 0) goto L_0x0456
            java.lang.String r0 = r0.A03
            if (r0 != 0) goto L_0x0458
        L_0x0456:
            java.lang.String r0 = ""
        L_0x0458:
            X.3HS r2 = new X.3HS
            r2.<init>(r0)
            goto L_0x047f
        L_0x045e:
            java.lang.Object r2 = r14.A00
            X.1tW r2 = (X.C39751tW) r2
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            X.16D r0 = r2.A01
            X.147 r1 = r2.A03
            r0.A0D(r1)
            X.17r r0 = r2.A02
            int r1 = r0.A0A(r1)
            X.00r r7 = r2.A00
            java.lang.String r0 = "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<com.whatsapp.conversation.conversationrow.components.contextcard.GroupCreatorContextCardSubtitleViewModel.SubtitleUiState>"
            X.AnonymousClass00C.A0E(r7, r0)
            X.3HR r2 = new X.3HR
            r2.<init>(r1)
        L_0x047f:
            r7.A0C(r2)
            return
        L_0x0483:
            java.lang.Object r1 = r14.A00
            X.1uA r1 = (X.C39891uA) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.C39891uA.A01(r1)
            return
        L_0x048f:
            java.lang.Object r1 = r14.A00
            X.1u8 r1 = (X.AnonymousClass1u8) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.AnonymousClass1u8.A01(r1)
            return
        L_0x049b:
            java.lang.Object r0 = r14.A00
            X.00S r0 = (X.AnonymousClass00S) r0
            r0.invoke()
            return
        L_0x04a3:
            java.lang.Object r1 = r14.A00
            X.394 r1 = (X.AnonymousClass394) r1
            java.lang.Runnable r0 = r1.A04
            r0.run()
            android.os.Handler r3 = r1.A03
            java.lang.Runnable r2 = r1.A00
            int r0 = r1.A02
            long r0 = (long) r0
            r3.postDelayed(r2, r0)
            return
        L_0x04b7:
            java.lang.Object r0 = r14.A00
            com.whatsapp.conversation.conversationrow.MediaTimeDisplay r0 = (com.whatsapp.conversation.conversationrow.MediaTimeDisplay) r0
            com.whatsapp.conversation.conversationrow.MediaTimeDisplay.A01(r0)
            return
        L_0x04bf:
            java.lang.Object r1 = r14.A00
            X.3fI r1 = (X.C70523fI) r1
            r0 = 0
            r1.A0v = r0
            return
        L_0x04c7:
            java.lang.Object r1 = r14.A00
            X.2Hp r1 = (X.C43442Hp) r1
            r0 = 0
            r1.A00 = r0
            return
        L_0x04cf:
            java.lang.Object r7 = r14.A00
            X.3Pi r7 = (X.C64763Pi) r7
            X.8o3 r8 = r7.A0D
            X.38r r0 = r7.A00
            if (r0 != 0) goto L_0x054c
            X.3Hc r2 = r7.A0E
            X.2IQ r0 = r7.A0A
            android.app.Activity r0 = X.C36361kB.A06(r0)
            r1 = 0
            X.38r r0 = r2.A00(r0, r8, r1, r1)
            r7.A00 = r0
            if (r0 == 0) goto L_0x054c
            r7.A03 = r1
            r1 = 1
            X.3Qq r0 = r0.A03
            r0.A0V(r1)
            X.38r r5 = r7.A00
            X.3Qq r4 = r5.A03
            r2 = 1
            r4.A09 = r1
            r1 = 2
            X.4XB r0 = new X.4XB
            r0.<init>(r7, r8, r1)
            r4.A0R(r0)
            r3 = 1
            X.3Qy r0 = new X.3Qy
            r0.<init>(r7, r2)
            r5.A01 = r0
            r4.A0A = r2
            r0 = 3
            r4.A0N(r0)
            android.widget.FrameLayout r6 = r7.A06
            r6.removeAllViews()
            X.38r r0 = r7.A00
            if (r0 == 0) goto L_0x054c
            X.3Qq r0 = r0.A03
            android.view.View r2 = r0.A08()
            if (r2 == 0) goto L_0x054c
            android.view.ViewParent r0 = r2.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L_0x052c
            r0.removeAllViews()
        L_0x052c:
            r1 = -1
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r1, r1)
            r6.addView(r2, r0)
            android.content.Context r5 = r6.getContext()
            r4 = 2131895644(0x7f12255c, float:1.9426127E38)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            X.0ts r2 = r7.A0C
            int r0 = r8.A0B
            r1 = 0
            java.lang.String r0 = X.AnonymousClass3UY.A03(r2, r0, r1)
            r3[r1] = r0
            X.C36371kC.A14(r5, r6, r3, r4)
        L_0x054c:
            X.38r r0 = r7.A00
            if (r0 == 0) goto L_0x0568
            X.3Qq r2 = r0.A03
            boolean r0 = r2.A0c()
            r1 = 1
            if (r0 == 0) goto L_0x056c
            int r0 = r2.A06()
            if (r0 != r1) goto L_0x0561
            r7.A03 = r1
        L_0x0561:
            X.38r r0 = r7.A00
            X.3Qq r0 = r0.A03
            r0.A0I()
        L_0x0568:
            r0 = 0
            r7.A02 = r0
            return
        L_0x056c:
            r7.A03 = r1
            r2.A0C()
            goto L_0x0568
        L_0x0572:
            java.lang.Object r1 = r14.A00
            X.3Pi r1 = (X.C64763Pi) r1
            X.38r r0 = r1.A00
            if (r0 == 0) goto L_0x057f
            X.3Qq r0 = r0.A03
            r0.A0J()
        L_0x057f:
            r0 = 0
            r1.A01 = r0
            return
        L_0x0583:
            java.lang.Object r0 = r14.A00
            X.2IQ r0 = (X.AnonymousClass2IQ) r0
            r0.A2J()
            return
        L_0x058b:
            java.lang.Object r7 = r14.A00
            X.2He r7 = (X.C43352He) r7
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()
            java.util.ArrayList r0 = r7.A03
            java.util.Iterator r9 = r0.iterator()
        L_0x0599:
            boolean r0 = r9.hasNext()
            r2 = 4
            if (r0 == 0) goto L_0x05bd
            java.lang.Object r6 = r9.next()
            X.2bV r6 = (X.AnonymousClass2bV) r6
            int r0 = r6.A01
            if (r0 != r2) goto L_0x0599
            long r4 = r6.A0G
            X.0wo r0 = r7.A19
            long r2 = X.C19970wo.A00(r0)
            r0 = 30000(0x7530, double:1.4822E-319)
            long r2 = r2 - r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0599
            r8.add(r6)
            goto L_0x0599
        L_0x05bd:
            X.0xM r1 = r7.A1D
            java.util.List r0 = X.C007103b.A0Y(r8)
            r1.A0u(r0, r2)
            r0 = 0
            r7.A04 = r0
            r7.A2G()
            return
        L_0x05cd:
            java.lang.Object r0 = r14.A00
            X.2IQ r0 = (X.AnonymousClass2IQ) r0
            X.1JN r1 = r0.A1d
            X.2bU r0 = r0.getFMessage()
            r1.A02(r0)
            return
        L_0x05db:
            java.lang.Object r2 = r14.A00
            X.2ke r2 = (X.C50372ke) r2
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            X.3Qd r1 = r2.A00
            X.2oT r0 = X.C51842oT.INITIALIZED
            X.3Qd r0 = X.C64963Qd.A00(r0, r1)
            X.C50372ke.A02(r2, r0)
            return
        L_0x05ef:
            java.lang.Object r3 = r14.A00
            X.2I9 r3 = (X.AnonymousClass2I9) r3
            X.3T1 r2 = r3.A0K
            X.2bU r2 = (X.AnonymousClass2bU) r2
            X.2cZ r2 = (X.C47002cZ) r2
            X.AnonymousClass2I9.A0E(r3)
            X.3Pr r0 = r3.A0C
            if (r0 == 0) goto L_0x060d
            int r1 = r0.A01(r2)
        L_0x0604:
            X.2ke r0 = r3.A0D
            r0.A0e(r2, r1)
            r0.A0C()
            return
        L_0x060d:
            r1 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0604
        L_0x0611:
            java.lang.Object r1 = r14.A00
            X.2I9 r1 = (X.AnonymousClass2I9) r1
            X.3T1 r0 = r1.A0K
            X.2bU r0 = (X.AnonymousClass2bU) r0
            X.8o2 r0 = (X.C181788o2) r0
            X.AnonymousClass2I9.A0F(r1, r0)
            return
        L_0x061f:
            java.lang.Object r1 = r14.A00
            X.2I3 r1 = (X.AnonymousClass2I3) r1
            r5 = 0
            r0 = 4
            X.AnonymousClass2I3.A0B(r1, r5, r0)
            X.141 r0 = r1.A03
            com.whatsapp.jid.UserJid r4 = X.C36351kA.A0k(r0)
            X.155 r3 = r1.A0C
            java.lang.Integer r2 = X.C36361kB.A0j()
            r1 = 0
            r0 = 1
            android.content.Intent r0 = X.AnonymousClass190.A0w(r3, r4, r2, r0, r1)
            X.C05290Pd.A00(r3, r0, r5)
            return
        L_0x063e:
            java.lang.Object r0 = r14.A00
            X.1uY r0 = (X.C40011uY) r0
            X.00s r1 = r0.A04
            r0 = 1
            X.C36341k9.A18(r1, r0)
            return
        L_0x0649:
            java.lang.Object r0 = r14.A00
            X.2IR r0 = (X.AnonymousClass2IR) r0
            r0.A1Y()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80233v4.run():void");
    }
}
