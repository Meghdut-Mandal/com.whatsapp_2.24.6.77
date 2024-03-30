package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.camera.VoipLiteCamera;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1Hs  reason: invalid class name and case insensitive filesystem */
public final class C25801Hs {
    public final C19730wQ A00;
    public final C220412q A01;
    public final C24541Cv A02;
    public final C20810yC A03;
    public final C21010yW A04;
    public final AnonymousClass1C5 A05;
    public final C21390zA A06;
    public final C19970wo A07;
    public final C25821Hu A08;
    public final C25811Ht A09;
    public final C25121Fb A0A;

    public C25801Hs(C21390zA r2, C19730wQ r3, C19970wo r4, C220412q r5, C25821Hu r6, C24541Cv r7, C20810yC r8, C25811Ht r9, C21010yW r10, C25121Fb r11, AnonymousClass1C5 r12) {
        AnonymousClass00C.A0D(r4, 1);
        AnonymousClass00C.A0D(r8, 2);
        AnonymousClass00C.A0D(r7, 3);
        AnonymousClass00C.A0D(r10, 4);
        AnonymousClass00C.A0D(r5, 5);
        AnonymousClass00C.A0D(r11, 7);
        AnonymousClass00C.A0D(r6, 8);
        AnonymousClass00C.A0D(r2, 9);
        AnonymousClass00C.A0D(r3, 10);
        AnonymousClass00C.A0D(r12, 11);
        this.A07 = r4;
        this.A03 = r8;
        this.A02 = r7;
        this.A04 = r10;
        this.A01 = r5;
        this.A09 = r9;
        this.A0A = r11;
        this.A08 = r6;
        this.A06 = r2;
        this.A00 = r3;
        this.A05 = r12;
    }

    public final AnonymousClass3T1 A04(AnonymousClass11F r11) {
        Cursor A092;
        C24541Cv r5 = this.A02;
        ArrayList arrayList = new ArrayList();
        try {
            AnonymousClass1M0 A042 = r5.A04.get();
            try {
                A092 = A042.A02.A09(AnonymousClass2xD.A07, "GET_LAST_SIGNIFICANT_OUTGOING_MESSAGES_SQL", new String[]{String.valueOf(r5.A00.A08(r11)), String.valueOf(1)});
                while (A092.moveToNext()) {
                    AnonymousClass3T1 A012 = r5.A07.A01(A092, r11);
                    if (A012 != null) {
                        arrayList.add(A012);
                    }
                }
                A092.close();
                A042.close();
            } catch (Throwable th) {
                A042.close();
                throw th;
            }
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e((Throwable) e);
            r5.A03.A03();
        } catch (IllegalStateException e2) {
            Log.i("msgstore/getLastSignificantOutgoingMessages/IllegalStateException ", e2);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        if (!arrayList.isEmpty()) {
            return (AnonymousClass3T1) arrayList.get(0);
        }
        return null;
        throw th;
    }

    public final String A08(AnonymousClass3T1 r7) {
        String str;
        AnonymousClass00C.A0D(r7, 0);
        if (r7 instanceof C88854Uh) {
            AnonymousClass3F4 BIE = ((C88854Uh) r7).BIE();
            AnonymousClass00C.A08(BIE);
            str = BIE.A05;
        } else {
            str = null;
        }
        if (r7 instanceof AnonymousClass2bZ) {
            if (C20800yB.A01(C21000yV.A02, this.A03, 7893)) {
                str = C203369nr.A05(r7);
            } else {
                str = this.A08.A00(r7);
            }
        }
        if (r7.A1T(4194304)) {
            str = r7.A1J.A01;
            if (C20800yB.A01(C21000yV.A02, this.A03, 4658)) {
                this.A0A.A00(new AnonymousClass3IP(AnonymousClass02N.A03(Arrays.copyOf(new C25111Fa[]{C25111Fa.SKIP_ADDONS, C25111Fa.SKIP_THUMBNAILS}, 2)), false), r7);
                String str2 = (String) r7.A1L.A00;
                if (str2 != null) {
                    return str2;
                }
            }
        }
        return str;
    }

    public final void A09(C20890yK r4, AnonymousClass3T1 r5) {
        C21010yW r1 = this.A04;
        r1.Bly(r4);
        if (!r5.A1T(4194304) && this.A06.A00) {
            r1.Bph(true);
        }
    }

    public final boolean A0A(AnonymousClass3T1 r5) {
        String A002;
        if (r5 instanceof C88854Uh) {
            return true;
        }
        if (!(r5 instanceof AnonymousClass2bZ)) {
            return false;
        }
        if (C20800yB.A01(C21000yV.A02, this.A03, 7893)) {
            A002 = C203369nr.A05(r5);
        } else {
            A002 = this.A08.A00(r5);
        }
        if (A002 == null) {
            return false;
        }
        return true;
    }

    public static final int A00(AnonymousClass141 r2) {
        AnonymousClass3L0 r22 = r2.A0E;
        if (r22 != null) {
            if (r22.A02()) {
                return 2;
            }
            if (r22.A01()) {
                return 3;
            }
        }
        return 1;
    }

    public static final String A02(AnonymousClass3T1 r1) {
        if (r1 instanceof C88854Uh) {
            return ((C88854Uh) r1).BIE().A04;
        }
        return null;
    }

    public final long A03(AnonymousClass3T1 r6) {
        return TimeUnit.MILLISECONDS.toSeconds(Math.max(C19970wo.A00(this.A07) - r6.A0G, 0));
    }

    public final Integer A05(AnonymousClass3T1 r4) {
        String str;
        if (r4 instanceof C88854Uh) {
            AnonymousClass3F4 BIE = ((C88854Uh) r4).BIE();
            AnonymousClass00C.A08(BIE);
            str = BIE.A01;
        } else {
            str = null;
        }
        if (r4.A1T(4194304)) {
            str = "MARKETING_MESSAGE_SMB";
        } else if (str == null) {
            return null;
        }
        int i = 0;
        if ("TRANSACTIONAL".equals(str)) {
            i = 1;
        } else if ("NON_TRANSACTIONAL".equals(str)) {
            i = 2;
        } else if ("OTP".equals(str)) {
            i = 3;
        } else if ("MARKETING_MESSAGE_SMB".equals(str)) {
            i = 4;
        }
        return Integer.valueOf(i);
    }

    public final Long A06(AnonymousClass3T1 r6) {
        if (r6 == null) {
            return null;
        }
        return Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(Math.max(C19970wo.A00(this.A07) - r6.A0I, 0)));
    }

    public final String A07(AnonymousClass141 r4) {
        AnonymousClass11F r0 = r4.A0H;
        if (r0 == null) {
            return null;
        }
        C25811Ht r2 = this.A09;
        return AnonymousClass17V.A00(r2.A05(new Random()), r0.getRawString());
    }

    public final boolean A0B(AnonymousClass3T1 r4, int i) {
        C20810yC r2 = this.A03;
        C21000yV r1 = C21000yV.A02;
        if ((!C20800yB.A01(r1, r2, 7800) || i != 2) && ((!C20800yB.A01(r1, r2, 7801) || i != 3) && !A0A(r4) && !r4.A1T(4194304))) {
            return false;
        }
        return true;
    }

    public static final String A01(int i) {
        switch (i) {
            case 0:
                return "undefined";
            case 1:
                return "image";
            case 2:
                return "audio";
            case 3:
                return "video";
            case 4:
                return "vcard";
            case 5:
                return "location";
            case 8:
                return "call";
            case 9:
                return "document";
            case 10:
                return "missed_call";
            case 13:
                return "gif";
            case 16:
                return "livelocation";
            case 19:
                return "hsm_rejected";
            case 20:
                return "sticker";
            case 23:
                return "product";
            case 24:
                return "group_invite";
            case 25:
                return "template_image";
            case 26:
                return "template_document";
            case 27:
                return "template_hsm";
            case 28:
                return "template_video";
            case 29:
                return "template_gif";
            case 30:
                return "template_location";
            case 32:
                return "template_quick_reply";
            case 33:
                return "blank_reply";
            case 37:
                return "catalog";
            case 42:
                return "view_once_image";
            case 43:
                return "view_once_video";
            case 44:
                return "order";
            case 49:
                return "buttons_response";
            case 51:
                return "payment_invite";
            case 52:
                return "product_list";
            case 54:
                return "checkout";
            case 55:
                return "interactive_message";
            case 56:
                return "reaction";
            case AnonymousClass8SU.IS_GROUP_HISTORY_MESSAGE_FIELD_NUMBER /*57*/:
                return "interactive_image_message";
            case 58:
                return "invisible_hello";
            case 59:
                return "waffle_image";
            case AnonymousClass8SX.POLL_CREATION_MESSAGE_V2_FIELD_NUMBER /*60*/:
                return "waffle_video";
            case 61:
                return "waffle_gif";
            case 62:
                return "interactive_video_message";
            case 63:
                return "interactive_document_message";
            case AnonymousClass8SX.SCHEDULED_CALL_EDIT_MESSAGE_FIELD_NUMBER /*65*/:
                return "payment_background_image";
            case 66:
                return "poll";
            case AnonymousClass8SX.BOT_INVOKE_MESSAGE_FIELD_NUMBER /*67*/:
                return "poll_vote";
            case 72:
                return "request_phone";
            case 73:
                return "share_phone_number";
            case AnonymousClass8SX.LOTTIE_STICKER_MESSAGE_FIELD_NUMBER /*74*/:
                return "edited_message";
            case AnonymousClass8SX.EVENT_MESSAGE_FIELD_NUMBER /*75*/:
                return "peer_data_link_preview_request_response";
            case AnonymousClass8SX.ENC_EVENT_RESPONSE_MESSAGE_FIELD_NUMBER /*76*/:
                return "peer_data_sticker_request_response";
            case AnonymousClass8SX.COMMENT_MESSAGE_FIELD_NUMBER /*77*/:
                return "ephemeral_sync_response";
            case AnonymousClass8SX.NEWSLETTER_ADMIN_INVITE_MESSAGE_FIELD_NUMBER /*78*/:
                return "view_once_text";
            case AnonymousClass8SX.EXTENDED_TEXT_MESSAGE_WITH_PARENT_KEY_FIELD_NUMBER /*79*/:
                return "pin_in_chat";
            case AnonymousClass8SX.PLACEHOLDER_MESSAGE_FIELD_NUMBER /*80*/:
                return "scheduled_call";
            case 81:
                return "push_to_video";
            case AnonymousClass8SX.SECRET_ENCRYPTED_MESSAGE_FIELD_NUMBER /*82*/:
                return "view_once_audio";
            case 83:
                return "scheduled_call_edit_legacy";
            case 84:
                return "peer_data_placeholder_resend_response";
            case 85:
                return "interactive_location_message";
            case 86:
                return "scheduled_call_edit";
            case 87:
                return "request_welcome";
            case 88:
                return "bot_feedback_message";
            case 89:
                return "no_interop_support";
            case VoipLiteCamera.DEFAULT_SUPERNOVA_ORIENTATION /*90*/:
                return "call_log";
            case 91:
                return "bcall";
            case 92:
                return "event";
            case 93:
                return "event_response";
            case 94:
                return "newsletter_admin_invite";
            case 95:
                return "fixed_content_placeholder";
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("FMessageType_");
                sb.append(i);
                return sb.toString();
        }
    }
}
