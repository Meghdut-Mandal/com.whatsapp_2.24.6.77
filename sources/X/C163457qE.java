package X;

import android.content.Context;
import android.net.Uri;
import java.net.URL;

/* renamed from: X.7qE  reason: invalid class name and case insensitive filesystem */
public class C163457qE implements C158607hm {
    public Object A00;
    public final int A01;

    public C163457qE(C1491570b r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public final void BTc() {
        C1491570b r6;
        Context context;
        C124685yd r4;
        C24801Dv r3;
        String str;
        int i;
        String str2;
        switch (this.A01) {
            case 0:
                ((C1491570b) this.A00).B34();
                return;
            case 1:
                C1491570b r7 = (C1491570b) this.A00;
                String str3 = r7.A0B;
                Context context2 = r7.A0K;
                C124685yd r5 = r7.A0S;
                C24801Dv r42 = r7.A0M;
                if (str3 != null) {
                    r42.Bp7(context2, Uri.parse(str3), (AnonymousClass3T1) null);
                }
                r5.A02 = true;
                r5.A00 = 1;
                r7.B34();
                return;
            case 2:
                r6 = (C1491570b) this.A00;
                URL url = r6.A0C;
                if (url != null) {
                    str2 = url.toString();
                } else {
                    str2 = r6.A0B;
                }
                context = r6.A0K;
                r4 = r6.A0S;
                r3 = r6.A0M;
                i = 3;
                break;
            case 3:
                r6 = (C1491570b) this.A00;
                URL url2 = r6.A0D;
                if (url2 != null) {
                    str = url2.toString();
                } else {
                    str = r6.A0B;
                }
                context = r6.A0K;
                r4 = r6.A0S;
                r3 = r6.A0M;
                i = 2;
                break;
            default:
                C1491570b r1 = (C1491570b) this.A00;
                if (r1.A0E) {
                    r1.B76(false);
                    return;
                } else {
                    r1.B6h();
                    return;
                }
        }
        Integer valueOf = Integer.valueOf(i);
        if (str != null) {
            r3.Bp7(context, Uri.parse(str), (AnonymousClass3T1) null);
        }
        r4.A02 = true;
        r4.A00 = valueOf;
        r6.B34();
    }
}
