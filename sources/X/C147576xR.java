package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Map;

/* renamed from: X.6xR  reason: invalid class name and case insensitive filesystem */
public final class C147576xR implements C161317mY {
    public boolean A00;
    public final C23871Ae A01;
    public final AnonymousClass004 A02;

    public /* synthetic */ void BRG(String str) {
    }

    public void BRg(String str) {
        AnonymousClass00C.A0D(str, 0);
        if (str.equals(PublicKeyCredentialControllerUtility.JSON_KEY_USER)) {
            this.A01.A03((Boolean) null, 8);
        }
    }

    public void BRh() {
        boolean A012 = ((AnonymousClass1BF) this.A02.get()).A01();
        C23871Ae r2 = this.A01;
        r2.A04((Integer) null, (String) null, 5, A012);
        if (this.A00) {
            this.A00 = false;
            r2.A03((Boolean) null, 21);
        }
    }

    public void BRi(String str) {
        if (AnonymousClass00C.A0J(str, "will_delete")) {
            this.A01.A03((Boolean) null, 25);
        } else {
            C36321k7.A1P("AvatarEditorLoggingEvents/onAvatarEditorEvent received unhandled event = ", str, AnonymousClass000.A0u());
        }
    }

    public void BRj(String str, Map map) {
        C23871Ae r1;
        int i;
        String str2;
        if (str != null) {
            switch (str.hashCode()) {
                case -1147774587:
                    if (str.equals("notice_screen_shown")) {
                        this.A00 = true;
                        r1 = this.A01;
                        i = 20;
                        break;
                    }
                    break;
                case 871004653:
                    if (str.equals("user_confirmation_success")) {
                        this.A00 = false;
                        r1 = this.A01;
                        i = 23;
                        break;
                    }
                    break;
                case 1038955126:
                    str2 = "editor_navigation_failed";
                    break;
                case 1161655571:
                    str2 = "user_confirmation_failed";
                    break;
                case 1182156104:
                    if (str.equals("notice_screen_next_click")) {
                        r1 = this.A01;
                        i = 22;
                        break;
                    }
                    break;
            }
            if (str.equals(str2)) {
                this.A00 = true;
                r1 = this.A01;
                i = 24;
                r1.A03((Boolean) null, i);
                return;
            }
        }
        C36321k7.A1P("AvatarEditorLoggingEvents/onAvatarNoticeEvent received unhandled event = ", str, AnonymousClass000.A0u());
    }

    public void BRk(boolean z, boolean z2) {
        C23871Ae r2 = this.A01;
        int i = 7;
        if (z) {
            i = 3;
        }
        r2.A03(Boolean.valueOf(z2), i);
    }

    public C147576xR(C23871Ae r1, AnonymousClass004 r2) {
        C36321k7.A0x(r1, r2);
        this.A01 = r1;
        this.A02 = r2;
    }
}
