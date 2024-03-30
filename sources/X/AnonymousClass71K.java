package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.71K  reason: invalid class name */
public class AnonymousClass71K implements C160217ke {
    public final C160217ke A00;
    public final /* synthetic */ C131556Pn A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public void Bf6(C121065sX r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00.Bf6(r2);
    }

    public void BfG(String str) {
        AnonymousClass00C.A0D(str, 0);
        this.A00.BfG(str);
    }

    public AnonymousClass71K(C131556Pn r1, C160217ke r2, String str, String str2, boolean z) {
        this.A01 = r1;
        this.A03 = str;
        this.A04 = z;
        this.A02 = str2;
        this.A00 = r2;
    }

    public void BfE(C122855vX r6) {
        String str;
        C130996Nh r2;
        String str2;
        String str3;
        C130996Nh r3;
        String str4;
        String str5;
        String str6 = null;
        if (r6.A03) {
            r3 = this.A01.A05;
            str4 = this.A03;
            str5 = "CACHE_HIT";
        } else if (r6.A00 == 5) {
            boolean z = this.A04;
            r3 = this.A01.A05;
            str4 = this.A03;
            if (z) {
                str5 = "REQUEST_SUCCESS";
            } else {
                str5 = "PREFETCH_REQUEST_SUCCESS";
            }
        } else {
            Exception exc = r6.A02;
            if (exc != null) {
                str6 = exc.getMessage();
            }
            HashMap A0J = AnonymousClass001.A0J();
            switch (r6.A00) {
                case 1:
                    str = "REQUEST_FAILED";
                    break;
                case 2:
                    str = "INVALID_TOS_VERSION";
                    break;
                case 3:
                    str = "NULL_LAYOUT";
                    break;
                case 4:
                    str = "UNEXPECTED_ERROR";
                    break;
                case 5:
                    str = "SUCCESS";
                    break;
                case 6:
                    str = "UNKNOWN";
                    break;
                case 7:
                    str = "NETWORK_ERROR";
                    break;
                case 8:
                    str = "EXPIRED_TOKEN";
                    break;
                case 9:
                    str = "PING_NEEDED";
                    break;
                default:
                    str = "RETRY_WITH_BACKOFF";
                    break;
            }
            A0J.put("EVENT_PARAM_ERROR_CODE", str);
            A0J.put("EVENT_PARAM_ERROR_MESSAGE", str6);
            if (this.A04) {
                r2 = this.A01.A05;
                str2 = this.A03;
                str3 = "REQUEST_FAILURE";
            } else {
                A0J.put("EVENT_PARAM_BLOKS_PARAMS", this.A02);
                r2 = this.A01.A05;
                str2 = this.A03;
                str3 = "PREFETCH_REQUEST_FAILURE";
            }
            r2.A02(str2, str3, A0J);
            this.A00.BfE(r6);
        }
        r3.A02(str4, str5, (Map) null);
        this.A00.BfE(r6);
    }
}
