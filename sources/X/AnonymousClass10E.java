package X;

import com.facebook.soloader.SoLoader;
import java.io.FileInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.10E  reason: invalid class name */
public class AnonymousClass10E implements C21890zz {
    public final /* synthetic */ Runtime A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Method A03;
    public final /* synthetic */ boolean A04;

    public AnonymousClass10E(Runtime runtime, String str, String str2, Method method, boolean z) {
        this.A04 = z;
        this.A01 = str;
        this.A02 = str2;
        this.A00 = runtime;
        this.A03 = method;
    }

    public void BOF(String str, int i) {
        String str2;
        String str3;
        String str4;
        FileInputStream fileInputStream;
        if (this.A04) {
            if ((i & 4) == 4) {
                str2 = this.A01;
            } else {
                str2 = this.A02;
            }
            try {
                Runtime runtime = this.A00;
                synchronized (runtime) {
                    try {
                        str3 = (String) this.A03.invoke(runtime, new Object[]{str, SoLoader.class.getClassLoader(), str2});
                        if (str3 == null) {
                            try {
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    throw th;
                                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                                    e = e;
                                }
                            }
                        } else {
                            throw new UnsatisfiedLinkError(str3);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        str3 = null;
                        throw th;
                    }
                }
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                e = e2;
                str3 = null;
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error: Cannot load ");
                    sb.append(str);
                    throw new RuntimeException(sb.toString(), e);
                } catch (Throwable th3) {
                    fileInputStream.close();
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
                throw th;
            }
        } else {
            System.load(str);
        }
    }

    public void BOJ(AnonymousClass10T r2, String str, int i) {
        throw new UnsupportedOperationException();
    }
}
