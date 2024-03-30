package X;

import android.content.SharedPreferences;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1Dx  reason: invalid class name and case insensitive filesystem */
public final class C24821Dx {
    public final C19890wg A00;
    public final AnonymousClass00T A01 = new AnonymousClass00U(new C24831Dy(this));
    public final C19420v0 A02;
    public final C20810yC A03;

    public C24821Dx(C19420v0 r3, C20810yC r4, C19890wg r5) {
        AnonymousClass00C.A0D(r5, 1);
        AnonymousClass00C.A0D(r4, 2);
        AnonymousClass00C.A0D(r3, 3);
        this.A00 = r5;
        this.A03 = r4;
        this.A02 = r3;
    }

    private final C131446Pb A00(C131446Pb r81) {
        C131446Pb r14 = r81;
        if (!C20800yB.A01(C21000yV.A02, this.A03, 7122)) {
            return r14;
        }
        Boolean valueOf = Boolean.valueOf(((SharedPreferences) this.A02.A00.get()).getBoolean("media_quality_tooltip_shown", false));
        long j = r14.A0F;
        long j2 = r14.A0I;
        long j3 = r14.A0E;
        long j4 = r14.A0G;
        long j5 = r14.A0H;
        return new C131446Pb(valueOf, j, j2, j3, j4, j5, r14.A0M, r14.A0P, r14.A0L, r14.A0N, r14.A0O, r14.A01, r14.A02, r14.A03, r14.A07, r14.A06, r14.A08, r14.A00, r14.A0J, r14.A0K, r14.A05, r14.A04, r14.A09, r14.A0B, r14.A0A, r14.A0C, r14.A0D);
    }

    public final AnonymousClass3S8 A01() {
        AnonymousClass3S8 A002;
        String string = ((SharedPreferences) this.A01.getValue()).getString("media_engagement_daily_received_key", (String) null);
        if (string == null || string.length() == 0 || (A002 = AnonymousClass96l.A00(string)) == null) {
            return new AnonymousClass3S8(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        }
        return A002;
    }

    public final C131446Pb A02() {
        C131446Pb r2;
        String string = ((SharedPreferences) this.A01.getValue()).getString("media_engagement_daily_sent_key", (String) null);
        if (string == null || string.length() == 0 || (r2 = C1899996m.A00(string)) == null) {
            r2 = new C131446Pb((Boolean) null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        }
        return A00(r2);
    }

    public final void A03(AnonymousClass3S8 r7) {
        try {
            SharedPreferences.Editor edit = ((SharedPreferences) this.A01.getValue()).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("numPhotoReceived", r7.A0M);
            jSONObject.put("numPhotoDownloaded", r7.A0J);
            jSONObject.put("numMidScan", r7.A0L);
            jSONObject.put("numPhotoFull", r7.A0K);
            jSONObject.put("numPhotoWifi", r7.A0O);
            jSONObject.put("numPhotoVoDownloaded", r7.A0N);
            jSONObject.put("numVideoReceived", r7.A0U);
            jSONObject.put("numVideoDownloaded", r7.A0Q);
            jSONObject.put("numVideoDownloadedLte", r7.A0R);
            jSONObject.put("numVideoDownloadedWifi", r7.A0S);
            jSONObject.put("numVideoHdDownloaded", r7.A0T);
            jSONObject.put("numVideoVoDownloaded", r7.A0V);
            jSONObject.put("numDocsReceived", r7.A05);
            jSONObject.put("numDocsDownloaded", r7.A02);
            jSONObject.put("numLargeDocsReceived", r7.A08);
            jSONObject.put("numDocsDownloadedLte", r7.A03);
            jSONObject.put("numDocsDownloadedWifi", r7.A04);
            jSONObject.put("numMediaAsDocsDownloaded", r7.A09);
            jSONObject.put("numAudioReceived", r7.A01);
            jSONObject.put("numAudioDownloaded", r7.A00);
            jSONObject.put("numGifDownloaded", r7.A06);
            jSONObject.put("numInlinePlayedVideo", r7.A07);
            jSONObject.put("numUrlReceived", r7.A0P);
            jSONObject.put("numMediaChatDownloaded", r7.A0A);
            jSONObject.put("numMediaChatReceived", r7.A0B);
            jSONObject.put("numMediaCommunityDownloaded", r7.A0C);
            jSONObject.put("numMediaCommunityReceived", r7.A0D);
            jSONObject.put("numMediaGroupDownloaded", r7.A0F);
            jSONObject.put("numMediaGroupReceived", r7.A0G);
            jSONObject.put("numMediaStatusDownloaded", r7.A0H);
            jSONObject.put("numMediaStatusReceived", r7.A0I);
            jSONObject.put("numMediaDownloadFailed", r7.A0E);
            String obj = jSONObject.toString();
            AnonymousClass00C.A08(obj);
            edit.putString("media_engagement_daily_received_key", obj).apply();
        } catch (JSONException e) {
            e.getMessage();
        }
    }

    public final void A04(C131446Pb r8) {
        try {
            C131446Pb A002 = A00(r8);
            SharedPreferences.Editor edit = ((SharedPreferences) this.A01.getValue()).edit();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("numPhotoSent", A002.A0F);
            jSONObject.put("numPhotoHdSent", A002.A0E);
            jSONObject.put("numPhotoVoSent", A002.A0I);
            jSONObject.put("numPhotoSentLte", A002.A0G);
            jSONObject.put("numPhotoSentWifi", A002.A0H);
            jSONObject.put("numVideoSent", A002.A0M);
            jSONObject.put("numVideoHdSent", A002.A0L);
            jSONObject.put("numVideoVoSent", A002.A0P);
            jSONObject.put("numVideoSentLte", A002.A0N);
            jSONObject.put("numVideoSentWifi", A002.A0O);
            jSONObject.put("numDocsSent", A002.A01);
            jSONObject.put("numDocsSentLte", A002.A02);
            jSONObject.put("numDocsSentWifi", A002.A03);
            jSONObject.put("numLargeDocsSent", A002.A07);
            jSONObject.put("numLargeDocsNonWifi", A002.A06);
            jSONObject.put("numMediaSentAsDocs", A002.A08);
            jSONObject.put("numAudioSent", A002.A00);
            jSONObject.put("numSticker", A002.A0J);
            jSONObject.put("numUrl", A002.A0K);
            jSONObject.put("numGifSent", A002.A05);
            jSONObject.put("numExternalShare", A002.A04);
            jSONObject.put("numMediaSentChat", A002.A09);
            jSONObject.put("numMediaSentGroup", A002.A0B);
            jSONObject.put("numMediaSentCommunity", A002.A0A);
            jSONObject.put("numMediaSentStatus", A002.A0C);
            jSONObject.put("numMediaUploadFailed", A002.A0D);
            Boolean bool = A002.A0Q;
            if (bool != null) {
                jSONObject.put("hdMediaTooltipSeen", bool.booleanValue());
            }
            String obj = jSONObject.toString();
            AnonymousClass00C.A08(obj);
            edit.putString("media_engagement_daily_sent_key", obj).apply();
        } catch (JSONException e) {
            e.getMessage();
        }
    }
}
