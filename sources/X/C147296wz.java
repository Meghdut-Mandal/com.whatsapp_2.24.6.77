package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.wabloks.base.BkFcsPreloadingScreenFragment;
import com.whatsapp.wabloks.ui.WaFcsBottomSheetModalActivity;
import com.whatsapp.wabloks.ui.WaFcsModalActivity;
import com.whatsapp.wabloks.ui.WaFcsPreloadedBloksActivity;
import java.util.Map;

/* renamed from: X.6wz  reason: invalid class name and case insensitive filesystem */
public final class C147296wz implements C160467l3 {
    public AnonymousClass011 A00;
    public final C130996Nh A01;
    public final C19630wG A02;
    public final AnonymousClass6D3 A03;

    public AnonymousClass02E BEK(String str, String str2, String str3, Map map, Map map2, int i) {
        String str4;
        String str5 = str;
        AnonymousClass00C.A0D(str, 0);
        String str6 = str3;
        C36321k7.A17(map, str3, map2, 2);
        Object obj = map.get("app_id");
        if (!(obj instanceof String) || (str4 = (String) obj) == null) {
            throw AnonymousClass001.A08("FcsScreenOpenerBloksDelegate: app_id is not present");
        }
        AnonymousClass011 r0 = this.A00;
        if (r0 != null) {
            String A0n = C90504aG.A0n(map2);
            return BkFcsPreloadingScreenFragment.A00(this.A03.A02.A00(str3), str4, str5, (String) r0.first, (String) r0.second, A0n, C130996Nh.A00(Integer.valueOf(i)), str6, str2);
        }
        throw C36331k8.A0d("dataModuleNamespaceData");
    }

    public static Intent A00(Intent intent, String str, String str2, String str3, String str4) {
        return intent.putExtra("fds_on_back", str).putExtra("fds_on_back_params", str2).putExtra("fds_button_style", str3).putExtra("fds_state_name", str4);
    }

    public void B1y(boolean z) {
        String str;
        Context context = this.A02.A00;
        Intent A0D = C36431kI.A0D();
        String packageName = context.getPackageName();
        if (z) {
            str = "com.whatsapp.wabloks.ui.WaFcsModalActivity";
        } else {
            str = "com.whatsapp.wabloks.ui.WaFcsBottomSheetModalActivity";
        }
        A0D.setClassName(packageName, str);
        A0D.setFlags(872415232);
        context.startActivity(A0D);
    }

    public void Bku(String str, String str2, String str3, String str4, String str5, String str6, Map map, Map map2, int i) {
        String str7;
        Object obj = map.get("app_id");
        if (!(obj instanceof String) || (str7 = (String) obj) == null) {
            throw AnonymousClass001.A08("FcsScreenOpenerBloksDelegate: app_id is not present");
        }
        Context context = this.A02.A00;
        AnonymousClass00C.A08(context);
        AnonymousClass011 r0 = this.A00;
        if (r0 != null) {
            String A0n = C90504aG.A0n(map2);
            C90494aF.A0r(context, A00(C36441kJ.A0H(context, WaFcsPreloadedBloksActivity.class).putExtra("screen_name", str7).putExtra("data_module_job_id", (String) r0.first).putExtra("data_module_namespace", (String) r0.second).putExtra("fds_manager_id", str6).putExtra("screen_params", A0n), str, str2, str3, str4).putExtra("fds_observer_id", str5).putExtra("qpl_param_map", C130996Nh.A00(Integer.valueOf(i))).putExtra("screen_cache_config", this.A03.A02.A00(str6)));
            return;
        }
        throw C36331k8.A0d("dataModuleNamespaceData");
    }

    public void Bl6(C108015Rv r8, String str, String str2, String str3, String str4, String str5, String str6, Map map, Map map2, int i, int i2, boolean z) {
        String str7;
        Intent putExtra;
        Object obj = map.get("app_id");
        if (!(obj instanceof String) || (str7 = (String) obj) == null) {
            throw AnonymousClass001.A08("FcsScreenOpenerBloksDelegate: app_id is not present");
        }
        Context context = this.A02.A00;
        AnonymousClass00C.A08(context);
        if (r8 == C108015Rv.BOTTOM_SHEET) {
            putExtra = A00(C36441kJ.A0H(context, WaFcsBottomSheetModalActivity.class).putExtra("screen_params", C90504aG.A0n(map2)).putExtra("fds_observer_id", str5), str, str2, str3, str4).putExtra("fcs_bottom_sheet_max_height_percentage", i2).putExtra("fcs_show_divider_under_nav_bar", z);
            AnonymousClass00C.A08(putExtra);
        } else {
            String A0n = C90504aG.A0n(map2);
            C134906bn A002 = this.A03.A02.A00(str6);
            putExtra = A00(C90494aF.A0D(context, A002, WaFcsModalActivity.class, str7, A0n).putExtra("fds_observer_id", str5), str, str2, str3, str4).putExtra("qpl_param_map", C130996Nh.A00(Integer.valueOf(i)));
        }
        putExtra.setFlags(268435456);
        context.startActivity(putExtra);
    }

    public C147296wz(C130996Nh r1, C19630wG r2, AnonymousClass6D3 r3) {
        C36321k7.A0x(r2, r1);
        this.A02 = r2;
        this.A01 = r1;
        this.A03 = r3;
    }
}
