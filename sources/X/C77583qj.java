package X;

import android.database.Cursor;
import android.os.SystemClock;

/* renamed from: X.3qj  reason: invalid class name and case insensitive filesystem */
public class C77583qj implements C88094Rj {
    public final AnonymousClass163 A00;
    public final AnonymousClass12g A01;
    public final C20650xu A02;
    public final AnonymousClass12P A03;
    public final C19970wo A04;

    public Cursor BE9(C02680Bk r15, AnonymousClass11F r16, AnonymousClass1S3 r17) {
        long j;
        String str;
        AnonymousClass1M0 r5;
        C36721lC r3;
        AnonymousClass1S3 r8 = r17;
        AnonymousClass11F r9 = r16;
        if (r16 == null) {
            str = "StarredMessageStore/getStarredMessages";
            j = SystemClock.uptimeMillis();
            C20650xu r92 = this.A02;
            long A09 = r92.A09();
            try {
                r5 = this.A03.get();
                if (r17 != null) {
                    if (C36391kE.A1a(r8)) {
                        if (A09 == 1) {
                            String A0H = r92.A0H(r8.A02());
                            r3 = r5.A02.A0B(r15, AnonymousClass2x9.A0B, "SEARCH_STARRED_MESSAGES_FTS_DEPRECATED_SQL", new String[]{A0H});
                        } else {
                            String A0E = r92.A0E(r15, r8, (Integer) null);
                            r3 = r5.A02.A0B(r15, AnonymousClass2x9.A0C, "SEARCH_STARRED_MESSAGES_FTS_SQL", new String[]{A0E});
                        }
                    }
                }
                r3 = r5.A02.A0B(r15, AnonymousClass2xD.A02, "GET_ALL_STARRED_MESSAGES_START_SQL", (String[]) null);
            } catch (Throwable th) {
                this.A01.A01(str, SystemClock.uptimeMillis() - j);
                throw th;
            }
        } else {
            str = "StarredMessageStore/getStarredMessagesForJid";
            j = SystemClock.uptimeMillis();
            C20650xu r32 = this.A02;
            long A092 = r32.A09();
            r5 = this.A03.get();
            if (r17 != null) {
                if (C36391kE.A1a(r8)) {
                    if (A092 == 1) {
                        String A0H2 = r32.A0H(r8.A02());
                        C224114e r33 = r5.A02;
                        String str2 = AnonymousClass2x9.A09;
                        String[] A1S = C36441kJ.A1S();
                        C36331k8.A19(this.A00, r9, A1S, 0);
                        A1S[1] = A0H2;
                        r3 = r33.A0B(r15, str2, "SEARCH_STARRED_MESSAGES_FOR_JID_FTS_DEPRECATED_SQL", A1S);
                    } else {
                        String A0E2 = r32.A0E(r15, r8, (Integer) null);
                        r3 = r5.A02.A0B(r15, AnonymousClass2x9.A0A, "SEARCH_STARRED_MESSAGES_FOR_JID_FTS_SQL", new String[]{A0E2});
                    }
                }
            }
            C224114e r34 = r5.A02;
            String str3 = AnonymousClass2xD.A01;
            String[] strArr = new String[1];
            C36331k8.A19(this.A00, r9, strArr, 0);
            r3 = r34.A0B(r15, str3, "GET_ALL_STARRED_MESSAGES_FOR_JID_START_SQL", strArr);
        }
        r5.close();
        this.A01.A01(str, SystemClock.uptimeMillis() - j);
        return r3;
        throw th;
    }

    public C77583qj(C19970wo r1, AnonymousClass163 r2, AnonymousClass12g r3, C20650xu r4, AnonymousClass12P r5) {
        this.A04 = r1;
        this.A02 = r4;
        this.A03 = r5;
        this.A00 = r2;
        this.A01 = r3;
    }
}
