package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.96l  reason: invalid class name */
public abstract class AnonymousClass96l {
    public static final AnonymousClass3S8 A00(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject A1C = C36441kJ.A1C(str);
            return new AnonymousClass3S8(A1C.optLong("numPhotoReceived"), A1C.optLong("numPhotoDownloaded"), A1C.optLong("numMidScan"), A1C.optLong("numPhotoFull"), A1C.optLong("numPhotoWifi"), A1C.optLong("numPhotoVoDownloaded"), A1C.optLong("numVideoReceived"), A1C.optLong("numVideoDownloaded"), A1C.optLong("numVideoDownloadedLte"), A1C.optLong("numVideoDownloadedWifi"), A1C.optLong("numVideoHdDownloaded"), A1C.optLong("numVideoVoDownloaded"), A1C.optLong("numDocsReceived"), A1C.optLong("numDocsDownloaded"), A1C.optLong("numLargeDocsReceived"), A1C.optLong("numDocsDownloadedLte"), A1C.optLong("numDocsDownloadedWifi"), A1C.optLong("numMediaAsDocsDownloaded"), A1C.optLong("numAudioReceived"), A1C.optLong("numAudioDownloaded"), A1C.optLong("numGifDownloaded"), A1C.optLong("numInlinePlayedVideo"), A1C.optLong("numUrlReceived"), A1C.optLong("numMediaChatDownloaded"), A1C.optLong("numMediaChatReceived"), A1C.optLong("numMediaCommunityDownloaded"), A1C.optLong("numMediaCommunityReceived"), A1C.optLong("numMediaGroupDownloaded"), A1C.optLong("numMediaGroupReceived"), A1C.optLong("numMediaStatusDownloaded"), A1C.optLong("numMediaStatusReceived"), A1C.optLong("numMediaDownloadFailed"));
        } catch (JSONException e) {
            e.getMessage();
            return null;
        }
    }
}
