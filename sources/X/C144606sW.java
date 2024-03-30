package X;

import android.content.SharedPreferences;

/* renamed from: X.6sW  reason: invalid class name and case insensitive filesystem */
public final class C144606sW implements C30631aW {
    public final C21100yf A00;

    public C144606sW(C21100yf r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public /* synthetic */ void BV3() {
    }

    public void BV2() {
        SharedPreferences.Editor edit = this.A00.A00.edit();
        edit.remove("multi_share_file_preview");
        edit.remove("storage_migration_enabled");
        edit.remove("community_nux");
        edit.remove("about_community_nux");
        edit.remove("privatestats_upload_jitter_secs");
        edit.remove("group_call_callee_ring_duration");
        edit.remove("group_call_max_participants");
        edit.remove("linked_devices_ui_enabled");
        edit.remove("linked_devices_title_enabled");
        edit.remove("linked_devices_max_count");
        edit.apply();
    }
}
