package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Patterns;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.6tS  reason: invalid class name and case insensitive filesystem */
public class C145166tS implements AnonymousClass00M {
    public static final Pattern A0b = Pattern.compile("(?i)\\bcharset=\\s*\"?([^\\s;\"]*)", 34);
    public static final Pattern A0c = Pattern.compile("<head[^>]*>(.*)</head>", 34);
    public static final Pattern A0d = Pattern.compile("<link([^>]+?)/?>", 34);
    public static final Pattern A0e = Pattern.compile("https://(www\\.)?pbs\\.twimg\\.com/profile_images", 2);
    public static final Pattern A0f = Pattern.compile("https://(www\\.)?pbs\\.twimg\\.com", 2);
    public static final Set A0g = C36421kH.A0g(new String[]{"og:image", "og:image:type", "og:video", "og:video:type", "og:video:url", "og:video:secure_url", "og:video:width", "og:video:height", "image", "og:thumbnail", "thumbnail", "twitter:image", "og:title", "title", "twitter:title", "og:description", "description", "twitter:description", "og:url", "og:site_name", "twitter:url", "invite_link_type_v2", "parent_group_subject", "wa:artist", "wa:song", "wa:song:url", "wa:author:name", "wa:author:url", "wa:author:profile_image", "wa:post:caption", "wa:landing:page", "wa:landing:label", "og:is_fb_video", "og:should_overlay_share_button", "og:should_overlay_share_button_wa_preq_test"});
    public static final Pattern A0h = Pattern.compile("\\s*([^=]+)\\s*=\\s*(?:\"([^\"]+)\"|\\'([^\\']+)\\')", 34);
    public static final Pattern A0i = Pattern.compile("<meta([^>]+?)/?>", 34);
    public static final Pattern A0j = Pattern.compile("<title[^>]*>(.*)</title>", 34);
    public int A00;
    public int A01;
    public int A02;
    public Bitmap A03;
    public C1041258j A04;
    public C601536r A05;
    public AnonymousClass5BJ A06;
    public Integer A07 = null;
    public String A08;
    public String A09;
    public String A0A = null;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public URL A0G;
    public URL A0H;
    public URL A0I;
    public URL A0J;
    public LinkedHashSet A0K = C36441kJ.A17();
    public boolean A0L = false;
    public boolean A0M;
    public boolean A0N = false;
    public boolean A0O = false;
    public byte[] A0P;
    public byte[] A0Q;
    public byte[] A0R;
    public int A0S;
    public long A0T;
    public long A0U;
    public long A0V;
    public Bitmap A0W;
    public boolean A0X;
    public final C20050ww A0Y;
    public final String A0Z;
    public final AnonymousClass1DU A0a;

    private C601536r A01(Map map, String... strArr) {
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2 = null;
        for (String A1A : strArr) {
            String A1A2 = C36431kI.A1A(A1A, map);
            if (A1A2 != null && C36361kB.A1Z(A1A2, Patterns.WEB_URL)) {
                try {
                    httpURLConnection = A04((String) null, C90524aI.A0j(A1A2));
                    if (httpURLConnection != null) {
                        try {
                            C601536r A002 = A00(A1A2, httpURLConnection.getHeaderField("Content-Type"), httpURLConnection.getContentLength());
                            if (A002 != null) {
                                A08(httpURLConnection);
                                return A002;
                            }
                        } catch (IOException e) {
                            e = e;
                            try {
                                Log.w("WebPageInfo/getGifOnPage Cannot connect.", e);
                                A08(httpURLConnection);
                            } catch (Throwable th) {
                                th = th;
                                httpURLConnection2 = httpURLConnection;
                                A08(httpURLConnection2);
                                throw th;
                            }
                        }
                    }
                } catch (IOException e2) {
                    e = e2;
                    httpURLConnection = null;
                    Log.w("WebPageInfo/getGifOnPage Cannot connect.", e);
                    A08(httpURLConnection);
                } catch (Throwable th2) {
                    th = th2;
                    A08(httpURLConnection2);
                    throw th;
                }
                A08(httpURLConnection);
            }
        }
        return null;
    }

    public static String A03(HashMap hashMap, String... strArr) {
        for (String A0l : strArr) {
            String A0l2 = C90504aG.A0l(A0l, hashMap);
            if (A0l2 != null) {
                return A0l2.trim();
            }
        }
        return null;
    }

    public static HttpURLConnection A04(String str, URL url) {
        URL url2 = null;
        try {
            URI uri = new URI(url.toString());
            if (!uri.getScheme().equals("https")) {
                uri = new URI("https", uri.getUserInfo(), uri.getHost(), uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
            }
            url2 = C90524aI.A0j(uri.toASCIIString());
        } catch (MalformedURLException | URISyntaxException unused) {
        }
        if (url2 == null) {
            return null;
        }
        URLConnection openConnection = url2.openConnection();
        if (!(openConnection instanceof HttpURLConnection)) {
            return null;
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setConnectTimeout(SearchActionVerificationClientService.NOTIFICATION_ID);
        httpURLConnection.setReadTimeout(SearchActionVerificationClientService.NOTIFICATION_ID);
        if (str != null) {
            httpURLConnection.setRequestProperty("Accept-Language", str);
        }
        httpURLConnection.setRequestProperty("User-Agent", "WhatsApp/2.23.20.0");
        return httpURLConnection;
    }

    public void A0E() {
        this.A0F = null;
        this.A0C = null;
        this.A09 = null;
        this.A0K.clear();
        this.A0X = false;
        this.A02 = 0;
        this.A0L = false;
        this.A0N = false;
        this.A0O = false;
    }

    public void A0F(AnonymousClass00I r14, C20810yC r15) {
        String str;
        int min;
        int i;
        Integer num = null;
        if (r14 != null) {
            str = (String) r14.A00;
        } else {
            str = null;
        }
        this.A0T = 0;
        long currentTimeMillis = System.currentTimeMillis();
        byte[] A0A2 = A0A(this, r15, str);
        if (A0A2 != null) {
            this.A0Q = A0L(A0A2, 100, 100, 140, 140, false);
            if (TextUtils.isEmpty(str) || !A0e.matcher(AnonymousClass1DU.A01(str)).find() || this.A0S != 0) {
                int i2 = this.A01;
                int i3 = this.A00;
                if (i2 > i3) {
                    i = Math.min(i2, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
                    min = (i3 * i) / i2;
                } else {
                    min = Math.min(i3, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
                    i = (min * i2) / i3;
                    if (i < 300) {
                        min = (i3 * 300) / i2;
                        i = 300;
                    }
                }
                this.A0R = A0L(A0A2, 300, 75, i, min, true);
            }
            if (r14 != null) {
                num = (Integer) r14.A01;
            }
            C1041258j r0 = this.A04;
            if (r0 != null) {
                r0.A0A = num;
            }
            this.A0T = C36441kJ.A0A(currentTimeMillis);
        }
    }

    public boolean A0J() {
        return false;
    }

    public byte[] A0K(Bitmap bitmap) {
        int min = Math.min(140, Math.min(bitmap.getWidth(), bitmap.getHeight()));
        int min2 = Math.min(bitmap.getWidth(), bitmap.getHeight());
        return A09(bitmap, new Rect((bitmap.getWidth() - min2) / 2, (bitmap.getHeight() - min2) / 2, (bitmap.getWidth() + min2) / 2, (bitmap.getHeight() + min2) / 2), min, min, 80);
    }

    private C601536r A00(String str, String str2, int i) {
        if (!"image/gif".equals(str2) || i == -1) {
            return null;
        }
        if (str.endsWith("giphy.gif")) {
            try {
                if (new URI(str).getHost().contains("giphy.com")) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append(str.substring(0, str.length() - 9));
                    A0u.append("200.mp4");
                    str = A0u.toString();
                    HttpURLConnection httpURLConnection = null;
                    try {
                        httpURLConnection = A04((String) null, C90524aI.A0j(str));
                        if (httpURLConnection != null) {
                            String headerField = httpURLConnection.getHeaderField("Content-Type");
                            if (headerField.equals("video/mp4")) {
                                C601536r r3 = new C601536r(str, httpURLConnection.getContentLength(), headerField);
                                A08(httpURLConnection);
                                return r3;
                            }
                        }
                    } catch (IOException e) {
                        Log.w("WebPageInfo/checkForMp4 Cannot connect.", e);
                    } catch (Throwable th) {
                        A08((HttpURLConnection) null);
                        throw th;
                    }
                    A08(httpURLConnection);
                }
            } catch (URISyntaxException e2) {
                Log.w("WebPageInfo/getGifInfo Cannot connect.", e2);
            }
        }
        return new C601536r(str, i, str2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01e8, code lost:
        if (r6.equals("true") == false) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0202, code lost:
        if (r0 != false) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x020a, code lost:
        if (r6 == false) goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0216, code lost:
        if (r10.equals("true") == false) goto L_0x0218;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0268, code lost:
        if ("video/mp4".equalsIgnoreCase(X.C90504aG.A0l("og:video:type", r1)) == false) goto L_0x026a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String A02(java.lang.String r20, java.lang.String r21, java.lang.String r22, java.net.URL r23, int r24) {
        /*
            r19 = this;
            r4 = r20
            java.util.regex.Pattern r0 = A0c
            java.util.regex.Matcher r1 = r0.matcher(r4)
            boolean r0 = r1.find()
            r3 = 1
            if (r0 == 0) goto L_0x0013
            java.lang.String r4 = r1.group(r3)
        L_0x0013:
            r2 = 0
            java.util.HashMap r1 = X.AnonymousClass001.A0J()
            java.util.regex.Pattern r0 = A0i
            java.util.regex.Matcher r6 = r0.matcher(r4)
        L_0x001e:
            boolean r0 = r6.find()
            r5 = r19
            if (r0 == 0) goto L_0x00db
            java.lang.String r0 = r6.group(r3)
            java.util.HashMap r8 = A06(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r21)
            java.lang.String r7 = "content"
            if (r0 == 0) goto L_0x009c
            java.lang.String r0 = "charset"
            java.lang.String r9 = X.C90504aG.A0l(r0, r8)
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x0054
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x009b
            java.lang.String r0 = X.C19430v1.A0B
            boolean r0 = r0.equalsIgnoreCase(r9)
            if (r0 != 0) goto L_0x009b
            r5.A0E()
            return r9
        L_0x0054:
            java.lang.String r0 = "http-equiv"
            java.lang.String r9 = X.C90504aG.A0l(r0, r8)
            java.lang.String r0 = "Content-Type"
            boolean r0 = r0.equalsIgnoreCase(r9)
            if (r0 == 0) goto L_0x009c
            java.lang.String r9 = X.C90504aG.A0l(r7, r8)
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x009c
            java.util.regex.Pattern r0 = A0b
            java.util.regex.Matcher r9 = r0.matcher(r9)
            boolean r0 = r9.find()
            if (r0 == 0) goto L_0x009c
            java.lang.String r0 = r9.group(r3)
            X.C18740tg.A06(r0)
            java.lang.String r2 = r0.trim()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = r2.toUpperCase(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x009c
            java.lang.String r0 = X.C19430v1.A0B
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L_0x009c
            r5.A0E()
            return r2
        L_0x009b:
            r2 = r9
        L_0x009c:
            java.lang.String r0 = "property"
            java.lang.String r5 = X.C90504aG.A0l(r0, r8)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x00ba
            java.lang.String r0 = "name"
            java.lang.String r5 = X.C90504aG.A0l(r0, r8)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x00ba
            java.lang.String r0 = "itemprop"
            java.lang.String r5 = X.C90504aG.A0l(r0, r8)
        L_0x00ba:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x001e
            java.util.Set r0 = A0g
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = X.C90504aG.A0l(r7, r8)
            if (r0 == 0) goto L_0x001e
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            java.lang.String r0 = r0.toString()
            r1.put(r5, r0)
            goto L_0x001e
        L_0x00db:
            java.lang.String r0 = r23.toString()
            r7 = r22
            r6 = r24
            X.36r r7 = r5.A00(r0, r7, r6)
            if (r7 != 0) goto L_0x0111
            java.lang.String r7 = "og:url"
            java.lang.String r6 = "twitter:url"
            java.lang.String r0 = "og:video"
            java.lang.String[] r0 = new java.lang.String[]{r7, r6, r0}
            X.36r r7 = r5.A01(r1, r0)
            if (r7 != 0) goto L_0x0111
            java.lang.String r0 = "og:image:type"
            java.lang.Object r6 = r1.get(r0)
            java.lang.String r0 = "image/gif"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0111
            java.lang.String r0 = "og:image"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            X.36r r7 = r5.A01(r1, r0)
        L_0x0111:
            r5.A05 = r7
            java.lang.String r14 = "og:image"
            java.lang.String r13 = "twitter:image"
            java.lang.String r12 = "image"
            java.lang.String r11 = "og:thumbnail"
            java.lang.String r0 = "thumbnail"
            java.lang.String[] r18 = new java.lang.String[]{r14, r13, r12, r11, r0}
            java.util.LinkedHashSet r10 = X.C36441kJ.A17()
            r9 = 5
            r8 = 0
        L_0x0127:
            r7 = r18[r8]
            java.lang.String r15 = X.C90504aG.A0l(r7, r1)
            if (r15 == 0) goto L_0x0151
            X.58j r6 = r5.A04
            if (r6 == 0) goto L_0x013a
            int r0 = r7.hashCode()
            switch(r0) {
                case -1940224620: goto L_0x040e;
                case -1137178311: goto L_0x0400;
                case -436432438: goto L_0x03f2;
                case 100313435: goto L_0x03e4;
                default: goto L_0x013a;
            }
        L_0x013a:
            java.lang.String r6 = r15.trim()
            int r0 = r7.hashCode()
            r17 = 3
            r16 = 2
            r15 = 0
            switch(r0) {
                case -1940224620: goto L_0x03b4;
                case -1137178311: goto L_0x03c0;
                case -436432438: goto L_0x03cc;
                case 100313435: goto L_0x03d8;
                default: goto L_0x014a;
            }
        L_0x014a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
        L_0x014e:
            X.C36341k9.A1H(r6, r0, r10)
        L_0x0151:
            int r8 = r8 + 1
            if (r8 < r9) goto L_0x0127
            r5.A0K = r10
            java.lang.String r0 = "wa:artist"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.lang.String r0 = A03(r1, r0)
            r5.A0D = r0
            java.lang.String r0 = "wa:song"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.lang.String r0 = A03(r1, r0)
            r5.A0E = r0
            java.lang.String r0 = "wa:song:url"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.net.URL r0 = A05(r1, r0)
            r5.A0J = r0
            java.lang.String r0 = "wa:author:name"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.lang.String r0 = A03(r1, r0)
            r5.A08 = r0
            java.lang.String r0 = "wa:post:caption"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.lang.String r0 = A03(r1, r0)
            r5.A0B = r0
            java.lang.String r0 = "wa:author:url"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.net.URL r0 = A05(r1, r0)
            r5.A0H = r0
            java.lang.String r0 = "wa:author:profile_image"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.net.URL r0 = A05(r1, r0)
            r5.A0G = r0
            java.lang.String r0 = "wa:landing:page"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.net.URL r0 = A05(r1, r0)
            r5.A0I = r0
            java.lang.String r0 = "wa:landing:label"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            A03(r1, r0)
            java.lang.String r0 = "og:is_fb_video"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.lang.String r6 = A03(r1, r0)
            java.lang.String r0 = "og:should_overlay_share_button"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.lang.String r10 = A03(r1, r0)
            java.lang.String r0 = "og:should_overlay_share_button_wa_preq_test"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.lang.String r9 = A03(r1, r0)
            java.lang.String r8 = "true"
            r7 = 1
            if (r6 == 0) goto L_0x01ea
            boolean r6 = r6.equals(r8)
            r0 = 1
            if (r6 != 0) goto L_0x01eb
        L_0x01ea:
            r0 = 0
        L_0x01eb:
            r5.A0L = r0
            if (r0 == 0) goto L_0x020f
            java.lang.String r6 = r23.getHost()
            java.lang.String r0 = "facebook.com"
            boolean r0 = r6.contains(r0)
            if (r0 != 0) goto L_0x0204
            java.lang.String r0 = "fb.watch"
            boolean r0 = r6.contains(r0)
            r6 = 0
            if (r0 == 0) goto L_0x0205
        L_0x0204:
            r6 = 1
        L_0x0205:
            boolean r0 = r5.A0L
            if (r0 == 0) goto L_0x020c
            r0 = 1
            if (r6 != 0) goto L_0x020d
        L_0x020c:
            r0 = 0
        L_0x020d:
            r5.A0L = r0
        L_0x020f:
            if (r10 == 0) goto L_0x0218
            boolean r6 = r10.equals(r8)
            r0 = 1
            if (r6 != 0) goto L_0x0219
        L_0x0218:
            r0 = 0
        L_0x0219:
            r5.A0N = r0
            if (r9 == 0) goto L_0x03b1
            boolean r0 = r9.equals(r8)
            if (r0 == 0) goto L_0x03b1
        L_0x0223:
            r5.A0O = r7
            java.lang.String r7 = "og:title"
            java.lang.String r6 = "twitter:title"
            java.lang.String r0 = "title"
            java.lang.String[] r0 = new java.lang.String[]{r7, r6, r0}
            java.lang.String r0 = A03(r1, r0)
            r5.A0F = r0
            java.lang.String r7 = "og:description"
            java.lang.String r6 = "twitter:description"
            java.lang.String r0 = "description"
            java.lang.String[] r0 = new java.lang.String[]{r7, r6, r0}
            java.lang.String r0 = A03(r1, r0)
            r5.A0C = r0
            java.lang.String r6 = "og:url"
            java.lang.String r0 = "twitter:url"
            java.lang.String[] r0 = new java.lang.String[]{r6, r0}
            java.lang.String r0 = A03(r1, r0)
            r5.A09 = r0
            java.lang.String r9 = "og:video"
            boolean r0 = r1.containsKey(r9)
            java.lang.String r8 = "og:video:type"
            if (r0 == 0) goto L_0x026a
            java.lang.String r6 = X.C90504aG.A0l(r8, r1)
            java.lang.String r0 = "video/mp4"
            boolean r6 = r0.equalsIgnoreCase(r6)
            r0 = 1
            if (r6 != 0) goto L_0x026b
        L_0x026a:
            r0 = 0
        L_0x026b:
            r5.A0X = r0
            if (r0 == 0) goto L_0x0299
            java.lang.String r0 = "og:site_name"
            java.lang.String r6 = X.C90504aG.A0l(r0, r1)
            java.lang.String r0 = "Facebook Watch"
            boolean r0 = r0.equalsIgnoreCase(r6)
            if (r0 == 0) goto L_0x0299
            java.lang.String r0 = r5.A09
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0299
            java.lang.String r0 = r5.A09
            android.net.Uri$Builder r7 = X.C90504aG.A0I(r0)
            java.lang.String r6 = "fw"
            java.lang.String r0 = "1"
            android.net.Uri$Builder r0 = r7.appendQueryParameter(r6, r0)
            java.lang.String r0 = X.C90474aD.A0b(r0)
            r5.A09 = r0
        L_0x0299:
            X.1DU r6 = r5.A0a
            java.lang.String r0 = r5.A09
            if (r0 != 0) goto L_0x02a3
            java.lang.String r0 = r23.toString()
        L_0x02a3:
            int r0 = X.AnonymousClass3TO.A01(r6, r0)
            r5.A0S = r0
            java.lang.String r7 = "og:video:url"
            java.lang.String r6 = "og:video:secure_url"
            java.lang.String[] r0 = new java.lang.String[]{r9, r7, r6}
            java.lang.String r12 = A03(r1, r0)
            int r10 = r5.A0S
            java.lang.String r8 = X.C90504aG.A0l(r8, r1)
            if (r10 == 0) goto L_0x03ae
            r0 = 4
            if (r10 == r0) goto L_0x03aa
            java.lang.String r0 = "video/mp4"
        L_0x02c2:
            boolean r11 = r0.equalsIgnoreCase(r8)
        L_0x02c6:
            int r10 = r5.A0S
            r8 = 0
            if (r12 == 0) goto L_0x0395
            if (r10 == 0) goto L_0x0395
            java.lang.String r0 = r23.toString()
            boolean r0 = android.webkit.URLUtil.isHttpsUrl(r0)
            if (r0 == 0) goto L_0x0395
            r0 = 4
            if (r10 != r0) goto L_0x02e2
            java.lang.String r0 = "embed"
            boolean r0 = r12.contains(r0)
            if (r0 == 0) goto L_0x0395
        L_0x02e2:
            if (r11 == 0) goto L_0x0395
            r5.A02 = r3
        L_0x02e6:
            boolean r0 = r5.A0X
            r8 = 4
            if (r0 == 0) goto L_0x0323
            int r0 = r5.A0S
            if (r0 == 0) goto L_0x0323
            if (r0 == r8) goto L_0x0323
            java.lang.String[] r0 = new java.lang.String[]{r9, r7, r6}
            java.lang.String r10 = A03(r1, r0)
            if (r10 == 0) goto L_0x0393
            java.lang.String r0 = "og:video:width"
            java.lang.String r9 = X.C90504aG.A0l(r0, r1)
            java.lang.String r0 = "og:video:height"
            java.lang.String r6 = X.C90504aG.A0l(r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r7 = -1
            if (r0 != 0) goto L_0x0391
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x0391
            int r7 = java.lang.Integer.parseInt(r9)
            int r6 = java.lang.Integer.parseInt(r6)
        L_0x031c:
            X.5BJ r0 = new X.5BJ
            r0.<init>(r10, r7, r6)
        L_0x0321:
            r5.A06 = r0
        L_0x0323:
            java.util.LinkedHashSet r0 = r5.A0K
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet
            r6.<init>(r0)
            java.util.LinkedHashSet r0 = r5.A0K
            r0.clear()
            java.util.Iterator r13 = r6.iterator()
        L_0x0333:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x041c
            java.lang.Object r12 = r13.next()
            X.00I r12 = (X.AnonymousClass00I) r12
            java.lang.Object r10 = r12.A00
            java.lang.String r10 = (java.lang.String) r10
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x038b
            java.util.regex.Pattern r6 = A0f
            java.lang.String r0 = X.AnonymousClass1DU.A01(r10)
            java.util.regex.Matcher r0 = r6.matcher(r0)
            boolean r0 = r0.find()
            if (r0 == 0) goto L_0x038b
            java.lang.String r11 = ":large"
            boolean r0 = r10.endsWith(r11)
            java.lang.String r9 = ":thumb"
            java.lang.String r7 = ":medium"
            java.lang.String r6 = ":small"
            if (r0 == 0) goto L_0x036f
            java.lang.String[] r0 = new java.lang.String[]{r7, r6, r9}
            r5.A07(r10, r11, r0)
            goto L_0x0333
        L_0x036f:
            boolean r0 = r10.endsWith(r7)
            if (r0 == 0) goto L_0x037d
            java.lang.String[] r0 = new java.lang.String[]{r7, r6, r9}
            r5.A07(r10, r7, r0)
            goto L_0x0333
        L_0x037d:
            boolean r0 = r10.endsWith(r6)
            if (r0 == 0) goto L_0x038b
            java.lang.String[] r0 = new java.lang.String[]{r6, r9}
            r5.A07(r10, r6, r0)
            goto L_0x0333
        L_0x038b:
            java.util.LinkedHashSet r0 = r5.A0K
            r0.add(r12)
            goto L_0x0333
        L_0x0391:
            r6 = -1
            goto L_0x031c
        L_0x0393:
            r0 = 0
            goto L_0x0321
        L_0x0395:
            r5.A02 = r8
            boolean r0 = r5.A0L
            if (r0 == 0) goto L_0x02e6
            boolean r0 = r5.A0N
            if (r0 == 0) goto L_0x03a4
            r0 = 2
        L_0x03a0:
            r5.A02 = r0
            goto L_0x02e6
        L_0x03a4:
            boolean r0 = r5.A0O
            if (r0 == 0) goto L_0x02e6
            r0 = 3
            goto L_0x03a0
        L_0x03aa:
            java.lang.String r0 = "text/html"
            goto L_0x02c2
        L_0x03ae:
            r11 = 0
            goto L_0x02c6
        L_0x03b1:
            r7 = 0
            goto L_0x0223
        L_0x03b4:
            boolean r0 = r7.equals(r13)
            if (r0 == 0) goto L_0x014a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            goto L_0x014e
        L_0x03c0:
            boolean r0 = r7.equals(r14)
            if (r0 == 0) goto L_0x014a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            goto L_0x014e
        L_0x03cc:
            boolean r0 = r7.equals(r11)
            if (r0 == 0) goto L_0x014a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            goto L_0x014e
        L_0x03d8:
            boolean r0 = r7.equals(r12)
            if (r0 == 0) goto L_0x014a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            goto L_0x014e
        L_0x03e4:
            boolean r0 = r7.equals(r12)
            if (r0 == 0) goto L_0x013a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r6.A07 = r0
            goto L_0x013a
        L_0x03f2:
            boolean r0 = r7.equals(r11)
            if (r0 == 0) goto L_0x013a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r6.A04 = r0
            goto L_0x013a
        L_0x0400:
            boolean r0 = r7.equals(r14)
            if (r0 == 0) goto L_0x013a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r6.A05 = r0
            goto L_0x013a
        L_0x040e:
            boolean r0 = r7.equals(r13)
            if (r0 == 0) goto L_0x013a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r6.A09 = r0
            goto L_0x013a
        L_0x041c:
            java.util.LinkedHashSet r0 = r5.A0K
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x04f5
            java.util.regex.Pattern r0 = A0d
            java.util.regex.Matcher r9 = r0.matcher(r4)
            r7 = 0
        L_0x042b:
            boolean r0 = r9.find()
            if (r0 == 0) goto L_0x046c
            java.lang.String r0 = r9.group(r3)
            java.util.HashMap r6 = A06(r0)
            java.lang.String r0 = "rel"
            java.lang.String r10 = X.C90504aG.A0l(r0, r6)
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x042b
            java.lang.String r0 = "icon"
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x0465
            java.lang.String r0 = "image_src"
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x0465
            java.lang.String r0 = "apple-touch-icon-precomposed"
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x0465
            java.lang.String r0 = "apple-touch-icon"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x042b
        L_0x0465:
            java.lang.String r0 = "href"
            java.lang.Object r7 = r6.get(r0)
            goto L_0x042b
        L_0x046c:
            if (r7 == 0) goto L_0x0481
            X.58j r6 = r5.A04
            if (r6 == 0) goto L_0x0478
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r6.A08 = r0
        L_0x0478:
            java.util.LinkedHashSet r6 = r5.A0K
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            X.C36341k9.A1H(r7, r0, r6)
        L_0x0481:
            java.util.LinkedHashSet r0 = r5.A0K
            java.util.LinkedHashSet r8 = X.C36441kJ.A17()
            java.util.Iterator r9 = r0.iterator()
        L_0x048b:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x04f3
            java.lang.Object r7 = r9.next()
            X.00I r7 = (X.AnonymousClass00I) r7
            java.lang.Object r15 = r7.A00
            java.lang.String r15 = (java.lang.String) r15
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            if (r0 != 0) goto L_0x04c2
            java.lang.String r0 = "http"
            boolean r0 = r15.startsWith(r0)
            if (r0 != 0) goto L_0x04c2
            java.lang.String r0 = "//"
            boolean r0 = r15.startsWith(r0)
            if (r0 == 0) goto L_0x04ca
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()
            java.lang.String r0 = r23.getProtocol()
            r6.append(r0)
            java.lang.String r0 = ":"
            java.lang.String r15 = X.AnonymousClass000.A0p(r0, r15, r6)
        L_0x04c2:
            if (r15 == 0) goto L_0x048b
            java.lang.Object r0 = r7.A01
            X.C36341k9.A1H(r15, r0, r8)
            goto L_0x048b
        L_0x04ca:
            java.lang.String r11 = r23.getProtocol()     // Catch:{ MalformedURLException | URISyntaxException -> 0x04ec }
            java.lang.String r12 = r23.getUserInfo()     // Catch:{ MalformedURLException | URISyntaxException -> 0x04ec }
            java.lang.String r13 = r23.getHost()     // Catch:{ MalformedURLException | URISyntaxException -> 0x04ec }
            int r14 = r23.getPort()     // Catch:{ MalformedURLException | URISyntaxException -> 0x04ec }
            r16 = 0
            java.net.URI r10 = new java.net.URI     // Catch:{ MalformedURLException | URISyntaxException -> 0x04ec }
            r17 = r16
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ MalformedURLException | URISyntaxException -> 0x04ec }
            java.net.URL r0 = r10.toURL()     // Catch:{ MalformedURLException | URISyntaxException -> 0x04ec }
            java.lang.String r15 = r0.toString()     // Catch:{ MalformedURLException | URISyntaxException -> 0x04ec }
            goto L_0x04c2
        L_0x04ec:
            r6 = move-exception
            java.lang.String r0 = "WebPageInfo/ensureThumbUrl Bad URL"
            com.whatsapp.util.Log.w(r0, r6)
            goto L_0x04c2
        L_0x04f3:
            r5.A0K = r8
        L_0x04f5:
            java.lang.String r0 = r5.A0F
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0517
            java.util.regex.Pattern r0 = A0j
            java.util.regex.Matcher r4 = r0.matcher(r4)
        L_0x0503:
            boolean r0 = r4.find()
            if (r0 == 0) goto L_0x0517
            java.lang.String r0 = r4.group(r3)
            X.C18740tg.A06(r0)
            java.lang.String r0 = r0.trim()
            r5.A0F = r0
            goto L_0x0503
        L_0x0517:
            java.lang.String r0 = r5.A0F
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x052b
            java.lang.String r0 = r5.A0F
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            java.lang.String r0 = r0.toString()
            r5.A0F = r0
        L_0x052b:
            java.lang.String r0 = r5.A0C
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x053f
            java.lang.String r0 = r5.A0C
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            java.lang.String r0 = r0.toString()
            r5.A0C = r0
        L_0x053f:
            java.lang.String r0 = r23.toString()
            boolean r0 = X.C63933Lz.A01(r0)
            if (r0 == 0) goto L_0x056a
            java.lang.String r0 = "invite_link_type_v2"
            java.lang.Object r3 = r1.get(r0)
            java.lang.String r0 = "PARENT"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x056b
            r3 = 1
        L_0x0558:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r5.A07 = r0
            java.lang.String r0 = "parent_group_subject"
            java.lang.String r0 = X.C90504aG.A0l(r0, r1)
            r5.A0A = r0
            if (r0 == 0) goto L_0x056a
            r5.A0C = r0
        L_0x056a:
            return r2
        L_0x056b:
            java.lang.String r0 = "SUB"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0575
            r3 = 2
            goto L_0x0558
        L_0x0575:
            java.lang.String r0 = "DEFAULT_SUB"
            boolean r0 = r0.equals(r3)
            r3 = 0
            if (r0 == 0) goto L_0x0558
            r3 = 3
            goto L_0x0558
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145166tS.A02(java.lang.String, java.lang.String, java.lang.String, java.net.URL, int):java.lang.String");
    }

    private void A08(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            try {
                AnonymousClass14X.A02(new AnonymousClass5RE(this.A0Y, httpURLConnection.getInputStream(), (Integer) null, 23));
            } catch (IOException unused) {
            }
            httpURLConnection.disconnect();
        }
    }

    public static byte[] A0A(C145166tS r15, C20810yC r16, String str) {
        ByteArrayOutputStream A0Q2;
        int A072 = r16.A07(3937) * EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
        String str2 = str;
        if (!TextUtils.isEmpty(str2)) {
            URL A0j2 = C90524aI.A0j(str2);
            if (A0j2.equals(URLDecoder.decode(str2, C19430v1.A0B))) {
                A0j2 = new URI(A0j2.getProtocol(), A0j2.getUserInfo(), A0j2.getHost(), A0j2.getPort(), A0j2.getPath(), A0j2.getQuery(), A0j2.getRef()).toURL();
            }
            HttpURLConnection A042 = A04((String) null, A0j2);
            if (A042 != null) {
                A042.setConnectTimeout(SearchActionVerificationClientService.NOTIFICATION_ID);
                A042.setReadTimeout(20000);
                if (r15.A04 != null) {
                    int responseCode = A042.getResponseCode();
                    if (responseCode == 206) {
                        r15.A04.A06 = C36371kC.A0m();
                    } else {
                        C1041258j r2 = r15.A04;
                        r2.A06 = null;
                        if (responseCode / 100 != 2) {
                            r2.A0D = C36441kJ.A0y(responseCode);
                        }
                    }
                }
                AnonymousClass5RE A002 = AnonymousClass5RE.A00(r15.A0Y, A042, 23);
                try {
                    A0Q2 = C90524aI.A0Q();
                    byte[] bArr = new byte[EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH];
                    int i = 0;
                    do {
                        int read = A002.read(bArr, 0, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
                        if (read == -1) {
                            byte[] byteArray = A0Q2.toByteArray();
                            A0Q2.close();
                            A002.close();
                            return byteArray;
                        }
                        A0Q2.write(bArr, 0, read);
                        i += read;
                    } while (i <= A072);
                    C1041258j r1 = r15.A04;
                    if (r1 != null) {
                        r1.A03 = C36371kC.A0m();
                    }
                    throw new AnonymousClass5R2();
                } catch (Throwable th) {
                    try {
                        A002.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
        }
        return null;
        throw th;
    }

    public Bitmap A0B() {
        if (this.A0R == null) {
            return null;
        }
        Bitmap bitmap = this.A0W;
        if (bitmap != null) {
            return bitmap;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inDither = true;
            options.inPreferredConfig = Bitmap.Config.RGB_565;
            byte[] bArr = this.A0R;
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            this.A0W = decodeByteArray;
            return decodeByteArray;
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    public String A0C() {
        URL A0j2;
        if (TextUtils.isEmpty(this.A09)) {
            A0j2 = C90524aI.A0j(this.A0Z);
        } else {
            try {
                A0j2 = C90524aI.A0j(this.A09);
            } catch (MalformedURLException unused) {
                A0j2 = C90524aI.A0j(this.A0Z);
            }
        }
        return A0j2.getHost();
    }

    public void A0G(C20810yC r7) {
        Iterator it = this.A0K.iterator();
        int i = 0;
        while (it.hasNext()) {
            AnonymousClass00I r2 = (AnonymousClass00I) it.next();
            if (i >= 2) {
                Locale locale = Locale.US;
                Object[] A0L2 = AnonymousClass001.A0L();
                AnonymousClass000.A1L(A0L2, this.A0K.size() - i, 0);
                String.format(locale, "WebPageInfo/loadThumbRetrySmall Remaining %d thumbnails are not loaded.", A0L2);
                return;
            }
            i++;
            C1041258j r1 = this.A04;
            if (r1 != null) {
                r1.A0E = C36441kJ.A0y(i);
            }
            try {
                A0F(r2, r7);
                return;
            } catch (AnonymousClass5R2 unused) {
                Log.w("WebPageInfo/loadThumbRetrySmall Cannot fetch large thumbnail");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:123:?, code lost:
        r1 = new java.lang.String(r4, X.C19430v1.A0B);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x027d, code lost:
        if (android.text.TextUtils.isEmpty(r2.A0C) == false) goto L_0x027f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0118, code lost:
        if (r0 != 2) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x012a, code lost:
        if (r10 != 206) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x012c, code lost:
        r3 = r2.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x012e, code lost:
        if (r3 == null) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0130, code lost:
        r3.A02 = X.C36371kC.A0m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0136, code lost:
        if (r5 != null) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0138, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:110:0x01eb */
    /* JADX WARNING: Missing exception handler attribute for start block: B:122:0x020d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:130:0x023c */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01fc A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01b4 A[EDGE_INSN: B:157:0x01b4->B:88:0x01b4 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x018c A[Catch:{ all -> 0x01d7, all -> 0x01dc, all -> 0x01e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01b8 A[Catch:{ all -> 0x01d7, all -> 0x01dc, all -> 0x01e1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0H(X.C20810yC r22, java.lang.String r23) {
        /*
            r21 = this;
            r2 = r21
            java.lang.String r5 = r2.A0Z
            r0 = 7505(0x1d51, float:1.0517E-41)
            r1 = r22
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0015
            X.58j r0 = new X.58j
            r0.<init>()
            r2.A04 = r0
        L_0x0015:
            r3 = 0
            r2.A0U = r3
            long r13 = android.os.SystemClock.uptimeMillis()
            java.net.URL r3 = X.C90524aI.A0j(r5)
            java.lang.String r6 = r3.getHost()
            if (r6 == 0) goto L_0x0031
            java.lang.String r6 = java.net.IDN.toASCII(r6)     // Catch:{ IllegalArgumentException -> 0x002b }
        L_0x002b:
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r6 = r6.toLowerCase(r0)
        L_0x0031:
            java.lang.String r4 = r3.getProtocol()
            if (r4 == 0) goto L_0x003d
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r4 = r4.toLowerCase(r0)
        L_0x003d:
            java.net.URI r0 = r3.toURI()
            java.lang.String r5 = r0.getUserInfo()
            int r7 = r0.getPort()
            java.lang.String r8 = r0.getPath()
            java.lang.String r9 = r0.getQuery()
            java.lang.String r10 = r3.getRef()
            java.net.URI r3 = new java.net.URI
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            java.net.URL r6 = r3.toURL()
            r0 = r23
            java.net.HttpURLConnection r5 = A04(r0, r6)
            r11 = 0
            if (r5 == 0) goto L_0x0127
            r0 = 1
            r5.setInstanceFollowRedirects(r0)
            r5.connect()     // Catch:{ ProtocolException -> 0x0073 }
            int r10 = r5.getResponseCode()     // Catch:{ ProtocolException -> 0x0073 }
            goto L_0x008f
        L_0x0073:
            r4 = move-exception
            java.lang.String r0 = r4.toString()
            java.lang.String r3 = X.C90514aH.A0y(r0)
            java.lang.String r0 = "too many redirects"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x008d
            java.lang.String r0 = "too many follow-up requests"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x008d
            throw r4
        L_0x008d:
            r10 = 303(0x12f, float:4.25E-43)
        L_0x008f:
            int r0 = r10 / 100
            r9 = 2
            if (r0 != r9) goto L_0x00a4
            r0 = 206(0xce, float:2.89E-43)
            if (r10 != r0) goto L_0x0139
            X.58j r3 = r2.A04
            if (r3 == 0) goto L_0x0139
            java.lang.Boolean r0 = X.C36371kC.A0m()
            r3.A02 = r0
            goto L_0x0139
        L_0x00a4:
            r8 = 3
            if (r0 != r8) goto L_0x011a
            r2.A08(r5)
            java.net.HttpURLConnection r5 = A04(r11, r6)
            if (r5 == 0) goto L_0x0127
            r7 = 0
            r5.setInstanceFollowRedirects(r7)
            r5.connect()
            int r10 = r5.getResponseCode()
            java.lang.String r3 = ""
            r4 = 0
        L_0x00be:
            int r0 = r10 / 100
            if (r0 != r8) goto L_0x0118
            r0 = 20
            if (r4 >= r0) goto L_0x011a
            java.lang.String r0 = "Location"
            java.lang.String r16 = r5.getHeaderField(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r16)
            if (r0 != 0) goto L_0x011a
            java.lang.String r0 = "Set-Cookie"
            java.lang.String r12 = r5.getHeaderField(r0)
            if (r12 == 0) goto L_0x00e5
            java.lang.String r0 = ";"
            java.lang.String[] r15 = r12.split(r0)
            int r0 = r15.length
            if (r0 <= 0) goto L_0x00e5
            r12 = r15[r7]
        L_0x00e5:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x00f5
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0v(r3)
            java.lang.String r0 = "; "
            java.lang.String r3 = X.AnonymousClass000.A0q(r0, r3)
        L_0x00f5:
            java.lang.String r3 = X.C36321k7.A0D(r3, r12)
            r2.A08(r5)
            java.net.URL r0 = X.C90524aI.A0j(r16)
            java.net.HttpURLConnection r5 = A04(r11, r0)
            if (r5 == 0) goto L_0x0128
            r5.setInstanceFollowRedirects(r7)
            java.lang.String r0 = "Cookie"
            r5.setRequestProperty(r0, r3)
            r5.connect()
            int r10 = r5.getResponseCode()
            int r4 = r4 + 1
            goto L_0x00be
        L_0x0118:
            if (r0 == r9) goto L_0x0128
        L_0x011a:
            r2.A08(r5)
            X.58j r1 = r2.A04
            if (r1 == 0) goto L_0x0127
            java.lang.Long r0 = X.C36441kJ.A0y(r10)
            r1.A0B = r0
        L_0x0127:
            return
        L_0x0128:
            r0 = 206(0xce, float:2.89E-43)
            if (r10 != r0) goto L_0x0136
            X.58j r3 = r2.A04
            if (r3 == 0) goto L_0x0136
            java.lang.Boolean r0 = X.C36371kC.A0m()
            r3.A02 = r0
        L_0x0136:
            if (r5 != 0) goto L_0x0139
            return
        L_0x0139:
            java.lang.String r0 = "Content-Type"
            java.lang.String r3 = r5.getHeaderField(r0)     // Catch:{ all -> 0x028e }
            if (r3 == 0) goto L_0x0173
            java.util.regex.Pattern r0 = A0b     // Catch:{ all -> 0x028e }
            java.util.regex.Matcher r3 = r0.matcher(r3)     // Catch:{ all -> 0x028e }
            boolean r0 = r3.find()     // Catch:{ all -> 0x028e }
            if (r0 == 0) goto L_0x0173
            r0 = 1
            java.lang.String r0 = r3.group(r0)     // Catch:{ all -> 0x028e }
            X.C18740tg.A06(r0)     // Catch:{ all -> 0x028e }
            java.lang.String r3 = r0.trim()     // Catch:{ all -> 0x028e }
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ all -> 0x028e }
            java.lang.String r17 = r3.toUpperCase(r0)     // Catch:{ all -> 0x028e }
        L_0x015f:
            java.lang.String r18 = r5.getContentType()     // Catch:{ all -> 0x028e }
            int r20 = r5.getContentLength()     // Catch:{ all -> 0x028e }
            r0 = 3938(0xf62, float:5.518E-42)
            int r0 = r1.A07(r0)     // Catch:{ all -> 0x028e }
            r10 = 1024(0x400, float:1.435E-42)
            int r4 = r0 * 1024
            r7 = 0
            goto L_0x0176
        L_0x0173:
            java.lang.String r17 = ""
            goto L_0x015f
        L_0x0176:
            X.0ww r1 = r2.A0Y     // Catch:{ OutOfMemoryError -> 0x01eb }
            r0 = 23
            X.5RE r8 = X.AnonymousClass5RE.A00(r1, r5, r0)     // Catch:{ OutOfMemoryError -> 0x01eb }
            java.io.ByteArrayOutputStream r9 = X.C90524aI.A0Q()     // Catch:{ all -> 0x01e1 }
            byte[] r3 = new byte[r10]     // Catch:{ all -> 0x01d7 }
            r1 = 0
        L_0x0185:
            int r11 = r8.read(r3, r7, r10)     // Catch:{ all -> 0x01d7 }
            r0 = -1
            if (r11 == r0) goto L_0x01b4
            r9.write(r3, r7, r11)     // Catch:{ all -> 0x01d7 }
            int r1 = r1 + r11
            if (r1 <= r4) goto L_0x019d
            X.58j r3 = r2.A04     // Catch:{ all -> 0x01d7 }
            if (r3 == 0) goto L_0x01b4
            java.lang.Boolean r0 = X.C36371kC.A0m()     // Catch:{ all -> 0x01d7 }
            r3.A00 = r0     // Catch:{ all -> 0x01d7 }
            goto L_0x01b4
        L_0x019d:
            byte[] r12 = r9.toByteArray()     // Catch:{ all -> 0x01d7 }
            java.lang.String r0 = X.C19430v1.A0B     // Catch:{ all -> 0x01d7 }
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x01d7 }
            r11.<init>(r12, r0)     // Catch:{ all -> 0x01d7 }
            java.util.regex.Pattern r0 = A0c     // Catch:{ all -> 0x01d7 }
            java.util.regex.Matcher r0 = r0.matcher(r11)     // Catch:{ all -> 0x01d7 }
            boolean r0 = r0.find()     // Catch:{ all -> 0x01d7 }
            if (r0 == 0) goto L_0x0185
        L_0x01b4:
            X.58j r10 = r2.A04     // Catch:{ all -> 0x01d7 }
            if (r10 == 0) goto L_0x01cc
            float r1 = (float) r1     // Catch:{ all -> 0x01d7 }
            r0 = 1176256512(0x461c4000, float:10000.0)
            float r1 = r1 / r0
            double r0 = (double) r1     // Catch:{ all -> 0x01d7 }
            double r3 = java.lang.Math.ceil(r0)     // Catch:{ all -> 0x01d7 }
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r3 = r3 * r0
            long r0 = (long) r3     // Catch:{ all -> 0x01d7 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x01d7 }
            r10.A0C = r0     // Catch:{ all -> 0x01d7 }
        L_0x01cc:
            byte[] r4 = r9.toByteArray()     // Catch:{ all -> 0x01d7 }
            r9.close()     // Catch:{ all -> 0x01e1 }
            r8.close()     // Catch:{ OutOfMemoryError -> 0x01eb }
            goto L_0x01f5
        L_0x01d7:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x01dc }
            goto L_0x01e0
        L_0x01dc:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x01e1 }
        L_0x01e0:
            throw r1     // Catch:{ all -> 0x01e1 }
        L_0x01e1:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x01e6 }
            goto L_0x01ea
        L_0x01e6:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ OutOfMemoryError -> 0x01eb }
        L_0x01ea:
            throw r1     // Catch:{ OutOfMemoryError -> 0x01eb }
        L_0x01eb:
            java.lang.System.gc()     // Catch:{ all -> 0x028e }
            java.lang.String r0 = "WebPageInfo/readData OutOfMemoryError"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x028e }
            byte[] r4 = new byte[r7]     // Catch:{ all -> 0x028e }
        L_0x01f5:
            int r3 = r4.length     // Catch:{ all -> 0x028e }
            if (r3 != 0) goto L_0x01fc
            r2.A08(r5)
            return
        L_0x01fc:
            boolean r0 = android.text.TextUtils.isEmpty(r17)     // Catch:{ UnsupportedEncodingException -> 0x020d }
            if (r0 == 0) goto L_0x020a
            java.lang.String r0 = X.C19430v1.A0B     // Catch:{ UnsupportedEncodingException -> 0x020d }
        L_0x0204:
            java.lang.String r1 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x020d }
            r1.<init>(r4, r0)     // Catch:{ UnsupportedEncodingException -> 0x020d }
            goto L_0x0214
        L_0x020a:
            r0 = r17
            goto L_0x0204
        L_0x020d:
            java.lang.String r0 = X.C19430v1.A0B     // Catch:{ all -> 0x028e }
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x028e }
            r1.<init>(r4, r0)     // Catch:{ all -> 0x028e }
        L_0x0214:
            r19 = r6
            r15 = r2
            r16 = r1
            java.lang.String r1 = r15.A02(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x028e }
            boolean r0 = android.text.TextUtils.isEmpty(r17)     // Catch:{ all -> 0x028e }
            if (r0 == 0) goto L_0x023c
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x028e }
            if (r0 != 0) goto L_0x023c
            java.lang.String r0 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x023c }
            r0.<init>(r4, r1)     // Catch:{ UnsupportedEncodingException -> 0x023c }
            r2.A0E()     // Catch:{ UnsupportedEncodingException -> 0x023c }
            r7 = r2
            r8 = r0
            r9 = r1
            r10 = r18
            r11 = r6
            r12 = r20
            r7.A02(r8, r9, r10, r11, r12)     // Catch:{ UnsupportedEncodingException -> 0x023c }
        L_0x023c:
            long r0 = (long) r3     // Catch:{ all -> 0x028e }
            r2.A0V = r0     // Catch:{ all -> 0x028e }
            r2.A08(r5)
            java.lang.String r0 = r2.A0F
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0256
            java.lang.String r0 = r2.A0F
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            java.lang.String r0 = r0.toString()
            r2.A0F = r0
        L_0x0256:
            java.lang.String r0 = r2.A0C
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x026a
            java.lang.String r0 = r2.A0C
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            java.lang.String r0 = r0.toString()
            r2.A0C = r0
        L_0x026a:
            X.58j r3 = r2.A04
            if (r3 == 0) goto L_0x0286
            java.lang.String r0 = r2.A0F
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x027f
            java.lang.String r0 = r2.A0C
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r0 = 0
            if (r1 != 0) goto L_0x0280
        L_0x027f:
            r0 = 1
        L_0x0280:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A01 = r0
        L_0x0286:
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r13
            r2.A0U = r0
            return
        L_0x028e:
            r0 = move-exception
            r2.A08(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145166tS.A0H(X.0yC, java.lang.String):void");
    }

    public boolean A0I() {
        boolean z;
        boolean z2 = !TextUtils.isEmpty(this.A0F);
        boolean A1a = C36421kH.A1a(this.A0C);
        C601536r r0 = this.A05;
        if (r0 != null) {
            String str = r0.A01;
            if ("image/gif".equals(str) || "video/mp4".equals(str)) {
                z = true;
                if (!z2 || A1a || z) {
                    return true;
                }
                return false;
            }
        }
        z = false;
        return !z2 ? true : true;
    }

    public byte[] A0L(byte[] bArr, int i, int i2, int i3, int i4, boolean z) {
        byte[] A0K2;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        byte[] bArr2 = bArr;
        BitmapFactory.decodeByteArray(bArr2, 0, bArr2.length, options);
        int i5 = options.outWidth;
        this.A01 = i5;
        int i6 = options.outHeight;
        this.A00 = i6;
        if (i5 < i || i6 < i2) {
            return null;
        }
        options.inDither = true;
        options.inScaled = false;
        options.inPreferQualityOverSpeed = true;
        if (this.A0M) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        int i7 = i3;
        int i8 = i4;
        Bitmap bitmap = AnonymousClass6Y8.A08((AnonymousClass67H) null, new C130396Kx(options, (Long) null, i7, i8, !z), bArr2, false).A02;
        if (bitmap == null) {
            return null;
        }
        if (z) {
            A0K2 = A09(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), i7, i8, 50);
        } else {
            A0K2 = A0K(bitmap);
        }
        bitmap.recycle();
        return A0K2;
    }

    public C145166tS(C20050ww r2, AnonymousClass1DU r3, String str) {
        this.A0a = r3;
        this.A0Y = r2;
        this.A0Z = str;
    }

    public static URL A05(HashMap hashMap, String... strArr) {
        try {
            String A032 = A03(hashMap, strArr);
            if (A032 != null) {
                return C90524aI.A0j(A032);
            }
            return null;
        } catch (MalformedURLException e) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("WebPageInfo/");
            C90514aH.A1T(A0u, strArr);
            C36351kA.A1P("  Bad URL", A0u, e);
            return null;
        }
    }

    public static HashMap A06(String str) {
        HashMap A0J2 = AnonymousClass001.A0J();
        Matcher matcher = A0h.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group2 == null) {
                group2 = matcher.group(3);
            }
            A0J2.put(group, group2);
        }
        return A0J2;
    }

    private void A07(String str, String str2, String... strArr) {
        String substring = str.substring(0, str.length() - str2.length());
        for (String A0D2 : strArr) {
            C36341k9.A1H(C36321k7.A0D(substring, A0D2), C36361kB.A0i(), this.A0K);
        }
    }

    private byte[] A09(Bitmap bitmap, Rect rect, int i, int i2, int i3) {
        ByteArrayOutputStream A0Q2 = C90524aI.A0Q();
        try {
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, bitmap.getConfig());
            Canvas A0A2 = C90524aI.A0A(createBitmap);
            Paint A0K2 = C36441kJ.A0K();
            A0K2.setAntiAlias(true);
            A0K2.setFilterBitmap(true);
            A0A2.drawColor(-1);
            A0A2.drawBitmap(bitmap, rect, new Rect(0, 0, i, i2), A0K2);
            createBitmap.compress(Bitmap.CompressFormat.JPEG, i3, A0Q2);
            byte[] byteArray = A0Q2.toByteArray();
            if (!createBitmap.isRecycled()) {
                createBitmap.recycle();
            }
            return byteArray;
        } catch (OutOfMemoryError unused) {
            System.gc();
            Log.e("WebPageInfo/convertToByteArray OutOfMemoryError");
            bitmap.compress(Bitmap.CompressFormat.JPEG, i3, A0Q2);
            return A0Q2.toByteArray();
        }
    }

    public void A0D() {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(" hasOgVideo:");
        A0u.append(this.A0X);
        A0u.append(10);
        A0u.append("page loaded in ");
        A0u.append(this.A0U);
        A0u.append(" ms, ");
        A0u.append(this.A0V);
        A0u.append(" bytes");
        A0u.append(10);
        long j = this.A0T;
        if (j > 0) {
            Locale locale = Locale.US;
            Object[] A1Q = C36441kJ.A1Q();
            A1Q[0] = Long.valueOf(j);
            A1Q[1] = Integer.valueOf(this.A01);
            AnonymousClass000.A1L(A1Q, this.A00, 2);
            A0u.append(String.format(locale, "image loaded in %dms, image dimension %dx%d", A1Q));
            byte[] bArr = this.A0Q;
            if (bArr != null) {
                Object[] objArr = new Object[1];
                AnonymousClass000.A1L(objArr, bArr.length, 0);
                A0u.append(String.format(locale, ", small thumbnail %dbytes", objArr));
            }
            byte[] bArr2 = this.A0R;
            if (bArr2 != null) {
                Object[] objArr2 = new Object[1];
                AnonymousClass000.A1L(objArr2, bArr2.length, 0);
                str = String.format(locale, ", large thumbnail %dbytes", objArr2);
            }
            A0u.toString();
        }
        str = " image not loaded";
        A0u.append(str);
        A0u.toString();
    }
}
