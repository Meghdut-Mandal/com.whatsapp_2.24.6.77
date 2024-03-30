package X;

import android.content.ContentValues;

/* renamed from: X.1LE  reason: invalid class name */
public final class AnonymousClass1LE extends C229416o {
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0045, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0049, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004d, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0050, code lost:
        throw r0;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:14:0x0035=Splitter:B:14:0x0035, B:18:0x003c=Splitter:B:18:0x003c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A05(com.whatsapp.jid.UserJid r8) {
        /*
            r7 = this;
            r6 = 0
            java.lang.String r5 = r8.getRawString()
            X.16r r0 = r7.A00
            X.1M0 r4 = r0.get()
            java.lang.String r2 = "SELECT automated_type FROM wa_biz_profiles WHERE jid = ?"
            r3 = 1
            java.lang.String[] r1 = new java.lang.String[r3]     // Catch:{ all -> 0x004a }
            r1[r6] = r5     // Catch:{ all -> 0x004a }
            java.lang.String r0 = "CONTACT_BUSINESS_AUTOMATED_TYPE"
            android.database.Cursor r2 = X.C229416o.A03(r4, r2, r0, r1)     // Catch:{ all -> 0x004a }
            java.lang.String r0 = "automated_type"
            int r1 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0043 }
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x003c
            boolean r0 = r2.isNull(r1)     // Catch:{ all -> 0x0043 }
            if (r0 != 0) goto L_0x003c
            int r1 = r2.getInt(r1)     // Catch:{ all -> 0x0043 }
            r0 = 2
            if (r1 == r3) goto L_0x0035
            r3 = 2
            if (r1 == r0) goto L_0x0035
            r3 = 0
        L_0x0035:
            r2.close()     // Catch:{ all -> 0x004a }
            r4.close()
            return r3
        L_0x003c:
            r2.close()     // Catch:{ all -> 0x004a }
            r4.close()
            return r6
        L_0x0043:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x004a }
            throw r0     // Catch:{ all -> 0x004a }
        L_0x004a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004c }
        L_0x004c:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1LE.A05(com.whatsapp.jid.UserJid):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:136:0x029b, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:?, code lost:
        X.C05600Qi.A00(r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x029f, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x05c2, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:?, code lost:
        X.C05600Qi.A00(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x05c6, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x05c9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x05cd, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x05de, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x05e2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x05e5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x05e6, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x05e9, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x03d3  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x03dc A[SYNTHETIC, Splitter:B:223:0x03dc] */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x03f3 A[SYNTHETIC, Splitter:B:230:0x03f3] */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x044b A[SYNTHETIC, Splitter:B:256:0x044b] */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0484  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x04b7 A[SYNTHETIC, Splitter:B:279:0x04b7] */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x04ce A[SYNTHETIC, Splitter:B:286:0x04ce] */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x0549  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:340:0x05d5=Splitter:B:340:0x05d5, B:336:0x05ce=Splitter:B:336:0x05ce} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C199179ep A06(com.whatsapp.jid.UserJid r22) {
        /*
            r21 = this;
            r6 = 0
            if (r22 != 0) goto L_0x0009
            java.lang.String r0 = "contact-mgr-db/cannot get business profile details by null jid"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r6
        L_0x0009:
            java.lang.String r18 = r22.getRawString()
            r0 = r21
            X.16r r0 = r0.A00
            r20 = r0
            X.1M0 r5 = r20.get()
            java.lang.String r2 = "SELECT _id, jid, email, business_description, address, tag, latitude, longitude, vertical, has_catalog, address_postal_code, address_city_id, address_city_name, commerce_experience, shop_url, cart_enabled, commerce_manager_url, direct_connection_enabled, is_shop_banned, default_postcode, location_name, galaxy_business_enabled, cover_photo_url, cover_photo_id, custom_url, member_since, capi_calling_enabled, is_responsive, postcode_type, price_tier_id, business_blocked_status, survey_sampling_rate, is_offerings_eligible, automated_type, welcome_message_protocol_mode FROM wa_biz_profiles WHERE jid = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x05e3 }
            r0 = 0
            r1[r0] = r18     // Catch:{ all -> 0x05e3 }
            java.lang.String r0 = "CONTACT_BIZ_PROFILES"
            android.database.Cursor r2 = X.C229416o.A03(r5, r2, r0, r1)     // Catch:{ all -> 0x05e3 }
            int r0 = r2.getCount()     // Catch:{ all -> 0x05dc }
            if (r0 == 0) goto L_0x05d5
            X.9ep r1 = new X.9ep     // Catch:{ all -> 0x05dc }
            r1.<init>()     // Catch:{ all -> 0x05dc }
            r4 = 0
            r9 = 1
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x05dc }
            r7 = 0
            if (r0 == 0) goto L_0x05d5
            X.13r r3 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x05dc }
            java.lang.String r0 = r2.getString(r9)     // Catch:{ all -> 0x05dc }
            com.whatsapp.jid.UserJid r0 = r3.A02(r0)     // Catch:{ all -> 0x05dc }
            if (r0 == 0) goto L_0x05d5
            int r17 = r2.getInt(r4)     // Catch:{ all -> 0x05dc }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r17)     // Catch:{ all -> 0x05dc }
            r1.A08 = r0     // Catch:{ all -> 0x05dc }
            r0 = 2
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x05dc }
            r1.A0H = r0     // Catch:{ all -> 0x05dc }
            r0 = 3
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x05dc }
            r1.A0G = r0     // Catch:{ all -> 0x05dc }
            r0 = 5
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x05dc }
            r1.A0L = r0     // Catch:{ all -> 0x05dc }
            r3 = 4
            r0 = 10
            java.lang.String r10 = r2.getString(r3)     // Catch:{ all -> 0x05dc }
            java.lang.String r8 = r2.getString(r0)     // Catch:{ all -> 0x05dc }
            r4 = 6
            r14 = 7
            r3 = 11
            r0 = 12
            java.lang.String r11 = r2.getString(r3)     // Catch:{ all -> 0x05dc }
            java.lang.String r15 = r2.getString(r0)     // Catch:{ all -> 0x05dc }
            boolean r0 = r2.isNull(r4)     // Catch:{ all -> 0x05dc }
            r13 = 0
            if (r0 == 0) goto L_0x0086
            r12 = r6
            goto L_0x008e
        L_0x0086:
            double r3 = r2.getDouble(r4)     // Catch:{ all -> 0x05dc }
            java.lang.Double r12 = java.lang.Double.valueOf(r3)     // Catch:{ all -> 0x05dc }
        L_0x008e:
            boolean r0 = r2.isNull(r14)     // Catch:{ all -> 0x05dc }
            if (r0 != 0) goto L_0x009c
            double r3 = r2.getDouble(r14)     // Catch:{ all -> 0x05dc }
            java.lang.Double r13 = java.lang.Double.valueOf(r3)     // Catch:{ all -> 0x05dc }
        L_0x009c:
            java.lang.String r0 = ""
            if (r11 != 0) goto L_0x00a1
            r11 = r0
        L_0x00a1:
            if (r15 == 0) goto L_0x00a4
            r0 = r15
        L_0x00a4:
            X.3XE r3 = new X.3XE     // Catch:{ all -> 0x05dc }
            r3.<init>(r12, r13, r11, r0)     // Catch:{ all -> 0x05dc }
            X.3XS r0 = new X.3XS     // Catch:{ all -> 0x05dc }
            r0.<init>(r3, r6, r10, r8)     // Catch:{ all -> 0x05dc }
            r1.A07 = r0     // Catch:{ all -> 0x05dc }
            r3 = 8
            boolean r0 = r2.isNull(r3)     // Catch:{ all -> 0x05dc }
            if (r0 != 0) goto L_0x00bc
            java.lang.String r7 = r2.getString(r3)     // Catch:{ all -> 0x05dc }
        L_0x00bc:
            r1.A0M = r7     // Catch:{ all -> 0x05dc }
            r0 = 9
            int r3 = r2.getInt(r0)     // Catch:{ all -> 0x05dc }
            r0 = 0
            if (r3 != r9) goto L_0x00c8
            r0 = 1
        L_0x00c8:
            r1.A0V = r0     // Catch:{ all -> 0x05dc }
            r0 = 13
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x05dc }
            r1.A0D = r0     // Catch:{ all -> 0x05dc }
            r0 = 14
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x05dc }
            r1.A0J = r0     // Catch:{ all -> 0x05dc }
            r0 = 15
            int r3 = r2.getInt(r0)     // Catch:{ all -> 0x05dc }
            r0 = 0
            if (r3 != r9) goto L_0x00e4
            r0 = 1
        L_0x00e4:
            r1.A0X = r0     // Catch:{ all -> 0x05dc }
            r0 = 16
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x05dc }
            r1.A0E = r0     // Catch:{ all -> 0x05dc }
            r0 = 17
            int r3 = r2.getInt(r0)     // Catch:{ all -> 0x05dc }
            r0 = 0
            if (r3 != r9) goto L_0x00f8
            r0 = 1
        L_0x00f8:
            r1.A0Y = r0     // Catch:{ all -> 0x05dc }
            r0 = 18
            int r3 = r2.getInt(r0)     // Catch:{ all -> 0x05dc }
            r0 = 0
            if (r3 != r9) goto L_0x0104
            r0 = 1
        L_0x0104:
            r1.A0c = r0     // Catch:{ all -> 0x05dc }
            r0 = 21
            int r3 = r2.getInt(r0)     // Catch:{ all -> 0x05dc }
            r0 = 0
            if (r3 != r9) goto L_0x0110
            r0 = 1
        L_0x0110:
            r1.A0Z = r0     // Catch:{ all -> 0x05dc }
            r0 = 24
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x05dc }
            r1.A0F = r0     // Catch:{ all -> 0x05dc }
            r0 = 25
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x05dc }
            r1.A0I = r0     // Catch:{ all -> 0x05dc }
            r0 = 26
            int r3 = r2.getInt(r0)     // Catch:{ all -> 0x05dc }
            r0 = 0
            if (r3 != r9) goto L_0x012c
            r0 = 1
        L_0x012c:
            r1.A0W = r0     // Catch:{ all -> 0x05dc }
            r0 = 27
            int r3 = r2.getInt(r0)     // Catch:{ all -> 0x05dc }
            r0 = 0
            if (r3 != r9) goto L_0x0138
            r0 = 1
        L_0x0138:
            r1.A0b = r0     // Catch:{ all -> 0x05dc }
            r0 = 32
            int r3 = r2.getInt(r0)     // Catch:{ all -> 0x05dc }
            r0 = 0
            if (r3 != r9) goto L_0x0144
            r0 = 1
        L_0x0144:
            r1.A0a = r0     // Catch:{ all -> 0x05dc }
            r0 = 30
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x05dc }
            if (r0 == 0) goto L_0x0150
            r1.A0B = r0     // Catch:{ all -> 0x05dc }
        L_0x0150:
            r0 = 19
            java.lang.String r8 = r2.getString(r0)     // Catch:{ all -> 0x05dc }
            r0 = 20
            java.lang.String r7 = r2.getString(r0)     // Catch:{ all -> 0x05dc }
            r0 = 28
            java.lang.String r4 = r2.getString(r0)     // Catch:{ all -> 0x05dc }
            r3 = 31
            boolean r0 = r2.isNull(r3)     // Catch:{ all -> 0x05dc }
            if (r0 != 0) goto L_0x0184
            int r10 = r2.getInt(r3)     // Catch:{ all -> 0x05dc }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x05dc }
            if (r3 != 0) goto L_0x0176
            r3 = 0
            goto L_0x0182
        L_0x0176:
            if (r10 < 0) goto L_0x017d
            r0 = 100
            if (r10 > r0) goto L_0x017d
            goto L_0x0182
        L_0x017d:
            r0 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x05dc }
        L_0x0182:
            r1.A09 = r3     // Catch:{ all -> 0x05dc }
        L_0x0184:
            r3 = 33
            boolean r0 = r2.isNull(r3)     // Catch:{ all -> 0x05dc }
            if (r0 != 0) goto L_0x0192
            int r0 = r2.getInt(r3)     // Catch:{ all -> 0x05dc }
            r1.A00 = r0     // Catch:{ all -> 0x05dc }
        L_0x0192:
            r3 = 34
            boolean r0 = r2.isNull(r3)     // Catch:{ all -> 0x05dc }
            if (r0 != 0) goto L_0x01a4
            int r3 = r2.getInt(r3)     // Catch:{ all -> 0x05dc }
            r0 = 0
            if (r3 != r9) goto L_0x01a2
            r0 = 1
        L_0x01a2:
            r1.A0d = r0     // Catch:{ all -> 0x05dc }
        L_0x01a4:
            if (r8 == 0) goto L_0x01af
            if (r7 == 0) goto L_0x01af
            X.9tg r0 = new X.9tg     // Catch:{ all -> 0x05dc }
            r0.<init>(r8, r7, r4)     // Catch:{ all -> 0x05dc }
            r1.A02 = r0     // Catch:{ all -> 0x05dc }
        L_0x01af:
            r0 = 23
            java.lang.String r4 = r2.getString(r0)     // Catch:{ all -> 0x05dc }
            if (r4 == 0) goto L_0x01ca
            int r0 = r4.length()     // Catch:{ all -> 0x05dc }
            if (r0 == 0) goto L_0x01ca
            r0 = 22
            java.lang.String r3 = r2.getString(r0)     // Catch:{ all -> 0x05dc }
            X.3XP r0 = new X.3XP     // Catch:{ all -> 0x05dc }
            r0.<init>(r4, r6, r6, r3)     // Catch:{ all -> 0x05dc }
            r1.A04 = r0     // Catch:{ all -> 0x05dc }
        L_0x01ca:
            if (r16 == 0) goto L_0x05d5
            if (r18 == 0) goto L_0x05ce
            java.lang.String r3 = java.lang.String.valueOf(r17)     // Catch:{ all -> 0x05dc }
            java.lang.String[] r4 = new java.lang.String[r9]     // Catch:{ all -> 0x05dc }
            r0 = 0
            r4[r0] = r3     // Catch:{ all -> 0x05dc }
            X.1M0 r3 = r20.get()     // Catch:{ all -> 0x05dc }
            X.14e r8 = r3.A02     // Catch:{ all -> 0x05c7 }
            java.lang.String r7 = "SELECT websites FROM wa_biz_profiles_websites WHERE wa_biz_profile_id = ? ORDER BY _id ASC"
            java.lang.String r0 = "CONTACT_BIZ_PROFILES_WEBSITES"
            android.database.Cursor r0 = r8.A09(r7, r0, r4)     // Catch:{ all -> 0x05c7 }
            if (r0 == 0) goto L_0x0206
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x05c0 }
            r8.<init>()     // Catch:{ all -> 0x05c0 }
        L_0x01ec:
            boolean r7 = r0.moveToNext()     // Catch:{ all -> 0x05c0 }
            if (r7 == 0) goto L_0x01fb
            r7 = 0
            java.lang.String r7 = r0.getString(r7)     // Catch:{ all -> 0x05c0 }
            r8.add(r7)     // Catch:{ all -> 0x05c0 }
            goto L_0x01ec
        L_0x01fb:
            java.util.List r7 = r1.A0U     // Catch:{ all -> 0x05c0 }
            r7.clear()     // Catch:{ all -> 0x05c0 }
            r7.addAll(r8)     // Catch:{ all -> 0x05c0 }
            r0.close()     // Catch:{ all -> 0x05c7 }
        L_0x0206:
            r3.close()     // Catch:{ all -> 0x05dc }
            X.1M0 r3 = r20.get()     // Catch:{ all -> 0x05dc }
            X.AnonymousClass00C.A0B(r3)     // Catch:{ all -> 0x05c7 }
            r0 = 0
            java.lang.String[] r8 = new java.lang.String[r9]     // Catch:{ all -> 0x05c7 }
            r8[r0] = r18     // Catch:{ all -> 0x05c7 }
            java.lang.String r7 = "SELECT time_zone, hours_note, day_of_week, mode, open_time, close_time, wa_biz_profiles_hours._id FROM wa_biz_profiles INNER JOIN wa_biz_profiles_hours ON (wa_biz_profiles._id = wa_biz_profiles_hours.wa_biz_profile_id) WHERE wa_biz_profiles.jid = ?"
            java.lang.String r0 = "CONTACT_BIZ_PROFILES_HOURS"
            android.database.Cursor r0 = X.C229416o.A03(r3, r7, r0, r8)     // Catch:{ all -> 0x05c7 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x05c7 }
            r11 = 1
            int r7 = r0.getCount()     // Catch:{ all -> 0x05c0 }
            if (r7 <= 0) goto L_0x02bd
            int r7 = r0.getCount()     // Catch:{ all -> 0x05c0 }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x05c0 }
            r12.<init>(r7)     // Catch:{ all -> 0x05c0 }
            r10 = r6
            r9 = r6
        L_0x0232:
            boolean r7 = r0.moveToNext()     // Catch:{ all -> 0x05c0 }
            if (r7 == 0) goto L_0x02b0
            boolean r7 = r0.isFirst()     // Catch:{ all -> 0x05c0 }
            if (r7 == 0) goto L_0x0247
            r7 = 0
            java.lang.String r10 = r0.getString(r7)     // Catch:{ all -> 0x05c0 }
            java.lang.String r9 = r0.getString(r11)     // Catch:{ all -> 0x05c0 }
        L_0x0247:
            r7 = 2
            int r15 = r0.getInt(r7)     // Catch:{ all -> 0x05c0 }
            r7 = 3
            int r14 = r0.getInt(r7)     // Catch:{ all -> 0x05c0 }
            r8 = 4
            boolean r7 = r0.isNull(r8)     // Catch:{ all -> 0x05c0 }
            if (r7 == 0) goto L_0x025a
            r13 = r6
            goto L_0x0262
        L_0x025a:
            int r7 = r0.getInt(r8)     // Catch:{ all -> 0x05c0 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x05c0 }
        L_0x0262:
            r8 = 5
            boolean r7 = r0.isNull(r8)     // Catch:{ all -> 0x05c0 }
            if (r7 == 0) goto L_0x026a
            goto L_0x0273
        L_0x026a:
            int r7 = r0.getInt(r8)     // Catch:{ all -> 0x05c0 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x05c0 }
            goto L_0x0274
        L_0x0273:
            r8 = r6
        L_0x0274:
            if (r14 != 0) goto L_0x02a7
            if (r13 == 0) goto L_0x027b
            if (r8 == 0) goto L_0x027b
            goto L_0x02a7
        L_0x027b:
            r7 = 6
            int r7 = r0.getInt(r7)     // Catch:{ all -> 0x05c0 }
            X.1M0 r13 = r20.A04()     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r15 = "wa_biz_profiles_hours"
            java.lang.String r14 = "wa_biz_profiles_hours._id = ?"
            java.lang.String[] r8 = new java.lang.String[r11]     // Catch:{ all -> 0x0299 }
            r16 = 0
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0299 }
            r8[r16] = r7     // Catch:{ all -> 0x0299 }
            X.C229416o.A02(r13, r15, r14, r8)     // Catch:{ all -> 0x0299 }
            r13.close()     // Catch:{ Exception -> 0x02a0 }
            goto L_0x0232
        L_0x0299:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x029b }
        L_0x029b:
            r7 = move-exception
            X.C05600Qi.A00(r13, r8)     // Catch:{ Exception -> 0x02a0 }
            throw r7     // Catch:{ Exception -> 0x02a0 }
        L_0x02a0:
            r8 = move-exception
            java.lang.String r7 = "BusinessProfileStore/Error deleting business day config"
            com.whatsapp.util.Log.w(r7, r8)     // Catch:{ all -> 0x05c0 }
            goto L_0x0232
        L_0x02a7:
            X.3XO r7 = new X.3XO     // Catch:{ all -> 0x05c0 }
            r7.<init>(r13, r8, r15, r14)     // Catch:{ all -> 0x05c0 }
            r12.add(r7)     // Catch:{ all -> 0x05c0 }
            goto L_0x0232
        L_0x02b0:
            int r7 = r12.size()     // Catch:{ all -> 0x05c0 }
            if (r7 <= 0) goto L_0x02bd
            X.3XK r7 = new X.3XK     // Catch:{ all -> 0x05c0 }
            r7.<init>(r10, r9, r12)     // Catch:{ all -> 0x05c0 }
            r1.A03 = r7     // Catch:{ all -> 0x05c0 }
        L_0x02bd:
            r0.close()     // Catch:{ all -> 0x05c7 }
            r3.close()     // Catch:{ all -> 0x05dc }
            X.1M0 r3 = r20.get()     // Catch:{ all -> 0x05dc }
            X.14e r8 = r3.A02     // Catch:{ all -> 0x05c7 }
            java.lang.String r7 = X.C1906799w.A00     // Catch:{ all -> 0x05c7 }
            java.lang.String r0 = "CONTACT_BIZ_PROFILES_CATEGORIES"
            android.database.Cursor r0 = r8.A09(r7, r0, r4)     // Catch:{ all -> 0x05c7 }
            if (r0 == 0) goto L_0x0305
            int r7 = r0.getCount()     // Catch:{ all -> 0x05c0 }
            if (r7 <= 0) goto L_0x0302
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x05c0 }
            r10.<init>()     // Catch:{ all -> 0x05c0 }
        L_0x02de:
            boolean r7 = r0.moveToNext()     // Catch:{ all -> 0x05c0 }
            if (r7 == 0) goto L_0x02fa
            r7 = 0
            java.lang.String r9 = r0.getString(r7)     // Catch:{ all -> 0x05c0 }
            java.lang.String r8 = r0.getString(r11)     // Catch:{ all -> 0x05c0 }
            if (r9 == 0) goto L_0x02de
            if (r8 == 0) goto L_0x02de
            X.6bw r7 = new X.6bw     // Catch:{ all -> 0x05c0 }
            r7.<init>(r9, r8)     // Catch:{ all -> 0x05c0 }
            r10.add(r7)     // Catch:{ all -> 0x05c0 }
            goto L_0x02de
        L_0x02fa:
            java.util.List r7 = r1.A0O     // Catch:{ all -> 0x05c0 }
            r7.clear()     // Catch:{ all -> 0x05c0 }
            r7.addAll(r10)     // Catch:{ all -> 0x05c0 }
        L_0x0302:
            r0.close()     // Catch:{ all -> 0x05c7 }
        L_0x0305:
            r3.close()     // Catch:{ all -> 0x05dc }
            X.1M0 r3 = r20.get()     // Catch:{ all -> 0x05dc }
            X.14e r8 = r3.A02     // Catch:{ all -> 0x05c7 }
            java.lang.String r7 = X.C1907099z.A00     // Catch:{ all -> 0x05c7 }
            java.lang.String r0 = "CONTACT_BIZ_PROFILES_SERVICE_AREAS"
            android.database.Cursor r0 = r8.A09(r7, r0, r4)     // Catch:{ all -> 0x05c7 }
            r7 = 1
            if (r0 == 0) goto L_0x0388
            int r8 = r0.getCount()     // Catch:{ all -> 0x05c0 }
            if (r8 <= 0) goto L_0x0385
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x05c0 }
            r8.<init>()     // Catch:{ all -> 0x05c0 }
        L_0x0324:
            boolean r9 = r0.moveToNext()     // Catch:{ all -> 0x05c0 }
            if (r9 == 0) goto L_0x037d
            r9 = 0
            java.lang.String r14 = r0.getString(r9)     // Catch:{ all -> 0x05c0 }
            boolean r9 = r0.isNull(r7)     // Catch:{ all -> 0x05c0 }
            r13 = 0
            if (r9 == 0) goto L_0x0338
            r12 = r6
            goto L_0x0340
        L_0x0338:
            int r9 = r0.getInt(r7)     // Catch:{ all -> 0x05c0 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x05c0 }
        L_0x0340:
            r10 = 2
            boolean r9 = r0.isNull(r10)     // Catch:{ all -> 0x05c0 }
            if (r9 == 0) goto L_0x0349
            r11 = r6
            goto L_0x0351
        L_0x0349:
            double r9 = r0.getDouble(r10)     // Catch:{ all -> 0x05c0 }
            java.lang.Double r11 = java.lang.Double.valueOf(r9)     // Catch:{ all -> 0x05c0 }
        L_0x0351:
            r10 = 3
            boolean r9 = r0.isNull(r10)     // Catch:{ all -> 0x05c0 }
            if (r9 != 0) goto L_0x0360
            double r9 = r0.getDouble(r10)     // Catch:{ all -> 0x05c0 }
            java.lang.Double r13 = java.lang.Double.valueOf(r9)     // Catch:{ all -> 0x05c0 }
        L_0x0360:
            if (r14 == 0) goto L_0x0324
            if (r12 == 0) goto L_0x0324
            if (r11 == 0) goto L_0x0324
            if (r13 == 0) goto L_0x0324
            int r19 = r12.intValue()     // Catch:{ all -> 0x05c0 }
            double r15 = r11.doubleValue()     // Catch:{ all -> 0x05c0 }
            double r17 = r13.doubleValue()     // Catch:{ all -> 0x05c0 }
            X.6bY r13 = new X.6bY     // Catch:{ all -> 0x05c0 }
            r13.<init>(r14, r15, r17, r19)     // Catch:{ all -> 0x05c0 }
            r8.add(r13)     // Catch:{ all -> 0x05c0 }
            goto L_0x0324
        L_0x037d:
            java.util.List r7 = r1.A0T     // Catch:{ all -> 0x05c0 }
            r7.clear()     // Catch:{ all -> 0x05c0 }
            r7.addAll(r8)     // Catch:{ all -> 0x05c0 }
        L_0x0385:
            r0.close()     // Catch:{ all -> 0x05c7 }
        L_0x0388:
            r3.close()     // Catch:{ all -> 0x05dc }
            X.1M0 r3 = r20.get()     // Catch:{ all -> 0x05dc }
            X.14e r8 = r3.A02     // Catch:{ all -> 0x05c7 }
            java.lang.String r7 = "SELECT country_code FROM wa_biz_profiles_direct_connection_allowed_country_codes WHERE wa_biz_profile_id = ?"
            java.lang.String r0 = "CONTACT_BIZ_PROFILES_DIRECT_CONNECTION_ALLOWED_COUNTRY_CODES"
            android.database.Cursor r0 = r8.A09(r7, r0, r4)     // Catch:{ all -> 0x05c7 }
            if (r0 == 0) goto L_0x03ca
            int r7 = r0.getCount()     // Catch:{ all -> 0x05c0 }
            if (r7 <= 0) goto L_0x03ca
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x05c0 }
            r10.<init>()     // Catch:{ all -> 0x05c0 }
            r9 = 0
        L_0x03a7:
            boolean r7 = r0.moveToNext()     // Catch:{ all -> 0x05c0 }
            if (r7 == 0) goto L_0x03c2
            java.lang.String r8 = r0.getString(r9)     // Catch:{ all -> 0x05c0 }
            if (r8 == 0) goto L_0x03a7
            java.lang.String r7 = "NULL"
            boolean r7 = r8.equals(r7)     // Catch:{ all -> 0x05c0 }
            if (r7 == 0) goto L_0x03bc
            goto L_0x03c0
        L_0x03bc:
            r10.add(r8)     // Catch:{ all -> 0x05c0 }
            goto L_0x03a7
        L_0x03c0:
            r8 = 0
            goto L_0x03cf
        L_0x03c2:
            r1.A0R = r6     // Catch:{ all -> 0x05c0 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x05c0 }
            r7.<init>(r10)     // Catch:{ all -> 0x05c0 }
            goto L_0x03d8
        L_0x03ca:
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x05c0 }
            r8.<init>()     // Catch:{ all -> 0x05c0 }
        L_0x03cf:
            r1.A0R = r6     // Catch:{ all -> 0x05c0 }
            if (r8 == 0) goto L_0x03da
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x05c0 }
            r7.<init>(r8)     // Catch:{ all -> 0x05c0 }
        L_0x03d8:
            r1.A0R = r7     // Catch:{ all -> 0x05c0 }
        L_0x03da:
            if (r0 == 0) goto L_0x03df
            r0.close()     // Catch:{ all -> 0x05c7 }
        L_0x03df:
            r3.close()     // Catch:{ all -> 0x05dc }
            X.1M0 r3 = r20.get()     // Catch:{ all -> 0x05dc }
            X.14e r8 = r3.A02     // Catch:{ all -> 0x05c7 }
            java.lang.String r7 = X.C1906899x.A00     // Catch:{ all -> 0x05c7 }
            java.lang.String r0 = "CONTACT_BIZ_PROFILES_TRUST_SIGNALS"
            android.database.Cursor r0 = r8.A09(r7, r0, r4)     // Catch:{ all -> 0x05c7 }
            r13 = 1
            if (r0 == 0) goto L_0x0438
            int r7 = r0.getCount()     // Catch:{ all -> 0x05c0 }
            if (r7 <= 0) goto L_0x0435
            r12 = 0
        L_0x03fa:
            boolean r7 = r0.moveToNext()     // Catch:{ all -> 0x05c0 }
            if (r7 == 0) goto L_0x0435
            r14 = 0
            java.lang.String r11 = r0.getString(r14)     // Catch:{ all -> 0x05c0 }
            int r10 = r0.getInt(r13)     // Catch:{ all -> 0x05c0 }
            r7 = 2
            java.lang.String r9 = r0.getString(r7)     // Catch:{ all -> 0x05c0 }
            r7 = 3
            int r8 = r0.getInt(r7)     // Catch:{ all -> 0x05c0 }
            r7 = 4
            int r7 = r0.getInt(r7)     // Catch:{ all -> 0x05c0 }
            if (r7 != r13) goto L_0x041b
            r14 = 1
        L_0x041b:
            if (r11 == 0) goto L_0x0427
            if (r9 == 0) goto L_0x0427
            X.6bZ r7 = new X.6bZ     // Catch:{ all -> 0x05c0 }
            r7.<init>(r11, r9, r8, r14)     // Catch:{ all -> 0x05c0 }
            if (r10 != r13) goto L_0x042c
            r6 = r7
        L_0x0427:
            if (r12 != 0) goto L_0x042d
            if (r6 == 0) goto L_0x03fa
            goto L_0x042d
        L_0x042c:
            r12 = r7
        L_0x042d:
            X.9ta r7 = new X.9ta     // Catch:{ all -> 0x05c0 }
            r7.<init>(r12, r6)     // Catch:{ all -> 0x05c0 }
            r1.A05 = r7     // Catch:{ all -> 0x05c0 }
            goto L_0x03fa
        L_0x0435:
            r0.close()     // Catch:{ all -> 0x05c7 }
        L_0x0438:
            r3.close()     // Catch:{ all -> 0x05dc }
            X.1M0 r3 = r20.get()     // Catch:{ all -> 0x05dc }
            X.14e r7 = r3.A02     // Catch:{ all -> 0x05c7 }
            java.lang.String r6 = "SELECT catalog_feature_type FROM wa_biz_profiles_dc_enabled_features WHERE wa_biz_profile_id = ?"
            java.lang.String r0 = "CONTACT_BIZ_PROFILES_DC_ENABLED_FEATURES"
            android.database.Cursor r0 = r7.A09(r6, r0, r4)     // Catch:{ all -> 0x05c7 }
            if (r0 == 0) goto L_0x0471
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x05c0 }
            r8.<init>()     // Catch:{ all -> 0x05c0 }
        L_0x0450:
            boolean r6 = r0.moveToNext()     // Catch:{ all -> 0x05c0 }
            if (r6 == 0) goto L_0x0466
            r6 = 0
            java.lang.String r7 = r0.getString(r6)     // Catch:{ all -> 0x05c0 }
            if (r7 == 0) goto L_0x0450
            X.9tS r6 = new X.9tS     // Catch:{ all -> 0x05c0 }
            r6.<init>(r7)     // Catch:{ all -> 0x05c0 }
            r8.add(r6)     // Catch:{ all -> 0x05c0 }
            goto L_0x0450
        L_0x0466:
            java.util.List r6 = r1.A0Q     // Catch:{ all -> 0x05c0 }
            r6.clear()     // Catch:{ all -> 0x05c0 }
            r6.addAll(r8)     // Catch:{ all -> 0x05c0 }
            r0.close()     // Catch:{ all -> 0x05c7 }
        L_0x0471:
            r3.close()     // Catch:{ all -> 0x05dc }
            X.1M0 r3 = r20.get()     // Catch:{ all -> 0x05dc }
            X.14e r7 = r3.A02     // Catch:{ all -> 0x05c7 }
            java.lang.String r6 = X.C1906999y.A00     // Catch:{ all -> 0x05c7 }
            java.lang.String r0 = "CONTACT_BIZ_PROFILES_PRICE_TIER"
            android.database.Cursor r0 = r7.A09(r6, r0, r4)     // Catch:{ all -> 0x05c7 }
            if (r0 == 0) goto L_0x0485
            goto L_0x0487
        L_0x0485:
            r9 = 0
            goto L_0x04b3
        L_0x0487:
            boolean r6 = r0.moveToNext()     // Catch:{ all -> 0x05c0 }
            if (r6 == 0) goto L_0x0485
            java.lang.String r6 = "_id"
            int r6 = r0.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x05c0 }
            java.lang.String r8 = r0.getString(r6)     // Catch:{ all -> 0x05c0 }
            X.AnonymousClass00C.A08(r8)     // Catch:{ all -> 0x05c0 }
            java.lang.String r6 = "name"
            int r6 = r0.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x05c0 }
            java.lang.String r7 = r0.getString(r6)     // Catch:{ all -> 0x05c0 }
            java.lang.String r6 = "symbol"
            int r6 = r0.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x05c0 }
            java.lang.String r6 = r0.getString(r6)     // Catch:{ all -> 0x05c0 }
            X.6bQ r9 = new X.6bQ     // Catch:{ all -> 0x05c0 }
            r9.<init>(r8, r7, r6)     // Catch:{ all -> 0x05c0 }
        L_0x04b3:
            r1.A06 = r9     // Catch:{ all -> 0x05c0 }
            if (r0 == 0) goto L_0x04ba
            r0.close()     // Catch:{ all -> 0x05c7 }
        L_0x04ba:
            r3.close()     // Catch:{ all -> 0x05dc }
            X.1M0 r3 = r20.get()     // Catch:{ all -> 0x05dc }
            X.14e r7 = r3.A02     // Catch:{ all -> 0x05c7 }
            java.lang.String r6 = X.AnonymousClass9A0.A00     // Catch:{ all -> 0x05c7 }
            java.lang.String r0 = "CONTACT_BIZ_PROFILES_SERVICE_OFFERINGS"
            android.database.Cursor r0 = r7.A09(r6, r0, r4)     // Catch:{ all -> 0x05c7 }
            r8 = 1
            if (r0 == 0) goto L_0x052b
            int r6 = r0.getCount()     // Catch:{ all -> 0x05c0 }
            if (r6 <= 0) goto L_0x0528
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x05c0 }
            r7.<init>()     // Catch:{ all -> 0x05c0 }
        L_0x04d9:
            boolean r6 = r0.moveToNext()     // Catch:{ all -> 0x05c0 }
            if (r6 == 0) goto L_0x0526
            java.lang.String r6 = "wa_biz_category_service_offerings_id"
            int r6 = r0.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x05c0 }
            java.lang.String r12 = r0.getString(r6)     // Catch:{ all -> 0x05c0 }
            java.lang.String r6 = "is_offered"
            int r6 = r0.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x05c0 }
            int r6 = r0.getInt(r6)     // Catch:{ all -> 0x05c0 }
            r14 = 0
            if (r6 != r8) goto L_0x04f7
            r14 = 1
        L_0x04f7:
            java.lang.String r6 = "category_id"
            int r6 = r0.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x05c0 }
            java.lang.String r11 = r0.getString(r6)     // Catch:{ all -> 0x05c0 }
            java.lang.String r6 = "category_name"
            int r6 = r0.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x05c0 }
            java.lang.String r10 = r0.getString(r6)     // Catch:{ all -> 0x05c0 }
            java.lang.String r6 = "offering_name"
            int r6 = r0.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x05c0 }
            java.lang.String r13 = r0.getString(r6)     // Catch:{ all -> 0x05c0 }
            if (r11 == 0) goto L_0x04d9
            if (r10 == 0) goto L_0x04d9
            if (r12 == 0) goto L_0x04d9
            if (r13 == 0) goto L_0x04d9
            X.6bd r9 = new X.6bd     // Catch:{ all -> 0x05c0 }
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x05c0 }
            r7.add(r9)     // Catch:{ all -> 0x05c0 }
            goto L_0x04d9
        L_0x0526:
            r1.A0N = r7     // Catch:{ all -> 0x05c0 }
        L_0x0528:
            r0.close()     // Catch:{ all -> 0x05c7 }
        L_0x052b:
            r3.close()     // Catch:{ all -> 0x05dc }
            X.1M0 r3 = r20.get()     // Catch:{ all -> 0x05dc }
            X.14e r7 = r3.A02     // Catch:{ all -> 0x05c7 }
            java.lang.String r6 = "SELECT sub_description, commands, prompts, commands_description, bot_description FROM wa_biz_profiles_bot_attributes WHERE wa_biz_profile_id = ?"
            java.lang.String r0 = "CONTACT_BIZ_PROFILES_BOT_ATTRIBUTES"
            android.database.Cursor r0 = r7.A09(r6, r0, r4)     // Catch:{ all -> 0x05c7 }
            X.AnonymousClass00C.A0B(r0)     // Catch:{ all -> 0x05c0 }
            r4 = 0
            X.AnonymousClass00C.A0D(r0, r4)     // Catch:{ all -> 0x05c0 }
            boolean r4 = r0.moveToNext()     // Catch:{ all -> 0x05c0 }
            if (r4 == 0) goto L_0x05b9
            java.lang.String r4 = "bot_description"
            int r4 = r0.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x05c0 }
            java.lang.String r4 = r0.getString(r4)     // Catch:{ all -> 0x05c0 }
            r1.A0A = r4     // Catch:{ all -> 0x05c0 }
            java.lang.String r4 = "sub_description"
            int r4 = r0.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x05c0 }
            java.lang.String r4 = r0.getString(r4)     // Catch:{ all -> 0x05c0 }
            r1.A0K = r4     // Catch:{ all -> 0x05c0 }
            java.lang.String r4 = "commands"
            int r4 = r0.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x05c0 }
            java.lang.String r4 = r0.getString(r4)     // Catch:{ all -> 0x05c0 }
            java.util.ArrayList r7 = X.AnonymousClass3LO.A01(r4)     // Catch:{ all -> 0x05c0 }
            boolean r4 = r7.isEmpty()     // Catch:{ all -> 0x05c0 }
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x0587
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x05c0 }
            r6.<init>()     // Catch:{ all -> 0x05c0 }
            r6.addAll(r7)     // Catch:{ all -> 0x05c0 }
            java.util.List r4 = r1.A0P     // Catch:{ all -> 0x05c0 }
            r4.clear()     // Catch:{ all -> 0x05c0 }
            r4.addAll(r6)     // Catch:{ all -> 0x05c0 }
        L_0x0587:
            java.lang.String r4 = "prompts"
            int r4 = r0.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x05c0 }
            java.lang.String r4 = r0.getString(r4)     // Catch:{ all -> 0x05c0 }
            java.util.ArrayList r7 = X.C129326Gl.A01(r4)     // Catch:{ all -> 0x05c0 }
            boolean r4 = r7.isEmpty()     // Catch:{ all -> 0x05c0 }
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x05ad
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x05c0 }
            r6.<init>()     // Catch:{ all -> 0x05c0 }
            r6.addAll(r7)     // Catch:{ all -> 0x05c0 }
            java.util.List r4 = r1.A0S     // Catch:{ all -> 0x05c0 }
            r4.clear()     // Catch:{ all -> 0x05c0 }
            r4.addAll(r6)     // Catch:{ all -> 0x05c0 }
        L_0x05ad:
            java.lang.String r4 = "commands_description"
            int r4 = r0.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x05c0 }
            java.lang.String r4 = r0.getString(r4)     // Catch:{ all -> 0x05c0 }
            r1.A0C = r4     // Catch:{ all -> 0x05c0 }
        L_0x05b9:
            r0.close()     // Catch:{ all -> 0x05c7 }
            r3.close()     // Catch:{ all -> 0x05dc }
            goto L_0x05ce
        L_0x05c0:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x05c2 }
        L_0x05c2:
            r1 = move-exception
            X.C05600Qi.A00(r0, r4)     // Catch:{ all -> 0x05c7 }
            throw r1     // Catch:{ all -> 0x05c7 }
        L_0x05c7:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x05c9 }
        L_0x05c9:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ all -> 0x05dc }
            throw r0     // Catch:{ all -> 0x05dc }
        L_0x05ce:
            r2.close()     // Catch:{ all -> 0x05e3 }
            r5.close()
            return r1
        L_0x05d5:
            r2.close()     // Catch:{ all -> 0x05e3 }
            r5.close()
            return r6
        L_0x05dc:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x05de }
        L_0x05de:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x05e3 }
            throw r0     // Catch:{ all -> 0x05e3 }
        L_0x05e3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x05e5 }
        L_0x05e5:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1LE.A06(com.whatsapp.jid.UserJid):X.9ep");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(com.whatsapp.jid.UserJid r7) {
        /*
            r6 = this;
            if (r7 != 0) goto L_0x0008
            java.lang.String r0 = "contact-mgr-db/cannot delete business profile details by null jid"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0008:
            X.16r r0 = r6.A00
            X.1M0 r5 = r0.A04()
            java.lang.String r4 = "wa_biz_profiles"
            java.lang.String r3 = "wa_biz_profiles.jid = ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0023 }
            r1 = 0
            java.lang.String r0 = r7.getRawString()     // Catch:{ all -> 0x0023 }
            r2[r1] = r0     // Catch:{ all -> 0x0023 }
            X.C229416o.A02(r5, r4, r3, r2)     // Catch:{ all -> 0x0023 }
            r5.close()
            return
        L_0x0023:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1LE.A07(com.whatsapp.jid.UserJid):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:155:0x049d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x04a1, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x04a4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x04a5, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x04a8, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(java.util.Map r22) {
        /*
            r21 = this;
            r18 = 0
            android.content.ContentValues r15 = new android.content.ContentValues
            r15.<init>()
            r4 = r21
            X.16r r0 = r4.A00
            X.1M0 r2 = r0.A04()
            X.71s r3 = r2.B1k()     // Catch:{ all -> 0x04a2 }
            java.util.Set r0 = r22.entrySet()     // Catch:{ all -> 0x049b }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ all -> 0x049b }
        L_0x001b:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x049b }
            r11 = 0
            if (r0 == 0) goto L_0x0491
            java.lang.Object r0 = r14.next()     // Catch:{ all -> 0x049b }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x049b }
            java.lang.Object r6 = r0.getKey()     // Catch:{ all -> 0x049b }
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6     // Catch:{ all -> 0x049b }
            java.lang.Object r5 = r0.getValue()     // Catch:{ all -> 0x049b }
            X.9uZ r5 = (X.C207109uZ) r5     // Catch:{ all -> 0x049b }
            X.9ep r0 = r4.A06(r6)     // Catch:{ all -> 0x049b }
            if (r0 == 0) goto L_0x0047
            X.9uZ r0 = r0.A01()     // Catch:{ all -> 0x049b }
            if (r5 == 0) goto L_0x004a
            boolean r0 = r0.equals(r5)     // Catch:{ all -> 0x049b }
            if (r0 == 0) goto L_0x004a
            goto L_0x001b
        L_0x0047:
            if (r5 != 0) goto L_0x004a
            goto L_0x001b
        L_0x004a:
            X.C18740tg.A06(r6)     // Catch:{ all -> 0x049b }
            r4.A07(r6)     // Catch:{ all -> 0x049b }
            if (r5 == 0) goto L_0x001b
            r15.clear()     // Catch:{ all -> 0x049b }
            java.lang.String r1 = "jid"
            java.lang.String r0 = r6.getRawString()     // Catch:{ all -> 0x049b }
            r15.put(r1, r0)     // Catch:{ all -> 0x049b }
            java.lang.String r1 = "tag"
            java.lang.String r0 = r5.A0L     // Catch:{ all -> 0x049b }
            r15.put(r1, r0)     // Catch:{ all -> 0x049b }
            java.lang.String r1 = "address"
            X.3XS r6 = r5.A07     // Catch:{ all -> 0x049b }
            java.lang.String r0 = r6.A03     // Catch:{ all -> 0x049b }
            r15.put(r1, r0)     // Catch:{ all -> 0x049b }
            java.lang.String r1 = "address_postal_code"
            java.lang.String r0 = r6.A02     // Catch:{ all -> 0x049b }
            r15.put(r1, r0)     // Catch:{ all -> 0x049b }
            java.lang.String r1 = "address_city_id"
            X.3XE r6 = r6.A00     // Catch:{ all -> 0x049b }
            java.lang.String r0 = r6.A00     // Catch:{ all -> 0x049b }
            r15.put(r1, r0)     // Catch:{ all -> 0x049b }
            java.lang.String r1 = "address_city_name"
            java.lang.String r0 = r6.A01     // Catch:{ all -> 0x049b }
            r15.put(r1, r0)     // Catch:{ all -> 0x049b }
            java.lang.String r1 = "business_description"
            java.lang.String r0 = r5.A0G     // Catch:{ all -> 0x049b }
            r15.put(r1, r0)     // Catch:{ all -> 0x049b }
            java.lang.String r1 = "email"
            java.lang.String r0 = r5.A0H     // Catch:{ all -> 0x049b }
            r15.put(r1, r0)     // Catch:{ all -> 0x049b }
            java.lang.String r1 = "latitude"
            java.lang.Double r0 = r6.A02     // Catch:{ all -> 0x049b }
            r15.put(r1, r0)     // Catch:{ all -> 0x049b }
            java.lang.String r1 = "longitude"
            java.lang.Double r0 = r6.A03     // Catch:{ all -> 0x049b }
            r15.put(r1, r0)     // Catch:{ all -> 0x049b }
            java.lang.String r1 = "vertical"
            java.lang.String r0 = r5.A0M     // Catch:{ all -> 0x049b }
            r15.put(r1, r0)     // Catch:{ all -> 0x049b }
            java.lang.String r1 = "has_catalog"
            boolean r0 = r5.A0Y     // Catch:{ all -> 0x049b }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x049b }
            r15.put(r1, r0)     // Catch:{ all -> 0x049b }
            X.3XK r8 = r5.A03     // Catch:{ all -> 0x049b }
            if (r8 == 0) goto L_0x00c5
            java.lang.String r1 = "time_zone"
            java.lang.String r0 = r8.A01     // Catch:{ all -> 0x049b }
            r15.put(r1, r0)     // Catch:{ all -> 0x049b }
            java.lang.String r1 = "hours_note"
            java.lang.String r0 = r8.A00     // Catch:{ all -> 0x049b }
            r15.put(r1, r0)     // Catch:{ all -> 0x049b }
        L_0x00c5:
            java.lang.String r1 = "commerce_experience"
            java.lang.String r0 = r5.A0D     // Catch:{ all -> 0x049b }
            r15.put(r1, r0)     // Catch:{ all -> 0x049b }
            java.lang.String r1 = "shop_url"
            java.lang.String r0 = r5.A0J     // Catch:{ all -> 0x049b }
            r15.put(r1, r0)     // Catch:{ all -> 0x049b }
            java.lang.String r1 = "cart_enabled"
            boolean r0 = r5.A0W     // Catch:{ all -> 0x049b }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x049b }
            r15.put(r1, r0)     // Catch:{ all -> 0x049b }
            java.lang.String r1 = "commerce_manager_url"
            java.lang.String r0 = r5.A0E     // Catch:{ all -> 0x049b }
            r15.put(r1, r0)     // Catch:{ all -> 0x049b }
            java.lang.String r1 = "direct_connection_enabled"
            boolean r0 = r5.A0X     // Catch:{ all -> 0x049b }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x049b }
            r15.put(r1, r0)     // Catch:{ all -> 0x049b }
            java.lang.String r1 = "is_shop_banned"
            boolean r0 = r5.A0c     // Catch:{ all -> 0x049b }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x049b }
            r15.put(r1, r0)     // Catch:{ all -> 0x049b }
            java.lang.String r1 = "is_responsive"
            boolean r0 = r5.A0b     // Catch:{ all -> 0x049b }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x049b }
            r15.put(r1, r0)     // Catch:{ all -> 0x049b }
            java.lang.String r1 = "business_blocked_status"
            java.lang.String r0 = r5.A0B     // Catch:{ all -> 0x049b }
            r15.put(r1, r0)     // Catch:{ all -> 0x049b }
            X.9tg r6 = r5.A02     // Catch:{ all -> 0x049b }
            if (r6 == 0) goto L_0x0126
            java.lang.String r1 = "default_postcode"
            java.lang.String r0 = r6.A00     // Catch:{ all -> 0x049b }
            r15.put(r1, r0)     // Catch:{ all -> 0x049b }
            java.lang.String r1 = "location_name"
            java.lang.String r0 = r6.A01     // Catch:{ all -> 0x049b }
            r15.put(r1, r0)     // Catch:{ all -> 0x049b }
            java.lang.String r1 = "postcode_type"
            java.lang.String r0 = r6.A02     // Catch:{ all -> 0x049b }
            r15.put(r1, r0)     // Catch:{ all -> 0x049b }
        L_0x0126:
            java.lang.String r1 = "galaxy_business_enabled"
            boolean r0 = r5.A0Z     // Catch:{ all -> 0x049b }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x049b }
            r15.put(r1, r0)     // Catch:{ all -> 0x049b }
            java.lang.String r1 = "custom_url"
            java.lang.String r0 = r5.A0F     // Catch:{ all -> 0x049b }
            r15.put(r1, r0)     // Catch:{ all -> 0x049b }
            X.3XP r6 = r5.A04     // Catch:{ all -> 0x049b }
            if (r6 == 0) goto L_0x014a
            java.lang.String r1 = "cover_photo_url"
            java.lang.String r0 = r6.A03     // Catch:{ all -> 0x049b }
            r15.put(r1, r0)     // Catch:{ all -> 0x049b }
            java.lang.String r1 = "cover_photo_id"
            java.lang.String r0 = r6.A00     // Catch:{ all -> 0x049b }
            r15.put(r1, r0)     // Catch:{ all -> 0x049b }
        L_0x014a:
            java.lang.String r1 = "member_since"
            java.lang.String r0 = r5.A0I     // Catch:{ all -> 0x049b }
            r15.put(r1, r0)     // Catch:{ all -> 0x049b }
            java.lang.String r1 = "capi_calling_enabled"
            boolean r0 = r5.A0V     // Catch:{ all -> 0x049b }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x049b }
            r15.put(r1, r0)     // Catch:{ all -> 0x049b }
            X.6bQ r7 = r5.A06     // Catch:{ all -> 0x049b }
            if (r7 == 0) goto L_0x0167
            java.lang.String r1 = "price_tier_id"
            java.lang.String r0 = r7.A00     // Catch:{ all -> 0x049b }
            r15.put(r1, r0)     // Catch:{ all -> 0x049b }
        L_0x0167:
            java.lang.String r1 = "survey_sampling_rate"
            java.lang.Integer r0 = r5.A09     // Catch:{ all -> 0x049b }
            r15.put(r1, r0)     // Catch:{ all -> 0x049b }
            java.lang.String r1 = "is_offerings_eligible"
            boolean r0 = r5.A0a     // Catch:{ all -> 0x049b }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x049b }
            r15.put(r1, r0)     // Catch:{ all -> 0x049b }
            java.lang.String r1 = "automated_type"
            int r0 = r5.A00     // Catch:{ all -> 0x049b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x049b }
            r15.put(r1, r0)     // Catch:{ all -> 0x049b }
            java.lang.String r6 = "welcome_message_protocol_mode"
            boolean r1 = r5.A0d     // Catch:{ all -> 0x049b }
            r0 = 0
            if (r1 == 0) goto L_0x018c
            r0 = 1
        L_0x018c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x049b }
            r15.put(r6, r0)     // Catch:{ all -> 0x049b }
            java.lang.String r0 = "wa_biz_profiles"
            long r19 = X.C229416o.A00(r15, r2, r0)     // Catch:{ all -> 0x049b }
            java.util.List r1 = r5.A0U     // Catch:{ all -> 0x049b }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x049b }
            r0 = r0 ^ 1
            java.lang.String r6 = "wa_biz_profile_id"
            if (r0 == 0) goto L_0x01ca
            java.util.Iterator r9 = r1.iterator()     // Catch:{ all -> 0x049b }
        L_0x01a9:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x049b }
            if (r0 == 0) goto L_0x01ca
            java.lang.Object r1 = r9.next()     // Catch:{ all -> 0x049b }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x049b }
            r15.clear()     // Catch:{ all -> 0x049b }
            java.lang.String r0 = "websites"
            r15.put(r0, r1)     // Catch:{ all -> 0x049b }
            java.lang.Long r0 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x049b }
            r15.put(r6, r0)     // Catch:{ all -> 0x049b }
            java.lang.String r0 = "wa_biz_profiles_websites"
            X.C229416o.A00(r15, r2, r0)     // Catch:{ all -> 0x049b }
            goto L_0x01a9
        L_0x01ca:
            java.util.List r1 = r5.A0O     // Catch:{ all -> 0x049b }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x049b }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0202
            java.util.Iterator r10 = r1.iterator()     // Catch:{ all -> 0x049b }
        L_0x01d8:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x049b }
            if (r0 == 0) goto L_0x0202
            java.lang.Object r9 = r10.next()     // Catch:{ all -> 0x049b }
            X.6bw r9 = (X.C134986bw) r9     // Catch:{ all -> 0x049b }
            r15.clear()     // Catch:{ all -> 0x049b }
            java.lang.String r1 = "category_id"
            java.lang.String r0 = r9.A00     // Catch:{ all -> 0x049b }
            r15.put(r1, r0)     // Catch:{ all -> 0x049b }
            java.lang.String r1 = "category_name"
            java.lang.String r0 = r9.A01     // Catch:{ all -> 0x049b }
            r15.put(r1, r0)     // Catch:{ all -> 0x049b }
            java.lang.Long r0 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x049b }
            r15.put(r6, r0)     // Catch:{ all -> 0x049b }
            java.lang.String r0 = "wa_biz_profiles_categories"
            X.C229416o.A00(r15, r2, r0)     // Catch:{ all -> 0x049b }
            goto L_0x01d8
        L_0x0202:
            if (r8 == 0) goto L_0x025a
            java.util.List r0 = r8.A02     // Catch:{ all -> 0x049b }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x049b }
        L_0x020a:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x049b }
            if (r0 == 0) goto L_0x025a
            java.lang.Object r8 = r9.next()     // Catch:{ all -> 0x049b }
            X.3XO r8 = (X.AnonymousClass3XO) r8     // Catch:{ all -> 0x049b }
            r15.clear()     // Catch:{ all -> 0x049b }
            java.lang.String r1 = "day_of_week"
            if (r8 == 0) goto L_0x0258
            int r0 = r8.A00     // Catch:{ all -> 0x049b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x049b }
        L_0x0223:
            r15.put(r1, r0)     // Catch:{ all -> 0x049b }
            java.lang.String r1 = "mode"
            if (r8 == 0) goto L_0x0256
            int r0 = r8.A01     // Catch:{ all -> 0x049b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x049b }
        L_0x0230:
            r15.put(r1, r0)     // Catch:{ all -> 0x049b }
            java.lang.String r1 = "open_time"
            if (r8 == 0) goto L_0x0254
            java.lang.Integer r0 = r8.A03     // Catch:{ all -> 0x049b }
        L_0x0239:
            r15.put(r1, r0)     // Catch:{ all -> 0x049b }
            java.lang.String r1 = "close_time"
            if (r8 == 0) goto L_0x0252
            java.lang.Integer r0 = r8.A02     // Catch:{ all -> 0x049b }
        L_0x0242:
            r15.put(r1, r0)     // Catch:{ all -> 0x049b }
            java.lang.Long r0 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x049b }
            r15.put(r6, r0)     // Catch:{ all -> 0x049b }
            java.lang.String r0 = "wa_biz_profiles_hours"
            X.C229416o.A00(r15, r2, r0)     // Catch:{ all -> 0x049b }
            goto L_0x020a
        L_0x0252:
            r0 = r11
            goto L_0x0242
        L_0x0254:
            r0 = r11
            goto L_0x0239
        L_0x0256:
            r0 = r11
            goto L_0x0230
        L_0x0258:
            r0 = r11
            goto L_0x0223
        L_0x025a:
            X.9ta r8 = r5.A05     // Catch:{ all -> 0x049b }
            if (r8 == 0) goto L_0x0266
            X.6bZ r1 = r8.A00     // Catch:{ all -> 0x049b }
            if (r1 != 0) goto L_0x02ba
            X.6bZ r0 = r8.A01     // Catch:{ all -> 0x049b }
            if (r0 != 0) goto L_0x02ba
        L_0x0266:
            java.util.List r1 = r5.A0T     // Catch:{ all -> 0x049b }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x049b }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x02d1
            java.util.Iterator r9 = r1.iterator()     // Catch:{ all -> 0x049b }
        L_0x0274:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x049b }
            if (r0 == 0) goto L_0x02d1
            java.lang.Object r8 = r9.next()     // Catch:{ all -> 0x049b }
            X.6bY r8 = (X.C134756bY) r8     // Catch:{ all -> 0x049b }
            if (r8 == 0) goto L_0x0274
            r15.clear()     // Catch:{ all -> 0x049b }
            java.lang.String r1 = r8.A03     // Catch:{ all -> 0x049b }
            java.lang.String r0 = "area_description"
            r15.put(r0, r1)     // Catch:{ all -> 0x049b }
            int r0 = r8.A02     // Catch:{ all -> 0x049b }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x049b }
            java.lang.String r0 = "radius"
            r15.put(r0, r1)     // Catch:{ all -> 0x049b }
            double r0 = r8.A00     // Catch:{ all -> 0x049b }
            java.lang.Double r1 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x049b }
            java.lang.String r0 = "center_latitude"
            r15.put(r0, r1)     // Catch:{ all -> 0x049b }
            double r0 = r8.A01     // Catch:{ all -> 0x049b }
            java.lang.Double r1 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x049b }
            java.lang.String r0 = "center_longitude"
            r15.put(r0, r1)     // Catch:{ all -> 0x049b }
            java.lang.Long r0 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x049b }
            r15.put(r6, r0)     // Catch:{ all -> 0x049b }
            java.lang.String r0 = "wa_biz_profiles_service_areas"
            X.C229416o.A00(r15, r2, r0)     // Catch:{ all -> 0x049b }
            goto L_0x0274
        L_0x02ba:
            X.6bZ r0 = r8.A01     // Catch:{ all -> 0x049b }
            if (r1 == 0) goto L_0x02c5
            r17 = r2
            r16 = r1
            A04(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x049b }
        L_0x02c5:
            if (r0 == 0) goto L_0x0266
            r11 = 1
            r8 = r15
            r9 = r0
            r10 = r2
            r12 = r19
            A04(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x049b }
            goto L_0x0266
        L_0x02d1:
            java.util.List r0 = r5.A0Q     // Catch:{ all -> 0x049b }
            if (r0 != 0) goto L_0x0316
            java.lang.String r1 = "NULL"
            r15.clear()     // Catch:{ all -> 0x049b }
            java.lang.String r0 = "country_code"
            r15.put(r0, r1)     // Catch:{ all -> 0x049b }
            java.lang.Long r0 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x049b }
            r15.put(r6, r0)     // Catch:{ all -> 0x049b }
            java.lang.String r0 = "wa_biz_profiles_direct_connection_allowed_country_codes"
            X.C229416o.A00(r15, r2, r0)     // Catch:{ all -> 0x049b }
        L_0x02eb:
            java.util.List r0 = r5.A0R     // Catch:{ all -> 0x049b }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x049b }
        L_0x02f1:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x049b }
            if (r0 == 0) goto L_0x033d
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x049b }
            X.9tS r0 = (X.C206469tS) r0     // Catch:{ all -> 0x049b }
            if (r0 == 0) goto L_0x02f1
            r15.clear()     // Catch:{ all -> 0x049b }
            java.lang.String r1 = "catalog_feature_type"
            java.lang.String r0 = r0.A00     // Catch:{ all -> 0x049b }
            r15.put(r1, r0)     // Catch:{ all -> 0x049b }
            java.lang.Long r0 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x049b }
            r15.put(r6, r0)     // Catch:{ all -> 0x049b }
            java.lang.String r0 = "wa_biz_profiles_dc_enabled_features"
            X.C229416o.A00(r15, r2, r0)     // Catch:{ all -> 0x049b }
            goto L_0x02f1
        L_0x0316:
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x049b }
        L_0x031a:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x049b }
            if (r0 == 0) goto L_0x02eb
            java.lang.Object r1 = r8.next()     // Catch:{ all -> 0x049b }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x049b }
            if (r1 == 0) goto L_0x031a
            r15.clear()     // Catch:{ all -> 0x049b }
            java.lang.String r0 = "country_code"
            r15.put(r0, r1)     // Catch:{ all -> 0x049b }
            java.lang.Long r0 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x049b }
            r15.put(r6, r0)     // Catch:{ all -> 0x049b }
            java.lang.String r0 = "wa_biz_profiles_direct_connection_allowed_country_codes"
            X.C229416o.A00(r15, r2, r0)     // Catch:{ all -> 0x049b }
            goto L_0x031a
        L_0x033d:
            if (r7 == 0) goto L_0x0378
            X.14e r0 = r2.A02     // Catch:{ all -> 0x049b }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x049b }
            boolean r0 = r0.inTransaction()     // Catch:{ all -> 0x049b }
            X.C18740tg.A0C(r0)     // Catch:{ all -> 0x049b }
            r15.clear()     // Catch:{ all -> 0x049b }
            java.lang.String r8 = r7.A00     // Catch:{ all -> 0x049b }
            java.lang.String r0 = "_id"
            r15.put(r0, r8)     // Catch:{ all -> 0x049b }
            java.lang.String r1 = r7.A01     // Catch:{ all -> 0x049b }
            java.lang.String r0 = "name"
            r15.put(r0, r1)     // Catch:{ all -> 0x049b }
            java.lang.String r1 = r7.A02     // Catch:{ all -> 0x049b }
            java.lang.String r0 = "symbol"
            r15.put(r0, r1)     // Catch:{ all -> 0x049b }
            r0 = 1
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ all -> 0x049b }
            r7[r18] = r8     // Catch:{ all -> 0x049b }
            java.lang.String r1 = "wa_biz_profiles_price_tiers"
            java.lang.String r0 = "_id=?"
            long r9 = X.C229416o.A01(r15, r2, r1, r0, r7)     // Catch:{ all -> 0x049b }
            r7 = 0
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0378
            X.C229416o.A00(r15, r2, r1)     // Catch:{ all -> 0x049b }
        L_0x0378:
            java.util.List r1 = r5.A0N     // Catch:{ all -> 0x049b }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x049b }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x040d
            X.14e r0 = r2.A02     // Catch:{ all -> 0x049b }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x049b }
            boolean r0 = r0.inTransaction()     // Catch:{ all -> 0x049b }
            X.C18740tg.A0C(r0)     // Catch:{ all -> 0x049b }
            r15.clear()     // Catch:{ all -> 0x049b }
            java.util.Iterator r13 = r1.iterator()     // Catch:{ all -> 0x049b }
        L_0x0394:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x049b }
            if (r0 == 0) goto L_0x040d
            java.lang.Object r7 = r13.next()     // Catch:{ all -> 0x049b }
            X.6bd r7 = (X.C134806bd) r7     // Catch:{ all -> 0x049b }
            r15.clear()     // Catch:{ all -> 0x049b }
            java.lang.String r1 = r7.A00     // Catch:{ all -> 0x049b }
            java.lang.String r0 = "category_id"
            r15.put(r0, r1)     // Catch:{ all -> 0x049b }
            java.lang.String r1 = r7.A01     // Catch:{ all -> 0x049b }
            java.lang.String r0 = "category_name"
            r15.put(r0, r1)     // Catch:{ all -> 0x049b }
            java.lang.String r8 = r7.A03     // Catch:{ all -> 0x049b }
            java.lang.String r0 = "_id"
            r15.put(r0, r8)     // Catch:{ all -> 0x049b }
            java.lang.String r1 = r7.A02     // Catch:{ all -> 0x049b }
            java.lang.String r0 = "offering_name"
            r15.put(r0, r1)     // Catch:{ all -> 0x049b }
            r0 = 1
            java.lang.String[] r9 = new java.lang.String[r0]     // Catch:{ all -> 0x049b }
            r9[r18] = r8     // Catch:{ all -> 0x049b }
            java.lang.String r1 = "wa_biz_category_service_offerings"
            java.lang.String r0 = "_id=?"
            long r11 = X.C229416o.A01(r15, r2, r1, r0, r9)     // Catch:{ all -> 0x049b }
            r9 = 0
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x03d5
            X.C229416o.A00(r15, r2, r1)     // Catch:{ all -> 0x049b }
        L_0x03d5:
            r15.clear()     // Catch:{ all -> 0x049b }
            boolean r0 = r7.A04     // Catch:{ all -> 0x049b }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x049b }
            java.lang.String r0 = "is_offered"
            r15.put(r0, r1)     // Catch:{ all -> 0x049b }
            java.lang.Long r0 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x049b }
            r15.put(r6, r0)     // Catch:{ all -> 0x049b }
            java.lang.String r0 = "wa_biz_category_service_offerings_id"
            r15.put(r0, r8)     // Catch:{ all -> 0x049b }
            r0 = 2
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ all -> 0x049b }
            r7[r18] = r8     // Catch:{ all -> 0x049b }
            java.lang.String r1 = java.lang.String.valueOf(r19)     // Catch:{ all -> 0x049b }
            r0 = 1
            r7[r0] = r1     // Catch:{ all -> 0x049b }
            java.lang.String r1 = "wa_biz_profile_to_service_offerings"
            java.lang.String r0 = "wa_biz_category_service_offerings_id=? = ? AND wa_biz_profile_id = ?"
            long r9 = X.C229416o.A01(r15, r2, r1, r0, r7)     // Catch:{ all -> 0x049b }
            r7 = 0
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0394
            X.C229416o.A00(r15, r2, r1)     // Catch:{ all -> 0x049b }
            goto L_0x0394
        L_0x040d:
            java.lang.String r9 = r5.A0A     // Catch:{ all -> 0x049b }
            if (r9 == 0) goto L_0x0417
            int r0 = r9.length()     // Catch:{ all -> 0x049b }
            if (r0 != 0) goto L_0x043f
        L_0x0417:
            java.lang.String r0 = r5.A0K     // Catch:{ all -> 0x049b }
            if (r0 == 0) goto L_0x0421
            int r0 = r0.length()     // Catch:{ all -> 0x049b }
            if (r0 != 0) goto L_0x043f
        L_0x0421:
            java.lang.String r0 = r5.A0C     // Catch:{ all -> 0x049b }
            if (r0 == 0) goto L_0x042b
            int r0 = r0.length()     // Catch:{ all -> 0x049b }
            if (r0 != 0) goto L_0x043f
        L_0x042b:
            java.util.List r0 = r5.A0P     // Catch:{ all -> 0x049b }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x049b }
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x043f
            java.util.List r0 = r5.A0S     // Catch:{ all -> 0x049b }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x049b }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x001b
        L_0x043f:
            java.lang.String r8 = r5.A0K     // Catch:{ all -> 0x049b }
            java.lang.String r7 = r5.A0C     // Catch:{ all -> 0x049b }
            java.util.List r1 = r5.A0P     // Catch:{ all -> 0x049b }
            java.util.List r5 = r5.A0S     // Catch:{ all -> 0x049b }
            r15.clear()     // Catch:{ all -> 0x049b }
            java.lang.Long r0 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x049b }
            r15.put(r6, r0)     // Catch:{ all -> 0x049b }
            if (r9 == 0) goto L_0x045e
            int r0 = r9.length()     // Catch:{ all -> 0x049b }
            if (r0 == 0) goto L_0x045e
            java.lang.String r0 = "bot_description"
            r15.put(r0, r9)     // Catch:{ all -> 0x049b }
        L_0x045e:
            if (r8 == 0) goto L_0x046b
            int r0 = r8.length()     // Catch:{ all -> 0x049b }
            if (r0 == 0) goto L_0x046b
            java.lang.String r0 = "sub_description"
            r15.put(r0, r8)     // Catch:{ all -> 0x049b }
        L_0x046b:
            if (r7 == 0) goto L_0x0478
            int r0 = r7.length()     // Catch:{ all -> 0x049b }
            if (r0 == 0) goto L_0x0478
            java.lang.String r0 = "commands_description"
            r15.put(r0, r7)     // Catch:{ all -> 0x049b }
        L_0x0478:
            java.lang.String r1 = X.AnonymousClass3LO.A00(r1)     // Catch:{ all -> 0x049b }
            java.lang.String r0 = "commands"
            r15.put(r0, r1)     // Catch:{ all -> 0x049b }
            java.lang.String r1 = X.C129326Gl.A00(r5)     // Catch:{ all -> 0x049b }
            java.lang.String r0 = "prompts"
            r15.put(r0, r1)     // Catch:{ all -> 0x049b }
            java.lang.String r0 = "wa_biz_profiles_bot_attributes"
            X.C229416o.A00(r15, r2, r0)     // Catch:{ all -> 0x049b }
            goto L_0x001b
        L_0x0491:
            r3.A00()     // Catch:{ all -> 0x049b }
            r3.close()     // Catch:{ all -> 0x04a2 }
            r2.close()
            return
        L_0x049b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x049d }
        L_0x049d:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ all -> 0x04a2 }
            throw r0     // Catch:{ all -> 0x04a2 }
        L_0x04a2:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x04a4 }
        L_0x04a4:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1LE.A08(java.util.Map):void");
    }

    public static final void A04(ContentValues contentValues, C134766bZ r3, C26911Lz r4, int i, long j) {
        contentValues.clear();
        contentValues.put("wa_biz_profile_id", Long.valueOf(j));
        contentValues.put("account_id", r3.A02);
        contentValues.put("account_type", Integer.valueOf(i));
        contentValues.put("account_display_name", r3.A01);
        contentValues.put("account_fan_count", Integer.valueOf(r3.A00));
        contentValues.put("account_has_media_post", Boolean.valueOf(r3.A03));
        C229416o.A00(contentValues, r4, "wa_biz_profiles_linked_accounts_table");
    }

    public AnonymousClass1LE(C229716r r1) {
        super(r1);
    }
}
