package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8tS  reason: invalid class name and case insensitive filesystem */
public final class C185068tS extends C118095nK {
    public static final ArrayList A0U = C165567td.A0e("false", "true");
    public static final ArrayList A0V = C165567td.A0e("false", "true");
    public static final ArrayList A0W = C165567td.A0e("false", "true");
    public static final ArrayList A0X = C165567td.A0e("false", "true");
    public static final ArrayList A0Y = C165567td.A0e("false", "true");
    public final C184958tH A00;
    public final C184048ro A01;
    public final C184278sB A02;
    public final C184278sB A03;
    public final C184078rr A04;
    public final C184078rr A05;
    public final C184078rr A06;
    public final C184388sM A07;
    public final Long A08;
    public final Long A09;
    public final Long A0A;
    public final Long A0B;
    public final Long A0C;
    public final Long A0D;
    public final Long A0E;
    public final Long A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final List A0R;
    public final C203399nx A0S;
    public final C184818t3 A0T;

    public C185068tS(C203399nx r21) {
        C203399nx r5 = r21;
        String[] A0M2 = C203399nx.A0M(r5, "promotion");
        Class<String> cls = String.class;
        Long A0P2 = C165567td.A0P();
        Long A0Q2 = C165567td.A0Q();
        C203539oF r4 = C203379ns.A00;
        this.A0G = (String) r4.A0Z(r5, cls, A0P2, A0Q2, (Object) null, A0M2, false);
        this.A0H = (String) C203539oF.A07(r5, cls, A0P2, A0Q2, (Object) null, new String[]{"instance_id"}, false);
        this.A0Q = (String) r4.A0Z(r5, cls, A0P2, A0Q2, (Object) null, new String[]{"title", "#elementValue"}, false);
        this.A0P = (String) r4.A0Z(r5, cls, A0P2, A0Q2, (Object) null, new String[]{"text", "#elementValue"}, false);
        this.A0O = (String) r4.A0Z(r5, cls, A0P2, A0Q2, (Object) null, new String[]{"qp_config", "template_name"}, false);
        Class<Long> cls2 = Long.class;
        C203539oF r12 = r4;
        C203399nx r13 = r5;
        Long l = A0P2;
        Long l2 = A0Q2;
        this.A0D = (Long) r12.A0Z(r13, cls2, l, l2, (Object) null, new String[]{"qp_config", "start_time_seconds"}, false);
        this.A09 = (Long) r12.A0Z(r13, cls2, l, l2, (Object) null, new String[]{"qp_config", "end_time_seconds"}, false);
        this.A0F = (Long) r12.A0Z(r13, cls2, l, l2, (Object) null, new String[]{"qp_config", "ttl_seconds"}, false);
        this.A0E = (Long) r12.A0Z(r13, cls2, l, l2, (Object) null, new String[]{"qp_config", "surface_delay_time_seconds"}, false);
        this.A0K = (String) C203539oF.A07(r5, cls, A0P2, A0Q2, (Object) null, new String[]{"qp_config", "experiment_key"}, false);
        this.A0B = (Long) r12.A0Z(r13, cls2, l, l2, (Object) null, new String[]{"qp_config", "max_impressions"}, false);
        this.A0A = (Long) r12.A0Z(r13, cls2, l, l2, (Object) null, new String[]{"qp_config", "impression_cooldown"}, false);
        this.A08 = (Long) r12.A0Z(r13, cls2, l, l2, (Object) null, new String[]{"qp_config", "eligibility_duration_ms"}, false);
        this.A0C = (Long) r12.A0Z(r13, cls2, l, l2, (Object) null, new String[]{"qp_config", "priority"}, false);
        this.A0J = C203379ns.A07(r5, "qp_config", "dismissable", A0V);
        this.A0M = C203379ns.A07(r5, "qp_config", "force_pass", A0X);
        this.A0I = C203379ns.A07(r5, "qp_config", "deterministic", A0U);
        this.A0L = C203379ns.A07(r5, "qp_config", "exposure_holdout", A0W);
        this.A0N = C203379ns.A07(r5, "qp_config", "log_eligibility_waterfall", A0Y);
        this.A01 = (C184048ro) C203379ns.A02(r5, ARS.A00, new String[]{"header"});
        this.A00 = (C184958tH) C203379ns.A02(r5, ARU.A00, new String[]{"image"});
        this.A02 = (C184278sB) C203379ns.A02(r5, ARW.A00, new String[]{"primary_action"});
        this.A03 = (C184278sB) C203379ns.A02(r5, ARX.A00, new String[]{"secondary_action"});
        this.A07 = (C184388sM) C203379ns.A02(r5, ARY.A00, new String[]{"colors"});
        this.A04 = (C184078rr) C203379ns.A02(r5, ARZ.A00, new String[]{"content_attributes"});
        this.A05 = (C184078rr) C203379ns.A02(r5, C21582ARa.A00, new String[]{"qp_config", "filter_rules"});
        this.A06 = (C184078rr) C203379ns.A02(r5, C21583ARb.A00, new String[]{"qp_config", "instance_log_data"});
        this.A0T = (C184818t3) C203379ns.A02(r5, C21584ARc.A00, new String[]{"qp_config", "pacing"});
        ART art = ART.A00;
        AnonymousClass00C.A0D(r5, 0);
        this.A0R = C203539oF.A09(r5, art, new String[]{"qp_config", "triggers", "trigger"}, 1, 50);
        this.A0S = (C203399nx) C203539oF.A09(r5, ARV.A00, C165607th.A1b(r5, this, "qp_config"), 1, 1).get(0);
    }
}
