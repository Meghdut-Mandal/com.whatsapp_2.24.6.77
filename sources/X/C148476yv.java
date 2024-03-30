package X;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6yv  reason: invalid class name and case insensitive filesystem */
public final class C148476yv implements C161257mS {
    public final C19630wG A00;

    public Intent BHR(List list, int i) {
        String str;
        Object obj;
        if (!(i == 6 || i == 7)) {
            ArrayList A0I = AnonymousClass001.A0I();
            JSONArray A0u = C90524aI.A0u();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C123995xQ r8 = (C123995xQ) it.next();
                Uri uri = r8.A02;
                try {
                    JSONObject A1B = C36441kJ.A1B();
                    A1B.put("story_media_caption", r8.A03);
                    C90504aG.A1J(uri, "story_media_uri", A1B);
                    A1B.put("story_media_video_length_sec", r8.A01);
                    A1B.put("story_media_aspect_ratio", r8.A00);
                    A0u.put(C90484aE.A0l(r8.A04, "story_media_link_url", A1B));
                    A0I.add(uri);
                } catch (JSONException e) {
                    Log.w("FBLiteCrossPoster/json", e);
                }
            }
            if (i == 1) {
                str = "image/png";
            } else if (i == 3 || i == 6) {
                str = "video/mp4";
            } else {
                str = "*/*";
            }
            String str2 = "com.facebook.lite.composer.activities.ShareIntentMultiPhotoAlphabeticalAlias";
            if (!(i == 1 || i == 4)) {
                str2 = "com.facebook.lite.composer.activities.ShareIntentVideoAlphabeticalAlias";
            }
            Intent putExtra = C36431kI.A0D().setType(str).setPackage("com.facebook.lite").setComponent(new ComponentName("com.facebook.lite", str2)).addFlags(268435456).putExtra("com.facebook.platform.extra.APPLICATION_ID", "994766073959253").putExtra("editing_disabled", true).putExtra("media_list", A0u.toString());
            AnonymousClass00C.A08(putExtra);
            if (list.size() == 1) {
                putExtra.setAction("android.intent.action.SEND").putExtra("android.intent.extra.STREAM", ((C123995xQ) C36391kE.A0t(list)).A02);
            } else if (list.size() > 1) {
                putExtra.setAction("android.intent.action.SEND_MULTIPLE").putParcelableArrayListExtra("android.intent.extra.STREAM", A0I);
            }
            try {
                obj = this.A00.A00.getPackageManager().queryIntentActivities(putExtra, 65536);
            } catch (Throwable th) {
                obj = C90524aI.A0t(th);
            }
            Object obj2 = C023409w.A00;
            if (obj instanceof AnonymousClass03N) {
                obj = obj2;
            }
            if (!((List) obj).isEmpty()) {
                return putExtra;
            }
        }
        return null;
    }

    public C148476yv(C19630wG r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009d, code lost:
        if (X.AnonymousClass000.A1X(r0) != false) goto L_0x009f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BNf() {
        /*
            r7 = this;
            android.content.Intent r0 = X.C36431kI.A0D()
            java.lang.String r6 = "com.facebook.lite"
            android.content.Intent r1 = r0.setPackage(r6)
            java.lang.String r0 = "image/png"
            android.content.Intent r2 = r1.setType(r0)
            java.lang.String r1 = "com.facebook.lite.composer.activities.ShareIntentMultiPhotoAlphabeticalAlias"
            android.content.ComponentName r0 = new android.content.ComponentName
            r0.<init>(r6, r1)
            android.content.Intent r4 = r2.setComponent(r0)
            X.AnonymousClass00C.A08(r4)
            X.0wG r0 = r7.A00
            android.content.Context r2 = r0.A00
            android.content.pm.PackageManager r1 = r2.getPackageManager()
            r3 = 0
            r0 = 65536(0x10000, float:9.18355E-41)
            java.util.List r0 = r1.queryIntentActivities(r4, r0)     // Catch:{ all -> 0x00a4 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x00a4 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00a4 }
            r5 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0083
            android.content.pm.PackageManager r0 = r2.getPackageManager()     // Catch:{ all -> 0x00a4 }
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r6, r3)     // Catch:{ all -> 0x0085 }
            java.lang.String r1 = r0.versionName     // Catch:{ all -> 0x0085 }
            X.AnonymousClass00C.A07(r1)     // Catch:{ all -> 0x0085 }
            java.lang.String r0 = "\\."
            java.util.List r4 = X.C90504aG.A0v(r1, r0, r3)     // Catch:{ all -> 0x0085 }
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x0085 }
            r2 = 1
            if (r0 != 0) goto L_0x007a
            int r0 = r4.size()     // Catch:{ all -> 0x0085 }
            java.util.ListIterator r1 = r4.listIterator(r0)     // Catch:{ all -> 0x0085 }
        L_0x005b:
            boolean r0 = r1.hasPrevious()     // Catch:{ all -> 0x0085 }
            if (r0 == 0) goto L_0x007a
            int r0 = X.C36411kG.A0A(r1)     // Catch:{ all -> 0x0085 }
            if (r0 == 0) goto L_0x005b
            java.util.List r0 = X.C36411kG.A14(r4, r1)     // Catch:{ all -> 0x0085 }
        L_0x006b:
            java.lang.Object r0 = X.C007103b.A0L(r0)     // Catch:{ all -> 0x0085 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0085 }
            int r1 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x0085 }
            r0 = 91
            if (r1 >= r0) goto L_0x007e
            goto L_0x007d
        L_0x007a:
            X.09w r0 = X.C023409w.A00     // Catch:{ all -> 0x0085 }
            goto L_0x006b
        L_0x007d:
            r2 = 0
        L_0x007e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0085 }
            goto L_0x008a
        L_0x0083:
            r5 = 0
            goto L_0x009f
        L_0x0085:
            r0 = move-exception
            X.03N r0 = X.C90524aI.A0t(r0)     // Catch:{ all -> 0x00a4 }
        L_0x008a:
            java.lang.Throwable r1 = X.AnonymousClass0AK.A00(r0)     // Catch:{ all -> 0x00a4 }
            if (r1 == 0) goto L_0x0099
            java.lang.String r0 = "Cannot get FBLite version number"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x00a4 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x00a4 }
        L_0x0099:
            boolean r0 = X.AnonymousClass000.A1X(r0)     // Catch:{ all -> 0x00a4 }
            if (r0 == 0) goto L_0x0083
        L_0x009f:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x00a4 }
            goto L_0x00a9
        L_0x00a4:
            r0 = move-exception
            X.03N r2 = X.C90524aI.A0t(r0)
        L_0x00a9:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            boolean r0 = r2 instanceof X.AnonymousClass03N
            if (r0 == 0) goto L_0x00b2
            r2 = r1
        L_0x00b2:
            boolean r0 = X.AnonymousClass000.A1X(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C148476yv.BNf():boolean");
    }
}
