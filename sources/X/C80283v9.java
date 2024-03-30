package X;

/* renamed from: X.3v9  reason: invalid class name and case insensitive filesystem */
public class C80283v9 implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public C80283v9(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public static void A00(C19770wU r1, Object obj, Object obj2, int i) {
        r1.Boy(new C80283v9(obj, obj2, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0288, code lost:
        r3 = r0.A0Z;
        X.C18740tg.A0C(X.C66013Ui.A0L(r4.A1I));
        ((X.AnonymousClass4TX) r4).Bsk(1);
        r3.A1J.Boy(new X.C35621iz(r3, r4, 25));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02a6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0319, code lost:
        r5.A0H(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x031c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0385, code lost:
        r2.A04(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0388, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x05b3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x05b7, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x05ba, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x05bb, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x05be, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x073d, code lost:
        if (r1.A0A(X.C36441kJ.A0n(r1.A02)) != null) goto L_0x073f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ff, code lost:
        if (((X.AnonymousClass2cL) r7).A00 == false) goto L_0x0201;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r23 = this;
            r5 = r23
            int r0 = r5.A02
            switch(r0) {
                case 0: goto L_0x0240;
                case 1: goto L_0x024c;
                case 2: goto L_0x0258;
                case 3: goto L_0x001b;
                case 4: goto L_0x0007;
                case 5: goto L_0x001b;
                case 6: goto L_0x0007;
                case 7: goto L_0x0277;
                case 8: goto L_0x0280;
                case 9: goto L_0x0039;
                case 10: goto L_0x006b;
                case 11: goto L_0x02a7;
                case 12: goto L_0x00e0;
                case 13: goto L_0x02b5;
                case 14: goto L_0x02c5;
                case 15: goto L_0x02d8;
                case 16: goto L_0x02f8;
                case 17: goto L_0x031d;
                case 18: goto L_0x032f;
                case 19: goto L_0x0345;
                case 20: goto L_0x011f;
                case 21: goto L_0x0355;
                case 22: goto L_0x0368;
                case 23: goto L_0x0377;
                case 24: goto L_0x0389;
                case 25: goto L_0x0452;
                case 26: goto L_0x0474;
                case 27: goto L_0x0142;
                case 28: goto L_0x017a;
                case 29: goto L_0x04af;
                case 30: goto L_0x04bd;
                case 31: goto L_0x0505;
                case 32: goto L_0x0559;
                case 33: goto L_0x05c6;
                case 34: goto L_0x05de;
                case 35: goto L_0x065b;
                case 36: goto L_0x019b;
                case 37: goto L_0x0214;
                case 38: goto L_0x0779;
                case 39: goto L_0x078b;
                case 40: goto L_0x0797;
                case 41: goto L_0x07cb;
                case 42: goto L_0x07e1;
                case 43: goto L_0x08c0;
                case 44: goto L_0x08db;
                case 45: goto L_0x07fc;
                case 46: goto L_0x0813;
                case 47: goto L_0x08f6;
                case 48: goto L_0x0891;
                case 49: goto L_0x08b4;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r2 = r5.A00
            X.3Ph r2 = (X.C64753Ph) r2
            java.lang.Object r1 = r5.A01
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            X.3Qa r0 = r1.A1J
            X.11F r0 = r0.A00
            if (r0 == 0) goto L_0x001a
            X.2IM r0 = r2.A0D
            r0.A1x(r1)
        L_0x001a:
            return
        L_0x001b:
            java.lang.Object r1 = r5.A00
            X.3Ph r1 = (X.C64753Ph) r1
            java.lang.Object r5 = r5.A01
            X.3T1 r5 = (X.AnonymousClass3T1) r5
            X.3Qa r0 = r5.A1J
            X.11F r4 = r0.A00
            if (r4 == 0) goto L_0x001a
            X.2IM r3 = r1.A0D
            X.1Xg r2 = r3.A0a
            r1 = 0
            r0 = 56
            r2.A01(r5, r1, r0)
            X.4Uq r0 = r5.A0J
            r3.A1t(r0, r4)
            return
        L_0x0039:
            java.lang.Object r0 = r5.A00
            X.8Zq r0 = (X.C175098Zq) r0
            java.lang.Object r3 = r5.A01
            X.2bv r3 = (X.C46942bv) r3
            com.whatsapp.search.views.itemviews.AudioPlayerView r2 = r0.A0A
            java.lang.Object r0 = r2.getTag()
            if (r0 == 0) goto L_0x001a
            X.3Qa r1 = r3.A1J
            java.lang.Object r0 = r2.getTag()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001a
            X.3Kh r0 = r3.A00
            java.lang.Object r0 = r0.A00
            X.3QP r0 = (X.AnonymousClass3QP) r0
            if (r0 == 0) goto L_0x001a
            X.00T r0 = r0.A04
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x001a
            r2.A03(r0)
            return
        L_0x006b:
            java.lang.Object r0 = r5.A00
            X.3fI r0 = (X.C70523fI) r0
            java.lang.Object r7 = r5.A01
            X.11F r7 = (X.AnonymousClass11F) r7
            X.1X4 r0 = r0.A07
            if (r7 == 0) goto L_0x001a
            X.0xM r6 = r0.A0X
            X.1FD r3 = r6.A0N
            X.163 r0 = r3.A00
            long r0 = r0.A08(r7)
            X.3B8 r5 = X.AnonymousClass1FD.A01(r3, r0)
            if (r5 == 0) goto L_0x001a
            X.1Fj r2 = r6.A0J
            int r0 = r7.hashCode()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            X.0zS r0 = r2.A02
            java.lang.Object r0 = r0.get()
            X.6VR r0 = (X.AnonymousClass6VR) r0
            r0.A0A(r1)
            r3.A05(r5)
            X.17Y r2 = r6.A06
            r1 = 47
            X.1j5 r0 = new X.1j5
            r0.<init>(r6, r5, r1)
            r2.A0H(r0)
            X.12q r0 = r6.A0I
            boolean r0 = r0.A0R(r7)
            if (r0 == 0) goto L_0x00d1
            r9 = 0
            r10 = 0
            boolean r11 = r5.A0C
            java.lang.String r8 = "action_delete"
        L_0x00b9:
            X.C20310xM.A03(r6, r7, r8, r9, r10, r11)
        L_0x00bc:
            java.util.List r10 = java.util.Collections.emptyList()
            r13 = 0
            X.1DQ r0 = r6.A0T
            android.os.Handler r0 = r0.A01
            r12 = 5
            X.1iY r8 = new X.1iY
            r9 = r6
            r11 = r7
            r8.<init>(r9, r10, r11, r12, r13)
            r0.post(r8)
            return
        L_0x00d1:
            long r3 = r5.A04
            r1 = -9223372036854775808
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00bc
            r9 = 0
            r10 = 0
            boolean r11 = r5.A0C
            java.lang.String r8 = "action_clear"
            goto L_0x00b9
        L_0x00e0:
            java.lang.Object r4 = r5.A00
            com.whatsapp.conversation.conversationrow.IdentityChangeDialogFragment r4 = (com.whatsapp.conversation.conversationrow.IdentityChangeDialogFragment) r4
            java.lang.Object r0 = r5.A01
            X.141 r0 = (X.AnonymousClass141) r0
            com.whatsapp.jid.UserJid r1 = X.C36351kA.A0l(r0)
            X.17i r0 = r4.A00
            java.util.HashSet r0 = r0.A0B(r1)
            int r1 = r0.size()
            X.19l r0 = r4.A01
            X.0v0 r0 = r0.A01
            boolean r0 = r0.A2H()
            r3 = 1
            if (r0 != 0) goto L_0x0104
            if (r1 > r3) goto L_0x0104
            r3 = 0
        L_0x0104:
            X.01I r0 = r4.A0h()
            if (r0 == 0) goto L_0x001a
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x001a
            X.01I r2 = r4.A0h()
            r1 = 28
            X.75B r0 = new X.75B
            r0.<init>((int) r1, (java.lang.Object) r4, (boolean) r3)
            r2.runOnUiThread(r0)
            return
        L_0x011f:
            java.lang.Object r0 = r5.A00
            X.22g r0 = (X.AnonymousClass22g) r0
            java.lang.Object r3 = r5.A01
            X.3T1 r3 = (X.AnonymousClass3T1) r3
            android.widget.ListView r0 = r0.getListView()
            X.3Qa r2 = r3.A1J
            android.view.View r1 = r0.findViewWithTag(r2)
            boolean r0 = r1 instanceof X.AnonymousClass2IR
            if (r0 == 0) goto L_0x001a
            X.2IR r1 = (X.AnonymousClass2IR) r1
            boolean r0 = r1.A2C(r2)
            if (r0 == 0) goto L_0x0906
            r0 = 1
            r1.A22(r3, r0)
            return
        L_0x0142:
            java.lang.Object r4 = r5.A00
            X.3T1 r4 = (X.AnonymousClass3T1) r4
            java.lang.Object r3 = r5.A01
            X.2KF r3 = (X.AnonymousClass2KF) r3
            r2 = 1
            boolean r0 = r4 instanceof X.C23043B1o
            if (r0 == 0) goto L_0x001a
            r0 = r4
            X.B1o r0 = (X.C23043B1o) r0
            if (r0 == 0) goto L_0x001a
            X.9uk r0 = r0.BA8()
            if (r0 == 0) goto L_0x090c
            X.9uX r1 = r0.A04
            if (r1 == 0) goto L_0x090c
            X.9tV r0 = new X.9tV
            r0.<init>(r2)
            r1.A00 = r0
            java.util.List r0 = r1.A03
            java.util.Iterator r1 = r0.iterator()
        L_0x016b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x090c
            java.lang.Object r0 = r1.next()
            X.9tc r0 = (X.C206569tc) r0
            r0.A00 = r2
            goto L_0x016b
        L_0x017a:
            java.lang.Object r6 = r5.A00
            X.6Xv r6 = (X.C133316Xv) r6
            java.lang.Object r5 = r5.A01
            X.6E7 r5 = (X.AnonymousClass6E7) r5
            X.1KK r4 = r6.A04
            com.whatsapp.jid.UserJid r3 = r5.A02
            X.9uZ r0 = r4.A07(r3)
            if (r0 == 0) goto L_0x0190
            boolean r0 = r0.A0Z
            if (r0 != 0) goto L_0x001a
        L_0x0190:
            r2 = 0
            r1 = 0
            X.7sp r0 = new X.7sp
            r0.<init>(r6, r5, r1)
            r4.A0E(r0, r3, r2)
            return
        L_0x019b:
            java.lang.Object r6 = r5.A00
            X.3fk r6 = (X.C70803fk) r6
            java.lang.Object r5 = r5.A01
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            X.1Cv r4 = r6.A3U
            long r9 = android.os.SystemClock.uptimeMillis()
            r7 = 0
            java.lang.String[] r8 = X.C36441kJ.A1R()
            r1 = 0
            X.163 r0 = r4.A00
            X.C36331k8.A19(r0, r5, r8, r1)
            X.12P r0 = r4.A04
            X.1M0 r3 = r0.get()
            X.14e r2 = r3.A02     // Catch:{ all -> 0x091e }
            java.lang.String r1 = X.AnonymousClass2xD.A0H     // Catch:{ all -> 0x091e }
            java.lang.String r0 = "LAST_MESSAGE_RAW_SQL"
            android.database.Cursor r2 = r2.A09(r1, r0, r8)     // Catch:{ all -> 0x091e }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0912 }
            if (r0 == 0) goto L_0x01d1
            X.1A1 r0 = r4.A07     // Catch:{ all -> 0x0912 }
            X.3T1 r7 = r0.A01(r2, r5)     // Catch:{ all -> 0x0912 }
            goto L_0x01da
        L_0x01d1:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0912 }
            java.lang.String r0 = "msgstore/last-raw/db no message for "
            X.C36321k7.A1L(r5, r0, r1)     // Catch:{ all -> 0x0912 }
        L_0x01da:
            r2.close()     // Catch:{ all -> 0x091e }
            r3.close()
            X.12g r3 = r4.A02
            long r1 = android.os.SystemClock.uptimeMillis()
            long r1 = r1 - r9
            java.lang.String r0 = "LastMessageStore/getLastMessageRaw"
            r3.A01(r0, r1)
            X.1NG r0 = r6.A1z
            boolean r4 = r0.A0O(r5)
            r3 = 1
            r2 = 0
            if (r7 == 0) goto L_0x0201
            boolean r0 = r7 instanceof X.AnonymousClass2cL
            if (r0 == 0) goto L_0x0201
            X.2cL r7 = (X.AnonymousClass2cL) r7
            boolean r1 = r7.A00
            r0 = 1
            if (r1 != 0) goto L_0x0202
        L_0x0201:
            r0 = 0
        L_0x0202:
            if (r4 == 0) goto L_0x020c
            if (r0 != 0) goto L_0x001a
            X.1NG r0 = r6.A1z
            r0.A0J(r5, r3)
            return
        L_0x020c:
            if (r0 == 0) goto L_0x001a
            X.1NG r0 = r6.A1z
            r0.A0J(r5, r2)
            return
        L_0x0214:
            java.lang.Object r1 = r5.A00
            X.3fk r1 = (X.C70803fk) r1
            java.lang.Object r3 = r5.A01
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            java.lang.String r0 = r1.A65
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x001a
            X.1Hx r2 = r1.A3B
            java.lang.String r4 = r1.A65
            java.lang.String r5 = r1.A64
            X.4V6 r0 = r1.A2l
            r0.getTime()
            long r6 = java.lang.System.currentTimeMillis()
            X.4V6 r0 = r1.A2l
            r0.getTime()
            long r8 = java.lang.System.currentTimeMillis()
            r2.A02(r3, r4, r5, r6, r8)
            return
        L_0x0240:
            java.lang.Object r1 = r5.A00
            X.8Z0 r1 = (X.AnonymousClass8Z0) r1
            java.lang.Object r0 = r5.A01
            X.2La r0 = (X.C44072La) r0
            X.AnonymousClass8Z0.setupAddVerifiedBadgeButton$lambda$4(r1, r0)
            return
        L_0x024c:
            java.lang.Object r1 = r5.A00
            X.2La r1 = (X.C44072La) r1
            java.lang.Object r0 = r5.A01
            X.8Z0 r0 = (X.AnonymousClass8Z0) r0
            X.AnonymousClass8Z0.setupShareToMyStatusButton$lambda$10$lambda$9(r1, r0)
            return
        L_0x0258:
            java.lang.Object r3 = r5.A00
            X.2He r3 = (X.C43352He) r3
            java.lang.Object r2 = r5.A01
            X.2bV r2 = (X.AnonymousClass2bV) r2
            r1 = 1
            X.3T1 r0 = r3.A0K
            r0.A0N()
            X.3KQ r0 = r2.A0N()
            if (r0 == 0) goto L_0x0272
            java.util.ArrayList r0 = r0.A07
        L_0x026e:
            r3.A2J(r2, r0, r1)
            return
        L_0x0272:
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
            goto L_0x026e
        L_0x0277:
            java.lang.Object r0 = r5.A00
            X.2IR r0 = (X.AnonymousClass2IR) r0
            java.lang.Object r4 = r5.A01
            X.2bU r4 = (X.AnonymousClass2bU) r4
            goto L_0x0288
        L_0x0280:
            java.lang.Object r0 = r5.A00
            X.2IR r0 = (X.AnonymousClass2IR) r0
            java.lang.Object r4 = r5.A01
            X.2bh r4 = (X.C46802bh) r4
        L_0x0288:
            X.1X4 r3 = r0.A0Z
            int r0 = r4.A1I
            boolean r0 = X.C66013Ui.A0L(r0)
            X.C18740tg.A0C(r0)
            r1 = r4
            X.4TX r1 = (X.AnonymousClass4TX) r1
            r0 = 1
            r1.Bsk(r0)
            X.0wU r2 = r3.A1J
            r1 = 25
            X.1iz r0 = new X.1iz
            r0.<init>(r3, r4, r1)
            r2.Boy(r0)
            return
        L_0x02a7:
            java.lang.Object r0 = r5.A00
            com.whatsapp.conversation.conversationrow.DeviceUpdateDialogFragment r0 = (com.whatsapp.conversation.conversationrow.DeviceUpdateDialogFragment) r0
            java.lang.Object r1 = r5.A01
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.3GL r0 = r0.A00
            r0.A01(r1)
            return
        L_0x02b5:
            java.lang.Object r0 = r5.A00
            X.3D7 r0 = (X.AnonymousClass3D7) r0
            java.lang.Object r1 = r5.A01
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            com.whatsapp.conversation.conversationrow.InteractiveMessageView r0 = r0.A00
            X.1JN r0 = r0.A0C
            r0.A02(r1)
            return
        L_0x02c5:
            java.lang.Object r2 = r5.A00
            com.whatsapp.conversation.conversationrow.MediaProgressRing r2 = (com.whatsapp.conversation.conversationrow.MediaProgressRing) r2
            java.lang.Object r1 = r5.A01
            X.00r r1 = (X.C001600r) r1
            r0 = 0
            r2.A03 = r0
            r2.A04 = r0
            X.04S r0 = r2.A02
            r1.A0B(r0)
            return
        L_0x02d8:
            java.lang.Object r3 = r5.A00
            X.2IU r3 = (X.AnonymousClass2IU) r3
            java.lang.Object r2 = r5.A01
            java.util.List r2 = (java.util.List) r2
            X.3fI r0 = r3.A00
            X.16D r1 = r0.A0C
            java.lang.Object r0 = X.C36391kE.A0t(r2)
            X.11F r0 = (X.AnonymousClass11F) r0
            X.141 r1 = r1.A0D(r0)
            X.17Y r5 = r3.A05
            r0 = 17
            X.3v9 r4 = new X.3v9
            r4.<init>(r3, r1, r0)
            goto L_0x0319
        L_0x02f8:
            java.lang.Object r3 = r5.A00
            com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity r3 = (com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity) r3
            java.lang.Object r2 = r5.A01
            X.3fI r0 = r3.A00
            X.16D r1 = r0.A0C
            X.11F r0 = r3.A0O
            X.141 r1 = r1.A0D(r0)
            X.3fI r0 = r3.A00
            X.171 r0 = r0.A0F
            java.lang.String r1 = r0.A0H(r1)
            X.17Y r5 = r3.A05
            r0 = 39
            X.74l r4 = new X.74l
            r4.<init>(r3, r2, r1, r0)
        L_0x0319:
            r5.A0H(r4)
            return
        L_0x031d:
            java.lang.Object r3 = r5.A00
            X.155 r3 = (X.AnonymousClass155) r3
            java.lang.Object r2 = r5.A01
            X.141 r2 = (X.AnonymousClass141) r2
            X.1Dv r1 = r3.A01
            X.190 r0 = X.C36441kJ.A0j()
            X.C36391kE.A1A(r3, r1, r2, r0)
            return
        L_0x032f:
            java.lang.Object r0 = r5.A00
            X.2mh r0 = (X.C50822mh) r0
            java.lang.Object r3 = r5.A01
            X.147 r3 = (X.AnonymousClass147) r3
            X.1Sk r2 = r0.A04
            X.2bI r1 = r0.A07
            X.1Sm r0 = r0.A03
            int r0 = r0.BEP(r3)
            r2.A07(r1, r0)
            return
        L_0x0345:
            java.lang.Object r0 = r5.A00
            X.4VS r0 = (X.AnonymousClass4VS) r0
            java.lang.Object r1 = r5.A01
            java.lang.Long r1 = (java.lang.Long) r1
            java.lang.Object r0 = r0.A00
            X.3Ry r0 = (X.C65413Ry) r0
            X.C65413Ry.A01(r0, r1)
            return
        L_0x0355:
            java.lang.Object r1 = r5.A00
            X.3ff r1 = (X.C70753ff) r1
            java.lang.Object r2 = r5.A01
            java.util.Collection r2 = (java.util.Collection) r2
            r0 = 1
            X.AnonymousClass00C.A0D(r2, r0)
            X.1Hr r1 = r1.A02
            r0 = 2
            r1.A04(r2, r0)
            return
        L_0x0368:
            java.lang.Object r1 = r5.A00
            X.2K6 r1 = (X.AnonymousClass2K6) r1
            java.lang.Object r0 = r5.A01
            X.1Hr r2 = r1.A01
            java.util.List r1 = X.C36371kC.A11(r0)
            r0 = 12
            goto L_0x0385
        L_0x0377:
            java.lang.Object r1 = r5.A00
            X.2K0 r1 = (X.AnonymousClass2K0) r1
            java.lang.Object r0 = r5.A01
            X.1Hr r2 = r1.A01
            java.util.List r1 = X.C36371kC.A11(r0)
            r0 = 11
        L_0x0385:
            r2.A04(r1, r0)
            return
        L_0x0389:
            java.lang.Object r7 = r5.A00
            X.2JW r7 = (X.AnonymousClass2JW) r7
            java.lang.Object r6 = r5.A01
            java.util.Collection r6 = (java.util.Collection) r6
            r2 = 0
            r5 = 1
            X.3CU r1 = r7.A02
            int r0 = r6.size()
            r1.A00(r2, r0)
            X.0zf r4 = r1.A00
            java.lang.String r9 = "update_star_message_store"
            r4.A07(r9)
            X.1X4 r8 = r7.A00
            X.1NO r0 = r8.A0c
            r0.A02(r6)
            X.0wU r2 = r8.A1J
            r1 = 29
            X.1iz r0 = new X.1iz
            r0.<init>(r8, r6, r1)
            r2.Boy(r0)
            java.util.ArrayList r11 = X.AnonymousClass001.A0I()
            java.util.Iterator r13 = r6.iterator()
            r2 = 0
            r10 = 0
        L_0x03c1:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x03fd
            X.3T1 r1 = X.C36391kE.A0l(r13)
            int r12 = r1.A1I
            r0 = 20
            if (r12 != r0) goto L_0x03c1
            r12 = r1
            X.2bx r12 = (X.C46962bx) r12
            boolean r0 = r12.A1k()
            if (r0 == 0) goto L_0x03f9
            if (r10 != 0) goto L_0x03e1
            r0 = 1
        L_0x03dd:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r0)
        L_0x03e1:
            X.3Qj r0 = r12.A01
            if (r0 == 0) goto L_0x03c1
            boolean r0 = r0.A0V
            if (r0 == 0) goto L_0x03c1
            long r0 = r1.A0I
            long r2 = java.lang.Math.max(r2, r0)
            X.1Ap r0 = r8.A1E
            X.6c4 r0 = r0.A00(r12)
            r11.add(r0)
            goto L_0x03c1
        L_0x03f9:
            if (r10 != 0) goto L_0x03e1
            r0 = 0
            goto L_0x03dd
        L_0x03fd:
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x040e
            boolean r1 = X.C224714l.A02()
            X.1AP r0 = r8.A1F
            if (r1 == 0) goto L_0x044e
            r0.A0D(r11)
        L_0x040e:
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            android.util.Pair r1 = X.C36441kJ.A0Q(r0, r10)
            java.lang.Object r0 = r1.first
            long r10 = X.C36431kI.A09(r0)
            java.lang.Object r3 = r1.second
            r1 = 0
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0432
            if (r3 == 0) goto L_0x0432
            X.17Y r2 = r8.A02
            r1 = 28
            X.1iz r0 = new X.1iz
            r0.<init>(r8, r3, r1)
            r2.A0H(r0)
        L_0x0432:
            r4.A06(r9)
            java.lang.String r2 = "sync"
            r4.A07(r2)
            X.196 r1 = r7.A01
            java.util.Set r0 = r1.A0D(r6, r5)
            X.AnonymousClass00C.A08(r0)
            r1.A0Q(r0)
            r4.A06(r2)
            r0 = 2
            r4.A0C(r0)
            return
        L_0x044e:
            r0.A0F(r11, r5)
            goto L_0x040e
        L_0x0452:
            java.lang.Object r4 = r5.A00
            X.2K3 r4 = (X.AnonymousClass2K3) r4
            java.lang.Object r3 = r5.A01
            X.3T1 r3 = (X.AnonymousClass3T1) r3
            X.1Hr r2 = r4.A01
            java.util.List r1 = X.C36371kC.A11(r3)
            r0 = 13
            r2.A04(r1, r0)
            X.1X4 r0 = r4.A00
            X.005 r0 = r0.A1Q
            java.lang.Object r1 = r0.get()
            X.64b r1 = (X.C1264564b) r1
            r0 = 0
            r1.A00(r3, r0, r0)
            return
        L_0x0474:
            java.lang.Object r7 = r5.A00
            X.2JV r7 = (X.AnonymousClass2JV) r7
            java.lang.Object r6 = r5.A01
            java.util.Collection r6 = (java.util.Collection) r6
            r5 = 0
            r4 = 1
            X.196 r3 = r7.A02
            java.util.Set r2 = r3.A0D(r6, r5)
            X.AnonymousClass00C.A08(r2)
            X.1NO r0 = r7.A03
            boolean r0 = r0.A04(r6)
            if (r0 != 0) goto L_0x04a4
            r1 = 2131895246(0x7f1223ce, float:1.942532E38)
            int r0 = r6.size()
            if (r0 == r4) goto L_0x049b
            r1 = 2131895245(0x7f1223cd, float:1.9425318E38)
        L_0x049b:
            X.17Y r0 = r7.A00
            r0.A07(r1, r5)
            r3.A0P(r2)
            return
        L_0x04a4:
            X.1Hr r1 = r7.A01
            r0 = 8
            r1.A04(r6, r0)
            r3.A0Q(r2)
            return
        L_0x04af:
            java.lang.Object r0 = r5.A00
            X.2KO r0 = (X.AnonymousClass2KO) r0
            java.lang.Object r1 = r5.A01
            X.11F r1 = (X.AnonymousClass11F) r1
            X.1CR r0 = r0.A0F
            r0.A0i(r1)
            return
        L_0x04bd:
            java.lang.Object r7 = r5.A00
            com.whatsapp.conversation.conversationrow.nativeflow.reminder.RescheduleReminderAlarmsWorker r7 = (com.whatsapp.conversation.conversationrow.nativeflow.reminder.RescheduleReminderAlarmsWorker) r7
            java.lang.Object r6 = r5.A01
            X.8Hw r6 = (X.C170888Hw) r6
            X.3Fb r8 = r7.A01
            long r4 = java.lang.System.currentTimeMillis()
            long r0 = com.whatsapp.conversation.conversationrow.nativeflow.reminder.RescheduleReminderAlarmsWorker.A06
            long r4 = r4 - r0
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = X.C65003Qi.A05
            long r2 = r2 + r0
            X.0k2 r0 = r8.A00(r4, r2)
            r0.size()
            java.util.Iterator r5 = r0.iterator()
        L_0x04e0:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x04fc
            java.lang.Object r4 = r5.next()
            X.3J5 r4 = (X.AnonymousClass3J5) r4
            X.1A1 r2 = r7.A02
            long r0 = r4.A00
            X.3T1 r3 = X.C36421kH.A0R(r2, r0)
            X.3Qi r2 = r7.A00
            long r0 = r4.A01
            r2.A03(r3, r0)
            goto L_0x04e0
        L_0x04fc:
            X.4ox r0 = new X.4ox
            r0.<init>()
            r6.A04(r0)
            return
        L_0x0505:
            java.lang.Object r6 = r5.A00
            com.whatsapp.conversation.conversationrow.nativeflow.reminder.ScheduledReminderCleanupWorker r6 = (com.whatsapp.conversation.conversationrow.nativeflow.reminder.ScheduledReminderCleanupWorker) r6
            java.lang.Object r5 = r5.A01
            X.8Hw r5 = (X.C170888Hw) r5
            X.3Fb r7 = r6.A02
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = com.whatsapp.conversation.conversationrow.nativeflow.reminder.ScheduledReminderCleanupWorker.A07
            long r2 = r2 - r0
            r0 = 0
            X.0k2 r0 = r7.A00(r0, r2)
            r0.size()
            java.lang.System.currentTimeMillis()
            java.util.Iterator r4 = r0.iterator()
        L_0x0526:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0550
            java.lang.Object r0 = r4.next()
            X.3J5 r0 = (X.AnonymousClass3J5) r0
            X.1A1 r2 = r6.A03
            long r0 = r0.A00
            X.3T1 r3 = X.C36421kH.A0R(r2, r0)
            if (r3 == 0) goto L_0x0526
            X.3Qi r0 = r6.A01
            r0.A02(r3)
            long r0 = r3.A1N
            r7.A01(r0)
            X.3CS r2 = r6.A00
            java.lang.String r1 = "cta_cancel_reminder"
            java.lang.String r0 = "cta_reminder"
            r2.A00(r3, r1, r0)
            goto L_0x0526
        L_0x0550:
            X.4ox r0 = new X.4ox
            r0.<init>()
            r5.A04(r0)
            return
        L_0x0559:
            java.lang.Object r0 = r5.A00
            X.1uP r0 = (X.C39981uP) r0
            java.lang.Object r1 = r5.A01
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            X.00s r5 = r0.A02
            X.30b r0 = r0.A05
            X.3Qa r9 = r1.A1J
            X.AnonymousClass00C.A07(r9)
            r8 = 0
            X.11F r1 = r9.A00
            r4 = 0
            if (r1 == 0) goto L_0x05c2
            X.12P r0 = r0.A00
            X.1M0 r3 = r0.get()
            X.14e r7 = r3.A02     // Catch:{ all -> 0x05b8 }
            java.lang.String r6 = "SELECT COUNT(*) AS count  FROM message_bot_feedback WHERE bot_feedback_key_remote_jid = ? AND bot_feedback_key_from_me = ? AND bot_feedback_key_id = ?"
            r0 = 3
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x05b8 }
            java.lang.String r0 = r1.getRawString()     // Catch:{ all -> 0x05b8 }
            r2[r8] = r0     // Catch:{ all -> 0x05b8 }
            boolean r0 = r9.A02     // Catch:{ all -> 0x05b8 }
            if (r0 == 0) goto L_0x059b
            java.lang.String r1 = "1"
        L_0x0589:
            r0 = 1
            r2[r0] = r1     // Catch:{ all -> 0x05b8 }
            r1 = 2
            java.lang.String r0 = r9.A01     // Catch:{ all -> 0x05b8 }
            X.AnonymousClass00C.A07(r0)     // Catch:{ all -> 0x05b8 }
            r2[r1] = r0     // Catch:{ all -> 0x05b8 }
            java.lang.String r0 = "COUNT_BOT_FEEDBACK_FOR_MESSAGE"
            android.database.Cursor r2 = r7.A09(r6, r0, r2)     // Catch:{ all -> 0x05b8 }
            goto L_0x059e
        L_0x059b:
            java.lang.String r1 = "0"
            goto L_0x0589
        L_0x059e:
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x05b1 }
            if (r0 == 0) goto L_0x05ad
            java.lang.String r0 = "count"
            int r0 = X.C36351kA.A03(r2, r0)     // Catch:{ all -> 0x05b1 }
            if (r0 <= 0) goto L_0x05ad
            r4 = 1
        L_0x05ad:
            r2.close()     // Catch:{ all -> 0x05b8 }
            goto L_0x05bf
        L_0x05b1:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x05b3 }
        L_0x05b3:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x05b8 }
            throw r0     // Catch:{ all -> 0x05b8 }
        L_0x05b8:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x05ba }
        L_0x05ba:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)
            throw r0
        L_0x05bf:
            r3.close()
        L_0x05c2:
            X.C36341k9.A19(r5, r4)
            return
        L_0x05c6:
            java.lang.Object r1 = r5.A00
            X.3fk r1 = (X.C70803fk) r1
            java.lang.Object r0 = r5.A01
            X.3HD r0 = (X.AnonymousClass3HD) r0
            X.155 r2 = X.C70803fk.A0B(r1)
            X.190 r1 = r1.A76
            com.whatsapp.jid.UserJid r0 = r0.A08
            android.content.Intent r0 = X.C36391kE.A0F(r2, r1, r0)
            r2.startActivity(r0)
            return
        L_0x05de:
            java.lang.Object r3 = r5.A00
            X.3fk r3 = (X.C70803fk) r3
            java.lang.Object r1 = r5.A01
            X.3Qp r1 = (X.C65073Qp) r1
            X.155 r0 = X.C70803fk.A0C(r3)
            X.155 r8 = X.C70803fk.A0C(r3)
            X.141 r12 = r3.A3Y
            X.1X4 r6 = r3.A1f
            X.01z r7 = X.C70803fk.A06(r3)
            X.1LV r10 = r3.A2B
            X.0wU r14 = r3.A5S
            X.1YR r11 = r3.A3X
            X.155 r9 = X.C70803fk.A0C(r3)
            X.1qm r2 = X.AnonymousClass3LW.A00(r0)
            r0 = 2131889466(0x7f120d3a, float:1.9413596E38)
            r2.A0K(r0)
            X.11F r13 = r12.A0H
            X.147 r13 = (X.AnonymousClass147) r13
            r5 = 2131889463(0x7f120d37, float:1.941359E38)
            r4 = 8
            X.4Xp r0 = new X.4Xp
            r0.<init>(r13, r6, r4)
            r2.setPositiveButton(r5, r0)
            r0 = 2131889465(0x7f120d39, float:1.9413594E38)
            r22 = 0
            X.4X7 r15 = new X.4X7
            r16 = r9
            r17 = r13
            r18 = r10
            r19 = r8
            r20 = r14
            r21 = r11
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            r2.setNegativeButton(r0, r15)
            X.3WA r6 = new X.3WA
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = 2131889464(0x7f120d38, float:1.9413592E38)
            r2.A0g(r6, r0)
            r0 = 1
            r2.A0a(r0)
            X.3V2 r0 = X.AnonymousClass3V2.A00
            r2.A0N(r0)
            X.C36341k9.A11(r2)
            X.4V6 r0 = r3.A2l
            X.0v0 r3 = r0.getWaSharedPreferences()
            X.11F r2 = r1.A06()
            r0 = -1
            r3.A1J(r2, r0)
            return
        L_0x065b:
            java.lang.Object r0 = r5.A00
            X.3fk r0 = (X.C70803fk) r0
            java.lang.Object r7 = r5.A01
            X.141 r7 = (X.AnonymousClass141) r7
            X.3Sr r5 = r0.A2n
            boolean r9 = r0.A67
            boolean r8 = r0.A6V
            boolean r0 = r7.A0G()
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0696
            java.lang.Class<X.147> r0 = X.AnonymousClass147.class
            com.whatsapp.jid.Jid r2 = X.C36381kD.A0e(r7, r0)
            X.147 r2 = (X.AnonymousClass147) r2
            X.1C6 r1 = r5.A0O
            X.0xQ r0 = r5.A0L
            X.17X r0 = r0.A0U
            boolean r0 = r0.A0H(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r1.A09(r2, r0)
            X.1Rs r5 = r5.A0P
            X.384 r2 = new X.384
            r2.<init>(r4, r0, r3, r4)
        L_0x0692:
            r5.A0C(r2)
            return
        L_0x0696:
            X.0xf r0 = r5.A0K
            X.11F r6 = r5.A0N
            boolean r0 = X.AnonymousClass3M3.A01(r0, r6)
            if (r0 != 0) goto L_0x06ca
            X.0yC r2 = r5.A0J
            boolean r0 = X.AnonymousClass3RR.A00(r2, r6)
            if (r0 != 0) goto L_0x06ca
            X.0v5 r1 = r5.A0C
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x06ba
            X.1K3 r0 = X.C36441kJ.A0f(r1)
            boolean r0 = r0.BLB(r6)
            if (r0 != 0) goto L_0x06ca
        L_0x06ba:
            X.1NV r1 = r5.A0E
            boolean r0 = r7.A0E()
            if (r0 == 0) goto L_0x06d6
            X.0yC r0 = r1.A01
            boolean r0 = X.C55942vR.A00(r0)
            if (r0 == 0) goto L_0x06d6
        L_0x06ca:
            X.1Rs r2 = r5.A0P
            r1 = 2
        L_0x06cd:
            X.384 r0 = new X.384
            r0.<init>(r1, r3, r3, r4)
        L_0x06d2:
            r2.A0C(r0)
            return
        L_0x06d6:
            X.11F r0 = r7.A0H
            boolean r0 = r0 instanceof X.C177618e5
            if (r0 != 0) goto L_0x074e
            X.1CF r0 = r5.A0M
            boolean r0 = r0.A02(r6)
            if (r0 != 0) goto L_0x074e
            if (r9 != 0) goto L_0x074a
            X.3IL r0 = r7.A0F
            if (r0 != 0) goto L_0x06f7
            X.141 r0 = r7.A0G
            if (r0 != 0) goto L_0x06f7
            boolean r0 = r7.A0s
            if (r0 == 0) goto L_0x06ff
            int r1 = r7.A07
            r0 = 2
            if (r1 == r0) goto L_0x06ff
        L_0x06f7:
            X.1C6 r0 = r5.A0O
            boolean r0 = r0.A07(r6)
            if (r0 == 0) goto L_0x074e
        L_0x06ff:
            java.util.ArrayList r0 = r5.A06
            if (r0 != 0) goto L_0x070f
            X.3Gc r1 = r5.A0R
            com.whatsapp.jid.UserJid r0 = X.C36351kA.A0l(r7)
            java.util.ArrayList r0 = r1.A00(r0)
            r5.A06 = r0
        L_0x070f:
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0744
            X.1Ew r0 = r5.A0I
            X.12q r0 = r0.A04
            X.3Qp r0 = r0.A09(r6, r3)
            if (r0 == 0) goto L_0x0723
            int r0 = r0.A0B
            if (r0 == r4) goto L_0x073f
        L_0x0723:
            X.0wQ r0 = r5.A0D
            boolean r0 = X.C36361kB.A1X(r0, r7)
            if (r0 == 0) goto L_0x0740
            boolean r0 = X.C36391kE.A1X(r2)
            if (r0 == 0) goto L_0x0740
            X.16D r1 = r5.A0F
            X.0wQ r0 = r1.A02
            com.whatsapp.jid.PhoneUserJid r0 = X.C36441kJ.A0n(r0)
            X.141 r0 = r1.A0A(r0)
            if (r0 == 0) goto L_0x0740
        L_0x073f:
            r4 = 0
        L_0x0740:
            X.1Rs r2 = r5.A0P
            r1 = 4
            goto L_0x06cd
        L_0x0744:
            if (r8 == 0) goto L_0x0757
            X.1Rs r2 = r5.A0P
            r1 = 5
            goto L_0x06cd
        L_0x074a:
            X.1Rs r2 = r5.A0P
            r1 = 3
            goto L_0x06cd
        L_0x074e:
            X.1Rs r2 = r5.A0P
            X.384 r0 = new X.384
            r0.<init>(r3, r3, r3, r4)
            goto L_0x06d2
        L_0x0757:
            X.1C6 r2 = r5.A0O
            X.11F r0 = X.C36331k8.A0G(r7)
            int r1 = X.AnonymousClass1C6.A00(r0, r2)
            r0 = -1
            if (r1 != r0) goto L_0x0770
            r1 = 0
        L_0x0765:
            r3 = 1
        L_0x0766:
            X.1Rs r5 = r5.A0P
            r0 = 6
            X.384 r2 = new X.384
            r2.<init>(r0, r3, r1, r4)
            goto L_0x0692
        L_0x0770:
            boolean r0 = r2.A07(r6)
            r1 = 0
            if (r0 == 0) goto L_0x0766
            r1 = 1
            goto L_0x0765
        L_0x0779:
            java.lang.Object r0 = r5.A00
            X.3fk r0 = (X.C70803fk) r0
            java.lang.Object r1 = r5.A01
            X.155 r0 = X.C70803fk.A0C(r0)
            X.4V7 r0 = X.AnonymousClass3SS.A01(r0)
            r0.BNx(r1)
            return
        L_0x078b:
            java.lang.Object r1 = r5.A00
            X.3fk r1 = (X.C70803fk) r1
            java.lang.Object r0 = r5.A01
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            r1.A2K(r0)
            return
        L_0x0797:
            java.lang.Object r6 = r5.A00
            X.3fk r6 = (X.C70803fk) r6
            java.lang.Object r5 = r5.A01
            X.3T1 r5 = (X.AnonymousClass3T1) r5
            long r3 = r6.A07
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x07b2
            X.4V6 r0 = r6.A2l
            X.1V6 r0 = r0.getMessageAudioPlayerProvider()
            r0.A07()
            r6.A07 = r1
        L_0x07b2:
            com.whatsapp.conversation.ConversationListView r0 = r6.A2U
            X.3Qa r2 = r5.A1J
            X.2IR r1 = r0.A02(r2)
            if (r1 == 0) goto L_0x07c1
            r0 = 1
            r1.A23(r5, r0)
            return
        L_0x07c1:
            X.1nd r0 = X.C70803fk.A0D(r6)
            java.util.HashSet r0 = r0.A0N
            r0.add(r2)
            return
        L_0x07cb:
            java.lang.Object r0 = r5.A00
            X.4Vt r0 = (X.C89234Vt) r0
            java.lang.Object r1 = r5.A01
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r0.A00
            X.4Ze r0 = (X.C90124Ze) r0
            java.lang.Object r0 = r0.A00
            X.3fk r0 = (X.C70803fk) r0
            com.whatsapp.KeyboardPopupLayout r0 = r0.A1V
            r0.removeView(r1)
            return
        L_0x07e1:
            java.lang.Object r0 = r5.A00
            X.3Qn r0 = (X.C65053Qn) r0
            java.lang.Object r1 = r5.A01
            X.11F r1 = (X.AnonymousClass11F) r1
            X.005 r0 = r0.A09
            java.lang.Object r0 = r0.get()
            X.1Hr r0 = (X.C25791Hr) r0
            r5 = 1
            r6 = 12
            r2 = 0
            r7 = 0
            r4 = r2
            r3 = r2
            r0.A02(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x07fc:
            java.lang.Object r2 = r5.A01
            X.14u r2 = (X.C225314u) r2
            r0 = 2131896549(0x7f1228e5, float:1.9427962E38)
            java.lang.String r1 = X.C36361kB.A0m(r2, r0)
            r0 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r1, r0)
            r0.show()
            r2.Bnv()
            return
        L_0x0813:
            java.lang.Object r4 = r5.A00
            com.whatsapp.conversation.selection.SingleSelectedMessageActivity r4 = (com.whatsapp.conversation.selection.SingleSelectedMessageActivity) r4
            java.lang.Object r0 = r5.A01
            android.view.View r0 = (android.view.View) r0
            X.2Ka r2 = r4.A05
            java.lang.String r3 = "reactionsTrayLayout"
            if (r2 != 0) goto L_0x0826
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x0826:
            float r1 = r0.getY()
            X.2Ka r0 = r4.A05
            if (r0 != 0) goto L_0x0833
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x0833:
            int r0 = r0.getMeasuredHeight()
            float r0 = (float) r0
            float r1 = r1 - r0
            r2.setY(r1)
            boolean r0 = r4.A3n()
            X.2Ka r2 = r4.A05
            if (r0 == 0) goto L_0x086f
            if (r2 != 0) goto L_0x084b
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x084b:
            com.whatsapp.conversation.selection.MessageSelectionDropDownRecyclerView r0 = r4.A3j()
            int r1 = r0.getRight()
            X.2Ka r0 = r4.A05
            if (r0 != 0) goto L_0x085c
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x085c:
            int r0 = r0.getPaddingRight()
            int r1 = r1 + r0
            X.2Ka r0 = r4.A05
            if (r0 != 0) goto L_0x086a
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x086a:
            int r0 = r0.getMeasuredWidth()
            goto L_0x088b
        L_0x086f:
            if (r2 != 0) goto L_0x0876
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x0876:
            com.whatsapp.conversation.selection.MessageSelectionDropDownRecyclerView r0 = r4.A3j()
            int r1 = r0.getLeft()
            X.2Ka r0 = r4.A05
            if (r0 != 0) goto L_0x0887
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r3)
            throw r0
        L_0x0887:
            int r0 = r0.getPaddingLeft()
        L_0x088b:
            int r1 = r1 - r0
            float r0 = (float) r1
            r2.setX(r0)
            return
        L_0x0891:
            java.lang.Object r2 = r5.A00
            X.1uh r2 = (X.C40061uh) r2
            java.lang.Object r1 = r5.A01
            java.util.Map r1 = (java.util.Map) r1
            java.util.Map r0 = r2.A1F
            r0.clear()
            r0.putAll(r1)
            java.util.Collection r1 = r1.values()
            X.2oX r0 = X.C51882oX.DEFAULT
            java.util.List r1 = X.C55012tv.A00(r0, r1)
            r1.size()
            X.1Rs r0 = r2.A13
            r0.A0C(r1)
            return
        L_0x08b4:
            java.lang.Object r0 = r5.A00
            X.1uh r0 = (X.C40061uh) r0
            java.lang.Object r1 = r5.A01
            X.1Rs r0 = r0.A0z
            r0.A0D(r1)
            return
        L_0x08c0:
            java.lang.Object r2 = r5.A00
            X.3Ag r2 = (X.C61023Ag) r2
            java.lang.Object r1 = r5.A01
            X.144 r1 = (X.AnonymousClass144) r1
            X.0v5 r0 = r2.A01
            r0.A02()
            X.17X r0 = r2.A04
            X.17r r0 = r0.A07
            r0.A0A(r1)
            java.lang.String r0 = "logMessageSendAction"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x08db:
            java.lang.Object r2 = r5.A00
            X.3Ag r2 = (X.C61023Ag) r2
            java.lang.Object r1 = r5.A01
            X.144 r1 = (X.AnonymousClass144) r1
            X.0v5 r0 = r2.A01
            r0.A02()
            X.17X r0 = r2.A04
            X.17r r0 = r0.A07
            r0.A0A(r1)
            java.lang.String r0 = "logOpenChatAction"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x08f6:
            java.lang.Object r0 = r5.A00
            com.whatsapp.conversation.viewmodel.ConversationTitleViewModel r0 = (com.whatsapp.conversation.viewmodel.ConversationTitleViewModel) r0
            X.0v5 r0 = r0.A02
            r0.A02()
            java.lang.String r0 = "logSecondaryActionEvent"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0906:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x090c:
            X.0xM r0 = r3.A00
            r0.A0k(r4)
            return
        L_0x0912:
            r1 = move-exception
            if (r2 == 0) goto L_0x091d
            r2.close()     // Catch:{ all -> 0x0919 }
            goto L_0x091d
        L_0x0919:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x091e }
        L_0x091d:
            throw r1     // Catch:{ all -> 0x091e }
        L_0x091e:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0923 }
            throw r1
        L_0x0923:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80283v9.run():void");
    }
}
