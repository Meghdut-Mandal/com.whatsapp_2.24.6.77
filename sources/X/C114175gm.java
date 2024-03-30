package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;

/* renamed from: X.5gm  reason: invalid class name and case insensitive filesystem */
public abstract class C114175gm {
    public static C156737aS A00;
    public static C156737aS A01;
    public static C156737aS A02;
    public static C156737aS A03;
    public static C156737aS A04;
    public static C156737aS A05;
    public static C156737aS A06;
    public static C156737aS A07;
    public static C156737aS A08;
    public static C156737aS A09;
    public static final List A0A;
    public static final List A0B;
    public static final List A0C;

    static {
        AnonymousClass671 r10 = new AnonymousClass671("user_values", "name='active_session_info'", new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "value"});
        C188598zq r11 = C188598zq.A01;
        AnonymousClass72I r7 = C197129bB.A04;
        A04 = new C156737aS(r7, "content://com.facebook.katana.provider.FirstPartyUserValuesProvider/user_values", "com.facebook.katana", r10, r11);
        AnonymousClass671 r1 = new AnonymousClass671("user_values", "name='active_session_info'", new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "value"});
        AnonymousClass72I r13 = C197129bB.A01;
        C188598zq r17 = r11;
        A01 = new C156737aS(r13, "content://com.facebook.wakizashi.provider.FirstPartyUserValuesProvider/user_values", "com.facebook.wakizashi", r1, r17);
        A05 = new C156737aS(r7, "content://com.facebook.katana.liteprovider.FirstPartyUserValuesLiteProvider/user_values", "com.facebook.katana", new AnonymousClass671("user_values", "name='active_session_info'", new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "value"}), r11);
        A02 = new C156737aS(r13, "content://com.facebook.wakizashi.liteprovider.FirstPartyUserValuesLiteProvider/user_values", "com.facebook.wakizashi", new AnonymousClass671("user_values", "name='active_session_info'", new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "value"}), r17);
        AnonymousClass671 r5 = new AnonymousClass671((String) null, (String) null, new String[0]);
        C188598zq r21 = C188598zq.A04;
        AnonymousClass72I r172 = C197129bB.A07;
        A09 = new C156737aS(r172, "content://com.instagram.contentprovider.FamilyAppsUserValuesProvider", "com.instagram.android", r5, r21);
        AnonymousClass72I r23 = r172;
        String str = "com.instagram.android";
        A06 = new C156737aS(r23, "content://com.instagram.liteprovider.FirstPartyUserValuesLiteProvider", str, new AnonymousClass671((String) null, (String) null, new String[0]), r21);
        A07 = new C156737aS(r23, "content://com.instagram.liteprovider.FirstPartyUserValuesLiteProviderV2", str, new AnonymousClass671((String) null, (String) null, new String[0]), C188598zq.A05);
        A03 = new C156737aS(r7, "content://com.facebook.katana.provider.UserValuesProvider/user_values", "com.facebook.katana", new AnonymousClass671("user_values", "name='all_session_info'", new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "value"}), r11);
        A00 = new C156737aS(r7, "content://com.facebook.wakizashi.provider.UserValuesProvider/user_values", "com.facebook.wakizashi", new AnonymousClass671("user_values", "name='all_session_info'", new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "value"}), r11);
        A08 = new C156737aS(r172, "content://com.instagram.contentprovider.FamilyAppsUserValuesProvider", "com.instagram.android", new AnonymousClass671((String) null, "all_session_info", new String[0]), r21);
        C1271567e[] r2 = new C1271567e[2];
        r2[0] = A04;
        A0C = C90524aI.A0p(A09, r2, 1);
        C1271567e[] r22 = new C1271567e[3];
        r22[0] = A05;
        r22[1] = A06;
        A0B = C90524aI.A0p(A07, r22, 2);
        C1271567e[] r24 = new C1271567e[2];
        r24[0] = A03;
        A0A = C90524aI.A0p(A08, r24, 1);
    }
}
