package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8YB  reason: invalid class name */
public class AnonymousClass8YB extends AnonymousClass1LZ {
    public final C19730wQ A00;
    public final C19980wp A01;
    public final C19970wo A02;
    public final C19420v0 A03;
    public final AnonymousClass163 A04;
    public final C20810yC A05;
    public final AnonymousClass1GQ A06;

    public String A0B() {
        return "regular";
    }

    public String A0C() {
        return "primary_feature";
    }

    public boolean A0H() {
        return true;
    }

    public C201669k5 A0A(C202599mH r10, String str, boolean z) {
        String[] strArr = r10.A06;
        if (strArr.length != 1 || !"primary_feature".equals(C165617ti.A0a(strArr))) {
            return null;
        }
        AnonymousClass8SS r2 = r10.A03;
        if (!C199769fw.A03.equals(r10.A01) || r2 == null || !C165577te.A1W(r2.bitField0_) || (r2.bitField0_ & 524288) == 0) {
            return null;
        }
        C172228Na r0 = r2.primaryFeature_;
        if (r0 == null) {
            r0 = C172228Na.DEFAULT_INSTANCE;
        }
        return new C175978bN(r10.A02, str, r0.flags_, r2.timestamp_);
    }

    public /* bridge */ /* synthetic */ void A0G(C201669k5 r6, C201669k5 r7) {
        C175978bN r62 = (C175978bN) r6;
        if (this.A00.A0L()) {
            C19980wp r4 = this.A01;
            List list = r62.A00;
            C36331k8.A0w(C19980wp.A00(r4).edit(), "ddm_settings_feature_flag", list.contains("ddm_settings"));
            C36331k8.A0w(C19980wp.A00(r4).edit(), "post_status_in_companion", list.contains("post_status_in_companion"));
            C36331k8.A0w(C19980wp.A00(r4).edit(), "username_creation_supported_on_primary", list.contains("username_supported"));
            if (list.contains("username_is_set")) {
                C36331k8.A0w(C19420v0.A00(this.A03), "username_ever_set", true);
            }
            if (list.contains("username_chats_exist")) {
                C36331k8.A0w(C19420v0.A00(this.A03), "username_chats_ever_existed", true);
            }
        }
        A07(r62);
    }

    public List A0J() {
        AnonymousClass8SS A052;
        C18740tg.A0C(!this.A00.A0L());
        ArrayList A0I = A0I();
        AnonymousClass1AC r3 = this.A00;
        ArrayList A042 = AnonymousClass1AC.A04(r3, "primary_feature", true);
        if (A042.isEmpty()) {
            A042 = AnonymousClass1AC.A04(r3, "primary_feature", false);
        }
        if (!A042.isEmpty() && (A052 = ((C201669k5) C36441kJ.A12(A042)).A05()) != null) {
            C172228Na r0 = A052.primaryFeature_;
            if (r0 == null) {
                r0 = C172228Na.DEFAULT_INSTANCE;
            }
            if (!(!A0I.equals(r0.flags_))) {
                return Collections.emptyList();
            }
        }
        return Collections.singletonList(new C175978bN((C201539jo) null, (String) null, A0I, C19970wo.A00(this.A02)));
    }

    public AnonymousClass8YB(C19730wQ r1, C19980wp r2, C19970wo r3, C19420v0 r4, AnonymousClass163 r5, AnonymousClass1AC r6, C20810yC r7, AnonymousClass1GQ r8) {
        super(r6);
        this.A02 = r3;
        this.A05 = r7;
        this.A04 = r5;
        this.A00 = r1;
        this.A06 = r8;
        this.A03 = r4;
        this.A01 = r2;
    }

    public List A0D(boolean z) {
        return Collections.singletonList(new C175978bN((C201539jo) null, (String) null, A0I(), C19970wo.A00(this.A02)));
    }

    public ArrayList A0I() {
        ArrayList A0I = AnonymousClass001.A0I();
        C20810yC r3 = this.A05;
        if (r3.A0E(1312)) {
            A0I.add("ddm_settings");
        }
        if (r3.A0E(2775)) {
            A0I.add("favorite_sticker");
        }
        if (r3.A0E(2156)) {
            A0I.add("link_preview");
        }
        if (r3.A0E(1394)) {
            A0I.add("poll_creation_group");
        }
        if (r3.A0E(2194)) {
            A0I.add("poll_creation_on_one_one");
        }
        if (r3.A0E(2738)) {
            A0I.add("poll_creation_cag");
        }
        if (AnonymousClass1GQ.A01(this.A06, 3877)) {
            A0I.add("newsletter");
        }
        if (r3.A0E(3530)) {
            A0I.add("external_web_beta_opt_in");
        }
        if (r3.A0E(3665)) {
            A0I.add("link_preview_hq_thumbnail");
        }
        if (r3.A0E(4135) || r3.A0E(3337)) {
            A0I.add("history_sync_on_demand");
        }
        if (r3.A0E(4905)) {
            A0I.add("post_status_in_companion");
        }
        if (r3.A0E(4596)) {
            A0I.add("primary_campaign_id_in_history_sync_support");
        }
        C19420v0 r6 = this.A03;
        AnonymousClass005 r7 = r6.A00;
        if (C36391kE.A0H(r7).getBoolean("username_ever_set", false) || this.A00.A0B().length() > 0) {
            A0I.add("username_is_set");
            C36331k8.A0w(C19420v0.A00(r6), "username_ever_set", true);
        }
        if (!C36391kE.A0H(r7).getBoolean("username_chats_ever_existed", false)) {
            Iterator A10 = C36391kE.A10(this.A04.A0C());
            while (true) {
                if (A10.hasNext()) {
                    if (C52152oy.USERNAME.equals(((C65073Qp) A10.next()).A0Z)) {
                        break;
                    }
                } else {
                    break;
                }
            }
        } else {
            A0I.add("username_chats_exist");
            C36331k8.A0w(C19420v0.A00(r6), "username_chats_ever_existed", true);
        }
        if (r3.A0E(4745)) {
            A0I.add("username_supported");
        }
        if (r3.A0E(4921)) {
            A0I.add("text_status_creation_support");
        }
        if (r3.A0E(5839)) {
            A0I.add("text_status_receive_support");
        }
        if (r3.A0E(7301)) {
            A0I.add("companion_contact_change_enabled");
        }
        A0I.add("reactions_send");
        A0I.add("vo_sp_receiver");
        return A0I;
    }

    public /* bridge */ /* synthetic */ void A0E(C201669k5 r1) {
        A05(r1);
    }

    public /* bridge */ /* synthetic */ void A0F(C201669k5 r1) {
        A06(r1);
    }
}
