package X;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;

/* renamed from: X.7rJ  reason: invalid class name and case insensitive filesystem */
public class C164127rJ implements SensorEventListener {
    public Object A00;
    public final int A01;

    public C164127rJ(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0243, code lost:
        if (r5 != 3) goto L_0x0245;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0119, code lost:
        if (r3 != 3) goto L_0x011b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSensorChanged(android.hardware.SensorEvent r19) {
        /*
            r18 = this;
            r1 = r18
            int r0 = r1.A01
            r7 = r19
            if (r0 == 0) goto L_0x0155
            java.lang.Object r4 = r1.A00
            X.5B9 r4 = (X.AnonymousClass5B9) r4
            X.6Fs r0 = r4.A08
            if (r0 == 0) goto L_0x0275
            android.location.Location r0 = r4.A06
            if (r0 == 0) goto L_0x0275
            r8 = 0
            r5 = 3
            float[] r1 = r4.A0F     // Catch:{ IllegalArgumentException -> 0x001e }
            float[] r0 = r7.values     // Catch:{ IllegalArgumentException -> 0x001e }
            android.hardware.SensorManager.getRotationMatrixFromVector(r1, r0)     // Catch:{ IllegalArgumentException -> 0x001e }
            goto L_0x002d
        L_0x001e:
            float[] r2 = r7.values
            int r0 = r2.length
            if (r0 <= r5) goto L_0x002d
            float[] r1 = r4.A0E
            java.lang.System.arraycopy(r2, r8, r1, r8, r5)
            float[] r0 = r4.A0F
            android.hardware.SensorManager.getRotationMatrixFromVector(r0, r1)
        L_0x002d:
            android.view.Display r0 = r4.A07
            int r3 = r0.getRotation()
            long r6 = java.lang.System.currentTimeMillis()
            android.location.Location r0 = r4.A06
            long r0 = r0.getTime()
            long r6 = r6 - r0
            r1 = 5000(0x1388, double:2.4703E-320)
            r11 = 0
            r9 = 2
            r10 = 1
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0104
            android.location.Location r0 = r4.A06
            boolean r0 = r0.hasBearing()
            if (r0 == 0) goto L_0x0104
            android.location.Location r0 = r4.A06
            float r0 = r0.getSpeed()
            double r0 = (double) r0
            r6 = 4606228376254955242(0x3fec9c4da9003eea, double:0.89408)
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x0104
            android.location.Location r0 = r4.A06
            float r2 = r0.getBearing()
        L_0x0065:
            float r11 = r4.A00
            long r7 = java.lang.System.currentTimeMillis()
            long r5 = r4.A04
            long r0 = r7 - r5
            float r5 = (float) r0
            r0 = 1137180672(0x43c80000, float:400.0)
            float r5 = r5 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x007b
            r5 = 1065353216(0x3f800000, float:1.0)
        L_0x007b:
            r4.A04 = r7
            float r6 = r2 - r11
            float r1 = java.lang.Math.abs(r6)
            r0 = 1127481344(0x43340000, float:180.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00e1
            r0 = 1114636288(0x42700000, float:60.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0092
            float r5 = r5 * r6
            float r2 = r11 + r5
        L_0x0092:
            r4.A00 = r2
            if (r3 == 0) goto L_0x00d0
            if (r3 == r9) goto L_0x00d0
            float[] r0 = r4.A0G
            r0 = r0[r9]
            double r0 = (double) r0
            double r0 = java.lang.Math.toDegrees(r0)
            double r1 = java.lang.Math.abs(r0)
            float r0 = (float) r1
            r4.A02 = r0
        L_0x00a8:
            int r0 = r4.A03
            if (r0 != 0) goto L_0x0275
            boolean r0 = r4.A0A
            if (r0 != 0) goto L_0x0275
            android.location.Location r0 = r4.A06
            double r2 = r0.getLatitude()
            android.location.Location r0 = r4.A06
            double r0 = r0.getLongitude()
            com.google.android.gms.maps.model.LatLng r0 = X.C90524aI.A0F(r2, r0)
            com.google.android.gms.maps.model.CameraPosition r0 = X.C92744eX.A00(r0, r4)
            X.6Fs r2 = r4.A08
            X.5iH r1 = X.AnonymousClass6UP.A00(r0)
            X.7iq r0 = r4.A0D
            r2.A0B(r1, r0)
            return
        L_0x00d0:
            float[] r0 = r4.A0G
            r0 = r0[r10]
            double r0 = (double) r0
            double r0 = java.lang.Math.toDegrees(r0)
            double r1 = java.lang.Math.abs(r0)
            float r0 = (float) r1
            r4.A02 = r0
            goto L_0x00a8
        L_0x00e1:
            r12 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r0 = (double) r1
            double r12 = r12 - r0
            r6 = 4633641066610819072(0x404e000000000000, double:60.0)
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x0092
            r1 = 1135869952(0x43b40000, float:360.0)
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x00fd
            float r2 = r2 + r1
            float r2 = r2 - r11
            float r2 = r2 % r1
            float r5 = r5 * r2
            float r11 = r11 + r5
        L_0x00f9:
            float r11 = r11 + r1
            float r2 = r11 % r1
            goto L_0x0092
        L_0x00fd:
            float r0 = r1 - r2
            float r0 = r0 + r11
            float r0 = r0 % r1
            float r5 = r5 * r0
            float r11 = r11 - r5
            goto L_0x00f9
        L_0x0104:
            float[] r1 = r4.A0F
            float[] r0 = r4.A0G
            android.hardware.SensorManager.getOrientation(r1, r0)
            r0 = r0[r8]
            double r0 = (double) r0
            double r0 = java.lang.Math.toDegrees(r0)
            float r2 = (float) r0
            if (r3 == r10) goto L_0x014e
            if (r3 == r9) goto L_0x0151
            r0 = 1132920832(0x43870000, float:270.0)
            if (r3 == r5) goto L_0x0153
        L_0x011b:
            r5 = 1135869952(0x43b40000, float:360.0)
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x0122
            float r2 = r2 + r5
        L_0x0122:
            android.location.Location r0 = r4.A06
            double r0 = r0.getLatitude()
            float r12 = (float) r0
            android.location.Location r0 = r4.A06
            double r0 = r0.getLongitude()
            float r13 = (float) r0
            android.location.Location r0 = r4.A06
            double r0 = r0.getAltitude()
            float r14 = (float) r0
            android.location.Location r0 = r4.A06
            long r15 = r0.getTime()
            android.hardware.GeomagneticField r11 = new android.hardware.GeomagneticField
            r11.<init>(r12, r13, r14, r15)
            float r0 = r11.getDeclination()
            float r2 = r2 + r0
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0065
            float r2 = r2 - r5
            goto L_0x0065
        L_0x014e:
            r0 = 1119092736(0x42b40000, float:90.0)
            goto L_0x0153
        L_0x0151:
            r0 = 1127481344(0x43340000, float:180.0)
        L_0x0153:
            float r2 = r2 + r0
            goto L_0x011b
        L_0x0155:
            java.lang.Object r3 = r1.A00
            X.5B8 r3 = (X.AnonymousClass5B8) r3
            double r0 = X.C92794ej.A0n
            X.7eQ r0 = r3.A0E
            X.6jV r2 = r3.A0J(r0)
            if (r2 == 0) goto L_0x0275
            android.location.Location r11 = r3.getMyLocation()
            if (r11 == 0) goto L_0x0275
            r4 = 0
            r6 = 3
            float[] r1 = r3.A0G     // Catch:{ IllegalArgumentException -> 0x0173 }
            float[] r0 = r7.values     // Catch:{ IllegalArgumentException -> 0x0173 }
            android.hardware.SensorManager.getRotationMatrixFromVector(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0173 }
            goto L_0x0182
        L_0x0173:
            float[] r5 = r7.values
            int r0 = r5.length
            if (r0 <= r6) goto L_0x0182
            float[] r1 = r3.A0F
            java.lang.System.arraycopy(r5, r4, r1, r4, r6)
            float[] r0 = r3.A0G
            android.hardware.SensorManager.getRotationMatrixFromVector(r0, r1)
        L_0x0182:
            android.view.Display r0 = r3.A05
            int r5 = r0.getRotation()
            long r9 = java.lang.System.currentTimeMillis()
            long r0 = r11.getTime()
            long r9 = r9 - r0
            r7 = 5000(0x1388, double:2.4703E-320)
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x022a
            boolean r0 = r11.hasBearing()
            if (r0 == 0) goto L_0x022a
            float r0 = r11.getSpeed()
            double r7 = (double) r0
            r9 = 4606228376254955242(0x3fec9c4da9003eea, double:0.89408)
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x022a
            float r6 = r11.getBearing()
        L_0x01af:
            float r9 = r3.A00
            long r7 = java.lang.System.currentTimeMillis()
            long r4 = r3.A03
            long r0 = r7 - r4
            float r10 = (float) r0
            r0 = 1137180672(0x43c80000, float:400.0)
            float r10 = r10 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x01c5
            r10 = 1065353216(0x3f800000, float:1.0)
        L_0x01c5:
            r3.A03 = r7
            float r4 = r6 - r9
            float r1 = java.lang.Math.abs(r4)
            r0 = 1127481344(0x43340000, float:180.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0207
            r0 = 1114636288(0x42700000, float:60.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x01dc
            float r10 = r10 * r4
            float r6 = r9 + r10
        L_0x01dc:
            r3.A00 = r6
            int r0 = r3.A02
            if (r0 != 0) goto L_0x0275
            X.6bv r5 = X.C134976bv.A01(r11)
            X.62T r4 = new X.62T
            r4.<init>()
            float r0 = r3.A00
            r4.A00 = r0
            float r1 = r3.A01
            r0 = 1097859072(0x41700000, float:15.0)
            float r0 = java.lang.Math.max(r1, r0)
            r4.A01 = r0
            r4.A02 = r5
            X.6bx r0 = r4.A00()
            X.64g r0 = X.AnonymousClass6GS.A00(r0)
            r2.A09(r0)
            return
        L_0x0207:
            r7 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r0 = (double) r1
            double r7 = r7 - r0
            r4 = 4633641066610819072(0x404e000000000000, double:60.0)
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x01dc
            r1 = 1135869952(0x43b40000, float:360.0)
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0223
            float r6 = r6 + r1
            float r6 = r6 - r9
            float r6 = r6 % r1
            float r10 = r10 * r6
            float r9 = r9 + r10
        L_0x021f:
            float r9 = r9 + r1
            float r6 = r9 % r1
            goto L_0x01dc
        L_0x0223:
            float r0 = r1 - r6
            float r0 = r0 + r9
            float r0 = r0 % r1
            float r10 = r10 * r0
            float r9 = r9 - r10
            goto L_0x021f
        L_0x022a:
            float[] r1 = r3.A0G
            float[] r0 = r3.A0H
            android.hardware.SensorManager.getOrientation(r1, r0)
            r0 = r0[r4]
            double r0 = (double) r0
            double r0 = java.lang.Math.toDegrees(r0)
            float r4 = (float) r0
            r1 = 1
            r0 = 1119092736(0x42b40000, float:90.0)
            if (r5 == r1) goto L_0x0273
            r0 = 2
            if (r5 == r0) goto L_0x0271
            r0 = 1132920832(0x43870000, float:270.0)
            if (r5 == r6) goto L_0x0273
        L_0x0245:
            r0 = 0
            r5 = 1135869952(0x43b40000, float:360.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x024d
            float r4 = r4 + r5
        L_0x024d:
            double r0 = r11.getLatitude()
            float r13 = (float) r0
            double r0 = r11.getLongitude()
            float r14 = (float) r0
            double r0 = r11.getAltitude()
            float r15 = (float) r0
            long r16 = r11.getTime()
            android.hardware.GeomagneticField r12 = new android.hardware.GeomagneticField
            r12.<init>(r13, r14, r15, r16)
            float r6 = r12.getDeclination()
            float r6 = r6 + r4
            int r0 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x01af
            float r6 = r6 - r5
            goto L_0x01af
        L_0x0271:
            r0 = 1127481344(0x43340000, float:180.0)
        L_0x0273:
            float r4 = r4 + r0
            goto L_0x0245
        L_0x0275:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C164127rJ.onSensorChanged(android.hardware.SensorEvent):void");
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }
}
