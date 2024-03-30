package X;

import android.content.BroadcastReceiver;

/* renamed from: X.4VN  reason: invalid class name */
public class AnonymousClass4VN extends BroadcastReceiver {
    public Object A00;
    public final int A01;

    public AnonymousClass4VN(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0071, code lost:
        com.whatsapp.util.Log.i(r0);
        com.whatsapp.gallerypicker.GalleryPickerFragment.A06(r2, true, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0077, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d4, code lost:
        com.whatsapp.util.Log.i(r0);
        ((com.whatsapp.gallery.MediaGalleryFragmentBase) r5.A00).A1g(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00de, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e9, code lost:
        com.whatsapp.util.Log.i(r0);
        ((com.whatsapp.gallery.MediaGalleryFragmentBase) r5.A00).A1g(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00f4, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r6, android.content.Intent r7) {
        /*
            r5 = this;
            int r0 = r5.A01
            switch(r0) {
                case 0: goto L_0x0019;
                case 1: goto L_0x00f5;
                case 2: goto L_0x0034;
                case 3: goto L_0x0094;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r1 = r7.getAction()
            java.lang.String r0 = "android.nfc.action.ADAPTER_STATE_CHANGED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0018
            java.lang.Object r0 = r5.A00
            X.01L r0 = (X.AnonymousClass01L) r0
            r0.invalidateOptionsMenu()
        L_0x0018:
            return
        L_0x0019:
            java.lang.Object r1 = r5.A00
            X.28e r1 = (X.AnonymousClass28e) r1
            X.22r r0 = r1.A02
            if (r0 == 0) goto L_0x0018
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x0018
            X.22r r0 = r1.A02
            r0.dismiss()
            X.4Oz r0 = r1.A08
            android.view.View r0 = (android.view.View) r0
            r0.requestLayout()
            return
        L_0x0034:
            r4 = 1
            X.AnonymousClass00C.A0D(r7, r4)
            java.lang.Object r2 = r5.A00
            com.whatsapp.gallerypicker.GalleryPickerFragment r2 = (com.whatsapp.gallerypicker.GalleryPickerFragment) r2
            java.lang.String r3 = r7.getAction()
            if (r3 == 0) goto L_0x0018
            int r0 = r3.hashCode()
            r1 = 0
            switch(r0) {
                case -1514214344: goto L_0x0089;
                case -1142424621: goto L_0x0078;
                case -963871873: goto L_0x0067;
                case -625887599: goto L_0x005c;
                case 1412829408: goto L_0x004b;
                default: goto L_0x004a;
            }
        L_0x004a:
            return
        L_0x004b:
            java.lang.String r0 = "android.intent.action.MEDIA_SCANNER_STARTED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = "GalleryPicker/receiveMediaBroadcast/ACTION_MEDIA_SCANNER_STARTED"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.gallerypicker.GalleryPickerFragment.A06(r2, r1, r4)
            return
        L_0x005c:
            java.lang.String r0 = "android.intent.action.MEDIA_EJECT"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = "GalleryPicker/receiveMediaBroadcast/ACTION_MEDIA_EJECT"
            goto L_0x0071
        L_0x0067:
            java.lang.String r0 = "android.intent.action.MEDIA_UNMOUNTED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = "GalleryPicker/receiveMediaBroadcast/ACTION_MEDIA_UNMOUNTED"
        L_0x0071:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.gallerypicker.GalleryPickerFragment.A06(r2, r4, r1)
            return
        L_0x0078:
            java.lang.String r0 = "android.intent.action.MEDIA_SCANNER_FINISHED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = "GalleryPicker/receiveMediaBroadcast/ACTION_MEDIA_SCANNER_FINISHED"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.gallerypicker.GalleryPickerFragment.A06(r2, r1, r1)
            return
        L_0x0089:
            java.lang.String r0 = "android.intent.action.MEDIA_MOUNTED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = "GalleryPicker/receiveMediaBroadcast/ACTION_MEDIA_MOUNTED"
            goto L_0x00b0
        L_0x0094:
            r2 = 1
            X.AnonymousClass00C.A0D(r7, r2)
            java.lang.String r1 = r7.getAction()
            if (r1 == 0) goto L_0x0018
            int r0 = r1.hashCode()
            switch(r0) {
                case -1514214344: goto L_0x00a6;
                case -1142424621: goto L_0x00b4;
                case -963871873: goto L_0x00bf;
                case -625887599: goto L_0x00ca;
                case 1412829408: goto L_0x00df;
                default: goto L_0x00a5;
            }
        L_0x00a5:
            return
        L_0x00a6:
            java.lang.String r0 = "android.intent.action.MEDIA_MOUNTED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = "mediapickerfragment/receivemediabroadcast/ACTION_MEDIA_MOUNTED"
        L_0x00b0:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x00b4:
            java.lang.String r0 = "android.intent.action.MEDIA_SCANNER_FINISHED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = "mediapickerfragment/receivemediabroadcast/ACTION_MEDIA_SCANNER_FINISHED"
            goto L_0x00e9
        L_0x00bf:
            java.lang.String r0 = "android.intent.action.MEDIA_UNMOUNTED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = "mediapickerfragment/receivemediabroadcast/ACTION_MEDIA_UNMOUNTED"
            goto L_0x00d4
        L_0x00ca:
            java.lang.String r0 = "android.intent.action.MEDIA_EJECT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = "mediapickerfragment/receivemediabroadcast/ACTION_MEDIA_EJECT"
        L_0x00d4:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r0 = r5.A00
            com.whatsapp.gallery.MediaGalleryFragmentBase r0 = (com.whatsapp.gallery.MediaGalleryFragmentBase) r0
            r0.A1g(r2)
            return
        L_0x00df:
            java.lang.String r0 = "android.intent.action.MEDIA_SCANNER_STARTED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = "mediapickerfragment/receivemediabroadcast/ACTION_MEDIA_SCANNER_STARTED"
        L_0x00e9:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r1 = r5.A00
            com.whatsapp.gallery.MediaGalleryFragmentBase r1 = (com.whatsapp.gallery.MediaGalleryFragmentBase) r1
            r0 = 0
            r1.A1g(r0)
            return
        L_0x00f5:
            java.lang.Object r2 = r5.A00     // Catch:{ Exception -> 0x0119 }
            X.3fk r2 = (X.C70803fk) r2     // Catch:{ Exception -> 0x0119 }
            X.4V6 r0 = r2.A2l     // Catch:{ Exception -> 0x0119 }
            r0.unregisterReceiver(r5)     // Catch:{ Exception -> 0x0119 }
            java.lang.String r0 = "conversation/reset-ime"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0119 }
            X.4V6 r0 = r2.A2l     // Catch:{ Exception -> 0x0119 }
            X.0yb r0 = r0.getSystemServices()     // Catch:{ Exception -> 0x0119 }
            android.view.inputmethod.InputMethodManager r1 = r0.A0N()     // Catch:{ Exception -> 0x0119 }
            X.C18740tg.A06(r1)     // Catch:{ Exception -> 0x0119 }
            com.whatsapp.mentions.MentionableEntry r0 = r2.A4B     // Catch:{ Exception -> 0x0119 }
            r1.restartInput(r0)     // Catch:{ Exception -> 0x0119 }
            r0 = 0
            r2.A09 = r0     // Catch:{ Exception -> 0x0119 }
            return
        L_0x0119:
            r1 = move-exception
            java.lang.String r0 = "conversation/unregister user present receiver "
            com.whatsapp.util.Log.e(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4VN.onReceive(android.content.Context, android.content.Intent):void");
    }
}
