package X;

import android.database.Cursor;
import com.whatsapp.InteractiveAnnotation;
import com.whatsapp.SerializablePoint;
import com.whatsapp.jid.Jid;
import java.util.LinkedList;

/* renamed from: X.3ry  reason: invalid class name and case insensitive filesystem */
public class C78353ry implements AnonymousClass4S2, AnonymousClass4S3, AnonymousClass4S4, C17760rz {
    public final AnonymousClass005 A00;
    public final AnonymousClass005 A01;
    public final AnonymousClass005 A02;

    public static void A00(C78353ry r3, AnonymousClass3T1 r4) {
        AnonymousClass00C.A0D(r4, 0);
        AnonymousClass2bU r1 = (AnonymousClass2bU) r4;
        ((AnonymousClass1DG) r3.A01.get()).A02(r1);
        ((AnonymousClass1GF) r3.A02.get()).A01(r1.A1Y(), r4.A1N);
    }

    public void B7J(AnonymousClass3T1 r29) {
        InteractiveAnnotation[] interactiveAnnotationArr;
        Cursor A09;
        InteractiveAnnotation interactiveAnnotation;
        C28981Uw r1;
        AnonymousClass3T1 r4 = r29;
        AnonymousClass00C.A0D(r4, 0);
        AnonymousClass1DG r3 = (AnonymousClass1DG) this.A01.get();
        AnonymousClass2bU r42 = (AnonymousClass2bU) r4;
        boolean A1R = AnonymousClass000.A1R((r42.A1N > 0 ? 1 : (r42.A1N == 0 ? 0 : -1)));
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MediaCoreMessageStore/fillMediaInfo/message must have row_id set; key=");
        String[] A0C = AnonymousClass3T1.A0C(r42, A0u, A1R);
        AnonymousClass12P r9 = r3.A03;
        AnonymousClass1M0 A04 = r9.get();
        try {
            Cursor A092 = A04.A02.A09("SELECT message_row_id, chat_row_id, autotransfer_retry_enabled, multicast_id, media_job_uuid, transferred, transcoded, file_path, file_size, suspicious_content, trim_from, trim_to, face_x, face_y, media_key, media_key_timestamp, width, height, has_streaming_sidecar, gif_attribution, thumbnail_height_width_ratio, direct_path, first_scan_sidecar, first_scan_length, message_url, mime_type, file_length, media_name, file_hash, media_duration, page_count, enc_file_hash, partial_media_hash, partial_media_enc_hash, is_animated_sticker, original_file_hash, mute_video, media_caption, media_upload_handle, sticker_flags, raw_transcription_text FROM message_media WHERE message_row_id = ?", "GET_MESSAGE_MEDIA_SQL", A0C);
            try {
                if (A092.moveToNext()) {
                    C65013Qj A012 = r3.A01(A092);
                    long j = r42.A1N;
                    int i = 1;
                    C18740tg.A0E(AnonymousClass000.A1R((j > 0 ? 1 : (j == 0 ? 0 : -1))), "MediaCoreMessageStore/loadInteractiveAnnotations/invalid row_id");
                    LinkedList linkedList = new LinkedList();
                    AnonymousClass1M0 A042 = r9.get();
                    try {
                        C224114e r92 = A042.A02;
                        String[] strArr = new String[1];
                        C36401kF.A1T(strArr, 0, j);
                        Cursor A093 = r92.A09("SELECT _id, message_row_id, skip_confirmation, location_latitude, location_longitude, location_name, newsletter_jid_row_id, newsletter_server_message_id, newsletter_name, newsletter_content_type, newsletter_accessibility_text, sort_order FROM message_media_interactive_annotation WHERE message_row_id = ? ORDER BY sort_order", "GET_MESSAGE_MEDIA_INTERACTIVE_ANNOTATION_SQL", strArr);
                        while (A093.moveToNext()) {
                            try {
                                String[] strArr2 = new String[i];
                                C36401kF.A1T(strArr2, 0, C36351kA.A07(A093, "_id"));
                                A09 = r92.A09("SELECT message_media_interactive_annotation_row_id, x, y, sort_order FROM message_media_interactive_annotation_vertex WHERE message_media_interactive_annotation_row_id = ? ORDER BY sort_order", "GET_MESSAGE_MEDIA_INTERACTIVE_ANNOTATION_VERTEX_SQL", strArr2);
                                SerializablePoint[] serializablePointArr = new SerializablePoint[A09.getCount()];
                                int i2 = 0;
                                while (A09.moveToNext()) {
                                    serializablePointArr[i2] = new SerializablePoint(C36431kI.A00(A09, "x"), C36431kI.A00(A09, "y"));
                                    i2++;
                                }
                                A09.close();
                                boolean z = false;
                                if (A093.getLong(A093.getColumnIndexOrThrow("skip_confirmation")) == 1) {
                                    z = true;
                                }
                                boolean A1V = AnonymousClass000.A1V(C36341k9.A0f(A093, "location_name"));
                                boolean A1P = AnonymousClass000.A1P(C36351kA.A03(A093, "newsletter_jid_row_id"));
                                if (A1V) {
                                    interactiveAnnotation = new InteractiveAnnotation(C36341k9.A0f(A093, "location_name"), serializablePointArr, C36431kI.A00(A093, "location_latitude"), C36431kI.A00(A093, "location_longitude"), z);
                                } else {
                                    if (A1P) {
                                        int A03 = C36351kA.A03(A093, "newsletter_jid_row_id");
                                        int A032 = C36351kA.A03(A093, "newsletter_server_message_id");
                                        String A0f = C36341k9.A0f(A093, "newsletter_name");
                                        C52332pG A002 = C55152uA.A00(Integer.valueOf(C36351kA.A03(A093, "newsletter_content_type")));
                                        String A0f2 = C36341k9.A0f(A093, "newsletter_accessibility_text");
                                        Jid A094 = r3.A02.A09((long) A03);
                                        C65313Ro r0 = C28981Uw.A03;
                                        if ((A094 instanceof C28981Uw) && (r1 = (C28981Uw) A094) != null) {
                                            interactiveAnnotation = new InteractiveAnnotation(r1, A002, A0f, A0f2, serializablePointArr, A032, z);
                                        }
                                    }
                                    i = 1;
                                }
                                linkedList.add(interactiveAnnotation);
                                i = 1;
                            } catch (Throwable th) {
                                if (A093 != null) {
                                    A093.close();
                                }
                                throw th;
                            }
                        }
                        A093.close();
                        A042.close();
                        if (linkedList.isEmpty()) {
                            interactiveAnnotationArr = null;
                        } else {
                            interactiveAnnotationArr = (InteractiveAnnotation[]) linkedList.toArray(new InteractiveAnnotation[0]);
                        }
                        A012.A0b = interactiveAnnotationArr;
                        r42.A1c(A092, A012);
                    } catch (Throwable th2) {
                        A042.close();
                        throw th2;
                    }
                }
                A092.close();
                A04.close();
                if (r42.A01 == null) {
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("MediaCoreMessageStore/fillMediaInfo; media was not found for message: id=");
                    A0u2.append(r42.A1N);
                    A0u2.append(", type=");
                    C36351kA.A1R(A0u2, r42.A1I);
                    r42.A01 = new C65013Qj();
                    return;
                }
                return;
                throw th;
            } catch (Throwable th3) {
                if (A092 != null) {
                    A092.close();
                }
                throw th3;
            }
        } catch (Throwable th4) {
            try {
                A04.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }

    public C78353ry(AnonymousClass005 r1, AnonymousClass005 r2, AnonymousClass005 r3) {
        C36321k7.A11(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void BKi(AnonymousClass3T1 r1) {
        A00(this, r1);
    }

    public void BwV(AnonymousClass3T1 r1) {
        A00(this, r1);
    }
}
