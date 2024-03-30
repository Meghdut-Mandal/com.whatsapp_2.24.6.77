package X;

import android.text.TextUtils;

/* renamed from: X.9ky  reason: invalid class name and case insensitive filesystem */
public class C202059ky {
    public int A00;
    public int A01;
    public long A02;
    public C203399nx A03;
    public C203399nx A04;
    public String A05;
    public String A06;
    public String A07;
    public C203399nx A08;

    public static C202059ky A00() {
        return new C202059ky();
    }

    public static C202059ky A01(C203399nx r1) {
        if (!TextUtils.isEmpty(C36391kE.A0x(r1, "error-code")) || (r1 = r1.A0c("pin")) != null) {
            return new C202059ky(r1);
        }
        return null;
    }

    public C202059ky(C203399nx r5) {
        this.A01 = -1;
        this.A00 = AnonymousClass6R8.A00(r5.A0i("error-code", (String) null), 0);
        this.A07 = r5.A0i("error-text", (String) null);
        r5.A0i("display_title", (String) null);
        this.A06 = r5.A0i("display_text", (String) null);
        this.A01 = C203399nx.A01(r5, "remaining-retries", -1);
        this.A02 = C203399nx.A02(r5, "next-retry-ts");
        this.A05 = r5.A0i("auth-ticket-fp", (String) null);
        this.A08 = r5.A0c("offer_eligibility");
        int i = this.A00;
        if (i == 1448) {
            this.A03 = r5.A0c("key");
        } else if (i == 10718) {
            this.A01 = 0;
        } else if (i == 454) {
            this.A04 = r5.A0c("step_up");
        }
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[ code: ");
        A0u.append(this.A00);
        A0u.append(" text: ");
        A0u.append(this.A07);
        A0u.append(" remaining-retries: ");
        A0u.append(this.A01);
        A0u.append(" next-attempt-ts: ");
        A0u.append(this.A02);
        String str3 = this.A05;
        if (str3 != null) {
            str = AnonymousClass000.A0p(" auth-ticket-fp: ", str3, AnonymousClass000.A0u());
        } else {
            str = "";
        }
        A0u.append(str);
        A0u.append(" key-node: ");
        if (this.A03 != null) {
            str2 = "set";
        } else {
            str2 = "null";
        }
        A0u.append(str2);
        return AnonymousClass000.A0q(" ]", A0u);
    }

    public C202059ky(int i) {
        this.A01 = -1;
        this.A00 = i;
    }

    public C202059ky() {
        this.A01 = -1;
        this.A00 = 0;
    }
}
