package X;

import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod;
import com.facebook.cameracore.ardelivery.model.EffectAssetType;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import java.nio.ByteBuffer;
import java.util.Objects;

/* renamed from: X.6VA  reason: invalid class name */
public class AnonymousClass6VA {
    public VersionedCapability A00;
    public final int A01;
    public final ARAssetType A02;
    public final ARRequestAsset$CompressionMethod A03;
    public final EffectAssetType A04;
    public final AnonymousClass5TN A05;
    public final C108425Tl A06;
    public final Boolean A07;
    public final Boolean A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;

    public static void A01(String str, ByteBuffer byteBuffer) {
        if (str == null) {
            byteBuffer.putInt(-1);
            return;
        }
        byteBuffer.putInt(str.getBytes().length);
        byteBuffer.put(str.getBytes());
    }

    public int A02() {
        if (C36361kB.A1a(this.A02, ARAssetType.SUPPORT)) {
            return this.A01;
        }
        throw AnonymousClass001.A09("Cannot get Version from Effect Asset");
    }

    public VersionedCapability A03() {
        if (C36361kB.A1a(this.A02, ARAssetType.SUPPORT)) {
            return this.A00;
        }
        throw AnonymousClass001.A09("Cannot get VersionedCapability from Effect Asset");
    }

    public String A04() {
        ARAssetType aRAssetType = this.A02;
        int ordinal = aRAssetType.ordinal();
        if (ordinal == 0) {
            EffectAssetType effectAssetType = this.A04;
            if (effectAssetType == null) {
                return null;
            }
            return effectAssetType.name();
        } else if (ordinal == 1) {
            VersionedCapability versionedCapability = this.A00;
            Objects.requireNonNull(versionedCapability);
            return versionedCapability.toServerValue();
        } else if (ordinal == 2 || ordinal == 3) {
            AnonymousClass5TN r0 = this.A05;
            Objects.requireNonNull(r0);
            return r0.toString();
        } else {
            StringBuilder A0u = AnonymousClass000.A0u();
            throw AnonymousClass000.A0g(C90494aF.A0c(aRAssetType, "Unsupported asset type: ", A0u), A0u);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01b6, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01b7, code lost:
        r4 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r6 = com.facebook.cameracore.ardelivery.model.VersionedCapability.fromServerValue(r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:70:0x00fe */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01b6 A[ExcHandler: IllegalArgumentException | IllegalStateException | BufferUnderflowException (e java.lang.Throwable), PHI: r2 
      PHI: (r2v5 java.lang.String) = (r2v4 java.lang.String), (r2v7 java.lang.String), (r2v6 java.lang.String), (r2v6 java.lang.String) binds: [B:9:0x0031, B:80:0x0123, B:25:0x0068, B:70:0x00fe] A[DONT_GENERATE, DONT_INLINE], Splitter:B:9:0x0031] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass6VA(java.nio.ByteBuffer r9) {
        /*
            r8 = this;
            r8.<init>()
            int r5 = r9.remaining()
            r4 = 0
            long r2 = r9.getLong()     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b0 }
            r6 = 7310021016723351138(0x65726962726f6662, double:4.774966457081997E180)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x01a1
            java.lang.String r1 = A00(r9)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b0 }
            java.util.Objects.requireNonNull(r1)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b0 }
            r8.A0A = r1     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b2 }
            java.lang.String r6 = A00(r9)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b2 }
            r8.A0B = r6     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x019d }
            java.lang.String r6 = A00(r9)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x019d }
            r8.A0C = r6     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x019d }
            java.lang.String r2 = A00(r9)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x019d }
            java.util.Objects.requireNonNull(r2)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x019d }
            com.facebook.cameracore.ardelivery.model.ARAssetType r7 = com.facebook.cameracore.ardelivery.model.ARAssetType.valueOf(r2)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            r8.A02 = r7     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            java.lang.String r2 = A00(r9)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            int r6 = r7.ordinal()     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            r3 = 0
            if (r6 == r3) goto L_0x0105
            r0 = 1
            if (r6 == r0) goto L_0x0066
            r0 = 2
            if (r6 == r0) goto L_0x005a
            r0 = 3
            if (r6 == r0) goto L_0x005a
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            java.lang.String r0 = "Illegal asset type: "
            java.lang.String r0 = X.C90494aF.A0c(r7, r0, r3)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0g(r0, r3)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            throw r0     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
        L_0x005a:
            if (r2 != 0) goto L_0x0061
            r7 = r4
        L_0x005d:
            r6 = r4
            r0 = r4
            goto L_0x0110
        L_0x0061:
            X.5TN r7 = X.AnonymousClass5TN.valueOf(r2)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            goto L_0x005d
        L_0x0066:
            java.lang.String r0 = "AML_FACE_TRACKER"
            boolean r0 = r2.equals(r0)     // Catch:{ IllegalArgumentException -> 0x00fe, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            if (r0 == 0) goto L_0x007b
            java.lang.Integer r0 = X.C023109s.A00     // Catch:{ IllegalArgumentException -> 0x00fe, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
        L_0x0070:
            int r0 = r0.intValue()     // Catch:{ IllegalArgumentException -> 0x00fe, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            switch(r0) {
                case 0: goto L_0x00f6;
                case 1: goto L_0x00ea;
                case 2: goto L_0x00f3;
                case 3: goto L_0x00f0;
                case 4: goto L_0x00ed;
                case 5: goto L_0x00e7;
                case 6: goto L_0x00e4;
                case 7: goto L_0x00e1;
                case 8: goto L_0x00de;
                default: goto L_0x0077;
            }     // Catch:{ IllegalArgumentException -> 0x00fe, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
        L_0x0077:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r6 = com.facebook.cameracore.ardelivery.model.VersionedCapability.BiBytedoc     // Catch:{ IllegalArgumentException -> 0x00fe, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            goto L_0x0102
        L_0x007b:
            java.lang.String r0 = "TARGET_RECOGNITION"
            boolean r0 = r2.equals(r0)     // Catch:{ IllegalArgumentException -> 0x00fe, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            if (r0 == 0) goto L_0x0086
            java.lang.Integer r0 = X.C023109s.A01     // Catch:{ IllegalArgumentException -> 0x00fe, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            goto L_0x0070
        L_0x0086:
            java.lang.String r0 = "SEGMENTATION"
            boolean r0 = r2.equals(r0)     // Catch:{ IllegalArgumentException -> 0x00fe, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            if (r0 == 0) goto L_0x0091
            java.lang.Integer r0 = X.C023109s.A0C     // Catch:{ IllegalArgumentException -> 0x00fe, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            goto L_0x0070
        L_0x0091:
            java.lang.String r0 = "HAIR_SEGMENTATION"
            boolean r0 = r2.equals(r0)     // Catch:{ IllegalArgumentException -> 0x00fe, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            if (r0 == 0) goto L_0x009c
            java.lang.Integer r0 = X.C023109s.A0G     // Catch:{ IllegalArgumentException -> 0x00fe, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            goto L_0x0070
        L_0x009c:
            java.lang.String r0 = "HAND_TRACKING"
            boolean r0 = r2.equals(r0)     // Catch:{ IllegalArgumentException -> 0x00fe, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            if (r0 == 0) goto L_0x00a7
            java.lang.Integer r0 = X.C023109s.A0R     // Catch:{ IllegalArgumentException -> 0x00fe, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            goto L_0x0070
        L_0x00a7:
            java.lang.String r0 = "XRAY"
            boolean r0 = r2.equals(r0)     // Catch:{ IllegalArgumentException -> 0x00fe, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            if (r0 == 0) goto L_0x00b2
            java.lang.Integer r0 = X.C023109s.A0S     // Catch:{ IllegalArgumentException -> 0x00fe, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            goto L_0x0070
        L_0x00b2:
            java.lang.String r0 = "M_SUGGESTIONS_CORE"
            boolean r0 = r2.equals(r0)     // Catch:{ IllegalArgumentException -> 0x00fe, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            if (r0 == 0) goto L_0x00bd
            java.lang.Integer r0 = X.C023109s.A0V     // Catch:{ IllegalArgumentException -> 0x00fe, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            goto L_0x0070
        L_0x00bd:
            java.lang.String r0 = "FITTED_EXPRESSION_TRACKER"
            boolean r0 = r2.equals(r0)     // Catch:{ IllegalArgumentException -> 0x00fe, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            if (r0 == 0) goto L_0x00c8
            java.lang.Integer r0 = X.C023109s.A0W     // Catch:{ IllegalArgumentException -> 0x00fe, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            goto L_0x0070
        L_0x00c8:
            java.lang.String r0 = "GAZE_CORRECTION"
            boolean r0 = r2.equals(r0)     // Catch:{ IllegalArgumentException -> 0x00fe, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            if (r0 == 0) goto L_0x00d3
            java.lang.Integer r0 = X.C023109s.A0X     // Catch:{ IllegalArgumentException -> 0x00fe, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            goto L_0x0070
        L_0x00d3:
            java.lang.String r0 = "BI_BYTEDOC"
            boolean r0 = r2.equals(r0)     // Catch:{ IllegalArgumentException -> 0x00fe, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            if (r0 == 0) goto L_0x00f9
            java.lang.Integer r0 = X.C023109s.A0Y     // Catch:{ IllegalArgumentException -> 0x00fe, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            goto L_0x0070
        L_0x00de:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r6 = com.facebook.cameracore.ardelivery.model.VersionedCapability.GazeCorrection     // Catch:{ IllegalArgumentException -> 0x00fe, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            goto L_0x0102
        L_0x00e1:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r6 = com.facebook.cameracore.ardelivery.model.VersionedCapability.FaceExpressionFitting     // Catch:{ IllegalArgumentException -> 0x00fe, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            goto L_0x0102
        L_0x00e4:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r6 = com.facebook.cameracore.ardelivery.model.VersionedCapability.MSuggestionsCore     // Catch:{ IllegalArgumentException -> 0x00fe, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            goto L_0x0102
        L_0x00e7:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r6 = com.facebook.cameracore.ardelivery.model.VersionedCapability.XRay     // Catch:{ IllegalArgumentException -> 0x00fe, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            goto L_0x0102
        L_0x00ea:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r6 = com.facebook.cameracore.ardelivery.model.VersionedCapability.TargetRecognition     // Catch:{ IllegalArgumentException -> 0x00fe, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            goto L_0x0102
        L_0x00ed:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r6 = com.facebook.cameracore.ardelivery.model.VersionedCapability.HandTracker     // Catch:{ IllegalArgumentException -> 0x00fe, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            goto L_0x0102
        L_0x00f0:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r6 = com.facebook.cameracore.ardelivery.model.VersionedCapability.HairSegmentation     // Catch:{ IllegalArgumentException -> 0x00fe, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            goto L_0x0102
        L_0x00f3:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r6 = com.facebook.cameracore.ardelivery.model.VersionedCapability.Segmentation     // Catch:{ IllegalArgumentException -> 0x00fe, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            goto L_0x0102
        L_0x00f6:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r6 = com.facebook.cameracore.ardelivery.model.VersionedCapability.Facetracker     // Catch:{ IllegalArgumentException -> 0x00fe, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            goto L_0x0102
        L_0x00f9:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r2)     // Catch:{ IllegalArgumentException -> 0x00fe, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x00fe, IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
        L_0x00fe:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r6 = com.facebook.cameracore.ardelivery.model.VersionedCapability.fromServerValue(r2)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
        L_0x0102:
            r7 = r4
            r0 = r4
            goto L_0x0110
        L_0x0105:
            if (r2 != 0) goto L_0x010a
            com.facebook.cameracore.ardelivery.model.EffectAssetType r0 = com.facebook.cameracore.ardelivery.model.EffectAssetType.NORMAL_EFFECT     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            goto L_0x010e
        L_0x010a:
            com.facebook.cameracore.ardelivery.model.EffectAssetType r0 = com.facebook.cameracore.ardelivery.model.EffectAssetType.valueOf(r2)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
        L_0x010e:
            r6 = r4
            r7 = r4
        L_0x0110:
            r8.A04 = r0     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            r8.A00 = r6     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            r8.A05 = r7     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            java.lang.String r6 = A00(r9)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            r8.A0D = r6     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x019d }
            java.lang.String r2 = A00(r9)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x019d }
            java.util.Objects.requireNonNull(r2)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x019d }
            com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod r0 = com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod.valueOf(r2)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            r8.A03 = r0     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            int r0 = r9.getInt()     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            r8.A01 = r0     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            boolean r0 = r9.hasRemaining()     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            if (r0 == 0) goto L_0x0163
            java.lang.String r2 = A00(r9)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            r8.A09 = r2     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
        L_0x013b:
            boolean r0 = r9.hasRemaining()     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            if (r0 == 0) goto L_0x015c
            java.lang.String r0 = A00(r9)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            r8.A08 = r0     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
        L_0x014f:
            boolean r0 = r9.hasRemaining()     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            if (r0 == 0) goto L_0x016f
            java.lang.String r2 = A00(r9)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            if (r2 != 0) goto L_0x0168
            goto L_0x0166
        L_0x015c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            r8.A08 = r0     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            goto L_0x014f
        L_0x0163:
            r8.A09 = r4     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            goto L_0x013b
        L_0x0166:
            r0 = r4
            goto L_0x016c
        L_0x0168:
            X.5Tl r0 = X.C108425Tl.valueOf(r2)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
        L_0x016c:
            r8.A06 = r0     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            goto L_0x0171
        L_0x016f:
            r8.A06 = r4     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
        L_0x0171:
            boolean r0 = r9.hasRemaining()     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            if (r0 == 0) goto L_0x0192
            java.lang.String r0 = A00(r9)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            r8.A07 = r0     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
        L_0x0185:
            boolean r0 = r9.hasRemaining()     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            if (r0 == 0) goto L_0x019a
            java.lang.String r0 = A00(r9)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            r8.A0E = r0     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            goto L_0x0199
        L_0x0192:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            r8.A07 = r0     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            goto L_0x0185
        L_0x0199:
            return
        L_0x019a:
            r8.A0E = r4     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b6 }
            return
        L_0x019d:
            r0 = move-exception
            r4 = r1
            r2 = r6
            goto L_0x01b8
        L_0x01a1:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b0 }
            java.lang.String r0 = "Invalid data: "
            java.lang.String r0 = X.C36381kD.A0z(r0, r1, r2)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b0 }
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b0 }
            throw r0     // Catch:{ IllegalArgumentException | IllegalStateException | BufferUnderflowException -> 0x01b0 }
        L_0x01b0:
            r0 = move-exception
            goto L_0x01b4
        L_0x01b2:
            r0 = move-exception
            r4 = r1
        L_0x01b4:
            r2 = r4
            goto L_0x01b8
        L_0x01b6:
            r0 = move-exception
            r4 = r1
        L_0x01b8:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = " -- ByteBuffer size:"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ", effect id:"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", error string:"
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r2, r1)
            java.io.IOException r0 = X.C90524aI.A0X(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6VA.<init>(java.nio.ByteBuffer):void");
    }

    public static String A00(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        if (i == -1) {
            return null;
        }
        if (i < 0) {
            throw AnonymousClass001.A09("read the wrong cache");
        } else if (i == 0) {
            throw AnonymousClass001.A09("the number of bytes shouldn't be 0");
        } else if (i <= 4096) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return new String(bArr);
        } else {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("trying to allocate ");
            A0u.append(i);
            throw AnonymousClass000.A0g(" bytes which exceeds the buffer limit.", A0u);
        }
    }

    public AnonymousClass6VA(ARAssetType aRAssetType, ARRequestAsset$CompressionMethod aRRequestAsset$CompressionMethod, EffectAssetType effectAssetType, AnonymousClass5TN r6, C108425Tl r7, VersionedCapability versionedCapability, Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, String str5, String str6, int i) {
        switch (aRAssetType.ordinal()) {
            case 0:
                Objects.requireNonNull(str2);
                break;
            case 1:
                if (str2 == null) {
                    Objects.requireNonNull(versionedCapability);
                    if (str4 != null) {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
                break;
            case 2:
            case 3:
                Objects.requireNonNull(r6);
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                throw C90464aC.A0P(aRAssetType, "Got unsupported type: ", AnonymousClass000.A0u());
        }
        Objects.requireNonNull(str5);
        this.A0A = str;
        this.A0B = str2;
        this.A0C = str3;
        this.A02 = aRAssetType;
        this.A00 = versionedCapability;
        if (aRAssetType != ARAssetType.EFFECT) {
            effectAssetType = null;
        } else if (effectAssetType == null) {
            effectAssetType = EffectAssetType.NORMAL_EFFECT;
        }
        this.A04 = effectAssetType;
        this.A0D = str4;
        this.A03 = aRRequestAsset$CompressionMethod;
        this.A01 = i;
        this.A09 = str5;
        this.A08 = bool;
        this.A06 = r7;
        this.A05 = r6;
        this.A07 = bool2;
        this.A0E = str6;
    }
}
