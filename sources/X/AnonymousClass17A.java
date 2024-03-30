package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.data.ProfilePhotoChange;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.17A  reason: invalid class name */
public class AnonymousClass17A {
    public final C19700wN A00;
    public final AnonymousClass163 A01;
    public final C219712j A02;
    public final AnonymousClass12P A03;
    public final AnonymousClass17N A04;
    public final AnonymousClass12O A05;
    public final AnonymousClass17K A06;
    public final AnonymousClass17O A07;
    public final AnonymousClass17E A08;

    public static boolean A00(AnonymousClass17A r7, AnonymousClass11F r8, int i) {
        Cursor A09;
        AnonymousClass1M0 A042 = r7.A03.get();
        try {
            boolean z = false;
            A09 = A042.A02.A09("SELECT EXISTS( SELECT * FROM message_system JOIN message_view ON message_view._id = message_system.message_row_id  WHERE chat_row_id = ?  AND action_type = ?) as message_exists", "HAS_MESSAGE_WITH_SYSTEM_ACTION_SQL", new String[]{String.valueOf(r7.A01.A08(r8)), String.valueOf(i)});
            if (A09.moveToFirst() && A09.getInt(A09.getColumnIndexOrThrow("message_exists")) == 1) {
                z = true;
            }
            A09.close();
            A042.close();
            return z;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public long A01(AnonymousClass11F r8) {
        Cursor A09;
        AnonymousClass1M0 A042 = this.A03.get();
        try {
            A09 = A042.A02.A09("SELECT _id FROM message_system JOIN message_view ON message_view._id = message_system.message_row_id  WHERE chat_row_id = ?  AND (action_type = 19 OR action_type = 67)", "GET_PLAINTEXT_DISABLED_MESSAGE_ROW_ID_SQL", new String[]{String.valueOf(this.A01.A08(r8))});
            if (A09.moveToFirst()) {
                long j = (long) A09.getInt(A09.getColumnIndexOrThrow("_id"));
                A09.close();
                A042.close();
                return j;
            }
            A09.close();
            A042.close();
            return -1;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A02(AnonymousClass2bI r19) {
        AnonymousClass1M0 r9;
        long j;
        Long l;
        long j2;
        long j3;
        AnonymousClass2bI r6 = r19;
        int i = r6.A00;
        if (i <= 0 || i >= 170) {
            this.A00.A0E("system-message-store-invalid-action", Integer.toString(i), true);
        }
        AnonymousClass12P r8 = this.A03;
        AnonymousClass1M0 A052 = r8.A05();
        try {
            C1495671s B1k = A052.B1k();
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("message_row_id", Long.valueOf(r6.A1N));
                contentValues.put("action_type", Integer.valueOf(i));
                C224114e r3 = A052.A02;
                r3.A08("message_system", "INSERT_MESSAGE_SYSTEM_SQL", contentValues, 5);
                if (r6 instanceof C181478nX) {
                    C181478nX r10 = (C181478nX) r6;
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("message_row_id", Long.valueOf(r10.A1N));
                    AnonymousClass3SW.A01(contentValues2, "old_data", r10.A01);
                    r3.A08("message_system_value_change", "INSERT_MESSAGE_SYSTEM_VALUE_CHANGE_SQL", contentValues2, 5);
                }
                if (r6 instanceof C181388nO) {
                    C181388nO r102 = (C181388nO) r6;
                    ContentValues contentValues3 = new ContentValues();
                    contentValues3.put("message_row_id", Long.valueOf(r102.A1N));
                    AnonymousClass3SW.A01(contentValues3, "old_data", r102.A00);
                    r3.A08("message_system_value_change", "INSERT_MESSAGE_SYSTEM_VALUE_CHANGE_SQL", contentValues3, 5);
                }
                if (r6 instanceof C181468nW) {
                    C181468nW r103 = (C181468nW) r6;
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("message_row_id", Long.valueOf(r103.A1N));
                    AnonymousClass3SW.A01(contentValues4, "old_data", r103.A00);
                    r3.A08("message_system_value_change", "INSERT_MESSAGE_SYSTEM_VALUE_CHANGE_SQL", contentValues4, 5);
                }
                if (r6 instanceof AnonymousClass2cG) {
                    AnonymousClass2cG r104 = (AnonymousClass2cG) r6;
                    ContentValues contentValues5 = new ContentValues();
                    contentValues5.put("message_row_id", Long.valueOf(r104.A1N));
                    AnonymousClass3SW.A01(contentValues5, "old_data", r104.A00);
                    r3.A08("message_system_value_change", "INSERT_MESSAGE_SYSTEM_VALUE_CHANGE_SQL", contentValues5, 5);
                }
                if (r6 instanceof C181758nz) {
                    C181758nz r92 = (C181758nz) r6;
                    ContentValues contentValues6 = new ContentValues();
                    contentValues6.put("message_row_id", Long.valueOf(r92.A1N));
                    contentValues6.put("is_me_joined", Integer.valueOf(r92.A00));
                    r3.A08("message_system_group", "INSERT_MESSAGE_SYSTEM_GROUP_SQL", contentValues6, 5);
                    for (UserJid A072 : r92.A01) {
                        long A073 = this.A02.A07(A072);
                        if (A073 >= 0) {
                            ContentValues contentValues7 = new ContentValues();
                            contentValues7.put("message_row_id", Long.valueOf(r92.A1N));
                            contentValues7.put("user_jid_row_id", Long.valueOf(A073));
                            r3.A08("message_system_chat_participant", "INSERT_MESSAGE_SYSTEM_CHAT_PARTICIPANTS", contentValues7, 5);
                        }
                    }
                }
                if (r6 instanceof C181238n9) {
                    C181238n9 r2 = (C181238n9) r6;
                    ContentValues contentValues8 = new ContentValues();
                    contentValues8.put("message_row_id", Long.valueOf(r2.A1N));
                    AnonymousClass3SW.A01(contentValues8, "new_photo_id", r2.A1Z());
                    ProfilePhotoChange profilePhotoChange = r2.A00;
                    if (profilePhotoChange != null) {
                        AnonymousClass3SW.A03(contentValues8, "old_photo", profilePhotoChange.oldPhoto);
                        AnonymousClass3SW.A03(contentValues8, "new_photo", r2.A00.newPhoto);
                        AnonymousClass3SW.A01(contentValues8, "new_photo_id", String.valueOf(r2.A00.newPhotoId));
                    }
                    if (!TextUtils.isEmpty(r2.A1Z()) || r2.A00 != null) {
                        r3.A08("message_system_photo_change", "INSERT_TABLE_MESSAGE_SYSTEM_PHOTO_CHANGE", contentValues8, 5);
                    }
                }
                if (r6 instanceof C181248nA) {
                    C181248nA r22 = (C181248nA) r6;
                    UserJid userJid = r22.A01;
                    if (userJid != null) {
                        j2 = this.A02.A07(userJid);
                    } else {
                        j2 = -1;
                    }
                    UserJid userJid2 = r22.A00;
                    if (userJid2 != null) {
                        j3 = this.A02.A07(userJid2);
                    } else {
                        j3 = -1;
                    }
                    if (!(j2 == -1 && j3 == -1)) {
                        ContentValues contentValues9 = new ContentValues();
                        contentValues9.put("message_row_id", Long.valueOf(r22.A1N));
                        AnonymousClass3SW.A00(contentValues9, Long.valueOf(j2), "old_jid_row_id");
                        AnonymousClass3SW.A00(contentValues9, Long.valueOf(j3), "new_jid_row_id");
                        r3.A08("message_system_number_change", "INSERT_TABLE_MESSAGE_SYSTEM_NUMBER_CHANGE", contentValues9, 5);
                    }
                }
                if (r6 instanceof AnonymousClass2cJ) {
                    AnonymousClass2cJ r93 = (AnonymousClass2cJ) r6;
                    ContentValues contentValues10 = new ContentValues();
                    contentValues10.put("message_row_id", Long.valueOf(r93.A1N));
                    AnonymousClass3SW.A00(contentValues10, Long.valueOf((long) r93.A00), "device_added_count");
                    AnonymousClass3SW.A00(contentValues10, Long.valueOf((long) r93.A01), "device_removed_count");
                    r3.A08("message_system_device_change", "INSERT_TABLE_MESSAGE_SYSTEM_DEVICE_CHANGE", contentValues10, 5);
                }
                if (r6 instanceof AnonymousClass2cH) {
                    AnonymousClass2cH r23 = (AnonymousClass2cH) r6;
                    ContentValues contentValues11 = new ContentValues();
                    contentValues11.put("message_row_id", Long.valueOf(r23.A1N));
                    contentValues11.put("biz_state_id", Integer.valueOf(r23.A00));
                    r3.A08("message_system_initial_privacy_provider", "INSERT_TABLE_MESSAGE_SYSTEM_INITIAL_PRIVACY_PROVIDER", contentValues11, 5);
                }
                if (r6 instanceof AnonymousClass2cP) {
                    AnonymousClass2cP r24 = (AnonymousClass2cP) r6;
                    ContentValues contentValues12 = new ContentValues();
                    contentValues12.put("message_row_id", Long.valueOf(r24.A1N));
                    UserJid userJid3 = r24.A01;
                    if (userJid3 != null) {
                        contentValues12.put("sender_jid_row_id", Long.valueOf(this.A02.A07(userJid3)));
                    }
                    UserJid userJid4 = r24.A00;
                    if (userJid4 != null) {
                        contentValues12.put("receiver_jid_row_id", Long.valueOf(this.A02.A07(userJid4)));
                    }
                    AnonymousClass3SW.A01(contentValues12, "amount_with_symbol", r24.A03);
                    C64933Qa r25 = r24.A02;
                    if (r25 != null) {
                        AnonymousClass11F r1 = r25.A00;
                        if (r1 != null) {
                            contentValues12.put("remote_message_sender_jid_row_id", Long.valueOf(this.A02.A07(r1)));
                        }
                        AnonymousClass3SW.A02(contentValues12, "remote_message_from_me", r25.A02);
                        AnonymousClass3SW.A01(contentValues12, "remote_message_key", r25.A01);
                    }
                    r3.A08("message_payment", "INSERT_TABLE_MESSAGE_SYSTEM_PAYMENT", contentValues12, 5);
                    if (r6 instanceof C181568ng) {
                        C181568ng r105 = (C181568ng) r6;
                        ContentValues contentValues13 = new ContentValues();
                        contentValues13.put("message_row_id", Long.valueOf(r105.A1N));
                        AnonymousClass3SW.A01(contentValues13, "web_stub", r105.A02);
                        AnonymousClass3SW.A01(contentValues13, "amount", r105.A01);
                        AnonymousClass3SW.A01(contentValues13, "transfer_date", r105.A04);
                        AnonymousClass3SW.A01(contentValues13, "payment_sender_name", r105.A03);
                        contentValues13.put("expiration", Integer.valueOf(r105.A00));
                        r3.A08("message_payment_transaction_reminder", "INSERT_TABLE_MESSAGE_SYSTEM_PAYMENT_TRANSACTION_REMINDER", contentValues13, 5);
                    }
                    if (r6 instanceof C181578nh) {
                        C181578nh r106 = (C181578nh) r6;
                        ContentValues contentValues14 = new ContentValues();
                        contentValues14.put("message_row_id", Long.valueOf(r106.A1N));
                        AnonymousClass3SW.A01(contentValues14, "transaction_info", r106.A03);
                        AnonymousClass3SW.A01(contentValues14, "transaction_data", r106.A01);
                        AnonymousClass3SW.A01(contentValues14, "init_timestamp", r106.A02);
                        AnonymousClass3SW.A01(contentValues14, "update_timestamp", r106.A04);
                        AnonymousClass3SW.A01(contentValues14, "amount_data", r106.A00);
                        r3.A08("message_payment_status_update", "INSERT_TABLE_MESSAGE_SYSTEM_PAYMENT_STATUS_UPDATE", contentValues14, 5);
                    }
                }
                if (r6 instanceof C181208n6) {
                    C181208n6 r26 = (C181208n6) r6;
                    r9 = this.A04.A00.A05();
                    try {
                        ContentValues contentValues15 = new ContentValues(3);
                        contentValues15.put("message_row_id", Long.valueOf(r26.A1N));
                        contentValues15.put("service", Integer.valueOf(r26.A00));
                        contentValues15.put("invite_used", Boolean.valueOf(r26.A01));
                        r9.A02.A04("message_system_payment_invite_setup", "INSERT_TABLE_MESSAGE_SYSTEM_PAYMENT_INVITE_SETUP", contentValues15);
                        r9.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
                if (r6 instanceof C181418nR) {
                    C181418nR r94 = (C181418nR) r6;
                    AnonymousClass00C.A0D(r94, 1);
                    ContentValues contentValues16 = new ContentValues(2);
                    contentValues16.put("message_row_id", Long.valueOf(r94.A1N));
                    contentValues16.put("threshold", Integer.valueOf(r94.A00));
                    r3.A05("message_system_group_auto_restrict", "INSERT_TABLE_MESSAGE_SYSTEM_GROUP_AUTO_RESTRICT", contentValues16);
                }
                if (r6 instanceof AnonymousClass2cL) {
                    AnonymousClass2cL r27 = (AnonymousClass2cL) r6;
                    ContentValues contentValues17 = new ContentValues();
                    contentValues17.put("message_row_id", Long.valueOf(r27.A1N));
                    contentValues17.put("is_blocked", Integer.valueOf(r27.A00 ? 1 : 0));
                    r3.A08("message_system_block_contact", "INSERT_TABLE_MESSAGE_SYSTEM_BLOCK_CONTACT", contentValues17, 5);
                }
                if (r6 instanceof AnonymousClass2cM) {
                    AnonymousClass2cM r28 = (AnonymousClass2cM) r6;
                    ContentValues contentValues18 = new ContentValues();
                    contentValues18.put("message_row_id", Long.valueOf(r28.A1N));
                    contentValues18.put("biz_opt_out_category", Integer.valueOf(r28.A01));
                    contentValues18.put("biz_opt_out_action", Integer.valueOf(r28.A00));
                    r3.A08("message_system_opt_out", "INSERT_TABLE_MESSAGE_SYSTEM_BIZ_OPT_OUT", contentValues18, 5);
                }
                if (r6 instanceof C181218n7) {
                    C181218n7 r29 = (C181218n7) r6;
                    ContentValues contentValues19 = new ContentValues();
                    contentValues19.put("message_row_id", Long.valueOf(r29.A1N));
                    contentValues19.put("setting_duration", Integer.valueOf(r29.A00));
                    r3.A08("message_system_ephemeral_setting_not_applied", "INSERT_TABLE_MESSAGE_SYSTEM_EPHEMERAL_SETTING_NOT_APPLIED", contentValues19, 5);
                }
                if (r6 instanceof AnonymousClass2cI) {
                    AnonymousClass2cI r210 = (AnonymousClass2cI) r6;
                    r9 = r8.A05();
                    ContentValues contentValues20 = new ContentValues();
                    contentValues20.put("message_row_id", Long.valueOf(r210.A1N));
                    contentValues20.put("business_name", r210.A01);
                    contentValues20.put("privacy_message_type", Integer.valueOf(r210.A00));
                    r9.A02.A04("message_system_business_state", "INSERT_SYSTEM_MESSAGE_BUSINESS_STATE", contentValues20);
                    r9.close();
                }
                if (r6 instanceof C46992cO) {
                    C46992cO r211 = (C46992cO) r6;
                    ContentValues contentValues21 = new ContentValues();
                    contentValues21.put("message_row_id", Long.valueOf(r211.A1N));
                    AnonymousClass3SW.A01(contentValues21, "call_id", r211.A01);
                    contentValues21.put("is_video_call", Integer.valueOf(r211.A02 ? 1 : 0));
                    contentValues21.put("call_type", Integer.valueOf(r211.A00));
                    r3.A08("message_system_linked_group_call", "INSERT_TABLE_MESSAGE_SYSTEM_LINKED_GROUP_CALL", contentValues21, 5);
                }
                if (r6 instanceof C181408nQ) {
                    C181408nQ r212 = (C181408nQ) r6;
                    ContentValues contentValues22 = new ContentValues();
                    contentValues22.put("message_row_id", Long.valueOf(r212.A1N));
                    Integer num = r212.A02;
                    if (num == null) {
                        l = null;
                    } else {
                        l = Long.valueOf(num.longValue());
                    }
                    AnonymousClass3SW.A00(contentValues22, l, "old_group_type");
                    contentValues22.put("new_group_type", Integer.valueOf(r212.A00));
                    GroupJid groupJid = r212.A01;
                    if (groupJid == null) {
                        contentValues22.put("linked_parent_group_jid_row_id", -1);
                    } else {
                        contentValues22.put("linked_parent_group_jid_row_id", Long.valueOf(this.A02.A07(groupJid)));
                    }
                    r3.A08("message_system_community_link_changed", "INSERT_MESSAGE_SYSTEM_COMMUNITY_LINK_CHANGED", contentValues22, 5);
                }
                if (r6 instanceof C181398nP) {
                    C181398nP r213 = (C181398nP) r6;
                    ContentValues contentValues23 = new ContentValues();
                    contentValues23.put("message_row_id", Long.valueOf(r213.A1N));
                    String str = r213.A00;
                    if (str != null) {
                        contentValues23.put("linked_parent_group_name", str);
                    }
                    r3.A08("message_system_group_with_parent", "INSERT_MESSAGE_SYSTEM_GROUP_WITH_PARENT_JID", contentValues23, 5);
                }
                if (r6 instanceof AnonymousClass2cS) {
                    AnonymousClass2cS r95 = (AnonymousClass2cS) r6;
                    for (AnonymousClass3QK r214 : r95.A03) {
                        ContentValues contentValues24 = new ContentValues();
                        contentValues24.put("message_row_id", Long.valueOf(r95.A1N));
                        contentValues24.put("subgroup_raw_jid", r214.A02.getRawString());
                        AnonymousClass3SW.A01(contentValues24, "subgroup_subject", r214.A04);
                        AnonymousClass147 r12 = r95.A01;
                        if (r12 == null) {
                            j = -1;
                        } else {
                            j = this.A02.A07(r12);
                        }
                        contentValues24.put("parent_group_jid_row_id", Long.valueOf(j));
                        r3.A08("message_system_sibling_group_link_change", "INSERT_TABLE_MESSAGE_SYSTEM_SIBLING_GROUP_CHANGE_LINK", contentValues24, 5);
                    }
                }
                if (r6 instanceof C181748ny) {
                    C181748ny r96 = (C181748ny) r6;
                    for (C195869Wj r215 : r96.A00) {
                        ContentValues contentValues25 = new ContentValues();
                        contentValues25.put("message_row_id", Long.valueOf(r96.A1N));
                        long A074 = this.A02.A07(r215.A02);
                        if (A074 == -1) {
                            C18740tg.A0D(false, "BindMessageUtil/bindJidRowId/no jid row found");
                            this.A00.A0E("wa-community-event", "SystemMessageStore/insertSystemMessageWithGroupNodes/could not bind jid row id", true);
                        } else {
                            contentValues25.put("group_jid_row_id", Long.valueOf(A074));
                            AnonymousClass3SW.A01(contentValues25, "group_subject", r215.A03);
                            contentValues25.put("group_node_type", Integer.valueOf(r215.A00));
                            AnonymousClass3SW.A00(contentValues25, Long.valueOf((long) r215.A01), "version");
                            r3.A08("message_system_with_group_nodes", "INSERT_TABLE_MESSAGE_SYSTEM_WITH_GROUP_NODES", contentValues25, 5);
                        }
                    }
                }
                if (r6 instanceof C181228n8) {
                    C181228n8 r216 = (C181228n8) r6;
                    ContentValues contentValues26 = new ContentValues();
                    contentValues26.put("message_row_id", Long.valueOf(r216.A1N));
                    AnonymousClass3SW.A01(contentValues26, "agent_name", r216.A00);
                    contentValues26.put("is_unassigned_chat", Integer.valueOf(r216.A01 ? 1 : 0));
                    r3.A08("message_system_chat_assignment", "INSERT_TABLE_MESSAGE_SYSTEM_CHAT_ASSIGNMENT", contentValues26, 5);
                }
                if (r6 instanceof AnonymousClass2cN) {
                    AnonymousClass2cN r217 = (AnonymousClass2cN) r6;
                    ContentValues contentValues27 = new ContentValues(4);
                    contentValues27.put("message_row_id", Long.valueOf(r217.A1N));
                    contentValues27.put("creation_message_row_id", Long.valueOf(r217.A01));
                    contentValues27.put("call_timestamp_ms", Long.valueOf(r217.A00));
                    contentValues27.put("call_title", r217.A02);
                    r3.A08("message_system_scheduled_call_start", "INSERT_TABLE_MESSAGE_SYSTEM_SCHEDULED_CALL_START", contentValues27, 5);
                }
                if (r6 instanceof AnonymousClass5JE) {
                    AnonymousClass5JE r218 = (AnonymousClass5JE) r6;
                    ContentValues contentValues28 = new ContentValues();
                    contentValues28.put("message_row_id", Long.valueOf(r218.A1N));
                    contentValues28.put("original_message_row_id", Long.valueOf(r218.A00));
                    contentValues28.put("reminder_timestamp_ms", Long.valueOf(r218.A01));
                    String str2 = r218.A02;
                    if (str2 != null) {
                        contentValues28.put("reminder_content", str2);
                        r3.A08("message_system_reminder_setup", "INSERT_TABLE_MESSAGE_SYSTEM_REMINDER_SETUP", contentValues28, 5);
                    } else {
                        AnonymousClass00C.A0G("reminderContent");
                        th = new RuntimeException("Redex: Unreachable code after no-return invoke");
                        throw th;
                    }
                }
                if (r6 instanceof AnonymousClass2cK) {
                    AnonymousClass2cK r62 = (AnonymousClass2cK) r6;
                    ContentValues contentValues29 = new ContentValues();
                    contentValues29.put("message_row_id", Long.valueOf(r62.A1N));
                    contentValues29.put("original_message_row_id", Long.valueOf(r62.A00));
                    String str3 = r62.A01;
                    if (str3 != null) {
                        contentValues29.put("original_reminder_content", str3);
                        r3.A08("message_system_reminder_sent", "INSERT_TABLE_MESSAGE_SYSTEM_REMINDER_SENT", contentValues29, 5);
                    } else {
                        AnonymousClass00C.A0G("originalReminderContent");
                        th = new RuntimeException("Redex: Unreachable code after no-return invoke");
                        throw th;
                    }
                }
                B1k.A00();
                B1k.close();
                A052.close();
            } catch (Throwable th2) {
                B1k.close();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                A052.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public AnonymousClass17A(C19700wN r1, AnonymousClass163 r2, AnonymousClass17O r3, C219712j r4, AnonymousClass12P r5, AnonymousClass17N r6, AnonymousClass12O r7, AnonymousClass17E r8, AnonymousClass17K r9) {
        this.A02 = r4;
        this.A01 = r2;
        this.A00 = r1;
        this.A05 = r7;
        this.A03 = r5;
        this.A08 = r8;
        this.A06 = r9;
        this.A04 = r6;
        this.A07 = r3;
    }
}
