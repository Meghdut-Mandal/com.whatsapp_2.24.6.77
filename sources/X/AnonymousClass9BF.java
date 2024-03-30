package X;

import android.util.SparseArray;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.9BF  reason: invalid class name */
public abstract class AnonymousClass9BF {
    public static final AnonymousClass007 A00;
    public static final AnonymousClass007 A01;
    public static final AnonymousClass007 A02;
    public static final C26641Ky A03;
    public static final HashMap A04;
    public static final Set A05 = new LinkedHashSet(Arrays.asList(new String[]{"af", "sq", "am", "ar", "az", "bn", "bg", "ca", "zh-CN", "zh-HK", "zh-TW", "hr", "cs", "da", "nl", "en", "et", "fil", "fi", "fr", "de", "el", "gu", "ha", "he", "hi", "hu", PublicKeyCredentialControllerUtility.JSON_KEY_ID, "ga", "it", "ja", "kn", "kk", "ko", "lo", "lv", "lt", "mk", "ms", "ml", "mr", "nb", "om", "fa", "pl", "pt-BR", "pt-PT", "pa", "ro", "ru", "sr", "sk", "sl", "es", "sw", "sv", "tl", "ta", "te", "th", "tr", "uk", "ur", "uz", "vi"}));

    static {
        AnonymousClass007 r1 = new AnonymousClass007(24);
        A02 = r1;
        r1.put("am", 4768);
        r1.put("ar", 1593);
        r1.put("az", 399);
        r1.put("bn", 2437);
        r1.put("zh-Hans", 35831);
        r1.put("zh-Hant", 35531);
        r1.put("hr", 273);
        r1.put("gu", 2693);
        r1.put("hi", 2308);
        r1.put("kn", 3205);
        r1.put("kk", 1201);
        r1.put("lo", 3713);
        r1.put("mk", 1107);
        r1.put("ml", 3333);
        r1.put("mr", 2418);
        r1.put("fa", 1740);
        r1.put("pa", 2576);
        r1.put("ro", 539);
        r1.put("sr", 1115);
        r1.put("ta", 2949);
        r1.put("te", 3077);
        r1.put("th", 3585);
        r1.put("uk", 1111);
        r1.put("ur", 1746);
        AnonymousClass007 r12 = new AnonymousClass007(14);
        A01 = r12;
        A00(r12, "ar", 1632);
        A00(r12, "bn", 2534);
        A00(r12, "fa", 1776);
        A00(r12, "gu", 2790);
        A00(r12, "hi", 2406);
        A00(r12, "kn", 3302);
        A00(r12, "lo", 3792);
        A00(r12, "ml", 3430);
        A00(r12, "mr", 2406);
        A00(r12, "pa", 2662);
        A00(r12, "ta", 3046);
        A00(r12, "te", 3174);
        A00(r12, "th", 3664);
        A00(r12, "ur", 1776);
        C26641Ky r0 = new C26641Ky(47);
        A03 = r0;
        r0.A03("AF", new String[]{"fa-AF", "en-GB"});
        r0.A03("AL", new String[]{"sq-AL", "en-GB"});
        r0.A03("DZ", new String[]{"ar-DZ", "fr-DZ"});
        r0.A03("AD", new String[]{"ca-AD", "es-ES", "pt-PT", "fr-FR"});
        r0.A03("AR", new String[]{"es-AR"});
        r0.A03("AU", new String[]{"en-AU"});
        r0.A03("AT", new String[]{"de-AT"});
        r0.A03("AZ", new String[]{"az-AZ", "ru-RU", "tr-TR"});
        r0.A03("BH", new String[]{"ar-BH", "en-GB"});
        r0.A03("BD", new String[]{"bn-BD", "en-GB"});
        r0.A03("BE", new String[]{"nl-BE", "fr-BE"});
        r0.A03("BO", new String[]{"es-BO"});
        r0.A03("BA", new String[]{"hr-BA", "sr-BA"});
        r0.A03("BR", new String[]{"pt-BR"});
        r0.A03("BN", new String[]{"ms-BN", "en-GB", "zh-CN", "zh-TW"});
        r0.A03("BF", new String[]{"fr-BF"});
        r0.A03("BI", new String[]{"en-BI", "fr-BI", "sw-TZ"});
        r0.A03("CM", new String[]{"fr-CM", "en-CM"});
        r0.A03("CA", new String[]{"en-CA", "fr-CA"});
        r0.A03("TD", new String[]{"fr-TD", "ar-TD"});
        r0.A03("CL", new String[]{"es-CL"});
        r0.A03("CO", new String[]{"es-CO"});
        r0.A03("KM", new String[]{"fr-KM", "en-GB", "ar-KM"});
        r0.A03("CD", new String[]{"fr-CD", "sw-CD"});
        r0.A03("CR", new String[]{"es-CR"});
        r0.A03("CU", new String[]{"es-CU"});
        r0.A03("CZ", new String[]{"cs-CZ"});
        r0.A03("DJ", new String[]{"fr-DJ", "en-GB", "ar-DJ"});
        r0.A03("DO", new String[]{"es-DO"});
        r0.A03("EC", new String[]{"es-EC"});
        r0.A03("EG", new String[]{"ar-EG"});
        r0.A03("SV", new String[]{"es-SV"});
        r0.A03("ER", new String[]{"en-ER", "ar-ER"});
        r0.A03("FI", new String[]{"fi-FI"});
        r0.A03("FR", new String[]{"fr-FR"});
        r0.A03("DE", new String[]{"de-DE"});
        r0.A03("GH", new String[]{"en-GH"});
        r0.A03("GT", new String[]{"es-GT"});
        r0.A03("HT", new String[]{"fr-HT"});
        r0.A03("HN", new String[]{"es-HN"});
        r0.A03("IN", new String[]{"en-IN", "hi-IN", "mr-IN", "gu-IN", "ta-IN", "bn-IN", "te-IN", "kn-IN", "ml-IN", "pa-IN", "ur-IN"});
        r0.A03("IR", new String[]{"fa-IR", "en-GB"});
        r0.A03("IQ", new String[]{"ar-iq"});
        r0.A03("IE", new String[]{"en-IE", "ga-IE"});
        r0.A03("IL", new String[]{"iw-IL", "ar-IL", "en-IL", "ru-RU"});
        r0.A03("IT", new String[]{"it-IT"});
        r0.A03("CI", new String[]{"fr-CI"});
        r0.A03("JO", new String[]{"ar-JO", "en-GB"});
        r0.A03("KZ", new String[]{"kk-KZ", "ru-KZ"});
        r0.A03("KE", new String[]{"en-KE", "sw-KE"});
        r0.A03("XK", new String[]{"sq-XK", "sr-XK", "hr-HR"});
        r0.A03("KW", new String[]{"ar-KW", "en-GB"});
        r0.A03("KG", new String[]{"ru-KG"});
        r0.A03("LA", new String[]{"lo-LA", "th-TH", "en-GB"});
        r0.A03("LB", new String[]{"ar-LB", "en-GB", "fr-FR"});
        r0.A03("LY", new String[]{"ar-LY"});
        r0.A03("MK", new String[]{"mk-MK", "sq-MK", "tr-TR", "hr-HR", "sr-RS"});
        r0.A03("MW", new String[]{"en-MW", "sw-TZ"});
        r0.A03("MY", new String[]{"ms-MY", "en-MY", "zh-CN", "zh-TW", "ta-MY"});
        r0.A03("ML", new String[]{"fr-ML"});
        r0.A03("MR", new String[]{"ar-MR", "fr-MR"});
        r0.A03("MX", new String[]{"es"});
        r0.A03("MD", new String[]{"ro-MD", "ru-MD"});
        r0.A03("MA", new String[]{"ar-MA", "fr-MA"});
        r0.A03("MZ", new String[]{"pt-MZ"});
        r0.A03("NL", new String[]{"nl-NL"});
        r0.A03("NI", new String[]{"es-NI"});
        r0.A03("NE", new String[]{"ar-TD", "fr-NE"});
        r0.A03("OM", new String[]{"ar-OM", "en-GB"});
        r0.A03("PK", new String[]{"en-PK", "ur-PK"});
        r0.A03("PA", new String[]{"es-PA"});
        r0.A03("PY", new String[]{"es-PY"});
        r0.A03("PE", new String[]{"es-PE"});
        r0.A03("PH", new String[]{"en-PH", "fil-PH", "es-PH", "ar-EG"});
        r0.A03("PL", new String[]{"pl-PL"});
        r0.A03("PT", new String[]{"pt-PT"});
        r0.A03("QA", new String[]{"ar-QA", "en-GB"});
        r0.A03("RO", new String[]{"ro-RO"});
        r0.A03("RU", new String[]{"ru-RU"});
        r0.A03("RW", new String[]{"en-RW", "fr-RW", "sw-TZ"});
        r0.A03("SA", new String[]{"ar-SA", "en-GB"});
        r0.A03("SN", new String[]{"fr-SN"});
        r0.A03("SG", new String[]{"en-SG"});
        String str = "hr-HR";
        r0.A03("SI", new String[]{"sl-SI", "en-SI", str, "it-IT", "hu-HU", "sr-RS"});
        r0.A03("SO", new String[]{"en-GB", "ar-SO"});
        r0.A03("ZA", new String[]{"en-ZA"});
        r0.A03("SS", new String[]{"en-SS", "ar-SS"});
        r0.A03("ES", new String[]{"es-ES"});
        r0.A03("LK", new String[]{"en-GB"});
        r0.A03("SD", new String[]{"ar-SD", "en-SD"});
        r0.A03("CH", new String[]{"de-CH", "fr-CH"});
        r0.A03("SY", new String[]{"ar-SY"});
        r0.A03("TZ", new String[]{"en-TZ", "sw-TZ"});
        r0.A03("TN", new String[]{"ar-TN", "fr-TN"});
        r0.A03("TR", new String[]{"tr-TR", "ar"});
        r0.A03("UG", new String[]{"en-UG", "sw-UG"});
        r0.A03("UA", new String[]{"uk-UA", "ru-UA"});
        r0.A03("AE", new String[]{"ar-AE", "en-GB"});
        r0.A03("GB", new String[]{"en-GB", "ga-IE"});
        r0.A03("US", new String[]{"en-US", "es-LA", "pt-BR", "ar-AE", "zh-CN", "fr-FR", "ru-RU", "vi-VN", "ko-KR"});
        r0.A03("UZ", new String[]{"uz-UZ", "ru-RU"});
        r0.A03("VE", new String[]{"es-VE"});
        r0.A03("ZM", new String[]{"en-ZM"});
        r0.A03("ZW", new String[]{"en-ZW"});
        r0.A03("QQ", new String[]{"az-AZ", "ca-ES", "en-US", "es-ES", "fil-PH", "fr-FR", "ga-IE", str, "it-IT", "sw-TZ", "uz-UZ", "hu-HU", "ms-MY", "sq-AL", "sl-SI", "tr-TR", "kk-KZ", "ru-RU", "sr-RS", "uk-UA", "iw-IL", "ur-PK", "fa-IR", "ar-EG", "hi-IN", "bn-BD", "pa-IN", "te-IN", "mr-IN", "ta-IN", "gu-IN", "kn-IN", "ml-IN", "th-TH", "lo-LA", "zh-CN", "zh-TW", "ha-NG", "am-ET", "om-ET"});
        C26641Ky r7 = AnonymousClass99a.A00;
        SparseArray sparseArray = r7.A00;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            if (i < 0 || i >= sparseArray.size()) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Invalid index ");
                A0u.append(i);
                throw new ArrayIndexOutOfBoundsException(AnonymousClass000.A0q(" when fetching flavor specific country language data", A0u));
            }
            int keyAt = sparseArray.keyAt(i);
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("");
            A0u2.append((char) ((keyAt / 26) + 65));
            String A0t = AnonymousClass000.A0t(A0u2, (char) ((keyAt % 26) + 65));
            A03.A03(A0t, r7.A01(A0t));
        }
        AnonymousClass007 r13 = new AnonymousClass007(63);
        A00 = r13;
        r13.put("af", "Afrikaans");
        r13.put("sq", "Shqip");
        r13.put("am", "አማርኛ");
        r13.put("ar", "العربية");
        r13.put("az", "Azərbaycan dili");
        r13.put("bn", "বাংলা");
        r13.put("bg", "Български");
        r13.put("ca", "Català");
        r13.put("zh-Hans", "简体中文");
        r13.put("zh-Hant", "繁體中文");
        r13.put("zh-HK", "繁體中文（香港）");
        r13.put("zh-TW", "繁體中文（台灣)");
        r13.put("hr", "Hrvatski");
        r13.put("cs", "Čeština");
        r13.put("da", "Dansk");
        r13.put("nl", "Nederlands");
        r13.put("en", "English");
        r13.put("de", "Deutsch");
        r13.put("el", "Ελληνικά");
        r13.put("et", "Eesti");
        r13.put("fil", "Filipino");
        r13.put("fi", "Suomi");
        r13.put("fr", "Français");
        r13.put("gu", "ગુજરાતી");
        r13.put("ha", "Hausa");
        r13.put("iw", "עברית");
        r13.put("hi", "हिन्दी");
        r13.put("hu", "Magyar");
        r13.put("in", "Bahasa Indonesia");
        r13.put("ga", "Gaeilge");
        r13.put("it", "Italiano");
        r13.put("ja", "日本語");
        r13.put("kn", "ಕನ್ನಡ");
        r13.put("kk", "Қазақ тілі");
        r13.put("ko", "한국어");
        r13.put("lo", "ລາວ");
        r13.put("lv", "Latviešu");
        r13.put("lt", "Lietuvių");
        r13.put("mk", "Македонски");
        r13.put("ms", "Melayu");
        r13.put("ml", "മലയാളം");
        r13.put("mr", "मराठी");
        r13.put("nb", "Norsk bokmål");
        r13.put("om", "Oromoo");
        r13.put("fa", "فارسی");
        r13.put("pl", "Polski");
        r13.put("pt", "Português");
        r13.put("pt-BR", "Português (Brasil)");
        r13.put("pt-PT", "Português (Portugal)");
        r13.put("pa", "ਪੰਜਾਬੀ");
        r13.put("ro", "Română");
        r13.put("ru", "Русский");
        r13.put("sr", "Српски");
        r13.put("sk", "Slovenčina");
        r13.put("sl", "Slovenščina");
        r13.put("es", "Español");
        r13.put("sw", "Kiswahili");
        r13.put("sv", "Svenska");
        r13.put("tl", "Filipino");
        r13.put("ta", "தமிழ்");
        r13.put("te", "తెలుగు");
        r13.put("th", "ไทย");
        r13.put("tr", "Türkçe");
        r13.put("uk", "Українська");
        r13.put("ur", "اردو");
        r13.put("uz", "O‘zbek");
        r13.put("vi", "Tiếng Việt");
        LinkedHashMap A1G = C36431kI.A1G();
        A04 = A1G;
        A1G.put("af", "ZA");
        A1G.put("sq", "AL");
        A1G.put("am", "ET");
        A1G.put("ar", "EG");
        A1G.put("az", "AZ");
        A1G.put("bn", "BD");
        A1G.put("bg", "BG");
        A1G.put("ca", "AD");
        A1G.put("hr", "HR");
        A1G.put("cs", "CZ");
        A1G.put("da", "DK");
        A1G.put("nl", "NL");
        A1G.put("en", "US");
        A1G.put("et", "EE");
        A1G.put("fil", "PH");
        A1G.put("fi", "FI");
        A1G.put("fr", "FR");
        A1G.put("de", "DE");
        A1G.put("el", "GR");
        A1G.put("gu", "IN");
        A1G.put("ha", "NG");
        A1G.put("he", "IL");
        A1G.put("hi", "IN");
        A1G.put("hu", "HU");
        A1G.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "ID");
        A1G.put("in", "ID");
        A1G.put("ga", "IE");
        A1G.put("it", "IT");
        A1G.put("ja", "JP");
        A1G.put("kn", "IN");
        A1G.put("kk", "KZ");
        A1G.put("ko", "KR");
        A1G.put("lo", "LA");
        A1G.put("lv", "LV");
        A1G.put("lt", "LT");
        A1G.put("mk", "MK");
        A1G.put("ms", "MY");
        A1G.put("ml", "IN");
        A1G.put("mr", "IN");
        A1G.put("nb", "NO");
        A1G.put("om", "ET");
        A1G.put("fa", "IR");
        A1G.put("pl", "PL");
        A1G.put("pa", "IN");
        A1G.put("ro", "RO");
        A1G.put("ru", "RU");
        A1G.put("sr", "RS");
        A1G.put("sk", "SK");
        A1G.put("sl", "SI");
        A1G.put("es", "ES");
        A1G.put("sw", "KE");
        A1G.put("sv", "SE");
        A1G.put("tl", "PH");
        A1G.put("ta", "IN");
        A1G.put("te", "IN");
        A1G.put("th", "TH");
        A1G.put("tr", "TR");
        A1G.put("uk", "UA");
        A1G.put("ur", "PK");
        A1G.put("uz", "UZ");
        A1G.put("vi", "VN");
    }

    public static void A00(AnonymousClass007 r4, Object obj, char c) {
        HashSet hashSet = C26621Kw.A00;
        String[] strArr = new String[10];
        int i = 0;
        do {
            strArr[i] = Character.toString((char) (c + i));
            i++;
        } while (i < 10);
        r4.put(obj, strArr);
    }
}
