package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.6pD  reason: invalid class name and case insensitive filesystem */
public final class C142646pD implements AnonymousClass7fS {
    public Integer A00;
    public String A01;
    public final C21010yW A02;

    public C142646pD(C21010yW r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A02 = r2;
    }

    public final void A01(Boolean bool, Boolean bool2, Boolean bool3, Integer num, String str, String str2, String str3, int i, int i2, long j) {
        if (num != null) {
            LinkedHashMap A1G = C36431kI.A1G();
            if (str != null) {
                AnonymousClass011[] r2 = new AnonymousClass011[2];
                C36341k9.A1J("length", Long.valueOf((long) str.length()), r2, 0);
                int i3 = 0;
                if (C36371kC.A0y(str).length() != 0) {
                    i3 = C90504aG.A0v(C36371kC.A0y(str), "\\s+", 0).toArray(new String[0]).length;
                }
                C36341k9.A1J("words", Integer.valueOf(i3), r2, 1);
                A1G.put("query", C000400e.A08(r2));
            }
            LinkedHashMap A1G2 = C36431kI.A1G();
            A1G2.put("endpoint", str2);
            A1G2.put("api_biz_count", C90514aH.A0l("local_biz_count", num, A1G2, i));
            A1G2.put("sub_categories", Long.valueOf(j));
            if (!A1G2.isEmpty()) {
                A1G.put("result", A1G2);
            }
            LinkedHashMap A1G3 = C36431kI.A1G();
            if (bool2 != null) {
                A1G3.put("has_catalog", Boolean.valueOf(bool2.booleanValue()));
            }
            if (bool != null) {
                A1G3.put("distance", Boolean.valueOf(bool.booleanValue()));
            }
            if (bool3 != null) {
                A1G3.put("open_now", Boolean.valueOf(bool3.booleanValue()));
            }
            String str4 = str3;
            if (str3 != null) {
                A1G3.put("categories", str4);
            }
            if (!A1G3.isEmpty()) {
                A1G.put("filters", A1G3);
            }
            A08(Integer.valueOf(i2), 2, A1G, 2, 4, 2);
        }
    }

    public final void A04(Integer num, int i, int i2) {
        A08(num, (Integer) null, (Map) null, i, i2, 0);
    }

    public final void A06(Integer num, Integer num2, int i) {
        A08(num2, num, (Map) null, 0, i, 1);
    }

    public void BOk(Map map, int i, int i2) {
        A08((Integer) null, (Integer) null, map, i, i2, 3);
    }

    public final void A00(Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2, String str, String str2, String str3, List list, float f, int i, int i2, int i3, int i4, int i5) {
        String str4 = str3;
        AnonymousClass00C.A0D(str4, 6);
        LinkedHashMap A1G = C36431kI.A1G();
        LinkedHashMap A1G2 = C36431kI.A1G();
        A1G2.put("zoom_level", Float.valueOf(f));
        A1G2.put("endpoint", "businesses");
        if (str != null) {
            A1G2.put("search_category_id", str);
        }
        if (num != null) {
            A1G2.put("biz_loaded_count", num);
        }
        if (num2 != null) {
            A1G2.put("biz_selected_count", num2);
        }
        C90474aD.A1E("map_view_config_version", str4, A1G2, i2, i);
        List list2 = list;
        if (list != null) {
            A1G2.put("segment_biz_count", list2);
        }
        if (!A1G2.isEmpty()) {
            A1G.put("result", A1G2);
        }
        LinkedHashMap A1G3 = C36431kI.A1G();
        if (bool3 != null) {
            A1G3.put("has_catalog", Boolean.valueOf(bool3.booleanValue()));
        }
        if (bool2 != null) {
            A1G3.put("distance", Boolean.valueOf(bool2.booleanValue()));
        }
        if (bool != null) {
            A1G3.put("open_now", Boolean.valueOf(bool.booleanValue()));
        }
        String str5 = str2;
        if (str2 != null) {
            A1G3.put("categories", str5);
        }
        if (!A1G3.isEmpty()) {
            A1G.put("filters", A1G3);
        }
        int i6 = i5;
        A08(Integer.valueOf(i3), Integer.valueOf(i6), A1G, i6, i4, 2);
    }

    public final void A08(Integer num, Integer num2, Map map, int i, int i2, int i3) {
        AnonymousClass593 r2 = new AnonymousClass593();
        r2.A0S = this.A01;
        r2.A0A = this.A00;
        r2.A09 = num;
        r2.A04 = Integer.valueOf(i3);
        r2.A02 = Integer.valueOf(i2);
        r2.A03 = Integer.valueOf(i);
        r2.A01 = num2;
        if (map != null && (!map.isEmpty())) {
            r2.A0N = C90504aG.A0n(map);
        }
        r2.A05 = C36381kD.A0m();
        r2.A0H = 2L;
        this.A02.Bly(r2);
    }

    public final void A02(Boolean bool, Integer num, String str, int i) {
        LinkedHashMap A1G = C36431kI.A1G();
        if (bool != null) {
            A1G.put("is_enabled", bool);
        }
        if (str != null) {
            A1G.put("categories", str);
        }
        A08(num, 2, A1G, 2, i, 1);
    }

    public final void A03(Boolean bool, Integer num, String str, int i) {
        LinkedHashMap A1G = C36431kI.A1G();
        if (bool != null) {
            A1G.put("is_enabled", bool);
        }
        if (str != null) {
            A1G.put("categories", str);
        }
        A08(num, 11, A1G, 11, i, 1);
    }

    public final void A05(Integer num, int i, int i2, boolean z) {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put("ranked_position", C90514aH.A0l("local_biz_count", Integer.valueOf(i2), A1G, i));
        A1G.put("is_business_profile_loaded", Boolean.valueOf(z));
        A08(num, (Integer) null, A1G, 11, 70, 2);
    }

    public final void A07(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i, int i2, int i3) {
        String obj;
        String obj2;
        String obj3;
        String obj4;
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put("position", Integer.valueOf(i3));
        if (!(num3 == null || (obj4 = num3.toString()) == null)) {
            A1G.put("click_location", obj4);
        }
        if (!(num4 == null || (obj3 = num4.toString()) == null)) {
            A1G.put("catalog_preview_status", obj3);
        }
        if (!(num5 == null || (obj2 = num5.toString()) == null)) {
            A1G.put("fbig_preview_status", obj2);
        }
        if (!(num6 == null || (obj = num6.toString()) == null)) {
            A1G.put("description_preview_status", obj);
        }
        A08(num, num2, A1G, i2, i, 1);
    }

    public final void A09(Integer num, boolean z) {
        LinkedHashMap A1G = C36431kI.A1G();
        A08(num, C36331k8.A0K("from_keyboard", Boolean.valueOf(z), A1G), A1G, 1, 15, 1);
    }
}
