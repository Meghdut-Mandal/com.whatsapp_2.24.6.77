package X;

import com.whatsapp.util.Log;
import java.util.Iterator;
import org.json.JSONException;

/* renamed from: X.9Pk  reason: invalid class name and case insensitive filesystem */
public class C194369Pk {
    public final AnonymousClass1FO A00;

    public AnonymousClass2bV A00(C20310xM r10, AnonymousClass8SX r11, C64933Qa r12, long j) {
        String str;
        C207219uk BA8;
        C207089uX r0;
        String str2;
        if (AnonymousClass000.A1P(r11.bitField1_ & 8)) {
            AnonymousClass8SV r02 = r11.interactiveMessage_;
            if (r02 == null) {
                r02 = AnonymousClass8SV.DEFAULT_INSTANCE;
            }
            C172358Nn r03 = r02.body_;
            if (r03 == null) {
                r03 = C172358Nn.DEFAULT_INSTANCE;
            }
            str = r03.text_;
        } else if ((r11.bitField1_ & 1) != 0) {
            C173308Re r04 = r11.buttonsMessage_;
            if (r04 == null) {
                r04 = C173308Re.DEFAULT_INSTANCE;
            }
            str = r04.contentText_;
        } else {
            Log.e("MessageWithLinkStatusFactory/buildMessageWithLinkStatusMessage e2eMessage is not InteractiveMessage or ButtonsMessage");
            str = "";
        }
        AnonymousClass2bV A0Y = C165597tg.A0Y(r12, str, j);
        AnonymousClass11F r3 = r12.A00;
        C18740tg.A06(r3);
        try {
            String A04 = C203219nY.A04(r11);
            if (A04 != null) {
                String optString = C36441kJ.A1C(A04).optString("reference_id");
                if (!AnonymousClass14B.A0F(optString)) {
                    try {
                        Iterator it = AnonymousClass1FF.A00(r10.A0d, r3, 6).iterator();
                        while (it.hasNext()) {
                            AnonymousClass3T1 A0l = C36391kE.A0l(it);
                            if ((A0l instanceof C23043B1o) && (BA8 = ((C23043B1o) A0l).BA8()) != null && (r0 = BA8.A04) != null && r0.A03.size() > 0) {
                                C206569tc r7 = (C206569tc) C36391kE.A0t(BA8.A04.A03);
                                C206969uL r1 = r7.A01;
                                if ("open_webview".equals(r1.A00) && (str2 = r1.A01) != null && optString.equals(C36441kJ.A1C(str2).optString("reference_id"))) {
                                    r7.A00 = true;
                                    this.A00.A00(A0Y, A0l);
                                    r10.A0k(A0l);
                                }
                            }
                        }
                    } catch (JSONException unused) {
                        Log.e("MessageWithLinkStatusFactory/updateMessageWithLinkMessageStatus can't parse button's paramsJson correctly");
                        return A0Y;
                    }
                }
            }
        } catch (JSONException unused2) {
            Log.e("MessageWithLinkStatusFactory/buildMessageWithLinkStatusMessage can't parse json string");
        }
        return A0Y;
    }

    public C194369Pk(AnonymousClass1FO r1) {
        this.A00 = r1;
    }
}
