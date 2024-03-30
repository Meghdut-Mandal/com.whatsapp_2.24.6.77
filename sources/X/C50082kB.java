package X;

import android.database.Cursor;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.2kB  reason: invalid class name and case insensitive filesystem */
public class C50082kB extends C132446Tt {
    public int A00;
    public long A01 = 1;
    public C600336f A02;
    public AnonymousClass3T1 A03;
    public final C20310xM A04;
    public final C20650xu A05;
    public final AnonymousClass17U A06;
    public final AnonymousClass11F A07;
    public final AnonymousClass3T1 A08;
    public final AnonymousClass1S3 A09;
    public final AnonymousClass1A1 A0A;
    public final WeakReference A0B;
    public final boolean A0C;
    public final C19970wo A0D;

    public void A0A() {
        AnonymousClass4T2 r2 = (AnonymousClass4T2) this.A0B.get();
        this.A01 = this.A05.A09();
        if (r2 != null) {
            r2.BUl(this.A0C);
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass4T2 r0 = (AnonymousClass4T2) this.A0B.get();
        if (r0 != null) {
            r0.BUk(this.A02, this.A03, this.A00, this.A01);
        }
    }

    public C50082kB(AnonymousClass4T2 r3, C19970wo r4, C20310xM r5, C20650xu r6, AnonymousClass17U r7, AnonymousClass3T1 r8, AnonymousClass1S3 r9, AnonymousClass1A1 r10, boolean z) {
        this.A0D = r4;
        this.A06 = r7;
        this.A05 = r6;
        this.A04 = r5;
        this.A0A = r10;
        AnonymousClass11F r0 = r9.A04;
        C18740tg.A06(r0);
        this.A07 = r0;
        this.A09 = r9;
        this.A0C = z;
        this.A08 = r8;
        this.A0B = AnonymousClass001.A0F(r3);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Cursor A092;
        C64203Nb r1;
        String str;
        String[] strArr;
        String str2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C20650xu r9 = this.A05;
        AnonymousClass3T1 r2 = this.A08;
        boolean z = this.A0C;
        AnonymousClass1S3 r11 = this.A09;
        if (r9.A0N()) {
            C224214g r12 = new C224214g("FtsMessageStore/searchforjid");
            AnonymousClass11F r13 = r11.A04;
            C18740tg.A06(r13);
            long A022 = C66013Ui.A02(r2);
            if (A022 == Long.MIN_VALUE) {
                Log.e("FtsMessageStore/searchforjid/startSortId < 0");
            } else {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("start:");
                A0u.append(A022);
                r12.A02(C36371kC.A0z(" up:", A0u, z));
                if (C36391kE.A1a(r11)) {
                    long A093 = r9.A09();
                    String str3 = "";
                    if (A093 == 1) {
                        StringBuilder sb = new StringBuilder(AnonymousClass2x9.A04);
                        AnonymousClass17W.A02(sb, z);
                        str3 = AnonymousClass000.A0q(" LIMIT 1", sb);
                        strArr = new String[3];
                        strArr[0] = r9.A0H(r11.A02());
                        C36331k8.A19(r9.A06, r13, strArr, 1);
                        C36351kA.A1V(strArr, 2, A022);
                        str = "FIND_FTS_MESSAGE_FOR_JID_DEPRECATED";
                    } else if (A093 == 5) {
                        r11.A0E = true;
                        if (r9.A0E.A0E(6261)) {
                            str2 = AnonymousClass2x9.A07;
                        } else {
                            str2 = AnonymousClass2x9.A06;
                        }
                        StringBuilder sb2 = new StringBuilder(str2);
                        AnonymousClass17W.A02(sb2, z);
                        str3 = AnonymousClass000.A0q(" LIMIT 1", sb2);
                        strArr = new String[2];
                        strArr[0] = r9.A0E((C02680Bk) null, r11, (Integer) null);
                        C36351kA.A1V(strArr, 1, A022);
                        str = "FIND_FTS_MESSAGE_FOR_JID";
                    } else {
                        str = str3;
                        strArr = null;
                    }
                    C18740tg.A06(strArr);
                    r12.A02("compiled");
                    r1 = C20650xu.A01(r9, str3, str, strArr);
                    if (r1.A00 == -2) {
                        r11.A0E = false;
                        String[] strArr2 = new String[2];
                        strArr2[0] = r9.A0E((C02680Bk) null, r11, (Integer) null);
                        C36351kA.A1V(strArr2, 1, A022);
                        r1 = C20650xu.A01(r9, str3, "FIND_FTS_MESSAGE_FOR_JID_CONTENT_ONLY", strArr2);
                    }
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("found: ");
                    r12.A02(C36411kG.A11(A0u2, r1.A01));
                    r12.A01();
                }
            }
            r1 = C64203Nb.A00(-4);
        } else {
            C224214g r5 = new C224214g("FtsMessageStore/like/searchforjid");
            AnonymousClass11F r10 = r11.A04;
            C18740tg.A06(r10);
            long A023 = C66013Ui.A02(r2);
            if (A023 == Long.MIN_VALUE) {
                Log.e("FtsMessageStore/like/searchforjid/startid < 0");
                r1 = C64203Nb.A00(-4);
            } else {
                String replace = r11.A02().replace("'", "''").replace("%", "\\%");
                StringBuilder A0u3 = AnonymousClass000.A0u();
                A0u3.append("(");
                A0u3.append("(");
                A0u3.append("data LIKE '%");
                A0u3.append(replace);
                String A0r = C36401kF.A0r("%' ESCAPE '\\'", A0u3);
                A0u3.append("message_type = '0");
                A0u3.append("') ");
                A0u3.append(" OR ");
                A0u3.append("(");
                C36321k7.A1O("media_name LIKE '%", replace, "%' ESCAPE '\\'", A0r, A0u3);
                C36321k7.A1O("message_type = '5", "') ", " OR ", "(", A0u3);
                AnonymousClass000.A1D("media_caption LIKE '%", replace, "%' ESCAPE '\\'", A0u3);
                AnonymousClass000.A1D(" AND NOT ", "message_type = '0", "') ", A0u3);
                String A0q = AnonymousClass000.A0q(")", A0u3);
                StringBuilder sb3 = new StringBuilder("   SELECT _id, sort_id FROM available_message_view WHERE chat_row_id = ?");
                sb3.append(A0r);
                sb3.append(A0q);
                AnonymousClass17W.A02(sb3, z);
                String A0q2 = AnonymousClass000.A0q(" LIMIT 1", sb3);
                C64203Nb A002 = C64203Nb.A00(-4);
                String[] A1S = C36441kJ.A1S();
                C36331k8.A19(r9.A06, r10, A1S, 0);
                C36351kA.A1V(A1S, 1, A023);
                AnonymousClass1M0 A042 = r9.A0C.get();
                try {
                    A092 = A042.A02.A09(A0q2, "FIND_MESSAGE_FOR_JID_LIKE", A1S);
                    if (A092.moveToNext()) {
                        A002 = new C64203Nb(1, C36351kA.A07(A092, "sort_id"), C36351kA.A07(A092, "_id"));
                    }
                    A092.close();
                    A042.close();
                    StringBuilder A0u4 = AnonymousClass000.A0u();
                    A0u4.append("found: ");
                    r5.A02(C36411kG.A11(A0u4, r1.A01));
                    r5.A01();
                } catch (Throwable th) {
                    try {
                        A042.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
        }
        long j = r1.A01;
        if (j > 0) {
            C20310xM r92 = this.A04;
            AnonymousClass11F r3 = this.A07;
            this.A02 = r92.A0S(r3, 100, r92.A0j.A05(r3, 100, j, -1), -1);
            this.A03 = C36421kH.A0R(this.A0A, j);
            this.A00 = this.A06.A03(r3, this.A02.A02, r1.A02);
            Cursor cursor = this.A02.A00;
            if (cursor != null) {
                this.A02.A00.moveToPosition(Math.max(0, (cursor.getCount() - this.A00) - 50));
            }
        }
        if (this.A01 != 1) {
            return null;
        }
        C225314u.A0S(elapsedRealtime, 300);
        return null;
        throw th;
    }
}
