package X;

/* renamed from: X.3v3  reason: invalid class name and case insensitive filesystem */
public class C80223v3 implements Runnable {
    public Object A00;
    public final int A01;

    public C80223v3(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static C80223v3 A00(Object obj, int i) {
        return new C80223v3(obj, i);
    }

    public static void A01(C19930wk r1, Object obj, int i) {
        r1.execute(new C80223v3(obj, i));
    }

    public static void A02(C19770wU r1, Object obj, int i) {
        r1.Boy(new C80223v3(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0064, code lost:
        r1.A01 = java.lang.Integer.valueOf(r0);
        r2.A02.Bly(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x03ca, code lost:
        r0 = r0.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03cc, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:?, code lost:
        r6 = X.AnonymousClass1NM.A00(r5);
        r4 = X.AnonymousClass000.A0q("_actions", X.AnonymousClass000.A0v(r0.getRawString()));
        X.C36341k9.A0x(r6.edit(), r4, java.lang.Long.toString(X.AnonymousClass6R8.A01(r6.getString(r4, "0"), 0) + 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x03f9, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x03fa, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x042e, code lost:
        r0.requestLayout();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0431, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0141, code lost:
        if (r4.A09.A0M(r2.A0M.A0E) == false) goto L_0x0143;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            int r0 = r8.A01
            switch(r0) {
                case 0: goto L_0x02de;
                case 1: goto L_0x0011;
                case 2: goto L_0x0026;
                case 3: goto L_0x003b;
                case 4: goto L_0x0050;
                case 5: goto L_0x0005;
                case 6: goto L_0x0005;
                case 7: goto L_0x02f7;
                case 8: goto L_0x0301;
                case 9: goto L_0x0316;
                case 10: goto L_0x0331;
                case 11: goto L_0x033c;
                case 12: goto L_0x0070;
                case 13: goto L_0x0344;
                case 14: goto L_0x034a;
                case 15: goto L_0x03fe;
                case 16: goto L_0x0352;
                case 17: goto L_0x0093;
                case 18: goto L_0x00b9;
                case 19: goto L_0x036b;
                case 20: goto L_0x03fe;
                case 21: goto L_0x0120;
                case 22: goto L_0x0376;
                case 23: goto L_0x0156;
                case 24: goto L_0x037e;
                case 25: goto L_0x0193;
                case 26: goto L_0x01c9;
                case 27: goto L_0x0386;
                case 28: goto L_0x01e4;
                case 29: goto L_0x0207;
                case 30: goto L_0x0392;
                case 31: goto L_0x039a;
                case 32: goto L_0x03a1;
                case 33: goto L_0x03af;
                case 34: goto L_0x03c4;
                case 35: goto L_0x03fe;
                case 36: goto L_0x0406;
                case 37: goto L_0x0411;
                case 38: goto L_0x0418;
                case 39: goto L_0x0420;
                case 40: goto L_0x0222;
                case 41: goto L_0x0428;
                case 42: goto L_0x0432;
                case 43: goto L_0x0257;
                case 44: goto L_0x0276;
                case 45: goto L_0x043a;
                case 46: goto L_0x0447;
                case 47: goto L_0x02ce;
                case 48: goto L_0x046a;
                case 49: goto L_0x0484;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r8.A00
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            r1.hide()
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r2 = r8.A00
            X.6W1 r2 = (X.AnonymousClass6W1) r2
            java.lang.String r0 = "onSearchBarOpened"
            X.2RF r1 = X.AnonymousClass6W1.A00(r2, r0)
            if (r1 == 0) goto L_0x0010
            java.lang.Integer r0 = X.C36381kD.A0n()
            r1.A02 = r0
            r0 = 15
            goto L_0x0064
        L_0x0026:
            java.lang.Object r2 = r8.A00
            X.6W1 r2 = (X.AnonymousClass6W1) r2
            java.lang.String r0 = "onInviteCanceled"
            X.2RF r1 = X.AnonymousClass6W1.A00(r2, r0)
            if (r1 == 0) goto L_0x0010
            java.lang.Integer r0 = X.C36381kD.A0n()
            r1.A02 = r0
            r0 = 17
            goto L_0x0064
        L_0x003b:
            java.lang.Object r2 = r8.A00
            X.6W1 r2 = (X.AnonymousClass6W1) r2
            java.lang.String r0 = "onBackPressed"
            X.2RF r1 = X.AnonymousClass6W1.A00(r2, r0)
            if (r1 == 0) goto L_0x0010
            java.lang.Integer r0 = X.C36381kD.A0n()
            r1.A02 = r0
            r0 = 18
            goto L_0x0064
        L_0x0050:
            java.lang.Object r2 = r8.A00
            X.6W1 r2 = (X.AnonymousClass6W1) r2
            java.lang.String r0 = "onAddToCallButtonClicked"
            X.2RF r1 = X.AnonymousClass6W1.A00(r2, r0)
            if (r1 == 0) goto L_0x0010
            java.lang.Integer r0 = X.C36381kD.A0n()
            r1.A02 = r0
            r0 = 19
        L_0x0064:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
            X.0yW r0 = r2.A02
            r0.Bly(r1)
            return
        L_0x0070:
            java.lang.Object r0 = r8.A00
            X.4Zc r0 = (X.C90104Zc) r0
            java.lang.Object r4 = r0.A00
            X.1qO r4 = (X.C38891qO) r4
            java.lang.ref.WeakReference r0 = r4.A09
            android.app.Activity r3 = X.C36441kJ.A0D(r0)
            if (r3 == 0) goto L_0x0010
            X.C38891qO.A02(r4)
            com.whatsapp.conversation.ConversationAttachmentContentView r0 = r4.A08
            r0.A08()
            boolean r2 = r4.A02
            int r1 = X.C38891qO.A00(r3, r4)
            r0 = 0
            X.C38891qO.A01(r3, r4, r0, r1, r2)
            return
        L_0x0093:
            java.lang.Object r0 = r8.A00
            X.2H0 r0 = (X.AnonymousClass2H0) r0
            X.16D r1 = r0.A08
            X.11F r0 = r0.A0G
            X.16p r2 = r1.A05
            X.141 r1 = r2.A0O(r0)
            if (r1 == 0) goto L_0x0010
            boolean r0 = r1.A0C()
            if (r0 == 0) goto L_0x00b6
            java.lang.String r0 = r1.A0K()
        L_0x00ad:
            r1.A0P = r0
            r0 = 1
            r1.A0n = r0
            r2.A0S(r1)
            return
        L_0x00b6:
            java.lang.String r0 = r1.A0a
            goto L_0x00ad
        L_0x00b9:
            java.lang.Object r4 = r8.A00
            X.2Gx r4 = (X.C43322Gx) r4
            X.141 r1 = r4.A0I
            X.11F r0 = r1.A0H
            if (r0 == 0) goto L_0x0010
            X.3L0 r0 = r1.A0E
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0010
            X.0yC r1 = r4.A0d
            r0 = 4006(0xfa6, float:5.614E-42)
            java.lang.String r2 = r1.A09(r0)
            r1 = 0
            boolean r0 = X.AnonymousClass14B.A0F(r2)
            if (r0 != 0) goto L_0x00e6
            java.lang.String r0 = "\\s*,\\s*"
            java.lang.String[] r0 = r2.split(r0)
            java.util.ArrayList r1 = X.C36351kA.A10(r0)
        L_0x00e6:
            X.141 r0 = r4.A0I
            X.11F r0 = r0.A0H
            java.lang.String r0 = X.AnonymousClass3U8.A06(r0)
            if (r1 == 0) goto L_0x0010
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0010
            X.171 r3 = r4.A0Z
            X.141 r2 = r4.A0I
            r1 = -1
            r0 = 1
            X.34G r0 = r3.A0E(r2, r1, r0, r0)
            X.2ol r1 = r0.A00
            X.2ol r0 = X.C52022ol.PHONE_NUMBER
            if (r1 == r0) goto L_0x010f
            X.141 r0 = r4.A0I
            X.3L0 r0 = r0.A0E
            int r1 = r0.A03
            r0 = 3
            if (r1 >= r0) goto L_0x0010
        L_0x010f:
            X.141 r0 = r4.A0I
            com.whatsapp.jid.UserJid r2 = X.C36391kE.A0i(r0)
            X.164 r1 = r4.A08
            com.whatsapp.jobqueue.job.GetVNameCertificateJob r0 = new com.whatsapp.jobqueue.job.GetVNameCertificateJob
            r0.<init>(r2)
            r1.A01(r0)
            return
        L_0x0120:
            java.lang.Object r4 = r8.A00
            X.28e r4 = (X.AnonymousClass28e) r4
            X.4UO r3 = r4.A0F
            X.3T1 r2 = r3.getQuotedMessage()
            if (r2 == 0) goto L_0x0143
            X.9lY r0 = r2.A0M
            if (r0 == 0) goto L_0x0143
            boolean r0 = r0.A0J()
            if (r0 == 0) goto L_0x0143
            X.0wQ r1 = r4.A09
            X.9lY r0 = r2.A0M
            com.whatsapp.jid.UserJid r0 = r0.A0E
            boolean r0 = r1.A0M(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0144
        L_0x0143:
            r1 = 0
        L_0x0144:
            com.whatsapp.mentions.MentionableEntry r0 = r4.A0L
            java.lang.String r0 = r0.getStringText()
            if (r1 != 0) goto L_0x0152
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0010
        L_0x0152:
            r3.BoW()
            return
        L_0x0156:
            java.lang.Object r1 = r8.A00
            X.4Ue r1 = (X.C88824Ue) r1
            X.4Zx r1 = (X.C90314Zx) r1
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x0186;
                case 1: goto L_0x0177;
                default: goto L_0x0161;
            }
        L_0x0161:
            java.lang.Object r1 = r1.A00
            com.whatsapp.status.playback.MessageReplyActivity r1 = (com.whatsapp.status.playback.MessageReplyActivity) r1
            java.util.HashMap r0 = com.whatsapp.status.playback.MessageReplyActivity.A1g
            X.2MC r0 = r1.A0g
            boolean r0 = r0.A02()
            if (r0 != 0) goto L_0x0010
            X.6YP r0 = r1.A1E
            if (r0 == 0) goto L_0x0010
        L_0x0173:
            r0.A0H()
            return
        L_0x0177:
            java.lang.Object r1 = r1.A00
            com.whatsapp.notification.PopupNotification r1 = (com.whatsapp.notification.PopupNotification) r1
            X.3J6 r0 = r1.A0p
            boolean r0 = r0.A02()
            if (r0 != 0) goto L_0x0010
            X.6YP r0 = r1.A1G
            goto L_0x0173
        L_0x0186:
            java.lang.Object r0 = r1.A00
            X.3fk r0 = (X.C70803fk) r0
            X.C70803fk.A0j(r0)
            X.6YP r0 = r0.A5Z
            X.C18740tg.A06(r0)
            goto L_0x0173
        L_0x0193:
            java.lang.Object r5 = r8.A00
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r4 = 0
        L_0x0198:
            int r0 = r5.getChildCount()
            if (r4 >= r0) goto L_0x0010
            android.view.View r3 = r5.getChildAt(r4)
            boolean r0 = r3 instanceof X.AnonymousClass2IR
            if (r0 == 0) goto L_0x01c6
            r2 = r3
            X.2IR r2 = (X.AnonymousClass2IR) r2
            X.3T1 r0 = r2.getFMessage()
            X.3T1 r1 = r0.A0S()
            boolean r0 = r3 instanceof X.AnonymousClass2IH
            if (r0 != 0) goto L_0x01c3
            if (r1 == 0) goto L_0x01c6
            X.9lY r0 = r1.A0M
            if (r0 == 0) goto L_0x01c6
            X.9lY r0 = r1.A0M
            X.6c9 r0 = r0.A05()
            if (r0 == 0) goto L_0x01c6
        L_0x01c3:
            r2.A1X()
        L_0x01c6:
            int r4 = r4 + 1
            goto L_0x0198
        L_0x01c9:
            java.lang.Object r3 = r8.A00
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r2 = 0
        L_0x01ce:
            int r0 = r3.getChildCount()
            if (r2 >= r0) goto L_0x0010
            android.view.View r1 = r3.getChildAt(r2)
            boolean r0 = r1 instanceof X.AnonymousClass2IH
            if (r0 == 0) goto L_0x01e1
            X.2IR r1 = (X.AnonymousClass2IR) r1
            r1.A1X()
        L_0x01e1:
            int r2 = r2 + 1
            goto L_0x01ce
        L_0x01e4:
            java.lang.Object r3 = r8.A00
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r2 = 0
        L_0x01e9:
            int r0 = r3.getChildCount()
            if (r2 >= r0) goto L_0x0010
            android.view.View r1 = r3.getChildAt(r2)
            boolean r0 = r1 instanceof X.AnonymousClass2II
            if (r0 != 0) goto L_0x01ff
            boolean r0 = r1 instanceof X.AnonymousClass2IH
            if (r0 != 0) goto L_0x01ff
            boolean r0 = r1 instanceof X.C175088Zp
            if (r0 == 0) goto L_0x0204
        L_0x01ff:
            X.2IR r1 = (X.AnonymousClass2IR) r1
            r1.A1X()
        L_0x0204:
            int r2 = r2 + 1
            goto L_0x01e9
        L_0x0207:
            java.lang.Object r3 = r8.A00
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r2 = 0
        L_0x020c:
            int r0 = r3.getChildCount()
            if (r2 >= r0) goto L_0x0010
            android.view.View r1 = r3.getChildAt(r2)
            boolean r0 = r1 instanceof X.AnonymousClass2IF
            if (r0 == 0) goto L_0x021f
            X.2IR r1 = (X.AnonymousClass2IR) r1
            r1.A1X()
        L_0x021f:
            int r2 = r2 + 1
            goto L_0x020c
        L_0x0222:
            java.lang.Object r3 = r8.A00
            X.2Gy r3 = (X.C43332Gy) r3
            com.whatsapp.TextEmojiLabel r1 = r3.A0A()
            java.lang.String r0 = X.C43332Gy.A02(r3)
            r1.setText(r0)
            com.whatsapp.TextEmojiLabel r0 = r3.A0A()
            android.view.ViewPropertyAnimator r2 = r0.animate()
            if (r2 == 0) goto L_0x0010
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.alpha(r0)
            r0 = 0
            r2.setStartDelay(r0)
            r0 = 250(0xfa, double:1.235E-321)
            r2.setDuration(r0)
            r0 = 39
            X.3v3 r0 = A00(r3, r0)
            r2.withEndAction(r0)
            r2.start()
            return
        L_0x0257:
            java.lang.Object r1 = r8.A00
            X.2HN r1 = (X.AnonymousClass2HN) r1
            X.16D r3 = r1.A06
            X.147 r0 = r1.A02
            boolean r2 = r1.A03
            X.141 r1 = r3.A0D(r0)
            boolean r0 = r1.A0u
            if (r0 == r2) goto L_0x0010
            r1.A0u = r2
            X.16p r0 = r3.A05
            r0.A0U(r1)
            X.16z r0 = r3.A04
            r0.A0A(r1)
            return
        L_0x0276:
            java.lang.Object r4 = r8.A00
            X.2HP r4 = (X.AnonymousClass2HP) r4
            X.5Nh r6 = r4.A08
            if (r6 == 0) goto L_0x02bb
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.util.ArrayList r0 = r6.A0C()
            java.util.Iterator r3 = r0.iterator()
        L_0x028a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x02a6
            java.lang.Object r2 = r3.next()
            X.AnonymousClass00C.A08(r2)
            X.5Nf r2 = (X.C107255Nf) r2
            int r1 = r2.A01
            r0 = 5
            if (r1 != r0) goto L_0x028a
            X.16D r1 = r4.A0G
            com.whatsapp.jid.UserJid r0 = r2.A00
            X.C36381kD.A1H(r1, r0, r5)
            goto L_0x028a
        L_0x02a6:
            android.view.View r3 = r4.A01
            if (r3 == 0) goto L_0x02bb
            r7 = 31
            X.74x r2 = new X.74x
            r2.<init>((java.lang.Object) r3, (java.lang.Object) r4, (java.lang.Object) r5, (java.lang.Object) r6, (int) r7)
            boolean r0 = r3.post(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            if (r0 != 0) goto L_0x0010
        L_0x02bb:
            X.3KV r3 = r4.A07
            if (r3 == 0) goto L_0x0010
            android.view.View r2 = r4.A01
            if (r2 == 0) goto L_0x0010
            r1 = 47
            X.74n r0 = new X.74n
            r0.<init>(r4, r2, r3, r1)
            r2.post(r0)
            return
        L_0x02ce:
            java.lang.Object r0 = r8.A00
            X.1vY r0 = (X.C40441vY) r0
            r1 = 0
            X.AnonymousClass00C.A0D(r0, r1)
            androidx.recyclerview.widget.RecyclerView r0 = r0.A00
            if (r0 == 0) goto L_0x0010
            r0.A0i(r1)
            return
        L_0x02de:
            java.lang.Object r0 = r8.A00
            X.6W1 r0 = (X.AnonymousClass6W1) r0
            java.util.UUID r4 = java.util.UUID.randomUUID()
            X.AnonymousClass00C.A08(r4)
            r2 = 0
            r5 = 15
            r6 = 6
            r7 = 0
            X.6Dh r1 = new X.6Dh
            r3 = r2
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.A00 = r1
            return
        L_0x02f7:
            java.lang.Object r0 = r8.A00
            X.4ht r0 = (X.C94244ht) r0
            X.00S r0 = r0.A00
            r0.invoke()
            return
        L_0x0301:
            java.lang.Object r0 = r8.A00
            com.whatsapp.contact.picker.nativecontacts.NativeContactsMultipleContactPicker r0 = (com.whatsapp.contact.picker.nativecontacts.NativeContactsMultipleContactPicker) r0
            X.16p r1 = r0.A00
            if (r1 == 0) goto L_0x030f
            java.util.List r0 = r0.A0c
            r1.A0X(r0)
            return
        L_0x030f:
            java.lang.String r0 = "contactManagerDatabase"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0316:
            java.lang.Object r2 = r8.A00
            com.whatsapp.contact.picker.nativecontacts.NativeContactsOptInActivity r2 = (com.whatsapp.contact.picker.nativecontacts.NativeContactsOptInActivity) r2
            X.0xT r1 = r2.A01
            if (r1 == 0) goto L_0x032a
            java.lang.String r0 = "12345"
            android.content.Intent r1 = X.C36341k9.A0D(r1, r0)
            X.1Dv r0 = r2.A01
            r0.A06(r2, r1)
            return
        L_0x032a:
            java.lang.String r0 = "faqLinkFactory"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0331:
            java.lang.Object r0 = r8.A00
            X.3gE r0 = (X.C71103gE) r0
            X.0xY r1 = r0.A00
            r0 = 1
            r1.A0A(r0)
            return
        L_0x033c:
            java.lang.Object r0 = r8.A00
            X.1qO r0 = (X.C38891qO) r0
            r0.A05()
            return
        L_0x0344:
            java.lang.Object r0 = r8.A00
            android.view.View r0 = (android.view.View) r0
            goto L_0x042e
        L_0x034a:
            java.lang.Object r0 = r8.A00
            X.28d r0 = (X.AnonymousClass28d) r0
            r0.A0H()
            return
        L_0x0352:
            java.lang.Object r0 = r8.A00
            com.whatsapp.conversation.CommentsBottomSheet r0 = (com.whatsapp.conversation.CommentsBottomSheet) r0
            X.1fs r2 = r0.A06
            if (r2 == 0) goto L_0x0364
            X.01I r1 = r0.A0i()
            java.lang.String r0 = "community-no-longer-available"
            r2.A01(r1, r0)
            return
        L_0x0364:
            java.lang.String r0 = "contextualHelpHandler"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x036b:
            java.lang.Object r0 = r8.A00
            X.2Gx r0 = (X.C43322Gx) r0
            android.view.ViewStub r1 = r0.A02
            r0 = 0
            r1.setVisibility(r0)
            return
        L_0x0376:
            java.lang.Object r0 = r8.A00
            X.4Ue r0 = (X.C88824Ue) r0
            r0.Bdr()
            return
        L_0x037e:
            java.lang.Object r0 = r8.A00
            com.whatsapp.conversation.ConversationListView r0 = (com.whatsapp.conversation.ConversationListView) r0
            r0.A03()
            return
        L_0x0386:
            java.lang.Object r1 = r8.A00
            com.whatsapp.conversation.ConversationListView r1 = (com.whatsapp.conversation.ConversationListView) r1
            r0 = 2
            r1.setTranscriptMode(r0)
            r1.A05()
            return
        L_0x0392:
            java.lang.Object r0 = r8.A00
            com.whatsapp.conversation.ConversationListView r0 = (com.whatsapp.conversation.ConversationListView) r0
            r0.A07()
            return
        L_0x039a:
            java.lang.Object r0 = r8.A00
            X.28f r0 = (X.AnonymousClass28f) r0
            X.1NM r5 = r0.A0C
            goto L_0x03ca
        L_0x03a1:
            java.lang.Object r0 = r8.A00
            X.28f r0 = (X.AnonymousClass28f) r0
            X.1dx r2 = r0.A0H
            X.11F r1 = r0.A0G
            X.2oi r0 = X.C51992oi.CONVERSATION_SCREEN
            r2.A01(r1, r0)
            return
        L_0x03af:
            java.lang.Object r0 = r8.A00
            com.whatsapp.conversation.EditMessageActivity r0 = (com.whatsapp.conversation.EditMessageActivity) r0
            android.widget.ScrollView r1 = r0.A03
            if (r1 != 0) goto L_0x03be
            java.lang.String r0 = "messageBubbleContainer"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x03be:
            r0 = 130(0x82, float:1.82E-43)
            r1.fullScroll(r0)
            return
        L_0x03c4:
            java.lang.Object r0 = r8.A00
            X.2H1 r0 = (X.AnonymousClass2H1) r0
            X.1NM r5 = r0.A0D
        L_0x03ca:
            X.11F r0 = r0.A0G
            monitor-enter(r5)
            android.content.SharedPreferences r6 = X.AnonymousClass1NM.A00(r5)     // Catch:{ all -> 0x03fb }
            java.lang.String r0 = r0.getRawString()     // Catch:{ all -> 0x03fb }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r0)     // Catch:{ all -> 0x03fb }
            java.lang.String r0 = "_actions"
            java.lang.String r4 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x03fb }
            java.lang.String r0 = "0"
            java.lang.String r2 = r6.getString(r4, r0)     // Catch:{ all -> 0x03fb }
            r0 = 0
            long r2 = X.AnonymousClass6R8.A01(r2, r0)     // Catch:{ all -> 0x03fb }
            r0 = 1
            long r2 = r2 + r0
            android.content.SharedPreferences$Editor r1 = r6.edit()     // Catch:{ all -> 0x03fb }
            java.lang.String r0 = java.lang.Long.toString(r2)     // Catch:{ all -> 0x03fb }
            X.C36341k9.A0x(r1, r4, r0)     // Catch:{ all -> 0x03fb }
            monitor-exit(r5)
            return
        L_0x03fb:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x03fe:
            java.lang.Object r0 = r8.A00
            X.28d r0 = (X.AnonymousClass28d) r0
            r0.A0B()
            return
        L_0x0406:
            java.lang.Object r0 = r8.A00
            X.2Mk r0 = (X.C44192Mk) r0
            X.0v0 r1 = r0.A02
            r0 = 1
            r1.A1s(r0)
            return
        L_0x0411:
            java.lang.Object r1 = r8.A00
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            return
        L_0x0418:
            java.lang.Object r1 = r8.A00
            X.2H2 r1 = (X.AnonymousClass2H2) r1
            r0 = 0
            r1.A03 = r0
            return
        L_0x0420:
            java.lang.Object r1 = r8.A00
            X.2Gy r1 = (X.C43332Gy) r1
            r0 = 0
            r1.A02 = r0
            return
        L_0x0428:
            java.lang.Object r0 = r8.A00
            X.2HL r0 = (X.AnonymousClass2HL) r0
            android.view.ViewGroup r0 = r0.A01
        L_0x042e:
            r0.requestLayout()
            return
        L_0x0432:
            java.lang.Object r0 = r8.A00
            X.3uz r0 = (X.C80183uz) r0
            r0.A08()
            return
        L_0x043a:
            java.lang.Object r0 = r8.A00
            X.2HM r0 = (X.AnonymousClass2HM) r0
            r2 = 1
            X.16D r1 = r0.A04
            X.147 r0 = r0.A02
            r1.A0d(r0, r2)
            return
        L_0x0447:
            java.lang.Object r0 = r8.A00
            com.whatsapp.conversation.comments.CommentActionsBottomSheet r0 = (com.whatsapp.conversation.comments.CommentActionsBottomSheet) r0
            X.1Hr r2 = r0.A08
            if (r2 == 0) goto L_0x0463
            X.3T1 r0 = r0.A0V
            if (r0 != 0) goto L_0x045a
            java.lang.String r0 = "message"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x045a:
            java.util.List r1 = X.C36371kC.A11(r0)
            r0 = 2
            r2.A04(r1, r0)
            return
        L_0x0463:
            java.lang.String r0 = "bizIntegrityLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x046a:
            java.lang.Object r3 = r8.A00
            com.whatsapp.conversation.comments.DecryptionFailureMessageView r3 = (com.whatsapp.conversation.comments.DecryptionFailureMessageView) r3
            X.0xT r1 = r3.getFaqLinkFactory()
            java.lang.String r0 = "26000015"
            android.content.Intent r2 = X.C36341k9.A0D(r1, r0)
            X.1Dv r1 = r3.getActivityUtils()
            android.content.Context r0 = r3.getContext()
            r1.A06(r0, r2)
            return
        L_0x0484:
            java.lang.Object r2 = r8.A00
            android.view.View r2 = (android.view.View) r2
            android.view.ViewParent r1 = r2.getParent()
            if (r1 == 0) goto L_0x0492
            r0 = 1
            r1.requestDisallowInterceptTouchEvent(r0)
        L_0x0492:
            r2.cancelLongPress()
            r0 = 0
            r2.setPressed(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80223v3.run():void");
    }
}
