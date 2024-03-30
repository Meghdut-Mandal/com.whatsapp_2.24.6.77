package X;

import android.database.Cursor;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.io.File;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.3ld  reason: invalid class name and case insensitive filesystem */
public final class C74453ld implements AnonymousClass4U1 {
    public final AnonymousClass005 A00;
    public final Set A01 = C36411kG.A15(Integer.valueOf(R.id.lazy_field_carousel_cards));

    public C74453ld(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public void BOL(C63503Kh r22) {
        Cursor A09;
        String str;
        AnonymousClass2c6 r2;
        File file;
        C63503Kh r23 = r22;
        if (r23.A02 == R.id.lazy_field_carousel_cards) {
            AnonymousClass3T1 r6 = r23.A03;
            AnonymousClass00C.A0E(r6, "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageInteractive");
            AnonymousClass2bZ r62 = (AnonymousClass2bZ) r6;
            AnonymousClass1F6 r5 = (AnonymousClass1F6) this.A00.get();
            long j = r62.A1N;
            ArrayList arrayList = null;
            if (r5.A03.A0E(4668) && C203369nr.A09(r62)) {
                String[] A1a = C36371kC.A1a(j);
                ArrayList A0I = AnonymousClass001.A0I();
                AnonymousClass1M0 A04 = r5.A02.get();
                try {
                    A09 = A04.A02.A09("SELECT _id, message_row_id, addon_message_index, chat_row_id, file_path, file_size, media_key, media_key_timestamp, width, height, direct_path, message_url, mime_type, file_length, file_hash, enc_file_hash, partial_media_hash, partial_media_enc_hash, original_file_hash, thumbnail, thumbnail_direct_path, thumbnail_hash, enc_thumbnail_hash, scans_sidecar, transferred FROM addon_message_media WHERE message_row_id = ?", "GET_ADDON_MESSAGE_MEDIA_SQL", A1a);
                    while (A09.moveToNext()) {
                        String A0f = C36341k9.A0f(A09, "mime_type");
                        if (A0f == null) {
                            C36341k9.A1M("AddonMessageMediaStore/createAddonMessagesForMessageRow; media type not found for message: id=", AnonymousClass000.A0u(), j);
                        } else {
                            int A03 = C36351kA.A03(A09, "addon_message_index");
                            C206489tU r0 = r62.A00.A02;
                            C18740tg.A06(r0);
                            C207219uk r12 = (C207219uk) r0.A00.get(A03);
                            if (r12.A00 == 9) {
                                AnonymousClass2c6 r24 = new AnonymousClass2c6(new C46772be(r62.A1J, A03), r12, r62.A0I);
                                AnonymousClass3XY r1 = r12.A07;
                                r2 = r24;
                                if (r1 != null) {
                                    UserJid userJid = r1.A01;
                                    r2 = r24;
                                    if (userJid != null) {
                                        r24.A01 = userJid;
                                        r24.A06 = r1.A06;
                                        r24.A09 = r1.A09;
                                        r24.A04 = r1.A04;
                                        r24.A03 = r1.A03;
                                        r24.A0A = r1.A0A;
                                        r24.A0B = r1.A0B;
                                        r24.A08 = r1.A08;
                                        r24.A07 = r1.A07;
                                        r24.A00 = r1.A00;
                                        r24.A02 = r1.A02;
                                        r24.A05 = r1.A05;
                                        r2 = r24;
                                    }
                                }
                            } else {
                                switch (A0f.hashCode()) {
                                    case -1487394660:
                                        str = "image/jpeg";
                                        break;
                                    case -1487018032:
                                        str = "image/webp";
                                        break;
                                    case -879264467:
                                        str = "image/jpg";
                                        break;
                                    case -879258763:
                                        str = "image/png";
                                        break;
                                    case 1331848029:
                                        if (A0f.equals("video/mp4")) {
                                            C46772be r122 = new C46772be(r62.A1J, A03);
                                            long j2 = r62.A0I;
                                            C206489tU r25 = r62.A00.A02;
                                            C18740tg.A06(r25);
                                            r2 = new C181778o1(r122, (C207219uk) r25.A00.get(A03), j2);
                                            break;
                                        }
                                        break;
                                }
                                if (A0f.equals(str)) {
                                    C46772be r123 = new C46772be(r62.A1J, A03);
                                    long j3 = r62.A0I;
                                    C206489tU r26 = r62.A00.A02;
                                    C18740tg.A06(r26);
                                    r2 = new C46872bo(r123, (C207219uk) r26.A00.get(A03), j3);
                                }
                                StringBuilder A0u = AnonymousClass000.A0u();
                                A0u.append("AddonMessageMediaStore/createAddonMessage; unsupported media type for message: id=");
                                A0u.append(r62.A1N);
                                C36321k7.A1P(", type=", A0f, A0u);
                                continue;
                            }
                            C65013Qj r13 = new C65013Qj();
                            r13.A0C = C36351kA.A07(A09, "file_size");
                            r13.A0a = C36391kE.A1b(A09, "media_key");
                            r13.A0D = C36351kA.A07(A09, "media_key_timestamp");
                            r13.A0A = C36351kA.A03(A09, "width");
                            r13.A06 = C36351kA.A03(A09, "height");
                            r13.A0J = C36341k9.A0f(A09, "direct_path");
                            r13.A0X = C36391kE.A1b(A09, "scans_sidecar");
                            String A0f2 = C36341k9.A0f(A09, "file_path");
                            r13.A0O = C36341k9.A0f(A09, "partial_media_hash");
                            r13.A0N = C36341k9.A0f(A09, "partial_media_enc_hash");
                            boolean z = false;
                            if (A09.getLong(A09.getColumnIndexOrThrow("transferred")) == 1) {
                                z = true;
                            }
                            r13.A0V = z;
                            if (A0f2 == null) {
                                file = null;
                            } else {
                                file = new File(A0f2);
                            }
                            r13.A0I = r5.A00.A06(file);
                            r2.A01 = r13;
                            r2.A05 = C36341k9.A0f(A09, "mime_type");
                            r2.A07 = C36341k9.A0f(A09, "message_url");
                            r2.A00 = C36351kA.A07(A09, "file_length");
                            r2.A04 = C36341k9.A0f(A09, "file_hash");
                            r2.A03 = C36341k9.A0f(A09, "enc_file_hash");
                            AnonymousClass3L1 r9 = new AnonymousClass3L1();
                            r9.A04 = C36341k9.A0f(A09, "thumbnail_direct_path");
                            r9.A08 = C36341k9.A0f(A09, "thumbnail_hash");
                            r9.A05 = C36341k9.A0f(A09, "enc_thumbnail_hash");
                            r9.A0A = C36391kE.A1b(A09, "media_key");
                            r9.A02 = C36351kA.A07(A09, "media_key_timestamp");
                            byte[] A1b = C36391kE.A1b(A09, "thumbnail");
                            if (!(A1b == null || r2.A0V() == null)) {
                                r2.A1C(A1b);
                            }
                            r2.A12(r9);
                            A0I.add(A03, r2);
                        }
                    }
                    if (A0I.isEmpty()) {
                        C36341k9.A1M("AddonMessageMediaStore/createAddonMessagesForMessageRow; no addon message created for message: id=", AnonymousClass000.A0u(), j);
                        A09.close();
                        A04.close();
                    } else {
                        A09.close();
                        A04.close();
                        arrayList = A0I;
                    }
                } catch (Throwable th) {
                    try {
                        A04.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            r62.A1Y(arrayList);
            return;
        }
        return;
        throw th;
    }

    public Set BI3() {
        return this.A01;
    }

    public /* synthetic */ boolean BJq(C63503Kh r2) {
        return true;
    }
}
