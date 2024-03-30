package X;

import android.util.Base64;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9UV  reason: invalid class name */
public class AnonymousClass9UV {
    public int A00 = 0;
    public String A01;
    public List A02 = AnonymousClass001.A0I();
    public AnonymousClass3KL A03;
    public C602837f A04;

    public void A00(String str) {
        String str2 = this.A01;
        if (str2 == null || str2.equalsIgnoreCase(CredentialProviderBaseController.TYPE_TAG)) {
            this.A03.A04.add(str);
        } else {
            this.A03.A00.put(str2, str);
        }
        this.A01 = null;
    }

    public void A01(List list) {
        AnonymousClass3KL r6;
        String str;
        byte[] bArr;
        byte[] bArr2;
        AnonymousClass922 r1;
        if (list == null || list.size() == 0) {
            AnonymousClass3KL r12 = this.A03;
            r12.A06 = null;
            r12.A03.clear();
            str = "";
            this.A03.A03.add(str);
            r6 = this.A03;
        } else {
            String asString = this.A03.A00.getAsString("ENCODING");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String A0C = AnonymousClass001.A0C(it);
                AnonymousClass3KL r13 = this.A03;
                List list2 = r13.A03;
                if (asString != null) {
                    int i = 0;
                    if (asString.equals("BASE64") || asString.equals("B")) {
                        r13.A06 = Base64.decode(A0C.getBytes(), 0);
                        list2.add(A0C);
                    } else if (asString.equals("QUOTED-PRINTABLE")) {
                        String replaceAll = A0C.replaceAll("= ", " ").replaceAll("=\t", "\t");
                        StringBuilder A0u = AnonymousClass000.A0u();
                        int length = replaceAll.length();
                        ArrayList A0I = AnonymousClass001.A0I();
                        int i2 = 0;
                        while (i2 < length) {
                            char charAt = replaceAll.charAt(i2);
                            if (charAt == 10) {
                                A0I.add(A0u.toString());
                                A0u = AnonymousClass000.A0u();
                            } else if (charAt == 13) {
                                A0I.add(A0u.toString());
                                A0u = AnonymousClass000.A0u();
                                if (i2 < length - 1) {
                                    int i3 = i2 + 1;
                                    if (replaceAll.charAt(i3) == 10) {
                                        i2 = i3;
                                    }
                                }
                            } else {
                                A0u.append(charAt);
                            }
                            i2++;
                        }
                        String obj = A0u.toString();
                        if (obj.length() > 0) {
                            A0I.add(obj);
                        }
                        String[] A1b = C36371kC.A1b(A0I, 0);
                        StringBuilder A0u2 = AnonymousClass000.A0u();
                        for (String str2 : A1b) {
                            if (str2.endsWith("=")) {
                                str2 = str2.substring(0, str2.length() - 1);
                            }
                            A0u2.append(str2);
                        }
                        try {
                            bArr2 = A0u2.toString().getBytes(DefaultCrypto.UTF_8);
                        } catch (UnsupportedEncodingException e) {
                            C90464aC.A1L("Failed to encode: charset=", DefaultCrypto.UTF_8, AnonymousClass000.A0u(), e);
                            bArr2 = A0u2.toString().getBytes();
                        }
                        if (bArr2 == null) {
                            bArr = null;
                        } else {
                            try {
                                ByteArrayOutputStream A0Q = C90524aI.A0Q();
                                while (i < bArr2.length) {
                                    byte b = bArr2[i];
                                    if (b == 61) {
                                        int i4 = i + 1;
                                        byte b2 = bArr2[i4];
                                        int digit = Character.digit((char) b2, 16);
                                        if (digit != -1) {
                                            i = i4 + 1;
                                            byte b3 = bArr2[i];
                                            int digit2 = Character.digit((char) b3, 16);
                                            if (digit2 != -1) {
                                                A0Q.write((char) ((digit << 4) + digit2));
                                            } else {
                                                r1 = new AnonymousClass922(AnonymousClass000.A0r("Invalid URL encoding: not a valid digit (radix 16): ", AnonymousClass000.A0u(), b3));
                                            }
                                        } else {
                                            r1 = new AnonymousClass922(AnonymousClass000.A0r("Invalid URL encoding: not a valid digit (radix 16): ", AnonymousClass000.A0u(), b2));
                                        }
                                        throw r1;
                                    }
                                    A0Q.write(b);
                                    i++;
                                }
                                bArr = A0Q.toByteArray();
                            } catch (ArrayIndexOutOfBoundsException e2) {
                                throw new AnonymousClass922((Throwable) e2);
                            } catch (AnonymousClass922 e3) {
                                Log.e("Failed to decode quoted-printable: ", e3);
                                A0C = "";
                            }
                        }
                        try {
                            A0C = new String(bArr, DefaultCrypto.UTF_8);
                        } catch (UnsupportedEncodingException e4) {
                            C90464aC.A1L("Failed to encode: charset=", DefaultCrypto.UTF_8, AnonymousClass000.A0u(), e4);
                            A0C = new String(bArr);
                        }
                        list2.add(A0C);
                    }
                }
                if (!DefaultCrypto.UTF_8.equalsIgnoreCase(DefaultCrypto.UTF_8)) {
                    ByteBuffer encode = Charset.forName(DefaultCrypto.UTF_8).encode(A0C);
                    bArr = new byte[encode.remaining()];
                    encode.get(bArr);
                    A0C = new String(bArr, DefaultCrypto.UTF_8);
                }
                list2.add(A0C);
            }
            r6 = this.A03;
            List list3 = r6.A03;
            int size = list3.size();
            if (size > 1) {
                StringBuilder A0u3 = AnonymousClass000.A0u();
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    A0u3.append(AnonymousClass001.A0C(it2));
                    A0u3.append(";");
                }
                int length2 = A0u3.length();
                if (length2 > 0) {
                    int i5 = length2 - 1;
                    if (A0u3.charAt(i5) == ';') {
                        str = A0u3.substring(0, i5);
                    }
                }
                str = A0u3.toString();
            } else if (size == 1) {
                str = C36401kF.A0s(list3, 0);
            } else {
                str = "";
            }
        }
        r6.A02 = str;
    }
}
