package com.facebook.msys.mci;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0YM;
import X.C90504aG;
import X.C90514aH;
import X.C90524aI;
import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.wamsys.Hex;
import com.whatsapp.wamsys.SecureUriParser;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class DefaultCrypto implements Crypto {
    public static final int BUFFER_SIZE = 8192;
    public static final String HMAC_SHA256 = "HmacSHA256";
    public static final Class TAG = DefaultCrypto.class;
    public static final String UTF_8 = "UTF-8";
    public static final Crypto mCrypto = new DefaultCrypto();

    private String computeSHA256Impl(String str, String str2) {
        Throwable th;
        FileInputStream fileInputStream;
        int read;
        String str3 = str;
        try {
            Uri parseEncodedRFC2396 = SecureUriParser.parseEncodedRFC2396(str3);
            String scheme = parseEncodedRFC2396.getScheme();
            if (TextUtils.isEmpty(scheme)) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Invalid fileUrlString: ");
                th = AnonymousClass000.A0c(str3, A0u);
            } else if (scheme.equalsIgnoreCase("file")) {
                String path = parseEncodedRFC2396.getPath();
                if (!TextUtils.isEmpty(path)) {
                    File A0S = C90524aI.A0S(path);
                    if (A0S.exists()) {
                        String path2 = A0S.getPath();
                        try {
                            fileInputStream = new FileInputStream(path2);
                            File A0S2 = C90524aI.A0S(path2);
                            byte[] bArr = new byte[BUFFER_SIZE];
                            long length = A0S2.length();
                            Mac instance = Mac.getInstance(HMAC_SHA256);
                            instance.init(new SecretKeySpec(str2.getBytes(), HMAC_SHA256));
                            long j = length;
                            long j2 = 0;
                            boolean z = true;
                            while (true) {
                                int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                                if (i > 0 && (read = fileInputStream.read(bArr)) != -1) {
                                    int i2 = 0;
                                    while (z && i2 < 8192) {
                                        z = AnonymousClass000.A1Q(bArr[i2]);
                                        i2++;
                                    }
                                    int min = Math.min((int) j, read);
                                    instance.update(bArr, 0, min);
                                    j2 += (long) read;
                                    j -= (long) min;
                                } else if (!z || j2 == length || i != 0) {
                                    throw C90514aH.A0s("Unable to read all bytes from file");
                                } else {
                                    String A0y = C90514aH.A0y(Hex.encodeHex(instance.doFinal(), false));
                                    fileInputStream.close();
                                    return A0y;
                                }
                            }
                            if (!z && j2 == length) {
                            }
                            throw C90514aH.A0s("Unable to read all bytes from file");
                        } catch (NoSuchAlgorithmException e) {
                            throw C90524aI.A0e("HMAC SHA256 algorithm is not found.", e);
                        } catch (UnsupportedEncodingException e2) {
                            throw C90524aI.A0e("UTF_8 encoding is not supported.", e2);
                        } catch (InvalidKeyException e3) {
                            throw C90524aI.A0e("Invalid secret key.", e3);
                        } catch (IOException e4) {
                            throw C90524aI.A0e("Couldn't read the content.", e4);
                        } catch (IllegalStateException e5) {
                            throw C90524aI.A0e("Couldn't update the hash.", e5);
                        } catch (IllegalArgumentException e6) {
                            throw C90524aI.A0e("Invalid arguments", e6);
                        } catch (Exception e7) {
                            throw C90524aI.A0e("Unexpected exception", e7);
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    } else {
                        th = C90524aI.A0V(AnonymousClass000.A0p("File does not exist. Url: ", str3, AnonymousClass000.A0u()));
                    }
                } else {
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("Invalid input file Url: ");
                    th = AnonymousClass000.A0c(str3, A0u2);
                }
            } else {
                StringBuilder A0u3 = AnonymousClass000.A0u();
                A0u3.append("Url MUST be of 'file:' scheme. Found: ");
                th = AnonymousClass000.A0c(scheme, A0u3);
            }
            throw th;
            throw th;
        } catch (FileNotFoundException | IllegalArgumentException | SecurityException e8) {
            throw C90524aI.A0e("Exception while parsing fileUrl", e8);
        }
    }

    public byte[] computeMd5(byte[] bArr) {
        try {
            byte[] A1a = C90504aG.A1a(bArr, "MD5");
            StringBuilder A0u = AnonymousClass000.A0u();
            for (byte valueOf : A1a) {
                Object[] A0L = AnonymousClass001.A0L();
                A0L[0] = Byte.valueOf(valueOf);
                A0u.append(String.format("%02x", A0L));
            }
            return A0u.toString().getBytes();
        } catch (NoSuchAlgorithmException e) {
            throw C90524aI.A0e("MD5 algorithm was not found. Should not happen", e);
        }
    }

    public String computeSHA256(byte[] bArr, String str) {
        AnonymousClass0YM.A02(bArr, "file bytes can not be null");
        try {
            Mac instance = Mac.getInstance(HMAC_SHA256);
            instance.init(new SecretKeySpec(str.getBytes(UTF_8), HMAC_SHA256));
            return C90514aH.A0y(Hex.encodeHex(instance.doFinal(bArr), false));
        } catch (NoSuchAlgorithmException e) {
            throw C90524aI.A0e("HMAC SHA256 algorithm is not found.", e);
        } catch (UnsupportedEncodingException e2) {
            throw C90524aI.A0e("UTF_8 encoding is not supported.", e2);
        } catch (InvalidKeyException e3) {
            throw C90524aI.A0e("Invalid secret key.", e3);
        }
    }

    public static Crypto get() {
        return mCrypto;
    }

    public String computeSHA256(String str, String str2) {
        try {
            return computeSHA256Impl(str, str2);
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
