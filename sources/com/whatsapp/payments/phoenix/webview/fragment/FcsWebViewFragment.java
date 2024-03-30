package com.whatsapp.payments.phoenix.webview.fragment;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass011;
import X.AnonymousClass01I;
import X.AnonymousClass61B;
import X.AnonymousClass67A;
import X.AnonymousClass68X;
import X.AnonymousClass6EW;
import X.AnonymousClass6JT;
import X.AnonymousClass700;
import X.AnonymousClass702;
import X.AnonymousClass7i0;
import X.C000400e;
import X.C123555wh;
import X.C125245zZ;
import X.C1257361b;
import X.C128176Bf;
import X.C131376Ou;
import X.C133036Wk;
import X.C149106zw;
import X.C160997lv;
import X.C162097o1;
import X.C203619oP;
import X.C203639oR;
import X.C20380xT;
import X.C20810yC;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36441kJ;
import X.C52122ov;
import X.C90464aC;
import X.C90474aD;
import X.C90494aF;
import X.C92624eH;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.extensions.phoenix.webview.FcsExtensionsWebViewFragment;
import com.whatsapp.util.Log;
import com.whatsapp.webview.ui.WebViewWrapperView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FcsWebViewFragment extends Hilt_FcsWebViewFragment implements C160997lv {
    public C92624eH A00;
    public C20810yC A01;
    public AnonymousClass61B A02;
    public C20380xT A03;
    public C131376Ou A04;
    public String A05;
    public int A06 = -1;
    public AnonymousClass6EW A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public HashMap A0C;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        AnonymousClass00C.A0D(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
        WebViewWrapperView webViewWrapperView = (WebViewWrapperView) C36361kB.A0G(inflate, R.id.webview_wrapper_view);
        webViewWrapperView.setWebViewDelegate(this);
        this.A00 = webViewWrapperView.A02;
        String str2 = this.A05;
        if (str2 == null) {
            throw C36331k8.A0d("launchURL");
        }
        Uri A012 = C133036Wk.A01(str2);
        AnonymousClass00C.A08(A012);
        HashMap hashMap = this.A0C;
        if (this instanceof FcsExtensionsWebViewFragment) {
            FcsExtensionsWebViewFragment fcsExtensionsWebViewFragment = (FcsExtensionsWebViewFragment) this;
            C20810yC r1 = fcsExtensionsWebViewFragment.A01;
            if (r1 != null) {
                String A092 = r1.A09(5326);
                AnonymousClass00C.A0B(A092);
                List A0i = C90494aF.A0i(A092, ",");
                ArrayList A0J = C36321k7.A0J(A0i);
                Iterator it = A0i.iterator();
                while (it.hasNext()) {
                    A0J.add(C36371kC.A0y(AnonymousClass001.A0C(it)));
                }
                if (!(A0J instanceof Collection) || !A0J.isEmpty()) {
                    Iterator it2 = A0J.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        String A0C2 = AnonymousClass001.A0C(it2);
                        String host = A012.getHost();
                        if (host != null) {
                            if (host.equals(A0C2)) {
                                break;
                            }
                            String A0f = C90464aC.A0f(A0C2, AnonymousClass000.A0u(), '.');
                            AnonymousClass00C.A0D(A0f, 1);
                            if (host.endsWith(A0f)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (hashMap != null && !FcsExtensionsWebViewFragment.A05(fcsExtensionsWebViewFragment, hashMap)) {
                        Log.e("callback output payload doesn't have allowed types");
                        str = "phoenix-webview-payload-definition-error";
                        FcsExtensionsWebViewFragment.A00(fcsExtensionsWebViewFragment, str);
                        A08(C000400e.A0D(), false);
                        return inflate;
                    }
                }
                Log.e("Flows WebView cannot be loaded. Host not allowed.");
                str = "phoenix-webview-host-not-allowed-error";
                FcsExtensionsWebViewFragment.A00(fcsExtensionsWebViewFragment, str);
                A08(C000400e.A0D(), false);
                return inflate;
            }
            throw C36321k7.A07();
        }
        C92624eH r0 = this.A00;
        if (r0 != null) {
            r0.getSettings().setJavaScriptEnabled(true);
        }
        String str3 = this.A05;
        if (str3 == null) {
            throw C36331k8.A0d("launchURL");
        }
        Uri A013 = C133036Wk.A01(str3);
        AnonymousClass00C.A08(A013);
        AnonymousClass68X r2 = new AnonymousClass68X();
        r2.A02("https");
        String[] A1R = C36441kJ.A1R();
        A1R[0] = A013.getHost();
        r2.A01(A1R);
        C125245zZ A002 = r2.A00();
        AnonymousClass00C.A08(A002);
        C1257361b r12 = new C1257361b();
        r12.A00.add(A002);
        AnonymousClass67A A003 = r12.A00();
        C92624eH r02 = this.A00;
        if (r02 != null) {
            r02.A02 = A003;
        }
        Bx5("");
        Bx6("");
        String str4 = this.A05;
        if (str4 == null) {
            throw C36331k8.A0d("launchURL");
        }
        A07(str4);
        return inflate;
    }

    public void A1U(Menu menu, MenuInflater menuInflater) {
        C36331k8.A1I(menu, menuInflater);
        menu.clear();
        C36391kE.A1F(menu, R.id.menuitem_webview_refresh, R.string.f12nameremoved);
        C36391kE.A1F(menu, R.id.menuitem_webview_learn_more, R.string.f12nameremoved);
        C36391kE.A1F(menu, R.id.menuitem_webview_open_in_browser, R.string.f12nameremoved);
        if (this instanceof FcsExtensionsWebViewFragment) {
            C36391kE.A1F(menu, -1, R.string.f12nameremoved);
            menu.add(0, 2, 0, A0n(R.string.f12nameremoved)).setShowAsAction(0);
        }
    }

    public void Bke(String str, int i) {
    }

    private final void A07(String str) {
        Bundle bundle = this.A0A;
        if (bundle == null || !bundle.getBoolean("use_post_request")) {
            C92624eH r0 = this.A00;
            if (r0 != null) {
                r0.loadUrl(str);
                return;
            }
            return;
        }
        C92624eH r1 = this.A00;
        if (r1 != null) {
            String str2 = this.A08;
            if (str2 == null) {
                throw C36331k8.A0d("dataJson");
            }
            r1.postUrl(str, C36351kA.A1b(str2));
        }
    }

    private final void A08(Map map, boolean z) {
        C203619oP r1;
        C162097o1 r0;
        Bx5("");
        Bx6("");
        if (this instanceof FcsExtensionsWebViewFragment) {
            if (z) {
                AnonymousClass011[] r3 = new AnonymousClass011[3];
                r3[0] = C36441kJ.A19("action", A0b().getString("next_action"));
                AnonymousClass011[] r4 = new AnonymousClass011[2];
                AnonymousClass011[] r8 = new AnonymousClass011[2];
                C36341k9.A1J(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, A0b().getString("next_screen"), r8, 0);
                C36341k9.A1J(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "screen", r8, 1);
                C36341k9.A1J("next", C000400e.A07(r8), r4, 0);
                C36341k9.A1J("data", map, r4, 1);
                C36341k9.A1J("action_payload", C000400e.A07(r4), r3, 1);
                C36341k9.A1J("current_screen", A0b().getString("current_screen"), r3, 2);
                map = C000400e.A07(r3);
            } else {
                map = C36391kE.A11(C52122ov.A02.key, C128176Bf.A00(A0b().getString("error_message")));
            }
        }
        AnonymousClass011[] r2 = new AnonymousClass011[3];
        C90464aC.A1E("resource_output", map, r2);
        C90464aC.A1F("status", Boolean.valueOf(z), r2);
        C90474aD.A1F("callback_index", Integer.valueOf(this.A06), r2);
        LinkedHashMap A072 = C000400e.A07(r2);
        AnonymousClass61B r12 = this.A02;
        if (r12 != null) {
            String str = this.A0A;
            if (str == null) {
                throw C36331k8.A0d("fdsManagerId");
            }
            C203639oR A002 = r12.A00(str);
            if (A002 != null && (r1 = A002.A00) != null && (r0 = (C162097o1) r1.A0A("open_web_view")) != null) {
                r0.B7N(A072);
                return;
            }
            return;
        }
        throw C36331k8.A0d("fdsManagerRegistry");
    }

    public void Bkf(int i, int i2, int i3, int i4) {
        AnonymousClass6EW r2;
        boolean z;
        if (i2 > 0) {
            if (i4 == 0) {
                r2 = this.A07;
                if (r2 == null) {
                    throw C36331k8.A0d("uiObserver");
                }
                z = true;
            } else {
                return;
            }
        } else if (i2 == 0 && i4 > 0) {
            r2 = this.A07;
            if (r2 == null) {
                throw C36331k8.A0d("uiObserver");
            }
            z = false;
        } else {
            return;
        }
        r2.A02(new C149106zw(z));
    }

    public C123555wh BmU() {
        C123555wh r1 = new AnonymousClass6JT().A00;
        r1.A00 = 1;
        return r1;
    }

    public void Bx5(String str) {
        AnonymousClass6EW r1 = this.A07;
        if (r1 == null) {
            throw C36331k8.A0d("uiObserver");
        }
        r1.A02(new AnonymousClass702(str));
    }

    public void Bx6(String str) {
        if (str != null) {
            AnonymousClass6EW r1 = this.A07;
            if (r1 == null) {
                throw C36331k8.A0d("uiObserver");
            }
            r1.A02(new AnonymousClass700(str));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        if (com.whatsapp.extensions.phoenix.webview.FcsExtensionsWebViewFragment.A03(r5, r1, r4, r2) == false) goto L_0x0076;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A09(java.lang.String r8) {
        /*
            r7 = this;
            int r0 = r8.length()
            r3 = 1
            r6 = 0
            if (r0 != 0) goto L_0x0009
            return r6
        L_0x0009:
            r7.Ba8(r3, r8)
            java.lang.String r1 = r7.A0B
            java.lang.String r0 = "successURL"
            if (r1 != 0) goto L_0x0017
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0017:
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x005f
            boolean r0 = r8.startsWith(r1)
            if (r0 == 0) goto L_0x005f
            android.net.Uri r5 = X.C133036Wk.A01(r8)
            X.AnonymousClass00C.A08(r5)
            java.util.HashMap r4 = X.AnonymousClass001.A0J()
            java.util.HashMap r2 = r7.A0C
            r1 = r7
            boolean r0 = r7 instanceof com.whatsapp.extensions.phoenix.webview.FcsExtensionsWebViewFragment
            if (r0 == 0) goto L_0x0043
            com.whatsapp.extensions.phoenix.webview.FcsExtensionsWebViewFragment r1 = (com.whatsapp.extensions.phoenix.webview.FcsExtensionsWebViewFragment) r1
            if (r2 == 0) goto L_0x003f
            boolean r0 = com.whatsapp.extensions.phoenix.webview.FcsExtensionsWebViewFragment.A03(r5, r1, r4, r2)
            if (r0 == 0) goto L_0x0076
        L_0x003f:
            r7.A08(r4, r3)
            return r3
        L_0x0043:
            java.util.Set r0 = r5.getQueryParameterNames()
            java.util.Iterator r2 = r0.iterator()
        L_0x004b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = X.AnonymousClass001.A0C(r2)
            java.lang.String r0 = r5.getQueryParameter(r1)
            if (r0 == 0) goto L_0x004b
            r4.put(r1, r0)
            goto L_0x004b
        L_0x005f:
            java.lang.String r1 = r7.A09
            java.lang.String r0 = "failureURL"
            if (r1 != 0) goto L_0x006a
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x006a:
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x007e
            boolean r0 = r8.startsWith(r1)
            if (r0 == 0) goto L_0x007e
        L_0x0076:
            X.00f r0 = X.C000400e.A0D()
            r7.A08(r0, r6)
            return r3
        L_0x007e:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.phoenix.webview.fragment.FcsWebViewFragment.A09(java.lang.String):boolean");
    }

    public void A1Q(Bundle bundle) {
        String str;
        String str2;
        String str3;
        Serializable serializable;
        HashMap hashMap;
        String string;
        int i;
        String string2;
        String string3;
        super.A1Q(bundle);
        Bundle bundle2 = this.A0A;
        if (bundle2 == null || (str = bundle2.getString("url")) == null) {
            str = "about:blank";
        }
        this.A05 = str;
        Bundle bundle3 = this.A0A;
        if (bundle3 != null) {
            str2 = bundle3.getString("success_url");
        } else {
            str2 = null;
        }
        String str4 = "";
        if (str2 == null) {
            str2 = str4;
        }
        this.A0B = str2;
        Bundle bundle4 = this.A0A;
        if (bundle4 == null || (str3 = bundle4.getString("failure_url")) == null) {
            str3 = str4;
        }
        this.A09 = str3;
        Bundle bundle5 = this.A0A;
        if (!(bundle5 == null || (string3 = bundle5.getString("post_data")) == null)) {
            str4 = string3;
        }
        this.A08 = str4;
        Bundle bundle6 = this.A0A;
        if (bundle6 != null) {
            serializable = bundle6.getSerializable("callback_url_payload");
        } else {
            serializable = null;
        }
        if (serializable instanceof HashMap) {
            hashMap = (HashMap) serializable;
        } else {
            hashMap = null;
        }
        this.A0C = hashMap;
        Bundle bundle7 = this.A0A;
        if (bundle7 == null || (string = bundle7.getString("fds_manager_id")) == null) {
            throw AnonymousClass001.A09("'fds_manager_id' parameter not passed");
        }
        this.A0A = string;
        Bundle bundle8 = this.A0A;
        if (bundle8 != null) {
            i = bundle8.getInt("callback_index");
        } else {
            i = -1;
        }
        this.A06 = i;
        Bundle bundle9 = this.A0A;
        if (bundle9 == null || (string2 = bundle9.getString("fds_observer_id")) == null) {
            throw C36381kD.A0k();
        }
        C131376Ou r0 = this.A04;
        if (r0 != null) {
            this.A07 = r0.A02(string2);
            return;
        }
        throw C36331k8.A0d("uiObserversFactory");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0099, code lost:
        if (X.AnonymousClass099.A0O(X.C36431kI.A19(r1, 3063), "extensions_help", false) == false) goto L_0x009b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A1X(android.view.MenuItem r9) {
        /*
            r8 = this;
            int r1 = X.C36341k9.A06(r9)
            r0 = 2131431713(0x7f0b1121, float:1.8485163E38)
            r4 = 1
            if (r1 != r0) goto L_0x001d
            java.lang.String r0 = ""
            r8.Bx6(r0)
            X.4eH r0 = r8.A00
            if (r0 == 0) goto L_0x001c
            java.lang.String r0 = r0.getUrl()
            if (r0 == 0) goto L_0x001c
            r8.A07(r0)
        L_0x001c:
            return r4
        L_0x001d:
            r0 = 2131431711(0x7f0b111f, float:1.8485159E38)
            java.lang.String r2 = "android.intent.action.VIEW"
            if (r1 != r0) goto L_0x0037
            X.0xT r1 = r8.A03
            if (r1 == 0) goto L_0x0061
            java.lang.String r0 = "182446338158487"
            android.net.Uri r1 = r1.A02(r0)
        L_0x002e:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r2, r1)
            r8.A1C(r0)
            return r4
        L_0x0037:
            r0 = 2131431712(0x7f0b1120, float:1.848516E38)
            if (r1 != r0) goto L_0x0068
            X.4eH r0 = r8.A00
            if (r0 == 0) goto L_0x0068
            java.lang.String r1 = r0.getUrl()
            if (r1 == 0) goto L_0x0068
            boolean r0 = android.webkit.URLUtil.isHttpsUrl(r1)
            if (r0 == 0) goto L_0x0051
            android.net.Uri r1 = X.C133036Wk.A01(r1)
            goto L_0x002e
        L_0x0051:
            X.4eH r2 = r8.A00
            if (r2 == 0) goto L_0x001c
            r1 = 2131896184(0x7f122778, float:1.9427222E38)
            r0 = -1
            X.4t3 r0 = X.C99304t3.A00(r2, r1, r0)
            r0.A0P()
            return r4
        L_0x0061:
            java.lang.String r0 = "faqLinkFactory"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0068:
            r3 = r8
            boolean r0 = r8 instanceof com.whatsapp.extensions.phoenix.webview.FcsExtensionsWebViewFragment
            if (r0 == 0) goto L_0x0118
            com.whatsapp.extensions.phoenix.webview.FcsExtensionsWebViewFragment r3 = (com.whatsapp.extensions.phoenix.webview.FcsExtensionsWebViewFragment) r3
            r2 = 0
            X.0yC r1 = r3.A01
            if (r1 == 0) goto L_0x0113
            r0 = 2069(0x815, float:2.899E-42)
            java.lang.String r7 = X.C36431kI.A19(r1, r0)
            X.0yC r1 = r3.A01
            if (r1 == 0) goto L_0x010e
            r0 = 4393(0x1129, float:6.156E-42)
            boolean r0 = r1.A0E(r0)
            r5 = 0
            r6 = 2
            if (r0 == 0) goto L_0x009b
            X.0yC r1 = r3.A01
            if (r1 == 0) goto L_0x0109
            r0 = 3063(0xbf7, float:4.292E-42)
            java.lang.String r1 = X.C36431kI.A19(r1, r0)
            java.lang.String r0 = "extensions_help"
            boolean r0 = X.AnonymousClass099.A0O(r1, r0, r2)
            r2 = 1
            if (r0 != 0) goto L_0x009c
        L_0x009b:
            r2 = 0
        L_0x009c:
            int r1 = r9.getItemId()
            r0 = -1
            if (r1 == r0) goto L_0x00d7
            if (r1 != r6) goto L_0x0118
            X.01I r0 = r3.A0h()
            if (r0 == 0) goto L_0x00d5
            android.content.Intent r0 = r0.getIntent()
            if (r0 == 0) goto L_0x00d5
            android.os.Bundle r2 = r0.getExtras()
            if (r2 == 0) goto L_0x00d5
            X.13r r1 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = "chat_id"
            java.lang.String r0 = r2.getString(r0)
            com.whatsapp.jid.UserJid r2 = r1.A02(r0)
            if (r2 == 0) goto L_0x00d5
            X.19g r0 = r3.A05
            if (r0 == 0) goto L_0x00f4
            X.3ty r1 = r0.A07()
            X.7si r0 = new X.7si
            r0.<init>(r2, r3, r4)
            r1.A0A(r0)
        L_0x00d5:
            r0 = 1
            return r0
        L_0x00d7:
            if (r2 == 0) goto L_0x00eb
            java.lang.String r0 = "whatsapp://help/extensions_help"
            android.net.Uri r2 = android.net.Uri.parse(r0)
        L_0x00df:
            X.1Dv r1 = r3.A00
            if (r1 == 0) goto L_0x00fb
            android.content.Context r0 = r3.A0a()
            r1.Bp7(r0, r2, r5)
            goto L_0x00d5
        L_0x00eb:
            X.0xT r0 = r3.A03
            if (r0 == 0) goto L_0x0102
            android.net.Uri r2 = r0.A02(r7)
            goto L_0x00df
        L_0x00f4:
            java.lang.String r0 = "companionDeviceManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00fb:
            java.lang.String r0 = "activityUtils"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0102:
            java.lang.String r0 = "faqLinkFactory"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0109:
            java.lang.RuntimeException r0 = X.C36321k7.A07()
            throw r0
        L_0x010e:
            java.lang.RuntimeException r0 = X.C36321k7.A07()
            throw r0
        L_0x0113:
            java.lang.RuntimeException r0 = X.C36321k7.A07()
            throw r0
        L_0x0118:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.phoenix.webview.fragment.FcsWebViewFragment.A1X(android.view.MenuItem):boolean");
    }

    public void B5p(String str) {
        Bx6(str);
        if (str != null) {
            A09(str);
        }
    }

    public void Ba8(boolean z, String str) {
        AnonymousClass01I A0h = A0h();
        if (A0h instanceof AnonymousClass7i0) {
            ((AnonymousClass7i0) A0h).BsW(z);
        }
    }

    public boolean BtH(String str) {
        return A09(str);
    }

    public /* synthetic */ boolean BLZ(String str) {
        return false;
    }

    public /* synthetic */ WebResourceResponse Beu(String str) {
        return null;
    }

    public /* synthetic */ boolean Bgd(ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return false;
    }
}
