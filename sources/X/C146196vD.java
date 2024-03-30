package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6vD  reason: invalid class name and case insensitive filesystem */
public final class C146196vD implements AnonymousClass1XK {
    public final C24231Bq A00;
    public volatile List A01;

    public C146196vD(C24211Bo r2, boolean z) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2.A00(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00e6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ea, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ed, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ee, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f1, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Blb(java.util.List r12) {
        /*
            r11 = this;
            r6 = 0
            X.AnonymousClass00C.A0D(r12, r6)
            X.C18740tg.A00()
            java.util.List r0 = X.C007103b.A0Y(r12)
            r11.A01 = r0
            java.util.List r8 = r11.A01
            if (r8 == 0) goto L_0x00f5
            X.1Bq r4 = r11.A00
            java.lang.String r7 = "recent_stickers"
            X.005 r0 = r4.A01
            X.1M0 r3 = X.C90494aF.A0K(r0)
            X.71s r5 = r3.B1k()     // Catch:{ all -> 0x00eb }
            java.lang.String r2 = "is_avocado = ?"
            java.lang.String[] r1 = X.C36441kJ.A1R()     // Catch:{ all -> 0x00e4 }
            boolean r0 = r4.A02     // Catch:{ all -> 0x00e4 }
            if (r0 == 0) goto L_0x00d9
            java.lang.String r0 = "1"
        L_0x002b:
            r1[r6] = r0     // Catch:{ all -> 0x00e4 }
            X.14e r6 = r3.A02     // Catch:{ all -> 0x00e4 }
            java.lang.String r0 = "CLEAR_RECENT_STICKER_TABLE"
            r6.A03(r7, r2, r0, r1)     // Catch:{ all -> 0x00e4 }
            java.util.Iterator r10 = r8.iterator()     // Catch:{ all -> 0x00e4 }
        L_0x0038:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x00e4 }
            if (r0 == 0) goto L_0x00dd
            java.lang.Object r2 = r10.next()     // Catch:{ all -> 0x00e4 }
            X.6vG r2 = (X.C146226vG) r2     // Catch:{ all -> 0x00e4 }
            X.67c r9 = r2.A01     // Catch:{ all -> 0x00e4 }
            X.6c4 r8 = r9.A04     // Catch:{ all -> 0x00e4 }
            android.content.ContentValues r4 = X.C36441kJ.A0E()     // Catch:{ all -> 0x00e4 }
            java.lang.String r1 = "plaintext_hash"
            java.lang.String r0 = r9.A02     // Catch:{ all -> 0x00e4 }
            r4.put(r1, r0)     // Catch:{ all -> 0x00e4 }
            java.lang.String r1 = "entry_weight"
            float r0 = r2.A00     // Catch:{ all -> 0x00e4 }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ all -> 0x00e4 }
            r4.put(r1, r0)     // Catch:{ all -> 0x00e4 }
            java.lang.String r1 = "hash_of_image_part"
            java.lang.String r0 = r9.A03     // Catch:{ all -> 0x00e4 }
            r4.put(r1, r0)     // Catch:{ all -> 0x00e4 }
            java.lang.String r1 = "url"
            java.lang.String r0 = r8.A0H     // Catch:{ all -> 0x00e4 }
            r4.put(r1, r0)     // Catch:{ all -> 0x00e4 }
            java.lang.String r1 = "enc_hash"
            java.lang.String r0 = r8.A09     // Catch:{ all -> 0x00e4 }
            r4.put(r1, r0)     // Catch:{ all -> 0x00e4 }
            java.lang.String r1 = "direct_path"
            java.lang.String r0 = r8.A07     // Catch:{ all -> 0x00e4 }
            r4.put(r1, r0)     // Catch:{ all -> 0x00e4 }
            java.lang.String r1 = "mimetype"
            java.lang.String r0 = r8.A0D     // Catch:{ all -> 0x00e4 }
            r4.put(r1, r0)     // Catch:{ all -> 0x00e4 }
            java.lang.String r1 = "media_key"
            java.lang.String r0 = r8.A0C     // Catch:{ all -> 0x00e4 }
            r4.put(r1, r0)     // Catch:{ all -> 0x00e4 }
            java.lang.String r1 = "file_size"
            int r0 = r8.A00     // Catch:{ all -> 0x00e4 }
            X.C36341k9.A0o(r4, r1, r0)     // Catch:{ all -> 0x00e4 }
            java.lang.String r1 = "width"
            int r0 = r8.A03     // Catch:{ all -> 0x00e4 }
            X.C36341k9.A0o(r4, r1, r0)     // Catch:{ all -> 0x00e4 }
            java.lang.String r1 = "height"
            int r0 = r8.A02     // Catch:{ all -> 0x00e4 }
            X.C36341k9.A0o(r4, r1, r0)     // Catch:{ all -> 0x00e4 }
            java.lang.String r1 = "emojis"
            java.lang.String r0 = r8.A08     // Catch:{ all -> 0x00e4 }
            r4.put(r1, r0)     // Catch:{ all -> 0x00e4 }
            java.lang.String r1 = "is_first_party"
            boolean r0 = r8.A0M     // Catch:{ all -> 0x00e4 }
            X.C54272sg.A00(r4, r1, r0)     // Catch:{ all -> 0x00e4 }
            java.lang.String r1 = "is_avocado"
            boolean r0 = r8.A0L     // Catch:{ all -> 0x00e4 }
            boolean r0 = X.AnonymousClass000.A1P(r0)
            X.C36341k9.A0o(r4, r1, r0)     // Catch:{ all -> 0x00e4 }
            java.lang.String r2 = "last_sticker_sent_ts"
            long r0 = r9.A00     // Catch:{ all -> 0x00e4 }
            X.C36341k9.A0p(r4, r2, r0)     // Catch:{ all -> 0x00e4 }
            java.lang.String r1 = "avatar_template_id"
            java.lang.String r0 = r8.A06     // Catch:{ all -> 0x00e4 }
            r4.put(r1, r0)     // Catch:{ all -> 0x00e4 }
            java.lang.String r1 = "is_fun_sticker"
            boolean r0 = r8.A0I     // Catch:{ all -> 0x00e4 }
            X.C54272sg.A00(r4, r1, r0)     // Catch:{ all -> 0x00e4 }
            java.lang.String r1 = "is_lottie"
            boolean r0 = r8.A0N     // Catch:{ all -> 0x00e4 }
            X.C54272sg.A00(r4, r1, r0)     // Catch:{ all -> 0x00e4 }
            java.lang.String r0 = "saveWeightedStickerIdentifierToDB/REPLACE_RECENT_STICKERS"
            r6.A06(r7, r0, r4)     // Catch:{ all -> 0x00e4 }
            goto L_0x0038
        L_0x00d9:
            java.lang.String r0 = "0"
            goto L_0x002b
        L_0x00dd:
            r5.A00()     // Catch:{ all -> 0x00e4 }
            r5.close()     // Catch:{ all -> 0x00eb }
            goto L_0x00f2
        L_0x00e4:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00e6 }
        L_0x00e6:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ all -> 0x00eb }
            throw r0     // Catch:{ all -> 0x00eb }
        L_0x00eb:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ed }
        L_0x00ed:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)
            throw r0
        L_0x00f2:
            r3.close()
        L_0x00f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146196vD.Blb(java.util.List):void");
    }

    public /* bridge */ /* synthetic */ C88794Ub B4V(Object obj, float f) {
        C1271367c r3 = (C1271367c) obj;
        AnonymousClass00C.A0D(r3, 0);
        return new C146226vG(r3, 1.0f);
    }

    public ArrayList BKI() {
        C18740tg.A00();
        ArrayList A012 = this.A00.A01();
        this.A01 = A012;
        return A012;
    }
}
