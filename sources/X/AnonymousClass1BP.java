package X;

import android.database.Cursor;
import java.util.LinkedList;

/* renamed from: X.1BP  reason: invalid class name */
public class AnonymousClass1BP {
    public final AnonymousClass005 A00;

    public AnonymousClass1BP(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0050, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0051, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0054, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            r7 = 0
            X.AnonymousClass00C.A0D(r9, r7)
            r6 = 1
            X.AnonymousClass00C.A0D(r10, r6)
            X.005 r0 = r8.A00
            java.lang.Object r0 = r0.get()
            X.16q r0 = (X.C229616q) r0
            X.1M0 r3 = r0.get()
            X.14e r5 = r3.A02     // Catch:{ all -> 0x004e }
            java.lang.String r4 = "SELECT COUNT(*) AS count FROM third_party_whitelist_packs WHERE authority= ? AND sticker_pack_id= ?"
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x004e }
            r1 = 0
            r2[r7] = r9     // Catch:{ all -> 0x004e }
            r2[r6] = r10     // Catch:{ all -> 0x004e }
            java.lang.String r0 = "checkExistence/QUERY_THIRD_PARTY_WHITELIST_PACKS"
            android.database.Cursor r2 = r5.A09(r4, r0, r2)     // Catch:{ all -> 0x004e }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0040
            java.lang.String r0 = "count"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0047 }
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x0047 }
            if (r0 <= 0) goto L_0x0039
            r1 = 1
        L_0x0039:
            r2.close()     // Catch:{ all -> 0x004e }
            r3.close()
            return r1
        L_0x0040:
            r2.close()     // Catch:{ all -> 0x004e }
            r3.close()
            return r7
        L_0x0047:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x004e }
            throw r0     // Catch:{ all -> 0x004e }
        L_0x004e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1BP.A03(java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0061, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0065, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0068, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A01() {
        /*
            r11 = this;
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            X.005 r0 = r11.A00
            java.lang.Object r0 = r0.get()
            X.16q r0 = (X.C229616q) r0
            X.1M0 r2 = r0.get()
            X.14e r5 = r2.A02     // Catch:{ all -> 0x0062 }
            java.lang.String r4 = "SELECT authority, sticker_pack_id, sticker_pack_name, sticker_pack_publisher, sticker_pack_image_data_hash, avoid_cache, is_animated_pack FROM third_party_whitelist_packs"
            java.lang.String r3 = "getCachedPacks/QUERY_THIRD_PARTY_WHITELIST_PACKS"
            r0 = 0
            android.database.Cursor r3 = r5.A09(r4, r3, r0)     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = "authority"
            int r4 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x005b }
            java.lang.String r0 = "sticker_pack_id"
            int r5 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x005b }
            java.lang.String r0 = "sticker_pack_name"
            int r6 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x005b }
            java.lang.String r0 = "sticker_pack_publisher"
            int r7 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x005b }
            java.lang.String r0 = "sticker_pack_image_data_hash"
            int r8 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x005b }
            java.lang.String r0 = "avoid_cache"
            int r9 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x005b }
            java.lang.String r0 = "is_animated_pack"
            int r10 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x005b }
        L_0x0046:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x005b }
            if (r0 == 0) goto L_0x0054
            X.68B r0 = A00(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x005b }
            r1.add(r0)     // Catch:{ all -> 0x005b }
            goto L_0x0046
        L_0x0054:
            r3.close()     // Catch:{ all -> 0x0062 }
            r2.close()
            return r1
        L_0x005b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005d }
        L_0x005d:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ all -> 0x0062 }
            throw r0     // Catch:{ all -> 0x0062 }
        L_0x0062:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1BP.A01():java.util.ArrayList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0058, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0054, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0055, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.AnonymousClass68B r8, java.lang.String r9, java.lang.String r10) {
        /*
            r7 = this;
            java.lang.String r1 = "authority"
            X.005 r0 = r7.A00
            java.lang.Object r0 = r0.get()
            X.16q r0 = (X.C229616q) r0
            X.1M0 r4 = r0.A04()
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x0052 }
            r6.<init>()     // Catch:{ all -> 0x0052 }
            r6.put(r1, r9)     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = "sticker_pack_id"
            r6.put(r0, r10)     // Catch:{ all -> 0x0052 }
            java.lang.String r1 = "sticker_pack_name"
            java.lang.String r0 = r8.A0H     // Catch:{ all -> 0x0052 }
            r6.put(r1, r0)     // Catch:{ all -> 0x0052 }
            java.lang.String r1 = "sticker_pack_publisher"
            java.lang.String r0 = r8.A0J     // Catch:{ all -> 0x0052 }
            r6.put(r1, r0)     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = "sticker_pack_image_data_hash"
            java.lang.String r5 = r8.A0G     // Catch:{ all -> 0x0052 }
            r6.put(r0, r5)     // Catch:{ all -> 0x0052 }
            java.lang.String r1 = "avoid_cache"
            boolean r0 = r8.A0O     // Catch:{ all -> 0x0052 }
            X.C54272sg.A00(r6, r1, r0)     // Catch:{ all -> 0x0052 }
            java.lang.String r1 = "is_animated_pack"
            boolean r0 = r8.A0P     // Catch:{ all -> 0x0052 }
            X.C54272sg.A00(r6, r1, r0)     // Catch:{ all -> 0x0052 }
            X.14e r3 = r4.A02     // Catch:{ all -> 0x0052 }
            java.lang.String r2 = "third_party_whitelist_packs"
            r1 = 5
            java.lang.String r0 = "whitelistPack/INSERT_THIRD_PARTY_WHITELIST_PACKS"
            r3.A08(r2, r0, r6, r1)     // Catch:{ all -> 0x0052 }
            long r0 = r8.A02     // Catch:{ all -> 0x0052 }
            r8.A01 = r0     // Catch:{ all -> 0x0052 }
            r8.A03 = r5     // Catch:{ all -> 0x0052 }
            r4.close()
            return
        L_0x0052:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1BP.A02(X.68B, java.lang.String, java.lang.String):void");
    }

    public static final AnonymousClass68B A00(Cursor cursor, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        String string = cursor.getString(i3);
        String str = "";
        if (string == null) {
            string = str;
        }
        String string2 = cursor.getString(i4);
        if (string2 != null) {
            str = string2;
        }
        AnonymousClass65S r1 = new AnonymousClass65S();
        r1.A0E = AnonymousClass1BM.A01(cursor.getString(i), cursor.getString(i2));
        r1.A0G = string;
        r1.A0I = str;
        r1.A0N = new LinkedList();
        r1.A0M = new LinkedList();
        r1.A0V = true;
        if (i5 > 0) {
            r1.A06 = cursor.getString(i5);
        }
        if (i6 > 0) {
            r1.A0P = C54282sh.A00(cursor, i6);
        }
        if (i7 > 0) {
            boolean A002 = C54282sh.A00(cursor, i7);
            r1.A0Q = A002;
            r1.A0O = A002;
        }
        return new AnonymousClass68B(r1);
    }
}
