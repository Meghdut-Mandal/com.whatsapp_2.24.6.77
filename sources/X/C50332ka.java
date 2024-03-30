package X;

import android.app.Activity;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.2ka  reason: invalid class name and case insensitive filesystem */
public class C50332ka extends C132446Tt implements LocationListener {
    public int A00 = 15;
    public Location A01 = null;
    public Location A02 = null;
    public Location A03;
    public boolean A04;
    public int A05 = 0;
    public final C19700wN A06;
    public final C237019m A07;
    public final C20050ww A08;
    public final AnonymousClass1G5 A09;
    public final C19970wo A0A;
    public final C20830yE A0B;
    public final C20310xM A0C;
    public final AnonymousClass16J A0D;
    public final AnonymousClass1FN A0E;
    public final AnonymousClass13E A0F;
    public final AnonymousClass1P5 A0G;
    public final AnonymousClass2bL A0H;

    public void A0A() {
        C237019m r2 = this.A07;
        if (r2 != null) {
            try {
                r2.A06(this, "map-download", 0.0f, 3, 1000, 1000);
            } catch (IllegalArgumentException e) {
                Log.w("MapDownload/registerListener/GPS error ", e);
            }
        }
        AnonymousClass2bL r22 = this.A0H;
        r22.A02 = 1;
        this.A0D.A05(r22, -1);
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0108, code lost:
        if (r11 == null) goto L_0x010f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A00(X.C20050ww r17, X.AnonymousClass13E r18, double r19, double r21, int r23) {
        /*
            r9 = 100
            java.lang.String r6 = "bad bitmap received"
            java.lang.String r5 = "MapDownload/downloadMapThumbnailBitmap/error "
            r4 = 170(0xaa, float:2.38E-43)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "https://maps.googleapis.com/maps/api/staticmap?center="
            r3.append(r0)
            r7 = r19
            r3.append(r7)
            java.lang.String r12 = ","
            r3.append(r12)
            r0 = r21
            r3.append(r0)
            java.lang.String r2 = "&zoom="
            r3.append(r2)
            r2 = 1
            r10 = r23
            int r10 = java.lang.Math.max(r2, r10)
            r2 = 21
            int r13 = java.lang.Math.min(r2, r10)
            r3.append(r13)
            java.lang.String r2 = "&size="
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = "x"
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = "&sensor=true&format=png8&mobile=true&markers=color:red%7Csize:mid%7C"
            r3.append(r2)
            r3.append(r7)
            r3.append(r12)
            r3.append(r0)
            java.lang.String r2 = "&client=gme-whatsappinc"
            java.lang.String r3 = X.AnonymousClass000.A0q(r2, r3)
            java.net.URL r2 = new java.net.URL     // Catch:{ MalformedURLException -> 0x009c }
            r2.<init>(r3)     // Catch:{ MalformedURLException -> 0x009c }
            java.lang.String r15 = r2.getFile()     // Catch:{ MalformedURLException -> 0x009c }
            java.lang.StringBuilder r10 = X.AnonymousClass000.A0v(r3)
            java.lang.String r2 = "&signature="
            r10.append(r2)
            java.lang.String r11 = X.AnonymousClass6JD.A0L
            r3 = 45
            r2 = 43
            java.lang.String r11 = r11.replace(r3, r2)
            r3 = 95
            r2 = 47
            java.lang.String r2 = r11.replace(r3, r2)
            r14 = 0
            byte[] r11 = android.util.Base64.decode(r2, r14)
            r2 = 1
            byte[][] r3 = new byte[r2][]
            byte[] r2 = r15.getBytes()
            r3[r14] = r2
            byte[] r2 = X.C18750th.A0L(r11, r3)
            java.lang.String r2 = X.C36441kJ.A13(r2)
            java.lang.String r2 = X.AnonymousClass14B.A0A(r2)
            java.lang.String r14 = X.AnonymousClass000.A0q(r2, r10)
            goto L_0x009d
        L_0x009c:
            r14 = 0
        L_0x009d:
            r3 = 24
            r11 = 0
            r16 = 0
            r10 = r18
            r2 = r17
            X.6v1 r14 = r10.A04(r14)     // Catch:{ IOException -> 0x00f9, all -> 0x00f6 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00e9 }
            X.5RE r15 = r14.B8D(r2, r11, r3)     // Catch:{ all -> 0x00e9 }
            android.graphics.BitmapFactory$Options r3 = X.C56722wm.A00     // Catch:{ all -> 0x00df }
            android.graphics.Bitmap r11 = android.graphics.BitmapFactory.decodeStream(r15, r11, r3)     // Catch:{ all -> 0x00df }
            if (r11 == 0) goto L_0x00d5
            int r3 = r11.getWidth()     // Catch:{ all -> 0x00df }
            if (r3 != r4) goto L_0x00d5
            int r3 = r11.getHeight()     // Catch:{ all -> 0x00df }
            if (r3 != r4) goto L_0x00d5
            r3 = 35
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r11, r3, r3, r9, r9)     // Catch:{ all -> 0x00df }
            r15.close()     // Catch:{ all -> 0x00d3 }
            r14.close()     // Catch:{ IOException -> 0x00f4 }
            goto L_0x010a
        L_0x00d3:
            r15 = move-exception
            goto L_0x00eb
        L_0x00d5:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x00db }
            r3.<init>(r6)     // Catch:{ all -> 0x00db }
            throw r3     // Catch:{ all -> 0x00db }
        L_0x00db:
            r4 = move-exception
            r16 = 1
            goto L_0x00e0
        L_0x00df:
            r4 = move-exception
        L_0x00e0:
            r15.close()     // Catch:{ all -> 0x00e4 }
            goto L_0x00e8
        L_0x00e4:
            r3 = move-exception
            r4.addSuppressed(r3)     // Catch:{ all -> 0x00e9 }
        L_0x00e8:
            throw r4     // Catch:{ all -> 0x00e9 }
        L_0x00e9:
            r15 = move-exception
            r3 = 0
        L_0x00eb:
            r14.close()     // Catch:{ all -> 0x00ef }
            goto L_0x00f3
        L_0x00ef:
            r4 = move-exception
            r15.addSuppressed(r4)     // Catch:{ IOException -> 0x00f4 }
        L_0x00f3:
            throw r15     // Catch:{ IOException -> 0x00f4 }
        L_0x00f4:
            r4 = move-exception
            goto L_0x00fb
        L_0x00f6:
            r0 = move-exception
            r3 = 0
            goto L_0x0100
        L_0x00f9:
            r4 = move-exception
            r3 = 0
        L_0x00fb:
            com.whatsapp.util.Log.w(r5, r4)     // Catch:{ all -> 0x00ff }
            goto L_0x0108
        L_0x00ff:
            r0 = move-exception
        L_0x0100:
            if (r11 == 0) goto L_0x0107
            if (r11 == r3) goto L_0x0107
            r11.recycle()
        L_0x0107:
            throw r0
        L_0x0108:
            if (r11 == 0) goto L_0x010f
        L_0x010a:
            if (r11 == r3) goto L_0x010f
            r11.recycle()
        L_0x010f:
            if (r3 != 0) goto L_0x0196
            if (r16 == 0) goto L_0x0196
            java.lang.StringBuilder r11 = X.AnonymousClass000.A0u()
            java.lang.String r4 = "https://dev.virtualearth.net/REST/v1/Imagery/Map/Road/"
            r11.append(r4)
            r11.append(r7)
            r11.append(r12)
            r11.append(r0)
            java.lang.String r4 = "/"
            r11.append(r4)
            r11.append(r13)
            java.lang.String r4 = "?mapSize="
            X.C36351kA.A1M(r4, r12, r11, r9)
            r11.append(r9)
            java.lang.String r4 = "&pp="
            r11.append(r4)
            r11.append(r7)
            r11.append(r12)
            r11.append(r0)
            java.lang.String r0 = ";54;&key="
            r11.append(r0)
            java.lang.String r0 = X.AnonymousClass6JD.A06
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r11)
            X.6v1 r4 = r10.A04(r0)     // Catch:{ IOException -> 0x0192 }
            r0 = 24
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0188 }
            r1 = 0
            X.5RE r2 = r4.B8D(r2, r1, r0)     // Catch:{ all -> 0x0188 }
            android.graphics.BitmapFactory$Options r0 = X.C56722wm.A00     // Catch:{ all -> 0x017e }
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r2, r1, r0)     // Catch:{ all -> 0x017e }
            if (r3 == 0) goto L_0x0178
            int r0 = r3.getWidth()     // Catch:{ all -> 0x017e }
            if (r0 != r9) goto L_0x0178
            int r0 = r3.getHeight()     // Catch:{ all -> 0x017e }
            if (r0 != r9) goto L_0x0178
            r2.close()     // Catch:{ all -> 0x0188 }
            r4.close()     // Catch:{ IOException -> 0x0192 }
            goto L_0x0196
        L_0x0178:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x017e }
            r0.<init>(r6)     // Catch:{ all -> 0x017e }
            throw r0     // Catch:{ all -> 0x017e }
        L_0x017e:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0183 }
            goto L_0x0187
        L_0x0183:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0188 }
        L_0x0187:
            throw r1     // Catch:{ all -> 0x0188 }
        L_0x0188:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x018d }
            goto L_0x0191
        L_0x018d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0192 }
        L_0x0191:
            throw r1     // Catch:{ IOException -> 0x0192 }
        L_0x0192:
            r0 = move-exception
            com.whatsapp.util.Log.w(r5, r0)
        L_0x0196:
            if (r3 == 0) goto L_0x01af
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG
            r0 = 80
            r3.compress(r1, r0, r2)
            byte[] r0 = r2.toByteArray()
            r2.close()     // Catch:{ IOException -> 0x01ab }
        L_0x01ab:
            r3.recycle()
            return r0
        L_0x01af:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50332ka.A00(X.0ww, X.13E, double, double, int):byte[]");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x017c  */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r24) {
        /*
            r23 = this;
            r3 = r23
            android.location.Location r0 = r3.A03
            if (r0 != 0) goto L_0x004e
            X.19m r0 = r3.A07
            if (r0 == 0) goto L_0x0048
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x0048
            X.0yE r0 = r3.A0B
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x0048
            r2 = 0
        L_0x0019:
            boolean r0 = r3.A04
            if (r0 != 0) goto L_0x004a
            r0 = 40
            if (r2 >= r0) goto L_0x0029
            r0 = 250(0xfa, double:1.235E-321)
            android.os.SystemClock.sleep(r0)
            int r2 = r2 + 1
            goto L_0x0019
        L_0x0029:
            android.location.Location r2 = r3.A01
            if (r2 == 0) goto L_0x0043
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MapDownload/doInBackground/using coarseLocation "
            r1.append(r0)
            float r0 = r2.getAccuracy()
            r1.append(r0)
            X.C36411kG.A1P(r1)
            android.location.Location r0 = r3.A01
            goto L_0x004c
        L_0x0043:
            java.lang.String r0 = "MapDownload/doInBackground/failed to get location"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0048:
            r0 = 0
            goto L_0x0068
        L_0x004a:
            android.location.Location r0 = r3.A02
        L_0x004c:
            r3.A03 = r0
        L_0x004e:
            X.13E r5 = r3.A0F
            X.0ww r4 = r3.A08
            double r6 = r0.getLatitude()
            android.location.Location r0 = r3.A03
            double r8 = r0.getLongitude()
            int r10 = r3.A00
            byte[] r1 = A00(r4, r5, r6, r8, r10)
            X.2bL r0 = r3.A0H
            r0.A1C(r1)
            r0 = 1
        L_0x0068:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r16 = r0.booleanValue()
            X.2bL r5 = r3.A0H
            if (r16 == 0) goto L_0x00f3
            r0 = 2
            r5.A02 = r0
            android.location.Location r0 = r3.A03
            double r0 = r0.getLatitude()
            r5.A00 = r0
            android.location.Location r0 = r3.A03
            double r0 = r0.getLongitude()
            r5.A01 = r0
        L_0x0087:
            boolean r0 = r5 instanceof X.C46902br
            if (r0 == 0) goto L_0x0269
            X.0wo r0 = r3.A0A
            long r8 = X.C19970wo.A00(r0)
            long r6 = r5.A0I
            X.2br r5 = (X.C46902br) r5
            int r0 = r5.A00
            long r0 = X.C36371kC.A07(r0)
            long r6 = r6 + r0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0267
            if (r16 == 0) goto L_0x0269
            android.location.Location r4 = r3.A03
            X.3Qa r11 = r5.A1J
            X.11F r2 = r11.A00
            boolean r0 = r2 instanceof X.AnonymousClass144
            if (r0 == 0) goto L_0x00f1
            X.0wN r1 = r3.A06
            X.1FN r0 = r3.A0E
            java.util.HashSet r0 = r0.A00(r11)
            java.util.Set r8 = X.AnonymousClass143.A09(r1, r0)
        L_0x00b8:
            X.1P5 r3 = r3.A0G
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "LocationSharingManager/setShareLocation; message.key="
            r1.append(r0)
            r1.append(r11)
            java.lang.String r10 = "; expiration="
            X.C36321k7.A1V(r10, r1, r6)
            java.util.ArrayList r13 = X.AnonymousClass001.A0I()
            boolean r0 = X.AnonymousClass143.A0G(r2)
            if (r0 == 0) goto L_0x00f7
            if (r8 == 0) goto L_0x0110
            java.util.Iterator r8 = r8.iterator()
        L_0x00db:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0110
            X.11F r1 = X.C36401kF.A0a(r8)
            X.0wQ r0 = r3.A07
            boolean r0 = r0.A0M(r1)
            if (r0 != 0) goto L_0x00db
            r13.add(r1)
            goto L_0x00db
        L_0x00f1:
            r8 = 0
            goto L_0x00b8
        L_0x00f3:
            r0 = 0
            r5.A02 = r0
            goto L_0x0087
        L_0x00f7:
            boolean r0 = r2 instanceof X.C177618e5
            if (r0 == 0) goto L_0x0109
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "LocationSharingManager/setShareLocation/can't share location with broadcast remote_resource; messageKey="
            X.C36321k7.A1L(r11, r0, r1)
        L_0x0104:
            r3.A0U(r4)
            goto L_0x0269
        L_0x0109:
            com.whatsapp.jid.UserJid r0 = X.C36401kF.A0b(r2)
            r13.add(r0)
        L_0x0110:
            X.1P7 r14 = r3.A0J
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x0185
            boolean r0 = X.AnonymousClass1P7.A00(r14)
            if (r0 != 0) goto L_0x0185
            X.0yC r1 = r14.A01
            r0 = 4718(0x126e, float:6.611E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0185
            java.lang.String r0 = "LocationSharingManager/convertToLidsIfNeeded"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()
            java.util.ArrayList r12 = X.AnonymousClass001.A0I()
            java.util.Iterator r8 = r13.iterator()
        L_0x0139:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x014b
            java.lang.Object r1 = r8.next()
            boolean r0 = r1 instanceof X.C223313w
            if (r0 == 0) goto L_0x0139
            r12.add(r1)
            goto L_0x0139
        L_0x014b:
            r9.addAll(r12)
            java.util.ArrayList r12 = X.AnonymousClass001.A0I()
            java.util.Iterator r8 = r13.iterator()
        L_0x0156:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0168
            java.lang.Object r1 = r8.next()
            boolean r0 = r1 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x0156
            r12.add(r1)
            goto L_0x0156
        L_0x0168:
            X.12O r0 = r14.A00
            java.util.LinkedHashMap r0 = r0.A0E(r12)
            java.util.Collection r8 = r0.values()
            int r1 = r8.size()
            int r0 = r12.size()
            if (r1 == r0) goto L_0x0181
            java.lang.String r0 = "LiveLocationManager/convertToLidsIfNeeded/lidUserJidList size mismatch"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0181:
            r9.addAll(r8)
            r13 = r9
        L_0x0185:
            java.lang.Object r8 = r3.A0R
            monitor-enter(r8)
            java.util.Map r9 = X.AnonymousClass1P5.A06(r3)     // Catch:{ all -> 0x0264 }
            java.lang.Object r12 = r9.get(r2)     // Catch:{ all -> 0x0264 }
            X.38X r12 = (X.AnonymousClass38X) r12     // Catch:{ all -> 0x0264 }
            if (r12 == 0) goto L_0x01c3
            X.3Qa r1 = r12.A02     // Catch:{ all -> 0x0264 }
            boolean r0 = r1.equals(r11)     // Catch:{ all -> 0x0264 }
            if (r0 == 0) goto L_0x01a8
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0264 }
            java.lang.String r0 = "LocationSharingManager/setShareLocation/already enabled for this message; messageKey="
            X.C36321k7.A1K(r11, r0, r1)     // Catch:{ all -> 0x0264 }
            monitor-exit(r8)     // Catch:{ all -> 0x0264 }
            goto L_0x0104
        L_0x01a8:
            r9.remove(r2)     // Catch:{ all -> 0x0264 }
            X.2br r0 = X.AnonymousClass1P5.A03(r3, r1)     // Catch:{ all -> 0x0264 }
            if (r0 == 0) goto L_0x01b4
            X.AnonymousClass1P5.A0E(r3, r0)     // Catch:{ all -> 0x0264 }
        L_0x01b4:
            X.1P9 r14 = r3.A0K     // Catch:{ all -> 0x0264 }
            java.util.List r12 = java.util.Collections.singletonList(r12)     // Catch:{ all -> 0x0264 }
            X.0wo r0 = r3.A0D     // Catch:{ all -> 0x0264 }
            long r0 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x0264 }
            r14.A07(r12, r0)     // Catch:{ all -> 0x0264 }
        L_0x01c3:
            long r0 = X.AnonymousClass1P5.A00(r3)     // Catch:{ all -> 0x0264 }
            r5.A01 = r0     // Catch:{ all -> 0x0264 }
            X.38X r0 = new X.38X     // Catch:{ all -> 0x0264 }
            r0.<init>(r11, r13, r6)     // Catch:{ all -> 0x0264 }
            r9.put(r2, r0)     // Catch:{ all -> 0x0264 }
            X.1P9 r14 = r3.A0K     // Catch:{ all -> 0x0264 }
            X.C18740tg.A06(r2)     // Catch:{ all -> 0x0264 }
            java.lang.String r12 = r11.A01     // Catch:{ all -> 0x0264 }
            java.util.ArrayList r9 = X.C36401kF.A0v(r13)     // Catch:{ all -> 0x0264 }
            java.util.Iterator r15 = r13.iterator()     // Catch:{ all -> 0x0264 }
        L_0x01e0:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x0264 }
            if (r0 == 0) goto L_0x0208
            java.lang.Object r13 = r15.next()     // Catch:{ all -> 0x0264 }
            X.C18740tg.A06(r13)     // Catch:{ all -> 0x0264 }
            com.whatsapp.jid.UserJid r13 = (com.whatsapp.jid.UserJid) r13     // Catch:{ all -> 0x0264 }
            r0 = 1
            X.3Qa r1 = new X.3Qa     // Catch:{ all -> 0x0264 }
            r1.<init>(r2, r12, r0)     // Catch:{ all -> 0x0264 }
            X.3Nl r0 = new X.3Nl     // Catch:{ all -> 0x0264 }
            r20 = r1
            r21 = r6
            r18 = r2
            r19 = r13
            r17 = r0
            r17.<init>(r18, r19, r20, r21)     // Catch:{ all -> 0x0264 }
            r9.add(r0)     // Catch:{ all -> 0x0264 }
            goto L_0x01e0
        L_0x0208:
            r14.A08(r9)     // Catch:{ all -> 0x0264 }
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0264 }
            java.lang.String r0 = "LocationSharingManager/setShareLocation; saved sharing; message.key="
            r9.append(r0)     // Catch:{ all -> 0x0264 }
            r9.append(r11)     // Catch:{ all -> 0x0264 }
            r9.append(r10)     // Catch:{ all -> 0x0264 }
            r9.append(r6)     // Catch:{ all -> 0x0264 }
            java.lang.String r0 = "; sequenceNumber="
            r9.append(r0)     // Catch:{ all -> 0x0264 }
            long r0 = r5.A01     // Catch:{ all -> 0x0264 }
            X.C36351kA.A1S(r9, r0)     // Catch:{ all -> 0x0264 }
            monitor-exit(r8)     // Catch:{ all -> 0x0264 }
            X.005 r0 = r3.A0N
            java.lang.Object r0 = r0.get()
            X.0xM r0 = (X.C20310xM) r0
            r0.A0k(r5)
            X.AnonymousClass1P5.A0C(r3)
            X.0wG r0 = r3.A0E
            android.content.Context r0 = r0.A00
            com.whatsapp.location.LocationSharingService.A02(r0, r3)
            java.util.List r0 = r3.A0T
            java.util.Iterator r1 = r0.iterator()
        L_0x0243:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0256
            java.lang.Object r0 = r1.next()
            X.4TK r0 = (X.AnonymousClass4TK) r0
            X.C18740tg.A06(r2)
            r0.BhI(r2)
            goto L_0x0243
        L_0x0256:
            android.os.Handler r2 = r3.A06
            r1 = 34
            X.1j9 r0 = new X.1j9
            r0.<init>(r3, r5, r1)
            r2.post(r0)
            goto L_0x0104
        L_0x0264:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0264 }
            throw r0
        L_0x0267:
            r16 = 1
        L_0x0269:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r16)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50332ka.A08(java.lang.Object[]):java.lang.Object");
    }

    public C50332ka(C19700wN r7, C237019m r8, C20050ww r9, AnonymousClass1G5 r10, C19970wo r11, C20830yE r12, C20310xM r13, AnonymousClass16J r14, AnonymousClass1FN r15, AnonymousClass13E r16, AnonymousClass1P5 r17, AnonymousClass2bL r18) {
        this.A0A = r11;
        this.A08 = r9;
        AnonymousClass2bL r3 = r18;
        this.A0H = r3;
        this.A06 = r7;
        this.A0C = r13;
        this.A0D = r14;
        this.A0F = r16;
        this.A0B = r12;
        this.A0E = r15;
        this.A0G = r17;
        this.A09 = r10;
        if (r3.A00 == 0.0d || r3.A01 == 0.0d) {
            this.A07 = r8;
            return;
        }
        Location location = new Location("");
        this.A03 = location;
        location.setLatitude(r3.A00);
        this.A03.setLongitude(r3.A01);
        this.A03.setTime(r3.A0I);
        this.A04 = true;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        if (AnonymousClass000.A1X(obj)) {
            this.A0C.A0n(this.A0H, 4);
        } else {
            AnonymousClass16J r0 = this.A0D;
            AnonymousClass2bL r3 = this.A0H;
            r0.A05(r3, -1);
            C237019m r1 = this.A07;
            if (r1 != null) {
                AnonymousClass1G6 A002 = this.A09.A00();
                C20830yE r4 = this.A0B;
                if (!r4.A05()) {
                    if (A002.A01(r3.A1J.A00)) {
                        RequestPermissionActivity.A0B.A0H((Activity) A002.A00(), r4, R.string.f12nameremoved, R.string.f12nameremoved, -1);
                    }
                } else if (!r1.A07()) {
                    AnonymousClass11F r12 = r3.A1J.A00;
                    if (A002.A01(r12)) {
                        AnonymousClass3SJ.A01((Activity) A002.A00(), 2);
                    } else {
                        ArrayList arrayList = C56772wr.A01;
                        C18740tg.A06(r12);
                        arrayList.add(r12);
                    }
                }
            }
        }
        C237019m r02 = this.A07;
        if (r02 != null) {
            r02.A05(this);
        }
    }

    public void onLocationChanged(Location location) {
        System.currentTimeMillis();
        location.getTime();
        location.getAccuracy();
        if (AnonymousClass1P6.A01(location, this.A01)) {
            this.A01 = location;
        }
        int i = this.A05 + 1;
        this.A05 = i;
        if (i >= 2 || location.getAccuracy() < 80.0f) {
            this.A02 = location;
            this.A04 = true;
        }
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }
}
