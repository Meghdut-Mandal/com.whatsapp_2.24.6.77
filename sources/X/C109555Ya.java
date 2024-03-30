package X;

import android.util.Pair;

/* renamed from: X.5Ya  reason: invalid class name and case insensitive filesystem */
public abstract class C109555Ya {
    public static Pair A00(int i) {
        int i2;
        String str;
        switch (i) {
            case 100:
            case 104:
            case 110:
                i2 = 2;
                break;
            case 101:
            case 103:
            case 105:
            case 106:
            case 107:
            case C65953Uc.A03:
            case 109:
                i2 = 3;
                break;
            case 102:
                i2 = 1;
                break;
            case 111:
                i2 = 5;
                break;
            default:
                i2 = 0;
                break;
        }
        Integer valueOf = Integer.valueOf(i2);
        switch (i) {
            case 100:
                str = "cask_testing__config_basic_files";
                break;
            case 101:
                str = "cask_testing__config_basic_caches";
                break;
            case 102:
                str = "cask_testing__config_basic_root";
                break;
            case 103:
                str = "cask_testing__config_version_cache";
                break;
            case 104:
                str = "cask_testing__config_version_files_with_default";
                break;
            case 105:
                str = "wa_stash_example";
                break;
            case 106:
                str = "wa_effect_asset_disk_cache";
                break;
            case 107:
                str = "wa_face_tracking_asset_disk_cache";
                break;
            case C65953Uc.A03:
                str = "wa_multi_model_asset_disk_cache";
                break;
            case 109:
                str = "wa_scripting_asset_disk_cache";
                break;
            case 110:
                str = "wa_cask_ard_temp_store";
                break;
            case 111:
                str = "gif/gif_preview_cache";
                break;
            default:
                str = null;
                break;
        }
        return C36441kJ.A0Q(valueOf, str);
    }
}
