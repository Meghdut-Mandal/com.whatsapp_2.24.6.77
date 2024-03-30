package X;

import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.contact.contactform.ContactFormBottomSheetFragment;
import java.util.ArrayList;

/* renamed from: X.1eE  reason: invalid class name and case insensitive filesystem */
public final class C32811eE {
    public final C20810yC A00;
    public final C19730wQ A01;
    public final C32801eD A02;
    public final C220412q A03;

    public static Intent A00(C32811eE r4, String str, String str2, boolean z, boolean z2) {
        Intent intent;
        C18740tg.A0C(!r4.A01.A0L());
        if (z) {
            intent = new Intent("android.intent.action.INSERT", ContactsContract.Contacts.CONTENT_URI);
        } else {
            intent = new Intent("android.intent.action.INSERT_OR_EDIT");
            intent.setType("vnd.android.cursor.item/contact");
        }
        if (!TextUtils.isEmpty(str2)) {
            if (z2) {
                ArrayList arrayList = new ArrayList();
                ContentValues contentValues = new ContentValues();
                contentValues.put("mimetype", "vnd.android.cursor.item/name");
                contentValues.put("data2", str2);
                arrayList.add(contentValues);
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("mimetype", "vnd.android.cursor.item/organization");
                contentValues2.put("data1", str2);
                arrayList.add(contentValues2);
                intent.putParcelableArrayListExtra("data", arrayList);
            } else {
                intent.putExtra(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str2);
            }
        }
        intent.putExtra("phone", str);
        intent.putExtra("phone_type", 2);
        intent.setFlags(524288);
        return intent;
    }

    public static Bundle A01(AnonymousClass141 r6) {
        Bundle bundle = new Bundle();
        AnonymousClass11F r5 = r6.A0H;
        if (r5 != null) {
            bundle.putString("contact_data_phone", AnonymousClass3U8.A07(r5));
            bundle.putString("contact_chat_jid", r5.getRawString());
            bundle.putString("contact_data_first_name", r6.A0R);
            bundle.putString("contact_data_last_name", r6.A0Q);
            bundle.putString("contact_data_business_name", r6.A0O);
            bundle.putLong("native_contact_sync_to_device", (long) r6.A07);
            bundle.putBoolean("is_whatsapp_contact", r6.A0s);
            bundle.putInt("contact_sync_policy", r6.A07);
            AnonymousClass3IL r0 = r6.A0F;
            if (r0 != null) {
                bundle.putString("extra_contact_phone_number", r0.A01);
                bundle.putLong("contact_id", r6.A0F.A00);
            }
            bundle.putString("contact_chat_jid", r5.getRawString());
            boolean z = true;
            if (r6.A07 != 1) {
                z = false;
            }
            bundle.putBoolean("wa_only_contact", z);
            bundle.putLong("wa_contact_table_column_id", r6.A0I());
        }
        return bundle;
    }

    private String A02(AnonymousClass141 r4, AnonymousClass11F r5) {
        if (r4 != null && r4.A0C()) {
            return r4.A0K();
        }
        if (!C20800yB.A01(C21000yV.A02, this.A00, 945) || r4 == null) {
            return this.A03.A0D(r5);
        }
        return r4.A0a;
    }

    public Bundle A04(AnonymousClass141 r6) {
        Bundle bundle = new Bundle();
        AnonymousClass11F r4 = r6.A0H;
        if (r4 != null) {
            bundle.putString("contact_data_phone", AnonymousClass3U8.A07(r4));
            String A0J = r6.A0J();
            String str = r6.A0R;
            if (!(A0J == null || str == null || !A0J.contains(str))) {
                bundle.putString("contact_data_first_name", r6.A0R);
            }
            String A0J2 = r6.A0J();
            String str2 = r6.A0Q;
            if (!(A0J2 == null || str2 == null || !A0J2.contains(str2))) {
                bundle.putString("contact_data_last_name", r6.A0Q);
            }
            bundle.putString("contact_data_business_name", r6.A0O);
            AnonymousClass3IL r0 = r6.A0F;
            if (r0 != null) {
                bundle.putLong("contact_id", r0.A00);
            }
            bundle.putString("contact_chat_jid", r4.getRawString());
            boolean z = true;
            if (r6.A07 != 1) {
                z = false;
            }
            bundle.putBoolean("wa_only_contact", z);
            bundle.putLong("wa_contact_table_column_id", r6.A0I());
        }
        return bundle;
    }

    public C32811eE(C19730wQ r1, C32801eD r2, C220412q r3, C20810yC r4) {
        this.A00 = r4;
        this.A01 = r1;
        this.A03 = r3;
        this.A02 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r5.A0C() == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.Intent A03(X.AnonymousClass141 r5, X.AnonymousClass11F r6, boolean r7) {
        /*
            r4 = this;
            java.lang.String r3 = X.AnonymousClass3U8.A07(r6)
            java.lang.String r2 = r4.A02(r5, r6)
            if (r5 == 0) goto L_0x0011
            boolean r1 = r5.A0C()
            r0 = 1
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            android.content.Intent r0 = A00(r4, r3, r2, r7, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32811eE.A03(X.141, X.11F, boolean):android.content.Intent");
    }

    public void A05(AnonymousClass01z r4, AnonymousClass141 r5, AnonymousClass11F r6) {
        String A022 = A02(r5, r6);
        Bundle bundle = new Bundle();
        bundle.putString("contact_data_first_name", A022);
        if (r5 != null && r5.A0C()) {
            bundle.putString("contact_data_business_name", A022);
        }
        bundle.putString("contact_data_phone", AnonymousClass3U8.A07(r6));
        ContactFormBottomSheetFragment contactFormBottomSheetFragment = new ContactFormBottomSheetFragment();
        contactFormBottomSheetFragment.A17(bundle);
        C65443Sb.A02(contactFormBottomSheetFragment, r4);
    }

    public void A06(AnonymousClass01z r5, AnonymousClass141 r6, AnonymousClass11F r7) {
        String A022 = A02(r6, r7);
        Bundle bundle = new Bundle();
        bundle.putString("contact_data_lid", r7.user);
        bundle.putString("contact_data_first_name", A022);
        if (r6 != null && r6.A0C()) {
            bundle.putString("contact_data_business_name", A022);
        }
        ContactFormBottomSheetFragment contactFormBottomSheetFragment = new ContactFormBottomSheetFragment();
        contactFormBottomSheetFragment.A17(bundle);
        C65443Sb.A02(contactFormBottomSheetFragment, r5);
    }
}
