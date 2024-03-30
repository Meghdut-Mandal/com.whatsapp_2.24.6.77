package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: X.1F1  reason: invalid class name */
public class AnonymousClass1F1 {
    public final AnonymousClass12P A00;
    public final C19700wN A01;

    public static ContentValues A00(AnonymousClass3P8 r4, long j) {
        Integer num;
        AnonymousClass915 r0;
        ContentValues contentValues = new ContentValues(6);
        contentValues.put("message_row_id", Long.valueOf(j));
        contentValues.put("text_data", r4.A08);
        contentValues.put("extra_data", r4.A01);
        contentValues.put("button_type", Integer.valueOf(r4.A06));
        contentValues.put("used", Integer.valueOf(r4.A04 ? 1 : 0));
        contentValues.put("selected_index", Integer.valueOf(r4.A05));
        contentValues.put("selected_carousel_card_index", r4.A07);
        contentValues.put("otp_button_type", Integer.valueOf(r4.A0A.get()));
        contentValues.put("extra_consent_data", r4.A09);
        contentValues.put("otp_matched_package_name", r4.A02);
        String str = r4.A03;
        if (!(str == null || str.length() == 0)) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            AnonymousClass00C.A08(lowerCase);
            int hashCode = lowerCase.hashCode();
            if (hashCode != 3154575) {
                if (hashCode != 3552429) {
                    if (hashCode == 950483747 && lowerCase.equals("compact")) {
                        r0 = AnonymousClass915.COMPACT;
                    }
                } else if (lowerCase.equals("tall")) {
                    r0 = AnonymousClass915.TALL;
                }
            } else if (lowerCase.equals("full")) {
                r0 = AnonymousClass915.FULL;
            }
            num = Integer.valueOf(r0.value);
            contentValues.put("webview_presentation", num);
            return contentValues;
        }
        num = null;
        contentValues.put("webview_presentation", num);
        return contentValues;
    }

    public void A01(AnonymousClass3T1 r39) {
        Cursor A09;
        AnonymousClass3F4 r7;
        C88854Uh r1;
        Long valueOf;
        Integer num;
        int i;
        AnonymousClass915 A002;
        String str;
        AnonymousClass3T1 r12 = r39;
        C18740tg.A0E(r12 instanceof C88854Uh, "TemplateMessageStore/fillTemplateData/message needs to be FMessageTemplate.");
        long j = r12.A1N;
        ArrayList arrayList = new ArrayList();
        AnonymousClass1M0 A04 = this.A00.get();
        try {
            C224114e r5 = A04.A02;
            String valueOf2 = String.valueOf(j);
            A09 = r5.A09("SELECT content_text_data, footer_text_data, template_id, csat_trigger_expiration_ts, category, tag, mask_linked_devices FROM message_template WHERE message_row_id = ?", "GET_TEMPLATE_MESSAGE_SQL", new String[]{valueOf2});
            if (!A09.moveToFirst()) {
                Log.e("TemplateMessageStore/getTemplateData/no template data in the table.");
                A09.close();
                A04.close();
                C19700wN r4 = this.A01;
                StringBuilder sb = new StringBuilder();
                sb.append("message.key");
                sb.append(r12.A1J);
                r4.A0E("TemplateMessageStore/fillTemplateData/template data is missing.", sb.toString(), true);
                r1 = (C88854Uh) r12;
                r7 = new AnonymousClass3F4((Long) null, "", (String) null, (String) null, (String) null, (String) null, (List) null, false);
            } else {
                String string = A09.getString(A09.getColumnIndexOrThrow("content_text_data"));
                String string2 = A09.getString(A09.getColumnIndexOrThrow("footer_text_data"));
                String string3 = A09.getString(A09.getColumnIndexOrThrow("template_id"));
                long j2 = A09.getLong(A09.getColumnIndexOrThrow("csat_trigger_expiration_ts"));
                String string4 = A09.getString(A09.getColumnIndexOrThrow("category"));
                String string5 = A09.getString(A09.getColumnIndexOrThrow("tag"));
                boolean A03 = C224014d.A03(A09, A09.getColumnIndexOrThrow("mask_linked_devices"));
                A09.close();
                A09 = r5.A09("SELECT _id, text_data, extra_data, button_type, used, selected_index, selected_carousel_card_index, otp_button_type, extra_consent_data, otp_matched_package_name, webview_presentation FROM message_template_button WHERE message_row_id = ?", "GET_TEMPLATE_MESSAGE_BUTTONS_SQL", new String[]{valueOf2});
                int columnIndexOrThrow = A09.getColumnIndexOrThrow("_id");
                int columnIndexOrThrow2 = A09.getColumnIndexOrThrow("text_data");
                int columnIndexOrThrow3 = A09.getColumnIndexOrThrow("extra_data");
                int columnIndexOrThrow4 = A09.getColumnIndexOrThrow("button_type");
                int columnIndexOrThrow5 = A09.getColumnIndexOrThrow("used");
                int columnIndexOrThrow6 = A09.getColumnIndexOrThrow("selected_index");
                int columnIndexOrThrow7 = A09.getColumnIndexOrThrow("selected_carousel_card_index");
                int columnIndexOrThrow8 = A09.getColumnIndexOrThrow("otp_button_type");
                int columnIndexOrThrow9 = A09.getColumnIndexOrThrow("extra_consent_data");
                int columnIndexOrThrow10 = A09.getColumnIndexOrThrow("otp_matched_package_name");
                int columnIndexOrThrow11 = A09.getColumnIndexOrThrow("webview_presentation");
                while (A09.moveToNext()) {
                    long j3 = A09.getLong(columnIndexOrThrow);
                    String string6 = A09.getString(columnIndexOrThrow2);
                    String string7 = A09.getString(columnIndexOrThrow3);
                    int i2 = A09.getInt(columnIndexOrThrow4);
                    boolean z = false;
                    if (A09.getInt(columnIndexOrThrow5) == 1) {
                        z = true;
                    }
                    int i3 = A09.getInt(columnIndexOrThrow6);
                    if (!A09.isNull(columnIndexOrThrow7)) {
                        num = Integer.valueOf(A09.getInt(columnIndexOrThrow7));
                    } else {
                        num = null;
                    }
                    int i4 = A09.getInt(columnIndexOrThrow8);
                    String string8 = A09.getString(columnIndexOrThrow9);
                    String string9 = A09.getString(columnIndexOrThrow10);
                    if (!A09.isNull(columnIndexOrThrow11)) {
                        i = A09.getInt(columnIndexOrThrow11);
                    } else {
                        i = 0;
                    }
                    AnonymousClass3P8 r21 = new AnonymousClass3P8(num, string6, string7, string8, string9, i2, i3, i4, z);
                    r21.A00 = j3;
                    if (i > 0 && (A002 = AnonymousClass915.A00(i)) != null) {
                        int ordinal = A002.ordinal();
                        if (ordinal == 0) {
                            str = "full";
                        } else if (ordinal == 1) {
                            str = "tall";
                        } else if (ordinal == 2) {
                            str = "compact";
                        } else {
                            throw new C13180jS();
                        }
                        r21.A03 = str;
                    }
                    arrayList.add(r21);
                }
                A09.close();
                A04.close();
                C18740tg.A06(string);
                if (arrayList.size() == 0) {
                    arrayList = null;
                }
                if (j2 == 0) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(j2);
                }
                r7 = new AnonymousClass3F4(valueOf, string, string2, string3, string4, string5, arrayList, A03);
                r1 = (C88854Uh) r12;
            }
            r1.BsS(r7);
            return;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A02(AnonymousClass3T1 r19) {
        AnonymousClass1M0 A05;
        AnonymousClass3T1 r7 = r19;
        if (!(r7 instanceof C88854Uh)) {
            throw new IllegalArgumentException("message must be template message");
        } else if (r7.A1N != -1) {
            AnonymousClass12P r6 = this.A00;
            AnonymousClass1M0 A052 = r6.A05();
            try {
                C1495671s B1k = A052.B1k();
                try {
                    C88854Uh r5 = (C88854Uh) r7;
                    AnonymousClass3F4 BIE = r5.BIE();
                    ContentValues contentValues = new ContentValues(5);
                    contentValues.put("message_row_id", Long.valueOf(r7.A1N));
                    contentValues.put("content_text_data", BIE.A02);
                    contentValues.put("footer_text_data", BIE.A03);
                    contentValues.put("template_id", BIE.A05);
                    contentValues.put("csat_trigger_expiration_ts", BIE.A00);
                    contentValues.put("category", BIE.A01);
                    contentValues.put("tag", BIE.A04);
                    contentValues.put("mask_linked_devices", Boolean.valueOf(BIE.A07));
                    boolean z = false;
                    if (A052.A02.A08("message_template", "INSERT_TEMPLATE_SQL", contentValues, 5) == r7.A1N) {
                        z = true;
                    }
                    C18740tg.A0F(z, "TemplateMessageStore/insertOrUpdateTemplateData/inserted row should have same row_id");
                    List<AnonymousClass3P8> list = r5.BIE().A06;
                    if (list != null) {
                        for (AnonymousClass3P8 r4 : list) {
                            long j = r7.A1N;
                            A05 = r6.A05();
                            ContentValues A002 = A00(r4, j);
                            long j2 = r4.A00;
                            if (j2 == -1) {
                                r4.A00 = A05.A02.A04("message_template_button", "INSERT_TEMPLATE_BUTTON_SQL", A002);
                            } else {
                                if (A05.A02.A01(A002, "message_template_button", "_id = ?", "UPDATE_TEMPLATE_BUTTON_SQL", new String[]{String.valueOf(j2)}) != 1) {
                                    Log.e("TemplateMessageStore/insertOrUpdateTemplateButton/fail to update template button.");
                                }
                            }
                            A05.close();
                        }
                    }
                    B1k.A00();
                    B1k.close();
                    A052.close();
                    return;
                } catch (Throwable th) {
                    B1k.close();
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    A052.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } else {
            throw new IllegalArgumentException("main message part must be inserted before");
        }
        throw th;
    }

    public AnonymousClass1F1(C19700wN r1, AnonymousClass12P r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
