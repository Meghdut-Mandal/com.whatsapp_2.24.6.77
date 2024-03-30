package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.96m  reason: invalid class name and case insensitive filesystem */
public abstract class C1899996m {
    public static final C131446Pb A00(String str) {
        Boolean bool;
        if (str == null) {
            return null;
        }
        try {
            JSONObject A1C = C36441kJ.A1C(str);
            long optLong = A1C.optLong("numPhotoSent");
            long optLong2 = A1C.optLong("numPhotoHdSent");
            long optLong3 = A1C.optLong("numPhotoVoSent");
            long optLong4 = A1C.optLong("numPhotoSentLte");
            long optLong5 = A1C.optLong("numPhotoSentWifi");
            long optLong6 = A1C.optLong("numVideoSent");
            long optLong7 = A1C.optLong("numVideoHdSent");
            long optLong8 = A1C.optLong("numVideoVoSent");
            long optLong9 = A1C.optLong("numVideoSentLte");
            long optLong10 = A1C.optLong("numVideoSentWifi");
            long optLong11 = A1C.optLong("numDocsSent");
            long optLong12 = A1C.optLong("numDocsSentLte");
            long optLong13 = A1C.optLong("numDocsSentWifi");
            long optLong14 = A1C.optLong("numLargeDocsSent");
            long optLong15 = A1C.optLong("numLargeDocsNonWifi");
            long optLong16 = A1C.optLong("numMediaSentAsDocs");
            long optLong17 = A1C.optLong("numAudioSent");
            long optLong18 = A1C.optLong("numSticker");
            long optLong19 = A1C.optLong("numUrl");
            long optLong20 = A1C.optLong("numGifSent");
            long optLong21 = A1C.optLong("numExternalShare");
            long optLong22 = A1C.optLong("numMediaSentChat");
            long optLong23 = A1C.optLong("numMediaSentGroup");
            long optLong24 = A1C.optLong("numMediaSentCommunity");
            long optLong25 = A1C.optLong("numMediaSentStatus");
            long optLong26 = A1C.optLong("numMediaUploadFailed");
            if (A1C.has("hdMediaTooltipSeen")) {
                bool = Boolean.valueOf(A1C.getBoolean("hdMediaTooltipSeen"));
            } else {
                bool = null;
            }
            return new C131446Pb(bool, optLong, optLong3, optLong2, optLong4, optLong5, optLong6, optLong8, optLong7, optLong9, optLong10, optLong11, optLong12, optLong13, optLong14, optLong15, optLong16, optLong17, optLong18, optLong19, optLong20, optLong21, optLong22, optLong23, optLong24, optLong25, optLong26);
        } catch (JSONException e) {
            e.getMessage();
            return null;
        }
    }
}
