package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.4zw  reason: invalid class name and case insensitive filesystem */
public class C102404zw extends C142266ob {
    public C117765mn A00;

    public C102404zw(C117765mn r6) {
        super("bk.action.UpdatedAvatarV2", "bk.action.DeletedAvatar", "bk.action.avatars.AsyncAvatarEditorLauncherClosed", "bk.action.avatar.AvatarEditorWANoticeEventSubmit", "bk.action.avatar.AvatarEditorEventSubmit");
        this.A00 = r6;
    }

    public /* bridge */ /* synthetic */ Object B6u(AnonymousClass6MO r7, C115215iW r8, C124125xd r9) {
        C100674vP r92 = (C100674vP) r9;
        String str = r8.A00;
        short s = -1;
        switch (str.hashCode()) {
            case -962275587:
                s = C90504aG.A0y("bk.action.UpdatedAvatarV2", str);
                break;
            case 963920255:
                s = C90514aH.A1B("bk.action.DeletedAvatar", str);
                break;
            case 1731322695:
                s = C90514aH.A1C("bk.action.avatars.AsyncAvatarEditorLauncherClosed", str);
                break;
            case 1925160680:
                if (str.equals("bk.action.avatar.AvatarEditorWANoticeEventSubmit")) {
                    s = 3;
                    break;
                }
                break;
            case 2071347818:
                if (str.equals("bk.action.avatar.AvatarEditorEventSubmit")) {
                    s = 4;
                    break;
                }
                break;
        }
        switch (s) {
            case 0:
                List list = r7.A00;
                Boolean bool = (Boolean) list.get(2);
                C117765mn r0 = this.A00;
                C142326oh.A01(r92);
                C24251Bs r2 = r0.A00;
                boolean z = false;
                boolean A1Y = C90494aF.A1Y((Boolean) list.get(1));
                if (bool != null) {
                    z = bool.booleanValue();
                }
                r2.A02(A1Y, z);
                return null;
            case 1:
                C117765mn r02 = this.A00;
                C142326oh.A01(r92);
                r02.A00.A01(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                return null;
            case 2:
                C24251Bs r03 = this.A00.A00;
                C18740tg.A01();
                Iterator A0p = C90474aD.A0p(r03);
                while (A0p.hasNext()) {
                    ((C161317mY) A0p.next()).BRh();
                }
                break;
            case 3:
                List list2 = r7.A00;
                String A0s = C36401kF.A0s(list2, 0);
                Map A0k = C90494aF.A0k(list2, 1);
                C24251Bs r04 = this.A00.A00;
                C18740tg.A01();
                Iterator A0p2 = C90474aD.A0p(r04);
                while (A0p2.hasNext()) {
                    ((C161317mY) A0p2.next()).BRj(A0s, A0k);
                }
                break;
            case 4:
                String A02 = AnonymousClass6MO.A02(r7, 0);
                C24251Bs r05 = this.A00.A00;
                C18740tg.A01();
                Iterator A0p3 = C90474aD.A0p(r05);
                while (A0p3.hasNext()) {
                    ((C161317mY) A0p3.next()).BRi(A02);
                }
                break;
        }
        return null;
    }
}
