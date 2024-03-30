package X;

/* renamed from: X.9nD  reason: invalid class name and case insensitive filesystem */
public final class C203059nD {
    public static final C203059nD A00 = new C203059nD();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: X.9ta} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: X.6bZ} */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r10v1 */
    /* JADX WARNING: type inference failed for: r4v6, types: [java.util.Collection] */
    /* JADX WARNING: type inference failed for: r6v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r4v25, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r10v11 */
    /* JADX WARNING: type inference failed for: r11v11, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r10v16 */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x021b, code lost:
        if (r3.equals("specific_hours") == false) goto L_0x0227;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0224, code lost:
        if (r3.equals("open_24h") == false) goto L_0x0227;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0227, code lost:
        r0 = X.C165567td.A0G("Unrecognized open mode: ", r3, X.AnonymousClass000.A0u());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0233, code lost:
        r8 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0235, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0237, code lost:
        r8 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0238, code lost:
        r12.add(new X.AnonymousClass3XO(r14, r13, r9, r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0272, code lost:
        if ("catalog_exists".equals(r8.A0i("status", (java.lang.String) null)) == false) goto L_0x0274;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02a5, code lost:
        if (r9 == false) goto L_0x02a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02bf, code lost:
        if (r9 == false) goto L_0x02c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02d1, code lost:
        if (r9 == false) goto L_0x02d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01a3, code lost:
        r0 = X.C165567td.A0G("Unrecognized week day: ", r9, X.AnonymousClass000.A0u());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01ad, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01f3, code lost:
        X.AnonymousClass00C.A0B(r3);
        X.AnonymousClass00C.A0D(r3, 0);
        r15 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0200, code lost:
        if (r15 == -504372495) goto L_0x021e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0205, code lost:
        if (r15 == 1800267202) goto L_0x0215;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x020a, code lost:
        if (r15 != 2060249164) goto L_0x0227;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0212, code lost:
        if (r3.equals("appointment_only") == false) goto L_0x0227;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0313  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x03ac  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0453  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0538  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x05e3  */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C207109uZ A01(com.whatsapp.jid.UserJid r18, X.C203399nx r19) {
        /*
            r1 = 0
            X.9nD r7 = A00
            r8 = 0
            r2 = r19
            if (r19 != 0) goto L_0x000a
            r0 = 0
            return r0
        L_0x000a:
            X.9ep r0 = new X.9ep
            r0.<init>()
            r3 = r18
            r0.A08 = r3
            java.lang.String r3 = "tag"
            java.lang.String r3 = r2.A0i(r3, r8)
            r0.A0L = r3
            java.lang.String r3 = "structured_address"
            X.9nx r4 = r2.A0c(r3)
            if (r4 == 0) goto L_0x003c
            java.lang.String r3 = "street_address"
            java.lang.String r11 = A03(r4, r3)
            java.lang.String r3 = "zip_code"
            java.lang.String r10 = A03(r4, r3)
            java.lang.String r3 = "city_id"
            java.lang.String r9 = A03(r4, r3)
            java.lang.String r3 = "localized_city_name"
            java.lang.String r14 = A03(r4, r3)
            goto L_0x0045
        L_0x003c:
            java.lang.String r3 = "address"
            java.lang.String r11 = A03(r2, r3)
            r14 = r8
            r10 = r8
            r9 = r8
        L_0x0045:
            java.lang.String r6 = "latitude"
            X.9nx r4 = r2.A0c(r6)     // Catch:{ NumberFormatException -> 0x0601 }
            r12 = 0
            if (r4 == 0) goto L_0x0062
            java.lang.String r3 = r4.A0e()     // Catch:{ NumberFormatException -> 0x0601 }
            if (r3 == 0) goto L_0x0062
            java.lang.String r3 = r4.A0e()     // Catch:{ NumberFormatException -> 0x0601 }
            if (r3 == 0) goto L_0x0062
            double r3 = java.lang.Double.parseDouble(r3)     // Catch:{ NumberFormatException -> 0x0601 }
            java.lang.Double r12 = java.lang.Double.valueOf(r3)     // Catch:{ NumberFormatException -> 0x0601 }
        L_0x0062:
            java.lang.String r5 = "longitude"
            X.9nx r4 = r2.A0c(r5)     // Catch:{ NumberFormatException -> 0x0601 }
            r13 = 0
            if (r4 == 0) goto L_0x007f
            java.lang.String r3 = r4.A0e()     // Catch:{ NumberFormatException -> 0x0601 }
            if (r3 == 0) goto L_0x007f
            java.lang.String r3 = r4.A0e()     // Catch:{ NumberFormatException -> 0x0601 }
            if (r3 == 0) goto L_0x007f
            double r3 = java.lang.Double.parseDouble(r3)     // Catch:{ NumberFormatException -> 0x0601 }
            java.lang.Double r13 = java.lang.Double.valueOf(r3)     // Catch:{ NumberFormatException -> 0x0601 }
        L_0x007f:
            java.lang.String r3 = ""
            if (r9 != 0) goto L_0x0084
            r9 = r3
        L_0x0084:
            if (r14 == 0) goto L_0x0087
            r3 = r14
        L_0x0087:
            X.3XE r4 = new X.3XE
            r4.<init>(r12, r13, r9, r3)
            X.3XS r3 = new X.3XS
            r3.<init>(r4, r8, r11, r10)
            r0.A07 = r3
            java.lang.String r3 = "description"
            java.lang.String r3 = A03(r2, r3)
            r0.A0G = r3
            boolean r18 = r7.A04(r0, r2)
            java.lang.String r3 = "email"
            java.lang.String r3 = A03(r2, r3)
            r0.A0H = r3
            java.lang.String r3 = "vertical"
            X.9nx r4 = r2.A0c(r3)
            if (r4 == 0) goto L_0x0100
            java.lang.String r3 = "canonical"
            java.lang.String r3 = r4.A0i(r3, r8)
        L_0x00b5:
            r0.A0M = r3
            X.09w r11 = X.C023409w.A00
            r4 = r11
            r19 = r11
            java.lang.String r3 = "categories"
            java.util.List r8 = r2.A0j(r3)
            X.AnonymousClass00C.A08(r8)
            boolean r3 = r8.isEmpty()
            if (r3 != 0) goto L_0x0102
            java.lang.Object r8 = r8.get(r1)
            X.9nx r8 = (X.C203399nx) r8
            java.util.ArrayList r11 = X.AnonymousClass001.A0I()
            java.lang.String r3 = "category"
            java.util.List r3 = r8.A0j(r3)
            java.util.Iterator r10 = X.C90514aH.A14(r3)
        L_0x00df:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x0102
            X.9nx r8 = X.C36431kI.A0s(r10)
            java.lang.String r3 = "id"
            java.lang.String r9 = X.C36391kE.A0x(r8, r3)
            java.lang.String r8 = r8.A0e()
            if (r9 == 0) goto L_0x00df
            if (r8 == 0) goto L_0x00df
            X.6bw r3 = new X.6bw
            r3.<init>(r9, r8)
            r11.add(r3)
            goto L_0x00df
        L_0x0100:
            r3 = 0
            goto L_0x00b5
        L_0x0102:
            java.util.List r3 = r0.A0O
            r3.clear()
            r3.addAll(r11)
            java.lang.String r3 = "website"
            java.util.List r3 = r2.A0j(r3)
            java.util.ArrayList r9 = X.C36411kG.A13(r3)
            java.util.Iterator r8 = r3.iterator()
        L_0x0118:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x012a
            X.9nx r3 = X.C36431kI.A0s(r8)
            java.lang.String r3 = r3.A0e()
            r9.add(r3)
            goto L_0x0118
        L_0x012a:
            java.util.List r3 = r0.A0U
            r3.clear()
            r3.addAll(r9)
            java.lang.String r3 = "business_hours"
            X.9nx r9 = r2.A0c(r3)
            r10 = 0
            if (r9 == 0) goto L_0x025a
            java.lang.String r3 = "timezone"
            java.lang.String r17 = r9.A0i(r3, r10)     // Catch:{ NumberFormatException -> 0x0253 }
            java.util.ArrayList r12 = X.AnonymousClass001.A0I()     // Catch:{ NumberFormatException -> 0x0253 }
            java.lang.String r3 = "business_hours_note"
            X.9nx r8 = r9.A0c(r3)     // Catch:{ NumberFormatException -> 0x0253 }
            if (r8 == 0) goto L_0x0242
            java.lang.String r3 = r8.A0e()     // Catch:{ NumberFormatException -> 0x0253 }
            if (r3 == 0) goto L_0x0242
            java.lang.String r11 = r8.A0e()     // Catch:{ NumberFormatException -> 0x0253 }
        L_0x0157:
            java.lang.String r3 = "business_hours_config"
            java.util.Iterator r16 = X.C203399nx.A08(r9, r3)     // Catch:{ NumberFormatException -> 0x0253 }
        L_0x015d:
            boolean r3 = r16.hasNext()     // Catch:{ NumberFormatException -> 0x0253 }
            if (r3 == 0) goto L_0x0245
            X.9nx r14 = X.C36431kI.A0s(r16)     // Catch:{ NumberFormatException -> 0x0253 }
            java.lang.String r3 = "day_of_week"
            java.lang.String r9 = r14.A0i(r3, r10)     // Catch:{ NumberFormatException -> 0x0253 }
            X.C18740tg.A06(r9)     // Catch:{ NumberFormatException -> 0x0253 }
            java.lang.String r3 = "mode"
            java.lang.String r3 = r14.A0i(r3, r10)     // Catch:{ NumberFormatException -> 0x0253 }
            X.C18740tg.A06(r3)     // Catch:{ NumberFormatException -> 0x0253 }
            java.lang.String r8 = "open_time"
            java.lang.String r13 = r14.A0i(r8, r10)     // Catch:{ NumberFormatException -> 0x0253 }
            java.lang.String r8 = "close_time"
            java.lang.String r8 = r14.A0i(r8, r10)     // Catch:{ NumberFormatException -> 0x0253 }
            if (r13 == 0) goto L_0x018c
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)     // Catch:{ NumberFormatException -> 0x0253 }
            goto L_0x018d
        L_0x018c:
            r14 = r10
        L_0x018d:
            if (r8 == 0) goto L_0x0190
            goto L_0x0192
        L_0x0190:
            r13 = r10
            goto L_0x0196
        L_0x0192:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)     // Catch:{ NumberFormatException -> 0x0253 }
        L_0x0196:
            X.AnonymousClass00C.A0B(r9)     // Catch:{ NumberFormatException -> 0x0253 }
            X.AnonymousClass00C.A0D(r9, r1)     // Catch:{ NumberFormatException -> 0x0253 }
            int r8 = r9.hashCode()     // Catch:{ NumberFormatException -> 0x0253 }
            switch(r8) {
                case 101661: goto L_0x01ea;
                case 108300: goto L_0x01e0;
                case 113638: goto L_0x01d6;
                case 114252: goto L_0x01cc;
                case 114817: goto L_0x01c2;
                case 115204: goto L_0x01b8;
                case 117590: goto L_0x01ae;
                default: goto L_0x01a3;
            }     // Catch:{ NumberFormatException -> 0x0253 }
        L_0x01a3:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ NumberFormatException -> 0x0253 }
            java.lang.String r0 = "Unrecognized week day: "
            X.19b r0 = X.C165567td.A0G(r0, r9, r1)     // Catch:{ NumberFormatException -> 0x0253 }
        L_0x01ad:
            throw r0     // Catch:{ NumberFormatException -> 0x0253 }
        L_0x01ae:
            java.lang.String r8 = "wed"
            boolean r8 = r9.equals(r8)     // Catch:{ NumberFormatException -> 0x0253 }
            if (r8 == 0) goto L_0x01a3
            r9 = 4
            goto L_0x01f3
        L_0x01b8:
            java.lang.String r8 = "tue"
            boolean r8 = r9.equals(r8)     // Catch:{ NumberFormatException -> 0x0253 }
            if (r8 == 0) goto L_0x01a3
            r9 = 3
            goto L_0x01f3
        L_0x01c2:
            java.lang.String r8 = "thu"
            boolean r8 = r9.equals(r8)     // Catch:{ NumberFormatException -> 0x0253 }
            if (r8 == 0) goto L_0x01a3
            r9 = 5
            goto L_0x01f3
        L_0x01cc:
            java.lang.String r8 = "sun"
            boolean r8 = r9.equals(r8)     // Catch:{ NumberFormatException -> 0x0253 }
            if (r8 == 0) goto L_0x01a3
            r9 = 1
            goto L_0x01f3
        L_0x01d6:
            java.lang.String r8 = "sat"
            boolean r8 = r9.equals(r8)     // Catch:{ NumberFormatException -> 0x0253 }
            if (r8 == 0) goto L_0x01a3
            r9 = 7
            goto L_0x01f3
        L_0x01e0:
            java.lang.String r8 = "mon"
            boolean r8 = r9.equals(r8)     // Catch:{ NumberFormatException -> 0x0253 }
            if (r8 == 0) goto L_0x01a3
            r9 = 2
            goto L_0x01f3
        L_0x01ea:
            java.lang.String r8 = "fri"
            boolean r8 = r9.equals(r8)     // Catch:{ NumberFormatException -> 0x0253 }
            if (r8 == 0) goto L_0x01a3
            r9 = 6
        L_0x01f3:
            X.AnonymousClass00C.A0B(r3)     // Catch:{ NumberFormatException -> 0x0253 }
            X.AnonymousClass00C.A0D(r3, r1)     // Catch:{ NumberFormatException -> 0x0253 }
            int r15 = r3.hashCode()     // Catch:{ NumberFormatException -> 0x0253 }
            r8 = -504372495(0xffffffffe1efe2f1, float:-5.531406E20)
            if (r15 == r8) goto L_0x021e
            r8 = 1800267202(0x6b4de5c2, float:2.489148E26)
            if (r15 == r8) goto L_0x0215
            r8 = 2060249164(0x7acce84c, float:5.3197005E35)
            if (r15 != r8) goto L_0x0227
            java.lang.String r8 = "appointment_only"
            boolean r8 = r3.equals(r8)     // Catch:{ NumberFormatException -> 0x0253 }
            if (r8 == 0) goto L_0x0227
            goto L_0x0233
        L_0x0215:
            java.lang.String r8 = "specific_hours"
            boolean r8 = r3.equals(r8)     // Catch:{ NumberFormatException -> 0x0253 }
            if (r8 == 0) goto L_0x0227
            goto L_0x0235
        L_0x021e:
            java.lang.String r8 = "open_24h"
            boolean r8 = r3.equals(r8)     // Catch:{ NumberFormatException -> 0x0253 }
            if (r8 == 0) goto L_0x0227
            goto L_0x0237
        L_0x0227:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ NumberFormatException -> 0x0253 }
            java.lang.String r0 = "Unrecognized open mode: "
            X.19b r0 = X.C165567td.A0G(r0, r3, r1)     // Catch:{ NumberFormatException -> 0x0253 }
            goto L_0x01ad
        L_0x0233:
            r8 = 2
            goto L_0x0238
        L_0x0235:
            r8 = 0
            goto L_0x0238
        L_0x0237:
            r8 = 1
        L_0x0238:
            X.3XO r3 = new X.3XO     // Catch:{ NumberFormatException -> 0x0253 }
            r3.<init>(r14, r13, r9, r8)     // Catch:{ NumberFormatException -> 0x0253 }
            r12.add(r3)     // Catch:{ NumberFormatException -> 0x0253 }
            goto L_0x015d
        L_0x0242:
            r11 = r10
            goto L_0x0157
        L_0x0245:
            int r3 = r12.size()     // Catch:{ NumberFormatException -> 0x0253 }
            if (r3 <= 0) goto L_0x025a
            X.3XK r8 = new X.3XK     // Catch:{ NumberFormatException -> 0x0253 }
            r3 = r17
            r8.<init>(r3, r11, r12)     // Catch:{ NumberFormatException -> 0x0253 }
            goto L_0x025b
        L_0x0253:
            java.lang.String r0 = "Business hours open/close time failed to parse."
            X.19b r0 = X.C165617ti.A0Q(r0)
            throw r0
        L_0x025a:
            r8 = r10
        L_0x025b:
            r0.A03 = r8
            java.lang.String r3 = "catalog_status"
            X.9nx r8 = r2.A0c(r3)
            if (r8 == 0) goto L_0x0274
            java.lang.String r3 = "status"
            java.lang.String r8 = r8.A0i(r3, r10)
            java.lang.String r3 = "catalog_exists"
            boolean r8 = r3.equals(r8)
            r3 = 1
            if (r8 != 0) goto L_0x0275
        L_0x0274:
            r3 = 0
        L_0x0275:
            r0.A0V = r3
            java.lang.String r3 = "profile_options"
            X.9nx r8 = r2.A0c(r3)
            r11 = 1
            if (r8 == 0) goto L_0x0303
            java.lang.String r3 = "commerce_experience"
            java.lang.String r9 = A03(r8, r3)
            r0.A0D = r9
            java.lang.String r3 = "shop"
            boolean r3 = r3.equalsIgnoreCase(r9)
            if (r3 == 0) goto L_0x0437
            java.lang.String r3 = "shop_url"
            java.lang.String r3 = A03(r8, r3)
            r0.A0J = r3
        L_0x0298:
            java.lang.String r3 = "cart_enabled"
            java.lang.Boolean r3 = A02(r8, r3)
            if (r3 == 0) goto L_0x02a7
            boolean r9 = r3.booleanValue()
            r3 = 1
            if (r9 != 0) goto L_0x02a8
        L_0x02a7:
            r3 = 0
        L_0x02a8:
            r0.A0X = r3
            java.lang.String r3 = "commerce_manager_url"
            java.lang.String r3 = A03(r8, r3)
            r0.A0E = r3
            java.lang.String r3 = "is_banned"
            java.lang.Boolean r3 = A02(r8, r3)
            if (r3 == 0) goto L_0x02c1
            boolean r9 = r3.booleanValue()
            r3 = 1
            if (r9 != 0) goto L_0x02c2
        L_0x02c1:
            r3 = 0
        L_0x02c2:
            r0.A0c = r3
            java.lang.String r3 = "has_galaxy_flows"
            java.lang.Boolean r3 = A02(r8, r3)
            if (r3 == 0) goto L_0x02d3
            boolean r9 = r3.booleanValue()
            r3 = 1
            if (r9 != 0) goto L_0x02d4
        L_0x02d3:
            r3 = 0
        L_0x02d4:
            r0.A0Z = r3
            java.lang.String r3 = "calling_enabled"
            java.lang.Boolean r3 = A02(r8, r3)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r11)
            boolean r3 = r9.equals(r3)
            r0.A0W = r3
            java.lang.String r3 = "is_responsive"
            java.lang.Boolean r3 = A02(r8, r3)
            boolean r3 = r9.equals(r3)
            r0.A0b = r3
            java.lang.String r3 = "is_offerings_eligible"
            java.lang.Boolean r3 = A02(r8, r3)
            boolean r3 = r9.equals(r3)
            r0.A0a = r3
            if (r18 != 0) goto L_0x0303
            r7.A04(r0, r8)
        L_0x0303:
            java.lang.String r3 = "custom_url"
            java.lang.String r3 = A03(r2, r3)
            r0.A0F = r3
            java.lang.String r3 = "linked_accounts"
            X.9nx r11 = r2.A0c(r3)
            if (r11 == 0) goto L_0x0379
            java.lang.String r3 = "fb_page"
            X.9nx r12 = r11.A0c(r3)
            r13 = 0
            java.lang.String r14 = "has_published_media_posts"
            java.lang.String r9 = "id"
            r16 = 1
            if (r12 == 0) goto L_0x0434
            java.lang.String r15 = r12.A0i(r9, r10)
            java.lang.String r3 = "display_name"
            java.lang.String r8 = A03(r12, r3)
            java.lang.String r3 = "likes"
            int r7 = A00(r12, r3)
            java.lang.Boolean r12 = A02(r12, r14)
            if (r15 == 0) goto L_0x0434
            if (r8 == 0) goto L_0x0434
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r16)
            boolean r3 = X.C36361kB.A1a(r12, r3)
            X.6bZ r12 = new X.6bZ
            r12.<init>(r15, r8, r7, r3)
        L_0x0347:
            java.lang.String r3 = "ig_professional"
            X.9nx r7 = r11.A0c(r3)
            if (r7 == 0) goto L_0x0373
            java.lang.String r11 = r7.A0i(r9, r10)
            java.lang.String r3 = "ig_handle"
            java.lang.String r9 = A03(r7, r3)
            java.lang.String r3 = "followers"
            int r8 = A00(r7, r3)
            java.lang.Boolean r7 = A02(r7, r14)
            if (r11 == 0) goto L_0x0373
            if (r9 == 0) goto L_0x0373
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r16)
            if (r7 != r3) goto L_0x036e
            r13 = 1
        L_0x036e:
            X.6bZ r10 = new X.6bZ
            r10.<init>(r11, r9, r8, r13)
        L_0x0373:
            X.9ta r3 = new X.9ta
            r3.<init>(r12, r10)
            r10 = r3
        L_0x0379:
            r0.A05 = r10
            java.lang.String r3 = "cover_photo"
            X.9nx r7 = r2.A0c(r3)
            java.lang.String r9 = A03(r2, r3)
            if (r7 == 0) goto L_0x039d
            java.lang.String r3 = "id"
            java.lang.String r8 = X.C36391kE.A0x(r7, r3)
            if (r8 == 0) goto L_0x039d
            int r3 = r8.length()
            if (r3 == 0) goto L_0x039d
            r7 = 0
            X.3XP r3 = new X.3XP
            r3.<init>(r8, r7, r7, r9)
            r0.A04 = r3
        L_0x039d:
            java.lang.String r3 = "service_areas"
            java.util.List r7 = r2.A0j(r3)
            X.AnonymousClass00C.A08(r7)
            boolean r3 = X.C36401kF.A1a(r7)
            if (r3 == 0) goto L_0x0443
            java.lang.Object r7 = r7.get(r1)
            X.9nx r7 = (X.C203399nx) r7
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.lang.String r3 = "service_area"
            java.util.List r3 = r7.A0j(r3)
            java.util.Iterator r11 = X.C90514aH.A14(r3)
        L_0x03c0:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto L_0x0443
            X.9nx r7 = X.C36431kI.A0s(r11)
            java.lang.String r3 = "area_description"
            X.9nx r3 = r7.A0c(r3)
            r10 = 0
            if (r3 == 0) goto L_0x0432
            java.lang.String r13 = r3.A0e()
        L_0x03d7:
            java.lang.String r3 = "area_radius_meters"
            X.9nx r3 = r7.A0c(r3)
            if (r3 == 0) goto L_0x0430
            java.lang.String r9 = r3.A0e()
        L_0x03e3:
            java.lang.String r3 = "area_center"
            X.9nx r8 = r7.A0c(r3)
            if (r8 == 0) goto L_0x03c0
            X.9nx r3 = r8.A0c(r6)
            if (r3 == 0) goto L_0x042e
            java.lang.String r7 = r3.A0e()
        L_0x03f5:
            X.9nx r3 = r8.A0c(r5)
            if (r3 == 0) goto L_0x03ff
            java.lang.String r10 = r3.A0e()
        L_0x03ff:
            if (r7 == 0) goto L_0x03c0
            if (r10 == 0) goto L_0x03c0
            if (r9 == 0) goto L_0x03c0
            java.lang.Double r8 = java.lang.Double.valueOf(r7)
            java.lang.Double r7 = java.lang.Double.valueOf(r10)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            if (r3 == 0) goto L_0x03c0
            if (r8 == 0) goto L_0x03c0
            if (r7 == 0) goto L_0x03c0
            if (r13 == 0) goto L_0x03c0
            int r18 = r3.intValue()
            double r14 = r8.doubleValue()
            double r16 = r7.doubleValue()
            X.6bY r12 = new X.6bY
            r12.<init>(r13, r14, r16, r18)
            r4.add(r12)
            goto L_0x03c0
        L_0x042e:
            r7 = r10
            goto L_0x03f5
        L_0x0430:
            r9 = r10
            goto L_0x03e3
        L_0x0432:
            r13 = r10
            goto L_0x03d7
        L_0x0434:
            r12 = r10
            goto L_0x0347
        L_0x0437:
            java.lang.String r3 = "catalog"
            boolean r3 = r3.equals(r9)
            if (r3 == 0) goto L_0x0298
            r0.A0V = r11
            goto L_0x0298
        L_0x0443:
            java.util.List r3 = r0.A0T
            r3.clear()
            r3.addAll(r4)
            java.lang.String r3 = "direct_connection"
            X.9nx r7 = r2.A0c(r3)
            if (r7 == 0) goto L_0x0502
            java.lang.String r4 = "enabled"
            java.lang.String r3 = "false"
            java.lang.String r3 = r7.A0i(r4, r3)
            if (r3 == 0) goto L_0x0463
            boolean r3 = java.lang.Boolean.parseBoolean(r3)
            r0.A0Y = r3
        L_0x0463:
            java.lang.String r3 = "default_postcode"
            X.9nx r8 = r7.A0c(r3)
            if (r8 == 0) goto L_0x048b
            java.lang.String r3 = "code"
            r4 = 0
            java.lang.String r6 = r8.A0i(r3, r4)
            java.lang.String r3 = "location_name"
            java.lang.String r5 = r8.A0i(r3, r4)
            java.lang.String r4 = "postcode_type"
            java.lang.String r3 = "pincode"
            java.lang.String r4 = r8.A0i(r4, r3)
            if (r6 == 0) goto L_0x048b
            if (r5 == 0) goto L_0x048b
            X.9tg r3 = new X.9tg
            r3.<init>(r6, r5, r4)
            r0.A02 = r3
        L_0x048b:
            java.lang.String r4 = "allowed_country_codes"
            X.9nx r3 = r7.A0c(r4)
            if (r3 == 0) goto L_0x04c1
            java.util.List r3 = r7.A0j(r4)
            X.AnonymousClass00C.A08(r3)
            java.util.HashSet r5 = X.C36441kJ.A16()
            java.util.Iterator r4 = r3.iterator()
        L_0x04a2:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L_0x04b4
            X.9nx r3 = X.C36431kI.A0s(r4)
            java.lang.String r3 = r3.A0e()
            r5.add(r3)
            goto L_0x04a2
        L_0x04b4:
            java.util.ArrayList r4 = X.C36441kJ.A15(r5)
            r3 = 0
            r0.A0R = r3
            java.util.ArrayList r3 = X.C36441kJ.A15(r4)
            r0.A0R = r3
        L_0x04c1:
            java.lang.String r3 = "features"
            java.util.List r3 = r7.A0j(r3)
            java.util.ArrayList r6 = X.C36411kG.A13(r3)
            java.util.Iterator r5 = r3.iterator()
        L_0x04cf:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L_0x04ea
            X.9nx r4 = X.C36431kI.A0s(r5)
            java.lang.String r3 = "name"
            java.lang.String r4 = X.C36391kE.A0x(r4, r3)
            if (r4 == 0) goto L_0x04cf
            X.9tS r3 = new X.9tS
            r3.<init>(r4)
            r6.add(r3)
            goto L_0x04cf
        L_0x04ea:
            java.util.List r3 = r0.A0Q
            r3.clear()
            r3.addAll(r6)
            java.lang.String r3 = "blocked_status"
            java.lang.String r4 = X.C36391kE.A0x(r7, r3)
            if (r4 == 0) goto L_0x0502
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r3 = X.C165607th.A0v(r3, r4)
            r0.A0B = r3
        L_0x0502:
            java.lang.String r3 = "member_since_text"
            java.lang.String r3 = A03(r2, r3)
            r0.A0I = r3
            java.lang.String r3 = "price_tier"
            X.9nx r7 = r2.A0c(r3)
            r6 = 0
            if (r7 == 0) goto L_0x052a
            java.lang.String r3 = "id"
            java.lang.String r5 = r7.A0i(r3, r6)
            if (r5 == 0) goto L_0x052a
            java.lang.String r4 = r7.A0e()
            java.lang.String r3 = "symbol"
            java.lang.String r3 = r7.A0i(r3, r6)
            X.6bQ r6 = new X.6bQ
            r6.<init>(r5, r4, r3)
        L_0x052a:
            r0.A06 = r6
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            java.lang.String r3 = "offerings"
            X.9nx r4 = r2.A0c(r3)
            if (r4 == 0) goto L_0x05d7
            java.lang.String r3 = "category"
            java.util.List r3 = r4.A0j(r3)
            java.util.Iterator r12 = X.C90514aH.A14(r3)
        L_0x0542:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L_0x05d5
            X.9nx r7 = X.C36431kI.A0s(r12)
            java.lang.String r5 = "id"
            r4 = 0
            java.lang.String r15 = r7.A0i(r5, r4)
            java.lang.String r3 = "name"
            java.lang.String r14 = r7.A0i(r3, r4)
            boolean r3 = X.AnonymousClass14B.A0F(r15)
            if (r3 != 0) goto L_0x0542
            boolean r3 = X.AnonymousClass14B.A0F(r14)
            if (r3 != 0) goto L_0x0542
            java.lang.String r3 = "offering"
            java.util.List r3 = r7.A0j(r3)
            java.util.Iterator r11 = X.C90514aH.A14(r3)
        L_0x056f:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto L_0x0542
            X.9nx r7 = X.C36431kI.A0s(r11)
            r4 = 0
            java.lang.String r16 = r7.A0i(r5, r4)
            java.lang.String r17 = r7.A0e()
            java.lang.String r3 = "is_offered"
            java.lang.String r8 = r7.A0i(r3, r4)
            if (r16 == 0) goto L_0x056f
            if (r17 == 0) goto L_0x056f
            if (r8 == 0) goto L_0x056f
            if (r14 == 0) goto L_0x056f
            if (r15 == 0) goto L_0x056f
            int r9 = r8.length()
            r3 = 1
            int r9 = r9 - r3
            r7 = 0
            r10 = 0
        L_0x059a:
            if (r7 > r9) goto L_0x05bc
            r3 = r9
            if (r10 != 0) goto L_0x05a0
            r3 = r7
        L_0x05a0:
            char r4 = r8.charAt(r3)
            r3 = 32
            int r3 = X.AnonymousClass00C.A00(r4, r3)
            boolean r3 = X.C90484aE.A1Q(r3)
            if (r10 != 0) goto L_0x05b7
            if (r3 != 0) goto L_0x05b4
            r10 = 1
            goto L_0x059a
        L_0x05b4:
            int r7 = r7 + 1
            goto L_0x059a
        L_0x05b7:
            if (r3 == 0) goto L_0x05bc
            int r9 = r9 + -1
            goto L_0x059a
        L_0x05bc:
            int r3 = r9 + 1
            java.lang.CharSequence r3 = r8.subSequence(r7, r3)
            java.lang.String r4 = r3.toString()
            java.lang.String r3 = "true"
            boolean r18 = r3.equalsIgnoreCase(r4)
            X.6bd r13 = new X.6bd
            r13.<init>(r14, r15, r16, r17, r18)
            r6.add(r13)
            goto L_0x056f
        L_0x05d5:
            r19 = r6
        L_0x05d7:
            r3 = r19
            r0.A0N = r3
            java.lang.String r4 = "survey_sampling_rate"
            X.9nx r3 = r2.A0c(r4)
            if (r3 == 0) goto L_0x05f0
            int r4 = A00(r2, r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            if (r3 != 0) goto L_0x05f5
            r3 = 0
        L_0x05ee:
            r0.A09 = r3
        L_0x05f0:
            X.9uZ r0 = r0.A01()
            return r0
        L_0x05f5:
            if (r4 < 0) goto L_0x05fc
            r2 = 100
            if (r4 > r2) goto L_0x05fc
            goto L_0x05ee
        L_0x05fc:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            goto L_0x05ee
        L_0x0601:
            java.lang.String r0 = "business latitude/longitude failed to parse"
            X.19b r0 = X.C165617ti.A0Q(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203059nD.A01(com.whatsapp.jid.UserJid, X.9nx):X.9uZ");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0101, code lost:
        if (r2.equals("none") != false) goto L_0x0103;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A04(X.C199179ep r8, X.C203399nx r9) {
        /*
            r7 = this;
            java.lang.String r0 = "automated_type"
            java.lang.String r2 = A03(r9, r0)
            r1 = 0
            if (r2 == 0) goto L_0x0012
            java.lang.String r0 = "3p_full"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0089
            r1 = 2
        L_0x0012:
            r8.A00 = r1
            r6 = 0
            boolean r3 = X.AnonymousClass000.A1V(r2)
            java.lang.String r0 = "bot_description"
            java.lang.String r0 = A03(r9, r0)
            r8.A0A = r0
            java.lang.String r0 = "bot_sub_description"
            java.lang.String r0 = A03(r9, r0)
            r8.A0K = r0
            boolean r0 = X.AnonymousClass000.A1V(r0)
            r3 = r3 | r0
            java.lang.String r0 = "commands"
            X.9nx r1 = r9.A0c(r0)
            if (r1 == 0) goto L_0x009c
            java.lang.String r5 = "description"
            X.9nx r0 = r1.A0c(r5)
            if (r0 == 0) goto L_0x0087
            java.lang.String r0 = r0.A0e()
        L_0x0042:
            r8.A0C = r0
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.lang.String r0 = "command"
            java.util.List r0 = r1.A0j(r0)
            java.util.Iterator r3 = X.C90514aH.A14(r0)
        L_0x0052:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0093
            X.9nx r1 = X.C36431kI.A0s(r3)
            java.lang.String r0 = "name"
            X.9nx r0 = r1.A0c(r0)
            if (r0 == 0) goto L_0x0052
            java.lang.String r2 = r0.A0e()
            if (r2 == 0) goto L_0x0052
            boolean r0 = X.AnonymousClass14B.A0F(r2)
            if (r0 != 0) goto L_0x0052
            X.9nx r0 = r1.A0c(r5)
            if (r0 == 0) goto L_0x007c
            java.lang.String r1 = r0.A0e()
            if (r1 != 0) goto L_0x007e
        L_0x007c:
            java.lang.String r1 = ""
        L_0x007e:
            X.3uw r0 = new X.3uw
            r0.<init>(r2, r1)
            r4.add(r0)
            goto L_0x0052
        L_0x0087:
            r0 = 0
            goto L_0x0042
        L_0x0089:
            java.lang.String r0 = "1p_partial"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0012
            r1 = 1
            goto L_0x0012
        L_0x0093:
            java.util.List r0 = r8.A0P
            r0.clear()
            r0.addAll(r4)
            r3 = 1
        L_0x009c:
            java.lang.String r0 = "prompts"
            X.9nx r1 = r9.A0c(r0)
            if (r1 == 0) goto L_0x00f2
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.lang.String r0 = "prompt"
            java.util.List r0 = r1.A0j(r0)
            java.util.Iterator r3 = X.C90514aH.A14(r0)
        L_0x00b2:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00e9
            X.9nx r1 = X.C36431kI.A0s(r3)
            java.lang.String r0 = "text"
            X.9nx r0 = r1.A0c(r0)
            if (r0 == 0) goto L_0x00b2
            java.lang.String r2 = r0.A0e()
            if (r2 == 0) goto L_0x00b2
            boolean r0 = X.AnonymousClass14B.A0F(r2)
            if (r0 != 0) goto L_0x00b2
            java.lang.String r0 = "emoji"
            X.9nx r0 = r1.A0c(r0)
            if (r0 == 0) goto L_0x00de
            java.lang.String r1 = r0.A0e()
            if (r1 != 0) goto L_0x00e0
        L_0x00de:
            java.lang.String r1 = ""
        L_0x00e0:
            X.69W r0 = new X.69W
            r0.<init>(r2, r1)
            r4.add(r0)
            goto L_0x00b2
        L_0x00e9:
            java.util.List r0 = r8.A0S
            r0.clear()
            r0.addAll(r4)
            r3 = 1
        L_0x00f2:
            java.lang.String r0 = "welcome_message_protocol_mode"
            java.lang.String r2 = A03(r9, r0)
            if (r2 == 0) goto L_0x0103
            java.lang.String r0 = "none"
            boolean r1 = r2.equals(r0)
            r0 = 1
            if (r1 == 0) goto L_0x0104
        L_0x0103:
            r0 = 0
        L_0x0104:
            r8.A0d = r0
            if (r2 == 0) goto L_0x0109
            r6 = 1
        L_0x0109:
            r3 = r3 | r6
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203059nD.A04(X.9ep, X.9nx):boolean");
    }

    public static final int A00(C203399nx r1, String str) {
        C203399nx A0c = r1.A0c(str);
        if (A0c == null || A0c.A0e() == null) {
            return 0;
        }
        try {
            String A0e = A0c.A0e();
            if (A0e != null) {
                return Integer.parseInt(A0e);
            }
            return 0;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static final Boolean A02(C203399nx r4, String str) {
        boolean equalsIgnoreCase;
        C203399nx A0c = r4.A0c(str);
        String str2 = null;
        if (A0c == null || A0c.A0e() == null) {
            return null;
        }
        String A0e = A0c.A0e();
        if (A0e != null) {
            int length = A0e.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                int i2 = length;
                if (!z) {
                    i2 = i;
                }
                boolean A1Q = C90484aE.A1Q(AnonymousClass00C.A00(A0e.charAt(i2), 32));
                if (z) {
                    if (!A1Q) {
                        break;
                    }
                    length--;
                } else if (!A1Q) {
                    z = true;
                } else {
                    i++;
                }
            }
            str2 = A0e.subSequence(i, length + 1).toString();
        }
        if (str2 == null) {
            equalsIgnoreCase = false;
        } else {
            equalsIgnoreCase = str2.equalsIgnoreCase("true");
        }
        return Boolean.valueOf(equalsIgnoreCase);
    }

    public static final String A03(C203399nx r0, String str) {
        C203399nx A0c = r0.A0c(str);
        if (A0c != null) {
            return A0c.A0e();
        }
        return null;
    }
}
