package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.Jid;
import java.util.List;
import java.util.Locale;

/* renamed from: X.1KS  reason: invalid class name */
public abstract class AnonymousClass1KS {
    public final int A00;
    public final C19970wo A01;
    public final C20810yC A02;
    public final AnonymousClass1KU A03;
    public final C21430zE A04;
    public final AnonymousClass00T A05;
    public final AnonymousClass1KW A06;
    public final C19420v0 A07;

    public AnonymousClass1KS(C19970wo r9, C19630wG r10, AnonymousClass1KW r11, C19420v0 r12, C20810yC r13, C21010yW r14, AnonymousClass1KU r15, C21670zc r16, C21690ze r17, C21430zE r18, C19770wU r19, int i) {
        this.A00 = i;
        this.A01 = r9;
        this.A07 = r12;
        this.A04 = r18;
        this.A03 = r15;
        this.A02 = r13;
        this.A06 = r11;
        this.A05 = new AnonymousClass00U(new AnonymousClass1KX(r10, this, r14, r16, r17, r19));
    }

    public final void A02(int i, String str, long j) {
        String str2 = str;
        AnonymousClass00C.A0D(str, 1);
        if (C20800yB.A01(C21000yV.A02, this.A02, 4360)) {
            C21700zf r0 = (C21700zf) this.A05.getValue();
            r0.A06.markerAnnotate(r0.A04.A06, i, str2, j);
        }
    }

    public final void A03(int i, String str, String str2) {
        AnonymousClass00C.A0D(str, 1);
        AnonymousClass00C.A0D(str2, 2);
        if (C20800yB.A01(C21000yV.A02, this.A02, 4360)) {
            C21700zf r0 = (C21700zf) this.A05.getValue();
            r0.A06.markerAnnotate(r0.A04.A06, i, str, str2);
        }
    }

    public final void A04(int i, String str, boolean z) {
        AnonymousClass00C.A0D(str, 1);
        if (C20800yB.A01(C21000yV.A02, this.A02, 4360)) {
            C21700zf r0 = (C21700zf) this.A05.getValue();
            r0.A06.markerAnnotate(r0.A04.A06, i, str, z);
        }
    }

    public final void A08(Integer num, String str) {
        AnonymousClass00C.A0D(str, 1);
        if (C20800yB.A01(C21000yV.A02, this.A02, 4360) && num != null) {
            ((C21700zf) this.A05.getValue()).A03(num.intValue(), str);
        }
    }

    public final void A0A(List list, int i, String str) {
        AnonymousClass00C.A0D(list, 2);
        if (C20800yB.A01(C21000yV.A02, this.A02, 4360)) {
            C21700zf r3 = (C21700zf) this.A05.getValue();
            r3.A06.markerAnnotate(r3.A04.A06, i, str, (String[]) list.toArray(new String[0]));
        }
    }

    public String A00() {
        if (this instanceof C26551Kp) {
            return "PslPrefetchPerfTracker";
        }
        if (this instanceof C26451Kf) {
            return "PhoenixFlowsMetadataPerfTracker";
        }
        return "PhoenixExtensionInitLogger";
    }

    public final void A01(int i, String str) {
        C20810yC r2 = this.A02;
        C21000yV r1 = C21000yV.A02;
        if (!C20800yB.A01(r1, r2, 4360)) {
            return;
        }
        if (!C20800yB.A01(r1, r2, 5333) || !C20800yB.A01(r1, r2, 1319)) {
            ((C21700zf) this.A05.getValue()).A09(str, i, true);
            A02(i, "timestamp_ms", C19970wo.A00(this.A01));
            A04(i, "is_debug_build", false);
            String string = ((SharedPreferences) this.A07.A00.get()).getString("pref_graphql_domain", "whatsapp.com");
            AnonymousClass00C.A08(string);
            String lowerCase = string.toLowerCase(Locale.ROOT);
            AnonymousClass00C.A08(lowerCase);
            A04(i, "is_graphql_prod", lowerCase.equals("whatsapp.com"));
        }
    }

    public final void A05(int i, short s) {
        if (C20800yB.A01(C21000yV.A02, this.A02, 4360)) {
            ((C21700zf) this.A05.getValue()).A04(i, s);
        }
    }

    public final void A06(Jid jid, String str, String str2, String str3, int i) {
        if (C20800yB.A01(C21000yV.A02, this.A02, 4360)) {
            if (!(str == null || str.length() == 0)) {
                A03(i, "extension_message_id", C132586Uj.A00.A02(this.A06, str, true));
            }
            if (!(str2 == null || str2.length() == 0)) {
                StringBuilder sb = new StringBuilder();
                sb.append("wae");
                sb.append(str2);
                A03(i, "session_id", C132586Uj.A00(sb.toString()));
            }
            if (jid != null) {
                String A002 = this.A03.A00(jid);
                AnonymousClass00C.A08(A002);
                A03(i, "biz_jid", A002);
            }
            if (str3 != null && str3.length() != 0) {
                A03(i, "extension_id", str3);
            }
        }
    }

    public final void A07(Integer num) {
        if (num != null) {
            this.A04.markerDrop(this.A00, num.intValue());
        }
    }

    public final void A09(String str, int i) {
        if (str == null) {
            str = "UNKNOWN";
        }
        A03(i, "extension_status", str);
    }
}
