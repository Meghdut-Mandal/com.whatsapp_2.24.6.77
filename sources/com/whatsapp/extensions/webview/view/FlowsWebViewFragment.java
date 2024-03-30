package com.whatsapp.extensions.webview.view;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass02E;
import X.AnonymousClass044;
import X.AnonymousClass098;
import X.AnonymousClass17Y;
import X.AnonymousClass1KT;
import X.AnonymousClass1KW;
import X.AnonymousClass1N2;
import X.AnonymousClass1RC;
import X.AnonymousClass67A;
import X.AnonymousClass67O;
import X.AnonymousClass68X;
import X.AnonymousClass6AD;
import X.AnonymousClass6DY;
import X.AnonymousClass6JT;
import X.AnonymousClass6PZ;
import X.AnonymousClass7T0;
import X.AnonymousClass7T1;
import X.C012005e;
import X.C05610Qj;
import X.C110865bM;
import X.C123555wh;
import X.C125245zZ;
import X.C1257361b;
import X.C133036Wk;
import X.C133786Zz;
import X.C145326ti;
import X.C153327Nx;
import X.C154647Sz;
import X.C160997lv;
import X.C164757sK;
import X.C165177t0;
import X.C18820ts;
import X.C19970wo;
import X.C20810yC;
import X.C21080yd;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36381kD;
import X.C36401kF;
import X.C36441kJ;
import X.C52402pN;
import X.C609439y;
import X.C74313lP;
import X.C80243v5;
import X.C87764Qb;
import X.C90484aE;
import X.C90494aF;
import X.C90504aG;
import X.C90524aI;
import X.C92624eH;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository;
import com.whatsapp.extensions.webview.viewmodel.WaFlowsViewModel;
import com.whatsapp.webview.ui.WebViewWrapperView;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.security.cert.CertificateException;
import java.util.Date;
import java.util.TimeZone;
import javax.net.ssl.HttpsURLConnection;

public final class FlowsWebViewFragment extends Hilt_FlowsWebViewFragment implements C160997lv {
    public C92624eH A00;
    public AnonymousClass17Y A01;
    public C19970wo A02;
    public AnonymousClass1KW A03;
    public C18820ts A04;
    public C609439y A05;
    public AnonymousClass6PZ A06;
    public AnonymousClass1KT A07;
    public WaFlowsViewModel A08;
    public C20810yC A09;
    public C21080yd A0A;
    public AnonymousClass1N2 A0B;
    public String A0C;
    public String A0D;
    public AnonymousClass67O A0E;
    public FlowsWebBottomSheetContainer A0F;
    public WebViewWrapperView A0G;
    public final ViewTreeObserver.OnGlobalLayoutListener A0H = new C164757sK(this, 7);

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        WebSettings settings;
        int i;
        FlowsWebBottomSheetContainer flowsWebBottomSheetContainer;
        AnonymousClass00C.A0D(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
        AnonymousClass02E r1 = this.A0I;
        C92624eH r2 = null;
        if ((r1 instanceof FlowsWebBottomSheetContainer) && (flowsWebBottomSheetContainer = (FlowsWebBottomSheetContainer) r1) != null) {
            this.A0F = flowsWebBottomSheetContainer;
        }
        WebViewWrapperView webViewWrapperView = (WebViewWrapperView) C012005e.A02(inflate, R.id.webview_wrapper_view);
        this.A0G = webViewWrapperView;
        if (webViewWrapperView != null) {
            webViewWrapperView.setWebViewDelegate(this);
        }
        WebViewWrapperView webViewWrapperView2 = this.A0G;
        if (webViewWrapperView2 != null) {
            r2 = webViewWrapperView2.A02;
        }
        this.A00 = r2;
        if (r2 != null) {
            r2.getSettings().setJavaScriptEnabled(true);
        }
        C92624eH r0 = this.A00;
        if (r0 != null) {
            r0.getViewTreeObserver().addOnGlobalLayoutListener(this.A0H);
        }
        String str = this.A0C;
        if (str == null) {
            throw C36331k8.A0d("launchURL");
        }
        Uri A012 = C133036Wk.A01(str);
        AnonymousClass00C.A08(A012);
        AnonymousClass68X r3 = new AnonymousClass68X();
        r3.A02("https");
        String[] A1R = C36441kJ.A1R();
        A1R[0] = A012.getHost();
        r3.A01(A1R);
        C125245zZ A002 = r3.A00();
        AnonymousClass00C.A08(A002);
        C1257361b r12 = new C1257361b();
        r12.A00.add(A002);
        AnonymousClass67A A003 = r12.A00();
        C92624eH r02 = this.A00;
        if (r02 != null) {
            r02.A02 = A003;
        }
        WaFlowsViewModel waFlowsViewModel = this.A08;
        if (waFlowsViewModel == null) {
            throw C36331k8.A0d("waFlowsViewModel");
        }
        C165177t0.A00(A0m(), waFlowsViewModel.A00, new C154647Sz(this), 28);
        WaFlowsViewModel waFlowsViewModel2 = this.A08;
        if (waFlowsViewModel2 == null) {
            throw C36331k8.A0d("waFlowsViewModel");
        }
        C165177t0.A00(A0m(), waFlowsViewModel2.A04, new AnonymousClass7T0(this), 30);
        WaFlowsViewModel waFlowsViewModel3 = this.A08;
        if (waFlowsViewModel3 == null) {
            throw C36331k8.A0d("waFlowsViewModel");
        }
        C165177t0.A00(A0m(), waFlowsViewModel3.A03, new AnonymousClass7T1(this), 29);
        String str2 = this.A0C;
        if (str2 == null) {
            throw C36331k8.A0d("launchURL");
        }
        C609439y r13 = this.A05;
        if (r13 != null) {
            r13.A02 = C90484aE.A0g();
            C20810yC r14 = this.A09;
            if (r14 != null) {
                String str3 = null;
                if (r14.A0E(7574)) {
                    AnonymousClass1KT r5 = this.A07;
                    if (r5 != null) {
                        WaFlowsViewModel waFlowsViewModel4 = this.A08;
                        if (waFlowsViewModel4 == null) {
                            throw C36331k8.A0d("waFlowsViewModel");
                        }
                        AnonymousClass6DY r03 = waFlowsViewModel4.A0D.A00;
                        if (r03 != null) {
                            i = r03.A02.hashCode();
                        } else {
                            i = 0;
                        }
                        C609439y r04 = this.A05;
                        if (r04 != null) {
                            r5.A03(i, "preload_status", r04.A01.value);
                        } else {
                            throw C36331k8.A0d("flowsWebPreloader");
                        }
                    } else {
                        throw C36331k8.A0d("flowsScreenNavigationLogger");
                    }
                }
                C92624eH r05 = this.A00;
                if (!(r05 == null || (settings = r05.getSettings()) == null)) {
                    str3 = settings.getUserAgentString();
                }
                this.A0D = str3;
                AnonymousClass1KT r22 = this.A07;
                if (r22 != null) {
                    WaFlowsViewModel waFlowsViewModel5 = this.A08;
                    if (waFlowsViewModel5 == null) {
                        throw C36331k8.A0d("waFlowsViewModel");
                    }
                    r22.A08(Integer.valueOf(FlowsWebViewDataRepository.A00(waFlowsViewModel5)), "html_start");
                    C92624eH r06 = this.A00;
                    if (r06 != null) {
                        r06.loadUrl(str2);
                    }
                    AnonymousClass00C.A0B(inflate);
                    return inflate;
                }
                throw C36331k8.A0d("flowsScreenNavigationLogger");
            }
            throw C36321k7.A07();
        }
        throw C36331k8.A0d("flowsWebPreloader");
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        WebViewWrapperView webViewWrapperView = this.A0G;
        if (webViewWrapperView != null) {
            C36331k8.A0y(webViewWrapperView.A01);
        }
    }

    public /* synthetic */ void B5p(String str) {
    }

    public void Ba8(boolean z, String str) {
        AnonymousClass1KT r2;
        Integer num;
        String str2;
        Date date;
        String str3;
        String str4;
        if (z) {
            r2 = this.A07;
            if (r2 != null) {
                WaFlowsViewModel waFlowsViewModel = this.A08;
                if (waFlowsViewModel == null) {
                    throw C36331k8.A0d("waFlowsViewModel");
                }
                num = Integer.valueOf(FlowsWebViewDataRepository.A00(waFlowsViewModel));
                str2 = "html_page_start";
            } else {
                throw C36331k8.A0d("flowsScreenNavigationLogger");
            }
        } else {
            C92624eH r22 = this.A00;
            if (r22 != null) {
                WaFlowsViewModel waFlowsViewModel2 = this.A08;
                if (waFlowsViewModel2 == null) {
                    throw C36331k8.A0d("waFlowsViewModel");
                } else if (waFlowsViewModel2.A05.A04() != null) {
                    C110865bM.A00(new C153327Nx(r22, new C133786Zz(this.A0F)));
                }
            }
            C92624eH r6 = this.A00;
            if (r6 != null) {
                if (AnonymousClass1RC.A0A(A0i())) {
                    str3 = "dark";
                } else {
                    str3 = "light";
                }
                C18820ts r0 = this.A04;
                if (r0 != null) {
                    if (AnonymousClass044.A00(C36401kF.A0x(r0)) == 1) {
                        str4 = "rtl";
                    } else {
                        str4 = "ltr";
                    }
                    String id = TimeZone.getDefault().getID();
                    C18820ts r02 = this.A04;
                    if (r02 != null) {
                        String A072 = r02.A07();
                        AnonymousClass00C.A08(A072);
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("\n        var meta = document.createElement('meta');\n        meta.setAttribute('name', 'viewport');\n        meta.setAttribute('content', 'width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no');\n        meta.setAttribute('theme', '");
                        A0u.append(str3);
                        A0u.append("');\n        meta.setAttribute('layoutDirection', '");
                        A0u.append(str4);
                        A0u.append("');\n        meta.setAttribute('locale', '");
                        A0u.append(A072);
                        A0u.append("');\n        meta.setAttribute('timeZone', '");
                        A0u.append(id);
                        r6.evaluateJavascript(AnonymousClass000.A0q("');\n        meta.setAttribute('supportedStyles', 'background_color');\n        document.getElementsByTagName('head')[0].appendChild(meta);\n        ", A0u), (ValueCallback) null);
                    } else {
                        throw C36321k7.A09();
                    }
                } else {
                    throw C36321k7.A09();
                }
            }
            AnonymousClass67O r8 = this.A0E;
            if (r8 != null) {
                long currentTimeMillis = System.currentTimeMillis() + ((long) (r8.A00 * 1000));
                r8.A00();
                int i = 0;
                if (currentTimeMillis > r8.A00().A01.getTime() && Integer.valueOf(r8.A00().A00).equals(0)) {
                    Date date2 = r8.A00().A01;
                    if (date2.getTime() > 0) {
                        date = date2;
                    } else {
                        date = new Date(currentTimeMillis);
                    }
                    if (date2.getTime() > 0) {
                        i = 1;
                    }
                    r8.A01(new AnonymousClass6AD(date, i));
                }
            }
            C609439y r1 = this.A05;
            if (r1 != null) {
                r1.A01 = C52402pN.SUCCESS;
                r2 = this.A07;
                if (r2 != null) {
                    WaFlowsViewModel waFlowsViewModel3 = this.A08;
                    if (waFlowsViewModel3 == null) {
                        throw C36331k8.A0d("waFlowsViewModel");
                    }
                    num = Integer.valueOf(FlowsWebViewDataRepository.A00(waFlowsViewModel3));
                    str2 = "html_end";
                } else {
                    throw C36331k8.A0d("flowsScreenNavigationLogger");
                }
            } else {
                throw C36331k8.A0d("flowsWebPreloader");
            }
        }
        r2.A08(num, str2);
    }

    public WebResourceResponse Beu(String str) {
        RuntimeException th;
        C20810yC r1 = this.A09;
        if (r1 != null) {
            if (r1.A0E(7350)) {
                String str2 = this.A0C;
                if (str2 == null) {
                    throw C36331k8.A0d("launchURL");
                } else if (AnonymousClass098.A07(str, str2, false)) {
                    try {
                        URLConnection A0r = C90504aG.A0r(str);
                        AnonymousClass00C.A0E(A0r, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) A0r;
                        C21080yd r0 = this.A0A;
                        if (r0 != null) {
                            httpsURLConnection.setSSLSocketFactory(r0.A02());
                            httpsURLConnection.setRequestMethod("GET");
                            httpsURLConnection.setRequestProperty("User-Agent", this.A0D);
                            try {
                                if (httpsURLConnection.getResponseCode() == 200) {
                                    String contentType = httpsURLConnection.getContentType();
                                    AnonymousClass00C.A08(contentType);
                                    String A0s = C36401kF.A0s(C90494aF.A0i(contentType, ";"), 0);
                                    String contentEncoding = httpsURLConnection.getContentEncoding();
                                    if (contentEncoding == null) {
                                        contentEncoding = "utf-8";
                                    }
                                    WebResourceResponse webResourceResponse = new WebResourceResponse(A0s, contentEncoding, C90524aI.A0P(C36351kA.A1b(C05610Qj.A00(C90484aE.A0b(httpsURLConnection.getInputStream())))));
                                    httpsURLConnection.disconnect();
                                    return webResourceResponse;
                                }
                                httpsURLConnection.disconnect();
                                return null;
                            } catch (Throwable th2) {
                                th = th2;
                                httpsURLConnection.disconnect();
                            }
                        } else {
                            th = C36331k8.A0d("sslFactoryCreator");
                            throw th;
                        }
                    } catch (Exception e) {
                        if (e.getCause() instanceof CertificateException) {
                            AnonymousClass17Y r2 = this.A01;
                            if (r2 != null) {
                                r2.A0H(new C80243v5(this, 19));
                            } else {
                                throw C36321k7.A06();
                            }
                        }
                    }
                }
            }
            return null;
        }
        throw C36321k7.A07();
    }

    public /* synthetic */ void Bkf(int i, int i2, int i3, int i4) {
    }

    public boolean BtH(String str) {
        return false;
    }

    public void Bx5(String str) {
    }

    public void Bx6(String str) {
    }

    public void A1J() {
        int i;
        String str;
        ViewTreeObserver viewTreeObserver;
        C92624eH r0 = this.A00;
        if (!(r0 == null || (viewTreeObserver = r0.getViewTreeObserver()) == null)) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.A0H);
        }
        WaFlowsViewModel waFlowsViewModel = this.A08;
        if (waFlowsViewModel == null) {
            throw C36331k8.A0d("waFlowsViewModel");
        }
        Number A0z = C36441kJ.A0z(waFlowsViewModel.A02);
        if (A0z == null || A0z.intValue() != 2) {
            AnonymousClass1KT r2 = this.A07;
            if (r2 != null) {
                WaFlowsViewModel waFlowsViewModel2 = this.A08;
                if (waFlowsViewModel2 == null) {
                    throw C36331k8.A0d("waFlowsViewModel");
                }
                AnonymousClass6DY r02 = waFlowsViewModel2.A0D.A00;
                if (r02 != null) {
                    i = r02.A02.hashCode();
                } else {
                    i = 0;
                }
                r2.A0C(i, 22);
                str = "user_interrupted";
            } else {
                throw C36331k8.A0d("flowsScreenNavigationLogger");
            }
        } else {
            str = "flow_success";
        }
        AnonymousClass6PZ r1 = this.A06;
        if (r1 != null) {
            r1.A03(str, true);
            super.A1J();
            return;
        }
        throw C36331k8.A0d("wamFlowsScreenProgressReporter");
    }

    public void Bke(String str, int i) {
        FlowsWebBottomSheetContainer flowsWebBottomSheetContainer = this.A0F;
        if (flowsWebBottomSheetContainer != null) {
            C36321k7.A1P("ExtensionsLogger/FlowsWebBottomSheetContainer/onWebViewFatalError -- ", str, AnonymousClass000.A0u());
            LinearLayout linearLayout = flowsWebBottomSheetContainer.A00;
            if (linearLayout != null && linearLayout.getVisibility() != 0) {
                FlowsWebBottomSheetContainer.A05(flowsWebBottomSheetContainer, (String) null, (String) null);
            }
        }
    }

    public C123555wh BmU() {
        C123555wh r1 = new AnonymousClass6JT().A00;
        r1.A03 = false;
        r1.A01 = false;
        r1.A02 = true;
        return r1;
    }

    public void A1Q(Bundle bundle) {
        String str;
        URL url;
        C87764Qb r1;
        super.A1Q(bundle);
        this.A08 = (WaFlowsViewModel) C36381kD.A0P(this).A00(WaFlowsViewModel.class);
        Bundle bundle2 = this.A0A;
        if (bundle2 == null || (str = bundle2.getString("url")) == null) {
            str = "about:blank";
        }
        this.A0C = str;
        AnonymousClass1KW r5 = this.A03;
        if (r5 != null) {
            C20810yC r12 = this.A09;
            if (r12 != null) {
                C19970wo r4 = this.A02;
                if (r4 != null) {
                    int A072 = r12.A07(7126);
                    try {
                        url = C90524aI.A0j(r12.A09(7125));
                    } catch (MalformedURLException e) {
                        C36321k7.A1W("FlowsLogger/FlowsWebCacheCleanerHelper.initFLowsWebCacheCleaner -- Invalid cache cleanup url ", AnonymousClass000.A0u(), e);
                        url = null;
                    }
                    if (A072 <= 0 || url == null) {
                        r1 = new C145326ti();
                    } else {
                        r1 = new C74313lP(url);
                    }
                    this.A0E = new AnonymousClass67O(r4, r5, r1, A072);
                    return;
                }
                throw C36331k8.A0d("time");
            }
            throw C36321k7.A07();
        }
        throw C36331k8.A0d("extensionSharedPreferences");
    }

    public /* synthetic */ boolean BLZ(String str) {
        return false;
    }

    public /* synthetic */ boolean Bgd(ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return false;
    }
}
