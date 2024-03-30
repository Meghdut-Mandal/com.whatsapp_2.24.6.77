package X;

import java.util.Collections;
import java.util.List;
import org.json.JSONException;

/* renamed from: X.5lx  reason: invalid class name and case insensitive filesystem */
public final class C117255lx {
    public final List A00;

    public C117255lx() {
        try {
            C121605tP[] r18 = new C121605tP[7];
            C121595tO[] r7 = new C121595tO[2];
            r7[0] = new C121595tO(A00(5920, true), 5000, "test");
            r18[0] = new C121605tP(new C145636uH("platform", C36371kC.A11("android")), "reg_phone_number_update_colors_prod_universe", C36371kC.A11(new C123285wF(new C145626uG(new C145636uH("release_channel", C36371kC.A11("release")), new C145636uH(9, "app_version", "2.23.21.3")), "reg_phone_number_update_colors_prod_experiment", C36341k9.A0m(new C121595tO(A00(5920, (Object) null), 5000, "control"), r7, 1), 1696921200, 1735632000)));
            C121595tO[] r8 = new C121595tO[2];
            r8[0] = new C121595tO(A00(7519, true), 5000, "control");
            r18[1] = new C121605tP(new C145626uG(new C145636uH("platform", C36381kD.A13("android", "smba")), new C145636uH("release_channel", C90494aF.A0j(new String[]{"alpha", "beta", "release"}))), "android_confluence_tos_pp_link_update_universe", C36371kC.A11(new C123285wF(new C145636uH(7, "app_version", "2.24.4.21"), "android_confluence_tos_pp_link_update_exp", C36341k9.A0m(new C121595tO(A00(7519, true), 5000, "test"), r8, 1), 1708102800, 1722441600)));
            C121595tO[] r12 = new C121595tO[2];
            r12[0] = new C121595tO(A00(7228, (Object) null), 5000, "control");
            r18[2] = new C121605tP(new C145626uG(new C145636uH("release_channel", C36381kD.A13("alpha", "beta")), new C145636uH(4, "platform", "android")), "android_test_quebec_tos_reg_universe", C36371kC.A11(new C123285wF(new C145636uH(7, "app_version", "2.24.4.18"), "android_test_ca_tos_reg_experiment", C36341k9.A0m(new C121595tO(A00(7228, true), 5000, "test"), r12, 1), 1707897600, 1708934400)));
            C121595tO[] r82 = new C121595tO[2];
            r82[0] = new C121595tO(A00(7228, (Object) null), 5000, "control");
            r18[3] = new C121605tP(new C145626uG(new C145636uH(4, "platform", "android"), new C145636uH(4, "release_channel", "release")), "android_rollout_quebec_tos_reg_universe", C36371kC.A11(new C123285wF(new C145636uH(7, "app_version", "2.24.4.18"), "android_rollout_ca_tos_reg_experiment", C36341k9.A0m(new C121595tO(A00(7228, true), 5000, "test"), r82, 1), 1709258400, 1712818800)));
            C121595tO[] r122 = new C121595tO[2];
            AnonymousClass5q9[] r11 = new AnonymousClass5q9[4];
            r11[0] = new AnonymousClass5q9(true, 5767);
            r11[1] = new AnonymousClass5q9(true, 5987);
            r11[2] = new AnonymousClass5q9("{\"client_cache\":[\"wa_android_waffle\"],\"access_library\":[\"wa_android_wfs_native_auth\"]}", 6025);
            r122[0] = new C121595tO(C36341k9.A0m(new AnonymousClass5q9(C36401kF.A0j(), 6982), r11, 3), 9999, "test");
            AnonymousClass5q9[] A01 = A01(false);
            A01[2] = new AnonymousClass5q9("{}", 6025);
            r18[4] = new C121605tP(new C145636uH("platform", C36371kC.A11("android")), "wfs_offline_cache_beta_universe", C36371kC.A11(new C123285wF(new C145626uG(new C145636uH("release_channel", C36371kC.A11("beta")), new C145636uH(9, "app_version", "2.23.25.23")), "wfs_offline_cache_beta_experiment", C36341k9.A0m(new C121595tO(C36341k9.A0m(new AnonymousClass5q9(60, 6982), A01, 3), 1, "control"), r122, 1), 1701417600, 1735632000)));
            C123285wF[] r16 = new C123285wF[2];
            C121595tO[] r123 = new C121595tO[2];
            AnonymousClass5q9[] r13 = new AnonymousClass5q9[4];
            r13[0] = new AnonymousClass5q9(true, 5767);
            r13[1] = new AnonymousClass5q9((Object) null, 5987);
            r13[2] = new AnonymousClass5q9("{\"client_cache\":[\"wa_android_waffle\"],\"access_library\":[\"wa_android_wfs_native_auth\"]}", 6025);
            Integer A0p = C36371kC.A0p();
            r123[0] = new C121595tO(C36341k9.A0m(new AnonymousClass5q9(A0p, 6982), r13, 3), 1000, "test_fb");
            AnonymousClass5q9[] A012 = A01(false);
            A012[2] = new AnonymousClass5q9("{}", 6025);
            r16[0] = new C123285wF(new C145626uG(new C145636uH("release_channel", C36371kC.A11("release")), new C145636uH(9, "app_version", "2.24.3.1")), "wfs_offline_cache_prod_fbonly_low_timeout", C36341k9.A0m(new C121595tO(C36341k9.A0m(new AnonymousClass5q9(60, 6982), A012, 3), 1000, "control"), r123, 1), 1706860800, 1710270000);
            C121595tO[] r83 = new C121595tO[2];
            AnonymousClass5q9[] A013 = A01(true);
            A013[2] = new AnonymousClass5q9("{\"client_cache\":[\"wa_android_waffle\"],\"access_library\":[\"wa_android_wfs_native_auth\"]}", 6025);
            r83[0] = new C121595tO(C36341k9.A0m(new AnonymousClass5q9(A0p, 6982), A013, 3), 100, "test_fb_ig");
            AnonymousClass5q9[] A014 = A01(false);
            A014[2] = new AnonymousClass5q9("{}", 6025);
            r18[5] = new C121605tP(new C145636uH("platform", C36371kC.A11("android")), "wfs_offline_cache_prod_universe", C36341k9.A0m(new C123285wF(new C145626uG(new C145636uH("release_channel", C36371kC.A11("release")), new C145636uH(9, "app_version", "2.24.3.1")), "wfs_offline_cache_prod_fbig_low_timeout", C36341k9.A0m(new C121595tO(C36341k9.A0m(new AnonymousClass5q9(60, 6982), A014, 3), 100, "control"), r83, 1), 1708588800, 1735632000), r16, 1));
            C121595tO[] r6 = new C121595tO[2];
            r6[0] = new C121595tO(A00(1957, (Object) null), 5000, "test");
            this.A00 = C36341k9.A0m(new C121605tP(new C145636uH("platform", C36371kC.A11("android")), "dummy_aa_prod_universe", C36371kC.A11(new C123285wF(new C145626uG(new C145636uH("release_channel", C36381kD.A13("beta", "release")), new C145636uH(9, "app_version", "2.24.3.24")), "dummy_aa_prod_experiment", C36341k9.A0m(new C121595tO(A00(1957, (Object) null), 5000, "control"), r6, 1), 1706601600, 1735632000))), r18, 6);
        } catch (JSONException e) {
            StringBuilder A0u = AnonymousClass000.A0u();
            C36341k9.A1O(A0u, C90494aF.A0c(e, "ABConfig/invalid json format for ab property from code gen:", A0u));
            StringBuilder A0v = AnonymousClass000.A0v("ABConfig/invalid json format for ab property from code gen:");
            C36351kA.A1K(e, A0v);
            throw C90514aH.A0s(A0v.toString());
        }
    }

    public static List A00(int i, Object obj) {
        List singletonList = Collections.singletonList(new AnonymousClass5q9(obj, i));
        AnonymousClass00C.A08(singletonList);
        return singletonList;
    }

    public static AnonymousClass5q9[] A01(Object obj) {
        AnonymousClass5q9[] r2 = new AnonymousClass5q9[4];
        r2[0] = new AnonymousClass5q9(obj, 5767);
        r2[1] = new AnonymousClass5q9(obj, 5987);
        return r2;
    }
}
