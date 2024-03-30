package X;

import android.os.Bundle;
import com.whatsapp.permissions.NotificationPermissionBottomSheet;

/* renamed from: X.3FD  reason: invalid class name */
public final class AnonymousClass3FD {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public boolean A09;

    public NotificationPermissionBottomSheet A00() {
        NotificationPermissionBottomSheet notificationPermissionBottomSheet = new NotificationPermissionBottomSheet();
        Bundle A072 = AnonymousClass001.A07();
        A072.putInt("icon_id", this.A00);
        A072.putInt("title_id", this.A08);
        A072.putInt("message_id", this.A07);
        A072.putInt("line1_icon_id", this.A01);
        A072.putInt("line2_icon_id", this.A03);
        A072.putInt("line3_icon_id", this.A05);
        A072.putString("permission_requestor_screen_type", (String) null);
        A072.putStringArray("permissions", (String[]) null);
        A072.putBoolean("is_first_time_request", this.A09);
        A072.putInt("nth_details_id", 0);
        A072.putInt("line1_message_id", this.A02);
        A072.putInt("line2_message_id", this.A04);
        A072.putInt("line3_message_id", this.A06);
        A072.putBoolean("should_disable_cancel_on_outside_click", false);
        A072.putBoolean("should_hide_cancel_button_on_1st_time", false);
        notificationPermissionBottomSheet.A17(A072);
        return notificationPermissionBottomSheet;
    }
}
