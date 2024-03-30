package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import com.whatsapp.videoplayback.YoutubePlayerTouchOverlay;
import java.io.InputStream;
import java.util.Locale;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* renamed from: X.5NQ  reason: invalid class name */
public class AnonymousClass5NQ extends C65083Qq {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 1;
    public int A03 = -1;
    public long A04 = -9223372036854775807L;
    public JSONObject A05;
    public boolean A06 = false;
    public Bitmap[] A07;
    public C79593ty A08;
    public boolean A09 = false;
    public final Context A0A;
    public final WebView A0B;
    public final AnonymousClass17Y A0C;
    public final AnonymousClass5NK A0D;
    public final YoutubePlayerTouchOverlay A0E;
    public final ViewGroup A0F;
    public final AnonymousClass1DU A0G;
    public final String A0H;

    public Bitmap A07() {
        return null;
    }

    public void A0V(boolean z) {
    }

    public boolean A0Y() {
        return false;
    }

    public boolean A0Z() {
        return false;
    }

    public static void A00(AnonymousClass5NQ r10) {
        WebView webView = r10.A0B;
        Locale locale = Locale.US;
        String str = r10.A0H;
        C18740tg.A05(str);
        Object[] A0L = AnonymousClass001.A0L();
        JSONObject jSONObject = r10.A05;
        C18740tg.A06(jSONObject);
        A0L[0] = jSONObject.toString();
        webView.loadDataWithBaseURL("https://whatsapp.com", String.format(locale, str, A0L), "text/html", C19430v1.A0B, "https://youtube.com");
    }

    public int A05() {
        long j = this.A04;
        if (j == -9223372036854775807L) {
            return 0;
        }
        return (int) j;
    }

    public void A0A() {
        if (this.A06) {
            Log.i("InlineYoutubeVideoPlayer/pause");
            this.A0B.loadUrl("javascript:(function() { player.pauseVideo(); })()");
            this.A02 = 2;
            this.A00 = 2;
            AnonymousClass5NK r1 = this.A0D;
            r1.A07();
            r1.A0J = true;
        }
    }

    public void A0C() {
        if (!this.A09) {
            Log.i("InlineYoutubeVideoPlayer/start");
            this.A09 = true;
            C79593ty r3 = this.A08;
            if (r3 != null) {
                C164977sg r1 = new C164977sg(this, 16);
                Executor executor = this.A0C.A04;
                r3.A0B(r1, executor);
                r3.A00.A03(new C164977sg(this, 17), executor);
                return;
            }
            A00(this);
            return;
        }
        this.A0B.loadUrl("javascript:(function() { player.playVideo(); })()");
        this.A02 = 1;
        this.A00 = 1;
        AnonymousClass5NK r0 = this.A0D;
        r0.A0F();
        r0.A0J = true;
    }

    public void A0D() {
        Log.i("InlineYoutubeVideoPlayer/stop");
        YoutubePlayerTouchOverlay youtubePlayerTouchOverlay = this.A0E;
        if (youtubePlayerTouchOverlay.getChildCount() > 0) {
            youtubePlayerTouchOverlay.removeAllViews();
        }
        WebView webView = this.A0B;
        webView.removeJavascriptInterface("YoutubeJsInterface");
        webView.stopLoading();
        webView.destroy();
        this.A01 = 0;
        this.A03 = -1;
        this.A00 = 0;
        this.A02 = 1;
        this.A06 = false;
        this.A09 = false;
        this.A04 = -9223372036854775807L;
        C79593ty r0 = this.A08;
        if (r0 != null) {
            r0.A0E();
        }
    }

    public void A0L(int i) {
        if (this.A06) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("InlineYoutubeVideoPlayer/seekTo: ");
            int i2 = i / 1000;
            C36321k7.A1Y(A0u, i2);
            WebView webView = this.A0B;
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("javascript:(function() { player.seekTo(");
            A0u2.append(i2);
            webView.loadUrl(AnonymousClass000.A0q(", true); })()", A0u2));
            this.A01 = i;
        }
    }

    public boolean A0X() {
        return AnonymousClass000.A1O(this.A02);
    }

    public AnonymousClass5NQ(Context context, Bitmap bitmap, C24801Dv r14, AnonymousClass17Y r15, AnonymousClass1DU r16, AnonymousClass1FU r17, C132166Sm r18, AnonymousClass3T1 r19, AnonymousClass5NK r20, String str, int i) {
        String str2;
        JSONObject jSONObject;
        int i2;
        InputStream openRawResource;
        this.A0A = context;
        this.A0C = r15;
        AnonymousClass1DU r5 = r16;
        this.A0G = r5;
        AnonymousClass5NK r6 = r20;
        this.A0D = r6;
        AnonymousClass3T1 r8 = r19;
        if (r17.A00(r8)) {
            C79593ty r7 = new C79593ty();
            C132166Sm r9 = r18;
            if (!r8.A1I()) {
                C19770wU r4 = r9.A02;
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append(r8.A1J.A01);
                r4.Bp2(new AnonymousClass736(r9, r8, r7, 0), AnonymousClass000.A0q("counterAbuseTokenUtils", A0u));
            } else {
                AnonymousClass6AK A002 = C132166Sm.A00(r9, r8);
                if (A002 != null) {
                    r7.A0C(A002);
                } else {
                    r7.A0D(new AnonymousClass5V8());
                }
            }
            this.A08 = r7;
        }
        try {
            openRawResource = this.A0A.getResources().openRawResource(R.raw.youtube_player_iframe);
            str2 = new String(AnonymousClass14X.A04(openRawResource));
            if (openRawResource != null) {
                openRawResource.close();
            }
        } catch (Exception e) {
            Log.e((Throwable) e);
            A01(this, "Unable to load youtube html frame.", "youtube_html_frame_load_failed", false);
            str2 = null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        this.A0H = str2;
        ViewGroup viewGroup = (ViewGroup) C36381kD.A0K(LayoutInflater.from(context), R.layout.f9nameremoved);
        this.A0F = viewGroup;
        WebView webView = (WebView) C012005e.A02(viewGroup, R.id.youtubeWebView);
        this.A0B = webView;
        YoutubePlayerTouchOverlay youtubePlayerTouchOverlay = (YoutubePlayerTouchOverlay) C012005e.A02(viewGroup, R.id.youtubePlayerTouchOverlay);
        this.A0E = youtubePlayerTouchOverlay;
        youtubePlayerTouchOverlay.A01 = r6;
        int i3 = i;
        youtubePlayerTouchOverlay.A00 = i3;
        ViewGroup.LayoutParams layoutParams = youtubePlayerTouchOverlay.getLayoutParams();
        layoutParams.height = i3;
        youtubePlayerTouchOverlay.setLayoutParams(layoutParams);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        webView.getSettings().setUserAgentString(WebSettings.getDefaultUserAgent(context));
        webView.getSettings().setAllowFileAccess(false);
        webView.getSettings().setAllowUniversalAccessFromFileURLs(false);
        webView.addJavascriptInterface(new AnonymousClass61G(this), "YoutubeJsInterface");
        AnonymousClass00C.A0D(r5, 0);
        String A022 = AnonymousClass3TO.A02(Uri.parse(AnonymousClass1DU.A01(str)));
        int i4 = 0;
        try {
            String queryParameter = Uri.parse(str).getQueryParameter("t");
            if (queryParameter != null) {
                if (queryParameter.contains("h")) {
                    String[] split = queryParameter.split("h");
                    i2 = Integer.parseInt(split[0]) * 3600;
                    queryParameter = split[1];
                } else {
                    i2 = 0;
                }
                if (queryParameter.contains("m")) {
                    String[] split2 = queryParameter.split("m");
                    i2 += Integer.parseInt(split2[0]) * 60;
                    queryParameter = split2[1];
                }
                i4 = i2 + Integer.parseInt(queryParameter.contains("s") ? queryParameter.split("s")[0] : queryParameter);
            }
        } catch (Exception unused) {
        }
        if (A022 == null) {
            A01(this, "Unable to parse youtube id.", "youtube_id_parse_failed", false);
            return;
        }
        try {
            JSONObject A1B = C36441kJ.A1B();
            JSONObject A1B2 = C36441kJ.A1B();
            A1B2.put("onReady", "onPlayerReady").put("onError", "onPlayerError").put("onStateChange", "onPlayerStateChange");
            A1B.put("start", i4).put("rel", 0).put("modestbranding", 0).put("iv_load_policy", 3).put("autohide", 1).put("autoplay", 1).put("cc_load_policy", 1).put("playsinline", 1).put("controls", 0);
            jSONObject = C36441kJ.A1B().put("videoId", A022).put("events", A1B2).put("height", "100%").put("width", "100%").put("playerVars", A1B);
        } catch (Exception e2) {
            Log.e((Throwable) e2);
            jSONObject = null;
        }
        this.A05 = jSONObject;
        if (jSONObject == null) {
            A01(this, "Invalid player params.", "invalid_player_params", true);
            return;
        }
        webView.setWebViewClient(new C92644eJ(r14, this));
        this.A07 = new Bitmap[]{bitmap};
        webView.setWebChromeClient(new C92574eC(this));
        return;
        throw th;
    }

    public static void A01(AnonymousClass5NQ r2, String str, String str2, boolean z) {
        r2.A0U(AnonymousClass000.A0p("InlineYoutubeVideoPlayer: ", str, AnonymousClass000.A0u()), str2, z);
    }

    public int A04() {
        return this.A01;
    }

    public View A08() {
        return this.A0F;
    }
}
