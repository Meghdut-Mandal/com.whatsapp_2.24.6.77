package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.3DY  reason: invalid class name */
public class AnonymousClass3DY {
    public final C19730wQ A00;
    public final AnonymousClass1EU A01;
    public final AnonymousClass12U A02;

    public static void A00(Activity activity, AnonymousClass3DY r7, String str, boolean z) {
        Activity activity2 = activity;
        activity2.startActivity(r7.A01(activity2, (Bundle) null, (AnonymousClass3XH) null, (Integer) null, str, (String) null, (ArrayList) null, (ArrayList) null, z));
    }

    public AnonymousClass3DY(C19730wQ r1, AnonymousClass1EU r2, AnonymousClass12U r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public Intent A01(Activity activity, Bundle bundle, AnonymousClass3XH r13, Integer num, String str, String str2, ArrayList arrayList, ArrayList arrayList2, boolean z) {
        Intent A0D;
        boolean A002 = C1906499t.A00(str);
        String str3 = str2;
        if (z && !A002) {
            C19730wQ r0 = this.A00;
            r0.A0G();
            if (r0.A00 != null && this.A02.A03()) {
                A0D = C36431kI.A0D();
                A0D.setClassName(activity.getPackageName(), "com.whatsapp.inappsupport.ui.ContactUsActivity");
                A0D.putExtra("com.whatsapp.inappsupport.ui.ContactUsActivity.from", str);
                A0D.putExtra("com.whatsapp.inappsupport.ui.ContactUsActivity.serverStatus", str3);
                if (bundle != null) {
                    Bundle A07 = AnonymousClass001.A07();
                    String string = bundle.getString("com.whatsapp.support.DescribeProblemActivity.from");
                    String string2 = bundle.getString("com.whatsapp.support.DescribeProblemActivity.serverstatus");
                    String string3 = bundle.getString("com.whatsapp.support.DescribeProblemActivity.emailAddress");
                    String string4 = bundle.getString("com.whatsapp.support.DescribeProblemActivity.description");
                    Parcelable parcelable = bundle.getParcelable("com.whatsapp.support.DescribeProblemActivity.suspendedEntityJid");
                    if (!TextUtils.isEmpty(string)) {
                        A07.putString("com.whatsapp.inappsupport.ui.ContactUsActivity.from", string);
                    }
                    if (!TextUtils.isEmpty(string2)) {
                        A07.putString("com.whatsapp.inappsupport.ui.ContactUsActivity.serverStatus", string2);
                    }
                    if (!TextUtils.isEmpty(string3)) {
                        A07.putString("com.whatsapp.inappsupport.ui.ContactUsActivity.emailAddress", string3);
                    }
                    if (!TextUtils.isEmpty(string4)) {
                        A07.putString("com.whatsapp.inappsupport.ui.ContactUsActivity.description", string4);
                    }
                    if (parcelable != null) {
                        A07.putParcelable("com.whatsapp.inappsupport.ui.ContactUsActivity.suspendedEntityJid", parcelable);
                    }
                    A0D.putExtras(A07);
                }
                if (r13 != null) {
                    A0D.putExtra("com.whatsapp.inappsupport.ui.ContactUsActivity.supportUserContext", r13);
                }
                return A0D;
            }
        }
        Class BA7 = this.A01.A05().BA7();
        if (!A002 || BA7 == null) {
            A0D = C36431kI.A0D();
            A0D.setClassName(activity.getPackageName(), "com.whatsapp.support.DescribeProblemActivity");
            A0D.putExtra("com.whatsapp.support.DescribeProblemActivity.from", str);
            A0D.putExtra("com.whatsapp.support.DescribeProblemActivity.serverstatus", str3);
            if (num != null) {
                A0D.putExtra("com.whatsapp.support.DescribeProblemActivity.type", num);
            }
            ArrayList arrayList3 = arrayList;
            if (arrayList != null) {
                A0D.putStringArrayListExtra("com.whatsapp.support.DescribeProblemActivity.description.paymentSupportTopicIDs", arrayList3);
            }
            ArrayList arrayList4 = arrayList2;
            if (arrayList2 != null) {
                A0D.putStringArrayListExtra("com.whatsapp.support.DescribeProblemActivity.description.paymentSupportTopicTitles", arrayList4);
            }
            if (bundle != null) {
                A0D.putExtras(bundle);
                return A0D;
            }
            return A0D;
        }
        A0D = C36441kJ.A0H(activity, BA7);
        if (bundle != null && bundle.containsKey("com.whatsapp.support.DescribeProblemActivity.paymentFBTxnId")) {
            A0D.putExtra("extra_transaction_id", bundle.getString("com.whatsapp.support.DescribeProblemActivity.paymentFBTxnId"));
            return A0D;
        }
        return A0D;
    }
}
