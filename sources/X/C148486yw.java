package X;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6yw  reason: invalid class name and case insensitive filesystem */
public final class C148486yw implements C161257mS {
    public final C19630wG A00;

    public Intent BHR(List list, int i) {
        String str;
        Object obj;
        if (i == 1 || i == 4) {
            str = "image/png";
        } else {
            str = "video/mp4";
        }
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C123995xQ r7 = (C123995xQ) it.next();
            Bundle A07 = AnonymousClass001.A07();
            A07.putString("story_media_caption", r7.A03);
            A07.putParcelable("story_media_uri", r7.A02);
            A07.putInt("story_media_video_length_sec", r7.A01);
            A07.putDouble("story_media_aspect_ratio", r7.A00);
            String str2 = r7.A04;
            if (str2 != null) {
                A07.putString("story_media_link_url", str2);
            }
            A0I.add(A07);
        }
        Intent putParcelableArrayListExtra = C36431kI.A0D().setAction("com.facebook.stories.ADD_TO_STORY").setPackage("com.facebook.katana").putExtra("com.facebook.platform.extra.APPLICATION_ID", "994766073959253").putExtra("editing_disabled", true).setType(str).putParcelableArrayListExtra("media_list", A0I);
        AnonymousClass00C.A08(putParcelableArrayListExtra);
        try {
            obj = this.A00.A00.getPackageManager().queryIntentActivities(putParcelableArrayListExtra, 65536);
        } catch (Throwable th) {
            obj = C90524aI.A0t(th);
        }
        Object obj2 = C023409w.A00;
        if (obj instanceof AnonymousClass03N) {
            obj = obj2;
        }
        if (((List) obj).isEmpty()) {
            return null;
        }
        return putParcelableArrayListExtra;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0086, code lost:
        if (X.AnonymousClass000.A1X(r0) == false) goto L_0x006e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006a A[Catch:{ all -> 0x0070, all -> 0x008d }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BNf() {
        /*
            r6 = this;
            java.lang.String r0 = "com.facebook.stories.ADD_TO_STORY"
            android.content.Intent r4 = X.C36441kJ.A0I(r0)
            java.lang.String r5 = "com.facebook.katana"
            r4.setPackage(r5)
            java.lang.String r0 = "image/png"
            r4.setType(r0)
            X.0wG r0 = r6.A00
            android.content.Context r2 = r0.A00
            android.content.pm.PackageManager r1 = r2.getPackageManager()
            r3 = 0
            r0 = 65536(0x10000, float:9.18355E-41)
            java.util.List r0 = r1.queryIntentActivities(r4, r0)     // Catch:{ all -> 0x008d }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x008d }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x008d }
            r4 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x006e
            android.content.pm.PackageManager r0 = r2.getPackageManager()     // Catch:{ all -> 0x008d }
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r5, r3)     // Catch:{ all -> 0x0070 }
            java.lang.String r1 = r0.versionName     // Catch:{ all -> 0x0070 }
            X.AnonymousClass00C.A0B(r1)     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = "\\."
            java.util.List r2 = X.C90504aG.A0v(r1, r0, r3)     // Catch:{ all -> 0x0070 }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x0070 }
            if (r0 != 0) goto L_0x006b
            int r0 = r2.size()     // Catch:{ all -> 0x0070 }
            java.util.ListIterator r1 = r2.listIterator(r0)     // Catch:{ all -> 0x0070 }
        L_0x004c:
            boolean r0 = r1.hasPrevious()     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x006b
            int r0 = X.C36411kG.A0A(r1)     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x004c
            java.util.List r0 = X.C36411kG.A14(r2, r1)     // Catch:{ all -> 0x0070 }
        L_0x005c:
            java.lang.Object r0 = X.C007103b.A0L(r0)     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0070 }
            int r1 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x0070 }
            r0 = 227(0xe3, float:3.18E-43)
            if (r1 < r0) goto L_0x006e
            goto L_0x0088
        L_0x006b:
            X.09w r0 = X.C023409w.A00     // Catch:{ all -> 0x0070 }
            goto L_0x005c
        L_0x006e:
            r4 = 0
            goto L_0x0088
        L_0x0070:
            r0 = move-exception
            X.03N r0 = X.C90524aI.A0t(r0)     // Catch:{ all -> 0x008d }
            java.lang.Throwable r1 = r0.exception     // Catch:{ all -> 0x008d }
            if (r1 == 0) goto L_0x0082
            java.lang.String r0 = "Cannot get FB version number"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x008d }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x008d }
        L_0x0082:
            boolean r0 = X.AnonymousClass000.A1X(r0)     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x006e
        L_0x0088:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x008d }
            goto L_0x0092
        L_0x008d:
            r0 = move-exception
            X.03N r2 = X.C90524aI.A0t(r0)
        L_0x0092:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            boolean r0 = r2 instanceof X.AnonymousClass03N
            if (r0 == 0) goto L_0x009b
            r2 = r1
        L_0x009b:
            boolean r0 = X.AnonymousClass000.A1X(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C148486yw.BNf():boolean");
    }

    public C148486yw(C19630wG r1) {
        this.A00 = r1;
    }
}
