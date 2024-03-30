package X;

import android.util.Base64;
import java.util.List;
import java.util.Objects;

/* renamed from: X.0U3  reason: invalid class name */
public final class AnonymousClass0U3 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public AnonymousClass0U3(String str, String str2, String str3, List list) {
        Objects.requireNonNull(str);
        this.A01 = str;
        Objects.requireNonNull(str2);
        this.A02 = str2;
        Objects.requireNonNull(str3);
        this.A03 = str3;
        Objects.requireNonNull(list);
        this.A04 = list;
        StringBuilder sb = new StringBuilder(str);
        sb.append("-");
        sb.append(str2);
        this.A00 = AnonymousClass000.A0p("-", str3, sb);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("FontRequest {mProviderAuthority: ");
        A0u2.append(this.A01);
        A0u2.append(", mProviderPackage: ");
        A0u2.append(this.A02);
        A0u2.append(", mQuery: ");
        A0u2.append(this.A03);
        A0u.append(AnonymousClass000.A0q(", mCertificates:", A0u2));
        int i = 0;
        while (true) {
            List list = this.A04;
            if (i < list.size()) {
                A0u.append(" [");
                List list2 = (List) list.get(i);
                for (int i2 = 0; i2 < list2.size(); i2++) {
                    A0u.append(" \"");
                    A0u.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                    A0u.append("\"");
                }
                A0u.append(" ]");
                i++;
            } else {
                A0u.append("}");
                return AnonymousClass000.A0q(AnonymousClass000.A0r("mCertificatesArray: ", AnonymousClass000.A0u(), 0), A0u);
            }
        }
    }
}
