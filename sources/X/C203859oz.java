package X;

import android.content.res.AssetManager;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.facebook.msys.mci.DefaultCrypto;
import java.io.Closeable;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* renamed from: X.9oz  reason: invalid class name and case insensitive filesystem */
public class C203859oz {
    public static SimpleDateFormat A0J;
    public static SimpleDateFormat A0K;
    public static final byte[] A0L = {65, 83, 67, 73, 73, 0, 0, 0};
    public static final String[] A0M = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final C197869cV[][] A0N;
    public static final Charset A0O;
    public static final boolean A0P = Log.isLoggable("ExifInterface", 3);
    public static final byte[] A0Q = {104, 101, 105, 99};
    public static final byte[] A0R = {109, 105, 102, 49};
    public static final byte[] A0S = {102, 116, 121, 112};
    public static final byte[] A0T;
    public static final byte[] A0U = {-1, -40, -1};
    public static final byte[] A0V = {79, 76, 89, 77, 80, 0};
    public static final byte[] A0W = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] A0X = {101, 88, 73, 102};
    public static final byte[] A0Y = {73, 69, 78, 68};
    public static final byte[] A0Z = {73, 72, 68, 82};
    public static final byte[] A0a = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] A0b = "ANIM".getBytes(Charset.defaultCharset());
    public static final byte[] A0c = "ANMF".getBytes(Charset.defaultCharset());
    public static final byte[] A0d = {69, 88, 73, 70};
    public static final byte[] A0e = "VP8 ".getBytes(Charset.defaultCharset());
    public static final byte[] A0f = "VP8L".getBytes(Charset.defaultCharset());
    public static final byte[] A0g = "VP8X".getBytes(Charset.defaultCharset());
    public static final byte[] A0h = {82, 73, 70, 70};
    public static final byte[] A0i = {87, 69, 66, 80};
    public static final byte[] A0j = {-99, 1, 42};
    public static final int[] A0k = {8};
    public static final int[] A0l = {8, 8, 8};
    public static final int[] A0m = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final HashMap A0n = AnonymousClass001.A0J();
    public static final HashSet A0o = C36421kH.A0g(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"});
    public static final List A0p;
    public static final List A0q;
    public static final Pattern A0r = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final Pattern A0s = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final Pattern A0t = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final Pattern A0u = Pattern.compile(".*[1-9].*");
    public static final byte[] A0v;
    public static final C197869cV[] A0w;
    public static final C197869cV[] A0x;
    public static final C197869cV[] A0y;
    public static final C197869cV[] A0z;
    public static final C197869cV[] A10;
    public static final C197869cV[] A11;
    public static final C197869cV[] A12;
    public static final C197869cV[] A13;
    public static final C197869cV[] A14;
    public static final C197869cV[] A15;
    public static final HashMap[] A16 = new HashMap[10];
    public static final HashMap[] A17 = new HashMap[10];
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public AssetManager.AssetInputStream A06;
    public FileDescriptor A07;
    public String A08;
    public ByteOrder A09 = ByteOrder.BIG_ENDIAN;
    public Set A0A = new HashSet(10);
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public byte[] A0F;
    public int A0G;
    public int A0H;
    public final HashMap[] A0I = new HashMap[10];

    public static C202669mO A02(C203859oz r3, int i) {
        return C202669mO.A01(r3.A09, new int[]{i});
    }

    private void A08() {
        int i = 0;
        while (true) {
            HashMap[] hashMapArr = this.A0I;
            if (i < 10) {
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("The size of tag group[");
                A0u2.append(i);
                A0u2.append("]: ");
                Log.d("ExifInterface", C36381kD.A10(A0u2, hashMapArr[i].size()));
                Iterator A102 = C36371kC.A10(hashMapArr[i]);
                while (A102.hasNext()) {
                    Map.Entry A112 = AnonymousClass000.A11(A102);
                    C202669mO r2 = (C202669mO) A112.getValue();
                    StringBuilder A0u3 = AnonymousClass000.A0u();
                    A0u3.append("tagName: ");
                    A0u3.append(C90494aF.A0f(A112));
                    C165567td.A1M(r2, ", tagType: ", A0u3);
                    A0u3.append(", tagValue: '");
                    A0u3.append(r2.A05(this.A09));
                    Log.d("ExifInterface", AnonymousClass000.A0q("'", A0u3));
                }
                i++;
            } else {
                return;
            }
        }
    }

    private void A09() {
        A0A(0, 5);
        A0A(0, 4);
        A0A(5, 4);
        HashMap[] hashMapArr = this.A0I;
        Object obj = hashMapArr[1].get("PixelXDimension");
        Object obj2 = hashMapArr[1].get("PixelYDimension");
        if (!(obj == null || obj2 == null)) {
            hashMapArr[0].put("ImageWidth", obj);
            hashMapArr[0].put("ImageLength", obj2);
        }
        if (hashMapArr[4].isEmpty() && A0X(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = AnonymousClass001.A0J();
        }
        if (!A0X(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        A0B(0, "ThumbnailOrientation", "Orientation");
        A0B(0, "ThumbnailImageLength", "ImageLength");
        A0B(0, "ThumbnailImageWidth", "ImageWidth");
        A0B(5, "ThumbnailOrientation", "Orientation");
        A0B(5, "ThumbnailImageLength", "ImageLength");
        A0B(5, "ThumbnailImageWidth", "ImageWidth");
        A0B(4, "Orientation", "ThumbnailOrientation");
        A0B(4, "ImageLength", "ThumbnailImageLength");
        A0B(4, "ImageWidth", "ThumbnailImageWidth");
    }

    private void A0F(C187478xw r5, C187138xK r6, byte[] bArr, byte[] bArr2) {
        String A0q2;
        while (true) {
            byte[] bArr3 = new byte[4];
            if (r5.read(bArr3) != 4) {
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = A0O;
                A0u2.append(new String(bArr, charset));
                if (bArr2 == null) {
                    A0q2 = "";
                } else {
                    StringBuilder A0u3 = AnonymousClass000.A0u();
                    A0u3.append(" or ");
                    A0q2 = AnonymousClass000.A0q(new String(bArr2, charset), A0u3);
                }
                throw C90464aC.A0M(A0q2, A0u2);
            }
            int readInt = r5.readInt();
            r6.write(bArr3);
            r6.A00(readInt);
            if (readInt % 2 == 1) {
                readInt++;
            }
            A0S(r5, r6, readInt);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    public static void A0K(C203859oz r5, Object obj, AbstractMap abstractMap) {
        abstractMap.put(obj, C202669mO.A02(r5.A09, new long[]{0}));
    }

    public static void A0L(C203859oz r6, String str) {
        if (r6.A0Z(str) == null) {
            r6.A0I[0].put(str, C202669mO.A02(r6.A09, new long[]{0}));
        }
    }

    private void A0U(String str) {
        int i = 0;
        do {
            this.A0I[i].remove(str);
            i++;
        } while (i < 10);
    }

    static {
        Integer[] numArr = new Integer[4];
        numArr[0] = 1;
        AnonymousClass000.A1L(numArr, 6, 1);
        numArr[2] = 3;
        A0q = C90524aI.A0p(8, numArr, 3);
        Integer[] numArr2 = new Integer[4];
        numArr2[0] = 2;
        Integer A0h2 = C36401kF.A0h();
        numArr2[1] = A0h2;
        AnonymousClass000.A1L(numArr2, 4, 2);
        A0p = C90524aI.A0p(5, numArr2, 3);
        C197869cV[] r8 = new C197869cV[42];
        A0W("NewSubfileType", r8, 254, 4, 0);
        A0W("SubfileType", r8, 255, 4, 1);
        r8[2] = new C197869cV(256, 3, "ImageWidth", 4);
        r8[3] = new C197869cV(257, 3, "ImageLength", 4);
        A0W("BitsPerSample", r8, 258, 3, 4);
        A0W("Compression", r8, 259, 3, 5);
        r8[6] = A04("PhotometricInterpretation", 262, 3);
        r8[7] = A04("ImageDescription", 270, 2);
        r8[8] = A04("Make", 271, 2);
        r8[9] = A04("Model", 272, 2);
        r8[10] = new C197869cV(273, 3, "StripOffsets", 4);
        r8[11] = A04("Orientation", 274, 3);
        r8[12] = A04("SamplesPerPixel", 277, 3);
        r8[13] = new C197869cV(278, 3, "RowsPerStrip", 4);
        r8[14] = new C197869cV(279, 3, "StripByteCounts", 4);
        r8[15] = A04("XResolution", 282, 5);
        r8[16] = A04("YResolution", 283, 5);
        r8[17] = A04("PlanarConfiguration", 284, 3);
        r8[18] = A04("ResolutionUnit", 296, 3);
        r8[19] = A04("TransferFunction", 301, 3);
        r8[20] = A04("Software", 305, 2);
        r8[21] = A04("DateTime", 306, 2);
        r8[22] = A04("Artist", 315, 2);
        r8[23] = A04("WhitePoint", 318, 5);
        r8[24] = A04("PrimaryChromaticities", 319, 5);
        r8[25] = A04("SubIFDPointer", 330, 4);
        r8[26] = A04("JPEGInterchangeFormat", 513, 4);
        r8[27] = A04("JPEGInterchangeFormatLength", 514, 4);
        r8[28] = A04("YCbCrCoefficients", 529, 5);
        r8[29] = A04("YCbCrSubSampling", 530, 3);
        r8[30] = A04("YCbCrPositioning", 531, 3);
        r8[31] = A04("ReferenceBlackWhite", 532, 5);
        r8[32] = A04("Copyright", 33432, 2);
        r8[33] = A04("ExifIFDPointer", 34665, 4);
        r8[34] = A04("GPSInfoIFDPointer", 34853, 4);
        r8[35] = new C197869cV("SensorTopBorder", 4, 4);
        r8[36] = A04("SensorLeftBorder", 5, 4);
        r8[37] = A04("SensorBottomBorder", 6, 4);
        r8[38] = A04("SensorRightBorder", 7, 4);
        r8[39] = A04("ISO", 23, 3);
        r8[40] = A04("JpgFromRaw", 46, 7);
        r8[41] = A04("Xmp", 700, 1);
        A11 = r8;
        C197869cV[] r6 = new C197869cV[74];
        r6[0] = A04("ExposureTime", 33434, 5);
        A0W("FNumber", r6, 33437, 5, 1);
        A0W("ExposureProgram", r6, 34850, 3, 2);
        A0W("SpectralSensitivity", r6, 34852, 2, 3);
        A0W("PhotographicSensitivity", r6, 34855, 3, 4);
        A0W("OECF", r6, 34856, 7, 5);
        r6[6] = A04("SensitivityType", 34864, 3);
        A0W("StandardOutputSensitivity", r6, 34865, 4, 7);
        r6[8] = A04("RecommendedExposureIndex", 34866, 4);
        r6[9] = A04("ISOSpeed", 34867, 4);
        r6[10] = A04("ISOSpeedLatitudeyyy", 34868, 4);
        r6[11] = A04("ISOSpeedLatitudezzz", 34869, 4);
        r6[12] = A04("ExifVersion", 36864, 2);
        r6[13] = A04("DateTimeOriginal", 36867, 2);
        r6[14] = A04("DateTimeDigitized", 36868, 2);
        r6[15] = A04("OffsetTime", 36880, 2);
        r6[16] = A04("OffsetTimeOriginal", 36881, 2);
        r6[17] = A04("OffsetTimeDigitized", 36882, 2);
        r6[18] = A04("ComponentsConfiguration", 37121, 7);
        r6[19] = A04("CompressedBitsPerPixel", 37122, 5);
        r6[20] = A04("ShutterSpeedValue", 37377, 10);
        r6[21] = A04("ApertureValue", 37378, 5);
        r6[22] = A04("BrightnessValue", 37379, 10);
        r6[23] = A04("ExposureBiasValue", 37380, 10);
        r6[24] = A04("MaxApertureValue", 37381, 5);
        r6[25] = A04("SubjectDistance", 37382, 5);
        r6[26] = A04("MeteringMode", 37383, 3);
        r6[27] = A04("LightSource", 37384, 3);
        r6[28] = A04("Flash", 37385, 3);
        r6[29] = A04("FocalLength", 37386, 5);
        r6[30] = A04("SubjectArea", 37396, 3);
        r6[31] = A04("MakerNote", 37500, 7);
        r6[32] = A04("UserComment", 37510, 7);
        r6[33] = A04("SubSecTime", 37520, 2);
        r6[34] = A04("SubSecTimeOriginal", 37521, 2);
        r6[35] = A04("SubSecTimeDigitized", 37522, 2);
        r6[36] = A04("FlashpixVersion", 40960, 7);
        r6[37] = A04("ColorSpace", 40961, 3);
        r6[38] = new C197869cV(40962, 3, "PixelXDimension", 4);
        r6[39] = new C197869cV(40963, 3, "PixelYDimension", 4);
        r6[40] = A04("RelatedSoundFile", 40964, 2);
        r6[41] = A04("InteroperabilityIFDPointer", 40965, 4);
        r6[42] = A04("FlashEnergy", 41483, 5);
        r6[43] = A04("SpatialFrequencyResponse", 41484, 7);
        r6[44] = A04("FocalPlaneXResolution", 41486, 5);
        r6[45] = A04("FocalPlaneYResolution", 41487, 5);
        r6[46] = A04("FocalPlaneResolutionUnit", 41488, 3);
        r6[47] = A04("SubjectLocation", 41492, 3);
        r6[48] = A04("ExposureIndex", 41493, 5);
        r6[49] = A04("SensingMethod", 41495, 3);
        r6[50] = A04("FileSource", 41728, 7);
        r6[51] = A04("SceneType", 41729, 7);
        r6[52] = A04("CFAPattern", 41730, 7);
        r6[53] = A04("CustomRendered", 41985, 3);
        r6[54] = A04("ExposureMode", 41986, 3);
        r6[55] = A04("WhiteBalance", 41987, 3);
        r6[56] = A04("DigitalZoomRatio", 41988, 5);
        r6[57] = A04("FocalLengthIn35mmFilm", 41989, 3);
        r6[58] = A04("SceneCaptureType", 41990, 3);
        r6[59] = A04("GainControl", 41991, 3);
        r6[60] = A04("Contrast", 41992, 3);
        r6[61] = A04("Saturation", 41993, 3);
        r6[62] = A04("Sharpness", 41994, 3);
        r6[63] = A04("DeviceSettingDescription", 41995, 7);
        r6[64] = A04("SubjectDistanceRange", 41996, 3);
        r6[65] = A04("ImageUniqueID", 42016, 2);
        r6[66] = A04("CameraOwnerName", 42032, 2);
        r6[67] = A04("BodySerialNumber", 42033, 2);
        r6[68] = A04("LensSpecification", 42034, 5);
        r6[69] = A04("LensMake", 42035, 2);
        r6[70] = A04("LensModel", 42036, 2);
        r6[71] = A04("Gamma", 42240, 5);
        r6[72] = A04("DNGVersion", 50706, 1);
        r6[73] = new C197869cV(50720, 3, "DefaultCropSize", 4);
        A0x = r6;
        C197869cV[] r11 = new C197869cV[32];
        A0V("GPSVersionID", r11, 0, 1);
        A0V("GPSLatitudeRef", r11, 1, 2);
        r11[2] = new C197869cV(2, 5, "GPSLatitude", 10);
        A0V("GPSLongitudeRef", r11, 3, 2);
        r11[4] = new C197869cV(4, 5, "GPSLongitude", 10);
        A0V("GPSAltitudeRef", r11, 5, 1);
        A0V("GPSAltitude", r11, 6, 5);
        A0V("GPSTimeStamp", r11, 7, 5);
        A0V("GPSSatellites", r11, 8, 2);
        A0V("GPSStatus", r11, 9, 2);
        A0V("GPSMeasureMode", r11, 10, 2);
        A0V("GPSDOP", r11, 11, 5);
        A0V("GPSSpeedRef", r11, 12, 2);
        A0V("GPSSpeed", r11, 13, 5);
        A0V("GPSTrackRef", r11, 14, 2);
        A0V("GPSTrack", r11, 15, 5);
        A0V("GPSImgDirectionRef", r11, 16, 2);
        A0V("GPSImgDirection", r11, 17, 5);
        A0V("GPSMapDatum", r11, 18, 2);
        A0V("GPSDestLatitudeRef", r11, 19, 2);
        A0V("GPSDestLatitude", r11, 20, 5);
        A0V("GPSDestLongitudeRef", r11, 21, 2);
        A0V("GPSDestLongitude", r11, 22, 5);
        A0V("GPSDestBearingRef", r11, 23, 2);
        A0V("GPSDestBearing", r11, 24, 5);
        A0V("GPSDestDistanceRef", r11, 25, 2);
        A0V("GPSDestDistance", r11, 26, 5);
        A0V("GPSProcessingMethod", r11, 27, 7);
        A0V("GPSAreaInformation", r11, 28, 7);
        A0V("GPSDateStamp", r11, 29, 2);
        A0V("GPSDifferential", r11, 30, 3);
        A0V("GPSHPositioningError", r11, 31, 5);
        A0y = r11;
        C197869cV[] r13 = {A04("InteroperabilityIndex", 1, 2)};
        A0z = r13;
        C197869cV[] r12 = new C197869cV[38];
        A0W("NewSubfileType", r12, 254, 4, 0);
        r12[1] = A04("SubfileType", 255, 4);
        r12[2] = new C197869cV(256, 3, "ThumbnailImageWidth", 4);
        r12[3] = new C197869cV(257, 3, "ThumbnailImageLength", 4);
        A0W("BitsPerSample", r12, 258, 3, 4);
        r12[5] = A04("Compression", 259, 3);
        r12[6] = A04("PhotometricInterpretation", 262, 3);
        A0W("ImageDescription", r12, 270, 2, 7);
        r12[8] = A04("Make", 271, 2);
        r12[9] = A04("Model", 272, 2);
        r12[10] = new C197869cV(273, 3, "StripOffsets", 4);
        r12[11] = A04("ThumbnailOrientation", 274, 3);
        r12[12] = A04("SamplesPerPixel", 277, 3);
        r12[13] = new C197869cV(278, 3, "RowsPerStrip", 4);
        r12[14] = new C197869cV(279, 3, "StripByteCounts", 4);
        r12[15] = A04("XResolution", 282, 5);
        r12[16] = A04("YResolution", 283, 5);
        r12[17] = A04("PlanarConfiguration", 284, 3);
        r12[18] = A04("ResolutionUnit", 296, 3);
        r12[19] = A04("TransferFunction", 301, 3);
        r12[20] = A04("Software", 305, 2);
        r12[21] = A04("DateTime", 306, 2);
        r12[22] = A04("Artist", 315, 2);
        r12[23] = A04("WhitePoint", 318, 5);
        r12[24] = A04("PrimaryChromaticities", 319, 5);
        r12[25] = A04("SubIFDPointer", 330, 4);
        r12[26] = A04("JPEGInterchangeFormat", 513, 4);
        r12[27] = A04("JPEGInterchangeFormatLength", 514, 4);
        r12[28] = A04("YCbCrCoefficients", 529, 5);
        r12[29] = A04("YCbCrSubSampling", 530, 3);
        r12[30] = A04("YCbCrPositioning", 531, 3);
        r12[31] = A04("ReferenceBlackWhite", 532, 5);
        r12[32] = A04("Xmp", 700, 1);
        r12[33] = A04("Copyright", 33432, 2);
        r12[34] = A04("ExifIFDPointer", 34665, 4);
        r12[35] = A04("GPSInfoIFDPointer", 34853, 4);
        r12[36] = A04("DNGVersion", 50706, 1);
        r12[37] = new C197869cV(50720, 3, "DefaultCropSize", 4);
        A10 = r12;
        C197869cV[] r10 = new C197869cV[3];
        A0W("ThumbnailImage", r10, 256, 7, 0);
        r10[1] = A04("CameraSettingsIFDPointer", 8224, 4);
        r10[2] = A04("ImageProcessingIFDPointer", 8256, 4);
        A14 = r10;
        C197869cV[] r4 = new C197869cV[2];
        A0W("PreviewImageStart", r4, 257, 4, 0);
        r4[1] = A04("PreviewImageLength", 258, 4);
        A12 = r4;
        C197869cV[] r3 = new C197869cV[1];
        A0W("AspectFrame", r3, 4371, 3, 0);
        A13 = r3;
        C197869cV[] r15 = new C197869cV[1];
        A0W("ColorSpace", r15, 55, 3, 0);
        A15 = r15;
        C197869cV[][] r1 = new C197869cV[10][];
        C90494aF.A1H(r8, r6, r1);
        r1[2] = r11;
        r1[3] = r13;
        r1[4] = r12;
        r1[5] = r8;
        r1[6] = r10;
        r1[7] = r4;
        C36401kF.A1Q(r3, r15, r1);
        A0N = r1;
        C197869cV[] r42 = new C197869cV[6];
        A0W("SubIFDPointer", r42, 330, 4, 0);
        r42[1] = A04("ExifIFDPointer", 34665, 4);
        r42[2] = A04("GPSInfoIFDPointer", 34853, 4);
        A0W("InteroperabilityIFDPointer", r42, 40965, 4, 3);
        A0W("CameraSettingsIFDPointer", r42, 8224, 1, 4);
        r42[5] = A04("ImageProcessingIFDPointer", 8256, 1);
        A0w = r42;
        Charset forName = Charset.forName("US-ASCII");
        A0O = forName;
        A0T = "Exif\u0000\u0000".getBytes(forName);
        A0v = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        A0J = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        A0K = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C197869cV[][] r32 = A0N;
            if (i < 10) {
                A16[i] = AnonymousClass001.A0J();
                A17[i] = AnonymousClass001.A0J();
                for (C197869cV r33 : r32[i]) {
                    C36331k8.A1Q(r33, A16[i], r33.A00);
                    A17[i].put(r33.A03, r33);
                }
                i++;
            } else {
                HashMap hashMap = A0n;
                C197869cV[] r43 = A0w;
                C36331k8.A1Q(5, hashMap, r43[0].A00);
                C36331k8.A1Q(1, hashMap, r43[1].A00);
                C36331k8.A1Q(2, hashMap, r43[2].A00);
                C36331k8.A1Q(3, hashMap, r43[3].A00);
                C36331k8.A1Q(A0h2, hashMap, r43[4].A00);
                C36331k8.A1Q(8, hashMap, r43[5].A00);
                return;
            }
        }
    }

    public static int A00(C202669mO r3, C203859oz r4) {
        Object A042 = r3.A04(r4.A09);
        if (A042 == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        } else if (A042 instanceof String) {
            return Integer.parseInt((String) A042);
        } else {
            if (A042 instanceof long[]) {
                long[] jArr = (long[]) A042;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (A042 instanceof int[]) {
                int[] iArr = (int[]) A042;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a integer value");
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:63|64|65) */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        java.lang.Double.parseDouble(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x010f, code lost:
        return X.C36441kJ.A0Q(12, -1);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0102 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair A01(java.lang.String r13) {
        /*
            java.lang.String r1 = ","
            boolean r0 = r13.contains(r1)
            r8 = 0
            r6 = 1
            r9 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            r4 = -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            if (r0 == 0) goto L_0x0083
            java.lang.String[] r7 = r13.split(r1, r4)
            r0 = r7[r8]
            android.util.Pair r8 = A01(r0)
            int r0 = X.C36381kD.A04(r8)
            if (r0 != r9) goto L_0x0025
        L_0x0024:
            return r8
        L_0x0025:
            int r0 = r7.length
            if (r6 >= r0) goto L_0x0024
            r0 = r7[r6]
            android.util.Pair r9 = A01(r0)
            java.lang.Object r10 = r9.first
            java.lang.Object r0 = r8.first
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x007e
            java.lang.Object r1 = r9.second
            java.lang.Object r0 = r8.first
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x007e
            r2 = -1
        L_0x0043:
            int r0 = X.C36381kD.A03(r8)
            if (r0 == r4) goto L_0x007c
            java.lang.Object r0 = r8.second
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x005b
            java.lang.Object r1 = r9.second
            java.lang.Object r0 = r8.second
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x007c
        L_0x005b:
            int r0 = X.C36381kD.A03(r8)
        L_0x005f:
            if (r2 != r4) goto L_0x0068
            if (r0 != r4) goto L_0x0068
            android.util.Pair r0 = X.C36441kJ.A0Q(r5, r3)
            return r0
        L_0x0068:
            if (r2 != r4) goto L_0x0075
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x006e:
            android.util.Pair r8 = X.C36441kJ.A0Q(r0, r3)
        L_0x0072:
            int r6 = r6 + 1
            goto L_0x0025
        L_0x0075:
            if (r0 != r4) goto L_0x0072
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            goto L_0x006e
        L_0x007c:
            r0 = -1
            goto L_0x005f
        L_0x007e:
            int r2 = X.C36381kD.A04(r8)
            goto L_0x0043
        L_0x0083:
            java.lang.String r1 = "/"
            boolean r0 = r13.contains(r1)
            r11 = 0
            if (r0 == 0) goto L_0x00d3
            java.lang.String[] r2 = r13.split(r1, r4)
            int r0 = r2.length
            if (r0 != r9) goto L_0x0110
            r0 = r2[r8]     // Catch:{ NumberFormatException -> 0x0110 }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x0110 }
            long r7 = (long) r0     // Catch:{ NumberFormatException -> 0x0110 }
            r0 = r2[r6]     // Catch:{ NumberFormatException -> 0x0110 }
            double r9 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x0110 }
            long r1 = (long) r9     // Catch:{ NumberFormatException -> 0x0110 }
            r6 = 10
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x00ca
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x00ca
            r4 = 5
            r9 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x00c1
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x00c1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ NumberFormatException -> 0x0110 }
            android.util.Pair r8 = X.C36341k9.A0I(r0, r4)     // Catch:{ NumberFormatException -> 0x0110 }
            return r8
        L_0x00c1:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x0110 }
            android.util.Pair r0 = X.C36441kJ.A0Q(r0, r3)     // Catch:{ NumberFormatException -> 0x0110 }
            return r0
        L_0x00ca:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ NumberFormatException -> 0x0110 }
            android.util.Pair r8 = X.C36441kJ.A0Q(r0, r3)     // Catch:{ NumberFormatException -> 0x0110 }
            return r8
        L_0x00d3:
            long r6 = java.lang.Long.parseLong(r13)     // Catch:{ NumberFormatException -> 0x0102 }
            r4 = 4
            int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x00ec
            r1 = 65535(0xffff, double:3.23786E-319)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00ec
            java.lang.Integer r0 = X.C36371kC.A0n()     // Catch:{ NumberFormatException -> 0x0102 }
            android.util.Pair r8 = X.C36341k9.A0I(r0, r4)     // Catch:{ NumberFormatException -> 0x0102 }
            return r8
        L_0x00ec:
            int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x00f9
            java.lang.Integer r0 = X.C36401kF.A0i()     // Catch:{ NumberFormatException -> 0x0102 }
            android.util.Pair r8 = X.C36441kJ.A0Q(r0, r3)     // Catch:{ NumberFormatException -> 0x0102 }
            return r8
        L_0x00f9:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x0102 }
            android.util.Pair r8 = X.C36441kJ.A0Q(r0, r3)     // Catch:{ NumberFormatException -> 0x0102 }
            return r8
        L_0x0102:
            java.lang.Double.parseDouble(r13)     // Catch:{ NumberFormatException -> 0x0110 }
            r0 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0110 }
            android.util.Pair r0 = X.C36441kJ.A0Q(r0, r3)     // Catch:{ NumberFormatException -> 0x0110 }
            return r0
        L_0x0110:
            android.util.Pair r0 = X.C36441kJ.A0Q(r5, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203859oz.A01(java.lang.String):android.util.Pair");
    }

    public static C197869cV A04(String str, int i, int i2) {
        return new C197869cV(str, i, i2);
    }

    private void A07() {
        String A0Z2 = A0Z("DateTimeOriginal");
        if (A0Z2 != null && A0Z("DateTime") == null) {
            this.A0I[0].put("DateTime", C202669mO.A00(A0Z2));
        }
        A0L(this, "ImageWidth");
        A0L(this, "ImageLength");
        A0L(this, "Orientation");
        if (A0Z("LightSource") == null) {
            A0K(this, "LightSource", this.A0I[1]);
        }
    }

    private void A0A(int i, int i2) {
        String str;
        HashMap[] hashMapArr = this.A0I;
        HashMap hashMap = hashMapArr[i];
        if (!hashMap.isEmpty() && !hashMapArr[i2].isEmpty()) {
            C202669mO A032 = A03("ImageLength", hashMap);
            C202669mO A033 = A03("ImageWidth", hashMapArr[i]);
            C202669mO A034 = A03("ImageLength", hashMapArr[i2]);
            C202669mO A035 = A03("ImageWidth", hashMapArr[i2]);
            if (A032 == null || A033 == null) {
                if (A0P) {
                    str = "First image does not contain valid size information";
                } else {
                    return;
                }
            } else if (A034 != null && A035 != null) {
                int A002 = A00(A032, this);
                int A003 = A00(A033, this);
                int A004 = A00(A034, this);
                int A005 = A00(A035, this);
                if (A002 < A004 && A003 < A005) {
                    HashMap hashMap2 = hashMapArr[i];
                    hashMapArr[i] = hashMapArr[i2];
                    hashMapArr[i2] = hashMap2;
                    return;
                }
                return;
            } else if (A0P) {
                str = "Second image does not contain valid size information";
            } else {
                return;
            }
        } else if (A0P) {
            str = "Cannot perform swap since only one image data exists";
        } else {
            return;
        }
        Log.d("ExifInterface", str);
    }

    private void A0B(int i, String str, String str2) {
        HashMap[] hashMapArr = this.A0I;
        HashMap hashMap = hashMapArr[i];
        if (!hashMap.isEmpty() && hashMap.get(str) != null) {
            HashMap hashMap2 = hashMapArr[i];
            hashMap2.put(str2, hashMap2.get(str));
            hashMapArr[i].remove(str);
        }
    }

    private void A0D(C187478xw r21) {
        long[] jArr;
        long[] jArr2;
        String str;
        int length;
        int length2;
        String str2;
        StringBuilder A0u2;
        long[] jArr3;
        long[] jArr4;
        C202669mO A032;
        int A002;
        HashMap hashMap = this.A0I[4];
        C202669mO A033 = A03("Compression", hashMap);
        C187478xw r10 = r21;
        if (A033 != null) {
            int A003 = A00(A033, this);
            this.A03 = A003;
            if (A003 != 1) {
                if (A003 != 6) {
                    if (A003 != 7) {
                        return;
                    }
                }
            }
            C202669mO A034 = A03("BitsPerSample", hashMap);
            if (A034 != null) {
                int[] iArr = (int[]) A034.A04(this.A09);
                int[] iArr2 = A0l;
                if (Arrays.equals(iArr2, iArr) || (this.A00 == 3 && (A032 = A03("PhotometricInterpretation", hashMap)) != null && ((A002 = A00(A032, this)) != 1 ? !(A002 != 6 || !Arrays.equals(iArr, iArr2)) : Arrays.equals(iArr, A0k)))) {
                    C202669mO A035 = A03("StripOffsets", hashMap);
                    C202669mO A036 = A03("StripByteCounts", hashMap);
                    if (A035 != null && A036 != null) {
                        Object A042 = A035.A04(this.A09);
                        if (A042 instanceof int[]) {
                            int[] iArr3 = (int[]) A042;
                            int length3 = iArr3.length;
                            jArr = new long[length3];
                            for (int i = 0; i < length3; i++) {
                                jArr[i] = (long) iArr3[i];
                            }
                        } else {
                            if (A042 instanceof long[]) {
                                jArr4 = (long[]) A042;
                            } else {
                                jArr4 = null;
                            }
                            jArr = jArr4;
                        }
                        Object A043 = A036.A04(this.A09);
                        if (A043 instanceof int[]) {
                            int[] iArr4 = (int[]) A043;
                            int length4 = iArr4.length;
                            jArr2 = new long[length4];
                            for (int i2 = 0; i2 < length4; i2++) {
                                jArr2[i2] = (long) iArr4[i2];
                            }
                        } else {
                            if (A043 instanceof long[]) {
                                jArr3 = (long[]) A043;
                            } else {
                                jArr3 = null;
                            }
                            jArr2 = jArr3;
                        }
                        if (jArr == null || (length = jArr.length) == 0) {
                            str = "stripOffsets should not be null or have zero length.";
                        } else if (jArr2 == null || (length2 = jArr2.length) == 0) {
                            str = "stripByteCounts should not be null or have zero length.";
                        } else if (length != length2) {
                            str = "stripOffsets and stripByteCounts should have same length.";
                        } else {
                            long j = 0;
                            int i3 = 0;
                            do {
                                j += jArr2[i3];
                                i3++;
                            } while (i3 < length2);
                            int i4 = (int) j;
                            byte[] bArr = new byte[i4];
                            int i5 = 1;
                            this.A0B = true;
                            this.A0D = true;
                            this.A0C = true;
                            int i6 = 0;
                            int i7 = 0;
                            int i8 = 0;
                            do {
                                int i9 = (int) jArr[i6];
                                int i10 = (int) jArr2[i6];
                                if (i6 < length - i5 && ((long) (i9 + i10)) != jArr[i6 + 1]) {
                                    this.A0B = false;
                                }
                                int i11 = i9 - i7;
                                if (i11 < 0) {
                                    str2 = "Invalid strip offset value";
                                } else {
                                    long j2 = (long) i11;
                                    if (r10.skip(j2) != j2) {
                                        A0u2 = AnonymousClass000.A0u();
                                        A0u2.append("Failed to skip ");
                                        A0u2.append(i11);
                                    } else {
                                        int i12 = i7 + i11;
                                        byte[] bArr2 = new byte[i10];
                                        if (r10.read(bArr2) != i10) {
                                            A0u2 = AnonymousClass000.A0u();
                                            A0u2.append("Failed to read ");
                                            A0u2.append(i10);
                                        } else {
                                            i7 = i12 + i10;
                                            System.arraycopy(bArr2, 0, bArr, i8, i10);
                                            i8 += i10;
                                            i6++;
                                            i5 = 1;
                                        }
                                    }
                                    str2 = AnonymousClass000.A0q(" bytes.", A0u2);
                                }
                                Log.d("ExifInterface", str2);
                                return;
                            } while (i6 < length);
                            this.A0F = bArr;
                            if (this.A0B) {
                                this.A05 = (int) jArr[0];
                                this.A04 = i4;
                                return;
                            }
                            return;
                        }
                        Log.w("ExifInterface", str);
                        return;
                    }
                    return;
                }
            }
            if (A0P) {
                Log.d("ExifInterface", "Unsupported data type value");
                return;
            }
            return;
        }
        this.A03 = 6;
        C202669mO A037 = A03("JPEGInterchangeFormat", hashMap);
        C202669mO A038 = A03("JPEGInterchangeFormatLength", hashMap);
        if (A037 != null && A038 != null) {
            int A004 = A00(A037, this);
            int A005 = A00(A038, this);
            if (this.A00 == 7) {
                A004 += this.A02;
            }
            if (A004 > 0 && A005 > 0) {
                this.A0C = true;
                if (this.A08 == null && this.A06 == null && this.A07 == null) {
                    byte[] bArr3 = new byte[A005];
                    r10.skip((long) A004);
                    r10.read(bArr3);
                    this.A0F = bArr3;
                }
                this.A05 = A004;
                this.A04 = A005;
            }
            if (A0P) {
                StringBuilder A0u3 = AnonymousClass000.A0u();
                A0u3.append("Setting thumbnail attributes with offset: ");
                A0u3.append(A004);
                Log.d("ExifInterface", AnonymousClass000.A0r(", length: ", A0u3, A005));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00e0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x009e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0E(X.C187478xw r25, int r26, int r27) {
        /*
            r24 = this;
            boolean r17 = A0P
            java.lang.String r5 = "ExifInterface"
            r6 = r25
            if (r17 == 0) goto L_0x0015
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "getJpegAttributes starting with: "
            java.lang.String r0 = X.AnonymousClass000.A0l(r6, r0, r1)
            android.util.Log.d(r5, r0)
        L_0x0015:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r6.A01 = r0
            byte r0 = r6.readByte()
            java.lang.String r2 = "Invalid marker: "
            r4 = -1
            if (r0 != r4) goto L_0x01ad
            byte r1 = r6.readByte()
            r0 = -40
            if (r1 != r0) goto L_0x019e
            r8 = 2
            r7 = 2
        L_0x002c:
            byte r2 = r6.readByte()
            if (r2 != r4) goto L_0x018a
            r9 = 1
            int r3 = r7 + 1
            byte r1 = r6.readByte()
            if (r17 == 0) goto L_0x0050
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Found JPEG segment indicator: "
            r2.append(r0)
            r0 = r1 & 255(0xff, float:3.57E-43)
            X.C90504aG.A0z(r0, r2)
            java.lang.String r0 = r2.toString()
            android.util.Log.d(r5, r0)
        L_0x0050:
            int r7 = r3 + 1
            r0 = -39
            r2 = r24
            if (r1 == r0) goto L_0x0185
            r0 = -38
            if (r1 == r0) goto L_0x0185
            int r3 = r6.readUnsignedShort()
            int r3 = r3 - r8
            int r7 = r7 + 2
            if (r17 == 0) goto L_0x0084
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "JPEG segment: "
            r8.append(r0)
            r0 = r1 & 255(0xff, float:3.57E-43)
            X.C90504aG.A0z(r0, r8)
            java.lang.String r0 = " (length: "
            r8.append(r0)
            int r0 = r3 + 2
            r8.append(r0)
            java.lang.String r0 = X.C90474aD.A0f(r8)
            android.util.Log.d(r5, r0)
        L_0x0084:
            java.lang.String r16 = "Invalid length"
            if (r3 < 0) goto L_0x0180
            r0 = -31
            r15 = 0
            r10 = r27
            if (r1 == r0) goto L_0x00eb
            r0 = -2
            if (r1 == r0) goto L_0x0154
            switch(r1) {
                case -64: goto L_0x00a4;
                case -63: goto L_0x00a4;
                case -62: goto L_0x00a4;
                case -61: goto L_0x00a4;
                default: goto L_0x0095;
            }
        L_0x0095:
            switch(r1) {
                case -59: goto L_0x00a4;
                case -58: goto L_0x00a4;
                case -57: goto L_0x00a4;
                default: goto L_0x0098;
            }
        L_0x0098:
            switch(r1) {
                case -55: goto L_0x00a4;
                case -54: goto L_0x00a4;
                case -53: goto L_0x00a4;
                default: goto L_0x009b;
            }
        L_0x009b:
            switch(r1) {
                case -51: goto L_0x00a4;
                case -50: goto L_0x00a4;
                case -49: goto L_0x00a4;
                default: goto L_0x009e;
            }
        L_0x009e:
            r6.A00(r3)
            int r7 = r7 + r3
            r8 = 2
            goto L_0x002c
        L_0x00a4:
            r6.A00(r9)
            java.util.HashMap[] r13 = r2.A0I
            r12 = r13[r27]
            r11 = 4
            if (r10 == r11) goto L_0x00e8
            java.lang.String r9 = "ImageLength"
        L_0x00b0:
            int r0 = r6.readUnsignedShort()
            long r0 = (long) r0
            java.nio.ByteOrder r14 = r2.A09
            r8 = 1
            long[] r8 = new long[r8]
            r8[r15] = r0
            X.9mO r0 = X.C202669mO.A02(r14, r8)
            r12.put(r9, r0)
            r9 = r13[r27]
            if (r10 == r11) goto L_0x00e5
            java.lang.String r10 = "ImageWidth"
        L_0x00c9:
            int r0 = r6.readUnsignedShort()
            long r0 = (long) r0
            java.nio.ByteOrder r8 = r2.A09
            r2 = 1
            long[] r2 = new long[r2]
            r2[r15] = r0
            X.9mO r0 = X.C202669mO.A02(r8, r2)
            r9.put(r10, r0)
            int r3 = r3 + -5
            if (r3 >= 0) goto L_0x009e
            java.io.IOException r0 = X.C90524aI.A0X(r16)
            throw r0
        L_0x00e5:
            java.lang.String r10 = "ThumbnailImageWidth"
            goto L_0x00c9
        L_0x00e8:
            java.lang.String r9 = "ThumbnailImageLength"
            goto L_0x00b0
        L_0x00eb:
            byte[] r12 = new byte[r3]
            r6.readFully(r12)
            int r14 = r7 + r3
            byte[] r13 = A0T
            if (r13 == 0) goto L_0x0105
            int r11 = r13.length
            if (r3 < r11) goto L_0x0105
            r8 = 0
        L_0x00fa:
            if (r8 >= r11) goto L_0x0140
            byte r1 = r12[r8]
            byte r0 = r13[r8]
            if (r1 != r0) goto L_0x0105
            int r8 = r8 + 1
            goto L_0x00fa
        L_0x0105:
            byte[] r11 = A0v
            if (r11 == 0) goto L_0x0152
            int r10 = r11.length
            if (r3 < r10) goto L_0x0152
            r8 = 0
        L_0x010d:
            if (r8 >= r10) goto L_0x0118
            byte r1 = r12[r8]
            byte r0 = r11[r8]
            if (r1 != r0) goto L_0x0152
            int r8 = r8 + 1
            goto L_0x010d
        L_0x0118:
            int r7 = r7 + r10
            byte[] r12 = java.util.Arrays.copyOfRange(r12, r10, r3)
            java.lang.String r11 = "Xmp"
            java.lang.String r0 = r2.A0Z(r11)
            if (r0 != 0) goto L_0x0152
            java.util.HashMap[] r0 = r2.A0I
            r10 = r0[r15]
            int r8 = r12.length
            long r0 = (long) r7
            X.9mO r3 = new X.9mO
            r22 = 1
            r18 = r3
            r19 = r0
            r21 = r12
            r23 = r8
            r18.<init>(r19, r21, r22, r23)
            r10.put(r11, r3)
            r2.A0E = r9
            goto L_0x0152
        L_0x0140:
            byte[] r1 = java.util.Arrays.copyOfRange(r12, r11, r3)
            int r0 = r26 + r7
            int r0 = r0 + r11
            A0M(r2, r1, r0, r10)
            X.8xw r0 = new X.8xw
            r0.<init>(r1)
            r2.A0D(r0)
        L_0x0152:
            r7 = r14
            goto L_0x0176
        L_0x0154:
            byte[] r8 = new byte[r3]
            int r0 = r6.read(r8)
            if (r0 != r3) goto L_0x0179
            java.lang.String r3 = "UserComment"
            java.lang.String r0 = r2.A0Z(r3)
            if (r0 != 0) goto L_0x0176
            java.util.HashMap[] r0 = r2.A0I
            r2 = r0[r9]
            java.nio.charset.Charset r1 = A0O
            java.lang.String r0 = new java.lang.String
            r0.<init>(r8, r1)
            X.9mO r0 = X.C202669mO.A00(r0)
            r2.put(r3, r0)
        L_0x0176:
            r3 = 0
            goto L_0x009e
        L_0x0179:
            java.lang.String r0 = "Invalid exif"
            java.io.IOException r0 = X.C90524aI.A0X(r0)
            throw r0
        L_0x0180:
            java.io.IOException r0 = X.C90524aI.A0X(r16)
            throw r0
        L_0x0185:
            java.nio.ByteOrder r0 = r2.A09
            r6.A01 = r0
            return
        L_0x018a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Invalid marker:"
            r1.append(r0)
            r0 = r2 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.io.IOException r0 = X.C90464aC.A0M(r0, r1)
            throw r0
        L_0x019e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r2)
            r0 = 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.io.IOException r0 = X.C90464aC.A0M(r0, r1)
            throw r0
        L_0x01ad:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r2)
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.io.IOException r0 = X.C90464aC.A0M(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203859oz.A0E(X.8xw, int, int):void");
    }

    private void A0G(C187138xK r20) {
        HashMap[] hashMapArr;
        byte[] bArr;
        long j;
        int[] iArr = new int[10];
        int[] iArr2 = new int[10];
        C197869cV[] r17 = A0w;
        int i = 0;
        do {
            A0U(r17[i].A03);
            i++;
        } while (i < 6);
        if (this.A0C) {
            if (this.A0D) {
                A0U("StripOffsets");
                A0U("StripByteCounts");
            } else {
                A0U("JPEGInterchangeFormat");
                A0U("JPEGInterchangeFormatLength");
            }
        }
        int i2 = 0;
        do {
            hashMapArr = this.A0I;
            for (Object obj : hashMapArr[i2].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    hashMapArr[i2].remove(entry.getKey());
                }
            }
            i2++;
        } while (i2 < 10);
        if (!hashMapArr[1].isEmpty()) {
            A0K(this, r17[1].A03, hashMapArr[0]);
        }
        if (!hashMapArr[2].isEmpty()) {
            A0K(this, r17[2].A03, hashMapArr[0]);
        }
        if (!hashMapArr[3].isEmpty()) {
            A0K(this, r17[3].A03, hashMapArr[1]);
        }
        if (this.A0C) {
            boolean z = this.A0D;
            HashMap hashMap = hashMapArr[4];
            if (z) {
                hashMap.put("StripOffsets", C202669mO.A01(this.A09, new int[]{0}));
                hashMapArr[4].put("StripByteCounts", C202669mO.A01(this.A09, new int[]{this.A04}));
            } else {
                A0K(this, "JPEGInterchangeFormat", hashMap);
                hashMapArr[4].put("JPEGInterchangeFormatLength", C202669mO.A02(this.A09, new long[]{(long) this.A04}));
            }
        }
        int i3 = 0;
        do {
            Iterator A102 = C36371kC.A10(hashMapArr[i3]);
            int i4 = 0;
            while (A102.hasNext()) {
                C202669mO r14 = (C202669mO) C36351kA.A0u(A102);
                int i5 = A0m[r14.A00] * r14.A01;
                if (i5 > 4) {
                    i4 += i5;
                }
            }
            iArr2[i3] = iArr2[i3] + i4;
            i3++;
        } while (i3 < 10);
        int i6 = 8;
        int i7 = 0;
        do {
            if (!hashMapArr[i7].isEmpty()) {
                iArr[i7] = i6;
                i6 = C165607th.A0C(iArr2, i7, (hashMapArr[i7].size() * 12) + 2 + 4, i6);
            }
            i7++;
        } while (i7 < 10);
        if (this.A0C) {
            boolean z2 = this.A0D;
            HashMap hashMap2 = hashMapArr[4];
            if (z2) {
                hashMap2.put("StripOffsets", C202669mO.A01(this.A09, new int[]{i6}));
            } else {
                hashMap2.put("JPEGInterchangeFormat", C202669mO.A02(this.A09, new long[]{(long) i6}));
            }
            this.A05 = i6;
            i6 += this.A04;
        }
        if (this.A00 == 4) {
            i6 += 8;
        }
        if (A0P) {
            int i8 = 0;
            do {
                Object[] objArr = new Object[5];
                AnonymousClass000.A1L(objArr, i8, 0);
                AnonymousClass000.A1L(objArr, iArr[i8], 1);
                AnonymousClass000.A1L(objArr, hashMapArr[i8].size(), 2);
                C36341k9.A1T(objArr, iArr2[i8]);
                AnonymousClass000.A1L(objArr, i6, 4);
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", objArr));
                i8++;
            } while (i8 < 10);
        }
        if (!hashMapArr[1].isEmpty()) {
            hashMapArr[0].put(r17[1].A03, C202669mO.A02(this.A09, new long[]{(long) iArr[1]}));
        }
        if (!hashMapArr[2].isEmpty()) {
            hashMapArr[0].put(r17[2].A03, C202669mO.A02(this.A09, new long[]{(long) iArr[2]}));
        }
        if (!hashMapArr[3].isEmpty()) {
            hashMapArr[1].put(r17[3].A03, C202669mO.A02(this.A09, new long[]{(long) iArr[3]}));
        }
        int i9 = this.A00;
        C187138xK r10 = r20;
        if (i9 == 4) {
            r10.A01((short) i6);
            bArr = A0T;
            r10.write(bArr);
        } else if (i9 == 13) {
            r10.A00(i6);
            bArr = A0X;
            r10.write(bArr);
        } else if (i9 == 14) {
            r10.write(A0d);
            r10.A00(i6);
        }
        ByteOrder byteOrder = this.A09;
        ByteOrder byteOrder2 = ByteOrder.BIG_ENDIAN;
        short s = 18761;
        if (byteOrder == byteOrder2) {
            s = 19789;
        }
        r10.A01(s);
        r10.A00 = this.A09;
        r10.A01((short) 42);
        r10.A00((int) 8);
        int i10 = 0;
        do {
            if (!hashMapArr[i10].isEmpty()) {
                r10.A01((short) hashMapArr[i10].size());
                HashMap hashMap3 = hashMapArr[i10];
                int size = iArr[i10] + 2 + (hashMap3.size() * 12) + 4;
                Iterator A103 = C36371kC.A10(hashMap3);
                while (A103.hasNext()) {
                    Map.Entry A112 = AnonymousClass000.A11(A103);
                    int i11 = ((C197869cV) A17[i10].get(A112.getKey())).A00;
                    C202669mO r15 = (C202669mO) A112.getValue();
                    int[] iArr3 = A0m;
                    int i12 = r15.A00;
                    int i13 = iArr3[i12];
                    int i14 = r15.A01;
                    int i15 = i13 * i14;
                    r10.A01((short) i11);
                    r10.A01((short) i12);
                    r10.A00(i14);
                    if (i15 > 4) {
                        r10.A00((int) ((long) size));
                        size += i15;
                    } else {
                        r10.write(r15.A03);
                        while (i15 < 4) {
                            r10.A01.write(0);
                            i15++;
                        }
                    }
                }
                if (i10 != 0 || hashMapArr[4].isEmpty()) {
                    j = 0;
                } else {
                    j = (long) iArr[4];
                }
                r10.A00((int) j);
                Iterator A104 = C36371kC.A10(hashMapArr[i10]);
                while (A104.hasNext()) {
                    byte[] bArr2 = ((C202669mO) C36351kA.A0u(A104)).A03;
                    int length = bArr2.length;
                    if (length > 4) {
                        r10.write(bArr2, 0, length);
                    }
                }
            }
            i10++;
        } while (i10 < 10);
        if (this.A0C) {
            r10.write(A0c());
        }
        if (this.A00 == 14 && i6 % 2 == 1) {
            r10.A01.write(0);
        }
        r10.A00 = byteOrder2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01d4, code lost:
        if (r7 == 7) goto L_0x01d6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0I(X.C167477y0 r26, int r27) {
        /*
            r25 = this;
            r9 = r25
            java.util.Set r0 = r9.A0A
            r24 = r0
            r10 = r26
            int r0 = r10.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = r24
            r0.add(r1)
            short r23 = r10.readShort()
            boolean r22 = A0P
            java.lang.String r8 = "ExifInterface"
            if (r22 == 0) goto L_0x002c
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "numberOfDirectoryEntry: "
            r0 = r23
            java.lang.String r0 = X.AnonymousClass000.A0r(r1, r2, r0)
            android.util.Log.d(r8, r0)
        L_0x002c:
            if (r23 <= 0) goto L_0x0306
            r12 = 0
            r21 = 0
        L_0x0031:
            r4 = 5
            r1 = r23
            r0 = r21
            if (r0 >= r1) goto L_0x02af
            int r0 = r10.readUnsignedShort()
            int r7 = r10.readUnsignedShort()
            int r11 = r10.readInt()
            int r1 = r10.A00
            long r2 = (long) r1
            r16 = 4
            long r2 = r2 + r16
            java.util.HashMap[] r1 = A16
            r1 = r1[r27]
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
            java.lang.Object r6 = r1.get(r15)
            X.9cV r6 = (X.C197869cV) r6
            r5 = 3
            if (r22 == 0) goto L_0x0077
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r27)
            X.C90494aF.A1H(r1, r15, r4)
            if (r6 == 0) goto L_0x02ac
            java.lang.String r13 = r6.A03
        L_0x0069:
            r1 = 2
            r4[r1] = r13
            X.AnonymousClass000.A1L(r4, r7, r5)
            X.C36341k9.A1U(r4, r11)
            java.lang.String r1 = "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"
            X.C165587tf.A1M(r1, r8, r4)
        L_0x0077:
            r13 = 7
            if (r6 != 0) goto L_0x0099
            if (r22 == 0) goto L_0x008f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r4 = "Skip the tag entry since tag number is not defined: "
            r1.append(r4)
            r1.append(r0)
        L_0x0088:
            java.lang.String r0 = r1.toString()
        L_0x008c:
            android.util.Log.d(r8, r0)
        L_0x008f:
            r10.A01(r2)
        L_0x0092:
            int r0 = r21 + 1
            short r0 = (short) r0
            r21 = r0
            r12 = 0
            goto L_0x0031
        L_0x0099:
            if (r7 <= 0) goto L_0x029c
            int[] r14 = A0m
            r0 = 14
            if (r7 >= r0) goto L_0x029c
            int r4 = r6.A01
            if (r4 == r13) goto L_0x01d4
            if (r7 == r13) goto L_0x01d6
            if (r4 == r7) goto L_0x01d4
            int r1 = r6.A02
            if (r1 == r7) goto L_0x01d4
            r0 = 4
            if (r4 == r0) goto L_0x00b2
            if (r1 != r0) goto L_0x01c8
        L_0x00b2:
            if (r7 != r5) goto L_0x01c8
        L_0x00b4:
            long r4 = (long) r11
            r0 = r14[r7]
            long r0 = (long) r0
            long r4 = r4 * r0
            r13 = 0
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x0270
            r13 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r0 > 0) goto L_0x0270
            java.lang.String r20 = "Compression"
            int r0 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f4
            int r13 = r10.readInt()
            if (r22 == 0) goto L_0x00df
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "seek to data offset: "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r13)
            android.util.Log.d(r8, r0)
        L_0x00df:
            int r1 = r9.A00
            r0 = 7
            if (r1 != r0) goto L_0x00f0
            java.lang.String r14 = r6.A03
            java.lang.String r0 = "MakerNote"
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x016e
            r9.A02 = r13
        L_0x00f0:
            long r0 = (long) r13
            r10.A01(r0)
        L_0x00f4:
            java.util.HashMap r0 = A0n
            java.lang.Number r13 = X.C36441kJ.A10(r15, r0)
            if (r22 == 0) goto L_0x0111
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "nextIfdType: "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = " byteCount: "
            java.lang.String r0 = X.C36381kD.A0z(r0, r1, r4)
            android.util.Log.d(r8, r0)
        L_0x0111:
            r12 = 8
            if (r13 == 0) goto L_0x0209
            r0 = -1
            r4 = 3
            if (r7 == r4) goto L_0x0163
            r4 = 4
            if (r7 == r4) goto L_0x015a
            if (r7 == r12) goto L_0x0168
            r4 = 9
            if (r7 == r4) goto L_0x0155
            r4 = 13
            if (r7 == r4) goto L_0x0155
        L_0x0127:
            if (r22 == 0) goto L_0x013a
            java.lang.Object[] r7 = X.AnonymousClass001.A0M()
            X.C90474aD.A1S(r7, r0)
            java.lang.String r5 = r6.A03
            r4 = 1
            r7[r4] = r5
            java.lang.String r4 = "Offset: %d, tagName: %s"
            X.C165587tf.A1M(r4, r8, r7)
        L_0x013a:
            r5 = 0
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x01d9
            int r5 = (int) r0
            r4 = r24
            boolean r4 = X.AnonymousClass000.A1Z(r4, r5)
            if (r4 != 0) goto L_0x01e8
            r10.A01(r0)
            int r0 = r13.intValue()
            r9.A0I(r10, r0)
            goto L_0x008f
        L_0x0155:
            int r0 = r10.readInt()
            goto L_0x016c
        L_0x015a:
            int r0 = r10.readInt()
            long r0 = X.C165597tg.A0C(r0)
            goto L_0x0127
        L_0x0163:
            int r0 = r10.readUnsignedShort()
            goto L_0x016c
        L_0x0168:
            short r0 = r10.readShort()
        L_0x016c:
            long r0 = (long) r0
            goto L_0x0127
        L_0x016e:
            r1 = 6
            r0 = r27
            if (r0 != r1) goto L_0x00f0
            java.lang.String r0 = "ThumbnailImage"
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x00f0
            r9.A0H = r13
            r9.A0G = r11
            X.9mO r19 = A02(r9, r1)
            int r0 = r9.A0H
            long r0 = (long) r0
            java.nio.ByteOrder r14 = r9.A09
            r16 = r14
            r14 = 1
            long[] r14 = new long[r14]
            r14[r12] = r0
            r0 = r16
            X.9mO r18 = X.C202669mO.A02(r0, r14)
            int r0 = r9.A0G
            long r0 = (long) r0
            java.nio.ByteOrder r14 = r9.A09
            r16 = r14
            r14 = 1
            long[] r14 = new long[r14]
            r14[r12] = r0
            r0 = r16
            X.9mO r17 = X.C202669mO.A02(r0, r14)
            java.util.HashMap[] r12 = r9.A0I
            r16 = 4
            r14 = r12[r16]
            r1 = r20
            r0 = r19
            r14.put(r1, r0)
            r14 = r12[r16]
            java.lang.String r1 = "JPEGInterchangeFormat"
            r0 = r18
            r14.put(r1, r0)
            r12 = r12[r16]
            java.lang.String r1 = "JPEGInterchangeFormatLength"
            r0 = r17
            r12.put(r1, r0)
            goto L_0x00f0
        L_0x01c8:
            r0 = 9
            if (r4 == r0) goto L_0x01ce
            if (r1 != r0) goto L_0x0280
        L_0x01ce:
            r0 = 8
            if (r7 != r0) goto L_0x0280
            goto L_0x00b4
        L_0x01d4:
            if (r7 != r13) goto L_0x00b4
        L_0x01d6:
            r7 = r4
            goto L_0x00b4
        L_0x01d9:
            if (r22 == 0) goto L_0x008f
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()
            java.lang.String r4 = "Skip jump into the IFD since its offset is invalid: "
            r5.append(r4)
            r5.append(r0)
            goto L_0x0203
        L_0x01e8:
            if (r22 == 0) goto L_0x008f
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()
            java.lang.String r4 = "Skip jump into the IFD since it has already been read: IfdType "
            r5.append(r4)
            r5.append(r13)
            java.lang.String r4 = " (at "
            r5.append(r4)
            r5.append(r0)
            java.lang.String r0 = ")"
            r5.append(r0)
        L_0x0203:
            java.lang.String r0 = r5.toString()
            goto L_0x008c
        L_0x0209:
            int r1 = r10.A00
            int r0 = r9.A01
            int r1 = r1 + r0
            int r0 = (int) r4
            byte[] r5 = new byte[r0]
            r10.readFully(r5)
            long r0 = (long) r1
            X.9mO r4 = new X.9mO
            r13 = r4
            r14 = r0
            r16 = r5
            r17 = r7
            r18 = r11
            r13.<init>(r14, r16, r17, r18)
            java.util.HashMap[] r0 = r9.A0I
            r0 = r0[r27]
            java.lang.String r5 = r6.A03
            r0.put(r5, r4)
            java.lang.String r0 = "DNGVersion"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0236
            r0 = 3
            r9.A00 = r0
        L_0x0236:
            java.lang.String r0 = "Make"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0246
            java.lang.String r0 = "Model"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0254
        L_0x0246:
            java.nio.ByteOrder r0 = r9.A09
            java.lang.String r1 = r4.A05(r0)
            java.lang.String r0 = "PENTAX"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0265
        L_0x0254:
            r0 = r20
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0267
            int r1 = A00(r4, r9)
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r1 != r0) goto L_0x0267
        L_0x0265:
            r9.A00 = r12
        L_0x0267:
            int r0 = r10.A00
            long r0 = (long) r0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0092
            goto L_0x008f
        L_0x0270:
            if (r22 == 0) goto L_0x008f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Skip the tag entry since the number of components is invalid: "
            r1.append(r0)
            r1.append(r11)
            goto L_0x0088
        L_0x0280:
            if (r22 == 0) goto L_0x008f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Skip the tag entry since data format ("
            r1.append(r0)
            java.lang.String[] r0 = A0M
            X.C165617ti.A0g(r1, r0, r7)
            java.lang.String r0 = ") is unexpected for tag: "
            r1.append(r0)
            java.lang.String r0 = r6.A03
            r1.append(r0)
            goto L_0x0088
        L_0x029c:
            if (r22 == 0) goto L_0x008f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Skip the tag entry since data format is invalid: "
            r1.append(r0)
            r1.append(r7)
            goto L_0x0088
        L_0x02ac:
            r13 = 0
            goto L_0x0069
        L_0x02af:
            int r3 = r10.readInt()
            if (r22 == 0) goto L_0x02c1
            java.lang.Object[] r1 = X.AnonymousClass001.A0L()
            X.AnonymousClass000.A1L(r1, r3, r12)
            java.lang.String r0 = "nextIfdOffset: %d"
            X.C165587tf.A1M(r0, r8, r1)
        L_0x02c1:
            long r1 = (long) r3
            r5 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x02ee
            r0 = r24
            boolean r0 = X.AnonymousClass000.A1Z(r0, r3)
            if (r0 != 0) goto L_0x02f7
            r10.A01(r1)
            java.util.HashMap[] r2 = r9.A0I
            r1 = 4
            r0 = r2[r1]
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x02e2
            r9.A0I(r10, r1)
            return
        L_0x02e2:
            r0 = r2[r4]
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0306
            r9.A0I(r10, r4)
            return
        L_0x02ee:
            if (r22 == 0) goto L_0x0306
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Stop reading file since a wrong offset may cause an infinite loop: "
            goto L_0x02ff
        L_0x02f7:
            if (r22 == 0) goto L_0x0306
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
        L_0x02ff:
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r3)
            android.util.Log.d(r8, r0)
        L_0x0306:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203859oz.A0I(X.7y0, int):void");
    }

    private void A0J(C167477y0 r13, int i) {
        StringBuilder sb;
        String str;
        C202669mO A012;
        C202669mO A013;
        HashMap[] hashMapArr = this.A0I;
        C202669mO A032 = A03("DefaultCropSize", hashMapArr[i]);
        C202669mO A033 = A03("SensorTopBorder", hashMapArr[i]);
        C202669mO A034 = A03("SensorLeftBorder", hashMapArr[i]);
        C202669mO A035 = A03("SensorBottomBorder", hashMapArr[i]);
        C202669mO A036 = A03("SensorRightBorder", hashMapArr[i]);
        if (A032 != null) {
            int i2 = A032.A00;
            Object A042 = A032.A04(this.A09);
            if (i2 == 5) {
                AnonymousClass9Q9[] r8 = (AnonymousClass9Q9[]) A042;
                if (r8 == null || r8.length != 2) {
                    sb = AnonymousClass000.A0v("Invalid crop size values. cropSize=");
                    str = Arrays.toString(r8);
                    sb.append(str);
                    AnonymousClass000.A1A(sb, "ExifInterface");
                    return;
                }
                AnonymousClass9Q9 r2 = r8[0];
                A012 = C202669mO.A03(this.A09, new AnonymousClass9Q9[]{r2});
                AnonymousClass9Q9 r22 = r8[1];
                A013 = C202669mO.A03(this.A09, new AnonymousClass9Q9[]{r22});
            } else {
                int[] iArr = (int[]) A042;
                if (iArr == null || iArr.length != 2) {
                    sb = AnonymousClass000.A0v("Invalid crop size values. cropSize=");
                    str = Arrays.toString(iArr);
                    sb.append(str);
                    AnonymousClass000.A1A(sb, "ExifInterface");
                    return;
                }
                int i3 = iArr[0];
                A012 = C202669mO.A01(this.A09, new int[]{i3});
                int i4 = iArr[1];
                A013 = C202669mO.A01(this.A09, new int[]{i4});
            }
            hashMapArr[i].put("ImageWidth", A012);
            hashMapArr[i].put("ImageLength", A013);
        } else if (A033 == null || A034 == null || A035 == null || A036 == null) {
            Object obj = hashMapArr[i].get("ImageLength");
            Object obj2 = hashMapArr[i].get("ImageWidth");
            if (obj == null || obj2 == null) {
                C202669mO A037 = A03("JPEGInterchangeFormat", hashMapArr[i]);
                Object obj3 = hashMapArr[i].get("JPEGInterchangeFormatLength");
                if (A037 != null && obj3 != null) {
                    int A002 = A00(A037, this);
                    int A003 = A00(A037, this);
                    r13.A01((long) A002);
                    byte[] bArr = new byte[A003];
                    r13.read(bArr);
                    A0E(new C187478xw(bArr), A002, i);
                }
            }
        } else {
            int A004 = A00(A033, this);
            int A005 = A00(A035, this);
            int A006 = A00(A036, this);
            int A007 = A00(A034, this);
            if (A005 > A004 && A006 > A007) {
                C202669mO A014 = C202669mO.A01(this.A09, new int[]{A005 - A004});
                C202669mO A022 = A02(this, A006 - A007);
                hashMapArr[i].put("ImageLength", A014);
                hashMapArr[i].put("ImageWidth", A022);
            }
        }
    }

    public static void A0M(C203859oz r1, byte[] bArr, int i, int i2) {
        r1.A01 = i;
        C167477y0 r0 = new C167477y0(bArr);
        r1.A0C(r0);
        r1.A0I(r0, i2);
    }

    public static void A0N(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static void A0P(FileDescriptor fileDescriptor, int i) {
        Os.lseek(fileDescriptor, 0, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0130, code lost:
        r1 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0133, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        r3 = A0a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0138, code lost:
        if (r5 >= 8) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x013a, code lost:
        r1 = r8[r5];
        r0 = r3[r5];
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0140, code lost:
        if (r1 != r0) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0142, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0143, code lost:
        r3 = A0h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0146, code lost:
        if (r5 < 4) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        r6 = "FUJIFILMCCD-RAW".getBytes(java.nio.charset.Charset.defaultCharset());
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x014c, code lost:
        if (r8[r5] == r3[r5]) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x014e, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0151, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0152, code lost:
        r3 = A0i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0155, code lost:
        if (r5 < 4) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x015f, code lost:
        if (r8[(r5 + 4) + 4] == r3[r5]) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0161, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0164, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0166, code lost:
        r1 = 14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0169, code lost:
        r1 = 13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x016c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x016f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0170, code lost:
        if (r5 == null) goto L_0x0671;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0174, code lost:
        r1 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0043, code lost:
        if (r5 >= r6.length) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
        if (r8[r5] == r6[r5]) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r9 = new X.C187478xw(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r5 = (long) r9.readInt();
        r11 = new byte[4];
        r9.read(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0069, code lost:
        if (java.util.Arrays.equals(r11, A0S) == false) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006b, code lost:
        r14 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0073, code lost:
        if (r5 != 1) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0075, code lost:
        r5 = r9.readLong();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:?, code lost:
        r0 = X.C90524aI.A0X("Encountered corrupt PNG file.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007b, code lost:
        if (r5 >= 16) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007e, code lost:
        r14 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0080, code lost:
        r0 = (long) 5000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0083, code lost:
        if (r5 <= r0) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:?, code lost:
        r0 = X.C90524aI.A0X("Encountered corrupt WebP file.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x066e, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0085, code lost:
        r5 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x067a, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:?, code lost:
        r2 = A0P;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x067d, code lost:
        if (r2 != false) goto L_0x067f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x067f, code lost:
        android.util.Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x0686, code lost:
        A07();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0689, code lost:
        if (r2 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0086, code lost:
        r5 = r5 - r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x068f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x0690, code lost:
        A07();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0695, code lost:
        if (A0P != false) goto L_0x0697;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0697, code lost:
        A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x069a, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0089, code lost:
        if (r5 < 8) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008b, code lost:
        r1 = new byte[4];
        r15 = 0;
        r14 = false;
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0097, code lost:
        if (r15 >= (r5 / 4)) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009d, code lost:
        if (r9.read(r1) != 4) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a1, code lost:
        if (r15 == 1) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a9, code lost:
        if (java.util.Arrays.equals(r1, A0R) == false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b2, code lost:
        if (java.util.Arrays.equals(r1, A0Q) == false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b4, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b5, code lost:
        if (r14 == false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b8, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b9, code lost:
        if (r13 == false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00bc, code lost:
        r15 = r15 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r9.close();
        r1 = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00c6, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ca, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00cb, code lost:
        r5 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ce, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00cf, code lost:
        r5 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00d1, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00d4, code lost:
        if (A0P != false) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00d6, code lost:
        android.util.Log.d("ExifInterface", "Exception parsing HEIF file type box.", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00dd, code lost:
        if (r5 != null) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00e2, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r5 = new X.C187478xw(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r0 = A06(r5);
        r4.A09 = r0;
        r5.A01 = r0;
        r1 = r5.readShort();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00fc, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0101, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0105, code lost:
        if (r3 != false) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0107, code lost:
        r1 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0109, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        r5 = new X.C187478xw(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        r0 = A06(r5);
        r4.A09 = r0;
        r5.A01 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x011d, code lost:
        if (r5.readShort() == 85) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x011f, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0124, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0125, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x012a, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x012e, code lost:
        if (r3 != false) goto L_0x0130;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x013a A[Catch:{ IOException | UnsupportedOperationException -> 0x067a }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x016c A[ExcHandler: all (th java.lang.Throwable), Splitter:B:70:0x00e3] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0189 A[Catch:{ IOException | UnsupportedOperationException -> 0x067a }] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x021b A[Catch:{ RuntimeException -> 0x02b2, all -> 0x02b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x024b A[Catch:{ RuntimeException -> 0x02b2, all -> 0x02b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x02a4 A[Catch:{ RuntimeException -> 0x02b2, all -> 0x02b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0340 A[Catch:{ IOException | UnsupportedOperationException -> 0x067a }] */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x03fe A[Catch:{ IOException | UnsupportedOperationException -> 0x067a }] */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x067a A[ExcHandler: IOException | UnsupportedOperationException (r3v1 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:78:0x00fd] */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x0169 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:375:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d6 A[Catch:{ all -> 0x016f }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00df A[SYNTHETIC, Splitter:B:67:0x00df] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x011f A[Catch:{ Exception -> 0x012a, all -> 0x0124 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0124 A[Catch:{ IOException | UnsupportedOperationException -> 0x067a }, ExcHandler: all (th java.lang.Throwable), PHI: r5 
      PHI: (r5v13 X.8xw) = (r5v23 X.8xw), (r5v24 X.8xw) binds: [B:88:0x010f, B:72:0x00e8] A[DONT_GENERATE, DONT_INLINE], Splitter:B:72:0x00e8] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0Q(java.io.InputStream r20) {
        /*
            r19 = this;
            java.lang.String r0 = "inputstream shouldn't be null"
            r3 = r20
            java.util.Objects.requireNonNull(r3, r0)
            r7 = 0
            r1 = 0
        L_0x0009:
            r4 = r19
            java.util.HashMap[] r10 = r4.A0I     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            java.util.HashMap r0 = X.AnonymousClass001.A0J()     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r10[r1] = r0     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            int r1 = r1 + 1
            r0 = 10
            if (r1 < r0) goto L_0x0009
            r1 = 5000(0x1388, float:7.006E-42)
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r2.<init>(r3, r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r2.mark(r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            byte[] r8 = new byte[r1]     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r2.read(r8)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r2.reset()     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r6 = 0
        L_0x002c:
            byte[] r5 = A0U     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r0 = 3
            if (r6 >= r0) goto L_0x0177
            byte r3 = r8[r6]     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            byte r0 = r5[r6]     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            if (r3 == r0) goto L_0x004f
            java.nio.charset.Charset r3 = java.nio.charset.Charset.defaultCharset()     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            java.lang.String r0 = "FUJIFILMCCD-RAW"
            byte[] r6 = r0.getBytes(r3)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r5 = 0
        L_0x0042:
            int r0 = r6.length     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            if (r5 >= r0) goto L_0x0174
            byte r3 = r8[r5]     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            byte r0 = r6[r5]     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            if (r3 == r0) goto L_0x004c
            goto L_0x0052
        L_0x004c:
            int r5 = r5 + 1
            goto L_0x0042
        L_0x004f:
            int r6 = r6 + 1
            goto L_0x002c
        L_0x0052:
            r5 = 0
            X.8xw r9 = new X.8xw     // Catch:{ Exception -> 0x00d1 }
            r9.<init>(r8)     // Catch:{ Exception -> 0x00d1 }
            int r0 = r9.readInt()     // Catch:{ Exception -> 0x00ce, all -> 0x00ca }
            long r5 = (long) r0     // Catch:{ Exception -> 0x00ce, all -> 0x00ca }
            r3 = 4
            byte[] r11 = new byte[r3]     // Catch:{ Exception -> 0x00ce, all -> 0x00ca }
            r9.read(r11)     // Catch:{ Exception -> 0x00ce, all -> 0x00ca }
            byte[] r0 = A0S     // Catch:{ Exception -> 0x00ce, all -> 0x00ca }
            boolean r0 = java.util.Arrays.equals(r11, r0)     // Catch:{ Exception -> 0x00ce, all -> 0x00ca }
            if (r0 == 0) goto L_0x00c6
            r14 = 16
            r12 = 8
            r17 = 1
            int r0 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r0 != 0) goto L_0x007e
            long r5 = r9.readLong()     // Catch:{ Exception -> 0x00ce, all -> 0x00ca }
            int r0 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x0080
            goto L_0x00c6
        L_0x007e:
            r14 = 8
        L_0x0080:
            long r0 = (long) r1     // Catch:{ Exception -> 0x00ce, all -> 0x00ca }
            int r11 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r11 <= 0) goto L_0x0086
            r5 = r0
        L_0x0086:
            long r5 = r5 - r14
            int r0 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x00c6
            byte[] r1 = new byte[r3]     // Catch:{ Exception -> 0x00ce, all -> 0x00ca }
            r15 = 0
            r14 = 0
            r13 = 0
        L_0x0091:
            r11 = 4
            long r11 = r5 / r11
            int r0 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c6
            int r0 = r9.read(r1)     // Catch:{ Exception -> 0x00ce, all -> 0x00ca }
            if (r0 != r3) goto L_0x00c6
            int r0 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x00bc
            byte[] r0 = A0R     // Catch:{ Exception -> 0x00ce, all -> 0x00ca }
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ Exception -> 0x00ce, all -> 0x00ca }
            if (r0 == 0) goto L_0x00ac
            goto L_0x00b8
        L_0x00ac:
            byte[] r0 = A0Q     // Catch:{ Exception -> 0x00ce, all -> 0x00ca }
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ Exception -> 0x00ce, all -> 0x00ca }
            if (r0 == 0) goto L_0x00b5
            r13 = 1
        L_0x00b5:
            if (r14 == 0) goto L_0x00bc
            goto L_0x00b9
        L_0x00b8:
            r14 = 1
        L_0x00b9:
            if (r13 == 0) goto L_0x00bc
            goto L_0x00bf
        L_0x00bc:
            long r15 = r15 + r17
            goto L_0x0091
        L_0x00bf:
            r9.close()     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r1 = 12
            goto L_0x0178
        L_0x00c6:
            r9.close()     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            goto L_0x00e2
        L_0x00ca:
            r0 = move-exception
            r5 = r9
            goto L_0x066e
        L_0x00ce:
            r3 = move-exception
            r5 = r9
            goto L_0x00d2
        L_0x00d1:
            r3 = move-exception
        L_0x00d2:
            boolean r0 = A0P     // Catch:{ all -> 0x016f }
            if (r0 == 0) goto L_0x00dd
            java.lang.String r1 = "ExifInterface"
            java.lang.String r0 = "Exception parsing HEIF file type box."
            android.util.Log.d(r1, r0, r3)     // Catch:{ all -> 0x016f }
        L_0x00dd:
            if (r5 == 0) goto L_0x00e2
            r5.close()     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
        L_0x00e2:
            r3 = 0
            X.8xw r5 = new X.8xw     // Catch:{ Exception -> 0x0105, all -> 0x016c }
            r5.<init>(r8)     // Catch:{ Exception -> 0x0105, all -> 0x016c }
            java.nio.ByteOrder r0 = A06(r5)     // Catch:{ Exception -> 0x0101, all -> 0x0124 }
            r4.A09 = r0     // Catch:{ Exception -> 0x0101, all -> 0x0124 }
            r5.A01 = r0     // Catch:{ Exception -> 0x0101, all -> 0x0124 }
            short r1 = r5.readShort()     // Catch:{ Exception -> 0x0101, all -> 0x0124 }
            r0 = 20306(0x4f52, float:2.8455E-41)
            if (r1 == r0) goto L_0x00fc
            r0 = 21330(0x5352, float:2.989E-41)
            if (r1 != r0) goto L_0x00fd
        L_0x00fc:
            r3 = 1
        L_0x00fd:
            r5.close()     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            goto L_0x0105
        L_0x0101:
            r5.close()     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            goto L_0x0109
        L_0x0105:
            if (r3 == 0) goto L_0x0109
            r1 = 7
            goto L_0x0178
        L_0x0109:
            r3 = 0
            X.8xw r5 = new X.8xw     // Catch:{ Exception -> 0x012e, all -> 0x016c }
            r5.<init>(r8)     // Catch:{ Exception -> 0x012e, all -> 0x016c }
            java.nio.ByteOrder r0 = A06(r5)     // Catch:{ Exception -> 0x012a, all -> 0x0124 }
            r4.A09 = r0     // Catch:{ Exception -> 0x012a, all -> 0x0124 }
            r5.A01 = r0     // Catch:{ Exception -> 0x012a, all -> 0x0124 }
            short r1 = r5.readShort()     // Catch:{ Exception -> 0x012a, all -> 0x0124 }
            r0 = 85
            if (r1 != r0) goto L_0x0120
            r3 = 1
        L_0x0120:
            r5.close()     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            goto L_0x012e
        L_0x0124:
            r0 = move-exception
            r5.close()     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            goto L_0x0671
        L_0x012a:
            r5.close()     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            goto L_0x0133
        L_0x012e:
            if (r3 == 0) goto L_0x0133
            r1 = 10
            goto L_0x0178
        L_0x0133:
            r5 = 0
        L_0x0134:
            byte[] r3 = A0a     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r0 = 8
            if (r5 >= r0) goto L_0x0169
            byte r1 = r8[r5]     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            byte r0 = r3[r5]     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            int r5 = r5 + 1
            if (r1 == r0) goto L_0x0134
            r5 = 0
        L_0x0143:
            byte[] r3 = A0h     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r0 = 4
            if (r5 >= r0) goto L_0x0151
            byte r1 = r8[r5]     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            byte r0 = r3[r5]     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            if (r1 != r0) goto L_0x0164
            int r5 = r5 + 1
            goto L_0x0143
        L_0x0151:
            r5 = 0
        L_0x0152:
            byte[] r3 = A0i     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r0 = 4
            if (r5 >= r0) goto L_0x0166
            int r0 = r5 + 4
            int r0 = r0 + 4
            byte r1 = r8[r0]     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            byte r0 = r3[r5]     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            if (r1 != r0) goto L_0x0164
            int r5 = r5 + 1
            goto L_0x0152
        L_0x0164:
            r1 = 0
            goto L_0x0178
        L_0x0166:
            r1 = 14
            goto L_0x0178
        L_0x0169:
            r1 = 13
            goto L_0x0178
        L_0x016c:
            r0 = move-exception
            goto L_0x0671
        L_0x016f:
            r0 = move-exception
            if (r5 == 0) goto L_0x0671
            goto L_0x066e
        L_0x0174:
            r1 = 9
            goto L_0x0178
        L_0x0177:
            r1 = 4
        L_0x0178:
            r4.A00 = r1     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r0 = 4
            if (r1 == r0) goto L_0x03fe
            r0 = 9
            if (r1 == r0) goto L_0x03fe
            r0 = 13
            if (r1 == r0) goto L_0x03fe
            r0 = 14
            if (r1 == r0) goto L_0x03fe
            X.7y0 r5 = new X.7y0     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r5.<init>((java.io.InputStream) r2)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            int r1 = r4.A00     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r0 = 12
            if (r1 != r0) goto L_0x02c7
            java.lang.String r6 = "yes"
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r0 = 28
            if (r1 < r0) goto L_0x02bf
            android.media.MediaMetadataRetriever r1 = new android.media.MediaMetadataRetriever     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r1.<init>()     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            X.7uH r0 = new X.7uH     // Catch:{ RuntimeException -> 0x02b2 }
            r0.<init>(r5, r4)     // Catch:{ RuntimeException -> 0x02b2 }
            X.AnonymousClass93N.A00(r0, r1)     // Catch:{ RuntimeException -> 0x02b2 }
            r0 = 33
            java.lang.String r14 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x02b2 }
            r0 = 34
            java.lang.String r13 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x02b2 }
            r0 = 26
            java.lang.String r3 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x02b2 }
            r0 = 17
            java.lang.String r2 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x02b2 }
            boolean r0 = r6.equals(r3)     // Catch:{ RuntimeException -> 0x02b2 }
            r9 = 0
            if (r0 == 0) goto L_0x01db
            r0 = 29
            java.lang.String r9 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x02b2 }
            r0 = 30
            java.lang.String r8 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x02b2 }
            r0 = 31
            java.lang.String r6 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x02b2 }
            goto L_0x01f3
        L_0x01db:
            boolean r0 = r6.equals(r2)     // Catch:{ RuntimeException -> 0x02b2 }
            if (r0 == 0) goto L_0x0216
            r0 = 18
            java.lang.String r9 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x02b2 }
            r0 = 19
            java.lang.String r8 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x02b2 }
            r0 = 24
            java.lang.String r6 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x02b2 }
        L_0x01f3:
            if (r9 == 0) goto L_0x0204
            r3 = r10[r7]     // Catch:{ RuntimeException -> 0x02b2 }
            java.lang.String r2 = "ImageWidth"
            int r0 = java.lang.Integer.parseInt(r9)     // Catch:{ RuntimeException -> 0x02b2 }
            X.9mO r0 = A02(r4, r0)     // Catch:{ RuntimeException -> 0x02b2 }
            r3.put(r2, r0)     // Catch:{ RuntimeException -> 0x02b2 }
        L_0x0204:
            if (r8 == 0) goto L_0x0218
            r3 = r10[r7]     // Catch:{ RuntimeException -> 0x02b2 }
            java.lang.String r2 = "ImageLength"
            int r0 = java.lang.Integer.parseInt(r8)     // Catch:{ RuntimeException -> 0x02b2 }
            X.9mO r0 = A02(r4, r0)     // Catch:{ RuntimeException -> 0x02b2 }
            r3.put(r2, r0)     // Catch:{ RuntimeException -> 0x02b2 }
            goto L_0x0218
        L_0x0216:
            r8 = r9
            r6 = r9
        L_0x0218:
            r12 = 6
            if (r6 == 0) goto L_0x023d
            r11 = 1
            int r2 = java.lang.Integer.parseInt(r6)     // Catch:{ RuntimeException -> 0x02b2 }
            r0 = 90
            if (r2 == r0) goto L_0x0231
            r0 = 180(0xb4, float:2.52E-43)
            if (r2 == r0) goto L_0x022f
            r0 = 270(0x10e, float:3.78E-43)
            if (r2 != r0) goto L_0x0232
            r11 = 8
            goto L_0x0232
        L_0x022f:
            r11 = 3
            goto L_0x0232
        L_0x0231:
            r11 = 6
        L_0x0232:
            r3 = r10[r7]     // Catch:{ RuntimeException -> 0x02b2 }
            java.lang.String r2 = "Orientation"
            X.9mO r0 = A02(r4, r11)     // Catch:{ RuntimeException -> 0x02b2 }
            r3.put(r2, r0)     // Catch:{ RuntimeException -> 0x02b2 }
        L_0x023d:
            if (r14 == 0) goto L_0x026e
            if (r13 == 0) goto L_0x026e
            int r10 = java.lang.Integer.parseInt(r14)     // Catch:{ RuntimeException -> 0x02b2 }
            int r11 = java.lang.Integer.parseInt(r13)     // Catch:{ RuntimeException -> 0x02b2 }
            if (r11 <= r12) goto L_0x02a4
            long r2 = (long) r10     // Catch:{ RuntimeException -> 0x02b2 }
            r5.A01(r2)     // Catch:{ RuntimeException -> 0x02b2 }
            byte[] r2 = new byte[r12]     // Catch:{ RuntimeException -> 0x02b2 }
            int r0 = r5.read(r2)     // Catch:{ RuntimeException -> 0x02b2 }
            if (r0 != r12) goto L_0x029d
            int r10 = r10 + 6
            int r3 = r11 + -6
            byte[] r0 = A0T     // Catch:{ RuntimeException -> 0x02b2 }
            boolean r0 = java.util.Arrays.equals(r2, r0)     // Catch:{ RuntimeException -> 0x02b2 }
            if (r0 == 0) goto L_0x02ab
            byte[] r2 = new byte[r3]     // Catch:{ RuntimeException -> 0x02b2 }
            int r0 = r5.read(r2)     // Catch:{ RuntimeException -> 0x02b2 }
            if (r0 != r3) goto L_0x0296
            A0M(r4, r2, r10, r7)     // Catch:{ RuntimeException -> 0x02b2 }
        L_0x026e:
            boolean r0 = A0P     // Catch:{ RuntimeException -> 0x02b2 }
            if (r0 == 0) goto L_0x0291
            java.lang.String r3 = "ExifInterface"
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ RuntimeException -> 0x02b2 }
            java.lang.String r0 = "Heif meta: "
            r2.append(r0)     // Catch:{ RuntimeException -> 0x02b2 }
            r2.append(r9)     // Catch:{ RuntimeException -> 0x02b2 }
            java.lang.String r0 = "x"
            r2.append(r0)     // Catch:{ RuntimeException -> 0x02b2 }
            r2.append(r8)     // Catch:{ RuntimeException -> 0x02b2 }
            java.lang.String r0 = ", rotation "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r6, r2)     // Catch:{ RuntimeException -> 0x02b2 }
            android.util.Log.d(r3, r0)     // Catch:{ RuntimeException -> 0x02b2 }
        L_0x0291:
            r1.release()     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            goto L_0x03f3
        L_0x0296:
            java.lang.String r0 = "Can't read exif"
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ RuntimeException -> 0x02b2 }
            goto L_0x02b1
        L_0x029d:
            java.lang.String r0 = "Can't read identifier"
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ RuntimeException -> 0x02b2 }
            goto L_0x02b1
        L_0x02a4:
            java.lang.String r0 = "Invalid exif length"
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ RuntimeException -> 0x02b2 }
            goto L_0x02b1
        L_0x02ab:
            java.lang.String r0 = "Invalid identifier"
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ RuntimeException -> 0x02b2 }
        L_0x02b1:
            throw r0     // Catch:{ RuntimeException -> 0x02b2 }
        L_0x02b2:
            java.lang.String r0 = "Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported."
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass001.A0E(r0)     // Catch:{ all -> 0x02b9 }
            throw r0     // Catch:{ all -> 0x02b9 }
        L_0x02b9:
            r0 = move-exception
            r1.release()     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            goto L_0x0671
        L_0x02bf:
            java.lang.String r0 = "Reading EXIF from HEIF files is supported from SDK 28 and above"
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass001.A0E(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            goto L_0x0671
        L_0x02c7:
            r2 = 7
            if (r1 != r2) goto L_0x0380
            r4.A0H(r5)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r6 = 1
            r1 = r10[r6]     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            java.lang.String r0 = "MakerNote"
            X.9mO r0 = A03(r0, r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            if (r0 == 0) goto L_0x03f3
            byte[] r0 = r0.A03     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            X.7y0 r3 = new X.7y0     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r3.<init>((byte[]) r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            java.nio.ByteOrder r0 = r4.A09     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r3.A01 = r0     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            byte[] r11 = A0V     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r0 = 6
            byte[] r9 = new byte[r0]     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r3.readFully(r9)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r0 = 0
            r3.A01(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            byte[] r8 = A0W     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r0 = 10
            byte[] r1 = new byte[r0]     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r3.readFully(r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            boolean r0 = java.util.Arrays.equals(r9, r11)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            if (r0 == 0) goto L_0x0302
            r0 = 8
            goto L_0x030a
        L_0x0302:
            boolean r0 = java.util.Arrays.equals(r1, r8)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            if (r0 == 0) goto L_0x030d
            r0 = 12
        L_0x030a:
            r3.A01(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
        L_0x030d:
            r0 = 6
            r4.A0I(r3, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r1 = r10[r2]     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            java.lang.String r0 = "PreviewImageStart"
            java.lang.Object r8 = r1.get(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r1 = r10[r2]     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            java.lang.String r0 = "PreviewImageLength"
            java.lang.Object r3 = r1.get(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            if (r8 == 0) goto L_0x0334
            if (r3 == 0) goto L_0x0334
            r2 = 5
            r1 = r10[r2]     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            java.lang.String r0 = "JPEGInterchangeFormat"
            r1.put(r0, r8)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r1 = r10[r2]     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            java.lang.String r0 = "JPEGInterchangeFormatLength"
            r1.put(r0, r3)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
        L_0x0334:
            r0 = 8
            r1 = r10[r0]     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            java.lang.String r0 = "AspectFrame"
            X.9mO r1 = A03(r0, r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            if (r1 == 0) goto L_0x03f3
            java.nio.ByteOrder r0 = r4.A09     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            java.lang.Object r8 = r1.A04(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            int[] r8 = (int[]) r8     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            if (r8 == 0) goto L_0x0369
            int r1 = r8.length     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r0 = 4
            if (r1 != r0) goto L_0x0369
            r0 = 2
            r3 = r8[r0]     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r2 = r8[r7]     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            if (r3 <= r2) goto L_0x03f3
            r0 = 3
            r1 = r8[r0]     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r0 = r8[r6]     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            if (r1 <= r0) goto L_0x03f3
            int r3 = r3 - r2
            int r3 = r3 + 1
            int r1 = r1 - r0
            int r2 = r1 + 1
            if (r3 >= r2) goto L_0x03d1
            int r3 = r3 + r2
            int r2 = r3 - r2
            int r3 = r3 - r2
            goto L_0x03d1
        L_0x0369:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            java.lang.String r0 = "Invalid aspect frame values. frame="
            r1.append(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            java.lang.String r0 = java.util.Arrays.toString(r8)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            java.lang.String r0 = "ExifInterface"
            android.util.Log.w(r0, r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            goto L_0x03f3
        L_0x0380:
            r0 = 10
            if (r1 != r0) goto L_0x03cd
            boolean r0 = A0P     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            if (r0 == 0) goto L_0x0397
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            java.lang.String r0 = "getRw2Attributes starting with: "
            java.lang.String r1 = X.AnonymousClass000.A0l(r5, r0, r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            java.lang.String r0 = "ExifInterface"
            android.util.Log.d(r0, r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
        L_0x0397:
            r4.A0H(r5)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r1 = r10[r7]     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            java.lang.String r0 = "JpgFromRaw"
            X.9mO r1 = A03(r0, r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            if (r1 == 0) goto L_0x03b2
            byte[] r0 = r1.A03     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            X.8xw r6 = new X.8xw     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r6.<init>(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            long r2 = r1.A02     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            int r1 = (int) r2     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r0 = 5
            r4.A0E(r6, r1, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
        L_0x03b2:
            r1 = r10[r7]     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            java.lang.String r0 = "ISO"
            java.lang.Object r3 = r1.get(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r2 = 1
            r0 = r10[r2]     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            java.lang.String r1 = "PhotographicSensitivity"
            java.lang.Object r0 = r0.get(r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            if (r3 == 0) goto L_0x03f3
            if (r0 != 0) goto L_0x03f3
            r0 = r10[r2]     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r0.put(r1, r3)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            goto L_0x03f3
        L_0x03cd:
            r4.A0H(r5)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            goto L_0x03f3
        L_0x03d1:
            java.nio.ByteOrder r1 = r4.A09     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            int[] r0 = new int[r6]     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r0[r7] = r3     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            X.9mO r3 = X.C202669mO.A01(r1, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            java.nio.ByteOrder r1 = r4.A09     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            int[] r0 = new int[r6]     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r0[r7] = r2     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            X.9mO r2 = X.C202669mO.A01(r1, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r1 = r10[r7]     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            java.lang.String r0 = "ImageWidth"
            r1.put(r0, r3)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r1 = r10[r7]     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            java.lang.String r0 = "ImageLength"
            r1.put(r0, r2)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
        L_0x03f3:
            int r0 = r4.A01     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            long r0 = (long) r0     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r5.A01(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r4.A0D(r5)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            goto L_0x0672
        L_0x03fe:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            X.8xw r6 = new X.8xw     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r6.<init>(r2, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            int r1 = r4.A00     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r0 = 4
            if (r1 != r0) goto L_0x040f
            r4.A0E(r6, r7, r7)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            goto L_0x0672
        L_0x040f:
            r0 = 13
            if (r1 != r0) goto L_0x04fa
            boolean r0 = A0P     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            if (r0 == 0) goto L_0x0426
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            java.lang.String r0 = "getPngAttributes starting with: "
            java.lang.String r1 = X.AnonymousClass000.A0l(r6, r0, r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            java.lang.String r0 = "ExifInterface"
            android.util.Log.d(r0, r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
        L_0x0426:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r6.A01 = r0     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r0 = 8
            r6.A00(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r11 = 8
        L_0x0431:
            int r1 = r6.readInt()     // Catch:{ EOFException -> 0x04f2, IOException | UnsupportedOperationException -> 0x067a }
            r9 = 4
            int r2 = r11 + 4
            byte[] r8 = new byte[r9]     // Catch:{ EOFException -> 0x04f2, IOException | UnsupportedOperationException -> 0x067a }
            int r0 = r6.read(r8)     // Catch:{ EOFException -> 0x04f2, IOException | UnsupportedOperationException -> 0x067a }
            if (r0 != r9) goto L_0x04eb
            int r11 = r2 + 4
            r0 = 16
            if (r11 != r0) goto L_0x0456
            byte[] r0 = A0Z     // Catch:{ EOFException -> 0x04f2, IOException | UnsupportedOperationException -> 0x067a }
            boolean r0 = java.util.Arrays.equals(r8, r0)     // Catch:{ EOFException -> 0x04f2, IOException | UnsupportedOperationException -> 0x067a }
            if (r0 != 0) goto L_0x0456
            java.lang.String r0 = "Encountered invalid PNG file--IHDR chunk should appearas the first chunk"
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ EOFException -> 0x04f2, IOException | UnsupportedOperationException -> 0x067a }
            goto L_0x04f1
        L_0x0456:
            byte[] r0 = A0Y     // Catch:{ EOFException -> 0x04f2, IOException | UnsupportedOperationException -> 0x067a }
            boolean r0 = java.util.Arrays.equals(r8, r0)     // Catch:{ EOFException -> 0x04f2, IOException | UnsupportedOperationException -> 0x067a }
            if (r0 != 0) goto L_0x0672
            byte[] r0 = A0X     // Catch:{ EOFException -> 0x04f2, IOException | UnsupportedOperationException -> 0x067a }
            boolean r0 = java.util.Arrays.equals(r8, r0)     // Catch:{ EOFException -> 0x04f2, IOException | UnsupportedOperationException -> 0x067a }
            if (r0 == 0) goto L_0x0494
            byte[] r10 = new byte[r1]     // Catch:{ EOFException -> 0x04f2, IOException | UnsupportedOperationException -> 0x067a }
            int r0 = r6.read(r10)     // Catch:{ EOFException -> 0x04f2, IOException | UnsupportedOperationException -> 0x067a }
            if (r0 != r1) goto L_0x04b9
            int r5 = r6.readInt()     // Catch:{ EOFException -> 0x04f2, IOException | UnsupportedOperationException -> 0x067a }
            java.util.zip.CRC32 r3 = new java.util.zip.CRC32     // Catch:{ EOFException -> 0x04f2, IOException | UnsupportedOperationException -> 0x067a }
            r3.<init>()     // Catch:{ EOFException -> 0x04f2, IOException | UnsupportedOperationException -> 0x067a }
            r3.update(r8)     // Catch:{ EOFException -> 0x04f2, IOException | UnsupportedOperationException -> 0x067a }
            r3.update(r10)     // Catch:{ EOFException -> 0x04f2, IOException | UnsupportedOperationException -> 0x067a }
            long r1 = r3.getValue()     // Catch:{ EOFException -> 0x04f2, IOException | UnsupportedOperationException -> 0x067a }
            int r0 = (int) r1     // Catch:{ EOFException -> 0x04f2, IOException | UnsupportedOperationException -> 0x067a }
            if (r0 != r5) goto L_0x049b
            A0M(r4, r10, r11, r7)     // Catch:{ EOFException -> 0x04f2, IOException | UnsupportedOperationException -> 0x067a }
            r4.A09()     // Catch:{ EOFException -> 0x04f2, IOException | UnsupportedOperationException -> 0x067a }
            X.8xw r0 = new X.8xw     // Catch:{ EOFException -> 0x04f2, IOException | UnsupportedOperationException -> 0x067a }
            r0.<init>(r10)     // Catch:{ EOFException -> 0x04f2, IOException | UnsupportedOperationException -> 0x067a }
            r4.A0D(r0)     // Catch:{ EOFException -> 0x04f2, IOException | UnsupportedOperationException -> 0x067a }
            goto L_0x0672
        L_0x0494:
            int r0 = r1 + 4
            r6.A00(r0)     // Catch:{ EOFException -> 0x04f2, IOException | UnsupportedOperationException -> 0x067a }
            int r11 = r11 + r0
            goto L_0x0431
        L_0x049b:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ EOFException -> 0x04f2, IOException | UnsupportedOperationException -> 0x067a }
            java.lang.String r0 = "Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: "
            r2.append(r0)     // Catch:{ EOFException -> 0x04f2, IOException | UnsupportedOperationException -> 0x067a }
            r2.append(r5)     // Catch:{ EOFException -> 0x04f2, IOException | UnsupportedOperationException -> 0x067a }
            java.lang.String r0 = ", calculated CRC value: "
            r2.append(r0)     // Catch:{ EOFException -> 0x04f2, IOException | UnsupportedOperationException -> 0x067a }
            long r0 = r3.getValue()     // Catch:{ EOFException -> 0x04f2, IOException | UnsupportedOperationException -> 0x067a }
            java.lang.String r0 = X.C36411kG.A11(r2, r0)     // Catch:{ EOFException -> 0x04f2, IOException | UnsupportedOperationException -> 0x067a }
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ EOFException -> 0x04f2, IOException | UnsupportedOperationException -> 0x067a }
            goto L_0x04f1
        L_0x04b9:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ EOFException -> 0x04f2, IOException | UnsupportedOperationException -> 0x067a }
            java.lang.String r0 = "Failed to read given length for given PNG chunk type: "
            r5.append(r0)     // Catch:{ EOFException -> 0x04f2, IOException | UnsupportedOperationException -> 0x067a }
            r0 = 8
            java.lang.StringBuilder r3 = X.C90524aI.A0h(r0)     // Catch:{ EOFException -> 0x04f2, IOException | UnsupportedOperationException -> 0x067a }
            r2 = 0
        L_0x04c9:
            java.lang.Object[] r1 = X.AnonymousClass001.A0L()     // Catch:{ EOFException -> 0x04f2, IOException | UnsupportedOperationException -> 0x067a }
            byte r0 = r8[r2]     // Catch:{ EOFException -> 0x04f2, IOException | UnsupportedOperationException -> 0x067a }
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ EOFException -> 0x04f2, IOException | UnsupportedOperationException -> 0x067a }
            r1[r7] = r0     // Catch:{ EOFException -> 0x04f2, IOException | UnsupportedOperationException -> 0x067a }
            java.lang.String r0 = "%02x"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ EOFException -> 0x04f2, IOException | UnsupportedOperationException -> 0x067a }
            r3.append(r0)     // Catch:{ EOFException -> 0x04f2, IOException | UnsupportedOperationException -> 0x067a }
            int r2 = r2 + 1
            if (r2 < r9) goto L_0x04c9
            java.lang.String r0 = r3.toString()     // Catch:{ EOFException -> 0x04f2, IOException | UnsupportedOperationException -> 0x067a }
            java.io.IOException r0 = X.C90464aC.A0M(r0, r5)     // Catch:{ EOFException -> 0x04f2, IOException | UnsupportedOperationException -> 0x067a }
            goto L_0x04f1
        L_0x04eb:
            java.lang.String r0 = "Encountered invalid length while parsing PNG chunktype"
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ EOFException -> 0x04f2, IOException | UnsupportedOperationException -> 0x067a }
        L_0x04f1:
            throw r0     // Catch:{ EOFException -> 0x04f2, IOException | UnsupportedOperationException -> 0x067a }
        L_0x04f2:
            java.lang.String r0 = "Encountered corrupt PNG file."
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            goto L_0x0671
        L_0x04fa:
            r0 = 9
            if (r1 != r0) goto L_0x05bd
            boolean r11 = A0P     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            java.lang.String r9 = "ExifInterface"
            if (r11 == 0) goto L_0x0511
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            java.lang.String r0 = "getRafAttributes starting with: "
            java.lang.String r0 = X.AnonymousClass000.A0l(r6, r0, r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            android.util.Log.d(r9, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
        L_0x0511:
            r0 = 84
            r6.A00(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r2 = 4
            byte[] r0 = new byte[r2]     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            byte[] r1 = new byte[r2]     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            byte[] r2 = new byte[r2]     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r6.read(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r6.read(r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r6.read(r2)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            int r5 = r0.getInt()     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            int r1 = r0.getInt()     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r2)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            int r3 = r0.getInt()     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            byte[] r2 = new byte[r1]     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            int r0 = r6.A00     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            int r0 = r5 - r0
            r6.A00(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r6.read(r2)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            X.8xw r1 = new X.8xw     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r1.<init>(r2)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r0 = 5
            r4.A0E(r1, r5, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            int r0 = r6.A00     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            int r3 = r3 - r0
            r6.A00(r3)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r6.A01 = r0     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            int r5 = r6.readInt()     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            if (r11 == 0) goto L_0x0570
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            java.lang.String r0 = "numberOfDirectoryEntry: "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r5)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            android.util.Log.d(r9, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
        L_0x0570:
            r3 = 0
        L_0x0571:
            if (r3 >= r5) goto L_0x0672
            int r2 = r6.readUnsignedShort()     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            int r1 = r6.readUnsignedShort()     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r0 = 273(0x111, float:3.83E-43)
            if (r2 != r0) goto L_0x059e
            short r8 = r6.readShort()     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            short r5 = r6.readShort()     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            X.9mO r3 = A02(r4, r8)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            X.9mO r2 = A02(r4, r5)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r1 = r10[r7]     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            java.lang.String r0 = "ImageLength"
            r1.put(r0, r3)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r1 = r10[r7]     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            java.lang.String r0 = "ImageWidth"
            r1.put(r0, r2)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            goto L_0x05a4
        L_0x059e:
            r6.A00(r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            int r3 = r3 + 1
            goto L_0x0571
        L_0x05a4:
            if (r11 == 0) goto L_0x0672
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            java.lang.String r0 = "Updated to length: "
            r1.append(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r1.append(r8)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            java.lang.String r0 = ", width: "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r5)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            android.util.Log.d(r9, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            goto L_0x0672
        L_0x05bd:
            r0 = 14
            if (r1 != r0) goto L_0x0672
            boolean r0 = A0P     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            if (r0 == 0) goto L_0x05d4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            java.lang.String r0 = "getWebpAttributes starting with: "
            java.lang.String r1 = X.AnonymousClass000.A0l(r6, r0, r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            java.lang.String r0 = "ExifInterface"
            android.util.Log.d(r0, r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
        L_0x05d4:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r6.A01 = r0     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r0 = 4
            r6.A00(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            int r0 = r6.readInt()     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            int r5 = r0 + 8
            r0 = 4
            r6.A00(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            r2 = 12
            goto L_0x05ec
        L_0x05e9:
            r6.A00(r3)     // Catch:{ EOFException -> 0x0667, IOException | UnsupportedOperationException -> 0x067a }
        L_0x05ec:
            r1 = 4
            byte[] r8 = new byte[r1]     // Catch:{ EOFException -> 0x0667, IOException | UnsupportedOperationException -> 0x067a }
            int r0 = r6.read(r8)     // Catch:{ EOFException -> 0x0667, IOException | UnsupportedOperationException -> 0x067a }
            if (r0 != r1) goto L_0x0659
            int r0 = r2 + 4
            int r3 = r6.readInt()     // Catch:{ EOFException -> 0x0667, IOException | UnsupportedOperationException -> 0x067a }
            int r2 = r0 + 4
            byte[] r0 = A0d     // Catch:{ EOFException -> 0x0667, IOException | UnsupportedOperationException -> 0x067a }
            boolean r0 = java.util.Arrays.equals(r0, r8)     // Catch:{ EOFException -> 0x0667, IOException | UnsupportedOperationException -> 0x067a }
            if (r0 == 0) goto L_0x0619
            byte[] r1 = new byte[r3]     // Catch:{ EOFException -> 0x0667, IOException | UnsupportedOperationException -> 0x067a }
            int r0 = r6.read(r1)     // Catch:{ EOFException -> 0x0667, IOException | UnsupportedOperationException -> 0x067a }
            if (r0 != r3) goto L_0x0626
            A0M(r4, r1, r2, r7)     // Catch:{ EOFException -> 0x0667, IOException | UnsupportedOperationException -> 0x067a }
            X.8xw r0 = new X.8xw     // Catch:{ EOFException -> 0x0667, IOException | UnsupportedOperationException -> 0x067a }
            r0.<init>(r1)     // Catch:{ EOFException -> 0x0667, IOException | UnsupportedOperationException -> 0x067a }
            r4.A0D(r0)     // Catch:{ EOFException -> 0x0667, IOException | UnsupportedOperationException -> 0x067a }
            goto L_0x0672
        L_0x0619:
            int r1 = r3 % 2
            r0 = 1
            if (r1 != r0) goto L_0x0620
            int r3 = r3 + 1
        L_0x0620:
            int r2 = r2 + r3
            if (r2 == r5) goto L_0x0672
            if (r2 > r5) goto L_0x0660
            goto L_0x05e9
        L_0x0626:
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()     // Catch:{ EOFException -> 0x0667, IOException | UnsupportedOperationException -> 0x067a }
            java.lang.String r0 = "Failed to read given length for given PNG chunk type: "
            r6.append(r0)     // Catch:{ EOFException -> 0x0667, IOException | UnsupportedOperationException -> 0x067a }
            r5 = 4
            r0 = 8
            java.lang.StringBuilder r3 = X.C90524aI.A0h(r0)     // Catch:{ EOFException -> 0x0667, IOException | UnsupportedOperationException -> 0x067a }
            r2 = 0
        L_0x0637:
            java.lang.Object[] r1 = X.AnonymousClass001.A0L()     // Catch:{ EOFException -> 0x0667, IOException | UnsupportedOperationException -> 0x067a }
            byte r0 = r8[r2]     // Catch:{ EOFException -> 0x0667, IOException | UnsupportedOperationException -> 0x067a }
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ EOFException -> 0x0667, IOException | UnsupportedOperationException -> 0x067a }
            r1[r7] = r0     // Catch:{ EOFException -> 0x0667, IOException | UnsupportedOperationException -> 0x067a }
            java.lang.String r0 = "%02x"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ EOFException -> 0x0667, IOException | UnsupportedOperationException -> 0x067a }
            r3.append(r0)     // Catch:{ EOFException -> 0x0667, IOException | UnsupportedOperationException -> 0x067a }
            int r2 = r2 + 1
            if (r2 < r5) goto L_0x0637
            java.lang.String r0 = r3.toString()     // Catch:{ EOFException -> 0x0667, IOException | UnsupportedOperationException -> 0x067a }
            java.io.IOException r0 = X.C90464aC.A0M(r0, r6)     // Catch:{ EOFException -> 0x0667, IOException | UnsupportedOperationException -> 0x067a }
            goto L_0x0666
        L_0x0659:
            java.lang.String r0 = "Encountered invalid length while parsing WebP chunktype"
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ EOFException -> 0x0667, IOException | UnsupportedOperationException -> 0x067a }
            goto L_0x0666
        L_0x0660:
            java.lang.String r0 = "Encountered WebP file with invalid chunk size"
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ EOFException -> 0x0667, IOException | UnsupportedOperationException -> 0x067a }
        L_0x0666:
            throw r0     // Catch:{ EOFException -> 0x0667, IOException | UnsupportedOperationException -> 0x067a }
        L_0x0667:
            java.lang.String r0 = "Encountered corrupt WebP file."
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
            goto L_0x0671
        L_0x066e:
            r5.close()     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
        L_0x0671:
            throw r0     // Catch:{ IOException | UnsupportedOperationException -> 0x067a }
        L_0x0672:
            r4.A07()
            boolean r0 = A0P
            if (r0 == 0) goto L_0x068e
            goto L_0x068b
        L_0x067a:
            r3 = move-exception
            boolean r2 = A0P     // Catch:{ all -> 0x068f }
            if (r2 == 0) goto L_0x0686
            java.lang.String r1 = "ExifInterface"
            java.lang.String r0 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r1, r0, r3)     // Catch:{ all -> 0x068f }
        L_0x0686:
            r4.A07()
            if (r2 == 0) goto L_0x068e
        L_0x068b:
            r4.A08()
        L_0x068e:
            return
        L_0x068f:
            r1 = move-exception
            r4.A07()
            boolean r0 = A0P
            if (r0 == 0) goto L_0x069a
            r4.A08()
        L_0x069a:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203859oz.A0Q(java.io.InputStream):void");
    }

    public static void A0R(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[DefaultCrypto.BUFFER_SIZE];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static void A0S(InputStream inputStream, OutputStream outputStream, int i) {
        byte[] bArr = new byte[DefaultCrypto.BUFFER_SIZE];
        while (i > 0) {
            int min = Math.min(i, DefaultCrypto.BUFFER_SIZE);
            int read = inputStream.read(bArr, 0, min);
            if (read == min) {
                i -= read;
                outputStream.write(bArr, 0, read);
            } else {
                throw C90524aI.A0X("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
        }
    }

    private void A0T(String str) {
        Objects.requireNonNull(str, "filename cannot be null");
        FileInputStream fileInputStream = null;
        this.A06 = null;
        this.A08 = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                A0P(fileInputStream2.getFD(), OsConstants.SEEK_CUR);
                this.A07 = fileInputStream2.getFD();
            } catch (Exception unused) {
                if (A0P) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
                this.A07 = null;
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                A0N(fileInputStream);
                throw th;
            }
            A0Q(fileInputStream2);
            A0N(fileInputStream2);
        } catch (Throwable th2) {
            th = th2;
            A0N(fileInputStream);
            throw th;
        }
    }

    public static void A0V(String str, Object[] objArr, int i, int i2) {
        objArr[i] = new C197869cV(str, i, i2);
    }

    public static void A0W(String str, Object[] objArr, int i, int i2, int i3) {
        objArr[i3] = new C197869cV(str, i, i2);
    }

    private boolean A0X(HashMap hashMap) {
        C202669mO A032 = A03("ImageLength", hashMap);
        C202669mO A033 = A03("ImageWidth", hashMap);
        if (!(A032 == null || A033 == null)) {
            int A002 = A00(A032, this);
            int A003 = A00(A033, this);
            if (A002 > 512 || A003 > 512) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int A0Y(int i) {
        Objects.requireNonNull("Orientation", "tag shouldn't be null");
        Objects.requireNonNull("Orientation", "tag shouldn't be null");
        int i2 = 0;
        do {
            C202669mO A032 = A03("Orientation", this.A0I[i2]);
            if (A032 != null) {
                try {
                    return A00(A032, this);
                } catch (NumberFormatException unused) {
                    return i;
                }
            } else {
                i2++;
            }
        } while (i2 < 10);
        return i;
    }

    public String A0Z(String str) {
        C202669mO A032;
        NumberFormatException numberFormatException;
        double d;
        StringBuilder A0u2;
        Objects.requireNonNull(str, "tag shouldn't be null");
        String str2 = str;
        Objects.requireNonNull(str, "tag shouldn't be null");
        if ("ISOSpeedRatings".equals(str)) {
            if (A0P) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str2 = "PhotographicSensitivity";
        }
        int i = 0;
        while (true) {
            A032 = A03(str2, this.A0I[i]);
            if (A032 == null) {
                i++;
                if (i >= 10) {
                    A032 = null;
                    break;
                }
            } else {
                break;
            }
        }
        if (A032 != null) {
            if (!A0o.contains(str)) {
                return A032.A05(this.A09);
            }
            if (str.equals("GPSTimeStamp")) {
                int i2 = A032.A00;
                if (i2 == 5 || i2 == 10) {
                    AnonymousClass9Q9[] r6 = (AnonymousClass9Q9[]) A032.A04(this.A09);
                    if (r6 == null || r6.length != 3) {
                        A0u2 = AnonymousClass000.A0u();
                        A0u2.append("Invalid GPS Timestamp array. array=");
                        C90514aH.A1T(A0u2, r6);
                    } else {
                        Object[] objArr = new Object[3];
                        AnonymousClass9Q9 r2 = r6[0];
                        AnonymousClass000.A1L(objArr, (int) (((float) r2.A01) / ((float) r2.A00)), 0);
                        AnonymousClass9Q9 r22 = r6[1];
                        AnonymousClass000.A1L(objArr, (int) (((float) r22.A01) / ((float) r22.A00)), 1);
                        AnonymousClass9Q9 r23 = r6[2];
                        AnonymousClass000.A1L(objArr, (int) (((float) r23.A01) / ((float) r23.A00)), 2);
                        return String.format("%02d:%02d:%02d", objArr);
                    }
                } else {
                    A0u2 = AnonymousClass000.A0u();
                    A0u2.append("GPS Timestamp format is not rational. format=");
                    A0u2.append(i2);
                }
                AnonymousClass000.A1A(A0u2, "ExifInterface");
                return null;
            }
            try {
                Object A042 = A032.A04(this.A09);
                if (A042 != null) {
                    if (A042 instanceof String) {
                        d = Double.parseDouble((String) A042);
                    } else if (A042 instanceof long[]) {
                        long[] jArr = (long[]) A042;
                        if (jArr.length == 1) {
                            d = (double) jArr[0];
                        } else {
                            numberFormatException = new NumberFormatException("There are more than one component");
                        }
                    } else if (A042 instanceof int[]) {
                        int[] iArr = (int[]) A042;
                        if (iArr.length == 1) {
                            d = (double) iArr[0];
                        } else {
                            numberFormatException = new NumberFormatException("There are more than one component");
                        }
                    } else if (A042 instanceof double[]) {
                        double[] dArr = (double[]) A042;
                        if (dArr.length == 1) {
                            d = dArr[0];
                        } else {
                            numberFormatException = new NumberFormatException("There are more than one component");
                        }
                    } else if (A042 instanceof AnonymousClass9Q9[]) {
                        AnonymousClass9Q9[] r4 = (AnonymousClass9Q9[]) A042;
                        if (r4.length == 1) {
                            AnonymousClass9Q9 r24 = r4[0];
                            d = ((double) r24.A01) / ((double) r24.A00);
                        } else {
                            numberFormatException = new NumberFormatException("There are more than one component");
                        }
                    } else {
                        numberFormatException = new NumberFormatException("Couldn't find a double value");
                    }
                    return Double.toString(d);
                }
                numberFormatException = new NumberFormatException("NULL can't be converted to a double value");
                throw numberFormatException;
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0493, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0494, code lost:
        r7 = null;
        r6 = null;
        r24 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x049a, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x049b, code lost:
        r7 = null;
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x049e, code lost:
        r8 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x04aa, code lost:
        A0P(r9.A07, android.system.OsConstants.SEEK_SET);
        r0 = new java.io.FileOutputStream(r9.A07);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x04bd, code lost:
        r0 = new java.io.FileOutputStream(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0500, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0501, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x050b, code lost:
        r23.delete();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x04aa A[Catch:{ Exception -> 0x04c7, all -> 0x04c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x04bd A[Catch:{ Exception -> 0x04c7, all -> 0x04c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0500 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:43:0x0081] */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x050b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0a() {
        /*
            r26 = this;
            r9 = r26
            int r1 = r9.A00
            r0 = 4
            if (r1 == r0) goto L_0x001b
            r0 = 13
            if (r1 == r0) goto L_0x001b
            r0 = 14
            if (r1 == r0) goto L_0x001b
            r0 = 3
            if (r1 == r0) goto L_0x001b
            if (r1 == 0) goto L_0x001b
            java.lang.String r0 = "ExifInterface only supports saving attributes for JPEG, PNG, WebP, and DNG formats."
            java.io.IOException r0 = X.C90524aI.A0X(r0)
            throw r0
        L_0x001b:
            java.io.FileDescriptor r0 = r9.A07
            if (r0 != 0) goto L_0x002a
            java.lang.String r0 = r9.A08
            if (r0 != 0) goto L_0x002a
            java.lang.String r0 = "ExifInterface does not support saving attributes for the current input."
            java.io.IOException r0 = X.C90524aI.A0X(r0)
            throw r0
        L_0x002a:
            boolean r0 = r9.A0C
            if (r0 == 0) goto L_0x003d
            boolean r0 = r9.A0D
            if (r0 == 0) goto L_0x003d
            boolean r0 = r9.A0B
            if (r0 != 0) goto L_0x003d
            java.lang.String r0 = "ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips"
            java.io.IOException r0 = X.C90524aI.A0X(r0)
            throw r0
        L_0x003d:
            int r1 = r9.A03
            r0 = 6
            if (r1 == r0) goto L_0x004b
            r0 = 7
            if (r1 == r0) goto L_0x004b
            r0 = 0
        L_0x0046:
            r9.A0F = r0
            r24 = 0
            goto L_0x0050
        L_0x004b:
            byte[] r0 = r9.A0c()
            goto L_0x0046
        L_0x0050:
            java.lang.String r1 = "temp"
            java.lang.String r0 = "tmp"
            java.io.File r23 = java.io.File.createTempFile(r1, r0)     // Catch:{ Exception -> 0x051d, all -> 0x0519 }
            java.lang.String r0 = r9.A08     // Catch:{ Exception -> 0x051d, all -> 0x0519 }
            if (r0 == 0) goto L_0x0062
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x051d, all -> 0x0519 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x051d, all -> 0x0519 }
            goto L_0x0070
        L_0x0062:
            java.io.FileDescriptor r1 = r9.A07     // Catch:{ Exception -> 0x051d, all -> 0x0519 }
            int r0 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x051d, all -> 0x0519 }
            A0P(r1, r0)     // Catch:{ Exception -> 0x051d, all -> 0x0519 }
            java.io.FileDescriptor r0 = r9.A07     // Catch:{ Exception -> 0x051d, all -> 0x0519 }
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x051d, all -> 0x0519 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x051d, all -> 0x0519 }
        L_0x0070:
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0513, all -> 0x052a }
            r0 = r23
            r3.<init>(r0)     // Catch:{ Exception -> 0x0513, all -> 0x052a }
            A0R(r1, r3)     // Catch:{ Exception -> 0x0511, all -> 0x050f }
            A0N(r1)
            A0N(r3)
            r10 = 0
            java.io.FileInputStream r22 = new java.io.FileInputStream     // Catch:{ Exception -> 0x049a, all -> 0x0500 }
            r1 = r22
            r1.<init>(r0)     // Catch:{ Exception -> 0x049a, all -> 0x0500 }
            java.lang.String r0 = r9.A08     // Catch:{ Exception -> 0x0493, all -> 0x0500 }
            if (r0 == 0) goto L_0x0092
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0493, all -> 0x0500 }
            r8.<init>(r0)     // Catch:{ Exception -> 0x0493, all -> 0x0500 }
            goto L_0x00a0
        L_0x0092:
            java.io.FileDescriptor r1 = r9.A07     // Catch:{ Exception -> 0x0493, all -> 0x0500 }
            int r0 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x0493, all -> 0x0500 }
            A0P(r1, r0)     // Catch:{ Exception -> 0x0493, all -> 0x0500 }
            java.io.FileDescriptor r0 = r9.A07     // Catch:{ Exception -> 0x0493, all -> 0x0500 }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0493, all -> 0x0500 }
            r8.<init>(r0)     // Catch:{ Exception -> 0x0493, all -> 0x0500 }
        L_0x00a0:
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x048c, all -> 0x0500 }
            r0 = r22
            r7.<init>(r0)     // Catch:{ Exception -> 0x048c, all -> 0x0500 }
            java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x0484, all -> 0x0480 }
            r6.<init>(r8)     // Catch:{ Exception -> 0x0484, all -> 0x0480 }
            int r1 = r9.A00     // Catch:{ Exception -> 0x0488 }
            r0 = 4
            if (r1 != r0) goto L_0x01cf
            boolean r0 = A0P     // Catch:{ Exception -> 0x0488 }
            if (r0 == 0) goto L_0x00d2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0488 }
            java.lang.String r0 = "saveJpegAttributes starting with (inputStream: "
            r1.append(r0)     // Catch:{ Exception -> 0x0488 }
            r1.append(r7)     // Catch:{ Exception -> 0x0488 }
            java.lang.String r0 = ", outputStream: "
            r1.append(r0)     // Catch:{ Exception -> 0x0488 }
            r1.append(r6)     // Catch:{ Exception -> 0x0488 }
            java.lang.String r1 = X.C90474aD.A0f(r1)     // Catch:{ Exception -> 0x0488 }
            java.lang.String r0 = "ExifInterface"
            android.util.Log.d(r0, r1)     // Catch:{ Exception -> 0x0488 }
        L_0x00d2:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ Exception -> 0x0488 }
            X.8xw r13 = new X.8xw     // Catch:{ Exception -> 0x0488 }
            r13.<init>(r7, r0)     // Catch:{ Exception -> 0x0488 }
            X.8xK r12 = new X.8xK     // Catch:{ Exception -> 0x0488 }
            r12.<init>(r6, r0)     // Catch:{ Exception -> 0x0488 }
            byte r0 = r13.readByte()     // Catch:{ Exception -> 0x0488 }
            java.lang.String r16 = "Invalid marker"
            r11 = -1
            if (r0 != r11) goto L_0x01c9
            java.io.OutputStream r5 = r12.A01     // Catch:{ Exception -> 0x0488 }
            r5.write(r11)     // Catch:{ Exception -> 0x0488 }
            byte r1 = r13.readByte()     // Catch:{ Exception -> 0x0488 }
            r0 = -40
            if (r1 != r0) goto L_0x01c3
            r5.write(r0)     // Catch:{ Exception -> 0x0488 }
            r2 = 0
            java.lang.String r1 = "Xmp"
            java.lang.String r0 = r9.A0Z(r1)     // Catch:{ Exception -> 0x0488 }
            if (r0 == 0) goto L_0x010c
            boolean r0 = r9.A0E     // Catch:{ Exception -> 0x0488 }
            if (r0 == 0) goto L_0x010c
            java.util.HashMap[] r0 = r9.A0I     // Catch:{ Exception -> 0x0488 }
            r0 = r0[r10]     // Catch:{ Exception -> 0x0488 }
            java.lang.Object r2 = r0.remove(r1)     // Catch:{ Exception -> 0x0488 }
        L_0x010c:
            r5.write(r11)     // Catch:{ Exception -> 0x0488 }
            r4 = -31
            r5.write(r4)     // Catch:{ Exception -> 0x0488 }
            r9.A0G(r12)     // Catch:{ Exception -> 0x0488 }
            if (r2 == 0) goto L_0x0120
            java.util.HashMap[] r0 = r9.A0I     // Catch:{ Exception -> 0x0488 }
            r0 = r0[r10]     // Catch:{ Exception -> 0x0488 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x0488 }
        L_0x0120:
            r3 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r3]     // Catch:{ Exception -> 0x0488 }
        L_0x0124:
            byte r0 = r13.readByte()     // Catch:{ Exception -> 0x0488 }
            if (r0 != r11) goto L_0x01bd
            byte r1 = r13.readByte()     // Catch:{ Exception -> 0x0488 }
            r0 = -39
            if (r1 == r0) goto L_0x01b2
            r0 = -38
            if (r1 == r0) goto L_0x01b2
            java.lang.String r14 = "Invalid length"
            if (r1 == r4) goto L_0x015f
            r5.write(r11)     // Catch:{ Exception -> 0x0488 }
            r5.write(r1)     // Catch:{ Exception -> 0x0488 }
            int r1 = r13.readUnsignedShort()     // Catch:{ Exception -> 0x0488 }
            short r0 = (short) r1     // Catch:{ Exception -> 0x0488 }
            r12.A01(r0)     // Catch:{ Exception -> 0x0488 }
            int r1 = r1 + -2
            if (r1 >= 0) goto L_0x014e
            goto L_0x045e
        L_0x014e:
            if (r1 <= 0) goto L_0x0124
            int r0 = java.lang.Math.min(r1, r3)     // Catch:{ Exception -> 0x0488 }
            int r0 = r13.read(r2, r10, r0)     // Catch:{ Exception -> 0x0488 }
            if (r0 < 0) goto L_0x0124
            r12.write(r2, r10, r0)     // Catch:{ Exception -> 0x0488 }
            int r1 = r1 - r0
            goto L_0x014e
        L_0x015f:
            int r0 = r13.readUnsignedShort()     // Catch:{ Exception -> 0x0488 }
            int r1 = r0 + -2
            if (r1 < 0) goto L_0x01ac
            r15 = 6
            byte[] r14 = new byte[r15]     // Catch:{ Exception -> 0x0488 }
            if (r1 < r15) goto L_0x0180
            int r0 = r13.read(r14)     // Catch:{ Exception -> 0x0488 }
            if (r0 != r15) goto L_0x01a4
            byte[] r0 = A0T     // Catch:{ Exception -> 0x0488 }
            boolean r0 = java.util.Arrays.equals(r14, r0)     // Catch:{ Exception -> 0x0488 }
            if (r0 == 0) goto L_0x0180
            int r0 = r1 + -6
            r13.A00(r0)     // Catch:{ Exception -> 0x0488 }
            goto L_0x0124
        L_0x0180:
            r5.write(r11)     // Catch:{ Exception -> 0x0488 }
            r5.write(r4)     // Catch:{ Exception -> 0x0488 }
            int r0 = r1 + 2
            short r0 = (short) r0     // Catch:{ Exception -> 0x0488 }
            r12.A01(r0)     // Catch:{ Exception -> 0x0488 }
            if (r1 < r15) goto L_0x0193
            int r1 = r1 + -6
            r12.write(r14)     // Catch:{ Exception -> 0x0488 }
        L_0x0193:
            if (r1 <= 0) goto L_0x0124
            int r0 = java.lang.Math.min(r1, r3)     // Catch:{ Exception -> 0x0488 }
            int r0 = r13.read(r2, r10, r0)     // Catch:{ Exception -> 0x0488 }
            if (r0 < 0) goto L_0x0124
            r12.write(r2, r10, r0)     // Catch:{ Exception -> 0x0488 }
            int r1 = r1 - r0
            goto L_0x0193
        L_0x01a4:
            java.lang.String r0 = "Invalid exif"
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ Exception -> 0x0488 }
            goto L_0x0462
        L_0x01ac:
            java.io.IOException r0 = X.C90524aI.A0X(r14)     // Catch:{ Exception -> 0x0488 }
            goto L_0x0462
        L_0x01b2:
            r5.write(r11)     // Catch:{ Exception -> 0x0488 }
            r5.write(r1)     // Catch:{ Exception -> 0x0488 }
            A0R(r13, r12)     // Catch:{ Exception -> 0x0488 }
            goto L_0x0472
        L_0x01bd:
            java.io.IOException r0 = X.C90524aI.A0X(r16)     // Catch:{ Exception -> 0x0488 }
            goto L_0x0462
        L_0x01c3:
            java.io.IOException r0 = X.C90524aI.A0X(r16)     // Catch:{ Exception -> 0x0488 }
            goto L_0x0462
        L_0x01c9:
            java.io.IOException r0 = X.C90524aI.A0X(r16)     // Catch:{ Exception -> 0x0488 }
            goto L_0x0462
        L_0x01cf:
            r0 = 13
            if (r1 != r0) goto L_0x0264
            boolean r0 = A0P     // Catch:{ Exception -> 0x0488 }
            if (r0 == 0) goto L_0x01f4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0488 }
            java.lang.String r0 = "savePngAttributes starting with (inputStream: "
            r1.append(r0)     // Catch:{ Exception -> 0x0488 }
            r1.append(r7)     // Catch:{ Exception -> 0x0488 }
            java.lang.String r0 = ", outputStream: "
            r1.append(r0)     // Catch:{ Exception -> 0x0488 }
            r1.append(r6)     // Catch:{ Exception -> 0x0488 }
            java.lang.String r1 = X.C90474aD.A0f(r1)     // Catch:{ Exception -> 0x0488 }
            java.lang.String r0 = "ExifInterface"
            android.util.Log.d(r0, r1)     // Catch:{ Exception -> 0x0488 }
        L_0x01f4:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ Exception -> 0x0488 }
            X.8xw r5 = new X.8xw     // Catch:{ Exception -> 0x0488 }
            r5.<init>(r7, r1)     // Catch:{ Exception -> 0x0488 }
            X.8xK r4 = new X.8xK     // Catch:{ Exception -> 0x0488 }
            r4.<init>(r6, r1)     // Catch:{ Exception -> 0x0488 }
            r0 = 8
            r2 = 8
            A0S(r5, r4, r0)     // Catch:{ Exception -> 0x0488 }
            int r0 = r9.A01     // Catch:{ Exception -> 0x0488 }
            r11 = 4
            if (r0 != 0) goto L_0x021b
            int r0 = r5.readInt()     // Catch:{ Exception -> 0x0488 }
            r4.A00(r0)     // Catch:{ Exception -> 0x0488 }
            int r0 = r0 + 4
            int r0 = r0 + 4
            A0S(r5, r4, r0)     // Catch:{ Exception -> 0x0488 }
            goto L_0x022c
        L_0x021b:
            int r0 = r0 - r2
            int r0 = r0 - r11
            int r0 = r0 - r11
            A0S(r5, r4, r0)     // Catch:{ Exception -> 0x0488 }
            int r0 = r5.readInt()     // Catch:{ Exception -> 0x0488 }
            int r0 = r0 + 4
            int r0 = r0 + 4
            r5.A00(r0)     // Catch:{ Exception -> 0x0488 }
        L_0x022c:
            r3 = 0
            java.io.ByteArrayOutputStream r3 = X.C90524aI.A0Q()     // Catch:{ all -> 0x025e }
            X.8xK r0 = new X.8xK     // Catch:{ all -> 0x025e }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x025e }
            r9.A0G(r0)     // Catch:{ all -> 0x025e }
            java.io.OutputStream r0 = r0.A01     // Catch:{ all -> 0x025e }
            java.io.ByteArrayOutputStream r0 = (java.io.ByteArrayOutputStream) r0     // Catch:{ all -> 0x025e }
            byte[] r2 = r0.toByteArray()     // Catch:{ all -> 0x025e }
            r4.write(r2)     // Catch:{ all -> 0x025e }
            java.util.zip.CRC32 r1 = new java.util.zip.CRC32     // Catch:{ all -> 0x025e }
            r1.<init>()     // Catch:{ all -> 0x025e }
            int r0 = r2.length     // Catch:{ all -> 0x025e }
            int r0 = r0 - r11
            r1.update(r2, r11, r0)     // Catch:{ all -> 0x025e }
            long r0 = r1.getValue()     // Catch:{ all -> 0x025e }
            int r2 = (int) r0     // Catch:{ all -> 0x025e }
            r4.A00(r2)     // Catch:{ all -> 0x025e }
            A0N(r3)     // Catch:{ Exception -> 0x0488 }
            A0R(r5, r4)     // Catch:{ Exception -> 0x0488 }
            goto L_0x0472
        L_0x025e:
            r0 = move-exception
            A0N(r3)     // Catch:{ Exception -> 0x0488 }
            goto L_0x0462
        L_0x0264:
            r0 = 14
            if (r1 != r0) goto L_0x0463
            boolean r0 = A0P     // Catch:{ Exception -> 0x0488 }
            if (r0 == 0) goto L_0x0289
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0488 }
            java.lang.String r0 = "saveWebpAttributes starting with (inputStream: "
            r1.append(r0)     // Catch:{ Exception -> 0x0488 }
            r1.append(r7)     // Catch:{ Exception -> 0x0488 }
            java.lang.String r0 = ", outputStream: "
            r1.append(r0)     // Catch:{ Exception -> 0x0488 }
            r1.append(r6)     // Catch:{ Exception -> 0x0488 }
            java.lang.String r1 = X.C90474aD.A0f(r1)     // Catch:{ Exception -> 0x0488 }
            java.lang.String r0 = "ExifInterface"
            android.util.Log.d(r0, r1)     // Catch:{ Exception -> 0x0488 }
        L_0x0289:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ Exception -> 0x0488 }
            X.8xw r11 = new X.8xw     // Catch:{ Exception -> 0x0488 }
            r11.<init>(r7, r0)     // Catch:{ Exception -> 0x0488 }
            X.8xK r5 = new X.8xK     // Catch:{ Exception -> 0x0488 }
            r5.<init>(r6, r0)     // Catch:{ Exception -> 0x0488 }
            r0 = 4
            A0S(r11, r5, r0)     // Catch:{ Exception -> 0x0488 }
            byte[] r21 = A0i     // Catch:{ Exception -> 0x0488 }
            r3 = 4
            r0 = 8
            r11.A00(r0)     // Catch:{ Exception -> 0x0488 }
            r20 = 0
            java.io.ByteArrayOutputStream r20 = X.C90524aI.A0Q()     // Catch:{ Exception -> 0x0450 }
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ Exception -> 0x0450 }
            X.8xK r4 = new X.8xK     // Catch:{ Exception -> 0x0450 }
            r0 = r20
            r4.<init>(r0, r1)     // Catch:{ Exception -> 0x0450 }
            int r1 = r9.A01     // Catch:{ Exception -> 0x0450 }
            if (r1 == 0) goto L_0x02e1
            r0 = 12
            int r1 = r1 - r0
            int r1 = r1 - r3
            int r1 = r1 - r3
            A0S(r11, r4, r1)     // Catch:{ Exception -> 0x0450 }
            r11.A00(r3)     // Catch:{ Exception -> 0x0450 }
            int r0 = r11.readInt()     // Catch:{ Exception -> 0x0450 }
            r11.A00(r0)     // Catch:{ Exception -> 0x0450 }
        L_0x02c6:
            r9.A0G(r4)     // Catch:{ Exception -> 0x0450 }
        L_0x02c9:
            A0R(r11, r4)     // Catch:{ Exception -> 0x0450 }
            int r0 = r20.size()     // Catch:{ Exception -> 0x0450 }
            int r0 = r0 + 4
            r5.A00(r0)     // Catch:{ Exception -> 0x0450 }
            r0 = r21
            r5.write(r0)     // Catch:{ Exception -> 0x0450 }
            r0 = r20
            r0.writeTo(r5)     // Catch:{ Exception -> 0x0450 }
            goto L_0x0437
        L_0x02e1:
            byte[] r12 = new byte[r3]     // Catch:{ Exception -> 0x0450 }
            int r0 = r11.read(r12)     // Catch:{ Exception -> 0x0450 }
            if (r0 != r3) goto L_0x0442
            byte[] r1 = A0g     // Catch:{ Exception -> 0x0450 }
            boolean r0 = java.util.Arrays.equals(r12, r1)     // Catch:{ Exception -> 0x0450 }
            r14 = 8
            r2 = 1
            if (r0 == 0) goto L_0x034d
            int r13 = r11.readInt()     // Catch:{ Exception -> 0x0450 }
            int r12 = r13 % 2
            r0 = r13
            if (r12 != r2) goto L_0x02ff
            int r0 = r13 + 1
        L_0x02ff:
            byte[] r12 = new byte[r0]     // Catch:{ Exception -> 0x0450 }
            r11.read(r12)     // Catch:{ Exception -> 0x0450 }
            byte r0 = r12[r10]     // Catch:{ Exception -> 0x0450 }
            r14 = r14 | r0
            byte r0 = (byte) r14     // Catch:{ Exception -> 0x0450 }
            r12[r10] = r0     // Catch:{ Exception -> 0x0450 }
            int r0 = r0 >> r2
            r0 = r0 & 1
            if (r0 == r2) goto L_0x0310
            r2 = 0
        L_0x0310:
            r4.write(r1)     // Catch:{ Exception -> 0x0450 }
            r4.A00(r13)     // Catch:{ Exception -> 0x0450 }
            r4.write(r12)     // Catch:{ Exception -> 0x0450 }
            if (r2 == 0) goto L_0x0344
            byte[] r1 = A0b     // Catch:{ Exception -> 0x0450 }
            r0 = r24
            r9.A0F(r11, r4, r1, r0)     // Catch:{ Exception -> 0x0450 }
        L_0x0322:
            byte[] r1 = new byte[r3]     // Catch:{ Exception -> 0x0450 }
            r7.read(r1)     // Catch:{ Exception -> 0x0450 }
            byte[] r0 = A0c     // Catch:{ Exception -> 0x0450 }
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ Exception -> 0x0450 }
            if (r0 == 0) goto L_0x02c6
            int r2 = r11.readInt()     // Catch:{ Exception -> 0x0450 }
            r4.write(r1)     // Catch:{ Exception -> 0x0450 }
            r4.A00(r2)     // Catch:{ Exception -> 0x0450 }
            int r1 = r2 % 2
            r0 = 1
            if (r1 != r0) goto L_0x0340
            int r2 = r2 + 1
        L_0x0340:
            A0S(r11, r4, r2)     // Catch:{ Exception -> 0x0450 }
            goto L_0x0322
        L_0x0344:
            byte[] r1 = A0e     // Catch:{ Exception -> 0x0450 }
            byte[] r0 = A0f     // Catch:{ Exception -> 0x0450 }
            r9.A0F(r11, r4, r1, r0)     // Catch:{ Exception -> 0x0450 }
            goto L_0x02c6
        L_0x034d:
            byte[] r19 = A0e     // Catch:{ Exception -> 0x0450 }
            r0 = r19
            boolean r0 = java.util.Arrays.equals(r12, r0)     // Catch:{ Exception -> 0x0450 }
            if (r0 != 0) goto L_0x035f
            byte[] r0 = A0f     // Catch:{ Exception -> 0x0450 }
            boolean r0 = java.util.Arrays.equals(r12, r0)     // Catch:{ Exception -> 0x0450 }
            if (r0 == 0) goto L_0x02c9
        L_0x035f:
            int r14 = r11.readInt()     // Catch:{ Exception -> 0x0450 }
            int r0 = r14 % 2
            r3 = r14
            if (r0 != r2) goto L_0x036a
            int r3 = r14 + 1
        L_0x036a:
            r2 = 3
            byte[] r0 = new byte[r2]     // Catch:{ Exception -> 0x0450 }
            r25 = r0
            r0 = r19
            boolean r0 = java.util.Arrays.equals(r12, r0)     // Catch:{ Exception -> 0x0450 }
            r13 = 47
            if (r0 == 0) goto L_0x039e
            r0 = r25
            r11.read(r0)     // Catch:{ Exception -> 0x0450 }
            byte[] r13 = new byte[r2]     // Catch:{ Exception -> 0x0450 }
            int r0 = r11.read(r13)     // Catch:{ Exception -> 0x0450 }
            if (r0 != r2) goto L_0x0449
            byte[] r0 = A0j     // Catch:{ Exception -> 0x0450 }
            boolean r0 = java.util.Arrays.equals(r0, r13)     // Catch:{ Exception -> 0x0450 }
            if (r0 == 0) goto L_0x0449
            int r13 = r11.readInt()     // Catch:{ Exception -> 0x0450 }
            int r0 = r13 << 18
            int r18 = r0 >> 18
            int r0 = r13 << 2
            int r17 = r0 >> 18
            int r3 = r3 + -10
            goto L_0x0435
        L_0x039e:
            byte[] r0 = A0f     // Catch:{ Exception -> 0x0450 }
            boolean r0 = java.util.Arrays.equals(r12, r0)     // Catch:{ Exception -> 0x0450 }
            if (r0 == 0) goto L_0x0430
            byte r0 = r11.readByte()     // Catch:{ Exception -> 0x0450 }
            if (r0 != r13) goto L_0x043b
            int r13 = r11.readInt()     // Catch:{ Exception -> 0x0450 }
            int r0 = r13 << 18
            int r0 = r0 >> 18
            int r18 = r0 + 1
            int r0 = r13 << 4
            int r0 = r0 >> 18
            int r17 = r0 + 1
            r2 = r13 & 8
            int r3 = r3 + -5
        L_0x03c0:
            r4.write(r1)     // Catch:{ Exception -> 0x0450 }
            r0 = 10
            r4.A00(r0)     // Catch:{ Exception -> 0x0450 }
            byte[] r15 = new byte[r0]     // Catch:{ Exception -> 0x0450 }
            byte r0 = r15[r10]     // Catch:{ Exception -> 0x0450 }
            r0 = r0 | 8
            byte r1 = (byte) r0     // Catch:{ Exception -> 0x0450 }
            r15[r10] = r1     // Catch:{ Exception -> 0x0450 }
            r16 = 4
            int r0 = r2 << 4
            X.C165587tf.A1T(r15, r1, r0, r10)     // Catch:{ Exception -> 0x0450 }
            int r2 = r18 + -1
            int r1 = r17 + -1
            byte r0 = (byte) r2     // Catch:{ Exception -> 0x0450 }
            r15[r16] = r0     // Catch:{ Exception -> 0x0450 }
            r16 = 5
            int r0 = r2 >> 8
            byte r0 = (byte) r0     // Catch:{ Exception -> 0x0450 }
            r15[r16] = r0     // Catch:{ Exception -> 0x0450 }
            r16 = 6
            int r0 = r2 >> 16
            byte r0 = (byte) r0     // Catch:{ Exception -> 0x0450 }
            r15[r16] = r0     // Catch:{ Exception -> 0x0450 }
            r2 = 7
            byte r0 = (byte) r1     // Catch:{ Exception -> 0x0450 }
            r15[r2] = r0     // Catch:{ Exception -> 0x0450 }
            int r0 = r1 >> 8
            byte r2 = (byte) r0     // Catch:{ Exception -> 0x0450 }
            r0 = 8
            r15[r0] = r2     // Catch:{ Exception -> 0x0450 }
            r2 = 9
            int r0 = r1 >> 16
            byte r0 = (byte) r0     // Catch:{ Exception -> 0x0450 }
            r15[r2] = r0     // Catch:{ Exception -> 0x0450 }
            r4.write(r15)     // Catch:{ Exception -> 0x0450 }
            r4.write(r12)     // Catch:{ Exception -> 0x0450 }
            r4.A00(r14)     // Catch:{ Exception -> 0x0450 }
            r0 = r19
            boolean r0 = java.util.Arrays.equals(r12, r0)     // Catch:{ Exception -> 0x0450 }
            if (r0 == 0) goto L_0x0422
            r0 = r25
            r4.write(r0)     // Catch:{ Exception -> 0x0450 }
            byte[] r0 = A0j     // Catch:{ Exception -> 0x0450 }
            r4.write(r0)     // Catch:{ Exception -> 0x0450 }
        L_0x041a:
            r4.A00(r13)     // Catch:{ Exception -> 0x0450 }
        L_0x041d:
            A0S(r11, r4, r3)     // Catch:{ Exception -> 0x0450 }
            goto L_0x02c6
        L_0x0422:
            byte[] r0 = A0f     // Catch:{ Exception -> 0x0450 }
            boolean r0 = java.util.Arrays.equals(r12, r0)     // Catch:{ Exception -> 0x0450 }
            if (r0 == 0) goto L_0x041d
            r0 = 47
            r4.write(r0)     // Catch:{ Exception -> 0x0450 }
            goto L_0x041a
        L_0x0430:
            r13 = 0
            r18 = 0
            r17 = 0
        L_0x0435:
            r2 = 0
            goto L_0x03c0
        L_0x0437:
            A0N(r20)     // Catch:{ Exception -> 0x0488 }
            goto L_0x0472
        L_0x043b:
            java.lang.String r0 = "Encountered error while checking VP8L signature"
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ Exception -> 0x0450 }
            goto L_0x044f
        L_0x0442:
            java.lang.String r0 = "Encountered invalid length while parsing WebP chunk type"
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ Exception -> 0x0450 }
            goto L_0x044f
        L_0x0449:
            java.lang.String r0 = "Encountered error while checking VP8 signature"
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ Exception -> 0x0450 }
        L_0x044f:
            throw r0     // Catch:{ Exception -> 0x0450 }
        L_0x0450:
            r2 = move-exception
            java.lang.String r1 = "Failed to save WebP file"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0459 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0459 }
            throw r0     // Catch:{ all -> 0x0459 }
        L_0x0459:
            r0 = move-exception
            A0N(r20)     // Catch:{ Exception -> 0x0488 }
            goto L_0x0462
        L_0x045e:
            java.io.IOException r0 = X.C90524aI.A0X(r14)     // Catch:{ Exception -> 0x0488 }
        L_0x0462:
            throw r0     // Catch:{ Exception -> 0x0488 }
        L_0x0463:
            r0 = 3
            if (r1 == r0) goto L_0x0468
            if (r1 != 0) goto L_0x0472
        L_0x0468:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ Exception -> 0x0488 }
            X.8xK r0 = new X.8xK     // Catch:{ Exception -> 0x0488 }
            r0.<init>(r6, r1)     // Catch:{ Exception -> 0x0488 }
            r9.A0G(r0)     // Catch:{ Exception -> 0x0488 }
        L_0x0472:
            A0N(r7)
            A0N(r6)
            r23.delete()
            r0 = r24
            r9.A0F = r0
            return
        L_0x0480:
            r0 = move-exception
            r6 = r24
            goto L_0x04fd
        L_0x0484:
            r2 = move-exception
            r6 = r24
            goto L_0x0489
        L_0x0488:
            r2 = move-exception
        L_0x0489:
            r24 = r22
            goto L_0x049f
        L_0x048c:
            r2 = move-exception
            r6 = r24
            r24 = r22
            r7 = r6
            goto L_0x049f
        L_0x0493:
            r2 = move-exception
            r7 = r24
            r6 = r7
            r24 = r22
            goto L_0x049e
        L_0x049a:
            r2 = move-exception
            r7 = r24
            r6 = r7
        L_0x049e:
            r8 = r7
        L_0x049f:
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Exception -> 0x04cb, all -> 0x04c9 }
            r0 = r23
            r4.<init>(r0)     // Catch:{ Exception -> 0x04cb, all -> 0x04c9 }
            java.lang.String r1 = r9.A08     // Catch:{ Exception -> 0x04c7, all -> 0x04c3 }
            if (r1 != 0) goto L_0x04bd
            java.io.FileDescriptor r1 = r9.A07     // Catch:{ Exception -> 0x04c7, all -> 0x04c3 }
            int r0 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x04c7, all -> 0x04c3 }
            A0P(r1, r0)     // Catch:{ Exception -> 0x04c7, all -> 0x04c3 }
            java.io.FileDescriptor r1 = r9.A07     // Catch:{ Exception -> 0x04c7, all -> 0x04c3 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x04c7, all -> 0x04c3 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x04c7, all -> 0x04c3 }
        L_0x04b8:
            r8 = r0
            A0R(r4, r0)     // Catch:{ Exception -> 0x04c7, all -> 0x04c3 }
            goto L_0x04ee
        L_0x04bd:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x04c7, all -> 0x04c3 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x04c7, all -> 0x04c3 }
            goto L_0x04b8
        L_0x04c3:
            r1 = move-exception
            r24 = r4
            goto L_0x04e7
        L_0x04c7:
            r3 = move-exception
            goto L_0x04ce
        L_0x04c9:
            r1 = move-exception
            goto L_0x04e7
        L_0x04cb:
            r3 = move-exception
            r4 = r24
        L_0x04ce:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x04e3 }
            java.lang.String r1 = "Failed to save new file. Original file is stored in "
            r0 = r23
            X.C90464aC.A1A(r0, r1, r2)     // Catch:{ all -> 0x04e3 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x04e3 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x04e3 }
            r0.<init>(r1, r3)     // Catch:{ all -> 0x04e3 }
            throw r0     // Catch:{ all -> 0x04e3 }
        L_0x04e3:
            r1 = move-exception
            r24 = r4
            r10 = 1
        L_0x04e7:
            A0N(r24)     // Catch:{ all -> 0x04fc }
            A0N(r8)     // Catch:{ all -> 0x04fc }
            goto L_0x04fb
        L_0x04ee:
            A0N(r4)     // Catch:{ all -> 0x04fc }
            A0N(r0)     // Catch:{ all -> 0x04fc }
            java.lang.String r0 = "Failed to save new file"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x04fc }
            r1.<init>(r0, r2)     // Catch:{ all -> 0x04fc }
        L_0x04fb:
            throw r1     // Catch:{ all -> 0x04fc }
        L_0x04fc:
            r0 = move-exception
        L_0x04fd:
            r24 = r7
            goto L_0x0503
        L_0x0500:
            r0 = move-exception
            r6 = r24
        L_0x0503:
            A0N(r24)
            A0N(r6)
            if (r10 != 0) goto L_0x050e
            r23.delete()
        L_0x050e:
            throw r0
        L_0x050f:
            r0 = move-exception
            goto L_0x052d
        L_0x0511:
            r2 = move-exception
            goto L_0x0516
        L_0x0513:
            r2 = move-exception
            r3 = r24
        L_0x0516:
            r24 = r1
            goto L_0x0520
        L_0x0519:
            r0 = move-exception
            r3 = r24
            goto L_0x052f
        L_0x051d:
            r2 = move-exception
            r3 = r24
        L_0x0520:
            java.lang.String r1 = "Failed to copy original file to temp file"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0528 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0528 }
            throw r0     // Catch:{ all -> 0x0528 }
        L_0x0528:
            r0 = move-exception
            goto L_0x052f
        L_0x052a:
            r0 = move-exception
            r3 = r24
        L_0x052d:
            r24 = r1
        L_0x052f:
            A0N(r24)
            A0N(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203859oz.A0a():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02b8, code lost:
        r6.put(r3, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003f, code lost:
        if (r4 == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004e, code lost:
        if (r4 != false) goto L_0x0050;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x004d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0b(java.lang.String r25, java.lang.String r26) {
        /*
            r24 = this;
            r3 = r25
            r0 = r26
            java.lang.String r1 = "tag shouldn't be null"
            java.util.Objects.requireNonNull(r3, r1)
            java.lang.String r1 = "DateTime"
            boolean r1 = r1.equals(r3)
            java.lang.String r10 = " : "
            java.lang.String r9 = "Invalid value for "
            java.lang.String r17 = "ExifInterface"
            if (r1 != 0) goto L_0x0027
            java.lang.String r1 = "DateTimeOriginal"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0027
            java.lang.String r1 = "DateTimeDigitized"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0058
        L_0x0027:
            if (r26 == 0) goto L_0x0058
            java.util.regex.Pattern r1 = A0r
            boolean r5 = X.C165587tf.A1a(r0, r1)
            java.util.regex.Pattern r1 = A0s
            boolean r4 = X.C165587tf.A1a(r0, r1)
            int r2 = r0.length()
            r1 = 19
            if (r2 != r1) goto L_0x0041
            if (r5 != 0) goto L_0x004e
            if (r4 != 0) goto L_0x0050
        L_0x0041:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            X.C36321k7.A1O(r9, r3, r10, r0, r1)
            r0 = r17
            X.AnonymousClass000.A1A(r1, r0)
        L_0x004d:
            return
        L_0x004e:
            if (r4 == 0) goto L_0x0058
        L_0x0050:
            java.lang.String r2 = "-"
            java.lang.String r1 = ":"
            java.lang.String r0 = r0.replaceAll(r2, r1)
        L_0x0058:
            java.lang.String r1 = "ISOSpeedRatings"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x006d
            boolean r1 = A0P
            if (r1 == 0) goto L_0x006b
            java.lang.String r2 = "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY."
            r1 = r17
            android.util.Log.d(r1, r2)
        L_0x006b:
            java.lang.String r3 = "PhotographicSensitivity"
        L_0x006d:
            r6 = 2
            r7 = 1
            if (r0 == 0) goto L_0x00b5
            java.util.HashSet r1 = A0o
            boolean r1 = r1.contains(r3)
            if (r1 == 0) goto L_0x00b5
            java.lang.String r1 = "GPSTimeStamp"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x02cd
            java.util.regex.Pattern r1 = A0t
            java.util.regex.Matcher r4 = r1.matcher(r0)
            boolean r1 = r4.find()
            if (r1 == 0) goto L_0x0041
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            int r0 = X.C165607th.A0A(r4, r7)
            r2.append(r0)
            java.lang.String r1 = "/1,"
            r2.append(r1)
            int r0 = X.C165607th.A0A(r4, r6)
            r2.append(r0)
            r2.append(r1)
            r0 = 3
            int r0 = X.C165607th.A0A(r4, r0)
            r2.append(r0)
            java.lang.String r0 = "/1"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r2)
        L_0x00b5:
            r15 = 0
            r2 = 0
        L_0x00b7:
            java.util.HashMap[] r1 = A17
            r1 = r1[r2]
            java.lang.Object r8 = r1.get(r3)
            X.9cV r8 = (X.C197869cV) r8
            r1 = r24
            if (r8 == 0) goto L_0x00ce
            if (r0 != 0) goto L_0x00de
            java.util.HashMap[] r4 = r1.A0I
            r4 = r4[r2]
            r4.remove(r3)
        L_0x00ce:
            int r2 = r2 + 1
            r6 = 2
            r7 = 1
            r4 = 10
            if (r2 >= r4) goto L_0x004d
            r4 = 4
            if (r2 != r4) goto L_0x00b7
            boolean r4 = r1.A0C
            if (r4 != 0) goto L_0x00b7
            goto L_0x00ce
        L_0x00de:
            android.util.Pair r4 = A01(r0)
            int r5 = r8.A01
            int r10 = X.C36381kD.A04(r4)
            r12 = -1
            if (r5 == r10) goto L_0x00fa
            int r9 = X.C36381kD.A03(r4)
            if (r5 == r9) goto L_0x00fa
            int r13 = r8.A02
            if (r13 == r12) goto L_0x0115
            if (r13 == r10) goto L_0x00f9
            if (r13 != r9) goto L_0x0115
        L_0x00f9:
            r5 = r13
        L_0x00fa:
            java.lang.String r16 = "/"
            java.lang.String r4 = ","
            switch(r5) {
                case 1: goto L_0x028b;
                case 2: goto L_0x0282;
                case 3: goto L_0x0264;
                case 4: goto L_0x0244;
                case 5: goto L_0x020e;
                case 6: goto L_0x0101;
                case 7: goto L_0x0282;
                case 8: goto L_0x0101;
                case 9: goto L_0x01cd;
                case 10: goto L_0x0167;
                default: goto L_0x0101;
            }
        L_0x0101:
            boolean r4 = A0P
            if (r4 == 0) goto L_0x00ce
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()
            java.lang.String r4 = "Data format isn't one of expected formats: "
            java.lang.String r5 = X.AnonymousClass000.A0r(r4, r6, r5)
        L_0x010f:
            r4 = r17
            android.util.Log.d(r4, r5)
            goto L_0x00ce
        L_0x0115:
            if (r5 == r7) goto L_0x00fa
            r4 = 7
            if (r5 == r4) goto L_0x00fa
            if (r5 == r6) goto L_0x00fa
            boolean r4 = A0P
            if (r4 == 0) goto L_0x00ce
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0u()
            java.lang.String r4 = "Given tag ("
            r8.append(r4)
            r8.append(r3)
            java.lang.String r4 = ") value didn't match with one of expected formats: "
            r8.append(r4)
            java.lang.String[] r7 = A0M
            X.C165617ti.A0g(r8, r7, r5)
            java.lang.String r11 = ""
            java.lang.String r6 = ", "
            if (r13 != r12) goto L_0x015c
            r4 = r11
        L_0x013d:
            r8.append(r4)
            java.lang.String r4 = " (guess: "
            r8.append(r4)
            X.C165617ti.A0g(r8, r7, r10)
            if (r9 == r12) goto L_0x0154
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0v(r6)
            r4 = r7[r9]
            java.lang.String r11 = X.AnonymousClass000.A0q(r4, r5)
        L_0x0154:
            r8.append(r11)
            java.lang.String r5 = X.C90474aD.A0f(r8)
            goto L_0x010f
        L_0x015c:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0v(r6)
            r4 = r7[r13]
            java.lang.String r4 = X.AnonymousClass000.A0q(r4, r5)
            goto L_0x013d
        L_0x0167:
            java.lang.String[] r13 = r0.split(r4, r12)
            int r10 = r13.length
            X.9Q9[] r14 = new X.AnonymousClass9Q9[r10]
            r11 = 0
        L_0x016f:
            if (r11 >= r10) goto L_0x0192
            r5 = r13[r11]
            r4 = r16
            java.lang.String[] r6 = r5.split(r4, r12)
            r4 = r6[r15]
            double r4 = java.lang.Double.parseDouble(r4)
            long r8 = (long) r4
            r4 = r6[r7]
            double r6 = java.lang.Double.parseDouble(r4)
            long r4 = (long) r6
            X.9Q9 r6 = new X.9Q9
            r6.<init>(r8, r4)
            r14[r11] = r6
            int r11 = r11 + 1
            r7 = 1
            goto L_0x016f
        L_0x0192:
            java.util.HashMap[] r4 = r1.A0I
            r6 = r4[r2]
            java.nio.ByteOrder r5 = r1.A09
            int[] r4 = A0m
            r22 = 10
            r4 = r4[r22]
            int r4 = r4 * r10
            byte[] r4 = new byte[r4]
            java.nio.ByteBuffer r9 = java.nio.ByteBuffer.wrap(r4)
            r9.order(r5)
            r8 = 0
        L_0x01a9:
            if (r8 >= r10) goto L_0x01bc
            r11 = r14[r8]
            long r4 = r11.A01
            int r7 = (int) r4
            r9.putInt(r7)
            long r4 = r11.A00
            int r7 = (int) r4
            r9.putInt(r7)
            int r8 = r8 + 1
            goto L_0x01a9
        L_0x01bc:
            byte[] r21 = r9.array()
            r19 = -1
            X.9mO r7 = new X.9mO
            r18 = r7
            r23 = r10
            r18.<init>(r19, r21, r22, r23)
            goto L_0x02b8
        L_0x01cd:
            java.lang.String[] r6 = r0.split(r4, r12)
            int r12 = r6.length
            int[] r8 = new int[r12]
            r5 = 0
        L_0x01d5:
            if (r5 >= r12) goto L_0x01e0
            int r4 = X.C165617ti.A08(r6, r5)
            r8[r5] = r4
            int r5 = r5 + 1
            goto L_0x01d5
        L_0x01e0:
            java.util.HashMap[] r4 = r1.A0I
            r6 = r4[r2]
            java.nio.ByteOrder r5 = r1.A09
            int[] r4 = A0m
            r11 = 9
            r4 = r4[r11]
            int r4 = r4 * r12
            byte[] r4 = new byte[r4]
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.wrap(r4)
            r7.order(r5)
            r5 = 0
        L_0x01f7:
            if (r5 >= r12) goto L_0x0201
            r4 = r8[r5]
            r7.putInt(r4)
            int r5 = r5 + 1
            goto L_0x01f7
        L_0x0201:
            byte[] r10 = r7.array()
            r8 = -1
            X.9mO r7 = new X.9mO
            r7.<init>(r8, r10, r11, r12)
            goto L_0x02b8
        L_0x020e:
            java.lang.String[] r13 = r0.split(r4, r12)
            int r11 = r13.length
            X.9Q9[] r14 = new X.AnonymousClass9Q9[r11]
            r10 = 0
        L_0x0216:
            if (r10 >= r11) goto L_0x0239
            r5 = r13[r10]
            r4 = r16
            java.lang.String[] r6 = r5.split(r4, r12)
            r4 = r6[r15]
            double r4 = java.lang.Double.parseDouble(r4)
            long r8 = (long) r4
            r4 = 1
            r4 = r6[r4]
            double r6 = java.lang.Double.parseDouble(r4)
            long r4 = (long) r6
            X.9Q9 r6 = new X.9Q9
            r6.<init>(r8, r4)
            r14[r10] = r6
            int r10 = r10 + 1
            goto L_0x0216
        L_0x0239:
            java.util.HashMap[] r4 = r1.A0I
            r6 = r4[r2]
            java.nio.ByteOrder r4 = r1.A09
            X.9mO r7 = X.C202669mO.A03(r4, r14)
            goto L_0x02b8
        L_0x0244:
            java.lang.String[] r9 = r0.split(r4, r12)
            int r8 = r9.length
            long[] r7 = new long[r8]
            r6 = 0
        L_0x024c:
            if (r6 >= r8) goto L_0x0259
            r4 = r9[r6]
            long r4 = java.lang.Long.parseLong(r4)
            r7[r6] = r4
            int r6 = r6 + 1
            goto L_0x024c
        L_0x0259:
            java.util.HashMap[] r4 = r1.A0I
            r6 = r4[r2]
            java.nio.ByteOrder r4 = r1.A09
            X.9mO r7 = X.C202669mO.A02(r4, r7)
            goto L_0x02b8
        L_0x0264:
            java.lang.String[] r8 = r0.split(r4, r12)
            int r6 = r8.length
            int[] r7 = new int[r6]
            r5 = 0
        L_0x026c:
            if (r5 >= r6) goto L_0x0277
            int r4 = X.C165617ti.A08(r8, r5)
            r7[r5] = r4
            int r5 = r5 + 1
            goto L_0x026c
        L_0x0277:
            java.util.HashMap[] r4 = r1.A0I
            r6 = r4[r2]
            java.nio.ByteOrder r4 = r1.A09
            X.9mO r7 = X.C202669mO.A01(r4, r7)
            goto L_0x02b8
        L_0x0282:
            java.util.HashMap[] r4 = r1.A0I
            r6 = r4[r2]
            X.9mO r7 = X.C202669mO.A00(r0)
            goto L_0x02b8
        L_0x028b:
            java.util.HashMap[] r4 = r1.A0I
            r6 = r4[r2]
            int r4 = r0.length()
            if (r4 != r7) goto L_0x02bd
            char r4 = r0.charAt(r15)
            r8 = 48
            if (r4 < r8) goto L_0x02bd
            char r5 = r0.charAt(r15)
            r4 = 49
            if (r5 > r4) goto L_0x02bd
            byte[] r10 = new byte[r7]
            char r4 = r0.charAt(r15)
            int r4 = r4 - r8
            byte r4 = (byte) r4
            r10[r15] = r4
            r8 = -1
            X.9mO r7 = new X.9mO
            r11 = 1
            r12 = 1
            r7.<init>(r8, r10, r11, r12)
        L_0x02b8:
            r6.put(r3, r7)
            goto L_0x00ce
        L_0x02bd:
            java.nio.charset.Charset r4 = A0O
            byte[] r10 = r0.getBytes(r4)
            int r12 = r10.length
            r8 = -1
            X.9mO r7 = new X.9mO
            r11 = 1
            r7.<init>(r8, r10, r11, r12)
            goto L_0x02b8
        L_0x02cd:
            double r1 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x02e5 }
            r4 = 4666723172467343360(0x40c3880000000000, double:10000.0)
            double r1 = r1 * r4
            long r4 = (long) r1     // Catch:{ NumberFormatException -> 0x02e5 }
            r1 = 10000(0x2710, double:4.9407E-320)
            X.9Q9 r8 = new X.9Q9     // Catch:{ NumberFormatException -> 0x02e5 }
            r8.<init>(r4, r1)     // Catch:{ NumberFormatException -> 0x02e5 }
            java.lang.String r0 = r8.toString()     // Catch:{ NumberFormatException -> 0x02e5 }
            goto L_0x00b5
        L_0x02e5:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            X.C36321k7.A1O(r9, r3, r10, r0, r1)
            r0 = r17
            X.AnonymousClass000.A1A(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203859oz.A0b(java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x005c A[SYNTHETIC, Splitter:B:32:0x005c] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0080 A[Catch:{ Exception -> 0x0085 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A0c() {
        /*
            r10 = this;
            java.lang.String r6 = "ExifInterface"
            boolean r0 = r10.A0C
            r9 = 0
            if (r0 != 0) goto L_0x0008
            return r9
        L_0x0008:
            byte[] r0 = r10.A0F
            if (r0 == 0) goto L_0x000d
            return r0
        L_0x000d:
            android.content.res.AssetManager$AssetInputStream r5 = r10.A06     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            if (r5 == 0) goto L_0x002b
            boolean r0 = r5.markSupported()     // Catch:{ Exception -> 0x0028, all -> 0x0024 }
            if (r0 == 0) goto L_0x001b
            r5.reset()     // Catch:{ Exception -> 0x0028, all -> 0x0024 }
            goto L_0x0034
        L_0x001b:
            java.lang.String r0 = "Cannot read thumbnail from inputstream without mark/reset support"
            android.util.Log.d(r6, r0)     // Catch:{ Exception -> 0x0028, all -> 0x0024 }
            A0N(r5)
            return r9
        L_0x0024:
            r2 = move-exception
            r4 = r9
            goto L_0x00a7
        L_0x0028:
            r1 = move-exception
            r4 = r9
            goto L_0x0090
        L_0x002b:
            java.lang.String r0 = r10.A08     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            if (r0 == 0) goto L_0x0036
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            r5.<init>(r0)     // Catch:{ Exception -> 0x008d, all -> 0x008a }
        L_0x0034:
            r4 = r9
            goto L_0x0046
        L_0x0036:
            java.io.FileDescriptor r0 = r10.A07     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            java.io.FileDescriptor r4 = A05(r0)     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            int r0 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x0087, all -> 0x00a9 }
            A0P(r4, r0)     // Catch:{ Exception -> 0x0087, all -> 0x00a9 }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0087, all -> 0x00a9 }
            r5.<init>(r4)     // Catch:{ Exception -> 0x0087, all -> 0x00a9 }
        L_0x0046:
            int r1 = r10.A05     // Catch:{ Exception -> 0x0085 }
            int r0 = r10.A01     // Catch:{ Exception -> 0x0085 }
            int r1 = r1 + r0
            long r0 = (long) r1     // Catch:{ Exception -> 0x0085 }
            long r7 = r5.skip(r0)     // Catch:{ Exception -> 0x0085 }
            int r1 = r10.A05     // Catch:{ Exception -> 0x0085 }
            int r0 = r10.A01     // Catch:{ Exception -> 0x0085 }
            int r1 = r1 + r0
            long r1 = (long) r1
            java.lang.String r3 = "Corrupted image"
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0080
            int r0 = r10.A04     // Catch:{ Exception -> 0x0085 }
            byte[] r2 = new byte[r0]     // Catch:{ Exception -> 0x0085 }
            int r1 = r5.read(r2)     // Catch:{ Exception -> 0x0085 }
            int r0 = r10.A04     // Catch:{ Exception -> 0x0085 }
            if (r1 != r0) goto L_0x007b
            r10.A0F = r2     // Catch:{ Exception -> 0x0085 }
            A0N(r5)
            if (r4 == 0) goto L_0x007a
            java.lang.String r1 = "ExifInterfaceUtils"
            A0O(r4)     // Catch:{ Exception -> 0x0075 }
            return r2
        L_0x0075:
            java.lang.String r0 = "Error closing fd."
            android.util.Log.e(r1, r0)
        L_0x007a:
            return r2
        L_0x007b:
            java.io.IOException r0 = X.C90524aI.A0X(r3)     // Catch:{ Exception -> 0x0085 }
            throw r0     // Catch:{ Exception -> 0x0085 }
        L_0x0080:
            java.io.IOException r0 = X.C90524aI.A0X(r3)     // Catch:{ Exception -> 0x0085 }
            throw r0     // Catch:{ Exception -> 0x0085 }
        L_0x0085:
            r1 = move-exception
            goto L_0x0090
        L_0x0087:
            r1 = move-exception
            r5 = r9
            goto L_0x0090
        L_0x008a:
            r2 = move-exception
            r4 = r9
            goto L_0x00aa
        L_0x008d:
            r1 = move-exception
            r5 = r9
            r4 = r9
        L_0x0090:
            java.lang.String r0 = "Encountered exception while getting thumbnail"
            android.util.Log.d(r6, r0, r1)     // Catch:{ all -> 0x00a6 }
            A0N(r5)
            if (r4 == 0) goto L_0x00a5
            java.lang.String r1 = "ExifInterfaceUtils"
            A0O(r4)     // Catch:{ Exception -> 0x00a0 }
            return r9
        L_0x00a0:
            java.lang.String r0 = "Error closing fd."
            android.util.Log.e(r1, r0)
        L_0x00a5:
            return r9
        L_0x00a6:
            r2 = move-exception
        L_0x00a7:
            r9 = r5
            goto L_0x00aa
        L_0x00a9:
            r2 = move-exception
        L_0x00aa:
            A0N(r9)
            if (r4 == 0) goto L_0x00ba
            java.lang.String r1 = "ExifInterfaceUtils"
            A0O(r4)     // Catch:{ Exception -> 0x00b5 }
            throw r2
        L_0x00b5:
            java.lang.String r0 = "Error closing fd."
            android.util.Log.e(r1, r0)
        L_0x00ba:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203859oz.A0c():byte[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C203859oz(java.io.FileDescriptor r6) {
        /*
            r5 = this;
            r5.<init>()
            r0 = 10
            r1 = 10
            java.util.HashMap[] r0 = new java.util.HashMap[r0]
            r5.A0I = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r1)
            r5.A0A = r0
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r5.A09 = r0
            java.lang.String r0 = "fileDescriptor cannot be null"
            java.util.Objects.requireNonNull(r6, r0)
            r4 = 0
            r5.A06 = r4
            r5.A08 = r4
            r3 = 0
            int r0 = android.system.OsConstants.SEEK_CUR     // Catch:{ Exception -> 0x0037 }
            A0P(r6, r0)     // Catch:{ Exception -> 0x0037 }
            r5.A07 = r6
            java.io.FileDescriptor r6 = A05(r6)     // Catch:{ Exception -> 0x002e }
            r3 = 1
            goto L_0x0044
        L_0x002e:
            r2 = move-exception
            java.lang.String r1 = "Failed to duplicate file descriptor"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1, r2)
            throw r0
        L_0x0037:
            boolean r0 = A0P
            if (r0 == 0) goto L_0x0042
            java.lang.String r1 = "ExifInterface"
            java.lang.String r0 = "The file descriptor for the given input is not seekable"
            android.util.Log.d(r1, r0)
        L_0x0042:
            r5.A07 = r4
        L_0x0044:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ all -> 0x005f }
            r0.<init>(r6)     // Catch:{ all -> 0x005f }
            r5.A0Q(r0)     // Catch:{ all -> 0x005d }
            A0N(r0)
            if (r3 == 0) goto L_0x005c
            java.lang.String r1 = "ExifInterfaceUtils"
            A0O(r6)     // Catch:{ Exception -> 0x0057 }
            return
        L_0x0057:
            java.lang.String r0 = "Error closing fd."
            android.util.Log.e(r1, r0)
        L_0x005c:
            return
        L_0x005d:
            r2 = move-exception
            goto L_0x0061
        L_0x005f:
            r2 = move-exception
            r0 = r4
        L_0x0061:
            A0N(r0)
            if (r3 == 0) goto L_0x0071
            java.lang.String r1 = "ExifInterfaceUtils"
            A0O(r6)     // Catch:{ Exception -> 0x006c }
            throw r2
        L_0x006c:
            java.lang.String r0 = "Error closing fd."
            android.util.Log.e(r1, r0)
        L_0x0071:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203859oz.<init>(java.io.FileDescriptor):void");
    }

    public static C202669mO A03(Object obj, AbstractMap abstractMap) {
        return (C202669mO) abstractMap.get(obj);
    }

    public static FileDescriptor A05(FileDescriptor fileDescriptor) {
        return Os.dup(fileDescriptor);
    }

    public static ByteOrder A06(C187478xw r2) {
        short readShort = r2.readShort();
        if (readShort == 18761) {
            if (A0P) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        } else if (readShort == 19789) {
            if (A0P) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        } else {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("Invalid byte order: ");
            throw C90464aC.A0M(Integer.toHexString(readShort), A0u2);
        }
    }

    private void A0C(C187478xw r4) {
        ByteOrder A062 = A06(r4);
        this.A09 = A062;
        r4.A01 = A062;
        int readUnsignedShort = r4.readUnsignedShort();
        int i = this.A00;
        if (i == 7 || i == 10 || readUnsignedShort == 42) {
            int readInt = r4.readInt();
            if (readInt >= 8) {
                int i2 = readInt - 8;
                if (i2 > 0) {
                    r4.A00(i2);
                    return;
                }
                return;
            }
            throw C90524aI.A0X(AnonymousClass000.A0r("Invalid first Ifd offset: ", AnonymousClass000.A0u(), readInt));
        }
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("Invalid start code: ");
        throw C90464aC.A0M(Integer.toHexString(readUnsignedShort), A0u2);
    }

    private void A0H(C167477y0 r6) {
        A0C(r6);
        A0I(r6, 0);
        A0J(r6, 0);
        A0J(r6, 5);
        A0J(r6, 4);
        A09();
        if (this.A00 == 8) {
            HashMap[] hashMapArr = this.A0I;
            C202669mO A032 = A03("MakerNote", hashMapArr[1]);
            if (A032 != null) {
                C167477y0 r1 = new C167477y0(A032.A03);
                r1.A01 = this.A09;
                r1.A00(6);
                A0I(r1, 9);
                Object obj = hashMapArr[9].get("ColorSpace");
                if (obj != null) {
                    hashMapArr[1].put("ColorSpace", obj);
                }
            }
        }
    }

    public static void A0O(FileDescriptor fileDescriptor) {
        Os.close(fileDescriptor);
    }

    public C203859oz(InputStream inputStream) {
        Objects.requireNonNull(inputStream, "inputStream cannot be null");
        this.A08 = null;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.A06 = (AssetManager.AssetInputStream) inputStream;
            this.A07 = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                try {
                    A0P(fileInputStream.getFD(), OsConstants.SEEK_CUR);
                    this.A06 = null;
                    this.A07 = fileInputStream.getFD();
                } catch (Exception unused) {
                    if (A0P) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                }
            }
            this.A06 = null;
            this.A07 = null;
        }
        A0Q(inputStream);
    }

    public C203859oz(File file) {
        Objects.requireNonNull(file, "file cannot be null");
        A0T(file.getAbsolutePath());
    }

    public C203859oz(String str) {
        Objects.requireNonNull(str, "filename cannot be null");
        A0T(str);
    }
}
