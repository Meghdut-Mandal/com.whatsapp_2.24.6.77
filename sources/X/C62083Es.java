package X;

import android.content.Context;

/* renamed from: X.3Es  reason: invalid class name and case insensitive filesystem */
public class C62083Es {
    public final C87604Pl A00;
    public final C20810yC A01;
    public final Context A02;
    public final AnonymousClass17Y A03;
    public final AnonymousClass16D A04;
    public final C64403Nv A05;
    public final AnonymousClass1A5 A06;

    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02d1, code lost:
        if (r13.getBoolean("has_number_from_url") != false) goto L_0x02d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02ea, code lost:
        if (r13.getBoolean("has_text_from_url") != false) goto L_0x02ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x030f, code lost:
        if (r13.getBoolean("added_by_qr_code") != false) goto L_0x0311;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0328, code lost:
        if (r13.getBoolean("added_by_number_search") != false) goto L_0x032a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0073 A[Catch:{ NameNotFoundException -> 0x0084 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass3BR A00(android.content.Intent r12, android.os.Bundle r13, boolean r14) {
        /*
            r11 = this;
            X.3BS r2 = new X.3BS
            r2.<init>()
            r3 = 1
            if (r12 == 0) goto L_0x0491
            X.3Nv r4 = r11.A05
            java.util.List r5 = r4.A04
            r5.clear()
            X.0yC r1 = r4.A01
            r0 = 2377(0x949, float:3.331E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x012a
            java.lang.String r8 = "]"
            java.lang.String r7 = "_ci_"
            boolean r6 = r12.hasExtra(r7)
            java.lang.String r1 = "authentication_token"
            boolean r0 = r12.hasExtra(r1)
            if (r6 != 0) goto L_0x005f
            if (r0 != 0) goto L_0x0058
            java.lang.String r0 = "noCallerInfo"
        L_0x002d:
            r5.add(r0)
        L_0x0030:
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            android.os.Bundle r0 = r12.getExtras()
            if (r0 == 0) goto L_0x012a
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r7 = r0.iterator()
        L_0x0042:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0095
            java.lang.Object r1 = r7.next()
            java.util.Set r0 = X.C64403Nv.A05
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0042
            r6.add(r1)
            goto L_0x0042
        L_0x0058:
            android.os.Parcelable r0 = r12.getParcelableExtra(r1)     // Catch:{ BadParcelableException -> 0x0092 }
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0     // Catch:{ BadParcelableException -> 0x0092 }
            goto L_0x0065
        L_0x005f:
            android.os.Parcelable r0 = r12.getParcelableExtra(r7)     // Catch:{ BadParcelableException -> 0x0092 }
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0     // Catch:{ BadParcelableException -> 0x0092 }
        L_0x0065:
            java.lang.String r6 = r0.getCreatorPackage()
            X.1VG r0 = r4.A03     // Catch:{ NameNotFoundException -> 0x0084 }
            X.6Ef r0 = r0.A01(r6)     // Catch:{ NameNotFoundException -> 0x0084 }
            boolean r0 = r0.A03     // Catch:{ NameNotFoundException -> 0x0084 }
            if (r0 != 0) goto L_0x012a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ NameNotFoundException -> 0x0084 }
            java.lang.String r0 = "untrustedPackage["
            X.AnonymousClass000.A1D(r0, r6, r8, r1)     // Catch:{ NameNotFoundException -> 0x0084 }
            java.lang.String r0 = r1.toString()     // Catch:{ NameNotFoundException -> 0x0084 }
            r5.add(r0)     // Catch:{ NameNotFoundException -> 0x0084 }
            goto L_0x0030
        L_0x0084:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "invalidPackage["
            X.AnonymousClass000.A1D(r0, r6, r8, r1)
            java.lang.String r0 = r1.toString()
            goto L_0x002d
        L_0x0092:
            java.lang.String r0 = "badParcelable"
            goto L_0x002d
        L_0x0095:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x012a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "notWhitelistedExtraKey"
            r1.append(r0)
            java.lang.Object[] r0 = r6.toArray()
            java.lang.String r0 = java.util.Arrays.toString(r0)
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            r5.add(r0)
            java.util.ArrayList r1 = X.AnonymousClass6XV.newArrayList()
            java.lang.String r0 = "android.intent.extra.STREAM"
            java.util.ArrayList r0 = r12.getParcelableArrayListExtra(r0)
            if (r0 == 0) goto L_0x00c2
            r1.addAll(r0)
        L_0x00c2:
            android.net.Uri r0 = r12.getData()
            r1.add(r0)
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            java.util.Iterator r10 = r1.iterator()
            r9 = 0
        L_0x00d2:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0102
            java.lang.Object r6 = r10.next()
            android.net.Uri r6 = (android.net.Uri) r6
            if (r6 == 0) goto L_0x00d2
            java.io.File r1 = X.AnonymousClass6YY.A03(r6)
            if (r1 == 0) goto L_0x00d2
            int r9 = r9 + 1
            X.1Aw r0 = r4.A02     // Catch:{ IOException -> 0x00ee }
            r0.A04(r1)     // Catch:{ IOException -> 0x00ee }
            goto L_0x00d2
        L_0x00ee:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "notExternalIntentUri["
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = X.AnonymousClass000.A0q(r8, r1)
            r7.add(r0)
            goto L_0x00d2
        L_0x0102:
            if (r9 == 0) goto L_0x010d
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x012a
            r5.addAll(r7)
        L_0x010d:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x012a
            java.lang.String r0 = " "
            java.lang.String r5 = X.AnonymousClass14B.A07(r0, r5)
            X.0wN r4 = r4.A00
            r1 = 0
            java.lang.String r0 = "ConversationIntentValidator/verifyIntent"
            r4.A0E(r0, r5, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ConversationIntentValidator/verifyIntent "
            X.C36321k7.A1R(r0, r5, r1)
        L_0x012a:
            android.content.Context r7 = r11.A02
            boolean r0 = X.AnonymousClass3M2.A01(r7, r12)
            r2.A0U = r0
            java.lang.String r0 = "fromNotification"
            r4 = 0
            boolean r0 = r12.getBooleanExtra(r0, r4)
            r2.A0Y = r0
            java.lang.String r0 = "fromCallNotification"
            boolean r0 = r12.getBooleanExtra(r0, r4)
            r2.A0X = r0
            java.lang.String r0 = "vcLobbyCallId"
            java.lang.String r0 = r12.getStringExtra(r0)
            r2.A0M = r0
            java.lang.String r0 = "jid"
            X.11F r0 = X.C36401kF.A0Z(r12, r0)
            r2.A08 = r0
            r6 = 2
            if (r0 != 0) goto L_0x01fa
            android.net.Uri r0 = r12.getData()
            r2.A03 = r0
            boolean r0 = X.AnonymousClass1U4.A01(r0)
            if (r0 == 0) goto L_0x019b
            X.16D r5 = r11.A04
            android.net.Uri r1 = r2.A03
            boolean r0 = X.AnonymousClass1U4.A01(r1)
            X.C18740tg.A0B(r0)
            long r0 = android.content.ContentUris.parseId(r1)
            X.141 r0 = r5.A05(r0)
            r2.A07 = r0
            if (r0 == 0) goto L_0x017f
            X.11F r0 = X.C36351kA.A0j(r0)
            r2.A08 = r0
        L_0x017f:
            r8 = 0
        L_0x0180:
            X.11F r0 = r2.A08
            if (r0 == 0) goto L_0x0269
            java.lang.String r0 = "mat_entry_point"
            int r0 = r12.getIntExtra(r0, r4)
            if (r0 != 0) goto L_0x0210
            X.11F r0 = r2.A08
            if (r0 == 0) goto L_0x0210
            X.0yC r1 = r11.A01
            r0 = 2939(0xb7b, float:4.118E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0210
            goto L_0x01fc
        L_0x019b:
            android.net.Uri r0 = r2.A03
            if (r0 == 0) goto L_0x048e
            java.lang.String r1 = r0.getScheme()
            java.lang.String r0 = "smsto"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01b9
            android.net.Uri r0 = r2.A03
            java.lang.String r1 = r0.getScheme()
            java.lang.String r0 = "sms"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x048e
        L_0x01b9:
            java.lang.String r1 = r12.getDataString()
            if (r1 != 0) goto L_0x01c3
            java.lang.String r0 = "conversation/sms/no uri"
            goto L_0x0493
        L_0x01c3:
            java.lang.String r0 = ":"
            java.lang.String[] r5 = r1.split(r0)
            int r0 = r5.length
            if (r0 != r6) goto L_0x048b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "conversation/sms-jid/raw-number "
            r1.append(r0)
            r0 = r5[r3]
            X.C36321k7.A1a(r1, r0)
            r0 = r5[r3]
            java.lang.String r1 = java.net.URLDecoder.decode(r0)
            X.16D r0 = r11.A04
            X.141 r0 = r0.A0F(r1)
            if (r0 == 0) goto L_0x047a
            r2.A07 = r0
            X.11F r5 = X.C36351kA.A0j(r0)
            r2.A08 = r5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "conversation/sms-jid:"
            X.C36321k7.A1K(r5, r0, r1)
            goto L_0x017f
        L_0x01fa:
            r8 = 1
            goto L_0x0180
        L_0x01fc:
            java.lang.String r0 = "ConversationIntentParser/remapJid"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x020c }
            X.4Pl r1 = r11.A00     // Catch:{ all -> 0x020c }
            X.11F r0 = r2.A08     // Catch:{ all -> 0x020c }
            X.11F r0 = r1.Boe(r0)     // Catch:{ all -> 0x020c }
            r2.A08 = r0     // Catch:{ all -> 0x020c }
            goto L_0x0210
        L_0x020c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x020e }
        L_0x020e:
            r0 = move-exception
            throw r0
        L_0x0210:
            X.16D r1 = r11.A04
            X.11F r0 = r2.A08
            X.141 r5 = r1.A08(r0)
            if (r5 != 0) goto L_0x0221
            X.11F r0 = r2.A08
            X.141 r5 = new X.141
            r5.<init>(r0)
        L_0x0221:
            boolean r0 = r5.A0G()
            if (r0 != 0) goto L_0x022d
            X.11F r0 = r5.A0H
            boolean r0 = r0 instanceof X.AnonymousClass146
            if (r0 == 0) goto L_0x0255
        L_0x022d:
            java.lang.String r0 = r5.A0J()
            if (r0 != 0) goto L_0x0255
            java.lang.String r0 = "displayname"
            java.lang.String r5 = r12.getStringExtra(r0)
            if (r5 == 0) goto L_0x0250
            java.lang.String r0 = "conversation/create/group-shortcut-removed"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.17Y r1 = r11.A03
            r0 = 2131890255(0x7f12104f, float:1.9415197E38)
            java.lang.String r0 = X.C36351kA.A0w(r7, r5, r3, r0)
            r1.A0E(r0, r3)
            r2.A02 = r6
            goto L_0x0498
        L_0x0250:
            X.11F r0 = r2.A08
            r1.A0D(r0)
        L_0x0255:
            X.11F r5 = r2.A08
            boolean r0 = X.AnonymousClass143.A0E(r5)
            if (r0 != 0) goto L_0x0269
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "conversation/create/cannot-start-conversation-with-jid: "
            java.lang.String r0 = X.AnonymousClass000.A0l(r5, r0, r1)
            goto L_0x0493
        L_0x0269:
            if (r8 == 0) goto L_0x0294
            X.0yC r0 = r11.A01
            boolean r0 = X.C36401kF.A1Y(r0)
            X.1A5 r8 = r11.A06
            X.11F r7 = r2.A08
            if (r0 == 0) goto L_0x02b0
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            X.0wU r5 = r8.A05
            r1 = 7
            X.1j0 r0 = new X.1j0
            r0.<init>(r8, r6, r7, r1)
            r5.Boy(r0)
            int r0 = r6.size()
            if (r0 != 0) goto L_0x02a9
            X.16D r0 = r8.A02
            X.141 r0 = r0.A0D(r7)
        L_0x0292:
            r2.A07 = r0
        L_0x0294:
            X.141 r0 = r2.A07
            if (r0 != 0) goto L_0x02b5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "conversation/start no contact for "
            r1.append(r0)
            X.11F r0 = r2.A08
            java.lang.String r0 = X.AnonymousClass000.A0o(r0, r1)
            goto L_0x0493
        L_0x02a9:
            java.lang.Object r0 = r6.get(r4)
            X.141 r0 = (X.AnonymousClass141) r0
            goto L_0x0292
        L_0x02b0:
            X.141 r0 = r8.A01(r7)
            goto L_0x0292
        L_0x02b5:
            java.lang.String r0 = "has_share"
            boolean r0 = r12.getBooleanExtra(r0, r4)
            r2.A0a = r0
            java.lang.String r0 = "number_from_url"
            boolean r0 = r12.getBooleanExtra(r0, r4)
            if (r0 == 0) goto L_0x03c6
            if (r14 == 0) goto L_0x02d3
            X.C18740tg.A06(r13)
            java.lang.String r0 = "has_number_from_url"
            boolean r1 = r13.getBoolean(r0)
            r0 = 0
            if (r1 == 0) goto L_0x02d4
        L_0x02d3:
            r0 = 1
        L_0x02d4:
            r2.A0Z = r0
        L_0x02d6:
            java.lang.String r0 = "text_from_url"
            boolean r0 = r12.getBooleanExtra(r0, r4)
            if (r0 == 0) goto L_0x03c2
            if (r14 == 0) goto L_0x02ec
            X.C18740tg.A06(r13)
            java.lang.String r0 = "has_text_from_url"
            boolean r1 = r13.getBoolean(r0)
            r0 = 0
            if (r1 == 0) goto L_0x02ed
        L_0x02ec:
            r0 = 1
        L_0x02ed:
            r2.A0b = r0
        L_0x02ef:
            java.lang.String r0 = "similar_newsletters_session_id"
            java.io.Serializable r1 = r12.getSerializableExtra(r0)
            boolean r0 = r1 instanceof java.lang.Long
            if (r0 == 0) goto L_0x02fd
            java.lang.Long r1 = (java.lang.Long) r1
            r2.A0D = r1
        L_0x02fd:
            java.lang.String r1 = "added_by_qr_code"
            boolean r0 = r12.getBooleanExtra(r1, r4)
            if (r0 == 0) goto L_0x0314
            if (r14 == 0) goto L_0x0311
            X.C18740tg.A06(r13)
            boolean r1 = r13.getBoolean(r1)
            r0 = 0
            if (r1 == 0) goto L_0x0312
        L_0x0311:
            r0 = 1
        L_0x0312:
            r2.A0T = r0
        L_0x0314:
            java.lang.String r0 = "contact_out_address_book"
            boolean r0 = r12.getBooleanExtra(r0, r4)
            if (r0 == 0) goto L_0x032d
            if (r14 == 0) goto L_0x032a
            X.C18740tg.A06(r13)
            java.lang.String r0 = "added_by_number_search"
            boolean r1 = r13.getBoolean(r0)
            r0 = 0
            if (r1 == 0) goto L_0x032b
        L_0x032a:
            r0 = 1
        L_0x032b:
            r2.A0S = r0
        L_0x032d:
            boolean r0 = r2.A0a
            if (r0 == 0) goto L_0x0399
            if (r14 != 0) goto L_0x0399
            boolean r0 = r2.A0U
            if (r0 == 0) goto L_0x0399
            java.lang.String r0 = "android.intent.extra.STREAM"
            java.util.ArrayList r0 = r12.getParcelableArrayListExtra(r0)
            r2.A0Q = r0
            java.lang.String r0 = "android.intent.extra.TEXT"
            java.lang.String r0 = r12.getStringExtra(r0)
            r2.A0H = r0
            java.lang.String r0 = "origin"
            int r0 = r12.getIntExtra(r0, r4)
            r2.A00 = r0
            java.lang.String r0 = "skip_preview"
            boolean r0 = r12.getBooleanExtra(r0, r4)
            r2.A0W = r0
            java.lang.String r0 = "vcard_name"
            java.lang.String r0 = r12.getStringExtra(r0)
            r2.A0O = r0
            java.lang.String r0 = "vcard_str"
            java.lang.String r0 = r12.getStringExtra(r0)
            r2.A0P = r0
            java.lang.String r0 = "vcard_array_str"
            java.util.ArrayList r0 = r12.getStringArrayListExtra(r0)
            r2.A0R = r0
            android.os.Bundle r0 = r12.getExtras()
            if (r0 == 0) goto L_0x0381
            android.os.Bundle r1 = r12.getExtras()
            java.lang.String r0 = "wa_type"
            int r0 = r1.getInt(r0)
            r2.A01 = r0
        L_0x0381:
            java.lang.String r0 = "share_msg"
            java.lang.String r0 = r12.getStringExtra(r0)
            r2.A0L = r0
            java.lang.String r0 = "iq_code"
            java.lang.String r0 = r12.getStringExtra(r0)
            r2.A0E = r0
            java.lang.String r0 = "confirm"
            boolean r0 = r12.getBooleanExtra(r0, r4)
            r2.A0V = r0
        L_0x0399:
            java.lang.String r1 = "new_group_result_bundle"
            android.os.Bundle r0 = r12.getBundleExtra(r1)
            if (r0 == 0) goto L_0x03a9
            if (r14 != 0) goto L_0x03a9
            android.os.Bundle r0 = r12.getBundleExtra(r1)
            r2.A04 = r0
        L_0x03a9:
            java.lang.String r1 = "product"
            android.os.Parcelable r0 = r12.getParcelableExtra(r1)
            if (r0 == 0) goto L_0x03b9
            android.os.Parcelable r0 = r12.getParcelableExtra(r1)
            X.9up r0 = (X.C207269up) r0
            r2.A05 = r0
        L_0x03b9:
            java.lang.String r1 = "business_jid"
            java.lang.String r0 = r12.getStringExtra(r1)
            if (r0 == 0) goto L_0x03dd
            goto L_0x03ca
        L_0x03c2:
            r2.A0b = r4
            goto L_0x02ef
        L_0x03c6:
            r2.A0Z = r4
            goto L_0x02d6
        L_0x03ca:
            java.lang.String r1 = r12.getStringExtra(r1)     // Catch:{ 0wR -> 0x03d7 }
            X.13r r0 = com.whatsapp.jid.UserJid.Companion     // Catch:{ 0wR -> 0x03d7 }
            com.whatsapp.jid.UserJid r0 = X.C222813r.A01(r1)     // Catch:{ 0wR -> 0x03d7 }
            r2.A0A = r0     // Catch:{ 0wR -> 0x03d7 }
            goto L_0x03dd
        L_0x03d7:
            r1 = move-exception
            java.lang.String r0 = "ConversationIntentParser/businessJid is not a user jid"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x03dd:
            java.lang.String r1 = "product_file"
            java.io.Serializable r0 = r12.getSerializableExtra(r1)
            if (r0 == 0) goto L_0x03ed
            java.io.Serializable r0 = r12.getSerializableExtra(r1)
            java.io.File r0 = (java.io.File) r0
            r2.A0B = r0
        L_0x03ed:
            java.lang.String r1 = "group_reply_jid"
            java.lang.String r0 = r12.getStringExtra(r1)
            if (r0 == 0) goto L_0x041f
            X.9up r0 = r2.A05
            if (r0 == 0) goto L_0x03fd
            java.lang.String r0 = "ConversationIntentParser/groupReplyAndProductShouldNotBothExist"
            goto L_0x0493
        L_0x03fd:
            java.lang.String r1 = r12.getStringExtra(r1)     // Catch:{ 0wR -> 0x041a }
            X.3Sl r0 = X.AnonymousClass147.A01     // Catch:{ 0wR -> 0x041a }
            X.147 r0 = X.C65533Sl.A04(r1)     // Catch:{ 0wR -> 0x041a }
            r2.A09 = r0     // Catch:{ 0wR -> 0x041a }
            java.lang.String r0 = "group_reply_subject"
            java.lang.String r0 = r12.getStringExtra(r0)     // Catch:{ 0wR -> 0x041a }
            r2.A0J = r0     // Catch:{ 0wR -> 0x041a }
            java.lang.String r0 = "group_reply_parent_group_jid"
            java.lang.String r0 = r12.getStringExtra(r0)     // Catch:{ 0wR -> 0x041a }
            r2.A0I = r0     // Catch:{ 0wR -> 0x041a }
            goto L_0x041f
        L_0x041a:
            java.lang.String r0 = "ConversationIntentParser/groupReplyJid is not a permanent group jid"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x041f:
            java.lang.String r1 = "entry_point_conversion_source"
            java.lang.String r0 = r12.getStringExtra(r1)
            if (r0 == 0) goto L_0x042d
            java.lang.String r0 = r12.getStringExtra(r1)
            r2.A0G = r0
        L_0x042d:
            java.lang.String r1 = "entry_point_conversion_app"
            java.lang.String r0 = r12.getStringExtra(r1)
            if (r0 == 0) goto L_0x043b
            java.lang.String r0 = r12.getStringExtra(r1)
            r2.A0F = r0
        L_0x043b:
            java.lang.String r3 = "extra_quoted_message_row_id"
            boolean r0 = r12.hasExtra(r3)
            if (r0 == 0) goto L_0x044f
            r0 = -1
            long r0 = r12.getLongExtra(r3, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0C = r0
        L_0x044f:
            java.lang.String r1 = "ctwa_deeplink_content"
            boolean r0 = r12.hasExtra(r1)
            if (r0 == 0) goto L_0x0461
            android.os.Bundle r1 = r12.getBundleExtra(r1)
            if (r1 != 0) goto L_0x0470
            X.3PE r0 = X.AnonymousClass3PE.A0L
        L_0x045f:
            r2.A06 = r0
        L_0x0461:
            java.lang.String r1 = "integrity_survey_session_info"
            boolean r0 = r12.hasExtra(r1)
            if (r0 == 0) goto L_0x0498
            java.lang.String r0 = r12.getStringExtra(r1)
            r2.A0K = r0
            goto L_0x0498
        L_0x0470:
            X.3PD r0 = new X.3PD
            r0.<init>()
            X.3PE r0 = X.AnonymousClass3PD.A00(r1)
            goto L_0x045f
        L_0x047a:
            java.lang.String r0 = "conversation/tell-a-friend"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "sms_body"
            java.lang.String r0 = r12.getStringExtra(r0)
            r2.A0N = r0
            r0 = 3
            r2.A02 = r0
            goto L_0x0498
        L_0x048b:
            java.lang.String r0 = "conversation/sms/no jid"
            goto L_0x0493
        L_0x048e:
            java.lang.String r0 = "conversation/start no jid"
            goto L_0x0493
        L_0x0491:
            java.lang.String r0 = "ConversationIntentParser/parse: fail to verify"
        L_0x0493:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r2.A02 = r3
        L_0x0498:
            X.3BR r0 = new X.3BR
            r0.<init>(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62083Es.A00(android.content.Intent, android.os.Bundle, boolean):X.3BR");
    }

    public C62083Es(AnonymousClass17Y r2, AnonymousClass16D r3, C87604Pl r4, C64403Nv r5, C19630wG r6, AnonymousClass1A5 r7, C20810yC r8) {
        this.A02 = r6.A00;
        this.A01 = r8;
        this.A03 = r2;
        this.A00 = r4;
        this.A04 = r3;
        this.A06 = r7;
        this.A05 = r5;
    }
}
