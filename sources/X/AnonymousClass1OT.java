package X;

import com.whatsapp.jid.UserJid;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.1OT  reason: invalid class name */
public class AnonymousClass1OT {
    public final C19460v5 A00;
    public final AnonymousClass1KK A01;
    public final C20390xU A02;
    public final C27391Oa A03;
    public final AnonymousClass1OX A04;
    public final C27451Og A05;
    public final AnonymousClass1OU A06;
    public final AnonymousClass1OY A07;
    public final AnonymousClass1OZ A08;
    public final C27401Ob A09;
    public final AnonymousClass1OV A0A;
    public final C27421Od A0B;
    public final C27411Oc A0C;
    public final C27441Of A0D;
    public final AnonymousClass1OW A0E;

    public void A00(C194169Oj r9, AnonymousClass9OU r10, AnonymousClass141 r11, long j) {
        UserJid userJid = r9.A0D;
        C18740tg.A06(userJid);
        if (userJid.equals(r11.A0H)) {
            Map singletonMap = Collections.singletonMap(r9.A0D, r9);
            A01(r10, (C1041758o) null, Collections.singletonList(new AnonymousClass9jB(r11).A05()), singletonMap, (Map) null, j);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("jid doesn't match, jid1=");
        sb.append(r9.A0D);
        sb.append(", jid2=");
        sb.append(r11.A0H);
        throw new IllegalArgumentException(sb.toString());
    }

    public AnonymousClass1OT(C19460v5 r1, AnonymousClass1KK r2, C20390xU r3, C27391Oa r4, AnonymousClass1OX r5, C27451Og r6, AnonymousClass1OU r7, AnonymousClass1OY r8, AnonymousClass1OZ r9, C27401Ob r10, AnonymousClass1OV r11, C27421Od r12, C27411Oc r13, C27441Of r14, AnonymousClass1OW r15) {
        this.A06 = r7;
        this.A01 = r2;
        this.A0A = r11;
        this.A0E = r15;
        this.A04 = r5;
        this.A07 = r8;
        this.A08 = r9;
        this.A03 = r4;
        this.A09 = r10;
        this.A0C = r13;
        this.A0B = r12;
        this.A00 = r1;
        this.A0D = r14;
        this.A05 = r6;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:131:0x028c, code lost:
        if (r0.A04 == 2) goto L_0x028e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x042e, code lost:
        if (r7 == 1) goto L_0x0430;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0430, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0439, code lost:
        if (r7 != r5.A00) goto L_0x0430;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x011a, code lost:
        if (r5 == null) goto L_0x011c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x042c  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0433  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.AnonymousClass9OU r38, X.C1041758o r39, java.util.List r40, java.util.Map r41, java.util.Map r42, long r43) {
        /*
            r37 = this;
            r40.size()
            java.util.HashMap r22 = new java.util.HashMap
            r22.<init>()
            java.util.HashSet r23 = new java.util.HashSet
            r23.<init>()
            r12 = 0
            r20 = 0
            r19 = 0
            r18 = 0
            r17 = 0
            java.util.Iterator r21 = r40.iterator()
        L_0x001a:
            boolean r0 = r21.hasNext()
            r3 = r37
            r6 = r38
            r4 = r41
            if (r0 == 0) goto L_0x075b
            java.lang.Object r8 = r21.next()
            X.9Ok r8 = (X.C194179Ok) r8
            X.141 r2 = r8.A06
            X.C18740tg.A06(r2)
            java.lang.Class<com.whatsapp.jid.UserJid> r7 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r1 = r2.A06(r7)
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            if (r1 != 0) goto L_0x0057
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "syncresultupdater/skip/no-user-jid phoneNumber="
            r2.append(r0)
            java.lang.String r1 = r8.A0B
            r0 = 4
            java.lang.String r0 = X.AnonymousClass14B.A0B(r1, r0)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x001a
        L_0x0057:
            r0 = r22
            r0.put(r1, r8)
            java.lang.Object r0 = r4.get(r1)
            X.9Oj r0 = (X.C194169Oj) r0
            if (r0 == 0) goto L_0x001a
            int r5 = r0.A04
            r4 = 3
            if (r5 == r4) goto L_0x073f
            X.9Rr r4 = r6.A02
            r11 = 1
            if (r4 == 0) goto L_0x00d7
            boolean r4 = r4.A03
            if (r4 == 0) goto L_0x00d7
            X.1Of r4 = r3.A0D
            r4.A00(r0, r2, r11)
            boolean r4 = r2.A0s
            if (r4 == 0) goto L_0x00d7
            X.1OW r5 = r3.A0E
            com.whatsapp.jid.UserJid r10 = r0.A0D
            if (r10 == 0) goto L_0x00d7
            boolean r4 = r2.A0k
            if (r4 != 0) goto L_0x00d7
            X.16D r4 = r5.A00
            X.16p r9 = r4.A05
            android.content.ContentValues r14 = new android.content.ContentValues
            r14.<init>(r11)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
            java.lang.String r4 = "is_contact_synced"
            r14.put(r4, r5)
            X.16r r4 = r9.A00     // Catch:{ IllegalArgumentException -> 0x00ba }
            X.1M0 r13 = r4.A04()     // Catch:{ IllegalArgumentException -> 0x00ba }
            java.lang.String r9 = "wa_contacts"
            java.lang.String r5 = "jid = ?"
            java.lang.String[] r4 = new java.lang.String[r11]     // Catch:{ all -> 0x00b0 }
            java.lang.String r15 = r10.getRawString()     // Catch:{ all -> 0x00b0 }
            r4[r12] = r15     // Catch:{ all -> 0x00b0 }
            X.C229416o.A01(r14, r13, r9, r5, r4)     // Catch:{ all -> 0x00b0 }
            r13.close()     // Catch:{ IllegalArgumentException -> 0x00ba }
            goto L_0x00d7
        L_0x00b0:
            r4 = move-exception
            r13.close()     // Catch:{ all -> 0x00b5 }
            goto L_0x00b9
        L_0x00b5:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch:{ IllegalArgumentException -> 0x00ba }
        L_0x00b9:
            throw r4     // Catch:{ IllegalArgumentException -> 0x00ba }
        L_0x00ba:
            r9 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r4 = "contact-mgr-db/unable to update native contact sync "
            r5.append(r4)
            r5.append(r10)
            java.lang.String r4 = ", "
            r5.append(r4)
            r5.append(r11)
            java.lang.String r4 = r5.toString()
            X.C18740tg.A08(r4, r9)
        L_0x00d7:
            X.9Rr r4 = r6.A05
            if (r4 == 0) goto L_0x00df
            boolean r4 = r4.A03
            if (r4 != 0) goto L_0x00e7
        L_0x00df:
            com.whatsapp.jid.UserJid r4 = r0.A0D
            boolean r4 = X.AnonymousClass143.A0I(r4)
            if (r4 == 0) goto L_0x00fa
        L_0x00e7:
            X.1OU r10 = r3.A06
            X.13w r5 = r0.A0C
            com.whatsapp.jid.UserJid r9 = r0.A0D
            if (r5 == 0) goto L_0x02e9
            boolean r4 = r9 instanceof com.whatsapp.jid.PhoneUserJid
            if (r4 == 0) goto L_0x02e9
            X.12O r4 = r10.A01
            com.whatsapp.jid.PhoneUserJid r9 = (com.whatsapp.jid.PhoneUserJid) r9
            r4.A0H(r5, r9)
        L_0x00fa:
            X.9Rr r4 = r6.A0B
            if (r4 == 0) goto L_0x011c
            boolean r4 = r4.A03
            if (r4 == 0) goto L_0x011c
            X.1Oc r10 = r3.A0C
            java.lang.String r9 = r0.A0J
            if (r9 == 0) goto L_0x011c
            X.13w r5 = r0.A0C
            if (r5 != 0) goto L_0x02e2
            com.whatsapp.jid.UserJid r5 = r0.A0D
            boolean r4 = r5 instanceof com.whatsapp.jid.PhoneUserJid
            if (r4 == 0) goto L_0x02da
            X.12O r4 = r10.A01
            com.whatsapp.jid.PhoneUserJid r5 = (com.whatsapp.jid.PhoneUserJid) r5
            X.13w r5 = r4.A09(r5)
        L_0x011a:
            if (r5 != 0) goto L_0x02e2
        L_0x011c:
            X.9Rr r4 = r6.A09
            if (r4 == 0) goto L_0x015c
            boolean r4 = r4.A03
            if (r4 == 0) goto L_0x015c
            X.1OV r11 = r3.A0A
            int r14 = r0.A03
            r10 = 2
            r13 = 0
            r9 = 1
            r4 = 0
            if (r10 == r14) goto L_0x028e
            if (r9 != r14) goto L_0x0288
            long r9 = r0.A08
            long r4 = r2.A0D
            int r13 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r13 != 0) goto L_0x0143
            java.lang.String r5 = r0.A0H
            java.lang.String r4 = r2.A0X
            boolean r4 = android.text.TextUtils.equals(r5, r4)
            if (r4 != 0) goto L_0x015c
        L_0x0143:
            java.lang.String r4 = r0.A0H
            r2.A0X = r4
            long r4 = r0.A08
            r2.A0D = r4
            X.16D r11 = r11.A00
            com.whatsapp.jid.Jid r10 = r2.A06(r7)
            com.whatsapp.jid.UserJid r10 = (com.whatsapp.jid.UserJid) r10
            long r4 = r0.A08
            java.lang.String r9 = r0.A0H
            r11.A0f(r10, r9, r4)
        L_0x015a:
            int r17 = r17 + 1
        L_0x015c:
            X.9Rr r4 = r6.A0A
            if (r4 == 0) goto L_0x019b
            boolean r4 = r4.A03
            if (r4 == 0) goto L_0x019b
            X.1Od r9 = r3.A0B
            X.0yC r10 = r9.A01
            r5 = 5839(0x16cf, float:8.182E-42)
            X.0yV r4 = X.C21000yV.A02
            boolean r4 = X.C20800yB.A01(r4, r10, r5)
            if (r4 == 0) goto L_0x019b
            java.lang.String r4 = r0.A0H
            r2.A0X = r4
            java.lang.String r4 = r0.A0I
            r2.A0Y = r4
            long r4 = r0.A08
            r2.A0D = r4
            com.whatsapp.jid.Jid r13 = r2.A06(r7)
            com.whatsapp.jid.UserJid r13 = (com.whatsapp.jid.UserJid) r13
            if (r13 == 0) goto L_0x019b
            X.16D r11 = r9.A00
            long r4 = r2.A0D
            java.lang.String r10 = r2.A0X
            java.lang.String r9 = r2.A0Y
            r24 = r11
            r25 = r13
            r26 = r10
            r27 = r9
            r28 = r4
            r24.A0g(r25, r26, r27, r28)
        L_0x019b:
            X.9Rr r4 = r6.A08
            if (r4 == 0) goto L_0x01c3
            boolean r4 = r4.A03
            if (r4 == 0) goto L_0x01c3
            com.whatsapp.jid.UserJid r4 = r8.A07
            if (r4 == 0) goto L_0x01c3
            X.1Ob r5 = r3.A09
            boolean r4 = r2.A0y
            boolean r8 = r8.A0O
            if (r4 == r8) goto L_0x01be
            r2.A0y = r8
            X.16D r8 = r5.A00
            com.whatsapp.jid.Jid r5 = r2.A06(r7)
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            boolean r4 = r2.A0y
            r8.A0h(r5, r4)
        L_0x01be:
            X.1Of r4 = r3.A0D
            r4.A00(r0, r2, r12)
        L_0x01c3:
            X.9Rr r4 = r6.A07
            if (r4 == 0) goto L_0x0229
            boolean r4 = r4.A03
            if (r4 == 0) goto L_0x0229
            X.1OZ r8 = r3.A08
            int r4 = r0.A04
            r10 = 2
            if (r4 == r10) goto L_0x027b
            int r11 = r0.A02
            r4 = -1
            if (r11 == r4) goto L_0x027b
            java.lang.String r13 = r0.A0G
            java.lang.String r4 = "image"
            boolean r14 = r4.equals(r13)
            r4 = r43
            if (r14 == 0) goto L_0x01e7
            int r9 = r2.A05
            if (r9 != r11) goto L_0x01f3
        L_0x01e7:
            java.lang.String r9 = "preview"
            boolean r9 = r9.equals(r13)
            if (r9 == 0) goto L_0x025b
            int r9 = r2.A06
            if (r9 == r11) goto L_0x025b
        L_0x01f3:
            java.lang.String r9 = r0.A0E
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L_0x0252
            com.whatsapp.jid.UserJid r15 = r0.A0D
            r28 = 0
            java.lang.String r13 = r0.A0E
            java.lang.String r11 = r0.A0F
            int r10 = r0.A02
            java.lang.String r14 = r0.A0G
            java.lang.String r9 = "preview"
            boolean r9 = r9.equals(r14)
            r31 = 1
            if (r9 == 0) goto L_0x0213
            r31 = 2
        L_0x0213:
            X.5xp r9 = new X.5xp
            r24 = r9
            r25 = r15
            r26 = r13
            r27 = r11
            r29 = r28
            r30 = r10
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
            X.1OC r8 = r8.A01
            r8.A01(r9, r4)
        L_0x0229:
            X.9Rr r4 = r6.A01
            if (r4 == 0) goto L_0x0345
            boolean r4 = r4.A03
            if (r4 == 0) goto L_0x0345
            X.1Oa r4 = r3.A03
            boolean r5 = r2.A0t
            if (r5 != 0) goto L_0x0345
            r9 = 1
            r2.A0t = r9
            X.16D r8 = r4.A02
            com.whatsapp.jid.Jid r10 = r2.A06(r7)
            X.16p r7 = r8.A05
            android.content.ContentValues r13 = new android.content.ContentValues
            r13.<init>(r9)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r9)
            java.lang.String r4 = "is_business_synced"
            r13.put(r4, r5)
            goto L_0x02fe
        L_0x0252:
            X.AnonymousClass1OZ.A00(r8, r0)
            java.lang.String r4 = "ContactSyncPictureUpdater/update photo id doesn't match the existing one in db"
            com.whatsapp.util.Log.e((java.lang.String) r4)
            goto L_0x0229
        L_0x025b:
            X.1O9 r9 = r8.A02
            if (r14 != 0) goto L_0x0260
            r10 = 1
        L_0x0260:
            long r13 = android.os.SystemClock.elapsedRealtime()
            long r13 = r13 - r43
            java.lang.Long r26 = java.lang.Long.valueOf(r13)
            r25 = 0
            r27 = 1
            r29 = 200(0xc8, float:2.8E-43)
            r24 = r9
            r28 = r10
            r24.A00(r25, r26, r27, r28, r29)
            X.AnonymousClass1OZ.A00(r8, r0)
            goto L_0x0229
        L_0x027b:
            X.AnonymousClass1OZ.A00(r8, r0)
            com.whatsapp.jid.UserJid r4 = r0.A0D
            if (r4 == 0) goto L_0x0229
            X.1O7 r5 = r8.A00
            r5.A02(r4)
            goto L_0x0229
        L_0x0288:
            if (r14 != 0) goto L_0x02a9
            int r9 = r0.A04
            if (r9 != r10) goto L_0x015c
        L_0x028e:
            long r9 = r2.A0D
            int r14 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r14 > 0) goto L_0x0298
            java.lang.String r9 = r2.A0X
            if (r9 == 0) goto L_0x015c
        L_0x0298:
            r2.A0X = r13
            r2.A0D = r4
            X.16D r10 = r11.A00
            com.whatsapp.jid.Jid r9 = r2.A06(r7)
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9
            r10.A0f(r9, r13, r4)
            goto L_0x015a
        L_0x02a9:
            r9 = 3
            if (r9 != r14) goto L_0x0728
            X.0yC r13 = r11.A02
            r10 = 5839(0x16cf, float:8.182E-42)
            X.0yV r9 = X.C21000yV.A02
            boolean r9 = X.C20800yB.A01(r9, r13, r10)
            if (r9 != 0) goto L_0x015c
            X.0wG r9 = r11.A01
            android.content.Context r9 = r9.A00
            android.content.res.Resources r10 = r9.getResources()
            r9 = 2131888648(0x7f120a08, float:1.9411937E38)
            java.lang.String r9 = r10.getString(r9)
            r2.A0X = r9
            r2.A0D = r4
            X.16D r11 = r11.A00
            com.whatsapp.jid.Jid r10 = r2.A06(r7)
            com.whatsapp.jid.UserJid r10 = (com.whatsapp.jid.UserJid) r10
            java.lang.String r9 = r2.A0X
            r11.A0f(r10, r9, r4)
            goto L_0x015c
        L_0x02da:
            boolean r4 = r5 instanceof X.C223313w
            if (r4 == 0) goto L_0x011c
            X.13v r5 = (X.C223213v) r5
            goto L_0x011a
        L_0x02e2:
            X.16y r4 = r10.A00
            r4.A04(r5, r9)
            goto L_0x011c
        L_0x02e9:
            boolean r4 = X.AnonymousClass143.A0I(r9)
            if (r4 == 0) goto L_0x00fa
            boolean r5 = r2.A0y
            boolean r4 = r8.A0O
            if (r5 == r4) goto L_0x00fa
            r2.A0y = r4
            X.16D r5 = r10.A00
            r5.A0h(r9, r4)
            goto L_0x00fa
        L_0x02fe:
            X.16r r4 = r7.A00     // Catch:{ IllegalArgumentException -> 0x0321 }
            X.1M0 r11 = r4.A04()     // Catch:{ IllegalArgumentException -> 0x0321 }
            java.lang.String r7 = "wa_contacts"
            java.lang.String r5 = "jid = ?"
            java.lang.String[] r4 = new java.lang.String[r9]     // Catch:{ all -> 0x0317 }
            java.lang.String r14 = r10.getRawString()     // Catch:{ all -> 0x0317 }
            r4[r12] = r14     // Catch:{ all -> 0x0317 }
            X.C229416o.A01(r13, r11, r7, r5, r4)     // Catch:{ all -> 0x0317 }
            r11.close()     // Catch:{ IllegalArgumentException -> 0x0321 }
            goto L_0x033e
        L_0x0317:
            r4 = move-exception
            r11.close()     // Catch:{ all -> 0x031c }
            goto L_0x0320
        L_0x031c:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch:{ IllegalArgumentException -> 0x0321 }
        L_0x0320:
            throw r4     // Catch:{ IllegalArgumentException -> 0x0321 }
        L_0x0321:
            r7 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r4 = "contact-mgr-db/unable to update contact business sync "
            r5.append(r4)
            r5.append(r10)
            java.lang.String r4 = ", "
            r5.append(r4)
            r5.append(r9)
            java.lang.String r4 = r5.toString()
            X.C18740tg.A08(r4, r7)
        L_0x033e:
            X.16z r4 = r8.A04
            java.util.Map r4 = r4.A01
            r4.remove(r10)
        L_0x0345:
            X.9Rr r4 = r6.A03
            if (r4 == 0) goto L_0x03c2
            X.1OX r13 = r3.A04
            X.17i r10 = r13.A04
            X.3QO r9 = r10.A05(r1)
            int r4 = r0.A00
            r11 = 1
            if (r4 != r11) goto L_0x0390
            long r4 = r10.A01(r1)
            long r7 = r0.A06
            int r14 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r14 <= 0) goto L_0x043c
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r11 = "contactsyncDevicesupdater/update/timestamp is less than existing one, current="
            r14.append(r11)
            r14.append(r4)
            java.lang.String r11 = "; new time="
            r14.append(r11)
            r14.append(r7)
            java.lang.String r7 = r14.toString()
            com.whatsapp.util.Log.w((java.lang.String) r7)
            X.1OD r7 = r13.A02
            r7.A0C(r1, r4)
            X.1OE r11 = r13.A03
            long r7 = r0.A06
            r27 = 0
            r24 = r11
            r25 = r4
            r28 = r7
            r24.A03(r25, r27, r28)
        L_0x0390:
            r11 = 0
        L_0x0391:
            X.3QO r5 = r10.A05(r1)
            r8 = 0
            if (r9 != 0) goto L_0x0429
            if (r5 != 0) goto L_0x0429
        L_0x039a:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r11)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r8)
            X.00I r5 = new X.00I
            r5.<init>(r7, r4)
            java.lang.Object r4 = r5.A00
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x03b3
            int r20 = r20 + 1
        L_0x03b3:
            java.lang.Object r4 = r5.A01
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x03c2
            r4 = r23
            r4.add(r1)
        L_0x03c2:
            X.9Rr r4 = r6.A06
            if (r4 == 0) goto L_0x060a
            X.1OY r5 = r3.A07
            X.1EV r4 = r5.A01
            boolean r4 = r4.A0D()
            if (r4 == 0) goto L_0x060a
            X.9Ll r4 = r0.A0B
            if (r4 == 0) goto L_0x060a
            X.16S r13 = r5.A00
            boolean r5 = r4.A01
            java.lang.Boolean r26 = java.lang.Boolean.valueOf(r5)
            java.lang.String r11 = r4.A00
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.util.HashMap r4 = r4.A02
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x05ab
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r9 = r4.iterator()
        L_0x03f3:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L_0x05ab
            java.lang.Object r5 = r9.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r4 = r5.getKey()
            java.lang.Number r4 = (java.lang.Number) r4
            int r7 = r4.intValue()
            java.lang.Object r5 = r5.getValue()
            X.9Hf r5 = (X.C192499Hf) r5
            r8 = 3
            r4 = 1
            if (r7 == r4) goto L_0x0418
            r4 = 3
            r8 = 1
            if (r7 == r4) goto L_0x0418
            r8 = 0
        L_0x0418:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r7 = r5.A01
            java.lang.String r5 = r5.A00
            X.00I r4 = new X.00I
            r4.<init>(r7, r5)
            r10.put(r8, r4)
            goto L_0x03f3
        L_0x0429:
            r4 = 1
            if (r9 != 0) goto L_0x0433
            int r7 = r5.A00
        L_0x042e:
            if (r7 != r4) goto L_0x039a
        L_0x0430:
            r8 = 1
            goto L_0x039a
        L_0x0433:
            int r7 = r9.A00
            if (r5 == 0) goto L_0x042e
            int r4 = r5.A00
            if (r7 == r4) goto L_0x039a
            goto L_0x0430
        L_0x043c:
            X.0wQ r14 = r13.A00
            r14.A0G()
            com.whatsapp.jid.PhoneUserJid r4 = r14.A03
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x0461
            boolean r4 = r14.A0L()
            if (r4 != 0) goto L_0x0461
            X.19g r5 = r13.A01
            java.util.Map r4 = r0.A0L
            if (r4 != 0) goto L_0x045c
            r4 = 0
        L_0x0456:
            boolean r11 = r5.A0E(r4, r11, r12)
            goto L_0x0391
        L_0x045c:
            X.0wy r4 = X.C20070wy.copyOf((java.util.Map) r4)
            goto L_0x0456
        L_0x0461:
            byte[] r4 = r0.A0N
            if (r4 != 0) goto L_0x04f0
            java.util.Map r4 = r0.A0L
            if (r4 == 0) goto L_0x048c
            java.util.Set r4 = r4.keySet()
            java.util.Iterator r5 = r4.iterator()
        L_0x0471:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L_0x048c
            java.lang.Object r4 = r5.next()
            com.whatsapp.jid.DeviceJid r4 = (com.whatsapp.jid.DeviceJid) r4
            int r4 = r4.getDevice()
            if (r4 == 0) goto L_0x0471
            X.1OE r5 = r13.A03
            r4 = 6
            r11 = 0
            r5.A01(r4, r12)
            goto L_0x0391
        L_0x048c:
            r14.A0G()
            com.whatsapp.jid.PhoneUserJid r4 = r14.A03
            boolean r4 = r1.equals(r4)
            r4 = r4 ^ 1
            X.C18740tg.A0C(r4)
            long r7 = r0.A06
            long r4 = r0.A05
            r24 = r13
            r25 = r1
            r26 = r7
            r28 = r4
            boolean r11 = X.AnonymousClass1OX.A01(r24, r25, r26, r28)
            X.3QO r8 = r10.A05(r1)
            java.util.Map r4 = r0.A0L
            if (r4 != 0) goto L_0x04eb
            X.0wy r15 = X.C20070wy.of()
        L_0x04b6:
            java.util.Map r4 = r0.A0L
            if (r4 == 0) goto L_0x04dc
            X.0wy r13 = X.C20070wy.copyOf((java.util.Map) r4)
        L_0x04be:
            if (r8 != 0) goto L_0x04c7
            r4 = 0
        L_0x04c1:
            boolean r11 = r10.A0H(r13, r4, r1, r11)
            goto L_0x0391
        L_0x04c7:
            int r7 = r8.A01
            long r4 = r0.A06
            X.0y7 r24 = r15.keySet()
            r25 = r8
            r26 = r7
            r27 = r4
            r29 = r11
            X.3QO r4 = X.AnonymousClass1OX.A00(r24, r25, r26, r27, r29)
            goto L_0x04c1
        L_0x04dc:
            com.whatsapp.jid.DeviceJid r5 = r1.getPrimaryDevice()
            r13 = 0
            java.lang.Long r4 = java.lang.Long.valueOf(r13)
            X.0wy r13 = X.C20070wy.of(r5, r4)
            goto L_0x04be
        L_0x04eb:
            X.0wy r15 = X.C20070wy.copyOf((java.util.Map) r4)
            goto L_0x04b6
        L_0x04f0:
            X.1OD r11 = r13.A02
            X.00I r4 = r11.A06(r1, r4)
            if (r4 == 0) goto L_0x0591
            java.lang.Object r8 = r4.A00
            if (r8 == 0) goto L_0x0591
            X.8RP r8 = (X.AnonymousClass8RP) r8
            java.lang.Object r7 = r4.A01
            X.3FZ r7 = (X.AnonymousClass3FZ) r7
            if (r8 == 0) goto L_0x0591
            long r15 = r0.A06
            long r4 = r0.A05
            r24 = r13
            r25 = r1
            r26 = r15
            r28 = r4
            boolean r29 = X.AnonymousClass1OX.A01(r24, r25, r26, r28)
            r14.A0G()
            com.whatsapp.jid.PhoneUserJid r4 = r14.A03
            X.C18740tg.A06(r4)
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x058c
            X.0wy r4 = X.C231417i.A00(r10, r12)
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>(r4)
        L_0x052b:
            X.3QO r25 = r10.A05(r1)
            java.util.Map r5 = r0.A0L
            if (r5 != 0) goto L_0x0534
            r5 = r13
        L_0x0534:
            X.B62 r14 = r8.validIndexes_
            int r4 = r8.currentIndex_
            java.util.HashMap r4 = r11.A08(r14, r13, r5, r4)
            X.0wy r5 = X.C20070wy.copyOf((java.util.Map) r4)
            int r4 = r8.rawId_
            long r13 = r8.timestamp_
            X.0y7 r24 = r5.keySet()
            r26 = r4
            r27 = r13
            X.3QO r13 = X.AnonymousClass1OX.A00(r24, r25, r26, r27, r29)
            long r14 = r0.A06
            X.36h r4 = new X.36h
            r4.<init>(r5, r13, r11)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r29)
            X.00I r5 = new X.00I
            r5.<init>(r4, r13)
            X.0wn r4 = new X.0wn
            r4.<init>(r5)
            r24 = r11
            r25 = r1
            r26 = r8
            r27 = r4
            r28 = r14
            boolean r4 = X.AnonymousClass1OD.A04(r24, r25, r26, r27, r28)
            if (r4 != 0) goto L_0x0599
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r4 = "contactsyncDevicesupdater/update/verifyAndUpdateKeyIndexListData indexList fail, userJid="
        L_0x057c:
            r5.append(r4)
            r5.append(r1)
            java.lang.String r4 = r5.toString()
            com.whatsapp.util.Log.w((java.lang.String) r4)
            r11 = 0
            goto L_0x0391
        L_0x058c:
            java.util.Map r13 = r10.A0C(r1)
            goto L_0x052b
        L_0x0591:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r4 = "contactsyncDevicesupdater/update/verifyADVSignedKeyIndexList fail keyIndexListNull, userJid="
            goto L_0x057c
        L_0x0599:
            if (r7 == 0) goto L_0x05a8
            X.189 r5 = r11.A07
            com.whatsapp.jid.DeviceJid r4 = r1.getPrimaryDevice()
            X.6EZ r4 = X.C133256Xm.A02(r4)
            r5.A0Q(r7, r4)
        L_0x05a8:
            r11 = 1
            goto L_0x0391
        L_0x05ab:
            X.9Ll r4 = r0.A0B
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.util.HashMap r4 = r4.A03
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x05f8
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r14 = r4.iterator()
        L_0x05c2:
            boolean r4 = r14.hasNext()
            if (r4 == 0) goto L_0x05f8
            java.lang.Object r5 = r14.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r4 = r5.getKey()
            java.lang.Number r4 = (java.lang.Number) r4
            int r7 = r4.intValue()
            java.lang.Object r5 = r5.getValue()
            X.9Hg r5 = (X.C192509Hg) r5
            r8 = 3
            r4 = 1
            if (r7 == r4) goto L_0x05e7
            r4 = 3
            r8 = 1
            if (r7 == r4) goto L_0x05e7
            r8 = 0
        L_0x05e7:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r7 = r5.A01
            java.lang.String r5 = r5.A00
            X.00I r4 = new X.00I
            r4.<init>(r7, r5)
            r9.put(r8, r4)
            goto L_0x05c2
        L_0x05f8:
            r24 = r13
            r25 = r1
            r27 = r11
            r28 = r10
            r29 = r9
            boolean r1 = r24.A0I(r25, r26, r27, r28, r29)
            if (r1 == 0) goto L_0x060a
            int r18 = r18 + 1
        L_0x060a:
            X.9Rr r1 = r6.A04
            if (r1 == 0) goto L_0x062c
            X.1Og r9 = r3.A05
            com.whatsapp.jid.UserJid r8 = r0.A0D
            if (r8 == 0) goto L_0x062c
            int r1 = r2.A01
            int r7 = r0.A01
            if (r1 == r7) goto L_0x062c
            long r4 = r2.A09
            long r1 = r0.A07
            int r10 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r10 >= 0) goto L_0x062c
            r4 = -1
            if (r7 == r4) goto L_0x062c
            X.16D r4 = r9.A00
            r4.A0e(r8, r7, r1)
            int r19 = r19 + 1
        L_0x062c:
            X.9Rr r1 = r6.A00
            if (r1 == 0) goto L_0x06f3
            X.0v5 r2 = r3.A00
            boolean r1 = r2.A05()
            if (r1 == 0) goto L_0x06f3
            java.lang.Object r3 = r2.A02()
            X.1Oe r3 = (X.C27431Oe) r3
            com.whatsapp.jid.UserJid r13 = r0.A0D
            if (r13 == 0) goto L_0x06f3
            X.6E0 r2 = r0.A0A
            if (r2 == 0) goto L_0x06f3
            boolean r1 = r2.A0A
            if (r1 != 0) goto L_0x06f3
            X.005 r1 = r3.A00
            java.lang.Object r11 = r1.get()
            X.6BB r11 = (X.AnonymousClass6BB) r11
            int r15 = r2.A00
            java.lang.String r10 = r2.A06
            java.lang.String r24 = ""
            if (r10 != 0) goto L_0x065c
            r10 = r24
        L_0x065c:
            java.lang.Boolean r1 = r2.A01
            if (r1 == 0) goto L_0x069e
            boolean r36 = r1.booleanValue()
        L_0x0664:
            java.lang.String r9 = r2.A02
            if (r9 != 0) goto L_0x066a
            r9 = r24
        L_0x066a:
            java.lang.String r8 = r2.A04
            if (r8 != 0) goto L_0x0670
            r8 = r24
        L_0x0670:
            java.util.List r4 = r2.A09
            r3 = 10
            int r1 = X.AnonymousClass03U.A06(r4, r3)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r1)
            java.util.Iterator r6 = r4.iterator()
        L_0x0681:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x06a1
            java.lang.Object r1 = r6.next()
            X.6A7 r1 = (X.AnonymousClass6A7) r1
            java.lang.String r5 = r1.A01
            java.lang.String r4 = r1.A00
            if (r4 != 0) goto L_0x0695
            r4 = r24
        L_0x0695:
            X.69W r1 = new X.69W
            r1.<init>(r5, r4)
            r7.add(r1)
            goto L_0x0681
        L_0x069e:
            r36 = 0
            goto L_0x0664
        L_0x06a1:
            java.lang.String r6 = r2.A03
            java.lang.String r5 = r2.A07
            java.lang.String r4 = r2.A05
            java.util.List r2 = r2.A08
            int r1 = X.AnonymousClass03U.A06(r2, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r1)
            java.util.Iterator r16 = r2.iterator()
        L_0x06b6:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x06d3
            java.lang.Object r1 = r16.next()
            X.6A6 r1 = (X.AnonymousClass6A6) r1
            java.lang.String r14 = r1.A01
            java.lang.String r2 = r1.A00
            if (r2 != 0) goto L_0x06ca
            r2 = r24
        L_0x06ca:
            X.3uw r1 = new X.3uw
            r1.<init>(r14, r2)
            r3.add(r1)
            goto L_0x06b6
        L_0x06d3:
            r29 = 0
            X.6E1 r1 = new X.6E1
            r24 = r1
            r25 = r13
            r26 = r10
            r27 = r9
            r28 = r8
            r30 = r6
            r31 = r5
            r32 = r4
            r33 = r7
            r34 = r3
            r35 = r15
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r11.A02(r1)
        L_0x06f3:
            com.whatsapp.jid.UserJid r2 = r0.A0D
            if (r2 == 0) goto L_0x001a
            X.3Mv r3 = X.C64153Mv.A01
            java.util.Set r0 = X.C64153Mv.A04
            boolean r0 = r0.add(r2)
            if (r0 == 0) goto L_0x001a
            monitor-enter(r3)
            X.11F r0 = X.C64153Mv.A00     // Catch:{ all -> 0x0725 }
            boolean r0 = X.AnonymousClass00C.A0J(r0, r2)     // Catch:{ all -> 0x0725 }
            if (r0 != 0) goto L_0x0722
            java.util.List r0 = X.C64153Mv.A02     // Catch:{ all -> 0x0725 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0725 }
        L_0x0710:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0725 }
            if (r0 == 0) goto L_0x0720
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0725 }
            X.02t r0 = (X.C006302t) r0     // Catch:{ all -> 0x0725 }
            r0.invoke(r2)     // Catch:{ all -> 0x0725 }
            goto L_0x0710
        L_0x0720:
            X.C64153Mv.A00 = r2     // Catch:{ all -> 0x0725 }
        L_0x0722:
            monitor-exit(r3)
            goto L_0x001a
        L_0x0725:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0728:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "unrecognized status type="
            r1.append(r0)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x073f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "syncUser with type="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " cannot be updated"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x075b:
            X.9Rr r0 = r6.A01
            if (r0 == 0) goto L_0x080c
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x080c
            X.1KK r0 = r3.A01
            java.util.HashMap r0 = r0.A0A()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>(r0)
            X.1Oa r1 = r3.A03
            r5 = r42
            r0 = r22
            X.3Ix r8 = r1.A00(r0, r4, r2, r5)
            int r12 = r8.A00
            X.0xU r7 = r3.A02
            X.0y7 r6 = X.C20760y7.copyOf((java.util.Collection) r23)
            r0 = 1
            X.AnonymousClass00C.A0D(r6, r0)
            X.0y7 r1 = r8.A01
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x080c
            java.util.Iterator r9 = r1.iterator()
        L_0x0790:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x080c
            java.lang.Object r5 = r9.next()
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            boolean r0 = r6.contains(r5)
            if (r0 != 0) goto L_0x0790
            X.005 r0 = r7.A05
            java.lang.Object r0 = r0.get()
            X.18y r0 = (X.C235618y) r0
            boolean r0 = r0.A01(r5)
            if (r0 != 0) goto L_0x0790
            X.AnonymousClass00C.A0B(r5)
            java.util.Map r0 = r8.A02
            java.lang.Object r4 = r0.get(r5)
            X.3L0 r4 = (X.AnonymousClass3L0) r4
            X.185 r0 = r7.A03
            X.3L0 r0 = r0.A02(r5)
            r3 = 0
            if (r0 == 0) goto L_0x0809
            X.3ur r23 = r0.A00()
        L_0x07c8:
            int r29 = X.AnonymousClass3U1.A00(r0)
            if (r0 == 0) goto L_0x0806
            int r2 = r0.A03
            java.lang.String r1 = r0.A08
        L_0x07d2:
            if (r4 == 0) goto L_0x0800
            int r0 = r4.A03
            java.lang.String r3 = r4.A08
            X.3ur r22 = r4.A00()
            int r28 = X.AnonymousClass3U1.A00(r4)
        L_0x07e0:
            X.3TT r21 = new X.3TT
            r24 = r3
            r25 = r1
            r26 = r0
            r27 = r2
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29)
            X.3H2 r1 = r21.A02()
            X.00T r0 = r7.A06
            java.lang.Object r0 = r0.getValue()
            X.0xM r0 = (X.C20310xM) r0
            X.AnonymousClass00C.A0B(r1)
            r0.A0c(r5, r1)
            goto L_0x0790
        L_0x0800:
            r22 = r3
            r28 = r29
            r0 = 0
            goto L_0x07e0
        L_0x0806:
            r1 = r3
            r2 = 0
            goto L_0x07d2
        L_0x0809:
            r23 = r3
            goto L_0x07c8
        L_0x080c:
            r2 = r39
            if (r39 == 0) goto L_0x083b
            r0 = r17
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0H = r0
            r0 = r20
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A07 = r0
            long r0 = (long) r12
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A05 = r0
            r0 = r18
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0C = r0
            r0 = r19
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A08 = r0
        L_0x083b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1OT.A01(X.9OU, X.58o, java.util.List, java.util.Map, java.util.Map, long):void");
    }
}
