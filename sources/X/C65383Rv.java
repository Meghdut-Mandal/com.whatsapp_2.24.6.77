package X;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.provider.Telephony;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.invite.CreateAndGet1on1InviteCodeMutationImpl$Builder;
import com.whatsapp.infra.graphql.generated.invite.CreateAndGet1on1InviteCodeResponseImpl;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.3Rv  reason: invalid class name and case insensitive filesystem */
public final class C65383Rv {
    public final AnonymousClass1N4 A00;
    public final AnonymousClass17Y A01;
    public final C20810yC A02;
    public final AnonymousClass1M4 A03;
    public final AnonymousClass005 A04;
    public final C32611du A05;
    public final C27591Ow A06;
    public final AnonymousClass19A A07;

    public static final void A00(Context context, Uri uri, C65383Rv r8, Integer num, String str, long j) {
        Intent A0I = C36441kJ.A0I("android.intent.action.SENDTO");
        A0I.setData(uri);
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(A0I, 0);
        AnonymousClass00C.A08(queryIntentActivities);
        if (C36401kF.A1a(queryIntentActivities)) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("app/sms ");
            C36321k7.A1Y(A0u, queryIntentActivities.size());
            String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(context);
            if (defaultSmsPackage == null || defaultSmsPackage.length() == 0) {
                ActivityInfo activityInfo = queryIntentActivities.get(0).activityInfo;
                A0I.setClassName(activityInfo.packageName, activityInfo.name);
                defaultSmsPackage = activityInfo.packageName;
            } else {
                A0I.setPackage(defaultSmsPackage);
            }
            if (!(str == null || str.length() == 0)) {
                A0I.putExtra("sms_body", str);
            }
            context.startActivity(A0I);
            Integer num2 = num;
            if (num != null) {
                r8.A05.A01(num2, defaultSmsPackage, 3, j);
                return;
            }
            return;
        }
        Log.e("app/sms/no activities");
    }

    public final void A02(Context context, Integer num, String str, String str2) {
        String str3;
        Context context2 = context;
        String str4 = str;
        boolean A1a = C36331k8.A1a(context2, str4);
        String replaceAll = str4.replaceAll("\\D", "");
        AnonymousClass00C.A08(replaceAll);
        AnonymousClass1M4 r1 = this.A03;
        Integer num2 = num;
        String str5 = str2;
        if (!r1.A04() && !r1.A05("BR")) {
            try {
                AnonymousClass005 r3 = this.A04;
                AUN A0F = ((C203559oI) r3.get()).A0F(str4, (String) null);
                String valueOf = String.valueOf(A0F.countryCode_);
                r3.get();
                String A012 = AnonymousClass1M4.A01(valueOf, C203559oI.A02(A0F));
                AnonymousClass00C.A08(A012);
                if (!"BR".equals(A012) && !"eu".equals(this.A00.A04(String.valueOf(A0F.countryCode_)))) {
                    ProgressDialog progressDialog = new ProgressDialog(context2);
                    this.A01.A0H(new C80273v8(progressDialog, context2, 23));
                    C62543Go r5 = new C62543Go(progressDialog, context2, this, num2, str4, str5);
                    if (this.A02.A0E(3941)) {
                        C75423nD r4 = new C75423nD(this.A06);
                        r4.A00 = r5;
                        AnonymousClass9VA r32 = new CreateAndGet1on1InviteCodeMutationImpl$Builder().A00;
                        r32.A02("phoneNumber", replaceAll);
                        r4.A01.A00(new AnonymousClass9JF(r32, CreateAndGet1on1InviteCodeResponseImpl.class, "CreateAndGet1on1InviteCode"), r4).A00();
                        return;
                    }
                    C76523p0 r6 = new C76523p0(this.A07);
                    if (num != null) {
                        switch (num2.intValue()) {
                            case 1:
                                str3 = "calls_no_contacts";
                                break;
                            case 2:
                                str3 = "contact_picker_last_item";
                                break;
                            case 3:
                                str3 = "contact_picker_no_contacts";
                                break;
                            case 4:
                                str3 = "contact_picker_menu";
                                break;
                            case 5:
                                str3 = "call_contact_picker_last_item";
                                break;
                            case 6:
                                str3 = "call_contact_picker_no_contacts";
                                break;
                            case 7:
                                str3 = "call_contact_picker_menu";
                                break;
                            case 8:
                                str3 = "conversations_no_contacts";
                                break;
                            case 9:
                                str3 = "multiple_contact_picker_no_contacts";
                                break;
                            case 10:
                                str3 = "phone_contacts_selector_no_contacts";
                                break;
                            case 11:
                                str3 = "settings";
                                break;
                            case 12:
                                str3 = "status";
                                break;
                            case 13:
                                str3 = "add_contact_result";
                                break;
                            case 14:
                                str3 = "contact_picker_search";
                                break;
                            case 15:
                                str3 = "call_contact_picker_search";
                                break;
                            case 16:
                                str3 = "quick_contact";
                                break;
                            case 17:
                                str3 = "sms_default_app_warning";
                                break;
                            case 18:
                                str3 = "conversations_row_contact";
                                break;
                            case 19:
                                str3 = "from_messenger_deep_link";
                                break;
                            case 20:
                                str3 = "phone_number_exist_check";
                                break;
                            case 21:
                                str3 = "groups_create_participant_selector";
                                break;
                            case 22:
                                str3 = "groups_add_participant_selector";
                                break;
                            case 23:
                                str3 = "cag_add_participant_selector";
                                break;
                            case 24:
                                str3 = "wa_sharesheet_contact_search";
                                break;
                            case 25:
                                str3 = "chatlist_search";
                                break;
                            case 26:
                                str3 = "call_multi_contact_picker";
                                break;
                            case 27:
                                str3 = "call_multi_contact_picker_search";
                                break;
                            case 28:
                                str3 = "add_contact_form";
                                break;
                            case 29:
                                str3 = "add_contact_saved_snackbar";
                                break;
                            case 30:
                                str3 = "contact_picker_list";
                                break;
                            case 31:
                                str3 = "invite_qp_banner";
                                break;
                            default:
                                str3 = num2.toString();
                                break;
                        }
                    } else {
                        str3 = "unknown";
                    }
                    AnonymousClass00C.A0D(str3, A1a ? 1 : 0);
                    r6.A00 = r5;
                    AnonymousClass19A r52 = r6.A01;
                    String A09 = r52.A09();
                    AnonymousClass6QB A0T = C36421kH.A0T();
                    C36341k9.A1C(A0T);
                    C36331k8.A1D(A0T, "xmlns", "w:growth");
                    C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
                    C36331k8.A1C(A0T, A09);
                    AnonymousClass6QB A0q = C36441kJ.A0q("invite");
                    if (C203539oF.A0P(replaceAll, 0, 1024, false)) {
                        C36331k8.A1D(A0q, PublicKeyCredentialControllerUtility.JSON_KEY_USER, replaceAll);
                    }
                    if (C203539oF.A0P(str3, 0, 1024, true)) {
                        C36331k8.A1D(A0q, "entry_point", str3);
                    }
                    C36361kB.A1H(A0q, A0T);
                    r52.A0E(r6, A0T.A03(), A09, 374, 0);
                    return;
                }
            } catch (AnonymousClass172 unused) {
            }
        }
        A01(context2, this, num2, str4, "https://whatsapp.com/dl/", str5);
    }

    public C65383Rv(AnonymousClass1N4 r1, AnonymousClass17Y r2, C32611du r3, C20810yC r4, C27591Ow r5, AnonymousClass19A r6, AnonymousClass1M4 r7, AnonymousClass005 r8) {
        C36321k7.A1B(r4, r2, r7, r6, r5);
        C36321k7.A13(r8, r1, r3);
        this.A02 = r4;
        this.A01 = r2;
        this.A03 = r7;
        this.A07 = r6;
        this.A06 = r5;
        this.A04 = r8;
        this.A00 = r1;
        this.A05 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        if (r0 != 2) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.content.Context r8, X.C65383Rv r9, java.lang.Integer r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            java.lang.String r0 = X.C36321k7.A0D(r13, r11)
            android.net.Uri r5 = android.net.Uri.parse(r0)
            X.AnonymousClass00C.A08(r5)
            r6 = r9
            r7 = r10
            if (r10 == 0) goto L_0x0029
            int r1 = r10.intValue()
            r0 = 24
            if (r0 != r1) goto L_0x0029
            r1 = 2131890590(0x7f12119e, float:1.9415876E38)
        L_0x001a:
            java.lang.Object[] r0 = X.AnonymousClass000.A1b(r12)
            r4 = r8
            java.lang.String r8 = r8.getString(r1, r0)
            r9 = 1
            A00(r4, r5, r6, r7, r8, r9)
            return
        L_0x0029:
            X.0yC r4 = r9.A02
            r0 = 5787(0x169b, float:8.11E-42)
            int r3 = r4.A07(r0)
            if (r3 == 0) goto L_0x004b
            r2 = 1
            if (r3 == r2) goto L_0x005b
            r1 = 2
            if (r3 == r1) goto L_0x0057
            r0 = 3
            if (r3 == r0) goto L_0x0053
            r0 = 4
            if (r3 == r0) goto L_0x004f
            r0 = 5786(0x169a, float:8.108E-42)
            int r0 = r4.A07(r0)
            if (r0 == 0) goto L_0x004b
            if (r0 == r2) goto L_0x005b
            if (r0 == r1) goto L_0x0057
        L_0x004b:
            r1 = 2131894905(0x7f122279, float:1.9424628E38)
            goto L_0x001a
        L_0x004f:
            r1 = 2131890594(0x7f1211a2, float:1.9415884E38)
            goto L_0x001a
        L_0x0053:
            r1 = 2131890593(0x7f1211a1, float:1.9415882E38)
            goto L_0x001a
        L_0x0057:
            r1 = 2131890592(0x7f1211a0, float:1.941588E38)
            goto L_0x001a
        L_0x005b:
            r1 = 2131890591(0x7f12119f, float:1.9415878E38)
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65383Rv.A01(android.content.Context, X.3Rv, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
