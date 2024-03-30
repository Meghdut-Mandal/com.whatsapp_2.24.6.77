package X;

import android.database.Cursor;
import com.whatsapp.TextData;

/* renamed from: X.3rk  reason: invalid class name and case insensitive filesystem */
public final class C78213rk implements AnonymousClass4S2, AnonymousClass4S3, AnonymousClass4S4, C17760rz {
    public final AnonymousClass005 A00;

    public C78213rk(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public void B7J(AnonymousClass3T1 r9) {
        Cursor A09;
        AnonymousClass00C.A0D(r9, 0);
        C24921Eh r1 = (C24921Eh) this.A00.get();
        AnonymousClass2bV r92 = (AnonymousClass2bV) r9;
        boolean A1R = AnonymousClass000.A1R((r92.A1N > 0 ? 1 : (r92.A1N == 0 ? 0 : -1)));
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("TextMessageStore/fillTextInfo/message must have row_id set; key=");
        String[] A0C = AnonymousClass3T1.A0C(r92, A0u, A1R);
        AnonymousClass1M0 A04 = r1.A00.get();
        try {
            A09 = A04.A02.A09("SELECT description, page_title, url, font_style, text_color, background_color, preview_type, invite_link_group_type, counter_abuse_token FROM message_text WHERE message_row_id = ?", "GET_TEXT_MESSAGE_BY_ROW_ID_SQL", A0C);
            if (A09.moveToNext()) {
                r92.A04 = C36341k9.A0f(A09, "description");
                r92.A05 = C36341k9.A0f(A09, "page_title");
                r92.A06 = C36341k9.A0f(A09, "url");
                if (!A09.isNull(A09.getColumnIndexOrThrow("font_style"))) {
                    TextData textData = new TextData();
                    textData.fontStyle = C36351kA.A03(A09, "font_style");
                    textData.textColor = C36351kA.A03(A09, "text_color");
                    textData.backgroundColor = C36351kA.A03(A09, "background_color");
                    r92.A1Z(textData);
                }
                r92.A01 = C36351kA.A03(A09, "preview_type");
                r92.A00 = C36351kA.A03(A09, "invite_link_group_type");
                r92.A03 = C36341k9.A0f(A09, "counter_abuse_token");
            }
            A09.close();
            A04.close();
            r92.A1b(r1.A01.A05(r92));
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

    public void BKi(AnonymousClass3T1 r3) {
        AnonymousClass00C.A0D(r3, 0);
        AnonymousClass2bV r32 = (AnonymousClass2bV) r3;
        C24921Eh.A01(r32);
        C24921Eh.A00((C24921Eh) this.A00.get(), r32, false);
    }

    public void BwV(AnonymousClass3T1 r3) {
        AnonymousClass00C.A0D(r3, 0);
        AnonymousClass2bV r32 = (AnonymousClass2bV) r3;
        C24921Eh.A01(r32);
        C24921Eh.A00((C24921Eh) this.A00.get(), r32, true);
    }

    public static void A00(AnonymousClass3T1 r1, AnonymousClass005 r2) {
        ((C78213rk) r2.get()).BKi(r1);
    }
}
