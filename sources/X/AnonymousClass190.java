package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.190  reason: invalid class name */
public class AnonymousClass190 {
    public static Intent A0C(Context context) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.whatsapp.registration.phonenumberentry.RegisterPhone");
        className.putExtra("com.whatsapp.registration.RegisterPhone.resetstate", true);
        className.putExtra("com.whatsapp.registration.RegisterPhone.clear_phone_number", true);
        return className;
    }

    public static Intent A0M(Context context, long j) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.insufficientstoragespace.InsufficientStorageSpaceActivity");
        intent.putExtra("allowSkipKey", false);
        intent.putExtra("spaceNeededInBytes", j);
        return intent;
    }

    public static Intent A0O(Context context, long j, long j2, boolean z, boolean z2) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.whatsapp.registration.verifyphone.VerifyPhoneNumber");
        className.putExtra("sms_retry_time", j);
        className.putExtra("voice_retry_time", j2);
        className.putExtra("use_sms_retriever", z);
        className.putExtra("show_request_code_progress_dialog", true);
        className.putExtra("changenumber", z2);
        className.putExtra("EXTRA_SHOULD_REQUEST_VOICE_CALL", true);
        return className;
    }

    public static Intent A0P(Context context, Uri uri) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.deeplink.DeepLinkActivity");
        intent.setData(uri);
        intent.putExtra("source", 2);
        return intent;
    }

    public static Intent A0S(Context context, Bundle bundle, AnonymousClass11F r6, AnonymousClass147 r7, ArrayList arrayList, boolean z) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity");
        className.putExtra("edit_mode", true);
        className.putExtra("jid", AnonymousClass143.A03(r6));
        className.putExtra("quoted_message", bundle);
        className.putExtra("quoted_group_jid", AnonymousClass143.A03(r7));
        className.putExtra("has_number_from_url", z);
        className.putStringArrayListExtra("vcard_array", arrayList);
        return className;
    }

    public static Intent A0X(Context context, AnonymousClass11F r6, int i) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.gallery.MediaGalleryActivity");
        intent.putExtra("pos", -1);
        intent.putExtra("jid", AnonymousClass143.A03(r6));
        intent.putExtra("alert", true);
        intent.putExtra("key", i);
        return intent;
    }

    public static Intent A0Z(Context context, AnonymousClass11F r4, AnonymousClass147 r5, String str, List list, int i, int i2, int i3, long j, boolean z, boolean z2, boolean z3) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.gallerypicker.GalleryPickerBottomSheetActivity");
        intent.setAction("android.intent.action.PICK");
        intent.setData(MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        intent.putExtra("max_items", i);
        intent.putExtra("skip_max_items_new_limit", false);
        intent.putExtra("jid", r4.getRawString());
        intent.putExtra("quoted_message_row_id", j);
        intent.putExtra("quoted_group_jid", AnonymousClass143.A03(r5));
        intent.putExtra("number_from_url", z);
        intent.putExtra("send", true);
        intent.putExtra("picker_open_time", SystemClock.elapsedRealtime());
        intent.putExtra("origin", i2);
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.putExtra("mentions", C65713Te.A01(list));
        intent.putExtra("is_coming_from_chat", z2);
        intent.putExtra("is_send_as_document", z3);
        intent.putExtra("media_sharing_user_journey_origin", i3);
        return intent;
    }

    public static Intent A10(Context context, Integer num) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.textstatuscomposer.TextStatusComposerActivity");
        intent.putExtra("camera_origin", 4);
        intent.putExtra("entry_point", num);
        return intent;
    }

    public static Intent A18(Context context, String str, int i, int i2, int i3) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.camera.CameraActivity");
        intent.putExtra("jid", str);
        intent.putExtra("camera_origin", i);
        intent.putExtra("is_coming_from_chat", false);
        intent.putExtra("selected_uris", (Serializable) null);
        intent.putExtra("media_sharing_user_journey_origin", i2);
        intent.putExtra("media_sharing_user_journey_start_target", i3);
        return intent;
    }

    public static Intent A1G(Context context, String str, String str2, int i, int i2, long j) {
        boolean z = false;
        if (i > 0) {
            z = true;
        }
        C18740tg.A0B(z);
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.accountswitching.secondaryprocess.AccountSwitchingActivity");
        intent.putExtra("request_type", 4);
        intent.putExtra("remove_account_lid", str);
        intent.putExtra("number_of_accounts", i - 1);
        intent.putExtra("source", i2);
        intent.putExtra("switching_start_time_ms", j);
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra("account_language", str2);
        }
        intent.addFlags(268468224);
        return intent;
    }

    public static Intent A1H(Context context, String str, String str2, int i, boolean z) {
        boolean z2 = false;
        if (i > 0) {
            z2 = true;
        }
        C18740tg.A0B(z2);
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.accountswitching.secondaryprocess.AccountSwitchingActivity");
        intent.putExtra("request_type", 3);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("switch_to_account_lid", str);
        }
        intent.putExtra("number_of_accounts", i - 1);
        intent.putExtra("source", 12);
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra("account_language", str2);
        }
        intent.putExtra("abandon_add_account_from_back_press", z);
        intent.addFlags(268468224);
        return intent;
    }

    public static Intent A1I(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.payments.ui.MessageWithLinkWebViewActivity");
        C18740tg.A06(str);
        intent.putExtra("webview_url", str);
        intent.putExtra("webview_javascript_enabled", true);
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra("webview_callback", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            intent.putExtra("webview_cancel_callback", str3);
        }
        intent.putExtra("webview_should_ask_before_close", true);
        intent.putExtra("webview_hide_url", false);
        intent.putExtra("webview_open_new_tab_in_external_browser", true);
        intent.putExtra("webview_title_show_domain_only", false);
        intent.putExtra("webview_toolbar_v2", true);
        intent.putExtra("webview_can_navigate_back", true);
        intent.putExtra("deep_link_type_support", 1);
        intent.putExtra("webview_deeplink_enabled", true);
        return intent;
    }

    public static Intent A1L(Context context, String str, String str2, boolean z, boolean z2) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.webview.ui.WaInAppBrowsingActivity");
        C18740tg.A06(str);
        intent.putExtra("webview_url", str);
        intent.putExtra("webview_javascript_enabled", true);
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra("webview_callback", str2);
        }
        intent.putExtra("webview_hide_url", z);
        intent.putExtra("webview_javascript_enabled", true);
        intent.putExtra("webview_can_navigate_back", z2);
        return intent;
    }

    public Intent A1Y(Context context, AnonymousClass11F r3) {
        return A1Z(context, r3, 0);
    }

    public Intent A1a(Context context, AnonymousClass11F r5, String str, int i, boolean z, boolean z2, boolean z3) {
        Intent A1Z = A1Z(context, r5, 0);
        A1Z.putExtra("wa_type", i);
        A1Z.putExtra("share_msg", str);
        A1Z.putExtra("has_share", true);
        A1Z.putExtra("confirm", z);
        A1Z.putExtra("text_from_url", z2);
        A1Z.putExtra("number_from_url", z3);
        AnonymousClass3M2.A00(context, A1Z);
        return A1Z;
    }

    public static Intent A00(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.registration.phonenumberentry.ChangeNumber");
        return intent;
    }

    public static Intent A01(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.registration.ChangeNumberOverview");
        return intent;
    }

    public static Intent A02(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.registration.EULA");
        intent.setFlags(268468224);
        return intent;
    }

    public static Intent A03(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.HomeActivity");
        return intent;
    }

    public static Intent A04(Context context) {
        return new Intent().setClassName(context.getPackageName(), "com.whatsapp.HomeActivity").setAction(AnonymousClass1RI.A01);
    }

    public static Intent A05(Context context) {
        return new Intent().setClassName(context.getPackageName(), "com.whatsapp.HomeActivity").setAction(AnonymousClass1RI.A02);
    }

    public static Intent A06(Context context) {
        return new Intent().setClassName(context.getPackageName(), "com.whatsapp.HomeActivity").setAction(AnonymousClass1RI.A03);
    }

    public static Intent A07(Context context) {
        return new Intent().setClassName(context.getPackageName(), "com.whatsapp.HomeActivity").setAction(AnonymousClass1RI.A05);
    }

    public static Intent A08(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity");
        return intent;
    }

    public static Intent A09(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.Main");
        return intent;
    }

    public static Intent A0A(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.registration.RegisterName");
        return intent;
    }

    public static Intent A0B(Context context) {
        return new Intent().setClassName(context.getPackageName(), "com.whatsapp.registration.phonenumberentry.RegisterPhone");
    }

    public static Intent A0D(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.settings.SettingsPrivacy");
        return intent;
    }

    public static Intent A0E(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.status.audienceselector.StatusPrivacyActivity");
        return intent;
    }

    public static Intent A0F(Context context, int i) {
        return new Intent().setClassName(context.getPackageName(), "com.whatsapp.Conversation").putExtra("mat_entry_point", i);
    }

    public static Intent A0G(Context context, int i) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.backup.encryptedbackup.EncBackupMainActivity");
        intent.putExtra("user_action", i);
        return intent;
    }

    public static Intent A0H(Context context, int i) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.gallerypicker.GalleryPickerLauncher");
        intent.putExtra("media_sharing_user_journey_origin", i);
        return intent;
    }

    public static Intent A0I(Context context, int i, int i2, long j, long j2, long j3, boolean z, boolean z2) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.whatsapp.registration.verifyphone.VerifyPhoneNumber");
        className.putExtra("changenumber", z);
        className.putExtra("sms_retry_time", j);
        className.putExtra("voice_retry_time", j2);
        className.putExtra("wa_old_retry_time", j3);
        className.putExtra("use_sms_retriever", z2);
        className.putExtra("wa_old_eligible", i);
        className.putExtra("code_verification_mode", i2);
        return className;
    }

    public static Intent A0J(Context context, int i, long j, long j2, long j3, long j4, boolean z) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.registration.deviceswitching.DeviceSwitchingSelfServeEducationScreen");
        intent.putExtra("flash_type", i);
        intent.putExtra("change_number", z);
        intent.putExtra("sms_retry_time", j);
        intent.putExtra("voice_retry_time", j2);
        intent.putExtra("wa_old_retry_time", j3);
        intent.putExtra("email_otp_retry_time", j4);
        return intent;
    }

    public static Intent A0K(Context context, int i, long j, long j2, boolean z) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.registration.flashcall.PrimaryFlashCallEducationScreen");
        intent.putExtra("flash_type", i);
        intent.putExtra("sms_retry_time", j);
        intent.putExtra("voice_retry_time", j2);
        intent.putExtra("change_number", z);
        return intent;
    }

    public static Intent A0L(Context context, int i, boolean z) {
        String str;
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.settings.Settings");
        if (z) {
            str = "account_switcher_add_account";
        } else {
            str = "account_switcher";
        }
        intent.putExtra(str, true);
        intent.putExtra("source", i);
        return intent;
    }

    public static Intent A0N(Context context, long j, long j2, boolean z, boolean z2) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.whatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity");
        className.putExtra("change_number", z);
        className.putExtra("sms_retry_time", j);
        className.putExtra("voice_retry_time", j2);
        className.putExtra("use_sms_retriever", z2);
        return className;
    }

    public static Intent A0Q(Context context, Uri uri, Parcelable parcelable, boolean z) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.inappbugreporting.InAppBugReportingActivity");
        if (uri != null) {
            intent.putExtra("extra_screenshot_uri", uri.toString());
        }
        if (parcelable != null) {
            intent.putExtra("extra_call_log_key", parcelable);
        }
        intent.putExtra("extra_is_calling_bug", z);
        return intent;
    }

    public static Intent A0R(Context context, Uri uri, AnonymousClass11F r5, String str, String str2, boolean z) {
        return new Intent().setClassName(context.getPackageName(), "com.whatsapp.documentpicker.DocumentPreviewActivity").putExtra("jid", AnonymousClass143.A03(r5)).putExtra("uri", uri).putExtra("caption", str).putExtra("mentions", str2).putExtra("send", z).putExtra("clear_message_after_send", !TextUtils.isEmpty(str));
    }

    public static Intent A0T(Context context, Bundle bundle, ArrayList arrayList, int i, int i2) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.whatsapp.inappsupport.ui.SupportTopicsActivity");
        className.putParcelableArrayListExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.support_topics", arrayList);
        className.putExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.ui_version", i);
        className.putExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.contact_us_action", i2);
        if (bundle != null) {
            className.putExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.describe_problem_bundle", bundle);
        }
        return className;
    }

    public static Intent A0U(Context context, Parcelable parcelable, String str, String str2) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.wabloks.ui.WaBloksActivity");
        intent.putExtra("screen_name", str);
        intent.putExtra("screen_params", str2);
        intent.putExtra("screen_cache_config", parcelable);
        return intent;
    }

    public static Intent A0V(Context context, AnonymousClass3XT r4, Integer num, String str) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.textstatuscomposer.TextStatusComposerActivity");
        intent.putExtra("status_distribution", r4);
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.putExtra("entry_point", num);
        return intent;
    }

    public static Intent A0W(Context context, AnonymousClass11F r4) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.shareinvitelink.ShareGroupInviteLinkActivity");
        intent.putExtra("jid", r4.getRawString());
        return intent;
    }

    public static Intent A0Y(Context context, AnonymousClass11F r4, int i, int i2) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.whatsapp.ephemeral.ChangeEphemeralSettingActivity");
        className.putExtra("jid", r4.getRawString());
        className.putExtra("current_setting", i);
        className.putExtra("entry_point", i2);
        return className;
    }

    public static Intent A0a(Context context, AnonymousClass11F r4, String str, String str2, List list, int i, int i2, int i3, long j, boolean z) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.camera.CameraActivity");
        intent.putExtra("jid", AnonymousClass143.A03(r4));
        intent.putExtra("quoted_message_row_id", j);
        intent.putExtra("quoted_group_jid", str);
        intent.putExtra("chat_opened_from_url", z);
        intent.putExtra("camera_origin", i);
        intent.putExtra("android.intent.extra.TEXT", str2);
        intent.putExtra("mentions", C65713Te.A01(list));
        intent.putExtra("media_sharing_user_journey_origin", i2);
        intent.putExtra("media_sharing_user_journey_start_target", i3);
        return intent;
    }

    public static Intent A0b(Context context, AnonymousClass11F r4, boolean z, boolean z2, boolean z3) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.status.playback.StatusPlaybackActivity");
        intent.putExtra("jid", AnonymousClass143.A03(r4));
        intent.putExtra("single_contact_update", z);
        intent.putExtra("should_chain_viewed_statuses", z2);
        intent.putExtra("should_chain_viewed_statuses", z3);
        return intent;
    }

    public static Intent A0c(Context context, GroupJid groupJid) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.community.ManageGroupsInCommunityActivity");
        intent.putExtra("parent_group_jid", groupJid.getRawString());
        return intent;
    }

    public static Intent A0d(Context context, GroupJid groupJid, int i) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.community.CommunityHomeActivity");
        intent.putExtra("parent_group_jid", groupJid.getRawString());
        intent.putExtra("tab_start_position", i);
        StringBuilder sb = new StringBuilder();
        sb.append("whatsapp://community/");
        sb.append(groupJid.hashCode());
        intent.setData(Uri.parse(sb.toString()));
        intent.setFlags(603979776);
        return intent;
    }

    public static Intent A0e(Context context, GroupJid groupJid, int i) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.group.GroupPermissionsActivity");
        intent.putExtra("gid", groupJid.getRawString());
        intent.putExtra("entry_point", i);
        return intent;
    }

    public static Intent A0f(Context context, GroupJid groupJid, Long l, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.invites.InviteGroupParticipantsActivity");
        intent.putExtra("sms_invites_jids", arrayList3);
        intent.putExtra("jids", arrayList);
        intent.putExtra("invite_hashes", arrayList2);
        intent.putExtra("invite_expiration", l);
        intent.putExtra("group_jid", groupJid.getRawString());
        intent.putExtra("invite_trigger_source", i);
        return intent;
    }

    public static Intent A0g(Context context, GroupJid groupJid, ArrayList arrayList, int i, boolean z) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.invites.SMSPreviewInviteGroupParticipantsActivity");
        intent.putExtra("sms_invites_jids", arrayList);
        intent.putExtra("group_jid", groupJid.getRawString());
        intent.putExtra("all_participants_non_wa_in_request", z);
        intent.putExtra("invite_trigger_source", i);
        return intent;
    }

    public static Intent A0h(Context context, GroupJid groupJid, boolean z) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.community.CommunityMembersActivity");
        intent.putExtra("extra_community_jid", AnonymousClass143.A03(groupJid));
        intent.putExtra("extra_non_cag_members_view", z);
        return intent;
    }

    public static Intent A0i(Context context, GroupJid groupJid, boolean z) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.community.CommunityNavigationActivity");
        intent.putExtra("parent_group_jid", groupJid.getRawString());
        intent.putExtra("post_creation_flow", z);
        StringBuilder sb = new StringBuilder();
        sb.append("whatsapp://communityNavigation/");
        sb.append(groupJid.hashCode());
        intent.setData(Uri.parse(sb.toString()));
        intent.setFlags(603979776);
        return intent;
    }

    public static Intent A0j(Context context, Jid jid) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.settings.SettingsJidNotificationActivity");
        intent.putExtra("jid", jid.getRawString());
        return intent;
    }

    public static Intent A0k(Context context, Jid jid) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity");
        intent.putExtra("jid", AnonymousClass143.A03(jid));
        return intent;
    }

    public static Intent A0l(Context context, Jid jid, AnonymousClass3X9 r5) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.product.newsletterenforcements.appealsoutcome.NewsletterAppealsOutcomeActivity");
        intent.putExtra("jid", AnonymousClass143.A03(jid));
        intent.putExtra("newsletter-appeal-data", r5);
        return intent;
    }

    public static Intent A0m(Context context, Jid jid, Integer num, int i) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.biz.catalog.view.activity.CatalogListActivity");
        intent.putExtra("cache_jid", jid.getRawString());
        intent.putExtra("source", num);
        intent.putExtra("entry_point", i);
        return intent;
    }

    public static Intent A0n(Context context, Jid jid, Long l, int i, int i2, boolean z) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.newsletter.NewsletterInfoActivity");
        intent.putExtra("jid", AnonymousClass143.A03(jid));
        intent.putExtra("circular_transition", z);
        intent.putExtra("mat_entry_point", i);
        intent.putExtra("extra_forwarded_message_thread_type", i2);
        intent.putExtra("similar_newsletters_session_id", l);
        return intent;
    }

    public static Intent A0o(Context context, Jid jid, String str, float f, int i, int i2, int i3, int i4, boolean z) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.profile.ViewProfilePhoto");
        intent.putExtra("jid", jid.getRawString());
        intent.putExtra("circular_transition", z);
        if (str != null) {
            intent.putExtra("circular_return_name", str);
        }
        intent.putExtra("start_transition_alpha", f);
        intent.putExtra("start_transition_status_bar_color", i);
        intent.putExtra("return_transition_status_bar_color", i2);
        intent.putExtra("start_transition_navigation_bar_color", i3);
        intent.putExtra("return_transition_navigation_bar_color", i4);
        return intent;
    }

    public static Intent A0p(Context context, Jid jid, boolean z) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.chatinfo.ListChatInfoActivity");
        intent.putExtra("gid", AnonymousClass143.A03(jid));
        intent.putExtra("circular_transition", z);
        return intent;
    }

    public static Intent A0q(Context context, Jid jid, boolean z, boolean z2, boolean z3) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.group.GroupChatInfoActivity");
        intent.putExtra("gid", AnonymousClass143.A03(jid));
        intent.putExtra("circular_transition", z);
        intent.putExtra("show_description", z2);
        intent.putExtra("show_chat_action", z3);
        return intent;
    }

    public static Intent A0r(Context context, C28981Uw r4, int i) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.newsletter.ui.ShareNewsletterInviteLinkActivity");
        intent.putExtra("jid", r4.getRawString());
        intent.putExtra("entry_point", i);
        return intent;
    }

    public static Intent A0s(Context context, AnonymousClass147 r4) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.whatsapp.community.CommunitySettingsActivity");
        className.putExtra("parent_jid", r4.getRawString());
        return className;
    }

    public static Intent A0t(Context context, AnonymousClass147 r4) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity");
        className.putExtra("parent_jid", r4.getRawString());
        className.setFlags(335544320);
        return className;
    }

    public static Intent A0u(Context context, UserJid userJid) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.identity.IdentityVerificationActivity");
        intent.putExtra("jid", userJid.getRawString());
        return intent;
    }

    public static Intent A0v(Context context, UserJid userJid, Integer num, Integer num2, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.businesscollection.view.activity.CollectionProductListActivity");
        intent.putExtra("collection_id", str);
        intent.putExtra("collection_name", str2);
        intent.putExtra("cache_jid", userJid.getRawString());
        intent.putExtra("collection_index", str3);
        if (num != null) {
            intent.putExtra("category_browsing_entry_point", num);
        }
        if (num2 != null) {
            intent.putExtra("category_level", num2);
        }
        return intent;
    }

    public static Intent A0w(Context context, UserJid userJid, Integer num, boolean z, boolean z2) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.whatsapp.chatinfo.ContactInfoActivity");
        className.putExtra("jid", userJid.getRawString());
        className.putExtra("circular_transition", z);
        className.putExtra("should_show_chat_action", z2);
        className.putExtra("profile_entry_point", num);
        return className;
    }

    public static Intent A0x(Context context, UserJid userJid, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        AnonymousClass3F2 r0 = new AnonymousClass3F2(context, userJid, str);
        r0.A04 = z;
        r0.A03 = z2;
        r0.A01 = z3;
        r0.A02 = z4;
        return r0.A00();
    }

    public static Intent A0y(Context context, AnonymousClass3KJ r4) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.registration.parole.CustomRegistrationBlockActivity");
        if (r4 != null) {
            intent.putExtra("show_custom_fields", true);
            intent.putExtra("title_text", r4.A05);
            intent.putExtra("body_text", r4.A00);
            intent.putExtra("button_primary_text", r4.A02);
            intent.putExtra("button_primary_link", r4.A01);
            intent.putExtra("button_secondary_text", r4.A04);
            intent.putExtra("button_secondary_link", r4.A03);
        }
        return intent;
    }

    public static Intent A0z(Context context, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, List list) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.whatsapp.voipcalling.VoipActivityV2");
        if (list != null) {
            className.putStringArrayListExtra("jid", AnonymousClass143.A07(list));
        }
        if (bool != null) {
            className.putExtra("isTaskRoot", bool);
        }
        if (bool4 != null) {
            className.putExtra("newCall", bool4);
        }
        if (bool2 != null) {
            className.putExtra("video_call", bool2);
        }
        if (bool3 != null || C18860tw.A00(context) == null) {
            className.setFlags(268435456);
        }
        return className;
    }

    public static Intent A11(Context context, String str) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.avatar.editor.AvatarEditorLauncherActivity");
        intent.putExtra("origin", str);
        intent.addFlags(335544320);
        return intent;
    }

    public static Intent A12(Context context, String str) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.contact.picker.ContactPicker");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.setType("text/plain");
        intent.addFlags(524288);
        return intent;
    }

    public static Intent A13(Context context, String str) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.whatsapp.inappsupport.ui.SupportBloksActivity");
        try {
            intent.putExtra("screen_params", new JSONObject().put("params", new JSONObject().put("server_params", new JSONObject().put("entrypointid", str))).toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        intent.putExtra("screen_name", "com.bloks.www.cxthelp.whatsapp");
        return intent;
    }

    public static Intent A14(Context context, String str) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.backup.google.GoogleBackupService");
        if (!TextUtils.isEmpty(str)) {
            intent.setAction(str);
        }
        return intent;
    }

    public static Intent A15(Context context, String str) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.identity.IdentityVerificationActivity");
        intent.putExtra("jid", str);
        return intent;
    }

    public static Intent A16(Context context, String str, int i) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.email.EmailVerificationActivity");
        intent.putExtra("entrypoint", i);
        intent.putExtra("session_id", str);
        return intent;
    }

    public static Intent A17(Context context, String str, int i, int i2) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.email.UpdateEmailActivity");
        intent.putExtra("state", i);
        intent.putExtra("entrypoint", i2);
        intent.putExtra("session_id", str);
        return intent;
    }

    public static Intent A19(Context context, String str, int i, int i2, int i3, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.whatsapp.registration.verifyphone.VerifyPhoneNumber");
        className.putExtra("server_start_message", str);
        className.putExtra("flash_type", i);
        className.putExtra("sms_retry_time", j);
        className.putExtra("voice_retry_time", j2);
        className.putExtra("wa_old_retry_time", j3);
        className.putExtra("email_otp_retry_time", j4);
        className.putExtra("use_sms_retriever", z);
        className.putExtra("show_request_code_progress_dialog", z2);
        className.putExtra("changenumber", z3);
        className.putExtra("should_request_flash_call", z4);
        className.putExtra("wa_old_eligible", i2);
        className.putExtra("fraud_eligible", z5);
        className.putExtra("silent_auth_eligible", i3);
        className.putExtra("code_verification_mode", 0);
        return className;
    }

    public static Intent A1A(Context context, String str, int i, int i2, boolean z) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.userban.ui.BanAppealActivity");
        intent.putExtra("is_eu_smb", z);
        intent.putExtra("ban_violation_type", i);
        intent.putExtra("appeal_request_token", str);
        intent.putExtra("launch_source", i2);
        return intent;
    }

    public static Intent A1B(Context context, String str, int i, boolean z) {
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.setClassName(context.getPackageName(), "com.whatsapp.accountswitching.routing.AccountSwitchingRoutingActivity");
        intent.putExtra("switch_to_account_lid", str);
        intent.putExtra("is_missed_call_notification", z);
        intent.putExtra("source", i);
        return intent;
    }

    public static Intent A1C(Context context, String str, String str2) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.phonematching.CountryPicker");
        intent.putExtra("country_iso", str);
        intent.putExtra("country_display_name", str2);
        return intent;
    }

    public static Intent A1D(Context context, String str, String str2) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity");
        intent.putExtra("sticker_pack_id", str);
        intent.putExtra("sticker_pack_preview_source", str2);
        return intent;
    }

    public static Intent A1E(Context context, String str, String str2, int i) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.backup.google.SettingsGoogleDrive");
        intent.putExtra("entry_point", i);
        if (!TextUtils.isEmpty(str)) {
            intent.setAction(str);
        }
        if (str2 != null) {
            intent.putExtra("search_result_key", str2);
        }
        return intent;
    }

    public static Intent A1F(Context context, String str, String str2, int i) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.whatsapp.storage.StorageUsageActivity");
        className.putExtra("session_id", str);
        className.putExtra("entry_point", i);
        if (str2 != null) {
            className.putExtra("search_result_key", str2);
        }
        return className;
    }

    public static Intent A1J(Context context, String str, String str2, String str3, int i) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.payments.ui.PaymentWebViewActivity");
        C18740tg.A06(str);
        intent.putExtra("webview_url", str);
        boolean z = true;
        intent.putExtra("webview_javascript_enabled", true);
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra("webview_callback", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            intent.putExtra("webview_cancel_callback", str3);
        }
        intent.putExtra("webview_toolbar_v2", true);
        intent.putExtra("webview_hide_url", false);
        intent.putExtra("webview_title_show_domain_only", true);
        intent.putExtra("webview_open_new_tab_in_external_browser", true);
        intent.putExtra("deep_link_type_support", i);
        if (i == -1) {
            z = false;
        }
        intent.putExtra("webview_deeplink_enabled", z);
        return intent;
    }

    public static Intent A1K(Context context, String str, String str2, String str3, List list, int i, int i2, boolean z, boolean z2) {
        return new Intent().setClassName(context.getPackageName(), "com.whatsapp.gifvideopreview.GifVideoPreviewActivity").putExtra("preview_media_url", str).putExtra("media_url", str2).putExtra("static_preview_url", str3).putExtra("jids", AnonymousClass143.A07(list)).putExtra("send", z2).putExtra("provider", i).putExtra("number_from_url", z).putExtra("origin", i2);
    }

    public static Intent A1M(Context context, String str, boolean z, boolean z2) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.migration.transfer.ui.ChatTransferActivity");
        intent.putExtra("is_donor", z);
        intent.putExtra("started_on_receiver", z2);
        intent.putExtra("qr_code_data", str);
        return intent;
    }

    public static Intent A1N(Context context, String str, int... iArr) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.twofactor.TwoFactorAuthActivity");
        intent.putExtra("primaryCTA", str);
        intent.putExtra("workflows", iArr);
        return intent;
    }

    public static Intent A1O(Context context, Collection collection, int i) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.group.GroupMembersSelector");
        intent.putExtra("entry_point", i);
        if (collection != null && !collection.isEmpty()) {
            intent.putExtra("selected", new ArrayList(collection));
        }
        return intent;
    }

    public static Intent A1P(Context context, Set set) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.contact.picker.ListMembersSelector");
        if (!set.isEmpty()) {
            intent.putExtra("selected", AnonymousClass143.A07(set));
        }
        return intent;
    }

    public static Intent A1Q(Context context, boolean z) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.whatsapp.registration.VerifyCaptcha");
        className.putExtra("change_number", z);
        return className;
    }

    public static Intent A1R(Context context, boolean z) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.registration.VerifyTwoFactorAuth");
        intent.putExtra("changenumber", z);
        return intent;
    }

    public static Intent A1S(Context context, boolean z, boolean z2) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.biz.product.view.activity.ProductDetailActivity");
        intent.putExtra("is_from_product_detail_screen", z);
        intent.putExtra("go_back_to_catalog_from_deeplink", z2);
        return intent;
    }

    public static void A1U(Intent intent, Rect rect, Bundle bundle, int i, int i2, int i3, int i4) {
        intent.putExtra("EXTRA_INITIAL_TOP_MARGIN", i);
        intent.putExtra("EXTRA_START_MARGIN", i2);
        intent.putExtra("EXTRA_MSG_PADDING_START", rect.left);
        intent.putExtra("EXTRA_MSG_PADDING_TOP", rect.top);
        intent.putExtra("EXTRA_MSG_PADDING_END", rect.right);
        intent.putExtra("EXTRA_CUSTOMIZER_ID", i4);
        intent.putExtra("EXTRA_MSG_PADDING_BOTTOM", rect.bottom);
        intent.putExtra("EXTRA_PROFILE_PICTURE_WIDTH", i3);
        intent.putExtra("EXTRA_SAVE_STATE_BUNDLE", bundle);
    }

    @Deprecated
    public Intent A1V(Context context, AnonymousClass141 r5) {
        Jid A06 = r5.A06(UserJid.class);
        C18740tg.A06(A06);
        return A0w(context, (UserJid) A06, (Integer) null, true, true);
    }

    public Intent A1W(Context context, AnonymousClass141 r4) {
        return A1Z(context, (AnonymousClass11F) r4.A06(AnonymousClass11F.class), 0);
    }

    public Intent A1X(Context context, AnonymousClass141 r4, Integer num) {
        Jid A06 = r4.A06(UserJid.class);
        C18740tg.A06(A06);
        return A0w(context, (UserJid) A06, num, true, true);
    }

    public Intent A1b(Context context, UserJid userJid, Boolean bool) {
        ArrayList arrayList = new ArrayList();
        if (userJid != null) {
            arrayList.add(userJid);
        }
        return A0z(context, bool, (Boolean) null, (Boolean) null, (Boolean) null, arrayList);
    }

    public Intent A1c(Context context, AnonymousClass3T1 r7) {
        C64933Qa r4 = r7.A1J;
        Intent putExtra = A1Z(context, r4.A00, 0).putExtra("start_t", SystemClock.uptimeMillis()).putExtra("row_id", r7.A1N).putExtra("sort_id", r7.A1O);
        AnonymousClass3UJ.A00(putExtra, r4);
        return putExtra;
    }

    public static void A1T(Context context, Intent intent, int i) {
        intent.setClassName(context.getPackageName(), "com.whatsapp.dmsetting.ChangeDMSettingActivity");
        intent.putExtra("entry_point", i);
    }

    public Intent A1Z(Context context, AnonymousClass11F r5, int i) {
        return A0F(context, i).putExtra("jid", AnonymousClass143.A03(r5)).addFlags(335544320);
    }

    public Intent A1d(Context context, String str, String str2, int i, boolean z) {
        Intent A0z = A0z(context, Boolean.valueOf(z), (Boolean) null, (Boolean) null, (Boolean) null, (List) null);
        A0z.setAction(str);
        A0z.putExtra("call_ui_action", i);
        A0z.putExtra("call_id", str2);
        A0z.putExtra("isTaskRoot", z);
        return A0z;
    }
}
