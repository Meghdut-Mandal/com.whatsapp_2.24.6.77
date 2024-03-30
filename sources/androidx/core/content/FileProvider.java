package androidx.core.content;

import X.C09600cd;
import X.C16660ps;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

public class FileProvider extends ContentProvider {
    public static final File A03 = new File("/");
    public static final HashMap A04 = new HashMap();
    public static final String[] A05 = {"_display_name", "_size"};
    public int A00;
    public C16660ps A01;
    public String A02;

    public static Uri A00(Context context, File file, String str) {
        C09600cd r4 = (C09600cd) A02(context, str, 0);
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : r4.A01.entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                if (canonicalPath.startsWith(path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry != null) {
                String path2 = ((File) entry.getValue()).getPath();
                boolean endsWith = path2.endsWith("/");
                int length = path2.length();
                if (!endsWith) {
                    length++;
                }
                String substring = canonicalPath.substring(length);
                StringBuilder sb = new StringBuilder();
                sb.append(Uri.encode((String) entry.getKey()));
                sb.append('/');
                sb.append(Uri.encode(substring, "/"));
                return new Uri.Builder().scheme("content").authority(r4.A00).encodedPath(sb.toString()).build();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to find configured root that contains ");
            sb2.append(canonicalPath);
            throw new IllegalArgumentException(sb2.toString());
        } catch (IOException unused) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Failed to resolve canonical path for ");
            sb3.append(file);
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    private C16660ps A01() {
        C16660ps r0;
        synchronized (this) {
            r0 = this.A01;
            if (r0 == null) {
                r0 = A02(getContext(), this.A02, this.A00);
                this.A01 = r0;
            }
        }
        return r0;
    }

    public static File[] A04(Context context) {
        return context.getExternalFilesDirs((String) null);
    }

    public String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    public boolean onCreate() {
        return true;
    }

    public static C16660ps A02(Context context, String str, int i) {
        C09600cd r4;
        IllegalArgumentException illegalArgumentException;
        IllegalArgumentException illegalArgumentException2;
        File file;
        File[] A052;
        HashMap hashMap = A04;
        synchronized (hashMap) {
            C16660ps r42 = (C16660ps) hashMap.get(str);
            r4 = r42;
            if (r42 == null) {
                try {
                    C09600cd r43 = new C09600cd(str);
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
                    if (resolveContentProvider != null) {
                        if (resolveContentProvider.metaData == null && i != 0) {
                            Bundle bundle = new Bundle(1);
                            resolveContentProvider.metaData = bundle;
                            bundle.putInt("android.support.FILE_PROVIDER_PATHS", i);
                        }
                        XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
                        if (loadXmlMetaData != null) {
                            while (true) {
                                int next = loadXmlMetaData.next();
                                if (next == 1) {
                                    hashMap.put(str, r43);
                                    r4 = r43;
                                    break;
                                } else if (next == 2) {
                                    String name = loadXmlMetaData.getName();
                                    String attributeValue = loadXmlMetaData.getAttributeValue((String) null, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                                    String attributeValue2 = loadXmlMetaData.getAttributeValue((String) null, "path");
                                    if ("root-path".equals(name)) {
                                        file = A03;
                                    } else if ("files-path".equals(name)) {
                                        file = context.getFilesDir();
                                    } else if ("cache-path".equals(name)) {
                                        file = context.getCacheDir();
                                    } else if ("external-path".equals(name)) {
                                        file = Environment.getExternalStorageDirectory();
                                    } else {
                                        if ("external-files-path".equals(name)) {
                                            A052 = A04(context);
                                        } else if ("external-cache-path".equals(name)) {
                                            A052 = A03(context);
                                        } else if ("external-media-path".equals(name)) {
                                            A052 = A05(context);
                                        } else {
                                            continue;
                                        }
                                        if (A052.length > 0) {
                                            file = A052[0];
                                        } else {
                                            continue;
                                        }
                                    }
                                    if (file != null) {
                                        String str2 = new String[]{attributeValue2}[0];
                                        if (str2 != null) {
                                            file = new File(file, str2);
                                        }
                                        if (TextUtils.isEmpty(attributeValue)) {
                                            illegalArgumentException2 = new IllegalArgumentException("Name must not be empty");
                                            break;
                                        }
                                        try {
                                            r43.A01.put(attributeValue, file.getCanonicalFile());
                                        } catch (IOException e) {
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("Failed to resolve canonical path for ");
                                            sb.append(file);
                                            illegalArgumentException2 = new IllegalArgumentException(sb.toString(), e);
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        } else {
                            illegalArgumentException2 = new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Couldn't find meta-data for provider with authority ");
                        sb2.append(str);
                        illegalArgumentException2 = new IllegalArgumentException(sb2.toString());
                    }
                    throw illegalArgumentException2;
                } catch (IOException e2) {
                    illegalArgumentException = new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                    throw illegalArgumentException;
                } catch (XmlPullParserException e3) {
                    illegalArgumentException = new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e3);
                    throw illegalArgumentException;
                }
            }
        }
        return r4;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    public FileProvider(int i) {
        this.A00 = i;
    }

    public static File[] A03(Context context) {
        return context.getExternalCacheDirs();
    }

    public static File[] A05(Context context) {
        return context.getExternalMediaDirs();
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (providerInfo.grantUriPermissions) {
            this.A02 = providerInfo.authority.split(";")[0];
            HashMap hashMap = A04;
            synchronized (hashMap) {
                hashMap.remove(this.A02);
            }
        } else {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return A01().BBp(uri).delete() ? 1 : 0;
    }

    public String getType(Uri uri) {
        String mimeTypeFromExtension;
        File BBp = A01().BBp(uri);
        int lastIndexOf = BBp.getName().lastIndexOf(46);
        if (lastIndexOf < 0 || (mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(BBp.getName().substring(lastIndexOf + 1))) == null) {
            return "application/octet-stream";
        }
        return mimeTypeFromExtension;
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        int i;
        File BBp = A01().BBp(uri);
        if ("r".equals(str)) {
            i = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i = 738197504;
        } else if ("wa".equals(str)) {
            i = 704643072;
        } else if ("rw".equals(str)) {
            i = 939524096;
        } else if ("rwt".equals(str)) {
            i = 1006632960;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid mode: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
        return ParcelFileDescriptor.open(BBp, i);
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        Object valueOf;
        File BBp = A01().BBp(uri);
        String queryParameter = uri.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME);
        if (strArr == null) {
            strArr = A05;
        }
        String[] strArr3 = new String[r7];
        Object[] objArr = new Object[r7];
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                if (queryParameter == null) {
                    valueOf = BBp.getName();
                } else {
                    valueOf = queryParameter;
                }
            } else if ("_size".equals(str3)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                valueOf = Long.valueOf(BBp.length());
            }
            objArr[i2] = valueOf;
            i2 = i;
        }
        String[] strArr4 = new String[i2];
        System.arraycopy(strArr3, 0, strArr4, 0, i2);
        Object[] objArr2 = new Object[i2];
        System.arraycopy(objArr, 0, objArr2, 0, i2);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    public FileProvider() {
        this.A00 = 0;
    }
}
