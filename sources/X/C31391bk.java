package X;

import android.content.SharedPreferences;
import java.util.Collection;
import java.util.Set;

/* renamed from: X.1bk  reason: invalid class name and case insensitive filesystem */
public class C31391bk {
    public final SharedPreferences A00;
    public final C31401bl A01;
    public final C31411bm A02;
    public final C19970wo A03;
    public final C21010yW A04;
    public final AnonymousClass19A A05;
    public final C31461br A06 = new C31461br();
    public final C31421bn A07 = new C31421bn();
    public final C31441bp A08 = new C31441bp();
    public final C31431bo A09 = new C31431bo();
    public final C31481bt A0A = new C31481bt();
    public final C31471bs A0B = new C31471bs();
    public final C31451bq A0C = new C31451bq();

    public AnonymousClass9OY A00(C16540pP r33, Integer num, Integer num2, Set set) {
        C31411bm r4 = this.A02;
        C202109l3 r11 = new C202109l3(this.A00, (C19970wo) r4.A00.A00.A8b.get(), Integer.toString(num.intValue()));
        C20760y7 copyOf = C20760y7.copyOf((Collection) set);
        C31421bn r14 = this.A07;
        C31431bo r13 = this.A09;
        C18800tq r5 = this.A01.A00.A00;
        C20090x0 builderWithExpectedSize = C20070wy.builderWithExpectedSize(12);
        builderWithExpectedSize.put("whatsapp_biz_integrity_survey_eligibility", r5.A6y);
        builderWithExpectedSize.put("whatsapp_user_contact_with_no_chat", r5.A71);
        builderWithExpectedSize.put("whatsapp_user_rendered_inorganic_notification", r5.A72);
        builderWithExpectedSize.put("whatsapp_user_unread_story", r5.A73);
        builderWithExpectedSize.put("whatsapp_active_status_setting", r5.A0i);
        builderWithExpectedSize.put("whatsapp_smb_user_has_profile_picture", r5.A0j);
        builderWithExpectedSize.put("whatsapp_smb_is_fb_app_installed", r5.A0n);
        builderWithExpectedSize.put("whatsapp_user_has_exited_group", r5.A0l);
        builderWithExpectedSize.put("whatsapp_user_has_removed_profile_photo_first_time", r5.A0m);
        builderWithExpectedSize.put("whatsapp_smb_user_eligible_for_business_search", r5.A0k);
        builderWithExpectedSize.put("whatsapp_user_contact_permissions", r5.A0o);
        builderWithExpectedSize.put("whatsapp_user_notification_permissions", r5.A0p);
        C193249Kp r10 = new C193249Kp((C19970wo) r5.A8b.get(), r11, builderWithExpectedSize.build());
        C31441bp r9 = this.A08;
        C31471bs r8 = this.A0B;
        C31461br r7 = this.A06;
        C31451bq r6 = this.A0C;
        C31481bt r52 = this.A0A;
        C19970wo r12 = this.A03;
        long currentTimeMillis = System.currentTimeMillis();
        C202109l3 r26 = r11;
        return new AnonymousClass9OY(copyOf, r10, r7, r14, r9, r13, r52, r8, r6, new C194769Re(r12, this.A04, this.A05), r26, r33, currentTimeMillis, (long) (num2.intValue() * 1000));
    }

    public C31391bk(C31401bl r2, C31411bm r3, C19970wo r4, C21010yW r5, AnonymousClass19A r6, C19890wg r7) {
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = r6;
        this.A00 = r7.A00("com.whatsapp.psa.qp_surface");
        this.A01 = r2;
        this.A02 = r3;
    }
}
