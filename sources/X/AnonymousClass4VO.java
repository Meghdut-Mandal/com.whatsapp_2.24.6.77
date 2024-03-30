package X;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* renamed from: X.4VO  reason: invalid class name */
public class AnonymousClass4VO extends ContentObserver {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4VO(Handler handler, Object obj, int i) {
        super(handler);
        this.A01 = i;
        this.A00 = obj;
    }

    public boolean deliverSelfNotifications() {
        switch (this.A01) {
            case 1:
            case 2:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a5, code lost:
        X.C05600Qi.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a8, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b0, code lost:
        if (r7 != null) goto L_0x00b2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onChange(boolean r11) {
        /*
            r10 = this;
            int r0 = r10.A01
            switch(r0) {
                case 1: goto L_0x0036;
                case 2: goto L_0x0053;
                case 3: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.onChange(r11)
        L_0x0008:
            return
        L_0x0009:
            java.lang.Object r2 = r10.A00
            com.whatsapp.gallerypicker.GalleryPickerFragment r2 = (com.whatsapp.gallerypicker.GalleryPickerFragment) r2
            X.01I r0 = r2.A0h()
            if (r0 == 0) goto L_0x0008
            r1 = 1
            boolean r0 = r0.isFinishing()
            if (r0 == r1) goto L_0x0008
            X.0yb r0 = r2.A08
            if (r0 == 0) goto L_0x00d5
            X.0ya r4 = r0.A0O()
            if (r4 == 0) goto L_0x00c1
            X.6N7 r0 = r2.A0H
            if (r0 == 0) goto L_0x00ba
            java.lang.String r3 = "volume"
            java.lang.String[] r6 = new java.lang.String[]{r3}
            android.net.Uri r5 = android.provider.MediaStore.getMediaScannerUri()
            r7 = 0
            if (r5 == 0) goto L_0x00af
            goto L_0x0085
        L_0x0036:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "documentsgalleryfragment/onchange "
            X.C36321k7.A1X(r0, r1, r11)
            java.lang.Object r1 = r10.A00
            X.2TX r1 = (X.AnonymousClass2TX) r1
            android.database.Cursor r0 = r1.A00
            if (r0 != 0) goto L_0x004e
            r0 = 0
        L_0x0048:
            r1.A00 = r0
            r1.A06()
            return
        L_0x004e:
            int r0 = r0.getCount()
            goto L_0x0048
        L_0x0053:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MediaGalleryFragmentBase/onchange "
            X.C36321k7.A1X(r0, r1, r11)
            java.lang.Object r2 = r10.A00
            com.whatsapp.gallery.MediaGalleryFragmentBase r2 = (com.whatsapp.gallery.MediaGalleryFragmentBase) r2
            X.4Uo r0 = r2.A0G
            if (r0 == 0) goto L_0x0072
            if (r11 != 0) goto L_0x006c
            r0.BoI()
            com.whatsapp.gallery.MediaGalleryFragmentBase.A08(r2)
        L_0x006c:
            int r0 = r0.getCount()
            r2.A01 = r0
        L_0x0072:
            X.17Y r1 = r2.A07
            if (r1 == 0) goto L_0x0080
            r0 = 27
            X.3v5 r0 = X.C80243v5.A00(r2, r0)
            r1.Bp3(r0)
            return
        L_0x0080:
            java.lang.RuntimeException r0 = X.C36321k7.A06()
            throw r0
        L_0x0085:
            r9 = r7
            r8 = r7
            android.database.Cursor r7 = r4.A03(r5, r6, r7, r8, r9)     // Catch:{ UnsupportedOperationException -> 0x00a9 }
            if (r7 == 0) goto L_0x00af
            int r1 = r7.getCount()     // Catch:{ all -> 0x00a2 }
            r0 = 1
            if (r1 != r0) goto L_0x00af
            r7.moveToFirst()     // Catch:{ all -> 0x00a2 }
            java.lang.String r1 = "external"
            java.lang.String r0 = X.C36341k9.A0f(r7, r3)     // Catch:{ all -> 0x00a2 }
            boolean r1 = r1.equals(r0)     // Catch:{ all -> 0x00a2 }
            goto L_0x00b2
        L_0x00a2:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r0 = move-exception
            X.C05600Qi.A00(r7, r1)
            throw r0
        L_0x00a9:
            r1 = move-exception
            java.lang.String r0 = "MediaManager/makeMediaList UnsupportedOperationException"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00af:
            r1 = 0
            if (r7 == 0) goto L_0x00b5
        L_0x00b2:
            r7.close()
        L_0x00b5:
            r0 = 0
            com.whatsapp.gallerypicker.GalleryPickerFragment.A06(r2, r0, r1)
            return
        L_0x00ba:
            java.lang.String r0 = "mediaManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00c1:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "GalleryPicker/"
            r1.append(r0)
            int r0 = r2.A00
            r1.append(r0)
            java.lang.String r0 = " no content resolver"
            X.C36321k7.A1a(r1, r0)
            return
        L_0x00d5:
            java.lang.RuntimeException r0 = X.C36331k8.A0W()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4VO.onChange(boolean):void");
    }

    public void onChange(boolean z, Uri uri) {
        if (this.A01 != 0) {
            super.onChange(z, uri);
        } else {
            ((C17300r3) this.A00).BwE(AnonymousClass0AJ.A00);
        }
    }
}
