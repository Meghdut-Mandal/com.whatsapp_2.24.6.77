package X;

import android.net.TrafficStats;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* renamed from: X.6v7  reason: invalid class name and case insensitive filesystem */
public class C146146v7 implements C160097kS {
    public final C20050ww A00;
    public final AnonymousClass17Z A01;
    public final AnonymousClass1XJ A02;
    public final AnonymousClass1XP A03;
    public final AnonymousClass13E A04;
    public final C21080yd A05;

    /* JADX WARNING: Removed duplicated region for block: B:89:0x014b A[ADDED_TO_REGION, Catch:{ all -> 0x016a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BJe(java.io.InputStream r15, java.lang.Integer r16, long r17) {
        /*
            r14 = this;
            r4 = 0
            android.util.JsonReader r13 = X.C90474aD.A0K(r15)     // Catch:{ IOException -> 0x0174 }
            r13.beginObject()     // Catch:{ all -> 0x016a }
        L_0x0008:
            r12 = 1
        L_0x0009:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x016a }
            if (r0 == 0) goto L_0x0163
            java.lang.String r2 = r13.nextName()     // Catch:{ all -> 0x016a }
            int r1 = r2.hashCode()     // Catch:{ all -> 0x016a }
            r0 = -265173948(0xfffffffff031c444, float:-2.2006447E29)
            if (r1 == r0) goto L_0x00da
            r0 = 1518327835(0x5a7fd81b, float:1.80034324E16)
            if (r1 != r0) goto L_0x0152
            java.lang.String r0 = "languages"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x016a }
            if (r0 == 0) goto L_0x0152
            X.1XJ r3 = r14.A02     // Catch:{ all -> 0x016a }
            monitor-enter(r3)     // Catch:{ all -> 0x016a }
            X.1XU r0 = r3.A02     // Catch:{ IOException | IllegalStateException -> 0x00cd }
            X.1M0 r6 = r0.A04()     // Catch:{ IOException | IllegalStateException -> 0x00cd }
            X.71s r11 = r6.B1k()     // Catch:{ all -> 0x00c3 }
            X.14e r10 = r6.A02     // Catch:{ all -> 0x00b9 }
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x00b9 }
            X.C36431kI.A1O(r2, r0, r4)     // Catch:{ all -> 0x00b9 }
            java.lang.String r9 = "emoji_search_tag"
            java.lang.String r1 = "type=?"
            java.lang.String r0 = "EmojiDictionaryStore/clearAll/DELETE_EMOJI_SEARCH_TAG"
            r10.A03(r9, r1, r0, r2)     // Catch:{ all -> 0x00b9 }
            r13.beginObject()     // Catch:{ all -> 0x00b9 }
        L_0x004a:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x00b9 }
            if (r0 == 0) goto L_0x00ab
            r13.nextName()     // Catch:{ all -> 0x00b9 }
            r13.beginObject()     // Catch:{ all -> 0x00b9 }
        L_0x0056:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x00b9 }
            if (r0 == 0) goto L_0x00a7
            java.lang.String r8 = r13.nextName()     // Catch:{ all -> 0x00b9 }
            java.util.HashSet r1 = X.C36441kJ.A16()     // Catch:{ all -> 0x00b9 }
            r13.beginArray()     // Catch:{ all -> 0x00b9 }
        L_0x0067:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x00b9 }
            if (r0 == 0) goto L_0x0079
            java.lang.String r0 = r13.nextString()     // Catch:{ all -> 0x00b9 }
            java.lang.String r0 = X.AnonymousClass14B.A06(r0)     // Catch:{ all -> 0x00b9 }
            r1.add(r0)     // Catch:{ all -> 0x00b9 }
            goto L_0x0067
        L_0x0079:
            r13.endArray()     // Catch:{ all -> 0x00b9 }
            java.util.Iterator r7 = r1.iterator()     // Catch:{ all -> 0x00b9 }
        L_0x0080:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x00b9 }
            if (r0 == 0) goto L_0x0056
            java.lang.String r5 = X.AnonymousClass001.A0C(r7)     // Catch:{ all -> 0x00b9 }
            android.content.ContentValues r2 = X.C36441kJ.A0E()     // Catch:{ all -> 0x00b9 }
            java.lang.Integer r1 = X.C36361kB.A0i()     // Catch:{ all -> 0x00b9 }
            java.lang.String r0 = "type"
            r2.put(r0, r1)     // Catch:{ all -> 0x00b9 }
            java.lang.String r0 = "symbol"
            r2.put(r0, r8)     // Catch:{ all -> 0x00b9 }
            java.lang.String r0 = "tag"
            r2.put(r0, r5)     // Catch:{ all -> 0x00b9 }
            java.lang.String r0 = "insertEmojiTags/REPLACE_EMOJI_SEARCH_TAG"
            r10.A06(r9, r0, r2)     // Catch:{ all -> 0x00b9 }
            goto L_0x0080
        L_0x00a7:
            r13.endObject()     // Catch:{ all -> 0x00b9 }
            goto L_0x004a
        L_0x00ab:
            r13.endObject()     // Catch:{ all -> 0x00b9 }
            r11.A00()     // Catch:{ all -> 0x00b9 }
            r0 = 1
            r11.close()     // Catch:{ all -> 0x00c3 }
            r6.close()     // Catch:{ IOException | IllegalStateException -> 0x00cd }
            goto L_0x00d8
        L_0x00b9:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x00be }
            goto L_0x00c2
        L_0x00be:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00c3 }
        L_0x00c2:
            throw r1     // Catch:{ all -> 0x00c3 }
        L_0x00c3:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x00c8 }
            goto L_0x00cc
        L_0x00c8:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException | IllegalStateException -> 0x00cd }
        L_0x00cc:
            throw r1     // Catch:{ IOException | IllegalStateException -> 0x00cd }
        L_0x00cd:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x015d }
            java.lang.String r0 = "emojidictionarystore/populatedb/failed "
            X.C36321k7.A1J(r2, r0, r1)     // Catch:{ all -> 0x015d }
            r0 = 0
        L_0x00d8:
            monitor-exit(r3)     // Catch:{ all -> 0x016a }
            goto L_0x0149
        L_0x00da:
            java.lang.String r0 = "fb-top-50"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x016a }
            if (r0 == 0) goto L_0x0152
            X.1XP r5 = r14.A03     // Catch:{ all -> 0x016a }
            monitor-enter(r5)     // Catch:{ all -> 0x016a }
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()     // Catch:{ IOException -> 0x0141, IllegalStateException -> 0x0132 }
            r13.beginArray()     // Catch:{ IOException -> 0x0141, IllegalStateException -> 0x0132 }
        L_0x00ec:
            boolean r0 = r13.hasNext()     // Catch:{ IOException -> 0x0141, IllegalStateException -> 0x0132 }
            if (r0 == 0) goto L_0x00fa
            java.lang.String r0 = r13.nextString()     // Catch:{ IOException -> 0x0141, IllegalStateException -> 0x0132 }
            r1.add(r0)     // Catch:{ IOException -> 0x0141, IllegalStateException -> 0x0132 }
            goto L_0x00ec
        L_0x00fa:
            r13.endArray()     // Catch:{ IOException -> 0x0141, IllegalStateException -> 0x0132 }
            org.json.JSONArray r2 = X.C90524aI.A0u()     // Catch:{ IOException -> 0x0141, IllegalStateException -> 0x0132 }
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()     // Catch:{ IOException -> 0x0141, IllegalStateException -> 0x0132 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ IOException -> 0x0141, IllegalStateException -> 0x0132 }
        L_0x0109:
            boolean r0 = r1.hasNext()     // Catch:{ IOException -> 0x0141, IllegalStateException -> 0x0132 }
            if (r0 == 0) goto L_0x011e
            java.lang.String r0 = X.AnonymousClass001.A0C(r1)     // Catch:{ IOException -> 0x0141, IllegalStateException -> 0x0132 }
            r2.put(r0)     // Catch:{ IOException -> 0x0141, IllegalStateException -> 0x0132 }
            X.1XQ r0 = X.C63873Lt.A00(r0)     // Catch:{ IOException -> 0x0141, IllegalStateException -> 0x0132 }
            r3.add(r0)     // Catch:{ IOException -> 0x0141, IllegalStateException -> 0x0132 }
            goto L_0x0109
        L_0x011e:
            X.0v0 r0 = r5.A02     // Catch:{ IOException -> 0x0141, IllegalStateException -> 0x0132 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x0141, IllegalStateException -> 0x0132 }
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)     // Catch:{ IOException -> 0x0141, IllegalStateException -> 0x0132 }
            java.lang.String r0 = "top_emojis"
            X.C36341k9.A0x(r1, r0, r2)     // Catch:{ IOException -> 0x0141, IllegalStateException -> 0x0132 }
            r5.A00 = r3     // Catch:{ IOException -> 0x0141, IllegalStateException -> 0x0132 }
            monitor-exit(r5)     // Catch:{ all -> 0x016a }
            r0 = 1
            goto L_0x0149
        L_0x0132:
            r3 = move-exception
            X.0wN r2 = r5.A01     // Catch:{ all -> 0x0160 }
            java.lang.String r1 = "topemojis/populate error"
            r0 = 0
            r2.A0E(r1, r0, r4)     // Catch:{ all -> 0x0160 }
            java.lang.String r0 = "topemojisstore/populate-top-emojis/failed"
            com.whatsapp.util.Log.e(r0, r3)     // Catch:{ all -> 0x0160 }
            goto L_0x0147
        L_0x0141:
            r1 = move-exception
            java.lang.String r0 = "topemojisstore/populate-top-emojis/failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0160 }
        L_0x0147:
            monitor-exit(r5)     // Catch:{ all -> 0x016a }
            r0 = 0
        L_0x0149:
            if (r12 == 0) goto L_0x014f
            if (r0 == 0) goto L_0x014f
            goto L_0x0008
        L_0x014f:
            r12 = 0
            goto L_0x0009
        L_0x0152:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x016a }
            java.lang.String r0 = "emojidictionarynetworkclient/handle-network-response/unhandled field: "
            X.C36321k7.A1P(r0, r2, r1)     // Catch:{ all -> 0x016a }
            goto L_0x0009
        L_0x015d:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x016a }
            goto L_0x0162
        L_0x0160:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x016a }
        L_0x0162:
            throw r0     // Catch:{ all -> 0x016a }
        L_0x0163:
            r13.endObject()     // Catch:{ all -> 0x016a }
            r13.close()     // Catch:{ IOException -> 0x0174 }
            return r12
        L_0x016a:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x016f }
            goto L_0x0173
        L_0x016f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0174 }
        L_0x0173:
            throw r1     // Catch:{ IOException -> 0x0174 }
        L_0x0174:
            r1 = move-exception
            java.lang.String r0 = "emojidictionarynetworkclient/handle-network-response/failed"
            com.whatsapp.util.Log.e(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146146v7.BJe(java.io.InputStream, java.lang.Integer, long):boolean");
    }

    public InputStream BCm(C162167o8 r4, Integer num) {
        AnonymousClass5RE B8D = r4.B8D(this.A00, C36381kD.A0m(), C36431kI.A12());
        if ("gzip".equals(((C146096v1) r4).A01.getHeaderField("Content-Encoding"))) {
            return new GZIPInputStream(B8D);
        }
        return B8D;
    }

    public C146146v7(C20050ww r1, AnonymousClass17Z r2, AnonymousClass1XJ r3, AnonymousClass1XP r4, AnonymousClass13E r5, C21080yd r6) {
        this.A00 = r1;
        this.A03 = r4;
        this.A05 = r6;
        this.A04 = r5;
        this.A02 = r3;
        this.A01 = r2;
    }

    public C146096v1 B3S(String str, String str2) {
        C36321k7.A1Q("emojidictionarynetworkclient/connect/language=", str2, AnonymousClass000.A0u());
        AnonymousClass17Z r0 = AnonymousClass17Z.$redex_init_class;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("https://static.whatsapp.net/emoji?lgs=");
        A0u.append(str2);
        String A0q = AnonymousClass000.A0q("&top=1", A0u);
        try {
            TrafficStats.setThreadStatsTag(8);
            return this.A04.A02(this.A05, A0q, str);
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }
}
