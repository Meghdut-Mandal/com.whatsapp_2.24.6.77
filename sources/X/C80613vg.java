package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;

/* renamed from: X.3vg  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C80613vg implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass11F A02;
    public final /* synthetic */ AnonymousClass1O8 A03;
    public final /* synthetic */ AnonymousClass3EB A04;

    public /* synthetic */ C80613vg(AnonymousClass11F r1, AnonymousClass1O8 r2, AnonymousClass3EB r3, int i, int i2) {
        this.A03 = r2;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = r1;
        this.A04 = r3;
    }

    public final void run() {
        String str;
        String str2;
        AnonymousClass1O8 r4 = this.A03;
        int i = this.A00;
        int i2 = this.A01;
        AnonymousClass11F r13 = this.A02;
        AnonymousClass3EB r7 = this.A04;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ProfilePhotoManager/sendGetProfilePhoto photoId:");
        A0u.append(i);
        A0u.append(" type:");
        A0u.append(i2);
        C36321k7.A1K(r13, " jid:", A0u);
        C19970wo r10 = r4.A01;
        C20810yC r11 = r4.A02;
        AnonymousClass19A r14 = r4.A03;
        if (i2 == 1) {
            str = "image";
        } else {
            str = "preview";
        }
        if (i > 0) {
            str2 = Integer.toString(i);
        } else {
            str2 = null;
        }
        AnonymousClass1O8 r5 = r4;
        C76923pf r9 = new C76923pf(r10, r11, new C75273mx(r4, r5, r4.A05, r7, r4.A06), r13, r14, str, str2);
        AnonymousClass19A r102 = r9.A01;
        String A09 = r102.A09();
        AnonymousClass11F r72 = r9.A00;
        String str3 = r9.A03;
        boolean equals = "image".equals(str3);
        ArrayList A0I = AnonymousClass001.A0I();
        if (equals || C76923pf.A00(r9)) {
            C36381kD.A1M("query", "url", A0I);
        }
        String str4 = r9.A02;
        if (str4 != null) {
            C36381kD.A1M(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str4, A0I);
        }
        C36381kD.A1M(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str3, A0I);
        C203399nx r52 = new C203399nx("picture", (AnonymousClass1AL[]) A0I.toArray(new AnonymousClass1AL[0]));
        AnonymousClass1AL[] r42 = new AnonymousClass1AL[5];
        C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A09, r42, 0);
        C36341k9.A1L("xmlns", "w:profile:picture", r42, 1);
        C36341k9.A1V(r42, 2);
        r42[3] = new AnonymousClass1AL((Jid) r72, "target");
        C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r42, 4);
        r102.A0F(r9, C36391kE.A0m(r52, r42), A09, 26, 0);
    }
}
