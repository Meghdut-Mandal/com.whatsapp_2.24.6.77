package X;

import android.database.Cursor;

/* renamed from: X.3rw  reason: invalid class name and case insensitive filesystem */
public final class C78333rw implements AnonymousClass4S2, AnonymousClass4S3, AnonymousClass4S4, C17760rz {
    public final AnonymousClass005 A00;
    public final AnonymousClass005 A01;

    public void BKi(AnonymousClass3T1 r18) {
        AnonymousClass3T1 r2 = r18;
        AnonymousClass00C.A0D(r2, 0);
        C78213rk.A00(r2, this.A01);
        AnonymousClass1F1 r5 = (AnonymousClass1F1) this.A00.get();
        AnonymousClass2cV r0 = (AnonymousClass2cV) r2;
        String str = r0.A02;
        int i = r0.A00;
        Integer num = r0.A01;
        if (r2.A1N == -1) {
            throw AnonymousClass001.A08("main message part must be inserted before");
        } else if (r2.A1I == 32) {
            AnonymousClass3P8 r7 = new AnonymousClass3P8(num, "", str, "", (String) null, 1, i, 0, false);
            AnonymousClass1M0 A05 = r5.A00.A05();
            try {
                A05.A02.A04("message_template_button", "INSERT_TEMPLATE_BUTTON_SQL", AnonymousClass1F1.A00(r7, r2.A1N));
                A05.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        } else {
            throw AnonymousClass001.A08("only for template button reply message");
        }
    }

    public void BwV(AnonymousClass3T1 r2) {
        AnonymousClass00C.A0D(r2, 0);
        ((C78213rk) this.A01.get()).BwV(r2);
    }

    public void B7J(AnonymousClass3T1 r18) {
        Cursor A09;
        AnonymousClass3T1 r3 = r18;
        AnonymousClass00C.A0D(r3, 0);
        ((C78213rk) this.A01.get()).B7J(r3);
        long j = r3.A1N;
        AnonymousClass1M0 A04 = ((AnonymousClass1F1) this.A00.get()).A00.get();
        try {
            C224114e r9 = A04.A02;
            String[] strArr = new String[1];
            C36351kA.A1V(strArr, 0, j);
            A09 = r9.A09("SELECT _id, text_data, extra_data, button_type, used, selected_index, selected_carousel_card_index, otp_button_type, extra_consent_data, otp_matched_package_name, webview_presentation FROM message_template_button WHERE message_row_id = ?", "GET_TEMPLATE_MESSAGE_BUTTONS_SQL", strArr);
            Integer num = null;
            if (!A09.moveToFirst()) {
                C36341k9.A1M("TemplateMessageStore/getTemplateButtonReplyData/Template button reply data doesn't exist in the table; messageRowId=", AnonymousClass000.A0u(), j);
                A09.close();
                A04.close();
                return;
            }
            long A07 = C36351kA.A07(A09, "_id");
            String A0f = C36341k9.A0f(A09, "text_data");
            String A0f2 = C36341k9.A0f(A09, "extra_data");
            String A0f3 = C36341k9.A0f(A09, "extra_consent_data");
            int A03 = C36351kA.A03(A09, "button_type");
            boolean A1S = AnonymousClass000.A1S(C36351kA.A03(A09, "used"), 1);
            int A032 = C36351kA.A03(A09, "selected_index");
            if (!A09.isNull(A09.getColumnIndexOrThrow("selected_carousel_card_index"))) {
                num = Integer.valueOf(C36351kA.A03(A09, "selected_carousel_card_index"));
            }
            AnonymousClass3P8 r7 = new AnonymousClass3P8(num, A0f, A0f2, A0f3, (String) null, A03, A032, 0, A1S);
            r7.A00 = A07;
            A09.close();
            A04.close();
            AnonymousClass2cV r32 = (AnonymousClass2cV) r3;
            r32.A02 = r7.A01;
            r32.A00 = r7.A05;
            r32.A01 = r7.A07;
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

    public C78333rw(AnonymousClass005 r1, AnonymousClass005 r2) {
        C36321k7.A0x(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
