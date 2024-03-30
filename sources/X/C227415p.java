package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteBlobTooBigException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteOutOfMemoryException;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.15p  reason: invalid class name and case insensitive filesystem */
public abstract class C227415p {
    public final int A00;
    public final C19700wN A01;
    public final AnonymousClass12P A02;
    public final C219612i A03;
    public final C227715s A04;
    public final String A05;
    public final C20060wx A06;
    public final AnonymousClass15x A07;
    public final AnonymousClass15w A08;
    public final C227915v A09;
    public final AnonymousClass13R A0A;

    public static void A00(C227415p r5, AnonymousClass9MV r6) {
        String str;
        C219612i r4 = r5.A03;
        StringBuilder sb = new StringBuilder();
        sb.append("migration_stats_");
        sb.append(r5.A05);
        String obj = sb.toString();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("row_processed", r6.A03);
            jSONObject.put("row_skipped", r6.A04);
            jSONObject.put("db_size_change", r6.A00);
            jSONObject.put("migration_time_spent", r6.A01);
            jSONObject.put("retry_count", r6.A02);
            str = jSONObject.toString();
        } catch (JSONException e) {
            Log.e("Failed to save migration statistics to JSON object.", e);
            str = null;
        }
        r4.A04(obj, str);
    }

    public long A02() {
        String str;
        C219612i r5 = this.A03;
        StringBuilder sb = new StringBuilder();
        sb.append(this.A05);
        sb.append("_retry_revision");
        if (0 != r5.A00(sb.toString(), 0)) {
            return 0;
        }
        if (this instanceof C227515q) {
            str = "rename_deprecated_tables_retry_count";
        } else if (this instanceof AnonymousClass15y) {
            str = "drop_deprecated_tables_retry_count";
        } else {
            str = "migration_fts_retry";
        }
        return r5.A00(str, 0);
    }

    public Cursor A03(C26901Ly r6, int i, long j) {
        String str;
        C224114e r4 = ((AnonymousClass1M0) r6).A02;
        if ((this instanceof C227515q) || (this instanceof AnonymousClass15y)) {
            str = "";
        } else {
            str = C56202vu.A00;
        }
        String[] strArr = {String.valueOf(j), String.valueOf(i)};
        StringBuilder sb = new StringBuilder();
        sb.append("MIGRATION_GET_QUERY_FOR_");
        sb.append(this.A05);
        return r4.A09(str, sb.toString(), strArr);
    }

    public String A04() {
        if (this instanceof C227515q) {
            return "rename_deprecated_tables_start_index";
        }
        if (this instanceof AnonymousClass15y) {
            return "drop_deprecated_tables_start_index";
        }
        return "migration_fts_index";
    }

    public HashSet A05() {
        if (!(this instanceof AnonymousClass15y)) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        hashSet.add("rename_deprecated_tables");
        return hashSet;
    }

    public void A06() {
        if (!(this instanceof C23911Ai)) {
            C227715s r1 = this.A04;
            String str = this.A05;
            if (!r1.A02.contains(str) && !C227715s.A00(r1.A00.A09(242), str)) {
                A0B();
            }
        }
    }

    public void A07() {
        String str;
        C219612i r4 = this.A03;
        r4.A02(A04());
        if (this instanceof C227515q) {
            str = "rename_deprecated_tables_retry_count";
        } else if (this instanceof AnonymousClass15y) {
            str = "drop_deprecated_tables_retry_count";
        } else {
            str = "migration_fts_retry";
        }
        r4.A02(str);
        StringBuilder sb = new StringBuilder();
        String str2 = this.A05;
        sb.append(str2);
        sb.append("_retry_revision");
        r4.A02(sb.toString());
        int i = this.A00;
        if (Integer.MIN_VALUE != i) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append("_in_progress");
            r4.A02(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str2);
            sb3.append("_complete");
            r4.A04(sb3.toString(), String.valueOf(i));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0088, code lost:
        if (r3 != -1) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A08() {
        /*
            r15 = this;
            X.0wx r0 = r15.A06
            long r5 = r0.A02()
            X.15s r0 = r15.A04
            java.lang.String r10 = r15.A05
            X.0yC r1 = r0.A00
            r0 = 402(0x192, float:5.63E-43)
            java.lang.String r1 = r1.A09(r0)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r1.toLowerCase(r0)
            java.lang.String r1 = r0.trim()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            r13 = 0
            if (r0 == 0) goto L_0x0050
            r3 = 0
        L_0x0026:
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0092
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "DatabaseMigration/hasEnoughStorageForMigration/insufficient storage for migration; name="
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = "; availableInternalPhoneStorage="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "; minInternalStorageRequired="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 0
            return r0
        L_0x0050:
            java.lang.String r0 = ";"
            java.lang.String[] r11 = r1.split(r0)
            int r9 = r11.length
            r12 = 0
            r8 = 0
        L_0x0059:
            r1 = -1
            if (r8 >= r9) goto L_0x008e
            r0 = r11[r8]
            java.lang.String r3 = r0.trim()
            boolean r0 = r3.startsWith(r10)
            if (r0 == 0) goto L_0x008b
            java.lang.String r0 = ":"
            java.lang.String[] r4 = r3.split(r0)
            int r3 = r4.length
            r0 = 2
            if (r3 != r0) goto L_0x008b
            r7 = r4[r12]
            r0 = 1
            r0 = r4[r0]
            long r3 = X.AnonymousClass6R8.A01(r0, r1)
            boolean r0 = r10.equals(r7)
            if (r0 == 0) goto L_0x008b
            int r0 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x008b
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x008e
            goto L_0x0026
        L_0x008b:
            int r8 = r8 + 1
            goto L_0x0059
        L_0x008e:
            r3 = 10485760(0xa00000, double:5.180654E-317)
            goto L_0x0026
        L_0x0092:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227415p.A08():boolean");
    }

    public boolean A09() {
        if (this.A03.A00(A04(), -1) >= 0) {
            return true;
        }
        return false;
    }

    public boolean A0A() {
        if (this instanceof C227515q) {
            return true;
        }
        if (this instanceof AnonymousClass15y) {
            String A012 = this.A03.A01("drop_deprecated_tables_status");
            if (A012 == null || Integer.parseInt(A012) != 1) {
                return false;
            }
            return true;
        }
        C20650xu r1 = ((C23911Ai) this).A00;
        if (!r1.A0N() || r1.A09() != 5) {
            return false;
        }
        return true;
    }

    public boolean A0B() {
        AnonymousClass15w r1 = this.A08;
        String str = this.A05;
        if (((Set) r1.A01.get()).contains(str) || C227715s.A00(r1.A00.A00.A09(404), str)) {
            return true;
        }
        return false;
    }

    public boolean A0C() {
        if (!(this instanceof C23911Ai) && A02() > 100) {
            return true;
        }
        return false;
    }

    public boolean A0E(Throwable th, int i) {
        StringBuilder sb;
        String str;
        if (th instanceof SQLiteDatabaseCorruptException) {
            return false;
        }
        boolean z = th instanceof SQLiteBlobTooBigException;
        if (i == 1) {
            if (z) {
                sb = new StringBuilder();
                sb.append("DatabaseMigration/shouldRetryWithSmallerBatch/error; name=");
                sb.append(this.A05);
                str = "; BlobTooBigException - skipping row";
            } else if (!(th instanceof IllegalStateException)) {
                return false;
            } else {
                sb = new StringBuilder();
                sb.append("DatabaseMigration/shouldRetryWithSmallerBatch/error; name=");
                sb.append(this.A05);
                str = "; IllegalStateException - skipping row";
            }
            sb.append(str);
            Log.e(sb.toString());
            return true;
        } else if (z || (th instanceof SQLiteOutOfMemoryException) || (th instanceof IllegalStateException)) {
            return true;
        } else {
            return false;
        }
    }

    public C227415p(C227615r r2, String str, int i) {
        this.A05 = str;
        this.A00 = i;
        this.A01 = r2.A00;
        this.A06 = r2.A03;
        this.A0A = r2.A09;
        this.A03 = r2.A06;
        this.A04 = r2.A0A;
        this.A02 = r2.A05;
        this.A09 = r2.A08;
        this.A08 = r2.A07;
        this.A07 = r2.A04;
    }

    public final int A01() {
        A06();
        A06();
        if (A0A()) {
            return 1;
        }
        if (A0C()) {
            return 2;
        }
        if (!A0D()) {
            return 12;
        }
        if (!A08()) {
            return 10;
        }
        A09();
        if (A09()) {
            return 3;
        }
        return 5;
    }

    public boolean A0D() {
        Iterator it = A05().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C227415p r0 = (C227415p) this.A0A.A00().get(str);
            if (r0 == null) {
                C19700wN r2 = this.A01;
                StringBuilder sb = new StringBuilder();
                sb.append(this.A05);
                sb.append(" depends on ");
                sb.append(str);
                sb.append(" (missing)");
                r2.A0E("db-migration-missing-dep", sb.toString(), false);
            } else if (!r0.A0A()) {
            }
            return false;
        }
        return true;
    }
}
