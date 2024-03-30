package X;

import android.content.SharedPreferences;

/* renamed from: X.1eB  reason: invalid class name and case insensitive filesystem */
public class C32781eB {
    public SharedPreferences A00;
    public final C19890wg A01;

    public static String A00(int i) {
        if (i == 0) {
            return "golden_box_contact";
        }
        switch (i) {
            case 2:
                return "golden_box_broadcast";
            case 3:
                return "info_screen_contact";
            case 4:
                return "info_screen_group";
            case 5:
                return "info_screen_broadcast";
            case 6:
                return "calls_list";
            case 7:
                return "chats_list";
            case 8:
                return "status_list";
            case 9:
                return "linked_devices";
            case 10:
                return "calling_screen_audio";
            case 11:
                return "calling_screen_video";
            default:
                return "golden_box_group";
        }
    }

    public String A01(int i) {
        SharedPreferences sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A01.A00("privacy_highlight");
            this.A00 = sharedPreferences;
        }
        String string = sharedPreferences.getString(A00(i), "0,0,0");
        if (string != null) {
            return string;
        }
        return "0,0,0";
    }

    public C32781eB(C19890wg r1) {
        this.A01 = r1;
    }
}
