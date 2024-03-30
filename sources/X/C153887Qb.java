package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.7Qb  reason: invalid class name and case insensitive filesystem */
public final class C153887Qb extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass5QL $rootNode;
    public final /* synthetic */ AnonymousClass00S $stopLoggingCallback;
    public final /* synthetic */ C124045xV this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C153887Qb(C124045xV r2, AnonymousClass5QL r3, AnonymousClass00S r4) {
        super(0);
        this.this$0 = r2;
        this.$rootNode = r3;
        this.$stopLoggingCallback = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        r6 = r0.getId();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final org.json.JSONObject A00(X.AnonymousClass6NN r9) {
        /*
            r7 = 0
            X.AnonymousClass00C.A0D(r9, r7)
            org.json.JSONObject r4 = X.C36441kJ.A1B()
            java.lang.Object r2 = r9.A03
            boolean r8 = r2 instanceof android.view.View
            r6 = 0
            if (r8 == 0) goto L_0x001b
            r1 = r2
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x001b
            r0 = 2131435180(0x7f0b1eac, float:1.8492195E38)
            java.lang.Object r6 = r1.getTag(r0)
        L_0x001b:
            java.lang.Class r0 = r9.getClass()
            java.lang.String r1 = r0.getCanonicalName()
            java.lang.String r0 = "node_class"
            r4.put(r0, r1)
            r3 = 1
            if (r6 != 0) goto L_0x003f
            java.lang.Class r1 = r2.getClass()
            java.lang.String r0 = r1.getCanonicalName()
            if (r0 == 0) goto L_0x0102
            boolean r0 = X.AnonymousClass098.A06(r0)
            if (r0 != 0) goto L_0x0102
            java.lang.String r6 = r1.getCanonicalName()
        L_0x003f:
            java.lang.String r5 = "class"
            r4.put(r5, r6)
            if (r8 == 0) goto L_0x006b
            r0 = r2
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x006b
            int r6 = r0.getId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            if (r1 == 0) goto L_0x006b
            r0 = -1
            if (r6 == r0) goto L_0x006b
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Object[] r1 = X.C90524aI.A0x(r1, r0, r7, r3)
            java.lang.String r0 = "0x%08x"
            java.lang.String r1 = X.C90494aF.A0e(r6, r0, r1)
            java.lang.String r0 = "view_id"
            r4.put(r0, r1)
        L_0x006b:
            X.5Rk r0 = r9.A00
            java.lang.String r1 = r0.name()
            java.lang.String r0 = "ui_type"
            r4.put(r0, r1)
            boolean r0 = r9 instanceof X.AnonymousClass5QN
            if (r0 == 0) goto L_0x00d6
            java.lang.Class r1 = r2.getClass()
            java.lang.Class<android.view.View> r0 = android.view.View.class
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x009b
            r1 = r2
            android.view.View r1 = (android.view.View) r1
            android.graphics.drawable.Drawable r0 = r1.getBackground()
            if (r0 != 0) goto L_0x009b
            boolean r0 = X.C19550w8.A01()
            if (r0 == 0) goto L_0x0100
            android.graphics.drawable.Drawable r0 = r1.getForeground()
            if (r0 == 0) goto L_0x0100
        L_0x009b:
            X.00T r0 = r9.A05
            boolean r6 = X.C36331k8.A1b(r0)
        L_0x00a1:
            android.view.View r2 = (android.view.View) r2
            X.AnonymousClass00C.A0D(r2, r7)
            int[] r0 = X.AnonymousClass6NN.A08
            r2.getLocationOnScreen(r0)
            android.graphics.Rect r2 = X.C90474aD.A0I(r2)
            r1 = r0[r7]
            r0 = r0[r3]
            r2.offsetTo(r1, r0)
            X.6An r3 = new X.6An
            r3.<init>(r2, r6)
            org.json.JSONObject r2 = X.C36441kJ.A1B()
            boolean r1 = r3.A01
            java.lang.String r0 = "is_visible"
            r2.put(r0, r1)
            android.graphics.Rect r0 = r3.A00
            java.lang.String r1 = r0.flattenToString()
            java.lang.String r0 = "bounds_on_screen"
            r2.put(r0, r1)
            java.lang.String r0 = "leaf_data"
            r4.put(r0, r2)
        L_0x00d6:
            java.util.List r1 = r9.A04
            boolean r0 = X.C36401kF.A1a(r1)
            if (r0 == 0) goto L_0x010d
            org.json.JSONArray r3 = X.C90524aI.A0u()
            java.util.Iterator r2 = r1.iterator()
        L_0x00e6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0108
            java.lang.Object r0 = r2.next()
            X.6NN r0 = (X.AnonymousClass6NN) r0
            org.json.JSONObject r1 = A00(r0)
            boolean r0 = r1.has(r5)
            if (r0 == 0) goto L_0x00e6
            r3.put(r1)
            goto L_0x00e6
        L_0x0100:
            r6 = 0
            goto L_0x00a1
        L_0x0102:
            java.lang.String r6 = r1.getName()
            goto L_0x003f
        L_0x0108:
            java.lang.String r0 = "children"
            r4.put(r0, r3)
        L_0x010d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153887Qb.A00(X.6NN):org.json.JSONObject");
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        List list;
        File[] listFiles;
        C124045xV r3 = this.this$0;
        C130856Mr r2 = r3.A04;
        AnonymousClass5QL r4 = this.$rootNode;
        JSONObject A1B = C36441kJ.A1B();
        A1B.put("app_id", AnonymousClass6JD.A0C);
        A1B.put("bundle_id", r3.A01.getPackageName());
        A1B.put("event_count", 1);
        JSONArray A0u = C90524aI.A0u();
        JSONObject A1B2 = C36441kJ.A1B();
        JSONObject A1B3 = C36441kJ.A1B();
        AnonymousClass00C.A0D(r4, 0);
        String jSONObject = A00(r4).toString(0);
        AnonymousClass00C.A08(jSONObject);
        A1B3.put("tree", jSONObject);
        Object obj = r4.A03;
        A1B3.put("client_current_module", AnonymousClass000.A0k(obj));
        A1B3.put("client_sample_rate", C36331k8.A02(r3.A03.A06));
        View view = (View) obj;
        AnonymousClass00C.A0D(view, 0);
        int[] iArr = AnonymousClass6NN.A08;
        view.getLocationOnScreen(iArr);
        Rect A0I = C90474aD.A0I(view);
        A0I.offsetTo(iArr[0], iArr[1]);
        A1B3.put("root_view_bounds_on_screen", A0I.flattenToString());
        A1B3.put("logging_version", 0);
        A1B3.put("buildId", 581200649);
        A1B3.put("pipeline", "whatsapp_android");
        A1B2.put("extra", A1B3);
        A1B2.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "mobile_uitracker_events");
        A1B2.put("sampling_rate", 1);
        A1B2.put("time", ((double) System.currentTimeMillis()) / 1000.0d);
        A0u.put(A1B2);
        A1B.put("data", A0u);
        Objects.requireNonNull("2.24.6.77");
        A1B.put("app_ver", "2.24.6.77");
        A1B.put("session_id", r3.A05.get());
        int i = r3.A00;
        r3.A00 = i + 1;
        A1B.put("seq", i);
        try {
            Context context = r2.A00;
            C36441kJ.A0w(context.getCacheDir(), "wds_metrics").mkdir();
            File A0w = C36441kJ.A0w(context.getCacheDir(), "wds_metrics");
            File A0w2 = C36441kJ.A0w(context.getCacheDir(), "wds_metrics");
            if (!A0w2.exists() || !A0w2.isDirectory() || (listFiles = A0w2.listFiles(AnonymousClass72A.A00)) == null) {
                list = C023409w.A00;
            } else {
                list = AnonymousClass02R.A0D(listFiles);
            }
            int A02 = C36331k8.A02(r2.A01.A04);
            if (list.size() >= A02) {
                Locale locale = Locale.ENGLISH;
                Object[] objArr = new Object[2];
                C36331k8.A1X(objArr, list.size(), 0, A02, 1);
                AnonymousClass00C.A08(String.format(locale, "Max cached logs. allowed=%d, current=%d", Arrays.copyOf(objArr, 2)));
                this.$stopLoggingCallback.invoke();
                return AnonymousClass0AJ.A00;
            }
            Locale locale2 = Locale.ENGLISH;
            Object[] objArr2 = new Object[1];
            AnonymousClass000.A1L(objArr2, list.size(), 0);
            FileWriter fileWriter = new FileWriter(C36441kJ.A0w(A0w, C90494aF.A0e(locale2, "wds_metric_event_%d.json", Arrays.copyOf(objArr2, 1))));
            fileWriter.write(A1B.toString());
            fileWriter.close();
            return AnonymousClass0AJ.A00;
        } catch (Exception e) {
            AnonymousClass00C.A08(String.format(Locale.ENGLISH, "Failed to cache hierarchy event", C90524aI.A0x(e, new Object[1], 0, 1)));
        }
    }
}
