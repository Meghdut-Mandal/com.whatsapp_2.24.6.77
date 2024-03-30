package X;

import java.util.List;

/* renamed from: X.6TQ  reason: invalid class name */
public class AnonymousClass6TQ {
    public final C19700wN A00;
    public final C21010yW A01;
    public final AnonymousClass6FO A02;
    public final AnonymousClass3TX A03;
    public final C224214g A04;
    public final C19770wU A05;
    public final List A06 = AnonymousClass001.A0I();
    public final AnonymousClass6JO A07;
    public final AnonymousClass6F6 A08;
    public final AnonymousClass005 A09;
    public final AnonymousClass005 A0A;
    public final AnonymousClass005 A0B;

    public void A03(int i, long j, int i2) {
        this.A05.Boy(new AnonymousClass73F(this, i, i2, j));
    }

    public static C1042258t A00(AnonymousClass6TQ r6, int i) {
        long A012;
        long A002;
        AnonymousClass6FO r0 = r6.A02;
        String A022 = r0.A02();
        AnonymousClass005 r4 = r0.A01;
        String A0t = C36371kC.A0t(C36391kE.A0H(r4), "/export/logging/attemptId");
        if (A0t == null) {
            A0t = C36361kB.A0l();
            C36341k9.A0x(C90464aC.A0C(r4), "/export/logging/attemptId", A0t);
        }
        C1042258t r3 = new C1042258t();
        r3.A09 = Integer.valueOf(i);
        r3.A0P = A022;
        r3.A0L = A0t;
        r3.A04 = Integer.valueOf(C36391kE.A0H(r4).getBoolean("/export/isDonor", false) ^ true ? 1 : 0);
        r3.A06 = Integer.valueOf(C36391kE.A0H(r4).getBoolean("/export/startedOnReceiver", false) ? 1 : 0);
        r3.A0J = C36441kJ.A0y(C36391kE.A0H(r4).getInt("/export/protocolVersion", 0));
        synchronized (r6) {
            A012 = r6.A04.A01();
        }
        r3.A0B = Long.valueOf(C36391kE.A0B(A012));
        if (i == 4 || i == 11 || i == 13 || i == 15) {
            C227915v r1 = (C227915v) r6.A0A.get();
            if (i == 11) {
                r3.A00 = C90524aI.A0Z(r1.A00(r6.A08.A00()));
            } else if (i == 15) {
                AnonymousClass6JO r2 = r6.A07;
                r3.A0F = C36441kJ.A0y(AnonymousClass6JO.A00(r2, "import/msg/success"));
                r3.A0E = C36441kJ.A0y(AnonymousClass6JO.A00(r2, "import/msg/failed"));
                r3.A0D = C36441kJ.A0y(AnonymousClass6JO.A00(r2, "import/msg/file/success"));
                r3.A0C = C36441kJ.A0y(AnonymousClass6JO.A00(r2, "import/msg/file/failed"));
            }
            Long A003 = ((AnonymousClass15x) r6.A09.get()).A00();
            long A023 = ((C20060wx) r6.A0B.get()).A02();
            if (A003 != null) {
                r3.A02 = C90524aI.A0Z(r1.A00(A003.longValue()));
            }
            A002 = r1.A00(A023);
        } else {
            if (i == 0) {
                A002 = ((C227915v) r6.A0A.get()).A00(((C20060wx) r6.A0B.get()).A02());
            }
            return r3;
        }
        r3.A0K = Long.valueOf(A002);
        return r3;
    }

    public void A02(int i) {
        this.A05.Boy(new C81283wl((Object) this, i, 48));
    }

    public AnonymousClass6TQ(C19700wN r3, C21010yW r4, AnonymousClass6JO r5, AnonymousClass6FO r6, AnonymousClass6F6 r7, AnonymousClass3TX r8, C19770wU r9, AnonymousClass005 r10, AnonymousClass005 r11, AnonymousClass005 r12) {
        this.A00 = r3;
        this.A05 = r9;
        this.A01 = r4;
        this.A03 = r8;
        this.A07 = r5;
        this.A0B = r10;
        this.A08 = r7;
        this.A02 = r6;
        this.A0A = r11;
        this.A09 = r12;
        C224214g r0 = new C224214g("fpm/LoggingManager/duration");
        this.A04 = r0;
        r0.A01();
    }

    public static void A01(C1042258t r8, AnonymousClass6TQ r9) {
        Integer num;
        String str;
        String str2;
        Integer num2;
        if (!C36381kD.A0m().equals(r8.A04) || (num2 = r8.A09) == null || num2.intValue() < 5) {
            r9.A01.Bly(r8);
        } else {
            C36321k7.A1K(r8, "fpm/LoggingManager/event saved to be transferred and logged from receiver, value: ", AnonymousClass000.A0u());
            r9.A06.add(r8);
        }
        Integer num3 = r8.A04;
        if (num3 != null && num3.intValue() == 0 && (num = r8.A09) != null && (str = r8.A0P) != null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("chat-transfer-");
            int intValue = num.intValue();
            switch (intValue) {
                case 0:
                    str2 = "canceled";
                    break;
                case 1:
                    str2 = "failed";
                    break;
                case 2:
                    str2 = "attempt_to_open_landing_screen";
                    break;
                case 3:
                    str2 = "open_landing_screen";
                    break;
                case 4:
                    str2 = "started";
                    break;
                case 5:
                    str2 = "open_qr_code_screen";
                    break;
                case 6:
                    str2 = "qr_code_generated";
                    break;
                case 7:
                    str2 = "qr_code_scanned";
                    break;
                case 8:
                    str2 = "new_device_found";
                    break;
                case 9:
                    str2 = "connected_to_peer";
                    break;
                case 10:
                    str2 = "export_started";
                    break;
                case 11:
                    str2 = "export_completed";
                    break;
                case 12:
                    str2 = "transfer_started";
                    break;
                case 13:
                    str2 = "transfer_completed";
                    break;
                case 14:
                    str2 = "import_started";
                    break;
                case 15:
                    str2 = "import_completed";
                    break;
                case 16:
                    str2 = "searching_for_peer";
                    break;
                default:
                    throw AnonymousClass000.A0d("Unknown enum value: ", AnonymousClass000.A0u(), intValue);
            }
            String A0q = AnonymousClass000.A0q(str2, A0u);
            Integer num4 = r8.A07;
            String str3 = null;
            if (num4 != null) {
                int intValue2 = num4.intValue();
                switch (intValue2) {
                    case 0:
                        str3 = "feature_unavailable";
                        break;
                    case 1:
                        str3 = "failed_to_set_server_flag";
                        break;
                    case 2:
                        str3 = "failed_to_generate_qr_code";
                        break;
                    case 3:
                        str3 = "failed_to_parse_qr_code";
                        break;
                    case 4:
                        str3 = "phone_number_mismatch";
                        break;
                    case 5:
                        str3 = "failed_to_connect";
                        break;
                    case 6:
                        str3 = "cannot_access_chat_storage";
                        break;
                    case 7:
                        str3 = "cannot_create_migration_directory";
                        break;
                    case 8:
                        str3 = "cannot_write_metadata";
                        break;
                    case 9:
                        str3 = "cannot_write_protobuf";
                        break;
                    case 10:
                        str3 = "insufficient_disk_space";
                        break;
                    case 11:
                        str3 = "cannot_fetch_key";
                        break;
                    case 12:
                        str3 = "invalid_key_type";
                        break;
                    case 13:
                        str3 = "cannot_create_encryption_zip";
                        break;
                    case 14:
                        str3 = "failed_aesgcm_encryption";
                        break;
                    case 15:
                        str3 = "lost_connection";
                        break;
                    case 16:
                        str3 = "improper_message_received";
                        break;
                    case 17:
                        str3 = "cannot_retrieve_key_data";
                        break;
                    case 18:
                        str3 = "unexpected_schema";
                        break;
                    case 19:
                        str3 = "encryption_zip_not_found";
                        break;
                    case 20:
                        str3 = "failed_aesgcm_decryption";
                        break;
                    case 21:
                        str3 = "failed_file_management";
                        break;
                    case 22:
                        str3 = "messages_zip_not_found";
                        break;
                    case 23:
                        str3 = "failed_unzip_message_import";
                        break;
                    case 24:
                        str3 = "unknown";
                        break;
                    case 25:
                        str3 = "authentication_error";
                        break;
                    case 26:
                        str3 = "unable_to_start_server";
                        break;
                    case 27:
                        str3 = "wifi_direct_error";
                        break;
                    default:
                        throw AnonymousClass000.A0d("Unknown enum value: ", AnonymousClass000.A0u(), intValue2);
                }
            } else {
                Integer num5 = r8.A03;
                if (num5 != null) {
                    int intValue3 = num5.intValue();
                    switch (intValue3) {
                        case 0:
                            str3 = "cancel_on_landing_screen";
                            break;
                        case 1:
                            str3 = "cancel_on_qr_code_scan_screen";
                            break;
                        case 2:
                            str3 = "cancel_on_qr_code_display_screen";
                            break;
                        case 3:
                            str3 = "cancel_during_pairing";
                            break;
                        case 4:
                            str3 = "cancel_during_export";
                            break;
                        case 5:
                            str3 = "cancel_during_transfer";
                            break;
                        case 6:
                            str3 = "cancel_during_import";
                            break;
                        case 7:
                            str3 = "permissions_needed_not_granted";
                            break;
                        case 8:
                            str3 = "wifi_off";
                            break;
                        case 9:
                            str3 = "location_off";
                            break;
                        case 10:
                            str3 = "local_network_not_granted";
                            break;
                        case 11:
                            str3 = "network_not_connected";
                            break;
                        case 12:
                            str3 = "cancellation_on_other_device";
                            break;
                        default:
                            throw AnonymousClass000.A0d("Unknown enum value: ", AnonymousClass000.A0u(), intValue3);
                    }
                }
            }
            AnonymousClass3TX r4 = r9.A03;
            String str4 = r8.A0L;
            Integer num6 = r8.A06;
            AnonymousClass00C.A0D(A0q, 0);
            if (AnonymousClass3TX.A02(r4)) {
                C62243Fi r3 = new C62243Fi();
                r3.A01("event_name", A0q);
                r3.A01("funnel_id", str);
                if (str4 != null) {
                    r3.A01("ios_attempt_id", str4);
                }
                if (str3 != null) {
                    r3.A01("client_error_type", str3);
                }
                if (num6 != null) {
                    int intValue4 = num6.intValue();
                    r3.A00("fpm_entry_point", intValue4);
                    r3.A00("google_migrate_import_error", intValue4);
                }
                C36321k7.A1Q("FunnelLogger/event-name: ", A0q, AnonymousClass000.A0u());
                ((C19770wU) r4.A03.get()).Boy(new C80313vC(r4, r3, 33));
            }
        }
    }
}
