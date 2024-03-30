package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.1g0  reason: invalid class name and case insensitive filesystem */
public class C33831g0 implements C33681fl {
    public View A00;
    public final C33571fa A01;
    public final C33671fk A02;
    public final C21100yf A03;

    public void BK9() {
        View view = this.A00;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public boolean Bt0() {
        int i;
        SharedPreferences.Editor putInt;
        C33671fk r3 = this.A02;
        C21100yf r2 = this.A03;
        Context context = this.A01.getContext();
        if (r2.A09(C21100yf.A0t) && context.getPackageManager().getLaunchIntentForPackage("com.whatsapp.w4b") == null) {
            C19420v0 r5 = r3.A00;
            int A002 = AnonymousClass6XI.A00(System.currentTimeMillis(), r5.A0V("biz_app_cross_sell_banner_notif_time") * 1000);
            AnonymousClass005 r4 = r5.A00;
            if (A002 < ((SharedPreferences) r4.get()).getInt("biz_app_cross_sell_banner_expiry_days", 0) && ((SharedPreferences) r4.get()).getInt("biz_app_cross_sell_banner_dismiss_count", 0) < 1 && ((SharedPreferences) r4.get()).getInt("biz_app_cross_sell_banner_click_count", 0) < 1) {
                if (r5.A2V("biz_app_upsell_banner_timestamp", 86400000)) {
                    if (((SharedPreferences) r4.get()).getInt("biz_app_cross_sell_banner_consecutive_days", 0) >= 2) {
                        C19420v0.A00(r5).putInt("biz_app_cross_sell_banner_consecutive_days", 0).apply();
                    } else {
                        if (((SharedPreferences) r4.get()).getInt("biz_app_cross_sell_banner_cool_off_days", 0) >= 5) {
                            putInt = C19420v0.A00(r5).putInt("biz_app_cross_sell_banner_cool_off_days", 0);
                        } else {
                            int i2 = ((SharedPreferences) r4.get()).getInt("biz_app_cross_sell_banner_cool_off_days", 0);
                            if (i2 <= 0 || i2 > 5) {
                                C19420v0.A00(r5).putInt("biz_app_cross_sell_banner_total_days", ((SharedPreferences) r4.get()).getInt("biz_app_cross_sell_banner_total_days", 0) + 1).apply();
                                putInt = C19420v0.A00(r5).putInt("biz_app_cross_sell_banner_consecutive_days", ((SharedPreferences) r4.get()).getInt("biz_app_cross_sell_banner_consecutive_days", 0) + 1);
                            }
                        }
                        putInt.apply();
                        r5.A1Z("biz_app_upsell_banner_timestamp");
                    }
                    putInt = C19420v0.A00(r5).putInt("biz_app_cross_sell_banner_cool_off_days", ((SharedPreferences) r4.get()).getInt("biz_app_cross_sell_banner_cool_off_days", 0) + 1);
                    putInt.apply();
                    r5.A1Z("biz_app_upsell_banner_timestamp");
                }
                if (((SharedPreferences) r4.get()).getInt("biz_app_cross_sell_banner_total_days", 0) >= 4 || ((i = ((SharedPreferences) r4.get()).getInt("biz_app_cross_sell_banner_cool_off_days", 0)) > 0 && i <= 5)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public C33831g0(C33571fa r1, C21100yf r2, C33671fk r3) {
        this.A03 = r2;
        this.A01 = r1;
        this.A02 = r3;
    }

    public void BwS() {
        if (Bt0() && this.A00 == null) {
            C33571fa r3 = this.A01;
            View inflate = LayoutInflater.from(r3.getContext()).inflate(R.layout.f9nameremoved, r3, false);
            this.A00 = inflate;
            r3.addView(inflate);
        }
        View view = this.A00;
        if (view == null) {
            C33571fa r32 = this.A01;
            view = LayoutInflater.from(r32.getContext()).inflate(R.layout.f9nameremoved, r32, false);
            this.A00 = view;
        }
        C33571fa r5 = this.A01;
        ((TextEmojiLabel) C012005e.A02(view, R.id.smb_upsell_chat_banner_description)).A0I(Html.fromHtml(r5.getContext().getString(R.string.f12nameremoved)));
        r5.setBackgroundResource(C224514j.A00(r5.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
        r5.setOnClickListener(new C35161iF((Object) this, 8));
        C012005e.A02(view, R.id.close).setOnClickListener(new C35161iF((Object) this, 9));
        view.setVisibility(0);
        C33671fk.A00(this.A02, 1);
    }
}
