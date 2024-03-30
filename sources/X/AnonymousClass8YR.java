package X;

/* renamed from: X.8YR  reason: invalid class name */
public final class AnonymousClass8YR extends C26661La {
    public final AnonymousClass3CJ A00;
    public final C26681Lc A01 = C26681Lc.Chat;
    public final AnonymousClass163 A02;
    public final C26691Ld A03 = C26691Ld.BOT_WELCOME_REQUEST;
    public final C20810yC A04;

    public String A0B() {
        return "regular_low";
    }

    public boolean A0H() {
        C20810yC r1 = this.A04;
        if (r1.A0E(5587) || r1.A0E(4873)) {
            return true;
        }
        return false;
    }

    public AnonymousClass8LN A0K(AnonymousClass8LN r5, Object obj) {
        Boolean bool;
        if (obj instanceof Boolean) {
            bool = (Boolean) obj;
        } else {
            bool = null;
        }
        AnonymousClass8NN A0p = AnonymousClass8O5.DEFAULT_INSTANCE.A0p();
        boolean A1Y = C90494aF.A1Y(bool);
        AnonymousClass8O5 r1 = (AnonymousClass8O5) C90524aI.A0H(A0p);
        r1.bitField0_ |= 1;
        r1.isSent_ = A1Y;
        AnonymousClass8O5 r2 = (AnonymousClass8O5) A0p.A0R();
        AnonymousClass8SS A0H = AnonymousClass8NN.A0H(r5);
        int i = AnonymousClass8SS.AGENT_ACTION_FIELD_NUMBER;
        r2.getClass();
        A0H.botWelcomeRequestAction_ = r2;
        A0H.bitField1_ |= 128;
        return r5;
    }

    public /* bridge */ /* synthetic */ Object A0L(AnonymousClass8SS r3) {
        AnonymousClass8O5 r0 = r3.botWelcomeRequestAction_;
        if (r0 == null) {
            r0 = AnonymousClass8O5.DEFAULT_INSTANCE;
        }
        boolean z = true;
        if (r0 == null || !r0.isSent_) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0081, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0084, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0085, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0088, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A0M() {
        /*
            r7 = this;
            X.3CJ r0 = r7.A00
            java.util.HashSet r6 = X.C36441kJ.A16()
            X.12P r0 = r0.A00
            X.1M0 r4 = r0.get()
            X.14e r3 = r4.A02     // Catch:{ all -> 0x0082 }
            java.lang.String r2 = "SELECT chat_row_id FROM bot_chat_info WHERE welcome_request_message_sent = 1"
            java.lang.String r1 = "BotChatInfoStoreGET_ALL_CHATS_HAVE_SENT_WELCOME_REQUEST_MESSAGE"
            r0 = 0
            android.database.Cursor r3 = r3.A09(r2, r1, r0)     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = "chat_row_id"
            int r2 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x007b }
        L_0x001d:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x007b }
            if (r0 == 0) goto L_0x002b
            long r0 = r3.getLong(r2)     // Catch:{ all -> 0x007b }
            X.C36391kE.A1W(r6, r0)     // Catch:{ all -> 0x007b }
            goto L_0x001d
        L_0x002b:
            r6.size()     // Catch:{ all -> 0x007b }
            r3.close()     // Catch:{ all -> 0x0082 }
            r4.close()
            java.util.HashSet r5 = X.C36441kJ.A16()
            java.util.Iterator r3 = r6.iterator()
        L_0x003c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0052
            long r1 = X.C36391kE.A0D(r3)
            X.163 r0 = r7.A02
            X.11F r0 = r0.A0A(r1)
            if (r0 == 0) goto L_0x003c
            r5.add(r0)
            goto L_0x003c
        L_0x0052:
            r5.size()
            java.util.ArrayList r4 = X.C36321k7.A0J(r5)
            java.util.Iterator r3 = r5.iterator()
        L_0x005d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x007a
            java.lang.Object r0 = r3.next()
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            java.lang.Boolean r2 = X.C36371kC.A0m()
            java.lang.String r1 = r0.getRawString()
            X.3I4 r0 = new X.3I4
            r0.<init>(r2, r1)
            r4.add(r0)
            goto L_0x005d
        L_0x007a:
            return r4
        L_0x007b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x007d }
        L_0x007d:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ all -> 0x0082 }
            throw r0     // Catch:{ all -> 0x0082 }
        L_0x0082:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8YR.A0M():java.util.List");
    }

    public boolean A0N(C175958bL r6) {
        Boolean bool;
        Object obj = r6.A01;
        if (obj instanceof Boolean) {
            bool = (Boolean) obj;
        } else {
            bool = null;
        }
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            AnonymousClass11F A022 = AnonymousClass11F.A00.A02(r6.A02);
            if (A022 != null) {
                this.A00.A00(this.A02.A08(A022), booleanValue);
            }
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8YR(AnonymousClass3CJ r2, C26011In r3, AnonymousClass163 r4, AnonymousClass1AC r5, C20810yC r6) {
        super(r3, r5);
        C36321k7.A18(r6, r4, r2, r5);
        this.A04 = r6;
        this.A02 = r4;
        this.A00 = r2;
    }

    public C26681Lc A0I() {
        return this.A01;
    }

    public C26691Ld A0J() {
        return this.A03;
    }
}
