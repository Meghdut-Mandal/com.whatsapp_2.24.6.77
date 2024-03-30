package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.1Ax  reason: invalid class name */
public class AnonymousClass1Ax {
    public C19930wk A00;
    public final C21060yb A01;
    public final C19770wU A02;
    public final C20690y0 A03;
    public final C24051Aw A04;

    public static String A01(int i) {
        switch (i) {
            case 1:
                return "chat_personal";
            case 2:
                return "chat_group";
            case 3:
                return "status_user";
            case 4:
                return "status_ads";
            case 5:
                return "product_catalog";
            case 6:
                return "gdpr";
            case 7:
                return "sticker_picker";
            case 8:
                return "profile_picture";
            case 9:
                return "bloks";
            case 10:
                return "p2b";
            case 11:
                return "message_history_sync";
            case 12:
                return "community";
            case 13:
                return "channel";
            case 14:
                return "broadcast";
            default:
                return "unknown";
        }
    }

    public void A08(File file, int i) {
        Uri uri;
        C19930wk r2;
        if (i == 1) {
            uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        } else if (i == 2) {
            uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        } else if (i == 3 || i == 13) {
            uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        } else {
            uri = null;
        }
        synchronized (this) {
            r2 = this.A00;
            if (r2 == null) {
                r2 = new C19930wk(this.A02, false);
                this.A00 = r2;
            }
        }
        r2.execute(new C35631j0(this, uri, file, 30));
    }

    public static String A02(String str) {
        if (str != null) {
            char c = 65535;
            switch (str.hashCode()) {
                case -1487394660:
                    if (str.equals("image/jpeg")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1487018032:
                    if (str.equals("image/webp")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1248334925:
                    if (str.equals("application/pdf")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1248332507:
                    if (str.equals("application/rtf")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1248328278:
                    if (str.equals("application/was")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1073633483:
                    if (str.equals("application/vnd.openxmlformats-officedocument.presentationml.presentation")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1071817359:
                    if (str.equals("application/vnd.ms-powerpoint")) {
                        c = 6;
                        break;
                    }
                    break;
                case -1050893613:
                    if (str.equals("application/vnd.openxmlformats-officedocument.wordprocessingml.document")) {
                        c = 7;
                        break;
                    }
                    break;
                case -1004747228:
                    if (str.equals("text/csv")) {
                        c = 8;
                        break;
                    }
                    break;
                case -1004732798:
                    if (str.equals("text/rtf")) {
                        c = 9;
                        break;
                    }
                    break;
                case -879258763:
                    if (str.equals("image/png")) {
                        c = 10;
                        break;
                    }
                    break;
                case -366307023:
                    if (str.equals("application/vnd.ms-excel")) {
                        c = 11;
                        break;
                    }
                    break;
                case 817335912:
                    if (str.equals("text/plain")) {
                        c = 12;
                        break;
                    }
                    break;
                case 904647503:
                    if (str.equals("application/msword")) {
                        c = 13;
                        break;
                    }
                    break;
                case 1993842850:
                    if (str.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
                        c = 14;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return "jpg";
                case 1:
                    return "webp";
                case 2:
                    return "pdf";
                case 3:
                case 9:
                    return "rtf";
                case 4:
                    return "was";
                case 5:
                    return "pptx";
                case 6:
                    return "ppt";
                case 7:
                    return "docx";
                case 8:
                    return "csv";
                case 10:
                    return "png";
                case 11:
                    return "xls";
                case 12:
                    return "txt";
                case 13:
                    return "doc";
                case 14:
                    return "xlsx";
                default:
                    String A07 = AnonymousClass1DC.A07(str, false);
                    if (TextUtils.isEmpty(A07)) {
                        A07 = AnonymousClass1DC.A08(str, false);
                        if (TextUtils.isEmpty(A07)) {
                            String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
                            if (extensionFromMimeType != null) {
                                return extensionFromMimeType;
                            }
                        }
                    }
                    return A07;
            }
        }
        return "";
    }

    public static boolean A03(C20810yC r2, int i) {
        C21000yV r1 = C21000yV.A02;
        if (C20800yB.A01(r1, r2, 6972) || !C20800yB.A01(r1, r2, i)) {
            return false;
        }
        return true;
    }

    public static boolean A04(C25471Gl r2) {
        if (r2 == C25471Gl.A0A || r2 == C25471Gl.A0e) {
            return true;
        }
        return false;
    }

    public AnonymousClass1Ax(C20690y0 r1, C21060yb r2, C24051Aw r3, C19770wU r4) {
        this.A02 = r4;
        this.A03 = r1;
        this.A01 = r2;
        this.A04 = r3;
    }

    private Bitmap A00(BitmapFactory.Options options, Uri uri, boolean z) {
        InputStream A07 = A07(uri, z);
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(A07, (Rect) null, options);
            if (decodeStream == null || decodeStream.getWidth() == 0 || decodeStream.getHeight() == 0) {
                throw new C25551Gt();
            }
            A07.close();
            return decodeStream;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public Bitmap A05(Uri uri, int i, int i2, boolean z, boolean z2) {
        Bitmap bitmap;
        if (!TextUtils.isEmpty(uri.toString())) {
            Matrix A0A = AnonymousClass1GW.A0A(uri, this.A01.A0O());
            BitmapFactory.Options A06 = A06(uri, i, z, z2);
            try {
                bitmap = AnonymousClass1GW.A08(A00(A06, uri, z), A0A, i, i2);
            } catch (OutOfMemoryError e) {
                int i3 = A06.inSampleSize * 2;
                A06.inSampleSize = i3;
                StringBuilder sb = new StringBuilder();
                sb.append("sample_rotate_image/oom ");
                sb.append(i3);
                Log.i(sb.toString(), e);
                bitmap = AnonymousClass1GW.A08(A00(A06, uri, z), A0A, i, i2);
            }
            bitmap.isMutable();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("sample_rotate_image/final_size:");
            sb2.append(bitmap.getWidth());
            sb2.append(" | ");
            sb2.append(bitmap.getHeight());
            Log.i(sb2.toString());
            return bitmap;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("No file ");
        sb3.append(uri);
        throw new FileNotFoundException(sb3.toString());
    }

    public BitmapFactory.Options A06(Uri uri, int i, boolean z, boolean z2) {
        int i2;
        if (!TextUtils.isEmpty(uri.toString())) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            InputStream A07 = A07(uri, z);
            try {
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(A07, (Rect) null, options);
                A07.close();
                int i3 = options.outWidth;
                if (i3 <= 0 || (i2 = options.outHeight) <= 0) {
                    throw new C25551Gt();
                }
                options.inSampleSize = 1;
                int i4 = 1;
                int max = Math.max(i3, i2);
                while (true) {
                    max /= 2;
                    if (max > (i * 8) / 10) {
                        i4 *= 2;
                        options.inSampleSize = i4;
                    } else {
                        options.inDither = true;
                        options.inJustDecodeBounds = false;
                        options.inScaled = false;
                        options.inPurgeable = true;
                        options.inInputShareable = true;
                        StringBuilder sb = new StringBuilder();
                        sb.append("sample_rotate_image/width=");
                        sb.append(i3);
                        sb.append(" | height=");
                        sb.append(i2);
                        sb.append(" | sample_size=");
                        sb.append(i4);
                        Log.i(sb.toString());
                        options.inPreferQualityOverSpeed = true;
                        options.inMutable = z2;
                        return options;
                    }
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("No file ");
            sb2.append(uri);
            throw new FileNotFoundException(sb2.toString());
        }
    }

    public InputStream A07(Uri uri, boolean z) {
        InputStream A06;
        Uri build = uri.buildUpon().query((String) null).build();
        File A032 = AnonymousClass6YY.A03(build);
        if (A032 != null) {
            A06 = new FileInputStream(A032);
        } else {
            C21050ya A0O = this.A01.A0O();
            if (A0O != null) {
                A06 = A0O.A06(build);
                if (A06 == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unable to open stream for uri=");
                    sb.append(build);
                    throw new IOException(sb.toString());
                }
            } else {
                throw new IOException("Could not get content resolver");
            }
        }
        if ((A06 instanceof FileInputStream) && z) {
            this.A04.A05((FileInputStream) A06);
        }
        return A06;
    }
}
