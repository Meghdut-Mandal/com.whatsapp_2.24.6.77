package X;

import android.net.Uri;
import org.json.JSONObject;

/* renamed from: X.3Oz  reason: invalid class name and case insensitive filesystem */
public final class C64673Oz {
    public final AnonymousClass3D8 A00;
    public final C25871Hz A01;
    public final C20810yC A02;
    public final C20020wt A03;
    public final AnonymousClass3NH A04;
    public final C21010yW A05;

    private final void A02(boolean z, String str) {
        AnonymousClass2OJ r1 = new AnonymousClass2OJ();
        r1.A00 = Integer.valueOf(AnonymousClass000.A1P(z ? 1 : 0) ? 1 : 0);
        if (!this.A00.A00()) {
            r1.A01 = str;
        }
        this.A05.Bly(r1);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01f3 A[Catch:{ IllegalArgumentException | JSONException -> 0x0262 }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01f7 A[Catch:{ IllegalArgumentException | JSONException -> 0x0262 }] */
    public final X.AnonymousClass3PE A03(android.net.Uri r35, int r36) {
        /*
            r34 = this;
            java.lang.String r0 = "token"
            r3 = r35
            java.lang.String r1 = r3.getQueryParameter(r0)
            r2 = r34
            if (r1 == 0) goto L_0x0047
            java.lang.String r0 = "token_bypass_override"
            r3.getQueryParameter(r0)
            X.0wt r0 = r2.A03
            monitor-enter(r0)
            monitor-exit(r0)
            r6 = 0
            r5 = 0
            X.6SL r4 = new X.6SL     // Catch:{ 5UY -> 0x003e }
            r4.<init>(r1)     // Catch:{ 5UY -> 0x003e }
            java.util.Map r0 = X.AnonymousClass3NH.A01     // Catch:{ 5UY -> 0x003e }
            X.5ar r1 = X.AnonymousClass6H2.A00(r4, r0)     // Catch:{ 5UY -> 0x003e }
            boolean r0 = r1 instanceof X.AnonymousClass54O     // Catch:{ 5UY -> 0x003e }
            if (r0 == 0) goto L_0x002d
            r0 = 1
            r2.A02(r0, r5)     // Catch:{ 5UY -> 0x003e }
            org.json.JSONObject r5 = r4.A03     // Catch:{ 5UY -> 0x003e }
            goto L_0x0048
        L_0x002d:
            boolean r0 = r1 instanceof X.AnonymousClass54N     // Catch:{ 5UY -> 0x003e }
            if (r0 == 0) goto L_0x0039
            X.54N r1 = (X.AnonymousClass54N) r1     // Catch:{ 5UY -> 0x003e }
            java.lang.String r0 = r1.A00     // Catch:{ 5UY -> 0x003e }
            r2.A02(r6, r0)     // Catch:{ 5UY -> 0x003e }
            goto L_0x0048
        L_0x0039:
            X.0jS r0 = X.C36441kJ.A18()     // Catch:{ 5UY -> 0x003e }
            throw r0     // Catch:{ 5UY -> 0x003e }
        L_0x003e:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            r2.A02(r6, r0)
            goto L_0x0048
        L_0x0047:
            r5 = 0
        L_0x0048:
            X.3D8 r0 = r2.A00
            boolean r0 = r0.A00()
            java.lang.String r4 = "lid"
            r9 = 0
            if (r0 == 0) goto L_0x0082
            if (r5 == 0) goto L_0x005f
            X.13q r1 = X.AnonymousClass11F.A00
            java.lang.String r0 = X.AnonymousClass6HO.A01(r4, r9, r5)
            X.11F r9 = r1.A02(r0)
        L_0x005f:
            java.lang.String r6 = "data_filter_required"
            java.lang.String r0 = r3.getQueryParameter(r6)
            if (r0 == 0) goto L_0x006e
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x006f
        L_0x006e:
            r0 = 1
        L_0x006f:
            r33 = r0 ^ 1
            r10 = r36
            if (r5 == 0) goto L_0x00bd
            java.lang.String r0 = "client_filters"
            boolean r0 = r5.has(r0)
            if (r0 == 0) goto L_0x00bd
            java.lang.String r8 = "Error during parsing of payload object "
            r7 = 0
            r1 = 0
            goto L_0x0091
        L_0x0082:
            if (r5 == 0) goto L_0x005f
            X.13r r1 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = "jid"
            java.lang.String r0 = X.AnonymousClass6HO.A01(r0, r9, r5)
            com.whatsapp.jid.UserJid r9 = r1.A02(r0)
            goto L_0x005f
        L_0x0091:
            java.lang.String r0 = "payload"
            java.lang.String r6 = r5.getString(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x00aa }
            if (r6 == 0) goto L_0x00a3
            int r0 = r6.length()     // Catch:{ IllegalArgumentException | JSONException -> 0x00aa }
            if (r0 == 0) goto L_0x00a3
            if (r0 > r10) goto L_0x00a3
            r1 = r6
            goto L_0x00d1
        L_0x00a3:
            X.1Hz r6 = r2.A01     // Catch:{ IllegalArgumentException | JSONException -> 0x00aa }
            r0 = 7
            r6.A01(r9, r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x00aa }
            goto L_0x00d1
        L_0x00aa:
            r6 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()
            java.lang.String r0 = X.C36331k8.A0i(r8, r0, r6)
            r2.A02(r7, r0)
            X.1Hz r6 = r2.A01
            r0 = 6
            r6.A01(r9, r0)
            goto L_0x00d1
        L_0x00bd:
            if (r33 != 0) goto L_0x00c1
            java.lang.String r6 = "data"
        L_0x00c1:
            java.lang.String r1 = r3.getQueryParameter(r6)
            if (r1 == 0) goto L_0x00ee
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00ee
            if (r0 > r10) goto L_0x00ee
        L_0x00cf:
            if (r5 == 0) goto L_0x027e
        L_0x00d1:
            java.lang.String r32 = "Error during parsing of payload object "
            java.lang.String r12 = "jid"
            java.lang.String r31 = "always_show_ad_attribution"
            java.lang.String r30 = "cd"
            java.lang.String r29 = "category_id"
            java.lang.String r28 = "land_on_whatsapp_catalog"
            java.lang.String r27 = "product_id"
            java.lang.String r18 = "entry_point"
            java.lang.String r6 = "source_url"
            java.lang.String r7 = "show_keyboard"
            java.lang.String r11 = "show_ad_attribution"
            java.lang.String r13 = "have_wm"
            java.lang.String r14 = "have_ib"
            java.lang.String r10 = "1"
            goto L_0x00f6
        L_0x00ee:
            X.1Hz r1 = r2.A01
            r0 = 7
            r1.A01(r9, r0)
            r1 = 0
            goto L_0x00cf
        L_0x00f6:
            X.13r r8 = com.whatsapp.jid.UserJid.Companion     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            java.lang.String r0 = r3.getQueryParameter(r12)     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            java.lang.String r0 = X.AnonymousClass6HO.A01(r12, r0, r5)     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            com.whatsapp.jid.UserJid r26 = r8.A02(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            X.13q r8 = X.AnonymousClass11F.A00     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            java.lang.String r0 = r3.getQueryParameter(r4)     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            java.lang.String r0 = X.AnonymousClass6HO.A01(r4, r0, r5)     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            X.11F r25 = r8.A02(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            java.lang.String r12 = "source"
            r8 = 0
            java.lang.String r15 = X.AnonymousClass6HO.A01(r12, r8, r5)     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            if (r15 == 0) goto L_0x0121
            int r0 = r15.length()     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            if (r0 != 0) goto L_0x0127
        L_0x0121:
            java.lang.String r15 = r3.getQueryParameter(r12)     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            if (r15 == 0) goto L_0x0132
        L_0x0127:
            int r12 = r15.length()     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            if (r12 == 0) goto L_0x0132
            r0 = 32
            if (r12 > r0) goto L_0x0132
            goto L_0x0133
        L_0x0132:
            r15 = 0
        L_0x0133:
            java.lang.String r0 = "context"
            java.lang.String r17 = X.AnonymousClass6HO.A01(r0, r8, r5)     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            if (r17 == 0) goto L_0x0143
            int r12 = r17.length()     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            r16 = 0
            if (r12 != 0) goto L_0x0145
        L_0x0143:
            r16 = 1
        L_0x0145:
            r12 = 0
            if (r16 != 0) goto L_0x014a
            if (r17 != 0) goto L_0x0150
        L_0x014a:
            java.lang.String r17 = r3.getQueryParameter(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            if (r17 == 0) goto L_0x0158
        L_0x0150:
            int r0 = r17.length()     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            if (r0 == 0) goto L_0x0158
            r12 = r17
        L_0x0158:
            java.lang.String r24 = A01(r3, r14, r5)     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            java.lang.String r23 = A01(r3, r13, r5)     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            java.lang.String r22 = A01(r3, r11, r5)     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            java.lang.String r21 = A01(r3, r7, r5)     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            java.lang.String r20 = A00(r3, r6, r5)     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            r0 = r18
            java.lang.String r19 = A00(r3, r0, r5)     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            java.lang.String r6 = "icebreaker"
            java.lang.String r13 = X.AnonymousClass6HO.A01(r6, r8, r5)     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            if (r13 == 0) goto L_0x0180
            int r0 = r13.length()     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            if (r0 != 0) goto L_0x0186
        L_0x0180:
            java.lang.String r13 = r3.getQueryParameter(r6)     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            if (r13 == 0) goto L_0x018f
        L_0x0186:
            int r6 = r13.length()     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            r0 = 140(0x8c, float:1.96E-43)
            if (r6 < r0) goto L_0x018f
            r13 = 0
        L_0x018f:
            r0 = r27
            java.lang.String r18 = A00(r3, r0, r5)     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            r0 = r28
            java.lang.String r17 = A00(r3, r0, r5)     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            r0 = r29
            java.lang.String r16 = A00(r3, r0, r5)     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            java.lang.String r0 = "banner"
            org.json.JSONObject r11 = r5.optJSONObject(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            X.0yC r6 = r2.A02     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            r0 = 6095(0x17cf, float:8.541E-42)
            boolean r0 = r6.A0E(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            if (r0 == 0) goto L_0x01b8
            r0 = r30
            java.lang.String r7 = A00(r3, r0, r5)     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            goto L_0x01b9
        L_0x01b8:
            r7 = 0
        L_0x01b9:
            java.lang.String r0 = "client_filters"
            org.json.JSONArray r0 = r5.optJSONArray(r0)     // Catch:{ IllegalArgumentException -> 0x01c7 }
            if (r0 == 0) goto L_0x01c5
            java.util.List r8 = X.C54092sO.A00(r0)     // Catch:{ IllegalArgumentException -> 0x01c7 }
        L_0x01c5:
            r6 = 0
            goto L_0x01e0
        L_0x01c7:
            r8 = move-exception
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            java.lang.String r0 = "Data payload dropped due to client filter parsing error: "
            r6.append(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            r6.append(r8)     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            java.lang.String r0 = ".message"
            java.lang.String r6 = X.AnonymousClass000.A0q(r0, r6)     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            r0 = 0
            r2.A02(r0, r6)     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            r8 = 0
            r6 = 1
        L_0x01e0:
            if (r33 != 0) goto L_0x01ef
            if (r8 == 0) goto L_0x01ed
            X.2ox r0 = X.C52142ox.GREEN_TOS     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            boolean r0 = r8.contains(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            if (r0 == 0) goto L_0x01ed
            goto L_0x01ef
        L_0x01ed:
            r14 = 0
            goto L_0x01f0
        L_0x01ef:
            r14 = 1
        L_0x01f0:
            r0 = r1
            if (r6 == 0) goto L_0x01f5
            r0 = 0
            r15 = 0
        L_0x01f5:
            if (r12 != 0) goto L_0x01f8
            r12 = r1
        L_0x01f8:
            X.0wt r6 = r2.A03     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            monitor-enter(r6)     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            monitor-exit(r6)     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            r6 = r31
            java.lang.String r6 = A01(r3, r6, r5)     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            X.3PD r5 = new X.3PD     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            r5.<init>()     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            r5.A04 = r0     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            r5.A09 = r15     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            r0 = r24
            boolean r0 = r10.equalsIgnoreCase(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            r5.A0G = r0     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            r0 = r23
            boolean r0 = r10.equalsIgnoreCase(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            r5.A0H = r0     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            r5.A0D = r14     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            r0 = r22
            boolean r0 = r10.equalsIgnoreCase(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            r5.A0I = r0     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            r0 = r21
            boolean r0 = r10.equalsIgnoreCase(r0)     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            r5.A0J = r0     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            r0 = r20
            r5.A0A = r0     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            r0 = r19
            r5.A05 = r0     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            r5.A03 = r12     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            r5.A06 = r13     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            r0 = r25
            r5.A00 = r0     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            r0 = r26
            r5.A01 = r0     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            r0 = r18
            r5.A08 = r0     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            r0 = r17
            r5.A07 = r0     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            r0 = r16
            r5.A02 = r0     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            r5.A0C = r11     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            r5.A0B = r8     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            boolean r0 = r10.equalsIgnoreCase(r7)     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            r5.A0F = r0     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            boolean r0 = r10.equalsIgnoreCase(r6)     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            r5.A0E = r0     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            X.3PE r0 = r5.A01()     // Catch:{ IllegalArgumentException | JSONException -> 0x0262 }
            return r0
        L_0x0262:
            r6 = move-exception
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()
            r0 = r32
            java.lang.String r5 = X.C36331k8.A0i(r0, r5, r6)
            r0 = 0
            r2.A02(r0, r5)
            X.1Hz r5 = r2.A01
            r0 = 6
            r5.A01(r9, r0)
            java.lang.String r0 = r6.getMessage()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x027e:
            r13 = 0
            java.lang.String r0 = "source"
            java.lang.String r0 = r3.getQueryParameter(r0)
            if (r0 == 0) goto L_0x0370
            int r6 = r0.length()
            if (r6 == 0) goto L_0x0370
            r5 = 32
            if (r6 > r5) goto L_0x0370
        L_0x0291:
            r12 = 0
            java.lang.String r5 = "context"
            java.lang.String r6 = r3.getQueryParameter(r5)
            if (r6 == 0) goto L_0x02a1
            int r5 = r6.length()
            if (r5 == 0) goto L_0x02a1
            r12 = r6
        L_0x02a1:
            java.lang.String r5 = "have_ib"
            java.lang.String r19 = r3.getQueryParameter(r5)
            java.lang.String r5 = "have_wm"
            java.lang.String r18 = r3.getQueryParameter(r5)
            java.lang.String r5 = "show_ad_attribution"
            java.lang.String r17 = r3.getQueryParameter(r5)
            java.lang.String r5 = "show_keyboard"
            java.lang.String r16 = r3.getQueryParameter(r5)
            java.lang.String r5 = "product_id"
            java.lang.String r11 = r3.getQueryParameter(r5)
            X.13r r6 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r5 = "jid"
            java.lang.String r5 = r3.getQueryParameter(r5)
            com.whatsapp.jid.UserJid r10 = r6.A02(r5)
            java.lang.String r4 = r3.getQueryParameter(r4)
            com.whatsapp.jid.UserJid r9 = r6.A02(r4)
            java.lang.String r4 = "source_url"
            java.lang.String r8 = r3.getQueryParameter(r4)
            java.lang.String r4 = "icebreaker"
            java.lang.String r7 = r3.getQueryParameter(r4)
            if (r7 == 0) goto L_0x02ea
            int r5 = r7.length()
            r4 = 140(0x8c, float:1.96E-43)
            if (r5 < r4) goto L_0x02ea
            r7 = 0
        L_0x02ea:
            java.lang.String r4 = "land_on_whatsapp_catalog"
            java.lang.String r6 = r3.getQueryParameter(r4)
            java.lang.String r4 = "category_id"
            java.lang.String r5 = r3.getQueryParameter(r4)
            java.lang.String r4 = "entry_point"
            java.lang.String r4 = r3.getQueryParameter(r4)
            X.0yC r15 = r2.A02
            r14 = 6095(0x17cf, float:8.541E-42)
            boolean r14 = r15.A0E(r14)
            if (r14 == 0) goto L_0x030c
            java.lang.String r13 = "cd"
            java.lang.String r13 = r3.getQueryParameter(r13)
        L_0x030c:
            if (r12 != 0) goto L_0x030f
            r12 = r1
        L_0x030f:
            X.0wt r2 = r2.A03
            monitor-enter(r2)
            monitor-exit(r2)
            java.lang.String r2 = "always_show_ad_attribution"
            java.lang.String r3 = r3.getQueryParameter(r2)
            X.3PD r2 = new X.3PD
            r2.<init>()
            r2.A04 = r1
            r2.A09 = r0
            java.lang.String r1 = "1"
            r0 = r19
            boolean r0 = r1.equalsIgnoreCase(r0)
            r2.A0G = r0
            r0 = r18
            boolean r0 = r1.equalsIgnoreCase(r0)
            r2.A0H = r0
            r0 = r33
            r2.A0D = r0
            r0 = r17
            boolean r0 = r1.equalsIgnoreCase(r0)
            r2.A0I = r0
            r0 = r16
            boolean r0 = r1.equalsIgnoreCase(r0)
            r2.A0J = r0
            r2.A0A = r8
            r2.A05 = r4
            r2.A03 = r12
            r2.A06 = r7
            r2.A00 = r9
            r2.A01 = r10
            r2.A08 = r11
            r2.A07 = r6
            r2.A02 = r5
            r0 = 0
            r2.A0C = r0
            r2.A0B = r0
            boolean r0 = r1.equalsIgnoreCase(r13)
            r2.A0F = r0
            boolean r0 = r1.equalsIgnoreCase(r3)
            r2.A0E = r0
            X.3PE r0 = r2.A01()
            return r0
        L_0x0370:
            r0 = 0
            goto L_0x0291
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64673Oz.A03(android.net.Uri, int):X.3PE");
    }

    public C64673Oz(AnonymousClass3D8 r1, C25871Hz r2, AnonymousClass3NH r3, C20810yC r4, C21010yW r5, C20020wt r6) {
        C36321k7.A0z(r5, r2);
        C36341k9.A1F(r4, r6);
        this.A00 = r1;
        this.A05 = r5;
        this.A01 = r2;
        this.A04 = r3;
        this.A02 = r4;
        this.A03 = r6;
    }

    public static String A00(Uri uri, String str, JSONObject jSONObject) {
        if (!jSONObject.has(str)) {
            return uri.getQueryParameter(str);
        }
        return jSONObject.getString(str);
    }

    public static String A01(Uri uri, String str, JSONObject jSONObject) {
        if (!jSONObject.has(str)) {
            return uri.getQueryParameter(str);
        }
        return String.valueOf(jSONObject.getInt(str));
    }
}
