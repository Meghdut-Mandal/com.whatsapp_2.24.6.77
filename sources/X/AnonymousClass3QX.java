package X;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.provider.ContactsContract;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3QX  reason: invalid class name */
public class AnonymousClass3QX {
    public final AnonymousClass17Y A00;
    public final AnonymousClass196 A01;
    public final AnonymousClass16D A02;
    public final AnonymousClass16I A03;
    public final AnonymousClass171 A04;
    public final C21159AAt A05;
    public final C25851Hx A06;
    public final C230416y A07;
    public final C19730wQ A08;
    public final C229216m A09;
    public final C20430xY A0A;
    public final C21060yb A0B;
    public final C19970wo A0C;
    public final C20810yC A0D;
    public final C230116v A0E;
    public final C19770wU A0F;
    public final AnonymousClass1KI A0G;

    public static Intent A00(Activity activity, Bitmap bitmap, C65643Sx r17, boolean z) {
        Intent A0I;
        String str;
        String str2;
        String str3;
        ContentValues A0E2;
        CharSequence typeLabel;
        if (z) {
            A0I = new Intent("android.intent.action.INSERT", ContactsContract.Contacts.CONTENT_URI);
        } else {
            A0I = C36441kJ.A0I("android.intent.action.INSERT_OR_EDIT");
            A0I.setType("vnd.android.cursor.item/contact");
        }
        A0I.putExtra("finishActivityOnSaveCompleted", true);
        C65643Sx r12 = r17;
        A0I.putExtra(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r12.A0A.A01);
        Resources resources = activity.getResources();
        ArrayList A0I2 = AnonymousClass001.A0I();
        List<C607439e> list = r12.A06;
        if (list != null) {
            for (C607439e r4 : list) {
                ContentValues A0E3 = C36441kJ.A0E();
                A0E3.put("mimetype", "vnd.android.cursor.item/phone_v2");
                A0E3.put("data1", r4.A02);
                C36341k9.A0o(A0E3, "data2", r4.A00);
                A0E3.put("data3", ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources, r4.A00, r4.A03).toString());
                A0I2.add(A0E3);
            }
        }
        List<AnonymousClass3A9> list2 = r12.A03;
        if (list2 != null) {
            for (AnonymousClass3A9 r3 : list2) {
                Class<ContactsContract.CommonDataKinds.Im> cls = r3.A01;
                if (cls == ContactsContract.CommonDataKinds.Email.class) {
                    A0E2 = C36441kJ.A0E();
                    A0E2.put("mimetype", "vnd.android.cursor.item/email_v2");
                    A0E2.put("data1", r3.A02);
                    C36341k9.A0o(A0E2, "data2", r3.A00);
                    typeLabel = ContactsContract.CommonDataKinds.Email.getTypeLabel(resources, r3.A00, r3.A03);
                } else if (cls == ContactsContract.CommonDataKinds.StructuredPostal.class) {
                    A0E2 = C36441kJ.A0E();
                    A0E2.put("mimetype", "vnd.android.cursor.item/postal-address_v2");
                    A0E2.put("data4", AnonymousClass3PZ.A00(r3.A04.A03));
                    A0E2.put("data7", r3.A04.A00);
                    A0E2.put("data8", r3.A04.A02);
                    A0E2.put("data9", r3.A04.A04);
                    A0E2.put("data10", r3.A04.A01);
                    C36341k9.A0o(A0E2, "data2", r3.A00);
                    typeLabel = ContactsContract.CommonDataKinds.StructuredPostal.getTypeLabel(resources, r3.A00, r3.A03);
                } else {
                    Class<ContactsContract.CommonDataKinds.Im> cls2 = ContactsContract.CommonDataKinds.Im.class;
                    StringBuilder A0u = AnonymousClass000.A0u();
                    if (cls == cls2) {
                        str3 = "sharecontactutil ";
                    } else {
                        str3 = "sharecontactutil/type/unknown ";
                    }
                    A0u.append(str3);
                    C36321k7.A1Z(A0u, r3.toString());
                }
                A0E2.put("data3", typeLabel.toString());
                A0I2.add(A0E2);
            }
        }
        List list3 = r12.A05;
        if (list3 != null && list3.size() > 0) {
            AnonymousClass360 r13 = (AnonymousClass360) r12.A05.get(0);
            String str4 = r13.A00;
            int lastIndexOf = str4.lastIndexOf(" ");
            if (lastIndexOf > 0) {
                str4 = str4.substring(0, lastIndexOf);
            }
            ContentValues A0E4 = C36441kJ.A0E();
            A0E4.put("mimetype", "vnd.android.cursor.item/organization");
            A0E4.put("data1", str4);
            if (lastIndexOf > 0) {
                A0E4.put("data5", r13.A00.substring(lastIndexOf + 1));
            }
            A0E4.put("data4", r13.A01);
            A0I2.add(A0E4);
        }
        List list4 = r12.A07;
        if (list4 != null && list4.size() > 0) {
            for (AnonymousClass362 r2 : r12.A07) {
                ContentValues A0E5 = C36441kJ.A0E();
                A0E5.put("mimetype", "vnd.android.cursor.item/website");
                C36341k9.A0o(A0E5, "data2", r2.A00);
                A0E5.put("data1", r2.A01);
                A0I2.add(A0E5);
            }
        }
        Map map = r12.A08;
        if (map != null) {
            Iterator A10 = AnonymousClass000.A10(map);
            while (A10.hasNext()) {
                String A0C2 = AnonymousClass001.A0C(A10);
                if (A0C2.equals("NICKNAME")) {
                    ContentValues A0E6 = C36441kJ.A0E();
                    A0E6.put("mimetype", "vnd.android.cursor.item/nickname");
                    A0E6.put("data1", C65643Sx.A00(A0C2, r12).A02);
                    A0I2.add(A0E6);
                }
                if (A0C2.equals("BDAY")) {
                    ContentValues A0E7 = C36441kJ.A0E();
                    A0E7.put("mimetype", "vnd.android.cursor.item/contact_event");
                    C36341k9.A0o(A0E7, "data2", 3);
                    A0E7.put("data1", C65643Sx.A00(A0C2, r12).A02);
                    A0I2.add(A0E7);
                }
                HashMap hashMap = C65643Sx.A0E;
                if (hashMap.containsKey(A0C2)) {
                    AnonymousClass3KL A002 = C65643Sx.A00(A0C2, r12);
                    ContentValues A0E8 = C36441kJ.A0E();
                    A0E8.put("mimetype", "vnd.android.cursor.item/im");
                    A0E8.put("data5", (Integer) hashMap.get(A0C2));
                    A0E8.put("data1", C65643Sx.A00(A0C2, r12).A02);
                    Set set = A002.A04;
                    if (set.size() > 0) {
                        A0E8.put("data2", (String) set.toArray()[0]);
                    }
                    A0I2.add(A0E8);
                }
            }
        }
        Bitmap bitmap2 = bitmap;
        if (bitmap != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap2.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ContentValues A0E9 = C36441kJ.A0E();
            A0E9.put("mimetype", "vnd.android.cursor.item/photo");
            A0E9.put("data15", byteArray);
            A0I2.add(A0E9);
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused) {
            }
        }
        if (!A0I2.isEmpty()) {
            ContentValues contentValues = (ContentValues) A0I2.get(0);
            String asString = contentValues.getAsString("mimetype");
            boolean z2 = true;
            char c = 65535;
            switch (asString.hashCode()) {
                case -1569536764:
                    if (asString.equals("vnd.android.cursor.item/email_v2")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1328682538:
                    if (asString.equals("vnd.android.cursor.item/contact_event")) {
                        c = 1;
                        break;
                    }
                    break;
                case -601229436:
                    if (asString.equals("vnd.android.cursor.item/postal-address_v2")) {
                        c = 2;
                        break;
                    }
                    break;
                case 684173810:
                    if (asString.equals("vnd.android.cursor.item/phone_v2")) {
                        c = 3;
                        break;
                    }
                    break;
                case 689862072:
                    if (asString.equals("vnd.android.cursor.item/organization")) {
                        c = 4;
                        break;
                    }
                    break;
                case 905843021:
                    if (asString.equals("vnd.android.cursor.item/photo")) {
                        c = 5;
                        break;
                    }
                    break;
                case 950831081:
                    if (asString.equals("vnd.android.cursor.item/im")) {
                        c = 6;
                        break;
                    }
                    break;
                case 2034973555:
                    if (asString.equals("vnd.android.cursor.item/nickname")) {
                        c = 7;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    A0I.putExtra("email", contentValues.getAsString("data1"));
                    str = contentValues.getAsString("data3");
                    str2 = "email_type";
                    break;
                case 1:
                case 5:
                case 7:
                    z2 = false;
                    break;
                case 2:
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append(contentValues.getAsString("data4"));
                    A0u2.append(", ");
                    A0u2.append(contentValues.getAsString("data7"));
                    A0u2.append(", ");
                    A0u2.append(contentValues.getAsString("data8"));
                    C36421kH.A1N(A0u2);
                    A0u2.append(contentValues.getAsString("data9"));
                    A0u2.append(", ");
                    A0I.putExtra("postal", AnonymousClass000.A0q(contentValues.getAsString("data10"), A0u2));
                    str = contentValues.getAsString("data3");
                    str2 = "postal_type";
                    break;
                case 3:
                    A0I.putExtra("phone", contentValues.getAsString("data1"));
                    str = contentValues.getAsString("data3");
                    str2 = "phone_type";
                    break;
                case 4:
                    StringBuilder A0u3 = AnonymousClass000.A0u();
                    A0u3.append(contentValues.getAsString("data1"));
                    String asString2 = contentValues.getAsString("data5");
                    if (asString2 != null) {
                        A0u3.append(", ");
                        A0u3.append(asString2);
                    }
                    A0I.putExtra("company", A0u3.toString());
                    str = contentValues.getAsString("data4");
                    str2 = "job_title";
                    break;
                case 6:
                    A0I.putExtra("im_protocol", contentValues.getAsString("data5"));
                    str = contentValues.getAsString("data1");
                    str2 = "im_handle";
                    break;
            }
            A0I.putExtra(str2, str);
            if (z2) {
                A0I2.remove(0);
            }
        }
        A0I.putParcelableArrayListExtra("data", A0I2);
        return A0I;
    }

    public void A01(Context context, UserJid userJid, String str, String str2, String str3) {
        Intent A1W;
        AnonymousClass16D r3 = this.A02;
        UserJid userJid2 = userJid;
        AnonymousClass141 A0D2 = r3.A0D(userJid);
        if (A0D2.A0D()) {
            this.A0G.A00 = C36361kB.A0i();
        }
        String str4 = str2;
        if (str2 != null && AnonymousClass143.A0I(userJid) && this.A0E.A01.A0E(3790)) {
            this.A0F.Boy(new C1502274l(this, userJid, str4, 37));
        }
        C19770wU r1 = this.A0F;
        C80263v7.A00(r1, this, userJid, 47);
        Context context2 = context;
        if (A0D2.A0t || TextUtils.isEmpty(str)) {
            if (!A0D2.A0B() && !A0D2.A0y && !A0D2.A0t) {
                C80263v7.A00(r1, this, userJid, 48);
            }
            AnonymousClass141 A0D3 = r3.A0D(userJid);
            String str5 = str3;
            if (str3 != null) {
                A1W = C36441kJ.A0j().A1a(context2, userJid2, str5, 0, true, true, true);
            } else {
                A1W = C36441kJ.A0j().A1W(context, A0D3);
            }
            AnonymousClass3M9.A01(A1W, "ShareContactUtil");
        } else {
            A1W = C36431kI.A0D().setClassName(context.getPackageName(), "com.whatsapp.conversation.conversationrow.ContactSyncActivity").putExtra("user_jid", AnonymousClass143.A03(userJid)).addFlags(335544320);
        }
        context.startActivity(A1W);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ce, code lost:
        if (r11 != null) goto L_0x00d0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(java.lang.String r22, java.lang.String r23, java.util.ArrayList r24, java.util.List r25) {
        /*
            r21 = this;
            r8 = r21
            X.0yC r1 = r8.A0D
            r0 = 449(0x1c1, float:6.29E-43)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x002f
            r10 = r24
            int r1 = r10.size()
            r9 = r25
            int r0 = r9.size()
            if (r1 == r0) goto L_0x0030
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "sharecontactutil/phones_jids_list_size_mismatch: "
            X.C36341k9.A1N(r0, r1, r10)
            java.lang.String r0 = ", "
            X.C36371kC.A1R(r0, r1, r9)
            java.lang.String r0 = r1.toString()
        L_0x002c:
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x002f:
            return
        L_0x0030:
            X.0wQ r0 = r8.A08
            boolean r0 = r0.A0L()
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = "sharecontactutil/on-activity-result/companion should not be adding contacts"
            goto L_0x002c
        L_0x003b:
            X.16m r0 = r8.A09
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x0046
            java.lang.String r0 = "sharecontactutil/on-activity-result/access to contacts denied"
            goto L_0x002c
        L_0x0046:
            r14 = 0
            r7 = 0
            r13 = 0
        L_0x0049:
            int r0 = r10.size()
            if (r7 >= r0) goto L_0x0104
            java.lang.String r6 = X.C36421kH.A0e(r10, r7)
            java.lang.Object r5 = r9.get(r7)
            X.11F r5 = (X.AnonymousClass11F) r5
            if (r5 == 0) goto L_0x00f5
            X.16D r0 = r8.A02
            X.16p r0 = r0.A05
            java.util.ArrayList r4 = r0.A0Q(r5)
            int r0 = r4.size()
            if (r0 <= 0) goto L_0x00f5
            java.util.Iterator r12 = r4.iterator()
            r3 = 0
        L_0x006e:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00f7
            X.141 r2 = X.C36391kE.A0f(r12)
            X.11F r0 = r2.A0H
            if (r0 == 0) goto L_0x006e
            X.3IL r0 = r2.A0F
            if (r0 != 0) goto L_0x006e
            X.11F r0 = r2.A0H
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x00e5
            java.lang.String r0 = r5.user
            boolean r0 = android.telephony.PhoneNumberUtils.compare(r6, r0)
            if (r0 == 0) goto L_0x00e5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "sharecontactutil/unknown_contact_update:"
            r1.append(r0)
            X.11F r0 = r2.A0H
            X.C36321k7.A1N(r0, r1)
            X.0yb r0 = r8.A0B
            X.0ya r15 = r0.A0O()
            android.net.Uri r16 = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI
            java.lang.String r0 = "raw_contact_id"
            java.lang.String[] r17 = new java.lang.String[]{r0}
            java.lang.String[] r19 = X.C36441kJ.A1S()
            r19[r14] = r6
            java.lang.String r1 = "com.whatsapp"
            r3 = 1
            r19[r3] = r1
            r20 = 0
            java.lang.String r18 = "data1 =? AND account_type =?"
            android.database.Cursor r11 = r15.A03(r16, r17, r18, r19, r20)
            if (r11 == 0) goto L_0x00cc
            boolean r1 = r11.moveToFirst()     // Catch:{ all -> 0x0121 }
            if (r1 == 0) goto L_0x00cc
            java.lang.String r0 = X.C36341k9.A0f(r11, r0)     // Catch:{ all -> 0x0121 }
            goto L_0x00d0
        L_0x00cc:
            r0 = r23
            if (r11 == 0) goto L_0x00d3
        L_0x00d0:
            r11.close()
        L_0x00d3:
            long r0 = java.lang.Long.parseLong(r0)
            X.3IL r11 = new X.3IL
            r11.<init>(r0, r6)
            r2.A0F = r11
            r0 = r22
            r2.A0P = r0
            r2.A0z = r3
            goto L_0x006e
        L_0x00e5:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "sharecontactutil/false_match: "
            r1.append(r0)
            X.11F r0 = r2.A0H
            X.C36351kA.A1L(r0, r1)
            goto L_0x006e
        L_0x00f5:
            r13 = 1
            goto L_0x0100
        L_0x00f7:
            if (r3 == 0) goto L_0x0100
            X.0wU r1 = r8.A0F
            r0 = 49
            X.C80263v7.A00(r1, r8, r4, r0)
        L_0x0100:
            int r7 = r7 + 1
            goto L_0x0049
        L_0x0104:
            if (r13 == 0) goto L_0x002f
            java.lang.String r0 = "sharecontactutil/new_number/need_delta_sync"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5Tu r0 = X.C108515Tu.A08
            X.6Pz r1 = new X.6Pz
            r1.<init>(r0)
            X.6NS r0 = X.AnonymousClass6NS.A0C
            r1.A00 = r0
            X.6Pq r2 = r1.A01()
            X.0xY r1 = r8.A0A
            r0 = 1
            X.C20430xY.A00(r1, r2, r0)
            return
        L_0x0121:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x0126 }
            throw r1
        L_0x0126:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3QX.A02(java.lang.String, java.lang.String, java.util.ArrayList, java.util.List):void");
    }

    public AnonymousClass3QX(AnonymousClass17Y r2, C19730wQ r3, AnonymousClass196 r4, C229216m r5, AnonymousClass16D r6, AnonymousClass16I r7, AnonymousClass171 r8, C21159AAt aAt, C20430xY r10, C21060yb r11, C19970wo r12, C25851Hx r13, C230416y r14, C20810yC r15, C230116v r16, C19770wU r17, AnonymousClass1KI r18) {
        this.A0C = r12;
        this.A0D = r15;
        this.A00 = r2;
        this.A08 = r3;
        this.A0F = r17;
        this.A01 = r4;
        this.A0G = r18;
        this.A02 = r6;
        this.A0B = r11;
        this.A04 = r8;
        this.A03 = r7;
        this.A05 = aAt;
        this.A0A = r10;
        this.A09 = r5;
        this.A0E = r16;
        this.A06 = r13;
        this.A07 = r14;
    }
}
