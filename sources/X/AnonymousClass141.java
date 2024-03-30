package X;

import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.141  reason: invalid class name */
public class AnonymousClass141 implements Cloneable {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public AnonymousClass3L0 A0E;
    public AnonymousClass3IL A0F;
    public AnonymousClass141 A0G;
    public AnonymousClass11F A0H;
    public UserJid A0I;
    public AnonymousClass35K A0J;
    public AnonymousClass3QL A0K;
    public Integer A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public Locale A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;
    public boolean A0u;
    public boolean A0v;
    public boolean A0w;
    public boolean A0x;
    public boolean A0y;
    @Deprecated
    public boolean A0z;
    public boolean A10;
    public boolean A11;
    public boolean A12;
    public boolean A13;
    public boolean A14;
    public String A15;

    public static boolean A01(C62183Fc r3, List list) {
        boolean z = false;
        if (list != null) {
            Iterator it = list.iterator();
            loop0:
            while (true) {
                z = false;
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    } else if (r3.A00((AnonymousClass141) it.next()) || z) {
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    public AnonymousClass141 A04() {
        try {
            Object clone = super.clone();
            if (clone instanceof AnonymousClass141) {
                return (AnonymousClass141) clone;
            }
        } catch (CloneNotSupportedException unused) {
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass141)) {
            return false;
        }
        AnonymousClass141 r4 = (AnonymousClass141) obj;
        return C1901797e.A00(this.A0H, r4.A0H) && C1901797e.A00(this.A0F, r4.A0F);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A0H, this.A0F});
    }

    public static ArrayList A00(Collection collection) {
        Class<UserJid> cls = UserJid.class;
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Jid A062 = ((AnonymousClass141) it.next()).A06(cls);
                if (A062 != null) {
                    arrayList.add(A062);
                }
            }
        }
        return arrayList;
    }

    public Jid A06(Class cls) {
        if (cls.isInstance(this.A0H)) {
            return (Jid) cls.cast(this.A0H);
        }
        return null;
    }

    public String A07() {
        AnonymousClass3IL r3 = this.A0F;
        if (r3 == null) {
            return AnonymousClass143.A03(this.A0H);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r3.A00);
        sb.append(":");
        sb.append(r3.A01);
        return sb.toString();
    }

    public String A08(float f, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(A07());
        sb.append("_");
        sb.append(i);
        sb.append("_");
        sb.append(f);
        return sb.toString();
    }

    public void A09(AnonymousClass3QL r3) {
        AnonymousClass3QL r0 = this.A0K;
        if (r0 != null && !TextUtils.equals(r0.A04, r3.A04)) {
            this.A0K = r3;
        }
    }

    public boolean A0B() {
        AnonymousClass3IL r0 = this.A0F;
        if (r0 == null || TextUtils.isEmpty(r0.A01)) {
            return false;
        }
        return true;
    }

    @Deprecated
    public boolean A0F() {
        String str = this.A0T;
        if (str == null || !str.startsWith("ent:")) {
            return false;
        }
        return true;
    }

    public boolean A0G() {
        AnonymousClass11F r0 = this.A0H;
        if (r0 != null) {
            return AnonymousClass143.A0G(r0);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("row_id=");
        sb.append(A0I());
        sb.append(" jid=");
        sb.append("(null)");
        sb.append(" key=");
        AnonymousClass3IL r2 = this.A0F;
        if (r2 == null) {
            sb.append("(null)");
        } else {
            sb.append(r2.A00);
            sb.append("-");
            sb.append(r2.A01);
        }
        sb.append(" phone=");
        sb.append(this.A0L);
        sb.append(" iswa=");
        sb.append(this.A0z);
        if (A0I() == -1) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("problematic contact:");
        sb2.append(sb.toString());
        Log.e(sb2.toString());
        return false;
    }

    public boolean A0H(C19700wN r8, AnonymousClass35K r9) {
        String str;
        int i = r9.A00;
        if ((i == 2 || i == 6) && r9.A01 == null) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            AnonymousClass11F r1 = this.A0H;
            if (r1 != null) {
                str = r1.toString();
            } else {
                str = "unknown@unknown";
            }
            if (!(r1 instanceof AnonymousClass147) && !(r1 instanceof AnonymousClass146)) {
                str = String.format(locale, "[obfuscated]@%s", new Object[]{str.substring(str.indexOf("@") + 1)});
            }
            objArr[0] = str;
            String format = String.format(locale, "(manage_community_groups) contact/community_info Detected subgroup '%s' without parent info", objArr);
            Log.e(format);
            r8.A0E("missing_parent_info", format, true);
            return false;
        }
        this.A0J = r9;
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("row_id=");
        sb.append(A0I());
        sb.append(" jid=");
        AnonymousClass11F r0 = this.A0H;
        if (r0 == null) {
            r0 = "(null)";
        }
        sb.append(r0);
        sb.append(" key=");
        AnonymousClass3IL r2 = this.A0F;
        if (r2 == null) {
            sb.append("(null)");
        } else {
            sb.append(r2.A00);
            sb.append("-");
            sb.append(AnonymousClass14B.A0B(r2.A01, 4));
        }
        sb.append(" phone=");
        sb.append(this.A0L);
        sb.append(" iswa=");
        sb.append(this.A0z);
        if (A0G()) {
            sb.append(" status=");
            sb.append(this.A0X);
        }
        return sb.toString();
    }

    public AnonymousClass141(AnonymousClass11F r4) {
        this.A0A = -1;
        this.A0f = true;
        this.A0M = "pn";
        this.A0e = true;
        this.A0G = null;
        this.A00 = 0;
        this.A0H = r4;
        this.A0z = true;
        this.A0F = null;
        if (AnonymousClass143.A0G(r4)) {
            this.A0K = AnonymousClass3QL.A05;
        }
        if (AnonymousClass143.A0H(r4)) {
            this.A0f = false;
        }
    }

    public AnonymousClass3L0 A03() {
        return this.A0E;
    }

    public AnonymousClass11F A05() {
        return this.A0H;
    }

    public boolean A0A() {
        if (!A0C() || this.A08 != 3) {
            return false;
        }
        return true;
    }

    public boolean A0C() {
        int i;
        if (A0K() == null || (i = this.A08) == 0 || i == -1) {
            return false;
        }
        return true;
    }

    public boolean A0D() {
        if (!A0C() || this.A00 != 1) {
            return false;
        }
        return true;
    }

    public boolean A0E() {
        if (!A0C() || this.A00 != 2) {
            return false;
        }
        return true;
    }

    public long A0I() {
        return this.A0A;
    }

    public String A0J() {
        return this.A0P;
    }

    public String A0K() {
        return this.A15;
    }

    public boolean A0N() {
        if (!A0C() || !A0A()) {
            return false;
        }
        return true;
    }

    public boolean A0O() {
        if (!A0G() || !this.A0i) {
            return false;
        }
        return true;
    }

    public void A0L(long j) {
        this.A0A = j;
    }

    public void A0M(String str) {
        this.A15 = str;
    }

    public AnonymousClass141(AnonymousClass11F r6, String str, String str2, String str3, int i, long j, boolean z) {
        int length;
        this.A0A = -1;
        boolean z2 = true;
        this.A0f = true;
        this.A0M = "pn";
        this.A0e = true;
        this.A0G = null;
        this.A00 = 0;
        this.A0H = r6;
        this.A0z = z;
        this.A0P = str2;
        if ((j > 0 || j == -2) && str != null && 5 <= (length = str.length()) && length <= 20) {
            this.A0F = new AnonymousClass3IL(j, str);
        }
        this.A0L = Integer.valueOf(i);
        this.A0V = str3;
        this.A0n = j != -4 ? false : z2;
        if (AnonymousClass143.A0H(r6)) {
            this.A0f = false;
        }
    }
}
