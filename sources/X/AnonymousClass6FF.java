package X;

import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;
import org.json.JSONObject;

/* renamed from: X.6FF  reason: invalid class name */
public abstract class AnonymousClass6FF {
    public final UserFlowLogger A00;
    public final AnonymousClass5JT A01;

    public final void A03(long j, String str, int i, String str2) {
        AnonymousClass00C.A0D(str, 1);
        A04(j, "error_domain", str);
        AnonymousClass5JT r2 = this.A01;
        if (r2 != null) {
            r2.flowAnnotate(j, "error_code", i);
        } else {
            UserFlowLogger userFlowLogger = this.A00;
            if (userFlowLogger != null) {
                userFlowLogger.flowAnnotate(j, "error_code", i);
            } else {
                throw C36381kD.A0l();
            }
        }
        A04(j, "error_description", str2);
        JSONObject A1B = C36441kJ.A1B();
        A1B.put("domain", str);
        A1B.put("code", i);
        A1B.put("message", str2);
        A04(j, "error_json", C36381kD.A0y(A1B));
        if (r2 != null) {
            r2.flowEndFail(j, "", "");
            return;
        }
        UserFlowLogger userFlowLogger2 = this.A00;
        if (userFlowLogger2 != null) {
            userFlowLogger2.flowEndFail(j, "", "");
            return;
        }
        throw C36381kD.A0l();
    }

    public final void A04(long j, String str, String str2) {
        AnonymousClass00C.A0D(str2, 2);
        AnonymousClass5JT r0 = this.A01;
        if (r0 != null) {
            r0.flowAnnotate(j, str, str2);
            return;
        }
        UserFlowLogger userFlowLogger = this.A00;
        if (userFlowLogger != null) {
            userFlowLogger.flowAnnotate(j, str, str2);
            return;
        }
        throw C36381kD.A0l();
    }

    public final void A01(long j) {
        AnonymousClass5JT r0 = this.A01;
        if (r0 != null) {
            r0.flowEndCancel(j, "user_cancelled");
            return;
        }
        UserFlowLogger userFlowLogger = this.A00;
        if (userFlowLogger != null) {
            userFlowLogger.flowEndCancel(j, "user_cancelled");
            return;
        }
        throw C36381kD.A0l();
    }

    public final void A02(long j) {
        AnonymousClass5JT r3 = this.A01;
        if (r3 != null) {
            r3.B7S(new AnonymousClass66V("arfx", false), j);
            return;
        }
        UserFlowConfig build = new UserFlowConfig.UserFlowConfigBuilder("arfx", false).build();
        UserFlowLogger userFlowLogger = this.A00;
        if (userFlowLogger != null) {
            userFlowLogger.flowStart(j, build);
            return;
        }
        throw C36381kD.A0l();
    }

    public final void A05(long j, String str, String str2) {
        AnonymousClass5JT r0 = this.A01;
        if (r0 != null) {
            int A0D = C90514aH.A0D(j);
            r0.A00.markerPoint((int) j, A0D, str, str2);
            return;
        }
        UserFlowLogger userFlowLogger = this.A00;
        if (userFlowLogger != null) {
            userFlowLogger.flowMarkPoint(j, str, str2);
            return;
        }
        throw C36381kD.A0l();
    }

    public final void A06(AnonymousClass6SG r3, String str, String str2, long j) {
        String str3 = r3.A00;
        AnonymousClass00C.A08(str3);
        A04(j, "effect_session_id", str3);
        String str4 = r3.A01;
        AnonymousClass00C.A08(str4);
        A04(j, "delivery_session_id", str4);
        String str5 = r3.A04;
        AnonymousClass00C.A08(str5);
        A04(j, "product_session_id", str5);
        A04(j, "product_name", r3.A03);
        A04(j, "effect_id", str);
        if (str2 != null) {
            A04(j, "effect_instance_id", str2);
        }
    }

    public AnonymousClass6FF(UserFlowLogger userFlowLogger, AnonymousClass5JT r4) {
        this.A01 = r4;
        this.A00 = userFlowLogger;
        if (AnonymousClass000.A1W(r4) == (userFlowLogger != null ? false : true)) {
            throw AnonymousClass001.A09("Provide either userFlowLogger or fbUserFlowLogger!");
        }
    }
}
