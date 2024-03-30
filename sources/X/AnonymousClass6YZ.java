package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.util.Log;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.6YZ  reason: invalid class name */
public class AnonymousClass6YZ implements C159007ic {
    public Object A00;
    public final int A01;

    public AnonymousClass6YZ(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BXI(AnonymousClass5VK r5) {
        if (this.A01 != 0) {
            C36321k7.A1J(r5, "PersonalizedAvatarRepository/loadEffect Failure: ", AnonymousClass000.A0u());
            C023509x r1 = (C023509x) this.A00;
            if (AnonymousClass0AR.A04.get(r1) instanceof C16560pR) {
                r1.resumeWith(AnonymousClass00C.A02(new AnonymousClass52D(r5)));
            } else {
                Log.i("PersonalizedAvatarRepository/loadEffect Skipping resumeWithException");
            }
        } else {
            C1272767q r0 = (C1272767q) ((C114665hc) this.A00).A00.A02;
            C139556k5.A01(r0.A03, r0.A04, r0.A05, r0.A06, r5);
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Throwable th;
        AnonymousClass5VK e;
        String str;
        Object[] objArr;
        C107735Qq r0;
        if (this.A01 != 0) {
            Log.i("PersonalizedAvatarRepository/loadEffect Success");
            ((C023509x) this.A00).resumeWith(obj);
            return;
        }
        List list = (List) obj;
        C1503374w r4 = ((C114665hc) this.A00).A00;
        if (((AnonymousClass6SG) r4.A01).A02) {
            ((C1272767q) r4.A02).A00(new C114655hb(AnonymousClass001.A0J()));
            return;
        }
        if (list != null) {
            try {
                if (!list.isEmpty() && ((AnonymousClass5oE) list.get(0)).A01.getCanonicalPath() != null) {
                    String canonicalPath = ((AnonymousClass5oE) list.get(0)).A01.getCanonicalPath();
                    Map map = ((C123635wp) r4.A00).A03;
                    Iterator A0y = AnonymousClass000.A0y(map);
                    while (A0y.hasNext()) {
                        Map.Entry A11 = AnonymousClass000.A11(A0y);
                        File A0T = C90524aI.A0T(canonicalPath, C90514aH.A10(A11));
                        try {
                            MessageDigest instance = MessageDigest.getInstance("SHA-1");
                            byte[] bArr = new byte[EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH];
                            try {
                                if (A0T instanceof C107735Qq) {
                                    r0 = (C107735Qq) A0T;
                                } else {
                                    r0 = new C107735Qq(A0T);
                                }
                                BufferedInputStream A0U = C90474aD.A0U(r0);
                                while (true) {
                                    int read = A0U.read(bArr);
                                    if (read <= 0) {
                                        break;
                                    }
                                    instance.update(bArr, 0, read);
                                }
                                AnonymousClass6I7.A00(A0U);
                                byte[] digest = instance.digest();
                                char[] cArr = new char[40];
                                for (int i = 0; i < digest.length; i++) {
                                    byte b = digest[i] & 255;
                                    int i2 = i * 2;
                                    char[] cArr2 = AnonymousClass6I7.A00;
                                    cArr[i2] = cArr2[b >>> 4];
                                    cArr[i2 + 1] = cArr2[b & 15];
                                }
                                if (!new String(cArr).equals(A11.getValue())) {
                                    C1263463o r2 = new C1263463o();
                                    r2.A00 = C108395Ti.SCRIPTING_PACKAGE_FETCH_FAILURE;
                                    StringBuilder A0u = AnonymousClass000.A0u();
                                    A0u.append("Sha1 hash doesn't match: ");
                                    r2.A03 = AnonymousClass000.A0g(C90494aF.A0f(A11), A0u);
                                    th = r2.A00();
                                    throw th;
                                }
                            } catch (FileNotFoundException e2) {
                                e = e2;
                                str = "Couldn't find the file: %s";
                                objArr = new Object[]{A0T.getPath()};
                            } catch (IOException e3) {
                                e = e3;
                                str = "Couldn't read the file: %s";
                                objArr = new Object[]{A0T.getPath()};
                            } catch (Throwable th2) {
                                th = th2;
                                AnonymousClass6I7.A00((Closeable) null);
                            }
                        } catch (NoSuchAlgorithmException e4) {
                            th = AnonymousClass001.A0B(e4);
                        }
                    }
                    C1272767q r42 = (C1272767q) r4.A02;
                    HashMap A0J = AnonymousClass001.A0J();
                    Iterator A0y2 = AnonymousClass000.A0y(map);
                    while (A0y2.hasNext()) {
                        Map.Entry A112 = AnonymousClass000.A11(A0y2);
                        A0J.put(A112.getKey(), C90524aI.A0T(canonicalPath, C90514aH.A10(A112)).getPath());
                    }
                    r42.A00(new C114655hb(A0J));
                    return;
                }
            } catch (IOException e5) {
                C1263463o r1 = new C1263463o();
                r1.A00 = C108395Ti.SCRIPTING_PACKAGE_FETCH_FAILURE;
                r1.A03 = e5;
                e = r1.A00();
            } catch (AnonymousClass5VK e6) {
                e = e6;
            }
        }
        C1263463o r12 = new C1263463o();
        r12.A00 = C108395Ti.SCRIPTING_PACKAGE_FETCH_FAILURE;
        r12.A03 = AnonymousClass001.A09("Scripting package asset download returned a null result");
        th = r12.A00();
        throw th;
        BXI(e);
        return;
        AnonymousClass6YR.A0E("AssetFileUtil", str, e, objArr);
        AnonymousClass6I7.A00((Closeable) null);
    }
}
