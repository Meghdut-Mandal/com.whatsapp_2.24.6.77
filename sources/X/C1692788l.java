package X;

import android.graphics.Rect;
import android.hardware.Camera;
import android.util.Log;
import java.util.Collections;
import java.util.List;

/* renamed from: X.88l  reason: invalid class name and case insensitive filesystem */
public final class C1692788l extends C201049ih implements Cloneable {
    public Rect A00;
    public Rect A01;
    public AnonymousClass9W3 A02;
    public AnonymousClass9W3 A03;
    public AnonymousClass9W3 A04;
    public AnonymousClass9W3 A05;
    public Boolean A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09 = false;
    public Double A0A;
    public Double A0B;
    public Double A0C;
    public Integer A0D;
    public Integer A0E;
    public Integer A0F = 0;
    public Integer A0G;
    public Integer A0H;
    public Integer A0I;
    public Integer A0J;
    public Integer A0K;
    public Integer A0L;
    public Integer A0M;
    public Integer A0N;
    public Integer A0O = 0;
    public Integer A0P;
    public Integer A0Q;
    public Integer A0R;
    public Long A0S;
    public String A0T;
    public List A0U;
    public List A0V;
    public Boolean A0W = false;
    public Boolean A0X = false;
    public Integer A0Y;
    public final C1692488i A0Z;
    public final Float A0a;
    public final Float A0b;
    public final String A0c;
    public final int[] A0d = C36441kJ.A1O();

    public String A09() {
        String str;
        StringBuilder A0h = C90524aI.A0h(1000);
        A0h.append("mFocusMode");
        A0h.append('=');
        A0h.append(this.A0H);
        A0h.append(",mAntibanding");
        A0h.append('=');
        A0h.append(this.A0D);
        A0h.append(",mColorEffect");
        A0h.append('=');
        A0h.append(this.A0E);
        A0h.append(",mIsAutoExposureLock");
        A0h.append('=');
        A0h.append(this.A0W);
        A0h.append(",mIsAutoWhiteBalanceLock");
        A0h.append('=');
        A0h.append(this.A0X);
        A0h.append(",mFlashMode");
        A0h.append('=');
        A0h.append(this.A0G);
        A0h.append(",mExposureCompensation");
        A0h.append('=');
        A0h.append(this.A0F);
        A0h.append(",mFocusAreas");
        A0h.append('=');
        A0h.append(C201049ih.A05(this.A0U));
        A0h.append(",mHorizontalViewAngle");
        A0h.append('=');
        A0h.append(this.A0a);
        A0h.append(",mVerticalViewAngle");
        A0h.append('=');
        A0h.append(this.A0b);
        A0h.append(",mJpegQuality");
        A0h.append('=');
        A0h.append(this.A0J);
        A0h.append(",mJpegThumbnailQuality");
        A0h.append('=');
        A0h.append(this.A0K);
        A0h.append(",mJpegThumbnailSize");
        A0h.append('=');
        AnonymousClass9W3 r0 = this.A02;
        String str2 = "null";
        if (r0 != null) {
            AnonymousClass9W3.A00(r0, A0h);
        } else {
            A0h.append(str2);
        }
        A0h.append(",mMeteringAreas");
        A0h.append('=');
        A0h.append(C201049ih.A05(this.A0V));
        A0h.append(",mPictureFormat");
        A0h.append('=');
        A0h.append(this.A0M);
        A0h.append(",mPictureSize");
        A0h.append('=');
        AnonymousClass9W3 r02 = this.A03;
        if (r02 != null) {
            AnonymousClass9W3.A00(r02, A0h);
        } else {
            A0h.append(str2);
        }
        A0h.append(",mYuvPictureSize");
        A0h.append('=');
        A0h.append(str2);
        A0h.append(",mPreviewFormat");
        A0h.append('=');
        A0h.append(this.A0N);
        A0h.append(",mPreviewFpsRange");
        A0h.append('=');
        int[] iArr = this.A0d;
        A0h.append(iArr[0]);
        A0h.append('-');
        A0h.append(iArr[1]);
        A0h.append(",mPreviewSize");
        A0h.append('=');
        AnonymousClass9W3 r03 = this.A04;
        if (r03 != null) {
            AnonymousClass9W3.A00(r03, A0h);
        } else {
            A0h.append(str2);
        }
        A0h.append(",mIsoSensitivity");
        A0h.append('=');
        A0h.append(this.A0I);
        A0h.append(",mSceneMode");
        A0h.append('=');
        A0h.append(this.A0P);
        A0h.append(",mIsVideoStabilizationEnabled");
        A0h.append('=');
        A0h.append(this.A08);
        A0h.append(",mIsPreviewStabilizationEnabled");
        A0h.append('=');
        A0h.append(false);
        A0h.append(",mVideoSize");
        A0h.append('=');
        AnonymousClass9W3 r04 = this.A05;
        if (r04 != null) {
            AnonymousClass9W3.A00(r04, A0h);
        } else {
            A0h.append(str2);
        }
        A0h.append(",mWhiteBalance");
        A0h.append('=');
        A0h.append(this.A0Q);
        A0h.append(",mZoom");
        A0h.append('=');
        A0h.append(this.A0R);
        A0h.append(",mPreviewRect");
        A0h.append("=(");
        Rect rect = this.A01;
        if (rect != null) {
            str = rect.flattenToString();
        } else {
            str = str2;
        }
        A0h.append(str);
        A0h.append(')');
        A0h.append(",mPictureRect");
        A0h.append("=(");
        Rect rect2 = this.A00;
        if (rect2 != null) {
            str2 = rect2.flattenToString();
        }
        A0h.append(str2);
        A0h.append(')');
        A0h.append(",mRecordingHint");
        A0h.append('=');
        A0h.append(this.A09);
        A0h.append(",mGpsAltitude");
        A0h.append('=');
        A0h.append(this.A0A);
        A0h.append(",mGpsLongitude");
        A0h.append('=');
        A0h.append(this.A0C);
        A0h.append(",mGpsLatitude");
        A0h.append('=');
        A0h.append(this.A0B);
        A0h.append(",mGpsProcessingMethod");
        A0h.append('=');
        A0h.append(this.A0T);
        A0h.append(",mGpsTimestamp");
        A0h.append('=');
        A0h.append(this.A0S);
        A0h.append(",mPhotoRotation");
        A0h.append('=');
        A0h.append(this.A0L);
        A0h.append(",mVideoRotation");
        A0h.append('=');
        A0h.append(this.A0Y);
        A0h.append(",mIsoSensitivity");
        A0h.append('=');
        A0h.append(this.A0I);
        A0h.append(",mSourceConfig");
        A0h.append('=');
        return AnonymousClass000.A0q(this.A0c, A0h);
    }

    public void A0A(C191289Cj r7, Object obj) {
        int i = r7.A00;
        if (i == 3) {
            this.A08 = (Boolean) obj;
        } else if (i == 27) {
            this.A0S = (Long) obj;
        } else if (i == 42) {
            this.A0T = (String) obj;
        } else if (i == 45) {
            this.A06 = (Boolean) obj;
        } else if (i == 52) {
        } else {
            if (i == 57) {
                this.A07 = (Boolean) obj;
            } else if (i != 59) {
                switch (i) {
                    case 8:
                        this.A09 = (Boolean) obj;
                        return;
                    case 9:
                        this.A0H = (Integer) obj;
                        return;
                    case 10:
                        this.A0G = (Integer) obj;
                        return;
                    case 11:
                        this.A0D = (Integer) obj;
                        return;
                    case 12:
                        this.A0E = (Integer) obj;
                        return;
                    case 13:
                        this.A0F = (Integer) obj;
                        return;
                    case 14:
                        this.A0J = (Integer) obj;
                        return;
                    case 15:
                        this.A0K = (Integer) obj;
                        return;
                    default:
                        switch (i) {
                            case 17:
                                this.A0M = (Integer) obj;
                                return;
                            case 18:
                                this.A0N = (Integer) obj;
                                return;
                            case 19:
                                this.A0O = (Integer) obj;
                                return;
                            default:
                                switch (i) {
                                    case 21:
                                        this.A0L = (Integer) obj;
                                        return;
                                    case 22:
                                        this.A0I = (Integer) obj;
                                        return;
                                    case 23:
                                        this.A0P = (Integer) obj;
                                        return;
                                    case 24:
                                        this.A0Q = (Integer) obj;
                                        return;
                                    case 25:
                                        this.A0R = (Integer) obj;
                                        return;
                                    default:
                                        Rect rect = null;
                                        switch (i) {
                                            case 30:
                                                this.A0A = (Double) obj;
                                                return;
                                            case 31:
                                                this.A0C = (Double) obj;
                                                return;
                                            case 32:
                                                this.A0B = (Double) obj;
                                                return;
                                            case 33:
                                                AnonymousClass9W3 r8 = (AnonymousClass9W3) obj;
                                                this.A04 = r8;
                                                if (r8 != null) {
                                                    rect = new Rect(0, 0, r8.A02, r8.A01);
                                                }
                                                this.A01 = rect;
                                                return;
                                            case 34:
                                                AnonymousClass9W3 r82 = (AnonymousClass9W3) obj;
                                                this.A03 = r82;
                                                if (r82 != null) {
                                                    rect = new Rect(0, 0, r82.A02, r82.A01);
                                                }
                                                this.A00 = rect;
                                                return;
                                            case 35:
                                                this.A05 = (AnonymousClass9W3) obj;
                                                return;
                                            case 36:
                                                this.A02 = (AnonymousClass9W3) obj;
                                                return;
                                            case 37:
                                                this.A0U = C196539a1.A00((List) obj);
                                                return;
                                            case 38:
                                                this.A0V = C196539a1.A00((List) obj);
                                                return;
                                            case 39:
                                                int[] iArr = (int[]) obj;
                                                if (iArr != null && iArr.length == 2) {
                                                    int[] iArr2 = this.A0d;
                                                    iArr2[0] = iArr[0];
                                                    iArr2[1] = iArr[1];
                                                    return;
                                                }
                                                return;
                                            default:
                                                throw C165567td.A0U("Cannot directly set: ", AnonymousClass000.A0u(), i);
                                        }
                                }
                        }
                }
            } else {
                this.A0Y = (Integer) obj;
            }
        }
    }

    public C1692788l(Camera.Parameters parameters, C1692488i r7) {
        List emptyList;
        int i;
        List emptyList2;
        Camera.Size size;
        AnonymousClass9W3 r0;
        Camera.Size size2;
        Double A0S2 = C90494aF.A0S();
        this.A0A = A0S2;
        this.A0C = A0S2;
        this.A0B = A0S2;
        this.A0S = C36411kG.A0t();
        this.A0L = 0;
        this.A0I = 0;
        this.A07 = false;
        this.A0Y = 0;
        this.A06 = C36371kC.A0m();
        this.A0c = parameters.flatten();
        this.A0Z = r7;
        this.A0H = Integer.valueOf(C202729mX.A03(parameters.getFocusMode()));
        this.A0D = Integer.valueOf(C202729mX.A00(parameters.getAntibanding()));
        this.A0E = Integer.valueOf(C202729mX.A01(parameters.getColorEffect()));
        if (C198429dX.A04(C198429dX.A01, r7)) {
            this.A0W = Boolean.valueOf(parameters.getAutoExposureLock());
        }
        if (C198429dX.A04(C198429dX.A04, r7)) {
            this.A0X = Boolean.valueOf(parameters.getAutoWhiteBalanceLock());
        }
        this.A0G = Integer.valueOf(C202729mX.A02(parameters.getFlashMode()));
        if (C198429dX.A04(C198429dX.A0C, r7)) {
            this.A0F = Integer.valueOf(parameters.getExposureCompensation());
        }
        if (C198429dX.A04(C198429dX.A0P, r7)) {
            Rect rect = C202799mg.A00;
            emptyList = C196539a1.A00(C202799mg.A03(parameters.get("focus-areas")));
        } else {
            emptyList = Collections.emptyList();
        }
        this.A0U = emptyList;
        this.A0a = Float.valueOf(parameters.getHorizontalViewAngle());
        this.A0b = Float.valueOf(parameters.getVerticalViewAngle());
        this.A0J = Integer.valueOf(parameters.getJpegQuality());
        Rect rect2 = C202799mg.A00;
        try {
            i = parameters.getJpegThumbnailQuality();
        } catch (NumberFormatException e) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Invalid jpeg thumbnail quality parameter string=");
            Log.e("ParametersHelper", AnonymousClass000.A0q(parameters.get("jpeg-thumbnail-quality"), A0u), e);
            i = 85;
        }
        this.A0K = Integer.valueOf(i);
        try {
            Camera.Size jpegThumbnailSize = parameters.getJpegThumbnailSize();
            this.A02 = new AnonymousClass9W3(jpegThumbnailSize.width, jpegThumbnailSize.height);
        } catch (NumberFormatException unused) {
        }
        if (C198429dX.A04(C198429dX.A0Q, r7)) {
            emptyList2 = C196539a1.A00(C202799mg.A03(parameters.get("metering-areas")));
        } else {
            emptyList2 = Collections.emptyList();
        }
        this.A0V = emptyList2;
        this.A0M = Integer.valueOf(parameters.getPictureFormat());
        AnonymousClass9W3 r3 = null;
        try {
            size = parameters.getPictureSize();
        } catch (NumberFormatException unused2) {
            size = null;
        }
        C191289Cj r4 = C201049ih.A0j;
        if (size != null) {
            r0 = new AnonymousClass9W3(size.width, size.height);
        } else {
            r0 = null;
        }
        A0A(r4, r0);
        this.A0N = Integer.valueOf(parameters.getPreviewFormat());
        parameters.getPreviewFpsRange(this.A0d);
        if (C36401kF.A1a(r7.A0Y)) {
            this.A0O = Integer.valueOf(parameters.getPreviewFrameRate());
        }
        this.A0P = Integer.valueOf(C202729mX.A04(parameters.getSceneMode()));
        this.A08 = Boolean.valueOf(parameters.getVideoStabilization());
        this.A0Q = Integer.valueOf(C202729mX.A05(parameters.getWhiteBalance()));
        this.A0R = Integer.valueOf(parameters.getZoom());
        try {
            size2 = parameters.getPreviewSize();
        } catch (NumberFormatException unused3) {
            size2 = null;
        }
        A0A(C201049ih.A0p, size2 != null ? new AnonymousClass9W3(size2.width, size2.height) : r3);
    }

    public Object clone() {
        return super.clone();
    }
}
