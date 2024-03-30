package X;

import android.graphics.Rect;
import android.hardware.Camera;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.9kx  reason: invalid class name and case insensitive filesystem */
public class C202049kx {
    public static final AtomicInteger A05 = new AtomicInteger(Integer.MIN_VALUE);
    public final Camera.Parameters A00;
    public final Camera A01;
    public final C1692788l A02;
    public final int A03;
    public final C1692488i A04;

    public static String A00(int i) {
        if (i == 0) {
            return "auto";
        }
        switch (i) {
            case 2:
                return "action";
            case 3:
                return "portrait";
            case 4:
                return "landscape";
            case 5:
                return "night";
            case 6:
                return "night-portrait";
            case 7:
                return "theatre";
            case 8:
                return "beach";
            case 9:
                return "snow";
            case 10:
                return "sunset";
            case 11:
                return "steadyphoto";
            case 12:
                return "fireworks";
            case 13:
                return "sports";
            case 14:
                return "party";
            case 15:
                return "candlelight";
            case 16:
                return "barcode";
            case 17:
                Rect rect = C202799mg.A00;
                return "hdr";
            default:
                return null;
        }
    }

    public boolean A02(C191289Cj r11, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i = r11.A00;
        if (i != 2) {
            if (i == 3) {
                Objects.requireNonNull(obj);
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                if (C198429dX.A04(C198429dX.A0V, this.A04) && !C200349hC.A02(C197119bA.A06)) {
                    this.A00.setVideoStabilization(booleanValue);
                    this.A02.A0A(C201049ih.A0Y, bool);
                    return true;
                }
            } else if (i == 27) {
                Objects.requireNonNull(obj);
                Number number = (Number) obj;
                this.A00.setGpsTimestamp(number.longValue());
                this.A02.A0A(C201049ih.A0H, number);
                return true;
            } else if (i == 42) {
                String str6 = (String) obj;
                this.A00.setGpsProcessingMethod(str6);
                this.A02.A0A(C201049ih.A0G, str6);
                return true;
            } else if (i == 45) {
                Objects.requireNonNull(obj);
                this.A02.A0A(C201049ih.A0M, obj);
                return true;
            } else if (i == 52) {
                if (C198429dX.A04(C198429dX.A0B, this.A04)) {
                    C1692788l r1 = this.A02;
                    C191289Cj r0 = C201049ih.A0k;
                    Objects.requireNonNull((Object) null);
                    r1.A0A(r0, (Object) null);
                    throw AnonymousClass001.A0A("getCaptureRequestKeys");
                }
            } else if (i == 57) {
                Objects.requireNonNull(obj);
                if (this.A03 == 1) {
                    if (C198429dX.A04(C198429dX.A0E, this.A04)) {
                        this.A02.A0A(C201049ih.A0U, obj);
                        return true;
                    }
                }
            } else if (i != 59) {
                switch (i) {
                    case 8:
                        Objects.requireNonNull(obj);
                        Boolean bool2 = (Boolean) obj;
                        boolean booleanValue2 = bool2.booleanValue();
                        if (!C200349hC.A02(C197119bA.A05)) {
                            this.A00.setRecordingHint(booleanValue2);
                            this.A02.A0A(C201049ih.A0q, bool2);
                            return true;
                        }
                        break;
                    case 9:
                        Objects.requireNonNull(obj);
                        Number number2 = (Number) obj;
                        switch (number2.intValue()) {
                            case 0:
                                str = "fixed";
                                break;
                            case 1:
                                str = "auto";
                                break;
                            case 2:
                                str = "macro";
                                break;
                            case 3:
                                str = "continuous-video";
                                break;
                            case 4:
                                str = "continuous-picture";
                                break;
                            case 5:
                                str = "edof";
                                break;
                            case 6:
                                str = "infinity";
                                break;
                            default:
                                return false;
                        }
                        if (A01(C198429dX.A0q, this.A04, number2)) {
                            this.A00.setFocusMode(str);
                            this.A02.A0A(C201049ih.A0C, number2);
                            return true;
                        }
                        break;
                    case 10:
                        Objects.requireNonNull(obj);
                        Number number3 = (Number) obj;
                        int intValue = number3.intValue();
                        if (intValue == 0) {
                            str2 = "off";
                        } else if (intValue == 1) {
                            str2 = "on";
                        } else if (intValue == 2) {
                            str2 = "auto";
                        } else if (intValue == 3) {
                            str2 = "torch";
                        } else if (intValue == 4) {
                            str2 = "red-eye";
                        }
                        if (A01(C198429dX.A0p, this.A04, number3)) {
                            this.A00.setFlashMode(str2);
                            this.A02.A0A(C201049ih.A0A, number3);
                            return true;
                        }
                        break;
                    case 11:
                        Objects.requireNonNull(obj);
                        Number number4 = (Number) obj;
                        int intValue2 = number4.intValue();
                        if (intValue2 == 0) {
                            str3 = "off";
                        } else if (intValue2 == 1) {
                            str3 = "50hz";
                        } else if (intValue2 == 2) {
                            str3 = "60hz";
                        } else if (intValue2 == 3) {
                            str3 = "auto";
                        }
                        if (A01(C198429dX.A0h, this.A04, number4)) {
                            this.A00.setAntibanding(str3);
                            this.A02.A0A(C201049ih.A00, number4);
                            return true;
                        }
                        break;
                    case 12:
                        Objects.requireNonNull(obj);
                        Number number5 = (Number) obj;
                        switch (number5.intValue()) {
                            case 0:
                                str4 = "none";
                                break;
                            case 1:
                                str4 = "mono";
                                break;
                            case 2:
                                str4 = "negative";
                                break;
                            case 3:
                                str4 = "solarize";
                                break;
                            case 4:
                                str4 = "sepia";
                                break;
                            case 5:
                                str4 = "posterize";
                                break;
                            case 6:
                                str4 = "whiteboard";
                                break;
                            case 7:
                                str4 = "blackboard";
                                break;
                            case 8:
                                str4 = "aqua";
                                break;
                            default:
                                return false;
                        }
                        if (A01(C198429dX.A0k, this.A04, number5)) {
                            this.A00.setColorEffect(str4);
                            this.A02.A0A(C201049ih.A06, number5);
                            return true;
                        }
                        break;
                    case 13:
                        Objects.requireNonNull(obj);
                        Number number6 = (Number) obj;
                        int intValue3 = number6.intValue();
                        if (C198429dX.A04(C198429dX.A0C, this.A04)) {
                            this.A00.setExposureCompensation(intValue3);
                            this.A02.A0A(C201049ih.A08, number6);
                            return true;
                        }
                        break;
                    case 14:
                        Objects.requireNonNull(obj);
                        Number number7 = (Number) obj;
                        int intValue4 = number7.intValue();
                        if (intValue4 > 0 && intValue4 <= 100) {
                            this.A00.setJpegQuality(intValue4);
                            this.A02.A0A(C201049ih.A0Z, number7);
                            return true;
                        }
                    case 15:
                        Objects.requireNonNull(obj);
                        Number number8 = (Number) obj;
                        int intValue5 = number8.intValue();
                        if (intValue5 > 0 && intValue5 <= 100) {
                            this.A00.setJpegThumbnailQuality(intValue5);
                            this.A02.A0A(C201049ih.A0a, number8);
                            return true;
                        }
                    default:
                        switch (i) {
                            case 17:
                                Objects.requireNonNull(obj);
                                Number number9 = (Number) obj;
                                int intValue6 = number9.intValue();
                                if (A01(C198429dX.A0v, this.A04, number9)) {
                                    this.A00.setPictureFormat(intValue6);
                                    this.A02.A0A(C201049ih.A0h, number9);
                                    return true;
                                }
                                break;
                            case 18:
                                Objects.requireNonNull(obj);
                                Number number10 = (Number) obj;
                                int intValue7 = number10.intValue();
                                if (A01(C198429dX.A0x, this.A04, number10)) {
                                    this.A00.setPreviewFormat(intValue7);
                                    this.A02.A0A(C201049ih.A0l, number10);
                                    return true;
                                }
                                break;
                            case 19:
                                Objects.requireNonNull(obj);
                                Number number11 = (Number) obj;
                                int intValue8 = number11.intValue();
                                if (A01(C198429dX.A0z, this.A04, number11)) {
                                    this.A00.setPreviewFrameRate(intValue8);
                                    this.A02.A0A(C201049ih.A0n, number11);
                                    return true;
                                }
                                break;
                            default:
                                switch (i) {
                                    case 21:
                                        Objects.requireNonNull(obj);
                                        Number number12 = (Number) obj;
                                        int intValue9 = number12.intValue();
                                        Camera.Parameters parameters = this.A00;
                                        parameters.setRotation(intValue9);
                                        C1692788l r12 = this.A02;
                                        r12.A0A(C201049ih.A0f, number12);
                                        if (C201049ih.A07(C201049ih.A0U, r12)) {
                                            if (C198429dX.A04(C198429dX.A0E, this.A04)) {
                                                if (intValue9 == 90 || intValue9 == 270) {
                                                    parameters.set("snapshot-picture-flip", "flip-v");
                                                    return true;
                                                }
                                                parameters.set("snapshot-picture-flip", "flip-h");
                                                return true;
                                            }
                                        }
                                        break;
                                    case 22:
                                        Objects.requireNonNull(obj);
                                        Number number13 = (Number) obj;
                                        int intValue10 = number13.intValue();
                                        AnonymousClass9ML r02 = this.A04.A00;
                                        if (r02 != null) {
                                            this.A00.set(r02.A03, (String) r02.A01.get(intValue10));
                                            this.A02.A0A(C201049ih.A0K, number13);
                                            return true;
                                        }
                                        break;
                                    case 23:
                                        Objects.requireNonNull(obj);
                                        Number number14 = (Number) obj;
                                        String A002 = A00(number14.intValue());
                                        if (A002 != null) {
                                            if (A01(C198429dX.A13, this.A04, number14)) {
                                                this.A00.setSceneMode(A002);
                                                this.A02.A0A(C201049ih.A0r, number14);
                                                return true;
                                            }
                                        }
                                        break;
                                    case 24:
                                        Objects.requireNonNull(obj);
                                        Number number15 = (Number) obj;
                                        switch (number15.intValue()) {
                                            case 1:
                                                str5 = "auto";
                                                break;
                                            case 2:
                                                str5 = "incandescent";
                                                break;
                                            case 3:
                                                str5 = "fluorescent";
                                                break;
                                            case 4:
                                                str5 = "warm-fluorescent";
                                                break;
                                            case 5:
                                                str5 = "daylight";
                                                break;
                                            case 6:
                                                str5 = "cloudy-daylight";
                                                break;
                                            case 7:
                                                str5 = "twilight";
                                                break;
                                            case 8:
                                                str5 = "shade";
                                                break;
                                        }
                                        if (A01(C198429dX.A18, this.A04, number15)) {
                                            this.A00.setWhiteBalance(str5);
                                            this.A02.A0A(C201049ih.A0x, number15);
                                            return true;
                                        }
                                        break;
                                    case 25:
                                        Objects.requireNonNull(obj);
                                        Number number16 = (Number) obj;
                                        int intValue11 = number16.intValue();
                                        if (C198429dX.A04(C198429dX.A0Z, this.A04)) {
                                            this.A00.setZoom(intValue11);
                                            this.A02.A0A(C201049ih.A0z, number16);
                                            return true;
                                        }
                                        break;
                                    default:
                                        List list = null;
                                        switch (i) {
                                            case 30:
                                                Objects.requireNonNull(obj);
                                                Number number17 = (Number) obj;
                                                this.A00.setGpsAltitude(number17.doubleValue());
                                                this.A02.A0A(C201049ih.A0D, number17);
                                                return true;
                                            case 31:
                                                Objects.requireNonNull(obj);
                                                Number number18 = (Number) obj;
                                                this.A00.setGpsLongitude(number18.doubleValue());
                                                this.A02.A0A(C201049ih.A0F, number18);
                                                return true;
                                            case 32:
                                                Objects.requireNonNull(obj);
                                                Number number19 = (Number) obj;
                                                this.A00.setGpsLatitude(number19.doubleValue());
                                                this.A02.A0A(C201049ih.A0E, number19);
                                                return true;
                                            case 33:
                                                AnonymousClass9W3 r122 = (AnonymousClass9W3) obj;
                                                if (A01(C198429dX.A10, this.A04, r122)) {
                                                    Camera.Parameters parameters2 = this.A00;
                                                    Objects.requireNonNull(r122);
                                                    parameters2.setPreviewSize(r122.A02, r122.A01);
                                                    this.A02.A0A(C201049ih.A0p, r122);
                                                    return true;
                                                }
                                                break;
                                            case 34:
                                                AnonymousClass9W3 r123 = (AnonymousClass9W3) obj;
                                                if (A01(C198429dX.A0w, this.A04, r123)) {
                                                    Camera.Parameters parameters3 = this.A00;
                                                    Objects.requireNonNull(r123);
                                                    parameters3.setPictureSize(r123.A02, r123.A01);
                                                    this.A02.A0A(C201049ih.A0j, r123);
                                                    return true;
                                                }
                                                break;
                                            case 35:
                                                if (C198429dX.A04(C198429dX.A0B, this.A04)) {
                                                    Camera.Parameters parameters4 = this.A00;
                                                    Objects.requireNonNull(obj);
                                                    parameters4.set("video-size", obj.toString());
                                                }
                                                this.A02.A0A(C201049ih.A0w, obj);
                                                return true;
                                            case 36:
                                                Objects.requireNonNull(obj);
                                                AnonymousClass9W3 r124 = (AnonymousClass9W3) obj;
                                                this.A00.setJpegThumbnailSize(r124.A02, r124.A01);
                                                this.A02.A0A(C201049ih.A0b, r124);
                                                break;
                                            case 37:
                                                List list2 = (List) obj;
                                                C1692488i r2 = this.A04;
                                                if (C198429dX.A04(C198429dX.A0P, r2)) {
                                                    Objects.requireNonNull(list2);
                                                    if (list2.size() <= C198429dX.A01(C198429dX.A0b, r2)) {
                                                        Camera.Parameters parameters5 = this.A00;
                                                        if (!list2.isEmpty()) {
                                                            list = list2;
                                                        }
                                                        parameters5.setFocusAreas(list);
                                                        this.A02.A0A(C201049ih.A0B, list2);
                                                        return true;
                                                    }
                                                }
                                                break;
                                            case 38:
                                                List list3 = (List) obj;
                                                C1692488i r22 = this.A04;
                                                if (C198429dX.A04(C198429dX.A0Q, r22)) {
                                                    Objects.requireNonNull(list3);
                                                    if (list3.size() <= C198429dX.A01(C198429dX.A0c, r22)) {
                                                        Camera.Parameters parameters6 = this.A00;
                                                        if (!list3.isEmpty()) {
                                                            list = list3;
                                                        }
                                                        parameters6.setMeteringAreas(list);
                                                        this.A02.A0A(C201049ih.A0e, list3);
                                                        return true;
                                                    }
                                                }
                                                break;
                                            case 39:
                                                int[] iArr = (int[]) obj;
                                                List<int[]> A032 = C198429dX.A03(C198429dX.A0y, this.A04);
                                                if (!(A032 == null || iArr == null)) {
                                                    for (int[] iArr2 : A032) {
                                                        if (iArr2[0] == iArr[0] && iArr2[1] == iArr[1]) {
                                                            Camera.Parameters parameters7 = this.A00;
                                                            Objects.requireNonNull(iArr);
                                                            parameters7.setPreviewFpsRange(iArr[0], iArr[1]);
                                                            this.A02.A0A(C201049ih.A0m, iArr);
                                                            return true;
                                                        }
                                                    }
                                                    break;
                                                }
                                                break;
                                            default:
                                                throw C165567td.A0U("Invalid Settings key: ", AnonymousClass000.A0u(), i);
                                        }
                                }
                        }
                }
            } else {
                C1692788l r4 = this.A02;
                if (C201049ih.A07(C201049ih.A0U, r4)) {
                    if (C198429dX.A04(C198429dX.A0E, this.A04)) {
                        Objects.requireNonNull(obj);
                        Number number20 = (Number) obj;
                        int intValue12 = number20.intValue();
                        r4.A0A(C201049ih.A0v, number20);
                        if (intValue12 == 90 || intValue12 == 270) {
                            this.A00.set("video-flip", "flip-v");
                            return true;
                        }
                        this.A00.set("video-flip", "flip-h");
                        return true;
                    }
                }
            }
            return false;
        }
        Objects.requireNonNull(obj);
        boolean A1X = AnonymousClass000.A1X(obj);
        if (C198429dX.A04(C198429dX.A0G, this.A04)) {
            int i2 = 0;
            if (A1X) {
                i2 = 17;
            }
            this.A00.setSceneMode(A00(i2));
            this.A02.A0A(C201049ih.A0r, Integer.valueOf(i2));
            if (A1X) {
                A02(C201049ih.A0q, false);
                return true;
            }
        }
        return false;
        return true;
    }

    public C202049kx(Camera.Parameters parameters, Camera camera, C1692488i r3, C1692788l r4, int i) {
        this.A01 = camera;
        this.A00 = parameters;
        this.A04 = r3;
        this.A02 = r4;
        this.A03 = i;
    }

    public static boolean A01(C191279Ci r0, C198429dX r1, Object obj) {
        List list = (List) r1.A06(r0);
        if (list == null || obj == null || !list.contains(obj)) {
            return false;
        }
        return true;
    }
}
