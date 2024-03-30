package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.6Wm  reason: invalid class name and case insensitive filesystem */
public class C133056Wm {
    public final C20810yC A00;
    public final C21470zI A01;
    public final C111895d1 A02;
    public volatile ConcurrentHashMap A03;
    public volatile ConcurrentHashMap A04;

    public static void A01(C133056Wm r4) {
        if (r4.A04 == null || r4.A03 == null) {
            synchronized (r4) {
                if (r4.A04 == null) {
                    r4.A04 = C90524aI.A0s();
                    try {
                        r4.A02(C36441kJ.A1C("{\"action\":[[78315521,1,\"TTRC_LONG_CANCEL\",78315521,[[\"duration\",1]]],[78315522,1,\"TTRC_FAILURE\",78315522,[[\"duration\",1],[\"message\",1]]],[231937006,1,\"TTRC_CHOICE_PREVIEW_IMG\",231937006,[[\"bloks_display_name\",1],[\"category_id\",1],[\"choice_id\",1],[\"session_id\",1]]],[231933580,1,\"TTRC\",231933580,[[\"bloks_display_name\",1],[\"session_id\",1],[\"app_id\",1],[\"end_reason\",1],[\"category_id\",1],[\"ttrc_source\",1],[\"ttrc_source_for_bloks_query\",1],[\"recency_threshold_for_bloks_query\",1],[\"ttrc_tracking_version\",1],[\"cache_and_network_queries\",1],[\"network_only_queries\",1],[\"steps\",1],[\"cds_bottomsheet\",1],[\"ttrc_back_start_on_touch_up\",1],[\"using_backup_start_time\",1],[\"using_capped_backup_start_time\",1],[\"revoked_queries\",1],[\"revoked_steps\",1],[\"ttrc_cache_rendered\",1]]],[914163517,1,\"AVATAR_MARKETPLACE_TABBED_FLOW_OPEN\",914163517,[]],[551491402,1,\"WA_WFL_AL_LOAD_LATENCY\",551491402,[]]]}"));
                        r4.A02(r4.A00.A0A(2620));
                    } catch (Exception e) {
                        r4.A04.clear();
                        r4.A01.B6n(C36331k8.A0i("Couldn't parse bloks config (actions): ", AnonymousClass000.A0u(), e));
                    }
                }
                if (r4.A03 == null) {
                    r4.A03 = C90524aI.A0s();
                    try {
                        r4.A03(C36441kJ.A1C("{\"ttrc\":[[\"com.bloks.www.avatar.editor.cds.launcher\",1,231933580],[\"com.bloks.www.avatar.editor.cds.launcher.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.choice.preview.pagination\",1,231933580],[\"com.bloks.www.avatar.editor.cds.choice.preview.pagination.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.save.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.delete.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.update-main-preview-zoom.async\",1,231933580],[\"com.bloks.www.avatar.editor.exit.log\",1,231933580],[\"com.bloks.www.avatar.editor.exit.log.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.exit.log.setup\",1,231933580],[\"com.bloks.www.avatar.editor.cds.exit.log.setup.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.editor_screen\",1,231933580],[\"com.bloks.www.avatar.editor.cds.editor_screen.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.end_nux_screen\",1,231933580],[\"com.bloks.www.avatar.editor.cds.end_nux_screen.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.skin_tone\",1,231933580],[\"com.bloks.www.avatar.editor.cds.skin_tone.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.skin_tone_new_nav\",1,231933580],[\"com.bloks.www.avatar.editor.cds.deletion_screen\",1,231933580],[\"com.bloks.www.avatar.editor.cds.deletion_screen.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.end_preview_screen\",1,231933580],[\"com.bloks.www.avatar.editor.cds.end_preview_screen.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.preview.fetch.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.save_click.log.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.delegation_launcher\",1,231933580],[\"com.bloks.www.avatar.editor.cds.delegation_launcher.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.screen_delegation.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.editor_new_nav_screen\",1,231933580],[\"com.bloks.www.avatar.editor.cds.new-nav-update-zoom.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.end_preview_screen_new_nav\",1,231933580],[\"com.bloks.www.avatar.editor.cds.presets\",1,231933580],[\"com.bloks.www.avatar.editor.cds.whatsapp.notice\",1,231933580],[\"com.bloks.www.avatar.editor.cds.wa_notice.accept.async\",1,231933580],[\"avatar_editor_new_nav_screen\",1,231933580],[\"com.bloks.www.ctwa.messaging.hub\",1,1029389270]]}"));
                        r4.A03(r4.A00.A0A(2621));
                    } catch (Exception e2) {
                        r4.A03.clear();
                        r4.A01.B6n(C36331k8.A0i("Couldn't parse bloks config (ttrc): ", AnonymousClass000.A0u(), e2));
                    }
                }
            }
        }
    }

    private void A02(JSONObject jSONObject) {
        HashMap hashMap;
        if (this.A04 != null) {
            JSONArray jSONArray = jSONObject.getJSONArray("action");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                int i2 = jSONArray2.getInt(0);
                int i3 = jSONArray2.getInt(1);
                int i4 = 2;
                if (2 != i3) {
                    i4 = 1;
                    if (1 != i3) {
                        i4 = -1;
                    }
                }
                String string = jSONArray2.getString(2);
                int i5 = jSONArray2.getInt(3);
                if (jSONArray2.length() > 4) {
                    HashMap A0J = AnonymousClass001.A0J();
                    JSONArray jSONArray3 = jSONArray2.getJSONArray(4);
                    for (int i6 = 0; i6 < jSONArray3.length(); i6++) {
                        JSONArray jSONArray4 = jSONArray3.getJSONArray(i6);
                        String string2 = jSONArray4.getString(0);
                        int i7 = jSONArray4.getInt(1);
                        int i8 = 2;
                        if (2 != i7) {
                            i8 = 1;
                            if (1 != i7) {
                                i8 = -1;
                            }
                        }
                        C36341k9.A1K(string2, A0J, i8);
                    }
                    hashMap = A0J;
                } else {
                    hashMap = Collections.emptyMap();
                }
                this.A04.put(Integer.valueOf(i2), new C122885va(string, hashMap, i4, i5));
            }
        }
    }

    private void A03(JSONObject jSONObject) {
        int i;
        if (this.A03 != null) {
            JSONArray jSONArray = jSONObject.getJSONArray("ttrc");
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONArray jSONArray2 = jSONArray.getJSONArray(i2);
                String string = jSONArray2.getString(0);
                int i3 = jSONArray2.getInt(1);
                int i4 = 2;
                if (2 != i3) {
                    i4 = 1;
                    if (1 != i3) {
                        i4 = -1;
                    }
                }
                if (jSONArray2.length() > 2) {
                    i = jSONArray2.getInt(2);
                } else {
                    i = 812974081;
                }
                this.A03.put(string, new C120365rO(i4, i));
            }
        }
    }

    public C133056Wm(C20810yC r1, C21470zI r2, C111895d1 r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public static C122885va A00(C133056Wm r6, int i) {
        A01(r6);
        ConcurrentHashMap concurrentHashMap = r6.A04;
        Integer valueOf = Integer.valueOf(i);
        C122885va r4 = (C122885va) concurrentHashMap.get(valueOf);
        if (r4 == null) {
            r4 = (C122885va) C90484aE.A0j(r6.A04, i >> 16);
            if (r4 == null) {
                r4 = new C122885va("na", (Map) null, -1, 812974081);
            }
            r6.A04.put(valueOf, r4);
        }
        return r4;
    }
}
