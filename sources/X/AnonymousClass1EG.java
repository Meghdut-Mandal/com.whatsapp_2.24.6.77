package X;

/* renamed from: X.1EG  reason: invalid class name */
public abstract class AnonymousClass1EG {
    public static String A00(int i) {
        short s = (short) (i & 65535);
        switch ((short) (i >> 16)) {
            case 249:
                if (s == 94) {
                    return "CAMERA_FACE_ACTIONS_REFINE_BLENDSHAPES";
                }
                if (s == 95) {
                    return "CAMERA_FACE_ACTIONS_LOAD_MODEL";
                }
                if (s == 3100) {
                    return "CAMERA_AR_SESSION";
                }
                return "UNDEFINED_QPL_EVENT";
            case 342:
                if (s == 4) {
                    return "AR_DELIVERY_ASSET_FETCH_USER_REQUEST";
                }
                if (s == 5) {
                    return "AR_DELIVERY_MODEL_FETCH_USER_REQUEST";
                }
                if (s == 8455) {
                    return "AR_DELIVERY_FC_EFFECT_FETCH";
                }
                return "UNDEFINED_QPL_EVENT";
            case 378:
                if (s == 1861) {
                    return "WA_PERF_IMAGE_OPEN";
                }
                if (s == 2385) {
                    return "WA_PERF_FIRST_FTS_RESULT";
                }
                if (s == 7038) {
                    return "WA_PERF_CONTACT_OPEN";
                }
                if (s == 9129) {
                    return "WA_PERF_CHAT_LIST_SCROLL";
                }
                if (s == 13240) {
                    return "WA_PERF_CHAT_KEYBOARD_OPEN";
                }
                switch (s) {
                    case 1:
                        return "WA_PERF_COLD_START_ANDROID";
                    case 2:
                        return "WA_PERF_WARM_START_ANDROID";
                    case 3:
                        return "WA_PERF_HOT_START_ANDROID";
                    case 4:
                        return "WA_PERF_CAMERA_OPEN";
                    case 5:
                        return "WA_PERF_CHAT_OPEN";
                    case 6:
                        return "WA_PERF_SCROLL_PERF";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
            case 554:
                if (s == 1045) {
                    return "QPL_INTERNAL_WHATSAPP_RID_TEST";
                }
                return "UNDEFINED_QPL_EVENT";
            case 1195:
                if (s == 1) {
                    return "WHATSAPP_TTRC_LOGGER_TTRC_LONG_CANCEL";
                }
                if (s == 2) {
                    return "WHATSAPP_TTRC_LOGGER_TTRC_FAILURE";
                }
                if (s == 3449) {
                    return "WHATSAPP_TTRC_LOGGER_UI_ACTION";
                }
                return "UNDEFINED_QPL_EVENT";
            case 1440:
                if (s == 2972) {
                    return "WHATSAPP_TEST_WHATSAPP_TEST_EVENT";
                }
                if (s == 7192) {
                    return "WHATSAPP_TEST_WHATSAPP_USER_EVENT";
                }
                if (s == 13471) {
                    return "WHATSAPP_TEST_LIST_LAUNCH_TEST";
                }
                return "UNDEFINED_QPL_EVENT";
            case 1721:
                if (s == 5925) {
                    return "WHATSAPP_DYNAMIC_TEMPLATE_MESSAGE_BLOKS_LOADING";
                }
                return "UNDEFINED_QPL_EVENT";
            case 1921:
                if (s == 3701) {
                    return "WHATSAPP_CONNECTIVITY_CHATD_CONNECT";
                }
                return "UNDEFINED_QPL_EVENT";
            case 2094:
                if (s == 3464) {
                    return "WHATSAPP_DIRECT_MIGRATION_DIRECT_MIGRATION_BACKGROUND_TASK";
                }
                return "UNDEFINED_QPL_EVENT";
            case 2265:
                if (s == 6272) {
                    return "WA_CONTACTS_CONTACTS_LOADING";
                }
                return "UNDEFINED_QPL_EVENT";
            case 2357:
                if (s == 6342) {
                    return "WHATSAPP_MESSAGE_SEND_PERF_MESSAGE_SEND_PERF";
                }
                if (s == 6955) {
                    return "WHATSAPP_MESSAGE_SEND_PERF_IQ_SEND_PERF";
                }
                if (s == 8332) {
                    return "WHATSAPP_MESSAGE_SEND_PERF_GROUP_INFO";
                }
                if (s == 10429) {
                    return "WHATSAPP_MESSAGE_SEND_PERF_MESSAGE_INFO";
                }
                return "UNDEFINED_QPL_EVENT";
            case 2767:
                if (s == 4151) {
                    return "WHATSAPP_BACKUP_WHATSAPP_BACKUP_EVENT";
                }
                return "UNDEFINED_QPL_EVENT";
            case 2830:
                switch (s) {
                    case 1846:
                        return "WHATSAPP_PAYMENTS_FLOWS_WHATSAPP_IN_UPI_BATCH";
                    case 2215:
                        return "WHATSAPP_PAYMENTS_FLOWS_IN_DEVICE_BINDING_FLOW";
                    case 2489:
                        return "WHATSAPP_PAYMENTS_FLOWS_WHATSAPP_IN_P2M_FLOW";
                    case 3240:
                        return "WHATSAPP_PAYMENTS_FLOWS_WHATSAPP_PAYMENTS_SME_IQ";
                    case 3374:
                        return "WHATSAPP_PAYMENTS_FLOWS_WHATSAPP_BR_P2P_FLOW";
                    case 3395:
                        return "WHATSAPP_PAYMENTS_FLOWS_WHATSAPP_IN_SEND_P2P";
                    case 3548:
                        return "WHATSAPP_PAYMENTS_FLOWS_WHATSAPP_PAYMENTS_GET_ORDER_TRANSACTION";
                    case 5136:
                        return "WHATSAPP_PAYMENTS_FLOWS_WHATSAPP_IN_P2P_FLOW";
                    case 5318:
                        return "WHATSAPP_PAYMENTS_FLOWS_WHATSAPP_IN_UPI_GET_P2M_CONFIG";
                    case 6042:
                        return "WHATSAPP_PAYMENTS_FLOWS_IN_VALUE_PROP_IMG_RENDER";
                    case 6516:
                        return "WHATSAPP_PAYMENTS_FLOWS_WHATSAPP_PAYMENTS_SCAN_QR_FLOW";
                    case 7090:
                        return "WHATSAPP_PAYMENTS_FLOWS_BR_ONBOARDING_FLOW";
                    case 7287:
                        return "WHATSAPP_PAYMENTS_FLOWS_WHATSAPP_PAYMENTS_GET_METHODS_IQ";
                    case 7942:
                        return "WHATSAPP_PAYMENTS_FLOWS_WHATSAPP_IN_UPI_GET_VPA_NAME";
                    case 8321:
                        return "WHATSAPP_PAYMENTS_FLOWS_WHATSAPP_IN_UPI_LIST_KEYS";
                    case 9013:
                        return "WHATSAPP_PAYMENTS_FLOWS_WHATSAPP_IN_UPI_REGISTER";
                    case 9051:
                        return "WHATSAPP_PAYMENTS_FLOWS_WHATSAPP_IN_SEND_TO_VPA";
                    case 9728:
                        return "WHATSAPP_PAYMENTS_FLOWS_WHATSAPP_IN_UPI_DEVICE_BINDING";
                    case 10741:
                        return "WHATSAPP_PAYMENTS_FLOWS_ROOTED_DEVICE_CHECK";
                    case 10887:
                        return "WHATSAPP_PAYMENTS_FLOWS_WHATSAPP_IN_UPI_GET_VPA";
                    case 11339:
                        return "WHATSAPP_PAYMENTS_FLOWS_WHATSAPP_IN_UPI_GET_BANKS";
                    case 11438:
                        return "WHATSAPP_PAYMENTS_FLOWS_WHATSAPP_IN_PAY_PRECHECK";
                    case 11543:
                        return "WHATSAPP_PAYMENTS_FLOWS_WHATSAPP_IN_UPI_GET_ACCOUNTS";
                    case 11950:
                        return "WHATSAPP_PAYMENTS_FLOWS_WHATSAPP_PAYMENTS_GET_PROVIDER_KEY_IQ";
                    case 12311:
                        return "WHATSAPP_PAYMENTS_FLOWS_IN_ONBOARDING_FLOW";
                    case 13244:
                        return "WHATSAPP_PAYMENTS_FLOWS_WHATSAPP_PAYMENTS_GET_TOKEN_ID_IQ";
                    case 14272:
                        return "WHATSAPP_PAYMENTS_FLOWS_WHATSAPP_PAYMENTS_PAY_PRECHECK_IQ";
                    case 16372:
                        return "WHATSAPP_PAYMENTS_FLOWS_WHATSAPP_IN_UPI_GET_P2M_CHECKOUT_SESSION";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
            case 3063:
                if (s == 2318) {
                    return "WHATSAPP_EXTENSIONS_WAE_INIT_PHOENIX_FLOW";
                }
                if (s == 3629) {
                    return "WHATSAPP_EXTENSIONS_WAE_PSL_PREFETCH";
                }
                if (s == 6582) {
                    return "WHATSAPP_EXTENSIONS_WAE_METADATA";
                }
                if (s == 13913) {
                    return "WHATSAPP_EXTENSIONS_WAE_SCREEN_NAVIGATION";
                }
                return "UNDEFINED_QPL_EVENT";
            case 3164:
                if (s == 12881) {
                    return "WHATSAPP_BUSINESS_SEARCH_ANDROID_WA_BUSINESS_SEARCH_GPS_LOCATION";
                }
                return "UNDEFINED_QPL_EVENT";
            case 3286:
                if (s == 2618) {
                    return "WHATSAPP_SMBA_NATIVE_COMMERCE_WHATSAPP_LOAD_COLLECTION_PRODUCTS";
                }
                if (s == 5857) {
                    return "WHATSAPP_SMBA_NATIVE_COMMERCE_WHATSAPP_LOAD_CATALOG";
                }
                if (s == 8630) {
                    return "WHATSAPP_SMBA_NATIVE_COMMERCE_WHATSAPP_NATIVE_COMMERCE_CATALOG";
                }
                if (s == 9569) {
                    return "WHATSAPP_SMBA_NATIVE_COMMERCE_WHATSAPP_LOAD_COLLECTION_MANAGEMENT_HOME";
                }
                return "UNDEFINED_QPL_EVENT";
            case 3539:
                switch (s) {
                    case 1035:
                        return "AVATAR_EDITOR_SWITCH_TAB";
                    case 1318:
                        return "AVATAR_EDITOR_EMBODIED_EDITOR_NATIVE_E2E";
                    case 1491:
                        return "AVATAR_EDITOR_AUTOGEN_SERVICE";
                    case 1676:
                        return "AVATAR_EDITOR_TTRC";
                    case 2058:
                        return "AVATAR_EDITOR_GENERATE_AVATAR_REQUEST";
                    case 4158:
                        return "AVATAR_EDITOR_LOAD_CHOICE_PREVIEW";
                    case 5086:
                        return "AVATAR_EDITOR_IMMERSIVE_AVATAR_EFFECT_LOAD";
                    case 5102:
                        return "AVATAR_EDITOR_TTRC_CHOICE_PREVIEW_IMG";
                    case 5108:
                        return "AVATAR_EDITOR_EMBODIED_EDITOR_LOAD_ACTION_NATIVE";
                    case 6571:
                        return "AVATAR_EDITOR_LOAD_CATEGORY";
                    case 6732:
                        return "AVATAR_EDITOR_ACG_APPLY_AVATAR";
                    case 9009:
                        return "AVATAR_EDITOR_RAV_GLB_LOAD_IN_EFFECT";
                    case 9469:
                        return "AVATAR_EDITOR_LOAD_FULL_PREVIEW";
                    case 10063:
                        return "AVATAR_EDITOR_RAV_SET_EFFECT";
                    case 10284:
                        return "AVATAR_EDITOR_ACG_INIT";
                    case 11387:
                        return "AVATAR_EDITOR_RAV_FIRST_FRAME_AFTER_EFFECT_SET";
                    case 12034:
                        return "AVATAR_EDITOR_ACG_PREFETCH";
                    case 12152:
                        return "AVATAR_EDITOR_RAV_FIRST_RENDER_FRAME_FROM_INIT";
                    case 12615:
                        return "AVATAR_EDITOR_VOLTRON_CDL_PREFETCH";
                    case 12906:
                        return "AVATAR_EDITOR_ACG_GENERATE_AVATAR";
                    case 13919:
                        return "AVATAR_EDITOR_ACG_PARAMETRIC_COLOR";
                    case 14249:
                        return "AVATAR_EDITOR_INIT";
                    case 14703:
                        return "AVATAR_EDITOR_EMBODIED_EDITOR_PREFETCH_E2E";
                    case 14778:
                        return "AVATAR_EDITOR_SAVE_AVATAR";
                    case 15907:
                        return "AVATAR_EDITOR_RAV_E2E";
                    case 16361:
                        return "AVATAR_EDITOR_LOAD_CART_MODAL";
                    case 16380:
                        return "AVATAR_EDITOR_EMBODIED_EDITOR_ASSETS_PREFETCH";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
            case 3645:
                if (s == 4280) {
                    return "WHATSAPP_PAID_MESSAGING_EXPERIENCES_CAROUSEL_MESSAGE_RECEIVE";
                }
                if (s == 11502) {
                    return "WHATSAPP_PAID_MESSAGING_EXPERIENCES_CAROUSEL_MESSAGE_RENDER";
                }
                return "UNDEFINED_QPL_EVENT";
            case 3654:
                if (s == 2486) {
                    return "WA_MEX_EXAMPLE_MEX_OPERATION_EXAMPLE";
                }
                return "UNDEFINED_QPL_EVENT";
            case 4307:
                if (s == 4622) {
                    return "WHATSAPP_META_BILLING_WHATSAPP_META_BILLING_SEND_RECOVERY_CODE";
                }
                if (s == 7150) {
                    return "WHATSAPP_META_BILLING_WHATSAPP_META_BILLING_SILENT_NOTIFICATION";
                }
                if (s == 7455) {
                    return "WHATSAPP_META_BILLING_WHATSAPP_META_BILLING_REQUEST_CODE";
                }
                if (s == 10594) {
                    return "WHATSAPP_META_BILLING_WHATSAPP_META_BILLING_SEND_CODE";
                }
                return "UNDEFINED_QPL_EVENT";
            case 4799:
                if (s == 3049) {
                    return "WHATSAPP_FMESSAGE_PLATFORM_SMP_SUBSYS_REGISTRY_INIT";
                }
                if (s == 7510) {
                    return "WHATSAPP_FMESSAGE_PLATFORM_FMP_SUBSYS_REGISTRY_INIT";
                }
                if (s == 8685) {
                    return "WHATSAPP_FMESSAGE_PLATFORM_FMP_MSG_REGISTRY_INIT";
                }
                if (s == 13018) {
                    return "WHATSAPP_FMESSAGE_PLATFORM_SMP_MSG_REGISTRY_INIT";
                }
                return "UNDEFINED_QPL_EVENT";
            case 4965:
                if (s == 1227) {
                    return "SGX_VC_GLASSES_WIDGET_INITIALIZATION";
                }
                if (s == 10815) {
                    return "SGX_VC_PHONE_TO_GLASSES_COLD_START";
                }
                if (s == 15757) {
                    return "SGX_VC_PHONE_TO_GLASSES_WARM_START";
                }
                return "UNDEFINED_QPL_EVENT";
            case 5007:
                if (s == 11947) {
                    return "AVATARS_ENGINE_PLUGIN_AR_AVATARS";
                }
                return "UNDEFINED_QPL_EVENT";
            case 5404:
                if (s == 13524) {
                    return "WHATSAPP_AVATAR_WHATSAPP_AVATAR_ANDROID";
                }
                return "UNDEFINED_QPL_EVENT";
            case 5892:
                if (s == 1) {
                    return "WHATSAPP_GRAPHQL_WHATSAPP_AUTHENTICATED_GRAPHQL";
                }
                if (s == 10937) {
                    return "WHATSAPP_GRAPHQL_WHATSAPP_FB_USER_ENTITY_MANAGEMENT";
                }
                return "UNDEFINED_QPL_EVENT";
            case 6128:
                switch (s) {
                    case 1:
                        return "WHATSAPP_SMB_MARKETING_MESSAGES_WHATSAPP_MM_HYDRATION";
                    case 2:
                        return "WHATSAPP_SMB_MARKETING_MESSAGES_WHATSAPP_FETCH_BILLING_INFO";
                    case 3:
                        return "WHATSAPP_SMB_MARKETING_MESSAGES_WHATSAPP_SEND_MM";
                    case 4:
                        return "WHATSAPP_SMB_MARKETING_MESSAGES_WHATSAPP_META_BILLING_REQUEST_CODE";
                    case 5:
                        return "WHATSAPP_SMB_MARKETING_MESSAGES_WHATSAPP_META_BILLING_SEND_CODE";
                    case 6:
                        return "WHATSAPP_SMB_MARKETING_MESSAGES_WHATSAPP_META_BILLING_SEND_RECOVERY_CODE";
                    case 7:
                        return "WHATSAPP_SMB_MARKETING_MESSAGES_WHATSAPP_META_BILLING_SILENT_NOTIFICATION";
                    case 8:
                        return "WHATSAPP_SMB_MARKETING_MESSAGES_WHATSAPP_FETCH_MM_PREVIEW";
                    case 9:
                        return "WHATSAPP_SMB_MARKETING_MESSAGES_WHATSAPP_FETCH_MM_INSIGHTS";
                    case 10:
                        return "WHATSAPP_SMB_MARKETING_MESSAGES_WHATSAPP_DELETE_MM";
                    case 11:
                        return "WHATSAPP_SMB_MARKETING_MESSAGES_WHATSAPP_UPDATE_MM_INSIGHT";
                    case 12:
                        return "WHATSAPP_SMB_MARKETING_MESSAGES_WHATSAPP_PRELOAD_COMPOSER_MM";
                    case 13:
                        return "WHATSAPP_SMB_MARKETING_MESSAGES_WHATSAPP_UPDATE_MM";
                    case 14:
                        return "WHATSAPP_SMB_MARKETING_MESSAGES_WHATSAPP_CREATE_MM";
                    case 15:
                        return "WHATSAPP_SMB_MARKETING_MESSAGES_WHATSAPP_FETCH_SMART_LIST";
                    case 16:
                        return "WHATSAPP_SMB_MARKETING_MESSAGES_WHATSAPP_SAVE_SMART_LIST_SELECTION";
                    case 17:
                        return "WHATSAPP_SMB_MARKETING_MESSAGES_WHATSAPP_FETCH_MM_SENDING_LIMIT";
                    case 18:
                        return "WHATSAPP_SMB_MARKETING_MESSAGES_WHATSAPP_CANCEL_SCHEDULED_MM";
                    case 19:
                        return "WHATSAPP_SMB_MARKETING_MESSAGES_WHATSAPP_SEND_SCHEDULED_MM";
                    case 20:
                        return "WHATSAPP_SMB_MARKETING_MESSAGES_WHATSAPP_SCHEDULE_MM";
                    case 21:
                        return "WHATSAPP_SMB_MARKETING_MESSAGES_WHATSAPP_FETCH_MM_LIST";
                    case 22:
                        return "WHATSAPP_SMB_MARKETING_MESSAGES_WHATSAPP_BULK_DELETE_MM";
                    case 23:
                        return "WHATSAPP_SMB_MARKETING_MESSAGES_WHATSAPP_FETCH_MM";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
            case 6914:
                if (s == 2715) {
                    return "WHATSAPP_STATUS_STATUS_CREATION";
                }
                if (s == 3281) {
                    return "WHATSAPP_STATUS_VIEW_STATUS";
                }
                if (s == 6188) {
                    return "WHATSAPP_STATUS_ADD_STATUS";
                }
                if (s == 11173) {
                    return "WHATSAPP_STATUS_PROFILE_RINGS";
                }
                if (s == 12187) {
                    return "WHATSAPP_STATUS_STATUS_NAVIGATION";
                }
                return "UNDEFINED_QPL_EVENT";
            case 7274:
                if (s == 7032) {
                    return "WHATSAPP_INTERNAL_BUG_REPORTING_SUBMIT_BUG";
                }
                if (s == 8010) {
                    return "WHATSAPP_INTERNAL_BUG_REPORTING_UPLOAD_MEDIA";
                }
                return "UNDEFINED_QPL_EVENT";
            case 7543:
                switch (s) {
                    case 1989:
                        return "WHATSAPP_SMARTGLASSES_SEND_MESSAGE";
                    case 2584:
                        return "WHATSAPP_SMARTGLASSES_ACCEPT_CALL";
                    case 2976:
                        return "WHATSAPP_SMARTGLASSES_MUTE_UNMUTE_MIC";
                    case 3707:
                        return "WHATSAPP_SMARTGLASSES_CALL_STATE_CHANGE";
                    case 4627:
                        return "WHATSAPP_SMARTGLASSES_INCOMING_VOICE_MESSAGE";
                    case 5121:
                        return "WHATSAPP_SMARTGLASSES_CONTACTS_CHANGED";
                    case 7088:
                        return "WHATSAPP_SMARTGLASSES_OUTGOING_VOICE_MESSAGE_VALIDATION";
                    case 7284:
                        return "WHATSAPP_SMARTGLASSES_START_CALL";
                    case 12927:
                        return "WHATSAPP_SMARTGLASSES_TOGGLE_VIDEO";
                    case 14348:
                        return "WHATSAPP_SMARTGLASSES_CONTACT_SYNC";
                    case 16189:
                        return "WHATSAPP_SMARTGLASSES_CONTACT_SYNC_RESTRICTED_CURSOR_GET_PROFILE_PICTURE";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
            case 7666:
                if (s == 9870) {
                    return "WA_PRELINK_TTRC_BLOKS_TTRC";
                }
                return "UNDEFINED_QPL_EVENT";
            case 8203:
                if (s == 5029) {
                    return "WHATSAPP_ZONE_MOBILE_ZONE_RUN_EVENT";
                }
                if (s == 5984) {
                    return "WHATSAPP_ZONE_MOBILE_ZONE_PRIVACY_VIOLATION_EVENT";
                }
                if (s == 8149) {
                    return "WHATSAPP_ZONE_MOBILE_ZONE_PRIVACY_UNWRAP";
                }
                if (s == 10634) {
                    return "WHATSAPP_ZONE_MOBILE_ZONE_RECLASSIFICATION";
                }
                if (s == 10851) {
                    return "WHATSAPP_ZONE_MOBILE_ZONE_TEMPORARY_DECLASSIFICATION";
                }
                if (s == 13429) {
                    return "WHATSAPP_ZONE_MOBILE_ZONE_EVALUATOR_ERROR";
                }
                return "UNDEFINED_QPL_EVENT";
            case 8415:
                if (s == 5036) {
                    return "WA_WFL_ACP_DECISION_FLOW";
                }
                if (s == 5962) {
                    return "WA_WFL_AL_LOAD_LATENCY";
                }
                if (s == 7671) {
                    return "WA_WFL_ACP_FLOW";
                }
                if (s == 10096) {
                    return "WA_WFL_WFS";
                }
                if (s == 11865) {
                    return "WA_WFL_WFS_OFFLINE";
                }
                if (s == 13799) {
                    return "WA_WFL_CROSSPOSTING";
                }
                return "UNDEFINED_QPL_EVENT";
            case 8457:
                if (s == 2414) {
                    return "WHATSAPP_CAMERA_CAPTURE_PHOTO";
                }
                if (s == 11195) {
                    return "WHATSAPP_CAMERA_CAPTURE_VIDEO";
                }
                if (s == 12896) {
                    return "WHATSAPP_CAMERA_SWITCH_CAMERA";
                }
                if (s == 13695) {
                    return "WHATSAPP_CAMERA_INIT_CAMERA";
                }
                return "UNDEFINED_QPL_EVENT";
            case 8701:
                if (s == 1) {
                    return "WHATSAPP_VOICENOTE_RECORD_WHATSAPP_VOICENOTE_RECORD";
                }
                return "UNDEFINED_QPL_EVENT";
            case 8827:
                if (s == 4543) {
                    return "WHATSAPP_PHOENIX_BLOKS_PREFETCH";
                }
                if (s == 7055) {
                    return "WHATSAPP_PHOENIX_STATE_EXECUTION";
                }
                if (s == 9396) {
                    return "WHATSAPP_PHOENIX_INIT_STATE_MACHINE";
                }
                if (s == 10774) {
                    return "WHATSAPP_PHOENIX_WHATSAPP_BLOKS";
                }
                if (s == 12868) {
                    return "WHATSAPP_PHOENIX_PHOENIX_FDS_IQ_EXECUTION";
                }
                return "UNDEFINED_QPL_EVENT";
            case 8843:
                if (s == 5138) {
                    return "WHATSAPP_COMMUNITY_WHATSAPP_COMMUNITY_CAG_OPEN_TIME";
                }
                if (s == 10073) {
                    return "WHATSAPP_COMMUNITY_WHATSAPP_COMMUNITY_HOME_OPEN_TIME";
                }
                if (s == 10820) {
                    return "WHATSAPP_COMMUNITY_WHATSAPP_COMMUNITY_MEMBER_LOADING";
                }
                return "UNDEFINED_QPL_EVENT";
            case 8874:
                if (s == 1154) {
                    return "WHATSAPP_PRODUCT_SEARCH_WHATSAPP_PRODUCT_SEARCH_QUERY_ENCRYPTION";
                }
                return "UNDEFINED_QPL_EVENT";
            case 9106:
                if (s == 2557) {
                    return "WHATSAPP_BUSINESS_CORE_WHATSAPP_VERIFIED_NAME";
                }
                return "UNDEFINED_QPL_EVENT";
            case 10281:
                if (s == 6584) {
                    return "WHATSAPP_COMMERCE_CATALOG_PDP_TTI";
                }
                if (s == 12568) {
                    return "WHATSAPP_COMMERCE_CATALOG_HOME_TTI";
                }
                return "UNDEFINED_QPL_EVENT";
            case 10287:
                if (s == 3581) {
                    return "AVATAR_SDK_LOAD_LOAD_USER";
                }
                return "UNDEFINED_QPL_EVENT";
            case 10523:
                if (s == 4466) {
                    return "WHATSAPP_SCROLL_PERF_WHATSAPP_SCROLL_PERF";
                }
                return "UNDEFINED_QPL_EVENT";
            case 10603:
                if (s == 6426) {
                    return "WHATSAPP_EXPRESSIONS_TRAY_WHATSAPP_EXPRESSIONS_TRAY_ANDROID";
                }
                return "UNDEFINED_QPL_EVENT";
            case 10699:
                switch (s) {
                    case 2064:
                        return "WHATSAPP_SMB_PREMIUM_WHATSAPP_CUSTOM_URL_MANAGER";
                    case 5113:
                        return "WHATSAPP_SMB_PREMIUM_WHATSAPP_BILLING_SETTING_CLICK";
                    case 7965:
                        return "WHATSAPP_SMB_PREMIUM_WHATSAPP_MESSAGE_INFO_VIEW";
                    case 8857:
                        return "WHATSAPP_SMB_PREMIUM_WHATSAPP_CUSTOM_URL_VIEW_WEB_PAGE";
                    case 10140:
                        return "WHATSAPP_SMB_PREMIUM_WHATSAPP_BILLING_UPSELL_VIEW";
                    case 10766:
                        return "WHATSAPP_SMB_PREMIUM_WHATSAPP_BILLING_UPSELL_HANDLE_PAYMENT_RESPONSE";
                    case 11568:
                        return "WHATSAPP_SMB_PREMIUM_WHATSAPP_CUSTOM_URL_CHANGE";
                    case 12946:
                        return "WHATSAPP_SMB_PREMIUM_WHATSAPP_LINK_DEVICE";
                    case 13047:
                        return "WHATSAPP_SMB_PREMIUM_WHATSAPP_CUSTOM_URL_CHECK_AVAILABILITY";
                    case 13712:
                        return "WHATSAPP_SMB_PREMIUM_WHATSAPP_FETCH_ASSIGN_CHAT_AGENT_LIST";
                    case 13888:
                        return "WHATSAPP_SMB_PREMIUM_WHATSAPP_CUSTOM_URL_REGISTER";
                    case 13911:
                        return "WHATSAPP_SMB_PREMIUM_WHATSAPP_BILLING_UPSELL_LAUNCH_PAYMENT";
                    case 14171:
                        return "WHATSAPP_SMB_PREMIUM_WHATSAPP_CUSTOM_URL_FETCH_BIZ_INFO";
                    case 14184:
                        return "WHATSAPP_SMB_PREMIUM_WHATSAPP_CUSTOM_URL_DELETE";
                    case 15612:
                        return "WHATSAPP_SMB_PREMIUM_WHATSAPP_NAME_DEVICE";
                    case 15633:
                        return "WHATSAPP_SMB_PREMIUM_WHATSAPP_ASSIGN_CHAT";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
            case 10741:
                if (s == 1540) {
                    return "WHATSAPP_TTRC_WHATSAPP_TTRC_MEDIA_VIEW";
                }
                if (s == 4574) {
                    return "WHATSAPP_TTRC_WHATSAPP_TTRC_CHAT_OPEN_V3";
                }
                if (s == 4607) {
                    return "WHATSAPP_TTRC_WHATSAPP_TTRC_CREATE_APPLICATION";
                }
                if (s == 5878) {
                    return "WHATSAPP_TTRC_WHATSAPP_TTRC_STARTUP";
                }
                if (s == 8127) {
                    return "WHATSAPP_TTRC_WHATSAPP_TTRC_GROUP_INFO";
                }
                if (s == 8865) {
                    return "WHATSAPP_TTRC_WHATSAPP_TTRC_MESSAGE_INFO";
                }
                if (s == 11186) {
                    return "WHATSAPP_TTRC_STAR_MESSAGE";
                }
                if (s == 11850) {
                    return "WHATSAPP_TTRC_WHATSAPP_TTRC_CHAT_OPEN";
                }
                if (s == 13259) {
                    return "WHATSAPP_TTRC_WHATSAPP_TTRC_INVITE_A_FRIEND";
                }
                return "UNDEFINED_QPL_EVENT";
            case 11081:
                if (s == 6249) {
                    return "WHATSAPP_VOIP_WHATSAPP_INCOMING_CALL_SETUP";
                }
                if (s == 6357) {
                    return "WHATSAPP_VOIP_WHATSAPP_OUTGOING_CALL_SETUP";
                }
                return "UNDEFINED_QPL_EVENT";
            case 11314:
                if (s == 4078) {
                    return "DIRECTORY_LITE_CONSUMER_WHATSAPP_BUSINESSAPI_POPULAR_BUSINESSES";
                }
                if (s == 6329) {
                    return "DIRECTORY_LITE_CONSUMER_WHATSAPP_BUSINESSAPI_BUSINESSES_BY_CATEGORY";
                }
                if (s == 7514) {
                    return "DIRECTORY_LITE_CONSUMER_WHATSAPP_BUSINESSAPI_SEARCH_QUERY";
                }
                if (s == 13878) {
                    return "DIRECTORY_LITE_CONSUMER_WHATSAPP_BUSINESSAPI_HOME";
                }
                return "UNDEFINED_QPL_EVENT";
            case 11822:
                switch (s) {
                    case 2378:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_COLLECTIONS_MANAGEMENT_VIEW";
                    case 2681:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_PRODUCT_APPEAL";
                    case 2803:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_CATALOG_CREATE";
                    case 3049:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_CATALOG_LOAD_MORE";
                    case 3251:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_ORDER_VIEW";
                    case 3656:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_PROFILE_VIEW";
                    case 4816:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_CATALOG_VIEW";
                    case 7530:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_PRODUCT_DELETE";
                    case 8027:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_CART_VIEW";
                    case 8202:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_CART_ADD";
                    case 8525:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_PROFILE_SAVE";
                    case 9015:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_PRODUCT_VIEW";
                    case 10303:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_COLLECTION_APPEAL";
                    case 10505:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_PLM_DETAILS_VIEW";
                    case 10891:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_COLLECTION_EDIT";
                    case 10926:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_ORDER_CREATE";
                    case 10964:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_PROFILE_CATS_VIEW";
                    case 12036:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_PRODUCT_SET_VISIBLE";
                    case 12082:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_PRODUCT_IMAGES_LOAD";
                    case 12521:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_PRODUCT_SAVE";
                    case 13208:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_PRODUCT_MESSAGE_SEND";
                    case 13497:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_COLLECTION_VIEW_ALL";
                    case 15074:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_CATALOG_COLLECTIONS_VIEW";
                    case 15461:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_PRODUCT_REPORT";
                    case 16342:
                        return "WHATSAPP_SMB_COMMERCE_WHATSAPP_COLLECTION_RENAME";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
            case 12198:
                if (s == 12407) {
                    return "WHATSAPP_CLASSLOADER_CLASS_LOAD_STATS";
                }
                if (s == 14289) {
                    return "WHATSAPP_CLASSLOADER_DETAILS";
                }
                return "UNDEFINED_QPL_EVENT";
            case 12405:
                if (s == 1) {
                    return "WHATSAPP_BLOKS_ANDROID_WHATSAPP_BLOKS_ANDROID";
                }
                return "UNDEFINED_QPL_EVENT";
            case 13303:
                if (s == 1203) {
                    return "WHATSAPP_DIRECTORY_CONSUMER_ANDROID_WHATSAPP_DIRECTORY_SERP_REQUEST";
                }
                if (s == 2008) {
                    return "WHATSAPP_DIRECTORY_CONSUMER_ANDROID_WHATSAPP_DIRECTORY_DEFAULT_LOCATION";
                }
                if (s == 4996) {
                    return "WHATSAPP_DIRECTORY_CONSUMER_ANDROID_WHATSAPP_DIRECTORY_TYPEAHEAD_SEARCH";
                }
                if (s == 7062) {
                    return "WHATSAPP_DIRECTORY_CONSUMER_ANDROID_WHATSAPP_DIRECTORY_MAP_VIEW";
                }
                if (s == 8594) {
                    return "WHATSAPP_DIRECTORY_CONSUMER_ANDROID_WHATSAPP_DIRECTORY_CACHED_DATA_REQUEST";
                }
                if (s == 14315) {
                    return "WHATSAPP_DIRECTORY_CONSUMER_ANDROID_WHATSAPP_DIRECTORY_GPS_LOCATION";
                }
                return "UNDEFINED_QPL_EVENT";
            case 13450:
                if (s == 1003) {
                    return "WHATSAPP_WDS_INSTANCE_TTL";
                }
                if (s == 15075) {
                    return "WHATSAPP_WDS_INSTANCE_TTL_TEST";
                }
                return "UNDEFINED_QPL_EVENT";
            case 13610:
                if (s == 15532) {
                    return "WA_PRELINK_FUNNEL_AC_FLOW";
                }
                return "UNDEFINED_QPL_EVENT";
            case 13694:
                switch (s) {
                    case 1386:
                        return "WHATSAPP_CATALOG_OPERATIONS_IMAGE_LOAD_LATENCY_THUMBNAIL_SINGLE_COLLECTION_CATEGORIES";
                    case 1500:
                        return "WHATSAPP_CATALOG_OPERATIONS_IMAGE_LOAD_LATENCY_THUMBNAIL_CATEGORIES";
                    case 1953:
                        return "WHATSAPP_CATALOG_OPERATIONS_IMAGE_LOAD_LATENCY_THUMBNAIL_SINGLE_COLLECTION";
                    case 2090:
                        return "WHATSAPP_CATALOG_OPERATIONS_GET_COLLECTIONS";
                    case 2254:
                        return "WHATSAPP_CATALOG_OPERATIONS_GET_PRODUCT_LIST";
                    case 3128:
                        return "WHATSAPP_CATALOG_OPERATIONS_IMAGE_LOAD_LATENCY_THUMBNAIL_CART";
                    case 4395:
                        return "WHATSAPP_CATALOG_OPERATIONS_VERIFY_POSTCODE";
                    case 4401:
                        return "WHATSAPP_CATALOG_OPERATIONS_GET_SINGLE_COLLECTION";
                    case 5314:
                        return "WHATSAPP_CATALOG_OPERATIONS_GET_SINGLE_COLLECTION_CATEGORIES";
                    case 6263:
                        return "WHATSAPP_CATALOG_OPERATIONS_GET_PRODUCT";
                    case 9314:
                        return "WHATSAPP_CATALOG_OPERATIONS_GET_PROMOTIONS";
                    case 9318:
                        return "WHATSAPP_CATALOG_OPERATIONS_IMAGE_LOAD_LATENCY_THUMBNAIL_VARIANTS";
                    case 10103:
                        return "WHATSAPP_CATALOG_OPERATIONS_IMAGE_LOAD_LATENCY_THUMBNAIL_CATALOG_SEARCH";
                    case 10123:
                        return "WHATSAPP_CATALOG_OPERATIONS_IMAGE_LOAD_LATENCY_FULLSIZE_PRODUCT";
                    case 10195:
                        return "WHATSAPP_CATALOG_OPERATIONS_PLACE_ORDER";
                    case 10715:
                        return "WHATSAPP_CATALOG_OPERATIONS_IMAGE_LOAD_LATENCY_THUMBNAIL_PRODUCT_LIST";
                    case 10814:
                        return "WHATSAPP_CATALOG_OPERATIONS_REFRESH_CART";
                    case 12994:
                        return "WHATSAPP_CATALOG_OPERATIONS_IMAGE_LOAD_LATENCY_THUMBNAIL_CATALOG";
                    case 13375:
                        return "WHATSAPP_CATALOG_OPERATIONS_OPEN_VARIANTS_PAGE";
                    case 14143:
                        return "WHATSAPP_CATALOG_OPERATIONS_PRODUCT_CATALOG_EVENT";
                    case 14286:
                        return "WHATSAPP_CATALOG_OPERATIONS_CATALOG_HOME_PAGE";
                    case 14565:
                        return "WHATSAPP_CATALOG_OPERATIONS_GET_CATALOG";
                    case 14773:
                        return "WHATSAPP_CATALOG_OPERATIONS_IMAGE_LOAD_LATENCY_THUMBNAIL_COLLECTIONS";
                    case 15390:
                        return "WHATSAPP_CATALOG_OPERATIONS_IMAGE_LOAD_LATENCY_THUMBNAIL_SENT_CART";
                    case 16159:
                        return "WHATSAPP_CATALOG_OPERATIONS_GET_CATEGORIES";
                    case 16317:
                        return "WHATSAPP_CATALOG_OPERATIONS_GET_CATALOG_SEARCH";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
            case 13989:
                if (s == 1) {
                    return "WHATSAPP_QPL_LISTENERS_WHATSAPP_QPL_LISTENERS";
                }
                return "UNDEFINED_QPL_EVENT";
            case 14109:
                if (s == 16198) {
                    return "WA_WFL_AL_AC_FLOW";
                }
                return "UNDEFINED_QPL_EVENT";
            case 14143:
                if (s == 1) {
                    return "WHATSAPP_SEARCH_WHATSAPP_GLOBAL_SEARCH";
                }
                return "UNDEFINED_QPL_EVENT";
            case 14154:
                if (s == 2955) {
                    return "WHATSAPP_WAFFLE_CROSSPOST";
                }
                if (s == 5217) {
                    return "WHATSAPP_WAFFLE_STATUS_PRIVACY_SETTINGS_DETAIL";
                }
                if (s == 7566) {
                    return "WHATSAPP_WAFFLE_LINKING";
                }
                if (s == 9353) {
                    return "WHATSAPP_WAFFLE_AUDIENCE_SELECTOR";
                }
                if (s == 12020) {
                    return "WHATSAPP_WAFFLE_CONTEXTUAL_UPSELL";
                }
                if (s == 14007) {
                    return "WHATSAPP_WAFFLE_CONTEXTUAL_CTA";
                }
                return "UNDEFINED_QPL_EVENT";
            case 14447:
                if (s == 1) {
                    return "WHATSAPP_META_VERIFIED_WHATSAPP_MV_ELIGIBILITY_CHECK";
                }
                if (s == 13243) {
                    return "WHATSAPP_META_VERIFIED_WHATSAPP_BLOKS_ANDROID";
                }
                return "UNDEFINED_QPL_EVENT";
            case 15325:
                if (s == 3378) {
                    return "WHATSAPP_X_FAMILY_EVENT_LINKING";
                }
                return "UNDEFINED_QPL_EVENT";
            case 15670:
                if (s == 11639) {
                    return "WHATSAPP_CHANNELS_CHANNEL_FOLLOW";
                }
                if (s == 14846) {
                    return "WHATSAPP_CHANNELS_CHANNEL_OPEN";
                }
                return "UNDEFINED_QPL_EVENT";
            case 15707:
                switch (s) {
                    case 1188:
                        return "WHATSAPP_ADS_MANAGE_AD_SCREEN_LOAD";
                    case 2306:
                        return "WHATSAPP_ADS_LOGIN_ACCOUNT_LOAD";
                    case 3121:
                        return "WHATSAPP_ADS_BIZTAB_INSIGHTS_LOAD";
                    case 3242:
                        return "WHATSAPP_ADS_CURRENT_LOCATION_LOAD";
                    case 3645:
                        return "WHATSAPP_ADS_PAYMENT_INFO_SCREEN_TIME_SPENT";
                    case 4166:
                        return "WHATSAPP_ADS_AD_SETTINGS_STEP_LOAD";
                    case 4247:
                        return "WHATSAPP_ADS_VIDEO_PROMOTION_LOAD";
                    case 4371:
                        return "WHATSAPP_ADS_ICEBREAKER_LOADING";
                    case 4807:
                        return "WHATSAPP_ADS_AD_ACCOUNT_RECOVERY_UI_FLOW";
                    case 5897:
                        return "WHATSAPP_ADS_FETCH_QUICK_PROMOTIONS";
                    case 6518:
                        return "WHATSAPP_ADS_AD_ACCOUNT_RECOVERY_REQUEST_CODE";
                    case 6600:
                        return "WHATSAPP_ADS_MAP_LOCATION_TYPEAHEAD_SEARCH_LOAD";
                    case 7345:
                        return "WHATSAPP_ADS_CONSENT_ACTION";
                    case 8306:
                        return "WHATSAPP_ADS_AD_LOAD";
                    case 8330:
                        return "WHATSAPP_ADS_EMBEDDED_PAYMENT_PREFETCHING_SCREEN_LOAD";
                    case 9335:
                        return "WHATSAPP_ADS_MANAGE_ADS_FETCH_NONCE";
                    case 10129:
                        return "WHATSAPP_ADS_AD_CREATION_SCREEN_LOAD";
                    case 10409:
                        return "WHATSAPP_ADS_AD_MEDIA_DEFAULT_CONTENT_LOAD";
                    case 11210:
                        return "WHATSAPP_ADS_EXPLAINER_SCREEN_CONTENT_LOAD";
                    case 11531:
                        return "WHATSAPP_ADS_CREATE_AD_ACTION";
                    case 11681:
                        return "WHATSAPP_ADS_FAST_TRACK_LOAD";
                    case 12237:
                        return "WHATSAPP_ADS_WHATSAPP_CTWA_THREAD_CREATION";
                    case 12554:
                        return "WHATSAPP_ADS_EMBEDDED_PAYMENT_SCREEN_LOAD";
                    case 12647:
                        return "WHATSAPP_ADS_LONG_TERM_HOLDOUT_CONFIG_FETCH";
                    case 13380:
                        return "WHATSAPP_ADS_CTWA_UI_TTRC";
                    case 14654:
                        return "WHATSAPP_ADS_MANAGE_ADS_FETCH_TOKEN";
                    case 14760:
                        return "WHATSAPP_ADS_WEB_VIEW_LOAD";
                    case 14769:
                        return "WHATSAPP_ADS_AD_DETAILS_SCREEN_LOAD";
                    case 15107:
                        return "WHATSAPP_ADS_AD_MEDIA_UPLOAD";
                    case 15144:
                        return "WHATSAPP_ADS_DESIGN_AD_STEP_LOAD";
                    case 15316:
                        return "WHATSAPP_ADS_CONSENT_SCREEN_LOAD";
                    case 15318:
                        return "WHATSAPP_ADS_MESSAGING_GUIDE_TTRC";
                    case 16301:
                        return "WHATSAPP_ADS_MANAGE_ADS_FETCH_ADS";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
            default:
                return "UNDEFINED_QPL_MODULE";
        }
    }
}
