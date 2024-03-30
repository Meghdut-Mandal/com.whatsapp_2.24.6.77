package X;

import com.whatsapp.R;
import com.whatsapp.util.Log;
import com.whatsapp.wabloks.ui.WaBloksBottomSheetActivity;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.714  reason: invalid class name */
public final class AnonymousClass714 implements C158697hv {
    public final /* synthetic */ WaBloksBottomSheetActivity A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ WeakReference A03;

    public AnonymousClass714(WaBloksBottomSheetActivity waBloksBottomSheetActivity, String str, String str2, WeakReference weakReference) {
        this.A03 = weakReference;
        this.A00 = waBloksBottomSheetActivity;
        this.A01 = str;
        this.A02 = str2;
    }

    public void BU1(C111855cx r18) {
        String A0o;
        C111855cx r6 = r18;
        C225314u r1 = (C225314u) this.A03.get();
        if (r1 != null && !r1.isDestroyed() && !r1.isFinishing()) {
            r1.Bnv();
        }
        if (!(r6 instanceof C107345Ns)) {
            WaBloksBottomSheetActivity waBloksBottomSheetActivity = this.A00;
            String str = null;
            waBloksBottomSheetActivity.Btr((Integer) null, Integer.valueOf(R.string.f12nameremoved), (Integer) null, (Integer) null, (Integer) null, "error_dialog", (String) null, (List) null);
            C33761ft r5 = waBloksBottomSheetActivity.A00;
            if (r5 != null) {
                String str2 = this.A01;
                String str3 = this.A02;
                if (r6.equals(C107335Nr.A00)) {
                    A0o = "activity_no_longer_active";
                } else if (r6.equals(C107345Ns.A00)) {
                    A0o = "success";
                } else if (r6 instanceof C107315Np) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("bk_layout_data_error_");
                    A0o = AnonymousClass000.A0o(((C107315Np) r6).A00.A02, A0u);
                } else if (r6 instanceof C107325Nq) {
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("unknown_error_");
                    A0o = AnonymousClass000.A0o(((C107325Nq) r6).A00, A0u2);
                } else {
                    throw C36441kJ.A18();
                }
                AnonymousClass00C.A0D(A0o, 2);
                if (str2 != null && AnonymousClass098.A07(str2, "com.bloks.www.cxthelp", false)) {
                    if (!(str3 == null || str3.length() == 0)) {
                        try {
                            JSONObject A1C = C36441kJ.A1C(str3);
                            if (A1C.has("params")) {
                                JSONObject jSONObject = A1C.getJSONObject("params");
                                if (jSONObject.has("server_params")) {
                                    JSONObject jSONObject2 = jSONObject.getJSONObject("server_params");
                                    AnonymousClass00C.A0B(jSONObject2);
                                    AnonymousClass00C.A0D(jSONObject2, 0);
                                    str = C63893Lv.A00("entrypointid", jSONObject2, false);
                                }
                            }
                        } catch (JSONException e) {
                            Log.e("SupportLogger/getEntryPointId", e);
                        }
                    }
                    C45582Rx r12 = new C45582Rx();
                    r12.A01 = 5;
                    r12.A02 = str2;
                    r12.A05 = A0o;
                    if (str != null) {
                        r12.A03 = str;
                    }
                    r5.A00.Blv(r12);
                }
                Log.w("WaBloksBottomSheetActivity - failed to launch via Bloks async action");
                return;
            }
            throw C36331k8.A0d("supportLogging");
        }
    }
}
