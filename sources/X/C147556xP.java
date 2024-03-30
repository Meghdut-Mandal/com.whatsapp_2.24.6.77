package X;

import android.content.SharedPreferences;
import java.util.Map;

/* renamed from: X.6xP  reason: invalid class name and case insensitive filesystem */
public final class C147556xP implements C161317mY {
    public final C24261Bt A00;
    public final AnonymousClass1XW A01;

    public void BRG(String str) {
        AnonymousClass00C.A0D(str, 0);
        C36341k9.A0x(C36351kA.A0A(this.A00.A01), "pref_avatar_art_revision", str);
    }

    public void BRg(String str) {
        SharedPreferences.Editor remove;
        String str2;
        AnonymousClass00T r1 = this.A00.A01;
        boolean A1U = C36371kC.A1U(C36411kG.A0E(r1), "pref_avatar_user_local_deletion");
        SharedPreferences.Editor remove2 = C36351kA.A0A(r1).remove("pref_has_avatar_config").remove("pref_has_dismissed_sticker_upsell").remove("pref_avatar_profile_photo_poses");
        if (A1U) {
            remove = A00(remove2, "pref_avatar_sticker_onboarding_shown").remove("pref_avatar_sticker_search_dictionary_country_code");
            str2 = "pref_key_avatar_soc_warning_shown";
        } else {
            remove = A00(remove2.remove("pref_avatar_sticker_onboarding_shown"), "pref_avatar_user_local_deletion").remove("pref_key_avatar_soc_warning_shown");
            str2 = "pref_avatar_sticker_search_dictionary_country_code";
        }
        C36341k9.A0u(remove, str2);
    }

    public void BRh() {
        AnonymousClass00T r2 = this.A00.A01;
        if (C36371kC.A1U(C36411kG.A0E(r2), "pref_avatar_user_local_deletion")) {
            this.A01.A01();
            C36341k9.A0u(C36351kA.A0A(r2), "pref_avatar_user_local_deletion");
        }
    }

    public void BRi(String str) {
        if (AnonymousClass00C.A0J(str, "will_delete")) {
            C36331k8.A0w(C36351kA.A0A(this.A00.A01), "pref_avatar_user_local_deletion", true);
        }
    }

    public void BRj(String str, Map map) {
        C24261Bt r0;
        boolean z;
        if (AnonymousClass00C.A0J(str, "notice_screen_shown")) {
            r0 = this.A00;
            z = false;
        } else if (AnonymousClass00C.A0J(str, "user_confirmation_success")) {
            r0 = this.A00;
            z = true;
        } else {
            return;
        }
        C36331k8.A0w(C36351kA.A0A(r0.A01), "pref_avatar_notice_consent_accepted", z);
    }

    public void BRk(boolean z, boolean z2) {
        AnonymousClass00T r3 = this.A00.A01;
        C36331k8.A0w(C36351kA.A0A(r3), "pref_has_avatar_config", true);
        C36341k9.A0x(C36351kA.A0A(r3), "pref_avatar_profile_photo_poses", (String) null);
        C36341k9.A0x(C36351kA.A0A(r3), "pref_avatar_preview_cache_url", (String) null);
    }

    public C147556xP(C24261Bt r1, AnonymousClass1XW r2) {
        C36321k7.A0x(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public static SharedPreferences.Editor A00(SharedPreferences.Editor editor, String str) {
        return editor.remove(str).remove("pref_avatar_user_remote_deletion").remove("pref_avatar_notice_consent_accepted").remove("pref_avatar_preview_cache_url").remove("pref_avatar_art_revision").remove("pref_avatar_sticker_search_dictionary_revision").remove("pref_avatar_sticker_search_dictionary_state").remove("pref_avatar_sticker_search_dictionary_filters");
    }
}
