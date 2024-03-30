package X;

import android.content.ContentValues;
import com.whatsapp.util.Log;

/* renamed from: X.1SM  reason: invalid class name */
public final class AnonymousClass1SM {
    public final AnonymousClass163 A00;
    public final C220412q A01;
    public final C20310xM A02;
    public final AnonymousClass12P A03;
    public final C26141Ja A04;
    public final C24911Eg A05;
    public final AnonymousClass1SP A06;
    public final AnonymousClass1A1 A07;
    public final C19420v0 A08;
    public final AnonymousClass176 A09;
    public final AnonymousClass1SN A0A;
    public final AnonymousClass1SO A0B;

    public AnonymousClass1SM(C19420v0 r2, AnonymousClass163 r3, C220412q r4, C20310xM r5, AnonymousClass176 r6, AnonymousClass12P r7, C26141Ja r8, C24911Eg r9, AnonymousClass1SN r10, AnonymousClass1SO r11, AnonymousClass1SP r12, AnonymousClass1A1 r13) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r4, 2);
        AnonymousClass00C.A0D(r8, 3);
        AnonymousClass00C.A0D(r13, 4);
        AnonymousClass00C.A0D(r9, 5);
        AnonymousClass00C.A0D(r6, 6);
        AnonymousClass00C.A0D(r7, 7);
        AnonymousClass00C.A0D(r2, 8);
        AnonymousClass00C.A0D(r5, 9);
        AnonymousClass00C.A0D(r10, 10);
        AnonymousClass00C.A0D(r11, 12);
        this.A00 = r3;
        this.A01 = r4;
        this.A04 = r8;
        this.A07 = r13;
        this.A05 = r9;
        this.A09 = r6;
        this.A03 = r7;
        this.A08 = r2;
        this.A02 = r5;
        this.A0A = r10;
        this.A06 = r12;
        this.A0B = r11;
    }

    public static final String[] A01(C28981Uw r8, AnonymousClass1SM r9, Long l, Long l2, long j) {
        if (l2 == null && l == null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Long l3 = null;
        if (l != null) {
            l3 = l;
            if (l2 == null) {
                l2 = Long.valueOf(l.longValue() - (j - 1));
            }
        } else if (l2 != null) {
            l3 = Long.valueOf(l2.longValue() + j + 1);
        } else {
            l2 = null;
        }
        return new String[]{String.valueOf(r9.A00.A08(r8)), String.valueOf(l3), String.valueOf(l2)};
    }

    public final AnonymousClass3T1 A02(C28981Uw r2, long j) {
        AnonymousClass00C.A0D(r2, 0);
        return this.A02.A1B.A02(r2, j);
    }

    public final void A04(AnonymousClass3T1 r10) {
        C44072La r4;
        long j;
        int A022;
        long j2;
        long j3;
        int i;
        C220412q r1 = this.A01;
        C64933Qa r2 = r10.A1J;
        C65073Qp A092 = r1.A09(r2.A00, false);
        if ((A092 instanceof C44072La) && (r4 = (C44072La) A092) != null) {
            long j4 = r10.A1N;
            if (j4 != 1) {
                synchronized (A092) {
                    j = r4.A0U;
                }
                if (j < j4) {
                    this.A09.A0B(r10);
                    if (r4.A09 != C52382pL.GUEST) {
                        C19420v0.A00(this.A08).putBoolean("newsletter_message_received", true).apply();
                    }
                    synchronized (A092) {
                        if (r10.A1O > r4.A0V) {
                            r4.A0U = r10.A1N;
                            r4.A0V = r10.A1O;
                            r4.A0N = r10.A1N;
                            r4.A0O = r10.A1O;
                            r4.A0X = r10.A0I;
                            r4.A0d = r10;
                            r4.A0c = r10;
                        } else {
                            r4.A0d = null;
                        }
                        if (!(r2.A02 || (i = r10.A0D) == 16 || i == 18 || i == 17 || i == 9 || i == 10 || r10.A1J())) {
                            long j5 = r4.A0Q;
                            if (j5 < 100) {
                                j5 = 100;
                            }
                            int i2 = r4.A08;
                            int i3 = (int) (r10.A1O - j5);
                            if (i2 < i3) {
                                i2 = i3;
                            }
                            r4.A08 = i2;
                        }
                        A022 = this.A04.A02(r4);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("NewsletterMessageStore/updateNewsletterInfo/updated:");
                    sb.append(A022);
                    sb.append(" newRowId:");
                    synchronized (A092) {
                        j2 = r4.A0N;
                    }
                    sb.append(j2);
                    sb.append(" newSortId:");
                    synchronized (A092) {
                        j3 = r4.A0O;
                    }
                    sb.append(j3);
                    Log.i(sb.toString());
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0032, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0036, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.AnonymousClass3T1 r5) {
        /*
            r4 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r5, r0)
            X.12P r0 = r4.A03     // Catch:{ SQLNonTransientException -> 0x0037, IllegalArgumentException -> 0x003b }
            X.1M0 r3 = r0.A05()     // Catch:{ SQLNonTransientException -> 0x0037, IllegalArgumentException -> 0x003b }
            X.71s r2 = r3.B1k()     // Catch:{ all -> 0x0030 }
            r4.A03(r3, r5)     // Catch:{ all -> 0x0029 }
            r4.A00(r5)     // Catch:{ all -> 0x0029 }
            r2.A00()     // Catch:{ all -> 0x0029 }
            r2.close()     // Catch:{ all -> 0x0030 }
            r3.close()     // Catch:{ SQLNonTransientException -> 0x0037, IllegalArgumentException -> 0x003b }
            boolean r0 = r5.A1J()     // Catch:{ SQLNonTransientException -> 0x0037, IllegalArgumentException -> 0x003b }
            if (r0 != 0) goto L_0x0041
            X.1SP r0 = r4.A06     // Catch:{ SQLNonTransientException -> 0x0037, IllegalArgumentException -> 0x003b }
            r0.A00(r5)     // Catch:{ SQLNonTransientException -> 0x0037, IllegalArgumentException -> 0x003b }
            return
        L_0x0029:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002b }
        L_0x002b:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x0030 }
            throw r0     // Catch:{ all -> 0x0030 }
        L_0x0030:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ SQLNonTransientException -> 0x0037, IllegalArgumentException -> 0x003b }
            throw r0     // Catch:{ SQLNonTransientException -> 0x0037, IllegalArgumentException -> 0x003b }
        L_0x0037:
            r1 = move-exception
            java.lang.String r0 = "NewsletterMessageStore/failed to update the message"
            goto L_0x003e
        L_0x003b:
            r1 = move-exception
            java.lang.String r0 = "NewsletterMessageStore/failed to update the message due to message constraints"
        L_0x003e:
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1SM.A05(X.3T1):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0052, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0055, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0059, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A06(X.AnonymousClass3T1 r7) {
        /*
            r6 = this;
            r5 = 0
            X.12P r0 = r6.A03     // Catch:{ Exception -> 0x005a }
            X.1M0 r3 = r0.A05()     // Catch:{ Exception -> 0x005a }
            X.71s r2 = r3.B1k()     // Catch:{ all -> 0x0053 }
            X.0xM r0 = r6.A02     // Catch:{ all -> 0x004c }
            r4 = 1
            X.3Ox r0 = r0.A0T(r7, r4)     // Catch:{ all -> 0x004c }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x004c }
            boolean r0 = r0.A04     // Catch:{ all -> 0x004c }
            if (r0 != 0) goto L_0x0025
            java.lang.String r0 = "NewsletterMessageStore/failed to insert message"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x004c }
            r2.close()     // Catch:{ all -> 0x0053 }
            r3.close()     // Catch:{ Exception -> 0x005a }
            return r5
        L_0x0025:
            r6.A03(r3, r7)     // Catch:{ all -> 0x004c }
            r6.A00(r7)     // Catch:{ all -> 0x004c }
            r6.A04(r7)     // Catch:{ all -> 0x004c }
            r2.A00()     // Catch:{ all -> 0x004c }
            r2.close()     // Catch:{ all -> 0x0053 }
            r3.close()     // Catch:{ Exception -> 0x005a }
            boolean r0 = r7.A1J()     // Catch:{ Exception -> 0x005a }
            if (r0 != 0) goto L_0x004b
            X.1SP r3 = r6.A06     // Catch:{ Exception -> 0x005a }
            X.0wI r2 = r3.A02     // Catch:{ Exception -> 0x005a }
            r1 = 39
            X.1jB r0 = new X.1jB     // Catch:{ Exception -> 0x005a }
            r0.<init>(r7, r3, r1)     // Catch:{ Exception -> 0x005a }
            r2.A00(r0)     // Catch:{ Exception -> 0x005a }
        L_0x004b:
            return r4
        L_0x004c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004e }
        L_0x004e:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x0053 }
            throw r0     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ Exception -> 0x005a }
            throw r0     // Catch:{ Exception -> 0x005a }
        L_0x005a:
            r1 = move-exception
            java.lang.String r0 = "NewsletterMessageStore/failed to insert the message"
            com.whatsapp.util.Log.e(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1SM.A06(X.3T1):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0076, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0081, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(X.AnonymousClass3T1 r11) {
        /*
            r10 = this;
            X.4Uq r0 = r11.A0J
            if (r0 == 0) goto L_0x0093
            X.1SO r0 = r10.A0B
            r8 = 0
            r1 = 1
            X.12P r0 = r0.A01     // Catch:{ all -> 0x0082 }
            X.1M0 r3 = r0.A05()     // Catch:{ all -> 0x0082 }
            X.71s r4 = r3.B1k()     // Catch:{ all -> 0x007b }
            X.14e r6 = r3.A02     // Catch:{ all -> 0x0074 }
            java.lang.String r5 = "newsletter_message_reaction"
            java.lang.String r7 = "message_row_id = ?"
            java.lang.String[] r2 = new java.lang.String[r1]     // Catch:{ all -> 0x0074 }
            long r0 = r11.A1N     // Catch:{ all -> 0x0074 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0074 }
            r2[r8] = r0     // Catch:{ all -> 0x0074 }
            java.lang.String r0 = "DELETE_NEWSLETTER_MESSAGE_REACTION_FOR_MESSAGE"
            r6.A03(r5, r7, r0, r2)     // Catch:{ all -> 0x0074 }
            X.4Uq r8 = r11.A0J     // Catch:{ all -> 0x0074 }
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.newsletter.data.NewsletterMessageReactions"
            X.AnonymousClass00C.A0E(r8, r0)     // Catch:{ all -> 0x0074 }
            X.3cl r8 = (X.C68973cl) r8     // Catch:{ all -> 0x0074 }
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x0074 }
            r7.<init>()     // Catch:{ all -> 0x0074 }
            java.lang.String r2 = "message_row_id"
            long r0 = r11.A1N     // Catch:{ all -> 0x0074 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0074 }
            r7.put(r2, r0)     // Catch:{ all -> 0x0074 }
            java.util.Iterator r9 = r8.B8O()     // Catch:{ all -> 0x0074 }
        L_0x0044:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0074 }
            if (r0 == 0) goto L_0x0068
            java.lang.Object r8 = r9.next()     // Catch:{ all -> 0x0074 }
            X.28g r8 = (X.AnonymousClass28g) r8     // Catch:{ all -> 0x0074 }
            java.lang.String r1 = "reaction"
            java.lang.String r0 = r8.A02     // Catch:{ all -> 0x0074 }
            r7.put(r1, r0)     // Catch:{ all -> 0x0074 }
            java.lang.String r2 = "reaction_count"
            long r0 = r8.A00     // Catch:{ all -> 0x0074 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0074 }
            r7.put(r2, r0)     // Catch:{ all -> 0x0074 }
            java.lang.String r0 = "NewsletterMessageReactionStore/insertOrReplaceNewsletterMessageReactions"
            r6.A05(r5, r0, r7)     // Catch:{ all -> 0x0074 }
            goto L_0x0044
        L_0x0068:
            r4.A00()     // Catch:{ all -> 0x0074 }
            X.0AJ r1 = X.AnonymousClass0AJ.A00     // Catch:{ all -> 0x0074 }
            r4.close()     // Catch:{ all -> 0x007b }
            r3.close()     // Catch:{ all -> 0x0082 }
            goto L_0x0088
        L_0x0074:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ all -> 0x007b }
            throw r0     // Catch:{ all -> 0x007b }
        L_0x007b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x007d }
        L_0x007d:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ all -> 0x0082 }
            throw r0     // Catch:{ all -> 0x0082 }
        L_0x0082:
            r0 = move-exception
            X.03N r1 = new X.03N
            r1.<init>(r0)
        L_0x0088:
            java.lang.Throwable r1 = X.AnonymousClass0AK.A00(r1)
            if (r1 == 0) goto L_0x0093
            java.lang.String r0 = "NewsletterMessageReactionStore/failed to insert the message"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0093:
            boolean r0 = r11 instanceof X.AnonymousClass2bS
            if (r0 == 0) goto L_0x00ad
            X.2bS r11 = (X.AnonymousClass2bS) r11
            java.util.List r1 = r11.A05
            X.AnonymousClass00C.A08(r1)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00ae
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x00ae
        L_0x00a8:
            X.1Eg r0 = r10.A05
            r0.A01(r11)
        L_0x00ad:
            return
        L_0x00ae:
            java.util.Iterator r5 = r1.iterator()
        L_0x00b2:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00a8
            java.lang.Object r0 = r5.next()
            X.3PS r0 = (X.AnonymousClass3PS) r0
            long r3 = r0.A01
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00b2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1SM.A00(X.3T1):void");
    }

    public final void A03(C26911Lz r7, AnonymousClass3T1 r8) {
        C224114e r4 = ((AnonymousClass1M0) r7).A02;
        AnonymousClass11F r2 = r8.A1J.A00;
        if (r2 != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("message_row_id", Long.valueOf(r8.A1N));
            contentValues.put("chat_row_id", Long.valueOf(this.A00.A08(r2)));
            contentValues.put("server_message_id", Long.valueOf(r8.A1O));
            contentValues.put("comments_count", 0);
            AnonymousClass3A4 A0Z = r8.A0Z();
            if (A0Z != null) {
                contentValues.put("comments_count", Long.valueOf(A0Z.A00));
                contentValues.put("reaction_from_me", A0Z.A05);
                contentValues.put("reactions_from_me_ts", A0Z.A04);
                contentValues.put("extra_newsletter_tables", Long.valueOf(A0Z.A01));
                contentValues.put("extra_table_last_update_ts", Long.valueOf(A0Z.A02));
                contentValues.put("view_count", Long.valueOf(A0Z.A03));
            }
            r4.A08("newsletter_message", "INSERT_OR_REPLACE_NEWSLETTER_MESSAGE", contentValues, 5);
            return;
        }
        throw new IllegalStateException("NewsletterMessageStore/getContentValuesForInsert invalid message");
    }
}
