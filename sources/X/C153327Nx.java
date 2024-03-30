package X;

import android.net.Uri;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;

/* renamed from: X.7Nx  reason: invalid class name and case insensitive filesystem */
public final class C153327Nx extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C92624eH $webView;
    public final /* synthetic */ C133786Zz this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C153327Nx(C92624eH r2, C133786Zz r3) {
        super(0);
        this.this$0 = r3;
        this.$webView = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C133786Zz r1 = this.this$0;
        C92624eH r0 = this.$webView;
        r1.A00 = r0;
        if (r0 == null) {
            throw C36331k8.A0d("secureWebView");
        }
        r0.getSettings().setJavaScriptEnabled(true);
        C92624eH r2 = this.this$0.A00;
        if (r2 == null) {
            throw C36331k8.A0d("secureWebView");
        }
        r2.evaluateJavascript("\n(function () {\n    if (window.WhatsAppBridge) {\n        return;\n    }\n    \n    window.WhatsAppBridge = {\n        invoke: invoke,\n    };\n\n    var responseCallbacks = {};\n    var port;\n    window.addEventListener('message', function (event) {\n        if (event.data == 'init-port') {\n            if (event.ports[0] != null) {\n                port = event.ports[0];\n                port.onmessage = function (event) {\n                    handleMessage(event.data)\n                };\n            }\n        }\n    }, false);\n\n    function invoke(method, data, responseCallback) {\n        dispatchMessage({method: method, data: data }, responseCallback);\n    }\n\n    function dispatchMessage(message, responseCallback) {\n        if (responseCallback) {\n            var callbackID = Math.random().toString(36)\n            responseCallbacks[callbackID] = responseCallback;\n            message['callbackID'] = callbackID;\n        }\n\n        port.postMessage(JSON.stringify(message))\n    }\n\n    function handleMessage(messageJSON) {\n        var message = JSON.parse(messageJSON);\n        var responseCallback;\n\n        if (message.callbackID) {\n            responseCallback = responseCallbacks[message.callbackID];\n            delete responseCallbacks[message.callbackID];\n\n            if (!responseCallback) {\n                return;\n            }\n            if (!message.responseData) {\n                responseCallback()\n            } else {\n                responseCallback(message.responseData);\n            }\n        }\n    }\n })();\n", C135996db.A00);
        WebMessagePort[] createWebMessageChannel = this.$webView.createWebMessageChannel();
        AnonymousClass00C.A08(createWebMessageChannel);
        C133786Zz r12 = this.this$0;
        WebMessagePort webMessagePort = createWebMessageChannel[0];
        AnonymousClass00C.A05(webMessagePort);
        r12.A01 = webMessagePort;
        C133786Zz r22 = this.this$0;
        WebMessagePort A00 = r22.A01;
        if (A00 == null) {
            throw C36331k8.A0d("sendPort");
        }
        A00.setWebMessageCallback(new C92594eE(r22));
        C92624eH r3 = this.this$0.A00;
        if (r3 == null) {
            throw C36331k8.A0d("secureWebView");
        }
        r3.postWebMessage(new WebMessage("init-port", new WebMessagePort[]{createWebMessageChannel[1]}), Uri.EMPTY);
        return AnonymousClass0AJ.A00;
    }
}
